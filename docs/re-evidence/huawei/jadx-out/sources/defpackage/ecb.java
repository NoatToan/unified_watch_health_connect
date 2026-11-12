package defpackage;

import android.net.wifi.ScanResult;
import android.text.TextUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwcloudmodel.model.unite.DeviceDetailInfo;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ecb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f32730a = new ArrayList<String>() { // from class: ecb.3
        {
            add("117K");
            add("1808");
            add("117V");
            add("007B");
            add("M00D");
            add("M00F");
        }
    };

    public static void d(Map<String, Object> map, ebu.e eVar) {
        if (map == null) {
            dyg.c(false, CommonUtil.TAG, "setJsonCoapData jsonMap is null.");
            return;
        }
        if (eVar == null) {
            dyg.c(false, CommonUtil.TAG, "setJsonCoapData info is null.");
            return;
        }
        if (map.containsKey("sn") && (map.get("sn") instanceof String)) {
            eVar.f((String) map.get("sn"));
        }
        if (map.containsKey("model") && (map.get("model") instanceof String)) {
            eVar.g((String) map.get("model"));
        }
        if (map.containsKey("devType") && (map.get("devType") instanceof String)) {
            eVar.d((String) map.get("devType"));
        }
        if (map.containsKey(ProfileRequestConstants.MANU) && (map.get(ProfileRequestConstants.MANU) instanceof String)) {
            eVar.j((String) map.get(ProfileRequestConstants.MANU));
        }
        if (map.containsKey("mac") && (map.get("mac") instanceof String)) {
            eVar.c((String) map.get("mac"));
        }
        if (map.containsKey(ProfileRequestConstants.PROT_TYPE)) {
            eVar.d(Integer.valueOf(qrs.a(map.get(ProfileRequestConstants.PROT_TYPE).toString())));
        }
        e(map, eVar);
    }

    public static void e(Map<String, Object> map, ebu.e eVar) {
        if (map.containsKey(ProfileRequestConstants.HIV) && (map.get(ProfileRequestConstants.HIV) instanceof String)) {
            eVar.a((String) map.get(ProfileRequestConstants.HIV));
        }
        if (map.containsKey(ProfileRequestConstants.FWV) && (map.get(ProfileRequestConstants.FWV) instanceof String)) {
            eVar.e((String) map.get(ProfileRequestConstants.FWV));
        }
        if (map.containsKey(ProfileRequestConstants.HWV) && (map.get(ProfileRequestConstants.HWV) instanceof String)) {
            eVar.b((String) map.get(ProfileRequestConstants.HWV));
        }
        if (map.containsKey(ProfileRequestConstants.SWV) && (map.get(ProfileRequestConstants.SWV) instanceof String)) {
            eVar.h((String) map.get(ProfileRequestConstants.SWV));
        }
        if (map.containsKey("prodId") && (map.get("prodId") instanceof String)) {
            eVar.i((String) map.get("prodId"));
        }
    }

    public static List<ScanResult> d(List<ScanResult> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                int i2 = 0;
                while (i2 < (list.size() - i) - 1) {
                    int i3 = i2 + 1;
                    if (list.get(i2).level < list.get(i3).level) {
                        ScanResult scanResult = list.get(i2);
                        list.set(i2, list.get(i3));
                        list.set(i3, scanResult);
                    }
                    i2 = i3;
                }
            }
        }
        return list;
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return (str.matches("^(0086)?[1][0-9]{10}$") || str.matches("^(0086)?[1][0-9]{2}(\\*){4}[0-9]{4}$")) ? str.substring(str.indexOf("0086") + 4, str.length()) : str;
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.a(false, CommonUtil.TAG, "isWiFiScale hilinkProid is null");
            return false;
        }
        if (f32730a.contains(str)) {
            return true;
        }
        dyg.a(false, CommonUtil.TAG, "isWiFiScale hilinkProid is other:", str);
        return false;
    }

    public static void a(DeviceDetailInfo deviceDetailInfo, String str) {
        if (deviceDetailInfo.getDevInfo() == null) {
            return;
        }
        String sn = deviceDetailInfo.getDevInfo().getSn();
        if (e(deviceDetailInfo.getDevInfo().getProdId()) && !TextUtils.isEmpty(sn) && sn.endsWith("#ANDROID21")) {
            ReleaseLogUtil.e("R_QrCode_CommonUtil", "removeScaleSnSuffix sn isEndsWith #ANDROID21, tag:", str);
            deviceDetailInfo.getDevInfo().setSn(sn.substring(0, sn.length() - 10));
        }
    }
}
