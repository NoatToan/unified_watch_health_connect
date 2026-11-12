package j01;

import g01.i;
import i63.h;
import java.util.List;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lj01/d;", "", "", "Lg01/i;", "recipes", "", "moreDataAvailable", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f96010c = {m.a(n.PUBLICATION, new ik2.b(22)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f96011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f96012b;

    public d(int i14, List list, boolean z14, u1 u1Var) {
        this.f96011a = (i14 & 1) == 0 ? j0.f134944a : list;
        if ((i14 & 2) == 0) {
            this.f96012b = false;
        } else {
            this.f96012b = z14;
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
        return s.g(this.f96011a, dVar.f96011a) && this.f96012b == dVar.f96012b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96012b) + (this.f96011a.hashCode() * 31);
    }

    public final String toString() {
        return "RecipesResponseDTO(recipes=" + this.f96011a + ", moreDataAvailable=" + this.f96012b + ")";
    }

    /* JADX INFO: renamed from: j01.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj01/d$b;", "", "<init>", "()V", "Li63/c;", "Lj01/d;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f96013a;
        }

        private Companion() {
        }
    }

    public d() {
        this((List) null, false, 3, (j) null);
    }

    public d(List<i> list, boolean z14) {
        list.getClass();
        this.f96011a = list;
        this.f96012b = z14;
    }

    public d(List list, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? false : z14);
    }
}
