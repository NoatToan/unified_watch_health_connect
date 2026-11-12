package w;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f180969a;

    public interface a {
        void a(Surface surface);

        void b();

        void c(long j8);

        void d(String str);

        void e(long j8);

        void f(int i14);

        Object g();

        Surface getSurface();
    }

    public <T> h(Size size, Class<T> cls) {
        OutputConfiguration outputConfiguration = new OutputConfiguration(size, cls);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f180969a = new l(outputConfiguration);
        } else {
            this.f180969a = new k(new k.a(outputConfiguration));
        }
    }

    public static h a(OutputConfiguration outputConfiguration) {
        if (outputConfiguration == null) {
            return null;
        }
        return new h(Build.VERSION.SDK_INT >= 33 ? new l(outputConfiguration) : new k(new k.a(outputConfiguration)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f180969a.equals(((h) obj).f180969a);
    }

    public final int hashCode() {
        return this.f180969a.hashCode();
    }

    public h(int i14, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f180969a = new l(i14, surface);
        } else {
            this.f180969a = new k(i14, surface);
        }
    }

    public h(Surface surface) {
        this(-1, surface);
    }

    public h(OutputConfiguration outputConfiguration) {
        this.f180969a = new l(outputConfiguration);
    }

    private h(a aVar) {
        this.f180969a = aVar;
    }
}
