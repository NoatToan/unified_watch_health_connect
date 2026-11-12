package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes2.dex */
public class yzo {
    public static boolean a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
}
