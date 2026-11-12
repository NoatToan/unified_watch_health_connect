package vr2;

import android.content.Context;
import androidx.lifecycle.s0;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c53.c0;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.g0;
import p13.h0;
import p13.j0;
import ps2.w;
import vn2.b1;
import w2.a0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lvr2/c;", "Landroidx/lifecycle/u1;", "Lps2/r;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 implements ps2.r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f179562o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f179563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s0<List<fs2.a>> f179564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<? extends fs2.a> f179565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public op2.e f179566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f179567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y03.d f179568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f179569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f179570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f179571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<vr2.a> f179572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<Boolean> f179573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f179574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f179575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f179576n;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f179562o = gt2.b.f79005a.h("PAY#CardDetailsViewModel");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.z0, vr2.b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [vr2.b] */
    public c() {
        ab2.b.f2642a.getClass();
        y0 y0VarA = ab2.b.a();
        this.f179563a = y0VarA;
        this.f179567e = new ArrayList();
        this.f179573k = new y0<>();
        final int i14 = 0;
        ?? r14 = new z0(this) { // from class: vr2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f179561b;

            {
                this.f179561b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ArrayList<sd2.f> arrayList;
                int i15 = i14;
                c cVar = this.f179561b;
                switch (i15) {
                    case 0:
                        Logger logger = c.f179562o;
                        ((ArrayList) obj).getClass();
                        y0 y0Var = cVar.f179563a;
                        if (((ArrayList) y0Var.d()) != null && (arrayList = (ArrayList) y0Var.d()) != null) {
                            for (sd2.f fVar : arrayList) {
                                if (a0.o(fVar)) {
                                    w wVar = w.f140538a;
                                    long unitID = fVar.getUnitID();
                                    wVar.getClass();
                                    ps2.n nVarI = w.i(unitID);
                                    if (nVarI != null) {
                                        nVarI.m(cVar);
                                    }
                                }
                            }
                        }
                        cVar.y4(false);
                        return;
                    default:
                        List<? extends fs2.a> list = (List) obj;
                        Logger logger2 = c.f179562o;
                        list.getClass();
                        cVar.f179565c = list;
                        list.isEmpty();
                        wr2.r rVar = wr2.r.f186883a;
                        List<? extends fs2.a> list2 = cVar.f179565c;
                        if (list2 == null) {
                            s.m("deviceWalletItems");
                            throw null;
                        }
                        fs2.a aVar = (fs2.a) h0.d0(list2);
                        rVar.getClass();
                        op2.e eVarA = wr2.r.a(aVar);
                        cVar.f179566d = eVarA;
                        cVar.f179574l = eVarA != null;
                        cVar.A4();
                        cVar.z4(false);
                        return;
                }
            }
        };
        this.f179575m = r14;
        final int i15 = 1;
        this.f179576n = new z0(this) { // from class: vr2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f179561b;

            {
                this.f179561b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ArrayList<sd2.f> arrayList;
                int i16 = i15;
                c cVar = this.f179561b;
                switch (i16) {
                    case 0:
                        Logger logger = c.f179562o;
                        ((ArrayList) obj).getClass();
                        y0 y0Var = cVar.f179563a;
                        if (((ArrayList) y0Var.d()) != null && (arrayList = (ArrayList) y0Var.d()) != null) {
                            for (sd2.f fVar : arrayList) {
                                if (a0.o(fVar)) {
                                    w wVar = w.f140538a;
                                    long unitID = fVar.getUnitID();
                                    wVar.getClass();
                                    ps2.n nVarI = w.i(unitID);
                                    if (nVarI != null) {
                                        nVarI.m(cVar);
                                    }
                                }
                            }
                        }
                        cVar.y4(false);
                        return;
                    default:
                        List<? extends fs2.a> list = (List) obj;
                        Logger logger2 = c.f179562o;
                        list.getClass();
                        cVar.f179565c = list;
                        list.isEmpty();
                        wr2.r rVar = wr2.r.f186883a;
                        List<? extends fs2.a> list2 = cVar.f179565c;
                        if (list2 == null) {
                            s.m("deviceWalletItems");
                            throw null;
                        }
                        fs2.a aVar = (fs2.a) h0.d0(list2);
                        rVar.getClass();
                        op2.e eVarA = wr2.r.a(aVar);
                        cVar.f179566d = eVarA;
                        cVar.f179574l = eVarA != null;
                        cVar.A4();
                        cVar.z4(false);
                        return;
                }
            }
        };
        this.f179572j = new y0<>();
        y0VarA.g(r14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final void A4() {
        ?? arrayList;
        ?? arrayList2;
        ArrayList arrayList3 = (ArrayList) this.f179563a.d();
        List listS = arrayList3 != null ? c0.s(c0.o(c0.h(new g0(arrayList3), new b1(10)), new uo1.a(this, 26))) : null;
        if (listS != null) {
            arrayList = new ArrayList();
            for (Object obj : listS) {
                if (((br2.f) obj).f19607i == br2.g.PAY_ENABLED) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        if (listS != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : listS) {
                br2.g gVar = ((br2.f) obj2).f19607i;
                if (gVar != br2.g.PAY_ENABLED && gVar != br2.g.PAY_NOT_ENABLED) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = j0.f134944a;
        }
        this.f179572j.m(new vr2.a(arrayList, arrayList2));
    }

    @Override // ps2.r
    public final void k4(hs2.b bVar) {
        bVar.getClass();
        A4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        ArrayList<sd2.f> arrayList;
        super.onCleared();
        b bVar = this.f179575m;
        y0 y0Var = this.f179563a;
        y0Var.k(bVar);
        s0<List<fs2.a>> s0Var = this.f179564b;
        if (s0Var == null) {
            s.m("itemsList");
            throw null;
        }
        s0Var.k(this.f179576n);
        if (((ArrayList) y0Var.d()) != null && (arrayList = (ArrayList) y0Var.d()) != null) {
            for (sd2.f fVar : arrayList) {
                if (a0.o(fVar)) {
                    w wVar = w.f140538a;
                    long unitID = fVar.getUnitID();
                    wVar.getClass();
                    ps2.n nVarI = w.i(unitID);
                    if (nVarI != null) {
                        nVarI.q(this);
                    }
                }
            }
        }
        y03.d dVar = this.f179568f;
        if (dVar != null) {
            v03.c.a(dVar);
        }
    }

    public final void x4() {
        String str;
        z4(true);
        f179562o.debug("Refreshing Wallet Items");
        q qVar = this.f179569g;
        if (qVar == null || (str = qVar.f179661h) == null) {
            return;
        }
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        androidx.room.g0 g0VarA = GarminPayCoreDatabase.b.a(contextC).e().a(str);
        this.f179564b = g0VarA;
        g0VarA.g(this.f179576n);
    }

    public final void y4(boolean z14) {
        this.f179570h = z14;
        boolean z15 = z14 || this.f179571i;
        y0<Boolean> y0Var = this.f179573k;
        if (s.g(y0Var.d(), Boolean.valueOf(z15))) {
            return;
        }
        y0Var.m(Boolean.valueOf(z15));
    }

    public final void z4(boolean z14) {
        this.f179571i = z14;
        boolean z15 = this.f179570h || z14;
        y0<Boolean> y0Var = this.f179573k;
        if (s.g(y0Var.d(), Boolean.valueOf(z15))) {
            return;
        }
        y0Var.m(Boolean.valueOf(z15));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvr2/c$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
