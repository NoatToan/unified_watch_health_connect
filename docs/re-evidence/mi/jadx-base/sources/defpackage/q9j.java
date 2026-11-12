package defpackage;

import com.nimbusds.jose.JWSAlgorithm;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q9j extends l82 {
    public static final Set<JWSAlgorithm> c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.RS256);
        linkedHashSet.add(JWSAlgorithm.RS384);
        linkedHashSet.add(JWSAlgorithm.RS512);
        linkedHashSet.add(JWSAlgorithm.PS256);
        linkedHashSet.add(JWSAlgorithm.PS384);
        linkedHashSet.add(JWSAlgorithm.PS512);
        c = Collections.unmodifiableSet(linkedHashSet);
    }

    public q9j() {
        super(c);
    }
}
