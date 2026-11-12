package com.huami.ednetwork;

import com.huami.ednetwork.apiImpl.HmEncryptionDecryptionApiImpl;
import com.huami.ednetwork.interceptor.RequestEncryptInterceptor;
import com.huami.ednetwork.interceptor.ResponseDecryptInterceptor;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0007R\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/ednetwork/HttpClientCryptoProxy;", "", "", "path", "", "isPathInHmCrypto", "", "byteArray", "encrypt", "success", "decrypt", "", "getHeaders", "Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "a", "Lkotlin/Lazy;", "()Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "hmEncryptionDecryptionApiImpl", "<init>", "()V", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
public final class HttpClientCryptoProxy {
    public static final HttpClientCryptoProxy INSTANCE = new HttpClientCryptoProxy();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Lazy hmEncryptionDecryptionApiImpl = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "a", "()Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<HmEncryptionDecryptionApiImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HmEncryptionDecryptionApiImpl invoke() {
            return new HmEncryptionDecryptionApiImpl();
        }
    }

    private HttpClientCryptoProxy() {
    }

    private final HmEncryptionDecryptionApiImpl a() {
        return (HmEncryptionDecryptionApiImpl) hmEncryptionDecryptionApiImpl.getValue();
    }

    @JvmStatic
    @NotNull
    public static final byte[] decrypt(boolean success, @NotNull byte[] byteArray) {
        if (byteArray.length == 0) {
            return byteArray;
        }
        HttpClientCryptoProxy httpClientCryptoProxy = INSTANCE;
        byte[] data = httpClientCryptoProxy.a().wbDecryption(byteArray).getData();
        if (data != null) {
            if (!(data.length == 0)) {
                ResponseDecryptInterceptor.INSTANCE.updateWhiteBoxKey(success, new String(data, Charsets.UTF_8), httpClientCryptoProxy.a());
                return data;
            }
        }
        throw new IllegalStateException("decrypted data is empty");
    }

    @JvmStatic
    @NotNull
    public static final byte[] encrypt(@NotNull byte[] byteArray) {
        if (byteArray.length == 0) {
            throw new IllegalStateException("byte array is empty");
        }
        byte[] data = INSTANCE.a().wbEncryption(byteArray).getData();
        if (data != null) {
            if (!(data.length == 0)) {
                return data;
            }
        }
        throw new IllegalStateException("encrypted data is empty");
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> getHeaders() {
        return q.mapOf(TuplesKt.to(RequestEncryptInterceptor.HM_KEY, HmKeyManager.INSTANCE.getHmKv()));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[RETURN, SYNTHETIC] */
    @JvmStatic
    public static final boolean isPathInHmCrypto(@NotNull String path) {
        EdNetWorkWhitePath edNetWorkWhitePath = EdNetWorkWhitePath.INSTANCE;
        if (!edNetWorkWhitePath.getHmWhitePath().contains(path)) {
            for (Object obj : edNetWorkWhitePath.getHmRegexWhitePath()) {
                if (new Regex((String) obj).matches(path)) {
                    if (obj != null) {
                        return false;
                    }
                }
            }
            obj = null;
            if (obj != null) {
                return false;
            }
        }
        return true;
    }
}
