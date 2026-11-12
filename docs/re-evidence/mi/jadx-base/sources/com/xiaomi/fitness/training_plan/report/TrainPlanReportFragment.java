package com.xiaomi.fitness.training_plan.report;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.baseui.view.TipType;
import com.xiaomi.fitness.baseui.view.TipView;
import com.xiaomi.fitness.baseui.view.TipViewKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.training_plan.common.PlanReportSummary;
import com.xiaomi.fitness.training_plan.common.TrainReport;
import com.xiaomi.fitness.training_plan.report.TrainPlanReportFragment;
import com.xiaomi.fitness.training_plan.util.TrainingDataUtils;
import com.xiaomi.fitness.training_plan.util.TrainingReportUtils;
import com.xiaomi.fitness.training_plan_export.model.SportReportItem;
import defpackage.cyi;
import defpackage.dih;
import defpackage.eki;
import defpackage.evp;
import defpackage.gvp;
import defpackage.im9;
import defpackage.ioi;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.lp5;
import defpackage.nuf;
import defpackage.tkr;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003GHIB\u0007¢\u0006\u0004\bF\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJK\u0010\u0013\u001a\u00020\u00042:\u0010\u0012\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00042\u001e\u0010\u0012\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00100R\u0014\u00105\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u00100R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u00060:R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportViewModel;", "Levp;", "", "initView", "()V", "Landroid/net/Uri;", "longPicUri", "Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "report", "goToSportReportShareActivity", "(Landroid/net/Uri;Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Landroid/graphics/Bitmap;", "longPicBitmap", "callback", "generateLongShareBitmapIfNeed", "(Lkotlin/jvm/functions/Function2;)V", "createCommonBitmap", "Landroid/view/View;", "view", "", "top", "setMarginStatueBarTop", "(Landroid/view/View;I)V", "", "checkBgResourceExist", "()Z", "Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;", "planReportSummary", "updatePlanReportSummary", "(Lcom/xiaomi/fitness/training_plan/common/PlanReportSummary;)V", "loadMore", "loadReportData", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Levp;)V", "", "planId", "J", "planType", "I", "DEFALUT_MAX_REPORT_NUM", "openMore", "Z", "TYPE_DATA", "TYPE_BOTTOM", "", "Lcom/xiaomi/fitness/training_plan_export/model/SportReportItem;", "reportList", "Ljava/util/List;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment$PlanReportListAdapter;", "reportListAdapter", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment$PlanReportListAdapter;", "Lcom/xiaomi/fitness/baseui/view/TipView;", "errorTipView", "Lcom/xiaomi/fitness/baseui/view/TipView;", "", "DEFAULT_SPORT_SHARE_FILE_NAME", "Ljava/lang/String;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "PlanReportListAdapter", "ItemViewHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrainPlanReportFragment extends BaseBindingFragment<TrainPlanReportViewModel, evp> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_PLAN_ID = "plan_id";

    @NotNull
    private static final String KEY_PLAN_TYPE = "plan_type";

    @NotNull
    private static final String TAG = "TrainPlanReportFragment";

    @Nullable
    private TipView errorTipView;
    private boolean openMore;
    private long planId;
    private int planType;
    private final int DEFALUT_MAX_REPORT_NUM = 5;
    private final int TYPE_DATA = 1;
    private final int TYPE_BOTTOM = 2;

    @NotNull
    private final List<SportReportItem> reportList = new ArrayList();

    @NotNull
    private final PlanReportListAdapter reportListAdapter = new PlanReportListAdapter();

    @NotNull
    private final String DEFAULT_SPORT_SHARE_FILE_NAME = "training_plan_default_share.jpg";

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment$Companion;", "", "<init>", "()V", "TAG", "", "KEY_PLAN_ID", "KEY_PLAN_TYPE", "launch", "", "context", "Landroid/content/Context;", "planType", "", "planId", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, int planType, long planId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putLong("plan_id", planId);
            bundle.putInt(TrainPlanReportFragment.KEY_PLAN_TYPE, planType);
            dih.a().e(context, new FragmentParams.b().e(TrainPlanReportFragment.class).c(bundle).b());
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "type", "Lcom/xiaomi/fitness/training_plan_export/model/SportReportItem;", "item", "Lkotlin/Function0;", "", "onOpenClick", "bind", "(ILcom/xiaomi/fitness/training_plan_export/model/SportReportItem;Lkotlin/jvm/functions/Function0;)V", "Lgvp;", "binding", "Lgvp;", "<init>", "(Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment;Lgvp;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final gvp binding;
        final /* synthetic */ TrainPlanReportFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull TrainPlanReportFragment trainPlanReportFragment, gvp binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = trainPlanReportFragment;
            this.binding = binding;
            nuf.f(this.itemView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$4(SportReportItem sportReportItem, ItemViewHolder this$0, TrainPlanReportFragment this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            SportBasicReport sportBasicReportConvertItem2Report = TrainingReportUtils.INSTANCE.convertItem2Report(sportReportItem);
            if (sportBasicReportConvertItem2Report == null) {
                Logger.i(TrainPlanReportFragment.TAG, "can not go to sport report with empty report!!");
                return;
            }
            SportRecordApi sportRecordApi = SportRecordApiKt.getSportRecordApi();
            Context contextRequireContext = this$1.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            sportRecordApi.goSportDetail(contextRequireContext, sportBasicReportConvertItem2Report);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$5(Function0 function0, View view) {
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void bind(int type, @Nullable final SportReportItem item, @Nullable final Function0<Unit> onOpenClick) {
            String quantityString;
            Integer numValueOf;
            if (type != this.this$0.TYPE_DATA) {
                if (type == this.this$0.TYPE_BOTTOM) {
                    ConstraintLayout reportItem = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(reportItem, "reportItem");
                    ViewExtKt.gone(reportItem);
                    ConstraintLayout openStatusToggle = this.binding.B;
                    Intrinsics.checkNotNullExpressionValue(openStatusToggle, "openStatusToggle");
                    ViewExtKt.visible(openStatusToggle);
                    if (this.this$0.openMore) {
                        this.binding.C.setText(this.this$0.getString(k1j.x1));
                        this.binding.A.setImageResource(ioi.n);
                    } else {
                        this.binding.C.setText(this.this$0.getString(k1j.w1));
                        this.binding.A.setImageResource(ioi.m);
                    }
                    this.binding.B.setOnClickListener(new View.OnClickListener() { // from class: hsp
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TrainPlanReportFragment.ItemViewHolder.bind$lambda$5(onOpenClick, view);
                        }
                    });
                    return;
                }
                return;
            }
            ConstraintLayout reportItem2 = this.binding.G;
            Intrinsics.checkNotNullExpressionValue(reportItem2, "reportItem");
            ViewExtKt.visible(reportItem2);
            ConstraintLayout openStatusToggle2 = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(openStatusToggle2, "openStatusToggle");
            ViewExtKt.gone(openStatusToggle2);
            TrainingReportUtils trainingReportUtils = TrainingReportUtils.INSTANCE;
            Intrinsics.checkNotNull(item);
            SportBasicReport sportBasicReportConvertItem2Report = trainingReportUtils.convertItem2Report(item);
            if (sportBasicReportConvertItem2Report != null) {
                sportBasicReportConvertItem2Report.setCourseName(item.getCourseName());
            } else {
                sportBasicReportConvertItem2Report = null;
            }
            if (sportBasicReportConvertItem2Report == null) {
                Logger.i(TrainPlanReportFragment.TAG, "can not bind plan report item with empty report item!!");
                return;
            }
            Logger.d(TrainPlanReportFragment.TAG, "sport-name-info:" + sportBasicReportConvertItem2Report.getSportCourseId() + " - " + sportBasicReportConvertItem2Report.getSportType());
            this.binding.H.setText(!TextUtils.isEmpty(sportBasicReportConvertItem2Report.getCourseName()) ? sportBasicReportConvertItem2Report.getCourseName() : lp5.c(lp5.a(sportBasicReportConvertItem2Report)));
            this.binding.E.setText(TimeDateUtil.INSTANCE.getDateMMDDLocalFormat(sportBasicReportConvertItem2Report.getStartTime() * 1000));
            if (sportBasicReportConvertItem2Report.getCalories() != null) {
                Application application = ApplicationExtKt.getApplication();
                int i = cyi.common_unit_calorie_desc;
                Integer calories = sportBasicReportConvertItem2Report.getCalories();
                Intrinsics.checkNotNull(calories);
                int iIntValue = calories.intValue();
                Integer calories2 = sportBasicReportConvertItem2Report.getCalories();
                Intrinsics.checkNotNull(calories2);
                calories2.intValue();
                quantityString = ResourceExtKt.getQuantityString(application, i, iIntValue, calories2);
            } else {
                quantityString = "";
            }
            Integer correctedDistance = sportBasicReportConvertItem2Report.getCorrectedDistance();
            if (correctedDistance == null || correctedDistance.intValue() <= 0) {
                Integer distance = sportBasicReportConvertItem2Report.getDistance();
                numValueOf = Integer.valueOf(distance != null ? distance.intValue() : 0);
            } else {
                numValueOf = sportBasicReportConvertItem2Report.getCorrectedDistance();
            }
            Pair<String, String> pairHandleTotalDistance = TrainingDataUtils.INSTANCE.handleTotalDistance(numValueOf != null ? numValueOf.intValue() : 0.0f);
            this.binding.D.setText(((Object) pairHandleTotalDistance.getFirst()) + ((Object) pairHandleTotalDistance.getSecond()) + "|" + quantityString);
            int duration = sportBasicReportConvertItem2Report.getDuration() / 3600;
            int duration2 = (sportBasicReportConvertItem2Report.getDuration() / 60) % 60;
            int duration3 = sportBasicReportConvertItem2Report.getDuration() % 60;
            String quantityString2 = duration > 0 ? ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.x, duration, Integer.valueOf(duration)) : "";
            String quantityString3 = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.y, duration2, Integer.valueOf(duration2));
            String quantityString4 = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.z, duration3, Integer.valueOf(duration3));
            TextView textView = this.binding.F;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(quantityString2)) {
                sb.append(quantityString2);
            }
            if (duration2 > 0) {
                sb.append(quantityString3);
            }
            if (duration3 > 0) {
                sb.append(quantityString4);
            }
            textView.setText(sb.toString());
            View root = this.binding.getRoot();
            final TrainPlanReportFragment trainPlanReportFragment = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: gsp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainPlanReportFragment.ItemViewHolder.bind$lambda$4(item, this, trainPlanReportFragment, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0017J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment$PlanReportListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment$ItemViewHolder;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment;", "<init>", "(Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportFragment;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "getItemViewType", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class PlanReportListAdapter extends RecyclerView.Adapter<ItemViewHolder> {
        public PlanReportListAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBindViewHolder$lambda$0(TrainPlanReportFragment this$0, PlanReportListAdapter this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.openMore = !this$0.openMore;
            this$1.notifyDataSetChanged();
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            if (TrainPlanReportFragment.this.reportList.size() > TrainPlanReportFragment.this.DEFALUT_MAX_REPORT_NUM) {
                return (TrainPlanReportFragment.this.openMore ? TrainPlanReportFragment.this.reportList.size() : TrainPlanReportFragment.this.DEFALUT_MAX_REPORT_NUM) + 1;
            }
            return TrainPlanReportFragment.this.reportList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            if (TrainPlanReportFragment.this.reportList.size() > TrainPlanReportFragment.this.DEFALUT_MAX_REPORT_NUM && position == getCount() - 1) {
                return TrainPlanReportFragment.this.TYPE_BOTTOM;
            }
            return TrainPlanReportFragment.this.TYPE_DATA;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @SuppressLint({"NotifyDataSetChanged"})
        public void onBindViewHolder(@NotNull ItemViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            int itemViewType = getItemViewType(position);
            if (itemViewType == TrainPlanReportFragment.this.TYPE_DATA) {
                holder.bind(TrainPlanReportFragment.this.TYPE_DATA, (SportReportItem) TrainPlanReportFragment.this.reportList.get(position), null);
            } else if (itemViewType == TrainPlanReportFragment.this.TYPE_BOTTOM) {
                int i = TrainPlanReportFragment.this.TYPE_BOTTOM;
                final TrainPlanReportFragment trainPlanReportFragment = TrainPlanReportFragment.this;
                holder.bind(i, null, new Function0() { // from class: isp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TrainPlanReportFragment.PlanReportListAdapter.onBindViewHolder$lambda$0(trainPlanReportFragment, this);
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            gvp gvpVarA0 = gvp.A0(LayoutInflater.from(TrainPlanReportFragment.this.getActivity()), parent, false);
            Intrinsics.checkNotNullExpressionValue(gvpVarA0, "inflate(...)");
            return new ItemViewHolder(TrainPlanReportFragment.this, gvpVarA0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7(final TrainPlanReportFragment this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        PageState.DefaultImpls.showLoading$default(this$0, k1j.o1, false, 2, null);
        this$0.generateLongShareBitmapIfNeed(new Function2() { // from class: dsp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TrainPlanReportFragment.bindView$lambda$7$lambda$6(this.f15897a, (Uri) obj, (Bitmap) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$7$lambda$6(TrainPlanReportFragment this$0, Uri uri, Bitmap bitmap) {
        String userName;
        String avatarAddress;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (((TrainPlanReportViewModel) this$0.getMViewModel()).getMTrainReport().getValue() == null) {
            return Unit.INSTANCE;
        }
        AccountCoreInfo value = ((TrainPlanReportViewModel) this$0.getMViewModel()).getUserInfoLiveData().getValue();
        String str = "";
        if (value == null || (userName = value.getUserName()) == null) {
            userName = "";
        }
        AccountCoreInfo value2 = ((TrainPlanReportViewModel) this$0.getMViewModel()).getUserInfoLiveData().getValue();
        if (value2 != null && (avatarAddress = value2.getAvatarAddress()) != null) {
            str = avatarAddress;
        }
        TrainReport value3 = ((TrainPlanReportViewModel) this$0.getMViewModel()).getMTrainReport().getValue();
        Intrinsics.checkNotNull(value3);
        this$0.goToSportReportShareActivity(uri, new CustomerSharePlanReport(userName, str, value3));
        return Unit.INSTANCE;
    }

    private final boolean checkBgResourceExist() {
        return new File(new File(im9.L()).getAbsolutePath() + File.separator + "square-1.webp").exists();
    }

    private final void createCommonBitmap(final Function2<? super Uri, ? super Bitmap, Unit> callback) {
        getMBinding().L.post(new Runnable() { // from class: esp
            @Override // java.lang.Runnable
            public final void run() {
                TrainPlanReportFragment.createCommonBitmap$lambda$9(this.f17028a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCommonBitmap$lambda$9(TrainPlanReportFragment this$0, Function2 function2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout rootView = this$0.getMBinding().L;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        Bitmap bitmapLoadBitmapFromView = ShareUtil.loadBitmapFromView((View) rootView, BaseFragmentExtKt.getColor(this$0, eki.f16739b), 0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLoadBitmapFromView.getWidth(), bitmapLoadBitmapFromView.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(BaseFragmentExtKt.getColor(this$0, eki.f16739b));
        canvas.drawBitmap(bitmapLoadBitmapFromView, 0.0f, 0.0f, (Paint) null);
        Uri uriSaveImgToTempWithCustomizedName = ShareUtil.INSTANCE.saveImgToTempWithCustomizedName(bitmapCreateBitmap, this$0.DEFAULT_SPORT_SHARE_FILE_NAME);
        if (function2 != null) {
            function2.invoke(uriSaveImgToTempWithCustomizedName, bitmapCreateBitmap);
        }
    }

    private final void generateLongShareBitmapIfNeed(final Function2<? super Uri, ? super Bitmap, Unit> callback) {
        createCommonBitmap(new Function2() { // from class: fsp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TrainPlanReportFragment.generateLongShareBitmapIfNeed$lambda$8(callback, (Uri) obj, (Bitmap) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateLongShareBitmapIfNeed$lambda$8(Function2 callback, Uri uri, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(uri, bitmap);
        return Unit.INSTANCE;
    }

    private final void goToSportReportShareActivity(Uri longPicUri, CustomerSharePlanReport report) {
        Intent intent = new Intent(requireActivity(), (Class<?>) TrainPlanReportShareActivity.class);
        intent.putExtra(TrainPlanReportShareActivityKt.BUNDLE_PARAM_URI, String.valueOf(longPicUri));
        intent.putExtra(TrainPlanReportShareActivityKt.BUNDLE_PARAM_REPORT_INFO, report);
        startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NotifyDataSetChanged"})
    private final void initView() {
        getMBinding().I.setAdapter(this.reportListAdapter);
        getMBinding().I.setLayoutManager(new LinearLayoutManager(requireContext()));
        if (this.planType == 1) {
            if (UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
                View backgroundView = getMBinding().B;
                Intrinsics.checkNotNullExpressionValue(backgroundView, "backgroundView");
                ViewExtKt.gone(backgroundView);
            } else {
                getMBinding().B.setBackground(BaseFragmentExtKt.getDrawable(this, ioi.S));
            }
        }
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: asp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainPlanReportFragment.initView$lambda$0(this.f3421a, view);
            }
        });
        ((TrainPlanReportViewModel) getMViewModel()).getMTrainReport().observe(getViewLifecycleOwner(), new Observer() { // from class: bsp
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainPlanReportFragment.initView$lambda$4(this.f4573a, (TrainReport) obj);
            }
        });
        ((TrainPlanReportViewModel) getMViewModel()).m626getUserInfoLiveData();
        ((TrainPlanReportViewModel) getMViewModel()).getUserInfoLiveData().observe(getViewLifecycleOwner(), new TrainPlanReportFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: csp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrainPlanReportFragment.initView$lambda$5(this.f14685a, (AccountCoreInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(TrainPlanReportFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(final TrainPlanReportFragment this$0, TrainReport trainReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        TipView tipView = this$0.errorTipView;
        if (tipView != null) {
            this$0.getMBinding().L.removeView(tipView);
        }
        if (trainReport == null) {
            if (this$0.reportList.isEmpty()) {
                FrameLayout root = this$0.getMBinding().K;
                Intrinsics.checkNotNullExpressionValue(root, "root");
                this$0.errorTipView = TipViewKt.addTipView(root, TipType.NO_NET, false, new Function0() { // from class: zrp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TrainPlanReportFragment.initView$lambda$4$lambda$2(this.f41609a);
                    }
                });
                return;
            }
            return;
        }
        this$0.updatePlanReportSummary(trainReport.getPlanReportSummary());
        List<SportReportItem> reports = trainReport.getSportReportInfo().getReports();
        if (reports != null) {
            this$0.reportList.addAll(reports);
            this$0.reportListAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$4$lambda$2(TrainPlanReportFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadReportData(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$5(TrainPlanReportFragment this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().C.updateUserInfo(accountCoreInfo != null ? accountCoreInfo.getUserName() : null, accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadReportData(boolean loadMore) {
        if (!loadMore) {
            PageState.DefaultImpls.showLoading$default(this, k1j.o1, false, 2, null);
        }
        ((TrainPlanReportViewModel) getMViewModel()).getReport(this.planId, "");
    }

    public static /* synthetic */ void loadReportData$default(TrainPlanReportFragment trainPlanReportFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        trainPlanReportFragment.loadReportData(z);
    }

    private final void setMarginStatueBarTop(View view, int top) {
        int statusBarHeight = DisplayUtil.getStatusBarHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, statusBarHeight + top, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, 0);
        layoutParams2.setMarginStart(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
        layoutParams2.setMarginEnd(((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
    }

    public static /* synthetic */ void setMarginStatueBarTop$default(TrainPlanReportFragment trainPlanReportFragment, View view, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        trainPlanReportFragment.setMarginStatueBarTop(view, i);
    }

    @SuppressLint({"SetTextI18n"})
    private final void updatePlanReportSummary(PlanReportSummary planReportSummary) {
        int planType = planReportSummary.getPlanType();
        if (planType == 1) {
            getMBinding().H.setText(getString(k1j.M0));
            if (UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
                View backgroundView = getMBinding().B;
                Intrinsics.checkNotNullExpressionValue(backgroundView, "backgroundView");
                ViewExtKt.gone(backgroundView);
            } else {
                getMBinding().B.setBackground(BaseFragmentExtKt.getDrawable(this, ioi.S));
            }
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getMBinding().O.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = ExtUtilsKt.getDp(104);
                ((ViewGroup.MarginLayoutParams) layoutParams).height = ExtUtilsKt.getDp(104);
            } else {
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new ConstraintLayout.LayoutParams(ExtUtilsKt.getDp(104), ExtUtilsKt.getDp(104));
            }
            layoutParams.setMarginEnd(ExtUtilsKt.getDp(24));
            getMBinding().O.setLayoutParams(layoutParams);
            if (planReportSummary.getFinishTimes() >= 30) {
                getMBinding().O.setImageResource(ioi.J);
            } else if (planReportSummary.getFinishTimes() >= 10) {
                getMBinding().O.setImageResource(ioi.I);
            } else {
                getMBinding().O.setImageResource(ioi.C);
            }
        } else if (planType == 2) {
            ViewGroup.MarginLayoutParams layoutParams2 = (ViewGroup.MarginLayoutParams) getMBinding().O.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ConstraintLayout.LayoutParams(ExtUtilsKt.getDp(170), ExtUtilsKt.getDp(152));
            }
            if (UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
                View backgroundView2 = getMBinding().B;
                Intrinsics.checkNotNullExpressionValue(backgroundView2, "backgroundView");
                ViewExtKt.gone(backgroundView2);
            }
            layoutParams2.setMarginEnd(ExtUtilsKt.getDp(12));
            getMBinding().O.setLayoutParams(layoutParams2);
            getMBinding().H.setText(getString(k1j.V));
            int finishCourseCount = planReportSummary.getFinishCourseCount();
            if (finishCourseCount >= 30) {
                if (!UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
                    getMBinding().B.setBackground(BaseFragmentExtKt.getDrawable(this, ioi.Q));
                }
                getMBinding().O.setImageResource(ioi.W);
            } else if (finishCourseCount >= 10) {
                if (!UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
                    getMBinding().B.setBackground(BaseFragmentExtKt.getDrawable(this, ioi.P));
                }
                getMBinding().O.setImageResource(ioi.V);
            } else if (finishCourseCount >= 5) {
                if (!UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
                    getMBinding().B.setBackground(BaseFragmentExtKt.getDrawable(this, ioi.O));
                }
                getMBinding().O.setImageResource(ioi.U);
            } else {
                if (!UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
                    getMBinding().B.setBackground(BaseFragmentExtKt.getDrawable(this, ioi.N));
                }
                getMBinding().O.setImageResource(ioi.T);
            }
        }
        long j = 1000;
        getMBinding().F.setText(TimeUtils.formatDate(StringUtils.EXPECT_DATE_FORMAT, Long.valueOf(planReportSummary.getStartTime() * j)) + " - " + TimeUtils.formatDate(StringUtils.EXPECT_DATE_FORMAT, Long.valueOf(planReportSummary.getEndTime() * j)));
        getMBinding().C.updateBasicTrainInfo(planReportSummary);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull evp evpVar) {
        Intrinsics.checkNotNullParameter(evpVar, "<this>");
        ViewExtKt.clickWithTrigger$default(evpVar.N, 0L, new Function1() { // from class: yrp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrainPlanReportFragment.bindView$lambda$7(this.f40472a, (ImageView) obj);
            }
        }, 1, null);
        evpVar.J.bindData(ioi.R, getString(k1j.m));
        evpVar.I.setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.e0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        if ((activity != null ? activity.getWindow() : null) != null) {
            FragmentActivity activity2 = getActivity();
            Window window = activity2 != null ? activity2.getWindow() : null;
            Intrinsics.checkNotNull(window);
            tkr.b(window, false);
        }
        setActionBarDisplayable(false);
        TrainPlanReportBasicInfoView basicInfoView = getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(basicInfoView, "basicInfoView");
        setMarginStatueBarTop(basicInfoView, ExtUtilsKt.getDp(Float.valueOf(10.0f)));
        ImageView shareIcon = getMBinding().N;
        Intrinsics.checkNotNullExpressionValue(shareIcon, "shareIcon");
        setMarginStatueBarTop(shareIcon, ExtUtilsKt.getDp(Float.valueOf(10.0f)));
        ImageView backIcon = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(backIcon, "backIcon");
        setMarginStatueBarTop(backIcon, ExtUtilsKt.getDp(Float.valueOf(10.0f)));
        Bundle arguments = getArguments();
        long j = arguments != null ? arguments.getLong("plan_id", 0L) : 0L;
        this.planId = j;
        if (j == 0) {
            Logger.i(TAG, "can not get plan report with empty plan id!!");
            finish();
        }
        initView();
        loadReportData(false);
    }
}
