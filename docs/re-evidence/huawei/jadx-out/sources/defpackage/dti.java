package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.media3.common.C;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.BaseInteractor;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dti;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public class dti extends BaseInteractor implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static dti f32354c;
    private static c d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ContentValues f32355a;
    private HealthTextView aa;
    private ImageView ab;
    private String ac;
    private Dialog ad;
    private int ae;
    private CustomViewDialog af;
    private CustomTextAlertDialog ag;
    private IBaseResponseCallback ah;
    private d ai;
    private HealthTextView aj;
    private HealthTextView ak;
    private HealthTextView al;
    private HealthTextView am;
    private volatile int an;
    private List<Integer> ao;
    private HealthTextView ap;
    private HealthTextView aq;
    private LinearLayout ar;
    private String as;
    private AtomicReference<BaseResponseCallback<byte[]>> aw;
    private int ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EventBus.ICallback f32356b;
    private Runnable e;
    private e f;
    private boolean g;
    private HealthTextView h;
    private boolean i;
    private int j;
    private HealthTextView k;
    private LinearLayout l;
    private HealthTextView m;
    private HealthTextView n;
    private Timer o;
    private HealthTextView p;
    private dvi q;
    private String r;
    private LinearLayout s;
    private Timer t;
    private Handler u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private Activity z;

    /* synthetic */ void c(final int i, final Object obj) {
        Activity activity = this.z;
        if (activity == null) {
            LogUtil.e("PluginDevice_WeightInteractor", "queryData get main activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: dte
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(i, obj);
                }
            });
        }
    }

    /* synthetic */ void d(int i, Object obj) {
        if (i != 0 || !(obj instanceof HiHealthData)) {
            LogUtil.j("PluginDevice_WeightInteractor", "queryData HiHealthData onResponse can not refresh");
            return;
        }
        Activity activity = this.z;
        if (!(activity instanceof DeviceMainActivity)) {
            LogUtil.e("PluginDevice_WeightInteractor", "mMainActivity is not instanceof DeviceMainActivity");
        } else if (((DeviceMainActivity) activity).f()) {
            e((HiHealthData) obj, this.ak, this.al, this.aj);
        } else {
            e((HiHealthData) obj);
        }
    }

    @Deprecated
    private dti(Activity activity, String str, String str2) {
        this(str, str2);
        this.z = activity;
    }

    private dti(String str, String str2) {
        this.y = false;
        this.t = null;
        this.o = null;
        this.j = Integer.MIN_VALUE;
        this.w = false;
        this.v = false;
        this.ae = 0;
        this.x = false;
        this.e = new Runnable() { // from class: dti.3
            @Override // java.lang.Runnable
            public void run() {
                dti.this.g = false;
                if (dti.this.ax == 3) {
                    dti dtiVar = dti.this;
                    dtiVar.a(dtiVar.f32355a, dti.this.ax);
                }
            }
        };
        this.aw = new AtomicReference<>();
        this.ah = new IBaseResponseCallback() { // from class: dtq
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f32370b.c(i, obj);
            }
        };
        this.f32356b = new AnonymousClass9();
        this.ac = str;
        this.as = str2;
        ContentValues contentValuesJ = dmp.d().j(str2);
        this.f32355a = contentValuesJ;
        if (contentValuesJ != null) {
            this.r = contentValuesJ.getAsString("sn");
        }
    }

    public static dti d(String str, String str2) {
        dti dtiVar;
        synchronized (dti.class) {
            if (TextUtils.isEmpty(str2)) {
                LogUtil.j("PluginDevice_WeightInteractor", "getInstance uniqueId is null");
            }
            dti dtiVar2 = f32354c;
            if (dtiVar2 != null && !TextUtils.equals(str2, dtiVar2.as)) {
                f32354c.onDestroy();
                f32354c = new dti(str, str2);
                d = new c();
            }
            if (f32354c == null) {
                f32354c = new dti(str, str2);
            }
            if (d == null) {
                d = new c();
            }
            f32354c.t();
            f32354c.e(str);
            dtiVar = f32354c;
        }
        return dtiVar;
    }

    @Deprecated
    public static dti d(Activity activity, String str, String str2) {
        dti dtiVar;
        synchronized (dti.class) {
            if (TextUtils.isEmpty(str2)) {
                LogUtil.j("PluginDevice_WeightInteractor", "getInstance uniqueId is null");
            }
            dti dtiVar2 = f32354c;
            if (dtiVar2 != null && !TextUtils.equals(str2, dtiVar2.as)) {
                f32354c.onDestroy();
                f32354c = new dti(activity, str, str2);
                d = new c();
            }
            if (f32354c == null) {
                f32354c = new dti(activity, str, str2);
            }
            if (d == null) {
                d = new c();
            }
            f32354c.a(activity);
            f32354c.t();
            f32354c.e(str);
            f32354c.g();
            dtiVar = f32354c;
        }
        return dtiVar;
    }

    @Deprecated
    public static dti c(Activity activity, String str) {
        dti dtiVarD;
        synchronized (dti.class) {
            dtiVarD = d(activity, str, c(str));
        }
        return dtiVarD;
    }

    public void a(Activity activity) {
        this.z = activity;
    }

    public void a(dvi dviVar) {
        this.q = dviVar;
    }

    private void t() {
        this.ae = 0;
    }

    private void e(String str) {
        this.ac = str;
    }

    public void c(Activity activity, View view) {
        if (activity == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "initView mainActivity is null");
            return;
        }
        this.z = activity;
        g();
        this.p = (HealthTextView) qsp.a(view, R.id.weight_device_connect_status_tv);
        this.am = (HealthTextView) qsp.a(view, R.id.weight_start_measure_tv);
        this.n = (HealthTextView) qsp.a(view, R.id.connect_status_prompt_message);
        HealthTextView healthTextView = this.p;
        if (healthTextView == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "mConnectStatusTextView is null please check the rootView");
        } else {
            healthTextView.setText(this.z.getString(R.string.IDS_myfitnesspal_logout));
        }
        a(view);
        a(0.0d, this.aq);
        p();
    }

    public void d(Activity activity, View view) {
        if (activity == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "initWifiView mainActivity is null");
            return;
        }
        this.z = activity;
        g();
        a(view);
        p();
    }

    private void a(View view) {
        this.ar = (LinearLayout) qsp.a(view, R.id.weight_value_layout);
        this.ap = (HealthTextView) qsp.a(view, R.id.weight_value);
        this.aq = (HealthTextView) qsp.a(view, R.id.weight_unit);
        this.h = (HealthTextView) qsp.a(view, R.id.bmi_value);
        this.l = (LinearLayout) qsp.a(view, R.id.body_fat_rate_layout);
        this.m = (HealthTextView) qsp.a(view, R.id.body_fat_rate_value);
        this.k = (HealthTextView) qsp.a(view, R.id.body_fat_rate_value_unit);
        LinearLayout linearLayout = (LinearLayout) qsp.a(view, R.id.scale_device_go_details);
        this.s = linearLayout;
        linearLayout.setOnClickListener(this);
        this.aa = (HealthTextView) qsp.a(view, R.id.scale_device_last_time);
        this.ab = (ImageView) qsp.a(view, R.id.icon);
        this.ak = (HealthTextView) qsp.a(view, R.id.smart_life_measure_value);
        this.al = (HealthTextView) qsp.a(view, R.id.smart_life_measure_time);
        this.aj = (HealthTextView) qsp.a(view, R.id.smart_life_measure_unit);
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PluginDevice_WeightInteractor", "getDeviceUniqueId productId is null");
            return "";
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(str);
        if (measurableDeviceB == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "measurebleDevice is null, productId:", dyg.b(str));
            return "";
        }
        return measurableDeviceB.getUniqueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor queryData to enter");
        e(this.ah);
    }

    public void d() {
        if (this.u == null) {
            this.u = new h(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.an == 1) {
            LogUtil.j("PluginDevice_WeightInteractor", "connectFail mStatus is connecting");
            return;
        }
        LogUtil.j("PluginDevice_WeightInteractor", "HealthDataImporter Fail to connect, callback is null:", Boolean.valueOf(d == null));
        this.v = false;
        x();
        s();
        int i = this.ae;
        if (i < 100 && d != null) {
            LogUtil.a("PluginDevice_WeightInteractor", "onResume startTimer, ", Integer.valueOf(i));
            f();
        } else {
            e();
            onDestroy();
        }
    }

    private void x() {
        a(this.f32355a, 3);
        Activity activity = this.z;
        if (activity != null) {
            HealthTextView healthTextView = this.p;
            if (healthTextView != null) {
                healthTextView.setText(activity.getString(R.string.IDS_myfitnesspal_logout));
            }
            HealthTextView healthTextView2 = this.n;
            if (healthTextView2 != null) {
                healthTextView2.setVisibility(0);
            }
        }
    }

    private void r() {
        a(this.f32355a, 5);
        Activity activity = this.z;
        if (activity != null) {
            HealthTextView healthTextView = this.p;
            if (healthTextView != null) {
                healthTextView.setText(activity.getString(R.string.IDS_user_profile_health_show_unparied));
            }
            HealthTextView healthTextView2 = this.n;
            if (healthTextView2 != null) {
                healthTextView2.setVisibility(8);
            }
            HealthTextView healthTextView3 = this.am;
            if (healthTextView3 != null) {
                healthTextView3.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor connected");
        a(this.f32355a, 2);
        Activity activity = this.z;
        if (activity != null) {
            HealthTextView healthTextView = this.p;
            if (healthTextView != null) {
                healthTextView.setText(activity.getString(R.string.IDS_myfitnesspal_login));
            }
            HealthTextView healthTextView2 = this.n;
            if (healthTextView2 != null) {
                healthTextView2.setVisibility(8);
            }
        }
        if (c("hagridConfigureTheNetwork", 7) >= 7 && "b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(this.ac)) {
            LogUtil.a("PluginDevice_WeightInteractor", "EventBus.publish");
            EventBus.a(new EventBus.d("event_bus_config_wifi", new Bundle()));
        }
        this.ae = 0;
        e();
    }

    private int c(String str, int i) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), str + this.as);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("PluginDevice_WeightInteractor", "differentDaysByMillisecond is first");
            return i;
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - CommonUtil.i(strE)) / 86400000);
        LogUtil.a("PluginDevice_WeightInteractor", "differentDaysByMillisecond get config days is = ", Integer.valueOf(iCurrentTimeMillis));
        return iCurrentTimeMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor connecting");
        a(this.f32355a, 1);
        Activity activity = this.z;
        if (activity != null) {
            HealthTextView healthTextView = this.p;
            if (healthTextView != null) {
                healthTextView.setText(activity.getString(R.string.IDS_hw_health_wear_connect_device_connect_text));
            }
            HealthTextView healthTextView2 = this.n;
            if (healthTextView2 != null) {
                healthTextView2.setVisibility(8);
            }
        }
    }

    @Override // com.huawei.health.device.ui.measure.BaseInteractor
    public void controller(int i, Object obj) {
        Activity activity = this.z;
        if (activity == null) {
            LogUtil.e("PluginDevice_WeightInteractor", "WeightInteractor controller mMainActivity is null");
            return;
        }
        if (i == 5) {
            if (m()) {
                if (this.v) {
                    w();
                    return;
                } else {
                    qpx.e(this.z, R.string.IDS_plugin_device_weight_device_not_connect);
                    return;
                }
            }
            b(1);
            return;
        }
        if (i == 6) {
            if (this.v) {
                Intent intent = new Intent();
                ContentValues contentValues = new ContentValues();
                contentValues.put("productId", this.ac);
                contentValues.put("uniqueId", this.as);
                intent.putExtra("commonDeviceInfo", contentValues);
                if (obj instanceof Bundle) {
                    Bundle bundle = (Bundle) obj;
                    intent.putExtra("deviceSsid", bundle.getString("deviceSsid"));
                    intent.putExtra("user_type", bundle.getBoolean("user_type"));
                }
                intent.setPackage(BaseApplication.getAppPackage());
                intent.putExtra("fromsetting", true);
                intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.update.WeightUpdateVersionActivity");
                try {
                    this.z.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("PluginDevice_WeightInteractor", "controller ActivityNotFoundException");
                    return;
                }
            }
            qpx.e(activity, R.string.IDS_plugin_device_weight_device_not_connect);
            return;
        }
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor controller().");
    }

    private void w() {
        Activity activity = this.z;
        if (activity != null && !activity.isFinishing()) {
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.z);
            builder.a(R.string.IDS_plugin_device_clear_user_data).b(R.string.IDS_plugin_device_weight_device_clear_dialog_tip).a(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: dts
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32371c.e(view);
                }
            }).e(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: dtp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("PluginDevice_WeightInteractor", "showClearTipDialog NegativeButton");
                }
            });
            CustomTextAlertDialog customTextAlertDialogB = builder.b();
            customTextAlertDialogB.setCancelable(false);
            customTextAlertDialogB.show();
            return;
        }
        LogUtil.a("PluginDevice_WeightInteractor", "showClearTipDialog() mMainActivity is finish.");
    }

    /* synthetic */ void e(View view) {
        if (this.v) {
            q();
            j();
        } else {
            qpx.e(this.z, R.string.IDS_plugin_device_weight_device_not_connect);
        }
    }

    private void j() {
        LogUtil.a("PluginDevice_WeightInteractor", "send clear user data command");
        e(true, true);
        y();
        EventBus.a(new EventBus.d("weight_device_clear_user_data"));
    }

    private void y() {
        Activity activity = this.z;
        if (activity == null || activity.isFinishing()) {
            LogUtil.e("PluginDevice_WeightInteractor", "WeightInteractor showClearProgressDialog mMainActivity is null or finish");
            return;
        }
        CustomViewDialog customViewDialog = this.af;
        if (customViewDialog == null) {
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.z);
            View viewInflate = LayoutInflater.from(this.z).inflate(R.layout.dialog_weight_device_clear_user_data_progress, (ViewGroup) null);
            ((HealthProgressBar) qsp.a(viewInflate, R.id.iv_clear_user_data_anim)).setVisibility(0);
            builder.d(viewInflate);
            CustomViewDialog customViewDialogD = builder.d();
            this.af = customViewDialogD;
            customViewDialogD.setCancelable(false);
            this.af.show();
        } else if (!customViewDialog.isShowing()) {
            this.af.show();
        } else {
            LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor showClearProgressDialog().");
        }
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        synchronized (this) {
            LogUtil.a("PluginDevice_WeightInteractor", "cancel user info task. is start: ", Boolean.valueOf(z));
            Timer timer = this.o;
            if (timer != null) {
                timer.cancel();
                this.o = null;
            }
            if (z) {
                Timer timer2 = new Timer("PluginDevice_WeightInteractor");
                this.o = timer2;
                timer2.schedule(new TimerTask() { // from class: dti.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        dti.this.s();
                    }
                }, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        synchronized (this) {
            LogUtil.a("PluginDevice_WeightInteractor", "Body fat scales to remove user data timeout");
            b(false);
            if (e(false, false)) {
                e(false, true);
                this.u.sendEmptyMessage(4);
            }
        }
    }

    private boolean e(boolean z, boolean z2) {
        boolean z3;
        synchronized (this) {
            if (z2) {
                this.w = z;
            }
            z3 = this.w;
        }
        return z3;
    }

    @Override // com.huawei.health.device.ui.measure.BaseInteractor
    public void onResume() {
        if (f32354c.an != 1) {
            this.an = 3;
        } else {
            o();
        }
        LogUtil.a("PluginDevice_WeightInteractor", "onResume mStatus: ", Integer.valueOf(this.an));
        this.v = false;
        this.i = false;
        this.x = false;
        e();
        Handler handler = this.u;
        if (handler == null) {
            ReleaseLogUtil.e("R_Weight_PluginDevice_WeightInteractor", "mHandler == null ");
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.ae = 0;
        if (!this.y) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.ai = new d(this);
            BaseApplication.getContext().registerReceiver(this.ai, intentFilter);
            this.y = true;
        }
        if (m()) {
            a(false);
            return;
        }
        LogUtil.a("PluginDevice_WeightInteractor", "onResume startTimer");
        f();
        b(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ContentValues contentValues, int i) {
        this.ax = i;
        LogUtil.a("PluginDevice_WeightInteractor", "sendWspDeviceConnectChanger deviceStatus:", Integer.valueOf(i), " isWaitSendDisconnected:", Boolean.valueOf(this.g));
        if (this.g) {
            if (i == 3) {
                return;
            }
            this.u.removeCallbacks(this.e);
            this.g = false;
        }
        c(contentValues, i);
    }

    private boolean m() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            LogUtil.d("PluginDevice_WeightInteractor", "bluetooth is null");
            return false;
        }
        if (defaultAdapter.isEnabled()) {
            LogUtil.d("PluginDevice_WeightInteractor", "bluetooth is open");
            return true;
        }
        LogUtil.d("PluginDevice_WeightInteractor", "bluetooth is close");
        return false;
    }

    @Override // com.huawei.health.device.ui.measure.BaseInteractor
    public void onDestroy() {
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor destroy.");
        this.an = 3;
        if (this.ac != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", -6);
            bundle.putString("productId", this.ac);
            MeasurableDevice measurableDeviceB = dmp.d().b(this.as, false);
            if (dxm.ag(this.ac)) {
                LogUtil.a("PluginDevice_WeightInteractor", "onDestroy prepare wsp controller");
                doq.e().c(d);
                doq.e().prepare(measurableDeviceB, null, bundle);
            } else {
                dof.d().d(d);
                dof.d().prepare(measurableDeviceB, null, bundle);
            }
            d = null;
        }
        drw.e().d(this.ac, this.as, -6);
        b();
        a();
    }

    public void a() {
        Handler handler = this.u;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        a(this.f32355a, 3);
        lss.a(this.z, new Consumer() { // from class: dtj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f32366a.c((Activity) obj);
            }
        });
    }

    /* synthetic */ void c(Activity activity) {
        activity.runOnUiThread(new Runnable() { // from class: dth
            @Override // java.lang.Runnable
            public final void run() {
                this.e.i();
            }
        });
    }

    /* synthetic */ void i() {
        this.z = null;
        this.p = null;
        this.n = null;
        this.ar = null;
        this.l = null;
        this.ap = null;
        this.aq = null;
        this.h = null;
        this.m = null;
        this.k = null;
        this.ak = null;
        this.al = null;
        this.aj = null;
        this.am = null;
        this.s = null;
        this.aa = null;
        this.ab = null;
        this.ad = null;
    }

    public void b() {
        h();
        setClean();
        this.af = null;
        this.x = true;
    }

    @Override // com.huawei.health.device.ui.measure.BaseInteractor
    public void setClean() {
        try {
            LogUtil.a("PluginDevice_WeightInteractor", "Enter unRegisterUnbindDeviceBroadcast()");
            if (this.y) {
                BaseApplication.getContext().unregisterReceiver(this.ai);
                this.y = false;
            }
        } catch (IllegalArgumentException e2) {
            LogUtil.e("PluginDevice_WeightInteractor", e2.getMessage());
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        Activity activity = this.z;
        if (activity == null) {
            activity = BaseApplication.getActivity();
        }
        b(activity, new CustomPermissionAction(activity) { // from class: dti.2
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                dti.this.e(z);
            }
        });
    }

    private void b(Context context, CustomPermissionAction customPermissionAction) {
        if (context == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "checkRequestScanPermissions: context is null");
        } else if (Build.VERSION.SDK_INT > 30) {
            PermissionUtil.d(context, PermissionUtil.PermissionType.SCAN, new AnonymousClass4(context, customPermissionAction, context));
        } else {
            customPermissionAction.onGranted();
        }
    }

    /* JADX INFO: renamed from: dti$4, reason: invalid class name */
    public class AnonymousClass4 extends CustomPermissionAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomPermissionAction f32359a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f32361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context, CustomPermissionAction customPermissionAction, Context context2) {
            super(context);
            this.f32359a = customPermissionAction;
            this.f32361c = context2;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("PluginDevice_WeightInteractor", "checkRequestScanPermissions onGranted");
            e();
            this.f32359a.onGranted();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            e();
            String string = this.f32361c.getResources().getString(qrs.b(PermissionUtil.PermissionType.SCAN));
            dti dtiVar = dti.this;
            CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this.f32361c).a(com.huawei.ui.commonui.R.string.IDS_hwh_home_other_permissions_title).a(string).e(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dtt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("PluginDevice_WeightInteractor", "showScanPermissionSettingGuide cancel");
                }
            });
            int i = com.huawei.ui.commonui.R.string.IDS_hwh_motiontrack_permission_guide_go_set;
            final Context context = this.f32361c;
            dtiVar.ag = builderE.a(i, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.WeightInteractor$4$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dti.AnonymousClass4.e(context, view);
                }
            }).b();
            dti.this.ag.setCancelable(false);
            dti.this.ag.show();
        }

        public static /* synthetic */ void e(Context context, View view) {
            LogUtil.a("PluginDevice_WeightInteractor", "showScanPermissionSettingGuide setting");
            qrs.al(context);
        }

        private void e() {
            if (dti.this.ag == null || !dti.this.ag.isShowing()) {
                return;
            }
            dti.this.ag.dismiss();
            LogUtil.a("PluginDevice_WeightInteractor", "showScanPermissionSettingGuide: dismiss dialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        MeasurableDevice measurableDeviceB = dmp.d().b(this.as, true);
        if (measurableDeviceB == null || !(measurableDeviceB instanceof efx)) {
            LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor BleDevice not bonded :", this.ac);
            if (dxm.y(this.ac)) {
                e();
                onDestroy();
                x();
                return;
            }
            return;
        }
        if (!m()) {
            LogUtil.a("PluginDevice_WeightInteractor", "bluetooth is off");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("type", -1);
        bundle.putString("productId", this.ac);
        bundle.putString("uniqueId", this.as);
        bundle.putBoolean("clearData", true);
        bundle.putBoolean("isConnectAction", true);
        if (z) {
            doq.e().d(-6);
            drw.e().d(this.ac, this.as, -6);
            drw.e().a(this.ac, this.as, d, bundle, true);
            LogUtil.a("PluginDevice_WeightInteractor", "reconnect...");
            return;
        }
        elh elhVarD = ResourceManager.c().d(this.ac);
        if (elhVarD == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "productInfo == null");
            return;
        }
        MeasureKit measureKitI = drw.e().i(elhVarD.q());
        if (measureKitI == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "kit == null");
            return;
        }
        MeasureController measureController = measureKitI.getMeasureController();
        if (measureController == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "controller == null");
        } else {
            measureController.prepare(measurableDeviceB, d, bundle);
        }
    }

    public void e() {
        synchronized (this) {
            Timer timer = this.t;
            if (timer != null) {
                timer.cancel();
                this.t = null;
                LogUtil.a("PluginDevice_WeightInteractor", "Cancel the timer connected devices");
            } else {
                LogUtil.j("PluginDevice_WeightInteractor", "Connection timer has been canceled");
            }
            e eVar = this.f;
            if (eVar != null) {
                boolean zCancel = eVar.cancel();
                this.f = null;
                LogUtil.a("PluginDevice_WeightInteractor", "bluetooth reconnection cancel result: ", Boolean.valueOf(zCancel));
            } else {
                LogUtil.j("PluginDevice_WeightInteractor", "mBluetoothReconnectionTimer is null");
            }
        }
    }

    public void f() {
        synchronized (this) {
            this.ae++;
            if (this.t == null) {
                this.t = new Timer("PluginDevice_WeightInteractor");
                LogUtil.a("PluginDevice_WeightInteractor", "Start the timer connected devices");
                if (this.f == null) {
                    this.f = new e(this);
                }
                this.t.schedule(this.f, 1000L, 32005L);
            }
        }
    }

    public void b(final int i) {
        LogUtil.a("PluginDevice_WeightInteractor", "show open bluetooth dialog...");
        if (this.x) {
            return;
        }
        final Activity activity = this.z;
        if (activity == null) {
            activity = BaseApplication.getActivity();
        }
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j("PluginDevice_WeightInteractor", "showOpenSystemBluetoothDialog: activity is null | isFinishing | isDestroyed");
        } else {
            b(activity, new CustomPermissionAction(activity) { // from class: dti.5
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    dti.this.a(i, activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, final Activity activity) {
        Dialog dialog = this.ad;
        if (dialog != null && dialog.isShowing()) {
            this.ad.dismiss();
            LogUtil.a("PluginDevice_WeightInteractor", "showOpenSystemBluetoothDialog: dismiss old dialog");
        }
        if (i == 1) {
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
            builder.a(R.string.IDS_device_bluetooth_open).b(R.string.IDS_device_bluetooth_open_request).e(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: dtn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("PluginDevice_WeightInteractor", "showOpenSystemBluetoothDialog NegativeButton");
                }
            }).a(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: dtk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dys.a().e(activity);
                }
            });
            this.ad = builder.b();
        } else if (i == 2) {
            String string = activity.getResources().getString(R.string.IDS_app_name_health);
            NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(activity).a(String.format(Locale.ENGLISH, activity.getResources().getString(R.string.IDS_device_bt_open_request_info), string));
            builderA.a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: dtr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("PluginDevice_WeightInteractor", "showOpenSystemBluetoothDialog NegativeButton OPEN_BLUETOOTH_DIALOG");
                }
            }).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: dto
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dys.a().e(activity);
                }
            });
            this.ad = builderA.c();
        } else {
            LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor showOpenSystemBluetoothDialog()");
        }
        Dialog dialog2 = this.ad;
        if (dialog2 != null) {
            dialog2.setCancelable(false);
            this.ad.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor showSelectBindDeviceDialog");
        Activity activity = this.z;
        if (activity != null && (activity instanceof DeviceMainActivity)) {
            ((DeviceMainActivity) activity).b(this.ac);
            e();
            r();
            onDestroy();
            return;
        }
        LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor showSelectBindDeviceDialog mainActivity is null");
    }

    private void q() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_WEIGHT_BODYFATSCALE_CLEAR_USER_DATA_2060031.value(), map, 0);
    }

    public boolean c() {
        return this.v;
    }

    public void d(boolean z) {
        this.v = z;
    }

    public static void b(Activity activity) {
        dti dtiVar = f32354c;
        if (dtiVar == null || dtiVar.z != activity) {
            LogUtil.a("PluginDevice_WeightInteractor", "weightInteractor is null or earlier activity");
            return;
        }
        LogUtil.a("PluginDevice_WeightInteractor", "destroyWithoutDisconnect productId: ", dtiVar.ac, ", code: ", CommonUtil.n(dtiVar.as));
        doq.e().c(d);
        dtiVar.b();
        dtiVar.a();
    }

    public static void b(String str, String str2) {
        dti dtiVar = f32354c;
        if (dtiVar == null) {
            LogUtil.a("PluginDevice_WeightInteractor", "weightInteractor is null");
            return;
        }
        LogUtil.a("PluginDevice_WeightInteractor", "code: ", CommonUtil.n(str2), ", mCode: ", CommonUtil.n(dtiVar.as));
        if (TextUtils.equals(str2, dtiVar.as)) {
            return;
        }
        dtiVar.onDestroy();
        dtiVar.ac = str;
        dtiVar.as = str2;
    }

    static class h extends BaseHandler<dti> {
        h(dti dtiVar) {
            super(dtiVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(dti dtiVar, Message message) {
            if (dtiVar == null) {
                LogUtil.j("PluginDevice_WeightInteractor", "handleMessageWhenReferenceNotNull() weightInteractor is null.");
            }
            if (message == null) {
                LogUtil.j("PluginDevice_WeightInteractor", "handleMessageWhenReferenceNotNull() msg is null.");
                return;
            }
            ReleaseLogUtil.e("R_Weight_PluginDevice_WeightInteractor", "handleMessageWhenReferenceNotNull() msg is ", Integer.valueOf(message.what));
            switch (message.what) {
                case 1:
                    dtiVar.l();
                    break;
                case 2:
                    dtiVar.n();
                    if (dtiVar.q != null) {
                        dtiVar.q.sendEmptyMessage(16);
                    }
                    break;
                case 3:
                    a(dtiVar);
                    break;
                case 4:
                    if (dtiVar.af != null && dtiVar.af.isShowing()) {
                        if (dtiVar.z != null) {
                            qpx.e(dtiVar.z, R.string.IDS_plugin_device_weight_device_clear_fail);
                        }
                        dtiVar.af.dismiss();
                    }
                    LogUtil.j("PluginDevice_WeightInteractor", "clear user data fail");
                    break;
                case 5:
                    c(dtiVar);
                    break;
                case 6:
                    dtiVar.v();
                    break;
                case 7:
                    dtiVar.o();
                    break;
            }
        }

        private void a(dti dtiVar) {
            if (dtiVar.af != null && dtiVar.af.isShowing()) {
                if (dtiVar.z != null) {
                    qpx.e(dtiVar.z, R.string.IDS_plugin_device_weight_device_clear_success);
                }
                dtiVar.af.dismiss();
            }
            dtiVar.b(false);
            LogUtil.a("PluginDevice_WeightInteractor", "clear user data success");
        }

        private boolean d(dti dtiVar) {
            return dtiVar.an == 1 || doq.e().l() == 2 || doq.e().l() == 1;
        }

        private void c(dti dtiVar) {
            if (dmp.d().b(dtiVar.as, true) != null) {
                if (drw.e().g(dtiVar.as)) {
                    ReleaseLogUtil.d("R_Weight_PluginDevice_WeightInteractor", dyg.b(dtiVar.as), " is measuring");
                    return;
                }
                if (dtiVar.j == 12 && !dtiVar.v) {
                    LogUtil.j("PluginDevice_WeightInteractor", "device is not connect, try to reconnect, status = ", Integer.valueOf(dtiVar.an));
                    if (dxm.ag(dtiVar.ac) && d(dtiVar)) {
                        dtiVar.e();
                        return;
                    } else {
                        ReleaseLogUtil.e("R_Weight_PluginDevice_WeightInteractor", "device goto connect...");
                        dtiVar.a(true);
                        return;
                    }
                }
                LogUtil.a("PluginDevice_WeightInteractor", "bluetooth status is close...");
                if (dtiVar.v) {
                    return;
                }
                dtiVar.u.sendEmptyMessage(1);
                return;
            }
            dtiVar.e();
        }
    }

    static class d extends BroadcastReceiver {
        private WeakReference<dti> d;

        d(dti dtiVar) {
            this.d = null;
            this.d = new WeakReference<>(dtiVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            dti dtiVar = this.d.get();
            if (dtiVar != null && !(dmp.d().b(dtiVar.as, true) instanceof efx)) {
                LogUtil.j("PluginDevice_WeightInteractor", "current device is not ble device");
                return;
            }
            if (dtiVar == null || !"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                return;
            }
            dtiVar.j = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (dtiVar.j != 12) {
                if (dtiVar.j == 10) {
                    ReleaseLogUtil.d("R_Weight_PluginDevice_WeightInteractor", "BleDevice onConnectionStateChange :status:0,newState:0");
                    if (dtiVar.v) {
                        dtiVar.v = false;
                        dtiVar.u.sendEmptyMessage(1);
                    }
                    dtiVar.e();
                    return;
                }
                LogUtil.j("PluginDevice_WeightInteractor", "BluetoothStateBroadcastReceiver onReceive(). mBluetoothStatus: ", Integer.valueOf(dtiVar.j));
                int iL = doq.e().l();
                if (iL == 1 || iL == 2) {
                    ReleaseLogUtil.e("R_Weight_PluginDevice_WeightInteractor", "invalid connect status: ", Integer.valueOf(iL));
                    doq.e().d();
                    return;
                }
                return;
            }
            ReleaseLogUtil.d("R_Weight_PluginDevice_WeightInteractor", "Open the bluetooth");
            dtiVar.ae = 0;
            dtiVar.e();
            dtiVar.f();
            if (dtiVar.ad == null || !dtiVar.ad.isShowing()) {
                return;
            }
            dtiVar.ad.dismiss();
        }
    }

    static class e extends TimerTask {
        private WeakReference<dti> d;

        e(dti dtiVar) {
            this.d = new WeakReference<>(dtiVar);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            dti dtiVar = this.d.get();
            if (dtiVar != null && dtiVar.u != null) {
                dtiVar.j = BluetoothAdapter.getDefaultAdapter().getState();
                LogUtil.a("PluginDevice_WeightInteractor", "weight BleDevice onConnectionStateChange Run autoReconnect");
                dtiVar.u.removeMessages(5);
                dtiVar.u.sendEmptyMessageDelayed(5, 1000L);
                return;
            }
            LogUtil.j("PluginDevice_WeightInteractor", "BluetoothReconnectionTimer run, weightInteractor or mHandler is null");
        }
    }

    static class c implements IHealthDeviceCallback {
        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        private c() {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
            dti.b(healthDevice, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(HealthDevice healthDevice, int i) {
        ReleaseLogUtil.d("R_Weight_PluginDevice_WeightInteractor", "Interactor onStatusChanged ", Integer.valueOf(System.identityHashCode(healthDevice)), ", status: ", Integer.valueOf(i));
        dti dtiVar = f32354c;
        if (dtiVar == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "mInteractor is null");
            return;
        }
        if (i == 3) {
            int iL = doq.e().l();
            LogUtil.a("PluginDevice_WeightInteractor", "onStatusChange measureConnectStatus: ", Integer.valueOf(iL));
            if (iL == 0) {
                f32354c.an = i;
            }
            LogUtil.a("PluginDevice_WeightInteractor", "onStatusChange mStatus: ", Integer.valueOf(f32354c.an));
            if (f32354c.an != i) {
                f32354c.an = i;
            }
            if (f32354c.an != 1) {
                c(1, 1, 1000);
                f32354c.v = false;
                return;
            }
            return;
        }
        if (i == 2) {
            dtiVar.an = i;
            c(1, 2, 0);
            f32354c.v = true;
            return;
        }
        if (i == -3) {
            dtiVar.e(false, true);
            b(3, 0);
            LogUtil.a("PluginDevice_WeightInteractor", "Clear the user data is complete");
            return;
        }
        if (i == 15) {
            b(6, 0);
            return;
        }
        if (i == 4) {
            dtiVar.an = i;
            f32354c.e();
            c(1, 1, 1000);
        } else if (i == 1) {
            dtiVar.an = i;
            b(7, 0);
        } else if (i == 5) {
            dtiVar.an = 3;
        } else {
            LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor unknown status.");
        }
    }

    private static void c(int i, int i2, int i3) {
        Handler handler;
        dti dtiVar = f32354c;
        if (dtiVar == null || (handler = dtiVar.u) == null) {
            return;
        }
        handler.removeMessages(i);
        f32354c.u.sendEmptyMessageDelayed(i2, i3);
    }

    private static void b(int i, int i2) {
        Handler handler;
        dti dtiVar = f32354c;
        if (dtiVar == null || (handler = dtiVar.u) == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(i, i2);
    }

    public void g() {
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor subscribeWeightData to enter");
        HiHealthNativeApi.a(this.z).subscribeHiHealthData(Arrays.asList(Integer.valueOf(HiSubscribeType.f12259a)), new a(this));
    }

    public void h() {
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor unSubscribeHiHealthWeightData to enter");
        if (this.z == null) {
            LogUtil.e("PluginDevice_WeightInteractor", "WeightInteractor unSubscribeHiHealthWeightData mMainActivity is null");
        } else if (!njy.e(this.ao)) {
            HiHealthNativeApi.a(this.z).unSubscribeHiHealthData(this.ao, new g("unSubscribeWeightData, isSuccess:"));
        } else {
            LogUtil.j("PluginDevice_WeightInteractor", "unSubscribe HiHealth WeightData list is empty or null");
        }
    }

    private void e(IBaseResponseCallback iBaseResponseCallback) {
        HiAggregateOption hiAggregateOptionA = dne.a();
        hiAggregateOptionA.setFilter("0");
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionA, new b(iBaseResponseCallback));
    }

    public static class a implements HiSubscribeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<dti> f32363b;

        public a(dti dtiVar) {
            this.f32363b = new WeakReference<>(dtiVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (this.f32363b == null) {
                LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor InnerHiSubscribeListener onResult mInteractor is null");
                return;
            }
            if (njy.e(list)) {
                LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor subscribe HiHealthData successList is null or empty");
                return;
            }
            dti dtiVar = this.f32363b.get();
            if (dtiVar != null) {
                dtiVar.ao = list;
            } else {
                LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor InnerHiSubscribeListener onResult interactor is null");
            }
            LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor subscribe HiHealthData successList.size() = ", Integer.valueOf(list.size()));
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (this.f32363b == null) {
                LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor InnerHiSubscribeListener onResult mInteractor is null");
                return;
            }
            LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor InnerHiSubscribeListener onChange");
            dti dtiVar = this.f32363b.get();
            if (dtiVar == null) {
                LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor InnerHiSubscribeListener onResult interactor is null");
            } else if (i == HiSubscribeType.f12259a) {
                dtiVar.p();
            } else {
                LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor InnerHiSubscribeListener onChange not weight data type");
            }
        }
    }

    private void e(HiHealthData hiHealthData) {
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor refreshWeightDetailData enter");
        if (this.ap == null || this.aq == null || this.h == null || this.m == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor refreshWeightDetailData view = null");
            return;
        }
        if (hiHealthData == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor refreshWeightDetailData healtData = null");
            this.ap.setText("--");
            a(0.0d, this.aq);
            this.h.setText("--");
            this.m.setText("--");
            this.k.setVisibility(8);
            return;
        }
        LogUtil.a("PluginDevice_WeightInteractor", "refreshWeightDetailData healthData ", hiHealthData);
        b(hiHealthData);
        d(hiHealthData);
        a(hiHealthData);
        c(hiHealthData);
    }

    private void c(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "setBodyFatValue healthData = null");
            return;
        }
        double d2 = hiHealthData.getDouble(BleConstants.BODY_FAT_RATE);
        if (Double.compare(d2, 0.0d) > 0.0d) {
            LogUtil.d("PluginDevice_WeightInteractor", "refreshWeightDetailData bodyFat = ", Double.valueOf(d2));
            if (LanguageUtil.aj(this.z)) {
                this.l.setLayoutDirection(1);
            }
            if (LanguageUtil.o(this.z) || LanguageUtil.q(this.z)) {
                this.m.setText(UnitUtil.e(d2, 1, 1));
                this.k.setVisibility(0);
                return;
            } else {
                this.m.setText(UnitUtil.e(d2, 2, 1));
                this.k.setVisibility(8);
                return;
            }
        }
        LogUtil.j("PluginDevice_WeightInteractor", "refreshWeightDetailData bodyFat is valid");
        this.m.setText("--");
        this.k.setVisibility(8);
    }

    private void a(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "setBmiValue healthData = null");
            return;
        }
        double d2 = hiHealthData.getDouble(BleConstants.BMI);
        if (d2 >= 10.0d && d2 <= 60.0d) {
            LogUtil.d("PluginDevice_WeightInteractor", "refreshWeightDetailData BMI = ", Double.valueOf(d2));
            this.h.setText(UnitUtil.e(d2, 1, 1));
            return;
        }
        double d3 = hiHealthData.getDouble("bodyWeight");
        if (d3 <= 0.0d) {
            this.h.setText("--");
            return;
        }
        int i = hiHealthData.getInt("height");
        if (i <= 0) {
            b(d3);
        } else {
            c(d3, i);
        }
    }

    private void b(double d2) {
        MultiUsersManager.INSTANCE.getCurrentUser(new f(this, d2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(double d2, int i) {
        String strE;
        if (this.h == null) {
            LogUtil.e("PluginDevice_WeightInteractor", "setBmiValueByHeight mBmiValue is null");
            return;
        }
        double dE = etn.e(d2, i);
        if (Double.compare(dE, 0.0d) <= 0.0d) {
            strE = "--";
        } else {
            strE = UnitUtil.e(dE, 1, 1);
        }
        LogUtil.d("PluginDevice_WeightInteractor", "refreshWeightDetailData bmi from weight and height, ", strE, "double ", Double.valueOf(dE));
        this.h.setText(strE);
    }

    private void d(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "setWeightValue healthData = null");
            return;
        }
        double d2 = hiHealthData.getDouble("bodyWeight");
        int iC = dne.c(d2, hiHealthData.getInt("trackdata_deviceType"));
        if (Double.compare(d2, 0.0d) > 0.0d) {
            LogUtil.d("PluginDevice_WeightInteractor", "refreshWeightDetailData weight = ", Double.valueOf(d2));
            if (LanguageUtil.aj(this.z)) {
                this.ar.setLayoutDirection(1);
            }
            c(d2, iC, this.ap);
            a(d2, this.aq);
            return;
        }
        LogUtil.j("PluginDevice_WeightInteractor", "refreshWeightDetailData weight is valid");
        this.ap.setText("--");
        a(0.0d, this.aq);
    }

    private void e(HiHealthData hiHealthData, HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3) {
        LogUtil.a("PluginDevice_WeightInteractor", "WeightInteractor refreshWeightData to enter");
        if (healthTextView == null || healthTextView2 == null || healthTextView3 == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "WeightInteractor refreshWeightData view is null");
            return;
        }
        if (hiHealthData == null) {
            c(healthTextView, healthTextView2, healthTextView3);
            return;
        }
        double d2 = hiHealthData.getDouble("bodyWeight");
        int i = hiHealthData.getInt("trackdata_deviceType");
        long startTime = hiHealthData.getStartTime();
        int iC = dne.c(d2, i);
        if (d2 > 0.0d) {
            c(d2, iC, healthTextView);
            a(d2, healthTextView3);
            healthTextView2.setText(qrk.d(startTime));
            healthTextView2.setVisibility(0);
            return;
        }
        c(healthTextView, healthTextView2, healthTextView3);
    }

    private void c(double d2, int i, HealthTextView healthTextView) {
        if (d2 <= 0.0d) {
            healthTextView.setText("--");
        } else if (UnitUtil.f()) {
            healthTextView.setText(UnitUtil.e(UnitUtil.h(d2), 1, i));
        } else {
            healthTextView.setText(UnitUtil.e(d2, 1, i));
        }
    }

    private void a(double d2, HealthTextView healthTextView) {
        if (healthTextView == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "setWeightDataMeasureValueUnit unitView is null");
        } else if (UnitUtil.f()) {
            healthTextView.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_lb_string, etn.a(UnitUtil.h(d2)), ""));
        } else {
            healthTextView.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_kg_string, etn.a(d2), ""));
        }
    }

    private void c(HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3) {
        if (healthTextView == null || healthTextView2 == null || healthTextView3 == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "showEmptyView view is null");
            return;
        }
        c(0.0d, 0, healthTextView);
        a(0.0d, healthTextView3);
        healthTextView2.setVisibility(8);
    }

    public static class g implements HiUnSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32365c;

        public g(String str) {
            this.f32365c = str;
        }

        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
        public void onResult(boolean z) {
            LogUtil.a("PluginDevice_WeightInteractor", this.f32365c, Boolean.valueOf(z));
        }
    }

    static class f implements WeightBaseResponseCallback<dnj> {
        private double d;
        private WeakReference<dti> e;

        f(dti dtiVar, double d) {
            this.e = new WeakReference<>(dtiVar);
            this.d = d;
        }

        @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(final int i, final dnj dnjVar) {
            final dti dtiVar = this.e.get();
            if (dtiVar != null) {
                Activity activity = dtiVar.z;
                if (activity == null) {
                    LogUtil.j("PluginDevice_WeightInteractor", "InnerWeightBaseResponseCallback onResponse mainActivity is null");
                    return;
                } else {
                    activity.runOnUiThread(new Runnable() { // from class: dtx
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f32374a.e(dnjVar, i, dtiVar);
                        }
                    });
                    return;
                }
            }
            LogUtil.j("PluginDevice_WeightInteractor", "InnerWeightBaseResponseCallback onResponse weightInteractor is null");
        }

        /* synthetic */ void e(dnj dnjVar, int i, dti dtiVar) {
            if (dnjVar != null && i == 0) {
                dtiVar.c(this.d, dnjVar.e());
            } else {
                LogUtil.j("PluginDevice_WeightInteractor", "InnerWeightBaseResponseCallback setBmiValue getCurrentUser fail");
            }
        }
    }

    static class b implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<IBaseResponseCallback> f32364a;

        b(IBaseResponseCallback iBaseResponseCallback) {
            this.f32364a = new WeakReference<>(iBaseResponseCallback);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            IBaseResponseCallback iBaseResponseCallback = this.f32364a.get();
            if (iBaseResponseCallback == null) {
                LogUtil.j("PluginDevice_WeightInteractor", "InnerHiAggregateListener onResult responseCallback is null");
            } else if (njy.e(list)) {
                iBaseResponseCallback.a(-1, null);
            } else {
                iBaseResponseCallback.a(0, list.get(0));
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("PluginDevice_WeightInteractor", "InnerHiAggregateListener queryWeightData onResultIntent errorCode = ", Integer.valueOf(i2));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.r()) {
            LogUtil.a("PluginDevice_WeightInteractor", "click too fast");
        } else if (view == this.s) {
            ReleaseLogUtil.e("R_Weight_PluginDevice_WeightInteractor", "enterToWeightHistory");
            k();
        }
    }

    private void k() {
        if (this.z == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "enterToWeightHistory mMainActivity is null");
            return;
        }
        MultiUsersManager.INSTANCE.setCurrentUser(MultiUsersManager.INSTANCE.getMainUser());
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity");
        try {
            ReleaseLogUtil.a("R_Weight_PluginDevice_WeightInteractor", "enter to Weight History Activity");
            this.z.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PluginDevice_WeightInteractor", "enterToWeightHistory ActivityNotFoundException");
        }
    }

    private void b(HiHealthData hiHealthData) {
        Activity activity = this.z;
        if (activity == null || this.ab == null || this.aa == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "setLastMeasureTime mMainActivity is null");
            return;
        }
        if (LanguageUtil.ba(activity)) {
            this.ab.setBackground(this.z.getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.ab.setBackground(this.z.getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        if (hiHealthData == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "setLastMeasureTime healthData is null");
        } else {
            this.aa.setText(d(hiHealthData.getStartTime(), "yyyy/MM/dd HH:mm:ss"));
        }
    }

    private String d(long j, String str) {
        try {
            Date date = new Date();
            date.setTime(j);
            return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), str)).format(date);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PluginDevice_WeightInteractor", "getFormat error");
            return "";
        }
    }

    /* JADX INFO: renamed from: dti$9, reason: invalid class name */
    class AnonymousClass9 implements EventBus.ICallback {
        AnonymousClass9() {
        }

        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            Intent intentC = dVar.c();
            String strE = dVar.e();
            LogUtil.a("PluginDevice_WeightInteractor", "sendCommandData getVersionCallback action:", strE, "  isCancel:", Boolean.valueOf(dti.this.i));
            if ("set_scale_version_code".equals(strE)) {
                if (Objects.equals(dti.this.r, intentC.getStringExtra(HealthEngineRequestManager.PARAMS_DEVICE_SN))) {
                    byte[] byteArrayExtra = intentC.getByteArrayExtra("sourceData");
                    LogUtil.a("PluginDevice_WeightInteractor", "getScaleVersion sourceData:", byteArrayExtra != null ? Integer.valueOf(byteArrayExtra.length) : Constants.NULL);
                    BaseResponseCallback baseResponseCallback = (BaseResponseCallback) dti.this.aw.getAndSet(null);
                    if (baseResponseCallback != null) {
                        baseResponseCallback.onResponse(0, byteArrayExtra);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("get_version_code_fail".equals(strE)) {
                dti.this.u.postDelayed(new Runnable() { // from class: dtv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32373b.b();
                    }
                }, 1000L);
            }
        }

        /* synthetic */ void b() {
            if (dti.this.i) {
                return;
            }
            EventBus.a(new EventBus.d("get_scale_version_code"));
        }
    }

    private void e(BaseResponseCallback<byte[]> baseResponseCallback) {
        EventBus.b(this.f32356b, 0, "set_scale_version_code", "get_version_code_fail");
        this.aw.set(baseResponseCallback);
        EventBus.a(new EventBus.d("get_scale_version_code"));
    }

    private void b(String str, String str2, final BaseResponseCallback<byte[]> baseResponseCallback) {
        LogUtil.a("PluginDevice_WeightInteractor", "sendCommandData uuIdString:", str2);
        UUID uuidFromString = UUID.fromString(str2);
        if (dpg.m.equals(uuidFromString)) {
            this.u.post(new Runnable() { // from class: dtm
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(baseResponseCallback);
                }
            });
        } else if (dpg.r.equals(uuidFromString)) {
            this.u.post(new Runnable() { // from class: dtl
                @Override // java.lang.Runnable
                public final void run() {
                    baseResponseCallback.onResponse(0, new byte[]{0});
                }
            });
        }
    }

    /* synthetic */ void c(BaseResponseCallback baseResponseCallback) {
        e((BaseResponseCallback<byte[]>) baseResponseCallback);
    }

    public static void d(String str) {
        LogUtil.a("PluginDevice_WeightInteractor", "connectScaleDevice code:", CommonUtil.n(str));
        ContentValues contentValuesJ = dmp.d().j(str);
        if (contentValuesJ == null) {
            LogUtil.j("PluginDevice_WeightInteractor", "connectScaleDevice contentValues == null");
            return;
        }
        if (!dyk.a().a(str)) {
            LogUtil.a("PluginDevice_WeightInteractor", "connectScaleDevice not BluetoothDevice");
            c(contentValuesJ, 5);
        } else {
            dti dtiVarD = d(contentValuesJ.getAsString("productId"), str);
            dtiVarD.d();
            dtiVarD.onResume();
        }
    }

    public static void b(String str, String str2, String str3, BaseResponseCallback<byte[]> baseResponseCallback) {
        if (f32354c == null) {
            d(str);
        }
        dti dtiVar = f32354c;
        if (dtiVar == null || dtiVar.i || !Objects.equals(str, dtiVar.as)) {
            return;
        }
        f32354c.b(str2, str3, baseResponseCallback);
    }

    public static void a(String str) {
        dti dtiVar = f32354c;
        if (dtiVar == null || dtiVar.i || Objects.equals(str, dtiVar.as)) {
            return;
        }
        LogUtil.a("PluginDevice_WeightInteractor", "checkCancelConnectScale code:", CommonUtil.n(str));
        dti dtiVar2 = f32354c;
        dtiVar2.i = true;
        dtiVar2.onDestroy();
    }

    private static void c(ContentValues contentValues, int i) {
        if (qst.d()) {
            LogUtil.a("PluginDevice_WeightInteractor", "sendWspDeviceConnectChanger deviceStatus:", Integer.valueOf(i));
        }
    }
}
