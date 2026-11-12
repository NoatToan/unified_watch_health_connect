package bx0;

import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ww0.p;
import ww0.q;
import ww0.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lbx0/d;", "", "<init>", "()V", "b", "g", "a", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "Lbx0/d$a;", "Lbx0/d$b;", "Lbx0/d$c;", "Lbx0/d$d;", "Lbx0/d$e;", "Lbx0/d$f;", "Lbx0/d$g;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbx0/d$a;", "Lbx0/d;", "Lyz1/d;", "status", "<init>", "(Lyz1/d;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f21660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yz1.d dVar) {
            super(null);
            dVar.getClass();
            this.f21660a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f21660a, ((a) obj).f21660a);
        }

        public final int hashCode() {
            return this.f21660a.hashCode();
        }

        public final String toString() {
            return "Inactive(status=" + this.f21660a + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbx0/d$b;", "Lbx0/d;", "Lyz1/d;", "status", "", "dayInCycle", "dayTypeStringRes", "", "indicator", "currentPhase", "nextPhaseStart", "nextPhaseStringRes", "Li53/c;", "percentages", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Li53/c;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f21661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f21662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f21663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Float f21664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f21665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f21666f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f21667g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final i53.c<Float> f21668h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yz1.d dVar, Integer num, Integer num2, Float f14, Integer num3, Integer num4, Integer num5, i53.c<Float> cVar) {
            super(null);
            dVar.getClass();
            cVar.getClass();
            this.f21661a = dVar;
            this.f21662b = num;
            this.f21663c = num2;
            this.f21664d = f14;
            this.f21665e = num3;
            this.f21666f = num4;
            this.f21667g = num5;
            this.f21668h = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f21661a, bVar.f21661a) && s.g(this.f21662b, bVar.f21662b) && s.g(this.f21663c, bVar.f21663c) && s.g(this.f21664d, bVar.f21664d) && s.g(this.f21665e, bVar.f21665e) && s.g(this.f21666f, bVar.f21666f) && s.g(this.f21667g, bVar.f21667g) && s.g(this.f21668h, bVar.f21668h);
        }

        public final int hashCode() {
            int iHashCode = this.f21661a.hashCode() * 31;
            Integer num = this.f21662b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f21663c;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f14 = this.f21664d;
            int iHashCode4 = (iHashCode3 + (f14 == null ? 0 : f14.hashCode())) * 31;
            Integer num3 = this.f21665e;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f21666f;
            int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f21667g;
            return this.f21668h.hashCode() + ((iHashCode6 + (num5 != null ? num5.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MenstrualCycle(status=");
            sb3.append(this.f21661a);
            sb3.append(", dayInCycle=");
            sb3.append(this.f21662b);
            sb3.append(", dayTypeStringRes=");
            sb3.append(this.f21663c);
            sb3.append(", indicator=");
            sb3.append(this.f21664d);
            sb3.append(", currentPhase=");
            x.m(sb3, this.f21665e, ", nextPhaseStart=", this.f21666f, ", nextPhaseStringRes=");
            sb3.append(this.f21667g);
            sb3.append(", percentages=");
            sb3.append(this.f21668h);
            sb3.append(")");
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbx0/d$c;", "Lbx0/d;", "Lyz1/d;", "status", "", "Lww0/t;", "symptoms", "Lww0/p;", "moods", "Lww0/e;", "discharge", "Lww0/s;", "sexualActivity", "<init>", "(Lyz1/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lww0/s;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f21669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<t> f21670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<p> f21671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<ww0.e> f21672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ww0.s f21673e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(yz1.d dVar, List<? extends t> list, List<? extends p> list2, List<? extends ww0.e> list3, ww0.s sVar) {
            super(null);
            dVar.getClass();
            this.f21669a = dVar;
            this.f21670b = list;
            this.f21671c = list2;
            this.f21672d = list3;
            this.f21673e = sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f21669a, cVar.f21669a) && s.g(this.f21670b, cVar.f21670b) && s.g(this.f21671c, cVar.f21671c) && s.g(this.f21672d, cVar.f21672d) && this.f21673e == cVar.f21673e;
        }

        public final int hashCode() {
            int iHashCode = this.f21669a.hashCode() * 31;
            List<t> list = this.f21670b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<p> list2 = this.f21671c;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<ww0.e> list3 = this.f21672d;
            int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
            ww0.s sVar = this.f21673e;
            return iHashCode4 + (sVar != null ? sVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NoPeriod(status=");
            sb3.append(this.f21669a);
            sb3.append(", symptoms=");
            sb3.append(this.f21670b);
            sb3.append(", moods=");
            j.z(sb3, this.f21671c, ", discharge=", this.f21672d, ", sexualActivity=");
            sb3.append(this.f21673e);
            sb3.append(")");
            return sb3.toString();
        }
    }

    /* JADX INFO: renamed from: bx0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbx0/d$d;", "Lbx0/d;", "Lyz1/d;", "status", "<init>", "(Lyz1/d;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0334d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f21674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0334d(yz1.d dVar) {
            super(null);
            dVar.getClass();
            this.f21674a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0334d) && s.g(this.f21674a, ((C0334d) obj).f21674a);
        }

        public final int hashCode() {
            return this.f21674a.hashCode();
        }

        public final String toString() {
            return "NotConfigured(status=" + this.f21674a + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbx0/d$e;", "Lbx0/d;", "Lyz1/d;", "status", "", "dayInCycle", "", "indicator", "currentPhase", "babySizeStringRes", "Lww0/q;", "trimester", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Lww0/q;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f21675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f21676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Float f21677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f21678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f21679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final q f21680f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(yz1.d dVar, Integer num, Float f14, Integer num2, Integer num3, q qVar) {
            super(null);
            dVar.getClass();
            this.f21675a = dVar;
            this.f21676b = num;
            this.f21677c = f14;
            this.f21678d = num2;
            this.f21679e = num3;
            this.f21680f = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f21675a, eVar.f21675a) && s.g(this.f21676b, eVar.f21676b) && s.g(this.f21677c, eVar.f21677c) && s.g(this.f21678d, eVar.f21678d) && s.g(this.f21679e, eVar.f21679e) && this.f21680f == eVar.f21680f;
        }

        public final int hashCode() {
            int iHashCode = this.f21675a.hashCode() * 31;
            Integer num = this.f21676b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f14 = this.f21677c;
            int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
            Integer num2 = this.f21678d;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f21679e;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            q qVar = this.f21680f;
            return iHashCode5 + (qVar != null ? qVar.hashCode() : 0);
        }

        public final String toString() {
            return "Pregnancy(status=" + this.f21675a + ", dayInCycle=" + this.f21676b + ", indicator=" + this.f21677c + ", currentPhase=" + this.f21678d + ", babySizeStringRes=" + this.f21679e + ", trimester=" + this.f21680f + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbx0/d$f;", "Lbx0/d;", "Lyz1/d;", "status", "<init>", "(Lyz1/d;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f21681a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(yz1.d dVar) {
            super(null);
            dVar.getClass();
            this.f21681a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && s.g(this.f21681a, ((f) obj).f21681a);
        }

        public final int hashCode() {
            return this.f21681a.hashCode();
        }

        public final String toString() {
            return "PregnancyTrackingStopped(status=" + this.f21681a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbx0/d$g;", "Lbx0/d;", "Lyz1/d;", "status", "<init>", "(Lyz1/d;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yz1.d f21682a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(yz1.d dVar) {
            super(null);
            dVar.getClass();
            this.f21682a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && s.g(this.f21682a, ((g) obj).f21682a);
        }

        public final int hashCode() {
            return this.f21682a.hashCode();
        }

        public final String toString() {
            return "StaleData(status=" + this.f21682a + ")";
        }
    }

    public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private d() {
    }
}
