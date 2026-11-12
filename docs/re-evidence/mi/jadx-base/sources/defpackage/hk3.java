package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.p;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@dj8
public class hk3 implements p {
    public final Config z;

    @RequiresApi(21)
    public static final class a implements zj8<hk3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f20154a = m.O();

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static a e(final Config config) {
            final a aVar = new a();
            config.b("camera2.captureRequest.option.", new Config.b() { // from class: gk3
                @Override // androidx.camera.core.impl.Config.b
                public final boolean a(Config.a aVar2) {
                    return hk3.a.f(this.f19073a, config, aVar2);
                }
            });
            return aVar;
        }

        public static /* synthetic */ boolean f(a aVar, Config config, Config.a aVar2) {
            aVar.a().o(aVar2, config.i(aVar2), config.a(aVar2));
            return true;
        }

        @Override // defpackage.zj8
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public l a() {
            return this.f20154a;
        }

        public hk3 d() {
            return new hk3(n.M(this.f20154a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a g(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f20154a.z(pe3.K(key), valuet);
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public hk3(Config config) {
        this.z = config;
    }

    @Override // androidx.camera.core.impl.p
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Config e() {
        return this.z;
    }
}
