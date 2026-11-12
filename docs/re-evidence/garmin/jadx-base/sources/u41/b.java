package u41;

import com.garmin.android.apps.connectmobile.courses.model.g;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o51.e;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import q6.f;
import r1.q2;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lu41/b;", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;", "pacebandDTO", "", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "intervalMarkers", "", "segmentColors", "slowestPace", "fastestPace", "Lo51/e;", "paceProMapState", "Lo51/b;", "paceProChartState", "Lo51/g;", "sendToDeviceState", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "relatedPaceProPlans", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "paceBandSplitsBeforeEdit", "", "eventName", "", "isLoading", "isError", "wasPlanEdited", "<init>", "(Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;Ljava/util/List;Ljava/util/List;IILo51/e;Lo51/b;Lo51/g;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZZ)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.pacepro.data.dto.a f168609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f168610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Integer> f168611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f168612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f168613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f168614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o51.b f168615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o51.g f168616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> f168617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<PaceBandSplitDTO> f168618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f168619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f168620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f168621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f168622n;

    public b(com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar, List list, List list2, int i14, int i15, e eVar, o51.b bVar, o51.g gVar, List list3, List list4, String str, boolean z14, boolean z15, boolean z16, int i16, j jVar) {
        this((i16 & 1) != 0 ? new com.garmin.android.apps.connectmobile.pacepro.data.dto.a((List) null, (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) null, 3, (j) null) : aVar, (i16 & 2) != 0 ? null : list, (i16 & 4) != 0 ? null : list2, (i16 & 8) != 0 ? DateTimeConstants.SECONDS_PER_HOUR : i14, (i16 & 16) != 0 ? 60 : i15, (i16 & 32) != 0 ? null : eVar, (i16 & 64) != 0 ? null : bVar, (i16 & 128) != 0 ? new o51.g(false, false, false, null, 15, null) : gVar, (i16 & 256) != 0 ? j0.f134944a : list3, (i16 & 512) != 0 ? j0.f134944a : list4, (i16 & 1024) == 0 ? str : null, (i16 & 2048) != 0 ? true : z14, (i16 & 4096) != 0 ? false : z15, (i16 & 8192) != 0 ? false : z16);
    }

    public static b a(b bVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar, ArrayList arrayList, ArrayList arrayList2, int i14, int i15, e eVar, o51.b bVar2, o51.g gVar, List list, List list2, String str, boolean z14, boolean z15, boolean z16, int i16) {
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2 = (i16 & 1) != 0 ? bVar.f168609a : aVar;
        List<g> list3 = (i16 & 2) != 0 ? bVar.f168610b : arrayList;
        List<Integer> list4 = (i16 & 4) != 0 ? bVar.f168611c : arrayList2;
        int i17 = (i16 & 8) != 0 ? bVar.f168612d : i14;
        int i18 = (i16 & 16) != 0 ? bVar.f168613e : i15;
        e eVar2 = (i16 & 32) != 0 ? bVar.f168614f : eVar;
        o51.b bVar3 = (i16 & 64) != 0 ? bVar.f168615g : bVar2;
        o51.g gVar2 = (i16 & 128) != 0 ? bVar.f168616h : gVar;
        List list5 = (i16 & 256) != 0 ? bVar.f168617i : list;
        List list6 = (i16 & 512) != 0 ? bVar.f168618j : list2;
        String str2 = (i16 & 1024) != 0 ? bVar.f168619k : str;
        boolean z17 = (i16 & 2048) != 0 ? bVar.f168620l : z14;
        boolean z18 = (i16 & 4096) != 0 ? bVar.f168621m : z15;
        boolean z19 = (i16 & 8192) != 0 ? bVar.f168622n : z16;
        bVar.getClass();
        aVar2.getClass();
        gVar2.getClass();
        list5.getClass();
        list6.getClass();
        return new b(aVar2, list3, list4, i17, i18, eVar2, bVar3, gVar2, list5, list6, str2, z17, z18, z19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f168609a, bVar.f168609a) && s.g(this.f168610b, bVar.f168610b) && s.g(this.f168611c, bVar.f168611c) && this.f168612d == bVar.f168612d && this.f168613e == bVar.f168613e && s.g(this.f168614f, bVar.f168614f) && s.g(this.f168615g, bVar.f168615g) && s.g(this.f168616h, bVar.f168616h) && s.g(this.f168617i, bVar.f168617i) && s.g(this.f168618j, bVar.f168618j) && s.g(this.f168619k, bVar.f168619k) && this.f168620l == bVar.f168620l && this.f168621m == bVar.f168621m && this.f168622n == bVar.f168622n;
    }

    public final int hashCode() {
        int iHashCode = this.f168609a.hashCode() * 31;
        List<g> list = this.f168610b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.f168611c;
        int iD = q2.d(this.f168613e, q2.d(this.f168612d, (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31), 31);
        e eVar = this.f168614f;
        int iHashCode3 = (iD + (eVar == null ? 0 : eVar.hashCode())) * 31;
        o51.b bVar = this.f168615g;
        int iB = u0.b(u0.b((this.f168616h.hashCode() + ((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31, this.f168617i), 31, this.f168618j);
        String str = this.f168619k;
        return Boolean.hashCode(this.f168622n) + f.g(f.g((iB + (str != null ? str.hashCode() : 0)) * 31, 31, this.f168620l), 31, this.f168621m);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PaceProPlan(pacebandDTO=");
        sb3.append(this.f168609a);
        sb3.append(", intervalMarkers=");
        sb3.append(this.f168610b);
        sb3.append(", segmentColors=");
        sb3.append(this.f168611c);
        sb3.append(", slowestPace=");
        sb3.append(this.f168612d);
        sb3.append(", fastestPace=");
        sb3.append(this.f168613e);
        sb3.append(", paceProMapState=");
        sb3.append(this.f168614f);
        sb3.append(", paceProChartState=");
        sb3.append(this.f168615g);
        sb3.append(", sendToDeviceState=");
        sb3.append(this.f168616h);
        sb3.append(", relatedPaceProPlans=");
        n23.j.z(sb3, this.f168617i, ", paceBandSplitsBeforeEdit=", this.f168618j, ", eventName=");
        h.C(this.f168619k, ", isLoading=", ", isError=", sb3, this.f168620l);
        return com.airbnb.lottie.animation.keyframe.a.f(", wasPlanEdited=", ")", sb3, this.f168621m, this.f168622n);
    }

    public b(com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar, List<g> list, List<Integer> list2, int i14, int i15, e eVar, o51.b bVar, o51.g gVar, List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list3, List<PaceBandSplitDTO> list4, String str, boolean z14, boolean z15, boolean z16) {
        aVar.getClass();
        gVar.getClass();
        list3.getClass();
        list4.getClass();
        this.f168609a = aVar;
        this.f168610b = list;
        this.f168611c = list2;
        this.f168612d = i14;
        this.f168613e = i15;
        this.f168614f = eVar;
        this.f168615g = bVar;
        this.f168616h = gVar;
        this.f168617i = list3;
        this.f168618j = list4;
        this.f168619k = str;
        this.f168620l = z14;
        this.f168621m = z15;
        this.f168622n = z16;
    }

    public b() {
        this(null, null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16383, null);
    }
}
