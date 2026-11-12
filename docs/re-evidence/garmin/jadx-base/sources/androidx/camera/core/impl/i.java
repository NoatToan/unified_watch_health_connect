package androidx.camera.core.impl;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class i extends f1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5573f;

    public i(int i14, String str, int i15, int i16, int i17, int i18) {
        this.f5568a = i14;
        if (str == null) {
            j20.x.l("Null mediaType");
            throw null;
        }
        this.f5569b = str;
        this.f5570c = i15;
        this.f5571d = i16;
        this.f5572e = i17;
        this.f5573f = i18;
    }

    @Override // androidx.camera.core.impl.f1.a
    public final int a() {
        return this.f5570c;
    }

    @Override // androidx.camera.core.impl.f1.a
    public final int b() {
        return this.f5572e;
    }

    @Override // androidx.camera.core.impl.f1.a
    public final int c() {
        return this.f5568a;
    }

    @Override // androidx.camera.core.impl.f1.a
    public final String d() {
        return this.f5569b;
    }

    @Override // androidx.camera.core.impl.f1.a
    public final int e() {
        return this.f5573f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1.a)) {
            return false;
        }
        f1.a aVar = (f1.a) obj;
        return this.f5568a == aVar.c() && this.f5569b.equals(aVar.d()) && this.f5570c == aVar.a() && this.f5571d == aVar.f() && this.f5572e == aVar.b() && this.f5573f == aVar.e();
    }

    @Override // androidx.camera.core.impl.f1.a
    public final int f() {
        return this.f5571d;
    }

    public final int hashCode() {
        return ((((((((((this.f5568a ^ 1000003) * 1000003) ^ this.f5569b.hashCode()) * 1000003) ^ this.f5570c) * 1000003) ^ this.f5571d) * 1000003) ^ this.f5572e) * 1000003) ^ this.f5573f;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioProfileProxy{codec=");
        sb3.append(this.f5568a);
        sb3.append(", mediaType=");
        sb3.append(this.f5569b);
        sb3.append(", bitrate=");
        sb3.append(this.f5570c);
        sb3.append(", sampleRate=");
        sb3.append(this.f5571d);
        sb3.append(", channels=");
        sb3.append(this.f5572e);
        sb3.append(", profile=");
        return am.j.q(sb3, this.f5573f, StringSubstitutor.DEFAULT_VAR_END);
    }
}
