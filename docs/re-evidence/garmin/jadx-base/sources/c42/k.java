package c42;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc42/k;", "", "", "loading", "", "Lsd2/f;", "screenlessDevices", "<init>", "(ZLjava/util/List;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<sd2.f> f24408b;

    public /* synthetic */ k(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f24407a == kVar.f24407a && p005kotlin.jvm.internal.s.g(this.f24408b, kVar.f24408b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f24407a) * 31;
        List<sd2.f> list = this.f24408b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "VO2MaxOnboardingInitialStateCheckUiState(loading=" + this.f24407a + ", screenlessDevices=" + this.f24408b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(boolean z14, List<? extends sd2.f> list) {
        this.f24407a = z14;
        this.f24408b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
