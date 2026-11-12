package com.xiaomi.hm.health.device.watchskinnew.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b'\u0010+B#\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b'\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR*\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/SelectColorView;", "Landroid/view/View;", "", "color", "", "setColor", "setImage", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "a", "Z", "colorMode", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "selectedPaint", "c", "colorPaint", GoogleApiAvailabilityLight.a, "whiteEdgePaint", "e", LogUtil.I, "", "f", "F", "innerRadius", "g", "selectedRadius", "value", "h", "getColorSelect", "()Z", "setColorSelect", "(Z)V", "colorSelect", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SelectColorView extends View {
    private static final float i = 7.0f;
    private static final float j = 43.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean colorMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Paint selectedPaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Paint colorPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Paint whiteEdgePaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int color;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float innerRadius;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float selectedRadius;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean colorSelect;

    public SelectColorView(@NotNull Context context) {
        this(context, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final boolean getColorSelect() {
        return this.colorSelect;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == -1 || getHeight() == -1 || canvas == null) {
            return;
        }
        if (this.colorMode) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.innerRadius, this.colorPaint);
        } else {
            Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.multi_color_icon);
            if (drawable != null) {
                drawable.setBounds((int) ViewUtils.dp2px(getContext(), 7.0f), (int) ViewUtils.dp2px(getContext(), 7.0f), (int) ViewUtils.dp2px(getContext(), j), (int) ViewUtils.dp2px(getContext(), j));
                drawable.draw(canvas);
            }
        }
        if (this.colorPaint.getColor() == -1) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.innerRadius, this.whiteEdgePaint);
        }
        if (this.colorSelect) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.selectedRadius, this.selectedPaint);
        }
    }

    public final void setColor(int color) {
        this.colorMode = true;
        this.color = color;
        this.colorPaint.setColor(color);
        invalidate();
    }

    public final void setColorSelect(boolean z) {
        this.colorSelect = z;
        invalidate();
    }

    public final void setImage() {
        this.colorMode = false;
        invalidate();
    }

    public SelectColorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SelectColorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.colorMode = true;
        Paint paint = new Paint(1);
        paint.setColor(ContextCompat.getColor(getContext(), R.color.cl_ff6000));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ViewUtils.dp2px(getContext(), 1.5f));
        Unit unit = Unit.INSTANCE;
        this.selectedPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(SupportMenu.CATEGORY_MASK);
        this.colorPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(ContextCompat.getColor(getContext(), R.color.avatar_nick_name_bg_color));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(ViewUtils.dp2px(getContext(), 1.0f));
        this.whiteEdgePaint = paint3;
        this.color = SupportMenu.CATEGORY_MASK;
        this.innerRadius = ViewUtils.dp2px(getContext(), 18.0f);
        this.selectedRadius = ViewUtils.dp2px(getContext(), 23.5f);
    }
}
