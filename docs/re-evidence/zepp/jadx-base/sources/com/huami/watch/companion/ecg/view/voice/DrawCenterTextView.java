package com.huami.watch.companion.ecg.view.voice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ecg.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lcom/huami/watch/companion/ecg/view/voice/DrawCenterTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public class DrawCenterTextView extends AppCompatTextView {
    public DrawCenterTextView(@NotNull Context context) {
        super(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Drawable drawable = getCompoundDrawables()[2];
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), R.color.s1));
            float fMeasureText = getPaint().measureText(getText().toString()) + getCompoundDrawablePadding() + drawable.getIntrinsicWidth();
            setPadding(0, 0, (int) (getWidth() - fMeasureText), 0);
            canvas.translate((getWidth() - fMeasureText) / 2, 0.0f);
        }
        super.onDraw(canvas);
    }

    public DrawCenterTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DrawCenterTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
