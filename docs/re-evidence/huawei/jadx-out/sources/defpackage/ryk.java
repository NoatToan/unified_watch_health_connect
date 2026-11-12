package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.devicearkui.ArkuiDeviceActivity;
import com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceTipViewModel;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ryk extends DeviceViewDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<Integer, View> f47853b;
    private final EventBus.ICallback f;
    private DeviceInfo g;
    private final DeviceTipViewModel h;
    private LinearLayout i;
    private final BroadcastReceiver j;
    private static final Integer d = 0;
    private static final Integer e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Integer f47851c = 2;

    public ryk(ComponentActivity componentActivity) {
        super(componentActivity);
        this.f47853b = new ConcurrentHashMap<>();
        this.f47852a = false;
        this.f = new EventBus.ICallback() { // from class: ryk.1
            @Override // com.huawei.health.device.util.EventBus.ICallback
            public void onEvent(EventBus.d dVar) {
                if (dVar == null) {
                    LogUtil.j("DeviceTipDelegate", "event is null");
                    return;
                }
                if (!"sign_account_hms_login_state_action".equals(dVar.e())) {
                    LogUtil.j("DeviceTipDelegate", "mEventCallback other action");
                    return;
                }
                Bundle bundleB = dVar.b();
                if (bundleB == null) {
                    LogUtil.j("DeviceTipDelegate", "bundle is null");
                    return;
                }
                String string = bundleB.getString("sign_account_hms_login_state_key");
                LogUtil.a("DeviceTipDelegate", "mEventCallback state:", string);
                if (string == null) {
                    LogUtil.j("DeviceTipDelegate", "state is null");
                    return;
                }
                if (!"0".equals(string)) {
                    LogUtil.j("DeviceTipDelegate", "Non-success status");
                    return;
                }
                Activity activityJ = BaseApplication.j();
                if (ryk.this.g == null || activityJ == null || activityJ != ryk.this.activity) {
                    LogUtil.j("DeviceTipDelegate", "mEventCallback activity not equal");
                    return;
                }
                LogUtil.a("DeviceTipDelegate", "mEventCallback queryBacklogEvents");
                ryk rykVar = ryk.this;
                rykVar.d(rykVar.g);
                ryk.this.g();
            }
        };
        this.j = new BroadcastReceiver() { // from class: ryk.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.j("DeviceTipDelegate", "intent is null");
                    return;
                }
                if (!"action_ota_check_new_version_state".equals(intent.getAction()) || ryk.this.g == null) {
                    LogUtil.j("DeviceTipDelegate", "mNonLocalBroadcastReceiver()  intent:", intent.getAction());
                    return;
                }
                LogUtil.a("DeviceTipDelegate", "ACTION_OTA_CHECK_NEW_VERSION_STATE");
                if (HwVersionManager.b(context).o(ryk.this.g.getDeviceIdentify())) {
                    LogUtil.a("DeviceTipDelegate", "mNonLocalBroadcastReceiver()  queryBacklogEvents");
                    ryk rykVar = ryk.this;
                    rykVar.d(rykVar.g);
                }
                ryk.this.f();
            }
        };
        this.h = new DeviceTipViewModel();
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.custom_list_item_device_setting, viewGroup, false);
        this.i = (LinearLayout) viewInflate.findViewById(R.id.tab_setting_benefit_layout);
        return viewInflate;
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public void setUserVisibleHint(boolean z) {
        if (z) {
            lss.a(this.g, new Consumer() { // from class: rym
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.d.b((DeviceInfo) obj);
                }
            });
        }
    }

    /* synthetic */ void b(DeviceInfo deviceInfo) {
        if (deviceInfo instanceof CloudDeviceInfo) {
            return;
        }
        LogUtil.a("DeviceTipDelegate", "setUserVisibleHint updateDeviceData.");
        c(deviceInfo);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate
    public void updateDevice(DeviceInfo deviceInfo) {
        LogUtil.a("DeviceTipDelegate", "updateDevice refreshView.");
        if (deviceInfo == null || (deviceInfo instanceof CloudDeviceInfo)) {
            this.g = deviceInfo;
            LogUtil.a("DeviceTipDelegate", "mTabSettingBenefitLayout device is CloudDeviceInfo   set view GONE.");
            b();
            return;
        }
        if (!mig.d(this.g, deviceInfo)) {
            LogUtil.a("DeviceTipDelegate", "updateDevice switch device, removeAllView");
            b();
            d();
        }
        if (!mig.d(this.g, deviceInfo) || a(this.g, deviceInfo)) {
            LogUtil.a("DeviceTipDelegate", "mTabSettingBenefitLayout other device set view GONE. updateDeviceData");
            c(deviceInfo);
        }
        a(deviceInfo);
        this.g = deviceInfo;
    }

    private boolean a(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
        return mig.d(deviceInfo, deviceInfo2) && !Objects.equals(Integer.valueOf(deviceInfo.getDeviceConnectState()), Integer.valueOf(deviceInfo2.getDeviceConnectState())) && deviceInfo2.getDeviceConnectState() == 2;
    }

    private void b() {
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.f47853b.clear();
            this.i.setVisibility(8);
            return;
        }
        LogUtil.j("DeviceTipDelegate", "mTabSettingBenefitLayout is null");
    }

    private void c(DeviceInfo deviceInfo) {
        if (!eey.d(deviceInfo, 112) || c()) {
            d(deviceInfo);
        } else {
            ReleaseLogUtil.a("DEVMGR_DeviceTipDelegate", "updateDeviceData not topActivity");
        }
        e(deviceInfo);
    }

    public boolean c() {
        return Objects.equals(BaseApplication.j(), getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.a("DeviceTipDelegate", "queryBacklogEvents deviceInfo is null ");
        } else if (!(this.activity instanceof ArkuiDeviceActivity)) {
            LogUtil.a("DeviceTipDelegate", "activity activity not ArkuiDeviceActivity ");
            this.h.e(deviceInfo, new BaseResponseCallback() { // from class: ryp
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f47864b.d(deviceInfo, i, (JSONObject) obj);
                }
            });
        } else {
            LogUtil.a("DeviceTipDelegate", "updateDeviceData activity is ArkuiDeviceActivity ");
        }
    }

    /* synthetic */ void d(DeviceInfo deviceInfo, int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            LogUtil.a("DeviceTipDelegate", "refreshView queryBacklogEvents=", jSONObject.toString());
            c(jSONObject.optString("isWatch"), jSONObject.optInt("notFinishBacklogNum"), jSONObject.optInt("notViewedBacklogNum"), jSONObject.optString("firstBacklogTitle"), deviceInfo);
        }
    }

    private void e(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.a("DeviceTipDelegate", "queryBenefitData deviceInfo is null ");
        } else {
            this.h.a(deviceInfo, new DeviceTipViewModel.IBenefitDataCallback() { // from class: ryk.5
                @Override // com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceTipViewModel.IBenefitDataCallback
                public void onResponse(int i, JSONObject jSONObject, List<BaseDeviceBenefitInfo> list, rvl rvlVar, List<DeviceBenefitInfo> list2) {
                    if (jSONObject != null) {
                        LogUtil.a("DeviceTipDelegate", "refreshView queryBenefitData=", jSONObject.toString());
                        ryk.this.c(deviceInfo, jSONObject, list, list2);
                    }
                }
            });
        }
    }

    private void c(final String str, final int i, final int i2, final String str2, final DeviceInfo deviceInfo) {
        LogUtil.a("DeviceTipDelegate", "enter updateTodoItemView notFinishBacklogNum:", Integer.valueOf(i));
        this.activity.runOnUiThread(new Runnable() { // from class: ryq
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(deviceInfo, i, i2, str, str2);
            }
        });
    }

    /* synthetic */ void a(DeviceInfo deviceInfo, int i, int i2, String str, String str2) {
        if (!mig.d(this.g, deviceInfo)) {
            LogUtil.a("DeviceTipDelegate", "queryBacklogEvents not theSameDevice ");
            return;
        }
        if (i > 0) {
            View viewE = e(d);
            if (viewE == null) {
                LogUtil.a("DeviceTipDelegate", "updateTodoItemView todoView is null");
                return;
            }
            ImageView imageView = (ImageView) viewE.findViewById(R.id.icon_iv);
            HealthTextView healthTextView = (HealthTextView) viewE.findViewById(R.id.txt_count_new);
            if (healthTextView == null) {
                LogUtil.j("DeviceTipDelegate", "updateTodoItemView count == null");
                qsl.b("updateTodoItemView count == null", viewE, R.id.txt_count_new);
                return;
            }
            LogUtil.a("DeviceTipDelegate", "queryBacklogEvents refresh todo view ");
            if (i2 != 0) {
                healthTextView.setVisibility(0);
                a(i2, healthTextView);
                healthTextView.setText(String.valueOf(i2));
                healthTextView.setGravity(17);
            } else {
                healthTextView.setVisibility(4);
            }
            String strF = qre.f(R.string.IDS_device_item_band_setting);
            if ("true".equals(str)) {
                strF = qre.f(R.string.IDS_device_item_watch_setting);
            }
            imageView.setImageDrawable(qre.c(R.drawable.device_setting));
            HealthTextView healthTextView2 = (HealthTextView) viewE.findViewById(R.id.device_item_title);
            if (healthTextView2 != null) {
                healthTextView2.setMaxLines(3);
                healthTextView2.setEllipsize(TextUtils.TruncateAt.END);
                if (TextUtils.isEmpty(str2)) {
                    str2 = strF;
                }
                healthTextView2.setText(str2);
            }
            c(viewE, deviceInfo, str);
            return;
        }
        a(d);
    }

    private void a(int i, HealthTextView healthTextView) {
        LogUtil.a("DeviceTipDelegate", "Enter adjustTextBg notViewedBacklogNum: ", Integer.valueOf(i));
        if (i >= 10) {
            healthTextView.setBackgroundResource(R.drawable.messages_red_point_bg_rectangle);
        } else {
            healthTextView.setBackgroundResource(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getConfiguration().fontScale >= 1.15f ? R.drawable.messages_todo_red_point_bg_circle_three_fold_fonts : R.drawable.messages_todo_red_point_bg_circle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final DeviceInfo deviceInfo, final JSONObject jSONObject, final List<BaseDeviceBenefitInfo> list, final List<DeviceBenefitInfo> list2) {
        this.activity.runOnUiThread(new Runnable() { // from class: ryl
            @Override // java.lang.Runnable
            public final void run() {
                this.f47857b.e(deviceInfo, jSONObject, list, list2);
            }
        });
    }

    /* synthetic */ void e(DeviceInfo deviceInfo, final JSONObject jSONObject, final List list, final List list2) {
        if (!mig.d(this.g, deviceInfo)) {
            LogUtil.a("DeviceTipDelegate", "queryBenefitData not theSameDevice ");
            return;
        }
        int iOptInt = jSONObject.optInt("countNumber");
        String strOptString = jSONObject.optString("description");
        if (iOptInt > 0) {
            View viewE = e(f47851c);
            if (viewE == null) {
                LogUtil.a("DeviceTipDelegate", "updateBenefitItemView benefitView is null");
                return;
            }
            ImageView imageView = (ImageView) viewE.findViewById(R.id.icon_iv);
            HealthTextView healthTextView = (HealthTextView) viewE.findViewById(R.id.device_item_title);
            HealthTextView healthTextView2 = (HealthTextView) viewE.findViewById(R.id.txt_count_new);
            if (healthTextView2 == null) {
                LogUtil.j("DeviceTipDelegate", "updateBenefitItemView count == null");
                qsl.b("updateBenefitItemView count == null", viewE, R.id.txt_count_new);
                return;
            }
            healthTextView2.setVisibility(8);
            imageView.setImageDrawable(qre.c(R.drawable.device_benefits));
            healthTextView.setText(strOptString);
            LogUtil.a("DeviceTipDelegate", "queryBacklogEvents refresh Benefit view ");
            viewE.setOnClickListener(new View.OnClickListener() { // from class: ryo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(jSONObject, list, list2, view);
                }
            });
            return;
        }
        a(f47851c);
    }

    /* synthetic */ void a(JSONObject jSONObject, List list, List list2, View view) {
        c(jSONObject, (List<BaseDeviceBenefitInfo>) list, (List<DeviceBenefitInfo>) list2);
    }

    private void c(JSONObject jSONObject, List<BaseDeviceBenefitInfo> list, List<DeviceBenefitInfo> list2) {
        if (LoginInit.checkBaseServiceModel()) {
            LogUtil.j("DeviceTipDelegate", "onClick checkBaseServiceModel");
            return;
        }
        if (!njy.e(list) && (list.get(0) instanceof DeviceInboxInfo)) {
            irz.e(getActivity(), list.get(0), 5, list2);
            return;
        }
        if (!njy.e(list) && (list.get(0) instanceof DevicePerfPurchaseInfo)) {
            irz.e(getActivity(), list.get(0), 5, (List<DeviceBenefitInfo>) null);
            return;
        }
        DeviceTipViewModel deviceTipViewModel = this.h;
        if (deviceTipViewModel != null) {
            deviceTipViewModel.a(jSONObject);
        } else {
            LogUtil.a("DeviceTipDelegate", "click benefitView url is empty");
        }
    }

    private View e(Integer num) {
        if (this.f47853b.containsKey(num)) {
            return this.f47853b.get(num);
        }
        View viewInflate = LayoutInflater.from(this.activity).inflate(R.layout.device_setting_item_layout, (ViewGroup) null);
        c(viewInflate, num);
        return viewInflate;
    }

    private void c(View view, Integer num) {
        LogUtil.a("DeviceTipDelegate", "enter addViewToTipDelegate viewKey:", num);
        this.f47853b.put(num, view);
        int childCount = this.i.getChildCount();
        LogUtil.a("DeviceTipDelegate", "addViewToTipDelegate childCount:", Integer.valueOf(childCount));
        if (childCount == 0) {
            this.i.addView(view, 0);
        } else {
            View viewE = e();
            if (num.equals(d)) {
                this.i.addView(view, num.intValue());
                this.i.addView(viewE, 1);
            } else {
                this.i.addView(viewE);
                this.i.addView(view);
            }
        }
        if (this.i.getVisibility() != 0) {
            this.i.setVisibility(0);
            LogUtil.a("DeviceTipDelegate", "mTabSettingBenefitLayout setVisibility VISIBLE");
        }
    }

    private void a(Integer num) {
        View viewRemove = this.f47853b.remove(num);
        if (viewRemove != null) {
            this.i.removeView(viewRemove);
        }
        View viewRemove2 = this.f47853b.remove(e);
        if (viewRemove2 != null) {
            this.i.removeView(viewRemove2);
        }
        if (this.f47853b.isEmpty()) {
            LogUtil.a("DeviceTipDelegate", "removeViewFormBenefitLayout mTabSettingBenefitLayout View.GONE");
            this.i.setVisibility(8);
        }
    }

    private View e() {
        ConcurrentHashMap<Integer, View> concurrentHashMap = this.f47853b;
        Integer num = e;
        if (concurrentHashMap.containsKey(num)) {
            return this.f47853b.get(num);
        }
        View viewInflate = LayoutInflater.from(this.activity).inflate(R.layout.device_divider_layout, (ViewGroup) null);
        this.f47853b.put(num, viewInflate);
        return viewInflate;
    }

    private void c(View view, final DeviceInfo deviceInfo, final String str) {
        view.setOnClickListener(new View.OnClickListener() { // from class: ryj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47849b.c(deviceInfo, str, view2);
            }
        });
    }

    /* synthetic */ void c(DeviceInfo deviceInfo, String str, View view) {
        if (LoginInit.checkBaseServiceModel()) {
            LogUtil.j("DeviceTipDelegate", "onClick checkBaseServiceModel");
            return;
        }
        DeviceInfo deviceInfoB = lut.a().b(deviceInfo.getDeviceIdentify());
        if (deviceInfoB != null) {
            deviceInfo = deviceInfoB;
        }
        this.h.a(deviceInfo, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("DeviceTipDelegate", "ACCOUNT LOGIN_STATE subscribe");
        EventBus.b(this.f, 1, "sign_account_hms_login_state_action");
    }

    private void a(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("DeviceTipDelegate", "addAccountSync deviceInfo is null");
            g();
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportSyncAccount()) {
            LogUtil.j("DeviceTipDelegate", "addAccountSync capability is null");
            g();
        } else {
            LogUtil.a("DeviceTipDelegate", "enter checkAccountSync");
            final WeakReference weakReference = new WeakReference(this.activity);
            ThreadPoolManager.c().a("DeviceTipDelegate", new Runnable() { // from class: ryn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47860c.c(deviceInfo, weakReference);
                }
            });
        }
    }

    /* synthetic */ void c(DeviceInfo deviceInfo, WeakReference weakReference) {
        try {
            boolean zA = tpe.b().a(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), deviceInfo.getDeviceIdentify());
            LogUtil.a("DeviceTipDelegate", "isShowSyncAccount:", Boolean.valueOf(zA));
            Activity activity = (Activity) weakReference.get();
            if (!zA || activity == null || activity.isDestroyed()) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: ryr
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            });
        } catch (Exception e2) {
            LogUtil.e("DeviceTipDelegate", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("DeviceTipDelegate", "ACCOUNT LOGIN_STATE unSubscribe");
        EventBus.a(this.f, "sign_account_hms_login_state_action");
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public void onDestroy() {
        g();
        f();
        super.onDestroy();
    }

    private void d() {
        LogUtil.a("DeviceTipDelegate", "enter registerNonLocalBroadcastReceiver");
        if (this.f47852a) {
            LogUtil.j("DeviceTipDelegate", "registerNonLocalBroadcastReceiver has register");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_ota_check_new_version_state");
        BroadcastManagerUtil.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), this.j, intentFilter, LocalBroadcast.f36595c, null);
        this.f47852a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!this.f47852a) {
            LogUtil.j("DeviceTipDelegate", "unRegisterNonLocalBroadcastReceiver not register");
            return;
        }
        this.f47852a = false;
        try {
            com.huawei.hwcommonmodel.application.BaseApplication.getContext().unregisterReceiver(this.j);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("DeviceTipDelegate", "unRegisterNonLocalBroadcastReceiver IllegalArgumentException");
        }
    }
}
