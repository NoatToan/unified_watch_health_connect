package cn.hutool.core.lang.copier;

import cn.hutool.core.lang.copier.SrcToDestCopier;
import defpackage.sm9;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class SrcToDestCopier<T, C extends SrcToDestCopier<T, C>> implements Serializable {
    private static final long serialVersionUID = 1;
    protected sm9<T> copyFilter;
    protected T dest;
    protected T src;

    public abstract /* synthetic */ Object copy();

    public sm9<T> getCopyFilter() {
        return this.copyFilter;
    }

    public T getDest() {
        return this.dest;
    }

    public T getSrc() {
        return this.src;
    }

    public C setCopyFilter(sm9<T> sm9Var) {
        this.copyFilter = sm9Var;
        return this;
    }

    public C setDest(T t) {
        this.dest = t;
        return this;
    }

    public C setSrc(T t) {
        this.src = t;
        return this;
    }
}
