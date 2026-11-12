package com.huami.sleep.daysleep.daydetail.viewmodel;

import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.daydetail.processor.DaySleepAnalysisProcessor;
import com.huami.sleep.daysleep.daydetail.processor.SleepCompareProcessor;
import com.huami.sleep.daysleep.daydetail.processor.SleepInfoProcessor;
import com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo;
import com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel.p;
import com.huami.sleep.daysleep.daydetail.vo.SleepCompareModel;
import com.huami.sleep.daysleep.quotient.SleepQuotientParam;
import com.huami.sleep.daysleep.tonality.bean.SleepTonalityBean;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.IDeviceManager;
import com.huami.sleep.sleephome.vo.RightSelectShowInfo;
import com.huami.sleep.statistic.sleepanalysis.vo.SleepAnalysisVo;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@FlowPreview
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 j2\u00020\u0001:\u0001jB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\bh\u0010iJ0\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004J\u0010\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0014\u001a\u00020\nH\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR#\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180 8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R!\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110&8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R5\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00040\u00070 8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R9\u00104\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b000 8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010$R\u001f\u00107\u001a\b\u0012\u0004\u0012\u0002010&8\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R%\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080 8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$R#\u0010>\u001a\b\u0012\u0004\u0012\u0002010 8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010$R#\u0010@\u001a\b\u0012\u0004\u0012\u0002010 8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\"\u001a\u0004\b@\u0010$R\u001f\u0010C\u001a\b\u0012\u0004\u0012\u0002010&8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010(\u001a\u0004\bB\u0010*R\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\bE\u0010*R\u001f\u0010J\u001a\b\u0012\u0004\u0012\u00020G0&8\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010(\u001a\u0004\bI\u0010*R\u001f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00180&8\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010(\u001a\u0004\bL\u0010*R\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0&8\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010(\u001a\u0004\bP\u0010*R\u001f\u0010T\u001a\b\u0012\u0004\u0012\u0002010&8\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010(\u001a\u0004\bS\u0010*R\u001f\u0010W\u001a\b\u0012\u0004\u0012\u0002010&8\u0006@\u0006¢\u0006\f\n\u0004\bU\u0010(\u001a\u0004\bV\u0010*R-\u0010[\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020X\u0018\u00010\u00070&8\u0006@\u0006¢\u0006\f\n\u0004\bY\u0010(\u001a\u0004\bZ\u0010*R\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00180&8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u0010(\u001a\u0004\b]\u0010*R-\u0010a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020X\u0018\u00010\u00070&8\u0006@\u0006¢\u0006\f\n\u0004\b_\u0010(\u001a\u0004\b`\u0010*R#\u0010d\u001a\b\u0012\u0004\u0012\u0002010 8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bb\u0010\"\u001a\u0004\bc\u0010$R\u001f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00180&8\u0006@\u0006¢\u0006\f\n\u0004\be\u0010(\u001a\u0004\bf\u0010*¨\u0006k"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/viewmodel/DaySleepViewModel;", "Landroidx/lifecycle/ViewModel;", "", "baseTime", "", "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", "stageSleepList", "Lkotlin/Pair;", "", "a", "", "getSleepQuatient", "getSleepBreath", "fetchSleepTonalityData", "getSnoreShowInfo", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepCompareModel;", "getmCompareScoreSlplist", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "checkDpCompareShow", "onCleared", "Lcom/huami/sleep/daysleep/daydetail/repo/IDaySleepRepo;", "Lcom/huami/sleep/daysleep/daydetail/repo/IDaySleepRepo;", CommonLanguageSettingFragment.KEY_REPO, "", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "Landroidx/lifecycle/MutableLiveData;", "c", "Lkotlin/Lazy;", "getDayLiveData", "()Landroidx/lifecycle/MutableLiveData;", "dayLiveData", "Landroidx/lifecycle/LiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "getDaySportLiveData", "()Landroidx/lifecycle/LiveData;", "daySportLiveData", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "e", "getSleepQuotient", "sleepQuotient", "Lkotlin/Triple;", "", "f", "getSleepBreathPair", "sleepBreathPair", "g", "getSleepQuotientVis", "sleepQuotientVis", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "h", "getSleepTonalityDataLiveData", "sleepTonalityDataLiveData", "i", "getShowSleepTonality", "showSleepTonality", z.j, "isSnoreShow", hl.k, "getNapSleepShowLiveData", "napSleepShowLiveData", "l", "getNapSleepDuration", "napSleepDuration", "Lcom/huami/sleep/sleephome/vo/RightSelectShowInfo;", "m", "getTitleBarRightShowInfo", "titleBarRightShowInfo", GoogleApiAvailabilityLight.b, "getDeviceDescLiveData", "deviceDescLiveData", "Lcom/huami/sleep/statistic/sleepanalysis/vo/SleepAnalysisVo;", "o", "getSleepAnalysisVoLiveData", "sleepAnalysisVoLiveData", com.google.android.exoplayer2.text.ttml.b.r, "getSleepAnalysisShowLiveData", "sleepAnalysisShowLiveData", DTransferConstants.SEARCH_KEY, "getSlpCompareShow", "slpCompareShow", "Lcom/huami/chart/data/ChartDataList;", "r", "getIntoSlpCompareInfo", "intoSlpCompareInfo", SOAP.XMLNS, "getSlpIntoCompareText", "slpIntoCompareText", "t", "getDpSlpCompareInfo", "dpSlpCompareInfo", "u", "getSlpDpCompareShow", "slpDpCompareShow", "v", "getSlpDpCompareText", "slpDpCompareText", "<init>", "(Lcom/huami/sleep/daysleep/daydetail/repo/IDaySleepRepo;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class DaySleepViewModel extends ViewModel {
    private static final int w = 60;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDaySleepRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String userId = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy dayLiveData = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepInfo> daySportLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepQuotient;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepBreathPair;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> sleepQuotientVis;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepTonalityDataLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy showSleepTonality;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy isSnoreShow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> napSleepShowLiveData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> napSleepDuration;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<RightSelectShowInfo> titleBarRightShowInfo;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> deviceDescLiveData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepAnalysisVo> sleepAnalysisVoLiveData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> sleepAnalysisShowLiveData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> slpCompareShow;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Integer, ChartDataList>> intoSlpCompareInfo;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> slpIntoCompareText;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Integer, ChartDataList>> dpSlpCompareInfo;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy slpDpCompareShow;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> slpDpCompareText;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<String>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$deviceDescLiveData$1$1", f = "DaySleepViewModel.kt", i = {0, 0}, l = {351, 362}, m = "invokeSuspend", n = {"$this$liveData", "sleepInfo"}, s = {"L$0", "L$2"})
    public static final class b extends SuspendLambda implements Function2<LiveDataScope<String>, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        private /* synthetic */ Object d;
        public final /* synthetic */ SleepInfo e;
        public final /* synthetic */ DaySleepViewModel f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SleepInfo sleepInfo, DaySleepViewModel daySleepViewModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.e = sleepInfo;
            this.f = daySleepViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<String> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.e, this.f, continuation);
            bVar.d = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00a5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            SleepInfo sleepInfo;
            SleepInfo sleepInfo2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            String string = "";
            if (i != 0) {
                if (i == 1) {
                    sleepInfo = (SleepInfo) this.b;
                    sleepInfo2 = (SleepInfo) this.a;
                    liveDataScope = (LiveDataScope) this.d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.d;
            sleepInfo = this.e;
            if (sleepInfo != null) {
                DaySleepViewModel daySleepViewModel = this.f;
                IDeviceManager deviceManager = KoinExtKt.getDeviceManager();
                String userId = daySleepViewModel.getUserId();
                String value = daySleepViewModel.getDayLiveData().getValue();
                this.d = liveDataScope;
                this.a = sleepInfo;
                this.b = sleepInfo;
                this.c = 1;
                obj = deviceManager.getMainDeviceDesc(userId, value, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sleepInfo2 = sleepInfo;
            }
            this.d = null;
            this.a = null;
            this.b = null;
            this.c = 2;
            if (liveDataScope.emit(string, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            String str = (String) obj;
            if (sleepInfo.getHasSleep() || SleepInfoProcessor.INSTANCE.getNapSleepDuration(sleepInfo2) > 0) {
                string = (!sleepInfo.getHasSleep() || sleepInfo.hasNormalSleep()) ? KoinExtKt.getAppContext().getString(R.string.current_select_source, str) : KoinExtKt.getAppContext().getString(R.string.sleep_source_manual);
            }
            this.d = null;
            this.a = null;
            this.b = null;
            this.c = 2;
            if (liveDataScope.emit(string, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchIntoSleepList awakeTimeIndex = " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, int i) {
            super(0);
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchIntoSleepList intoSleep = " + this.a + " - index = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<StageSleep> a;
        public final /* synthetic */ StageSleep b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.ObjectRef<StageSleep> objectRef, StageSleep stageSleep) {
            super(0);
            this.a = objectRef;
            this.b = stageSleep;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchIntoSleepList preStageSleep.start = " + this.a.element.start + " - stageSleep.start = " + this.b.start;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, int i) {
            super(0);
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchIntoSleepList intoSleep = " + this.a + " - index = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$fetchSleepTonalityData$1", f = "DaySleepViewModel.kt", i = {}, l = {211, 220}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

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
                return "fetchSleepTonalityData daySportLiveData is null or no sleep data";
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
                return "fetchSleepTonalityData dayLiveData is null or empty";
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
                return "fetchSleepTonalityData sleepStartTimeLong is -1 invalid";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ long b;
            public final /* synthetic */ Ref.LongRef c;
            public final /* synthetic */ int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, long j, Ref.LongRef longRef, int i) {
                super(0);
                this.a = str;
                this.b = j;
                this.c = longRef;
                this.d = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "fetchSleepTonalityData curSelectDate=" + this.a + " - curSelectTime=" + this.b + " - sleepStartTimeLong=" + this.c.element + " - intoSleepCount=" + this.d;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "sleepTonalityBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$fetchSleepTonalityData$1$7", f = "DaySleepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Function2<SleepTonalityBean, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ DaySleepViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(DaySleepViewModel daySleepViewModel, Continuation<? super e> continuation) {
                super(2, continuation);
                this.c = daySleepViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable SleepTonalityBean sleepTonalityBean, @Nullable Continuation<? super Unit> continuation) {
                return ((e) create(sleepTonalityBean, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                e eVar = new e(this.c, continuation);
                eVar.b = obj;
                return eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SleepTonalityBean sleepTonalityBean = (SleepTonalityBean) this.b;
                boolean z = false;
                if (sleepTonalityBean != null && sleepTonalityBean.getRelaxChartDataList() != null && sleepTonalityBean.getRelaxChartDataList().getCount() > 0) {
                    z = true;
                }
                this.c.getShowSleepTonality().setValue(Boxing.boxBoolean(z));
                if (z) {
                    this.c.getSleepTonalityDataLiveData().setValue(sleepTonalityBean);
                }
                return Unit.INSTANCE;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DaySleepViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            long j;
            int i2;
            Object objFetchSleepTonalityData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i3 = this.a;
            if (i3 != 0) {
                if (i3 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objFetchSleepTonalityData = obj;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SleepInfo value = DaySleepViewModel.this.getDaySportLiveData().getValue();
            if (value == null || (!value.getHasSleep() && value.getOddStageSleep().isEmpty())) {
                HMLog.info("DaySleepViewModel", a.a);
                DaySleepViewModel.this.getShowSleepTonality().setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            String value2 = DaySleepViewModel.this.getDayLiveData().getValue();
            if (value2 == null || value2.length() == 0) {
                HMLog.info("DaySleepViewModel", b.a);
                DaySleepViewModel.this.getShowSleepTonality().setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            boolean zIsToday = SportDay.fromString(value2).isToday();
            long stringToLong = TimeUtils.parseStringToLong("yyyy-MM-dd", value2);
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = -1L;
            ArrayList arrayList = new ArrayList();
            if (value.getHasSleep()) {
                int intoSleepCount = value.getIntoSleepCount();
                longRef.element = value.getStartDate().getTime();
                long time = value.getStopDate().getTime();
                Pair pairA = DaySleepViewModel.this.a(stringToLong, value.getStageSleep());
                int iIntValue = ((Number) pairA.getFirst()).intValue();
                arrayList.addAll((Collection) pairA.getSecond());
                j = time;
                i2 = intoSleepCount;
                i = iIntValue;
            } else {
                StageSleep stageSleep = (StageSleep) CollectionsKt.firstOrNull((List) value.getOddStageSleep());
                if (stageSleep != null) {
                    longRef.element = ChartTransmitUtil.INSTANCE.transmitIndexToDateTime(stageSleep.start, stringToLong);
                }
                StageSleep stageSleep2 = (StageSleep) CollectionsKt.lastOrNull((List) value.getOddStageSleep());
                long jTransmitIndexToDateTime = stageSleep2 == null ? -1L : ChartTransmitUtil.INSTANCE.transmitIndexToDateTime(stageSleep2.stop, stringToLong);
                Pair pairA2 = DaySleepViewModel.this.a(stringToLong, value.getOddStageSleep());
                int iIntValue2 = ((Number) pairA2.getFirst()).intValue();
                arrayList.addAll((Collection) pairA2.getSecond());
                i = iIntValue2;
                j = jTransmitIndexToDateTime;
                i2 = 10;
            }
            if (longRef.element == -1) {
                HMLog.info("DaySleepViewModel", c.a);
                DaySleepViewModel.this.getShowSleepTonality().setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            HMLog.info("DaySleepViewModel", new d(value2, stringToLong, longRef, i2));
            IDaySleepRepo iDaySleepRepo = DaySleepViewModel.this.repo;
            long j2 = longRef.element;
            boolean hasSleep = value.getHasSleep();
            this.a = 1;
            objFetchSleepTonalityData = iDaySleepRepo.fetchSleepTonalityData(stringToLong, j2, j, i2, hasSleep, arrayList, zIsToday, i, this);
            if (objFetchSleepTonalityData == coroutine_suspended) {
                return coroutine_suspended;
            }
            e eVar = new e(DaySleepViewModel.this, null);
            this.a = 2;
            if (FlowKt.collectLatest((Flow) objFetchSleepTonalityData, eVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$getSleepBreath$1", f = "DaySleepViewModel.kt", i = {}, l = {77, 77}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Triple;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$getSleepBreath$1$1", f = "DaySleepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Triple<? extends Boolean, ? extends Integer, ? extends Integer>, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ DaySleepViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DaySleepViewModel daySleepViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = daySleepViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Triple<Boolean, Integer, Integer> triple, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(triple, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.getSleepBreathPair().postValue((Triple) this.b);
                return Unit.INSTANCE;
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DaySleepViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            IDaySleepRepo iDaySleepRepo = DaySleepViewModel.this.repo;
            String userId = DaySleepViewModel.this.getUserId();
            String value = DaySleepViewModel.this.getDayLiveData().getValue();
            this.a = 1;
            obj = iDaySleepRepo.getSleepBreath(userId, value, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            a aVar = new a(DaySleepViewModel.this, null);
            this.a = 2;
            if (FlowKt.collectLatest((Flow) obj, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$getSleepQuatient$1", f = "DaySleepViewModel.kt", i = {}, l = {62, 62}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$getSleepQuatient$1$1", f = "DaySleepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends List<? extends SleepQuotientParam>>, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ DaySleepViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DaySleepViewModel daySleepViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = daySleepViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Pair<Integer, ? extends List<SleepQuotientParam>> pair, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.getSleepQuotient().postValue((Pair) this.b);
                return Unit.INSTANCE;
            }
        }

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DaySleepViewModel.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            IDaySleepRepo iDaySleepRepo = DaySleepViewModel.this.repo;
            String userId = DaySleepViewModel.this.getUserId();
            String value = DaySleepViewModel.this.getDayLiveData().getValue();
            this.a = 1;
            obj = iDaySleepRepo.getSleepQuotient(userId, value, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            a aVar = new a(DaySleepViewModel.this, null);
            this.a = 2;
            if (FlowKt.collectLatest((Flow) obj, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Triple;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<MutableLiveData<Triple<? extends Boolean, ? extends Integer, ? extends Integer>>> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Triple<Boolean, Integer, Integer>> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<MutableLiveData<Pair<? extends Integer, ? extends List<? extends SleepQuotientParam>>>> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Pair<Integer, List<SleepQuotientParam>>> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<MutableLiveData<SleepTonalityBean>> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<SleepTonalityBean> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lcom/huami/sleep/sleephome/vo/RightSelectShowInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$titleBarRightShowInfo$1$1", f = "DaySleepViewModel.kt", i = {}, l = {334, AMapEngineUtils.ARROW_LINE_SHADOW_TEXTURE_ID}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<LiveDataScope<RightSelectShowInfo>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ SleepInfo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(SleepInfo sleepInfo, Continuation<? super p> continuation) {
            super(2, continuation);
            this.d = sleepInfo;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<RightSelectShowInfo> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            p pVar = DaySleepViewModel.this.new p(this.d, continuation);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.b;
            SleepInfoProcessor sleepInfoProcessor = SleepInfoProcessor.INSTANCE;
            String userId = DaySleepViewModel.this.getUserId();
            String value = DaySleepViewModel.this.getDayLiveData().getValue();
            SleepInfo sleepInfo = this.d;
            this.b = liveDataScope;
            this.a = 1;
            obj = sleepInfoProcessor.getTitleBarRightShowDetail(userId, value, sleepInfo, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.b = null;
            this.a = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public DaySleepViewModel(@NotNull IDaySleepRepo iDaySleepRepo) {
        this.repo = iDaySleepRepo;
        LiveData<SleepInfo> liveDataSwitchMap = Transformations.switchMap(getDayLiveData(), new Function<String, LiveData<SleepInfo>>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<SleepInfo> apply(String str) {
                return this.a.repo.getSleepData(this.a.getUserId(), str);
            }
        });
        this.daySportLiveData = liveDataSwitchMap;
        this.sleepQuotient = LazyKt__LazyJVMKt.lazy(m.a);
        this.sleepBreathPair = LazyKt__LazyJVMKt.lazy(l.a);
        this.sleepQuotientVis = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Boolean>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepInfo sleepInfo) {
                SleepInfo sleepInfo2 = sleepInfo;
                boolean z = false;
                if (sleepInfo2 != null && sleepInfo2.getNonRemCount() + sleepInfo2.getRemCount() + sleepInfo2.getDreamTime() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        this.sleepTonalityDataLiveData = LazyKt__LazyJVMKt.lazy(n.a);
        this.showSleepTonality = LazyKt__LazyJVMKt.lazy(k.a);
        this.isSnoreShow = LazyKt__LazyJVMKt.lazy(j.a);
        this.napSleepShowLiveData = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Boolean>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepInfo sleepInfo) {
                return Boolean.valueOf(SleepInfoProcessor.INSTANCE.hasNapSleep(sleepInfo));
            }
        });
        this.napSleepDuration = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Integer>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final Integer apply(SleepInfo sleepInfo) {
                return Integer.valueOf(SleepInfoProcessor.INSTANCE.getNapSleepDuration(sleepInfo));
            }
        });
        this.titleBarRightShowInfo = Transformations.switchMap(liveDataSwitchMap, new Function<SleepInfo, LiveData<RightSelectShowInfo>>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$switchMap$2
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<RightSelectShowInfo> apply(SleepInfo sleepInfo) {
                return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, this.a.new p(sleepInfo, null), 2, (Object) null);
            }
        });
        this.deviceDescLiveData = Transformations.switchMap(liveDataSwitchMap, new Function<SleepInfo, LiveData<String>>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$switchMap$3
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<String> apply(SleepInfo sleepInfo) {
                return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new DaySleepViewModel.b(sleepInfo, this.a, null), 3, (Object) null);
            }
        });
        LiveData<SleepAnalysisVo> map = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, SleepAnalysisVo>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$4
            @Override // androidx.arch.core.util.Function
            public final SleepAnalysisVo apply(SleepInfo sleepInfo) {
                return DaySleepAnalysisProcessor.INSTANCE.getDaySleepAnalysis(KoinExtKt.getAppContext(), sleepInfo);
            }
        });
        this.sleepAnalysisVoLiveData = map;
        this.sleepAnalysisShowLiveData = Transformations.map(map, new Function<SleepAnalysisVo, Boolean>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$5
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepAnalysisVo sleepAnalysisVo) {
                return Boolean.valueOf(!TextUtils.isEmpty(sleepAnalysisVo.getMainTitle()) && KoinExtKt.getAppFunctions().getSmartAnalysis("slp"));
            }
        });
        this.slpCompareShow = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Boolean>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$6
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepInfo sleepInfo) {
                SleepInfo sleepInfo2 = sleepInfo;
                boolean z = false;
                if (sleepInfo2 != null && sleepInfo2.getSleepCount() > 0) {
                    List<SleepCompareModel> list = this.a.repo.getmCompareIntoSlplist();
                    if (!(list == null || list.isEmpty())) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        this.intoSlpCompareInfo = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Pair<? extends Integer, ? extends ChartDataList>>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$7
            @Override // androidx.arch.core.util.Function
            public final Pair<? extends Integer, ? extends ChartDataList> apply(SleepInfo sleepInfo) {
                return SleepCompareProcessor.INSTANCE.getIntoSlpData(this.a.getDayLiveData().getValue(), sleepInfo, this.a.repo.getmCompareIntoSlplist());
            }
        });
        this.slpIntoCompareText = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, String>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$8
            @Override // androidx.arch.core.util.Function
            public final String apply(SleepInfo sleepInfo) {
                return SleepCompareProcessor.INSTANCE.getIntoSlpComparePer(this.a.getDayLiveData().getValue(), sleepInfo, this.a.repo.getmCompareIntoSlplist());
            }
        });
        this.dpSlpCompareInfo = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Pair<? extends Integer, ? extends ChartDataList>>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$9
            @Override // androidx.arch.core.util.Function
            public final Pair<? extends Integer, ? extends ChartDataList> apply(SleepInfo sleepInfo) {
                return SleepCompareProcessor.INSTANCE.getSleepDpCompareInfo(sleepInfo, this.a.repo.getmCompareDpSlplist());
            }
        });
        this.slpDpCompareShow = LazyKt__LazyJVMKt.lazy(o.a);
        this.slpDpCompareText = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, String>() { // from class: com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel$special$$inlined$map$10
            @Override // androidx.arch.core.util.Function
            public final String apply(SleepInfo sleepInfo) {
                return SleepCompareProcessor.INSTANCE.getSlpDpCompareText(sleepInfo, this.a.repo.getmCompareDpSlplist());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, com.xiaomi.hm.health.dataprocess.StageSleep] */
    public final Pair<Integer, List<Long>> a(long baseTime, List<? extends StageSleep> stageSleepList) {
        int i2;
        Ref.IntRef intRef = new Ref.IntRef();
        StageSleep stageSleep = (StageSleep) CollectionsKt.lastOrNull((List) stageSleepList);
        intRef.element = stageSleep == null ? 0 : stageSleep.stop;
        HMLog.info("DaySleepViewModel", new c(intRef));
        ArrayList arrayList = new ArrayList();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int i3 = 0;
        boolean z = false;
        for (Object obj : stageSleepList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ?? r10 = (StageSleep) obj;
            if (i3 == 0) {
                long jTransmitIndexToDateTime = ChartTransmitUtil.INSTANCE.transmitIndexToDateTime(r10.start, baseTime);
                HMLog.info("DaySleepViewModel", new d(jTransmitIndexToDateTime, i3));
                arrayList.add(Long.valueOf(jTransmitIndexToDateTime));
            }
            T t = objectRef.element;
            if (t != 0 && Math.abs(((StageSleep) t).stop - r10.start) > 60) {
                HMLog.info("DaySleepViewModel", new e(objectRef, r10));
                z = true;
            }
            if (z && ((i2 = r10.mode) == 8 || i2 == 5 || i2 == 4)) {
                long jTransmitIndexToDateTime2 = ChartTransmitUtil.INSTANCE.transmitIndexToDateTime(r10.start, baseTime);
                HMLog.info("DaySleepViewModel", new f(jTransmitIndexToDateTime2, i3));
                arrayList.add(Long.valueOf(jTransmitIndexToDateTime2));
                z = false;
            }
            if (r10.mode == 7) {
                z = true;
            }
            objectRef.element = r10;
            i3 = i4;
        }
        return new Pair<>(Integer.valueOf(intRef.element), arrayList);
    }

    public final void checkDpCompareShow(@Nullable SleepInfo sleepInfo) {
        getSlpDpCompareShow().setValue(Boolean.valueOf((sleepInfo == null ? 0 : sleepInfo.getNonRemCount()) > 0));
    }

    public final void fetchSleepTonalityData() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<String> getDayLiveData() {
        return (MutableLiveData) this.dayLiveData.getValue();
    }

    @NotNull
    public final LiveData<SleepInfo> getDaySportLiveData() {
        return this.daySportLiveData;
    }

    @NotNull
    public final LiveData<String> getDeviceDescLiveData() {
        return this.deviceDescLiveData;
    }

    @NotNull
    public final LiveData<Pair<Integer, ChartDataList>> getDpSlpCompareInfo() {
        return this.dpSlpCompareInfo;
    }

    @NotNull
    public final LiveData<Pair<Integer, ChartDataList>> getIntoSlpCompareInfo() {
        return this.intoSlpCompareInfo;
    }

    @NotNull
    public final LiveData<Integer> getNapSleepDuration() {
        return this.napSleepDuration;
    }

    @NotNull
    public final LiveData<Boolean> getNapSleepShowLiveData() {
        return this.napSleepShowLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowSleepTonality() {
        return (MutableLiveData) this.showSleepTonality.getValue();
    }

    @NotNull
    public final LiveData<Boolean> getSleepAnalysisShowLiveData() {
        return this.sleepAnalysisShowLiveData;
    }

    @NotNull
    public final LiveData<SleepAnalysisVo> getSleepAnalysisVoLiveData() {
        return this.sleepAnalysisVoLiveData;
    }

    public final void getSleepBreath() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new h(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Triple<Boolean, Integer, Integer>> getSleepBreathPair() {
        return (MutableLiveData) this.sleepBreathPair.getValue();
    }

    public final void getSleepQuatient() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new i(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, List<SleepQuotientParam>>> getSleepQuotient() {
        return (MutableLiveData) this.sleepQuotient.getValue();
    }

    @NotNull
    public final LiveData<Boolean> getSleepQuotientVis() {
        return this.sleepQuotientVis;
    }

    @NotNull
    public final MutableLiveData<SleepTonalityBean> getSleepTonalityDataLiveData() {
        return (MutableLiveData) this.sleepTonalityDataLiveData.getValue();
    }

    @NotNull
    public final LiveData<Boolean> getSlpCompareShow() {
        return this.slpCompareShow;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSlpDpCompareShow() {
        return (MutableLiveData) this.slpDpCompareShow.getValue();
    }

    @NotNull
    public final LiveData<String> getSlpDpCompareText() {
        return this.slpDpCompareText;
    }

    @NotNull
    public final LiveData<String> getSlpIntoCompareText() {
        return this.slpIntoCompareText;
    }

    public final void getSnoreShowInfo() {
        isSnoreShow().setValue(Boolean.valueOf(this.repo.isSnoreShow()));
    }

    @NotNull
    public final LiveData<RightSelectShowInfo> getTitleBarRightShowInfo() {
        return this.titleBarRightShowInfo;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final List<SleepCompareModel> getmCompareScoreSlplist() {
        return this.repo.getmCompareScoreSlplist();
    }

    @NotNull
    public final MutableLiveData<Boolean> isSnoreShow() {
        return (MutableLiveData) this.isSnoreShow.getValue();
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        this.repo.clear(getDayLiveData().getValue());
        super.onCleared();
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }
}
