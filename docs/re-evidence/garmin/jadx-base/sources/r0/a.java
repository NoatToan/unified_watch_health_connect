package r0;

import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f148691c;

    public a(int i14, int i15, androidx.concurrent.futures.b.a<Void> aVar) {
        this.f148689a = i14;
        this.f148690b = i15;
        if (aVar != null) {
            this.f148691c = aVar;
        } else {
            x.l("Null completer");
            throw null;
        }
    }

    @Override // r0.e.a
    public final androidx.concurrent.futures.b.a<Void> a() {
        return this.f148691c;
    }

    @Override // r0.e.a
    public final int b() {
        return this.f148689a;
    }

    @Override // r0.e.a
    public final int c() {
        return this.f148690b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        return this.f148689a == aVar.b() && this.f148690b == aVar.c() && this.f148691c.equals(aVar.a());
    }

    public final int hashCode() {
        return ((((this.f148689a ^ 1000003) * 1000003) ^ this.f148690b) * 1000003) ^ this.f148691c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f148689a + ", rotationDegrees=" + this.f148690b + ", completer=" + this.f148691c + StringSubstitutor.DEFAULT_VAR_END;
    }
}
