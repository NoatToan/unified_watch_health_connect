package qm0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqm0/e0;", "", "Lwg0/a;", "activityFeed", "", "isSucceeded", "<init>", "(Lwg0/a;Z)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wg0.a f145510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145511b;

    static {
        wg0.a.b bVar = wg0.a.F;
    }

    public e0(wg0.a aVar, boolean z14) {
        aVar.getClass();
        this.f145510a = aVar;
        this.f145511b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f145510a.equals(e0Var.f145510a) && this.f145511b == e0Var.f145511b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145511b) + (this.f145510a.hashCode() * 31);
    }

    public final String toString() {
        return "UnlikeActivityFeedEvent(activityFeed=" + this.f145510a + ", isSucceeded=" + this.f145511b + ")";
    }
}
