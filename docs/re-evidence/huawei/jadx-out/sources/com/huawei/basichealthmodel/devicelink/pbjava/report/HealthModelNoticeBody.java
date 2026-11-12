package com.huawei.basichealthmodel.devicelink.pbjava.report;

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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class HealthModelNoticeBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final GeneratedMessageV3.FieldAccessorTable f5298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Descriptors.Descriptor f5299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final GeneratedMessageV3.FieldAccessorTable f5300c;
    private static Descriptors.FileDescriptor d = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fnotice.proto\u00124com.huawei.basichealthmodel.devicelink.pbjava.report\"¾\u0001\n\nNoticeBody\u0012^\n\u0007notices\u0018\u0001 \u0003(\u000b2M.com.huawei.basichealthmodel.devicelink.pbjava.report.NoticeBody.ReportNotice\u001aP\n\fReportNotice\u0012\u0011\n\trecordDay\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006taskId\u0018\u0002 \u0001(\u0005\u0012\u0010\n\btaskName\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003msg\u0018\u0004 \u0001(\tB\u0017B\u0015HealthModelNoticeBodyb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor e;

    public interface NoticeBodyOrBuilder extends MessageOrBuilder {
        NoticeBody.c getNotices(int i);

        int getNoticesCount();

        List<NoticeBody.c> getNoticesList();

        NoticeBody.ReportNoticeOrBuilder getNoticesOrBuilder(int i);

        List<? extends NoticeBody.ReportNoticeOrBuilder> getNoticesOrBuilderList();
    }

    public static final class NoticeBody extends GeneratedMessageV3 implements NoticeBodyOrBuilder {
        private static final NoticeBody d = new NoticeBody();
        private static final Parser<NoticeBody> e = new AbstractParser<NoticeBody>() { // from class: com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.5
            @Override // com.google.protobuf.Parser
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public NoticeBody parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new NoticeBody(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte f5301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<c> f5302b;

        public interface ReportNoticeOrBuilder extends MessageOrBuilder {
            String getMsg();

            ByteString getMsgBytes();

            int getRecordDay();

            int getTaskId();

            String getTaskName();

            ByteString getTaskNameBytes();
        }

        private NoticeBody(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f5301a = (byte) -1;
        }

        private NoticeBody() {
            this.f5301a = (byte) -1;
            this.f5302b = Collections.EMPTY_LIST;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new NoticeBody();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private NoticeBody(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    if (!z2) {
                                        this.f5302b = new ArrayList();
                                        z2 = true;
                                    }
                                    this.f5302b.add((c) codedInputStream.readMessage(c.h(), extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.setUnfinishedMessage(this);
                        }
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.f5302b = Collections.unmodifiableList(this.f5302b);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.f5302b = Collections.unmodifiableList(this.f5302b);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor b() {
            return HealthModelNoticeBody.f5299b;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HealthModelNoticeBody.f5300c.ensureFieldAccessorsInitialized(NoticeBody.class, d.class);
        }

        public static final class c extends GeneratedMessageV3 implements ReportNoticeOrBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final c f5303a = new c();
            private static final Parser<c> e = new AbstractParser<c>() { // from class: com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.c.3
                @Override // com.google.protobuf.Parser
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new c(codedInputStream, extensionRegistryLite);
                }
            };
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private volatile Object f5304b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f5305c;
            private byte d;
            private volatile Object g;
            private int h;

            private c(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.d = (byte) -1;
            }

            private c() {
                this.d = (byte) -1;
                this.g = "";
                this.f5304b = "";
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
                                    this.f5305c = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.h = codedInputStream.readInt32();
                                } else if (tag == 26) {
                                    this.g = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 34) {
                                    this.f5304b = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.setUnfinishedMessage(this);
                        } catch (IOException e3) {
                            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

            public static final Descriptors.Descriptor c() {
                return HealthModelNoticeBody.e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HealthModelNoticeBody.f5298a.ensureFieldAccessorsInitialized(c.class, a.class);
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
            public int getRecordDay() {
                return this.f5305c;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
            public int getTaskId() {
                return this.h;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
            public String getTaskName() {
                Object obj = this.g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.g = stringUtf8;
                return stringUtf8;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
            public ByteString getTaskNameBytes() {
                Object obj = this.g;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.g = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
            public String getMsg() {
                Object obj = this.f5304b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f5304b = stringUtf8;
                return stringUtf8;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
            public ByteString getMsgBytes() {
                Object obj = this.f5304b;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.f5304b = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b2 = this.d;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.d = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i = this.f5305c;
                if (i != 0) {
                    codedOutputStream.writeInt32(1, i);
                }
                int i2 = this.h;
                if (i2 != 0) {
                    codedOutputStream.writeInt32(2, i2);
                }
                if (!getTaskNameBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.g);
                }
                if (!getMsgBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.f5304b);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = this.f5305c;
                int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
                int i3 = this.h;
                if (i3 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
                }
                if (!getTaskNameBytes().isEmpty()) {
                    iComputeInt32Size += GeneratedMessageV3.computeStringSize(3, this.g);
                }
                if (!getMsgBytes().isEmpty()) {
                    iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.f5304b);
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
                return getRecordDay() == cVar.getRecordDay() && getTaskId() == cVar.getTaskId() && getTaskName().equals(cVar.getTaskName()) && getMsg().equals(cVar.getMsg()) && this.unknownFields.equals(cVar.unknownFields);
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int iHashCode = c().hashCode();
                int recordDay = getRecordDay();
                int taskId = getTaskId();
                int iHashCode2 = ((((((((((((((((((iHashCode + 779) * 37) + 1) * 53) + recordDay) * 37) + 2) * 53) + taskId) * 37) + 3) * 53) + getTaskName().hashCode()) * 37) + 4) * 53) + getMsg().hashCode()) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public a newBuilderForType() {
                return d();
            }

            public static a d() {
                return f5303a.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public a toBuilder() {
                return this == f5303a ? new a() : new a().b(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new a(builderParent);
            }

            public static final class a extends GeneratedMessageV3.Builder<a> implements ReportNoticeOrBuilder {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private Object f5306a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f5307b;
                private int d;
                private Object e;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return HealthModelNoticeBody.f5298a.ensureFieldAccessorsInitialized(c.class, a.class);
                }

                private a() {
                    this.e = "";
                    this.f5306a = "";
                    f();
                }

                private a(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.e = "";
                    this.f5306a = "";
                    f();
                }

                private void f() {
                    boolean unused = c.alwaysUseFieldBuilders;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a clear() {
                    super.clear();
                    this.f5307b = 0;
                    this.d = 0;
                    this.e = "";
                    this.f5306a = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return HealthModelNoticeBody.e;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public c getDefaultInstanceForType() {
                    return c.b();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw newUninitializedMessageException((Message) cVarBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c buildPartial() {
                    c cVar = new c(this);
                    cVar.f5305c = this.f5307b;
                    cVar.h = this.d;
                    cVar.g = this.e;
                    cVar.f5304b = this.f5306a;
                    onBuilt();
                    return cVar;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public a mo799clone() {
                    return (a) super.mo799clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public a setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (a) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public a clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (a) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public a clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (a) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public a setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (a) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public a addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (a) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public a mergeFrom(Message message) {
                    if (message instanceof c) {
                        return b((c) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public a b(c cVar) {
                    if (cVar == c.b()) {
                        return this;
                    }
                    if (cVar.getRecordDay() != 0) {
                        a(cVar.getRecordDay());
                    }
                    if (cVar.getTaskId() != 0) {
                        c(cVar.getTaskId());
                    }
                    if (!cVar.getTaskName().isEmpty()) {
                        this.e = cVar.g;
                        onChanged();
                    }
                    if (!cVar.getMsg().isEmpty()) {
                        this.f5306a = cVar.f5304b;
                        onChanged();
                    }
                    mergeUnknownFields(cVar.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    c cVar;
                    try {
                        try {
                            c cVar2 = (c) c.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (cVar2 != null) {
                                b(cVar2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            cVar = (c) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                if (cVar != null) {
                                    b(cVar);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cVar = null;
                        if (cVar != null) {
                            b(cVar);
                        }
                        throw th;
                    }
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
                public int getRecordDay() {
                    return this.f5307b;
                }

                public a a(int i) {
                    this.f5307b = i;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
                public int getTaskId() {
                    return this.d;
                }

                public a c(int i) {
                    this.d = i;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
                public String getTaskName() {
                    Object obj = this.e;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.e = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
                public ByteString getTaskNameBytes() {
                    Object obj = this.e;
                    if (obj instanceof String) {
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.e = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                public a d(String str) {
                    str.getClass();
                    this.e = str;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
                public String getMsg() {
                    Object obj = this.f5306a;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.f5306a = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBody.ReportNoticeOrBuilder
                public ByteString getMsgBytes() {
                    Object obj = this.f5306a;
                    if (obj instanceof String) {
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.f5306a = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                public a e(String str) {
                    str.getClass();
                    this.f5306a = str;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public final a setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (a) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (a) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static c b() {
                return f5303a;
            }

            public static Parser<c> h() {
                return e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<c> getParserForType() {
                return e;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return f5303a;
            }
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
        public List<c> getNoticesList() {
            return this.f5302b;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
        public List<? extends ReportNoticeOrBuilder> getNoticesOrBuilderList() {
            return this.f5302b;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
        public int getNoticesCount() {
            return this.f5302b.size();
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
        public c getNotices(int i) {
            return this.f5302b.get(i);
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
        public ReportNoticeOrBuilder getNoticesOrBuilder(int i) {
            return this.f5302b.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.f5301a;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f5301a = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f5302b.size(); i++) {
                codedOutputStream.writeMessage(1, this.f5302b.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.f5302b.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f5302b.get(i2));
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NoticeBody)) {
                return super.equals(obj);
            }
            NoticeBody noticeBody = (NoticeBody) obj;
            return getNoticesList().equals(noticeBody.getNoticesList()) && this.unknownFields.equals(noticeBody.unknownFields);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = b().hashCode() + 779;
            if (getNoticesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getNoticesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public d newBuilderForType() {
            return i();
        }

        public static d i() {
            return d.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d toBuilder() {
            return this == d ? new d() : new d().b(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new d(builderParent);
        }

        public static final class d extends GeneratedMessageV3.Builder<d> implements NoticeBodyOrBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> f5308a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List<c> f5309b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f5310c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HealthModelNoticeBody.f5300c.ensureFieldAccessorsInitialized(NoticeBody.class, d.class);
            }

            private d() {
                this.f5309b = Collections.EMPTY_LIST;
                i();
            }

            private d(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f5309b = Collections.EMPTY_LIST;
                i();
            }

            private void i() {
                if (NoticeBody.alwaysUseFieldBuilders) {
                    g();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public d clear() {
                super.clear();
                RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> repeatedFieldBuilderV3 = this.f5308a;
                if (repeatedFieldBuilderV3 == null) {
                    this.f5309b = Collections.EMPTY_LIST;
                    this.f5310c &= -2;
                    return this;
                }
                repeatedFieldBuilderV3.clear();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return HealthModelNoticeBody.f5299b;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public NoticeBody getDefaultInstanceForType() {
                return NoticeBody.e();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public NoticeBody build() {
                NoticeBody noticeBodyBuildPartial = buildPartial();
                if (noticeBodyBuildPartial.isInitialized()) {
                    return noticeBodyBuildPartial;
                }
                throw newUninitializedMessageException((Message) noticeBodyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public NoticeBody buildPartial() {
                NoticeBody noticeBody = new NoticeBody(this);
                int i = this.f5310c;
                RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> repeatedFieldBuilderV3 = this.f5308a;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i & 1) != 0) {
                        this.f5309b = Collections.unmodifiableList(this.f5309b);
                        this.f5310c &= -2;
                    }
                    noticeBody.f5302b = this.f5309b;
                } else {
                    noticeBody.f5302b = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return noticeBody;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d mo799clone() {
                return (d) super.mo799clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (d) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (d) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (d) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (d) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (d) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public d mergeFrom(Message message) {
                if (message instanceof NoticeBody) {
                    return b((NoticeBody) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public d b(NoticeBody noticeBody) {
                if (noticeBody == NoticeBody.e()) {
                    return this;
                }
                if (this.f5308a == null) {
                    if (!noticeBody.f5302b.isEmpty()) {
                        if (this.f5309b.isEmpty()) {
                            this.f5309b = noticeBody.f5302b;
                            this.f5310c &= -2;
                        } else {
                            h();
                            this.f5309b.addAll(noticeBody.f5302b);
                        }
                        onChanged();
                    }
                } else if (!noticeBody.f5302b.isEmpty()) {
                    if (!this.f5308a.isEmpty()) {
                        this.f5308a.addAllMessages(noticeBody.f5302b);
                    } else {
                        this.f5308a.dispose();
                        this.f5308a = null;
                        this.f5309b = noticeBody.f5302b;
                        this.f5310c &= -2;
                        this.f5308a = NoticeBody.alwaysUseFieldBuilders ? g() : null;
                    }
                }
                mergeUnknownFields(noticeBody.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public d mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                NoticeBody noticeBody;
                try {
                    try {
                        NoticeBody noticeBody2 = (NoticeBody) NoticeBody.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (noticeBody2 != null) {
                            b(noticeBody2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        noticeBody = (NoticeBody) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (noticeBody != null) {
                                b(noticeBody);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    noticeBody = null;
                    if (noticeBody != null) {
                        b(noticeBody);
                    }
                    throw th;
                }
            }

            private void h() {
                if ((this.f5310c & 1) == 0) {
                    this.f5309b = new ArrayList(this.f5309b);
                    this.f5310c |= 1;
                }
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
            public List<c> getNoticesList() {
                RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> repeatedFieldBuilderV3 = this.f5308a;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.f5309b);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
            public int getNoticesCount() {
                RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> repeatedFieldBuilderV3 = this.f5308a;
                if (repeatedFieldBuilderV3 == null) {
                    return this.f5309b.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
            public c getNotices(int i) {
                RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> repeatedFieldBuilderV3 = this.f5308a;
                if (repeatedFieldBuilderV3 == null) {
                    return this.f5309b.get(i);
                }
                return (c) repeatedFieldBuilderV3.getMessage(i);
            }

            public d b(int i, c cVar) {
                RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> repeatedFieldBuilderV3 = this.f5308a;
                if (repeatedFieldBuilderV3 == null) {
                    cVar.getClass();
                    h();
                    this.f5309b.add(i, cVar);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i, cVar);
                return this;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
            public ReportNoticeOrBuilder getNoticesOrBuilder(int i) {
                RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> repeatedFieldBuilderV3 = this.f5308a;
                if (repeatedFieldBuilderV3 == null) {
                    return this.f5309b.get(i);
                }
                return (ReportNoticeOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody.NoticeBodyOrBuilder
            public List<? extends ReportNoticeOrBuilder> getNoticesOrBuilderList() {
                RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> repeatedFieldBuilderV3 = this.f5308a;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.f5309b);
            }

            private RepeatedFieldBuilderV3<c, c.a, ReportNoticeOrBuilder> g() {
                if (this.f5308a == null) {
                    this.f5308a = new RepeatedFieldBuilderV3<>(this.f5309b, (this.f5310c & 1) != 0, getParentForChildren(), isClean());
                    this.f5309b = null;
                }
                return this.f5308a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final d setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (d) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (d) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static NoticeBody e() {
            return d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NoticeBody> getParserForType() {
            return e;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NoticeBody getDefaultInstanceForType() {
            return d;
        }
    }

    public static Descriptors.FileDescriptor c() {
        return d;
    }

    static {
        Descriptors.Descriptor descriptor = c().getMessageTypes().get(0);
        f5299b = descriptor;
        f5300c = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Notices"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        e = descriptor2;
        f5298a = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"RecordDay", "TaskId", "TaskName", "Msg"});
    }
}
