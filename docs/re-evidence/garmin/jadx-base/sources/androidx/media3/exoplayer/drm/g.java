package androidx.media3.exoplayer.drm;

import androidx.media3.common.l;
import ja.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    public interface b {
        g acquireExoMediaDrm(UUID uuid);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f8904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8905b;

        public c(byte[] bArr, String str) {
            this.f8904a = bArr;
            this.f8905b = str;
        }
    }

    void a(DefaultDrmSessionManager.c cVar);

    default void b(byte[] bArr, q qVar) {
    }

    void closeSession(byte[] bArr);

    la.c createCryptoConfig(byte[] bArr);

    int getCryptoType();

    a getKeyRequest(byte[] bArr, List<l.b> list, int i14, HashMap<String, String> map);

    c getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f8902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8903b;

        public a(byte[] bArr, String str, int i14) {
            this.f8902a = bArr;
            this.f8903b = str;
        }

        public a(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }
    }
}
