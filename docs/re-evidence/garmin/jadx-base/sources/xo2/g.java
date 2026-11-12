package xo2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vo2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxo2/g;", "", "", "commitId", "Lvo2/y;", "commitType", "apduResponseLink", "confirmLink", "credentialLink", "Lxo2/c;", "apduCommits", "Lxo2/f;", "creditCardCommits", "Lxo2/h;", "transitCardCommitsDto", "", "createdTs", "<init>", "(Ljava/lang/String;Lvo2/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxo2/c;Lxo2/f;Lxo2/h;Ljava/lang/Long;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f191808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f191809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f191810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f191811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f191812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f191813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f191814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f191815i;

    public /* synthetic */ g(String str, y yVar, String str2, String str3, String str4, c cVar, f fVar, h hVar, Long l14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : yVar, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : cVar, (i14 & 64) != 0 ? null : fVar, (i14 & 128) != 0 ? null : hVar, (i14 & 256) != 0 ? null : l14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f191807a, gVar.f191807a) && this.f191808b == gVar.f191808b && s.g(this.f191809c, gVar.f191809c) && s.g(this.f191810d, gVar.f191810d) && s.g(this.f191811e, gVar.f191811e) && s.g(this.f191812f, gVar.f191812f) && s.g(this.f191813g, gVar.f191813g) && s.g(this.f191814h, gVar.f191814h) && s.g(this.f191815i, gVar.f191815i);
    }

    public final int hashCode() {
        String str = this.f191807a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        y yVar = this.f191808b;
        int iHashCode2 = (iHashCode + (yVar == null ? 0 : yVar.hashCode())) * 31;
        String str2 = this.f191809c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f191810d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f191811e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        c cVar = this.f191812f;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        f fVar = this.f191813g;
        int iHashCode7 = (iHashCode6 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        h hVar = this.f191814h;
        int iHashCode8 = (iHashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Long l14 = this.f191815i;
        return iHashCode8 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceCommitsDto(commitId=");
        sb3.append(this.f191807a);
        sb3.append(", commitType=");
        sb3.append(this.f191808b);
        sb3.append(", apduResponseLink=");
        sn.a.t(sb3, this.f191809c, ", confirmLink=", this.f191810d, ", credentialLink=");
        sb3.append(this.f191811e);
        sb3.append(", apduCommits=");
        sb3.append(this.f191812f);
        sb3.append(", creditCardCommits=");
        sb3.append(this.f191813g);
        sb3.append(", transitCardCommitsDto=");
        sb3.append(this.f191814h);
        sb3.append(", createdTs=");
        return p6.b.g(sb3, this.f191815i, ")");
    }

    public g(String str, y yVar, String str2, String str3, String str4, c cVar, f fVar, h hVar, Long l14) {
        this.f191807a = str;
        this.f191808b = yVar;
        this.f191809c = str2;
        this.f191810d = str3;
        this.f191811e = str4;
        this.f191812f = cVar;
        this.f191813g = fVar;
        this.f191814h = hVar;
        this.f191815i = l14;
    }

    public g() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
