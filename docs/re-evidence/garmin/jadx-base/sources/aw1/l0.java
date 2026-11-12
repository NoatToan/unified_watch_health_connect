package aw1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$planCreationUpdatePrimaryEvent$2", f = "FBTPlanWizardViewModel.kt", l = {2858, 2859, 2871}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends fg0.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f13467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.j0 f13468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f13469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f13472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg0.k f13473g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$planCreationUpdatePrimaryEvent$2$newEventResponse$1", f = "FBTPlanWizardViewModel.kt", l = {2856}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f13475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fg0.k f13476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, fg0.k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f13475b = hVar;
            this.f13476c = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f13475b, this.f13476c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13474a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f13474a = 1;
                Object objV4 = this.f13475b.V4(this.f13476c, this);
                return objV4 == aVar ? aVar : objV4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$planCreationUpdatePrimaryEvent$2$updateCurrentPrimaryResponse$1", f = "FBTPlanWizardViewModel.kt", l = {2857}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f13478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fg0.k f13479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, fg0.k kVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f13478b = hVar;
            this.f13479c = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f13478b, this.f13479c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13477a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f13477a = 1;
                Object objV4 = this.f13478b.V4(this.f13479c, this);
                return objV4 == aVar ? aVar : objV4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(h hVar, fg0.k kVar, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f13472f = hVar;
        this.f13473g = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l0 l0Var = new l0(this.f13472f, this.f13473g, dVar);
        l0Var.f13471e = obj;
        return l0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends fg0.k>> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fg0.j jVar;
        fg0.k kVarD;
        Object objV4;
        fg0.k kVar;
        o53.j0 j0VarJ;
        Object objC;
        fg0.j eventCustomization;
        v2 v2Var;
        Object objAwait;
        fg0.k kVar2;
        v2 v2Var2;
        o53.b0 b0Var = (o53.b0) this.f13471e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13470d;
        if (i14 != 0) {
            if (i14 == 1) {
                j0VarJ = this.f13468b;
                fg0.k kVar3 = this.f13467a;
                o13.r.b(obj);
                kVarD = kVar3;
                objC = obj;
                v2Var = (v2) objC;
                this.f13471e = b0Var;
                this.f13467a = kVarD;
                this.f13468b = null;
                this.f13469c = v2Var;
                this.f13470d = 2;
                objAwait = j0VarJ.await(this);
                if (objAwait != aVar) {
                    kVar2 = kVarD;
                }
                return aVar;
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg0.k kVar4 = this.f13467a;
                o13.r.b(obj);
                kVar = kVar4;
                objV4 = obj;
                if (((v2) objV4) instanceof v2.a) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "FBTPlanWizardViewModel", "Error updating new Event to primary");
                }
                return new v2.b(kVar, 200, null, null, 12, null);
            }
            v2 v2Var3 = this.f13469c;
            fg0.k kVar5 = this.f13467a;
            o13.r.b(obj);
            v2Var = v2Var3;
            kVar2 = kVar5;
            objAwait = obj;
            v2Var2 = (v2) objAwait;
            if (!(v2Var instanceof v2.b) && (v2Var2 instanceof v2.b)) {
                return new v2.b(kVar2, 200, null, null, 12, null);
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "FBTPlanWizardViewModel", "failed to update event customization: " + (v2Var instanceof v2.a) + " || " + (v2Var2 instanceof v2.a));
            return new v2.a(new IllegalStateException(), null, null, 6, null);
        }
        o13.r.b(obj);
        h hVar = this.f13472f;
        fg0.k kVarB5 = hVar.B5();
        fg0.k kVarD2 = kVarB5 != null ? fg0.k.d(kVarB5, null, null, null, null, null, null, (kVarB5 == null || (eventCustomization = kVarB5.getEventCustomization()) == null) ? null : fg0.j.b(eventCustomization, null, null, Boolean.FALSE, null, null, null, 8187), -16777217) : null;
        fg0.j eventCustomization2 = this.f13473g.getEventCustomization();
        if (eventCustomization2 != null) {
            Boolean bool = Boolean.TRUE;
            jVar = fg0.j.b(eventCustomization2, null, null, bool, bool, null, null, 8155);
        } else {
            Boolean bool2 = Boolean.TRUE;
            jVar = new fg0.j(null, null, bool2, null, null, bool2, null, null, null, null, null, null, null, 8155, null);
        }
        kVarD = fg0.k.d(this.f13473g, null, null, null, null, null, null, jVar, -16777217);
        if (kVarD2 != null) {
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(hVar, kVarD, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new b(hVar, kVarD2, null), 3);
            this.f13471e = b0Var;
            this.f13467a = kVarD;
            this.f13468b = j0VarJ;
            this.f13470d = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
                v2Var = (v2) objC;
                this.f13471e = b0Var;
                this.f13467a = kVarD;
                this.f13468b = null;
                this.f13469c = v2Var;
                this.f13470d = 2;
                objAwait = j0VarJ.await(this);
                if (objAwait != aVar) {
                    kVar2 = kVarD;
                    v2Var2 = (v2) objAwait;
                    if (!(v2Var instanceof v2.b)) {
                    }
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var3, "FBTPlanWizardViewModel", "failed to update event customization: " + (v2Var instanceof v2.a) + " || " + (v2Var2 instanceof v2.a));
                    return new v2.a(new IllegalStateException(), null, null, 6, null);
                }
            }
        } else {
            this.f13471e = b0Var;
            this.f13467a = kVarD;
            this.f13470d = 3;
            objV4 = hVar.V4(kVarD, this);
            if (objV4 != aVar) {
                kVar = kVarD;
                if (((v2) objV4) instanceof v2.a) {
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var4, "FBTPlanWizardViewModel", "Error updating new Event to primary");
                }
                return new v2.b(kVar, 200, null, null, 12, null);
            }
        }
        return aVar;
    }
}
