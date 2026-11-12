package com.huami.module.homepage.cards.business.stressAndspo2;

import android.content.Context;
import android.view.View;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.service.Spo2Service;
import com.huami.bloodoxygen.service.other.Spo2;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.stress_service.StressEntry;
import com.huami.stress_service.StressService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import com.loc.z;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b+\u0010,J \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006."}, d2 = {"Lcom/huami/module/homepage/cards/business/stressAndspo2/PressureAndSpo2BindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "Landroid/content/Context;", "", "value", "Lkotlin/Pair;", "", "b", "a", "Landroid/view/View;", "getView", "", "bind", "close", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/bloodoxygen/service/Spo2Service;", "e", "Lcom/huami/bloodoxygen/service/Spo2Service;", "spo2Service", "Lcom/huami/stress_service/StressService;", "f", "Lcom/huami/stress_service/StressService;", "stressService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "g", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "Lcom/huami/module/homepage/cards/business/stressAndspo2/PressureAndSpo2View;", "h", "Lcom/huami/module/homepage/cards/business/stressAndspo2/PressureAndSpo2View;", ViewHierarchyConstants.VIEW_KEY, "Lkotlinx/coroutines/Job;", "i", "Lkotlinx/coroutines/Job;", "stressJob", z.j, "spO2Job", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", hl.k, "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PressureAndSpo2BindingLogic extends BindingLogic {

    @Deprecated
    public static final int HIGH = 80;

    @Deprecated
    public static final int HIGH_END = 100;

    @Deprecated
    public static final int MEDIUM = 60;

    @Deprecated
    public static final int NORMAL = 40;

    @Deprecated
    public static final int NORMAL_SPO2 = 90;

    @Deprecated
    public static final int RELAXED_START = 0;

    @NotNull
    private static final b k = new b(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Spo2Service spo2Service;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final StressService stressService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final PressureAndSpo2View view;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Job stressJob;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Job spO2Job;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.stressAndspo2.PressureAndSpo2BindingLogic$1", f = "PressureAndSpo2BindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PressureAndSpo2BindingLogic.this.new a(continuation);
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
            PressureAndSpo2BindingLogic.this.view.initView();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"com/huami/module/homepage/cards/business/stressAndspo2/PressureAndSpo2BindingLogic$b", "", "", "HIGH", LogUtil.I, "HIGH_END", "MEDIUM", "NORMAL", "NORMAL_SPO2", "RELAXED_START", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/stress_service/StressEntry;", "stress", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.stressAndspo2.PressureAndSpo2BindingLogic$bind$2", f = "PressureAndSpo2BindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<StressEntry, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ StressEntry a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StressEntry stressEntry) {
                super(0);
                this.a = stressEntry;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "stress: " + this.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable StressEntry stressEntry, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(stressEntry, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = PressureAndSpo2BindingLogic.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StressEntry stressEntry = (StressEntry) this.b;
            HMLog.info("PressureAndSpo2BindingLogic", new a(stressEntry));
            if (stressEntry != null) {
                PressureAndSpo2BindingLogic pressureAndSpo2BindingLogic = PressureAndSpo2BindingLogic.this;
                Pair pairB = pressureAndSpo2BindingLogic.b(pressureAndSpo2BindingLogic.context, stressEntry.getValue());
                PressureAndSpo2BindingLogic.this.view.setStressParam(Boxing.boxInt(stressEntry.getValue()), (String) pairB.component1(), stressEntry.getLatestTime(), ((Number) pairB.component2()).intValue());
            } else {
                PressureAndSpo2View.setStressParam$default(PressureAndSpo2BindingLogic.this.view, null, "", 0L, 0, 8, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/stress_service/StressEntry;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.stressAndspo2.PressureAndSpo2BindingLogic$bind$3", f = "PressureAndSpo2BindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function3<FlowCollector<? super StressEntry>, Throwable, Continuation<? super Unit>, Object> {
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
                return "压力数据获取异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super StressEntry> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.b = th;
            return dVar.invokeSuspend(Unit.INSTANCE);
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
            HMLog.error$default("PressureAndSpo2BindingLogic", null, null, new a(th), 6, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/bloodoxygen/service/other/Spo2;", "spo2", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.stressAndspo2.PressureAndSpo2BindingLogic$bind$5", f = "PressureAndSpo2BindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<Spo2, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Spo2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Spo2 spo2) {
                super(0);
                this.a = spo2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "spo2: " + this.a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable Spo2 spo2, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(spo2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = PressureAndSpo2BindingLogic.this.new e(continuation);
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
            Spo2 spo2 = (Spo2) this.b;
            HMLog.info("PressureAndSpo2BindingLogic", new a(spo2));
            if (spo2 != null) {
                PressureAndSpo2View pressureAndSpo2View = PressureAndSpo2BindingLogic.this.view;
                String strI18n = I18nKt.i18n(spo2.getSpo2());
                PressureAndSpo2BindingLogic pressureAndSpo2BindingLogic = PressureAndSpo2BindingLogic.this;
                pressureAndSpo2View.setSpO2Param(strI18n, pressureAndSpo2BindingLogic.a(pressureAndSpo2BindingLogic.context, spo2.getSpo2()), spo2.getTimestamp());
            } else {
                PressureAndSpo2BindingLogic.this.view.setSpO2Param(null, "", 0L);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/bloodoxygen/service/other/Spo2;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.stressAndspo2.PressureAndSpo2BindingLogic$bind$6", f = "PressureAndSpo2BindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function3<FlowCollector<? super Spo2>, Throwable, Continuation<? super Unit>, Object> {
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
                return "血氧数据获取异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Spo2> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            f fVar = new f(continuation);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.INSTANCE);
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
            HMLog.error$default("PressureAndSpo2BindingLogic", null, null, new a(th), 6, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    public PressureAndSpo2BindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.context = context;
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.spo2Service = serviceManager.getSpo2Service();
        this.stressService = serviceManager.getStressService();
        this.assistService = serviceManager.getAssistService();
        this.view = new PressureAndSpo2View(context, null, 0, 6, null);
        kotlinx.coroutines.e.f(coroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(Context context, int i) {
        if (80 <= i && i < 90) {
            return context.getString(R.string.homepage_item_card_spo2_level_exception);
        }
        return 90 <= i && i <= 100 ? context.getString(R.string.homepage_item_card_spo2_level_normal) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, Integer> b(Context context, int i) {
        if (i >= 0 && i < 40) {
            return TuplesKt.to(context.getString(R.string.homepage_item_card_stress_level_relax), Integer.valueOf(R.color.s15));
        }
        if (40 <= i && i < 60) {
            return TuplesKt.to(context.getString(R.string.homepage_item_card_stress_level_normal), Integer.valueOf(R.color.s20));
        }
        if (60 <= i && i < 80) {
            return TuplesKt.to(context.getString(R.string.homepage_item_card_stress_level_medium), Integer.valueOf(R.color.s33));
        }
        return 80 <= i && i <= 100 ? TuplesKt.to(context.getString(R.string.homepage_item_card_stress_level_high), Integer.valueOf(R.color.s31)) : TuplesKt.to("", Integer.valueOf(R.color.s15));
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        this.stressJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new PressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$1(null, this)), new c(null)), new d(null)), Dispatchers.getIO()), this.scope);
        this.spO2Job = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new PressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2(null, this)), new e(null)), new f(null)), Dispatchers.getIO()), this.scope);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.stressJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.stressJob = null;
        Job job2 = this.spO2Job;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.spO2Job = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView */
    public View getHealthStateView() {
        return this.view;
    }
}
