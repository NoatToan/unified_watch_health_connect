package y80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lz80/e;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceInfoRepositoryImpl$parseAllDevicesInfo$2", f = "DeviceInfoRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends z80.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f195223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o oVar, String str, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f195223b = oVar;
        this.f195224c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f195223b, this.f195224c, dVar);
        uVar.f195222a = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends z80.e>> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o oVar = this.f195223b;
        String str = this.f195224c;
        try {
            int i14 = o13.q.f128596b;
            n63.b bVar2 = oVar.f195192d;
            bVar2.getClass();
            bVar = ((z80.a) bVar2.c(z80.a.INSTANCE.serializer(), str)).f202975a;
            if (bVar == null) {
                throw new Exception("No devices found in the response");
            }
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strP = am.j.p("Failed to parse all devices info ", thB);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "DeviceInfoRepository", strP);
        }
        o13.r.b(bVar);
        return bVar;
    }
}
