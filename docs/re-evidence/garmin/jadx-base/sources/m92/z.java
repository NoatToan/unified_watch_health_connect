package m92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm92/z;", "", "Lo4/d0;", "surfaceColor", "Lg6/f;", "rectangleCornerRadius", "Lq4/g;", TtmlNode.TAG_STYLE, "<init>", "(JFLq4/g;Lkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f117459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f117460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.g f117461c;

    /* JADX WARN: Illegal instructions before constructor call */
    public z(long j8, float f14, q4.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        this(j8, f14, (i14 & 4) != 0 ? q4.j.f142560a : gVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return o4.d0.d(this.f117459a, zVar.f117459a) && g6.f.c(this.f117460b, zVar.f117460b) && p005kotlin.jvm.internal.s.g(this.f117461c, zVar.f117461c);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        int iHashCode = Long.hashCode(this.f117459a) * 31;
        g6.f.a aVar3 = g6.f.f75994b;
        return this.f117461c.hashCode() + q6.f.d(this.f117460b, iHashCode, 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("IntervalConfig(surfaceColor=", o4.d0.j(this.f117459a), ", rectangleCornerRadius=", g6.f.d(this.f117460b), ", style=");
        sbI.append(this.f117461c);
        sbI.append(")");
        return sbI.toString();
    }

    private z(long j8, float f14, q4.g gVar) {
        gVar.getClass();
        this.f117459a = j8;
        this.f117460b = f14;
        this.f117461c = gVar;
    }

    public /* synthetic */ z(long j8, float f14, q4.g gVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, f14, gVar);
    }
}
