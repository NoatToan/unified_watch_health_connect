package ta0;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$fetchCompatibleDevices$1", f = "DeviceDiscoveryViewModel.kt", l = {SyslogConstants.LOG_LOCAL2, 150}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f163492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z1 f163493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f163494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f163495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f163496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f163497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f163498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f163499h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x xVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f163499h = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f163499h, dVar);
        zVar.f163498g = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008f -> B:22:0x0092). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        List list;
        z1 z1Var;
        int i14;
        x xVar;
        Object value2;
        Object value3;
        o53.b0 b0Var = (o53.b0) this.f163498g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f163497f;
        x xVar2 = this.f163499h;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = this.f163496e;
                value2 = this.f163495d;
                xVar = this.f163494c;
                z1Var = this.f163493b;
                list = this.f163492a;
                o13.r.b(obj);
            }
            if (z1Var.b(value2, (Map) obj)) {
                p2 p2Var = xVar2.f163468l;
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, o13.q.a(list)));
                return Unit.INSTANCE;
            }
            value2 = z1Var.getValue();
            k90.c0 c0Var = xVar.f163458b;
            this.f163498g = null;
            this.f163492a = list;
            this.f163493b = z1Var;
            this.f163494c = xVar;
            this.f163495d = value2;
            this.f163496e = i14;
            this.f163497f = 2;
            obj = ge1.b.e0(c0Var.f103442b, new k90.b0(list, c0Var, null), this);
        } else {
            o13.r.b(obj);
            k90.a0 a0Var = xVar2.f163457a;
            this.f163498g = b0Var;
            this.f163497f = 1;
            obj = ge1.b.e0(a0Var.f103433e, new k90.z(a0Var, null), this);
        }
        List list2 = (List) obj;
        if (list2 == null || list2.isEmpty()) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceDiscoveryViewModel", "Failed to fetch compatible devices");
            p2 p2Var2 = xVar2.f163468l;
            do {
                value = p2Var2.getValue();
                int i16 = o13.q.f128596b;
            } while (!p2Var2.b(value, o13.q.a(new o13.q.b(new Exception("Failed to fetch compatible devices")))));
        } else {
            a2 a2Var2 = a2.DEVICE_SETUP;
            String strF = v.e0.f(list2.size(), "Fetched compatible devices: ", " devices found");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "DeviceDiscoveryViewModel", strF);
            list = list2;
            z1Var = xVar2.f163470n;
            i14 = 0;
            xVar = xVar2;
            value2 = z1Var.getValue();
            k90.c0 c0Var2 = xVar.f163458b;
            this.f163498g = null;
            this.f163492a = list;
            this.f163493b = z1Var;
            this.f163494c = xVar;
            this.f163495d = value2;
            this.f163496e = i14;
            this.f163497f = 2;
            obj = ge1.b.e0(c0Var2.f103442b, new k90.b0(list, c0Var2, null), this);
        }
        return Unit.INSTANCE;
    }
}
