package androidx.work;

import am.j;
import c22.t;
import e23.l;
import j20.x;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p13.m;
import u1.y1;
import ue.h;
import ue.u;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/work/c;", "", "other", "<init>", "(Landroidx/work/c;)V", "", "", "values", "(Ljava/util/Map;)V", "a", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11464b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f11465c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11466a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/c$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f11467a = new LinkedHashMap();

        public final c a() {
            c cVar = new c(this.f11467a);
            c.f11464b.getClass();
            b.c(cVar);
            return cVar;
        }

        public final void b(Object obj, String str) {
            Object[] objArr;
            str.getClass();
            if (obj == null) {
                obj = null;
            } else {
                Class<?> cls = obj.getClass();
                t0 t0Var = s0.f105811a;
                k23.d dVarB = t0Var.b(cls);
                if (!dVarB.equals(t0Var.b(Boolean.TYPE)) && !dVarB.equals(t0Var.b(Byte.TYPE)) && !dVarB.equals(t0Var.b(Integer.TYPE)) && !dVarB.equals(t0Var.b(Long.TYPE)) && !dVarB.equals(t0Var.b(Float.TYPE)) && !dVarB.equals(t0Var.b(Double.TYPE)) && !dVarB.equals(t0Var.b(String.class)) && !dVarB.equals(t0Var.b(Boolean[].class)) && !dVarB.equals(t0Var.b(Byte[].class)) && !dVarB.equals(t0Var.b(Integer[].class)) && !dVarB.equals(t0Var.b(Long[].class)) && !dVarB.equals(t0Var.b(Float[].class)) && !dVarB.equals(t0Var.b(Double[].class)) && !dVarB.equals(t0Var.b(String[].class))) {
                    int i14 = 0;
                    if (dVarB.equals(t0Var.b(boolean[].class))) {
                        boolean[] zArr = (boolean[]) obj;
                        int i15 = h.f170065a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i14 < length) {
                            objArr[i14] = Boolean.valueOf(zArr[i14]);
                            i14++;
                        }
                    } else if (dVarB.equals(t0Var.b(byte[].class))) {
                        byte[] bArr = (byte[]) obj;
                        int i16 = h.f170065a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i14 < length2) {
                            objArr[i14] = Byte.valueOf(bArr[i14]);
                            i14++;
                        }
                    } else if (dVarB.equals(t0Var.b(int[].class))) {
                        int[] iArr = (int[]) obj;
                        int i17 = h.f170065a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i14 < length3) {
                            objArr[i14] = Integer.valueOf(iArr[i14]);
                            i14++;
                        }
                    } else if (dVarB.equals(t0Var.b(long[].class))) {
                        long[] jArr = (long[]) obj;
                        int i18 = h.f170065a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i14 < length4) {
                            objArr[i14] = Long.valueOf(jArr[i14]);
                            i14++;
                        }
                    } else if (dVarB.equals(t0Var.b(float[].class))) {
                        float[] fArr = (float[]) obj;
                        int i19 = h.f170065a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i14 < length5) {
                            objArr[i14] = Float.valueOf(fArr[i14]);
                            i14++;
                        }
                    } else {
                        if (!dVarB.equals(t0Var.b(double[].class))) {
                            t.i("Key ", str, " has invalid type ", dVarB);
                            return;
                        }
                        double[] dArr = (double[]) obj;
                        int i24 = h.f170065a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i14 < length6) {
                            objArr[i14] = Double.valueOf(dArr[i14]);
                            i14++;
                        }
                    }
                    obj = objArr;
                }
            }
            this.f11467a.put(str, obj);
        }

        public final void c(Map map) {
            map.getClass();
            for (Map.Entry entry : map.entrySet()) {
                b(entry.getValue(), (String) entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0164c implements l<Integer, Byte> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f11468a;

        public C0164c(Object obj) {
            this.f11468a = obj;
        }

        @Override // e23.l
        public final Byte invoke(Integer num) {
            Object obj = ((Object[]) this.f11468a)[num.intValue()];
            if (obj != null) {
                return (Byte) obj;
            }
            x.l("null cannot be cast to non-null type kotlin.Byte");
            return null;
        }
    }

    public c(c cVar) {
        cVar.getClass();
        this.f11466a = new HashMap(cVar.f11466a);
    }

    public final boolean a(String str, boolean z14) {
        Object objValueOf = Boolean.valueOf(z14);
        Object obj = this.f11466a.get(str);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final byte[] b(String str) {
        Object obj = this.f11466a.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        C0164c c0164c = new C0164c(obj);
        byte[] bArr = new byte[length];
        for (int i14 = 0; i14 < length; i14++) {
            bArr[i14] = ((Number) c0164c.invoke(Integer.valueOf(i14))).byteValue();
        }
        return bArr;
    }

    public final int c(String str, int i14) {
        Object objValueOf = Integer.valueOf(i14);
        Object obj = this.f11466a.get(str);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final long d(String str, long j8) {
        Object objValueOf = Long.valueOf(j8);
        Object obj = this.f11466a.get(str);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    public final String e(String str) {
        Object obj = this.f11466a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && c.class.equals(obj.getClass())) {
                HashMap map = ((c) obj).f11466a;
                HashMap map2 = this.f11466a;
                Set<String> setKeySet = map2.keySet();
                if (s.g(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = m.b(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(String str) {
        Object obj = this.f11466a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f11466a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return j.o(h0.k0(this.f11466a.entrySet(), null, null, null, new y1(11), 31), StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("Data {"));
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Landroidx/work/c$b;", "", "<init>", "()V", "Landroidx/work/c;", "EMPTY", "Landroidx/work/c;", "", "MAX_DATA_BYTES", "I", "", "TYPE_NULL", "B", "TYPE_BOOLEAN", "TYPE_BYTE", "TYPE_INTEGER", "TYPE_LONG", "TYPE_FLOAT", "TYPE_DOUBLE", "TYPE_STRING", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE_ARRAY", "TYPE_INTEGER_ARRAY", "TYPE_LONG_ARRAY", "TYPE_FLOAT_ARRAY", "TYPE_DOUBLE_ARRAY", "TYPE_STRING_ARRAY", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", "S", "STREAM_VERSION", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(byte[] bArr) {
            bArr.getClass();
            if (bArr.length > 10240) {
                vb.h.z("Data cannot occupy more than 10240 bytes when serialized");
                return null;
            }
            if (bArr.length == 0) {
                return c.f11465c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[2];
                byteArrayInputStream.read(bArr2);
                int i14 = 0;
                boolean z14 = bArr2[0] == ((byte) 16777132) && bArr2[1] == ((byte) (-21267));
                byteArrayInputStream.reset();
                if (z14) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i15 = objectInputStream.readInt();
                        while (i14 < i15) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i14++;
                        }
                        objectInputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(objectInputStream, th3);
                            throw th4;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short s8 = dataInputStream.readShort();
                        if (s8 == -21521) {
                            short s14 = dataInputStream.readShort();
                            if (s14 != 1) {
                                e0.n(j.h(s14, "Unsupported version number: "));
                            }
                        } else {
                            e0.n(j.h(s8, "Magic number doesn't match: "));
                        }
                        int i16 = dataInputStream.readInt();
                        while (i14 < i16) {
                            linkedHashMap.put(dataInputStream.readUTF(), b(dataInputStream, dataInputStream.readByte()));
                            i14++;
                        }
                        dataInputStream.close();
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            jg.b.l(dataInputStream, th5);
                            throw th6;
                        }
                    }
                }
            } catch (IOException unused) {
                int i17 = h.f170065a;
                u.a().getClass();
            } catch (ClassNotFoundException unused2) {
                int i18 = h.f170065a;
                u.a().getClass();
            }
            return new c(linkedHashMap);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
        public static final Serializable b(DataInputStream dataInputStream, byte b14) throws IOException {
            if (b14 == 0) {
                return null;
            }
            if (b14 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b14 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b14 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b14 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b14 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b14 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b14 == 7) {
                return dataInputStream.readUTF();
            }
            int i14 = 0;
            if (b14 == 8) {
                int i15 = dataInputStream.readInt();
                ?? r14 = new Boolean[i15];
                while (i14 < i15) {
                    r14[i14] = Boolean.valueOf(dataInputStream.readBoolean());
                    i14++;
                }
                return r14;
            }
            if (b14 == 9) {
                int i16 = dataInputStream.readInt();
                ?? r15 = new Byte[i16];
                while (i14 < i16) {
                    r15[i14] = Byte.valueOf(dataInputStream.readByte());
                    i14++;
                }
                return r15;
            }
            if (b14 == 10) {
                int i17 = dataInputStream.readInt();
                ?? r16 = new Integer[i17];
                while (i14 < i17) {
                    r16[i14] = Integer.valueOf(dataInputStream.readInt());
                    i14++;
                }
                return r16;
            }
            if (b14 == 11) {
                int i18 = dataInputStream.readInt();
                ?? r17 = new Long[i18];
                while (i14 < i18) {
                    r17[i14] = Long.valueOf(dataInputStream.readLong());
                    i14++;
                }
                return r17;
            }
            if (b14 == 12) {
                int i19 = dataInputStream.readInt();
                ?? r18 = new Float[i19];
                while (i14 < i19) {
                    r18[i14] = Float.valueOf(dataInputStream.readFloat());
                    i14++;
                }
                return r18;
            }
            if (b14 == 13) {
                int i24 = dataInputStream.readInt();
                ?? r19 = new Double[i24];
                while (i14 < i24) {
                    r19[i14] = Double.valueOf(dataInputStream.readDouble());
                    i14++;
                }
                return r19;
            }
            if (b14 != 14) {
                vb.h.z(j.h(b14, "Unsupported type "));
                return null;
            }
            int i25 = dataInputStream.readInt();
            ?? r24 = new String[i25];
            while (i14 < i25) {
                String utf = dataInputStream.readUTF();
                if (s.g(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                r24[i14] = utf;
                i14++;
            }
            return r24;
        }

        public static byte[] c(c cVar) {
            cVar.getClass();
            HashMap map = cVar.f11466a;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(-21521);
                    dataOutputStream.writeShort(1);
                    dataOutputStream.writeInt(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        d(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    byteArray.getClass();
                    return byteArray;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(dataOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (IOException unused) {
                int i14 = h.f170065a;
                u.a().getClass();
                return new byte[0];
            }
        }

        public static final void d(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            int i14;
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    n23.j.A(s0.f105811a.b(obj.getClass()).D(), "Unsupported value type ");
                    return;
                }
                Object[] objArr = (Object[]) obj;
                Class<?> cls = objArr.getClass();
                t0 t0Var = s0.f105811a;
                k23.d dVarB = t0Var.b(cls);
                if (dVarB.equals(t0Var.b(Boolean[].class))) {
                    i14 = 8;
                } else if (dVarB.equals(t0Var.b(Byte[].class))) {
                    i14 = 9;
                } else if (dVarB.equals(t0Var.b(Integer[].class))) {
                    i14 = 10;
                } else if (dVarB.equals(t0Var.b(Long[].class))) {
                    i14 = 11;
                } else if (dVarB.equals(t0Var.b(Float[].class))) {
                    i14 = 12;
                } else if (dVarB.equals(t0Var.b(Double[].class))) {
                    i14 = 13;
                } else {
                    if (!dVarB.equals(t0Var.b(String[].class))) {
                        n23.j.A(t0Var.b(objArr.getClass()).w(), "Unsupported value type ");
                        return;
                    }
                    i14 = 14;
                }
                dataOutputStream.writeByte(i14);
                dataOutputStream.writeInt(objArr.length);
                for (Object obj2 : objArr) {
                    if (i14 == 8) {
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                    } else if (i14 == 9) {
                        Byte b14 = obj2 instanceof Byte ? (Byte) obj2 : null;
                        dataOutputStream.writeByte(b14 != null ? b14.byteValue() : (byte) 0);
                    } else if (i14 == 10) {
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                    } else if (i14 == 11) {
                        Long l14 = obj2 instanceof Long ? (Long) obj2 : null;
                        dataOutputStream.writeLong(l14 != null ? l14.longValue() : 0L);
                    } else if (i14 == 12) {
                        Float f14 = obj2 instanceof Float ? (Float) obj2 : null;
                        dataOutputStream.writeFloat(f14 != null ? f14.floatValue() : 0.0f);
                    } else if (i14 == 13) {
                        Double d14 = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d14 != null ? d14.doubleValue() : 0.0d);
                    } else if (i14 == 14) {
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                }
            }
            dataOutputStream.writeUTF(str);
        }

        private b() {
        }
    }

    public c(Map<String, ?> map) {
        map.getClass();
        this.f11466a = new HashMap(map);
    }
}
