package l7;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f110562a;

    public e(d dVar) {
        this.f110562a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f110562a.equals(((e) obj).f110562a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f110562a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z14) {
        this.f110562a.onTouchExplorationStateChanged(z14);
    }
}
