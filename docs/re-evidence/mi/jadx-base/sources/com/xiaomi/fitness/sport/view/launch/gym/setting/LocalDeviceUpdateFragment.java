package com.xiaomi.fitness.sport.view.launch.gym.setting;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.sport.bean.DeviceVersionInfo;
import com.xiaomi.fitness.sport.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.view.launch.gym.setting.LocalDeviceUpdateFragment;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.a6l;
import defpackage.bg4;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.na4;
import defpackage.qln;
import defpackage.wc0;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0082\u00012\u00020\u0001:\u0006\u0083\u0001\u0084\u0001\u0082\u0001B\b¢\u0006\u0005\b\u0081\u0001\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\n\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J-\u0010!\u001a\u00020 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u0004J\r\u0010+\u001a\u00020\u0002¢\u0006\u0004\b+\u0010\u0004J!\u0010.\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u001f\u00104\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010G\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010;\u001a\u0004\bH\u0010=\"\u0004\bI\u0010?R\"\u0010J\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010V\u001a\u00020U8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010T\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\"\u0010j\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010q\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0017\u0010x\u001a\u00020w8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u007f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "", "setListener", "()V", "", "version", "log", "", "isUpdating", "handleNewVersion", "(Ljava/lang/String;Ljava/lang/String;Z)V", "checkUpdateStatusScheduled", "getVersionStatus", "Lcom/xiaomi/fitness/sport/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "versionInfo", "handleProgress", "(Lcom/xiaomi/fitness/sport/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;)V", "startUpdate", "Landroid/os/Handler;", "handler", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment$ProgressCallback;", "callback", "checkStatus", "(Landroid/os/Handler;Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment$ProgressCallback;)V", "startDownload", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", LifecycleConstantKt.ON_DESTROY, "stopTimer", "Landroid/os/Message;", "msg", "handleMessage2", "(Landroid/content/Context;Landroid/os/Message;)V", "", "code", "", PluginDeviceInfo.FICONOFFLINE, "startDownloadFailed", "(ILjava/lang/Throwable;)V", "Lqln;", "mBinding", "Lqln;", "Landroid/widget/TextView;", "mUpgradeBtn", "Landroid/widget/TextView;", "getMUpgradeBtn", "()Landroid/widget/TextView;", "setMUpgradeBtn", "(Landroid/widget/TextView;)V", "Landroid/widget/ProgressBar;", "mUpgradePb", "Landroid/widget/ProgressBar;", "getMUpgradePb", "()Landroid/widget/ProgressBar;", "setMUpgradePb", "(Landroid/widget/ProgressBar;)V", "mUpgradeTxt", "getMUpgradeTxt", "setMUpgradeTxt", "mUpdating", "Z", "getMUpdating", "()Z", "setMUpdating", "(Z)V", "", "startUpgradeTime", "J", "currentVersion", "Ljava/lang/String;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment$XHandler;", "mXHandler", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment$XHandler;", "getMXHandler", "()Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment$XHandler;", "setMXHandler", "(Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment$XHandler;)V", "mac", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingRequest;", "mRequest$delegate", "Lkotlin/Lazy;", "getMRequest", "()Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingRequest;", "mRequest", "Lna4;", "compositeDisposable", "Lna4;", "status", "I", "getStatus", "()I", "setStatus", "(I)V", "Ljava/util/TimerTask;", "timerTask", "Ljava/util/TimerTask;", "getTimerTask", "()Ljava/util/TimerTask;", "setTimerTask", "(Ljava/util/TimerTask;)V", "Ljava/util/Timer;", "timer", "Ljava/util/Timer;", "getTimer", "()Ljava/util/Timer;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mLatestVersion", "Lcom/xiaomi/fitness/sport/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "<init>", "Companion", "XHandler", "ProgressCallback", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LocalDeviceUpdateFragment extends BaseFragment {
    public static final long CHECK_INTERVAL = 3000;
    public static final int PROGRESS_STATUS = 1;

    @NotNull
    private final na4 compositeDisposable;

    @NotNull
    private String currentVersion;
    private qln mBinding;

    @Nullable
    private WearableDeviceModel mDeviceModel;

    @Nullable
    private LocalDeviceUpgradeModel.CheckUpgradeRequest mLatestVersion;

    /* JADX INFO: renamed from: mRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRequest;
    private boolean mUpdating;
    public TextView mUpgradeBtn;
    public ProgressBar mUpgradePb;
    public TextView mUpgradeTxt;
    protected XHandler mXHandler;
    public String mac;
    private long startUpgradeTime;
    private int status;

    @NotNull
    private final Timer timer;

    @Nullable
    private TimerTask timerTask;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment$ProgressCallback;", "", "onResultProgress", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ProgressCallback {
        void onResultProgress(int progress);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment$XHandler;", "Landroid/os/Handler;", "context", "Landroid/app/Activity;", "baseFragment", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment;", "<init>", "(Landroid/app/Activity;Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "fragmentWeakReference", "handleMessage", "", "msg", "Landroid/os/Message;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class XHandler extends Handler {

        @NotNull
        private final WeakReference<Activity> activityWeakReference;

        @NotNull
        private final WeakReference<LocalDeviceUpdateFragment> fragmentWeakReference;

        /* JADX WARN: Illegal instructions before constructor call */
        public XHandler(@NotNull Activity context, @NotNull LocalDeviceUpdateFragment baseFragment) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkNotNull(mainLooper);
            super(mainLooper);
            this.activityWeakReference = new WeakReference<>(context);
            this.fragmentWeakReference = new WeakReference<>(baseFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Activity activity = this.activityWeakReference.get();
            LocalDeviceUpdateFragment localDeviceUpdateFragment = this.fragmentWeakReference.get();
            if (localDeviceUpdateFragment == null) {
                return;
            }
            localDeviceUpdateFragment.handleMessage2(activity, msg);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.gym.setting.LocalDeviceUpdateFragment$checkStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/xiaomi/fitness/sport/view/launch/gym/setting/LocalDeviceUpdateFragment$checkStatus$1", "Ljava/util/TimerTask;", "run", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends TimerTask {
        final /* synthetic */ Handler $handler;

        public AnonymousClass1(Handler handler) {
            this.$handler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit run$lambda$1(Handler handler, DeviceVersionInfo deviceVersionInfo) {
            Intrinsics.checkNotNullParameter(handler, "$handler");
            if (deviceVersionInfo != null) {
                Message message = new Message();
                Bundle bundle = new Bundle();
                bundle.putSerializable("version_info", deviceVersionInfo.getVersionInfo());
                message.what = 1;
                message.setData(bundle);
                handler.sendMessage(message);
            } else {
                Logger.e("BaseFragment check download status failed", new Object[0]);
            }
            return Unit.INSTANCE;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            LocalSportSettingRequest mRequest = LocalDeviceUpdateFragment.this.getMRequest();
            WearableDeviceModel wearableDeviceModel = LocalDeviceUpdateFragment.this.mDeviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            String did = wearableDeviceModel.getDid();
            final Handler handler = this.$handler;
            mRequest.getDeviceVersionInfo(did, new Function1() { // from class: yje
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LocalDeviceUpdateFragment.AnonymousClass1.run$lambda$1(handler, (DeviceVersionInfo) obj);
                }
            });
        }
    }

    public LocalDeviceUpdateFragment() {
        super(0, 1, null);
        this.currentVersion = "";
        this.mRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sje
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalDeviceUpdateFragment.mRequest_delegate$lambda$0();
            }
        });
        this.compositeDisposable = new na4();
        this.timer = new Timer();
    }

    private final void checkStatus(Handler handler, ProgressCallback callback) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(handler);
        this.timerTask = anonymousClass1;
        this.timer.schedule(anonymousClass1, 0L, 3000L);
    }

    private final void checkUpdateStatusScheduled() {
        checkStatus(getMXHandler(), new ProgressCallback() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.LocalDeviceUpdateFragment.checkUpdateStatusScheduled.1
            @Override // com.xiaomi.fitness.sport.view.launch.gym.setting.LocalDeviceUpdateFragment.ProgressCallback
            public void onResultProgress(int progress) {
                if (progress < 0) {
                    LocalDeviceUpdateFragment.this.startDownloadFailed(-3, null);
                    TimerTask timerTask = LocalDeviceUpdateFragment.this.getTimerTask();
                    if (timerTask != null) {
                        timerTask.cancel();
                    }
                    LocalDeviceUpdateFragment.this.getTimer().cancel();
                    return;
                }
                if (progress >= 100) {
                    LocalDeviceUpdateFragment.this.getTimer().cancel();
                    TimerTask timerTask2 = LocalDeviceUpdateFragment.this.getTimerTask();
                    if (timerTask2 != null) {
                        timerTask2.cancel();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalSportSettingRequest getMRequest() {
        return (LocalSportSettingRequest) this.mRequest.getValue();
    }

    private final void getVersionStatus() {
        LocalSportSettingRequest mRequest = getMRequest();
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        mRequest.getDeviceVersionInfo(wearableDeviceModel.getDid(), new Function1() { // from class: uje
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalDeviceUpdateFragment.getVersionStatus$lambda$5(this.f35819a, (DeviceVersionInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVersionStatus$lambda$5(LocalDeviceUpdateFragment this$0, DeviceVersionInfo deviceVersionInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (deviceVersionInfo != null) {
            Serializable versionInfo = deviceVersionInfo.getVersionInfo();
            Intrinsics.checkNotNull(versionInfo, "null cannot be cast to non-null type com.xiaomi.fitness.sport.model.LocalDeviceUpgradeModel.CheckUpgradeRequest");
            LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest = (LocalDeviceUpgradeModel.CheckUpgradeRequest) versionInfo;
            Logger.i(BaseFragment.TAG, "init updating = " + checkUpgradeRequest.updating);
            if (checkUpgradeRequest.updating) {
                this$0.checkUpdateStatusScheduled();
            } else {
                LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest2 = this$0.mLatestVersion;
                this$0.handleNewVersion(checkUpgradeRequest2 != null ? checkUpgradeRequest2.latestVersion : null, checkUpgradeRequest2 != null ? checkUpgradeRequest2.description : null, this$0.mUpdating);
                LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest3 = this$0.mLatestVersion;
                this$0.currentVersion = String.valueOf(checkUpgradeRequest3 != null ? checkUpgradeRequest3.currentVersion : null);
            }
        } else {
            Logger.e("BaseFragment check download status failed", new Object[0]);
        }
        return Unit.INSTANCE;
    }

    private final void handleNewVersion(String version, String log, boolean isUpdating) {
        qln qlnVar = this.mBinding;
        qln qlnVar2 = null;
        if (qlnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qlnVar = null;
        }
        qlnVar.C.setImageResource(eoi.r1);
        qln qlnVar3 = this.mBinding;
        if (qlnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qlnVar3 = null;
        }
        qlnVar3.E.setText(version);
        qln qlnVar4 = this.mBinding;
        if (qlnVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qlnVar4 = null;
        }
        qlnVar4.D.setText(c1j.p5);
        qln qlnVar5 = this.mBinding;
        if (qlnVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qlnVar2 = qlnVar5;
        }
        qlnVar2.B.setText(log);
        getMUpgradeBtn().setText(c1j.s1);
        getMUpgradeBtn().setEnabled(!isUpdating);
    }

    private final void handleProgress(LocalDeviceUpgradeModel.CheckUpgradeRequest versionInfo) {
        int i = versionInfo.progress;
        Logger.i("BaseFragmentupdate progress = " + i, new Object[0]);
        if (i < 0) {
            startDownloadFailed(-3, null);
            return;
        }
        if (!versionInfo.updating) {
            getMUpgradePb().setVisibility(8);
            getMUpgradeTxt().setVisibility(8);
            getMUpgradeBtn().setEnabled(true);
            getMUpgradeBtn().setText(getString(c1j.w1));
            stopTimer();
            return;
        }
        getMUpgradeTxt().setVisibility(0);
        getMUpgradePb().setVisibility(0);
        getMUpgradeBtn().setText(getString(c1j.u1));
        getMUpgradeBtn().setEnabled(false);
        if (i < 50) {
            int i2 = i * 2;
            getMUpgradeTxt().setText(getString(c1j.q5, Integer.valueOf(i2)));
            getMUpgradePb().setProgress(i2);
        } else if (i < 100) {
            int i3 = (i - 50) * 2;
            getMUpgradeTxt().setText(getString(c1j.t1, Integer.valueOf(i3)));
            getMUpgradePb().setProgress(i3);
        } else {
            getMUpgradePb().setVisibility(8);
            getMUpgradeTxt().setVisibility(8);
            getMUpgradeBtn().setText(getString(c1j.v1));
            if (!this.mUpdating) {
                long jCurrentTimeMillis = (System.currentTimeMillis() - this.startUpgradeTime) / ((long) 1000);
            }
            a6l.a(getMUpgradeBtn(), new bg4() { // from class: qje
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    LocalDeviceUpdateFragment.handleProgress$lambda$6(this.f31566a, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleProgress$lambda$6(LocalDeviceUpdateFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalSportSettingRequest mRequest_delegate$lambda$0() {
        return LocalSportSettingRequestKt.getInstance(LocalSportSettingRequest.INSTANCE);
    }

    private final void setListener() {
        a6l.a(getMUpgradeBtn(), new bg4() { // from class: oje
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                LocalDeviceUpdateFragment.setListener$lambda$3(this.f29216a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(LocalDeviceUpdateFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startUpgradeTime = System.currentTimeMillis();
        if (this$0.mDeviceModel != null) {
            this$0.startUpdate();
        } else {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this$0.startUpgradeTime) / ((long) 1000);
            ToastUtil.INSTANCE.showToast(c1j.j);
        }
    }

    private final void startDownload() {
        Logger.i(BaseFragment.TAG, "start update");
        checkUpdateStatusScheduled();
    }

    private final void startUpdate() {
        String did;
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            return;
        }
        getMRequest().updateFirmware(did, new Function2() { // from class: wje
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalDeviceUpdateFragment.startUpdate$lambda$8$lambda$7(this.f38027a, ((Boolean) obj).booleanValue(), (ApiException) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startUpdate$lambda$8$lambda$7(LocalDeviceUpdateFragment this$0, boolean z, ApiException apiException) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.startDownload();
        } else {
            this$0.startDownloadFailed(apiException != null ? apiException.getErrorCode() : -2, apiException);
        }
        return Unit.INSTANCE;
    }

    public final boolean getMUpdating() {
        return this.mUpdating;
    }

    @NotNull
    public final TextView getMUpgradeBtn() {
        TextView textView = this.mUpgradeBtn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUpgradeBtn");
        return null;
    }

    @NotNull
    public final ProgressBar getMUpgradePb() {
        ProgressBar progressBar = this.mUpgradePb;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUpgradePb");
        return null;
    }

    @NotNull
    public final TextView getMUpgradeTxt() {
        TextView textView = this.mUpgradeTxt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUpgradeTxt");
        return null;
    }

    @NotNull
    public final XHandler getMXHandler() {
        XHandler xHandler = this.mXHandler;
        if (xHandler != null) {
            return xHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mXHandler");
        return null;
    }

    @NotNull
    public final String getMac() {
        String str = this.mac;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mac");
        return null;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final Timer getTimer() {
        return this.timer;
    }

    @Nullable
    public final TimerTask getTimerTask() {
        return this.timerTask;
    }

    public final void handleMessage2(@Nullable Context context, @Nullable Message msg) {
        Integer numValueOf = msg != null ? Integer.valueOf(msg.what) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            Object obj = msg.getData().get("version_info");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.sport.model.LocalDeviceUpgradeModel.CheckUpgradeRequest");
            handleProgress((LocalDeviceUpgradeModel.CheckUpgradeRequest) obj);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setMXHandler(new XHandler(fragmentActivityRequireActivity, this));
        Bundle arguments = getArguments();
        if (arguments == null) {
            ToastUtil.INSTANCE.showToast(c1j.common_hint_unkonwn_error);
            finish();
            return;
        }
        Serializable serializable = arguments.getSerializable("key_param1");
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fitness.sport.model.LocalDeviceUpgradeModel.CheckUpgradeRequest");
        this.mLatestVersion = (LocalDeviceUpgradeModel.CheckUpgradeRequest) serializable;
        setMac(String.valueOf(arguments.getString("mac")));
        this.mUpdating = arguments.getBoolean("updating");
        this.mDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        stopTimer();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (inflater == null) {
            inflater = LayoutInflater.from(requireContext());
        }
        qln qlnVarA0 = qln.A0(inflater, container, false);
        this.mBinding = qlnVarA0;
        qln qlnVar = null;
        if (qlnVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qlnVarA0 = null;
        }
        setRootView(qlnVarA0.getRoot());
        qln qlnVar2 = this.mBinding;
        if (qlnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qlnVar = qlnVar2;
        }
        View root = qlnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        wc0 miuiActionBar;
        View startView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c1j.D4);
        LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest = this.mLatestVersion;
        if (checkUpgradeRequest != null) {
            Intrinsics.checkNotNull(checkUpgradeRequest);
            if (checkUpgradeRequest.force && (miuiActionBar = getMiuiActionBar()) != null && (startView = miuiActionBar.getStartView()) != null) {
                ViewExtKt.gone(startView);
            }
        }
        qln qlnVar = this.mBinding;
        qln qlnVar2 = null;
        if (qlnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qlnVar = null;
        }
        setMUpgradeBtn(qlnVar.A.C);
        qln qlnVar3 = this.mBinding;
        if (qlnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            qlnVar3 = null;
        }
        setMUpgradePb(qlnVar3.A.D);
        qln qlnVar4 = this.mBinding;
        if (qlnVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            qlnVar2 = qlnVar4;
        }
        setMUpgradeTxt(qlnVar2.A.A);
        setListener();
        getVersionStatus();
    }

    public final void setMUpdating(boolean z) {
        this.mUpdating = z;
    }

    public final void setMUpgradeBtn(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mUpgradeBtn = textView;
    }

    public final void setMUpgradePb(@NotNull ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.mUpgradePb = progressBar;
    }

    public final void setMUpgradeTxt(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mUpgradeTxt = textView;
    }

    public final void setMXHandler(@NotNull XHandler xHandler) {
        Intrinsics.checkNotNullParameter(xHandler, "<set-?>");
        this.mXHandler = xHandler;
    }

    public final void setMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTimerTask(@Nullable TimerTask timerTask) {
        this.timerTask = timerTask;
    }

    public final void startDownloadFailed(int code, @Nullable Throwable e) {
        Logger.i(BaseFragment.TAG, "start download failed");
        getMUpgradeBtn().setText(getString(c1j.common_retry));
        startUpdate();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.startUpgradeTime) / ((long) 1000);
    }

    public final void stopTimer() {
        this.timer.cancel();
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }
}
