package ep1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lep1/a;", "Lep1/g;", "Lip1/a;", "activityItem", "<init>", "(Lip1/a;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip1.a f64919a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ip1.a aVar) {
        super(null);
        aVar.getClass();
        this.f64919a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && s.g(this.f64919a, ((a) obj).f64919a);
    }

    public final int hashCode() {
        return this.f64919a.hashCode();
    }

    public final String toString() {
        return "DestinationActivity(activityItem=" + this.f64919a + ")";
    }
}
