package wi1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwi1/e;", "", "", "isLTEActivated", "isAssistancePlusSupportedCountry", "<init>", "(ZZ)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f185498b;

    public e(boolean z14, boolean z15) {
        this.f185497a = z14;
        this.f185498b = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f185497a == eVar.f185497a && this.f185498b == eVar.f185498b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185498b) + (Boolean.hashCode(this.f185497a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("LTESubscriptionDTO(isLTEActivated=", ", isAssistancePlusSupportedCountry=", ")", this.f185497a, this.f185498b);
    }
}
