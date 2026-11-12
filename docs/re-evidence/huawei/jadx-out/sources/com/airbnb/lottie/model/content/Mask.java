package com.airbnb.lottie.model.content;

import defpackage.fy;
import defpackage.gb;

/* JADX INFO: loaded from: classes21.dex */
public class Mask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaskMode f1934c;
    private final gb d;
    private final fy e;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, fy fyVar, gb gbVar, boolean z) {
        this.f1934c = maskMode;
        this.e = fyVar;
        this.d = gbVar;
        this.f1933b = z;
    }

    public MaskMode b() {
        return this.f1934c;
    }

    public fy c() {
        return this.e;
    }

    public gb a() {
        return this.d;
    }

    public boolean d() {
        return this.f1933b;
    }
}
