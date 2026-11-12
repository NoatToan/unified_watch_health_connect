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
public final class Android extends AndroidMessage<Android, Builder> {
    public static final ProtoAdapter<Android> ADAPTER;
    public static final Parcelable.Creator<Android> CREATOR;
    public static final Integer DEFAULT_APK_EXPIRED_TIME;
    public static final Boolean DEFAULT_DISABLEUPAPPINFO;
    public static final Boolean DEFAULT_DISABLE_BOOT_MARK;
    public static final Integer DEFAULT_DISABLE_UP_OAID;
    public static final Boolean DEFAULT_ENABLE_PERMISSION;
    public static final Boolean DEFAULT_ENABLE_REPORT_CRASH;
    public static final Boolean DEFAULT_OAID_API_IS_DISABLE;
    public static final Integer DEFAULT_REPORT_LOG;
    public static final Integer DEFAULT_UP_WIFI_LIST_INTERVAL;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 6)
    public final Integer apk_expired_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean disableUpAppInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public final Boolean disable_boot_mark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 4)
    public final Integer disable_up_oaid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean enable_permission;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean enable_report_crash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean oaid_api_is_disable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer report_log;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    public final Integer up_wifi_list_interval;

    public static final class Builder extends Message.Builder<Android, Builder> {
        public Boolean disableUpAppInfo = Android.DEFAULT_DISABLEUPAPPINFO;
        public Integer report_log = Android.DEFAULT_REPORT_LOG;
        public Integer up_wifi_list_interval = Android.DEFAULT_UP_WIFI_LIST_INTERVAL;
        public Integer disable_up_oaid = Android.DEFAULT_DISABLE_UP_OAID;
        public Boolean enable_permission = Android.DEFAULT_ENABLE_PERMISSION;
        public Integer apk_expired_time = Android.DEFAULT_APK_EXPIRED_TIME;
        public Boolean enable_report_crash = Android.DEFAULT_ENABLE_REPORT_CRASH;
        public Boolean oaid_api_is_disable = Android.DEFAULT_OAID_API_IS_DISABLE;
        public Boolean disable_boot_mark = Android.DEFAULT_DISABLE_BOOT_MARK;

        public Builder apk_expired_time(Integer num) {
            this.apk_expired_time = num;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public Android build() {
            return new Android(this.disableUpAppInfo, this.report_log, this.up_wifi_list_interval, this.disable_up_oaid, this.enable_permission, this.apk_expired_time, this.enable_report_crash, this.oaid_api_is_disable, this.disable_boot_mark, super.buildUnknownFields());
        }

        public Builder disableUpAppInfo(Boolean bool) {
            this.disableUpAppInfo = bool;
            return this;
        }

        public Builder disable_boot_mark(Boolean bool) {
            this.disable_boot_mark = bool;
            return this;
        }

        public Builder disable_up_oaid(Integer num) {
            this.disable_up_oaid = num;
            return this;
        }

        public Builder enable_permission(Boolean bool) {
            this.enable_permission = bool;
            return this;
        }

        public Builder enable_report_crash(Boolean bool) {
            this.enable_report_crash = bool;
            return this;
        }

        public Builder oaid_api_is_disable(Boolean bool) {
            this.oaid_api_is_disable = bool;
            return this;
        }

        public Builder report_log(Integer num) {
            this.report_log = num;
            return this;
        }

        public Builder up_wifi_list_interval(Integer num) {
            this.up_wifi_list_interval = num;
            return this;
        }
    }

    public static final class ProtoAdapter_Android extends ProtoAdapter<Android> {
        public ProtoAdapter_Android() {
            super(FieldEncoding.LENGTH_DELIMITED, Android.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public Android decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                switch (iNextTag) {
                    case 1:
                        builder.disableUpAppInfo(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 2:
                        builder.report_log(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 3:
                        builder.up_wifi_list_interval(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 4:
                        builder.disable_up_oaid(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 5:
                        builder.enable_permission(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 6:
                        builder.apk_expired_time(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 7:
                        builder.enable_report_crash(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 8:
                        builder.oaid_api_is_disable(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 9:
                        builder.disable_boot_mark(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Android android2) {
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, android2.disableUpAppInfo);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, android2.report_log);
            protoAdapter2.encodeWithTag(protoWriter, 3, android2.up_wifi_list_interval);
            protoAdapter2.encodeWithTag(protoWriter, 4, android2.disable_up_oaid);
            protoAdapter.encodeWithTag(protoWriter, 5, android2.enable_permission);
            protoAdapter2.encodeWithTag(protoWriter, 6, android2.apk_expired_time);
            protoAdapter.encodeWithTag(protoWriter, 7, android2.enable_report_crash);
            protoAdapter.encodeWithTag(protoWriter, 8, android2.oaid_api_is_disable);
            protoAdapter.encodeWithTag(protoWriter, 9, android2.disable_boot_mark);
            protoWriter.writeBytes(android2.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(Android android2) {
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, android2.disableUpAppInfo);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, android2.report_log) + protoAdapter2.encodedSizeWithTag(3, android2.up_wifi_list_interval) + protoAdapter2.encodedSizeWithTag(4, android2.disable_up_oaid) + protoAdapter.encodedSizeWithTag(5, android2.enable_permission) + protoAdapter2.encodedSizeWithTag(6, android2.apk_expired_time) + protoAdapter.encodedSizeWithTag(7, android2.enable_report_crash) + protoAdapter.encodedSizeWithTag(8, android2.oaid_api_is_disable) + protoAdapter.encodedSizeWithTag(9, android2.disable_boot_mark) + android2.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public Android redact(Android android2) {
            Builder builderNewBuilder = android2.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_Android protoAdapter_Android = new ProtoAdapter_Android();
        ADAPTER = protoAdapter_Android;
        CREATOR = AndroidMessage.newCreator(protoAdapter_Android);
        Boolean bool = Boolean.FALSE;
        DEFAULT_DISABLEUPAPPINFO = bool;
        DEFAULT_REPORT_LOG = 0;
        DEFAULT_UP_WIFI_LIST_INTERVAL = 0;
        DEFAULT_DISABLE_UP_OAID = 0;
        DEFAULT_ENABLE_PERMISSION = bool;
        DEFAULT_APK_EXPIRED_TIME = 0;
        DEFAULT_ENABLE_REPORT_CRASH = bool;
        DEFAULT_OAID_API_IS_DISABLE = bool;
        DEFAULT_DISABLE_BOOT_MARK = bool;
    }

    public Android(Boolean bool, Integer num, Integer num2, Integer num3, Boolean bool2, Integer num4, Boolean bool3, Boolean bool4, Boolean bool5) {
        this(bool, num, num2, num3, bool2, num4, bool3, bool4, bool5, ByteString.EMPTY);
    }

    public Android(Boolean bool, Integer num, Integer num2, Integer num3, Boolean bool2, Integer num4, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.disableUpAppInfo = bool;
        this.report_log = num;
        this.up_wifi_list_interval = num2;
        this.disable_up_oaid = num3;
        this.enable_permission = bool2;
        this.apk_expired_time = num4;
        this.enable_report_crash = bool3;
        this.oaid_api_is_disable = bool4;
        this.disable_boot_mark = bool5;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Android)) {
                return false;
            }
            Android android2 = (Android) obj;
            if (!unknownFields().equals(android2.unknownFields()) || !Internal.equals(this.disableUpAppInfo, android2.disableUpAppInfo) || !Internal.equals(this.report_log, android2.report_log) || !Internal.equals(this.up_wifi_list_interval, android2.up_wifi_list_interval) || !Internal.equals(this.disable_up_oaid, android2.disable_up_oaid) || !Internal.equals(this.enable_permission, android2.enable_permission) || !Internal.equals(this.apk_expired_time, android2.apk_expired_time) || !Internal.equals(this.enable_report_crash, android2.enable_report_crash) || !Internal.equals(this.oaid_api_is_disable, android2.oaid_api_is_disable) || !Internal.equals(this.disable_boot_mark, android2.disable_boot_mark)) {
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
        Boolean bool = this.disableUpAppInfo;
        int iHashCode2 = bool != null ? bool.hashCode() : 0;
        Integer num = this.report_log;
        int iHashCode3 = num != null ? num.hashCode() : 0;
        Integer num2 = this.up_wifi_list_interval;
        int iHashCode4 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.disable_up_oaid;
        int iHashCode5 = num3 != null ? num3.hashCode() : 0;
        Boolean bool2 = this.enable_permission;
        int iHashCode6 = bool2 != null ? bool2.hashCode() : 0;
        Integer num4 = this.apk_expired_time;
        int iHashCode7 = num4 != null ? num4.hashCode() : 0;
        Boolean bool3 = this.enable_report_crash;
        int iHashCode8 = bool3 != null ? bool3.hashCode() : 0;
        Boolean bool4 = this.oaid_api_is_disable;
        int iHashCode9 = bool4 != null ? bool4.hashCode() : 0;
        Boolean bool5 = this.disable_boot_mark;
        int iHashCode10 = ((iHashCode9 + ((iHashCode8 + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37) + (bool5 != null ? bool5.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.disableUpAppInfo = this.disableUpAppInfo;
        builder.report_log = this.report_log;
        builder.up_wifi_list_interval = this.up_wifi_list_interval;
        builder.disable_up_oaid = this.disable_up_oaid;
        builder.enable_permission = this.enable_permission;
        builder.apk_expired_time = this.apk_expired_time;
        builder.enable_report_crash = this.enable_report_crash;
        builder.oaid_api_is_disable = this.oaid_api_is_disable;
        builder.disable_boot_mark = this.disable_boot_mark;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.disableUpAppInfo != null) {
            sb.append(", disableUpAppInfo=");
            sb.append(this.disableUpAppInfo);
        }
        if (this.report_log != null) {
            sb.append(", report_log=");
            sb.append(this.report_log);
        }
        if (this.up_wifi_list_interval != null) {
            sb.append(", up_wifi_list_interval=");
            sb.append(this.up_wifi_list_interval);
        }
        if (this.disable_up_oaid != null) {
            sb.append(", disable_up_oaid=");
            sb.append(this.disable_up_oaid);
        }
        if (this.enable_permission != null) {
            sb.append(", enable_permission=");
            sb.append(this.enable_permission);
        }
        if (this.apk_expired_time != null) {
            sb.append(", apk_expired_time=");
            sb.append(this.apk_expired_time);
        }
        if (this.enable_report_crash != null) {
            sb.append(", enable_report_crash=");
            sb.append(this.enable_report_crash);
        }
        if (this.oaid_api_is_disable != null) {
            sb.append(", oaid_api_is_disable=");
            sb.append(this.oaid_api_is_disable);
        }
        if (this.disable_boot_mark != null) {
            sb.append(", disable_boot_mark=");
            sb.append(this.disable_boot_mark);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Android{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
