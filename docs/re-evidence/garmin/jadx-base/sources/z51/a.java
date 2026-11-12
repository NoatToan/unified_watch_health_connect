package z51;

import java.util.List;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;
import z41.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lz51/a;", "", "Lz51/h;", "pendingActivitySummary", "Lz51/d;", "mapDetails", "", "Lz51/c;", "heartRateMeasurements", "<init>", "(Lz51/h;Lz51/d;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILz51/h;Lz51/d;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f202463d = {null, null, m.a(n.PUBLICATION, new j(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f202464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f202465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c> f202466c;

    public a(int i14, h hVar, d dVar, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f202464a = null;
        } else {
            this.f202464a = hVar;
        }
        if ((i14 & 2) == 0) {
            this.f202465b = null;
        } else {
            this.f202465b = dVar;
        }
        if ((i14 & 4) == 0) {
            this.f202466c = j0.f134944a;
        } else {
            this.f202466c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f202464a, aVar.f202464a) && s.g(this.f202465b, aVar.f202465b) && s.g(this.f202466c, aVar.f202466c);
    }

    public final int hashCode() {
        h hVar = this.f202464a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        d dVar = this.f202465b;
        return this.f202466c.hashCode() + ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CompletePendingActivityDTO(pendingActivitySummary=");
        sb3.append(this.f202464a);
        sb3.append(", mapDetails=");
        sb3.append(this.f202465b);
        sb3.append(", heartRateMeasurements=");
        return z.c(sb3, this.f202466c, ")");
    }

    /* JADX INFO: renamed from: z51.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz51/a$b;", "", "<init>", "()V", "Li63/c;", "Lz51/a;", "serializer", "()Li63/c;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C3775a.f202467a;
        }

        private Companion() {
        }
    }

    public a() {
        this((h) null, (d) null, (List) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public a(h hVar, d dVar, List<c> list) {
        list.getClass();
        this.f202464a = hVar;
        this.f202465b = dVar;
        this.f202466c = list;
    }

    public a(h hVar, d dVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : hVar, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? j0.f134944a : list);
    }
}
