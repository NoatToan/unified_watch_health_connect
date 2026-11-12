package com.xmlywind.wire.protobuf;

import com.xmlywind.wire.FieldEncoding;
import com.xmlywind.wire.Message;
import com.xmlywind.wire.ProtoAdapter;
import com.xmlywind.wire.ProtoReader;
import com.xmlywind.wire.ProtoWriter;
import com.xmlywind.wire.WireField;
import com.xmlywind.wire.internal.Internal;
import com.xmlywind.wire.okio.ByteString;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class UninterpretedOption extends Message<UninterpretedOption, Builder> {
    public static final String DEFAULT_AGGREGATE_VALUE = "";
    public static final String DEFAULT_IDENTIFIER_VALUE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String aggregate_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 6)
    public final Double double_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String identifier_value;

    @WireField(adapter = "com.google.protobuf.UninterpretedOption$NamePart#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<NamePart> name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long negative_int_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 4)
    public final Long positive_int_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 7)
    public final ByteString string_value;
    public static final ProtoAdapter<UninterpretedOption> ADAPTER = new ProtoAdapter_UninterpretedOption();
    public static final Long DEFAULT_POSITIVE_INT_VALUE = 0L;
    public static final Long DEFAULT_NEGATIVE_INT_VALUE = 0L;
    public static final Double DEFAULT_DOUBLE_VALUE = Double.valueOf(0.0d);
    public static final ByteString DEFAULT_STRING_VALUE = ByteString.EMPTY;

    public static final class Builder extends Message.Builder<UninterpretedOption, Builder> {
        public String aggregate_value;
        public Double double_value;
        public String identifier_value;
        public List<NamePart> name = Internal.newMutableList();
        public Long negative_int_value;
        public Long positive_int_value;
        public ByteString string_value;

        public Builder aggregate_value(String str) {
            this.aggregate_value = str;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public UninterpretedOption build() {
            return new UninterpretedOption(this.name, this.identifier_value, this.positive_int_value, this.negative_int_value, this.double_value, this.string_value, this.aggregate_value, super.buildUnknownFields());
        }

        public Builder double_value(Double d) {
            this.double_value = d;
            return this;
        }

        public Builder identifier_value(String str) {
            this.identifier_value = str;
            return this;
        }

        public Builder name(List<NamePart> list) {
            Internal.checkElementsNotNull(list);
            this.name = list;
            return this;
        }

        public Builder negative_int_value(Long l) {
            this.negative_int_value = l;
            return this;
        }

        public Builder positive_int_value(Long l) {
            this.positive_int_value = l;
            return this;
        }

        public Builder string_value(ByteString byteString) {
            this.string_value = byteString;
            return this;
        }
    }

    public static final class NamePart extends Message<NamePart, Builder> {
        public static final ProtoAdapter<NamePart> ADAPTER = new ProtoAdapter_NamePart();
        public static final Boolean DEFAULT_IS_EXTENSION = Boolean.FALSE;
        public static final String DEFAULT_NAME_PART = "";
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
        public final Boolean is_extension;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public final String name_part;

        public static final class Builder extends Message.Builder<NamePart, Builder> {
            public Boolean is_extension;
            public String name_part;

            @Override // com.xmlywind.wire.Message.Builder
            public NamePart build() {
                String str = this.name_part;
                if (str == null || this.is_extension == null) {
                    throw Internal.missingRequiredFields(str, "name_part", this.is_extension, "is_extension");
                }
                return new NamePart(this.name_part, this.is_extension, super.buildUnknownFields());
            }

            public Builder is_extension(Boolean bool) {
                this.is_extension = bool;
                return this;
            }

            public Builder name_part(String str) {
                this.name_part = str;
                return this;
            }
        }

        public static final class ProtoAdapter_NamePart extends ProtoAdapter<NamePart> {
            public ProtoAdapter_NamePart() {
                super(FieldEncoding.LENGTH_DELIMITED, NamePart.class);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xmlywind.wire.ProtoAdapter
            public NamePart decode(ProtoReader protoReader) {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.build();
                    }
                    if (iNextTag == 1) {
                        builder.name_part(ProtoAdapter.STRING.decode(protoReader));
                    } else if (iNextTag != 2) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.is_extension(ProtoAdapter.BOOL.decode(protoReader));
                    }
                }
            }

            @Override // com.xmlywind.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, NamePart namePart) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, namePart.name_part);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, namePart.is_extension);
                protoWriter.writeBytes(namePart.unknownFields());
            }

            @Override // com.xmlywind.wire.ProtoAdapter
            public int encodedSize(NamePart namePart) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, namePart.name_part) + ProtoAdapter.BOOL.encodedSizeWithTag(2, namePart.is_extension) + namePart.unknownFields().size();
            }

            @Override // com.xmlywind.wire.ProtoAdapter
            public NamePart redact(NamePart namePart) {
                Builder builderNewBuilder = namePart.newBuilder();
                builderNewBuilder.clearUnknownFields();
                return builderNewBuilder.build();
            }
        }

        public NamePart(String str, Boolean bool) {
            this(str, bool, ByteString.EMPTY);
        }

        public NamePart(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name_part = str;
            this.is_extension = bool;
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                if (!(obj instanceof NamePart)) {
                    return false;
                }
                NamePart namePart = (NamePart) obj;
                if (!unknownFields().equals(namePart.unknownFields()) || !this.name_part.equals(namePart.name_part) || !this.is_extension.equals(namePart.is_extension)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.name_part.hashCode()) * 37) + this.is_extension.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.xmlywind.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.name_part = this.name_part;
            builder.is_extension = this.is_extension;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        @Override // com.xmlywind.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", name_part=");
            sb.append(this.name_part);
            sb.append(", is_extension=");
            sb.append(this.is_extension);
            StringBuilder sbReplace = sb.replace(0, 2, "NamePart{");
            sbReplace.append('}');
            return sbReplace.toString();
        }
    }

    public static final class ProtoAdapter_UninterpretedOption extends ProtoAdapter<UninterpretedOption> {
        public ProtoAdapter_UninterpretedOption() {
            super(FieldEncoding.LENGTH_DELIMITED, UninterpretedOption.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public UninterpretedOption decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                switch (iNextTag) {
                    case 2:
                        builder.name.add(NamePart.ADAPTER.decode(protoReader));
                        break;
                    case 3:
                        builder.identifier_value(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 4:
                        builder.positive_int_value(ProtoAdapter.UINT64.decode(protoReader));
                        break;
                    case 5:
                        builder.negative_int_value(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 6:
                        builder.double_value(ProtoAdapter.DOUBLE.decode(protoReader));
                        break;
                    case 7:
                        builder.string_value(ProtoAdapter.BYTES.decode(protoReader));
                        break;
                    case 8:
                        builder.aggregate_value(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, UninterpretedOption uninterpretedOption) {
            NamePart.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, uninterpretedOption.name);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, uninterpretedOption.identifier_value);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 4, uninterpretedOption.positive_int_value);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, uninterpretedOption.negative_int_value);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, uninterpretedOption.double_value);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 7, uninterpretedOption.string_value);
            protoAdapter.encodeWithTag(protoWriter, 8, uninterpretedOption.aggregate_value);
            protoWriter.writeBytes(uninterpretedOption.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(UninterpretedOption uninterpretedOption) {
            int iEncodedSizeWithTag = NamePart.ADAPTER.asRepeated().encodedSizeWithTag(2, uninterpretedOption.name);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, uninterpretedOption.identifier_value) + ProtoAdapter.UINT64.encodedSizeWithTag(4, uninterpretedOption.positive_int_value) + ProtoAdapter.INT64.encodedSizeWithTag(5, uninterpretedOption.negative_int_value) + ProtoAdapter.DOUBLE.encodedSizeWithTag(6, uninterpretedOption.double_value) + ProtoAdapter.BYTES.encodedSizeWithTag(7, uninterpretedOption.string_value) + protoAdapter.encodedSizeWithTag(8, uninterpretedOption.aggregate_value) + uninterpretedOption.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public UninterpretedOption redact(UninterpretedOption uninterpretedOption) {
            Builder builderNewBuilder = uninterpretedOption.newBuilder();
            Internal.redactElements(builderNewBuilder.name, NamePart.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public UninterpretedOption(List<NamePart> list, String str, Long l, Long l2, Double d, ByteString byteString, String str2) {
        this(list, str, l, l2, d, byteString, str2, ByteString.EMPTY);
    }

    public UninterpretedOption(List<NamePart> list, String str, Long l, Long l2, Double d, ByteString byteString, String str2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.name = Internal.immutableCopyOf("name", list);
        this.identifier_value = str;
        this.positive_int_value = l;
        this.negative_int_value = l2;
        this.double_value = d;
        this.string_value = byteString;
        this.aggregate_value = str2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof UninterpretedOption)) {
                return false;
            }
            UninterpretedOption uninterpretedOption = (UninterpretedOption) obj;
            if (!unknownFields().equals(uninterpretedOption.unknownFields()) || !this.name.equals(uninterpretedOption.name) || !Internal.equals(this.identifier_value, uninterpretedOption.identifier_value) || !Internal.equals(this.positive_int_value, uninterpretedOption.positive_int_value) || !Internal.equals(this.negative_int_value, uninterpretedOption.negative_int_value) || !Internal.equals(this.double_value, uninterpretedOption.double_value) || !Internal.equals(this.string_value, uninterpretedOption.string_value) || !Internal.equals(this.aggregate_value, uninterpretedOption.aggregate_value)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode();
        int iHashCode2 = this.name.hashCode();
        String str = this.identifier_value;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        Long l = this.positive_int_value;
        int iHashCode4 = l != null ? l.hashCode() : 0;
        Long l2 = this.negative_int_value;
        int iHashCode5 = l2 != null ? l2.hashCode() : 0;
        Double d = this.double_value;
        int iHashCode6 = d != null ? d.hashCode() : 0;
        ByteString byteString = this.string_value;
        int iHashCode7 = byteString != null ? byteString.hashCode() : 0;
        String str2 = this.aggregate_value;
        int iHashCode8 = ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + (((iHashCode * 37) + iHashCode2) * 37)) * 37)) * 37)) * 37)) * 37)) * 37) + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = Internal.copyOf("name", this.name);
        builder.identifier_value = this.identifier_value;
        builder.positive_int_value = this.positive_int_value;
        builder.negative_int_value = this.negative_int_value;
        builder.double_value = this.double_value;
        builder.string_value = this.string_value;
        builder.aggregate_value = this.aggregate_value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.name.isEmpty()) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.identifier_value != null) {
            sb.append(", identifier_value=");
            sb.append(this.identifier_value);
        }
        if (this.positive_int_value != null) {
            sb.append(", positive_int_value=");
            sb.append(this.positive_int_value);
        }
        if (this.negative_int_value != null) {
            sb.append(", negative_int_value=");
            sb.append(this.negative_int_value);
        }
        if (this.double_value != null) {
            sb.append(", double_value=");
            sb.append(this.double_value);
        }
        if (this.string_value != null) {
            sb.append(", string_value=");
            sb.append(this.string_value);
        }
        if (this.aggregate_value != null) {
            sb.append(", aggregate_value=");
            sb.append(this.aggregate_value);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "UninterpretedOption{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
