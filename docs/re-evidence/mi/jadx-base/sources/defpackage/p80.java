package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes3.dex */
public class p80 {
    public static boolean a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
}
