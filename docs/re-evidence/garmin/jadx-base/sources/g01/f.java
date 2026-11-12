package g01;

import java.util.List;
import m63.u1;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lg01/f;", "", "", "Lg01/e;", "results", "", "hasMore", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74175c = {o13.m.a(o13.n.PUBLICATION, new fy1.h(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f74176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f74177b;

    public f(int i14, List list, boolean z14, u1 u1Var) {
        this.f74176a = (i14 & 1) == 0 ? j0.f134944a : list;
        if ((i14 & 2) == 0) {
            this.f74177b = false;
        } else {
            this.f74177b = z14;
        }
    }

    /* JADX INFO: renamed from: g01.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/f$b;", "", "<init>", "()V", "Li63/c;", "Lg01/f;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f74178a;
        }

        private Companion() {
        }
    }

    public f() {
        this((List) null, false, 3, (p005kotlin.jvm.internal.j) null);
    }

    public f(List<e> list, boolean z14) {
        list.getClass();
        this.f74176a = list;
        this.f74177b = z14;
    }

    public f(List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? false : z14);
    }
}
