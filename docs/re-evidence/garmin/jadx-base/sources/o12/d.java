package o12;

import java.util.List;
import lc.u0;
import m12.s;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo12/d;", "", "", "isError", "isLoading", "Lb12/b;", "userProfileImageData", "", "Lm12/s;", "profilePrivacyItems", "showGraduationTooltip", "<init>", "(ZZLb12/b;Ljava/util/List;Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f128540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b12.b f128542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<s> f128543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f128544e;

    public d(boolean z14, boolean z15, b12.b bVar, List list, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? b12.b.f14386g : bVar, (i14 & 8) != 0 ? j0.f134944a : list, (i14 & 16) != 0 ? false : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f128540a == dVar.f128540a && this.f128541b == dVar.f128541b && p005kotlin.jvm.internal.s.g(this.f128542c, dVar.f128542c) && p005kotlin.jvm.internal.s.g(this.f128543d, dVar.f128543d) && this.f128544e == dVar.f128544e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128544e) + u0.b((this.f128542c.hashCode() + q6.f.g(Boolean.hashCode(this.f128540a) * 31, 31, this.f128541b)) * 31, 31, this.f128543d);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("EditProfileUiState(isError=", ", isLoading=", ", userProfileImageData=", this.f128540a, this.f128541b);
        sbM.append(this.f128542c);
        sbM.append(", profilePrivacyItems=");
        sbM.append(this.f128543d);
        sbM.append(", showGraduationTooltip=");
        return hb.a.k(sbM, this.f128544e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z14, boolean z15, b12.b bVar, List<? extends s> list, boolean z16) {
        bVar.getClass();
        list.getClass();
        this.f128540a = z14;
        this.f128541b = z15;
        this.f128542c = bVar;
        this.f128543d = list;
        this.f128544e = z16;
    }

    public d() {
        this(false, false, null, null, false, 31, null);
    }
}
