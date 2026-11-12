package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class p7h {
    private CopyOnWriteArrayList<ri3> mCancellables = new CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public p7h(boolean z) {
        this.mEnabled = z;
    }

    public void addCancellable(ri3 ri3Var) {
        this.mCancellables.add(ri3Var);
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        Iterator<ri3> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void removeCancellable(ri3 ri3Var) {
        this.mCancellables.remove(ri3Var);
    }

    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }
}
