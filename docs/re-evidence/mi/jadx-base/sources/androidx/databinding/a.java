package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
public class a implements e {
    private transient h mCallbacks;

    @Override // androidx.databinding.e
    public void addOnPropertyChangedCallback(e.a aVar) {
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mCallbacks.a(aVar);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                h hVar = this.mCallbacks;
                if (hVar == null) {
                    return;
                }
                hVar.d(this, 0, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyPropertyChanged(int i) {
        synchronized (this) {
            try {
                h hVar = this.mCallbacks;
                if (hVar == null) {
                    return;
                }
                hVar.d(this, i, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.e
    public void removeOnPropertyChangedCallback(e.a aVar) {
        synchronized (this) {
            try {
                h hVar = this.mCallbacks;
                if (hVar == null) {
                    return;
                }
                hVar.i(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
