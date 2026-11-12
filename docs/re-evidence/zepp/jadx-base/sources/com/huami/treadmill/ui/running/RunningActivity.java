package com.huami.treadmill.ui.running;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.Keeper;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.tts.DistanceVoiceInfo;
import com.huami.mifit.sportlib.tts.RunningPlayer;
import com.huami.mifit.sportlib.tts.SpeedVoiceInfo;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.R;
import com.huami.treadmill.data.BoltRunnerData;
import com.huami.treadmill.data.BoltSportCommand;
import com.huami.treadmill.data.BoltSportState;
import com.huami.treadmill.data.HrTips;
import com.huami.treadmill.data.InMachineStatus;
import com.huami.treadmill.data.InProgress;
import com.huami.treadmill.data.InTreadmillData;
import com.huami.treadmill.data.SyncStatus;
import com.huami.treadmill.eventbus.SportCommandEvent;
import com.huami.treadmill.eventbus.SportFTMEvent;
import com.huami.treadmill.eventbus.StatisticsRefreshEvent;
import com.huami.treadmill.eventbus.SyncStatusEvent;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.component.AvatarTailView;
import com.huami.treadmill.ui.component.HrRingView;
import com.huami.treadmill.ui.running.RunningActivity;
import com.huami.treadmill.ui.setting.AdjustMode;
import com.huami.treadmill.ui.setting.PauseFragment;
import com.huami.treadmill.ui.setting.TdSettingFragment;
import com.huami.treadmill.ui.setting.VariableSpeedFragment;
import com.huami.treadmill.util.HeartRateIntervalUtils;
import com.huami.treadmill.util.SportDataHelper;
import com.huami.treadmill.util.TimeUtils;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\b\b*\u0001V\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\bZ\u0010[J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001dJ\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eJ\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u0002H\u0014J\b\u0010#\u001a\u00020\u0002H\u0016J\u000e\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u0005R\u0016\u0010/\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0005R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010>R\u0016\u0010E\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0018\u0010H\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010IR\u0016\u0010O\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010NR\u0016\u0010Q\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u0005R\u0016\u0010S\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\u0005R\u0016\u0010U\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010NR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006]"}, d2 = {"Lcom/huami/treadmill/ui/running/RunningActivity;", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "", "initView", "H", LogUtil.I, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", com.google.android.exoplayer2.text.ttml.b.r, "o", "showDetail", "E", "", "msg", LogUtil.D, GoogleApiAvailabilityLight.b, DTransferConstants.SEARCH_KEY, "m", "", "realPaceSpeed", "z", "v", "y", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/treadmill/eventbus/SportCommandEvent;", "commandEvent", "onEventMainThread", "Lcom/huami/treadmill/eventbus/SportFTMEvent;", "Lcom/huami/treadmill/eventbus/SyncStatusEvent;", "statusEvent", "hasFocus", "onWindowFocusChanged", "onDestroy", "onBackPressed", "", Constants.DATA_KEY_HR, "remindHRIfNeed", "Lcom/huami/treadmill/ui/running/RunningViewModel;", "a", "Lcom/huami/treadmill/ui/running/RunningViewModel;", "viewModel", "b", "mTotalDistance", "c", "F", "mCurSpeed", GoogleApiAvailabilityLight.a, "mCurHeartRate", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "e", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "f", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "mAlertDialog", "g", "connectFailedDialog", "", "h", "J", "mFirstMaxHRTime", "i", "mMaxHRRemindTime", z.j, "mFirstLowSpeedTime", hl.k, "mLowSpeedRemindTime", "l", "Ljava/lang/Integer;", "mConfigHr", "Ljava/lang/Boolean;", "mConfigHrEnable", "mConfigPace", "mConfigPaceEnable", "mConfigVoicePlay", "Z", "mIsMetric", "r", "mLastDistance", SOAP.XMLNS, "mLastTime", "t", "mFirstDistance", "com/huami/treadmill/ui/running/RunningActivity$mBluetoothReceiver$1", "u", "Lcom/huami/treadmill/ui/running/RunningActivity$mBluetoothReceiver$1;", "mBluetoothReceiver", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class RunningActivity extends BaseFragmentActivity {

    @NotNull
    public static final String IS_RUNNING = "is_running";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RunningViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mTotalDistance;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mCurSpeed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mCurHeartRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment mAlertDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment connectFailedDialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long mFirstMaxHRTime = -1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long mMaxHRRemindTime = -1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long mFirstLowSpeedTime = -1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long mLowSpeedRemindTime = -1;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Integer mConfigHr = 0;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Boolean mConfigHrEnable;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Integer mConfigPace;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private Boolean mConfigPaceEnable;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private Boolean mConfigVoicePlay;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean mIsMetric;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int mLastDistance;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int mLastTime;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean mFirstDistance;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final RunningActivity$mBluetoothReceiver$1 mBluetoothReceiver;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String v = RunningActivity.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/treadmill/ui/running/RunningActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "id", "", "startMe", "", "IS_RUNNING", "Ljava/lang/String;", "TAG", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, boolean id) {
            Intent intent = new Intent(context, (Class<?>) RunningActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(RunningActivity.IS_RUNNING, id);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[HrTips.values().length];
            iArr[HrTips.NO_HEART_RATE_DEVICE.ordinal()] = 1;
            iArr[HrTips.DEVICE_NOT_SUPPORT.ordinal()] = 2;
            iArr[HrTips.DEVICE_DISCONNECTED.ordinal()] = 3;
            iArr[HrTips.BLUETOOTH_NO_ON.ordinal()] = 4;
            iArr[HrTips.NO_TIPS.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BoltSportCommand.values().length];
            iArr2[BoltSportCommand.PAUSE.ordinal()] = 1;
            iArr2[BoltSportCommand.STOP.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SyncStatus.values().length];
            iArr3[SyncStatus.STOP.ordinal()] = 1;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            TdSettingFragment.INSTANCE.newInstance().showSettingFragment(RunningActivity.this.getSupportFragmentManager());
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
            return "";
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
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lcom/huami/treadmill/data/SyncStatus;", "status", "Lcom/huami/treadmill/data/InProgress;", "<anonymous parameter 1>", "", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function3<SyncStatus, InProgress, Boolean, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(3);
            this.a = z;
        }

        public final void a(@NotNull SyncStatus syncStatus, @NotNull InProgress inProgress, boolean z) {
            EventBus.getDefault().post(new SyncStatusEvent(syncStatus, z, this.a));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SyncStatus syncStatus, InProgress inProgress, Boolean bool) {
            a(syncStatus, inProgress, bool.booleanValue());
            return Unit.INSTANCE;
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
        public final String invoke() {
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.treadmill.ui.running.RunningActivity$mBluetoothReceiver$1] */
    public RunningActivity() {
        Boolean bool = Boolean.FALSE;
        this.mConfigHrEnable = bool;
        this.mConfigPace = 0;
        this.mConfigPaceEnable = bool;
        this.mConfigVoicePlay = bool;
        this.mIsMetric = true;
        this.mBluetoothReceiver = new BroadcastReceiver() { // from class: com.huami.treadmill.ui.running.RunningActivity$mBluetoothReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                AlertDialogFragment alertDialogFragment;
                if (Intrinsics.areEqual(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                    if (intExtra == 10) {
                        this.a.v();
                        return;
                    }
                    if (intExtra != 12) {
                        return;
                    }
                    AlertDialogFragment alertDialogFragment2 = this.a.mAlertDialog;
                    if (!(alertDialogFragment2 == null ? null : Boolean.valueOf(alertDialogFragment2.isShowing())).booleanValue() || (alertDialogFragment = this.a.mAlertDialog) == null) {
                        return;
                    }
                    alertDialogFragment.dismiss();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        AlertDialogFragment alertDialogFragment;
        if (this.connectFailedDialog == null) {
            this.connectFailedDialog = new AlertDialogFragment.Builder(getApplicationContext()).setCancelable(true).setTitle(R.string.td_bolt_connect_failed).setMessage(R.string.td_bolt_connect_failed_content).setNegativeButton(getString(R.string.td_exit), new DialogInterface.OnClickListener() { // from class: ag6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    RunningActivity.B(this.a, dialogInterface, i);
                }
            }).setPositiveButton(getString(R.string.td_retry), new DialogInterface.OnClickListener() { // from class: zf6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    RunningActivity.C(this.a, dialogInterface, i);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment2 = this.connectFailedDialog;
        if (!((alertDialogFragment2 == null || alertDialogFragment2.isShowing()) ? false : true) || (alertDialogFragment = this.connectFailedDialog) == null) {
            return;
        }
        alertDialogFragment.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(RunningActivity runningActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        runningActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(RunningActivity runningActivity, DialogInterface dialogInterface, int i) {
        ProxyTreadmill.INSTANCE.getInstance().connectBolt();
        runningActivity.D(runningActivity.getString(R.string.td_connecting));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(String msg) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2;
        if (this.mLoadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(this);
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (((loadingDialog3 == null || loadingDialog3.isShowing()) ? false : true) && (loadingDialog2 = this.mLoadingDialog) != null) {
            loadingDialog2.show();
        }
        LoadingDialog loadingDialog4 = this.mLoadingDialog;
        if (loadingDialog4 != null) {
            loadingDialog4.setCancelable(false);
        }
        if (TextUtils.isEmpty(msg) || (loadingDialog = this.mLoadingDialog) == null) {
            return;
        }
        loadingDialog.setMessage(msg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(final boolean showDetail) {
        RunningPlayer runningPlayer;
        if (Intrinsics.areEqual(this.mConfigVoicePlay, Boolean.TRUE) && (runningPlayer = RunningPlayer.getInstance()) != null) {
            runningPlayer.playStop();
        }
        D("");
        Observable.timer(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: dg6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RunningActivity.F(this.a, showDetail, (Long) obj);
            }
        }, new Action1() { // from class: fg6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RunningActivity.G((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(RunningActivity runningActivity, boolean z, Long l) {
        if (Intrinsics.areEqual(ProxyTreadmill.INSTANCE.getInstance().syncBoltGpsData(new d(z)), Boolean.FALSE)) {
            runningActivity.n();
            runningActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Throwable th) {
        HMLog.warn$default(null, th, e.a, 1, null);
    }

    private final void H() {
        ((AvatarTailView) findViewById(R.id.avatar_tail_vw)).setAvatarImageView(ProxyTreadmill.INSTANCE.getInstance().getRunnerData());
    }

    private final void I() {
        HrTips hrDeviceStatus = ProxyTreadmill.INSTANCE.getInstance().getHrDeviceStatus();
        String string = "";
        String str = this.mCurHeartRate > 0 ? new String[]{getResources().getString(R.string.td_hr_section_rest), getResources().getString(R.string.td_hr_section_warm_up), getResources().getString(R.string.td_hr_section_fat_burn), getResources().getString(R.string.td_hr_section_heart_lung_strengthen), getResources().getString(R.string.td_hr_section_stamina_strengthen), getResources().getString(R.string.td_hr_section_anaerobic_limit)}[HeartRateIntervalUtils.getHrInterval(this.mCurHeartRate)] : "";
        TypefaceTextView typefaceTextView = (TypefaceTextView) findViewById(R.id.td_running_fat_tip_tx);
        int i = hrDeviceStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hrDeviceStatus.ordinal()];
        if (i == 1 || i == 2) {
            string = getResources().getString(R.string.td_running_hr_no_device);
        } else if (i == 3) {
            string = getResources().getString(R.string.td_running_hr_no_connection);
        } else if (i == 4) {
            string = getResources().getString(R.string.td_running_hr_no_device);
        } else if (i == 5) {
            boolean z = this.mCurHeartRate > 0;
            if (z) {
                string = str;
            } else if (z) {
                throw new NoWhenBranchMatchedException();
            }
        }
        typefaceTextView.setText(string);
    }

    private final void initView() {
        I();
        H();
    }

    private final void m() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void o() {
        ViewExtKt.smartClick$default((RelativeLayout) findViewById(R.id.td_running_setting_btn), 0L, new a(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p() {
        AlertDialogFragment alertDialogFragment = this.connectFailedDialog;
        if (alertDialogFragment != null) {
            if (alertDialogFragment != null && alertDialogFragment.isShowing()) {
                return true;
            }
        }
        return false;
    }

    private final void q() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.addFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final RunningActivity runningActivity, Long l) {
        PauseFragment.INSTANCE.newInstance().showPauseFragment(runningActivity.getSupportFragmentManager(), runningActivity.mTotalDistance, new PauseFragment.StatusListener() { // from class: com.huami.treadmill.ui.running.RunningActivity$onCreate$1$1
            @Override // com.huami.treadmill.ui.setting.PauseFragment.StatusListener
            public void onFinish(boolean showDetail) {
                this.a.E(showDetail);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Throwable th) {
        HMLog.warn$default(null, th, b.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(RunningActivity runningActivity, Long l) {
        ProxyTreadmill.INSTANCE.getInstance().showDetail(runningActivity.getApplicationContext(), runningActivity, false, null, 0, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Throwable th) {
        HMLog.warn$default(null, th, c.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        AlertDialogFragment alertDialogFragment;
        if (this.mAlertDialog == null) {
            this.mAlertDialog = new AlertDialogFragment.Builder(getApplicationContext()).setCancelable(true).setTitle(R.string.td_running_dialog_open_ble).setNegativeButton(getString(R.string.td_running_dialog_invoke_ble), new DialogInterface.OnClickListener() { // from class: yf6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    RunningActivity.w(this.a, dialogInterface, i);
                }
            }).setPositiveButton(getString(R.string.td_running_dialog_quit_sport), new DialogInterface.OnClickListener() { // from class: xf6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    RunningActivity.x(this.a, dialogInterface, i);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment2 = this.mAlertDialog;
        if ((alertDialogFragment2 == null ? null : Boolean.valueOf(alertDialogFragment2.isShowing())).booleanValue() || (alertDialogFragment = this.mAlertDialog) == null) {
            return;
        }
        alertDialogFragment.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(RunningActivity runningActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        runningActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(RunningActivity runningActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        runningActivity.finish();
    }

    private final void y() {
        getApplicationContext().registerReceiver(this.mBluetoothReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        ProxyTreadmill.INSTANCE.getInstance().setConnectedListener(new RunningActivity$registerReceiver$1(this));
    }

    private final boolean z(float realPaceSpeed) {
        if (!this.mConfigPaceEnable.booleanValue()) {
            this.mFirstLowSpeedTime = -1L;
            return false;
        }
        float fConvertTospkm = RunDataConversion.convertTospkm(realPaceSpeed);
        if (fConvertTospkm > 18000.0f || fConvertTospkm <= this.mConfigPace.intValue()) {
            this.mFirstLowSpeedTime = -1L;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.mFirstLowSpeedTime;
        if (j == -1) {
            this.mFirstLowSpeedTime = jCurrentTimeMillis;
            return false;
        }
        if (jCurrentTimeMillis - j <= 15000 || jCurrentTimeMillis - this.mLowSpeedRemindTime <= 40000) {
            return false;
        }
        this.mFirstLowSpeedTime = -1L;
        this.mLowSpeedRemindTime = jCurrentTimeMillis;
        if (fConvertTospkm > 1800.0f) {
            fConvertTospkm = 1800.0f;
        }
        int i = this.mIsMetric ? (int) fConvertTospkm : (int) (((double) fConvertTospkm) * 1.609344d);
        if (GPSDataController.getInstance().getSportType() == 9) {
            SpeedVoiceInfo speedVoiceInfo = new SpeedVoiceInfo();
            speedVoiceInfo.speed = NumberFormatter.format(3600 / (i * 1.0f), 1, new int[0]);
            speedVoiceInfo.isMetric = this.mIsMetric;
            RunningPlayer.getInstance().playSpeedWarn(speedVoiceInfo);
        } else {
            RunningPlayer.getInstance().playPaceWarn(i);
            ProxyTreadmill.INSTANCE.getInstance().vibratePace((int) fConvertTospkm, i);
        }
        return true;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        RunningPlayer runningPlayer;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);
        this.viewModel = (RunningViewModel) AppCompatActivityExtKt.obtainViewModel(this, RunningViewModel.class);
        EventBus.getDefault().register(this);
        o();
        initView();
        ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
        Boolean configScreenOnState = companion.getInstance().getConfigScreenOnState();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(configScreenOnState, bool)) {
            q();
        } else {
            m();
        }
        boolean booleanExtra = getIntent().getBooleanExtra(IS_RUNNING, false);
        this.mConfigVoicePlay = companion.getInstance().getConfigVoicePlay();
        RunningPlayer.initIfNeed(getApplicationContext());
        RunningPlayer runningPlayer2 = RunningPlayer.getInstance();
        if (runningPlayer2 != null) {
            runningPlayer2.setSportType(25);
        }
        if (!booleanExtra && Intrinsics.areEqual(this.mConfigVoicePlay, bool) && (runningPlayer = RunningPlayer.getInstance()) != null) {
            runningPlayer.playStart();
        }
        y();
        if (booleanExtra) {
            SportDataHelper.INSTANCE.getInstance().registerSportData();
        }
        SportDataHelper.INSTANCE.getInstance().setIsRouterLine(false);
        if (companion.getInstance().getSportState() == BoltSportState.PAUSED) {
            Observable.timer(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: cg6
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    RunningActivity.r(this.a, (Long) obj);
                }
            }, new Action1() { // from class: gg6
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    RunningActivity.s((Throwable) obj);
                }
            });
        }
        this.mConfigHr = companion.getInstance().getConfigRemindHeartRate();
        this.mConfigHrEnable = companion.getInstance().getConfigRemindHREnable();
        this.mConfigPace = companion.getInstance().getConfigRemindPace();
        this.mConfigPaceEnable = companion.getInstance().getConfigRemindPaceEnable();
        BoltRunnerData runnerData = companion.getInstance().getRunnerData();
        this.mIsMetric = runnerData == null ? true : runnerData.isMetric();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        m();
        RunningPlayer runningPlayer = RunningPlayer.getInstance();
        if (runningPlayer != null) {
            runningPlayer.exit();
        }
        if (this.mBluetoothReceiver != null) {
            getApplicationContext().unregisterReceiver(this.mBluetoothReceiver);
        }
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        n();
        super.onDestroy();
    }

    public final void onEventMainThread(@NotNull SportCommandEvent commandEvent) {
        RunningPlayer runningPlayer;
        int i = WhenMappings.$EnumSwitchMapping$1[commandEvent.getCommand().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            E(true);
        } else {
            if (Intrinsics.areEqual(this.mConfigVoicePlay, Boolean.TRUE) && (runningPlayer = RunningPlayer.getInstance()) != null) {
                runningPlayer.playPause(25);
            }
            PauseFragment.INSTANCE.newInstance().showPauseFragment(getSupportFragmentManager(), this.mTotalDistance, new PauseFragment.StatusListener() { // from class: com.huami.treadmill.ui.running.RunningActivity.onEventMainThread.1
                @Override // com.huami.treadmill.ui.setting.PauseFragment.StatusListener
                public void onFinish(boolean showDetail) {
                    RunningActivity.this.E(showDetail);
                }
            });
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(4102);
        }
    }

    public final void remindHRIfNeed(int hr) {
        if (hr < this.mConfigHr.intValue() || !this.mConfigHrEnable.booleanValue()) {
            this.mFirstMaxHRTime = -1L;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.mFirstMaxHRTime;
        if (j == -1) {
            this.mFirstMaxHRTime = jCurrentTimeMillis;
            return;
        }
        if (jCurrentTimeMillis - j <= 15000 || jCurrentTimeMillis - this.mMaxHRRemindTime <= 40000) {
            return;
        }
        this.mFirstMaxHRTime = -1L;
        this.mMaxHRRemindTime = jCurrentTimeMillis;
        RunningPlayer runningPlayer = RunningPlayer.getInstance();
        if (runningPlayer == null) {
            return;
        }
        runningPlayer.playHRWarn(hr);
    }

    public final void onEventMainThread(@NotNull SportFTMEvent commandEvent) {
        int i;
        InTreadmillData treadmillData = commandEvent.getTreadmillData();
        InMachineStatus machineStatus = commandEvent.getMachineStatus();
        if (treadmillData != null) {
            this.mTotalDistance = treadmillData.getTotalDistance();
            this.mCurSpeed = treadmillData.getInstantaneousSpeed();
            this.mCurHeartRate = treadmillData.getHeartRate();
            if (Intrinsics.areEqual(this.mConfigVoicePlay, Boolean.TRUE)) {
                if (!this.mFirstDistance) {
                    this.mLastDistance = treadmillData.getTotalDistance();
                    this.mLastTime = treadmillData.getElapsedTime();
                    this.mFirstDistance = true;
                }
                boolean z = this.mIsMetric;
                if (z) {
                    i = 1000;
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 1609;
                }
                if (treadmillData.getTotalDistance() - this.mLastDistance >= i) {
                    RunningPlayer.getInstance().playDistance(new DistanceVoiceInfo(treadmillData.getTotalDistance(), treadmillData.getElapsedTime(), treadmillData.getElapsedTime() - this.mLastTime, treadmillData.getHeartRate(), 25, this.mIsMetric, true));
                    this.mLastDistance = treadmillData.getTotalDistance();
                    this.mLastTime = treadmillData.getElapsedTime();
                }
            }
            int i2 = R.id.avatar_tail_vw;
            ((AvatarTailView) findViewById(i2)).setDistance(treadmillData.getTotalDistance());
            ((AvatarTailView) findViewById(i2)).setSpeed(treadmillData.getInstantaneousSpeed());
            ((TypefaceTextView) findViewById(R.id.td_running_time_tx)).setText(TimeUtils.INSTANCE.getTimeString(Integer.valueOf(treadmillData.getElapsedTime())));
            if (ProxyTreadmill.INSTANCE.getInstance().getHrDeviceStatus() == HrTips.NO_TIPS) {
                if (treadmillData.getHeartRate() > 0) {
                    ((TypefaceTextView) findViewById(R.id.td_running_fat_tx)).setText(String.valueOf(treadmillData.getHeartRate()));
                } else {
                    ((TypefaceTextView) findViewById(R.id.td_running_fat_tx)).setText("--");
                }
                ((HrRingView) findViewById(R.id.hr_ring_vw)).setHr(treadmillData.getHeartRate());
                remindHRIfNeed(treadmillData.getHeartRate());
            } else {
                ((TypefaceTextView) findViewById(R.id.td_running_fat_tx)).setText("--");
                ((HrRingView) findViewById(R.id.hr_ring_vw)).setHr(0);
            }
            ((TypefaceTextView) findViewById(R.id.td_running_round_tx)).setText(String.valueOf(treadmillData.getTotalDistance() / 400));
        }
        if (machineStatus != null) {
            byte op = machineStatus.getOp();
            InMachineStatus.Companion companion = InMachineStatus.INSTANCE;
            if (op == companion.getOP_SPEED()) {
                byte b2 = machineStatus.getData()[0];
                if (b2 == companion.getSPEED_INC()) {
                    VariableSpeedFragment.INSTANCE.newInstance().showVsFragment(getSupportFragmentManager(), (int) (((double) this.mCurSpeed) * 3.6d), AdjustMode.ADJUST_FAST, 0.5f);
                } else if (b2 == companion.getSPEED_DEC()) {
                    VariableSpeedFragment.INSTANCE.newInstance().showVsFragment(getSupportFragmentManager(), (int) (((double) this.mCurSpeed) * 3.6d), AdjustMode.ADJUST_SLOW, 0.5f);
                }
            }
        }
        I();
    }

    public final void onEventMainThread(@NotNull SyncStatusEvent statusEvent) {
        if (WhenMappings.$EnumSwitchMapping$2[statusEvent.getStatus().ordinal()] == 1) {
            n();
            EventBus.getDefault().post(new StatisticsRefreshEvent(StatisticsRefreshEvent.SECTION_TREADMILL_RECORD_INFO));
            if (statusEvent.getResult() && statusEvent.getShowDetail() && this.mTotalDistance >= Keeper.getMinNoticeDisThreshold(getApplicationContext())) {
                Observable.timer(300L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: bg6
                    @Override // rx.functions.Action1
                    public final void call(Object obj) {
                        RunningActivity.t(this.a, (Long) obj);
                    }
                }, new Action1() { // from class: eg6
                    @Override // rx.functions.Action1
                    public final void call(Object obj) {
                        RunningActivity.u((Throwable) obj);
                    }
                });
            }
            finish();
        }
    }
}
