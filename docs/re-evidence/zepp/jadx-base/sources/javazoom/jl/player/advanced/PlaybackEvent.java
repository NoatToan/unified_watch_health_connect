package javazoom.jl.player.advanced;

/* JADX INFO: loaded from: classes23.dex */
public class PlaybackEvent {
    public static int STARTED = 2;
    public static int STOPPED = 1;
    private AdvancedPlayer a;
    private int b;
    private int c;

    public PlaybackEvent(AdvancedPlayer advancedPlayer, int i, int i2) {
        this.c = i;
        this.a = advancedPlayer;
        this.b = i2;
    }

    public int getFrame() {
        return this.b;
    }

    public int getId() {
        return this.c;
    }

    public AdvancedPlayer getSource() {
        return this.a;
    }

    public void setFrame(int i) {
        this.b = i;
    }

    public void setId(int i) {
        this.c = i;
    }

    public void setSource(AdvancedPlayer advancedPlayer) {
        this.a = advancedPlayer;
    }
}
