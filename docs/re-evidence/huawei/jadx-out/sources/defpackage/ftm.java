package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public class ftm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable f34556c;
    private final int e;

    public ftm(String str, Drawable drawable, int i) {
        this.f34555b = str;
        this.f34556c = drawable;
        this.e = i;
    }

    public String c() {
        return this.f34555b;
    }

    public Drawable b() {
        return this.f34556c;
    }

    public int d() {
        return this.e;
    }

    public String toString() {
        return "ActivityStatus{mText='" + this.f34555b + "', mColorDrawable=" + this.f34556c + ", mVisibility=" + this.e + '}';
    }
}
