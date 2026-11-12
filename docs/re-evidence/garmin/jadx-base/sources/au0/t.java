package au0;

import am.x0;
import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau0/t;", "", "Ljava/util/UUID;", "sessionUuid", "Lam/x0;", "activityType", "", "customActivityName", "workoutName", "metric1", "metric2", "metric3", "<init>", "(Ljava/util/UUID;Lam/x0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f12986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f12987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12992g;

    public t(UUID uuid, x0 x0Var, String str, String str2, String str3, String str4, String str5) {
        uuid.getClass();
        x0Var.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.f12986a = uuid;
        this.f12987b = x0Var;
        this.f12988c = str;
        this.f12989d = str2;
        this.f12990e = str3;
        this.f12991f = str4;
        this.f12992g = str5;
    }

    public static t a(t tVar, String str, String str2, String str3, int i14) {
        UUID uuid = tVar.f12986a;
        x0 x0Var = tVar.f12987b;
        String str4 = tVar.f12988c;
        String str5 = tVar.f12989d;
        if ((i14 & 16) != 0) {
            str = tVar.f12990e;
        }
        String str6 = str;
        if ((i14 & 32) != 0) {
            str2 = tVar.f12991f;
        }
        String str7 = str2;
        if ((i14 & 64) != 0) {
            str3 = tVar.f12992g;
        }
        String str8 = str3;
        uuid.getClass();
        x0Var.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new t(uuid, x0Var, str4, str5, str6, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f12986a, tVar.f12986a) && this.f12987b == tVar.f12987b && p005kotlin.jvm.internal.s.g(this.f12988c, tVar.f12988c) && p005kotlin.jvm.internal.s.g(this.f12989d, tVar.f12989d) && p005kotlin.jvm.internal.s.g(this.f12990e, tVar.f12990e) && p005kotlin.jvm.internal.s.g(this.f12991f, tVar.f12991f) && p005kotlin.jvm.internal.s.g(this.f12992g, tVar.f12992g);
    }

    public final int hashCode() {
        int iHashCode = (this.f12987b.hashCode() + (this.f12986a.hashCode() * 31)) * 31;
        String str = this.f12988c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12989d;
        return this.f12992g.hashCode() + wr.g.j(wr.g.j((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f12990e), 31, this.f12991f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LiveActivityCardDTO(sessionUuid=");
        sb3.append(this.f12986a);
        sb3.append(", activityType=");
        sb3.append(this.f12987b);
        sb3.append(", customActivityName=");
        sn.a.t(sb3, this.f12988c, ", workoutName=", this.f12989d, ", metric1=");
        sn.a.t(sb3, this.f12990e, ", metric2=", this.f12991f, ", metric3=");
        return am.j.o(this.f12992g, ")", sb3);
    }

    public /* synthetic */ t(UUID uuid, x0 x0Var, String str, String str2, String str3, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uuid, x0Var, str, str2, (i14 & 16) != 0 ? "" : str3, (i14 & 32) != 0 ? "" : str4, (i14 & 64) != 0 ? "" : str5);
    }
}
