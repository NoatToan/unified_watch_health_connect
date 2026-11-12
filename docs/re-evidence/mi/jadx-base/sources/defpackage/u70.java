package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class u70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile u70 f35482a;

    public static u70 a() {
        if (f35482a == null) {
            synchronized (u70.class) {
                try {
                    if (f35482a == null) {
                        f35482a = new u70();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35482a;
    }

    public boolean b(Context context) {
        AccessibilityManager accessibilityManager = context == null ? null : (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Iterator<AccessibilityServiceInfo> it = accessibilityManager.getEnabledAccessibilityServiceList(1).iterator();
            while (it.hasNext()) {
                int capabilities = it.next().getCapabilities();
                vqg.a("accessibility manager support FEEDBACK_SPOKEN by flag " + capabilities);
                if (2 == (capabilities & 2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
