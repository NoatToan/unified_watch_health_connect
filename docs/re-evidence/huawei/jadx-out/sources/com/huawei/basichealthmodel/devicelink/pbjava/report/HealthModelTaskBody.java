package com.huawei.basichealthmodel.devicelink.pbjava.report;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class HealthModelTaskBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final GeneratedMessageV3.FieldAccessorTable f5311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final GeneratedMessageV3.FieldAccessorTable f5312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Descriptors.Descriptor f5313c;
    private static final Descriptors.Descriptor d;
    private static Descriptors.FileDescriptor e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\ntask.proto\u00124com.huawei.basichealthmodel.devicelink.pbjava.report\"\u0093\u0004\n\bTaskBody\u0012\u0012\n\nresultCode\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tresultDes\u0018\u0002 \u0001(\t\u0012\u0011\n\trecordDay\u0018\u0003 \u0001(\u0005\u0012\u0010\n\ballTasks\u0018\u0004 \u0001(\t\u0012X\n\u0005tasks\u0018\u0005 \u0003(\u000b2I.com.huawei.basichealthmodel.devicelink.pbjava.report.TaskBody.ReportTask\u0012\u0016\n\u000ecompletedTasks\u0018\u0006 \u0001(\t\u0012\u0016\n\u000ecloverProgress\u0018\u0007 \u0001(\f\u001aä\u0001\n\nReportTask\u0012\u000e\n\u0006taskId\u0018\u0001 \u0001(\u0005\u0012\u0012\n\ntaskTarget\u0018\u0002 \u0001(\t\u0012\u0011\n\ttargetDes\u0018\u0003 \u0001(\t\u0012\u0011\n\ttaskValue\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006status\u0018\u0005 \u0001(\u0005\u0012\u0012\n\nrestStatus\u0018\u0006 \u0001(\u0005\u0012\u0011\n\ttimestamp\u0018\u0007 \u0001(\u0003\u0012\u0010\n\btaskType\u0018\b \u0001(\u0005\u0012\u0010\n\btaskName\u0018\t \u0001(\t\u0012\f\n\u0004unit\u0018\n \u0001(\t\u0012\u0010\n\bprogress\u0018\u000b \u0001(\u0002\u0012\u0011\n\tstatusDes\u0018\f \u0001(\t\u001aJ\n\u000eCloverProgress\u0012\u000b\n\u0003top\u0018\u0001 \u0001(\u0002\u0012\f\n\u0004left\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005right\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006bottom\u0018\u0004 \u0001(\u0002B\u0015B\u0013HealthModelTaskBodyb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    private static final GeneratedMessageV3.FieldAccessorTable f;
    private static final Descriptors.Descriptor h;

    public interface TaskBodyOrBuilder extends MessageOrBuilder {
        String getAllTasks();

        ByteString getAllTasksBytes();

        ByteString getCloverProgress();

        String getCompletedTasks();

        ByteString getCompletedTasksBytes();

        int getRecordDay();

        int getResultCode();

        String getResultDes();

        ByteString getResultDesBytes();

        TaskBody.c getTasks(int i);

        int getTasksCount();

        List<TaskBody.c> getTasksList();

        TaskBody.ReportTaskOrBuilder getTasksOrBuilder(int i);

        List<? extends TaskBody.ReportTaskOrBuilder> getTasksOrBuilderList();
    }

    public static final class TaskBody extends GeneratedMessageV3 implements TaskBodyOrBuilder {
        private static final TaskBody d = new TaskBody();
        private static final Parser<TaskBody> e = new AbstractParser<TaskBody>() { // from class: com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.1
            @Override // com.google.protobuf.Parser
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public TaskBody parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TaskBody(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile Object f5314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile Object f5315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteString f5316c;
        private List<c> f;
        private int g;
        private byte h;
        private volatile Object i;
        private int j;

        public interface CloverProgressOrBuilder extends MessageOrBuilder {
            float getBottom();

            float getLeft();

            float getRight();

            float getTop();
        }

        public interface ReportTaskOrBuilder extends MessageOrBuilder {
            float getProgress();

            int getRestStatus();

            int getStatus();

            String getStatusDes();

            ByteString getStatusDesBytes();

            String getTargetDes();

            ByteString getTargetDesBytes();

            int getTaskId();

            String getTaskName();

            ByteString getTaskNameBytes();

            String getTaskTarget();

            ByteString getTaskTargetBytes();

            int getTaskType();

            String getTaskValue();

            ByteString getTaskValueBytes();

            long getTimestamp();

            String getUnit();

            ByteString getUnitBytes();
        }

        private TaskBody(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.h = (byte) -1;
        }

        private TaskBody() {
            this.h = (byte) -1;
            this.i = "";
            this.f5314a = "";
            this.f = Collections.EMPTY_LIST;
            this.f5315b = "";
            this.f5316c = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TaskBody();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private TaskBody(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.j = codedInputStream.readInt32();
                            } else if (tag == 18) {
                                this.i = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 24) {
                                this.g = codedInputStream.readInt32();
                            } else if (tag == 34) {
                                this.f5314a = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 42) {
                                if (!z2) {
                                    this.f = new ArrayList();
                                    z2 = true;
                                }
                                this.f.add((c) codedInputStream.readMessage(c.j(), extensionRegistryLite));
                            } else if (tag == 50) {
                                this.f5315b = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 58) {
                                this.f5316c = codedInputStream.readBytes();
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
                    if (z2) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2) {
                this.f = Collections.unmodifiableList(this.f);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor c() {
            return HealthModelTaskBody.h;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HealthModelTaskBody.f.ensureFieldAccessorsInitialized(TaskBody.class, b.class);
        }

        public static final class c extends GeneratedMessageV3 implements ReportTaskOrBuilder {
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f5322c;
            private byte d;
            private float e;
            private volatile Object f;
            private volatile Object g;
            private volatile Object h;
            private int i;
            private int j;
            private volatile Object k;
            private int l;
            private volatile Object m;
            private long n;
            private volatile Object o;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final c f5321b = new c();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Parser<c> f5320a = new AbstractParser<c>() { // from class: com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.c.4
                @Override // com.google.protobuf.Parser
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public c parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new c(codedInputStream, extensionRegistryLite);
                }
            };

            private c(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.d = (byte) -1;
            }

            private c() {
                this.d = (byte) -1;
                this.o = "";
                this.f = "";
                this.m = "";
                this.g = "";
                this.k = "";
                this.h = "";
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
                            try {
                                int tag = codedInputStream.readTag();
                                switch (tag) {
                                    case 0:
                                        break;
                                    case 8:
                                        this.j = codedInputStream.readInt32();
                                        continue;
                                    case 18:
                                        this.o = codedInputStream.readStringRequireUtf8();
                                        continue;
                                    case 26:
                                        this.f = codedInputStream.readStringRequireUtf8();
                                        continue;
                                    case 34:
                                        this.m = codedInputStream.readStringRequireUtf8();
                                        continue;
                                    case 40:
                                        this.i = codedInputStream.readInt32();
                                        continue;
                                    case 48:
                                        this.f5322c = codedInputStream.readInt32();
                                        continue;
                                    case 56:
                                        this.n = codedInputStream.readInt64();
                                        continue;
                                    case 64:
                                        this.l = codedInputStream.readInt32();
                                        continue;
                                    case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_POOL /* 74 */:
                                        this.g = codedInputStream.readStringRequireUtf8();
                                        continue;
                                    case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                                        this.k = codedInputStream.readStringRequireUtf8();
                                        continue;
                                    case 93:
                                        this.e = codedInputStream.readFloat();
                                        continue;
                                    case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                                        this.h = codedInputStream.readStringRequireUtf8();
                                        continue;
                                    default:
                                        if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                            break;
                                        }
                                        break;
                                }
                                z = true;
                            } catch (IOException e) {
                                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.setUnfinishedMessage(this);
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

            public static final Descriptors.Descriptor e() {
                return HealthModelTaskBody.d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HealthModelTaskBody.f5311a.ensureFieldAccessorsInitialized(c.class, C0063c.class);
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public int getTaskId() {
                return this.j;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public String getTaskTarget() {
                Object obj = this.o;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.o = stringUtf8;
                return stringUtf8;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public ByteString getTaskTargetBytes() {
                Object obj = this.o;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.o = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public String getTargetDes() {
                Object obj = this.f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f = stringUtf8;
                return stringUtf8;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public ByteString getTargetDesBytes() {
                Object obj = this.f;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.f = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public String getTaskValue() {
                Object obj = this.m;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.m = stringUtf8;
                return stringUtf8;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public ByteString getTaskValueBytes() {
                Object obj = this.m;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.m = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public int getStatus() {
                return this.i;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public int getRestStatus() {
                return this.f5322c;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public long getTimestamp() {
                return this.n;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public int getTaskType() {
                return this.l;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public String getTaskName() {
                Object obj = this.g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.g = stringUtf8;
                return stringUtf8;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public ByteString getTaskNameBytes() {
                Object obj = this.g;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.g = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public String getUnit() {
                Object obj = this.k;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.k = stringUtf8;
                return stringUtf8;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public ByteString getUnitBytes() {
                Object obj = this.k;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.k = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public float getProgress() {
                return this.e;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public String getStatusDes() {
                Object obj = this.h;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.h = stringUtf8;
                return stringUtf8;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
            public ByteString getStatusDesBytes() {
                Object obj = this.h;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.h = byteStringCopyFromUtf8;
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
                int i = this.j;
                if (i != 0) {
                    codedOutputStream.writeInt32(1, i);
                }
                if (!getTaskTargetBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.o);
                }
                if (!getTargetDesBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.f);
                }
                if (!getTaskValueBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.m);
                }
                int i2 = this.i;
                if (i2 != 0) {
                    codedOutputStream.writeInt32(5, i2);
                }
                int i3 = this.f5322c;
                if (i3 != 0) {
                    codedOutputStream.writeInt32(6, i3);
                }
                long j = this.n;
                if (j != 0) {
                    codedOutputStream.writeInt64(7, j);
                }
                int i4 = this.l;
                if (i4 != 0) {
                    codedOutputStream.writeInt32(8, i4);
                }
                if (!getTaskNameBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 9, this.g);
                }
                if (!getUnitBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 10, this.k);
                }
                float f = this.e;
                if (f != 0.0f) {
                    codedOutputStream.writeFloat(11, f);
                }
                if (!getStatusDesBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 12, this.h);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = this.j;
                int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
                if (!getTaskTargetBytes().isEmpty()) {
                    iComputeInt32Size += GeneratedMessageV3.computeStringSize(2, this.o);
                }
                if (!getTargetDesBytes().isEmpty()) {
                    iComputeInt32Size += GeneratedMessageV3.computeStringSize(3, this.f);
                }
                if (!getTaskValueBytes().isEmpty()) {
                    iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.m);
                }
                int i3 = this.i;
                if (i3 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(5, i3);
                }
                int i4 = this.f5322c;
                if (i4 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(6, i4);
                }
                long j = this.n;
                if (j != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt64Size(7, j);
                }
                int i5 = this.l;
                if (i5 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(8, i5);
                }
                if (!getTaskNameBytes().isEmpty()) {
                    iComputeInt32Size += GeneratedMessageV3.computeStringSize(9, this.g);
                }
                if (!getUnitBytes().isEmpty()) {
                    iComputeInt32Size += GeneratedMessageV3.computeStringSize(10, this.k);
                }
                float f = this.e;
                if (f != 0.0f) {
                    iComputeInt32Size += CodedOutputStream.computeFloatSize(11, f);
                }
                if (!getStatusDesBytes().isEmpty()) {
                    iComputeInt32Size += GeneratedMessageV3.computeStringSize(12, this.h);
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
                return getTaskId() == cVar.getTaskId() && getTaskTarget().equals(cVar.getTaskTarget()) && getTargetDes().equals(cVar.getTargetDes()) && getTaskValue().equals(cVar.getTaskValue()) && getStatus() == cVar.getStatus() && getRestStatus() == cVar.getRestStatus() && getTimestamp() == cVar.getTimestamp() && getTaskType() == cVar.getTaskType() && getTaskName().equals(cVar.getTaskName()) && getUnit().equals(cVar.getUnit()) && Float.floatToIntBits(getProgress()) == Float.floatToIntBits(cVar.getProgress()) && getStatusDes().equals(cVar.getStatusDes()) && this.unknownFields.equals(cVar.unknownFields);
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int iHashCode = e().hashCode();
                int taskId = getTaskId();
                int iHashCode2 = getTaskTarget().hashCode();
                int iHashCode3 = getTargetDes().hashCode();
                int iHashCode4 = getTaskValue().hashCode();
                int status = getStatus();
                int restStatus = getRestStatus();
                int iHashLong = Internal.hashLong(getTimestamp());
                int taskType = getTaskType();
                int iHashCode5 = getTaskName().hashCode();
                int iHashCode6 = getUnit().hashCode();
                int iFloatToIntBits = ((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + 779) * 37) + 1) * 53) + taskId) * 37) + 2) * 53) + iHashCode2) * 37) + 3) * 53) + iHashCode3) * 37) + 4) * 53) + iHashCode4) * 37) + 5) * 53) + status) * 37) + 6) * 53) + restStatus) * 37) + 7) * 53) + iHashLong) * 37) + 8) * 53) + taskType) * 37) + 9) * 53) + iHashCode5) * 37) + 10) * 53) + iHashCode6) * 37) + 11) * 53) + Float.floatToIntBits(getProgress())) * 37) + 12) * 53) + getStatusDes().hashCode()) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iFloatToIntBits;
                return iFloatToIntBits;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C0063c newBuilderForType() {
                return b();
            }

            public static C0063c b() {
                return f5321b.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C0063c toBuilder() {
                return this == f5321b ? new C0063c() : new C0063c().a(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public C0063c newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C0063c(builderParent);
            }

            /* JADX INFO: renamed from: com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody$TaskBody$c$c, reason: collision with other inner class name */
            public static final class C0063c extends GeneratedMessageV3.Builder<C0063c> implements ReportTaskOrBuilder {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private Object f5323a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f5324b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f5325c;
                private float d;
                private Object e;
                private int f;
                private int g;
                private Object h;
                private Object i;
                private Object j;
                private Object m;
                private long o;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return HealthModelTaskBody.f5311a.ensureFieldAccessorsInitialized(c.class, C0063c.class);
                }

                private C0063c() {
                    this.i = "";
                    this.e = "";
                    this.j = "";
                    this.h = "";
                    this.m = "";
                    this.f5323a = "";
                    j();
                }

                private C0063c(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.i = "";
                    this.e = "";
                    this.j = "";
                    this.h = "";
                    this.m = "";
                    this.f5323a = "";
                    j();
                }

                private void j() {
                    boolean unused = c.alwaysUseFieldBuilders;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public C0063c clear() {
                    super.clear();
                    this.g = 0;
                    this.i = "";
                    this.e = "";
                    this.j = "";
                    this.f5325c = 0;
                    this.f5324b = 0;
                    this.o = 0L;
                    this.f = 0;
                    this.h = "";
                    this.m = "";
                    this.d = 0.0f;
                    this.f5323a = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return HealthModelTaskBody.d;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c getDefaultInstanceForType() {
                    return c.a();
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
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public c buildPartial() {
                    c cVar = new c(this);
                    cVar.j = this.g;
                    cVar.o = this.i;
                    cVar.f = this.e;
                    cVar.m = this.j;
                    cVar.i = this.f5325c;
                    cVar.f5322c = this.f5324b;
                    cVar.n = this.o;
                    cVar.l = this.f;
                    cVar.g = this.h;
                    cVar.k = this.m;
                    cVar.e = this.d;
                    cVar.h = this.f5323a;
                    onBuilt();
                    return cVar;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public C0063c mo799clone() {
                    return (C0063c) super.mo799clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public C0063c setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0063c) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public C0063c clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C0063c) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public C0063c clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C0063c) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public C0063c setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (C0063c) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0063c addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0063c) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public C0063c mergeFrom(Message message) {
                    if (message instanceof c) {
                        return a((c) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public C0063c a(c cVar) {
                    if (cVar == c.a()) {
                        return this;
                    }
                    if (cVar.getTaskId() != 0) {
                        b(cVar.getTaskId());
                    }
                    if (!cVar.getTaskTarget().isEmpty()) {
                        this.i = cVar.o;
                        onChanged();
                    }
                    if (!cVar.getTargetDes().isEmpty()) {
                        this.e = cVar.f;
                        onChanged();
                    }
                    if (!cVar.getTaskValue().isEmpty()) {
                        this.j = cVar.m;
                        onChanged();
                    }
                    if (cVar.getStatus() != 0) {
                        c(cVar.getStatus());
                    }
                    if (cVar.getRestStatus() != 0) {
                        e(cVar.getRestStatus());
                    }
                    if (cVar.getTimestamp() != 0) {
                        d(cVar.getTimestamp());
                    }
                    if (cVar.getTaskType() != 0) {
                        a(cVar.getTaskType());
                    }
                    if (!cVar.getTaskName().isEmpty()) {
                        this.h = cVar.g;
                        onChanged();
                    }
                    if (!cVar.getUnit().isEmpty()) {
                        this.m = cVar.k;
                        onChanged();
                    }
                    if (cVar.getProgress() != 0.0f) {
                        e(cVar.getProgress());
                    }
                    if (!cVar.getStatusDes().isEmpty()) {
                        this.f5323a = cVar.h;
                        onChanged();
                    }
                    mergeUnknownFields(cVar.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0063c mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    c cVar;
                    try {
                        try {
                            c cVar2 = (c) c.f5320a.parsePartialFrom(codedInputStream, extensionRegistryLite);
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

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public int getTaskId() {
                    return this.g;
                }

                public C0063c b(int i) {
                    this.g = i;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public String getTaskTarget() {
                    Object obj = this.i;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.i = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public ByteString getTaskTargetBytes() {
                    Object obj = this.i;
                    if (obj instanceof String) {
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.i = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                public C0063c c(String str) {
                    str.getClass();
                    this.i = str;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public String getTargetDes() {
                    Object obj = this.e;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.e = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public ByteString getTargetDesBytes() {
                    Object obj = this.e;
                    if (obj instanceof String) {
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.e = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                public C0063c b(String str) {
                    str.getClass();
                    this.e = str;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public String getTaskValue() {
                    Object obj = this.j;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.j = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public ByteString getTaskValueBytes() {
                    Object obj = this.j;
                    if (obj instanceof String) {
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.j = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                public C0063c a(String str) {
                    str.getClass();
                    this.j = str;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public int getStatus() {
                    return this.f5325c;
                }

                public C0063c c(int i) {
                    this.f5325c = i;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public int getRestStatus() {
                    return this.f5324b;
                }

                public C0063c e(int i) {
                    this.f5324b = i;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public long getTimestamp() {
                    return this.o;
                }

                public C0063c d(long j) {
                    this.o = j;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public int getTaskType() {
                    return this.f;
                }

                public C0063c a(int i) {
                    this.f = i;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public String getTaskName() {
                    Object obj = this.h;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.h = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public ByteString getTaskNameBytes() {
                    Object obj = this.h;
                    if (obj instanceof String) {
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.h = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                public C0063c d(String str) {
                    str.getClass();
                    this.h = str;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public String getUnit() {
                    Object obj = this.m;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.m = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public ByteString getUnitBytes() {
                    Object obj = this.m;
                    if (obj instanceof String) {
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.m = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                public C0063c f(String str) {
                    str.getClass();
                    this.m = str;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public float getProgress() {
                    return this.d;
                }

                public C0063c e(float f) {
                    this.d = f;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public String getStatusDes() {
                    Object obj = this.f5323a;
                    if (!(obj instanceof String)) {
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.f5323a = stringUtf8;
                        return stringUtf8;
                    }
                    return (String) obj;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.ReportTaskOrBuilder
                public ByteString getStatusDesBytes() {
                    Object obj = this.f5323a;
                    if (obj instanceof String) {
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.f5323a = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }
                    return (ByteString) obj;
                }

                public C0063c e(String str) {
                    str.getClass();
                    this.f5323a = str;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public final C0063c setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C0063c) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final C0063c mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C0063c) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static c a() {
                return f5321b;
            }

            public static Parser<c> j() {
                return f5320a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<c> getParserForType() {
                return f5320a;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return f5321b;
            }
        }

        public static final class d extends GeneratedMessageV3 implements CloverProgressOrBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final d f5326a = new d();
            private static final Parser<d> d = new AbstractParser<d>() { // from class: com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.d.3
                @Override // com.google.protobuf.Parser
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public d parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new d(codedInputStream, extensionRegistryLite);
                }
            };
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f5327b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private byte f5328c;
            private float e;
            private float f;
            private float i;

            private d(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.f5328c = (byte) -1;
            }

            private d() {
                this.f5328c = (byte) -1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new d();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 13) {
                                    this.i = codedInputStream.readFloat();
                                } else if (tag == 21) {
                                    this.e = codedInputStream.readFloat();
                                } else if (tag == 29) {
                                    this.f = codedInputStream.readFloat();
                                } else if (tag == 37) {
                                    this.f5327b = codedInputStream.readFloat();
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

            public static final Descriptors.Descriptor d() {
                return HealthModelTaskBody.f5313c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HealthModelTaskBody.f5312b.ensureFieldAccessorsInitialized(d.class, C0064d.class);
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.CloverProgressOrBuilder
            public float getTop() {
                return this.i;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.CloverProgressOrBuilder
            public float getLeft() {
                return this.e;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.CloverProgressOrBuilder
            public float getRight() {
                return this.f;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.CloverProgressOrBuilder
            public float getBottom() {
                return this.f5327b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b2 = this.f5328c;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.f5328c = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                float f = this.i;
                if (f != 0.0f) {
                    codedOutputStream.writeFloat(1, f);
                }
                float f2 = this.e;
                if (f2 != 0.0f) {
                    codedOutputStream.writeFloat(2, f2);
                }
                float f3 = this.f;
                if (f3 != 0.0f) {
                    codedOutputStream.writeFloat(3, f3);
                }
                float f4 = this.f5327b;
                if (f4 != 0.0f) {
                    codedOutputStream.writeFloat(4, f4);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                float f = this.i;
                int iComputeFloatSize = f != 0.0f ? CodedOutputStream.computeFloatSize(1, f) : 0;
                float f2 = this.e;
                if (f2 != 0.0f) {
                    iComputeFloatSize += CodedOutputStream.computeFloatSize(2, f2);
                }
                float f3 = this.f;
                if (f3 != 0.0f) {
                    iComputeFloatSize += CodedOutputStream.computeFloatSize(3, f3);
                }
                float f4 = this.f5327b;
                if (f4 != 0.0f) {
                    iComputeFloatSize += CodedOutputStream.computeFloatSize(4, f4);
                }
                int serializedSize = iComputeFloatSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return super.equals(obj);
                }
                d dVar = (d) obj;
                return Float.floatToIntBits(getTop()) == Float.floatToIntBits(dVar.getTop()) && Float.floatToIntBits(getLeft()) == Float.floatToIntBits(dVar.getLeft()) && Float.floatToIntBits(getRight()) == Float.floatToIntBits(dVar.getRight()) && Float.floatToIntBits(getBottom()) == Float.floatToIntBits(dVar.getBottom()) && this.unknownFields.equals(dVar.unknownFields);
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int iHashCode = d().hashCode();
                int iFloatToIntBits = Float.floatToIntBits(getTop());
                int iFloatToIntBits2 = Float.floatToIntBits(getLeft());
                int iFloatToIntBits3 = ((((((((((((((((((iHashCode + 779) * 37) + 1) * 53) + iFloatToIntBits) * 37) + 2) * 53) + iFloatToIntBits2) * 37) + 3) * 53) + Float.floatToIntBits(getRight())) * 37) + 4) * 53) + Float.floatToIntBits(getBottom())) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iFloatToIntBits3;
                return iFloatToIntBits3;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C0064d newBuilderForType() {
                return b();
            }

            public static C0064d b() {
                return f5326a.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public C0064d toBuilder() {
                return this == f5326a ? new C0064d() : new C0064d().e(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0064d newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C0064d(builderParent);
            }

            /* JADX INFO: renamed from: com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody$TaskBody$d$d, reason: collision with other inner class name */
            public static final class C0064d extends GeneratedMessageV3.Builder<C0064d> implements CloverProgressOrBuilder {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private float f5329a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private float f5330b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private float f5331c;
                private float d;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return HealthModelTaskBody.f5312b.ensureFieldAccessorsInitialized(d.class, C0064d.class);
                }

                private C0064d() {
                    h();
                }

                private C0064d(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    h();
                }

                private void h() {
                    boolean unused = d.alwaysUseFieldBuilders;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public C0064d clear() {
                    super.clear();
                    this.f5329a = 0.0f;
                    this.f5331c = 0.0f;
                    this.d = 0.0f;
                    this.f5330b = 0.0f;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return HealthModelTaskBody.f5313c;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public d getDefaultInstanceForType() {
                    return d.a();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public d build() {
                    d dVarBuildPartial = buildPartial();
                    if (dVarBuildPartial.isInitialized()) {
                        return dVarBuildPartial;
                    }
                    throw newUninitializedMessageException((Message) dVarBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public d buildPartial() {
                    d dVar = new d(this);
                    dVar.i = this.f5329a;
                    dVar.e = this.f5331c;
                    dVar.f = this.d;
                    dVar.f5327b = this.f5330b;
                    onBuilt();
                    return dVar;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public C0064d mo799clone() {
                    return (C0064d) super.mo799clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public C0064d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0064d) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public C0064d clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C0064d) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public C0064d clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C0064d) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public C0064d setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (C0064d) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0064d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0064d) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public C0064d mergeFrom(Message message) {
                    if (message instanceof d) {
                        return e((d) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public C0064d e(d dVar) {
                    if (dVar == d.a()) {
                        return this;
                    }
                    if (dVar.getTop() != 0.0f) {
                        b(dVar.getTop());
                    }
                    if (dVar.getLeft() != 0.0f) {
                        a(dVar.getLeft());
                    }
                    if (dVar.getRight() != 0.0f) {
                        c(dVar.getRight());
                    }
                    if (dVar.getBottom() != 0.0f) {
                        e(dVar.getBottom());
                    }
                    mergeUnknownFields(dVar.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public C0064d mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    d dVar;
                    try {
                        try {
                            d dVar2 = (d) d.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (dVar2 != null) {
                                e(dVar2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            dVar = (d) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                if (dVar != null) {
                                    e(dVar);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dVar = null;
                        if (dVar != null) {
                            e(dVar);
                        }
                        throw th;
                    }
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.CloverProgressOrBuilder
                public float getTop() {
                    return this.f5329a;
                }

                public C0064d b(float f) {
                    this.f5329a = f;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.CloverProgressOrBuilder
                public float getLeft() {
                    return this.f5331c;
                }

                public C0064d a(float f) {
                    this.f5331c = f;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.CloverProgressOrBuilder
                public float getRight() {
                    return this.d;
                }

                public C0064d c(float f) {
                    this.d = f;
                    onChanged();
                    return this;
                }

                @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBody.CloverProgressOrBuilder
                public float getBottom() {
                    return this.f5330b;
                }

                public C0064d e(float f) {
                    this.f5330b = f;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final C0064d setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C0064d) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0064d mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C0064d) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static d a() {
                return f5326a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<d> getParserForType() {
                return d;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public d getDefaultInstanceForType() {
                return f5326a;
            }
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public int getResultCode() {
            return this.j;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public String getResultDes() {
            Object obj = this.i;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.i = stringUtf8;
            return stringUtf8;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public ByteString getResultDesBytes() {
            Object obj = this.i;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.i = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public int getRecordDay() {
            return this.g;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public String getAllTasks() {
            Object obj = this.f5314a;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f5314a = stringUtf8;
            return stringUtf8;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public ByteString getAllTasksBytes() {
            Object obj = this.f5314a;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.f5314a = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public List<c> getTasksList() {
            return this.f;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public List<? extends ReportTaskOrBuilder> getTasksOrBuilderList() {
            return this.f;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public int getTasksCount() {
            return this.f.size();
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public c getTasks(int i) {
            return this.f.get(i);
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public ReportTaskOrBuilder getTasksOrBuilder(int i) {
            return this.f.get(i);
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public String getCompletedTasks() {
            Object obj = this.f5315b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f5315b = stringUtf8;
            return stringUtf8;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public ByteString getCompletedTasksBytes() {
            Object obj = this.f5315b;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.f5315b = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
        public ByteString getCloverProgress() {
            return this.f5316c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.h;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.j;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            if (!getResultDesBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.i);
            }
            int i2 = this.g;
            if (i2 != 0) {
                codedOutputStream.writeInt32(3, i2);
            }
            if (!getAllTasksBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f5314a);
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                codedOutputStream.writeMessage(5, this.f.get(i3));
            }
            if (!getCompletedTasksBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.f5315b);
            }
            if (!this.f5316c.isEmpty()) {
                codedOutputStream.writeBytes(7, this.f5316c);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.j;
            int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
            if (!getResultDesBytes().isEmpty()) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(2, this.i);
            }
            int i3 = this.g;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i3);
            }
            if (!getAllTasksBytes().isEmpty()) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.f5314a);
            }
            for (int i4 = 0; i4 < this.f.size(); i4++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f.get(i4));
            }
            if (!getCompletedTasksBytes().isEmpty()) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(6, this.f5315b);
            }
            if (!this.f5316c.isEmpty()) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(7, this.f5316c);
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
            if (!(obj instanceof TaskBody)) {
                return super.equals(obj);
            }
            TaskBody taskBody = (TaskBody) obj;
            return getResultCode() == taskBody.getResultCode() && getResultDes().equals(taskBody.getResultDes()) && getRecordDay() == taskBody.getRecordDay() && getAllTasks().equals(taskBody.getAllTasks()) && getTasksList().equals(taskBody.getTasksList()) && getCompletedTasks().equals(taskBody.getCompletedTasks()) && getCloverProgress().equals(taskBody.getCloverProgress()) && this.unknownFields.equals(taskBody.unknownFields);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = c().hashCode();
            int resultCode = getResultCode();
            int iHashCode2 = ((((((((((((((((iHashCode + 779) * 37) + 1) * 53) + resultCode) * 37) + 2) * 53) + getResultDes().hashCode()) * 37) + 3) * 53) + getRecordDay()) * 37) + 4) * 53) + getAllTasks().hashCode();
            if (getTasksCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + getTasksList().hashCode();
            }
            int iHashCode3 = (((((((((iHashCode2 * 37) + 6) * 53) + getCompletedTasks().hashCode()) * 37) + 7) * 53) + getCloverProgress().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return j();
        }

        public static b j() {
            return d.toBuilder();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == d ? new b() : new b().e(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new b(builderParent);
        }

        public static final class b extends GeneratedMessageV3.Builder<b> implements TaskBodyOrBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Object f5317a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f5318b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ByteString f5319c;
            private int d;
            private int e;
            private int f;
            private RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> g;
            private List<c> h;
            private Object i;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HealthModelTaskBody.f.ensureFieldAccessorsInitialized(TaskBody.class, b.class);
            }

            private b() {
                this.i = "";
                this.f5318b = "";
                this.h = Collections.EMPTY_LIST;
                this.f5317a = "";
                this.f5319c = ByteString.EMPTY;
                j();
            }

            private b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.i = "";
                this.f5318b = "";
                this.h = Collections.EMPTY_LIST;
                this.f5317a = "";
                this.f5319c = ByteString.EMPTY;
                j();
            }

            private void j() {
                if (TaskBody.alwaysUseFieldBuilders) {
                    i();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f = 0;
                this.i = "";
                this.e = 0;
                this.f5318b = "";
                RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> repeatedFieldBuilderV3 = this.g;
                if (repeatedFieldBuilderV3 == null) {
                    this.h = Collections.EMPTY_LIST;
                    this.d &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                this.f5317a = "";
                this.f5319c = ByteString.EMPTY;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return HealthModelTaskBody.h;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public TaskBody getDefaultInstanceForType() {
                return TaskBody.d();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public TaskBody build() {
                TaskBody taskBodyBuildPartial = buildPartial();
                if (taskBodyBuildPartial.isInitialized()) {
                    return taskBodyBuildPartial;
                }
                throw newUninitializedMessageException((Message) taskBodyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public TaskBody buildPartial() {
                TaskBody taskBody = new TaskBody(this);
                taskBody.j = this.f;
                taskBody.i = this.i;
                taskBody.g = this.e;
                taskBody.f5314a = this.f5318b;
                RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> repeatedFieldBuilderV3 = this.g;
                if (repeatedFieldBuilderV3 != null) {
                    taskBody.f = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.d & 1) != 0) {
                        this.h = Collections.unmodifiableList(this.h);
                        this.d &= -2;
                    }
                    taskBody.f = this.h;
                }
                taskBody.f5315b = this.f5317a;
                taskBody.f5316c = this.f5319c;
                onBuilt();
                return taskBody;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b mo799clone() {
                return (b) super.mo799clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof TaskBody) {
                    return e((TaskBody) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b e(TaskBody taskBody) {
                if (taskBody == TaskBody.d()) {
                    return this;
                }
                if (taskBody.getResultCode() != 0) {
                    b(taskBody.getResultCode());
                }
                if (!taskBody.getResultDes().isEmpty()) {
                    this.i = taskBody.i;
                    onChanged();
                }
                if (taskBody.getRecordDay() != 0) {
                    a(taskBody.getRecordDay());
                }
                if (!taskBody.getAllTasks().isEmpty()) {
                    this.f5318b = taskBody.f5314a;
                    onChanged();
                }
                if (this.g == null) {
                    if (!taskBody.f.isEmpty()) {
                        if (this.h.isEmpty()) {
                            this.h = taskBody.f;
                            this.d &= -2;
                        } else {
                            h();
                            this.h.addAll(taskBody.f);
                        }
                        onChanged();
                    }
                } else if (!taskBody.f.isEmpty()) {
                    if (!this.g.isEmpty()) {
                        this.g.addAllMessages(taskBody.f);
                    } else {
                        this.g.dispose();
                        this.g = null;
                        this.h = taskBody.f;
                        this.d &= -2;
                        this.g = TaskBody.alwaysUseFieldBuilders ? i() : null;
                    }
                }
                if (!taskBody.getCompletedTasks().isEmpty()) {
                    this.f5317a = taskBody.f5315b;
                    onChanged();
                }
                if (taskBody.getCloverProgress() != ByteString.EMPTY) {
                    a(taskBody.getCloverProgress());
                }
                mergeUnknownFields(taskBody.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TaskBody taskBody;
                try {
                    try {
                        TaskBody taskBody2 = (TaskBody) TaskBody.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (taskBody2 != null) {
                            e(taskBody2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        taskBody = (TaskBody) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (taskBody != null) {
                                e(taskBody);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    taskBody = null;
                    if (taskBody != null) {
                        e(taskBody);
                    }
                    throw th;
                }
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public int getResultCode() {
                return this.f;
            }

            public b b(int i) {
                this.f = i;
                onChanged();
                return this;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public String getResultDes() {
                Object obj = this.i;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.i = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public ByteString getResultDesBytes() {
                Object obj = this.i;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.i = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public b a(String str) {
                str.getClass();
                this.i = str;
                onChanged();
                return this;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public int getRecordDay() {
                return this.e;
            }

            public b a(int i) {
                this.e = i;
                onChanged();
                return this;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public String getAllTasks() {
                Object obj = this.f5318b;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f5318b = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public ByteString getAllTasksBytes() {
                Object obj = this.f5318b;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.f5318b = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public b b(String str) {
                str.getClass();
                this.f5318b = str;
                onChanged();
                return this;
            }

            private void h() {
                if ((this.d & 1) == 0) {
                    this.h = new ArrayList(this.h);
                    this.d |= 1;
                }
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public List<c> getTasksList() {
                RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> repeatedFieldBuilderV3 = this.g;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.h);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public int getTasksCount() {
                RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> repeatedFieldBuilderV3 = this.g;
                if (repeatedFieldBuilderV3 == null) {
                    return this.h.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public c getTasks(int i) {
                RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> repeatedFieldBuilderV3 = this.g;
                if (repeatedFieldBuilderV3 == null) {
                    return this.h.get(i);
                }
                return (c) repeatedFieldBuilderV3.getMessage(i);
            }

            public b e(int i, c cVar) {
                RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> repeatedFieldBuilderV3 = this.g;
                if (repeatedFieldBuilderV3 == null) {
                    cVar.getClass();
                    h();
                    this.h.add(i, cVar);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i, cVar);
                return this;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public ReportTaskOrBuilder getTasksOrBuilder(int i) {
                RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> repeatedFieldBuilderV3 = this.g;
                if (repeatedFieldBuilderV3 == null) {
                    return this.h.get(i);
                }
                return (ReportTaskOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public List<? extends ReportTaskOrBuilder> getTasksOrBuilderList() {
                RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> repeatedFieldBuilderV3 = this.g;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.h);
            }

            private RepeatedFieldBuilderV3<c, c.C0063c, ReportTaskOrBuilder> i() {
                if (this.g == null) {
                    this.g = new RepeatedFieldBuilderV3<>(this.h, (this.d & 1) != 0, getParentForChildren(), isClean());
                    this.h = null;
                }
                return this.g;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public String getCompletedTasks() {
                Object obj = this.f5317a;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f5317a = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public ByteString getCompletedTasksBytes() {
                Object obj = this.f5317a;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.f5317a = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public b c(String str) {
                str.getClass();
                this.f5317a = str;
                onChanged();
                return this;
            }

            @Override // com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody.TaskBodyOrBuilder
            public ByteString getCloverProgress() {
                return this.f5319c;
            }

            public b a(ByteString byteString) {
                byteString.getClass();
                this.f5319c = byteString;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (b) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static TaskBody d() {
            return d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TaskBody> getParserForType() {
            return e;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public TaskBody getDefaultInstanceForType() {
            return d;
        }
    }

    public static Descriptors.FileDescriptor f() {
        return e;
    }

    static {
        Descriptors.Descriptor descriptor = f().getMessageTypes().get(0);
        h = descriptor;
        f = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"ResultCode", "ResultDes", "RecordDay", "AllTasks", "Tasks", "CompletedTasks", "CloverProgress"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        d = descriptor2;
        f5311a = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TaskId", "TaskTarget", "TargetDes", "TaskValue", "Status", "RestStatus", "Timestamp", "TaskType", "TaskName", "Unit", "Progress", "StatusDes"});
        Descriptors.Descriptor descriptor3 = descriptor.getNestedTypes().get(1);
        f5313c = descriptor3;
        f5312b = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Top", "Left", "Right", "Bottom"});
    }
}
