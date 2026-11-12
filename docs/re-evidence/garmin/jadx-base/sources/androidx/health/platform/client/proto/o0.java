package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f7735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f7736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c1 f7737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f7738d;

    public o0(a0 a0Var, i iVar) {
        if (a0Var == null) {
            j20.x.l("found null ExtensionRegistry");
            throw null;
        }
        if (iVar == null) {
            j20.x.l("found null ByteString");
            throw null;
        }
        this.f7736b = a0Var;
        this.f7735a = iVar;
    }

    public final c1 a(c1 c1Var) {
        if (this.f7737c == null) {
            synchronized (this) {
                if (this.f7737c == null) {
                    try {
                        if (this.f7735a != null) {
                            this.f7737c = c1Var.getParserForType().a(this.f7736b, this.f7735a);
                            this.f7738d = this.f7735a;
                        } else {
                            this.f7737c = c1Var;
                            this.f7738d = i.f7657b;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        this.f7737c = c1Var;
                        this.f7738d = i.f7657b;
                    }
                }
            }
        }
        return this.f7737c;
    }

    public final i b() {
        if (this.f7738d != null) {
            return this.f7738d;
        }
        i iVar = this.f7735a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            try {
                if (this.f7738d != null) {
                    return this.f7738d;
                }
                if (this.f7737c == null) {
                    this.f7738d = i.f7657b;
                } else {
                    this.f7738d = this.f7737c.toByteString();
                }
                return this.f7738d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        c1 c1Var = this.f7737c;
        c1 c1Var2 = o0Var.f7737c;
        if (c1Var == null && c1Var2 == null) {
            return b().equals(o0Var.b());
        }
        if (c1Var == null || c1Var2 == null) {
            return c1Var != null ? c1Var.equals(o0Var.a(c1Var.a())) : a(c1Var2.a()).equals(c1Var2);
        }
        return c1Var.equals(c1Var2);
    }

    public int hashCode() {
        return 1;
    }

    public o0() {
    }
}
