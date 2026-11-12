package w;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k extends j {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f180977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f180978b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f180977a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f180977a, aVar.f180977a) && this.f180978b == aVar.f180978b;
        }

        public final int hashCode() {
            int iHashCode = this.f180977a.hashCode() ^ 31;
            return Long.hashCode(this.f180978b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    public k(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    @Override // w.j, w.i, w.m, w.h.a
    public final void d(String str) {
        ((OutputConfiguration) g()).setPhysicalCameraId(str);
    }

    @Override // w.j, w.i, w.m, w.h.a
    public void e(long j8) {
        ((a) this.f180979a).f180978b = j8;
    }

    @Override // w.j, w.i, w.m, w.h.a
    public Object g() {
        Object obj = this.f180979a;
        k7.h.a(obj instanceof a);
        return ((a) obj).f180977a;
    }

    public k(int i14, Surface surface) {
        this(new a(new OutputConfiguration(i14, surface)));
    }

    public k(Object obj) {
        super(obj);
    }
}
