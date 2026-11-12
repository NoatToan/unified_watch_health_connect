package org.bouncycastle.pqc.jcajce.provider.gmss;

import defpackage.bwa;
import defpackage.dwa;
import defpackage.ee;
import defpackage.h7c;
import defpackage.lw3;
import defpackage.pgh;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCGMSSPublicKey implements lw3, PublicKey {
    private static final long serialVersionUID = 1;
    private bwa gmssParameterSet;
    private bwa gmssParams;
    private byte[] publicKeyBytes;

    public BCGMSSPublicKey(dwa dwaVar) {
        throw null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ee eeVar = pgh.f30373a;
        throw null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public bwa getParameterSet() {
        return null;
    }

    public byte[] getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GMSS public key : ");
        sb.append(new String(h7c.b(this.publicKeyBytes)));
        sb.append("\nHeight of Trees: \n");
        throw null;
    }

    public BCGMSSPublicKey(byte[] bArr, bwa bwaVar) {
        this.publicKeyBytes = bArr;
    }
}
