package defpackage;

import com.miuipub.internal.hybrid.SignUtils;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.fitness.device.manager.provider.DeviceModelExtKt;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.Callback;
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
public class yhe implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gt3 f40180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f40181b;
    public byte[] c;
    public OkHttpClient d = new OkHttpClient();

    public class a implements Callback {
        public a() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            wpe.e("LiteCryptInterceptor", wpe.o(iOException));
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                if (!response.isSuccessful()) {
                    wpe.e("LiteCryptInterceptor", "refreshPublicKeyInfo: " + response + ", body=" + response.body().string());
                    throw new Exception(response.toString());
                }
                String strString = response.body().string();
                zsd tree = APIUtils.getObjectMapper().readTree(strString);
                if (tree.z("key_id") && tree.z("expire_at") && tree.z("public_key")) {
                    yhe.this.q(tree.T("public_key").l());
                    wpe.h("LiteCryptInterceptor", "new public key is valid");
                    yhe.this.f40180a.getListener().onWrite(yhe.this.f40180a, "pubkey_info", tree.toString());
                    return;
                }
                wpe.e("LiteCryptInterceptor", "refreshPublicKeyInfo: invalid body " + strString);
                throw new Exception("invalid body " + strString);
            } catch (Exception e) {
                wpe.e("LiteCryptInterceptor", wpe.o(e));
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f40183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40184b;

        public b(yhe yheVar) {
        }

        public /* synthetic */ b(yhe yheVar, a aVar) {
            this(yheVar);
        }
    }

    public yhe(gt3 gt3Var) {
        this.f40180a = gt3Var;
    }

    public final String b(String str) {
        return new String(l(2, l12.a(str, 8)), Charset.forName("UTF-8"));
    }

    public final String c(Request request) {
        String url = request.url().getUrl();
        int iIndexOf = url.indexOf(63);
        if (iIndexOf <= 0) {
            return url;
        }
        return url.substring(0, iIndexOf) + "?data=" + n(url.substring(iIndexOf + 1));
    }

    public final String d(RequestBody requestBody) throws IOException {
        if (requestBody == null) {
            return null;
        }
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return buffer.readUtf8();
    }

    public final String e(byte[] bArr) {
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

    public final Request g(Request request, String str) {
        RequestBody requestBodyBuild;
        byte[] bArr = this.f40181b.f40183a;
        Request.Builder builderAddHeader = request.newBuilder().url(c(request)).removeHeader(HTTP.DATE_HEADER).addHeader(HTTP.DATE_HEADER, str);
        String str2 = this.f40181b.f40184b;
        if (str2 == null) {
            builderAddHeader.addHeader("AIVS-Encryption-Key", m()).addHeader("AIVS-Encryption-CRC", e(bArr));
        } else {
            builderAddHeader.addHeader("AIVS-Encryption-Token", str2);
        }
        List<String> listHeaders = request.headers("Authorization");
        builderAddHeader.removeHeader("Authorization");
        Iterator<String> it = listHeaders.iterator();
        while (it.hasNext()) {
            builderAddHeader.addHeader("Authorization", n(it.next()));
        }
        if (request.method().equals("GET")) {
            builderAddHeader.get();
        } else if (request.method().equals("POST")) {
            RequestBody requestBodyBody = request.body();
            MediaType mediaType = requestBodyBody.getContentType();
            if ("application".equals(mediaType.type()) && "json".equals(mediaType.subtype())) {
                requestBodyBuild = RequestBody.create(mediaType, String.format("{ \"data\": \"%s\"}", n(d(requestBodyBody))));
            } else if (requestBodyBody instanceof FormBody) {
                FormBody.Builder builder = new FormBody.Builder();
                builder.add("data", n(d(requestBodyBody)));
                requestBodyBuild = builder.build();
            }
            builderAddHeader.post(requestBodyBuild);
        }
        return builderAddHeader.build();
    }

    public final Response h(Response response) {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            return response;
        }
        for (Cookie cookie : Cookie.parseAll(response.request().url(), response.headers())) {
            if (cookie.name().equals("AIVS-Encryption-Token")) {
                y(cookie.value(), cookie.expiresAt());
            }
        }
        if (!response.header("AIVS-Encryption-Body", "false").equals("true")) {
            return response;
        }
        return response.newBuilder().body(ResponseBody.create(responseBodyBody.get$contentType(), b(responseBodyBody.string()))).build();
    }

    public final byte[] i() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(UUID.randomUUID().toString().getBytes());
        keyGenerator.init(128, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        this.f40181b = p();
        String strT = t();
        this.c = o(strT.getBytes("UTF-8"));
        try {
            return h(chain.proceed(g(chain.request(), strT)));
        } catch (Exception e) {
            wpe.e("LiteCryptInterceptor", wpe.o(e));
            r();
            s();
            wpe.e("LiteCryptInterceptor", "clear all auth info");
            throw new IOException(e);
        }
    }

    public final byte[] j(byte[] bArr, Key key) {
        return k(bArr, key, true);
    }

    public final byte[] k(byte[] bArr, Key key, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        int i = z ? 1 : 2;
        Cipher cipher = Cipher.getInstance(SignUtils.CIPHER_RSA);
        cipher.init(i, key);
        return cipher.doFinal(bArr);
    }

    public byte[] l(int i, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, new SecretKeySpec(this.f40181b.f40183a, "AES"), new IvParameterSpec(this.c));
        return cipher.doFinal(bArr);
    }

    public final String m() {
        zsd zsdVarU = u();
        return "pubkeyid:" + zsdVarU.T("key_id").l() + ",key:" + l12.f(j(this.f40181b.f40183a, q(zsdVarU.T("public_key").l())), 10);
    }

    public final String n(String str) {
        return l12.f(l(1, str.getBytes(Charset.forName("UTF-8"))), 10);
    }

    public final byte[] o(byte[] bArr) {
        try {
            return MessageDigest.getInstance(Coder.KEY_MD5).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            wpe.e("LiteCryptInterceptor", wpe.o(e));
            return null;
        }
    }

    public final b p() {
        b bVar;
        synchronized ("aes_key_info") {
            try {
                bVar = new b(this, null);
                String strOnRead = this.f40180a.getListener().onRead(this.f40180a, "aes_key");
                String strOnRead2 = this.f40180a.getListener().onRead(this.f40180a, "aes_token");
                String strOnRead3 = this.f40180a.getListener().onRead(this.f40180a, "aes_expire_at");
                long j = yrs.b(strOnRead3) ? 0L : Long.parseLong(strOnRead3);
                if (strOnRead == null || (strOnRead2 != null && j - System.currentTimeMillis() < 10000)) {
                    wpe.h("LiteCryptInterceptor", "getCurrentAesKeyOrToken: expireAt=" + j + " , refresh aes key");
                    bVar.f40183a = i();
                    r();
                    this.f40180a.getListener().onWrite(this.f40180a, "aes_key", l12.f(bVar.f40183a, 0));
                } else {
                    wpe.h("LiteCryptInterceptor", "getCurrentAesKeyOrToken: expireAt=" + j + " , use cached aes key");
                    bVar.f40183a = l12.a(strOnRead, 0);
                    bVar.f40184b = strOnRead2;
                }
            } catch (Exception e) {
                wpe.e("LiteCryptInterceptor", wpe.o(e));
                throw new IOException(e.toString());
            }
        }
        return bVar;
    }

    public final PublicKey q(String str) {
        return KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(l12.a(str.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", "").replace("\n", ""), 0)));
    }

    public void r() {
        synchronized ("aes_key_info") {
            this.f40180a.getListener().onRemove(this.f40180a, "aes_key");
            this.f40180a.getListener().onRemove(this.f40180a, "aes_token");
            this.f40180a.getListener().onRemove(this.f40180a, "aes_expire_at");
        }
    }

    public void s() {
        synchronized ("pubkey_info") {
            this.f40180a.getListener().onRemove(this.f40180a, "pubkey_info");
        }
    }

    public final String t() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date());
    }

    public final zsd u() {
        zsd tree;
        synchronized ("pubkey_info") {
            try {
                String strOnRead = this.f40180a.getListener().onRead(this.f40180a, "pubkey_info");
                if (yrs.b(strOnRead)) {
                    tree = null;
                } else {
                    tree = APIUtils.getObjectMapper().readTree(strOnRead);
                    if (tree != null && tree.z("expire_at") && tree.z("public_key")) {
                        long j = tree.T("expire_at").j();
                        SecureRandom secureRandom = new SecureRandom();
                        secureRandom.setSeed(UUID.randomUUID().toString().getBytes());
                        long jNextInt = ((long) secureRandom.nextInt(DeviceModelExtKt.BATTERY_UPDATE_INTERVAL)) + 10000;
                        wpe.h("LiteCryptInterceptor", "getPubkeyInfo: expireAt:" + j + ", now:" + System.currentTimeMillis() + " , aheadTime:" + jNextInt);
                        if (j - System.currentTimeMillis() >= jNextInt) {
                            return tree;
                        }
                        wpe.k("LiteCryptInterceptor", "getPubkeyInfo: public key expired");
                    }
                }
                zsd zsdVarW = w();
                if (zsdVarW != null) {
                    return zsdVarW;
                }
                if (tree == null) {
                    throw new Exception("refreshPublicKeyInfo failed!");
                }
                wpe.k("LiteCryptInterceptor", "getPubkeyInfo: get public key failed, use expired key");
                return tree;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String v() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40180a.getAivsConfig().e("aivs.env") == 2 ? "http://account-staging.ai.xiaomi.com/ws/session/rsa/public" : "https://account.ai.xiaomi.com/ws/session/rsa/public");
        String strI = this.f40180a.getAivsConfig().i("auth.client_id");
        if (!this.f40180a.getClientInfo().getDeviceId().c()) {
            throw new IllegalArgumentException("device id not set");
        }
        String strB = this.f40180a.getClientInfo().getDeviceId().b();
        sb.append("?client_id=");
        sb.append(strI);
        sb.append("&key_length=2048&device_id=");
        sb.append(strB);
        return sb.toString();
    }

    public final zsd w() {
        wpe.h("LiteCryptInterceptor", "refreshPublicKeyInfo");
        this.d.newCall(new Request.Builder().url(v()).get().build()).enqueue(new a());
        try {
            return this.f40180a.getAivsConfig().e("aivs.env") == 2 ? APIUtils.getObjectMapper().readTree("{\"key_id\": \"iJne1qqnSWxYsjJq54vnKg==\",\"public_key\": \"-----BEGIN PUBLIC KEY-----\\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoHVeIxKvdR/x6jljxTrk\\nWEh1pAEj1ZQy1m+myMfxOeRMuYd9OTOE60UC79lx2qt5qmUZegBqVM3Oorcurzy7\\ndCVtWOJE8AuXrlRtMbGGeitpKD8pc3keOXJKEwZ/I47Ara/5isjYfZ0aWxBVyhYj\\nNXku/JT0VjzgYWAc5a1almaPSPG4WY76K8qSvJIvvB4nOC0YzEPtX2WPk7/cU8k9\\n91Wn0wK7n+0xVxhrSn00iNu8cvChXP6ePjL5869z2P5Gv3YONvSiDbcDlW+cxKZM\\nabaRLxqDH6zoiUE/3aTwb80M3QCuqBW1/857yv8QcA/C+JdHPwpZheOLj4rd8ST7\\nVQIDAQAB\\n-----END PUBLIC KEY-----\\n\"}") : APIUtils.getObjectMapper().readTree("{\"key_id\": \"CZWhJoB4ihbNyMcTTbWh/g==\",\"public_key\": \"-----BEGIN PUBLIC KEY-----\\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsca6B9KeE39zsuIuE+iH\\nXPR0QDjb7Tq0nBYP9USiWFfPE+ER1CwmIXPEHMpN2YumgzatonnScJJs3d1ZyuTH\\nlIpe6bjmQl7TaQGlMBhjKAhsSSFfIud62nW7UCNsBpqBaW4XmQ6DKUc9OorNA2ME\\ngsNtW9b9L8VFXfH0vrEH8gKjSwUOkBQNAg8H9vPh5bUY+JN/ELNsFDMMTzCxJy7K\\n+/o/bLvkOt137knMeR1kCNzBwcVZusnn3CsQ89+P4YU6AaE6MTDJqDOpud1MMwDH\\nnzXGHK3GFhp0uDjFdE374tOrNp/A8y8IYkfKNJoRA+mRQnvp+X6H79wj9/jIXxrn\\nHwIDAQAB\\n-----END PUBLIC KEY-----\\n\"}");
        } catch (IOException e) {
            wpe.e("LiteCryptInterceptor", wpe.o(e));
            return null;
        }
    }

    public Map<String, String> x(boolean z) {
        String str;
        HashMap map = new HashMap();
        String authHeader = this.f40180a.getAuthProvider().getAuthHeader(z, true, map);
        if (authHeader == null) {
            return null;
        }
        try {
            this.f40181b = p();
            String strT = t();
            map.put(HTTP.DATE_HEADER, strT);
            this.c = o(strT.getBytes("UTF-8"));
            b bVar = this.f40181b;
            byte[] bArr = bVar.f40183a;
            String strE = bVar.f40184b;
            if (strE == null) {
                strE = e(bArr);
                map.put("AIVS-Encryption-Key", m());
                str = "AIVS-Encryption-CRC";
            } else {
                str = "AIVS-Encryption-Token";
            }
            map.put(str, strE);
            map.put("Authorization", n(authHeader));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public void y(String str, long j) {
        synchronized ("aes_key_info") {
            wpe.h("LiteCryptInterceptor", "update aes token");
            this.f40180a.getListener().onWrite(this.f40180a, "aes_token", str);
            this.f40180a.getListener().onWrite(this.f40180a, "aes_expire_at", Long.toString(j));
        }
    }
}
