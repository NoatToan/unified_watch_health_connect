package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homewear21.R;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes17.dex */
public class rrb extends FeatureBaseStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f47587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthProgressBar f47588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f47589c;
    private LinearLayout d;
    private ImageView e;
    private CustomAlertDialog f;
    private HealthTextView g;
    private HealthTextView h;
    private CustomAlertDialog i;
    private HealthButton j;
    private CustomAlertDialog k;
    private Handler n;
    private CustomAlertDialog o;

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("FindHeadphoneStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        final Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            return false;
        }
        this.n = new Handler(Looper.getMainLooper()) { // from class: rrb.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 1040 || rrb.this.o == null) {
                    return;
                }
                rrb.this.o.dismiss();
                rrb rrbVar = rrb.this;
                rrbVar.d(activity, rrbVar.mDeviceInfo, ((Integer) message.obj).intValue());
            }
        };
        b(activity, this.mDeviceInfo, 115, false);
        return true;
    }

    public void b(final Activity activity, final DeviceInfo deviceInfo, final int i, final boolean z) {
        LogUtil.a("FindHeadphoneStrategy", "checkEarphoneState in. ");
        a(activity);
        lxb.c().e(deviceInfo, new EarPhoneResponseCallback() { // from class: rrg
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public final void onResponse(int i2, edj edjVar) {
                this.f47607c.d(activity, i, z, deviceInfo, i2, edjVar);
            }
        });
    }

    /* synthetic */ void d(Activity activity, int i, boolean z, DeviceInfo deviceInfo, int i2, edj edjVar) {
        if (edjVar == null || TextUtils.isEmpty(edjVar.d())) {
            c(activity);
            return;
        }
        if (lxb.c().b(edjVar.d())) {
            LogUtil.a("FindHeadphoneStrategy", "checkEarphoneState in. type: ", Integer.valueOf(i));
            if (i == 115) {
                c(activity, edjVar);
                return;
            }
            return;
        }
        d(activity, edjVar, z, deviceInfo, i);
    }

    /* JADX INFO: renamed from: rrb$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f47598b;

        AnonymousClass5(Activity activity) {
            this.f47598b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            rrb.this.f47588b.setVisibility(8);
            rrb.this.g.setVisibility(0);
            rrb.this.h.setVisibility(0);
            rrb.this.j.setVisibility(8);
            rrb.this.f47589c.setVisibility(8);
            rrb.this.d.setVisibility(8);
            rrb.this.g.setText(R.string.IDS_ear_phone_pair_failed_not_found_tip);
            rrb.this.h.setText(R.string.IDS_ear_phone_pair_failed_tip);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f47598b);
            if (rrb.this.f47587a.getParent() != null) {
                ViewParent parent = rrb.this.f47587a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(rrb.this.f47587a);
                }
            }
            builder.a(rrb.this.f47587a);
            builder.a(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: rrl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.j("FindHeadphoneStrategy", "onClick NegativeButton");
                }
            });
            rrb.this.i = builder.b();
            rrb.this.i.setCancelable(false);
            rrb.this.i.show();
        }
    }

    private void c(Activity activity) {
        LogUtil.a("FindHeadphoneStrategy", "showEarphoneNotFoundDialog. ");
        activity.runOnUiThread(new AnonymousClass5(activity));
    }

    private void a(Activity activity) {
        View viewInflate = View.inflate(activity, R.layout.wear_home_earphone_dialog_layout, null);
        this.f47587a = viewInflate;
        HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.earphone_pair_dialog_loading_image);
        this.f47588b = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        ImageView imageView = (ImageView) this.f47587a.findViewById(R.id.earphone_pair_dialog_image);
        this.e = imageView;
        imageView.setBackgroundResource(R.drawable.icon_pair_watch_earphone);
        this.g = (HealthTextView) this.f47587a.findViewById(R.id.earphone_pair_dialog_title);
        this.h = (HealthTextView) this.f47587a.findViewById(R.id.earphone_pair_dialog_tip);
        this.d = (LinearLayout) this.f47587a.findViewById(R.id.earphone_dialog_btn_layout);
        this.j = (HealthButton) this.f47587a.findViewById(R.id.earphone_dialog_btn_positive);
        this.f47589c = (HealthButton) this.f47587a.findViewById(R.id.earphone_dialog_btn_negative);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity, edj edjVar, boolean z, DeviceInfo deviceInfo, int i) {
        if (!c(edjVar)) {
            c(activity);
            return;
        }
        if (!a(edjVar)) {
            d(activity, deviceInfo, i);
        } else if (z) {
            b(activity, deviceInfo, i);
        } else {
            d(activity, deviceInfo, edjVar, i);
        }
    }

    private boolean c(edj edjVar) {
        return (edjVar.b() & 1) > 0;
    }

    /* JADX INFO: renamed from: rrb$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f47596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f47597c;
        final /* synthetic */ Activity e;

        AnonymousClass4(Activity activity, int i, DeviceInfo deviceInfo) {
            this.e = activity;
            this.f47596b = i;
            this.f47597c = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            rrb.this.f47588b.setVisibility(0);
            rrb.this.g.setVisibility(0);
            rrb.this.h.setVisibility(8);
            rrb.this.j.setVisibility(8);
            rrb.this.f47589c.setVisibility(8);
            rrb.this.d.setVisibility(8);
            rrb.this.g.setText(R.string.IDS_blite_guide_paire_opt_title);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.e);
            if (rrb.this.o != null) {
                rrb.this.o.dismiss();
            }
            rrb.this.o = builder.b();
            if (rrb.this.f47587a.getParent() != null) {
                ViewParent parent = rrb.this.f47587a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(rrb.this.f47587a);
                }
            }
            builder.a(rrb.this.f47587a);
            builder.a(R.string.IDS_ear_phone_pair_close, new DialogInterface.OnClickListener() { // from class: rrp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f47621a.a(dialogInterface, i);
                }
            });
            rrb.this.o.setCancelable(false);
            rrb.this.o.show();
            if (rrb.this.n != null) {
                Message messageObtainMessage = rrb.this.n.obtainMessage();
                messageObtainMessage.what = 1040;
                messageObtainMessage.obj = Integer.valueOf(this.f47596b);
                rrb.this.n.sendMessageDelayed(messageObtainMessage, 60000L);
            }
            lxb lxbVarC = lxb.c();
            final DeviceInfo deviceInfo = this.f47597c;
            final Activity activity = this.e;
            final int i = this.f47596b;
            lxbVarC.c(deviceInfo, new EarPhoneResponseCallback() { // from class: rrm
                @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
                public final void onResponse(int i2, edj edjVar) {
                    this.f47616b.b(activity, i, deviceInfo, i2, edjVar);
                }
            });
        }

        /* synthetic */ void a(DialogInterface dialogInterface, int i) {
            LogUtil.j("FindHeadphoneStrategy", "onClick showEarphonePairingDialog NegativeButton");
            rrb.this.o.dismiss();
            rrb.this.o = null;
        }

        /* synthetic */ void b(Activity activity, int i, DeviceInfo deviceInfo, int i2, edj edjVar) {
            rrb.this.d(activity, i2, edjVar, i, deviceInfo);
        }
    }

    private void b(Activity activity, DeviceInfo deviceInfo, int i) {
        LogUtil.a("FindHeadphoneStrategy", "showEarphonePairingDialog. ");
        activity.runOnUiThread(new AnonymousClass4(activity, i, deviceInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity, int i, edj edjVar, int i2, DeviceInfo deviceInfo) {
        Handler handler = this.n;
        if (handler != null) {
            handler.removeMessages(1040);
        }
        CustomAlertDialog customAlertDialog = this.o;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            LogUtil.j("FindHeadphoneStrategy", "EarphonePairingDialog is not showing. ");
            return;
        }
        this.o.dismiss();
        this.o = null;
        if (i == 1) {
            LogUtil.a("FindHeadphoneStrategy", "earphonePairCallBack in. type: ", Integer.valueOf(i2));
            if (i2 == 115) {
                c(activity, edjVar);
                return;
            }
            return;
        }
        d(activity, deviceInfo, i2);
    }

    /* JADX INFO: renamed from: rrb$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f47590a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f47592c;
        final /* synthetic */ DeviceInfo e;

        AnonymousClass1(Activity activity, DeviceInfo deviceInfo, int i) {
            this.f47590a = activity;
            this.e = deviceInfo;
            this.f47592c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            rrb.this.e(this.f47590a);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f47590a);
            rrb.this.k = builder.b();
            if (rrb.this.f47587a.getParent() != null) {
                ViewParent parent = rrb.this.f47587a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(rrb.this.f47587a);
                }
            }
            builder.a(rrb.this.f47587a);
            HealthButton healthButton = rrb.this.j;
            final DeviceInfo deviceInfo = this.e;
            final Activity activity = this.f47590a;
            final int i = this.f47592c;
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: rro
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47619a.e(deviceInfo, activity, i, view);
                }
            });
            rrb.this.f47589c.setOnClickListener(new View.OnClickListener() { // from class: rrn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47618a.b(view);
                }
            });
            rrb.this.k.setCancelable(false);
            rrb.this.k.show();
        }

        /* synthetic */ void e(final DeviceInfo deviceInfo, final Activity activity, final int i, View view) {
            LogUtil.j("FindHeadphoneStrategy", "onClick showEarphonePairFailedDialog PositiveButton");
            rrb.this.k.dismiss();
            lxb.c().e(deviceInfo, new EarPhoneResponseCallback() { // from class: rrq
                @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
                public final void onResponse(int i2, edj edjVar) {
                    this.d.b(activity, deviceInfo, i, i2, edjVar);
                }
            });
        }

        /* synthetic */ void b(Activity activity, DeviceInfo deviceInfo, int i, int i2, edj edjVar) {
            rrb.this.d(activity, edjVar, true, deviceInfo, i);
        }

        /* synthetic */ void b(View view) {
            LogUtil.j("FindHeadphoneStrategy", "onClick showEarphonePairFailedDialog NegativeButton");
            rrb.this.k.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity, DeviceInfo deviceInfo, int i) {
        LogUtil.a("FindHeadphoneStrategy", "showEarphonePairFailedDialog. ");
        activity.runOnUiThread(new AnonymousClass1(activity, deviceInfo, i));
    }

    private void d(final Activity activity, final DeviceInfo deviceInfo, final edj edjVar, final int i) {
        LogUtil.a("FindHeadphoneStrategy", "showEarphonePairDialog. ");
        activity.runOnUiThread(new Runnable() { // from class: rrj
            @Override // java.lang.Runnable
            public final void run() {
                this.f47612a.c(edjVar, activity, deviceInfo, i);
            }
        });
    }

    /* synthetic */ void c(edj edjVar, final Activity activity, final DeviceInfo deviceInfo, final int i) {
        this.f47588b.setVisibility(8);
        this.g.setVisibility(0);
        this.g.setText(edjVar.c());
        this.h.setVisibility(8);
        this.j.setVisibility(8);
        this.f47589c.setVisibility(8);
        this.d.setVisibility(8);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(activity);
        CustomAlertDialog customAlertDialog = this.f;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        this.f = builder.b();
        if (this.f47587a.getParent() != null) {
            ViewParent parent = this.f47587a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f47587a);
            }
        }
        builder.a(this.f47587a);
        builder.d(R.string.IDS_blite_guide_title, new DialogInterface.OnClickListener() { // from class: rri
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f47610b.d(activity, deviceInfo, i, dialogInterface, i2);
            }
        });
        builder.a(R.string.IDS_settings_button_cancal_ios_btn, new DialogInterface.OnClickListener() { // from class: rrk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LogUtil.j("FindHeadphoneStrategy", "onClick showEarphonePairDialog NegativeButton");
            }
        });
        this.f.setCancelable(false);
        this.f.show();
    }

    /* synthetic */ void d(Activity activity, DeviceInfo deviceInfo, int i, DialogInterface dialogInterface, int i2) {
        this.f.dismiss();
        b(activity, deviceInfo, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Activity activity) {
        this.j = (HealthButton) this.f47587a.findViewById(R.id.earphone_dialog_btn_positive);
        this.f47589c = (HealthButton) this.f47587a.findViewById(R.id.earphone_dialog_btn_negative);
        this.d.setVisibility(0);
        this.d.setOrientation(0);
        if (LanguageUtil.bc(activity)) {
            LogUtil.a("FindHeadphoneStrategy", "language444 in:");
            this.j = (HealthButton) this.f47587a.findViewById(R.id.earphone_dialog_btn_negative);
            this.f47589c = (HealthButton) this.f47587a.findViewById(R.id.earphone_dialog_btn_positive);
            this.d.setOrientation(1);
            this.d.setShowDividers(0);
        }
        this.f47588b.setVisibility(8);
        this.g.setVisibility(0);
        this.h.setVisibility(0);
        this.g.setText(R.string.IDS_ear_phone_pair_guide_error);
        this.h.setText(R.string.IDS_ear_phone_pair_failed_reconnect_tip);
        this.j.setText(R.string.IDS_btsdk_confirm_repair);
        this.f47589c.setText(R.string.IDS_settings_button_cancal_ios_btn);
        this.j.setVisibility(0);
        this.f47589c.setVisibility(0);
    }

    private boolean a(edj edjVar) {
        return (edjVar.a() == 1) && (edjVar.e() != 0);
    }

    private void c(final Activity activity, final edj edjVar) {
        LogUtil.a("FindHeadphoneStrategy", "startFindEarphonePage enter");
        String strJ = lvi.j(this.mDeviceInfo.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            LogUtil.e("FindHeadphoneStrategy", "startFindEarphonePage uuid is null!");
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.e("FindHeadphoneStrategy", "startFindEarphonePage descriptionInfo or getWearDeviceInfo is null!");
            return;
        }
        final String strAj = pluginInfoByUuid.i().aj();
        final String strC = tqp.c(pluginInfoByUuid);
        LogUtil.a("FindHeadphoneStrategy", "startFindEarphonePage earPhoneProductId: ", strC);
        if (TextUtils.isEmpty(strAj)) {
            LogUtil.j("FindHeadphoneStrategy", "startFindEarphonePage earPhoneProductId isEmpty");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: rrh
                @Override // java.lang.Runnable
                public final void run() {
                    rrb.a(strAj, edjVar, strC, activity);
                }
            });
        }
    }

    static /* synthetic */ void a(String str, edj edjVar, String str2, Activity activity) {
        ddp.a().initAudioDeviceKitAdapter(BaseApplication.getContext());
        Intent intent = new Intent();
        intent.setData(Uri.parse(str));
        Bundle bundle = new Bundle();
        bundle.putString("mac", edjVar.d());
        bundle.putString("deviceName", edjVar.c());
        bundle.putString("productId", str2);
        intent.putExtras(bundle);
        LogUtil.a("FindHeadphoneStrategy", "startFindEarphonePage");
        ddp.a().launchActivity(activity, intent);
    }
}
