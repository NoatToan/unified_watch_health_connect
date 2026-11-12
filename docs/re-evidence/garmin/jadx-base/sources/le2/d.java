package le2;

import com.garmin.android.library.mapsdkadapter.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.p;
import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lle2/d;", "", "", TtmlNode.ATTR_ID, "Li53/c;", "Lke2/b;", "points", "Lkotlin/Function2;", "", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "width", "", TtmlNode.ATTR_TTS_COLOR, "borderWidth", "borderColor", "zIndex", "<init>", "(JLi53/c;Le23/p;ILe23/p;IF)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f112062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<ke2.b> f112063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<Float, i.d, Float> f112064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<Float, i.d, Float> f112066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f112067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f112068g;

    public d(long j8, i53.c cVar, p pVar, int i14, p pVar2, int i15, float f14, int i16, j jVar) {
        this((i16 & 1) != 0 ? -1L : j8, (i16 & 2) != 0 ? l.b() : cVar, (i16 & 4) != 0 ? new l71.i(15) : pVar, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? new l71.i(16) : pVar2, (i16 & 32) == 0 ? i15 : 0, (i16 & 64) != 0 ? 0.0f : f14);
    }

    public static d a(d dVar, p pVar) {
        long j8 = dVar.f112062a;
        i53.c<ke2.b> cVar = dVar.f112063b;
        p<Float, i.d, Float> pVar2 = dVar.f112064c;
        int i14 = dVar.f112065d;
        int i15 = dVar.f112067f;
        float f14 = dVar.f112068g;
        dVar.getClass();
        cVar.getClass();
        pVar2.getClass();
        return new d(j8, cVar, pVar2, i14, pVar, i15, f14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f112062a == dVar.f112062a && s.g(this.f112063b, dVar.f112063b) && s.g(this.f112064c, dVar.f112064c) && this.f112065d == dVar.f112065d && s.g(this.f112066e, dVar.f112066e) && this.f112067f == dVar.f112067f && Float.compare(this.f112068g, dVar.f112068g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f112068g) + q2.d(this.f112067f, (this.f112066e.hashCode() + q2.d(this.f112065d, (this.f112064c.hashCode() + l2.a(this.f112063b, Long.hashCode(this.f112062a) * 31, 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "PolylineState(id=" + this.f112062a + ", points=" + this.f112063b + ", width=" + this.f112064c + ", color=" + this.f112065d + ", borderWidth=" + this.f112066e + ", borderColor=" + this.f112067f + ", zIndex=" + this.f112068g + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(long j8, i53.c<ke2.b> cVar, p<? super Float, ? super i.d, Float> pVar, int i14, p<? super Float, ? super i.d, Float> pVar2, int i15, float f14) {
        cVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        this.f112062a = j8;
        this.f112063b = cVar;
        this.f112064c = pVar;
        this.f112065d = i14;
        this.f112066e = pVar2;
        this.f112067f = i15;
        this.f112068g = f14;
    }

    public d() {
        this(0L, null, null, 0, null, 0, 0.0f, 127, null);
    }
}
