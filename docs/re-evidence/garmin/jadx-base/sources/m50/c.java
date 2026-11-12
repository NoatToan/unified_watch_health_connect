package m50;

import java.util.List;
import l40.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lm50/c;", "", "", "isLoading", "", "Lw20/a;", "coursesData", "Ll40/d;", "courseMapOptions", "<init>", "(ZLjava/util/List;Ll40/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<w20.a> f116645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f116646c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(boolean z14, List list, d dVar, int i14, j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        list = (i14 & 2) != 0 ? null : list;
        if ((i14 & 4) != 0) {
            d.f109892n.getClass();
            dVar = d.a.a();
        }
        this(z14, list, dVar);
    }

    public static c a(c cVar, boolean z14, List list, d dVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = cVar.f116644a;
        }
        if ((i14 & 2) != 0) {
            list = cVar.f116645b;
        }
        if ((i14 & 4) != 0) {
            dVar = cVar.f116646c;
        }
        cVar.getClass();
        dVar.getClass();
        return new c(z14, list, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f116644a == cVar.f116644a && s.g(this.f116645b, cVar.f116645b) && s.g(this.f116646c, cVar.f116646c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f116644a) * 31;
        List<w20.a> list = this.f116645b;
        return this.f116646c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "CourseMapState(isLoading=" + this.f116644a + ", coursesData=" + this.f116645b + ", courseMapOptions=" + this.f116646c + ")";
    }

    public c(boolean z14, List<w20.a> list, d dVar) {
        dVar.getClass();
        this.f116644a = z14;
        this.f116645b = list;
        this.f116646c = dVar;
    }

    public c() {
        this(false, null, null, 7, null);
    }
}
