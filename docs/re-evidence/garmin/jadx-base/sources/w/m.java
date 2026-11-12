package w;

import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class m implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f180979a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Surface> f180980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Size f180981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f180982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f180983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f180984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f180985f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f180986g = 1;

        public a(Surface surface) {
            Size size;
            int iIntValue;
            int iIntValue2 = 0;
            k7.h.e(surface, "Surface must not be null");
            this.f180980a = Collections.singletonList(surface);
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                size = (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                size = null;
            }
            this.f180981b = size;
            try {
                iIntValue2 = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            this.f180982c = iIntValue2;
            try {
                iIntValue = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                iIntValue = -1;
            }
            this.f180983d = iIntValue;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                List<Surface> list = aVar.f180980a;
                if (this.f180981b.equals(aVar.f180981b) && this.f180982c == aVar.f180982c && this.f180983d == aVar.f180983d && this.f180985f == aVar.f180985f && this.f180986g == aVar.f180986g && Objects.equals(this.f180984e, aVar.f180984e)) {
                    List<Surface> list2 = this.f180980a;
                    int iMin = Math.min(list2.size(), list.size());
                    for (int i14 = 0; i14 < iMin; i14++) {
                        if (list2.get(i14) == list.get(i14)) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f180980a.hashCode() ^ 31;
            int i14 = this.f180983d ^ ((iHashCode << 5) - iHashCode);
            int iHashCode2 = this.f180981b.hashCode() ^ ((i14 << 5) - i14);
            int i15 = this.f180982c ^ ((iHashCode2 << 5) - iHashCode2);
            int i16 = (this.f180985f ? 1 : 0) ^ ((i15 << 5) - i15);
            int i17 = (i16 << 5) - i16;
            String str = this.f180984e;
            int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i17;
            return Long.hashCode(this.f180986g) ^ ((iHashCode3 << 5) - iHashCode3);
        }
    }

    public m(Surface surface) {
        this.f180979a = new a(surface);
    }

    @Override // w.h.a
    public void a(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!h()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // w.h.a
    public void b() {
        ((a) this.f180979a).f180985f = true;
    }

    @Override // w.h.a
    public void c(long j8) {
    }

    @Override // w.h.a
    public void d(String str) {
        ((a) this.f180979a).f180984e = str;
    }

    @Override // w.h.a
    public void e(long j8) {
        ((a) this.f180979a).f180986g = j8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return Objects.equals(this.f180979a, ((m) obj).f180979a);
    }

    @Override // w.h.a
    public void f(int i14) {
    }

    @Override // w.h.a
    public Object g() {
        return null;
    }

    @Override // w.h.a
    public Surface getSurface() {
        List<Surface> list = ((a) this.f180979a).f180980a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public boolean h() {
        return ((a) this.f180979a).f180985f;
    }

    public final int hashCode() {
        return this.f180979a.hashCode();
    }

    public m(Object obj) {
        this.f180979a = obj;
    }
}
