package defpackage;

import com.huawei.datatype.GpsStruct;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<IBaseResponseCallback> f42535a = new ArrayList(16);
    private static List<IBaseResponseCallback> d = new ArrayList(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<IBaseResponseCallback> f42537c = new ArrayList(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<IBaseResponseCallback> f42536b = new ArrayList(16);

    public static List<IBaseResponseCallback> d() {
        return (List) lst.d(f42535a);
    }

    public static List<IBaseResponseCallback> a() {
        return (List) lst.d(d);
    }

    public static List<IBaseResponseCallback> b() {
        return (List) lst.d(f42537c);
    }

    public static List<IBaseResponseCallback> c() {
        return (List) lst.d(f42536b);
    }

    public static boolean c(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapability;
        boolean zIsSupportGpsLocation = false;
        if (deviceInfo == null) {
            LogUtil.j("GpsManager", "getDeviceSupportCapacity, deviceInfo is empty");
            return false;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "GpsManager");
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty() && (deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify())) != null) {
            zIsSupportGpsLocation = deviceCapability.isSupportGpsLocation();
        }
        LogUtil.a("GpsManager", "get Device Support runplan Capacity, capacity:", Boolean.valueOf(zIsSupportGpsLocation));
        return zIsSupportGpsLocation;
    }

    private static ByteBuffer b(int i, int i2) {
        byte[] bArrH = eeq.h(i2);
        byte[] bArrA = eeq.a(bArrH.length);
        byte[] bArrJ = eeq.j(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrJ.length + bArrA.length + bArrH.length);
        byteBufferAllocate.put(bArrJ).put(bArrA).put(bArrH);
        return byteBufferAllocate;
    }

    private static ByteBuffer e(int i, int i2) {
        byte[] bArrC = eeq.c(i2);
        byte[] bArrA = eeq.a(bArrC.length);
        byte[] bArrJ = eeq.j(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrJ.length + bArrA.length + bArrC.length);
        byteBufferAllocate.put(bArrJ).put(bArrA).put(bArrC);
        return byteBufferAllocate;
    }

    private static ByteBuffer d(int i, double d2) {
        byte[] bArrE = eeq.e(d2);
        byte[] bArrA = eeq.a(bArrE.length);
        byte[] bArrJ = eeq.j(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrJ.length + bArrA.length + bArrE.length);
        byteBufferAllocate.put(bArrJ).put(bArrA).put(bArrE);
        return byteBufferAllocate;
    }

    public static byte[] c(List<GpsStruct> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        int iCapacity = 0;
        for (int i = 0; i < list.size(); i++) {
            ArrayList arrayList2 = new ArrayList(16);
            GpsStruct gpsStruct = list.get(i);
            e(gpsStruct, z, arrayList2);
            if (gpsStruct.getGpsLatitude() != -1.0d) {
                arrayList2.add(d(9, gpsStruct.getGpsLatitude()));
            }
            if (gpsStruct.getGpsLongitude() != -1.0d) {
                arrayList2.add(d(10, gpsStruct.getGpsLongitude()));
            }
            if (gpsStruct.getGpsMarsLatitude() != -1.0d) {
                arrayList2.add(d(11, gpsStruct.getGpsMarsLatitude()));
            }
            if (gpsStruct.getGpsMarsLongitude() != -1.0d) {
                arrayList2.add(d(12, gpsStruct.getGpsMarsLongitude()));
            }
            if (gpsStruct.getGpsDirection() != -1.0d) {
                arrayList2.add(d(13, gpsStruct.getGpsDirection()));
            }
            if (gpsStruct.getGpsPrecision() != -1.0d) {
                arrayList2.add(d(14, gpsStruct.getGpsPrecision()));
            }
            if (gpsStruct.getGpsQuality() != -1) {
                arrayList2.add(e(15, gpsStruct.getGpsQuality()));
            }
            Iterator it = arrayList2.iterator();
            int iCapacity2 = 0;
            while (it.hasNext()) {
                iCapacity2 += ((ByteBuffer) it.next()).capacity();
            }
            byte[] bArrA = eeq.a(iCapacity2);
            byte[] bArrJ = eeq.j(130);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrJ.length + bArrA.length + iCapacity2);
            byteBufferAllocate.put(bArrJ).put(bArrA);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                byteBufferAllocate.put(((ByteBuffer) it2.next()).array());
            }
            arrayList.add(byteBufferAllocate);
            iCapacity += byteBufferAllocate.capacity();
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iCapacity);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            byteBufferAllocate2.put(((ByteBuffer) it3.next()).array());
        }
        return byteBufferAllocate2.array();
    }

    private static void e(GpsStruct gpsStruct, boolean z, List<ByteBuffer> list) {
        if (z && gpsStruct.getGpsSpeed() != -1) {
            list.add(e(3, gpsStruct.getGpsSpeed()));
        }
        if (gpsStruct.getGpsDistance() != -1) {
            list.add(b(4, (int) gpsStruct.getGpsDistance()));
        }
        if (gpsStruct.getGpsAltitude() != -1) {
            list.add(e(5, gpsStruct.getGpsAltitude()));
        }
        if (gpsStruct.getGpsTotalDistance() != -1) {
            list.add(b(6, (int) gpsStruct.getGpsTotalDistance()));
        }
        if (gpsStruct.getGpsStartTime() != -1) {
            list.add(b(7, (int) gpsStruct.getGpsStartTime()));
        }
        if (gpsStruct.getGpsEndTime() != -1) {
            list.add(b(8, (int) gpsStruct.getGpsEndTime()));
        }
    }
}
