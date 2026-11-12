package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f6501a;

    public m(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f6501a = new GestureDetector(context, onGestureListener, handler);
    }

    public m(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }
}
