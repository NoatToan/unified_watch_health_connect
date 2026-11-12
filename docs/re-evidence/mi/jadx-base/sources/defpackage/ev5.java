package defpackage;

import cn.hutool.crypto.CryptoException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class ev5 implements cze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mac f17093a;

    public ev5(String str, Key key) {
        d(str, key);
    }

    @Override // defpackage.cze
    public byte[] a() {
        return this.f17093a.doFinal();
    }

    @Override // defpackage.cze
    public int b() {
        return this.f17093a.getMacLength();
    }

    public ev5 d(String str, Key key) {
        try {
            this.f17093a = fql.b(str);
            if (key == null) {
                key = fql.e(str);
            }
            this.f17093a.init(key);
            return this;
        } catch (Exception e) {
            throw new CryptoException(e);
        }
    }

    @Override // defpackage.cze
    public String getAlgorithm() {
        return this.f17093a.getAlgorithm();
    }

    @Override // defpackage.cze
    public void reset() {
        this.f17093a.reset();
    }

    @Override // defpackage.cze
    public void update(byte[] bArr, int i, int i2) {
        this.f17093a.update(bArr, i, i2);
    }
}
