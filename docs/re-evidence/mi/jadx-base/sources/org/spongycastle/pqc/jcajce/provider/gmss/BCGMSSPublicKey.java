package org.spongycastle.pqc.jcajce.provider.gmss;

import defpackage.awa;
import defpackage.cwa;
import defpackage.ewa;
import defpackage.fe;
import defpackage.i7c;
import defpackage.mw3;
import defpackage.ogh;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCGMSSPublicKey implements mw3, PublicKey {
    private static final long serialVersionUID = 1;
    private awa gmssParameterSet;
    private awa gmssParams;
    private byte[] publicKeyBytes;

    public BCGMSSPublicKey(cwa cwaVar) {
        throw null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        fe feVar = ogh.f29143a;
        throw null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public awa getParameterSet() {
        return null;
    }

    public byte[] getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GMSS public key : ");
        sb.append(new String(i7c.b(this.publicKeyBytes)));
        sb.append("\n");
        sb.append("Height of Trees: \n");
        throw null;
    }

    public BCGMSSPublicKey(ewa ewaVar) {
        throw null;
    }

    public BCGMSSPublicKey(byte[] bArr, awa awaVar) {
        this.publicKeyBytes = bArr;
    }
}
