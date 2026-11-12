package defpackage;

import java.lang.ref.Reference;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xak<T> extends unq<T> {
    private Reference<T> mRef;

    public abstract Reference<T> buildVarRef(T t);

    @Override // defpackage.unq
    public synchronized void destructor() {
        super.destructor();
        this.mRef = null;
    }

    @Override // defpackage.unq
    public T onConstructor() {
        T tConstructor = constructor();
        this.mRef = buildVarRef(tConstructor);
        return tConstructor;
    }

    @Override // defpackage.unq
    public T peek() {
        T t;
        Reference<T> reference = this.mRef;
        if (reference == null || (t = reference.get()) == null) {
            return null;
        }
        return t;
    }
}
