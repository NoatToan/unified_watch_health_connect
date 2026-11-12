package com.xiaomi.fitness.v2.holder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;
import defpackage.c0j;
import defpackage.nf2;
import defpackage.pni;
import defpackage.qxi;
import defpackage.w7e;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 22\u00020\u0001:\u00012B)\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b0\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/v2/holder/TodayHealthViewHolder;", "Lnf2;", "", "showEmpty", "()V", "bindData", "", "checkedCount", "updateProgress", "(I)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lw7e;", "binding", "Lw7e;", "getBinding", "()Lw7e;", "Landroidx/lifecycle/LifecycleOwner;", "mLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "cardTitleView", "Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "xAxisView", "Lcom/xiaomi/fitness/homepage/viewholder/XAxisView;", "Landroid/view/View;", "emptySpace", "Landroid/view/View;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivEmpty", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "supportedCount", "I", "Lorg/joda/time/LocalDate;", "currentDate", "Lorg/joda/time/LocalDate;", "getCurrentDate", "()Lorg/joda/time/LocalDate;", "setCurrentDate", "(Lorg/joda/time/LocalDate;)V", "<init>", "(Landroid/content/Context;Lw7e;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TodayHealthViewHolder extends nf2 {

    @NotNull
    public static final String TAG = "TodayHealthViewHolder";

    @NotNull
    private final w7e binding;

    @NotNull
    private final HomeCardCommonTitleView cardTitleView;

    @NotNull
    private final Context context;

    @NotNull
    private LocalDate currentDate;

    @NotNull
    private final View emptySpace;

    @Nullable
    private final HealthCheckViewModel healthCheckViewModel;

    @NotNull
    private final AppCompatImageView ivEmpty;

    @NotNull
    private final LifecycleOwner mLifecycleOwner;

    @NotNull
    private final ProgressBar progressBar;
    private int supportedCount;

    @NotNull
    private final XAxisView xAxisView;

    /* JADX INFO: renamed from: com.xiaomi.fitness.v2.holder.TodayHealthViewHolder$bindData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.v2.holder.TodayHealthViewHolder$bindData$1", f = "TodayHealthViewHolder.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.v2.holder.TodayHealthViewHolder$bindData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "map", "Ljava/util/HashMap;", "", "", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.v2.holder.TodayHealthViewHolder$bindData$1$1", f = "TodayHealthViewHolder.kt", i = {0, 1}, l = {86, 88}, m = "invokeSuspend", n = {"map", "map"}, s = {"L$0", "L$0"})
        public static final class C08031 extends SuspendLambda implements Function2<HashMap<Integer, Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TodayHealthViewHolder this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.v2.holder.TodayHealthViewHolder$bindData$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.v2.holder.TodayHealthViewHolder$bindData$1$1$1", f = "TodayHealthViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C08041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ HashMap<Integer, Boolean> $map;
                int label;
                final /* synthetic */ TodayHealthViewHolder this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08041(TodayHealthViewHolder todayHealthViewHolder, HashMap<Integer, Boolean> map, Continuation<? super C08041> continuation) {
                    super(2, continuation);
                    this.this$0 = todayHealthViewHolder;
                    this.$map = map;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C08041(this.this$0, this.$map, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.updateProgress(this.$map.size());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C08041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08031(TodayHealthViewHolder todayHealthViewHolder, Continuation<? super C08031> continuation) {
                super(2, continuation);
                this.this$0 = todayHealthViewHolder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08031 c08031 = new C08031(this.this$0, continuation);
                c08031.L$0 = obj;
                return c08031;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                HashMap map;
                HashMap map2;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        map = (HashMap) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map2 = (HashMap) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Logger.i(TodayHealthViewHolder.TAG, "bindData map = " + map2 + ", supportedCount=" + this.this$0.supportedCount);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                map = (HashMap) this.L$0;
                if (map.isEmpty()) {
                    this.L$0 = map;
                    this.label = 1;
                    if (DelayKt.delay(777L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C08041 c08041 = new C08041(this.this$0, map, null);
                this.L$0 = map;
                this.label = 2;
                if (BuildersKt.withContext(main, c08041, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map2 = map;
                Logger.i(TodayHealthViewHolder.TAG, "bindData map = " + map2 + ", supportedCount=" + this.this$0.supportedCount);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HashMap<Integer, Boolean> map, Continuation<? super Unit> continuation) {
                return ((C08031) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TodayHealthViewHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<HashMap<Integer, Boolean>> checkedItemMapStateFlowByDate = TodayHealthViewHolder.this.healthCheckViewModel.getCheckedItemMapStateFlowByDate(TodayHealthViewHolder.this.getCurrentDate());
                C08031 c08031 = new C08031(TodayHealthViewHolder.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(checkedItemMapStateFlowByDate, c08031, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayHealthViewHolder(@NotNull Context context, @NotNull w7e binding, @NotNull LifecycleOwner mLifecycleOwner, @Nullable HealthCheckViewModel healthCheckViewModel) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(mLifecycleOwner, "mLifecycleOwner");
        this.context = context;
        this.binding = binding;
        this.mLifecycleOwner = mLifecycleOwner;
        this.healthCheckViewModel = healthCheckViewModel;
        HomeCardCommonTitleView cardTitleView = binding.A;
        Intrinsics.checkNotNullExpressionValue(cardTitleView, "cardTitleView");
        this.cardTitleView = cardTitleView;
        XAxisView xAxisView = binding.F;
        Intrinsics.checkNotNullExpressionValue(xAxisView, "xAxisView");
        this.xAxisView = xAxisView;
        View emptySpace = binding.C;
        Intrinsics.checkNotNullExpressionValue(emptySpace, "emptySpace");
        this.emptySpace = emptySpace;
        AppCompatImageView ivEmpty = binding.D;
        Intrinsics.checkNotNullExpressionValue(ivEmpty, "ivEmpty");
        this.ivEmpty = ivEmpty;
        ProgressBar progressBar = binding.E;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        this.progressBar = progressBar;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this.currentDate = localDateNow;
        cardTitleView.updateCardBgAndTitle(pni.A, c0j.Gc);
        this.supportedCount = (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) ? 6 : 8;
        if (healthCheckViewModel != null) {
            healthCheckViewModel.setForceRefreshAll(true);
        }
    }

    private final void showEmpty() {
        ViewExtKt.setVisible(this.emptySpace, true);
        ViewExtKt.setVisible(this.ivEmpty, true);
        ViewExtKt.setVisible(this.progressBar, false);
        HomeCardCommonTitleView.showEmpty$default(this.cardTitleView, ExtUtilKt.getString(c0j.Qb), null, 2, null);
        this.xAxisView.setTxtXAxis1(this.context.getResources().getQuantityString(qxi.p, 0, 0));
        XAxisView xAxisView = this.xAxisView;
        Resources resources = this.context.getResources();
        int i = qxi.p;
        int i2 = this.supportedCount;
        xAxisView.setTxtXAxis3(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
    }

    public final void bindData() {
        HealthCheckViewModel healthCheckViewModel = this.healthCheckViewModel;
        if (healthCheckViewModel == null) {
            return;
        }
        Job healthObservationJob = healthCheckViewModel.getHealthObservationJob();
        if (healthObservationJob != null) {
            Job.DefaultImpls.cancel$default(healthObservationJob, (CancellationException) null, 1, (Object) null);
        }
        LocalDate localDateNow = LocalDate.now();
        this.currentDate = localDateNow;
        this.healthCheckViewModel.refreshData(localDateNow);
        HealthCheckViewModel healthCheckViewModel2 = this.healthCheckViewModel;
        healthCheckViewModel2.setHealthObservationJob(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(healthCheckViewModel2), null, null, new AnonymousClass1(null), 3, null));
    }

    @NotNull
    public final w7e getBinding() {
        return this.binding;
    }

    @NotNull
    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    public final void setCurrentDate(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<set-?>");
        this.currentDate = localDate;
    }

    public final void updateProgress(int checkedCount) {
        if (checkedCount == 0) {
            showEmpty();
            OnLoadDataListener onLoadDataListener = this.onLoadDataListener;
            if (onLoadDataListener != null) {
                onLoadDataListener.onLoadData(false);
                return;
            }
            return;
        }
        ViewExtKt.setVisible(this.emptySpace, false);
        ViewExtKt.setVisible(this.ivEmpty, false);
        ViewExtKt.setVisible(this.progressBar, true);
        this.progressBar.setProgress((int) ((100 * checkedCount) / this.supportedCount));
        String date = TimeUtils.formatDate(ExtUtilKt.getString(c0j.h), Long.valueOf(System.currentTimeMillis()));
        HomeCardCommonTitleView homeCardCommonTitleView = this.cardTitleView;
        String quantityString = this.context.getResources().getQuantityString(qxi.n, checkedCount, Integer.valueOf(checkedCount));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        homeCardCommonTitleView.showValueAndDesc(quantityString, date);
        this.xAxisView.setTxtXAxis1(this.context.getResources().getQuantityString(qxi.p, 0, 0));
        XAxisView xAxisView = this.xAxisView;
        Resources resources = this.context.getResources();
        int i = qxi.p;
        int i2 = this.supportedCount;
        xAxisView.setTxtXAxis3(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        OnLoadDataListener onLoadDataListener2 = this.onLoadDataListener;
        if (onLoadDataListener2 != null) {
            onLoadDataListener2.onLoadData(true);
        }
    }
}
