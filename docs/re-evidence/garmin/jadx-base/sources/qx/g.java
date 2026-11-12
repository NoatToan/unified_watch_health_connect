package qx;

import c2.l;
import c2.t;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h4.r;
import i3.mh;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import r1.e0;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f148398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f148399c;

    public /* synthetic */ g(Integer num, int i14, String str) {
        this.f148397a = i14;
        this.f148398b = num;
        this.f148399c = str;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f148397a;
        String str = this.f148399c;
        Integer num = this.f148398b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    h.b(0, num, str, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var2 = n.f135158a;
                mVar2.C(1185834920);
                String strP = y.P(R.string.string_slash_string_no_space_pattern, new Object[]{Integer.valueOf(str.length()), num}, mVar2);
                d6.h.f57752b.getClass();
                int i15 = d6.h.f57757g;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                r rVarF = x2.f(r.S, 1.0f);
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                mh.c(strP, l.z(rVarF, eVar.f97920e, eVar.f97917b), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 130044);
                mVar2.f();
                break;
        }
        return Unit.INSTANCE;
    }
}
