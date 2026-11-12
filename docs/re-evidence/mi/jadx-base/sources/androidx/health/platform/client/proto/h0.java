package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public class h0 {
    public static final y e = y.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteString f2500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f2501b;
    public volatile o0 c;
    public volatile ByteString d;

    public void a(o0 o0Var) {
        if (this.c != null) {
            return;
        }
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            try {
                if (this.f2500a != null) {
                    this.c = o0Var.getParserForType().b(this.f2500a, this.f2501b);
                    this.d = this.f2500a;
                } else {
                    this.c = o0Var;
                    this.d = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.c = o0Var;
                this.d = ByteString.EMPTY;
            }
        }
    }

    public int b() {
        if (this.d != null) {
            return this.d.size();
        }
        ByteString byteString = this.f2500a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.c != null) {
            return this.c.getSerializedSize();
        }
        return 0;
    }

    public o0 c(o0 o0Var) {
        a(o0Var);
        return this.c;
    }

    public o0 d(o0 o0Var) {
        o0 o0Var2 = this.c;
        this.f2500a = null;
        this.d = null;
        this.c = o0Var;
        return o0Var2;
    }

    public ByteString e() {
        if (this.d != null) {
            return this.d;
        }
        ByteString byteString = this.f2500a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.d != null) {
                    return this.d;
                }
                if (this.c == null) {
                    this.d = ByteString.EMPTY;
                } else {
                    this.d = this.c.toByteString();
                }
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        o0 o0Var = this.c;
        o0 o0Var2 = h0Var.c;
        if (o0Var == null && o0Var2 == null) {
            return e().equals(h0Var.e());
        }
        if (o0Var == null || o0Var2 == null) {
            return o0Var != null ? o0Var.equals(h0Var.c(o0Var.getDefaultInstanceForType())) : c(o0Var2.getDefaultInstanceForType()).equals(o0Var2);
        }
        return o0Var.equals(o0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
