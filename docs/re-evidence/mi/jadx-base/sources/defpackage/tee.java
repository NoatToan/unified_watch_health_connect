package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tee<T> extends unq<T> {
    private volatile T mSingle;

    @Override // defpackage.unq
    public synchronized void destructor() {
        super.destructor();
        this.mSingle = null;
        notifyAll();
    }

    @Override // defpackage.unq
    public T onConstructor() {
        T tConstructor = constructor();
        this.mSingle = tConstructor;
        return tConstructor;
    }

    @Override // defpackage.unq
    public T peek() {
        return this.mSingle;
    }
}
