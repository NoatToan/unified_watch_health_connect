package sy0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsy0/j;", "", "", "name", "", "startDateMillis", "endDateMillis", "Li53/e;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "selectedActivities", "Lsy0/f;", "course", "Lsy0/m;", "privacyOption", "", "liveTrackEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Li53/e;Lsy0/f;Lsy0/m;Z)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f161227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f161228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.e<ActivityListItemDTO> f161229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f161230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f161231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f161232g;

    public /* synthetic */ j(String str, Long l14, Long l15, i53.e eVar, f fVar, m mVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? i53.a.d() : eVar, (i14 & 16) != 0 ? null : fVar, (i14 & 32) != 0 ? m.ONLY_ME : mVar, (i14 & 64) != 0 ? false : z14);
    }

    public static j a(j jVar, String str, Long l14, Long l15, i53.h hVar, f fVar, m mVar, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            str = jVar.f161226a;
        }
        String str2 = str;
        if ((i14 & 2) != 0) {
            l14 = jVar.f161227b;
        }
        Long l16 = l14;
        if ((i14 & 4) != 0) {
            l15 = jVar.f161228c;
        }
        Long l17 = l15;
        i53.e<ActivityListItemDTO> eVar = hVar;
        if ((i14 & 8) != 0) {
            eVar = jVar.f161229d;
        }
        i53.e<ActivityListItemDTO> eVar2 = eVar;
        if ((i14 & 16) != 0) {
            fVar = jVar.f161230e;
        }
        f fVar2 = fVar;
        if ((i14 & 32) != 0) {
            mVar = jVar.f161231f;
        }
        m mVar2 = mVar;
        if ((i14 & 64) != 0) {
            z14 = jVar.f161232g;
        }
        jVar.getClass();
        eVar2.getClass();
        mVar2.getClass();
        return new j(str2, l16, l17, eVar2, fVar2, mVar2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f161226a, jVar.f161226a) && p005kotlin.jvm.internal.s.g(this.f161227b, jVar.f161227b) && p005kotlin.jvm.internal.s.g(this.f161228c, jVar.f161228c) && p005kotlin.jvm.internal.s.g(this.f161229d, jVar.f161229d) && p005kotlin.jvm.internal.s.g(this.f161230e, jVar.f161230e) && this.f161231f == jVar.f161231f && this.f161232g == jVar.f161232g;
    }

    public final int hashCode() {
        String str = this.f161226a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.f161227b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f161228c;
        int iHashCode3 = (this.f161229d.hashCode() + ((iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31)) * 31;
        f fVar = this.f161230e;
        return Boolean.hashCode(this.f161232g) + ((this.f161231f.hashCode() + ((iHashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MultiDayActivityCreationData(name=");
        sb3.append(this.f161226a);
        sb3.append(", startDateMillis=");
        sb3.append(this.f161227b);
        sb3.append(", endDateMillis=");
        sb3.append(this.f161228c);
        sb3.append(", selectedActivities=");
        sb3.append(this.f161229d);
        sb3.append(", course=");
        sb3.append(this.f161230e);
        sb3.append(", privacyOption=");
        sb3.append(this.f161231f);
        sb3.append(", liveTrackEnabled=");
        return hb.a.k(sb3, this.f161232g, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(String str, Long l14, Long l15, i53.e<? extends ActivityListItemDTO> eVar, f fVar, m mVar, boolean z14) {
        eVar.getClass();
        mVar.getClass();
        this.f161226a = str;
        this.f161227b = l14;
        this.f161228c = l15;
        this.f161229d = eVar;
        this.f161230e = fVar;
        this.f161231f = mVar;
        this.f161232g = z14;
    }

    public j() {
        this(null, null, null, null, null, null, false, 127, null);
    }
}
