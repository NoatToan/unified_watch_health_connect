package dj0;

import a42.r;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import p13.y;
import p3.o0;
import p3.p2;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldj0/h;", "Lh82/c;", "<init>", "()V", "a", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f59916g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f59917f;

    static {
        new a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1948741669);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f59917f = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("EXTRA_FTP_HELP_STATES", gj0.b.class) : bundle.getParcelableArrayList("EXTRA_FTP_HELP_STATES");
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(this, bundle, i14, 23);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1970825839, true, new g(this, 0)), 4, null), new h82.c.b("READINGS_ACTION", context.getString(R.string.lbl_about_your_readings), null, new z3.e(933709262, true, new g(this, 1)), 4, null), new h82.c.b("INFORMATION_ACTION", context.getString(R.string.lbl_what_is_ftp), null, new z3.e(-103407315, true, new g(this, 2)), 4, null), new h82.c.b("MEASUREMENT_ACTION", context.getString(R.string.lbl_how_to_get_measurement), null, new z3.e(-1140523892, true, new g(this, 3)), 4, null));
    }

    public final void g(yi0.d dVar, p3.m mVar, int i14) {
        yi0.d dVar2;
        o0 o0VarE = mVar.E(-1185442063);
        int i15 = (o0VarE.r(dVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            ej0.b bVar = new ej0.b(a0.s(o0VarE));
            List listG0 = h0.G0(yi0.a.f197323i);
            ArrayList arrayList = new ArrayList(y.r(listG0, 10));
            Iterator it = listG0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((yi0.a) it.next()).f197325b));
            }
            List listG1 = h0.G0(yi0.a.f197323i);
            ArrayList arrayList2 = new ArrayList(y.r(listG1, 10));
            Iterator it3 = listG1.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((yi0.a) it3.next()).f197324a));
            }
            dVar2 = dVar;
            z3.e eVarC = z3.f.c(1675601201, new a42.y(bVar, dVar2, arrayList, arrayList2, 19), o0VarE);
            int iB = bVar.b();
            if (iB == 0) {
                o0VarE.C(2013571554);
                eVarC.invoke(Boolean.TRUE, o0VarE, 54);
                o0VarE.g0(false);
            } else if (iB != 1) {
                o0VarE.C(2013736257);
                eVarC.invoke(Boolean.TRUE, o0VarE, 54);
                eVarC.invoke(Boolean.FALSE, o0VarE, 54);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2013665825);
                eVarC.invoke(Boolean.FALSE, o0VarE, 54);
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            dVar2 = dVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.h(this, dVar2, i14, 9);
        }
    }

    public final void h(p3.m mVar, int i14) {
        Object next;
        o0 o0VarE = mVar.E(484290216);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            ej0.b bVar = new ej0.b(a0.s(o0VarE));
            ArrayList arrayList = this.f59917f;
            Double d14 = null;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((gj0.b) next).f77488a != yi0.c.CROSS_COUNTRY_SKIING);
                gj0.b bVar2 = (gj0.b) next;
                if (bVar2 != null) {
                    d14 = bVar2.f77490c;
                }
            }
            h82.e.a(z3.f.c(-475051723, new a71.n(bVar, d14), o0VarE), o0VarE, 6);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, i14, 1);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-239606797);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(-342962977, new g(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, i14, 0);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1404322504);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            dj0.a.f59895a.getClass();
            h82.e.a(dj0.a.f59896b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    public final void k(p3.m mVar, int i14) {
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        o0 o0VarE = mVar.E(517602593);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            ej0.b bVar = new ej0.b(a0.s(o0VarE));
            ArrayList arrayList = this.f59917f;
            Double d18 = null;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it.next();
                } while (((gj0.b) next5).f77488a != yi0.c.CYCLING);
                gj0.b bVar2 = (gj0.b) next5;
                if (bVar2 != null) {
                    d14 = bVar2.f77489b;
                } else {
                    d14 = null;
                }
            } else {
                d14 = null;
            }
            ArrayList arrayList2 = this.f59917f;
            if (arrayList2 != null) {
                Iterator it3 = arrayList2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it3.next();
                } while (((gj0.b) next4).f77488a != yi0.c.CROSS_COUNTRY_SKIING);
                gj0.b bVar3 = (gj0.b) next4;
                if (bVar3 != null) {
                    d15 = bVar3.f77490c;
                } else {
                    d15 = null;
                }
            } else {
                d15 = null;
            }
            ArrayList arrayList3 = this.f59917f;
            if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                do {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                } while (((gj0.b) next3).f77488a != yi0.c.CROSS_COUNTRY_SKIING);
                gj0.b bVar4 = (gj0.b) next3;
                if (bVar4 != null) {
                    d16 = bVar4.f77489b;
                } else {
                    d16 = null;
                }
            } else {
                d16 = null;
            }
            ArrayList arrayList4 = this.f59917f;
            if (arrayList4 != null) {
                Iterator it5 = arrayList4.iterator();
                do {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                } while (((gj0.b) next2).f77488a != yi0.c.ROWING);
                gj0.b bVar5 = (gj0.b) next2;
                if (bVar5 != null) {
                    d17 = bVar5.f77490c;
                } else {
                    d17 = null;
                }
            } else {
                d17 = null;
            }
            ArrayList arrayList5 = this.f59917f;
            if (arrayList5 != null) {
                Iterator it6 = arrayList5.iterator();
                do {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                } while (((gj0.b) next).f77488a != yi0.c.ROWING);
                gj0.b bVar6 = (gj0.b) next;
                if (bVar6 != null) {
                    d18 = bVar6.f77491d;
                }
            }
            h82.e.a(z3.f.c(402666932, new ak0.g((Object) bVar, (Object) d14, (Object) d15, (Object) d17, (Object) this, (Object) d18, context, (Object) d16, 2), o0VarE), o0VarE, 6);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, i14, 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Ldj0/h$a;", "", "<init>", "()V", "", "CONCEPT2_LINK", "Ljava/lang/String;", "EXTRA_FTP_HELP_STATES", "READINGS_ACTION", "INFORMATION_ACTION", "MEASUREMENT_ACTION", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
