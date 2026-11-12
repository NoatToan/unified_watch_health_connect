package com.huami.module.homepage.cards.business.heartrate;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.health.afppg.service.AfPpgService;
import com.huami.health.afppg.service.event.AFib;
import com.huami.health.afppg.service.event.AFibEventDay;
import com.huami.heartrate.model.AbnormalHeartBeatEntity;
import com.huami.heartrate.service.HeartRate;
import com.huami.heartrate.service.HeartRateInfo;
import com.huami.heartrate.service.HeartRateStatisticalInfo;
import com.huami.heartrate.service.IHeartRateService;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 R2\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001d\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J-\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00152\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0002H\u0016R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00104R\u0018\u00107\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00104R\u0018\u00108\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00104R\u0016\u0010;\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010(R\u0018\u0010D\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010L\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"Lcom/huami/module/homepage/cards/business/heartrate/HeartRateBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "", "h", "i", "", "heartRateTime", "f", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/heartrate/service/HeartRateInfo;", "heartRateInfo", "e", "g", z.j, "a", "Lcom/huami/heartrate/service/HeartRateStatisticalInfo;", "heartRateStatisticalInfo", GoogleApiAvailabilityLight.a, "l", "", Constants.DATA_KEY_HR, "Lkotlin/Triple;", "", "b", "(Ljava/lang/Integer;)Lkotlin/Triple;", "normalResId", "l66ResId", hl.k, "Lcom/huami/module/homepage/cards/business/heartrate/HeartRateCardView;", "getView", "bindLogic", "bind", "close", "Landroid/content/Context;", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", LogUtil.I, "userAge", "Lcom/huami/heartrate/service/IHeartRateService;", "Lcom/huami/heartrate/service/IHeartRateService;", "hrService", "Lcom/huami/health/afppg/service/AfPpgService;", "Lcom/huami/health/afppg/service/AfPpgService;", "ppgService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "job", "aFbiJob", "switchJob", "personInfoJob", "m", "Lcom/huami/module/homepage/cards/business/heartrate/HeartRateCardView;", "heartRateView", "Lkotlinx/coroutines/flow/MutableSharedFlow;", GoogleApiAvailabilityLight.b, "Lkotlinx/coroutines/flow/MutableSharedFlow;", EcgData.TIMESTAMP_SERVER_UPDATED, "o", "maxHrLimit", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/heartrate/service/HeartRateInfo;", "currentData", "", "Lcom/huami/heartrate/model/AbnormalHeartBeatEntity;", DTransferConstants.SEARCH_KEY, "Ljava/util/List;", "currentAbnormalRange", "", "r", "Z", "switchIsOpen", SOAP.XMLNS, "delaying", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "t", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateBindingLogic extends BindingLogic {

    @Deprecated
    public static final long DATA_REFRESH_DELAY_TIMES = 5000;

    @Deprecated
    public static final int MAX_HR = 220;

    @NotNull
    private static final b t = new b(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int userAge;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateService hrService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final AfPpgService ppgService;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Job job;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Job aFbiJob;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Job switchJob;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Job personInfoJob;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final HeartRateCardView heartRateView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<Long> updateTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int maxHrLimit;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private HeartRateInfo currentData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private List<AbnormalHeartBeatEntity> currentAbnormalRange;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean switchIsOpen;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean delaying;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$1", f = "HeartRateBindingLogic.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0482a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ HeartRateBindingLogic a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0482a(HeartRateBindingLogic heartRateBindingLogic) {
                super(0);
                this.a = heartRateBindingLogic;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.assistService.openHeartRateSetting(this.a.context);
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeartRateBindingLogic.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HeartRateBindingLogic.this.heartRateView.initView();
                MutableSharedFlow mutableSharedFlow = HeartRateBindingLogic.this.updateTime;
                Long lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                this.a = 1;
                if (mutableSharedFlow.emit(lBoxLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HeartRateBindingLogic.this.heartRateView.heartRateSwitchClick(new C0482a(HeartRateBindingLogic.this));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/module/homepage/cards/business/heartrate/HeartRateBindingLogic$b", "", "", "DATA_REFRESH_DELAY_TIMES", "J", "", "MAX_HR", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$delaySetHeartRateChart$1", f = "HeartRateBindingLogic.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeartRateBindingLogic.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HeartRateCardView heartRateCardView = HeartRateBindingLogic.this.heartRateView;
            HeartRateInfo heartRateInfo = HeartRateBindingLogic.this.currentData;
            List<AbnormalHeartBeatEntity> listEmptyList = HeartRateBindingLogic.this.currentAbnormalRange;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            heartRateCardView.setAverHeartRateAndChart(heartRateInfo, listEmptyList, HeartRateBindingLogic.this.switchIsOpen);
            HeartRateBindingLogic.this.delaying = false;
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HeartRateStatisticalInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HeartRateStatisticalInfo heartRateStatisticalInfo) {
            super(0);
            this.a = heartRateStatisticalInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "heart rate heartRateStatisticalInfo:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic", f = "HeartRateBindingLogic.kt", i = {0, 0}, l = {149, 151}, m = "handleUpdateTime", n = {"this", "heartRateTime"}, s = {"L$0", "L$1"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return HeartRateBindingLogic.this.f(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/health/afppg/service/event/AFibEventDay;", "aFib", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$listenAFibData$2", f = "HeartRateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<AFibEventDay, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HeartRateBindingLogic a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HeartRateBindingLogic heartRateBindingLogic) {
                super(0);
                this.a = heartRateBindingLogic;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "异常心博数据：" + this.a.currentAbnormalRange;
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull AFibEventDay aFibEventDay, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(aFibEventDay, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = HeartRateBindingLogic.this.new f(continuation);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AFibEventDay aFibEventDay = (AFibEventDay) this.b;
            HeartRateBindingLogic heartRateBindingLogic = HeartRateBindingLogic.this;
            List<AFib> atrialFibrillationList = aFibEventDay.getAtrialFibrillationList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(atrialFibrillationList, 10));
            for (AFib aFib : atrialFibrillationList) {
                arrayList.add(new AbnormalHeartBeatEntity(aFib.getDuration(), aFib.getEventTime(), aFib.getEndTime(), aFib.getEcgAbnormalResults(), aFib.getDeviceSource()));
            }
            heartRateBindingLogic.currentAbnormalRange = arrayList;
            if (HeartRateBindingLogic.this.currentData != null) {
                HeartRateBindingLogic.this.a();
            }
            HMLog.info("HeartRateBindingLogic", new a(HeartRateBindingLogic.this));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/health/afppg/service/event/AFibEventDay;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$listenAFibData$3", f = "HeartRateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function3<FlowCollector<? super AFibEventDay>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "异常心博数据发生异常。";
            }
        }

        public g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super AFibEventDay> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
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
            Throwable th = (Throwable) this.b;
            HMLog.warn("HeartRateBindingLogic", th, a.a);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$listenFullHeartSwitch$2", f = "HeartRateBindingLogic.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HeartRateBindingLogic a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HeartRateBindingLogic heartRateBindingLogic) {
                super(0);
                this.a = heartRateBindingLogic;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "switchIsOpen:" + this.a.switchIsOpen;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$listenFullHeartSwitch$2$2", f = "HeartRateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HeartRateBindingLogic b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HeartRateBindingLogic heartRateBindingLogic, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = heartRateBindingLogic;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b.switchIsOpen) {
                    if (this.b.currentData != null) {
                        HeartRateCardView heartRateCardView = this.b.heartRateView;
                        HeartRateInfo heartRateInfo = this.b.currentData;
                        List<AbnormalHeartBeatEntity> listEmptyList = this.b.currentAbnormalRange;
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        heartRateCardView.setAverHeartRateAndChart(heartRateInfo, listEmptyList, true);
                    } else {
                        this.b.heartRateView.setSwitchIsOpenWhenDataNull();
                    }
                }
                this.b.heartRateView.updateHeartRateSwitch(this.b.switchIsOpen);
                return Unit.INSTANCE;
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(boolean z, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeartRateBindingLogic.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HeartRateBindingLogic heartRateBindingLogic = HeartRateBindingLogic.this;
                heartRateBindingLogic.switchIsOpen = heartRateBindingLogic.assistService.fullHeartRateIsOpen(HeartRateBindingLogic.this.context);
                HMLog.info("HeartRateBindingLogic", new a(HeartRateBindingLogic.this));
                MainCoroutineDispatcher main = Dispatchers.getMain();
                b bVar = new b(HeartRateBindingLogic.this, null);
                this.a = 1;
                if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/heartrate/service/HeartRateInfo;", "info", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$listenHeartRateInfo$2", f = "HeartRateBindingLogic.kt", i = {0}, l = {130}, m = "invokeSuspend", n = {"info"}, s = {"L$0"})
    public static final class i extends SuspendLambda implements Function2<HeartRateInfo, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable HeartRateInfo heartRateInfo, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(heartRateInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            i iVar = HeartRateBindingLogic.this.new i(continuation);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HeartRateInfo heartRateInfo;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HeartRateInfo heartRateInfo2 = (HeartRateInfo) this.b;
                HeartRateBindingLogic heartRateBindingLogic = HeartRateBindingLogic.this;
                Long lBoxLong = heartRateInfo2 == null ? null : Boxing.boxLong(heartRateInfo2.getDate());
                this.b = heartRateInfo2;
                this.a = 1;
                if (heartRateBindingLogic.f(lBoxLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                heartRateInfo = heartRateInfo2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                heartRateInfo = (HeartRateInfo) this.b;
                ResultKt.throwOnFailure(obj);
            }
            HeartRateBindingLogic.this.d(heartRateInfo != null ? heartRateInfo.getHeartRateStatisticalInfo() : null);
            HeartRateBindingLogic.this.e(heartRateInfo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/heartrate/service/HeartRateInfo;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$listenHeartRateInfo$3", f = "HeartRateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function3<FlowCollector<? super HeartRateInfo>, Throwable, Continuation<? super Unit>, Object> {
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
            public final String invoke() {
                return "心率数据获取异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public j(Continuation<? super j> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super HeartRateInfo> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            j jVar = new j(continuation);
            jVar.b = th;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.b;
            HMLog.error$default("HeartRateBindingLogic", null, null, new a(th), 6, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.heartrate.HeartRateBindingLogic$listenPersonInfoChange$1", f = "HeartRateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HeartRateBindingLogic a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HeartRateBindingLogic heartRateBindingLogic) {
                super(0);
                this.a = heartRateBindingLogic;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "personInfo change,age: " + this.a.userAge;
            }
        }

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeartRateBindingLogic.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HeartRateStatisticalInfo heartRateStatisticalInfo;
            HeartRateEntry heartRateEntry;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeartRateBindingLogic.this.l();
            HMLog.info("HeartRateBindingLogic", new a(HeartRateBindingLogic.this));
            HeartRateInfo heartRateInfo = HeartRateBindingLogic.this.currentData;
            if (heartRateInfo == null || (heartRateStatisticalInfo = heartRateInfo.getHeartRateStatisticalInfo()) == null) {
                heartRateEntry = null;
            } else {
                Integer numBoxInt = Boxing.boxInt(heartRateStatisticalInfo.getRestHeartRate());
                Integer numBoxInt2 = Boxing.boxInt(heartRateStatisticalInfo.getMinHeartRate());
                Integer numBoxInt3 = Boxing.boxInt(heartRateStatisticalInfo.getMaxHeartRate());
                Integer numBoxInt4 = Boxing.boxInt(heartRateStatisticalInfo.getAvgHeartRate());
                HeartRate latestHeartRate = heartRateStatisticalInfo.getLatestHeartRate();
                Integer numBoxInt5 = latestHeartRate == null ? null : Boxing.boxInt(latestHeartRate.getHeartRate());
                HeartRate latestHeartRate2 = heartRateStatisticalInfo.getLatestHeartRate();
                heartRateEntry = new HeartRateEntry(numBoxInt, numBoxInt2, numBoxInt3, numBoxInt4, numBoxInt5, latestHeartRate2 == null ? null : Boxing.boxLong(latestHeartRate2.getTime()));
            }
            HeartRateBindingLogic.this.heartRateView.setLatestHeartRate(heartRateEntry == null ? null : heartRateEntry.getHeartRate(), heartRateEntry == null ? null : heartRateEntry.getTime(), HeartRateBindingLogic.this.b(heartRateEntry != null ? heartRateEntry.getHeartRate() : null));
            return Unit.INSTANCE;
        }
    }

    public HeartRateBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.context = context;
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.userAge = serviceManager.getUserAge();
        this.hrService = serviceManager.getHeartRateService();
        this.ppgService = serviceManager.getAfPpgService();
        this.assistService = serviceManager.getAssistService();
        this.heartRateView = new HeartRateCardView(context, null, 0, 6, null);
        this.updateTime = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.maxHrLimit = 220 - this.userAge;
        kotlinx.coroutines.e.f(coroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        if (this.delaying) {
            return;
        }
        this.delaying = true;
        kotlinx.coroutines.e.f(this.scope, null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Triple<String, Integer, Integer> b(Integer hr) {
        int i2 = this.maxHrLimit;
        float f2 = i2 * 0.5f;
        float f3 = i2 * 0.6f;
        float f4 = i2 * 0.7f;
        float f5 = i2 * 0.8f;
        float f6 = i2 * 0.9f;
        if (hr == null) {
            return new Triple<>(k(R.string.homepage_hr_section_rest, R.string.hr_section_relaxing), Integer.valueOf(R.color.s4), 3);
        }
        if (hr.intValue() >= f6) {
            return new Triple<>(k(R.string.homepage_hr_section_anaerobic_limit, R.string.hr_section_limit), Integer.valueOf(R.color.s51), 197);
        }
        if (hr.intValue() >= f5 && hr.intValue() < f6) {
            return new Triple<>(k(R.string.homepage_hr_section_stamina_strengthen, R.string.hr_section_anaerobic), Integer.valueOf(R.color.s31), 160);
        }
        if (hr.intValue() >= f4 && hr.intValue() < f5) {
            return new Triple<>(k(R.string.homepage_hr_section_heart_lung_strengthen, R.string.hr_section_aerobic), Integer.valueOf(R.color.s33), 120);
        }
        if (hr.intValue() < f3 || hr.intValue() >= f4) {
            return (((float) hr.intValue()) < f2 || ((float) hr.intValue()) >= f3) ? new Triple<>(k(R.string.homepage_hr_section_rest, R.string.hr_section_relaxing), Integer.valueOf(R.color.s18), 3) : new Triple<>(k(R.string.homepage_hr_section_warm_up, R.string.hr_section_warming_up), Integer.valueOf(R.color.s15), 40);
        }
        return new Triple<>(k(R.string.homepage_hr_section_fat_burn, R.string.hr_section_fat_burning), Integer.valueOf(R.color.s20), 80);
    }

    public static /* synthetic */ Triple c(HeartRateBindingLogic heartRateBindingLogic, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        return heartRateBindingLogic.b(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    public final void d(HeartRateStatisticalInfo heartRateStatisticalInfo) {
        HeartRateEntry heartRateEntry;
        Integer restHeartRate;
        String strI18n;
        Integer minHeartRate;
        String strI18n2;
        Integer maxHeartRate;
        String strI18n3;
        if (heartRateStatisticalInfo == null) {
            heartRateEntry = null;
        } else {
            Integer numValueOf = Integer.valueOf(heartRateStatisticalInfo.getRestHeartRate());
            Integer numValueOf2 = Integer.valueOf(heartRateStatisticalInfo.getMinHeartRate());
            Integer numValueOf3 = Integer.valueOf(heartRateStatisticalInfo.getMaxHeartRate());
            Integer numValueOf4 = Integer.valueOf(heartRateStatisticalInfo.getAvgHeartRate());
            HeartRate latestHeartRate = heartRateStatisticalInfo.getLatestHeartRate();
            Integer numValueOf5 = latestHeartRate == null ? null : Integer.valueOf(latestHeartRate.getHeartRate());
            HeartRate latestHeartRate2 = heartRateStatisticalInfo.getLatestHeartRate();
            heartRateEntry = new HeartRateEntry(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, latestHeartRate2 == null ? null : Long.valueOf(latestHeartRate2.getTime()));
        }
        HMLog.info("HeartRateBindingLogic", new d(heartRateStatisticalInfo));
        this.heartRateView.setLatestHeartRate(heartRateEntry == null ? null : heartRateEntry.getHeartRate(), heartRateEntry == null ? null : heartRateEntry.getTime(), b(heartRateEntry == null ? null : heartRateEntry.getHeartRate()));
        HeartRateCardView heartRateCardView = this.heartRateView;
        String str = "--";
        if (heartRateEntry == null || (restHeartRate = heartRateEntry.getRestHeartRate()) == null) {
            strI18n = "--";
        } else {
            if (restHeartRate.intValue() == 0) {
                restHeartRate = null;
            }
            if (restHeartRate == null || (strI18n = I18nKt.i18n(restHeartRate.intValue())) == null) {
                strI18n = "--";
            }
        }
        if (heartRateEntry == null || (minHeartRate = heartRateEntry.getMinHeartRate()) == null) {
            strI18n2 = "--";
        } else {
            if (minHeartRate.intValue() == 0) {
                minHeartRate = null;
            }
            if (minHeartRate == null || (strI18n2 = I18nKt.i18n(minHeartRate.intValue())) == null) {
                strI18n2 = "--";
            }
        }
        if (heartRateEntry != null && (maxHeartRate = heartRateEntry.getMaxHeartRate()) != null) {
            Integer num = maxHeartRate.intValue() == 0 ? null : maxHeartRate;
            if (num != null && (strI18n3 = I18nKt.i18n(num.intValue())) != null) {
                str = strI18n3;
            }
        }
        heartRateCardView.setResMinMaxHeartRate(strI18n, strI18n2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(HeartRateInfo heartRateInfo) {
        if (heartRateInfo == null) {
            return;
        }
        HeartRateInfo heartRateInfo2 = this.currentData;
        if (heartRateInfo2 == null) {
            HeartRateCardView heartRateCardView = this.heartRateView;
            List<AbnormalHeartBeatEntity> listEmptyList = this.currentAbnormalRange;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            heartRateCardView.setAverHeartRateAndChart(heartRateInfo, listEmptyList, this.switchIsOpen);
        } else if (!Intrinsics.areEqual(heartRateInfo2, heartRateInfo)) {
            a();
        }
        this.currentData = heartRateInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Long l, Continuation<? super Unit> continuation) {
        e eVar;
        HeartRateBindingLogic heartRateBindingLogic;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objFirstOrNull = eVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                l = (Long) eVar.b;
                heartRateBindingLogic = (HeartRateBindingLogic) eVar.a;
                ResultKt.throwOnFailure(objFirstOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirstOrNull);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objFirstOrNull);
        if (l == null) {
            return Unit.INSTANCE;
        }
        MutableSharedFlow<Long> mutableSharedFlow = this.updateTime;
        eVar.a = this;
        eVar.b = l;
        eVar.e = 1;
        objFirstOrNull = FlowKt.firstOrNull(mutableSharedFlow, eVar);
        if (objFirstOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        heartRateBindingLogic = this;
        Long l2 = (Long) objFirstOrNull;
        if (l2 != null && TimeExtKt.isSameDay(l2.longValue(), l)) {
            return Unit.INSTANCE;
        }
        MutableSharedFlow<Long> mutableSharedFlow2 = heartRateBindingLogic.updateTime;
        eVar.a = null;
        eVar.b = null;
        eVar.e = 2;
        if (mutableSharedFlow2.emit(l, eVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final void g() {
        this.aFbiJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.updateTime, new HeartRateBindingLogic$listenAFibData$$inlined$flatMapLatest$1(null, this)), new f(null)), new g(null)), Dispatchers.getIO()), this.scope);
    }

    private final void h() {
        this.switchJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.onEach(FlowKt.transformLatest(this.assistService.deviceBindNotifiers(), new HeartRateBindingLogic$listenFullHeartSwitch$$inlined$flatMapLatest$1(null, this)), new h(null)), Dispatchers.getIO()), this.scope);
    }

    private final void i() {
        this.job = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new HeartRateBindingLogic$listenHeartRateInfo$$inlined$flatMapLatest$1(null, this)), new i(null)), new j(null)), Dispatchers.getIO()), this.scope);
    }

    private final void j() {
        this.personInfoJob = FlowKt.launchIn(ExteranelKt.onMainEach(this.assistService.personInfoChangeNotifier(), new k(null)), this.scope);
    }

    private final String k(int normalResId, int l66ResId) {
        Context context = this.context;
        if (this.assistService.currentBindDeviceIsL66()) {
            normalResId = l66ResId;
        }
        return context.getString(normalResId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        int userAge = ServiceManager.INSTANCE.getUserAge();
        this.userAge = userAge;
        this.maxHrLimit = 220 - userAge;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        h();
        i();
        j();
        g();
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bindLogic() {
        close();
        bind();
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
        Job job2 = this.switchJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.switchJob = null;
        Job job3 = this.personInfoJob;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.personInfoJob = null;
        Job job4 = this.aFbiJob;
        if (job4 != null) {
            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
        }
        this.aFbiJob = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public HeartRateCardView getHeartRateView() {
        return this.heartRateView;
    }
}
