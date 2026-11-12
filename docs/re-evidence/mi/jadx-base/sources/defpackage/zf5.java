package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zf5 extends re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ee f41210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd f41211b;
    public re c;
    public int d;
    public re e;

    public zf5(jd jdVar) {
        int i = 0;
        re reVarO = o(jdVar, 0);
        if (reVarO instanceof ee) {
            this.f41210a = (ee) reVarO;
            reVarO = o(jdVar, 1);
            i = 1;
        }
        if (reVarO instanceof wd) {
            this.f41211b = (wd) reVarO;
            i++;
            reVarO = o(jdVar, i);
        }
        if (!(reVarO instanceof ff)) {
            this.c = reVarO;
            i++;
            reVarO = o(jdVar, i);
        }
        if (jdVar.c() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(reVarO instanceof ff)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        ff ffVar = (ff) reVarO;
        q(ffVar.r());
        this.e = ffVar.q();
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        re reVar2;
        wd wdVar;
        ee eeVar;
        if (!(reVar instanceof zf5)) {
            return false;
        }
        if (this == reVar) {
            return true;
        }
        zf5 zf5Var = (zf5) reVar;
        ee eeVar2 = this.f41210a;
        if (eeVar2 != null && ((eeVar = zf5Var.f41210a) == null || !eeVar.equals(eeVar2))) {
            return false;
        }
        wd wdVar2 = this.f41211b;
        if (wdVar2 != null && ((wdVar = zf5Var.f41211b) == null || !wdVar.equals(wdVar2))) {
            return false;
        }
        re reVar3 = this.c;
        if (reVar3 == null || ((reVar2 = zf5Var.c) != null && reVar2.equals(reVar3))) {
            return this.e.equals(zf5Var.e);
        }
        return false;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ee eeVar = this.f41210a;
        if (eeVar != null) {
            byteArrayOutputStream.write(eeVar.f(ASN1Encoding.DER));
        }
        wd wdVar = this.f41211b;
        if (wdVar != null) {
            byteArrayOutputStream.write(wdVar.f(ASN1Encoding.DER));
        }
        re reVar = this.c;
        if (reVar != null) {
            byteArrayOutputStream.write(reVar.f(ASN1Encoding.DER));
        }
        byteArrayOutputStream.write(new ih5(true, this.d, this.e).f(ASN1Encoding.DER));
        keVar.f(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        ee eeVar = this.f41210a;
        int iHashCode = eeVar != null ? eeVar.hashCode() : 0;
        wd wdVar = this.f41211b;
        if (wdVar != null) {
            iHashCode ^= wdVar.hashCode();
        }
        re reVar = this.c;
        if (reVar != null) {
            iHashCode ^= reVar.hashCode();
        }
        return iHashCode ^ this.e.hashCode();
    }

    @Override // defpackage.re
    public int i() throws IOException {
        return e().length;
    }

    @Override // defpackage.re
    public boolean k() {
        return true;
    }

    public final re o(jd jdVar, int i) {
        if (jdVar.c() > i) {
            return jdVar.b(i).toASN1Primitive();
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
