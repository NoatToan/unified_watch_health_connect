package fs;

import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.maps.MapboxMap;
import j20.x;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfs/e;", "", "Lfs/b;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "urlSelected", "", "Lfs/g;", "urlsModels", "Ln4/c;", MapboxMap.QFE_OFFSET, "", "scale", "rotation", "<init>", "(Lfs/b;ILjava/util/List;JFFLkotlin/jvm/internal/j;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f73380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<g> f73382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f73383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f73384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f73385f;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(b bVar, int i14, List list, long j8, float f14, float f15, int i15, p005kotlin.jvm.internal.j jVar) {
        long j14;
        if ((i15 & 8) != 0) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            j14 = jFloatToRawIntBits;
        } else {
            j14 = j8;
        }
        this(bVar, i14, list, j14, (i15 & 16) != 0 ? 1.0f : f14, (i15 & 32) != 0 ? 0.0f : f15, null);
    }

    public final f a(n4.d dVar, boolean z14) {
        dVar.getClass();
        String strC = kg.f.c();
        long j8 = this.f73383d;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float f14 = dVar.f123549c;
        float f15 = dVar.f123547a;
        float f16 = f14 - f15;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        float f17 = dVar.f123550d;
        float f18 = dVar.f123548b;
        float fA = x.a(f17, f18, fIntBitsToFloat2, f18);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((fIntBitsToFloat * f16) + f15)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fA)));
        n4.c.a aVar = n4.c.f123541b;
        float f19 = this.f73384e;
        if (!z14) {
            f19 *= f16;
        }
        float f22 = f19;
        return new f(strC, this.f73382c, this.f73380a, jFloatToRawIntBits, this.f73381b, f22, this.f73385f, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f73380a == eVar.f73380a && this.f73381b == eVar.f73381b && s.g(this.f73382c, eVar.f73382c) && n4.c.d(this.f73383d, eVar.f73383d) && Float.compare(this.f73384e, eVar.f73384e) == 0 && Float.compare(this.f73385f, eVar.f73385f) == 0;
    }

    public final int hashCode() {
        b bVar = this.f73380a;
        int iB = u0.b(q2.d(this.f73381b, (bVar == null ? 0 : bVar.hashCode()) * 31, 31), 31, this.f73382c);
        n4.c.a aVar = n4.c.f123541b;
        return Float.hashCode(this.f73385f) + q6.f.d(this.f73384e, q6.f.e(iB, 31, this.f73383d), 31);
    }

    public final String toString() {
        String strL = n4.c.l(this.f73383d);
        StringBuilder sb3 = new StringBuilder("StickerModel(type=");
        sb3.append(this.f73380a);
        sb3.append(", urlSelected=");
        sb3.append(this.f73381b);
        sb3.append(", urlsModels=");
        o2.c.n(", offset=", strL, ", scale=", sb3, this.f73382c);
        sb3.append(this.f73384e);
        sb3.append(", rotation=");
        sb3.append(this.f73385f);
        sb3.append(")");
        return sb3.toString();
    }

    private e(b bVar, int i14, List<g> list, long j8, float f14, float f15) {
        list.getClass();
        this.f73380a = bVar;
        this.f73381b = i14;
        this.f73382c = list;
        this.f73383d = j8;
        this.f73384e = f14;
        this.f73385f = f15;
    }

    public /* synthetic */ e(b bVar, int i14, List list, long j8, float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(bVar, i14, list, j8, f14, f15);
    }
}
