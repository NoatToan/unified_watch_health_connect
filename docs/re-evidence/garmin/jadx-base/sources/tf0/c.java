package tf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltf0/c;", "Ltf0/e;", "Luf0/a;", "device", "<init>", "(Luf0/a;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf0.a f164431a;

    public c(uf0.a aVar) {
        aVar.getClass();
        this.f164431a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f164431a.equals(((c) obj).f164431a);
    }

    public final int hashCode() {
        return this.f164431a.hashCode();
    }

    public final String toString() {
        return "EpochDeviceSelectedAction(device=" + this.f164431a + ")";
    }
}
