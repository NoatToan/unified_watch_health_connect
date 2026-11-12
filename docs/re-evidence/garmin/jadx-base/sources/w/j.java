package w;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j extends i {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f180974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f180975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f180976c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f180974a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f180974a, aVar.f180974a) && this.f180976c == aVar.f180976c && Objects.equals(this.f180975b, aVar.f180975b);
        }

        public final int hashCode() {
            int iHashCode = this.f180974a.hashCode() ^ 31;
            int i14 = (iHashCode << 5) - iHashCode;
            String str = this.f180975b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i14;
            return Long.hashCode(this.f180976c) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    public j(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    @Override // w.m, w.h.a
    public final void a(Surface surface) {
        ((OutputConfiguration) g()).addSurface(surface);
    }

    @Override // w.i, w.m, w.h.a
    public final void b() {
        ((OutputConfiguration) g()).enableSurfaceSharing();
    }

    @Override // w.i, w.m, w.h.a
    public void d(String str) {
        ((a) this.f180979a).f180975b = str;
    }

    @Override // w.i, w.m, w.h.a
    public void e(long j8) {
        ((a) this.f180979a).f180976c = j8;
    }

    @Override // w.i, w.m, w.h.a
    public Object g() {
        Object obj = this.f180979a;
        k7.h.a(obj instanceof a);
        return ((a) obj).f180974a;
    }

    @Override // w.i, w.m
    public final boolean h() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    public j(int i14, Surface surface) {
        this(new a(new OutputConfiguration(i14, surface)));
    }

    public j(Object obj) {
        super(obj);
    }
}
