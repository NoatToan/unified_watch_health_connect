package pe0;

import android.net.Uri;
import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpe0/j;", "", "", "name", "Lpe0/d;", "primaryBreed", "Li53/c;", "secondaryBreeds", "Lje0/g;", "gender", "", "isNeutered", "", "weight", "birthdate", "birthdatePrecision", "excludeFromPhysioMetrics", "existingProfileImageUrl", "Landroid/net/Uri;", "pendingPhotoUri", "<init>", "(Ljava/lang/String;Lpe0/d;Li53/c;Lje0/g;Ljava/lang/Boolean;DLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Landroid/net/Uri;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f137452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<d> f137453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final je0.g f137454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f137455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f137456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f137457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f137458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f137459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f137460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f137461k;

    public j(String str, d dVar, i53.c cVar, je0.g gVar, Boolean bool, double d14, String str2, String str3, boolean z14, String str4, Uri uri, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? l.b() : cVar, (i14 & 8) != 0 ? je0.g.UNKNOWN : gVar, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? 0.0d : d14, (i14 & 64) != 0 ? "" : str2, (i14 & 128) == 0 ? str3 : "", (i14 & 256) != 0 ? true : z14, (i14 & 512) != 0 ? null : str4, (i14 & 1024) != 0 ? null : uri);
    }

    public static j a(j jVar, String str, d dVar, i53.c cVar, je0.g gVar, Boolean bool, double d14, String str2, String str3, boolean z14, String str4, Uri uri, int i14) {
        if ((i14 & 1) != 0) {
            str = jVar.f137451a;
        }
        String str5 = str;
        if ((i14 & 2) != 0) {
            dVar = jVar.f137452b;
        }
        d dVar2 = dVar;
        i53.c cVar2 = (i14 & 4) != 0 ? jVar.f137453c : cVar;
        je0.g gVar2 = (i14 & 8) != 0 ? jVar.f137454d : gVar;
        Boolean bool2 = (i14 & 16) != 0 ? jVar.f137455e : bool;
        double d15 = (i14 & 32) != 0 ? jVar.f137456f : d14;
        String str6 = (i14 & 64) != 0 ? jVar.f137457g : str2;
        String str7 = (i14 & 128) != 0 ? jVar.f137458h : str3;
        boolean z15 = (i14 & 256) != 0 ? jVar.f137459i : z14;
        String str8 = (i14 & 512) != 0 ? jVar.f137460j : str4;
        Uri uri2 = (i14 & 1024) != 0 ? jVar.f137461k : uri;
        jVar.getClass();
        str5.getClass();
        cVar2.getClass();
        str6.getClass();
        str7.getClass();
        return new j(str5, dVar2, cVar2, gVar2, bool2, d15, str6, str7, z15, str8, uri2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f137451a, jVar.f137451a) && s.g(this.f137452b, jVar.f137452b) && s.g(this.f137453c, jVar.f137453c) && this.f137454d == jVar.f137454d && s.g(this.f137455e, jVar.f137455e) && Double.compare(this.f137456f, jVar.f137456f) == 0 && s.g(this.f137457g, jVar.f137457g) && s.g(this.f137458h, jVar.f137458h) && this.f137459i == jVar.f137459i && s.g(this.f137460j, jVar.f137460j) && s.g(this.f137461k, jVar.f137461k);
    }

    public final int hashCode() {
        int iHashCode = this.f137451a.hashCode() * 31;
        d dVar = this.f137452b;
        int iA = l2.a(this.f137453c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        je0.g gVar = this.f137454d;
        int iHashCode2 = (iA + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.f137455e;
        int iG = q6.f.g(wr.g.j(wr.g.j(org.apache.commons.lang3.e.b((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f137456f), 31, this.f137457g), 31, this.f137458h), 31, this.f137459i);
        String str = this.f137460j;
        int iHashCode3 = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f137461k;
        return iHashCode3 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UpdateDogData(name=");
        sb3.append(this.f137451a);
        sb3.append(", primaryBreed=");
        sb3.append(this.f137452b);
        sb3.append(", secondaryBreeds=");
        sb3.append(this.f137453c);
        sb3.append(", gender=");
        sb3.append(this.f137454d);
        sb3.append(", isNeutered=");
        sb3.append(this.f137455e);
        sb3.append(", weight=");
        sb3.append(this.f137456f);
        sn.a.t(sb3, ", birthdate=", this.f137457g, ", birthdatePrecision=", this.f137458h);
        sb3.append(", excludeFromPhysioMetrics=");
        sb3.append(this.f137459i);
        sb3.append(", existingProfileImageUrl=");
        sb3.append(this.f137460j);
        sb3.append(", pendingPhotoUri=");
        sb3.append(this.f137461k);
        sb3.append(")");
        return sb3.toString();
    }

    public j(String str, d dVar, i53.c<d> cVar, je0.g gVar, Boolean bool, double d14, String str2, String str3, boolean z14, String str4, Uri uri) {
        str.getClass();
        cVar.getClass();
        str2.getClass();
        str3.getClass();
        this.f137451a = str;
        this.f137452b = dVar;
        this.f137453c = cVar;
        this.f137454d = gVar;
        this.f137455e = bool;
        this.f137456f = d14;
        this.f137457g = str2;
        this.f137458h = str3;
        this.f137459i = z14;
        this.f137460j = str4;
        this.f137461k = uri;
    }

    public j() {
        this(null, null, null, null, null, 0.0d, null, null, false, null, null, 2047, null);
    }
}
