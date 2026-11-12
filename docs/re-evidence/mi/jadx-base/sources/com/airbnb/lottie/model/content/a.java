package com.airbnb.lottie.model.content;

import defpackage.eb1;
import defpackage.fb1;
import defpackage.fi4;
import defpackage.gb1;
import defpackage.hh4;
import defpackage.jb1;
import defpackage.jte;
import defpackage.lse;
import defpackage.m3b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GradientType f5690b;
    public final fb1 c;
    public final gb1 d;
    public final jb1 e;
    public final jb1 f;
    public final eb1 g;
    public final ShapeStroke.LineCapType h;
    public final ShapeStroke.LineJoinType i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<eb1> f5691k;
    public final eb1 l;
    public final boolean m;

    public a(String str, GradientType gradientType, fb1 fb1Var, gb1 gb1Var, jb1 jb1Var, jb1 jb1Var2, eb1 eb1Var, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<eb1> list, eb1 eb1Var2, boolean z) {
        this.f5689a = str;
        this.f5690b = gradientType;
        this.c = fb1Var;
        this.d = gb1Var;
        this.e = jb1Var;
        this.f = jb1Var2;
        this.g = eb1Var;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f;
        this.f5691k = list;
        this.l = eb1Var2;
        this.m = z;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, com.airbnb.lottie.model.layer.a aVar) {
        return new m3b(jteVar, aVar, this);
    }

    public ShapeStroke.LineCapType b() {
        return this.h;
    }

    public eb1 c() {
        return this.l;
    }

    public jb1 d() {
        return this.f;
    }

    public fb1 e() {
        return this.c;
    }

    public GradientType f() {
        return this.f5690b;
    }

    public ShapeStroke.LineJoinType g() {
        return this.i;
    }

    public List<eb1> h() {
        return this.f5691k;
    }

    public float i() {
        return this.j;
    }

    public String j() {
        return this.f5689a;
    }

    public gb1 k() {
        return this.d;
    }

    public jb1 l() {
        return this.e;
    }

    public eb1 m() {
        return this.g;
    }

    public boolean n() {
        return this.m;
    }
}
