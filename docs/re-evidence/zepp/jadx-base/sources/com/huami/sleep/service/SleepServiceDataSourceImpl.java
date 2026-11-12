package com.huami.sleep.service;

import android.text.TextUtils;
import androidx.p008lifecycle.FlowLiveDataConversions;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.sky.service.RelaxData;
import com.huami.sky.service.RelaxDataService;
import com.huami.sky.service.RelaxScore;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.sleep.service.bean.MixData;
import com.huami.sleep.service.bean.Stage;
import com.huami.sleep.service.bean.SummeryOnSleep;
import com.huami.sleep.service.bean.WithTonalitySleepInfoData;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.sleep.util.PercentageCalculateUtil;
import com.huami.sleep.util.SleepDataTransmitUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.cybergarage.soap.SOAP;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\bG\u0010HJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J0\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\bH\u0002J0\u0010\u0017\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J$\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J8\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\bH\u0002J$\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u00162\u0006\u0010$\u001a\u00020\u0002H\u0002J \u0010)\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\u0002H\u0002J\u0018\u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0002J\u0018\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0002J@\u00105\u001a\u0012\u0012\u0004\u0012\u00020302j\b\u0012\u0004\u0012\u000203`42\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001eH\u0002J\u0010\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010706H\u0002J\u0010\u00109\u001a\u0002072\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J$\u0010;\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010:\u001a\u00020\u0002H\u0002J\u0018\u0010<\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0002H\u0002J$\u0010=\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0004\u0018\u00010\u001906H\u0016J\u0019\u0010@\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001e\u0010B\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020>\u0018\u00010\u00192\u0006\u0010?\u001a\u00020>H\u0016J\u0018\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E062\u0006\u0010D\u001a\u00020CH\u0017¨\u0006J"}, d2 = {"Lcom/huami/sleep/service/SleepServiceDataSourceImpl;", "Lcom/huami/sleep/service/ISleepServiceDataSource;", "", "todayDayKey", "", "Lcom/huami/sleep/service/bean/MixData;", "m", "originalSummary", "", z.j, "mixData", "Lcom/xiaomi/hm/health/databases/model/EarbudDateData;", "earbudDateData", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/xiaomi/hm/health/databases/model/DateData;", "dateData", "Lkotlin/Triple;", DTransferConstants.SEARCH_KEY, "summery", "isEar", "t", "allDateDataList", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "h", "r", "Lkotlin/Pair;", "o", "sleepInfo", "compareKey", "indexKey", "", "sevenDiffOffset", "isFirst", "a", "recentSleepInfo", "recentSummeryString", "todayKey", "i", "e", "Lcom/xiaomi/hm/health/databases/model/ManualData;", "data", SOAP.XMLNS, "summary", "oldSum", hl.k, "l", "startTimeIndex", "stopTimeIndex", "originalSleepStartIndex", "originalSleepStopIndex", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sleep/service/bean/WithTonalitySleepInfoData;", "g", "c", "keyDate", "f", GoogleApiAvailabilityLight.b, "getRecentSleepInfoByDB", "", "queryTimeStamp", "fetchIIntoSleepTimeStampByTimeStamp", "(J)Ljava/lang/Long;", "fetchMainSleepFallAndWakeTime", "Lcom/huami/sky/service/RelaxDataService;", "tonalityService", "Lcom/huami/sleep/service/SleepWithTonalityInfo;", "fetchWithTonalityMainSleepInfo", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepServiceDataSourceImpl implements ISleepServiceDataSource {
    private static final int a = -1;

    @NotNull
    private static final String b = "sleep";

    @NotNull
    private static final String c = "SleepServiceDataSourceImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SportDay a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SportDay sportDay, String str, int i, int i2, boolean z) {
            super(0);
            this.a = sportDay;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "today = " + SportDay.getToday().getKey() + " - indexDay = " + this.a + " - compareKey = " + this.b + " - sevenDiffOffset = " + this.c + " -offset = " + this.d + " - isFirst = " + this.e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, String str) {
            super(0);
            this.a = j;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "queryTimeStamp = " + this.a + " - queryDateKey = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ DateData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DateData dateData) {
            super(0);
            this.a = dateData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetchIIntoSleepTimeStampByTimeStamp SummeryOnSleep Happen Exception = " + this.a.getSummary();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.IntRef intRef, int i) {
            super(0);
            this.a = intRef;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "oddStageIndex = " + this.a.element + " - mainStageIndex = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, String str) {
            super(0);
            this.a = j;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetchMainSleepFallAndWakeTime => queryTimeStamp = " + this.a + " - queryDateKey = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ SleepInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SleepInfo sleepInfo) {
            super(0);
            this.a = sleepInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetchMainSleepFallAndWakeTime => timePair = " + this.a.getStartDate().getTime() + " - " + this.a.getStopDate().getTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Triple<String, String, Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Triple<String, String, Boolean> triple) {
            super(0);
            this.a = triple;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String second = this.a.getSecond();
            String first = this.a.getFirst();
            return "fetchSelectedSleep selectTriple => dateString = " + ((Object) second) + " - summary = " + ((Object) first) + " - isEar = " + this.a.getThird();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sleep/service/bean/WithTonalitySleepInfoData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceDataSourceImpl$fetchTodayMainSleep$1", f = "SleepServiceDataSourceImpl.kt", i = {}, l = {954, 973, 978}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<FlowCollector<? super WithTonalitySleepInfoData>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "fetchTodaySleepInfoWithTonality fetchTodayMainSleep Thread = " + Thread.currentThread().getName() + " ";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ SleepInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SleepInfo sleepInfo) {
                super(0);
                this.a = sleepInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "fetchTodaySleepInfoWithTonality sleepInfo = " + this.a;
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            h hVar = SleepServiceDataSourceImpl.this.new h(continuation);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super WithTonalitySleepInfoData> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.b;
            HMLog.info(SleepServiceDataSourceImpl.c, a.a);
            Triple tripleF = SleepServiceDataSourceImpl.this.f(SportDay.getToday().getKey());
            String str = (String) tripleF.getFirst();
            if (str == null || str.length() == 0) {
                this.a = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            SleepInfo sleepInfoTransmitSummeryToSleepInfo = SleepDataTransmitUtil.INSTANCE.transmitSummeryToSleepInfo(str, (String) tripleF.getSecond(), false, ((Boolean) tripleF.getThird()).booleanValue());
            SleepServiceDataSourceImpl.this.n(sleepInfoTransmitSummeryToSleepInfo, str);
            HMLog.info(SleepServiceDataSourceImpl.c, new b(sleepInfoTransmitSummeryToSleepInfo));
            if (!sleepInfoTransmitSummeryToSleepInfo.getHasSleep()) {
                this.a = 2;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            WithTonalitySleepInfoData withTonalitySleepInfoDataC = SleepServiceDataSourceImpl.this.c(sleepInfoTransmitSummeryToSleepInfo);
            this.a = 3;
            if (flowCollector.emit(withTonalitySleepInfoDataC, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public static final i a = new i();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "fetchTodaySleepInfoWithTonality queryByLiveData Thread = " + Thread.currentThread().getName();
            }
        }

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(SleepServiceDataSourceImpl.c, a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ WithTonalitySleepInfoData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(WithTonalitySleepInfoData withTonalitySleepInfoData) {
            super(0);
            this.a = withTonalitySleepInfoData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetchTodaySleepInfoWithTonality withTonalitySleepInfoData = " + this.a + " -Thread = " + Thread.currentThread().getName() + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$2$1$2", f = "SleepServiceDataSourceImpl.kt", i = {}, l = {901}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            k kVar = new k(continuation);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                this.a = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/service/RelaxData;", "relaxData", "Lcom/huami/sleep/service/SleepWithTonalityInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$2$1$3", f = "SleepServiceDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<RelaxData, Continuation<? super SleepWithTonalityInfo>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ WithTonalitySleepInfoData c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.IntRef a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.IntRef intRef) {
                super(0);
                this.a = intRef;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "valid max relax score = " + this.a.element;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(WithTonalitySleepInfoData withTonalitySleepInfoData, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = withTonalitySleepInfoData;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable RelaxData relaxData, @Nullable Continuation<? super SleepWithTonalityInfo> continuation) {
            return ((l) create(relaxData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = new l(this.c, continuation);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RelaxData relaxData = (RelaxData) this.b;
            if (relaxData == null) {
                return null;
            }
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = -1;
            Iterator<T> it2 = relaxData.getScores().iterator();
            while (it2.hasNext()) {
                int value = ((RelaxScore) it2.next()).getValue();
                boolean z = false;
                if (value >= 0 && value <= 100) {
                    z = true;
                }
                if (z) {
                    intRef.element = Math.max(intRef.element, value);
                }
            }
            HMLog.info(SleepServiceDataSourceImpl.c, new a(intRef));
            return new SleepWithTonalityInfo(intRef.element, this.c.getMainSleepDeepRatio(), this.c.getMainSleepTotalDuration(), this.c.getMainSleepScore());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0003\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0002\u0018\u00010\u0000H\n"}, d2 = {"Lkotlin/Pair;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Pair<? extends SleepInfo, ? extends List<? extends SleepInfo>>> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "todayDayKey = " + this.a;
            }
        }

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<SleepInfo, List<SleepInfo>> invoke() {
            String key = SportDay.getToday().getKey();
            HMLog.info(SleepServiceDataSourceImpl.c, new a(key));
            HMDaoManager.getInstance();
            SleepServiceDataSourceImpl sleepServiceDataSourceImpl = SleepServiceDataSourceImpl.this;
            Triple tripleH = sleepServiceDataSourceImpl.h(sleepServiceDataSourceImpl.m(key));
            return new Pair<>(SleepServiceDataSourceImpl.this.i((SleepInfo) tripleH.getSecond(), (String) tripleH.getThird(), key), tripleH.getFirst());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleManualSleep recentSummeryString is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleManualSleep recentSleepInfo is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleManualSleep ManualDataDao data is null or summery is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "hasSleepSummaryData originalSummary = " + this.a;
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
        public final String invoke() {
            return "hasSleepSummaryData parse exception";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ ManualData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ManualData manualData) {
            super(0);
            this.a = manualData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetchTodaySleepInfoWithTonality ManualDataDao summary " + this.a.getSummary();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "selectDataPriority hasEarSummary = " + this.a + " - hasBandSummary = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "selectDataPriority bandSelected = " + this.a + " - earSelected = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "selectDataPriorityWithWholeDB hasEarSummary = " + this.a + " - hasBandSummary = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "selectDataPriorityWithWholeDB bandSelected = " + this.a + " - earSelected = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(boolean z, String str) {
            super(0);
            this.a = z;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "summaryIsSelected isEar = " + this.a + " - summery = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "summaryIsSelected Happen Exception = " + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SleepInfo> a(SleepInfo sleepInfo, String compareKey, String indexKey, int sevenDiffOffset, boolean isFirst) {
        ArrayList arrayList = new ArrayList();
        SportDay sportDayFromString = SportDay.fromString(compareKey);
        SportDay sportDayFromString2 = SportDay.fromString(indexKey);
        int iOffsetDay = sportDayFromString.offsetDay(sportDayFromString2);
        HMLog.info(c, new a(sportDayFromString2, compareKey, sevenDiffOffset, iOffsetDay, isFirst));
        if (isFirst) {
            Iterator<Integer> it2 = kotlin.ranges.e.until(0, Math.min(iOffsetDay, sevenDiffOffset)).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                ((IntIterator) it2).nextInt();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                SleepInfo sleepInfo2 = new SleepInfo();
                sleepInfo2.setSportDay(sportDayFromString.addDay((-i2) - 1));
                Unit unit = Unit.INSTANCE;
                arrayList.add(0, sleepInfo2);
                i2 = i3;
            }
            arrayList.add(0, sleepInfo);
        } else {
            Iterator<Integer> it3 = kotlin.ranges.e.until(0, Math.min(iOffsetDay, sevenDiffOffset) - 1).iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                ((IntIterator) it3).nextInt();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                SleepInfo sleepInfo3 = new SleepInfo();
                sleepInfo3.setSportDay(sportDayFromString.addDay((-i4) - 1));
                Unit unit2 = Unit.INSTANCE;
                arrayList.add(0, sleepInfo3);
                i4 = i5;
            }
            if (iOffsetDay > sevenDiffOffset) {
                SleepInfo sleepInfo4 = new SleepInfo();
                sleepInfo4.setSportDay(SportDay.getToday().addDay(-6));
                Unit unit3 = Unit.INSTANCE;
                arrayList.add(0, sleepInfo4);
            } else {
                arrayList.add(0, sleepInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WithTonalitySleepInfoData c(SleepInfo sleepInfo) {
        long time = sleepInfo.getStartDate().getTime();
        long time2 = sleepInfo.getStopDate().getTime();
        int sleepScore = sleepInfo.getSleepScore();
        PercentageCalculateUtil percentageCalculateUtil = PercentageCalculateUtil.INSTANCE;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(sleepInfo.getNonRemCount()));
        arrayList.add(Integer.valueOf(sleepInfo.getRemCount()));
        arrayList.add(Integer.valueOf(sleepInfo.getDreamTime()));
        Unit unit = Unit.INSTANCE;
        return new WithTonalitySleepInfoData(percentageCalculateUtil.calculatePercentages(arrayList, 100)[0], sleepInfo.getSleepCount(), sleepScore, time, time2);
    }

    private final ArrayList<StageSleep> d(SleepInfo recentSleepInfo, int startTimeIndex, int stopTimeIndex, int originalSleepStartIndex, int originalSleepStopIndex) {
        ArrayList<StageSleep> arrayList = new ArrayList<>();
        ArrayList<StageSleep> stageSleep = recentSleepInfo.getStageSleep();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = stageSleep.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            StageSleep stageSleep2 = (StageSleep) next;
            int i2 = stageSleep2.stop;
            if (!(startTimeIndex <= i2 && i2 <= stopTimeIndex)) {
                int i3 = stageSleep2.start;
                if (!(startTimeIndex <= i3 && i3 <= stopTimeIndex)) {
                    z = false;
                }
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        int i4 = 0;
        for (Object obj : arrayList2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            StageSleep stageSleep3 = (StageSleep) obj;
            int i6 = stageSleep3.start;
            int i7 = stageSleep3.stop;
            int i8 = stageSleep3.mode;
            if (originalSleepStartIndex > startTimeIndex && i4 == 0) {
                StageSleep stageSleep4 = new StageSleep();
                stageSleep4.start = startTimeIndex;
                stageSleep4.stop = originalSleepStartIndex - 1;
                stageSleep4.mode = ChartTransmitUtil.MODE_EDIT;
                arrayList.add(stageSleep4);
                StageSleep stageSleep5 = new StageSleep();
                stageSleep5.start = i6;
                stageSleep5.stop = i7;
                stageSleep5.mode = i8;
                arrayList.add(stageSleep5);
            } else if (i6 <= startTimeIndex && startTimeIndex <= i7) {
                StageSleep stageSleep6 = new StageSleep();
                stageSleep6.start = startTimeIndex;
                stageSleep6.stop = i7;
                stageSleep6.mode = i8;
                arrayList.add(stageSleep6);
            } else if (i6 <= stopTimeIndex && stopTimeIndex <= i7) {
                StageSleep stageSleep7 = new StageSleep();
                stageSleep7.start = i6;
                stageSleep7.stop = stopTimeIndex;
                stageSleep7.mode = i8;
                arrayList.add(stageSleep7);
            } else {
                arrayList.add(stageSleep3);
            }
            i4 = i5;
        }
        if (originalSleepStopIndex < stopTimeIndex && Math.abs(originalSleepStopIndex - stopTimeIndex) > 0) {
            StageSleep stageSleep8 = new StageSleep();
            stageSleep8.start = originalSleepStopIndex + 1;
            stageSleep8.stop = stopTimeIndex;
            stageSleep8.mode = ChartTransmitUtil.MODE_EDIT;
            arrayList.add(stageSleep8);
        }
        return arrayList;
    }

    private final SleepInfo e(String todayKey) {
        QueryBuilder<ManualData> queryBuilder = HMDaoManager.getInstance().getManualDataDao().queryBuilder();
        WhereCondition whereConditionEq = ManualDataDao.Properties.Type.eq("sleep");
        Property property = ManualDataDao.Properties.Date;
        ManualData manualDataUnique = queryBuilder.where(whereConditionEq, property.le(todayKey)).orderDesc(property).limit(1).build().unique();
        if (manualDataUnique == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(manualDataUnique.getSummary());
        String date = manualDataUnique.getDate();
        long jOptLong = jSONObject.optLong(UserDataStore.STATE);
        long jOptLong2 = jSONObject.optLong("ed");
        if (jOptLong == 0 || jOptLong2 == 0 || jOptLong == jOptLong2) {
            return null;
        }
        SleepInfo sleepInfo = new SleepInfo(SportDay.fromString(date).getTimestamp());
        long j2 = 1000;
        long j3 = jOptLong * j2;
        sleepInfo.setStartDate(new Date(j3));
        long j4 = jOptLong2 * j2;
        sleepInfo.setStopDate(new Date(j4));
        sleepInfo.setSportDay(SportDay.fromString(date));
        sleepInfo.setHasSleep(true);
        sleepInfo.setSleepCount(((int) (((sleepInfo.getStopDate().getTime() - sleepInfo.getStartDate().getTime()) / j2) / ((long) 60))) - sleepInfo.getAwakeCount());
        ArrayList<StageSleep> arrayList = new ArrayList<>();
        StageSleep stageSleep = new StageSleep();
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        int iCalculateSleepIndex = sleepTimeUtil.calculateSleepIndex(j3, SportDay.fromString(date).getTimestamp(), true);
        int iCalculateSleepIndex2 = sleepTimeUtil.calculateSleepIndex(j4, SportDay.fromString(date).getTimestamp(), false);
        stageSleep.start = iCalculateSleepIndex;
        stageSleep.stop = iCalculateSleepIndex2;
        stageSleep.mode = ChartTransmitUtil.MODE_EDIT;
        arrayList.add(stageSleep);
        sleepInfo.setStageSleep(arrayList);
        return sleepInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Triple<String, String, Boolean> f(String keyDate) {
        Triple<String, String, Boolean> tripleQ = q(HMDaoManager.getInstance().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Date.eq(keyDate), new WhereCondition[0]).unique(), HMDaoManager.getInstance().getEarbudDateDataDao().queryBuilder().where(EarbudDateDataDao.Properties.Date.eq(keyDate), new WhereCondition[0]).unique());
        HMLog.info(c, new g(tripleQ));
        return tripleQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<WithTonalitySleepInfoData> g() {
        return FlowKt.flowOn(FlowKt.flow(new h(null)), Dispatchers.getIO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Triple<List<SleepInfo>, SleepInfo, String> h(List<MixData> allDateDataList) {
        ArrayList arrayList = new ArrayList();
        if (allDateDataList.isEmpty()) {
            return new Triple<>(arrayList, null, "");
        }
        arrayList.addAll(r(allDateDataList));
        Pair<SleepInfo, String> pairO = o(allDateDataList);
        return new Triple<>(arrayList, pairO.getFirst(), pairO.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepInfo i(SleepInfo recentSleepInfo, String recentSummeryString, String todayKey) {
        boolean z = true;
        if ((recentSummeryString.length() == 0) && recentSleepInfo != null) {
            HMLog.info(c, n.a);
            return recentSleepInfo;
        }
        if (recentSleepInfo == null) {
            HMLog.info(c, o.a);
            return e(todayKey);
        }
        ManualData manualDataUnique = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(recentSleepInfo.getSportDay().getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
        if (manualDataUnique != null) {
            String summary = manualDataUnique.getSummary();
            if (summary != null && summary.length() != 0) {
                z = false;
            }
            if (!z) {
                return s(recentSleepInfo, manualDataUnique, recentSummeryString);
            }
        }
        HMLog.info(c, p.a);
        return recentSleepInfo;
    }

    private final boolean j(String originalSummary) {
        HMLog.info(c, new q(originalSummary));
        if (originalSummary == null || originalSummary.length() == 0) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(originalSummary).getJSONObject("slp");
            JSONArray jSONArray = new JSONArray();
            if (jSONObject.has(StepsInfo.KEY_STAGE)) {
                jSONArray = jSONObject.getJSONArray(StepsInfo.KEY_STAGE);
            }
            JSONArray jSONArray2 = new JSONArray();
            if (jSONObject.has("odd_stage")) {
                jSONArray2 = jSONObject.getJSONArray("odd_stage");
            }
            return jSONArray.length() > 0 || jSONArray2.length() > 0;
        } catch (Exception e2) {
            HMLog.error$default(c, null, e2, r.a, 2, null);
            return false;
        }
    }

    private final boolean k(String summary, String oldSum) throws JSONException {
        boolean zL = false;
        try {
            if (TextUtils.isEmpty(oldSum)) {
                JSONObject jSONObject = new JSONObject(summary);
                int iOptInt = jSONObject.optInt(Constant.PAI_KEY_DAILY_PAI);
                int iOptInt2 = jSONObject.optInt("lt");
                long jOptInt = jSONObject.optInt(UserDataStore.STATE);
                long jOptInt2 = jSONObject.optInt("ed");
                if (iOptInt + iOptInt2 > 0 || jOptInt2 - jOptInt > 0) {
                    zL = true;
                }
            } else {
                zL = l(summary, oldSum);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return zL;
    }

    private final boolean l(String summary, String oldSum) throws JSONException {
        JSONObject jSONObject = new JSONObject(oldSum).getJSONObject("slp");
        long jOptLong = jSONObject.optLong(UserDataStore.STATE);
        long jOptLong2 = jSONObject.optLong("ed");
        int iOptInt = jSONObject.optInt(Constant.PAI_KEY_DAILY_PAI);
        int iOptInt2 = jSONObject.optInt("lt");
        JSONObject jSONObject2 = new JSONObject(summary);
        int iOptInt3 = jSONObject2.optInt(Constant.PAI_KEY_DAILY_PAI);
        int iOptInt4 = jSONObject2.optInt("lt");
        long jOptLong3 = jSONObject2.optLong(UserDataStore.STATE);
        long jOptLong4 = jSONObject2.optLong("ed");
        if (jOptLong2 - jOptLong <= 0 || iOptInt <= 0 || iOptInt2 <= 0) {
            if (iOptInt3 + iOptInt4 <= 0 && jOptLong4 - jOptLong3 <= 0) {
                return false;
            }
        } else if (iOptInt3 + iOptInt4 <= 0 || jOptLong4 - jOptLong3 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MixData> m(String todayDayKey) {
        HMDaoManager hMDaoManager = HMDaoManager.getInstance();
        QueryBuilder<DateData> queryBuilder = hMDaoManager.getDateDataDao().queryBuilder();
        Property property = DateDataDao.Properties.Date;
        int i2 = 0;
        List<DateData> list = queryBuilder.where(property.le(todayDayKey), new WhereCondition[0]).orderDesc(property).build().list();
        QueryBuilder<EarbudDateData> queryBuilder2 = hMDaoManager.getEarbudDateDataDao().queryBuilder();
        Property property2 = EarbudDateDataDao.Properties.Date;
        List<EarbudDateData> list2 = queryBuilder2.where(property2.le(todayDayKey), new WhereCondition[0]).orderDesc(property2).build().list();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (DateData dateData : list) {
            map.put(dateData.getDate(), new MixData(dateData.getSummary(), dateData.getDate()));
        }
        int size = list2.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = i2 + 1;
                String date = list2.get(i2).getDate();
                if (map.containsKey(date)) {
                    map.put(date, p((MixData) map.get(date), list2.get(i2)));
                    break;
                }
                map.put(date, new MixData(list2.get(i2).getSummary(), date));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        Iterator it2 = kotlin.collections.q.toSortedMap(map, new Comparator() { // from class: com.huami.sleep.service.SleepServiceDataSourceImpl$mixDatabaseData$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues((String) t3, (String) t2);
            }
        }).entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getValue());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepInfo n(SleepInfo sleepInfo, String summary) {
        boolean z = true;
        ManualData manualDataUnique = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(SportDay.getToday().getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
        if (manualDataUnique == null) {
            return sleepInfo;
        }
        String summary2 = manualDataUnique.getSummary();
        if (summary2 != null && summary2.length() != 0) {
            z = false;
        }
        if (z) {
            return sleepInfo;
        }
        HMLog.info(c, new s(manualDataUnique));
        return s(sleepInfo, manualDataUnique, summary);
    }

    private final Pair<SleepInfo, String> o(List<MixData> allDateDataList) {
        boolean z;
        SleepInfo sleepInfoTransmitSummeryToSleepInfo;
        Iterator<MixData> it2 = allDateDataList.iterator();
        do {
            if (!it2.hasNext()) {
                return new Pair<>(null, "");
            }
            MixData next = it2.next();
            z = false;
            sleepInfoTransmitSummeryToSleepInfo = SleepDataTransmitUtil.INSTANCE.transmitSummeryToSleepInfo(next.getSummary(), next.getDate(), false, false);
            if (sleepInfoTransmitSummeryToSleepInfo.getHasSleep()) {
                String summary = next.getSummary();
                return new Pair<>(sleepInfoTransmitSummeryToSleepInfo, summary != null ? summary : "");
            }
            ArrayList<StageSleep> oddStageSleep = sleepInfoTransmitSummeryToSleepInfo.getOddStageSleep();
            if (oddStageSleep == null || oddStageSleep.isEmpty()) {
                z = true;
            }
        } while (z);
        return new Pair<>(sleepInfoTransmitSummeryToSleepInfo, "");
    }

    private final MixData p(MixData mixData, EarbudDateData earbudDateData) {
        String date;
        String summary;
        boolean zJ = j(earbudDateData.getSummary());
        boolean zJ2 = j(mixData.getSummary());
        HMLog.info(c, new t(zJ, zJ2));
        if (zJ && !zJ2) {
            summary = earbudDateData.getSummary();
            date = earbudDateData.getDate();
        } else if (zJ && zJ2) {
            String summary2 = mixData.getSummary();
            String summary3 = earbudDateData.getSummary();
            boolean zT = t(summary2, false);
            boolean zT2 = t(summary3, true);
            HMLog.info(c, new u(zT, zT2));
            if (zT || !zT2) {
                date = mixData.getDate();
                summary = summary2;
            } else {
                date = earbudDateData.getDate();
                summary = summary3;
            }
        } else {
            String summary4 = mixData.getSummary();
            date = mixData.getDate();
            summary = summary4;
        }
        return new MixData(summary, date);
    }

    private final Triple<String, String, Boolean> q(DateData dateData, EarbudDateData earbudDateData) {
        String summary;
        String date;
        String date2;
        String summary2;
        boolean zJ = j(earbudDateData == null ? null : earbudDateData.getSummary());
        boolean zJ2 = j(dateData == null ? null : dateData.getSummary());
        HMLog.info(c, new v(zJ, zJ2));
        boolean z = false;
        if (!zJ || zJ2) {
            if (zJ && zJ2) {
                summary = dateData.getSummary();
                String summary3 = earbudDateData.getSummary();
                boolean zT = t(summary, false);
                boolean zT2 = t(summary3, true);
                HMLog.info(c, new w(zT, zT2));
                if (zT || !zT2) {
                    date2 = dateData.getDate();
                } else {
                    date2 = earbudDateData.getDate();
                    summary2 = summary3;
                }
            } else {
                summary = dateData != null ? dateData.getSummary() : null;
                if (dateData == null || (date = dateData.getDate()) == null) {
                    date = "1970-01-01";
                }
                date2 = date;
            }
            summary2 = summary;
            return new Triple<>(summary2, date2, Boolean.valueOf(z));
        }
        summary2 = earbudDateData.getSummary();
        date2 = earbudDateData.getDate();
        z = true;
        return new Triple<>(summary2, date2, Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[LOOP:0: B:5:0x0011->B:20:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[EDGE_INSN: B:23:0x0073->B:21:0x0073 BREAK  A[LOOP:0: B:5:0x0011->B:20:0x0071], SYNTHETIC] */
    private final List<SleepInfo> r(List<MixData> allDateDataList) {
        ArrayList arrayList = new ArrayList();
        int size = allDateDataList.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                MixData mixData = allDateDataList.get(i2);
                SleepInfo sleepInfoTransmitSummeryToSleepInfo = SleepDataTransmitUtil.INSTANCE.transmitSummeryToSleepInfo(mixData.getSummary(), mixData.getDate(), true, false);
                if (arrayList.size() < 7) {
                    arrayList.addAll(0, a(sleepInfoTransmitSummeryToSleepInfo, (arrayList.size() == 0 ? SportDay.getToday() : ((SleepInfo) arrayList.get(0)).getSportDay()).getKey(), allDateDataList.get(i2).getDate(), 7 - arrayList.size(), i2 == 0));
                    if (arrayList.size() == 7) {
                        break;
                    }
                    if (i3 > size) {
                        break;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i3 > size) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return arrayList;
    }

    private final SleepInfo s(SleepInfo recentSleepInfo, ManualData data, String recentSummeryString) {
        if (k(data.getSummary(), recentSummeryString)) {
            JSONObject jSONObject = new JSONObject(data.getSummary());
            long jOptLong = jSONObject.optLong(UserDataStore.STATE);
            long jOptLong2 = jSONObject.optLong("ed");
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            long j2 = 1000;
            int iCalculateSleepIndex = sleepTimeUtil.calculateSleepIndex(jOptLong * j2, recentSleepInfo.getSportDay().getTimestamp(), true);
            int iCalculateSleepIndex2 = sleepTimeUtil.calculateSleepIndex(jOptLong2 * j2, recentSleepInfo.getSportDay().getTimestamp(), false);
            int size = recentSleepInfo.getStageSleep().size();
            int i2 = size > 0 ? ((StageSleep) CollectionsKt.first((List) recentSleepInfo.getStageSleep())).start : -1;
            int i3 = size > 0 ? recentSleepInfo.getStageSleep().get(recentSleepInfo.getStageSleep().size() - 1).stop : -1;
            recentSleepInfo.setStageSleep(d(recentSleepInfo, iCalculateSleepIndex, iCalculateSleepIndex2, i2, i3));
            if (i2 == -1 || i2 != iCalculateSleepIndex) {
                recentSleepInfo.setStartDate(SleepDataTransmitUtil.INSTANCE.handleMinuteCalendar(recentSleepInfo.getSportDay().calendar.getTime(), iCalculateSleepIndex));
            }
            if (i3 == -1 || i3 != iCalculateSleepIndex2) {
                recentSleepInfo.setStopDate(SleepDataTransmitUtil.INSTANCE.handleMinuteCalendar(recentSleepInfo.getSportDay().calendar.getTime(), iCalculateSleepIndex2 + 1));
            }
            recentSleepInfo.setSleepCount(((iCalculateSleepIndex2 - iCalculateSleepIndex) + 1) - recentSleepInfo.getAwakeCount());
            recentSleepInfo.setHasSleep(recentSleepInfo.getSleepCount() > 0);
        }
        return recentSleepInfo;
    }

    private final boolean t(String summery, boolean isEar) {
        HMLog.info(c, new x(isEar, summery));
        try {
            return ((SummeryOnSleep) new Gson().fromJson(summery, SummeryOnSleep.class)).getSlp().getSelected() == 1;
        } catch (Exception e2) {
            HMLog.error$default(c, null, e2, new y(summery), 2, null);
            return false;
        }
    }

    @Override // com.huami.sleep.service.ISleepServiceDataSource
    @Nullable
    public Long fetchIIntoSleepTimeStampByTimeStamp(long queryTimeStamp) {
        SummeryOnSleep summeryOnSleep;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(queryTimeStamp);
        String string = new SportDay(calendar).toString();
        HMLog.info(c, new b(queryTimeStamp, string));
        int i2 = 0;
        DateData dateDataUnique = HMDaoManager.getInstance().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Date.eq(string), new WhereCondition[0]).build().unique();
        if (dateDataUnique == null) {
            return null;
        }
        try {
            summeryOnSleep = (SummeryOnSleep) new Gson().fromJson(dateDataUnique.getSummary(), SummeryOnSleep.class);
        } catch (Exception e2) {
            HMLog.error$default(c, null, e2, new c(dateDataUnique), 2, null);
            summeryOnSleep = null;
        }
        if (summeryOnSleep == null) {
            summeryOnSleep = new SummeryOnSleep(null, 1, null);
        }
        List<Stage> stage = summeryOnSleep.getSlp().getStage();
        int start = true ^ stage.isEmpty() ? stage.get(0).getStart() : -1;
        List<Stage> oddStage = summeryOnSleep.getSlp().getOddStage();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        for (Object obj : oddStage) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Stage stage2 = (Stage) obj;
            int i4 = intRef.element;
            if (i4 == -1) {
                intRef.element = stage2.getStart();
            } else if (i4 < stage2.getStart()) {
                intRef.element = stage2.getStart();
            }
            i2 = i3;
        }
        HMLog.info(c, new d(intRef, start));
        int iMax = Math.max(start, intRef.element);
        if (iMax == -1) {
            return null;
        }
        return Long.valueOf(TimeUtils.parseStringToLong("yyyy-MM-dd", string) + ((long) ((iMax + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN) * 60 * 1000)));
    }

    @Override // com.huami.sleep.service.ISleepServiceDataSource
    @Nullable
    public Pair<Long, Long> fetchMainSleepFallAndWakeTime(long queryTimeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(queryTimeStamp);
        Unit unit = Unit.INSTANCE;
        String key = new SportDay(calendar).getKey();
        HMLog.info(c, new e(queryTimeStamp, key));
        Triple<String, String, Boolean> tripleF = f(key);
        String first = tripleF.getFirst();
        if (first == null || first.length() == 0) {
            return null;
        }
        SleepInfo sleepInfoTransmitSummeryToSleepInfo = SleepDataTransmitUtil.INSTANCE.transmitSummeryToSleepInfo(first, tripleF.getSecond(), false, tripleF.getThird().booleanValue());
        n(sleepInfoTransmitSummeryToSleepInfo, first);
        HMLog.info(c, new f(sleepInfoTransmitSummeryToSleepInfo));
        if (sleepInfoTransmitSummeryToSleepInfo.getHasSleep()) {
            return new Pair<>(Long.valueOf(sleepInfoTransmitSummeryToSleepInfo.getStartDate().getTime()), Long.valueOf(sleepInfoTransmitSummeryToSleepInfo.getStopDate().getTime()));
        }
        return null;
    }

    @Override // com.huami.sleep.service.ISleepServiceDataSource
    @ExperimentalCoroutinesApi
    @NotNull
    public Flow<SleepWithTonalityInfo> fetchWithTonalityMainSleepInfo(@NotNull RelaxDataService tonalityService) {
        return FlowKt.transformLatest(FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"DATE_DATA", "EARBUD_DATE_DATA", "MANUAL_DATA"}, i.a)), new SleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$$inlined$flatMapLatest$1(null, this, tonalityService));
    }

    @Override // com.huami.sleep.service.ISleepServiceDataSource
    @NotNull
    public Flow<Pair<SleepInfo, List<SleepInfo>>> getRecentSleepInfoByDB() {
        return FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"DATE_DATA", "EARBUD_DATE_DATA", "MANUAL_DATA"}, new m()));
    }
}
