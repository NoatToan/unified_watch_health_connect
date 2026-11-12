package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Dialog> f32426c;
    private int d;
    private boolean e;
    private dvi f;
    private dti h;

    private dvr() {
        this.e = false;
        this.d = -1;
        this.f32426c = new WeakReference<>(null);
    }

    public static dvr a() {
        return b.d;
    }

    public void a(String str, String str2, dti dtiVar) {
        this.f32424a = str;
        this.f32425b = str2;
        this.h = dtiVar;
    }

    public void c(dvi dviVar) {
        this.f = dviVar;
    }

    public void c(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        if (qrs.r()) {
            LogUtil.j("SetUnitManager", "clickRequestDeviceShareItem click too fast.");
            return;
        }
        if (!j()) {
            LogUtil.a("SetUnitManager", "is not ble device");
            hagridDeviceManagerFragment.showSelectBindDeviceDialog();
        } else if (g()) {
            this.e = true;
            d();
        } else {
            qpx.e(BaseApplication.getContext(), R.string.IDS_plugin_device_weight_device_not_connect);
        }
    }

    private boolean j() {
        return dmp.d().b(this.f32424a, true) instanceof efx;
    }

    private void h() {
        Activity activity = BaseApplication.getActivity();
        if (activity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) activity).b(this.f32425b);
        }
    }

    private boolean g() {
        dti dtiVar = this.h;
        if (dtiVar != null) {
            return dtiVar.c();
        }
        return false;
    }

    private void d() {
        LogUtil.a("SetUnitManager", "getUnitFromController mUnitType=", Integer.valueOf(this.d));
        if (g()) {
            EventBus.a(new EventBus.d("get_weight_unit"));
            return;
        }
        if (this.d == -1) {
            this.d = 1;
        }
        this.f.sendEmptyMessage(4);
    }

    public void e(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        if (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.isDestory() || !hagridDeviceManagerFragment.isAdded()) {
            LogUtil.j("SetUnitManager", "processHandlerMgsGetWeightUnit fragment is destroy");
            return;
        }
        if (this.e && this.d != -1) {
            d(hagridDeviceManagerFragment);
        }
        this.e = false;
    }

    private void d(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        Dialog dialog = this.f32426c.get();
        if (dialog != null && dialog.isShowing()) {
            LogUtil.j("SetUnitManager", "showPickerDialog() dialog isShowing.");
            return;
        }
        Activity mainActivity = hagridDeviceManagerFragment.getMainActivity();
        if (mainActivity == null) {
            LogUtil.j("SetUnitManager", "settingUnitDialog, mainActivity is null");
            return;
        }
        LogUtil.a("SetUnitManager", "showGenderPickerDialog()");
        if (!(mainActivity.getSystemService("layout_inflater") instanceof LayoutInflater)) {
            LogUtil.j("SetUnitManager", "inflater not instanceof LayoutInflater");
            return;
        }
        View viewInflate = ((LayoutInflater) mainActivity.getSystemService("layout_inflater")).inflate(R.layout.hw_show_settings_weight_unit_view, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(mainActivity);
        builder.a(mainActivity.getResources().getString(R.string.IDS_hw_device_body_scale_show_unit)).d(viewInflate).c(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: dvx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("SetUnitManager", "settingUnitDialog NegativeButton");
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        if (!a(viewInflate)) {
            LogUtil.d("SetUnitManager", "showPickerDialog() dialog layout fail");
            this.f32426c = new WeakReference<>(null);
        } else {
            customViewDialogD.show();
            this.f32426c = new WeakReference<>(customViewDialogD);
        }
    }

    private boolean a(View view) {
        LogUtil.a("SetUnitManager", "initializeDialogLayout()");
        if (view == null) {
            return false;
        }
        final HealthRadioButton healthRadioButton = (HealthRadioButton) qsp.a(view, R.id.settings_weight_unit_imgview1);
        final HealthRadioButton healthRadioButton2 = (HealthRadioButton) qsp.a(view, R.id.settings_weight_unit_imgview2);
        final HealthRadioButton healthRadioButton3 = (HealthRadioButton) qsp.a(view, R.id.settings_weight_unit_imgview3);
        View viewA = qsp.a(view, R.id.settings_weight_unit_view_layout1);
        View viewA2 = qsp.a(view, R.id.settings_weight_unit_view_layout2);
        View viewA3 = qsp.a(view, R.id.settings_weight_unit_view_layout3);
        viewA.setOnClickListener(new View.OnClickListener() { // from class: dvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.b(healthRadioButton, healthRadioButton2, healthRadioButton3, view2);
            }
        });
        viewA2.setOnClickListener(new View.OnClickListener() { // from class: dvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f32432b.e(healthRadioButton, healthRadioButton2, healthRadioButton3, view2);
            }
        });
        viewA3.setOnClickListener(new View.OnClickListener() { // from class: dwa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.c(healthRadioButton, healthRadioButton2, healthRadioButton3, view2);
            }
        });
        d(view, healthRadioButton, healthRadioButton2, healthRadioButton3);
        return true;
    }

    /* synthetic */ void b(HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, HealthRadioButton healthRadioButton3, View view) {
        LogUtil.a("SetUnitManager", "set unit WEIGHT_UNIT_G");
        healthRadioButton.setChecked(true);
        healthRadioButton2.setChecked(false);
        healthRadioButton3.setChecked(false);
        if (this.f32426c.get() != null) {
            this.f32426c.get().dismiss();
        }
        e(3);
    }

    /* synthetic */ void e(HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, HealthRadioButton healthRadioButton3, View view) {
        LogUtil.a("SetUnitManager", "set unit WEIGHT_UNIT_KG");
        healthRadioButton.setChecked(false);
        healthRadioButton2.setChecked(true);
        healthRadioButton3.setChecked(false);
        if (this.f32426c.get() != null) {
            this.f32426c.get().dismiss();
        }
        e(1);
    }

    /* synthetic */ void c(HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, HealthRadioButton healthRadioButton3, View view) {
        LogUtil.a("SetUnitManager", "set unit WEIGHT_UNIT_LB");
        healthRadioButton.setChecked(false);
        healthRadioButton2.setChecked(false);
        healthRadioButton3.setChecked(true);
        if (this.f32426c.get() != null) {
            this.f32426c.get().dismiss();
        }
        e(2);
    }

    private void d(View view, HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, HealthRadioButton healthRadioButton3) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.settings_weight_unit_g_layout);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.settings_weight_unit_lb_layout);
        boolean zC = c(this.f32424a);
        LogUtil.a("SetUnitManager", "not supported weight unit : ", Boolean.valueOf(zC));
        if (zC) {
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(8);
            a(1, healthRadioButton, healthRadioButton2, healthRadioButton3);
            return;
        }
        if (UnitUtil.f() || Utils.o()) {
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(0);
        } else {
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(0);
        }
        a(this.d, healthRadioButton, healthRadioButton2, healthRadioButton3);
    }

    private boolean c(String str) {
        String strE = nio.e(str);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("weightUnit");
        stringBuffer.append(strE);
        return CommonUtil.a(eeq.c(KeyValDbManager.d(com.huawei.haf.application.BaseApplication.b()).c(stringBuffer.toString())), 2);
    }

    private void a(int i, HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, HealthRadioButton healthRadioButton3) {
        LogUtil.a("SetUnitManager", "refreshGenderImageView unitType:", Integer.valueOf(i));
        if (i == 1) {
            healthRadioButton.setChecked(false);
            healthRadioButton2.setChecked(true);
            healthRadioButton3.setChecked(false);
        } else if (i == 2) {
            healthRadioButton.setChecked(false);
            healthRadioButton2.setChecked(false);
            healthRadioButton3.setChecked(true);
        } else {
            healthRadioButton.setChecked(true);
            healthRadioButton2.setChecked(false);
            healthRadioButton3.setChecked(false);
        }
    }

    public void b(Bundle bundle) {
        int i = bundle.getInt("ret");
        LogUtil.a("SetUnitManager", "set weight value ", Integer.valueOf(i));
        if (i == 0) {
            d(bundle);
        }
    }

    private void d(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j("SetUnitManager", "illegal argument, processSetWeightUnitResult bundle is null");
            return;
        }
        int i = bundle.getInt("weightUnit");
        String strE = e();
        LogUtil.a("SetUnitManager", "processSetWeightUnitResult unitType:", Integer.valueOf(i));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), strE, String.valueOf(i), null);
        doq.e().t();
        if (this.f == null) {
            LogUtil.j("SetUnitManager", "EVEBUS_SET_WEIGHT_UNIT_RESULT onEvent myHandler is null.");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 14;
        messageObtain.arg1 = i;
        this.f.sendMessage(messageObtain);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j("SetUnitManager", "illegal argument, processGetWeightUnitResult bundle is null");
            return;
        }
        int i = bundle.getInt("weightUnit", 1);
        this.d = i;
        LogUtil.a("SetUnitManager", "get weight unit result unitType:", Integer.valueOf(i));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), e(), String.valueOf(i), null);
        doq.e().t();
        dvi dviVar = this.f;
        if (dviVar == null) {
            LogUtil.j("SetUnitManager", "EVEBUS_GET_WEIGHT_UNIT_RESULT onEvent myHandler is null.");
            return;
        }
        dviVar.sendEmptyMessage(4);
        Message messageObtain = Message.obtain();
        messageObtain.what = 14;
        messageObtain.arg1 = i;
        this.f.sendMessage(messageObtain);
    }

    private String e() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("weightUnit");
        if (!TextUtils.isEmpty(this.f32424a)) {
            stringBuffer.append(this.f32424a);
        }
        return stringBuffer.toString();
    }

    private void e(int i) {
        if (!j()) {
            LogUtil.a("SetUnitManager", "is not ble device");
            h();
        } else {
            if (g()) {
                this.d = i;
                Bundle bundle = new Bundle();
                bundle.putInt("weightUnit", i);
                EventBus.a(new EventBus.d("set_weight_unit", bundle));
                return;
            }
            qpx.a(BaseApplication.getContext(), R.string.IDS_plugin_device_weight_device_not_connect);
        }
    }

    public void c(eby ebyVar) {
        if (ebyVar == null) {
            LogUtil.j("R_Weight_SetUnitManager", "getUnit mWiFiDevice is null");
        } else {
            ean.e(ebyVar.e(), new ICloudOperationResult() { // from class: dvz
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.d.b((CloudCommonReponse) obj, str, z);
                }
            });
        }
    }

    /* synthetic */ void b(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        if (z && (cloudCommonReponse instanceof WifiDeviceServiceInfoRsp)) {
            b((WifiDeviceServiceInfoRsp) cloudCommonReponse);
        } else if (cloudCommonReponse != null) {
            LogUtil.j("SetUnitManager", "getWeightDeviceUnit fail", cloudCommonReponse.getResultCode());
        } else {
            LogUtil.j("R_Weight_SetUnitManager", "getWeightDeviceUnit cloudCommonResponse is null");
        }
    }

    private void b(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp) {
        List<DeviceServiceInfo> deviceServiceInfo = wifiDeviceServiceInfoRsp.getDeviceServiceInfo();
        if (deviceServiceInfo != null && deviceServiceInfo.size() > 0) {
            Iterator<DeviceServiceInfo> it = deviceServiceInfo.iterator();
            while (it.hasNext()) {
                Map<String, String> data = it.next().getData();
                if (data != null && data.containsKey("weightUnit")) {
                    b(data.get("weightUnit"));
                }
            }
            return;
        }
        LogUtil.j("R_Weight_SetUnitManager", "getUnitResult deviceServiceInfos is null");
    }

    private void b(String str) {
        if (String.valueOf(1).equals(str)) {
            this.d = 1;
        } else if (String.valueOf(3).equals(str)) {
            this.d = 3;
        } else if (String.valueOf(2).equals(str)) {
            this.d = 2;
        } else {
            LogUtil.j("SetUnitManager", "setUnitType unit is error", str);
        }
        LogUtil.a("SetUnitManager", "setUnitType mUnitType:", Integer.valueOf(this.d));
    }

    public int b() {
        int i = 0;
        try {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), e());
            LogUtil.a("SetUnitManager", "initUnitType weightUnit:", strE);
            i = !TextUtils.isEmpty(strE) ? Integer.parseInt(strE) : -1;
            this.d = i;
            return i;
        } catch (NumberFormatException unused) {
            LogUtil.e("SetUnitManager", "initUnitType, NumberFormatException");
            return i;
        }
    }

    public void c() {
        this.e = false;
    }

    static class b {
        private static final dvr d = new dvr();
    }
}
