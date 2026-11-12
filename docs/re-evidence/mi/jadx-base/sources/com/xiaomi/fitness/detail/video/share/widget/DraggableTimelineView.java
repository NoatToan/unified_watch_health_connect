package com.xiaomi.fitness.detail.video.share.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.video.share.model.MomentsModel;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.detail.video.share.widget.DraggableTimelineView;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.dki;
import defpackage.hoi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u0091\u00012\u00020\u0001:\u0006\u0091\u0001\u0092\u0001\u0093\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0018\u0010[\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00020\fH\u0014J\u0010\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020`H\u0014J(\u0010a\u001a\u00020\u000e2\u0016\b\u0002\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010_\u001a\u00020`H\u0002J\u001c\u0010c\u001a\u00020\u000e2\u0014\u0010d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aJ\u0010\u0010e\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010f\u001a\u00020\u00122\u0006\u0010g\u001a\u00020\u0012H\u0002J\u0010\u0010m\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020`H\u0002J\b\u0010n\u001a\u00020\u0017H\u0002J\u001a\u0010o\u001a\u0004\u0018\u00010p2\u0006\u0010q\u001a\u00020\u00122\u0006\u0010r\u001a\u00020\u0012H\u0002J\u0018\u0010s\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020`2\u0006\u0010t\u001a\u00020FH\u0002J\u0010\u0010u\u001a\u00020F2\u0006\u0010v\u001a\u00020wH\u0016J\b\u0010x\u001a\u00020\u000eH\u0002J\b\u0010y\u001a\u00020\u000eH\u0002J\b\u0010z\u001a\u00020\u000eH\u0002J\u001a\u0010{\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\f2\b\b\u0002\u0010}\u001a\u00020FH\u0002J)\u0010~\u001a\u00020\u000e2\u0006\u0010\u007f\u001a\u00020\u00122\u0007\u0010\u0080\u0001\u001a\u00020\f2\u0006\u0010_\u001a\u00020`2\u0006\u0010t\u001a\u00020FH\u0002J!\u0010\u0081\u0001\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u00122\u0006\u0010_\u001a\u00020`2\u0006\u0010t\u001a\u00020FH\u0002J!\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u00122\u0006\u0010_\u001a\u00020`2\u0006\u0010t\u001a\u00020FH\u0002J,\u0010\u0083\u0001\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u00122\u0007\u0010\u0084\u0001\u001a\u00020\f2\u0006\u0010_\u001a\u00020`2\b\b\u0002\u0010t\u001a\u00020FH\u0002J\u001a\u0010\u0085\u0001\u001a\u00020\u00122\u0006\u0010\u007f\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\u0012H\u0002J\u0012\u0010\u0087\u0001\u001a\u00020\u000e2\u0007\u0010\u0088\u0001\u001a\u00020\fH\u0002J\t\u0010\u0089\u0001\u001a\u00020\u000eH\u0016J\u0012\u0010\u008a\u0001\u001a\u00020\u000e2\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0002J\t\u0010\u008c\u0001\u001a\u00020\u000eH\u0002J\t\u0010\u008d\u0001\u001a\u00020\u000eH\u0002J\u0017\u0010\u008e\u0001\u001a\u00020\u000e2\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0090\u0001R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010%\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001a\u0010(\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u000e\u0010+\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001a\u00104\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R\u001a\u00107\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001f\"\u0004\bI\u0010!R\u000e\u0010J\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001f\"\u0004\bM\u0010!R\u000e\u0010N\u001a\u00020OX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00120ZX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010i\u001a\u00020F2\u0006\u0010h\u001a\u00020F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006\u0094\u0001"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mOnClickIndicatorListener", "Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView$OnClickIndicatorListener;", "lineColorList", "Ljava/util/ArrayList;", "", "setOnClickIndicatorListener", "", "onClickIndicatorListener", "scrollToProcessValue", "progressValue", "", "setTimelineDragListener", "mListener", "Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView$OnDragListener;", "curtAnchorLinePaint", "Landroid/graphics/Paint;", "timelinePaint", "mTraceDataMap", "", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "screenWidth", "space", "getSpace", "()I", "setSpace", "(I)V", "destinationOffset", "getDestinationOffset", "setDestinationOffset", "startValue", "getStartValue", "setStartValue", "endValue", "getEndValue", "setEndValue", "mLastX", "touchSlop", "mScroller", "Landroid/widget/Scroller;", "mMinimumVelocity", "mMaximumVelocity", "maxScrollX", "getMaxScrollX", "setMaxScrollX", "minScrollX", "getMinScrollX", "setMinScrollX", "timeLineWholeLength", "getTimeLineWholeLength", "()F", "setTimeLineWholeLength", "(F)V", "currentOffset", "curtProgressLiveData", "Landroidx/lifecycle/MutableLiveData;", "getCurtProgressLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setCurtProgressLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "mVelocityTracker", "Landroid/view/VelocityTracker;", "isFastScroll", "", RealNameWebViewActivity.NUMBER, "getNumber", "setNumber", "baselineOffset", "interval", "getInterval", "setInterval", "anchorBitmap", "Landroid/graphics/Bitmap;", "rectF", "Landroid/graphics/RectF;", "timelineY", "anchorIndicatorTop", "anchorIndicatorBottom", "selectedAnchorIndicatorTop", "selectedAnchorIndicatorBottom", "timelineColor", "timelineUnreachedColor", "indicatorPosList", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "updateTimelineWithTraceDataMap", "map", "updateDataAndRedrawTimeline", "traceDataMap", "getAbsXFromProgressValue", "getProgressValueFromAbsX", "absX", "value", "isDefaultProgressBar", "()Z", "setDefaultProgressBar", "(Z)V", "drawTimelineAndCurtAnchor", "getUnreachedColor", "getLineGradient", "Landroid/graphics/LinearGradient;", "endX", "lineX", "drawMomentsIndicator", "selected", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "initCurtAnchorLinePaint", "initTimelinePaint", "initOtherResource", "scrollToValidPositionWithinBounds", "curtX", "afterMeasure", "drawMomentIndicator", "x", "type", "drawTextIndicator", "drawPictureIcon", "drawCommonIndicator", "resId", "checkWeatherInIndicatorListAndGetProgress", "y", "flingX", "velocityX", "computeScroll", "computeAndCallback", "scrollX", "obtainVelocityTracker", "releaseVelocityTracker", "setLineColor", "colorList", "", "Companion", "OnDragListener", "OnClickIndicatorListener", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDraggableTimelineView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DraggableTimelineView.kt\ncom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,524:1\n216#2:525\n217#2:528\n1863#3,2:526\n1557#3:529\n1628#3,3:530\n1872#3,3:533\n*S KotlinDebug\n*F\n+ 1 DraggableTimelineView.kt\ncom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView\n*L\n153#1:525\n153#1:528\n163#1:526,2\n257#1:529\n257#1:530,3\n438#1:533,3\n*E\n"})
public final class DraggableTimelineView extends View {
    public static final int SCROLL_THRESHOLD = 10;

    @NotNull
    public static final String TAG = "DraggableTimelineView";
    private Bitmap anchorBitmap;
    private final float anchorIndicatorBottom;
    private final float anchorIndicatorTop;
    private int baselineOffset;
    private int currentOffset;

    @NotNull
    private Paint curtAnchorLinePaint;

    @Nullable
    private MutableLiveData<Float> curtProgressLiveData;
    private int destinationOffset;
    private int endValue;

    @NotNull
    private Set<Float> indicatorPosList;
    private int interval;
    private boolean isDefaultProgressBar;
    private boolean isFastScroll;

    @NotNull
    private ArrayList<Integer> lineColorList;
    private float mLastX;

    @Nullable
    private OnDragListener mListener;
    private int mMaximumVelocity;
    private int mMinimumVelocity;

    @Nullable
    private OnClickIndicatorListener mOnClickIndicatorListener;

    @Nullable
    private Scroller mScroller;

    @Nullable
    private Map<Float, SportTracePointDataModel> mTraceDataMap;

    @Nullable
    private VelocityTracker mVelocityTracker;
    private int maxScrollX;
    private int minScrollX;
    private int number;
    private RectF rectF;
    private final int screenWidth;
    private final float selectedAnchorIndicatorBottom;
    private final float selectedAnchorIndicatorTop;
    private int space;
    private int startValue;
    private float timeLineWholeLength;
    private final int timelineColor;
    private Paint timelinePaint;
    private final int timelineUnreachedColor;
    private final float timelineY;
    private int touchSlop;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView$OnClickIndicatorListener;", "", "onIndicatorClick", "", "progressValue", "", "onNoIndicatorClick", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnClickIndicatorListener {
        void onIndicatorClick(float progressValue);

        void onNoIndicatorClick(float progressValue);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/widget/DraggableTimelineView$OnDragListener;", "", "onDrag", "", "progressValue", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDragListener {
        void onDrag(float progressValue);
    }

    public DraggableTimelineView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lineColorList = new ArrayList<>();
        this.curtAnchorLinePaint = new Paint();
        UIUtils uIUtils = UIUtils.INSTANCE;
        int screenWidth = uIUtils.getScreenWidth(ApplicationExtKt.getApplication());
        this.screenWidth = screenWidth;
        this.space = 20;
        this.destinationOffset = 20;
        this.endValue = uIUtils.getScreenWidth(ApplicationExtKt.getApplication()) * 2;
        this.maxScrollX = screenWidth / 2;
        this.minScrollX = (-screenWidth) / 2;
        this.timeLineWholeLength = 2 * screenWidth;
        this.interval = 5;
        this.timelineY = 200.0f;
        this.anchorIndicatorTop = 90.0f;
        this.anchorIndicatorBottom = 181.6f;
        this.selectedAnchorIndicatorTop = 66.6f;
        this.selectedAnchorIndicatorBottom = 205.1f;
        this.timelineColor = getResources().getColor(dki.T1, null);
        this.timelineUnreachedColor = getResources().getColor(dki.S1, null);
        this.indicatorPosList = new LinkedHashSet();
        initCurtAnchorLinePaint();
        initTimelinePaint();
        initOtherResource();
        this.isDefaultProgressBar = true;
    }

    private final float checkWeatherInIndicatorListAndGetProgress(float x, float y) {
        Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, CollectionsKt___CollectionsKt.joinToString$default(this.indicatorPosList, null, null, null, 0, null, new Function1() { // from class: f47
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DraggableTimelineView.checkWeatherInIndicatorListAndGetProgress$lambda$5(((Float) obj).floatValue());
            }
        }, 31, null));
        if (y <= this.anchorIndicatorBottom && y >= this.anchorIndicatorTop) {
            int i = 0;
            for (Object obj : this.indicatorPosList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                float fFloatValue = ((Number) obj).floatValue();
                if (Math.abs(x - getAbsXFromProgressValue(fFloatValue)) < 16.0f) {
                    Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "checkWeatherInIndicatorListAndGetPosX index=" + i + " validPos=" + fFloatValue);
                    return fFloatValue;
                }
                i = i2;
            }
        }
        return -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence checkWeatherInIndicatorListAndGetProgress$lambda$5(float f) {
        return "indicatorPos=" + f;
    }

    private final void computeAndCallback(int scrollX) {
        if (this.mListener != null) {
            float progressValueFromAbsX = getProgressValueFromAbsX(scrollX + (this.screenWidth / 2));
            Logger.d(TAG, "computeAndCallback scrollX=" + scrollX + " progressValue=" + progressValueFromAbsX);
            OnDragListener onDragListener = this.mListener;
            Intrinsics.checkNotNull(onDragListener);
            onDragListener.onDrag(progressValueFromAbsX);
        }
    }

    private final void drawCommonIndicator(float curtX, int resId, Canvas canvas, boolean selected) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), resId);
        if (selected) {
            RectF rectF = this.rectF;
            if (rectF == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rectF");
                rectF = null;
            }
            float f = 50;
            rectF.left = curtX - f;
            RectF rectF2 = this.rectF;
            if (rectF2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rectF");
                rectF2 = null;
            }
            rectF2.right = curtX + f;
            RectF rectF3 = this.rectF;
            if (rectF3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rectF");
                rectF3 = null;
            }
            rectF3.top = this.selectedAnchorIndicatorTop;
            RectF rectF4 = this.rectF;
            if (rectF4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rectF");
                rectF4 = null;
            }
            rectF4.bottom = this.selectedAnchorIndicatorBottom;
        } else {
            RectF rectF5 = this.rectF;
            if (rectF5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rectF");
                rectF5 = null;
            }
            float f2 = 33;
            rectF5.left = curtX - f2;
            RectF rectF6 = this.rectF;
            if (rectF6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rectF");
                rectF6 = null;
            }
            rectF6.right = curtX + f2;
            RectF rectF7 = this.rectF;
            if (rectF7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rectF");
                rectF7 = null;
            }
            rectF7.top = this.anchorIndicatorTop;
            RectF rectF8 = this.rectF;
            if (rectF8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rectF");
                rectF8 = null;
            }
            rectF8.bottom = this.anchorIndicatorBottom;
        }
        RectF rectF9 = this.rectF;
        if (rectF9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rectF");
            rectF9 = null;
        }
        canvas.drawBitmap(bitmapDecodeResource, (Rect) null, rectF9, (Paint) null);
    }

    public static /* synthetic */ void drawCommonIndicator$default(DraggableTimelineView draggableTimelineView, float f, int i, Canvas canvas, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        draggableTimelineView.drawCommonIndicator(f, i, canvas, z);
    }

    private final void drawMomentIndicator(float x, int type, Canvas canvas, boolean selected) {
        drawCommonIndicator(x, SportTraceVideoShareUtilKt.getMomentsIndicatorResIdByType(type), canvas, selected);
    }

    private final void drawMomentsIndicator(Canvas canvas, boolean selected) {
        drawMomentIndicator(50.0f, 0, canvas, selected);
        drawMomentIndicator(100.0f, 1, canvas, selected);
        drawMomentIndicator(200.0f, 2, canvas, selected);
    }

    private final void drawPictureIcon(float curtX, Canvas canvas, boolean selected) {
        drawCommonIndicator(curtX, hoi.y, canvas, selected);
    }

    private final void drawTextIndicator(float curtX, Canvas canvas, boolean selected) {
        drawCommonIndicator(curtX, hoi.F, canvas, selected);
    }

    private final void drawTimelineAndCurtAnchor(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        float scrollX = this.baselineOffset + getScrollX();
        if (this.isDefaultProgressBar) {
            float f = this.endValue * this.space;
            LinearGradient lineGradient = getLineGradient(scrollX, f);
            if (lineGradient != null) {
                Paint paint4 = this.timelinePaint;
                if (paint4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("timelinePaint");
                    paint4 = null;
                }
                paint4.setShader(lineGradient);
            }
            float f2 = this.timelineY;
            Paint paint5 = this.timelinePaint;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timelinePaint");
                paint = null;
            } else {
                paint = paint5;
            }
            canvas.drawLine(0.0f, f2, scrollX, f2, paint);
            float f3 = this.timelineY;
            canvas.drawLine(scrollX, f3, f, f3, getUnreachedColor());
        } else {
            Paint paint6 = this.timelinePaint;
            if (paint6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timelinePaint");
                paint6 = null;
            }
            paint6.setColor(this.timelineColor);
            float f4 = this.timelineY;
            Paint paint7 = this.timelinePaint;
            if (paint7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timelinePaint");
                paint2 = null;
            } else {
                paint2 = paint7;
            }
            canvas.drawLine(0.0f, f4, scrollX, f4, paint2);
            Paint paint8 = this.timelinePaint;
            if (paint8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timelinePaint");
                paint8 = null;
            }
            paint8.setColor(this.timelineUnreachedColor);
            float f5 = this.timelineY;
            float f6 = this.endValue * this.space;
            Paint paint9 = this.timelinePaint;
            if (paint9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timelinePaint");
                paint3 = null;
            } else {
                paint3 = paint9;
            }
            canvas.drawLine(scrollX, f5, f6, f5, paint3);
        }
        Logger.d(TAG, "centerX=" + scrollX + " baselineOffset=" + this.baselineOffset + " scrollX=" + getScrollX());
        RectF rectF = this.rectF;
        if (rectF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rectF");
            rectF = null;
        }
        float f7 = 2;
        rectF.left = scrollX - f7;
        RectF rectF2 = this.rectF;
        if (rectF2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rectF");
            rectF2 = null;
        }
        rectF2.right = scrollX + f7;
        RectF rectF3 = this.rectF;
        if (rectF3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rectF");
            rectF3 = null;
        }
        rectF3.top = this.timelineY - 120.5f;
        RectF rectF4 = this.rectF;
        if (rectF4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rectF");
            rectF4 = null;
        }
        rectF4.bottom = this.timelineY + 52.5f;
        RectF rectF5 = this.rectF;
        if (rectF5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rectF");
            rectF5 = null;
        }
        Bitmap bitmap = this.anchorBitmap;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorBitmap");
            bitmap = null;
        }
        canvas.drawBitmap(bitmap, (Rect) null, rectF5, (Paint) null);
    }

    private final void flingX(int velocityX) {
        Scroller scroller = this.mScroller;
        Intrinsics.checkNotNull(scroller);
        scroller.fling(getScrollX(), getScrollY(), velocityX, 0, this.minScrollX, this.maxScrollX, 0, 0);
        Scroller scroller2 = this.mScroller;
        Intrinsics.checkNotNull(scroller2);
        awakenScrollBars(scroller2.getDuration());
        invalidate();
    }

    private final float getAbsXFromProgressValue(float progressValue) {
        float f = (progressValue / 100) * this.timeLineWholeLength;
        Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "getCurtXFromProgressValue absX=" + f);
        return f;
    }

    private final LinearGradient getLineGradient(float endX, float lineX) {
        float f = endX / lineX;
        int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost((int) (this.lineColorList.size() * f), this.lineColorList.size());
        if (iCoerceAtMost < 2) {
            return null;
        }
        float f2 = 1.0f / iCoerceAtMost;
        float[] fArr = new float[iCoerceAtMost];
        List listTake = CollectionsKt___CollectionsKt.take(this.lineColorList, iCoerceAtMost);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        float f3 = 0.0f;
        int i = 0;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            f3 += f2;
            fArr[i] = f3;
            i++;
            arrayList.add(Integer.valueOf(iIntValue));
        }
        FitnessLogUtils.d("DraggableTimelineView2", "colorRatioSize:" + iCoerceAtMost + ",colorListSize:" + arrayList.size() + ",ratio:" + f + " , size:" + iCoerceAtMost + " , space:" + f2 + " , endx:" + endX + " , lineX:" + lineX);
        float f4 = this.timelineY;
        return new LinearGradient(0.0f, f4, endX, f4, CollectionsKt___CollectionsKt.toIntArray(arrayList), fArr, Shader.TileMode.CLAMP);
    }

    private final float getProgressValueFromAbsX(float absX) {
        float f = (absX / this.timeLineWholeLength) * 100;
        Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "getProgressValueFromAbsX progressValue=" + f);
        return f;
    }

    private final Paint getUnreachedColor() {
        Paint paint = new Paint();
        paint.setColor(this.timelineUnreachedColor);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(15.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private final void initCurtAnchorLinePaint() {
        this.curtAnchorLinePaint.setAntiAlias(true);
        this.curtAnchorLinePaint.setColor(getResources().getColor(dki.o2, null));
        this.curtAnchorLinePaint.setStrokeWidth(5.0f);
        setBackgroundColor(ApplicationExtKt.getApplication().getResources().getColor(dki.d2, null));
    }

    private final void initOtherResource() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScroller = new Scroller(getContext());
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.anchorBitmap = BitmapFactory.decodeResource(getResources(), hoi.q2);
        this.rectF = new RectF();
    }

    private final void initTimelinePaint() {
        Paint paint = new Paint();
        this.timelinePaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.timelinePaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timelinePaint");
            paint2 = null;
        }
        paint2.setStrokeWidth(15.0f);
        Paint paint4 = this.timelinePaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timelinePaint");
            paint4 = null;
        }
        paint4.setStrokeCap(Paint.Cap.ROUND);
        Paint paint5 = this.timelinePaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timelinePaint");
        } else {
            paint3 = paint5;
        }
        paint3.setStyle(Paint.Style.FILL);
    }

    private final void obtainVelocityTracker() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private final void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            Intrinsics.checkNotNull(velocityTracker);
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private final void scrollToValidPositionWithinBounds(int curtX, boolean afterMeasure) {
        int i = this.maxScrollX;
        if (curtX < i) {
            i = curtX;
        }
        int i2 = this.minScrollX;
        if (curtX <= i2) {
            i = i2;
        }
        scrollTo(i, 0);
        if (afterMeasure) {
            computeAndCallback(i);
        }
    }

    public static /* synthetic */ void scrollToValidPositionWithinBounds$default(DraggableTimelineView draggableTimelineView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        draggableTimelineView.scrollToValidPositionWithinBounds(i, z);
    }

    private final void updateTimelineWithTraceDataMap(Map<Float, SportTracePointDataModel> map, Canvas canvas) {
        if (map == null) {
            return;
        }
        for (Map.Entry<Float, SportTracePointDataModel> entry : map.entrySet()) {
            float fFloatValue = entry.getKey().floatValue();
            float f = (this.timeLineWholeLength * fFloatValue) / 100;
            Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "updateTimelineWithTraceDataMap progressValue=" + fFloatValue + " curtX=" + f);
            SportTracePointDataModel value = entry.getValue();
            boolean selected = value.getSelected();
            List<MomentsModel> momentsModelList = value.getMomentsModelList();
            if (momentsModelList == null || momentsModelList.isEmpty()) {
                List<Uri> imgUriList = value.getImgUriList();
                if (!(imgUriList == null || imgUriList.isEmpty())) {
                    drawPictureIcon(f, canvas, selected);
                } else {
                    String feelings = value.getFeelings();
                    if (!(feelings == null || feelings.length() == 0)) {
                        drawTextIndicator(f, canvas, selected);
                    }
                }
            } else {
                List<MomentsModel> momentsModelList2 = value.getMomentsModelList();
                if (momentsModelList2 != null) {
                    Iterator<T> it = momentsModelList2.iterator();
                    while (it.hasNext()) {
                        drawMomentIndicator(f, ((MomentsModel) it.next()).getTypeId(), canvas, selected);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateTimelineWithTraceDataMap$default(DraggableTimelineView draggableTimelineView, Map map, Canvas canvas, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        draggableTimelineView.updateTimelineWithTraceDataMap(map, canvas);
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.mScroller;
        Intrinsics.checkNotNull(scroller);
        if (scroller.computeScrollOffset()) {
            Scroller scroller2 = this.mScroller;
            Intrinsics.checkNotNull(scroller2);
            scrollToValidPositionWithinBounds$default(this, scroller2.getCurrX(), false, 2, null);
            postInvalidate();
            return;
        }
        boolean z = this.isFastScroll;
        int scrollX = getScrollX();
        Scroller scroller3 = this.mScroller;
        Intrinsics.checkNotNull(scroller3);
        Logger.d(TAG, "computeScroll isFastScroll=" + z + " scrollX=" + scrollX + " scroller.curtX=" + scroller3.getCurrX());
        if (this.isFastScroll) {
            Scroller scroller4 = this.mScroller;
            Intrinsics.checkNotNull(scroller4);
            scrollToValidPositionWithinBounds$default(this, scroller4.getCurrX(), false, 2, null);
            postInvalidate();
        }
    }

    @Nullable
    public final MutableLiveData<Float> getCurtProgressLiveData() {
        return this.curtProgressLiveData;
    }

    public final int getDestinationOffset() {
        return this.destinationOffset;
    }

    public final int getEndValue() {
        return this.endValue;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final int getMaxScrollX() {
        return this.maxScrollX;
    }

    public final int getMinScrollX() {
        return this.minScrollX;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getSpace() {
        return this.space;
    }

    public final int getStartValue() {
        return this.startValue;
    }

    public final float getTimeLineWholeLength() {
        return this.timeLineWholeLength;
    }

    /* JADX INFO: renamed from: isDefaultProgressBar, reason: from getter */
    public final boolean getIsDefaultProgressBar() {
        return this.isDefaultProgressBar;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawTimelineAndCurtAnchor(canvas);
        Logger.d(TAG, "mTraceDataMap=" + this.mTraceDataMap);
        updateTimelineWithTraceDataMap(this.mTraceDataMap, canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 ? View.MeasureSpec.getSize(widthMeasureSpec) : getContext().getResources().getDisplayMetrics().widthPixels;
        int size2 = View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824 ? View.MeasureSpec.getSize(heightMeasureSpec) : (int) (((double) (getContext().getResources().getDisplayMetrics().density * 200)) + 0.5d);
        setMeasuredDimension(size, size2);
        int i = size / 2;
        this.baselineOffset = i;
        int i2 = ((this.number - this.startValue) * this.space) - i;
        MutableLiveData<Float> mutableLiveData = this.curtProgressLiveData;
        if (mutableLiveData != null) {
            Intrinsics.checkNotNull(mutableLiveData);
            if (mutableLiveData.getValue() != null) {
                return;
            }
        }
        scrollToValidPositionWithinBounds$default(this, i2, false, 2, null);
        OnDragListener onDragListener = this.mListener;
        if (onDragListener != null) {
            onDragListener.onDrag(0.0f);
        }
        Logger.d(TAG, "onMeasure width=" + size + " height=" + size2 + " x=" + i2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x0086  */
    /* JADX WARN: Code duplicated, block: B:19:0x009f  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:26:0x010d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0119  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x009f, please report this as an issue */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        int xVelocity;
        float fCheckWeatherInIndicatorListAndGetProgress;
        OnClickIndicatorListener onClickIndicatorListener;
        Intrinsics.checkNotNullParameter(event, "event");
        obtainVelocityTracker();
        int action = event.getAction();
        if (action == 0) {
            this.mLastX = event.getX();
            Scroller scroller = this.mScroller;
            Intrinsics.checkNotNull(scroller);
            if (!scroller.isFinished()) {
                Scroller scroller2 = this.mScroller;
                Intrinsics.checkNotNull(scroller2);
                scroller2.abortAnimation();
            }
            int scrollX = getScrollX();
            float x = event.getX();
            float y = event.getY();
            Scroller scroller3 = this.mScroller;
            Logger.d(TAG, "isWithIndicatorBounds onTouchEvent scrollX=" + scrollX + " eventX=" + x + " eventY=" + y + " scroller.currX=" + (scroller3 != null ? scroller3.getCurrX() : 0) + " ");
        } else if (action == 1) {
            if (Math.abs(event.getX() - this.mLastX) < 10.0f) {
                fCheckWeatherInIndicatorListAndGetProgress = checkWeatherInIndicatorListAndGetProgress(event.getX() + getScrollX(), event.getY());
                if (fCheckWeatherInIndicatorListAndGetProgress != -1.0f) {
                    Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "onTouchEvent indicator clicked! progress=" + fCheckWeatherInIndicatorListAndGetProgress);
                    onClickIndicatorListener = this.mOnClickIndicatorListener;
                    if (onClickIndicatorListener != null) {
                        onClickIndicatorListener.onIndicatorClick(fCheckWeatherInIndicatorListAndGetProgress);
                    }
                    Scroller scroller4 = this.mScroller;
                    Intrinsics.checkNotNull(scroller4);
                    scroller4.forceFinished(true);
                    Scroller scroller5 = this.mScroller;
                    Intrinsics.checkNotNull(scroller5);
                    Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "onTouchEvent indicator clicked finished=" + scroller5.isFinished());
                }
                this.mLastX = event.getX();
            } else {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                Intrinsics.checkNotNull(velocityTracker);
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                Intrinsics.checkNotNull(velocityTracker2);
                xVelocity = (int) velocityTracker2.getXVelocity();
                Logger.d(TAG, "onTouchEvent 滑动事件");
                if (Math.abs(xVelocity) > this.mMinimumVelocity) {
                    Logger.d(TAG, "onTouchEvent 滑动事件 abs(initialVelocity) > mMinimumVelocity");
                    this.isFastScroll = true;
                    flingX(-xVelocity);
                } else {
                    Logger.d(TAG, "onTouchEvent 滑动事件 else");
                    scrollToValidPositionWithinBounds$default(this, getScrollX(), false, 2, null);
                }
                releaseVelocityTracker();
            }
        } else if (action == 2) {
            this.isFastScroll = false;
            float x2 = event.getX();
            this.currentOffset = (int) (x2 - this.mLastX);
            scrollToValidPositionWithinBounds$default(this, getScrollX() - this.currentOffset, false, 2, null);
            this.mLastX = x2;
            float scrollX2 = (this.screenWidth * 0.5f) + getScrollX();
            float progressValueFromAbsX = getProgressValueFromAbsX(scrollX2);
            OnClickIndicatorListener onClickIndicatorListener2 = this.mOnClickIndicatorListener;
            if (onClickIndicatorListener2 != null) {
                onClickIndicatorListener2.onNoIndicatorClick(progressValueFromAbsX);
            }
            Logger.d(TAG, "MotionEvent.ACTION_MOVE absX=" + scrollX2 + " currentOffset=" + this.currentOffset + " progressValue=" + progressValueFromAbsX);
        } else if (action == 3) {
            if (Math.abs(event.getX() - this.mLastX) < 10.0f) {
                fCheckWeatherInIndicatorListAndGetProgress = checkWeatherInIndicatorListAndGetProgress(event.getX() + getScrollX(), event.getY());
                if (fCheckWeatherInIndicatorListAndGetProgress != -1.0f) {
                    Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "onTouchEvent indicator clicked! progress=" + fCheckWeatherInIndicatorListAndGetProgress);
                    onClickIndicatorListener = this.mOnClickIndicatorListener;
                    if (onClickIndicatorListener != null) {
                        onClickIndicatorListener.onIndicatorClick(fCheckWeatherInIndicatorListAndGetProgress);
                    }
                    Scroller scroller6 = this.mScroller;
                    Intrinsics.checkNotNull(scroller6);
                    scroller6.forceFinished(true);
                    Scroller scroller7 = this.mScroller;
                    Intrinsics.checkNotNull(scroller7);
                    Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "onTouchEvent indicator clicked finished=" + scroller7.isFinished());
                }
                this.mLastX = event.getX();
            } else {
                VelocityTracker velocityTracker3 = this.mVelocityTracker;
                Intrinsics.checkNotNull(velocityTracker3);
                velocityTracker3.computeCurrentVelocity(1000, this.mMaximumVelocity);
                VelocityTracker velocityTracker4 = this.mVelocityTracker;
                Intrinsics.checkNotNull(velocityTracker4);
                xVelocity = (int) velocityTracker4.getXVelocity();
                Logger.d(TAG, "onTouchEvent 滑动事件");
                if (Math.abs(xVelocity) > this.mMinimumVelocity) {
                    Logger.d(TAG, "onTouchEvent 滑动事件 abs(initialVelocity) > mMinimumVelocity");
                    this.isFastScroll = true;
                    flingX(-xVelocity);
                } else {
                    Logger.d(TAG, "onTouchEvent 滑动事件 else");
                    scrollToValidPositionWithinBounds$default(this, getScrollX(), false, 2, null);
                }
                releaseVelocityTracker();
            }
        }
        VelocityTracker velocityTracker5 = this.mVelocityTracker;
        if (velocityTracker5 != null) {
            Intrinsics.checkNotNull(velocityTracker5);
            velocityTracker5.addMovement(event);
        }
        return true;
    }

    public final void scrollToProcessValue(float progressValue) {
        Scroller scroller = this.mScroller;
        Intrinsics.checkNotNull(scroller);
        scroller.forceFinished(true);
        Scroller scroller2 = this.mScroller;
        Intrinsics.checkNotNull(scroller2);
        Logger.d(TAG, "scrollToProcessValue finished=" + scroller2.isFinished());
        int i = this.screenWidth;
        float f = (((((float) 2) * progressValue) * ((float) i)) / ((float) 100)) - ((float) (i / 2));
        Logger.d(TAG, "scrollToProcessValue progressValue=" + progressValue + " toX=" + f);
        scrollToValidPositionWithinBounds$default(this, (int) f, false, 2, null);
        invalidate();
    }

    public final void setCurtProgressLiveData(@Nullable MutableLiveData<Float> mutableLiveData) {
        this.curtProgressLiveData = mutableLiveData;
    }

    public final void setDefaultProgressBar(boolean z) {
        this.isDefaultProgressBar = z;
        invalidate();
    }

    public final void setDestinationOffset(int i) {
        this.destinationOffset = i;
    }

    public final void setEndValue(int i) {
        this.endValue = i;
    }

    public final void setInterval(int i) {
        this.interval = i;
    }

    public final void setLineColor(@NotNull List<Integer> colorList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        this.lineColorList.clear();
        this.lineColorList.addAll(colorList);
    }

    public final void setMaxScrollX(int i) {
        this.maxScrollX = i;
    }

    public final void setMinScrollX(int i) {
        this.minScrollX = i;
    }

    public final void setNumber(int i) {
        this.number = i;
    }

    public final void setOnClickIndicatorListener(@NotNull OnClickIndicatorListener onClickIndicatorListener) {
        Intrinsics.checkNotNullParameter(onClickIndicatorListener, "onClickIndicatorListener");
        this.mOnClickIndicatorListener = onClickIndicatorListener;
    }

    public final void setSpace(int i) {
        this.space = i;
    }

    public final void setStartValue(int i) {
        this.startValue = i;
    }

    public final void setTimeLineWholeLength(float f) {
        this.timeLineWholeLength = f;
    }

    public final void setTimelineDragListener(@Nullable OnDragListener mListener) {
        this.mListener = mListener;
    }

    public final void updateDataAndRedrawTimeline(@Nullable Map<Float, SportTracePointDataModel> traceDataMap) {
        this.mTraceDataMap = traceDataMap;
        this.indicatorPosList.clear();
        if (traceDataMap != null && !traceDataMap.isEmpty()) {
            this.indicatorPosList.addAll(traceDataMap.keySet());
        }
        invalidate();
    }
}
