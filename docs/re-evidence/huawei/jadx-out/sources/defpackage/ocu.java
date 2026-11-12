package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.j2;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import ohos.ace.adapter.capability.web.WebDataBaseColumns;

/* JADX INFO: loaded from: classes12.dex */
public class ocu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f44157a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ocu f44158b = null;
    private static final String d = "GBAHttpConnectionUtils";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ocv f44159c;
    private String e;

    public static ocu d() {
        ocu ocuVar;
        synchronized (f44157a) {
            if (f44158b == null) {
                f44158b = new ocu();
            }
            ocuVar = f44158b;
        }
        return ocuVar;
    }

    public String a(Context context, String str, int i, String str2) throws Exception {
        if (ocq.f44154c.booleanValue()) {
            ocq.e(d, "Gba auth step 1, slotId=" + i);
        }
        oda odaVarD = d(String.format("sip:%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org", str, oco.a(str), oco.b(str)), ock.d(), str2, null);
        if (ocq.f44154c.booleanValue()) {
            ocq.e(d, "Gba auth step 1. resultCode=" + odaVarD.a());
        }
        if (200 == odaVarD.a()) {
            return odaVarD.e();
        }
        if (401 == odaVarD.a()) {
            odb.b(odaVarD.e().replace("Digest ", " "));
            String strA = odb.a(WebDataBaseColumns.EntryColumns.COLUMN_NAME_REALM);
            String[] strArrSplit = strA != null ? strA.split("@") : null;
            if (strArrSplit != null && strArrSplit.length == 2) {
                this.e = strArrSplit[1];
                if ("3GPP-bootstrapping".equals(strArrSplit[0])) {
                    return d(context, str, i, str2, odaVarD.e());
                }
            } else {
                this.e = "";
            }
        } else if (98 == odaVarD.a()) {
            return String.valueOf(98);
        }
        return String.valueOf(99);
    }

    private String d(Context context, String str, int i, String str2, String str3) throws Exception {
        if (ocq.f44154c.booleanValue()) {
            ocq.e(d, "Gba auth step 2, slotId=" + i);
        }
        String str4 = String.format("%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org", str, oco.a(str), oco.b(str));
        oda odaVarA = a(String.format(ock.a(), oco.a(str), oco.b(str)), "Digest nonce=\"\",uri=\"/\",username=\"" + str4 + "\",realm=\"" + String.format("bsf.mnc%1$s.mcc%2$s.pub.3gppnetwork.org", oco.a(str), oco.b(str)) + "\",response=\"\"");
        if (401 == odaVarA.a()) {
            return d(context, i, str2, str3, odaVarA.e());
        }
        if (98 == odaVarA.a()) {
            return String.valueOf(98);
        }
        if (403 == odaVarA.a()) {
            return String.valueOf(403);
        }
        return String.valueOf(99);
    }

    private String d(Context context, int i, String str, String str2, String str3) throws Exception {
        if (ocq.f44154c.booleanValue()) {
            ocq.e(d, "Gba auth step 3, slotId=" + i);
        }
        String strE = obf.e(context, i);
        String str4 = String.format("%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org", strE, oco.a(strE), oco.b(strE));
        String str5 = String.format(ock.a(), oco.a(strE), oco.b(strE));
        String str6 = String.format("bsf.mnc%1$s.mcc%2$s.pub.3gppnetwork.org", oco.a(strE), oco.b(strE));
        odb.b(str3.replace("Digest ", " "));
        String strA = odb.a(Constants.NONCE);
        String strA2 = odb.a("opaque");
        String strA3 = odb.a("qop");
        String strA4 = odb.a("algorithm");
        odb.d dVarD = odb.d(context, strA, i);
        String strA5 = dVarD != null ? odb.a(dVarD.d) : null;
        byte[] bArrB = odb.b(dVarD, strE, this.e, this.f44159c);
        String strB = odb.b(str4, str6, strA5, "GET");
        String strB2 = odb.b();
        oda odaVarA = a(str5, "Digest username=\"" + str4 + "\",realm=\"" + str6 + "\",nonce=\"" + strA + "\",response=\"" + odb.c(strB, odb.d(strA, strB2, strA3, "GET:/")) + "\",uri=\"/\",opaque=\"" + strA2 + "\",qop=" + strA3 + ",nc=00000001,algorithm=" + strA4 + ",cnonce=\"" + strB2 + "\"");
        if (200 == odaVarA.a()) {
            return a(context, strE, str, d(str2, odb.a(bArrB), odaVarA.e()));
        }
        if (98 == odaVarA.a()) {
            return String.valueOf(98);
        }
        return String.valueOf(99);
    }

    private String a(Context context, String str, String str2, String str3) throws Throwable {
        if (ocq.f44154c.booleanValue()) {
            ocq.e(d, "Gba auth step 4.");
        }
        oda odaVarD = d(String.format("sip:%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org", str, oco.a(str), oco.b(str)), ock.d(), str2, str3);
        if (200 == odaVarD.a()) {
            if (str != null) {
                oco.b(context, str, "authorization", str3);
            }
            return odaVarD.e();
        }
        if (98 == odaVarD.a()) {
            return String.valueOf(98);
        }
        return String.valueOf(99);
    }

    private String d(String str, String str2, String str3) {
        odb.b(str.replace("Digest ", " "));
        Matcher matcher = Pattern.compile("[\\S\\s]*(<btid>[\\s\\S]*</btid>)[\\s\\S]*").matcher(str3);
        String strReplace = matcher.matches() ? matcher.group(1).replace("<btid>", "").replace("</btid>", "") : "";
        String strA = odb.a(WebDataBaseColumns.EntryColumns.COLUMN_NAME_REALM);
        String strA2 = odb.a(Constants.NONCE);
        String strB = odb.b();
        String strA3 = odb.a("opaque");
        String strA4 = odb.a("algorithm");
        String strA5 = odb.a("qop");
        if (str2 == null) {
            return null;
        }
        return "Digest username=\"" + strReplace + "\",realm=\"" + strA + "\",nonce=\"" + strA2 + "\",response=\"" + odb.c(odb.b(strReplace, strA, str2, "POST"), odb.d(strA2, strB, strA5, "POST:/")) + "\",uri=\"/\",opaque=\"" + strA3 + "\",qop=" + strA5 + ",nc=00000001,algorithm=" + strA4 + ",cnonce=\"" + strB + "\"";
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    private oda d(String str, String str2, String str3, String str4) throws Throwable {
        Closeable closeable;
        String strTrim;
        if (ocq.f44154c.booleanValue()) {
            ocq.e(d, "getGBAContentFromPost->start.urlParams=" + str3 + ", authorization=" + str4 + ", sip=" + str + ", urlAddress=" + str2);
        }
        oda odaVar = new oda();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            odaVar.d(99);
            return odaVar;
        }
        HttpsURLConnection httpsURLConnection = null;
        try {
            HttpsURLConnection httpsURLConnectionC = c(str2, str4, str);
            try {
                if (httpsURLConnectionC == null) {
                    odaVar.d(98);
                    if (httpsURLConnectionC != null) {
                        httpsURLConnectionC.disconnect();
                    }
                    b((Closeable) null);
                    return odaVar;
                }
                httpsURLConnectionC.connect();
                this.f44159c = ocv.a(httpsURLConnectionC.getCipherSuite());
                OutputStream outputStream = httpsURLConnectionC.getOutputStream();
                if (!TextUtils.isEmpty(str3)) {
                    outputStream.write(str3.getBytes());
                }
                outputStream.flush();
                int responseCode = httpsURLConnectionC.getResponseCode();
                if (responseCode == 401) {
                    String headerField = httpsURLConnectionC.getHeaderField("www-Authenticate");
                    if (TextUtils.isEmpty(headerField)) {
                        strTrim = "";
                    } else {
                        strTrim = headerField.trim();
                    }
                } else if (responseCode == 200) {
                    strTrim = b(httpsURLConnectionC).trim();
                } else {
                    strTrim = "";
                }
                odaVar.d(responseCode);
                odaVar.b(strTrim);
                if (httpsURLConnectionC != null) {
                    httpsURLConnectionC.disconnect();
                }
                b(outputStream);
                return odaVar;
            } catch (IOException unused) {
                httpsURLConnection = httpsURLConnectionC;
                closeable = null;
                try {
                    odaVar.d(98);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    b(closeable);
                    return odaVar;
                } catch (Throwable th) {
                    th = th;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    b(closeable);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = httpsURLConnectionC;
                closeable = null;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                b(closeable);
                throw th;
            }
        } catch (IOException unused2) {
            closeable = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
        }
    }

    private HttpsURLConnection c(String str, String str2, String str3) throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                try {
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setRequestProperty("User-Agent", "3gpp-gba");
                    httpsURLConnection.setRequestProperty("ES-Version", "1.0.7");
                    httpsURLConnection.setRequestProperty("ES-APP-ID", "00104605");
                    httpsURLConnection.setRequestProperty("ES-APP-Key", "0C22D5E56878F9D3");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    httpsURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpsURLConnection.setRequestProperty("Connection", "Keep-Alive");
                    String string = UUID.randomUUID().toString();
                    httpsURLConnection.setRequestProperty("ES-Req-ID", string);
                    String str4 = d;
                    ocq.e(str4, "buildHttpConnection req_id len: " + string.length());
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    httpsURLConnection.setRequestProperty("ES-Timestamp", strValueOf);
                    ocq.e(str4, "buildHttpConnection ver: 1.0.7, time: " + strValueOf);
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest((string + "00104605" + strValueOf + "0C22D5E56878F9D3").getBytes(StandardCharsets.UTF_8));
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : bArrDigest) {
                        String hexString = Integer.toHexString(b2 & 255);
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                    }
                    httpsURLConnection.setRequestProperty("ES-Signature", sb.toString());
                    ocq.e(d, "buildHttpConnection signature len: " + sb.toString().length());
                    httpsURLConnection.setRequestProperty("X-3GPP-Intended-IDENTITY", str3);
                    if (!TextUtils.isEmpty(str2)) {
                        httpsURLConnection.setRequestProperty("Authorization", str2);
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return httpsURLConnection;
                } catch (IOException unused) {
                    httpsURLConnection2 = httpsURLConnection;
                    ocq.e(d, "getGBAContentFromPost->IOException.");
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    return httpsURLConnection2;
                } catch (NoSuchAlgorithmException unused2) {
                    httpsURLConnection2 = httpsURLConnection;
                    ocq.e(d, "buildHttpConnection no algorithmE err.");
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    return httpsURLConnection2;
                } catch (Throwable th2) {
                    th = th2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = null;
            }
        } catch (IOException unused3) {
        } catch (NoSuchAlgorithmException unused4) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.net.HttpURLConnection] */
    private oda a(String str, String str2) throws Exception {
        Throwable th;
        ?? r4;
        String strTrim;
        if (ocq.f44154c.booleanValue()) {
            ocq.e(d, "getGBAContentFromGet urlAddress = " + str + ", authorization = " + str2);
        }
        oda odaVar = new oda();
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            ocq.e(d, "authorization or urlAddress is null");
            odaVar.d(99);
            return odaVar;
        }
        ?? r1 = 0;
        ?? r2 = 0;
        try {
            try {
                r4 = (HttpURLConnection) new URL(str).openConnection();
                if (r4 != 0) {
                    try {
                        r4.setConnectTimeout(30000);
                        r4.setReadTimeout(30000);
                        r4.setRequestMethod("GET");
                        r4.setRequestProperty("User-Agent", "Bootstrapping Client Agent");
                        r4.setRequestProperty(j2.v, "identity");
                        r4.setRequestProperty("Accept", "*/*");
                        r4.setRequestProperty("Connection", "Keep-Alive");
                        r4.setRequestProperty("Authorization", str2);
                        r4.connect();
                        int responseCode = r4.getResponseCode();
                        if (responseCode == 401) {
                            String headerField = r4.getHeaderField("www-Authenticate");
                            if (!TextUtils.isEmpty(headerField)) {
                                strTrim = headerField.trim();
                            } else {
                                strTrim = "";
                            }
                        } else if (responseCode == 200) {
                            strTrim = b((HttpURLConnection) r4).trim();
                        } else {
                            strTrim = "";
                        }
                        odaVar.d(responseCode);
                        odaVar.b(strTrim);
                    } catch (IOException unused) {
                        r2 = r4;
                        ocq.e(d, "getGBAContentFromGet->IOException.");
                        odaVar.d(98);
                        r1 = r2;
                        if (r2 != 0) {
                            r2.disconnect();
                            r1 = r2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (r4 != 0) {
                            r4.disconnect();
                        }
                        throw th;
                    }
                }
                if (ocq.f44154c.booleanValue()) {
                    ocq.e(d, "response: " + odaVar.toString());
                }
                ocq.e(d, "doPostRequest->success.");
                r1 = "doPostRequest->success.";
                if (r4 != 0) {
                    r4.disconnect();
                    return odaVar;
                }
            } catch (Throwable th3) {
                th = th3;
                r4 = r1;
            }
        } catch (IOException unused2) {
        }
        return odaVar;
    }

    private static String b(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        String string = byteArrayOutputStream.toString();
                        b(inputStream);
                        b(byteArrayOutputStream);
                        return string;
                    }
                }
            } catch (Throwable th) {
                th = th;
                b(inputStream);
                b(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                ocq.h(d, "closeStream->close error");
            }
        }
    }
}
