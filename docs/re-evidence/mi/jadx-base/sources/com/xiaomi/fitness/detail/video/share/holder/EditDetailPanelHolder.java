package com.xiaomi.fitness.detail.video.share.holder;

import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.video.share.model.MomentsModel;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.detail.video.share.widget.DraggableTimelineView;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import com.xiaomi.fitness.share.amap.SharePathVideoViewModel;
import defpackage.brp;
import defpackage.frp;
import defpackage.pqp;
import defpackage.srp;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u001a\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-\u0018\u00010\u000f0,\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060,\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002010,¢\u0006\u0004\bH\u0010IJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\u000b\u001a\u00020\u00022#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-\u0018\u00010\u000f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/EditDetailPanelHolder;", "", "", "initHolder", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "progressValue", "callback", "setOnTimelineDragCallback", "(Lkotlin/jvm/functions/Function1;)V", "setTimelineScrollToProgressValue", "(F)V", "", "Lcom/xiaomi/fitness/detail/video/share/model/MomentsModel;", "momentMap", "addWonderfulMomentsToTimeline", "(Ljava/util/Map;)V", "", "", "colorList", "setLineColor", "(Ljava/util/List;)V", "", "isDefault", "setDefaultType", "(Z)V", "Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;", "getActivity", "()Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;", "Lpqp;", "mBinding", "Lpqp;", "getMBinding", "()Lpqp;", "Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "mViewModel", "Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "traceDataMapLiveData", "Landroidx/lifecycle/MutableLiveData;", "curtProgressLiveData", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "traceStyleResModeLiveData", "Lcom/xiaomi/fitness/detail/video/share/holder/RecordFeelingsHolder;", "recordFeelingsHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/RecordFeelingsHolder;", "getRecordFeelingsHolder", "()Lcom/xiaomi/fitness/detail/video/share/holder/RecordFeelingsHolder;", "setRecordFeelingsHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/RecordFeelingsHolder;)V", "Lcom/xiaomi/fitness/detail/video/share/holder/TimelineViewHolder;", "timelineHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/TimelineViewHolder;", "getTimelineHolder", "()Lcom/xiaomi/fitness/detail/video/share/holder/TimelineViewHolder;", "setTimelineHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/TimelineViewHolder;)V", "Lcom/xiaomi/fitness/detail/video/share/holder/AddPicHolder;", "addPicHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/AddPicHolder;", "getAddPicHolder", "()Lcom/xiaomi/fitness/detail/video/share/holder/AddPicHolder;", "setAddPicHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/AddPicHolder;)V", "<init>", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;Lpqp;Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EditDetailPanelHolder {

    @NotNull
    private final SharePathVideoAmapActivity activity;
    public AddPicHolder addPicHolder;

    @NotNull
    private final MutableLiveData<Float> curtProgressLiveData;

    @NotNull
    private final pqp mBinding;

    @NotNull
    private final SharePathVideoViewModel mViewModel;
    public RecordFeelingsHolder recordFeelingsHolder;
    public TimelineViewHolder timelineHolder;

    @NotNull
    private final MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData;

    @NotNull
    private final MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData;

    public EditDetailPanelHolder(@NotNull SharePathVideoAmapActivity activity, @NotNull pqp mBinding, @NotNull SharePathVideoViewModel mViewModel, @NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData, @NotNull MutableLiveData<Float> curtProgressLiveData, @NotNull MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        Intrinsics.checkNotNullParameter(traceDataMapLiveData, "traceDataMapLiveData");
        Intrinsics.checkNotNullParameter(curtProgressLiveData, "curtProgressLiveData");
        Intrinsics.checkNotNullParameter(traceStyleResModeLiveData, "traceStyleResModeLiveData");
        this.activity = activity;
        this.mBinding = mBinding;
        this.mViewModel = mViewModel;
        this.traceDataMapLiveData = traceDataMapLiveData;
        this.curtProgressLiveData = curtProgressLiveData;
        this.traceStyleResModeLiveData = traceStyleResModeLiveData;
    }

    public final void addWonderfulMomentsToTimeline(@Nullable Map<Float, MomentsModel> momentMap) {
        getTimelineHolder().addWonderfulMomentsToTimeline(momentMap);
    }

    @NotNull
    public final SharePathVideoAmapActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final AddPicHolder getAddPicHolder() {
        AddPicHolder addPicHolder = this.addPicHolder;
        if (addPicHolder != null) {
            return addPicHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addPicHolder");
        return null;
    }

    @NotNull
    public final pqp getMBinding() {
        return this.mBinding;
    }

    @NotNull
    public final SharePathVideoViewModel getMViewModel() {
        return this.mViewModel;
    }

    @NotNull
    public final RecordFeelingsHolder getRecordFeelingsHolder() {
        RecordFeelingsHolder recordFeelingsHolder = this.recordFeelingsHolder;
        if (recordFeelingsHolder != null) {
            return recordFeelingsHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recordFeelingsHolder");
        return null;
    }

    @NotNull
    public final TimelineViewHolder getTimelineHolder() {
        TimelineViewHolder timelineViewHolder = this.timelineHolder;
        if (timelineViewHolder != null) {
            return timelineViewHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timelineHolder");
        return null;
    }

    public final void initHolder() {
        SharePathVideoAmapActivity sharePathVideoAmapActivity = this.activity;
        frp timelineView = this.mBinding.H;
        Intrinsics.checkNotNullExpressionValue(timelineView, "timelineView");
        TextView titleTv = this.mBinding.I;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        setTimelineHolder(new TimelineViewHolder(sharePathVideoAmapActivity, timelineView, titleTv, this.mViewModel.getMBasicReport(), this.traceDataMapLiveData, this.curtProgressLiveData, this.traceStyleResModeLiveData));
        getTimelineHolder().initTimelineHolder();
        SharePathVideoAmapActivity sharePathVideoAmapActivity2 = this.activity;
        brp addPicRecyclerLayout = this.mBinding.B;
        Intrinsics.checkNotNullExpressionValue(addPicRecyclerLayout, "addPicRecyclerLayout");
        setAddPicHolder(new AddPicHolder(sharePathVideoAmapActivity2, addPicRecyclerLayout, this.traceDataMapLiveData, this.curtProgressLiveData));
        getAddPicHolder().initData();
        SharePathVideoAmapActivity sharePathVideoAmapActivity3 = this.activity;
        srp recordFeelings = this.mBinding.G;
        Intrinsics.checkNotNullExpressionValue(recordFeelings, "recordFeelings");
        setRecordFeelingsHolder(new RecordFeelingsHolder(sharePathVideoAmapActivity3, recordFeelings, this.traceDataMapLiveData, this.curtProgressLiveData));
        getRecordFeelingsHolder().initHolder();
        getTimelineHolder().setOnClickIndicatorListener(new DraggableTimelineView.OnClickIndicatorListener() { // from class: com.xiaomi.fitness.detail.video.share.holder.EditDetailPanelHolder.initHolder.1
            @Override // com.xiaomi.fitness.detail.video.share.widget.DraggableTimelineView.OnClickIndicatorListener
            public void onIndicatorClick(float progressValue) {
                Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "timelionIndicatorClick  progressValue=" + progressValue + " setOnClickIndicatorListener");
                EditDetailPanelHolder.this.getTimelineHolder().scrollToProgress(progressValue);
                EditDetailPanelHolder.this.curtProgressLiveData.setValue(Float.valueOf(progressValue));
                EditDetailPanelHolder.this.getMViewModel().updateSelectedStatus(true);
                EditDetailPanelHolder.this.getAddPicHolder().refreshAddPicView();
                EditDetailPanelHolder.this.getRecordFeelingsHolder().refreshEditText();
            }

            @Override // com.xiaomi.fitness.detail.video.share.widget.DraggableTimelineView.OnClickIndicatorListener
            public void onNoIndicatorClick(float progressValue) {
                EditDetailPanelHolder.this.curtProgressLiveData.setValue(Float.valueOf(progressValue));
                EditDetailPanelHolder.this.getMViewModel().unselectAllIndicators();
                EditDetailPanelHolder.this.getAddPicHolder().refreshAddPicView();
                EditDetailPanelHolder.this.getRecordFeelingsHolder().refreshEditText();
            }
        });
    }

    public final void setAddPicHolder(@NotNull AddPicHolder addPicHolder) {
        Intrinsics.checkNotNullParameter(addPicHolder, "<set-?>");
        this.addPicHolder = addPicHolder;
    }

    public final void setDefaultType(boolean isDefault) {
        getTimelineHolder().setDefaultProgressBarType(isDefault);
    }

    public final void setLineColor(@NotNull List<Integer> colorList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        getTimelineHolder().setLineColor(colorList);
    }

    public final void setOnTimelineDragCallback(@Nullable final Function1<? super Float, Unit> callback) {
        getTimelineHolder().setDragListener(new DraggableTimelineView.OnDragListener() { // from class: com.xiaomi.fitness.detail.video.share.holder.EditDetailPanelHolder.setOnTimelineDragCallback.1
            @Override // com.xiaomi.fitness.detail.video.share.widget.DraggableTimelineView.OnDragListener
            public void onDrag(float progressValue) {
                EditDetailPanelHolder.this.curtProgressLiveData.setValue(Float.valueOf(progressValue));
                Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "setDragListener progressValue=" + progressValue + " setDragListener");
                Function1<Float, Unit> function1 = callback;
                if (function1 != null) {
                    function1.invoke2(Float.valueOf(progressValue));
                }
            }
        });
    }

    public final void setRecordFeelingsHolder(@NotNull RecordFeelingsHolder recordFeelingsHolder) {
        Intrinsics.checkNotNullParameter(recordFeelingsHolder, "<set-?>");
        this.recordFeelingsHolder = recordFeelingsHolder;
    }

    public final void setTimelineHolder(@NotNull TimelineViewHolder timelineViewHolder) {
        Intrinsics.checkNotNullParameter(timelineViewHolder, "<set-?>");
        this.timelineHolder = timelineViewHolder;
    }

    public final void setTimelineScrollToProgressValue(float progressValue) {
        getTimelineHolder().scrollToProgress(progressValue);
    }
}
