package com.fitness.banner.export.newbieguide.model;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class c implements HighLight {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RectF f7753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HighLight.Shape f7754b;
    public int c;
    public b d;

    public c(RectF rectF, HighLight.Shape shape, int i) {
        this.f7753a = rectF;
        this.f7754b = shape;
        this.c = i;
    }

    @Override // com.fitness.banner.export.newbieguide.model.HighLight
    public HighLight.Shape a() {
        return this.f7754b;
    }

    @Override // com.fitness.banner.export.newbieguide.model.HighLight
    public RectF b(View view) {
        return this.f7753a;
    }

    @Override // com.fitness.banner.export.newbieguide.model.HighLight
    public int c() {
        return this.c;
    }

    @Override // com.fitness.banner.export.newbieguide.model.HighLight
    public float d() {
        return Math.min(this.f7753a.width() / 2.0f, this.f7753a.height() / 2.0f);
    }

    public void e(b bVar) {
        this.d = bVar;
    }

    @Override // com.fitness.banner.export.newbieguide.model.HighLight
    public b i() {
        return this.d;
    }
}
