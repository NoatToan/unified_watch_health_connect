package ohos.ace.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes20.dex */
public class WindowViewAospCommon {
    private static final String TAG = "WindowViewAospCommon";
    private AccessibilityCrossPlatformBridge accessibilityBridge;
    private Context context;
    Runnable orientationChanged = new Runnable() { // from class: ohos.ace.adapter.WindowViewAospCommon$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m1974lambda$new$0$ohosaceadapterWindowViewAospCommon();
        }
    };
    private int windowId;
    private WindowViewAospInterface windowViewAospInterface;

    /* JADX INFO: renamed from: lambda$new$0$ohos-ace-adapter-WindowViewAospCommon, reason: not valid java name */
    /* synthetic */ void m1974lambda$new$0$ohosaceadapterWindowViewAospCommon() {
        accessibilityCrossPlatformBridgeInit();
        AccessibilityCrossPlatformBridge accessibilityCrossPlatformBridge = this.accessibilityBridge;
        if (accessibilityCrossPlatformBridge == null || !accessibilityCrossPlatformBridge.isTouchExplorationEnabled()) {
            return;
        }
        this.accessibilityBridge.sendAccessibilityFocusInvalidate(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowViewAospCommon(Context context, int i, View view) {
        this.windowId = i;
        this.context = context;
        if (view instanceof WindowViewAospInterface) {
            this.windowViewAospInterface = (WindowViewAospInterface) view;
        } else {
            this.windowViewAospInterface = null;
        }
        accessibilityCrossPlatformBridgeInit();
    }

    private void accessibilityCrossPlatformBridgeInit() {
        Context context;
        if (this.accessibilityBridge == null && (context = this.context) != null && (this.windowViewAospInterface instanceof View)) {
            this.accessibilityBridge = new AccessibilityCrossPlatformBridge((AccessibilityManager) context.getSystemService("accessibility"), this.context.getContentResolver(), (View) this.windowViewAospInterface, this.windowId);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.windowViewAospInterface == null || motionEvent == null) {
            return false;
        }
        accessibilityCrossPlatformBridgeInit();
        AccessibilityCrossPlatformBridge accessibilityCrossPlatformBridge = this.accessibilityBridge;
        if (accessibilityCrossPlatformBridge != null && accessibilityCrossPlatformBridge.isEnabled()) {
            return this.windowViewAospInterface.superOnHoverEventAosp(motionEvent);
        }
        return this.windowViewAospInterface.superOnHoverEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        accessibilityCrossPlatformBridgeInit();
        AccessibilityCrossPlatformBridge accessibilityCrossPlatformBridge = this.accessibilityBridge;
        if (accessibilityCrossPlatformBridge != null) {
            return accessibilityCrossPlatformBridge;
        }
        return null;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        WindowViewAospInterface windowViewAospInterface = this.windowViewAospInterface;
        if (windowViewAospInterface == null) {
            return false;
        }
        return windowViewAospInterface.superPerformAccessibilityAction(i, bundle);
    }

    public void destroyAosp() {
        AccessibilityCrossPlatformBridge accessibilityCrossPlatformBridge = this.accessibilityBridge;
        if (accessibilityCrossPlatformBridge != null) {
            accessibilityCrossPlatformBridge.release();
        }
    }
}
