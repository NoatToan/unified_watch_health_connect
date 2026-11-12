package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.accessibility.AccessibilityNodeInfoCallback;
import health.compact.a.ReleaseLogUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class lrd {
    /* JADX INFO: Access modifiers changed from: private */
    public static void d(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, CharSequence charSequence, boolean z, Class<?> cls) {
        if (accessibilityNodeInfoCompat == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setAccessibilityNodeInfoCompat nodeInfo is null");
            return;
        }
        accessibilityNodeInfoCompat.setContentDescription(charSequence);
        accessibilityNodeInfoCompat.setClickable(z);
        if (z) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        } else {
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompat.setFocusable(true);
        accessibilityNodeInfoCompat.setImportantForAccessibility(true);
        if (cls == null) {
            return;
        }
        String name = cls.getName();
        if (TextUtils.isEmpty(name)) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setAccessibilityNodeInfoCompat className ", name);
        } else {
            accessibilityNodeInfoCompat.setClassName(name);
        }
    }

    public static AccessibilityManager a() {
        Object systemService = BaseApplication.b().getSystemService("accessibility");
        if (!(systemService instanceof AccessibilityManager)) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "getAccessibilityManager object ", systemService);
            return null;
        }
        return (AccessibilityManager) systemService;
    }

    public static boolean d() {
        AccessibilityManager accessibilityManagerA = a();
        if (accessibilityManagerA != null) {
            return accessibilityManagerA.isEnabled() && accessibilityManagerA.isTouchExplorationEnabled();
        }
        ReleaseLogUtil.d("R_AccessibilityUtil", "isTouchExplorationEnabled accessibilityManager is null");
        return false;
    }

    public static void c(AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        if (touchExplorationStateChangeListener == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "addTouchExplorationStateChangeListener listener is null");
            return;
        }
        AccessibilityManager accessibilityManagerA = a();
        if (accessibilityManagerA == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "addTouchExplorationStateChangeListener accessibilityManager is null");
        } else {
            accessibilityManagerA.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
    }

    public static void b(AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        if (touchExplorationStateChangeListener == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "removeTouchExplorationStateChangeListener listener is null");
            return;
        }
        AccessibilityManager accessibilityManagerA = a();
        if (accessibilityManagerA == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "removeTouchExplorationStateChangeListener accessibilityManager is null");
        } else {
            accessibilityManagerA.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
    }

    public static void c(View view, int i) {
        a(view, i, false);
    }

    public static void a(View view, int i, boolean z) {
        if (view == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setImportantForAccessibility view is null");
            return;
        }
        view.setImportantForAccessibility(i);
        if (d() && z) {
            view.setFocusable(true);
            view.setEnabled(true);
        }
    }

    public static void c(View view, int i, boolean z) {
        if (view == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setImportantForAccessibility view is null");
            return;
        }
        view.setImportantForAccessibility(i);
        if (d()) {
            view.setFocusable(z);
            view.setEnabled(z);
        }
    }

    public static void b(View view, int i) {
        if (view == null) {
            return;
        }
        view.sendAccessibilityEvent(i);
    }

    public static void c(View view, CharSequence charSequence) {
        if (view == null || TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "announceForAccessibility view ", view, " text ", charSequence);
        } else {
            view.announceForAccessibility(charSequence);
        }
    }

    private static void b(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (view == null || accessibilityDelegateCompat == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setAccessibilityDelegate view ", view, " accessibilityDelegateCompat ", accessibilityDelegateCompat);
        } else {
            ViewCompat.setAccessibilityDelegate(view, accessibilityDelegateCompat);
        }
    }

    public static void d(View view, final AccessibilityNodeInfoCallback accessibilityNodeInfoCallback) {
        if (accessibilityNodeInfoCallback == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setAccessibilityDelegate callback is null");
        } else {
            b(view, new AccessibilityDelegateCompat() { // from class: lrd.2
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCallback.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                }
            });
        }
    }

    public static void b(View view, CharSequence charSequence) {
        b(view, charSequence, true, null);
    }

    public static void a(View view, CharSequence charSequence, Class<?> cls) {
        b(view, charSequence, true, cls);
    }

    public static void d(View view, CharSequence charSequence, boolean z) {
        b(view, charSequence, z, null);
    }

    public static void b(View view, final CharSequence charSequence, final boolean z, final Class<?> cls) {
        if (TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setContentDescription contentDescription ", charSequence);
        } else {
            d(view, new AccessibilityNodeInfoCallback() { // from class: lrb
                @Override // com.huawei.hwcommonmodel.accessibility.AccessibilityNodeInfoCallback
                public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    lrd.d(accessibilityNodeInfoCompat, charSequence, z, (Class<?>) cls);
                }
            });
        }
    }

    public static void c(View view, CharSequence charSequence, boolean z) {
        e(view, charSequence, z, true, null);
    }

    public static void a(View view, CharSequence charSequence, boolean z, Class<?> cls) {
        e(view, charSequence, z, true, cls);
    }

    public static void e(View view, final CharSequence charSequence, final boolean z, final boolean z2, final Class<?> cls) {
        if (TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setSelectedContentDescription contentDescription ", charSequence);
        } else {
            d(view, new AccessibilityNodeInfoCallback() { // from class: lrf
                @Override // com.huawei.hwcommonmodel.accessibility.AccessibilityNodeInfoCallback
                public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    lrd.e(z, charSequence, z2, cls, view2, accessibilityNodeInfoCompat);
                }
            });
        }
    }

    static /* synthetic */ void e(boolean z, CharSequence charSequence, boolean z2, Class cls, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setSelectedContentDescription info is null");
        } else {
            accessibilityNodeInfoCompat.setSelected(z);
            d(accessibilityNodeInfoCompat, charSequence, z2, (Class<?>) cls);
        }
    }

    public static void a(View view, CharSequence charSequence, boolean z) {
        b(view, charSequence, z, true, (Class<?>) null);
    }

    public static void c(View view, CharSequence charSequence, boolean z, Class<?> cls) {
        b(view, charSequence, z, true, cls);
    }

    public static void b(View view, final CharSequence charSequence, final boolean z, final boolean z2, final Class<?> cls) {
        if (TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setCheckedContentDescription contentDescription ", charSequence);
        } else {
            d(view, new AccessibilityNodeInfoCallback() { // from class: lrj
                @Override // com.huawei.hwcommonmodel.accessibility.AccessibilityNodeInfoCallback
                public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    lrd.b(z, charSequence, z2, cls, view2, accessibilityNodeInfoCompat);
                }
            });
        }
    }

    static /* synthetic */ void b(boolean z, CharSequence charSequence, boolean z2, Class cls, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setCheckedContentDescription info is null");
            return;
        }
        accessibilityNodeInfoCompat.setCheckable(true);
        accessibilityNodeInfoCompat.setChecked(z);
        d(accessibilityNodeInfoCompat, charSequence, z2, (Class<?>) cls);
    }

    public static void c(View view, final boolean z) {
        d(view, new AccessibilityNodeInfoCallback() { // from class: lri
            @Override // com.huawei.hwcommonmodel.accessibility.AccessibilityNodeInfoCallback
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                accessibilityNodeInfoCompat.setSelected(z);
            }
        });
    }

    public static void e(View view, CharSequence charSequence) {
        a(view, charSequence, charSequence);
    }

    public static void a(View view, final CharSequence charSequence, final CharSequence charSequence2) {
        if (TextUtils.isEmpty(charSequence2)) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setLongClickContentDescription label ", charSequence2);
        } else {
            d(view, new AccessibilityNodeInfoCallback() { // from class: lrh
                @Override // com.huawei.hwcommonmodel.accessibility.AccessibilityNodeInfoCallback
                public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    lrd.c(charSequence, charSequence2, view2, accessibilityNodeInfoCompat);
                }
            });
        }
    }

    static /* synthetic */ void c(CharSequence charSequence, CharSequence charSequence2, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setLongClickContentDescription info is null");
            return;
        }
        accessibilityNodeInfoCompat.setClickable(false);
        accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        accessibilityNodeInfoCompat.setContentDescription(charSequence);
        accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, charSequence2));
        accessibilityNodeInfoCompat.setFocusable(true);
        accessibilityNodeInfoCompat.setLongClickable(true);
        accessibilityNodeInfoCompat.setImportantForAccessibility(true);
    }

    public static void b(View view, final CharSequence charSequence, final boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setContentDescriptionForExpandOrCollapse contentDescription ", charSequence, " isExpand ", Boolean.valueOf(z));
        } else {
            d(view, new AccessibilityNodeInfoCallback() { // from class: lrg
                @Override // com.huawei.hwcommonmodel.accessibility.AccessibilityNodeInfoCallback
                public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    lrd.d(charSequence, z, view2, accessibilityNodeInfoCompat);
                }
            });
        }
    }

    static /* synthetic */ void d(CharSequence charSequence, boolean z, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "setContentDescriptionForExpandOrCollapse info is null");
            return;
        }
        accessibilityNodeInfoCompat.setClickable(true);
        accessibilityNodeInfoCompat.setFocusable(true);
        accessibilityNodeInfoCompat.setImportantForAccessibility(true);
        accessibilityNodeInfoCompat.setContentDescription(charSequence);
        if (z) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE);
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND);
        } else {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND);
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE);
        }
    }

    public static void a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "nodeInfoAdjustOrder accessibilityNodeInfoCompat ", accessibilityNodeInfoCompat, " view ", view);
            return;
        }
        c(view, 1);
        accessibilityNodeInfoCompat.removeChild(view);
        accessibilityNodeInfoCompat.addChild(view);
    }

    public static CharSequence b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "removeSpaceAfterForNumber charSequence ", charSequence);
            return charSequence;
        }
        char[] charArray = String.valueOf(charSequence).toCharArray();
        int length = charArray.length;
        if (length == 0) {
            ReleaseLogUtil.d("R_AccessibilityUtil", "removeSpaceAfterForNumber length is 0");
            return charSequence;
        }
        StringBuilder sb = new StringBuilder();
        Pattern patternCompile = Pattern.compile("\\d");
        for (int i = 0; i < length; i++) {
            char c2 = charArray[i];
            if (" ".equals(String.valueOf(c2))) {
                int i2 = i - 1;
                if (i2 < 0) {
                    sb.append(c2);
                } else if (!patternCompile.matcher(String.valueOf(charArray[i2])).find()) {
                    sb.append(c2);
                }
            } else {
                sb.append(c2);
            }
        }
        return sb;
    }
}
