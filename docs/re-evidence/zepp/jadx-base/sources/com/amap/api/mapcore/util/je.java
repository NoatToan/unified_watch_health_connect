package com.amap.api.mapcore.util;

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

/* JADX INFO: loaded from: classes2.dex */
public final class je extends ji {
    private Context a;
    private String b;
    private ie e;
    private Object[] f;

    public je(Context context, ji jiVar, ie ieVar, String str, Object... objArr) {
        super(jiVar);
        this.a = context;
        this.b = str;
        this.e = ieVar;
        this.f = objArr;
    }

    private String b() {
        try {
            return String.format(gu.c(this.b), this.f);
        } catch (Throwable th) {
            th.printStackTrace();
            hn.c(th, "ofm", "gpj");
            return "";
        }
    }

    @Override // com.amap.api.mapcore.util.ji
    public final byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        String strA = gu.a(bArr);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return gu.a("{\"pinfo\":\"" + gu.a(this.e.b(gu.a(b()))) + "\",\"els\":[" + strA + "]}");
    }
}
