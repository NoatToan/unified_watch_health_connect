package km0;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkm0/m;", "", "Lhi0/l;", "summary", "Lwm0/b;", "inviteStatus", "<init>", "(Lhi0/l;Lwm0/b;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi0.l f105412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wm0.b f105413b;

    static {
        Parcelable.Creator<hi0.l> creator = hi0.l.CREATOR;
    }

    public m(hi0.l lVar, wm0.b bVar) {
        lVar.getClass();
        this.f105412a = lVar;
        this.f105413b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f105412a.equals(mVar.f105412a) && this.f105413b == mVar.f105413b;
    }

    public final int hashCode() {
        int iHashCode = this.f105412a.hashCode() * 31;
        wm0.b bVar = this.f105413b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "GroupInvitationMember(summary=" + this.f105412a + ", inviteStatus=" + this.f105413b + ")";
    }
}
