package com.airbnb.lottie.compose;

import f5.a1;
import f5.b1;
import f5.v1;
import f5.w;
import f5.x;
import f5.y0;
import g6.a;
import g6.b;
import g6.m;
import g6.n;
import h4.r;
import h5.c0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0010\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "Lh4/r$c;", "Lh5/c0;", "", "width", "height", "<init>", "(II)V", "Lf5/b1;", "Lf5/y0;", "measurable", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Lf5/y0;J)Lf5/a1;", "measure", "I", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LottieAnimationSizeNode extends r.c implements c0 {
    public static final int $stable = 8;
    private int height;
    private int width;

    public LottieAnimationSizeNode(int i14, int i15) {
        this.width = i14;
        this.height = i15;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // h5.c0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(x xVar, w wVar, int i14) {
        return super.maxIntrinsicHeight(xVar, wVar, i14);
    }

    @Override // h5.c0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(x xVar, w wVar, int i14) {
        return super.maxIntrinsicWidth(xVar, wVar, i14);
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        long jA;
        b1Var.getClass();
        y0Var.getClass();
        long jD = b.d(j8, n.a(this.width, this.height));
        if (a.i(j8) == Integer.MAX_VALUE && a.j(j8) != Integer.MAX_VALUE) {
            m.a aVar = m.f76012b;
            int i14 = (int) (jD >> 32);
            int i15 = (this.height * i14) / this.width;
            jA = b.a(i14, i14, i15, i15);
        } else if (a.j(j8) != Integer.MAX_VALUE || a.i(j8) == Integer.MAX_VALUE) {
            m.a aVar2 = m.f76012b;
            int i16 = (int) (jD >> 32);
            int i17 = (int) (jD & 4294967295L);
            jA = b.a(i16, i16, i17, i17);
        } else {
            m.a aVar3 = m.f76012b;
            int i18 = (int) (jD & 4294967295L);
            int i19 = (this.width * i18) / this.height;
            jA = b.a(i19, i19, i18, i18);
        }
        v1 v1VarQ = y0Var.Q(jA);
        return b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new LottieAnimationSizeNode$measure$1(v1VarQ));
    }

    @Override // h5.c0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(x xVar, w wVar, int i14) {
        return super.minIntrinsicHeight(xVar, wVar, i14);
    }

    @Override // h5.c0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(x xVar, w wVar, int i14) {
        return super.minIntrinsicWidth(xVar, wVar, i14);
    }

    @Override // h5.j, h5.u1
    public /* bridge */ /* synthetic */ void onDensityChange() {
    }

    @Override // h5.j
    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
    }

    public final void setHeight(int i14) {
        this.height = i14;
    }

    public final void setWidth(int i14) {
        this.width = i14;
    }
}
