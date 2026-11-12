package ar2;

import androidx.lifecycle.j1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wr2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lar2/g;", "Lar2/a;", "Lar2/g$b;", "Landroidx/lifecycle/j1;", "savedStateHandle", "Ldr2/a;", "garminPayFacade", "<init>", "(Landroidx/lifecycle/j1;Ldr2/a;)V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends ar2.a<b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f12605g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ns2.a<ms2.f> f12606f;

    public interface b {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lar2/g$b$a;", "Lar2/g$b;", "Lms2/f;", "product", "", "deviceUnitId", "<init>", "(Lms2/f;J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ms2.f f12608a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f12609b;

            public a(ms2.f fVar, long j8) {
                fVar.getClass();
                this.f12608a = fVar;
                this.f12609b = j8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f12608a.equals(aVar.f12608a) && this.f12609b == aVar.f12609b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f12609b) + (this.f12608a.hashCode() * 31);
            }

            public final String toString() {
                return "NavigateToAddCard(product=" + this.f12608a + ", deviceUnitId=" + this.f12609b + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j1 j1Var, dr2.a aVar) {
        super(j1Var, aVar);
        j1Var.getClass();
        aVar.getClass();
        ns2.a<ms2.f> aVar2 = (ns2.a) j1Var.a("extra.products");
        this.f12606f = aVar2 == null ? gg.b.q(false) : aVar2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar2/g$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f12607a;

        private a() {
            hn2.f fVar = hn2.f.f84562a;
            fVar.getClass();
            this.f12607a = new m(fVar, "SelectProductViewModel");
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }
}
