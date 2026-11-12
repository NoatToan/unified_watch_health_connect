package w;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i extends m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f180970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f180971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f180972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f180973d = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f180970a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f180970a, aVar.f180970a) && this.f180972c == aVar.f180972c && this.f180973d == aVar.f180973d && Objects.equals(this.f180971b, aVar.f180971b);
        }

        public final int hashCode() {
            int iHashCode = this.f180970a.hashCode() ^ 31;
            int i14 = (this.f180972c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i15 = (i14 << 5) - i14;
            String str = this.f180971b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i15;
            return Long.hashCode(this.f180973d) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    public i(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    @Override // w.m, w.h.a
    public void b() {
        ((a) this.f180979a).f180972c = true;
    }

    @Override // w.m, w.h.a
    public void d(String str) {
        ((a) this.f180979a).f180971b = str;
    }

    @Override // w.m, w.h.a
    public void e(long j8) {
        ((a) this.f180979a).f180973d = j8;
    }

    @Override // w.m, w.h.a
    public Object g() {
        Object obj = this.f180979a;
        k7.h.a(obj instanceof a);
        return ((a) obj).f180970a;
    }

    @Override // w.m, w.h.a
    public final Surface getSurface() {
        return ((OutputConfiguration) g()).getSurface();
    }

    @Override // w.m
    public boolean h() {
        return ((a) this.f180979a).f180972c;
    }

    public i(int i14, Surface surface) {
        this(new a(new OutputConfiguration(i14, surface)));
    }

    public i(Object obj) {
        super(obj);
    }
}
