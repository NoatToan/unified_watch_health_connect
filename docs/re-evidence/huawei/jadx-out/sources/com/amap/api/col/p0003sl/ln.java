package com.amap.api.col.p0003sl;

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

/* JADX INFO: loaded from: classes4.dex */
public final class ln extends lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3067b;
    private km e;
    private Object[] f;

    public ln(Context context, lr lrVar, km kmVar, String str, Object... objArr) {
        super(lrVar);
        this.f3066a = context;
        this.f3067b = str;
        this.e = kmVar;
        this.f = objArr;
    }

    @Override // com.amap.api.col.p0003sl.lr
    protected final byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        String strA = iy.a(bArr);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return iy.a("{\"pinfo\":\"" + iy.a(this.e.b(iy.a(b()))) + "\",\"els\":[" + strA + "]}");
    }

    private String b() {
        try {
            return String.format(iy.c(this.f3067b), this.f);
        } catch (Throwable th) {
            th.printStackTrace();
            jv.c(th, "ofm", "gpj");
            return "";
        }
    }
}
