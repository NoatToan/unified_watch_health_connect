package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class v70 {

    public interface a {
        void onTouchExplorationStateChanged(boolean z);
    }

    public static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f36576a;

        public b(a aVar) {
            this.f36576a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f36576a.equals(((b) obj).f36576a);
            }
            return false;
        }

        public int hashCode() {
            return this.f36576a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f36576a.onTouchExplorationStateChanged(z);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
