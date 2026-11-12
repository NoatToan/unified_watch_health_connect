package defpackage;

import android.text.SpannableString;

/* JADX INFO: loaded from: classes7.dex */
public class fsw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SpannableString f34518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34519c;
    private int d;
    private String e;
    private boolean g;
    private int i;
    private int j;

    public int i() {
        return this.i;
    }

    public void e(int i) {
        this.i = i;
    }

    public SpannableString b() {
        return this.f34518b;
    }

    public void a(SpannableString spannableString) {
        this.f34518b = spannableString;
    }

    public int e() {
        return this.f34519c;
    }

    public void c(int i) {
        this.f34519c = i;
    }

    public void b(int i) {
        this.j = i;
    }

    public String a() {
        return this.f34517a;
    }

    public void e(String str) {
        this.f34517a = str;
    }

    public int c() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public String d() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public boolean g() {
        return this.g;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public String toString() {
        return "SectionActiveTrendBean{mType=" + this.i + ", mComparedPrompt='" + ((Object) this.f34518b) + "', mCurrentValue=" + this.f34519c + ", mGoalValue=" + this.j + ", mComparedTopContent='" + this.e + "', mComparedValue=" + this.d + ", mComparedTopContent='" + this.e + "'}";
    }
}
