package com.google.protobuf;

import com.google.protobuf.a0.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a0<T extends c<T>> {
    public static final a0 d = new a0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1<T, Object> f9598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9599b;
    public boolean c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9601b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9601b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9601b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9601b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9601b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9601b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9601b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9601b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9601b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9601b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9601b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9601b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9601b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9601b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9601b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9601b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9601b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9601b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9601b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f9600a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9600a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9600a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9600a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9600a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9600a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9600a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9600a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9600a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static final class b<T extends c<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i1<T, Object> f9602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9603b;
        public boolean c;
        public boolean d;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public static Object l(Object obj) {
            return obj instanceof q0.a ? ((q0.a) obj).build() : obj;
        }

        public static <T extends c<T>> Object m(T t, Object obj) {
            if (obj == null || t.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (!t.isRepeated()) {
                return l(obj);
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj2 = arrayList.get(i);
                Object objL = l(obj2);
                if (objL != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i, objL);
                }
            }
            return arrayList;
        }

        public static <T extends c<T>> void n(i1<T, Object> i1Var) {
            for (int i = 0; i < i1Var.o(); i++) {
                o(i1Var.n(i));
            }
            Iterator it = i1Var.q().iterator();
            while (it.hasNext()) {
                o((Map.Entry) it.next());
            }
        }

        public static <T extends c<T>> void o(Map.Entry<T, Object> entry) {
            entry.setValue(m(entry.getKey(), entry.getValue()));
        }

        public void a(T t, Object obj) {
            List arrayList;
            d();
            if (!t.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.d = this.d || (obj instanceof q0.a);
            r(t, obj);
            Object objF = f(t);
            if (objF == null) {
                arrayList = new ArrayList();
                this.f9602a.put(t, arrayList);
            } else {
                arrayList = (List) objF;
            }
            arrayList.add(obj);
        }

        public a0<T> b() {
            if (this.f9602a.isEmpty()) {
                return a0.q();
            }
            this.c = false;
            i1<T, Object> i1VarJ = this.f9602a;
            if (this.d) {
                i1VarJ = a0.j(i1VarJ, false);
                n(i1VarJ);
            }
            a0<T> a0Var = new a0<>(i1VarJ, null);
            a0Var.c = this.f9603b;
            return a0Var;
        }

        public void c(T t) {
            d();
            this.f9602a.remove(t);
            if (this.f9602a.isEmpty()) {
                this.f9603b = false;
            }
        }

        public final void d() {
            if (this.c) {
                return;
            }
            this.f9602a = a0.j(this.f9602a, true);
            this.c = true;
        }

        public Map<T, Object> e() {
            if (!this.f9603b) {
                return this.f9602a.t() ? this.f9602a : Collections.unmodifiableMap(this.f9602a);
            }
            i1 i1VarJ = a0.j(this.f9602a, false);
            if (this.f9602a.t()) {
                i1VarJ.v();
            } else {
                n(i1VarJ);
            }
            return i1VarJ;
        }

        public Object f(T t) {
            return m(t, g(t));
        }

        public Object g(T t) {
            Object obj = this.f9602a.get(t);
            return obj instanceof e0 ? ((e0) obj).g() : obj;
        }

        public Object h(T t, int i) {
            if (!t.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objG = g(t);
            if (objG != null) {
                return ((List) objG).get(i);
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean i(T t) {
            if (t.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f9602a.get(t) != null;
        }

        public void j(a0<T> a0Var) {
            d();
            for (int i = 0; i < a0Var.f9598a.o(); i++) {
                k(a0Var.f9598a.n(i));
            }
            Iterator it = a0Var.f9598a.q().iterator();
            while (it.hasNext()) {
                k((Map.Entry) it.next());
            }
        }

        public final void k(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof e0) {
                value = ((e0) value).g();
            }
            if (key.isRepeated()) {
                Object objF = f(key);
                if (objF == null) {
                    objF = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) objF).add(a0.l(it.next()));
                }
                this.f9602a.put(key, objF);
                return;
            }
            if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                this.f9602a.put(key, a0.l(value));
                return;
            }
            Object objF2 = f(key);
            if (objF2 == null) {
                this.f9602a.put(key, a0.l(value));
            } else if (objF2 instanceof q0.a) {
                key.f((q0.a) objF2, (q0) value);
            } else {
                this.f9602a.put(key, key.f(((q0) objF2).toBuilder(), (q0) value).build());
            }
        }

        public void p(T t, Object obj) {
            d();
            if (!t.isRepeated()) {
                r(t, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    r(t, obj2);
                    this.d = this.d || (obj2 instanceof q0.a);
                }
                obj = arrayList;
            }
            if (obj instanceof e0) {
                this.f9603b = true;
            }
            this.d = this.d || (obj instanceof q0.a);
            this.f9602a.put(t, obj);
        }

        public void q(T t, int i, Object obj) {
            d();
            if (!t.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.d = this.d || (obj instanceof q0.a);
            Object objF = f(t);
            if (objF == null) {
                throw new IndexOutOfBoundsException();
            }
            r(t, obj);
            ((List) objF).set(i, obj);
        }

        public final void r(T t, Object obj) {
            if (a0.E(t.getLiteType(), obj)) {
                return;
            }
            if (t.getLiteType().getJavaType() != WireFormat.JavaType.MESSAGE || !(obj instanceof q0.a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }

        public b() {
            this(i1.w(16));
        }

        public b(i1<T, Object> i1Var) {
            this.f9602a = i1Var;
            this.c = true;
        }
    }

    public interface c<T extends c<T>> extends Comparable<T> {
        q0.a f(q0.a aVar, q0 q0Var);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public /* synthetic */ a0(i1 i1Var, a aVar) {
        this(i1Var);
    }

    public static <T extends c<T>> boolean D(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((q0) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof q0)) {
                    if (value instanceof e0) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((q0) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean E(WireFormat.FieldType fieldType, Object obj) {
        d0.a(obj);
        switch (a.f9600a[fieldType.getJavaType().ordinal()]) {
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
                return (obj instanceof Integer) || (obj instanceof d0.c);
            case 9:
                return (obj instanceof q0) || (obj instanceof e0);
            default:
                return false;
        }
    }

    public static <T extends c<T>> b<T> J() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> a0<T> K() {
        return new a0<>();
    }

    public static Object L(j jVar, WireFormat.FieldType fieldType, boolean z) throws IOException {
        return z ? WireFormat.d(jVar, fieldType, WireFormat.b.f9597b) : WireFormat.d(jVar, fieldType, WireFormat.b.f9596a);
    }

    public static void O(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.C0(i, (q0) obj);
        } else {
            codedOutputStream.a1(i, y(fieldType, false));
            P(codedOutputStream, fieldType, obj);
        }
    }

    public static void P(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f9601b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.t0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.B0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.J0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.e1(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.H0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.z0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.x0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.n0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.E0((q0) obj);
                break;
            case 10:
                codedOutputStream.M0((q0) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.Z0((String) obj);
                } else {
                    codedOutputStream.r0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.o0((byte[]) obj);
                } else {
                    codedOutputStream.r0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.c1(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.R0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.T0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.V0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.X0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof d0.c)) {
                    codedOutputStream.v0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.v0(((d0.c) obj).getNumber());
                }
                break;
        }
    }

    public static void Q(c<?> cVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            if (obj instanceof e0) {
                O(codedOutputStream, liteType, number, ((e0) obj).g());
                return;
            } else {
                O(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                O(codedOutputStream, liteType, number, it.next());
            }
            return;
        }
        codedOutputStream.a1(number, 2);
        Iterator it2 = list.iterator();
        int iN = 0;
        while (it2.hasNext()) {
            iN += n(liteType, it2.next());
        }
        codedOutputStream.P0(iN);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            P(codedOutputStream, liteType, it3.next());
        }
    }

    public static <T extends c<T>> i1<T, Object> j(i1<T, Object> i1Var, boolean z) {
        i1<T, Object> i1VarW = i1.w(16);
        for (int i = 0; i < i1Var.o(); i++) {
            k(i1VarW, i1Var.n(i), z);
        }
        Iterator it = i1Var.q().iterator();
        while (it.hasNext()) {
            k(i1VarW, (Map.Entry) it.next(), z);
        }
        return i1VarW;
    }

    public static <T extends c<T>> void k(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            map.put(key, ((e0) value).g());
        } else if (z && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    public static Object l(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int m(WireFormat.FieldType fieldType, int i, Object obj) {
        int iX = CodedOutputStream.X(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iX *= 2;
        }
        return iX + n(fieldType, obj);
    }

    public static int n(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f9601b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.A(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.b0(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.y(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.v((q0) obj);
            case 10:
                return obj instanceof e0 ? CodedOutputStream.D((e0) obj) : CodedOutputStream.I((q0) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.W((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.g((byte[]) obj);
            case 13:
                return CodedOutputStream.Z(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.O(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.Q(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.S(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.U(((Long) obj).longValue());
            case 18:
                return obj instanceof d0.c ? CodedOutputStream.m(((d0.c) obj).getNumber()) : CodedOutputStream.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int o(c<?> cVar, Object obj) {
        WireFormat.FieldType liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            return m(liteType, number, obj);
        }
        int iM = 0;
        if (cVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM += n(liteType, it.next());
            }
            return CodedOutputStream.X(number) + iM + CodedOutputStream.M(iM);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM += m(liteType, number, it2.next());
        }
        return iM;
    }

    public static <T extends c<T>> a0<T> q() {
        return d;
    }

    public static int y(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public boolean A() {
        return this.f9598a.isEmpty();
    }

    public boolean B() {
        return this.f9599b;
    }

    public boolean C() {
        for (int i = 0; i < this.f9598a.o(); i++) {
            if (!D(this.f9598a.n(i))) {
                return false;
            }
        }
        Iterator it = this.f9598a.q().iterator();
        while (it.hasNext()) {
            if (!D((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> F() {
        return this.c ? new e0.c(this.f9598a.entrySet().iterator()) : this.f9598a.entrySet().iterator();
    }

    public void G() {
        if (this.f9599b) {
            return;
        }
        this.f9598a.v();
        this.f9599b = true;
    }

    public void H(a0<T> a0Var) {
        for (int i = 0; i < a0Var.f9598a.o(); i++) {
            I(a0Var.f9598a.n(i));
        }
        Iterator it = a0Var.f9598a.q().iterator();
        while (it.hasNext()) {
            I((Map.Entry) it.next());
        }
    }

    public final void I(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).g();
        }
        if (key.isRepeated()) {
            Object objS = s(key);
            if (objS == null) {
                objS = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objS).add(l(it.next()));
            }
            this.f9598a.put(key, objS);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.f9598a.put(key, l(value));
            return;
        }
        Object objS2 = s(key);
        if (objS2 == null) {
            this.f9598a.put(key, l(value));
        } else {
            this.f9598a.put(key, key.f(((q0) objS2).toBuilder(), (q0) value).build());
        }
    }

    public void M(T t, Object obj) {
        if (!t.isRepeated()) {
            N(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                N(t, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof e0) {
            this.c = true;
        }
        this.f9598a.put(t, obj);
    }

    public final void N(T t, Object obj) {
        if (!E(t.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.getNumber()), t.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public void R(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f9598a.o(); i++) {
            S(this.f9598a.n(i), codedOutputStream);
        }
        Iterator it = this.f9598a.q().iterator();
        while (it.hasNext()) {
            S((Map.Entry) it.next(), codedOutputStream);
        }
    }

    public final void S(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            Q(key, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).g();
        }
        codedOutputStream.N0(entry.getKey().getNumber(), (q0) value);
    }

    public void T(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f9598a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f9598a.n(i);
            Q((c) entryN.getKey(), entryN.getValue(), codedOutputStream);
        }
        Iterator it = this.f9598a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Q((c) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f9598a.equals(((a0) obj).f9598a);
        }
        return false;
    }

    public void f(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        N(t, obj);
        Object objS = s(t);
        if (objS == null) {
            arrayList = new ArrayList();
            this.f9598a.put(t, arrayList);
        } else {
            arrayList = (List) objS;
        }
        arrayList.add(obj);
    }

    public void g() {
        this.f9598a.clear();
        this.c = false;
    }

    public void h(T t) {
        this.f9598a.remove(t);
        if (this.f9598a.isEmpty()) {
            this.c = false;
        }
    }

    public int hashCode() {
        return this.f9598a.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a0<T> clone() {
        a0<T> a0VarK = K();
        for (int i = 0; i < this.f9598a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f9598a.n(i);
            a0VarK.M((c) entryN.getKey(), entryN.getValue());
        }
        Iterator it = this.f9598a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a0VarK.M((c) entry.getKey(), entry.getValue());
        }
        a0VarK.c = this.c;
        return a0VarK;
    }

    public Iterator<Map.Entry<T, Object>> p() {
        return this.c ? new e0.c(this.f9598a.l().iterator()) : this.f9598a.l().iterator();
    }

    public Map<T, Object> r() {
        if (!this.c) {
            return this.f9598a.t() ? this.f9598a : Collections.unmodifiableMap(this.f9598a);
        }
        i1 i1VarJ = j(this.f9598a, false);
        if (this.f9598a.t()) {
            i1VarJ.v();
        }
        return i1VarJ;
    }

    public Object s(T t) {
        Object obj = this.f9598a.get(t);
        return obj instanceof e0 ? ((e0) obj).g() : obj;
    }

    public int t() {
        int iU = 0;
        for (int i = 0; i < this.f9598a.o(); i++) {
            iU += u(this.f9598a.n(i));
        }
        Iterator it = this.f9598a.q().iterator();
        while (it.hasNext()) {
            iU += u((Map.Entry) it.next());
        }
        return iU;
    }

    public final int u(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return o(key, value);
        }
        return value instanceof e0 ? CodedOutputStream.B(entry.getKey().getNumber(), (e0) value) : CodedOutputStream.F(entry.getKey().getNumber(), (q0) value);
    }

    public Object v(T t, int i) {
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objS = s(t);
        if (objS != null) {
            return ((List) objS).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int w(T t) {
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objS = s(t);
        if (objS == null) {
            return 0;
        }
        return ((List) objS).size();
    }

    public int x() {
        int iO = 0;
        for (int i = 0; i < this.f9598a.o(); i++) {
            Map.Entry<K, Object> entryN = this.f9598a.n(i);
            iO += o((c) entryN.getKey(), entryN.getValue());
        }
        Iterator it = this.f9598a.q().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iO += o((c) entry.getKey(), entry.getValue());
        }
        return iO;
    }

    public boolean z(T t) {
        if (t.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f9598a.get(t) != null;
    }

    public a0() {
        this.f9598a = i1.w(16);
    }

    public a0(boolean z) {
        this(i1.w(0));
        G();
    }

    public a0(i1<T, Object> i1Var) {
        this.f9598a = i1Var;
        G();
    }
}
