package com.facebook.react.uimanager;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class SizeMonitoringFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f7478a;

    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    public SizeMonitoringFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.f7478a;
        if (aVar != null) {
            aVar.a(i, i2, i3, i4);
        }
    }

    public void setOnSizeChangedListener(a aVar) {
        this.f7478a = aVar;
    }

    public SizeMonitoringFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SizeMonitoringFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
