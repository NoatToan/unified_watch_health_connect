package com.huawei.wisesecurity.ucs.credential.entity;

import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import defpackage.ynk;
import defpackage.ynz;
import defpackage.yqj;
import defpackage.yql;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes20.dex */
public class SkDkEntity {
    private static final int GCM_IV_LEN = 12;
    private static final int GCM_TAG_LEN = 16;
    private byte[] iv;
    private byte[] secKey;

    public byte[] getSecKey() {
        return this.secKey;
    }

    public byte[] getIv() {
        return this.iv;
    }

    public byte[] decryptSkDk(byte[] bArr) throws yqj {
        try {
            return new ynk.e().a(CipherAlg.AES_GCM).c(this.iv).c(new SecretKeySpec(bArr, "AES")).b().getDecryptHandler().from(this.secKey).to();
        } catch (ynz e) {
            StringBuilder sbB = yql.b("decrypt sk dk error : ");
            sbB.append(e.getMessage());
            throw new yqj(1003L, sbB.toString());
        }
    }

    public static SkDkEntity from(byte[] bArr) throws yqj {
        SkDkEntity skDkEntity = new SkDkEntity();
        if (bArr.length < 28) {
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, "SK DK format error");
        }
        byte[] bArr2 = new byte[12];
        skDkEntity.iv = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        byte[] bArr3 = new byte[bArr.length - 12];
        skDkEntity.secKey = bArr3;
        System.arraycopy(bArr, 12, bArr3, 0, bArr.length - 12);
        return skDkEntity;
    }
}
