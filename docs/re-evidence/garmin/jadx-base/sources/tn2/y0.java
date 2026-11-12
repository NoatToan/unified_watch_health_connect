package tn2;

import com.google.firebase.messaging.Constants;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Ltn2/y0;", "", "Ltn2/r0;", "felicaService", "<init>", "(Ltn2/r0;)V", "b", "a", "c", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f165733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f165734g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f165735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m13.a<d> f165736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f165737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f165738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f165739e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn2/y0$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        NEED_RECOVERY,
        NEED_REFUND,
        NEED_DELETION_ONLY,
        NEED_DELETION_AND_CALL_CENTER,
        NEED_CALL_CENTER
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltn2/y0$c;", "", "Lrn2/i;", "fnCard", "", "needMetadata", "Ltn2/y0$a;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Lrn2/i;ZLtn2/y0$a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rn2.i f165746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f165747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f165748c;

        public c(rn2.i iVar, boolean z14, a aVar) {
            this.f165746a = iVar;
            this.f165747b = z14;
            this.f165748c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f165746a, cVar.f165746a) && this.f165747b == cVar.f165747b && this.f165748c == cVar.f165748c;
        }

        public final int hashCode() {
            rn2.i iVar = this.f165746a;
            int iG = q6.f.g((iVar == null ? 0 : iVar.hashCode()) * 31, 31, this.f165747b);
            a aVar = this.f165748c;
            return iG + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "SyncInfo(fnCard=" + this.f165746a + ", needMetadata=" + this.f165747b + ", error=" + this.f165748c + ")";
        }
    }

    static {
        new b(null);
        int i14 = gt2.c.f79010a;
        f165733f = gt2.b.f79005a.h("PAY#FN#FelicaSynchronizer");
        f165734g = new c(null, false, null);
    }

    public y0(r0 r0Var) {
        r0Var.getClass();
        this.f165735a = r0Var;
        this.f165736b = new m13.a<>();
        this.f165738d = new Object();
    }

    public final e13.j a(boolean z14) {
        w wVar = this.f165735a.f165632a;
        e13.p pVarA = ks2.e.a(wVar.f165680a);
        n nVar = new n(new l(wVar, 1), 3);
        int i14 = w03.b.f181178a;
        return new e13.j(new e13.j(pVarA, nVar), new p0(new as2.d(this, z14, 15), 18));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltn2/y0$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Ltn2/y0$c;", "NO_CARD", "Ltn2/y0$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ltn2/y0$d;", "", "<init>", "()V", "b", "a", "Ltn2/y0$d$a;", "Ltn2/y0$d$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltn2/y0$d$a;", "Ltn2/y0$d;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f165749a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th3) {
                super(null);
                th3.getClass();
                this.f165749a = th3;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltn2/y0$d$b;", "Ltn2/y0$d;", "Ltn2/y0$c;", "syncInfo", "<init>", "(Ltn2/y0$c;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f165750a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar) {
                super(null);
                cVar.getClass();
                this.f165750a = cVar;
            }
        }

        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }
}
