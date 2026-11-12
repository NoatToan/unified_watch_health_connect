package pv0;

import java.util.List;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lpv0/q;", "", "", "Lpv0/h;", "dailyLogsReport", "Lpv0/l;", "completionStats", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class q {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f141403c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f141404d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h> f141405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<l> f141406b;

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f141404d = new o13.l[]{o13.m.a(nVar, new pk0.m(9)), o13.m.a(nVar, new pk0.m(10))};
    }

    public /* synthetic */ q(int i14, List list, List list2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f141405a = null;
        } else {
            this.f141405a = list;
        }
        if ((i14 & 2) == 0) {
            this.f141406b = null;
        } else {
            this.f141406b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f141405a, qVar.f141405a) && p005kotlin.jvm.internal.s.g(this.f141406b, qVar.f141406b);
    }

    public final int hashCode() {
        List<h> list = this.f141405a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<l> list2 = this.f141406b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return c22.t.f("DailyLogsDTO(dailyLogsReport=", ", completionStats=", ")", this.f141405a, this.f141406b);
    }

    /* JADX INFO: renamed from: pv0.q$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpv0/q$b;", "", "<init>", "()V", "Li63/c;", "Lpv0/q;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<q> serializer() {
            return a.f141407a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public q(List<h> list, List<l> list2) {
        this.f141405a = list;
        this.f141406b = list2;
    }

    public /* synthetic */ q(List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2);
    }
}
