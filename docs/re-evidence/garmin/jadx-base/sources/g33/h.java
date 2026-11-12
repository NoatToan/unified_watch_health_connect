package g33;

import java.util.ArrayList;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements e33.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e33.d f75725c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f75726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f75727b = new ArrayList();

    static {
        new a(null);
        f75725c = new e33.d(s0.f105811a.b(h.class));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        h hVar = (h) obj;
        return this.f75726a == hVar.f75726a && s.g(this.f75727b, hVar.f75727b);
    }

    @Override // e33.c
    public final e33.d getType() {
        return f75725c;
    }

    public final int hashCode() {
        return this.f75727b.hashCode() + (Boolean.hashCode(this.f75726a) * 31);
    }

    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
