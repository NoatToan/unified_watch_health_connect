package com.garmin.net.omtanalytics.impl.upload;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Descriptors.Descriptor f52506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f52507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Descriptors.Descriptor f52508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f52509d;

    public static final class a extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Serializable f52512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.garmin.net.omtanalytics.impl.upload.a.C1118a f52513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ByteString f52514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile Serializable f52515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f52516f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f52510g = new a();

        @Deprecated
        public static final Parser<a> PARSER = new C1121a();

        /* JADX INFO: renamed from: com.garmin.net.omtanalytics.impl.upload.b$a$a, reason: collision with other inner class name */
        public class C1121a extends AbstractParser<a> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C1122b builder = a.f52510g.toBuilder();
                try {
                    builder.e(codedInputStream, extensionRegistryLite);
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

        private a() {
            this.f52512b = "";
            ByteString byteString = ByteString.EMPTY;
            this.f52514d = byteString;
            this.f52515e = "";
            this.f52516f = (byte) -1;
            this.f52512b = "";
            this.f52514d = byteString;
            this.f52515e = "";
        }

        public static Parser<a> parser() {
            return PARSER;
        }

        public final String a() {
            Serializable serializable = this.f52512b;
            if (serializable instanceof String) {
                return (String) serializable;
            }
            ByteString byteString = (ByteString) serializable;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f52512b = stringUtf8;
            }
            return stringUtf8;
        }

        public final String b() {
            Serializable serializable = this.f52515e;
            if (serializable instanceof String) {
                return (String) serializable;
            }
            ByteString byteString = (ByteString) serializable;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f52515e = stringUtf8;
            }
            return stringUtf8;
        }

        public final com.garmin.net.omtanalytics.impl.upload.a.C1118a c() {
            com.garmin.net.omtanalytics.impl.upload.a.C1118a c1118a = this.f52513c;
            return c1118a == null ? com.garmin.net.omtanalytics.impl.upload.a.C1118a.f52489e : c1118a;
        }

        public final boolean d() {
            return (this.f52511a & 8) != 0;
        }

        public final boolean e() {
            return (this.f52511a & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (!(obj instanceof a)) {
                    return super.equals(obj);
                }
                a aVar = (a) obj;
                int i14 = this.f52511a;
                if (((i14 & 1) != 0) != ((aVar.f52511a & 1) != 0) || (((i14 & 1) != 0 && !a().equals(aVar.a())) || e() != aVar.e() || ((e() && !c().equals(aVar.c())) || f() != aVar.f() || ((f() && !this.f52514d.equals(aVar.f52514d)) || d() != aVar.d() || ((d() && !b().equals(aVar.b())) || !getUnknownFields().equals(aVar.getUnknownFields())))))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f() {
            return (this.f52511a & 4) != 0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C1122b toBuilder() {
            int i14 = 0;
            if (this == f52510g) {
                return new C1122b(i14);
            }
            C1122b c1122b = new C1122b(i14);
            c1122b.d(this);
            return c1122b;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f52510g;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<a> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.f52511a & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.f52512b) : 0;
            if ((this.f52511a & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, c());
            }
            if ((this.f52511a & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(3, this.f52514d);
            }
            if ((this.f52511a & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f52515e);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = b.f52508c.hashCode() + 779;
            if ((this.f52511a & 1) != 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + a().hashCode();
            }
            if (e()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + c().hashCode();
            }
            if (f()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.f52514d.hashCode();
            }
            if (d()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + b().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return b.f52509d.ensureFieldAccessorsInitialized(a.class, C1122b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.f52516f;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.f52516f = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f52510g.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new a();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.f52511a & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f52512b);
            }
            if ((this.f52511a & 2) != 0) {
                codedOutputStream.writeMessage(2, c());
            }
            if ((this.f52511a & 4) != 0) {
                codedOutputStream.writeBytes(3, this.f52514d);
            }
            if ((this.f52511a & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f52515e);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* JADX INFO: renamed from: com.garmin.net.omtanalytics.impl.upload.b$a$b, reason: collision with other inner class name */
        public static final class C1122b extends GeneratedMessageV3.Builder<C1122b> implements MessageOrBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f52517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Serializable f52518b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public com.garmin.net.omtanalytics.impl.upload.a.C1118a f52519c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public SingleFieldBuilderV3<com.garmin.net.omtanalytics.impl.upload.a.C1118a, com.garmin.net.omtanalytics.impl.upload.a.C1118a.b, Object> f52520d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public ByteString f52521e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Serializable f52522f;

            private C1122b() {
                this.f52518b = "";
                this.f52521e = ByteString.EMPTY;
                this.f52522f = "";
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    c();
                }
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a buildPartial() {
                int i14;
                a aVar = new a(this);
                int i15 = this.f52517a;
                if (i15 != 0) {
                    if ((i15 & 1) != 0) {
                        aVar.f52512b = this.f52518b;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        SingleFieldBuilderV3<com.garmin.net.omtanalytics.impl.upload.a.C1118a, com.garmin.net.omtanalytics.impl.upload.a.C1118a.b, Object> singleFieldBuilderV3 = this.f52520d;
                        aVar.f52513c = singleFieldBuilderV3 == null ? this.f52519c : (com.garmin.net.omtanalytics.impl.upload.a.C1118a) singleFieldBuilderV3.build();
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        aVar.f52514d = this.f52521e;
                        i14 |= 4;
                    }
                    if ((i15 & 8) != 0) {
                        aVar.f52515e = this.f52522f;
                        i14 |= 8;
                    }
                    aVar.f52511a |= i14;
                }
                onBuilt();
                return aVar;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C1122b) super.addRepeatedField(fieldDescriptor, obj);
            }

            public final void b() {
                super.clear();
                this.f52517a = 0;
                this.f52518b = "";
                this.f52519c = null;
                SingleFieldBuilderV3<com.garmin.net.omtanalytics.impl.upload.a.C1118a, com.garmin.net.omtanalytics.impl.upload.a.C1118a.b, Object> singleFieldBuilderV3 = this.f52520d;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.f52520d = null;
                }
                this.f52521e = ByteString.EMPTY;
                this.f52522f = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final Message build() {
                a aVarBuildPartial = buildPartial();
                if (aVarBuildPartial.isInitialized()) {
                    return aVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) aVarBuildPartial);
            }

            public final SingleFieldBuilderV3<com.garmin.net.omtanalytics.impl.upload.a.C1118a, com.garmin.net.omtanalytics.impl.upload.a.C1118a.b, Object> c() {
                com.garmin.net.omtanalytics.impl.upload.a.C1118a c1118a;
                SingleFieldBuilderV3<com.garmin.net.omtanalytics.impl.upload.a.C1118a, com.garmin.net.omtanalytics.impl.upload.a.C1118a.b, Object> singleFieldBuilderV3 = this.f52520d;
                if (singleFieldBuilderV3 == null) {
                    if (singleFieldBuilderV3 == null) {
                        c1118a = this.f52519c;
                        if (c1118a == null) {
                            c1118a = com.garmin.net.omtanalytics.impl.upload.a.C1118a.f52489e;
                        }
                    } else {
                        c1118a = (com.garmin.net.omtanalytics.impl.upload.a.C1118a) singleFieldBuilderV3.getMessage();
                    }
                    this.f52520d = new SingleFieldBuilderV3<>(c1118a, getParentForChildren(), isClean());
                    this.f52519c = null;
                }
                return this.f52520d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
                b();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C1122b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C1122b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final AbstractMessage.Builder mo57clone() {
                return (C1122b) super.mo57clone();
            }

            public final void d(a aVar) {
                com.garmin.net.omtanalytics.impl.upload.a.C1118a c1118a;
                if (aVar == a.f52510g) {
                    return;
                }
                if ((aVar.f52511a & 1) != 0) {
                    this.f52518b = aVar.f52512b;
                    this.f52517a |= 1;
                    onChanged();
                }
                if (aVar.e()) {
                    com.garmin.net.omtanalytics.impl.upload.a.C1118a c1118aC = aVar.c();
                    SingleFieldBuilderV3<com.garmin.net.omtanalytics.impl.upload.a.C1118a, com.garmin.net.omtanalytics.impl.upload.a.C1118a.b, Object> singleFieldBuilderV3 = this.f52520d;
                    if (singleFieldBuilderV3 == null) {
                        int i14 = this.f52517a;
                        if ((i14 & 2) == 0 || (c1118a = this.f52519c) == null || c1118a == com.garmin.net.omtanalytics.impl.upload.a.C1118a.f52489e) {
                            this.f52519c = c1118aC;
                        } else {
                            this.f52517a = i14 | 2;
                            onChanged();
                            ((com.garmin.net.omtanalytics.impl.upload.a.C1118a.b) c().getBuilder()).c(c1118aC);
                        }
                    } else {
                        singleFieldBuilderV3.mergeFrom(c1118aC);
                    }
                    if (this.f52519c != null) {
                        this.f52517a |= 2;
                        onChanged();
                    }
                }
                if (aVar.f()) {
                    ByteString byteString = aVar.f52514d;
                    byteString.getClass();
                    this.f52521e = byteString;
                    this.f52517a |= 4;
                    onChanged();
                }
                if (aVar.d()) {
                    this.f52522f = aVar.f52515e;
                    this.f52517a |= 8;
                    onChanged();
                }
                onChanged();
            }

            public final void e(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.f52518b = codedInputStream.readBytes();
                                    this.f52517a |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(c().getBuilder(), extensionRegistryLite);
                                    this.f52517a |= 2;
                                } else if (tag == 26) {
                                    this.f52521e = codedInputStream.readBytes();
                                    this.f52517a |= 4;
                                } else if (tag == 34) {
                                    this.f52522f = codedInputStream.readBytes();
                                    this.f52517a |= 8;
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
                return a.f52510g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return b.f52508c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return b.f52509d.ensureFieldAccessorsInitialized(a.class, C1122b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof a) {
                    d((a) message);
                    return this;
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1122b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C1122b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (C1122b) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1122b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return a.f52510g;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C1122b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C1122b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C1122b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final AbstractMessageLite.Builder mo57clone() {
                return (C1122b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1122b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C1122b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (C1122b) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1122b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C1122b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final GeneratedMessageV3.Builder mo57clone() {
                return (C1122b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1122b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final Message.Builder mo57clone() {
                return (C1122b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final MessageLite.Builder mo57clone() {
                return (C1122b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object mo57clone() {
                return (C1122b) super.mo57clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                e(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                e(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                a aVarBuildPartial = buildPartial();
                if (aVarBuildPartial.isInitialized()) {
                    return aVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) aVarBuildPartial);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                e(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                e(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof a) {
                    d((a) message);
                    return this;
                }
                super.mergeFrom(message);
                return this;
            }

            public /* synthetic */ C1122b(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ C1122b(int i14) {
                this();
            }

            private C1122b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f52518b = "";
                this.f52521e = ByteString.EMPTY;
                this.f52522f = "";
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    c();
                }
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f52510g;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f52510g.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C1122b(builderParent, 0);
        }

        private a(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f52512b = "";
            this.f52514d = ByteString.EMPTY;
            this.f52515e = "";
            this.f52516f = (byte) -1;
        }

        public /* synthetic */ a(C1122b c1122b) {
            this((GeneratedMessageV3.Builder<?>) c1122b);
        }
    }

    /* JADX INFO: renamed from: com.garmin.net.omtanalytics.impl.upload.b$b, reason: collision with other inner class name */
    public static final class C1123b extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<a> f52524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f52525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1123b f52523c = new C1123b();

        @Deprecated
        public static final Parser<C1123b> PARSER = new a();

        /* JADX INFO: renamed from: com.garmin.net.omtanalytics.impl.upload.b$b$a */
        public class a extends AbstractParser<C1123b> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C1124b builder = C1123b.f52523c.toBuilder();
                try {
                    builder.e(codedInputStream, extensionRegistryLite);
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

        private C1123b() {
            this.f52525b = (byte) -1;
            this.f52524a = Collections.EMPTY_LIST;
        }

        public static Parser<C1123b> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1124b toBuilder() {
            int i14 = 0;
            if (this == f52523c) {
                return new C1124b(i14);
            }
            C1124b c1124b = new C1124b(i14);
            c1124b.d(this);
            return c1124b;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1123b)) {
                return super.equals(obj);
            }
            C1123b c1123b = (C1123b) obj;
            return this.f52524a.equals(c1123b.f52524a) && getUnknownFields().equals(c1123b.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f52523c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<C1123b> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.f52524a.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f52524a.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = b.f52506a.hashCode() + 779;
            if (this.f52524a.size() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.f52524a.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return b.f52507b.ensureFieldAccessorsInitialized(C1123b.class, C1124b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.f52525b;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.f52525b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f52523c.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new C1123b();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.f52524a.size(); i14++) {
                codedOutputStream.writeMessage(1, this.f52524a.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* JADX INFO: renamed from: com.garmin.net.omtanalytics.impl.upload.b$b$b, reason: collision with other inner class name */
        public static final class C1124b extends GeneratedMessageV3.Builder<C1124b> implements MessageOrBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f52526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public List<a> f52527b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public RepeatedFieldBuilderV3<a, a.C1122b, Object> f52528c;

            private C1124b() {
                this.f52527b = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1123b buildPartial() {
                C1123b c1123b = new C1123b(this);
                RepeatedFieldBuilderV3<a, a.C1122b, Object> repeatedFieldBuilderV3 = this.f52528c;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.f52526a & 1) != 0) {
                        this.f52527b = Collections.unmodifiableList(this.f52527b);
                        this.f52526a &= -2;
                    }
                    c1123b.f52524a = this.f52527b;
                } else {
                    c1123b.f52524a = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return c1123b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C1124b) super.addRepeatedField(fieldDescriptor, obj);
            }

            public final void b() {
                super.clear();
                this.f52526a = 0;
                RepeatedFieldBuilderV3<a, a.C1122b, Object> repeatedFieldBuilderV3 = this.f52528c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f52527b = Collections.EMPTY_LIST;
                } else {
                    this.f52527b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f52526a &= -2;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final Message build() {
                C1123b c1123bBuildPartial = buildPartial();
                if (c1123bBuildPartial.isInitialized()) {
                    return c1123bBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) c1123bBuildPartial);
            }

            public final void c() {
                if ((this.f52526a & 1) == 0) {
                    this.f52527b = new ArrayList(this.f52527b);
                    this.f52526a |= 1;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
                b();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C1124b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C1124b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final AbstractMessage.Builder mo57clone() {
                return (C1124b) super.mo57clone();
            }

            public final void d(C1123b c1123b) {
                if (c1123b == C1123b.f52523c) {
                    return;
                }
                if (this.f52528c == null) {
                    if (!c1123b.f52524a.isEmpty()) {
                        if (this.f52527b.isEmpty()) {
                            this.f52527b = c1123b.f52524a;
                            this.f52526a &= -2;
                        } else {
                            c();
                            this.f52527b.addAll(c1123b.f52524a);
                        }
                        onChanged();
                    }
                } else if (!c1123b.f52524a.isEmpty()) {
                    boolean zIsEmpty = this.f52528c.isEmpty();
                    RepeatedFieldBuilderV3<a, a.C1122b, Object> repeatedFieldBuilderV3 = this.f52528c;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        RepeatedFieldBuilderV3<a, a.C1122b, Object> repeatedFieldBuilderV4 = null;
                        this.f52528c = null;
                        this.f52527b = c1123b.f52524a;
                        this.f52526a &= -2;
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            if (this.f52528c == null) {
                                this.f52528c = new RepeatedFieldBuilderV3<>(this.f52527b, (this.f52526a & 1) != 0, getParentForChildren(), isClean());
                                this.f52527b = null;
                            }
                            repeatedFieldBuilderV4 = this.f52528c;
                        }
                        this.f52528c = repeatedFieldBuilderV4;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(c1123b.f52524a);
                    }
                }
                onChanged();
            }

            public final void e(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    a aVar = (a) codedInputStream.readMessage(a.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<a, a.C1122b, Object> repeatedFieldBuilderV3 = this.f52528c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        c();
                                        this.f52527b.add(aVar);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(aVar);
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
                return C1123b.f52523c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return b.f52506a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return b.f52507b.ensureFieldAccessorsInitialized(C1123b.class, C1124b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof C1123b) {
                    d((C1123b) message);
                    return this;
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1124b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C1124b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (C1124b) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1124b) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return C1123b.f52523c;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C1124b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C1124b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C1124b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final AbstractMessageLite.Builder mo57clone() {
                return (C1124b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1124b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C1124b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (C1124b) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1124b) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ C1124b(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C1124b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final GeneratedMessageV3.Builder mo57clone() {
                return (C1124b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C1124b) super.mergeUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ C1124b(int i14) {
                this();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final Message.Builder mo57clone() {
                return (C1124b) super.mo57clone();
            }

            private C1124b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f52527b = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: clone */
            public final MessageLite.Builder mo57clone() {
                return (C1124b) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public final Object mo57clone() {
                return (C1124b) super.mo57clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                e(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                e(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                C1123b c1123bBuildPartial = buildPartial();
                if (c1123bBuildPartial.isInitialized()) {
                    return c1123bBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) c1123bBuildPartial);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                e(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                e(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof C1123b) {
                    d((C1123b) message);
                    return this;
                }
                super.mergeFrom(message);
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f52523c;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f52523c.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C1124b(builderParent, 0);
        }

        private C1123b(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f52525b = (byte) -1;
        }

        public /* synthetic */ C1123b(C1124b c1124b) {
            this((GeneratedMessageV3.Builder<?>) c1124b);
        }
    }

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!GenericAnalyticEventRequest.proto\u0012AGarmin.Cartography.Services.Interface.Proto.Application.Analytics\u001a\tbcl.proto\"\u0096\u0001\n\u001cGenericAnalyticEventsRequest\u0012v\n\u0015GenericAnalyticEvents\u0018\u0001 \u0003(\u000b2W.Garmin.Cartography.Services.Interface.Proto.Application.Analytics.GenericAnalyticEvent\"w\n\u0014GenericAnalyticEvent\u0012\u0011\n\tEventType\u0018\u0001 \u0001(\t\u0012 \n\tTimeStamp\u0018\u0002 \u0001(\u000b2\r.bcl.DateTime\u0012\u0015\n\rZippedPayload\u0018\u0003 \u0001(\f\u0012\u0013\n\u000bJsonPayload\u0018\u0004 \u0001(\tBK\n'com.garmin.net.omtanalytics.impl.uploadB GenericAnalyticEventRequestProto"}, new Descriptors.FileDescriptor[]{com.garmin.net.omtanalytics.impl.upload.a.f52488c});
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f52506a = descriptor;
        f52507b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"GenericAnalyticEvents"});
        Descriptors.Descriptor descriptor2 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(1);
        f52508c = descriptor2;
        f52509d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"EventType", "TimeStamp", "ZippedPayload", "JsonPayload"});
    }

    private b() {
    }
}
