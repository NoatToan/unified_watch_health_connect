package m0;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.n1;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f115513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f115514d;

    public l(k0 k0Var, Rational rational) {
        this.f115511a = k0Var.h();
        this.f115512b = k0Var.b();
        this.f115513c = rational;
        boolean z14 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z14 = false;
        }
        this.f115514d = z14;
    }

    public final Size a(n1 n1Var) {
        int iD = n1Var.D(0);
        Size sizeK = n1Var.k();
        if (sizeK != null) {
            int iA = j0.c.a(j0.c.b(iD), this.f115511a, 1 == this.f115512b);
            if (iA == 90 || iA == 270) {
                return new Size(sizeK.getHeight(), sizeK.getWidth());
            }
        }
        return sizeK;
    }
}
