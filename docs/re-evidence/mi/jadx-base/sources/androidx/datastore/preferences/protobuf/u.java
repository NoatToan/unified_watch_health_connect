package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class u {
    public static final l e = l.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteString f2256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f2257b;
    public volatile b0 c;
    public volatile ByteString d;

    public void a(b0 b0Var) {
        if (this.c != null) {
            return;
        }
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            try {
                if (this.f2256a != null) {
                    this.c = b0Var.getParserForType().b(this.f2256a, this.f2257b);
                    this.d = this.f2256a;
                } else {
                    this.c = b0Var;
                    this.d = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.c = b0Var;
                this.d = ByteString.EMPTY;
            }
        }
    }

    public int b() {
        if (this.d != null) {
            return this.d.size();
        }
        ByteString byteString = this.f2256a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.c != null) {
            return this.c.getSerializedSize();
        }
        return 0;
    }

    public b0 c(b0 b0Var) {
        a(b0Var);
        return this.c;
    }

    public b0 d(b0 b0Var) {
        b0 b0Var2 = this.c;
        this.f2256a = null;
        this.d = null;
        this.c = b0Var;
        return b0Var2;
    }

    public ByteString e() {
        if (this.d != null) {
            return this.d;
        }
        ByteString byteString = this.f2256a;
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
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        b0 b0Var = this.c;
        b0 b0Var2 = uVar.c;
        if (b0Var == null && b0Var2 == null) {
            return e().equals(uVar.e());
        }
        if (b0Var == null || b0Var2 == null) {
            return b0Var != null ? b0Var.equals(uVar.c(b0Var.getDefaultInstanceForType())) : c(b0Var2.getDefaultInstanceForType()).equals(b0Var2);
        }
        return b0Var.equals(b0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
