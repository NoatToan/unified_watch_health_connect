package h0;

import android.graphics.Bitmap;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0.k<Bitmap> f80447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80448b;

    public a(r0.k<Bitmap> kVar, int i14) {
        if (kVar == null) {
            j20.x.l("Null packet");
            throw null;
        }
        this.f80447a = kVar;
        this.f80448b = i14;
    }

    @Override // h0.k.b
    public final int a() {
        return this.f80448b;
    }

    @Override // h0.k.b
    public final r0.k<Bitmap> b() {
        return this.f80447a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k.b)) {
            return false;
        }
        k.b bVar = (k.b) obj;
        return this.f80447a.equals(bVar.b()) && this.f80448b == bVar.a();
    }

    public final int hashCode() {
        return ((this.f80447a.hashCode() ^ 1000003) * 1000003) ^ this.f80448b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{packet=");
        sb3.append(this.f80447a);
        sb3.append(", jpegQuality=");
        return am.j.q(sb3, this.f80448b, StringSubstitutor.DEFAULT_VAR_END);
    }
}
