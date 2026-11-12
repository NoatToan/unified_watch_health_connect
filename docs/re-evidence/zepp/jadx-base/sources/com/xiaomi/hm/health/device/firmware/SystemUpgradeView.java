package com.xiaomi.hm.health.device.firmware;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 V2\u00020\u0001:\u0001VB\u0011\b\u0016\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PB\u001b\b\u0016\u0012\u0006\u0010N\u001a\u00020M\u0012\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bO\u0010SB#\b\u0016\u0012\u0006\u0010N\u001a\u00020M\u0012\b\u0010R\u001a\u0004\u0018\u00010Q\u0012\u0006\u0010T\u001a\u00020\u000f¢\u0006\u0004\bO\u0010UJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0014\u0010\u0012\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J(\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0014J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\u0002R*\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R*\u0010+\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010&R\u0016\u00104\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010&R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u001d\u0010L\u001a\u00020G8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006W"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/SystemUpgradeView;", "Landroid/view/View;", "", "b", "Landroid/graphics/Canvas;", "canvas", "", "text", "c", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/PointF;", GoogleApiAvailabilityLight.a, "", "", "alphaRatio", "a", "w", "h", "oldw", "oldh", "onSizeChanged", "onDraw", "changeToTransmit", "changeToInstall", "", "value", "Z", "getLoading", "()Z", "setLoading", "(Z)V", "loading", "getEnable", "setEnable", "enable", LogUtil.I, "getProgress", "()I", "setProgress", "(I)V", "progress", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "e", "viewWidth", "f", "viewHeight", "Landroid/graphics/Path;", "g", "Landroid/graphics/Path;", "path", "progressPath", "i", "Landroid/graphics/RectF;", z.j, "progressRectF", "Landroid/text/TextPaint;", hl.k, "Landroid/text/TextPaint;", "textPaint", "l", "Landroid/graphics/Paint;", "progressPaint", "m", "bgPaint", "", GoogleApiAvailabilityLight.b, "Lkotlin/Lazy;", "getRadius", "()F", "radius", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SystemUpgradeView extends View {
    private static final float o = 14.0f;
    private static final float p = 6.0f;
    private static final int q = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean loading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean enable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int progress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int viewWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int viewHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Path path;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Path progressPath;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private RectF rectF;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private RectF progressRectF;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final TextPaint textPaint;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Paint progressPaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Paint bgPaint;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy radius;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Float> {
        public a() {
            super(0);
        }

        public final float a() {
            return ViewUtils.dp2px(SystemUpgradeView.this.getContext(), 6.0f);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
        }
    }

    public SystemUpgradeView(@NotNull Context context) {
        this(context, null);
    }

    private final int a(@ColorInt int i, double d) {
        return Color.argb((int) (((double) ((i >> 24) & 255)) * d), (i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    private final void b() {
        this.rectF.set(0.0f, 0.0f, this.viewWidth, this.viewHeight);
        this.path.addRoundRect(this.rectF, new float[]{getRadius(), getRadius(), getRadius(), getRadius(), getRadius(), getRadius(), getRadius(), getRadius()}, Path.Direction.CCW);
    }

    private final void c(Canvas canvas, String text) {
        StaticLayout staticLayoutBuild = Build.VERSION.SDK_INT >= 23 ? StaticLayout.Builder.obtain(text, 0, text.length(), this.textPaint, getWidth()).setAlignment(Layout.Alignment.ALIGN_CENTER).build() : new StaticLayout(text, this.textPaint, getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        PointF pointFD = d(this.textPaint, this.rectF);
        if (staticLayoutBuild.getLineCount() <= 1) {
            canvas.drawText(text, pointFD.x, pointFD.y, this.textPaint);
        } else {
            canvas.translate(pointFD.x, 0.0f);
            staticLayoutBuild.draw(canvas);
        }
    }

    private final PointF d(Paint paint, RectF rectF) {
        PointF pointF = new PointF();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = 2;
        pointF.x = (rectF.left + rectF.right) / f;
        pointF.y = (((rectF.height() - (fontMetrics.bottom - fontMetrics.top)) / f) - fontMetrics.top) + rectF.top;
        return pointF;
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void changeToInstall() {
        setText(getContext().getString(R.string.system_update_now));
        setProgress(100);
    }

    public final void changeToTransmit() {
        setText(getContext().getString(R.string.download_now));
        setProgress(100);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final float getRadius() {
        return ((Number) this.radius.getValue()).floatValue();
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas == null) {
            return;
        }
        canvas.clipPath(this.path);
        if (!this.enable) {
            canvas.drawRect(0.0f, 0.0f, this.viewWidth, this.viewHeight, this.bgPaint);
            return;
        }
        if (!this.loading) {
            canvas.drawRect(0.0f, 0.0f, this.viewWidth, this.viewHeight, this.progressPaint);
            c(canvas, this.text);
            return;
        }
        canvas.drawRect(0.0f, 0.0f, this.viewWidth, this.viewHeight, this.bgPaint);
        this.progressPath.reset();
        this.progressRectF.set(0.0f, 0.0f, (this.viewWidth * this.progress) / 100, this.viewHeight);
        this.progressPath.addRoundRect(this.progressRectF, new float[]{getRadius(), getRadius(), getRadius(), getRadius(), getRadius(), getRadius(), getRadius(), getRadius()}, Path.Direction.CCW);
        canvas.drawPath(this.progressPath, this.progressPaint);
        c(canvas, this.text);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.viewWidth = w;
        this.viewHeight = h;
        b();
    }

    public final void setEnable(boolean z) {
        setEnabled(z);
        this.enable = z;
        invalidate();
    }

    public final void setLoading(boolean z) {
        this.loading = z;
        invalidate();
    }

    public final void setProgress(int i) {
        this.progress = i;
        invalidate();
    }

    public final void setText(@NotNull String str) {
        this.text = str;
        invalidate();
    }

    public SystemUpgradeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SystemUpgradeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loading = true;
        this.enable = true;
        this.text = "";
        this.path = new Path();
        this.progressPath = new Path();
        this.rectF = new RectF();
        this.progressRectF = new RectF();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(ContextCompat.getColor(getContext(), R.color.white));
        textPaint.setTextSize(ViewUtils.sp2px(getContext(), 14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        Unit unit = Unit.INSTANCE;
        this.textPaint = textPaint;
        Paint paint = new Paint(1);
        Context context2 = getContext();
        int i2 = R.color.p3;
        paint.setColor(ContextCompat.getColor(context2, i2));
        this.progressPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(a(ContextCompat.getColor(getContext(), i2), 0.09803921568627451d));
        this.bgPaint = paint2;
        this.radius = LazyKt__LazyJVMKt.lazy(new a());
    }
}
