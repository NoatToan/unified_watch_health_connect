package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSignAlg;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSigner;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes30.dex */
public class gqx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static grj f35943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile gqx f35944c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35945a;
    private CredentialClient e;

    private gqx() {
        Context contextD = gqv.d();
        this.f35945a = contextD;
        if (contextD != null) {
            d();
        }
    }

    public static gqx a(grj grjVar) {
        f35943b = grjVar;
        if (f35944c == null) {
            synchronized (d) {
                if (f35944c == null) {
                    f35944c = new gqx();
                }
            }
        }
        return f35944c;
    }

    public String a() {
        grn.d("AAR,SdkAuthManager", "getAuthorization start");
        Context contextD = gqv.d();
        this.f35945a = contextD;
        if (contextD == null) {
            grn.e("AAR,SdkAuthManager", "getAuthorization: mContext is null !");
            return "";
        }
        if (f35943b.j() == null || f35943b.j().length() <= 0) {
            grn.e("AAR,SdkAuthManager", "getAuthorization: serCountry is null !");
            return "";
        }
        if (this.e == null) {
            d();
        }
        Credential credentialE = e();
        if (credentialE == null) {
            grn.e("AAR,SdkAuthManager", "getAuthorization: credential is null !");
            return "";
        }
        String accessKey = credentialE.getAccessKey();
        if (accessKey == null || accessKey.length() <= 0) {
            grn.e("AAR,SdkAuthManager", "getAuthorization: ak is null !");
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = a(credentialE, this.e, f35943b.h() + "&" + f35943b.e() + "&" + f35943b.b() + "&" + f35943b.f() + "&ak=" + accessKey + "&timestamp=" + jCurrentTimeMillis);
        if (strA == null || strA.length() <= 0) {
            grn.e("AAR,SdkAuthManager", "getAuthorization: signatureValue is null !");
            return "";
        }
        return f35943b.a() + " ak=" + accessKey + ", timestamp=" + jCurrentTimeMillis + ", signature=" + strA;
    }

    private void d() {
        grn.d("AAR,SdkAuthManager", "credentialClientInit start");
        try {
            this.e = new CredentialClient.Builder().context(this.f35945a).serCountry(f35943b.j()).networkRetryTime(f35943b.i()).networkTimeOut(f35943b.g()).build();
        } catch (yqj e) {
            grn.c("AAR,SdkAuthManager", "client UcsException " + e.getMessage());
        }
    }

    private Credential b() {
        grn.d("AAR,SdkAuthManager", "applyCredential start");
        try {
            Credential credentialApplyCredential = this.e.applyCredential(f35943b.n());
            grc.d(f35943b.c(), credentialApplyCredential.toString(), this.f35945a);
            return credentialApplyCredential;
        } catch (yqj e) {
            grn.c("AAR,SdkAuthManager", "applyCredential UcsException " + e.getMessage());
            return null;
        }
    }

    private Credential e() {
        grn.d("AAR,SdkAuthManager", "getLocalCredential start");
        String strA = grc.a(f35943b.c(), "", this.f35945a);
        if (TextUtils.isEmpty(strA)) {
            grn.e("AAR,SdkAuthManager", "getLocalCredential credential not save!");
            return b();
        }
        try {
            Credential credentialGenCredentialFromString = this.e.genCredentialFromString(strA);
            if (System.currentTimeMillis() + f35943b.d() <= credentialGenCredentialFromString.getExpireTime()) {
                return credentialGenCredentialFromString;
            }
            grn.e("AAR,SdkAuthManager", "getLocalCredential credential expired soon!");
            return b();
        } catch (yqj e) {
            grn.c("AAR,SdkAuthManager", "genCredentialFromString UcsException " + e.getMessage());
            return b();
        }
    }

    private String a(Credential credential, CredentialClient credentialClient, String str) {
        grn.d("AAR,SdkAuthManager", "getSignData start");
        try {
            return new CredentialSigner.Builder().withAlg(CredentialSignAlg.HMAC_SHA256).withCredential(credential).withCredentialClient(credentialClient).build().getSignHandler().from(str.getBytes(StandardCharsets.UTF_8)).signBase64();
        } catch (yqe | yqj e) {
            grn.c("AAR,SdkAuthManager", "getSignData UcsException " + e.getMessage());
            return "";
        }
    }
}
