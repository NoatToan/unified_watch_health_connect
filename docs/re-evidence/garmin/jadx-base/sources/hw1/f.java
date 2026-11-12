package hw1;

import com.nimbusds.jose.HeaderParameterNames;
import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhw1/f;", "", "Lu4/d;", "icon", "Lo4/d0;", "iconColor", "", "labelTitle", "labelMeta1", "labelMeta2", "titleContentDescription", "meta1ContentDescription", "meta2ContentDescription", HeaderParameterNames.AUTHENTICATION_TAG, "Lkotlin/Function0;", "", "onClick", "<init>", "(Lu4/d;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/a;Lkotlin/jvm/internal/j;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f85946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f85947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f85950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f85951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f85952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f85953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f85954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e23.a<Unit> f85955j;

    public /* synthetic */ f(u4.d dVar, long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, j8, str, str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : str6, (i14 & 256) != 0 ? null : str7, (i14 & 512) != 0 ? null : aVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f85946a, fVar.f85946a) && d0.d(this.f85947b, fVar.f85947b) && s.g(this.f85948c, fVar.f85948c) && s.g(this.f85949d, fVar.f85949d) && s.g(this.f85950e, fVar.f85950e) && s.g(this.f85951f, fVar.f85951f) && s.g(this.f85952g, fVar.f85952g) && s.g(this.f85953h, fVar.f85953h) && s.g(this.f85954i, fVar.f85954i) && s.g(this.f85955j, fVar.f85955j);
    }

    public final int hashCode() {
        int iHashCode = this.f85946a.hashCode() * 31;
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        int iJ = wr.g.j(wr.g.j(q6.f.e(iHashCode, 31, this.f85947b), 31, this.f85948c), 31, this.f85949d);
        String str = this.f85950e;
        int iHashCode2 = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85951f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85952g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f85953h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f85954i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        e23.a<Unit> aVar3 = this.f85955j;
        return iHashCode6 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    public final String toString() {
        String strJ = d0.j(this.f85947b);
        StringBuilder sb3 = new StringBuilder("WorkoutCardData(icon=");
        sb3.append(this.f85946a);
        sb3.append(", iconColor=");
        sb3.append(strJ);
        sb3.append(", labelTitle=");
        sn.a.t(sb3, this.f85948c, ", labelMeta1=", this.f85949d, ", labelMeta2=");
        sn.a.t(sb3, this.f85950e, ", titleContentDescription=", this.f85951f, ", meta1ContentDescription=");
        sn.a.t(sb3, this.f85952g, ", meta2ContentDescription=", this.f85953h, ", tag=");
        sb3.append(this.f85954i);
        sb3.append(", onClick=");
        sb3.append(this.f85955j);
        sb3.append(")");
        return sb3.toString();
    }

    private f(u4.d dVar, long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, e23.a<Unit> aVar) {
        dVar.getClass();
        str.getClass();
        str2.getClass();
        this.f85946a = dVar;
        this.f85947b = j8;
        this.f85948c = str;
        this.f85949d = str2;
        this.f85950e = str3;
        this.f85951f = str4;
        this.f85952g = str5;
        this.f85953h = str6;
        this.f85954i = str7;
        this.f85955j = aVar;
    }

    public /* synthetic */ f(u4.d dVar, long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, e23.a aVar, p005kotlin.jvm.internal.j jVar) {
        this(dVar, j8, str, str2, str3, str4, str5, str6, str7, aVar);
    }
}
