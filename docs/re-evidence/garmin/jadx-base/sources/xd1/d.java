package xd1;

import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lxd1/d;", "", "", "summaryName", "", "durationInSecond", "repCount", "", "weight", "volume", "", "allBodyExercise", "", "Lxd1/c;", FirebaseAnalytics.Param.ITEMS, "primaryMuscles", "secondaryMuscles", "enabled", "selected", "<init>", "(Ljava/lang/String;JJDDZLjava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f190019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f190020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f190021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f190022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f190023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<c> f190024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<String> f190025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<String> f190026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f190027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f190028k;

    public /* synthetic */ d(String str, long j8, long j14, double d14, double d15, boolean z14, List list, List list2, List list3, boolean z15, boolean z16, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? 0L : j8, (i14 & 4) == 0 ? j14 : 0L, (i14 & 8) != 0 ? 0.0d : d14, (i14 & 16) == 0 ? d15 : 0.0d, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? new ArrayList() : list, (i14 & 128) != 0 ? new ArrayList() : list2, (i14 & 256) != 0 ? new ArrayList() : list3, (i14 & 512) == 0 ? z15 : true, (i14 & 1024) != 0 ? false : z16);
    }

    public final c a(String str) {
        String str2;
        Object next;
        str.getClass();
        List<c> list = this.f190024g;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                str2 = str;
                next = null;
                break;
            }
            next = it.next();
            str2 = str;
        } while (!str2.equals(((c) next).f190012a));
        c cVar = (c) next;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(str2, 0L, 0L, 0.0d, 0.0d, false, 62, null);
        list.add(cVar2);
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f190018a, dVar.f190018a) && this.f190019b == dVar.f190019b && this.f190020c == dVar.f190020c && Double.compare(this.f190021d, dVar.f190021d) == 0 && Double.compare(this.f190022e, dVar.f190022e) == 0 && this.f190023f == dVar.f190023f && s.g(this.f190024g, dVar.f190024g) && s.g(this.f190025h, dVar.f190025h) && s.g(this.f190026i, dVar.f190026i) && this.f190027j == dVar.f190027j && this.f190028k == dVar.f190028k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190028k) + f.g(u0.b(u0.b(u0.b(f.g(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(f.e(f.e(this.f190018a.hashCode() * 31, 31, this.f190019b), 31, this.f190020c), 31, this.f190021d), 31, this.f190022e), 31, this.f190023f), 31, this.f190024g), 31, this.f190025h), 31, this.f190026i), 31, this.f190027j);
    }

    public final String toString() {
        long j8 = this.f190019b;
        long j14 = this.f190020c;
        double d14 = this.f190021d;
        double d15 = this.f190022e;
        boolean z14 = this.f190023f;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "GroupedExerciseSummary(summaryName=", this.f190018a, ", durationInSecond=");
        x.j(j14, ", repCount=", ", weight=", sbJ);
        sbJ.append(d14);
        am.j.x(sbJ, ", volume=", d15, ", allBodyExercise=");
        sbJ.append(z14);
        sbJ.append(", items=");
        sbJ.append(this.f190024g);
        sbJ.append(", primaryMuscles=");
        n23.j.z(sbJ, this.f190025h, ", secondaryMuscles=", this.f190026i, ", enabled=");
        return com.airbnb.lottie.animation.keyframe.a.f(", selected=", ")", sbJ, this.f190027j, this.f190028k);
    }

    public d(String str, long j8, long j14, double d14, double d15, boolean z14, List<c> list, List<String> list2, List<String> list3, boolean z15, boolean z16) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f190018a = str;
        this.f190019b = j8;
        this.f190020c = j14;
        this.f190021d = d14;
        this.f190022e = d15;
        this.f190023f = z14;
        this.f190024g = list;
        this.f190025h = list2;
        this.f190026i = list3;
        this.f190027j = z15;
        this.f190028k = z16;
    }
}
