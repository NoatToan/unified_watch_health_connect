package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.callback.FactoryRestCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProActivityResultCallback;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.sim.multisim.activity.EsimAccountManageActivity;
import com.huawei.sim.multisim.constants.BrandType;
import com.huawei.sim.multisim.constants.CarrierType;
import com.huawei.sim.multisim.constants.EsimType;
import com.huawei.sim.strategy.EsimCarrierStrategy;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.action.WearWalletFactoryUtil;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import com.huawei.up.utils.ErrorCode;
import defpackage.pxn;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class tpp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f49506b = new Object();
    private static volatile tpp d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WearWalletFactoryUtil f49507a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeviceSettingsInteractors f49508c;
    private FragmentActivity f;
    private FactoryRestCallback h;
    private CustomTextAlertDialog j;
    private CustomAlertDialog k;
    private DeviceInfo l;
    private DeviceCapability m;
    private String n;
    private Context o;
    private int p;
    private CustomTextAlertDialog r;
    private CommonDialog21 s;
    private LinearLayout t;
    private boolean g = false;
    public boolean e = false;
    private int i = 0;
    private Handler q = new Handler(Looper.getMainLooper()) { // from class: tpp.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("ResetFactoryUtils", " msg = ", message);
            ReleaseLogUtil.d("R_ResetFactoryUtils", "what:", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 8) {
                if (i != 100005) {
                    if (i == 100007) {
                        tpp.this.e(false);
                        tpp.this.e(message.arg1);
                        return;
                    }
                    if (i == 10) {
                        tpp.this.e(false);
                        tpp.this.p();
                        tpp.this.e(false, "restore_error");
                        tpp.this.j();
                        return;
                    }
                    if (i == 11) {
                        tpp.this.e(false);
                        tpp.this.p();
                        tpp.this.e(false, "restore_fail");
                        return;
                    }
                    switch (i) {
                        case 100001:
                            tpp.this.e(false);
                            tpp.this.p();
                            tpp.this.d(message.arg1);
                            break;
                        case ErrorCode.HWID_IS_STOPED /* 100002 */:
                            tpp.this.e(false);
                            tpp.this.p();
                            tpp.this.c(message.arg1);
                            break;
                        case 100003:
                            break;
                        default:
                            tpp.this.e(message);
                            break;
                    }
                    return;
                }
                tpp.this.t();
                tpp.this.e(false);
                tpp.this.c(false);
                tpp.this.g = false;
                tpp.this.y();
                return;
            }
            tpp.this.e(false);
            tpp.this.p();
            tpp.this.d();
            tpp.this.e(true, "");
        }
    };

    public void n() {
    }

    public static tpp c() {
        tpp tppVar;
        synchronized (f49506b) {
            if (d == null) {
                d = new tpp();
            }
            tppVar = d;
        }
        return tppVar;
    }

    public void a(boolean z) {
        this.e = z;
    }

    private tpp() {
    }

    public void b() {
        m();
    }

    public void e(String str, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_ResetFactoryUtils", "enter startResetFactory");
        this.n = str;
        this.l = deviceInfo;
        this.f = (FragmentActivity) BaseApplication.j();
        this.f49508c = DeviceSettingsInteractors.e(this.o);
        this.f49507a = new WearWalletFactoryUtil();
        this.m = this.f49508c.e(str);
        k();
    }

    public void c(String str, DeviceInfo deviceInfo, int i) {
        this.n = str;
        this.l = deviceInfo;
        this.p = i;
        this.f = (FragmentActivity) BaseApplication.j();
        this.f49508c = DeviceSettingsInteractors.e(this.o);
        this.f49507a = new WearWalletFactoryUtil();
        this.m = this.f49508c.e(str);
        k();
    }

    public void k() {
        DeviceCapability deviceCapability = this.m;
        if (deviceCapability != null && deviceCapability.isSupportEsim()) {
            b(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
            npz.b().t();
            npz.b().d(this.q);
            return;
        }
        ab();
    }

    private void ab() {
        DeviceCapability deviceCapability;
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_1010033.value(), new HashMap(16), 0);
        LogUtil.a("ResetFactoryUtils", 1, "ResetFactoryUtils", "enter showRestoreFactoryDialog()");
        int productType = this.l.getProductType();
        LogUtil.a("ResetFactoryUtils", 0, "ResetFactoryUtils", "currentDeviceType is ", Integer.valueOf(productType));
        String strA = tqp.a(this.f, this.n);
        String string = this.f.getString(R.string.IDS_settings_restore_factory_prompt, new Object[]{strA});
        if (!TextUtils.isEmpty(this.l.getDeviceName()) && productType == 11 && this.l.getDeviceName().contains("HUAWEI CM-R1P")) {
            LogUtil.a("ResetFactoryUtils", "Entering All device names");
            string = this.f.getString(R.string.IDS_settings_restore_factory_prompt, new Object[]{this.f.getString(R.string.IDS_huawei_r1_pro_content)});
        }
        if (this.k == null && (deviceCapability = this.m) != null && deviceCapability.isSupportEsim() && npz.b().h().e) {
            H5ProBridgeManager.getInstance().registerActivityResultCallback(1099, new H5ProActivityResultCallback() { // from class: tpt
                @Override // com.huawei.health.h5pro.core.H5ProActivityResultCallback
                public final void onResult(Intent intent) {
                    this.e.d(intent);
                }
            });
            ReleaseLogUtil.d("R_ResetFactoryUtils", "Entering ResetFactoryGalileoDialog Galileo");
            e(strA);
        } else {
            ReleaseLogUtil.d("R_ResetFactoryUtils", "Entering setResetFactoryDialog");
            c(string);
        }
    }

    /* synthetic */ void d(Intent intent) {
        e(false);
        if (intent == null || !intent.getBooleanExtra("cuccAgreementAgree", false)) {
            return;
        }
        EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.o, this.q);
        if (esimCarrierStrategyB instanceof pxy) {
            c(true);
            ((pxy) esimCarrierStrategyB).a(1099, intent);
        }
    }

    private void c(String str) {
        LogUtil.a("ResetFactoryUtils", "enter setResetFactoryDialog()");
        CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this.f).a(R.string.IDS_settings_restore_factory_settings).a(str).a(R.string.IDS_plugin_menu_reset, new View.OnClickListener() { // from class: tpu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49517b.f(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tpq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("ResetFactoryUtils", "showLoginFail cancel click");
            }
        });
        try {
            try {
                CustomTextAlertDialog customTextAlertDialog = this.r;
                if (customTextAlertDialog != null) {
                    customTextAlertDialog.dismiss();
                }
            } catch (IllegalArgumentException e) {
                LogUtil.e("ResetFactoryUtils", "dismiss dialog error: " + ExceptionUtils.c(e));
            }
        } finally {
            CustomTextAlertDialog customTextAlertDialogB = builderE.b();
            this.r = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.r.show();
        }
    }

    /* synthetic */ void f(View view) {
        LogUtil.a("ResetFactoryUtils", "showLoginFail ok click");
        rdt.c(1);
        if (eey.d(this.l, 112)) {
            l();
        } else {
            a(new Consumer() { // from class: tqe
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.f49527c.d((Boolean) obj);
                }
            });
        }
    }

    /* synthetic */ void d(Boolean bool) {
        if (bool.booleanValue()) {
            r();
        }
    }

    private void r() {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.j("ResetFactoryUtils", "setResetFactoryDialog BT switch is false!");
            qpx.e(this.o, R.string.IDS_hw_health_music_check_bluetooth_connection);
            return;
        }
        if (mga.b(this.l)) {
            b(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 10000);
        } else {
            b(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
        }
        d(false);
        DeviceInfo deviceInfo = this.l;
        if (deviceInfo != null) {
            rdt.c(deviceInfo);
            mhs.a().setSwitchSettingToDb(mip.a(this.l.getDeviceIdentify()), "-1");
        }
    }

    private void e(String str) {
        View viewInflate = View.inflate(this.f, R.layout.dialog_galileo_reset_factory_rule, null);
        a(str, viewInflate);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.reminder_button_all_restores);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.reminder_button_reserved_esim);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.reminder_button_cancel);
        healthTextView.setTextSize(1, 16.0f);
        healthTextView2.setTextSize(1, 16.0f);
        healthTextView3.setTextSize(1, 16.0f);
        v();
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f);
        builder.a(viewInflate);
        healthTextView.setOnClickListener(x());
        healthTextView2.setOnClickListener(u());
        healthTextView3.setOnClickListener(ai());
        CustomAlertDialog customAlertDialogB = builder.b();
        this.k = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.k.show();
        this.g = false;
    }

    private void v() {
        View viewInflate = View.inflate(this.f, R.layout.restore_factory_empty_page_layout, null);
        this.f.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.restore_factory_empty_waiting_content);
        this.t = linearLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.t.setLayoutParams(layoutParams);
        c(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        LinearLayout linearLayout = this.t;
        if (linearLayout == null) {
            LogUtil.e("ResetFactoryUtils", "mEmptyWaitingLayout is null");
        } else if (z) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    private void a(String str, View view) {
        ((HealthTextView) view.findViewById(R.id.reminder_dialog_title)).setText(R.string.IDS_settings_restore_factory_settings);
        ((HealthTextView) view.findViewById(R.id.reminder_device_content_one)).setText(this.o.getResources().getString(R.string.IDS_reset_factory_content_one, str));
        ((HealthTextView) view.findViewById(R.id.reminder_device_content_two)).setText(R.string.IDS_reset_factory_content_two);
        ((HealthTextView) view.findViewById(R.id.reminder_device_content_three)).setText(R.string.IDS_reset_factory_content_three);
    }

    private View.OnClickListener ai() {
        return new View.OnClickListener() { // from class: tqa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49523b.l(view);
            }
        };
    }

    /* synthetic */ void l(View view) {
        LogUtil.a("ResetFactoryUtils", "setResetFactoryGalileoDialog cancel");
        this.k.dismiss();
        this.k = null;
    }

    private View.OnClickListener u() {
        return new View.OnClickListener() { // from class: tqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49528a.h(view);
            }
        };
    }

    /* synthetic */ void h(View view) {
        LogUtil.a("ResetFactoryUtils", "setResetFactoryGalileoDialog Retain Esim Card");
        rdt.c(1);
        this.k.dismiss();
        this.k = null;
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("ResetFactoryUtils", "setResetFactoryGalileoDialog Retain Esim Card Bluetooth Disconnected");
            qpx.e(this.o, R.string.IDS_hw_health_music_check_bluetooth_connection);
        } else {
            a(new Consumer() { // from class: tqb
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.f49524a.e((Boolean) obj);
                }
            });
        }
    }

    /* synthetic */ void e(Boolean bool) {
        if (bool.booleanValue()) {
            b(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
            d(true);
        }
    }

    private View.OnClickListener x() {
        return new View.OnClickListener() { // from class: tqd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49526c.i(view);
            }
        };
    }

    /* synthetic */ void i(View view) {
        LogUtil.a("ResetFactoryUtils", "setResetFactoryGalileoDialog All Resume Response Events");
        rdt.c(1);
        this.k.dismiss();
        this.k = null;
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("ResetFactoryUtils", "setResetFactoryGalileoDialog Recover All Bluetooth Disconnected");
            qpx.e(this.o, R.string.IDS_hw_health_music_check_bluetooth_connection);
        } else {
            a(new Consumer() { // from class: tpr
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.f49515b.a((Boolean) obj);
                }
            });
        }
    }

    /* synthetic */ void a(Boolean bool) {
        LogUtil.a("ResetFactoryUtils", "continueRestore : ", bool);
        if (bool.booleanValue()) {
            pxk.m(this.o);
            oeh oehVarH = npz.b().h();
            if (oehVarH.f44234c != null && pxk.b(oehVarH.f44233b, oehVarH.f44232a)) {
                LogUtil.a("ResetFactoryUtils", " show dialog for cucc esim logout ");
                aa();
            } else if (oehVarH.f44234c != null && pxk.h(oehVarH.f44233b) && pxk.c(oehVarH.f44232a)) {
                ad();
            } else {
                b(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
                d(false);
            }
        }
    }

    private void ad() {
        LogUtil.a("ResetFactoryUtils", "enter showDeleteEsimDialog()");
        String string = this.o.getResources().getString(com.huawei.sim.R.string.IDS_delete_esim_dialog_text);
        String string2 = this.o.getResources().getString(com.huawei.sim.R.string.IDS_plugin_sim_esim_button_cannel);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).a(com.huawei.sim.R.string.IDS_delete_esim_dialog_title).a(string).a(string2, new View.OnClickListener() { // from class: tqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("ResetFactoryUtils", "press cancel button");
            }
        }).b(this.o.getResources().getString(com.huawei.sim.R.string.IDS_plugin_sim_esim_button_delete), new View.OnClickListener() { // from class: tqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49531b.j(view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* synthetic */ void j(View view) {
        b(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
        d(false);
    }

    private void aa() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f);
        builder.a(this.o.getResources().getString(com.huawei.sim.R.string.IDS_restore_factory_esim_logout));
        builder.a(this.o.getResources().getString(com.huawei.sim.R.string.IDS_plugin_sim_esim_logout_ok), new View.OnClickListener() { // from class: tps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49516b.n(view);
            }
        }).d(this.o.getResources().getString(com.huawei.sim.R.string.IDS_device_wear_home_skip_sync_account).toUpperCase(), new View.OnClickListener() { // from class: tqc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49525b.k(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* synthetic */ void n(View view) {
        LogUtil.a("ResetFactoryUtils", "press Positive button go cancel esim");
        q();
    }

    /* synthetic */ void k(View view) {
        LogUtil.a("ResetFactoryUtils", "press Negative button later");
        b(R.string.IDS_settings_restore_factory_settings_progerssdialog_msg, 2000);
        d(false);
    }

    private void l() {
        LogUtil.a("ResetFactoryUtils", "checkEarphoneStateBeforeRestoreFactory in.");
        lxb.c().e(this.l, new EarPhoneResponseCallback() { // from class: tpp.4
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public void onResponse(int i, final edj edjVar) {
                tpp.this.f.runOnUiThread(new Runnable() { // from class: tpp.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        edj edjVar2 = edjVar;
                        if (edjVar2 == null) {
                            LogUtil.j("ResetFactoryUtils", "earPhoneInfo is null");
                            tpp.this.w();
                            return;
                        }
                        boolean z = edjVar2.a() == 1;
                        boolean z2 = edjVar.e() == 3;
                        if (!z || !z2) {
                            tpp.this.w();
                        } else {
                            tpp.this.ae();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        a(new Consumer() { // from class: tqm
            @Override // com.huawei.framework.servicemgr.Consumer
            public final void accept(Object obj) {
                this.f49533c.b((Boolean) obj);
            }
        });
    }

    /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        LogUtil.a("ResetFactoryUtils", "restoreFactoryShowEarphoneDialog in.");
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).a(R.string.IDS_earphone_restore_defaults_title).b(R.string.IDS_earphone_restore_defaults_content).a(R.string.IDS_retry, new View.OnClickListener() { // from class: tpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49521b.e(view);
            }
        }).e(R.string.IDS_earphone_log_collect_ignore_tips, new View.OnClickListener() { // from class: tpx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49520b.g(view);
            }
        }).b();
        this.j = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.j.show();
    }

    /* synthetic */ void e(View view) {
        LogUtil.j("ResetFactoryUtils", "onClick restoreFactoryShowEarphoneDialog PositiveButton");
        this.j.dismiss();
        this.j = null;
        l();
    }

    /* synthetic */ void g(View view) {
        LogUtil.j("ResetFactoryUtils", "onClick restoreFactoryShowEarphoneDialog NegativeButton");
        this.j.dismiss();
        this.j = null;
        ae();
    }

    private void a(Consumer<Boolean> consumer) {
        LogUtil.a("ResetFactoryUtils", "walletCard cloud backup enter");
        WearWalletFactoryUtil wearWalletFactoryUtil = this.f49507a;
        if (wearWalletFactoryUtil == null) {
            consumer.accept(true);
        } else {
            wearWalletFactoryUtil.c(this.l, new AnonymousClass2(wearWalletFactoryUtil, consumer));
        }
    }

    /* JADX INFO: renamed from: tpp$2, reason: invalid class name */
    class AnonymousClass2 implements Consumer<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Consumer f49510a;
        final /* synthetic */ WearWalletFactoryUtil e;

        AnonymousClass2(WearWalletFactoryUtil wearWalletFactoryUtil, Consumer consumer) {
            this.e = wearWalletFactoryUtil;
            this.f49510a = consumer;
        }

        @Override // com.huawei.framework.servicemgr.Consumer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void accept(final Boolean bool) {
            FragmentActivity fragmentActivity = tpp.this.f;
            final WearWalletFactoryUtil wearWalletFactoryUtil = this.e;
            final Consumer consumer = this.f49510a;
            fragmentActivity.runOnUiThread(new Runnable() { // from class: tqn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49536c.c(bool, wearWalletFactoryUtil, consumer);
                }
            });
        }

        /* synthetic */ void c(Boolean bool, WearWalletFactoryUtil wearWalletFactoryUtil, Consumer consumer) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                wearWalletFactoryUtil.e(tpp.this.f, (Consumer<Boolean>) consumer);
            } else {
                consumer.accept(true);
            }
        }
    }

    private void q() {
        final String[] strArrD = pxk.d();
        if (!lsg.d(this.o, strArrD)) {
            LogUtil.j("ResetFactoryUtils", "no permission, need to request");
            xjt.q("no permission, need to request.");
            lsg.a(this.f, strArrD, new PermissionsResultAction() { // from class: tpp.3
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("ResetFactoryUtils", "PermissionsResultAction onGranted: ", strArrD[0]);
                    tpp.this.ac();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.j("ResetFactoryUtils", "PermissionsResultAction onDenied: ", str);
                }
            });
        } else {
            LogUtil.a("ResetFactoryUtils", "have permissions: ", strArrD[0]);
            ac();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        pxk.m(this.o);
        if (pxk.h(pxk.b())) {
            this.i = 0;
        } else if (pxk.h(pxk.c())) {
            this.i = 1;
        } else {
            y();
            return;
        }
        pxn.e().a(CarrierType.CUCC, EsimType.ONE_NUMBER_MULTISIM, CommonUtil.bg() ? BrandType.HUAWEI : BrandType.THIRD);
        EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.o, this.q);
        pxp pxpVar = new pxp();
        pxpVar.i = this.i;
        pxpVar.h = this.i == 0 ? pxk.b() : pxk.c();
        pxpVar.m = new Runnable() { // from class: tpv
            @Override // java.lang.Runnable
            public final void run() {
                this.f49518a.f();
            }
        };
        esimCarrierStrategyB.setRequest(pxpVar);
        esimCarrierStrategyB.authenticate();
    }

    /* synthetic */ void f() {
        b(R.string.sug_his_loading_more, 2000);
    }

    private void d(boolean z) {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("ResetFactoryUtils", "setResetFactoryGalileoDialog Recover All Bluetooth Disconnected");
            qpx.e(this.o, R.string.IDS_hw_health_music_check_bluetooth_connection);
            return;
        }
        LogUtil.a("ResetFactoryUtils", "restoreFactory()");
        if (this.l != null && CommonUtil.ab(BaseApplication.b())) {
            b(this.l);
        } else {
            ReleaseLogUtil.d("R_ResetFactoryUtils", "restoreFactory unPair mDeviceInfo is null");
        }
        this.f49508c.a(this.n, this.q, z);
    }

    private void b(final DeviceInfo deviceInfo) {
        FindNetworkUtils.e(deviceInfo, BaseApplication.b(), new FindNetworkUtils.IFindNetworkCallback() { // from class: tpp.5
            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onSuccess(int i, HashMap<String, Object> map) {
                if (i == 1) {
                    ReleaseLogUtil.d("R_ResetFactoryUtils", "restoreFactory unPair findNetwork");
                    FindNetworkUtils.b(deviceInfo, tpp.this.o);
                } else {
                    LogUtil.j("ResetFactoryUtils", "status err:", Integer.valueOf(i));
                }
            }

            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onFail(String str) {
                LogUtil.j("ResetFactoryUtils", "queryRegisterStatus fail message:", str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, String str) {
        ReleaseLogUtil.d("R_ResetFactoryUtils", "restoreFactoryEnd isSuccess:", Boolean.valueOf(z), " ,msg:", str);
        if (a() != null) {
            if (z) {
                a().onSuccess(0);
            } else {
                a().onFail(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        c(this.f.getString(R.string.IDS_settings_restore_factory_prompt, new Object[]{tqp.a(this.f, this.n)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        int i = message.what;
        if (i != 100006) {
            switch (i) {
                case 33002:
                    p();
                    npz.b().d(this.q);
                    break;
                case 33003:
                case 33004:
                    this.q.removeMessages(33004);
                    e(false);
                    p();
                    npz.b().c((IBaseResponseCallback) null);
                    ab();
                    break;
                case 33005:
                    break;
                case 33006:
                    e(false);
                    p();
                    npz.b().c((IBaseResponseCallback) null);
                    Context context = this.o;
                    qpx.e(context, context.getString(com.huawei.sim.R.string.IDS_card_status_error_tips));
                    ab();
                    break;
                default:
                    ReleaseLogUtil.e("ResetFactoryUtils", "unrecognized message:", Integer.valueOf(message.what));
                    break;
            }
            return;
        }
        e(false);
        p();
        npz.b().c((IBaseResponseCallback) null);
        Context context2 = this.o;
        qpx.e(context2, context2.getString(com.huawei.sim.R.string.IDS_plugin_device_info_fail));
        ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("ResetFactoryUtils", " queryMultiSimServiceStatus result = ", Integer.valueOf(i));
        if (i == 1000) {
            pxn.e().b(this.o, this.q).getEsimStatus();
            return;
        }
        this.g = false;
        c(false);
        y();
        ReleaseLogUtil.a("ResetFactoryUtils", "auth fail: ", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        LogUtil.a("ResetFactoryUtils", "handleOpenResult: ", Integer.valueOf(i));
        p();
        if (i != 0) {
            c(false);
            Context context = this.o;
            qpx.e(context, context.getResources().getString(com.huawei.sim.R.string.IDS_oversea_es_load_fail));
        } else {
            HandlerExecutor.b(new Runnable() { // from class: tpz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49522c.i();
                }
            });
            this.g = true;
        }
    }

    /* synthetic */ void i() {
        b(R.string.sug_his_loading_more, 2000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        ReleaseLogUtil.d("ResetFactoryUtils", "handleQueryResult code = ", Integer.valueOf(i), ", hasEnteredEsimAccountMgmt : ", Boolean.valueOf(this.g));
        if (i == 1000) {
            this.g = false;
            oeh oehVarH = npz.b().h();
            if (CommonUtil.bg() && pxk.h(oehVarH.f44233b) && this.i == 0 && pxk.b(oehVarH.f44232a) && pxk.h(pxk.b()) && pxk.h(pxk.c())) {
                this.i = 1;
                EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.o, this.q);
                pxp pxpVar = new pxp();
                pxpVar.i = this.i;
                pxpVar.h = pxk.c();
                pxpVar.m = new Runnable() { // from class: tqh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49529b.h();
                    }
                };
                esimCarrierStrategyB.setRequest(pxpVar);
                esimCarrierStrategyB.authenticate();
                return;
            }
            c(false);
            FragmentActivity fragmentActivity = this.f;
            pxk.d(fragmentActivity, fragmentActivity.getString(R.string.IDS_settings_restore_factory_settings), new View.OnClickListener() { // from class: tqi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49530a.b(view);
                }
            });
            return;
        }
        if (!this.g && (i == 1200 || i == -1011)) {
            s();
            return;
        }
        this.g = false;
        c(false);
        y();
    }

    /* synthetic */ void h() {
        b(R.string.sug_his_loading_more, 2000);
    }

    /* synthetic */ void b(View view) {
        LogUtil.a("ResetFactoryUtils", "press Positive button");
        d(false);
    }

    private void s() {
        HandlerExecutor.b(new Runnable() { // from class: tpw
            @Override // java.lang.Runnable
            public final void run() {
                this.f49519b.g();
            }
        });
        z();
    }

    /* synthetic */ void g() {
        b(R.string.sug_his_loading_more, 2000);
    }

    private void z() {
        LogUtil.a("ResetFactoryUtils", "startEsimAccountManageActivity");
        try {
            Intent intent = new Intent(this.f, (Class<?>) EsimAccountManageActivity.class);
            intent.putExtra("esim_auth_method", CommonUtil.bg() ? 2 : 1);
            intent.putExtra("simImsi", this.i == 0 ? pxk.b() : pxk.c());
            intent.putExtra("MultiSimSlotId", this.i);
            intent.putExtra("isFinishSdk", false);
            this.f.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.huawei.ui.homewear21.home.utils.ResetFactoryUtils$6
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(LifecycleOwner lifecycleOwner) {
                    super.onResume(lifecycleOwner);
                    if (this.f26354b.g) {
                        this.f26354b.f.getLifecycle().removeObserver(this);
                        ReleaseLogUtil.d("ResetFactoryUtils", "onResume hasEnteredEsimAccountMgmt, get esim open result again");
                        this.f26354b.p();
                        pxn.e().b(this.f26354b.o, this.f26354b.q).getEsimStatus();
                    }
                }
            });
            iov.d(BaseApplication.b(), intent);
            this.g = true;
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("ResetFactoryUtils", "startEsimAccountManageActivity ActivityNotFoundException");
            this.g = false;
            c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("ResetFactoryUtils", "removeTimeOutMessage");
        Handler handler = this.q;
        if (handler != null && handler.hasMessages(100003)) {
            this.q.removeMessages(100003);
        }
        Handler handler2 = this.q;
        if (handler2 != null && handler2.hasMessages(100006)) {
            this.q.removeMessages(100006);
        }
        Handler handler3 = this.q;
        if (handler3 == null || !handler3.hasMessages(AdapterWithBottomView.TYPE_BOTTOM)) {
            return;
        }
        this.q.removeMessages(AdapterWithBottomView.TYPE_BOTTOM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        LogUtil.a("ResetFactoryUtils", "removeAllMessage");
        p();
        Handler handler = this.q;
        if (handler != null) {
            handler.removeMessages(100001);
            this.q.removeMessages(ErrorCode.HWID_IS_STOPED);
            this.q.removeMessages(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
        }
    }

    public void d() {
        LogUtil.a("ResetFactoryUtils", 1, "ResetFactoryUtils", "reset factory success");
        this.f49508c.c();
        e();
        lmf.d().c(LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1011));
        if (this.e) {
            o();
        }
    }

    public void o() {
        ReleaseLogUtil.d("ResetFactoryUtils", 1, "ResetFactoryUtils", "enter updateArkUi");
    }

    public void j() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f);
        builder.b(R.string.IDS_factory_reset_net_tip);
        builder.c(R.string.IDS_sync_account_know, new View.OnClickListener() { // from class: tqf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("ResetFactoryUtils", "factory reset no satisfation condition");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    public void e() {
        LogUtil.a("ResetFactoryUtils", 0, "ResetFactoryUtils", "Enter clearMessageCenterLocalDeviceMessage");
        final MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageCenterApi.getMessages("device", "device_type_connected", new IBaseResponseCallback() { // from class: tpp.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0 || obj == null) {
                    return;
                }
                List list = (List) obj;
                LogUtil.a("ResetFactoryUtils", 0, "ResetFactoryUtils", "clearMessageCenterLocalDeviceMessage, responseMessageList.size() is ", Integer.valueOf(list.size()));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    messageCenterApi.deleteMessage(((MessageObject) it.next()).getMsgId());
                }
            }
        });
        messageCenterApi.getMessages("device", "device_ota", new IBaseResponseCallback() { // from class: tpp.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && obj != null && njy.b(obj, MessageObject.class)) {
                    List list = (List) obj;
                    LogUtil.a("ResetFactoryUtils", 0, "ResetFactoryUtils", "clearMessageCenterLocalDeviceMessage otaMessageList.size() is ", Integer.valueOf(list.size()));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        messageCenterApi.deleteMessage(((MessageObject) it.next()).getMsgId());
                    }
                    LogUtil.a("ResetFactoryUtils", 0, "ResetFactoryUtils", "Leave clearMessageCenterLocalDeviceMessage");
                }
            }
        });
        if (this.l != null) {
            lvb.e().a(this.l.getDeviceName());
            rcw.b(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).b(this.l);
        } else {
            LogUtil.j("ResetFactoryUtils", "mCurrentDeviceInfo is null");
        }
        this.f.finish();
    }

    public void b(int i, int i2) {
        FragmentActivity fragmentActivity = this.f;
        if (fragmentActivity == null || fragmentActivity.isFinishing()) {
            LogUtil.j("ResetFactoryUtils", 0, "ResetFactoryUtils", "activity is finish");
            return;
        }
        if (this.s != null) {
            LogUtil.j("ResetFactoryUtils", 0, "ResetFactoryUtils", "mLoadingDialog is not null");
            return;
        }
        new CommonDialog21(this.o, R.style.app_update_dialogActivity);
        CommonDialog21 commonDialog21B = CommonDialog21.b(this.f);
        this.s = commonDialog21B;
        commonDialog21B.b(this.f.getString(i));
        this.s.c();
        Message messageObtainMessage = this.q.obtainMessage();
        messageObtainMessage.what = 11;
        messageObtainMessage.obj = false;
        this.q.sendMessageDelayed(messageObtainMessage, i2);
    }

    public void e(boolean z) {
        CommonDialog21 commonDialog21;
        if (z) {
            qpx.e(this.o, R.string.IDS_plugin_menu_reset_failed);
        }
        if (this.f.isFinishing() || this.f.isDestroyed() || (commonDialog21 = this.s) == null || !commonDialog21.isShowing()) {
            return;
        }
        try {
            this.s.cancel();
        } catch (IllegalArgumentException e) {
            LogUtil.e("ResetFactoryUtils", "stopDialogAnimation error: ", ExceptionUtils.c(e));
        } finally {
            this.s = null;
            LogUtil.a("ResetFactoryUtils", "destroy mLoadingDialog21");
        }
    }

    public void m() {
        this.o = BaseApplication.b();
    }

    public FactoryRestCallback a() {
        return this.h;
    }

    public void e(FactoryRestCallback factoryRestCallback) {
        this.h = factoryRestCallback;
    }

    public void b(int i, int i2, Intent intent) {
        WearWalletFactoryUtil wearWalletFactoryUtil = this.f49507a;
        if (wearWalletFactoryUtil != null) {
            wearWalletFactoryUtil.e(i, i2, intent);
        }
    }
}
