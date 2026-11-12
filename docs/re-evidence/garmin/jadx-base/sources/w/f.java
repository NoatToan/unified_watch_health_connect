package w;

import android.hardware.camera2.params.DynamicRangeProfiles;
import b0.b0;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f180965a = new d(new f());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<b0> f180966b = Collections.singleton(b0.f13854d);

    @Override // w.d.a
    public final Set<b0> a() {
        return f180966b;
    }

    @Override // w.d.a
    public final Set<b0> b(b0 b0Var) {
        k7.h.b(b0.f13854d.equals(b0Var), "DynamicRange is not supported: " + b0Var);
        return f180966b;
    }

    @Override // w.d.a
    public final DynamicRangeProfiles c() {
        return null;
    }
}
