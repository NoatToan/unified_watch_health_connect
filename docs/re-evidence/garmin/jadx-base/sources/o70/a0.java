package o70;

import n70.p1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo70/a0;", "", "Ln70/p1$a;", "deviceInfo", "", "hasUnreadNotifications", "Lo70/x;", "syncState", "<init>", "(Ln70/p1$a;ZLo70/x;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.a f129912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f129914c;

    public a0(p1.a aVar, boolean z14, x xVar) {
        xVar.getClass();
        this.f129912a = aVar;
        this.f129913b = z14;
        this.f129914c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f129912a, a0Var.f129912a) && this.f129913b == a0Var.f129913b && this.f129914c.equals(a0Var.f129914c);
    }

    public final int hashCode() {
        p1.a aVar = this.f129912a;
        return this.f129914c.hashCode() + q6.f.g((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f129913b);
    }

    public final String toString() {
        return "ToolbarData(deviceInfo=" + this.f129912a + ", hasUnreadNotifications=" + this.f129913b + ", syncState=" + this.f129914c + ")";
    }
}
