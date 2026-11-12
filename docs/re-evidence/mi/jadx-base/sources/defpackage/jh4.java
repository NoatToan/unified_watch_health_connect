package defpackage;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class jh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<EncryptionMethod> f22794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Set<EncryptionMethod>> f22795b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EncryptionMethod encryptionMethod = EncryptionMethod.A128CBC_HS256;
        linkedHashSet.add(encryptionMethod);
        EncryptionMethod encryptionMethod2 = EncryptionMethod.A192CBC_HS384;
        linkedHashSet.add(encryptionMethod2);
        EncryptionMethod encryptionMethod3 = EncryptionMethod.A256CBC_HS512;
        linkedHashSet.add(encryptionMethod3);
        EncryptionMethod encryptionMethod4 = EncryptionMethod.A128GCM;
        linkedHashSet.add(encryptionMethod4);
        EncryptionMethod encryptionMethod5 = EncryptionMethod.A192GCM;
        linkedHashSet.add(encryptionMethod5);
        EncryptionMethod encryptionMethod6 = EncryptionMethod.A256GCM;
        linkedHashSet.add(encryptionMethod6);
        EncryptionMethod encryptionMethod7 = EncryptionMethod.A128CBC_HS256_DEPRECATED;
        linkedHashSet.add(encryptionMethod7);
        EncryptionMethod encryptionMethod8 = EncryptionMethod.A256CBC_HS512_DEPRECATED;
        linkedHashSet.add(encryptionMethod8);
        f22794a = Collections.unmodifiableSet(linkedHashSet);
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(encryptionMethod4);
        hashSet2.add(encryptionMethod5);
        hashSet3.add(encryptionMethod6);
        hashSet3.add(encryptionMethod);
        hashSet3.add(encryptionMethod7);
        hashSet4.add(encryptionMethod2);
        hashSet5.add(encryptionMethod3);
        hashSet5.add(encryptionMethod8);
        map.put(128, Collections.unmodifiableSet(hashSet));
        map.put(192, Collections.unmodifiableSet(hashSet2));
        map.put(256, Collections.unmodifiableSet(hashSet3));
        map.put(384, Collections.unmodifiableSet(hashSet4));
        map.put(512, Collections.unmodifiableSet(hashSet5));
        f22795b = Collections.unmodifiableMap(map);
    }

    public static SecretKey a(EncryptionMethod encryptionMethod, SecureRandom secureRandom) throws JOSEException {
        Set<EncryptionMethod> set = f22794a;
        if (!set.contains(encryptionMethod)) {
            throw new JOSEException(x51.b(encryptionMethod, set));
        }
        byte[] bArr = new byte[y73.c(encryptionMethod.cekBitLength())];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }
}
