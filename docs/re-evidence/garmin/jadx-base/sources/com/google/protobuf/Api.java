package com.google.protobuf;

import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Api extends GeneratedMessageV3 implements ApiOrBuilder {
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private List<Method> methods_;
    private List<Mixin> mixins_;
    private volatile Object name_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private volatile Object version_;
    private static final Api DEFAULT_INSTANCE = new Api();
    private static final Parser<Api> PARSER = new AbstractParser<Api>() { // from class: com.google.protobuf.Api.1
        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
            return super.parseDelimitedFrom(inputStream);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString) {
            return super.parseFrom(byteString);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream) {
            return super.parsePartialDelimitedFrom(inputStream);
        }

        @Override // com.google.protobuf.Parser
        public Api parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Api.newBuilder();
            try {
                builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                return builderNewBuilder.buildPartial();
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (UninitializedMessageException e14) {
                throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (IOException e15) {
                throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
            }
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return super.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return super.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return super.parsePartialDelimitedFrom(inputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(CodedInputStream codedInputStream) {
            return super.parseFrom(codedInputStream);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return super.parseFrom(codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
            return super.parseFrom(inputStream);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return super.parseFrom(inputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
            return super.parseFrom(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return super.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
            return super.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i14, int i15) {
            return super.parseFrom(bArr, i14, i15);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i14, int i15, ExtensionRegistryLite extensionRegistryLite) {
            return super.parseFrom(bArr, i14, i15, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return super.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return super.parsePartialFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream) {
            return super.parsePartialFrom(codedInputStream);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream) {
            return super.parsePartialFrom(inputStream);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return super.parsePartialFrom(inputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr) {
            return super.parsePartialFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i14, int i15) {
            return super.parsePartialFrom(bArr, i14, i15);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i14, int i15, ExtensionRegistryLite extensionRegistryLite) {
            return super.parsePartialFrom(bArr, i14, i15, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return super.parsePartialFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public /* bridge */ /* synthetic */ Object parsePartialFrom(ByteString byteString) {
            return super.parsePartialFrom(byteString);
        }
    };

    private Api() {
        this.name_ = "";
        this.version_ = "";
        this.syntax_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.methods_ = list;
        this.options_ = list;
        this.version_ = "";
        this.mixins_ = list;
        this.syntax_ = 0;
    }

    public static /* synthetic */ int access$1076(Api api, int i14) {
        int i15 = i14 | api.bitField0_;
        api.bitField0_ = i15;
        return i15;
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ApiProto.internal_static_google_protobuf_Api_descriptor;
    }

    public static Builder newBuilder(Api api) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream) {
        return (Api) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Api> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Api)) {
            return super.equals(obj);
        }
        Api api = (Api) obj;
        if (getName().equals(api.getName()) && getMethodsList().equals(api.getMethodsList()) && getOptionsList().equals(api.getOptionsList()) && getVersion().equals(api.getVersion()) && hasSourceContext() == api.hasSourceContext()) {
            return (!hasSourceContext() || getSourceContext().equals(api.getSourceContext())) && getMixinsList().equals(api.getMixinsList()) && this.syntax_ == api.syntax_ && getUnknownFields().equals(api.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Method getMethods(int i14) {
        return this.methods_.get(i14);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public MethodOrBuilder getMethodsOrBuilder(int i14) {
        return this.methods_.get(i14);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Mixin getMixins(int i14) {
        return this.mixins_.get(i14);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public MixinOrBuilder getMixinsOrBuilder(int i14) {
        return this.mixins_.get(i14);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Option getOptions(int i14) {
        return this.options_.get(i14);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public OptionOrBuilder getOptionsOrBuilder(int i14) {
        return this.options_.get(i14);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Api> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i14 = this.memoizedSize;
        if (i14 != -1) {
            return i14;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.name_) ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        for (int i15 = 0; i15 < this.methods_.size(); i15++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.methods_.get(i15));
        }
        for (int i16 = 0; i16 < this.options_.size(); i16++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.options_.get(i16));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, getSourceContext());
        }
        for (int i17 = 0; i17 < this.mixins_.size(); i17++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, this.mixins_.get(i17));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(7, this.syntax_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public SourceContextOrBuilder getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public ByteString getVersionBytes() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.version_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i14 = this.memoizedHashCode;
        if (i14 != 0) {
            return i14;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (getMethodsCount() > 0) {
            iHashCode = getMethodsList().hashCode() + e5.c(iHashCode, 37, 2, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + e5.c(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = getVersion().hashCode() + e5.c(iHashCode, 37, 4, 53);
        if (hasSourceContext()) {
            iHashCode2 = getSourceContext().hashCode() + e5.c(iHashCode2, 37, 5, 53);
        }
        if (getMixinsCount() > 0) {
            iHashCode2 = getMixinsList().hashCode() + e5.c(iHashCode2, 37, 6, 53);
        }
        int iHashCode3 = getUnknownFields().hashCode() + ((e5.c(iHashCode2, 37, 7, 53) + this.syntax_) * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(Api.class, Builder.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b14 = this.memoizedIsInitialized;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Api();
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i14 = 0; i14 < this.methods_.size(); i14++) {
            codedOutputStream.writeMessage(2, this.methods_.get(i14));
        }
        for (int i15 = 0; i15 < this.options_.size(); i15++) {
            codedOutputStream.writeMessage(3, this.options_.get(i15));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            codedOutputStream.writeMessage(5, getSourceContext());
        }
        for (int i16 = 0; i16 < this.mixins_.size(); i16++) {
            codedOutputStream.writeMessage(6, this.mixins_.get(i16));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.writeEnum(7, this.syntax_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ApiOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> methodsBuilder_;
        private List<Method> methods_;
        private RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> mixinsBuilder_;
        private List<Mixin> mixins_;
        private Object name_;
        private RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> optionsBuilder_;
        private List<Option> options_;
        private SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;
        private Object version_;

        private Builder() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.methods_ = list;
            this.options_ = list;
            this.version_ = "";
            this.mixins_ = list;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(Api api) {
            int i14;
            int i15 = this.bitField0_;
            if ((i15 & 1) != 0) {
                api.name_ = this.name_;
            }
            if ((i15 & 8) != 0) {
                api.version_ = this.version_;
            }
            if ((i15 & 16) != 0) {
                SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilderV3 = this.sourceContextBuilder_;
                api.sourceContext_ = singleFieldBuilderV3 == null ? this.sourceContext_ : (SourceContext) singleFieldBuilderV3.build();
                i14 = 1;
            } else {
                i14 = 0;
            }
            if ((i15 & 64) != 0) {
                api.syntax_ = this.syntax_;
            }
            Api.access$1076(api, i14);
        }

        private void buildPartialRepeatedFields(Api api) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.methods_ = Collections.unmodifiableList(this.methods_);
                    this.bitField0_ &= -3;
                }
                api.methods_ = this.methods_;
            } else {
                api.methods_ = repeatedFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV4 = this.optionsBuilder_;
            if (repeatedFieldBuilderV4 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -5;
                }
                api.options_ = this.options_;
            } else {
                api.options_ = repeatedFieldBuilderV4.build();
            }
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV5 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV5 != null) {
                api.mixins_ = repeatedFieldBuilderV5.build();
                return;
            }
            if ((this.bitField0_ & 32) != 0) {
                this.mixins_ = Collections.unmodifiableList(this.mixins_);
                this.bitField0_ &= -33;
            }
            api.mixins_ = this.mixins_;
        }

        private void ensureMethodsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.methods_ = new ArrayList(this.methods_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureMixinsIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
                this.mixins_ = new ArrayList(this.mixins_);
                this.bitField0_ |= 32;
            }
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 4;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ApiProto.internal_static_google_protobuf_Api_descriptor;
        }

        private RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> getMethodsFieldBuilder() {
            if (this.methodsBuilder_ == null) {
                this.methodsBuilder_ = new RepeatedFieldBuilderV3<>(this.methods_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.methods_ = null;
            }
            return this.methodsBuilder_;
        }

        private RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> getMixinsFieldBuilder() {
            if (this.mixinsBuilder_ == null) {
                this.mixinsBuilder_ = new RepeatedFieldBuilderV3<>(this.mixins_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                this.mixins_ = null;
            }
            return this.mixinsBuilder_;
        }

        private RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> getOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new RepeatedFieldBuilderV3<>(this.options_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> getSourceContextFieldBuilder() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContextBuilder_ = new SingleFieldBuilderV3<>(getSourceContext(), getParentForChildren(), isClean());
                this.sourceContext_ = null;
            }
            return this.sourceContextBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getMethodsFieldBuilder();
                getOptionsFieldBuilder();
                getSourceContextFieldBuilder();
                getMixinsFieldBuilder();
            }
        }

        public Builder addAllMethods(Iterable<? extends Method> iterable) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addAllMessages(iterable);
                return this;
            }
            ensureMethodsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.methods_);
            onChanged();
            return this;
        }

        public Builder addAllMixins(Iterable<? extends Mixin> iterable) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addAllMessages(iterable);
                return this;
            }
            ensureMixinsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.mixins_);
            onChanged();
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addAllMessages(iterable);
                return this;
            }
            ensureOptionsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.options_);
            onChanged();
            return this;
        }

        public Builder addMethods(Method.Builder builder) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.add(builder.build());
            onChanged();
            return this;
        }

        public Method.Builder addMethodsBuilder() {
            return (Method.Builder) getMethodsFieldBuilder().addBuilder(Method.getDefaultInstance());
        }

        public Builder addMixins(Mixin.Builder builder) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.add(builder.build());
            onChanged();
            return this;
        }

        public Mixin.Builder addMixinsBuilder() {
            return (Mixin.Builder) getMixinsFieldBuilder().addBuilder(Mixin.getDefaultInstance());
        }

        public Builder addOptions(Option.Builder builder) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(builder.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.add(builder.build());
            onChanged();
            return this;
        }

        public Option.Builder addOptionsBuilder() {
            return (Option.Builder) getOptionsFieldBuilder().addBuilder(Option.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Api build() {
            Api apiBuildPartial = buildPartial();
            if (apiBuildPartial.isInitialized()) {
                return apiBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) apiBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Api buildPartial() {
            Api api = new Api(this);
            buildPartialRepeatedFields(api);
            if (this.bitField0_ != 0) {
                buildPartial0(api);
            }
            onBuilt();
            return api;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.methods_ = Collections.EMPTY_LIST;
            } else {
                this.methods_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -3;
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV4 = this.optionsBuilder_;
            if (repeatedFieldBuilderV4 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                repeatedFieldBuilderV4.clear();
            }
            this.bitField0_ &= -5;
            this.version_ = "";
            this.sourceContext_ = null;
            SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilderV3 = this.sourceContextBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.sourceContextBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV5 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV5 == null) {
                this.mixins_ = Collections.EMPTY_LIST;
            } else {
                this.mixins_ = null;
                repeatedFieldBuilderV5.clear();
            }
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Builder clearMethods() {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
                return this;
            }
            this.methods_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearMixins() {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
                return this;
            }
            this.mixins_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = Api.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public Builder clearOptions() {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearSourceContext() {
            this.bitField0_ &= -17;
            this.sourceContext_ = null;
            SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilderV3 = this.sourceContextBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.sourceContextBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Builder clearSyntax() {
            this.bitField0_ &= -65;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearVersion() {
            this.version_ = Api.getDefaultInstance().getVersion();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo57clone() {
            return (Builder) super.mo57clone();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ApiProto.internal_static_google_protobuf_Api_descriptor;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Method getMethods(int i14) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.methods_.get(i14) : (Method) repeatedFieldBuilderV3.getMessage(i14);
        }

        public Method.Builder getMethodsBuilder(int i14) {
            return (Method.Builder) getMethodsFieldBuilder().getBuilder(i14);
        }

        public List<Method.Builder> getMethodsBuilderList() {
            return getMethodsFieldBuilder().getBuilderList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getMethodsCount() {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.methods_.size() : repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<Method> getMethodsList() {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.methods_) : repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public MethodOrBuilder getMethodsOrBuilder(int i14) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.methods_.get(i14) : (MethodOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.methods_);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Mixin getMixins(int i14) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.mixins_.get(i14) : (Mixin) repeatedFieldBuilderV3.getMessage(i14);
        }

        public Mixin.Builder getMixinsBuilder(int i14) {
            return (Mixin.Builder) getMixinsFieldBuilder().getBuilder(i14);
        }

        public List<Mixin.Builder> getMixinsBuilderList() {
            return getMixinsFieldBuilder().getBuilderList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getMixinsCount() {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.mixins_.size() : repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<Mixin> getMixinsList() {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.mixins_) : repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public MixinOrBuilder getMixinsOrBuilder(int i14) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.mixins_.get(i14) : (MixinOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.mixins_);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Option getOptions(int i14) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.options_.get(i14) : (Option) repeatedFieldBuilderV3.getMessage(i14);
        }

        public Option.Builder getOptionsBuilder(int i14) {
            return (Option.Builder) getOptionsFieldBuilder().getBuilder(i14);
        }

        public List<Option.Builder> getOptionsBuilderList() {
            return getOptionsFieldBuilder().getBuilderList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getOptionsCount() {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.options_.size() : repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<Option> getOptionsList() {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.options_) : repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public OptionOrBuilder getOptionsOrBuilder(int i14) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.options_.get(i14) : (OptionOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public SourceContext getSourceContext() {
            SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilderV3 = this.sourceContextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (SourceContext) singleFieldBuilderV3.getMessage();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        public SourceContext.Builder getSourceContextBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (SourceContext.Builder) getSourceContextFieldBuilder().getBuilder();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public SourceContextOrBuilder getSourceContextOrBuilder() {
            SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilderV3 = this.sourceContextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (SourceContextOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public ByteString getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.version_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(Api.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(Api api) {
            if (api == Api.getDefaultInstance()) {
                return this;
            }
            if (!api.getName().isEmpty()) {
                this.name_ = api.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.methodsBuilder_ == null) {
                if (!api.methods_.isEmpty()) {
                    if (this.methods_.isEmpty()) {
                        this.methods_ = api.methods_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMethodsIsMutable();
                        this.methods_.addAll(api.methods_);
                    }
                    onChanged();
                }
            } else if (!api.methods_.isEmpty()) {
                boolean zIsEmpty = this.methodsBuilder_.isEmpty();
                RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
                if (zIsEmpty) {
                    repeatedFieldBuilderV3.dispose();
                    this.methodsBuilder_ = null;
                    this.methods_ = api.methods_;
                    this.bitField0_ &= -3;
                    this.methodsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMethodsFieldBuilder() : null;
                } else {
                    repeatedFieldBuilderV3.addAllMessages(api.methods_);
                }
            }
            if (this.optionsBuilder_ == null) {
                if (!api.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = api.options_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(api.options_);
                    }
                    onChanged();
                }
            } else if (!api.options_.isEmpty()) {
                boolean zIsEmpty2 = this.optionsBuilder_.isEmpty();
                RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV4 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    repeatedFieldBuilderV4.dispose();
                    this.optionsBuilder_ = null;
                    this.options_ = api.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getOptionsFieldBuilder() : null;
                } else {
                    repeatedFieldBuilderV4.addAllMessages(api.options_);
                }
            }
            if (!api.getVersion().isEmpty()) {
                this.version_ = api.version_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (api.hasSourceContext()) {
                mergeSourceContext(api.getSourceContext());
            }
            if (this.mixinsBuilder_ == null) {
                if (!api.mixins_.isEmpty()) {
                    if (this.mixins_.isEmpty()) {
                        this.mixins_ = api.mixins_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureMixinsIsMutable();
                        this.mixins_.addAll(api.mixins_);
                    }
                    onChanged();
                }
            } else if (!api.mixins_.isEmpty()) {
                boolean zIsEmpty3 = this.mixinsBuilder_.isEmpty();
                RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV5 = this.mixinsBuilder_;
                if (zIsEmpty3) {
                    repeatedFieldBuilderV5.dispose();
                    this.mixinsBuilder_ = null;
                    this.mixins_ = api.mixins_;
                    this.bitField0_ &= -33;
                    this.mixinsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMixinsFieldBuilder() : null;
                } else {
                    repeatedFieldBuilderV5.addAllMessages(api.mixins_);
                }
            }
            if (api.syntax_ != 0) {
                setSyntaxValue(api.getSyntaxValue());
            }
            mergeUnknownFields(api.getUnknownFields());
            onChanged();
            return this;
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            SourceContext sourceContext2;
            SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilderV3 = this.sourceContextBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(sourceContext);
            } else if ((this.bitField0_ & 16) == 0 || (sourceContext2 = this.sourceContext_) == null || sourceContext2 == SourceContext.getDefaultInstance()) {
                this.sourceContext_ = sourceContext;
            } else {
                getSourceContextBuilder().mergeFrom(sourceContext);
            }
            if (this.sourceContext_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public Builder removeMethods(int i14) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.remove(i14);
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.remove(i14);
            onChanged();
            return this;
        }

        public Builder removeMixins(int i14) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.remove(i14);
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.remove(i14);
            onChanged();
            return this;
        }

        public Builder removeOptions(int i14) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.remove(i14);
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.remove(i14);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public Builder setMethods(int i14, Method.Builder builder) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i14, builder.build());
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.set(i14, builder.build());
            onChanged();
            return this;
        }

        public Builder setMixins(int i14, Mixin.Builder builder) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i14, builder.build());
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.set(i14, builder.build());
            onChanged();
            return this;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setOptions(int i14, Option.Builder builder) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i14, builder.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.set(i14, builder.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilderV3 = this.sourceContextBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.sourceContext_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 64;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public Builder setSyntaxValue(int i14) {
            this.syntax_ = i14;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public Builder setVersion(String str) {
            str.getClass();
            this.version_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Api getDefaultInstanceForType() {
            return Api.getDefaultInstance();
        }

        public Method.Builder addMethodsBuilder(int i14) {
            return (Method.Builder) getMethodsFieldBuilder().addBuilder(i14, Method.getDefaultInstance());
        }

        public Mixin.Builder addMixinsBuilder(int i14) {
            return (Mixin.Builder) getMixinsFieldBuilder().addBuilder(i14, Mixin.getDefaultInstance());
        }

        public Option.Builder addOptionsBuilder(int i14) {
            return (Option.Builder) getOptionsFieldBuilder().addBuilder(i14, Option.getDefaultInstance());
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.methods_ = list;
            this.options_ = list;
            this.version_ = "";
            this.mixins_ = list;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder addMethods(int i14, Method method) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.add(i14, method);
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.addMessage(i14, method);
            return this;
        }

        public Builder addMixins(int i14, Mixin mixin) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.add(i14, mixin);
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.addMessage(i14, mixin);
            return this;
        }

        public Builder addOptions(int i14, Option option) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(i14, option);
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.addMessage(i14, option);
            return this;
        }

        public Builder setMethods(int i14, Method method) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.set(i14, method);
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.setMessage(i14, method);
            return this;
        }

        public Builder setMixins(int i14, Mixin mixin) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.set(i14, mixin);
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.setMessage(i14, mixin);
            return this;
        }

        public Builder setOptions(int i14, Option option) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.set(i14, option);
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.setMessage(i14, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilderV3 = this.sourceContextBuilder_;
            if (singleFieldBuilderV3 == null) {
                sourceContext.getClass();
                this.sourceContext_ = sourceContext;
            } else {
                singleFieldBuilderV3.setMessage(sourceContext);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder addMethods(Method method) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.add(method);
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.addMessage(method);
            return this;
        }

        public Builder addMixins(Mixin mixin) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.add(mixin);
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.addMessage(mixin);
            return this;
        }

        public Builder addOptions(Option option) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(option);
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.addMessage(option);
            return this;
        }

        public Builder addMethods(int i14, Method.Builder builder) {
            RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodsIsMutable();
                this.methods_.add(i14, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.addMessage(i14, builder.build());
            return this;
        }

        public Builder addMixins(int i14, Mixin.Builder builder) {
            RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV3 = this.mixinsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMixinsIsMutable();
                this.mixins_.add(i14, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.addMessage(i14, builder.build());
            return this;
        }

        public Builder addOptions(int i14, Option.Builder builder) {
            RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV3 = this.optionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureOptionsIsMutable();
                this.options_.add(i14, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilderV3.addMessage(i14, builder.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Api) {
                return mergeFrom((Api) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            boolean z14 = false;
            while (!z14) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.name_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                Method method = (Method) codedInputStream.readMessage(Method.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilderV3 = this.methodsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureMethodsIsMutable();
                                    this.methods_.add(method);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(method);
                                }
                            } else if (tag == 26) {
                                Option option = (Option) codedInputStream.readMessage(Option.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilderV4 = this.optionsBuilder_;
                                if (repeatedFieldBuilderV4 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    repeatedFieldBuilderV4.addMessage(option);
                                }
                            } else if (tag == 34) {
                                this.version_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                codedInputStream.readMessage(getSourceContextFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16;
                            } else if (tag == 50) {
                                Mixin mixin = (Mixin) codedInputStream.readMessage(Mixin.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilderV5 = this.mixinsBuilder_;
                                if (repeatedFieldBuilderV5 == null) {
                                    ensureMixinsIsMutable();
                                    this.mixins_.add(mixin);
                                } else {
                                    repeatedFieldBuilderV5.addMessage(mixin);
                                }
                            } else if (tag != 56) {
                                if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.syntax_ = codedInputStream.readEnum();
                                this.bitField0_ |= 64;
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
            return this;
        }
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Api getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Api) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Api parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Api parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    public static Api parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Api parseFrom(InputStream inputStream) {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(CodedInputStream codedInputStream) {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    private Api(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.name_ = "";
        this.version_ = "";
        this.syntax_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }
}
