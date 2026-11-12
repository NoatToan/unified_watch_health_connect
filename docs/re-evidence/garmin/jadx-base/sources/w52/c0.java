package w52;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw52/c0;", "", "", "duration", "intensity", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(FFJLkotlin/jvm/internal/j;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f182484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f182485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f182486c;

    private c0(float f14, float f15, long j8) {
        this.f182484a = f14;
        this.f182485b = f15;
        this.f182486c = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Float.compare(this.f182484a, c0Var.f182484a) == 0 && Float.compare(this.f182485b, c0Var.f182485b) == 0 && o4.d0.d(this.f182486c, c0Var.f182486c);
    }

    public final int hashCode() {
        int iD = q6.f.d(this.f182485b, Float.hashCode(this.f182484a) * 31, 31);
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f182486c) + iD;
    }

    public final String toString() {
        return am.j.o(o4.d0.j(this.f182486c), ")", v.e0.i("StepData(duration=", this.f182484a, ", intensity=", this.f182485b, ", color="));
    }

    public /* synthetic */ c0(float f14, float f15, long j8, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, j8);
    }
}
