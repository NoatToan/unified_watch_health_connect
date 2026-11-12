package w32;

import java.util.List;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u00012\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lw32/c;", "", "Lro0/i;", "extras", "Lc42/b;", "vo2MaxExtraData", "<init>", "(Lro0/i;Lc42/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILro0/i;Lc42/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ro0.i f181877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c42.b f181878b;

    public /* synthetic */ c(int i14, ro0.i iVar, c42.b bVar, u1 u1Var) {
        this.f181877a = (i14 & 1) == 0 ? new ro0.i(ro0.l.VO2_MAX, (String) null, 2, (p005kotlin.jvm.internal.j) null) : iVar;
        if ((i14 & 2) == 0) {
            this.f181878b = new c42.b((List) null, 1, (p005kotlin.jvm.internal.j) null);
        } else {
            this.f181878b = bVar;
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
        return s.g(this.f181877a, cVar.f181877a) && s.g(this.f181878b, cVar.f181878b);
    }

    public final int hashCode() {
        return this.f181878b.hashCode() + (this.f181877a.hashCode() * 31);
    }

    public final String toString() {
        return "Help(extras=" + this.f181877a + ", vo2MaxExtraData=" + this.f181878b + ")";
    }

    /* JADX INFO: renamed from: w32.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw32/c$b;", "", "<init>", "()V", "Li63/c;", "Lw32/c;", "serializer", "()Li63/c;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f181879a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this((ro0.i) null, (c42.b) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public c(ro0.i iVar, c42.b bVar) {
        iVar.getClass();
        bVar.getClass();
        this.f181877a = iVar;
        this.f181878b = bVar;
    }

    public /* synthetic */ c(ro0.i iVar, c42.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new ro0.i(ro0.l.VO2_MAX, (String) null, 2, (p005kotlin.jvm.internal.j) null) : iVar, (i14 & 2) != 0 ? new c42.b((List) null, 1, (p005kotlin.jvm.internal.j) null) : bVar);
    }
}
