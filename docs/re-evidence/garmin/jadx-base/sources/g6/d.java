package g6;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg6/d;", "Lg6/c;", "", "density", "fontScale", "<init>", "(FF)V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f75989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f75990b;

    public d(float f14, float f15) {
        this.f75989a = f14;
        this.f75990b = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f75989a, dVar.f75989a) == 0 && Float.compare(this.f75990b, dVar.f75990b) == 0;
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public final float getF75989a() {
        return this.f75989a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f75990b) + (Float.hashCode(this.f75989a) * 31);
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0, reason: from getter */
    public final float getF75990b() {
        return this.f75990b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DensityImpl(density=");
        sb3.append(this.f75989a);
        sb3.append(", fontScale=");
        return q6.f.p(sb3, this.f75990b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
