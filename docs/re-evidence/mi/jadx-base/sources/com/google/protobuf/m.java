package com.google.protobuf;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.trf;
import defpackage.uah;
import defpackage.xrf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements xrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f9706a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f9707b = new HashSet(Arrays.asList("cached_size", "serialized_size", "class"));
    public static d c = new d();

    public static class a implements d0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Descriptors.FieldDescriptor f9708a;

        public a(Descriptors.FieldDescriptor fieldDescriptor) {
            this.f9708a = fieldDescriptor;
        }

        @Override // com.google.protobuf.d0.e
        public boolean isInRange(int i) {
            return this.f9708a.r().findValueByNumber(i) != null;
        }
    }

    public static class b implements d0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Descriptors.FieldDescriptor f9709a;

        public b(Descriptors.FieldDescriptor fieldDescriptor) {
            this.f9709a = fieldDescriptor;
        }

        @Override // com.google.protobuf.d0.e
        public boolean isInRange(int i) {
            return this.f9709a.r().findValueByNumber(i) != null;
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9711b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            c = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                c[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[JavaType.values().length];
            f9711b = iArr2;
            try {
                iArr2[JavaType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9711b[JavaType.BYTE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9711b[JavaType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9711b[JavaType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9711b[JavaType.ENUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9711b[JavaType.INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9711b[JavaType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9711b[JavaType.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9711b[JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr3 = new int[Descriptors.FileDescriptor.Syntax.values().length];
            f9710a = iArr3;
            try {
                iArr3[Descriptors.FileDescriptor.Syntax.PROTO2.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f9710a[Descriptors.FileDescriptor.Syntax.PROTO3.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    public static java.lang.reflect.Field e(Class<?> cls, int i) {
        return m(cls, "bitField" + i + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
    }

    public static x f(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor, e eVar, boolean z, d0.e eVar2) {
        uah uahVarA = eVar.a(cls, fieldDescriptor.n());
        FieldType fieldTypeQ = q(fieldDescriptor);
        return x.h(fieldDescriptor.getNumber(), fieldTypeQ, uahVarA, r(cls, fieldDescriptor, fieldTypeQ), z, eVar2);
    }

    public static java.lang.reflect.Field g(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return m(cls, n(fieldDescriptor));
    }

    public static trf h(Class<?> cls, Descriptors.b bVar) {
        int i = c.f9710a[bVar.a().r().ordinal()];
        if (i == 1) {
            return i(cls, bVar);
        }
        if (i == 2) {
            return j(cls, bVar);
        }
        throw new IllegalArgumentException("Unsupported syntax: " + bVar.a().r());
    }

    public static l1 i(Class<?> cls, Descriptors.b bVar) {
        List<Descriptors.FieldDescriptor> listO = bVar.o();
        l1.a aVarF = l1.f(listO.size());
        aVarF.c(o(cls));
        aVarF.f(ProtoSyntax.PROTO2);
        aVarF.e(bVar.s().getMessageSetWireFormat());
        a aVar = null;
        e eVar = new e(aVar);
        java.lang.reflect.Field fieldE = null;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < listO.size()) {
            Descriptors.FieldDescriptor fieldDescriptor = listO.get(i);
            boolean javaStringCheckUtf8 = fieldDescriptor.a().n().getJavaStringCheckUtf8();
            Descriptors.FieldDescriptor.JavaType javaTypeW = fieldDescriptor.w();
            Descriptors.FieldDescriptor.JavaType javaType = Descriptors.FieldDescriptor.JavaType.ENUM;
            d0.e aVar2 = javaTypeW == javaType ? new a(fieldDescriptor) : aVar;
            if (fieldDescriptor.n() != null) {
                aVarF.d(f(cls, fieldDescriptor, eVar, javaStringCheckUtf8, aVar2));
            } else {
                java.lang.reflect.Field fieldL = l(cls, fieldDescriptor);
                int number = fieldDescriptor.getNumber();
                FieldType fieldTypeQ = q(fieldDescriptor);
                if (fieldDescriptor.C()) {
                    Descriptors.FieldDescriptor fieldDescriptorL = fieldDescriptor.x().l(2);
                    if (fieldDescriptorL.w() == javaType) {
                        aVar2 = new b(fieldDescriptorL);
                    }
                    aVarF.d(x.e(fieldL, number, f1.C(cls, fieldDescriptor.c()), aVar2));
                } else if (!fieldDescriptor.isRepeated()) {
                    if (fieldE == null) {
                        fieldE = e(cls, i2);
                    }
                    if (fieldDescriptor.F()) {
                        aVarF.d(x.m(fieldL, number, fieldTypeQ, fieldE, i3, javaStringCheckUtf8, aVar2));
                    } else {
                        aVarF.d(x.l(fieldL, number, fieldTypeQ, fieldE, i3, javaStringCheckUtf8, aVar2));
                    }
                } else if (aVar2 != null) {
                    if (fieldDescriptor.isPacked()) {
                        aVarF.d(x.k(fieldL, number, fieldTypeQ, aVar2, g(cls, fieldDescriptor)));
                    } else {
                        aVarF.d(x.d(fieldL, number, fieldTypeQ, aVar2));
                    }
                } else if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    aVarF.d(x.n(fieldL, number, fieldTypeQ, t(cls, fieldDescriptor)));
                } else if (fieldDescriptor.isPacked()) {
                    aVarF.d(x.i(fieldL, number, fieldTypeQ, g(cls, fieldDescriptor)));
                } else {
                    aVarF.d(x.c(fieldL, number, fieldTypeQ, javaStringCheckUtf8));
                }
                i++;
                aVar = null;
            }
            i3 <<= 1;
            if (i3 == 0) {
                i2++;
                i3 = 1;
                fieldE = null;
            }
            i++;
            aVar = null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < listO.size(); i4++) {
            Descriptors.FieldDescriptor fieldDescriptor2 = listO.get(i4);
            if (fieldDescriptor2.F() || (fieldDescriptor2.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE && v(fieldDescriptor2.x()))) {
                arrayList.add(Integer.valueOf(fieldDescriptor2.getNumber()));
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        aVarF.b(iArr);
        return aVarF.a();
    }

    public static l1 j(Class<?> cls, Descriptors.b bVar) {
        List<Descriptors.FieldDescriptor> listO = bVar.o();
        l1.a aVarF = l1.f(listO.size());
        aVarF.c(o(cls));
        aVarF.f(ProtoSyntax.PROTO3);
        e eVar = new e(null);
        for (int i = 0; i < listO.size(); i++) {
            Descriptors.FieldDescriptor fieldDescriptor = listO.get(i);
            if (fieldDescriptor.n() != null) {
                aVarF.d(f(cls, fieldDescriptor, eVar, true, null));
            } else if (fieldDescriptor.C()) {
                aVarF.d(x.e(l(cls, fieldDescriptor), fieldDescriptor.getNumber(), f1.C(cls, fieldDescriptor.c()), null));
            } else if (fieldDescriptor.isRepeated() && fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                aVarF.d(x.n(l(cls, fieldDescriptor), fieldDescriptor.getNumber(), q(fieldDescriptor), t(cls, fieldDescriptor)));
            } else if (fieldDescriptor.isPacked()) {
                aVarF.d(x.i(l(cls, fieldDescriptor), fieldDescriptor.getNumber(), q(fieldDescriptor), g(cls, fieldDescriptor)));
            } else {
                aVarF.d(x.c(l(cls, fieldDescriptor), fieldDescriptor.getNumber(), q(fieldDescriptor), true));
            }
        }
        return aVarF.a();
    }

    public static Descriptors.b k(Class<?> cls) {
        return o(cls).getDescriptorForType();
    }

    public static java.lang.reflect.Field l(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return m(cls, p(fieldDescriptor));
    }

    public static java.lang.reflect.Field m(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unable to find field " + str + " in message class " + cls.getName());
        }
    }

    public static String n(Descriptors.FieldDescriptor fieldDescriptor) {
        return w(fieldDescriptor.c()) + "MemoizedSerializedSize";
    }

    public static p0 o(Class<?> cls) {
        try {
            return (p0) cls.getDeclaredMethod("getDefaultInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e2) {
            throw new IllegalArgumentException("Unable to get default instance for message class " + cls.getName(), e2);
        }
    }

    public static String p(Descriptors.FieldDescriptor fieldDescriptor) {
        String strC = fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.x().c() : fieldDescriptor.c();
        return w(strC) + (f9707b.contains(strC) ? "__" : RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
    }

    public static FieldType q(Descriptors.FieldDescriptor fieldDescriptor) {
        switch (c.c[fieldDescriptor.z().ordinal()]) {
            case 1:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.BOOL_LIST_PACKED : FieldType.BOOL_LIST;
                }
                return FieldType.BOOL;
            case 2:
                return fieldDescriptor.isRepeated() ? FieldType.BYTES_LIST : FieldType.BYTES;
            case 3:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.DOUBLE_LIST_PACKED : FieldType.DOUBLE_LIST;
                }
                return FieldType.DOUBLE;
            case 4:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.ENUM_LIST_PACKED : FieldType.ENUM_LIST;
                }
                return FieldType.ENUM;
            case 5:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.FIXED32_LIST_PACKED : FieldType.FIXED32_LIST;
                }
                return FieldType.FIXED32;
            case 6:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.FIXED64_LIST_PACKED : FieldType.FIXED64_LIST;
                }
                return FieldType.FIXED64;
            case 7:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.FLOAT_LIST_PACKED : FieldType.FLOAT_LIST;
                }
                return FieldType.FLOAT;
            case 8:
                return fieldDescriptor.isRepeated() ? FieldType.GROUP_LIST : FieldType.GROUP;
            case 9:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.INT32_LIST_PACKED : FieldType.INT32_LIST;
                }
                return FieldType.INT32;
            case 10:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.INT64_LIST_PACKED : FieldType.INT64_LIST;
                }
                return FieldType.INT64;
            case 11:
                if (fieldDescriptor.C()) {
                    return FieldType.MAP;
                }
                return fieldDescriptor.isRepeated() ? FieldType.MESSAGE_LIST : FieldType.MESSAGE;
            case 12:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.SFIXED32_LIST_PACKED : FieldType.SFIXED32_LIST;
                }
                return FieldType.SFIXED32;
            case 13:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.SFIXED64_LIST_PACKED : FieldType.SFIXED64_LIST;
                }
                return FieldType.SFIXED64;
            case 14:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.SINT32_LIST_PACKED : FieldType.SINT32_LIST;
                }
                return FieldType.SINT32;
            case 15:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.SINT64_LIST_PACKED : FieldType.SINT64_LIST;
                }
                return FieldType.SINT64;
            case 16:
                return fieldDescriptor.isRepeated() ? FieldType.STRING_LIST : FieldType.STRING;
            case 17:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.UINT32_LIST_PACKED : FieldType.UINT32_LIST;
                }
                return FieldType.UINT32;
            case 18:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? FieldType.UINT64_LIST_PACKED : FieldType.UINT64_LIST;
                }
                return FieldType.UINT64;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + fieldDescriptor.z());
        }
    }

    public static Class<?> r(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor, FieldType fieldType) {
        switch (c.f9711b[fieldType.getJavaType().ordinal()]) {
            case 1:
                return Boolean.class;
            case 2:
                return ByteString.class;
            case 3:
                return Double.class;
            case 4:
                return Float.class;
            case 5:
            case 6:
                return Integer.class;
            case 7:
                return Long.class;
            case 8:
                return String.class;
            case 9:
                return s(cls, fieldDescriptor);
            default:
                throw new IllegalArgumentException("Invalid type for oneof: " + fieldType);
        }
    }

    public static Class<?> s(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(u(fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.x().c() : fieldDescriptor.c()), new Class[0]).getReturnType();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Class<?> t(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(u(fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.x().c() : fieldDescriptor.c()), Integer.TYPE).getReturnType();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String u(String str) {
        String strW = w(str);
        return "get" + Character.toUpperCase(strW.charAt(0)) + strW.substring(1, strW.length());
    }

    public static boolean v(Descriptors.b bVar) {
        return c.c(bVar);
    }

    public static String w(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '_') {
                z = true;
            } else if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
                z = true;
            } else if (z) {
                sb.append(Character.toUpperCase(cCharAt));
                z = false;
            } else if (i == 0) {
                sb.append(Character.toLowerCase(cCharAt));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    @Override // defpackage.xrf
    public trf a(Class<?> cls) {
        if (GeneratedMessageV3.class.isAssignableFrom(cls)) {
            return h(cls, k(cls));
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // defpackage.xrf
    public boolean b(Class<?> cls) {
        return GeneratedMessageV3.class.isAssignableFrom(cls);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Descriptors.b, Boolean> f9712a = new ConcurrentHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9713b = 0;
        public final Stack<a> c = new Stack<>();
        public final Map<Descriptors.b, a> d = new HashMap();

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Descriptors.b f9714a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f9715b;
            public int c;
            public b d = null;

            public a(Descriptors.b bVar, int i) {
                this.f9714a = bVar;
                this.f9715b = i;
                this.c = i;
            }
        }

        public final void a(b bVar) {
            boolean z;
            b bVar2;
            Iterator<Descriptors.b> it = bVar.f9716a.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Descriptors.b next = it.next();
                z = true;
                if (next.u()) {
                    break;
                }
                for (Descriptors.FieldDescriptor fieldDescriptor : next.o()) {
                    if (fieldDescriptor.F() || (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE && (bVar2 = this.d.get(fieldDescriptor.x()).d) != bVar && bVar2.f9717b)) {
                        break loop0;
                    }
                }
            }
            bVar.f9717b = z;
            Iterator<Descriptors.b> it2 = bVar.f9716a.iterator();
            while (it2.hasNext()) {
                this.f9712a.put(it2.next(), Boolean.valueOf(bVar.f9717b));
            }
        }

        public final a b(Descriptors.b bVar) {
            a aVarPop;
            int i = this.f9713b;
            this.f9713b = i + 1;
            a aVar = new a(bVar, i);
            this.c.push(aVar);
            this.d.put(bVar, aVar);
            for (Descriptors.FieldDescriptor fieldDescriptor : bVar.o()) {
                if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    a aVar2 = this.d.get(fieldDescriptor.x());
                    if (aVar2 == null) {
                        aVar.c = Math.min(aVar.c, b(fieldDescriptor.x()).c);
                    } else if (aVar2.d == null) {
                        aVar.c = Math.min(aVar.c, aVar2.c);
                    }
                }
            }
            if (aVar.f9715b == aVar.c) {
                b bVar2 = new b(null);
                do {
                    aVarPop = this.c.pop();
                    aVarPop.d = bVar2;
                    bVar2.f9716a.add(aVarPop.f9714a);
                } while (aVarPop != aVar);
                a(bVar2);
            }
            return aVar;
        }

        public boolean c(Descriptors.b bVar) {
            Boolean bool = this.f9712a.get(bVar);
            if (bool != null) {
                return bool.booleanValue();
            }
            synchronized (this) {
                try {
                    Boolean bool2 = this.f9712a.get(bVar);
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return b(bVar).d.f9717b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<Descriptors.b> f9716a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f9717b;

            public b() {
                this.f9716a = new ArrayList();
                this.f9717b = false;
            }

            public /* synthetic */ b(a aVar) {
                this();
            }
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public uah[] f9718a;

        public e() {
            this.f9718a = new uah[2];
        }

        public static uah b(Class<?> cls, Descriptors.h hVar) {
            String strW = m.w(hVar.c());
            return new uah(hVar.p(), m.m(cls, strW + "Case_"), m.m(cls, strW + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR));
        }

        public uah a(Class<?> cls, Descriptors.h hVar) {
            int iP = hVar.p();
            uah[] uahVarArr = this.f9718a;
            if (iP >= uahVarArr.length) {
                this.f9718a = (uah[]) Arrays.copyOf(uahVarArr, iP * 2);
            }
            uah uahVar = this.f9718a[iP];
            if (uahVar != null) {
                return uahVar;
            }
            uah uahVarB = b(cls, hVar);
            this.f9718a[iP] = uahVarB;
            return uahVarB;
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
