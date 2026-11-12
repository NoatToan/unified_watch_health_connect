package com.loc;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes18.dex */
public final class bf extends bj {
    private Context a;
    private String b;
    private ak e;
    private Object[] f;

    public bf(Context context, bj bjVar, ak akVar, String str, Object... objArr) {
        super(bjVar);
        this.a = context;
        this.b = str;
        this.e = akVar;
        this.f = objArr;
    }

    private String b() {
        try {
            return String.format(u.c(this.b), this.f);
        } catch (Throwable th) {
            th.printStackTrace();
            ab.b(th, "ofm", "gpj");
            return "";
        }
    }

    @Override // com.loc.bj
    public final byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        String strA = u.a(bArr);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return u.a("{\"pinfo\":\"" + u.a(this.e.b(u.a(b()))) + "\",\"els\":[" + strA + "]}");
    }
}
