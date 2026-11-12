package ohos.ace.adapter;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes20.dex */
public interface WindowViewAospInterface extends WindowViewInterface {
    @Override // ohos.ace.adapter.WindowViewInterface
    void destroy();

    void destroyAosp();

    AccessibilityNodeProvider getAccessibilityNodeProvider();

    boolean performAccessibilityAction(int i, Bundle bundle);

    @Override // ohos.ace.adapter.WindowViewInterface
    boolean superOnHoverEvent(MotionEvent motionEvent);

    boolean superOnHoverEventAosp(MotionEvent motionEvent);

    boolean superPerformAccessibilityAction(int i, Bundle bundle);
}
