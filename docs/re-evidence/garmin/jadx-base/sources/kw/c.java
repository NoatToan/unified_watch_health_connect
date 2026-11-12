package kw;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkw/c;", "", "", "x", "", TtmlNode.ATTR_TTS_COLOR, "<init>", "(FLjava/lang/Integer;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f106830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f106831b;

    public c(float f14, Integer num) {
        this.f106830a = f14;
        this.f106831b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f106830a, cVar.f106830a) == 0 && p005kotlin.jvm.internal.s.g(this.f106831b, cVar.f106831b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f106830a) * 31;
        Integer num = this.f106831b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "BloodPressureChartPoint(x=" + this.f106830a + ", color=" + this.f106831b + ")";
    }
}
