package com.xiaomi.fitness.detail.video.share.holder;

import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.video.share.holder.TimelineViewHolder;
import com.xiaomi.fitness.detail.video.share.model.MomentsModel;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.detail.video.share.widget.DraggableTimelineView;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt;
import defpackage.byi;
import defpackage.frp;
import defpackage.j1j;
import defpackage.xr5;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 A2\u00020\u0001:\u0001ABa\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u001a\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000200\u0018\u00010\n0/\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020/\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040/¢\u0006\u0004\b?\u0010@J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R(\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000200\u0018\u00010\n0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/TimelineViewHolder;", "", "", "progressValue", "", "constructDistanceStr", "(Ljava/lang/Float;)Ljava/lang/String;", "", "initTimelineHolder", "()V", "", "Lcom/xiaomi/fitness/detail/video/share/model/MomentsModel;", "momentMap", "addWonderfulMomentsToTimeline", "(Ljava/util/Map;)V", "Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView$OnDragListener;", "dragListener", "setDragListener", "(Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView$OnDragListener;)V", "Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView$OnClickIndicatorListener;", "onClickIndicatorListener", "setOnClickIndicatorListener", "(Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView$OnClickIndicatorListener;)V", "scrollToProgress", "(F)V", "", "", "colorList", "setLineColor", "(Ljava/util/List;)V", "", "isDefault", "setDefaultProgressBarType", "(Z)V", "Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;", "getActivity", "()Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getMBasicReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "traceDataMapLiveData", "Landroidx/lifecycle/MutableLiveData;", "curtProgressLiveData", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "traceStyleResModeLiveData", "Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView;", "timelineView", "Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView;", "showKmUnit", "Z", "distanceInMeter", "F", "Lfrp;", "mBinding", "<init>", "(Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;Lfrp;Landroid/widget/TextView;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TimelineViewHolder {

    @NotNull
    public static final String TAG = "TimelineViewHolder";

    @NotNull
    private final SharePathVideoAmapActivity activity;

    @NotNull
    private final MutableLiveData<Float> curtProgressLiveData;
    private float distanceInMeter;

    @Nullable
    private final SportBasicReport mBasicReport;
    private boolean showKmUnit;

    @NotNull
    private final DraggableTimelineView timelineView;

    @NotNull
    private final TextView titleTv;

    @NotNull
    private final MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData;

    @NotNull
    private final MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData;

    public TimelineViewHolder(@NotNull SharePathVideoAmapActivity activity, @NotNull frp mBinding, @NotNull TextView titleTv, @Nullable SportBasicReport sportBasicReport, @NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData, @NotNull MutableLiveData<Float> curtProgressLiveData, @NotNull MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(titleTv, "titleTv");
        Intrinsics.checkNotNullParameter(traceDataMapLiveData, "traceDataMapLiveData");
        Intrinsics.checkNotNullParameter(curtProgressLiveData, "curtProgressLiveData");
        Intrinsics.checkNotNullParameter(traceStyleResModeLiveData, "traceStyleResModeLiveData");
        this.activity = activity;
        this.titleTv = titleTv;
        this.mBasicReport = sportBasicReport;
        this.traceDataMapLiveData = traceDataMapLiveData;
        this.curtProgressLiveData = curtProgressLiveData;
        this.traceStyleResModeLiveData = traceStyleResModeLiveData;
        DraggableTimelineView timeline = mBinding.A;
        Intrinsics.checkNotNullExpressionValue(timeline, "timeline");
        this.timelineView = timeline;
    }

    private final String constructDistanceStr(Float progressValue) {
        float fFloatValue = progressValue != null ? progressValue.floatValue() : 0.0f;
        float f = this.distanceInMeter;
        float f2 = (fFloatValue * f) / 100;
        boolean z = this.showKmUnit;
        int i = z ? 1000 : 1;
        int i2 = z ? byi.Z : byi.a0;
        float f3 = i;
        float fE = xr5.e(2, f / f3);
        float fE2 = xr5.e(2, f2 / f3);
        String quantityString = this.activity.getResources().getQuantityString(i2, 2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return ResourceExtKt.getString(j1j.y0, String.valueOf(fE2), String.valueOf(fE), quantityString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTimelineHolder$lambda$0(TimelineViewHolder this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "updateDataAndRedrawTimeline traceDataMapLiveData.value=" + this$0.traceDataMapLiveData.getValue());
        this$0.timelineView.updateDataAndRedrawTimeline(this$0.traceDataMapLiveData.getValue());
        SportTracePointDataModel tracePointDataModelByProgressValue = SportTraceVideoShareUtilKt.getTracePointDataModelByProgressValue(this$0.traceDataMapLiveData, this$0.curtProgressLiveData);
        if (SportTraceVideoShareUtilKt.hasOnlyTextOrPic(tracePointDataModelByProgressValue)) {
            SportTraceVideoShareUtilKt.updateMarkersOnPreviewSection(tracePointDataModelByProgressValue, this$0.activity, this$0.curtProgressLiveData, this$0.traceStyleResModeLiveData);
        } else if (SportTraceVideoShareUtilKt.isValidDataModel(tracePointDataModelByProgressValue)) {
            SportTraceVideoShareUtilKt.hasOnlyWonderfulMoments(tracePointDataModelByProgressValue);
        } else {
            SharePathViewAmapActivityExtKt.removeImgItextMarker(this$0.activity, tracePointDataModelByProgressValue, this$0.curtProgressLiveData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTimelineHolder$lambda$1(TimelineViewHolder this$0, Float f) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.titleTv.setText(this$0.constructDistanceStr(f));
        return Unit.INSTANCE;
    }

    public final void addWonderfulMomentsToTimeline(@Nullable Map<Float, MomentsModel> momentMap) {
        if (momentMap == null || momentMap.isEmpty()) {
            return;
        }
        Iterator<Float> it = momentMap.keySet().iterator();
        while (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            MomentsModel momentsModel = momentMap.get(Float.valueOf(fFloatValue));
            if (momentsModel != null) {
                SportTraceVideoShareUtilKt.addWonderfulMoment(this.traceDataMapLiveData, fFloatValue, momentsModel);
            }
        }
    }

    @NotNull
    public final SharePathVideoAmapActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final SportBasicReport getMBasicReport() {
        return this.mBasicReport;
    }

    public final void initTimelineHolder() {
        Integer distance;
        int screenWidth = UIUtils.INSTANCE.getScreenWidth(ApplicationExtKt.getApplication());
        this.timelineView.setStartValue(0);
        DraggableTimelineView draggableTimelineView = this.timelineView;
        draggableTimelineView.setEndValue((screenWidth * 2) / draggableTimelineView.getSpace());
        this.timelineView.setInterval(10);
        this.timelineView.setNumber(0);
        this.timelineView.setDestinationOffset(0);
        DraggableTimelineView draggableTimelineView2 = this.timelineView;
        draggableTimelineView2.setMaxScrollX(((screenWidth * 3) / 2) - draggableTimelineView2.getDestinationOffset());
        DraggableTimelineView draggableTimelineView3 = this.timelineView;
        draggableTimelineView3.setMinScrollX(((-screenWidth) / 2) + draggableTimelineView3.getDestinationOffset());
        this.timelineView.setCurtProgressLiveData(this.curtProgressLiveData);
        this.traceDataMapLiveData.observe(this.activity, new TimelineViewHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lfp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TimelineViewHolder.initTimelineHolder$lambda$0(this.f25019a, (Map) obj);
            }
        }));
        SportBasicReport sportBasicReport = this.mBasicReport;
        float fIntValue = (sportBasicReport == null || (distance = sportBasicReport.getDistance()) == null) ? 0.0f : distance.intValue();
        this.distanceInMeter = fIntValue;
        this.showKmUnit = fIntValue > 1000.0f;
        this.titleTv.setText(constructDistanceStr(Float.valueOf(0.0f)));
        this.curtProgressLiveData.observe(this.activity, new TimelineViewHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mfp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TimelineViewHolder.initTimelineHolder$lambda$1(this.f26118a, (Float) obj);
            }
        }));
    }

    public final void scrollToProgress(float progressValue) {
        this.timelineView.scrollToProcessValue(progressValue);
    }

    public final void setDefaultProgressBarType(boolean isDefault) {
        this.timelineView.setDefaultProgressBar(isDefault);
    }

    public final void setDragListener(@NotNull DraggableTimelineView.OnDragListener dragListener) {
        Intrinsics.checkNotNullParameter(dragListener, "dragListener");
        this.timelineView.setTimelineDragListener(dragListener);
    }

    public final void setLineColor(@NotNull List<Integer> colorList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        this.timelineView.setLineColor(colorList);
    }

    public final void setOnClickIndicatorListener(@NotNull DraggableTimelineView.OnClickIndicatorListener onClickIndicatorListener) {
        Intrinsics.checkNotNullParameter(onClickIndicatorListener, "onClickIndicatorListener");
        this.timelineView.setOnClickIndicatorListener(onClickIndicatorListener);
    }
}
