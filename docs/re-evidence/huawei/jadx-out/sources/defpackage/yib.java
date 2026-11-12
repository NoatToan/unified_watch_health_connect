package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class yib extends RuntimeException {
    private int d;

    public yib(int i) {
        super(yio.b(i));
        this.d = i;
    }

    public int e() {
        return this.d;
    }

    public static yib d(IllegalStateException illegalStateException) {
        if (illegalStateException == null) {
            yis.c("WearEngineException", "convertIllegalStateException IllegalStateException is null");
            return new yib(1);
        }
        return new yib(yio.e(illegalStateException.getMessage()));
    }
}
