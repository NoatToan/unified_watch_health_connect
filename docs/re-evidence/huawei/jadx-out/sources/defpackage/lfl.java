package defpackage;

import android.text.TextUtils;
import com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Base64;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes33.dex */
public class lfl {
    public boolean e(String str, String str2, String str3) {
        LogUtil.a("ThirdPartySignatureAuthUtil", "enter isValidRedirectUrl", " appId = ", str, " redirectUrl = ", str3);
        boolean z = c(str, str2, str3) && b(str3);
        ReleaseLogUtil.d("HiH_ThirdPartySignatureAuthUtil", "isValidRedirectUrl result: ", Boolean.valueOf(z));
        return z;
    }

    public boolean c(String str, String str2, String str3) {
        ldj.c cVarC = lfj.e().c(str3);
        if (cVarC != null && c(cVarC.getAppId(), str) && e(cVarC.getSignature(), str2)) {
            ReleaseLogUtil.d("HiH_ThirdPartySignatureAuthUtil", "check appId and signature is right by cache");
            return true;
        }
        return d(str, str3, str2);
    }

    private boolean d(final String str, final String str2, final String str3) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("HiH_ThirdPartySignatureAuthUtil", "App id is empty");
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        lcy.d().b("ThirdPartySignatureAuthUtil", new lcw(str).getRequestParamsBuilder().b(true).c(new OnRequestCallBack<ldk>() { // from class: lfl.3
            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ldk ldkVar) {
                ReleaseLogUtil.d("HiH_ThirdPartySignatureAuthUtil", "getAppInfoByAppId success");
                if (ldkVar == null || ldkVar.getAppInfos() == null || ldkVar.getAppInfos().size() == 0) {
                    ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "AppInfo is empty, appId = ", str);
                    countDownLatch.countDown();
                    return;
                }
                ldj.c redirectInfo = ldkVar.getAppInfos().get(0).getRedirectInfo();
                if (redirectInfo != null) {
                    boolean zE = lfl.this.e(lfl.this.b(str, redirectInfo.getSecret()), str3);
                    ReleaseLogUtil.d("HiH_ThirdPartySignatureAuthUtil", "Signature comparison result: ", Boolean.valueOf(zE));
                    if (zE) {
                        zArr[0] = true;
                        redirectInfo.setSignature(str3);
                        redirectInfo.setAppId(str);
                        lfj.e().a(str2, redirectInfo);
                    }
                } else {
                    ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "RedirectInfo is null");
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "getAppInfoByAppId errCode: ", Integer.valueOf(i), ", msg = ", th.getMessage());
                countDownLatch.countDown();
            }
        }).e());
        try {
            ReleaseLogUtil.d("HiH_ThirdPartySignatureAuthUtil", "requestRedirectInfo on time = ", Boolean.valueOf(countDownLatch.await(2000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "requestRedirectInfo InterruptedException e:", e.getMessage());
        }
        return zArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str, String str2) {
        return a(new StringBuffer().append(str).append("_").append(str2).toString(), str2);
    }

    private String a(String str, String str2) {
        try {
            return Base64.b(c(Base64.b(str2), str.getBytes("utf-8")));
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e) {
            ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "getHmacSha256 error, msg = ", e.getMessage());
            return "";
        }
    }

    private byte[] c(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (bArr == null || bArr2 == null) {
            ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "input param is invalid.");
            return new byte[0];
        }
        ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "hmacSha256 start");
        byte[] bArr3 = (byte[]) bArr.clone();
        byte[] bArr4 = (byte[]) bArr2.clone();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return mac.doFinal(bArr4);
    }

    private boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "App id is null");
            return false;
        }
        boolean zEquals = str2.equals(str);
        ReleaseLogUtil.d("HiH_ThirdPartySignatureAuthUtil", "checkAppId result = ", Boolean.valueOf(zEquals));
        return zEquals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, String str2) {
        boolean z = !TextUtils.isEmpty(str) && str.equals(str2);
        ReleaseLogUtil.d("HiH_ThirdPartySignatureAuthUtil", "checkSignature result = ", Boolean.valueOf(z));
        return z;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "redirectUrlFromUri is null");
            return false;
        }
        ldj.c cVarC = lfj.e().c(str);
        if (cVarC == null) {
            ReleaseLogUtil.a("HiH_ThirdPartySignatureAuthUtil", "RedirectUrl cannot be confirmed");
            return false;
        }
        String str2 = str.split("\\?")[0];
        Iterator<String> it = cVarC.getUrlSchemes().iterator();
        while (it.hasNext()) {
            if (str2.equals(it.next())) {
                return true;
            }
        }
        return false;
    }
}
