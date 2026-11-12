package miuix.appcompat.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.dyq;

/* JADX INFO: loaded from: classes3.dex */
public class TextAlignLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26308a;

    public TextAlignLayout(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        boolean z = true;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (z && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                boolean z2 = textView.getLineCount() <= 1 && !this.f26308a;
                if (z2) {
                    textView.setGravity(1);
                } else {
                    textView.setGravity(dyq.e(childAt) ? 5 : 3);
                }
                z = z2;
            }
        }
    }

    public void setDialogPanelHasCheckbox(boolean z) {
        this.f26308a = z;
    }

    public TextAlignLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextAlignLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
