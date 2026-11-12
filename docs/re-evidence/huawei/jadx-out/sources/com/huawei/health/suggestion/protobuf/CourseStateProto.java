package com.huawei.health.suggestion.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class CourseStateProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011coursestate.proto\"p\n\u000bCourseState\u0012\u0013\n\u000bcourseIndex\u0018\u0001 \u0001(\r\u0012\u001c\n\u0014courseSleepTotalTime\u0018\u0002 \u0001(\r\u0012\u0017\n\u000fcourseSleepTime\u0018\u0003 \u0001(\r\u0012\u0015\n\rcurrentVolume\u0018\u0004 \u0001(\u0005B9\n%com.huawei.health.suggestion.protobufB\u0010CourseStateProto"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_CourseState_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CourseState_fieldAccessorTable;

    public interface CourseStateOrBuilder extends MessageOrBuilder {
        int getCourseIndex();

        int getCourseSleepTime();

        int getCourseSleepTotalTime();

        int getCurrentVolume();

        boolean hasCourseIndex();

        boolean hasCourseSleepTime();

        boolean hasCourseSleepTotalTime();

        boolean hasCurrentVolume();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private CourseStateProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class CourseState extends GeneratedMessageV3 implements CourseStateOrBuilder {
        public static final int COURSEINDEX_FIELD_NUMBER = 1;
        public static final int COURSESLEEPTIME_FIELD_NUMBER = 3;
        public static final int COURSESLEEPTOTALTIME_FIELD_NUMBER = 2;
        public static final int CURRENTVOLUME_FIELD_NUMBER = 4;
        private static final CourseState DEFAULT_INSTANCE = new CourseState();

        @Deprecated
        public static final Parser<CourseState> PARSER = new AbstractParser<CourseState>() { // from class: com.huawei.health.suggestion.protobuf.CourseStateProto.CourseState.1
            @Override // com.google.protobuf.Parser
            public CourseState parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CourseState(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int courseIndex_;
        private int courseSleepTime_;
        private int courseSleepTotalTime_;
        private int currentVolume_;
        private byte memoizedIsInitialized;

        private CourseState(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private CourseState() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CourseState();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CourseState(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.bitField0_ |= 1;
                                this.courseIndex_ = codedInputStream.readUInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.courseSleepTotalTime_ = codedInputStream.readUInt32();
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.courseSleepTime_ = codedInputStream.readUInt32();
                            } else if (tag == 32) {
                                this.bitField0_ |= 8;
                                this.currentVolume_ = codedInputStream.readInt32();
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

        public static final Descriptors.Descriptor getDescriptor() {
            return CourseStateProto.internal_static_CourseState_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CourseStateProto.internal_static_CourseState_fieldAccessorTable.ensureFieldAccessorsInitialized(CourseState.class, Builder.class);
        }

        @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
        public boolean hasCourseIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
        public int getCourseIndex() {
            return this.courseIndex_;
        }

        @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
        public boolean hasCourseSleepTotalTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
        public int getCourseSleepTotalTime() {
            return this.courseSleepTotalTime_;
        }

        @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
        public boolean hasCourseSleepTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
        public int getCourseSleepTime() {
            return this.courseSleepTime_;
        }

        @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
        public boolean hasCurrentVolume() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
        public int getCurrentVolume() {
            return this.currentVolume_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.courseIndex_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.courseSleepTotalTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.courseSleepTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeInt32(4, this.currentVolume_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.courseIndex_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.courseSleepTotalTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.courseSleepTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeInt32Size(4, this.currentVolume_);
            }
            int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CourseState)) {
                return super.equals(obj);
            }
            CourseState courseState = (CourseState) obj;
            if (hasCourseIndex() != courseState.hasCourseIndex()) {
                return false;
            }
            if ((hasCourseIndex() && getCourseIndex() != courseState.getCourseIndex()) || hasCourseSleepTotalTime() != courseState.hasCourseSleepTotalTime()) {
                return false;
            }
            if ((hasCourseSleepTotalTime() && getCourseSleepTotalTime() != courseState.getCourseSleepTotalTime()) || hasCourseSleepTime() != courseState.hasCourseSleepTime()) {
                return false;
            }
            if ((!hasCourseSleepTime() || getCourseSleepTime() == courseState.getCourseSleepTime()) && hasCurrentVolume() == courseState.hasCurrentVolume()) {
                return (!hasCurrentVolume() || getCurrentVolume() == courseState.getCurrentVolume()) && this.unknownFields.equals(courseState.unknownFields);
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCourseIndex()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCourseIndex();
            }
            if (hasCourseSleepTotalTime()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getCourseSleepTotalTime();
            }
            if (hasCourseSleepTime()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getCourseSleepTime();
            }
            if (hasCurrentVolume()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getCurrentVolume();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static CourseState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CourseState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CourseState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CourseState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CourseState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CourseState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CourseState parseFrom(InputStream inputStream) throws IOException {
            return (CourseState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CourseState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CourseState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CourseState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CourseState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CourseState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CourseState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CourseState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CourseState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CourseState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CourseState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CourseState courseState) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(courseState);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CourseStateOrBuilder {
            private int bitField0_;
            private int courseIndex_;
            private int courseSleepTime_;
            private int courseSleepTotalTime_;
            private int currentVolume_;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CourseStateProto.internal_static_CourseState_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CourseStateProto.internal_static_CourseState_fieldAccessorTable.ensureFieldAccessorsInitialized(CourseState.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CourseState.alwaysUseFieldBuilders;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.courseIndex_ = 0;
                int i = this.bitField0_;
                this.courseSleepTotalTime_ = 0;
                this.courseSleepTime_ = 0;
                this.currentVolume_ = 0;
                this.bitField0_ = i & (-16);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CourseStateProto.internal_static_CourseState_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CourseState getDefaultInstanceForType() {
                return CourseState.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CourseState build() {
                CourseState courseStateBuildPartial = buildPartial();
                if (courseStateBuildPartial.isInitialized()) {
                    return courseStateBuildPartial;
                }
                throw newUninitializedMessageException((Message) courseStateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CourseState buildPartial() {
                int i;
                CourseState courseState = new CourseState(this);
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    courseState.courseIndex_ = this.courseIndex_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    courseState.courseSleepTotalTime_ = this.courseSleepTotalTime_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    courseState.courseSleepTime_ = this.courseSleepTime_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    courseState.currentVolume_ = this.currentVolume_;
                    i |= 8;
                }
                courseState.bitField0_ = i;
                onBuilt();
                return courseState;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo799clone() {
                return (Builder) super.mo799clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CourseState) {
                    return mergeFrom((CourseState) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CourseState courseState) {
                if (courseState == CourseState.getDefaultInstance()) {
                    return this;
                }
                if (courseState.hasCourseIndex()) {
                    setCourseIndex(courseState.getCourseIndex());
                }
                if (courseState.hasCourseSleepTotalTime()) {
                    setCourseSleepTotalTime(courseState.getCourseSleepTotalTime());
                }
                if (courseState.hasCourseSleepTime()) {
                    setCourseSleepTime(courseState.getCourseSleepTime());
                }
                if (courseState.hasCurrentVolume()) {
                    setCurrentVolume(courseState.getCurrentVolume());
                }
                mergeUnknownFields(courseState.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                CourseState courseState;
                try {
                    try {
                        CourseState partialFrom = CourseState.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        courseState = (CourseState) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (courseState != null) {
                                mergeFrom(courseState);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    courseState = null;
                    if (courseState != null) {
                        mergeFrom(courseState);
                    }
                    throw th;
                }
            }

            @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
            public boolean hasCourseIndex() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
            public int getCourseIndex() {
                return this.courseIndex_;
            }

            public Builder setCourseIndex(int i) {
                this.bitField0_ |= 1;
                this.courseIndex_ = i;
                onChanged();
                return this;
            }

            public Builder clearCourseIndex() {
                this.bitField0_ &= -2;
                this.courseIndex_ = 0;
                onChanged();
                return this;
            }

            @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
            public boolean hasCourseSleepTotalTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
            public int getCourseSleepTotalTime() {
                return this.courseSleepTotalTime_;
            }

            public Builder setCourseSleepTotalTime(int i) {
                this.bitField0_ |= 2;
                this.courseSleepTotalTime_ = i;
                onChanged();
                return this;
            }

            public Builder clearCourseSleepTotalTime() {
                this.bitField0_ &= -3;
                this.courseSleepTotalTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
            public boolean hasCourseSleepTime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
            public int getCourseSleepTime() {
                return this.courseSleepTime_;
            }

            public Builder setCourseSleepTime(int i) {
                this.bitField0_ |= 4;
                this.courseSleepTime_ = i;
                onChanged();
                return this;
            }

            public Builder clearCourseSleepTime() {
                this.bitField0_ &= -5;
                this.courseSleepTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
            public boolean hasCurrentVolume() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.huawei.health.suggestion.protobuf.CourseStateProto.CourseStateOrBuilder
            public int getCurrentVolume() {
                return this.currentVolume_;
            }

            public Builder setCurrentVolume(int i) {
                this.bitField0_ |= 8;
                this.currentVolume_ = i;
                onChanged();
                return this;
            }

            public Builder clearCurrentVolume() {
                this.bitField0_ &= -9;
                this.currentVolume_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CourseState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CourseState> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CourseState> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CourseState getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CourseState_descriptor = descriptor2;
        internal_static_CourseState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"CourseIndex", "CourseSleepTotalTime", "CourseSleepTime", "CurrentVolume"});
    }
}
