package o51;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import f12.l;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo51/j;", "", "Lt41/f;", "paceProRaceDistance", "", "customDistance", "Ln02/g;", "unit", "", "goalTimeSeconds", "goalPaceSeconds", "<init>", "(Lt41/f;Ljava/lang/Double;Ln02/g;II)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t41.f f129272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f129273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n02.g f129274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f129275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f129276e;

    public /* synthetic */ j(t41.f fVar, Double d14, n02.g gVar, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? null : fVar, (i16 & 2) != 0 ? null : d14, (i16 & 4) != 0 ? ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? n02.g.KILOMETERS : n02.g.MILES : gVar, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? 0 : i15);
    }

    public static j a(j jVar, t41.f fVar, Double d14, n02.g gVar, int i14, int i15, int i16) {
        if ((i16 & 1) != 0) {
            fVar = jVar.f129272a;
        }
        t41.f fVar2 = fVar;
        if ((i16 & 2) != 0) {
            d14 = jVar.f129273b;
        }
        Double d15 = d14;
        if ((i16 & 4) != 0) {
            gVar = jVar.f129274c;
        }
        n02.g gVar2 = gVar;
        if ((i16 & 8) != 0) {
            i14 = jVar.f129275d;
        }
        int i17 = i14;
        if ((i16 & 16) != 0) {
            i15 = jVar.f129276e;
        }
        jVar.getClass();
        gVar2.getClass();
        return new j(fVar2, d15, gVar2, i17, i15);
    }

    public final double b() {
        t41.f fVar = this.f129272a;
        if (fVar != null && fVar != t41.f.OTHER) {
            return fVar.f162291b;
        }
        Double d14 = this.f129273b;
        return this.f129274c.b(d14 != null ? d14.doubleValue() : 0.0d);
    }

    public final int c() {
        return (int) ((b() / 1609.344d) * ((double) DateTimeConstants.SECONDS_PER_HOUR));
    }

    public final int d() {
        return (int) ((b() / 1609.344d) * ((double) PsExtractor.VIDEO_STREAM_MASK));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f129272a == jVar.f129272a && s.g(this.f129273b, jVar.f129273b) && this.f129274c == jVar.f129274c && this.f129275d == jVar.f129275d && this.f129276e == jVar.f129276e;
    }

    public final int hashCode() {
        t41.f fVar = this.f129272a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        Double d14 = this.f129273b;
        return Integer.hashCode(this.f129276e) + q2.d(this.f129275d, (this.f129274c.hashCode() + ((iHashCode + (d14 != null ? d14.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PaceProWizardState(paceProRaceDistance=");
        sb3.append(this.f129272a);
        sb3.append(", customDistance=");
        sb3.append(this.f129273b);
        sb3.append(", unit=");
        sb3.append(this.f129274c);
        sb3.append(", goalTimeSeconds=");
        sb3.append(this.f129275d);
        sb3.append(", goalPaceSeconds=");
        return am.j.q(sb3, this.f129276e, ")");
    }

    public j(t41.f fVar, Double d14, n02.g gVar, int i14, int i15) {
        gVar.getClass();
        this.f129272a = fVar;
        this.f129273b = d14;
        this.f129274c = gVar;
        this.f129275d = i14;
        this.f129276e = i15;
    }

    public j() {
        this(null, null, null, 0, 0, 31, null);
    }
}
