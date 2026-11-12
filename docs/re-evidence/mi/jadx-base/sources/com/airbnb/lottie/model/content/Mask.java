package com.airbnb.lottie.model.content;

import defpackage.gb1;
import defpackage.lb1;

/* JADX INFO: loaded from: classes.dex */
public class Mask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaskMode f5676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb1 f5677b;
    public final gb1 c;
    public final boolean d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, lb1 lb1Var, gb1 gb1Var, boolean z) {
        this.f5676a = maskMode;
        this.f5677b = lb1Var;
        this.c = gb1Var;
        this.d = z;
    }

    public MaskMode a() {
        return this.f5676a;
    }

    public lb1 b() {
        return this.f5677b;
    }

    public gb1 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
