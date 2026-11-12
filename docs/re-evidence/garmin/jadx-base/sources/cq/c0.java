package cq;

import p005kotlin.Metadata;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcq/c0;", "", "", "premiumProfileImageUrlMedium", "rankPlace", "duration", "durationContentDescription", "", "isHighlighted", "Ls5/x0;", "textStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLs5/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f54997f;

    public c0(String str, String str2, String str3, String str4, boolean z14, x0 x0Var) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        x0Var.getClass();
        this.f54992a = str;
        this.f54993b = str2;
        this.f54994c = str3;
        this.f54995d = str4;
        this.f54996e = z14;
        this.f54997f = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.f54992a, c0Var.f54992a) && p005kotlin.jvm.internal.s.g(this.f54993b, c0Var.f54993b) && p005kotlin.jvm.internal.s.g(this.f54994c, c0Var.f54994c) && p005kotlin.jvm.internal.s.g(this.f54995d, c0Var.f54995d) && this.f54996e == c0Var.f54996e && p005kotlin.jvm.internal.s.g(this.f54997f, c0Var.f54997f);
    }

    public final int hashCode() {
        String str = this.f54992a;
        return this.f54997f.hashCode() + q6.f.g(wr.g.j(wr.g.j(wr.g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.f54993b), 31, this.f54994c), 31, this.f54995d), 31, this.f54996e);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("RankingModel(premiumProfileImageUrlMedium=", this.f54992a, ", rankPlace=", this.f54993b, ", duration=");
        sn.a.t(sbI, this.f54994c, ", durationContentDescription=", this.f54995d, ", isHighlighted=");
        sbI.append(this.f54996e);
        sbI.append(", textStyle=");
        sbI.append(this.f54997f);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ c0(String str, String str2, String str3, String str4, boolean z14, x0 x0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, str4, (i14 & 16) != 0 ? false : z14, x0Var);
    }
}
