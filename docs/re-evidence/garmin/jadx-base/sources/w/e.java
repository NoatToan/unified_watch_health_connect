package w;

import android.hardware.camera2.params.DynamicRangeProfiles;
import b0.b0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f180964a;

    public e(Object obj) {
        this.f180964a = (DynamicRangeProfiles) obj;
    }

    public static Set<b0> d(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        for (Long l14 : set) {
            long jLongValue = l14.longValue();
            b0 b0Var = (b0) c.f180961a.get(l14);
            k7.h.e(b0Var, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(b0Var);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // w.d.a
    public final Set<b0> a() {
        return d(this.f180964a.getSupportedProfiles());
    }

    @Override // w.d.a
    public final Set<b0> b(b0 b0Var) {
        Long lA = c.a(b0Var, this.f180964a);
        k7.h.b(lA != null, "DynamicRange is not supported: " + b0Var);
        return d(this.f180964a.getProfileCaptureRequestConstraints(lA.longValue()));
    }

    @Override // w.d.a
    public final DynamicRangeProfiles c() {
        return this.f180964a;
    }
}
