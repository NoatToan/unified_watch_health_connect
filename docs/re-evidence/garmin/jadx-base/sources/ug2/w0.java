package ug2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lug2/w0;", "", "", "visible", "Lyf2/a;", "valueEstimationType", "<init>", "(ZLyf2/a;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f171061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf2.a f171062b;

    public /* synthetic */ w0(boolean z14, yf2.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f171061a == w0Var.f171061a && this.f171062b == w0Var.f171062b;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f171061a) * 31;
        yf2.a aVar = this.f171062b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "ValueEstimationDialogState(visible=" + this.f171061a + ", valueEstimationType=" + this.f171062b + ")";
    }

    public w0(boolean z14, yf2.a aVar) {
        this.f171061a = z14;
        this.f171062b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w0() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
