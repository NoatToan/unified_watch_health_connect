package u4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0013\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,¨\u0006-"}, d2 = {"Lu4/g;", "", "", "isCurve", "isQuad", "<init>", "(ZZ)V", "b", JWKParameterNames.RSA_MODULUS, "f", "m", JWKParameterNames.RSA_EXPONENT, "l", "d", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "s", JWKParameterNames.OCT_KEY_VALUE, "c", "p", "h", "o", "g", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, IntegerTokenConverter.CONVERTER_KEY, "j", "a", "Lu4/g$a;", "Lu4/g$b;", "Lu4/g$c;", "Lu4/g$d;", "Lu4/g$e;", "Lu4/g$f;", "Lu4/g$g;", "Lu4/g$h;", "Lu4/g$i;", "Lu4/g$j;", "Lu4/g$k;", "Lu4/g$l;", "Lu4/g$m;", "Lu4/g$n;", "Lu4/g$o;", "Lu4/g$p;", "Lu4/g$q;", "Lu4/g$r;", "Lu4/g$s;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f168429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168430b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu4/g$a;", "Lu4/g;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f168433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f168434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f168435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f168436h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f168437i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f14, float f15, float f16, boolean z14, boolean z15, float f17, float f18) {
            boolean z16 = false;
            super(z16, z16, 3, null);
            this.f168431c = f14;
            this.f168432d = f15;
            this.f168433e = f16;
            this.f168434f = z14;
            this.f168435g = z15;
            this.f168436h = f17;
            this.f168437i = f18;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f168431c, aVar.f168431c) == 0 && Float.compare(this.f168432d, aVar.f168432d) == 0 && Float.compare(this.f168433e, aVar.f168433e) == 0 && this.f168434f == aVar.f168434f && this.f168435g == aVar.f168435g && Float.compare(this.f168436h, aVar.f168436h) == 0 && Float.compare(this.f168437i, aVar.f168437i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168437i) + q6.f.d(this.f168436h, q6.f.g(q6.f.g(q6.f.d(this.f168433e, q6.f.d(this.f168432d, Float.hashCode(this.f168431c) * 31, 31), 31), 31, this.f168434f), 31, this.f168435g), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb3.append(this.f168431c);
            sb3.append(", verticalEllipseRadius=");
            sb3.append(this.f168432d);
            sb3.append(", theta=");
            sb3.append(this.f168433e);
            sb3.append(", isMoreThanHalf=");
            sb3.append(this.f168434f);
            sb3.append(", isPositiveArc=");
            sb3.append(this.f168435g);
            sb3.append(", arcStartX=");
            sb3.append(this.f168436h);
            sb3.append(", arcStartY=");
            return q6.f.p(sb3, this.f168437i, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu4/g$b;", "Lu4/g;", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f168438c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            boolean z14 = false;
            super(z14, z14, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu4/g$c;", "Lu4/g;", "", "x1", "y1", "x2", "y2", "x3", "y3", "<init>", "(FFFFFF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f168441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f168442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f168443g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f168444h;

        public c(float f14, float f15, float f16, float f17, float f18, float f19) {
            super(true, false, 2, null);
            this.f168439c = f14;
            this.f168440d = f15;
            this.f168441e = f16;
            this.f168442f = f17;
            this.f168443g = f18;
            this.f168444h = f19;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f168439c, cVar.f168439c) == 0 && Float.compare(this.f168440d, cVar.f168440d) == 0 && Float.compare(this.f168441e, cVar.f168441e) == 0 && Float.compare(this.f168442f, cVar.f168442f) == 0 && Float.compare(this.f168443g, cVar.f168443g) == 0 && Float.compare(this.f168444h, cVar.f168444h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168444h) + q6.f.d(this.f168443g, q6.f.d(this.f168442f, q6.f.d(this.f168441e, q6.f.d(this.f168440d, Float.hashCode(this.f168439c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("CurveTo(x1=");
            sb3.append(this.f168439c);
            sb3.append(", y1=");
            sb3.append(this.f168440d);
            sb3.append(", x2=");
            sb3.append(this.f168441e);
            sb3.append(", y2=");
            sb3.append(this.f168442f);
            sb3.append(", x3=");
            sb3.append(this.f168443g);
            sb3.append(", y3=");
            return q6.f.p(sb3, this.f168444h, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu4/g$d;", "Lu4/g;", "", "x", "<init>", "(F)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168445c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f14) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f168445c = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f168445c, ((d) obj).f168445c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168445c);
        }

        public final String toString() {
            return q6.f.p(new StringBuilder("HorizontalTo(x="), this.f168445c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu4/g$e;", "Lu4/g;", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(FF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168447d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f14, float f15) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f168446c = f14;
            this.f168447d = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f168446c, eVar.f168446c) == 0 && Float.compare(this.f168447d, eVar.f168447d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168447d) + (Float.hashCode(this.f168446c) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("LineTo(x=");
            sb3.append(this.f168446c);
            sb3.append(", y=");
            return q6.f.p(sb3, this.f168447d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu4/g$f;", "Lu4/g;", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(FF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class f extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168449d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f14, float f15) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f168448c = f14;
            this.f168449d = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f168448c, fVar.f168448c) == 0 && Float.compare(this.f168449d, fVar.f168449d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168449d) + (Float.hashCode(this.f168448c) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MoveTo(x=");
            sb3.append(this.f168448c);
            sb3.append(", y=");
            return q6.f.p(sb3, this.f168449d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX INFO: renamed from: u4.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu4/g$g;", "Lu4/g;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C3160g extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f168452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f168453f;

        public C3160g(float f14, float f15, float f16, float f17) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f168450c = f14;
            this.f168451d = f15;
            this.f168452e = f16;
            this.f168453f = f17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3160g)) {
                return false;
            }
            C3160g c3160g = (C3160g) obj;
            return Float.compare(this.f168450c, c3160g.f168450c) == 0 && Float.compare(this.f168451d, c3160g.f168451d) == 0 && Float.compare(this.f168452e, c3160g.f168452e) == 0 && Float.compare(this.f168453f, c3160g.f168453f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168453f) + q6.f.d(this.f168452e, q6.f.d(this.f168451d, Float.hashCode(this.f168450c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("QuadTo(x1=");
            sb3.append(this.f168450c);
            sb3.append(", y1=");
            sb3.append(this.f168451d);
            sb3.append(", x2=");
            sb3.append(this.f168452e);
            sb3.append(", y2=");
            return q6.f.p(sb3, this.f168453f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu4/g$h;", "Lu4/g;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class h extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f168456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f168457f;

        public h(float f14, float f15, float f16, float f17) {
            super(true, false, 2, null);
            this.f168454c = f14;
            this.f168455d = f15;
            this.f168456e = f16;
            this.f168457f = f17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Float.compare(this.f168454c, hVar.f168454c) == 0 && Float.compare(this.f168455d, hVar.f168455d) == 0 && Float.compare(this.f168456e, hVar.f168456e) == 0 && Float.compare(this.f168457f, hVar.f168457f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168457f) + q6.f.d(this.f168456e, q6.f.d(this.f168455d, Float.hashCode(this.f168454c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ReflectiveCurveTo(x1=");
            sb3.append(this.f168454c);
            sb3.append(", y1=");
            sb3.append(this.f168455d);
            sb3.append(", x2=");
            sb3.append(this.f168456e);
            sb3.append(", y2=");
            return q6.f.p(sb3, this.f168457f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu4/g$i;", "Lu4/g;", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(FF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class i extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168459d;

        public i(float f14, float f15) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f168458c = f14;
            this.f168459d = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f168458c, iVar.f168458c) == 0 && Float.compare(this.f168459d, iVar.f168459d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168459d) + (Float.hashCode(this.f168458c) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ReflectiveQuadTo(x=");
            sb3.append(this.f168458c);
            sb3.append(", y=");
            return q6.f.p(sb3, this.f168459d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu4/g$j;", "Lu4/g;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class j extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f168462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f168463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f168464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f168465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f168466i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f14, float f15, float f16, boolean z14, boolean z15, float f17, float f18) {
            boolean z16 = false;
            super(z16, z16, 3, null);
            this.f168460c = f14;
            this.f168461d = f15;
            this.f168462e = f16;
            this.f168463f = z14;
            this.f168464g = z15;
            this.f168465h = f17;
            this.f168466i = f18;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f168460c, jVar.f168460c) == 0 && Float.compare(this.f168461d, jVar.f168461d) == 0 && Float.compare(this.f168462e, jVar.f168462e) == 0 && this.f168463f == jVar.f168463f && this.f168464g == jVar.f168464g && Float.compare(this.f168465h, jVar.f168465h) == 0 && Float.compare(this.f168466i, jVar.f168466i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168466i) + q6.f.d(this.f168465h, q6.f.g(q6.f.g(q6.f.d(this.f168462e, q6.f.d(this.f168461d, Float.hashCode(this.f168460c) * 31, 31), 31), 31, this.f168463f), 31, this.f168464g), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb3.append(this.f168460c);
            sb3.append(", verticalEllipseRadius=");
            sb3.append(this.f168461d);
            sb3.append(", theta=");
            sb3.append(this.f168462e);
            sb3.append(", isMoreThanHalf=");
            sb3.append(this.f168463f);
            sb3.append(", isPositiveArc=");
            sb3.append(this.f168464g);
            sb3.append(", arcStartDx=");
            sb3.append(this.f168465h);
            sb3.append(", arcStartDy=");
            return q6.f.p(sb3, this.f168466i, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu4/g$k;", "Lu4/g;", "", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "<init>", "(FFFFFF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class k extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f168469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f168470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f168471g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f168472h;

        public k(float f14, float f15, float f16, float f17, float f18, float f19) {
            super(true, false, 2, null);
            this.f168467c = f14;
            this.f168468d = f15;
            this.f168469e = f16;
            this.f168470f = f17;
            this.f168471g = f18;
            this.f168472h = f19;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f168467c, kVar.f168467c) == 0 && Float.compare(this.f168468d, kVar.f168468d) == 0 && Float.compare(this.f168469e, kVar.f168469e) == 0 && Float.compare(this.f168470f, kVar.f168470f) == 0 && Float.compare(this.f168471g, kVar.f168471g) == 0 && Float.compare(this.f168472h, kVar.f168472h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168472h) + q6.f.d(this.f168471g, q6.f.d(this.f168470f, q6.f.d(this.f168469e, q6.f.d(this.f168468d, Float.hashCode(this.f168467c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RelativeCurveTo(dx1=");
            sb3.append(this.f168467c);
            sb3.append(", dy1=");
            sb3.append(this.f168468d);
            sb3.append(", dx2=");
            sb3.append(this.f168469e);
            sb3.append(", dy2=");
            sb3.append(this.f168470f);
            sb3.append(", dx3=");
            sb3.append(this.f168471g);
            sb3.append(", dy3=");
            return q6.f.p(sb3, this.f168472h, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu4/g$l;", "Lu4/g;", "", "dx", "<init>", "(F)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class l extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168473c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f14) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f168473c = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f168473c, ((l) obj).f168473c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168473c);
        }

        public final String toString() {
            return q6.f.p(new StringBuilder("RelativeHorizontalTo(dx="), this.f168473c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu4/g$m;", "Lu4/g;", "", "dx", "dy", "<init>", "(FF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class m extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168475d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f14, float f15) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f168474c = f14;
            this.f168475d = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f168474c, mVar.f168474c) == 0 && Float.compare(this.f168475d, mVar.f168475d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168475d) + (Float.hashCode(this.f168474c) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RelativeLineTo(dx=");
            sb3.append(this.f168474c);
            sb3.append(", dy=");
            return q6.f.p(sb3, this.f168475d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu4/g$n;", "Lu4/g;", "", "dx", "dy", "<init>", "(FF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class n extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168477d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f14, float f15) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f168476c = f14;
            this.f168477d = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f168476c, nVar.f168476c) == 0 && Float.compare(this.f168477d, nVar.f168477d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168477d) + (Float.hashCode(this.f168476c) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RelativeMoveTo(dx=");
            sb3.append(this.f168476c);
            sb3.append(", dy=");
            return q6.f.p(sb3, this.f168477d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu4/g$o;", "Lu4/g;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class o extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f168480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f168481f;

        public o(float f14, float f15, float f16, float f17) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f168478c = f14;
            this.f168479d = f15;
            this.f168480e = f16;
            this.f168481f = f17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f168478c, oVar.f168478c) == 0 && Float.compare(this.f168479d, oVar.f168479d) == 0 && Float.compare(this.f168480e, oVar.f168480e) == 0 && Float.compare(this.f168481f, oVar.f168481f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168481f) + q6.f.d(this.f168480e, q6.f.d(this.f168479d, Float.hashCode(this.f168478c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RelativeQuadTo(dx1=");
            sb3.append(this.f168478c);
            sb3.append(", dy1=");
            sb3.append(this.f168479d);
            sb3.append(", dx2=");
            sb3.append(this.f168480e);
            sb3.append(", dy2=");
            return q6.f.p(sb3, this.f168481f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu4/g$p;", "Lu4/g;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class p extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f168484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f168485f;

        public p(float f14, float f15, float f16, float f17) {
            super(true, false, 2, null);
            this.f168482c = f14;
            this.f168483d = f15;
            this.f168484e = f16;
            this.f168485f = f17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f168482c, pVar.f168482c) == 0 && Float.compare(this.f168483d, pVar.f168483d) == 0 && Float.compare(this.f168484e, pVar.f168484e) == 0 && Float.compare(this.f168485f, pVar.f168485f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168485f) + q6.f.d(this.f168484e, q6.f.d(this.f168483d, Float.hashCode(this.f168482c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb3.append(this.f168482c);
            sb3.append(", dy1=");
            sb3.append(this.f168483d);
            sb3.append(", dx2=");
            sb3.append(this.f168484e);
            sb3.append(", dy2=");
            return q6.f.p(sb3, this.f168485f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu4/g$q;", "Lu4/g;", "", "dx", "dy", "<init>", "(FF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class q extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168487d;

        public q(float f14, float f15) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f168486c = f14;
            this.f168487d = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f168486c, qVar.f168486c) == 0 && Float.compare(this.f168487d, qVar.f168487d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168487d) + (Float.hashCode(this.f168486c) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb3.append(this.f168486c);
            sb3.append(", dy=");
            return q6.f.p(sb3, this.f168487d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu4/g$r;", "Lu4/g;", "", "dy", "<init>", "(F)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class r extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168488c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f14) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f168488c = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f168488c, ((r) obj).f168488c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168488c);
        }

        public final String toString() {
            return q6.f.p(new StringBuilder("RelativeVerticalTo(dy="), this.f168488c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu4/g$s;", "Lu4/g;", "", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(F)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class s extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168489c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f14) {
            boolean z14 = false;
            super(z14, z14, 3, null);
            this.f168489c = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f168489c, ((s) obj).f168489c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f168489c);
        }

        public final String toString() {
            return q6.f.p(new StringBuilder("VerticalTo(y="), this.f168489c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public /* synthetic */ g(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, null);
    }

    private g(boolean z14, boolean z15) {
        this.f168429a = z14;
        this.f168430b = z15;
    }

    public /* synthetic */ g(boolean z14, boolean z15, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15);
    }
}
