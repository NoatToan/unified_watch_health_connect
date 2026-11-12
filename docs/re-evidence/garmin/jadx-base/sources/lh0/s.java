package lh0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f72.oe;
import gl1.y;
import i3.i7;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Double f112446b;

    public /* synthetic */ s(Double d14, q42.h hVar) {
        this.f112445a = 2;
        this.f112446b = d14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112445a;
        Double d14 = this.f112446b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                t.a(d14, (p3.m) obj, p0.t(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                mc1.b.a(d14, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar, j92.b.f97899b.f97923h), mVar);
                    s62.a.f157643a.getClass();
                    i7.b(oe.a(t62.c.f162799a), null, x2.q(aVar, j92.b.f97901d.f97906e), a0.c(mVar), mVar, 48, 0);
                    String strQ = y.Q(mVar, R.string.no_value);
                    d92.b.f58624b.getClass();
                    g02.c.a(strQ, null, 0L, null, 0, false, 0, d92.c.b(j92.f.f97928e, mVar), 0.0d, mVar, 0, 382);
                    if (d14 == null || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
                        mVar.C(-1856449367);
                        mVar.f();
                    } else {
                        mVar.C(-1856790522);
                        g02.c.a(y.P(R.string.lbl_goal_value, new Object[]{q42.h.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b), d14.doubleValue())}, mVar), null, 0L, null, 0, false, 0, d92.c.b(j92.f.f97933j, mVar), 0.0d, mVar, 0, 382);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(Double d14, int i14, int i15) {
        this.f112445a = i15;
        this.f112446b = d14;
    }
}
