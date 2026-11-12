package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.phonenum.bean.HttpError;
import com.xiaomi.phonenum.utils.RSAEncryptUtil;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ba8 implements pfc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pfc f3978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RSAEncryptUtil f3979b;

    public static class a extends ldq {
        public a(Context context) {
            super(context);
        }

        @Override // defpackage.ldq, defpackage.vfc
        public pfc c(qfc qfcVar) {
            return new ba8(super.c(qfcVar));
        }
    }

    public ba8(pfc pfcVar) {
        this.f3978a = pfcVar;
        try {
            this.f3979b = new RSAEncryptUtil();
        } catch (RSAEncryptUtil.EncryptException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.pfc
    public ork a(ymk ymkVar) throws IOException {
        HashMap map;
        if (!ymkVar.f40331a.startsWith(jf4.f22728b)) {
            return this.f3978a.a(ymkVar);
        }
        if (this.f3979b == null) {
            return HttpError.ENCRYPT.result();
        }
        ymk ymkVarB = null;
        try {
            URI uri = ymkVar.f40332b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(w4f.c(ymkVar.d));
            arrayList.add(uri.getQuery());
            String strA = w4f.a(arrayList, gv5.CONNECT_STR);
            if (TextUtils.isEmpty(strA)) {
                map = null;
            } else {
                RSAEncryptUtil.a aVarD = this.f3979b.d(strA);
                map = new HashMap();
                map.put("params", aVarD.f14021a);
                map.put("secretKey", aVarD.f14022b);
            }
            ymkVarB = new ymk.b().h(new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString()).e(ymkVar.c).d(map).b();
        } catch (RSAEncryptUtil.EncryptException e) {
            AccountLogger.log("EncryptHttpClient", "encryptedRequest Exception" + ymkVar, e);
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("unexpected newQuery: " + ymkVar.f40331a);
        }
        if (ymkVarB == null) {
            return HttpError.ENCRYPT.result();
        }
        ork orkVarA = this.f3978a.a(ymkVarB);
        if (orkVarA == null) {
            return HttpError.DECRYPT.result();
        }
        if (orkVarA.f29628b == null) {
            return orkVarA;
        }
        try {
            return new ork.a(orkVarA).a(this.f3979b.a(orkVarA.f29628b)).b();
        } catch (RSAEncryptUtil.EncryptException e2) {
            AccountLogger.log("EncryptHttpClient", "decryptedResponse Exception" + orkVarA, e2);
            return HttpError.DECRYPT.result();
        }
    }
}
