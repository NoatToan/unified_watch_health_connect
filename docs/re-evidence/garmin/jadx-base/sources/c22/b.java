package c22;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/b;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23007a = new b();

    private b() {
    }

    public static final float a(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().fontScale;
    }

    public static final float b(Context context, float f14, float f15) {
        context.getClass();
        return a(context) > f15 ? f15 * (f14 / context.getResources().getDisplayMetrics().scaledDensity) * context.getResources().getDisplayMetrics().density : f14;
    }

    public static final float c(Context context, float f14, float f15) {
        context.getClass();
        float fA = a(context);
        if (fA <= 1.0f) {
            return f14;
        }
        return fA <= f15 ? f14 * fA : f14 * f15;
    }

    public static float d(Context context, float f14, float f15, float f16) {
        context.getClass();
        float fA = a(context);
        float f17 = f15 - 1.0f;
        if (fA <= f15) {
            return f14;
        }
        return fA <= f16 ? (fA - f17) * f14 : (f16 - f17) * f14;
    }

    public static final boolean e(Context context) {
        context.getClass();
        return a(context) > 1.0f;
    }

    public static final boolean f(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        enabledAccessibilityServiceList.getClass();
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public static String g(Context context, String str) {
        return d53.w.z(str, Marker.ANY_MARKER, false) ? d53.u.v(str, Marker.ANY_MARKER, am.j.m("(", context.getString(R.string.lbl_mandatory_field), "):"), false) : str;
    }

    public static final void h(Context context, String str) {
        context.getClass();
        str.getClass();
        if (f(context)) {
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(f23007a.getClass().getName());
            accessibilityEventObtain.setPackageName(context.getPackageName());
            accessibilityEventObtain.getText().add(str);
            ((AccessibilityManager) systemService).sendAccessibilityEvent(accessibilityEventObtain);
        }
    }
}
