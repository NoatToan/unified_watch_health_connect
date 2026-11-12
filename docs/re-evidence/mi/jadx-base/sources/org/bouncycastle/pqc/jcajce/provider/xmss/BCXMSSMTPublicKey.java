package org.bouncycastle.pqc.jcajce.provider.xmss;

import defpackage.dsr;
import defpackage.dw6;
import defpackage.ee;
import defpackage.lw3;
import defpackage.pgh;
import defpackage.t51;
import defpackage.vj1;
import defpackage.vrr;
import defpackage.wrr;
import defpackage.zrr;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BCXMSSMTPublicKey implements PublicKey {
    private final zrr keyParams;
    private final ee treeDigest;

    public BCXMSSMTPublicKey(ee eeVar, zrr zrrVar) {
        this.treeDigest = eeVar;
        this.keyParams = zrrVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPublicKey)) {
            return false;
        }
        BCXMSSMTPublicKey bCXMSSMTPublicKey = (BCXMSSMTPublicKey) obj;
        return this.treeDigest.equals(bCXMSSMTPublicKey.treeDigest) && vj1.a(this.keyParams.e(), bCXMSSMTPublicKey.keyParams.e());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new t51(pgh.B, new vrr(this.keyParams.b().c(), this.keyParams.b().d(), new t51(this.treeDigest))), new dsr(this.keyParams.c(), this.keyParams.d())).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int getHeight() {
        return this.keyParams.b().c();
    }

    public lw3 getKeyParams() {
        return this.keyParams;
    }

    public int getLayers() {
        return this.keyParams.b().d();
    }

    public String getTreeDigest() {
        return dw6.b(this.treeDigest);
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (vj1.q(this.keyParams.e()) * 37);
    }

    public BCXMSSMTPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        vrr vrrVarH = vrr.h(subjectPublicKeyInfo.g().i());
        ee eeVarG = vrrVarH.j().g();
        this.treeDigest = eeVarG;
        dsr dsrVarG = dsr.g(subjectPublicKeyInfo.k());
        this.keyParams = new zrr.b(new wrr(vrrVarH.g(), vrrVarH.i(), dw6.a(eeVarG))).f(dsrVarG.h()).g(dsrVarG.i()).e();
    }
}
