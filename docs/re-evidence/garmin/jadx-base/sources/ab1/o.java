package ab1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lab1/o;", "", "<init>", "()V", "c", "a", "b", "Lab1/o$a;", "Lab1/o$b;", "Lab1/o$c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lab1/o$a;", "Lab1/o;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2619a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lab1/o$b;", "Lab1/o;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2620a = new b();

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lab1/o$c;", "Lab1/o;", "", TtmlNode.ATTR_ID, "coursePk", "", "name", "Lab1/p;", "terrainProfile", "distance", "Lj23/f;", "", "estimatedCompletionHoursRange", "lastUpdatedDate", "<init>", "(JJLjava/lang/String;Lab1/p;Ljava/lang/Long;Lj23/f;Ljava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f2623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p f2624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Long f2625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final j23.f<Float> f2626f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f2627g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, long j14, String str, p pVar, Long l14, j23.f<Float> fVar, String str2) {
            super(null);
            str.getClass();
            this.f2621a = j8;
            this.f2622b = j14;
            this.f2623c = str;
            this.f2624d = pVar;
            this.f2625e = l14;
            this.f2626f = fVar;
            this.f2627g = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2621a == cVar.f2621a && this.f2622b == cVar.f2622b && s.g(this.f2623c, cVar.f2623c) && this.f2624d == cVar.f2624d && s.g(this.f2625e, cVar.f2625e) && s.g(this.f2626f, cVar.f2626f) && s.g(this.f2627g, cVar.f2627g);
        }

        public final int hashCode() {
            int iJ = wr.g.j(q6.f.e(Long.hashCode(this.f2621a) * 31, 31, this.f2622b), 31, this.f2623c);
            p pVar = this.f2624d;
            int iHashCode = (iJ + (pVar == null ? 0 : pVar.hashCode())) * 31;
            Long l14 = this.f2625e;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            j23.f<Float> fVar = this.f2626f;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            String str = this.f2627g;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbK = e0.k(this.f2621a, "StrategyItem(id=", ", coursePk=");
            p6.b.k(this.f2622b, ", name=", this.f2623c, sbK);
            sbK.append(", terrainProfile=");
            sbK.append(this.f2624d);
            sbK.append(", distance=");
            sbK.append(this.f2625e);
            sbK.append(", estimatedCompletionHoursRange=");
            sbK.append(this.f2626f);
            sbK.append(", lastUpdatedDate=");
            sbK.append(this.f2627g);
            sbK.append(")");
            return sbK.toString();
        }
    }

    public /* synthetic */ o(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private o() {
    }
}
