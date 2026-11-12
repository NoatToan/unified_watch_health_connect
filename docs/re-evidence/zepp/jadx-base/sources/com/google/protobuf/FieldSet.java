package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    private static final int d = 16;
    private static final FieldSet e = new FieldSet(true);
    private final SmallSortedMap<T, Object> a;
    private boolean b;
    private boolean c;

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static final class b<T extends FieldDescriptorLite<T>> {
        private SmallSortedMap<T, Object> a;
        private boolean b;
        private boolean c;
        private boolean d;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private void d() {
            if (this.c) {
                return;
            }
            this.a = FieldSet.l(this.a, true);
            this.c = true;
        }

        public static <T extends FieldDescriptorLite<T>> b<T> e(FieldSet<T> fieldSet) {
            b<T> bVar = new b<>(FieldSet.l(((FieldSet) fieldSet).a, true));
            ((b) bVar).b = ((FieldSet) fieldSet).c;
            return bVar;
        }

        private void o(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof LazyField) {
                value = ((LazyField) value).getValue();
            }
            if (key.isRepeated()) {
                Object objG = g(key);
                if (objG == null) {
                    objG = new ArrayList();
                }
                Iterator it2 = ((List) value).iterator();
                while (it2.hasNext()) {
                    ((List) objG).add(FieldSet.n(it2.next()));
                }
                this.a.put(key, objG);
                return;
            }
            if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                this.a.put(key, FieldSet.n(value));
                return;
            }
            Object objG2 = g(key);
            if (objG2 == null) {
                this.a.put(key, FieldSet.n(value));
            } else if (objG2 instanceof MessageLite.Builder) {
                key.internalMergeFrom((MessageLite.Builder) objG2, (MessageLite) value);
            } else {
                this.a.put(key, key.internalMergeFrom(((MessageLite) objG2).toBuilder(), (MessageLite) value).build());
            }
        }

        private static Object p(Object obj) {
            return obj instanceof MessageLite.Builder ? ((MessageLite.Builder) obj).build() : obj;
        }

        private static <T extends FieldDescriptorLite<T>> Object q(T t, Object obj) {
            if (obj == null || t.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (!t.isRepeated()) {
                return p(obj);
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj2 = arrayList.get(i);
                Object objP = p(obj2);
                if (objP != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i, objP);
                }
            }
            return arrayList;
        }

        private static <T extends FieldDescriptorLite<T>> void r(SmallSortedMap<T, Object> smallSortedMap) {
            for (int i = 0; i < smallSortedMap.getNumArrayEntries(); i++) {
                s(smallSortedMap.getArrayEntryAt(i));
            }
            Iterator it2 = smallSortedMap.getOverflowEntries().iterator();
            while (it2.hasNext()) {
                s((Map.Entry) it2.next());
            }
        }

        private static <T extends FieldDescriptorLite<T>> void s(Map.Entry<T, Object> entry) {
            entry.setValue(q(entry.getKey(), entry.getValue()));
        }

        private static void v(WireFormat.FieldType fieldType, Object obj) {
            if (FieldSet.G(fieldType, obj)) {
                return;
            }
            if (fieldType.getJavaType() != WireFormat.JavaType.MESSAGE || !(obj instanceof MessageLite.Builder)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }

        public void a(T t, Object obj) {
            List arrayList;
            d();
            if (!t.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.d = this.d || (obj instanceof MessageLite.Builder);
            v(t.getLiteType(), obj);
            Object objG = g(t);
            if (objG == null) {
                arrayList = new ArrayList();
                this.a.put(t, arrayList);
            } else {
                arrayList = (List) objG;
            }
            arrayList.add(obj);
        }

        public FieldSet<T> b() {
            if (this.a.isEmpty()) {
                return FieldSet.s();
            }
            this.c = false;
            SmallSortedMap<T, Object> smallSortedMapL = this.a;
            if (this.d) {
                smallSortedMapL = FieldSet.l(smallSortedMapL, false);
                r(smallSortedMapL);
            }
            FieldSet<T> fieldSet = new FieldSet<>(smallSortedMapL, null);
            ((FieldSet) fieldSet).c = this.b;
            return fieldSet;
        }

        public void c(T t) {
            d();
            this.a.remove(t);
            if (this.a.isEmpty()) {
                this.b = false;
            }
        }

        public Map<T, Object> f() {
            if (!this.b) {
                return this.a.isImmutable() ? this.a : Collections.unmodifiableMap(this.a);
            }
            SmallSortedMap smallSortedMapL = FieldSet.l(this.a, false);
            if (this.a.isImmutable()) {
                smallSortedMapL.makeImmutable();
            } else {
                r(smallSortedMapL);
            }
            return smallSortedMapL;
        }

        public Object g(T t) {
            return q(t, h(t));
        }

        public Object h(T t) {
            Object obj = this.a.get(t);
            return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
        }

        public Object i(T t, int i) {
            if (this.d) {
                d();
            }
            return p(j(t, i));
        }

        public Object j(T t, int i) {
            if (!t.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objH = h(t);
            if (objH != null) {
                return ((List) objH).get(i);
            }
            throw new IndexOutOfBoundsException();
        }

        public int k(T t) {
            if (!t.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objG = g(t);
            if (objG == null) {
                return 0;
            }
            return ((List) objG).size();
        }

        public boolean l(T t) {
            if (t.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.a.get(t) != null;
        }

        public boolean m() {
            for (int i = 0; i < this.a.getNumArrayEntries(); i++) {
                if (!FieldSet.F(this.a.getArrayEntryAt(i))) {
                    return false;
                }
            }
            Iterator it2 = this.a.getOverflowEntries().iterator();
            while (it2.hasNext()) {
                if (!FieldSet.F((Map.Entry) it2.next())) {
                    return false;
                }
            }
            return true;
        }

        public void n(FieldSet<T> fieldSet) {
            d();
            for (int i = 0; i < ((FieldSet) fieldSet).a.getNumArrayEntries(); i++) {
                o(((FieldSet) fieldSet).a.getArrayEntryAt(i));
            }
            Iterator it2 = ((FieldSet) fieldSet).a.getOverflowEntries().iterator();
            while (it2.hasNext()) {
                o((Map.Entry) it2.next());
            }
        }

        public void t(T t, Object obj) {
            d();
            if (!t.isRepeated()) {
                v(t.getLiteType(), obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    v(t.getLiteType(), obj2);
                    this.d = this.d || (obj2 instanceof MessageLite.Builder);
                }
                obj = arrayList;
            }
            if (obj instanceof LazyField) {
                this.b = true;
            }
            this.d = this.d || (obj instanceof MessageLite.Builder);
            this.a.put(t, obj);
        }

        public void u(T t, int i, Object obj) {
            d();
            if (!t.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.d = this.d || (obj instanceof MessageLite.Builder);
            Object objG = g(t);
            if (objG == null) {
                throw new IndexOutOfBoundsException();
            }
            v(t.getLiteType(), obj);
            ((List) objG).set(i, obj);
        }

        private b() {
            this(SmallSortedMap.newFieldMap(16));
        }

        private b(SmallSortedMap<T, Object> smallSortedMap) {
            this.a = smallSortedMap;
            this.c = true;
        }
    }

    public /* synthetic */ FieldSet(SmallSortedMap smallSortedMap, a aVar) {
        this(smallSortedMap);
    }

    public static int A(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> boolean F(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    if (!((MessageLite) it2.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof MessageLite)) {
                    if (value instanceof LazyField) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((MessageLite) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean G(WireFormat.FieldType fieldType, Object obj) {
        Internal.a(obj);
        switch (a.a[fieldType.getJavaType().ordinal()]) {
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
                return (obj instanceof Integer) || (obj instanceof Internal.EnumLite);
            case 9:
                return (obj instanceof MessageLite) || (obj instanceof LazyField);
            default:
                return false;
        }
    }

    private void K(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (key.isRepeated()) {
            Object objU = u(key);
            if (objU == null) {
                objU = new ArrayList();
            }
            Iterator it2 = ((List) value).iterator();
            while (it2.hasNext()) {
                ((List) objU).add(n(it2.next()));
            }
            this.a.put(key, objU);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.a.put(key, n(value));
            return;
        }
        Object objU2 = u(key);
        if (objU2 == null) {
            this.a.put(key, n(value));
        } else {
            this.a.put(key, key.internalMergeFrom(((MessageLite) objU2).toBuilder(), (MessageLite) value).build());
        }
    }

    public static <T extends FieldDescriptorLite<T>> b<T> L() {
        return new b<>((a) null);
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> M() {
        return new FieldSet<>();
    }

    public static Object N(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) throws IOException {
        return z ? WireFormat.b(codedInputStream, fieldType, WireFormat.Utf8Validation.STRICT) : WireFormat.b(codedInputStream, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    private void Q(WireFormat.FieldType fieldType, Object obj) {
        if (!G(fieldType, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void R(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, A(fieldType, false));
            S(codedOutputStream, fieldType, obj);
        }
    }

    public static void S(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    public static void T(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            if (obj instanceof LazyField) {
                R(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
                return;
            } else {
                R(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                R(codedOutputStream, liteType, number, it2.next());
            }
            return;
        }
        codedOutputStream.writeTag(number, 2);
        int iP = 0;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            iP += p(liteType, it3.next());
        }
        codedOutputStream.writeRawVarint32(iP);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            S(codedOutputStream, liteType, it4.next());
        }
    }

    private void V(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            T(key, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (MessageLite) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> SmallSortedMap<T, Object> l(SmallSortedMap<T, Object> smallSortedMap, boolean z) {
        SmallSortedMap<T, Object> smallSortedMapNewFieldMap = SmallSortedMap.newFieldMap(16);
        for (int i = 0; i < smallSortedMap.getNumArrayEntries(); i++) {
            m(smallSortedMapNewFieldMap, smallSortedMap.getArrayEntryAt(i), z);
        }
        Iterator it2 = smallSortedMap.getOverflowEntries().iterator();
        while (it2.hasNext()) {
            m(smallSortedMapNewFieldMap, (Map.Entry) it2.next(), z);
        }
        return smallSortedMapNewFieldMap;
    }

    private static <T extends FieldDescriptorLite<T>> void m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            map.put(key, ((LazyField) value).getValue());
        } else if (z && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object n(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int o(WireFormat.FieldType fieldType, int i, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + p(fieldType, obj);
    }

    public static int p(WireFormat.FieldType fieldType, Object obj) {
        switch (a.b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int q(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return o(liteType, number, obj);
        }
        int iO = 0;
        if (fieldDescriptorLite.isPacked()) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iO += p(liteType, it2.next());
            }
            return CodedOutputStream.computeTagSize(number) + iO + CodedOutputStream.computeRawVarint32Size(iO);
        }
        Iterator it3 = ((List) obj).iterator();
        while (it3.hasNext()) {
            iO += o(liteType, number, it3.next());
        }
        return iO;
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> s() {
        return e;
    }

    private int w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return q(key, value);
        }
        return value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (MessageLite) value);
    }

    public boolean B(T t) {
        if (t.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.a.get(t) != null;
    }

    public boolean C() {
        return this.a.isEmpty();
    }

    public boolean D() {
        return this.b;
    }

    public boolean E() {
        for (int i = 0; i < this.a.getNumArrayEntries(); i++) {
            if (!F(this.a.getArrayEntryAt(i))) {
                return false;
            }
        }
        Iterator it2 = this.a.getOverflowEntries().iterator();
        while (it2.hasNext()) {
            if (!F((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> H() {
        return this.c ? new LazyField.c(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void I() {
        if (this.b) {
            return;
        }
        this.a.makeImmutable();
        this.b = true;
    }

    public void J(FieldSet<T> fieldSet) {
        for (int i = 0; i < fieldSet.a.getNumArrayEntries(); i++) {
            K(fieldSet.a.getArrayEntryAt(i));
        }
        Iterator it2 = fieldSet.a.getOverflowEntries().iterator();
        while (it2.hasNext()) {
            K((Map.Entry) it2.next());
        }
    }

    public void O(T t, Object obj) {
        if (!t.isRepeated()) {
            Q(t.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Q(t.getLiteType(), it2.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    public void P(T t, int i, Object obj) {
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(t);
        if (objU == null) {
            throw new IndexOutOfBoundsException();
        }
        Q(t.getLiteType(), obj);
        ((List) objU).set(i, obj);
    }

    public void U(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.a.getNumArrayEntries(); i++) {
            V(this.a.getArrayEntryAt(i), codedOutputStream);
        }
        Iterator it2 = this.a.getOverflowEntries().iterator();
        while (it2.hasNext()) {
            V((Map.Entry) it2.next(), codedOutputStream);
        }
    }

    public void W(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.a.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.a.getArrayEntryAt(i);
            T((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        Iterator it2 = this.a.getOverflowEntries().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            T((FieldDescriptorLite) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.a.equals(((FieldSet) obj).a);
        }
        return false;
    }

    public void h(T t, Object obj) {
        List arrayList;
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        Q(t.getLiteType(), obj);
        Object objU = u(t);
        if (objU == null) {
            arrayList = new ArrayList();
            this.a.put(t, arrayList);
        } else {
            arrayList = (List) objU;
        }
        arrayList.add(obj);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i() {
        this.a.clear();
        this.c = false;
    }

    public void j(T t) {
        this.a.remove(t);
        if (this.a.isEmpty()) {
            this.c = false;
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public FieldSet<T> clone() {
        FieldSet<T> fieldSetM = M();
        for (int i = 0; i < this.a.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.a.getArrayEntryAt(i);
            fieldSetM.O((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it2 = this.a.getOverflowEntries().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            fieldSetM.O((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetM.c = this.c;
        return fieldSetM;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        return this.c ? new LazyField.c(this.a.descendingEntrySet().iterator()) : this.a.descendingEntrySet().iterator();
    }

    public Map<T, Object> t() {
        if (!this.c) {
            return this.a.isImmutable() ? this.a : Collections.unmodifiableMap(this.a);
        }
        SmallSortedMap smallSortedMapL = l(this.a, false);
        if (this.a.isImmutable()) {
            smallSortedMapL.makeImmutable();
        }
        return smallSortedMapL;
    }

    public Object u(T t) {
        Object obj = this.a.get(t);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public int v() {
        int iW = 0;
        for (int i = 0; i < this.a.getNumArrayEntries(); i++) {
            iW += w(this.a.getArrayEntryAt(i));
        }
        Iterator it2 = this.a.getOverflowEntries().iterator();
        while (it2.hasNext()) {
            iW += w((Map.Entry) it2.next());
        }
        return iW;
    }

    public Object x(T t, int i) {
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(t);
        if (objU != null) {
            return ((List) objU).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int y(T t) {
        if (!t.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(t);
        if (objU == null) {
            return 0;
        }
        return ((List) objU).size();
    }

    public int z() {
        int iQ = 0;
        for (int i = 0; i < this.a.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.a.getArrayEntryAt(i);
            iQ += q((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it2 = this.a.getOverflowEntries().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            iQ += q((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iQ;
    }

    private FieldSet() {
        this.a = SmallSortedMap.newFieldMap(16);
    }

    private FieldSet(boolean z) {
        this(SmallSortedMap.newFieldMap(0));
        I();
    }

    private FieldSet(SmallSortedMap<T, Object> smallSortedMap) {
        this.a = smallSortedMap;
        I();
    }
}
