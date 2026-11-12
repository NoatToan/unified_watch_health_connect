package kotlin;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/z0;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f91667a = new z0();

    private z0() {
    }

    public static int a(AccessibilityManager accessibilityManager, int i14, int i15) {
        return accessibilityManager.getRecommendedTimeoutMillis(i14, i15);
    }
}
