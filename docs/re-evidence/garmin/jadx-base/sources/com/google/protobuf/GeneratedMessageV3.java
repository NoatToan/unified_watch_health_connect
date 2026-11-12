package com.google.protobuf;

import am.j;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o2.c;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageV3 extends AbstractMessage implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected UnknownFieldSet unknownFields;

    public interface BuilderParent extends AbstractMessage.BuilderParent {
    }

    public interface ExtendableMessageOrBuilder<MessageT extends ExtendableMessage<MessageT>> extends MessageOrBuilder {
        @Override // com.google.protobuf.MessageOrBuilder, com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        Message getDefaultInstanceForType();

        <T> T getExtension(Extension<MessageT, T> extension);

        <T> T getExtension(Extension<MessageT, List<T>> extension, int i14);

        <T> T getExtension(ExtensionLite<MessageT, T> extensionLite);

        <T> T getExtension(ExtensionLite<MessageT, List<T>> extensionLite, int i14);

        <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension);

        <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension, int i14);

        <T> int getExtensionCount(Extension<MessageT, List<T>> extension);

        <T> int getExtensionCount(ExtensionLite<MessageT, List<T>> extensionLite);

        <T> int getExtensionCount(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension);

        <T> boolean hasExtension(Extension<MessageT, T> extension);

        <T> boolean hasExtension(ExtensionLite<MessageT, T> extensionLite);

        <T> boolean hasExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension);
    }

    public interface ExtensionDescriptorRetriever {
        Descriptors.FieldDescriptor getDescriptor();
    }

    public static final class UnusedPrivateParameter {
        static final UnusedPrivateParameter INSTANCE = new UnusedPrivateParameter();

        private UnusedPrivateParameter() {
        }
    }

    public GeneratedMessageV3() {
        this.unknownFields = UnknownFieldSet.getDefaultInstance();
    }

    public static boolean canUseUnsafe() {
        return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageT extends ExtendableMessage<MessageT>, T> Extension<MessageT, T> checkNotLite(ExtensionLite<MessageT, T> extensionLite) {
        if (!extensionLite.isLite()) {
            return (Extension) extensionLite;
        }
        h.s("Expected non-lite extension.");
        return null;
    }

    public static int computeStringSize(int i14, Object obj) {
        return obj instanceof String ? CodedOutputStream.computeStringSize(i14, (String) obj) : CodedOutputStream.computeBytesSize(i14, (ByteString) obj);
    }

    public static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? CodedOutputStream.computeStringSizeNoTag((String) obj) : CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
    }

    public static Internal.BooleanList emptyBooleanList() {
        return BooleanArrayList.emptyList();
    }

    public static Internal.DoubleList emptyDoubleList() {
        return DoubleArrayList.emptyList();
    }

    public static Internal.FloatList emptyFloatList() {
        return FloatArrayList.emptyList();
    }

    public static Internal.IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    public static <T> Internal.ProtobufList<T> emptyList(Class<T> cls) {
        return ProtobufArrayList.emptyList();
    }

    public static Internal.LongList emptyLongList() {
        return LongArrayList.emptyList();
    }

    public static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable(boolean z14) {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().descriptor.getFields();
        int fieldCount = 0;
        while (fieldCount < fields.size()) {
            Descriptors.FieldDescriptor oneofFieldDescriptor = fields.get(fieldCount);
            Descriptors.OneofDescriptor containingOneof = oneofFieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                fieldCount += containingOneof.getFieldCount() - 1;
                if (hasOneof(containingOneof)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(containingOneof);
                    if (z14 || oneofFieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.STRING) {
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    } else {
                        treeMap.put(oneofFieldDescriptor, getFieldRaw(oneofFieldDescriptor));
                    }
                }
            } else if (oneofFieldDescriptor.isRepeated()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                if (z14) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                } else {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            }
            fieldCount++;
        }
        return treeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Method getMethodOrDie(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            com.airbnb.lottie.animation.keyframe.a.x("Couldn't use Java reflection to implement protocol message reflection.", e4);
            return null;
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            com.airbnb.lottie.animation.keyframe.a.x("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static boolean isStringEmpty(Object obj) {
        return obj instanceof String ? ((String) obj).isEmpty() : ((ByteString) obj).isEmpty();
    }

    public static <ListT extends Internal.ProtobufList<?>> ListT makeMutableCopy(ListT listt, int i14) {
        int size = listt.size();
        if (i14 <= size) {
            i14 = size * 2;
        }
        if (i14 <= 0) {
            i14 = 10;
        }
        return (ListT) listt.mutableCopyWithCapacity2(i14);
    }

    private static <V> void maybeSerializeBooleanEntryTo(CodedOutputStream codedOutputStream, Map<Boolean, V> map, MapEntry<Boolean, V> mapEntry, int i14, boolean z14) {
        if (map.containsKey(Boolean.valueOf(z14))) {
            codedOutputStream.writeMessage(i14, mapEntry.newBuilderForType().setKey(Boolean.valueOf(z14)).setValue(map.get(Boolean.valueOf(z14))).build());
        }
    }

    public static Internal.IntList mutableCopy(Internal.IntList intList) {
        return (Internal.IntList) makeMutableCopy(intList);
    }

    public static Internal.BooleanList newBooleanList() {
        return new BooleanArrayList();
    }

    public static Internal.DoubleList newDoubleList() {
        return new DoubleArrayList();
    }

    public static Internal.FloatList newFloatList() {
        return new FloatArrayList();
    }

    public static Internal.IntList newIntList() {
        return new IntArrayList();
    }

    public static Internal.LongList newLongList() {
        return new LongArrayList();
    }

    public static <M extends Message> M parseDelimitedWithIOException(Parser<M> parser, InputStream inputStream) throws IOException {
        try {
            return parser.parseDelimitedFrom(inputStream);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(Parser<M> parser, InputStream inputStream) throws IOException {
        try {
            return parser.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.unwrapIOException();
        }
    }

    public static <V> void serializeBooleanMapTo(CodedOutputStream codedOutputStream, MapField<Boolean, V> mapField, MapEntry<Boolean, V> mapEntry, int i14) {
        Map<Boolean, V> map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i14);
        } else {
            maybeSerializeBooleanEntryTo(codedOutputStream, map, mapEntry, i14, false);
            maybeSerializeBooleanEntryTo(codedOutputStream, map, mapEntry, i14, true);
        }
    }

    public static <V> void serializeIntegerMapTo(CodedOutputStream codedOutputStream, MapField<Integer, V> mapField, MapEntry<Integer, V> mapEntry, int i14) {
        Map<Integer, V> map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i14);
            return;
        }
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i15 = 0;
        while (it.hasNext()) {
            iArr[i15] = it.next().intValue();
            i15++;
        }
        Arrays.sort(iArr);
        for (int i16 = 0; i16 < size; i16++) {
            int i17 = iArr[i16];
            codedOutputStream.writeMessage(i14, mapEntry.newBuilderForType().setKey(Integer.valueOf(i17)).setValue(map.get(Integer.valueOf(i17))).build());
        }
    }

    public static <V> void serializeLongMapTo(CodedOutputStream codedOutputStream, MapField<Long, V> mapField, MapEntry<Long, V> mapEntry, int i14) {
        Map<Long, V> map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i14);
            return;
        }
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i15 = 0;
        while (it.hasNext()) {
            jArr[i15] = it.next().longValue();
            i15++;
        }
        Arrays.sort(jArr);
        for (int i16 = 0; i16 < size; i16++) {
            long j8 = jArr[i16];
            codedOutputStream.writeMessage(i14, mapEntry.newBuilderForType().setKey(Long.valueOf(j8)).setValue(map.get(Long.valueOf(j8))).build());
        }
    }

    private static <K, V> void serializeMapTo(CodedOutputStream codedOutputStream, Map<K, V> map, MapEntry<K, V> mapEntry, int i14) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            codedOutputStream.writeMessage(i14, mapEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
    }

    public static <V> void serializeStringMapTo(CodedOutputStream codedOutputStream, MapField<String, V> mapField, MapEntry<String, V> mapEntry, int i14) {
        Map<String, V> map = mapField.getMap();
        if (!codedOutputStream.isSerializationDeterministic()) {
            serializeMapTo(codedOutputStream, map, mapEntry, i14);
            return;
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            codedOutputStream.writeMessage(i14, mapEntry.newBuilderForType().setKey(str).setValue(map.get(str)).build());
        }
    }

    public static void setAlwaysUseFieldBuildersForTesting(boolean z14) {
        alwaysUseFieldBuilders = z14;
    }

    public static void writeString(CodedOutputStream codedOutputStream, int i14, Object obj) {
        if (obj instanceof String) {
            codedOutputStream.writeString(i14, (String) obj);
        } else {
            codedOutputStream.writeBytes(i14, (ByteString) obj);
        }
    }

    public static void writeStringNoTag(CodedOutputStream codedOutputStream, Object obj) {
        if (obj instanceof String) {
            codedOutputStream.writeStringNoTag((String) obj);
        } else {
            codedOutputStream.writeBytesNoTag((ByteString) obj);
        }
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return internalGetFieldAccessorTable().descriptor;
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).get(this);
    }

    public Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRaw(this);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().getOneof(oneofDescriptor).get(this);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<? extends GeneratedMessageV3> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeated(this, i14);
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeatedCount(this);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i14 = this.memoizedSize;
        if (i14 != -1) {
            return i14;
        }
        int serializedSize = MessageReflection.getSerializedSize(this, getAllFieldsRaw());
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().getField(fieldDescriptor).has(this);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().getOneof(oneofDescriptor).has(this);
    }

    public abstract FieldAccessorTable internalGetFieldAccessorTable();

    @Deprecated
    public MapField internalGetMapField(int i14) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public MapFieldReflectionAccessor internalGetMapFieldReflection(int i14) {
        return internalGetMapField(i14);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                return false;
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    Iterator it = ((List) getField(fieldDescriptor)).iterator();
                    while (it.hasNext()) {
                        if (!((Message) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(fieldDescriptor) && !((Message) getField(fieldDescriptor)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void makeExtensionsImmutable() {
    }

    @Deprecated
    public void mergeFromAndMakeImmutableInternal(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Schema schemaSchemaFor = Protobuf.getInstance().schemaFor(this);
        try {
            schemaSchemaFor.mergeFrom(this, CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
            schemaSchemaFor.makeImmutable(this);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.setUnfinishedMessage(this);
        } catch (IOException e14) {
            throw new InvalidProtocolBufferException(e14).setUnfinishedMessage(this);
        }
    }

    @Override // com.google.protobuf.AbstractMessage
    public Message.Builder newBuilderForType(final AbstractMessage.BuilderParent builderParent) {
        return newBuilderForType(new BuilderParent() { // from class: com.google.protobuf.GeneratedMessageV3.1
            @Override // com.google.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                builderParent.markDirty();
            }
        });
    }

    public abstract Message.Builder newBuilderForType(BuilderParent builderParent);

    public Object newInstance(UnusedPrivateParameter unusedPrivateParameter) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    public boolean parseUnknownField(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i14) {
        return codedInputStream.shouldDiscardUnknownFields() ? codedInputStream.skipField(i14) : builder.mergeFieldFrom(i14, codedInputStream);
    }

    public boolean parseUnknownFieldProto3(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i14) {
        return parseUnknownField(codedInputStream, builder, extensionRegistryLite, i14);
    }

    public void setUnknownFields(UnknownFieldSet unknownFieldSet) {
        this.unknownFields = unknownFieldSet;
    }

    public Object writeReplace() {
        return new GeneratedMessageLite.SerializedForm(this);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        MessageReflection.writeMessageTo(this, getAllFieldsRaw(), codedOutputStream, false);
    }

    public static abstract class ExtendableBuilder<MessageT extends ExtendableMessage<MessageT>, BuilderT extends ExtendableBuilder<MessageT, BuilderT>> extends Builder<BuilderT> implements ExtendableMessageOrBuilder<MessageT> {
        private FieldSet.Builder<Descriptors.FieldDescriptor> extensions;

        public ExtendableBuilder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FieldSet<Descriptors.FieldDescriptor> buildExtensions() {
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            return builder == null ? FieldSet.emptySet() : builder.buildPartial();
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensions == null) {
                this.extensions = FieldSet.newBuilder();
            }
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() == getDescriptorForType()) {
                return;
            }
            h.s("FieldDescriptor does not match message type.");
        }

        private void verifyExtensionContainingType(Extension<MessageT, ?> extension) {
            if (extension.getDescriptor().getContainingType() == getDescriptorForType()) {
                return;
            }
            j.w(extension.getDescriptor().getContainingType().getFullName(), "\" which does not match message type \"", getDescriptorForType().getFullName(), "\".", "Extension is for type \"");
        }

        public final <T> BuilderT addExtension(ExtensionLite<MessageT, List<T>> extensionLite, T t7) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.addRepeatedField(extensionCheckNotLite.getDescriptor(), extensionCheckNotLite.singularToReflectionType(t7));
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public BuilderT addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (BuilderT) super.addRepeatedField(fieldDescriptor, obj);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            this.extensions.addRepeatedField(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderT clear() {
            this.extensions = null;
            return (BuilderT) super.clear();
        }

        public final <T> BuilderT clearExtension(ExtensionLite<MessageT, T> extensionLite) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.clearField(extensionCheckNotLite.getDescriptor());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public BuilderT clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return (BuilderT) super.clearField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            this.extensions.clearField(fieldDescriptor);
            onChanged();
            return this;
        }

        public boolean extensionsAreInitialized() {
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            return builder == null || builder.isInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable();
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder != null) {
                allFieldsMutable.putAll(builder.getAllFields());
            }
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(ExtensionLite<MessageT, T> extensionLite) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            Descriptors.FieldDescriptor descriptor = extensionCheckNotLite.getDescriptor();
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            Object field = builder == null ? null : builder.getField(descriptor);
            if (field != null) {
                return (T) extensionCheckNotLite.fromReflectionType(field);
            }
            if (descriptor.isRepeated()) {
                return (T) Collections.EMPTY_LIST;
            }
            return descriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? (T) extensionCheckNotLite.getMessageDefaultInstance() : (T) extensionCheckNotLite.fromReflectionType(descriptor.getDefaultValue());
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> int getExtensionCount(ExtensionLite<MessageT, List<T>> extensionLite) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            Descriptors.FieldDescriptor descriptor = extensionCheckNotLite.getDescriptor();
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder == null) {
                return 0;
            }
            return builder.getRepeatedFieldCount(descriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            Object field = builder == null ? null : builder.getField(fieldDescriptor);
            if (field == null) {
                return fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue();
            }
            return field;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getFieldBuilder(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                e.w("getFieldBuilder() called on a non-Message type.");
                return null;
            }
            ensureExtensionsIsMutable();
            Object fieldAllowBuilders = this.extensions.getFieldAllowBuilders(fieldDescriptor);
            if (fieldAllowBuilders == null) {
                DynamicMessage.Builder builderNewBuilder = DynamicMessage.newBuilder(fieldDescriptor.getMessageType());
                this.extensions.setField(fieldDescriptor, builderNewBuilder);
                onChanged();
                return builderNewBuilder;
            }
            if (fieldAllowBuilders instanceof Message.Builder) {
                return (Message.Builder) fieldAllowBuilders;
            }
            if (!(fieldAllowBuilders instanceof Message)) {
                e.w("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            Message.Builder builder = ((Message) fieldAllowBuilders).toBuilder();
            this.extensions.setField(fieldDescriptor, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedField(fieldDescriptor, i14);
            }
            verifyContainingType(fieldDescriptor);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder != null) {
                return builder.getRepeatedField(fieldDescriptor, i14);
            }
            c.q();
            return null;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i14) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldBuilder(fieldDescriptor, i14);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                e.w("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            Object repeatedFieldAllowBuilders = this.extensions.getRepeatedFieldAllowBuilders(fieldDescriptor, i14);
            if (repeatedFieldAllowBuilders instanceof Message.Builder) {
                return (Message.Builder) repeatedFieldAllowBuilders;
            }
            if (!(repeatedFieldAllowBuilders instanceof Message)) {
                e.w("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            Message.Builder builder = ((Message) repeatedFieldAllowBuilders).toBuilder();
            this.extensions.setRepeatedField(fieldDescriptor, i14, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldCount(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder == null) {
                return 0;
            }
            return builder.getRepeatedFieldCount(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> boolean hasExtension(ExtensionLite<MessageT, T> extensionLite) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            return builder != null && builder.hasField(extensionCheckNotLite.getDescriptor());
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.hasField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            return builder != null && builder.hasField(fieldDescriptor);
        }

        public void internalSetExtensionSet(FieldSet<Descriptors.FieldDescriptor> fieldSet) {
            this.extensions = FieldSet.Builder.fromFieldSet(fieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        public final void mergeExtensionFields(ExtendableMessage<?> extendableMessage) {
            if (((ExtendableMessage) extendableMessage).extensions != null) {
                ensureExtensionsIsMutable();
                this.extensions.mergeFrom(((ExtendableMessage) extendableMessage).extensions);
                onChanged();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return fieldDescriptor.isExtension() ? DynamicMessage.newBuilder(fieldDescriptor.getMessageType()) : super.newBuilderForField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public boolean parseUnknownField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i14) {
            ensureExtensionsIsMutable();
            return MessageReflection.mergeFieldFrom(codedInputStream, codedInputStream.shouldDiscardUnknownFields() ? null : getUnknownFieldSetBuilder(), extensionRegistryLite, getDescriptorForType(), new MessageReflection.ExtensionBuilderAdapter(this.extensions), i14);
        }

        public final <T> BuilderT setExtension(ExtensionLite<MessageT, T> extensionLite, T t7) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.setField(extensionCheckNotLite.getDescriptor(), extensionCheckNotLite.toReflectionType(t7));
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public BuilderT setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (BuilderT) super.setField(fieldDescriptor, obj);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            this.extensions.setField(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public BuilderT setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (BuilderT) super.setRepeatedField(fieldDescriptor, i14, obj);
            }
            verifyContainingType(fieldDescriptor);
            ensureExtensionsIsMutable();
            this.extensions.setRepeatedField(fieldDescriptor, i14, obj);
            onChanged();
            return this;
        }

        public ExtendableBuilder(BuilderParent builderParent) {
            super(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> int getExtensionCount(Extension<MessageT, List<T>> extension) {
            return getExtensionCount((ExtensionLite) extension);
        }

        public final <T> BuilderT clearExtension(Extension<MessageT, T> extension) {
            return (BuilderT) clearExtension((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> int getExtensionCount(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension) {
            return getExtensionCount((ExtensionLite) generatedExtension);
        }

        public <T> BuilderT clearExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension) {
            return (BuilderT) clearExtension((ExtensionLite) generatedExtension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> boolean hasExtension(Extension<MessageT, T> extension) {
            return hasExtension((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> boolean hasExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension) {
            return hasExtension((ExtensionLite) generatedExtension);
        }

        public final <T> BuilderT addExtension(Extension<MessageT, List<T>> extension, T t7) {
            return (BuilderT) addExtension((ExtensionLite) extension, (Object) t7);
        }

        public final <T> BuilderT setExtension(ExtensionLite<MessageT, List<T>> extensionLite, int i14, T t7) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.setRepeatedField(extensionCheckNotLite.getDescriptor(), i14, extensionCheckNotLite.singularToReflectionType(t7));
            onChanged();
            return this;
        }

        public <T> BuilderT addExtension(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension, T t7) {
            return (BuilderT) addExtension((ExtensionLite) generatedExtension, (Object) t7);
        }

        public final <T> BuilderT setExtension(Extension<MessageT, T> extension, T t7) {
            return (BuilderT) setExtension((ExtensionLite) extension, (Object) t7);
        }

        public <T> BuilderT setExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension, T t7) {
            return (BuilderT) setExtension((ExtensionLite) generatedExtension, (Object) t7);
        }

        public final <T> BuilderT setExtension(Extension<MessageT, List<T>> extension, int i14, T t7) {
            return (BuilderT) setExtension((ExtensionLite) extension, i14, (Object) t7);
        }

        public <T> BuilderT setExtension(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension, int i14, T t7) {
            return (BuilderT) setExtension((ExtensionLite) generatedExtension, i14, (Object) t7);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(ExtensionLite<MessageT, List<T>> extensionLite, int i14) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            Descriptors.FieldDescriptor descriptor = extensionCheckNotLite.getDescriptor();
            FieldSet.Builder<Descriptors.FieldDescriptor> builder = this.extensions;
            if (builder != null) {
                return (T) extensionCheckNotLite.singularFromReflectionType(builder.getRepeatedField(descriptor, i14));
            }
            c.q();
            return null;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(Extension<MessageT, T> extension) {
            return (T) getExtension((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension) {
            return (T) getExtension((ExtensionLite) generatedExtension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(Extension<MessageT, List<T>> extension, int i14) {
            return (T) getExtension((ExtensionLite) extension, i14);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension, int i14) {
            return (T) getExtension((ExtensionLite) generatedExtension, i14);
        }
    }

    public static abstract class Builder<BuilderT extends Builder<BuilderT>> extends AbstractMessage.Builder<BuilderT> {
        private BuilderParent builderParent;
        private boolean isClean;
        private Builder<BuilderT>.BuilderParentImpl meAsParent;
        private Object unknownFieldsOrBuilder;

        public class BuilderParentImpl implements BuilderParent {
            private BuilderParentImpl() {
            }

            @Override // com.google.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                Builder.this.onChanged();
            }
        }

        public Builder(BuilderParent builderParent) {
            this.unknownFieldsOrBuilder = UnknownFieldSet.getDefaultInstance();
            this.builderParent = builderParent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().descriptor.getFields();
            int fieldCount = 0;
            while (fieldCount < fields.size()) {
                Descriptors.FieldDescriptor oneofFieldDescriptor = fields.get(fieldCount);
                Descriptors.OneofDescriptor containingOneof = oneofFieldDescriptor.getContainingOneof();
                if (containingOneof != null) {
                    fieldCount += containingOneof.getFieldCount() - 1;
                    if (hasOneof(containingOneof)) {
                        oneofFieldDescriptor = getOneofFieldDescriptor(containingOneof);
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                } else if (oneofFieldDescriptor.isRepeated()) {
                    List list = (List) getField(oneofFieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(oneofFieldDescriptor, list);
                    }
                } else if (hasField(oneofFieldDescriptor)) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
                fieldCount++;
            }
            return treeMap;
        }

        private BuilderT setUnknownFieldsInternal(UnknownFieldSet unknownFieldSet) {
            this.unknownFieldsOrBuilder = unknownFieldSet;
            onChanged();
            return this;
        }

        public BuilderT addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).addRepeated(this, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderT clear() {
            this.unknownFieldsOrBuilder = UnknownFieldSet.getDefaultInstance();
            onChanged();
            return this;
        }

        public BuilderT clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).clear(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public BuilderT clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            internalGetFieldAccessorTable().getOneof(oneofDescriptor).clear(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderT mo57clone() {
            BuilderT buildert = (BuilderT) getDefaultInstanceForType().newBuilderForType();
            buildert.mergeFrom(buildPartial());
            return buildert;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        public void dispose() {
            this.builderParent = null;
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internalGetFieldAccessorTable().descriptor;
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            Object obj = internalGetFieldAccessorTable().getField(fieldDescriptor).get((Builder<?>) this);
            return fieldDescriptor.isRepeated() ? Collections.unmodifiableList((List) obj) : obj;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getBuilder(this);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().getOneof(oneofDescriptor).get((Builder<?>) this);
        }

        public BuilderParent getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new BuilderParentImpl();
            }
            return this.meAsParent;
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeated((Builder<?>) this, i14);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i14) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeatedBuilder(this, i14);
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).getRepeatedCount((Builder<?>) this);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        public UnknownFieldSet.Builder getUnknownFieldSetBuilder() {
            Object obj = this.unknownFieldsOrBuilder;
            if (obj instanceof UnknownFieldSet) {
                this.unknownFieldsOrBuilder = ((UnknownFieldSet) obj).toBuilder();
            }
            onChanged();
            return (UnknownFieldSet.Builder) this.unknownFieldsOrBuilder;
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            Object obj = this.unknownFieldsOrBuilder;
            return obj instanceof UnknownFieldSet ? (UnknownFieldSet) obj : ((UnknownFieldSet.Builder) obj).buildPartial();
        }

        @Override // com.google.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).has((Builder<?>) this);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageOrBuilder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().getOneof(oneofDescriptor).has((Builder<?>) this);
        }

        public abstract FieldAccessorTable internalGetFieldAccessorTable();

        @Deprecated
        public MapField internalGetMapField(int i14) {
            throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
        }

        public MapFieldReflectionAccessor internalGetMapFieldReflection(int i14) {
            return internalGetMapField(i14);
        }

        @Deprecated
        public MapField internalGetMutableMapField(int i14) {
            throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
        }

        public MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i14) {
            return internalGetMutableMapField(i14);
        }

        public boolean isClean() {
            return this.isClean;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public boolean isInitialized() {
            for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
                if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                    return false;
                }
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    if (fieldDescriptor.isRepeated()) {
                        Iterator it = ((List) getField(fieldDescriptor)).iterator();
                        while (it.hasNext()) {
                            if (!((Message) it.next()).isInitialized()) {
                                return false;
                            }
                        }
                    } else if (hasField(fieldDescriptor) && !((Message) getField(fieldDescriptor)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        public void markClean() {
            this.isClean = true;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public BuilderT mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            if (UnknownFieldSet.getDefaultInstance().equals(unknownFieldSet)) {
                return this;
            }
            if (UnknownFieldSet.getDefaultInstance().equals(this.unknownFieldsOrBuilder)) {
                this.unknownFieldsOrBuilder = unknownFieldSet;
                onChanged();
                return this;
            }
            getUnknownFieldSetBuilder().mergeFrom(unknownFieldSet);
            onChanged();
            return this;
        }

        public final void mergeUnknownLengthDelimitedField(int i14, ByteString byteString) {
            getUnknownFieldSetBuilder().mergeLengthDelimitedField(i14, byteString);
        }

        public final void mergeUnknownVarintField(int i14, int i15) {
            getUnknownFieldSetBuilder().mergeVarintField(i14, i15);
        }

        @Override // com.google.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().getField(fieldDescriptor).newBuilder();
        }

        public void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        public final void onChanged() {
            BuilderParent builderParent;
            if (!this.isClean || (builderParent = this.builderParent) == null) {
                return;
            }
            builderParent.markDirty();
            this.isClean = false;
        }

        public boolean parseUnknownField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i14) {
            return codedInputStream.shouldDiscardUnknownFields() ? codedInputStream.skipField(i14) : getUnknownFieldSetBuilder().mergeFieldFrom(i14, codedInputStream);
        }

        public BuilderT setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).set(this, obj);
            return this;
        }

        public BuilderT setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
            internalGetFieldAccessorTable().getField(fieldDescriptor).setRepeated(this, i14, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder
        public void setUnknownFieldSetBuilder(UnknownFieldSet.Builder builder) {
            this.unknownFieldsOrBuilder = builder;
            onChanged();
        }

        public BuilderT setUnknownFieldsProto3(UnknownFieldSet unknownFieldSet) {
            return (BuilderT) setUnknownFieldsInternal(unknownFieldSet);
        }

        public BuilderT setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (BuilderT) setUnknownFieldsInternal(unknownFieldSet);
        }

        public Builder() {
            this(null);
        }
    }

    public static final class FieldAccessorTable {
        private String[] camelCaseNames;
        private final Descriptors.Descriptor descriptor;
        private final FieldAccessor[] fields;
        private volatile boolean initialized;
        private final OneofAccessor[] oneofs;

        public interface FieldAccessor {
            void addRepeated(Builder<?> builder, Object obj);

            void clear(Builder<?> builder);

            Object get(Builder<?> builder);

            Object get(GeneratedMessageV3 generatedMessageV3);

            Message.Builder getBuilder(Builder<?> builder);

            Object getRaw(GeneratedMessageV3 generatedMessageV3);

            Object getRepeated(Builder<?> builder, int i14);

            Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i14);

            Message.Builder getRepeatedBuilder(Builder<?> builder, int i14);

            int getRepeatedCount(Builder<?> builder);

            int getRepeatedCount(GeneratedMessageV3 generatedMessageV3);

            boolean has(Builder<?> builder);

            boolean has(GeneratedMessageV3 generatedMessageV3);

            Message.Builder newBuilder();

            void set(Builder<?> builder, Object obj);

            void setRepeated(Builder<?> builder, int i14, Object obj);
        }

        public interface OneofAccessor {
            void clear(Builder<?> builder);

            Descriptors.FieldDescriptor get(Builder<?> builder);

            Descriptors.FieldDescriptor get(GeneratedMessageV3 generatedMessageV3);

            boolean has(Builder<?> builder);

            boolean has(GeneratedMessageV3 generatedMessageV3);
        }

        public static final class RepeatedMessageFieldAccessor extends RepeatedFieldAccessor {
            private final java.lang.reflect.Method getBuilderMethodBuilder;
            private final java.lang.reflect.Method newBuilderMethod;

            public RepeatedMessageFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder", new Class[0]);
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, j.m("get", str, "Builder"), Integer.TYPE);
            }

            private Object coerceType(Object obj) {
                return this.type.isInstance(obj) ? obj : ((Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0])).mergeFrom((Message) obj).build();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                super.addRepeated(builder, coerceType(obj));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getRepeatedBuilder(Builder<?> builder, int i14) {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, builder, Integer.valueOf(i14));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder<?> builder, int i14, Object obj) {
                super.setRepeated(builder, i14, coerceType(obj));
            }
        }

        public static final class SingularMessageFieldAccessor extends SingularFieldAccessor {
            private final java.lang.reflect.Method getBuilderMethodBuilder;
            private final java.lang.reflect.Method newBuilderMethod;

            public SingularMessageFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder", new Class[0]);
                this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, j.m("get", str, "Builder"), new Class[0]);
            }

            private Object coerceType(Object obj) {
                return this.type.isInstance(obj) ? obj : ((Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0])).mergeFrom((Message) obj).buildPartial();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder<?> builder) {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, builder, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                return (Message.Builder) GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, null, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                super.set(builder, coerceType(obj));
            }
        }

        public static final class SingularStringFieldAccessor extends SingularFieldAccessor {
            private final java.lang.reflect.Method getBytesMethod;
            private final java.lang.reflect.Method setBytesMethodBuilder;

            public SingularStringFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.getBytesMethod = GeneratedMessageV3.getMethodOrDie(cls, j.m("get", str, "Bytes"), new Class[0]);
                this.setBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, j.m("set", str, "Bytes"), ByteString.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return GeneratedMessageV3.invokeOrDie(this.getBytesMethod, generatedMessageV3, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                if (obj instanceof ByteString) {
                    GeneratedMessageV3.invokeOrDie(this.setBytesMethodBuilder, builder, obj);
                } else {
                    super.set(builder, obj);
                }
            }
        }

        public FieldAccessorTable(Descriptors.Descriptor descriptor, String[] strArr) {
            this.descriptor = descriptor;
            this.camelCaseNames = strArr;
            this.fields = new FieldAccessor[descriptor.getFields().size()];
            this.oneofs = new OneofAccessor[descriptor.getOneofs().size()];
            this.initialized = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FieldAccessor getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.descriptor) {
                h.s("FieldDescriptor does not match message type.");
                return null;
            }
            if (!fieldDescriptor.isExtension()) {
                return this.fields[fieldDescriptor.getIndex()];
            }
            h.s("This type does not have extensions.");
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OneofAccessor getOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            if (oneofDescriptor.getContainingType() == this.descriptor) {
                return this.oneofs[oneofDescriptor.getIndex()];
            }
            h.s("OneofDescriptor does not match message type.");
            return null;
        }

        public FieldAccessorTable ensureFieldAccessorsInitialized(Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
            if (this.initialized) {
                return this;
            }
            synchronized (this) {
                try {
                    if (this.initialized) {
                        return this;
                    }
                    int length = this.fields.length;
                    int i14 = 0;
                    while (true) {
                        String str = null;
                        if (i14 >= length) {
                            break;
                        }
                        Descriptors.FieldDescriptor fieldDescriptor = this.descriptor.getFields().get(i14);
                        if (fieldDescriptor.getContainingOneof() != null) {
                            int index = fieldDescriptor.getContainingOneof().getIndex() + length;
                            String[] strArr = this.camelCaseNames;
                            if (index < strArr.length) {
                                str = strArr[index];
                            }
                        }
                        String str2 = str;
                        if (fieldDescriptor.isRepeated()) {
                            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                                boolean zIsMapField = fieldDescriptor.isMapField();
                                FieldAccessor[] fieldAccessorArr = this.fields;
                                if (zIsMapField) {
                                    fieldAccessorArr[i14] = new MapFieldAccessor(fieldDescriptor, cls);
                                } else {
                                    fieldAccessorArr[i14] = new RepeatedMessageFieldAccessor(fieldDescriptor, this.camelCaseNames[i14], cls, cls2);
                                }
                            } else {
                                Descriptors.FieldDescriptor.JavaType javaType = fieldDescriptor.getJavaType();
                                Descriptors.FieldDescriptor.JavaType javaType2 = Descriptors.FieldDescriptor.JavaType.ENUM;
                                FieldAccessor[] fieldAccessorArr2 = this.fields;
                                if (javaType == javaType2) {
                                    fieldAccessorArr2[i14] = new RepeatedEnumFieldAccessor(fieldDescriptor, this.camelCaseNames[i14], cls, cls2);
                                } else {
                                    fieldAccessorArr2[i14] = new RepeatedFieldAccessor(fieldDescriptor, this.camelCaseNames[i14], cls, cls2);
                                }
                            }
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            this.fields[i14] = new SingularMessageFieldAccessor(fieldDescriptor, this.camelCaseNames[i14], cls, cls2, str2);
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                            this.fields[i14] = new SingularEnumFieldAccessor(fieldDescriptor, this.camelCaseNames[i14], cls, cls2, str2);
                        } else {
                            Descriptors.FieldDescriptor.JavaType javaType3 = fieldDescriptor.getJavaType();
                            Descriptors.FieldDescriptor.JavaType javaType4 = Descriptors.FieldDescriptor.JavaType.STRING;
                            FieldAccessor[] fieldAccessorArr3 = this.fields;
                            if (javaType3 == javaType4) {
                                fieldAccessorArr3[i14] = new SingularStringFieldAccessor(fieldDescriptor, this.camelCaseNames[i14], cls, cls2, str2);
                            } else {
                                fieldAccessorArr3[i14] = new SingularFieldAccessor(fieldDescriptor, this.camelCaseNames[i14], cls, cls2, str2);
                            }
                        }
                        i14++;
                    }
                    for (int i15 = 0; i15 < this.descriptor.getOneofs().size(); i15++) {
                        int size = this.descriptor.getRealOneofs().size();
                        OneofAccessor[] oneofAccessorArr = this.oneofs;
                        if (i15 < size) {
                            oneofAccessorArr[i15] = new RealOneofAccessor(this.descriptor, i15, this.camelCaseNames[i15 + length], cls, cls2);
                        } else {
                            oneofAccessorArr[i15] = new SyntheticOneofAccessor(this.descriptor, i15);
                        }
                    }
                    this.initialized = true;
                    this.camelCaseNames = null;
                    return this;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public static class RepeatedFieldAccessor implements FieldAccessor {
            protected final MethodInvoker invoker;
            protected final Class<?> type;

            public interface MethodInvoker {
                void addRepeated(Builder<?> builder, Object obj);

                void clear(Builder<?> builder);

                Object get(Builder<?> builder);

                Object get(GeneratedMessageV3 generatedMessageV3);

                Object getRepeated(Builder<?> builder, int i14);

                Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i14);

                int getRepeatedCount(Builder<?> builder);

                int getRepeatedCount(GeneratedMessageV3 generatedMessageV3);

                void setRepeated(Builder<?> builder, int i14, Object obj);
            }

            public RepeatedFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                ReflectionInvoker reflectionInvoker = new ReflectionInvoker(fieldDescriptor, str, cls, cls2);
                this.type = reflectionInvoker.getRepeatedMethod.getReturnType();
                this.invoker = getMethodInvoker(reflectionInvoker);
            }

            public static MethodInvoker getMethodInvoker(ReflectionInvoker reflectionInvoker) {
                return reflectionInvoker;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                this.invoker.addRepeated(builder, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void clear(Builder<?> builder) {
                this.invoker.clear(builder);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder<?> builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i14) {
                return this.invoker.getRepeated(generatedMessageV3, i14);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getRepeatedBuilder(Builder<?> builder, int i14) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.getRepeatedCount(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                clear(builder);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    addRepeated(builder, it.next());
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder<?> builder, int i14, Object obj) {
                this.invoker.setRepeated(builder, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                return this.invoker.get(builder);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(Builder<?> builder, int i14) {
                return this.invoker.getRepeated(builder, i14);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(Builder<?> builder) {
                return this.invoker.getRepeatedCount(builder);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(Builder<?> builder) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            public static final class ReflectionInvoker implements MethodInvoker {
                private final java.lang.reflect.Method addRepeatedMethod;
                private final java.lang.reflect.Method clearMethod;
                private final java.lang.reflect.Method getCountMethod;
                private final java.lang.reflect.Method getCountMethodBuilder;
                private final java.lang.reflect.Method getMethod;
                private final java.lang.reflect.Method getMethodBuilder;
                private final java.lang.reflect.Method getRepeatedMethod;
                private final java.lang.reflect.Method getRepeatedMethodBuilder;
                private final java.lang.reflect.Method setRepeatedMethod;

                public ReflectionInvoker(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                    this.getMethod = GeneratedMessageV3.getMethodOrDie(cls, j.m("get", str, "List"), new Class[0]);
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, j.m("get", str, "List"), new Class[0]);
                    String strN = fb1.c.n("get", str);
                    Class cls3 = Integer.TYPE;
                    java.lang.reflect.Method methodOrDie = GeneratedMessageV3.getMethodOrDie(cls, strN, cls3);
                    this.getRepeatedMethod = methodOrDie;
                    this.getRepeatedMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, fb1.c.n("get", str), cls3);
                    Class<?> returnType = methodOrDie.getReturnType();
                    this.setRepeatedMethod = GeneratedMessageV3.getMethodOrDie(cls2, fb1.c.n("set", str), cls3, returnType);
                    this.addRepeatedMethod = GeneratedMessageV3.getMethodOrDie(cls2, fb1.c.n("add", str), returnType);
                    this.getCountMethod = GeneratedMessageV3.getMethodOrDie(cls, j.m("get", str, "Count"), new Class[0]);
                    this.getCountMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, j.m("get", str, "Count"), new Class[0]);
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, fb1.c.n("clear", str), new Class[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public void addRepeated(Builder<?> builder, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.addRepeatedMethod, builder, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public void clear(Builder<?> builder) {
                    GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object get(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, generatedMessageV3, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i14) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethod, generatedMessageV3, Integer.valueOf(i14));
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.getCountMethod, generatedMessageV3, new Object[0])).intValue();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public void setRepeated(Builder<?> builder, int i14, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.setRepeatedMethod, builder, Integer.valueOf(i14), obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object get(Builder<?> builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public Object getRepeated(Builder<?> builder, int i14) {
                    return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethodBuilder, builder, Integer.valueOf(i14));
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker
                public int getRepeatedCount(Builder<?> builder) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.getCountMethodBuilder, builder, new Object[0])).intValue();
                }
            }
        }

        public static class SingularFieldAccessor implements FieldAccessor {
            protected final Descriptors.FieldDescriptor field;
            protected final boolean hasHasMethod;
            protected final MethodInvoker invoker;
            protected final boolean isOneofField;
            protected final Class<?> type;

            public interface MethodInvoker {
                void clear(Builder<?> builder);

                Object get(Builder<?> builder);

                Object get(GeneratedMessageV3 generatedMessageV3);

                int getOneofFieldNumber(Builder<?> builder);

                int getOneofFieldNumber(GeneratedMessageV3 generatedMessageV3);

                boolean has(Builder<?> builder);

                boolean has(GeneratedMessageV3 generatedMessageV3);

                void set(Builder<?> builder, Object obj);
            }

            public SingularFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2) {
                boolean z14 = fieldDescriptor.getRealContainingOneof() != null;
                this.isOneofField = z14;
                boolean z15 = (fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.EDITIONS && fieldDescriptor.hasPresence()) || fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO2 || fieldDescriptor.hasOptionalKeyword() || (!z14 && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE);
                this.hasHasMethod = z15;
                ReflectionInvoker reflectionInvoker = new ReflectionInvoker(fieldDescriptor, str, cls, cls2, str2, z14, z15);
                this.field = fieldDescriptor;
                this.type = reflectionInvoker.getMethod.getReturnType();
                this.invoker = getMethodInvoker(reflectionInvoker);
            }

            public static MethodInvoker getMethodInvoker(ReflectionInvoker reflectionInvoker) {
                return reflectionInvoker;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void clear(Builder<?> builder) {
                this.invoker.clear(builder);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                return this.invoker.get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder<?> builder) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i14) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getRepeatedBuilder(Builder<?> builder, int i14) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                if (this.hasHasMethod) {
                    return this.invoker.has(generatedMessageV3);
                }
                if (this.isOneofField) {
                    return this.invoker.getOneofFieldNumber(generatedMessageV3) == this.field.getNumber();
                }
                return !get(generatedMessageV3).equals(this.field.getDefaultValue());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                this.invoker.set(builder, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder<?> builder, int i14, Object obj) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                return this.invoker.get(builder);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(Builder<?> builder, int i14) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(Builder<?> builder) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            public static final class ReflectionInvoker implements MethodInvoker {
                private final java.lang.reflect.Method caseMethod;
                private final java.lang.reflect.Method caseMethodBuilder;
                private final java.lang.reflect.Method clearMethod;
                private final java.lang.reflect.Method getMethod;
                private final java.lang.reflect.Method getMethodBuilder;
                private final java.lang.reflect.Method hasMethod;
                private final java.lang.reflect.Method hasMethodBuilder;
                private final java.lang.reflect.Method setMethod;

                public ReflectionInvoker(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2, boolean z14, boolean z15) {
                    java.lang.reflect.Method methodOrDie = GeneratedMessageV3.getMethodOrDie(cls, fb1.c.n("get", str), new Class[0]);
                    this.getMethod = methodOrDie;
                    this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, fb1.c.n("get", str), new Class[0]);
                    this.setMethod = GeneratedMessageV3.getMethodOrDie(cls2, fb1.c.n("set", str), methodOrDie.getReturnType());
                    this.hasMethod = z15 ? GeneratedMessageV3.getMethodOrDie(cls, fb1.c.n("has", str), new Class[0]) : null;
                    this.hasMethodBuilder = z15 ? GeneratedMessageV3.getMethodOrDie(cls2, fb1.c.n("has", str), new Class[0]) : null;
                    this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, fb1.c.n("clear", str), new Class[0]);
                    this.caseMethod = z14 ? GeneratedMessageV3.getMethodOrDie(cls, j.m("get", str2, "Case"), new Class[0]) : null;
                    this.caseMethodBuilder = z14 ? GeneratedMessageV3.getMethodOrDie(cls2, j.m("get", str2, "Case"), new Class[0]) : null;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public void clear(Builder<?> builder) {
                    GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public Object get(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethod, generatedMessageV3, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public int getOneofFieldNumber(GeneratedMessageV3 generatedMessageV3) {
                    return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public boolean has(GeneratedMessageV3 generatedMessageV3) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.hasMethod, generatedMessageV3, new Object[0])).booleanValue();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public void set(Builder<?> builder, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.setMethod, builder, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public Object get(Builder<?> builder) {
                    return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, builder, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public int getOneofFieldNumber(Builder<?> builder) {
                    return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker
                public boolean has(Builder<?> builder) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.hasMethodBuilder, builder, new Object[0])).booleanValue();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(Builder<?> builder) {
                if (!this.hasHasMethod) {
                    if (this.isOneofField) {
                        return this.invoker.getOneofFieldNumber(builder) == this.field.getNumber();
                    }
                    return !get(builder).equals(this.field.getDefaultValue());
                }
                return this.invoker.has(builder);
            }
        }

        public static class SyntheticOneofAccessor implements OneofAccessor {
            private final Descriptors.FieldDescriptor fieldDescriptor;

            public SyntheticOneofAccessor(Descriptors.Descriptor descriptor, int i14) {
                this.fieldDescriptor = descriptor.getOneofs().get(i14).getFields().get(0);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public void clear(Builder<?> builder) {
                builder.clearField(this.fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public Descriptors.FieldDescriptor get(GeneratedMessageV3 generatedMessageV3) {
                if (generatedMessageV3.hasField(this.fieldDescriptor)) {
                    return this.fieldDescriptor;
                }
                return null;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                return generatedMessageV3.hasField(this.fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public boolean has(Builder<?> builder) {
                return builder.hasField(this.fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public Descriptors.FieldDescriptor get(Builder<?> builder) {
                if (builder.hasField(this.fieldDescriptor)) {
                    return this.fieldDescriptor;
                }
                return null;
            }
        }

        public static class MapFieldAccessor implements FieldAccessor {
            private final Descriptors.FieldDescriptor field;
            private final Message mapEntryMessageDefaultInstance;

            public MapFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, Class<? extends GeneratedMessageV3> cls) {
                this.field = fieldDescriptor;
                this.mapEntryMessageDefaultInstance = getMapField((GeneratedMessageV3) GeneratedMessageV3.invokeOrDie(GeneratedMessageV3.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).getMapEntryMessageDefaultInstance();
            }

            private Message coerceType(Message message) {
                if (message == null) {
                    return null;
                }
                return this.mapEntryMessageDefaultInstance.getClass().isInstance(message) ? message : this.mapEntryMessageDefaultInstance.toBuilder().mergeFrom(message).build();
            }

            private MapFieldReflectionAccessor getMapField(GeneratedMessageV3 generatedMessageV3) {
                return generatedMessageV3.internalGetMapFieldReflection(this.field.getNumber());
            }

            private MapFieldReflectionAccessor getMutableMapField(Builder<?> builder) {
                return builder.internalGetMutableMapFieldReflection(this.field.getNumber());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                getMutableMapField(builder).getMutableList().add(coerceType((Message) obj));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void clear(Builder<?> builder) {
                getMutableMapField(builder).getMutableList().clear();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < getRepeatedCount(generatedMessageV3); i14++) {
                    arrayList.add(getRepeated(generatedMessageV3, i14));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getBuilder(Builder<?> builder) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRaw(GeneratedMessageV3 generatedMessageV3) {
                return get(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i14) {
                return getMapField(generatedMessageV3).getList().get(i14);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder getRepeatedBuilder(Builder<?> builder, int i14) {
                throw new UnsupportedOperationException("Map fields cannot be repeated");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(GeneratedMessageV3 generatedMessageV3) {
                return getMapField(generatedMessageV3).getList().size();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Message.Builder newBuilder() {
                return this.mapEntryMessageDefaultInstance.newBuilderForType();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                clear(builder);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    addRepeated(builder, it.next());
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder<?> builder, int i14, Object obj) {
                getMutableMapField(builder).getMutableList().set(i14, coerceType((Message) obj));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public boolean has(Builder<?> builder) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            private MapFieldReflectionAccessor getMapField(Builder<?> builder) {
                return builder.internalGetMapFieldReflection(this.field.getNumber());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(Builder<?> builder, int i14) {
                return getMapField(builder).getList().get(i14);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public int getRepeatedCount(Builder<?> builder) {
                return getMapField(builder).getList().size();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < getRepeatedCount(builder); i14++) {
                    arrayList.add(getRepeated(builder, i14));
                }
                return Collections.unmodifiableList(arrayList);
            }
        }

        public static class RealOneofAccessor implements OneofAccessor {
            private final java.lang.reflect.Method caseMethod;
            private final java.lang.reflect.Method caseMethodBuilder;
            private final java.lang.reflect.Method clearMethod;
            private final Descriptors.Descriptor descriptor;

            public RealOneofAccessor(Descriptors.Descriptor descriptor, int i14, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                this.descriptor = descriptor;
                this.caseMethod = GeneratedMessageV3.getMethodOrDie(cls, j.m("get", str, "Case"), new Class[0]);
                this.caseMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, j.m("get", str, "Case"), new Class[0]);
                this.clearMethod = GeneratedMessageV3.getMethodOrDie(cls2, fb1.c.n("clear", str), new Class[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public void clear(Builder<?> builder) {
                GeneratedMessageV3.invokeOrDie(this.clearMethod, builder, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public Descriptors.FieldDescriptor get(GeneratedMessageV3 generatedMessageV3) {
                int number = ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber();
                if (number > 0) {
                    return this.descriptor.findFieldByNumber(number);
                }
                return null;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public boolean has(GeneratedMessageV3 generatedMessageV3) {
                return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethod, generatedMessageV3, new Object[0])).getNumber() != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public boolean has(Builder<?> builder) {
                return ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber() != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.OneofAccessor
            public Descriptors.FieldDescriptor get(Builder<?> builder) {
                int number = ((Internal.EnumLite) GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, builder, new Object[0])).getNumber();
                if (number > 0) {
                    return this.descriptor.findFieldByNumber(number);
                }
                return null;
            }
        }

        public static final class RepeatedEnumFieldAccessor extends RepeatedFieldAccessor {
            private java.lang.reflect.Method addRepeatedValueMethod;
            private final Descriptors.EnumDescriptor enumDescriptor;
            private java.lang.reflect.Method getRepeatedValueMethod;
            private java.lang.reflect.Method getRepeatedValueMethodBuilder;
            private final java.lang.reflect.Method getValueDescriptorMethod;
            private java.lang.reflect.Method setRepeatedValueMethod;
            private final boolean supportUnknownEnumValue;
            private final java.lang.reflect.Method valueOfMethod;

            public RepeatedEnumFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.enumDescriptor = fieldDescriptor.getEnumType();
                this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, CoreConstants.VALUE_OF, Descriptors.EnumValueDescriptor.class);
                this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor", new Class[0]);
                boolean zLegacyEnumFieldTreatedAsClosed = fieldDescriptor.legacyEnumFieldTreatedAsClosed();
                this.supportUnknownEnumValue = !zLegacyEnumFieldTreatedAsClosed;
                if (zLegacyEnumFieldTreatedAsClosed) {
                    return;
                }
                String strM = j.m("get", str, "Value");
                Class cls3 = Integer.TYPE;
                this.getRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls, strM, cls3);
                this.getRepeatedValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, j.m("get", str, "Value"), cls3);
                this.setRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, j.m("set", str, "Value"), cls3, cls3);
                this.addRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, j.m("add", str, "Value"), cls3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void addRepeated(Builder<?> builder, Object obj) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.addRepeatedValueMethod, builder, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.addRepeated(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, null, obj));
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(generatedMessageV3);
                for (int i14 = 0; i14 < repeatedCount; i14++) {
                    arrayList.add(getRepeated(generatedMessageV3, i14));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(GeneratedMessageV3 generatedMessageV3, int i14) {
                if (!this.supportUnknownEnumValue) {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(generatedMessageV3, i14), new Object[0]);
                }
                return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethod, generatedMessageV3, Integer.valueOf(i14))).intValue());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void setRepeated(Builder<?> builder, int i14, Object obj) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.setRepeatedValueMethod, builder, Integer.valueOf(i14), Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.setRepeated(builder, i14, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, null, obj));
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(builder);
                for (int i14 = 0; i14 < repeatedCount; i14++) {
                    arrayList.add(getRepeated(builder, i14));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object getRepeated(Builder<?> builder, int i14) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethodBuilder, builder, Integer.valueOf(i14))).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(builder, i14), new Object[0]);
            }
        }

        public FieldAccessorTable(Descriptors.Descriptor descriptor, String[] strArr, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2) {
            this(descriptor, strArr);
            ensureFieldAccessorsInitialized(cls, cls2);
        }

        public static final class SingularEnumFieldAccessor extends SingularFieldAccessor {
            private final Descriptors.EnumDescriptor enumDescriptor;
            private final java.lang.reflect.Method getValueDescriptorMethod;
            private java.lang.reflect.Method getValueMethod;
            private java.lang.reflect.Method getValueMethodBuilder;
            private java.lang.reflect.Method setValueMethod;
            private final boolean supportUnknownEnumValue;
            private final java.lang.reflect.Method valueOfMethod;

            public SingularEnumFieldAccessor(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends Builder<?>> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.enumDescriptor = fieldDescriptor.getEnumType();
                this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, CoreConstants.VALUE_OF, Descriptors.EnumValueDescriptor.class);
                this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor", new Class[0]);
                boolean zLegacyEnumFieldTreatedAsClosed = fieldDescriptor.legacyEnumFieldTreatedAsClosed();
                this.supportUnknownEnumValue = !zLegacyEnumFieldTreatedAsClosed;
                if (zLegacyEnumFieldTreatedAsClosed) {
                    return;
                }
                this.getValueMethod = GeneratedMessageV3.getMethodOrDie(cls, j.m("get", str, "Value"), new Class[0]);
                this.getValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(cls2, j.m("get", str, "Value"), new Class[0]);
                this.setValueMethod = GeneratedMessageV3.getMethodOrDie(cls2, j.m("set", str, "Value"), Integer.TYPE);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(GeneratedMessageV3 generatedMessageV3) {
                if (!this.supportUnknownEnumValue) {
                    return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(generatedMessageV3), new Object[0]);
                }
                return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getValueMethod, generatedMessageV3, new Object[0])).intValue());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public void set(Builder<?> builder, Object obj) {
                if (this.supportUnknownEnumValue) {
                    GeneratedMessageV3.invokeOrDie(this.setValueMethod, builder, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.set(builder, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, null, obj));
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor, com.google.protobuf.GeneratedMessageV3.FieldAccessorTable.FieldAccessor
            public Object get(Builder<?> builder) {
                if (this.supportUnknownEnumValue) {
                    return this.enumDescriptor.findValueByNumberCreatingIfUnknown(((Integer) GeneratedMessageV3.invokeOrDie(this.getValueMethodBuilder, builder, new Object[0])).intValue());
                }
                return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(builder), new Object[0]);
            }
        }
    }

    public static Internal.LongList mutableCopy(Internal.LongList longList) {
        return (Internal.LongList) makeMutableCopy(longList);
    }

    public static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        return (Internal.FloatList) makeMutableCopy(floatList);
    }

    public static abstract class ExtendableMessage<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessageV3 implements ExtendableMessageOrBuilder<MessageT> {
        private static final long serialVersionUID = 1;
        private final FieldSet<Descriptors.FieldDescriptor> extensions;

        public class ExtensionWriter {
            private final Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<Descriptors.FieldDescriptor, Object> next;

            private ExtensionWriter(boolean z14) {
                Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> it = ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = it.next();
                }
                this.messageSetWireFormat = z14;
            }

            public void writeUntil(int i14, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<Descriptors.FieldDescriptor, Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i14) {
                        return;
                    }
                    Descriptors.FieldDescriptor key = this.next.getKey();
                    if (!this.messageSetWireFormat || key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated()) {
                        FieldSet.writeField(key, this.next.getValue(), codedOutputStream);
                    } else if (this.next instanceof LazyField.LazyEntry) {
                        codedOutputStream.writeRawMessageSetExtension(key.getNumber(), ((LazyField.LazyEntry) this.next).getField().toByteString());
                    } else {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (Message) this.next.getValue());
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.extensions = FieldSet.newFieldSet();
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() == getDescriptorForType()) {
                return;
            }
            h.s("FieldDescriptor does not match message type.");
        }

        private void verifyExtensionContainingType(Extension<MessageT, ?> extension) {
            if (extension.getDescriptor().getContainingType() == getDescriptorForType()) {
                return;
            }
            j.w(extension.getDescriptor().getContainingType().getFullName(), "\" which does not match message type \"", getDescriptorForType().getFullName(), "\".", "Extension is for type \"");
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(ExtensionLite<MessageT, T> extensionLite) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            Descriptors.FieldDescriptor descriptor = extensionCheckNotLite.getDescriptor();
            Object field = this.extensions.getField(descriptor);
            if (field != null) {
                return (T) extensionCheckNotLite.fromReflectionType(field);
            }
            if (descriptor.isRepeated()) {
                return (T) Collections.EMPTY_LIST;
            }
            return descriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? (T) extensionCheckNotLite.getMessageDefaultInstance() : (T) extensionCheckNotLite.fromReflectionType(descriptor.getDefaultValue());
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> int getExtensionCount(ExtensionLite<MessageT, List<T>> extensionLite) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            return this.extensions.getRepeatedFieldCount(extensionCheckNotLite.getDescriptor());
        }

        public Map<Descriptors.FieldDescriptor, Object> getExtensionFields() {
            return this.extensions.getAllFields();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            Object field = this.extensions.getField(fieldDescriptor);
            if (field != null) {
                return field;
            }
            if (fieldDescriptor.isRepeated()) {
                return Collections.EMPTY_LIST;
            }
            return fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedField(fieldDescriptor, i14);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.getRepeatedField(fieldDescriptor, i14);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldCount(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.getRepeatedFieldCount(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> boolean hasExtension(ExtensionLite<MessageT, T> extensionLite) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            return this.extensions.hasField(extensionCheckNotLite.getDescriptor());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.hasField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.hasField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        public ExtendableMessage<MessageT>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(false);
        }

        public ExtendableMessage<MessageT>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(true);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public boolean parseUnknownField(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i14) {
            if (codedInputStream.shouldDiscardUnknownFields()) {
                builder = null;
            }
            return MessageReflection.mergeFieldFrom(codedInputStream, builder, extensionRegistryLite, getDescriptorForType(), new MessageReflection.ExtensionAdapter(this.extensions), i14);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public boolean parseUnknownFieldProto3(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, int i14) {
            return parseUnknownField(codedInputStream, builder, extensionRegistryLite, i14);
        }

        public ExtendableMessage(ExtendableBuilder<MessageT, ?> extendableBuilder) {
            super(extendableBuilder);
            this.extensions = extendableBuilder.buildExtensions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> int getExtensionCount(Extension<MessageT, List<T>> extension) {
            return getExtensionCount((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> boolean hasExtension(Extension<MessageT, T> extension) {
            return hasExtension((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> int getExtensionCount(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension) {
            return getExtensionCount((ExtensionLite) generatedExtension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> boolean hasExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension) {
            return hasExtension((ExtensionLite) generatedExtension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(ExtensionLite<MessageT, List<T>> extensionLite, int i14) {
            Extension<MessageT, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(extensionLite);
            verifyExtensionContainingType(extensionCheckNotLite);
            return (T) extensionCheckNotLite.singularFromReflectionType(this.extensions.getRepeatedField(extensionCheckNotLite.getDescriptor(), i14));
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(Extension<MessageT, T> extension) {
            return (T) getExtension((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension) {
            return (T) getExtension((ExtensionLite) generatedExtension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(Extension<MessageT, List<T>> extension, int i14) {
            return (T) getExtension((ExtensionLite) extension, i14);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        public final <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension, int i14) {
            return (T) getExtension((ExtensionLite) generatedExtension, i14);
        }
    }

    public static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        return (Internal.DoubleList) makeMutableCopy(doubleList);
    }

    public GeneratedMessageV3(Builder<?> builder) {
        this.unknownFields = builder.getUnknownFields();
    }

    public static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        return (Internal.BooleanList) makeMutableCopy(booleanList);
    }

    public static <M extends Message> M parseDelimitedWithIOException(Parser<M> parser, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            return parser.parseDelimitedFrom(inputStream, extensionRegistryLite);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(Parser<M> parser, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            return parser.parseFrom(inputStream, extensionRegistryLite);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(Parser<M> parser, CodedInputStream codedInputStream) throws IOException {
        try {
            return parser.parseFrom(codedInputStream);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.unwrapIOException();
        }
    }

    public static <ListT extends Internal.ProtobufList<?>> ListT makeMutableCopy(ListT listt) {
        return (ListT) makeMutableCopy(listt, 0);
    }

    public static <M extends Message> M parseWithIOException(Parser<M> parser, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            return parser.parseFrom(codedInputStream, extensionRegistryLite);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.unwrapIOException();
        }
    }
}
