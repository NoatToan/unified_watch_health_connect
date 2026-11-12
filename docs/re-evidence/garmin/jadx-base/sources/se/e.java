package se;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lse/e;", "Lse/b;", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f158728b = new e();

    private e() {
    }

    @Override // se.b
    public final Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
