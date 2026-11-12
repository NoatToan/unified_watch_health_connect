package rw0;

import android.content.ComponentCallbacks;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrw0/m;", "", "Landroid/content/ComponentCallbacks;", "componentCallbacks", "Lrw0/j;", "lifecycleObserver", "<init>", "(Landroid/content/ComponentCallbacks;Lrw0/j;)V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentCallbacks f154849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f154850b;

    public m(ComponentCallbacks componentCallbacks, j jVar) {
        componentCallbacks.getClass();
        jVar.getClass();
        this.f154849a = componentCallbacks;
        this.f154850b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f154849a.equals(mVar.f154849a) && this.f154850b.equals(mVar.f154850b);
    }

    public final int hashCode() {
        return this.f154850b.hashCode() + (this.f154849a.hashCode() * 31);
    }

    public final String toString() {
        return "MapTagData(componentCallbacks=" + this.f154849a + ", lifecycleObserver=" + this.f154850b + ")";
    }
}
