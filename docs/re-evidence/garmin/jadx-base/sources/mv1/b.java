package mv1;

import com.garmin.android.apps.connectmobile.f3;
import fg0.k;
import hv1.i;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tw1.h;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmv1/b;", "", "", "", "trainingDays", "longWorkDays", "swimmingDays", "Ljv1/c;", "runningWorkoutTarget", "cyclingWorkoutTarget", "Lhv1/i;", "swimAbility", "Ltw1/h;", "supplementalSports", "Lfg0/k;", "eventDTO", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/f;", "triathlonTypes", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljv1/c;Ljv1/c;Lhv1/i;Ljava/util/List;Lfg0/k;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f121172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f121173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f121174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jv1.c f121175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jv1.c f121176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f121177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<h> f121178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f121179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.f> f121180i;

    public /* synthetic */ b(List list, List list2, List list3, jv1.c cVar, jv1.c cVar2, i iVar, List list4, k kVar, List list5, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2, (i14 & 4) != 0 ? null : list3, (i14 & 8) != 0 ? null : cVar, (i14 & 16) != 0 ? null : cVar2, (i14 & 32) != 0 ? null : iVar, (i14 & 64) != 0 ? null : list4, (i14 & 128) != 0 ? null : kVar, (i14 & 256) != 0 ? null : list5);
    }

    public static b a(b bVar, List list, ArrayList arrayList, List list2, jv1.c cVar, jv1.c cVar2, i iVar, ArrayList arrayList2, int i14) {
        if ((i14 & 1) != 0) {
            list = bVar.f121172a;
        }
        List list3 = list;
        List<String> list4 = arrayList;
        if ((i14 & 2) != 0) {
            list4 = bVar.f121173b;
        }
        List<String> list5 = list4;
        if ((i14 & 4) != 0) {
            list2 = bVar.f121174c;
        }
        List list6 = list2;
        if ((i14 & 8) != 0) {
            cVar = bVar.f121175d;
        }
        return new b(list3, list5, list6, cVar, (i14 & 16) != 0 ? bVar.f121176e : cVar2, (i14 & 32) != 0 ? bVar.f121177f : iVar, (i14 & 64) != 0 ? bVar.f121178g : arrayList2, bVar.f121179h, bVar.f121180i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f121172a, bVar.f121172a) && s.g(this.f121173b, bVar.f121173b) && s.g(this.f121174c, bVar.f121174c) && this.f121175d == bVar.f121175d && this.f121176e == bVar.f121176e && this.f121177f == bVar.f121177f && s.g(this.f121178g, bVar.f121178g) && s.g(this.f121179h, bVar.f121179h) && s.g(this.f121180i, bVar.f121180i);
    }

    public final int hashCode() {
        List<String> list = this.f121172a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f121173b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f121174c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        jv1.c cVar = this.f121175d;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        jv1.c cVar2 = this.f121176e;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        i iVar = this.f121177f;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        List<h> list4 = this.f121178g;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        k kVar = this.f121179h;
        int iHashCode8 = (iHashCode7 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list5 = this.f121180i;
        return iHashCode8 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("FBTEditPreferencesTriDSWModel(trainingDays=", ", longWorkDays=", ", swimmingDays=", this.f121172a, this.f121173b);
        sbK.append(this.f121174c);
        sbK.append(", runningWorkoutTarget=");
        sbK.append(this.f121175d);
        sbK.append(", cyclingWorkoutTarget=");
        sbK.append(this.f121176e);
        sbK.append(", swimAbility=");
        sbK.append(this.f121177f);
        sbK.append(", supplementalSports=");
        sbK.append(this.f121178g);
        sbK.append(", eventDTO=");
        sbK.append(this.f121179h);
        sbK.append(", triathlonTypes=");
        return z.c(sbK, this.f121180i, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<String> list, List<String> list2, List<String> list3, jv1.c cVar, jv1.c cVar2, i iVar, List<? extends h> list4, k kVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list5) {
        this.f121172a = list;
        this.f121173b = list2;
        this.f121174c = list3;
        this.f121175d = cVar;
        this.f121176e = cVar2;
        this.f121177f = iVar;
        this.f121178g = list4;
        this.f121179h = kVar;
        this.f121180i = list5;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
