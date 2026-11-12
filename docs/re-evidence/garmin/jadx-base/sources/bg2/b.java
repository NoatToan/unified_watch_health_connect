package bg2;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h4.r;
import i3.mh;
import java.util.Arrays;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import s5.x0;
import w52.v;
import w52.y1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17851c;

    public /* synthetic */ b(int i14, String str) {
        this.f17849a = 4;
        this.f17851c = i14;
        this.f17850b = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f17849a;
        String str = this.f17850b;
        int i15 = this.f17851c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                c.c(i15, p0.t(1), str, (p3.m) obj);
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g82.c cVar = g82.c.f76436a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String str2 = this.f17850b;
                    if (str2 != null) {
                        mVar.C(-218386595);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97932i, mVar);
                        g6.f.a aVar = g6.f.f75994b;
                        mh.c(str2, c2.l.C(x2.f(r.S, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB, mVar, 48, 0, 130044);
                        mVar.f();
                    } else {
                        mVar.C(-218055453);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 2:
                ((Integer) obj2).intValue();
                ku1.g.f(str, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                tw.d.a(i15, p0.t(1), str, (p3.m) obj);
                break;
            case 4:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (i15 <= 90) {
                        mVar2.C(946322012);
                        h82.r.f82497a.q(String.format(y.Q(mVar2, R.string.post_dive_do_not_exercise_description), Arrays.copyOf(new Object[]{Integer.valueOf(i15)}, 1)), mVar2, 48);
                        mVar2.f();
                    } else if (i15 <= 240) {
                        mVar2.C(946536718);
                        h82.r.f82497a.q(String.format(y.Q(mVar2, R.string.post_dive_avoid_strenuous_activity_description), Arrays.copyOf(new Object[]{Integer.valueOf(i15 / 60)}, 1)), mVar2, 48);
                        mVar2.f();
                    } else {
                        mVar2.C(1693107937);
                        h82.r.f82497a.q(String.format(y.Q(mVar2, R.string.post_dive_avoid_high_intensity_exercise_description), Arrays.copyOf(new Object[]{Integer.valueOf(i15 / 60)}, 1)), mVar2, 48);
                        mVar2.f();
                    }
                    h82.r rVar = h82.r.f82497a;
                    rVar.s(384, 2, y.Q(mVar2, R.string.post_dive_4h_after), null, mVar2);
                    rVar.q(String.format(y.Q(mVar2, R.string.post_dive_4h_after_description), Arrays.copyOf(new Object[]{str}, 1)), mVar2, 48);
                    rVar.s(384, 2, y.Q(mVar2, R.string.post_dive_4h_to_24h_after), null, mVar2);
                    rVar.q(y.Q(mVar2, R.string.post_dive_4h_to_24h_after_description), mVar2, 48);
                } else {
                    mVar2.e();
                }
                break;
            case 5:
                ((Integer) obj2).intValue();
                v.b(str, (p3.m) obj, p0.t(i15 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                y1.b(str, (p3.m) obj, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(int i14, String str, int i15) {
        this.f17849a = 0;
        this.f17851c = i14;
        this.f17850b = str;
    }

    public /* synthetic */ b(String str, int i14, int i15) {
        this.f17849a = 3;
        this.f17850b = str;
        this.f17851c = i14;
    }

    public /* synthetic */ b(String str, int i14, int i15, byte b14) {
        this.f17849a = i15;
        this.f17850b = str;
        this.f17851c = i14;
    }
}
