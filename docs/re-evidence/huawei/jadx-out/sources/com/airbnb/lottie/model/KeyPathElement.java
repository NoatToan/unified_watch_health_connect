package com.airbnb.lottie.model;

import defpackage.fo;
import defpackage.jf;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface KeyPathElement {
    <T> void addValueCallback(T t, jf<T> jfVar);

    void resolveKeyPath(fo foVar, int i, List<fo> list, fo foVar2);
}
