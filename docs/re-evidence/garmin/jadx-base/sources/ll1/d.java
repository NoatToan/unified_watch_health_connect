package ll1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lll1/d;", "", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lll1/a;", "initialState", "<init>", "(ZZLll1/a;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f113379c;

    public /* synthetic */ d(boolean z14, boolean z15, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : aVar);
    }

    public static d a(d dVar, a aVar, int i14) {
        boolean z14 = (i14 & 2) != 0 ? dVar.f113378b : true;
        if ((i14 & 4) != 0) {
            aVar = dVar.f113379c;
        }
        dVar.getClass();
        return new d(false, z14, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f113377a == dVar.f113377a && this.f113378b == dVar.f113378b && s.g(this.f113379c, dVar.f113379c);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f113377a) * 31, 31, this.f113378b);
        a aVar = this.f113379c;
        return iG + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("RecordActivityInitialStateCheckUiState(loading=", ", error=", ", initialState=", this.f113377a, this.f113378b);
        sbM.append(this.f113379c);
        sbM.append(")");
        return sbM.toString();
    }

    public d(boolean z14, boolean z15, a aVar) {
        this.f113377a = z14;
        this.f113378b = z15;
        this.f113379c = aVar;
    }

    public d() {
        this(false, false, null, 7, null);
    }
}
