package g2;

/* JADX INFO: loaded from: classes.dex */
public interface i0 {
    default int a(Object obj) {
        return -1;
    }

    void e(int i14, Object obj, p3.m mVar, int i15);

    default Object f(int i14) {
        return null;
    }

    int getItemCount();

    default Object getKey(int i14) {
        return new h(i14);
    }
}
