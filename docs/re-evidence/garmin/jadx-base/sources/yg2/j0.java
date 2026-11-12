package yg2;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lyg2/j0;", "", "<init>", "()V", "b", "a", "Lyg2/j0$a;", "Lyg2/j0$b;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class j0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyg2/j0$a;", "Lyg2/j0;", "", Action.KEY_ATTRIBUTE, "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f197059a;

        public a(int i14) {
            super(null);
            this.f197059a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f197059a == ((a) obj).f197059a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f197059a);
        }

        public final String toString() {
            return v.e0.f(this.f197059a, "Resource(key=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyg2/j0$b;", "Lyg2/j0;", "Lyg2/i0;", "value", "", "fallbackTitleKey", "<init>", "(Lyg2/i0;I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f197060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f197061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i0 i0Var, int i14) {
            super(null);
            i0Var.getClass();
            this.f197060a = i0Var;
            this.f197061b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f197060a, bVar.f197060a) && this.f197061b == bVar.f197061b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f197061b) + (this.f197060a.hashCode() * 31);
        }

        public final String toString() {
            return "Verbatim(value=" + this.f197060a + ", fallbackTitleKey=" + this.f197061b + ")";
        }
    }

    public /* synthetic */ j0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public final nt2.e a(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        if (!(this instanceof b)) {
            if (!(this instanceof a)) {
                throw n23.j.m(mVar, 1794697785);
            }
            mVar.C(-198607471);
            String strQ = gl1.y.Q(mVar, ((a) this).f197059a);
            nt2.e eVar = new nt2.e(strQ, strQ);
            mVar.f();
            return eVar;
        }
        mVar.C(1794699396);
        b bVar = (b) this;
        i0 i0Var = bVar.f197060a;
        nt2.e eVar2 = i0Var.f197054b;
        nt2.e eVar3 = i0Var.f197054b;
        if (eVar2.f127844a.equals("--")) {
            mVar.C(-198799392);
            nt2.e eVar4 = new nt2.e(gl1.y.Q(mVar, bVar.f197061b), eVar3.f127845b);
            mVar.f();
            eVar3 = eVar4;
        } else {
            mVar.C(-198859532);
            mVar.f();
        }
        mVar.f();
        return eVar3;
    }

    private j0() {
    }
}
