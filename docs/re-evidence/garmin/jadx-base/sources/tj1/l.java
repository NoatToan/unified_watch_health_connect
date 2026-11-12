package tj1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Ltj1/l;", "", "", "name", "Ltj1/b;", "adminType", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ltj1/b;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ltj1/b;", "()Ltj1/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("localName")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adminType")
    private final b adminType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    public /* synthetic */ l(String str, b bVar, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAdminType() {
        return this.adminType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.name, lVar.name) && this.adminType == lVar.adminType && p005kotlin.jvm.internal.s.g(this.countryCode, lVar.countryCode);
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        b bVar = this.adminType;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.countryCode;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        b bVar = this.adminType;
        String str2 = this.countryCode;
        StringBuilder sb3 = new StringBuilder("GeoCode(name=");
        sb3.append(str);
        sb3.append(", adminType=");
        sb3.append(bVar);
        sb3.append(", countryCode=");
        return am.j.o(str2, ")", sb3);
    }

    public l(String str, b bVar, String str2) {
        str.getClass();
        this.name = str;
        this.adminType = bVar;
        this.countryCode = str2;
    }

    public l() {
        this(null, null, null, 7, null);
    }
}
