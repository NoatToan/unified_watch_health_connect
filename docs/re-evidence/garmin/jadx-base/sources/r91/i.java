package r91;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.z1;
import u53.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.PRHistoryUseCase$getPRHistoryForType$2", f = "PRHistoryUseCase.kt", l = {59}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f151417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q91.d f151418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.f f151419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f151420e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.PRHistoryUseCase$getPRHistoryForType$2$6", f = "PRHistoryUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f151421a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151421a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f151421a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f151421a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Double.valueOf(((n91.a) t7).getValue()), Double.valueOf(((n91.a) t14).getValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Double.valueOf(((n91.a) t14).getValue()), Double.valueOf(((n91.a) t7).getValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, q91.d dVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar, e23.a<Unit> aVar, t13.d<? super i> dVar2) {
        super(2, dVar2);
        this.f151417b = kVar;
        this.f151418c = dVar;
        this.f151419d = fVar;
        this.f151420e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f151417b, this.f151418c, this.f151419d, this.f151420e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151416a;
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = this.f151419d;
        e23.a<Unit> aVar2 = this.f151420e;
        q91.d dVar = this.f151418c;
        k kVar = this.f151417b;
        if (i14 == 0) {
            r.b(obj);
            q91.d dVar2 = this.f151418c;
            kVar.f151434h = dVar2;
            kVar.f151435i = fVar;
            kVar.f151436j = aVar2;
            kVar.f151432f = null;
            z1<aa1.e> z1Var = kVar.f151431e;
            while (!z1Var.b(z1Var.getValue(), new aa1.e(true, false, false, dVar2, null, null, null, null, null, null, null, 2038, null))) {
            }
            o91.a aVar3 = kVar.f151428b;
            long j8 = dVar.f143579a;
            this.f151416a = 1;
            objG = aVar3.g(j8, this);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objG = obj;
        }
        v2 v2Var = (v2) objG;
        if (!(v2Var instanceof v2.b)) {
            z91.a aVar4 = z91.a.f203130a;
            Context context = kVar.f151427a;
            j0 j0Var = j0.f134944a;
            aVar4.getClass();
            aa1.e eVarI = z91.a.i(context, dVar, fVar, j0Var, null);
            z1<aa1.e> z1Var2 = kVar.f151431e;
            while (!z1Var2.b(z1Var2.getValue(), aa1.e.b(eVarI, false, false, null, null, null, null, null, 2044))) {
            }
            return new v2.a(new Exception(org.apache.commons.lang3.e.e(dVar.f143579a, "Failed to fetch personal record history for type ")), null, null, 6, null);
        }
        Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (((n91.a) obj2).getTypeId() == dVar.f143579a) {
                arrayList.add(obj2);
            }
        }
        kVar.f151433g.clear();
        kVar.f151433g.addAll(dVar.f143581c == q91.a.TIME ? h0.N0(arrayList, new b()) : h0.N0(arrayList, new c()));
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n91.a) next).r());
        kVar.f151432f = (n91.a) next;
        z91.a aVar5 = z91.a.f203130a;
        Context context2 = kVar.f151427a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!((n91.a) obj3).r()) {
                arrayList2.add(obj3);
            }
        }
        n91.a aVar6 = kVar.f151432f;
        n91.a aVarB = aVar6 != null ? n91.a.b(aVar6, null, 4095) : null;
        aVar5.getClass();
        aa1.e eVarI2 = z91.a.i(context2, dVar, fVar, arrayList2, aVarB);
        z1<aa1.e> z1Var3 = kVar.f151431e;
        while (!z1Var3.b(z1Var3.getValue(), aa1.e.b(eVarI2, false, false, null, null, null, null, null, 2046))) {
        }
        if (kVar.f151432f == null && arrayList.isEmpty()) {
            b0 b0Var = kVar.f151429c;
            x53.c cVar = s0.f129406a;
            ge1.b.T(b0Var, o.f168762a, null, new a(aVar2, null), 2);
        }
        return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
    }
}
