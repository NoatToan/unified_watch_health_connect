package o12;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo12/i;", "", "", "isError", "isLoading", "Lw12/a;", "privacyData", "<init>", "(ZZLw12/a;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f128556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w12.a f128558c;

    public /* synthetic */ i(boolean z14, boolean z15, w12.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f128556a == iVar.f128556a && this.f128557b == iVar.f128557b && s.g(this.f128558c, iVar.f128558c);
    }

    public final int hashCode() {
        return this.f128558c.hashCode() + q6.f.g(Boolean.hashCode(this.f128556a) * 31, 31, this.f128557b);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("PrivacyUiState(isError=", ", isLoading=", ", privacyData=", this.f128556a, this.f128557b);
        sbM.append(this.f128558c);
        sbM.append(")");
        return sbM.toString();
    }

    public i(boolean z14, boolean z15, w12.a aVar) {
        aVar.getClass();
        this.f128556a = z14;
        this.f128557b = z15;
        this.f128558c = aVar;
    }
}
