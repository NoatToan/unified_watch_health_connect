package com.xiaomi.hm.health.thirdbind.wechat;

import android.app.Fragment;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.third.wechat.ui.LoadingView;
import com.huami.third.wechat.ui.WeChatParams;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.xiaomi.hm.health.thirdbind.wechat.WeChatParamsImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0002/0B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cRF\u0010(\u001a2\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00060 8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/wechat/WeChatParamsImpl;", "Lcom/huami/third/wechat/ui/WeChatParams;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "qrCode", "", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "getAppID", "()Ljava/lang/String;", SDKConstants.PARAM_APP_ID, "Lcom/huami/watch/transport/Transporter;", "c", "Lcom/huami/watch/transport/Transporter;", "mTransporter", "Lcom/huami/watch/transport/Transporter$DataSendResultCallback;", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/transport/Transporter$DataSendResultCallback;", "mSendResultCallback", "", "getBindSuccessImg", "()Ljava/lang/Integer;", "bindSuccessImg", "Lcom/huami/third/wechat/ui/LoadingView;", "getLoadingView", "()Lcom/huami/third/wechat/ui/LoadingView;", "getLoadingView$annotations", "()V", "loadingView", "Lkotlin/Function2;", "Landroidx/fragment/app/FragmentActivity;", "Lkotlin/ParameterName;", "name", "activity", "content", "getSendQRToWatchFunc", "()Lkotlin/jvm/functions/Function2;", "sendQRToWatchFunc", "", "getSupportWatch", "()Z", "supportWatch", "<init>", "(Landroid/content/Context;)V", "Companion", "SendCallback", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WeChatParamsImpl implements WeChatParams {

    @NotNull
    private static final String e = "wechat-bind-loading";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String appID;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Transporter mTransporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Transporter.DataSendResultCallback mSendResultCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/wechat/WeChatParamsImpl$SendCallback;", "Lcom/huami/watch/transport/Transporter$DataSendResultCallback;", "Lcom/huami/watch/transport/DataTransportResult;", "result", "", "onResultBack", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SendCallback implements Transporter.DataSendResultCallback {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        public SendCallback(@NotNull Context context) {
            this.context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(SendCallback sendCallback) {
            Toast.makeText(sendCallback.getContext(), R.string.show_qr_success, 0).show();
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(@Nullable DataTransportResult result) {
            if (result != null && result.getResultCode() == 0) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: xn8
                    @Override // java.lang.Runnable
                    public final void run() {
                        WeChatParamsImpl.SendCallback.b(this.a);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "activity", "", "content", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<FragmentActivity, String, Unit> {
        public a() {
            super(2);
        }

        public final void a(@NotNull FragmentActivity fragmentActivity, @NotNull String str) {
            WeChatParamsImpl.this.a(fragmentActivity, str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FragmentActivity fragmentActivity, String str) {
            a(fragmentActivity, str);
            return Unit.INSTANCE;
        }
    }

    public WeChatParamsImpl(@NotNull Context context) {
        String appId;
        this.context = context;
        TpaConfig tpaConfig = Utils.getTpaConfigs(context).get("wechat");
        String str = "";
        if (tpaConfig != null && (appId = tpaConfig.getAppId()) != null) {
            str = appId;
        }
        this.appID = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, String qrCode) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null || !currentDevice.isConnected()) {
            Toast.makeText(context, R.string.device_disconnected, 0).show();
            return;
        }
        if (TextUtils.isEmpty(qrCode)) {
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("qr_code", qrCode);
        if (this.mTransporter == null) {
            this.mTransporter = Transporter.get(context.getApplicationContext(), "com.huami.watch.companion");
        }
        if (this.mSendResultCallback == null) {
            this.mSendResultCallback = new SendCallback(context);
        }
        Transporter transporter = this.mTransporter;
        if (transporter == null) {
            return;
        }
        transporter.send(CompanionModule.ACTION_SYNC_SHOW_QR, dataBundle, this.mSendResultCallback);
    }

    public static /* synthetic */ void getLoadingView$annotations() {
    }

    @Override // com.huami.third.wechat.ui.WeChatParams
    @NotNull
    public String getAppID() {
        return this.appID;
    }

    @Override // com.huami.third.wechat.ui.WeChatParams
    @Nullable
    public Integer getBindSuccessImg() {
        return null;
    }

    @Override // com.huami.third.wechat.ui.WeChatParams
    @NotNull
    public LoadingView getLoadingView() {
        return new LoadingView() { // from class: com.xiaomi.hm.health.thirdbind.wechat.WeChatParamsImpl$loadingView$1
            @Override // com.huami.third.wechat.ui.LoadingView
            public void hideLoading(@NotNull FragmentActivity activity) {
                Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("wechat-bind-loading");
                if (fragmentFindFragmentByTag != null) {
                    ((AlertDialogFragment) fragmentFindFragmentByTag).dismissAllowingStateLoss();
                }
            }

            @Override // com.huami.third.wechat.ui.LoadingView
            public void showLoading(@NotNull FragmentActivity activity) {
                hideLoading(activity);
                AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(2);
                if (alertDialogFragmentNewInstance == null) {
                    return;
                }
                alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.loading));
                alertDialogFragmentNewInstance.setCancelable(true);
                alertDialogFragmentNewInstance.show(activity.getFragmentManager(), "wechat-bind-loading");
            }
        };
    }

    @Override // com.huami.third.wechat.ui.WeChatParams
    @NotNull
    public Function2<FragmentActivity, String, Unit> getSendQRToWatchFunc() {
        return new a();
    }

    @Override // com.huami.third.wechat.ui.WeChatParams
    public boolean getSupportWatch() {
        return DeviceUtil.isRomSupportShowQR(this.context);
    }
}
