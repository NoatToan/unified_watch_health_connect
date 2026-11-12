package g21;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg21/e0;", "", "", "value", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Ljava/lang/Float;JLkotlin/jvm/internal/j;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f75413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f75414b;

    private e0(Float f14, long j8) {
        this.f75413a = f14;
        this.f75414b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.f75413a, e0Var.f75413a) && o4.d0.d(this.f75414b, e0Var.f75414b);
    }

    public final int hashCode() {
        Float f14 = this.f75413a;
        int iHashCode = f14 == null ? 0 : f14.hashCode();
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f75414b) + (iHashCode * 31);
    }

    public final String toString() {
        return "SegmentData(value=" + this.f75413a + ", color=" + o4.d0.j(this.f75414b) + ")";
    }

    public /* synthetic */ e0(Float f14, long j8, p005kotlin.jvm.internal.j jVar) {
        this(f14, j8);
    }
}
