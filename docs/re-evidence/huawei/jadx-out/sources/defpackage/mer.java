package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.datatype.DataDeviceIntelligentInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mer {
    private Map<String, Integer> h;
    private eet i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41524c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41523b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41522a = new Object();
    private static final Object d = new Object();
    private static List<int[]> f = new ArrayList(16);
    private static List<List<mfh>> e = new ArrayList(16);

    private mer() {
        this.i = new eet();
        this.h = new HashMap(16);
    }

    public static mer a() {
        return a.d;
    }

    public void e(String str, int i, byte[] bArr) {
        Object objB;
        byte b2 = bArr[1];
        LogUtil.d("DeviceSettingCommandProcess", "handleResult commandType is ", Integer.valueOf(b2), " id ", str);
        if (b2 == 2 || b2 == 3) {
            objB = b(b2, bArr);
        } else if (b2 >= 4 && b2 <= 6) {
            objB = a(b2, bArr);
        } else if (b2 >= 7 && b2 <= 20) {
            objB = b(b2, str, i, bArr);
        } else if (b2 >= 23 && b2 <= 29) {
            objB = a(b2, str, bArr);
        } else if (b2 >= 33 && b2 <= 36) {
            objB = e(b2, bArr, i, str);
        } else {
            LogUtil.j("DeviceSettingCommandProcess", "handleResult command id is other :", Integer.valueOf(b2));
            objB = null;
        }
        a(objB, str, bArr);
    }

    private Object b(int i, byte[] bArr) {
        String strSubstring;
        LogUtil.a("DeviceSettingCommandProcess", "handlerCapabilityResult() in type ", Integer.valueOf(i));
        if (i == 2) {
            return h(bArr);
        }
        if (i == 3) {
            String strE = eeq.e(bArr);
            if (strE.length() < 4) {
                strSubstring = "";
            } else {
                strSubstring = strE.substring(4, strE.length());
            }
            return d(strSubstring);
        }
        LogUtil.j("DeviceSettingCommandProcess", "handlerCapabilityResult default type:", Integer.valueOf(i));
        return null;
    }

    private Object h(byte[] bArr) {
        int[] iArr;
        LogUtil.a("DeviceSettingCommandProcess", "handleServiceAbility() in");
        int length = bArr.length - 4;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 4, bArr2, 0, length);
        HashMap map = new HashMap(16);
        synchronized (f41524c) {
            iArr = f.size() != 0 ? f.get(0) : null;
        }
        if (iArr != null) {
            for (int i = 0; i < length; i++) {
                map.put(Integer.valueOf(iArr[i]), Boolean.valueOf(bArr2[i] != 0));
            }
        }
        synchronized (f41524c) {
            if (f.size() != 0) {
                f.remove(0);
            }
        }
        return map;
    }

    private Object d(String str) {
        List<mfh> list;
        LogUtil.a("DeviceSettingCommandProcess", "handleCommandAbility() in");
        ArrayList arrayList = new ArrayList(16);
        Object objC = null;
        try {
            Object obj = f41523b;
            synchronized (obj) {
                list = e.size() != 0 ? e.get(0) : null;
            }
            if (list == null) {
                return null;
            }
            objC = c(list, str, arrayList);
            synchronized (obj) {
                if (e.size() != 0) {
                    e.remove(0);
                }
            }
            return objC;
        } catch (eeu e2) {
            LogUtil.e("DeviceSettingCommandProcess", "handleCommandAbility TlvException :", ExceptionUtils.c(e2));
            return objC;
        }
    }

    private Object c(List<mfh> list, String str, List<mfk> list2) throws eeu {
        LogUtil.a("DeviceSettingCommandProcess", "parserCommandSend() in");
        Iterator<ees> it = this.i.b(str).b().iterator();
        int i = 0;
        int iV = 0;
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                mfh mfhVar = list.get(i);
                int iV2 = CommonUtil.v(eewVar.e());
                if (iV2 == 2) {
                    iV = CommonUtil.v(eewVar.b());
                } else if (iV2 == 4) {
                    mfk mfkVar = new mfk();
                    mfkVar.b(iV);
                    mfkVar.b(d(mfhVar, eewVar.b()));
                    list2.add(mfkVar);
                } else {
                    LogUtil.j("DeviceSettingCommandProcess", "parserCommandSend() tlv tag is error:", Integer.valueOf(CommonUtil.v(eewVar.e())));
                }
            }
            i++;
        }
        return list2;
    }

    private Map<Integer, Boolean> d(mfh mfhVar, String str) {
        HashMap map = new HashMap(16);
        if (mfhVar != null) {
            int i = 0;
            int i2 = 0;
            while (i < str.length()) {
                int i3 = i + 2;
                if (CommonUtil.v(str.substring(i, i3)) == 1) {
                    map.put(mfhVar.d().get(i2), true);
                } else {
                    map.put(mfhVar.d().get(i2), false);
                }
                i2++;
                i = i3;
            }
        }
        return map;
    }

    private Object a(int i, byte[] bArr) {
        String strSubstring;
        LogUtil.a("DeviceSettingCommandProcess", "handleDeviceDate() in type ", Integer.valueOf(i));
        if (i == 4 || i == 5) {
            return Integer.valueOf(b(bArr));
        }
        if (i == 6) {
            String strE = eeq.e(bArr);
            if (strE.length() < 4) {
                strSubstring = "";
            } else {
                strSubstring = strE.substring(4, strE.length());
            }
            return e(strSubstring);
        }
        LogUtil.j("DeviceSettingCommandProcess", "handleDeviceDate default type:", Integer.valueOf(i));
        return null;
    }

    private int b(byte[] bArr) {
        LogUtil.a("DeviceSettingCommandProcess", "getString() in");
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 8) {
            LogUtil.j("DeviceSettingCommandProcess", "getString() in valid data");
            return -1;
        }
        return CommonUtil.v(strE.substring(8, strE.length()));
    }

    private Object e(String str) {
        LogUtil.a("DeviceSettingCommandProcess", "getData() in");
        try {
            mfg mfgVar = new mfg();
            Iterator<eew> it = this.i.b(str).e().iterator();
            while (it.hasNext()) {
                e(it.next(), mfgVar);
            }
            return mfgVar;
        } catch (eeu e2) {
            LogUtil.e("DeviceSettingCommandProcess", "getData COMMAND_ID_GET_DATE TlvException:", ExceptionUtils.c(e2));
            return null;
        }
    }

    private void e(eew eewVar, mfg mfgVar) {
        int iV = CommonUtil.v(eewVar.e());
        if (iV == 1) {
            mfgVar.d(CommonUtil.x(eewVar.b()) * 1000);
        } else {
            if (iV == 2) {
                mfgVar.e((CommonUtil.v(eewVar.b().substring(0, 2)) * 100) + CommonUtil.v(eewVar.b().substring(2, 4)));
                return;
            }
            LogUtil.j("DeviceSettingCommandProcess", "setDataGmtTime() tlv tag is error:", Integer.valueOf(iV));
        }
    }

    private Object b(int i, String str, int i2, byte[] bArr) {
        LogUtil.a("DeviceSettingCommandProcess", "handleDeviceResult() in type ", Integer.valueOf(i));
        if (i != 20) {
            switch (i) {
                case 7:
                    return mfe.d().a(str, bArr);
                case 8:
                    return b(str, i2, bArr);
                case 9:
                    return Integer.valueOf(b(bArr));
                case 10:
                case 11:
                case 12:
                    return Integer.valueOf(b(bArr));
                case 13:
                    return d(bArr);
                default:
                    LogUtil.j("DeviceSettingCommandProcess", "handleDeviceResult default type:", Integer.valueOf(i));
                    return null;
            }
        }
        return a(bArr);
    }

    private mgp e(byte[] bArr) {
        mgp mgpVar = new mgp();
        String strE = eeq.e(bArr);
        LogUtil.a("DeviceSettingCommandProcess", "getDeviceBattery info:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() <= 4) {
            LogUtil.j("DeviceSettingCommandProcess", "getBattery data is error");
            return mgpVar;
        }
        e(strE, mgpVar);
        return mgpVar;
    }

    private void e(String str, mgp mgpVar) {
        try {
            for (eew eewVar : this.i.b(str.substring(4)).e()) {
                int iV = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                if (iV == 1) {
                    mgpVar.c(Math.min(CommonUtil.v(strB), 100));
                } else if (iV == 2) {
                    if (strB != null && strB.length() >= 6) {
                        mgpVar.a(c(CommonUtil.v(strB.substring(0, 2))));
                        mgpVar.j(c(CommonUtil.v(strB.substring(2, 4))));
                        mgpVar.b(c(CommonUtil.v(strB.substring(4))));
                    }
                    LogUtil.a("DeviceSettingCommandProcess", "leftEar is ", 0, "rightEar is ", 0, "chargeBox is ", 0);
                } else if (iV != 3) {
                    LogUtil.j("DeviceSettingCommandProcess", "parseDeviceBattery() tlv tag is error:", Integer.valueOf(iV));
                } else {
                    if (strB != null && strB.length() >= 6) {
                        mgpVar.d(CommonUtil.v(strB.substring(0, 2)));
                        mgpVar.f(CommonUtil.v(strB.substring(2, 4)));
                        mgpVar.e(CommonUtil.v(strB.substring(4)));
                    }
                    LogUtil.a("DeviceSettingCommandProcess", "leftEar State is ", 0, "rightEar State is ", 0, "chargeBox State is ", 0);
                }
            }
        } catch (eeu e2) {
            LogUtil.e("DeviceSettingCommandProcess", "getDeviceBattery COMMAND_ID_GET_BATTERY TlvException:", ExceptionUtils.c(e2));
        }
    }

    private int c(int i) {
        if (i == 255) {
            return -1;
        }
        return Math.min(i, 100);
    }

    private Object b(String str, int i, byte[] bArr) {
        mgp mgpVar = new mgp();
        Intent intent = new Intent();
        intent.setAction("com.huawei.bone.action.BATTERY_LEVEL");
        if (bArr.length > 3 && bArr[2] == 127) {
            ReleaseLogUtil.a("DEVMGR_DeviceSettingCommandProcess", "getBattery() get battery level timeout.");
            return mgpVar;
        }
        if (d() == 0) {
            if (bArr.length > 14) {
                mgpVar.c(Math.min((int) bArr[14], 100));
            } else {
                mgpVar.c(0);
            }
        } else {
            try {
                mgpVar = e(bArr);
            } catch (NumberFormatException e2) {
                LogUtil.e("DeviceSettingCommandProcess", "getBattery Exception = ", e2.getMessage());
            }
        }
        if (!eel.d(i)) {
            mgt.e(mgpVar.d());
        }
        mgt.d(str, mgpVar.d());
        mgt.d(str, mgpVar);
        intent.putExtra("BATTERY_LEVEL", mgpVar.d());
        intent.putExtra("DEVICE_MAC", str);
        intent.putExtra("BATTERY_LEFT", mgpVar.b());
        intent.putExtra("BATTERY_RIGHT", mgpVar.e());
        ReleaseLogUtil.d("DEVMGR_DeviceSettingCommandProcess", "getBattery(result) productType is ", Integer.valueOf(i), ", deviceId is ", CommonUtil.n(str), ", battery:", Integer.valueOf(mgpVar.d()), ", left_battery:", Integer.valueOf(mgpVar.b()), ", right_battery:", Integer.valueOf(mgpVar.e()));
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
        return mgpVar;
    }

    private int d() {
        DeviceInfo deviceInfoC = mgg.c("DeviceSettingCommandProcess");
        if (deviceInfoC != null) {
            return deviceInfoC.getDeviceProtocol();
        }
        return -1;
    }

    private Object d(byte[] bArr) {
        LogUtil.a("DeviceSettingCommandProcess", "factoryReset() in");
        if (d() == 0) {
            return Integer.valueOf(g(bArr));
        }
        int iB = b(bArr);
        if (iB == 100000) {
            try {
                synchronized (f41522a) {
                    String strA = mev.d().a();
                    if (TextUtils.isEmpty(strA)) {
                        LogUtil.j("DeviceSettingCommandProcess", "deleteMac is empty");
                    }
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(strA);
                    LogUtil.j("DeviceSettingCommandProcess", "deleteDevice");
                    DeviceInfo deviceInfoB = mgg.b(strA, "DeviceSettingCommandProcess");
                    lvb.e().d((List<String>) arrayList, true);
                    if (deviceInfoB != null) {
                        b(deviceInfoB.getSecurityUuid() + "#ANDROID21");
                    } else {
                        LogUtil.j("DeviceSettingCommandProcess", "deleteDevice currentDeviceInfo is null");
                    }
                }
            } catch (RemoteException e2) {
                LogUtil.e("DeviceSettingCommandProcess", "factoryReset() RemoteException:", ExceptionUtils.c(e2));
                lug.e(BaseApplication.getContext());
            }
        }
        return Integer.valueOf(iB);
    }

    private int g(byte[] bArr) {
        LogUtil.a("DeviceSettingCommandProcess", "handleLinkLayerV0FactoryReset() in");
        if (bArr.length > 3 && bArr[2] == 127) {
            return 100009;
        }
        if (bArr.length == 3) {
            return e(bArr[2]);
        }
        return 100001;
    }

    private int e(int i) {
        if (i != 0) {
            if (i == 1) {
                LogUtil.e("DeviceSettingCommandProcess", "V0 Device factory reset fail for time remove.");
                return i;
            }
            if (i == 2) {
                LogUtil.e("DeviceSettingCommandProcess", "V0 Device factory reset fail for flash remove.");
                return i;
            }
            LogUtil.e("DeviceSettingCommandProcess", "V0 Device factory reset fail for unknown.");
            return i;
        }
        LogUtil.a("DeviceSettingCommandProcess", "handleFactoryResetErrorCode V0 Device factory reset success.");
        synchronized (f41522a) {
            String strA = mev.d().a();
            if (TextUtils.isEmpty(strA)) {
                LogUtil.j("DeviceSettingCommandProcess", "deleteMac is empty");
            }
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(strA);
            try {
                LogUtil.j("DeviceSettingCommandProcess", "deleteDevice");
                lvb.e().d((List<String>) arrayList, true);
            } catch (RemoteException e2) {
                LogUtil.e("DeviceSettingCommandProcess", "handleFactoryResetErrorCode() RemoteException:", ExceptionUtils.c(e2));
                lug.e(BaseApplication.getContext());
            }
        }
        return 100000;
    }

    private void b(String str) {
        LogUtil.j("DeviceSettingCommandProcess", "deleteDeviceToSmartLife sn:", CommonUtil.n(str));
        if (Utils.o() || TextUtils.isEmpty(str)) {
            return;
        }
        ProfileAgent.PROFILE_AGENT.connectProfile(new c(str));
        LogUtil.a("DeviceSettingCommandProcess", "syncDeviceInfoToSmartLife enter");
    }

    static class c implements ServiceConnectCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f41525b;

        public c(String str) {
            this.f41525b = str;
        }

        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onConnect() {
            LogUtil.a("DeviceSettingCommandProcess", "profile connected");
            ProfileAgent.PROFILE_AGENT.setConnected(true);
            lsy.a(new Runnable() { // from class: met
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            });
        }

        /* synthetic */ void a() {
            new mgz().a(this.f41525b);
            ProfileAgent.PROFILE_AGENT.disconnectProfile();
        }

        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onDisconnect() {
            ProfileAgent.PROFILE_AGENT.setConnected(false);
            LogUtil.a("DeviceSettingCommandProcess", "profile disconnected");
        }
    }

    private Object a(byte[] bArr) {
        LogUtil.a("DeviceSettingCommandProcess", "getGoldCard() in");
        String binaryString = Integer.toBinaryString(b(bArr));
        int length = binaryString.length();
        if (length < 8) {
            for (int i = 0; i < 8 - length; i++) {
                binaryString = "0" + binaryString;
            }
        }
        return Boolean.valueOf(binaryString.substring(4, 5).equals("1"));
    }

    private Object a(int i, String str, byte[] bArr) {
        String strSubstring;
        LogUtil.a("DeviceSettingCommandProcess", "handlerSetDeviceResult() in type ", Integer.valueOf(i));
        switch (i) {
            case 24:
                String strE = eeq.e(bArr);
                if (strE.length() < 4) {
                    strSubstring = "";
                } else {
                    strSubstring = strE.substring(4, strE.length());
                }
                return c(strSubstring);
            case 25:
                return Integer.toBinaryString(b(bArr));
            case 26:
            case 27:
                return Integer.valueOf(b(bArr));
            case 28:
            default:
                LogUtil.j("DeviceSettingCommandProcess", "handlerSetDeviceResult default type:", Integer.valueOf(i));
                return null;
            case 29:
                return e(str, bArr);
        }
    }

    private Object c(String str) {
        LogUtil.a("DeviceSettingCommandProcess", "lockScreen() in");
        Integer numValueOf = null;
        try {
            for (eew eewVar : this.i.b(str).e()) {
                if (CommonUtil.b(eewVar.e(), 16) == 1) {
                    numValueOf = Integer.valueOf(CommonUtil.b(eewVar.b(), 16));
                } else {
                    LogUtil.j("DeviceSettingCommandProcess", "lockScreen() tag is other", Integer.valueOf(CommonUtil.b(eewVar.e(), 16)));
                }
            }
            return numValueOf;
        } catch (eeu e2) {
            LogUtil.e("DeviceSettingCommandProcess", "lockScreen() COMMAND_ID_PAY_GET_CPLC TlvException:", ExceptionUtils.c(e2));
            return numValueOf;
        }
    }

    private Object e(String str, byte[] bArr) {
        LogUtil.a("DeviceSettingCommandProcess", "getAllowDisturbContentList messages :", eeq.e(bArr));
        Integer numValueOf = Integer.valueOf(b(bArr));
        LogUtil.a("DeviceSettingCommandProcess", "getAllowDisturbContentList object: ", numValueOf);
        this.h.put(str, Integer.valueOf(b(bArr)));
        return numValueOf;
    }

    public int a(String str) {
        if (TextUtils.isEmpty(str) || this.h.get(str) == null) {
            return 0;
        }
        return this.h.get(str).intValue();
    }

    private Object e(int i, byte[] bArr, int i2, String str) {
        String strSubstring;
        LogUtil.a("DeviceSettingCommandProcess", "handleOtherDeviceResult() in type ", Integer.valueOf(i));
        switch (i) {
            case 33:
                return b(bArr, str);
            case 34:
                String strE = eeq.e(bArr);
                if (strE.length() < 4) {
                    strSubstring = "";
                } else {
                    strSubstring = strE.substring(4, strE.length());
                }
                return d(strSubstring, i2);
            case 35:
            case 36:
                return bArr;
            default:
                LogUtil.j("DeviceSettingCommandProcess", "handleOtherDeviceResult default type:", Integer.valueOf(i));
                return null;
        }
    }

    private Object b(byte[] bArr, String str) {
        LogUtil.a("DeviceSettingCommandProcess", "getDefaultSwitch in");
        String strE = eeq.e(bArr);
        LogUtil.a("DeviceSettingCommandProcess", "getDefaultSwitch message :", strE);
        Integer numValueOf = Integer.valueOf(b(bArr));
        LogUtil.a("DeviceSettingCommandProcess", "getDefaultSwitch value:", numValueOf);
        if (eej.c() != null && eej.c().isSupportDefaultSwitch()) {
            ReleaseLogUtil.d("DEVMGR_DeviceSettingCommandProcess", "getDefaultSwitch device support default switch");
            int iV = CommonUtil.v(strE.substring(4, 6));
            if (iV == 1) {
                mfd.a().a(c(bArr), str);
                return numValueOf;
            }
            ReleaseLogUtil.e("DEVMGR_DeviceSettingCommandProcess", "getDefaultSwitch type is error, type:", Integer.valueOf(iV));
            return numValueOf;
        }
        ReleaseLogUtil.e("DEVMGR_DeviceSettingCommandProcess", "getDefaultSwitch device not support default switch");
        return numValueOf;
    }

    private int c(byte[] bArr) {
        String strE = eeq.e(bArr);
        try {
            if (strE.length() < 4) {
                LogUtil.j("DeviceSettingCommandProcess", "getString invalid data");
                return -1;
            }
            return Integer.parseInt(strE.substring(4, strE.length()), 16);
        } catch (NumberFormatException unused) {
            LogUtil.e("DeviceSettingCommandProcess", "getString NumberFormatException");
            return 0;
        }
    }

    private Object d(String str, int i) {
        DataDeviceIntelligentInfo dataDeviceIntelligentInfo;
        LogUtil.a("DeviceSettingCommandProcess", "getIntelligentHomeLinkage() in");
        DataDeviceIntelligentInfo dataDeviceIntelligentInfo2 = new DataDeviceIntelligentInfo();
        if (d() == 0) {
            LogUtil.a("DeviceSettingCommandProcess", "LinkLayerVersion.LINK_LAYER_V0 == getCurrentDeviceProtocol()");
        } else {
            try {
                for (eew eewVar : this.i.b(str).e()) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    if (iB == 1) {
                        dataDeviceIntelligentInfo2.setDeviceManu(eeq.d(eewVar.b()));
                    } else if (iB == 2) {
                        dataDeviceIntelligentInfo2.setDeviceProductId(cqn.a(i, eeq.d(eewVar.b())));
                    } else if (iB == 3) {
                        dataDeviceIntelligentInfo2.setDeviceHiv(eeq.d(eewVar.b()));
                    } else {
                        LogUtil.j("DeviceSettingCommandProcess", "getIntelligentHomeLinkage tag is other：", Integer.valueOf(iB));
                    }
                }
                dataDeviceIntelligentInfo = dataDeviceIntelligentInfo2;
            } catch (eeu e2) {
                LogUtil.e("DeviceSettingCommandProcess", "getIntelligentHomeLinkage Exception:", ExceptionUtils.c(e2));
                dataDeviceIntelligentInfo = null;
            }
            mev.d().d(dataDeviceIntelligentInfo2);
            return dataDeviceIntelligentInfo;
        }
        dataDeviceIntelligentInfo = null;
        mev.d().d(dataDeviceIntelligentInfo2);
        return dataDeviceIntelligentInfo;
    }

    private void a(Object obj, String str, byte[] bArr) {
        LogUtil.a("DeviceSettingCommandProcess", "sendCallback in ");
        synchronized (d) {
            List<IBaseResponseCallback> listB = luh.b(bArr[1]);
            if (listB == null) {
                LogUtil.j("DeviceSettingCommandProcess", "sendCallback callbacks is null.");
                return;
            }
            if (obj != null && listB.size() != 0) {
                if (bArr[1] == 8 && (obj instanceof mgp)) {
                    try {
                        mgp mgpVar = (mgp) obj;
                        mgpVar.a(str);
                        Iterator<IBaseResponseCallback> it = listB.iterator();
                        while (it.hasNext()) {
                            it.next().a(0, mgpVar);
                        }
                    } catch (ClassCastException unused) {
                        LogUtil.e("DeviceSettingCommandProcess", "sendCallback ClassCastException");
                    }
                    listB.clear();
                } else {
                    listB.get(0).a(0, obj);
                    listB.remove(0);
                }
            } else if (listB.size() != 0) {
                listB.get(0).a(100001, "UNKNOWN_ERROR");
                listB.remove(0);
            }
        }
    }

    static class a {
        private static mer d = new mer();
    }
}
