package com.xiaomi.hm.health.device;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.injection.other.TreadmillApiHandler;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseui.DarkModeUtilKt;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMBaseClassicDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMTreadmillSettingActivity;
import com.xiaomi.hm.health.device.bolt.FtmsErrorHelper;
import com.xiaomi.hm.health.device.bolt.JsTreadmillMaintainEvent;
import com.xiaomi.hm.health.device.bolt.TreadmillMaintainEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeInfoActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001`B\u0007¢\u0006\u0004\b^\u0010_J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0012\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0007H\u0014J\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 J\b\u0010\"\u001a\u00020\u0007H\u0014J\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#J\"\u0010*\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010(H\u0014J\u000e\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u001d\u00105\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00101R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010<\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b3\u0010;R\u001d\u0010?\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b7\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010ER\u0016\u0010H\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010I\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010ER\u0016\u0010K\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010ER\u0016\u0010M\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010ER\u0016\u0010O\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010ER\u0016\u0010Q\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010ER\u0016\u0010S\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010ER\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Z\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\\¨\u0006a"}, d2 = {"Lcom/xiaomi/hm/health/device/HMTreadmillSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "Landroid/widget/TextView;", "subTitleTv", "", "subTitle", "", "O", "initViews", "R", "N", "Q", "", "v", "U", "B", "Landroid/app/Activity;", "activity", "P", "F", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, LogUtil.D, Status.PRE_CONNECT_STATE_CONNECTED, ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Lcom/xiaomi/hm/health/device/bolt/TreadmillMaintainEvent;", "maintainEvent", "onEventMainThread", "Lcom/xiaomi/hm/health/device/bolt/JsTreadmillMaintainEvent;", "jsTreadmillMaintainEvent", "onDestroy", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onClick", "Lcom/huami/devicex/manager/DeviceManagerApi;", "x", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "y", "w", "deviceManager", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "z", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "Lcom/xiaomi/hm/health/bt/device/HMBaseClassicDevice;", "C", "Lcom/xiaomi/hm/health/bt/device/HMBaseClassicDevice;", "classicDevice", "Lcom/huami/lib/rainbow/ListTile;", "Lcom/huami/lib/rainbow/ListTile;", "noLoadTestItem", "E", "faqItem", "musicEqualizerItem", "G", "clearDataItem", "H", "fwVersionItem", LogUtil.I, "macAddressItem", "J", "checkUpgradeItem", "K", "maintainItem", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "L", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "checkingDialog", "M", "Z", "isCheckByUser", "Lcom/xiaomi/hm/health/device/s;", "Lcom/xiaomi/hm/health/device/s;", "handler", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMTreadmillSettingActivity extends BaseTitleActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String O = "HMTreadmillSettingActivity";
    private static final int P = 0;

    @NotNull
    private static final String Q = "https://upload-cdn.huami.com/tposts/6283";

    @NotNull
    private static final String R = "https://upload-cdn.huami.com/tposts/6284";

    @NotNull
    private static final String S = "t/mifit.play.watch.600";
    private static final int T = 1024;
    private static final long U = 30000;

    @Nullable
    private static WeakReference<HMTreadmillSettingActivity> V;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private final HMBaseClassicDevice classicDevice;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private ListTile noLoadTestItem;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ListTile faqItem;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private ListTile musicEqualizerItem;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private ListTile clearDataItem;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private ListTile fwVersionItem;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private ListTile macAddressItem;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private ListTile checkUpgradeItem;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private ListTile maintainItem;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog checkingDialog;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean isCheckByUser;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private final s handler;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource deviceSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/HMTreadmillSettingActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "jumpToTreadmillFaq", "", "what", "dealMsg", "", "CONN_TIME_OUT_SEC", "J", "", "FAQ_CHINESE", "Ljava/lang/String;", "FAQ_ENGLISH", "MAINTAIN_URL", "MESSAGE_TIMEOUT", LogUtil.I, "TAG", "UNBIND_REQUEST_CODE", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/hm/health/device/HMTreadmillSettingActivity;", "activityReference", "Ljava/lang/ref/WeakReference;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void dealMsg(int what) {
            WeakReference weakReference = HMTreadmillSettingActivity.V;
            HMTreadmillSettingActivity hMTreadmillSettingActivity = weakReference == null ? null : (HMTreadmillSettingActivity) weakReference.get();
            if (hMTreadmillSettingActivity != null && what == 1024) {
                hMTreadmillSettingActivity.A(hMTreadmillSettingActivity);
                IconToast.showSuccess(hMTreadmillSettingActivity, R.string.fw_uptodate);
            }
        }

        public final void jumpToTreadmillFaq(@NotNull Context context) {
            WebHelper.launch(Language.isSimplifiedChinese() ? HMTreadmillSettingActivity.Q : HMTreadmillSettingActivity.R);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicex/manager/DeviceManagerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DeviceManagerApi> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceManagerApi invoke() {
            return HMTreadmillSettingActivity.this.x();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deviceInfo is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "changeLog is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getBindInfo for " + HMTreadmillSettingActivity.this.deviceSource + " is null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ JsTreadmillMaintainEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JsTreadmillMaintainEvent jsTreadmillMaintainEvent) {
            super(1);
            this.b = jsTreadmillMaintainEvent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                ListTile listTile = HMTreadmillSettingActivity.this.maintainItem;
                Objects.requireNonNull(listTile);
                listTile.setVisibility(8);
                HMTreadmillSettingActivity.this.z().setMaintainRedDotVisible(true);
            }
            TreadmillApiHandler handler = this.b.getHandler();
            if (handler == null) {
                return;
            }
            handler.maintainCallback(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ EventFwCheckResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EventFwCheckResult eventFwCheckResult) {
            super(0);
            this.a = eventFwCheckResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "status:" + this.a.isSuccess;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ DeviceInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(DeviceInfo deviceInfo) {
            super(0);
            this.a = deviceInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "version: " + this.a.getFirmwareVersionStr();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateFwUpgrade failed as get device info return null!!!";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMTreadmillSettingActivity() {
        EventBus.getDefault().register(this);
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.HMTreadmillSettingActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr, objArr2);
            }
        });
        this.deviceManager = LazyKt__LazyJVMKt.lazy(new a());
        DeviceManagerApi deviceManagerApiW = w();
        HMDeviceType hMDeviceType = HMDeviceType.TREADMILL;
        this.deviceSource = deviceManagerApiW.getBoundDeviceSource(hMDeviceType);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.HMTreadmillSettingActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr3, objArr4);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr5 = 0 == true ? 1 : 0;
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.HMTreadmillSettingActivity$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KeeperProxyApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), objArr5, objArr6);
            }
        });
        HMBaseDevice device = w().getDevice(hMDeviceType);
        this.classicDevice = device instanceof HMBaseClassicDevice ? (HMBaseClassicDevice) device : null;
        this.handler = new s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(Activity activity) {
        LoadingDialog loadingDialog;
        if (activity == null || activity.isDestroyed() || activity.isFinishing() || (loadingDialog = this.checkingDialog) == null || !loadingDialog.isShowing()) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void B() {
        ListTile listTile = this.checkUpgradeItem;
        Objects.requireNonNull(listTile);
        ViewExKt.setVisible(listTile, U());
        ListTile listTile2 = this.checkUpgradeItem;
        Objects.requireNonNull(listTile2);
        listTile2.setOnClickListener(new View.OnClickListener() { // from class: hl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMTreadmillSettingActivity.C(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(HMTreadmillSettingActivity hMTreadmillSettingActivity, View view) {
        if (hMTreadmillSettingActivity.v() && !hMTreadmillSettingActivity.y().isFastDoubleClick(view)) {
            if (hMTreadmillSettingActivity.U() ? HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(hMTreadmillSettingActivity, HMDeviceType.TREADMILL) : HMFwUpgradeManager.getInstance().hasFwUpgrade(hMTreadmillSettingActivity, HMDeviceType.TREADMILL)) {
                hMTreadmillSettingActivity.startActivity(HMFwUpgradeInfoActivity.newIntent(hMTreadmillSettingActivity, hMTreadmillSettingActivity.deviceSource));
                return;
            }
            hMTreadmillSettingActivity.isCheckByUser = true;
            hMTreadmillSettingActivity.P(hMTreadmillSettingActivity);
            if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
                HMFwOnlineManager.getInstance().checkFw(HMDeviceType.TREADMILL, true);
            } else {
                NetFwUpgradeManager.checkFwFromServerAsync(true);
            }
        }
    }

    private final void D() {
        if (U()) {
            HMBaseDevice device = x().getDevice(HMDeviceType.TREADMILL);
            if (device == null) {
                HMLog.info(O, b.a);
                return;
            }
            DeviceInfo deviceInfo = device.getDeviceInfo();
            if (deviceInfo == null) {
                HMLog.info(O, c.a);
                return;
            }
            final String changeLog = HMFwOnlineUpgradeManager.getInstance().getChangeLog(deviceInfo);
            if (TextUtils.isEmpty(changeLog)) {
                HMLog.info(O, d.a);
                return;
            }
            ListTile listTile = this.fwVersionItem;
            Objects.requireNonNull(listTile);
            listTile.setTrailing(R.drawable.ic_arrow_forward_20_2x);
            ListTile listTile2 = this.fwVersionItem;
            Objects.requireNonNull(listTile2);
            listTile2.setOnClickListener(new View.OnClickListener() { // from class: ol3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HMTreadmillSettingActivity.E(this.a, changeLog, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(HMTreadmillSettingActivity hMTreadmillSettingActivity, String str, View view) {
        Intent intent = new Intent(hMTreadmillSettingActivity, (Class<?>) HMFwChangeLogActivity.class);
        intent.putExtra(HMFwUpgradeActivity.FW_UPGRADE_CHANGE_LOG, str);
        hMTreadmillSettingActivity.startActivity(intent);
    }

    private final void F() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.HMTreadmillSettingActivity$initStatusBar$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onEnableChange: " + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return HMDeviceType.TREADMILL;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                HMLog.info("HMTreadmillSettingActivity", new a(enable));
                this.a.T(enable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Device device, final HMTreadmillSettingActivity hMTreadmillSettingActivity, View view) {
        AlertDialogFragment alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(device, hMTreadmillSettingActivity.getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: pl3
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                HMTreadmillSettingActivity.H(this.a, str);
            }
        });
        if (alertDialogFragmentNewInstance == null) {
            return;
        }
        alertDialogFragmentNewInstance.show(hMTreadmillSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HMTreadmillSettingActivity hMTreadmillSettingActivity, String str) {
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() > 0) {
                hMTreadmillSettingActivity.getSubTitleTextView().setVisibility(0);
                hMTreadmillSettingActivity.O(hMTreadmillSettingActivity.getSubTitleTextView(), str);
                return;
            }
        }
        hMTreadmillSettingActivity.getSubTitleTextView().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(HMTreadmillSettingActivity hMTreadmillSettingActivity, View view) {
        Intent intent = new Intent();
        intent.setClass(hMTreadmillSettingActivity, HMUnbindDeviceActivity.class);
        intent.putExtra(HMUnbindDeviceActivity.UNBIND_TYPE_KEY, 4);
        hMTreadmillSettingActivity.startActivityForResult(intent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(HMTreadmillSettingActivity hMTreadmillSettingActivity, View view) {
        INSTANCE.jumpToTreadmillFaq(hMTreadmillSettingActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(HMTreadmillSettingActivity hMTreadmillSettingActivity, View view) {
        hMTreadmillSettingActivity.startActivity(new Intent(hMTreadmillSettingActivity, (Class<?>) TreadmillEqActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(HMTreadmillSettingActivity hMTreadmillSettingActivity, View view) {
        hMTreadmillSettingActivity.startActivity(new Intent(hMTreadmillSettingActivity, (Class<?>) BoltClearDataActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(HMTreadmillSettingActivity hMTreadmillSettingActivity, View view) {
        hMTreadmillSettingActivity.startActivity(new Intent(hMTreadmillSettingActivity, (Class<?>) BoltNoLoadTestActivity.class));
    }

    private final void N() {
        WebHelper.launch(HMServerDef.getHost() + S);
    }

    private final void O(TextView subTitleTv, String subTitle) {
        if (TextUtils.isEmpty(subTitle)) {
            subTitleTv.setVisibility(8);
        } else {
            subTitleTv.setVisibility(0);
            subTitleTv.setText(subTitle);
        }
    }

    private final void P(Activity activity) {
        if (activity.isDestroyed()) {
            return;
        }
        int i2 = R.string.checking_new_apk;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(activity, getString(i2));
        this.checkingDialog = loadingDialogShowDialog;
        if (loadingDialogShowDialog == null) {
            return;
        }
        loadingDialogShowDialog.setMessage(getString(i2));
        loadingDialogShowDialog.setCancelable(false);
        loadingDialogShowDialog.show();
        this.handler.sendEmptyMessageDelayed(1024, 30000L);
    }

    private final void Q() {
        HMBaseClassicDevice hMBaseClassicDevice = this.classicDevice;
        DeviceInfo deviceInfo = hMBaseClassicDevice == null ? null : hMBaseClassicDevice.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.debug(O, i.a);
            return;
        }
        HMLog.info(O, new h(deviceInfo));
        boolean zHasFwUpgrade = U() ? HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(this, HMDeviceType.TREADMILL) : HMFwUpgradeManager.getInstance().hasFwUpgrade(this, HMDeviceType.TREADMILL);
        ListTile listTile = this.checkUpgradeItem;
        Objects.requireNonNull(listTile);
        listTile.setDotted(zHasFwUpgrade);
    }

    private final void R() {
        ListTile listTile = (ListTile) findViewById(R.id.item_maintain);
        this.maintainItem = listTile;
        Objects.requireNonNull(listTile);
        listTile.setVisibility(z().needMaintain() ? 0 : 8);
        ListTile listTile2 = this.maintainItem;
        Objects.requireNonNull(listTile2);
        listTile2.setDotted(z().maintainRedDotVisibility());
        ListTile listTile3 = this.maintainItem;
        Objects.requireNonNull(listTile3);
        listTile3.setOnClickListener(new View.OnClickListener() { // from class: ll3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMTreadmillSettingActivity.S(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(HMTreadmillSettingActivity hMTreadmillSettingActivity, View view) {
        hMTreadmillSettingActivity.N();
        ListTile listTile = hMTreadmillSettingActivity.maintainItem;
        Objects.requireNonNull(listTile);
        listTile.setDotted(false);
        hMTreadmillSettingActivity.z().setMaintainRedDotVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(boolean connected) {
        ListTile listTile = this.noLoadTestItem;
        Objects.requireNonNull(listTile);
        listTile.setEnabled(connected);
        ListTile listTile2 = this.faqItem;
        Objects.requireNonNull(listTile2);
        listTile2.setEnabled(connected);
        ListTile listTile3 = this.musicEqualizerItem;
        Objects.requireNonNull(listTile3);
        listTile3.setEnabled(connected);
        ListTile listTile4 = this.clearDataItem;
        Objects.requireNonNull(listTile4);
        listTile4.setEnabled(connected);
        ListTile listTile5 = this.fwVersionItem;
        Objects.requireNonNull(listTile5);
        listTile5.setEnabled(connected);
        ListTile listTile6 = this.macAddressItem;
        Objects.requireNonNull(listTile6);
        listTile6.setEnabled(connected);
        ListTile listTile7 = this.checkUpgradeItem;
        Objects.requireNonNull(listTile7);
        listTile7.setEnabled(connected);
        ListTile listTile8 = this.maintainItem;
        Objects.requireNonNull(listTile8);
        listTile8.setEnabled(connected);
        if (connected) {
            ListTile listTile9 = this.fwVersionItem;
            Objects.requireNonNull(listTile9);
            listTile9.setTips(w().getBoundDeviceFirmwareVersion(HMDeviceType.TREADMILL));
            Q();
        }
    }

    private final boolean U() {
        return DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(HMDeviceType.TREADMILL);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    private final void initViews() {
        F();
        setTitleText(y().getDeviceDescription(this.deviceSource));
        final Device bindInfo = x().getBindInfo(this.deviceSource.getType());
        if (bindInfo == null || TextUtils.isEmpty(bindInfo.getDisplayName())) {
            getSubTitleTextView().setVisibility(8);
            HMLog.info(O, new e());
        } else {
            String displayName = bindInfo.getDisplayName();
            int length = displayName.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.compare((int) displayName.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            if (displayName.subSequence(i2, length + 1).toString().length() > 0) {
                O(getSubTitleTextView(), bindInfo.getDisplayName());
            } else {
                getSubTitleTextView().setVisibility(8);
                HMLog.info(O, new e());
            }
        }
        getRightImage().setOnClickListener(new View.OnClickListener() { // from class: gl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMTreadmillSettingActivity.G(bindInfo, this, view);
            }
        });
        ((TextView) findViewById(R.id.treadmill_setting_unbind)).setOnClickListener(new View.OnClickListener() { // from class: nl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMTreadmillSettingActivity.I(this.a, view);
            }
        });
        ListTile listTile = (ListTile) findViewById(R.id.item_no_load_test);
        this.noLoadTestItem = listTile;
        Objects.requireNonNull(listTile);
        listTile.setVisibility(8);
        ListTile listTile2 = (ListTile) findViewById(R.id.item_faq);
        listTile2.setOnClickListener(new View.OnClickListener() { // from class: jl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMTreadmillSettingActivity.J(this.a, view);
            }
        });
        Unit unit = Unit.INSTANCE;
        this.faqItem = listTile2;
        this.musicEqualizerItem = (ListTile) findViewById(R.id.item_music_equalizer);
        this.clearDataItem = (ListTile) findViewById(R.id.item_clear_data);
        this.fwVersionItem = (ListTile) findViewById(R.id.item_fw_version);
        D();
        ListTile listTile3 = (ListTile) findViewById(R.id.item_mac_address);
        this.macAddressItem = listTile3;
        Objects.requireNonNull(listTile3);
        listTile3.setTips(w().getBoundDeviceAddress(HMDeviceType.TREADMILL));
        ListTile listTile4 = this.musicEqualizerItem;
        Objects.requireNonNull(listTile4);
        listTile4.setOnClickListener(new View.OnClickListener() { // from class: il3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMTreadmillSettingActivity.K(this.a, view);
            }
        });
        ListTile listTile5 = this.clearDataItem;
        Objects.requireNonNull(listTile5);
        listTile5.setOnClickListener(new View.OnClickListener() { // from class: kl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMTreadmillSettingActivity.L(this.a, view);
            }
        });
        ListTile listTile6 = this.noLoadTestItem;
        Objects.requireNonNull(listTile6);
        listTile6.setOnClickListener(new View.OnClickListener() { // from class: ml3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMTreadmillSettingActivity.M(this.a, view);
            }
        });
        this.checkUpgradeItem = (ListTile) findViewById(R.id.item_check_upgrade);
        R();
        B();
    }

    private final boolean v() {
        if (NetUtil.isNetworkConnected(this)) {
            return true;
        }
        IconToast.showError(this, getString(R.string.no_network_connection));
        return false;
    }

    private final DeviceManagerApi w() {
        return (DeviceManagerApi) this.deviceManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi x() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi y() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeeperProxyApi z() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
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
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == -1) {
            finish();
        }
    }

    public final void onClick(@NotNull View view) {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treadmill_setting);
        DarkModeUtilKt.setDeviceSettingUnifyTitleStyle$default(this, getString(R.string.play_with_device, new Object[]{getString(R.string.mili_settting_mili_pro)}), null, 0, 4, null);
        V = new WeakReference<>(this);
        initViews();
        T(true);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeMessages(1024);
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull TreadmillMaintainEvent maintainEvent) {
        ListTile listTile = this.maintainItem;
        Objects.requireNonNull(listTile);
        listTile.setVisibility(maintainEvent.getMaintain() ? 0 : 8);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HMFwOnlineUpgradeManager.checkUpgradeInDevicePage(this, HMDeviceType.TREADMILL);
        Q();
    }

    public final void onEventMainThread(@NotNull JsTreadmillMaintainEvent jsTreadmillMaintainEvent) {
        FtmsErrorHelper.INSTANCE.disableNotify(new f(jsTreadmillMaintainEvent));
    }

    public final void onEventMainThread(@NotNull EventFwCheckResult result) {
        HMLog.debug(O, new g(result));
        this.handler.removeMessages(1024);
        A(this);
        if (result.isSuccess) {
            if (U()) {
                HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(this, HMDeviceType.TREADMILL, false);
                return;
            } else {
                HMFwUpgradeManager.getInstance().checkFwUpgrade(this, HMDeviceType.TREADMILL, false);
                return;
            }
        }
        if (this.isCheckByUser) {
            this.isCheckByUser = false;
            IconToast.showSuccess(this, R.string.fw_uptodate);
        }
    }
}
