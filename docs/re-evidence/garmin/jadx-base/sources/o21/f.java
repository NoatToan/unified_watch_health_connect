package o21;

import b63.v;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo21/f;", "", "", TtmlNode.ATTR_ID, "", "name", "Lb63/v;", "startTime", "endTime", "Lo21/a;", "errorState", "<init>", "(JLjava/lang/String;Lb63/v;Lb63/v;Lo21/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f128669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f128671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f128672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f128673e;

    public f(long j8, String str, v vVar, v vVar2, a aVar) {
        str.getClass();
        vVar.getClass();
        vVar2.getClass();
        this.f128669a = j8;
        this.f128670b = str;
        this.f128671c = vVar;
        this.f128672d = vVar2;
        this.f128673e = aVar;
    }

    public static f a(f fVar, v vVar, v vVar2, a aVar, int i14) {
        long j8 = fVar.f128669a;
        String str = fVar.f128670b;
        if ((i14 & 4) != 0) {
            vVar = fVar.f128671c;
        }
        v vVar3 = vVar;
        if ((i14 & 8) != 0) {
            vVar2 = fVar.f128672d;
        }
        v vVar4 = vVar2;
        if ((i14 & 16) != 0) {
            aVar = fVar.f128673e;
        }
        str.getClass();
        vVar3.getClass();
        vVar4.getClass();
        return new f(j8, str, vVar3, vVar4, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f128669a == fVar.f128669a && s.g(this.f128670b, fVar.f128670b) && s.g(this.f128671c, fVar.f128671c) && s.g(this.f128672d, fVar.f128672d) && s.g(this.f128673e, fVar.f128673e);
    }

    public final int hashCode() {
        int iC = l2.c(this.f128672d.f16219a, l2.c(this.f128671c.f16219a, wr.g.j(Long.hashCode(this.f128669a) * 31, 31, this.f128670b), 31), 31);
        a aVar = this.f128673e;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f128669a, "LegacyMealWindowRowUIModel(id=", ", name=", this.f128670b);
        sbK.append(", startTime=");
        sbK.append(this.f128671c);
        sbK.append(", endTime=");
        sbK.append(this.f128672d);
        sbK.append(", errorState=");
        sbK.append(this.f128673e);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ f(long j8, String str, v vVar, v vVar2, a aVar, int i14, j jVar) {
        this(j8, str, vVar, vVar2, (i14 & 16) != 0 ? null : aVar);
    }
}
