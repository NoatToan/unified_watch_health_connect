package bo;

import bm.y;
import java.util.List;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lbo/d;", "", "", "Lbo/l;", "activityList", "Lbo/k;", "pagination", "Lbo/f;", "count", "<init>", "(Ljava/util/List;Lbo/k;Lbo/f;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lbo/k;Lbo/f;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f19101d = {o13.m.a(o13.n.PUBLICATION, new y(8)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<l> f19102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f19103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f19104c;

    public /* synthetic */ d(int i14, List list, k kVar, f fVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19102a = null;
        } else {
            this.f19102a = list;
        }
        if ((i14 & 2) == 0) {
            this.f19103b = null;
        } else {
            this.f19103b = kVar;
        }
        if ((i14 & 4) == 0) {
            this.f19104c = null;
        } else {
            this.f19104c = fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f19102a, dVar.f19102a) && s.g(this.f19103b, dVar.f19103b) && s.g(this.f19104c, dVar.f19104c);
    }

    public final int hashCode() {
        List<l> list = this.f19102a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        k kVar = this.f19103b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        f fVar = this.f19104c;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActivitySearchResultDTO(activityList=" + this.f19102a + ", pagination=" + this.f19103b + ", count=" + this.f19104c + ")";
    }

    /* JADX INFO: renamed from: bo.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/d$b;", "", "<init>", "()V", "Li63/c;", "Lbo/d;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f19105a;
        }

        private Companion() {
        }
    }

    public d() {
        this((List) null, (k) null, (f) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public d(List<l> list, k kVar, f fVar) {
        this.f19102a = list;
        this.f19103b = kVar;
        this.f19104c = fVar;
    }

    public /* synthetic */ d(List list, k kVar, f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : kVar, (i14 & 4) != 0 ? null : fVar);
    }
}
