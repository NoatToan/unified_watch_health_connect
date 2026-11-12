package bv2;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbv2/b;", "", "Lkotlin/Function0;", "Landroid/view/View;", "bannerView", "Lkotlin/Function1;", "", "", "isDeviceLinked", "<init>", "(Le23/a;Le23/l;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<View> f21464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<String, Boolean> f21465b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(e23.a<? extends View> aVar, e23.l<? super String, Boolean> lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f21464a = aVar;
        this.f21465b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21464a.equals(bVar.f21464a) && this.f21465b.equals(bVar.f21465b);
    }

    public final int hashCode() {
        return this.f21465b.hashCode() + (this.f21464a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomDeviceLinkBanner(bannerView=" + this.f21464a + ", isDeviceLinked=" + this.f21465b + ")";
    }
}
