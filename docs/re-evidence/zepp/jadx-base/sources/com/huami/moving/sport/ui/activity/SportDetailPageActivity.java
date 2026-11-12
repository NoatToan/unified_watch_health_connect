package com.huami.moving.sport.ui.activity;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.feedback.api.FeedbackParams;
import com.huami.feedback.api.FeedbackService;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.mifit.sportlib.model.HeartRateZone;
import com.huami.mifit.sportlib.model.KilometreOrMileMarked;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.config.chart.SportChartJsonParser;
import com.huami.moving.config.chart.SportChartType;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.device.SportUsingDeviceHandler;
import com.huami.moving.hkwebapi.StrengthTrainingAPI;
import com.huami.moving.maps.IGPSSolution;
import com.huami.moving.maps.track.GPSSportTrackLoader;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.activity.SportDetailPageActivity;
import com.huami.moving.sport.ui.common.HrZoneShowRuleConfig;
import com.huami.moving.sport.ui.common.SportDataDisplayItem;
import com.huami.moving.sport.ui.databinding.ActivitySportDetailPageBinding;
import com.huami.moving.sport.ui.databinding.MovingUiActivitySportDetailPageNoGpsBinding;
import com.huami.moving.sport.ui.koin.MovingUIModuleKt;
import com.huami.moving.sport.ui.utils.AddWatermarkUtils;
import com.huami.moving.sport.ui.utils.GridLayoutDecoration;
import com.huami.moving.sport.ui.view.card.CardInfoAdapter;
import com.huami.moving.sport.ui.view.card.CardSlopeDistribution;
import com.huami.moving.sport.ui.view.card.CardTrainingEffect;
import com.huami.moving.sport.ui.view.card.HeartRateCard;
import com.huami.moving.sport.ui.view.card.OverViewCard;
import com.huami.moving.sport.ui.view.card.TargetCardAdapter;
import com.huami.moving.sport.ui.view.chart.SportDiagramView;
import com.huami.moving.sport.ui.view.chart.dataprovider.AltiDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.AltiType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.BoatingFreDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.BoatingFreType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BodyStatusProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.BodyStatusType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfAngleDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfAngleType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfBeatDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfBeatType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfUpDownTimeDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfUpDownTimeType;
import com.huami.moving.sport.ui.view.chart.dataprovider.HeartDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.HeartType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PaceDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.PaceType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PowerMeterDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.PowerMeterType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PressureDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.PressureType;
import com.huami.moving.sport.ui.view.chart.dataprovider.RopeSkipingFreqDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.RopeSkipingFreqType;
import com.huami.moving.sport.ui.view.chart.dataprovider.SpeedDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.SpeedType;
import com.huami.moving.sport.ui.view.chart.dataprovider.Spo2DataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.Spo2Type;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepFreqDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepFreqType;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepType;
import com.huami.moving.sport.ui.view.chart.dataprovider.StrokeSpeedDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.StrokeSpeedType;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.UnSupportChartTypeSource;
import com.huami.moving.sport.ui.view.chart.overlying.OverlyingHelper;
import com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel;
import com.huami.moving.ui.event.EventCurrSportFinished;
import com.huami.moving.ui.event.EventHeatMapRadioButton;
import com.huami.moving.ui.event.EventIndoorRunCalibated;
import com.huami.moving.ui.event.EventSegmentSave;
import com.huami.moving.ui.offcut.SportEndPageActivity;
import com.huami.moving.ui.offcut.SportEndPageBusiness;
import com.huami.moving.ui.sport.detail.SportSharePreDialog;
import com.huami.moving.ui.sport.detail.SportTrackDetailFragment;
import com.huami.moving.ui.sport.detail.screenshot.OnScreenShotListener;
import com.huami.moving.ui.sport.detail.screenshot.ScreenShotListenManager;
import com.huami.moving.ui.sport.detail.segment.SportSegmentFragments;
import com.huami.moving.ui.sport.detail.segment.dialog.SportDetailSegmentManager;
import com.huami.moving.ui.sport.detail.share.SportDetailsInterface;
import com.huami.moving.ui.sport.detail.share.TrackVideoShareActivity;
import com.huami.moving.ui.sport.detail.tool.ShareFileUtils;
import com.huami.moving.ui.utils.BitmapUtils;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.ui.utils.SportTypeDescription;
import com.huami.moving.ui.utils.SportTypeIconUtils;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.moving.ui.view.LockableNestedScrollView;
import com.huami.moving.ui.watermark.WatermarkClient;
import com.huami.moving.utils.Utils;
import com.huami.moving.webapi.PutRunningSummaryToServer;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.widget.toast.CustomToast;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.ActivetrackStep;
import com.xiaomi.hm.health.databases.model.ActivetrackStepDao;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.mipush.sdk.Constants;
import de.greenrobot.event.EventBus;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import rx.Emitter;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ¨\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0002¨\u0002B\t¢\u0006\u0006\b¦\u0002\u0010§\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\rH\u0002J\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0014\u0010\u0016\u001a\u00020\r*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u000bH\u0002J\b\u0010!\u001a\u00020\u000bH\u0002J\u0018\u0010%\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020\u000bH\u0002J\b\u0010'\u001a\u00020\u000bH\u0002J\b\u0010(\u001a\u00020\u000bH\u0002J\u001a\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r0*0)H\u0002J:\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0)2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r0*0)2\b\u0010-\u001a\u0004\u0018\u00010\r2\u0006\u0010.\u001a\u00020\u0011H\u0002J(\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0)2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r0*0)H\u0002J.\u00104\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\r2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0)2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b02H\u0002J\u0018\u00109\u001a\u00020\u000b2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0002J\u0010\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000205H\u0002J\u001e\u0010?\u001a\u00020\u000b2\u0006\u0010<\u001a\u0002052\f\u0010>\u001a\b\u0012\u0004\u0012\u0002050=H\u0002J\u0018\u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u0011H\u0002J\u0010\u0010F\u001a\u00020C2\u0006\u0010E\u001a\u000205H\u0002J\b\u0010G\u001a\u00020\u000bH\u0002J\u0018\u0010J\u001a\u00020\u000b2\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010HH\u0002J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110HH\u0002J\b\u0010L\u001a\u00020\u000bH\u0002J\u0010\u0010N\u001a\u00020\u00182\u0006\u0010M\u001a\u000207H\u0002J\u0010\u0010O\u001a\u00020\u00182\u0006\u0010M\u001a\u000207H\u0002J\u0010\u0010P\u001a\u00020\u00182\u0006\u0010M\u001a\u000207H\u0002J\u0018\u0010U\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0002J\u001e\u0010X\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0H2\u0006\u0010T\u001a\u00020SH\u0002J\u0018\u0010Y\u001a\u00020\u000b2\u0006\u00106\u001a\u0002052\u0006\u0010T\u001a\u00020SH\u0002J \u0010[\u001a\u00020\u000b2\u0006\u00106\u001a\u0002052\u0006\u0010T\u001a\u00020S2\u0006\u0010Z\u001a\u00020\u0011H\u0002J\u0010\u0010]\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u0011H\u0002J\u0010\u0010^\u001a\u00020\u000b2\u0006\u0010:\u001a\u000205H\u0002J\u0010\u0010a\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020_H\u0002J\b\u0010b\u001a\u00020\u0018H\u0002J\b\u0010c\u001a\u00020\u0011H\u0002J\u0010\u0010f\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020dH\u0002J\u0012\u0010i\u001a\u00020\u000b2\b\u0010h\u001a\u0004\u0018\u00010gH\u0014J\b\u0010j\u001a\u00020\u000bH\u0016J\u0006\u0010k\u001a\u00020\u000bJ\u000e\u0010m\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020\u0018J\b\u0010n\u001a\u00020\u000bH\u0016J\u0018\u0010q\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020C2\u0006\u0010p\u001a\u00020dH\u0016J&\u0010u\u001a\u00020\u000b2\b\u0010o\u001a\u0004\u0018\u00010C2\b\u0010s\u001a\u0004\u0018\u00010r2\b\u0010t\u001a\u0004\u0018\u00010rH\u0016J\u0010\u0010x\u001a\u00020\u000b2\u0006\u0010w\u001a\u00020vH\u0016J\b\u0010y\u001a\u00020\u0011H\u0016J\b\u0010z\u001a\u00020@H\u0016J\u0010\u0010|\u001a\u00020\u000b2\u0006\u0010{\u001a\u00020#H\u0016J\b\u0010}\u001a\u00020\u0018H\u0016J\b\u0010~\u001a\u00020\u0011H\u0016J\b\u0010\u007f\u001a\u00020\u000bH\u0016J\t\u0010\u0080\u0001\u001a\u00020\u000bH\u0014J\t\u0010\u0081\u0001\u001a\u00020\u000bH\u0014J\t\u0010\u0082\u0001\u001a\u00020\u000bH\u0014J\u0011\u0010\u0085\u0001\u001a\u00020\u000b2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001J\u0012\u0010\u0087\u0001\u001a\u00020\u000b2\u0007\u0010\\\u001a\u00030\u0086\u0001H\u0016J\t\u0010\u0088\u0001\u001a\u00020\u0018H\u0016J\u0007\u0010\u0089\u0001\u001a\u00020\u0011J\t\u0010\u008a\u0001\u001a\u00020\u000bH\u0016R#\u0010\u0090\u0001\u001a\u00030\u008b\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R#\u0010\u0095\u0001\u001a\u00030\u0091\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u008d\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0019\u0010\u0098\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R#\u0010\u009e\u0001\u001a\u00030\u0099\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R#\u0010£\u0001\u001a\u00030\u009f\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b \u0001\u0010\u009b\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010ª\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¨\u0001R\u0018\u0010¬\u0001\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b«\u0001\u00109R\u0019\u0010®\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010¥\u0001R\u0019\u0010°\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010¥\u0001R\u0019\u0010±\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¥\u0001R\u0018\u0010²\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b9\u0010\u0097\u0001R\u001a\u0010´\u0001\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010³\u0001R\u0019\u0010·\u0001\u001a\u00030µ\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b'\u0010¶\u0001R\u0019\u0010º\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u001c\u0010¹\u0001R\u0019\u0010»\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b4\u0010¹\u0001R\u001b\u0010¾\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001a\u0010Â\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001a\u0010Ä\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÃ\u0001\u0010¹\u0001R\u0019\u0010Ç\u0001\u001a\u00030Å\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b+\u0010Æ\u0001R\u001a\u0010É\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÈ\u0001\u0010¹\u0001R\u0019\u0010Ì\u0001\u001a\u00030Ê\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0014\u0010Ë\u0001R\u001b\u0010Ï\u0001\u001a\u0005\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010Î\u0001R\u001b\u0010Ò\u0001\u001a\u0005\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010Ñ\u0001R\u001b\u0010Õ\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b/\u0010Ô\u0001R\u001c\u0010Ù\u0001\u001a\u0005\u0018\u00010Ö\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R\u0018\u0010Ú\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010¨\u0001R\u001c\u0010Û\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010¹\u0001R\u001c\u0010Þ\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010Ý\u0001R\u0019\u0010ß\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010¨\u0001R\u0019\u0010à\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bK\u0010Ñ\u0001R\u001a\u0010á\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009c\u0001\u0010Ñ\u0001R\u001a\u0010â\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¡\u0001\u0010¹\u0001R\u0019\u0010å\u0001\u001a\u00030ã\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u001d\u0010ä\u0001R\u0018\u0010æ\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bO\u0010¨\u0001R\u0019\u0010ç\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010§\u0001R\u0017\u0010:\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b^\u0010è\u0001R\u001b\u0010ë\u0001\u001a\u0005\u0018\u00010é\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010ê\u0001R\u001c\u0010ï\u0001\u001a\u0005\u0018\u00010ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0019\u0010ñ\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010¥\u0001R\u0019\u0010ô\u0001\u001a\u00020_8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0019\u0010÷\u0001\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u001a\u0010ù\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bø\u0001\u0010Ñ\u0001R\u0018\u0010ú\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010¨\u0001R\u0018\u0010û\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010¥\u0001R\u001c\u0010ÿ\u0001\u001a\u0005\u0018\u00010ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u001c\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0080\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001b\u0010\u0085\u0002\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010½\u0001R\u0019\u0010\u0087\u0002\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0097\u0001R\u0019\u0010\u0089\u0002\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010¨\u0001R\u0018\u0010\u008a\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bb\u0010¥\u0001R\u001a\u0010\u008e\u0002\u001a\u00030\u008b\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0019\u0010\u0090\u0002\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010¨\u0001R\u001b\u0010\u0093\u0002\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0019\u0010\u0095\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010¥\u0001R\u0019\u0010\u0097\u0002\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010«\u0001R\u0019\u0010\u0099\u0002\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010«\u0001R\u0019\u0010\u009b\u0002\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010«\u0001R\u0018\u0010\u009c\u0002\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010«\u0001R\u0019\u0010\u009f\u0002\u001a\u00030\u009d\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bJ\u0010\u009e\u0002R\u0018\u0010 \u0002\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010¨\u0001R#\u0010¥\u0002\u001a\u00030¡\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0002\u0010\u008d\u0001\u001a\u0006\b£\u0002\u0010¤\u0002¨\u0006¬\u0002²\u0006\u000f\u0010©\u0002\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010«\u0002\u001a\u00030ª\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/huami/moving/sport/ui/activity/SportDetailPageActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/sothree/slidinguppanel/SlidingUpPanelLayout$PanelSlideListener;", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$CaptureScreenListener;", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$MutualCallerListener;", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$AnalyticsEventListener;", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$ShareExportListener;", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$ShareVideoTrackListener;", "Lcom/huami/moving/ui/sport/detail/share/SportDetailsInterface;", "Lcom/huami/moving/sport/ui/view/card/OverViewCard$VerifyDistanceListener;", "Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment$TrackActionCallback;", "", "K", "Landroid/graphics/Bitmap;", "U", "Landroid/graphics/Bitmap$CompressFormat;", TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "quality", "", ExifInterface.GPS_DIRECTION_TRUE, "sampleSize", "V", "initView", "", "isDarkText", "color", "U0", "M", "r0", "useAmap", "B0", "observeData", "V0", "sportMode", "", "sportNameRes", "a0", "Q0", "L", "C0", "Lrx/Observable;", "Lkotlin/Pair;", "R", "start", "header", "marginTop", "W", "Y", "middle", "Lkotlin/Function0;", "action", "N", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackrecord", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "detailData", "J", "trackRecord", "Z0", "parent", "", "list", "a1", "", "changeTime", StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "Landroid/view/View;", "b0", "record", "h0", "Y0", "", "typeList", "R0", "o0", "X0", "parsedSportDetailData", "b1", "s0", "t0", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseDataProvider;", "provider", "Landroid/view/ViewGroup$LayoutParams;", Constant.PAI_KEY_LOW_ZONE_PAI, "g0", "Lcom/huami/mifit/sportlib/model/HeartRateZone;", "hrZoneList", "e0", "f0", "showType", "j0", "distance", "c1", "u0", "", "supportType", "v0", "I0", "l0", "", "offset", "S0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onTrackDataLoaded", "setStatusBarTranslate", "visibility", "setPlayButtonVisibility", "onBackPressed", "panel", "offsets", "onPanelSlide", "Lcom/sothree/slidinguppanel/SlidingUpPanelLayout$PanelState;", "previousState", "newState", "onPanelStateChanged", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog;", "dialog", "onCaptureScreen", "getDeviceSource", "getTrackId", DbUtils.Const.Columns.Event.EVENT_ID, "onAnalyticsClick", "isHasTrack", "getSportType", "uploadData", "onStop", "onResume", "onDestroy", "Lcom/huami/moving/ui/event/EventSegmentSave;", "saveEvent", "onEventMainThread", "", "onVerifyDistanceUpdate", "getHasTrackPage", "getStatueBarHeight", "setIsPlayTrack", "Lcom/huami/moving/sport/ui/viewmodel/SportDetailPageViewModel;", "x", "Lkotlin/Lazy;", "m0", "()Lcom/huami/moving/sport/ui/viewmodel/SportDetailPageViewModel;", "sportDetailPageViewModel", "Lcom/huami/moving/ui/offcut/SportEndPageBusiness;", "y", "n0", "()Lcom/huami/moving/ui/offcut/SportEndPageBusiness;", "sportEndPageBusiness", "z", "Ljava/lang/String;", "TAG", "Lcom/huami/moving/sport/ui/databinding/ActivitySportDetailPageBinding;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "p0", "()Lcom/huami/moving/sport/ui/databinding/ActivitySportDetailPageBinding;", "viewBinding", "Lcom/huami/moving/sport/ui/databinding/MovingUiActivitySportDetailPageNoGpsBinding;", "B", "q0", "()Lcom/huami/moving/sport/ui/databinding/MovingUiActivitySportDetailPageNoGpsBinding;", "viewBindingNoGps", "C", LogUtil.I, "navFrom", LogUtil.D, "Z", "E", "isOverSea", "F", "trackId", "G", "deviceSource", "H", "sportType", SportAnalytics.ParamKey.TOTALPICS, "endChart", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog;", "sharePreDialog", "Lcom/huami/moving/sport/ui/view/card/OverViewCard;", "Lcom/huami/moving/sport/ui/view/card/OverViewCard;", "overViewCard", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "cardShareEnd", "cardShareFeedback", "O", "Landroid/graphics/Bitmap;", "headBitmap", "Landroid/content/Context;", "P", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Q", "chartLayout", "Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment;", "Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment;", "hasTrackFragment", ExifInterface.LATITUDE_SOUTH, "sportFinishLayout", "Landroid/widget/Button;", "Landroid/widget/Button;", "sportFinishButton", "Lcom/huami/moving/sport/ui/view/card/HeartRateCard;", "Lcom/huami/moving/sport/ui/view/card/HeartRateCard;", "heartRateZoneCard", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "targetCardLayout", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "targetCardView", "Landroidx/appcompat/widget/LinearLayoutCompat;", "X", "Landroidx/appcompat/widget/LinearLayoutCompat;", "triangleMultiple", TdmillHmFragment.ARG_IS_METRIC, "segmentLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "noGps", "hasTrackPage", "rlBack", "rlShare", "llTitle", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "locationAndSportType", "isNeedVerifyDistance", "inputDistance", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "imagePlay", "Landroid/widget/RadioGroup;", "w0", "Landroid/widget/RadioGroup;", "mMileStoneGroup", "x0", "mHalfStartTime", "y0", "[I", "sportTypes", "z0", "Landroid/view/View;", "topLayout", "A0", "rlTitleBar", "isPlayTrack", "realSportType", "Lcom/huami/moving/ui/sport/detail/screenshot/ScreenShotListenManager;", "D0", "Lcom/huami/moving/ui/sport/detail/screenshot/ScreenShotListenManager;", "mScreenShotListenManager", "Lcom/huami/moving/ui/view/LockableNestedScrollView;", "E0", "Lcom/huami/moving/ui/view/LockableNestedScrollView;", "mLockableNestedScrollView", "F0", "mapBackgroundBitmap", "G0", "mSportName", "H0", "statusBarDarkText", "statusBarBgColor", "Landroid/widget/FrameLayout;", "J0", "Landroid/widget/FrameLayout;", "mapContainer", "K0", "isFold", "L0", "Lcom/sothree/slidinguppanel/SlidingUpPanelLayout$PanelState;", "mPanelState", "M0", "realScreenHeight", "N0", "mFoldExpandedHeight", "O0", "mFoldCollapsedHeight", "P0", "mHalfMapCropHeight", "mAllMapCropHeight", "Lcom/huami/moving/sport/ui/activity/SportStrengthTrainingFragment;", "Lcom/huami/moving/sport/ui/activity/SportStrengthTrainingFragment;", "strengthTrainingFragment", "mapScreenShotAvailable", "Lcom/huami/feedback/api/FeedbackService;", "T0", "k0", "()Lcom/huami/feedback/api/FeedbackService;", "feedbackService", "<init>", "()V", "Companion", "formatChangeTime", "Landroid/widget/RadioButton;", "radioButton", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetailPageActivity extends BaseTitleActivity implements SlidingUpPanelLayout.PanelSlideListener, SportSharePreDialog.CaptureScreenListener, SportSharePreDialog.MutualCallerListener, SportSharePreDialog.AnalyticsEventListener, SportSharePreDialog.ShareExportListener, SportSharePreDialog.ShareVideoTrackListener, SportDetailsInterface, OverViewCard.VerifyDistanceListener, SportTrackDetailFragment.TrackActionCallback {

    @NotNull
    public static final String ARGS_MAP_GAODE = "isGaodeMap";

    @NotNull
    public static final String ARGS_OVER_SEA = "oversea";
    public static final int FROM_HISTORY = 2;
    public static final int FROM_OTHER = 0;
    public static final int FROM_RUNNING = 1;

    @NotNull
    public static final String HAS_TRACK = "hasTrack";

    @NotNull
    public static final String START_ACTIVITY_FROM = "START_ACTIVITY_FROM";

    @NotNull
    public static final String TAG = "SportDetailPageActivity";
    public static final /* synthetic */ KProperty<Object>[] U0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private RelativeLayout rlTitleBar;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBindingNoGps;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private boolean isPlayTrack;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int navFrom;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private int realSportType;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean useAmap;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    @Nullable
    private ScreenShotListenManager mScreenShotListenManager;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isOverSea;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @Nullable
    private LockableNestedScrollView mLockableNestedScrollView;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long trackId;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @Nullable
    private Bitmap mapBackgroundBitmap;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int deviceSource;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @NotNull
    private String mSportName;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private int sportType;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private boolean statusBarDarkText;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private int totalpics;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private int statusBarBgColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private String endChart;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private FrameLayout mapContainer;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    private SportSharePreDialog sharePreDialog;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private boolean isFold;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private OverViewCard overViewCard;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @Nullable
    private SlidingUpPanelLayout.PanelState mPanelState;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private LinearLayout cardShareEnd;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private int realScreenHeight;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private LinearLayout cardShareFeedback;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private float mFoldExpandedHeight;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @Nullable
    private Bitmap headBitmap;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private float mFoldCollapsedHeight;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private Context context;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private float mHalfMapCropHeight;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private LinearLayout chartLayout;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private float mAllMapCropHeight;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private SportTrackDetailFragment hasTrackFragment;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private SportStrengthTrainingFragment strengthTrainingFragment;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private LinearLayout sportFinishLayout;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private boolean mapScreenShotAvailable;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private Button sportFinishButton;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @NotNull
    private final Lazy feedbackService;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    private HeartRateCard heartRateZoneCard;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    private RelativeLayout targetCardLayout;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @Nullable
    private RecyclerView targetCardView;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @Nullable
    private LinearLayoutCompat triangleMultiple;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private boolean isMetric;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @Nullable
    private LinearLayout segmentLayout;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @Nullable
    private ConstraintLayout noGps;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private boolean hasTrackPage;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private RelativeLayout rlBack;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private RelativeLayout rlShare;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private LinearLayout llTitle;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private TextView locationAndSportType;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private boolean isNeedVerifyDistance;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private double inputDistance;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private Trackrecord trackRecord;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    private ImageView imagePlay;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    @Nullable
    private RadioGroup mMileStoneGroup;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportDetailPageViewModel = LazyKt__LazyJVMKt.lazy(new q());

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    private int mHalfStartTime;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportEndPageBusiness;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    @NotNull
    private final int[] sportTypes;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private String TAG;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    private View topLayout;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportChartType.values().length];
            iArr[SportChartType.PACE.ordinal()] = 1;
            iArr[SportChartType.SPEED.ordinal()] = 2;
            iArr[SportChartType.HEART.ordinal()] = 3;
            iArr[SportChartType.ALTITUDE.ordinal()] = 4;
            iArr[SportChartType.STEP_FREQ.ordinal()] = 5;
            iArr[SportChartType.STEP_STRIDE.ordinal()] = 6;
            iArr[SportChartType.STROKE_SPEED.ordinal()] = 7;
            iArr[SportChartType.STROKE_FREQ.ordinal()] = 8;
            iArr[SportChartType.ROPE_FREQ.ordinal()] = 9;
            iArr[SportChartType.SPO2.ordinal()] = 10;
            iArr[SportChartType.PRESSURE.ordinal()] = 11;
            iArr[SportChartType.BODY_STATUS.ordinal()] = 12;
            iArr[SportChartType.HEART_ZONE.ordinal()] = 13;
            iArr[SportChartType.SLOPE.ordinal()] = 14;
            iArr[SportChartType.GOLF_BEAT.ordinal()] = 15;
            iArr[SportChartType.GOLF_ANGLE.ordinal()] = 16;
            iArr[SportChartType.GOLF_UP_DOWN_TIME.ordinal()] = 17;
            iArr[SportChartType.POWER_METER.ordinal()] = 18;
            iArr[SportChartType.TE.ordinal()] = 19;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ParsedSportDetailData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParsedSportDetailData parsedSportDetailData) {
            super(0);
            this.a = parsedSportDetailData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "alignedStepFreqList  " + this.a.getAlignedStepFreqList().size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ParsedSportDetailData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ParsedSportDetailData parsedSportDetailData) {
            super(0);
            this.a = parsedSportDetailData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "alignedStepStrideList  " + this.a.getAlignedStepStrideList().size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Trackrecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Trackrecord trackrecord) {
            super(0);
            this.a = trackrecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "trackrecord.altitudeAscend  " + this.a.getAltitudeAscend();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Trackrecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Trackrecord trackrecord) {
            super(0);
            this.a = trackrecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "trackrecord.teValue   " + this.a.getTeValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Trackrecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Trackrecord trackrecord) {
            super(0);
            this.a = trackrecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "trackrecord.teAnaerobicValue  " + this.a.getTeAnaerobicValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getStatueBarHeight ::" + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<View, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            int i = SportDetailPageActivity.this.hasTrackPage ? R.id.id_gps : R.id.no_gps;
            FragmentTransaction fragmentTransactionBeginTransaction = SportDetailPageActivity.this.getSupportFragmentManager().beginTransaction();
            SportDetailPageActivity sportDetailPageActivity = SportDetailPageActivity.this;
            int i2 = R.anim.moving_ui_fragment_enter_from_right;
            int i3 = R.anim.moving_ui_fragment_exit_to_right;
            fragmentTransactionBeginTransaction.setCustomAnimations(i2, i3, i2, i3);
            fragmentTransactionBeginTransaction.add(i, SportDataDetailFragment.INSTANCE.newInstance(sportDetailPageActivity.hasTrackPage));
            fragmentTransactionBeginTransaction.addToBackStack(null);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            SportDetailPageActivity.this.Q0();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<View, Unit> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (!SportDetailPageActivity.this.isFold && SportDetailPageActivity.this.mPanelState != SlidingUpPanelLayout.PanelState.EXPANDED) {
                SportDetailPageActivity.this.isFold = true;
                OverViewCard overViewCard = SportDetailPageActivity.this.overViewCard;
                Objects.requireNonNull(overViewCard);
                overViewCard.updateIvFold(true);
                SlidingUpPanelLayout slidingUpPanelLayout = SportDetailPageActivity.this.p0().slidingLayout;
                SportDetailPageActivity sportDetailPageActivity = SportDetailPageActivity.this;
                slidingUpPanelLayout.setPanelHeight((int) ViewUtils.dp2px(sportDetailPageActivity, sportDetailPageActivity.mFoldCollapsedHeight));
                SportDetailPageActivity sportDetailPageActivity2 = SportDetailPageActivity.this;
                sportDetailPageActivity2.S0(sportDetailPageActivity2.mAllMapCropHeight);
                SportDetailPageActivity.this.p0().slidingLayout.setTouchEnabled(false);
                LockableNestedScrollView lockableNestedScrollView = SportDetailPageActivity.this.mLockableNestedScrollView;
                if (lockableNestedScrollView == null) {
                    return;
                }
                lockableNestedScrollView.setScrollingEnabled(false);
                return;
            }
            if (!SportDetailPageActivity.this.isFold || SportDetailPageActivity.this.mPanelState == SlidingUpPanelLayout.PanelState.EXPANDED) {
                return;
            }
            SportDetailPageActivity.this.isFold = false;
            OverViewCard overViewCard2 = SportDetailPageActivity.this.overViewCard;
            Objects.requireNonNull(overViewCard2);
            overViewCard2.updateIvFold(false);
            SlidingUpPanelLayout slidingUpPanelLayout2 = SportDetailPageActivity.this.p0().slidingLayout;
            SportDetailPageActivity sportDetailPageActivity3 = SportDetailPageActivity.this;
            slidingUpPanelLayout2.setPanelHeight((int) ViewUtils.dp2px(sportDetailPageActivity3, sportDetailPageActivity3.mFoldExpandedHeight));
            SportDetailPageActivity sportDetailPageActivity4 = SportDetailPageActivity.this;
            sportDetailPageActivity4.S0(sportDetailPageActivity4.mHalfMapCropHeight);
            SportDetailPageActivity.this.p0().slidingLayout.setTouchEnabled(true);
            LockableNestedScrollView lockableNestedScrollView2 = SportDetailPageActivity.this.mLockableNestedScrollView;
            if (lockableNestedScrollView2 == null) {
                return;
            }
            lockableNestedScrollView2.setScrollingEnabled(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            SportSharePreDialog sportSharePreDialog = SportDetailPageActivity.this.sharePreDialog;
            boolean z = false;
            if (sportSharePreDialog != null && sportSharePreDialog.isVisible()) {
                z = true;
            }
            return "SharePreDialog  is new " + z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "SharePreDialog  is new ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "dataInvalidLiveData error! message: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.activity.SportDetailPageActivity$onCreate$1", f = "SportDetailPageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportDetailPageActivity.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = SportDetailPageActivity.this.context;
            Objects.requireNonNull(context);
            StrengthTrainingAPI.getSportConfigAPI(context);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "trackId:" + SportDetailPageActivity.this.trackId + "   deviceSource:" + SportDetailPageActivity.this.deviceSource + "   sportType:" + SportDetailPageActivity.this.sportType;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadSportParsedDetailAndSportRecordLiveData error! " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "callback", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<Function1<? super Bitmap, ? extends Unit>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.moving.sport.ui.activity.SportDetailPageActivity$onTrackDataLoaded$1$1$1$1", f = "SportDetailPageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportDetailPageActivity b;
            public final /* synthetic */ Bitmap c;
            public final /* synthetic */ Function1<Bitmap, Unit> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(SportDetailPageActivity sportDetailPageActivity, Bitmap bitmap, Function1<? super Bitmap, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sportDetailPageActivity;
                this.c = bitmap;
                this.d = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SportDetailPageActivity sportDetailPageActivity = this.b;
                sportDetailPageActivity.mapBackgroundBitmap = sportDetailPageActivity.U(this.c);
                this.c.recycle();
                this.d.invoke(this.b.mapBackgroundBitmap);
                return Unit.INSTANCE;
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
                return "loadMapBackground error!";
            }
        }

        public o() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(SportDetailPageActivity sportDetailPageActivity, Function1 function1, Bitmap bitmap) {
            kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(sportDetailPageActivity), Dispatchers.getDefault(), null, new a(sportDetailPageActivity, bitmap, function1, null), 2, null);
        }

        public final void b(@NotNull final Function1<? super Bitmap, Unit> function1) {
            Object objM3845constructorimpl;
            final SportDetailPageActivity sportDetailPageActivity = SportDetailPageActivity.this;
            try {
                Result.Companion companion = Result.Companion;
                if (sportDetailPageActivity.mapScreenShotAvailable) {
                    SportTrackDetailFragment sportTrackDetailFragment = sportDetailPageActivity.hasTrackFragment;
                    if (sportTrackDetailFragment == null) {
                        throw null;
                    }
                    GPSSportTrackLoader trackLoader = sportTrackDetailFragment.getTrackLoader();
                    if (trackLoader != null) {
                        trackLoader.mapScreenShot(new IGPSSolution.IOnMapScreenShotListener() { // from class: com.huami.moving.sport.ui.activity.a
                            @Override // com.huami.moving.maps.IGPSSolution.IOnMapScreenShotListener
                            public final void onMapScreenShot(Bitmap bitmap) {
                                SportDetailPageActivity.o.c(sportDetailPageActivity, function1, bitmap);
                            }
                        });
                    }
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            SportDetailPageActivity sportDetailPageActivity2 = SportDetailPageActivity.this;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.warn(sportDetailPageActivity2.TAG, thM3848exceptionOrNullimpl, b.a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Bitmap, ? extends Unit> function1) {
            b(function1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.moving.sport.ui.activity.SportDetailPageActivity$onCaptureScreen$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/huami/moving/sport/ui/activity/SportDetailPageActivity$onCaptureScreen$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ SportSharePreDialog b;

        /* JADX INFO: renamed from: com.huami.moving.sport.ui.activity.SportDetailPageActivity$onCaptureScreen$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportDetailPageActivity a;
            public final /* synthetic */ SportSharePreDialog b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportDetailPageActivity sportDetailPageActivity, SportSharePreDialog sportSharePreDialog) {
                super(0);
                this.a = sportDetailPageActivity;
                this.b = sportSharePreDialog;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LinearLayout linearLayout = this.a.cardShareFeedback;
                Objects.requireNonNull(linearLayout);
                linearLayout.setVisibility(0);
                LinearLayout linearLayout2 = this.a.cardShareEnd;
                Objects.requireNonNull(linearLayout2);
                linearLayout2.setVisibility(8);
                ImageView imageView = this.a.imagePlay;
                if (imageView != null) {
                    imageView.setVisibility(this.a.I0() ? 0 : 8);
                }
                this.b.showCaptureScreen(this.a);
            }
        }

        public AnonymousClass1(SportSharePreDialog sportSharePreDialog) {
            this.b = sportSharePreDialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(SportDetailPageActivity sportDetailPageActivity, Observable observable, Function0 function0, Bitmap bitmap) {
            sportDetailPageActivity.N(bitmap, sportDetailPageActivity.W(observable, bitmap, bitmap.getHeight() - sportDetailPageActivity.getResources().getDimensionPixelOffset(R.dimen.moving_ui_panel_height_offset)), function0);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            final Observable observableR = SportDetailPageActivity.this.R();
            final a aVar = new a(SportDetailPageActivity.this, this.b);
            Unit unit = null;
            if (SportDetailPageActivity.this.hasTrackPage) {
                SportTrackDetailFragment sportTrackDetailFragment = SportDetailPageActivity.this.hasTrackFragment;
                Objects.requireNonNull(sportTrackDetailFragment);
                GPSSportTrackLoader trackLoader = sportTrackDetailFragment.getTrackLoader();
                if (trackLoader != null) {
                    final SportDetailPageActivity sportDetailPageActivity = SportDetailPageActivity.this;
                    trackLoader.mapScreenShot(new IGPSSolution.IOnMapScreenShotListener() { // from class: i97
                        @Override // com.huami.moving.maps.IGPSSolution.IOnMapScreenShotListener
                        public final void onMapScreenShot(Bitmap bitmap) {
                            SportDetailPageActivity.AnonymousClass1.b(sportDetailPageActivity, observableR, aVar, bitmap);
                        }
                    });
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    HMLog.i(SportDetailPageActivity.this.TAG, "trackLoader is null", new Object[0]);
                }
            } else {
                SportDetailPageActivity.this.N(null, SportDetailPageActivity.this.Y(observableR), aVar);
            }
            LinearLayout linearLayout = SportDetailPageActivity.this.cardShareEnd;
            Objects.requireNonNull(linearLayout);
            linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setPlayButtonVisibility:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/moving/sport/ui/viewmodel/SportDetailPageViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<SportDetailPageViewModel> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ViewModelOwner> {
            public final /* synthetic */ SportDetailPageActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportDetailPageActivity sportDetailPageActivity) {
                super(0);
                this.a = sportDetailPageActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.a);
            }
        }

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportDetailPageViewModel invoke() {
            return (SportDetailPageViewModel) ScopeExtKt.getViewModel$default(MovingUIModuleKt.getMovingUIKoinScope(), null, new a(SportDetailPageActivity.this), Reflection.getOrCreateKotlinClass(SportDetailPageViewModel.class), null, null, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.activity.SportDetailPageActivity$verifyDistance$1", f = "SportDetailPageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportDetailPageActivity.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Trackrecord trackrecord = SportDetailPageActivity.this.trackRecord;
            Objects.requireNonNull(trackrecord);
            PutRunningSummaryToServer.putRunSummary(trackrecord);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[7];
        kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SportDetailPageActivity.class), "viewBinding", "getViewBinding()Lcom/huami/moving/sport/ui/databinding/ActivitySportDetailPageBinding;"));
        kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SportDetailPageActivity.class), "viewBindingNoGps", "getViewBindingNoGps()Lcom/huami/moving/sport/ui/databinding/MovingUiActivitySportDetailPageNoGpsBinding;"));
        kPropertyArr[5] = Reflection.mutableProperty0(new MutablePropertyReference0Impl(Reflection.getOrCreateKotlinClass(SportDetailPageActivity.class), "formatChangeTime", "<v#0>"));
        kPropertyArr[6] = Reflection.mutableProperty0(new MutablePropertyReference0Impl(Reflection.getOrCreateKotlinClass(SportDetailPageActivity.class), "radioButton", "<v#1>"));
        U0 = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportDetailPageActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sportEndPageBusiness = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SportEndPageBusiness>() { // from class: com.huami.moving.sport.ui.activity.SportDetailPageActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.moving.ui.offcut.SportEndPageBusiness, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SportEndPageBusiness invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(SportEndPageBusiness.class), qualifier, objArr);
            }
        });
        this.TAG = TAG;
        this.viewBinding = ActivityViewBindingsKt.viewBinding(new SportDetailPageActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivitySportDetailPageBinding.class)));
        this.viewBindingNoGps = ActivityViewBindingsKt.viewBinding(new SportDetailPageActivity$special$$inlined$viewBinding$2(new InflateViewBinder(MovingUiActivitySportDetailPageNoGpsBinding.class)));
        this.useAmap = true;
        this.trackId = -1L;
        this.deviceSource = -1;
        this.sportType = 1;
        this.endChart = "";
        this.mHalfStartTime = -1;
        this.sportTypes = new int[]{100, 101, 102};
        this.mSportName = "";
        this.mPanelState = SlidingUpPanelLayout.PanelState.COLLAPSED;
        this.mFoldExpandedHeight = 400.0f;
        this.mFoldCollapsedHeight = 167.0f;
        this.mHalfMapCropHeight = 293.0f;
        this.mAllMapCropHeight = 60.0f;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.feedbackService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FeedbackService>() { // from class: com.huami.moving.sport.ui.activity.SportDetailPageActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.feedback.api.FeedbackService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FeedbackService invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(FeedbackService.class), objArr2, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(View view) {
        EventBus.getDefault().post(new EventHeatMapRadioButton(102));
    }

    private final void B0(boolean useAmap) {
        this.realScreenHeight = l0();
        int i2 = R.id.map_container;
        this.mapContainer = (FrameLayout) findViewById(i2);
        S0(this.mHalfMapCropHeight);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        SportTrackDetailFragment.Companion companion = SportTrackDetailFragment.INSTANCE;
        SportTrackDetailFragment sportTrackDetailFragmentNewInstance = companion.newInstance();
        this.hasTrackFragment = sportTrackDetailFragmentNewInstance;
        Objects.requireNonNull(sportTrackDetailFragmentNewInstance);
        Bundle bundle = new Bundle();
        bundle.putLong("trackId", this.trackId);
        bundle.putInt("deviceSource", this.deviceSource);
        bundle.putInt("sportType", this.realSportType);
        bundle.putBoolean(companion.getARGS_FROM_RUNNING(), this.navFrom == 1);
        bundle.putBoolean(companion.getARGS_USE_AMAP(), useAmap);
        bundle.putBoolean(companion.getARGS_OVER_SEA(), this.isOverSea);
        Unit unit = Unit.INSTANCE;
        sportTrackDetailFragmentNewInstance.setArguments(bundle);
        SportTrackDetailFragment sportTrackDetailFragment = this.hasTrackFragment;
        Objects.requireNonNull(sportTrackDetailFragment);
        fragmentTransactionBeginTransaction.add(i2, sportTrackDetailFragment);
        fragmentTransactionBeginTransaction.commit();
    }

    private final void C0() {
        ScreenShotListenManager screenShotListenManagerNewInstance = ScreenShotListenManager.INSTANCE.newInstance(this);
        this.mScreenShotListenManager = screenShotListenManagerNewInstance;
        if (screenShotListenManagerNewInstance == null) {
            return;
        }
        screenShotListenManagerNewInstance.setOnChangeListener(new OnScreenShotListener() { // from class: com.huami.moving.sport.ui.activity.SportDetailPageActivity$initScreenShotListen$1
            @Override // com.huami.moving.ui.sport.detail.screenshot.OnScreenShotListener
            public void onShot(@NotNull String imagePath) {
                Log.d(this.a.TAG, imagePath);
                if (this.a.sharePreDialog == null) {
                    this.a.sharePreDialog = new SportSharePreDialog();
                }
                SportSharePreDialog sportSharePreDialog = this.a.sharePreDialog;
                if (sportSharePreDialog != null) {
                    sportSharePreDialog.setCaptureScreenListener(this.a);
                }
                SportSharePreDialog sportSharePreDialog2 = this.a.sharePreDialog;
                if (sportSharePreDialog2 != null) {
                    sportSharePreDialog2.setMutualCallerListener(this.a);
                }
                SportSharePreDialog sportSharePreDialog3 = this.a.sharePreDialog;
                if (sportSharePreDialog3 != null) {
                    sportSharePreDialog3.setAnalyticsEventListener(this.a);
                }
                SportSharePreDialog sportSharePreDialog4 = this.a.sharePreDialog;
                if (sportSharePreDialog4 == null) {
                    return;
                }
                sportSharePreDialog4.onShareLong(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(SportDetailPageActivity sportDetailPageActivity) {
        sportDetailPageActivity.setStatusBarTranslate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(SportDetailPageActivity sportDetailPageActivity, View view) {
        sportDetailPageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(SportDetailPageActivity sportDetailPageActivity, View view) {
        sportDetailPageActivity.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(SportDetailPageActivity sportDetailPageActivity, View view) {
        HMLog.info(sportDetailPageActivity.TAG, sportDetailPageActivity.new i());
        SportSharePreDialog sportSharePreDialog = sportDetailPageActivity.sharePreDialog;
        boolean z = false;
        if (sportSharePreDialog != null && sportSharePreDialog.isVisible()) {
            z = true;
        }
        if (z) {
            return;
        }
        SportSharePreDialog sportSharePreDialog2 = sportDetailPageActivity.sharePreDialog;
        if (sportSharePreDialog2 != null) {
            if (sportSharePreDialog2 == null) {
                return;
            }
            sportSharePreDialog2.showAllowingStateLoss(sportDetailPageActivity.getSupportFragmentManager(), "df", sportDetailPageActivity.sharePreDialog);
            return;
        }
        HMLog.info(sportDetailPageActivity.TAG, j.a);
        SportSharePreDialog sportSharePreDialog3 = new SportSharePreDialog();
        sportDetailPageActivity.sharePreDialog = sportSharePreDialog3;
        sportSharePreDialog3.setCaptureScreenListener(sportDetailPageActivity);
        SportSharePreDialog sportSharePreDialog4 = sportDetailPageActivity.sharePreDialog;
        if (sportSharePreDialog4 != null) {
            sportSharePreDialog4.setMutualCallerListener(sportDetailPageActivity);
        }
        SportSharePreDialog sportSharePreDialog5 = sportDetailPageActivity.sharePreDialog;
        if (sportSharePreDialog5 != null) {
            sportSharePreDialog5.setAnalyticsEventListener(sportDetailPageActivity);
        }
        SportSharePreDialog sportSharePreDialog6 = sportDetailPageActivity.sharePreDialog;
        if (sportSharePreDialog6 != null) {
            sportSharePreDialog6.setShareExportListener(sportDetailPageActivity);
        }
        SportSharePreDialog sportSharePreDialog7 = sportDetailPageActivity.sharePreDialog;
        if (sportSharePreDialog7 != null) {
            sportSharePreDialog7.setShareVideoTrackListener(sportDetailPageActivity);
        }
        SportSharePreDialog sportSharePreDialog8 = sportDetailPageActivity.sharePreDialog;
        if (sportSharePreDialog8 == null) {
            return;
        }
        sportSharePreDialog8.showAllowingStateLoss(sportDetailPageActivity.getSupportFragmentManager(), "df", sportDetailPageActivity.sharePreDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(SportDetailPageActivity sportDetailPageActivity, View view) {
        sportDetailPageActivity.uploadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I0() {
        return this.hasTrackPage && SportTypeIconUtils.INSTANCE.getSportNameMap().containsKey(Integer.valueOf(this.sportType)) && Utils.isChinaUser();
    }

    private final void J(Trackrecord trackrecord, ParsedSportDetailData detailData) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins((int) ViewUtils.dp2px(this, 10.0f), 0, (int) ViewUtils.dp2px(this, 10.0f), (int) ViewUtils.dp2px(this, 12.0f));
        SportChartJsonParser sportChartJsonParser = SportChartJsonParser.INSTANCE;
        int i2 = this.sportType;
        Context context = this.context;
        Objects.requireNonNull(context);
        List<SportChartType> listMatchChartTypeBySportType = sportChartJsonParser.matchChartTypeBySportType(i2, context);
        Log.i(this.TAG, "addSportChartView size:" + listMatchChartTypeBySportType.size());
        Iterator<T> it2 = listMatchChartTypeBySportType.iterator();
        while (it2.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$0[((SportChartType) it2.next()).ordinal()]) {
                case 1:
                    if (!detailData.getAlignedPaceList().isEmpty()) {
                        PaceType paceType = new PaceType();
                        Context context2 = this.context;
                        Objects.requireNonNull(context2);
                        g0(new PaceDataProvider(trackrecord, detailData, paceType, context2, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = "pace";
                    }
                    break;
                case 2:
                    if (!detailData.getAlignedSpeedList().isEmpty()) {
                        SpeedType speedType = new SpeedType();
                        Context context3 = this.context;
                        Objects.requireNonNull(context3);
                        g0(new SpeedDataProvider(trackrecord, detailData, speedType, context3, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = "speed";
                    }
                    break;
                case 3:
                    if (!detailData.getAlignedHeartList().isEmpty()) {
                        HeartType heartType = new HeartType();
                        Context context4 = this.context;
                        Objects.requireNonNull(context4);
                        g0(new HeartDataProvider(trackrecord, detailData, heartType, context4, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_HEARTRATE;
                    }
                    break;
                case 4:
                    if ((!detailData.getAlignedAltiList().isEmpty()) || (!detailData.getAlignedTimeDeltaAltitudeList().isEmpty())) {
                        AltiType altiType = new AltiType();
                        Context context5 = this.context;
                        Objects.requireNonNull(context5);
                        g0(new AltiDataProvider(trackrecord, detailData, altiType, context5, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = "altitude";
                    }
                    break;
                case 5:
                    if ((!detailData.getAlignedStepFreqList().isEmpty()) && !UnSupportChartTypeSource.INSTANCE.unSupportStepChartDeviceSource(this.deviceSource)) {
                        HMLog.info(this.TAG, new a(detailData));
                        StepFreqType stepFreqType = new StepFreqType();
                        Context context6 = this.context;
                        Objects.requireNonNull(context6);
                        g0(new StepFreqDataProvider(trackrecord, detailData, stepFreqType, context6, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = "cadence";
                    }
                    break;
                case 6:
                    HMLog.info(this.TAG, new b(detailData));
                    if ((!detailData.getAlignedStepStrideList().isEmpty()) && !UnSupportChartTypeSource.INSTANCE.unSupportStepChartDeviceSource(this.deviceSource)) {
                        StepType stepType = new StepType();
                        Context context7 = this.context;
                        Objects.requireNonNull(context7);
                        g0(new StepDataProvider(trackrecord, detailData, stepType, context7, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = "stride";
                    }
                    break;
                case 7:
                    if (!detailData.getAlignedStrokeList().isEmpty()) {
                        StrokeSpeedType strokeSpeedType = new StrokeSpeedType();
                        Context context8 = this.context;
                        Objects.requireNonNull(context8);
                        g0(new StrokeSpeedDataProvider(trackrecord, detailData, strokeSpeedType, context8, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_STROKERATE;
                    }
                    break;
                case 8:
                    if (!detailData.getAlignedStrokeList().isEmpty()) {
                        BoatingFreType boatingFreType = new BoatingFreType();
                        Context context9 = this.context;
                        Objects.requireNonNull(context9);
                        g0(new BoatingFreDataProvider(trackrecord, detailData, boatingFreType, context9, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_ROWINGRATE;
                    }
                    break;
                case 9:
                    if (!detailData.getAlignedRopeSkipList().isEmpty()) {
                        RopeSkipingFreqType ropeSkipingFreqType = new RopeSkipingFreqType();
                        Context context10 = this.context;
                        Objects.requireNonNull(context10);
                        g0(new RopeSkipingFreqDataProvider(trackrecord, detailData, ropeSkipingFreqType, context10, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_ROPEFREQUENCY;
                    }
                    break;
                case 10:
                    if (!detailData.getSpo2List().isEmpty()) {
                        Spo2Type spo2Type = new Spo2Type();
                        Context context11 = this.context;
                        Objects.requireNonNull(context11);
                        g0(new Spo2DataProvider(trackrecord, detailData, spo2Type, context11, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = "spo2";
                    }
                    break;
                case 11:
                    Log.i(this.TAG, "pressureList size:" + detailData.getPressureList().size());
                    if (!detailData.getPressureList().isEmpty()) {
                        PressureType pressureType = new PressureType();
                        Context context12 = this.context;
                        Objects.requireNonNull(context12);
                        g0(new PressureDataProvider(trackrecord, detailData, pressureType, context12, this.isMetric), layoutParams);
                        this.totalpics++;
                    }
                    break;
                case 12:
                    if (!detailData.getDailyPerformanceList().isEmpty()) {
                        BodyStatusType bodyStatusType = new BodyStatusType();
                        Context context13 = this.context;
                        Objects.requireNonNull(context13);
                        g0(new BodyStatusProvider(trackrecord, detailData, bodyStatusType, context13, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_BODY_STATE;
                    }
                    break;
                case 13:
                    if (!detailData.getHrZoneList().isEmpty()) {
                        e0(detailData.getHrZoneList(), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_HEART_RATE_RANGE;
                    }
                    break;
                case 14:
                    HMLog.info(this.TAG, new c(trackrecord));
                    Integer climbDisAscendTime = trackrecord.getClimbDisAscendTime();
                    if ((climbDisAscendTime == null ? -1 : climbDisAscendTime.intValue()) >= 0) {
                        Integer climbDisDescendTime = trackrecord.getClimbDisDescendTime();
                        if ((climbDisDescendTime == null ? -1 : climbDisDescendTime.intValue()) >= 0) {
                            f0(trackrecord, layoutParams);
                            this.totalpics++;
                            this.endChart = SportAnalytics.ParamValue.ChartType.CHART_SLOPE;
                        }
                    }
                    break;
                case 15:
                    if (!detailData.getGolfBeatList().isEmpty()) {
                        GolfBeatType golfBeatType = new GolfBeatType();
                        Context context14 = this.context;
                        Objects.requireNonNull(context14);
                        g0(new GolfBeatDataProvider(trackrecord, detailData, golfBeatType, context14, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_SLOPE;
                    }
                    break;
                case 16:
                    if (!detailData.getGolfAngleList().isEmpty()) {
                        GolfAngleType golfAngleType = new GolfAngleType();
                        Context context15 = this.context;
                        Objects.requireNonNull(context15);
                        g0(new GolfAngleDataProvider(trackrecord, detailData, golfAngleType, context15, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_SLOPE;
                    }
                    break;
                case 17:
                    if ((!detailData.getGolfDownTimeList().isEmpty()) || (!detailData.getGolfUpTimeList().isEmpty())) {
                        GolfUpDownTimeType golfUpDownTimeType = new GolfUpDownTimeType();
                        Context context16 = this.context;
                        Objects.requireNonNull(context16);
                        g0(new GolfUpDownTimeDataProvider(trackrecord, detailData, golfUpDownTimeType, context16, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_SLOPE;
                    }
                    break;
                case 18:
                    if (!detailData.getAlignedPowerMeterList().isEmpty()) {
                        PowerMeterType powerMeterType = new PowerMeterType();
                        Context context17 = this.context;
                        Objects.requireNonNull(context17);
                        g0(new PowerMeterDataProvider(trackrecord, detailData, powerMeterType, context17, this.isMetric), layoutParams);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_SLOPE;
                    }
                    break;
                case 19:
                    HMLog.info(this.TAG, new d(trackrecord));
                    Integer teValue = trackrecord.getTeValue();
                    int show_et = (teValue == null ? 0 : teValue.intValue()) > 0 ? CardTrainingEffect.INSTANCE.getSHOW_ET() + 0 : 0;
                    HMLog.info(this.TAG, new e(trackrecord));
                    Integer teAnaerobicValue = trackrecord.getTeAnaerobicValue();
                    if ((teAnaerobicValue == null ? 0 : teAnaerobicValue.intValue()) > 0) {
                        show_et += CardTrainingEffect.INSTANCE.getSHOW_TE_ANAEROBIC();
                    }
                    if (show_et != 0) {
                        j0(trackrecord, layoutParams, show_et);
                        this.totalpics++;
                        this.endChart = SportAnalytics.ParamValue.ChartType.CHART_TRAINING_EFFECT;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(SportDetailPageActivity sportDetailPageActivity, Pair pair) {
        sportDetailPageActivity.a1((Trackrecord) pair.getFirst(), (List) pair.getSecond());
        for (Trackrecord trackrecord : (Iterable) pair.getSecond()) {
            System.out.println((Object) (" child list:" + trackrecord.getTrackid() + "," + trackrecord.getCosttime()));
        }
    }

    private final void K() {
        String stringExtra;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", String.valueOf(this.trackId));
        linkedHashMap.put("sportstype", String.valueOf(this.sportType));
        Intent intent = getIntent();
        String str = "";
        if (intent != null && (stringExtra = intent.getStringExtra(StatEvent.CF)) != null) {
            str = stringExtra;
        }
        linkedHashMap.put("cf", str);
        linkedHashMap.put("tp", this.hasTrackPage ? "withGPS" : "withoutGPS");
        Analytics.recordEvent(new CountEventBuilder("ENTER_SPORT_DETAIL_C").putExtras(linkedHashMap).setAnonymous(!Utils.isChinaUser()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(SportDetailPageActivity sportDetailPageActivity, String str) {
        HMLog.info(sportDetailPageActivity.TAG, new k(str));
        sportDetailPageActivity.V0();
    }

    private final void L() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", String.valueOf(this.trackId));
        linkedHashMap.put("sportstype", String.valueOf(this.sportType));
        linkedHashMap.put(SportAnalytics.ParamKey.TOTALPICS, String.valueOf(this.totalpics));
        linkedHashMap.put(SportAnalytics.ParamKey.VIEW_EDPICS, String.valueOf(this.totalpics));
        linkedHashMap.put("pos", this.endChart);
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EXIT_SPORT_DETAIL).putExtras(linkedHashMap).setAnonymous(!Utils.isChinaUser()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(SportDetailPageActivity sportDetailPageActivity, SportDataDisplayItem sportDataDisplayItem) {
        OverViewCard overViewCard = sportDetailPageActivity.overViewCard;
        Objects.requireNonNull(overViewCard);
        overViewCard.updateMainData(sportDataDisplayItem);
    }

    private final void M() {
        k0().feedback(LifecycleOwnerKt.getLifecycleScope(this), this, getSupportFragmentManager(), new FeedbackParams(null, "sport", null, null, false, 29, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(SportDetailPageActivity sportDetailPageActivity, Pair pair) {
        sportDetailPageActivity.trackRecord = (Trackrecord) pair.getSecond();
        sportDetailPageActivity.m0().loadChildSportRecordLiveData((Trackrecord) pair.getSecond());
        sportDetailPageActivity.Z0((Trackrecord) pair.getSecond());
        sportDetailPageActivity.J((Trackrecord) pair.getSecond(), (ParsedSportDetailData) pair.getFirst());
        sportDetailPageActivity.u0((Trackrecord) pair.getSecond());
        if (sportDetailPageActivity.sportType == 52 && SportDeviceUtils.isSupportSTUpgradeCategory(sportDetailPageActivity.deviceSource)) {
            sportDetailPageActivity.Y0();
        }
        if (sportDetailPageActivity.b1((ParsedSportDetailData) pair.getFirst())) {
            sportDetailPageActivity.X0();
        }
        WatermarkClient.INSTANCE.getInstance().fillDataToValueMap(((Trackrecord) pair.getSecond()).getTrackid().longValue(), ((Trackrecord) pair.getSecond()).getSource().intValue(), sportDetailPageActivity.sportType, sportDetailPageActivity.isMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(final Bitmap header, Observable<Unit> middle, final Function0<Unit> action) {
        middle.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: x87
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SportDetailPageActivity.O((Unit) obj);
            }
        }, new Action1() { // from class: w87
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SportDetailPageActivity.P(this.a, (Throwable) obj);
            }
        }, new Action0() { // from class: t87
            @Override // rx.functions.Action0
            public final void call() {
                SportDetailPageActivity.Q(header, this, action);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(SportDetailPageActivity sportDetailPageActivity, List list) {
        OverViewCard overViewCard = sportDetailPageActivity.overViewCard;
        Objects.requireNonNull(overViewCard);
        overViewCard.setDevice(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Unit unit) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(SportDetailPageActivity sportDetailPageActivity, List list) {
        Trackrecord second;
        OverViewCard overViewCard = sportDetailPageActivity.overViewCard;
        Objects.requireNonNull(overViewCard);
        Pair<ParsedSportDetailData, Trackrecord> value = sportDetailPageActivity.m0().getSportParsedAndSportRecordDetailLiveData().getValue();
        if (value == null || (second = value.getSecond()) == null) {
            return;
        }
        CardInfoAdapter cardInfoAdapter = new CardInfoAdapter(sportDetailPageActivity, second, list);
        String strA0 = sportDetailPageActivity.a0(second.getSportMode(), cardInfoAdapter.getPostfix());
        sportDetailPageActivity.mSportName = strA0;
        TextView textView = sportDetailPageActivity.locationAndSportType;
        Objects.requireNonNull(textView);
        textView.setText(strA0);
        overViewCard.setData(sportDetailPageActivity.hasTrackPage, cardInfoAdapter, sportDetailPageActivity.n0().getFullTimeFormatString(sportDetailPageActivity.getApplicationContext(), sportDetailPageActivity.trackId * ((long) 1000)), second, sportDetailPageActivity.navFrom, sportDetailPageActivity.isMetric, sportDetailPageActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(SportDetailPageActivity sportDetailPageActivity, Throwable th) {
        HMLog.e(sportDetailPageActivity.TAG, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(SportDetailPageActivity sportDetailPageActivity, HrZoneShowRuleConfig hrZoneShowRuleConfig) {
        Pair<ParsedSportDetailData, Trackrecord> value;
        ParsedSportDetailData first;
        HeartRateCard heartRateCard = sportDetailPageActivity.heartRateZoneCard;
        if (heartRateCard == null || heartRateCard.getContentSize() > 0 || (value = sportDetailPageActivity.m0().getSportParsedAndSportRecordDetailLiveData().getValue()) == null || (first = value.getFirst()) == null) {
            return;
        }
        heartRateCard.setContent(first.getHrZoneList(), hrZoneShowRuleConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(Bitmap bitmap, SportDetailPageActivity sportDetailPageActivity, Function0 function0) {
        if (!Intrinsics.areEqual(bitmap, sportDetailPageActivity.headBitmap) && bitmap != null) {
            bitmap.recycle();
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", String.valueOf(this.trackId));
        linkedHashMap.put("sportstype", String.valueOf(this.sportType));
        Analytics.recordEvent(new CountEventBuilder("ENTER_MORE_DETAIL_C").putExtras(linkedHashMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Pair<String, Bitmap>> R() {
        LockableNestedScrollView lockableNestedScrollView = this.mLockableNestedScrollView;
        View childAt = lockableNestedScrollView == null ? null : lockableNestedScrollView.getChildAt(0);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        final ViewGroup viewGroup = (ViewGroup) childAt;
        return Observable.create(new Action1() { // from class: u87
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SportDetailPageActivity.S(viewGroup, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    private final void R0(List<Integer> typeList) {
        SportStrengthTrainingFragment sportStrengthTrainingFragment = this.strengthTrainingFragment;
        Objects.requireNonNull(sportStrengthTrainingFragment);
        sportStrengthTrainingFragment.setTypeList(typeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(ViewGroup viewGroup, Emitter emitter) {
        Bitmap viewBitmap = BitmapUtils.getViewBitmap(viewGroup.getChildAt(0));
        Bitmap unViewBitmap = BitmapUtils.getUnViewBitmap(viewGroup.getChildAt(viewGroup.getChildCount() - 1));
        emitter.onNext(TuplesKt.to(SportSharePreDialog.SPORT_SHARE_TAB_SHORT, BitmapUtils.joinConnectBitmap(viewBitmap, unViewBitmap, true, 0, viewBitmap.getHeight())));
        emitter.onNext(TuplesKt.to(SportSharePreDialog.SPORT_SHARE_TAB_LONG, BitmapUtils.getViewGroupBitmap(viewGroup)));
        viewBitmap.recycle();
        unViewBitmap.recycle();
        emitter.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(float offset) {
        FrameLayout frameLayout = this.mapContainer;
        Objects.requireNonNull(frameLayout);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        float f2 = this.realScreenHeight;
        Context context = this.context;
        Objects.requireNonNull(context);
        layoutParams.height = (int) (f2 - ViewUtils.dp2px(context, offset));
        FrameLayout frameLayout2 = this.mapContainer;
        Objects.requireNonNull(frameLayout2);
        frameLayout2.setLayoutParams(layoutParams);
    }

    private final byte[] T(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i2, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(SportDetailPageActivity sportDetailPageActivity, View view) {
        sportDetailPageActivity.isPlayTrack = true;
        sportDetailPageActivity.uploadData();
        TrackVideoShareActivity.Companion companion = TrackVideoShareActivity.INSTANCE;
        Context context = sportDetailPageActivity.context;
        Objects.requireNonNull(context);
        companion.start(context, sportDetailPageActivity.trackId, sportDetailPageActivity.deviceSource, sportDetailPageActivity.getRealSportType());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pos", SportAnalytics.ParamValue.TrackVideo.SPORT_MAP);
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.PLAY_ROUTE_VIDEO_C).putExtras(linkedHashMap).setAnonymous(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap U(Bitmap bitmap) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(V(T(bitmap, Bitmap.CompressFormat.WEBP, 60), 2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (Bitmap) objM3845constructorimpl;
    }

    private final void U0(boolean isDarkText, int color) {
        this.statusBarDarkText = isDarkText && !RainbowUtils.isDarkMode(this);
        this.statusBarBgColor = color;
        StatusBarUtil.setStatusColor(this, true, isDarkText, color);
    }

    private final Bitmap V(byte[] bArr, int i2) {
        int length = bArr.length;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i2;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Unit unit = Unit.INSTANCE;
        return BitmapFactory.decodeByteArray(bArr, 0, length, options);
    }

    private final void V0() {
        Context context = this.context;
        Objects.requireNonNull(context);
        new AlertDialogFragment.Builder(context).setCancelable(true).setTitle(getString(R.string.network_request_fail)).setMessage(getString(R.string.sport_feedback_to_us)).setNeutralButton(getString(R.string.gps_main_pop_knowed), new DialogInterface.OnClickListener() { // from class: k87
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SportDetailPageActivity.W0(this.a, dialogInterface, i2);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Unit> W(Observable<Pair<String, Bitmap>> start, final Bitmap header, final int marginTop) {
        return start.map(new Func1() { // from class: z87
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return SportDetailPageActivity.X(this.a, header, marginTop, (Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(SportDetailPageActivity sportDetailPageActivity, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        sportDetailPageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(SportDetailPageActivity sportDetailPageActivity, Bitmap bitmap, int i2, Pair pair) throws Throwable {
        String absolutePath = ShareFileUtils.INSTANCE.getShareCacheFile(sportDetailPageActivity, (String) pair.getFirst()).getAbsolutePath();
        Bitmap bitmapJoinConnectBitmap = BitmapUtils.joinConnectBitmap(bitmap, (Bitmap) pair.getSecond(), true, 0, i2);
        AddWatermarkUtils addWatermarkUtils = AddWatermarkUtils.INSTANCE;
        Bitmap bitmapAddTextWatermark = addWatermarkUtils.addTextWatermark(sportDetailPageActivity, bitmapJoinConnectBitmap, sportDetailPageActivity.mSportName, false);
        Bitmap bitmapAddImageWatermark = addWatermarkUtils.addImageWatermark(sportDetailPageActivity, bitmapAddTextWatermark, BitmapFactory.decodeResource(sportDetailPageActivity.getResources(), Utils.isMidong() ? R.drawable.moving_ui_zepp_logo : R.drawable.moving_ui_zepp_life_logo));
        BitmapUtils.saveBitmapToFile(absolutePath, bitmapAddImageWatermark, 90);
        ((Bitmap) pair.getSecond()).recycle();
        bitmapJoinConnectBitmap.recycle();
        bitmapAddTextWatermark.recycle();
        bitmapAddImageWatermark.recycle();
        return Unit.INSTANCE;
    }

    private final void X0() {
        LinearLayout linearLayout = this.segmentLayout;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
        SportSegmentFragments sportSegmentFragmentsNewInstance = SportSegmentFragments.INSTANCE.newInstance(this.trackId, this.deviceSource, this.realSportType, this.isMetric, true, false);
        Context context = linearLayout.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction().replace(R.id.segment_layout, sportSegmentFragmentsNewInstance).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Unit> Y(Observable<Pair<String, Bitmap>> start) {
        return start.map(new Func1() { // from class: y87
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return SportDetailPageActivity.Z(this.a, (Pair) obj);
            }
        });
    }

    private final void Y0() {
        int i2 = R.id.card_strength_training_layout;
        LinearLayout linearLayout = (LinearLayout) findViewById(i2);
        if (linearLayout == null) {
            return;
        }
        List<Integer> listO0 = o0();
        if (!(!listO0.isEmpty())) {
            listO0 = null;
        }
        if (listO0 == null) {
            return;
        }
        linearLayout.setVisibility(0);
        this.strengthTrainingFragment = (SportStrengthTrainingFragment) SportStrengthTrainingFragment.INSTANCE.newInstance((ArrayList) listO0);
        Context context = linearLayout.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentTransaction fragmentTransactionBeginTransaction = ((FragmentActivity) context).getSupportFragmentManager().beginTransaction();
        SportStrengthTrainingFragment sportStrengthTrainingFragment = this.strengthTrainingFragment;
        Objects.requireNonNull(sportStrengthTrainingFragment);
        fragmentTransactionBeginTransaction.replace(i2, sportStrengthTrainingFragment).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(SportDetailPageActivity sportDetailPageActivity, Pair pair) throws Throwable {
        String absolutePath = ShareFileUtils.INSTANCE.getShareCacheFile(sportDetailPageActivity, (String) pair.getFirst()).getAbsolutePath();
        Bitmap bitmapAddTextWatermark = AddWatermarkUtils.INSTANCE.addTextWatermark(sportDetailPageActivity, (Bitmap) pair.getSecond(), sportDetailPageActivity.mSportName, SportTypeIdentifier.isOutdoorSportType(sportDetailPageActivity.sportType));
        BitmapUtils.saveBitmapToFile(absolutePath, bitmapAddTextWatermark, 90);
        ((Bitmap) pair.getSecond()).recycle();
        bitmapAddTextWatermark.recycle();
        return Unit.INSTANCE;
    }

    private final void Z0(Trackrecord trackRecord) {
        RecyclerView recyclerView = this.targetCardView;
        if (recyclerView != null && trackRecord.getTargetType() > TargetCardAdapter.TargetType.TARGET_NONE.ordinal()) {
            if (trackRecord.getTargetType() == TargetCardAdapter.TargetType.TARGET_PACE.ordinal()) {
                recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
            }
            recyclerView.addItemDecoration(new GridLayoutDecoration(recyclerView.getContext(), R.dimen.moving_ui_divider_size_dp1, R.color.s4));
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setAdapter(new TargetCardAdapter(recyclerView.getContext(), trackRecord, this.isMetric, false));
            RelativeLayout relativeLayout = this.targetCardLayout;
            if (relativeLayout == null) {
                return;
            }
            relativeLayout.setVisibility(0);
        }
    }

    private final String a0(int sportMode, String sportNameRes) {
        if (sportMode != 4) {
            return sportNameRes;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(getString(com.huami.moving.R.string.sport_title_interval_training), Arrays.copyOf(new Object[]{sportNameRes}, 1));
    }

    private final void a1(Trackrecord parent, List<? extends Trackrecord> list) {
        View viewH0;
        if (list == null || list.isEmpty()) {
            return;
        }
        LinearLayoutCompat linearLayoutCompat = this.triangleMultiple;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setVisibility(0);
        }
        long[] jArr = new long[list.size()];
        int[] iArr = new int[list.size() - 1];
        Trackrecord[] trackrecordArr = new Trackrecord[list.size()];
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                Trackrecord trackrecord = list.get(i2);
                trackrecordArr[i2] = trackrecord;
                jArr[i2] = trackrecord.getEndtime().longValue();
                if (i2 > 0) {
                    int i4 = i2 - 1;
                    iArr[i4] = (int) (list.get(i2).getTrackid().longValue() - jArr[i4]);
                }
                if (i3 > size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        boolean z = parent.getSportMode() == 5;
        int size2 = list.size();
        if (!z) {
            size2 = (size2 * 2) - 1;
        }
        if (size2 <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (z) {
                viewH0 = h0(list.get(i5));
            } else {
                boolean z2 = i5 % 2 != 0;
                if (z2) {
                    int i7 = i5 / 2;
                    viewH0 = b0(iArr[i7], i7 + 1);
                } else {
                    if (z2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    viewH0 = h0(trackrecordArr[i5 / 2]);
                }
            }
            LinearLayoutCompat linearLayoutCompat2 = this.triangleMultiple;
            if (linearLayoutCompat2 != null) {
                linearLayoutCompat2.addView(viewH0);
            }
            if (i6 >= size2) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    private final View b0(long changeTime, int order) {
        String str;
        Context context = this.context;
        Objects.requireNonNull(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.moving_ui_mutiple_sport_item_two, (ViewGroup) this.triangleMultiple, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.sport_change);
        String consumeTime = DataFormatter.getConsumeTime(changeTime);
        ReadWriteProperty readWritePropertyNotNull = Delegates.INSTANCE.notNull();
        if (this.sportType == 2002) {
            Context context2 = this.context;
            Objects.requireNonNull(context2);
            str = context2.getString(R.string.multiple_change) + "," + consumeTime;
        } else {
            Context context3 = this.context;
            Objects.requireNonNull(context3);
            str = ExifInterface.GPS_DIRECTION_TRUE + order + context3.getString(R.string.multiple_change) + "," + consumeTime;
        }
        d0(readWritePropertyNotNull, str);
        textView.setText(c0(readWritePropertyNotNull));
        return viewInflate;
    }

    private final boolean b1(ParsedSportDetailData parsedSportDetailData) {
        if (SportTypeIdentifier.isSupportSegmentMode(this.deviceSource, this.realSportType)) {
            return (SportTypeIdentifier.isSupportPerKmSegment(this.realSportType) && s0(parsedSportDetailData)) || t0(parsedSportDetailData);
        }
        return false;
    }

    private static final String c0(ReadWriteProperty<Object, String> readWriteProperty) {
        return readWriteProperty.getValue(null, U0[5]);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x014d  */
    private final void c1(int distance) {
        int i2 = 0;
        if (this.navFrom == 1) {
            List<ActivetrackStep> list = HMDaoManager.getInstance().getActivetrackStepDao().queryBuilder().where(ActivetrackStepDao.Properties.Trackid.eq(Long.valueOf(this.trackId)), new WhereCondition[0]).list();
            if (list != null && (true ^ list.isEmpty()) && list.get(0).getStepFreq() != null) {
                int size = list.size();
                long[] jArr = new long[size];
                short[] sArr = new short[size];
                if (size > 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        ActivetrackStep activetrackStep = list.get(i2);
                        Long time = activetrackStep.getTime();
                        jArr[i2] = time == null ? 0L : time.longValue();
                        sArr[i2] = (short) (activetrackStep.getStepFreq().floatValue() * 60);
                        if (i3 >= size) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    }
                }
                GPSDataController.getInstance().verify(jArr, sArr, distance);
            }
            Trackrecord trackrecord = this.trackRecord;
            Objects.requireNonNull(trackrecord);
            trackrecord.setDistance(Integer.valueOf(distance));
            Trackrecord trackrecord2 = this.trackRecord;
            Objects.requireNonNull(trackrecord2);
            float fIntValue = trackrecord2.getCosttime().intValue() / distance;
            Trackrecord trackrecord3 = this.trackRecord;
            Objects.requireNonNull(trackrecord3);
            trackrecord3.setPace(Float.valueOf(fIntValue));
            TrackRecordManager trackRecordManager = TrackRecordManager.getInstance();
            Trackrecord trackrecord4 = this.trackRecord;
            Objects.requireNonNull(trackrecord4);
            trackRecordManager.updateTrackRecord(trackrecord4);
            return;
        }
        Trackrecord latestIndoorRunRecordBySource = TrackRecordManager.getInstance().getLatestIndoorRunRecordBySource(this.deviceSource);
        if (latestIndoorRunRecordBySource != null && this.trackId >= latestIndoorRunRecordBySource.getTrackid().longValue()) {
            SportUsingDeviceHandler sportUsingDeviceHandler = SportUsingDeviceHandler.getInstance();
            long j2 = this.trackId;
            Trackrecord trackrecord5 = this.trackRecord;
            Objects.requireNonNull(trackrecord5);
            Integer totalStep = trackrecord5.getTotalStep();
            sportUsingDeviceHandler.sendVerifyDisCmd2Device(j2, distance, totalStep == null ? 0 : totalStep.intValue(), this.deviceSource);
        }
        Trackrecord trackrecord6 = this.trackRecord;
        Objects.requireNonNull(trackrecord6);
        trackrecord6.setDistance(Integer.valueOf(distance));
        Trackrecord trackrecord7 = this.trackRecord;
        Objects.requireNonNull(trackrecord7);
        float fIntValue2 = trackrecord7.getCosttime().intValue() / distance;
        Trackrecord trackrecord8 = this.trackRecord;
        Objects.requireNonNull(trackrecord8);
        trackrecord8.setPace(Float.valueOf(fIntValue2));
        Trackrecord trackrecord9 = this.trackRecord;
        Objects.requireNonNull(trackrecord9);
        trackrecord9.setIndoorRunCalibrated(1);
        Trackrecord trackrecord10 = this.trackRecord;
        Objects.requireNonNull(trackrecord10);
        Integer state = trackrecord10.getState();
        int value = SyncedState.STATE_SYNCED_FROM_SERVER_SUMMERY_DONE.getValue();
        if (state != null && state.intValue() == value) {
            Trackrecord trackrecord11 = this.trackRecord;
            Objects.requireNonNull(trackrecord11);
            trackrecord11.setState(Integer.valueOf(SyncedState.STATE_SYNC_AGAIN.getValue()));
        } else {
            Trackrecord trackrecord12 = this.trackRecord;
            Objects.requireNonNull(trackrecord12);
            Integer state2 = trackrecord12.getState();
            int value2 = SyncedState.STATE_SYNCED_TO_SERVER.getValue();
            if (state2 != null && state2.intValue() == value2) {
                Trackrecord trackrecord13 = this.trackRecord;
                Objects.requireNonNull(trackrecord13);
                trackrecord13.setState(Integer.valueOf(SyncedState.STATE_SYNC_AGAIN.getValue()));
            }
        }
        TrackRecordManager trackRecordManager2 = TrackRecordManager.getInstance();
        Trackrecord trackrecord14 = this.trackRecord;
        Objects.requireNonNull(trackrecord14);
        trackRecordManager2.updateTrackRecord(trackrecord14);
        EventBus eventBus = EventBus.getDefault();
        Trackrecord trackrecord15 = this.trackRecord;
        Objects.requireNonNull(trackrecord15);
        Long trackid = trackrecord15.getTrackid();
        Trackrecord trackrecord16 = this.trackRecord;
        Objects.requireNonNull(trackrecord16);
        String str = trackid + Constants.ACCEPT_TIME_SEPARATOR_SERVER + trackrecord16.getSource();
        Trackrecord trackrecord17 = this.trackRecord;
        Objects.requireNonNull(trackrecord17);
        int iIntValue = trackrecord17.getDistance().intValue();
        Trackrecord trackrecord18 = this.trackRecord;
        Objects.requireNonNull(trackrecord18);
        eventBus.post(new EventIndoorRunCalibated(str, iIntValue, trackrecord18.getPace().floatValue()));
        Trackrecord trackrecord19 = this.trackRecord;
        Objects.requireNonNull(trackrecord19);
        Integer state3 = trackrecord19.getState();
        int value3 = SyncedState.STATE_SYNC_AGAIN.getValue();
        if (state3 != null && state3.intValue() == value3) {
            kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new r(null), 3, null);
        }
    }

    private static final void d0(ReadWriteProperty<Object, String> readWriteProperty, String str) {
        readWriteProperty.setValue(null, U0[5], str);
    }

    private final void e0(List<HeartRateZone> hrZoneList, ViewGroup.LayoutParams lp) {
        HeartRateCard heartRateCard;
        Context context = this.context;
        Objects.requireNonNull(context);
        HeartRateCard heartRateCard2 = new HeartRateCard(context);
        this.heartRateZoneCard = heartRateCard2;
        heartRateCard2.setLayoutParams(lp);
        HrZoneShowRuleConfig value = m0().getHrZoneRuleConfigLiveData().getValue();
        if (value != null && (heartRateCard = this.heartRateZoneCard) != null) {
            heartRateCard.setContent(hrZoneList, value);
        }
        LinearLayout linearLayout = this.chartLayout;
        Objects.requireNonNull(linearLayout);
        linearLayout.addView(this.heartRateZoneCard);
    }

    private final void f0(Trackrecord trackrecord, ViewGroup.LayoutParams lp) {
        Context context = this.context;
        Objects.requireNonNull(context);
        CardSlopeDistribution cardSlopeDistribution = new CardSlopeDistribution(context);
        cardSlopeDistribution.setLayoutParams(lp);
        cardSlopeDistribution.showCyclingSlopeView(trackrecord);
        LinearLayout linearLayout = this.chartLayout;
        Objects.requireNonNull(linearLayout);
        linearLayout.addView(cardSlopeDistribution);
    }

    private final void g0(BaseDataProvider provider, ViewGroup.LayoutParams lp) {
        Context context = this.context;
        Objects.requireNonNull(context);
        SportDiagramView sportDiagramView = new SportDiagramView(context);
        sportDiagramView.setLayoutParams(lp);
        sportDiagramView.setIdAndType(this.trackId, this.sportType);
        sportDiagramView.refreshUI(provider);
        LinearLayout linearLayout = this.chartLayout;
        Objects.requireNonNull(linearLayout);
        linearLayout.addView(sportDiagramView);
    }

    private final View h0(final Trackrecord record) {
        Context context = this.context;
        Objects.requireNonNull(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.moving_ui_multiple_sport_item_one, (ViewGroup) this.triangleMultiple, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.sport_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.sport_dis_time);
        int iconId = R.drawable.ic_run_30;
        int bgColorId = R.color.p3;
        SportTypeDescription sportTypeDescriptionFindSportTypeDescription = SportTypeDescription.INSTANCE.findSportTypeDescription((SportTypeIdentifier.isChildSportType(record.getType().intValue()) ? Integer.valueOf(record.getType().intValue() - 1000) : record.getType()).intValue(), record.getSource().intValue(), record.getSportMode());
        if (sportTypeDescriptionFindSportTypeDescription != null) {
            iconId = sportTypeDescriptionFindSportTypeDescription.getIconId();
            bgColorId = sportTypeDescriptionFindSportTypeDescription.getBgColorId();
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Context context2 = this.context;
        Objects.requireNonNull(context2);
        Drawable drawable = ContextCompat.getDrawable(context2, iconId);
        Context context3 = this.context;
        Objects.requireNonNull(context3);
        imageView.setImageDrawable(BaseTitleActivity.tintDrawable(drawable, ContextCompat.getColor(context3, bgColorId)));
        Context context4 = this.context;
        Objects.requireNonNull(context4);
        imageView.setBackground(BaseTitleActivity.tintDrawable(ContextCompat.getDrawable(context4, R.drawable.running_shape_sport_bg), Color.parseColor("#F2F2F2")));
        long jIntValue = record.getCosttime().intValue();
        String[] formatDisAndUnit = DataFormatter.getFormatDisAndUnit(record.getDistance().intValue(), record.getType().intValue(), this.isMetric, new boolean[0]);
        int i2 = Integer.parseInt(formatDisAndUnit[1]);
        String str = formatDisAndUnit[0];
        Context context5 = this.context;
        Objects.requireNonNull(context5);
        String str2 = str + context5.getString(i2);
        Context context6 = this.context;
        Objects.requireNonNull(context6);
        String string = context6.getString(R.string.multiple_sport_format);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        textView.setText(String.format(string, Arrays.copyOf(new Object[]{str2, DataFormatter.getConsumeTime(jIntValue)}, 2)));
        final ParsedSportDetailData childBulkDataFromCacheById = TrackDataManager.getInstance().getChildBulkDataFromCacheById(record.getTrackid().longValue(), record.getSource().intValue(), record.getType().intValue());
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: e97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailPageActivity.i0(this.a, record, childBulkDataFromCacheById, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(SportDetailPageActivity sportDetailPageActivity, Trackrecord trackrecord, ParsedSportDetailData parsedSportDetailData, View view) {
        Context context = sportDetailPageActivity.context;
        Objects.requireNonNull(context);
        Intent intent = new Intent(context, (Class<?>) SportDetailPageActivity.class);
        intent.putExtra("START_ACTIVITY_FROM", 2);
        intent.putExtra("trackId", trackrecord.getTrackid().longValue());
        intent.putExtra("deviceSource", sportDetailPageActivity.deviceSource);
        intent.putExtra("sportType", trackrecord.getType().intValue());
        intent.putExtra("oversea", sportDetailPageActivity.isOverSea);
        intent.putExtra("isGaodeMap", sportDetailPageActivity.useAmap);
        intent.putExtra(HAS_TRACK, !parsedSportDetailData.getPointLocationList().isEmpty());
        try {
            Context context2 = sportDetailPageActivity.context;
            if (context2 == null) {
                throw null;
            }
            context2.startActivity(intent);
            Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_RECORD_OUT).setValue(SportAnalytics.Params.VALUE_RECORD_LIST));
        } catch (Exception unused) {
            Context context3 = sportDetailPageActivity.context;
            Objects.requireNonNull(context3);
            CustomToast.makeText(context3, "Error activity", 0).show();
        }
    }

    private final void initView() {
        this.overViewCard = (OverViewCard) findViewById(R.id.overview_card);
        this.cardShareEnd = (LinearLayout) findViewById(R.id.card_share_end);
        this.cardShareFeedback = (LinearLayout) findViewById(R.id.card_share_feedback);
        this.chartLayout = (LinearLayout) findViewById(R.id.moving_ui_chart_layout);
        this.targetCardLayout = (RelativeLayout) findViewById(R.id.target_card_layout);
        this.targetCardView = (RecyclerView) findViewById(R.id.target_card);
        this.triangleMultiple = (LinearLayoutCompat) findViewById(R.id.triangle_multiple);
        this.segmentLayout = (LinearLayout) getDelegate().findViewById(R.id.segment_layout);
        this.rlBack = (RelativeLayout) findViewById(R.id.rl_back);
        this.rlShare = (RelativeLayout) findViewById(R.id.rl_share);
        this.llTitle = (LinearLayout) findViewById(R.id.ll_title);
        this.locationAndSportType = (TextView) findViewById(R.id.location_and_sport_type);
        this.sportFinishLayout = (LinearLayout) findViewById(R.id.sport_detail_finish_layout);
        this.sportFinishButton = (Button) findViewById(R.id.sport_detail_finish_btn);
        this.imagePlay = (ImageView) findViewById(R.id.image_play);
        this.mMileStoneGroup = (RadioGroup) findViewById(R.id.milestone_area);
        this.topLayout = findViewById(R.id.top_layout);
        this.rlTitleBar = (RelativeLayout) findViewById(R.id.rl_title_bar);
        this.mLockableNestedScrollView = (LockableNestedScrollView) findViewById(R.id.bottom_scrollview);
        ImageView imageView = (ImageView) findViewById(R.id.iv_app_logo);
        ImageView imageView2 = (ImageView) findViewById(R.id.share_end_qr_code);
        if (Utils.isMidong()) {
            imageView.setImageResource(R.drawable.app_icon);
            imageView2.setImageResource(R.drawable.sport_details_qr_code);
        } else {
            imageView.setImageResource(R.drawable.app_icon_life_share_end);
            imageView2.setImageResource(R.drawable.sport_details_qr_code_life);
        }
        OverViewCard overViewCard = this.overViewCard;
        Objects.requireNonNull(overViewCard);
        overViewCard.setDistanceListener(this);
        OverViewCard overViewCard2 = this.overViewCard;
        Objects.requireNonNull(overViewCard2);
        overViewCard2.setMoreClickListener(new g());
        OverViewCard overViewCard3 = this.overViewCard;
        Objects.requireNonNull(overViewCard3);
        overViewCard3.setIvFoldClickListener(new h());
        SlidingUpPanelLayout slidingUpPanelLayout = p0().slidingLayout;
        slidingUpPanelLayout.addPanelSlideListener(this);
        slidingUpPanelLayout.setScrollableViewHelper(new LockableNestedScrollView.NestedScrollableViewHelper());
        RelativeLayout relativeLayout = this.rlBack;
        Objects.requireNonNull(relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: c97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailPageActivity.E0(this.a, view);
            }
        });
        LinearLayout linearLayout = this.cardShareFeedback;
        Objects.requireNonNull(linearLayout);
        ((TextView) linearLayout.findViewById(R.id.moving_ui_sport_feedback)).setOnClickListener(new View.OnClickListener() { // from class: a97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailPageActivity.F0(this.a, view);
            }
        });
        RelativeLayout relativeLayout2 = this.rlShare;
        Objects.requireNonNull(relativeLayout2);
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: d97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailPageActivity.G0(this.a, view);
            }
        });
        if (this.navFrom == 1) {
            RelativeLayout relativeLayout3 = this.rlBack;
            Objects.requireNonNull(relativeLayout3);
            relativeLayout3.setVisibility(4);
            LinearLayout linearLayout2 = this.sportFinishLayout;
            Objects.requireNonNull(linearLayout2);
            linearLayout2.setVisibility(0);
        } else {
            LinearLayout linearLayout3 = this.sportFinishLayout;
            Objects.requireNonNull(linearLayout3);
            linearLayout3.setVisibility(8);
        }
        Button button = this.sportFinishButton;
        Objects.requireNonNull(button);
        button.setOnClickListener(new View.OnClickListener() { // from class: v87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailPageActivity.H0(this.a, view);
            }
        });
        setPlayButtonVisibility(I0());
        View view = this.topLayout;
        Objects.requireNonNull(view);
        view.post(new Runnable() { // from class: s87
            @Override // java.lang.Runnable
            public final void run() {
                SportDetailPageActivity.D0(this.a);
            }
        });
        if (this.hasTrackPage) {
            return;
        }
        RelativeLayout relativeLayout4 = this.rlBack;
        Objects.requireNonNull(relativeLayout4);
        relativeLayout4.setBackground(null);
        RelativeLayout relativeLayout5 = this.rlShare;
        Objects.requireNonNull(relativeLayout5);
        relativeLayout5.setBackground(null);
        LinearLayout linearLayout4 = this.llTitle;
        Objects.requireNonNull(linearLayout4);
        linearLayout4.setBackground(null);
        LinearLayout linearLayout5 = this.cardShareFeedback;
        Objects.requireNonNull(linearLayout5);
        ViewGroup.LayoutParams layoutParams = linearLayout5.getLayoutParams();
        layoutParams.height = (int) ViewUtils.dp2px(this, 100.0f);
        LinearLayout linearLayout6 = this.cardShareFeedback;
        Objects.requireNonNull(linearLayout6);
        linearLayout6.setLayoutParams(layoutParams);
    }

    private final void j0(Trackrecord trackrecord, ViewGroup.LayoutParams lp, int showType) {
        Context context = this.context;
        Objects.requireNonNull(context);
        CardTrainingEffect cardTrainingEffect = new CardTrainingEffect(context);
        cardTrainingEffect.setLayoutParams(lp);
        cardTrainingEffect.showView(trackrecord, showType);
        LinearLayout linearLayout = this.chartLayout;
        Objects.requireNonNull(linearLayout);
        linearLayout.addView(cardTrainingEffect);
    }

    private final FeedbackService k0() {
        return (FeedbackService) this.feedbackService.getValue();
    }

    private final int l0() {
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    private final SportDetailPageViewModel m0() {
        return (SportDetailPageViewModel) this.sportDetailPageViewModel.getValue();
    }

    private final SportEndPageBusiness n0() {
        return (SportEndPageBusiness) this.sportEndPageBusiness.getValue();
    }

    private final List<Integer> o0() {
        List<SportSegmentData> trainSegmentDataList;
        ParsedSportDetailData trackData = TrackDataManager.getInstance().getTrackData(this.trackId, this.deviceSource, this.sportType);
        ArrayList arrayList = new ArrayList();
        if (trackData != null) {
            List<SportSegmentData> manualSegmentDataList = trackData.getManualSegmentDataList();
            if (manualSegmentDataList == null || manualSegmentDataList.isEmpty()) {
                List<SportSegmentData> fuseSegmentDataList = trackData.getFuseSegmentDataList();
                if (fuseSegmentDataList == null || fuseSegmentDataList.isEmpty()) {
                    List<SportSegmentData> trainSegmentDataList2 = trackData.getTrainSegmentDataList();
                    trainSegmentDataList = !(trainSegmentDataList2 == null || trainSegmentDataList2.isEmpty()) ? trackData.getTrainSegmentDataList() : new ArrayList<>();
                } else {
                    trainSegmentDataList = trackData.getFuseSegmentDataList();
                }
            } else {
                trainSegmentDataList = trackData.getManualSegmentDataList();
            }
            if (trainSegmentDataList != null) {
                Iterator<SportSegmentData> it2 = trainSegmentDataList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(it2.next().getStrengthTrainType()));
                }
            }
        }
        return arrayList;
    }

    private final void observeData() {
        m0().getChildSportRecordLiveData().observe(this, new Observer() { // from class: q87
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDetailPageActivity.J0(this.a, (Pair) obj);
            }
        });
        m0().getDataInvalidLiveData().observe(this, new Observer() { // from class: n87
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDetailPageActivity.K0(this.a, (String) obj);
            }
        });
        m0().getSportMainData().observe(this, new Observer() { // from class: m87
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDetailPageActivity.L0(this.a, (SportDataDisplayItem) obj);
            }
        });
        m0().getSportParsedAndSportRecordDetailLiveData().observe(this, new Observer() { // from class: r87
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDetailPageActivity.M0(this.a, (Pair) obj);
            }
        });
        m0().getDeviceSourceLiveData().observe(this, new Observer() { // from class: p87
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDetailPageActivity.N0(this.a, (List) obj);
            }
        });
        m0().getSportCardData().observe(this, new Observer() { // from class: o87
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDetailPageActivity.O0(this.a, (List) obj);
            }
        });
        m0().getHrZoneRuleConfigLiveData().observe(this, new Observer() { // from class: l87
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDetailPageActivity.P0(this.a, (HrZoneShowRuleConfig) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivitySportDetailPageBinding p0() {
        return (ActivitySportDetailPageBinding) this.viewBinding.getValue(this, U0[2]);
    }

    private final MovingUiActivitySportDetailPageNoGpsBinding q0() {
        return (MovingUiActivitySportDetailPageNoGpsBinding) this.viewBindingNoGps.getValue(this, U0[3]);
    }

    private final void r0() {
        int i2 = this.sportType;
        if (i2 == 25 || i2 == 26 || this.isOverSea) {
            return;
        }
        Context context = this.context;
        Objects.requireNonNull(context);
        Intent intent = new Intent(context, (Class<?>) SportEndPageActivity.class);
        intent.putExtra("trackId", this.trackId);
        intent.putExtra("deviceSource", this.deviceSource);
        intent.putExtra("sportType", this.realSportType);
        intent.putExtra("isGaodeMap", this.useAmap);
        startActivity(intent);
    }

    private final boolean s0(ParsedSportDetailData parsedSportDetailData) {
        if (this.isMetric) {
            List<KilometreOrMileMarked> kmMarkedList = parsedSportDetailData.getKmMarkedList();
            if (!(kmMarkedList == null || kmMarkedList.isEmpty())) {
                return true;
            }
        }
        if (!this.isMetric) {
            List<KilometreOrMileMarked> mileMarkedList = parsedSportDetailData.getMileMarkedList();
            if (!(mileMarkedList == null || mileMarkedList.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    private final boolean t0(ParsedSportDetailData parsedSportDetailData) {
        List<SportSegmentData> autoSegmentDataList = parsedSportDetailData.getAutoSegmentDataList();
        if (autoSegmentDataList == null || autoSegmentDataList.isEmpty()) {
            List<SportSegmentData> intervalSegmentDataList = parsedSportDetailData.getIntervalSegmentDataList();
            if (intervalSegmentDataList == null || intervalSegmentDataList.isEmpty()) {
                List<SportSegmentData> manualSegmentDataList = parsedSportDetailData.getManualSegmentDataList();
                if (manualSegmentDataList == null || manualSegmentDataList.isEmpty()) {
                    List<SportSegmentData> ropeSkippingSegmentDataList = parsedSportDetailData.getRopeSkippingSegmentDataList();
                    if (ropeSkippingSegmentDataList == null || ropeSkippingSegmentDataList.isEmpty()) {
                        List<SportSegmentData> skiingSegmentDataList = parsedSportDetailData.getSkiingSegmentDataList();
                        if (skiingSegmentDataList == null || skiingSegmentDataList.isEmpty()) {
                            List<SportSegmentData> fuseSegmentDataList = parsedSportDetailData.getFuseSegmentDataList();
                            if (fuseSegmentDataList == null || fuseSegmentDataList.isEmpty()) {
                                List<SportSegmentData> trainSegmentDataList = parsedSportDetailData.getTrainSegmentDataList();
                                if (trainSegmentDataList == null || trainSegmentDataList.isEmpty()) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private final void u0(Trackrecord trackRecord) {
        this.mHalfStartTime = trackRecord.getHalfStartTime();
        if (SportTrackDetailFragment.INSTANCE.isSupportHeatMap(this.sportType)) {
            Context context = this.context;
            Objects.requireNonNull(context);
            SportUIKeeper.putMapMileStoneFlag(100, context);
            if (!this.hasTrackPage || this.mHalfStartTime <= 0) {
                return;
            }
            RadioGroup radioGroup = this.mMileStoneGroup;
            if (radioGroup != null) {
                radioGroup.setVisibility(0);
            }
            v0(this.sportTypes);
        }
    }

    private final void v0(int[] supportType) {
        ReadWriteProperty readWritePropertyNotNull = Delegates.INSTANCE.notNull();
        int length = supportType.length - 1;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                View viewInflate = getLayoutInflater().inflate(R.layout.moving_ui_sport_detail_heatmap_type_text, (ViewGroup) this.mMileStoneGroup, false);
                Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.widget.RadioButton");
                x0(readWritePropertyNotNull, (RadioButton) viewInflate);
                switch (supportType[i2]) {
                    case 100:
                        w0(readWritePropertyNotNull).setText(R.string.whole_game);
                        w0(readWritePropertyNotNull).setOnClickListener(new View.OnClickListener() { // from class: g97
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SportDetailPageActivity.y0(view);
                            }
                        });
                        break;
                    case 101:
                        w0(readWritePropertyNotNull).setText(R.string.first_half);
                        w0(readWritePropertyNotNull).setOnClickListener(new View.OnClickListener() { // from class: f97
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SportDetailPageActivity.z0(view);
                            }
                        });
                        break;
                    case 102:
                        w0(readWritePropertyNotNull).setText(R.string.second_half);
                        w0(readWritePropertyNotNull).setOnClickListener(new View.OnClickListener() { // from class: h97
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SportDetailPageActivity.A0(view);
                            }
                        });
                        break;
                }
                RadioGroup radioGroup = this.mMileStoneGroup;
                if (radioGroup != null) {
                    radioGroup.addView(w0(readWritePropertyNotNull));
                }
                if (i3 <= length) {
                    i2 = i3;
                }
            }
        }
        RadioGroup radioGroup2 = this.mMileStoneGroup;
        View childAt = radioGroup2 == null ? null : radioGroup2.getChildAt(0);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }

    private static final RadioButton w0(ReadWriteProperty<Object, RadioButton> readWriteProperty) {
        return readWriteProperty.getValue(null, U0[6]);
    }

    private static final void x0(ReadWriteProperty<Object, RadioButton> readWriteProperty, RadioButton radioButton) {
        readWriteProperty.setValue(null, U0[6], radioButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(View view) {
        EventBus.getDefault().post(new EventHeatMapRadioButton(100));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(View view) {
        EventBus.getDefault().post(new EventHeatMapRadioButton(101));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.moving.ui.sport.detail.SportSharePreDialog.MutualCallerListener
    public int getDeviceSource() {
        return this.deviceSource;
    }

    @Override // com.huami.moving.ui.sport.detail.share.SportDetailsInterface
    public boolean getHasTrackPage() {
        return this.hasTrackPage;
    }

    @Override // com.huami.moving.ui.sport.detail.SportSharePreDialog.ShareExportListener, com.huami.moving.ui.sport.detail.SportSharePreDialog.ShareVideoTrackListener, com.huami.moving.ui.sport.detail.share.SportDetailsInterface
    /* JADX INFO: renamed from: getSportType, reason: from getter */
    public int getRealSportType() {
        return this.realSportType;
    }

    public final int getStatueBarHeight() {
        Ref.IntRef intRef = new Ref.IntRef();
        Context context = this.context;
        Objects.requireNonNull(context);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            Context context2 = this.context;
            Objects.requireNonNull(context2);
            intRef.element = context2.getResources().getDimensionPixelSize(identifier);
        }
        HMLog.info(this.TAG, new f(intRef));
        return intRef.element;
    }

    @Override // com.huami.moving.ui.sport.detail.SportSharePreDialog.MutualCallerListener
    public long getTrackId() {
        return this.trackId;
    }

    @Override // com.huami.moving.ui.sport.detail.SportSharePreDialog.ShareExportListener, com.huami.moving.ui.sport.detail.SportSharePreDialog.ShareVideoTrackListener
    public boolean isHasTrack() {
        return this.hasTrackPage;
    }

    @Override // com.huami.moving.ui.sport.detail.SportSharePreDialog.AnalyticsEventListener
    public void onAnalyticsClick(@NotNull String eventId) {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().popBackStackImmediate()) {
            U0(this.statusBarDarkText, this.statusBarBgColor);
        } else {
            if (this.navFrom == 1) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.huami.moving.ui.sport.detail.SportSharePreDialog.CaptureScreenListener
    public void onCaptureScreen(@NotNull SportSharePreDialog dialog) {
        LinearLayout linearLayout = this.cardShareFeedback;
        Objects.requireNonNull(linearLayout);
        linearLayout.setVisibility(8);
        ImageView imageView = this.imagePlay;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.cardShareEnd;
        Objects.requireNonNull(linearLayout2);
        linearLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass1(dialog));
        LinearLayout linearLayout3 = this.cardShareEnd;
        Objects.requireNonNull(linearLayout3);
        linearLayout3.setVisibility(0);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Object objM3845constructorimpl;
        super.onCreate(savedInstanceState);
        this.context = this;
        this.trackId = getIntent().getLongExtra("trackId", -1L);
        this.deviceSource = getIntent().getIntExtra("deviceSource", DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue());
        this.sportType = getIntent().getIntExtra("sportType", 1);
        this.hasTrackPage = getIntent().getBooleanExtra(HAS_TRACK, false);
        this.useAmap = getIntent().getBooleanExtra("isGaodeMap", true);
        this.isOverSea = getIntent().getBooleanExtra("oversea", false);
        this.navFrom = getIntent().getIntExtra("START_ACTIVITY_FROM", 0);
        this.isMetric = RunnerData.getRunner().isMetric();
        int i2 = this.sportType;
        this.realSportType = i2;
        if (SportTypeIdentifier.isSubSport(i2)) {
            this.sportType -= 1000;
        }
        if (this.hasTrackPage) {
            setContentView(p0().getRoot());
            B0(this.useAmap);
        } else {
            setContentView(q0().getRoot());
            this.noGps = (ConstraintLayout) findViewById(R.id.no_gps);
        }
        setStyle(BaseTitleActivity.STYLE.NONE);
        initView();
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new l(null), 3, null);
        C0();
        observeData();
        HMLog.info(this.TAG, new m());
        try {
            Result.Companion companion = Result.Companion;
            m0().loadSportParsedDetailAndSportRecordLiveData(this.trackId, this.deviceSource, this.realSportType);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            M();
            thM3848exceptionOrNullimpl.printStackTrace();
            HMLog.warn(this.TAG, thM3848exceptionOrNullimpl, new n(thM3848exceptionOrNullimpl));
            String str = getString(R.string.network_request_fail) + getString(R.string.sport_feedback_to_us);
            Context context = this.context;
            Objects.requireNonNull(context);
            CustomToast.makeText(context, str, 1).show();
            finish();
        }
        EventBus.getDefault().register(this);
        K();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OverlyingHelper.INSTANCE.clearChartsTypeList();
        ScreenShotListenManager screenShotListenManager = this.mScreenShotListenManager;
        if (screenShotListenManager != null) {
            screenShotListenManager.stopListen();
        }
        EventBus.getDefault().unregister(this);
        Bitmap bitmap = this.mapBackgroundBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mapBackgroundBitmap = null;
        }
        Bitmap bitmap2 = this.headBitmap;
        if (bitmap2 != null) {
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.headBitmap = null;
        }
        L();
    }

    public final void onEventMainThread(@NotNull EventSegmentSave saveEvent) {
        List<SportSegmentData> segmentDataList = SportDetailSegmentManager.getInstance().getSegmentDataList();
        ArrayList arrayList = new ArrayList();
        Iterator<SportSegmentData> it2 = segmentDataList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getStrengthTrainType()));
        }
        R0(arrayList);
    }

    @Override // com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener
    public void onPanelSlide(@NotNull View panel, float offsets) {
        float fL0 = ((l0() - panel.getTop()) / l0()) * 2;
        if (fL0 > 1.0f) {
            fL0 = 1.0f;
        }
        if (panel.getTop() > ((double) l0()) * 0.4d) {
            return;
        }
        View view = this.topLayout;
        Objects.requireNonNull(view);
        int i2 = R.color.s38;
        view.setBackgroundColor(ContextCompat.getColor(this, i2));
        View view2 = this.topLayout;
        Objects.requireNonNull(view2);
        view2.getBackground().setAlpha((int) (255 * fL0));
        U0(((double) fL0) > 0.7d, ContextCompat.getColor(this, i2));
    }

    @Override // com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener
    public void onPanelStateChanged(@Nullable View panel, @Nullable SlidingUpPanelLayout.PanelState previousState, @Nullable SlidingUpPanelLayout.PanelState newState) {
        this.mPanelState = newState;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mapScreenShotAvailable = true;
        ScreenShotListenManager screenShotListenManager = this.mScreenShotListenManager;
        if (screenShotListenManager == null) {
            return;
        }
        screenShotListenManager.startListen();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.mapScreenShotAvailable = false;
    }

    @Override // com.huami.moving.ui.sport.detail.SportTrackDetailFragment.TrackActionCallback
    public void onTrackDataLoaded() {
        m0().loadMapBackground(new o());
    }

    @Override // com.huami.moving.sport.ui.view.card.OverViewCard.VerifyDistanceListener
    public void onVerifyDistanceUpdate(double distance) {
        this.isNeedVerifyDistance = true;
        this.inputDistance = distance;
        if (this.navFrom == 2) {
            LinearLayout linearLayout = this.sportFinishLayout;
            Objects.requireNonNull(linearLayout);
            if (linearLayout.getVisibility() == 8) {
                LinearLayout linearLayout2 = this.sportFinishLayout;
                Objects.requireNonNull(linearLayout2);
                linearLayout2.setVisibility(0);
                Button button = this.sportFinishButton;
                Objects.requireNonNull(button);
                button.setText(R.string.save);
            }
        }
    }

    @Override // com.huami.moving.ui.sport.detail.share.SportDetailsInterface
    public void setIsPlayTrack() {
        this.isPlayTrack = true;
    }

    public final void setPlayButtonVisibility(boolean visibility) {
        HMLog.info(this.TAG, new p(visibility));
        if (!visibility) {
            ImageView imageView = this.imagePlay;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.imagePlay;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ImageView imageView3 = this.imagePlay;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: b97
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportDetailPageActivity.T0(this.a, view);
                }
            });
        }
        ImageView imageView4 = this.imagePlay;
        if (imageView4 != null) {
            imageView4.setTag(Boolean.valueOf(visibility));
        }
        ImageView imageView5 = this.imagePlay;
        ViewGroup.LayoutParams layoutParams = imageView5 == null ? null : imageView5.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = getStatueBarHeight() + ((int) ViewUtils.dp2px(this, 12.0f));
        ImageView imageView6 = this.imagePlay;
        if (imageView6 == null) {
            return;
        }
        imageView6.setLayoutParams(layoutParams2);
    }

    public final void setStatusBarTranslate() {
        U0(!this.hasTrackPage, 0);
        View view = this.topLayout;
        Objects.requireNonNull(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = ((int) ViewUtils.dp2px(this, 48.0f)) + getStatueBarHeight();
        View view2 = this.topLayout;
        Objects.requireNonNull(view2);
        view2.setLayoutParams(layoutParams2);
        View view3 = this.topLayout;
        Objects.requireNonNull(view3);
        view3.setPadding(0, getStatueBarHeight(), 0, 0);
    }

    @Override // com.huami.moving.ui.sport.detail.share.SportDetailsInterface
    public void uploadData() {
        if (this.isNeedVerifyDistance) {
            c1((int) this.inputDistance);
        }
        int i2 = this.navFrom;
        if (i2 == 1) {
            EventBus.getDefault().post(new EventCurrSportFinished(this.trackId, 0));
            if (n0().shouldShowEndPage()) {
                r0();
            }
            finish();
            return;
        }
        if (i2 == 2) {
            if (!this.isPlayTrack) {
                Context context = this.context;
                Objects.requireNonNull(context);
                CustomToast.showShort(context, R.string.sport_detail_save_toast);
                this.isPlayTrack = false;
            }
            LinearLayout linearLayout = this.sportFinishLayout;
            Objects.requireNonNull(linearLayout);
            linearLayout.setVisibility(8);
        }
    }
}
