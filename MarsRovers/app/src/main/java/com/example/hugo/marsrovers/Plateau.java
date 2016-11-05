package com.example.hugo.marsrovers;

/**
 * Created by Hugo on 05/11/2016.
 */
public class Plateau {
    private Coordenada canto_esquerdo_baixo;
    private Coordenada canto_direito_topo;

    public Plateau(Coordenada canto_esquerdo_baixo, Coordenada canto_direito_topo) {
        this.canto_esquerdo_baixo = canto_esquerdo_baixo;
        this.canto_direito_topo = canto_direito_topo;
    }

    public int getCantoX(){
        return canto_direito_topo.getX();
    }

    public int getCantoY(){
        return canto_direito_topo.getY();
    }

    public void setCanto_direito_topo(Coordenada canto_direito_topo) {
        this.canto_direito_topo = canto_direito_topo;
    }


    public void setCanto_esquerdo_baixo(Coordenada canto_esquerdo_baixo) {
        this.canto_esquerdo_baixo = canto_esquerdo_baixo;
    }




}