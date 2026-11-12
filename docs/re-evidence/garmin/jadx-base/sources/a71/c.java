package a71;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"La71/c;", "", "", "isLoadRatioContainerVisible", "isChartTitleVisible", "isChartVisible", "areStatsVisible", "shouldShowEmptyChart", "areNoDataStatsVisible", "", "noStateTitleResId", "noStateMessageResId", "<init>", "(ZZZZLjava/lang/Boolean;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f1733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f1735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f1736h;

    public /* synthetic */ c(boolean z14, boolean z15, boolean z16, boolean z17, Boolean bool, boolean z18, Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? false : z18, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1729a == cVar.f1729a && this.f1730b == cVar.f1730b && this.f1731c == cVar.f1731c && this.f1732d == cVar.f1732d && s.g(this.f1733e, cVar.f1733e) && this.f1734f == cVar.f1734f && s.g(this.f1735g, cVar.f1735g) && s.g(this.f1736h, cVar.f1736h);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f1729a) * 31, 31, this.f1730b), 31, this.f1731c), 31, this.f1732d);
        Boolean bool = this.f1733e;
        int iG2 = q6.f.g((iG + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f1734f);
        Integer num = this.f1735g;
        int iHashCode = (iG2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f1736h;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("LoadRatioTabUiState(isLoadRatioContainerVisible=", ", isChartTitleVisible=", ", isChartVisible=", this.f1729a, this.f1730b);
        kg.f.q(", areStatsVisible=", ", shouldShowEmptyChart=", sbM, this.f1731c, this.f1732d);
        sbM.append(this.f1733e);
        sbM.append(", areNoDataStatsVisible=");
        sbM.append(this.f1734f);
        sbM.append(", noStateTitleResId=");
        return b71.i.h(sbM, this.f1735g, ", noStateMessageResId=", this.f1736h, ")");
    }

    public c(boolean z14, boolean z15, boolean z16, boolean z17, Boolean bool, boolean z18, Integer num, Integer num2) {
        this.f1729a = z14;
        this.f1730b = z15;
        this.f1731c = z16;
        this.f1732d = z17;
        this.f1733e = bool;
        this.f1734f = z18;
        this.f1735g = num;
        this.f1736h = num2;
    }

    public c() {
        this(false, false, false, false, null, false, null, null, 255, null);
    }
}
