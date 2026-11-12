package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* JADX INFO: loaded from: classes5.dex */
public final class y7q {
    public static final int[] c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w7q f39904a = new w7q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7q f39905b = new x7q();

    public wsk a(int i, zo2 zo2Var, int i2) throws NotFoundException {
        int[] iArrM = z7q.m(zo2Var, i2, false, c);
        try {
            return this.f39905b.b(i, zo2Var, iArrM);
        } catch (ReaderException unused) {
            return this.f39904a.b(i, zo2Var, iArrM);
        }
    }
}
