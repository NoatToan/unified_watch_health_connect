package org.bouncycastle.pqc.jcajce.provider.xmss;

import defpackage.bsr;
import defpackage.dsr;
import defpackage.dw6;
import defpackage.ee;
import defpackage.esr;
import defpackage.lw3;
import defpackage.pgh;
import defpackage.t51;
import defpackage.trr;
import defpackage.vj1;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCXMSSPublicKey implements PublicKey {
    private final esr keyParams;
    private final ee treeDigest;

    public BCXMSSPublicKey(ee eeVar, esr esrVar) {
        this.treeDigest = eeVar;
        this.keyParams = esrVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSPublicKey)) {
            return false;
        }
        BCXMSSPublicKey bCXMSSPublicKey = (BCXMSSPublicKey) obj;
        return this.treeDigest.equals(bCXMSSPublicKey.treeDigest) && vj1.a(this.keyParams.e(), bCXMSSPublicKey.keyParams.e());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new t51(pgh.w, new trr(this.keyParams.b().d(), new t51(this.treeDigest))), new dsr(this.keyParams.c(), this.keyParams.d())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int getHeight() {
        return this.keyParams.b().d();
    }

    public lw3 getKeyParams() {
        return this.keyParams;
    }

    public String getTreeDigest() {
        return dw6.b(this.treeDigest);
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (vj1.q(this.keyParams.e()) * 37);
    }

    public BCXMSSPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        trr trrVarH = trr.h(subjectPublicKeyInfo.g().i());
        ee eeVarG = trrVarH.i().g();
        this.treeDigest = eeVarG;
        dsr dsrVarG = dsr.g(subjectPublicKeyInfo.k());
        this.keyParams = new esr.b(new bsr(trrVarH.g(), dw6.a(eeVarG))).f(dsrVarG.h()).g(dsrVarG.i()).e();
    }
}
