package tq0;

import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import m63.u1;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Ltq0/d;", "", "", "Ltq0/a;", "activityMapping", "", "ages", "Ltq0/k;", "dates", "Ltq0/e;", "genders", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f166046e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<tq0.a> f166047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f166048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<k> f166049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f166050d;

    static {
        n nVar = n.PUBLICATION;
        f166046e = new o13.l[]{o13.m.a(nVar, new tk0.a(20)), o13.m.a(nVar, new tk0.a(21)), o13.m.a(nVar, new tk0.a(22)), o13.m.a(nVar, new tk0.a(23))};
    }

    public /* synthetic */ d(int i14, List list, List list2, List list3, List list4, u1 u1Var) {
        this.f166047a = (i14 & 1) == 0 ? new ArrayList() : list;
        if ((i14 & 2) == 0) {
            this.f166048b = new ArrayList();
        } else {
            this.f166048b = list2;
        }
        if ((i14 & 4) == 0) {
            this.f166049c = new ArrayList();
        } else {
            this.f166049c = list3;
        }
        if ((i14 & 8) == 0) {
            this.f166050d = new ArrayList();
        } else {
            this.f166050d = list4;
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
        return s.g(this.f166047a, dVar.f166047a) && s.g(this.f166048b, dVar.f166048b) && s.g(this.f166049c, dVar.f166049c) && s.g(this.f166050d, dVar.f166050d);
    }

    public final int hashCode() {
        return this.f166050d.hashCode() + u0.b(u0.b(this.f166047a.hashCode() * 31, 31, this.f166048b), 31, this.f166049c);
    }

    public final String toString() {
        return n23.j.j(f3.k("DemographicSelectionDTO(activityMapping=", ", ages=", ", dates=", this.f166047a, this.f166048b), this.f166049c, ", genders=", this.f166050d, ")");
    }

    /* JADX INFO: renamed from: tq0.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltq0/d$b;", "", "<init>", "()V", "Li63/c;", "Ltq0/d;", "serializer", "()Li63/c;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f166051a;
        }

        private Companion() {
        }
    }

    public d() {
        this((List) null, (List) null, (List) null, (List) null, 15, (p005kotlin.jvm.internal.j) null);
    }

    public d(List<tq0.a> list, List<String> list2, List<k> list3, List<e> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f166047a = list;
        this.f166048b = list2;
        this.f166049c = list3;
        this.f166050d = list4;
    }

    public /* synthetic */ d(List list, List list2, List list3, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new ArrayList() : list, (i14 & 2) != 0 ? new ArrayList() : list2, (i14 & 4) != 0 ? new ArrayList() : list3, (i14 & 8) != 0 ? new ArrayList() : list4);
    }
}
