package androidx.view.contextaware;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareHelper {
    private volatile Context mContext;
    private final Set<OnContextAvailableListener> mListeners = new CopyOnWriteArraySet();

    public void addOnContextAvailableListener(@NonNull OnContextAvailableListener listener) {
        if (this.mContext != null) {
            listener.onContextAvailable(this.mContext);
        }
        this.mListeners.add(listener);
    }

    public void clearAvailableContext() {
        this.mContext = null;
    }

    public void dispatchOnContextAvailable(@NonNull Context context) {
        this.mContext = context;
        Iterator<OnContextAvailableListener> it2 = this.mListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onContextAvailable(context);
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContext;
    }

    public void removeOnContextAvailableListener(@NonNull OnContextAvailableListener listener) {
        this.mListeners.remove(listener);
    }
}
