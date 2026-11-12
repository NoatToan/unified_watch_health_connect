package ha0;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.k1;
import e23.l;
import e23.p;
import g2.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.t0;
import p13.u0;
import p13.x;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.u2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lha0/k;", "Landroidx/lifecycle/u1;", "", "deviceUnitId", "", "deviceProductNumber", "Lx80/b;", "deviceSetupDelegate", "Lkl1/a;", "activityInfoProvider", "Lxs/i;", "saveFavoriteActivitiesUseCase", "<init>", "(JLjava/lang/String;Lx80/b;Lkl1/a;Lxs/i;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f82647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl1.a f82648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xs.i f82649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<zf2.d> f82650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<zf2.d> f82651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f82652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<il1.a, List<zf2.d>> f82653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f82654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f82655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f82656j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lha0/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.activities.SelectFavoriteActivitiesViewModel$uiState$1", f = "SelectFavoriteActivitiesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<r53.j<? super g>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super g> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            final k kVar = k.this;
            List<zf2.d> list = kVar.f82652f ? kVar.f82651e : kVar.f82650d;
            d.a aVar2 = new d.a(new b(10));
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                final int i14 = 0;
                if (!it.hasNext()) {
                    break;
                }
                final zf2.d dVar = (zf2.d) it.next();
                arrayList.add(new d.b(new l() { // from class: ha0.h
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        Context context = (Context) obj2;
                        switch (i14) {
                            case 0:
                                context.getClass();
                                break;
                            default:
                                context.getClass();
                                break;
                        }
                        return kVar.f82648b.a(dVar);
                    }
                }, dVar, false));
            }
            Map mapB = t0.b(new o13.p(aVar2, arrayList));
            Map<il1.a, List<zf2.d>> map = kVar.f82653g;
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<il1.a, List<zf2.d>> entry : map.entrySet()) {
                il1.a key = entry.getKey();
                List<zf2.d> value = entry.getValue();
                d.a aVar3 = new d.a(new m1(18, kVar, key));
                ArrayList arrayList3 = new ArrayList(y.r(value, 10));
                for (final zf2.d dVar2 : value) {
                    final int i15 = 1;
                    arrayList3.add(new d.b(new l() { // from class: ha0.h
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            Context context = (Context) obj2;
                            switch (i15) {
                                case 0:
                                    context.getClass();
                                    break;
                                default:
                                    context.getClass();
                                    break;
                            }
                            return kVar.f82648b.a(dVar2);
                        }
                    }, dVar2, false));
                }
                arrayList2.add(new o13.p(aVar3, arrayList3));
            }
            Map mapL = u0.l(arrayList2);
            p2 p2Var = kVar.f82655i;
            p2Var.k(null, g.a((g) p2Var.getValue(), null, null, u0.h(mapB, mapL), 6));
            return Unit.INSTANCE;
        }
    }

    public k(long j8, String str, x80.b bVar, kl1.a aVar, xs.i iVar) {
        str.getClass();
        bVar.getClass();
        aVar.getClass();
        iVar.getClass();
        this.f82647a = j8;
        this.f82648b = aVar;
        this.f82649c = iVar;
        zf2.d dVar = zf2.d.Q1;
        zf2.d dVar2 = zf2.d.f204603m;
        zf2.d dVar3 = zf2.d.N0;
        zf2.d dVar4 = zf2.d.f204627z;
        zf2.d dVar5 = zf2.d.O0;
        zf2.d dVar6 = zf2.d.f204609p;
        zf2.d dVar7 = zf2.d.N1;
        zf2.d dVar8 = zf2.d.M0;
        zf2.d dVar9 = zf2.d.V0;
        zf2.d dVar10 = zf2.d.Q0;
        zf2.d dVar11 = zf2.d.f204583b2;
        zf2.d dVar12 = zf2.d.f204585c2;
        this.f82650d = x.k(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12);
        this.f82651e = x.k(zf2.d.f204625y, zf2.d.f204623x, dVar3, zf2.d.H0, dVar5, dVar8, dVar9, dVar10, dVar11, dVar12);
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zL0 = k1.f37122a.l0();
        this.f82652f = zL0;
        this.f82653g = bVar.h(str, zL0);
        this.f82654h = 10;
        p2 p2VarA = q2.a(new g(false, null, null, null, 15, null));
        this.f82655i = p2VarA;
        u2 u2Var = new u2(p2VarA, new a(null));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f82656j = s.K(u2Var, aVarA, k2.a.f150706c, new g(false, null, null, null, 15, null));
    }

    public static boolean x4(ArrayList arrayList, d.b bVar) {
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((d.b) it.next()).f82630b == bVar.f82630b) {
                return true;
            }
        }
        return false;
    }
}
