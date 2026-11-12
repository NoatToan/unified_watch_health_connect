package sf2;

import androidx.room.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIDataTypes;
import com.google.firebase.messaging.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0017\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lsf2/c;", "", "<init>", "()V", "b", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "g", JWKParameterNames.RSA_EXPONENT, "f", "h", "u", "j", "c", "d", "o", "w", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "s", "m", JWKParameterNames.RSA_MODULUS, JWKParameterNames.OCT_KEY_VALUE, "p", "l", "a", "Lsf2/c$a;", "Lsf2/c$b;", "Lsf2/c$c;", "Lsf2/c$d;", "Lsf2/c$e;", "Lsf2/c$f;", "Lsf2/c$g;", "Lsf2/c$h;", "Lsf2/c$i;", "Lsf2/c$j;", "Lsf2/c$k;", "Lsf2/c$l;", "Lsf2/c$m;", "Lsf2/c$n;", "Lsf2/c$o;", "Lsf2/c$p;", "Lsf2/c$q;", "Lsf2/c$r;", "Lsf2/c$s;", "Lsf2/c$t;", "Lsf2/c$u;", "Lsf2/c$v;", "Lsf2/c$w;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lsf2/c$a;", "Lsf2/c;", "Lug2/d;", "alertType", "", "Lsf2/c$a$a;", "messages", "<init>", "(Lug2/d;Ljava/util/List;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ug2.d f158892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<C3002a> f158893b;

        /* JADX INFO: renamed from: sf2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsf2/c$a$a;", "", "", "displayString", "Lrf2/b;", "metric", "Lug2/b;", "size", "Lug2/c;", "weight", "<init>", "(Ljava/lang/String;Lrf2/b;Lug2/b;Lug2/c;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C3002a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f158894a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final rf2.b f158895b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ug2.b f158896c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final ug2.c f158897d;

            public C3002a(String str, rf2.b bVar, ug2.b bVar2, ug2.c cVar) {
                str.getClass();
                bVar2.getClass();
                cVar.getClass();
                this.f158894a = str;
                this.f158895b = bVar;
                this.f158896c = bVar2;
                this.f158897d = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3002a)) {
                    return false;
                }
                C3002a c3002a = (C3002a) obj;
                return this.f158894a.equals(c3002a.f158894a) && p005kotlin.jvm.internal.s.g(this.f158895b, c3002a.f158895b) && this.f158896c == c3002a.f158896c && this.f158897d == c3002a.f158897d;
            }

            public final int hashCode() {
                int iHashCode = this.f158894a.hashCode() * 31;
                rf2.b bVar = this.f158895b;
                return this.f158897d.hashCode() + ((this.f158896c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                return "ActivityAlertMessage(displayString=" + this.f158894a + ", metric=" + this.f158895b + ", size=" + this.f158896c + ", weight=" + this.f158897d + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ug2.d dVar, List<C3002a> list) {
            super(null);
            dVar.getClass();
            list.getClass();
            this.f158892a = dVar;
            this.f158893b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f158892a == aVar.f158892a && p005kotlin.jvm.internal.s.g(this.f158893b, aVar.f158893b);
        }

        public final int hashCode() {
            return this.f158893b.hashCode() + (this.f158892a.hashCode() * 31);
        }

        public final String toString() {
            return "ActivityAlertRequest(alertType=" + this.f158892a + ", messages=" + this.f158893b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsf2/c$b;", "Lsf2/c;", "", "Lrf2/b;", "metrics", "<init>", "(Ljava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<rf2.b> f158898a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<rf2.b> list) {
            super(null);
            list.getClass();
            this.f158898a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f158898a, ((b) obj).f158898a);
        }

        public final int hashCode() {
            return this.f158898a.hashCode();
        }

        public final String toString() {
            return tn.k.h("Data(metrics=", ")", this.f158898a);
        }
    }

    /* JADX INFO: renamed from: sf2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$c;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3003c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3003c f158899a = new C3003c();

        private C3003c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3003c);
        }

        public final int hashCode() {
            return -896777436;
        }

        public final String toString() {
            return "DeviceConnected";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$d;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f158900a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -205413312;
        }

        public final String toString() {
            return "DeviceDisconnected";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsf2/c$e;", "Lsf2/c;", "", "stepIndex", "reps", "", "weight", "Lcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;", "weightUnit", "Lvf2/c;", "exerciseData", "<init>", "(IIFLcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;Lvf2/c;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f158901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f158902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f158903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GDIDataTypes.MeasurementUnit f158904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final vf2.c f158905e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i14, int i15, float f14, GDIDataTypes.MeasurementUnit measurementUnit, vf2.c cVar) {
            super(null);
            measurementUnit.getClass();
            this.f158901a = i14;
            this.f158902b = i15;
            this.f158903c = f14;
            this.f158904d = measurementUnit;
            this.f158905e = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f158901a == eVar.f158901a && this.f158902b == eVar.f158902b && Float.compare(this.f158903c, eVar.f158903c) == 0 && this.f158904d == eVar.f158904d && p005kotlin.jvm.internal.s.g(this.f158905e, eVar.f158905e);
        }

        public final int hashCode() {
            int iHashCode = (this.f158904d.hashCode() + q6.f.d(this.f158903c, q2.d(this.f158902b, Integer.hashCode(this.f158901a) * 31, 31), 31)) * 31;
            vf2.c cVar = this.f158905e;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public final String toString() {
            StringBuilder sbJ = e5.j(this.f158901a, this.f158902b, "EditConfirmFinalizeSetRequest(stepIndex=", ", reps=", ", weight=");
            sbJ.append(this.f158903c);
            sbJ.append(", weightUnit=");
            sbJ.append(this.f158904d);
            sbJ.append(", exerciseData=");
            sbJ.append(this.f158905e);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/c$f;", "Lsf2/c;", "", "", "activeClusters", "skippedClusters", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Integer> f158906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Integer> f158907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<Integer> list, List<Integer> list2) {
            super(null);
            list.getClass();
            list2.getClass();
            this.f158906a = list;
            this.f158907b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f158906a, fVar.f158906a) && p005kotlin.jvm.internal.s.g(this.f158907b, fVar.f158907b);
        }

        public final int hashCode() {
            return this.f158907b.hashCode() + (this.f158906a.hashCode() * 31);
        }

        public final String toString() {
            return c22.t.f("EditWorkoutModifiedRequest(activeClusters=", ", skippedClusters=", ")", this.f158906a, this.f158907b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$g;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f158908a = new g();

        private g() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1311077348;
        }

        public final String toString() {
            return "EditWorkoutStepTimerCancelled";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsf2/c$i;", "Lsf2/c;", "", "lapNumber", "Lrf2/b;", "primaryDatum", "secondaryDatum", "<init>", "(ILrf2/b;Lrf2/b;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f158915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rf2.b f158916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final rf2.b f158917c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i14, rf2.b bVar, rf2.b bVar2) {
            super(null);
            bVar.getClass();
            bVar2.getClass();
            this.f158915a = i14;
            this.f158916b = bVar;
            this.f158917c = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f158915a == iVar.f158915a && p005kotlin.jvm.internal.s.g(this.f158916b, iVar.f158916b) && p005kotlin.jvm.internal.s.g(this.f158917c, iVar.f158917c);
        }

        public final int hashCode() {
            return this.f158917c.hashCode() + ((this.f158916b.hashCode() + (Integer.hashCode(this.f158915a) * 31)) * 31);
        }

        public final String toString() {
            return "Lap(lapNumber=" + this.f158915a + ", primaryDatum=" + this.f158916b + ", secondaryDatum=" + this.f158917c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$j;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f158918a = new j();

        private j() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -310803047;
        }

        public final String toString() {
            return "PromptSkippedClustersRequest";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$k;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f158919a = new k();

        private k() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1785158475;
        }

        public final String toString() {
            return "SessionDiscarding";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/c$l;", "Lsf2/c;", "Lrf2/e;", "endType", "<init>", "(Lrf2/e;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rf2.e f158920a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(rf2.e eVar) {
            super(null);
            eVar.getClass();
            this.f158920a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && p005kotlin.jvm.internal.s.g(this.f158920a, ((l) obj).f158920a);
        }

        public final int hashCode() {
            return this.f158920a.hashCode();
        }

        public final String toString() {
            return "SessionEnded(endType=" + this.f158920a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$n;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f158922a = new n();

        private n() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1932977985;
        }

        public final String toString() {
            return "SessionSaving";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$o;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f158923a = new o();

        private o() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 894184251;
        }

        public final String toString() {
            return "SessionStart";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$p;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f158924a = new p();

        private p() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1850174172;
        }

        public final String toString() {
            return "SessionWorkoutEnded";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$q;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f158925a = new q();

        private q() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1252938260;
        }

        public final String toString() {
            return "WorkoutActive";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$r;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f158926a = new r();

        private r() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -1702277383;
        }

        public final String toString() {
            return "WorkoutCooldown";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$s;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f158927a = new s();

        private s() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 868850274;
        }

        public final String toString() {
            return "WorkoutRest";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsf2/c$t;", "Lsf2/c;", "", Constants.ScionAnalytics.PARAM_LABEL, "Lrf2/b;", "datum", "", "stepNumber", "totalSteps", "<init>", "(Ljava/lang/String;Lrf2/b;II)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f158928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rf2.b f158929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f158930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f158931d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, rf2.b bVar, int i14, int i15) {
            super(null);
            str.getClass();
            bVar.getClass();
            this.f158928a = str;
            this.f158929b = bVar;
            this.f158930c = i14;
            this.f158931d = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return p005kotlin.jvm.internal.s.g(this.f158928a, tVar.f158928a) && p005kotlin.jvm.internal.s.g(this.f158929b, tVar.f158929b) && this.f158930c == tVar.f158930c && this.f158931d == tVar.f158931d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f158931d) + q2.d(this.f158930c, (this.f158929b.hashCode() + (this.f158928a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("WorkoutStep(label=");
            sb3.append(this.f158928a);
            sb3.append(", datum=");
            sb3.append(this.f158929b);
            sb3.append(", stepNumber=");
            return androidx.core.view.j.e(this.f158930c, this.f158931d, ", totalSteps=", ")", sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/c$u;", "Lsf2/c;", "", "stepId", "currentRepeat", "totalRepeats", "<init>", "(III)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f158932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f158933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f158934c;

        public u(int i14, int i15, int i16) {
            super(null);
            this.f158932a = i14;
            this.f158933b = i15;
            this.f158934c = i16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.f158932a == uVar.f158932a && this.f158933b == uVar.f158933b && this.f158934c == uVar.f158934c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f158934c) + q2.d(this.f158933b, Integer.hashCode(this.f158932a) * 31, 31);
        }

        public final String toString() {
            return am.j.q(e5.j(this.f158932a, this.f158933b, "WorkoutStepStartedRequest(stepId=", ", currentRepeat=", ", totalRepeats="), this.f158934c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/c$v;", "Lsf2/c;", "", Constants.ScionAnalytics.PARAM_LABEL, "Lrf2/b;", "datum", "<init>", "(Ljava/lang/String;Lrf2/b;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f158935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rf2.b f158936b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, rf2.b bVar) {
            super(null);
            str.getClass();
            bVar.getClass();
            this.f158935a = str;
            this.f158936b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return p005kotlin.jvm.internal.s.g(this.f158935a, vVar.f158935a) && p005kotlin.jvm.internal.s.g(this.f158936b, vVar.f158936b);
        }

        public final int hashCode() {
            return this.f158936b.hashCode() + (this.f158935a.hashCode() * 31);
        }

        public final String toString() {
            return "WorkoutTarget(label=" + this.f158935a + ", datum=" + this.f158936b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/c$w;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f158937a = new w();

        private w() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return 1880876782;
        }

        public final String toString() {
            return "WorkoutWarmup";
        }
    }

    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private c() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/c$m;", "Lsf2/c;", "", "currentDistanceInMeters", "<init>", "(Ljava/lang/Integer;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f158921a;

        public /* synthetic */ m(Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && p005kotlin.jvm.internal.s.g(this.f158921a, ((m) obj).f158921a);
        }

        public final int hashCode() {
            Integer num = this.f158921a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return a0.i("SessionPause(currentDistanceInMeters=", this.f158921a, ")");
        }

        public m(Integer num) {
            super(null);
            this.f158921a = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public m() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsf2/c$h;", "Lsf2/c;", "", "stepIndex", "reps", "", "weight", "Lcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;", "weightUnit", "timeout", "", "Lvf2/c;", "exerciseSuggestions", "<init>", "(IIFLcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;ILjava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f158909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f158910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f158911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GDIDataTypes.MeasurementUnit f158912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f158913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<vf2.c> f158914f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i14, int i15, float f14, GDIDataTypes.MeasurementUnit measurementUnit, int i16, List<vf2.c> list) {
            super(null);
            measurementUnit.getClass();
            this.f158909a = i14;
            this.f158910b = i15;
            this.f158911c = f14;
            this.f158912d = measurementUnit;
            this.f158913e = i16;
            this.f158914f = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f158909a == hVar.f158909a && this.f158910b == hVar.f158910b && Float.compare(this.f158911c, hVar.f158911c) == 0 && this.f158912d == hVar.f158912d && this.f158913e == hVar.f158913e && p005kotlin.jvm.internal.s.g(this.f158914f, hVar.f158914f);
        }

        public final int hashCode() {
            int iD = q2.d(this.f158913e, (this.f158912d.hashCode() + q6.f.d(this.f158911c, q2.d(this.f158910b, Integer.hashCode(this.f158909a) * 31, 31), 31)) * 31, 31);
            List<vf2.c> list = this.f158914f;
            return iD + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sbJ = e5.j(this.f158909a, this.f158910b, "FinalizeSetRequest(stepIndex=", ", reps=", ", weight=");
            sbJ.append(this.f158911c);
            sbJ.append(", weightUnit=");
            sbJ.append(this.f158912d);
            sbJ.append(", timeout=");
            sbJ.append(this.f158913e);
            sbJ.append(", exerciseSuggestions=");
            sbJ.append(this.f158914f);
            sbJ.append(")");
            return sbJ.toString();
        }

        public /* synthetic */ h(int i14, int i15, float f14, GDIDataTypes.MeasurementUnit measurementUnit, int i16, List list, int i17, p005kotlin.jvm.internal.j jVar) {
            this(i14, i15, f14, measurementUnit, i16, (i17 & 32) != 0 ? null : list);
        }
    }
}
