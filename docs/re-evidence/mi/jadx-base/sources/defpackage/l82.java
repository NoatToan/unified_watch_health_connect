package defpackage;

import com.nimbusds.jose.JWSAlgorithm;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l82 implements kqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<JWSAlgorithm> f24756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gpd f24757b = new gpd();

    public l82(Set<JWSAlgorithm> set) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
        }
        this.f24756a = Collections.unmodifiableSet(set);
    }

    @Override // defpackage.kqd
    public Set<JWSAlgorithm> c() {
        return this.f24756a;
    }

    public gpd d() {
        return this.f24757b;
    }
}
