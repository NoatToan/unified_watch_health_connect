package ic0;

import am.j;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIDeviceStatus;
import e23.p;
import java.util.LinkedHashMap;
import java.util.Map;
import o13.q;
import o13.r;
import o53.b0;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import p13.u0;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljc0/c;", "<anonymous>", "(Lo53/b0;)Ljc0/c;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.data.InMemoryDeviceBatteryStatusRepository$fetchBatteryPercentageForDevice$2", f = "InMemoryDeviceBatteryStatusRepository.kt", l = {98}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super jc0.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f92576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f92577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeviceProfile f92578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f92579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f92580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f92581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f92582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f92583h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, long j8, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f92582g = cVar;
        this.f92583h = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f92582g, this.f92583h, dVar);
        dVar2.f92581f = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super jc0.c> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009d A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x0018, B:35:0x0096, B:38:0x009d, B:41:0x00a5, B:43:0x00b0, B:46:0x00e4, B:51:0x00f7, B:55:0x0100, B:57:0x0115, B:58:0x0122, B:59:0x0136, B:60:0x0141, B:64:0x015c, B:52:0x00fa, B:13:0x002b, B:15:0x003b, B:21:0x004a, B:24:0x0055, B:27:0x005d, B:29:0x006d, B:31:0x0082, B:65:0x015f, B:18:0x0044), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x0018, B:35:0x0096, B:38:0x009d, B:41:0x00a5, B:43:0x00b0, B:46:0x00e4, B:51:0x00f7, B:55:0x0100, B:57:0x0115, B:58:0x0122, B:59:0x0136, B:60:0x0141, B:64:0x015c, B:52:0x00fa, B:13:0x002b, B:15:0x003b, B:21:0x004a, B:24:0x0055, B:27:0x005d, B:29:0x006d, B:31:0x0082, B:65:0x015f, B:18:0x0044), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x0018, B:35:0x0096, B:38:0x009d, B:41:0x00a5, B:43:0x00b0, B:46:0x00e4, B:51:0x00f7, B:55:0x0100, B:57:0x0115, B:58:0x0122, B:59:0x0136, B:60:0x0141, B:64:0x015c, B:52:0x00fa, B:13:0x002b, B:15:0x003b, B:21:0x004a, B:24:0x0055, B:27:0x005d, B:29:0x006d, B:31:0x0082, B:65:0x015f, B:18:0x0044), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x0018, B:35:0x0096, B:38:0x009d, B:41:0x00a5, B:43:0x00b0, B:46:0x00e4, B:51:0x00f7, B:55:0x0100, B:57:0x0115, B:58:0x0122, B:59:0x0136, B:60:0x0141, B:64:0x015c, B:52:0x00fa, B:13:0x002b, B:15:0x003b, B:21:0x004a, B:24:0x0055, B:27:0x005d, B:29:0x006d, B:31:0x0082, B:65:0x015f, B:18:0x0044), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x0018, B:35:0x0096, B:38:0x009d, B:41:0x00a5, B:43:0x00b0, B:46:0x00e4, B:51:0x00f7, B:55:0x0100, B:57:0x0115, B:58:0x0122, B:59:0x0136, B:60:0x0141, B:64:0x015c, B:52:0x00fa, B:13:0x002b, B:15:0x003b, B:21:0x004a, B:24:0x0055, B:27:0x005d, B:29:0x006d, B:31:0x0082, B:65:0x015f, B:18:0x0044), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x0018, B:35:0x0096, B:38:0x009d, B:41:0x00a5, B:43:0x00b0, B:46:0x00e4, B:51:0x00f7, B:55:0x0100, B:57:0x0115, B:58:0x0122, B:59:0x0136, B:60:0x0141, B:64:0x015c, B:52:0x00fa, B:13:0x002b, B:15:0x003b, B:21:0x004a, B:24:0x0055, B:27:0x005d, B:29:0x006d, B:31:0x0082, B:65:0x015f, B:18:0x0044), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0115 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x0018, B:35:0x0096, B:38:0x009d, B:41:0x00a5, B:43:0x00b0, B:46:0x00e4, B:51:0x00f7, B:55:0x0100, B:57:0x0115, B:58:0x0122, B:59:0x0136, B:60:0x0141, B:64:0x015c, B:52:0x00fa, B:13:0x002b, B:15:0x003b, B:21:0x004a, B:24:0x0055, B:27:0x005d, B:29:0x006d, B:31:0x0082, B:65:0x015f, B:18:0x0044), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x0018, B:35:0x0096, B:38:0x009d, B:41:0x00a5, B:43:0x00b0, B:46:0x00e4, B:51:0x00f7, B:55:0x0100, B:57:0x0115, B:58:0x0122, B:59:0x0136, B:60:0x0141, B:64:0x015c, B:52:0x00fa, B:13:0x002b, B:15:0x003b, B:21:0x004a, B:24:0x0055, B:27:0x005d, B:29:0x006d, B:31:0x0082, B:65:0x015f, B:18:0x0044), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0188  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0122, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0188, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Throwable thB;
        c cVar;
        DeviceProfile deviceProfile;
        DeviceProfile deviceProfile2;
        String f92741e;
        long j8;
        GDIDeviceStatus.RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse;
        GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus batteryStatus;
        Integer num;
        a2 a2Var;
        jc0.b bVar2;
        p2 p2Var;
        Object value;
        LinkedHashMap linkedHashMapN;
        int i14;
        b0 b0Var = (b0) this.f92581f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f92580e;
        long j14 = this.f92583h;
        try {
            if (i15 == 0) {
                r.b(obj);
                cVar = this.f92582g;
                int i16 = q.f128596b;
                DeviceProfile[] deviceProfileArrA = cVar.f92565d.f58886a.f111646e.a(j14);
                int length = deviceProfileArrA.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        deviceProfile = null;
                        break;
                    }
                    deviceProfile = deviceProfileArrA[i17];
                    if (deviceProfile.getConnectionType() == 1) {
                        break;
                    }
                    i17++;
                }
                deviceProfile2 = deviceProfile == null ? (DeviceProfile) u.H(deviceProfileArrA) : deviceProfile;
                if (deviceProfile2 != null && (f92741e = deviceProfile2.getF92741e()) != null) {
                    oj2.a aVar2 = (oj2.a) cVar.f92565d.f58886a.f111646e.getCapability(f92741e, oj2.a.class);
                    if (aVar2 == null) {
                        String strM = j.m("BatteryStatusHandler not found for connection id ", f92741e, StringSubstitutor.DEFAULT_VAR_END);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var2, "DeviceBatteryStatusRepository", strM);
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        this.f92581f = b0Var;
                        this.f92576a = cVar;
                        this.f92577b = b0Var;
                        this.f92578c = deviceProfile2;
                        this.f92579d = j14;
                        this.f92580e = 1;
                        obj = aVar2.c(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        j8 = j14;
                    } else {
                        j8 = j14;
                        remoteDeviceBatteryStatusResponse = null;
                    }
                    if (remoteDeviceBatteryStatusResponse != null) {
                        batteryStatus = remoteDeviceBatteryStatusResponse.getBatteryStatus();
                    } else {
                        batteryStatus = null;
                    }
                    if (remoteDeviceBatteryStatusResponse != null) {
                        num = new Integer(remoteDeviceBatteryStatusResponse.getCurrentBatteryLevel());
                    } else {
                        num = null;
                    }
                    i2.a aVar4 = i2.f36769a;
                    a2Var = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var, "DeviceBatteryStatusRepository", "Fetched battery status for device unit id " + j8 + " -> percentage[" + num + "] status=[" + batteryStatus + "]");
                    if (num != null) {
                        if (batteryStatus != null) {
                            int i18 = c.f92561g;
                            cVar.getClass();
                            i14 = c.d.f92575a[batteryStatus.ordinal()];
                            if (i14 != 1) {
                                bVar2 = jc0.b.CHARGING;
                            } else if (i14 != 2) {
                                bVar2 = null;
                            } else {
                                bVar2 = jc0.b.FULLY_CHARGED;
                            }
                        } else {
                            bVar2 = null;
                        }
                        if (batteryStatus != null) {
                            rd2.f.a().f152045a.getClass();
                            if (cVar.f92564c.a(rd2.j.i(j8, null))) {
                                bc0.b bVar3 = cVar.f92563b;
                                String f92742f = deviceProfile2.getF92742f();
                                f92742f.getClass();
                                bVar3.c(j8, f92742f, batteryStatus);
                            } else {
                                i2.a.b(a2Var, "DeviceBatteryStatusRepository", "Ignoring battery status for non-screenless device: " + j8);
                            }
                        }
                        bVar = new jc0.c(num.intValue(), bVar2);
                        p2Var = cVar.f92567f;
                        do {
                            value = p2Var.getValue();
                            linkedHashMapN = u0.n((Map) value);
                            linkedHashMapN.put(new Long(j8), bVar);
                        } while (!p2Var.b(value, linkedHashMapN));
                    } else {
                        bVar = null;
                    }
                    int i19 = q.f128596b;
                    thB = q.b(bVar);
                    if (thB != null) {
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.f(a2Var3, "DeviceBatteryStatusRepository", "Error fetching battery status for device unit id " + j14 + " -> " + thB);
                    }
                    if (bVar instanceof q.b) {
                        return null;
                    }
                    return bVar;
                }
                i2.a aVar6 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar6.getClass();
                i2.a.f(a2Var4, "DeviceBatteryStatusRepository", "No connection id found for device unit id " + j14);
                return null;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = this.f92579d;
            deviceProfile2 = this.f92578c;
            cVar = this.f92576a;
            r.b(obj);
            remoteDeviceBatteryStatusResponse = (GDIDeviceStatus.RemoteDeviceBatteryStatusResponse) obj;
            if (remoteDeviceBatteryStatusResponse != null) {
                batteryStatus = remoteDeviceBatteryStatusResponse.getBatteryStatus();
            } else {
                batteryStatus = null;
            }
            if (remoteDeviceBatteryStatusResponse != null) {
                num = new Integer(remoteDeviceBatteryStatusResponse.getCurrentBatteryLevel());
            } else {
                num = null;
            }
            i2.a aVar7 = i2.f36769a;
            a2Var = a2.GENERAL;
            aVar7.getClass();
            i2.a.b(a2Var, "DeviceBatteryStatusRepository", "Fetched battery status for device unit id " + j8 + " -> percentage[" + num + "] status=[" + batteryStatus + "]");
            if (num != null) {
                if (batteryStatus != null) {
                    int i110 = c.f92561g;
                    cVar.getClass();
                    i14 = c.d.f92575a[batteryStatus.ordinal()];
                    if (i14 != 1) {
                        bVar2 = jc0.b.CHARGING;
                    } else if (i14 != 2) {
                        bVar2 = null;
                    } else {
                        bVar2 = jc0.b.FULLY_CHARGED;
                    }
                } else {
                    bVar2 = null;
                }
                if (batteryStatus != null) {
                    rd2.f.a().f152045a.getClass();
                    if (cVar.f92564c.a(rd2.j.i(j8, null))) {
                        bc0.b bVar4 = cVar.f92563b;
                        String f92742f2 = deviceProfile2.getF92742f();
                        f92742f2.getClass();
                        bVar4.c(j8, f92742f2, batteryStatus);
                    } else {
                        i2.a.b(a2Var, "DeviceBatteryStatusRepository", "Ignoring battery status for non-screenless device: " + j8);
                    }
                }
                bVar = new jc0.c(num.intValue(), bVar2);
                p2Var = cVar.f92567f;
                do {
                    value = p2Var.getValue();
                    linkedHashMapN = u0.n((Map) value);
                    linkedHashMapN.put(new Long(j8), bVar);
                } while (!p2Var.b(value, linkedHashMapN));
            } else {
                bVar = null;
            }
            int i111 = q.f128596b;
        } catch (Throwable th3) {
            int i24 = q.f128596b;
            bVar = new q.b(th3);
        }
        thB = q.b(bVar);
        if (thB != null) {
            i2.a aVar8 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar8.getClass();
            i2.a.f(a2Var5, "DeviceBatteryStatusRepository", "Error fetching battery status for device unit id " + j14 + " -> " + thB);
        }
        if (bVar instanceof q.b) {
            return null;
        }
        return bVar;
    }
}
