package defpackage;

import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyUse;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class p0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<KeyUse, Set<KeyOperation>> f29869a;

    static {
        HashMap map = new HashMap();
        map.put(KeyUse.SIGNATURE, new HashSet(Arrays.asList(KeyOperation.SIGN, KeyOperation.VERIFY)));
        map.put(KeyUse.ENCRYPTION, new HashSet(Arrays.asList(KeyOperation.ENCRYPT, KeyOperation.DECRYPT, KeyOperation.WRAP_KEY, KeyOperation.UNWRAP_KEY)));
        f29869a = Collections.unmodifiableMap(map);
    }

    public static boolean a(KeyUse keyUse, Set<KeyOperation> set) {
        if (keyUse == null || set == null) {
            return true;
        }
        return f29869a.get(keyUse).containsAll(set);
    }
}
