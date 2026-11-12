package ll1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lll1/l;", "", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lll1/k;", "selectDeviceState", "<init>", "(ZZLll1/k;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f113412c;

    public /* synthetic */ l(boolean z14, boolean z15, k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : kVar);
    }

    public static l a(l lVar, k kVar, int i14) {
        boolean z14 = (i14 & 1) != 0 ? lVar.f113410a : false;
        boolean z15 = (i14 & 2) != 0 ? lVar.f113411b : true;
        if ((i14 & 4) != 0) {
            kVar = lVar.f113412c;
        }
        lVar.getClass();
        return new l(z14, z15, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f113410a == lVar.f113410a && this.f113411b == lVar.f113411b && s.g(this.f113412c, lVar.f113412c);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f113410a) * 31, 31, this.f113411b);
        k kVar = this.f113412c;
        return iG + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("RecordActivitySelectDeviceUiState(loading=", ", error=", ", selectDeviceState=", this.f113410a, this.f113411b);
        sbM.append(this.f113412c);
        sbM.append(")");
        return sbM.toString();
    }

    public l(boolean z14, boolean z15, k kVar) {
        this.f113410a = z14;
        this.f113411b = z15;
        this.f113412c = kVar;
    }

    public l() {
        this(false, false, null, 7, null);
    }
}
