package xd1;

import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lxd1/c;", "", "", "itemName", "", "durationInSecond", "repCount", "", "weight", "volume", "", "bodyExercise", "<init>", "(Ljava/lang/String;JJDDZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f190013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f190014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f190015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f190016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f190017f;

    public /* synthetic */ c(String str, long j8, long j14, double d14, double d15, boolean z14, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? 0L : j8, (i14 & 4) != 0 ? 0L : j14, (i14 & 8) != 0 ? 0.0d : d14, (i14 & 16) != 0 ? 0.0d : d15, (i14 & 32) != 0 ? true : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f190012a, cVar.f190012a) && this.f190013b == cVar.f190013b && this.f190014c == cVar.f190014c && Double.compare(this.f190015d, cVar.f190015d) == 0 && Double.compare(this.f190016e, cVar.f190016e) == 0 && this.f190017f == cVar.f190017f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190017f) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(f.e(f.e(this.f190012a.hashCode() * 31, 31, this.f190013b), 31, this.f190014c), 31, this.f190015d), 31, this.f190016e);
    }

    public final String toString() {
        long j8 = this.f190013b;
        long j14 = this.f190014c;
        double d14 = this.f190015d;
        double d15 = this.f190016e;
        boolean z14 = this.f190017f;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "GroupedExerciseItem(itemName=", this.f190012a, ", durationInSecond=");
        x.j(j14, ", repCount=", ", weight=", sbJ);
        sbJ.append(d14);
        am.j.x(sbJ, ", volume=", d15, ", bodyExercise=");
        return hb.a.k(sbJ, z14, ")");
    }

    public c(String str, long j8, long j14, double d14, double d15, boolean z14) {
        str.getClass();
        this.f190012a = str;
        this.f190013b = j8;
        this.f190014c = j14;
        this.f190015d = d14;
        this.f190016e = d15;
        this.f190017f = z14;
    }
}
