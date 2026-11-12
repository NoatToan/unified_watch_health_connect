package dp1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yo1.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldp1/a;", "Ldp1/b;", "Lyo1/k;", "socialGroupRideWithActivityDTO", "<init>", "(Lyo1/k;)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f60643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar) {
        super(null);
        kVar.getClass();
        this.f60643a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && s.g(this.f60643a, ((a) obj).f60643a);
    }

    public final int hashCode() {
        return this.f60643a.hashCode();
    }

    public final String toString() {
        return "GroupRideDetailsNavigatorDestination(socialGroupRideWithActivityDTO=" + this.f60643a + ")";
    }
}
