package xx;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxx/d;", "", "Lxx/e;", "filterType", "<init>", "(Lxx/e;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f192473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f192474b;

    public d(e eVar) {
        eVar.getClass();
        this.f192473a = eVar;
    }

    public final boolean a() {
        boolean zG = ((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).g(this.f192473a.f192495a);
        this.f192474b = zG;
        return zG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        d dVar = (d) obj;
        return this.f192473a == dVar.f192473a && this.f192474b == dVar.f192474b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192474b) + (this.f192473a.hashCode() * 31);
    }

    public final String toString() {
        return "CalendarFilterItem(filterType=" + this.f192473a + ")";
    }
}
