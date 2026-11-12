package gv0;

import android.app.Activity;
import b21.a9;
import com.garmin.android.apps.connectmobile.k1;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p3.p1;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79155a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f79156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f79157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f79158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f79160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f79161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f79162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f79163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f79164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f79165k;

    public /* synthetic */ a0(Activity activity, e23.l lVar, d dVar, y yVar, hl.a aVar, String str, String str2, pu0.b bVar, wd2.a aVar2, boolean z14) {
        this.f79158d = aVar;
        this.f79159e = yVar;
        this.f79160f = bVar;
        this.f79161g = str;
        this.f79163i = dVar;
        this.f79157c = lVar;
        this.f79164j = aVar2;
        this.f79165k = activity;
        this.f79162h = str2;
        this.f79156b = z14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object obj2;
        int i14;
        switch (this.f79155a) {
            case 0:
                hl.a aVar = (hl.a) this.f79158d;
                y yVar = (y) this.f79159e;
                pu0.b bVar = (pu0.b) this.f79160f;
                String str = (String) this.f79161g;
                d dVar = (d) this.f79163i;
                wd2.a aVar2 = (wd2.a) this.f79164j;
                Activity activity = (Activity) this.f79165k;
                String str2 = (String) this.f79162h;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                e2.f0.b(f0Var, null, new z3.e(747002804, true, new as.s(str, 22)), 3);
                boolean z14 = aVar instanceof hl.a.c;
                e23.l lVar = this.f79157c;
                if (z14 && yVar != null && p13.x.k(y.Both, y.Sender).contains(yVar)) {
                    e2.f0.b(f0Var, null, new z3.e(-1595082161, true, new b0(yVar, aVar, bVar, dVar, lVar, aVar2, activity)), 3);
                }
                List<pu0.f> list = bVar.f141186d;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((pu0.f) obj3).f141221b != null) {
                        arrayList.add(obj3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    e2.f0.b(f0Var, null, new z3.e(803175686, true, new a42.a(arrayList, 29, bVar, dVar)), 3);
                }
                if (!bVar.f141191i.isEmpty()) {
                    List<pu0.i> list2 = bVar.f141191i;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((pu0.i) obj4).f141261b != null) {
                            arrayList2.add(obj4);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        e2.f0.b(f0Var, null, new z3.e(-2072012062, true, new d62.f(arrayList2, str2, this.f79156b, bVar, dVar, 1)), 3);
                    }
                }
                if (yVar != null && (yVar == y.Receiver || (yVar == y.Both && (aVar instanceof hl.a.b)))) {
                    dVar = dVar;
                    bVar = bVar;
                    dVar = dVar;
                    dVar = dVar;
                    bVar = bVar;
                    dVar = dVar;
                    e2.f0.b(f0Var, null, new z3.e(866294920, true, new b0(yVar, bVar, aVar, dVar, lVar, aVar2, activity)), 3);
                }
                dVar = dVar;
                bVar = bVar;
                dVar = dVar;
                dVar = dVar;
                bVar = bVar;
                dVar = dVar;
                dVar = dVar;
                bVar = bVar;
                dVar = dVar;
                break;
            default:
                h62.m mVar = (h62.m) this.f79158d;
                e23.a aVar3 = (e23.a) this.f79159e;
                e23.a aVar4 = (e23.a) this.f79160f;
                e23.a aVar5 = (e23.a) this.f79161g;
                zc.d dVar2 = (zc.d) this.f79162h;
                h62.l lVar2 = (h62.l) this.f79163i;
                p1 p1Var = (p1) this.f79164j;
                p1 p1Var2 = (p1) this.f79165k;
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                boolean z15 = mVar.f82258j;
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zE = k1.f37122a.e();
                h62.a.f82203a.getClass();
                e2.f0.b(f0Var2, null, h62.a.f82205c, 3);
                boolean z16 = this.f79156b;
                if (z16) {
                    obj2 = null;
                    i14 = 3;
                } else {
                    z3.e eVar = new z3.e(813464943, true, new h62.g(z15, aVar3, 0));
                    obj2 = null;
                    i14 = 3;
                    e2.f0.b(f0Var2, null, eVar, 3);
                    e2.f0.b(f0Var2, null, new z3.e(392443928, true, new ak0.p(aVar4, 8)), 3);
                    if (zE) {
                        e2.f0.b(f0Var2, null, new z3.e(2043385460, true, new ak0.p(aVar5, 9)), 3);
                    }
                    e2.f0.b(f0Var2, null, h62.a.f82206d, 3);
                }
                e2.f0.b(f0Var2, obj2, new z3.e(1873304315, true, new gw1.e(mVar, 4, dVar2, lVar2)), i14);
                e2.f0.f(f0Var2, dVar2.b(), new zc.a(new h02.a(14), dVar2), new z3.e(-352254958, true, new a9(dVar2, z16, this.f79157c, p1Var, p1Var2, 2)), 4);
                if (dVar2.d().f196387c instanceof z0.b) {
                    e2.f0.b(f0Var2, null, h62.a.f82204b, 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a0(boolean z14, h62.m mVar, e23.a aVar, e23.a aVar2, e23.a aVar3, zc.d dVar, h62.l lVar, e23.l lVar2, p1 p1Var, p1 p1Var2) {
        this.f79156b = z14;
        this.f79158d = mVar;
        this.f79159e = aVar;
        this.f79160f = aVar2;
        this.f79161g = aVar3;
        this.f79162h = dVar;
        this.f79163i = lVar;
        this.f79157c = lVar2;
        this.f79164j = p1Var;
        this.f79165k = p1Var2;
    }
}
