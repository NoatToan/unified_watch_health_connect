package com.xiaomi.fitness.training_plan.report;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.common.PlanReportSummary;
import com.xiaomi.fitness.training_plan.util.TrainingDataUtils;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.avp;
import defpackage.cvp;
import defpackage.cyi;
import defpackage.ioi;
import defpackage.k1j;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;", "summary", "", "updateBasicTrainInfo", "(Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;)V", "", CommonConstants.KEY_USER_NAME, "avatarAddress", "updateUserInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "Lavp;", "binding", "Lavp;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfoAdapter;", "mTrainingPlanLayoutReportBasicInfoAdapter", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfoAdapter;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TrainingPlanLayoutReportBasicInfoAdapter", "DiffCallback", "TrainingPlanLayoutReportBasicInfo", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrainPlanReportBasicInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainPlanReportBasicInfoView.kt\ncom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,214:1\n54#2,3:215\n24#2:218\n59#2,6:219\n54#2,3:225\n24#2:228\n59#2,6:229\n*S KotlinDebug\n*F\n+ 1 TrainPlanReportBasicInfoView.kt\ncom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView\n*L\n137#1:215,3\n137#1:218\n137#1:219,6\n143#1:225,3\n143#1:228\n143#1:229,6\n*E\n"})
public final class TrainPlanReportBasicInfoView extends ConstraintLayout {

    @NotNull
    private final avp binding;

    @NotNull
    private final TrainingPlanLayoutReportBasicInfoAdapter mTrainingPlanLayoutReportBasicInfoAdapter;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfo;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfo;Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfo;)Z", "areContentsTheSame", "<init>", "()V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<TrainingPlanLayoutReportBasicInfo> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull TrainingPlanLayoutReportBasicInfo oldItem, @NotNull TrainingPlanLayoutReportBasicInfo newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getDes(), newItem.getDes());
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull TrainingPlanLayoutReportBasicInfo oldItem, @NotNull TrainingPlanLayoutReportBasicInfo newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getDes(), newItem.getDes());
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfo;", "", "value", "", "unit", "des", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getUnit", "getDes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrainingPlanLayoutReportBasicInfo {

        @NotNull
        private final String des;

        @NotNull
        private final String unit;

        @NotNull
        private final String value;

        public TrainingPlanLayoutReportBasicInfo(@NotNull String value, @NotNull String unit, @NotNull String des) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unit, "unit");
            Intrinsics.checkNotNullParameter(des, "des");
            this.value = value;
            this.unit = unit;
            this.des = des;
        }

        public static /* synthetic */ TrainingPlanLayoutReportBasicInfo copy$default(TrainingPlanLayoutReportBasicInfo trainingPlanLayoutReportBasicInfo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = trainingPlanLayoutReportBasicInfo.value;
            }
            if ((i & 2) != 0) {
                str2 = trainingPlanLayoutReportBasicInfo.unit;
            }
            if ((i & 4) != 0) {
                str3 = trainingPlanLayoutReportBasicInfo.des;
            }
            return trainingPlanLayoutReportBasicInfo.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDes() {
            return this.des;
        }

        @NotNull
        public final TrainingPlanLayoutReportBasicInfo copy(@NotNull String value, @NotNull String unit, @NotNull String des) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unit, "unit");
            Intrinsics.checkNotNullParameter(des, "des");
            return new TrainingPlanLayoutReportBasicInfo(value, unit, des);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainingPlanLayoutReportBasicInfo)) {
                return false;
            }
            TrainingPlanLayoutReportBasicInfo trainingPlanLayoutReportBasicInfo = (TrainingPlanLayoutReportBasicInfo) other;
            return Intrinsics.areEqual(this.value, trainingPlanLayoutReportBasicInfo.value) && Intrinsics.areEqual(this.unit, trainingPlanLayoutReportBasicInfo.unit) && Intrinsics.areEqual(this.des, trainingPlanLayoutReportBasicInfo.des);
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }

        @NotNull
        public final String getUnit() {
            return this.unit;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((this.value.hashCode() * 31) + this.unit.hashCode()) * 31) + this.des.hashCode();
        }

        @NotNull
        public String toString() {
            return "TrainingPlanLayoutReportBasicInfo(value=" + this.value + ", unit=" + this.unit + ", des=" + this.des + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfoAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfo;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "<init>", "()V", "ItemViewHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class TrainingPlanLayoutReportBasicInfoAdapter extends p<TrainingPlanLayoutReportBasicInfo, RecyclerView.d0> {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfoAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfo;", "entity", "", "bind", "(Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfo;)V", "Lcvp;", "binding", "Lcvp;", "<init>", "(Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView$TrainingPlanLayoutReportBasicInfoAdapter;Lcvp;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public final class ItemViewHolder extends RecyclerView.d0 {

            @NotNull
            private final cvp binding;
            final /* synthetic */ TrainingPlanLayoutReportBasicInfoAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemViewHolder(@NotNull TrainingPlanLayoutReportBasicInfoAdapter trainingPlanLayoutReportBasicInfoAdapter, cvp binding) {
                super(binding.getRoot());
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.this$0 = trainingPlanLayoutReportBasicInfoAdapter;
                this.binding = binding;
            }

            public final void bind(@NotNull TrainingPlanLayoutReportBasicInfo entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                this.binding.C.setText(entity.getValue());
                this.binding.B.setText(entity.getUnit());
                this.binding.A.setText(entity.getDes());
            }
        }

        public TrainingPlanLayoutReportBasicInfoAdapter() {
            super(new DiffCallback());
        }

        @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return getCurrentList().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            TrainingPlanLayoutReportBasicInfo trainingPlanLayoutReportBasicInfo = getCurrentList().get(position);
            if (holder instanceof ItemViewHolder) {
                Intrinsics.checkNotNull(trainingPlanLayoutReportBasicInfo);
                ((ItemViewHolder) holder).bind(trainingPlanLayoutReportBasicInfo);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            cvp cvpVarA0 = cvp.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(cvpVarA0, "inflate(...)");
            return new ItemViewHolder(this, cvpVarA0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrainPlanReportBasicInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void updateBasicTrainInfo(@NotNull PlanReportSummary summary) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        int planType = summary.getPlanType();
        if (planType == 1) {
            ConstraintLayout abilityBasicView = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(abilityBasicView, "abilityBasicView");
            ViewExtKt.gone(abilityBasicView);
            ConstraintLayout habitBasicView = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(habitBasicView, "habitBasicView");
            ViewExtKt.visible(habitBasicView);
            this.binding.D.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.w, summary.getFinishTimes(), Integer.valueOf(summary.getFinishTimes())));
        } else if (planType == 2) {
            ConstraintLayout habitBasicView2 = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(habitBasicView2, "habitBasicView");
            ViewExtKt.gone(habitBasicView2);
            ConstraintLayout abilityBasicView2 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(abilityBasicView2, "abilityBasicView");
            ViewExtKt.visible(abilityBasicView2);
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(cyi.v, summary.getFinishCourseCount(), Integer.valueOf(summary.getFinishCourseCount()), Integer.valueOf(summary.getTotalCourseCount()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            TextView textView = this.binding.H;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(ResourceExtKt.getString(k1j.u1), Arrays.copyOf(new Object[]{quantityString}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
            int i = 100;
            int progress = (int) (summary.getProgress() * 100);
            if (progress < 0) {
                i = 0;
            } else if (progress <= 100) {
                i = progress;
            }
            this.binding.G.setText(String.valueOf(i));
            this.binding.I.setProgress(i);
        }
        ArrayList arrayList = new ArrayList();
        TrainingDataUtils trainingDataUtils = TrainingDataUtils.INSTANCE;
        Pair<String, String> pairHandleTotalDuration = trainingDataUtils.handleTotalDuration(summary.getTotalDuration());
        Pair<String, String> pairHandleTotalDistance = trainingDataUtils.handleTotalDistance(summary.getTotalDistance());
        arrayList.add(new TrainingPlanLayoutReportBasicInfo(pairHandleTotalDistance.getFirst(), pairHandleTotalDistance.getSecond(), ResourceExtKt.getString(k1j.s0)));
        arrayList.add(new TrainingPlanLayoutReportBasicInfo(pairHandleTotalDuration.getFirst(), pairHandleTotalDuration.getSecond(), ResourceExtKt.getString(k1j.t0)));
        String strValueOf = String.valueOf((int) summary.getTotalCalorie());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        arrayList.add(new TrainingPlanLayoutReportBasicInfo(strValueOf, ResourceExtKt.getQuantityString(context, cyi.common_unit_calorie, (int) summary.getTotalCalorie(), Integer.valueOf((int) summary.getTotalCalorie())), ResourceExtKt.getString(k1j.r0)));
        if (summary.getPlanType() == 1) {
            String strValueOf2 = String.valueOf(summary.getFinishTimes());
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            arrayList.add(new TrainingPlanLayoutReportBasicInfo(strValueOf2, ResourceExtKt.getQuantityString(context2, cyi.i, summary.getTotalDays(), Integer.valueOf(summary.getTotalDays())), ResourceExtKt.getString(k1j.m1)));
        } else {
            String strValueOf3 = String.valueOf(summary.getFinishTimes());
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            arrayList.add(new TrainingPlanLayoutReportBasicInfo(strValueOf3, ResourceExtKt.getQuantityString(context3, cyi.i, summary.getTotalDays(), Integer.valueOf(summary.getTotalDays())), ResourceExtKt.getString(k1j.u0)));
        }
        this.mTrainingPlanLayoutReportBasicInfoAdapter.submitList(arrayList);
    }

    public final void updateUserInfo(@Nullable String userName, @Nullable String avatarAddress) {
        RoundImageView trainUserIcon = this.binding.M;
        Intrinsics.checkNotNullExpressionValue(trainUserIcon, "trainUserIcon");
        ImageLoader imageLoader = Coil.imageLoader(trainUserIcon.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(trainUserIcon.getContext()).data(avatarAddress).target(trainUserIcon);
        builderTarget.allowHardware(false);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        builderTarget.bitmapConfig(config);
        builderTarget.placeholder(ioi.K);
        builderTarget.error(ioi.K);
        imageLoader.enqueue(builderTarget.build());
        RoundImageView habitTrainUserIcon = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(habitTrainUserIcon, "habitTrainUserIcon");
        ImageLoader imageLoader2 = Coil.imageLoader(habitTrainUserIcon.getContext());
        ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(habitTrainUserIcon.getContext()).data(avatarAddress).target(habitTrainUserIcon);
        builderTarget2.allowHardware(false);
        builderTarget2.bitmapConfig(config);
        builderTarget2.placeholder(ioi.K);
        builderTarget2.error(ioi.K);
        imageLoader2.enqueue(builderTarget2.build());
        this.binding.N.setText(userName != null ? userName : "");
        TextView textView = this.binding.E;
        if (userName == null) {
            userName = "";
        }
        textView.setText(userName);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrainPlanReportBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TrainPlanReportBasicInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrainPlanReportBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        avp avpVarA0 = avp.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(avpVarA0, "inflate(...)");
        this.binding = avpVarA0;
        TrainingPlanLayoutReportBasicInfoAdapter trainingPlanLayoutReportBasicInfoAdapter = new TrainingPlanLayoutReportBasicInfoAdapter();
        this.mTrainingPlanLayoutReportBasicInfoAdapter = trainingPlanLayoutReportBasicInfoAdapter;
        avpVarA0.L.setLayoutManager(new GridLayoutManager(context, 2));
        avpVarA0.L.setAdapter(trainingPlanLayoutReportBasicInfoAdapter);
    }
}
