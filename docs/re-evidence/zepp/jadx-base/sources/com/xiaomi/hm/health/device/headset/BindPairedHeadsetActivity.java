package com.xiaomi.hm.health.device.headset;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.core.device.wifi_settings.ui.view.LinearLayoutDecoration;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMBindHeadsetLogic;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.HMBindBaseLogic;
import com.xiaomi.hm.health.device.headset.BindPairedHeadsetActivity;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.training.ui.activity.TrainingHistoryActivity;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\t*\u0002@D\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002KJB\u0007¢\u0006\u0004\bH\u0010IJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\"\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u001b\u001a\u00020\u0005H\u0014J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0012H\u0014R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00107\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b,\u00106R\u001d\u0010;\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b0\u0010:R\u001d\u0010?\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b)\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006L"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/BindPairedHeadsetActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "Landroid/bluetooth/BluetoothDevice;", "device", "", "t", "w", "Lcom/xiaomi/hm/health/device/bind/HMBindBaseLogic$BindError;", "error", "u", "Lcom/xiaomi/hm/health/databases/model/Device;", "y", "Landroidx/fragment/app/Fragment;", "fragment", "J", LogUtil.I, "K", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onDestroy", "outState", "onSaveInstanceState", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "x", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/device/headset/PairedDeviceViewModel;", "Lcom/xiaomi/hm/health/device/headset/PairedDeviceViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/headset/BindSingleHeadsetViewModel;", "z", "Lcom/xiaomi/hm/health/device/headset/BindSingleHeadsetViewModel;", "bindSingleHeadsetViewModel", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/bluetooth/BluetoothDevice;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "B", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "", "C", "Z", "showUpgrade", "Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", LogUtil.D, "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "bindServiceApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "E", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Lcom/xiaomi/hm/health/device/HMBindHeadsetLogic;", "F", "()Lcom/xiaomi/hm/health/device/HMBindHeadsetLogic;", "bindLogic", "com/xiaomi/hm/health/device/headset/BindPairedHeadsetActivity$bindListener$1", "G", "Lcom/xiaomi/hm/health/device/headset/BindPairedHeadsetActivity$bindListener$1;", "bindListener", "com/xiaomi/hm/health/device/headset/BindPairedHeadsetActivity$boundBroadcastReceiver$1", "H", "Lcom/xiaomi/hm/health/device/headset/BindPairedHeadsetActivity$boundBroadcastReceiver$1;", "boundBroadcastReceiver", "<init>", "()V", "Companion", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindPairedHeadsetActivity extends BaseTitleActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String I = "device_source";

    @NotNull
    private static final String J = "bind_headset_fragment";
    private static final long K = 1500;
    private static final int L = 1;
    public static final int RESULT_SEARCH_BIND = 2;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private BluetoothDevice device;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean showUpgrade;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy bindServiceApi;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy bindLogic;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final BindPairedHeadsetActivity$bindListener$1 bindListener;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final BindPairedHeadsetActivity$boundBroadcastReceiver$1 boundBroadcastReceiver;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private PairedDeviceViewModel viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private BindSingleHeadsetViewModel bindSingleHeadsetViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/BindPairedHeadsetActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Landroid/content/Intent;", "newIntent", "", TrainingHistoryActivity.EXTRA_DEVICE_SOURCE, "Ljava/lang/String;", "", "LOADING_DELAY_DISMISS", "J", "", "REQUEST_CODE_HEADSET_GUIDE", LogUtil.I, "RESULT_SEARCH_BIND", "TAG_BIND_HEADSET_FRAGMENT", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent newIntent(@NotNull Context context, @NotNull HMDeviceSource source) {
            Intent intent = new Intent(context, (Class<?>) BindPairedHeadsetActivity.class);
            intent.putExtra("device_source", source);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/device/headset/BindPairedHeadsetActivity$a", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/device/headset/PairedDevice;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "a", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a extends BaseQuickAdapter<PairedDevice, BaseViewHolder> {
        public a() {
            super(R.layout.item_paired_device);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void convert(@NotNull BaseViewHolder helper, @NotNull PairedDevice item) {
            helper.setText(R.id.tv_name, item.getName());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            helper.setText(R.id.tv_mac, String.format("%s %s", Arrays.copyOf(new Object[]{helper.itemView.getContext().getString(R.string.mac), item.getDevice().getAddress()}, 2)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/HMBindHeadsetLogic;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMBindHeadsetLogic> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMBindHeadsetLogic getA() {
            BindPairedHeadsetActivity bindPairedHeadsetActivity = BindPairedHeadsetActivity.this;
            HMDeviceSource hMDeviceSource = bindPairedHeadsetActivity.deviceSource;
            Objects.requireNonNull(hMDeviceSource);
            return new HMBindHeadsetLogic(bindPairedHeadsetActivity, hMDeviceSource);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c<V> implements Callable {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void call() {
            BindPairedHeadsetActivity.this.A().doBind();
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d<T> implements Consumer {
        public static final d<T> a = new d<>();

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@Nullable Void r1) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LoadingDialog a;
        public final /* synthetic */ BindPairedHeadsetActivity b;
        public final /* synthetic */ Device c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LoadingDialog loadingDialog, BindPairedHeadsetActivity bindPairedHeadsetActivity, Device device) {
            super(0);
            this.a = loadingDialog;
            this.b = bindPairedHeadsetActivity;
            this.c = device;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoadingDialog loadingDialog = this.a;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
            this.b.setResult(-1);
            this.b.finish();
            this.c.setActiveStatus(1);
            BindServiceApi bindServiceApiB = this.b.B();
            BindPairedHeadsetActivity bindPairedHeadsetActivity = this.b;
            bindServiceApiB.doNext(bindPairedHeadsetActivity, this.c, this.a, true ^ bindPairedHeadsetActivity.showUpgrade);
            if (this.b.showUpgrade) {
                this.b.C().startSingleHeadsetUpgradeActivity(this.b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.xiaomi.hm.health.device.headset.BindPairedHeadsetActivity$bindListener$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.xiaomi.hm.health.device.headset.BindPairedHeadsetActivity$boundBroadcastReceiver$1] */
    public BindPairedHeadsetActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.bindServiceApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<BindServiceApi>() { // from class: com.xiaomi.hm.health.device.headset.BindPairedHeadsetActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.bind.BindServiceApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BindServiceApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(BindServiceApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.headset.BindPairedHeadsetActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
        this.bindLogic = LazyKt__LazyJVMKt.lazy(new b());
        this.bindListener = new HMBindHeadsetLogic.BindListener() { // from class: com.xiaomi.hm.health.device.headset.BindPairedHeadsetActivity$bindListener$1
            @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic.IBindListener
            public void onBindFailure(@NotNull HMBindBaseLogic.BindError error, @NotNull HMDeviceType type) {
                this.a.u(error);
            }

            @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic.IBindListener
            public void onBindSuccess(@NotNull HMBaseDevice baseDevice, @NotNull Device dbDevice) {
                this.a.y(dbDevice);
            }

            @Override // com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener
            public void onDeviceFound(@NotNull BluetoothDevice device) {
            }

            @Override // com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener
            public void onSingleBind(@NotNull HMBaseDevice device) {
                LoadingDialog loadingDialog = this.a.loadingDialog;
                if (loadingDialog != null) {
                    loadingDialog.dismiss();
                }
                this.a.J(new BindSingleHeadsetFragment());
            }

            @Override // com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener
            public void onVersionDiverseBind(@NotNull HMBaseDevice device) {
                LoadingDialog loadingDialog = this.a.loadingDialog;
                if (loadingDialog != null) {
                    loadingDialog.dismiss();
                }
                this.a.J(new BindHeadsetUpgradeFragment());
            }
        };
        this.boundBroadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.hm.health.device.headset.BindPairedHeadsetActivity$boundBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                if (Intrinsics.areEqual("android.bluetooth.device.action.BOND_STATE_CHANGED", intent.getAction())) {
                    int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                    if (intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10) == 11 && intExtra == 12) {
                        PairedDeviceViewModel pairedDeviceViewModel = this.a.viewModel;
                        Objects.requireNonNull(pairedDeviceViewModel);
                        pairedDeviceViewModel.load();
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBindHeadsetLogic A() {
        return (HMBindHeadsetLogic) this.bindLogic.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BindServiceApi B() {
        return (BindServiceApi) this.bindServiceApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceXNavigator C() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(BindPairedHeadsetActivity bindPairedHeadsetActivity, View view) {
        bindPairedHeadsetActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(BindPairedHeadsetActivity bindPairedHeadsetActivity, View view) {
        bindPairedHeadsetActivity.startActivityForResult(BindHeadsetGuideActivity.INSTANCE.newIntent(bindPairedHeadsetActivity), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(a aVar, BindPairedHeadsetActivity bindPairedHeadsetActivity, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        PairedDevice item = aVar.getItem(i);
        if (item == null) {
            return;
        }
        bindPairedHeadsetActivity.t(item.getDevice());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(a aVar, List list) {
        aVar.setNewData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(BindPairedHeadsetActivity bindPairedHeadsetActivity, Boolean bool) {
        bindPairedHeadsetActivity.showUpgrade = bool.booleanValue();
        bindPairedHeadsetActivity.w();
    }

    private final void I() {
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s38, BaseTitleActivity.STYLE.NONE);
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(J);
        if (fragmentFindFragmentByTag == null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        fragmentTransactionBeginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Fragment fragment) {
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s38, BaseTitleActivity.STYLE.SINGLE_BACK);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.fl_container, fragment, J);
        fragmentTransactionBeginTransaction.commit();
    }

    private final void K() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
        loadingDialogShowDialog.setMessage(getString(R.string.device_binding));
        loadingDialogShowDialog.setCancelable(false);
        loadingDialogShowDialog.show();
        Unit unit = Unit.INSTANCE;
        this.loadingDialog = loadingDialogShowDialog;
    }

    @JvmStatic
    @NotNull
    public static final Intent newIntent(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource) {
        return INSTANCE.newIntent(context, hMDeviceSource);
    }

    private final void t(BluetoothDevice device) {
        K();
        this.device = device;
        this.showUpgrade = false;
        A().bind(device, this.bindListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(HMBindBaseLogic.BindError error) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.headset_connect_failed).setMessage(R.string.bind_headset_tips_connect_failed_msg).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: sw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BindPairedHeadsetActivity.v(this.a, dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(BindPairedHeadsetActivity bindPairedHeadsetActivity, DialogInterface dialogInterface, int i) {
        bindPairedHeadsetActivity.device = null;
        bindPairedHeadsetActivity.I();
    }

    private final void w() {
        if (!this.showUpgrade) {
            K();
        }
        Observable.fromCallable(new c()).subscribeOn(Schedulers.io()).subscribe(d.a, new Consumer() { // from class: ww
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BindPairedHeadsetActivity.x((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Throwable th) {
        HMLog.warn$default(null, th, e.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Device device) {
        LoadingDialog loadingDialogShowDialog;
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        if (this.showUpgrade) {
            loadingDialogShowDialog = null;
        } else {
            loadingDialogShowDialog = LoadingDialog.showDialog(this);
            loadingDialogShowDialog.setSuccess(getString(R.string.device_bind_success));
            loadingDialogShowDialog.setCancelable(false);
        }
        final f fVar = new f(loadingDialogShowDialog, this, device);
        if (this.showUpgrade) {
            fVar.getA();
        } else {
            ((TextView) findViewById(R.id.tv_cancel)).postDelayed(new Runnable() { // from class: xw
                @Override // java.lang.Runnable
                public final void run() {
                    BindPairedHeadsetActivity.z(this.a, fVar);
                }
            }, 1500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(BindPairedHeadsetActivity bindPairedHeadsetActivity, Function0 function0) {
        if (bindPairedHeadsetActivity.isDestroyed()) {
            return;
        }
        function0.getA();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != 1) {
            super.onActivityResult(requestCode, resultCode, data);
        } else if (resultCode == -1) {
            setResult(2);
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Serializable serializable;
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            savedInstanceState = getIntent().getExtras();
        }
        HMDeviceSource hMDeviceSource = (savedInstanceState == null || (serializable = savedInstanceState.getSerializable("device_source")) == null) ? null : (HMDeviceSource) serializable;
        if (hMDeviceSource == null) {
            hMDeviceSource = HMDeviceSource.VDEVICE;
        }
        this.deviceSource = hMDeviceSource;
        Objects.requireNonNull(hMDeviceSource);
        if (hMDeviceSource == HMDeviceSource.VDEVICE) {
            finish();
            return;
        }
        setContentView(R.layout.activity_bind_paired_headset);
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s38, BaseTitleActivity.STYLE.NONE);
        ((TextView) findViewById(R.id.tv_cancel)).setOnClickListener(new View.OnClickListener() { // from class: tw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindPairedHeadsetActivity.D(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.tv_search_bind)).setOnClickListener(new View.OnClickListener() { // from class: uw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindPairedHeadsetActivity.E(this.a, view);
            }
        });
        int i = R.id.device_container;
        ((RecyclerView) findViewById(i)).addItemDecoration(new LinearLayoutDecoration(this, 1, R.dimen.divider, R.color.divide));
        final a aVar = new a();
        ((RecyclerView) findViewById(i)).setAdapter(aVar);
        aVar.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.xiaomi.hm.health.device.headset.b
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                BindPairedHeadsetActivity.F(aVar, this, baseQuickAdapter, view, i2);
            }
        });
        PairedDeviceViewModel pairedDeviceViewModel = (PairedDeviceViewModel) new ViewModelProvider(this).get(PairedDeviceViewModel.class);
        this.viewModel = pairedDeviceViewModel;
        Objects.requireNonNull(pairedDeviceViewModel);
        HMDeviceSource hMDeviceSource2 = this.deviceSource;
        Objects.requireNonNull(hMDeviceSource2);
        pairedDeviceViewModel.setSource(hMDeviceSource2);
        PairedDeviceViewModel pairedDeviceViewModel2 = this.viewModel;
        Objects.requireNonNull(pairedDeviceViewModel2);
        pairedDeviceViewModel2.getDeviceListLiveData().observe(this, new Observer() { // from class: com.xiaomi.hm.health.device.headset.a
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BindPairedHeadsetActivity.G(aVar, (List) obj);
            }
        });
        PairedDeviceViewModel pairedDeviceViewModel3 = this.viewModel;
        Objects.requireNonNull(pairedDeviceViewModel3);
        pairedDeviceViewModel3.load();
        BindSingleHeadsetViewModel bindSingleHeadsetViewModel = (BindSingleHeadsetViewModel) new ViewModelProvider(this).get(BindSingleHeadsetViewModel.class);
        this.bindSingleHeadsetViewModel = bindSingleHeadsetViewModel;
        Objects.requireNonNull(bindSingleHeadsetViewModel);
        bindSingleHeadsetViewModel.getBindLiveData().observe(this, new Observer() { // from class: vw
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BindPairedHeadsetActivity.H(this.a, (Boolean) obj);
            }
        });
        registerReceiver(this.boundBroadcastReceiver, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.boundBroadcastReceiver);
        A().stopBind();
        super.onDestroy();
    }

    @Override // com.huami.view.basetitle.BaseFragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        HMDeviceSource hMDeviceSource = this.deviceSource;
        Objects.requireNonNull(hMDeviceSource);
        outState.putSerializable("device_source", hMDeviceSource);
    }
}
