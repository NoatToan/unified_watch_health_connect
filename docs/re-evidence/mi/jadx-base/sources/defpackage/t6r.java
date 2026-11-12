package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t6r<T> extends xak<T> {
    @Override // defpackage.xak
    public Reference<T> buildVarRef(T t) {
        return new WeakReference(t);
    }

    @Override // defpackage.xak, defpackage.unq
    public /* bridge */ /* synthetic */ void destructor() {
        super.destructor();
    }

    @Override // defpackage.xak, defpackage.unq
    public /* bridge */ /* synthetic */ Object onConstructor() {
        return super.onConstructor();
    }

    @Override // defpackage.xak, defpackage.unq
    public /* bridge */ /* synthetic */ Object peek() {
        return super.peek();
    }
}
