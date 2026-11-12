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

/* JADX INFO: loaded from: classes18.dex */
public class LiteCryptInterceptor implements Interceptor {
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

    public LiteCryptInterceptor(com.xiaomi.ai.core.a aVar) {
        this.a = aVar;
    }

    private a a() {
        a aVar;
        synchronized ("aes_key_info") {
            try {
                try {
                    aVar = new a();
                    String strA = this.a.getListener().a(this.a, "aes_key");
                    String strA2 = this.a.getListener().a(this.a, "aes_token");
                    String strA3 = this.a.getListener().a(this.a, "aes_expire_at");
                    long j = f.a(strA3) ? 0L : Long.parseLong(strA3);
                    if (strA == null || (strA2 != null && j - System.currentTimeMillis() < 10000)) {
                        Logger.b("LiteCryptInterceptor", "getCurrentAesKeyOrToken: expireAt=" + j + " , refresh aes key");
                        aVar.a = g();
                        clearAes();
                        this.a.getListener().a(this.a, "aes_key", com.xiaomi.ai.b.a.b(aVar.a, 0));
                    } else {
                        Logger.b("LiteCryptInterceptor", "getCurrentAesKeyOrToken: expireAt=" + j + " , use cached aes key");
                        aVar.a = com.xiaomi.ai.b.a.a(strA, 0);
                        aVar.b = strA2;
                    }
                } catch (Exception e) {
                    Logger.d("LiteCryptInterceptor", Logger.throwableToString(e));
                    throw new IOException(e.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
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

    /* JADX INFO: Access modifiers changed from: private */
    public PublicKey a(String str) {
        return KeyFactory.getInstance(com.alipay.sdk.m.n.d.a).generatePublic(new X509EncodedKeySpec(com.xiaomi.ai.b.a.a(str.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", "").replace("\n", ""), 0)));
    }

    private Request a(Request request, String str) {
        RequestBody requestBodyBuild;
        byte[] bArr = this.b.a;
        Request.Builder builderAddHeader = request.newBuilder().url(a(request)).removeHeader("Date").addHeader("Date", str);
        String str2 = this.b.b;
        if (str2 == null) {
            builderAddHeader.addHeader("AIVS-Encryption-Key", d()).addHeader("AIVS-Encryption-CRC", a(bArr));
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
                updateAesToken(cookie.value(), cookie.expiresAt());
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

    private JsonNode b() {
        synchronized ("pubkey_info") {
            JsonNode tree = null;
            String strA = this.a.getListener().a(this.a, "pubkey_info");
            if (!f.a(strA) && (tree = APIUtils.getObjectMapper().readTree(strA)) != null && tree.has("expire_at") && tree.has(e.o)) {
                long jAsLong = tree.path("expire_at").asLong();
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.setSeed(UUID.randomUUID().toString().getBytes());
                long jNextInt = ((long) secureRandom.nextInt(1800000)) + 10000;
                Logger.b("LiteCryptInterceptor", "getPubkeyInfo: expireAt:" + jAsLong + ", now:" + System.currentTimeMillis() + " , aheadTime:" + jNextInt);
                if (jAsLong - System.currentTimeMillis() >= jNextInt) {
                    return tree;
                }
                Logger.c("LiteCryptInterceptor", "getPubkeyInfo: public key expired");
            }
            JsonNode jsonNodeF = f();
            if (jsonNodeF != null) {
                return jsonNodeF;
            }
            if (tree == null) {
                throw new Exception("refreshPublicKeyInfo failed!");
            }
            Logger.c("LiteCryptInterceptor", "getPubkeyInfo: get public key failed, use expired key");
            return tree;
        }
    }

    private String b(String str) {
        return com.xiaomi.ai.b.a.b(aesCrypt(1, str.getBytes(Charset.forName("UTF-8"))), 10);
    }

    private byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            Logger.d("LiteCryptInterceptor", Logger.throwableToString(e));
            return null;
        }
    }

    private String c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date());
    }

    private String c(String str) {
        return new String(aesCrypt(2, com.xiaomi.ai.b.a.a(str, 8)), Charset.forName("UTF-8"));
    }

    private String d() {
        JsonNode jsonNodeB = b();
        return "pubkeyid:" + jsonNodeB.path("key_id").asText() + ",key:" + com.xiaomi.ai.b.a.b(a(this.b.a, a(jsonNodeB.path(e.o).asText())), 10);
    }

    private String e() {
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

    private JsonNode f() {
        Logger.b("LiteCryptInterceptor", "refreshPublicKeyInfo");
        FirebasePerfOkHttpClient.enqueue(this.d.newCall(new Request.Builder().url(e()).get().build()), new Callback() { // from class: com.xiaomi.ai.transport.LiteCryptInterceptor.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                Logger.d("LiteCryptInterceptor", Logger.throwableToString(iOException));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                try {
                    if (!response.isSuccessful()) {
                        Logger.d("LiteCryptInterceptor", "refreshPublicKeyInfo: " + response + ", body=" + response.body().string());
                        throw new Exception(response.toString());
                    }
                    String strString = response.body().string();
                    JsonNode tree = APIUtils.getObjectMapper().readTree(strString);
                    if (tree.has("key_id") && tree.has("expire_at") && tree.has(e.o)) {
                        LiteCryptInterceptor.this.a(tree.path(e.o).asText());
                        Logger.b("LiteCryptInterceptor", "new public key is valid");
                        LiteCryptInterceptor.this.a.getListener().a(LiteCryptInterceptor.this.a, "pubkey_info", tree.toString());
                        return;
                    }
                    Logger.d("LiteCryptInterceptor", "refreshPublicKeyInfo: invalid body " + strString);
                    throw new Exception("invalid body " + strString);
                } catch (Exception e) {
                    Logger.d("LiteCryptInterceptor", Logger.throwableToString(e));
                }
            }
        });
        try {
            return this.a.getAivsConfig().getInt(AivsConfig.ENV) == 2 ? APIUtils.getObjectMapper().readTree("{\"key_id\": \"iJne1qqnSWxYsjJq54vnKg==\",\"public_key\": \"-----BEGIN PUBLIC KEY-----\\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoHVeIxKvdR/x6jljxTrk\\nWEh1pAEj1ZQy1m+myMfxOeRMuYd9OTOE60UC79lx2qt5qmUZegBqVM3Oorcurzy7\\ndCVtWOJE8AuXrlRtMbGGeitpKD8pc3keOXJKEwZ/I47Ara/5isjYfZ0aWxBVyhYj\\nNXku/JT0VjzgYWAc5a1almaPSPG4WY76K8qSvJIvvB4nOC0YzEPtX2WPk7/cU8k9\\n91Wn0wK7n+0xVxhrSn00iNu8cvChXP6ePjL5869z2P5Gv3YONvSiDbcDlW+cxKZM\\nabaRLxqDH6zoiUE/3aTwb80M3QCuqBW1/857yv8QcA/C+JdHPwpZheOLj4rd8ST7\\nVQIDAQAB\\n-----END PUBLIC KEY-----\\n\"}") : APIUtils.getObjectMapper().readTree("{\"key_id\": \"CZWhJoB4ihbNyMcTTbWh/g==\",\"public_key\": \"-----BEGIN PUBLIC KEY-----\\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsca6B9KeE39zsuIuE+iH\\nXPR0QDjb7Tq0nBYP9USiWFfPE+ER1CwmIXPEHMpN2YumgzatonnScJJs3d1ZyuTH\\nlIpe6bjmQl7TaQGlMBhjKAhsSSFfIud62nW7UCNsBpqBaW4XmQ6DKUc9OorNA2ME\\ngsNtW9b9L8VFXfH0vrEH8gKjSwUOkBQNAg8H9vPh5bUY+JN/ELNsFDMMTzCxJy7K\\n+/o/bLvkOt137knMeR1kCNzBwcVZusnn3CsQ89+P4YU6AaE6MTDJqDOpud1MMwDH\\nnzXGHK3GFhp0uDjFdE374tOrNp/A8y8IYkfKNJoRA+mRQnvp+X6H79wj9/jIXxrn\\nHwIDAQAB\\n-----END PUBLIC KEY-----\\n\"}");
        } catch (IOException e) {
            Logger.d("LiteCryptInterceptor", Logger.throwableToString(e));
            return null;
        }
    }

    private byte[] g() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(com.huami.network.hmnetwork.utils.a.a);
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(UUID.randomUUID().toString().getBytes());
        keyGenerator.init(128, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    public byte[] aesCrypt(int i, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, new SecretKeySpec(this.b.a, com.huami.network.hmnetwork.utils.a.a), new IvParameterSpec(this.c));
        return cipher.doFinal(bArr);
    }

    public void clearAes() {
        synchronized ("aes_key_info") {
            this.a.getListener().b(this.a, "aes_key");
            this.a.getListener().b(this.a, "aes_token");
            this.a.getListener().b(this.a, "aes_expire_at");
        }
    }

    public void clearPubkey() {
        synchronized ("pubkey_info") {
            this.a.getListener().b(this.a, "pubkey_info");
        }
    }

    public Map<String, String> getAuthHeaders(boolean z) {
        String str;
        HashMap map = new HashMap();
        String strA = this.a.getAuthProvider().a(z, true, (Map<String, String>) map);
        if (strA == null) {
            return null;
        }
        try {
            this.b = a();
            String strC = c();
            map.put("Date", strC);
            this.c = b(strC.getBytes("UTF-8"));
            a aVar = this.b;
            byte[] bArr = aVar.a;
            String strA2 = aVar.b;
            if (strA2 == null) {
                strA2 = a(bArr);
                map.put("AIVS-Encryption-Key", d());
                str = "AIVS-Encryption-CRC";
            } else {
                str = "AIVS-Encryption-Token";
            }
            map.put(str, strA2);
            map.put("Authorization", b(strA));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        this.b = a();
        String strC = c();
        this.c = b(strC.getBytes("UTF-8"));
        try {
            return a(chain.proceed(a(chain.request(), strC)));
        } catch (Exception e) {
            Logger.d("LiteCryptInterceptor", Logger.throwableToString(e));
            clearAes();
            clearPubkey();
            Logger.d("LiteCryptInterceptor", "clear all auth info");
            throw new IOException(e);
        }
    }

    public void updateAesToken(String str, long j) {
        synchronized ("aes_key_info") {
            Logger.b("LiteCryptInterceptor", "update aes token");
            this.a.getListener().a(this.a, "aes_token", str);
            this.a.getListener().a(this.a, "aes_expire_at", Long.toString(j));
        }
    }
}
