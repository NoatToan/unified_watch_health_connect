package pv0;

import java.util.List;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\fB?\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lpv0/a0;", "", "", "userProfilePk", "", "calendarDate", "", "trackedBehaviours", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "Lb63/o;", "date", "(JLb63/o;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f141336d = {null, null, o13.m.a(o13.n.PUBLICATION, new pk0.m(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f141337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Long> f141339c;

    public /* synthetic */ a0(int i14, Long l14, String str, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f141337a = null;
        } else {
            this.f141337a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f141338b = null;
        } else {
            this.f141338b = str;
        }
        if ((i14 & 4) == 0) {
            this.f141339c = null;
        } else {
            this.f141339c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f141337a, a0Var.f141337a) && p005kotlin.jvm.internal.s.g(this.f141338b, a0Var.f141338b) && p005kotlin.jvm.internal.s.g(this.f141339c, a0Var.f141339c);
    }

    public final int hashCode() {
        Long l14 = this.f141337a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f141338b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Long> list = this.f141339c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return u62.z.c(b71.i.j("TrackedBehavioursDTO(userProfilePk=", ", calendarDate=", this.f141338b, this.f141337a, ", trackedBehaviours="), this.f141339c, ")");
    }

    /* JADX INFO: renamed from: pv0.a0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpv0/a0$b;", "", "<init>", "()V", "Li63/c;", "Lpv0/a0;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a0> serializer() {
            return a.f141340a;
        }

        private Companion() {
        }
    }

    public a0() {
        this((Long) null, (String) null, (List) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public a0(Long l14, String str, List<Long> list) {
        this.f141337a = l14;
        this.f141338b = str;
        this.f141339c = list;
    }

    public /* synthetic */ a0(Long l14, String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (List<Long>) ((i14 & 4) != 0 ? null : list));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(long j8, b63.o oVar, List<Long> list) {
        this(Long.valueOf(j8), fz0.d.a(oVar).toString(), list);
        oVar.getClass();
        list.getClass();
    }
}
