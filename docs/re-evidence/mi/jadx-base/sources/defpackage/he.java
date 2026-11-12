package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class he extends re implements je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f19967a;

    public he(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f19967a = bArr;
    }

    public static he o(ff ffVar, boolean z) {
        re reVarQ = ffVar.q();
        return (z || (reVarQ instanceof he)) ? q(reVarQ) : zt1.u(te.q(reVarQ));
    }

    public static he q(Object obj) {
        if (obj == null || (obj instanceof he)) {
            return (he) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return q(re.j((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof hd) {
            re aSN1Primitive = ((hd) obj).toASN1Primitive();
            if (aSN1Primitive instanceof he) {
                return (he) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof he) {
            return vj1.a(this.f19967a, ((he) reVar).f19967a);
        }
        return false;
    }

    @Override // defpackage.e7d
    public re getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // defpackage.je
    public InputStream getOctetStream() {
        return new ByteArrayInputStream(this.f19967a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return vj1.q(r());
    }

    @Override // defpackage.re
    public re l() {
        return new qg5(this.f19967a);
    }

    @Override // defpackage.re
    public re m() {
        return new qg5(this.f19967a);
    }

    public byte[] r() {
        return this.f19967a;
    }

    public String toString() {
        return PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + olo.b(h7c.b(this.f19967a));
    }
}
