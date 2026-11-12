package com.huami.sky.ui.play;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.assist.ISkyDeviceStatusAssistant;
import com.huami.sky.lib.assist.SkyDeviceStatus;
import com.huami.sky.lib.cache.SkyPlayCache;
import com.huami.sky.lib.entity.AssetInfo;
import com.huami.sky.lib.entity.SkyPromotionExtensions;
import com.huami.sky.lib.entity.SkyPromotionInfo;
import com.huami.sky.lib.repo.SkyPromotionRepo;
import com.huami.sky.service.SkyUpdateShowInfo;
import com.huami.sky.ui.koin.SkyServiceKoinScopeKt;
import com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 t2\u00020\u0001:\u0001tB/\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010<\u001a\u00020:¢\u0006\u0004\br\u0010sJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0002J\u0006\u0010\u001e\u001a\u00020\u0006J\u0010\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u000bJ\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0006J\u0006\u0010%\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u000bJ\u0010\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020(J\b\u0010+\u001a\u0004\u0018\u00010(R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u001d\u0010@\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b0\u0010?R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010BR\u001f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040D8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00150I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150M8\u0006@\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000b0I8\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010UR\u001f\u0010]\u001a\b\u0012\u0004\u0012\u00020X0W8\u0006@\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00040I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010KR\u001f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00040M8\u0006@\u0006¢\u0006\f\n\u0004\bd\u0010O\u001a\u0004\be\u0010QR\u0016\u0010i\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0006@\u0006¢\u0006\f\n\u0004\bj\u0010Z\u001a\u0004\bk\u0010\\R\u001c\u0010n\u001a\b\u0012\u0004\u0012\u00020\u000e0I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010KR\u001f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000e0M8\u0006@\u0006¢\u0006\f\n\u0004\bo\u0010O\u001a\u0004\bp\u0010Q¨\u0006u"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayViewModel;", "Landroidx/lifecycle/ViewModel;", "", "h", "", "f", "", "c", "g", "e", "a", "", "isAlarmClockVisible", "isSupportSkyFeature", "Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "getDeviceConnectStatus", "observeDeviceConnectStatus", "loadDeviceStatusTips", "deviceStatusTipsShow", "updateDeviceStatusTipsShow", "getFeatureUpdateTips", "Lcom/huami/sky/lib/entity/SkyPromotionInfo;", "promotionInfo", "saveSkyUpdateIndo", "shouldShowNextSevenDaysTip", "shouldShowSevenDaysTip", "shouldShowSevenDayIcon", "getWeekPlanProgress", "showToday", "setWeekPlanShowToday", "clearWeekPlanCloseCount", "count", "setWeekPlanNeverShowCount", "clearWeekPlanNeverShowCount", SkyPlayViewModel.v, "closeWeekPlanTips", "updateWeekPlanStartDate", "openNextWeekPlan", "autoShow", "showWeekPlanTips", "Ljava/util/Date;", "playDate", "weekPlayDone", "weekPlanEndDate", "Lcom/huami/sky/lib/api/DeviceDataApi;", "Lcom/huami/sky/lib/api/DeviceDataApi;", "deviceApi", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "b", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "deviceStatusAssist", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "serviceHelper", "Lcom/huami/sky/lib/repo/SkyPromotionRepo;", GoogleApiAvailabilityLight.a, "Lcom/huami/sky/lib/repo/SkyPromotionRepo;", "promotionRepo", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;", "weekPlanDataSource", "Lcom/huami/sky/ui/play/SkyPlayContinuousManager;", "Lkotlin/Lazy;", "()Lcom/huami/sky/ui/play/SkyPlayContinuousManager;", "playContinuousManager", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_deviceStateTipsChangeFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "getDeviceStateTipsChangeFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "deviceStateTipsChangeFlow", "Landroidx/lifecycle/MutableLiveData;", "i", "Landroidx/lifecycle/MutableLiveData;", "_featureUpdateTipsLiveData", "Landroidx/lifecycle/LiveData;", z.j, "Landroidx/lifecycle/LiveData;", "getFeatureUpdateTipsLiveData", "()Landroidx/lifecycle/LiveData;", "featureUpdateTipsLiveData", hl.k, "getGuideUseClick", "()Landroidx/lifecycle/MutableLiveData;", "guideUseClick", "Lkotlinx/coroutines/flow/StateFlow;", "", "l", "Lkotlinx/coroutines/flow/StateFlow;", "getEventSessionId", "()Lkotlinx/coroutines/flow/StateFlow;", "eventSessionId", "Lkotlinx/coroutines/Job;", "m", "Lkotlinx/coroutines/Job;", "countDownJob", GoogleApiAvailabilityLight.b, "_weekPlanCloseLiveData", "o", "getWeekPlanCloseLiveData", "weekPlanCloseLiveData", com.google.android.exoplayer2.text.ttml.b.r, LogUtil.I, "weekPlanAutoShow", DTransferConstants.SEARCH_KEY, "getPlayPlanDoneFlow", "playPlanDoneFlow", "r", "_deviceStatusLiveData", SOAP.XMLNS, "getDeviceStatusLiveData", "deviceStatusLiveData", "<init>", "(Lcom/huami/sky/lib/api/DeviceDataApi;Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;Lcom/huami/sky/ui/play/SkyPlayServiceHelper;Lcom/huami/sky/lib/repo/SkyPromotionRepo;Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayViewModel extends ViewModel {
    private static final int A = 1;
    private static final int B = 2;

    @NotNull
    private static final String t = "weekPlanShowToday";

    @NotNull
    private static final String u = "weekPlanCloseCount";

    @NotNull
    private static final String v = "weekPlanNeverShow";

    @NotNull
    private static final String w = "weekPlanNeverShowCount";
    private static final int x = 3;
    private static final int y = 10;
    private static final long z = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceDataApi deviceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ISkyDeviceStatusAssistant deviceStatusAssist;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SkyPlayServiceHelper serviceHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SkyPromotionRepo promotionRepo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final WeekPlanDataSource weekPlanDataSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy playContinuousManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<Integer> _deviceStateTipsChangeFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<Integer> deviceStateTipsChangeFlow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SkyPromotionInfo> _featureUpdateTipsLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SkyPromotionInfo> featureUpdateTipsLiveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> guideUseClick;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<String> eventSessionId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Job countDownJob;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> _weekPlanCloseLiveData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> weekPlanCloseLiveData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int weekPlanAutoShow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<Long> playPlanDoneFlow;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SkyDeviceStatus> _deviceStatusLiveData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SkyDeviceStatus> deviceStatusLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayViewModel$getFeatureUpdateTips$1", f = "SkyPlayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayViewModel.this.new a(continuation);
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
            SkyPromotionInfo featureUpdateTips = SkyPlayViewModel.this.promotionRepo.getFeatureUpdateTips();
            if (featureUpdateTips != null) {
                SkyPlayViewModel.this._featureUpdateTipsLiveData.postValue(featureUpdateTips);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayViewModel$saveSkyUpdateIndo$1", f = "SkyPlayViewModel.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SkyPromotionInfo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SkyPromotionInfo skyPromotionInfo, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = skyPromotionInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AssetInfo assets;
            String label;
            AssetInfo assets2;
            String createAt;
            Long longOrNull;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SkyPromotionRepo skyPromotionRepo = SkyPlayViewModel.this.promotionRepo;
                SkyPromotionExtensions extensions = this.c.getExtensions();
                long jLongValue = -1;
                if (extensions != null && (assets2 = extensions.getAssets()) != null && (createAt = assets2.getCreateAt()) != null && (longOrNull = l.toLongOrNull(createAt)) != null) {
                    jLongValue = longOrNull.longValue();
                }
                SkyPromotionExtensions extensions2 = this.c.getExtensions();
                String str = "";
                if (extensions2 != null && (assets = extensions2.getAssets()) != null && (label = assets.getLabel()) != null) {
                    str = label;
                }
                SkyUpdateShowInfo skyUpdateShowInfo = new SkyUpdateShowInfo(jLongValue, str);
                this.a = 1;
                if (skyPromotionRepo.saveSkyUpdateShowInfo(skyUpdateShowInfo, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "是否自动弹出7天打卡下一轮提示横幅: " + (!TimeUtils.isToday(SkyPlayViewModel.this.h())) + ",  " + SkyPlayViewModel.this.g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "是否自动弹出7天打卡提示横幅: " + SkyPlayViewModel.this.f() + ",  " + SkyPlayViewModel.this.g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayViewModel$startAutoCloseCountDown$1", f = "SkyPlayViewModel.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(10000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SkyPlayViewModel.this._weekPlanCloseLiveData.postValue(Boxing.boxInt(1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayViewModel$loadDeviceStatusTips$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayViewModel$loadDeviceStatusTips$1", f = "SkyPlayViewModel.kt", i = {}, l = {399}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Long> playStartTimeFlow = SkyPlayViewModel.this.serviceHelper.getPlayStartTimeFlow();
                SkyPlayViewModel$loadDeviceStatusTips$1$invokeSuspend$$inlined$collect$1 skyPlayViewModel$loadDeviceStatusTips$1$invokeSuspend$$inlined$collect$1 = new SkyPlayViewModel$loadDeviceStatusTips$1$invokeSuspend$$inlined$collect$1(SkyPlayViewModel.this);
                this.a = 1;
                if (playStartTimeFlow.collect(skyPlayViewModel$loadDeviceStatusTips$1$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayViewModel$observeDeviceConnectStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayViewModel$observeDeviceConnectStatus$1", f = "SkyPlayViewModel.kt", i = {}, l = {399}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.sky.ui.play.SkyPlayViewModel$observeDeviceConnectStatus$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SkyDeviceStatus a;
            public final /* synthetic */ SkyDeviceStatus b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SkyDeviceStatus skyDeviceStatus, SkyDeviceStatus skyDeviceStatus2) {
                super(0);
                this.a = skyDeviceStatus;
                this.b = skyDeviceStatus2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                SkyDeviceStatus skyDeviceStatus;
                SkyDeviceStatus skyDeviceStatus2 = this.a;
                SkyDeviceStatus skyDeviceStatus3 = this.b;
                return "设备状态变化333：" + skyDeviceStatus2 + ", " + skyDeviceStatus3 + ", " + (skyDeviceStatus2 != skyDeviceStatus3 && (skyDeviceStatus2 == (skyDeviceStatus = SkyDeviceStatus.CONNECT_SUCCESS) || skyDeviceStatus3 == skyDeviceStatus));
            }
        }

        public C15401(Continuation<? super C15401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayViewModel.this.new C15401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<SkyDeviceStatus> flowDeviceConnectNotifiers = SkyPlayViewModel.this.deviceStatusAssist.deviceConnectNotifiers();
                final SkyPlayViewModel skyPlayViewModel = SkyPlayViewModel.this;
                FlowCollector<SkyDeviceStatus> flowCollector = new FlowCollector<SkyDeviceStatus>() { // from class: com.huami.sky.ui.play.SkyPlayViewModel$observeDeviceConnectStatus$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(SkyDeviceStatus skyDeviceStatus, @NotNull Continuation<? super Unit> continuation) {
                        SkyDeviceStatus skyDeviceStatus2;
                        SkyDeviceStatus skyDeviceStatus3 = skyDeviceStatus;
                        SkyDeviceStatus value = skyPlayViewModel.getDeviceStatusLiveData().getValue();
                        HMLog.info("SkyPlayViewModel", new SkyPlayViewModel.C15401.a(value, skyDeviceStatus3));
                        if (value == null) {
                            skyPlayViewModel._deviceStatusLiveData.postValue(skyDeviceStatus3);
                        } else if (value != skyDeviceStatus3 && (value == (skyDeviceStatus2 = SkyDeviceStatus.CONNECT_SUCCESS) || skyDeviceStatus3 == skyDeviceStatus2)) {
                            skyPlayViewModel._deviceStatusLiveData.postValue(skyDeviceStatus3);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowDeviceConnectNotifiers.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public SkyPlayViewModel(@NotNull DeviceDataApi deviceDataApi, @NotNull ISkyDeviceStatusAssistant iSkyDeviceStatusAssistant, @NotNull SkyPlayServiceHelper skyPlayServiceHelper, @NotNull SkyPromotionRepo skyPromotionRepo, @NotNull WeekPlanDataSource weekPlanDataSource) {
        this.deviceApi = deviceDataApi;
        this.deviceStatusAssist = iSkyDeviceStatusAssistant;
        this.serviceHelper = skyPlayServiceHelper;
        this.promotionRepo = skyPromotionRepo;
        this.weekPlanDataSource = weekPlanDataSource;
        final Scope scopeSkyServiceScope = SkyServiceKoinScopeKt.skyServiceScope();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playContinuousManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkyPlayContinuousManager>() { // from class: com.huami.sky.ui.play.SkyPlayViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.sky.ui.play.SkyPlayContinuousManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyPlayContinuousManager invoke() {
                return scopeSkyServiceScope.get(Reflection.getOrCreateKotlinClass(SkyPlayContinuousManager.class), qualifier, objArr);
            }
        });
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._deviceStateTipsChangeFlow = mutableSharedFlowMutableSharedFlow$default;
        this.deviceStateTipsChangeFlow = mutableSharedFlowMutableSharedFlow$default;
        MutableLiveData<SkyPromotionInfo> mutableLiveData = new MutableLiveData<>();
        this._featureUpdateTipsLiveData = mutableLiveData;
        this.featureUpdateTipsLiveData = mutableLiveData;
        this.guideUseClick = new MutableLiveData<>();
        this.eventSessionId = skyPlayServiceHelper.getEventSessionId();
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this._weekPlanCloseLiveData = mutableLiveData2;
        this.weekPlanCloseLiveData = mutableLiveData2;
        this.weekPlanAutoShow = -1;
        this.playPlanDoneFlow = b().getPlayPlanDoneFlow();
        MutableLiveData<SkyDeviceStatus> mutableLiveData3 = new MutableLiveData<>();
        this._deviceStatusLiveData = mutableLiveData3;
        this.deviceStatusLiveData = mutableLiveData3;
    }

    private final void a() {
        Job job = this.countDownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.countDownJob = null;
    }

    private final SkyPlayContinuousManager b() {
        return (SkyPlayContinuousManager) this.playContinuousManager.getValue();
    }

    private final void c() {
        SkyPlayCache.Companion companion = SkyPlayCache.INSTANCE;
        companion.getInstance().saveIntWithUserId(u, companion.getInstance().getIntWithUserId(u, 0) + 1);
    }

    private final void e() {
        Job job = this.countDownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.countDownJob = kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f() {
        return SkyPlayCache.INSTANCE.getInstance().getIntWithUserId(u, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g() {
        return SkyPlayCache.INSTANCE.getInstance().getIntWithUserId(w, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long h() {
        try {
            Result.Companion companion = Result.Companion;
            String stringWithUserId = SkyPlayCache.INSTANCE.getInstance().getStringWithUserId(t, EcgData.DEFAULT_DIGIT_VALUE);
            if (stringWithUserId == null) {
                return -1L;
            }
            return Long.parseLong(stringWithUserId);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
            return -1L;
        }
    }

    public static /* synthetic */ void setWeekPlanNeverShowCount$default(SkyPlayViewModel skyPlayViewModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        skyPlayViewModel.setWeekPlanNeverShowCount(i);
    }

    public static /* synthetic */ boolean weekPlayDone$default(SkyPlayViewModel skyPlayViewModel, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = new Date();
        }
        return skyPlayViewModel.weekPlayDone(date);
    }

    public final void clearWeekPlanCloseCount() {
        SkyPlayCache.INSTANCE.getInstance().saveIntWithUserId(u, 0);
    }

    public final void clearWeekPlanNeverShowCount() {
        SkyPlayCache.INSTANCE.getInstance().saveIntWithUserId(w, 0);
    }

    public final void closeWeekPlanTips() {
        if (this.weekPlanAutoShow == 1) {
            c();
        }
    }

    public final boolean deviceStatusTipsShow() {
        return this.serviceHelper.getDeviceStateTipsShow();
    }

    @NotNull
    public final SkyDeviceStatus getDeviceConnectStatus() {
        return this.deviceStatusAssist.getDeviceConnectStatus();
    }

    @NotNull
    public final SharedFlow<Integer> getDeviceStateTipsChangeFlow() {
        return this.deviceStateTipsChangeFlow;
    }

    @NotNull
    public final LiveData<SkyDeviceStatus> getDeviceStatusLiveData() {
        return this.deviceStatusLiveData;
    }

    @NotNull
    public final StateFlow<String> getEventSessionId() {
        return this.eventSessionId;
    }

    public final void getFeatureUpdateTips() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    @NotNull
    public final LiveData<SkyPromotionInfo> getFeatureUpdateTipsLiveData() {
        return this.featureUpdateTipsLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getGuideUseClick() {
        return this.guideUseClick;
    }

    @NotNull
    public final StateFlow<Long> getPlayPlanDoneFlow() {
        return this.playPlanDoneFlow;
    }

    @NotNull
    public final LiveData<Integer> getWeekPlanCloseLiveData() {
        return this.weekPlanCloseLiveData;
    }

    public final int getWeekPlanProgress() {
        return this.weekPlanDataSource.getProgress();
    }

    public final boolean isAlarmClockVisible() {
        return this.deviceApi.isSupportAlarmClock();
    }

    public final boolean isSupportSkyFeature() {
        return this.deviceApi.isSupportSkyFeature();
    }

    public final void loadDeviceStatusTips() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new AnonymousClass1(null), 2, null);
    }

    public final void observeDeviceConnectStatus() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new C15401(null), 3, null);
    }

    public final void openNextWeekPlan() {
        this.weekPlanDataSource.saveWeekPlanRound();
        clearWeekPlanNeverShowCount();
        clearWeekPlanCloseCount();
        setWeekPlanShowToday(-1L);
        updateWeekPlanStartDate();
    }

    public final void saveSkyUpdateIndo(@NotNull SkyPromotionInfo promotionInfo) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(promotionInfo, null), 2, null);
    }

    public final void setWeekPlanNeverShowCount(int count) {
        SkyPlayCache.Companion companion = SkyPlayCache.INSTANCE;
        int intWithUserId = companion.getInstance().getIntWithUserId(w, 0);
        if (count <= 0) {
            count = intWithUserId + 1;
        }
        companion.getInstance().saveIntWithUserId(w, count);
    }

    public final void setWeekPlanShowToday(long showToday) {
        SkyPlayCache.INSTANCE.getInstance().saveStringWithUserId(t, String.valueOf(showToday));
    }

    public final boolean shouldShowNextSevenDaysTip() {
        HMLog.info("SkyPlayViewModel", new c());
        return !TimeUtils.isToday(h()) && g() < 3 && getDeviceConnectStatus() == SkyDeviceStatus.CONNECT_SUCCESS && isSupportSkyFeature() && getWeekPlanProgress() != -2;
    }

    public final boolean shouldShowSevenDayIcon() {
        return (!isSupportSkyFeature() || weekPlanNeverShow() || getWeekPlanProgress() == -2) ? false : true;
    }

    public final boolean shouldShowSevenDaysTip() {
        HMLog.info("SkyPlayViewModel", new d());
        return !TimeUtils.isToday(h()) && f() < 3 && g() < 3 && getDeviceConnectStatus() == SkyDeviceStatus.CONNECT_SUCCESS && isSupportSkyFeature() && getWeekPlanProgress() != -2;
    }

    public final void showWeekPlanTips(boolean autoShow) {
        int progress = this.weekPlanDataSource.getProgress();
        int i = -1;
        if (progress == -1) {
            updateWeekPlanStartDate();
        }
        this.weekPlanDataSource.refreshProgressChannel();
        if (progress <= 6) {
            i = autoShow ? 1 : 2;
        }
        this.weekPlanAutoShow = i;
        if (!autoShow) {
            a();
        } else {
            setWeekPlanShowToday(System.currentTimeMillis());
            e();
        }
    }

    public final void updateDeviceStatusTipsShow() {
        this.serviceHelper.updateDeviceStatusTipsShow();
    }

    public final void updateWeekPlanStartDate() {
        String timeString$default = TimeExtKt.toTimeString$default(new Date(), (String) null, (Locale) null, 3, (Object) null);
        if (timeString$default == null) {
            return;
        }
        this.weekPlanDataSource.setStartDate(timeString$default);
        b().startPlayDoneCount();
    }

    @Nullable
    public final Date weekPlanEndDate() {
        Pair<Date, Date> pairRefreshWeekList = this.weekPlanDataSource.refreshWeekList(7);
        if (pairRefreshWeekList == null) {
            return null;
        }
        return pairRefreshWeekList.getSecond();
    }

    public final boolean weekPlanNeverShow() {
        return g() >= 3;
    }

    public final boolean weekPlayDone(@NotNull Date playDate) {
        return this.weekPlanDataSource.getDateMarked(playDate);
    }
}
