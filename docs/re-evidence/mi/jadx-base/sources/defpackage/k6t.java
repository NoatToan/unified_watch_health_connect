package defpackage;

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
public final class k6t extends o6t {
    public Context c;
    public String d;
    public m4t e;
    public Object[] f;

    public k6t(Context context, o6t o6tVar, m4t m4tVar, String str, Object... objArr) {
        super(o6tVar);
        this.c = context;
        this.d = str;
        this.e = m4tVar;
        this.f = objArr;
    }

    @Override // defpackage.o6t
    public final byte[] b(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        String strG = p0t.g(bArr);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        return p0t.n("{\"pinfo\":\"" + p0t.g(this.e.b(p0t.n(d()))) + "\",\"els\":[" + strG + "]}");
    }

    public final String d() {
        try {
            return String.format(p0t.t(this.d), this.f);
        } catch (Throwable th) {
            th.printStackTrace();
            m2t.r(th, "ofm", "gpj");
            return "";
        }
    }
}
