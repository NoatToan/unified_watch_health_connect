package com.garmin.net.omtanalytics.impl.upload;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Descriptors.Descriptor f52486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f52487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f52488c;

    /* JADX INFO: renamed from: com.garmin.net.omtanalytics.impl.upload.a$a, reason: collision with other inner class name */
    public static final class C1118a extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f52491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f52493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C1118a f52489e = new C1118a();

        @Deprecated
        public static final Parser<C1118a> PARSER = new C1119a();

        /* JADX INFO: renamed from: com.garmin.net.omtanalytics.impl.upload.a$a$a, reason: collision with other inner class name */
        public class C1119a extends AbstractParser<C1118a> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                b builder = C1118a.f52489e.toBuilder();
                try {
                    builder.d(codedInputStream, extensionRegistryLite);
                    return builder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builder.buildPartial());
                }
            }
        }

        private C1118a(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f52491b = 0L;
            this.f52492c = 0;
            this.f52493d = (byte) -1;
        }

        public static Parser<C1118a> parser() {
            return PARSER;
        }

        public final boolean a() {
            return (this.f52490a & 2) != 0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b toBuilder() {
            int i14 = 0;
            if (this == f52489e) {
                return new b(i14);
            }
            b bVar = new b(i14);
            bVar.c(this);
            return bVar;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (!(obj instanceof C1118a)) {
                    return super.equals(obj);
                }
                C1118a c1118a = (C1118a) obj;
                int i14 = this.f52490a;
                if (((i14 & 1) != 0) != ((c1118a.f52490a & 1) != 0) || (((i14 & 1) != 0 && this.f52491b != c1118a.f52491b) || a() != c1118a.a() || ((a() && this.f52492c != c1118a.f52492c) || !getUnknownFields().equals(c1118a.getUnknownFields())))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f52489e;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<C1118a> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeSInt64Size = (this.f52490a & 1) != 0 ? CodedOutputStream.computeSInt64Size(1, this.f52491b) : 0;
            if ((this.f52490a & 2) != 0) {
                iComputeSInt64Size += CodedOutputStream.computeEnumSize(2, this.f52492c);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeSInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = a.f52486a.hashCode() + 779;
            if ((this.f52490a & 1) != 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(this.f52491b);
            }
            if (a()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.f52492c;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return a.f52487b.ensureFieldAccessorsInitialized(C1118a.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.f52493d;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.f52493d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f52489e.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new C1118a();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.f52490a & 1) != 0) {
                codedOutputStream.writeSInt64(1, this.f52491b);
            }
            if ((this.f52490a & 2) != 0) {
                codedOutputStream.writeEnum(2, this.f52492c);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* JADX INFO: renamed from: com.garmin.net.omtanalytics.impl.upload.a$a$b */
        public static final class b extends GeneratedMessageV3.Builder<b> implements MessageOrBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f52494a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f52495b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f52496c;

            private b() {
                this.f52496c = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1118a buildPartial() {
                int i14;
                C1118a c1118a = new C1118a(this);
                int i15 = this.f52494a;
                if (i15 != 0) {
                    if ((i15 & 1) != 0) {
                        c1118a.f52491b = this.f52495b;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        c1118a.f52492c = this.f52496c;
                        i14 |= 2;
                    }
                    c1118a.f52490a |= i14;
                }
                onBuilt();
                return c1118a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            public final void b() {
                super.clear();
                this.f52494a = 0;
                this.f52495b = 0L;
                this.f52496c = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final Message build() {
                C1118a c1118aBuildPartial = buildPartial();
                if (c1118aBuildPartial.isInitialized()) {
                    return c1118aBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) c1118aBuildPartial);
            }

            public final void c(C1118a c1118a) {
                if (c1118a == C1118a.f52489e) {
                    return;
                }
                if ((c1118a.f52490a & 1) != 0) {
                    this.f52495b = c1118a.f52491b;
                    this.f52494a |= 1;
                    onChanged();
                }
                if (c1118a.a()) {
                    b bVarA = b.a(c1118a.f52492c);
                    if (bVarA == null) {
                        bVarA = b.DAYS;
                    }
                    bVarA.getClass();
                    this.f52494a |= 2;
                    this.f52496c = bVarA.f52505a;
                    onChanged();
                }
                onChanged();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
                b();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final AbstractMessage.Builder mo57clone() {
                return (b) super.mo57clone();
            }

            public final void d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f52495b = codedInputStream.readSInt64();
                                    this.f52494a |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (b.a(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.f52496c = i14;
                                        this.f52494a |= 2;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final Message getDefaultInstanceForType() {
                return C1118a.f52489e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return a.f52486a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return a.f52487b.ensureFieldAccessorsInitialized(C1118a.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof C1118a) {
                    c((C1118a) message);
                    return this;
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return C1118a.f52489e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
                b();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ Message.Builder clear() {
                b();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
                b();
                return this;
            }

            public /* synthetic */ b(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final AbstractMessageLite.Builder mo57clone() {
                return (b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (b) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ b(int i14) {
                this();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final GeneratedMessageV3.Builder mo57clone() {
                return (b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (b) super.mergeUnknownFields(unknownFieldSet);
            }

            private b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f52496c = 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final Message.Builder mo57clone() {
                return (b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final MessageLite.Builder mo57clone() {
                return (b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object mo57clone() {
                return (b) super.mo57clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                d(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                d(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                C1118a c1118aBuildPartial = buildPartial();
                if (c1118aBuildPartial.isInitialized()) {
                    return c1118aBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) c1118aBuildPartial);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                d(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                d(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof C1118a) {
                    c((C1118a) message);
                    return this;
                }
                super.mergeFrom(message);
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f52489e;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f52489e.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new b(builderParent, 0);
        }

        public /* synthetic */ C1118a(b bVar) {
            this((GeneratedMessageV3.Builder<?>) bVar);
        }

        private C1118a() {
            this.f52491b = 0L;
            this.f52493d = (byte) -1;
            this.f52492c = 0;
        }
    }

    public enum b implements ProtocolMessageEnum {
        DAYS(0),
        HOURS(1),
        MINUTES(2),
        SECONDS(3),
        MILLISECONDS(4),
        TICKS(5),
        MINMAX(15);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52505a;

        /* JADX INFO: renamed from: com.garmin.net.omtanalytics.impl.upload.a$b$a, reason: collision with other inner class name */
        public class C1120a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i14) {
                return b.a(i14);
            }
        }

        static {
            new C1120a();
            values();
        }

        b(int i14) {
            this.f52505a = i14;
        }

        public static b a(int i14) {
            if (i14 == 0) {
                return DAYS;
            }
            if (i14 == 1) {
                return HOURS;
            }
            if (i14 == 2) {
                return MINUTES;
            }
            if (i14 == 3) {
                return SECONDS;
            }
            if (i14 == 4) {
                return MILLISECONDS;
            }
            if (i14 == 5) {
                return TICKS;
            }
            if (i14 != 15) {
                return null;
            }
            return MINMAX;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return a.f52488c.getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f52505a;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return a.f52488c.getEnumTypes().get(0).getValues().get(ordinal());
        }
    }

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\tbcl.proto\u0012\u0003bcl\"B\n\bDateTime\u0012\r\n\u0005value\u0018\u0001 \u0001(\u0012\u0012'\n\u0005scale\u0018\u0002 \u0001(\u000e2\u0012.bcl.TimeSpanScale:\u0004DAYS*g\n\rTimeSpanScale\u0012\b\n\u0004DAYS\u0010\u0000\u0012\t\n\u0005HOURS\u0010\u0001\u0012\u000b\n\u0007MINUTES\u0010\u0002\u0012\u000b\n\u0007SECONDS\u0010\u0003\u0012\u0010\n\fMILLISECONDS\u0010\u0004\u0012\t\n\u0005TICKS\u0010\u0005\u0012\n\n\u0006MINMAX\u0010\u000fB3\n'com.garmin.net.omtanalytics.impl.uploadB\bBclProto"}, new Descriptors.FileDescriptor[0]);
        f52488c = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f52486a = descriptor;
        f52487b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Value", "Scale"});
    }

    private a() {
    }
}
