package ohos.ace.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes20.dex */
public class WindowViewAospSurface extends WindowViewSurface implements WindowViewAospInterface {
    private WindowViewAospCommon windowViewAospCommon;

    @Override // ohos.ace.adapter.WindowViewSurface, ohos.ace.adapter.WindowViewInterface
    public View getView() {
        return this;
    }

    public WindowViewAospSurface(Context context, int i) {
        super(context);
        this.windowViewAospCommon = getWindowViewAospCommon(context, i, this);
    }

    private WindowViewAospCommon getWindowViewAospCommon(Context context, int i, View view) {
        return new WindowViewAospCommon(context, i, view);
    }

    @Override // ohos.ace.adapter.WindowViewAospInterface
    public boolean superPerformAccessibilityAction(int i, Bundle bundle) {
        super.performAccessibilityAction(i, bundle);
        return false;
    }

    @Override // android.view.View, ohos.ace.adapter.WindowViewAospInterface
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.windowViewAospCommon.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View, ohos.ace.adapter.WindowViewAospInterface
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (super.getWindowOrientation()) {
            return null;
        }
        return this.windowViewAospCommon.getAccessibilityNodeProvider();
    }

    @Override // ohos.ace.adapter.WindowViewSurface, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        if (super.getWindowOrientation()) {
            super.setWindowOrientation(false);
            removeCallbacks(this.windowViewAospCommon.orientationChanged);
            postDelayed(this.windowViewAospCommon.orientationChanged, 100L);
        }
    }

    @Override // ohos.ace.adapter.WindowViewAospInterface
    public boolean superOnHoverEventAosp(MotionEvent motionEvent) {
        return super.onHoverEventAosp(motionEvent);
    }

    @Override // ohos.ace.adapter.WindowViewSurface, ohos.ace.adapter.WindowViewInterface
    public boolean superOnHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // ohos.ace.adapter.WindowViewSurface, android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return this.windowViewAospCommon.onHoverEvent(motionEvent);
    }

    @Override // ohos.ace.adapter.WindowViewSurface, ohos.ace.adapter.WindowViewInterface
    public void destroy() {
        super.destroy();
        this.windowViewAospCommon.destroyAosp();
    }

    @Override // ohos.ace.adapter.WindowViewAospInterface
    public void destroyAosp() {
        this.windowViewAospCommon.destroyAosp();
    }
}
