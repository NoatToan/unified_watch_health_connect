package j23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj23/e;", "Lj23/f;", "", TtmlNode.START, "endInclusive", "<init>", "(FF)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f96789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f96790b;

    public e(float f14, float f15) {
        this.f96789a = f14;
        this.f96790b = f15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.f
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // j23.g
    public final Comparable b() {
        return Float.valueOf(this.f96790b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.g
    public final boolean contains(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.f96789a && fFloatValue <= this.f96790b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        float f14 = this.f96789a;
        float f15 = this.f96790b;
        if (f14 > f15) {
            e eVar = (e) obj;
            if (eVar.f96789a > eVar.f96790b) {
                return true;
            }
        }
        e eVar2 = (e) obj;
        return f14 == eVar2.f96789a && f15 == eVar2.f96790b;
    }

    @Override // j23.g, j23.r
    public final Comparable getStart() {
        return Float.valueOf(this.f96789a);
    }

    public final int hashCode() {
        float f14 = this.f96789a;
        float f15 = this.f96790b;
        if (f14 > f15) {
            return -1;
        }
        return Float.hashCode(f15) + (Float.hashCode(f14) * 31);
    }

    @Override // j23.g
    public final boolean isEmpty() {
        return this.f96789a > this.f96790b;
    }

    public final String toString() {
        return this.f96789a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f96790b;
    }
}
