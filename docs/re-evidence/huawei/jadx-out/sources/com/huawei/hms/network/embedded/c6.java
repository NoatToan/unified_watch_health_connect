package com.huawei.hms.network.embedded;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.ssl.SSFCompatiableSystemCA;
import com.huawei.secure.android.common.ssl.hostname.StrictHostnameVerifier;
import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes34.dex */
public class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14673a = "c6";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SSLSocketFactory f14674b;

    public static String a(Context context) {
        String str = f14673a;
        Logger.v(str, "entry to getDomainName function");
        Map<String, String> mapSynGetGrsUrls = new GrsClient(context, new GrsBaseInfo()).synGetGrsUrls(b6.n.j);
        if (mapSynGetGrsUrls == null || mapSynGetGrsUrls.isEmpty()) {
            return "";
        }
        String str2 = mapSynGetGrsUrls.get(new ArrayList(mapSynGetGrsUrls.keySet()).get(new SecureRandom().nextInt(mapSynGetGrsUrls.size())));
        Logger.v(str, "domain in random: " + str2);
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static d5 a(Context context, String str, String str2) throws Throwable {
        ?? r4;
        ?? r5;
        ?? r1;
        try {
            f14674b = SSFCompatiableSystemCA.getInstance(context, EncryptUtil.genSecureRandom());
        } catch (IOException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            Logger.w(f14673a, "catch exception when create sslSocketFactory", e);
        }
        d5 d5Var = new d5();
        ?? r2 = 0;
        ?? r3 = 0;
        try {
            try {
                r4 = (HttpsURLConnection) new URL(str).openConnection();
                try {
                    String str3 = b6.a.f14601a;
                    r4.addRequestProperty(b6.a.f14601a, context.getPackageName());
                    r4.addRequestProperty(b6.a.f14602b, str2);
                    r4.setRequestMethod("POST");
                    r4.setSSLSocketFactory(f14674b);
                    r4.setHostnameVerifier(new StrictHostnameVerifier());
                    d5Var.a(r4.getResponseCode());
                    r1 = str3;
                    r5 = r4;
                    r2 = str3;
                    if (r4 != 0) {
                        r5.disconnect();
                        r2 = r1;
                    }
                } catch (IOException e2) {
                    e = e2;
                    r3 = r4;
                    Logger.v(f14673a, "connection query fail");
                    d5Var.a(ExceptionCode.getErrorCodeFromException(e));
                    r2 = r3;
                    if (r3 != 0) {
                        r5 = r3;
                        r1 = r3;
                    }
                    return d5Var;
                } catch (Throwable th) {
                    th = th;
                    if (r4 != 0) {
                        r4.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r4 = r2;
            }
        } catch (IOException e3) {
            e = e3;
        }
        return d5Var;
    }
}
