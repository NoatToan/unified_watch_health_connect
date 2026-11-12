package org.bouncycastle.pqc.jcajce.provider.sphincs;

import defpackage.ee;
import defpackage.lw3;
import defpackage.pgh;
import defpackage.t51;
import defpackage.vj1;
import defpackage.x7l;
import defpackage.z7l;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCSphincs256PublicKey implements PublicKey, SPHINCSKey {
    private static final long serialVersionUID = 1;
    private final z7l params;
    private final ee treeDigest;

    public BCSphincs256PublicKey(ee eeVar, z7l z7lVar) {
        this.treeDigest = eeVar;
        this.params = z7lVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PublicKey)) {
            return false;
        }
        BCSphincs256PublicKey bCSphincs256PublicKey = (BCSphincs256PublicKey) obj;
        return this.treeDigest.equals(bCSphincs256PublicKey.treeDigest) && vj1.a(this.params.b(), bCSphincs256PublicKey.params.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new t51(pgh.f30376r, new x7l(new t51(this.treeDigest))), this.params.b()).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey
    public byte[] getKeyData() {
        return this.params.b();
    }

    public lw3 getKeyParams() {
        return this.params;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (vj1.q(this.params.b()) * 37);
    }

    public BCSphincs256PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.treeDigest = x7l.g(subjectPublicKeyInfo.g().i()).h().g();
        this.params = new z7l(subjectPublicKeyInfo.j().r());
    }
}
