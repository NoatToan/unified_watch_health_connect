package r31;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr31/s;", "", "", "completed", "total", "", "ratio", "<init>", "(IIF)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f150089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f150091c;

    public s(int i14, int i15, float f14) {
        this.f150089a = i14;
        this.f150090b = i15;
        this.f150091c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f150089a == sVar.f150089a && this.f150090b == sVar.f150090b && Float.compare(this.f150091c, sVar.f150091c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f150091c) + q2.d(this.f150090b, Integer.hashCode(this.f150089a) * 31, 31);
    }

    public final String toString() {
        return e0.e(this.f150091c, ")", e5.j(this.f150089a, this.f150090b, "ProgressData(completed=", ", total=", ", ratio="));
    }
}
