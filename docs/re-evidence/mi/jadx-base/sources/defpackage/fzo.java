package defpackage;

import defpackage.dzo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fzo<T extends dzo> extends dzo.a<T> {
    public T g;

    public fzo(ylb ylbVar, apr aprVar) {
        super(ylbVar, aprVar);
    }

    @Override // xz9.a
    public void p() {
        this.g = null;
    }

    @Override // xz9.a
    public int q() {
        return 0;
    }

    @Override // xz9.a
    public boolean r() {
        return true;
    }

    @Override // xz9.a
    public int s(apr aprVar) {
        return 0;
    }

    @Override // xz9.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public T a() {
        if (!r()) {
            return null;
        }
        T t = (T) x();
        k(t);
        return t;
    }

    public T x() {
        if (this.g == null) {
            this.g = o(g());
        }
        return this.g;
    }
}
