package com.xiaomi.hm.health.thirdbind.googlefit;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.third.googlefit.GoogleFit;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.dataprocess.ActiveItem;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.eventbus.EventHeartRateSync;
import com.xiaomi.hm.health.eventbus.EventPostDataToGoogleFit;
import com.xiaomi.hm.health.eventbus.EventTodaySportAnalysisJobFinished;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper;
import com.xiaomi.hm.health.ui.heartrate.HRDataManager;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001`B\t\b\u0002¢\u0006\u0004\b^\u0010_J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\rH\u0002J5\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2#\b\u0002\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00040\u001aH\u0002J\u001b\u0010 \u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010!J\u001b\u0010#\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010!J\u001b\u0010$\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010!J\u001b\u0010%\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010!J\u001b\u0010&\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010!J5\u0010'\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2#\b\u0002\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00040\u001aH\u0002J5\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2#\b\u0002\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00040\u001aH\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010)2\u0006\u0010\u000e\u001a\u00020\rH\u0002J7\u0010,\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2#\b\u0002\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00040\u001aH\u0002J7\u0010-\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2#\b\u0002\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00040\u001aH\u0002J5\u0010.\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2#\b\u0002\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00040\u001aH\u0002J\u0018\u00101\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00100\u001a\u00020/H\u0002J=\u00104\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u00103\u001a\u0002022#\b\u0002\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00040\u001aH\u0002J\u0018\u00106\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00105\u001a\u000202H\u0002J\u0016\u00109\u001a\u00020\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0012H\u0002J\u0016\u0010:\u001a\u00020)2\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0012H\u0002J \u0010>\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000fH\u0002J\u000e\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?J\u000e\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020BJ\u000e\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020CJ\u0010\u0010A\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010DR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020E8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010L\u001a\u00020E8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010GR\u0016\u0010N\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010'R\u001d\u0010T\u001a\u00020O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010Y\u001a\u00020U8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006a"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/googlefit/GoogleFitSyncHelper;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "", PointCategory.INIT, DTransferConstants.SEARCH_KEY, "", "time", "e0", "z", "", "d0", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "daySportData", "", "msgWhat", "p0", "", "n0", "o0", "r0", "daySportDataList", "m0", "data", "c0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "callback", SOAP.XMLNS, "g0", "(Lcom/xiaomi/hm/health/dataprocess/DaySportData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i0", "h0", "l0", "k0", "j0", LogUtil.I, "E", "Lcom/google/android/gms/fitness/data/DataSet;", "f0", "w", "Q", "M", "Y", "", "hrList", "t0", "", "weightInKg", "U", "weight", "s0", "Lcom/xiaomi/hm/health/databases/model/HeartRate;", "heartRateList", "B", "y", "year", "month", "day", "r", "Lcom/xiaomi/hm/health/eventbus/EventHeartRateSync;", "event", "onEvent", "Lcom/xiaomi/hm/health/eventbus/EventPostDataToGoogleFit;", "Lcom/xiaomi/hm/health/bodyfat/event/EventWeightChanged;", "Lcom/xiaomi/hm/health/eventbus/EventTodaySportAnalysisJobFinished;", "", "a", "Ljava/lang/String;", "TAG", "b", "PREFERENCE_FOR_GOOGLE_FIT_NAME", "c", "GOOGLE_FIT_LAST_SYNC_TIME", GoogleApiAvailabilityLight.a, "SYNC_DELAY", "Landroid/content/Context;", "e", "Lkotlin/Lazy;", "x", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/SharedPreferences;", "f", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/xiaomi/hm/health/thirdbind/googlefit/GoogleFitSyncHelper$SyncHandler;", "g", "Lcom/xiaomi/hm/health/thirdbind/googlefit/GoogleFitSyncHelper$SyncHandler;", "syncHandler", "<init>", "()V", "SyncHandler", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class GoogleFitSyncHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "GoogleFitSyncHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PREFERENCE_FOR_GOOGLE_FIT_NAME = "PREFERENCE_FOR_GOOGLEFIT_NAME";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String GOOGLE_FIT_LAST_SYNC_TIME = "GOOGLEFIT_LAST_SYNC_TIME";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int SYNC_DELAY = 60000;

    @NotNull
    public static final GoogleFitSyncHelper INSTANCE = new GoogleFitSyncHelper();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy context = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy sharedPreferences = LazyKt__LazyJVMKt.lazy(f2.a);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final SyncHandler syncHandler = new SyncHandler();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/googlefit/GoogleFitSyncHelper$SyncHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SyncHandler extends Handler {
        public static final int MSG_SYNC_DATA = 17;
        public static final int MSG_SYNC_DATA_LIST = 18;
        public static final int MSG_SYNC_EARBUDS_DATA = 19;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "真正同步数据（耳机数据）.....MSG_SYNC_EARBUDS_DATA";
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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "真正同步数据（手表数据）.....MSG_SYNC_DATA";
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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "真正同步数据.....MSG_SYNC_DATA_LIST";
            }
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            switch (msg.what) {
                case 17:
                    HMLog.info(GoogleFitSyncHelper.TAG, b.a);
                    Object obj = msg.obj;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type com.xiaomi.hm.health.dataprocess.DaySportData");
                    GoogleFitSyncHelper.INSTANCE.o0((DaySportData) obj);
                    break;
                case 18:
                    HMLog.info(GoogleFitSyncHelper.TAG, c.a);
                    Object obj2 = msg.obj;
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.hm.health.dataprocess.DaySportData>");
                    GoogleFitSyncHelper.INSTANCE.m0((List) obj2);
                    break;
                case 19:
                    HMLog.info(GoogleFitSyncHelper.TAG, a.a);
                    Object obj3 = msg.obj;
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.xiaomi.hm.health.dataprocess.DaySportData");
                    GoogleFitSyncHelper.INSTANCE.r0((DaySportData) obj3);
                    break;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "首页GoogleFit授权失败，未重新授权，取消授权";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a.getSportDay() + " 的距离数据完成";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a1 extends Lambda implements Function0<String> {
        public static final a1 a = new a1();

        public a1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "daySportData的step为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a2 extends Lambda implements Function0<String> {
        public static final a2 a = new a2();

        public a2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "-------------------------------------------------------------------------------------------------------------------";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncEarbudsDataToGoogleFit$1", f = "GoogleFitSyncHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ DaySportData c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncEarbudsDataToGoogleFit$1$1", f = "GoogleFitSyncHelper.kt", i = {0}, l = {GlMapUtil.DEVICE_DISPLAY_DPI_HIGH}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        public static final class a extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$a3$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C1016a extends Lambda implements Function0<String> {
                public final /* synthetic */ DaySportData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1016a(DaySportData daySportData) {
                    super(0);
                    this.a = daySportData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "同步" + this.a.getSportDay() + "的睡眠数据";
                }
            }

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                DaySportData daySportData;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData2 = (DaySportData) this.b;
                    HMLog.info(GoogleFitSyncHelper.TAG, new C1016a(daySportData2));
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.b = daySportData2;
                    this.a = 1;
                    Object objJ0 = googleFitSyncHelper.j0(daySportData2, this);
                    if (objJ0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    daySportData = daySportData2;
                    obj = objJ0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    daySportData = (DaySportData) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    GoogleFitSyncHelper.INSTANCE.e0(daySportData.getTimestamp());
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncEarbudsDataToGoogleFit$1$2", f = "GoogleFitSyncHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function3<FlowCollector<? super DaySportData>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "插入睡眠失败：" + this.a.getMessage();
                }
            }

            public b(Continuation<? super b> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull FlowCollector<? super DaySportData> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
                b bVar = new b(continuation);
                bVar.b = th;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMLog.error$default(GoogleFitSyncHelper.TAG, null, null, new a((Throwable) this.b), 6, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a3(DaySportData daySportData, Continuation<? super a3> continuation) {
            super(2, continuation);
            this.c = daySportData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a3 a3Var = new a3(this.c, continuation);
            a3Var.b = obj;
            return a3Var;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(FlowKt.onEach(FlowKt.flowOf(this.c), new a(null)), new b(null)), Dispatchers.getIO()), (CoroutineScope) this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/content/Context;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Context> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Context getA() {
            return BraceletApp.getContext().getApplicationContext();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(DaySportData daySportData, Exception exc) {
            super(0);
            this.a = daySportData;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a.getSportDay() + " 的距离数据执行异常：" + this.b.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b1 extends Lambda implements Function0<String> {
        public static final b1 a = new b1();

        public b1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "daySportData的activeItem为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b2 extends Lambda implements Function0<String> {
        public static final b2 a = new b2();

        public b2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "收到今天数据同步成功消息， 去进行google fit的同步...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function1<Boolean, Unit> {
        public static final c0 a = new c0();

        public c0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c1 extends Lambda implements Function0<String> {
        public static final c1 a = new c1();

        public c1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "startTime = 0，中断插入活动数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c2 extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c2(Date date) {
            super(0);
            this.a = date;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "上次同步时间 " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "删除 " + this.a.getSportDay() + "的步数，卡路里， 距离，心率数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<String> {
        public static final d0 a = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "获取步数独立数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d1 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ int c;
        public final /* synthetic */ float d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(long j, long j2, int i, float f, int i2) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = i;
            this.d = f;
            this.e = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入活动数据: 开始时间 " + new Date(this.a) + " 结束时间 " + new Date(this.b) + " 步数 " + this.c + " 卡路里 " + this.d + " 距离 " + this.e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d2 extends Lambda implements Function0<String> {
        public static final d2 a = new d2();

        public d2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "请求算法分析...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "删除 " + this.a.getSportDay() + "的步数，卡路里， 距离，心率数据完成";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e0 extends Lambda implements Function0<String> {
        public static final e0 a = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "stepsDataSet 为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e1 extends Lambda implements Function0<String> {
        public static final e1 a = new e1();

        public e1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "开始插入基础活动数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e2 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e2(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "保存同步时间 " + new Date(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DaySportData daySportData, Exception exc) {
            super(0);
            this.a = daySportData;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "删除 " + this.a.getSportDay() + "的数据执行异常：" + this.b.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f0 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "开始插入 " + this.a.getSportDay() + " 的步数数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f1 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "starttime " + this.a + " endtime " + this.b + " " + new Date(this.a) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + new Date(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f2 extends Lambda implements Function0<SharedPreferences> {
        public static final f2 a = new f2();

        public f2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences getA() {
            return GoogleFitSyncHelper.INSTANCE.x().getSharedPreferences(GoogleFitSyncHelper.PREFERENCE_FOR_GOOGLE_FIT_NAME, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "独立数据为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g0 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a.getSportDay() + " 的步数数据完成";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g1 extends Lambda implements Function1<Boolean, Unit> {
        public static final g1 a = new g1();

        public g1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g2 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g2(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "insertFitnessSteps .... " + this.a.getSportDay();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "stageStepList size is 0";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h0 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(DaySportData daySportData, Exception exc) {
            super(0);
            this.a = daySportData;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a.getSportDay() + " 的步数数据执行异常：" + this.b.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h1 extends Lambda implements Function0<String> {
        public static final h1 a = new h1();

        public h1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "weightDataSet 为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h2 extends Lambda implements Function0<String> {
        public static final h2 a = new h2();

        public h2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "stepsInfo is null";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fullActiveItems is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i0 extends Lambda implements Function1<Boolean, Unit> {
        public static final i0 a = new i0();

        public i0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i1 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "开始插入 " + this.a + " 的体重数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i2 extends Lambda implements Function0<String> {
        public static final i2 a = new i2();

        public i2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "独立数据为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ActiveItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(List<? extends ActiveItem> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fullActiveItem size " + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j0 extends Lambda implements Function0<String> {
        public static final j0 a = new j0();

        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "睡眠数据不存在";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j1 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a + " 的体重数据完成";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j2 extends Lambda implements Function0<String> {
        public static final j2 a = new j2();

        public j2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fullActiveItems is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ ActiveItem c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j, long j2, ActiveItem activeItem) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = activeItem;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "独立数据: 开始时间 " + new Date(this.a) + " 结束时间 " + new Date(this.b) + " 距离 " + this.c.distance;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k0 extends Lambda implements Function0<String> {
        public static final k0 a = new k0();

        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "睡眠数据为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k1 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(String str, Exception exc) {
            super(0);
            this.a = str;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a + " 的体重数据执行异常：" + this.b.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k2 extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ActiveItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k2(List<? extends ActiveItem> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fullActiveItem size " + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ ActiveItem a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ActiveItem activeItem) {
            super(0);
            this.a = activeItem;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "contain... " + this.a.steps;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l0 extends Lambda implements Function0<String> {
        public static final l0 a = new l0();

        public l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "date格式化为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l1 extends Lambda implements Function0<String> {
        public static final l1 a = new l1();

        public l1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "google api client not auth yet";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l2 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ Ref.LongRef b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l2(long j, Ref.LongRef longRef, int i) {
            super(0);
            this.a = j;
            this.b = longRef;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "独立数据: 开始时间 " + new Date(this.a) + " 结束时间 " + new Date(this.b.element) + " 步数 " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "初始化 ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(long j, long j2, int i) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "准备睡眠数据 :  开始时间 " + new Date(this.a) + " 结束时间 " + new Date(this.b) + " 睡眠模式 " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m1 extends Lambda implements Function1<Boolean, Unit> {
        public static final m1 a = new m1();

        public m1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m2 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ Continuation<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m2(Ref.BooleanRef booleanRef, Continuation<? super Boolean> continuation) {
            super(1);
            this.a = booleanRef;
            this.b = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (this.a.element) {
                return;
            }
            Continuation<Boolean> continuation = this.b;
            Boolean boolValueOf = Boolean.valueOf(z);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(boolValueOf));
            this.a.element = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "GoogleService状态：ConnectionResult = " + GoogleFitSyncHelperKt.getConnectionResultDesc(this.a) + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n0 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "开始插入 " + this.a.getSportDay() + " 的睡眠数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n1 extends Lambda implements Function0<String> {
        public static final n1 a = new n1();

        public n1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device not support hr detective";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n2 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ Continuation<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n2(Ref.BooleanRef booleanRef, Continuation<? super Boolean> continuation) {
            super(1);
            this.a = booleanRef;
            this.b = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (this.a.element) {
                return;
            }
            Continuation<Boolean> continuation = this.b;
            Boolean boolValueOf = Boolean.valueOf(z);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(boolValueOf));
            this.a.element = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<Integer, Unit> {
        public static final o a = new o();

        public o() {
            super(1);
        }

        public final void a(int i) {
            GoogleFitSyncHelper.INSTANCE.q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o0 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a.getSportDay() + " 睡眠数据完成";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o1 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "开始插入 " + this.a.getSportDay() + " 的心率数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o2 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ Continuation<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o2(Ref.BooleanRef booleanRef, Continuation<? super Boolean> continuation) {
            super(1);
            this.a = booleanRef;
            this.b = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (this.a.element) {
                return;
            }
            Continuation<Boolean> continuation = this.b;
            Boolean boolValueOf = Boolean.valueOf(z);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(boolValueOf));
            this.a.element = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<Integer, Unit> {
        public static final p a = new p();

        public p() {
            super(1);
        }

        public final void a(int i) {
            GoogleFitSyncHelper.INSTANCE.q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p0 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(DaySportData daySportData, Exception exc) {
            super(0);
            this.a = daySportData;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a.getSportDay() + " 的睡眠数据执行异常：" + this.b.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p1 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p1(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a.getSportDay() + " 的心率数据完成";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p2 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ Continuation<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p2(Ref.BooleanRef booleanRef, Continuation<? super Boolean> continuation) {
            super(1);
            this.a = booleanRef;
            this.b = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (this.a.element) {
                return;
            }
            Continuation<Boolean> continuation = this.b;
            Boolean boolValueOf = Boolean.valueOf(z);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(boolValueOf));
            this.a.element = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入心率数据 ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q0 extends Lambda implements Function0<String> {
        public static final q0 a = new q0();

        public q0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "深睡眠";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q1 extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q1(DaySportData daySportData, Exception exc) {
            super(0);
            this.a = daySportData;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入 " + this.a.getSportDay() + " 的心率数据执行异常：" + this.b.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q2 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ Continuation<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q2(Ref.BooleanRef booleanRef, Continuation<? super Boolean> continuation) {
            super(1);
            this.a = booleanRef;
            this.b = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (this.a.element) {
                return;
            }
            Continuation<Boolean> continuation = this.b;
            Boolean boolValueOf = Boolean.valueOf(z);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(boolValueOf));
            this.a.element = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "heartRateDataSet 为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r0 extends Lambda implements Function0<String> {
        public static final r0 a = new r0();

        public r0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "浅睡眠";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r1 extends Lambda implements Function0<String> {
        public static final r1 a = new r1();

        public r1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Google Account处于未登录状态";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r2 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ Continuation<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r2(Ref.BooleanRef booleanRef, Continuation<? super Boolean> continuation) {
            super(1);
            this.a = booleanRef;
            this.b = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (this.a.element) {
                return;
            }
            Continuation<Boolean> continuation = this.b;
            Boolean boolValueOf = Boolean.valueOf(z);
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(boolValueOf));
            this.a.element = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public static final s a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Inserting the dataset in the History API";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s0 extends Lambda implements Function0<String> {
        public static final s0 a = new s0();

        public s0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "清醒";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s1 extends Lambda implements Function0<String> {
        public static final s1 a = new s1();

        public s1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Google Fit处于未授权状态";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s2 extends Lambda implements Function0<String> {
        public static final s2 a = new s2();

        public s2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "同步数据到GoogleFit ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public static final t a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入心率数据完成";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t0 extends Lambda implements Function0<String> {
        public static final t0 a = new t0();

        public t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "REM";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t1 extends Lambda implements Function0<String> {
        public static final t1 a = new t1();

        public t1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "不需要分析今天的数据 ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t2 extends Lambda implements Function0<String> {
        public static final t2 a = new t2();

        public t2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "没有数据变化";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入心率数据执行异常：" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u0 extends Lambda implements Function0<String> {
        public static final u0 a = new u0();

        public u0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "手动编辑";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u1 extends Lambda implements Function0<String> {
        public static final u1 a = new u1();

        public u1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "传入今天的数据 ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u2 extends Lambda implements Function0<String> {
        public static final u2 a = new u2();

        public u2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getLastSyncTime " + GoogleFitSyncHelper.INSTANCE.z();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public static final v a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "google api client not auth yet";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v0 extends Lambda implements Function0<String> {
        public static final v0 a = new v0();

        public v0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "手动编辑";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v1 extends Lambda implements Function0<String> {
        public static final v1 a = new v1();

        public v1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "received EventHeartRateSync";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataListToGoogleFit$4", f = "GoogleFitSyncHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class v2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ List<DaySportData> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "data", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataListToGoogleFit$4$1", f = "GoogleFitSyncHelper.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$v2$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C1017a extends Lambda implements Function0<String> {
                public final /* synthetic */ DaySportData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1017a(DaySportData daySportData) {
                    super(0);
                    this.a = daySportData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "sport day " + this.a.getSportDay().year + " " + (this.a.getSportDay().mon + 1) + " " + this.a.getSportDay().day;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ DaySportData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(DaySportData daySportData) {
                    super(0);
                    this.a = daySportData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "删除并上传" + this.a.getSportDay() + "的数据";
                }
            }

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    HMLog.info(GoogleFitSyncHelper.TAG, new C1017a(daySportData));
                    HMLog.info(GoogleFitSyncHelper.TAG, new b(daySportData));
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    if (!googleFitSyncHelper.c0(daySportData)) {
                        this.a = 1;
                        if (googleFitSyncHelper.g0(daySportData, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataListToGoogleFit$4$2", f = "GoogleFitSyncHelper.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            public b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(continuation);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.a = 1;
                    if (googleFitSyncHelper.i0(daySportData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataListToGoogleFit$4$3", f = "GoogleFitSyncHelper.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            public c(Continuation<? super c> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                c cVar = new c(continuation);
                cVar.b = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.a = 1;
                    if (googleFitSyncHelper.h0(daySportData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataListToGoogleFit$4$4", f = "GoogleFitSyncHelper.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            public d(Continuation<? super d> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((d) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                d dVar = new d(continuation);
                dVar.b = obj;
                return dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.a = 1;
                    if (googleFitSyncHelper.l0(daySportData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataListToGoogleFit$4$5", f = "GoogleFitSyncHelper.kt", i = {}, l = {360}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ DaySportData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(DaySportData daySportData) {
                    super(0);
                    this.a = daySportData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "同步" + this.a.getSportDay() + "的步数数据";
                }
            }

            public e(Continuation<? super e> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((e) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                e eVar = new e(continuation);
                eVar.b = obj;
                return eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    HMLog.info(GoogleFitSyncHelper.TAG, new a(daySportData));
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.a = 1;
                    if (googleFitSyncHelper.k0(daySportData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataListToGoogleFit$4$6", f = "GoogleFitSyncHelper.kt", i = {0}, l = {364}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        public static final class f extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ DaySportData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(DaySportData daySportData) {
                    super(0);
                    this.a = daySportData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "同步" + this.a.getSportDay() + "的睡眠数据";
                }
            }

            public f(Continuation<? super f> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((f) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                f fVar = new f(continuation);
                fVar.b = obj;
                return fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                DaySportData daySportData;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData2 = (DaySportData) this.b;
                    HMLog.info(GoogleFitSyncHelper.TAG, new a(daySportData2));
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.b = daySportData2;
                    this.a = 1;
                    Object objJ0 = googleFitSyncHelper.j0(daySportData2, this);
                    if (objJ0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    daySportData = daySportData2;
                    obj = objJ0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    daySportData = (DaySportData) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    GoogleFitSyncHelper.INSTANCE.e0(daySportData.getTimestamp());
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataListToGoogleFit$4$7", f = "GoogleFitSyncHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class g extends SuspendLambda implements Function3<FlowCollector<? super DaySportData>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "插入一天的全部信息失败：" + this.a.getMessage();
                }
            }

            public g(Continuation<? super g> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull FlowCollector<? super DaySportData> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
                g gVar = new g(continuation);
                gVar.b = th;
                return gVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMLog.error$default(GoogleFitSyncHelper.TAG, null, null, new a((Throwable) this.b), 6, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public v2(List<? extends DaySportData> list, Continuation<? super v2> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            v2 v2Var = new v2(this.c, continuation);
            v2Var.b = obj;
            return v2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((v2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(FlowKt.onEach(FlowKt.onEach(FlowKt.onEach(FlowKt.onEach(FlowKt.onEach(FlowKt.onEach(FlowKt.asFlow(this.c), new a(null)), new b(null)), new c(null)), new d(null)), new e(null)), new f(null)), new g(null)), Dispatchers.getIO()), (CoroutineScope) this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function1<Boolean, Unit> {
        public static final w a = new w();

        public w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w0 extends Lambda implements Function0<String> {
        public static final w0 a = new w0();

        public w0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入基础活动数据完成";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w1 extends Lambda implements Function0<String> {
        public static final w1 a = new w1();

        public w1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "heart rate list is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w2 extends Lambda implements Function0<String> {
        public static final w2 a = new w2();

        public w2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "传入今天的数据 ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public static final x a = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "获取距离独立数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "插入基础活动数据执行异常：" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x1 extends Lambda implements Function0<String> {
        public static final x1 a = new x1();

        public x1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "收到EventPostDataToGoogleFit消息 ....";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x2 extends Lambda implements Function0<String> {
        public static final x2 a = new x2();

        public x2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "同步数据...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public static final y a = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "distanceDataSet 为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y0 extends Lambda implements Function1<Boolean, Unit> {
        public static final y0 a = new y0();

        public y0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y1 extends Lambda implements Function0<String> {
        public static final y1 a = new y1();

        public y1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "收到EventWeightChanged消息 ....";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataToGoogleFit$1", f = "GoogleFitSyncHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class y2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ DaySportData c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataToGoogleFit$1$1", f = "GoogleFitSyncHelper.kt", i = {}, l = {ConstantKt.DRAW_END_INDEX}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$y2$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C1018a extends Lambda implements Function0<String> {
                public final /* synthetic */ DaySportData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1018a(DaySportData daySportData) {
                    super(0);
                    this.a = daySportData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "sport day " + this.a.getSportDay().year + " " + (this.a.getSportDay().mon + 1) + " " + this.a.getSportDay().day;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ DaySportData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(DaySportData daySportData) {
                    super(0);
                    this.a = daySportData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "删除并上传" + this.a.getSportDay() + "的数据";
                }
            }

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    HMLog.info(GoogleFitSyncHelper.TAG, new C1018a(daySportData));
                    HMLog.info(GoogleFitSyncHelper.TAG, new b(daySportData));
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.a = 1;
                    if (googleFitSyncHelper.g0(daySportData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataToGoogleFit$1$2", f = "GoogleFitSyncHelper.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            public b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(continuation);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.a = 1;
                    if (googleFitSyncHelper.i0(daySportData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataToGoogleFit$1$3", f = "GoogleFitSyncHelper.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            public c(Continuation<? super c> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                c cVar = new c(continuation);
                cVar.b = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.a = 1;
                    if (googleFitSyncHelper.h0(daySportData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataToGoogleFit$1$4", f = "GoogleFitSyncHelper.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            public d(Continuation<? super d> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((d) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                d dVar = new d(continuation);
                dVar.b = obj;
                return dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.a = 1;
                    if (googleFitSyncHelper.l0(daySportData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataToGoogleFit$1$5", f = "GoogleFitSyncHelper.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ DaySportData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(DaySportData daySportData) {
                    super(0);
                    this.a = daySportData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "同步" + this.a.getSportDay() + "的步数数据";
                }
            }

            public e(Continuation<? super e> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((e) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                e eVar = new e(continuation);
                eVar.b = obj;
                return eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData = (DaySportData) this.b;
                    HMLog.info(GoogleFitSyncHelper.TAG, new a(daySportData));
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.a = 1;
                    if (googleFitSyncHelper.k0(daySportData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataToGoogleFit$1$6", f = "GoogleFitSyncHelper.kt", i = {0}, l = {298}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        public static final class f extends SuspendLambda implements Function2<DaySportData, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ DaySportData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(DaySportData daySportData) {
                    super(0);
                    this.a = daySportData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "同步" + this.a.getSportDay() + "的睡眠数据";
                }
            }

            public f(Continuation<? super f> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull DaySportData daySportData, @Nullable Continuation<? super Unit> continuation) {
                return ((f) create(daySportData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                f fVar = new f(continuation);
                fVar.b = obj;
                return fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                DaySportData daySportData;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DaySportData daySportData2 = (DaySportData) this.b;
                    HMLog.info(GoogleFitSyncHelper.TAG, new a(daySportData2));
                    GoogleFitSyncHelper googleFitSyncHelper = GoogleFitSyncHelper.INSTANCE;
                    this.b = daySportData2;
                    this.a = 1;
                    Object objJ0 = googleFitSyncHelper.j0(daySportData2, this);
                    if (objJ0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    daySportData = daySportData2;
                    obj = objJ0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    daySportData = (DaySportData) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    GoogleFitSyncHelper.INSTANCE.e0(daySportData.getTimestamp());
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper$syncDataToGoogleFit$1$7", f = "GoogleFitSyncHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class g extends SuspendLambda implements Function3<FlowCollector<? super DaySportData>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "插入一天的全部信息失败：" + this.a.getMessage();
                }
            }

            public g(Continuation<? super g> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull FlowCollector<? super DaySportData> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
                g gVar = new g(continuation);
                gVar.b = th;
                return gVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMLog.error$default(GoogleFitSyncHelper.TAG, null, null, new a((Throwable) this.b), 6, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y2(DaySportData daySportData, Continuation<? super y2> continuation) {
            super(2, continuation);
            this.c = daySportData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            y2 y2Var = new y2(this.c, continuation);
            y2Var.b = obj;
            return y2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((y2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(FlowKt.onEach(FlowKt.onEach(FlowKt.onEach(FlowKt.onEach(FlowKt.onEach(FlowKt.onEach(FlowKt.flowOf(this.c), new a(null)), new b(null)), new c(null)), new d(null)), new e(null)), new f(null)), new g(null)), Dispatchers.getIO()), (CoroutineScope) this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<String> {
        public final /* synthetic */ DaySportData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(DaySportData daySportData) {
            super(0);
            this.a = daySportData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "开始插入 " + this.a.getSportDay() + " 的距离数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z0 extends Lambda implements Function0<String> {
        public static final z0 a = new z0();

        public z0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "daySportData的data为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z1 extends Lambda implements Function0<String> {
        public final /* synthetic */ WeightInfos a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z1(WeightInfos weightInfos) {
            super(0);
            this.a = weightInfos;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "体重信息 " + new Date(this.a.getTimestamp().longValue()) + " " + this.a.getWeight();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z2 extends Lambda implements Function0<String> {
        public static final z2 a = new z2();

        public z2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "同步数据...";
        }
    }

    private GoogleFitSyncHelper() {
    }

    private final SharedPreferences A() {
        return (SharedPreferences) sharedPreferences.getValue();
    }

    private final void B(List<? extends HeartRate> heartRateList) {
        HMLog.debug(TAG, q.a);
        if (!d0()) {
            HMLog.info(TAG, v.a);
            return;
        }
        DataSet dataSetY = y(heartRateList);
        if (dataSetY.isEmpty()) {
            HMLog.info(TAG, r.a);
        } else {
            HMLog.info(TAG, s.a);
            Fitness.getHistoryClient(x(), GoogleFit.getFitnessGoogleAccount(x())).insertData(dataSetY).addOnSuccessListener(new OnSuccessListener() { // from class: sg2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    GoogleFitSyncHelper.C((Void) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: zg2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    GoogleFitSyncHelper.D(exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Void r3) {
        HMLog.info(TAG, t.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(Exception exc) {
        HMLog.error$default(TAG, null, null, new u(exc), 6, null);
    }

    private final void E(final DaySportData daySportData, final Function1<? super Boolean, Unit> callback) {
        HMLog.info(TAG, x.a);
        DataSet dataSetW = w(daySportData);
        if (dataSetW == null || dataSetW.isEmpty()) {
            HMLog.info(TAG, y.a);
            callback.invoke(Boolean.FALSE);
        } else {
            HMLog.info(TAG, new z(daySportData));
            Fitness.getHistoryClient(x(), GoogleFit.getFitnessGoogleAccount(x())).insertData(dataSetW).addOnSuccessListener(new OnSuccessListener() { // from class: pg2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    GoogleFitSyncHelper.G(callback, daySportData, (Void) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: wg2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    GoogleFitSyncHelper.H(callback, daySportData, exc);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void F(GoogleFitSyncHelper googleFitSyncHelper, DaySportData daySportData, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function1 = w.a;
        }
        googleFitSyncHelper.E(daySportData, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Function1 function1, DaySportData daySportData, Void r3) {
        HMLog.info(TAG, new a0(daySportData));
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Function1 function1, DaySportData daySportData, Exception exc) {
        HMLog.error$default(TAG, null, null, new b0(daySportData, exc), 6, null);
        function1.invoke(Boolean.FALSE);
    }

    private final void I(final DaySportData daySportData, final Function1<? super Boolean, Unit> callback) {
        HMLog.info(TAG, d0.a);
        DataSet dataSetF0 = f0(daySportData);
        if (dataSetF0 == null || dataSetF0.isEmpty()) {
            HMLog.info(TAG, e0.a);
            callback.invoke(Boolean.FALSE);
        } else {
            HMLog.info(TAG, new f0(daySportData));
            Fitness.getHistoryClient(x(), GoogleFit.getFitnessGoogleAccount(x())).insertData(dataSetF0).addOnSuccessListener(new OnSuccessListener() { // from class: qg2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    GoogleFitSyncHelper.K(callback, daySportData, (Void) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: tg2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    GoogleFitSyncHelper.L(callback, daySportData, exc);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void J(GoogleFitSyncHelper googleFitSyncHelper, DaySportData daySportData, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function1 = c0.a;
        }
        googleFitSyncHelper.I(daySportData, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Function1 function1, DaySportData daySportData, Void r3) {
        HMLog.info(TAG, new g0(daySportData));
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(Function1 function1, DaySportData daySportData, Exception exc) {
        HMLog.error$default(TAG, null, null, new h0(daySportData, exc), 6, null);
        function1.invoke(Boolean.FALSE);
    }

    private final void M(final DaySportData daySportData, final Function1<? super Boolean, Unit> callback) {
        Object objM3845constructorimpl;
        long j3;
        long j4;
        SleepInfo sleepInfo;
        int i3;
        int i4;
        long j5;
        int i5;
        if (daySportData == null || daySportData.getSleepInfo() == null) {
            callback.invoke(Boolean.FALSE);
            HMLog.info(TAG, j0.a);
            return;
        }
        SleepInfo sleepInfo2 = daySportData.getSleepInfo();
        ArrayList<StageSleep> stageSleep = sleepInfo2.getStageSleep();
        if (stageSleep.isEmpty()) {
            HMLog.info(TAG, k0.a);
            callback.invoke(Boolean.FALSE);
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault());
        int i6 = daySportData.getSportDay().year;
        int i7 = daySportData.getSportDay().mon + 1;
        int i8 = daySportData.getSportDay().day;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(simpleDateFormat.parse(i6 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i7 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i8 + " 00:00:00"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Date date = (Date) objM3845constructorimpl;
        if (date == null) {
            HMLog.error$default(TAG, null, null, l0.a, 6, null);
            callback.invoke(Boolean.FALSE);
            return;
        }
        long time = date.getTime();
        int i9 = 0;
        DataSource dataSourceBuild = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_SLEEP_SEGMENT).setStreamName("GoogleFitSyncHelper- sleep segments").setType(0).build();
        DataSet.Builder builder = DataSet.builder(dataSourceBuild);
        int size = stageSleep.size() - 1;
        long j6 = 0;
        if (size >= 0) {
            long j7 = 0;
            while (true) {
                int i10 = i9 + 1;
                j4 = j6;
                StageSleep stageSleep2 = stageSleep.get(i9);
                int i11 = stageSleep2.mode;
                long j8 = j7;
                int i12 = stageSleep2.start;
                if (i9 != 0) {
                    i12--;
                }
                if (sleepInfo2.isUsrEditSlpEnd()) {
                    sleepInfo = sleepInfo2;
                    if (i9 != stageSleep.size() - 1 || i11 == 9) {
                        i4 = stageSleep2.stop;
                    } else {
                        i3 = stageSleep2.stop;
                        i4 = i3 + 1;
                    }
                } else {
                    sleepInfo = sleepInfo2;
                    if (i9 != stageSleep.size() - 1) {
                        i4 = stageSleep2.stop;
                    } else {
                        i3 = stageSleep2.stop;
                        i4 = i3 + 1;
                    }
                }
                long j9 = time + ((long) ((i12 + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN) * 60 * 1000));
                long j10 = time + ((long) ((i4 + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN) * 60 * 1000));
                if (i9 == 0) {
                    j4 = j9;
                }
                j5 = i9 == stageSleep.size() - 1 ? j10 : j8;
                HMLog.info(TAG, new m0(j9, j10, i11));
                if (j9 < j10) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            HMLog.info(TAG, q0.a);
                            i5 = 5;
                        } else if (i11 == 7) {
                            HMLog.info(TAG, s0.a);
                            i5 = 1;
                        } else if (i11 == 8) {
                            HMLog.info(TAG, t0.a);
                            i5 = 6;
                        } else if (i11 != 9) {
                            HMLog.info(TAG, v0.a);
                        } else {
                            HMLog.info(TAG, u0.a);
                        }
                        builder.add(DataPoint.builder(dataSourceBuild).setTimeInterval(j9, j10, TimeUnit.MILLISECONDS).setField(Field.FIELD_SLEEP_SEGMENT_TYPE, i5).build());
                    } else {
                        HMLog.info(TAG, r0.a);
                    }
                    i5 = 4;
                    builder.add(DataPoint.builder(dataSourceBuild).setTimeInterval(j9, j10, TimeUnit.MILLISECONDS).setField(Field.FIELD_SLEEP_SEGMENT_TYPE, i5).build());
                }
                if (i10 > size) {
                    break;
                }
                i9 = i10;
                j7 = j5;
                j6 = j4;
                sleepInfo2 = sleepInfo;
            }
            j3 = j5;
            j6 = j4;
        } else {
            j3 = 0;
        }
        Session.Builder activity = new Session.Builder().setName("Sleep").setActivity("sleep");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        SessionInsertRequest sessionInsertRequestBuild = new SessionInsertRequest.Builder().setSession(activity.setStartTime(j6, timeUnit).setEndTime(j3, timeUnit).build()).addDataSet(builder.build()).build();
        HMLog.info(TAG, new n0(daySportData));
        Fitness.getSessionsClient(x(), GoogleFit.getFitnessGoogleAccount(x())).insertSession(sessionInsertRequestBuild).addOnSuccessListener(new OnSuccessListener() { // from class: og2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                GoogleFitSyncHelper.O(callback, daySportData, (Void) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: xg2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                GoogleFitSyncHelper.P(callback, daySportData, exc);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void N(GoogleFitSyncHelper googleFitSyncHelper, DaySportData daySportData, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function1 = i0.a;
        }
        googleFitSyncHelper.M(daySportData, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Function1 function1, DaySportData daySportData, Void r3) {
        HMLog.info(TAG, new o0(daySportData));
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(Function1 function1, DaySportData daySportData, Exception exc) {
        HMLog.error$default(TAG, null, null, new p0(daySportData, exc), 6, null);
        function1.invoke(Boolean.FALSE);
    }

    private final void Q(DaySportData daySportData, Function1<? super Boolean, Unit> callback) {
        long time;
        String string;
        String str;
        final Function1<? super Boolean, Unit> function1;
        if (daySportData == null) {
            HMLog.info(TAG, z0.a);
            callback.invoke(Boolean.FALSE);
            return;
        }
        StepsInfo stepsInfo = daySportData.getStepsInfo();
        if (stepsInfo == null) {
            HMLog.info(TAG, a1.a);
            callback.invoke(Boolean.FALSE);
            return;
        }
        ArrayList<ActiveItem> activeList = stepsInfo.getActiveList();
        if (activeList == null || activeList.isEmpty()) {
            HMLog.info(TAG, b1.a);
            callback.invoke(Boolean.FALSE);
            return;
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault()).parse(daySportData.getSportDay().year + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (daySportData.getSportDay().mon + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + daySportData.getSportDay().day + " 00:00:00");
            time = date == null ? 0L : date.getTime();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (time == 0) {
            HMLog.info(TAG, c1.a);
            return;
        }
        int size = activeList.size() - 1;
        if (size < 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            DataSource dataSourceBuild = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_ACTIVITY_SEGMENT).setStreamName("GoogleFitSyncHelper- steps segments" + i4).setType(i3).build();
            DataSet.Builder builder = DataSet.builder(dataSourceBuild);
            DataSource dataSourceBuild2 = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_STEP_COUNT_DELTA).setStreamName("GoogleFitSyncHelper- steps" + i4).setType(i3).build();
            DataSet.Builder builder2 = DataSet.builder(dataSourceBuild2);
            DataSource dataSourceBuild3 = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_DISTANCE_DELTA).setStreamName("GoogleFitSyncHelper- distance" + i4).setType(i3).build();
            DataSet.Builder builder3 = DataSet.builder(dataSourceBuild3);
            DataSource.Builder dataType = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_CALORIES_EXPENDED);
            StringBuilder sb = new StringBuilder();
            size = size;
            sb.append("GoogleFitSyncHelper- calories");
            sb.append(i4);
            DataSource dataSourceBuild4 = dataType.setStreamName(sb.toString()).setType(0).build();
            DataSet.Builder builder4 = DataSet.builder(dataSourceBuild4);
            ActiveItem activeItem = activeList.get(i4);
            long j3 = ((long) (activeItem.start * 60 * 1000)) + time;
            long j4 = ((long) (activeItem.stop * 60 * 1000)) + time;
            int i6 = activeItem.steps;
            ArrayList<ActiveItem> arrayList = activeList;
            float f3 = activeItem.calories;
            long j5 = time;
            int i7 = activeItem.distance;
            HMLog.info(TAG, new d1(j3, j4, i6, f3, i7));
            if (j3 >= j4) {
                function1 = callback;
                i4 = i5;
            } else {
                int i8 = activeItem.mode;
                if (i8 == 1 || i8 == 2 || i8 == 3) {
                    string = "Walk";
                    str = "walking";
                } else if (i8 != 4) {
                    string = x().getString(R.string.select_area_other_str);
                    str = "other";
                } else {
                    string = "Run";
                    str = "running";
                }
                DataPoint.Builder builder5 = DataPoint.builder(dataSourceBuild);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                builder.add(builder5.setTimeInterval(j3, j4, timeUnit).setActivityField(Field.FIELD_ACTIVITY, str).build());
                builder2.add(DataPoint.builder(dataSourceBuild2).setTimeInterval(j3, j4, timeUnit).setField(Field.FIELD_STEPS, i6).build());
                builder3.add(DataPoint.builder(dataSourceBuild3).setTimeInterval(j3, j4, timeUnit).setField(Field.FIELD_DISTANCE, i7).build());
                builder4.add(DataPoint.builder(dataSourceBuild4).setTimeInterval(j3, j4, timeUnit).setField(Field.FIELD_CALORIES, f3).build());
                HMLog.info(TAG, e1.a);
                HMLog.debug(TAG, new f1(j3, j4));
                function1 = callback;
                Fitness.getSessionsClient(x(), GoogleFit.getFitnessGoogleAccount(x())).insertSession(new SessionInsertRequest.Builder().setSession(new Session.Builder().setName(string).setActivity(str).setStartTime(j3, timeUnit).setEndTime(j4, timeUnit).build()).addDataSet(builder.build()).addDataSet(builder2.build()).addDataSet(builder3.build()).addDataSet(builder4.build()).build()).addOnSuccessListener(new OnSuccessListener() { // from class: ah2
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        GoogleFitSyncHelper.S(function1, (Void) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: mg2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        GoogleFitSyncHelper.T(function1, exc);
                    }
                });
                i4 = i5;
            }
            if (i4 > size) {
                return;
            }
            activeList = arrayList;
            time = j5;
            i3 = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void R(GoogleFitSyncHelper googleFitSyncHelper, DaySportData daySportData, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function1 = y0.a;
        }
        googleFitSyncHelper.Q(daySportData, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Function1 function1, Void r3) {
        HMLog.info(TAG, w0.a);
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Function1 function1, Exception exc) {
        HMLog.error$default(TAG, null, null, new x0(exc), 6, null);
        function1.invoke(Boolean.FALSE);
    }

    private final void U(long time, float weightInKg, final Function1<? super Boolean, Unit> callback) {
        if (!d0()) {
            HMLog.info(TAG, l1.a);
            callback.invoke(Boolean.FALSE);
            return;
        }
        DataSet dataSetS0 = s0(time, weightInKg);
        if (dataSetS0.isEmpty()) {
            HMLog.info(TAG, h1.a);
            callback.invoke(Boolean.FALSE);
        } else {
            final String date = TimeUtil.formatDate(time);
            HMLog.info(TAG, new i1(date));
            Fitness.getHistoryClient(x(), GoogleFit.getFitnessGoogleAccount(x())).insertData(dataSetS0).addOnSuccessListener(new OnSuccessListener() { // from class: rg2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    GoogleFitSyncHelper.W(callback, date, (Void) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: yg2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    GoogleFitSyncHelper.X(callback, date, exc);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void V(GoogleFitSyncHelper googleFitSyncHelper, long j3, float f3, Function1 function1, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            function1 = g1.a;
        }
        googleFitSyncHelper.U(j3, f3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(Function1 function1, String str, Void r3) {
        HMLog.info(TAG, new j1(str));
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(Function1 function1, String str, Exception exc) {
        HMLog.error$default(TAG, null, null, new k1(str, exc), 6, null);
        function1.invoke(Boolean.FALSE);
    }

    private final void Y(final DaySportData daySportData, final Function1<? super Boolean, Unit> callback) {
        if (!HMDeviceConfig.hasFeatureFullHr(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceManager.getInstance().getMajorDeviceType()))) {
            HMLog.info(TAG, n1.a);
            callback.invoke(Boolean.FALSE);
            return;
        }
        if (daySportData.getBinaryHRData() != null) {
            if (!(daySportData.getBinaryHRData().length == 0)) {
                DataSet dataSetT0 = t0(daySportData.getTimestamp(), daySportData.getBinaryHRData());
                if (dataSetT0.isEmpty()) {
                    callback.invoke(Boolean.FALSE);
                    return;
                } else {
                    HMLog.info(TAG, new o1(daySportData));
                    Fitness.getHistoryClient(x(), GoogleFit.getFitnessGoogleAccount(x())).insertData(dataSetT0).addOnSuccessListener(new OnSuccessListener() { // from class: ng2
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            GoogleFitSyncHelper.a0(callback, daySportData, (Void) obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: vg2
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception exc) {
                            GoogleFitSyncHelper.b0(callback, daySportData, exc);
                        }
                    });
                    return;
                }
            }
        }
        callback.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Z(GoogleFitSyncHelper googleFitSyncHelper, DaySportData daySportData, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function1 = m1.a;
        }
        googleFitSyncHelper.Y(daySportData, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(Function1 function1, DaySportData daySportData, Void r3) {
        HMLog.info(TAG, new p1(daySportData));
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(Function1 function1, DaySportData daySportData, Exception exc) {
        HMLog.error$default(TAG, null, null, new q1(daySportData, exc), 6, null);
        function1.invoke(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c0(DaySportData data) {
        if (data.getStepsInfo() != null) {
            ArrayList<ActiveItem> activeList = data.getStepsInfo().getActiveList();
            if (!(activeList == null || activeList.isEmpty())) {
                return false;
            }
        }
        return true;
    }

    private final boolean d0() {
        boolean zIsSignedIn = GoogleFit.isSignedIn(x());
        if (!zIsSignedIn) {
            HMLog.error$default(TAG, null, null, r1.a, 6, null);
        }
        boolean zHasFitnessPermissions = GoogleFit.hasFitnessPermissions(x());
        if (!zHasFitnessPermissions) {
            HMLog.error$default(TAG, null, null, s1.a, 6, null);
        }
        return zIsSignedIn && zHasFitnessPermissions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(long time) {
        HMLog.info(TAG, new e2(time));
        A().edit().putLong(GOOGLE_FIT_LAST_SYNC_TIME, time).apply();
    }

    private final DataSet f0(DaySportData daySportData) {
        HMLog.info(TAG, new g2(daySportData));
        long jR = r(daySportData.getSportDay().year, daySportData.getSportDay().mon, daySportData.getSportDay().day);
        StepsInfo stepsInfo = daySportData.getStepsInfo();
        if (stepsInfo == null) {
            HMLog.info(TAG, h2.a);
            return null;
        }
        if (stepsInfo.getStageSteps().isEmpty()) {
            HMLog.info(TAG, i2.a);
            return null;
        }
        ArrayList<ActiveItem> activeList = stepsInfo.getActiveList();
        ArrayList<ActiveItem> fullActiveList = stepsInfo.getFullActiveList();
        if (fullActiveList == null) {
            HMLog.info(TAG, j2.a);
            return null;
        }
        HMLog.info(TAG, new k2(fullActiveList));
        int i3 = 0;
        DataSource dataSourceBuild = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_STEP_COUNT_DELTA).setStreamName("GoogleFitSyncHelper- steps").setType(0).build();
        DataSet.Builder builder = DataSet.builder(dataSourceBuild);
        int size = fullActiveList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = i3 + 1;
                ActiveItem activeItem = fullActiveList.get(i3);
                if (activeList == null || !activeList.contains(activeItem)) {
                    long j3 = jR + ((long) (activeItem.start * 60 * 1000));
                    Ref.LongRef longRef = new Ref.LongRef();
                    long j4 = ((long) (activeItem.stop * 60 * 1000)) + jR;
                    longRef.element = j4;
                    if (j4 > System.currentTimeMillis()) {
                        longRef.element = System.currentTimeMillis();
                    }
                    int i5 = activeItem.steps;
                    HMLog.info(TAG, new l2(j3, longRef, i5));
                    if (j3 < longRef.element) {
                        builder.add(DataPoint.builder(dataSourceBuild).setTimeInterval(j3, longRef.element, TimeUnit.MILLISECONDS).setField(Field.FIELD_STEPS, i5).build());
                    }
                }
                if (i4 > size) {
                    break;
                }
                i3 = i4;
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g0(DaySportData daySportData, Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        INSTANCE.s(daySportData, new m2(new Ref.BooleanRef(), safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h0(DaySportData daySportData, Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        INSTANCE.E(daySportData, new n2(new Ref.BooleanRef(), safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i0(DaySportData daySportData, Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        INSTANCE.I(daySportData, new o2(new Ref.BooleanRef(), safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @JvmStatic
    public static final void init(@NotNull FragmentActivity activity) {
        GoogleFitSyncHelper googleFitSyncHelper = INSTANCE;
        HMLog.info(TAG, m.a);
        if (!EventBus.getDefault().isRegistered(googleFitSyncHelper)) {
            EventBus.getDefault().register(googleFitSyncHelper);
        }
        HMLog.info(TAG, new n(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(googleFitSyncHelper.x())));
        if (HMPropertyUtil.isGoogleFitAuthed()) {
            GoogleFit.auth$default(activity, null, null, o.a, p.a, 6, null);
        } else if (GoogleFit.hasFitnessPermissions(activity)) {
            GoogleFit.signOut$default(googleFitSyncHelper.x(), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j0(DaySportData daySportData, Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        INSTANCE.M(daySportData, new p2(new Ref.BooleanRef(), safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k0(DaySportData daySportData, Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        INSTANCE.Q(daySportData, new q2(new Ref.BooleanRef(), safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l0(DaySportData daySportData, Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        INSTANCE.Y(daySportData, new r2(new Ref.BooleanRef(), safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(List<? extends DaySportData> daySportDataList) {
        HMLog.info(TAG, s2.a);
        if (daySportDataList == null || daySportDataList.isEmpty()) {
            HMLog.info(TAG, t2.a);
            return;
        }
        HMLog.debug(TAG, u2.a);
        if (z() != 0) {
            GoogleFitSyncHelperKt.launchCoroutine$default(null, null, new v2(daySportDataList, null), 3, null);
        } else {
            HMLog.info(TAG, w2.a);
            o0(HMDataCacheCenter.getInstance().getTodaySportData());
        }
    }

    private final void n0(List<? extends DaySportData> daySportData) {
        HMLog.info(TAG, x2.a);
        SyncHandler syncHandler2 = syncHandler;
        Message messageObtainMessage = syncHandler2.obtainMessage();
        messageObtainMessage.what = 18;
        messageObtainMessage.obj = daySportData;
        syncHandler2.removeMessages(18);
        syncHandler2.sendMessageDelayed(messageObtainMessage, 60000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(DaySportData daySportData) {
        GoogleFitSyncHelperKt.launchCoroutine$default(null, null, new y2(daySportData, null), 3, null);
    }

    private final void p0(DaySportData daySportData, int msgWhat) {
        HMLog.info(TAG, z2.a);
        SyncHandler syncHandler2 = syncHandler;
        Message messageObtainMessage = syncHandler2.obtainMessage();
        messageObtainMessage.what = msgWhat;
        messageObtainMessage.obj = daySportData;
        syncHandler2.removeMessages(msgWhat);
        syncHandler2.sendMessageDelayed(messageObtainMessage, 60000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        HMLog.info(TAG, a.a);
        GoogleFit.signOut$default(x(), null, 2, null);
        HMPropertyUtil.setThirdPartyAuth("google", false);
    }

    public static /* synthetic */ void q0(GoogleFitSyncHelper googleFitSyncHelper, DaySportData daySportData, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 17;
        }
        googleFitSyncHelper.p0(daySportData, i3);
    }

    private final long r(int year, int month, int day) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault()).parse(year + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (month + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + day + " 00:00:00");
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (Exception e3) {
            e3.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(DaySportData daySportData) {
        GoogleFitSyncHelperKt.launchCoroutine$default(null, null, new a3(daySportData, null), 3, null);
    }

    private final void s(final DaySportData daySportData, final Function1<? super Boolean, Unit> callback) {
        long jR = r(daySportData.getSportDay().year, daySportData.getSportDay().mon, daySportData.getSportDay().day);
        DataDeleteRequest dataDeleteRequestBuild = new DataDeleteRequest.Builder().setTimeInterval(jR, jR + ((long) 86400000), TimeUnit.MILLISECONDS).addDataType(DataType.TYPE_ACTIVITY_SEGMENT).addDataType(DataType.TYPE_STEP_COUNT_DELTA).addDataType(DataType.TYPE_CALORIES_EXPENDED).addDataType(DataType.TYPE_DISTANCE_DELTA).addDataType(DataType.TYPE_HEART_RATE_BPM).build();
        HMLog.info(TAG, new d(daySportData));
        Fitness.getHistoryClient(x(), GoogleFit.getFitnessGoogleAccount(x())).deleteData(dataDeleteRequestBuild).addOnSuccessListener(new OnSuccessListener() { // from class: bh2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                GoogleFitSyncHelper.u(callback, daySportData, (Void) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: ug2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                GoogleFitSyncHelper.v(callback, daySportData, exc);
            }
        });
    }

    private final DataSet s0(long time, float weight) {
        DataSource dataSourceBuild = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_WEIGHT).setStreamName("GoogleFitSyncHelper - weight").setType(0).build();
        return DataSet.builder(dataSourceBuild).add(DataPoint.builder(dataSourceBuild).setTimestamp(time, TimeUnit.MILLISECONDS).setField(Field.FIELD_WEIGHT, weight).build()).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(GoogleFitSyncHelper googleFitSyncHelper, DaySportData daySportData, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function1 = c.a;
        }
        googleFitSyncHelper.s(daySportData, function1);
    }

    private final DataSet t0(long time, byte[] hrList) {
        int i3 = 0;
        DataSource dataSourceBuild = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_HEART_RATE_BPM).setStreamName("GoogleFitSyncHelper - heartrate").setType(0).build();
        DataSet.Builder builder = DataSet.builder(dataSourceBuild);
        int length = hrList.length;
        int i4 = 0;
        while (i3 < length) {
            byte b3 = hrList[i3];
            i3++;
            int i5 = b3 & 255;
            i4++;
            if (HRDataManager.getInstance().isValidHeartRate(i5)) {
                builder.add(DataPoint.builder(dataSourceBuild).setTimestamp(((long) (i4 * 60 * 1000)) + time, TimeUnit.MILLISECONDS).setField(Field.FIELD_BPM, i5).build());
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Function1 function1, DaySportData daySportData, Void r3) {
        HMLog.info(TAG, new e(daySportData));
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Function1 function1, DaySportData daySportData, Exception exc) {
        HMLog.error$default(TAG, null, null, new f(daySportData, exc), 6, null);
        function1.invoke(Boolean.FALSE);
    }

    private final DataSet w(DaySportData daySportData) {
        long jR = r(daySportData.getSportDay().year, daySportData.getSportDay().mon, daySportData.getSportDay().day);
        StepsInfo stepsInfo = daySportData.getStepsInfo();
        if (stepsInfo == null) {
            HMLog.info(TAG, g.a);
            return null;
        }
        if (stepsInfo.getStageSteps().isEmpty()) {
            HMLog.info(TAG, h.a);
            return null;
        }
        ArrayList<ActiveItem> activeList = stepsInfo.getActiveList();
        ArrayList<ActiveItem> fullActiveList = stepsInfo.getFullActiveList();
        if (fullActiveList == null) {
            HMLog.info(TAG, i.a);
            return null;
        }
        HMLog.info(TAG, new j(fullActiveList));
        DataSource dataSourceBuild = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_DISTANCE_DELTA).setStreamName("GoogleFitSyncHelper- distance").setType(0).build();
        DataSet.Builder builder = DataSet.builder(dataSourceBuild);
        for (ActiveItem activeItem : fullActiveList) {
            if (activeList == null || !activeList.contains(activeItem)) {
                long j3 = jR + ((long) (activeItem.start * 60 * 1000));
                long j4 = jR + ((long) (activeItem.stop * 60 * 1000));
                long j5 = jR;
                HMLog.info(TAG, new k(j3, j4, activeItem));
                if (j3 < j4) {
                    builder.add(DataPoint.builder(dataSourceBuild).setTimeInterval(j3, j4, TimeUnit.MILLISECONDS).setField(Field.FIELD_DISTANCE, activeItem.distance).build());
                }
                jR = j5;
            } else {
                HMLog.info(TAG, new l(activeItem));
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context x() {
        return (Context) context.getValue();
    }

    private final DataSet y(List<? extends HeartRate> heartRateList) {
        DataSource dataSourceBuild = new DataSource.Builder().setAppPackageName(x()).setDataType(DataType.TYPE_HEART_RATE_BPM).setStreamName("GoogleFitSyncHelper - heartrate").setType(0).build();
        DataSet.Builder builder = DataSet.builder(dataSourceBuild);
        for (HeartRate heartRate : heartRateList) {
            builder.add(DataPoint.builder(dataSourceBuild).setField(Field.FIELD_BPM, heartRate.getHr().intValue()).setTimestamp(heartRate.getTime().longValue() * ((long) 1000), TimeUnit.MILLISECONDS).build());
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z() {
        return A().getLong(GOOGLE_FIT_LAST_SYNC_TIME, 0L);
    }

    public final void onEvent(@NotNull EventHeartRateSync event) {
        HMLog.info(TAG, v1.a);
        if (d0()) {
            if (event.getHeartRateList().isEmpty()) {
                HMLog.warn$default(TAG, null, w1.a, 2, null);
            } else {
                B(event.getHeartRateList());
            }
        }
    }

    public final void onEvent(@NotNull EventPostDataToGoogleFit event) {
        HMLog.info(TAG, x1.a);
        if (d0()) {
            n0(event.getDaySportDatas());
        }
    }

    public final void onEvent(@NotNull EventWeightChanged event) {
        HMLog.info(TAG, y1.a);
        if (d0()) {
            long j3 = event.uid;
            Long lValueOf = Long.valueOf(HMPersonInfo.getInstance().getUserInfo().getUserid());
            if (lValueOf != null && j3 == lValueOf.longValue()) {
                WeightInfos latestInfo = WeightInfoManager.getManager().getLatestInfo(event.uid);
                HMLog.info(TAG, new z1(latestInfo));
                V(this, latestInfo.getTimestamp().longValue(), latestInfo.getWeight().floatValue(), null, 4, null);
            }
        }
    }

    public final void onEvent(@Nullable EventTodaySportAnalysisJobFinished event) {
        if (!d0() || event == null) {
            return;
        }
        HMLog.info(TAG, a2.a);
        HMLog.info(TAG, b2.a);
        DaySportData earbudTodaySportData = event.isEarbud() ? HMDataCacheCenter.getInstance().getEarbudTodaySportData() : HMDataCacheCenter.getInstance().getTodaySportData();
        int i3 = event.isEarbud() ? 19 : 17;
        if (z() != 0) {
            Date date = new Date(z());
            HMLog.info(TAG, new c2(date));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            SportDay sportDay = new SportDay(calendar.get(1), calendar.get(2), calendar.get(5));
            HMLog.info(TAG, d2.a);
            if (Intrinsics.areEqual(sportDay.getKey(), HMDataCacheCenter.getInstance().getTodaySportData().getKey())) {
                HMLog.info(TAG, t1.a);
                p0(earbudTodaySportData, i3);
                return;
            } else {
                HMDataCacheCenter.getInstance().syncDsdToThirdPartner(sportDay.getKey(), HMDataCacheCenter.getInstance().getTodaySportData().getKey(), 0);
                return;
            }
        }
        HMLog.info(TAG, u1.a);
        p0(earbudTodaySportData, i3);
    }
}
