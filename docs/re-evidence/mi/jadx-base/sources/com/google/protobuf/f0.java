package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public class f0 {
    public static final t e = t.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteString f9635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f9636b;
    public volatile q0 c;
    public volatile ByteString d;

    public f0() {
    }

    public f0(t tVar, ByteString byteString) {
        a(tVar, byteString);
        this.f9636b = tVar;
        this.f9635a = byteString;
    }

    public static void a(t tVar, ByteString byteString) {
        if (tVar == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public void b(q0 q0Var) {
        if (this.c != null) {
            return;
        }
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            try {
                if (this.f9635a != null) {
                    this.c = q0Var.getParserForType().parseFrom(this.f9635a, this.f9636b);
                    this.d = this.f9635a;
                } else {
                    this.c = q0Var;
                    this.d = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.c = q0Var;
                this.d = ByteString.EMPTY;
            }
        }
    }

    public int c() {
        if (this.d != null) {
            return this.d.size();
        }
        ByteString byteString = this.f9635a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.c != null) {
            return this.c.getSerializedSize();
        }
        return 0;
    }

    public q0 d(q0 q0Var) {
        b(q0Var);
        return this.c;
    }

    public q0 e(q0 q0Var) {
        q0 q0Var2 = this.c;
        this.f9635a = null;
        this.d = null;
        this.c = q0Var;
        return q0Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        q0 q0Var = this.c;
        q0 q0Var2 = f0Var.c;
        if (q0Var == null && q0Var2 == null) {
            return f().equals(f0Var.f());
        }
        if (q0Var == null || q0Var2 == null) {
            return q0Var != null ? q0Var.equals(f0Var.d(q0Var.getDefaultInstanceForType())) : d(q0Var2.getDefaultInstanceForType()).equals(q0Var2);
        }
        return q0Var.equals(q0Var2);
    }

    public ByteString f() {
        if (this.d != null) {
            return this.d;
        }
        ByteString byteString = this.f9635a;
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

    public int hashCode() {
        return 1;
    }
}
