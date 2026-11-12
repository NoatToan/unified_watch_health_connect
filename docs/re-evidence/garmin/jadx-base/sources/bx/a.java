package bx;

import gs1.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbx/a;", "", "Lbx/e;", "messagingTodayDTO", "Lgs1/t;", "dailyTimelineDTO", "", "Lbx/b;", "bodyBatteryEvents", "<init>", "(Lbx/e;Lgs1/t;Ljava/util/List;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f21603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f21604c;

    public /* synthetic */ a(e eVar, t tVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : eVar, (i14 & 2) != 0 ? null : tVar, (i14 & 4) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f21602a, aVar.f21602a) && s.g(this.f21603b, aVar.f21603b) && s.g(this.f21604c, aVar.f21604c);
    }

    public final int hashCode() {
        e eVar = this.f21602a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        t tVar = this.f21603b;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<b> list = this.f21604c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BodyBatteryDetails(messagingTodayDTO=");
        sb3.append(this.f21602a);
        sb3.append(", dailyTimelineDTO=");
        sb3.append(this.f21603b);
        sb3.append(", bodyBatteryEvents=");
        return z.c(sb3, this.f21604c, ")");
    }

    public a(e eVar, t tVar, List<b> list) {
        this.f21602a = eVar;
        this.f21603b = tVar;
        this.f21604c = list;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
