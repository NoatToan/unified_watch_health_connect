package uy2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luy2/w0;", "", "Luy2/c;", "invocationResult", "", "description", "<init>", "(Luy2/c;Ljava/lang/String;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f173465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173466b;

    public w0(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        this.f173465a = cVar;
        this.f173466b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f173465a.equals(w0Var.f173465a) && this.f173466b.equals(w0Var.f173466b);
    }

    public final int hashCode() {
        return this.f173466b.hashCode() + (this.f173465a.hashCode() * 31);
    }

    public final String toString() {
        return "ReturnInfo(invocationResult=" + this.f173465a + ", description=" + this.f173466b + ")";
    }
}
