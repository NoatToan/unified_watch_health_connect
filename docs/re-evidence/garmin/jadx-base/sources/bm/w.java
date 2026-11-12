package bm;

import am.z0;
import android.content.Context;
import c22.l3;
import c22.q3;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public class w extends q.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f18872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q qVar, boolean z14) {
        super();
        this.f18872c = qVar;
        this.f18871b = z14;
    }

    @Override // bm.q.d, gz.f
    public final String b(float f14) {
        q3 q3Var;
        int i14 = q.D;
        q qVar = this.f18872c;
        if (z0.I(qVar.f145350e.getF113501k1())) {
            q3Var = q3.NAUTICAL_MILES_PER_HOUR;
        } else {
            q3Var = this.f18871b ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
        }
        q3 q3Var2 = q3Var;
        Context context = qVar.f134441a;
        double d14 = f14;
        DecimalFormat decimalFormatN = l3.n();
        l3.f23124b.getClass();
        return l3.a.X0(context, d14, q3Var2, decimalFormatN, null);
    }
}
