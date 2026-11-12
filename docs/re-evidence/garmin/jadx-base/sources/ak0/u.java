package ak0;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lak0/u;", "", "Lzx2/a;", "duration", "", "isAutoRenewOn", "", "daysLeftInTrial", "Lorg/joda/time/DateTime;", "expirationDateTime", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j;", "subscriptionState", "Li53/c;", "Lck0/t;", "exclusiveOffers", "<init>", "(Lzx2/a;ZILorg/joda/time/DateTime;Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j;Li53/c;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zx2.a f3679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f3682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.gcplus.presentation.home.j f3683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<ck0.t> f3684f;

    public u(zx2.a aVar, boolean z14, int i14, DateTime dateTime, com.garmin.android.apps.connectmobile.gcplus.presentation.home.j jVar, i53.c<ck0.t> cVar) {
        aVar.getClass();
        dateTime.getClass();
        jVar.getClass();
        this.f3679a = aVar;
        this.f3680b = z14;
        this.f3681c = i14;
        this.f3682d = dateTime;
        this.f3683e = jVar;
        this.f3684f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f3679a == uVar.f3679a && this.f3680b == uVar.f3680b && this.f3681c == uVar.f3681c && this.f3682d.equals(uVar.f3682d) && this.f3683e.equals(uVar.f3683e) && p005kotlin.jvm.internal.s.g(this.f3684f, uVar.f3684f);
    }

    public final int hashCode() {
        int iHashCode = (this.f3683e.hashCode() + ds.e0.a(q2.d(this.f3681c, q6.f.g(this.f3679a.hashCode() * 31, 31, this.f3680b), 31), this.f3682d, 31)) * 31;
        i53.c<ck0.t> cVar = this.f3684f;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "GCPlusHomeScreenData(duration=" + this.f3679a + ", isAutoRenewOn=" + this.f3680b + ", daysLeftInTrial=" + this.f3681c + ", expirationDateTime=" + this.f3682d + ", subscriptionState=" + this.f3683e + ", exclusiveOffers=" + this.f3684f + ")";
    }
}
