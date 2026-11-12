package com.xmlywind.sdk.common.models.ssp.pb;

import android.os.Parcelable;
import com.xmlywind.wire.AndroidMessage;
import com.xmlywind.wire.FieldEncoding;
import com.xmlywind.wire.Message;
import com.xmlywind.wire.ProtoAdapter;
import com.xmlywind.wire.ProtoReader;
import com.xmlywind.wire.ProtoWriter;
import com.xmlywind.wire.WireField;
import com.xmlywind.wire.internal.Internal;
import com.xmlywind.wire.okio.ByteString;

/* JADX INFO: loaded from: classes22.dex */
public final class DialogSetting extends AndroidMessage<DialogSetting, Builder> {
    public static final ProtoAdapter<DialogSetting> ADAPTER;
    public static final Parcelable.Creator<DialogSetting> CREATOR;
    public static final String DEFAULT_BODY_TEXT = "";
    public static final String DEFAULT_CANCEL_BUTTON_TEXT = "";
    public static final String DEFAULT_CLOSE_BUTTON_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String body_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String cancel_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String close_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String title;

    public static final class Builder extends Message.Builder<DialogSetting, Builder> {
        public String body_text;
        public String cancel_button_text;
        public String close_button_text;
        public String title;

        public Builder body_text(String str) {
            this.body_text = str;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public DialogSetting build() {
            return new DialogSetting(this.title, this.body_text, this.cancel_button_text, this.close_button_text, super.buildUnknownFields());
        }

        public Builder cancel_button_text(String str) {
            this.cancel_button_text = str;
            return this;
        }

        public Builder close_button_text(String str) {
            this.close_button_text = str;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    public static final class ProtoAdapter_DialogSetting extends ProtoAdapter<DialogSetting> {
        public ProtoAdapter_DialogSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, DialogSetting.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public DialogSetting decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.title(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.body_text(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.cancel_button_text(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.close_button_text(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, DialogSetting dialogSetting) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, dialogSetting.title);
            protoAdapter.encodeWithTag(protoWriter, 2, dialogSetting.body_text);
            protoAdapter.encodeWithTag(protoWriter, 3, dialogSetting.cancel_button_text);
            protoAdapter.encodeWithTag(protoWriter, 4, dialogSetting.close_button_text);
            protoWriter.writeBytes(dialogSetting.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(DialogSetting dialogSetting) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, dialogSetting.title) + protoAdapter.encodedSizeWithTag(2, dialogSetting.body_text) + protoAdapter.encodedSizeWithTag(3, dialogSetting.cancel_button_text) + protoAdapter.encodedSizeWithTag(4, dialogSetting.close_button_text) + dialogSetting.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public DialogSetting redact(DialogSetting dialogSetting) {
            Builder builderNewBuilder = dialogSetting.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_DialogSetting protoAdapter_DialogSetting = new ProtoAdapter_DialogSetting();
        ADAPTER = protoAdapter_DialogSetting;
        CREATOR = AndroidMessage.newCreator(protoAdapter_DialogSetting);
    }

    public DialogSetting(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public DialogSetting(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.body_text = str2;
        this.cancel_button_text = str3;
        this.close_button_text = str4;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof DialogSetting)) {
                return false;
            }
            DialogSetting dialogSetting = (DialogSetting) obj;
            if (!unknownFields().equals(dialogSetting.unknownFields()) || !Internal.equals(this.title, dialogSetting.title) || !Internal.equals(this.body_text, dialogSetting.body_text) || !Internal.equals(this.cancel_button_text, dialogSetting.cancel_button_text) || !Internal.equals(this.close_button_text, dialogSetting.close_button_text)) {
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
        String str = this.title;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.body_text;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.cancel_button_text;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.close_button_text;
        int iHashCode5 = ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37) + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.body_text = this.body_text;
        builder.cancel_button_text = this.cancel_button_text;
        builder.close_button_text = this.close_button_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.body_text != null) {
            sb.append(", body_text=");
            sb.append(this.body_text);
        }
        if (this.cancel_button_text != null) {
            sb.append(", cancel_button_text=");
            sb.append(this.cancel_button_text);
        }
        if (this.close_button_text != null) {
            sb.append(", close_button_text=");
            sb.append(this.close_button_text);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "DialogSetting{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
