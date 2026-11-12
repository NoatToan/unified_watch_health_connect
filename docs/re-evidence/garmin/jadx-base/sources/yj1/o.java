package yj1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyj1/o;", "", "", "isLoading", "Lyj1/d;", "deviceSection", "Lyj1/j;", "myInformation", "Lyj1/a;", "assistanceContacts", "<init>", "(ZLyj1/d;Lyj1/j;Lyj1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f197574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f197575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f197576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f197577d;

    public /* synthetic */ o(boolean z14, d dVar, j jVar, a aVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? new j(false, false, 3, null) : jVar, (i14 & 8) != 0 ? new a(null, false, 3, null) : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f197574a == oVar.f197574a && s.g(this.f197575b, oVar.f197575b) && s.g(this.f197576c, oVar.f197576c) && s.g(this.f197577d, oVar.f197577d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f197574a) * 31;
        d dVar = this.f197575b;
        return this.f197577d.hashCode() + ((this.f197576c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SafetyFeaturesUiState(isLoading=" + this.f197574a + ", deviceSection=" + this.f197575b + ", myInformation=" + this.f197576c + ", assistanceContacts=" + this.f197577d + ")";
    }

    public o(boolean z14, d dVar, j jVar, a aVar) {
        jVar.getClass();
        aVar.getClass();
        this.f197574a = z14;
        this.f197575b = dVar;
        this.f197576c = jVar;
        this.f197577d = aVar;
    }

    public o() {
        this(false, null, null, null, 15, null);
    }
}
