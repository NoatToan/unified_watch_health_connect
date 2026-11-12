package dy1;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Ldy1/n;", "", "<init>", "()V", "f", "c", "b", "d", "a", JWKParameterNames.RSA_EXPONENT, "Ldy1/n$a;", "Ldy1/n$b;", "Ldy1/n$c;", "Ldy1/n$d;", "Ldy1/n$e;", "Ldy1/n$f;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldy1/n$a;", "Ldy1/n;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f61579a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1291582122;
        }

        public final String toString() {
            return "Finish";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldy1/n$b;", "Ldy1/n;", "", "helpTitle", "planType", "", "hasExplorationBenchmarkingPhase", "hasDeloadPhase", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f61582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f61583d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, boolean z14, boolean z15) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f61580a = str;
            this.f61581b = str2;
            this.f61582c = z14;
            this.f61583d = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f61580a, bVar.f61580a) && p005kotlin.jvm.internal.s.g(this.f61581b, bVar.f61581b) && this.f61582c == bVar.f61582c && this.f61583d == bVar.f61583d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f61583d) + q6.f.g(wr.g.j(this.f61580a.hashCode() * 31, 31, this.f61581b), 31, this.f61582c);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.f(", hasDeloadPhase=", ")", p6.b.i("HelpScreen(helpTitle=", this.f61580a, ", planType=", this.f61581b, ", hasExplorationBenchmarkingPhase="), this.f61582c, this.f61583d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldy1/n$c;", "Ldy1/n;", "", "workoutId", "workoutScheduleId", "<init>", "(JJ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f61584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f61585b;

        public c(long j8, long j14) {
            super(null);
            this.f61584a = j8;
            this.f61585b = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f61584a == cVar.f61584a && this.f61585b == cVar.f61585b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f61585b) + (Long.hashCode(this.f61584a) * 31);
        }

        public final String toString() {
            return am.j.i(this.f61585b, ")", e0.k(this.f61584a, "NextWorkout(workoutId=", ", workoutScheduleId="));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldy1/n$d;", "Ldy1/n;", "", "planId", "<init>", "(J)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f61586a;

        public d(long j8) {
            super(null);
            this.f61586a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f61586a == ((d) obj).f61586a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f61586a);
        }

        public final String toString() {
            return a0.f(this.f61586a, "RestartPlan(planId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldy1/n$e;", "Ldy1/n;", "", "planId", "<init>", "(J)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f61587a;

        public e(long j8) {
            super(null);
            this.f61587a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f61587a == ((e) obj).f61587a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f61587a);
        }

        public final String toString() {
            return a0.f(this.f61587a, "SetBenchmarks(planId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldy1/n$f;", "Ldy1/n;", "Ltw1/m;", "trainingPlanDTO", "Ljv1/e0;", "userSettingsDTO", "", "Lav1/d;", "completedActivitiesStats", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "completedActivities", "<init>", "(Ltw1/m;Ljv1/e0;Ljava/util/List;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tw1.m f61588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jv1.e0 f61589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<av1.d> f61590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<ActivityListItemDTO> f61591d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(tw1.m mVar, jv1.e0 e0Var, List<av1.d> list, List<? extends ActivityListItemDTO> list2) {
            super(null);
            mVar.getClass();
            e0Var.getClass();
            list.getClass();
            list2.getClass();
            this.f61588a = mVar;
            this.f61589b = e0Var;
            this.f61590c = list;
            this.f61591d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f61588a, fVar.f61588a) && p005kotlin.jvm.internal.s.g(this.f61589b, fVar.f61589b) && p005kotlin.jvm.internal.s.g(this.f61590c, fVar.f61590c) && p005kotlin.jvm.internal.s.g(this.f61591d, fVar.f61591d);
        }

        public final int hashCode() {
            return this.f61591d.hashCode() + u0.b((this.f61589b.hashCode() + (this.f61588a.hashCode() * 31)) * 31, 31, this.f61590c);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("WorkoutSchedule(trainingPlanDTO=");
            sb3.append(this.f61588a);
            sb3.append(", userSettingsDTO=");
            sb3.append(this.f61589b);
            sb3.append(", completedActivitiesStats=");
            return n23.j.j(sb3, this.f61590c, ", completedActivities=", this.f61591d, ")");
        }
    }

    public /* synthetic */ n(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private n() {
    }
}
