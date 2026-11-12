package wu2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwu2/e;", "", "Ltv2/c;", "subtext", "<init>", "(Ltv2/c;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv2.c f187343a;

    public e(tv2.c cVar) {
        cVar.getClass();
        this.f187343a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f187343a.equals(((e) obj).f187343a);
    }

    public final int hashCode() {
        return this.f187343a.hashCode();
    }

    public final String toString() {
        return "ActionOptions(subtext=" + this.f187343a + ")";
    }
}
