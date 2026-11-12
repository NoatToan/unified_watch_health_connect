package com.huami.module.homepage.cards.business.weight;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.bodymeasurements.bodyfat_service.BmiDetailInfoEntry;
import com.huami.health.bodymeasurements.bodyfat_service.BodyScore;
import com.huami.health.bodymeasurements.bodyfat_service.BodyfatService;
import com.huami.health.bodymeasurements.bodyfat_service.WeightUnit;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b0\u00101J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020**\u00020)8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\u00020**\u00020\f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010.¨\u00062"}, d2 = {"Lcom/huami/module/homepage/cards/business/weight/WeightAnalysisBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyScore;", "body", "", "f", "Lcom/huami/health/bodymeasurements/bodyfat_service/BmiDetailInfoEntry;", "entry", "g", "e", "", "bmi", "", StepsInfo.KEY_STAGE, "currentStage", GoogleApiAvailabilityLight.a, "Lkotlin/Pair;", "a", "Lcom/huami/module/homepage/cards/business/weight/WeightAnalysisView;", "getView", "bind", "close", "Landroid/content/Context;", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyfatService;", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyfatService;", "weightService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "Lcom/huami/module/homepage/cards/business/weight/WeightAnalysisView;", "weightView", "Lkotlinx/coroutines/Job;", "h", "Lkotlinx/coroutines/Job;", "weightJob", "Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;", "", "b", "(Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;)Ljava/lang/String;", "convert", "(I)Ljava/lang/String;", "scoreToText", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class WeightAnalysisBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final BodyfatService weightService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final WeightAnalysisView weightView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Job weightJob;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WeightUnit.values().length];
            iArr[WeightUnit.KG.ordinal()] = 1;
            iArr[WeightUnit.SJ.ordinal()] = 2;
            iArr[WeightUnit.YB.ordinal()] = 3;
            iArr[WeightUnit.ST.ordinal()] = 4;
            iArr[WeightUnit.GRAM.ordinal()] = 5;
            iArr[WeightUnit.OUNCE.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.weight.WeightAnalysisBindingLogic$1", f = "WeightAnalysisBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightAnalysisBindingLogic.this.new a(continuation);
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
            WeightAnalysisBindingLogic.this.weightView.initView();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.weight.WeightAnalysisBindingLogic$bind$1", f = "WeightAnalysisBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<Unit, Unit, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Unit unit, @NotNull Unit unit2, @Nullable Continuation<? super Unit> continuation) {
            return new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/huami/health/bodymeasurements/bodyfat_service/BmiDetailInfoEntry;", "weightInfo", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyScore;", ParamKey.bodyScore, "Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.weight.WeightAnalysisBindingLogic$bind$2$1", f = "WeightAnalysisBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<BmiDetailInfoEntry, BodyScore, Continuation<? super Pair<? extends BmiDetailInfoEntry, ? extends BodyScore>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable BmiDetailInfoEntry bmiDetailInfoEntry, @Nullable BodyScore bodyScore, @Nullable Continuation<? super Pair<BmiDetailInfoEntry, BodyScore>> continuation) {
            c cVar = new c(continuation);
            cVar.b = bmiDetailInfoEntry;
            cVar.c = bodyScore;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TuplesKt.to((BmiDetailInfoEntry) this.b, (BodyScore) this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "Lcom/huami/health/bodymeasurements/bodyfat_service/BmiDetailInfoEntry;", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyScore;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.weight.WeightAnalysisBindingLogic$bind$3", f = "WeightAnalysisBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<Pair<? extends BmiDetailInfoEntry, ? extends BodyScore>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Pair<BmiDetailInfoEntry, BodyScore> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Pair<BmiDetailInfoEntry, BodyScore> pair) {
                super(0);
                this.a = pair;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "weightInfo:" + this.a.getFirst();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Pair<BmiDetailInfoEntry, BodyScore> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Pair<BmiDetailInfoEntry, BodyScore> pair) {
                super(0);
                this.a = pair;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "bodyScore:" + this.a.getSecond();
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Pair<BmiDetailInfoEntry, BodyScore> pair, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = WeightAnalysisBindingLogic.this.new d(continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.b;
            HMLog.info("WeightAnalysisBindingLogic", new a(pair));
            HMLog.info("WeightAnalysisBindingLogic", new b(pair));
            WeightAnalysisBindingLogic.this.g((BmiDetailInfoEntry) pair.getFirst());
            boolean z = pair.getSecond() != null || pair.getFirst() == null;
            if (HomeUtils.isMifitApp() || z) {
                WeightAnalysisBindingLogic.this.f((BodyScore) pair.getSecond());
            } else {
                WeightAnalysisBindingLogic.this.e((BmiDetailInfoEntry) pair.getFirst());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/huami/health/bodymeasurements/bodyfat_service/BmiDetailInfoEntry;", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyScore;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.weight.WeightAnalysisBindingLogic$bind$4", f = "WeightAnalysisBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends BmiDetailInfoEntry, ? extends BodyScore>>, Throwable, Continuation<? super Unit>, Object> {
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
                return "体重分析数据获取异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Pair<BmiDetailInfoEntry, BodyScore>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.b = th;
            return eVar.invokeSuspend(Unit.INSTANCE);
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
            HMLog.error$default("WeightAnalysisBindingLogic", null, null, new a(th), 6, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    public WeightAnalysisBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.context = context;
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.weightService = serviceManager.getWeightService();
        this.assistService = serviceManager.getAssistService();
        this.weightView = new WeightAnalysisView(context, null, 0, 6, null);
        kotlinx.coroutines.e.f(coroutineScope, null, null, new a(null), 3, null);
    }

    private final Pair<Float, Float> a() {
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        Pair pair = TuplesKt.to(Integer.valueOf(userInfo.getGender()), Integer.valueOf(userInfo.getAge()));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        Float fValueOf = Float.valueOf(23.8f);
        Float fValueOf2 = Float.valueOf(27.4f);
        Float fValueOf3 = Float.valueOf(26.9f);
        Float fValueOf4 = Float.valueOf(22.6f);
        Float fValueOf5 = Float.valueOf(21.9f);
        Float fValueOf6 = Float.valueOf(21.0f);
        Float fValueOf7 = Float.valueOf(18.1f);
        Float fValueOf8 = Float.valueOf(18.9f);
        if (iIntValue == 0) {
            switch (iIntValue2) {
                case 7:
                    return TuplesKt.to(Float.valueOf(17.2f), fValueOf8);
                case 8:
                    return TuplesKt.to(fValueOf7, Float.valueOf(19.9f));
                case 9:
                    return TuplesKt.to(Float.valueOf(19.0f), fValueOf6);
                case 10:
                    return TuplesKt.to(Float.valueOf(20.0f), Float.valueOf(22.1f));
                case 11:
                    return TuplesKt.to(Float.valueOf(21.1f), Float.valueOf(23.3f));
                case 12:
                    return TuplesKt.to(fValueOf5, Float.valueOf(24.5f));
                case 13:
                    return TuplesKt.to(fValueOf4, Float.valueOf(25.6f));
                case 14:
                    return TuplesKt.to(Float.valueOf(23.0f), Float.valueOf(26.3f));
                case 15:
                    return TuplesKt.to(Float.valueOf(23.4f), fValueOf3);
                case 16:
                    return TuplesKt.to(Float.valueOf(23.7f), fValueOf2);
                case 17:
                    return TuplesKt.to(fValueOf, Float.valueOf(27.7f));
                default:
                    return TuplesKt.to(Float.valueOf(17.2f), fValueOf8);
            }
        }
        switch (iIntValue2) {
            case 7:
                return TuplesKt.to(Float.valueOf(17.4f), Float.valueOf(19.2f));
            case 8:
                return TuplesKt.to(fValueOf7, Float.valueOf(20.3f));
            case 9:
                return TuplesKt.to(fValueOf8, Float.valueOf(21.4f));
            case 10:
                return TuplesKt.to(Float.valueOf(19.6f), Float.valueOf(22.5f));
            case 11:
                return TuplesKt.to(Float.valueOf(20.3f), Float.valueOf(23.6f));
            case 12:
                return TuplesKt.to(fValueOf6, Float.valueOf(24.7f));
            case 13:
                return TuplesKt.to(fValueOf5, Float.valueOf(25.7f));
            case 14:
                return TuplesKt.to(fValueOf4, Float.valueOf(26.4f));
            case 15:
                return TuplesKt.to(Float.valueOf(23.1f), fValueOf3);
            case 16:
                return TuplesKt.to(Float.valueOf(23.5f), fValueOf2);
            case 17:
                return TuplesKt.to(fValueOf, Float.valueOf(27.8f));
            default:
                return TuplesKt.to(Float.valueOf(17.4f), Float.valueOf(19.2f));
        }
    }

    private final String b(WeightUnit weightUnit) {
        switch (WhenMappings.$EnumSwitchMapping$0[weightUnit.ordinal()]) {
            case 1:
                return this.context.getString(R.string.homepage_weight_unit_kg);
            case 2:
                return this.context.getString(R.string.homepage_weight_unit_sj);
            case 3:
                return this.context.getString(R.string.homepage_weight_unit_yb);
            case 4:
                return this.context.getString(R.string.homepage_weight_unit_st);
            case 5:
                return this.context.getString(R.string.homepage_weight_unit_gram);
            case 6:
                return this.context.getString(R.string.homepage_weight_unit_ounce);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String c(int i) {
        if (i <= 60) {
            return this.context.getString(R.string.homepage_body_bad);
        }
        return i <= 85 ? this.context.getString(R.string.homepage_body_modest) : this.context.getString(R.string.homepage_body_great);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0149 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0156 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r0 > 6.0f) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r0 >= 6.0f) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        return 5.99f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float d(float bmi, int stage, int currentStage) {
        float f;
        if (stage == 3) {
            Pair<Float, Float> pairA = a();
            float fFloatValue = pairA.component1().floatValue();
            float fFloatValue2 = pairA.component2().floatValue();
            if (currentStage == 1) {
                float f2 = (bmi / fFloatValue) * 2;
                if (f2 >= 2.0f) {
                    return 1.99f;
                }
                return f2;
            }
            if (currentStage != 2) {
                float f3 = 4 + (((bmi - fFloatValue2) / (32.0f - fFloatValue2)) / 2);
                if (f3 > 4.0f) {
                    if (f3 >= 5.75f) {
                        return 5.75f;
                    }
                    return f3;
                }
                return 4.01f;
            }
            float f4 = 2;
            float f5 = (((bmi - fFloatValue) / (fFloatValue2 - fFloatValue)) * f4) + f4;
            if (f5 > 2.0f) {
                if (f5 >= 4.0f) {
                    return 3.99f;
                }
                return f5;
            }
            return 2.01f;
        }
        if (stage == 4) {
            if (currentStage == 1) {
                float f6 = (bmi / 18.5f) * 2;
                if (f6 >= 2.0f) {
                    return 1.99f;
                }
                return f6;
            }
            if (currentStage == 2) {
                float f7 = 2;
                float f8 = f7 + (((bmi - 18.5f) / 5.5f) * f7);
                if (f8 > 2.0f) {
                    if (f8 >= 4.0f) {
                        return 3.99f;
                    }
                    return f8;
                }
                return 2.01f;
            }
            if (currentStage == 3) {
                f = 4 + (((bmi - 24.0f) / 4.0f) * 2);
                if (f > 4.0f) {
                }
                return 4.01f;
            }
            float f9 = 6 + (((bmi - 28.0f) / 6.0f) / 2);
            if (f9 > 6.0f) {
                if (f9 >= 7.75f) {
                    return 7.75f;
                }
                return f9;
            }
            return 6.01f;
        }
        if (stage != 5) {
            return 0.0f;
        }
        if (currentStage == 1) {
            float f10 = (bmi / 18.5f) * 2;
            if (f10 >= 2.0f) {
                return 1.99f;
            }
            return f10;
        }
        if (currentStage == 2) {
            float f11 = 2;
            float f12 = f11 + (((bmi - 18.5f) / 6.5f) * f11);
            if (f12 > 2.0f) {
                if (f12 >= 4.0f) {
                    return 3.99f;
                }
                return f12;
            }
            return 2.01f;
        }
        if (currentStage == 3) {
            f = 4 + (((bmi - 25.0f) / 3.0f) * 2);
            if (f > 4.0f) {
            }
            return 4.01f;
        }
        if (currentStage != 4) {
            float f13 = 8 + (((bmi - 32.0f) / 4.0f) / 2);
            if (f13 < 8.0f) {
                return 8.01f;
            }
            if (f13 >= 9.75f) {
                return 9.75f;
            }
            return f13;
        }
        float f14 = 6 + (((bmi - 28.0f) / 4.0f) * 2);
        if (f14 > 6.0f) {
            if (f14 >= 8.0f) {
                return 7.99f;
            }
            return f14;
        }
        return 6.01f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(BmiDetailInfoEntry entry) {
        String strI18n$default;
        BmiEntry bmiEntry = null;
        if (entry != null) {
            Float bmi = entry.getBmi();
            float fD = d(bmi == null ? 0.0f : bmi.floatValue(), entry.getBmiStage().getFirst().intValue(), entry.getBmiStage().getSecond().intValue());
            long lastTime = entry.getLastTime();
            String bmiStateText = entry.getCanAnalyze() ? entry.getBmiStateText() : this.context.getString(R.string.homepage_item_card_bmi_unable_to_analyze);
            Float bmi2 = entry.getBmi();
            String str = "--";
            if (bmi2 != null && (strI18n$default = I18nKt.i18n$default(bmi2.floatValue(), 0, 1, null)) != null) {
                str = strI18n$default;
            }
            bmiEntry = new BmiEntry(lastTime, bmiStateText, str, new PiecewiseArcEntry(entry.getBmiStage().getFirst().floatValue() * 2.0f, fD, entry.getCanAnalyze(), TuplesKt.to(entry.getBmiStage().getFirst(), entry.getBmiStage().getSecond())));
        }
        if (bmiEntry == null) {
            bmiEntry = new BmiEntry(0L, null, null, null, 15, null);
        }
        this.weightView.updateBmiView(bmiEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(BodyScore body) {
        BodyScoreEntry bodyScoreEntry = body == null ? null : new BodyScoreEntry(Integer.valueOf(body.getBodyScore()), c(body.getBodyScore()), body.getTime());
        if (bodyScoreEntry == null) {
            bodyScoreEntry = new BodyScoreEntry(null, null, 0L, 7, null);
        }
        this.weightView.updateBodyScoreView(bodyScoreEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(BmiDetailInfoEntry entry) {
        WeightEntry weightEntry;
        if (entry == null) {
            weightEntry = null;
        } else {
            long lastTime = entry.getLastTime();
            String weightStateText = entry.getCanAnalyze() ? entry.getWeightStateText() : this.context.getString(R.string.homepage_item_card_bmi_unable_to_analyze);
            String strB = b(entry.getWeightUnit());
            String weight = entry.getWeight();
            float fFloatValue = entry.getStage().getFirst().floatValue() * 2.0f;
            Float bmi = entry.getBmi();
            weightEntry = new WeightEntry(lastTime, weightStateText, strB, weight, new PiecewiseArcEntry(fFloatValue, d(bmi == null ? 0.0f : bmi.floatValue(), entry.getStage().getFirst().intValue(), entry.getStage().getSecond().intValue()), entry.getCanAnalyze(), entry.getStage()));
        }
        if (weightEntry == null) {
            weightEntry = new WeightEntry(0L, null, null, null, null, 31, null);
        }
        this.weightView.updateWeightView(weightEntry);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        this.weightJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(FlowKt.flowCombine(this.assistService.unitChangeNotifier(), this.assistService.personInfoChangeNotifier(), new b(null)), new WeightAnalysisBindingLogic$bind$$inlined$flatMapLatest$1(null, this)), new d(null)), new e(null)), Dispatchers.getIO()), this.scope);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.weightJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.weightJob = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public WeightAnalysisView getPhnCardView() {
        return this.weightView;
    }
}
