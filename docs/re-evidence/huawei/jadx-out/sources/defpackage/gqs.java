package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.y;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSignAlg;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSigner;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
public class gqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CredentialClient f35915a;
    private String d;
    private Context e;

    public String e(Context context, String str, String str2) {
        this.e = context;
        this.d = str2;
        String str3 = "{\"type\": \"VDM_V2\", \"fileId\": \"" + str + "\"}";
        d();
        Credential credentialB = b();
        if (credentialB == null) {
            grn.c("AAR,CloudAuth", "[getAuthorization], auth failed: credential is null!");
            return "";
        }
        String accessKey = credentialB.getAccessKey();
        if (TextUtils.isEmpty(accessKey)) {
            grn.c("AAR,CloudAuth", "[getAuthorization], auth failed: ak is null!");
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = e(str3, accessKey, jCurrentTimeMillis);
        grn.d("AAR,CloudAuth", "[getAuthorization], unSignature = " + strE);
        String strA = a(credentialB, this.f35915a, strE);
        if (TextUtils.isEmpty(strA)) {
            grn.c("AAR,CloudAuth", "[getAuthorization], auth failed: signatureValue is null !");
            return "";
        }
        String str4 = "CLOUDSOA-HMAC-SHA256 ak=" + accessKey + ", timestamp=" + jCurrentTimeMillis + ", signature=" + strA;
        grn.d("AAR,CloudAuth", "[getAuthorization], auth success: auth=" + str4);
        return str4;
    }

    private void d() {
        grn.d("AAR,CloudAuth", "credentialClientInit start");
        try {
            this.f35915a = new CredentialClient.Builder().context(this.e).serCountry(this.d).networkRetryTime(1).networkTimeOut(y.f15619c).build();
        } catch (yqj unused) {
            grn.c("AAR,CloudAuth", "client UcsException");
        }
    }

    private Credential b() {
        grn.d("AAR,CloudAuth", "applyCredential start");
        try {
            return this.f35915a.applyCredential("com.huawei.hms.location");
        } catch (yqj e) {
            grn.c("AAR,CloudAuth", "applyCredential UcsException " + e.getMessage());
            return null;
        }
    }

    private String e(String str, String str2, long j) {
        return "POST&/higeo/v2/geoFile&&" + str + "&ak=" + str2 + "&timestamp=" + j;
    }

    private String a(Credential credential, CredentialClient credentialClient, String str) {
        grn.d("AAR,CloudAuth", "getSignData start");
        try {
            return new CredentialSigner.Builder().withAlg(CredentialSignAlg.HMAC_SHA256).withCredential(credential).withCredentialClient(credentialClient).build().getSignHandler().from(str.getBytes(StandardCharsets.UTF_8)).signBase64();
        } catch (yqe | yqj unused) {
            grn.c("AAR,CloudAuth", "getSignData UcsException");
            return "";
        }
    }
}
