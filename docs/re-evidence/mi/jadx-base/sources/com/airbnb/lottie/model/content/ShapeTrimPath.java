package com.airbnb.lottie.model.content;

import defpackage.d2q;
import defpackage.eb1;
import defpackage.fi4;
import defpackage.hh4;
import defpackage.jte;
import defpackage.lse;

/* JADX INFO: loaded from: classes.dex */
public class ShapeTrimPath implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f5688b;
    public final eb1 c;
    public final eb1 d;
    public final eb1 e;
    public final boolean f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public ShapeTrimPath(String str, Type type, eb1 eb1Var, eb1 eb1Var2, eb1 eb1Var3, boolean z) {
        this.f5687a = str;
        this.f5688b = type;
        this.c = eb1Var;
        this.d = eb1Var2;
        this.e = eb1Var3;
        this.f = z;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, com.airbnb.lottie.model.layer.a aVar) {
        return new d2q(aVar, this);
    }

    public eb1 b() {
        return this.d;
    }

    public String c() {
        return this.f5687a;
    }

    public eb1 d() {
        return this.e;
    }

    public eb1 e() {
        return this.c;
    }

    public Type f() {
        return this.f5688b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + "}";
    }
}
