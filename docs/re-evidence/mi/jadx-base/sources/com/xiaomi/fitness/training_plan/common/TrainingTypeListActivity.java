package com.xiaomi.fitness.training_plan.common;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.baseui.view.TipType;
import com.xiaomi.fitness.baseui.view.TipViewKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanDetailActivity;
import com.xiaomi.fitness.training_plan.common.TrainingTypeListActivity;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeActivity;
import com.xiaomi.fitness.training_plan.net.GetPlanTypeListResult;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.model.PlanType;
import com.xiaomi.fitness.training_plan_export.utils.DialogUtils;
import com.xiaomi.fitness.training_plan_export.utils.TrainingEventUtils;
import com.xiaomi.fitness.training_plan_export.utils.UIDataUtils;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import defpackage.csi;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.uo0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002$%B\u0007¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00000\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0014\u0010\"\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\n¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/common/TrainingTypeListVM;", "Luo0;", "", "initView", "()V", "loadData", "", "getOpenedPlanType", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "Lcom/xiaomi/fitness/training_plan_export/model/PlanType;", "trainingTypeList", "Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity$TrainingTypeHolder;", "trainingTypeAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "", "hasHabitHistory", "Z", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "TrainingTypeHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrainingTypeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingTypeListActivity.kt\ncom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1863#2,2:234\n*S KotlinDebug\n*F\n+ 1 TrainingTypeListActivity.kt\ncom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity\n*L\n216#1:234,2\n*E\n"})
public final class TrainingTypeListActivity extends Hilt_TrainingTypeListActivity<TrainingTypeListVM, uo0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "TrainingTypeListActivity";
    private boolean hasHabitHistory;
    private RecyclerView.Adapter<TrainingTypeHolder> trainingTypeAdapter;

    @NotNull
    private final List<PlanType> trainingTypeList = new ArrayList();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity$Companion;", "", "<init>", "()V", "TAG", "", "launch", "", "context", "Landroid/content/Context;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent();
            intent.setClass(context, TrainingTypeListActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity$TrainingTypeHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "actionTV", "Landroid/widget/TextView;", "getActionTV", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "typeBgImg", "Landroid/widget/ImageView;", "getTypeBgImg", "()Landroid/widget/ImageView;", "typeNameTV", "getTypeNameTV", "typeTipTV", "getTypeTipTV", "typeUserIcon", "getTypeUserIcon", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity;Landroid/view/View;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TrainingTypeHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView actionTV;
        final /* synthetic */ TrainingTypeListActivity this$0;

        @NotNull
        private final ImageView typeBgImg;

        @NotNull
        private final TextView typeNameTV;

        @NotNull
        private final TextView typeTipTV;

        @NotNull
        private final ImageView typeUserIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrainingTypeHolder(@NotNull TrainingTypeListActivity trainingTypeListActivity, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = trainingTypeListActivity;
            View viewFindViewById = itemView.findViewById(csi.R4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.actionTV = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(csi.S4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.typeBgImg = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(csi.K4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.typeNameTV = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(csi.L4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.typeTipTV = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(csi.V4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.typeUserIcon = (ImageView) viewFindViewById5;
        }

        @NotNull
        public final TextView getActionTV() {
            return this.actionTV;
        }

        @NotNull
        public final ImageView getTypeBgImg() {
            return this.typeBgImg;
        }

        @NotNull
        public final TextView getTypeNameTV() {
            return this.typeNameTV;
        }

        @NotNull
        public final TextView getTypeTipTV() {
            return this.typeTipTV;
        }

        @NotNull
        public final ImageView getTypeUserIcon() {
            return this.typeUserIcon;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.common.TrainingTypeListActivity$onCreate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"com/xiaomi/fitness/training_plan/common/TrainingTypeListActivity$onCreate$2", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity$TrainingTypeHolder;", "Lcom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTrainingTypeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingTypeListActivity.kt\ncom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity$onCreate$2\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,233:1\n54#2,3:234\n24#2:237\n57#2,6:238\n63#2,2:245\n54#2,3:247\n24#2:250\n57#2,6:251\n63#2,2:258\n57#3:244\n57#3:257\n*S KotlinDebug\n*F\n+ 1 TrainingTypeListActivity.kt\ncom/xiaomi/fitness/training_plan/common/TrainingTypeListActivity$onCreate$2\n*L\n103#1:234,3\n103#1:237\n103#1:238,6\n103#1:245,2\n104#1:247,3\n104#1:250\n104#1:251,6\n104#1:258,2\n103#1:244\n104#1:257\n*E\n"})
    public static final class AnonymousClass2 extends RecyclerView.Adapter<TrainingTypeHolder> {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$1(PlanType item, TrainingTypeListActivity this$0, View view) {
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (PlanModelsKt.isMade(item)) {
                int planType = item.getPlanType();
                if (planType == 1) {
                    HabitPlanHomeActivity.INSTANCE.launchHabitHomeActivity(this$0, item.getPlanId());
                    return;
                } else {
                    if (planType != 2) {
                        return;
                    }
                    AbilityPlanDetailActivity.INSTANCE.launchWithPlanId(this$0, item.getPlanId());
                    return;
                }
            }
            if (this$0.getOpenedPlanType() == 0) {
                int planType2 = item.getPlanType();
                if (planType2 == 1) {
                    ITrainingManager.DefaultImpls.showHabitCreatePlanDialog$default(TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE), this$0, this$0.hasHabitHistory, false, 4, null);
                    return;
                } else {
                    if (planType2 != 2) {
                        return;
                    }
                    SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).startUserIndicatorsActivityForCreateAbilityPlan(this$0);
                    return;
                }
            }
            UIDataUtils.ListTypeRes typeListRes = item.getPlanType() == 1 ? UIDataUtils.INSTANCE.getTypeListRes(2) : UIDataUtils.INSTANCE.getTypeListRes(1);
            DialogUtils dialogUtils = DialogUtils.INSTANCE;
            int i = k1j.H1;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = this$0.getString(k1j.C0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Object[] objArr = new Object[2];
            objArr[0] = typeListRes != null ? this$0.getString(typeListRes.getNameRes()) : "";
            objArr[1] = typeListRes != null ? this$0.getString(typeListRes.getNameRes()) : "";
            String str = String.format(string, Arrays.copyOf(objArr, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            dialogUtils.showSimpleTipDialog(this$0, i, str);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return TrainingTypeListActivity.this.trainingTypeList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(TrainingTypeHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            final PlanType planType = (PlanType) TrainingTypeListActivity.this.trainingTypeList.get(position);
            UIDataUtils.ListTypeRes typeListRes = UIDataUtils.INSTANCE.getTypeListRes(planType.getPlanType());
            if (typeListRes != null) {
                ImageView typeBgImg = holder.getTypeBgImg();
                Coil.imageLoader(typeBgImg.getContext()).enqueue(new ImageRequest.Builder(typeBgImg.getContext()).data(Integer.valueOf(typeListRes.getBgRes())).target(typeBgImg).build());
                ImageView typeUserIcon = holder.getTypeUserIcon();
                Coil.imageLoader(typeUserIcon.getContext()).enqueue(new ImageRequest.Builder(typeUserIcon.getContext()).data(Integer.valueOf(typeListRes.getUserIconRes())).target(typeUserIcon).build());
                holder.getActionTV().setTextColor(TrainingTypeListActivity.this.getColor(typeListRes.getColor()));
                holder.getTypeNameTV().setText(TrainingTypeListActivity.this.getString(typeListRes.getNameRes()));
                holder.getTypeTipTV().setText(TrainingTypeListActivity.this.getString(typeListRes.getTipRes()));
                holder.getTypeNameTV().setTextColor(TrainingTypeListActivity.this.getColor(typeListRes.getColor()));
                holder.getTypeTipTV().setTextColor(TrainingTypeListActivity.this.getColor(typeListRes.getColor()));
            }
            ViewExtKt.visible(holder.getActionTV());
            holder.getActionTV().setText(PlanModelsKt.isMade(planType) ? TrainingTypeListActivity.this.getString(k1j.G1) : TrainingTypeListActivity.this.getString(k1j.F1));
            ImageView typeBgImg2 = holder.getTypeBgImg();
            final TrainingTypeListActivity trainingTypeListActivity = TrainingTypeListActivity.this;
            typeBgImg2.setOnClickListener(new View.OnClickListener() { // from class: gwp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainingTypeListActivity.AnonymousClass2.onBindViewHolder$lambda$1(planType, trainingTypeListActivity, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public TrainingTypeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(TrainingTypeListActivity.this).inflate(jvi.T, (ViewGroup) null);
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, ExtUtilsKt.getDp(120)));
            TrainingTypeListActivity trainingTypeListActivity = TrainingTypeListActivity.this;
            Intrinsics.checkNotNull(viewInflate);
            return new TrainingTypeHolder(trainingTypeListActivity, viewInflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOpenedPlanType() {
        int planType = 0;
        for (PlanType planType2 : this.trainingTypeList) {
            if (PlanModelsKt.isMade(planType2)) {
                planType = planType2.getPlanType();
            }
        }
        return planType;
    }

    private final FitnessServerSyncer getServerSyncer() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((TrainingTypeListVM) getMViewModel()).getTrainPlanListResult().observe(this, new TrainingTypeListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fwp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrainingTypeListActivity.initView$lambda$3(this.f18328a, (GetPlanTypeListResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$3(final TrainingTypeListActivity this$0, GetPlanTypeListResult getPlanTypeListResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        RecyclerView.Adapter<TrainingTypeHolder> adapter = null;
        List<PlanType> planList = getPlanTypeListResult != null ? getPlanTypeListResult.getPlanList() : null;
        if (planList == null || planList.isEmpty()) {
            FrameLayout contentRoot = ((uo0) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(contentRoot, "contentRoot");
            TipViewKt.addTipView$default(contentRoot, TipType.NO_NET, false, new Function0() { // from class: ewp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TrainingTypeListActivity.initView$lambda$3$lambda$2(this.f17137a);
                }
            }, 4, null);
        } else {
            this$0.hasHabitHistory = getPlanTypeListResult != null ? getPlanTypeListResult.getHasHabitHistory() : false;
            this$0.trainingTypeList.clear();
            List<PlanType> list = this$0.trainingTypeList;
            List<PlanType> planList2 = getPlanTypeListResult != null ? getPlanTypeListResult.getPlanList() : null;
            Intrinsics.checkNotNull(planList2);
            list.addAll(planList2);
            RecyclerView.Adapter<TrainingTypeHolder> adapter2 = this$0.trainingTypeAdapter;
            if (adapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trainingTypeAdapter");
            } else {
                adapter = adapter2;
            }
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$lambda$2(TrainingTypeListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadData() {
        PageState.DefaultImpls.showLoading$default(this, k1j.o1, false, 2, null);
        ((TrainingTypeListVM) getMViewModel()).getPlanTypeList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(TrainingTypeListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TrainingEventUtils.INSTANCE.trackAllHistory();
        PlanHistoryListActivity.INSTANCE.launch(this$0);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.A;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.training_plan.common.Hilt_TrainingTypeListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        DisplayUtil.setTranslucentStatusBar(this);
        initView();
        ((uo0) getMBinding()).D.setTitle(k1j.I1);
        ((uo0) getMBinding()).D.setAction(k1j.n1, new View.OnClickListener() { // from class: dwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingTypeListActivity.onCreate$lambda$0(this.f15999a, view);
            }
        });
        this.trainingTypeAdapter = new AnonymousClass2();
        RecyclerView recyclerView = ((uo0) getMBinding()).E;
        RecyclerView.Adapter<TrainingTypeHolder> adapter = this.trainingTypeAdapter;
        if (adapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trainingTypeAdapter");
            adapter = null;
        }
        recyclerView.setAdapter(adapter);
        RecyclerView recyclerView2 = ((uo0) getMBinding()).E;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.training_plan.common.TrainingTypeListActivity$onCreate$3$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return UIUtils.INSTANCE.isTablet() ? 1 : 2;
            }
        });
        recyclerView2.setLayoutManager(gridLayoutManager);
        ((uo0) getMBinding()).E.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.training_plan.common.TrainingTypeListActivity.onCreate.4
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.bottom = ExtUtilsKt.getDp(12);
                outRect.right = ExtUtilsKt.getDp(12);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        loadData();
    }
}
