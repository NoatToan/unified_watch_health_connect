package com.huami.module.homepage.cards.business.healthlabel;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.healthlabel.service.HealthLabelCardView;
import com.huami.lib.healthlabel.service.HealthLabelService;
import com.huami.lib.healthlabel.service.LoadData;
import com.huami.module.homepage.cards.helper.ExpandHelper;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.manager.CardType;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.tools.analytics.DbUtils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/huami/module/homepage/cards/business/healthlabel/HealthLabelBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "", "bind", "Lcom/huami/lib/healthlabel/service/HealthLabelCardView;", "getView", "close", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/lib/healthlabel/service/HealthLabelService;", GoogleApiAvailabilityLight.a, "Lcom/huami/lib/healthlabel/service/HealthLabelService;", "healthLabelService", "e", "Lcom/huami/lib/healthlabel/service/HealthLabelCardView;", "labelView", "Lkotlinx/coroutines/Job;", "f", "Lkotlinx/coroutines/Job;", "job", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HealthLabelService healthLabelService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HealthLabelCardView labelView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Job job;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/lib/healthlabel/service/LoadData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.healthlabel.HealthLabelBindingLogic$bind$1", f = "HealthLabelBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<LoadData, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LoadData loadData, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(loadData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = HealthLabelBindingLogic.this.new a(continuation);
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
            HealthLabelBindingLogic.this.labelView.updateView((LoadData) this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ParametersHolder> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ParametersHolder getA() {
            return ParametersHolderKt.parametersOf(this.a);
        }
    }

    public HealthLabelBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.scope = coroutineScope;
        this.healthLabelService = ServiceManager.INSTANCE.getHealthLabelService();
        Koin koin = ScopesAndQualifersKt.getKoin();
        this.labelView = (HealthLabelCardView) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HealthLabelCardView.class), null, new b(context));
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        this.labelView.initExpand(ExpandHelper.INSTANCE.isExpand(CardType.HEALTH_LABEL.name()));
        this.job = FlowKt.launchIn(ExteranelKt.onMainEach(this.healthLabelService.loadHealthLabel(), new a(null)), this.scope);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public HealthLabelCardView getStepCardView() {
        return this.labelView;
    }
}
