package qj0;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R(\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqj0/a;", "", "", "imageAndroid", "title", "subtitle", "", "Lqj0/b;", "Lqj0/c;", "features", "Lqj0/k;", "legal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lqj0/b;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lqj0/b;", "()Lqj0/b;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageAndroid")
    private final String imageAndroid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("features")
    private final List<b<c>> features;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("legal")
    private final b<k> legal;

    public a(String str, String str2, String str3, List<b<c>> list, b<k> bVar) {
        this.imageAndroid = str;
        this.title = str2;
        this.subtitle = str3;
        this.features = list;
        this.legal = bVar;
    }

    public final List<b<c>> a() {
        return this.features;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageAndroid() {
        return this.imageAndroid;
    }

    public final b<k> c() {
        return this.legal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.imageAndroid, aVar.imageAndroid) && s.g(this.title, aVar.title) && s.g(this.subtitle, aVar.subtitle) && s.g(this.features, aVar.features) && s.g(this.legal, aVar.legal);
    }

    public final int hashCode() {
        String str = this.imageAndroid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<b<c>> list = this.features;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        b<k> bVar = this.legal;
        return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.imageAndroid;
        String str2 = this.title;
        String str3 = this.subtitle;
        List<b<c>> list = this.features;
        b<k> bVar = this.legal;
        StringBuilder sbI = p6.b.i("ContentfulEducationDTO(imageAndroid=", str, ", title=", str2, ", subtitle=");
        e0.o(str3, ", features=", ", legal=", sbI, list);
        sbI.append(bVar);
        sbI.append(")");
        return sbI.toString();
    }
}
