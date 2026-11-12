package z33;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import r1.q2;
import z33.f.b;

/* JADX INFO: loaded from: classes3.dex */
public final class f<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f202181d = new f(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f202182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f202183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f202184c = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f202186b;

        static {
            int[] iArr = new int[v.values().length];
            f202186b = iArr;
            try {
                iArr[v.f202248c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f202186b[v.f202249d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f202186b[v.f202250e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f202186b[v.f202251f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f202186b[v.f202252g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f202186b[v.f202253h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f202186b[v.f202254i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f202186b[v.f202255j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f202186b[v.f202256k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f202186b[v.f202259n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f202186b[v.f202260o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f202186b[v.f202262q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f202186b[v.f202263r.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f202186b[v.f202264t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f202186b[v.f202265v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f202186b[v.f202257l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f202186b[v.f202258m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f202186b[v.f202261p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[w.values().length];
            f202185a = iArr2;
            try {
                iArr2[w.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f202185a[w.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f202185a[w.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f202185a[w.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f202185a[w.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f202185a[w.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f202185a[w.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f202185a[w.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f202185a[w.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        g.b a2(n.a aVar, n nVar);

        w getLiteJavaType();

        v getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private f(boolean z14) {
        int i14 = s.f202229f;
        r rVar = new r(0);
        this.f202182a = rVar;
        if (this.f202183b) {
            return;
        }
        rVar.e();
        this.f202183b = true;
    }

    public static int c(v vVar, Object obj) {
        int iF;
        int size;
        switch (a.f202186b[vVar.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                return 8;
            case 2:
                ((Float) obj).getClass();
                return 4;
            case 3:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.c(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                return 8;
            case 7:
                ((Integer) obj).getClass();
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                return 1;
            case 9:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return CodedOutputStream.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e4) {
                    q2.v("UTF-8 not supported.", e4);
                    return 0;
                }
            case 10:
                if (!(obj instanceof c)) {
                    byte[] bArr = (byte[]) obj;
                    return CodedOutputStream.f(bArr.length) + bArr.length;
                }
                c cVar = (c) obj;
                iF = CodedOutputStream.f(cVar.size());
                size = cVar.size();
                break;
                break;
            case 11:
                return CodedOutputStream.f(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).getClass();
                return 4;
            case 13:
                ((Long) obj).getClass();
                return 8;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                return CodedOutputStream.f((iIntValue >> 31) ^ (iIntValue << 1));
            case 15:
                long jLongValue = ((Long) obj).longValue();
                return CodedOutputStream.g((jLongValue >> 63) ^ (jLongValue << 1));
            case 16:
                return ((n) obj).getSerializedSize();
            case 17:
                if (!(obj instanceof i)) {
                    return CodedOutputStream.e((n) obj);
                }
                iF = ((i) obj).f202208a.getSerializedSize();
                size = CodedOutputStream.f(iF);
                break;
                break;
            case 18:
                return obj instanceof h.a ? CodedOutputStream.c(((h.a) obj).getNumber()) : CodedOutputStream.c(((Integer) obj).intValue());
            default:
                kg.f.n("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return size + iF;
    }

    public static int d(b<?> bVar, Object obj) {
        int iH;
        int iC;
        v liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (bVar.isRepeated()) {
            int iC2 = 0;
            if (!bVar.isPacked()) {
                for (Object obj2 : (List) obj) {
                    int iH2 = CodedOutputStream.h(number);
                    if (liteType == v.f202257l) {
                        iH2 *= 2;
                    }
                    iC2 += c(liteType, obj2) + iH2;
                }
                return iC2;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iC2 += c(liteType, it.next());
            }
            iH = CodedOutputStream.h(number) + iC2;
            iC = CodedOutputStream.f(iC2);
        } else {
            iH = CodedOutputStream.h(number);
            if (liteType == v.f202257l) {
                iH *= 2;
            }
            iC = c(liteType, obj);
        }
        return iC + iH;
    }

    public static boolean f(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.getLiteJavaType() != w.MESSAGE) {
            return true;
        }
        if (bVar.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((n) it.next()).isInitialized()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof n) {
            return ((n) value).isInitialized();
        }
        if (value instanceof i) {
            return true;
        }
        vb.h.s("Wrong object type used with protocol message reflection.");
        return false;
    }

    public static <T extends b<T>> f<T> h() {
        return new f<>();
    }

    public static Object i(d dVar, v vVar) {
        switch (a.f202186b[vVar.ordinal()]) {
            case 1:
                return Double.valueOf(Double.longBitsToDouble(dVar.k()));
            case 2:
                return Float.valueOf(Float.intBitsToFloat(dVar.j()));
            case 3:
                return Long.valueOf(dVar.m());
            case 4:
                return Long.valueOf(dVar.m());
            case 5:
                return Integer.valueOf(dVar.l());
            case 6:
                return Long.valueOf(dVar.k());
            case 7:
                return Integer.valueOf(dVar.j());
            case 8:
                return Boolean.valueOf(dVar.m() != 0);
            case 9:
                int iL = dVar.l();
                int i14 = dVar.f202169b;
                int i15 = dVar.f202171d;
                if (iL > i14 - i15 || iL <= 0) {
                    return iL == 0 ? "" : new String(dVar.i(iL), "UTF-8");
                }
                String str = new String(dVar.f202168a, i15, iL, "UTF-8");
                dVar.f202171d += iL;
                return str;
            case 10:
                return dVar.f();
            case 11:
                return Integer.valueOf(dVar.l());
            case 12:
                return Integer.valueOf(dVar.j());
            case 13:
                return Long.valueOf(dVar.k());
            case 14:
                int iL2 = dVar.l();
                return Integer.valueOf((-(iL2 & 1)) ^ (iL2 >>> 1));
            case 15:
                long jM = dVar.m();
                return Long.valueOf((-(jM & 1)) ^ (jM >>> 1));
            case 16:
                vb.h.s("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 17:
                vb.h.s("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 18:
                vb.h.s("readPrimitiveField() cannot handle enums.");
                return null;
            default:
                kg.f.n("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    public static void k(v vVar, Object obj) {
        obj.getClass();
        boolean z14 = true;
        boolean z15 = false;
        switch (a.f202185a[vVar.f202267a.ordinal()]) {
            case 1:
                z15 = obj instanceof Integer;
                break;
            case 2:
                z15 = obj instanceof Long;
                break;
            case 3:
                z15 = obj instanceof Float;
                break;
            case 4:
                z15 = obj instanceof Double;
                break;
            case 5:
                z15 = obj instanceof Boolean;
                break;
            case 6:
                z15 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof c) && !(obj instanceof byte[])) {
                    z14 = false;
                }
                z15 = z14;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof h.a)) {
                    z14 = false;
                }
                z15 = z14;
                break;
            case 9:
                if (!(obj instanceof n) && !(obj instanceof i)) {
                    z14 = false;
                }
                z15 = z14;
                break;
        }
        if (z15) {
            return;
        }
        vb.h.s("Wrong object type used with protocol message reflection.");
    }

    public static void l(CodedOutputStream codedOutputStream, v vVar, int i14, Object obj) throws IOException {
        if (vVar != v.f202257l) {
            codedOutputStream.x(i14, vVar.f202268b);
            m(codedOutputStream, vVar, obj);
        } else {
            codedOutputStream.x(i14, 3);
            ((n) obj).a(codedOutputStream);
            codedOutputStream.x(i14, 4);
        }
    }

    public static void m(CodedOutputStream codedOutputStream, v vVar, Object obj) throws IOException {
        switch (a.f202186b[vVar.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                codedOutputStream.w(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.w(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.n(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.u(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.t(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 9:
                codedOutputStream.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                codedOutputStream.v(bytes.length);
                codedOutputStream.s(bytes);
                break;
            case 10:
                if (!(obj instanceof c)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(bArr.length);
                    codedOutputStream.s(bArr);
                } else {
                    c cVar = (c) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(cVar.size());
                    codedOutputStream.r(cVar);
                }
                break;
            case 11:
                codedOutputStream.v(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.t(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.u(((Long) obj).longValue());
                break;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 15:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 16:
                codedOutputStream.getClass();
                ((n) obj).a(codedOutputStream);
                break;
            case 17:
                codedOutputStream.p((n) obj);
                break;
            case 18:
                if (!(obj instanceof h.a)) {
                    codedOutputStream.n(((Integer) obj).intValue());
                } else {
                    codedOutputStream.n(((h.a) obj).getNumber());
                }
                break;
        }
    }

    public final void a(g.e eVar, Object obj) {
        List arrayList;
        if (!eVar.f202198d) {
            vb.h.s("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        k(eVar.f202197c, obj);
        Object objE = e(eVar);
        if (objE == null) {
            arrayList = new ArrayList();
            this.f202182a.put(eVar, arrayList);
        } else {
            arrayList = (List) objE;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f<FieldDescriptorType> clone() {
        r rVar;
        f<FieldDescriptorType> fVar = new f<>();
        int i14 = 0;
        while (true) {
            rVar = this.f202182a;
            if (i14 >= rVar.f202231b.size()) {
                break;
            }
            s<K, V>.b bVar = rVar.f202231b.get(i14);
            fVar.j((b) bVar.getKey(), bVar.getValue());
            i14++;
        }
        for (Map.Entry<Object, Object> entry : rVar.c()) {
            fVar.j((b) entry.getKey(), entry.getValue());
        }
        fVar.f202184c = this.f202184c;
        return fVar;
    }

    public final Object e(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f202182a.get(fielddescriptortype);
        return obj instanceof i ? ((i) obj).a() : obj;
    }

    public final void g(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof i) {
            value = ((i) value).a();
        }
        boolean zIsRepeated = key.isRepeated();
        r rVar = this.f202182a;
        if (zIsRepeated) {
            Object objE = e(key);
            if (objE == null) {
                objE = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objE;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            rVar.put(key, objE);
            return;
        }
        if (key.getLiteJavaType() != w.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            rVar.put(key, value);
            return;
        }
        Object objE2 = e(key);
        if (objE2 != null) {
            rVar.put(key, key.a2(((n) objE2).toBuilder(), (n) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        rVar.put(key, value);
    }

    public final void j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            k(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                vb.h.s("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof i) {
            this.f202184c = true;
        }
        this.f202182a.put(fielddescriptortype, obj);
    }

    private f() {
        int i14 = s.f202229f;
        this.f202182a = new r(16);
    }
}
