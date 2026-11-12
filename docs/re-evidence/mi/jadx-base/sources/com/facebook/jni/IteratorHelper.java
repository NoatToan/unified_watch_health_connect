package com.facebook.jni;

import defpackage.v07;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class IteratorHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f7135a;

    @v07
    private Object mElement;

    @v07
    public IteratorHelper(Iterator it) {
        this.f7135a = it;
    }

    @v07
    public boolean hasNext() {
        if (this.f7135a.hasNext()) {
            this.mElement = this.f7135a.next();
            return true;
        }
        this.mElement = null;
        return false;
    }

    @v07
    public IteratorHelper(Iterable iterable) {
        this.f7135a = iterable.iterator();
    }
}
