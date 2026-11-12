package pv1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import jv1.e0;
import kv1.y;
import o13.r;
import o53.b0;
import o53.j0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getFitnessPreferences$1", f = "FBTEditPreferencesViewModel.kt", l = {1095, 1096}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f141506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f141507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f141508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv1.b f141509d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getFitnessPreferences$1$fbtPlanResult$1", f = "FBTEditPreferencesViewModel.kt", l = {1096}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends tw1.m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pv1.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141511b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141511b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends tw1.m>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141510a;
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
            pv1.b bVar = this.f141511b;
            kv1.b bVarD5 = bVar.d5();
            long j8 = bVar.T;
            this.f141510a = 1;
            Object objC = bVarD5.c(j8, this);
            return objC == aVar ? aVar : objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljv1/e0;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getFitnessPreferences$1$userSettingsResult$1", f = "FBTEditPreferencesViewModel.kt", l = {1095}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends e0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141513b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pv1.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f141513b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f141513b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends e0>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141512a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141513b);
            this.f141512a = 1;
            Object objA = yVarZ4.a(this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pv1.b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f141509d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f141509d, dVar);
        eVar.f141508c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00be  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        v2 v2Var2;
        b0 b0Var = (b0) this.f141508c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141507b;
        pv1.b bVar = this.f141509d;
        if (i14 == 0) {
            r.b(obj);
            bVar.L0.k(null, Boolean.TRUE);
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(bVar, null), 3);
            this.f141508c = b0Var;
            this.f141507b = 1;
            obj = j0VarJ.C(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f141506a;
            r.b(obj);
        }
        v2Var2 = (v2) obj;
        if ((v2Var instanceof v2.b) || !(v2Var2 instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                String strH = f3.h(((v2.a) v2Var).f47383a, "Error getting user settings: ", StringUtils.SPACE);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "EventBaseViewModel", strH);
            } else if (v2Var2 instanceof v2.a) {
                String strH2 = f3.h(((v2.a) v2Var2).f47383a, "Error getting training plan: ", StringUtils.SPACE);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "EventBaseViewModel", strH2);
            }
            bVar.L0.k(null, Boolean.FALSE);
        } else {
            e0 e0Var = (e0) ((v2.b) v2Var).f47386a;
            bVar.getClass();
            e0Var.getClass();
            bVar.f141497k0 = e0Var;
            tu1.i.a aVar4 = tu1.i.f166483a;
            List<String> listB = e0Var.b();
            aVar4.getClass();
            mv1.d dVar = new mv1.d(tu1.i.a.l(listB), ((tw1.m) ((v2.b) v2Var2).f47386a).s());
            bVar.U0 = dVar;
            bVar.V0.k(null, dVar);
            bVar.L0.k(null, Boolean.FALSE);
        }
        return Unit.INSTANCE;
        v2 v2Var3 = (v2) obj;
        j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(bVar, null), 3);
        this.f141508c = b0Var;
        this.f141506a = v2Var3;
        this.f141507b = 2;
        Object objC = j0VarJ2.C(this);
        if (objC != aVar) {
            v2Var = v2Var3;
            obj = objC;
            v2Var2 = (v2) obj;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    String strH3 = f3.h(((v2.a) v2Var).f47383a, "Error getting user settings: ", StringUtils.SPACE);
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var3, "EventBaseViewModel", strH3);
                } else if (v2Var2 instanceof v2.a) {
                    String strH4 = f3.h(((v2.a) v2Var2).f47383a, "Error getting training plan: ", StringUtils.SPACE);
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var4, "EventBaseViewModel", strH4);
                }
                bVar.L0.k(null, Boolean.FALSE);
            } else {
                if (v2Var instanceof v2.a) {
                    String strH5 = f3.h(((v2.a) v2Var).f47383a, "Error getting user settings: ", StringUtils.SPACE);
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.f(a2Var5, "EventBaseViewModel", strH5);
                } else if (v2Var2 instanceof v2.a) {
                    String strH6 = f3.h(((v2.a) v2Var2).f47383a, "Error getting training plan: ", StringUtils.SPACE);
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.f(a2Var6, "EventBaseViewModel", strH6);
                }
                bVar.L0.k(null, Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
