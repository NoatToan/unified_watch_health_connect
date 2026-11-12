package nr;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/b0;", "", "", FirebaseAnalytics.Param.INDEX, "", "name", "duration", "repCount", "weight", "", "isTypeActive", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f126990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f126992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f126993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f126994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f126995f;

    public /* synthetic */ b0(int i14, String str, String str2, String str3, String str4, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, str, str2, str3, str4, (i15 & 32) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f126990a == b0Var.f126990a && p005kotlin.jvm.internal.s.g(this.f126991b, b0Var.f126991b) && p005kotlin.jvm.internal.s.g(this.f126992c, b0Var.f126992c) && p005kotlin.jvm.internal.s.g(this.f126993d, b0Var.f126993d) && p005kotlin.jvm.internal.s.g(this.f126994e, b0Var.f126994e) && this.f126995f == b0Var.f126995f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126995f) + wr.g.j(wr.g.j(wr.g.j(wr.g.j(Integer.hashCode(this.f126990a) * 31, 31, this.f126991b), 31, this.f126992c), 31, this.f126993d), 31, this.f126994e);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f126990a, "Exercise(index=", ", name=", this.f126991b, ", duration=");
        sn.a.t(sbR, this.f126992c, ", repCount=", this.f126993d, ", weight=");
        return am.j.n(this.f126994e, ", isTypeActive=", ")", sbR, this.f126995f);
    }

    public b0(int i14, String str, String str2, String str3, String str4, boolean z14) {
        kg.f.p(str, str2, str3, str4);
        this.f126990a = i14;
        this.f126991b = str;
        this.f126992c = str2;
        this.f126993d = str3;
        this.f126994e = str4;
        this.f126995f = z14;
    }
}
