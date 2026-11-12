package wl0;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    private u() {
    }

    public static int a(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return 0;
        }
        if (d14.doubleValue() < 25.0d) {
            return 2131232055;
        }
        if (d14.doubleValue() < 50.0d) {
            return 2131232057;
        }
        if (d14.doubleValue() < 75.0d) {
            return 2131232058;
        }
        return d14.doubleValue() < 100.0d ? 2131232059 : 2131232056;
    }
}
