package w20;

import ab1.g;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw20/e;", "", "Lab1/g;", "powerGuide", "Lw01/c;", "nutritionAndHydration", "<init>", "(Lab1/g;Lw01/c;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f181494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w01.c f181495b;

    static {
        Parcelable.Creator<w01.c> creator = w01.c.CREATOR;
        g.Companion companion = g.INSTANCE;
    }

    public e(g gVar, w01.c cVar) {
        gVar.getClass();
        this.f181494a = gVar;
        this.f181495b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f181494a.equals(eVar.f181494a) && s.g(this.f181495b, eVar.f181495b);
    }

    public final int hashCode() {
        int iHashCode = this.f181494a.hashCode() * 31;
        w01.c cVar = this.f181495b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "PowerGuideData(powerGuide=" + this.f181494a + ", nutritionAndHydration=" + this.f181495b + ")";
    }
}
