package vr2;

import androidx.lifecycle.s0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c53.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.g0;
import p13.h0;
import p13.j0;
import ps2.w;
import vn2.b1;
import w2.a0;
import w3.x;
import w52.u0;
import zn2.g1;
import zn2.q3;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lvr2/i;", "Landroidx/lifecycle/u1;", "Lps2/r;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 implements ps2.r {
    public static final Logger C;
    public final f A;
    public final f B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<Boolean> f179598a = new y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<String> f179599b = new y0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f179600c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f179601d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qs2.a f179602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0 f179603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y03.d f179604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f179605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z0 f179606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g1 f179607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f179608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ps2.n f179609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s0<List<fs2.a>> f179610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f179611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y0<q3.a> f179612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zo2.a f179613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<ep2.d> f179614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map<Long, ? extends ns2.a<? extends ms2.e>> f179615r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0<List<ep2.b>> f179616t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f179617v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f179618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0<vr2.a> f179619x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0<Boolean> f179620y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y0<Boolean> f179621z;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        C = gt2.b.f79005a.h("PAY#PaymentCardDetailsViewModel");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.lifecycle.z0, vr2.f] */
    /* JADX WARN: Type inference failed for: r2v1, types: [vr2.f] */
    public i() {
        ab2.b.f2642a.getClass();
        y0 y0VarA = ab2.b.a();
        this.f179603f = y0VarA;
        this.f179616t = new y0<>();
        this.f179619x = new y0<>();
        this.f179620y = new y0<>();
        this.f179621z = new y0<>();
        final int i14 = 0;
        ?? r14 = new androidx.lifecycle.z0(this) { // from class: vr2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f179592b;

            {
                this.f179592b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ArrayList<sd2.f> arrayList;
                String str;
                int i15 = i14;
                i iVar = this.f179592b;
                switch (i15) {
                    case 0:
                        Logger logger = i.C;
                        ((ArrayList) obj).getClass();
                        y0 y0Var = iVar.f179603f;
                        if (((ArrayList) y0Var.d()) != null && (arrayList = (ArrayList) y0Var.d()) != null) {
                            for (sd2.f fVar : arrayList) {
                                if (a0.o(fVar)) {
                                    w wVar = w.f140538a;
                                    long unitID = fVar.getUnitID();
                                    wVar.getClass();
                                    ps2.n nVarI = w.i(unitID);
                                    if (nVarI != null) {
                                        nVarI.m(iVar);
                                    }
                                }
                            }
                        }
                        iVar.A4(false);
                        break;
                    default:
                        List list = (List) obj;
                        Logger logger2 = i.C;
                        list.getClass();
                        q qVar = iVar.f179605h;
                        if (qVar != null && (str = qVar.f179661h) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list) {
                                if (str.equals(x.m((fs2.a) obj2))) {
                                    arrayList2.add(obj2);
                                }
                            }
                            iVar.f179611n = arrayList2;
                        }
                        iVar.C4();
                        iVar.B4(false);
                        break;
                }
            }
        };
        this.A = r14;
        final int i15 = 1;
        this.B = new androidx.lifecycle.z0(this) { // from class: vr2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f179592b;

            {
                this.f179592b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ArrayList<sd2.f> arrayList;
                String str;
                int i16 = i15;
                i iVar = this.f179592b;
                switch (i16) {
                    case 0:
                        Logger logger = i.C;
                        ((ArrayList) obj).getClass();
                        y0 y0Var = iVar.f179603f;
                        if (((ArrayList) y0Var.d()) != null && (arrayList = (ArrayList) y0Var.d()) != null) {
                            for (sd2.f fVar : arrayList) {
                                if (a0.o(fVar)) {
                                    w wVar = w.f140538a;
                                    long unitID = fVar.getUnitID();
                                    wVar.getClass();
                                    ps2.n nVarI = w.i(unitID);
                                    if (nVarI != null) {
                                        nVarI.m(iVar);
                                    }
                                }
                            }
                        }
                        iVar.A4(false);
                        break;
                    default:
                        List list = (List) obj;
                        Logger logger2 = i.C;
                        list.getClass();
                        q qVar = iVar.f179605h;
                        if (qVar != null && (str = qVar.f179661h) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list) {
                                if (str.equals(x.m((fs2.a) obj2))) {
                                    arrayList2.add(obj2);
                                }
                            }
                            iVar.f179611n = arrayList2;
                        }
                        iVar.C4();
                        iVar.B4(false);
                        break;
                }
            }
        };
        y0VarA.g(r14);
        C4();
    }

    public final void A4(boolean z14) {
        this.f179617v = z14;
        boolean z15 = z14 || this.f179618w;
        y0<Boolean> y0Var = this.f179620y;
        if (s.g(y0Var.d(), Boolean.valueOf(z15))) {
            return;
        }
        y0Var.m(Boolean.valueOf(z15));
    }

    public final void B4(boolean z14) {
        this.f179618w = z14;
        boolean z15 = this.f179617v || z14;
        y0<Boolean> y0Var = this.f179620y;
        if (s.g(y0Var.d(), Boolean.valueOf(z15))) {
            return;
        }
        y0Var.m(Boolean.valueOf(z15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    public final void C4() {
        List listS;
        Set<fo2.s> set;
        br2.f fVar;
        Object next;
        ?? arrayList;
        ?? arrayList2;
        ArrayList arrayList3 = (ArrayList) this.f179603f.d();
        if (arrayList3 != null) {
            final int i14 = 0;
            listS = c0.s(c0.o(c0.h(new g0(arrayList3), new b1(14)), new e23.l(this) { // from class: vr2.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f179594b;

                {
                    this.f179594b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    hs2.b bVarH;
                    br2.g gVarA;
                    qs2.f fVar2;
                    br2.g gVarA2;
                    qs2.f fVar3;
                    int i15 = i14;
                    fs2.a aVar = null;
                    Object obj2 = null;
                    fs2.a aVar2 = null;
                    Object obj3 = null;
                    fs2.a aVar3 = null;
                    Object obj4 = null;
                    i iVar = this.f179594b;
                    switch (i15) {
                        case 0:
                            sd2.f fVar4 = (sd2.f) obj;
                            Logger logger = i.C;
                            fVar4.getClass();
                            w wVar = w.f140538a;
                            long unitID = fVar4.getUnitID();
                            wVar.getClass();
                            ps2.n nVarI = w.i(unitID);
                            if (nVarI == null || (bVarH = nVarI.h()) == null) {
                                bVarH = hs2.b.DISCONNECTED;
                            }
                            br2.f.a aVar4 = br2.f.f19598j;
                            long unitID2 = fVar4.getUnitID();
                            boolean zIsPaired = fVar4.isPaired();
                            aVar4.getClass();
                            br2.d dVarA = br2.f.a.a(unitID2, zIsPaired, bVarH);
                            long unitID3 = fVar4.getUnitID();
                            String strI = a0.i(fVar4);
                            String strT = u0.t(fVar4);
                            String str = strT == null ? "" : strT;
                            String softwareVersion = fVar4.getSoftwareVersion();
                            String str2 = softwareVersion == null ? "" : softwareVersion;
                            String softwareVersion2 = fVar4.getSoftwareVersion();
                            br2.f fVar5 = new br2.f(unitID3, strI, str, dVarA, str2, softwareVersion2 == null ? "" : softwareVersion2, false, false, 192, null);
                            ArrayList arrayList4 = iVar.f179611n;
                            if (arrayList4 != null) {
                                for (Object obj5 : arrayList4) {
                                    if (((fs2.a) obj5).f73431f == fVar4.getUnitID()) {
                                        obj4 = obj5;
                                        aVar = (fs2.a) obj4;
                                    }
                                }
                                aVar = (fs2.a) obj4;
                            }
                            if (aVar == null || (fVar2 = aVar.f73433h) == null || (gVarA = yr2.n.a(fVar2)) == null) {
                                gVarA = br2.g.ADD_CARD_TO_DEVICE;
                            }
                            fVar5.f19607i = gVarA;
                            return fVar5;
                        case 1:
                            fo2.s sVar = (fo2.s) obj;
                            Logger logger2 = i.C;
                            sVar.getClass();
                            ArrayList arrayList5 = iVar.f179611n;
                            if (arrayList5 != null) {
                                for (Object obj6 : arrayList5) {
                                    if (sVar.f73103c == ((fs2.a) obj6).f73431f) {
                                        obj3 = obj6;
                                        aVar3 = (fs2.a) obj3;
                                    }
                                }
                                aVar3 = (fs2.a) obj3;
                            }
                            return Boolean.valueOf(aVar3 != null);
                        default:
                            fo2.s sVar2 = (fo2.s) obj;
                            Logger logger3 = i.C;
                            sVar2.getClass();
                            long j8 = sVar2.f73103c;
                            br2.f.a aVar5 = br2.f.f19598j;
                            hs2.b bVar = hs2.b.DISCONNECTED;
                            aVar5.getClass();
                            br2.f fVar6 = new br2.f(sVar2.f73103c, sVar2.f73104d, "", br2.f.a.a(j8, false, bVar), "", "", true, false, 128, null);
                            ArrayList arrayList6 = iVar.f179611n;
                            if (arrayList6 != null) {
                                for (Object obj7 : arrayList6) {
                                    if (j8 == ((fs2.a) obj7).f73431f) {
                                        obj2 = obj7;
                                        aVar2 = (fs2.a) obj2;
                                    }
                                }
                                aVar2 = (fs2.a) obj2;
                            }
                            if (aVar2 == null || (fVar3 = aVar2.f73433h) == null || (gVarA2 = yr2.n.a(fVar3)) == null) {
                                gVarA2 = br2.g.DISABLED;
                            }
                            fVar6.f19607i = gVarA2;
                            return fVar6;
                    }
                }
            }));
        } else {
            listS = null;
        }
        g1 g1Var = this.f179607j;
        Set<fo2.s> set2 = g1Var != null ? g1Var.f205531f : null;
        if (listS != null && listS.isEmpty()) {
            set = set2;
        } else if (set2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : set2) {
                fo2.s sVar = (fo2.s) obj;
                if (listS != null) {
                    Iterator it = listS.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((br2.f) next).f19599a != sVar.f73103c);
                    fVar = (br2.f) next;
                } else {
                    fVar = null;
                }
                if (fVar == null) {
                    arrayList4.add(obj);
                }
            }
            set = arrayList4;
        } else {
            set = null;
        }
        if (set == null) {
            set = j0.f134944a;
        }
        final int i15 = 1;
        c53.g gVarH = c0.h(h0.M(set), new e23.l(this) { // from class: vr2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f179594b;

            {
                this.f179594b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj2) {
                hs2.b bVarH;
                br2.g gVarA;
                qs2.f fVar2;
                br2.g gVarA2;
                qs2.f fVar3;
                int i16 = i15;
                fs2.a aVar = null;
                Object obj3 = null;
                fs2.a aVar2 = null;
                Object obj4 = null;
                fs2.a aVar3 = null;
                Object obj5 = null;
                i iVar = this.f179594b;
                switch (i16) {
                    case 0:
                        sd2.f fVar4 = (sd2.f) obj2;
                        Logger logger = i.C;
                        fVar4.getClass();
                        w wVar = w.f140538a;
                        long unitID = fVar4.getUnitID();
                        wVar.getClass();
                        ps2.n nVarI = w.i(unitID);
                        if (nVarI == null || (bVarH = nVarI.h()) == null) {
                            bVarH = hs2.b.DISCONNECTED;
                        }
                        br2.f.a aVar4 = br2.f.f19598j;
                        long unitID2 = fVar4.getUnitID();
                        boolean zIsPaired = fVar4.isPaired();
                        aVar4.getClass();
                        br2.d dVarA = br2.f.a.a(unitID2, zIsPaired, bVarH);
                        long unitID3 = fVar4.getUnitID();
                        String strI = a0.i(fVar4);
                        String strT = u0.t(fVar4);
                        String str = strT == null ? "" : strT;
                        String softwareVersion = fVar4.getSoftwareVersion();
                        String str2 = softwareVersion == null ? "" : softwareVersion;
                        String softwareVersion2 = fVar4.getSoftwareVersion();
                        br2.f fVar5 = new br2.f(unitID3, strI, str, dVarA, str2, softwareVersion2 == null ? "" : softwareVersion2, false, false, 192, null);
                        ArrayList arrayList5 = iVar.f179611n;
                        if (arrayList5 != null) {
                            for (Object obj6 : arrayList5) {
                                if (((fs2.a) obj6).f73431f == fVar4.getUnitID()) {
                                    obj5 = obj6;
                                    aVar = (fs2.a) obj5;
                                }
                            }
                            aVar = (fs2.a) obj5;
                        }
                        if (aVar == null || (fVar2 = aVar.f73433h) == null || (gVarA = yr2.n.a(fVar2)) == null) {
                            gVarA = br2.g.ADD_CARD_TO_DEVICE;
                        }
                        fVar5.f19607i = gVarA;
                        return fVar5;
                    case 1:
                        fo2.s sVar2 = (fo2.s) obj2;
                        Logger logger2 = i.C;
                        sVar2.getClass();
                        ArrayList arrayList6 = iVar.f179611n;
                        if (arrayList6 != null) {
                            for (Object obj7 : arrayList6) {
                                if (sVar2.f73103c == ((fs2.a) obj7).f73431f) {
                                    obj4 = obj7;
                                    aVar3 = (fs2.a) obj4;
                                }
                            }
                            aVar3 = (fs2.a) obj4;
                        }
                        return Boolean.valueOf(aVar3 != null);
                    default:
                        fo2.s sVar3 = (fo2.s) obj2;
                        Logger logger3 = i.C;
                        sVar3.getClass();
                        long j8 = sVar3.f73103c;
                        br2.f.a aVar5 = br2.f.f19598j;
                        hs2.b bVar = hs2.b.DISCONNECTED;
                        aVar5.getClass();
                        br2.f fVar6 = new br2.f(sVar3.f73103c, sVar3.f73104d, "", br2.f.a.a(j8, false, bVar), "", "", true, false, 128, null);
                        ArrayList arrayList7 = iVar.f179611n;
                        if (arrayList7 != null) {
                            for (Object obj8 : arrayList7) {
                                if (j8 == ((fs2.a) obj8).f73431f) {
                                    obj3 = obj8;
                                    aVar2 = (fs2.a) obj3;
                                }
                            }
                            aVar2 = (fs2.a) obj3;
                        }
                        if (aVar2 == null || (fVar3 = aVar2.f73433h) == null || (gVarA2 = yr2.n.a(fVar3)) == null) {
                            gVarA2 = br2.g.DISABLED;
                        }
                        fVar6.f19607i = gVarA2;
                        return fVar6;
                }
            }
        });
        final int i16 = 2;
        ArrayList arrayListC0 = listS != null ? h0.C0(listS, c0.s(c0.o(gVarH, new e23.l(this) { // from class: vr2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f179594b;

            {
                this.f179594b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj2) {
                hs2.b bVarH;
                br2.g gVarA;
                qs2.f fVar2;
                br2.g gVarA2;
                qs2.f fVar3;
                int i17 = i16;
                fs2.a aVar = null;
                Object obj3 = null;
                fs2.a aVar2 = null;
                Object obj4 = null;
                fs2.a aVar3 = null;
                Object obj5 = null;
                i iVar = this.f179594b;
                switch (i17) {
                    case 0:
                        sd2.f fVar4 = (sd2.f) obj2;
                        Logger logger = i.C;
                        fVar4.getClass();
                        w wVar = w.f140538a;
                        long unitID = fVar4.getUnitID();
                        wVar.getClass();
                        ps2.n nVarI = w.i(unitID);
                        if (nVarI == null || (bVarH = nVarI.h()) == null) {
                            bVarH = hs2.b.DISCONNECTED;
                        }
                        br2.f.a aVar4 = br2.f.f19598j;
                        long unitID2 = fVar4.getUnitID();
                        boolean zIsPaired = fVar4.isPaired();
                        aVar4.getClass();
                        br2.d dVarA = br2.f.a.a(unitID2, zIsPaired, bVarH);
                        long unitID3 = fVar4.getUnitID();
                        String strI = a0.i(fVar4);
                        String strT = u0.t(fVar4);
                        String str = strT == null ? "" : strT;
                        String softwareVersion = fVar4.getSoftwareVersion();
                        String str2 = softwareVersion == null ? "" : softwareVersion;
                        String softwareVersion2 = fVar4.getSoftwareVersion();
                        br2.f fVar5 = new br2.f(unitID3, strI, str, dVarA, str2, softwareVersion2 == null ? "" : softwareVersion2, false, false, 192, null);
                        ArrayList arrayList5 = iVar.f179611n;
                        if (arrayList5 != null) {
                            for (Object obj6 : arrayList5) {
                                if (((fs2.a) obj6).f73431f == fVar4.getUnitID()) {
                                    obj5 = obj6;
                                    aVar = (fs2.a) obj5;
                                }
                            }
                            aVar = (fs2.a) obj5;
                        }
                        if (aVar == null || (fVar2 = aVar.f73433h) == null || (gVarA = yr2.n.a(fVar2)) == null) {
                            gVarA = br2.g.ADD_CARD_TO_DEVICE;
                        }
                        fVar5.f19607i = gVarA;
                        return fVar5;
                    case 1:
                        fo2.s sVar2 = (fo2.s) obj2;
                        Logger logger2 = i.C;
                        sVar2.getClass();
                        ArrayList arrayList6 = iVar.f179611n;
                        if (arrayList6 != null) {
                            for (Object obj7 : arrayList6) {
                                if (sVar2.f73103c == ((fs2.a) obj7).f73431f) {
                                    obj4 = obj7;
                                    aVar3 = (fs2.a) obj4;
                                }
                            }
                            aVar3 = (fs2.a) obj4;
                        }
                        return Boolean.valueOf(aVar3 != null);
                    default:
                        fo2.s sVar3 = (fo2.s) obj2;
                        Logger logger3 = i.C;
                        sVar3.getClass();
                        long j8 = sVar3.f73103c;
                        br2.f.a aVar5 = br2.f.f19598j;
                        hs2.b bVar = hs2.b.DISCONNECTED;
                        aVar5.getClass();
                        br2.f fVar6 = new br2.f(sVar3.f73103c, sVar3.f73104d, "", br2.f.a.a(j8, false, bVar), "", "", true, false, 128, null);
                        ArrayList arrayList7 = iVar.f179611n;
                        if (arrayList7 != null) {
                            for (Object obj8 : arrayList7) {
                                if (j8 == ((fs2.a) obj8).f73431f) {
                                    obj3 = obj8;
                                    aVar2 = (fs2.a) obj3;
                                }
                            }
                            aVar2 = (fs2.a) obj3;
                        }
                        if (aVar2 == null || (fVar3 = aVar2.f73433h) == null || (gVarA2 = yr2.n.a(fVar3)) == null) {
                            gVarA2 = br2.g.DISABLED;
                        }
                        fVar6.f19607i = gVarA2;
                        return fVar6;
                }
            }
        }))) : null;
        if (arrayListC0 != null) {
            arrayList = new ArrayList();
            for (Object obj2 : arrayListC0) {
                if (((br2.f) obj2).f19607i == br2.g.PAY_ENABLED) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        if (arrayListC0 != null) {
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayListC0) {
                br2.g gVar = ((br2.f) obj3).f19607i;
                if (gVar != br2.g.PAY_ENABLED && gVar != br2.g.PAY_NOT_ENABLED) {
                    arrayList2.add(obj3);
                }
            }
        } else {
            arrayList2 = j0.f134944a;
        }
        this.f179619x.m(new vr2.a(arrayList, arrayList2));
    }

    @Override // ps2.r
    public final void k4(hs2.b bVar) {
        bVar.getClass();
        C4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        ArrayList<sd2.f> arrayList;
        super.onCleared();
        f fVar = this.A;
        y0 y0Var = this.f179603f;
        y0Var.k(fVar);
        s0<List<fs2.a>> s0Var = this.f179610m;
        if (s0Var != null) {
            s0Var.k(this.B);
        }
        if (((ArrayList) y0Var.d()) != null && (arrayList = (ArrayList) y0Var.d()) != null) {
            for (sd2.f fVar2 : arrayList) {
                if (a0.o(fVar2)) {
                    w wVar = w.f140538a;
                    long unitID = fVar2.getUnitID();
                    wVar.getClass();
                    ps2.n nVarI = w.i(unitID);
                    if (nVarI != null) {
                        nVarI.q(this);
                    }
                }
            }
        }
        y03.d dVar = this.f179604g;
        if (dVar != null) {
            v03.c.a(dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x4(v13.c cVar) {
        k kVar;
        fo2.p paymentCardLink;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f179628c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f179628c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objQ = kVar.f179626a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f179628c;
        try {
            if (i15 == 0) {
                o13.r.b(objQ);
                g1 g1Var = this.f179607j;
                String link = null;
                if (g1Var == null) {
                    return null;
                }
                zo2.a aVar2 = this.f179613p;
                if (aVar2 != null && (paymentCardLink = aVar2.getPaymentCardLink()) != null) {
                    link = paymentCardLink.getLink();
                }
                String str = this.f179608k;
                kVar.f179628c = 1;
                objQ = g1Var.q(link, str, kVar);
                if (objQ == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objQ);
            }
            return (Boolean) objQ;
        } catch (Exception e4) {
            C.error("deletePaymentCard: ", (Throwable) e4);
            return Boolean.FALSE;
        }
    }

    public final zq2.g y4() {
        Map<Long, ? extends ns2.a<? extends ms2.e>> map = this.f179615r;
        Object obj = null;
        if (map == null) {
            s.m("operatorsByDevice");
            throw null;
        }
        ns2.a<? extends ms2.e> aVar = map.get(Long.valueOf(this.f179600c));
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : aVar.f127815a) {
            if (obj2 instanceof zq2.g) {
                arrayList.add(obj2);
            }
        }
        for (Object obj3 : arrayList) {
            if (((zq2.g) obj3).f206687h == this.f179602e) {
                obj = obj3;
                break;
            }
        }
        return (zq2.g) obj;
    }

    public final void z4() {
        C.debug("Refreshing Wallet Items");
        B4(true);
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, u53.o.f168762a, null, new p(this, null), 2);
        g1 g1Var = this.f179607j;
        if (g1Var != null) {
            androidx.room.g0 g0VarF = g1Var.f205527b.f205521a.f();
            this.f179610m = g0VarF;
            g0VarF.g(this.B);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvr2/i$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
