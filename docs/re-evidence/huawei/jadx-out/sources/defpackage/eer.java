package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;
import health.compact.a.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes7.dex */
public class eer implements DataReceiveCallback {
    private static final Object d = new Object();
    private static eer e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IBaseResponseCallback> f32853c = new CopyOnWriteArrayList();

    private eer() {
    }

    public static eer c() {
        eer eerVar;
        synchronized (d) {
            if (e == null) {
                e = new eer();
            }
            eerVar = e;
        }
        return eerVar;
    }

    public void e() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.certificateChain", this);
    }

    public void e(DeviceInfo deviceInfo, int[] iArr, String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSecurityCertUtils", "sendGetDeviceCertCommand() in");
        if (iBaseResponseCallback == null) {
            LogUtil.j("DeviceSecurityCertUtils", "sendSettingDeviceCommand, responseCallback is null");
            return;
        }
        e();
        if (deviceInfo == null) {
            LogUtil.j("DeviceSecurityCertUtils", "sendSettingDeviceCommand, deviceInfo is null or switchStatus isEmpty.");
            iBaseResponseCallback.a(-1, "");
        } else if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("DeviceSecurityCertUtils", "device is not connected.");
            iBaseResponseCallback.a(-1, "");
        } else {
            this.f32853c.add(iBaseResponseCallback);
            eef eefVarA = a(iArr, str);
            LogUtil.d("DeviceSecurityCertUtils", "constructSampleConfig: ", eefVarA);
            edc.e().sendSampleConfigCommand(deviceInfo, eefVarA, "DeviceSecurityCertUtils");
        }
    }

    private eef a(int[] iArr, String str) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.certificateChain");
        eefVar.setWearPkgName("in.huawei.AutDevice");
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(900100012L);
        eegVar.b(2);
        eegVar.d(c(iArr, str));
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    private byte[] c(int[] iArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append(a(1, i));
        }
        sb.append(a(2, str));
        return HEXUtils.a(sb.toString());
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("DeviceSecurityCertUtils", "onDataReceived() errorCode = ", Integer.valueOf(i));
        if (this.f32853c.isEmpty()) {
            LogUtil.j("DeviceSecurityCertUtils", "onDataReceived() response callback is null");
            return;
        }
        if (deviceInfo == null || b(eecVar)) {
            LogUtil.j("DeviceSecurityCertUtils", "onDataReceived() device == null or isCheckSampleError");
            a(-1, "");
            return;
        }
        if (eecVar instanceof eef) {
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (configInfoList == null || configInfoList.size() == 0) {
                LogUtil.j("DeviceSecurityCertUtils", "onDataReceived sampleConfigInfoList empty");
                a(-1, "");
                return;
            }
            eeg eegVar = configInfoList.get(0);
            int iD = eegVar.d();
            LogUtil.a("DeviceSecurityCertUtils", "onDataReceived configAction", Integer.valueOf(iD));
            if (iD == 2) {
                e(i, eegVar);
                return;
            } else {
                a(-1, "");
                return;
            }
        }
        LogUtil.a("DeviceSecurityCertUtils", "onDataReceived() message not instanceof SampleConfig");
        a(-1, "");
    }

    private void a(int i, Object obj) {
        synchronized (this) {
            Iterator<IBaseResponseCallback> it = this.f32853c.iterator();
            while (it.hasNext()) {
                it.next().a(i, obj);
            }
            this.f32853c.clear();
        }
    }

    private void e(int i, eeg eegVar) {
        try {
            List<eew> listE = new eet().b(HEXUtils.a(eegVar.e())).e();
            if (listE != null && listE.size() != 0) {
                a(i, (Object) StringUtils.a(HEXUtils.a(listE.get(0).b())));
                return;
            }
            LogUtil.j("DeviceSecurityCertUtils", "getCertContent() tlvList is empty");
            a(-1, "");
        } catch (eeu e2) {
            LogUtil.e("DeviceSecurityCertUtils", "parseConfigData tlvException11: ", ExceptionUtils.c(e2));
            d(i, eegVar);
        } catch (NumberFormatException e3) {
            LogUtil.e("DeviceSecurityCertUtils", "parseConfigData numberFormatException: ", ExceptionUtils.c(e3));
            a(-1, "");
        }
    }

    private void d(int i, eeg eegVar) {
        try {
            String str = new String(eegVar.e(), StandardCharsets.UTF_8);
            LogUtil.a("DeviceSecurityCertUtils", "parseConfigData jsonStr: ", str);
            List list = (List) Arrays.stream(((b) GsonUtil.parseJson(str, b.class)).a()).map(new Function() { // from class: eeo
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return eer.e((Map) obj);
                }
            }).collect(Collectors.toList());
            LogUtil.a("DeviceSecurityCertUtils", "Base64 编码后的字符串数组: ", list.toString());
            a(i, list);
        } catch (Exception e2) {
            LogUtil.e("DeviceSecurityCertUtils", "parseConfigData Exception: ", ExceptionUtils.c(e2));
            a(-1, "");
        }
    }

    static /* synthetic */ String e(Map map) {
        byte[] bArr = new byte[map.size()];
        Iterator it = map.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = (byte) (((Byte) it.next()).byteValue() & 255);
            i++;
        }
        return Base64.getEncoder().encodeToString(bArr);
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("challenge")
        private int[] f32854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("id_type")
        private int[] f32855b;

        @SerializedName("cert_info")
        private Map<Object, Byte>[] d;

        public Map<Object, Byte>[] a() {
            return this.d;
        }
    }

    private boolean b(eec eecVar) {
        if (eecVar == null) {
            LogUtil.a("DeviceSecurityCertUtils", "sampleBase == null");
            return true;
        }
        if (eecVar.getCommandId() == 1 && "in.huawei.AutDevice".equals(eecVar.getSrcPkgName()) && "hw.unitedevice.certificateChain".equals(eecVar.getWearPkgName())) {
            return false;
        }
        LogUtil.j("DeviceSecurityCertUtils", "message: ", eecVar.toString());
        return true;
    }

    private String a(int i, int i2) {
        return HEXUtils.b(i) + HEXUtils.c(1) + HEXUtils.b(i2);
    }

    private String a(int i, String str) {
        String strC = HEXUtils.c(str);
        return HEXUtils.b(i) + HEXUtils.c(strC.length() / 2) + strC;
    }
}
