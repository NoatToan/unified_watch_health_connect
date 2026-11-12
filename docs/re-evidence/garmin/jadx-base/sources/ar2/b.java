package ar2;

import android.os.Parcelable;
import androidx.lifecycle.j1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wr2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lar2/b;", "Lar2/a;", "Lar2/b$b;", "Landroidx/lifecycle/j1;", "savedStateHandle", "Ldr2/a;", "garminPayFacade", "<init>", "(Landroidx/lifecycle/j1;Ldr2/a;)V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ar2.a<InterfaceC0177b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f12578g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ns2.a<ms2.e> f12579f;

    /* JADX INFO: renamed from: ar2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0177b {

        /* JADX INFO: renamed from: ar2.b$b$a */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lar2/b$b$a;", "Lar2/b$b;", "Lqs2/e;", "category", "Lns2/a;", "Lms2/e;", "operators", "", "deviceUnitId", "", "deviceName", "<init>", "(Lqs2/e;Lns2/a;JLjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC0177b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final qs2.e f12581a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ns2.a<ms2.e> f12582b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f12583c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f12584d;

            static {
                Parcelable.Creator<ns2.a<?>> creator = ns2.a.CREATOR;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(qs2.e eVar, ns2.a<? extends ms2.e> aVar, long j8, String str) {
                eVar.getClass();
                aVar.getClass();
                str.getClass();
                this.f12581a = eVar;
                this.f12582b = aVar;
                this.f12583c = j8;
                this.f12584d = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f12581a == aVar.f12581a && this.f12582b.equals(aVar.f12582b) && this.f12583c == aVar.f12583c && this.f12584d.equals(aVar.f12584d);
            }

            public final int hashCode() {
                return this.f12584d.hashCode() + q6.f.e((this.f12582b.hashCode() + (this.f12581a.hashCode() * 31)) * 31, 31, this.f12583c);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("NavigateToSelectOperator(category=");
                sb3.append(this.f12581a);
                sb3.append(", operators=");
                sb3.append(this.f12582b);
                sb3.append(", deviceUnitId=");
                p6.b.k(this.f12583c, ", deviceName=", this.f12584d, sb3);
                sb3.append(")");
                return sb3.toString();
            }
        }

        /* JADX INFO: renamed from: ar2.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar2/b$b$b;", "Lar2/b$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0178b implements InterfaceC0177b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0178b f12585a = new C0178b();

            private C0178b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0178b);
            }

            public final int hashCode() {
                return -843340392;
            }

            public final String toString() {
                return "ShowCardUnavailableDialog";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j1 j1Var, dr2.a aVar) {
        super(j1Var, aVar);
        j1Var.getClass();
        aVar.getClass();
        ns2.a<ms2.e> aVar2 = (ns2.a) j1Var.a("extra.operators");
        this.f12579f = aVar2 == null ? gg.b.q(false) : aVar2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar2/b$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f12580a;

        private a() {
            hn2.f fVar = hn2.f.f84562a;
            fVar.getClass();
            this.f12580a = new m(fVar, "SelectCategoryViewModel");
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }
}
