package com.huami.watchfacesstore.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b'\u0010+B#\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b'\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR*\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Lcom/huami/watchfacesstore/view/SelectColorView;", "Landroid/view/View;", "", "color", "", "setColor", "setImage", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "a", "Z", "colorMode", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "selectedPaint", GoogleApiAvailabilityLight.a, "colorPaint", "", "e", "F", "innerRadius", "f", "selectedRadius", "value", "g", "getColorSelect", "()Z", "setColorSelect", "(Z)V", "colorSelect", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SelectColorView extends View {
    private static final int h = 0;
    private static final int i = 40;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean colorMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Drawable drawable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Paint selectedPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Paint colorPaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float innerRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float selectedRadius;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean colorSelect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "width: " + SelectColorView.this.getWidth() + "  height: " + SelectColorView.this.getHeight();
        }
    }

    public SelectColorView(@NotNull Context context) {
        this(context, null);
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
            Drawable drawable = this.drawable;
            if (drawable != null) {
                HMLog.debug("selectColor", new a());
                int width = (getWidth() - ExtensionsKt.getDp(42)) / 2;
                drawable.setBounds(width, 0, ExtensionsKt.getDp(40) + width, ExtensionsKt.getDp(40));
                drawable.draw(canvas);
            }
        }
        if (this.colorSelect) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.selectedRadius, this.selectedPaint);
        }
    }

    public final void setColor(int color) {
        this.colorMode = true;
        this.colorPaint.setColor(color);
    }

    public final void setColorSelect(boolean z) {
        this.colorSelect = z;
        invalidate();
    }

    public final void setImage() {
        this.colorMode = false;
    }

    public SelectColorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SelectColorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.colorMode = true;
        this.drawable = ContextCompat.getDrawable(getContext(), R.drawable.wf_ic_color_more);
        Paint paint = new Paint(1);
        paint.setColor(ContextCompat.getColor(getContext(), R.color.wf_color_f94440));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ExtensionsKt.getDp(1.0f));
        Unit unit = Unit.INSTANCE;
        this.selectedPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(SupportMenu.CATEGORY_MASK);
        this.colorPaint = paint2;
        this.innerRadius = ExtensionsKt.getDp(20.0f);
        this.selectedRadius = ExtensionsKt.getDp(20.0f);
    }
}
