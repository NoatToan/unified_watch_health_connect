package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p<T extends b<T>> {
    public static final p d = new p(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0<T, Object> f2245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2246b;
    public boolean c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2248b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2248b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2248b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2248b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2248b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2248b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2248b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2248b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2248b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2248b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2248b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2248b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2248b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2248b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2248b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2248b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2248b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2248b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2248b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f2247a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2247a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f2247a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f2247a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f2247a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f2247a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f2247a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f2247a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f2247a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        b0.a j(b0.a aVar, b0 b0Var);
    }

    public p() {
        this.f2245a = m0.w(16);
    }

    public static void A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f2248b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.s0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.A0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.I0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.b1(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.G0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.y0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.w0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.D0((b0) obj);
                break;
            case 10:
                codedOutputStream.K0((b0) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.W0((String) obj);
                } else {
                    codedOutputStream.q0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.n0((byte[]) obj);
                } else {
                    codedOutputStream.q0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.Z0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.O0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.Q0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.S0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.U0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof s.c)) {
                    codedOutputStream.u0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.u0(((s.c) obj).getNumber());
                }
                break;
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(WireFormat.FieldType fieldType, int i, Object obj) {
        int iW = CodedOutputStream.W(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iW *= 2;
        }
        return iW + e(fieldType, obj);
    }

    public static int e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f2248b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.a0(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.x(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.u((b0) obj);
            case 10:
                return obj instanceof t ? CodedOutputStream.C((t) obj) : CodedOutputStream.H((b0) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.V((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.g((byte[]) obj);
            case 13:
                return CodedOutputStream.Y(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.N(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.P(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.R(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.T(((Long) obj).longValue());
            case 18:
                return obj instanceof s.c ? CodedOutputStream.m(((s.c) obj).getNumber()) : CodedOutputStream.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        WireFormat.FieldType liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return d(liteType, number, obj);
        }
        int iD = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(liteType, it.next());
            }
            return CodedOutputStream.W(number) + iD + CodedOutputStream.L(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(liteType, number, it2.next());
        }
        return iD;
    }

    public static <T extends b<T>> p<T> h() {
        return d;
    }

    public static int m(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((b0) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof b0)) {
                    if (value instanceof t) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((b0) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean r(WireFormat.FieldType fieldType, Object obj) {
        s.a(obj);
        switch (a.f2247a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof s.c);
            case 9:
                return (obj instanceof b0) || (obj instanceof t);
            default:
                return false;
        }
    }

    public static <T extends b<T>> p<T> w() {
        return new p<>();
    }

    public static void z(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.B0(i, (b0) obj);
        } else {
            codedOutputStream.X0(i, m(fieldType, false));
            A(codedOutputStream, fieldType, obj);
        }
    }

    public void a(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t.getLiteType(), obj);
        Object objI = i(t);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f2245a.put(t, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p<T> clone() {
        p<T> pVarW = w();
        for (int i = 0; i < this.f2245a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f2245a.n(i);
            pVarW.x((b) entryN.getKey(), entryN.getValue());
        }
        Iterator it = this.f2245a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            pVarW.x((b) entry.getKey(), entry.getValue());
        }
        pVarW.c = this.c;
        return pVarW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f2245a.equals(((p) obj).f2245a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> g() {
        return this.c ? new t.c(this.f2245a.l().iterator()) : this.f2245a.l().iterator();
    }

    public int hashCode() {
        return this.f2245a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.f2245a.get(t);
        return obj instanceof t ? ((t) obj).f() : obj;
    }

    public int j() {
        int iK = 0;
        for (int i = 0; i < this.f2245a.o(); i++) {
            iK += k(this.f2245a.n(i));
        }
        Iterator it = this.f2245a.q().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return f(key, value);
        }
        return value instanceof t ? CodedOutputStream.A(entry.getKey().getNumber(), (t) value) : CodedOutputStream.E(entry.getKey().getNumber(), (b0) value);
    }

    public int l() {
        int iF = 0;
        for (int i = 0; i < this.f2245a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f2245a.n(i);
            iF += f((b) entryN.getKey(), entryN.getValue());
        }
        Iterator it = this.f2245a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean n() {
        return this.f2245a.isEmpty();
    }

    public boolean o() {
        return this.f2246b;
    }

    public boolean p() {
        for (int i = 0; i < this.f2245a.o(); i++) {
            if (!q(this.f2245a.n(i))) {
                return false;
            }
        }
        Iterator it = this.f2245a.q().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.c ? new t.c(this.f2245a.entrySet().iterator()) : this.f2245a.entrySet().iterator();
    }

    public void t() {
        if (this.f2246b) {
            return;
        }
        this.f2245a.v();
        this.f2246b = true;
    }

    public void u(p<T> pVar) {
        for (int i = 0; i < pVar.f2245a.o(); i++) {
            v(pVar.f2245a.n(i));
        }
        Iterator it = pVar.f2245a.q().iterator();
        while (it.hasNext()) {
            v((Map.Entry) it.next());
        }
    }

    public final void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof t) {
            value = ((t) value).f();
        }
        if (key.isRepeated()) {
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f2245a.put(key, objI);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.f2245a.put(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f2245a.put(key, c(value));
        } else {
            this.f2245a.put(key, key.j(((b0) objI2).toBuilder(), (b0) value).build());
        }
    }

    public void x(T t, Object obj) {
        if (!t.isRepeated()) {
            y(t.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y(t.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof t) {
            this.c = true;
        }
        this.f2245a.put(t, obj);
    }

    public final void y(WireFormat.FieldType fieldType, Object obj) {
        if (!r(fieldType, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public p(boolean z) {
        this(m0.w(0));
        t();
    }

    public p(m0<T, Object> m0Var) {
        this.f2245a = m0Var;
        t();
    }
}
