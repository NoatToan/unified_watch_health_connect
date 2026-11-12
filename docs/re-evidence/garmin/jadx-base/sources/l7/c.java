package l7;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private c() {
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }
}
