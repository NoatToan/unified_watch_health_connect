package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public class c extends ViewPager {
    public c(Context context) {
        super(context);
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z14) {
        setChildrenDrawingOrderEnabled(z14);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
