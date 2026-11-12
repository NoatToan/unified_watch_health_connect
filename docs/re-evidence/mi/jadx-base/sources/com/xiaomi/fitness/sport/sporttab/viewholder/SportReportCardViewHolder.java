package com.xiaomi.fitness.sport.sporttab.viewholder;

import android.app.ActivityOptions;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.DataExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.PrivacyEasyModePreference;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel;
import com.xiaomi.fitness.sport.sporttab.util.SportTabExtKt;
import com.xiaomi.fitness.sport.sporttab.util.SportTabOneTrackExtKt;
import com.xiaomi.fitness.sport.sporttab.viewholder.SportReportCardViewHolder;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.lp5;
import defpackage.pz6;
import defpackage.xri;
import defpackage.zxi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u001f\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b.\u0010/J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u001c\u0010'\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportReportCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "report", "", "getFirstLineStr", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Ljava/lang/String;", "getSecondLineStr", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$SportRecordCard;", "sportTabUiModel", "", "bindData", "(Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel$SportRecordCard;)V", "refreshHolder", "()V", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/TextView;", "sectionTitleTv", "Landroid/widget/TextView;", "titleTv", "detailTv", "Landroid/widget/ImageView;", "sportIconIv", "Landroid/widget/ImageView;", "latestRecordCard", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroidx/lifecycle/MutableLiveData;", "reportLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportReportCardViewHolder extends RecyclerView.d0 {

    @NotNull
    public static final String BUNDLE_PARAMS_SPORT_REPORT = "sport_report";

    @NotNull
    public static final String BUNDLE_PARAMS_SPORT_SOURCE = "sport_source";

    @NotNull
    public static final String BUNDLE_PARAMS_TIME_STAMP = "time_stamp";
    public static final int CHECK_ALL = 1;

    @NotNull
    public static final String DATA_SPORT_TYPE = "sport_type";
    public static final int LATEST_SPORT_RECORD = 2;

    @NotNull
    public static final String TAG = "SportReportSectionViewHolder";

    @NotNull
    private final ConstraintLayout container;
    private final Context context;

    @NotNull
    private final TextView detailTv;

    @NotNull
    private final FragmentActivity fragmentActivity;

    @NotNull
    private final ConstraintLayout latestRecordCard;

    @NotNull
    private final SportTabV4ViewModel mViewModel;

    @NotNull
    private final MutableLiveData<SportBasicReport> reportLiveData;

    @NotNull
    private final TextView sectionTitleTv;

    @NotNull
    private final ImageView sportIconIv;

    @NotNull
    private final TextView titleTv;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.viewholder.SportReportCardViewHolder$bindData$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.viewholder.SportReportCardViewHolder$bindData$3", f = "SportReportCardViewHolder.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportReportCardViewHolder.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = DataExtKt.getLatestSportReport(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SportReportCardViewHolder.this.reportLiveData.postValue((SportBasicReport) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.viewholder.SportReportCardViewHolder$refreshHolder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.viewholder.SportReportCardViewHolder$refreshHolder$1", f = "SportReportCardViewHolder.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportReportCardViewHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = DataExtKt.getLatestSportReport(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SportBasicReport sportBasicReport = (SportBasicReport) obj;
            Logger.d(SportReportCardViewHolder.TAG, "refreshHolder report=" + sportBasicReport);
            SportReportCardViewHolder.this.reportLiveData.postValue(sportBasicReport);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportReportCardViewHolder(@NotNull View itemView, @NotNull FragmentActivity fragmentActivity, @NotNull SportTabV4ViewModel mViewModel) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        this.fragmentActivity = fragmentActivity;
        this.mViewModel = mViewModel;
        View viewFindViewById = itemView.findViewById(xri.o0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.container = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(xri.V5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.sectionTitleTv = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(xri.m7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.titleTv = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(xri.h1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.detailTv = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(xri.A6);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.sportIconIv = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(xri.Z2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.latestRecordCard = (ConstraintLayout) viewFindViewById6;
        this.context = itemView.getContext();
        this.reportLiveData = mViewModel.getSportReportLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$0(SportReportCardViewHolder this$0, SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sportBasicReport != null) {
            Logger.i(TAG, "sportReport=" + sportBasicReport);
            this$0.sportIconIv.setImageResource(lp5.b(lp5.a(sportBasicReport)));
            ViewExtKt.visible(this$0.detailTv);
            this$0.titleTv.setText(this$0.getFirstLineStr(sportBasicReport));
            this$0.detailTv.setText(this$0.getSecondLineStr(sportBasicReport));
        } else {
            this$0.sportIconIv.setImageResource(eoi.y);
            this$0.titleTv.setText(c1j.M2);
            ViewExtKt.gone(this$0.detailTv);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$1(SportReportCardViewHolder this$0, ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBasicReport value = this$0.mViewModel.getSportReportLiveData().getValue();
        if (value != null) {
            Bundle bundle = new Bundle();
            String sid = value.getSid();
            if (sid != null && !StringsKt__StringsKt.isBlank(sid)) {
                bundle.putString("did", sid);
            }
            bundle.putSerializable("local_date", Long.valueOf(value.getTimeStamp()));
            bundle.putLong("time_stamp", value.getTimeStamp());
            bundle.putSerializable("sport_report", value);
            bundle.putString("sport_source", "workout_tab");
            bundle.putInt("sport_type", lp5.a(value));
            SportRecordApi sportRecordApi = SportRecordApiKt.getSportRecordApi();
            Context context = this$0.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            sportRecordApi.goSportDetail(context, bundle, (ActivityOptions) null, value);
            SportTabOneTrackExtKt.oneTrackOnSportRecordEntranceClick(2);
        } else {
            SportRecordApi sportRecordApi2 = SportRecordApiKt.getSportRecordApi();
            Context context2 = this$0.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            SportRecordApi.DefaultImpls.goSportRecordList$default(sportRecordApi2, context2, null, null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$2(SportReportCardViewHolder this$0, ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportRecordApi sportRecordApi = SportRecordApiKt.getSportRecordApi();
        Context context = this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        SportRecordApi.DefaultImpls.goSportRecordList$default(sportRecordApi, context, null, null, null, 12, null);
        SportTabOneTrackExtKt.oneTrackOnSportRecordEntranceClick(1);
        return Unit.INSTANCE;
    }

    private final String getFirstLineStr(SportBasicReport report) {
        Integer gymTrainingTotalTimes;
        int sportType = report.getSportType();
        Integer distance = report.getDistance();
        int iIntValue = distance != null ? distance.intValue() : 0;
        int iA = lp5.a(report);
        String courseName = report.getCourseName();
        if (courseName == null) {
            courseName = lp5.c(iA);
        }
        Intrinsics.checkNotNull(courseName);
        if (sportType == 14 || ((sportType == 313 && (gymTrainingTotalTimes = report.getGymTrainingTotalTimes()) != null && gymTrainingTotalTimes.intValue() > 0) || sportType == 334)) {
            int sportCount = report.getSportCount();
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.common_unit_rope_count, sportCount);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return ApplicationExtKt.getApplication().getString(c1j.a5, courseName, sportCount + quantityString);
        }
        if (iIntValue <= 0) {
            return courseName;
        }
        Integer correctedDistance = report.getCorrectedDistance();
        Integer distance2 = (correctedDistance == null || correctedDistance.intValue() <= 0) ? report.getDistance() : report.getCorrectedDistance();
        Application application = ApplicationExtKt.getApplication();
        Intrinsics.checkNotNull(distance2);
        return ApplicationExtKt.getApplication().getString(c1j.a5, courseName, pz6.b(application, distance2.intValue()));
    }

    private final String getSecondLineStr(SportBasicReport report) {
        int duration;
        String string;
        if (report.getProtoType() != 25 || report.getTotalDivingDuration() == null) {
            duration = report.getDuration();
        } else {
            Integer totalDivingDuration = report.getTotalDivingDuration();
            Intrinsics.checkNotNull(totalDivingDuration);
            duration = totalDivingDuration.intValue();
        }
        String zNTimeWithSec = TimeDateUtil.getZNTimeWithSec(duration);
        Integer calories = report.getCalories();
        int iIntValue = calories != null ? calories.intValue() : 0;
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(report.getStartTime());
        if (iIntValue > 0) {
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.common_unit_calorie_desc, report.getCalories(), report.getCalories());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            string = ApplicationExtKt.getApplication().getString(c1j.b5, zNTimeWithSec, quantityString, dateMMddFormat);
        } else {
            string = ApplicationExtKt.getApplication().getString(c1j.c5, zNTimeWithSec, dateMMddFormat);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void bindData(@NotNull SportTabUiModel.SportRecordSportTabUiModel sportTabUiModel) {
        Intrinsics.checkNotNullParameter(sportTabUiModel, "sportTabUiModel");
        if (PrivacyEasyModePreference.INSTANCE.isEasyMode()) {
            ViewExtKt.gone(this.container);
            return;
        }
        ViewExtKt.visible(this.container);
        this.sectionTitleTv.setText(sportTabUiModel.getLabel());
        this.reportLiveData.observe(this.fragmentActivity, new SportReportCardViewHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: txn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportReportCardViewHolder.bindData$lambda$0(this.f35166a, (SportBasicReport) obj);
            }
        }));
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        SportTabExtKt.onClickWithZoomTransformationAnimation(context, this.latestRecordCard, new Function1() { // from class: uxn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportReportCardViewHolder.bindData$lambda$1(this.f36259a, (ActivityOptions) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.fragmentActivity), Dispatchers.getIO(), null, new AnonymousClass3(null), 2, null);
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        SportTabExtKt.onClickWithZoomTransformationAnimation(context2, this.container, new Function1() { // from class: vxn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportReportCardViewHolder.bindData$lambda$2(this.f37339a, (ActivityOptions) obj);
            }
        });
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final SportTabV4ViewModel getMViewModel() {
        return this.mViewModel;
    }

    public final void refreshHolder() {
        if (PrivacyEasyModePreference.INSTANCE.isEasyMode()) {
            ViewExtKt.gone(this.container);
        } else {
            ViewExtKt.visible(this.container);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.fragmentActivity), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
        }
    }
}
