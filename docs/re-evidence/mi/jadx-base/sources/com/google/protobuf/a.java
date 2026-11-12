package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends com.google.protobuf.b implements p0 {
    protected int memoizedSize = -1;

    /* JADX INFO: renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0258a<BuilderType extends AbstractC0258a<BuilderType>> extends com.google.protobuf.b.a implements p0.a {
        public static UninitializedMessageException newUninitializedMessageException(p0 p0Var) {
            return new UninitializedMessageException(MessageReflection.c(p0Var));
        }

        public void dispose() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        public List<String> findInitializationErrors() {
            return MessageReflection.c(this);
        }

        public p0.a getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }

        public String getInitializationErrorString() {
            return MessageReflection.a(findInitializationErrors());
        }

        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.h hVar) {
            throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
        }

        public p0.a getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
        }

        public boolean hasOneof(Descriptors.h hVar) {
            throw new UnsupportedOperationException("hasOneof() is not implemented.");
        }

        public void markClean() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.google.protobuf.b.a
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return super.mergeDelimitedFrom(inputStream);
        }

        public String toString() {
            return TextFormat.o().j(this);
        }

        @Override // 
        public BuilderType clearOneof(Descriptors.h hVar) {
            throw new UnsupportedOperationException("clearOneof() is not implemented.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.b.a
        public BuilderType internalMergeFrom(com.google.protobuf.b bVar) {
            return (BuilderType) mergeFrom((p0) bVar);
        }

        @Override // com.google.protobuf.b.a
        public boolean mergeDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return super.mergeDelimitedFrom(inputStream, tVar);
        }

        @Override // 
        /* JADX INFO: renamed from: mergeUnknownFields */
        public BuilderType mo145mergeUnknownFields(r1 r1Var) {
            setUnknownFields(r1.h(getUnknownFields()).q(r1Var).build());
            return this;
        }

        @Override // 
        /* JADX INFO: renamed from: clear */
        public BuilderType mo142clear() {
            Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> it = getAllFields().entrySet().iterator();
            while (it.hasNext()) {
                clearField(it.next().getKey());
            }
            return this;
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: clone */
        public BuilderType mo144clone() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        public BuilderType mergeFrom(p0 p0Var) {
            return (BuilderType) mergeFrom(p0Var, p0Var.getAllFields());
        }

        public BuilderType mergeFrom(p0 p0Var, Map<Descriptors.FieldDescriptor, Object> map) {
            if (p0Var.getDescriptorForType() == getDescriptorForType()) {
                for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
                    Descriptors.FieldDescriptor key = entry.getKey();
                    if (key.isRepeated()) {
                        Iterator it = ((List) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            addRepeatedField(key, it.next());
                        }
                    } else if (key.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        p0 p0Var2 = (p0) getField(key);
                        if (p0Var2 == p0Var2.getDefaultInstanceForType()) {
                            setField(key, entry.getValue());
                        } else {
                            setField(key, p0Var2.newBuilderForType().mergeFrom(p0Var2).mergeFrom((p0) entry.getValue()).build());
                        }
                    } else {
                        setField(key, entry.getValue());
                    }
                }
                mo145mergeUnknownFields(p0Var.getUnknownFields());
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom */
        public BuilderType mo158mergeFrom(j jVar) throws IOException {
            return (BuilderType) mergeFrom(jVar, (t) s.g());
        }

        @Override // com.google.protobuf.b.a, com.google.protobuf.q0.a
        public BuilderType mergeFrom(j jVar, t tVar) throws IOException {
            int iJ;
            r1.b bVarH = jVar.M() ? null : r1.h(getUnknownFields());
            do {
                iJ = jVar.J();
                if (iJ == 0) {
                    break;
                }
            } while (MessageReflection.g(jVar, bVarH, tVar, getDescriptorForType(), new MessageReflection.b(this), iJ));
            if (bVarH != null) {
                setUnknownFields(bVarH.build());
            }
            return this;
        }

        @Override // com.google.protobuf.b.a, com.google.protobuf.p0.a
        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(byteString);
        }

        @Override // com.google.protobuf.b.a, com.google.protobuf.p0.a
        public BuilderType mergeFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.b.a, com.google.protobuf.q0.a
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom */
        public BuilderType mo154mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return (BuilderType) super.mo154mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom */
        public BuilderType mo161mergeFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (BuilderType) super.mo161mergeFrom(bArr, tVar);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom */
        public BuilderType mo155mergeFrom(byte[] bArr, int i, int i2, t tVar) throws InvalidProtocolBufferException {
            return (BuilderType) super.mo155mergeFrom(bArr, i, i2, tVar);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom */
        public BuilderType mo159mergeFrom(InputStream inputStream) throws IOException {
            return (BuilderType) super.mo159mergeFrom(inputStream);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom */
        public BuilderType mo160mergeFrom(InputStream inputStream, t tVar) throws IOException {
            return (BuilderType) super.mo160mergeFrom(inputStream, tVar);
        }
    }

    public interface b {
        void a();
    }

    private static boolean compareBytes(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : toByteString(obj).equals(toByteString(obj2));
    }

    public static boolean compareFields(Map<Descriptors.FieldDescriptor, Object> map, Map<Descriptors.FieldDescriptor, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Descriptors.FieldDescriptor fieldDescriptor : map.keySet()) {
            if (!map2.containsKey(fieldDescriptor)) {
                return false;
            }
            Object obj = map.get(fieldDescriptor);
            Object obj2 = map2.get(fieldDescriptor);
            if (fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.BYTES) {
                if (fieldDescriptor.isRepeated()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (!compareBytes(list.get(i), list2.get(i))) {
                            return false;
                        }
                    }
                } else if (!compareBytes(obj, obj2)) {
                    return false;
                }
            } else if (fieldDescriptor.C()) {
                if (!compareMapField(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean compareMapField(Object obj, Object obj2) {
        return MapFieldLite.equals(convertMapEntryListToMap((List) obj), convertMapEntryListToMap((List) obj2));
    }

    private static Map convertMapEntryListToMap(List list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        p0 p0Var = (p0) it.next();
        Descriptors.b descriptorForType = p0Var.getDescriptorForType();
        Descriptors.FieldDescriptor fieldDescriptorK = descriptorForType.k("key");
        Descriptors.FieldDescriptor fieldDescriptorK2 = descriptorForType.k("value");
        Object field = p0Var.getField(fieldDescriptorK2);
        if (field instanceof Descriptors.e) {
            field = Integer.valueOf(((Descriptors.e) field).getNumber());
        }
        map.put(p0Var.getField(fieldDescriptorK), field);
        while (it.hasNext()) {
            p0 p0Var2 = (p0) it.next();
            Object field2 = p0Var2.getField(fieldDescriptorK2);
            if (field2 instanceof Descriptors.e) {
                field2 = Integer.valueOf(((Descriptors.e) field2).getNumber());
            }
            map.put(p0Var2.getField(fieldDescriptorK), field2);
        }
        return map;
    }

    @Deprecated
    public static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    @Deprecated
    public static int hashEnum(d0.c cVar) {
        return cVar.getNumber();
    }

    @Deprecated
    public static int hashEnumList(List<? extends d0.c> list) {
        Iterator<? extends d0.c> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    public static int hashFields(int i, Map<Descriptors.FieldDescriptor, Object> map) {
        int i2;
        int iG;
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            int number = (i * 37) + key.getNumber();
            if (key.C()) {
                i2 = number * 53;
                iG = hashMapField(value);
            } else if (key.z() != Descriptors.FieldDescriptor.Type.ENUM) {
                i2 = number * 53;
                iG = value.hashCode();
            } else if (key.isRepeated()) {
                i2 = number * 53;
                iG = d0.h((List) value);
            } else {
                i2 = number * 53;
                iG = d0.g((d0.c) value);
            }
            i = i2 + iG;
        }
        return i;
    }

    @Deprecated
    public static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }

    private static int hashMapField(Object obj) {
        return MapFieldLite.calculateHashCodeForMap(convertMapEntryListToMap((List) obj));
    }

    private static ByteString toByteString(Object obj) {
        return obj instanceof byte[] ? ByteString.copyFrom((byte[]) obj) : (ByteString) obj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (getDescriptorForType() != p0Var.getDescriptorForType()) {
            return false;
        }
        return compareFields(getAllFields(), p0Var.getAllFields()) && getUnknownFields().equals(p0Var.getUnknownFields());
    }

    public List<String> findInitializationErrors() {
        return MessageReflection.c(this);
    }

    public String getInitializationErrorString() {
        return MessageReflection.a(findInitializationErrors());
    }

    @Override // com.google.protobuf.b
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.h hVar) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iE = MessageReflection.e(this, getAllFields());
        this.memoizedSize = iE;
        return iE;
    }

    public boolean hasOneof(Descriptors.h hVar) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashFields = (hashFields(779 + getDescriptorForType().hashCode(), getAllFields()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashFields;
        return iHashFields;
    }

    @Override // defpackage.bsf
    public boolean isInitialized() {
        return MessageReflection.f(this);
    }

    public p0.a newBuilderForType(b bVar) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    @Override // com.google.protobuf.b
    public UninitializedMessageException newUninitializedMessageException() {
        return AbstractC0258a.newUninitializedMessageException((p0) this);
    }

    @Override // com.google.protobuf.b
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSize = i;
    }

    public final String toString() {
        return TextFormat.o().j(this);
    }

    @Override // com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        MessageReflection.k(this, getAllFields(), codedOutputStream, false);
    }
}
