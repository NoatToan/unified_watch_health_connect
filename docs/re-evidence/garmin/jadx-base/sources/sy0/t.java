package sy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsy0/t;", "", "", "fullName", "displayName", "Lb12/b;", "imageData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb12/b;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b12.b f161284c;

    public /* synthetic */ t(String str, String str2, b12.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f161282a, tVar.f161282a) && p005kotlin.jvm.internal.s.g(this.f161283b, tVar.f161283b) && p005kotlin.jvm.internal.s.g(this.f161284c, tVar.f161284c);
    }

    public final int hashCode() {
        String str = this.f161282a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f161283b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b12.b bVar = this.f161284c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("UserSocialProfileUiState(fullName=", this.f161282a, ", displayName=", this.f161283b, ", imageData=");
        sbI.append(this.f161284c);
        sbI.append(")");
        return sbI.toString();
    }

    public t(String str, String str2, b12.b bVar) {
        this.f161282a = str;
        this.f161283b = str2;
        this.f161284c = bVar;
    }

    public t() {
        this(null, null, null, 7, null);
    }
}
