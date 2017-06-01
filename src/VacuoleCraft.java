import com.jcraft.jsch.JSchException;
import io.grappl.vacuole.MemorySize;
import io.grappl.vacuole.Vacuole;
import io.grappl.vacuole.VacuoleManager;

import java.util.Scanner;

public class VacuoleCraft {

    public static void main(String[] args) {

        String key = "";

        if(args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter digitalocean api key (by pressing enter, you agree to mojang's minecraft eula): ");
            key = scanner.nextLine();
        } else {
            key = args[0];
        }

        VacuoleManager vacuoleManager = new VacuoleManager(key);
        try {
            Vacuole vacuole = vacuoleManager.createVacuole(MemorySize.GB1);
        } catch (JSchException e) {
            e.printStackTrace();
        }
    }
}
