package com.huawei.basichealthmodel.devicelink.pbjava.request;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public final class HealthModelRequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Descriptors.Descriptor f5332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Descriptors.FileDescriptor f5333b = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011requestBody.proto\u00125com.huawei.basichealthmodel.devicelink.pbjava.request\"_\n\u000bRequestBody\u0012\u0011\n\trecordDay\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000erequestTaskIds\u0018\u0002 \u0001(\t\u0012\u0010\n\bpageSize\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bpackageSize\u0018\u0004 \u0001(\u0005B\u0018B\u0016HealthModelRequestBodyb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final GeneratedMessageV3.FieldAccessorTable f5334c;

    public interface RequestBodyOrBuilder extends MessageOrBuilder {
        int getPackageSize();

        int getPageSize();

        int getRecordDay();

        String getRequestTaskIds();

        ByteString getRequestTaskIdsBytes();
    }

    public static final class c extends GeneratedMessageV3 implements RequestBodyOrBuilder {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f5336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5337b;
        private byte e;
        private volatile Object g;
        private int h;
        private static final c d = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Parser<c> f5335c = new AbstractParser<c>() { // from class: com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.c.1
            @Override // com.google.protobuf.Parser
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new c(codedInputStream, extensionRegistryLite);
            }
        };

        private c(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.e = (byte) -1;
        }

        private c() {
            this.e = (byte) -1;
            this.g = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new c();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.h = codedInputStream.readInt32();
                            } else if (tag == 18) {
                                this.g = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 24) {
                                this.f5337b = codedInputStream.readInt32();
                            } else if (tag == 32) {
                                this.f5336a = codedInputStream.readInt32();
                            } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor b() {
            return HealthModelRequestBody.f5332a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HealthModelRequestBody.f5334c.ensureFieldAccessorsInitialized(c.class, d.class);
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
        public int getRecordDay() {
            return this.h;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
        public String getRequestTaskIds() {
            Object obj = this.g;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.g = stringUtf8;
            return stringUtf8;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
        public ByteString getRequestTaskIdsBytes() {
            Object obj = this.g;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.g = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
        public int getPageSize() {
            return this.f5337b;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
        public int getPackageSize() {
            return this.f5336a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.h;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            if (!getRequestTaskIdsBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.g);
            }
            int i2 = this.f5337b;
            if (i2 != 0) {
                codedOutputStream.writeInt32(3, i2);
            }
            int i3 = this.f5336a;
            if (i3 != 0) {
                codedOutputStream.writeInt32(4, i3);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.h;
            int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
            if (!getRequestTaskIdsBytes().isEmpty()) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(2, this.g);
            }
            int i3 = this.f5337b;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i3);
            }
            int i4 = this.f5336a;
            if (i4 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i4);
            }
            int serializedSize = iComputeInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return super.equals(obj);
            }
            c cVar = (c) obj;
            return getRecordDay() == cVar.getRecordDay() && getRequestTaskIds().equals(cVar.getRequestTaskIds()) && getPageSize() == cVar.getPageSize() && getPackageSize() == cVar.getPackageSize() && this.unknownFields.equals(cVar.unknownFields);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = b().hashCode();
            int recordDay = getRecordDay();
            int iHashCode2 = getRequestTaskIds().hashCode();
            int pageSize = ((((((((((((((((((iHashCode + 779) * 37) + 1) * 53) + recordDay) * 37) + 2) * 53) + iHashCode2) * 37) + 3) * 53) + getPageSize()) * 37) + 4) * 53) + getPackageSize()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = pageSize;
            return pageSize;
        }

        public static c a(ByteString byteString) throws InvalidProtocolBufferException {
            return f5335c.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public d newBuilderForType() {
            return c();
        }

        public static d c() {
            return d.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d toBuilder() {
            return this == d ? new d() : new d().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public d newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new d(builderParent);
        }

        public static final class d extends GeneratedMessageV3.Builder<d> implements RequestBodyOrBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f5338a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f5339b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f5340c;
            private int e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HealthModelRequestBody.f5334c.ensureFieldAccessorsInitialized(c.class, d.class);
            }

            private d() {
                this.f5340c = "";
                f();
            }

            private d(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f5340c = "";
                f();
            }

            private void f() {
                boolean unused = c.alwaysUseFieldBuilders;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public d clear() {
                super.clear();
                this.e = 0;
                this.f5340c = "";
                this.f5339b = 0;
                this.f5338a = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return HealthModelRequestBody.f5332a;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return c.d();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarBuildPartial = buildPartial();
                if (cVarBuildPartial.isInitialized()) {
                    return cVarBuildPartial;
                }
                throw newUninitializedMessageException((Message) cVarBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c buildPartial() {
                c cVar = new c(this);
                cVar.h = this.e;
                cVar.g = this.f5340c;
                cVar.f5337b = this.f5339b;
                cVar.f5336a = this.f5338a;
                onBuilt();
                return cVar;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d mo799clone() {
                return (d) super.mo799clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (d) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public d clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (d) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (d) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public d setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (d) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (d) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d mergeFrom(Message message) {
                if (message instanceof c) {
                    return a((c) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public d a(c cVar) {
                if (cVar == c.d()) {
                    return this;
                }
                if (cVar.getRecordDay() != 0) {
                    b(cVar.getRecordDay());
                }
                if (!cVar.getRequestTaskIds().isEmpty()) {
                    this.f5340c = cVar.g;
                    onChanged();
                }
                if (cVar.getPageSize() != 0) {
                    c(cVar.getPageSize());
                }
                if (cVar.getPackageSize() != 0) {
                    e(cVar.getPackageSize());
                }
                mergeUnknownFields(cVar.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public d mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                c cVar;
                try {
                    try {
                        c cVar2 = (c) c.f5335c.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (cVar2 != null) {
                            a(cVar2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        cVar = (c) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (cVar != null) {
                                a(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar = null;
                    if (cVar != null) {
                        a(cVar);
                    }
                    throw th;
                }
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
            public int getRecordDay() {
                return this.e;
            }

            public d b(int i) {
                this.e = i;
                onChanged();
                return this;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
            public String getRequestTaskIds() {
                Object obj = this.f5340c;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f5340c = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
            public ByteString getRequestTaskIdsBytes() {
                Object obj = this.f5340c;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.f5340c = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
            public int getPageSize() {
                return this.f5339b;
            }

            public d c(int i) {
                this.f5339b = i;
                onChanged();
                return this;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody.RequestBodyOrBuilder
            public int getPackageSize() {
                return this.f5338a;
            }

            public d e(int i) {
                this.f5338a = i;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final d setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (d) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (d) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static c d() {
            return d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<c> getParserForType() {
            return f5335c;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c getDefaultInstanceForType() {
            return d;
        }
    }

    public static Descriptors.FileDescriptor e() {
        return f5333b;
    }

    static {
        Descriptors.Descriptor descriptor = e().getMessageTypes().get(0);
        f5332a = descriptor;
        f5334c = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"RecordDay", "RequestTaskIds", "PageSize", "PackageSize"});
    }
}
