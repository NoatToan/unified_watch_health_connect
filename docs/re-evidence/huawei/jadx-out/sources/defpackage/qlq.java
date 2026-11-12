package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes16.dex */
public class qlq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46459a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46461c;
    private int d;
    private float e;
    private float f;
    private int g;
    private int h;
    private int i;
    private float j;
    private float k;
    private int l;
    private int m;
    private CharSequence n;
    private boolean o;
    private int p;
    private Typeface r;
    private float t;

    public boolean i() {
        return this.o;
    }

    public void d(boolean z) {
        this.o = z;
    }

    public float f() {
        float f = this.k;
        return f <= 0.0f ? qre.a(this.l) : f;
    }

    public void a(int i) {
        this.l = i;
    }

    public int d(Context context) {
        int i = this.i;
        return i == 0 ? qre.e(context, this.m) : i;
    }

    public void c(int i) {
        this.m = i;
    }

    public float d() {
        return this.f46459a;
    }

    public Typeface g() {
        return this.r;
    }

    public CharSequence c() {
        return this.n;
    }

    public void a(CharSequence charSequence) {
        this.n = charSequence;
    }

    public float h() {
        float f = this.t;
        return f == 0.0f ? qre.a(this.p) : f;
    }

    public int c(Context context) {
        int i = this.f46461c;
        return i == 0 ? qre.e(context, this.f46460b) : i;
    }

    public void b(int i) {
        this.f46461c = i;
    }

    public float a() {
        float f = this.e;
        return f <= 0.0f ? qre.a(this.d) : f;
    }

    public void a(float f) {
        this.e = f;
    }

    public float b() {
        float f = this.f;
        return f == 0.0f ? qre.a(this.h) : f;
    }

    public void d(float f) {
        this.f = f;
    }

    public float e() {
        float f = this.j;
        return f <= 0.0f ? qre.a(this.g) : f;
    }

    public void b(float f) {
        this.j = f;
    }

    public String toString() {
        return "TextData{mIsBelow=" + this.o + ", mSize=" + this.k + ", mSizeId=" + this.l + ", mColor=" + this.i + ", mColorId=" + this.m + ", mAlpha=" + this.f46459a + ", mTypeface=" + this.r + ", mContent=" + ((Object) this.n) + ", mVerticalOffset=" + this.t + ", mVerticalOffsetId=" + this.p + ", mBackgroundColor=" + this.f46461c + ", mBackgroundColorId=" + this.f46460b + ", mBackgroundHeight=" + this.e + ", mBackgroundHeightId=" + this.d + ", mBackgroundVerticalOffset=" + this.f + ", mBackgroundVerticalOffsetId=" + this.h + ", mBackgroundRoundCornerRadius=" + this.j + ", mBackgroundRoundCornerRadiusId=" + this.g + '}';
    }
}
