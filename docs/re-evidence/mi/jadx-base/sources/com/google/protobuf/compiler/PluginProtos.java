package com.google.protobuf.compiler;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.c;
import com.google.protobuf.c1;
import com.google.protobuf.d0;
import com.google.protobuf.g0;
import com.google.protobuf.h1;
import com.google.protobuf.j;
import com.google.protobuf.p0;
import com.google.protobuf.r1;
import com.google.protobuf.s0;
import com.google.protobuf.t;
import com.google.protobuf.z0;
import defpackage.bei;
import defpackage.ree;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class PluginProtos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Descriptors.b f9614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageV3.e f9615b;
    public static final Descriptors.b c;
    public static final GeneratedMessageV3.e d;
    public static final Descriptors.b e;
    public static final GeneratedMessageV3.e f;
    public static final Descriptors.b g;
    public static final GeneratedMessageV3.e h;
    public static Descriptors.FileDescriptor i = Descriptors.FileDescriptor.s(new String[]{"\n%google/protobuf/compiler/plugin.proto\u0012\u0018google.protobuf.compiler\u001a google/protobuf/descriptor.proto\"F\n\u0007Version\u0012\r\n\u0005major\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005minor\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005patch\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006suffix\u0018\u0004 \u0001(\t\"º\u0001\n\u0014CodeGeneratorRequest\u0012\u0018\n\u0010file_to_generate\u0018\u0001 \u0003(\t\u0012\u0011\n\tparameter\u0018\u0002 \u0001(\t\u00128\n\nproto_file\u0018\u000f \u0003(\u000b2$.google.protobuf.FileDescriptorProto\u0012;\n\u0010compiler_version\u0018\u0003 \u0001(\u000b2!.google.protobuf.compiler.Version\"Á\u0002\n\u0015CodeGeneratorResponse\u0012\r\n\u0005error\u0018\u0001 \u0001(\t\u0012\u001a\n\u0012supported_features\u0018\u0002 \u0001(\u0004\u0012B\n\u0004file\u0018\u000f \u0003(\u000b24.google.protobuf.compiler.CodeGeneratorResponse.File\u001a\u007f\n\u0004File\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0017\n\u000finsertion_point\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007content\u0018\u000f \u0001(\t\u0012?\n\u0013generated_code_info\u0018\u0010 \u0001(\u000b2\".google.protobuf.GeneratedCodeInfo\"8\n\u0007Feature\u0012\u0010\n\fFEATURE_NONE\u0010\u0000\u0012\u001b\n\u0017FEATURE_PROTO3_OPTIONAL\u0010\u0001BW\n\u001ccom.google.protobuf.compilerB\fPluginProtosZ)google.golang.org/protobuf/types/pluginpb"}, new Descriptors.FileDescriptor[]{DescriptorProtos.c0()});

    public static final class CodeGeneratorRequest extends GeneratedMessageV3 implements s0 {
        public static final int COMPILER_VERSION_FIELD_NUMBER = 3;
        public static final int FILE_TO_GENERATE_FIELD_NUMBER = 1;
        public static final int PARAMETER_FIELD_NUMBER = 2;
        public static final int PROTO_FILE_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Version compilerVersion_;
        private ree fileToGenerate_;
        private byte memoizedIsInitialized;
        private volatile Object parameter_;
        private List<DescriptorProtos.FileDescriptorProto> protoFile_;
        private static final CodeGeneratorRequest DEFAULT_INSTANCE = new CodeGeneratorRequest();

        @Deprecated
        public static final vkh<CodeGeneratorRequest> PARSER = new a();

        public static class a extends c<CodeGeneratorRequest> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorRequest parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
                return new CodeGeneratorRequest(jVar, tVar);
            }
        }

        public static CodeGeneratorRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return PluginProtos.c;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<CodeGeneratorRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorRequest)) {
                return super.equals(obj);
            }
            CodeGeneratorRequest codeGeneratorRequest = (CodeGeneratorRequest) obj;
            if (!m174getFileToGenerateList().equals(codeGeneratorRequest.m174getFileToGenerateList()) || hasParameter() != codeGeneratorRequest.hasParameter()) {
                return false;
            }
            if ((!hasParameter() || getParameter().equals(codeGeneratorRequest.getParameter())) && getProtoFileList().equals(codeGeneratorRequest.getProtoFileList()) && hasCompilerVersion() == codeGeneratorRequest.hasCompilerVersion()) {
                return (!hasCompilerVersion() || getCompilerVersion().equals(codeGeneratorRequest.getCompilerVersion())) && this.unknownFields.equals(codeGeneratorRequest.unknownFields);
            }
            return false;
        }

        public Version getCompilerVersion() {
            Version version = this.compilerVersion_;
            return version == null ? Version.getDefaultInstance() : version;
        }

        public b getCompilerVersionOrBuilder() {
            Version version = this.compilerVersion_;
            return version == null ? Version.getDefaultInstance() : version;
        }

        public String getFileToGenerate(int i) {
            return this.fileToGenerate_.get(i);
        }

        public ByteString getFileToGenerateBytes(int i) {
            return this.fileToGenerate_.getByteString(i);
        }

        public int getFileToGenerateCount() {
            return this.fileToGenerate_.size();
        }

        public String getParameter() {
            Object obj = this.parameter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.parameter_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getParameterBytes() {
            Object obj = this.parameter_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parameter_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<CodeGeneratorRequest> getParserForType() {
            return PARSER;
        }

        public DescriptorProtos.FileDescriptorProto getProtoFile(int i) {
            return this.protoFile_.get(i);
        }

        public int getProtoFileCount() {
            return this.protoFile_.size();
        }

        public List<DescriptorProtos.FileDescriptorProto> getProtoFileList() {
            return this.protoFile_;
        }

        public DescriptorProtos.j getProtoFileOrBuilder(int i) {
            return this.protoFile_.get(i);
        }

        public List<? extends DescriptorProtos.j> getProtoFileOrBuilderList() {
            return this.protoFile_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSizeNoTag = 0;
            for (int i2 = 0; i2 < this.fileToGenerate_.size(); i2++) {
                iComputeStringSizeNoTag += GeneratedMessageV3.computeStringSizeNoTag(this.fileToGenerate_.d(i2));
            }
            int size = iComputeStringSizeNoTag + m174getFileToGenerateList().size();
            if ((this.bitField0_ & 1) != 0) {
                size += GeneratedMessageV3.computeStringSize(2, this.parameter_);
            }
            if ((this.bitField0_ & 2) != 0) {
                size += CodedOutputStream.G(3, getCompilerVersion());
            }
            for (int i3 = 0; i3 < this.protoFile_.size(); i3++) {
                size += CodedOutputStream.G(15, this.protoFile_.get(i3));
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasCompilerVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasParameter() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getFileToGenerateCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m174getFileToGenerateList().hashCode();
            }
            if (hasParameter()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getParameter().hashCode();
            }
            if (getProtoFileCount() > 0) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + getProtoFileList().hashCode();
            }
            if (hasCompilerVersion()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getCompilerVersion().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return PluginProtos.d.d(CodeGeneratorRequest.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < getProtoFileCount(); i++) {
                if (!getProtoFile(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new CodeGeneratorRequest();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.fileToGenerate_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.fileToGenerate_.d(i));
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.parameter_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.K0(3, getCompilerVersion());
            }
            for (int i2 = 0; i2 < this.protoFile_.size(); i2++) {
                codedOutputStream.K0(15, this.protoFile_.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements s0 {
            public int e;
            public ree f;
            public Object g;
            public List<DescriptorProtos.FileDescriptorProto> h;
            public c1<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.b, DescriptorProtos.j> i;
            public Version j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public h1<Version, Version.b, b> f9616k;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    A();
                    y();
                }
            }

            public final c1<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.b, DescriptorProtos.j> A() {
                if (this.i == null) {
                    this.i = new c1<>(this.h, (this.e & 4) != 0, g(), isClean());
                    this.h = null;
                }
                return this.i;
            }

            public b B(Version version) {
                Version version2;
                h1<Version, Version.b, b> h1Var = this.f9616k;
                if (h1Var == null) {
                    if ((this.e & 8) == 0 || (version2 = this.j) == null || version2 == Version.getDefaultInstance()) {
                        this.j = version;
                    } else {
                        this.j = Version.newBuilder(this.j).y(version).buildPartial();
                    }
                    onChanged();
                } else {
                    h1Var.g(version);
                }
                this.e |= 8;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(j jVar, t tVar) throws Throwable {
                CodeGeneratorRequest codeGeneratorRequest = null;
                try {
                    try {
                        CodeGeneratorRequest partialFrom = CodeGeneratorRequest.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            F(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        CodeGeneratorRequest codeGeneratorRequest2 = (CodeGeneratorRequest) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            codeGeneratorRequest = codeGeneratorRequest2;
                            if (codeGeneratorRequest != null) {
                                F(codeGeneratorRequest);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (codeGeneratorRequest != null) {
                        F(codeGeneratorRequest);
                    }
                    throw th;
                }
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof CodeGeneratorRequest) {
                    return F((CodeGeneratorRequest) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b F(CodeGeneratorRequest codeGeneratorRequest) {
                if (codeGeneratorRequest == CodeGeneratorRequest.getDefaultInstance()) {
                    return this;
                }
                if (!codeGeneratorRequest.fileToGenerate_.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = codeGeneratorRequest.fileToGenerate_;
                        this.e &= -2;
                    } else {
                        v();
                        this.f.addAll(codeGeneratorRequest.fileToGenerate_);
                    }
                    onChanged();
                }
                if (codeGeneratorRequest.hasParameter()) {
                    this.e |= 2;
                    this.g = codeGeneratorRequest.parameter_;
                    onChanged();
                }
                if (this.i == null) {
                    if (!codeGeneratorRequest.protoFile_.isEmpty()) {
                        if (this.h.isEmpty()) {
                            this.h = codeGeneratorRequest.protoFile_;
                            this.e &= -5;
                        } else {
                            w();
                            this.h.addAll(codeGeneratorRequest.protoFile_);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorRequest.protoFile_.isEmpty()) {
                    if (this.i.j()) {
                        this.i.f();
                        this.i = null;
                        this.h = codeGeneratorRequest.protoFile_;
                        this.e &= -5;
                        this.i = GeneratedMessageV3.alwaysUseFieldBuilders ? A() : null;
                    } else {
                        this.i.b(codeGeneratorRequest.protoFile_);
                    }
                }
                if (codeGeneratorRequest.hasCompilerVersion()) {
                    B(codeGeneratorRequest.getCompilerVersion());
                }
                mo145mergeUnknownFields(((GeneratedMessageV3) codeGeneratorRequest).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return PluginProtos.c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return PluginProtos.d.d(CodeGeneratorRequest.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorRequest build() {
                CodeGeneratorRequest codeGeneratorRequestBuildPartial = buildPartial();
                if (codeGeneratorRequestBuildPartial.isInitialized()) {
                    return codeGeneratorRequestBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) codeGeneratorRequestBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorRequest buildPartial() {
                CodeGeneratorRequest codeGeneratorRequest = new CodeGeneratorRequest(this);
                int i = this.e;
                if ((i & 1) != 0) {
                    this.f = this.f.getUnmodifiableView();
                    this.e &= -2;
                }
                codeGeneratorRequest.fileToGenerate_ = this.f;
                int i2 = (i & 2) != 0 ? 1 : 0;
                codeGeneratorRequest.parameter_ = this.g;
                c1<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.b, DescriptorProtos.j> c1Var = this.i;
                if (c1Var == null) {
                    if ((this.e & 4) != 0) {
                        this.h = Collections.unmodifiableList(this.h);
                        this.e &= -5;
                    }
                    codeGeneratorRequest.protoFile_ = this.h;
                } else {
                    codeGeneratorRequest.protoFile_ = c1Var.d();
                }
                if ((i & 8) != 0) {
                    h1<Version, Version.b, b> h1Var = this.f9616k;
                    if (h1Var == null) {
                        codeGeneratorRequest.compilerVersion_ = this.j;
                    } else {
                        codeGeneratorRequest.compilerVersion_ = (Version) h1Var.b();
                    }
                    i2 |= 2;
                }
                codeGeneratorRequest.bitField0_ = i2;
                onBuilt();
                return codeGeneratorRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = g0.d;
                int i = this.e;
                this.g = "";
                this.e = i & (-4);
                c1<DescriptorProtos.FileDescriptorProto, DescriptorProtos.FileDescriptorProto.b, DescriptorProtos.j> c1Var = this.i;
                if (c1Var == null) {
                    this.h = Collections.emptyList();
                    this.e &= -5;
                } else {
                    c1Var.e();
                }
                h1<Version, Version.b, b> h1Var = this.f9616k;
                if (h1Var == null) {
                    this.j = null;
                } else {
                    h1Var.c();
                }
                this.e &= -9;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            public final void v() {
                if ((this.e & 1) == 0) {
                    this.f = new g0(this.f);
                    this.e |= 1;
                }
            }

            public final void w() {
                if ((this.e & 4) == 0) {
                    this.h = new ArrayList(this.h);
                    this.e |= 4;
                }
            }

            public Version x() {
                h1<Version, Version.b, b> h1Var = this.f9616k;
                if (h1Var != null) {
                    return (Version) h1Var.f();
                }
                Version version = this.j;
                return version == null ? Version.getDefaultInstance() : version;
            }

            public final h1<Version, Version.b, b> y() {
                if (this.f9616k == null) {
                    this.f9616k = new h1<>(x(), g(), isClean());
                    this.j = null;
                }
                return this.f9616k;
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorRequest getDefaultInstanceForType() {
                return CodeGeneratorRequest.getDefaultInstance();
            }

            public b() {
                this.f = g0.d;
                this.g = "";
                this.h = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = g0.d;
                this.g = "";
                this.h = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(CodeGeneratorRequest codeGeneratorRequest) {
            return DEFAULT_INSTANCE.toBuilder().F(codeGeneratorRequest);
        }

        public static CodeGeneratorRequest parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        /* JADX INFO: renamed from: getFileToGenerateList, reason: merged with bridge method [inline-methods] */
        public bei m174getFileToGenerateList() {
            return this.fileToGenerate_;
        }

        private CodeGeneratorRequest(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CodeGeneratorRequest parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static CodeGeneratorRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public CodeGeneratorRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().F(this);
        }

        public static CodeGeneratorRequest parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private CodeGeneratorRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.fileToGenerate_ = g0.d;
            this.parameter_ = "";
            this.protoFile_ = Collections.emptyList();
        }

        public static CodeGeneratorRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static CodeGeneratorRequest parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static CodeGeneratorRequest parseFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorRequest parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        private CodeGeneratorRequest(j jVar, t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                ByteString byteStringQ = jVar.q();
                                if ((i & 1) == 0) {
                                    this.fileToGenerate_ = new g0();
                                    i |= 1;
                                }
                                this.fileToGenerate_.n(byteStringQ);
                            } else if (iJ == 18) {
                                ByteString byteStringQ2 = jVar.q();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.parameter_ = byteStringQ2;
                            } else if (iJ == 26) {
                                Version.b builder = (this.bitField0_ & 2) != 0 ? this.compilerVersion_.toBuilder() : null;
                                Version version = (Version) jVar.z(Version.PARSER, tVar);
                                this.compilerVersion_ = version;
                                if (builder != null) {
                                    builder.y(version);
                                    this.compilerVersion_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (iJ != 122) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if ((i & 4) == 0) {
                                    this.protoFile_ = new ArrayList();
                                    i |= 4;
                                }
                                this.protoFile_.add((DescriptorProtos.FileDescriptorProto) jVar.z(DescriptorProtos.FileDescriptorProto.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 1) != 0) {
                        this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
                    }
                    if ((i & 4) != 0) {
                        this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 1) != 0) {
                this.fileToGenerate_ = this.fileToGenerate_.getUnmodifiableView();
            }
            if ((i & 4) != 0) {
                this.protoFile_ = Collections.unmodifiableList(this.protoFile_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static CodeGeneratorRequest parseFrom(j jVar) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static CodeGeneratorRequest parseFrom(j jVar, t tVar) throws IOException {
            return (CodeGeneratorRequest) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class CodeGeneratorResponse extends GeneratedMessageV3 implements s0 {
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int FILE_FIELD_NUMBER = 15;
        public static final int SUPPORTED_FEATURES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object error_;
        private List<File> file_;
        private byte memoizedIsInitialized;
        private long supportedFeatures_;
        private static final CodeGeneratorResponse DEFAULT_INSTANCE = new CodeGeneratorResponse();

        @Deprecated
        public static final vkh<CodeGeneratorResponse> PARSER = new a();

        public enum Feature implements z0 {
            FEATURE_NONE(0),
            FEATURE_PROTO3_OPTIONAL(1);

            public static final int FEATURE_NONE_VALUE = 0;
            public static final int FEATURE_PROTO3_OPTIONAL_VALUE = 1;
            private final int value;
            private static final d0.d<Feature> internalValueMap = new a();
            private static final Feature[] VALUES = values();

            public static class a implements d0.d<Feature> {
                @Override // com.google.protobuf.d0.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Feature findValueByNumber(int i) {
                    return Feature.forNumber(i);
                }
            }

            Feature(int i) {
                this.value = i;
            }

            public static Feature forNumber(int i) {
                if (i == 0) {
                    return FEATURE_NONE;
                }
                if (i != 1) {
                    return null;
                }
                return FEATURE_PROTO3_OPTIONAL;
            }

            public static final Descriptors.d getDescriptor() {
                return CodeGeneratorResponse.getDescriptor().m().get(0);
            }

            public static d0.d<Feature> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.d getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.d0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.e getValueDescriptor() {
                return getDescriptor().l().get(ordinal());
            }

            @Deprecated
            public static Feature valueOf(int i) {
                return forNumber(i);
            }

            public static Feature valueOf(Descriptors.e eVar) {
                if (eVar.i() == getDescriptor()) {
                    return VALUES[eVar.h()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static final class File extends GeneratedMessageV3 implements c {
            public static final int CONTENT_FIELD_NUMBER = 15;
            public static final int GENERATED_CODE_INFO_FIELD_NUMBER = 16;
            public static final int INSERTION_POINT_FIELD_NUMBER = 2;
            public static final int NAME_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object content_;
            private DescriptorProtos.GeneratedCodeInfo generatedCodeInfo_;
            private volatile Object insertionPoint_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private static final File DEFAULT_INSTANCE = new File();

            @Deprecated
            public static final vkh<File> PARSER = new a();

            public static class a extends com.google.protobuf.c<File> {
                @Override // defpackage.vkh
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public File parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
                    return new File(jVar, tVar);
                }
            }

            public static File getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.b getDescriptor() {
                return PluginProtos.g;
            }

            public static b newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static File parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static File parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static vkh<File> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof File)) {
                    return super.equals(obj);
                }
                File file = (File) obj;
                if (hasName() != file.hasName()) {
                    return false;
                }
                if ((hasName() && !getName().equals(file.getName())) || hasInsertionPoint() != file.hasInsertionPoint()) {
                    return false;
                }
                if ((hasInsertionPoint() && !getInsertionPoint().equals(file.getInsertionPoint())) || hasContent() != file.hasContent()) {
                    return false;
                }
                if ((!hasContent() || getContent().equals(file.getContent())) && hasGeneratedCodeInfo() == file.hasGeneratedCodeInfo()) {
                    return (!hasGeneratedCodeInfo() || getGeneratedCodeInfo().equals(file.getGeneratedCodeInfo())) && this.unknownFields.equals(file.unknownFields);
                }
                return false;
            }

            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.content_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public DescriptorProtos.GeneratedCodeInfo getGeneratedCodeInfo() {
                DescriptorProtos.GeneratedCodeInfo generatedCodeInfo = this.generatedCodeInfo_;
                return generatedCodeInfo == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : generatedCodeInfo;
            }

            public DescriptorProtos.l getGeneratedCodeInfoOrBuilder() {
                DescriptorProtos.GeneratedCodeInfo generatedCodeInfo = this.generatedCodeInfo_;
                return generatedCodeInfo == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : generatedCodeInfo;
            }

            public String getInsertionPoint() {
                Object obj = this.insertionPoint_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.insertionPoint_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getInsertionPointBytes() {
                Object obj = this.insertionPoint_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.insertionPoint_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public vkh<File> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.insertionPoint_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(15, this.content_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeStringSize += CodedOutputStream.G(16, getGeneratedCodeInfo());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
            public final r1 getUnknownFields() {
                return this.unknownFields;
            }

            public boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasGeneratedCodeInfo() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasInsertionPoint() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasName()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
                }
                if (hasInsertionPoint()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getInsertionPoint().hashCode();
                }
                if (hasContent()) {
                    iHashCode = (((iHashCode * 37) + 15) * 53) + getContent().hashCode();
                }
                if (hasGeneratedCodeInfo()) {
                    iHashCode = (((iHashCode * 37) + 16) * 53) + getGeneratedCodeInfo().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.e internalGetFieldAccessorTable() {
                return PluginProtos.h.d(File.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
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

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.f fVar) {
                return new File();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.insertionPoint_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 15, this.content_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.K0(16, getGeneratedCodeInfo());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class b extends GeneratedMessageV3.b<b> implements c {
                public int e;
                public Object f;
                public Object g;
                public Object h;
                public DescriptorProtos.GeneratedCodeInfo i;
                public h1<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.c, DescriptorProtos.l> j;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        x();
                    }
                }

                public b A(File file) {
                    if (file == File.getDefaultInstance()) {
                        return this;
                    }
                    if (file.hasName()) {
                        this.e |= 1;
                        this.f = file.name_;
                        onChanged();
                    }
                    if (file.hasInsertionPoint()) {
                        this.e |= 2;
                        this.g = file.insertionPoint_;
                        onChanged();
                    }
                    if (file.hasContent()) {
                        this.e |= 4;
                        this.h = file.content_;
                        onChanged();
                    }
                    if (file.hasGeneratedCodeInfo()) {
                        B(file.getGeneratedCodeInfo());
                    }
                    mo145mergeUnknownFields(((GeneratedMessageV3) file).unknownFields);
                    onChanged();
                    return this;
                }

                public b B(DescriptorProtos.GeneratedCodeInfo generatedCodeInfo) {
                    DescriptorProtos.GeneratedCodeInfo generatedCodeInfo2;
                    h1<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.c, DescriptorProtos.l> h1Var = this.j;
                    if (h1Var == null) {
                        if ((this.e & 8) == 0 || (generatedCodeInfo2 = this.i) == null || generatedCodeInfo2 == DescriptorProtos.GeneratedCodeInfo.getDefaultInstance()) {
                            this.i = generatedCodeInfo;
                        } else {
                            this.i = DescriptorProtos.GeneratedCodeInfo.newBuilder(this.i).z(generatedCodeInfo).buildPartial();
                        }
                        onChanged();
                    } else {
                        h1Var.g(generatedCodeInfo);
                    }
                    this.e |= 8;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
                public final b mo145mergeUnknownFields(r1 r1Var) {
                    return (b) super.mo145mergeUnknownFields(r1Var);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r1 r1Var) {
                    return (b) super.setUnknownFields(r1Var);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
                public Descriptors.b getDescriptorForType() {
                    return PluginProtos.g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                public GeneratedMessageV3.e h() {
                    return PluginProtos.h.d(File.class, b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public File build() {
                    File fileBuildPartial = buildPartial();
                    if (fileBuildPartial.isInitialized()) {
                        return fileBuildPartial;
                    }
                    throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) fileBuildPartial);
                }

                @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public File buildPartial() {
                    File file = new File(this);
                    int i = this.e;
                    int i2 = (i & 1) != 0 ? 1 : 0;
                    file.name_ = this.f;
                    if ((i & 2) != 0) {
                        i2 |= 2;
                    }
                    file.insertionPoint_ = this.g;
                    if ((i & 4) != 0) {
                        i2 |= 4;
                    }
                    file.content_ = this.h;
                    if ((i & 8) != 0) {
                        h1<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.c, DescriptorProtos.l> h1Var = this.j;
                        if (h1Var == null) {
                            file.generatedCodeInfo_ = this.i;
                        } else {
                            file.generatedCodeInfo_ = (DescriptorProtos.GeneratedCodeInfo) h1Var.b();
                        }
                        i2 |= 8;
                    }
                    file.bitField0_ = i2;
                    onBuilt();
                    return file;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b mo142clear() {
                    super.mo142clear();
                    this.f = "";
                    int i = this.e;
                    this.g = "";
                    this.h = "";
                    this.e = i & (-8);
                    h1<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.c, DescriptorProtos.l> h1Var = this.j;
                    if (h1Var == null) {
                        this.i = null;
                    } else {
                        h1Var.c();
                    }
                    this.e &= -9;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.h hVar) {
                    return (b) super.clearOneof(hVar);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.b
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b mo144clone() {
                    return (b) super.mo144clone();
                }

                @Override // defpackage.bsf, com.google.protobuf.s0
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public File getDefaultInstanceForType() {
                    return File.getDefaultInstance();
                }

                public DescriptorProtos.GeneratedCodeInfo w() {
                    h1<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.c, DescriptorProtos.l> h1Var = this.j;
                    if (h1Var != null) {
                        return (DescriptorProtos.GeneratedCodeInfo) h1Var.f();
                    }
                    DescriptorProtos.GeneratedCodeInfo generatedCodeInfo = this.i;
                    return generatedCodeInfo == null ? DescriptorProtos.GeneratedCodeInfo.getDefaultInstance() : generatedCodeInfo;
                }

                public final h1<DescriptorProtos.GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo.c, DescriptorProtos.l> x() {
                    if (this.j == null) {
                        this.j = new h1<>(w(), g(), isClean());
                        this.i = null;
                    }
                    return this.j;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(j jVar, t tVar) throws Throwable {
                    File file = null;
                    try {
                        try {
                            File partialFrom = File.PARSER.parsePartialFrom(jVar, tVar);
                            if (partialFrom != null) {
                                A(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            File file2 = (File) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                file = file2;
                                if (file != null) {
                                    A(file);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (file != null) {
                            A(file);
                        }
                        throw th;
                    }
                }

                @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(p0 p0Var) {
                    if (p0Var instanceof File) {
                        return A((File) p0Var);
                    }
                    super.mergeFrom(p0Var);
                    return this;
                }

                public b() {
                    this.f = "";
                    this.g = "";
                    this.h = "";
                    maybeForceBuilderInitialization();
                }

                public b(GeneratedMessageV3.c cVar) {
                    super(cVar);
                    this.f = "";
                    this.g = "";
                    this.h = "";
                    maybeForceBuilderInitialization();
                }
            }

            public static b newBuilder(File file) {
                return DEFAULT_INSTANCE.toBuilder().A(file);
            }

            public static File parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, tVar);
            }

            private File(GeneratedMessageV3.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static File parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
                return (File) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
            }

            public static File parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
            public File getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b toBuilder() {
                return this == DEFAULT_INSTANCE ? new b() : new b().A(this);
            }

            public static File parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, tVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
            public b newBuilderForType() {
                return newBuilder();
            }

            private File() {
                this.memoizedIsInitialized = (byte) -1;
                this.name_ = "";
                this.insertionPoint_ = "";
                this.content_ = "";
            }

            public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public b newBuilderForType(GeneratedMessageV3.c cVar) {
                return new b(cVar);
            }

            public static File parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, tVar);
            }

            public static File parseFrom(InputStream inputStream) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static File parseFrom(InputStream inputStream, t tVar) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
            }

            private File(j jVar, t tVar) throws InvalidProtocolBufferException {
                this();
                tVar.getClass();
                r1.b bVarG = r1.g();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iJ = jVar.J();
                            if (iJ != 0) {
                                if (iJ == 10) {
                                    ByteString byteStringQ = jVar.q();
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.name_ = byteStringQ;
                                } else if (iJ == 18) {
                                    ByteString byteStringQ2 = jVar.q();
                                    this.bitField0_ |= 2;
                                    this.insertionPoint_ = byteStringQ2;
                                } else if (iJ == 122) {
                                    ByteString byteStringQ3 = jVar.q();
                                    this.bitField0_ |= 4;
                                    this.content_ = byteStringQ3;
                                } else if (iJ != 130) {
                                    if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                    }
                                } else {
                                    DescriptorProtos.GeneratedCodeInfo.c builder = (this.bitField0_ & 8) != 0 ? this.generatedCodeInfo_.toBuilder() : null;
                                    DescriptorProtos.GeneratedCodeInfo generatedCodeInfo = (DescriptorProtos.GeneratedCodeInfo) jVar.z(DescriptorProtos.GeneratedCodeInfo.PARSER, tVar);
                                    this.generatedCodeInfo_ = generatedCodeInfo;
                                    if (builder != null) {
                                        builder.z(generatedCodeInfo);
                                        this.generatedCodeInfo_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 8;
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static File parseFrom(j jVar) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
            }

            public static File parseFrom(j jVar, t tVar) throws IOException {
                return (File) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
            }
        }

        public static class a extends com.google.protobuf.c<CodeGeneratorResponse> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
                return new CodeGeneratorResponse(jVar, tVar);
            }
        }

        public interface c extends s0 {
        }

        public static CodeGeneratorResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return PluginProtos.e;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<CodeGeneratorResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorResponse)) {
                return super.equals(obj);
            }
            CodeGeneratorResponse codeGeneratorResponse = (CodeGeneratorResponse) obj;
            if (hasError() != codeGeneratorResponse.hasError()) {
                return false;
            }
            if ((!hasError() || getError().equals(codeGeneratorResponse.getError())) && hasSupportedFeatures() == codeGeneratorResponse.hasSupportedFeatures()) {
                return (!hasSupportedFeatures() || getSupportedFeatures() == codeGeneratorResponse.getSupportedFeatures()) && getFileList().equals(codeGeneratorResponse.getFileList()) && this.unknownFields.equals(codeGeneratorResponse.unknownFields);
            }
            return false;
        }

        public String getError() {
            Object obj = this.error_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.error_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getErrorBytes() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public File getFile(int i) {
            return this.file_.get(i);
        }

        public int getFileCount() {
            return this.file_.size();
        }

        public List<File> getFileList() {
            return this.file_;
        }

        public c getFileOrBuilder(int i) {
            return this.file_.get(i);
        }

        public List<? extends c> getFileOrBuilderList() {
            return this.file_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<CodeGeneratorResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.error_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.a0(2, this.supportedFeatures_);
            }
            for (int i2 = 0; i2 < this.file_.size(); i2++) {
                iComputeStringSize += CodedOutputStream.G(15, this.file_.get(i2));
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getSupportedFeatures() {
            return this.supportedFeatures_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSupportedFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasError()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getError().hashCode();
            }
            if (hasSupportedFeatures()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + d0.i(getSupportedFeatures());
            }
            if (getFileCount() > 0) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + getFileList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return PluginProtos.f.d(CodeGeneratorResponse.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
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

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new CodeGeneratorResponse();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.error_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.d1(2, this.supportedFeatures_);
            }
            for (int i = 0; i < this.file_.size(); i++) {
                codedOutputStream.K0(15, this.file_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements s0 {
            public int e;
            public Object f;
            public long g;
            public List<File> h;
            public c1<File, File.b, c> i;

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    x();
                }
            }

            private void v() {
                if ((this.e & 4) == 0) {
                    this.h = new ArrayList(this.h);
                    this.e |= 4;
                }
            }

            private c1<File, File.b, c> x() {
                if (this.i == null) {
                    this.i = new c1<>(this.h, (this.e & 4) != 0, g(), isClean());
                    this.h = null;
                }
                return this.i;
            }

            public b A(CodeGeneratorResponse codeGeneratorResponse) {
                if (codeGeneratorResponse == CodeGeneratorResponse.getDefaultInstance()) {
                    return this;
                }
                if (codeGeneratorResponse.hasError()) {
                    this.e |= 1;
                    this.f = codeGeneratorResponse.error_;
                    onChanged();
                }
                if (codeGeneratorResponse.hasSupportedFeatures()) {
                    D(codeGeneratorResponse.getSupportedFeatures());
                }
                if (this.i == null) {
                    if (!codeGeneratorResponse.file_.isEmpty()) {
                        if (this.h.isEmpty()) {
                            this.h = codeGeneratorResponse.file_;
                            this.e &= -5;
                        } else {
                            v();
                            this.h.addAll(codeGeneratorResponse.file_);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorResponse.file_.isEmpty()) {
                    if (this.i.j()) {
                        this.i.f();
                        this.i = null;
                        this.h = codeGeneratorResponse.file_;
                        this.e &= -5;
                        this.i = GeneratedMessageV3.alwaysUseFieldBuilders ? x() : null;
                    } else {
                        this.i.b(codeGeneratorResponse.file_);
                    }
                }
                mo145mergeUnknownFields(((GeneratedMessageV3) codeGeneratorResponse).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b D(long j) {
                this.e |= 2;
                this.g = j;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return PluginProtos.e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return PluginProtos.f.d(CodeGeneratorResponse.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse build() {
                CodeGeneratorResponse codeGeneratorResponseBuildPartial = buildPartial();
                if (codeGeneratorResponseBuildPartial.isInitialized()) {
                    return codeGeneratorResponseBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) codeGeneratorResponseBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse buildPartial() {
                CodeGeneratorResponse codeGeneratorResponse = new CodeGeneratorResponse(this);
                int i = this.e;
                int i2 = (i & 1) != 0 ? 1 : 0;
                codeGeneratorResponse.error_ = this.f;
                if ((i & 2) != 0) {
                    codeGeneratorResponse.supportedFeatures_ = this.g;
                    i2 |= 2;
                }
                c1<File, File.b, c> c1Var = this.i;
                if (c1Var == null) {
                    if ((this.e & 4) != 0) {
                        this.h = Collections.unmodifiableList(this.h);
                        this.e &= -5;
                    }
                    codeGeneratorResponse.file_ = this.h;
                } else {
                    codeGeneratorResponse.file_ = c1Var.d();
                }
                codeGeneratorResponse.bitField0_ = i2;
                onBuilt();
                return codeGeneratorResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = "";
                int i = this.e;
                this.g = 0L;
                this.e = i & (-4);
                c1<File, File.b, c> c1Var = this.i;
                if (c1Var == null) {
                    this.h = Collections.emptyList();
                    this.e &= -5;
                } else {
                    c1Var.e();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse getDefaultInstanceForType() {
                return CodeGeneratorResponse.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(j jVar, t tVar) throws Throwable {
                CodeGeneratorResponse codeGeneratorResponse = null;
                try {
                    try {
                        CodeGeneratorResponse partialFrom = CodeGeneratorResponse.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            A(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        CodeGeneratorResponse codeGeneratorResponse2 = (CodeGeneratorResponse) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            codeGeneratorResponse = codeGeneratorResponse2;
                            if (codeGeneratorResponse != null) {
                                A(codeGeneratorResponse);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (codeGeneratorResponse != null) {
                        A(codeGeneratorResponse);
                    }
                    throw th;
                }
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof CodeGeneratorResponse) {
                    return A((CodeGeneratorResponse) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b() {
                this.f = "";
                this.h = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.f = "";
                this.h = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(CodeGeneratorResponse codeGeneratorResponse) {
            return DEFAULT_INSTANCE.toBuilder().A(codeGeneratorResponse);
        }

        public static CodeGeneratorResponse parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private CodeGeneratorResponse(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CodeGeneratorResponse parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static CodeGeneratorResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public CodeGeneratorResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().A(this);
        }

        public static CodeGeneratorResponse parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private CodeGeneratorResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.error_ = "";
            this.file_ = Collections.emptyList();
        }

        public static CodeGeneratorResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static CodeGeneratorResponse parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static CodeGeneratorResponse parseFrom(InputStream inputStream) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private CodeGeneratorResponse(j jVar, t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            char c2 = 0;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.error_ = byteStringQ;
                            } else if (iJ == 16) {
                                this.bitField0_ |= 2;
                                this.supportedFeatures_ = jVar.L();
                            } else if (iJ != 122) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                if ((c2 & 4) == 0) {
                                    this.file_ = new ArrayList();
                                    c2 = 4;
                                }
                                this.file_.add((File) jVar.z(File.PARSER, tVar));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c2 & 4) != 0) {
                        this.file_ = Collections.unmodifiableList(this.file_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c2 & 4) != 0) {
                this.file_ = Collections.unmodifiableList(this.file_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static CodeGeneratorResponse parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static CodeGeneratorResponse parseFrom(j jVar) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static CodeGeneratorResponse parseFrom(j jVar, t tVar) throws IOException {
            return (CodeGeneratorResponse) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public static final class Version extends GeneratedMessageV3 implements b {
        public static final int MAJOR_FIELD_NUMBER = 1;
        public static final int MINOR_FIELD_NUMBER = 2;
        public static final int PATCH_FIELD_NUMBER = 3;
        public static final int SUFFIX_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int major_;
        private byte memoizedIsInitialized;
        private int minor_;
        private int patch_;
        private volatile Object suffix_;
        private static final Version DEFAULT_INSTANCE = new Version();

        @Deprecated
        public static final vkh<Version> PARSER = new a();

        public static class a extends c<Version> {
            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Version parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
                return new Version(jVar, tVar);
            }
        }

        public static Version getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.b getDescriptor() {
            return PluginProtos.f9614a;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Version parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Version parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static vkh<Version> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Version)) {
                return super.equals(obj);
            }
            Version version = (Version) obj;
            if (hasMajor() != version.hasMajor()) {
                return false;
            }
            if ((hasMajor() && getMajor() != version.getMajor()) || hasMinor() != version.hasMinor()) {
                return false;
            }
            if ((hasMinor() && getMinor() != version.getMinor()) || hasPatch() != version.hasPatch()) {
                return false;
            }
            if ((!hasPatch() || getPatch() == version.getPatch()) && hasSuffix() == version.hasSuffix()) {
                return (!hasSuffix() || getSuffix().equals(version.getSuffix())) && this.unknownFields.equals(version.unknownFields);
            }
            return false;
        }

        public int getMajor() {
            return this.major_;
        }

        public int getMinor() {
            return this.minor_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public vkh<Version> getParserForType() {
            return PARSER;
        }

        public int getPatch() {
            return this.patch_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iX = (this.bitField0_ & 1) != 0 ? CodedOutputStream.x(1, this.major_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iX += CodedOutputStream.x(2, this.minor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iX += CodedOutputStream.x(3, this.patch_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iX += GeneratedMessageV3.computeStringSize(4, this.suffix_);
            }
            int serializedSize = iX + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public String getSuffix() {
            Object obj = this.suffix_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.suffix_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getSuffixBytes() {
            Object obj = this.suffix_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.suffix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasMajor() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMinor() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPatch() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSuffix() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasMajor()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMajor();
            }
            if (hasMinor()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMinor();
            }
            if (hasPatch()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getPatch();
            }
            if (hasSuffix()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getSuffix().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.e internalGetFieldAccessorTable() {
            return PluginProtos.f9615b.d(Version.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
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

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.f fVar) {
            return new Version();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.G0(1, this.major_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.G0(2, this.minor_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.G0(3, this.patch_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.suffix_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class b extends GeneratedMessageV3.b<b> implements b {
            public int e;
            public int f;
            public int g;
            public int h;
            public Object i;

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b B(int i) {
                this.e |= 1;
                this.f = i;
                onChanged();
                return this;
            }

            public b C(int i) {
                this.e |= 2;
                this.g = i;
                onChanged();
                return this;
            }

            public b D(int i) {
                this.e |= 4;
                this.h = i;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r1 r1Var) {
                return (b) super.setUnknownFields(r1Var);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
            public Descriptors.b getDescriptorForType() {
                return PluginProtos.f9614a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            public GeneratedMessageV3.e h() {
                return PluginProtos.f9615b.d(Version.class, b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public Version build() {
                Version versionBuildPartial = buildPartial();
                if (versionBuildPartial.isInitialized()) {
                    return versionBuildPartial;
                }
                throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) versionBuildPartial);
            }

            @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Version buildPartial() {
                int i;
                Version version = new Version(this);
                int i2 = this.e;
                if ((i2 & 1) != 0) {
                    version.major_ = this.f;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    version.minor_ = this.g;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    version.patch_ = this.h;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    i |= 8;
                }
                version.suffix_ = this.i;
                version.bitField0_ = i;
                onBuilt();
                return version;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo142clear() {
                super.mo142clear();
                this.f = 0;
                int i = this.e;
                this.g = 0;
                this.h = 0;
                this.i = "";
                this.e = i & (-16);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.h hVar) {
                return (b) super.clearOneof(hVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo144clone() {
                return (b) super.mo144clone();
            }

            @Override // defpackage.bsf, com.google.protobuf.s0
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public Version getDefaultInstanceForType() {
                return Version.getDefaultInstance();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(j jVar, t tVar) throws Throwable {
                Version version = null;
                try {
                    try {
                        Version partialFrom = Version.PARSER.parsePartialFrom(jVar, tVar);
                        if (partialFrom != null) {
                            y(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Version version2 = (Version) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            version = version2;
                            if (version != null) {
                                y(version);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (version != null) {
                        y(version);
                    }
                    throw th;
                }
            }

            @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(p0 p0Var) {
                if (p0Var instanceof Version) {
                    return y((Version) p0Var);
                }
                super.mergeFrom(p0Var);
                return this;
            }

            public b y(Version version) {
                if (version == Version.getDefaultInstance()) {
                    return this;
                }
                if (version.hasMajor()) {
                    B(version.getMajor());
                }
                if (version.hasMinor()) {
                    C(version.getMinor());
                }
                if (version.hasPatch()) {
                    D(version.getPatch());
                }
                if (version.hasSuffix()) {
                    this.e |= 8;
                    this.i = version.suffix_;
                    onChanged();
                }
                mo145mergeUnknownFields(((GeneratedMessageV3) version).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final b mo145mergeUnknownFields(r1 r1Var) {
                return (b) super.mo145mergeUnknownFields(r1Var);
            }

            public b() {
                this.i = "";
                maybeForceBuilderInitialization();
            }

            public b(GeneratedMessageV3.c cVar) {
                super(cVar);
                this.i = "";
                maybeForceBuilderInitialization();
            }
        }

        public static b newBuilder(Version version) {
            return DEFAULT_INSTANCE.toBuilder().y(version);
        }

        public static Version parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, tVar);
        }

        private Version(GeneratedMessageV3.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Version parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (Version) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
        }

        public static Version parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public Version getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b toBuilder() {
            return this == DEFAULT_INSTANCE ? new b() : new b().y(this);
        }

        public static Version parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, tVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public b newBuilderForType() {
            return newBuilder();
        }

        private Version() {
            this.memoizedIsInitialized = (byte) -1;
            this.suffix_ = "";
        }

        public static Version parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public b newBuilderForType(GeneratedMessageV3.c cVar) {
            return new b(cVar);
        }

        public static Version parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, tVar);
        }

        public static Version parseFrom(InputStream inputStream) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private Version(j jVar, t tVar) throws InvalidProtocolBufferException {
            this();
            tVar.getClass();
            r1.b bVarG = r1.g();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.bitField0_ |= 1;
                                this.major_ = jVar.x();
                            } else if (iJ == 16) {
                                this.bitField0_ |= 2;
                                this.minor_ = jVar.x();
                            } else if (iJ == 24) {
                                this.bitField0_ |= 4;
                                this.patch_ = jVar.x();
                            } else if (iJ != 34) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                ByteString byteStringQ = jVar.q();
                                this.bitField0_ |= 8;
                                this.suffix_ = byteStringQ;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Version parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
        }

        public static Version parseFrom(j jVar) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
        }

        public static Version parseFrom(j jVar, t tVar) throws IOException {
            return (Version) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
        }
    }

    public interface b extends s0 {
    }

    static {
        Descriptors.b bVar = i().m().get(0);
        f9614a = bVar;
        f9615b = new GeneratedMessageV3.e(bVar, new String[]{"Major", "Minor", "Patch", "Suffix"});
        Descriptors.b bVar2 = i().m().get(1);
        c = bVar2;
        d = new GeneratedMessageV3.e(bVar2, new String[]{"FileToGenerate", "Parameter", "ProtoFile", "CompilerVersion"});
        Descriptors.b bVar3 = i().m().get(2);
        e = bVar3;
        f = new GeneratedMessageV3.e(bVar3, new String[]{"Error", "SupportedFeatures", "File"});
        Descriptors.b bVar4 = bVar3.p().get(0);
        g = bVar4;
        h = new GeneratedMessageV3.e(bVar4, new String[]{"Name", "InsertionPoint", "Content", "GeneratedCodeInfo"});
        DescriptorProtos.c0();
    }

    public static Descriptors.FileDescriptor i() {
        return i;
    }
}
