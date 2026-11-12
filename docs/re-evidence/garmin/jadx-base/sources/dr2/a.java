package dr2;

import am.j;
import android.content.Context;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import java.util.List;
import ms2.f;
import ms2.g;
import o13.r;
import org.apache.commons.lang3.e;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.jvm.internal.s;
import p13.x;
import ps2.n;
import ps2.w;
import v.e0;
import v13.c;
import vb.h;
import wr2.m;
import zn2.q3;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ldr2/a;", "", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f60852a = new b(null);

    /* JADX INFO: renamed from: dr2.a$a, reason: collision with other inner class name */
    public interface InterfaceC1294a {

        /* JADX INFO: renamed from: dr2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr2/a$a$a;", "Ldr2/a$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1295a implements InterfaceC1294a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1295a f60853a = new C1295a();

            private C1295a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1295a);
            }

            public final int hashCode() {
                return 1100546256;
            }

            public final String toString() {
                return "DeviceDisconnected";
            }
        }

        /* JADX INFO: renamed from: dr2.a$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr2/a$a$b;", "Ldr2/a$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b implements InterfaceC1294a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f60854a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 893459152;
            }

            public final String toString() {
                return "GenericError";
            }
        }

        /* JADX INFO: renamed from: dr2.a$a$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldr2/a$a$c;", "Ldr2/a$a;", "", "productDisplayName", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c implements InterfaceC1294a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60855a;

            public c(String str) {
                str.getClass();
                this.f60855a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f60855a.equals(((c) obj).f60855a);
            }

            public final int hashCode() {
                return this.f60855a.hashCode();
            }

            public final String toString() {
                return j.m("ProductLimitExceeded(productDisplayName=", this.f60855a, ")");
            }
        }

        /* JADX INFO: renamed from: dr2.a$a$d */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr2/a$a$d;", "Ldr2/a$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d implements InterfaceC1294a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f60856a = new d();

            private d() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -891258717;
            }

            public final String toString() {
                return "UnavailableSESpace";
            }
        }

        /* JADX INFO: renamed from: dr2.a$a$e */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr2/a$a$e;", "Ldr2/a$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e implements InterfaceC1294a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f60857a = new e();

            private e() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 869535226;
            }

            public final String toString() {
                return "UnderMaintenance";
            }
        }

        /* JADX INFO: renamed from: dr2.a$a$f */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr2/a$a$f;", "Ldr2/a$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f implements InterfaceC1294a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f60858a = new f();

            private f() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 381583081;
            }

            public final String toString() {
                return "UnknownSESpace";
            }
        }

        /* JADX INFO: renamed from: dr2.a$a$g */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldr2/a$a$g;", "Ldr2/a$a;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g implements InterfaceC1294a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f60859a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f60860b;

            public g(String str, String str2) {
                this.f60859a = str;
                this.f60860b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return s.g(this.f60859a, gVar.f60859a) && s.g(this.f60860b, gVar.f60860b);
            }

            public final int hashCode() {
                String str = this.f60859a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f60860b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return e0.g("WalletLimitExceeded(title=", this.f60859a, ", message=", this.f60860b, ")");
            }
        }
    }

    public static Object a(long j8, f fVar, dr2.b bVar) {
        int i14;
        q3 q3Var = new q3();
        GarminPayCoreDatabase.b bVar2 = GarminPayCoreDatabase.f52316a;
        Context context = (Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null);
        bVar2.getClass();
        List<fs2.a> listH = GarminPayCoreDatabase.b.a(context).e().h();
        int iIntValue = 0;
        if (listH == null || !listH.isEmpty()) {
            i14 = 0;
            for (fs2.a aVar : listH) {
                if (aVar.f73431f == j8 && aVar.f73428c == fVar.n() && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        } else {
            i14 = 0;
        }
        if (i14 == 0) {
            Integer numR2 = fVar.R2();
            if (numR2 != null) {
                iIntValue = numR2.intValue();
            }
        } else {
            Integer numI2 = fVar.i2();
            if (numI2 != null) {
                iIntValue = numI2.intValue();
            }
        }
        return q3Var.a(j8, iIntValue, bVar);
    }

    public static n b(long j8) {
        w.f140538a.getClass();
        n nVarI = w.i(j8);
        if (nVarI != null) {
            return nVarI;
        }
        h.x(e.e(j8, "Null device wallet for #"));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        if (r11 == r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f fVar, long j8, c cVar) {
        dr2.b bVar;
        if (cVar instanceof dr2.b) {
            bVar = (dr2.b) cVar;
            int i14 = bVar.f60866e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f60866e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new dr2.b(this, cVar);
            }
        } else {
            bVar = new dr2.b(this, cVar);
        }
        Object objE = bVar.f60864c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f60866e;
        try {
            if (i15 == 0) {
                r.b(objE);
                if (!b(j8).f140499b.s()) {
                    return InterfaceC1294a.C1295a.f60853a;
                }
                bVar.f60862a = fVar;
                bVar.f60863b = j8;
                bVar.f60866e = 1;
                n nVarB = b(j8);
                Object obj = nVarB.f140509l.get(fVar.n().f147396a);
                if (obj == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                objE = ((ms2.c) obj).e(nVarB.f140498a.getUnitId(), fVar, bVar);
                if (objE == aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                j8 = bVar.f60863b;
                fVar = bVar.f60862a;
                r.b(objE);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objE);
            }
            q3.a aVar2 = (q3.a) objE;
            if (s.g(aVar2, q3.a.b.f205781a)) {
                return InterfaceC1294a.f.f60858a;
            }
            if (s.g(aVar2, q3.a.c.f205782a)) {
                return InterfaceC1294a.d.f60856a;
            }
            if (s.g(aVar2, q3.a.C3843a.f205780a)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
            if (((Boolean) objE).booleanValue()) {
                return new InterfaceC1294a.c(fVar.getDisplayName());
            }
            if (fVar.w2()) {
                return InterfaceC1294a.e.f60857a;
            }
            is2.b bVar2 = fVar.n().f147396a;
            g gVarA = w.f140538a.a(bVar2);
            if (gVarA == null) {
                throw new IllegalArgumentException(("Null service provider for " + bVar2).toString());
            }
            ns2.c cVarJ = gVarA.j(fVar, j8);
            if (cVarJ instanceof ns2.c.a) {
                return new InterfaceC1294a.g(((ns2.c.a) cVarJ).f127824a, ((ns2.c.a) cVarJ).f127825b);
            }
            if (!(cVarJ instanceof ns2.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.f60862a = null;
            bVar.f60863b = j8;
            bVar.f60866e = 2;
            objE = a(j8, fVar, bVar);
        } catch (Throwable th3) {
            f60852a.f60861a.a().warn("[validateAddCardPrecondition] Failed to validate", th3);
            return InterfaceC1294a.b.f60854a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr2/a$b;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f60861a;

        private b() {
            hn2.f fVar = hn2.f.f84562a;
            fVar.getClass();
            this.f60861a = new m(fVar, "GarminPayFacadeRepository");
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
