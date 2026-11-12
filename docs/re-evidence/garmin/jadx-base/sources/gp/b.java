package gp;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.k1;
import com.google.android.gms.maps.model.LatLng;
import ew1.c2;
import f21.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import p3.o0;
import p3.p2;
import p3.x1;
import ps.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgp/b;", "Lr70/r;", "Lhp/a;", "stateHolder", "", "shownInCarousel", "showCheckMark", "Lkotlin/Function0;", "", "extraAnalyticsLoggingAction", "<init>", "(Lhp/a;ZZLe23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp.a f78338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f78341d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78343b;

        static {
            int[] iArr = new int[jr.l.values().length];
            try {
                iArr[jr.l.ActivityName.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.l.ActivityType.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78342a = iArr;
            int[] iArr2 = new int[jr.e.values().length];
            try {
                iArr2[jr.e.Dive.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f78343b = iArr2;
        }
    }

    public b(hp.a aVar, boolean z14, boolean z15, e23.a<Unit> aVar2) {
        aVar.getClass();
        this.f78338a = aVar;
        this.f78339b = z14;
        this.f78340c = z15;
        this.f78341d = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02c2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strC;
        String str;
        String str2;
        Object obj;
        int i16;
        String strJ;
        String strC2;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -396783609);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            l22.a aVar = new l22.a(context);
            hp.a aVar2 = this.f78338a;
            jr.q qVar2 = aVar2.f84888c;
            in.a aVar3 = aVar2.f84887b;
            ArrayList arrayListA = is.o.a(qVar2.g(), ss.c.a(b()));
            jr.p pVar = (jr.p) h0.e0(0, arrayListA);
            List<List<LatLng>> list = null;
            ls.e eVarA = pVar != null ? is.m.a(pVar) : null;
            jr.p pVar2 = (jr.p) h0.e0(1, arrayListA);
            ls.e eVarA2 = pVar2 != null ? is.m.a(pVar2) : null;
            jr.p pVar3 = (jr.p) h0.e0(2, arrayListA);
            ls.e eVarA3 = pVar3 != null ? is.m.a(pVar3) : null;
            String str3 = "";
            if (eVarA == null || (strC = c(aVar, eVarA, false)) == null) {
                strC = "";
            }
            if (eVarA2 != null && (strC2 = c(aVar, eVarA2, false)) != null) {
                str3 = strC2;
            }
            String strC3 = eVarA3 != null ? c(aVar, eVarA3, false) : null;
            ArrayList arrayList = new ArrayList(y.r(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(c(aVar, is.m.a((jr.p) it.next()), true));
            }
            String str4 = b().f29253c;
            String strT = gl1.d.T(b().f29265g.f4360c, o0VarQ, 0);
            int i17 = a.f78342a[qVar2.c().ordinal()];
            if (i17 == 1) {
                str = str4;
            } else {
                if (i17 != 2) {
                    u0.r();
                    return;
                }
                str = strT;
            }
            String strG = tn.k.g(str, ".");
            String str5 = str;
            int i18 = i15;
            if (qVar2.c() != jr.l.ActivityType) {
                o0VarQ.C(-829015511);
                strG = ((Object) strG) + StringUtils.SPACE + gl1.y.Q(o0VarQ, R.string.txt_activity_type) + ", " + strT;
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-828782949);
                o0VarQ.g0(false);
            }
            ArrayList arrayListB = qVar2.b();
            if (arrayListB != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayListB.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = it3;
                    if (a.f78343b[((jr.e) it3.next()).ordinal()] != 1) {
                        u0.r();
                        return;
                    }
                    if (b().f29274j1) {
                        arrayList2.add(new o13.p(aVar.getString(R.string.abbrev_decompression_dive), aVar.getString(R.string.lbl_decompression_dive)));
                    }
                    it3 = it4;
                    strG = strG;
                }
                str2 = strG;
                obj = arrayList2;
            } else {
                str2 = strG;
                obj = j0.f134944a;
            }
            Iterable iterable = (Iterable) obj;
            Iterator it5 = iterable.iterator();
            String str6 = str2;
            while (it5.hasNext()) {
                str6 = ((Object) str6) + StringUtils.SPACE + ((o13.p) it5.next()).f128595b + ".";
            }
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zL0 = k1.f37122a.l0();
            String str7 = aVar3.f94388a.f29249a2;
            z.f140416b.getClass();
            boolean z14 = z.a.a(str7) == z.PROCESSING;
            boolean zB = yz1.e.b(aVar2.f84886a);
            u4.d dVarS = b().f29265g.s(zL0);
            f02.h.f67736a.getClass();
            String str8 = strC;
            String str9 = strC3;
            long jA = f02.h.a(o0VarQ);
            long jA2 = n5.a.a(o0VarQ, b().f29265g.f4366i);
            ArrayList arrayList3 = new ArrayList(y.r(iterable, 10));
            Iterator it6 = iterable.iterator();
            while (it6.hasNext()) {
                arrayList3.add((String) ((o13.p) it6.next()).f128594a);
            }
            if (str5 == null) {
                i16 = 0;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 943124818, R.string.no_value_card, o0VarQ, false);
            } else {
                i16 = 0;
                o0VarQ.C(943124539);
                o0VarQ.g0(false);
                strJ = str5;
            }
            String str10 = (String) h0.e0(i16, arrayList);
            String str11 = (String) h0.e0(1, arrayList);
            String str12 = (String) h0.e0(2, arrayList);
            if (qVar2.getShowPolyline() && !z14) {
                list = aVar3.f94389b;
            }
            boolean showExternalLinkIcon = qVar2.getShowExternalLinkIcon();
            boolean z15 = b().f29260e1 || aVar3.f94390c;
            boolean zR = o0VarQ.r(this) | o0VarQ.r(context);
            Object objQ = o0VarQ.q();
            if (zR) {
                objQ = new c2(29, this, context);
                o0VarQ.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c2(29, this, context);
                    o0VarQ.K(objQ);
                }
            }
            o0Var = o0VarQ;
            an.c.a(rVar, zB, dVarS, jA, jA2, arrayList3, 0.0f, 0.0f, strJ, str8, str3, str9, str6, str10, str11, str12, list, showExternalLinkIcon, this.f78340c, z15, this.f78339b, (e23.a) objQ, o0Var, i18 & 14, 0, 0, 192);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((r70.r) this, rVar, qVar, i14, 22);
        }
    }

    public final ActivityListItemDTO b() {
        return this.f78338a.f84887b.f94388a;
    }

    public final String c(l22.a aVar, ls.e eVar, boolean z14) {
        Object objK = ss.k.k(eVar, ss.c.a(b()));
        int iC = ss.k.c(eVar);
        if (z14) {
            iC = oe2.f.H(iC, 16) ? 48 : 32;
        }
        return ss.k.b(eVar, aVar, objK, iC);
    }

    public /* synthetic */ b(hp.a aVar, boolean z14, boolean z15, e23.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? null : aVar2);
    }
}
