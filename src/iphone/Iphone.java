package iphone;

import internet.Internet;
import musicplayer.MusicPlayer;
import telephone.Telephone;

public class Iphone implements MusicPlayer, Telephone, Internet {

    @Override
    public void selectMusic(String music) {
        System.out.println(music+" selecionado");
        playMusic();
    }

    @Override
    public void pause() {
        System.out.println("pausado");
    }

    
    private void playMusic() {
        System.out.println("tocando");
    }

    @Override
    public void call(String numberTelefon) {
        System.out.println("Ligando para " + numberTelefon);
        startVoicEmail();    
    }

    @Override
    public void answer() {
        System.out.println("atender");
        startVoicEmail();
    }

    
    private void startVoicEmail() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("exibir pagina "+url);
    }

    @Override
    public void addPage() {
        System.out.println("Pagina adicionada");
    }

    @Override
    public void updatePage() {
        System.out.println("Pagina atualizada");
    }
    
}
