package j82;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0014\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lj82/g;", "", "<init>", "()V", IntegerTokenConverter.CONVERTER_KEY, "a", "b", "c", "l", "m", JWKParameterNames.RSA_EXPONENT, "h", JWKParameterNames.RSA_MODULUS, "o", "p", "f", "g", "s", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.OCT_KEY_VALUE, "j", "d", "Lj82/g$a;", "Lj82/g$b;", "Lj82/g$c;", "Lj82/g$d;", "Lj82/g$e;", "Lj82/g$f;", "Lj82/g$g;", "Lj82/g$h;", "Lj82/g$i;", "Lj82/g$j;", "Lj82/g$k;", "Lj82/g$l;", "Lj82/g$m;", "Lj82/g$n;", "Lj82/g$o;", "Lj82/g$p;", "Lj82/g$q;", "Lj82/g$r;", "Lj82/g$s;", "Lj82/g$t;", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj82/g$d;", "Lj82/g;", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Le23/p;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.p<p3.m, Integer, Unit> f97723a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e23.p<? super p3.m, ? super Integer, Unit> pVar) {
            super(null);
            pVar.getClass();
            this.f97723a = pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f97723a, ((d) obj).f97723a);
        }

        public final int hashCode() {
            return this.f97723a.hashCode();
        }

        public final String toString() {
            return "Custom(content=" + this.f97723a + ")";
        }
    }

    public /* synthetic */ g(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private g() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$a;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97720a;

        private a(long j8) {
            super(null);
            this.f97720a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && d0.d(this.f97720a, ((a) obj).f97720a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97720a);
        }

        public final String toString() {
            return am.j.m("Circle(color=", d0.j(this.f97720a), ")");
        }

        public /* synthetic */ a(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$b;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97721a;

        private b(long j8) {
            super(null);
            this.f97721a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && d0.d(this.f97721a, ((b) obj).f97721a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97721a);
        }

        public final String toString() {
            return am.j.m("CircleLine(color=", d0.j(this.f97721a), ")");
        }

        public /* synthetic */ b(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$c;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97722a;

        private c(long j8) {
            super(null);
            this.f97722a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && d0.d(this.f97722a, ((c) obj).f97722a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97722a);
        }

        public final String toString() {
            return am.j.m("CircleStroke(color=", d0.j(this.f97722a), ")");
        }

        public /* synthetic */ c(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$e;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97724a;

        private e(long j8) {
            super(null);
            this.f97724a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && d0.d(this.f97724a, ((e) obj).f97724a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97724a);
        }

        public final String toString() {
            return am.j.m("DashedLine(color=", d0.j(this.f97724a), ")");
        }

        public /* synthetic */ e(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$f;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97725a;

        private f(long j8) {
            super(null);
            this.f97725a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && d0.d(this.f97725a, ((f) obj).f97725a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97725a);
        }

        public final String toString() {
            return am.j.m("Diamond(color=", d0.j(this.f97725a), ")");
        }

        public /* synthetic */ f(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    /* JADX INFO: renamed from: j82.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$g;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1863g extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97726a;

        private C1863g(long j8) {
            super(null);
            this.f97726a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1863g) && d0.d(this.f97726a, ((C1863g) obj).f97726a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97726a);
        }

        public final String toString() {
            return am.j.m("DiamondStroke(color=", d0.j(this.f97726a), ")");
        }

        public /* synthetic */ C1863g(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$h;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97727a;

        private h(long j8) {
            super(null);
            this.f97727a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && d0.d(this.f97727a, ((h) obj).f97727a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97727a);
        }

        public final String toString() {
            return am.j.m("DottedLine(color=", d0.j(this.f97727a), ")");
        }

        public /* synthetic */ h(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$j;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97729a;

        private j(long j8) {
            super(null);
            this.f97729a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && d0.d(this.f97729a, ((j) obj).f97729a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97729a);
        }

        public final String toString() {
            return am.j.m("PathDashed(color=", d0.j(this.f97729a), ")");
        }

        public /* synthetic */ j(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$k;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97730a;

        private k(long j8) {
            super(null);
            this.f97730a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && d0.d(this.f97730a, ((k) obj).f97730a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97730a);
        }

        public final String toString() {
            return am.j.m("PathSolid(color=", d0.j(this.f97730a), ")");
        }

        public /* synthetic */ k(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$l;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97731a;

        private l(long j8) {
            super(null);
            this.f97731a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && d0.d(this.f97731a, ((l) obj).f97731a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97731a);
        }

        public final String toString() {
            return am.j.m("SolidLine(color=", d0.j(this.f97731a), ")");
        }

        public /* synthetic */ l(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$m;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97732a;

        private m(long j8) {
            super(null);
            this.f97732a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && d0.d(this.f97732a, ((m) obj).f97732a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97732a);
        }

        public final String toString() {
            return am.j.m("SolidVerticalLine(color=", d0.j(this.f97732a), ")");
        }

        public /* synthetic */ m(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$n;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97733a;

        private n(long j8) {
            super(null);
            this.f97733a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && d0.d(this.f97733a, ((n) obj).f97733a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97733a);
        }

        public final String toString() {
            return am.j.m("Square(color=", d0.j(this.f97733a), ")");
        }

        public /* synthetic */ n(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$o;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97734a;

        private o(long j8) {
            super(null);
            this.f97734a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && d0.d(this.f97734a, ((o) obj).f97734a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97734a);
        }

        public final String toString() {
            return am.j.m("SquareLine(color=", d0.j(this.f97734a), ")");
        }

        public /* synthetic */ o(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$p;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97735a;

        private p(long j8) {
            super(null);
            this.f97735a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && d0.d(this.f97735a, ((p) obj).f97735a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97735a);
        }

        public final String toString() {
            return am.j.m("SquareStroke(color=", d0.j(this.f97735a), ")");
        }

        public /* synthetic */ p(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$q;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97736a;

        private q(long j8) {
            super(null);
            this.f97736a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && d0.d(this.f97736a, ((q) obj).f97736a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97736a);
        }

        public final String toString() {
            return am.j.m("TriangleDown(color=", d0.j(this.f97736a), ")");
        }

        public /* synthetic */ q(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$r;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97737a;

        private r(long j8) {
            super(null);
            this.f97737a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && d0.d(this.f97737a, ((r) obj).f97737a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97737a);
        }

        public final String toString() {
            return am.j.m("TriangleDownStroke(color=", d0.j(this.f97737a), ")");
        }

        public /* synthetic */ r(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$s;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97738a;

        private s(long j8) {
            super(null);
            this.f97738a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && d0.d(this.f97738a, ((s) obj).f97738a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97738a);
        }

        public final String toString() {
            return am.j.m("TriangleUp(color=", d0.j(this.f97738a), ")");
        }

        public /* synthetic */ s(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$t;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97739a;

        private t(long j8) {
            super(null);
            this.f97739a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && d0.d(this.f97739a, ((t) obj).f97739a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97739a);
        }

        public final String toString() {
            return am.j.m("TriangleUpStroke(color=", d0.j(this.f97739a), ")");
        }

        public /* synthetic */ t(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj82/g$i;", "Lj82/g;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97728a;

        /* JADX WARN: Illegal instructions before constructor call */
        public i(long j8, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 1) != 0) {
                d0.f128823b.getClass();
                j8 = d0.f128831j;
            }
            this(j8, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && d0.d(this.f97728a, ((i) obj).f97728a);
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Long.hashCode(this.f97728a);
        }

        public final String toString() {
            return am.j.m("Empty(color=", d0.j(this.f97728a), ")");
        }

        private i(long j8) {
            super(null);
            this.f97728a = j8;
        }

        public /* synthetic */ i(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }
}
