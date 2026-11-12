package com.xiaomi.fitness.sport.sporttab.viewholder;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.gson.Gson;
import com.mibi.sdk.DeductConstants;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.NeedLoginAspect;
import com.xiaomi.fitness.login.annotation.NeedLogin;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.sporttab.viewholder.TrainingPlanViewHolder;
import com.xiaomi.fitness.training_plan_export.adapter.AbilityCourseListAdapter;
import com.xiaomi.fitness.training_plan_export.adapter.HabitDayPlanListAdapter;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanEntranceInfo;
import com.xiaomi.fitness.training_plan_export.model.ForceStopCheckResult;
import com.xiaomi.fitness.training_plan_export.model.GetEntranceInfoResult;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanEntranceInfo;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.model.PlanProgress;
import com.xiaomi.fitness.training_plan_export.utils.FuseUtils;
import com.xiaomi.fitness.training_plan_export.utils.TrainingEventUtils;
import com.xiaomi.fitness.training_plan_export.utils.UIDataUtils;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.widget.ScrollableHorizontalRecyclerView;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.fai;
import defpackage.nrd;
import defpackage.rvp;
import defpackage.s69;
import defpackage.svp;
import defpackage.xj4;
import defpackage.xri;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Y2\u00020\u0001:\u0002YZB\u001f\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bW\u0010XJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0004R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u00100\u001a\n /*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u001c\u00101\u001a\n /*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001cR\u001c\u00103\u001a\n /*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00106\u001a\n /*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u00108\u001a\n /*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R\u001c\u00109\u001a\n /*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104R\u001c\u0010:\u001a\n /*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u001cR\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010?\u001a\n /*\u0004\u0018\u00010>0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010B\u001a\n /*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010E\u001a\n /*\u0004\u0018\u00010D0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010H\u001a\n /*\u0004\u0018\u00010G0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010LR\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006["}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "showCourseList", "()V", "showTypeList", "", "type", "Lcom/xiaomi/fitness/training_plan_export/model/PlanProgress;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "bindTrainingTipInfo", "(ILcom/xiaomi/fitness/training_plan_export/model/PlanProgress;)V", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "habitDayPlan", "bindHabitData", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;)V", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "abilityDayPlan", "bindAbilityData", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;)V", "toAllType", "toCreatePlan", "(I)V", "goneHolder", "visibleHolder", "bindData", "Landroid/view/View;", "holderItemView", "Landroid/view/View;", "getHolderItemView", "()Landroid/view/View;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "getGson", "()Lcom/google/gson/Gson;", "gson", "kotlin.jvm.PlatformType", "root", "top", "Landroid/widget/TextView;", "allTV", "Landroid/widget/TextView;", "Landroid/widget/LinearLayout;", "trainingSummaryLayout", "Landroid/widget/LinearLayout;", "trainingNameTV", "trainingDayCountTV", "trainingNameDivider", "", "forceStopPlanId", "J", "Landroidx/recyclerview/widget/RecyclerView;", "courseList", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/widget/ScrollableHorizontalRecyclerView;", "trainingTypeList", "Lcom/xiaomi/fitness/widget/ScrollableHorizontalRecyclerView;", "Landroid/view/ViewGroup;", "tipLayout", "Landroid/view/ViewGroup;", "Landroid/widget/ImageView;", "closeTipImg", "Landroid/widget/ImageView;", "", "isRefresh", "Z", "localCurTrainingType", "Ljava/lang/Integer;", "", "localCurTrainingInfo", "Ljava/lang/String;", "hasHabitHistory", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "<init>", "(Landroid/view/View;Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;)V", "Companion", "TrainingTypeViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrainingPlanViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingPlanViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,561:1\n1863#2,2:562\n*S KotlinDebug\n*F\n+ 1 TrainingPlanViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder\n*L\n492#1:562,2\n*E\n"})
public final class TrainingPlanViewHolder extends RecyclerView.d0 {

    @NotNull
    private static final String TAG = "TrainingPlanViewHolder";
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ Annotation ajc$anno$1;
    private static /* synthetic */ nrd.a ajc$tjp_0;
    private static /* synthetic */ nrd.a ajc$tjp_1;
    private final TextView allTV;
    private final ImageView closeTipImg;
    private final RecyclerView courseList;
    private long forceStopPlanId;

    @NotNull
    private final FragmentActivity fragmentActivity;

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson;
    private boolean hasHabitHistory;

    @NotNull
    private final View holderItemView;
    private boolean isRefresh;

    @Nullable
    private String localCurTrainingInfo;

    @Nullable
    private Integer localCurTrainingType;

    @NotNull
    private final SportTabV4ViewModel mViewModel;
    private final View root;
    private final ViewGroup tipLayout;
    private final View top;
    private final TextView trainingDayCountTV;
    private final View trainingNameDivider;
    private final TextView trainingNameTV;
    private final LinearLayout trainingSummaryLayout;
    private final ScrollableHorizontalRecyclerView trainingTypeList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder$TrainingTypeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "bgImg", "Landroid/widget/ImageView;", "getBgImg", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "typeName", "Landroid/widget/TextView;", "getTypeName", "()Landroid/widget/TextView;", "typeTip", "getTypeTip", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TrainingTypeViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView bgImg;
        final /* synthetic */ TrainingPlanViewHolder this$0;

        @NotNull
        private final TextView typeName;

        @NotNull
        private final TextView typeTip;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrainingTypeViewHolder(@NotNull TrainingPlanViewHolder trainingPlanViewHolder, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = trainingPlanViewHolder;
            this.view = view;
            View viewFindViewById = view.findViewById(xri.d8);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.bgImg = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(xri.R7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.typeName = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(xri.S7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.typeTip = (TextView) viewFindViewById3;
        }

        @NotNull
        public final ImageView getBgImg() {
            return this.bgImg;
        }

        @NotNull
        public final TextView getTypeName() {
            return this.typeName;
        }

        @NotNull
        public final TextView getTypeTip() {
            return this.typeTip;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.viewholder.TrainingPlanViewHolder$bindData$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"com/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder$bindData$4", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder$TrainingTypeViewHolder;", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTrainingPlanViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingPlanViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder$bindData$4\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,561:1\n54#2,3:562\n24#2:565\n57#2,6:566\n63#2,2:573\n57#3:572\n*S KotlinDebug\n*F\n+ 1 TrainingPlanViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder$bindData$4\n*L\n364#1:562,3\n364#1:565\n364#1:566,6\n364#1:573,2\n364#1:572\n*E\n"})
    public static final class AnonymousClass4 extends RecyclerView.Adapter<TrainingTypeViewHolder> {
        public AnonymousClass4() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$3(TrainingPlanViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (!RegionPreference.INSTANCE.getSyncWeb()) {
                ITrainingManager.DefaultImpls.showCloudSyncDialog$default(TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE), this$0.getFragmentActivity(), null, 2, null);
            } else {
                TrainingEventUtils.INSTANCE.trackTabCreate(1);
                ITrainingManager.DefaultImpls.showHabitCreatePlanDialog$default(TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE), this$0.getFragmentActivity(), this$0.hasHabitHistory, false, 4, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBindViewHolder$lambda$4(TrainingPlanViewHolder this$0, View view) throws Throwable {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (!RegionPreference.INSTANCE.getSyncWeb()) {
                ITrainingManager.DefaultImpls.showCloudSyncDialog$default(TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE), this$0.getFragmentActivity(), null, 2, null);
            } else {
                TrainingEventUtils.INSTANCE.trackTabCreate(2);
                this$0.toCreatePlan(2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(TrainingTypeViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            int i = position == 0 ? 1 : 2;
            UIDataUtils.EntryTypeRes typeEntryRes = UIDataUtils.INSTANCE.getTypeEntryRes(i);
            if (typeEntryRes != null) {
                ImageView bgImg = holder.getBgImg();
                Coil.imageLoader(bgImg.getContext()).enqueue(new ImageRequest.Builder(bgImg.getContext()).data(Integer.valueOf(typeEntryRes.getBgRes())).target(bgImg).build());
                holder.getTypeName().setText(ResourceExtKt.getString(typeEntryRes.getNameRes()));
                holder.getTypeTip().setText(ResourceExtKt.getString(typeEntryRes.getTipRes()));
                holder.getTypeName().setTextColor(ExtUtilsKt.getColor(typeEntryRes.getColor()));
                holder.getTypeTip().setTextColor(ExtUtilsKt.getColor(typeEntryRes.getColor()));
            } else {
                Logger.i(TrainingPlanViewHolder.TAG, "can not load entry resourse with " + i);
            }
            if (i == 1) {
                View view = holder.getView();
                final TrainingPlanViewHolder trainingPlanViewHolder = TrainingPlanViewHolder.this;
                view.setOnClickListener(new View.OnClickListener() { // from class: tvp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        TrainingPlanViewHolder.AnonymousClass4.onBindViewHolder$lambda$3(trainingPlanViewHolder, view2);
                    }
                });
            } else if (position == 1) {
                View view2 = holder.getView();
                final TrainingPlanViewHolder trainingPlanViewHolder2 = TrainingPlanViewHolder.this;
                view2.setOnClickListener(new View.OnClickListener() { // from class: uvp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) throws Throwable {
                        TrainingPlanViewHolder.AnonymousClass4.onBindViewHolder$lambda$4(trainingPlanViewHolder2, view3);
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public TrainingTypeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(TrainingPlanViewHolder.this.getFragmentActivity()).inflate(dvi.u, parent, false);
            if (!UIUtils.INSTANCE.isTablet()) {
                viewInflate.setLayoutParams(new FrameLayout.LayoutParams(ExtUtilsKt.getDp(230), ExtUtilsKt.getDp(120)));
            }
            TrainingPlanViewHolder trainingPlanViewHolder = TrainingPlanViewHolder.this;
            Intrinsics.checkNotNull(viewInflate);
            return new TrainingTypeViewHolder(trainingPlanViewHolder, viewInflate);
        }
    }

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainingPlanViewHolder(@NotNull View holderItemView, @NotNull FragmentActivity fragmentActivity, @NotNull SportTabV4ViewModel mViewModel) {
        super(holderItemView);
        Intrinsics.checkNotNullParameter(holderItemView, "holderItemView");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        this.holderItemView = holderItemView;
        this.fragmentActivity = fragmentActivity;
        this.mViewModel = mViewModel;
        this.gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mvp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainingPlanViewHolder.gson_delegate$lambda$0();
            }
        });
        this.root = holderItemView.findViewById(xri.e5);
        this.top = holderItemView.findViewById(xri.F7);
        this.allTV = (TextView) holderItemView.findViewById(xri.f39394k);
        LinearLayout linearLayout = (LinearLayout) holderItemView.findViewById(xri.O7);
        this.trainingSummaryLayout = linearLayout;
        this.trainingNameTV = (TextView) linearLayout.findViewById(xri.N7);
        this.trainingDayCountTV = (TextView) linearLayout.findViewById(xri.a1);
        this.trainingNameDivider = linearLayout.findViewById(xri.M7);
        RecyclerView recyclerView = (RecyclerView) holderItemView.findViewById(xri.x0);
        recyclerView.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.sport.sporttab.viewholder.TrainingPlanViewHolder$courseList$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.bottom = ExtUtilsKt.getDp(12);
            }
        });
        this.courseList = recyclerView;
        ScrollableHorizontalRecyclerView scrollableHorizontalRecyclerView = (ScrollableHorizontalRecyclerView) holderItemView.findViewById(xri.P7);
        scrollableHorizontalRecyclerView.addItemDecoration(new RecyclerView.n() { // from class: com.xiaomi.fitness.sport.sporttab.viewholder.TrainingPlanViewHolder$trainingTypeList$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.right = ExtUtilsKt.getDp(10);
            }
        });
        this.trainingTypeList = scrollableHorizontalRecyclerView;
        ViewGroup viewGroup = (ViewGroup) holderItemView.findViewById(xri.l7);
        this.tipLayout = viewGroup;
        this.closeTipImg = (ImageView) viewGroup.findViewById(xri.f0);
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("TrainingPlanViewHolder.kt", TrainingPlanViewHolder.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("12", "toAllType", "com.xiaomi.fitness.sport.sporttab.viewholder.TrainingPlanViewHolder", "", "", "", "void"), SportSummary.VERSION_207);
        ajc$tjp_1 = s69Var.h("method-execution", s69Var.g("12", "toCreatePlan", "com.xiaomi.fitness.sport.sporttab.viewholder.TrainingPlanViewHolder", "int", "type", "", "void"), 530);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindAbilityData(AbilityDayPlan abilityDayPlan) {
        AbilityCourseListAdapter abilityCourseListAdapter;
        showCourseList();
        RecyclerView recyclerView = this.courseList;
        if (abilityDayPlan.isRestDay()) {
            abilityCourseListAdapter = new AbilityCourseListAdapter(this.fragmentActivity, abilityDayPlan.getPlanId(), CollectionsKt__CollectionsKt.emptyList(), true, true);
        } else {
            List<AbilityDayPlanCourse> courseList = abilityDayPlan.getCourseList();
            Intrinsics.checkNotNull(courseList);
            for (AbilityDayPlanCourse abilityDayPlanCourse : courseList) {
                abilityDayPlanCourse.setDate(abilityDayPlan.getDate());
                abilityDayPlanCourse.setPlanId(abilityDayPlan.getPlanId());
            }
            List<AbilityDayPlanCourse> courseList2 = abilityDayPlan.getCourseList();
            if (courseList2 == null || courseList2.isEmpty()) {
                Logger.i(TAG, "bindAbilityData with exception data!!");
                abilityCourseListAdapter = new AbilityCourseListAdapter(this.fragmentActivity, abilityDayPlan.getPlanId(), CollectionsKt__CollectionsKt.emptyList(), true, true);
            } else {
                FragmentActivity fragmentActivity = this.fragmentActivity;
                long planId = abilityDayPlan.getPlanId();
                List<AbilityDayPlanCourse> courseList3 = abilityDayPlan.getCourseList();
                Intrinsics.checkNotNull(courseList3);
                abilityCourseListAdapter = new AbilityCourseListAdapter(fragmentActivity, planId, courseList3, false, true, 8, null);
            }
        }
        recyclerView.setAdapter(abilityCourseListAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$12(TrainingPlanViewHolder this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportTabV4ViewModel sportTabV4ViewModel = this$0.mViewModel;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DeductConstants.KEY_WX_PLAN_ID, this$0.forceStopPlanId);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sportTabV4ViewModel.closeForceStopBubble(string);
        Unit unit = Unit.INSTANCE;
        ViewGroup tipLayout = this$0.tipLayout;
        Intrinsics.checkNotNullExpressionValue(tipLayout, "tipLayout");
        ViewExtKt.gone(tipLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan] */
    public static final Unit bindData$lambda$6(TrainingPlanViewHolder this$0, GetEntranceInfoResult getEntranceInfoResult) {
        char c;
        Integer num;
        T t;
        Integer num2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (getEntranceInfoResult != null) {
                if (getEntranceInfoResult.getHabitInfo() != null) {
                    c = 1;
                } else {
                    c = getEntranceInfoResult.getAbilityInfo() != null ? (char) 2 : (char) 0;
                }
                this$0.hasHabitHistory = getEntranceInfoResult.getHasHabitHistory();
                if (c == 0) {
                    Logger.d(TAG, "showTypeList with wrong train type!!");
                    AnyExtKt.main$default(null, new TrainingPlanViewHolder$bindData$1$5(this$0, null), 1, null);
                } else if (c == 1) {
                    HabitPlanEntranceInfo habitInfo = getEntranceInfoResult.getHabitInfo();
                    Intrinsics.checkNotNull(habitInfo);
                    HabitDayPlan habitDayPlan = habitInfo.getHabitDayPlan();
                    try {
                        if (!TextUtils.isEmpty(this$0.localCurTrainingInfo) && (num = this$0.localCurTrainingType) != null && num.intValue() == 1) {
                            FuseUtils.INSTANCE.fuseHabitPlanInfo(((HabitPlanEntranceInfo) this$0.getGson().fromJson(this$0.localCurTrainingInfo, HabitPlanEntranceInfo.class)).getHabitDayPlan(), habitDayPlan, TAG);
                        }
                    } catch (Exception e) {
                        Logger.e(TAG, "fuse habit info exception " + e.getMessage(), e);
                    }
                    AnyExtKt.main$default(null, new TrainingPlanViewHolder$bindData$1$1(this$0, habitDayPlan, habitInfo, null), 1, null);
                    if (habitDayPlan.isRestDay()) {
                        this$0.getServerSyncer().deleteCurDataByPlanId(habitDayPlan.getPlanId());
                    } else {
                        habitInfo.setHabitDayPlan(habitDayPlan);
                        this$0.getServerSyncer().syncCurDatePlanInfo(1, habitDayPlan.getPlanId(), habitDayPlan.getDate(), this$0.getGson().toJson(habitInfo));
                    }
                } else if (c == 2) {
                    AbilityPlanEntranceInfo abilityInfo = getEntranceInfoResult.getAbilityInfo();
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    Intrinsics.checkNotNull(abilityInfo);
                    AbilityDayPlan abilityDayPlan = abilityInfo.getAbilityDayPlan();
                    if (abilityDayPlan != null) {
                        abilityDayPlan.setPlanId(abilityInfo.getPlanId());
                        t = abilityDayPlan;
                    } else {
                        t = 0;
                    }
                    objectRef.element = t;
                    if (t == 0 || !PlanModelsKt.hasCourse(abilityInfo)) {
                        ?? abilityDayPlan2 = new AbilityDayPlan(true, CollectionsKt__CollectionsKt.emptyList(), 0L, 0, 0L, false, 48, null);
                        abilityDayPlan2.setPlanId(abilityInfo.getPlanId());
                        objectRef.element = abilityDayPlan2;
                    }
                    if (!TextUtils.isEmpty(this$0.localCurTrainingInfo) && (num2 = this$0.localCurTrainingType) != null && num2.intValue() == 2) {
                        try {
                            AbilityPlanEntranceInfo abilityPlanEntranceInfo = (AbilityPlanEntranceInfo) this$0.getGson().fromJson(this$0.localCurTrainingInfo, AbilityPlanEntranceInfo.class);
                            FuseUtils fuseUtils = FuseUtils.INSTANCE;
                            AbilityDayPlan abilityDayPlan3 = abilityPlanEntranceInfo.getAbilityDayPlan();
                            Intrinsics.checkNotNull(abilityDayPlan3);
                            fuseUtils.fuseAbilityPlanInfo(abilityDayPlan3, (AbilityDayPlan) objectRef.element, TAG);
                        } catch (Exception e2) {
                            Logger.e(TAG, "fuse ability info exception " + e2.getMessage(), e2);
                        }
                    }
                    AnyExtKt.main$default(null, new TrainingPlanViewHolder$bindData$1$3(this$0, objectRef, abilityInfo, null), 1, null);
                    if (((AbilityDayPlan) objectRef.element).isRestDay()) {
                        FitnessServerSyncer serverSyncer = this$0.getServerSyncer();
                        AbilityPlanEntranceInfo abilityInfo2 = getEntranceInfoResult.getAbilityInfo();
                        Intrinsics.checkNotNull(abilityInfo2);
                        serverSyncer.deleteCurDataByPlanId(abilityInfo2.getPlanId());
                    } else {
                        AbilityPlanEntranceInfo abilityInfo3 = getEntranceInfoResult.getAbilityInfo();
                        if (abilityInfo3 != null) {
                            abilityInfo3.setAbilityDayPlan((AbilityDayPlan) objectRef.element);
                        }
                        FitnessServerSyncer serverSyncer2 = this$0.getServerSyncer();
                        AbilityPlanEntranceInfo abilityInfo4 = getEntranceInfoResult.getAbilityInfo();
                        Intrinsics.checkNotNull(abilityInfo4);
                        serverSyncer2.syncCurDatePlanInfo(2, abilityInfo4.getPlanId(), ((AbilityDayPlan) objectRef.element).getDate(), this$0.getGson().toJson(getEntranceInfoResult.getAbilityInfo()));
                    }
                }
            } else {
                AnyExtKt.main$default(null, new TrainingPlanViewHolder$bindData$1$6(this$0, null), 1, null);
                Logger.i(TAG, "server has returned empty entrance info!!");
            }
        } catch (Exception e3) {
            Logger.e(TAG, "bind data exception " + e3.getMessage(), e3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$7(TrainingPlanViewHolder this$0, ForceStopCheckResult forceStopCheckResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (forceStopCheckResult != null && forceStopCheckResult.getStopped()) {
            Logger.d(TAG, "training plan has force stopped!!");
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).clearTrainingPlanSettings();
            this$0.forceStopPlanId = forceStopCheckResult.getPlanId();
            this$0.showTypeList();
            this$0.tipLayout.setVisibility(!forceStopCheckResult.getRepeat() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$8(TrainingPlanViewHolder this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.toAllType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindHabitData(HabitDayPlan habitDayPlan) {
        showCourseList();
        this.courseList.setAdapter(new HabitDayPlanListAdapter(this.fragmentActivity, CollectionsKt__CollectionsKt.arrayListOf(habitDayPlan)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindTrainingTipInfo(int type, PlanProgress progress) {
        if (progress != null) {
            if (type != 1) {
                if (type != 2) {
                    Logger.i(TAG, "can not bind type=" + type + " tip info!!");
                    return;
                }
                this.trainingNameTV.setText(this.holderItemView.getContext().getString(c1j.N5));
                View trainingNameDivider = this.trainingNameDivider;
                Intrinsics.checkNotNullExpressionValue(trainingNameDivider, "trainingNameDivider");
                ViewExtKt.gone(trainingNameDivider);
                TextView trainingDayCountTV = this.trainingDayCountTV;
                Intrinsics.checkNotNullExpressionValue(trainingDayCountTV, "trainingDayCountTV");
                ViewExtKt.gone(trainingDayCountTV);
                return;
            }
            this.trainingNameTV.setText(this.holderItemView.getContext().getString(c1j.T5));
            TextView trainingDayCountTV2 = this.trainingDayCountTV;
            Intrinsics.checkNotNullExpressionValue(trainingDayCountTV2, "trainingDayCountTV");
            ViewExtKt.visible(trainingDayCountTV2);
            View trainingNameDivider2 = this.trainingNameDivider;
            Intrinsics.checkNotNullExpressionValue(trainingNameDivider2, "trainingNameDivider");
            ViewExtKt.visible(trainingNameDivider2);
            TextView textView = this.trainingDayCountTV;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = this.holderItemView.getContext().getString(c1j.P5);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(progress.getFinishedDays())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        }
    }

    private final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    private final FitnessServerSyncer getServerSyncer() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goneHolder() {
        View root = this.root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        ViewExtKt.gone(root);
        View top = this.top;
        Intrinsics.checkNotNullExpressionValue(top, "top");
        ViewExtKt.gone(top);
        ViewGroup tipLayout = this.tipLayout;
        Intrinsics.checkNotNullExpressionValue(tipLayout, "tipLayout");
        ViewExtKt.gone(tipLayout);
        ScrollableHorizontalRecyclerView trainingTypeList = this.trainingTypeList;
        Intrinsics.checkNotNullExpressionValue(trainingTypeList, "trainingTypeList");
        ViewExtKt.gone(trainingTypeList);
        RecyclerView courseList = this.courseList;
        Intrinsics.checkNotNullExpressionValue(courseList, "courseList");
        ViewExtKt.gone(courseList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$0() {
        return new Gson();
    }

    private final void showCourseList() {
        visibleHolder();
        ScrollableHorizontalRecyclerView trainingTypeList = this.trainingTypeList;
        Intrinsics.checkNotNullExpressionValue(trainingTypeList, "trainingTypeList");
        ViewExtKt.gone(trainingTypeList);
        LinearLayout trainingSummaryLayout = this.trainingSummaryLayout;
        Intrinsics.checkNotNullExpressionValue(trainingSummaryLayout, "trainingSummaryLayout");
        ViewExtKt.visible(trainingSummaryLayout);
        RecyclerView courseList = this.courseList;
        Intrinsics.checkNotNullExpressionValue(courseList, "courseList");
        ViewExtKt.visible(courseList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTypeList() {
        visibleHolder();
        ScrollableHorizontalRecyclerView trainingTypeList = this.trainingTypeList;
        Intrinsics.checkNotNullExpressionValue(trainingTypeList, "trainingTypeList");
        ViewExtKt.visible(trainingTypeList);
        LinearLayout trainingSummaryLayout = this.trainingSummaryLayout;
        Intrinsics.checkNotNullExpressionValue(trainingSummaryLayout, "trainingSummaryLayout");
        ViewExtKt.gone(trainingSummaryLayout);
        RecyclerView courseList = this.courseList;
        Intrinsics.checkNotNullExpressionValue(courseList, "courseList");
        ViewExtKt.gone(courseList);
    }

    @NeedLogin(needLoginDialogGuide = false)
    private final void toAllType() throws Throwable {
        nrd nrdVarB = s69.b(ajc$tjp_0, this, this);
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new rvp(new Object[]{this, nrdVarB}).c(69648);
        Annotation annotation = ajc$anno$0;
        if (annotation == null) {
            annotation = TrainingPlanViewHolder.class.getDeclaredMethod("toAllType", new Class[0]).getAnnotation(NeedLogin.class);
            ajc$anno$0 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }

    public static final /* synthetic */ void toAllType_aroundBody0(TrainingPlanViewHolder trainingPlanViewHolder, nrd nrdVar) {
        if (!RegionPreference.INSTANCE.getSyncWeb()) {
            ITrainingManager.DefaultImpls.showCloudSyncDialog$default(TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE), trainingPlanViewHolder.fragmentActivity, null, 2, null);
            return;
        }
        TrainingEventUtils.INSTANCE.trackTabAll();
        ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
        Context context = trainingPlanViewHolder.holderItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        trainingManagerExtKt.launchTrainingTypeListActivity(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NeedLogin(needLoginDialogGuide = false)
    public final void toCreatePlan(int type) throws Throwable {
        nrd nrdVarC = s69.c(ajc$tjp_1, this, this, xj4.c(type));
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new svp(new Object[]{this, xj4.c(type), nrdVarC}).c(69648);
        Annotation annotation = ajc$anno$1;
        if (annotation == null) {
            annotation = TrainingPlanViewHolder.class.getDeclaredMethod("toCreatePlan", Integer.TYPE).getAnnotation(NeedLogin.class);
            ajc$anno$1 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }

    public static final /* synthetic */ void toCreatePlan_aroundBody2(TrainingPlanViewHolder trainingPlanViewHolder, int i, nrd nrdVar) {
        if (i == 1) {
            ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
            Context context = trainingPlanViewHolder.holderItemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            trainingManagerExtKt.startCreateHabitPlanActivity(context);
            return;
        }
        if (i != 2) {
            return;
        }
        SetPageManager setPageManageExtKt = SetPageManageExtKt.getInstance(SetPageManager.INSTANCE);
        Context context2 = trainingPlanViewHolder.holderItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setPageManageExtKt.startUserIndicatorsActivityForCreateAbilityPlan(context2);
    }

    private final void visibleHolder() {
        View top = this.top;
        Intrinsics.checkNotNullExpressionValue(top, "top");
        ViewExtKt.visible(top);
        View root = this.root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        ViewExtKt.visible(root);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void bindData() {
        RecyclerView.o oVar;
        AccountManager.Companion companion = AccountManager.INSTANCE;
        if (!AccountManagerExtKt.getInstance(companion).isLogin() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            Logger.i(TAG, "gone view holder " + RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion() + "  " + AccountManagerExtKt.getInstance(companion).isLogin());
            goneHolder();
            return;
        }
        this.mViewModel.getTrainingPlanEntranceInfo().observe(this.fragmentActivity, new TrainingPlanViewHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: nvp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrainingPlanViewHolder.bindData$lambda$6(this.f28488a, (GetEntranceInfoResult) obj);
            }
        }));
        this.mViewModel.checkTrainingPlanForceStop().observe(this.fragmentActivity, new TrainingPlanViewHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ovp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrainingPlanViewHolder.bindData$lambda$7(this.f29743a, (ForceStopCheckResult) obj);
            }
        }));
        if (this.isRefresh) {
            return;
        }
        this.allTV.setOnClickListener(new View.OnClickListener() { // from class: pvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                TrainingPlanViewHolder.bindData$lambda$8(this.f30835a, view);
            }
        });
        this.trainingTypeList.setAdapter(new AnonymousClass4());
        ScrollableHorizontalRecyclerView scrollableHorizontalRecyclerView = this.trainingTypeList;
        if (UIUtils.INSTANCE.isTablet()) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.holderItemView.getContext(), 2);
            gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.sport.sporttab.viewholder.TrainingPlanViewHolder$bindData$5$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    return 1;
                }
            });
            oVar = gridLayoutManager;
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.holderItemView.getContext());
            linearLayoutManager.setOrientation(0);
            oVar = linearLayoutManager;
        }
        scrollableHorizontalRecyclerView.setLayoutManager(oVar);
        this.closeTipImg.setOnClickListener(new View.OnClickListener() { // from class: qvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                TrainingPlanViewHolder.bindData$lambda$12(this.f31894a, view);
            }
        });
        this.courseList.setLayoutManager(new LinearLayoutManager(this.holderItemView.getContext()));
        showTypeList();
        this.isRefresh = true;
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final View getHolderItemView() {
        return this.holderItemView;
    }

    @NotNull
    public final SportTabV4ViewModel getMViewModel() {
        return this.mViewModel;
    }
}
