package u1;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f167574a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f167575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f167576c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f167575b = dLog;
        f167576c = dLog - 1.0d;
    }
}
