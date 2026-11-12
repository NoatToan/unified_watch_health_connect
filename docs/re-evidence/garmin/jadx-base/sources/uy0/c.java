package uy0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetActivitiesItemsUseCase$invoke$2", f = "GetActivitiesItemsUseCase.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f173101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f173102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f173103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f173104d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173105a;

        static {
            int[] iArr = new int[am.x0.values().length];
            try {
                iArr[am.x0.E.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f173105a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((am.x0) t7).r()), Integer.valueOf(((am.x0) t14).r()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, boolean z14, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f173103c = dVar;
        this.f173104d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f173103c, this.f173104d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Iterable<String> iterableB1;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f173102b;
        if (i14 == 0) {
            o13.r.b(obj);
            ty0.b[] bVarArr = ty0.b.f166920v.f166941g;
            if (bVarArr == null) {
                return p13.j0.f134944a;
            }
            ArrayList arrayListL0 = p13.u.l0(bVarArr);
            d dVar = this.f173103c;
            com.garmin.android.apps.connectmobile.b1 b1Var = dVar.f173112a;
            com.garmin.android.apps.connectmobile.b1 b1Var2 = dVar.f173112a;
            if (!b1Var.F0()) {
                arrayListL0.remove(ty0.b.f166893m);
            }
            if (!b1Var2.k0()) {
                arrayListL0.remove(ty0.b.f166904p);
            }
            if (!b1Var2.M()) {
                arrayListL0.remove(ty0.b.f166907q);
            }
            boolean zL0 = b1Var2.l0();
            boolean zC0 = b1Var2.C0();
            if (!zL0 && !b1Var2.i0()) {
                arrayListL0.remove(ty0.b.f166897n);
            }
            if ((!zC0) & zL0) {
                arrayListL0.remove(ty0.b.f166893m);
            }
            if (zL0 && !b1Var2.h0()) {
                arrayListL0.remove(ty0.b.f166904p);
            }
            bv.b.f21239a.getClass();
            bv.b.a();
            if (!com.garmin.android.apps.connectmobile.k1.f37122a.x()) {
                arrayListL0.remove(ty0.b.f166915t);
            }
            List listA = ty0.c.a(arrayListL0);
            ArrayList arrayList2 = new ArrayList(p13.y.r(listA, 10));
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(dVar.f173115d, (ty0.b) it.next(), null, false, 12, null));
            }
            bn.a aVar2 = dVar.f173113b;
            this.f173101a = arrayList2;
            this.f173102b = 1;
            obj = aVar2.a(Long.MAX_VALUE, this, this.f173104d);
            if (obj == aVar) {
                return aVar;
            }
            arrayList = arrayList2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = this.f173101a;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            iterableB1 = p13.h0.b1(((Map) ((v2.b) v2Var).f47386a).keySet());
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            iterableB1 = p13.j0.f134944a;
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str : iterableB1) {
            w13.c cVar = am.x0.H3;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!d53.u.q(((am.x0) next).f4358a, str, true));
            am.x0 x0Var = (am.x0) next;
            if (x0Var != null) {
                arrayList3.add(x0Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (a.f173105a[((am.x0) obj2).ordinal()] != 1) {
                arrayList4.add(obj2);
            }
        }
        List listN0 = p13.h0.N0(arrayList4, new b());
        ArrayList arrayList5 = new ArrayList(p13.y.r(listN0, 10));
        Iterator it3 = listN0.iterator();
        while (it3.hasNext()) {
            arrayList5.add(new com.garmin.android.apps.connectmobile.navigation.more.b.a((am.x0) it3.next()));
        }
        return p13.h0.C0(arrayList5, arrayList);
    }
}
