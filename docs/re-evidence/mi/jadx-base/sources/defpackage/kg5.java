package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class kg5 extends re implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f23816a;

    public kg5(byte[] bArr) {
        this.f23816a = bArr;
    }

    public static kg5 o(ff ffVar, boolean z) {
        re reVarQ = ffVar.q();
        return (z || (reVarQ instanceof kg5)) ? q(reVarQ) : new kg5(((he) reVarQ).r());
    }

    public static kg5 q(Object obj) {
        if (obj == null || (obj instanceof kg5)) {
            return (kg5) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (kg5) re.j((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof kg5) {
            return vj1.a(this.f23816a, ((kg5) reVar).f23816a);
        }
        return false;
    }

    @Override // defpackage.df
    public String getString() {
        return olo.b(this.f23816a);
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(22, this.f23816a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(this.f23816a);
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f23816a.length) + 1 + this.f23816a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
