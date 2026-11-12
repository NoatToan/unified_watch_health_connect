package com.huami.module.homepage.cards.business.healthstate;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure.service.BloodPressureEntry;
import com.huami.bloodpressure.service.IBloodPressureExpireUIService;
import com.huami.bloodpressure.service.IBloodPressureService;
import com.huami.health.service.HealthEntry;
import com.huami.health.service.HealthService;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import com.loc.z;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/huami/module/homepage/cards/business/healthstate/HealthStateBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "", "b", "a", "", "value", "", "isFloat", "c", "Lcom/huami/module/homepage/cards/business/healthstate/HealthStateCardView;", "getView", "bind", "close", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/health/service/HealthService;", GoogleApiAvailabilityLight.a, "Lcom/huami/health/service/HealthService;", "healthService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "e", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "Lcom/huami/bloodpressure/service/IBloodPressureService;", "f", "Lcom/huami/bloodpressure/service/IBloodPressureService;", "bpService", "Lcom/huami/bloodpressure/service/IBloodPressureExpireUIService;", "g", "Lcom/huami/bloodpressure/service/IBloodPressureExpireUIService;", "bpUiService", "Lkotlinx/coroutines/Job;", "h", "Lkotlinx/coroutines/Job;", "healthStateJob", "i", "calibrationJob", z.j, "Lcom/huami/module/homepage/cards/business/healthstate/HealthStateCardView;", "healthStateView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HealthStateBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HealthService healthService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureService bpService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureExpireUIService bpUiService;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Job healthStateJob;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Job calibrationJob;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final HealthStateCardView healthStateView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.healthstate.HealthStateBindingLogic$1", f = "HealthStateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthStateBindingLogic.this.new a(continuation);
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
            HealthStateBindingLogic.this.healthStateView.initView();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "calibrationExpired", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.healthstate.HealthStateBindingLogic$handleBloodPressureCalibration$2", f = "HealthStateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(boolean z, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = HealthStateBindingLogic.this.new b(continuation);
            bVar.b = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthStateBindingLogic.this.healthStateView.updateBloodPressureState(this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.healthstate.HealthStateBindingLogic$handleBloodPressureCalibration$3", f = "HealthStateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
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
                return "血压校准数据异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            c cVar = new c(continuation);
            cVar.b = th;
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
            HMLog.error$default("HealthStateBindingLogic", null, null, new a((Throwable) this.b), 6, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/huami/health/service/HealthEntry;", "bloodSugar", "", "bloodPressure", "Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.healthstate.HealthStateBindingLogic$handleHealthState$1$1", f = "HealthStateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function3<HealthEntry, Object, Continuation<? super Pair<? extends Object, ? extends HealthEntry>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable HealthEntry healthEntry, @Nullable Object obj, @Nullable Continuation<? super Pair<? extends Object, HealthEntry>> continuation) {
            d dVar = new d(continuation);
            dVar.b = healthEntry;
            dVar.c = obj;
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
            return TuplesKt.to(this.c, (HealthEntry) this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "Lcom/huami/health/service/HealthEntry;", "healthData", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.healthstate.HealthStateBindingLogic$handleHealthState$1$2", f = "HealthStateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<Pair<? extends Object, ? extends HealthEntry>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Pair<? extends Object, HealthEntry> pair, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = HealthStateBindingLogic.this.new e(continuation);
            eVar.b = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0015  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            String value;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.b;
            Object first = pair.getFirst();
            String strC = null;
            if (first == null) {
                str = null;
            } else {
                HealthStateBindingLogic healthStateBindingLogic = HealthStateBindingLogic.this;
                if (first instanceof BloodPressureEntry) {
                    BloodPressureEntry bloodPressureEntry = (BloodPressureEntry) first;
                    str = ((Object) I18nKt.i18n(bloodPressureEntry.getSbp())) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + ((Object) I18nKt.i18n(bloodPressureEntry.getDbp()));
                } else if (first instanceof HealthEntry) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) ((HealthEntry) first).getValue(), new String[]{","}, false, 0, 6, (Object) null);
                    str = ((Object) HealthStateBindingLogic.d(healthStateBindingLogic, (String) CollectionsKt.first(listSplit$default), false, 2, null)) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + ((Object) HealthStateBindingLogic.d(healthStateBindingLogic, (String) CollectionsKt.last(listSplit$default), false, 2, null));
                } else {
                    str = null;
                }
            }
            HealthStateCardView healthStateCardView = HealthStateBindingLogic.this.healthStateView;
            HealthEntry healthEntry = (HealthEntry) pair.getSecond();
            if (healthEntry != null && (value = healthEntry.getValue()) != null) {
                strC = HealthStateBindingLogic.this.c(value, true);
            }
            healthStateCardView.updateView(str, strC);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "Lcom/huami/health/service/HealthEntry;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.healthstate.HealthStateBindingLogic$handleHealthState$2", f = "HealthStateBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends Object, ? extends HealthEntry>>, Throwable, Continuation<? super Unit>, Object> {
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
                return "身体状态数据获取异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Pair<? extends Object, HealthEntry>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
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
            HMLog.error$default("HealthStateBindingLogic", null, null, new a(th), 6, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    public HealthStateBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.healthService = serviceManager.getHealthStateService();
        this.assistService = serviceManager.getAssistService();
        this.bpService = serviceManager.getBloodPressureService();
        this.bpUiService = serviceManager.getBloodPressureExpireUIService();
        this.healthStateView = new HealthStateCardView(context, null, 0, 6, null);
        kotlinx.coroutines.e.f(coroutineScope, null, null, new a(null), 3, null);
    }

    private final void a() {
        this.calibrationJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new HealthStateBindingLogic$handleBloodPressureCalibration$$inlined$flatMapLatest$1(null, this)), new b(null)), new c(null)), Dispatchers.getIO()), this.scope);
    }

    private final void b() {
        this.healthStateJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new HealthStateBindingLogic$handleHealthState$$inlined$flatMapLatest$1(null, this)), new f(null)), Dispatchers.getIO()), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String value, boolean isFloat) {
        try {
            value = isFloat ? I18nKt.i18n$default(Float.parseFloat(value), 0, 1, null) : I18nKt.i18n(Integer.parseInt(value));
        } catch (Exception unused) {
        }
        return value;
    }

    public static /* synthetic */ String d(HealthStateBindingLogic healthStateBindingLogic, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return healthStateBindingLogic.c(str, z);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        b();
        a();
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.healthStateJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.healthStateJob = null;
        Job job2 = this.calibrationJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.calibrationJob = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public HealthStateCardView getHealthStateView() {
        return this.healthStateView;
    }
}
