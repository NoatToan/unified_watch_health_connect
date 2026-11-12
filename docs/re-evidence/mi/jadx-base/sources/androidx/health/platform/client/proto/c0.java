package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.c0.b;
import defpackage.zrf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c0<T extends b<T>> {
    public static final c0 d = new c0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1<T, Object> f2475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2476b;
    public boolean c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2478b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2478b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2478b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2478b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2478b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2478b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2478b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2478b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2478b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2478b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2478b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2478b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2478b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2478b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2478b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2478b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2478b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2478b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2478b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f2477a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2477a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f2477a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f2477a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f2477a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f2477a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f2477a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f2477a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f2477a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
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

        o0.a t(o0.a aVar, o0 o0Var);
    }

    public c0() {
        this.f2475a = y1.w(16);
    }

    public static void A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.x0(i, (o0) obj);
        } else {
            codedOutputStream.T0(i, m(fieldType, false));
            B(codedOutputStream, fieldType, obj);
        }
    }

    public static void B(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f2478b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.o0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.w0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.E0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.X0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.C0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.u0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.s0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.i0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.z0((o0) obj);
                break;
            case 10:
                codedOutputStream.G0((o0) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.S0((String) obj);
                } else {
                    codedOutputStream.m0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.j0((byte[]) obj);
                } else {
                    codedOutputStream.m0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.V0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.K0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.M0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.O0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.Q0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof f0.c)) {
                    codedOutputStream.q0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.q0(((f0.c) obj).getNumber());
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
        int iU = CodedOutputStream.U(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iU *= 2;
        }
        return iU + e(fieldType, obj);
    }

    public static int e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f2478b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.x(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.u((o0) obj);
            case 10:
                return obj instanceof g0 ? CodedOutputStream.C((g0) obj) : CodedOutputStream.H((o0) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.T((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.g((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                return obj instanceof f0.c ? CodedOutputStream.m(((f0.c) obj).getNumber()) : CodedOutputStream.m(((Integer) obj).intValue());
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
        List list = (List) obj;
        int iD = 0;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iD += d(liteType, number, it.next());
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iD += e(liteType, it2.next());
        }
        return CodedOutputStream.U(number) + iD + CodedOutputStream.W(iD);
    }

    public static <T extends b<T>> c0<T> h() {
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
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return r(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!r(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(Object obj) {
        if (obj instanceof zrf) {
            return ((zrf) obj).isInitialized();
        }
        if (obj instanceof g0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean s(WireFormat.FieldType fieldType, Object obj) {
        f0.a(obj);
        switch (a.f2477a[fieldType.getJavaType().ordinal()]) {
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
                return (obj instanceof Integer) || (obj instanceof f0.c);
            case 9:
                return (obj instanceof o0) || (obj instanceof g0);
            default:
                return false;
        }
    }

    public static <T extends b<T>> c0<T> x() {
        return new c0<>();
    }

    public void a(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z(t, obj);
        Object objI = i(t);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f2475a.put(t, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0<T> clone() {
        c0<T> c0VarX = x();
        for (int i = 0; i < this.f2475a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f2475a.n(i);
            c0VarX.y((b) entryN.getKey(), entryN.getValue());
        }
        Iterator it = this.f2475a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0VarX.y((b) entry.getKey(), entry.getValue());
        }
        c0VarX.c = this.c;
        return c0VarX;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f2475a.equals(((c0) obj).f2475a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> g() {
        return this.c ? new g0.c(this.f2475a.l().iterator()) : this.f2475a.l().iterator();
    }

    public int hashCode() {
        return this.f2475a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.f2475a.get(t);
        return obj instanceof g0 ? ((g0) obj).f() : obj;
    }

    public int j() {
        int iK = 0;
        for (int i = 0; i < this.f2475a.o(); i++) {
            iK += k(this.f2475a.n(i));
        }
        Iterator it = this.f2475a.q().iterator();
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
        return value instanceof g0 ? CodedOutputStream.A(entry.getKey().getNumber(), (g0) value) : CodedOutputStream.E(entry.getKey().getNumber(), (o0) value);
    }

    public int l() {
        int iF = 0;
        for (int i = 0; i < this.f2475a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f2475a.n(i);
            iF += f((b) entryN.getKey(), entryN.getValue());
        }
        Iterator it = this.f2475a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean n() {
        return this.f2475a.isEmpty();
    }

    public boolean o() {
        return this.f2476b;
    }

    public boolean p() {
        for (int i = 0; i < this.f2475a.o(); i++) {
            if (!q(this.f2475a.n(i))) {
                return false;
            }
        }
        Iterator it = this.f2475a.q().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        return this.c ? new g0.c(this.f2475a.entrySet().iterator()) : this.f2475a.entrySet().iterator();
    }

    public void u() {
        if (this.f2476b) {
            return;
        }
        for (int i = 0; i < this.f2475a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f2475a.n(i);
            if (entryN.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryN.getValue()).B();
            }
        }
        this.f2475a.v();
        this.f2476b = true;
    }

    public void v(c0<T> c0Var) {
        for (int i = 0; i < c0Var.f2475a.o(); i++) {
            w(c0Var.f2475a.n(i));
        }
        Iterator it = c0Var.f2475a.q().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    public final void w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof g0) {
            value = ((g0) value).f();
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
            this.f2475a.put(key, objI);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.f2475a.put(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f2475a.put(key, c(value));
        } else {
            this.f2475a.put(key, key.t(((o0) objI2).toBuilder(), (o0) value).build());
        }
    }

    public void y(T t, Object obj) {
        if (!t.isRepeated()) {
            z(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z(t, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof g0) {
            this.c = true;
        }
        this.f2475a.put(t, obj);
    }

    public final void z(T t, Object obj) {
        if (!s(t.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public c0(boolean z) {
        this(y1.w(0));
        u();
    }

    public c0(y1<T, Object> y1Var) {
        this.f2475a = y1Var;
        u();
    }
}
