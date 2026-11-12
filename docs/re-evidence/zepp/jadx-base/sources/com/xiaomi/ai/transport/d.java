package com.xiaomi.ai.transport;

import com.alipay.sdk.m.p.e;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
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

/* JADX INFO: loaded from: classes18.dex */
public class d implements Interceptor {
    private com.xiaomi.ai.core.a a;
    private a b;
    private byte[] c;
    private OkHttpClient d = new OkHttpClient();

    public class a {
        public byte[] a;
        public String b;

        private a() {
        }
    }

    public d(com.xiaomi.ai.core.a aVar) {
        this.a = aVar;
    }

    private String a(Request request) {
        String string = request.url().toString();
        int iIndexOf = string.indexOf(63);
        if (iIndexOf <= 0) {
            return string;
        }
        return string.substring(0, iIndexOf) + "?data=" + b(string.substring(iIndexOf + 1));
    }

    private String a(RequestBody requestBody) throws IOException {
        if (requestBody == null) {
            return null;
        }
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return buffer.readUtf8();
    }

    private String a(byte[] bArr) {
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

    private PublicKey a(String str) {
        return KeyFactory.getInstance(com.alipay.sdk.m.n.d.a).generatePublic(new X509EncodedKeySpec(com.xiaomi.ai.b.a.a(str.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", "").replace("\n", ""), 0)));
    }

    private Request a(Request request, String str) {
        RequestBody requestBodyBuild;
        byte[] bArr = this.b.a;
        Request.Builder builderAddHeader = request.newBuilder().url(a(request)).removeHeader("Date").addHeader("Date", str);
        String str2 = this.b.b;
        if (str2 == null) {
            builderAddHeader.addHeader("AIVS-Encryption-Key", f()).addHeader("AIVS-Encryption-CRC", a(bArr));
        } else {
            builderAddHeader.addHeader("AIVS-Encryption-Token", str2);
        }
        List<String> listHeaders = request.headers("Authorization");
        builderAddHeader.removeHeader("Authorization");
        Iterator<String> it2 = listHeaders.iterator();
        while (it2.hasNext()) {
            builderAddHeader.addHeader("Authorization", b(it2.next()));
        }
        if (request.method().equals("GET")) {
            builderAddHeader.get();
        } else if (request.method().equals("POST")) {
            RequestBody requestBodyBody = request.body();
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (MimeTypes.BASE_TYPE_APPLICATION.equals(mediaTypeContentType.type()) && "json".equals(mediaTypeContentType.subtype())) {
                requestBodyBuild = RequestBody.create(mediaTypeContentType, String.format("{ \"data\": \"%s\"}", b(a(requestBodyBody))));
            } else if (requestBodyBody instanceof FormBody) {
                FormBody.Builder builder = new FormBody.Builder();
                builder.add("data", b(a(requestBodyBody)));
                requestBodyBuild = builder.build();
            }
            builderAddHeader.post(requestBodyBuild);
        }
        return builderAddHeader.build();
    }

    private Response a(Response response) {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            return response;
        }
        for (Cookie cookie : Cookie.parseAll(response.request().url(), response.headers())) {
            if (cookie.name().equals("AIVS-Encryption-Token")) {
                a(cookie.value(), cookie.expiresAt());
            }
        }
        if (!response.header("AIVS-Encryption-Body", "false").equals("true")) {
            return response;
        }
        return response.newBuilder().body(ResponseBody.create(responseBodyBody.contentType(), c(responseBodyBody.string()))).build();
    }

    private byte[] a(byte[] bArr, Key key) {
        return a(bArr, key, true);
    }

    private byte[] a(byte[] bArr, Key key, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        int i = z ? 1 : 2;
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(i, key);
        return cipher.doFinal(bArr);
    }

    private String b(String str) {
        return com.xiaomi.ai.b.a.b(a(1, str.getBytes(Charset.forName("UTF-8"))), 10);
    }

    private byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            Logger.d("LiteHttpCryptInterceptor", Logger.throwableToString(e));
            return null;
        }
    }

    private a c() {
        a aVar;
        synchronized ("http_aes_key_info") {
            try {
                try {
                    aVar = new a();
                    String strA = this.a.getListener().a(this.a, "http_aes_key");
                    String strA2 = this.a.getListener().a(this.a, "http_aes_token");
                    String strA3 = this.a.getListener().a(this.a, "http_aes_expire_at");
                    if (strA == null || (strA2 != null && (f.a(strA3) ? 0L : Long.parseLong(strA3)) - System.currentTimeMillis() < 10000)) {
                        aVar.a = i();
                        a();
                        this.a.getListener().a(this.a, "http_aes_key", com.xiaomi.ai.b.a.b(aVar.a, 0));
                    } else {
                        aVar.a = com.xiaomi.ai.b.a.a(strA, 0);
                        aVar.b = strA2;
                    }
                } catch (Exception e) {
                    Logger.d("LiteHttpCryptInterceptor", Logger.throwableToString(e));
                    throw new IOException(e.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private String c(String str) {
        return new String(a(2, com.xiaomi.ai.b.a.a(str, 8)), Charset.forName("UTF-8"));
    }

    private JsonNode d() {
        synchronized ("http_pubkey_info") {
            String strA = this.a.getListener().a(this.a, "http_pubkey_info");
            if (f.a(strA)) {
                return h();
            }
            JsonNode tree = APIUtils.getObjectMapper().readTree(strA);
            if (tree == null) {
                return h();
            }
            if (!tree.has("expire_at") || !tree.has(e.o)) {
                return h();
            }
            if (tree.path("expire_at").asLong() - System.currentTimeMillis() >= 10000) {
                return tree;
            }
            return h();
        }
    }

    private String e() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date());
    }

    private String f() {
        JsonNode jsonNodeD = d();
        return "pubkeyid:" + jsonNodeD.path("key_id").asText() + ",key:" + com.xiaomi.ai.b.a.b(a(this.b.a, a(jsonNodeD.path(e.o).asText())), 10);
    }

    private String g() {
        StringBuilder sb = new StringBuilder();
        int i = this.a.getAivsConfig().getInt(AivsConfig.ENV);
        if (i == 2) {
            sb.append("http://account-staging.ai.xiaomi.com/ws/session/rsa/public");
        } else {
            if (i != 1) {
            }
            sb.append("https://account.ai.xiaomi.com/ws/session/rsa/public");
        }
        String string = this.a.getAivsConfig().getString(AivsConfig.Auth.CLIENT_ID);
        if (!this.a.getClientInfo().getDeviceId().isPresent()) {
            throw new IllegalArgumentException("device id not set");
        }
        String str = this.a.getClientInfo().getDeviceId().get();
        sb.append("?client_id=");
        sb.append(string);
        sb.append("&key_length=2048&device_id=");
        sb.append(str);
        return sb.toString();
    }

    private JsonNode h() throws Exception {
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(this.d.newCall(new Request.Builder().url(g()).get().build()));
            if (!responseExecute.isSuccessful()) {
                Logger.d("LiteHttpCryptInterceptor", "refreshPublicKeyInfo: " + responseExecute + ", body=" + responseExecute.body().string());
                throw new Exception(responseExecute.toString());
            }
            String strString = responseExecute.body().string();
            JsonNode tree = APIUtils.getObjectMapper().readTree(strString);
            if (tree.has("key_id") && tree.has("expire_at") && tree.has(e.o)) {
                a(tree.path(e.o).asText());
                Logger.b("LiteHttpCryptInterceptor", "new public key is valid");
                this.a.getListener().a(this.a, "http_pubkey_info", tree.toString());
                return tree;
            }
            Logger.d("LiteHttpCryptInterceptor", "refreshPublicKeyInfo: invalid body " + strString);
            throw new Exception("invalid body " + strString);
        } catch (Exception e) {
            Logger.d("LiteHttpCryptInterceptor", Logger.throwableToString(e));
            throw e;
        }
    }

    private byte[] i() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(com.huami.network.hmnetwork.utils.a.a);
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(UUID.randomUUID().toString().getBytes());
        keyGenerator.init(128, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    public void a() {
        synchronized ("http_aes_key_info") {
            this.a.getListener().b(this.a, "http_aes_key");
            this.a.getListener().b(this.a, "http_aes_token");
            this.a.getListener().b(this.a, "http_aes_expire_at");
        }
    }

    public void a(String str, long j) {
        synchronized ("http_aes_key_info") {
            Logger.b("LiteHttpCryptInterceptor", "update aes token");
            this.a.getListener().a(this.a, "http_aes_token", str);
            this.a.getListener().a(this.a, "http_aes_expire_at", Long.toString(j));
        }
    }

    public byte[] a(int i, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, new SecretKeySpec(this.b.a, com.huami.network.hmnetwork.utils.a.a), new IvParameterSpec(this.c));
        return cipher.doFinal(bArr);
    }

    public void b() {
        synchronized ("http_pubkey_info") {
            this.a.getListener().b(this.a, "http_pubkey_info");
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        this.b = c();
        String strE = e();
        this.c = b(strE.getBytes("UTF-8"));
        try {
            return a(chain.proceed(a(chain.request(), strE)));
        } catch (Exception e) {
            Logger.d("LiteHttpCryptInterceptor", Logger.throwableToString(e));
            a();
            b();
            Logger.d("LiteHttpCryptInterceptor", "clear all auth info");
            throw new IOException(e);
        }
    }
}
