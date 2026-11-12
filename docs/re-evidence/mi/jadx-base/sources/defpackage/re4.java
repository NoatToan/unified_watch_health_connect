package defpackage;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class re4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32463b;
    public final String c;
    public final egi d;

    public re4(String str, String str2, String str3, egi egiVar) {
        this.f32462a = (String) c6i.o(str);
        this.f32463b = (String) c6i.o(str2);
        this.c = (String) c6i.o(str3);
        this.d = (egi) c6i.o(egiVar);
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.f32463b;
    }

    public String c() {
        return String.format("%s#%s#%s", this.f32463b, this.f32462a, this.c);
    }

    public String d() {
        return this.f32462a;
    }

    public egi e() {
        return this.d;
    }
}
