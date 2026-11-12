package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ge extends pe implements ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f18874a;

    public ge(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f18874a = bArr;
    }

    public static ge o(ef efVar, boolean z) {
        pe peVarO = efVar.o();
        return (z || (peVarO instanceof ge)) ? q(peVarO) : yt1.u(se.q(peVarO));
    }

    public static ge q(Object obj) {
        if (obj == null || (obj instanceof ge)) {
            return (ge) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return q(pe.j((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof gd) {
            pe aSN1Primitive = ((gd) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ge) {
                return (ge) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof ge) {
            return wj1.a(this.f18874a, ((ge) peVar).f18874a);
        }
        return false;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // defpackage.ie
    public InputStream getOctetStream() {
        return new ByteArrayInputStream(this.f18874a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return wj1.k(r());
    }

    @Override // defpackage.pe
    public pe l() {
        return new pg5(this.f18874a);
    }

    @Override // defpackage.pe
    public pe m() {
        return new pg5(this.f18874a);
    }

    public byte[] r() {
        return this.f18874a;
    }

    public String toString() {
        return PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + new String(i7c.b(this.f18874a));
    }
}
