package f2;

import android.os.Bundle;
import c2.h2;
import com.garmin.android.apps.connectmobile.developer.HelpRegistryActivity;
import g2.m1;
import i3.b3;
import i3.x3;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f68252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f68253d;

    public /* synthetic */ o(int i14, g2.i0 i0Var, Object obj) {
        this.f68250a = 10;
        this.f68252c = i0Var;
        this.f68251b = i14;
        this.f68253d = obj;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f68250a;
        int i15 = this.f68251b;
        Object obj3 = this.f68253d;
        Object obj4 = this.f68252c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                ((p) obj4).e(i15, obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                f21.q.a((g21.b) obj4, (v21.e) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((f62.r) obj4).d((h4.r) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).intValue();
                f70.c.b((u82.f) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).intValue();
                f70.c.c((j61.i) obj4, (j61.d) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                f71.a.a((h4.r) obj4, (d71.j.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                f71.d.a((h4.r) obj4, (d71.j.b) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                f71.h.a((h4.r) obj4, (d71.i) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                fe1.g.a aVar = fe1.g.f70543g;
                ((fe1.g) obj4).a((Bundle) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                fn1.m.d((km1.r) obj4, (j23.g) obj3, (p3.m) obj, p3.p0.t(1), i15);
                return Unit.INSTANCE;
            case 10:
                g2.i0 i0Var = (g2.i0) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i0Var.e(i15, obj3, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                int i16 = HelpRegistryActivity.f33616a;
                ((HelpRegistryActivity) obj4).ca((h2) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 12:
                int iIntValue2 = ((Integer) obj).intValue();
                e53.j jVar = (e53.j) obj2;
                gn1.a aVar2 = gn1.a.f78064a;
                jVar.getClass();
                String str = (String) ((m1) obj4).invoke(b63.b.e(jVar, (b63.z) obj3));
                if (iIntValue2 <= 0) {
                    return p13.w.c(str);
                }
                ArrayList arrayList = new ArrayList(i15);
                for (int i17 = 0; i17 < i15; i17++) {
                    arrayList.add("");
                }
                return p13.h0.D0(arrayList, str);
            case 13:
                ((Integer) obj2).getClass();
                ((gp.m) obj4).b((h4.r) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ((h2.x) obj4).e(i15, obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i18 = h81.c.f82412g;
                ((h81.c) obj4).a((Bundle) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                int i19 = h81.h.f82423h;
                ((h81.h) obj4).a((Bundle) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                h82.r rVar = h82.r.f82497a;
                ((h82.r) obj4).a((z3.e) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                int i24 = ho0.h.f84713l;
                ((ho0.h) obj4).a((Bundle) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).intValue();
                ho1.n.d((zc.d) obj4, (fo1.o0) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                hs.g.a((List) obj4, (qr.t) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                int i25 = ht0.e.f85518g;
                ((ht0.e) obj4).a((Bundle) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                int i26 = ht0.j.f85529g;
                ((ht0.j) obj4).a((Bundle) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                hv0.c.c((ou0.b) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                hw1.e.a((h4.r) obj4, (ArrayList) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                float f14 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                ((com.garmin.android.apps.connectmobile.newsfeed.d) obj4).d((com.garmin.android.apps.connectmobile.newsfeed.d.j) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).intValue();
                x3.l((b3) obj4, (l3.e0) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                i91.h.e((h4.r) obj4, (c91.b) obj3, (p3.m) obj, p3.p0.t(1), i15);
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                ic1.i.a aVar3 = ic1.i.f92620g;
                ((ic1.i) obj4).a((Bundle) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int i27 = ij1.r.f93892k;
                ((ij1.r) obj4).a((Bundle) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o(g2.i0 i0Var, int i14, Object obj, int i15, int i16) {
        this.f68250a = i16;
        this.f68252c = i0Var;
        this.f68251b = i14;
        this.f68253d = obj;
    }

    public /* synthetic */ o(Object obj, Object obj2, int i14, int i15) {
        this.f68250a = i15;
        this.f68252c = obj;
        this.f68253d = obj2;
        this.f68251b = i14;
    }

    public /* synthetic */ o(Object obj, Object obj2, int i14, int i15, int i16) {
        this.f68250a = i16;
        this.f68252c = obj;
        this.f68253d = obj2;
        this.f68251b = i15;
    }
}
