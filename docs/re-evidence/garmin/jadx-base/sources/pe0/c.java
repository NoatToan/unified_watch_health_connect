package pe0;

import android.net.Uri;
import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpe0/c;", "", "", "name", "Lpe0/d;", "primaryBreed", "Li53/c;", "secondaryBreeds", "gender", "", "isNeutered", "", "weight", "birthdate", "birthdatePrecision", "excludeFromPhysioMetrics", "Landroid/net/Uri;", "photoUri", "<init>", "(Ljava/lang/String;Lpe0/d;Li53/c;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f137407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<d> f137408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f137409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f137410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f137411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f137412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f137413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f137414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f137415j;

    public c(String str, d dVar, i53.c cVar, String str2, Boolean bool, double d14, String str3, String str4, boolean z14, Uri uri, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? l.b() : cVar, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? 0.0d : d14, (i14 & 64) != 0 ? "" : str3, (i14 & 128) != 0 ? "" : str4, (i14 & 256) != 0 ? true : z14, (i14 & 512) != 0 ? null : uri);
    }

    public static c a(c cVar, String str, d dVar, i53.c cVar2, String str2, Boolean bool, double d14, String str3, String str4, boolean z14, Uri uri, int i14) {
        if ((i14 & 1) != 0) {
            str = cVar.f137406a;
        }
        String str5 = str;
        if ((i14 & 2) != 0) {
            dVar = cVar.f137407b;
        }
        d dVar2 = dVar;
        if ((i14 & 4) != 0) {
            cVar2 = cVar.f137408c;
        }
        i53.c cVar3 = cVar2;
        String str6 = (i14 & 8) != 0 ? cVar.f137409d : str2;
        Boolean bool2 = (i14 & 16) != 0 ? cVar.f137410e : bool;
        double d15 = (i14 & 32) != 0 ? cVar.f137411f : d14;
        String str7 = (i14 & 64) != 0 ? cVar.f137412g : str3;
        String str8 = (i14 & 128) != 0 ? cVar.f137413h : str4;
        boolean z15 = (i14 & 256) != 0 ? cVar.f137414i : z14;
        Uri uri2 = (i14 & 512) != 0 ? cVar.f137415j : uri;
        cVar.getClass();
        str5.getClass();
        cVar3.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new c(str5, dVar2, cVar3, str6, bool2, d15, str7, str8, z15, uri2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f137406a, cVar.f137406a) && s.g(this.f137407b, cVar.f137407b) && s.g(this.f137408c, cVar.f137408c) && s.g(this.f137409d, cVar.f137409d) && s.g(this.f137410e, cVar.f137410e) && Double.compare(this.f137411f, cVar.f137411f) == 0 && s.g(this.f137412g, cVar.f137412g) && s.g(this.f137413h, cVar.f137413h) && this.f137414i == cVar.f137414i && s.g(this.f137415j, cVar.f137415j);
    }

    public final int hashCode() {
        int iHashCode = this.f137406a.hashCode() * 31;
        d dVar = this.f137407b;
        int iJ = wr.g.j(l2.a(this.f137408c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31, this.f137409d);
        Boolean bool = this.f137410e;
        int iG = q6.f.g(wr.g.j(wr.g.j(org.apache.commons.lang3.e.b((iJ + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f137411f), 31, this.f137412g), 31, this.f137413h), 31, this.f137414i);
        Uri uri = this.f137415j;
        return iG + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AddDogDataUiState(name=");
        sb3.append(this.f137406a);
        sb3.append(", primaryBreed=");
        sb3.append(this.f137407b);
        sb3.append(", secondaryBreeds=");
        sb3.append(this.f137408c);
        sb3.append(", gender=");
        sb3.append(this.f137409d);
        sb3.append(", isNeutered=");
        sb3.append(this.f137410e);
        sb3.append(", weight=");
        sb3.append(this.f137411f);
        sn.a.t(sb3, ", birthdate=", this.f137412g, ", birthdatePrecision=", this.f137413h);
        sb3.append(", excludeFromPhysioMetrics=");
        sb3.append(this.f137414i);
        sb3.append(", photoUri=");
        sb3.append(this.f137415j);
        sb3.append(")");
        return sb3.toString();
    }

    public c(String str, d dVar, i53.c<d> cVar, String str2, Boolean bool, double d14, String str3, String str4, boolean z14, Uri uri) {
        str.getClass();
        cVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f137406a = str;
        this.f137407b = dVar;
        this.f137408c = cVar;
        this.f137409d = str2;
        this.f137410e = bool;
        this.f137411f = d14;
        this.f137412g = str3;
        this.f137413h = str4;
        this.f137414i = z14;
        this.f137415j = uri;
    }

    public c() {
        this(null, null, null, null, null, 0.0d, null, null, false, null, 1023, null);
    }
}
