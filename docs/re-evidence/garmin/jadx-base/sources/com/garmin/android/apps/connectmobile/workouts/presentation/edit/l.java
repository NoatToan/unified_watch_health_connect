package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import am.e1;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.s0;
import c2.x2;
import ew1.c2;
import f5.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.k2;
import l72.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c1;
import p13.m0;
import p13.n0;
import p13.t0;
import p13.u0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B×\u0001\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u0004\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00040\u0006\u0012\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00040\u0006\u0012$\u0010\f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\t\u0012$\u0010\r\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\t\u0012$\u0010\u000e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0015²\u0006\u0014\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/l;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/p;", "Lkotlin/Function0;", "promoCard", "", "headers", "footers", "Lkotlin/Function1;", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "stepComposable", "repeatStartComposable", "repeatEndComposable", "<init>", "(Le23/a;Ljava/util/List;Ljava/util/List;Le23/l;Le23/l;Le23/l;)V", "draggingNode", "", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h;", "lastStepItemKeys", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> f49033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<e23.a<r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> f49034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e23.a<r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> f49035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> f49036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> f49037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> f49038f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutCreateEditMainContentComposable$Item$1$1", f = "WorkoutCreateEditMainContentComposable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> f49039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f49040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.p f49041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q f49042d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x3<? extends l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> x3Var, View view2, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f49039a = x3Var;
            this.f49040b = view2;
            this.f49041c = pVar;
            this.f49042d = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f49039a, this.f49040b, this.f49041c, this.f49042d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f182175a = this.f49039a.getF182175a();
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar = this.f49041c;
            if (f182175a != null) {
                s0.l(25, this.f49040b);
                pVar.T(f182175a.getPath());
            } else {
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = this.f49042d;
                pVar.y3(qVar.f49267w, qVar.f49245a, qVar.f49250f);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutCreateEditMainContentComposable$Item$2$1", f = "WorkoutCreateEditMainContentComposable.kt", l = {115}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set<com.garmin.android.apps.connectmobile.workouts.presentation.edit.h> f49044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w02.r f49045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Map<com.garmin.android.apps.connectmobile.workouts.presentation.edit.h, Integer> f49046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Set<com.garmin.android.apps.connectmobile.workouts.presentation.edit.h>> f49047e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Set<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.h> set, w02.r rVar, Map<com.garmin.android.apps.connectmobile.workouts.presentation.edit.h, Integer> map, p1<Set<com.garmin.android.apps.connectmobile.workouts.presentation.edit.h>> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f49044b = set;
            this.f49045c = rVar;
            this.f49046d = map;
            this.f49047e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f49044b, this.f49045c, this.f49046d, this.f49047e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49043a;
            Map<com.garmin.android.apps.connectmobile.workouts.presentation.edit.h, Integer> map = this.f49046d;
            if (i14 == 0) {
                o13.r.b(obj);
                Set<com.garmin.android.apps.connectmobile.workouts.presentation.edit.h> set = this.f49044b;
                if (!set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    if (!it.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    int iIntValue = ((Number) u0.c((com.garmin.android.apps.connectmobile.workouts.presentation.edit.h) it.next(), map)).intValue();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Number) u0.c((com.garmin.android.apps.connectmobile.workouts.presentation.edit.h) it.next(), map)).intValue();
                        if (iIntValue < iIntValue2) {
                            iIntValue = iIntValue2;
                        }
                    }
                    e2.i0 i0Var = this.f49045c.f181122a;
                    this.f49043a = 1;
                    if (e2.i0.f(i0Var, iIntValue, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f49047e.setValue(map.keySet());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.q<h4.r, p3.m, Integer, h4.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f49048a = new c();

        @Override // e23.q
        public final h4.r invoke(h4.r rVar, p3.m mVar, Integer num) {
            h4.r rVar2 = rVar;
            p3.m mVar2 = mVar;
            num.intValue();
            rVar2.getClass();
            mVar2.C(-1976821668);
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVar2, j92.b.f97899b.f97918c, 0.0f, 2);
            mVar2.f();
            return rVarA;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.q<h4.r, p3.m, Integer, h4.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w02.g f49049a;

        public d(w02.g gVar) {
            this.f49049a = gVar;
        }

        @Override // e23.q
        public final h4.r invoke(h4.r rVar, p3.m mVar, Integer num) {
            h4.r rVar2 = rVar;
            p3.m mVar2 = mVar;
            num.intValue();
            rVar2.getClass();
            mVar2.C(-1428700925);
            x1 x1Var = p3.n.f135158a;
            h4.r rVarC = e2.d.c(this.f49049a, rVar2);
            mVar2.f();
            return rVarC;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.h f49050a;

        public e(com.garmin.android.apps.connectmobile.workouts.presentation.edit.h hVar) {
            this.f49050a = hVar;
        }

        @Override // e23.l
        public final Boolean invoke(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = aVar;
            aVar2.getClass();
            return Boolean.valueOf(p005kotlin.jvm.internal.s.g(aVar2.getUuid(), this.f49050a.getF48998a()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f49051a = new f();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f49052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f49053b;

        public g(e23.l lVar, List list) {
            this.f49052a = lVar;
            this.f49053b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f49052a.invoke(this.f49053b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f49054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f49055b;

        public h(e23.l lVar, List list) {
            this.f49054a = lVar;
            this.f49055b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f49054a.invoke(this.f49055b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f49056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.p f49057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q f49058c;

        public i(List list, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar) {
            this.f49056a = list;
            this.f49057b = pVar;
            this.f49058c = qVar;
        }

        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                f62.h hVar = (f62.h) this.f49056a.get(iIntValue);
                mVar2.C(-643489459);
                r52.b bVar = (r52.b) hVar.f69247b;
                h4.r rVarC = e2.d.c(dVar2, h4.r.S);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                int iHashCode = Long.hashCode(mVar2.getU());
                i2 i2VarX = mVar2.x();
                h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar);
                } else {
                    mVar2.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar2);
                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                c2.b0 b0Var = c2.b0.f22601a;
                mVar2.C(-1026936178);
                bVar.a(this.f49057b, this.f49058c, mVar2, 0);
                mVar2.f();
                mVar2.y();
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f49059a = new j();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f49060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f49061b;

        public k(e23.l lVar, List list) {
            this.f49060a = lVar;
            this.f49061b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f49060a.invoke(this.f49061b.get(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.l$l, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0960l implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f49062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f49063b;

        public C0960l(e23.l lVar, List list) {
            this.f49062a = lVar;
            this.f49063b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f49062a.invoke(this.f49063b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f49064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.p f49065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q f49066c;

        public m(List list, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar) {
            this.f49064a = list;
            this.f49065b = pVar;
            this.f49066c = qVar;
        }

        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                f62.h hVar = (f62.h) this.f49064a.get(iIntValue);
                mVar2.C(-1734414588);
                r52.b bVar = (r52.b) hVar.f69247b;
                h4.r rVarC = e2.d.c(dVar2, h4.r.S);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                int iHashCode = Long.hashCode(mVar2.getU());
                i2 i2VarX = mVar2.x();
                h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar);
                } else {
                    mVar2.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar2);
                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                c2.b0 b0Var = c2.b0.f22601a;
                mVar2.C(206022519);
                bVar.a(this.f49065b, this.f49066c, mVar2, 0);
                mVar2.f();
                mVar2.y();
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class n implements e23.l<f62.h<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.h, r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f49067a = new n();

        @Override // e23.l
        public final Object invoke(f62.h<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.h, r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> hVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class o implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f49068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f49069b;

        public o(e23.l lVar, List list) {
            this.f49068a = lVar;
            this.f49069b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f49068a.invoke(this.f49069b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class p implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f49070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f49071b;

        public p(e23.l lVar, List list) {
            this.f49070a = lVar;
            this.f49071b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f49070a.invoke(this.f49071b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class q implements e23.r<w02.g, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f49072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q f49073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3 f49074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.p f49075d;

        public q(List list, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, x3 x3Var, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar) {
            this.f49072a = list;
            this.f49073b = qVar;
            this.f49074c = x3Var;
            this.f49075d = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        @Override // e23.r
        public final Unit invoke(w02.g gVar, Integer num, p3.m mVar, Integer num2) {
            w02.g gVar2 = gVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            gVar2.getClass();
            int i14 = (iIntValue2 & 6) == 0 ? (mVar2.B(gVar2) ? 4 : 2) | iIntValue2 : iIntValue2;
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            char c14 = 1;
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                f62.h hVar = (f62.h) this.f49072a.get(iIntValue);
                mVar2.C(1031426758);
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.h hVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.h) hVar.f69246a;
                r52.b bVar = (r52.b) hVar.f69247b;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = this.f49073b;
                l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar.f49250f;
                boolean zR = mVar2.r(hVar2);
                Object objQ = mVar2.q();
                if (zR) {
                    objQ = new e(hVar2);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(hVar2);
                        mVar2.K(objQ);
                    }
                }
                l52.i.a aVarE = l52.o.e(iVar, (e23.l) objQ);
                if (aVarE != null) {
                    boolean z14 = hVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.c;
                    boolean z15 = z14 || (hVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.b);
                    h4.r rVarThen = h4.r.S;
                    int depth = aVarE.getDepth();
                    rVarThen.getClass();
                    for (int i15 = 0; i15 < depth; i15++) {
                        h4.r.a aVar = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        rVarThen = rVarThen.then(h4.k.a(c2.l.A(aVar, j92.b.f97899b.f97918c, 0.0f, 2), k2.f91249a, new w52.s(c14 == true ? 1 : 0)));
                    }
                    h4.r rVarA = v2.a(v2.a(rVarThen, z14 && aVarE.getDepth() == 0, c.f49048a, mVar2, 0), ((l52.i.a) this.f49074c.getF182175a()) != aVarE, new d(gVar2), mVar2, 0);
                    h4.d.f81522a.getClass();
                    h4.g gVar3 = h4.d.a.f81524b;
                    z0 z0VarD = c2.q.d(gVar3, false);
                    x1 x1Var2 = p3.n.f135158a;
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    c2.u uVar = c2.u.f22885a;
                    h4.r rVarB = gVar2.b(gVar2.d(h4.r.S, z15));
                    z0 z0VarD2 = c2.q.d(gVar3, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarB, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, z0VarD2, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    mVar2.C(-1932822898);
                    bVar.a(this.f49075d, qVar, mVar2, 0);
                    mVar2.f();
                    mVar2.y();
                    mVar2.y();
                }
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class r extends p005kotlin.jvm.internal.q implements e23.p<l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f49076a = new r();

        public r() {
            super(2, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b.class, "<init>", "<init>(Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;)V", 0);
        }

        @Override // e23.p
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b invoke(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar3 = bVar;
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b(bVar3, bVar4);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class s extends p005kotlin.jvm.internal.q implements e23.p<l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f49077a = new s();

        public s() {
            super(2, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a.class, "<init>", "<init>(Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;)V", 0);
        }

        @Override // e23.p
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a invoke(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar3 = bVar;
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a(bVar3, bVar4);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class t extends p005kotlin.jvm.internal.q implements e23.p<l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f49078a = new t();

        public t() {
            super(2, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b.class, "<init>", "<init>(Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;)V", 0);
        }

        @Override // e23.p
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b invoke(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar3 = bVar;
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b(bVar3, bVar4);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class u extends p005kotlin.jvm.internal.q implements e23.p<l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.C0955c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f49079a = new u();

        public u() {
            super(2, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.C0955c.class, "<init>", "<init>(Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;)V", 0);
        }

        @Override // e23.p
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.C0955c invoke(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar3 = bVar;
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.C0955c(bVar3, bVar4);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class v extends p005kotlin.jvm.internal.q implements e23.p<l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f49080a = new v();

        public v() {
            super(2, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.d.class, "<init>", "<init>(Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;)V", 0);
        }

        @Override // e23.p
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.d invoke(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar3 = bVar;
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.d(bVar3, bVar4);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class w extends p005kotlin.jvm.internal.q implements e23.p<l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f49081a = new w();

        public w() {
            super(2, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a.class, "<init>", "<init>(Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;Lcom/garmin/android/apps/connectmobile/workouts/data/Tree$NodePath;)V", 0);
        }

        @Override // e23.p
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a invoke(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar3 = bVar;
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a(bVar3, bVar4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> aVar, List<? extends e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> list, List<? extends e23.a<? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> list2, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar2, e23.l<? super l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, ? extends r52.b<? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, ? super com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>> lVar3) {
        list.getClass();
        list2.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        this.f49033a = aVar;
        this.f49034b = list;
        this.f49035c = list2;
        this.f49036d = lVar;
        this.f49037e = lVar2;
        this.f49038f = lVar3;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        Object aVar;
        final x3 x3Var;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar2;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar2;
        Object obj;
        int i16;
        w02.r rVar;
        pVar.getClass();
        qVar.getClass();
        l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar.f49250f;
        o0 o0VarE = mVar.E(-1923897881);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(pVar) : o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        int i17 = i15;
        final int i18 = 1;
        final int i19 = 0;
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int i24 = i17 & 14;
            boolean zR = o0VarE.r(qVar) | (i24 == 4 || ((i17 & 8) != 0 && o0VarE.r(pVar)));
            Object objQ = o0VarE.q();
            int i25 = 10;
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new e11.c0(i25, qVar, pVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e11.c0(i25, qVar, pVar);
                    o0VarE.K(objQ);
                }
            }
            e23.q qVar3 = (e23.q) objQ;
            qVar3.getClass();
            e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            float f14 = 48;
            g6.f.a aVar3 = g6.f.f75994b;
            boolean zB = o0VarE.B(qVar3);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new w02.a0(qVar3, null);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new w02.a0(qVar3, null);
                    o0VarE.K(objQ2);
                }
            }
            w02.r rVarY = w02.b0.y(i0VarA, f14, (e23.r) objQ2, o0VarE, 0);
            boolean zB2 = o0VarE.B(iVar);
            Object objQ3 = o0VarE.q();
            if (zB2) {
                objQ3 = p0.f(new c2(12, qVar, rVarY));
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = p0.f(new c2(12, qVar, rVarY));
                    o0VarE.K(objQ3);
                }
            }
            x3 x3Var2 = (x3) objQ3;
            View view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            l52.i.a aVar4 = (l52.i.a) x3Var2.getF182175a();
            boolean zB3 = o0VarE.B(x3Var2) | o0VarE.r(view2) | (i24 == 4 || ((i17 & 8) != 0 && o0VarE.r(pVar))) | o0VarE.r(qVar);
            Object objQ4 = o0VarE.q();
            if (zB3) {
                aVar = new a(x3Var2, view2, pVar, qVar, null);
                x3Var = x3Var2;
                pVar2 = pVar;
                qVar2 = qVar;
                o0VarE.K(aVar);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    aVar = new a(x3Var2, view2, pVar, qVar, null);
                    x3Var = x3Var2;
                    pVar2 = pVar;
                    qVar2 = qVar;
                    o0VarE.K(aVar);
                } else {
                    qVar2 = qVar;
                    pVar2 = pVar;
                    aVar = objQ4;
                    x3Var = x3Var2;
                }
            }
            l0.e((e23.p) aVar, aVar4, o0VarE);
            boolean zB4 = o0VarE.B((l52.i.a) x3Var.getF182175a()) | o0VarE.B(iVar);
            Object objQ5 = o0VarE.q();
            if (zB4) {
                obj = objQ5;
                final int i26 = 2;
                List listC = l52.w.c(iVar, new e23.p(this) { // from class: f62.t

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.l f69336b;

                    {
                        this.f69336b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p> bVarInvoke;
                        l52.i.a aVar5;
                        List list = (List) obj2;
                        l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar6 = (l52.i.a) obj3;
                        switch (i19) {
                            case 0:
                                list.getClass();
                                aVar6.getClass();
                                l52.i.a aVar7 = (l52.i.a) x3Var.getF182175a();
                                if (aVar7 == null || !aVar7.d(aVar6)) {
                                    list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.c(aVar6.getUuid()), this.f69336b.f49036d.invoke(aVar6)));
                                }
                                break;
                            case 1:
                                list.getClass();
                                aVar6.getClass();
                                x3 x3Var3 = x3Var;
                                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar8 = (l52.i.a) x3Var3.getF182175a();
                                com.garmin.android.apps.connectmobile.workouts.presentation.edit.l lVar = this.f69336b;
                                if (aVar6 != aVar8) {
                                    l52.i.a aVar9 = (l52.i.a) x3Var3.getF182175a();
                                    if (aVar9 == null || !aVar9.d(aVar6)) {
                                        bVarInvoke = lVar.f49037e.invoke(aVar6);
                                    }
                                } else {
                                    bVarInvoke = new r(aVar6, lVar.f49036d);
                                }
                                list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.b(aVar6.getUuid()), bVarInvoke));
                                break;
                            default:
                                list.getClass();
                                aVar6.getClass();
                                x3 x3Var4 = x3Var;
                                if (aVar6 != ((l52.i.a) x3Var4.getF182175a()) && ((aVar5 = (l52.i.a) x3Var4.getF182175a()) == null || !aVar5.d(aVar6))) {
                                    list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.a(aVar6.getUuid()), this.f69336b.f49038f.invoke(aVar6)));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new e23.p(this) { // from class: f62.t

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.l f69336b;

                    {
                        this.f69336b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p> bVarInvoke;
                        l52.i.a aVar5;
                        List list = (List) obj2;
                        l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar6 = (l52.i.a) obj3;
                        switch (i18) {
                            case 0:
                                list.getClass();
                                aVar6.getClass();
                                l52.i.a aVar7 = (l52.i.a) x3Var.getF182175a();
                                if (aVar7 == null || !aVar7.d(aVar6)) {
                                    list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.c(aVar6.getUuid()), this.f69336b.f49036d.invoke(aVar6)));
                                }
                                break;
                            case 1:
                                list.getClass();
                                aVar6.getClass();
                                x3 x3Var3 = x3Var;
                                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar8 = (l52.i.a) x3Var3.getF182175a();
                                com.garmin.android.apps.connectmobile.workouts.presentation.edit.l lVar = this.f69336b;
                                if (aVar6 != aVar8) {
                                    l52.i.a aVar9 = (l52.i.a) x3Var3.getF182175a();
                                    if (aVar9 == null || !aVar9.d(aVar6)) {
                                        bVarInvoke = lVar.f49037e.invoke(aVar6);
                                    }
                                } else {
                                    bVarInvoke = new r(aVar6, lVar.f49036d);
                                }
                                list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.b(aVar6.getUuid()), bVarInvoke));
                                break;
                            default:
                                list.getClass();
                                aVar6.getClass();
                                x3 x3Var4 = x3Var;
                                if (aVar6 != ((l52.i.a) x3Var4.getF182175a()) && ((aVar5 = (l52.i.a) x3Var4.getF182175a()) == null || !aVar5.d(aVar6))) {
                                    list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.a(aVar6.getUuid()), this.f69336b.f49038f.invoke(aVar6)));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new e23.p(this) { // from class: f62.t

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.l f69336b;

                    {
                        this.f69336b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p> bVarInvoke;
                        l52.i.a aVar5;
                        List list = (List) obj2;
                        l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar6 = (l52.i.a) obj3;
                        switch (i26) {
                            case 0:
                                list.getClass();
                                aVar6.getClass();
                                l52.i.a aVar7 = (l52.i.a) x3Var.getF182175a();
                                if (aVar7 == null || !aVar7.d(aVar6)) {
                                    list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.c(aVar6.getUuid()), this.f69336b.f49036d.invoke(aVar6)));
                                }
                                break;
                            case 1:
                                list.getClass();
                                aVar6.getClass();
                                x3 x3Var3 = x3Var;
                                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar8 = (l52.i.a) x3Var3.getF182175a();
                                com.garmin.android.apps.connectmobile.workouts.presentation.edit.l lVar = this.f69336b;
                                if (aVar6 != aVar8) {
                                    l52.i.a aVar9 = (l52.i.a) x3Var3.getF182175a();
                                    if (aVar9 == null || !aVar9.d(aVar6)) {
                                        bVarInvoke = lVar.f49037e.invoke(aVar6);
                                    }
                                } else {
                                    bVarInvoke = new r(aVar6, lVar.f49036d);
                                }
                                list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.b(aVar6.getUuid()), bVarInvoke));
                                break;
                            default:
                                list.getClass();
                                aVar6.getClass();
                                x3 x3Var4 = x3Var;
                                if (aVar6 != ((l52.i.a) x3Var4.getF182175a()) && ((aVar5 = (l52.i.a) x3Var4.getF182175a()) == null || !aVar5.d(aVar6))) {
                                    list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.a(aVar6.getUuid()), this.f69336b.f49038f.invoke(aVar6)));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                f4.s sVar = new f4.s();
                sVar.addAll(listC);
                o0VarE.K(sVar);
                obj = sVar;
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    obj = objQ5;
                    final int i27 = 2;
                    List listC2 = l52.w.c(iVar, new e23.p(this) { // from class: f62.t

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.l f69336b;

                        {
                            this.f69336b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj2, Object obj3) {
                            r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p> bVarInvoke;
                            l52.i.a aVar5;
                            List list = (List) obj2;
                            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar6 = (l52.i.a) obj3;
                            switch (i19) {
                                case 0:
                                    list.getClass();
                                    aVar6.getClass();
                                    l52.i.a aVar7 = (l52.i.a) x3Var.getF182175a();
                                    if (aVar7 == null || !aVar7.d(aVar6)) {
                                        list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.c(aVar6.getUuid()), this.f69336b.f49036d.invoke(aVar6)));
                                    }
                                    break;
                                case 1:
                                    list.getClass();
                                    aVar6.getClass();
                                    x3 x3Var3 = x3Var;
                                    l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar8 = (l52.i.a) x3Var3.getF182175a();
                                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.l lVar = this.f69336b;
                                    if (aVar6 != aVar8) {
                                        l52.i.a aVar9 = (l52.i.a) x3Var3.getF182175a();
                                        if (aVar9 == null || !aVar9.d(aVar6)) {
                                            bVarInvoke = lVar.f49037e.invoke(aVar6);
                                        }
                                    } else {
                                        bVarInvoke = new r(aVar6, lVar.f49036d);
                                    }
                                    list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.b(aVar6.getUuid()), bVarInvoke));
                                    break;
                                default:
                                    list.getClass();
                                    aVar6.getClass();
                                    x3 x3Var4 = x3Var;
                                    if (aVar6 != ((l52.i.a) x3Var4.getF182175a()) && ((aVar5 = (l52.i.a) x3Var4.getF182175a()) == null || !aVar5.d(aVar6))) {
                                        list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.a(aVar6.getUuid()), this.f69336b.f49038f.invoke(aVar6)));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new e23.p(this) { // from class: f62.t

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.l f69336b;

                        {
                            this.f69336b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj2, Object obj3) {
                            r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p> bVarInvoke;
                            l52.i.a aVar5;
                            List list = (List) obj2;
                            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar6 = (l52.i.a) obj3;
                            switch (i18) {
                                case 0:
                                    list.getClass();
                                    aVar6.getClass();
                                    l52.i.a aVar7 = (l52.i.a) x3Var.getF182175a();
                                    if (aVar7 == null || !aVar7.d(aVar6)) {
                                        list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.c(aVar6.getUuid()), this.f69336b.f49036d.invoke(aVar6)));
                                    }
                                    break;
                                case 1:
                                    list.getClass();
                                    aVar6.getClass();
                                    x3 x3Var3 = x3Var;
                                    l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar8 = (l52.i.a) x3Var3.getF182175a();
                                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.l lVar = this.f69336b;
                                    if (aVar6 != aVar8) {
                                        l52.i.a aVar9 = (l52.i.a) x3Var3.getF182175a();
                                        if (aVar9 == null || !aVar9.d(aVar6)) {
                                            bVarInvoke = lVar.f49037e.invoke(aVar6);
                                        }
                                    } else {
                                        bVarInvoke = new r(aVar6, lVar.f49036d);
                                    }
                                    list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.b(aVar6.getUuid()), bVarInvoke));
                                    break;
                                default:
                                    list.getClass();
                                    aVar6.getClass();
                                    x3 x3Var4 = x3Var;
                                    if (aVar6 != ((l52.i.a) x3Var4.getF182175a()) && ((aVar5 = (l52.i.a) x3Var4.getF182175a()) == null || !aVar5.d(aVar6))) {
                                        list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.a(aVar6.getUuid()), this.f69336b.f49038f.invoke(aVar6)));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new e23.p(this) { // from class: f62.t

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.l f69336b;

                        {
                            this.f69336b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj2, Object obj3) {
                            r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p> bVarInvoke;
                            l52.i.a aVar5;
                            List list = (List) obj2;
                            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar6 = (l52.i.a) obj3;
                            switch (i27) {
                                case 0:
                                    list.getClass();
                                    aVar6.getClass();
                                    l52.i.a aVar7 = (l52.i.a) x3Var.getF182175a();
                                    if (aVar7 == null || !aVar7.d(aVar6)) {
                                        list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.c(aVar6.getUuid()), this.f69336b.f49036d.invoke(aVar6)));
                                    }
                                    break;
                                case 1:
                                    list.getClass();
                                    aVar6.getClass();
                                    x3 x3Var3 = x3Var;
                                    l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar8 = (l52.i.a) x3Var3.getF182175a();
                                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.l lVar = this.f69336b;
                                    if (aVar6 != aVar8) {
                                        l52.i.a aVar9 = (l52.i.a) x3Var3.getF182175a();
                                        if (aVar9 == null || !aVar9.d(aVar6)) {
                                            bVarInvoke = lVar.f49037e.invoke(aVar6);
                                        }
                                    } else {
                                        bVarInvoke = new r(aVar6, lVar.f49036d);
                                    }
                                    list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.b(aVar6.getUuid()), bVarInvoke));
                                    break;
                                default:
                                    list.getClass();
                                    aVar6.getClass();
                                    x3 x3Var4 = x3Var;
                                    if (aVar6 != ((l52.i.a) x3Var4.getF182175a()) && ((aVar5 = (l52.i.a) x3Var4.getF182175a()) == null || !aVar5.d(aVar6))) {
                                        list.add(new h(new com.garmin.android.apps.connectmobile.workouts.presentation.edit.h.a(aVar6.getUuid()), this.f69336b.f49038f.invoke(aVar6)));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    f4.s sVar2 = new f4.s();
                    sVar2.addAll(listC2);
                    o0VarE.K(sVar2);
                    obj = sVar2;
                }
            }
            obj = objQ5;
            f4.s sVar3 = (f4.s) obj;
            Object objQ6 = o0VarE.q();
            aVar2.getClass();
            if (objQ6 == p3.m.a.f135155b) {
                i16 = 10;
                ArrayList arrayList = new ArrayList(p13.y.r(sVar3, 10));
                ListIterator listIterator = sVar3.listIterator();
                while (true) {
                    f4.z zVar = (f4.z) listIterator;
                    if (!zVar.hasNext()) {
                        break;
                    } else {
                        arrayList.add((com.garmin.android.apps.connectmobile.workouts.presentation.edit.h) ((f62.h) zVar.next()).f69246a);
                    }
                }
                objQ6 = p0.n(p13.h0.Z0(arrayList));
                o0VarE.K(objQ6);
            } else {
                i16 = 10;
            }
            p1 p1Var = (p1) objQ6;
            n0 n0VarJ1 = p13.h0.j1(sVar3);
            int iA = t0.a(p13.y.r(n0VarJ1, i16));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            Iterator it = n0VarJ1.iterator();
            while (true) {
                p13.o0 o0Var2 = (p13.o0) it;
                if (!o0Var2.f134956a.hasNext()) {
                    break;
                }
                m0 m0Var = (m0) o0Var2.next();
                o13.p pVar3 = new o13.p(((f62.h) m0Var.f134952b).f69246a, Integer.valueOf(m0Var.f134951a));
                linkedHashMap.put(pVar3.f128594a, pVar3.f128595b);
            }
            Set setG = c1.g(linkedHashMap.keySet(), (Set) p1Var.getF182175a());
            boolean zR2 = o0VarE.r(setG) | o0VarE.r(linkedHashMap) | o0VarE.B(rVarY);
            Object objQ7 = o0VarE.q();
            if (zR2 || objQ7 == p3.m.a.f135155b) {
                rVar = rVarY;
                objQ7 = new b(setG, rVar, linkedHashMap, p1Var, null);
                o0VarE.K(objQ7);
            } else {
                rVar = rVarY;
            }
            l0.e((e23.p) objQ7, setG, o0VarE);
            h4.r rVarC = x2.c(h4.r.S, 1.0f);
            boolean zR3 = o0VarE.r(this) | (i24 == 4 || ((i17 & 8) != 0 && o0VarE.r(pVar2))) | o0VarE.r(qVar2) | o0VarE.B(sVar3) | o0VarE.B(x3Var);
            Object objQ8 = o0VarE.q();
            if (zR3 || objQ8 == p3.m.a.f135155b) {
                e1 e1Var = new e1(this, sVar3, pVar2, qVar2, x3Var, 15);
                o0VarE.K(e1Var);
                objQ8 = e1Var;
            }
            o0 o0Var3 = o0VarE;
            w02.m.a(rVarC, rVar, null, null, null, null, false, null, (e23.l) objQ8, o0Var3, 6, 508);
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var3;
        } else {
            o0 o0Var4 = o0VarE;
            o0Var4.e();
            o0Var = o0Var4;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0(this, pVar, qVar, i14, 5);
        }
    }

    public /* synthetic */ l(e23.a aVar, List list, List list2, e23.l lVar, e23.l lVar2, e23.l lVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : aVar, list, list2, lVar, lVar2, lVar3);
    }
}
