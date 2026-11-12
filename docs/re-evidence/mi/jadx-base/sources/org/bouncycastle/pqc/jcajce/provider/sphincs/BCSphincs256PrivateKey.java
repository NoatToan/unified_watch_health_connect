package org.bouncycastle.pqc.jcajce.provider.sphincs;

import defpackage.ee;
import defpackage.he;
import defpackage.lw3;
import defpackage.pgh;
import defpackage.qg5;
import defpackage.t51;
import defpackage.vj1;
import defpackage.x7l;
import defpackage.y7l;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCSphincs256PrivateKey implements PrivateKey, SPHINCSKey {
    private static final long serialVersionUID = 1;
    private final y7l params;
    private final ee treeDigest;

    public BCSphincs256PrivateKey(ee eeVar, y7l y7lVar) {
        this.treeDigest = eeVar;
        this.params = y7lVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PrivateKey)) {
            return false;
        }
        BCSphincs256PrivateKey bCSphincs256PrivateKey = (BCSphincs256PrivateKey) obj;
        return this.treeDigest.equals(bCSphincs256PrivateKey.treeDigest) && vj1.a(this.params.b(), bCSphincs256PrivateKey.params.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new t51(pgh.f30376r, new x7l(new t51(this.treeDigest))), new qg5(this.params.b())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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

    public BCSphincs256PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.treeDigest = x7l.g(privateKeyInfo.i().i()).h().g();
        this.params = new y7l(he.q(privateKeyInfo.j()).r());
    }
}
