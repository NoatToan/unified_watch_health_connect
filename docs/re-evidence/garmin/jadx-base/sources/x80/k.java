package x80;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.ArrayList;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel$setDefaultUserRoles$2", f = "DeviceSetupViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f189538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f189539b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel$setDefaultUserRoles$2$1", f = "DeviceSetupViewModel.kt", l = {372}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f189540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f189541b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f189541b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f189541b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f189540a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = this.f189541b.f189502d;
                ArrayList arrayListD = x.d("ROLE_FITNESS_USER", "ROLE_WELLNESS_USER");
                this.f189540a = 1;
                if (bVar.c(arrayListD, this) == aVar) {
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
    public k(e eVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f189539b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f189539b, dVar);
        kVar.f189538a = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        e eVar = this.f189539b;
        f12.l lVar = eVar.f189505g;
        f12.l lVar2 = eVar.f189505g;
        if (!lVar.P0()) {
            String str = "setDefaultUserRoles() -> userRole=[" + f12.a.ROLE_FITNESS_USER + ", " + f12.a.ROLE_WELLNESS_USER + "]";
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "DeviceSetupViewModel", str);
            lVar2.f3("ROLE_FITNESS_USER");
            lVar2.f3("ROLE_WELLNESS_USER");
            ge1.b.T(v1.a(eVar), null, null, new a(eVar, null), 3);
        }
        return Unit.INSTANCE;
    }
}
