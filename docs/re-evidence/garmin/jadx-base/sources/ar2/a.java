package ar2;

import am.j;
import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.e2;
import r53.g2;
import v.e0;
import v13.i;
import wr2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lar2/a;", "EventType", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "savedStateHandle", "Ldr2/a;", "garminPayFacade", "<init>", "(Landroidx/lifecycle/j1;Ldr2/a;)V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<EventType> extends u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0174a f12559e = new C0174a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr2.a f12560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f12561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f12562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12563d;

    public interface b {

        /* JADX INFO: renamed from: ar2.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lar2/a$b$a;", "Lar2/a$b;", "", "deviceName", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0175a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f12565a;

            public C0175a(String str) {
                str.getClass();
                this.f12565a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0175a) && this.f12565a.equals(((C0175a) obj).f12565a);
            }

            public final int hashCode() {
                return this.f12565a.hashCode();
            }

            public final String toString() {
                return j.m("ShowDeviceDisconnectedDialog(deviceName=", this.f12565a, ")");
            }
        }

        /* JADX INFO: renamed from: ar2.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar2/a$b$b;", "Lar2/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0176b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0176b f12566a = new C0176b();

            private C0176b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0176b);
            }

            public final int hashCode() {
                return 743175601;
            }

            public final String toString() {
                return "ShowGenericErrorDialog";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lar2/a$b$c;", "Lar2/a$b;", "", "displayName", "deviceName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f12567a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f12568b;

            public c(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.f12567a = str;
                this.f12568b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f12567a.equals(cVar.f12567a) && this.f12568b.equals(cVar.f12568b);
            }

            public final int hashCode() {
                return this.f12568b.hashCode() + (this.f12567a.hashCode() * 31);
            }

            public final String toString() {
                return e0.g("ShowProductLimitExceededDialog(displayName=", this.f12567a, ", deviceName=", this.f12568b, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lar2/a$b$d;", "Lar2/a$b;", "", "deviceName", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f12569a;

            public d(String str) {
                str.getClass();
                this.f12569a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f12569a.equals(((d) obj).f12569a);
            }

            public final int hashCode() {
                return this.f12569a.hashCode();
            }

            public final String toString() {
                return j.m("ShowUnavailableSpaceDialog(deviceName=", this.f12569a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar2/a$b$e;", "Lar2/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f12570a = new e();

            private e() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1113785125;
            }

            public final String toString() {
                return "ShowUnderMaintenanceDialog";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar2/a$b$f;", "Lar2/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f12571a = new f();

            private f() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -711473700;
            }

            public final String toString() {
                return "ShowUnknownSpaceDialog";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lar2/a$b$g;", "Lar2/a$b;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f12572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f12573b;

            public g(String str, String str2) {
                this.f12572a = str;
                this.f12573b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return s.g(this.f12572a, gVar.f12572a) && s.g(this.f12573b, gVar.f12573b);
            }

            public final int hashCode() {
                String str = this.f12572a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f12573b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return e0.g("ShowWalletLimitExceededDialog(title=", this.f12572a, ", message=", this.f12573b, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lar2/a$b$h;", "Lar2/a$b;", "", "show", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f12574a;

            public h(boolean z14) {
                this.f12574a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f12574a == ((h) obj).f12574a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f12574a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("UpdateProgressOverlay(show=", ")", this.f12574a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.addcard.viewmodels.SelectCatalogItemViewModel$onNavigatorError$1", f = "SelectCatalogItemViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.feature.garminpay.ui.addcard.b.c f12576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<EventType> f12577c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.garmin.feature.garminpay.ui.addcard.b.c cVar, a<EventType> aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f12576b = cVar;
            this.f12577c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f12576b, this.f12577c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f12575a;
            if (i14 == 0) {
                r.b(obj);
                Logger loggerA = a.f12559e.f12564a.a();
                StringBuilder sb3 = new StringBuilder("[onNavigatorError] ");
                com.garmin.feature.garminpay.ui.addcard.b.c cVar = this.f12576b;
                sb3.append(cVar);
                loggerA.warn(sb3.toString());
                cVar.getClass();
                if (!(cVar instanceof com.garmin.feature.garminpay.ui.addcard.b.c.C1080b)) {
                    u0.r();
                    return null;
                }
                b.C0176b c0176b = b.C0176b.f12566a;
                this.f12575a = 1;
                if (this.f12577c.x4(c0176b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public a(j1 j1Var, dr2.a aVar) {
        j1Var.getClass();
        aVar.getClass();
        this.f12560a = aVar;
        this.f12561b = g2.b(0, 0, null, 7);
        this.f12562c = (Long) j1Var.a("device.unit.id");
        this.f12563d = (String) j1Var.a("device.name");
    }

    public final String A4() {
        String str = this.f12563d;
        if (str != null) {
            return str;
        }
        vb.h.s("Required value was null.");
        return null;
    }

    public final long B4() {
        Long l14 = this.f12562c;
        if (l14 != null) {
            return l14.longValue();
        }
        vb.h.s("Required value was null.");
        return 0L;
    }

    public final Object x4(b bVar, i iVar) throws Throwable {
        Object objEmit = this.f12561b.emit(new yq2.c.a(bVar), iVar);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }

    public final Object y4(Object obj, i iVar) throws Throwable {
        Object objEmit = this.f12561b.emit(new yq2.c.b(obj), iVar);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }

    public final void z4(com.garmin.feature.garminpay.ui.addcard.b.c cVar) {
        cVar.getClass();
        ge1.b.T(v1.a(this), null, null, new c(cVar, this, null), 3);
    }

    /* JADX INFO: renamed from: ar2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar2/a$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0174a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f12564a;

        private C0174a() {
            hn2.f fVar = hn2.f.f84562a;
            fVar.getClass();
            this.f12564a = new m(fVar, "SelectCatalogItemViewModel");
        }

        public /* synthetic */ C0174a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
