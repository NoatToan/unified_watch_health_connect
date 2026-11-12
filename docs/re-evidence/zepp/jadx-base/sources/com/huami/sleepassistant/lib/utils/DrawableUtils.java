package com.huami.sleepassistant.lib.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.sleepassistant.lib.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/DrawableUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/TextView;", "textView", "", "setDrawableStartDot", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DrawableUtils {

    @NotNull
    public static final DrawableUtils INSTANCE = new DrawableUtils();

    private DrawableUtils() {
    }

    public final void setDrawableStartDot(@NotNull Context context, @NotNull TextView textView) {
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.sls_share_icon_point);
        int lineHeight = textView.getLineHeight();
        int i = (((-textView.getLineCount()) * lineHeight) / 2) + (lineHeight / 2);
        if (drawable != null) {
            drawable.setBounds(0, i, drawable.getMinimumWidth(), drawable.getMinimumHeight() + i);
        }
        textView.setCompoundDrawables(drawable, null, null, null);
    }
}
