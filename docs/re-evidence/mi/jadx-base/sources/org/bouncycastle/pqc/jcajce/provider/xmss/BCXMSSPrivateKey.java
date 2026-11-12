package org.bouncycastle.pqc.jcajce.provider.xmss;

import defpackage.bsr;
import defpackage.csr;
import defpackage.dw6;
import defpackage.ee;
import defpackage.fsr;
import defpackage.lw3;
import defpackage.pgh;
import defpackage.t51;
import defpackage.trr;
import defpackage.vj1;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.h;

/* JADX INFO: loaded from: classes3.dex */
public class BCXMSSPrivateKey implements PrivateKey {
    private final h keyParams;
    private final ee treeDigest;

    public BCXMSSPrivateKey(ee eeVar, h hVar) {
        this.treeDigest = eeVar;
        this.keyParams = hVar;
    }

    private csr createKeyStructure() {
        byte[] bArrC = this.keyParams.c();
        int iC = this.keyParams.b().c();
        int iD = this.keyParams.b().d();
        int iA = (int) fsr.a(bArrC, 0, 4);
        if (!fsr.l(iD, iA)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrG = fsr.g(bArrC, 4, iC);
        int i = 4 + iC;
        byte[] bArrG2 = fsr.g(bArrC, i, iC);
        int i2 = i + iC;
        byte[] bArrG3 = fsr.g(bArrC, i2, iC);
        int i3 = i2 + iC;
        byte[] bArrG4 = fsr.g(bArrC, i3, iC);
        int i4 = i3 + iC;
        return new csr(iA, bArrG, bArrG2, bArrG3, bArrG4, fsr.g(bArrC, i4, bArrC.length - i4));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSPrivateKey)) {
            return false;
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) obj;
        return this.treeDigest.equals(bCXMSSPrivateKey.treeDigest) && vj1.a(this.keyParams.c(), bCXMSSPrivateKey.keyParams.c());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new t51(pgh.w, new trr(this.keyParams.b().d(), new t51(this.treeDigest))), createKeyStructure()).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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

    public ee getTreeDigestOID() {
        return this.treeDigest;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (vj1.q(this.keyParams.c()) * 37);
    }

    public BCXMSSPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        trr trrVarH = trr.h(privateKeyInfo.i().i());
        ee eeVarG = trrVarH.i().g();
        this.treeDigest = eeVarG;
        csr csrVarI = csr.i(privateKeyInfo.j());
        try {
            h.b bVarN = new h.b(new bsr(trrVarH.g(), dw6.a(eeVarG))).l(csrVarI.h()).p(csrVarI.m()).o(csrVarI.l()).m(csrVarI.j()).n(csrVarI.k());
            if (csrVarI.g() != null) {
                bVarN.k((BDS) fsr.f(csrVarI.g()));
            }
            this.keyParams = bVarN.j();
        } catch (ClassNotFoundException e) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
        }
    }
}
