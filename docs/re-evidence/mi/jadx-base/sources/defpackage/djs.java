package defpackage;

import com.miuipub.internal.hybrid.SignUtils;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Cookie;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
public class djs implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gt3 f15600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f15601b;
    public byte[] c;
    public OkHttpClient d = new OkHttpClient();

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f15602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15603b;

        public b(djs djsVar) {
        }
    }

    public djs(gt3 gt3Var) {
        this.f15600a = gt3Var;
    }

    private String a(String str) {
        return new String(i(2, l12.a(str, 8)), Charset.forName("UTF-8"));
    }

    private String b(Request request) {
        String url = request.url().getUrl();
        int iIndexOf = url.indexOf(63);
        if (iIndexOf <= 0) {
            return url;
        }
        return url.substring(0, iIndexOf) + "?data=" + l(url.substring(iIndexOf + 1));
    }

    private String c(RequestBody requestBody) throws IOException {
        if (requestBody == null) {
            return null;
        }
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return buffer.readUtf8();
    }

    private String d(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        Formatter formatter = new Formatter();
        for (int i = 0; i < 4; i++) {
            formatter.format("%02x", Byte.valueOf((byte) value));
            value >>= 8;
        }
        return formatter.toString();
    }

    private Request e(Request request, String str) {
        RequestBody requestBodyBuild;
        byte[] bArr = this.f15601b.f15602a;
        Request.Builder builderAddHeader = request.newBuilder().url(b(request)).removeHeader(HTTP.DATE_HEADER).addHeader(HTTP.DATE_HEADER, str);
        String str2 = this.f15601b.f15603b;
        if (str2 == null) {
            builderAddHeader.addHeader("AIVS-Encryption-Key", q()).addHeader("AIVS-Encryption-CRC", d(bArr));
        } else {
            builderAddHeader.addHeader("AIVS-Encryption-Token", str2);
        }
        List<String> listHeaders = request.headers("Authorization");
        builderAddHeader.removeHeader("Authorization");
        Iterator<String> it = listHeaders.iterator();
        while (it.hasNext()) {
            builderAddHeader.addHeader("Authorization", l(it.next()));
        }
        if (request.method().equals("GET")) {
            builderAddHeader.get();
        } else if (request.method().equals("POST")) {
            RequestBody requestBodyBody = request.body();
            MediaType contentType = requestBodyBody.getContentType();
            if ("application".equals(contentType.type()) && "json".equals(contentType.subtype())) {
                requestBodyBuild = RequestBody.create(contentType, String.format("{ \"data\": \"%s\"}", l(c(requestBodyBody))));
            } else if (requestBodyBody instanceof FormBody) {
                FormBody.Builder builder = new FormBody.Builder();
                builder.add("data", l(c(requestBodyBody)));
                requestBodyBuild = builder.build();
            }
            builderAddHeader.post(requestBodyBuild);
        }
        return builderAddHeader.build();
    }

    private Response f(Response response) {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            return response;
        }
        for (Cookie cookie : Cookie.parseAll(response.request().url(), response.headers())) {
            if (cookie.name().equals("AIVS-Encryption-Token")) {
                h(cookie.value(), cookie.expiresAt());
            }
        }
        if (!response.header("AIVS-Encryption-Body", "false").equals("true")) {
            return response;
        }
        return response.newBuilder().body(ResponseBody.create(responseBodyBody.get$contentType(), a(responseBodyBody.string()))).build();
    }

    private byte[] j(byte[] bArr, Key key) {
        return k(bArr, key, true);
    }

    private byte[] k(byte[] bArr, Key key, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        int i = z ? 1 : 2;
        Cipher cipher = Cipher.getInstance(SignUtils.CIPHER_RSA);
        cipher.init(i, key);
        return cipher.doFinal(bArr);
    }

    private String l(String str) {
        return l12.f(i(1, str.getBytes(Charset.forName("UTF-8"))), 10);
    }

    private byte[] n(byte[] bArr) {
        try {
            return MessageDigest.getInstance(Coder.KEY_MD5).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            wpe.e("LiteHttpCryptInterceptor", wpe.o(e));
            return null;
        }
    }

    private PublicKey o(String str) {
        return KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(l12.a(str.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", "").replace("\n", ""), 0)));
    }

    private String q() {
        zsd zsdVarT = t();
        return "pubkeyid:" + zsdVarT.T("key_id").l() + ",key:" + l12.f(j(this.f15601b.f15602a, o(zsdVarT.T("public_key").l())), 10);
    }

    private String s() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date());
    }

    private zsd t() {
        synchronized ("http_pubkey_info") {
            try {
                String strOnRead = this.f15600a.getListener().onRead(this.f15600a, "http_pubkey_info");
                if (yrs.b(strOnRead)) {
                    return v();
                }
                zsd tree = APIUtils.getObjectMapper().readTree(strOnRead);
                if (tree == null) {
                    return v();
                }
                if (!tree.z("expire_at") || !tree.z("public_key")) {
                    return v();
                }
                if (tree.T("expire_at").j() - System.currentTimeMillis() >= 10000) {
                    return tree;
                }
                return v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g() {
        synchronized ("http_aes_key_info") {
            this.f15600a.getListener().onRemove(this.f15600a, "http_aes_key");
            this.f15600a.getListener().onRemove(this.f15600a, "http_aes_token");
            this.f15600a.getListener().onRemove(this.f15600a, "http_aes_expire_at");
        }
    }

    public void h(String str, long j) {
        synchronized ("http_aes_key_info") {
            wpe.h("LiteHttpCryptInterceptor", "update aes token");
            this.f15600a.getListener().onWrite(this.f15600a, "http_aes_token", str);
            this.f15600a.getListener().onWrite(this.f15600a, "http_aes_expire_at", Long.toString(j));
        }
    }

    public byte[] i(int i, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, new SecretKeySpec(this.f15601b.f15602a, "AES"), new IvParameterSpec(this.c));
        return cipher.doFinal(bArr);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        this.f15601b = r();
        String strS = s();
        this.c = n(strS.getBytes("UTF-8"));
        try {
            return f(chain.proceed(e(chain.request(), strS)));
        } catch (Exception e) {
            wpe.e("LiteHttpCryptInterceptor", wpe.o(e));
            g();
            m();
            wpe.e("LiteHttpCryptInterceptor", "clear all auth info");
            throw new IOException(e);
        }
    }

    public void m() {
        synchronized ("http_pubkey_info") {
            this.f15600a.getListener().onRemove(this.f15600a, "http_pubkey_info");
        }
    }

    public final byte[] p() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(UUID.randomUUID().toString().getBytes());
        keyGenerator.init(128, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    public final b r() {
        b bVar;
        synchronized ("http_aes_key_info") {
            try {
                try {
                    bVar = new b();
                    String strOnRead = this.f15600a.getListener().onRead(this.f15600a, "http_aes_key");
                    String strOnRead2 = this.f15600a.getListener().onRead(this.f15600a, "http_aes_token");
                    String strOnRead3 = this.f15600a.getListener().onRead(this.f15600a, "http_aes_expire_at");
                    long j = yrs.b(strOnRead3) ? 0L : Long.parseLong(strOnRead3);
                    if (strOnRead == null || (strOnRead2 != null && j - System.currentTimeMillis() < 10000)) {
                        bVar.f15602a = p();
                        g();
                        this.f15600a.getListener().onWrite(this.f15600a, "http_aes_key", l12.f(bVar.f15602a, 0));
                    } else {
                        bVar.f15602a = l12.a(strOnRead, 0);
                        bVar.f15603b = strOnRead2;
                    }
                } catch (Exception e) {
                    wpe.e("LiteHttpCryptInterceptor", wpe.o(e));
                    throw new IOException(e.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final String u() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15600a.getAivsConfig().e("aivs.env") == 2 ? "http://account-staging.ai.xiaomi.com/ws/session/rsa/public" : "https://account.ai.xiaomi.com/ws/session/rsa/public");
        String strI = this.f15600a.getAivsConfig().i("auth.client_id");
        if (!this.f15600a.getClientInfo().getDeviceId().c()) {
            throw new IllegalArgumentException("device id not set");
        }
        String strB = this.f15600a.getClientInfo().getDeviceId().b();
        sb.append("?client_id=");
        sb.append(strI);
        sb.append("&key_length=2048&device_id=");
        sb.append(strB);
        return sb.toString();
    }

    public final zsd v() throws Exception {
        try {
            Response responseExecute = this.d.newCall(new Request.Builder().url(u()).get().build()).execute();
            if (!responseExecute.isSuccessful()) {
                wpe.e("LiteHttpCryptInterceptor", "refreshPublicKeyInfo: " + responseExecute + ", body=" + responseExecute.body().string());
                throw new Exception(responseExecute.toString());
            }
            String strString = responseExecute.body().string();
            zsd tree = APIUtils.getObjectMapper().readTree(strString);
            if (tree.z("key_id") && tree.z("expire_at") && tree.z("public_key")) {
                o(tree.T("public_key").l());
                wpe.h("LiteHttpCryptInterceptor", "new public key is valid");
                this.f15600a.getListener().onWrite(this.f15600a, "http_pubkey_info", tree.toString());
                return tree;
            }
            wpe.e("LiteHttpCryptInterceptor", "refreshPublicKeyInfo: invalid body " + strString);
            throw new Exception("invalid body " + strString);
        } catch (Exception e) {
            wpe.e("LiteHttpCryptInterceptor", wpe.o(e));
            throw e;
        }
    }
}
