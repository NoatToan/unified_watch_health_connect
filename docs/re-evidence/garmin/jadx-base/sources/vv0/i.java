package vv0;

import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u00012\u00020\u0001:\u0002\f\rB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lvv0/i;", "", "Lro0/i;", "extras", "<init>", "(Lro0/i;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILro0/i;Lm63/u1;)V", "Companion", "a", "b", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ro0.i f180452a;

    static {
        ro0.i.Companion companion = ro0.i.INSTANCE;
    }

    public /* synthetic */ i(int i14, ro0.i iVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f180452a = new ro0.i(ro0.l.LIFESTYLE_LOGGING, (String) null, 2, (p005kotlin.jvm.internal.j) null);
        } else {
            this.f180452a = iVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && p005kotlin.jvm.internal.s.g(this.f180452a, ((i) obj).f180452a);
    }

    public final int hashCode() {
        return this.f180452a.hashCode();
    }

    public final String toString() {
        return "Help(extras=" + this.f180452a + ")";
    }

    /* JADX INFO: renamed from: vv0.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvv0/i$b;", "", "<init>", "()V", "Li63/c;", "Lvv0/i;", "serializer", "()Li63/c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f180453a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this((ro0.i) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public i(ro0.i iVar) {
        iVar.getClass();
        this.f180452a = iVar;
    }

    public /* synthetic */ i(ro0.i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new ro0.i(ro0.l.LIFESTYLE_LOGGING, (String) null, 2, (p005kotlin.jvm.internal.j) null) : iVar);
    }
}
