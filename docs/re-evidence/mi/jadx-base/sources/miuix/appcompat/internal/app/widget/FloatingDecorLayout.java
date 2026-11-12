package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.vsi;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingDecorLayout extends FrameLayout {
    public FloatingDecorLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) findViewById(vsi.j);
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.fitSystemWindows(rect);
        }
        rect.top = 0;
        rect.bottom = 0;
        return super.fitSystemWindows(rect);
    }

    public FloatingDecorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingDecorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
