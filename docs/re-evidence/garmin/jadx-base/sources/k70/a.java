package k70;

import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import n23.j;
import o70.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk70/a;", "", "Lyz1/d;", "status", "Lo70/c;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "Lpb2/b$b;", "trends", "Lpb2/b$d;", "streaks", "", "isPrompt", "<init>", "(Lyz1/d;Lo70/c;Ljava/util/List;Ljava/util/List;Z)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f103269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f103270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<pb2.b.C2596b> f103271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<pb2.b.d> f103272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f103273e;

    public a(d dVar, c cVar, List<pb2.b.C2596b> list, List<pb2.b.d> list2, boolean z14) {
        dVar.getClass();
        cVar.getClass();
        this.f103269a = dVar;
        this.f103270b = cVar;
        this.f103271c = list;
        this.f103272d = list2;
        this.f103273e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f103269a.equals(aVar.f103269a) && this.f103270b == aVar.f103270b && s.g(this.f103271c, aVar.f103271c) && s.g(this.f103272d, aVar.f103272d) && this.f103273e == aVar.f103273e;
    }

    public final int hashCode() {
        int iHashCode = (this.f103270b.hashCode() + (this.f103269a.hashCode() * 31)) * 31;
        List<pb2.b.C2596b> list = this.f103271c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<pb2.b.d> list2 = this.f103272d;
        return Boolean.hashCode(this.f103273e) + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityTrendsCardData(status=");
        sb3.append(this.f103269a);
        sb3.append(", type=");
        sb3.append(this.f103270b);
        sb3.append(", trends=");
        j.z(sb3, this.f103271c, ", streaks=", this.f103272d, ", isPrompt=");
        return hb.a.k(sb3, this.f103273e, ")");
    }
}
