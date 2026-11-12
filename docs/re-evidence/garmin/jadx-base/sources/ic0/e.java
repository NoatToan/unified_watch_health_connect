package ic0;

import com.garmin.device.datatypes.DeviceProfile;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.data.InMemoryDeviceBatteryStatusRepository$fetchConnectedDevicesBatteryPercentage$1", f = "InMemoryDeviceBatteryStatusRepository.kt", l = {150}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f92584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f92585b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljc0/c;", "<anonymous>", "(Lo53/b0;)Ljc0/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.data.InMemoryDeviceBatteryStatusRepository$fetchConnectedDevicesBatteryPercentage$1$1$1", f = "InMemoryDeviceBatteryStatusRepository.kt", l = {148}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super jc0.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f92587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DeviceProfile f92588c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, DeviceProfile deviceProfile, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f92587b = cVar;
            this.f92588c = deviceProfile;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f92587b, this.f92588c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super jc0.c> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f92586a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            long f92746j = this.f92588c.getF92746j();
            this.f92586a = 1;
            Object objA = this.f92587b.a(f92746j, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f92585b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f92585b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f92584a;
        if (i14 == 0) {
            r.b(obj);
            c cVar = this.f92585b;
            ArrayList arrayListE = cVar.f92565d.f58886a.f111646e.e();
            ArrayList arrayList = new ArrayList(y.r(arrayListE, 10));
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                arrayList.add(ge1.b.j(cVar.f92562a, null, null, new a(cVar, (DeviceProfile) it.next(), null), 3));
            }
            this.f92584a = 1;
            if (g8.i.o(arrayList, this) == aVar) {
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
