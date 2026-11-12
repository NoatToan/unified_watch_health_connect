package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import defpackage.p8f;

/* JADX INFO: loaded from: classes5.dex */
public interface c extends com.google.android.material.circularreveal.b.a {

    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f8625b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f8626a = new e();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f, e eVar, e eVar2) {
            this.f8626a.b(p8f.d(eVar.f8629a, eVar2.f8629a, f), p8f.d(eVar.f8630b, eVar2.f8630b, f), p8f.d(eVar.c, eVar2.c, f));
            return this.f8626a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    public static class C0215c extends Property<c, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<c, e> f8627a = new C0215c("circularReveal");

        public C0215c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property<c, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<c, Integer> f8628a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f8629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8630b;
        public float c;

        public e() {
        }

        public boolean a() {
            return this.c == Float.MAX_VALUE;
        }

        public void b(float f, float f2, float f3) {
            this.f8629a = f;
            this.f8630b = f2;
            this.c = f3;
        }

        public void c(e eVar) {
            b(eVar.f8629a, eVar.f8630b, eVar.c);
        }

        public e(float f, float f2, float f3) {
            this.f8629a = f;
            this.f8630b = f2;
            this.c = f3;
        }

        public e(e eVar) {
            this(eVar.f8629a, eVar.f8630b, eVar.c);
        }
    }

    void a();

    void d();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
