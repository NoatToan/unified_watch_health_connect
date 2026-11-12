package org.bouncycastle.pqc.jcajce.provider.xmss;

import defpackage.csr;
import defpackage.dw6;
import defpackage.ee;
import defpackage.fsr;
import defpackage.lw3;
import defpackage.pgh;
import defpackage.t51;
import defpackage.vj1;
import defpackage.vrr;
import defpackage.wrr;
import defpackage.xrr;
import defpackage.yrr;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;

/* JADX INFO: loaded from: classes3.dex */
public class BCXMSSMTPrivateKey implements PrivateKey {
    private final yrr keyParams;
    private final ee treeDigest;

    public BCXMSSMTPrivateKey(ee eeVar, yrr yrrVar) {
        this.treeDigest = eeVar;
        this.keyParams = yrrVar;
    }

    private xrr createKeyStructure() {
        byte[] bArrC = this.keyParams.c();
        int iB = this.keyParams.b().b();
        int iC = this.keyParams.b().c();
        int i = (iC + 7) / 8;
        int iA = (int) fsr.a(bArrC, 0, i);
        if (!fsr.l(iC, iA)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrG = fsr.g(bArrC, i, iB);
        int i2 = i + iB;
        byte[] bArrG2 = fsr.g(bArrC, i2, iB);
        int i3 = i2 + iB;
        byte[] bArrG3 = fsr.g(bArrC, i3, iB);
        int i4 = i3 + iB;
        byte[] bArrG4 = fsr.g(bArrC, i4, iB);
        int i5 = i4 + iB;
        return new xrr(iA, bArrG, bArrG2, bArrG3, bArrG4, fsr.g(bArrC, i5, bArrC.length - i5));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPrivateKey)) {
            return false;
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey) obj;
        return this.treeDigest.equals(bCXMSSMTPrivateKey.treeDigest) && vj1.a(this.keyParams.c(), bCXMSSMTPrivateKey.keyParams.c());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new t51(pgh.B, new vrr(this.keyParams.b().c(), this.keyParams.b().d(), new t51(this.treeDigest))), createKeyStructure()).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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

    public ee getTreeDigestOID() {
        return this.treeDigest;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (vj1.q(this.keyParams.c()) * 37);
    }

    public BCXMSSMTPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        vrr vrrVarH = vrr.h(privateKeyInfo.i().i());
        ee eeVarG = vrrVarH.j().g();
        this.treeDigest = eeVarG;
        csr csrVarI = csr.i(privateKeyInfo.j());
        try {
            yrr.b bVarN = new yrr.b(new wrr(vrrVarH.g(), vrrVarH.i(), dw6.a(eeVarG))).l(csrVarI.h()).p(csrVarI.m()).o(csrVarI.l()).m(csrVarI.j()).n(csrVarI.k());
            if (csrVarI.g() != null) {
                bVarN.k((BDSStateMap) fsr.f(csrVarI.g()));
            }
            this.keyParams = bVarN.j();
        } catch (ClassNotFoundException e) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
        }
    }
}
