package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsFrameLayout extends FrameLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.InterfaceC0010a f1615a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        a.InterfaceC0010a interfaceC0010a = this.f1615a;
        if (interfaceC0010a != null) {
            interfaceC0010a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.a
    public void setOnFitSystemWindowsListener(a.InterfaceC0010a interfaceC0010a) {
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
