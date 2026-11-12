package lh2;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llh2/c;", "", "Lkotlin/Function0;", "Landroid/view/View;", "bannerView", "Lkotlin/Function1;", "", "", "isDeviceLinked", "<init>", "(Le23/a;Le23/l;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<View> f112455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<String, Boolean> f112456b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(e23.a<? extends View> aVar, e23.l<? super String, Boolean> lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f112455a = aVar;
        this.f112456b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f112455a.equals(cVar.f112455a) && this.f112456b.equals(cVar.f112456b);
    }

    public final int hashCode() {
        return this.f112456b.hashCode() + (this.f112455a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomDeviceLinkBanner(bannerView=" + this.f112455a + ", isDeviceLinked=" + this.f112456b + ")";
    }
}
