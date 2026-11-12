package l01;

import c22.t;
import java.util.List;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Ll01/c;", "", "", "Ll01/d;", "countries", "Ll01/f;", "languages", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f107840c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f107841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<f> f107842b;

    static {
        n nVar = n.PUBLICATION;
        f107840c = new o13.l[]{m.a(nVar, new b(0)), m.a(nVar, new b(1))};
    }

    public /* synthetic */ c(int i14, List list, List list2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f107841a = null;
        } else {
            this.f107841a = list;
        }
        if ((i14 & 2) == 0) {
            this.f107842b = null;
        } else {
            this.f107842b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f107841a, cVar.f107841a) && s.g(this.f107842b, cVar.f107842b);
    }

    public final int hashCode() {
        List<d> list = this.f107841a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<f> list2 = this.f107842b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return t.f("CountriesAndLanguagesDTO(countries=", ", languages=", ")", this.f107841a, this.f107842b);
    }

    /* JADX INFO: renamed from: l01.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll01/c$b;", "", "<init>", "()V", "Li63/c;", "Ll01/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f107843a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public c(List<d> list, List<f> list2) {
        this.f107841a = list;
        this.f107842b = list2;
    }

    public /* synthetic */ c(List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2);
    }
}
