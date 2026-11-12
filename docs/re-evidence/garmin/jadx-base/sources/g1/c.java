package g1;

import androidx.camera.core.impl.x2;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2 f74671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f74672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f74673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f74674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f74675g;

    private c(String str, int i14, x2 x2Var, int i15, int i16, int i17, int i18) {
        this.f74669a = str;
        this.f74670b = i14;
        this.f74671c = x2Var;
        this.f74672d = i15;
        this.f74673e = i16;
        this.f74674f = i17;
        this.f74675g = i18;
    }

    @Override // g1.k
    public final String a() {
        return this.f74669a;
    }

    @Override // g1.k
    public final x2 b() {
        return this.f74671c;
    }

    @Override // g1.a
    public final int d() {
        return this.f74672d;
    }

    @Override // g1.a
    public final int e() {
        return this.f74673e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1.a)) {
            return false;
        }
        g1.a aVar = (g1.a) obj;
        c cVar = (c) aVar;
        return this.f74669a.equals(cVar.f74669a) && this.f74670b == aVar.h() && this.f74671c.equals(cVar.f74671c) && this.f74672d == aVar.d() && this.f74673e == aVar.e() && this.f74674f == aVar.g() && this.f74675g == aVar.f();
    }

    @Override // g1.a
    public final int f() {
        return this.f74675g;
    }

    @Override // g1.a
    public final int g() {
        return this.f74674f;
    }

    @Override // g1.a
    public final int h() {
        return this.f74670b;
    }

    public final int hashCode() {
        return ((((((((((((this.f74669a.hashCode() ^ 1000003) * 1000003) ^ this.f74670b) * 1000003) ^ this.f74671c.hashCode()) * 1000003) ^ this.f74672d) * 1000003) ^ this.f74673e) * 1000003) ^ this.f74674f) * 1000003) ^ this.f74675g;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb3.append(this.f74669a);
        sb3.append(", profile=");
        sb3.append(this.f74670b);
        sb3.append(", inputTimebase=");
        sb3.append(this.f74671c);
        sb3.append(", bitrate=");
        sb3.append(this.f74672d);
        sb3.append(", captureSampleRate=");
        sb3.append(this.f74673e);
        sb3.append(", encodeSampleRate=");
        sb3.append(this.f74674f);
        sb3.append(", channelCount=");
        return am.j.q(sb3, this.f74675g, StringSubstitutor.DEFAULT_VAR_END);
    }
}
