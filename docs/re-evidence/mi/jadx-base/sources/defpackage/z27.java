package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public final class z27 extends a37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f40803a = c();

    public static class a extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double[] f40804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40805b;
        public final int c;

        public a(double[] dArr, int i, int i2) {
            this.f40804a = dArr;
            this.f40805b = i;
            this.c = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Double) && z27.e(this.f40804a, ((Double) obj).doubleValue(), this.f40805b, this.c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double get(int i) {
            c6i.m(i, size());
            return Double.valueOf(this.f40804a[this.f40805b + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f40804a[this.f40805b + i] != aVar.f40804a[aVar.f40805b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Double set(int i, Double d) {
            c6i.m(i, size());
            double[] dArr = this.f40804a;
            int i2 = this.f40805b;
            double d2 = dArr[i2 + i];
            dArr[i2 + i] = ((Double) c6i.o(d)).doubleValue();
            return Double.valueOf(d2);
        }

        public double[] g() {
            return Arrays.copyOfRange(this.f40804a, this.f40805b, this.c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iD = 1;
            for (int i = this.f40805b; i < this.c; i++) {
                iD = (iD * 31) + z27.d(this.f40804a[i]);
            }
            return iD;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iE;
            if (!(obj instanceof Double) || (iE = z27.e(this.f40804a, ((Double) obj).doubleValue(), this.f40805b, this.c)) < 0) {
                return -1;
            }
            return iE - this.f40805b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iG;
            if (!(obj instanceof Double) || (iG = z27.g(this.f40804a, ((Double) obj).doubleValue(), this.f40805b, this.c)) < 0) {
                return -1;
            }
            return iG - this.f40805b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c - this.f40805b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i, int i2) {
            c6i.s(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            double[] dArr = this.f40804a;
            int i3 = this.f40805b;
            return new a(dArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.f40804a[this.f40805b]);
            int i = this.f40805b;
            while (true) {
                i++;
                if (i >= this.c) {
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f40804a[i]);
            }
        }
    }

    public static Pattern c() {
        String strConcat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder sb = new StringBuilder("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)".length() + 25);
        sb.append("0[xX]");
        sb.append("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)");
        sb.append("[pP][+-]?\\d+#[fFdD]?");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strConcat).length() + 23 + String.valueOf(string).length());
        sb2.append("[+-]?(?:NaN|Infinity|");
        sb2.append(strConcat);
        sb2.append("|");
        sb2.append(string);
        sb2.append(")");
        return Pattern.compile(sb2.toString().replace(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, Marker.ANY_NON_NULL_MARKER));
    }

    public static int d(double d) {
        return Double.valueOf(d).hashCode();
    }

    public static int e(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean f(double d) {
        return Double.NEGATIVE_INFINITY < d && d < Double.POSITIVE_INFINITY;
    }

    public static int g(double[] dArr, double d, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (dArr[i3] == d) {
                return i3;
            }
        }
        return -1;
    }

    public static double[] h(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((Number) c6i.o(array[i])).doubleValue();
        }
        return dArr;
    }
}
