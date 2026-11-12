package nr;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lnr/y;", "", "<init>", "()V", "c", "b", "a", "Lnr/y$a;", "Lnr/y$b;", "Lnr/y$c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class y {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnr/y$a;", "Lnr/y;", "", "workoutExecutionScore", "<init>", "(Ljava/lang/Integer;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f127588a;

        public a(Integer num) {
            super(null);
            this.f127588a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f127588a, ((a) obj).f127588a);
        }

        public final int hashCode() {
            Integer num = this.f127588a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return androidx.room.a0.i("ExecutionScore(workoutExecutionScore=", this.f127588a, ")");
        }
    }

    public /* synthetic */ y(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private y() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/y$c;", "Lnr/y;", "", "title", "titleExplication", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f127592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f127593b;

        public /* synthetic */ c(Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f127592a, cVar.f127592a) && p005kotlin.jvm.internal.s.g(this.f127593b, cVar.f127593b);
        }

        public final int hashCode() {
            Integer num = this.f127592a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f127593b;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "WorkoutBenefit(title=" + this.f127592a + ", titleExplication=" + this.f127593b + ")";
        }

        public c(Integer num, Integer num2) {
            super(null);
            this.f127592a = num;
            this.f127593b = num2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/y$b;", "Lnr/y;", "", "title", "titleExplication", "colorRes", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f127589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f127590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f127591c;

        public /* synthetic */ b(Integer num, Integer num2, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f127589a, bVar.f127589a) && p005kotlin.jvm.internal.s.g(this.f127590b, bVar.f127590b) && p005kotlin.jvm.internal.s.g(this.f127591c, bVar.f127591c);
        }

        public final int hashCode() {
            Integer num = this.f127589a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f127590b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f127591c;
            return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            return f3.i(com.airbnb.lottie.animation.keyframe.a.l(this.f127589a, "PrimaryBenefit(title=", ", titleExplication=", ", colorRes=", this.f127590b), this.f127591c, ")");
        }

        public b(Integer num, Integer num2, Integer num3) {
            super(null);
            this.f127589a = num;
            this.f127590b = num2;
            this.f127591c = num3;
        }

        public b() {
            this(null, null, null, 7, null);
        }
    }
}
