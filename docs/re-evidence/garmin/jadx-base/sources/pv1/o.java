package pv1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.LinkedHashSet;
import java.util.List;
import jv1.e0;
import kv1.a0;
import kv1.q;
import kv1.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import tw1.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateTriFBTPreferences$1", f = "FBTEditPreferencesViewModel.kt", l = {982, 988, 994, 1000, 1006, 1012}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jv1.c f141607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jv1.c f141608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hv1.i f141609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f141610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jv1.b f141611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jv1.b f141612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f141613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v2 f141614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v2 f141615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v2 f141616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v2 f141617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v2 f141618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f141619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f141620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pv1.b f141621o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateTriFBTPreferences$1$adaptiveCoachCyclingWorkoutResult$1", f = "FBTEditPreferencesViewModel.kt", l = {994}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ jv1.b f141624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pv1.b bVar, jv1.b bVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141623b = bVar;
            this.f141624c = bVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141623b, this.f141624c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141622a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141623b);
            this.f141622a = 1;
            yVarZ4.getClass();
            Object objJ = f0.J(yVarZ4, new a0(yVarZ4, this.f141624c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateTriFBTPreferences$1$adaptiveCoachPlanSettingsResult$1", f = "FBTEditPreferencesViewModel.kt", l = {982}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f141627c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pv1.b bVar, e0 e0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f141626b = bVar;
            this.f141627c = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f141626b, this.f141627c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141625a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141626b);
            this.f141625a = 1;
            yVarZ4.getClass();
            Object objJ = f0.J(yVarZ4, new kv1.b0(yVarZ4, this.f141627c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateTriFBTPreferences$1$adaptiveCoachRunningWorkoutResult$1", f = "FBTEditPreferencesViewModel.kt", l = {988}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ jv1.b f141630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pv1.b bVar, jv1.b bVar2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f141629b = bVar;
            this.f141630c = bVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f141629b, this.f141630c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141628a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141629b);
            this.f141628a = 1;
            yVarZ4.getClass();
            Object objJ = f0.J(yVarZ4, new a0(yVarZ4, this.f141630c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateTriFBTPreferences$1$supplementSportResult$1", f = "FBTEditPreferencesViewModel.kt", l = {1006}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<tw1.h> f141633c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(pv1.b bVar, List<? extends tw1.h> list, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f141632b = bVar;
            this.f141633c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f141632b, this.f141633c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141631a;
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
            pv1.b bVar = this.f141632b;
            kv1.b bVarD5 = bVar.d5();
            long j8 = bVar.T;
            List list = this.f141633c;
            if (list == null) {
                list = j0.f134944a;
            }
            this.f141631a = 1;
            bVarD5.getClass();
            Object objJ = f0.J(bVarD5, new q(bVarD5, j8, list, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateTriFBTPreferences$1$swimAbilityResult$1", f = "FBTEditPreferencesViewModel.kt", l = {1012}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hv1.i f141636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pv1.b bVar, hv1.i iVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f141635b = bVar;
            this.f141636c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f141635b, this.f141636c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141634a;
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
            pv1.b bVar = this.f141635b;
            kv1.b bVarD5 = bVar.d5();
            long j8 = bVar.T;
            String strName = this.f141636c.name();
            this.f141634a = 1;
            bVarD5.getClass();
            Object objJ = f0.J(bVarD5, new kv1.r(bVarD5, j8, strName, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateTriFBTPreferences$1$targetVersionResult$1$1", f = "FBTEditPreferencesViewModel.kt", l = {1000}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f141639c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(pv1.b bVar, t tVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f141638b = bVar;
            this.f141639c = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f141638b, this.f141639c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141637a;
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
            pv1.b bVar = this.f141638b;
            kv1.b bVarD5 = bVar.d5();
            long j8 = bVar.T;
            this.f141637a = 1;
            bVarD5.getClass();
            Object objJ = f0.J(bVarD5, new kv1.t(bVarD5, j8, this.f141639c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(pv1.b bVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f141621o = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f141621o, dVar);
        oVar.f141620n = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:104:0x024e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0251  */
    /* JADX WARN: Code duplicated, block: B:107:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0256  */
    /* JADX WARN: Code duplicated, block: B:109:0x0259  */
    /* JADX WARN: Code duplicated, block: B:112:0x025d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0264  */
    /* JADX WARN: Code duplicated, block: B:120:0x029d  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:128:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:142:0x032b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0354  */
    /* JADX WARN: Code duplicated, block: B:145:0x0358  */
    /* JADX WARN: Code duplicated, block: B:146:0x0383  */
    /* JADX WARN: Code duplicated, block: B:148:0x0387  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:155:0x040e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0412  */
    /* JADX WARN: Code duplicated, block: B:158:0x043d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0449  */
    /* JADX WARN: Code duplicated, block: B:161:0x044c  */
    /* JADX WARN: Code duplicated, block: B:163:0x044f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0452  */
    /* JADX WARN: Code duplicated, block: B:166:0x0455  */
    /* JADX WARN: Code duplicated, block: B:169:0x0465  */
    /* JADX WARN: Code duplicated, block: B:170:0x0468  */
    /* JADX WARN: Code duplicated, block: B:172:0x046b  */
    /* JADX WARN: Code duplicated, block: B:173:0x046e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0471  */
    /* JADX WARN: Code duplicated, block: B:178:0x0481  */
    /* JADX WARN: Code duplicated, block: B:179:0x0484  */
    /* JADX WARN: Code duplicated, block: B:181:0x0487  */
    /* JADX WARN: Code duplicated, block: B:182:0x048a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0491  */
    /* JADX WARN: Code duplicated, block: B:188:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:189:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:192:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:195:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:199:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:201:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:205:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:208:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:209:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:211:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:217:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:218:0x0500  */
    /* JADX WARN: Code duplicated, block: B:220:0x0503  */
    /* JADX WARN: Code duplicated, block: B:221:0x0506  */
    /* JADX WARN: Code duplicated, block: B:224:0x050d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0511  */
    /* JADX WARN: Code duplicated, block: B:229:0x051d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0525  */
    /* JADX WARN: Code duplicated, block: B:233:0x052b  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0189  */
    /* JADX WARN: Code duplicated, block: B:79:0x01be  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0208  */
    /* JADX WARN: Code duplicated, block: B:93:0x0210  */
    /* JADX WARN: Code duplicated, block: B:94:0x0213  */
    /* JADX WARN: Code duplicated, block: B:96:0x0216  */
    /* JADX WARN: Code duplicated, block: B:99:0x023f  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x028c, code lost:
    
        if (r2 == r9) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02d1, code lost:
    
        if (r4 == r9) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x031a, code lost:
    
        if (r1 == r9) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01fa, code lost:
    
        if (r4 == r9) goto L137;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jv1.b bVar;
        t tVar;
        mv1.b bVar2;
        List<String> list;
        mv1.b bVar3;
        List<String> list2;
        jv1.b bVar4;
        jv1.c cVar;
        jv1.c cVar2;
        hv1.i iVar;
        u13.a aVar;
        t tVar2;
        List<tw1.h> list3;
        v2 v2Var;
        Object objC;
        t tVar3;
        jv1.b bVar5;
        jv1.b bVar6;
        mv1.b bVar7;
        jv1.c cVar3;
        List<tw1.h> list4;
        t tVar4;
        v2 v2Var2;
        v2 v2Var3;
        Object objC2;
        mv1.b bVar8;
        jv1.c cVar4;
        v2 v2Var4;
        v2 v2Var5;
        v2 v2Var6;
        Object objC3;
        t tVar5;
        mv1.b bVar9;
        jv1.c cVar5;
        Object objC4;
        v2 v2Var7;
        v2 v2Var8;
        v2 v2Var9;
        v2 v2Var10;
        jv1.c cVar6;
        mv1.b bVar10;
        List<tw1.h> list5;
        v2 v2Var11;
        v2 v2Var12;
        v2 v2Var13;
        v2 v2Var14;
        Object objC5;
        tw1.h hVar;
        v2 v2Var15;
        mv1.b bVar11;
        hv1.i iVar2;
        Object objC6;
        mv1.b bVar12;
        mv1.b bVar13;
        Enum r14;
        Enum r15;
        mv1.b bVar14;
        Enum r16;
        Enum r17;
        mv1.b bVar15;
        Object obj2;
        Object obj3;
        mv1.b bVar16;
        Object obj4;
        Object obj5;
        mv1.b bVar17;
        Object obj6;
        Object obj7;
        mv1.b bVar18;
        Enum r18;
        Enum r19;
        mv1.b bVar19;
        Object obj8;
        Object obj9;
        tw1.h hVar2;
        LinkedHashSet linkedHashSet;
        List<tw1.h> list6;
        b0 b0Var = (b0) this.f141620n;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141619m;
        pv1.b bVar20 = this.f141621o;
        switch (i14) {
            case 0:
                r.b(obj);
                int i15 = pv1.b.f141488i1;
                bVar20.h5().j(g3.a.c(g3.f35298f));
                mv1.b bVar21 = (mv1.b) bVar20.R0.getValue();
                List<String> list7 = bVar21 != null ? bVar21.f121172a : null;
                List<String> list8 = bVar21 != null ? bVar21.f121173b : null;
                List<String> list9 = bVar21 != null ? bVar21.f121174c : null;
                jv1.c cVar7 = bVar21 != null ? bVar21.f121175d : null;
                jv1.c cVar8 = bVar21 != null ? bVar21.f121176e : null;
                hv1.i iVar3 = bVar21 != null ? bVar21.f121177f : null;
                List<tw1.h> list10 = bVar21 != null ? bVar21.f121178g : null;
                Long userProfilePk = bVar20.f141497k0.getUserProfilePk();
                e0 e0Var = new e0(new Long(userProfilePk != null ? userProfilePk.longValue() : pv1.b.Y4(bVar20)), list7, list8, list9, jv1.a.TRIATHLON);
                bVar = new jv1.b(new Integer(pv1.b.Y4(bVar20)), jv1.a0.RUNNING, cVar7);
                jv1.b bVar22 = new jv1.b(new Integer(pv1.b.Y4(bVar20)), jv1.a0.CYCLING, cVar8);
                if (cVar7 == cVar8) {
                    tVar = cVar7 != null ? tu1.a.z(cVar7) : null;
                } else {
                    fx1.d dVar = fx1.d.GENERIC;
                    tVar = new t(new Integer(dVar.f73838a), dVar.f73839b);
                }
                if (list7 == null || list7.isEmpty() || list8 == null || list8.isEmpty() || list9 == null || list9.isEmpty()) {
                    bVar2 = bVar20.Q0;
                    if (bVar2 != null) {
                        list = bVar2.f121174c;
                    } else {
                        list = null;
                    }
                    if (s.g(list, list9)) {
                        bVar3 = bVar20.Q0;
                        if (bVar3 != null) {
                            list2 = bVar3.f121173b;
                        } else {
                            list2 = null;
                        }
                        if (!s.g(list2, list8)) {
                            bVar4 = bVar22;
                            cVar = cVar7;
                            cVar2 = cVar8;
                            iVar = iVar3;
                            aVar = aVar2;
                            tVar2 = tVar;
                            list3 = list10;
                            v2Var = null;
                        }
                        return aVar;
                    }
                    o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(bVar20, e0Var, null), 3);
                    this.f141620n = b0Var;
                    this.f141607a = cVar7;
                    this.f141608b = cVar8;
                    this.f141609c = iVar3;
                    this.f141610d = list10;
                    this.f141611e = bVar;
                    this.f141612f = bVar22;
                    this.f141613g = tVar;
                    this.f141619m = 1;
                    objC = j0VarJ.C(this);
                    aVar = aVar2;
                    if (objC != aVar) {
                        List<tw1.h> list11 = list10;
                        tVar3 = tVar;
                        list3 = list11;
                        cVar = cVar7;
                        bVar5 = bVar22;
                        cVar2 = cVar8;
                        iVar = iVar3;
                        bVar6 = bVar;
                        bVar = bVar6;
                        bVar4 = bVar5;
                        tVar2 = tVar3;
                        v2Var = (v2) objC;
                    }
                    return aVar;
                }
                mv1.b bVar23 = bVar20.Q0;
                if (s.g(bVar23 != null ? bVar23.f121172a : null, list7)) {
                    bVar2 = bVar20.Q0;
                    if (bVar2 != null) {
                        list = bVar2.f121174c;
                    } else {
                        list = null;
                    }
                    if (s.g(list, list9)) {
                        bVar3 = bVar20.Q0;
                        if (bVar3 != null) {
                            list2 = bVar3.f121173b;
                        } else {
                            list2 = null;
                        }
                        if (!s.g(list2, list8)) {
                            bVar4 = bVar22;
                            cVar = cVar7;
                            cVar2 = cVar8;
                            iVar = iVar3;
                            aVar = aVar2;
                            tVar2 = tVar;
                            list3 = list10;
                            v2Var = null;
                        }
                        return aVar;
                    }
                }
                o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(bVar20, e0Var, null), 3);
                this.f141620n = b0Var;
                this.f141607a = cVar7;
                this.f141608b = cVar8;
                this.f141609c = iVar3;
                this.f141610d = list10;
                this.f141611e = bVar;
                this.f141612f = bVar22;
                this.f141613g = tVar;
                this.f141619m = 1;
                objC = j0VarJ2.C(this);
                aVar = aVar2;
                if (objC != aVar) {
                    List<tw1.h> list12 = list10;
                    tVar3 = tVar;
                    list3 = list12;
                    cVar = cVar7;
                    bVar5 = bVar22;
                    cVar2 = cVar8;
                    iVar = iVar3;
                    bVar6 = bVar;
                    bVar = bVar6;
                    bVar4 = bVar5;
                    tVar2 = tVar3;
                    v2Var = (v2) objC;
                }
                return aVar;
                bVar7 = bVar20.Q0;
                if (bVar7 != null) {
                    cVar3 = bVar7.f121175d;
                } else {
                    cVar3 = null;
                }
                if (cVar != cVar3) {
                    list4 = list3;
                    tVar4 = tVar2;
                    v2Var2 = v2Var;
                    v2Var3 = null;
                    bVar8 = bVar20.Q0;
                    if (bVar8 != null) {
                        cVar4 = bVar8.f121176e;
                    } else {
                        cVar4 = null;
                    }
                    if (cVar2 == cVar4) {
                        o53.j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new a(bVar20, bVar4, null), 3);
                        this.f141620n = b0Var;
                        this.f141607a = cVar;
                        this.f141608b = cVar2;
                        this.f141609c = iVar;
                        this.f141610d = list4;
                        this.f141611e = null;
                        this.f141612f = null;
                        this.f141613g = tVar4;
                        this.f141614h = v2Var2;
                        this.f141615i = v2Var3;
                        this.f141619m = 3;
                        objC3 = j0VarJ3.C(this);
                        if (objC3 != aVar) {
                            tVar5 = tVar4;
                            tVar4 = tVar5;
                            v2Var4 = v2Var2;
                            v2Var5 = v2Var3;
                            v2Var6 = (v2) objC3;
                            bVar9 = bVar20.Q0;
                            if (bVar9 != null) {
                                cVar5 = bVar9.f121175d;
                            } else {
                                cVar5 = null;
                            }
                            if (cVar != cVar5) {
                                if (bVar9 != null) {
                                    cVar6 = bVar9.f121176e;
                                } else {
                                    cVar6 = null;
                                }
                                if (cVar2 != cVar6) {
                                    if (tVar4 != null) {
                                        o53.j0 j0VarJ4 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                                        this.f141620n = b0Var;
                                        this.f141607a = null;
                                        this.f141608b = null;
                                        this.f141609c = iVar;
                                        this.f141610d = list4;
                                        this.f141611e = null;
                                        this.f141612f = null;
                                        this.f141613g = null;
                                        this.f141614h = v2Var4;
                                        this.f141615i = v2Var5;
                                        this.f141616j = v2Var6;
                                        this.f141619m = 4;
                                        objC4 = j0VarJ4.C(this);
                                    }
                                }
                                v2Var7 = v2Var4;
                                v2Var8 = v2Var5;
                                v2Var9 = v2Var6;
                                v2Var10 = null;
                                bVar10 = bVar20.Q0;
                                if (bVar10 != null) {
                                    list5 = bVar10.f121178g;
                                } else {
                                    list5 = null;
                                }
                                if (s.g(list4, list5)) {
                                    v2 v2Var16 = v2Var9;
                                    v2Var11 = v2Var7;
                                    v2Var12 = v2Var10;
                                    v2Var13 = v2Var16;
                                    v2Var14 = null;
                                    if (iVar != null) {
                                        bVar11 = bVar20.Q0;
                                        if (bVar11 != null) {
                                            iVar2 = bVar11.f121177f;
                                        } else {
                                            iVar2 = null;
                                        }
                                        if (iVar != iVar2) {
                                            hVar = null;
                                            o53.j0 j0VarJ5 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                            this.f141620n = b0Var;
                                            this.f141607a = null;
                                            this.f141608b = null;
                                            this.f141609c = null;
                                            this.f141610d = null;
                                            this.f141611e = null;
                                            this.f141612f = null;
                                            this.f141613g = null;
                                            this.f141614h = v2Var11;
                                            this.f141615i = v2Var8;
                                            this.f141616j = v2Var13;
                                            this.f141617k = v2Var12;
                                            this.f141618l = v2Var14;
                                            this.f141619m = 6;
                                            objC6 = j0VarJ5.C(this);
                                            break;
                                        }
                                        if (v2Var11 instanceof v2.a) {
                                            int i16 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                            i2.a aVar3 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar3.getClass();
                                            i2.a.f(a2Var, "EventBaseViewModel", strD);
                                        } else if (v2Var8 instanceof v2.a) {
                                            int i17 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                            i2.a aVar4 = i2.f36769a;
                                            a2 a2Var2 = a2.GENERAL;
                                            aVar4.getClass();
                                            i2.a.f(a2Var2, "EventBaseViewModel", strD2);
                                        } else if (v2Var13 instanceof v2.a) {
                                            int i18 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                            i2.a aVar5 = i2.f36769a;
                                            a2 a2Var3 = a2.GENERAL;
                                            aVar5.getClass();
                                            i2.a.f(a2Var3, "EventBaseViewModel", strD3);
                                        } else if (v2Var12 instanceof v2.a) {
                                            int i19 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                            i2.a aVar6 = i2.f36769a;
                                            a2 a2Var4 = a2.GENERAL;
                                            aVar6.getClass();
                                            i2.a.f(a2Var4, "EventBaseViewModel", strD4);
                                        } else if (v2Var15 instanceof v2.a) {
                                            int i24 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD5 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                            i2.a aVar7 = i2.f36769a;
                                            a2 a2Var5 = a2.GENERAL;
                                            aVar7.getClass();
                                            i2.a.f(a2Var5, "EventBaseViewModel", strD5);
                                        } else if (v2Var14 instanceof v2.a) {
                                            int i25 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD6 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                            i2.a aVar8 = i2.f36769a;
                                            a2 a2Var6 = a2.GENERAL;
                                            aVar8.getClass();
                                            i2.a.f(a2Var6, "EventBaseViewModel", strD6);
                                        } else {
                                            bVar12 = (mv1.b) bVar20.R0.getValue();
                                            bVar13 = bVar20.Q0;
                                            if (bVar13 != null) {
                                                r14 = bVar13.f121175d;
                                            } else {
                                                r14 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r15 = bVar12.f121175d;
                                            } else {
                                                r15 = hVar;
                                            }
                                            if (r14 != r15) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("RunningWorkoutTargetType");
                                            }
                                            bVar14 = bVar20.Q0;
                                            if (bVar14 != null) {
                                                r16 = bVar14.f121176e;
                                            } else {
                                                r16 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r17 = bVar12.f121176e;
                                            } else {
                                                r17 = hVar;
                                            }
                                            if (r16 != r17) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                            }
                                            bVar15 = bVar20.Q0;
                                            if (bVar15 != null) {
                                                obj2 = bVar15.f121172a;
                                            } else {
                                                obj2 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj3 = bVar12.f121172a;
                                            } else {
                                                obj3 = hVar;
                                            }
                                            if (!s.g(obj2, obj3)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("AvailableTrainingDays");
                                            }
                                            bVar16 = bVar20.Q0;
                                            if (bVar16 != null) {
                                                obj4 = bVar16.f121173b;
                                            } else {
                                                obj4 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj5 = bVar12.f121173b;
                                            } else {
                                                obj5 = hVar;
                                            }
                                            if (!s.g(obj4, obj5)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("LongTrainingDays");
                                            }
                                            bVar17 = bVar20.Q0;
                                            if (bVar17 != null) {
                                                obj6 = bVar17.f121174c;
                                            } else {
                                                obj6 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj7 = bVar12.f121174c;
                                            } else {
                                                obj7 = hVar;
                                            }
                                            if (!s.g(obj6, obj7)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("SwimTrainingDays");
                                            }
                                            bVar18 = bVar20.Q0;
                                            if (bVar18 != null) {
                                                r18 = bVar18.f121177f;
                                            } else {
                                                r18 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r19 = bVar12.f121177f;
                                            } else {
                                                r19 = hVar;
                                            }
                                            if (r18 != r19) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("SwimAbility");
                                            }
                                            bVar19 = bVar20.Q0;
                                            if (bVar19 != null) {
                                                obj8 = bVar19.f121178g;
                                            } else {
                                                obj8 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj9 = bVar12.f121178g;
                                            } else {
                                                obj9 = hVar;
                                            }
                                            if (!s.g(obj8, obj9)) {
                                                rt1.l lVar = rt1.l.f154545a;
                                                if (bVar12 != null) {
                                                    hVar2 = hVar;
                                                } else {
                                                    hVar2 = hVar;
                                                }
                                                lVar.getClass();
                                                linkedHashSet = rt1.l.f154547c;
                                                if (hVar2 != null) {
                                                    linkedHashSet.add(hVar2.f166715a);
                                                } else {
                                                    linkedHashSet.add(vt1.h.NONE.f180123d);
                                                }
                                            }
                                            rt1.l lVar2 = rt1.l.f154545a;
                                            vt1.o oVar = bVar20.Y;
                                            lVar2.getClass();
                                            rt1.l.c(oVar);
                                            bVar20.h5().j(g3.a.e(g3.f35298f));
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    hVar = null;
                                    v2Var15 = null;
                                    if (v2Var11 instanceof v2.a) {
                                        int i110 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD7 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar9 = i2.f36769a;
                                        a2 a2Var7 = a2.GENERAL;
                                        aVar9.getClass();
                                        i2.a.f(a2Var7, "EventBaseViewModel", strD7);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i111 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD8 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar10 = i2.f36769a;
                                        a2 a2Var8 = a2.GENERAL;
                                        aVar10.getClass();
                                        i2.a.f(a2Var8, "EventBaseViewModel", strD8);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i112 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD9 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar11 = i2.f36769a;
                                        a2 a2Var9 = a2.GENERAL;
                                        aVar11.getClass();
                                        i2.a.f(a2Var9, "EventBaseViewModel", strD9);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i113 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD10 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar12 = i2.f36769a;
                                        a2 a2Var10 = a2.GENERAL;
                                        aVar12.getClass();
                                        i2.a.f(a2Var10, "EventBaseViewModel", strD10);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i26 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar13 = i2.f36769a;
                                        a2 a2Var11 = a2.GENERAL;
                                        aVar13.getClass();
                                        i2.a.f(a2Var11, "EventBaseViewModel", strD11);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i27 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD12 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar14 = i2.f36769a;
                                        a2 a2Var12 = a2.GENERAL;
                                        aVar14.getClass();
                                        i2.a.f(a2Var12, "EventBaseViewModel", strD12);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar3 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar3.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar4 = rt1.l.f154545a;
                                        vt1.o oVar2 = bVar20.Y;
                                        lVar4.getClass();
                                        rt1.l.c(oVar2);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                o53.j0 j0VarJ6 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                                this.f141620n = b0Var;
                                this.f141607a = null;
                                this.f141608b = null;
                                this.f141609c = iVar;
                                this.f141610d = null;
                                this.f141611e = null;
                                this.f141612f = null;
                                this.f141613g = null;
                                this.f141614h = v2Var7;
                                this.f141615i = v2Var8;
                                this.f141616j = v2Var9;
                                this.f141617k = v2Var10;
                                this.f141619m = 5;
                                objC5 = j0VarJ6.C(this);
                            } else if (tVar4 != null) {
                                o53.j0 j0VarJ7 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                                this.f141620n = b0Var;
                                this.f141607a = null;
                                this.f141608b = null;
                                this.f141609c = iVar;
                                this.f141610d = list4;
                                this.f141611e = null;
                                this.f141612f = null;
                                this.f141613g = null;
                                this.f141614h = v2Var4;
                                this.f141615i = v2Var5;
                                this.f141616j = v2Var6;
                                this.f141619m = 4;
                                objC4 = j0VarJ7.C(this);
                            } else {
                                v2Var7 = v2Var4;
                                v2Var8 = v2Var5;
                                v2Var9 = v2Var6;
                                v2Var10 = null;
                                bVar10 = bVar20.Q0;
                                if (bVar10 != null) {
                                    list5 = bVar10.f121178g;
                                } else {
                                    list5 = null;
                                }
                                if (s.g(list4, list5)) {
                                    v2 v2Var17 = v2Var9;
                                    v2Var11 = v2Var7;
                                    v2Var12 = v2Var10;
                                    v2Var13 = v2Var17;
                                    v2Var14 = null;
                                    if (iVar != null) {
                                        bVar11 = bVar20.Q0;
                                        if (bVar11 != null) {
                                            iVar2 = bVar11.f121177f;
                                        } else {
                                            iVar2 = null;
                                        }
                                        if (iVar != iVar2) {
                                            hVar = null;
                                            o53.j0 j0VarJ8 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                            this.f141620n = b0Var;
                                            this.f141607a = null;
                                            this.f141608b = null;
                                            this.f141609c = null;
                                            this.f141610d = null;
                                            this.f141611e = null;
                                            this.f141612f = null;
                                            this.f141613g = null;
                                            this.f141614h = v2Var11;
                                            this.f141615i = v2Var8;
                                            this.f141616j = v2Var13;
                                            this.f141617k = v2Var12;
                                            this.f141618l = v2Var14;
                                            this.f141619m = 6;
                                            objC6 = j0VarJ8.C(this);
                                            break;
                                        }
                                        if (v2Var11 instanceof v2.a) {
                                            int i114 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD13 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                            i2.a aVar15 = i2.f36769a;
                                            a2 a2Var13 = a2.GENERAL;
                                            aVar15.getClass();
                                            i2.a.f(a2Var13, "EventBaseViewModel", strD13);
                                        } else if (v2Var8 instanceof v2.a) {
                                            int i115 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD14 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                            i2.a aVar16 = i2.f36769a;
                                            a2 a2Var14 = a2.GENERAL;
                                            aVar16.getClass();
                                            i2.a.f(a2Var14, "EventBaseViewModel", strD14);
                                        } else if (v2Var13 instanceof v2.a) {
                                            int i116 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD15 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                            i2.a aVar17 = i2.f36769a;
                                            a2 a2Var15 = a2.GENERAL;
                                            aVar17.getClass();
                                            i2.a.f(a2Var15, "EventBaseViewModel", strD15);
                                        } else if (v2Var12 instanceof v2.a) {
                                            int i117 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD16 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                            i2.a aVar18 = i2.f36769a;
                                            a2 a2Var16 = a2.GENERAL;
                                            aVar18.getClass();
                                            i2.a.f(a2Var16, "EventBaseViewModel", strD16);
                                        } else if (v2Var15 instanceof v2.a) {
                                            int i28 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD17 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                            i2.a aVar19 = i2.f36769a;
                                            a2 a2Var17 = a2.GENERAL;
                                            aVar19.getClass();
                                            i2.a.f(a2Var17, "EventBaseViewModel", strD17);
                                        } else if (v2Var14 instanceof v2.a) {
                                            int i29 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD18 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                            i2.a aVar110 = i2.f36769a;
                                            a2 a2Var18 = a2.GENERAL;
                                            aVar110.getClass();
                                            i2.a.f(a2Var18, "EventBaseViewModel", strD18);
                                        } else {
                                            bVar12 = (mv1.b) bVar20.R0.getValue();
                                            bVar13 = bVar20.Q0;
                                            if (bVar13 != null) {
                                                r14 = bVar13.f121175d;
                                            } else {
                                                r14 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r15 = bVar12.f121175d;
                                            } else {
                                                r15 = hVar;
                                            }
                                            if (r14 != r15) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("RunningWorkoutTargetType");
                                            }
                                            bVar14 = bVar20.Q0;
                                            if (bVar14 != null) {
                                                r16 = bVar14.f121176e;
                                            } else {
                                                r16 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r17 = bVar12.f121176e;
                                            } else {
                                                r17 = hVar;
                                            }
                                            if (r16 != r17) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                            }
                                            bVar15 = bVar20.Q0;
                                            if (bVar15 != null) {
                                                obj2 = bVar15.f121172a;
                                            } else {
                                                obj2 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj3 = bVar12.f121172a;
                                            } else {
                                                obj3 = hVar;
                                            }
                                            if (!s.g(obj2, obj3)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("AvailableTrainingDays");
                                            }
                                            bVar16 = bVar20.Q0;
                                            if (bVar16 != null) {
                                                obj4 = bVar16.f121173b;
                                            } else {
                                                obj4 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj5 = bVar12.f121173b;
                                            } else {
                                                obj5 = hVar;
                                            }
                                            if (!s.g(obj4, obj5)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("LongTrainingDays");
                                            }
                                            bVar17 = bVar20.Q0;
                                            if (bVar17 != null) {
                                                obj6 = bVar17.f121174c;
                                            } else {
                                                obj6 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj7 = bVar12.f121174c;
                                            } else {
                                                obj7 = hVar;
                                            }
                                            if (!s.g(obj6, obj7)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("SwimTrainingDays");
                                            }
                                            bVar18 = bVar20.Q0;
                                            if (bVar18 != null) {
                                                r18 = bVar18.f121177f;
                                            } else {
                                                r18 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r19 = bVar12.f121177f;
                                            } else {
                                                r19 = hVar;
                                            }
                                            if (r18 != r19) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("SwimAbility");
                                            }
                                            bVar19 = bVar20.Q0;
                                            if (bVar19 != null) {
                                                obj8 = bVar19.f121178g;
                                            } else {
                                                obj8 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj9 = bVar12.f121178g;
                                            } else {
                                                obj9 = hVar;
                                            }
                                            if (!s.g(obj8, obj9)) {
                                                rt1.l lVar5 = rt1.l.f154545a;
                                                if (bVar12 != null || (list6 = bVar12.f121178g) == null) {
                                                    hVar2 = hVar;
                                                } else {
                                                    hVar2 = (tw1.h) h0.d0(list6);
                                                }
                                                lVar5.getClass();
                                                linkedHashSet = rt1.l.f154547c;
                                                if (hVar2 != null) {
                                                    linkedHashSet.add(hVar2.f166715a);
                                                } else {
                                                    linkedHashSet.add(vt1.h.NONE.f180123d);
                                                }
                                            }
                                            rt1.l lVar6 = rt1.l.f154545a;
                                            vt1.o oVar3 = bVar20.Y;
                                            lVar6.getClass();
                                            rt1.l.c(oVar3);
                                            bVar20.h5().j(g3.a.e(g3.f35298f));
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    hVar = null;
                                    v2Var15 = null;
                                    if (v2Var11 instanceof v2.a) {
                                        int i118 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD19 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar111 = i2.f36769a;
                                        a2 a2Var19 = a2.GENERAL;
                                        aVar111.getClass();
                                        i2.a.f(a2Var19, "EventBaseViewModel", strD19);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i119 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar112 = i2.f36769a;
                                        a2 a2Var110 = a2.GENERAL;
                                        aVar112.getClass();
                                        i2.a.f(a2Var110, "EventBaseViewModel", strD110);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i1110 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar113 = i2.f36769a;
                                        a2 a2Var111 = a2.GENERAL;
                                        aVar113.getClass();
                                        i2.a.f(a2Var111, "EventBaseViewModel", strD111);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i1111 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar114 = i2.f36769a;
                                        a2 a2Var112 = a2.GENERAL;
                                        aVar114.getClass();
                                        i2.a.f(a2Var112, "EventBaseViewModel", strD112);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i210 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar115 = i2.f36769a;
                                        a2 a2Var113 = a2.GENERAL;
                                        aVar115.getClass();
                                        i2.a.f(a2Var113, "EventBaseViewModel", strD113);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i211 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar116 = i2.f36769a;
                                        a2 a2Var114 = a2.GENERAL;
                                        aVar116.getClass();
                                        i2.a.f(a2Var114, "EventBaseViewModel", strD114);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar7 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar7.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar8 = rt1.l.f154545a;
                                        vt1.o oVar4 = bVar20.Y;
                                        lVar8.getClass();
                                        rt1.l.c(oVar4);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                o53.j0 j0VarJ9 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                                this.f141620n = b0Var;
                                this.f141607a = null;
                                this.f141608b = null;
                                this.f141609c = iVar;
                                this.f141610d = null;
                                this.f141611e = null;
                                this.f141612f = null;
                                this.f141613g = null;
                                this.f141614h = v2Var7;
                                this.f141615i = v2Var8;
                                this.f141616j = v2Var9;
                                this.f141617k = v2Var10;
                                this.f141619m = 5;
                                objC5 = j0VarJ9.C(this);
                            }
                        }
                    } else {
                        v2Var4 = v2Var2;
                        v2Var5 = v2Var3;
                        v2Var6 = null;
                        bVar9 = bVar20.Q0;
                        if (bVar9 != null) {
                            cVar5 = bVar9.f121175d;
                        } else {
                            cVar5 = null;
                        }
                        if (cVar != cVar5) {
                            if (bVar9 != null) {
                                cVar6 = bVar9.f121176e;
                            } else {
                                cVar6 = null;
                            }
                            if (cVar2 != cVar6) {
                                if (tVar4 != null) {
                                    o53.j0 j0VarJ10 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                                    this.f141620n = b0Var;
                                    this.f141607a = null;
                                    this.f141608b = null;
                                    this.f141609c = iVar;
                                    this.f141610d = list4;
                                    this.f141611e = null;
                                    this.f141612f = null;
                                    this.f141613g = null;
                                    this.f141614h = v2Var4;
                                    this.f141615i = v2Var5;
                                    this.f141616j = v2Var6;
                                    this.f141619m = 4;
                                    objC4 = j0VarJ10.C(this);
                                }
                            }
                            v2Var7 = v2Var4;
                            v2Var8 = v2Var5;
                            v2Var9 = v2Var6;
                            v2Var10 = null;
                            bVar10 = bVar20.Q0;
                            if (bVar10 != null) {
                                list5 = bVar10.f121178g;
                            } else {
                                list5 = null;
                            }
                            if (s.g(list4, list5)) {
                                v2 v2Var18 = v2Var9;
                                v2Var11 = v2Var7;
                                v2Var12 = v2Var10;
                                v2Var13 = v2Var18;
                                v2Var14 = null;
                                if (iVar != null) {
                                    bVar11 = bVar20.Q0;
                                    if (bVar11 != null) {
                                        iVar2 = bVar11.f121177f;
                                    } else {
                                        iVar2 = null;
                                    }
                                    if (iVar != iVar2) {
                                        hVar = null;
                                        o53.j0 j0VarJ11 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                        this.f141620n = b0Var;
                                        this.f141607a = null;
                                        this.f141608b = null;
                                        this.f141609c = null;
                                        this.f141610d = null;
                                        this.f141611e = null;
                                        this.f141612f = null;
                                        this.f141613g = null;
                                        this.f141614h = v2Var11;
                                        this.f141615i = v2Var8;
                                        this.f141616j = v2Var13;
                                        this.f141617k = v2Var12;
                                        this.f141618l = v2Var14;
                                        this.f141619m = 6;
                                        objC6 = j0VarJ11.C(this);
                                        break;
                                    }
                                    if (v2Var11 instanceof v2.a) {
                                        int i1112 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar117 = i2.f36769a;
                                        a2 a2Var115 = a2.GENERAL;
                                        aVar117.getClass();
                                        i2.a.f(a2Var115, "EventBaseViewModel", strD115);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i1113 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar118 = i2.f36769a;
                                        a2 a2Var116 = a2.GENERAL;
                                        aVar118.getClass();
                                        i2.a.f(a2Var116, "EventBaseViewModel", strD116);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i1114 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar119 = i2.f36769a;
                                        a2 a2Var117 = a2.GENERAL;
                                        aVar119.getClass();
                                        i2.a.f(a2Var117, "EventBaseViewModel", strD117);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i1115 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar1110 = i2.f36769a;
                                        a2 a2Var118 = a2.GENERAL;
                                        aVar1110.getClass();
                                        i2.a.f(a2Var118, "EventBaseViewModel", strD118);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i212 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar1111 = i2.f36769a;
                                        a2 a2Var119 = a2.GENERAL;
                                        aVar1111.getClass();
                                        i2.a.f(a2Var119, "EventBaseViewModel", strD119);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i213 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar1112 = i2.f36769a;
                                        a2 a2Var1110 = a2.GENERAL;
                                        aVar1112.getClass();
                                        i2.a.f(a2Var1110, "EventBaseViewModel", strD1110);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar9 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar9.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar10 = rt1.l.f154545a;
                                        vt1.o oVar5 = bVar20.Y;
                                        lVar10.getClass();
                                        rt1.l.c(oVar5);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                hVar = null;
                                v2Var15 = null;
                                if (v2Var11 instanceof v2.a) {
                                    int i1116 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar1113 = i2.f36769a;
                                    a2 a2Var1111 = a2.GENERAL;
                                    aVar1113.getClass();
                                    i2.a.f(a2Var1111, "EventBaseViewModel", strD1111);
                                } else if (v2Var8 instanceof v2.a) {
                                    int i1117 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                    i2.a aVar1114 = i2.f36769a;
                                    a2 a2Var1112 = a2.GENERAL;
                                    aVar1114.getClass();
                                    i2.a.f(a2Var1112, "EventBaseViewModel", strD1112);
                                } else if (v2Var13 instanceof v2.a) {
                                    int i1118 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                    i2.a aVar1115 = i2.f36769a;
                                    a2 a2Var1113 = a2.GENERAL;
                                    aVar1115.getClass();
                                    i2.a.f(a2Var1113, "EventBaseViewModel", strD1113);
                                } else if (v2Var12 instanceof v2.a) {
                                    int i1119 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                    i2.a aVar1116 = i2.f36769a;
                                    a2 a2Var1114 = a2.GENERAL;
                                    aVar1116.getClass();
                                    i2.a.f(a2Var1114, "EventBaseViewModel", strD1114);
                                } else if (v2Var15 instanceof v2.a) {
                                    int i214 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar1117 = i2.f36769a;
                                    a2 a2Var1115 = a2.GENERAL;
                                    aVar1117.getClass();
                                    i2.a.f(a2Var1115, "EventBaseViewModel", strD1115);
                                } else if (v2Var14 instanceof v2.a) {
                                    int i215 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                    i2.a aVar1118 = i2.f36769a;
                                    a2 a2Var1116 = a2.GENERAL;
                                    aVar1118.getClass();
                                    i2.a.f(a2Var1116, "EventBaseViewModel", strD1116);
                                } else {
                                    bVar12 = (mv1.b) bVar20.R0.getValue();
                                    bVar13 = bVar20.Q0;
                                    if (bVar13 != null) {
                                        r14 = bVar13.f121175d;
                                    } else {
                                        r14 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r15 = bVar12.f121175d;
                                    } else {
                                        r15 = hVar;
                                    }
                                    if (r14 != r15) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                                    }
                                    bVar14 = bVar20.Q0;
                                    if (bVar14 != null) {
                                        r16 = bVar14.f121176e;
                                    } else {
                                        r16 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r17 = bVar12.f121176e;
                                    } else {
                                        r17 = hVar;
                                    }
                                    if (r16 != r17) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                    }
                                    bVar15 = bVar20.Q0;
                                    if (bVar15 != null) {
                                        obj2 = bVar15.f121172a;
                                    } else {
                                        obj2 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj3 = bVar12.f121172a;
                                    } else {
                                        obj3 = hVar;
                                    }
                                    if (!s.g(obj2, obj3)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("AvailableTrainingDays");
                                    }
                                    bVar16 = bVar20.Q0;
                                    if (bVar16 != null) {
                                        obj4 = bVar16.f121173b;
                                    } else {
                                        obj4 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj5 = bVar12.f121173b;
                                    } else {
                                        obj5 = hVar;
                                    }
                                    if (!s.g(obj4, obj5)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("LongTrainingDays");
                                    }
                                    bVar17 = bVar20.Q0;
                                    if (bVar17 != null) {
                                        obj6 = bVar17.f121174c;
                                    } else {
                                        obj6 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj7 = bVar12.f121174c;
                                    } else {
                                        obj7 = hVar;
                                    }
                                    if (!s.g(obj6, obj7)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimTrainingDays");
                                    }
                                    bVar18 = bVar20.Q0;
                                    if (bVar18 != null) {
                                        r18 = bVar18.f121177f;
                                    } else {
                                        r18 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r19 = bVar12.f121177f;
                                    } else {
                                        r19 = hVar;
                                    }
                                    if (r18 != r19) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimAbility");
                                    }
                                    bVar19 = bVar20.Q0;
                                    if (bVar19 != null) {
                                        obj8 = bVar19.f121178g;
                                    } else {
                                        obj8 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj9 = bVar12.f121178g;
                                    } else {
                                        obj9 = hVar;
                                    }
                                    if (!s.g(obj8, obj9)) {
                                        rt1.l lVar11 = rt1.l.f154545a;
                                        if (bVar12 != null) {
                                            hVar2 = hVar;
                                        } else {
                                            hVar2 = hVar;
                                        }
                                        lVar11.getClass();
                                        linkedHashSet = rt1.l.f154547c;
                                        if (hVar2 != null) {
                                            linkedHashSet.add(hVar2.f166715a);
                                        } else {
                                            linkedHashSet.add(vt1.h.NONE.f180123d);
                                        }
                                    }
                                    rt1.l lVar12 = rt1.l.f154545a;
                                    vt1.o oVar6 = bVar20.Y;
                                    lVar12.getClass();
                                    rt1.l.c(oVar6);
                                    bVar20.h5().j(g3.a.e(g3.f35298f));
                                }
                                return Unit.INSTANCE;
                            }
                            o53.j0 j0VarJ12 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = null;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var7;
                            this.f141615i = v2Var8;
                            this.f141616j = v2Var9;
                            this.f141617k = v2Var10;
                            this.f141619m = 5;
                            objC5 = j0VarJ12.C(this);
                        } else if (tVar4 != null) {
                            o53.j0 j0VarJ13 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = list4;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var4;
                            this.f141615i = v2Var5;
                            this.f141616j = v2Var6;
                            this.f141619m = 4;
                            objC4 = j0VarJ13.C(this);
                        } else {
                            v2Var7 = v2Var4;
                            v2Var8 = v2Var5;
                            v2Var9 = v2Var6;
                            v2Var10 = null;
                            bVar10 = bVar20.Q0;
                            if (bVar10 != null) {
                                list5 = bVar10.f121178g;
                            } else {
                                list5 = null;
                            }
                            if (s.g(list4, list5)) {
                                v2 v2Var19 = v2Var9;
                                v2Var11 = v2Var7;
                                v2Var12 = v2Var10;
                                v2Var13 = v2Var19;
                                v2Var14 = null;
                                if (iVar != null) {
                                    bVar11 = bVar20.Q0;
                                    if (bVar11 != null) {
                                        iVar2 = bVar11.f121177f;
                                    } else {
                                        iVar2 = null;
                                    }
                                    if (iVar != iVar2) {
                                        hVar = null;
                                        o53.j0 j0VarJ14 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                        this.f141620n = b0Var;
                                        this.f141607a = null;
                                        this.f141608b = null;
                                        this.f141609c = null;
                                        this.f141610d = null;
                                        this.f141611e = null;
                                        this.f141612f = null;
                                        this.f141613g = null;
                                        this.f141614h = v2Var11;
                                        this.f141615i = v2Var8;
                                        this.f141616j = v2Var13;
                                        this.f141617k = v2Var12;
                                        this.f141618l = v2Var14;
                                        this.f141619m = 6;
                                        objC6 = j0VarJ14.C(this);
                                        break;
                                    }
                                    if (v2Var11 instanceof v2.a) {
                                        int i11110 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar1119 = i2.f36769a;
                                        a2 a2Var1117 = a2.GENERAL;
                                        aVar1119.getClass();
                                        i2.a.f(a2Var1117, "EventBaseViewModel", strD1117);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i11111 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar11110 = i2.f36769a;
                                        a2 a2Var1118 = a2.GENERAL;
                                        aVar11110.getClass();
                                        i2.a.f(a2Var1118, "EventBaseViewModel", strD1118);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i11112 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar11111 = i2.f36769a;
                                        a2 a2Var1119 = a2.GENERAL;
                                        aVar11111.getClass();
                                        i2.a.f(a2Var1119, "EventBaseViewModel", strD1119);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i11113 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar11112 = i2.f36769a;
                                        a2 a2Var11110 = a2.GENERAL;
                                        aVar11112.getClass();
                                        i2.a.f(a2Var11110, "EventBaseViewModel", strD11110);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i216 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar11113 = i2.f36769a;
                                        a2 a2Var11111 = a2.GENERAL;
                                        aVar11113.getClass();
                                        i2.a.f(a2Var11111, "EventBaseViewModel", strD11111);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i217 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar11114 = i2.f36769a;
                                        a2 a2Var11112 = a2.GENERAL;
                                        aVar11114.getClass();
                                        i2.a.f(a2Var11112, "EventBaseViewModel", strD11112);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar13 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar13.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar14 = rt1.l.f154545a;
                                        vt1.o oVar7 = bVar20.Y;
                                        lVar14.getClass();
                                        rt1.l.c(oVar7);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                hVar = null;
                                v2Var15 = null;
                                if (v2Var11 instanceof v2.a) {
                                    int i11114 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar11115 = i2.f36769a;
                                    a2 a2Var11113 = a2.GENERAL;
                                    aVar11115.getClass();
                                    i2.a.f(a2Var11113, "EventBaseViewModel", strD11113);
                                } else if (v2Var8 instanceof v2.a) {
                                    int i11115 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                    i2.a aVar11116 = i2.f36769a;
                                    a2 a2Var11114 = a2.GENERAL;
                                    aVar11116.getClass();
                                    i2.a.f(a2Var11114, "EventBaseViewModel", strD11114);
                                } else if (v2Var13 instanceof v2.a) {
                                    int i11116 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                    i2.a aVar11117 = i2.f36769a;
                                    a2 a2Var11115 = a2.GENERAL;
                                    aVar11117.getClass();
                                    i2.a.f(a2Var11115, "EventBaseViewModel", strD11115);
                                } else if (v2Var12 instanceof v2.a) {
                                    int i11117 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                    i2.a aVar11118 = i2.f36769a;
                                    a2 a2Var11116 = a2.GENERAL;
                                    aVar11118.getClass();
                                    i2.a.f(a2Var11116, "EventBaseViewModel", strD11116);
                                } else if (v2Var15 instanceof v2.a) {
                                    int i218 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar11119 = i2.f36769a;
                                    a2 a2Var11117 = a2.GENERAL;
                                    aVar11119.getClass();
                                    i2.a.f(a2Var11117, "EventBaseViewModel", strD11117);
                                } else if (v2Var14 instanceof v2.a) {
                                    int i219 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                    i2.a aVar111110 = i2.f36769a;
                                    a2 a2Var11118 = a2.GENERAL;
                                    aVar111110.getClass();
                                    i2.a.f(a2Var11118, "EventBaseViewModel", strD11118);
                                } else {
                                    bVar12 = (mv1.b) bVar20.R0.getValue();
                                    bVar13 = bVar20.Q0;
                                    if (bVar13 != null) {
                                        r14 = bVar13.f121175d;
                                    } else {
                                        r14 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r15 = bVar12.f121175d;
                                    } else {
                                        r15 = hVar;
                                    }
                                    if (r14 != r15) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                                    }
                                    bVar14 = bVar20.Q0;
                                    if (bVar14 != null) {
                                        r16 = bVar14.f121176e;
                                    } else {
                                        r16 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r17 = bVar12.f121176e;
                                    } else {
                                        r17 = hVar;
                                    }
                                    if (r16 != r17) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                    }
                                    bVar15 = bVar20.Q0;
                                    if (bVar15 != null) {
                                        obj2 = bVar15.f121172a;
                                    } else {
                                        obj2 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj3 = bVar12.f121172a;
                                    } else {
                                        obj3 = hVar;
                                    }
                                    if (!s.g(obj2, obj3)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("AvailableTrainingDays");
                                    }
                                    bVar16 = bVar20.Q0;
                                    if (bVar16 != null) {
                                        obj4 = bVar16.f121173b;
                                    } else {
                                        obj4 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj5 = bVar12.f121173b;
                                    } else {
                                        obj5 = hVar;
                                    }
                                    if (!s.g(obj4, obj5)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("LongTrainingDays");
                                    }
                                    bVar17 = bVar20.Q0;
                                    if (bVar17 != null) {
                                        obj6 = bVar17.f121174c;
                                    } else {
                                        obj6 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj7 = bVar12.f121174c;
                                    } else {
                                        obj7 = hVar;
                                    }
                                    if (!s.g(obj6, obj7)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimTrainingDays");
                                    }
                                    bVar18 = bVar20.Q0;
                                    if (bVar18 != null) {
                                        r18 = bVar18.f121177f;
                                    } else {
                                        r18 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r19 = bVar12.f121177f;
                                    } else {
                                        r19 = hVar;
                                    }
                                    if (r18 != r19) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimAbility");
                                    }
                                    bVar19 = bVar20.Q0;
                                    if (bVar19 != null) {
                                        obj8 = bVar19.f121178g;
                                    } else {
                                        obj8 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj9 = bVar12.f121178g;
                                    } else {
                                        obj9 = hVar;
                                    }
                                    if (!s.g(obj8, obj9)) {
                                        rt1.l lVar15 = rt1.l.f154545a;
                                        if (bVar12 != null) {
                                            hVar2 = hVar;
                                        } else {
                                            hVar2 = hVar;
                                        }
                                        lVar15.getClass();
                                        linkedHashSet = rt1.l.f154547c;
                                        if (hVar2 != null) {
                                            linkedHashSet.add(hVar2.f166715a);
                                        } else {
                                            linkedHashSet.add(vt1.h.NONE.f180123d);
                                        }
                                    }
                                    rt1.l lVar16 = rt1.l.f154545a;
                                    vt1.o oVar8 = bVar20.Y;
                                    lVar16.getClass();
                                    rt1.l.c(oVar8);
                                    bVar20.h5().j(g3.a.e(g3.f35298f));
                                }
                                return Unit.INSTANCE;
                            }
                            o53.j0 j0VarJ15 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = null;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var7;
                            this.f141615i = v2Var8;
                            this.f141616j = v2Var9;
                            this.f141617k = v2Var10;
                            this.f141619m = 5;
                            objC5 = j0VarJ15.C(this);
                        }
                    }
                    break;
                } else {
                    o53.j0 j0VarJ16 = ge1.b.j(b0Var, null, null, new c(bVar20, bVar, null), 3);
                    this.f141620n = b0Var;
                    this.f141607a = cVar;
                    this.f141608b = cVar2;
                    this.f141609c = iVar;
                    this.f141610d = list3;
                    this.f141611e = null;
                    this.f141612f = bVar4;
                    this.f141613g = tVar2;
                    this.f141614h = v2Var;
                    this.f141619m = 2;
                    objC2 = j0VarJ16.C(this);
                    break;
                }
                return aVar;
            case 1:
                tVar3 = this.f141613g;
                bVar5 = this.f141612f;
                bVar6 = this.f141611e;
                List<tw1.h> list13 = this.f141610d;
                iVar = this.f141609c;
                cVar2 = this.f141608b;
                cVar = this.f141607a;
                r.b(obj);
                aVar = aVar2;
                list3 = list13;
                objC = obj;
                bVar = bVar6;
                bVar4 = bVar5;
                tVar2 = tVar3;
                v2Var = (v2) objC;
                bVar7 = bVar20.Q0;
                if (bVar7 != null) {
                    cVar3 = bVar7.f121175d;
                } else {
                    cVar3 = null;
                }
                if (cVar != cVar3) {
                    list4 = list3;
                    tVar4 = tVar2;
                    v2Var2 = v2Var;
                    v2Var3 = null;
                    bVar8 = bVar20.Q0;
                    if (bVar8 != null) {
                        cVar4 = bVar8.f121176e;
                    } else {
                        cVar4 = null;
                    }
                    if (cVar2 == cVar4) {
                        o53.j0 j0VarJ17 = ge1.b.j(b0Var, null, null, new a(bVar20, bVar4, null), 3);
                        this.f141620n = b0Var;
                        this.f141607a = cVar;
                        this.f141608b = cVar2;
                        this.f141609c = iVar;
                        this.f141610d = list4;
                        this.f141611e = null;
                        this.f141612f = null;
                        this.f141613g = tVar4;
                        this.f141614h = v2Var2;
                        this.f141615i = v2Var3;
                        this.f141619m = 3;
                        objC3 = j0VarJ17.C(this);
                        if (objC3 != aVar) {
                            tVar5 = tVar4;
                            tVar4 = tVar5;
                            v2Var4 = v2Var2;
                            v2Var5 = v2Var3;
                            v2Var6 = (v2) objC3;
                            bVar9 = bVar20.Q0;
                            if (bVar9 != null) {
                                cVar5 = bVar9.f121175d;
                            } else {
                                cVar5 = null;
                            }
                            if (cVar != cVar5) {
                                if (bVar9 != null) {
                                    cVar6 = bVar9.f121176e;
                                } else {
                                    cVar6 = null;
                                }
                                if (cVar2 != cVar6) {
                                    if (tVar4 != null) {
                                        o53.j0 j0VarJ18 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                                        this.f141620n = b0Var;
                                        this.f141607a = null;
                                        this.f141608b = null;
                                        this.f141609c = iVar;
                                        this.f141610d = list4;
                                        this.f141611e = null;
                                        this.f141612f = null;
                                        this.f141613g = null;
                                        this.f141614h = v2Var4;
                                        this.f141615i = v2Var5;
                                        this.f141616j = v2Var6;
                                        this.f141619m = 4;
                                        objC4 = j0VarJ18.C(this);
                                    }
                                }
                                v2Var7 = v2Var4;
                                v2Var8 = v2Var5;
                                v2Var9 = v2Var6;
                                v2Var10 = null;
                                bVar10 = bVar20.Q0;
                                if (bVar10 != null) {
                                    list5 = bVar10.f121178g;
                                } else {
                                    list5 = null;
                                }
                                if (s.g(list4, list5)) {
                                    v2 v2Var110 = v2Var9;
                                    v2Var11 = v2Var7;
                                    v2Var12 = v2Var10;
                                    v2Var13 = v2Var110;
                                    v2Var14 = null;
                                    if (iVar != null) {
                                        bVar11 = bVar20.Q0;
                                        if (bVar11 != null) {
                                            iVar2 = bVar11.f121177f;
                                        } else {
                                            iVar2 = null;
                                        }
                                        if (iVar != iVar2) {
                                            hVar = null;
                                            o53.j0 j0VarJ19 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                            this.f141620n = b0Var;
                                            this.f141607a = null;
                                            this.f141608b = null;
                                            this.f141609c = null;
                                            this.f141610d = null;
                                            this.f141611e = null;
                                            this.f141612f = null;
                                            this.f141613g = null;
                                            this.f141614h = v2Var11;
                                            this.f141615i = v2Var8;
                                            this.f141616j = v2Var13;
                                            this.f141617k = v2Var12;
                                            this.f141618l = v2Var14;
                                            this.f141619m = 6;
                                            objC6 = j0VarJ19.C(this);
                                            break;
                                        }
                                        if (v2Var11 instanceof v2.a) {
                                            int i11118 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD11119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                            i2.a aVar111111 = i2.f36769a;
                                            a2 a2Var11119 = a2.GENERAL;
                                            aVar111111.getClass();
                                            i2.a.f(a2Var11119, "EventBaseViewModel", strD11119);
                                        } else if (v2Var8 instanceof v2.a) {
                                            int i11119 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                            i2.a aVar111112 = i2.f36769a;
                                            a2 a2Var111110 = a2.GENERAL;
                                            aVar111112.getClass();
                                            i2.a.f(a2Var111110, "EventBaseViewModel", strD111110);
                                        } else if (v2Var13 instanceof v2.a) {
                                            int i111110 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                            i2.a aVar111113 = i2.f36769a;
                                            a2 a2Var111111 = a2.GENERAL;
                                            aVar111113.getClass();
                                            i2.a.f(a2Var111111, "EventBaseViewModel", strD111111);
                                        } else if (v2Var12 instanceof v2.a) {
                                            int i111111 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                            i2.a aVar111114 = i2.f36769a;
                                            a2 a2Var111112 = a2.GENERAL;
                                            aVar111114.getClass();
                                            i2.a.f(a2Var111112, "EventBaseViewModel", strD111112);
                                        } else if (v2Var15 instanceof v2.a) {
                                            int i2110 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                            i2.a aVar111115 = i2.f36769a;
                                            a2 a2Var111113 = a2.GENERAL;
                                            aVar111115.getClass();
                                            i2.a.f(a2Var111113, "EventBaseViewModel", strD111113);
                                        } else if (v2Var14 instanceof v2.a) {
                                            int i2111 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                            i2.a aVar111116 = i2.f36769a;
                                            a2 a2Var111114 = a2.GENERAL;
                                            aVar111116.getClass();
                                            i2.a.f(a2Var111114, "EventBaseViewModel", strD111114);
                                        } else {
                                            bVar12 = (mv1.b) bVar20.R0.getValue();
                                            bVar13 = bVar20.Q0;
                                            if (bVar13 != null) {
                                                r14 = bVar13.f121175d;
                                            } else {
                                                r14 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r15 = bVar12.f121175d;
                                            } else {
                                                r15 = hVar;
                                            }
                                            if (r14 != r15) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("RunningWorkoutTargetType");
                                            }
                                            bVar14 = bVar20.Q0;
                                            if (bVar14 != null) {
                                                r16 = bVar14.f121176e;
                                            } else {
                                                r16 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r17 = bVar12.f121176e;
                                            } else {
                                                r17 = hVar;
                                            }
                                            if (r16 != r17) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                            }
                                            bVar15 = bVar20.Q0;
                                            if (bVar15 != null) {
                                                obj2 = bVar15.f121172a;
                                            } else {
                                                obj2 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj3 = bVar12.f121172a;
                                            } else {
                                                obj3 = hVar;
                                            }
                                            if (!s.g(obj2, obj3)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("AvailableTrainingDays");
                                            }
                                            bVar16 = bVar20.Q0;
                                            if (bVar16 != null) {
                                                obj4 = bVar16.f121173b;
                                            } else {
                                                obj4 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj5 = bVar12.f121173b;
                                            } else {
                                                obj5 = hVar;
                                            }
                                            if (!s.g(obj4, obj5)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("LongTrainingDays");
                                            }
                                            bVar17 = bVar20.Q0;
                                            if (bVar17 != null) {
                                                obj6 = bVar17.f121174c;
                                            } else {
                                                obj6 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj7 = bVar12.f121174c;
                                            } else {
                                                obj7 = hVar;
                                            }
                                            if (!s.g(obj6, obj7)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("SwimTrainingDays");
                                            }
                                            bVar18 = bVar20.Q0;
                                            if (bVar18 != null) {
                                                r18 = bVar18.f121177f;
                                            } else {
                                                r18 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r19 = bVar12.f121177f;
                                            } else {
                                                r19 = hVar;
                                            }
                                            if (r18 != r19) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("SwimAbility");
                                            }
                                            bVar19 = bVar20.Q0;
                                            if (bVar19 != null) {
                                                obj8 = bVar19.f121178g;
                                            } else {
                                                obj8 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj9 = bVar12.f121178g;
                                            } else {
                                                obj9 = hVar;
                                            }
                                            if (!s.g(obj8, obj9)) {
                                                rt1.l lVar17 = rt1.l.f154545a;
                                                if (bVar12 != null) {
                                                    hVar2 = hVar;
                                                } else {
                                                    hVar2 = hVar;
                                                }
                                                lVar17.getClass();
                                                linkedHashSet = rt1.l.f154547c;
                                                if (hVar2 != null) {
                                                    linkedHashSet.add(hVar2.f166715a);
                                                } else {
                                                    linkedHashSet.add(vt1.h.NONE.f180123d);
                                                }
                                            }
                                            rt1.l lVar18 = rt1.l.f154545a;
                                            vt1.o oVar9 = bVar20.Y;
                                            lVar18.getClass();
                                            rt1.l.c(oVar9);
                                            bVar20.h5().j(g3.a.e(g3.f35298f));
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    hVar = null;
                                    v2Var15 = null;
                                    if (v2Var11 instanceof v2.a) {
                                        int i111112 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar111117 = i2.f36769a;
                                        a2 a2Var111115 = a2.GENERAL;
                                        aVar111117.getClass();
                                        i2.a.f(a2Var111115, "EventBaseViewModel", strD111115);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i111113 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar111118 = i2.f36769a;
                                        a2 a2Var111116 = a2.GENERAL;
                                        aVar111118.getClass();
                                        i2.a.f(a2Var111116, "EventBaseViewModel", strD111116);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i111114 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar111119 = i2.f36769a;
                                        a2 a2Var111117 = a2.GENERAL;
                                        aVar111119.getClass();
                                        i2.a.f(a2Var111117, "EventBaseViewModel", strD111117);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i111115 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar1111110 = i2.f36769a;
                                        a2 a2Var111118 = a2.GENERAL;
                                        aVar1111110.getClass();
                                        i2.a.f(a2Var111118, "EventBaseViewModel", strD111118);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i2112 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar1111111 = i2.f36769a;
                                        a2 a2Var111119 = a2.GENERAL;
                                        aVar1111111.getClass();
                                        i2.a.f(a2Var111119, "EventBaseViewModel", strD111119);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i2113 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar1111112 = i2.f36769a;
                                        a2 a2Var1111110 = a2.GENERAL;
                                        aVar1111112.getClass();
                                        i2.a.f(a2Var1111110, "EventBaseViewModel", strD1111110);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar19 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar19.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar110 = rt1.l.f154545a;
                                        vt1.o oVar10 = bVar20.Y;
                                        lVar110.getClass();
                                        rt1.l.c(oVar10);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                o53.j0 j0VarJ110 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                                this.f141620n = b0Var;
                                this.f141607a = null;
                                this.f141608b = null;
                                this.f141609c = iVar;
                                this.f141610d = null;
                                this.f141611e = null;
                                this.f141612f = null;
                                this.f141613g = null;
                                this.f141614h = v2Var7;
                                this.f141615i = v2Var8;
                                this.f141616j = v2Var9;
                                this.f141617k = v2Var10;
                                this.f141619m = 5;
                                objC5 = j0VarJ110.C(this);
                            } else if (tVar4 != null) {
                                o53.j0 j0VarJ111 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                                this.f141620n = b0Var;
                                this.f141607a = null;
                                this.f141608b = null;
                                this.f141609c = iVar;
                                this.f141610d = list4;
                                this.f141611e = null;
                                this.f141612f = null;
                                this.f141613g = null;
                                this.f141614h = v2Var4;
                                this.f141615i = v2Var5;
                                this.f141616j = v2Var6;
                                this.f141619m = 4;
                                objC4 = j0VarJ111.C(this);
                            } else {
                                v2Var7 = v2Var4;
                                v2Var8 = v2Var5;
                                v2Var9 = v2Var6;
                                v2Var10 = null;
                                bVar10 = bVar20.Q0;
                                if (bVar10 != null) {
                                    list5 = bVar10.f121178g;
                                } else {
                                    list5 = null;
                                }
                                if (s.g(list4, list5)) {
                                    v2 v2Var111 = v2Var9;
                                    v2Var11 = v2Var7;
                                    v2Var12 = v2Var10;
                                    v2Var13 = v2Var111;
                                    v2Var14 = null;
                                    if (iVar != null) {
                                        bVar11 = bVar20.Q0;
                                        if (bVar11 != null) {
                                            iVar2 = bVar11.f121177f;
                                        } else {
                                            iVar2 = null;
                                        }
                                        if (iVar != iVar2) {
                                            hVar = null;
                                            o53.j0 j0VarJ112 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                            this.f141620n = b0Var;
                                            this.f141607a = null;
                                            this.f141608b = null;
                                            this.f141609c = null;
                                            this.f141610d = null;
                                            this.f141611e = null;
                                            this.f141612f = null;
                                            this.f141613g = null;
                                            this.f141614h = v2Var11;
                                            this.f141615i = v2Var8;
                                            this.f141616j = v2Var13;
                                            this.f141617k = v2Var12;
                                            this.f141618l = v2Var14;
                                            this.f141619m = 6;
                                            objC6 = j0VarJ112.C(this);
                                            break;
                                        }
                                        if (v2Var11 instanceof v2.a) {
                                            int i111116 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD1111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                            i2.a aVar1111113 = i2.f36769a;
                                            a2 a2Var1111111 = a2.GENERAL;
                                            aVar1111113.getClass();
                                            i2.a.f(a2Var1111111, "EventBaseViewModel", strD1111111);
                                        } else if (v2Var8 instanceof v2.a) {
                                            int i111117 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD1111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                            i2.a aVar1111114 = i2.f36769a;
                                            a2 a2Var1111112 = a2.GENERAL;
                                            aVar1111114.getClass();
                                            i2.a.f(a2Var1111112, "EventBaseViewModel", strD1111112);
                                        } else if (v2Var13 instanceof v2.a) {
                                            int i111118 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD1111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                            i2.a aVar1111115 = i2.f36769a;
                                            a2 a2Var1111113 = a2.GENERAL;
                                            aVar1111115.getClass();
                                            i2.a.f(a2Var1111113, "EventBaseViewModel", strD1111113);
                                        } else if (v2Var12 instanceof v2.a) {
                                            int i111119 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD1111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                            i2.a aVar1111116 = i2.f36769a;
                                            a2 a2Var1111114 = a2.GENERAL;
                                            aVar1111116.getClass();
                                            i2.a.f(a2Var1111114, "EventBaseViewModel", strD1111114);
                                        } else if (v2Var15 instanceof v2.a) {
                                            int i2114 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD1111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                            i2.a aVar1111117 = i2.f36769a;
                                            a2 a2Var1111115 = a2.GENERAL;
                                            aVar1111117.getClass();
                                            i2.a.f(a2Var1111115, "EventBaseViewModel", strD1111115);
                                        } else if (v2Var14 instanceof v2.a) {
                                            int i2115 = pv1.b.f141488i1;
                                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                            String strD1111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                            i2.a aVar1111118 = i2.f36769a;
                                            a2 a2Var1111116 = a2.GENERAL;
                                            aVar1111118.getClass();
                                            i2.a.f(a2Var1111116, "EventBaseViewModel", strD1111116);
                                        } else {
                                            bVar12 = (mv1.b) bVar20.R0.getValue();
                                            bVar13 = bVar20.Q0;
                                            if (bVar13 != null) {
                                                r14 = bVar13.f121175d;
                                            } else {
                                                r14 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r15 = bVar12.f121175d;
                                            } else {
                                                r15 = hVar;
                                            }
                                            if (r14 != r15) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("RunningWorkoutTargetType");
                                            }
                                            bVar14 = bVar20.Q0;
                                            if (bVar14 != null) {
                                                r16 = bVar14.f121176e;
                                            } else {
                                                r16 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r17 = bVar12.f121176e;
                                            } else {
                                                r17 = hVar;
                                            }
                                            if (r16 != r17) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                            }
                                            bVar15 = bVar20.Q0;
                                            if (bVar15 != null) {
                                                obj2 = bVar15.f121172a;
                                            } else {
                                                obj2 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj3 = bVar12.f121172a;
                                            } else {
                                                obj3 = hVar;
                                            }
                                            if (!s.g(obj2, obj3)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("AvailableTrainingDays");
                                            }
                                            bVar16 = bVar20.Q0;
                                            if (bVar16 != null) {
                                                obj4 = bVar16.f121173b;
                                            } else {
                                                obj4 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj5 = bVar12.f121173b;
                                            } else {
                                                obj5 = hVar;
                                            }
                                            if (!s.g(obj4, obj5)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("LongTrainingDays");
                                            }
                                            bVar17 = bVar20.Q0;
                                            if (bVar17 != null) {
                                                obj6 = bVar17.f121174c;
                                            } else {
                                                obj6 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj7 = bVar12.f121174c;
                                            } else {
                                                obj7 = hVar;
                                            }
                                            if (!s.g(obj6, obj7)) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("SwimTrainingDays");
                                            }
                                            bVar18 = bVar20.Q0;
                                            if (bVar18 != null) {
                                                r18 = bVar18.f121177f;
                                            } else {
                                                r18 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                r19 = bVar12.f121177f;
                                            } else {
                                                r19 = hVar;
                                            }
                                            if (r18 != r19) {
                                                rt1.l.f154545a.getClass();
                                                rt1.l.f154547c.add("SwimAbility");
                                            }
                                            bVar19 = bVar20.Q0;
                                            if (bVar19 != null) {
                                                obj8 = bVar19.f121178g;
                                            } else {
                                                obj8 = hVar;
                                            }
                                            if (bVar12 != null) {
                                                obj9 = bVar12.f121178g;
                                            } else {
                                                obj9 = hVar;
                                            }
                                            if (!s.g(obj8, obj9)) {
                                                rt1.l lVar111 = rt1.l.f154545a;
                                                if (bVar12 != null) {
                                                    hVar2 = hVar;
                                                } else {
                                                    hVar2 = hVar;
                                                }
                                                lVar111.getClass();
                                                linkedHashSet = rt1.l.f154547c;
                                                if (hVar2 != null) {
                                                    linkedHashSet.add(hVar2.f166715a);
                                                } else {
                                                    linkedHashSet.add(vt1.h.NONE.f180123d);
                                                }
                                            }
                                            rt1.l lVar112 = rt1.l.f154545a;
                                            vt1.o oVar11 = bVar20.Y;
                                            lVar112.getClass();
                                            rt1.l.c(oVar11);
                                            bVar20.h5().j(g3.a.e(g3.f35298f));
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    hVar = null;
                                    v2Var15 = null;
                                    if (v2Var11 instanceof v2.a) {
                                        int i1111110 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar1111119 = i2.f36769a;
                                        a2 a2Var1111117 = a2.GENERAL;
                                        aVar1111119.getClass();
                                        i2.a.f(a2Var1111117, "EventBaseViewModel", strD1111117);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i1111111 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar11111110 = i2.f36769a;
                                        a2 a2Var1111118 = a2.GENERAL;
                                        aVar11111110.getClass();
                                        i2.a.f(a2Var1111118, "EventBaseViewModel", strD1111118);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i1111112 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar11111111 = i2.f36769a;
                                        a2 a2Var1111119 = a2.GENERAL;
                                        aVar11111111.getClass();
                                        i2.a.f(a2Var1111119, "EventBaseViewModel", strD1111119);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i1111113 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar11111112 = i2.f36769a;
                                        a2 a2Var11111110 = a2.GENERAL;
                                        aVar11111112.getClass();
                                        i2.a.f(a2Var11111110, "EventBaseViewModel", strD11111110);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i2116 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar11111113 = i2.f36769a;
                                        a2 a2Var11111111 = a2.GENERAL;
                                        aVar11111113.getClass();
                                        i2.a.f(a2Var11111111, "EventBaseViewModel", strD11111111);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i2117 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar11111114 = i2.f36769a;
                                        a2 a2Var11111112 = a2.GENERAL;
                                        aVar11111114.getClass();
                                        i2.a.f(a2Var11111112, "EventBaseViewModel", strD11111112);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar113 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar113.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar114 = rt1.l.f154545a;
                                        vt1.o oVar12 = bVar20.Y;
                                        lVar114.getClass();
                                        rt1.l.c(oVar12);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                o53.j0 j0VarJ113 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                                this.f141620n = b0Var;
                                this.f141607a = null;
                                this.f141608b = null;
                                this.f141609c = iVar;
                                this.f141610d = null;
                                this.f141611e = null;
                                this.f141612f = null;
                                this.f141613g = null;
                                this.f141614h = v2Var7;
                                this.f141615i = v2Var8;
                                this.f141616j = v2Var9;
                                this.f141617k = v2Var10;
                                this.f141619m = 5;
                                objC5 = j0VarJ113.C(this);
                            }
                        }
                    } else {
                        v2Var4 = v2Var2;
                        v2Var5 = v2Var3;
                        v2Var6 = null;
                        bVar9 = bVar20.Q0;
                        if (bVar9 != null) {
                            cVar5 = bVar9.f121175d;
                        } else {
                            cVar5 = null;
                        }
                        if (cVar != cVar5) {
                            if (bVar9 != null) {
                                cVar6 = bVar9.f121176e;
                            } else {
                                cVar6 = null;
                            }
                            if (cVar2 != cVar6) {
                                if (tVar4 != null) {
                                    o53.j0 j0VarJ114 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                                    this.f141620n = b0Var;
                                    this.f141607a = null;
                                    this.f141608b = null;
                                    this.f141609c = iVar;
                                    this.f141610d = list4;
                                    this.f141611e = null;
                                    this.f141612f = null;
                                    this.f141613g = null;
                                    this.f141614h = v2Var4;
                                    this.f141615i = v2Var5;
                                    this.f141616j = v2Var6;
                                    this.f141619m = 4;
                                    objC4 = j0VarJ114.C(this);
                                }
                            }
                            v2Var7 = v2Var4;
                            v2Var8 = v2Var5;
                            v2Var9 = v2Var6;
                            v2Var10 = null;
                            bVar10 = bVar20.Q0;
                            if (bVar10 != null) {
                                list5 = bVar10.f121178g;
                            } else {
                                list5 = null;
                            }
                            if (s.g(list4, list5)) {
                                v2 v2Var112 = v2Var9;
                                v2Var11 = v2Var7;
                                v2Var12 = v2Var10;
                                v2Var13 = v2Var112;
                                v2Var14 = null;
                                if (iVar != null) {
                                    bVar11 = bVar20.Q0;
                                    if (bVar11 != null) {
                                        iVar2 = bVar11.f121177f;
                                    } else {
                                        iVar2 = null;
                                    }
                                    if (iVar != iVar2) {
                                        hVar = null;
                                        o53.j0 j0VarJ115 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                        this.f141620n = b0Var;
                                        this.f141607a = null;
                                        this.f141608b = null;
                                        this.f141609c = null;
                                        this.f141610d = null;
                                        this.f141611e = null;
                                        this.f141612f = null;
                                        this.f141613g = null;
                                        this.f141614h = v2Var11;
                                        this.f141615i = v2Var8;
                                        this.f141616j = v2Var13;
                                        this.f141617k = v2Var12;
                                        this.f141618l = v2Var14;
                                        this.f141619m = 6;
                                        objC6 = j0VarJ115.C(this);
                                        break;
                                    }
                                    if (v2Var11 instanceof v2.a) {
                                        int i1111114 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar11111115 = i2.f36769a;
                                        a2 a2Var11111113 = a2.GENERAL;
                                        aVar11111115.getClass();
                                        i2.a.f(a2Var11111113, "EventBaseViewModel", strD11111113);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i1111115 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar11111116 = i2.f36769a;
                                        a2 a2Var11111114 = a2.GENERAL;
                                        aVar11111116.getClass();
                                        i2.a.f(a2Var11111114, "EventBaseViewModel", strD11111114);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i1111116 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar11111117 = i2.f36769a;
                                        a2 a2Var11111115 = a2.GENERAL;
                                        aVar11111117.getClass();
                                        i2.a.f(a2Var11111115, "EventBaseViewModel", strD11111115);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i1111117 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar11111118 = i2.f36769a;
                                        a2 a2Var11111116 = a2.GENERAL;
                                        aVar11111118.getClass();
                                        i2.a.f(a2Var11111116, "EventBaseViewModel", strD11111116);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i2118 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar11111119 = i2.f36769a;
                                        a2 a2Var11111117 = a2.GENERAL;
                                        aVar11111119.getClass();
                                        i2.a.f(a2Var11111117, "EventBaseViewModel", strD11111117);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i2119 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar111111110 = i2.f36769a;
                                        a2 a2Var11111118 = a2.GENERAL;
                                        aVar111111110.getClass();
                                        i2.a.f(a2Var11111118, "EventBaseViewModel", strD11111118);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar115 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar115.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar116 = rt1.l.f154545a;
                                        vt1.o oVar13 = bVar20.Y;
                                        lVar116.getClass();
                                        rt1.l.c(oVar13);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                hVar = null;
                                v2Var15 = null;
                                if (v2Var11 instanceof v2.a) {
                                    int i1111118 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar111111111 = i2.f36769a;
                                    a2 a2Var11111119 = a2.GENERAL;
                                    aVar111111111.getClass();
                                    i2.a.f(a2Var11111119, "EventBaseViewModel", strD11111119);
                                } else if (v2Var8 instanceof v2.a) {
                                    int i1111119 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                    i2.a aVar111111112 = i2.f36769a;
                                    a2 a2Var111111110 = a2.GENERAL;
                                    aVar111111112.getClass();
                                    i2.a.f(a2Var111111110, "EventBaseViewModel", strD111111110);
                                } else if (v2Var13 instanceof v2.a) {
                                    int i11111110 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                    i2.a aVar111111113 = i2.f36769a;
                                    a2 a2Var111111111 = a2.GENERAL;
                                    aVar111111113.getClass();
                                    i2.a.f(a2Var111111111, "EventBaseViewModel", strD111111111);
                                } else if (v2Var12 instanceof v2.a) {
                                    int i11111111 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                    i2.a aVar111111114 = i2.f36769a;
                                    a2 a2Var111111112 = a2.GENERAL;
                                    aVar111111114.getClass();
                                    i2.a.f(a2Var111111112, "EventBaseViewModel", strD111111112);
                                } else if (v2Var15 instanceof v2.a) {
                                    int i21110 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar111111115 = i2.f36769a;
                                    a2 a2Var111111113 = a2.GENERAL;
                                    aVar111111115.getClass();
                                    i2.a.f(a2Var111111113, "EventBaseViewModel", strD111111113);
                                } else if (v2Var14 instanceof v2.a) {
                                    int i21111 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                    i2.a aVar111111116 = i2.f36769a;
                                    a2 a2Var111111114 = a2.GENERAL;
                                    aVar111111116.getClass();
                                    i2.a.f(a2Var111111114, "EventBaseViewModel", strD111111114);
                                } else {
                                    bVar12 = (mv1.b) bVar20.R0.getValue();
                                    bVar13 = bVar20.Q0;
                                    if (bVar13 != null) {
                                        r14 = bVar13.f121175d;
                                    } else {
                                        r14 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r15 = bVar12.f121175d;
                                    } else {
                                        r15 = hVar;
                                    }
                                    if (r14 != r15) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                                    }
                                    bVar14 = bVar20.Q0;
                                    if (bVar14 != null) {
                                        r16 = bVar14.f121176e;
                                    } else {
                                        r16 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r17 = bVar12.f121176e;
                                    } else {
                                        r17 = hVar;
                                    }
                                    if (r16 != r17) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                    }
                                    bVar15 = bVar20.Q0;
                                    if (bVar15 != null) {
                                        obj2 = bVar15.f121172a;
                                    } else {
                                        obj2 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj3 = bVar12.f121172a;
                                    } else {
                                        obj3 = hVar;
                                    }
                                    if (!s.g(obj2, obj3)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("AvailableTrainingDays");
                                    }
                                    bVar16 = bVar20.Q0;
                                    if (bVar16 != null) {
                                        obj4 = bVar16.f121173b;
                                    } else {
                                        obj4 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj5 = bVar12.f121173b;
                                    } else {
                                        obj5 = hVar;
                                    }
                                    if (!s.g(obj4, obj5)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("LongTrainingDays");
                                    }
                                    bVar17 = bVar20.Q0;
                                    if (bVar17 != null) {
                                        obj6 = bVar17.f121174c;
                                    } else {
                                        obj6 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj7 = bVar12.f121174c;
                                    } else {
                                        obj7 = hVar;
                                    }
                                    if (!s.g(obj6, obj7)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimTrainingDays");
                                    }
                                    bVar18 = bVar20.Q0;
                                    if (bVar18 != null) {
                                        r18 = bVar18.f121177f;
                                    } else {
                                        r18 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r19 = bVar12.f121177f;
                                    } else {
                                        r19 = hVar;
                                    }
                                    if (r18 != r19) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimAbility");
                                    }
                                    bVar19 = bVar20.Q0;
                                    if (bVar19 != null) {
                                        obj8 = bVar19.f121178g;
                                    } else {
                                        obj8 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj9 = bVar12.f121178g;
                                    } else {
                                        obj9 = hVar;
                                    }
                                    if (!s.g(obj8, obj9)) {
                                        rt1.l lVar117 = rt1.l.f154545a;
                                        if (bVar12 != null) {
                                            hVar2 = hVar;
                                        } else {
                                            hVar2 = hVar;
                                        }
                                        lVar117.getClass();
                                        linkedHashSet = rt1.l.f154547c;
                                        if (hVar2 != null) {
                                            linkedHashSet.add(hVar2.f166715a);
                                        } else {
                                            linkedHashSet.add(vt1.h.NONE.f180123d);
                                        }
                                    }
                                    rt1.l lVar118 = rt1.l.f154545a;
                                    vt1.o oVar14 = bVar20.Y;
                                    lVar118.getClass();
                                    rt1.l.c(oVar14);
                                    bVar20.h5().j(g3.a.e(g3.f35298f));
                                }
                                return Unit.INSTANCE;
                            }
                            o53.j0 j0VarJ116 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = null;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var7;
                            this.f141615i = v2Var8;
                            this.f141616j = v2Var9;
                            this.f141617k = v2Var10;
                            this.f141619m = 5;
                            objC5 = j0VarJ116.C(this);
                        } else if (tVar4 != null) {
                            o53.j0 j0VarJ117 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = list4;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var4;
                            this.f141615i = v2Var5;
                            this.f141616j = v2Var6;
                            this.f141619m = 4;
                            objC4 = j0VarJ117.C(this);
                        } else {
                            v2Var7 = v2Var4;
                            v2Var8 = v2Var5;
                            v2Var9 = v2Var6;
                            v2Var10 = null;
                            bVar10 = bVar20.Q0;
                            if (bVar10 != null) {
                                list5 = bVar10.f121178g;
                            } else {
                                list5 = null;
                            }
                            if (s.g(list4, list5)) {
                                v2 v2Var113 = v2Var9;
                                v2Var11 = v2Var7;
                                v2Var12 = v2Var10;
                                v2Var13 = v2Var113;
                                v2Var14 = null;
                                if (iVar != null) {
                                    bVar11 = bVar20.Q0;
                                    if (bVar11 != null) {
                                        iVar2 = bVar11.f121177f;
                                    } else {
                                        iVar2 = null;
                                    }
                                    if (iVar != iVar2) {
                                        hVar = null;
                                        o53.j0 j0VarJ118 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                        this.f141620n = b0Var;
                                        this.f141607a = null;
                                        this.f141608b = null;
                                        this.f141609c = null;
                                        this.f141610d = null;
                                        this.f141611e = null;
                                        this.f141612f = null;
                                        this.f141613g = null;
                                        this.f141614h = v2Var11;
                                        this.f141615i = v2Var8;
                                        this.f141616j = v2Var13;
                                        this.f141617k = v2Var12;
                                        this.f141618l = v2Var14;
                                        this.f141619m = 6;
                                        objC6 = j0VarJ118.C(this);
                                        break;
                                    }
                                    if (v2Var11 instanceof v2.a) {
                                        int i11111112 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar111111117 = i2.f36769a;
                                        a2 a2Var111111115 = a2.GENERAL;
                                        aVar111111117.getClass();
                                        i2.a.f(a2Var111111115, "EventBaseViewModel", strD111111115);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i11111113 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar111111118 = i2.f36769a;
                                        a2 a2Var111111116 = a2.GENERAL;
                                        aVar111111118.getClass();
                                        i2.a.f(a2Var111111116, "EventBaseViewModel", strD111111116);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i11111114 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar111111119 = i2.f36769a;
                                        a2 a2Var111111117 = a2.GENERAL;
                                        aVar111111119.getClass();
                                        i2.a.f(a2Var111111117, "EventBaseViewModel", strD111111117);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i11111115 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar1111111110 = i2.f36769a;
                                        a2 a2Var111111118 = a2.GENERAL;
                                        aVar1111111110.getClass();
                                        i2.a.f(a2Var111111118, "EventBaseViewModel", strD111111118);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i21112 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar1111111111 = i2.f36769a;
                                        a2 a2Var111111119 = a2.GENERAL;
                                        aVar1111111111.getClass();
                                        i2.a.f(a2Var111111119, "EventBaseViewModel", strD111111119);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i21113 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar1111111112 = i2.f36769a;
                                        a2 a2Var1111111110 = a2.GENERAL;
                                        aVar1111111112.getClass();
                                        i2.a.f(a2Var1111111110, "EventBaseViewModel", strD1111111110);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar119 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar119.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar1110 = rt1.l.f154545a;
                                        vt1.o oVar15 = bVar20.Y;
                                        lVar1110.getClass();
                                        rt1.l.c(oVar15);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                hVar = null;
                                v2Var15 = null;
                                if (v2Var11 instanceof v2.a) {
                                    int i11111116 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar1111111113 = i2.f36769a;
                                    a2 a2Var1111111111 = a2.GENERAL;
                                    aVar1111111113.getClass();
                                    i2.a.f(a2Var1111111111, "EventBaseViewModel", strD1111111111);
                                } else if (v2Var8 instanceof v2.a) {
                                    int i11111117 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                    i2.a aVar1111111114 = i2.f36769a;
                                    a2 a2Var1111111112 = a2.GENERAL;
                                    aVar1111111114.getClass();
                                    i2.a.f(a2Var1111111112, "EventBaseViewModel", strD1111111112);
                                } else if (v2Var13 instanceof v2.a) {
                                    int i11111118 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                    i2.a aVar1111111115 = i2.f36769a;
                                    a2 a2Var1111111113 = a2.GENERAL;
                                    aVar1111111115.getClass();
                                    i2.a.f(a2Var1111111113, "EventBaseViewModel", strD1111111113);
                                } else if (v2Var12 instanceof v2.a) {
                                    int i11111119 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                    i2.a aVar1111111116 = i2.f36769a;
                                    a2 a2Var1111111114 = a2.GENERAL;
                                    aVar1111111116.getClass();
                                    i2.a.f(a2Var1111111114, "EventBaseViewModel", strD1111111114);
                                } else if (v2Var15 instanceof v2.a) {
                                    int i21114 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar1111111117 = i2.f36769a;
                                    a2 a2Var1111111115 = a2.GENERAL;
                                    aVar1111111117.getClass();
                                    i2.a.f(a2Var1111111115, "EventBaseViewModel", strD1111111115);
                                } else if (v2Var14 instanceof v2.a) {
                                    int i21115 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                    i2.a aVar1111111118 = i2.f36769a;
                                    a2 a2Var1111111116 = a2.GENERAL;
                                    aVar1111111118.getClass();
                                    i2.a.f(a2Var1111111116, "EventBaseViewModel", strD1111111116);
                                } else {
                                    bVar12 = (mv1.b) bVar20.R0.getValue();
                                    bVar13 = bVar20.Q0;
                                    if (bVar13 != null) {
                                        r14 = bVar13.f121175d;
                                    } else {
                                        r14 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r15 = bVar12.f121175d;
                                    } else {
                                        r15 = hVar;
                                    }
                                    if (r14 != r15) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                                    }
                                    bVar14 = bVar20.Q0;
                                    if (bVar14 != null) {
                                        r16 = bVar14.f121176e;
                                    } else {
                                        r16 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r17 = bVar12.f121176e;
                                    } else {
                                        r17 = hVar;
                                    }
                                    if (r16 != r17) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                    }
                                    bVar15 = bVar20.Q0;
                                    if (bVar15 != null) {
                                        obj2 = bVar15.f121172a;
                                    } else {
                                        obj2 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj3 = bVar12.f121172a;
                                    } else {
                                        obj3 = hVar;
                                    }
                                    if (!s.g(obj2, obj3)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("AvailableTrainingDays");
                                    }
                                    bVar16 = bVar20.Q0;
                                    if (bVar16 != null) {
                                        obj4 = bVar16.f121173b;
                                    } else {
                                        obj4 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj5 = bVar12.f121173b;
                                    } else {
                                        obj5 = hVar;
                                    }
                                    if (!s.g(obj4, obj5)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("LongTrainingDays");
                                    }
                                    bVar17 = bVar20.Q0;
                                    if (bVar17 != null) {
                                        obj6 = bVar17.f121174c;
                                    } else {
                                        obj6 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj7 = bVar12.f121174c;
                                    } else {
                                        obj7 = hVar;
                                    }
                                    if (!s.g(obj6, obj7)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimTrainingDays");
                                    }
                                    bVar18 = bVar20.Q0;
                                    if (bVar18 != null) {
                                        r18 = bVar18.f121177f;
                                    } else {
                                        r18 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r19 = bVar12.f121177f;
                                    } else {
                                        r19 = hVar;
                                    }
                                    if (r18 != r19) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimAbility");
                                    }
                                    bVar19 = bVar20.Q0;
                                    if (bVar19 != null) {
                                        obj8 = bVar19.f121178g;
                                    } else {
                                        obj8 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj9 = bVar12.f121178g;
                                    } else {
                                        obj9 = hVar;
                                    }
                                    if (!s.g(obj8, obj9)) {
                                        rt1.l lVar1111 = rt1.l.f154545a;
                                        if (bVar12 != null) {
                                            hVar2 = hVar;
                                        } else {
                                            hVar2 = hVar;
                                        }
                                        lVar1111.getClass();
                                        linkedHashSet = rt1.l.f154547c;
                                        if (hVar2 != null) {
                                            linkedHashSet.add(hVar2.f166715a);
                                        } else {
                                            linkedHashSet.add(vt1.h.NONE.f180123d);
                                        }
                                    }
                                    rt1.l lVar1112 = rt1.l.f154545a;
                                    vt1.o oVar16 = bVar20.Y;
                                    lVar1112.getClass();
                                    rt1.l.c(oVar16);
                                    bVar20.h5().j(g3.a.e(g3.f35298f));
                                }
                                return Unit.INSTANCE;
                            }
                            o53.j0 j0VarJ119 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = null;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var7;
                            this.f141615i = v2Var8;
                            this.f141616j = v2Var9;
                            this.f141617k = v2Var10;
                            this.f141619m = 5;
                            objC5 = j0VarJ119.C(this);
                        }
                    }
                    break;
                } else {
                    o53.j0 j0VarJ120 = ge1.b.j(b0Var, null, null, new c(bVar20, bVar, null), 3);
                    this.f141620n = b0Var;
                    this.f141607a = cVar;
                    this.f141608b = cVar2;
                    this.f141609c = iVar;
                    this.f141610d = list3;
                    this.f141611e = null;
                    this.f141612f = bVar4;
                    this.f141613g = tVar2;
                    this.f141614h = v2Var;
                    this.f141619m = 2;
                    objC2 = j0VarJ120.C(this);
                    break;
                }
                return aVar;
            case 2:
                v2Var = this.f141614h;
                tVar2 = this.f141613g;
                bVar4 = this.f141612f;
                List<tw1.h> list14 = this.f141610d;
                iVar = this.f141609c;
                cVar2 = this.f141608b;
                cVar = this.f141607a;
                r.b(obj);
                aVar = aVar2;
                list3 = list14;
                objC2 = obj;
                v2 v2Var20 = (v2) objC2;
                list4 = list3;
                tVar4 = tVar2;
                v2Var2 = v2Var;
                v2Var3 = v2Var20;
                bVar8 = bVar20.Q0;
                if (bVar8 != null) {
                    cVar4 = bVar8.f121176e;
                } else {
                    cVar4 = null;
                }
                if (cVar2 == cVar4) {
                    v2Var4 = v2Var2;
                    v2Var5 = v2Var3;
                    v2Var6 = null;
                    bVar9 = bVar20.Q0;
                    if (bVar9 != null) {
                        cVar5 = bVar9.f121175d;
                    } else {
                        cVar5 = null;
                    }
                    if (cVar != cVar5) {
                        if (bVar9 != null) {
                            cVar6 = bVar9.f121176e;
                        } else {
                            cVar6 = null;
                        }
                        if (cVar2 != cVar6) {
                            if (tVar4 != null) {
                                o53.j0 j0VarJ1110 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                                this.f141620n = b0Var;
                                this.f141607a = null;
                                this.f141608b = null;
                                this.f141609c = iVar;
                                this.f141610d = list4;
                                this.f141611e = null;
                                this.f141612f = null;
                                this.f141613g = null;
                                this.f141614h = v2Var4;
                                this.f141615i = v2Var5;
                                this.f141616j = v2Var6;
                                this.f141619m = 4;
                                objC4 = j0VarJ1110.C(this);
                            }
                        }
                        v2Var7 = v2Var4;
                        v2Var8 = v2Var5;
                        v2Var9 = v2Var6;
                        v2Var10 = null;
                        bVar10 = bVar20.Q0;
                        if (bVar10 != null) {
                            list5 = bVar10.f121178g;
                        } else {
                            list5 = null;
                        }
                        if (s.g(list4, list5)) {
                            v2 v2Var114 = v2Var9;
                            v2Var11 = v2Var7;
                            v2Var12 = v2Var10;
                            v2Var13 = v2Var114;
                            v2Var14 = null;
                            if (iVar != null) {
                                bVar11 = bVar20.Q0;
                                if (bVar11 != null) {
                                    iVar2 = bVar11.f121177f;
                                } else {
                                    iVar2 = null;
                                }
                                if (iVar != iVar2) {
                                    hVar = null;
                                    o53.j0 j0VarJ1111 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                    this.f141620n = b0Var;
                                    this.f141607a = null;
                                    this.f141608b = null;
                                    this.f141609c = null;
                                    this.f141610d = null;
                                    this.f141611e = null;
                                    this.f141612f = null;
                                    this.f141613g = null;
                                    this.f141614h = v2Var11;
                                    this.f141615i = v2Var8;
                                    this.f141616j = v2Var13;
                                    this.f141617k = v2Var12;
                                    this.f141618l = v2Var14;
                                    this.f141619m = 6;
                                    objC6 = j0VarJ1111.C(this);
                                    break;
                                }
                                if (v2Var11 instanceof v2.a) {
                                    int i111111110 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar1111111119 = i2.f36769a;
                                    a2 a2Var1111111117 = a2.GENERAL;
                                    aVar1111111119.getClass();
                                    i2.a.f(a2Var1111111117, "EventBaseViewModel", strD1111111117);
                                } else if (v2Var8 instanceof v2.a) {
                                    int i111111111 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                    i2.a aVar11111111110 = i2.f36769a;
                                    a2 a2Var1111111118 = a2.GENERAL;
                                    aVar11111111110.getClass();
                                    i2.a.f(a2Var1111111118, "EventBaseViewModel", strD1111111118);
                                } else if (v2Var13 instanceof v2.a) {
                                    int i111111112 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                    i2.a aVar11111111111 = i2.f36769a;
                                    a2 a2Var1111111119 = a2.GENERAL;
                                    aVar11111111111.getClass();
                                    i2.a.f(a2Var1111111119, "EventBaseViewModel", strD1111111119);
                                } else if (v2Var12 instanceof v2.a) {
                                    int i111111113 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                    i2.a aVar11111111112 = i2.f36769a;
                                    a2 a2Var11111111110 = a2.GENERAL;
                                    aVar11111111112.getClass();
                                    i2.a.f(a2Var11111111110, "EventBaseViewModel", strD11111111110);
                                } else if (v2Var15 instanceof v2.a) {
                                    int i21116 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar11111111113 = i2.f36769a;
                                    a2 a2Var11111111111 = a2.GENERAL;
                                    aVar11111111113.getClass();
                                    i2.a.f(a2Var11111111111, "EventBaseViewModel", strD11111111111);
                                } else if (v2Var14 instanceof v2.a) {
                                    int i21117 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                    i2.a aVar11111111114 = i2.f36769a;
                                    a2 a2Var11111111112 = a2.GENERAL;
                                    aVar11111111114.getClass();
                                    i2.a.f(a2Var11111111112, "EventBaseViewModel", strD11111111112);
                                } else {
                                    bVar12 = (mv1.b) bVar20.R0.getValue();
                                    bVar13 = bVar20.Q0;
                                    if (bVar13 != null) {
                                        r14 = bVar13.f121175d;
                                    } else {
                                        r14 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r15 = bVar12.f121175d;
                                    } else {
                                        r15 = hVar;
                                    }
                                    if (r14 != r15) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                                    }
                                    bVar14 = bVar20.Q0;
                                    if (bVar14 != null) {
                                        r16 = bVar14.f121176e;
                                    } else {
                                        r16 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r17 = bVar12.f121176e;
                                    } else {
                                        r17 = hVar;
                                    }
                                    if (r16 != r17) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                    }
                                    bVar15 = bVar20.Q0;
                                    if (bVar15 != null) {
                                        obj2 = bVar15.f121172a;
                                    } else {
                                        obj2 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj3 = bVar12.f121172a;
                                    } else {
                                        obj3 = hVar;
                                    }
                                    if (!s.g(obj2, obj3)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("AvailableTrainingDays");
                                    }
                                    bVar16 = bVar20.Q0;
                                    if (bVar16 != null) {
                                        obj4 = bVar16.f121173b;
                                    } else {
                                        obj4 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj5 = bVar12.f121173b;
                                    } else {
                                        obj5 = hVar;
                                    }
                                    if (!s.g(obj4, obj5)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("LongTrainingDays");
                                    }
                                    bVar17 = bVar20.Q0;
                                    if (bVar17 != null) {
                                        obj6 = bVar17.f121174c;
                                    } else {
                                        obj6 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj7 = bVar12.f121174c;
                                    } else {
                                        obj7 = hVar;
                                    }
                                    if (!s.g(obj6, obj7)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimTrainingDays");
                                    }
                                    bVar18 = bVar20.Q0;
                                    if (bVar18 != null) {
                                        r18 = bVar18.f121177f;
                                    } else {
                                        r18 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r19 = bVar12.f121177f;
                                    } else {
                                        r19 = hVar;
                                    }
                                    if (r18 != r19) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimAbility");
                                    }
                                    bVar19 = bVar20.Q0;
                                    if (bVar19 != null) {
                                        obj8 = bVar19.f121178g;
                                    } else {
                                        obj8 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj9 = bVar12.f121178g;
                                    } else {
                                        obj9 = hVar;
                                    }
                                    if (!s.g(obj8, obj9)) {
                                        rt1.l lVar1113 = rt1.l.f154545a;
                                        if (bVar12 != null) {
                                            hVar2 = hVar;
                                        } else {
                                            hVar2 = hVar;
                                        }
                                        lVar1113.getClass();
                                        linkedHashSet = rt1.l.f154547c;
                                        if (hVar2 != null) {
                                            linkedHashSet.add(hVar2.f166715a);
                                        } else {
                                            linkedHashSet.add(vt1.h.NONE.f180123d);
                                        }
                                    }
                                    rt1.l lVar1114 = rt1.l.f154545a;
                                    vt1.o oVar17 = bVar20.Y;
                                    lVar1114.getClass();
                                    rt1.l.c(oVar17);
                                    bVar20.h5().j(g3.a.e(g3.f35298f));
                                }
                                return Unit.INSTANCE;
                            }
                            hVar = null;
                            v2Var15 = null;
                            if (v2Var11 instanceof v2.a) {
                                int i111111114 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD11111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                i2.a aVar11111111115 = i2.f36769a;
                                a2 a2Var11111111113 = a2.GENERAL;
                                aVar11111111115.getClass();
                                i2.a.f(a2Var11111111113, "EventBaseViewModel", strD11111111113);
                            } else if (v2Var8 instanceof v2.a) {
                                int i111111115 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD11111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                i2.a aVar11111111116 = i2.f36769a;
                                a2 a2Var11111111114 = a2.GENERAL;
                                aVar11111111116.getClass();
                                i2.a.f(a2Var11111111114, "EventBaseViewModel", strD11111111114);
                            } else if (v2Var13 instanceof v2.a) {
                                int i111111116 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD11111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                i2.a aVar11111111117 = i2.f36769a;
                                a2 a2Var11111111115 = a2.GENERAL;
                                aVar11111111117.getClass();
                                i2.a.f(a2Var11111111115, "EventBaseViewModel", strD11111111115);
                            } else if (v2Var12 instanceof v2.a) {
                                int i111111117 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD11111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                i2.a aVar11111111118 = i2.f36769a;
                                a2 a2Var11111111116 = a2.GENERAL;
                                aVar11111111118.getClass();
                                i2.a.f(a2Var11111111116, "EventBaseViewModel", strD11111111116);
                            } else if (v2Var15 instanceof v2.a) {
                                int i21118 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD11111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                i2.a aVar11111111119 = i2.f36769a;
                                a2 a2Var11111111117 = a2.GENERAL;
                                aVar11111111119.getClass();
                                i2.a.f(a2Var11111111117, "EventBaseViewModel", strD11111111117);
                            } else if (v2Var14 instanceof v2.a) {
                                int i21119 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD11111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                i2.a aVar111111111110 = i2.f36769a;
                                a2 a2Var11111111118 = a2.GENERAL;
                                aVar111111111110.getClass();
                                i2.a.f(a2Var11111111118, "EventBaseViewModel", strD11111111118);
                            } else {
                                bVar12 = (mv1.b) bVar20.R0.getValue();
                                bVar13 = bVar20.Q0;
                                if (bVar13 != null) {
                                    r14 = bVar13.f121175d;
                                } else {
                                    r14 = hVar;
                                }
                                if (bVar12 != null) {
                                    r15 = bVar12.f121175d;
                                } else {
                                    r15 = hVar;
                                }
                                if (r14 != r15) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("RunningWorkoutTargetType");
                                }
                                bVar14 = bVar20.Q0;
                                if (bVar14 != null) {
                                    r16 = bVar14.f121176e;
                                } else {
                                    r16 = hVar;
                                }
                                if (bVar12 != null) {
                                    r17 = bVar12.f121176e;
                                } else {
                                    r17 = hVar;
                                }
                                if (r16 != r17) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                }
                                bVar15 = bVar20.Q0;
                                if (bVar15 != null) {
                                    obj2 = bVar15.f121172a;
                                } else {
                                    obj2 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj3 = bVar12.f121172a;
                                } else {
                                    obj3 = hVar;
                                }
                                if (!s.g(obj2, obj3)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("AvailableTrainingDays");
                                }
                                bVar16 = bVar20.Q0;
                                if (bVar16 != null) {
                                    obj4 = bVar16.f121173b;
                                } else {
                                    obj4 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj5 = bVar12.f121173b;
                                } else {
                                    obj5 = hVar;
                                }
                                if (!s.g(obj4, obj5)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("LongTrainingDays");
                                }
                                bVar17 = bVar20.Q0;
                                if (bVar17 != null) {
                                    obj6 = bVar17.f121174c;
                                } else {
                                    obj6 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj7 = bVar12.f121174c;
                                } else {
                                    obj7 = hVar;
                                }
                                if (!s.g(obj6, obj7)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("SwimTrainingDays");
                                }
                                bVar18 = bVar20.Q0;
                                if (bVar18 != null) {
                                    r18 = bVar18.f121177f;
                                } else {
                                    r18 = hVar;
                                }
                                if (bVar12 != null) {
                                    r19 = bVar12.f121177f;
                                } else {
                                    r19 = hVar;
                                }
                                if (r18 != r19) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("SwimAbility");
                                }
                                bVar19 = bVar20.Q0;
                                if (bVar19 != null) {
                                    obj8 = bVar19.f121178g;
                                } else {
                                    obj8 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj9 = bVar12.f121178g;
                                } else {
                                    obj9 = hVar;
                                }
                                if (!s.g(obj8, obj9)) {
                                    rt1.l lVar1115 = rt1.l.f154545a;
                                    if (bVar12 != null) {
                                        hVar2 = hVar;
                                    } else {
                                        hVar2 = hVar;
                                    }
                                    lVar1115.getClass();
                                    linkedHashSet = rt1.l.f154547c;
                                    if (hVar2 != null) {
                                        linkedHashSet.add(hVar2.f166715a);
                                    } else {
                                        linkedHashSet.add(vt1.h.NONE.f180123d);
                                    }
                                }
                                rt1.l lVar1116 = rt1.l.f154545a;
                                vt1.o oVar18 = bVar20.Y;
                                lVar1116.getClass();
                                rt1.l.c(oVar18);
                                bVar20.h5().j(g3.a.e(g3.f35298f));
                            }
                            return Unit.INSTANCE;
                        }
                        o53.j0 j0VarJ1112 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                        this.f141620n = b0Var;
                        this.f141607a = null;
                        this.f141608b = null;
                        this.f141609c = iVar;
                        this.f141610d = null;
                        this.f141611e = null;
                        this.f141612f = null;
                        this.f141613g = null;
                        this.f141614h = v2Var7;
                        this.f141615i = v2Var8;
                        this.f141616j = v2Var9;
                        this.f141617k = v2Var10;
                        this.f141619m = 5;
                        objC5 = j0VarJ1112.C(this);
                    } else if (tVar4 != null) {
                        o53.j0 j0VarJ1113 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                        this.f141620n = b0Var;
                        this.f141607a = null;
                        this.f141608b = null;
                        this.f141609c = iVar;
                        this.f141610d = list4;
                        this.f141611e = null;
                        this.f141612f = null;
                        this.f141613g = null;
                        this.f141614h = v2Var4;
                        this.f141615i = v2Var5;
                        this.f141616j = v2Var6;
                        this.f141619m = 4;
                        objC4 = j0VarJ1113.C(this);
                    } else {
                        v2Var7 = v2Var4;
                        v2Var8 = v2Var5;
                        v2Var9 = v2Var6;
                        v2Var10 = null;
                        bVar10 = bVar20.Q0;
                        if (bVar10 != null) {
                            list5 = bVar10.f121178g;
                        } else {
                            list5 = null;
                        }
                        if (s.g(list4, list5)) {
                            v2 v2Var115 = v2Var9;
                            v2Var11 = v2Var7;
                            v2Var12 = v2Var10;
                            v2Var13 = v2Var115;
                            v2Var14 = null;
                            if (iVar != null) {
                                bVar11 = bVar20.Q0;
                                if (bVar11 != null) {
                                    iVar2 = bVar11.f121177f;
                                } else {
                                    iVar2 = null;
                                }
                                if (iVar != iVar2) {
                                    hVar = null;
                                    o53.j0 j0VarJ1114 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                    this.f141620n = b0Var;
                                    this.f141607a = null;
                                    this.f141608b = null;
                                    this.f141609c = null;
                                    this.f141610d = null;
                                    this.f141611e = null;
                                    this.f141612f = null;
                                    this.f141613g = null;
                                    this.f141614h = v2Var11;
                                    this.f141615i = v2Var8;
                                    this.f141616j = v2Var13;
                                    this.f141617k = v2Var12;
                                    this.f141618l = v2Var14;
                                    this.f141619m = 6;
                                    objC6 = j0VarJ1114.C(this);
                                    break;
                                }
                                if (v2Var11 instanceof v2.a) {
                                    int i111111118 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar111111111111 = i2.f36769a;
                                    a2 a2Var11111111119 = a2.GENERAL;
                                    aVar111111111111.getClass();
                                    i2.a.f(a2Var11111111119, "EventBaseViewModel", strD11111111119);
                                } else if (v2Var8 instanceof v2.a) {
                                    int i111111119 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                    i2.a aVar111111111112 = i2.f36769a;
                                    a2 a2Var111111111110 = a2.GENERAL;
                                    aVar111111111112.getClass();
                                    i2.a.f(a2Var111111111110, "EventBaseViewModel", strD111111111110);
                                } else if (v2Var13 instanceof v2.a) {
                                    int i1111111110 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                    i2.a aVar111111111113 = i2.f36769a;
                                    a2 a2Var111111111111 = a2.GENERAL;
                                    aVar111111111113.getClass();
                                    i2.a.f(a2Var111111111111, "EventBaseViewModel", strD111111111111);
                                } else if (v2Var12 instanceof v2.a) {
                                    int i1111111111 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                    i2.a aVar111111111114 = i2.f36769a;
                                    a2 a2Var111111111112 = a2.GENERAL;
                                    aVar111111111114.getClass();
                                    i2.a.f(a2Var111111111112, "EventBaseViewModel", strD111111111112);
                                } else if (v2Var15 instanceof v2.a) {
                                    int i211110 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar111111111115 = i2.f36769a;
                                    a2 a2Var111111111113 = a2.GENERAL;
                                    aVar111111111115.getClass();
                                    i2.a.f(a2Var111111111113, "EventBaseViewModel", strD111111111113);
                                } else if (v2Var14 instanceof v2.a) {
                                    int i211111 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                    i2.a aVar111111111116 = i2.f36769a;
                                    a2 a2Var111111111114 = a2.GENERAL;
                                    aVar111111111116.getClass();
                                    i2.a.f(a2Var111111111114, "EventBaseViewModel", strD111111111114);
                                } else {
                                    bVar12 = (mv1.b) bVar20.R0.getValue();
                                    bVar13 = bVar20.Q0;
                                    if (bVar13 != null) {
                                        r14 = bVar13.f121175d;
                                    } else {
                                        r14 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r15 = bVar12.f121175d;
                                    } else {
                                        r15 = hVar;
                                    }
                                    if (r14 != r15) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                                    }
                                    bVar14 = bVar20.Q0;
                                    if (bVar14 != null) {
                                        r16 = bVar14.f121176e;
                                    } else {
                                        r16 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r17 = bVar12.f121176e;
                                    } else {
                                        r17 = hVar;
                                    }
                                    if (r16 != r17) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                    }
                                    bVar15 = bVar20.Q0;
                                    if (bVar15 != null) {
                                        obj2 = bVar15.f121172a;
                                    } else {
                                        obj2 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj3 = bVar12.f121172a;
                                    } else {
                                        obj3 = hVar;
                                    }
                                    if (!s.g(obj2, obj3)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("AvailableTrainingDays");
                                    }
                                    bVar16 = bVar20.Q0;
                                    if (bVar16 != null) {
                                        obj4 = bVar16.f121173b;
                                    } else {
                                        obj4 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj5 = bVar12.f121173b;
                                    } else {
                                        obj5 = hVar;
                                    }
                                    if (!s.g(obj4, obj5)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("LongTrainingDays");
                                    }
                                    bVar17 = bVar20.Q0;
                                    if (bVar17 != null) {
                                        obj6 = bVar17.f121174c;
                                    } else {
                                        obj6 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj7 = bVar12.f121174c;
                                    } else {
                                        obj7 = hVar;
                                    }
                                    if (!s.g(obj6, obj7)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimTrainingDays");
                                    }
                                    bVar18 = bVar20.Q0;
                                    if (bVar18 != null) {
                                        r18 = bVar18.f121177f;
                                    } else {
                                        r18 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r19 = bVar12.f121177f;
                                    } else {
                                        r19 = hVar;
                                    }
                                    if (r18 != r19) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimAbility");
                                    }
                                    bVar19 = bVar20.Q0;
                                    if (bVar19 != null) {
                                        obj8 = bVar19.f121178g;
                                    } else {
                                        obj8 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj9 = bVar12.f121178g;
                                    } else {
                                        obj9 = hVar;
                                    }
                                    if (!s.g(obj8, obj9)) {
                                        rt1.l lVar1117 = rt1.l.f154545a;
                                        if (bVar12 != null) {
                                            hVar2 = hVar;
                                        } else {
                                            hVar2 = hVar;
                                        }
                                        lVar1117.getClass();
                                        linkedHashSet = rt1.l.f154547c;
                                        if (hVar2 != null) {
                                            linkedHashSet.add(hVar2.f166715a);
                                        } else {
                                            linkedHashSet.add(vt1.h.NONE.f180123d);
                                        }
                                    }
                                    rt1.l lVar1118 = rt1.l.f154545a;
                                    vt1.o oVar19 = bVar20.Y;
                                    lVar1118.getClass();
                                    rt1.l.c(oVar19);
                                    bVar20.h5().j(g3.a.e(g3.f35298f));
                                }
                                return Unit.INSTANCE;
                            }
                            hVar = null;
                            v2Var15 = null;
                            if (v2Var11 instanceof v2.a) {
                                int i1111111112 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD111111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                i2.a aVar111111111117 = i2.f36769a;
                                a2 a2Var111111111115 = a2.GENERAL;
                                aVar111111111117.getClass();
                                i2.a.f(a2Var111111111115, "EventBaseViewModel", strD111111111115);
                            } else if (v2Var8 instanceof v2.a) {
                                int i1111111113 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD111111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                i2.a aVar111111111118 = i2.f36769a;
                                a2 a2Var111111111116 = a2.GENERAL;
                                aVar111111111118.getClass();
                                i2.a.f(a2Var111111111116, "EventBaseViewModel", strD111111111116);
                            } else if (v2Var13 instanceof v2.a) {
                                int i1111111114 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD111111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                i2.a aVar111111111119 = i2.f36769a;
                                a2 a2Var111111111117 = a2.GENERAL;
                                aVar111111111119.getClass();
                                i2.a.f(a2Var111111111117, "EventBaseViewModel", strD111111111117);
                            } else if (v2Var12 instanceof v2.a) {
                                int i1111111115 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD111111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                i2.a aVar1111111111110 = i2.f36769a;
                                a2 a2Var111111111118 = a2.GENERAL;
                                aVar1111111111110.getClass();
                                i2.a.f(a2Var111111111118, "EventBaseViewModel", strD111111111118);
                            } else if (v2Var15 instanceof v2.a) {
                                int i211112 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD111111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                i2.a aVar1111111111111 = i2.f36769a;
                                a2 a2Var111111111119 = a2.GENERAL;
                                aVar1111111111111.getClass();
                                i2.a.f(a2Var111111111119, "EventBaseViewModel", strD111111111119);
                            } else if (v2Var14 instanceof v2.a) {
                                int i211113 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                i2.a aVar1111111111112 = i2.f36769a;
                                a2 a2Var1111111111110 = a2.GENERAL;
                                aVar1111111111112.getClass();
                                i2.a.f(a2Var1111111111110, "EventBaseViewModel", strD1111111111110);
                            } else {
                                bVar12 = (mv1.b) bVar20.R0.getValue();
                                bVar13 = bVar20.Q0;
                                if (bVar13 != null) {
                                    r14 = bVar13.f121175d;
                                } else {
                                    r14 = hVar;
                                }
                                if (bVar12 != null) {
                                    r15 = bVar12.f121175d;
                                } else {
                                    r15 = hVar;
                                }
                                if (r14 != r15) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("RunningWorkoutTargetType");
                                }
                                bVar14 = bVar20.Q0;
                                if (bVar14 != null) {
                                    r16 = bVar14.f121176e;
                                } else {
                                    r16 = hVar;
                                }
                                if (bVar12 != null) {
                                    r17 = bVar12.f121176e;
                                } else {
                                    r17 = hVar;
                                }
                                if (r16 != r17) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                }
                                bVar15 = bVar20.Q0;
                                if (bVar15 != null) {
                                    obj2 = bVar15.f121172a;
                                } else {
                                    obj2 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj3 = bVar12.f121172a;
                                } else {
                                    obj3 = hVar;
                                }
                                if (!s.g(obj2, obj3)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("AvailableTrainingDays");
                                }
                                bVar16 = bVar20.Q0;
                                if (bVar16 != null) {
                                    obj4 = bVar16.f121173b;
                                } else {
                                    obj4 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj5 = bVar12.f121173b;
                                } else {
                                    obj5 = hVar;
                                }
                                if (!s.g(obj4, obj5)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("LongTrainingDays");
                                }
                                bVar17 = bVar20.Q0;
                                if (bVar17 != null) {
                                    obj6 = bVar17.f121174c;
                                } else {
                                    obj6 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj7 = bVar12.f121174c;
                                } else {
                                    obj7 = hVar;
                                }
                                if (!s.g(obj6, obj7)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("SwimTrainingDays");
                                }
                                bVar18 = bVar20.Q0;
                                if (bVar18 != null) {
                                    r18 = bVar18.f121177f;
                                } else {
                                    r18 = hVar;
                                }
                                if (bVar12 != null) {
                                    r19 = bVar12.f121177f;
                                } else {
                                    r19 = hVar;
                                }
                                if (r18 != r19) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("SwimAbility");
                                }
                                bVar19 = bVar20.Q0;
                                if (bVar19 != null) {
                                    obj8 = bVar19.f121178g;
                                } else {
                                    obj8 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj9 = bVar12.f121178g;
                                } else {
                                    obj9 = hVar;
                                }
                                if (!s.g(obj8, obj9)) {
                                    rt1.l lVar1119 = rt1.l.f154545a;
                                    if (bVar12 != null) {
                                        hVar2 = hVar;
                                    } else {
                                        hVar2 = hVar;
                                    }
                                    lVar1119.getClass();
                                    linkedHashSet = rt1.l.f154547c;
                                    if (hVar2 != null) {
                                        linkedHashSet.add(hVar2.f166715a);
                                    } else {
                                        linkedHashSet.add(vt1.h.NONE.f180123d);
                                    }
                                }
                                rt1.l lVar11110 = rt1.l.f154545a;
                                vt1.o oVar110 = bVar20.Y;
                                lVar11110.getClass();
                                rt1.l.c(oVar110);
                                bVar20.h5().j(g3.a.e(g3.f35298f));
                            }
                            return Unit.INSTANCE;
                        }
                        o53.j0 j0VarJ1115 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                        this.f141620n = b0Var;
                        this.f141607a = null;
                        this.f141608b = null;
                        this.f141609c = iVar;
                        this.f141610d = null;
                        this.f141611e = null;
                        this.f141612f = null;
                        this.f141613g = null;
                        this.f141614h = v2Var7;
                        this.f141615i = v2Var8;
                        this.f141616j = v2Var9;
                        this.f141617k = v2Var10;
                        this.f141619m = 5;
                        objC5 = j0VarJ1115.C(this);
                    }
                    break;
                } else {
                    o53.j0 j0VarJ121 = ge1.b.j(b0Var, null, null, new a(bVar20, bVar4, null), 3);
                    this.f141620n = b0Var;
                    this.f141607a = cVar;
                    this.f141608b = cVar2;
                    this.f141609c = iVar;
                    this.f141610d = list4;
                    this.f141611e = null;
                    this.f141612f = null;
                    this.f141613g = tVar4;
                    this.f141614h = v2Var2;
                    this.f141615i = v2Var3;
                    this.f141619m = 3;
                    objC3 = j0VarJ121.C(this);
                    if (objC3 != aVar) {
                        tVar5 = tVar4;
                        tVar4 = tVar5;
                        v2Var4 = v2Var2;
                        v2Var5 = v2Var3;
                        v2Var6 = (v2) objC3;
                        bVar9 = bVar20.Q0;
                        if (bVar9 != null) {
                            cVar5 = bVar9.f121175d;
                        } else {
                            cVar5 = null;
                        }
                        if (cVar != cVar5) {
                            if (bVar9 != null) {
                                cVar6 = bVar9.f121176e;
                            } else {
                                cVar6 = null;
                            }
                            if (cVar2 != cVar6) {
                                if (tVar4 != null) {
                                    o53.j0 j0VarJ1116 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                                    this.f141620n = b0Var;
                                    this.f141607a = null;
                                    this.f141608b = null;
                                    this.f141609c = iVar;
                                    this.f141610d = list4;
                                    this.f141611e = null;
                                    this.f141612f = null;
                                    this.f141613g = null;
                                    this.f141614h = v2Var4;
                                    this.f141615i = v2Var5;
                                    this.f141616j = v2Var6;
                                    this.f141619m = 4;
                                    objC4 = j0VarJ1116.C(this);
                                }
                            }
                            v2Var7 = v2Var4;
                            v2Var8 = v2Var5;
                            v2Var9 = v2Var6;
                            v2Var10 = null;
                            bVar10 = bVar20.Q0;
                            if (bVar10 != null) {
                                list5 = bVar10.f121178g;
                            } else {
                                list5 = null;
                            }
                            if (s.g(list4, list5)) {
                                v2 v2Var116 = v2Var9;
                                v2Var11 = v2Var7;
                                v2Var12 = v2Var10;
                                v2Var13 = v2Var116;
                                v2Var14 = null;
                                if (iVar != null) {
                                    bVar11 = bVar20.Q0;
                                    if (bVar11 != null) {
                                        iVar2 = bVar11.f121177f;
                                    } else {
                                        iVar2 = null;
                                    }
                                    if (iVar != iVar2) {
                                        hVar = null;
                                        o53.j0 j0VarJ1117 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                        this.f141620n = b0Var;
                                        this.f141607a = null;
                                        this.f141608b = null;
                                        this.f141609c = null;
                                        this.f141610d = null;
                                        this.f141611e = null;
                                        this.f141612f = null;
                                        this.f141613g = null;
                                        this.f141614h = v2Var11;
                                        this.f141615i = v2Var8;
                                        this.f141616j = v2Var13;
                                        this.f141617k = v2Var12;
                                        this.f141618l = v2Var14;
                                        this.f141619m = 6;
                                        objC6 = j0VarJ1117.C(this);
                                        break;
                                    }
                                    if (v2Var11 instanceof v2.a) {
                                        int i1111111116 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar1111111111113 = i2.f36769a;
                                        a2 a2Var1111111111111 = a2.GENERAL;
                                        aVar1111111111113.getClass();
                                        i2.a.f(a2Var1111111111111, "EventBaseViewModel", strD1111111111111);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i1111111117 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar1111111111114 = i2.f36769a;
                                        a2 a2Var1111111111112 = a2.GENERAL;
                                        aVar1111111111114.getClass();
                                        i2.a.f(a2Var1111111111112, "EventBaseViewModel", strD1111111111112);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i1111111118 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar1111111111115 = i2.f36769a;
                                        a2 a2Var1111111111113 = a2.GENERAL;
                                        aVar1111111111115.getClass();
                                        i2.a.f(a2Var1111111111113, "EventBaseViewModel", strD1111111111113);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i1111111119 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar1111111111116 = i2.f36769a;
                                        a2 a2Var1111111111114 = a2.GENERAL;
                                        aVar1111111111116.getClass();
                                        i2.a.f(a2Var1111111111114, "EventBaseViewModel", strD1111111111114);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i211114 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar1111111111117 = i2.f36769a;
                                        a2 a2Var1111111111115 = a2.GENERAL;
                                        aVar1111111111117.getClass();
                                        i2.a.f(a2Var1111111111115, "EventBaseViewModel", strD1111111111115);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i211115 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD1111111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar1111111111118 = i2.f36769a;
                                        a2 a2Var1111111111116 = a2.GENERAL;
                                        aVar1111111111118.getClass();
                                        i2.a.f(a2Var1111111111116, "EventBaseViewModel", strD1111111111116);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar11111 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar11111.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar11112 = rt1.l.f154545a;
                                        vt1.o oVar111 = bVar20.Y;
                                        lVar11112.getClass();
                                        rt1.l.c(oVar111);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                hVar = null;
                                v2Var15 = null;
                                if (v2Var11 instanceof v2.a) {
                                    int i11111111110 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar1111111111119 = i2.f36769a;
                                    a2 a2Var1111111111117 = a2.GENERAL;
                                    aVar1111111111119.getClass();
                                    i2.a.f(a2Var1111111111117, "EventBaseViewModel", strD1111111111117);
                                } else if (v2Var8 instanceof v2.a) {
                                    int i11111111111 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                    i2.a aVar11111111111110 = i2.f36769a;
                                    a2 a2Var1111111111118 = a2.GENERAL;
                                    aVar11111111111110.getClass();
                                    i2.a.f(a2Var1111111111118, "EventBaseViewModel", strD1111111111118);
                                } else if (v2Var13 instanceof v2.a) {
                                    int i11111111112 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                    i2.a aVar11111111111111 = i2.f36769a;
                                    a2 a2Var1111111111119 = a2.GENERAL;
                                    aVar11111111111111.getClass();
                                    i2.a.f(a2Var1111111111119, "EventBaseViewModel", strD1111111111119);
                                } else if (v2Var12 instanceof v2.a) {
                                    int i11111111113 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11111111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                    i2.a aVar11111111111112 = i2.f36769a;
                                    a2 a2Var11111111111110 = a2.GENERAL;
                                    aVar11111111111112.getClass();
                                    i2.a.f(a2Var11111111111110, "EventBaseViewModel", strD11111111111110);
                                } else if (v2Var15 instanceof v2.a) {
                                    int i211116 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11111111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar11111111111113 = i2.f36769a;
                                    a2 a2Var11111111111111 = a2.GENERAL;
                                    aVar11111111111113.getClass();
                                    i2.a.f(a2Var11111111111111, "EventBaseViewModel", strD11111111111111);
                                } else if (v2Var14 instanceof v2.a) {
                                    int i211117 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11111111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                    i2.a aVar11111111111114 = i2.f36769a;
                                    a2 a2Var11111111111112 = a2.GENERAL;
                                    aVar11111111111114.getClass();
                                    i2.a.f(a2Var11111111111112, "EventBaseViewModel", strD11111111111112);
                                } else {
                                    bVar12 = (mv1.b) bVar20.R0.getValue();
                                    bVar13 = bVar20.Q0;
                                    if (bVar13 != null) {
                                        r14 = bVar13.f121175d;
                                    } else {
                                        r14 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r15 = bVar12.f121175d;
                                    } else {
                                        r15 = hVar;
                                    }
                                    if (r14 != r15) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                                    }
                                    bVar14 = bVar20.Q0;
                                    if (bVar14 != null) {
                                        r16 = bVar14.f121176e;
                                    } else {
                                        r16 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r17 = bVar12.f121176e;
                                    } else {
                                        r17 = hVar;
                                    }
                                    if (r16 != r17) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                    }
                                    bVar15 = bVar20.Q0;
                                    if (bVar15 != null) {
                                        obj2 = bVar15.f121172a;
                                    } else {
                                        obj2 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj3 = bVar12.f121172a;
                                    } else {
                                        obj3 = hVar;
                                    }
                                    if (!s.g(obj2, obj3)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("AvailableTrainingDays");
                                    }
                                    bVar16 = bVar20.Q0;
                                    if (bVar16 != null) {
                                        obj4 = bVar16.f121173b;
                                    } else {
                                        obj4 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj5 = bVar12.f121173b;
                                    } else {
                                        obj5 = hVar;
                                    }
                                    if (!s.g(obj4, obj5)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("LongTrainingDays");
                                    }
                                    bVar17 = bVar20.Q0;
                                    if (bVar17 != null) {
                                        obj6 = bVar17.f121174c;
                                    } else {
                                        obj6 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj7 = bVar12.f121174c;
                                    } else {
                                        obj7 = hVar;
                                    }
                                    if (!s.g(obj6, obj7)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimTrainingDays");
                                    }
                                    bVar18 = bVar20.Q0;
                                    if (bVar18 != null) {
                                        r18 = bVar18.f121177f;
                                    } else {
                                        r18 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r19 = bVar12.f121177f;
                                    } else {
                                        r19 = hVar;
                                    }
                                    if (r18 != r19) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimAbility");
                                    }
                                    bVar19 = bVar20.Q0;
                                    if (bVar19 != null) {
                                        obj8 = bVar19.f121178g;
                                    } else {
                                        obj8 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj9 = bVar12.f121178g;
                                    } else {
                                        obj9 = hVar;
                                    }
                                    if (!s.g(obj8, obj9)) {
                                        rt1.l lVar11113 = rt1.l.f154545a;
                                        if (bVar12 != null) {
                                            hVar2 = hVar;
                                        } else {
                                            hVar2 = hVar;
                                        }
                                        lVar11113.getClass();
                                        linkedHashSet = rt1.l.f154547c;
                                        if (hVar2 != null) {
                                            linkedHashSet.add(hVar2.f166715a);
                                        } else {
                                            linkedHashSet.add(vt1.h.NONE.f180123d);
                                        }
                                    }
                                    rt1.l lVar11114 = rt1.l.f154545a;
                                    vt1.o oVar112 = bVar20.Y;
                                    lVar11114.getClass();
                                    rt1.l.c(oVar112);
                                    bVar20.h5().j(g3.a.e(g3.f35298f));
                                }
                                return Unit.INSTANCE;
                            }
                            o53.j0 j0VarJ1118 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = null;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var7;
                            this.f141615i = v2Var8;
                            this.f141616j = v2Var9;
                            this.f141617k = v2Var10;
                            this.f141619m = 5;
                            objC5 = j0VarJ1118.C(this);
                        } else if (tVar4 != null) {
                            o53.j0 j0VarJ1119 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = list4;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var4;
                            this.f141615i = v2Var5;
                            this.f141616j = v2Var6;
                            this.f141619m = 4;
                            objC4 = j0VarJ1119.C(this);
                        } else {
                            v2Var7 = v2Var4;
                            v2Var8 = v2Var5;
                            v2Var9 = v2Var6;
                            v2Var10 = null;
                            bVar10 = bVar20.Q0;
                            if (bVar10 != null) {
                                list5 = bVar10.f121178g;
                            } else {
                                list5 = null;
                            }
                            if (s.g(list4, list5)) {
                                v2 v2Var117 = v2Var9;
                                v2Var11 = v2Var7;
                                v2Var12 = v2Var10;
                                v2Var13 = v2Var117;
                                v2Var14 = null;
                                if (iVar != null) {
                                    bVar11 = bVar20.Q0;
                                    if (bVar11 != null) {
                                        iVar2 = bVar11.f121177f;
                                    } else {
                                        iVar2 = null;
                                    }
                                    if (iVar != iVar2) {
                                        hVar = null;
                                        o53.j0 j0VarJ11110 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                        this.f141620n = b0Var;
                                        this.f141607a = null;
                                        this.f141608b = null;
                                        this.f141609c = null;
                                        this.f141610d = null;
                                        this.f141611e = null;
                                        this.f141612f = null;
                                        this.f141613g = null;
                                        this.f141614h = v2Var11;
                                        this.f141615i = v2Var8;
                                        this.f141616j = v2Var13;
                                        this.f141617k = v2Var12;
                                        this.f141618l = v2Var14;
                                        this.f141619m = 6;
                                        objC6 = j0VarJ11110.C(this);
                                        break;
                                    }
                                    if (v2Var11 instanceof v2.a) {
                                        int i11111111114 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar11111111111115 = i2.f36769a;
                                        a2 a2Var11111111111113 = a2.GENERAL;
                                        aVar11111111111115.getClass();
                                        i2.a.f(a2Var11111111111113, "EventBaseViewModel", strD11111111111113);
                                    } else if (v2Var8 instanceof v2.a) {
                                        int i11111111115 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                        i2.a aVar11111111111116 = i2.f36769a;
                                        a2 a2Var11111111111114 = a2.GENERAL;
                                        aVar11111111111116.getClass();
                                        i2.a.f(a2Var11111111111114, "EventBaseViewModel", strD11111111111114);
                                    } else if (v2Var13 instanceof v2.a) {
                                        int i11111111116 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                        i2.a aVar11111111111117 = i2.f36769a;
                                        a2 a2Var11111111111115 = a2.GENERAL;
                                        aVar11111111111117.getClass();
                                        i2.a.f(a2Var11111111111115, "EventBaseViewModel", strD11111111111115);
                                    } else if (v2Var12 instanceof v2.a) {
                                        int i11111111117 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                        i2.a aVar11111111111118 = i2.f36769a;
                                        a2 a2Var11111111111116 = a2.GENERAL;
                                        aVar11111111111118.getClass();
                                        i2.a.f(a2Var11111111111116, "EventBaseViewModel", strD11111111111116);
                                    } else if (v2Var15 instanceof v2.a) {
                                        int i211118 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                        i2.a aVar11111111111119 = i2.f36769a;
                                        a2 a2Var11111111111117 = a2.GENERAL;
                                        aVar11111111111119.getClass();
                                        i2.a.f(a2Var11111111111117, "EventBaseViewModel", strD11111111111117);
                                    } else if (v2Var14 instanceof v2.a) {
                                        int i211119 = pv1.b.f141488i1;
                                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                        String strD11111111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                        i2.a aVar111111111111110 = i2.f36769a;
                                        a2 a2Var11111111111118 = a2.GENERAL;
                                        aVar111111111111110.getClass();
                                        i2.a.f(a2Var11111111111118, "EventBaseViewModel", strD11111111111118);
                                    } else {
                                        bVar12 = (mv1.b) bVar20.R0.getValue();
                                        bVar13 = bVar20.Q0;
                                        if (bVar13 != null) {
                                            r14 = bVar13.f121175d;
                                        } else {
                                            r14 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r15 = bVar12.f121175d;
                                        } else {
                                            r15 = hVar;
                                        }
                                        if (r14 != r15) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                                        }
                                        bVar14 = bVar20.Q0;
                                        if (bVar14 != null) {
                                            r16 = bVar14.f121176e;
                                        } else {
                                            r16 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r17 = bVar12.f121176e;
                                        } else {
                                            r17 = hVar;
                                        }
                                        if (r16 != r17) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                        }
                                        bVar15 = bVar20.Q0;
                                        if (bVar15 != null) {
                                            obj2 = bVar15.f121172a;
                                        } else {
                                            obj2 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj3 = bVar12.f121172a;
                                        } else {
                                            obj3 = hVar;
                                        }
                                        if (!s.g(obj2, obj3)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("AvailableTrainingDays");
                                        }
                                        bVar16 = bVar20.Q0;
                                        if (bVar16 != null) {
                                            obj4 = bVar16.f121173b;
                                        } else {
                                            obj4 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj5 = bVar12.f121173b;
                                        } else {
                                            obj5 = hVar;
                                        }
                                        if (!s.g(obj4, obj5)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("LongTrainingDays");
                                        }
                                        bVar17 = bVar20.Q0;
                                        if (bVar17 != null) {
                                            obj6 = bVar17.f121174c;
                                        } else {
                                            obj6 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj7 = bVar12.f121174c;
                                        } else {
                                            obj7 = hVar;
                                        }
                                        if (!s.g(obj6, obj7)) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimTrainingDays");
                                        }
                                        bVar18 = bVar20.Q0;
                                        if (bVar18 != null) {
                                            r18 = bVar18.f121177f;
                                        } else {
                                            r18 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            r19 = bVar12.f121177f;
                                        } else {
                                            r19 = hVar;
                                        }
                                        if (r18 != r19) {
                                            rt1.l.f154545a.getClass();
                                            rt1.l.f154547c.add("SwimAbility");
                                        }
                                        bVar19 = bVar20.Q0;
                                        if (bVar19 != null) {
                                            obj8 = bVar19.f121178g;
                                        } else {
                                            obj8 = hVar;
                                        }
                                        if (bVar12 != null) {
                                            obj9 = bVar12.f121178g;
                                        } else {
                                            obj9 = hVar;
                                        }
                                        if (!s.g(obj8, obj9)) {
                                            rt1.l lVar11115 = rt1.l.f154545a;
                                            if (bVar12 != null) {
                                                hVar2 = hVar;
                                            } else {
                                                hVar2 = hVar;
                                            }
                                            lVar11115.getClass();
                                            linkedHashSet = rt1.l.f154547c;
                                            if (hVar2 != null) {
                                                linkedHashSet.add(hVar2.f166715a);
                                            } else {
                                                linkedHashSet.add(vt1.h.NONE.f180123d);
                                            }
                                        }
                                        rt1.l lVar11116 = rt1.l.f154545a;
                                        vt1.o oVar113 = bVar20.Y;
                                        lVar11116.getClass();
                                        rt1.l.c(oVar113);
                                        bVar20.h5().j(g3.a.e(g3.f35298f));
                                    }
                                    return Unit.INSTANCE;
                                }
                                hVar = null;
                                v2Var15 = null;
                                if (v2Var11 instanceof v2.a) {
                                    int i11111111118 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD11111111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar111111111111111 = i2.f36769a;
                                    a2 a2Var11111111111119 = a2.GENERAL;
                                    aVar111111111111111.getClass();
                                    i2.a.f(a2Var11111111111119, "EventBaseViewModel", strD11111111111119);
                                } else if (v2Var8 instanceof v2.a) {
                                    int i11111111119 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                    i2.a aVar111111111111112 = i2.f36769a;
                                    a2 a2Var111111111111110 = a2.GENERAL;
                                    aVar111111111111112.getClass();
                                    i2.a.f(a2Var111111111111110, "EventBaseViewModel", strD111111111111110);
                                } else if (v2Var13 instanceof v2.a) {
                                    int i111111111110 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                    i2.a aVar111111111111113 = i2.f36769a;
                                    a2 a2Var111111111111111 = a2.GENERAL;
                                    aVar111111111111113.getClass();
                                    i2.a.f(a2Var111111111111111, "EventBaseViewModel", strD111111111111111);
                                } else if (v2Var12 instanceof v2.a) {
                                    int i111111111111 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                    i2.a aVar111111111111114 = i2.f36769a;
                                    a2 a2Var111111111111112 = a2.GENERAL;
                                    aVar111111111111114.getClass();
                                    i2.a.f(a2Var111111111111112, "EventBaseViewModel", strD111111111111112);
                                } else if (v2Var15 instanceof v2.a) {
                                    int i2111110 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar111111111111115 = i2.f36769a;
                                    a2 a2Var111111111111113 = a2.GENERAL;
                                    aVar111111111111115.getClass();
                                    i2.a.f(a2Var111111111111113, "EventBaseViewModel", strD111111111111113);
                                } else if (v2Var14 instanceof v2.a) {
                                    int i2111111 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                    i2.a aVar111111111111116 = i2.f36769a;
                                    a2 a2Var111111111111114 = a2.GENERAL;
                                    aVar111111111111116.getClass();
                                    i2.a.f(a2Var111111111111114, "EventBaseViewModel", strD111111111111114);
                                } else {
                                    bVar12 = (mv1.b) bVar20.R0.getValue();
                                    bVar13 = bVar20.Q0;
                                    if (bVar13 != null) {
                                        r14 = bVar13.f121175d;
                                    } else {
                                        r14 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r15 = bVar12.f121175d;
                                    } else {
                                        r15 = hVar;
                                    }
                                    if (r14 != r15) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                                    }
                                    bVar14 = bVar20.Q0;
                                    if (bVar14 != null) {
                                        r16 = bVar14.f121176e;
                                    } else {
                                        r16 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r17 = bVar12.f121176e;
                                    } else {
                                        r17 = hVar;
                                    }
                                    if (r16 != r17) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                    }
                                    bVar15 = bVar20.Q0;
                                    if (bVar15 != null) {
                                        obj2 = bVar15.f121172a;
                                    } else {
                                        obj2 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj3 = bVar12.f121172a;
                                    } else {
                                        obj3 = hVar;
                                    }
                                    if (!s.g(obj2, obj3)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("AvailableTrainingDays");
                                    }
                                    bVar16 = bVar20.Q0;
                                    if (bVar16 != null) {
                                        obj4 = bVar16.f121173b;
                                    } else {
                                        obj4 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj5 = bVar12.f121173b;
                                    } else {
                                        obj5 = hVar;
                                    }
                                    if (!s.g(obj4, obj5)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("LongTrainingDays");
                                    }
                                    bVar17 = bVar20.Q0;
                                    if (bVar17 != null) {
                                        obj6 = bVar17.f121174c;
                                    } else {
                                        obj6 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj7 = bVar12.f121174c;
                                    } else {
                                        obj7 = hVar;
                                    }
                                    if (!s.g(obj6, obj7)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimTrainingDays");
                                    }
                                    bVar18 = bVar20.Q0;
                                    if (bVar18 != null) {
                                        r18 = bVar18.f121177f;
                                    } else {
                                        r18 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r19 = bVar12.f121177f;
                                    } else {
                                        r19 = hVar;
                                    }
                                    if (r18 != r19) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimAbility");
                                    }
                                    bVar19 = bVar20.Q0;
                                    if (bVar19 != null) {
                                        obj8 = bVar19.f121178g;
                                    } else {
                                        obj8 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj9 = bVar12.f121178g;
                                    } else {
                                        obj9 = hVar;
                                    }
                                    if (!s.g(obj8, obj9)) {
                                        rt1.l lVar11117 = rt1.l.f154545a;
                                        if (bVar12 != null) {
                                            hVar2 = hVar;
                                        } else {
                                            hVar2 = hVar;
                                        }
                                        lVar11117.getClass();
                                        linkedHashSet = rt1.l.f154547c;
                                        if (hVar2 != null) {
                                            linkedHashSet.add(hVar2.f166715a);
                                        } else {
                                            linkedHashSet.add(vt1.h.NONE.f180123d);
                                        }
                                    }
                                    rt1.l lVar11118 = rt1.l.f154545a;
                                    vt1.o oVar114 = bVar20.Y;
                                    lVar11118.getClass();
                                    rt1.l.c(oVar114);
                                    bVar20.h5().j(g3.a.e(g3.f35298f));
                                }
                                return Unit.INSTANCE;
                            }
                            o53.j0 j0VarJ11111 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = null;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var7;
                            this.f141615i = v2Var8;
                            this.f141616j = v2Var9;
                            this.f141617k = v2Var10;
                            this.f141619m = 5;
                            objC5 = j0VarJ11111.C(this);
                        }
                    }
                    break;
                }
                return aVar;
            case 3:
                v2Var3 = this.f141615i;
                v2Var2 = this.f141614h;
                tVar5 = this.f141613g;
                List<tw1.h> list15 = this.f141610d;
                iVar = this.f141609c;
                cVar2 = this.f141608b;
                cVar = this.f141607a;
                r.b(obj);
                objC3 = obj;
                list4 = list15;
                aVar = aVar2;
                tVar4 = tVar5;
                v2Var4 = v2Var2;
                v2Var5 = v2Var3;
                v2Var6 = (v2) objC3;
                bVar9 = bVar20.Q0;
                if (bVar9 != null) {
                    cVar5 = bVar9.f121175d;
                } else {
                    cVar5 = null;
                }
                if (cVar != cVar5) {
                    if (tVar4 != null) {
                        o53.j0 j0VarJ11112 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                        this.f141620n = b0Var;
                        this.f141607a = null;
                        this.f141608b = null;
                        this.f141609c = iVar;
                        this.f141610d = list4;
                        this.f141611e = null;
                        this.f141612f = null;
                        this.f141613g = null;
                        this.f141614h = v2Var4;
                        this.f141615i = v2Var5;
                        this.f141616j = v2Var6;
                        this.f141619m = 4;
                        objC4 = j0VarJ11112.C(this);
                    } else {
                        v2Var7 = v2Var4;
                        v2Var8 = v2Var5;
                        v2Var9 = v2Var6;
                        v2Var10 = null;
                        bVar10 = bVar20.Q0;
                        if (bVar10 != null) {
                            list5 = bVar10.f121178g;
                        } else {
                            list5 = null;
                        }
                        if (s.g(list4, list5)) {
                            v2 v2Var118 = v2Var9;
                            v2Var11 = v2Var7;
                            v2Var12 = v2Var10;
                            v2Var13 = v2Var118;
                            v2Var14 = null;
                            if (iVar != null) {
                                bVar11 = bVar20.Q0;
                                if (bVar11 != null) {
                                    iVar2 = bVar11.f121177f;
                                } else {
                                    iVar2 = null;
                                }
                                if (iVar != iVar2) {
                                    hVar = null;
                                    o53.j0 j0VarJ11113 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                    this.f141620n = b0Var;
                                    this.f141607a = null;
                                    this.f141608b = null;
                                    this.f141609c = null;
                                    this.f141610d = null;
                                    this.f141611e = null;
                                    this.f141612f = null;
                                    this.f141613g = null;
                                    this.f141614h = v2Var11;
                                    this.f141615i = v2Var8;
                                    this.f141616j = v2Var13;
                                    this.f141617k = v2Var12;
                                    this.f141618l = v2Var14;
                                    this.f141619m = 6;
                                    objC6 = j0VarJ11113.C(this);
                                    break;
                                }
                                if (v2Var11 instanceof v2.a) {
                                    int i111111111112 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar111111111111117 = i2.f36769a;
                                    a2 a2Var111111111111115 = a2.GENERAL;
                                    aVar111111111111117.getClass();
                                    i2.a.f(a2Var111111111111115, "EventBaseViewModel", strD111111111111115);
                                } else if (v2Var8 instanceof v2.a) {
                                    int i111111111113 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                    i2.a aVar111111111111118 = i2.f36769a;
                                    a2 a2Var111111111111116 = a2.GENERAL;
                                    aVar111111111111118.getClass();
                                    i2.a.f(a2Var111111111111116, "EventBaseViewModel", strD111111111111116);
                                } else if (v2Var13 instanceof v2.a) {
                                    int i111111111114 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                    i2.a aVar111111111111119 = i2.f36769a;
                                    a2 a2Var111111111111117 = a2.GENERAL;
                                    aVar111111111111119.getClass();
                                    i2.a.f(a2Var111111111111117, "EventBaseViewModel", strD111111111111117);
                                } else if (v2Var12 instanceof v2.a) {
                                    int i111111111115 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                    i2.a aVar1111111111111110 = i2.f36769a;
                                    a2 a2Var111111111111118 = a2.GENERAL;
                                    aVar1111111111111110.getClass();
                                    i2.a.f(a2Var111111111111118, "EventBaseViewModel", strD111111111111118);
                                } else if (v2Var15 instanceof v2.a) {
                                    int i2111112 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD111111111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                    i2.a aVar1111111111111111 = i2.f36769a;
                                    a2 a2Var111111111111119 = a2.GENERAL;
                                    aVar1111111111111111.getClass();
                                    i2.a.f(a2Var111111111111119, "EventBaseViewModel", strD111111111111119);
                                } else if (v2Var14 instanceof v2.a) {
                                    int i2111113 = pv1.b.f141488i1;
                                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                    String strD1111111111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                    i2.a aVar1111111111111112 = i2.f36769a;
                                    a2 a2Var1111111111111110 = a2.GENERAL;
                                    aVar1111111111111112.getClass();
                                    i2.a.f(a2Var1111111111111110, "EventBaseViewModel", strD1111111111111110);
                                } else {
                                    bVar12 = (mv1.b) bVar20.R0.getValue();
                                    bVar13 = bVar20.Q0;
                                    if (bVar13 != null) {
                                        r14 = bVar13.f121175d;
                                    } else {
                                        r14 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r15 = bVar12.f121175d;
                                    } else {
                                        r15 = hVar;
                                    }
                                    if (r14 != r15) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                                    }
                                    bVar14 = bVar20.Q0;
                                    if (bVar14 != null) {
                                        r16 = bVar14.f121176e;
                                    } else {
                                        r16 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r17 = bVar12.f121176e;
                                    } else {
                                        r17 = hVar;
                                    }
                                    if (r16 != r17) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                    }
                                    bVar15 = bVar20.Q0;
                                    if (bVar15 != null) {
                                        obj2 = bVar15.f121172a;
                                    } else {
                                        obj2 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj3 = bVar12.f121172a;
                                    } else {
                                        obj3 = hVar;
                                    }
                                    if (!s.g(obj2, obj3)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("AvailableTrainingDays");
                                    }
                                    bVar16 = bVar20.Q0;
                                    if (bVar16 != null) {
                                        obj4 = bVar16.f121173b;
                                    } else {
                                        obj4 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj5 = bVar12.f121173b;
                                    } else {
                                        obj5 = hVar;
                                    }
                                    if (!s.g(obj4, obj5)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("LongTrainingDays");
                                    }
                                    bVar17 = bVar20.Q0;
                                    if (bVar17 != null) {
                                        obj6 = bVar17.f121174c;
                                    } else {
                                        obj6 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj7 = bVar12.f121174c;
                                    } else {
                                        obj7 = hVar;
                                    }
                                    if (!s.g(obj6, obj7)) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimTrainingDays");
                                    }
                                    bVar18 = bVar20.Q0;
                                    if (bVar18 != null) {
                                        r18 = bVar18.f121177f;
                                    } else {
                                        r18 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        r19 = bVar12.f121177f;
                                    } else {
                                        r19 = hVar;
                                    }
                                    if (r18 != r19) {
                                        rt1.l.f154545a.getClass();
                                        rt1.l.f154547c.add("SwimAbility");
                                    }
                                    bVar19 = bVar20.Q0;
                                    if (bVar19 != null) {
                                        obj8 = bVar19.f121178g;
                                    } else {
                                        obj8 = hVar;
                                    }
                                    if (bVar12 != null) {
                                        obj9 = bVar12.f121178g;
                                    } else {
                                        obj9 = hVar;
                                    }
                                    if (!s.g(obj8, obj9)) {
                                        rt1.l lVar11119 = rt1.l.f154545a;
                                        if (bVar12 != null) {
                                            hVar2 = hVar;
                                        } else {
                                            hVar2 = hVar;
                                        }
                                        lVar11119.getClass();
                                        linkedHashSet = rt1.l.f154547c;
                                        if (hVar2 != null) {
                                            linkedHashSet.add(hVar2.f166715a);
                                        } else {
                                            linkedHashSet.add(vt1.h.NONE.f180123d);
                                        }
                                    }
                                    rt1.l lVar111110 = rt1.l.f154545a;
                                    vt1.o oVar115 = bVar20.Y;
                                    lVar111110.getClass();
                                    rt1.l.c(oVar115);
                                    bVar20.h5().j(g3.a.e(g3.f35298f));
                                }
                                return Unit.INSTANCE;
                            }
                            hVar = null;
                            v2Var15 = null;
                            if (v2Var11 instanceof v2.a) {
                                int i111111111116 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                i2.a aVar1111111111111113 = i2.f36769a;
                                a2 a2Var1111111111111111 = a2.GENERAL;
                                aVar1111111111111113.getClass();
                                i2.a.f(a2Var1111111111111111, "EventBaseViewModel", strD1111111111111111);
                            } else if (v2Var8 instanceof v2.a) {
                                int i111111111117 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                i2.a aVar1111111111111114 = i2.f36769a;
                                a2 a2Var1111111111111112 = a2.GENERAL;
                                aVar1111111111111114.getClass();
                                i2.a.f(a2Var1111111111111112, "EventBaseViewModel", strD1111111111111112);
                            } else if (v2Var13 instanceof v2.a) {
                                int i111111111118 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                i2.a aVar1111111111111115 = i2.f36769a;
                                a2 a2Var1111111111111113 = a2.GENERAL;
                                aVar1111111111111115.getClass();
                                i2.a.f(a2Var1111111111111113, "EventBaseViewModel", strD1111111111111113);
                            } else if (v2Var12 instanceof v2.a) {
                                int i111111111119 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                i2.a aVar1111111111111116 = i2.f36769a;
                                a2 a2Var1111111111111114 = a2.GENERAL;
                                aVar1111111111111116.getClass();
                                i2.a.f(a2Var1111111111111114, "EventBaseViewModel", strD1111111111111114);
                            } else if (v2Var15 instanceof v2.a) {
                                int i2111114 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                i2.a aVar1111111111111117 = i2.f36769a;
                                a2 a2Var1111111111111115 = a2.GENERAL;
                                aVar1111111111111117.getClass();
                                i2.a.f(a2Var1111111111111115, "EventBaseViewModel", strD1111111111111115);
                            } else if (v2Var14 instanceof v2.a) {
                                int i2111115 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                i2.a aVar1111111111111118 = i2.f36769a;
                                a2 a2Var1111111111111116 = a2.GENERAL;
                                aVar1111111111111118.getClass();
                                i2.a.f(a2Var1111111111111116, "EventBaseViewModel", strD1111111111111116);
                            } else {
                                bVar12 = (mv1.b) bVar20.R0.getValue();
                                bVar13 = bVar20.Q0;
                                if (bVar13 != null) {
                                    r14 = bVar13.f121175d;
                                } else {
                                    r14 = hVar;
                                }
                                if (bVar12 != null) {
                                    r15 = bVar12.f121175d;
                                } else {
                                    r15 = hVar;
                                }
                                if (r14 != r15) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("RunningWorkoutTargetType");
                                }
                                bVar14 = bVar20.Q0;
                                if (bVar14 != null) {
                                    r16 = bVar14.f121176e;
                                } else {
                                    r16 = hVar;
                                }
                                if (bVar12 != null) {
                                    r17 = bVar12.f121176e;
                                } else {
                                    r17 = hVar;
                                }
                                if (r16 != r17) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                }
                                bVar15 = bVar20.Q0;
                                if (bVar15 != null) {
                                    obj2 = bVar15.f121172a;
                                } else {
                                    obj2 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj3 = bVar12.f121172a;
                                } else {
                                    obj3 = hVar;
                                }
                                if (!s.g(obj2, obj3)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("AvailableTrainingDays");
                                }
                                bVar16 = bVar20.Q0;
                                if (bVar16 != null) {
                                    obj4 = bVar16.f121173b;
                                } else {
                                    obj4 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj5 = bVar12.f121173b;
                                } else {
                                    obj5 = hVar;
                                }
                                if (!s.g(obj4, obj5)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("LongTrainingDays");
                                }
                                bVar17 = bVar20.Q0;
                                if (bVar17 != null) {
                                    obj6 = bVar17.f121174c;
                                } else {
                                    obj6 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj7 = bVar12.f121174c;
                                } else {
                                    obj7 = hVar;
                                }
                                if (!s.g(obj6, obj7)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("SwimTrainingDays");
                                }
                                bVar18 = bVar20.Q0;
                                if (bVar18 != null) {
                                    r18 = bVar18.f121177f;
                                } else {
                                    r18 = hVar;
                                }
                                if (bVar12 != null) {
                                    r19 = bVar12.f121177f;
                                } else {
                                    r19 = hVar;
                                }
                                if (r18 != r19) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("SwimAbility");
                                }
                                bVar19 = bVar20.Q0;
                                if (bVar19 != null) {
                                    obj8 = bVar19.f121178g;
                                } else {
                                    obj8 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj9 = bVar12.f121178g;
                                } else {
                                    obj9 = hVar;
                                }
                                if (!s.g(obj8, obj9)) {
                                    rt1.l lVar111111 = rt1.l.f154545a;
                                    if (bVar12 != null) {
                                        hVar2 = hVar;
                                    } else {
                                        hVar2 = hVar;
                                    }
                                    lVar111111.getClass();
                                    linkedHashSet = rt1.l.f154547c;
                                    if (hVar2 != null) {
                                        linkedHashSet.add(hVar2.f166715a);
                                    } else {
                                        linkedHashSet.add(vt1.h.NONE.f180123d);
                                    }
                                }
                                rt1.l lVar111112 = rt1.l.f154545a;
                                vt1.o oVar116 = bVar20.Y;
                                lVar111112.getClass();
                                rt1.l.c(oVar116);
                                bVar20.h5().j(g3.a.e(g3.f35298f));
                            }
                            return Unit.INSTANCE;
                        }
                        o53.j0 j0VarJ11114 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                        this.f141620n = b0Var;
                        this.f141607a = null;
                        this.f141608b = null;
                        this.f141609c = iVar;
                        this.f141610d = null;
                        this.f141611e = null;
                        this.f141612f = null;
                        this.f141613g = null;
                        this.f141614h = v2Var7;
                        this.f141615i = v2Var8;
                        this.f141616j = v2Var9;
                        this.f141617k = v2Var10;
                        this.f141619m = 5;
                        objC5 = j0VarJ11114.C(this);
                    }
                    break;
                } else {
                    if (bVar9 != null) {
                        cVar6 = bVar9.f121176e;
                    } else {
                        cVar6 = null;
                    }
                    if (cVar2 != cVar6) {
                        if (tVar4 != null) {
                            o53.j0 j0VarJ11115 = ge1.b.j(b0Var, null, null, new f(bVar20, tVar4, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = iVar;
                            this.f141610d = list4;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var4;
                            this.f141615i = v2Var5;
                            this.f141616j = v2Var6;
                            this.f141619m = 4;
                            objC4 = j0VarJ11115.C(this);
                        }
                    }
                    v2Var7 = v2Var4;
                    v2Var8 = v2Var5;
                    v2Var9 = v2Var6;
                    v2Var10 = null;
                    bVar10 = bVar20.Q0;
                    if (bVar10 != null) {
                        list5 = bVar10.f121178g;
                    } else {
                        list5 = null;
                    }
                    if (s.g(list4, list5)) {
                        v2 v2Var119 = v2Var9;
                        v2Var11 = v2Var7;
                        v2Var12 = v2Var10;
                        v2Var13 = v2Var119;
                        v2Var14 = null;
                        if (iVar != null) {
                            bVar11 = bVar20.Q0;
                            if (bVar11 != null) {
                                iVar2 = bVar11.f121177f;
                            } else {
                                iVar2 = null;
                            }
                            if (iVar != iVar2) {
                                hVar = null;
                                o53.j0 j0VarJ11116 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                                this.f141620n = b0Var;
                                this.f141607a = null;
                                this.f141608b = null;
                                this.f141609c = null;
                                this.f141610d = null;
                                this.f141611e = null;
                                this.f141612f = null;
                                this.f141613g = null;
                                this.f141614h = v2Var11;
                                this.f141615i = v2Var8;
                                this.f141616j = v2Var13;
                                this.f141617k = v2Var12;
                                this.f141618l = v2Var14;
                                this.f141619m = 6;
                                objC6 = j0VarJ11116.C(this);
                                break;
                            }
                            if (v2Var11 instanceof v2.a) {
                                int i1111111111110 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                                i2.a aVar1111111111111119 = i2.f36769a;
                                a2 a2Var1111111111111117 = a2.GENERAL;
                                aVar1111111111111119.getClass();
                                i2.a.f(a2Var1111111111111117, "EventBaseViewModel", strD1111111111111117);
                            } else if (v2Var8 instanceof v2.a) {
                                int i1111111111111 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                                i2.a aVar11111111111111110 = i2.f36769a;
                                a2 a2Var1111111111111118 = a2.GENERAL;
                                aVar11111111111111110.getClass();
                                i2.a.f(a2Var1111111111111118, "EventBaseViewModel", strD1111111111111118);
                            } else if (v2Var13 instanceof v2.a) {
                                int i1111111111112 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD1111111111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                                i2.a aVar11111111111111111 = i2.f36769a;
                                a2 a2Var1111111111111119 = a2.GENERAL;
                                aVar11111111111111111.getClass();
                                i2.a.f(a2Var1111111111111119, "EventBaseViewModel", strD1111111111111119);
                            } else if (v2Var12 instanceof v2.a) {
                                int i1111111111113 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD11111111111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                                i2.a aVar11111111111111112 = i2.f36769a;
                                a2 a2Var11111111111111110 = a2.GENERAL;
                                aVar11111111111111112.getClass();
                                i2.a.f(a2Var11111111111111110, "EventBaseViewModel", strD11111111111111110);
                            } else if (v2Var15 instanceof v2.a) {
                                int i2111116 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD11111111111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                                i2.a aVar11111111111111113 = i2.f36769a;
                                a2 a2Var11111111111111111 = a2.GENERAL;
                                aVar11111111111111113.getClass();
                                i2.a.f(a2Var11111111111111111, "EventBaseViewModel", strD11111111111111111);
                            } else if (v2Var14 instanceof v2.a) {
                                int i2111117 = pv1.b.f141488i1;
                                bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                                String strD11111111111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                                i2.a aVar11111111111111114 = i2.f36769a;
                                a2 a2Var11111111111111112 = a2.GENERAL;
                                aVar11111111111111114.getClass();
                                i2.a.f(a2Var11111111111111112, "EventBaseViewModel", strD11111111111111112);
                            } else {
                                bVar12 = (mv1.b) bVar20.R0.getValue();
                                bVar13 = bVar20.Q0;
                                if (bVar13 != null) {
                                    r14 = bVar13.f121175d;
                                } else {
                                    r14 = hVar;
                                }
                                if (bVar12 != null) {
                                    r15 = bVar12.f121175d;
                                } else {
                                    r15 = hVar;
                                }
                                if (r14 != r15) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("RunningWorkoutTargetType");
                                }
                                bVar14 = bVar20.Q0;
                                if (bVar14 != null) {
                                    r16 = bVar14.f121176e;
                                } else {
                                    r16 = hVar;
                                }
                                if (bVar12 != null) {
                                    r17 = bVar12.f121176e;
                                } else {
                                    r17 = hVar;
                                }
                                if (r16 != r17) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("CyclingWorkoutTargetType");
                                }
                                bVar15 = bVar20.Q0;
                                if (bVar15 != null) {
                                    obj2 = bVar15.f121172a;
                                } else {
                                    obj2 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj3 = bVar12.f121172a;
                                } else {
                                    obj3 = hVar;
                                }
                                if (!s.g(obj2, obj3)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("AvailableTrainingDays");
                                }
                                bVar16 = bVar20.Q0;
                                if (bVar16 != null) {
                                    obj4 = bVar16.f121173b;
                                } else {
                                    obj4 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj5 = bVar12.f121173b;
                                } else {
                                    obj5 = hVar;
                                }
                                if (!s.g(obj4, obj5)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("LongTrainingDays");
                                }
                                bVar17 = bVar20.Q0;
                                if (bVar17 != null) {
                                    obj6 = bVar17.f121174c;
                                } else {
                                    obj6 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj7 = bVar12.f121174c;
                                } else {
                                    obj7 = hVar;
                                }
                                if (!s.g(obj6, obj7)) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("SwimTrainingDays");
                                }
                                bVar18 = bVar20.Q0;
                                if (bVar18 != null) {
                                    r18 = bVar18.f121177f;
                                } else {
                                    r18 = hVar;
                                }
                                if (bVar12 != null) {
                                    r19 = bVar12.f121177f;
                                } else {
                                    r19 = hVar;
                                }
                                if (r18 != r19) {
                                    rt1.l.f154545a.getClass();
                                    rt1.l.f154547c.add("SwimAbility");
                                }
                                bVar19 = bVar20.Q0;
                                if (bVar19 != null) {
                                    obj8 = bVar19.f121178g;
                                } else {
                                    obj8 = hVar;
                                }
                                if (bVar12 != null) {
                                    obj9 = bVar12.f121178g;
                                } else {
                                    obj9 = hVar;
                                }
                                if (!s.g(obj8, obj9)) {
                                    rt1.l lVar111113 = rt1.l.f154545a;
                                    if (bVar12 != null) {
                                        hVar2 = hVar;
                                    } else {
                                        hVar2 = hVar;
                                    }
                                    lVar111113.getClass();
                                    linkedHashSet = rt1.l.f154547c;
                                    if (hVar2 != null) {
                                        linkedHashSet.add(hVar2.f166715a);
                                    } else {
                                        linkedHashSet.add(vt1.h.NONE.f180123d);
                                    }
                                }
                                rt1.l lVar111114 = rt1.l.f154545a;
                                vt1.o oVar117 = bVar20.Y;
                                lVar111114.getClass();
                                rt1.l.c(oVar117);
                                bVar20.h5().j(g3.a.e(g3.f35298f));
                            }
                            return Unit.INSTANCE;
                        }
                        hVar = null;
                        v2Var15 = null;
                        if (v2Var11 instanceof v2.a) {
                            int i1111111111114 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD11111111111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                            i2.a aVar11111111111111115 = i2.f36769a;
                            a2 a2Var11111111111111113 = a2.GENERAL;
                            aVar11111111111111115.getClass();
                            i2.a.f(a2Var11111111111111113, "EventBaseViewModel", strD11111111111111113);
                        } else if (v2Var8 instanceof v2.a) {
                            int i1111111111115 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD11111111111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                            i2.a aVar11111111111111116 = i2.f36769a;
                            a2 a2Var11111111111111114 = a2.GENERAL;
                            aVar11111111111111116.getClass();
                            i2.a.f(a2Var11111111111111114, "EventBaseViewModel", strD11111111111111114);
                        } else if (v2Var13 instanceof v2.a) {
                            int i1111111111116 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD11111111111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                            i2.a aVar11111111111111117 = i2.f36769a;
                            a2 a2Var11111111111111115 = a2.GENERAL;
                            aVar11111111111111117.getClass();
                            i2.a.f(a2Var11111111111111115, "EventBaseViewModel", strD11111111111111115);
                        } else if (v2Var12 instanceof v2.a) {
                            int i1111111111117 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD11111111111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                            i2.a aVar11111111111111118 = i2.f36769a;
                            a2 a2Var11111111111111116 = a2.GENERAL;
                            aVar11111111111111118.getClass();
                            i2.a.f(a2Var11111111111111116, "EventBaseViewModel", strD11111111111111116);
                        } else if (v2Var15 instanceof v2.a) {
                            int i2111118 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD11111111111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                            i2.a aVar11111111111111119 = i2.f36769a;
                            a2 a2Var11111111111111117 = a2.GENERAL;
                            aVar11111111111111119.getClass();
                            i2.a.f(a2Var11111111111111117, "EventBaseViewModel", strD11111111111111117);
                        } else if (v2Var14 instanceof v2.a) {
                            int i2111119 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD11111111111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                            i2.a aVar111111111111111110 = i2.f36769a;
                            a2 a2Var11111111111111118 = a2.GENERAL;
                            aVar111111111111111110.getClass();
                            i2.a.f(a2Var11111111111111118, "EventBaseViewModel", strD11111111111111118);
                        } else {
                            bVar12 = (mv1.b) bVar20.R0.getValue();
                            bVar13 = bVar20.Q0;
                            if (bVar13 != null) {
                                r14 = bVar13.f121175d;
                            } else {
                                r14 = hVar;
                            }
                            if (bVar12 != null) {
                                r15 = bVar12.f121175d;
                            } else {
                                r15 = hVar;
                            }
                            if (r14 != r15) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("RunningWorkoutTargetType");
                            }
                            bVar14 = bVar20.Q0;
                            if (bVar14 != null) {
                                r16 = bVar14.f121176e;
                            } else {
                                r16 = hVar;
                            }
                            if (bVar12 != null) {
                                r17 = bVar12.f121176e;
                            } else {
                                r17 = hVar;
                            }
                            if (r16 != r17) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("CyclingWorkoutTargetType");
                            }
                            bVar15 = bVar20.Q0;
                            if (bVar15 != null) {
                                obj2 = bVar15.f121172a;
                            } else {
                                obj2 = hVar;
                            }
                            if (bVar12 != null) {
                                obj3 = bVar12.f121172a;
                            } else {
                                obj3 = hVar;
                            }
                            if (!s.g(obj2, obj3)) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("AvailableTrainingDays");
                            }
                            bVar16 = bVar20.Q0;
                            if (bVar16 != null) {
                                obj4 = bVar16.f121173b;
                            } else {
                                obj4 = hVar;
                            }
                            if (bVar12 != null) {
                                obj5 = bVar12.f121173b;
                            } else {
                                obj5 = hVar;
                            }
                            if (!s.g(obj4, obj5)) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("LongTrainingDays");
                            }
                            bVar17 = bVar20.Q0;
                            if (bVar17 != null) {
                                obj6 = bVar17.f121174c;
                            } else {
                                obj6 = hVar;
                            }
                            if (bVar12 != null) {
                                obj7 = bVar12.f121174c;
                            } else {
                                obj7 = hVar;
                            }
                            if (!s.g(obj6, obj7)) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("SwimTrainingDays");
                            }
                            bVar18 = bVar20.Q0;
                            if (bVar18 != null) {
                                r18 = bVar18.f121177f;
                            } else {
                                r18 = hVar;
                            }
                            if (bVar12 != null) {
                                r19 = bVar12.f121177f;
                            } else {
                                r19 = hVar;
                            }
                            if (r18 != r19) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("SwimAbility");
                            }
                            bVar19 = bVar20.Q0;
                            if (bVar19 != null) {
                                obj8 = bVar19.f121178g;
                            } else {
                                obj8 = hVar;
                            }
                            if (bVar12 != null) {
                                obj9 = bVar12.f121178g;
                            } else {
                                obj9 = hVar;
                            }
                            if (!s.g(obj8, obj9)) {
                                rt1.l lVar111115 = rt1.l.f154545a;
                                if (bVar12 != null) {
                                    hVar2 = hVar;
                                } else {
                                    hVar2 = hVar;
                                }
                                lVar111115.getClass();
                                linkedHashSet = rt1.l.f154547c;
                                if (hVar2 != null) {
                                    linkedHashSet.add(hVar2.f166715a);
                                } else {
                                    linkedHashSet.add(vt1.h.NONE.f180123d);
                                }
                            }
                            rt1.l lVar111116 = rt1.l.f154545a;
                            vt1.o oVar118 = bVar20.Y;
                            lVar111116.getClass();
                            rt1.l.c(oVar118);
                            bVar20.h5().j(g3.a.e(g3.f35298f));
                        }
                        return Unit.INSTANCE;
                    }
                    o53.j0 j0VarJ11117 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                    this.f141620n = b0Var;
                    this.f141607a = null;
                    this.f141608b = null;
                    this.f141609c = iVar;
                    this.f141610d = null;
                    this.f141611e = null;
                    this.f141612f = null;
                    this.f141613g = null;
                    this.f141614h = v2Var7;
                    this.f141615i = v2Var8;
                    this.f141616j = v2Var9;
                    this.f141617k = v2Var10;
                    this.f141619m = 5;
                    objC5 = j0VarJ11117.C(this);
                    break;
                }
                return aVar;
            case 4:
                v2Var6 = this.f141616j;
                v2Var5 = this.f141615i;
                v2Var4 = this.f141614h;
                List<tw1.h> list16 = this.f141610d;
                iVar = this.f141609c;
                r.b(obj);
                list4 = list16;
                aVar = aVar2;
                objC4 = obj;
                v2 v2Var21 = v2Var6;
                v2Var10 = (v2) objC4;
                v2Var7 = v2Var4;
                v2Var8 = v2Var5;
                v2Var9 = v2Var21;
                bVar10 = bVar20.Q0;
                if (bVar10 != null) {
                    list5 = bVar10.f121178g;
                } else {
                    list5 = null;
                }
                if (s.g(list4, list5)) {
                    v2 v2Var1110 = v2Var9;
                    v2Var11 = v2Var7;
                    v2Var12 = v2Var10;
                    v2Var13 = v2Var1110;
                    v2Var14 = null;
                    if (iVar != null) {
                        bVar11 = bVar20.Q0;
                        if (bVar11 != null) {
                            iVar2 = bVar11.f121177f;
                        } else {
                            iVar2 = null;
                        }
                        if (iVar != iVar2) {
                            hVar = null;
                            o53.j0 j0VarJ11118 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                            this.f141620n = b0Var;
                            this.f141607a = null;
                            this.f141608b = null;
                            this.f141609c = null;
                            this.f141610d = null;
                            this.f141611e = null;
                            this.f141612f = null;
                            this.f141613g = null;
                            this.f141614h = v2Var11;
                            this.f141615i = v2Var8;
                            this.f141616j = v2Var13;
                            this.f141617k = v2Var12;
                            this.f141618l = v2Var14;
                            this.f141619m = 6;
                            objC6 = j0VarJ11118.C(this);
                            break;
                        }
                        if (v2Var11 instanceof v2.a) {
                            int i1111111111118 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD11111111111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                            i2.a aVar111111111111111111 = i2.f36769a;
                            a2 a2Var11111111111111119 = a2.GENERAL;
                            aVar111111111111111111.getClass();
                            i2.a.f(a2Var11111111111111119, "EventBaseViewModel", strD11111111111111119);
                        } else if (v2Var8 instanceof v2.a) {
                            int i1111111111119 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD111111111111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                            i2.a aVar111111111111111112 = i2.f36769a;
                            a2 a2Var111111111111111110 = a2.GENERAL;
                            aVar111111111111111112.getClass();
                            i2.a.f(a2Var111111111111111110, "EventBaseViewModel", strD111111111111111110);
                        } else if (v2Var13 instanceof v2.a) {
                            int i11111111111110 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD111111111111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                            i2.a aVar111111111111111113 = i2.f36769a;
                            a2 a2Var111111111111111111 = a2.GENERAL;
                            aVar111111111111111113.getClass();
                            i2.a.f(a2Var111111111111111111, "EventBaseViewModel", strD111111111111111111);
                        } else if (v2Var12 instanceof v2.a) {
                            int i11111111111111 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD111111111111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                            i2.a aVar111111111111111114 = i2.f36769a;
                            a2 a2Var111111111111111112 = a2.GENERAL;
                            aVar111111111111111114.getClass();
                            i2.a.f(a2Var111111111111111112, "EventBaseViewModel", strD111111111111111112);
                        } else if (v2Var15 instanceof v2.a) {
                            int i21111110 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD111111111111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                            i2.a aVar111111111111111115 = i2.f36769a;
                            a2 a2Var111111111111111113 = a2.GENERAL;
                            aVar111111111111111115.getClass();
                            i2.a.f(a2Var111111111111111113, "EventBaseViewModel", strD111111111111111113);
                        } else if (v2Var14 instanceof v2.a) {
                            int i21111111 = pv1.b.f141488i1;
                            bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            String strD111111111111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                            i2.a aVar111111111111111116 = i2.f36769a;
                            a2 a2Var111111111111111114 = a2.GENERAL;
                            aVar111111111111111116.getClass();
                            i2.a.f(a2Var111111111111111114, "EventBaseViewModel", strD111111111111111114);
                        } else {
                            bVar12 = (mv1.b) bVar20.R0.getValue();
                            bVar13 = bVar20.Q0;
                            if (bVar13 != null) {
                                r14 = bVar13.f121175d;
                            } else {
                                r14 = hVar;
                            }
                            if (bVar12 != null) {
                                r15 = bVar12.f121175d;
                            } else {
                                r15 = hVar;
                            }
                            if (r14 != r15) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("RunningWorkoutTargetType");
                            }
                            bVar14 = bVar20.Q0;
                            if (bVar14 != null) {
                                r16 = bVar14.f121176e;
                            } else {
                                r16 = hVar;
                            }
                            if (bVar12 != null) {
                                r17 = bVar12.f121176e;
                            } else {
                                r17 = hVar;
                            }
                            if (r16 != r17) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("CyclingWorkoutTargetType");
                            }
                            bVar15 = bVar20.Q0;
                            if (bVar15 != null) {
                                obj2 = bVar15.f121172a;
                            } else {
                                obj2 = hVar;
                            }
                            if (bVar12 != null) {
                                obj3 = bVar12.f121172a;
                            } else {
                                obj3 = hVar;
                            }
                            if (!s.g(obj2, obj3)) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("AvailableTrainingDays");
                            }
                            bVar16 = bVar20.Q0;
                            if (bVar16 != null) {
                                obj4 = bVar16.f121173b;
                            } else {
                                obj4 = hVar;
                            }
                            if (bVar12 != null) {
                                obj5 = bVar12.f121173b;
                            } else {
                                obj5 = hVar;
                            }
                            if (!s.g(obj4, obj5)) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("LongTrainingDays");
                            }
                            bVar17 = bVar20.Q0;
                            if (bVar17 != null) {
                                obj6 = bVar17.f121174c;
                            } else {
                                obj6 = hVar;
                            }
                            if (bVar12 != null) {
                                obj7 = bVar12.f121174c;
                            } else {
                                obj7 = hVar;
                            }
                            if (!s.g(obj6, obj7)) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("SwimTrainingDays");
                            }
                            bVar18 = bVar20.Q0;
                            if (bVar18 != null) {
                                r18 = bVar18.f121177f;
                            } else {
                                r18 = hVar;
                            }
                            if (bVar12 != null) {
                                r19 = bVar12.f121177f;
                            } else {
                                r19 = hVar;
                            }
                            if (r18 != r19) {
                                rt1.l.f154545a.getClass();
                                rt1.l.f154547c.add("SwimAbility");
                            }
                            bVar19 = bVar20.Q0;
                            if (bVar19 != null) {
                                obj8 = bVar19.f121178g;
                            } else {
                                obj8 = hVar;
                            }
                            if (bVar12 != null) {
                                obj9 = bVar12.f121178g;
                            } else {
                                obj9 = hVar;
                            }
                            if (!s.g(obj8, obj9)) {
                                rt1.l lVar111117 = rt1.l.f154545a;
                                if (bVar12 != null) {
                                    hVar2 = hVar;
                                } else {
                                    hVar2 = hVar;
                                }
                                lVar111117.getClass();
                                linkedHashSet = rt1.l.f154547c;
                                if (hVar2 != null) {
                                    linkedHashSet.add(hVar2.f166715a);
                                } else {
                                    linkedHashSet.add(vt1.h.NONE.f180123d);
                                }
                            }
                            rt1.l lVar111118 = rt1.l.f154545a;
                            vt1.o oVar119 = bVar20.Y;
                            lVar111118.getClass();
                            rt1.l.c(oVar119);
                            bVar20.h5().j(g3.a.e(g3.f35298f));
                        }
                        return Unit.INSTANCE;
                    }
                    hVar = null;
                    v2Var15 = null;
                    if (v2Var11 instanceof v2.a) {
                        int i11111111111112 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD111111111111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                        i2.a aVar111111111111111117 = i2.f36769a;
                        a2 a2Var111111111111111115 = a2.GENERAL;
                        aVar111111111111111117.getClass();
                        i2.a.f(a2Var111111111111111115, "EventBaseViewModel", strD111111111111111115);
                    } else if (v2Var8 instanceof v2.a) {
                        int i11111111111113 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD111111111111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                        i2.a aVar111111111111111118 = i2.f36769a;
                        a2 a2Var111111111111111116 = a2.GENERAL;
                        aVar111111111111111118.getClass();
                        i2.a.f(a2Var111111111111111116, "EventBaseViewModel", strD111111111111111116);
                    } else if (v2Var13 instanceof v2.a) {
                        int i11111111111114 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD111111111111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                        i2.a aVar111111111111111119 = i2.f36769a;
                        a2 a2Var111111111111111117 = a2.GENERAL;
                        aVar111111111111111119.getClass();
                        i2.a.f(a2Var111111111111111117, "EventBaseViewModel", strD111111111111111117);
                    } else if (v2Var12 instanceof v2.a) {
                        int i11111111111115 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD111111111111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                        i2.a aVar1111111111111111110 = i2.f36769a;
                        a2 a2Var111111111111111118 = a2.GENERAL;
                        aVar1111111111111111110.getClass();
                        i2.a.f(a2Var111111111111111118, "EventBaseViewModel", strD111111111111111118);
                    } else if (v2Var15 instanceof v2.a) {
                        int i21111112 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD111111111111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                        i2.a aVar1111111111111111111 = i2.f36769a;
                        a2 a2Var111111111111111119 = a2.GENERAL;
                        aVar1111111111111111111.getClass();
                        i2.a.f(a2Var111111111111111119, "EventBaseViewModel", strD111111111111111119);
                    } else if (v2Var14 instanceof v2.a) {
                        int i21111113 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD1111111111111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                        i2.a aVar1111111111111111112 = i2.f36769a;
                        a2 a2Var1111111111111111110 = a2.GENERAL;
                        aVar1111111111111111112.getClass();
                        i2.a.f(a2Var1111111111111111110, "EventBaseViewModel", strD1111111111111111110);
                    } else {
                        bVar12 = (mv1.b) bVar20.R0.getValue();
                        bVar13 = bVar20.Q0;
                        if (bVar13 != null) {
                            r14 = bVar13.f121175d;
                        } else {
                            r14 = hVar;
                        }
                        if (bVar12 != null) {
                            r15 = bVar12.f121175d;
                        } else {
                            r15 = hVar;
                        }
                        if (r14 != r15) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                        }
                        bVar14 = bVar20.Q0;
                        if (bVar14 != null) {
                            r16 = bVar14.f121176e;
                        } else {
                            r16 = hVar;
                        }
                        if (bVar12 != null) {
                            r17 = bVar12.f121176e;
                        } else {
                            r17 = hVar;
                        }
                        if (r16 != r17) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                        }
                        bVar15 = bVar20.Q0;
                        if (bVar15 != null) {
                            obj2 = bVar15.f121172a;
                        } else {
                            obj2 = hVar;
                        }
                        if (bVar12 != null) {
                            obj3 = bVar12.f121172a;
                        } else {
                            obj3 = hVar;
                        }
                        if (!s.g(obj2, obj3)) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("AvailableTrainingDays");
                        }
                        bVar16 = bVar20.Q0;
                        if (bVar16 != null) {
                            obj4 = bVar16.f121173b;
                        } else {
                            obj4 = hVar;
                        }
                        if (bVar12 != null) {
                            obj5 = bVar12.f121173b;
                        } else {
                            obj5 = hVar;
                        }
                        if (!s.g(obj4, obj5)) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("LongTrainingDays");
                        }
                        bVar17 = bVar20.Q0;
                        if (bVar17 != null) {
                            obj6 = bVar17.f121174c;
                        } else {
                            obj6 = hVar;
                        }
                        if (bVar12 != null) {
                            obj7 = bVar12.f121174c;
                        } else {
                            obj7 = hVar;
                        }
                        if (!s.g(obj6, obj7)) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("SwimTrainingDays");
                        }
                        bVar18 = bVar20.Q0;
                        if (bVar18 != null) {
                            r18 = bVar18.f121177f;
                        } else {
                            r18 = hVar;
                        }
                        if (bVar12 != null) {
                            r19 = bVar12.f121177f;
                        } else {
                            r19 = hVar;
                        }
                        if (r18 != r19) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("SwimAbility");
                        }
                        bVar19 = bVar20.Q0;
                        if (bVar19 != null) {
                            obj8 = bVar19.f121178g;
                        } else {
                            obj8 = hVar;
                        }
                        if (bVar12 != null) {
                            obj9 = bVar12.f121178g;
                        } else {
                            obj9 = hVar;
                        }
                        if (!s.g(obj8, obj9)) {
                            rt1.l lVar111119 = rt1.l.f154545a;
                            if (bVar12 != null) {
                                hVar2 = hVar;
                            } else {
                                hVar2 = hVar;
                            }
                            lVar111119.getClass();
                            linkedHashSet = rt1.l.f154547c;
                            if (hVar2 != null) {
                                linkedHashSet.add(hVar2.f166715a);
                            } else {
                                linkedHashSet.add(vt1.h.NONE.f180123d);
                            }
                        }
                        rt1.l lVar1111110 = rt1.l.f154545a;
                        vt1.o oVar1110 = bVar20.Y;
                        lVar1111110.getClass();
                        rt1.l.c(oVar1110);
                        bVar20.h5().j(g3.a.e(g3.f35298f));
                    }
                    return Unit.INSTANCE;
                }
                o53.j0 j0VarJ11119 = ge1.b.j(b0Var, null, null, new d(bVar20, list4, null), 3);
                this.f141620n = b0Var;
                this.f141607a = null;
                this.f141608b = null;
                this.f141609c = iVar;
                this.f141610d = null;
                this.f141611e = null;
                this.f141612f = null;
                this.f141613g = null;
                this.f141614h = v2Var7;
                this.f141615i = v2Var8;
                this.f141616j = v2Var9;
                this.f141617k = v2Var10;
                this.f141619m = 5;
                objC5 = j0VarJ11119.C(this);
                break;
                return aVar;
            case 5:
                v2Var10 = this.f141617k;
                v2Var9 = this.f141616j;
                v2Var8 = this.f141615i;
                v2 v2Var22 = this.f141614h;
                iVar = this.f141609c;
                r.b(obj);
                aVar = aVar2;
                v2Var7 = v2Var22;
                objC5 = obj;
                v2Var14 = (v2) objC5;
                v2 v2Var23 = v2Var9;
                v2Var11 = v2Var7;
                v2Var12 = v2Var10;
                v2Var13 = v2Var23;
                if (iVar != null) {
                    bVar11 = bVar20.Q0;
                    if (bVar11 != null) {
                        iVar2 = bVar11.f121177f;
                    } else {
                        iVar2 = null;
                    }
                    if (iVar != iVar2) {
                        hVar = null;
                        o53.j0 j0VarJ111110 = ge1.b.j(b0Var, null, null, new e(bVar20, iVar, null), 3);
                        this.f141620n = b0Var;
                        this.f141607a = null;
                        this.f141608b = null;
                        this.f141609c = null;
                        this.f141610d = null;
                        this.f141611e = null;
                        this.f141612f = null;
                        this.f141613g = null;
                        this.f141614h = v2Var11;
                        this.f141615i = v2Var8;
                        this.f141616j = v2Var13;
                        this.f141617k = v2Var12;
                        this.f141618l = v2Var14;
                        this.f141619m = 6;
                        objC6 = j0VarJ111110.C(this);
                        break;
                    }
                    if (v2Var11 instanceof v2.a) {
                        int i11111111111116 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD1111111111111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                        i2.a aVar1111111111111111113 = i2.f36769a;
                        a2 a2Var1111111111111111111 = a2.GENERAL;
                        aVar1111111111111111113.getClass();
                        i2.a.f(a2Var1111111111111111111, "EventBaseViewModel", strD1111111111111111111);
                    } else if (v2Var8 instanceof v2.a) {
                        int i11111111111117 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD1111111111111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                        i2.a aVar1111111111111111114 = i2.f36769a;
                        a2 a2Var1111111111111111112 = a2.GENERAL;
                        aVar1111111111111111114.getClass();
                        i2.a.f(a2Var1111111111111111112, "EventBaseViewModel", strD1111111111111111112);
                    } else if (v2Var13 instanceof v2.a) {
                        int i11111111111118 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD1111111111111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                        i2.a aVar1111111111111111115 = i2.f36769a;
                        a2 a2Var1111111111111111113 = a2.GENERAL;
                        aVar1111111111111111115.getClass();
                        i2.a.f(a2Var1111111111111111113, "EventBaseViewModel", strD1111111111111111113);
                    } else if (v2Var12 instanceof v2.a) {
                        int i11111111111119 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD1111111111111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                        i2.a aVar1111111111111111116 = i2.f36769a;
                        a2 a2Var1111111111111111114 = a2.GENERAL;
                        aVar1111111111111111116.getClass();
                        i2.a.f(a2Var1111111111111111114, "EventBaseViewModel", strD1111111111111111114);
                    } else if (v2Var15 instanceof v2.a) {
                        int i21111114 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD1111111111111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                        i2.a aVar1111111111111111117 = i2.f36769a;
                        a2 a2Var1111111111111111115 = a2.GENERAL;
                        aVar1111111111111111117.getClass();
                        i2.a.f(a2Var1111111111111111115, "EventBaseViewModel", strD1111111111111111115);
                    } else if (v2Var14 instanceof v2.a) {
                        int i21111115 = pv1.b.f141488i1;
                        bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        String strD1111111111111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                        i2.a aVar1111111111111111118 = i2.f36769a;
                        a2 a2Var1111111111111111116 = a2.GENERAL;
                        aVar1111111111111111118.getClass();
                        i2.a.f(a2Var1111111111111111116, "EventBaseViewModel", strD1111111111111111116);
                    } else {
                        bVar12 = (mv1.b) bVar20.R0.getValue();
                        bVar13 = bVar20.Q0;
                        if (bVar13 != null) {
                            r14 = bVar13.f121175d;
                        } else {
                            r14 = hVar;
                        }
                        if (bVar12 != null) {
                            r15 = bVar12.f121175d;
                        } else {
                            r15 = hVar;
                        }
                        if (r14 != r15) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("RunningWorkoutTargetType");
                        }
                        bVar14 = bVar20.Q0;
                        if (bVar14 != null) {
                            r16 = bVar14.f121176e;
                        } else {
                            r16 = hVar;
                        }
                        if (bVar12 != null) {
                            r17 = bVar12.f121176e;
                        } else {
                            r17 = hVar;
                        }
                        if (r16 != r17) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("CyclingWorkoutTargetType");
                        }
                        bVar15 = bVar20.Q0;
                        if (bVar15 != null) {
                            obj2 = bVar15.f121172a;
                        } else {
                            obj2 = hVar;
                        }
                        if (bVar12 != null) {
                            obj3 = bVar12.f121172a;
                        } else {
                            obj3 = hVar;
                        }
                        if (!s.g(obj2, obj3)) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("AvailableTrainingDays");
                        }
                        bVar16 = bVar20.Q0;
                        if (bVar16 != null) {
                            obj4 = bVar16.f121173b;
                        } else {
                            obj4 = hVar;
                        }
                        if (bVar12 != null) {
                            obj5 = bVar12.f121173b;
                        } else {
                            obj5 = hVar;
                        }
                        if (!s.g(obj4, obj5)) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("LongTrainingDays");
                        }
                        bVar17 = bVar20.Q0;
                        if (bVar17 != null) {
                            obj6 = bVar17.f121174c;
                        } else {
                            obj6 = hVar;
                        }
                        if (bVar12 != null) {
                            obj7 = bVar12.f121174c;
                        } else {
                            obj7 = hVar;
                        }
                        if (!s.g(obj6, obj7)) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("SwimTrainingDays");
                        }
                        bVar18 = bVar20.Q0;
                        if (bVar18 != null) {
                            r18 = bVar18.f121177f;
                        } else {
                            r18 = hVar;
                        }
                        if (bVar12 != null) {
                            r19 = bVar12.f121177f;
                        } else {
                            r19 = hVar;
                        }
                        if (r18 != r19) {
                            rt1.l.f154545a.getClass();
                            rt1.l.f154547c.add("SwimAbility");
                        }
                        bVar19 = bVar20.Q0;
                        if (bVar19 != null) {
                            obj8 = bVar19.f121178g;
                        } else {
                            obj8 = hVar;
                        }
                        if (bVar12 != null) {
                            obj9 = bVar12.f121178g;
                        } else {
                            obj9 = hVar;
                        }
                        if (!s.g(obj8, obj9)) {
                            rt1.l lVar1111111 = rt1.l.f154545a;
                            if (bVar12 != null) {
                                hVar2 = hVar;
                            } else {
                                hVar2 = hVar;
                            }
                            lVar1111111.getClass();
                            linkedHashSet = rt1.l.f154547c;
                            if (hVar2 != null) {
                                linkedHashSet.add(hVar2.f166715a);
                            } else {
                                linkedHashSet.add(vt1.h.NONE.f180123d);
                            }
                        }
                        rt1.l lVar1111112 = rt1.l.f154545a;
                        vt1.o oVar1111 = bVar20.Y;
                        lVar1111112.getClass();
                        rt1.l.c(oVar1111);
                        bVar20.h5().j(g3.a.e(g3.f35298f));
                    }
                    return Unit.INSTANCE;
                }
                hVar = null;
                v2Var15 = null;
                if (v2Var11 instanceof v2.a) {
                    int i111111111111110 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD1111111111111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                    i2.a aVar1111111111111111119 = i2.f36769a;
                    a2 a2Var1111111111111111117 = a2.GENERAL;
                    aVar1111111111111111119.getClass();
                    i2.a.f(a2Var1111111111111111117, "EventBaseViewModel", strD1111111111111111117);
                } else if (v2Var8 instanceof v2.a) {
                    int i111111111111111 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD1111111111111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                    i2.a aVar11111111111111111110 = i2.f36769a;
                    a2 a2Var1111111111111111118 = a2.GENERAL;
                    aVar11111111111111111110.getClass();
                    i2.a.f(a2Var1111111111111111118, "EventBaseViewModel", strD1111111111111111118);
                } else if (v2Var13 instanceof v2.a) {
                    int i111111111111112 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD1111111111111111119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                    i2.a aVar11111111111111111111 = i2.f36769a;
                    a2 a2Var1111111111111111119 = a2.GENERAL;
                    aVar11111111111111111111.getClass();
                    i2.a.f(a2Var1111111111111111119, "EventBaseViewModel", strD1111111111111111119);
                } else if (v2Var12 instanceof v2.a) {
                    int i111111111111113 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD11111111111111111110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                    i2.a aVar11111111111111111112 = i2.f36769a;
                    a2 a2Var11111111111111111110 = a2.GENERAL;
                    aVar11111111111111111112.getClass();
                    i2.a.f(a2Var11111111111111111110, "EventBaseViewModel", strD11111111111111111110);
                } else if (v2Var15 instanceof v2.a) {
                    int i21111116 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD11111111111111111111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                    i2.a aVar11111111111111111113 = i2.f36769a;
                    a2 a2Var11111111111111111111 = a2.GENERAL;
                    aVar11111111111111111113.getClass();
                    i2.a.f(a2Var11111111111111111111, "EventBaseViewModel", strD11111111111111111111);
                } else if (v2Var14 instanceof v2.a) {
                    int i21111117 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD11111111111111111112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                    i2.a aVar11111111111111111114 = i2.f36769a;
                    a2 a2Var11111111111111111112 = a2.GENERAL;
                    aVar11111111111111111114.getClass();
                    i2.a.f(a2Var11111111111111111112, "EventBaseViewModel", strD11111111111111111112);
                } else {
                    bVar12 = (mv1.b) bVar20.R0.getValue();
                    bVar13 = bVar20.Q0;
                    if (bVar13 != null) {
                        r14 = bVar13.f121175d;
                    } else {
                        r14 = hVar;
                    }
                    if (bVar12 != null) {
                        r15 = bVar12.f121175d;
                    } else {
                        r15 = hVar;
                    }
                    if (r14 != r15) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                    }
                    bVar14 = bVar20.Q0;
                    if (bVar14 != null) {
                        r16 = bVar14.f121176e;
                    } else {
                        r16 = hVar;
                    }
                    if (bVar12 != null) {
                        r17 = bVar12.f121176e;
                    } else {
                        r17 = hVar;
                    }
                    if (r16 != r17) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                    }
                    bVar15 = bVar20.Q0;
                    if (bVar15 != null) {
                        obj2 = bVar15.f121172a;
                    } else {
                        obj2 = hVar;
                    }
                    if (bVar12 != null) {
                        obj3 = bVar12.f121172a;
                    } else {
                        obj3 = hVar;
                    }
                    if (!s.g(obj2, obj3)) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("AvailableTrainingDays");
                    }
                    bVar16 = bVar20.Q0;
                    if (bVar16 != null) {
                        obj4 = bVar16.f121173b;
                    } else {
                        obj4 = hVar;
                    }
                    if (bVar12 != null) {
                        obj5 = bVar12.f121173b;
                    } else {
                        obj5 = hVar;
                    }
                    if (!s.g(obj4, obj5)) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("LongTrainingDays");
                    }
                    bVar17 = bVar20.Q0;
                    if (bVar17 != null) {
                        obj6 = bVar17.f121174c;
                    } else {
                        obj6 = hVar;
                    }
                    if (bVar12 != null) {
                        obj7 = bVar12.f121174c;
                    } else {
                        obj7 = hVar;
                    }
                    if (!s.g(obj6, obj7)) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("SwimTrainingDays");
                    }
                    bVar18 = bVar20.Q0;
                    if (bVar18 != null) {
                        r18 = bVar18.f121177f;
                    } else {
                        r18 = hVar;
                    }
                    if (bVar12 != null) {
                        r19 = bVar12.f121177f;
                    } else {
                        r19 = hVar;
                    }
                    if (r18 != r19) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("SwimAbility");
                    }
                    bVar19 = bVar20.Q0;
                    if (bVar19 != null) {
                        obj8 = bVar19.f121178g;
                    } else {
                        obj8 = hVar;
                    }
                    if (bVar12 != null) {
                        obj9 = bVar12.f121178g;
                    } else {
                        obj9 = hVar;
                    }
                    if (!s.g(obj8, obj9)) {
                        rt1.l lVar1111113 = rt1.l.f154545a;
                        if (bVar12 != null) {
                            hVar2 = hVar;
                        } else {
                            hVar2 = hVar;
                        }
                        lVar1111113.getClass();
                        linkedHashSet = rt1.l.f154547c;
                        if (hVar2 != null) {
                            linkedHashSet.add(hVar2.f166715a);
                        } else {
                            linkedHashSet.add(vt1.h.NONE.f180123d);
                        }
                    }
                    rt1.l lVar1111114 = rt1.l.f154545a;
                    vt1.o oVar1112 = bVar20.Y;
                    lVar1111114.getClass();
                    rt1.l.c(oVar1112);
                    bVar20.h5().j(g3.a.e(g3.f35298f));
                }
                return Unit.INSTANCE;
            case 6:
                v2 v2Var24 = this.f141618l;
                v2Var12 = this.f141617k;
                v2Var13 = this.f141616j;
                v2 v2Var25 = this.f141615i;
                v2Var11 = this.f141614h;
                r.b(obj);
                v2Var8 = v2Var25;
                hVar = null;
                v2Var14 = v2Var24;
                objC6 = obj;
                v2Var15 = (v2) objC6;
                if (v2Var11 instanceof v2.a) {
                    int i111111111111114 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD11111111111111111113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var11).f47383a, "Error updating adaptive coach plan settings ");
                    i2.a aVar11111111111111111115 = i2.f36769a;
                    a2 a2Var11111111111111111113 = a2.GENERAL;
                    aVar11111111111111111115.getClass();
                    i2.a.f(a2Var11111111111111111113, "EventBaseViewModel", strD11111111111111111113);
                } else if (v2Var8 instanceof v2.a) {
                    int i111111111111115 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD11111111111111111114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var8).f47383a, "Error updating adaptive coach running target workout type ");
                    i2.a aVar11111111111111111116 = i2.f36769a;
                    a2 a2Var11111111111111111114 = a2.GENERAL;
                    aVar11111111111111111116.getClass();
                    i2.a.f(a2Var11111111111111111114, "EventBaseViewModel", strD11111111111111111114);
                } else if (v2Var13 instanceof v2.a) {
                    int i111111111111116 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD11111111111111111115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var13).f47383a, "Error updating adaptive coach cycling target workout type ");
                    i2.a aVar11111111111111111117 = i2.f36769a;
                    a2 a2Var11111111111111111115 = a2.GENERAL;
                    aVar11111111111111111117.getClass();
                    i2.a.f(a2Var11111111111111111115, "EventBaseViewModel", strD11111111111111111115);
                } else if (v2Var12 instanceof v2.a) {
                    int i111111111111117 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD11111111111111111116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var12).f47383a, "Error updating TrainingVersion ");
                    i2.a aVar11111111111111111118 = i2.f36769a;
                    a2 a2Var11111111111111111116 = a2.GENERAL;
                    aVar11111111111111111118.getClass();
                    i2.a.f(a2Var11111111111111111116, "EventBaseViewModel", strD11111111111111111116);
                } else if (v2Var15 instanceof v2.a) {
                    int i21111118 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD11111111111111111117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var15).f47383a, "Error updating adaptive coach plan settings ");
                    i2.a aVar11111111111111111119 = i2.f36769a;
                    a2 a2Var11111111111111111117 = a2.GENERAL;
                    aVar11111111111111111119.getClass();
                    i2.a.f(a2Var11111111111111111117, "EventBaseViewModel", strD11111111111111111117);
                } else if (v2Var14 instanceof v2.a) {
                    int i21111119 = pv1.b.f141488i1;
                    bVar20.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    String strD11111111111111111118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var14).f47383a, "Error updating supplement sport async ");
                    i2.a aVar111111111111111111110 = i2.f36769a;
                    a2 a2Var11111111111111111118 = a2.GENERAL;
                    aVar111111111111111111110.getClass();
                    i2.a.f(a2Var11111111111111111118, "EventBaseViewModel", strD11111111111111111118);
                } else {
                    bVar12 = (mv1.b) bVar20.R0.getValue();
                    bVar13 = bVar20.Q0;
                    if (bVar13 != null) {
                        r14 = bVar13.f121175d;
                    } else {
                        r14 = hVar;
                    }
                    if (bVar12 != null) {
                        r15 = bVar12.f121175d;
                    } else {
                        r15 = hVar;
                    }
                    if (r14 != r15) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("RunningWorkoutTargetType");
                    }
                    bVar14 = bVar20.Q0;
                    if (bVar14 != null) {
                        r16 = bVar14.f121176e;
                    } else {
                        r16 = hVar;
                    }
                    if (bVar12 != null) {
                        r17 = bVar12.f121176e;
                    } else {
                        r17 = hVar;
                    }
                    if (r16 != r17) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("CyclingWorkoutTargetType");
                    }
                    bVar15 = bVar20.Q0;
                    if (bVar15 != null) {
                        obj2 = bVar15.f121172a;
                    } else {
                        obj2 = hVar;
                    }
                    if (bVar12 != null) {
                        obj3 = bVar12.f121172a;
                    } else {
                        obj3 = hVar;
                    }
                    if (!s.g(obj2, obj3)) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("AvailableTrainingDays");
                    }
                    bVar16 = bVar20.Q0;
                    if (bVar16 != null) {
                        obj4 = bVar16.f121173b;
                    } else {
                        obj4 = hVar;
                    }
                    if (bVar12 != null) {
                        obj5 = bVar12.f121173b;
                    } else {
                        obj5 = hVar;
                    }
                    if (!s.g(obj4, obj5)) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("LongTrainingDays");
                    }
                    bVar17 = bVar20.Q0;
                    if (bVar17 != null) {
                        obj6 = bVar17.f121174c;
                    } else {
                        obj6 = hVar;
                    }
                    if (bVar12 != null) {
                        obj7 = bVar12.f121174c;
                    } else {
                        obj7 = hVar;
                    }
                    if (!s.g(obj6, obj7)) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("SwimTrainingDays");
                    }
                    bVar18 = bVar20.Q0;
                    if (bVar18 != null) {
                        r18 = bVar18.f121177f;
                    } else {
                        r18 = hVar;
                    }
                    if (bVar12 != null) {
                        r19 = bVar12.f121177f;
                    } else {
                        r19 = hVar;
                    }
                    if (r18 != r19) {
                        rt1.l.f154545a.getClass();
                        rt1.l.f154547c.add("SwimAbility");
                    }
                    bVar19 = bVar20.Q0;
                    if (bVar19 != null) {
                        obj8 = bVar19.f121178g;
                    } else {
                        obj8 = hVar;
                    }
                    if (bVar12 != null) {
                        obj9 = bVar12.f121178g;
                    } else {
                        obj9 = hVar;
                    }
                    if (!s.g(obj8, obj9)) {
                        rt1.l lVar1111115 = rt1.l.f154545a;
                        if (bVar12 != null) {
                            hVar2 = hVar;
                        } else {
                            hVar2 = hVar;
                        }
                        lVar1111115.getClass();
                        linkedHashSet = rt1.l.f154547c;
                        if (hVar2 != null) {
                            linkedHashSet.add(hVar2.f166715a);
                        } else {
                            linkedHashSet.add(vt1.h.NONE.f180123d);
                        }
                    }
                    rt1.l lVar1111116 = rt1.l.f154545a;
                    vt1.o oVar1113 = bVar20.Y;
                    lVar1111116.getClass();
                    rt1.l.c(oVar1113);
                    bVar20.h5().j(g3.a.e(g3.f35298f));
                }
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
