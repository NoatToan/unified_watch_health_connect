package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class yf5 extends pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f40123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd f40124b;
    public pe c;
    public int d;
    public pe e;

    public yf5(id idVar) {
        int i = 0;
        pe peVarO = o(idVar, 0);
        if (peVarO instanceof fe) {
            this.f40123a = (fe) peVarO;
            peVarO = o(idVar, 1);
            i = 1;
        }
        if (peVarO instanceof vd) {
            this.f40124b = (vd) peVarO;
            i++;
            peVarO = o(idVar, i);
        }
        if (!(peVarO instanceof ef)) {
            this.c = peVarO;
            i++;
            peVarO = o(idVar, i);
        }
        if (idVar.c() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(peVarO instanceof ef)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        ef efVar = (ef) peVarO;
        q(efVar.q());
        this.e = efVar.o();
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        pe peVar2;
        vd vdVar;
        fe feVar;
        if (!(peVar instanceof yf5)) {
            return false;
        }
        if (this == peVar) {
            return true;
        }
        yf5 yf5Var = (yf5) peVar;
        fe feVar2 = this.f40123a;
        if (feVar2 != null && ((feVar = yf5Var.f40123a) == null || !feVar.equals(feVar2))) {
            return false;
        }
        vd vdVar2 = this.f40124b;
        if (vdVar2 != null && ((vdVar = yf5Var.f40124b) == null || !vdVar.equals(vdVar2))) {
            return false;
        }
        pe peVar3 = this.c;
        if (peVar3 == null || ((peVar2 = yf5Var.c) != null && peVar2.equals(peVar3))) {
            return this.e.equals(yf5Var.e);
        }
        return false;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fe feVar = this.f40123a;
        if (feVar != null) {
            byteArrayOutputStream.write(feVar.f(ASN1Encoding.DER));
        }
        vd vdVar = this.f40124b;
        if (vdVar != null) {
            byteArrayOutputStream.write(vdVar.f(ASN1Encoding.DER));
        }
        pe peVar = this.c;
        if (peVar != null) {
            byteArrayOutputStream.write(peVar.f(ASN1Encoding.DER));
        }
        byteArrayOutputStream.write(new hh5(true, this.d, this.e).f(ASN1Encoding.DER));
        oeVar.f(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        fe feVar = this.f40123a;
        int iHashCode = feVar != null ? feVar.hashCode() : 0;
        vd vdVar = this.f40124b;
        if (vdVar != null) {
            iHashCode ^= vdVar.hashCode();
        }
        pe peVar = this.c;
        if (peVar != null) {
            iHashCode ^= peVar.hashCode();
        }
        return iHashCode ^ this.e.hashCode();
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        return e().length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return true;
    }

    public final pe o(id idVar, int i) {
        if (idVar.c() > i) {
            return idVar.b(i).toASN1Primitive();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    public final void q(int i) {
        if (i >= 0 && i <= 2) {
            this.d = i;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i);
    }
}
