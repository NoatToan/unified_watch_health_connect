package bc0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIDeviceStatus;
import d53.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.k0;
import p13.u0;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbc0/c;", "Lbc0/b;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;", "dashboardPreferences", "<init>", "(Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements bc0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f17406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f17407b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17408a;

        static {
            int[] iArr = new int[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.values().length];
            try {
                iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.CRITICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.LOW_PULSE_OX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.FULLY_CHARGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f17408a = iArr;
        }
    }

    static {
        new a(null);
    }

    public c(s0 s0Var) {
        s0Var.getClass();
        this.f17406a = s0Var;
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f17407b = q2.a(k0Var);
    }

    @Override // bc0.b
    public final d a() {
        return new d(this.f17407b);
    }

    @Override // bc0.b
    public final void b(long j8) {
        p2 p2Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            p2Var = this.f17407b;
            value = p2Var.getValue();
            Map map = (Map) value;
            Long lValueOf = Long.valueOf(j8);
            map.getClass();
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove(lValueOf);
        } while (!p2Var.b(value, u0.g(linkedHashMap)));
    }

    @Override // bc0.b
    public final void c(long j8, String str, GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatus) {
        Object value;
        Object value2;
        LinkedHashMap linkedHashMap;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.DEVICES;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "onBatteryStatusReceived ", StringUtils.SPACE, str);
        sbK.append(StringUtils.SPACE);
        sbK.append(remoteDeviceBatteryStatusBatteryStatus);
        String string = sbK.toString();
        aVar.getClass();
        i2.a.b(a2Var, "RemoteDeviceBatteryStatusObserverImpl", string);
        int i14 = b.f17408a[remoteDeviceBatteryStatusBatteryStatus.ordinal()];
        p2 p2Var = this.f17407b;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u0.i((Map) value, new p(Long.valueOf(j8), new bc0.a(j8, str, remoteDeviceBatteryStatusBatteryStatus)))));
            return;
        }
        if (i14 != 4 && i14 != 5) {
            i2.a.b(a2Var, "RemoteDeviceBatteryStatusObserverImpl", "Ignoring battery status " + remoteDeviceBatteryStatusBatteryStatus + " for device " + j8);
            return;
        }
        s0 s0Var = this.f17406a;
        Set<String> setF = s0Var.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setF) {
            if (!w.z((String) obj, String.valueOf(j8), false)) {
                arrayList.add(obj);
            }
        }
        Set<String> setG1 = h0.g1(arrayList);
        do {
            value2 = p2Var.getValue();
            Map map = (Map) value2;
            Long lValueOf = Long.valueOf(j8);
            map.getClass();
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove(lValueOf);
        } while (!p2Var.b(value2, u0.g(linkedHashMap)));
        s0Var.g(setG1);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbc0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
