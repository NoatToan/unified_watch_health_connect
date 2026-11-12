package org.bouncycastle.pqc.jcajce.provider.newhope;

import defpackage.dgg;
import defpackage.he;
import defpackage.lw3;
import defpackage.pgh;
import defpackage.qg5;
import defpackage.t51;
import defpackage.vj1;
import defpackage.zgh;
import java.io.IOException;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCNHPrivateKey implements NHPrivateKey {
    private static final long serialVersionUID = 1;
    private final dgg params;

    public BCNHPrivateKey(dgg dggVar) {
        this.params = dggVar;
    }

    private static short[] convert(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = zgh.i(bArr, i * 2);
        }
        return sArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPrivateKey)) {
            return false;
        }
        return vj1.d(this.params.b(), ((BCNHPrivateKey) obj).params.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            t51 t51Var = new t51(pgh.v);
            short[] sArrB = this.params.b();
            byte[] bArr = new byte[sArrB.length * 2];
            for (int i = 0; i != sArrB.length; i++) {
                zgh.p(sArrB[i], bArr, i * 2);
            }
            return new PrivateKeyInfo(t51Var, new qg5(bArr)).e();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public lw3 getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey
    public short[] getSecretData() {
        return this.params.b();
    }

    public int hashCode() {
        return vj1.v(this.params.b());
    }

    public BCNHPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.params = new dgg(convert(he.q(privateKeyInfo.j()).r()));
    }
}
