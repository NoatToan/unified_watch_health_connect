package c33;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c33.d f24176a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c33.d dVar) {
            super(null);
            dVar.getClass();
            this.f24176a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f24176a, ((a) obj).f24176a);
        }

        public final int hashCode() {
            return this.f24176a.hashCode();
        }

        public final String toString() {
            return "AnnotationValue(" + this.f24176a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f24179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i14) {
            super(null);
            str.getClass();
            this.f24177a = str;
            this.f24178b = i14;
            if (i14 <= 0) {
                vb.h.s("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
                throw null;
            }
            StringBuilder sb3 = new StringBuilder("ArrayKClassValue(");
            for (int i15 = 0; i15 < i14; i15++) {
                sb3.append("kotlin/Array<");
            }
            sb3.append(this.f24177a);
            int i16 = this.f24178b;
            for (int i17 = 0; i17 < i16; i17++) {
                sb3.append(">");
            }
            sb3.append(")");
            this.f24179c = sb3.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f24177a, bVar.f24177a) && this.f24178b == bVar.f24178b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24178b) + (this.f24177a.hashCode() * 31);
        }

        public final String toString() {
            return this.f24179c;
        }
    }

    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<e> f24180a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends e> list) {
            super(null);
            list.getClass();
            this.f24180a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f24180a, ((c) obj).f24180a);
        }

        public final int hashCode() {
            return this.f24180a.hashCode();
        }

        public final String toString() {
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f24180a, new StringBuilder("ArrayValue("));
        }
    }

    public static final class d extends l<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f24181a;

        public d(boolean z14) {
            super(null);
            this.f24181a = z14;
        }

        @Override // c33.e.l
        public final Boolean a() {
            return Boolean.valueOf(this.f24181a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f24181a == ((d) obj).f24181a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f24181a);
        }
    }

    /* JADX INFO: renamed from: c33.e$e, reason: collision with other inner class name */
    public static final class C0349e extends l<Byte> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f24182a;

        public C0349e(byte b14) {
            super(null);
            this.f24182a = b14;
        }

        @Override // c33.e.l
        public final Byte a() {
            return Byte.valueOf(this.f24182a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0349e) && this.f24182a == ((C0349e) obj).f24182a;
        }

        public final int hashCode() {
            return Byte.hashCode(this.f24182a);
        }
    }

    public static final class f extends l<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f24183a;

        public f(char c14) {
            super(null);
            this.f24183a = c14;
        }

        @Override // c33.e.l
        public final Character a() {
            return Character.valueOf(this.f24183a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f24183a == ((f) obj).f24183a;
        }

        public final int hashCode() {
            return Character.hashCode(this.f24183a);
        }
    }

    public static final class g extends l<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f24184a;

        public g(double d14) {
            super(null);
            this.f24184a = d14;
        }

        @Override // c33.e.l
        public final Double a() {
            return Double.valueOf(this.f24184a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Double.compare(this.f24184a, ((g) obj).f24184a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f24184a);
        }
    }

    public static final class h extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f24186b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f24185a = str;
            this.f24186b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return p005kotlin.jvm.internal.s.g(this.f24185a, hVar.f24185a) && p005kotlin.jvm.internal.s.g(this.f24186b, hVar.f24186b);
        }

        public final int hashCode() {
            return this.f24186b.hashCode() + (this.f24185a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("EnumValue(");
            sb3.append(this.f24185a);
            sb3.append('.');
            return androidx.room.a0.m(sb3, this.f24186b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class i extends l<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f24187a;

        public i(float f14) {
            super(null);
            this.f24187a = f14;
        }

        @Override // c33.e.l
        public final Float a() {
            return Float.valueOf(this.f24187a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Float.compare(this.f24187a, ((i) obj).f24187a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f24187a);
        }
    }

    public static final class j extends l<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24188a;

        public j(int i14) {
            super(null);
            this.f24188a = i14;
        }

        @Override // c33.e.l
        public final Integer a() {
            return Integer.valueOf(this.f24188a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f24188a == ((j) obj).f24188a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24188a);
        }
    }

    public static final class k extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24189a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(null);
            str.getClass();
            this.f24189a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && p005kotlin.jvm.internal.s.g(this.f24189a, ((k) obj).f24189a);
        }

        public final int hashCode() {
            return this.f24189a.hashCode();
        }

        public final String toString() {
            return androidx.room.a0.m(new StringBuilder("KClassValue("), this.f24189a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class m extends l<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f24190a;

        public m(long j8) {
            super(null);
            this.f24190a = j8;
        }

        @Override // c33.e.l
        public final Long a() {
            return Long.valueOf(this.f24190a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f24190a == ((m) obj).f24190a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f24190a);
        }
    }

    public static final class n extends l<Short> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short f24191a;

        public n(short s8) {
            super(null);
            this.f24191a = s8;
        }

        @Override // c33.e.l
        public final Short a() {
            return Short.valueOf(this.f24191a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f24191a == ((n) obj).f24191a;
        }

        public final int hashCode() {
            return Short.hashCode(this.f24191a);
        }
    }

    public static final class o extends l<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24192a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(null);
            str.getClass();
            this.f24192a = str;
        }

        @Override // c33.e.l
        public final String a() {
            return this.f24192a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && p005kotlin.jvm.internal.s.g(this.f24192a, ((o) obj).f24192a);
        }

        public final int hashCode() {
            return this.f24192a.hashCode();
        }
    }

    public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public static abstract class l<T> extends e {
        private l() {
            super(null);
        }

        public abstract T a();

        public final String toString() {
            String string;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getClass().getSimpleName());
            sb3.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            if (this instanceof o) {
                string = "\"" + ((Object) ((o) this).f24192a) + CoreConstants.DOUBLE_QUOTE_CHAR;
            } else {
                string = a().toString();
            }
            return androidx.room.a0.m(sb3, string, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ l(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    private e() {
    }

    public static final class p extends l<o13.v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f24193a;

        private p(byte b14) {
            super(null);
            this.f24193a = b14;
        }

        @Override // c33.e.l
        public final o13.v a() {
            return o13.v.a(this.f24193a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f24193a == ((p) obj).f24193a;
        }

        public final int hashCode() {
            o13.v.a aVar = o13.v.f128608b;
            return Byte.hashCode(this.f24193a);
        }

        public /* synthetic */ p(byte b14, p005kotlin.jvm.internal.j jVar) {
            this(b14);
        }
    }

    public static final class q extends l<o13.x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24194a;

        private q(int i14) {
            super(null);
            this.f24194a = i14;
        }

        @Override // c33.e.l
        public final o13.x a() {
            return o13.x.a(this.f24194a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f24194a == ((q) obj).f24194a;
        }

        public final int hashCode() {
            o13.x.a aVar = o13.x.f128613b;
            return Integer.hashCode(this.f24194a);
        }

        public /* synthetic */ q(int i14, p005kotlin.jvm.internal.j jVar) {
            this(i14);
        }
    }

    public static final class r extends l<o13.z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f24195a;

        private r(long j8) {
            super(null);
            this.f24195a = j8;
        }

        @Override // c33.e.l
        public final o13.z a() {
            return o13.z.a(this.f24195a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f24195a == ((r) obj).f24195a;
        }

        public final int hashCode() {
            o13.z.a aVar = o13.z.f128618b;
            return Long.hashCode(this.f24195a);
        }

        public /* synthetic */ r(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    public static final class s extends l<o13.c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short f24196a;

        private s(short s8) {
            super(null);
            this.f24196a = s8;
        }

        @Override // c33.e.l
        public final o13.c0 a() {
            return o13.c0.a(this.f24196a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f24196a == ((s) obj).f24196a;
        }

        public final int hashCode() {
            o13.c0.a aVar = o13.c0.f128567b;
            return Short.hashCode(this.f24196a);
        }

        public /* synthetic */ s(short s8, p005kotlin.jvm.internal.j jVar) {
            this(s8);
        }
    }
}
