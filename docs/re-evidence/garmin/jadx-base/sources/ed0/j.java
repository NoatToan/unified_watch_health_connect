package ed0;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;", "<anonymous>", "(Lo53/b0;)Ljava/util/Collection;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil$reconcilePairedDevices$devices$1", f = "DeviceSharingUtil.kt", l = {251, 252}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Collection<? extends SharedDeviceInfo>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63870a;

    public j(t13.d<? super j> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Collection<? extends SharedDeviceInfo>> dVar) {
        return new j(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f63870a;
        if (i14 == 0) {
            r.b(obj);
            an2.a aVarA = a.a(a.f63825a);
            this.f63870a = 1;
            aVarA.getClass();
            x53.c cVar = s0.f129406a;
            if (ge1.b.e0(x53.b.f189152a, new an2.k(aVarA, null), this) != aVar) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a.f63825a.getClass();
        a.c cVarE = a.e();
        this.f63870a = 2;
        ArrayList arrayListC = cVarE.c();
        return arrayListC == aVar ? aVar : arrayListC;
    }
}
