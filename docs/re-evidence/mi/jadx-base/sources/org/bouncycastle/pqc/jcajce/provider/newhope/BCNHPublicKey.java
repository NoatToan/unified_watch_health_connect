package org.bouncycastle.pqc.jcajce.provider.newhope;

import defpackage.egg;
import defpackage.lw3;
import defpackage.pgh;
import defpackage.t51;
import defpackage.vj1;
import java.io.IOException;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCNHPublicKey implements NHPublicKey {
    private static final long serialVersionUID = 1;
    private final egg params;

    public BCNHPublicKey(egg eggVar) {
        this.params = eggVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPublicKey)) {
            return false;
        }
        return vj1.a(this.params.b(), ((BCNHPublicKey) obj).params.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new t51(pgh.v), this.params.b()).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public lw3 getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey
    public byte[] getPublicData() {
        return this.params.b();
    }

    public int hashCode() {
        return vj1.q(this.params.b());
    }

    public BCNHPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.params = new egg(subjectPublicKeyInfo.j().r());
    }
}
