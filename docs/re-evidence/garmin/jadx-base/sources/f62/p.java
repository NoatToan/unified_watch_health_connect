package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf62/p$a;", "Lf62/p;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f69298a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2111348306;
        }

        public final String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf62/p$b;", "Lf62/p;", "", "aerobicTrainingEffectValue", "anaerobicTrainingEffectValue", "<init>", "(DD)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f69299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f69300b;

        public b(double d14, double d15) {
            this.f69299a = d14;
            this.f69300b = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f69299a, bVar.f69299a) == 0 && Double.compare(this.f69300b, bVar.f69300b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f69300b) + (Double.hashCode(this.f69299a) * 31);
        }

        public final String toString() {
            return c22.t.d(this.f69300b, ")", com.airbnb.lottie.parser.moshi.a.a("TrainingEffectInfo(aerobicTrainingEffectValue=", this.f69299a, ", anaerobicTrainingEffectValue="));
        }
    }
}
