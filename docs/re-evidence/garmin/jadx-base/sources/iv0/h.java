package iv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Liv0/h;", "", "Lpu0/b;", "recipient", "", "canResend", "<init>", "(Lpu0/b;Z)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu0.b f95101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95102b;

    public h(pu0.b bVar, boolean z14) {
        bVar.getClass();
        this.f95101a = bVar;
        this.f95102b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f95101a.equals(hVar.f95101a) && this.f95102b == hVar.f95102b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95102b) + (this.f95101a.hashCode() * 31);
    }

    public final String toString() {
        return "RecipientBottomSheetEvent(recipient=" + this.f95101a + ", canResend=" + this.f95102b + ")";
    }
}
