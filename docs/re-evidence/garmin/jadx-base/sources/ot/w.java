package ot;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lot/w;", "", "", "scale", "Lo13/p;", "contentAreaSize", "<init>", "(FLo13/p;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f133696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.p<Float, Float> f133697b;

    public w(float f14, o13.p<Float, Float> pVar) {
        pVar.getClass();
        this.f133696a = f14;
        this.f133697b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f133696a, wVar.f133696a) == 0 && this.f133697b.equals(wVar.f133697b);
    }

    public final int hashCode() {
        return this.f133697b.hashCode() + (Float.hashCode(this.f133696a) * 31);
    }

    public final String toString() {
        return "ResponsiveResult(scale=" + this.f133696a + ", contentAreaSize=" + this.f133697b + ")";
    }
}
