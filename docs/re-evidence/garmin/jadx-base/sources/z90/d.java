package z90;

import bd0.b0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz90/d;", "", "", "progressPercent", "", "complete", "Lbd0/b0;", "firmwareUpdateFailure", "<init>", "(FZLbd0/b0;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f203127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f203129c;

    public /* synthetic */ d(float f14, boolean z14, b0 b0Var, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0.0f : f14, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : b0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f203127a, dVar.f203127a) == 0 && this.f203128b == dVar.f203128b && this.f203129c == dVar.f203129c;
    }

    public final int hashCode() {
        int iG = f.g(Float.hashCode(this.f203127a) * 31, 31, this.f203128b);
        b0 b0Var = this.f203129c;
        return iG + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public final String toString() {
        return "OrcaFirmwareUpdateState(progressPercent=" + this.f203127a + ", complete=" + this.f203128b + ", firmwareUpdateFailure=" + this.f203129c + ")";
    }

    public d(float f14, boolean z14, b0 b0Var) {
        this.f203127a = f14;
        this.f203128b = z14;
        this.f203129c = b0Var;
    }

    public d() {
        this(0.0f, false, null, 7, null);
    }
}
