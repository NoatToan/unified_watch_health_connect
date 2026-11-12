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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.Keeper;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.tts.DistanceVoiceInfo;
import com.huami.mifit.sportlib.tts.RunningPlayer;
import com.huami.mifit.sportlib.tts.SpeedVoiceInfo;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.R;
import com.huami.treadmill.TdmillConfig;
import com.huami.treadmill.data.BoltRunnerData;
import com.huami.treadmill.data.BoltSportCommand;
import com.huami.treadmill.data.BoltSportState;
import com.huami.treadmill.data.HrTips;
import com.huami.treadmill.data.InMachineStatus;
import com.huami.treadmill.data.InProgress;
import com.huami.treadmill.data.InTreadmillData;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.MarkerList;
import com.huami.treadmill.data.SyncStatus;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.data.TdLineDetailRun;
import com.huami.treadmill.data.TdLineRuningRankItem;
import com.huami.treadmill.eventbus.SportCommandEvent;
import com.huami.treadmill.eventbus.SportFTMEvent;
import com.huami.treadmill.eventbus.StatisticsRefreshEvent;
import com.huami.treadmill.eventbus.SyncStatusEvent;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.component.SmallMapView;
import com.huami.treadmill.ui.running.LineRunningActivity;
import com.huami.treadmill.ui.setting.AdjustMode;
import com.huami.treadmill.ui.setting.PauseFragment;
import com.huami.treadmill.ui.setting.TdSettingFragment;
import com.huami.treadmill.ui.setting.VariableSpeedFragment;
import com.huami.treadmill.util.GpsHelper;
import com.huami.treadmill.util.SportDataHelper;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007*\u0001}\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001B\t¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0002H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0014J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0016H\u0014J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020$J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\rR\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\rR\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\nR\u0016\u0010C\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010\nR\u0016\u0010E\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010\nR\u0016\u0010G\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010\nR\u0018\u0010J\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010IR\u0018\u0010P\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010LR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010\nR\u0016\u0010[\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0016\u0010\\\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0016\u0010^\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u00101R\u0016\u0010a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020c\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001e\u0010o\u001a\n\u0012\u0004\u0012\u00020m\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010eR\u0016\u0010r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010s\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0016\u0010t\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010u\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010qR\u0016\u0010v\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010qR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u001c\u0010|\u001a\b\u0012\u0004\u0012\u00020{0b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010eR\u0016\u0010\u007f\u001a\u00020}8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010~¨\u0006\u0083\u0001"}, d2 = {"Lcom/huami/treadmill/ui/running/LineRunningActivity;", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "", "initView", "H", "E", "", "t", DTransferConstants.SEARCH_KEY, "showDetail", "J", "", "msg", LogUtil.I, com.google.android.exoplayer2.text.ttml.b.r, "u", "o", "", "realPaceSpeed", LogUtil.D, "z", "C", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPause", "onResume", "hasFocus", "onWindowFocusChanged", "onDestroy", "onBackPressed", "outState", "onSaveInstanceState", "Lcom/huami/treadmill/eventbus/SportCommandEvent;", "commandEvent", "onEventMainThread", "Lcom/huami/treadmill/eventbus/SportFTMEvent;", "Lcom/huami/treadmill/eventbus/SyncStatusEvent;", "statusEvent", "", Constants.DATA_KEY_HR, "remindHRIfNeed", "Lcom/huami/treadmill/ui/running/LineRunningViewModel;", "a", "Lcom/huami/treadmill/ui/running/LineRunningViewModel;", "viewModel", "b", "mTotalDistance", "c", "F", "mCurSpeed", GoogleApiAvailabilityLight.a, "mCurTime", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "e", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "f", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "mAlertDialog", "g", "connectFailedDialog", "", "h", "mFirstMaxHRTime", "i", "mMaxHRRemindTime", z.j, "mFirstLowSpeedTime", hl.k, "mLowSpeedRemindTime", "l", "Ljava/lang/Integer;", "mConfigHr", "m", "Ljava/lang/Boolean;", "mConfigHrEnable", GoogleApiAvailabilityLight.b, "mConfigPace", "mConfigPaceEnable", "mConfigVoicePlay", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lcom/huami/treadmill/ui/running/LineRunningRankAdapter;", "r", "Lcom/huami/treadmill/ui/running/LineRunningRankAdapter;", "mAdapter", SOAP.XMLNS, "mLineId", "mLineTime", "mLineNext", "v", "mLineDistance", "w", "Ljava/lang/String;", "mLineName", "", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "x", "Ljava/util/List;", "mOriginTrack", "Lcom/huami/treadmill/data/TdLineDetailRun;", "y", "Lcom/huami/treadmill/data/TdLineDetailRun;", "mOriginDetail", "mIndex", "", "Lcom/huami/treadmill/data/TdLineDetail;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "mOthers", "B", "Z", "mIsMetric", "mLastDistance", "mLastTime", "mFirstDistance", "mStopWhenEnd", "Lcom/huami/treadmill/data/BoltRunnerData;", "G", "Lcom/huami/treadmill/data/BoltRunnerData;", "mRunnerData", "Lcom/huami/treadmill/data/TdLineRuningRankItem;", "oldRankList", "com/huami/treadmill/ui/running/LineRunningActivity$mBluetoothReceiver$1", "Lcom/huami/treadmill/ui/running/LineRunningActivity$mBluetoothReceiver$1;", "mBluetoothReceiver", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class LineRunningActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String J = LineRunningActivity.class.getSimpleName();

    @NotNull
    public static final String LINE_IS_RUNNING = "line_is_running";

    @NotNull
    public static final String STARTUP_LINE_DISTANCE = "line_distance";

    @NotNull
    public static final String STARTUP_LINE_ID = "line_id";

    @NotNull
    public static final String STARTUP_LINE_NAME = "line_name";

    @NotNull
    public static final String STARTUP_LINE_NEXT = "line_next";

    @NotNull
    public static final String STARTUP_LINE_TIME = "line_time";
    public static final int STREET_MODE = 1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private List<TdLineDetail> mOthers;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean mIsMetric;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int mLastDistance;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int mLastTime;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean mFirstDistance;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean mStopWhenEnd;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private BoltRunnerData mRunnerData;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private List<TdLineRuningRankItem> oldRankList;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final LineRunningActivity$mBluetoothReceiver$1 mBluetoothReceiver;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LineRunningViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mTotalDistance;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mCurSpeed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mCurTime;

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
    @Nullable
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private LineRunningRankAdapter mAdapter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private long mLineId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long mLineTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long mLineNext;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float mLineDistance;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private String mLineName;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private List<GPSPoint> mOriginTrack;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private TdLineDetailRun mOriginDetail;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int mIndex;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u0010\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huami/treadmill/ui/running/LineRunningActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "flag", "", "id", "time", "next", "", "distance", "", "name", "", "startMe", "LINE_IS_RUNNING", "Ljava/lang/String;", "STARTUP_LINE_DISTANCE", "STARTUP_LINE_ID", "STARTUP_LINE_NAME", "STARTUP_LINE_NEXT", "STARTUP_LINE_TIME", "", "STREET_MODE", LogUtil.I, "TAG", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, boolean flag, long id, long time, long next, float distance, @NotNull String name) {
            Intent intent = new Intent(context, (Class<?>) LineRunningActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(LineRunningActivity.LINE_IS_RUNNING, flag);
            intent.putExtra("line_id", id);
            intent.putExtra("line_time", time);
            intent.putExtra(LineRunningActivity.STARTUP_LINE_NEXT, next);
            intent.putExtra("line_distance", distance);
            intent.putExtra("line_name", name);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BoltSportCommand.values().length];
            iArr[BoltSportCommand.PAUSE.ordinal()] = 1;
            iArr[BoltSportCommand.STOP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SyncStatus.values().length];
            iArr2[SyncStatus.STOP.ordinal()] = 1;
            $EnumSwitchMapping$1 = iArr2;
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
            TdSettingFragment.INSTANCE.newInstance().showSettingFragment(LineRunningActivity.this.getSupportFragmentManager());
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

    /* JADX WARN: Type inference failed for: r0v6, types: [com.huami.treadmill.ui.running.LineRunningActivity$mBluetoothReceiver$1] */
    public LineRunningActivity() {
        Boolean bool = Boolean.FALSE;
        this.mConfigHrEnable = bool;
        this.mConfigPace = 0;
        this.mConfigPaceEnable = bool;
        this.mConfigVoicePlay = bool;
        this.mLineName = "";
        this.mIsMetric = true;
        this.oldRankList = new ArrayList();
        this.mBluetoothReceiver = new BroadcastReceiver() { // from class: com.huami.treadmill.ui.running.LineRunningActivity$mBluetoothReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                AlertDialogFragment alertDialogFragment;
                if (Intrinsics.areEqual(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                    if (intExtra == 10) {
                        this.a.z();
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
    public static final void A(LineRunningActivity lineRunningActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        lineRunningActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(LineRunningActivity lineRunningActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        lineRunningActivity.finish();
    }

    private final void C() {
        getApplicationContext().registerReceiver(this.mBluetoothReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        ProxyTreadmill.INSTANCE.getInstance().setConnectedListener(new LineRunningActivity$registerReceiver$1(this));
    }

    private final boolean D(float realPaceSpeed) {
        ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
        BoltRunnerData runnerData = companion.getInstance().getRunnerData();
        boolean zBooleanValue = (runnerData == null ? null : Boolean.valueOf(runnerData.isMetric())).booleanValue();
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
        int i = zBooleanValue ? (int) fConvertTospkm : (int) (((double) fConvertTospkm) * 1.609344d);
        if (GPSDataController.getInstance().getSportType() == 9) {
            SpeedVoiceInfo speedVoiceInfo = new SpeedVoiceInfo();
            speedVoiceInfo.speed = NumberFormatter.format(3600 / (i * 1.0f), 1, new int[0]);
            speedVoiceInfo.isMetric = zBooleanValue;
            RunningPlayer.getInstance().playSpeedWarn(speedVoiceInfo);
        } else {
            RunningPlayer.getInstance().playPaceWarn(i);
            companion.getInstance().vibratePace((int) fConvertTospkm, i);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        AlertDialogFragment alertDialogFragment;
        if (this.connectFailedDialog == null) {
            this.connectFailedDialog = new AlertDialogFragment.Builder(getApplicationContext()).setCancelable(true).setTitle(R.string.td_bolt_connect_failed).setMessage(R.string.td_bolt_connect_failed_content).setNegativeButton(getString(R.string.td_exit), new DialogInterface.OnClickListener() { // from class: do4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LineRunningActivity.F(this.a, dialogInterface, i);
                }
            }).setPositiveButton(getString(R.string.td_retry), new DialogInterface.OnClickListener() { // from class: co4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LineRunningActivity.G(this.a, dialogInterface, i);
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
    public static final void F(LineRunningActivity lineRunningActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        lineRunningActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(LineRunningActivity lineRunningActivity, DialogInterface dialogInterface, int i) {
        ProxyTreadmill.INSTANCE.getInstance().connectBolt();
        lineRunningActivity.I(lineRunningActivity.getString(R.string.td_connecting));
        dialogInterface.dismiss();
    }

    private final void H() {
        View viewInflate;
        ImageView imageView;
        TextView textView;
        TextView textView2;
        List<GPSPoint> list = this.mOriginTrack;
        if (list == null) {
            return;
        }
        float f = 1000;
        this.mIndex = (list.size() * this.mTotalDistance) / ((int) (this.mLineDistance * f));
        ProxyTreadmill companion = ProxyTreadmill.INSTANCE.getInstance();
        char c2 = 0;
        if (companion != null) {
            companion.mapOnGPSLineInfoChanged(this.mOriginTrack, this.mIndex, false);
        }
        float fFloatValue = new BigDecimal((this.mTotalDistance / (this.mLineDistance * f)) * 100).setScale(1, 4).floatValue();
        ((SmallMapView) findViewById(R.id.small_map_vw)).setPos(this.mIndex);
        TypefaceTextView typefaceTextView = (TypefaceTextView) findViewById(R.id.small_map_ratio);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        typefaceTextView.setText(String.format(getString(R.string.td_line_running_ratio), Arrays.copyOf(new Object[]{String.valueOf(fFloatValue)}, 1)));
        GpsHelper.Companion companion2 = GpsHelper.INSTANCE;
        List<TdLineRuningRankItem> rankList = companion2.getInstance().getRankList(this.mOthers, this.mTotalDistance, (int) (this.mLineDistance * f), this.mCurTime, this.mCurSpeed, this.mIsMetric, this.mRunnerData);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(rankList);
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator<T>() { // from class: com.huami.treadmill.ui.running.LineRunningActivity$showGpsInfo$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((TdLineRuningRankItem) t2).getRankDistance()), Float.valueOf(((TdLineRuningRankItem) t).getRankDistance()));
                }
            });
        }
        LineRunningRankAdapter lineRunningRankAdapter = this.mAdapter;
        if (lineRunningRankAdapter != null) {
            lineRunningRankAdapter.setMetric(this.mIsMetric);
        }
        LineRunningRankAdapter lineRunningRankAdapter2 = this.mAdapter;
        if (lineRunningRankAdapter2 != null) {
            lineRunningRankAdapter2.setData(companion2.getInstance().getFilterRankList(arrayList));
        }
        ((TypefaceTextView) findViewById(R.id.rank_number)).setText(String.valueOf(companion2.getInstance().getRankMePos(arrayList)));
        ((LinearLayout) findViewById(R.id.rank_number_ll)).setVisibility(0);
        MarkerList markerList = new MarkerList(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        List<GPSPoint> list2 = this.mOriginTrack;
        GPSPoint gPSPoint = list2 == null ? null : list2.get(this.mIndex);
        int size = rankList.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                TdLineRuningRankItem tdLineRuningRankItem = rankList.get(i);
                if (tdLineRuningRankItem.getRankIsMe()) {
                    viewInflate = View.inflate(this, R.layout.marker_me, null);
                    View viewFindViewById = viewInflate.findViewById(R.id.marker_me_avatar);
                    Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    imageView = (ImageView) viewFindViewById;
                    View viewFindViewById2 = viewInflate.findViewById(R.id.marker_me_speed);
                    Objects.requireNonNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) viewFindViewById2;
                    View viewFindViewById3 = viewInflate.findViewById(R.id.marker_me_speed_unit);
                    Objects.requireNonNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                    textView2 = (TextView) viewFindViewById3;
                } else {
                    viewInflate = View.inflate(this, R.layout.marker_other, null);
                    View viewFindViewById4 = viewInflate.findViewById(R.id.marker_other_avatar);
                    Objects.requireNonNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.ImageView");
                    imageView = (ImageView) viewFindViewById4;
                    View viewFindViewById5 = viewInflate.findViewById(R.id.marker_other_speed);
                    Objects.requireNonNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) viewFindViewById5;
                    View viewFindViewById6 = viewInflate.findViewById(R.id.marker_other_speed_unit);
                    Objects.requireNonNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
                    textView2 = (TextView) viewFindViewById6;
                }
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                Object[] objArr = new Object[1];
                objArr[c2] = tdLineRuningRankItem.getRankSpeed();
                textView.setText(String.format("%.2f", Arrays.copyOf(objArr, 1)));
                if (this.mIsMetric) {
                    textView2.setText(getString(R.string.td_speed_unit));
                } else {
                    textView2.setText(getString(R.string.td_speed_mi_unit));
                }
                Glide.with(imageView).load(tdLineRuningRankItem.getRankAvatar()).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into(imageView);
                int size2 = (int) (this.mOriginTrack.size() * (tdLineRuningRankItem.getRankDistance() / this.mLineDistance));
                if (size2 >= this.mOriginTrack.size()) {
                    size2 = this.mOriginTrack.size() - 1;
                }
                if (tdLineRuningRankItem.getRankIsMe()) {
                    gPSPoint = this.mOriginTrack.get(size2);
                }
                markerList.isMeList().add(Boolean.valueOf(tdLineRuningRankItem.getRankIsMe()));
                markerList.getPointList().add(this.mOriginTrack.get(size2));
                markerList.getViewList().add(viewInflate);
                if (!this.oldRankList.isEmpty()) {
                    List<TdLineRuningRankItem> list3 = this.oldRankList;
                    TdLineRuningRankItem tdLineRuningRankItem2 = list3 == null ? null : list3.get(i);
                    int size3 = (int) (this.mOriginTrack.size() * (tdLineRuningRankItem2.getRankDistance() / this.mLineDistance));
                    if (size3 >= this.mOriginTrack.size()) {
                        size3 = this.mOriginTrack.size() - 1;
                    }
                    if (size2 == size3 && Intrinsics.areEqual(tdLineRuningRankItem2.getRankSpeed(), tdLineRuningRankItem.getRankSpeed())) {
                        markerList.getRefreshList().add(Boolean.FALSE);
                    } else {
                        markerList.getRefreshList().add(Boolean.TRUE);
                    }
                } else {
                    markerList.getRefreshList().add(Boolean.FALSE);
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
                c2 = 0;
            }
        }
        ProxyTreadmill.INSTANCE.getInstance().mapAddLineMarker(markerList, gPSPoint);
        this.oldRankList.clear();
        this.oldRankList.addAll(rankList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String msg) {
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
    public final void J(final boolean showDetail) {
        RunningPlayer runningPlayer;
        String str = J;
        HMLog.i(str, "stopTreadMill start", new Object[0]);
        if (Intrinsics.areEqual(this.mConfigVoicePlay, Boolean.TRUE) && (runningPlayer = RunningPlayer.getInstance()) != null) {
            runningPlayer.playStop();
        }
        I("");
        Observable.timer(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: jo4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                LineRunningActivity.L(this.a, showDetail, (Long) obj);
            }
        }, new Action1() { // from class: bo4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                LineRunningActivity.K((Throwable) obj);
            }
        });
        HMLog.i(str, "stopTreadMill end", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Throwable th) {
        HMLog.warn$default(null, th, e.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(LineRunningActivity lineRunningActivity, boolean z, Long l) {
        if (Intrinsics.areEqual(ProxyTreadmill.INSTANCE.getInstance().syncBoltGpsData(new d(z)), Boolean.FALSE)) {
            lineRunningActivity.p();
            lineRunningActivity.finish();
        }
    }

    private final void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        }
        LineRunningRankAdapter lineRunningRankAdapter = new LineRunningRankAdapter();
        this.mAdapter = lineRunningRankAdapter;
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(lineRunningRankAdapter);
        }
        this.mLineId = getIntent().getLongExtra("line_id", 0L);
        this.mLineTime = getIntent().getLongExtra("line_time", 0L);
        this.mLineNext = getIntent().getLongExtra(STARTUP_LINE_NEXT, 0L);
        this.mLineDistance = getIntent().getFloatExtra("line_distance", 0.0f);
        this.mLineName = getIntent().getStringExtra("line_name");
        ((TypefaceTextView) findViewById(R.id.td_line_runing_line_name)).setText(this.mLineName);
        LineRunningViewModel lineRunningViewModel = this.viewModel;
        Objects.requireNonNull(lineRunningViewModel);
        lineRunningViewModel.getLineDetail().observe(this, new Observer() { // from class: fo4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LineRunningActivity.r(this.a, (Items) obj);
            }
        });
        LineRunningViewModel lineRunningViewModel2 = this.viewModel;
        Objects.requireNonNull(lineRunningViewModel2);
        lineRunningViewModel2.getLineDetail(this.mLineId, this.mLineTime, this.mLineNext);
        LineRunningViewModel lineRunningViewModel3 = this.viewModel;
        Objects.requireNonNull(lineRunningViewModel3);
        lineRunningViewModel3.getOrginLine().observe(this, new Observer() { // from class: go4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LineRunningActivity.s(this.a, (TdLineDetailRun) obj);
            }
        });
        LineRunningViewModel lineRunningViewModel4 = this.viewModel;
        Objects.requireNonNull(lineRunningViewModel4);
        lineRunningViewModel4.getOriginLine(this.mLineId);
        ((LinearLayout) findViewById(R.id.rank_number_ll)).setVisibility(4);
    }

    private final void o() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void q() {
        ViewExtKt.smartClick$default((ImageView) findViewById(R.id.td_line_running_setting_btn), 0L, new a(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(LineRunningActivity lineRunningActivity, Items items) {
        lineRunningActivity.mOthers = items.getItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(LineRunningActivity lineRunningActivity, TdLineDetailRun tdLineDetailRun) {
        TypefaceTextView typefaceTextView = (TypefaceTextView) lineRunningActivity.findViewById(R.id.small_map_ratio);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        typefaceTextView.setText(String.format(lineRunningActivity.getString(R.string.td_line_running_ratio), Arrays.copyOf(new Object[]{IdManager.DEFAULT_VERSION_NAME}, 1)));
        ((SmallMapView) lineRunningActivity.findViewById(R.id.small_map_vw)).setLineDetailRunData(tdLineDetailRun);
        GpsHelper.Companion companion = GpsHelper.INSTANCE;
        GpsHelper.LoadData detailRunLoadData = companion.getInstance().getDetailRunLoadData(tdLineDetailRun);
        List<GPSPoint> smoothTrack = companion.getInstance().getSmoothTrack();
        ProxyTreadmill companion2 = ProxyTreadmill.INSTANCE.getInstance();
        if (companion2 != null) {
            companion2.mapOnGPSLineInfoChanged(smoothTrack, 0, true);
        }
        lineRunningActivity.mOriginTrack = detailRunLoadData.getTrack();
        lineRunningActivity.mOriginDetail = tdLineDetailRun;
        lineRunningActivity.H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t() {
        AlertDialogFragment alertDialogFragment = this.connectFailedDialog;
        if (alertDialogFragment != null) {
            if (alertDialogFragment != null && alertDialogFragment.isShowing()) {
                return true;
            }
        }
        return false;
    }

    private final void u() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.addFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(final LineRunningActivity lineRunningActivity, Long l) {
        PauseFragment.INSTANCE.newInstance().showPauseFragment(lineRunningActivity.getSupportFragmentManager(), lineRunningActivity.mTotalDistance, new PauseFragment.StatusListener() { // from class: com.huami.treadmill.ui.running.LineRunningActivity$onCreate$1$1
            @Override // com.huami.treadmill.ui.setting.PauseFragment.StatusListener
            public void onFinish(boolean showDetail) {
                this.a.J(showDetail);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Throwable th) {
        HMLog.warn$default(null, th, b.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(LineRunningActivity lineRunningActivity, Long l) {
        ProxyTreadmill.INSTANCE.getInstance().showDetail(lineRunningActivity.getApplicationContext(), lineRunningActivity, true, lineRunningActivity.mOriginDetail, lineRunningActivity.mIndex, lineRunningActivity.mLineId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Throwable th) {
        HMLog.warn$default(null, th, c.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        AlertDialogFragment alertDialogFragment;
        if (this.mAlertDialog == null) {
            this.mAlertDialog = new AlertDialogFragment.Builder(getApplicationContext()).setCancelable(true).setTitle(R.string.td_running_dialog_open_ble).setNegativeButton(getString(R.string.td_running_dialog_invoke_ble), new DialogInterface.OnClickListener() { // from class: eo4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LineRunningActivity.A(this.a, dialogInterface, i);
                }
            }).setPositiveButton(getString(R.string.td_running_dialog_quit_sport), new DialogInterface.OnClickListener() { // from class: zn4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LineRunningActivity.B(this.a, dialogInterface, i);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment2 = this.mAlertDialog;
        if ((alertDialogFragment2 == null ? null : Boolean.valueOf(alertDialogFragment2.isShowing())).booleanValue() || (alertDialogFragment = this.mAlertDialog) == null) {
            return;
        }
        alertDialogFragment.show(getSupportFragmentManager());
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
        setContentView(R.layout.activity_line_running);
        ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
        ProxyTreadmill companion2 = companion.getInstance();
        if (companion2 != null) {
            companion2.mapInit(this);
        }
        ProxyTreadmill companion3 = companion.getInstance();
        if (companion3 != null) {
            companion3.mapInitGPSSolution(this, getSupportFragmentManager(), findViewById(R.id.map), savedInstanceState, 1);
        }
        this.viewModel = (LineRunningViewModel) AppCompatActivityExtKt.obtainViewModel(this, LineRunningViewModel.class);
        EventBus.getDefault().register(this);
        q();
        initView();
        Boolean configScreenOnState = companion.getInstance().getConfigScreenOnState();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(configScreenOnState, bool)) {
            u();
        } else {
            o();
        }
        boolean booleanExtra = getIntent().getBooleanExtra(LINE_IS_RUNNING, false);
        this.mConfigVoicePlay = companion.getInstance().getConfigVoicePlay();
        RunningPlayer.initIfNeed(getApplicationContext());
        RunningPlayer runningPlayer2 = RunningPlayer.getInstance();
        if (runningPlayer2 != null) {
            runningPlayer2.setSportType(25);
        }
        if (!booleanExtra && Intrinsics.areEqual(this.mConfigVoicePlay, bool) && (runningPlayer = RunningPlayer.getInstance()) != null) {
            runningPlayer.playStart();
        }
        C();
        if (booleanExtra) {
            SportDataHelper.INSTANCE.getInstance().registerSportData();
        }
        SportDataHelper.INSTANCE.getInstance().setIsRouterLine(true);
        if (companion.getInstance().getSportState() == BoltSportState.PAUSED) {
            Observable.timer(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: io4
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    LineRunningActivity.v(this.a, (Long) obj);
                }
            }, new Action1() { // from class: ko4
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    LineRunningActivity.w((Throwable) obj);
                }
            });
        }
        this.mConfigHr = companion.getInstance().getConfigRemindHeartRate();
        this.mConfigHrEnable = companion.getInstance().getConfigRemindHREnable();
        this.mConfigPace = companion.getInstance().getConfigRemindPace();
        this.mConfigPaceEnable = companion.getInstance().getConfigRemindPaceEnable();
        BoltRunnerData runnerData = companion.getInstance().getRunnerData();
        this.mIsMetric = (runnerData == null ? null : Boolean.valueOf(runnerData.isMetric())).booleanValue();
        this.mRunnerData = companion.getInstance().getRunnerData();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ProxyTreadmill companion = ProxyTreadmill.INSTANCE.getInstance();
        if (companion != null) {
            companion.mapDestroy();
        }
        o();
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
        p();
    }

    public final void onEventMainThread(@NotNull SportCommandEvent commandEvent) {
        RunningPlayer runningPlayer;
        int i = WhenMappings.$EnumSwitchMapping$0[commandEvent.getCommand().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            J(true);
        } else {
            if (Intrinsics.areEqual(this.mConfigVoicePlay, Boolean.TRUE) && (runningPlayer = RunningPlayer.getInstance()) != null) {
                runningPlayer.playPause(25);
            }
            PauseFragment.INSTANCE.newInstance().showPauseFragment(getSupportFragmentManager(), this.mTotalDistance, new PauseFragment.StatusListener() { // from class: com.huami.treadmill.ui.running.LineRunningActivity.onEventMainThread.1
                @Override // com.huami.treadmill.ui.setting.PauseFragment.StatusListener
                public void onFinish(boolean showDetail) {
                    LineRunningActivity.this.J(showDetail);
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ProxyTreadmill companion = ProxyTreadmill.INSTANCE.getInstance();
        if (companion == null) {
            return;
        }
        companion.mapPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ProxyTreadmill companion = ProxyTreadmill.INSTANCE.getInstance();
        if (companion == null) {
            return;
        }
        companion.mapResume();
    }

    @Override // com.huami.view.basetitle.BaseFragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        ProxyTreadmill companion = ProxyTreadmill.INSTANCE.getInstance();
        if (companion == null) {
            return;
        }
        companion.mapSaveInstanceState(outState);
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
        if (this.mStopWhenEnd) {
            return;
        }
        SportDataHelper.Companion companion = SportDataHelper.INSTANCE;
        InTreadmillData treadmillData = companion.getInstance().getTreadmillData();
        InMachineStatus machineStatus = companion.getInstance().getMachineStatus();
        if (treadmillData != null) {
            int totalDistance = treadmillData.getTotalDistance();
            this.mTotalDistance = totalDistance;
            int i = 1000;
            if (totalDistance >= this.mLineDistance * 1000) {
                ProxyTreadmill.INSTANCE.getInstance().stopTreadmill();
                J(true);
                this.mStopWhenEnd = true;
                return;
            }
            this.mCurSpeed = treadmillData.getInstantaneousSpeed();
            this.mCurTime = treadmillData.getElapsedTime();
            H();
            if (Intrinsics.areEqual(this.mConfigVoicePlay, Boolean.TRUE)) {
                if (!this.mFirstDistance) {
                    this.mLastDistance = treadmillData.getTotalDistance();
                    this.mLastTime = treadmillData.getElapsedTime();
                    this.mFirstDistance = true;
                }
                boolean z = this.mIsMetric;
                if (!z) {
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
            if (ProxyTreadmill.INSTANCE.getInstance().getHrDeviceStatus() == HrTips.NO_TIPS) {
                treadmillData.getHeartRate();
                remindHRIfNeed(treadmillData.getHeartRate());
            }
        }
        if (machineStatus != null) {
            byte op = machineStatus.getOp();
            InMachineStatus.Companion companion2 = InMachineStatus.INSTANCE;
            if (op == companion2.getOP_SPEED()) {
                byte b2 = machineStatus.getData()[0];
                if (b2 == companion2.getSPEED_INC()) {
                    VariableSpeedFragment.INSTANCE.newInstance().showVsFragment(getSupportFragmentManager(), (int) (((double) this.mCurSpeed) * 3.6d), AdjustMode.ADJUST_FAST, 0.5f);
                } else if (b2 == companion2.getSPEED_DEC()) {
                    VariableSpeedFragment.INSTANCE.newInstance().showVsFragment(getSupportFragmentManager(), (int) (((double) this.mCurSpeed) * 3.6d), AdjustMode.ADJUST_SLOW, 0.5f);
                }
            }
        }
    }

    public final void onEventMainThread(@NotNull SyncStatusEvent statusEvent) {
        if (WhenMappings.$EnumSwitchMapping$1[statusEvent.getStatus().ordinal()] == 1) {
            EventBus.getDefault().post(new StatisticsRefreshEvent(StatisticsRefreshEvent.SECTION_TREADMILL_RECORD_INFO));
            HMLog.i(J, "sync result:" + statusEvent.getResult() + " distance:" + this.mTotalDistance + " showDetail:" + statusEvent.getShowDetail() + " index:" + this.mIndex + " originSize:" + this.mOriginTrack.size(), new Object[0]);
            if (statusEvent.getResult() && statusEvent.getShowDetail() && this.mTotalDistance >= Keeper.getMinNoticeDisThreshold(getApplicationContext())) {
                Observable.timer(300L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: ho4
                    @Override // rx.functions.Action1
                    public final void call(Object obj) {
                        LineRunningActivity.x(this.a, (Long) obj);
                    }
                }, new Action1() { // from class: ao4
                    @Override // rx.functions.Action1
                    public final void call(Object obj) {
                        LineRunningActivity.y((Throwable) obj);
                    }
                });
            }
            p();
            finish();
        }
    }
}
