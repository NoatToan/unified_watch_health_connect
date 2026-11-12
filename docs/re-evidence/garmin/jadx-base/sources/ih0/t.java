package ih0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lih0/t;", "", "", "dataUpdateRequired", "<init>", "(Z)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93507a;

    public /* synthetic */ t(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f93507a == ((t) obj).f93507a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93507a);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.g("FitnessAgeUiState(dataUpdateRequired=", ")", this.f93507a);
    }

    public t(boolean z14) {
        this.f93507a = z14;
    }

    public t() {
        this(false, 1, null);
    }
}
