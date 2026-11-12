package pv1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import jv1.e0;
import kv1.q;
import kv1.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateFitnessPreferences$1", f = "FBTEditPreferencesViewModel.kt", l = {1164, 1170}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f141561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f141562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f141564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pv1.b f141565e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateFitnessPreferences$1$settingsResult$1", f = "FBTEditPreferencesViewModel.kt", l = {1164}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f141568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pv1.b bVar, e0 e0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141567b = bVar;
            this.f141568c = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141567b, this.f141568c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141566a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141567b);
            this.f141566a = 1;
            yVarZ4.getClass();
            Object objJ = f0.J(yVarZ4, new kv1.b0(yVarZ4, this.f141568c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateFitnessPreferences$1$supplementalSportsResult$1", f = "FBTEditPreferencesViewModel.kt", l = {1170}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<tw1.h> f141571c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(pv1.b bVar, List<? extends tw1.h> list, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f141570b = bVar;
            this.f141571c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f141570b, this.f141571c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141569a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            int i15 = pv1.b.f141488i1;
            pv1.b bVar = this.f141570b;
            kv1.b bVarD5 = bVar.d5();
            long j8 = bVar.T;
            List list = this.f141571c;
            if (list == null) {
                list = j0.f134944a;
            }
            this.f141569a = 1;
            bVarD5.getClass();
            Object objJ = f0.J(bVarD5, new q(bVarD5, j8, list, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(pv1.b bVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f141565e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f141565e, dVar);
        jVar.f141564d = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (r6 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r1 == r2) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<tw1.h> list;
        v2 v2Var;
        Object objC;
        Object objC2;
        b0 b0Var = (b0) this.f141564d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141563c;
        pv1.b bVar = this.f141565e;
        v2 v2Var2 = null;
        if (i14 != 0) {
            if (i14 == 1) {
                list = this.f141561a;
                r.b(obj);
                objC = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2 v2Var3 = this.f141562b;
                r.b(obj);
                v2Var = v2Var3;
                objC2 = obj;
            }
            v2Var2 = (v2) objC2;
            if (v2Var instanceof v2.a) {
                int i15 = pv1.b.f141488i1;
                bVar.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error updating adaptive coach plan settings ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "EventBaseViewModel", strD);
            } else if (v2Var2 instanceof v2.a) {
                int i16 = pv1.b.f141488i1;
                bVar.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error updating supplemental sports ");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "EventBaseViewModel", strD2);
            } else {
                int i17 = pv1.b.f141488i1;
                bVar.h5().j(g3.a.e(g3.f35298f));
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        int i18 = pv1.b.f141488i1;
        bVar.h5().j(g3.a.c(g3.f35298f));
        mv1.d dVar = (mv1.d) bVar.V0.getValue();
        List<String> list2 = dVar != null ? dVar.f121182a : null;
        list = dVar != null ? dVar.f121183b : null;
        Long userProfilePk = bVar.f141497k0.getUserProfilePk();
        Long l14 = new Long(userProfilePk != null ? userProfilePk.longValue() : pv1.b.Y4(bVar));
        j0 j0Var = j0.f134944a;
        e0 e0Var = new e0(l14, list2, j0Var, j0Var, jv1.a.FITNESS);
        if (list2 == null || list2.isEmpty() || s.g(bVar.U0.f121182a, list2)) {
            v2Var = null;
            if (!s.g(list, bVar.U0.f121183b)) {
                o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(bVar, list, null), 3);
                this.f141564d = b0Var;
                this.f141561a = null;
                this.f141562b = v2Var;
                this.f141563c = 2;
                objC2 = j0VarJ.C(this);
            }
            if (v2Var instanceof v2.a) {
                int i19 = pv1.b.f141488i1;
                bVar.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error updating adaptive coach plan settings ");
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var3, "EventBaseViewModel", strD3);
            } else if (v2Var2 instanceof v2.a) {
                int i110 = pv1.b.f141488i1;
                bVar.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error updating supplemental sports ");
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var4, "EventBaseViewModel", strD4);
            } else {
                int i111 = pv1.b.f141488i1;
                bVar.h5().j(g3.a.e(g3.f35298f));
            }
            return Unit.INSTANCE;
        }
        o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(bVar, e0Var, null), 3);
        this.f141564d = b0Var;
        this.f141561a = list;
        this.f141563c = 1;
        objC = j0VarJ2.C(this);
        return aVar;
        v2Var = (v2) objC;
        if (!s.g(list, bVar.U0.f121183b)) {
            o53.j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new b(bVar, list, null), 3);
            this.f141564d = b0Var;
            this.f141561a = null;
            this.f141562b = v2Var;
            this.f141563c = 2;
            objC2 = j0VarJ3.C(this);
        }
        if (v2Var instanceof v2.a) {
            int i112 = pv1.b.f141488i1;
            bVar.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            String strD5 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error updating adaptive coach plan settings ");
            i2.a aVar6 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var5, "EventBaseViewModel", strD5);
        } else if (v2Var2 instanceof v2.a) {
            int i113 = pv1.b.f141488i1;
            bVar.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            String strD6 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error updating supplemental sports ");
            i2.a aVar7 = i2.f36769a;
            a2 a2Var6 = a2.GENERAL;
            aVar7.getClass();
            i2.a.f(a2Var6, "EventBaseViewModel", strD6);
        } else {
            int i114 = pv1.b.f141488i1;
            bVar.h5().j(g3.a.e(g3.f35298f));
        }
        return Unit.INSTANCE;
    }
}
