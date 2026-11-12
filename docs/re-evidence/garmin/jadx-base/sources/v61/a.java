package v61;

import am.j;
import am.x0;
import i3.e5;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv61/a;", "", "", "activityId", "", "activityName", "Lam/x0;", "activityType", "", "aerobicValue", "anaerobicValue", "primaryBenefit", "startTimeLocal", "<init>", "(JLjava/lang/String;Lam/x0;DDLjava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f175801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f175803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f175804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f175805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f175806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f175807g;

    public a(long j8, String str, x0 x0Var, double d14, double d15, String str2, String str3) {
        x0Var.getClass();
        this.f175801a = j8;
        this.f175802b = str;
        this.f175803c = x0Var;
        this.f175804d = d14;
        this.f175805e = d15;
        this.f175806f = str2;
        this.f175807g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f175801a == aVar.f175801a && s.g(this.f175802b, aVar.f175802b) && this.f175803c == aVar.f175803c && Double.compare(this.f175804d, aVar.f175804d) == 0 && Double.compare(this.f175805e, aVar.f175805e) == 0 && s.g(this.f175806f, aVar.f175806f) && s.g(this.f175807g, aVar.f175807g);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f175801a) * 31;
        String str = this.f175802b;
        int iB = e.b(e.b((this.f175803c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f175804d), 31, this.f175805e);
        String str2 = this.f175806f;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f175807g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f175801a, "ActivityListEffectData(activityId=", ", activityName=", this.f175802b);
        sbK.append(", activityType=");
        sbK.append(this.f175803c);
        sbK.append(", aerobicValue=");
        sbK.append(this.f175804d);
        j.x(sbK, ", anaerobicValue=", this.f175805e, ", primaryBenefit=");
        return e5.h(sbK, this.f175806f, ", startTimeLocal=", this.f175807g, ")");
    }
}
