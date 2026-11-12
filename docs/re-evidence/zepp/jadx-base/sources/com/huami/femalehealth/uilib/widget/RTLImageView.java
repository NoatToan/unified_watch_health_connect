package com.huami.femalehealth.uilib.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.huami.femalehealth.uilib.helper.RTLHelper;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0011\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R*\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/RTLImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "a", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "value", "Z", "getEnableTRL", "()Z", "setEnableTRL", "(Z)V", "enableTRL", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class RTLImageView extends AppCompatImageView {

    @NotNull
    private static final String b = "RTLImageView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean enableTRL;

    public RTLImageView(@NotNull Context context) {
        this(context, null);
    }

    private final void a() {
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final boolean getEnableTRL() {
        return this.enableTRL;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas == null) {
            return;
        }
        Integer numValueOf = null;
        if (getEnableTRL()) {
            numValueOf = Integer.valueOf(canvas.save());
            canvas.scale(-1.0f, 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (numValueOf == null) {
            return;
        }
        canvas.restoreToCount(numValueOf.intValue());
    }

    public final void setEnableTRL(boolean z) {
        this.enableTRL = z;
        invalidate();
    }

    public RTLImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RTLImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.enableTRL = RTLHelper.INSTANCE.isRTL(getContext());
        a();
    }
}
