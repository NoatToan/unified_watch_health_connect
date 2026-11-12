package defpackage;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mvk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private eet f42504b;

    private mvk() {
        this.f42504b = new eet();
    }

    public void a(DeviceInfo deviceInfo) {
        b();
    }

    private void b() {
        LogUtil.a("DataDictionarySingleManager", "registerDataReceiveCallback enter");
        DataReceiveCallback dataReceiveCallback = new DataReceiveCallback() { // from class: mvk.5
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                if (eecVar == null || deviceInfo == null) {
                    LogUtil.j("DataDictionarySingleManager", "onDataReceived message or device is null,errorCode:", Integer.valueOf(i));
                    return;
                }
                if (!(eecVar instanceof eee)) {
                    LogUtil.j("DataDictionarySingleManager", "onDataReceived message not SampleEvent");
                    return;
                }
                eee eeeVar = (eee) eecVar;
                long jD = eeeVar.d();
                if (jD != 800100004) {
                    LogUtil.j("DataDictionarySingleManager", "onDataReceived eventId not support:", Long.valueOf(jD));
                    return;
                }
                byte[] bArrC = eeeVar.c();
                if (bArrC == null) {
                    LogUtil.j("DataDictionarySingleManager", "onDataReceived eventData is null");
                    return;
                }
                String strE = eeq.e(bArrC);
                String deviceIdentify = deviceInfo.getDeviceIdentify();
                LogUtil.a("DataDictionarySingleManager", "onDataReceived data:", strE);
                mvk.this.e(deviceIdentify, strE);
            }
        };
        LogUtil.a("DataDictionarySingleManager", "DataDictionarySingleManager constructor srcName:", "hw.unitedevice.dic.event", ",mDataReceiveCallback:", dataReceiveCallback);
        edc.e().registerDeviceSampleListener("hw.unitedevice.dic.event", dataReceiveCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2) {
        LinkedList<mvh> linkedList = new LinkedList<>();
        a(str2, linkedList);
        if (linkedList.isEmpty()) {
            LogUtil.j("DataDictionarySingleManager", "onDataReceived singleInfosList is Empty");
        } else {
            LogUtil.a("DataDictionarySingleManager", "parseParamsToSync:", Integer.valueOf(linkedList.get(0).b()));
            mvs.d(str, linkedList);
        }
    }

    private void a(String str, LinkedList<mvh> linkedList) {
        try {
            Iterator<ees> it = this.f42504b.b(str).b().iterator();
            while (it.hasNext()) {
                a(it.next(), linkedList);
            }
        } catch (eeu unused) {
            LogUtil.e("DataDictionarySingleManager", "onDataReceived processTlvData TlvException");
        }
    }

    private void a(ees eesVar, LinkedList<mvh> linkedList) {
        if (eesVar == null) {
            return;
        }
        Iterator<ees> it = eesVar.b().iterator();
        while (it.hasNext()) {
            e(it.next(), linkedList);
        }
    }

    private void e(ees eesVar, LinkedList<mvh> linkedList) {
        if (eesVar == null) {
            return;
        }
        List<eew> listE = eesVar.e();
        LogUtil.a("DataDictionarySingleManager", "parseFieldTlv.size:", Integer.valueOf(listE.size()));
        for (eew eewVar : listE) {
            int iV = CommonUtil.v(eewVar.e());
            String strB = eewVar.b();
            LogUtil.a("DataDictionarySingleManager", "TLV-getTag:", Integer.valueOf(iV), "TLV-getValue:", strB);
            if (iV == 3) {
                mvh mvhVar = new mvh();
                mvhVar.c(CommonUtil.v(strB));
                linkedList.add(mvhVar);
            }
        }
    }

    public static mvk d() {
        return e.e;
    }

    static class e {
        private static final mvk e = new mvk();
    }
}
