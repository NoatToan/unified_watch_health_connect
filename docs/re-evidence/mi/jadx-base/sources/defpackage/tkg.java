package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.smarthome.mijiasdk.MiServiceTokenInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes7.dex */
public class tkg {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f34791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MiServiceTokenInfo f34792b;
        public final /* synthetic */ ikg c;
        public final /* synthetic */ wjg d;

        public a(Context context, MiServiceTokenInfo miServiceTokenInfo, ikg ikgVar, wjg wjgVar) {
            this.f34791a = context;
            this.f34792b = miServiceTokenInfo;
            this.c = ikgVar;
            this.d = wjgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ikg ikgVar;
            if (this.f34791a != null && this.f34792b != null && (ikgVar = this.c) != null && !TextUtils.isEmpty(ikgVar.f21254a) && !TextUtils.isEmpty(this.c.f21255b)) {
                tkg.l(this.f34791a, this.f34792b, this.c, this.d);
                return;
            }
            wjg wjgVar = this.d;
            if (wjgVar != null) {
                wjgVar.onFailed("param is null");
            }
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static String c(MiServiceTokenInfo miServiceTokenInfo, String str, String str2) throws SecurityException {
        try {
            String strB = p34.b(p34.c(b(p34.a(miServiceTokenInfo.e), p34.a(str2))));
            if (strB == null) {
                return null;
            }
            return new f6j(strB).a(str);
        } catch (InvalidKeyException | NoSuchAlgorithmException | Exception unused) {
            return null;
        }
    }

    public static String d(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Pair<List<x0e>, String> e(String str, String str2, MiServiceTokenInfo miServiceTokenInfo, List<x0e> list) {
        String strB;
        String strG = g(System.currentTimeMillis() + miServiceTokenInfo.f);
        try {
            strB = p34.b(p34.c(b(p34.a(miServiceTokenInfo.e), p34.a(strG))));
        } catch (Exception e) {
            e.printStackTrace();
            strB = null;
        }
        if (strB == null) {
            return null;
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        ArrayList arrayList = new ArrayList();
        f6j f6jVar = new f6j(strB);
        if (list != null) {
            for (x0e x0eVar : list) {
                if (!TextUtils.isEmpty(x0eVar.a()) && !TextUtils.isEmpty(x0eVar.b())) {
                    treeMap2.put(x0eVar.a(), x0eVar.b());
                }
            }
        }
        treeMap2.put("rc4_hash__", b24.a(str, str2, treeMap2, strB));
        for (Map.Entry entry : treeMap2.entrySet()) {
            String strC = f6jVar.c((String) entry.getValue());
            treeMap.put((String) entry.getKey(), strC);
            arrayList.add(new x0e((String) entry.getKey(), strC));
        }
        arrayList.add(new x0e(MiTsmConstants.KEY_SIGNATURE, b24.a(str, str2, treeMap, strB)));
        arrayList.add(new x0e("_nonce", strG));
        return new Pair<>(arrayList, strG);
    }

    public static String f(List<? extends x0e> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (x0e x0eVar : list) {
            String strD = d(x0eVar.a(), str);
            String strB = x0eVar.b();
            String strD2 = strB != null ? d(strB, str) : "";
            if (sb.length() > 0) {
                sb.append(gv5.CONNECT_STR);
            }
            sb.append(strD);
            sb.append("=");
            sb.append(strD2);
        }
        return sb.toString();
    }

    public static String g(long j) {
        SecureRandom secureRandom = new SecureRandom();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeLong(secureRandom.nextLong());
            dataOutputStream.writeInt((int) (j / 60000));
            dataOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(r12.i(byteArrayOutputStream.toByteArray()));
    }

    public static String h(List<x0e> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (x0e x0eVar : list) {
            if (z) {
                z = false;
            } else {
                sb.append(gv5.CONNECT_STR);
            }
            try {
                sb.append(URLEncoder.encode(x0eVar.a(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(x0eVar.b(), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static String i(MiServiceTokenInfo miServiceTokenInfo) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(miServiceTokenInfo.c)) {
            sb.append("userId=");
            sb.append(miServiceTokenInfo.f12912b);
        } else {
            sb.append("cUserId=");
            sb.append(miServiceTokenInfo.c);
        }
        sb.append(";serviceToken=");
        sb.append(miServiceTokenInfo.d);
        return sb.toString();
    }

    public static String j(String str, List<x0e> list) {
        if (list == null || list.isEmpty()) {
            return str;
        }
        String strF = f(list, "UTF-8");
        if (str.contains("?")) {
            return str + gv5.CONNECT_STR + strF;
        }
        return str + "?" + strF;
    }

    public static void k(Context context, MiServiceTokenInfo miServiceTokenInfo, ikg ikgVar, wjg wjgVar) {
        xcp.a().execute(new a(context, miServiceTokenInfo, ikgVar, wjgVar));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public static void l(Context context, MiServiceTokenInfo miServiceTokenInfo, ikg ikgVar, wjg wjgVar) {
        String str;
        String str2 = null;
        try {
            Pair<List<x0e>, String> pairE = e(ikgVar.f21254a, ikgVar.f21255b, miServiceTokenInfo, ikgVar.c);
            if (pairE == null) {
                if (wjgVar != null) {
                    wjgVar.onFailed("encrypt failed");
                    return;
                }
                return;
            }
            String strJ = "https://api.io.mi.com/healthapp" + ikgVar.f21255b;
            if ("GET".equalsIgnoreCase(ikgVar.f21254a)) {
                strJ = j(strJ, (List) pairE.first);
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(strJ).openConnection();
            httpsURLConnection.setRequestMethod(ikgVar.f21254a);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpsURLConnection.setRequestProperty("User-agent", b5g.i(context));
            httpsURLConnection.setRequestProperty(NetConstants.COOKIE, i(miServiceTokenInfo));
            httpsURLConnection.setRequestProperty("MIOT-ENCRYPT-ALGORITHM", "ENCRYPT-RC4");
            httpsURLConnection.setRequestProperty("api-from-package-name", AppUtil.getApp().getPackageName());
            httpsURLConnection.setRequestProperty("api-from-app-key", "nHpalahdjYcHNAELZWZ8Jkgn4A6PDd");
            httpsURLConnection.connect();
            if ("POST".equalsIgnoreCase(ikgVar.f21254a)) {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpsURLConnection.getOutputStream(), "UTF-8"));
                bufferedWriter.write(h((List) pairE.first));
                bufferedWriter.close();
            }
            if (httpsURLConnection.getResponseCode() == 200) {
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb.append(line);
                    }
                }
                String strC = c(miServiceTokenInfo, sb.toString(), (String) pairE.second);
                str2 = strC;
                str = strC == null ? "decrypt failed" : null;
            } else {
                str = "response error code: " + httpsURLConnection.getResponseCode();
            }
            httpsURLConnection.disconnect();
            if (wjgVar != null) {
                if (TextUtils.isEmpty(str2)) {
                    wjgVar.onFailed(str);
                } else {
                    wjgVar.onSuccess(str2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            n2n.b("getMiServiceTokenInfo", e);
            str = "request exception: " + e.getMessage();
        }
    }
}
