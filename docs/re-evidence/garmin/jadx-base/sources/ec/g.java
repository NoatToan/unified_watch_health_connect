package ec;

import android.text.Layout;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f63742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f63746e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f63752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f63753l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f63756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f63757p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f63759r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63747f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63748g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f63749h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f63750i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f63751j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f63754m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f63755n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f63758q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f63760s = Float.MAX_VALUE;

    @CanIgnoreReturnValue
    public final void a(g gVar) {
        int i14;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f63744c && gVar.f63744c) {
                this.f63743b = gVar.f63743b;
                this.f63744c = true;
            }
            if (this.f63749h == -1) {
                this.f63749h = gVar.f63749h;
            }
            if (this.f63750i == -1) {
                this.f63750i = gVar.f63750i;
            }
            if (this.f63742a == null && (str = gVar.f63742a) != null) {
                this.f63742a = str;
            }
            if (this.f63747f == -1) {
                this.f63747f = gVar.f63747f;
            }
            if (this.f63748g == -1) {
                this.f63748g = gVar.f63748g;
            }
            if (this.f63755n == -1) {
                this.f63755n = gVar.f63755n;
            }
            if (this.f63756o == null && (alignment2 = gVar.f63756o) != null) {
                this.f63756o = alignment2;
            }
            if (this.f63757p == null && (alignment = gVar.f63757p) != null) {
                this.f63757p = alignment;
            }
            if (this.f63758q == -1) {
                this.f63758q = gVar.f63758q;
            }
            if (this.f63751j == -1) {
                this.f63751j = gVar.f63751j;
                this.f63752k = gVar.f63752k;
            }
            if (this.f63759r == null) {
                this.f63759r = gVar.f63759r;
            }
            if (this.f63760s == Float.MAX_VALUE) {
                this.f63760s = gVar.f63760s;
            }
            if (!this.f63746e && gVar.f63746e) {
                this.f63745d = gVar.f63745d;
                this.f63746e = true;
            }
            if (this.f63754m != -1 || (i14 = gVar.f63754m) == -1) {
                return;
            }
            this.f63754m = i14;
        }
    }
}
