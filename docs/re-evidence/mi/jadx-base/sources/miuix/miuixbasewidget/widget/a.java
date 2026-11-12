package miuix.miuixbasewidget.widget;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26679b;
    public BlurMaskFilter.Blur c;
    public float d;
    public float e;
    public float f;
    public float g;

    /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.a$a, reason: collision with other inner class name */
    public static class C1034a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f26680a;

        public C1034a(float f) {
            this.f26680a = new a(f);
        }

        public a a() {
            return this.f26680a;
        }
    }

    public a(float f) {
        this(f, BlurMaskFilter.Blur.NORMAL);
    }

    public a(float f, BlurMaskFilter.Blur blur) {
        this(Color.parseColor("#0D000000"), Color.parseColor("#0DFFFFFF"), 0.0f, 0.0f, f, blur);
    }

    public a(int i, int i2, float f, float f2, float f3, BlurMaskFilter.Blur blur) {
        this.g = 0.0f;
        this.f26678a = i;
        this.f26679b = i2;
        this.e = f;
        this.f = f2;
        this.d = f3;
        this.c = blur;
    }
}
