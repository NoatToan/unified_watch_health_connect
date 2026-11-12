package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes21.dex */
public class fs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Typeface f34462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f34464c;
    private final String d;
    private final String e;

    public fs(String str, String str2, String str3, float f) {
        this.f34463b = str;
        this.e = str2;
        this.d = str3;
        this.f34464c = f;
    }

    public String e() {
        return this.f34463b;
    }

    public String a() {
        return this.e;
    }

    public String d() {
        return this.d;
    }

    public Typeface c() {
        return this.f34462a;
    }

    public void b(Typeface typeface) {
        this.f34462a = typeface;
    }
}
