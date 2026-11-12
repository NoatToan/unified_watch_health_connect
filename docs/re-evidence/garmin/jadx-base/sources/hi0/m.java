package hi0;

import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lhi0/m;", "", "", "Lhi0/l;", "profileList", "", "originalKeyword", "effectiveKeyword", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getOriginalKeyword", "()Ljava/lang/String;", "c", "getEffectiveKeyword", "d", "Ljava/lang/Integer;", "getStart", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "getLimit", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileList")
    private final List<l> profileList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("originalKeyword")
    private final String originalKeyword;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("effectiveKeyword")
    private final String effectiveKeyword;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.START)
    private final Integer start;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(MapboxMap.QFE_LIMIT)
    private final Integer limit;

    public m(List<l> list, String str, String str2, Integer num, Integer num2) {
        this.profileList = list;
        this.originalKeyword = str;
        this.effectiveKeyword = str2;
        this.start = num;
        this.limit = num2;
    }

    public final List<l> a() {
        return this.profileList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.g(this.profileList, mVar.profileList) && s.g(this.originalKeyword, mVar.originalKeyword) && s.g(this.effectiveKeyword, mVar.effectiveKeyword) && s.g(this.start, mVar.start) && s.g(this.limit, mVar.limit);
    }

    public final int hashCode() {
        List<l> list = this.profileList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.originalKeyword;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.effectiveKeyword;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.start;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.limit;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        List<l> list = this.profileList;
        String str = this.originalKeyword;
        String str2 = this.effectiveKeyword;
        Integer num = this.start;
        Integer num2 = this.limit;
        StringBuilder sb3 = new StringBuilder("UserSearchResultV3DTO(profileList=");
        sb3.append(list);
        sb3.append(", originalKeyword=");
        sb3.append(str);
        sb3.append(", effectiveKeyword=");
        fb1.c.u(num, str2, ", start=", ", limit=", sb3);
        return f3.i(sb3, num2, ")");
    }
}
