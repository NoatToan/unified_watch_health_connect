package dd0;

import android.content.Context;
import androidx.lifecycle.t0;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/t0;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEDeviceSetupWizardViewModel$reconcilePairedDevices$1", f = "BLEDeviceSetupWizardViewModel.kt", l = {20, 23, 25}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<t0<Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f59158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f59159c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEDeviceSetupWizardViewModel$reconcilePairedDevices$1$1", f = "BLEDeviceSetupWizardViewModel.kt", l = {20}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f59160a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f59160a;
            if (i14 == 0) {
                r.b(obj);
                ed0.a aVar2 = ed0.a.f63825a;
                this.f59160a = 1;
                if (aVar2.l("BLEDeviceSetupWizardViewModel", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEDeviceSetupWizardViewModel$reconcilePairedDevices$1$2", f = "BLEDeviceSetupWizardViewModel.kt", l = {23}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f59161a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f59161a;
            if (i14 == 0) {
                r.b(obj);
                ed0.a aVar2 = ed0.a.f63825a;
                this.f59161a = 1;
                aVar2.getClass();
                if (ed0.a.j("BLEDeviceSetupWizardViewModel", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f59159c = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f59159c, dVar);
        eVar.f59158b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Unit> t0Var, t13.d<? super Unit> dVar) {
        return ((e) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f59158b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f59157a;
        if (i14 != 0) {
            if (i14 == 1 || i14 == 2) {
                r.b(obj);
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        j22.b.f96736a.getClass();
        if (j22.b.n() && j22.b.p(this.f59159c, j22.g.f96759d)) {
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(null);
            this.f59158b = t0Var;
            this.f59157a = 1;
            if (ge1.b.e0(bVar, aVar2, this) != aVar) {
            }
        } else {
            x53.c cVar2 = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            b bVar3 = new b(null);
            this.f59158b = t0Var;
            this.f59157a = 2;
            if (ge1.b.e0(bVar2, bVar3, this) != aVar) {
            }
        }
        return aVar;
        Unit unit = Unit.INSTANCE;
        this.f59158b = null;
        this.f59157a = 3;
    }
}
