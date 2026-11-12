package d71;

import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ld71/j;", "", "<init>", "()V", "b", "a", "Ld71/j$a;", "Ld71/j$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class j {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ld71/j$a;", "Ld71/j;", "Lyz1/d;", "status", "", "dailyTrainingLoadAcute", "dailyTrainingLoadChronic", "", "dailyTrainingLoadRatio", "dailyTrainingLoadAcuteQualifierLabelResId", "", "last7DaysDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f58163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f58164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f58165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f58166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f58167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f58168f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yz1.d dVar, Integer num, Integer num2, Double d14, Integer num3, boolean z14) {
            super(null);
            dVar.getClass();
            this.f58163a = dVar;
            this.f58164b = num;
            this.f58165c = num2;
            this.f58166d = d14;
            this.f58167e = num3;
            this.f58168f = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f58163a, aVar.f58163a) && s.g(this.f58164b, aVar.f58164b) && s.g(this.f58165c, aVar.f58165c) && s.g(this.f58166d, aVar.f58166d) && s.g(this.f58167e, aVar.f58167e) && this.f58168f == aVar.f58168f;
        }

        public final int hashCode() {
            int iHashCode = this.f58163a.hashCode() * 31;
            Integer num = this.f58164b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f58165c;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Double d14 = this.f58166d;
            int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Integer num3 = this.f58167e;
            return Boolean.hashCode(this.f58168f) + ((iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ACWRLoadCardData(status=");
            sb3.append(this.f58163a);
            sb3.append(", dailyTrainingLoadAcute=");
            sb3.append(this.f58164b);
            sb3.append(", dailyTrainingLoadChronic=");
            b71.i.v(sb3, this.f58165c, ", dailyTrainingLoadRatio=", this.f58166d, ", dailyTrainingLoadAcuteQualifierLabelResId=");
            sb3.append(this.f58167e);
            sb3.append(", last7DaysDataAvailable=");
            sb3.append(this.f58168f);
            sb3.append(")");
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ld71/j$b;", "Ld71/j;", "Lyz1/d;", "status", "", "dailyTrainingLoadAcute", "dailyTrainingLoadAcuteQualifierLabelResId", "Li53/c;", "", "acuteLoadLast4wDataPoints", "Lo13/p;", "optimalRangeLast4wDataPoints", "", "last7DaysDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Li53/c;Li53/c;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f58169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f58170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f58171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i53.c<Double> f58172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final i53.c<p<Double, Double>> f58173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f58174f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yz1.d dVar, Integer num, Integer num2, i53.c<Double> cVar, i53.c<p<Double, Double>> cVar2, boolean z14) {
            super(null);
            dVar.getClass();
            cVar.getClass();
            cVar2.getClass();
            this.f58169a = dVar;
            this.f58170b = num;
            this.f58171c = num2;
            this.f58172d = cVar;
            this.f58173e = cVar2;
            this.f58174f = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f58169a, bVar.f58169a) && s.g(this.f58170b, bVar.f58170b) && s.g(this.f58171c, bVar.f58171c) && s.g(this.f58172d, bVar.f58172d) && s.g(this.f58173e, bVar.f58173e) && this.f58174f == bVar.f58174f;
        }

        public final int hashCode() {
            int iHashCode = this.f58169a.hashCode() * 31;
            Integer num = this.f58170b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f58171c;
            return Boolean.hashCode(this.f58174f) + l2.a(this.f58173e, l2.a(this.f58172d, (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31), 31);
        }

        public final String toString() {
            return "AcuteLoadCardData(status=" + this.f58169a + ", dailyTrainingLoadAcute=" + this.f58170b + ", dailyTrainingLoadAcuteQualifierLabelResId=" + this.f58171c + ", acuteLoadLast4wDataPoints=" + this.f58172d + ", optimalRangeLast4wDataPoints=" + this.f58173e + ", last7DaysDataAvailable=" + this.f58174f + ")";
        }
    }

    public /* synthetic */ j(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private j() {
    }
}
