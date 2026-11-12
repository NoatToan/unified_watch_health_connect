package com.huami.treadmill.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.data.TdLineDetailRun;
import com.huami.treadmill.util.GpsHelper;
import com.xiaomi.hm.health.Constant;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b,\u00100B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00101\u001a\u00020\t¢\u0006\u0004\b,\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\tR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0017R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0017¨\u00063"}, d2 = {"Lcom/huami/treadmill/ui/component/SmallMapView;", "Landroid/view/View;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "", Constant.PAI_KEY_DAILY_PAI, "a", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Lcom/huami/treadmill/data/TdLineDetailRun;", "detail", "setLineDetailRunData", "index", "setPos", "Landroid/content/Context;", "mContext", LogUtil.I, "mViewWidth", "c", "mViewHeight", "Landroid/graphics/Paint;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Paint;", "mLinePaint", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "mAvatarImageView", "", "Lcom/huami/treadmill/util/GpsHelper$PointInfo;", "f", "Ljava/util/List;", "mOriginPoint", "g", "mIndex", "h", "mMargin", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class SmallMapView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mViewWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mViewHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Paint mLinePaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ImageView mAvatarImageView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private List<GpsHelper.PointInfo> mOriginPoint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mMargin;

    public SmallMapView(@NotNull Context context) {
        this(context, null);
    }

    private final float a(Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    private final void b(Context context) {
        ImageView imageView = new ImageView(context);
        this.mAvatarImageView = imageView;
        imageView.setImageResource(R.drawable.td_small_map_marker);
        ImageView imageView2 = this.mAvatarImageView;
        if (imageView2 != null) {
            imageView2.setLayoutParams(new ViewGroup.LayoutParams((int) a(this.mContext, 14.0f), (int) a(this.mContext, 14.0f)));
        }
        this.mMargin = (int) a(this.mContext, 7.0f);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        int size;
        int size2;
        super.onDraw(canvas);
        Paint paint = new Paint();
        this.mLinePaint = paint;
        Objects.requireNonNull(paint);
        paint.setAntiAlias(true);
        Paint paint2 = this.mLinePaint;
        Objects.requireNonNull(paint2);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.mLinePaint;
        Objects.requireNonNull(paint3);
        paint3.setStrokeWidth(3.0f);
        Paint paint4 = this.mLinePaint;
        Objects.requireNonNull(paint4);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        Paint paint5 = this.mLinePaint;
        Objects.requireNonNull(paint5);
        paint5.setStrokeJoin(Paint.Join.ROUND);
        List<GpsHelper.PointInfo> list = this.mOriginPoint;
        if (list == null) {
            return;
        }
        Paint paint6 = this.mLinePaint;
        Objects.requireNonNull(paint6);
        paint6.setColor(ContextCompat.getColor(getContext(), R.color.cl_565757));
        GpsHelper.PathInfo pathInfoCreatePathInfo = GpsHelper.PathInfo.INSTANCE.createPathInfo(list, list.size());
        int i = 0;
        if (pathInfoCreatePathInfo.getPathInfo() != null && (size2 = pathInfoCreatePathInfo.getPathInfo().size()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                Path path = pathInfoCreatePathInfo.getPathInfo().get(i2);
                Paint paint7 = this.mLinePaint;
                Objects.requireNonNull(paint7);
                canvas.drawPath(path, paint7);
                if (i3 >= size2) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        Paint paint8 = this.mLinePaint;
        Objects.requireNonNull(paint8);
        paint8.setColor(ContextCompat.getColor(getContext(), R.color.cl_0076ae));
        GpsHelper.PathInfo pathInfoCreatePathInfo2 = GpsHelper.PathInfo.INSTANCE.createPathInfo(list, this.mIndex);
        if (pathInfoCreatePathInfo2.getPathInfo() != null && (size = pathInfoCreatePathInfo2.getPathInfo().size()) > 0) {
            while (true) {
                int i4 = i + 1;
                Path path2 = pathInfoCreatePathInfo2.getPathInfo().get(i);
                Paint paint9 = this.mLinePaint;
                Objects.requireNonNull(paint9);
                canvas.drawPath(path2, paint9);
                if (i4 >= size) {
                    break;
                } else {
                    i = i4;
                }
            }
        }
        if (list.get(this.mIndex) != null) {
            ImageView imageView = this.mAvatarImageView;
            Drawable drawable = imageView == null ? null : imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(list.get(this.mIndex).getMX() - this.mMargin, list.get(this.mIndex).getMY() - this.mMargin, list.get(this.mIndex).getMX() + this.mMargin, list.get(this.mIndex).getMY() + this.mMargin);
            }
            if (canvas == null || drawable == null) {
                return;
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mViewWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        this.mViewHeight = View.MeasureSpec.getSize(heightMeasureSpec);
    }

    public final void setLineDetailRunData(@NotNull TdLineDetailRun detail) {
        GpsHelper.Companion companion = GpsHelper.INSTANCE;
        this.mOriginPoint = companion.getInstance().convertToCoordinateList(companion.getInstance().getDetailRunLoadData(detail).getTrack(), this.mViewWidth, this.mViewHeight, this.mMargin);
        invalidate();
    }

    public final void setPos(int index) {
        this.mIndex = index;
        invalidate();
    }

    public SmallMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmallMapView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        b(context);
    }
}
