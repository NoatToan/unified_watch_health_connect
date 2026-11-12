package ko;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lko/e;", "", "", "lapIndex", "", "intervalKey", "rowTitle", "rowDescription", "intensityType", "", "isSelected", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f105711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f105712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f105713f;

    public e(int i14, String str, String str2, String str3, String str4, boolean z14) {
        kg.f.p(str, str2, str3, str4);
        this.f105708a = i14;
        this.f105709b = str;
        this.f105710c = str2;
        this.f105711d = str3;
        this.f105712e = str4;
        this.f105713f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f105708a == eVar.f105708a && s.g(this.f105709b, eVar.f105709b) && s.g(this.f105710c, eVar.f105710c) && s.g(this.f105711d, eVar.f105711d) && s.g(this.f105712e, eVar.f105712e) && this.f105713f == eVar.f105713f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105713f) + wr.g.j(wr.g.j(wr.g.j(wr.g.j(Integer.hashCode(this.f105708a) * 31, 31, this.f105709b), 31, this.f105710c), 31, this.f105711d), 31, this.f105712e);
    }

    public final String toString() {
        boolean z14 = this.f105713f;
        StringBuilder sbR = wr.g.r(this.f105708a, "IntervalRowUIModel(lapIndex=", ", intervalKey=", this.f105709b, ", rowTitle=");
        sn.a.t(sbR, this.f105710c, ", rowDescription=", this.f105711d, ", intensityType=");
        return am.j.n(this.f105712e, ", isSelected=", ")", sbR, z14);
    }

    public /* synthetic */ e(int i14, String str, String str2, String str3, String str4, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, str, str2, str3, str4, (i15 & 32) != 0 ? false : z14);
    }
}
