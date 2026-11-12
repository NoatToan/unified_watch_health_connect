package zo0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.l1;
import zb0.m1;
import zb0.n1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.SystemBondingLostDialogHandler$removeDeviceAndGoToSetup$1", f = "SystemBondingLostDialogHandler.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f206104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sd2.f f206105c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.SystemBondingLostDialogHandler$removeDeviceAndGoToSetup$1$1", f = "SystemBondingLostDialogHandler.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sd2.f f206107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sd2.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f206107b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f206107b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206106a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            l1 l1Var = l1.f203565a;
            this.f206106a = 1;
            l1Var.getClass();
            t13.i iVar = new t13.i(u13.f.b(this));
            a2 a2Var = a2.DEVICES;
            StringBuilder sb3 = new StringBuilder("removeDevice -> ");
            sd2.f fVar = this.f206107b;
            sb3.append(fVar);
            String string = sb3.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SystemBondingLostEventHandler", string);
            lc0.k kVar = (lc0.k) KoinJavaComponent.get$default(lc0.k.class, null, null, 6, null);
            long unitID = fVar.getUnitID();
            m1 m1Var = new m1(fVar, iVar);
            n1 n1Var = new n1(fVar, iVar);
            int i15 = lc0.k.f111948d;
            kVar.a(unitID, true, m1Var, n1Var);
            Object objA = iVar.a();
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var, sd2.f fVar, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f206104b = b0Var;
        this.f206105c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f206104b, this.f206105c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206103a;
        b0 b0Var = this.f206104b;
        if (i14 == 0) {
            o13.r.b(obj);
            b0Var.f206099a.showProgressOverlay();
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f206105c, null);
            this.f206103a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        q qVar = b0Var.f206099a;
        q qVar2 = b0Var.f206099a;
        if (o53.c0.g(qVar.Q7())) {
            qVar2.hideProgressOverlay();
            qVar2.O4();
        }
        return Unit.INSTANCE;
    }
}
