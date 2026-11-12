package ed0;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import e23.p;
import java.util.Collection;
import java.util.Iterator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil$updateDeviceCount$2", f = "DeviceSharingUtil.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection<SharedDeviceInfo> f63871a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Collection<SharedDeviceInfo> collection, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f63871a = collection;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f63871a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        a.f63825a.getClass();
        z1 z1Var = (z1) a.f63830f.getValue();
        Collection<SharedDeviceInfo> collection = this.f63871a;
        z1Var.setValue(new Integer(collection.size()));
        z1 z1Var2 = (z1) a.f63832h.getValue();
        Collection<SharedDeviceInfo> collection2 = collection;
        int i14 = 0;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (((SharedDeviceInfo) it.next()).isPaired() && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        z1Var2.setValue(new Integer(i14));
        return Unit.INSTANCE;
    }
}
