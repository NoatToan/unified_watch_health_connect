package p005kotlin.jvm.internal;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import i3.e5;
import java.lang.annotation.Annotation;
import java.util.List;
import k23.d;
import k23.e;
import k23.p;
import k23.r;
import k23.s;
import kn1.m;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/jvm/internal/a1;", "Lk23/p;", "Lk23/e;", "classifier", "", "Lk23/r;", "arguments", "platformTypeUpperBound", "", "flags", "<init>", "(Lk23/e;Ljava/util/List;Lk23/p;I)V", "", "isMarkedNullable", "(Lk23/e;Ljava/util/List;Z)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a1 implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f105781e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f105782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<r> f105783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f105784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f105785d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105786a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f105786a = iArr;
        }
    }

    static {
        new a(null);
    }

    public a1(e eVar, List<r> list, p pVar, int i14) {
        eVar.getClass();
        list.getClass();
        this.f105782a = eVar;
        this.f105783b = list;
        this.f105784c = pVar;
        this.f105785d = i14;
    }

    public final String c(boolean z14) {
        String name;
        e eVar = this.f105782a;
        d dVar = eVar instanceof d ? (d) eVar : null;
        Class clsU = dVar != null ? dh.b.u(dVar) : null;
        if (clsU == null) {
            name = eVar.toString();
        } else if ((this.f105785d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (!clsU.isArray()) {
            name = (z14 && clsU.isPrimitive()) ? dh.b.v((d) eVar).getName() : clsU.getName();
        } else if (clsU.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsU.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsU.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsU.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsU.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsU.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsU.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsU.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        String strG = e5.g(name, this.f105783b.isEmpty() ? "" : h0.k0(this.f105783b, ", ", "<", ">", new m(this), 24), getF16114d() ? CallerData.NA : "");
        p pVar = this.f105784c;
        if (!(pVar instanceof a1)) {
            return strG;
        }
        String strC = ((a1) pVar).c(true);
        if (strC.equals(strG)) {
            return strG;
        }
        if (strC.equals(strG.concat(CallerData.NA))) {
            return strG.concat("!");
        }
        return "(" + strG + CallerDataConverter.DEFAULT_RANGE_DELIMITER + strC + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return s.g(this.f105782a, a1Var.f105782a) && s.g(this.f105783b, a1Var.f105783b) && s.g(this.f105784c, a1Var.f105784c) && this.f105785d == a1Var.f105785d;
    }

    @Override // k23.p
    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getF105782a() {
        return this.f105782a;
    }

    @Override // k23.b
    public final List<Annotation> getAnnotations() {
        return j0.f134944a;
    }

    @Override // k23.p
    public final List<r> h() {
        return this.f105783b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f105785d) + u0.b(this.f105782a.hashCode() * 31, 31, this.f105783b);
    }

    @Override // k23.p
    /* JADX INFO: renamed from: i */
    public final boolean getF16114d() {
        return (this.f105785d & 1) != 0;
    }

    public final String toString() {
        return c(false).concat(" (Kotlin reflection is not available)");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/jvm/internal/a1$a;", "", "<init>", "()V", "", "IS_MARKED_NULLABLE", "I", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(e eVar, List<r> list, boolean z14) {
        this(eVar, list, null, z14 ? 1 : 0);
        eVar.getClass();
        list.getClass();
    }
}
