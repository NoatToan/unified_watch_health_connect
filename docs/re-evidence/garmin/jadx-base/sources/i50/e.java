package i50;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li50/e;", "", "", "imageRes", "", "title", "subtitle", "description", "", "showCreateButton", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f91736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f91737e;

    public e(int i14, String str, String str2, String str3, boolean z14) {
        str.getClass();
        this.f91733a = i14;
        this.f91734b = str;
        this.f91735c = str2;
        this.f91736d = str3;
        this.f91737e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f91733a == eVar.f91733a && this.f91734b.equals(eVar.f91734b) && s.g(this.f91735c, eVar.f91735c) && s.g(this.f91736d, eVar.f91736d) && this.f91737e == eVar.f91737e;
    }

    public final int hashCode() {
        int iJ = wr.g.j(Integer.hashCode(this.f91733a) * 31, 31, this.f91734b);
        String str = this.f91735c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f91736d;
        return Boolean.hashCode(this.f91737e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f91733a, "CoursesGenesisUiState(imageRes=", ", title=", this.f91734b, ", subtitle=");
        sn.a.t(sbR, this.f91735c, ", description=", this.f91736d, ", showCreateButton=");
        return hb.a.k(sbR, this.f91737e, ")");
    }
}
