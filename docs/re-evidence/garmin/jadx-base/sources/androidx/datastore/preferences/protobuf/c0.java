package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f6684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f6685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile q0 f6686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile h f6687d;

    public c0(o oVar, h hVar) {
        if (oVar == null) {
            j20.x.l("found null ExtensionRegistry");
            throw null;
        }
        if (hVar == null) {
            j20.x.l("found null ByteString");
            throw null;
        }
        this.f6685b = oVar;
        this.f6684a = hVar;
    }

    public final q0 a(q0 q0Var) {
        if (this.f6686c == null) {
            synchronized (this) {
                if (this.f6686c == null) {
                    try {
                        if (this.f6684a != null) {
                            this.f6686c = q0Var.getParserForType().a(this.f6685b, this.f6684a);
                            this.f6687d = this.f6684a;
                        } else {
                            this.f6686c = q0Var;
                            this.f6687d = h.f6707b;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        this.f6686c = q0Var;
                        this.f6687d = h.f6707b;
                    }
                }
            }
        }
        return this.f6686c;
    }

    public final h b() {
        if (this.f6687d != null) {
            return this.f6687d;
        }
        h hVar = this.f6684a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            try {
                if (this.f6687d != null) {
                    return this.f6687d;
                }
                if (this.f6686c == null) {
                    this.f6687d = h.f6707b;
                } else {
                    this.f6687d = this.f6686c.toByteString();
                }
                return this.f6687d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        q0 q0Var = this.f6686c;
        q0 q0Var2 = c0Var.f6686c;
        if (q0Var == null && q0Var2 == null) {
            return b().equals(c0Var.b());
        }
        if (q0Var == null || q0Var2 == null) {
            return q0Var != null ? q0Var.equals(c0Var.a(q0Var.a())) : a(q0Var2.a()).equals(q0Var2);
        }
        return q0Var.equals(q0Var2);
    }

    public int hashCode() {
        return 1;
    }

    public c0() {
    }
}
