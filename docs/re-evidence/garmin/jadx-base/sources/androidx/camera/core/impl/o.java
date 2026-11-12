package androidx.camera.core.impl;

import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class o extends l2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeferrableSurface f5653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<DeferrableSurface> f5654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0.b0 f5658f;

    public static final class b extends l2.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DeferrableSurface f5659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<DeferrableSurface> f5660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f5661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f5662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b0.b0 f5663e;

        public final o a() {
            String strConcat = this.f5659a == null ? " surface" : "";
            if (this.f5660b == null) {
                strConcat = strConcat.concat(" sharedSurfaces");
            }
            if (this.f5661c == null) {
                strConcat = strConcat.concat(" mirrorMode");
            }
            if (this.f5662d == null) {
                strConcat = strConcat.concat(" surfaceGroupId");
            }
            if (this.f5663e == null) {
                strConcat = strConcat.concat(" dynamicRange");
            }
            if (strConcat.isEmpty()) {
                return new o(this.f5659a, this.f5660b, null, this.f5661c.intValue(), this.f5662d.intValue(), this.f5663e);
            }
            vb.h.z("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    private o(DeferrableSurface deferrableSurface, List<DeferrableSurface> list, String str, int i14, int i15, b0.b0 b0Var) {
        this.f5653a = deferrableSurface;
        this.f5654b = list;
        this.f5655c = str;
        this.f5656d = i14;
        this.f5657e = i15;
        this.f5658f = b0Var;
    }

    @Override // androidx.camera.core.impl.l2.f
    public final b0.b0 b() {
        return this.f5658f;
    }

    @Override // androidx.camera.core.impl.l2.f
    public final int c() {
        return this.f5656d;
    }

    @Override // androidx.camera.core.impl.l2.f
    public final String d() {
        return this.f5655c;
    }

    @Override // androidx.camera.core.impl.l2.f
    public final List<DeferrableSurface> e() {
        return this.f5654b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l2.f)) {
            return false;
        }
        l2.f fVar = (l2.f) obj;
        if (!this.f5653a.equals(fVar.f()) || !this.f5654b.equals(fVar.e())) {
            return false;
        }
        String str = this.f5655c;
        if (str == null) {
            if (fVar.d() != null) {
                return false;
            }
        } else if (!str.equals(fVar.d())) {
            return false;
        }
        return this.f5656d == fVar.c() && this.f5657e == fVar.g() && this.f5658f.equals(fVar.b());
    }

    @Override // androidx.camera.core.impl.l2.f
    public final DeferrableSurface f() {
        return this.f5653a;
    }

    @Override // androidx.camera.core.impl.l2.f
    public final int g() {
        return this.f5657e;
    }

    public final int hashCode() {
        int iHashCode = (((this.f5653a.hashCode() ^ 1000003) * 1000003) ^ this.f5654b.hashCode()) * 1000003;
        String str = this.f5655c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f5656d) * 1000003) ^ this.f5657e) * 1000003) ^ this.f5658f.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f5653a + ", sharedSurfaces=" + this.f5654b + ", physicalCameraId=" + this.f5655c + ", mirrorMode=" + this.f5656d + ", surfaceGroupId=" + this.f5657e + ", dynamicRange=" + this.f5658f + StringSubstitutor.DEFAULT_VAR_END;
    }
}
