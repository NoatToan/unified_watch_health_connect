package androidx.core.view;

import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<VelocityTracker, m0> f6471a = Collections.synchronizedMap(new WeakHashMap());

    public static class a {
        private a() {
        }

        public static float a(VelocityTracker velocityTracker, int i14) {
            return velocityTracker.getAxisVelocity(i14);
        }
    }

    private l0() {
    }
}
