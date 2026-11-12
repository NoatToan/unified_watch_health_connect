package defpackage;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mvo {
    private eet d;

    /* synthetic */ mvo(AnonymousClass1 anonymousClass1) {
        this();
    }

    private mvo() {
        this.d = new eet();
    }

    public void d(LinkedList<mvh> linkedList, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.j("DataDictionarySingleSequenceManager", "startToSyncByHealthKit");
        if (linkedList == null) {
            LogUtil.j("DataDictionarySingleSequenceManager", "startToSyncByHealthKit singleInfosList is null");
            iBaseResponseCallback.a(1, "");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "DataDictionarySingleSequenceManager");
        if (deviceList == null) {
            LogUtil.j("DataDictionarySingleSequenceManager", "startToSyncByHealthKit deviceInfoList is null");
            iBaseResponseCallback.a(1, "");
            return;
        }
        deviceList.removeAll(Collections.singleton(null));
        if (deviceList.size() == 0) {
            LogUtil.j("DataDictionarySingleSequenceManager", "startToSyncByHealthKit deviceInfoList is empty");
            iBaseResponseCallback.a(1, "");
        } else {
            LogUtil.a("DataDictionarySingleSequenceManager", "connected device size = ", Integer.valueOf(deviceList.size()));
            Iterator<DeviceInfo> it = deviceList.iterator();
            while (it.hasNext()) {
                mvs.e(it.next().getDeviceIdentify(), linkedList, iBaseResponseCallback);
            }
        }
    }

    /* JADX INFO: renamed from: mvo$1, reason: invalid class name */
    class AnonymousClass1 implements DataReceiveCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ mvo f42515b;

        @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
        public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
            if (eecVar == null || deviceInfo == null) {
                LogUtil.j("DataDictionarySingleSequenceManager", "onDataReceived message or device is null,errorCode:", Integer.valueOf(i));
                return;
            }
            if (!(eecVar instanceof eee)) {
                LogUtil.j("DataDictionarySingleSequenceManager", "onDataReceived message not SampleEvent");
                return;
            }
            eee eeeVar = (eee) eecVar;
            long jD = eeeVar.d();
            if (jD != 800100004) {
                LogUtil.j("DataDictionarySingleSequenceManager", "onDataReceived eventId not support:", Long.valueOf(jD));
                return;
            }
            byte[] bArrC = eeeVar.c();
            if (bArrC == null) {
                LogUtil.j("DataDictionarySingleSequenceManager", "onDataReceived eventData is null");
                return;
            }
            String strE = eeq.e(bArrC);
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            LogUtil.a("DataDictionarySingleSequenceManager", "onDataReceived data:", strE);
            this.f42515b.b(deviceIdentify, strE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        LinkedList<mvh> linkedList = new LinkedList<>();
        a(str2, linkedList);
        if (linkedList.isEmpty()) {
            LogUtil.j("DataDictionarySingleSequenceManager", "onDataReceived singleInfosList is Empty");
        }
    }

    private void a(String str, LinkedList<mvh> linkedList) {
        try {
            Iterator<ees> it = this.d.b(str).b().iterator();
            while (it.hasNext()) {
                d(it.next(), linkedList);
            }
        } catch (eeu unused) {
            LogUtil.e("DataDictionarySingleSequenceManager", "onDataReceived processTlvData TlvException");
        }
    }

    private void d(ees eesVar, LinkedList<mvh> linkedList) {
        if (eesVar == null) {
            return;
        }
        Iterator<ees> it = eesVar.b().iterator();
        while (it.hasNext()) {
            b(it.next(), linkedList);
        }
    }

    private void b(ees eesVar, LinkedList<mvh> linkedList) {
        if (eesVar == null) {
            return;
        }
        for (eew eewVar : eesVar.e()) {
            int iV = CommonUtil.v(eewVar.e());
            String strB = eewVar.b();
            LogUtil.a("DataDictionarySingleSequenceManager", "TLV-getTag:", Integer.valueOf(iV), "TLV-getValue:", strB);
            if (iV == 3) {
                mvh mvhVar = new mvh();
                mvhVar.c(CommonUtil.v(strB));
                linkedList.add(mvhVar);
            }
        }
    }

    public static mvo b() {
        return b.f42516a;
    }

    public boolean d(DeviceInfo deviceInfo, String str) {
        LinkedList linkedList = new LinkedList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            LogUtil.a("DataDictionarySingleSequenceManager", "startDataDictionary jsonString", jSONObject.toString());
            JSONArray jSONArray = jSONObject.getJSONArray("digitTypeIds");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                int i2 = jSONArray.getInt(i);
                mvh mvhVar = new mvh();
                mvhVar.c(i2);
                linkedList.add(mvhVar);
            }
            mvs.e(deviceInfo.getDeviceIdentify(), linkedList, null);
            return true;
        } catch (JSONException unused) {
            LogUtil.e("DataDictionarySingleSequenceManager", "checkJson startDataDictionary JSONException");
            return false;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final mvo f42516a = new mvo(null);
    }
}
