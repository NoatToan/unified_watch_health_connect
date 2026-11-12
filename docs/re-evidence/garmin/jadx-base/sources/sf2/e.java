package sf2;

import androidx.room.a0;
import c22.t;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIDataTypes;
import com.google.firebase.messaging.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.List;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lsf2/e;", "", "<init>", "()V", "c", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_MODULUS, "d", "m", "g", IntegerTokenConverter.CONVERTER_KEY, "l", "j", JWKParameterNames.RSA_EXPONENT, "h", "b", "a", "f", "Lsf2/e$a;", "Lsf2/e$b;", "Lsf2/e$c;", "Lsf2/e$d;", "Lsf2/e$e;", "Lsf2/e$f;", "Lsf2/e$g;", "Lsf2/e$h;", "Lsf2/e$i;", "Lsf2/e$j;", "Lsf2/e$k;", "Lsf2/e$l;", "Lsf2/e$m;", "Lsf2/e$n;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsf2/e$a;", "Lsf2/e;", "Lug2/d;", "alertType", "", "Lug2/a;", "messages", "<init>", "(Lug2/d;Ljava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ug2.d f158949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ug2.a> f158950b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ug2.d dVar, List<ug2.a> list) {
            super(null);
            dVar.getClass();
            list.getClass();
            this.f158949a = dVar;
            this.f158950b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f158949a == aVar.f158949a && s.g(this.f158950b, aVar.f158950b);
        }

        public final int hashCode() {
            return this.f158950b.hashCode() + (this.f158949a.hashCode() * 31);
        }

        public final String toString() {
            return "DeviceAlert(alertType=" + this.f158949a + ", messages=" + this.f158950b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/e$b;", "Lsf2/e;", "", "batteryPercentage", "<init>", "(Ljava/lang/Integer;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f158951a;

        public b(Integer num) {
            super(null);
            this.f158951a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f158951a, ((b) obj).f158951a);
        }

        public final int hashCode() {
            Integer num = this.f158951a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return a0.i("DeviceBatteryPercentageUpdated(batteryPercentage=", this.f158951a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsf2/e$c;", "Lsf2/e;", "", "lapCount", "", "Lrf2/b;", "data", "<init>", "(ILjava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f158952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<rf2.b> f158953b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i14, List<rf2.b> list) {
            super(null);
            list.getClass();
            this.f158952a = i14;
            this.f158953b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f158952a == cVar.f158952a && s.g(this.f158953b, cVar.f158953b);
        }

        public final int hashCode() {
            return this.f158953b.hashCode() + (Integer.hashCode(this.f158952a) * 31);
        }

        public final String toString() {
            return "Lap(lapCount=" + this.f158952a + ", data=" + this.f158953b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsf2/e$d;", "Lsf2/e;", "", "Lrf2/b;", "data", "<init>", "(Ljava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<rf2.b> f158954a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<rf2.b> list) {
            super(null);
            list.getClass();
            this.f158954a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && s.g(this.f158954a, ((d) obj).f158954a);
        }

        public final int hashCode() {
            return this.f158954a.hashCode();
        }

        public final String toString() {
            return tn.k.h("Metrics(data=", ")", this.f158954a);
        }
    }

    /* JADX INFO: renamed from: sf2.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsf2/e$e;", "Lsf2/e;", "Lsf2/e$e$a;", "event", "<init>", "(Lsf2/e$e$a;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3005e extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f158955a;

        /* JADX INFO: renamed from: sf2.e$e$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/e$e$a;", "", "<init>", "(Ljava/lang/String;I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum a {
            WORKOUT_WARMUP,
            WORKOUT_ACTIVE,
            WORKOUT_COOLDOWN,
            WORKOUT_REST
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3005e(a aVar) {
            super(null);
            aVar.getClass();
            this.f158955a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3005e) && this.f158955a == ((C3005e) obj).f158955a;
        }

        public final int hashCode() {
            return this.f158955a.hashCode();
        }

        public final String toString() {
            return "QuickWorkoutEvent(event=" + this.f158955a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/e$f;", "Lsf2/e;", "Lyf2/a;", "valueEstimationType", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Lyf2/a;Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yf2.a f158961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f158962b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(yf2.a aVar, UUID uuid) {
            super(null);
            aVar.getClass();
            uuid.getClass();
            this.f158961a = aVar;
            this.f158962b = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f158961a == fVar.f158961a && s.g(this.f158962b, fVar.f158962b);
        }

        public final int hashCode() {
            return this.f158962b.hashCode() + (this.f158961a.hashCode() * 31);
        }

        public final String toString() {
            return "ValueEstimationCompleted(valueEstimationType=" + this.f158961a + ", sessionUuid=" + this.f158962b + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsf2/e$g;", "Lsf2/e;", "", "stepIndex", "reps", "", "weight", "Lcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;", "weightUnit", "Lvf2/c;", "exerciseData", "<init>", "(IIFLcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;Lvf2/c;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f158963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f158964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f158965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GDIDataTypes.MeasurementUnit f158966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final vf2.c f158967e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i14, int i15, float f14, GDIDataTypes.MeasurementUnit measurementUnit, vf2.c cVar) {
            super(null);
            measurementUnit.getClass();
            this.f158963a = i14;
            this.f158964b = i15;
            this.f158965c = f14;
            this.f158966d = measurementUnit;
            this.f158967e = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f158963a == gVar.f158963a && this.f158964b == gVar.f158964b && Float.compare(this.f158965c, gVar.f158965c) == 0 && this.f158966d == gVar.f158966d && s.g(this.f158967e, gVar.f158967e);
        }

        public final int hashCode() {
            int iHashCode = (this.f158966d.hashCode() + q6.f.d(this.f158965c, q2.d(this.f158964b, Integer.hashCode(this.f158963a) * 31, 31), 31)) * 31;
            vf2.c cVar = this.f158967e;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public final String toString() {
            StringBuilder sbJ = e5.j(this.f158963a, this.f158964b, "WorkoutConfirmFinalizeSet(stepIndex=", ", reps=", ", weight=");
            sbJ.append(this.f158965c);
            sbJ.append(", weightUnit=");
            sbJ.append(this.f158966d);
            sbJ.append(", exerciseData=");
            sbJ.append(this.f158967e);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/e$h;", "Lsf2/e;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158968a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && s.g(this.f158968a, ((h) obj).f158968a);
        }

        public final int hashCode() {
            return this.f158968a.hashCode();
        }

        public final String toString() {
            return "WorkoutEnded(sessionUuid=" + this.f158968a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/e$j;", "Lsf2/e;", "", "", "activeClusters", "skippedClusters", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Integer> f158975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Integer> f158976b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<Integer> list, List<Integer> list2) {
            super(null);
            list.getClass();
            list2.getClass();
            this.f158975a = list;
            this.f158976b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return s.g(this.f158975a, jVar.f158975a) && s.g(this.f158976b, jVar.f158976b);
        }

        public final int hashCode() {
            return this.f158976b.hashCode() + (this.f158975a.hashCode() * 31);
        }

        public final String toString() {
            return t.f("WorkoutModified(activeClusters=", ", skippedClusters=", ")", this.f158975a, this.f158976b);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsf2/e$k;", "Lsf2/e;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "stepCount", "totalStepsCount", "", "Lrf2/b;", "data", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f158977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f158978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f158979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<rf2.b> f158980d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, int i14, int i15, List<rf2.b> list) {
            super(null);
            str.getClass();
            list.getClass();
            this.f158977a = str;
            this.f158978b = i14;
            this.f158979c = i15;
            this.f158980d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return s.g(this.f158977a, kVar.f158977a) && this.f158978b == kVar.f158978b && this.f158979c == kVar.f158979c && s.g(this.f158980d, kVar.f158980d);
        }

        public final int hashCode() {
            return this.f158980d.hashCode() + q2.d(this.f158979c, q2.d(this.f158978b, this.f158977a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sbK = androidx.core.view.j.k(this.f158978b, "WorkoutStep(label=", this.f158977a, ", stepCount=", ", totalStepsCount=");
            sbK.append(this.f158979c);
            sbK.append(", data=");
            sbK.append(this.f158980d);
            sbK.append(")");
            return sbK.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/e$l;", "Lsf2/e;", "", "stepId", "currentRepeat", "totalRepeats", "<init>", "(III)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f158981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f158982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f158983c;

        public l(int i14, int i15, int i16) {
            super(null);
            this.f158981a = i14;
            this.f158982b = i15;
            this.f158983c = i16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f158981a == lVar.f158981a && this.f158982b == lVar.f158982b && this.f158983c == lVar.f158983c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f158983c) + q2.d(this.f158982b, Integer.hashCode(this.f158981a) * 31, 31);
        }

        public final String toString() {
            return am.j.q(e5.j(this.f158981a, this.f158982b, "WorkoutStepStartedRequest(stepId=", ", currentRepeat=", ", totalRepeats="), this.f158983c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/e$m;", "Lsf2/e;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f158984a = new m();

        private m() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 251680980;
        }

        public final String toString() {
            return "WorkoutStepTimerCancel";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsf2/e$n;", "Lsf2/e;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "Lrf2/b;", "data", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f158985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<rf2.b> f158986b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, List<rf2.b> list) {
            super(null);
            str.getClass();
            list.getClass();
            this.f158985a = str;
            this.f158986b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return s.g(this.f158985a, nVar.f158985a) && s.g(this.f158986b, nVar.f158986b);
        }

        public final int hashCode() {
            return this.f158986b.hashCode() + (this.f158985a.hashCode() * 31);
        }

        public final String toString() {
            return fb1.c.o("WorkoutTarget(label=", this.f158985a, ", data=", this.f158986b, ")");
        }
    }

    public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private e() {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsf2/e$i;", "Lsf2/e;", "", "stepIndex", "reps", "", "weight", "Lcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;", "weightUnit", "timeout", "", "Lvf2/c;", "exerciseSuggestions", "<init>", "(IIFLcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;ILjava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f158969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f158970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f158971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GDIDataTypes.MeasurementUnit f158972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f158973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<vf2.c> f158974f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i14, int i15, float f14, GDIDataTypes.MeasurementUnit measurementUnit, int i16, List<vf2.c> list) {
            super(null);
            measurementUnit.getClass();
            this.f158969a = i14;
            this.f158970b = i15;
            this.f158971c = f14;
            this.f158972d = measurementUnit;
            this.f158973e = i16;
            this.f158974f = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f158969a == iVar.f158969a && this.f158970b == iVar.f158970b && Float.compare(this.f158971c, iVar.f158971c) == 0 && this.f158972d == iVar.f158972d && this.f158973e == iVar.f158973e && s.g(this.f158974f, iVar.f158974f);
        }

        public final int hashCode() {
            int iD = q2.d(this.f158973e, (this.f158972d.hashCode() + q6.f.d(this.f158971c, q2.d(this.f158970b, Integer.hashCode(this.f158969a) * 31, 31), 31)) * 31, 31);
            List<vf2.c> list = this.f158974f;
            return iD + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sbJ = e5.j(this.f158969a, this.f158970b, "WorkoutFinalizeSet(stepIndex=", ", reps=", ", weight=");
            sbJ.append(this.f158971c);
            sbJ.append(", weightUnit=");
            sbJ.append(this.f158972d);
            sbJ.append(", timeout=");
            sbJ.append(this.f158973e);
            sbJ.append(", exerciseSuggestions=");
            sbJ.append(this.f158974f);
            sbJ.append(")");
            return sbJ.toString();
        }

        public /* synthetic */ i(int i14, int i15, float f14, GDIDataTypes.MeasurementUnit measurementUnit, int i16, List list, int i17, p005kotlin.jvm.internal.j jVar) {
            this(i14, i15, f14, measurementUnit, i16, (i17 & 32) != 0 ? null : list);
        }
    }
}
