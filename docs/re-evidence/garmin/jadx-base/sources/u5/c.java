package u5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu5/c;", "Lu5/f;", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c implements f {
    @Override // u5.f
    public final int a(int i14) {
        int iF = f(i14);
        if (iF == -1 || f(iF) == -1) {
            return -1;
        }
        return iF;
    }

    @Override // u5.f
    public final int b(int i14) {
        int iE = e(i14);
        if (iE == -1 || e(iE) == -1) {
            return -1;
        }
        return iE;
    }

    @Override // u5.f
    public final int c(int i14) {
        return f(i14);
    }

    @Override // u5.f
    public final int d(int i14) {
        return e(i14);
    }

    public abstract int e(int i14);

    public abstract int f(int i14);
}
