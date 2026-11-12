package defpackage;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class sz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34124b;
    public final String c;
    public final float d;
    public Typeface e;

    public sz9(String str, String str2, String str3, float f) {
        this.f34123a = str;
        this.f34124b = str2;
        this.c = str3;
        this.d = f;
    }

    public String a() {
        return this.f34123a;
    }

    public String b() {
        return this.f34124b;
    }

    public String c() {
        return this.c;
    }

    public Typeface d() {
        return this.e;
    }

    public void e(Typeface typeface) {
        this.e = typeface;
    }
}
