package dh0;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldh0/l;", "", "Ldh0/m;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "value", "<init>", "(Ldh0/m;Ljava/lang/Double;)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f59608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f59609b;

    public l(m mVar, Double d14) {
        mVar.getClass();
        this.f59608a = mVar;
        this.f59609b = d14;
    }

    public static l a(l lVar) {
        m mVar = lVar.f59608a;
        mVar.getClass();
        return new l(mVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f59608a == lVar.f59608a && s.g(this.f59609b, lVar.f59609b);
    }

    public final int hashCode() {
        int iHashCode = this.f59608a.hashCode() * 31;
        Double d14 = this.f59609b;
        return iHashCode + (d14 == null ? 0 : d14.hashCode());
    }

    public final String toString() {
        return "RangeValue(type=" + this.f59608a + ", value=" + this.f59609b + ")";
    }

    public /* synthetic */ l(m mVar, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(mVar, (i14 & 2) != 0 ? null : d14);
    }
}
