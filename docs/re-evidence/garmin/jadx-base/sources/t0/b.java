package t0;

import android.graphics.Rect;
import android.util.Size;
import j20.x;
import java.util.UUID;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f161616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f161619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f161620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f161621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f161622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f161623h;

    public b(UUID uuid, int i14, int i15, Rect rect, Size size, int i16, boolean z14, boolean z15) {
        if (uuid == null) {
            x.l("Null getUuid");
            throw null;
        }
        this.f161616a = uuid;
        this.f161617b = i14;
        this.f161618c = i15;
        if (rect == null) {
            x.l("Null getCropRect");
            throw null;
        }
        this.f161619d = rect;
        if (size == null) {
            x.l("Null getSize");
            throw null;
        }
        this.f161620e = size;
        this.f161621f = i16;
        this.f161622g = z14;
        this.f161623h = z15;
    }

    @Override // t0.f
    public final Rect a() {
        return this.f161619d;
    }

    @Override // t0.f
    public final int b() {
        return this.f161618c;
    }

    @Override // t0.f
    public final int c() {
        return this.f161621f;
    }

    @Override // t0.f
    public final Size d() {
        return this.f161620e;
    }

    @Override // t0.f
    public final int e() {
        return this.f161617b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f161616a.equals(fVar.f()) && this.f161617b == fVar.e() && this.f161618c == fVar.b() && this.f161619d.equals(fVar.a()) && this.f161620e.equals(fVar.d()) && this.f161621f == fVar.c() && this.f161622g == fVar.g() && this.f161623h == fVar.h();
    }

    @Override // t0.f
    public final UUID f() {
        return this.f161616a;
    }

    @Override // t0.f
    public final boolean g() {
        return this.f161622g;
    }

    @Override // t0.f
    public final boolean h() {
        return this.f161623h;
    }

    public final int hashCode() {
        return ((((((((((((((this.f161616a.hashCode() ^ 1000003) * 1000003) ^ this.f161617b) * 1000003) ^ this.f161618c) * 1000003) ^ this.f161619d.hashCode()) * 1000003) ^ this.f161620e.hashCode()) * 1000003) ^ this.f161621f) * 1000003) ^ (this.f161622g ? 1231 : 1237)) * 1000003) ^ (this.f161623h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OutConfig{getUuid=");
        sb3.append(this.f161616a);
        sb3.append(", getTargets=");
        sb3.append(this.f161617b);
        sb3.append(", getFormat=");
        sb3.append(this.f161618c);
        sb3.append(", getCropRect=");
        sb3.append(this.f161619d);
        sb3.append(", getSize=");
        sb3.append(this.f161620e);
        sb3.append(", getRotationDegrees=");
        sb3.append(this.f161621f);
        sb3.append(", isMirroring=");
        sb3.append(this.f161622g);
        sb3.append(", shouldRespectInputCropRect=");
        return hb.a.k(sb3, this.f161623h, StringSubstitutor.DEFAULT_VAR_END);
    }
}
