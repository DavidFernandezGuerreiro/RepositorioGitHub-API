
package com.mycompany.clasemaven;

import java.io.IOException;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GitHub;

/**
 *
 * @author dfernandezguerreiro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        System.out.println("Hola mundo");
        GitHub github = GitHub.connect();
        GHCreateRepositoryBuilder builder;
        builder = github.createRepository("RepositorioGitHub-API");
        builder.create();
    }
    
}
