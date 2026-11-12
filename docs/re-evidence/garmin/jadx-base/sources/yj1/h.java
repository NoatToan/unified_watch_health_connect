package yj1;

import l20.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyj1/h;", "", "", "assistancePlusEnabled", "Ll20/q;", "selfUserContactDTO", "userHasSeenLTEMyInformationScreen", "primaryPhoneIsValidMyInformation", "secondaryPhoneIsValidMyInformation", "<init>", "(Ljava/lang/Boolean;Ll20/q;ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f197547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f197548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f197550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f197551e;

    public /* synthetic */ h(Boolean bool, q qVar, boolean z14, Boolean bool2, Boolean bool3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bool, qVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : bool2, (i14 & 16) != 0 ? null : bool3);
    }

    public static h a(h hVar, q qVar) {
        Boolean bool = hVar.f197547a;
        boolean z14 = hVar.f197549c;
        Boolean bool2 = hVar.f197550d;
        Boolean bool3 = hVar.f197551e;
        hVar.getClass();
        return new h(bool, qVar, z14, bool2, bool3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f197547a, hVar.f197547a) && s.g(this.f197548b, hVar.f197548b) && this.f197549c == hVar.f197549c && s.g(this.f197550d, hVar.f197550d) && s.g(this.f197551e, hVar.f197551e);
    }

    public final int hashCode() {
        Boolean bool = this.f197547a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        q qVar = this.f197548b;
        int iG = q6.f.g((iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f197549c);
        Boolean bool2 = this.f197550d;
        int iHashCode2 = (iG + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f197551e;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InformationUIModel(assistancePlusEnabled=");
        sb3.append(this.f197547a);
        sb3.append(", selfUserContactDTO=");
        sb3.append(this.f197548b);
        sb3.append(", userHasSeenLTEMyInformationScreen=");
        sb3.append(this.f197549c);
        sb3.append(", primaryPhoneIsValidMyInformation=");
        sb3.append(this.f197550d);
        sb3.append(", secondaryPhoneIsValidMyInformation=");
        return p6.b.f(sb3, this.f197551e, ")");
    }

    public h(Boolean bool, q qVar, boolean z14, Boolean bool2, Boolean bool3) {
        this.f197547a = bool;
        this.f197548b = qVar;
        this.f197549c = z14;
        this.f197550d = bool2;
        this.f197551e = bool3;
    }
}
