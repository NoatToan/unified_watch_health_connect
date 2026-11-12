package ew1;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lew1/a;", "", "", "distanceTitle", "distanceDescription", "timeTitle", "timeDescription", "primaryButtonText", "secondaryButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f66297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f66298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f66299f;

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f66294a, aVar.f66294a) && p005kotlin.jvm.internal.s.g(this.f66295b, aVar.f66295b) && p005kotlin.jvm.internal.s.g(this.f66296c, aVar.f66296c) && p005kotlin.jvm.internal.s.g(this.f66297d, aVar.f66297d) && p005kotlin.jvm.internal.s.g(this.f66298e, aVar.f66298e) && p005kotlin.jvm.internal.s.g(this.f66299f, aVar.f66299f);
    }

    public final int hashCode() {
        String str = this.f66294a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f66295b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66296c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f66297d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f66298e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f66299f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CoachRecommendationModel(distanceTitle=", this.f66294a, ", distanceDescription=", this.f66295b, ", timeTitle=");
        sn.a.t(sbI, this.f66296c, ", timeDescription=", this.f66297d, ", primaryButtonText=");
        return e5.h(sbI, this.f66298e, ", secondaryButtonText=", this.f66299f, ")");
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f66294a = str;
        this.f66295b = str2;
        this.f66296c = str3;
        this.f66297d = str4;
        this.f66298e = str5;
        this.f66299f = str6;
    }

    public a() {
        this(null, null, null, null, null, null, 63, null);
    }
}
