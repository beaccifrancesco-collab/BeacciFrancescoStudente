/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beaccifrancescostudente;


public class Studente 
{
    private String nome, cognome;
    private int anno, numeroMaterie;
    private String indirizzo;
    private String sezione;
    private int[] voti;
    private int votiInseriti; 

    /**
     * @param nome  nome dello studente
     * @param cognome  cognome dello studente
     * @param anno  l’anno del corso frequentato
     * @param indirizzo  indirizzo di studio
     * @param sezione  la sezione della classe
     * @param numeroMaterie numero totale delle materie
     */
    public Studente(String nome, String cognome, int anno, String indirizzo, String sezione, int numeroMaterie) 
    {
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
        this.indirizzo = indirizzo;
        this.sezione = sezione;
        this.numeroMaterie = numeroMaterie;
        this.voti = new int[this.numeroMaterie];
        this.votiInseriti = 0;
    }

    /**
     *legge il nome dello studente
     *@return nome
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * modifica il nome dello studente
     * @param nome 
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * legge il cognome dello studente
     * @return cognome
     */
    public String getCognome() 
    {
        return cognome;
    }

    /**
     * modifica il cognome dello studente
     * @param cognome 
     */
    public void setCognome(String cognome) 
    {
        this.cognome = cognome;
    }

    /**
     * legge l’anno di corso dello studente
     * @return anno
     */
    public int getAnno() 
    {
        return anno;
    }

    /**
     * modifica l’anno di corso dello studente
     * @param anno 
     */
    public void setAnno(int anno) 
    {
        this.anno = anno;
    }

    /**
     * legge l'indirizzo di studio
     * @return inidirizzo
     */
    public String getIndirizzo() 
    {
        return indirizzo;
    }

    /**
     * modifica l’indirizzo di studio
     * @param indirizzo 
     */
    public void setIndirizzo(String indirizzo) 
    {
        this.indirizzo = indirizzo;
    }

    /**
     * legge la sezione della classe
     * @return sezione
     */
    public String getSezione() 
    { 
        return sezione;
    }

    /**
     * modifica la sezione della classe
     * @param sezione 
     */
    public void setSezione(String sezione) 
    {
        this.sezione = sezione;
    }

    /**
     * legge il numero totale delle materie
     * @return numeroMaterie
     */
    public int getNumeroMaterie() 
    {
        return numeroMaterie;
    }
    
    /**
     * modifica il numero delle materie totali
     * @param numeroMaterie 
     */
    public void setNumeroMaterie(int numeroMaterie)
    {
        this.numeroMaterie=numeroMaterie;
    }

    /**
     * aggiunge un voto nella lista
     * @param voto
     * @return 
     */
    public int inserisciVoto(int voto) 
    { 
        if (voto < 1 || voto > 10) 
        {
            return -1; 
        }

        for (int i = 0; i < voti.length; i++) 
        {
            if (voti[i] == 0) 
            {
                voti[i] = voto;
                votiInseriti++; 
                return 1;
            }
        }
        return 0; 
    }

    /**
     * calcola la media dei voti
     * @return -1 per voti non iseriti oppure restituisce la media totale
     */
    public double calcolaMedia() 
    {
        int somma = 0;

        if (this.votiInseriti == 0) 
        {
            return -1;
        } 
        else 
        {
            for (int i = 0; i < this.votiInseriti; i++) 
            {
                somma = somma + voti[i];
            }
            return (double) somma / this.votiInseriti;
        }
    }

    /**
     * trova il voto piu’ alto
     * @return il valore piu alto presente nell'array oppure 0 se non e' presente nessun voto
     */
    public int votoPiuAlto() 
    {
        if (this.votiInseriti == 0) 
        {
            return 0;
        }

        int max = this.voti[0];

        for (int i = 1; i < this.votiInseriti; i++) 
        {
            if (this.voti[i] > max) 
            {
                max = this.voti[i];
            }
        }
        return max;
    }
    
    /**
     * trova il voto piu’ basso
     * @return il valore piu basso presente nell'array oppure 0 se non e' presente nessun voto
     */
    public int votoPiuBasso() 
    {
        if (this.votiInseriti == 0) 
        {
            return 0;
        }

        int min = this.voti[0];

        for (int i = 1; i < this.votiInseriti; i++) 
        {
            if (this.voti[i] < min) 
            {
                min = this.voti[i];
            }
        }
        return min;
    }

    /**
     * conta quanti voti sono insufficienti 
     * @return il numero totale di voti insufficienti inseriti
     */
    public int contaInsufficienti() 
    {
        int votiInsufficienti = 0;
        for (int i = 0; i < this.votiInseriti; i++) 
        {
            if (this.voti[i] < 6) 
            {
                votiInsufficienti++;
            }
        }
        return votiInsufficienti;
    }

    /**
     * controlla se la media e’ sufficente
     * @return -1 se non e' possibile calcolare la media, 0 se la media e' sufficiente e 1 se la media e' insufficiente
     */
    public int mediaSufficiente() 
    {
        if (calcolaMedia() == -1) 
        {
            return -1; 
        } 
        else if (calcolaMedia() >= 6) 
        {
            return 0; 
        } 
        else 
        {
            return 1; 
        }
    }

    
    /**
     * mostra tutti i dati dello studente
     * @return una stringa che contiene dei valori
     */
    @Override
    public String toString() 
    {
        return "\n Nome: " + nome + "\nCognome: " + cognome + "\n Anno: " + anno + "\nIndirizzo: " + indirizzo + "\n Sezione: " + sezione+ "\n Numero materie: " + numeroMaterie 
                + "\n media: "+ calcolaMedia()+"\n voto piu' alto: " + votoPiuAlto()+"\n voto piu' basso: " + votoPiuBasso() + "\n voti insufficienti: " +contaInsufficienti() 
                + "\n la media e' sufficiente " + contaInsufficienti();
    }
}