package in0;

import android.os.Parcelable;
import c22.t;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\f\rB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lin0/h;", "", "Lin0/m;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lin0/h$a;", "data", "Lin0/h$b;", "extraData", "", "onboarding", "<init>", "(Lin0/m;Lin0/h$a;Lin0/h$b;Z)V", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94445e = i41.e.f90924b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f94446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f94447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f94448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f94449d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lin0/h$a;", "", "", "value", "Lin0/h$a$a;", "baseline", "Lin0/k;", "feedback", "<init>", "(DLin0/h$a$a;Lin0/k;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f94450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1802a f94451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f94452c;

        /* JADX INFO: renamed from: in0.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lin0/h$a$a;", "", "Lj23/g;", "", "range", "Lin0/h$a$a$a;", "status", "percentage", "<init>", "(Lj23/g;Lin0/h$a$a$a;D)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1802a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j23.g<Double> f94453a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final EnumC1803a f94454b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f94455c;

            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 in0.h$a$a$a[], still in use, count: 1, list:
              (r0v1 in0.h$a$a$a[]) from 0x0026: CONSTRUCTOR (r0v1 in0.h$a$a$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
            	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
            	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
             */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX INFO: renamed from: in0.h$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lin0/h$a$a$a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class EnumC1803a {
                BELOW("BELOW"),
                ABOVE("ABOVE"),
                IN_RANGE("IN_RANGE");


                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final /* synthetic */ w13.c f94460f;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f94461a;

                static {
                    f94460f = new w13.c(enumC1803aArr);
                }

                private EnumC1803a(String str) {
                    super(str, i);
                    this.f94461a = str;
                }

                public static EnumC1803a valueOf(String str) {
                    return (EnumC1803a) Enum.valueOf(EnumC1803a.class, str);
                }

                public static EnumC1803a[] values() {
                    return (EnumC1803a[]) f94459e.clone();
                }
            }

            public C1802a(j23.g<Double> gVar, EnumC1803a enumC1803a, double d14) {
                gVar.getClass();
                enumC1803a.getClass();
                this.f94453a = gVar;
                this.f94454b = enumC1803a;
                this.f94455c = d14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1802a)) {
                    return false;
                }
                C1802a c1802a = (C1802a) obj;
                return this.f94453a.equals(c1802a.f94453a) && this.f94454b == c1802a.f94454b && Double.compare(this.f94455c, c1802a.f94455c) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.f94455c) + ((this.f94454b.hashCode() + (this.f94453a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("Baseline(range=");
                sb3.append(this.f94453a);
                sb3.append(", status=");
                sb3.append(this.f94454b);
                sb3.append(", percentage=");
                return t.d(this.f94455c, ")", sb3);
            }
        }

        public a(double d14, C1802a c1802a, k kVar) {
            c1802a.getClass();
            this.f94450a = d14;
            this.f94451b = c1802a;
            this.f94452c = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f94450a, aVar.f94450a) == 0 && this.f94451b.equals(aVar.f94451b) && this.f94452c == aVar.f94452c;
        }

        public final int hashCode() {
            int iHashCode = (this.f94451b.hashCode() + (Double.hashCode(this.f94450a) * 31)) * 31;
            k kVar = this.f94452c;
            return iHashCode + (kVar == null ? 0 : kVar.hashCode());
        }

        public final String toString() {
            return "Data(value=" + this.f94450a + ", baseline=" + this.f94451b + ", feedback=" + this.f94452c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lin0/h$b;", "", "Li41/e;", "hrvSummaries", "<init>", "(Li41/e;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i41.e f94462a;

        static {
            Parcelable.Creator<i41.e> creator = i41.e.CREATOR;
        }

        public b(i41.e eVar) {
            eVar.getClass();
            this.f94462a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f94462a.equals(((b) obj).f94462a);
        }

        public final int hashCode() {
            return this.f94462a.hashCode();
        }

        public final String toString() {
            return "ExtraData(hrvSummaries=" + this.f94462a + ")";
        }
    }

    public h(m mVar, a aVar, b bVar, boolean z14) {
        mVar.getClass();
        this.f94446a = mVar;
        this.f94447b = aVar;
        this.f94448c = bVar;
        this.f94449d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f94446a == hVar.f94446a && s.g(this.f94447b, hVar.f94447b) && s.g(this.f94448c, hVar.f94448c) && this.f94449d == hVar.f94449d;
    }

    public final int hashCode() {
        int iHashCode = this.f94446a.hashCode() * 31;
        a aVar = this.f94447b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f94448c;
        return Boolean.hashCode(this.f94449d) + ((iHashCode2 + (bVar != null ? bVar.f94462a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HealthStatusMetric(type=" + this.f94446a + ", data=" + this.f94447b + ", extraData=" + this.f94448c + ", onboarding=" + this.f94449d + ")";
    }

    public /* synthetic */ h(m mVar, a aVar, b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(mVar, aVar, (i14 & 4) != 0 ? null : bVar, z14);
    }
}
