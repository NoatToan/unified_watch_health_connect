package uq;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luq/h;", "", "Luq/i;", "metric", "", "isEditable", "<init>", "(Luq/i;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f172205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f172206b;

    public h(i iVar, boolean z14) {
        iVar.getClass();
        this.f172205a = iVar;
        this.f172206b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f172205a == hVar.f172205a && this.f172206b == hVar.f172206b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172206b) + (this.f172205a.hashCode() * 31);
    }

    public final String toString() {
        return "SplitColumn(metric=" + this.f172205a + ", isEditable=" + this.f172206b + ")";
    }

    public /* synthetic */ h(i iVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(iVar, (i14 & 2) != 0 ? false : z14);
    }
}
