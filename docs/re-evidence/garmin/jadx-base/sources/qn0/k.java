package qn0;

import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u00012\u00020\u0001:\u0002\f\rB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lqn0/k;", "", "Lro0/i;", "extras", "<init>", "(Lro0/i;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILro0/i;Lm63/u1;)V", "Companion", "a", "b", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ro0.i f145807a;

    static {
        ro0.i.Companion bVar = ro0.i.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(int i14, ro0.i iVar, u1 u1Var) {
        if ((i14 & 1) != 0) {
            this.f145807a = iVar;
        } else {
            this.f145807a = new ro0.i(ro0.l.HEALTH_STATUS, (String) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && p005kotlin.jvm.internal.s.g(this.f145807a, ((k) obj).f145807a);
    }

    public final int hashCode() {
        return this.f145807a.hashCode();
    }

    public final String toString() {
        return "Help(extras=" + this.f145807a + ")";
    }

    /* JADX INFO: renamed from: qn0.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqn0/k$b;", "", "<init>", "()V", "Li63/c;", "Lqn0/k;", "serializer", "()Li63/c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f145808a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this((ro0.i) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public k(ro0.i iVar) {
        iVar.getClass();
        this.f145807a = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(ro0.i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            iVar = new ro0.i(ro0.l.HEALTH_STATUS, (String) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }
        this(iVar);
    }
}
