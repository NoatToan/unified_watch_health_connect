package mv1;

import java.util.ArrayList;
import java.util.List;
import jv1.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tw1.h;
import tw1.k;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmv1/a;", "", "Ltw1/k;", "trainingLevel", "", "isCyclingPreferences", "isImproveFitness", "", "", "selectedTrainingDays", "selectedLongDays", "Ljv1/c;", "selectedTargetType", "Lfg0/k;", "eventDTO", "Ltw1/h;", "supplementalSports", "Ljv1/o;", "availableElevationProfiles", "<init>", "(Ltw1/k;ZZLjava/util/List;Ljava/util/List;Ljv1/c;Lfg0/k;Ljava/util/List;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f121163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f121164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f121165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f121166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f121167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jv1.c f121168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fg0.k f121169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<h> f121170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<o> f121171i;

    public /* synthetic */ a(k kVar, boolean z14, boolean z15, List list, List list2, jv1.c cVar, fg0.k kVar2, List list3, List list4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : kVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : list2, (i14 & 32) != 0 ? null : cVar, (i14 & 64) != 0 ? null : kVar2, (i14 & 128) != 0 ? null : list3, (i14 & 256) != 0 ? null : list4);
    }

    public static a a(a aVar, k kVar, List list, ArrayList arrayList, jv1.c cVar, fg0.k kVar2, ArrayList arrayList2, List list2, int i14) {
        if ((i14 & 1) != 0) {
            kVar = aVar.f121163a;
        }
        k kVar3 = kVar;
        boolean z14 = aVar.f121164b;
        boolean z15 = aVar.f121165c;
        if ((i14 & 8) != 0) {
            list = aVar.f121166d;
        }
        return new a(kVar3, z14, z15, list, (i14 & 16) != 0 ? aVar.f121167e : arrayList, (i14 & 32) != 0 ? aVar.f121168f : cVar, (i14 & 64) != 0 ? aVar.f121169g : kVar2, (i14 & 128) != 0 ? aVar.f121170h : arrayList2, (i14 & 256) != 0 ? aVar.f121171i : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f121163a == aVar.f121163a && this.f121164b == aVar.f121164b && this.f121165c == aVar.f121165c && s.g(this.f121166d, aVar.f121166d) && s.g(this.f121167e, aVar.f121167e) && this.f121168f == aVar.f121168f && s.g(this.f121169g, aVar.f121169g) && s.g(this.f121170h, aVar.f121170h) && s.g(this.f121171i, aVar.f121171i);
    }

    public final int hashCode() {
        k kVar = this.f121163a;
        int iG = q6.f.g(q6.f.g((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f121164b), 31, this.f121165c);
        List<String> list = this.f121166d;
        int iHashCode = (iG + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f121167e;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        jv1.c cVar = this.f121168f;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        fg0.k kVar2 = this.f121169g;
        int iHashCode4 = (iHashCode3 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        List<h> list3 = this.f121170h;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<o> list4 = this.f121171i;
        return iHashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTEditPreferencesModel(trainingLevel=");
        sb3.append(this.f121163a);
        sb3.append(", isCyclingPreferences=");
        sb3.append(this.f121164b);
        sb3.append(", isImproveFitness=");
        sb3.append(this.f121165c);
        sb3.append(", selectedTrainingDays=");
        sb3.append(this.f121166d);
        sb3.append(", selectedLongDays=");
        sb3.append(this.f121167e);
        sb3.append(", selectedTargetType=");
        sb3.append(this.f121168f);
        sb3.append(", eventDTO=");
        sb3.append(this.f121169g);
        sb3.append(", supplementalSports=");
        sb3.append(this.f121170h);
        sb3.append(", availableElevationProfiles=");
        return z.c(sb3, this.f121171i, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(k kVar, boolean z14, boolean z15, List<String> list, List<String> list2, jv1.c cVar, fg0.k kVar2, List<? extends h> list3, List<? extends o> list4) {
        this.f121163a = kVar;
        this.f121164b = z14;
        this.f121165c = z15;
        this.f121166d = list;
        this.f121167e = list2;
        this.f121168f = cVar;
        this.f121169g = kVar2;
        this.f121170h = list3;
        this.f121171i = list4;
    }

    public a() {
        this(null, false, false, null, null, null, null, null, null, 511, null);
    }
}
