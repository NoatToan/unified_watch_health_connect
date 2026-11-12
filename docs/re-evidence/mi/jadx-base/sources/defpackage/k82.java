package defpackage;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k82 implements iqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<JWEAlgorithm> f23576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<EncryptionMethod> f23577b;
    public final hqd c = new hqd();

    public k82(Set<JWEAlgorithm> set, Set<EncryptionMethod> set2) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
        }
        this.f23576a = Collections.unmodifiableSet(set);
        if (set2 == null) {
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        this.f23577b = set2;
    }

    @Override // defpackage.iqd
    public Set<EncryptionMethod> a() {
        return this.f23577b;
    }

    @Override // defpackage.iqd
    public Set<JWEAlgorithm> c() {
        return this.f23576a;
    }

    public hqd e() {
        return this.c;
    }
}
