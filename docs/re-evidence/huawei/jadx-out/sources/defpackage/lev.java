package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthUserPermission;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.scope.ScopeManager;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lev {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Integer, String> f40003b = new HashMap();
    private static Map<Integer, String> d = new HashMap();
    private static volatile lev e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScopeManager f40004a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f40005c;

    static {
        f40003b.put(101002, "com.huawei.android.hms.health.profile.readonly");
        f40003b.put(101001, "com.huawei.android.hms.health.huaweiid.readonly");
        f40003b.put(101003, "com.huawei.android.hms.health.rtsport.readonly");
        f40003b.put(101202, "com.huawei.android.hms.health.device.data.readonly");
        f40003b.put(101201, "com.huawei.android.hms.health.device.readonly");
        f40003b.put(47201, "com.huawei.android.hms.health.health.bo.readonly");
        f40003b.put(47202, "com.huawei.android.hms.health.health.bo.readonly");
        f40003b.put(47203, "com.huawei.android.hms.health.health.bo.readonly");
        f40003b.put(47204, "com.huawei.android.hms.health.health.bo.readonly");
        f40003b.put(40002, "com.huawei.android.hms.health.sport.readonly");
        f40003b.put(40004, "com.huawei.android.hms.health.sport.readonly");
        f40003b.put(40003, "com.huawei.android.hms.health.sport.readonly");
        f40003b.put(47101, "com.huawei.android.hms.health.sport.readonly");
        f40003b.put(30005, "com.huawei.android.hms.health.motionpath.readonly");
        f40003b.put(30006, "com.huawei.android.hms.health.motionpath.readonly");
        f40003b.put(30007, "com.huawei.android.hms.health.motionpath.readonly");
        f40003b.put(10008, "com.huawei.android.hms.health.health.hr.readonly");
        f40003b.put(50001, "com.huawei.android.hms.health.health.rthr.readonly");
        f40003b.put(10001, "com.huawei.android.hms.health.health.bg.readonly");
        f40003b.put(10002, "com.huawei.android.hms.health.health.bp.readonly");
        f40003b.put(10006, "com.huawei.android.hms.health.health.wgt.readonly");
        f40003b.put(2104, "com.huawei.android.hms.health.health.temperature.readonly");
        f40003b.put(10007, "com.huawei.android.hms.health.health.slp.readonly");
        f40003b.put(44000, "com.huawei.android.hms.health.health.slp.readonly");
        f40003b.put(2034, "com.huawei.android.hms.health.health.ps.readonly");
        f40003b.put(31001, "com.huawei.android.hms.health.health.ecg.readonly");
        f40003b.put(31002, "com.huawei.android.hms.health.health.ecg.readonly");
        f40003b.put(31003, "com.huawei.android.hms.health.health.ecg.readonly");
        f40003b.put(31004, "com.huawei.android.hms.health.health.ecg.readonly");
        f40003b.put(31005, "com.huawei.android.hms.health.health.ecg.readonly");
        f40003b.put(31006, "com.huawei.android.hms.health.health.ecg.readonly");
        f40003b.put(31007, "com.huawei.android.hms.health.health.ecg.readonly");
        d.put(10001, "com.huawei.android.hms.health.health.bg");
        d.put(10002, "com.huawei.android.hms.health.health.bp");
        d.put(10006, "com.huawei.android.hms.health.health.wgt");
        d.put(101202, "com.huawei.android.hms.health.device.data");
        d.put(101203, "com.huawei.android.hms.health.device.basicctrl");
        d.put(101204, "com.huawei.android.hms.health.device.advancedctrl");
        d.put(31001, "com.huawei.android.hms.health.health.ecg");
    }

    private lev(Context context) {
        if (context == null) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "context is null.");
            return;
        }
        if (CommonUtil.cj()) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "isTestThirdDeviceVersion.");
            return;
        }
        this.f40005c = context;
        try {
            this.f40004a = new ScopeManager(context);
        } catch (NoClassDefFoundError e2) {
            ReleaseLogUtil.a("R_HiH_HiHwKitAsst", "HiHwKitAssistant constructor error: ", e2.getMessage());
        }
    }

    public static lev e(Context context) {
        if (e == null) {
            synchronized (lev.class) {
                if (e == null) {
                    e = new lev(context);
                }
            }
        }
        return e;
    }

    public void a() {
        ReleaseLogUtil.d("R_HiH_HiHwKitAsst", "init...");
        if (CommonUtil.cj()) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "isTestThirdDeviceVersion.");
            return;
        }
        if (!AuthorizationUtils.c(BaseApplication.b())) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "has not authorize.");
        } else if (this.f40004a == null) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "init:mScopeManager is null");
        } else {
            c(Binder.getCallingPid(), Binder.getCallingUid(), lkf.d(this.f40005c));
        }
    }

    public boolean e(String str) {
        if (CommonUtil.cj()) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "hasPermission:isTestThirdDeviceVersion.");
            return true;
        }
        if (this.f40004a == null) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "hasPermission:mScopeManager is null");
            return false;
        }
        int callingUid = Binder.getCallingUid();
        return this.f40004a.checkScopeAvailability(str, Binder.getCallingPid(), callingUid, "HiHealth_HiHwKitAssistant");
    }

    public boolean c(String str, int i, int i2) {
        if (CommonUtil.cj()) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "hasPermission:isTestThirdDeviceVersion.");
            return true;
        }
        ScopeManager scopeManager = this.f40004a;
        if (scopeManager == null) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "hasPermission:mScopeManager is null");
            return false;
        }
        return scopeManager.checkScopeAvailability(str, i2, i, "HiHealth_HiHwKitAssistant");
    }

    public int[] b(int[] iArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        Map<Integer, String> map = z ? f40003b : d;
        if (iArr != null && iArr.length > 0) {
            for (int i : iArr) {
                if (!e(map.get(Integer.valueOf(i)))) {
                    ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "getScopeTypes ", Integer.valueOf(i), " scope deny");
                } else {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public ArrayList<HiHealthUserPermission> a(ArrayList<HiHealthUserPermission> arrayList, boolean z, int i, int i2) {
        ArrayList<HiHealthUserPermission> arrayList2 = new ArrayList<>();
        Map<Integer, String> map = z ? f40003b : d;
        for (HiHealthUserPermission hiHealthUserPermission : arrayList) {
            if (c(map.get(Integer.valueOf(hiHealthUserPermission.getScopeId())), i, i2)) {
                arrayList2.add(hiHealthUserPermission);
            } else {
                LogUtil.j("R_HiH_HiHwKitAsst", Integer.valueOf(hiHealthUserPermission.getScopeId()), " scope deny");
            }
        }
        return arrayList2;
    }

    public void c(int i, int i2, String str) {
        String strC;
        String str2 = "";
        if (CommonUtil.cj()) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "initScopeManager,isTestThirdDeviceVersion.");
            return;
        }
        if (this.f40004a == null) {
            ReleaseLogUtil.e("R_HiH_HiHwKitAsst", "initScopeManager:mScopeManager is null");
            return;
        }
        String strB = HiScopeUtil.b(this.f40005c, str);
        this.f40004a.setAppId(i, i2, strB);
        try {
            if (lcm.e("initScopeManager", null)) {
                strC = GRSManager.c(this.f40005c).getNoCheckUrl("domainScopeOauth", "");
            } else {
                ReleaseLogUtil.d("R_HiH_HiHwKitAsst", "get scope property from local");
                strC = lei.c(this.f40005c, "domainScopeOauth");
            }
            str2 = strC;
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("R_HiH_HiHwKitAsst", "initScopeManager remote Exception: ", e2.getMessage());
        }
        String str3 = str2 + "?nsp_svc=nsp.scope.app.get&nsp_fmt=json&type=2&appid=" + strB;
        LogUtil.d("R_HiH_HiHwKitAsst", "appId = ", strB, " validateUrl = ", str3);
        this.f40004a.setScopeServerUrl(strB, str3);
    }

    public String c(int i) {
        if (f40003b.containsKey(Integer.valueOf(i))) {
            return f40003b.get(Integer.valueOf(i));
        }
        return "";
    }

    public String a(int i) {
        if (d.containsKey(Integer.valueOf(i))) {
            return d.get(Integer.valueOf(i));
        }
        return "";
    }
}
