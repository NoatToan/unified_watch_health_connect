package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.callback.ConnectStatusCallback;
import com.huawei.health.ecologydevice.callback.DataChangedCallback;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.device.open.HealthDevice;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class dxx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile dxx f32496a;
    private String d;
    private static final byte[] e = new byte[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f32497c = new HashSet();
    private int g = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f32498b = new BroadcastReceiver() { // from class: dxx.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras;
            if (!"com.huawei.bone.action.BATTERY_LEVEL".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i = extras.getInt("BATTERY_LEVEL");
            DeviceInfo deviceInfoE = dxx.this.e();
            if (deviceInfoE == null || deviceInfoE.getDeviceConnectState() != 2) {
                return;
            }
            LogUtil.a("PluginDevice_DeviceInfoUtils", "has connected device battery:" + i);
            dxx.this.g = i;
        }
    };

    private static int i(int i) {
        if (i == 0) {
            return 1;
        }
        if (1 == i) {
            return 0;
        }
        return i;
    }

    private dxx() {
        if (CommonUtil.ck()) {
            LogUtil.a("PluginDevice_DeviceInfoUtils", "DeviceInfoUtils init");
            n();
        }
    }

    public static dxx d() {
        if (f32496a == null) {
            synchronized (e) {
                if (f32496a == null) {
                    f32496a = new dxx();
                }
            }
        }
        return f32496a;
    }

    public void f(int i) {
        this.g = i;
    }

    public int a(int i) {
        edn deviceInfoUx = ecu.d().getDeviceInfoUx(i, "PluginDevice_DeviceInfoUtils");
        if (deviceInfoUx != null) {
            return deviceInfoUx.b();
        }
        return -1;
    }

    public List<DeviceInfo> g() {
        return ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "PluginDevice_DeviceInfoUtils");
    }

    public DeviceInfo e() {
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "PluginDevice_DeviceInfoUtils");
    }

    public List<DeviceInfo> b() {
        ArrayList arrayList = new ArrayList(16);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "PluginDevice_DeviceInfoUtils");
        if (deviceList != null) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (1 == deviceInfo.getDeviceActiveState()) {
                    arrayList.add(deviceInfo);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<dxy> h() {
        ArrayList<dxy> arrayList = new ArrayList<>(16);
        List<DeviceInfo> listG = g();
        if (listG != null) {
            for (DeviceInfo deviceInfo : listG) {
                if (deviceInfo != null) {
                    int iC = c(deviceInfo.getProductType());
                    int iB = b(deviceInfo.getProductType());
                    dxy dxyVar = new dxy();
                    dxyVar.c(deviceInfo, iC, iB);
                    dxyVar.e(deviceInfo.getProductType());
                    dxyVar.c(deviceInfo.getSecurityUuid() + "#ANDROID21");
                    dxyVar.a(deviceInfo.getLastConnectedTime());
                    if (deviceInfo.getDeviceName() == null && TextUtils.isEmpty(deviceInfo.getDeviceName())) {
                        if ((!TextUtils.isEmpty(deviceInfo.getDeviceName()) && TextUtils.equals(deviceInfo.getDeviceName(), "PORSCHE DESIGN")) || (!TextUtils.isEmpty(deviceInfo.getDeviceModel()) && TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN"))) {
                            dxyVar.a("PORSCHE DESIGN");
                        } else {
                            dxyVar.a(j(deviceInfo.getProductType()));
                            LogUtil.a("PluginDevice_DeviceInfoUtils", "device name is null ,device name :", j(deviceInfo.getProductType()));
                        }
                    } else if ((!TextUtils.isEmpty(deviceInfo.getDeviceName()) && TextUtils.equals(deviceInfo.getDeviceName(), "PORSCHE DESIGN")) || (!TextUtils.isEmpty(deviceInfo.getDeviceModel()) && TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN"))) {
                        dxyVar.a("PORSCHE DESIGN");
                    } else {
                        dxyVar.a(deviceInfo.getDeviceName());
                    }
                    arrayList.add(dxyVar);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<dxy> e(List<String> list) {
        ArrayList<dxy> arrayList = new ArrayList<>(16);
        List<DeviceInfo> listG = g();
        if (listG != null) {
            for (DeviceInfo deviceInfo : listG) {
                if (deviceInfo != null) {
                    int productType = deviceInfo.getProductType();
                    if (edh.d(productType) || edd.a().a(productType)) {
                        if (list == null || list.size() <= 0 || !list.contains(deviceInfo.getUuid())) {
                            int iC = c(productType);
                            int iB = b(productType);
                            dxy dxyVar = new dxy();
                            dxyVar.c(deviceInfo, iC, iB);
                            dxyVar.e(deviceInfo.getProductType());
                            d(deviceInfo, dxyVar);
                            arrayList.add(dxyVar);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private void d(DeviceInfo deviceInfo, dxy dxyVar) {
        if (deviceInfo.getDeviceName() == null && TextUtils.isEmpty(deviceInfo.getDeviceName())) {
            if ((!TextUtils.isEmpty(deviceInfo.getDeviceName()) && TextUtils.equals(deviceInfo.getDeviceName(), "PORSCHE DESIGN")) || (!TextUtils.isEmpty(deviceInfo.getDeviceModel()) && TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN"))) {
                dxyVar.a("PORSCHE DESIGN");
                return;
            }
            DeviceInfo deviceInfoE = e();
            if (deviceInfoE != null) {
                dxyVar.a(j(deviceInfoE.getProductType()));
                LogUtil.a("PluginDevice_DeviceInfoUtils", "device name is null ,device name :", j(deviceInfoE.getProductType()));
                return;
            }
            return;
        }
        if ((!TextUtils.isEmpty(deviceInfo.getDeviceName()) && TextUtils.equals(deviceInfo.getDeviceName(), "PORSCHE DESIGN")) || (!TextUtils.isEmpty(deviceInfo.getDeviceModel()) && TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN"))) {
            dxyVar.a("PORSCHE DESIGN");
        } else {
            dxyVar.a(deviceInfo.getDeviceName());
        }
    }

    public static int b(int i) {
        edn deviceInfoUx = ecu.d().getDeviceInfoUx(i, "PluginDevice_DeviceInfoUtils");
        if (deviceInfoUx != null) {
            return deviceInfoUx.y();
        }
        return 0;
    }

    private String j(int i) {
        edn deviceInfoUx = ecu.d().getDeviceInfoUx(i, "PluginDevice_DeviceInfoUtils");
        if (deviceInfoUx != null) {
            return deviceInfoUx.i();
        }
        return "";
    }

    public int c(int i) {
        edn deviceInfoUx = ecu.d().getDeviceInfoUx(i, "PluginDevice_DeviceInfoUtils");
        if (deviceInfoUx != null) {
            return deviceInfoUx.u();
        }
        return 0;
    }

    public boolean e(String str) {
        Iterator<DeviceInfo> it = b().iterator();
        while (it.hasNext()) {
            if (it.next().getDeviceIdentify().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public void j() {
        ((VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class)).resetBandUpdate("");
    }

    public boolean g(int i) {
        edn deviceInfoUx = ecu.d().getDeviceInfoUx(i, "PluginDevice_DeviceInfoUtils");
        if (deviceInfoUx == null) {
            return false;
        }
        LogUtil.a("PluginDevice_DeviceInfoUtils", "device type is existence");
        if ("".equals(deviceInfoUx.aa())) {
            return false;
        }
        LogUtil.a("PluginDevice_DeviceInfoUtils", "uuid is not null");
        return true;
    }

    public String d(int i) {
        edn deviceInfoUx = ecu.d().getDeviceInfoUx(i, "PluginDevice_DeviceInfoUtils");
        if (deviceInfoUx != null) {
            return deviceInfoUx.aa();
        }
        return "";
    }

    public boolean h(int i) {
        edn deviceInfoUx = ecu.d().getDeviceInfoUx(i, "PluginDevice_DeviceInfoUtils");
        if (deviceInfoUx != null) {
            return deviceInfoUx.r();
        }
        return false;
    }

    private void n() {
        LogUtil.a("PluginDevice_DeviceInfoUtils", "enter registerBattery");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.BATTERY_LEVEL");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f32498b, intentFilter, LocalBroadcast.f36595c, null);
    }

    public View e(int i) {
        String string;
        String str;
        String string2 = "";
        if (i == 7) {
            string = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_device_mgr_pair_note_press_restart4), 5);
        } else if (i == 8) {
            string = BaseApplication.getContext().getString(R.string.IDS_device_mgr_pair_note_press_restart5);
        } else if (i == 16) {
            string = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_device_mgr_pair_note_press_restart3), 5);
        } else {
            if (i != 75) {
                switch (i) {
                    case 18:
                    case 19:
                        string = BaseApplication.getContext().getString(R.string.IDS_device_mgr_pair_note_press_restart2);
                        break;
                    case 20:
                    case 21:
                        string = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_device_mgr_pair_note_press_restart1), 5);
                        break;
                    default:
                        str = "";
                        break;
                }
            } else {
                string2 = BaseApplication.getContext().getString(R.string.IDS_bolt_awaken_device);
                str = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_bolt_awaken_device_second), 3);
            }
            return c(string2, str, i);
        }
        string2 = string;
        str = "";
        return c(string2, str, i);
    }

    private View c(String str, String str2, int i) {
        LogUtil.a("PluginDevice_DeviceInfoUtils", "enter showAlertDialog");
        String string = BaseApplication.getContext().getString(R.string.IDS_device_mgr_pair_note_avivable_ways);
        View viewInflate = LayoutInflater.from(dxw.d()).inflate(R.layout.show_notconnect_dialog_view, (ViewGroup) null);
        ((HealthTextView) viewInflate.findViewById(R.id.dialog_tite)).setText(string);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.dialog_content);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.dialog_content1);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.dialog_content2);
        HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.dialog_content3);
        HealthTextView healthTextView5 = (HealthTextView) viewInflate.findViewById(R.id.dialog_content4);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.third_tip_layout);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.forth_tip_layout);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        String string2 = BaseApplication.getContext().getString(qrs.ah(dxw.d()) ? R.string.IDS_device_reopen_bt_pad : R.string.IDS_device_mgr_pair_note_open_bluetooth);
        String str3 = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_reconnect_phone_or_pad_des_info_new), 3);
        String str4 = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_nearby_permission_exception), new Object[0]);
        if (!CommonUtil.bg()) {
            linearLayout2.setVisibility(0);
            healthTextView5.setText(str4);
        }
        if (i == 80) {
            linearLayout.setVisibility(0);
            healthTextView.setText(string2);
            healthTextView2.setText(BaseApplication.getContext().getString(R.string.IDS_saga_pair_error_tip_first));
            healthTextView3.setText(BaseApplication.getContext().getString(R.string.IDS_saga_pair_error_tip_second));
            healthTextView4.setText(str3);
            return viewInflate;
        }
        if (StringUtils.g(str)) {
            healthTextView.setText(string2);
            healthTextView2.setText(str3);
            ((LinearLayout) viewInflate.findViewById(R.id.liner2)).setVisibility(8);
            return viewInflate;
        }
        if (StringUtils.g(str2)) {
            healthTextView.setText(string2);
            healthTextView2.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_device_mgr_pair_note_restart_device), str));
            healthTextView3.setText(str3);
            return viewInflate;
        }
        healthTextView.setText(str);
        healthTextView2.setText(string2);
        healthTextView3.setText(str2);
        return viewInflate;
    }

    public void i() {
        ecu.d().sendDeviceData(1, 33, null, null, "PluginDevice_DeviceInfoUtils");
    }

    public UniteDevice b(String str) {
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo = new com.huawei.devicesdk.entity.DeviceInfo();
        deviceInfo.setDeviceMac(str);
        return new UniteDevice().build(str, deviceInfo, new ExternalDeviceCapability());
    }

    public boolean f() {
        String str;
        boolean z = Boolean.parseBoolean((TextUtils.equals("578d0675-cece-4426-bf28-43ce31eb7b5d", this.d) || TextUtils.equals("f2da0f49-aefb-4713-87a2-9fb89b491dac", this.d)) ? KeyValDbManager.d(BaseApplication.getContext()).c("use_unite_device_service_key") : "");
        if (z) {
            str = "isSupportUdsByProductId() now is new mode";
        } else {
            str = "isSupportUdsByProductId() now is old mode";
        }
        LogUtil.a("PluginDevice_DeviceInfoUtils", str);
        return z;
    }

    public void j(String str) {
        this.d = str;
    }

    public UniteDevice e(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        UniteDevice uniteDevice = new UniteDevice();
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo = new com.huawei.devicesdk.entity.DeviceInfo();
        deviceInfo.setDeviceMac(str);
        deviceInfo.setDeviceBtType(i);
        return uniteDevice.build(str, deviceInfo, new ExternalDeviceCapability());
    }

    public void d(String str, String str2, String str3, boolean z) {
        UniteDevice uniteDeviceE = d().e(str, 2);
        if (uniteDeviceE != null) {
            emk.c().a(uniteDeviceE, str2, str3, z);
        } else {
            LogUtil.j("PluginDevice_DeviceInfoUtils", "setCharacteristicNotifyByUds uniteDevice is null");
        }
    }

    public void a(cmm cmmVar, String str, String str2, String str3, CharacterOperationType characterOperationType) {
        if (cmmVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.j("PluginDevice_DeviceInfoUtils", "data is null || serviceUuid == null || characterUuid == null || mac == null");
            return;
        }
        synchronized (e) {
            UniteDevice uniteDeviceE = d().e(str3, 2);
            if (uniteDeviceE != null) {
                emk.c().d(uniteDeviceE, emk.c().e(cmmVar, str, str2, characterOperationType));
                LogUtil.a("PluginDevice_DeviceInfoUtils", "setDateTime : data frames:", eeq.e(cmmVar.d()));
            } else {
                LogUtil.j("PluginDevice_DeviceInfoUtils", "uniteDevice is null");
            }
        }
    }

    public <T> void c(String str, T t) {
        LogUtil.a("PluginDevice_DeviceInfoUtils", "enter putUdsClassMap");
        if (t instanceof ConnectStatusCallback) {
            eff.b(str, (ConnectStatusCallback) t);
            LogUtil.a("PluginDevice_DeviceInfoUtils", "putUdsClassMap StatusChange size：", Integer.valueOf(eff.b()));
        }
        if (t instanceof DataChangedCallback) {
            efd.d(str, (DataChangedCallback) t);
            LogUtil.a("PluginDevice_DeviceInfoUtils", "putUdsClassMap MessageReceive size：", Integer.valueOf(efd.d()));
        }
    }

    public void a() {
        LogUtil.a("PluginDevice_DeviceInfoUtils", "clearUdsClassMap");
        efd.b();
        eff.a();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public static void b(String str, String str2, HiUserInfo hiUserInfo) throws Throwable {
        String strE;
        if (dxm.ag(str) || dxm.at(str)) {
            eby ebyVarE = ecf.e(str);
            MeasurableDevice measurableDeviceB = dmp.d().b(str2, false);
            if (ebyVarE == null && measurableDeviceB == null) {
                LogUtil.e("PluginDevice_DeviceInfoUtils", "wiFiDevice is null");
                eqw.b();
                return;
            } else if (ebyVarE != null) {
                strE = ebyVarE.e();
            } else {
                strE = "";
            }
        } else {
            strE = "";
        }
        HashMap map = new HashMap(16);
        map.put("id", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        map.put("uid", String.valueOf(0));
        map.put(CommonConstant.KEY_GENDER, String.valueOf(hiUserInfo.getGender() == 2 ? 1 : hiUserInfo.getGender()));
        map.put("age", String.valueOf(dor.a(hiUserInfo.getBirthday(), hiUserInfo.getAge())));
        map.put("height", String.valueOf(hiUserInfo.getHeight()));
        map.put("isDelete", String.valueOf(0));
        String strB = ean.b(strE, String.valueOf(0));
        if (strB != null && !TextUtils.isEmpty(strB)) {
            map.put("bodyRes", ean.a(strB));
        }
        if (hiUserInfo.getWeight() != 0.0f && !Float.isNaN(hiUserInfo.getWeight())) {
            map.put("currentWeight", String.valueOf(hiUserInfo.getWeight()));
        }
        if (dor.b(str2)) {
            map.put("month", String.valueOf(dor.e(hiUserInfo.getBirthday())));
        }
        ean.d(map, strE, ece.f32732a, BaseApplication.getContext());
        b(strE, str2);
    }

    private static void b(String str, String str2) {
        if (!Utils.k()) {
            List<dnj> allUser = MultiUsersManager.INSTANCE.getAllUser();
            for (int i = 1; i < allUser.size(); i++) {
                HashMap map = new HashMap(16);
                dnj dnjVar = allUser.get(i);
                map.put("id", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
                map.put("uid", dnjVar.i());
                map.put(CommonConstant.KEY_GENDER, String.valueOf((int) (dnjVar.d() == 2 ? (byte) 1 : dnjVar.d())));
                map.put("age", String.valueOf(dor.a(dnjVar.j(), dnjVar.c())));
                map.put("height", String.valueOf(dnjVar.e()));
                map.put("isDelete", String.valueOf(0));
                String strB = ean.b(str, dnjVar.i());
                if (strB != null && !TextUtils.isEmpty(strB)) {
                    map.put("bodyRes", ean.a(strB));
                }
                if (dnjVar.o() != 0.0f && !Float.isNaN(dnjVar.o())) {
                    map.put("currentWeight", String.valueOf(dnjVar.o()));
                }
                if (dor.b(str2)) {
                    map.put("month", String.valueOf(dor.e(dnjVar.j())));
                }
                ean.d(map, str, dnjVar.g(), BaseApplication.getContext());
            }
            return;
        }
        LogUtil.a("PluginDevice_DeviceInfoUtils", "Oversea is no child user");
    }

    public static void b(int i, HiUserInfo hiUserInfo) {
        LogUtil.d("PluginDevice_DeviceInfoUtils", "gender==", Integer.valueOf(i));
        if (hiUserInfo != null) {
            hiUserInfo.setGender(i);
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "hw_health_gender_value", Integer.toString(i(i)), new StorageParams(1));
        d(AnalyticsValue.HEALTH_MINE_PERSONAL_INFOR_2040006.value(), "3");
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        if (TextUtils.isEmpty(strI) || !strI.equals(MultiUsersManager.INSTANCE.getCurrentUser().i())) {
            return;
        }
        int i2 = i == 0 ? 0 : 1;
        LogUtil.d("PluginDevice_DeviceInfoUtils", "setUserGender reset user gender gender = ", Integer.valueOf(i2));
        MultiUsersManager.INSTANCE.getMainUser().e((byte) i2);
    }

    private static void d(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    public static boolean d(String str, boolean z) {
        LogUtil.a("PluginDevice_DeviceInfoUtils", "showConfirmUserInfo() enter");
        if (ecf.e(str) != null || z || dmg.a().isMiniScaleDevice(str) || dxm.ab(str)) {
            return false;
        }
        eqw.b();
        LogUtil.e("PluginDevice_DeviceInfoUtils", "showConfirmUserInfo wifi device is null");
        return true;
    }

    public static String c(String str, String str2) {
        if (drw.e().h(str)) {
            HealthDevice healthDeviceA = drw.e().a(str, str2);
            if (healthDeviceA != null) {
                LogUtil.d("PluginDevice_DeviceInfoUtils", "isBondedDevice: device = ", BTDeviceMgrUtil.c().e(healthDeviceA.getAddress()));
                return healthDeviceA.getAddress();
            }
            return "";
        }
        com.huawei.health.device.model.HealthDevice healthDeviceA2 = drw.e().a(str2);
        if (healthDeviceA2 != null) {
            LogUtil.d("PluginDevice_DeviceInfoUtils", "isBondedDevice: device = ", BTDeviceMgrUtil.c().e(healthDeviceA2.getAddress()));
            return healthDeviceA2.getAddress();
        }
        return "";
    }

    public static boolean e(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j("PluginDevice_DeviceInfoUtils", "isDualModelDevice bundle is null");
            return false;
        }
        String string = bundle.getString("devId");
        if (!TextUtils.isEmpty(string)) {
            return ean.i(string);
        }
        String string2 = bundle.getString("productId");
        if (TextUtils.isEmpty(string2)) {
            return false;
        }
        LogUtil.a("PluginDevice_DeviceInfoUtils", "isDualModelDevice productId: ", string2);
        return dxm.y(string2);
    }

    public static boolean c() {
        return Build.BRAND.toLowerCase(Locale.ENGLISH).contains("nubia");
    }

    public static void d(String str) {
        f32497c.add(str);
    }

    public static void a(String str) {
        f32497c.remove(str);
    }

    public static boolean c(String str) {
        return !f32497c.contains(str);
    }
}
