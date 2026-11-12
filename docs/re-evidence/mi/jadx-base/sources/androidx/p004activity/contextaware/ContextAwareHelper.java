package androidx.p004activity.contextaware;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<OnContextAvailableListener> f1382a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Context f1383b;

    public void a() {
        this.f1383b = null;
    }

    public void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        if (this.f1383b != null) {
            onContextAvailableListener.onContextAvailable(this.f1383b);
        }
        this.f1382a.add(onContextAvailableListener);
    }

    public void b(Context context) {
        this.f1383b = context;
        Iterator<OnContextAvailableListener> it = this.f1382a.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    public Context c() {
        return this.f1383b;
    }

    public void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.f1382a.remove(onContextAvailableListener);
    }
}
