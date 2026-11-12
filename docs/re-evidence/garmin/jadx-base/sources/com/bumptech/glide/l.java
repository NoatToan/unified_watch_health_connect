package com.bumptech.glide;

import com.bumptech.glide.l;
import qj.m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj.a.C2514a f28522a = oj.a.f132271a;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e4) {
            o2.c.p(e4);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return m.b(this.f28522a, ((l) obj).f28522a);
        }
        return false;
    }

    public int hashCode() {
        oj.a.C2514a c2514a = this.f28522a;
        if (c2514a != null) {
            return c2514a.hashCode();
        }
        return 0;
    }
}
