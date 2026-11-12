package qj0;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\f\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqj0/d;", "", "", "title", "description", "Lqj0/b;", "Lqj0/f;", "media", "Lqj0/e;", "target", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqj0/b;Lqj0/b;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "Lqj0/b;", "()Lqj0/b;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("media")
    private final b<f> media;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("target")
    private final b<e> target;

    public d(String str, String str2, b<f> bVar, b<e> bVar2) {
        this.title = str;
        this.description = str2;
        this.media = bVar;
        this.target = bVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final b<f> b() {
        return this.media;
    }

    public final b<e> c() {
        return this.target;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.title, dVar.title) && s.g(this.description, dVar.description) && s.g(this.media, dVar.media) && s.g(this.target, dVar.target);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b<f> bVar = this.media;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b<e> bVar2 = this.target;
        return iHashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.description;
        b<f> bVar = this.media;
        b<e> bVar2 = this.target;
        StringBuilder sbI = p6.b.i("ContentfulFeatureEducationPageDTO(title=", str, ", description=", str2, ", media=");
        sbI.append(bVar);
        sbI.append(", target=");
        sbI.append(bVar2);
        sbI.append(")");
        return sbI.toString();
    }
}
