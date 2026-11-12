package pv0;

import java.util.List;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lpv0/v;", "", "", "avgValue", "", "Lpv0/c;", "behaviours", "", "negativeHighestImpactId", "positiveHighestImpactId", "<init>", "(Ljava/lang/Double;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f141426e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f141427f = {null, o13.m.a(o13.n.PUBLICATION, new pk0.m(11)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f141428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f141429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f141430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f141431d;

    public /* synthetic */ v(int i14, Double d14, List list, Long l14, Long l15, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f141428a = null;
        } else {
            this.f141428a = d14;
        }
        if ((i14 & 2) == 0) {
            this.f141429b = null;
        } else {
            this.f141429b = list;
        }
        if ((i14 & 4) == 0) {
            this.f141430c = null;
        } else {
            this.f141430c = l14;
        }
        if ((i14 & 8) == 0) {
            this.f141431d = null;
        } else {
            this.f141431d = l15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f141428a, vVar.f141428a) && p005kotlin.jvm.internal.s.g(this.f141429b, vVar.f141429b) && p005kotlin.jvm.internal.s.g(this.f141430c, vVar.f141430c) && p005kotlin.jvm.internal.s.g(this.f141431d, vVar.f141431d);
    }

    public final int hashCode() {
        Double d14 = this.f141428a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        List<c> list = this.f141429b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l14 = this.f141430c;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f141431d;
        return iHashCode3 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        return "MultipleMetricStatDTO(avgValue=" + this.f141428a + ", behaviours=" + this.f141429b + ", negativeHighestImpactId=" + this.f141430c + ", positiveHighestImpactId=" + this.f141431d + ")";
    }

    /* JADX INFO: renamed from: pv0.v$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpv0/v$b;", "", "<init>", "()V", "Li63/c;", "Lpv0/v;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<v> serializer() {
            return a.f141432a;
        }

        private Companion() {
        }
    }

    public v() {
        this((Double) null, (List) null, (Long) null, (Long) null, 15, (p005kotlin.jvm.internal.j) null);
    }

    public v(Double d14, List<c> list, Long l14, Long l15) {
        this.f141428a = d14;
        this.f141429b = list;
        this.f141430c = l14;
        this.f141431d = l15;
    }

    public /* synthetic */ v(Double d14, List list, Long l14, Long l15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : l15);
    }
}
