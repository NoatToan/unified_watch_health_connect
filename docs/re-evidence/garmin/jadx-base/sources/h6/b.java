package h6;

import g6.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.b0;
import p1.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh6/b;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f82143a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f82144b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile l1<a> f82145c = new l1<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f82146d;

    static {
        Object[] objArr = new Object[0];
        f82146d = objArr;
        synchronized (objArr) {
            f82145c.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f82145c.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f82145c.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f82145c.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f82145c.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.INSTANCE;
        }
        if ((f82145c.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        j.b("You should only apply non-linear scaling to font scales > 1");
    }

    private b() {
    }

    public static a a(float f14) {
        float fD;
        a aVarG;
        if (f14 < 1.03f) {
            return null;
        }
        f82143a.getClass();
        int i14 = (int) (f14 * 100.0f);
        a aVarC = f82145c.c(i14);
        if (aVarC != null) {
            return aVarC;
        }
        l1<a> l1Var = f82145c;
        if (l1Var.f134764a) {
            b0.a(l1Var);
        }
        int iA = q1.a.a(l1Var.f134767d, i14, l1Var.f134765b);
        if (iA >= 0) {
            return f82145c.g(iA);
        }
        int i15 = -(iA + 1);
        int i16 = i15 - 1;
        if (i15 >= f82145c.f()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f14});
            b(f14, cVar);
            return cVar;
        }
        if (i16 < 0) {
            float[] fArr = f82144b;
            aVarG = new c(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = f82145c.d(i16) / 100.0f;
            aVarG = f82145c.g(i16);
        }
        float fD2 = f82145c.d(i15) / 100.0f;
        d.f82150a.getClass();
        float fMax = (Math.max(0.0f, Math.min(1.0f, fD == fD2 ? 0.0f : (f14 - fD) / (fD2 - fD))) * 1.0f) + 0.0f;
        a aVarG2 = f82145c.g(i15);
        float[] fArr2 = f82144b;
        float[] fArr3 = new float[fArr2.length];
        int length = fArr2.length;
        for (int i17 = 0; i17 < length; i17++) {
            float f15 = fArr2[i17];
            float fA = aVarG.a(f15);
            float fA2 = aVarG2.a(f15);
            d.f82150a.getClass();
            fArr3[i17] = ((fA2 - fA) * fMax) + fA;
        }
        c cVar2 = new c(fArr2, fArr3);
        b(f14, cVar2);
        return cVar2;
    }

    public static void b(float f14, c cVar) {
        synchronized (f82146d) {
            l1<a> l1VarClone = f82145c.clone();
            f82143a.getClass();
            l1VarClone.e((int) (f14 * 100.0f), cVar);
            f82145c = l1VarClone;
            Unit unit = Unit.INSTANCE;
        }
    }
}
