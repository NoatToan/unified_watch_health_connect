package com.huami.sleep.repo;

import android.content.Context;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.util.SparseArrayKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.FlowLiveDataConversions;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.SectionLineDataExtend;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.util.HMColor;
import com.huami.sleep.R;
import com.huami.sleep.datasource.IBreathQualityDataSource;
import com.huami.sleep.datasource.ISleepDayDataSource;
import com.huami.sleep.model.BreathQualityOdInfo;
import com.huami.sleep.model.BreathQualityRiskLevel;
import com.huami.sleep.model.BreathQualityScoreInfo;
import com.huami.sleep.model.BreathQualityScoreInfoKt;
import com.huami.sleep.repo.BreathQualityRepo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.util.ChartXAxisUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.sleep.view.SleepPosCircleView;
import com.huami.sleep.vo.BreathQualityDayOdVo;
import com.huami.sleep.vo.BreathQualityDayScoreVo;
import com.huami.sleep.vo.BreathQualityWMScoreVo;
import com.huami.sleep.vo.BreathQualityYearScoreVo;
import com.huami.sleep.vo.SelectInfoVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.tencent.connect.common.Constants;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 E2\u00020\u0001:\u0001EB\u0017\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010B\u001a\u00020@¢\u0006\u0004\bC\u0010DJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0002J7\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u001d2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJq\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d\"\u0004\b\u0000\u0010 2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00028\u00000#2\u0016\u0010(\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00028\u0000\u0018\u00010'H\u0097@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J9\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0097@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J1\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u00100J9\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u001d2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b3\u00104JA\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u00107J9\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b9\u0010-J#\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d2\u0006\u0010\u001b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/huami/sleep/repo/BreathQualityRepo;", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "date", "", "start", Command.STOP, "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "b", "Lkotlin/Pair;", "", "h", "f", "", "Lcom/huami/sleep/model/BreathQualityScoreInfo;", "dataList", "Lcom/huami/sleep/vo/SelectInfoVo;", "g", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Lcom/huami/chart/data/ChartData;", GoogleApiAvailabilityLight.a, "day", "c", "userId", "timestamp", "Lkotlinx/coroutines/flow/Flow;", "getDayOdiScore", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "timeStamp", "interval", "Lkotlin/Function2;", "Lcom/huami/sleep/model/BreathQualityOdInfo;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "convert", "Lkotlin/Function1;", "empty", "getOdiInfo", "(Ljava/lang/String;JJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "getOdiShowInfo", "(Landroid/content/Context;Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/vo/BreathQualityDayScoreVo;", "getDayScoreShowInfo", "(Landroid/content/Context;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "from", "to", "getBreathQualityScoreInfoList", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/vo/BreathQualityWMScoreVo;", "getMWScoreShowInfo", "(Landroid/content/Context;Ljava/lang/String;Lcom/huami/sleep/statistic/dto/TimeMode;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/vo/BreathQualityYearScoreVo;", "getYearScoreShowInfo", "getLatestScoreInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/datasource/IBreathQualityDataSource;", "a", "Lcom/huami/sleep/datasource/IBreathQualityDataSource;", ParamKey.dataSource, "Lcom/huami/sleep/datasource/ISleepDayDataSource;", "Lcom/huami/sleep/datasource/ISleepDayDataSource;", "daySleepDataSource", "<init>", "(Lcom/huami/sleep/datasource/IBreathQualityDataSource;Lcom/huami/sleep/datasource/ISleepDayDataSource;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityRepo implements IBreathQualityRepo {

    @NotNull
    private static final String c = "BreathQualityRepo";
    private static final int d = 60;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBreathQualityDataSource dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ISleepDayDataSource daySleepDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a + "  疑似呼吸不畅x轴的步长： " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo", f = "BreathQualityRepo.kt", i = {}, l = {55}, m = "getDayOdiScore", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BreathQualityRepo.this.getDayOdiScore(null, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo", f = "BreathQualityRepo.kt", i = {0, 0}, l = {412}, m = "getDayScoreShowInfo", n = {DbUtils.Const.Table.CONTEXT, "timeStamp"}, s = {"L$0", "J$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public long b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BreathQualityRepo.this.getDayScoreShowInfo(null, null, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, int i, int i2, Context context) {
            super(0);
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return TimeShowUtilsKt.toDateString(this.a) + "  睡眠呼吸质量得分：" + this.b + "   有效监测时长" + TimeShowUtilsKt.getDurationStr$default(this.c, this.d, false, false, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo", f = "BreathQualityRepo.kt", i = {0, 0, 0, 0, 0}, l = {466}, m = "getMWScoreShowInfo", n = {"this", DbUtils.Const.Table.CONTEXT, SleepAnalysisFragment.TIME_MODE, "from", "to"}, s = {"L$0", "L$1", "L$2", "J$0", "J$1"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public long e;
        public /* synthetic */ Object f;
        public int h;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return BreathQualityRepo.this.getMWScoreShowInfo(null, null, null, 0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo", f = "BreathQualityRepo.kt", i = {0, 0, 0, 0, 0, 0}, l = {85}, m = "getOdiInfo", n = {"this", "userId", "convert", "empty", "date", "interval"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0"})
    public static final class f<T> extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public long g;
        public /* synthetic */ Object h;
        public int j;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return BreathQualityRepo.this.getOdiInfo(null, 0L, 0L, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "", "Lcom/huami/sleep/model/BreathQualityScoreInfo;", "scoreInfo", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$2", f = "BreathQualityRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function3<SleepInfo, List<? extends BreathQualityScoreInfo>, Continuation<? super SleepInfo>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SleepInfo sleepInfo, @Nullable List<BreathQualityScoreInfo> list, @Nullable Continuation<? super SleepInfo> continuation) {
            g gVar = new g(continuation);
            gVar.b = sleepInfo;
            gVar.c = list;
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
            SleepInfo sleepInfo = (SleepInfo) this.b;
            List list = (List) this.c;
            if ((list == null || list.isEmpty()) || !BreathQualityScoreInfoKt.isScoreValid((BreathQualityScoreInfo) list.get(0))) {
                return null;
            }
            return sleepInfo;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "it", "Lkotlinx/coroutines/flow/Flow;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3", f = "BreathQualityRepo.kt", i = {0, 0}, l = {99}, m = "invokeSuspend", n = {"it", "$this$invokeSuspend_u24lambda_u2d1"}, s = {"L$0", "L$4"})
    public static final class AnonymousClass3<T> extends SuspendLambda implements Function2<SleepInfo, Continuation<? super Flow<? extends T>>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ String h;
        public final /* synthetic */ long i;
        public final /* synthetic */ Function1<SleepInfo, T> j;
        public final /* synthetic */ Function2<List<BreathQualityOdInfo>, SleepInfo, T> k;
        public final /* synthetic */ String l;

        /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ List<BreathQualityOdInfo> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, List<BreathQualityOdInfo> list) {
                super(0);
                this.a = str;
                this.b = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "BreathQualityRepo  " + this.a + "  odiList： " + this.b;
            }
        }

        /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3$1$2", f = "BreathQualityRepo.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
            public int a;
            private /* synthetic */ Object b;
            public final /* synthetic */ Function1<SleepInfo, T> c;
            public final /* synthetic */ SleepInfo d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super SleepInfo, ? extends T> function1, SleepInfo sleepInfo, Continuation<? super b> continuation) {
                super(2, continuation);
                this.c = function1;
                this.d = sleepInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.c, this.d, continuation);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.b;
                    Function1<SleepInfo, T> function1 = this.c;
                    T tInvoke = function1 == null ? null : function1.invoke(this.d);
                    this.a = 1;
                    if (flowCollector.emit(tInvoke, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3$c */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3$2", f = "BreathQualityRepo.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
            public int a;
            private /* synthetic */ Object b;
            public final /* synthetic */ Function1<SleepInfo, T> c;
            public final /* synthetic */ SleepInfo d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(Function1<? super SleepInfo, ? extends T> function1, SleepInfo sleepInfo, Continuation<? super c> continuation) {
                super(2, continuation);
                this.c = function1;
                this.d = sleepInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                c cVar = new c(this.c, this.d, continuation);
                cVar.b = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.b;
                    Function1<SleepInfo, T> function1 = this.c;
                    T tInvoke = function1 == null ? null : function1.invoke(this.d);
                    this.a = 1;
                    if (flowCollector.emit(tInvoke, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, long j, Function1<? super SleepInfo, ? extends T> function1, Function2<? super List<BreathQualityOdInfo>, ? super SleepInfo, ? extends T> function2, String str2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.h = str;
            this.i = j;
            this.j = function1;
            this.k = function2;
            this.l = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SleepInfo sleepInfo, @Nullable Continuation<? super Flow<? extends T>> continuation) {
            return ((AnonymousClass3) create(sleepInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = BreathQualityRepo.this.new AnonymousClass3(this.h, this.i, this.j, this.k, this.l, continuation);
            anonymousClass3.f = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SleepInfo sleepInfo;
            Flow<T> flow;
            Object odiList;
            final SleepInfo sleepInfo2;
            final Function1<SleepInfo, T> function1;
            final Function2<List<BreathQualityOdInfo>, SleepInfo, T> function2;
            final String str;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                sleepInfo = (SleepInfo) this.f;
                if (sleepInfo == null) {
                    flow = null;
                } else {
                    BreathQualityRepo breathQualityRepo = BreathQualityRepo.this;
                    String str2 = this.h;
                    long j = this.i;
                    Function1<SleepInfo, T> function3 = this.j;
                    Function2<List<BreathQualityOdInfo>, SleepInfo, T> function4 = this.k;
                    String str3 = this.l;
                    if (sleepInfo.getHasSleep()) {
                        IBreathQualityDataSource iBreathQualityDataSource = breathQualityRepo.dataSource;
                        Date startDate = sleepInfo.getStartDate();
                        Long lBoxLong = startDate == null ? null : Boxing.boxLong(startDate.getTime());
                        long jCurrentTimeMillis = lBoxLong == null ? System.currentTimeMillis() : lBoxLong.longValue();
                        Date stopDate = sleepInfo.getStopDate();
                        Long lBoxLong2 = stopDate == null ? null : Boxing.boxLong(stopDate.getTime());
                        long jCurrentTimeMillis2 = lBoxLong2 == null ? System.currentTimeMillis() : lBoxLong2.longValue();
                        this.f = sleepInfo;
                        this.a = function3;
                        this.b = function4;
                        this.c = str3;
                        this.d = sleepInfo;
                        this.e = 1;
                        odiList = iBreathQualityDataSource.getOdiList(str2, jCurrentTimeMillis, jCurrentTimeMillis2, j, this);
                        if (odiList == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sleepInfo2 = sleepInfo;
                        function1 = function3;
                        function2 = function4;
                        str = str3;
                    } else {
                        flow = FlowKt.flow(new b(function3, sleepInfo, null));
                    }
                }
                if (flow == null) {
                    return FlowKt.flow(new c(this.j, sleepInfo, null));
                }
                return flow;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SleepInfo sleepInfo3 = (SleepInfo) this.d;
            String str4 = (String) this.c;
            Function2<List<BreathQualityOdInfo>, SleepInfo, T> function5 = (Function2) this.b;
            function1 = (Function1) this.a;
            SleepInfo sleepInfo4 = (SleepInfo) this.f;
            ResultKt.throwOnFailure(obj);
            sleepInfo2 = sleepInfo3;
            str = str4;
            function2 = function5;
            sleepInfo = sleepInfo4;
            odiList = obj;
            final Flow flow2 = (Flow) odiList;
            final SleepInfo sleepInfo5 = sleepInfo;
            flow = new Flow<T>() { // from class: com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3$invokeSuspend$lambda-1$$inlined$map$1

                /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3$invokeSuspend$lambda-1$$inlined$map$1$2, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                public static final class AnonymousClass2 implements FlowCollector<List<? extends BreathQualityOdInfo>> {
                    public final /* synthetic */ FlowCollector a;
                    public final /* synthetic */ Function1 b;
                    public final /* synthetic */ SleepInfo c;
                    public final /* synthetic */ Function2 d;
                    public final /* synthetic */ SleepInfo e;
                    public final /* synthetic */ String f;

                    /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3$invokeSuspend$lambda-1$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo$getOdiInfo$3$invokeSuspend$lambda-1$$inlined$map$1$2", f = "BreathQualityRepo.kt", i = {}, l = {141}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object a;
                        public int b;
                        public Object c;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.a = obj;
                            this.b |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, Function1 function1, SleepInfo sleepInfo, Function2 function2, SleepInfo sleepInfo2, String str) {
                        this.a = flowCollector;
                        this.b = function1;
                        this.c = sleepInfo;
                        this.d = function2;
                        this.e = sleepInfo2;
                        this.f = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(List<? extends BreathQualityOdInfo> list, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.b;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.b = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj = anonymousClass1.a;
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.b;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = this.a;
                            List<? extends BreathQualityOdInfo> list2 = list;
                            Object objInvoke = null;
                            HMLog.info$default(null, new BreathQualityRepo.AnonymousClass3.a(this.f, list2), 1, null);
                            if (list2 == null || list2.isEmpty()) {
                                objInvoke = this.d.invoke(list2, this.e);
                            } else {
                                String version = list2.get(0).getVersion();
                                if (version == null || version.length() == 0) {
                                    Function1 function1 = this.b;
                                    if (function1 != null) {
                                        objInvoke = function1.invoke(this.c);
                                    }
                                } else {
                                    objInvoke = this.d.invoke(list2, this.e);
                                }
                            }
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(objInvoke, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flow2.collect(new AnonymousClass2(flowCollector, function1, sleepInfo5, function2, sleepInfo2, str), continuation);
                    return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            if (flow == null) {
                return FlowKt.flow(new c(this.j, sleepInfo, null));
            }
            return flow;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo", f = "BreathQualityRepo.kt", i = {}, l = {140}, m = "getOdiShowInfo", n = {}, s = {})
    public static final class h extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BreathQualityRepo.this.getOdiShowInfo(null, null, 0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"", "Lcom/huami/sleep/model/BreathQualityOdInfo;", "list", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function2<List<? extends BreathQualityOdInfo>, SleepInfo, BreathQualityDayOdVo> {
        public final /* synthetic */ long a;
        public final /* synthetic */ BreathQualityRepo b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j, BreathQualityRepo breathQualityRepo, Context context, String str) {
            super(2);
            this.a = j;
            this.b = breathQualityRepo;
            this.c = context;
            this.d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object c(Pair pair, BaseIndex baseIndex) {
            BreathQualityRiskLevel.Companion companion = BreathQualityRiskLevel.INSTANCE;
            return new SectionLineDataExtend(((Number) pair.getFirst()).intValue(), new int[]{((Number) pair.getSecond()).intValue(), ((Number) pair.getSecond()).intValue()});
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BreathQualityDayOdVo invoke(@NotNull List<BreathQualityOdInfo> list, @NotNull SleepInfo sleepInfo) {
            BreathQualityDayOdVo breathQualityDayOdVo = new BreathQualityDayOdVo(null, false, null, null, null, 0, 0, 0, null, null, 1023, null);
            long j = this.a;
            BreathQualityRepo breathQualityRepo = this.b;
            Context context = this.c;
            String str = this.d;
            breathQualityDayOdVo.setTimeStr(SleepTimeUtil.INSTANCE.formatTimeYMD(j));
            SparseArray<YAxisData> yAxisData = breathQualityDayOdVo.getYAxisData();
            yAxisData.put(0, new YAxisData(0.0f, "0"));
            yAxisData.put(1, new YAxisData(25.0f, Constants.VIA_REPORT_TYPE_CHAT_AUDIO));
            yAxisData.put(2, new YAxisData(50.0f, "50"));
            SparseArray<XAxisData> xAxisData = breathQualityDayOdVo.getXAxisData();
            Date startDate = sleepInfo.getStartDate();
            Long lValueOf = startDate == null ? null : Long.valueOf(startDate.getTime());
            long jCurrentTimeMillis = lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
            Date stopDate = sleepInfo.getStopDate();
            Long lValueOf2 = stopDate == null ? null : Long.valueOf(stopDate.getTime());
            SparseArrayKt.putAll(xAxisData, breathQualityRepo.b(context, str, jCurrentTimeMillis, lValueOf2 == null ? System.currentTimeMillis() : lValueOf2.longValue()));
            Date startDate2 = sleepInfo.getStartDate();
            Long lValueOf3 = startDate2 == null ? null : Long.valueOf(startDate2.getTime());
            long jCurrentTimeMillis2 = lValueOf3 == null ? System.currentTimeMillis() : lValueOf3.longValue();
            Date stopDate2 = sleepInfo.getStopDate();
            Long lValueOf4 = stopDate2 != null ? Long.valueOf(stopDate2.getTime()) : null;
            Pair pairH = breathQualityRepo.h(str, jCurrentTimeMillis2, lValueOf4 == null ? System.currentTimeMillis() : lValueOf4.longValue());
            breathQualityDayOdVo.setMinIndex(((Number) pairH.getFirst()).intValue());
            breathQualityDayOdVo.setMaxIndex(((Number) pairH.getSecond()).intValue());
            for (BreathQualityOdInfo breathQualityOdInfo : list) {
                SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
                int timeMinNum = sleepTimeUtil.getTimeMinNum(str, breathQualityOdInfo.getStart());
                int timeMinNum2 = sleepTimeUtil.getTimeMinNum(str, breathQualityOdInfo.getEnd());
                if (timeMinNum - breathQualityDayOdVo.getMinIndex() < 60) {
                    timeMinNum = breathQualityDayOdVo.getMinIndex();
                }
                if (breathQualityDayOdVo.getMaxIndex() - timeMinNum2 < 60) {
                    timeMinNum2 = breathQualityDayOdVo.getMaxIndex();
                }
                int gap = timeMinNum + breathQualityDayOdVo.getGap();
                final Pair pairF = breathQualityRepo.f(breathQualityOdInfo.getTimes(), context);
                ChartData chartData = new ChartData(new BaseIndex(gap, timeMinNum2), breathQualityOdInfo.getTimes());
                chartData.addExtends(new IDataExtendListener() { // from class: com.huami.sleep.repo.a
                    @Override // com.huami.chart.listener.IDataExtendListener
                    public final Object get(BaseIndex baseIndex) {
                        return BreathQualityRepo.i.c(pairF, baseIndex);
                    }
                });
                breathQualityDayOdVo.getChartData().put(chartData.getIndex(), chartData);
                breathQualityDayOdVo.getValueInfoList().put(breathQualityDayOdVo.getValueInfoList().size(), breathQualityOdInfo.getTimes());
                breathQualityDayOdVo.getSelectInfoList().put(breathQualityDayOdVo.getSelectInfoList().size(), TimeUtils.formatTime(context, breathQualityOdInfo.getStart(), true) + " - " + TimeUtils.formatTime(context, breathQualityOdInfo.getEnd(), true) + " " + context.getResources().getQuantityString(R.plurals.times_unit, breathQualityOdInfo.getTimes(), Integer.valueOf(breathQualityOdInfo.getTimes())));
            }
            return breathQualityDayOdVo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "it", "Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<SleepInfo, BreathQualityDayOdVo> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j) {
            super(1);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BreathQualityDayOdVo invoke(@Nullable SleepInfo sleepInfo) {
            BreathQualityDayOdVo breathQualityDayOdVo = new BreathQualityDayOdVo(null, false, null, null, null, 0, 0, 0, null, null, 1023, null);
            long j = this.a;
            breathQualityDayOdVo.setEmpty(true);
            breathQualityDayOdVo.setTimeStr(SleepTimeUtil.INSTANCE.formatTimeYMD(j));
            return breathQualityDayOdVo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ Ref.IntRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Ref.IntRef intRef, Ref.IntRef intRef2) {
            super(0);
            this.a = str;
            this.b = intRef;
            this.c = intRef2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a + "  睡眠起始时间的index： start:" + this.b.element + "   end:" + this.c.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ Ref.IntRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, Ref.IntRef intRef, Ref.IntRef intRef2) {
            super(0);
            this.a = str;
            this.b = intRef;
            this.c = intRef2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a + "  起始时间的整点index： start:" + this.b.element + "   end:" + this.c.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo", f = "BreathQualityRepo.kt", i = {0, 0}, l = {TypedValues.MotionType.TYPE_EASING}, m = "getYearScoreShowInfo", n = {DbUtils.Const.Table.CONTEXT, "from"}, s = {"L$0", "J$0"})
    public static final class m extends ContinuationImpl {
        public Object a;
        public long b;
        public /* synthetic */ Object c;
        public int e;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BreathQualityRepo.this.getYearScoreShowInfo(null, null, 0L, 0L, this);
        }
    }

    public BreathQualityRepo(@NotNull IBreathQualityDataSource iBreathQualityDataSource, @NotNull ISleepDayDataSource iSleepDayDataSource) {
        this.dataSource = iBreathQualityDataSource;
        this.daySleepDataSource = iSleepDayDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseArray<XAxisData> b(Context context, String date, long start, long stop) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Pair<Integer, Integer> pairH = h(date, start, stop);
        int iIntValue = (pairH.getSecond().intValue() - pairH.getFirst().intValue()) / 60;
        if (iIntValue > 0 && iIntValue % 4 == 0) {
            iIntValue /= 4;
        } else if (iIntValue > 0 && iIntValue % 3 == 0) {
            iIntValue /= 3;
        } else if (iIntValue > 0 && iIntValue % 2 == 0) {
            iIntValue /= 2;
        }
        int i2 = iIntValue * 60;
        HMLog.info$default(null, new a(date, i2), 1, null);
        int iIntValue2 = pairH.getFirst().intValue();
        int iIntValue3 = pairH.getSecond().intValue();
        if (i2 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i2 + ".");
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(iIntValue2, iIntValue3, i2);
        if (iIntValue2 <= progressionLastElement) {
            while (true) {
                int i3 = iIntValue2 + i2;
                if (iIntValue2 == pairH.getFirst().intValue()) {
                    sparseArray.put(iIntValue2, new XAxisData(iIntValue2, TimeUtils.formatTime(context, start, true)));
                } else if (iIntValue2 == pairH.getSecond().intValue()) {
                    sparseArray.put(iIntValue2, new XAxisData(iIntValue2, TimeUtils.formatTime(context, stop, true)));
                }
                if (iIntValue2 == progressionLastElement) {
                    break;
                }
                iIntValue2 = i3;
            }
        }
        return sparseArray;
    }

    private final int c(int day) {
        int i2 = (day + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseArray<ChartData> d(Context context, TimeMode timeMode, List<BreathQualityScoreInfo> dataList) {
        Calendar calendar = Calendar.getInstance();
        SparseArray<ChartData> sparseArray = new SparseArray<>();
        for (BreathQualityScoreInfo breathQualityScoreInfo : dataList) {
            calendar.setTimeInMillis(breathQualityScoreInfo.getTimeStamp());
            int i2 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
            int iC = 0;
            if (i2 == 1) {
                boolean zStartsWith$default = kotlin.text.m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null);
                iC = calendar.get(7);
                if (!zStartsWith$default) {
                    iC = c(iC);
                }
            } else if (i2 == 2) {
                iC = calendar.get(5);
            }
            BreathQualityRiskLevel.Companion companion = BreathQualityRiskLevel.INSTANCE;
            final int color = companion.getColor(context, companion.getByCodeValue(breathQualityScoreInfo.getWearHintCode()));
            ChartData chartData = new ChartData(iC, breathQualityScoreInfo.getScore());
            chartData.addExtends(new IDataExtendListener() { // from class: i70
                @Override // com.huami.chart.listener.IDataExtendListener
                public final Object get(BaseIndex baseIndex) {
                    return BreathQualityRepo.e(color, baseIndex);
                }
            });
            Unit unit = Unit.INSTANCE;
            sparseArray.put(iC, chartData);
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMColor e(int i2, BaseIndex baseIndex) {
        return new HMColor(i2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, Integer> f(int i2, Context context) {
        if (i2 >= 0 && i2 <= 4) {
            BreathQualityRiskLevel.Companion companion = BreathQualityRiskLevel.INSTANCE;
            BreathQualityRiskLevel breathQualityRiskLevel = BreathQualityRiskLevel.NORMAL;
            return new Pair<>(Integer.valueOf(companion.getColor(context, breathQualityRiskLevel)), Integer.valueOf(companion.getColor(context, breathQualityRiskLevel)));
        }
        if (5 <= i2 && i2 <= 14) {
            BreathQualityRiskLevel.Companion companion2 = BreathQualityRiskLevel.INSTANCE;
            BreathQualityRiskLevel breathQualityRiskLevel2 = BreathQualityRiskLevel.LOW;
            return new Pair<>(Integer.valueOf(companion2.getColor(context, breathQualityRiskLevel2)), Integer.valueOf(companion2.getColor(context, breathQualityRiskLevel2)));
        }
        if (15 <= i2 && i2 <= 30) {
            BreathQualityRiskLevel.Companion companion3 = BreathQualityRiskLevel.INSTANCE;
            BreathQualityRiskLevel breathQualityRiskLevel3 = BreathQualityRiskLevel.MEDIUM;
            return new Pair<>(Integer.valueOf(companion3.getColor(context, breathQualityRiskLevel3)), Integer.valueOf(companion3.getColor(context, breathQualityRiskLevel3)));
        }
        BreathQualityRiskLevel.Companion companion4 = BreathQualityRiskLevel.INSTANCE;
        BreathQualityRiskLevel breathQualityRiskLevel4 = BreathQualityRiskLevel.HIGH;
        return new Pair<>(Integer.valueOf(companion4.getColor(context, breathQualityRiskLevel4)), Integer.valueOf(companion4.getColor(context, breathQualityRiskLevel4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseArray<SelectInfoVo> g(Context context, List<BreathQualityScoreInfo> dataList) {
        SparseArray<SelectInfoVo> sparseArray = new SparseArray<>();
        int i2 = 0;
        for (Object obj : dataList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            BreathQualityScoreInfo breathQualityScoreInfo = (BreathQualityScoreInfo) obj;
            BreathQualityRiskLevel.Companion companion = BreathQualityRiskLevel.INSTANCE;
            String titleDesc = companion.getTitleDesc(context, companion.getByCodeValue(breathQualityScoreInfo.getWearHintCode()));
            sparseArray.put(i2, new SelectInfoVo(SleepTimeUtil.INSTANCE.formatTimeMD(context, breathQualityScoreInfo.getTimeStamp()) + " " + titleDesc));
            i2 = i3;
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, Integer> h(String date, long start, long stop) {
        Ref.IntRef intRef = new Ref.IntRef();
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        intRef.element = sleepTimeUtil.getTimeMinNum(date, start);
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = sleepTimeUtil.getTimeMinNum(date, stop);
        HMLog.info$default(null, new k(date, intRef, intRef2), 1, null);
        int i2 = intRef.element;
        if (i2 % 60 != 0) {
            intRef.element = (i2 / 60) * 60;
        }
        int i3 = intRef2.element;
        if (i3 % 60 != 0) {
            intRef2.element = ((i3 / 60) + 1) * 60;
        }
        HMLog.info$default(null, new l(date, intRef, intRef2), 1, null);
        return new Pair<>(Integer.valueOf(intRef.element), Integer.valueOf(intRef2.element));
    }

    @Override // com.huami.sleep.repo.IBreathQualityRepo
    @Nullable
    public Object getBreathQualityScoreInfoList(@NotNull String str, long j2, long j3, @NotNull Continuation<? super Flow<? extends List<BreathQualityScoreInfo>>> continuation) {
        return this.dataSource.getScoreAndCost(str, j2, j3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sleep.repo.IBreathQualityRepo
    @Nullable
    public Object getDayOdiScore(@NotNull String str, long j2, @NotNull Continuation<? super Flow<Pair<Integer, Integer>>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object scoreAndCost = bVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar2.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(scoreAndCost);
            IBreathQualityDataSource iBreathQualityDataSource = this.dataSource;
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            long dayStartTime = sleepTimeUtil.getDayStartTime(j2);
            long dayEndTime = sleepTimeUtil.getDayEndTime(j2);
            bVar2.c = 1;
            scoreAndCost = iBreathQualityDataSource.getScoreAndCost(str, dayStartTime, dayEndTime, bVar2);
            if (scoreAndCost == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(scoreAndCost);
        }
        final Flow flow = (Flow) scoreAndCost;
        return FlowKt.flowOn(new Flow<Pair<? extends Integer, ? extends Integer>>() { // from class: com.huami.sleep.repo.BreathQualityRepo$getDayOdiScore$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getDayOdiScore$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends BreathQualityScoreInfo>> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getDayOdiScore$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo$getDayOdiScore$$inlined$map$1$2", f = "BreathQualityRepo.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends BreathQualityScoreInfo> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends BreathQualityScoreInfo> list2 = list;
                        Pair pair = null;
                        if (list2 != null) {
                            if ((Boxing.boxBoolean(list2.isEmpty() ^ true).booleanValue() ? list2 : null) != null) {
                                pair = new Pair(Boxing.boxInt(list2.get(0).getScore()), Boxing.boxInt(list2.get(0).getWearHintCode()));
                            }
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(pair, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Pair<? extends Integer, ? extends Integer>> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sleep.repo.IBreathQualityRepo
    @Nullable
    public Object getDayScoreShowInfo(@NotNull final Context context, @NotNull String str, final long j2, @NotNull Continuation<? super Flow<BreathQualityDayScoreVo>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.e = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object scoreAndCost = cVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar2.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(scoreAndCost);
            IBreathQualityDataSource iBreathQualityDataSource = this.dataSource;
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            long dayStartTime = sleepTimeUtil.getDayStartTime(j2);
            long dayEndTime = sleepTimeUtil.getDayEndTime(j2);
            cVar2.a = context;
            cVar2.b = j2;
            cVar2.e = 1;
            scoreAndCost = iBreathQualityDataSource.getScoreAndCost(str, dayStartTime, dayEndTime, cVar2);
            if (scoreAndCost == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = cVar2.b;
            context = (Context) cVar2.a;
            ResultKt.throwOnFailure(scoreAndCost);
        }
        final Flow flow = (Flow) scoreAndCost;
        return FlowKt.flowOn(new Flow<BreathQualityDayScoreVo>() { // from class: com.huami.sleep.repo.BreathQualityRepo$getDayScoreShowInfo$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getDayScoreShowInfo$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends BreathQualityScoreInfo>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ Context b;
                public final /* synthetic */ long c;

                /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getDayScoreShowInfo$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo$getDayScoreShowInfo$$inlined$map$1$2", f = "BreathQualityRepo.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Context context, long j) {
                    this.a = flowCollector;
                    this.b = context;
                    this.c = j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends BreathQualityScoreInfo> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends BreathQualityScoreInfo> list2 = list;
                        BreathQualityDayScoreVo breathQualityDayScoreVo = new BreathQualityDayScoreVo(null, 0, null, null, 15, null);
                        if (list2 == null || list2.isEmpty()) {
                            BreathQualityRiskLevel.Companion companion = BreathQualityRiskLevel.INSTANCE;
                            breathQualityDayScoreVo.setTitle(companion.getTitleDesc(this.b, null));
                            breathQualityDayScoreVo.setTitleColor(companion.getTitleColor(this.b, null));
                            breathQualityDayScoreVo.setTipStr("");
                        } else {
                            int score = list2.get(0).getScore();
                            HMLog.info$default(null, new BreathQualityRepo.d(this.c, score, list2.get(0).getCost(), this.b), 1, null);
                            BreathQualityRiskLevel.Companion companion2 = BreathQualityRiskLevel.INSTANCE;
                            BreathQualityRiskLevel byCodeValue = companion2.getByCodeValue(list2.get(0).getWearHintCode());
                            breathQualityDayScoreVo.setTitle(companion2.getTitleDesc(this.b, byCodeValue));
                            breathQualityDayScoreVo.setTipStr(companion2.getHintDesc(this.b, byCodeValue, score, Boxing.boxInt(list2.get(0).getWearHintCode())));
                            breathQualityDayScoreVo.setTitleColor(companion2.getTitleColor(this.b, byCodeValue));
                            breathQualityDayScoreVo.setEnumLevel(byCodeValue);
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(breathQualityDayScoreVo, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super BreathQualityDayScoreVo> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, context, j2), continuation2);
                return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }

    @Override // com.huami.sleep.repo.IBreathQualityRepo
    @Nullable
    public Object getLatestScoreInfo(@NotNull String str, @NotNull Continuation<? super Flow<BreathQualityScoreInfo>> continuation) {
        return this.dataSource.getLatestScoreInfo(str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.huami.sleep.repo.IBreathQualityRepo
    @Nullable
    public Object getMWScoreShowInfo(@NotNull Context context, @NotNull String str, @NotNull TimeMode timeMode, long j2, long j3, @NotNull Continuation<? super Flow<BreathQualityWMScoreVo>> continuation) {
        e eVar;
        final Context context2;
        final TimeMode timeMode2;
        final long j4;
        final long j5;
        final BreathQualityRepo breathQualityRepo;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.h = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar2.h;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            IBreathQualityDataSource iBreathQualityDataSource = this.dataSource;
            eVar2.a = this;
            eVar2.b = context;
            eVar2.c = timeMode;
            eVar2.d = j2;
            eVar2.e = j3;
            eVar2.h = 1;
            Object scoreAndCost = iBreathQualityDataSource.getScoreAndCost(str, j2, j3, eVar2);
            if (scoreAndCost == coroutine_suspended) {
                return coroutine_suspended;
            }
            context2 = context;
            obj = scoreAndCost;
            timeMode2 = timeMode;
            j4 = j2;
            j5 = j3;
            breathQualityRepo = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j6 = eVar2.e;
            long j7 = eVar2.d;
            timeMode2 = (TimeMode) eVar2.c;
            context2 = (Context) eVar2.b;
            BreathQualityRepo breathQualityRepo2 = (BreathQualityRepo) eVar2.a;
            ResultKt.throwOnFailure(obj);
            j5 = j6;
            breathQualityRepo = breathQualityRepo2;
            j4 = j7;
        }
        final Flow flow = (Flow) obj;
        return FlowKt.flowOn(new Flow<BreathQualityWMScoreVo>() { // from class: com.huami.sleep.repo.BreathQualityRepo$getMWScoreShowInfo$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getMWScoreShowInfo$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends BreathQualityScoreInfo>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ TimeMode b;
                public final /* synthetic */ Context c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ BreathQualityRepo f;

                /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getMWScoreShowInfo$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo$getMWScoreShowInfo$$inlined$map$1$2", f = "BreathQualityRepo.kt", i = {}, l = {143}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, TimeMode timeMode, Context context, long j, long j2, BreathQualityRepo breathQualityRepo) {
                    this.a = flowCollector;
                    this.b = timeMode;
                    this.c = context;
                    this.d = j;
                    this.e = j2;
                    this.f = breathQualityRepo;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends BreathQualityScoreInfo> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ArrayList arrayList;
                    String timeYM;
                    int actualMaximum;
                    boolean z;
                    boolean z2;
                    boolean z3;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends BreathQualityScoreInfo> list2 = list;
                        BreathQualityRiskLevel breathQualityRiskLevel = null;
                        if (list2 == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj2 : list2) {
                                if (Boxing.boxBoolean(BreathQualityScoreInfoKt.isScoreValid((BreathQualityScoreInfo) obj2)).booleanValue()) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                        BreathQualityWMScoreVo breathQualityWMScoreVo = new BreathQualityWMScoreVo(null, null, null, 0, null, null, null, 0, null, 511, null);
                        TimeMode timeMode = this.b;
                        int[] iArr = BreathQualityRepo.WhenMappings.$EnumSwitchMapping$0;
                        int i3 = iArr[timeMode.ordinal()];
                        if (i3 != 1) {
                            timeYM = i3 != 2 ? "" : SleepTimeUtil.INSTANCE.formatTimeYM(this.d);
                        } else {
                            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
                            timeYM = sleepTimeUtil.formatTimeMD(this.c, this.d) + " - " + sleepTimeUtil.formatTimeMD(this.c, this.e);
                        }
                        breathQualityWMScoreVo.setTimeStr(timeYM);
                        if (!(arrayList == null || arrayList.isEmpty())) {
                            SparseArrayKt.putAll(breathQualityWMScoreVo.getChartData(), this.f.d(this.c, this.b, arrayList));
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(this.d);
                            Date time = calendar.getTime();
                            SparseArrayKt.putAll(breathQualityWMScoreVo.getXAxisData(), ChartXAxisUtil.INSTANCE.getXAxisDataByType(time, this.b));
                            breathQualityWMScoreVo.getYAxisData().put(0, new YAxisData(90.0f));
                            int i4 = iArr[this.b.ordinal()];
                            if (i4 == 1) {
                                actualMaximum = 7;
                            } else if (i4 != 2) {
                                actualMaximum = 0;
                            } else {
                                Calendar calendar2 = Calendar.getInstance();
                                calendar2.setTime(time);
                                Unit unit = Unit.INSTANCE;
                                actualMaximum = calendar2.getActualMaximum(5);
                            }
                            breathQualityWMScoreVo.setMaxIndex(actualMaximum);
                            boolean z4 = arrayList instanceof Collection;
                            if (!z4 || !arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    if (Boxing.boxBoolean(BreathQualityRiskLevel.INSTANCE.getByCodeValue(((BreathQualityScoreInfo) it2.next()).getWearHintCode()) == BreathQualityRiskLevel.HIGH).booleanValue()) {
                                        z = true;
                                        break;
                                    }
                                }
                            } else {
                                z = false;
                                break;
                            }
                            if (z) {
                                breathQualityRiskLevel = BreathQualityRiskLevel.HIGH;
                            } else {
                                if (!z4 || !arrayList.isEmpty()) {
                                    Iterator it3 = arrayList.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z2 = false;
                                            break;
                                        }
                                        if (Boxing.boxBoolean(BreathQualityRiskLevel.INSTANCE.getByCodeValue(((BreathQualityScoreInfo) it3.next()).getWearHintCode()) == BreathQualityRiskLevel.MEDIUM).booleanValue()) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                                if (z2) {
                                    breathQualityRiskLevel = BreathQualityRiskLevel.MEDIUM;
                                } else {
                                    if (!z4 || !arrayList.isEmpty()) {
                                        Iterator it4 = arrayList.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                z3 = false;
                                                break;
                                            }
                                            if (Boxing.boxBoolean(BreathQualityRiskLevel.INSTANCE.getByCodeValue(((BreathQualityScoreInfo) it4.next()).getWearHintCode()) == BreathQualityRiskLevel.LOW).booleanValue()) {
                                                z3 = true;
                                                break;
                                            }
                                        }
                                    } else {
                                        z3 = false;
                                        break;
                                    }
                                    if (z3) {
                                        breathQualityRiskLevel = BreathQualityRiskLevel.LOW;
                                    } else if (!arrayList.isEmpty()) {
                                        breathQualityRiskLevel = BreathQualityRiskLevel.NORMAL;
                                    }
                                }
                            }
                            breathQualityWMScoreVo.setTopRisk(breathQualityRiskLevel);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                if (Boxing.boxBoolean(BreathQualityRiskLevel.INSTANCE.getByCodeValue(((BreathQualityScoreInfo) obj3).getWearHintCode()) == breathQualityWMScoreVo.getTopRisk()).booleanValue()) {
                                    arrayList2.add(obj3);
                                }
                            }
                            breathQualityWMScoreVo.setTopRiskDay(arrayList2.size());
                            SparseArrayKt.putAll(breathQualityWMScoreVo.getSelectInfoList(), this.f.g(this.c, arrayList));
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(breathQualityWMScoreVo, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super BreathQualityWMScoreVo> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, timeMode2, context2, j4, j5, breathQualityRepo), continuation2);
                return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // com.huami.sleep.repo.IBreathQualityRepo
    @FlowPreview
    @ExperimentalCoroutinesApi
    @Nullable
    public <T> Object getOdiInfo(@NotNull String str, long j2, long j3, @NotNull Function2<? super List<BreathQualityOdInfo>, ? super SleepInfo, ? extends T> function2, @Nullable Function1<? super SleepInfo, ? extends T> function1, @NotNull Continuation<? super Flow<? extends T>> continuation) {
        f fVar;
        long j4;
        Function2<? super List<BreathQualityOdInfo>, ? super SleepInfo, ? extends T> function3;
        Function1<? super SleepInfo, ? extends T> function4;
        BreathQualityRepo breathQualityRepo;
        String str2;
        String str3;
        Flow flow;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.j = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object scoreAndCost = fVar2.h;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar2.j;
        if (i3 == 0) {
            ResultKt.throwOnFailure(scoreAndCost);
            String dateString = TimeShowUtilsKt.toDateString(j2);
            Flow flowAsFlow = FlowLiveDataConversions.asFlow(this.daySleepDataSource.getSleepInfo(str, dateString));
            IBreathQualityDataSource iBreathQualityDataSource = this.dataSource;
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            long dayStartTime = sleepTimeUtil.getDayStartTime(j2);
            long dayEndTime = sleepTimeUtil.getDayEndTime(j2);
            fVar2.a = this;
            fVar2.b = str;
            fVar2.c = function2;
            fVar2.d = function1;
            fVar2.e = dateString;
            fVar2.f = flowAsFlow;
            fVar2.g = j3;
            fVar2.j = 1;
            scoreAndCost = iBreathQualityDataSource.getScoreAndCost(str, dayStartTime, dayEndTime, fVar2);
            if (scoreAndCost == coroutine_suspended) {
                return coroutine_suspended;
            }
            j4 = j3;
            function3 = function2;
            function4 = function1;
            breathQualityRepo = this;
            str2 = str;
            str3 = dateString;
            flow = flowAsFlow;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = fVar2.g;
            flow = (Flow) fVar2.f;
            String str4 = (String) fVar2.e;
            Function1<? super SleepInfo, ? extends T> function5 = (Function1) fVar2.d;
            Function2<? super List<BreathQualityOdInfo>, ? super SleepInfo, ? extends T> function6 = (Function2) fVar2.c;
            String str5 = (String) fVar2.b;
            BreathQualityRepo breathQualityRepo2 = (BreathQualityRepo) fVar2.a;
            ResultKt.throwOnFailure(scoreAndCost);
            j4 = j5;
            str3 = str4;
            function4 = function5;
            breathQualityRepo = breathQualityRepo2;
            function3 = function6;
            str2 = str5;
        }
        return FlowKt.flowOn(FlowKt.flatMapConcat(FlowKt.flowCombine(flow, (Flow) scoreAndCost, new g(null)), breathQualityRepo.new AnonymousClass3(str2, j4, function4, function3, str3, null)), Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.huami.sleep.repo.IBreathQualityRepo
    @FlowPreview
    @ExperimentalCoroutinesApi
    @Nullable
    public Object getOdiShowInfo(@NotNull Context context, @NotNull String str, long j2, long j3, @NotNull Continuation<? super Flow<BreathQualityDayOdVo>> continuation) {
        h hVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.c = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        h hVar2 = hVar;
        Object odiInfo = hVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar2.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(odiInfo);
            i iVar = new i(j2, this, context, TimeShowUtilsKt.toDateString(j2));
            j jVar = new j(j2);
            hVar2.c = 1;
            odiInfo = getOdiInfo(str, j2, j3, iVar, jVar, hVar2);
            if (odiInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(odiInfo);
        }
        return FlowKt.flowOn(FlowKt.filterNotNull((Flow) odiInfo), Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sleep.repo.IBreathQualityRepo
    @Nullable
    public Object getYearScoreShowInfo(@NotNull final Context context, @NotNull String str, final long j2, long j3, @NotNull Continuation<? super Flow<BreathQualityYearScoreVo>> continuation) {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.e = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        m mVar2 = mVar;
        Object scoreAndCost = mVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar2.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(scoreAndCost);
            IBreathQualityDataSource iBreathQualityDataSource = this.dataSource;
            mVar2.a = context;
            mVar2.b = j2;
            mVar2.e = 1;
            scoreAndCost = iBreathQualityDataSource.getScoreAndCost(str, j2, j3, mVar2);
            if (scoreAndCost == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = mVar2.b;
            context = (Context) mVar2.a;
            ResultKt.throwOnFailure(scoreAndCost);
        }
        final Flow flow = (Flow) scoreAndCost;
        return FlowKt.flowOn(new Flow<BreathQualityYearScoreVo>() { // from class: com.huami.sleep.repo.BreathQualityRepo$getYearScoreShowInfo$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getYearScoreShowInfo$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends BreathQualityScoreInfo>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ Context b;
                public final /* synthetic */ long c;

                /* JADX INFO: renamed from: com.huami.sleep.repo.BreathQualityRepo$getYearScoreShowInfo$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sleep.repo.BreathQualityRepo$getYearScoreShowInfo$$inlined$map$1$2", f = "BreathQualityRepo.kt", i = {}, l = {144}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Context context, long j) {
                    this.a = flowCollector;
                    this.b = context;
                    this.c = j;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x006f  */
                /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
                /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends BreathQualityScoreInfo> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ArrayList arrayList;
                    int iIntValue;
                    int iIntValue2;
                    int iIntValue3;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends BreathQualityScoreInfo> list2 = list;
                        if (list2 == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj2 : list2) {
                                if (Boxing.boxBoolean(BreathQualityScoreInfoKt.isScoreValid((BreathQualityScoreInfo) obj2)).booleanValue()) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                        BreathQualityYearScoreVo breathQualityYearScoreVo = new BreathQualityYearScoreVo(null, null, 3, null);
                        int iIntValue4 = 0;
                        if (arrayList == null) {
                            iIntValue = 0;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                if (Boxing.boxBoolean(BreathQualityRiskLevel.NORMAL == BreathQualityRiskLevel.INSTANCE.getByCodeValue(((BreathQualityScoreInfo) obj3).getWearHintCode())).booleanValue()) {
                                    arrayList2.add(obj3);
                                }
                            }
                            Integer numBoxInt = Boxing.boxInt(arrayList2.size());
                            if (numBoxInt == null) {
                                iIntValue = 0;
                            } else {
                                iIntValue = numBoxInt.intValue();
                            }
                        }
                        if (arrayList == null) {
                            iIntValue2 = 0;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                if (Boxing.boxBoolean(BreathQualityRiskLevel.LOW == BreathQualityRiskLevel.INSTANCE.getByCodeValue(((BreathQualityScoreInfo) obj4).getWearHintCode())).booleanValue()) {
                                    arrayList3.add(obj4);
                                }
                            }
                            Integer numBoxInt2 = Boxing.boxInt(arrayList3.size());
                            if (numBoxInt2 == null) {
                                iIntValue2 = 0;
                            } else {
                                iIntValue2 = numBoxInt2.intValue();
                            }
                        }
                        if (arrayList == null) {
                            iIntValue3 = 0;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : arrayList) {
                                if (Boxing.boxBoolean(BreathQualityRiskLevel.MEDIUM == BreathQualityRiskLevel.INSTANCE.getByCodeValue(((BreathQualityScoreInfo) obj5).getWearHintCode())).booleanValue()) {
                                    arrayList4.add(obj5);
                                }
                            }
                            Integer numBoxInt3 = Boxing.boxInt(arrayList4.size());
                            if (numBoxInt3 == null) {
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = numBoxInt3.intValue();
                            }
                        }
                        if (arrayList != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj6 : arrayList) {
                                if (Boxing.boxBoolean(BreathQualityRiskLevel.HIGH == BreathQualityRiskLevel.INSTANCE.getByCodeValue(((BreathQualityScoreInfo) obj6).getWearHintCode())).booleanValue()) {
                                    arrayList5.add(obj6);
                                }
                            }
                            Integer numBoxInt4 = Boxing.boxInt(arrayList5.size());
                            if (numBoxInt4 != null) {
                                iIntValue4 = numBoxInt4.intValue();
                            }
                        }
                        ArrayList<SleepPosCircleView.Item> data = breathQualityYearScoreVo.getData();
                        BreathQualityRiskLevel.Companion companion = BreathQualityRiskLevel.INSTANCE;
                        data.add(new SleepPosCircleView.Item(companion.getColor(this.b, BreathQualityRiskLevel.NORMAL), iIntValue));
                        breathQualityYearScoreVo.getData().add(new SleepPosCircleView.Item(companion.getColor(this.b, BreathQualityRiskLevel.LOW), iIntValue2));
                        breathQualityYearScoreVo.getData().add(new SleepPosCircleView.Item(companion.getColor(this.b, BreathQualityRiskLevel.MEDIUM), iIntValue3));
                        breathQualityYearScoreVo.getData().add(new SleepPosCircleView.Item(companion.getColor(this.b, BreathQualityRiskLevel.HIGH), iIntValue4));
                        breathQualityYearScoreVo.setYearStr(SleepTimeUtil.INSTANCE.getYear(this.c));
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(breathQualityYearScoreVo, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super BreathQualityYearScoreVo> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, context, j2), continuation2);
                return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }
}
