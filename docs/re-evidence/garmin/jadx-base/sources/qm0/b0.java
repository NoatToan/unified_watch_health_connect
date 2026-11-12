package qm0;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqm0/b0;", "", "Lwg0/a;", "activityFeed", "Lmo1/f;", "conversationLikeDTO", "<init>", "(Lwg0/a;Lmo1/f;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wg0.a f145483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mo1.f f145484b;

    static {
        Parcelable.Creator<mo1.f> creator = mo1.f.CREATOR;
        wg0.a.b bVar = wg0.a.F;
    }

    public b0(wg0.a aVar, mo1.f fVar) {
        aVar.getClass();
        this.f145483a = aVar;
        this.f145484b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f145483a.equals(b0Var.f145483a) && p005kotlin.jvm.internal.s.g(this.f145484b, b0Var.f145484b);
    }

    public final int hashCode() {
        int iHashCode = this.f145483a.hashCode() * 31;
        mo1.f fVar = this.f145484b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "LikeActivityFeedEvent(activityFeed=" + this.f145483a + ", conversationLikeDTO=" + this.f145484b + ")";
    }
}
