package jv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljv1/i;", "Ljv1/h;", "", "distanceValue", "Lgg0/i;", "distanceUnit", "<init>", "(DLgg0/i;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f101059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gg0.i f101060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(double d14, gg0.i iVar) {
        super(Double.valueOf(d14), iVar, null);
        iVar.getClass();
        this.f101059c = d14;
        this.f101060d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Double.compare(this.f101059c, iVar.f101059c) == 0 && this.f101060d == iVar.f101060d;
    }

    public final int hashCode() {
        return this.f101060d.hashCode() + (Double.hashCode(this.f101059c) * 31);
    }

    public final String toString() {
        return "FBTATime(distanceValue=" + this.f101059c + ", distanceUnit=" + this.f101060d + ")";
    }
}
