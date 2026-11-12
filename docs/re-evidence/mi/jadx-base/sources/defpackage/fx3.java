package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface fx3 {
    static int a(int i) {
        return (i >> 16) << 16;
    }

    static boolean b(int i, int i2) {
        return a(i) == a(i2);
    }
}
