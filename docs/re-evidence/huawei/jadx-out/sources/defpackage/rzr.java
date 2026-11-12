package defpackage;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;
import health.compact.a.KeyValDbManager;
import health.compact.a.Utils;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class rzr extends BaseFeatureItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f47885a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomAlertDialog f47886c;
    private DeviceInfo e;

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public boolean isNeedUpdate() {
        return true;
    }

    public rzr(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void isSupportFeature(DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        if (deviceInfo instanceof CloudDeviceInfo) {
            featureSupportCallback.success(false);
        } else {
            lss.a(this.featureSupportApi, new Consumer() { // from class: rzt
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    featureSupportCallback.success(true);
                }
            });
        }
    }

    private boolean c(DeviceInfo deviceInfo) {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("is_support_dfx_status");
        boolean zEquals = "true".equals(strC);
        LogUtil.a("BetaFeedbackItem", "dfxStatus = ", strC);
        return Utils.o() && (eey.d(deviceInfo, 34) && lws.c(BaseApplication.getContext()).d(deviceInfo.getDeviceIdentify()) && zEquals);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view = this.f47885a;
        if (view != null) {
            return view;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_device_feature, viewGroup, false);
        this.f47885a = viewInflate;
        a(viewInflate);
        return this.f47885a;
    }

    private void a(View view) {
        if (view == null) {
            return;
        }
        this.f47885a = view;
        DeviceInfo deviceInfo = this.e;
        b((deviceInfo == null || !c(deviceInfo)) ? 8 : 0);
        qsp.e((TextView) qsp.a(view, R.id.tab_title), R.string.ids_wear_home_beta_feedback);
        qsp.e((ImageView) qsp.a(view, R.id.device_item_inco), R.mipmap.device_beta_suggestions);
        view.setOnClickListener(new qte(new View.OnClickListener() { // from class: rzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.b(view2);
            }
        }));
    }

    /* synthetic */ void b(View view) {
        DeviceInfo deviceInfo = this.e;
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_device_pair_connect_detail);
        } else if (Utils.o()) {
            LogUtil.a("BetaFeedbackItem", "jumpToFeaturePage betaFeedbackLayout");
            rpq.c(FeatureType.FEEDBACK).jumpToFeaturePage(this.e, new SimpleChain.Emitter() { // from class: rzv
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public final void onSuccess(Object[] objArr) {
                    LogUtil.a("BetaFeedbackItem", "jumpToFeaturePage onSuccess");
                }
            });
        } else {
            b();
        }
    }

    public void b() {
        CustomAlertDialog customAlertDialog = this.f47886c;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            this.f47886c.dismiss();
        }
        if (LoginInit.checkBaseServiceModel()) {
            LogUtil.j("BetaFeedbackItem", "showFindDialog checkBaseServiceModel");
            return;
        }
        View viewInflate = View.inflate(this.activity, com.huawei.ui.homewear21.R.layout.feedback_device_dialog_layout, null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(com.huawei.ui.homewear21.R.id.beta_feedBack_layout);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(com.huawei.ui.homewear21.R.id.find_feedback_log_layout);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: rzn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47883a.e(view);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: rzq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.activity);
        builder.d(R.string.IDS_arkui_home_feedback_title);
        builder.e(17);
        builder.a(viewInflate);
        builder.a(com.huawei.ui.homewear21.R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: rzo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f47884a.d(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.f47886c = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.f47886c.c(qrr.g(), 1);
        this.f47886c.setWindowGravityParams(17);
        this.f47886c.show();
    }

    /* synthetic */ void e(View view) {
        LogUtil.a("BetaFeedbackItem", "jumpToFeaturePage betaFeedbackLayout");
        rpq.c(FeatureType.FEEDBACK).jumpToFeaturePage(this.e, new SimpleChain.Emitter() { // from class: rzu
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("BetaFeedbackItem", "jumpToFeaturePage onSuccess");
            }
        });
        this.f47886c.dismiss();
    }

    /* synthetic */ void d(View view) {
        LogUtil.a("BetaFeedbackItem", "jumpToFeaturePage logFeedbackLayout");
        rpq.c(FeatureType.LOG_UPLOAD).jumpToFeaturePage(this.e, new SimpleChain.Emitter() { // from class: rzp
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("BetaFeedbackItem", "jumpToFeaturePage onSuccess");
            }
        });
        this.f47886c.dismiss();
    }

    /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        this.f47886c.dismiss();
    }

    @Override // com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem
    public void updateDevice(DeviceInfo deviceInfo) {
        this.e = deviceInfo;
        LogUtil.a("BetaFeedbackItem", "updateDevice name:", deviceInfo == null ? "nullDevice" : deviceInfo.getDeviceName());
        if (deviceInfo == null) {
            LogUtil.a("BetaFeedbackItem", "updateDevice deviceInfo is null");
        } else {
            e(deviceInfo, c(deviceInfo));
        }
    }

    private void e(final DeviceInfo deviceInfo, final boolean z) {
        if (this.activity == null || this.activity.isDestroyed() || this.activity.isFinishing()) {
            LogUtil.a("BetaFeedbackItem", "activity is null or finish");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: rzw
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(deviceInfo, z);
                }
            });
        }
    }

    /* synthetic */ void a(DeviceInfo deviceInfo, boolean z) {
        if (!mig.d(this.e, deviceInfo)) {
            LogUtil.a("BetaFeedbackItem", "updateItemView different device");
        } else {
            b(z ? 0 : 8);
        }
    }

    private void b(int i) {
        View view = this.f47885a;
        if (view != null) {
            view.setVisibility(i);
        } else {
            LogUtil.a("BetaFeedbackItem", "updateItemView itemView is null");
        }
    }
}
