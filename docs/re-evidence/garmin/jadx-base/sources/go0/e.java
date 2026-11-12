package go0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lgo0/e;", "", "<init>", "()V", "b", "a", "Lgo0/e$a;", "Lgo0/e$b;", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgo0/e$a;", "Lgo0/e;", "Lyz1/d;", "status", "", "currentHeartRate", "restingHeartRate", "Li53/c;", "Li53/d;", "", "timelineChartPoints", "", "timelineZonesColorMap", "timelineChartMinXValue", "timelineChartMaxXValue", "timelineChartMinYValue", "timelineChartMaxYValue", "", "last7DaysDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Long;Ljava/lang/Long;Li53/c;Li53/c;FFFFZ)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f78189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f78190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f78191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i53.c<i53.d<Float, Float>> f78192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final i53.c<i53.d<Float, Integer>> f78193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f78194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f78195g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f78196h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f78197i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f78198j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(yz1.d dVar, Long l14, Long l15, i53.c<? extends i53.d<Float, Float>> cVar, i53.c<? extends i53.d<Float, Integer>> cVar2, float f14, float f15, float f16, float f17, boolean z14) {
            super(null);
            dVar.getClass();
            cVar.getClass();
            cVar2.getClass();
            this.f78189a = dVar;
            this.f78190b = l14;
            this.f78191c = l15;
            this.f78192d = cVar;
            this.f78193e = cVar2;
            this.f78194f = f14;
            this.f78195g = f15;
            this.f78196h = f16;
            this.f78197i = f17;
            this.f78198j = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f78189a, aVar.f78189a) && s.g(this.f78190b, aVar.f78190b) && s.g(this.f78191c, aVar.f78191c) && s.g(this.f78192d, aVar.f78192d) && s.g(this.f78193e, aVar.f78193e) && Float.compare(this.f78194f, aVar.f78194f) == 0 && Float.compare(this.f78195g, aVar.f78195g) == 0 && Float.compare(this.f78196h, aVar.f78196h) == 0 && Float.compare(this.f78197i, aVar.f78197i) == 0 && this.f78198j == aVar.f78198j;
        }

        public final int hashCode() {
            int iHashCode = this.f78189a.hashCode() * 31;
            Long l14 = this.f78190b;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f78191c;
            return Boolean.hashCode(this.f78198j) + f.d(this.f78197i, f.d(this.f78196h, f.d(this.f78195g, f.d(this.f78194f, l2.a(this.f78193e, l2.a(this.f78192d, (iHashCode2 + (l15 != null ? l15.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("HeartRateCardLegacyData(status=");
            sb3.append(this.f78189a);
            sb3.append(", currentHeartRate=");
            sb3.append(this.f78190b);
            sb3.append(", restingHeartRate=");
            sb3.append(this.f78191c);
            sb3.append(", timelineChartPoints=");
            sb3.append(this.f78192d);
            sb3.append(", timelineZonesColorMap=");
            sb3.append(this.f78193e);
            sb3.append(", timelineChartMinXValue=");
            sb3.append(this.f78194f);
            sb3.append(", timelineChartMaxXValue=");
            l2.n(sb3, this.f78195g, ", timelineChartMinYValue=", this.f78196h, ", timelineChartMaxYValue=");
            sb3.append(this.f78197i);
            sb3.append(", last7DaysDataAvailable=");
            sb3.append(this.f78198j);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public /* synthetic */ e(j jVar) {
        this();
    }

    private e() {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgo0/e$b;", "Lgo0/e;", "Lyz1/d;", "status", "", "currentHeartRate", "restingHeartRate", "Li53/c;", "", "hearRateZonesPercentages", "currentHeartRateIndicator", "", "last7DaysDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Long;Ljava/lang/Long;Li53/c;Ljava/lang/Float;Z)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f78199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f78200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f78201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i53.c<Float> f78202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Float f78203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f78204f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yz1.d dVar, Long l14, Long l15, i53.c<Float> cVar, Float f14, boolean z14) {
            super(null);
            dVar.getClass();
            this.f78199a = dVar;
            this.f78200b = l14;
            this.f78201c = l15;
            this.f78202d = cVar;
            this.f78203e = f14;
            this.f78204f = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f78199a, bVar.f78199a) && s.g(this.f78200b, bVar.f78200b) && s.g(this.f78201c, bVar.f78201c) && s.g(this.f78202d, bVar.f78202d) && s.g(this.f78203e, bVar.f78203e) && this.f78204f == bVar.f78204f;
        }

        public final int hashCode() {
            int iHashCode = this.f78199a.hashCode() * 31;
            Long l14 = this.f78200b;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f78201c;
            int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
            i53.c<Float> cVar = this.f78202d;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Float f14 = this.f78203e;
            return Boolean.hashCode(this.f78204f) + ((iHashCode4 + (f14 != null ? f14.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "HeartRateCardRealtimeData(status=" + this.f78199a + ", currentHeartRate=" + this.f78200b + ", restingHeartRate=" + this.f78201c + ", hearRateZonesPercentages=" + this.f78202d + ", currentHeartRateIndicator=" + this.f78203e + ", last7DaysDataAvailable=" + this.f78204f + ")";
        }

        public /* synthetic */ b(yz1.d dVar, Long l14, Long l15, i53.c cVar, Float f14, boolean z14, int i14, j jVar) {
            this(dVar, l14, l15, cVar, (i14 & 16) != 0 ? null : f14, z14);
        }
    }
}
