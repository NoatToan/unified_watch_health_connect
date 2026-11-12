package com.xiaomi.hm.health.device.earbud.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00104\u001a\u00020\u0005¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0015R*\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\"\u0010\u001f\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/view/PlayLoadingView;", "Landroid/view/View;", "", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "value", "a", LogUtil.I, "getProgress", "()I", "setProgress", "(I)V", "progress", "b", "getMax", "setMax", "max", "c", "progressColor", GoogleApiAvailabilityLight.a, "normalColor", "", "e", "Z", "isPlay", "()Z", "setPlay", "(Z)V", "", "f", "F", "scaleDistance", "g", "Lkotlin/Lazy;", "getMaxScaleDistance", "()F", "maxScaleDistance", "Landroid/os/Handler;", "h", "Landroid/os/Handler;", "mHandler", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayLoadingView extends View {
    private static final int i = 100;
    private static final float j = 0.6666667f;
    private static final int k = 360;
    private static final float l = 270.0f;
    private static final float m = 4.0f;
    private static final long n = 50;
    private static final int o = 1;
    private static final int p = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int progress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int max;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int progressColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int normalColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isPlay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float scaleDistance;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxScaleDistance;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Handler mHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Float> {
        public a() {
            super(0);
        }

        public final float a() {
            return (PlayLoadingView.this.getWidth() / 2.0f) * 0.3333333f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
        }
    }

    @JvmOverloads
    public PlayLoadingView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PlayLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PlayLoadingView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    private final float getMaxScaleDistance() {
        return ((Number) this.maxScaleDistance.getValue()).floatValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getMax() {
        return this.max;
    }

    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: isPlay, reason: from getter */
    public final boolean getIsPlay() {
        return this.isPlay;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.hm.health.device.earbud.view.PlayLoadingView.onAttachedToWindow.1
            @Override // android.os.Handler
            public void dispatchMessage(@NotNull Message msg) {
                super.dispatchMessage(msg);
                int i2 = msg.what;
                if (i2 != 1) {
                    if (i2 == 2 && PlayLoadingView.this.getProgress() > 0) {
                        PlayLoadingView playLoadingView = PlayLoadingView.this;
                        playLoadingView.setProgress(playLoadingView.getProgress() - 1);
                        return;
                    }
                    return;
                }
                PlayLoadingView.this.invalidate();
                Handler handler2 = PlayLoadingView.this.mHandler;
                if (handler2 != null) {
                    handler2.removeMessages(1);
                }
                Handler handler3 = PlayLoadingView.this.mHandler;
                if (handler3 == null) {
                    return;
                }
                handler3.sendEmptyMessageDelayed(1, 50L);
            }
        };
        this.mHandler = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(1);
        }
        Handler handler2 = this.mHandler;
        if (handler2 == null) {
            return;
        }
        handler2.removeMessages(2);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas != null) {
            float width = (getWidth() / 2) * j;
            Path path = new Path();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.normalColor);
            paint.setStrokeWidth(4.0f);
            path.addCircle(getWidth() / 2.0f, getWidth() / 2.0f, width, Path.Direction.CW);
            canvas.drawPath(path, paint);
            if (getProgress() > 0 && getMax() > 0) {
                Path path2 = new Path();
                paint.reset();
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.progressColor);
                paint.setStrokeWidth(4.0f);
                float width2 = (getWidth() / 2) - width;
                float f = 360;
                path2.addArc(new RectF(width2, width2, getWidth() - width2, getWidth() - width2), (630.0f - ((getProgress() / getMax()) * f)) % f, f * (getProgress() / getMax()));
                canvas.drawPath(path2, paint);
            }
            if (getIsPlay()) {
                this.scaleDistance += getMaxScaleDistance() * 0.01f;
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2});
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
                Iterator it2 = listListOf.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Float.valueOf(((((((getWidth() / 2.0f) - width) / 3) * ((Number) it2.next()).intValue()) + this.scaleDistance) % getMaxScaleDistance()) + width));
                }
                Iterator it3 = CollectionsKt___CollectionsKt.sorted(arrayList).iterator();
                while (it3.hasNext()) {
                    float fFloatValue = ((Number) it3.next()).floatValue();
                    Path path3 = new Path();
                    paint.reset();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(getContext().getResources().getColor(R.color.white15));
                    paint.setStrokeWidth(4.0f);
                    path3.addCircle(getWidth() / 2.0f, getWidth() / 2.0f, fFloatValue, Path.Direction.CW);
                    canvas.drawPath(path3, paint);
                }
            } else {
                this.scaleDistance = 0.0f;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (widthMeasureSpec > heightMeasureSpec) {
            super.onMeasure(heightMeasureSpec, heightMeasureSpec);
        } else {
            super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        }
    }

    public final void setMax(int i2) {
        this.max = i2;
        invalidate();
    }

    public final void setPlay(boolean z) {
        this.isPlay = z;
    }

    public final void setProgress(int i2) {
        this.progress = i2;
        invalidate();
    }

    @JvmOverloads
    public PlayLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.max = 100;
        this.maxScaleDistance = LazyKt__LazyJVMKt.lazy(new a());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PlayLoadingView);
        setProgress(typedArrayObtainStyledAttributes.getInt(R.styleable.PlayLoadingView_progress, 0));
        setMax(typedArrayObtainStyledAttributes.getInt(R.styleable.PlayLoadingView_maxProgress, 100));
        this.progressColor = typedArrayObtainStyledAttributes.getColor(R.styleable.PlayLoadingView_playColor, context.getResources().getColor(R.color.white));
        this.normalColor = typedArrayObtainStyledAttributes.getColor(R.styleable.PlayLoadingView_normalColor, context.getResources().getColor(R.color.white30));
        this.isPlay = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayLoadingView_isPlay, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
