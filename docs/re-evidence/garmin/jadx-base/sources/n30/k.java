package n30;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln30/k;", "", "", "Lw20/a;", "coursesData", "", "selIndex", "Ln30/e;", "courseParameters", "<init>", "(Ljava/util/List;ILn30/e;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<w20.a> f123522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f123523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f123524c;

    public /* synthetic */ k(List list, int i14, e eVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? null : eVar);
    }

    public static k a(k kVar, ArrayList arrayList, int i14, e eVar, int i15) {
        List<w20.a> list = arrayList;
        if ((i15 & 1) != 0) {
            list = kVar.f123522a;
        }
        if ((i15 & 2) != 0) {
            i14 = kVar.f123523b;
        }
        if ((i15 & 4) != 0) {
            eVar = kVar.f123524c;
        }
        kVar.getClass();
        return new k(list, i14, eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f123522a, kVar.f123522a) && this.f123523b == kVar.f123523b && s.g(this.f123524c, kVar.f123524c);
    }

    public final int hashCode() {
        List<w20.a> list = this.f123522a;
        int iD = q2.d(this.f123523b, (list == null ? 0 : list.hashCode()) * 31, 31);
        e eVar = this.f123524c;
        return iD + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "MultipleCoursesStackEntry(coursesData=" + this.f123522a + ", selIndex=" + this.f123523b + ", courseParameters=" + this.f123524c + ")";
    }

    public k(List<w20.a> list, int i14, e eVar) {
        this.f123522a = list;
        this.f123523b = i14;
        this.f123524c = eVar;
    }

    public k() {
        this(null, 0, null, 7, null);
    }
}
