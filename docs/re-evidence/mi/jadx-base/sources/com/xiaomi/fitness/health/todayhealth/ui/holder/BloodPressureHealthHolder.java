package com.xiaomi.fitness.health.todayhealth.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.AmbulatoryBloodPressureReport;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.hq5;
import defpackage.jq5;
import defpackage.pni;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0004R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n \u0016*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\n \u0016*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\n \u0016*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001c\u0010\u001f\u001a\n \u0016*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/holder/BloodPressureHealthHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "setDateText", "()V", "requestReport", "setEmptyData", "bindData", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/widget/TextView;", "bloodPressureTypeTextView", "Landroid/widget/TextView;", "abnormalMarkingCard", "bloodPressureHealthDateTextView", "Landroid/widget/ImageView;", "bloodPressureHealthImageImageView", "Landroid/widget/ImageView;", "Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureReport;", "ambulatoryBloodPressureReport", "Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureReport;", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodPressureHealthHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "HeartHealthHolder";
    private final View abnormalMarkingCard;

    @Nullable
    private AmbulatoryBloodPressureReport ambulatoryBloodPressureReport;
    private final TextView bloodPressureHealthDateTextView;
    private final ImageView bloodPressureHealthImageImageView;
    private final TextView bloodPressureTypeTextView;
    private final Context context;

    @NotNull
    private final HealthCheckViewModel healthCheckViewModel;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private final View view;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.BloodPressureHealthHolder$requestReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.BloodPressureHealthHolder$requestReport$1", f = "BloodPressureHealthHolder.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = BloodPressureHealthHolder.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                HealthCheckViewModel healthCheckViewModel = BloodPressureHealthHolder.this.healthCheckViewModel;
                LocalDate value = BloodPressureHealthHolder.this.healthCheckViewModel.getLocalSelectDay().getValue();
                if (value == null) {
                    value = LocalDate.now();
                }
                Intrinsics.checkNotNull(value);
                StateFlow<AmbulatoryBloodPressureReport> ambulatoryBloodPressureReportByDate = healthCheckViewModel.getAmbulatoryBloodPressureReportByDate(value);
                final BloodPressureHealthHolder bloodPressureHealthHolder = BloodPressureHealthHolder.this;
                FlowCollector<? super AmbulatoryBloodPressureReport> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.BloodPressureHealthHolder.requestReport.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AmbulatoryBloodPressureReport) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
                    public final Object emit(AmbulatoryBloodPressureReport ambulatoryBloodPressureReport, Continuation<? super Unit> continuation) {
                        Integer bpRhythmStatus;
                        Object objGone;
                        if (ambulatoryBloodPressureReport == null) {
                            return Unit.INSTANCE;
                        }
                        bloodPressureHealthHolder.ambulatoryBloodPressureReport = ambulatoryBloodPressureReport;
                        AmbulatoryBloodPressureReport ambulatoryBloodPressureReport2 = bloodPressureHealthHolder.ambulatoryBloodPressureReport;
                        if (ambulatoryBloodPressureReport2 == null || (bpRhythmStatus = ambulatoryBloodPressureReport2.getBpRhythmStatus()) == null) {
                            bloodPressureHealthHolder.setEmptyData();
                            Unit unit = Unit.INSTANCE;
                        } else {
                            BloodPressureHealthHolder bloodPressureHealthHolder2 = bloodPressureHealthHolder;
                            int iIntValue = bpRhythmStatus.intValue();
                            if (iIntValue == 1) {
                                bloodPressureHealthHolder2.bloodPressureTypeTextView.setText(ExtUtilKt.getString(c0j.Sa));
                                bloodPressureHealthHolder2.bloodPressureHealthImageImageView.setImageResource(pni.f30562k);
                                View view = bloodPressureHealthHolder2.abnormalMarkingCard;
                                Intrinsics.checkNotNullExpressionValue(view, "access$getAbnormalMarkingCard$p(...)");
                                objGone = ExtUtilKt.gone(view);
                            } else if (iIntValue != 2) {
                                bloodPressureHealthHolder2.setEmptyData();
                                objGone = Unit.INSTANCE;
                            } else {
                                bloodPressureHealthHolder2.bloodPressureTypeTextView.setText(ExtUtilKt.getString(c0j.Ra));
                                bloodPressureHealthHolder2.bloodPressureHealthImageImageView.setImageResource(pni.j);
                                View view2 = bloodPressureHealthHolder2.abnormalMarkingCard;
                                Intrinsics.checkNotNullExpressionValue(view2, "access$getAbnormalMarkingCard$p(...)");
                                objGone = ExtUtilKt.visible(view2);
                            }
                            if (objGone == null) {
                                bloodPressureHealthHolder.setEmptyData();
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (ambulatoryBloodPressureReportByDate.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodPressureHealthHolder(@NotNull View view, @NotNull HealthCheckViewModel healthCheckViewModel, @NotNull LifecycleOwner lifecycleOwner) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(healthCheckViewModel, "healthCheckViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.view = view;
        this.healthCheckViewModel = healthCheckViewModel;
        this.lifecycleOwner = lifecycleOwner;
        this.context = view.getContext();
        this.bloodPressureTypeTextView = (TextView) view.findViewById(eri.v0);
        this.abnormalMarkingCard = view.findViewById(eri.e);
        this.bloodPressureHealthDateTextView = (TextView) view.findViewById(eri.t0);
        this.bloodPressureHealthImageImageView = (ImageView) view.findViewById(eri.u0);
        setEmptyData();
        requestReport();
        setDateText();
    }

    private final void requestReport() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void setDateText() {
        LocalDate value = this.healthCheckViewModel.getLocalSelectDay().getValue();
        LocalDate localDateMinusDays = value != null ? value.minusDays(1) : null;
        jq5 jq5VarB = hq5.b(ExtUtilKt.getString(c0j.i));
        String string = localDateMinusDays != null ? localDateMinusDays.toString(jq5VarB) : null;
        LocalDate value2 = this.healthCheckViewModel.getLocalSelectDay().getValue();
        this.bloodPressureHealthDateTextView.setText(this.context.getString(c0j.z7, string, value2 != null ? value2.toString(jq5VarB) : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEmptyData() {
        this.bloodPressureTypeTextView.setText(ExtUtilKt.getString(c0j.L6));
        this.bloodPressureHealthImageImageView.setImageResource(pni.i);
        View abnormalMarkingCard = this.abnormalMarkingCard;
        Intrinsics.checkNotNullExpressionValue(abnormalMarkingCard, "abnormalMarkingCard");
        ExtUtilKt.gone(abnormalMarkingCard);
    }

    public final void bindData() {
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
