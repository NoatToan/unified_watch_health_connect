package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.introspect.Annotated;
import defpackage.acp;
import defpackage.ahw;
import defpackage.ys;

/* JADX INFO: loaded from: classes21.dex */
public abstract class Java7Support {
    private static final Java7Support IMPL;

    public abstract ys findConstructorName(acp acpVar);

    public abstract Boolean findTransient(Annotated annotated);

    public abstract Boolean hasCreatorAnnotation(Annotated annotated);

    static {
        Java7Support java7Support;
        try {
            java7Support = (Java7Support) ahw.b((Class) Class.forName("ace"), false);
        } catch (Throwable unused) {
            java7Support = null;
        }
        IMPL = java7Support;
    }

    public static Java7Support instance() {
        return IMPL;
    }
}
