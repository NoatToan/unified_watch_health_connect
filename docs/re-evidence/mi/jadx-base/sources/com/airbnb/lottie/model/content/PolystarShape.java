package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import defpackage.d3i;
import defpackage.eb1;
import defpackage.fi4;
import defpackage.hh4;
import defpackage.jte;
import defpackage.lse;
import defpackage.sb1;

/* JADX INFO: loaded from: classes.dex */
public class PolystarShape implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f5681b;
    public final eb1 c;
    public final sb1<PointF, PointF> d;
    public final eb1 e;
    public final eb1 f;
    public final eb1 g;
    public final eb1 h;
    public final eb1 i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5682k;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, eb1 eb1Var, sb1<PointF, PointF> sb1Var, eb1 eb1Var2, eb1 eb1Var3, eb1 eb1Var4, eb1 eb1Var5, eb1 eb1Var6, boolean z, boolean z2) {
        this.f5680a = str;
        this.f5681b = type;
        this.c = eb1Var;
        this.d = sb1Var;
        this.e = eb1Var2;
        this.f = eb1Var3;
        this.g = eb1Var4;
        this.h = eb1Var5;
        this.i = eb1Var6;
        this.j = z;
        this.f5682k = z2;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, com.airbnb.lottie.model.layer.a aVar) {
        return new d3i(jteVar, aVar, this);
    }

    public eb1 b() {
        return this.f;
    }

    public eb1 c() {
        return this.h;
    }

    public String d() {
        return this.f5680a;
    }

    public eb1 e() {
        return this.g;
    }

    public eb1 f() {
        return this.i;
    }

    public eb1 g() {
        return this.c;
    }

    public sb1<PointF, PointF> h() {
        return this.d;
    }

    public eb1 i() {
        return this.e;
    }

    public Type j() {
        return this.f5681b;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.f5682k;
    }
}
