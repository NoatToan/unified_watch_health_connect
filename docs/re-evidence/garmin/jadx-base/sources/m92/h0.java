package m92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lm92/h0;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "d", "b", "c", "a", "Lm92/h0$a;", "Lm92/h0$b;", "Lm92/h0$c;", "Lm92/h0$d;", "Lm92/h0$e;", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h0 {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm92/h0$a;", "Lm92/h0;", "", "group", "", "sequentialOrder", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(IFFF)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f117331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f117332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f117333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f117334d;

        public a(int i14, float f14, float f15, float f16) {
            super(null);
            this.f117331a = i14;
            this.f117332b = f14;
            this.f117333c = f15;
            this.f117334d = f16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f117331a == aVar.f117331a && Float.compare(this.f117332b, aVar.f117332b) == 0 && Float.compare(this.f117333c, aVar.f117333c) == 0 && Float.compare(this.f117334d, aVar.f117334d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f117334d) + q6.f.d(this.f117333c, q6.f.d(this.f117332b, Integer.hashCode(this.f117331a) * 31, 31), 31);
        }

        public final String toString() {
            return "GroupPoint(group=" + this.f117331a + ", sequentialOrder=" + this.f117332b + ", x=" + this.f117333c + ", y=" + this.f117334d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm92/h0$c;", "Lm92/h0;", "Lm92/h0$e$b;", "firstPoint", "secondPoint", "<init>", "(Lm92/h0$e$b;Lm92/h0$e$b;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e.b f117339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e.b f117340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e.b bVar, e.b bVar2) {
            super(null);
            bVar.getClass();
            bVar2.getClass();
            this.f117339a = bVar;
            this.f117340b = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f117339a, cVar.f117339a) && p005kotlin.jvm.internal.s.g(this.f117340b, cVar.f117340b);
        }

        public final int hashCode() {
            return this.f117340b.hashCode() + (this.f117339a.hashCode() * 31);
        }

        public final String toString() {
            return "PairColorChartPoint(firstPoint=" + this.f117339a + ", secondPoint=" + this.f117340b + ")";
        }
    }

    public /* synthetic */ h0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lm92/h0$d;", "Lm92/h0;", "<init>", "()V", "b", "a", "Lm92/h0$d$a;", "Lm92/h0$d$b;", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d extends h0 {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm92/h0$d$b;", "Lm92/h0$d;", "", "x", "y1", "y2", "<init>", "(FFF)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f117343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f117344b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f117345c;

            public b(float f14, float f15, float f16) {
                super(null);
                this.f117343a = f14;
                this.f117344b = f15;
                this.f117345c = f16;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Float.compare(this.f117343a, bVar.f117343a) == 0 && Float.compare(this.f117344b, bVar.f117344b) == 0 && Float.compare(this.f117345c, bVar.f117345c) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f117345c) + q6.f.d(this.f117344b, Float.hashCode(this.f117343a) * 31, 31);
            }

            public final String toString() {
                return v.e0.e(this.f117345c, ")", v.e0.i("RangeChartPoint(x=", this.f117343a, ", y1=", this.f117344b, ", y2="));
            }
        }

        private d() {
            super(null);
        }

        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm92/h0$d$a;", "Lm92/h0$d;", "Lm92/h0$d$b;", "rangeChartPoint", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Lm92/h0$d$b;JLkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f117341a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f117342b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private a(b bVar, long j8) {
                super(null);
                bVar.getClass();
                this.f117341a = bVar;
                this.f117342b = j8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p005kotlin.jvm.internal.s.g(this.f117341a, aVar.f117341a) && o4.d0.d(this.f117342b, aVar.f117342b);
            }

            public final int hashCode() {
                int iHashCode = this.f117341a.hashCode() * 31;
                o4.d0.a aVar = o4.d0.f128823b;
                o13.z.a aVar2 = o13.z.f128618b;
                return Long.hashCode(this.f117342b) + iHashCode;
            }

            public final String toString() {
                return "CustomRangeChartPoint(rangeChartPoint=" + this.f117341a + ", color=" + o4.d0.j(this.f117342b) + ")";
            }

            public /* synthetic */ a(b bVar, long j8, p005kotlin.jvm.internal.j jVar) {
                this(bVar, j8);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lm92/h0$e;", "Lm92/h0;", "<init>", "()V", "a", "c", "b", "d", JWKParameterNames.RSA_EXPONENT, "Lm92/h0$e$a;", "Lm92/h0$e$b;", "Lm92/h0$e$c;", "Lm92/h0$e$d;", "Lm92/h0$e$e;", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class e extends h0 {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm92/h0$e$a;", "Lm92/h0$e;", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(FF)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f117346a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f117347b;

            public a(float f14, float f15) {
                super(null);
                this.f117346a = f14;
                this.f117347b = f15;
            }

            public static a a(a aVar, float f14, float f15, int i14) {
                if ((i14 & 1) != 0) {
                    f14 = aVar.f117346a;
                }
                if ((i14 & 2) != 0) {
                    f15 = aVar.f117347b;
                }
                aVar.getClass();
                return new a(f14, f15);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Float.compare(this.f117346a, aVar.f117346a) == 0 && Float.compare(this.f117347b, aVar.f117347b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f117347b) + (Float.hashCode(this.f117346a) * 31);
            }

            public final String toString() {
                return am.j.l("ChartPoint(x=", this.f117346a, ", y=", this.f117347b, ")");
            }
        }

        private e() {
            super(null);
        }

        public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm92/h0$e$b;", "Lm92/h0$e;", "Lm92/h0$e$a;", "chartPoint", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Lm92/h0$e$a;JLkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f117348a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f117349b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private b(a aVar, long j8) {
                super(null);
                aVar.getClass();
                this.f117348a = aVar;
                this.f117349b = j8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p005kotlin.jvm.internal.s.g(this.f117348a, bVar.f117348a) && o4.d0.d(this.f117349b, bVar.f117349b);
            }

            public final int hashCode() {
                int iHashCode = this.f117348a.hashCode() * 31;
                o4.d0.a aVar = o4.d0.f128823b;
                o13.z.a aVar2 = o13.z.f128618b;
                return Long.hashCode(this.f117349b) + iHashCode;
            }

            public final String toString() {
                return "ColorChartPoint(chartPoint=" + this.f117348a + ", color=" + o4.d0.j(this.f117349b) + ")";
            }

            public /* synthetic */ b(a aVar, long j8, p005kotlin.jvm.internal.j jVar) {
                this(aVar, j8);
            }
        }

        @o13.e
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm92/h0$e$c;", "Lm92/h0$e;", "Lm92/h0$e$a;", "chartPoint", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "", "barWidthPercentage", "<init>", "(Lm92/h0$e$a;JLjava/lang/Float;Lkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f117350a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f117351b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Float f117352c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private c(a aVar, long j8, Float f14) {
                super(null);
                aVar.getClass();
                this.f117350a = aVar;
                this.f117351b = j8;
                this.f117352c = f14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p005kotlin.jvm.internal.s.g(this.f117350a, cVar.f117350a) && o4.d0.d(this.f117351b, cVar.f117351b) && p005kotlin.jvm.internal.s.g(this.f117352c, cVar.f117352c);
            }

            public final int hashCode() {
                int iHashCode = this.f117350a.hashCode() * 31;
                o4.d0.a aVar = o4.d0.f128823b;
                o13.z.a aVar2 = o13.z.f128618b;
                int iE = q6.f.e(iHashCode, 31, this.f117351b);
                Float f14 = this.f117352c;
                return iE + (f14 == null ? 0 : f14.hashCode());
            }

            public final String toString() {
                return "CustomChartPoint(chartPoint=" + this.f117350a + ", color=" + o4.d0.j(this.f117351b) + ", barWidthPercentage=" + this.f117352c + ")";
            }

            public /* synthetic */ c(a aVar, long j8, Float f14, p005kotlin.jvm.internal.j jVar) {
                this(aVar, j8, f14);
            }

            public /* synthetic */ c(a aVar, long j8, Float f14, int i14, p005kotlin.jvm.internal.j jVar) {
                this(aVar, j8, (i14 & 4) != 0 ? null : f14, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm92/h0$e$d;", "Lm92/h0$e;", "Lm92/h0$e$a;", "chartPoint", "Lo92/b;", "customShape", "Lm92/g0;", "painterResourceConfig", "<init>", "(Lm92/h0$e$a;Lo92/b;Lm92/g0;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f117353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final o92.b f117354b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g0 f117355c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(a aVar, o92.b bVar, g0 g0Var) {
                super(null);
                aVar.getClass();
                bVar.getClass();
                this.f117353a = aVar;
                this.f117354b = bVar;
                this.f117355c = g0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p005kotlin.jvm.internal.s.g(this.f117353a, dVar.f117353a) && p005kotlin.jvm.internal.s.g(this.f117354b, dVar.f117354b) && p005kotlin.jvm.internal.s.g(this.f117355c, dVar.f117355c);
            }

            public final int hashCode() {
                int iHashCode = (this.f117354b.hashCode() + (this.f117353a.hashCode() * 31)) * 31;
                g0 g0Var = this.f117355c;
                return iHashCode + (g0Var == null ? 0 : g0Var.hashCode());
            }

            public final String toString() {
                return "CustomShapeChartPoint(chartPoint=" + this.f117353a + ", customShape=" + this.f117354b + ", painterResourceConfig=" + this.f117355c + ")";
            }

            public /* synthetic */ d(a aVar, o92.b bVar, g0 g0Var, int i14, p005kotlin.jvm.internal.j jVar) {
                this(aVar, bVar, (i14 & 4) != 0 ? null : g0Var);
            }
        }

        /* JADX INFO: renamed from: m92.h0$e$e, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lm92/h0$e$e;", "Lm92/h0$e;", "Lm92/h0$e$a;", "chartPoint", "Lo92/b;", "customShape", "Lt4/d;", "painter", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "Lg6/f;", "iconSize", "<init>", "(Lm92/h0$e$a;Lo92/b;Lt4/d;JFLkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2226e extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f117356a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final o92.b f117357b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final t4.d f117358c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f117359d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final float f117360e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private C2226e(a aVar, o92.b bVar, t4.d dVar, long j8, float f14) {
                super(null);
                aVar.getClass();
                bVar.getClass();
                dVar.getClass();
                this.f117356a = aVar;
                this.f117357b = bVar;
                this.f117358c = dVar;
                this.f117359d = j8;
                this.f117360e = f14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2226e)) {
                    return false;
                }
                C2226e c2226e = (C2226e) obj;
                return p005kotlin.jvm.internal.s.g(this.f117356a, c2226e.f117356a) && p005kotlin.jvm.internal.s.g(this.f117357b, c2226e.f117357b) && p005kotlin.jvm.internal.s.g(this.f117358c, c2226e.f117358c) && o4.d0.d(this.f117359d, c2226e.f117359d) && g6.f.c(this.f117360e, c2226e.f117360e);
            }

            public final int hashCode() {
                int iHashCode = (this.f117358c.hashCode() + ((this.f117357b.hashCode() + (this.f117356a.hashCode() * 31)) * 31)) * 31;
                o4.d0.a aVar = o4.d0.f128823b;
                o13.z.a aVar2 = o13.z.f128618b;
                int iE = q6.f.e(iHashCode, 31, this.f117359d);
                g6.f.a aVar3 = g6.f.f75994b;
                return Float.hashCode(this.f117360e) + iE;
            }

            public final String toString() {
                String strJ = o4.d0.j(this.f117359d);
                String strD = g6.f.d(this.f117360e);
                StringBuilder sb3 = new StringBuilder("CustomShapePainterChartPoint(chartPoint=");
                sb3.append(this.f117356a);
                sb3.append(", customShape=");
                sb3.append(this.f117357b);
                sb3.append(", painter=");
                sb3.append(this.f117358c);
                sb3.append(", color=");
                sb3.append(strJ);
                sb3.append(", iconSize=");
                return am.j.o(strD, ")", sb3);
            }

            public /* synthetic */ C2226e(a aVar, o92.b bVar, t4.d dVar, long j8, float f14, p005kotlin.jvm.internal.j jVar) {
                this(aVar, bVar, dVar, j8, f14);
            }
        }
    }

    private h0() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm92/h0$b;", "Lm92/h0;", "Lm92/h0$e$a;", "firstPoint", "Lo4/d0;", "firstColor", "secondPoint", "secondColor", "<init>", "(Lm92/h0$e$a;JLm92/h0$e$a;JLkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e.a f117335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f117336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e.a f117337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f117338d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private b(e.a aVar, long j8, e.a aVar2, long j14) {
            super(null);
            aVar.getClass();
            aVar2.getClass();
            this.f117335a = aVar;
            this.f117336b = j8;
            this.f117337c = aVar2;
            this.f117338d = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f117335a, bVar.f117335a) && o4.d0.d(this.f117336b, bVar.f117336b) && p005kotlin.jvm.internal.s.g(this.f117337c, bVar.f117337c) && o4.d0.d(this.f117338d, bVar.f117338d);
        }

        public final int hashCode() {
            int iHashCode = this.f117335a.hashCode() * 31;
            o4.d0.a aVar = o4.d0.f128823b;
            o13.z.a aVar2 = o13.z.f128618b;
            return Long.hashCode(this.f117338d) + ((this.f117337c.hashCode() + q6.f.e(iHashCode, 31, this.f117336b)) * 31);
        }

        public final String toString() {
            return "PairChartPoint(firstPoint=" + this.f117335a + ", firstColor=" + o4.d0.j(this.f117336b) + ", secondPoint=" + this.f117337c + ", secondColor=" + o4.d0.j(this.f117338d) + ")";
        }

        public /* synthetic */ b(e.a aVar, long j8, e.a aVar2, long j14, p005kotlin.jvm.internal.j jVar) {
            this(aVar, j8, aVar2, j14);
        }
    }
}
