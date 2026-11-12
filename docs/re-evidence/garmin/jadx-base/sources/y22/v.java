package y22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ly22/v;", "", "", "isSaving", "Ly22/f;", "addResult", "Ly22/i;", "deleteResult", "Ly22/y;", "reorderResult", "<init>", "(ZLy22/f;Ly22/i;Ly22/y;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f194319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f194320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f194321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f194322d;

    public /* synthetic */ v(boolean z14, f fVar, i iVar, y yVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : fVar, (i14 & 4) != 0 ? null : iVar, (i14 & 8) != 0 ? null : yVar);
    }

    public static v a(v vVar, boolean z14, f fVar, i iVar, y yVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = vVar.f194319a;
        }
        if ((i14 & 2) != 0) {
            fVar = vVar.f194320b;
        }
        if ((i14 & 4) != 0) {
            iVar = vVar.f194321c;
        }
        if ((i14 & 8) != 0) {
            yVar = vVar.f194322d;
        }
        vVar.getClass();
        return new v(z14, fVar, iVar, yVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f194319a == vVar.f194319a && p005kotlin.jvm.internal.s.g(this.f194320b, vVar.f194320b) && p005kotlin.jvm.internal.s.g(this.f194321c, vVar.f194321c) && p005kotlin.jvm.internal.s.g(this.f194322d, vVar.f194322d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f194319a) * 31;
        f fVar = this.f194320b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        i iVar = this.f194321c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        y yVar = this.f194322d;
        return iHashCode3 + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        return "ManagePhotosState(isSaving=" + this.f194319a + ", addResult=" + this.f194320b + ", deleteResult=" + this.f194321c + ", reorderResult=" + this.f194322d + ")";
    }

    public v(boolean z14, f fVar, i iVar, y yVar) {
        this.f194319a = z14;
        this.f194320b = fVar;
        this.f194321c = iVar;
        this.f194322d = yVar;
    }

    public v() {
        this(false, null, null, null, 15, null);
    }
}
