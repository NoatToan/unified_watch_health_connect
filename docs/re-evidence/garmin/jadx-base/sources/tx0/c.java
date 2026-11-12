package tx0;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;
import ww0.p;
import ww0.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltx0/c;", "", "", "Lww0/t;", "symptoms", "Lww0/p;", "moods", "Lww0/e;", "discharge", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<t> f166823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<p> f166824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<ww0.e> f166825c;

    public c(List list, List list2, List list3, int i14, j jVar) {
        this((i14 & 1) != 0 ? t.X : list, (i14 & 2) != 0 ? p.f187640n : list2, (i14 & 4) != 0 ? ww0.e.f187554m : list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f166823a, cVar.f166823a) && s.g(this.f166824b, cVar.f166824b) && s.g(this.f166825c, cVar.f166825c);
    }

    public final int hashCode() {
        return this.f166825c.hashCode() + u0.b(this.f166823a.hashCode() * 31, 31, this.f166824b);
    }

    public final String toString() {
        return z.c(f3.k("MenstrualCycleSymptomsOptionOrder(symptoms=", ", moods=", ", discharge=", this.f166823a, this.f166824b), this.f166825c, ")");
    }

    public c() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends t> list, List<? extends p> list2, List<? extends ww0.e> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f166823a = list;
        this.f166824b = list2;
        this.f166825c = list3;
    }
}
