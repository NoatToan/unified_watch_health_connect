package s30;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls30/a;", "", "Lcom/garmin/android/library/mapsdkadapter/f;", ModelSourceWrapper.POSITION, "", "bearing", "", "isBidirectional", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;FZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.f f156397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f156398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156399c;

    static {
        com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
    }

    public a(com.garmin.android.library.mapsdkadapter.f fVar, float f14, boolean z14) {
        fVar.getClass();
        this.f156397a = fVar;
        this.f156398b = f14;
        this.f156399c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f156397a, aVar.f156397a) && Float.compare(this.f156398b, aVar.f156398b) == 0 && this.f156399c == aVar.f156399c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156399c) + q6.f.d(this.f156398b, this.f156397a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DirectionArrow(position=");
        sb3.append(this.f156397a);
        sb3.append(", bearing=");
        sb3.append(this.f156398b);
        sb3.append(", isBidirectional=");
        return hb.a.k(sb3, this.f156399c, ")");
    }

    public /* synthetic */ a(com.garmin.android.library.mapsdkadapter.f fVar, float f14, boolean z14, int i14, j jVar) {
        this(fVar, f14, (i14 & 4) != 0 ? false : z14);
    }
}
