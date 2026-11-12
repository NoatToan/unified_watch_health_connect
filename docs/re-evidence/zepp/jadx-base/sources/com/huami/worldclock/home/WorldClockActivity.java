package com.huami.worldclock.home;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.worldclock.R;
import com.huami.worldclock.add.WorldClockAddActivity;
import com.huami.worldclock.bean.AppType;
import com.huami.worldclock.bean.Operation;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.component.IconToast;
import com.huami.worldclock.component.RecyclerItemDecoration;
import com.huami.worldclock.event.WorldClockChangeEvent;
import com.huami.worldclock.home.WorldClockActivity;
import com.huami.worldclock.koin.DeviceScopesAndQualifierKt;
import com.huami.worldclock.move.OnItemTouchCallbackListener;
import com.huami.worldclock.move.OnStartDragListener;
import com.huami.worldclock.move.RecyclerViewTouchHelper;
import com.huami.worldclock.move.TouchCallback;
import com.huami.worldclock.proxy.BLEStatueListenerAdapterSimple;
import com.huami.worldclock.proxy.ScopeComponents;
import com.huami.worldclock.utils.DensityUtils;
import com.huami.worldclock.utils.WorldClockExpandKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xmlywind.sdk.base.models.ClickCommon;
import de.greenrobot.event.EventBus;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 x2\u00020\u00012\u00020\u0002:\u0003xyzB\u0007¢\u0006\u0004\bv\u0010wJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\bH\u0002J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\bH\u0002J\b\u0010#\u001a\u00020\u0003H\u0002J\u001a\u0010'\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\b\b\u0001\u0010&\u001a\u00020\u0005H\u0002J\u0012\u0010*\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010(H\u0014J\"\u0010/\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010-H\u0014J\u0010\u00101\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0005H\u0016J\u0018\u00104\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005H\u0016J\u001a\u00108\u001a\u00020\b2\u0006\u00105\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u000106H\u0016J\b\u00109\u001a\u00020\u0003H\u0014R%\u0010?\u001a\n ;*\u0004\u0018\u00010:0:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010>R%\u0010C\u001a\n ;*\u0004\u0018\u00010@0@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010<\u001a\u0004\bA\u0010BR%\u0010F\u001a\n ;*\u0004\u0018\u00010$0$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010<\u001a\u0004\bD\u0010ER%\u0010I\u001a\n ;*\u0004\u0018\u00010$0$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010ER%\u0010N\u001a\n ;*\u0004\u0018\u00010J0J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010<\u001a\u0004\bL\u0010MR%\u0010O\u001a\n ;*\u0004\u0018\u00010$0$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010<\u001a\u0004\bK\u0010ER%\u0010R\u001a\n ;*\u0004\u0018\u00010P0P8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010<\u001a\u0004\bG\u0010QR\u001a\u0010U\u001a\u00060SR\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010TR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010WR\u0016\u0010[\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010ZR\u0016\u0010^\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010dR\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010gR\u001d\u0010k\u001a\u00020i8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b`\u0010jR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010t¨\u0006{"}, d2 = {"Lcom/huami/worldclock/home/WorldClockActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/worldclock/move/OnItemTouchCallbackListener;", "", "x", "", "E", "initView", "", "enable", "d0", "Lcom/huami/worldclock/bean/AppType;", "appType", "X", "Z", "L", "Q", "initRecyclerView", "b0", "Y", "Lcom/huami/worldclock/bean/WorldClockBean;", "worldClockBean", "e0", "", "msg", "h0", "c0", "y", "z", "show", "J", "Lcom/huami/worldclock/bean/Operation;", "operate", "result", "K", "a0", "Landroid/widget/Button;", ClickCommon.CLICK_AREA_BTN, "layerId", "i0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "adapterPosition", "onSwiped", "srcPosition", "targetPosition", "onMove", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "onDestroy", "Landroid/view/View;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "G", "()Landroid/view/View;", "maskView", "Landroid/widget/TextView;", "F", "()Landroid/widget/TextView;", "emptyHint", "C", "()Landroid/widget/Button;", "btnComplete", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, LogUtil.D, "btnEdit", "Landroidx/recyclerview/widget/RecyclerView;", "B", "H", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "btnAdd", "Landroid/widget/LinearLayout;", "()Landroid/widget/LinearLayout;", "areaHandle", "Lcom/huami/worldclock/home/WorldClockActivity$TimeChangeReceiver;", "Lcom/huami/worldclock/home/WorldClockActivity$TimeChangeReceiver;", "timeChangeReceiver", "Lcom/huami/worldclock/home/AdapterWorldClock;", "Lcom/huami/worldclock/home/AdapterWorldClock;", "adapter", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/huami/android/design/dialog/AlertDialogFragment;", LogUtil.I, "Lcom/huami/android/design/dialog/AlertDialogFragment;", "deleteDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "builder", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/worldclock/home/WorldClockHomeViewModel;", "()Lcom/huami/worldclock/home/WorldClockHomeViewModel;", "viewModelClock", "M", "Lcom/huami/worldclock/bean/AppType;", "getAppType", "()Lcom/huami/worldclock/bean/AppType;", "setAppType", "(Lcom/huami/worldclock/bean/AppType;)V", "Landroid/os/Handler;", "N", "Landroid/os/Handler;", "myHandler", "<init>", "()V", "Companion", "a", "TimeChangeReceiver", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class WorldClockActivity extends BaseTitleActivity implements OnItemTouchCallbackListener {

    @NotNull
    public static final String APP_TYPE = "app_type";
    public static final long CONN_TIME_OUT_SEC = 30000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long DELAY_TIME_OUT_SEC = 500;

    @NotNull
    public static final String DEVICE_SOURCE = "device_source";

    @NotNull
    public static final String DEVICE_TYPE = "device_type";

    @NotNull
    public static final String MESSAGE_CONTENT = "content";
    public static final int MESSAGE_DELAY_SHOW = 22;
    public static final int MESSAGE_TIME_OUT = 23;
    public static final int MESSAGE_WORLD_CLOCK_CHANGE = 24;

    @NotNull
    public static final String WORLD_CLOCK_SET_NUM = "WorldClock_Set_Num";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private TimeChangeReceiver timeChangeReceiver;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private AdapterWorldClock adapter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private HMDeviceType deviceType;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment deleteDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment.Builder builder;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModelClock;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private AppType appType;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private Handler myHandler;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy maskView = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyHint = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnComplete = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnEdit = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy recyclerView = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnAdd = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy areaHandle = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huami/worldclock/home/WorldClockActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "hmDeviceSource", "", "navigation2WorldClock", "", "APP_TYPE", "Ljava/lang/String;", "", "CONN_TIME_OUT_SEC", "J", "DELAY_TIME_OUT_SEC", "DEVICE_SOURCE", "DEVICE_TYPE", "MESSAGE_CONTENT", "", "MESSAGE_DELAY_SHOW", LogUtil.I, "MESSAGE_TIME_OUT", "MESSAGE_WORLD_CLOCK_CHANGE", "WORLD_CLOCK_SET_NUM", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void navigation2WorldClock(@NotNull Context context, @NotNull HMDeviceSource hmDeviceSource) {
            Intent intent = new Intent(context, (Class<?>) WorldClockActivity.class);
            intent.putExtra("device_source", hmDeviceSource);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/worldclock/home/WorldClockActivity$TimeChangeReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "(Lcom/huami/worldclock/home/WorldClockActivity;)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
    public final class TimeChangeReceiver extends BroadcastReceiver {
        public TimeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (intent == null) {
                return;
            }
            WorldClockActivity worldClockActivity = WorldClockActivity.this;
            String action = intent.getAction();
            if (action != null && action.hashCode() == -1513032534 && action.equals("android.intent.action.TIME_TICK")) {
                AdapterWorldClock adapterWorldClock = worldClockActivity.adapter;
                if (adapterWorldClock == null) {
                    adapterWorldClock = null;
                }
                adapterWorldClock.notifyDataSetChanged();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            iArr[AppType.MIDONG.ordinal()] = 1;
            iArr[AppType.MIFIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"com/huami/worldclock/home/WorldClockActivity$a", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Ljava/lang/ref/WeakReference;", "Lcom/huami/worldclock/home/WorldClockActivity;", "a", "Ljava/lang/ref/WeakReference;", "mActivity", "<init>", "(Lcom/huami/worldclock/home/WorldClockActivity;)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private WeakReference<WorldClockActivity> mActivity;

        public a(@Nullable WorldClockActivity worldClockActivity) {
            this.mActivity = new WeakReference<>(worldClockActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            WorldClockActivity worldClockActivity;
            super.handleMessage(msg);
            switch (msg.what) {
                case 22:
                    String string = msg.getData().getString("content");
                    if (string != null && (worldClockActivity = this.mActivity.get()) != null) {
                        worldClockActivity.h0(string);
                    }
                    break;
                case 23:
                    WorldClockActivity worldClockActivity2 = this.mActivity.get();
                    if (worldClockActivity2 != null) {
                        worldClockActivity2.z();
                        break;
                    }
                    break;
                case 24:
                    WorldClockActivity worldClockActivity3 = this.mActivity.get();
                    if (worldClockActivity3 != null) {
                        worldClockActivity3.a0();
                        break;
                    }
                    break;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LinearLayout> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout getA() {
            return (LinearLayout) WorldClockActivity.this.findViewById(R.id.area_handle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/Button;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Button> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button getA() {
            return (Button) WorldClockActivity.this.findViewById(R.id.world_clock_add);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/Button;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Button> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button getA() {
            return (Button) WorldClockActivity.this.findViewById(R.id.btn_complete);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/Button;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Button> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button getA() {
            return (Button) WorldClockActivity.this.findViewById(R.id.world_clock_edit);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<TextView> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) WorldClockActivity.this.findViewById(R.id.empty_hint);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<View> {
        public g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            return WorldClockActivity.this.findViewById(R.id.mask_view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<RecyclerView> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView getA() {
            return (RecyclerView) WorldClockActivity.this.findViewById(R.id.recyclerView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorldClockActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.worldclock.home.WorldClockActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.viewModelClock = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WorldClockHomeViewModel>() { // from class: com.huami.worldclock.home.WorldClockActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.worldclock.home.WorldClockHomeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WorldClockHomeViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr, Reflection.getOrCreateKotlinClass(WorldClockHomeViewModel.class), function0, objArr2);
            }
        });
        ScopeComponents scopeComponents = DeviceScopesAndQualifierKt.getScopeComponents(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this));
        AppType appType = scopeComponents != null ? scopeComponents.getAppType() : null;
        this.appType = appType == null ? AppType.MIDONG : appType;
        this.myHandler = new a(this);
    }

    private final LinearLayout A() {
        return (LinearLayout) this.areaHandle.getValue();
    }

    private final Button B() {
        return (Button) this.btnAdd.getValue();
    }

    private final Button C() {
        return (Button) this.btnComplete.getValue();
    }

    private final Button D() {
        return (Button) this.btnEdit.getValue();
    }

    private final int E() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i != 1) {
            return i != 2 ? R.layout.activity_world_clock : R.layout.activity_world_world_mi;
        }
        return R.layout.activity_world_clock;
    }

    private final TextView F() {
        return (TextView) this.emptyHint.getValue();
    }

    private final View G() {
        return (View) this.maskView.getValue();
    }

    private final RecyclerView H() {
        return (RecyclerView) this.recyclerView.getValue();
    }

    private final WorldClockHomeViewModel I() {
        return (WorldClockHomeViewModel) this.viewModelClock.getValue();
    }

    private final void J(boolean show) {
        if (show) {
            c0(getString(R.string.world_clock_saving));
        } else {
            z();
            y();
        }
    }

    private final void K(Operation operate, boolean result) {
        List<WorldClockBean> value;
        if (operate == Operation.NULL) {
            List<WorldClockBean> value2 = I().getWorldClockList().getValue();
            if (value2 == null) {
                return;
            }
            AdapterWorldClock adapterWorldClock = this.adapter;
            (adapterWorldClock != null ? adapterWorldClock : null).setWorldClocks(value2);
            return;
        }
        int i = result ? R.string.world_clock_saving_success : R.string.world_clock_save_failed;
        if (result) {
            IconToast.INSTANCE.showSuccess(this, i);
            this.myHandler.sendEmptyMessageDelayed(24, 400L);
        } else {
            y();
            IconToast.INSTANCE.showError(this, i);
        }
        if (operate != Operation.EDIT_COMPLETE || (value = I().getWorldClockList().getValue()) == null) {
            return;
        }
        AdapterWorldClock adapterWorldClock2 = this.adapter;
        (adapterWorldClock2 != null ? adapterWorldClock2 : null).setWorldClocks(value);
    }

    private final void L() {
        I().getWorldClockList().observe(this, new Observer() { // from class: ax8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WorldClockActivity.M(this.a, (List) obj);
            }
        });
        I().getShowLoading().observe(this, new Observer() { // from class: rw8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WorldClockActivity.N(this.a, (Pair) obj);
            }
        });
        I().getResult().observe(this, new Observer() { // from class: qw8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WorldClockActivity.O(this.a, (Pair) obj);
            }
        });
        I().isEdit().observe(this, new Observer() { // from class: zw8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WorldClockActivity.P(this.a, (Boolean) obj);
            }
        });
        I().setAppType(this.appType);
        I().getWorldCityList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(WorldClockActivity worldClockActivity, List list) {
        if (list == null) {
            return;
        }
        AdapterWorldClock adapterWorldClock = worldClockActivity.adapter;
        if (adapterWorldClock == null) {
            adapterWorldClock = null;
        }
        if (adapterWorldClock.getIsEdit()) {
            return;
        }
        AdapterWorldClock adapterWorldClock2 = worldClockActivity.adapter;
        (adapterWorldClock2 != null ? adapterWorldClock2 : null).setWorldClocks(list);
        worldClockActivity.F().setVisibility(list.isEmpty() ? 0 : 8);
        worldClockActivity.C().setEnabled(!list.isEmpty());
        worldClockActivity.D().setClickable(!list.isEmpty());
        worldClockActivity.D().setAlpha(worldClockActivity.D().isClickable() ? 1.0f : 0.3f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(WorldClockActivity worldClockActivity, Pair pair) {
        worldClockActivity.J(((Boolean) pair.getSecond()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(WorldClockActivity worldClockActivity, Pair pair) {
        if (pair.getSecond() == null) {
            return;
        }
        worldClockActivity.K((Operation) pair.getFirst(), ((Boolean) pair.getSecond()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(WorldClockActivity worldClockActivity, Boolean bool) {
        AdapterWorldClock adapterWorldClock = worldClockActivity.adapter;
        if (adapterWorldClock == null) {
            adapterWorldClock = null;
        }
        adapterWorldClock.setEdit(bool.booleanValue());
        worldClockActivity.C().setVisibility(bool.booleanValue() ? 0 : 8);
        worldClockActivity.A().setVisibility(bool.booleanValue() ? 8 : 0);
    }

    private final void Q() {
        D().setOnClickListener(new View.OnClickListener() { // from class: ww8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockActivity.R(this.a, view);
            }
        });
        B().setOnClickListener(new View.OnClickListener() { // from class: xw8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockActivity.S(this.a, view);
            }
        });
        C().setOnClickListener(new View.OnClickListener() { // from class: uw8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockActivity.T(this.a, view);
            }
        });
        getLeft().setOnClickListener(new View.OnClickListener() { // from class: vw8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockActivity.U(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(WorldClockActivity worldClockActivity, View view) {
        worldClockActivity.I().setIsEdit(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(WorldClockActivity worldClockActivity, View view) {
        Intent intent = new Intent(worldClockActivity, (Class<?>) WorldClockAddActivity.class);
        HMDeviceType hMDeviceType = worldClockActivity.deviceType;
        if (hMDeviceType == null) {
            hMDeviceType = null;
        }
        intent.putExtra("device_type", hMDeviceType);
        worldClockActivity.startActivityForResult(intent, 101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(WorldClockActivity worldClockActivity, View view) {
        worldClockActivity.I().updateEditSource(worldClockActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(WorldClockActivity worldClockActivity, View view) {
        if (Intrinsics.areEqual(worldClockActivity.I().isEdit().getValue(), Boolean.TRUE)) {
            worldClockActivity.I().setIsEdit(false);
        } else {
            worldClockActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V(WorldClockActivity worldClockActivity, View view) {
        if (!(view.getTag() instanceof WorldClockBean)) {
            return true;
        }
        Object tag = view.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.worldclock.bean.WorldClockBean");
        worldClockActivity.e0((WorldClockBean) tag);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(WorldClockActivity worldClockActivity, View view) {
        if (view.getTag() instanceof WorldClockBean) {
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.worldclock.bean.WorldClockBean");
            worldClockActivity.e0((WorldClockBean) tag);
        }
    }

    private final void X(AppType appType) {
        if (appType == AppType.MIDONG) {
            WorldClockExpandKt.setUnifyTitleStyle$default(this, null, getString(R.string.world_clock), null, 5, null);
            return;
        }
        int color = ContextCompat.getColor(this, R.color.cl_ffedeff0);
        getTitleTextView().setTextSize(14.0f);
        int color2 = ContextCompat.getColor(this, R.color.cl_b3000000);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, color, getString(R.string.world_clock), true);
        setBaseTitleColor(color2);
    }

    private final void Y() {
        HMDeviceSource hMDeviceSource = this.deviceSource;
        if (hMDeviceSource == null) {
            hMDeviceSource = null;
        }
        if (hMDeviceSource != HMDeviceSource.MILI_KONGMING_L) {
            HMDeviceSource hMDeviceSource2 = this.deviceSource;
            if ((hMDeviceSource2 != null ? hMDeviceSource2 : null) != HMDeviceSource.MILI_KONGMING) {
                return;
            }
        }
        Analytics.recordEvent(new CountEventBuilder(WORLD_CLOCK_SET_NUM));
    }

    private final void Z() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("device_source");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMDeviceSource");
        HMDeviceSource hMDeviceSource = (HMDeviceSource) serializableExtra;
        this.deviceSource = hMDeviceSource;
        this.deviceType = hMDeviceSource.getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        EventBus eventBus = EventBus.getDefault();
        HMDeviceType hMDeviceType = this.deviceType;
        if (hMDeviceType == null) {
            hMDeviceType = null;
        }
        HMDeviceSource hMDeviceSource = this.deviceSource;
        eventBus.post(new WorldClockChangeEvent(hMDeviceType, hMDeviceSource != null ? hMDeviceSource : null));
    }

    private final void b0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        TimeChangeReceiver timeChangeReceiver = new TimeChangeReceiver();
        this.timeChangeReceiver = timeChangeReceiver;
        registerReceiver(timeChangeReceiver, intentFilter);
    }

    private final void c0(String msg) {
        Message message = new Message();
        message.what = 22;
        Bundle bundle = new Bundle();
        bundle.putString("content", msg);
        message.setData(bundle);
        this.myHandler.sendMessageDelayed(message, 500L);
        this.myHandler.sendEmptyMessageDelayed(23, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(boolean enable) {
        G().setVisibility(enable ? 8 : 0);
    }

    private final void e0(final WorldClockBean worldClockBean) {
        AlertDialogFragment alertDialogFragment;
        AlertDialogFragment.Builder message;
        AlertDialogFragment.Builder negativeButton;
        if (this.deleteDialog == null) {
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
            this.builder = builder;
            AlertDialogFragment.Builder cancelable = builder.setCancelable(true);
            AlertDialogFragment alertDialogFragmentCreate = null;
            if (cancelable != null && (message = cancelable.setMessage(getString(R.string.world_clock_delete_title))) != null && (negativeButton = message.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: sw8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    WorldClockActivity.f0(dialogInterface, i);
                }
            })) != null) {
                alertDialogFragmentCreate = negativeButton.create();
            }
            this.deleteDialog = alertDialogFragmentCreate;
        }
        AlertDialogFragment.Builder builder2 = this.builder;
        if (builder2 != null) {
            builder2.setPositiveButton(getString(R.string.delete), new DialogInterface.OnClickListener() { // from class: pw8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    WorldClockActivity.g0(this.a, worldClockBean, dialogInterface, i);
                }
            });
        }
        AlertDialogFragment alertDialogFragment2 = this.deleteDialog;
        if (!((alertDialogFragment2 == null || alertDialogFragment2.isShowing()) ? false : true) || (alertDialogFragment = this.deleteDialog) == null) {
            return;
        }
        alertDialogFragment.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(WorldClockActivity worldClockActivity, WorldClockBean worldClockBean, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (Intrinsics.areEqual(worldClockActivity.I().isEdit().getValue(), Boolean.TRUE)) {
            AdapterWorldClock adapterWorldClock = worldClockActivity.adapter;
            if (adapterWorldClock == null) {
                adapterWorldClock = null;
            }
            adapterWorldClock.removeItem(worldClockBean);
        }
        worldClockActivity.I().deleteWorldClock(worldClockActivity, worldClockBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(String msg) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2;
        boolean z = false;
        if (this.mLoadingDialog == null) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
            this.mLoadingDialog = loadingDialogShowDialog;
            if (loadingDialogShowDialog != null) {
                loadingDialogShowDialog.setCancelable(false);
            }
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (loadingDialog3 != null && !loadingDialog3.isShowing()) {
            z = true;
        }
        if (z && (loadingDialog2 = this.mLoadingDialog) != null) {
            loadingDialog2.show();
        }
        if (TextUtils.isEmpty(msg) || (loadingDialog = this.mLoadingDialog) == null) {
            return;
        }
        loadingDialog.setMessage(msg);
    }

    private final void i0(Button btn, @IdRes int layerId) {
        Drawable[] compoundDrawables = btn.getCompoundDrawables();
        LayerDrawable layerDrawable = null;
        Drawable[] drawableArr = compoundDrawables.length == 4 ? compoundDrawables : null;
        if (drawableArr == null) {
            return;
        }
        if (drawableArr[1] instanceof LayerDrawable) {
            Drawable drawable = drawableArr[1];
            Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            layerDrawable = (LayerDrawable) drawable;
        }
        if (layerDrawable == null) {
            return;
        }
        Drawable drawable2 = layerDrawable.getDrawable(0);
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(layerId);
        DensityUtils densityUtils = DensityUtils.INSTANCE;
        int iDip2px = densityUtils.dip2px(this, 8.0f);
        int iDip2px2 = densityUtils.dip2px(this, 20.0f);
        int iDip2px3 = densityUtils.dip2px(this, 36.0f);
        drawable2.setBounds(0, 0, iDip2px3, iDip2px3);
        int i = iDip2px2 + iDip2px;
        drawableFindDrawableByLayerId.setBounds(iDip2px, iDip2px, i, i);
        int color = ContextCompat.getColor(this, R.color.s1);
        if (Build.VERSION.SDK_INT >= 21) {
            drawableFindDrawableByLayerId.setTint(color);
        } else {
            drawableFindDrawableByLayerId.mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        btn.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    private final void initRecyclerView() {
        AdapterWorldClock adapterWorldClock = new AdapterWorldClock();
        this.adapter = adapterWorldClock;
        adapterWorldClock.setLongClickListener(new View.OnLongClickListener() { // from class: yw8
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return WorldClockActivity.V(this.a, view);
            }
        });
        AdapterWorldClock adapterWorldClock2 = this.adapter;
        if (adapterWorldClock2 == null) {
            adapterWorldClock2 = null;
        }
        adapterWorldClock2.setAppType(this.appType);
        AdapterWorldClock adapterWorldClock3 = this.adapter;
        if (adapterWorldClock3 == null) {
            adapterWorldClock3 = null;
        }
        adapterWorldClock3.setRemoveClickListener(new View.OnClickListener() { // from class: tw8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockActivity.W(this.a, view);
            }
        });
        RecyclerView recyclerViewH = H();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        Unit unit = Unit.INSTANCE;
        recyclerViewH.setLayoutManager(linearLayoutManager);
        H().addItemDecoration(new RecyclerItemDecoration(this, 0, DensityUtils.INSTANCE.dip2px(this, 1.0f), ContextCompat.getColor(this, R.color.s4)));
        RecyclerView recyclerViewH2 = H();
        AdapterWorldClock adapterWorldClock4 = this.adapter;
        if (adapterWorldClock4 == null) {
            adapterWorldClock4 = null;
        }
        recyclerViewH2.setAdapter(adapterWorldClock4);
        final RecyclerViewTouchHelper recyclerViewTouchHelper = new RecyclerViewTouchHelper(new TouchCallback(this));
        recyclerViewTouchHelper.setEnableDrag(false);
        recyclerViewTouchHelper.setEnableSwipe(false);
        recyclerViewTouchHelper.attachToRecyclerView(H());
        AdapterWorldClock adapterWorldClock5 = this.adapter;
        (adapterWorldClock5 != null ? adapterWorldClock5 : null).setMDragStartListener(new OnStartDragListener() { // from class: com.huami.worldclock.home.WorldClockActivity.initRecyclerView.4
            @Override // com.huami.worldclock.move.OnStartDragListener
            public void onStartDrag(@NotNull RecyclerView.ViewHolder viewHolder) {
                recyclerViewTouchHelper.startDrag(viewHolder);
            }
        });
    }

    private final void initView() {
        if (this.appType == AppType.MIDONG) {
            i0(B(), R.id.world_clock_layer_svg_add);
            i0(D(), R.id.world_clock_layer_svg_edit);
        }
        initRecyclerView();
        ScopeComponents scopeComponents = DeviceScopesAndQualifierKt.getScopeComponents(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this));
        if (scopeComponents == null) {
            return;
        }
        scopeComponents.getBTStatusFragment(R.id.container, getSupportFragmentManager(), new BLEStatueListenerAdapterSimple() { // from class: com.huami.worldclock.home.WorldClockActivity.initView.1
            @Override // com.huami.worldclock.proxy.BLEStatueListenerAdapterSimple
            public void onEnableChange(boolean enable) {
                BLEStatueListenerAdapterSimple.DefaultImpls.onEnableChange(this, enable);
                WorldClockActivity.this.d0(enable);
            }
        });
    }

    @JvmStatic
    public static final void navigation2WorldClock(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource) {
        INSTANCE.navigation2WorldClock(context, hMDeviceSource);
    }

    private final void x() {
        if (this.appType == AppType.MIDONG) {
            setTheme(R.style.Theme_App_Zepp);
        }
    }

    private final void y() {
        this.myHandler.removeMessages(22);
        this.myHandler.removeMessages(23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final AppType getAppType() {
        return this.appType;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        WorldClockBean worldClockBean;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 101 || resultCode != 102 || data == null || (worldClockBean = (WorldClockBean) data.getParcelableExtra(WorldClockAddActivity.CHOOSECITY)) == null) {
            return;
        }
        I().addNewWorldClock(this, worldClockBean);
        Y();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x();
        setContentView(E());
        X(this.appType);
        Z();
        Q();
        initView();
        L();
        b0();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        z();
        y();
        AlertDialogFragment alertDialogFragment = this.deleteDialog;
        if (alertDialogFragment != null) {
            alertDialogFragment.dismiss();
        }
        TimeChangeReceiver timeChangeReceiver = this.timeChangeReceiver;
        if (timeChangeReceiver == null) {
            timeChangeReceiver = null;
        }
        unregisterReceiver(timeChangeReceiver);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        if (keyCode != 4 || !Intrinsics.areEqual(I().isEdit().getValue(), Boolean.TRUE)) {
            return super.onKeyDown(keyCode, event);
        }
        I().setIsEdit(false);
        return true;
    }

    @Override // com.huami.worldclock.move.OnItemTouchCallbackListener
    public boolean onMove(int srcPosition, int targetPosition) {
        if (srcPosition < 0) {
            return false;
        }
        AdapterWorldClock adapterWorldClock = this.adapter;
        if (adapterWorldClock == null) {
            adapterWorldClock = null;
        }
        if (srcPosition >= adapterWorldClock.getWorldClocks().size() || targetPosition < 0) {
            return false;
        }
        AdapterWorldClock adapterWorldClock2 = this.adapter;
        if (adapterWorldClock2 == null) {
            adapterWorldClock2 = null;
        }
        if (targetPosition >= adapterWorldClock2.getWorldClocks().size()) {
            return false;
        }
        I().swapList(srcPosition, targetPosition);
        AdapterWorldClock adapterWorldClock3 = this.adapter;
        (adapterWorldClock3 != null ? adapterWorldClock3 : null).swapItem(srcPosition, targetPosition);
        return true;
    }

    @Override // com.huami.worldclock.move.OnItemTouchCallbackListener
    public void onSwiped(int adapterPosition) {
    }

    public final void setAppType(@NotNull AppType appType) {
        this.appType = appType;
    }
}
