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
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class RvConfig extends AndroidMessage<RvConfig, Builder> {
    public static final ProtoAdapter<RvConfig> ADAPTER;
    public static final Parcelable.Creator<RvConfig> CREATOR;
    public static final Integer DEFAULT_CACHETOP;
    public static final Boolean DEFAULT_ENABLEEXITONVIDEOCLOSE;
    public static final Integer DEFAULT_ENDCARDCLOSEPOSITION;
    public static final Float DEFAULT_FINISHED;
    public static final Integer DEFAULT_IFMUTE;
    public static final Integer DEFAULT_LOADEXPIRED;
    public static final Integer DEFAULT_LOADPERIODTIME;
    public static final Integer DEFAULT_LOADTIMEOUT;
    public static final Integer DEFAULT_MUTEPOSTION;
    public static final Integer DEFAULT_SCREEN_CAPTURE;
    public static final Integer DEFAULT_SHOWCLOSE;
    public static final Integer DEFAULT_SKIPPERCENT;
    public static final Integer DEFAULT_SKIPSECONDS;
    public static final Integer DEFAULT_VIDEOCLOSEPOSITION;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer cacheTop;

    @WireField(adapter = "com.sigmob.sdk.base.models.ssp.pb.DialogSetting#ADAPTER", tag = 17)
    public final DialogSetting close_dialog_setting;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 16)
    public final Boolean enableExitOnVideoClose;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 9)
    public final Integer endcardClosePosition;

    @WireField(adapter = "com.sigmob.sdk.base.models.ssp.pb.RvEndpointsConfig#ADAPTER", tag = 1)
    public final RvEndpointsConfig endpoints;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 5)
    public final Float finished;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    public final Integer ifMute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 6)
    public final Integer loadExpired;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 11)
    public final Integer loadPeriodTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 7)
    public final Integer loadTimeout;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 10)
    public final Integer mutePostion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 13)
    public final Integer screen_capture;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REPEATED, tag = 14)
    public final List<Integer> screen_capture_times;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 4)
    public final Integer showClose;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 12)
    public final Integer skipPercent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public final Integer skipSeconds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 8)
    public final Integer videoClosePosition;

    public static final class Builder extends Message.Builder<RvConfig, Builder> {
        public DialogSetting close_dialog_setting;
        public RvEndpointsConfig endpoints;
        public Integer cacheTop = RvConfig.DEFAULT_CACHETOP;
        public Integer ifMute = RvConfig.DEFAULT_IFMUTE;
        public Integer showClose = RvConfig.DEFAULT_SHOWCLOSE;
        public Float finished = RvConfig.DEFAULT_FINISHED;
        public Integer loadExpired = RvConfig.DEFAULT_LOADEXPIRED;
        public Integer loadTimeout = RvConfig.DEFAULT_LOADTIMEOUT;
        public Integer videoClosePosition = RvConfig.DEFAULT_VIDEOCLOSEPOSITION;
        public Integer endcardClosePosition = RvConfig.DEFAULT_ENDCARDCLOSEPOSITION;
        public Integer mutePostion = RvConfig.DEFAULT_MUTEPOSTION;
        public Integer loadPeriodTime = RvConfig.DEFAULT_LOADPERIODTIME;
        public Integer skipPercent = RvConfig.DEFAULT_SKIPPERCENT;
        public Integer screen_capture = RvConfig.DEFAULT_SCREEN_CAPTURE;
        public Integer skipSeconds = RvConfig.DEFAULT_SKIPSECONDS;
        public Boolean enableExitOnVideoClose = RvConfig.DEFAULT_ENABLEEXITONVIDEOCLOSE;
        public List<Integer> screen_capture_times = Internal.newMutableList();

        @Override // com.xmlywind.wire.Message.Builder
        public RvConfig build() {
            return new RvConfig(this.endpoints, this.cacheTop, this.ifMute, this.showClose, this.finished, this.loadExpired, this.loadTimeout, this.videoClosePosition, this.endcardClosePosition, this.mutePostion, this.loadPeriodTime, this.skipPercent, this.screen_capture, this.screen_capture_times, this.skipSeconds, this.enableExitOnVideoClose, this.close_dialog_setting, super.buildUnknownFields());
        }

        public Builder cacheTop(Integer num) {
            this.cacheTop = num;
            return this;
        }

        public Builder close_dialog_setting(DialogSetting dialogSetting) {
            this.close_dialog_setting = dialogSetting;
            return this;
        }

        public Builder enableExitOnVideoClose(Boolean bool) {
            this.enableExitOnVideoClose = bool;
            return this;
        }

        public Builder endcardClosePosition(Integer num) {
            this.endcardClosePosition = num;
            return this;
        }

        public Builder endpoints(RvEndpointsConfig rvEndpointsConfig) {
            this.endpoints = rvEndpointsConfig;
            return this;
        }

        public Builder finished(Float f) {
            this.finished = f;
            return this;
        }

        public Builder ifMute(Integer num) {
            this.ifMute = num;
            return this;
        }

        public Builder loadExpired(Integer num) {
            this.loadExpired = num;
            return this;
        }

        public Builder loadPeriodTime(Integer num) {
            this.loadPeriodTime = num;
            return this;
        }

        public Builder loadTimeout(Integer num) {
            this.loadTimeout = num;
            return this;
        }

        public Builder mutePostion(Integer num) {
            this.mutePostion = num;
            return this;
        }

        public Builder screen_capture(Integer num) {
            this.screen_capture = num;
            return this;
        }

        public Builder screen_capture_times(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.screen_capture_times = list;
            return this;
        }

        public Builder showClose(Integer num) {
            this.showClose = num;
            return this;
        }

        public Builder skipPercent(Integer num) {
            this.skipPercent = num;
            return this;
        }

        public Builder skipSeconds(Integer num) {
            this.skipSeconds = num;
            return this;
        }

        public Builder videoClosePosition(Integer num) {
            this.videoClosePosition = num;
            return this;
        }
    }

    public static final class ProtoAdapter_RvConfig extends ProtoAdapter<RvConfig> {
        public ProtoAdapter_RvConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, RvConfig.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public RvConfig decode(ProtoReader protoReader) {
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
                        builder.endpoints(RvEndpointsConfig.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        builder.cacheTop(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 3:
                        builder.ifMute(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 4:
                        builder.showClose(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 5:
                        builder.finished(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 6:
                        builder.loadExpired(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 7:
                        builder.loadTimeout(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 8:
                        builder.videoClosePosition(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 9:
                        builder.endcardClosePosition(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 10:
                        builder.mutePostion(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 11:
                        builder.loadPeriodTime(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 12:
                        builder.skipPercent(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 13:
                        builder.screen_capture(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 14:
                        builder.screen_capture_times.add(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 15:
                        builder.skipSeconds(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 16:
                        builder.enableExitOnVideoClose(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 17:
                        builder.close_dialog_setting(DialogSetting.ADAPTER.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, RvConfig rvConfig) {
            RvEndpointsConfig.ADAPTER.encodeWithTag(protoWriter, 1, rvConfig.endpoints);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, rvConfig.cacheTop);
            protoAdapter.encodeWithTag(protoWriter, 3, rvConfig.ifMute);
            protoAdapter.encodeWithTag(protoWriter, 4, rvConfig.showClose);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, rvConfig.finished);
            protoAdapter.encodeWithTag(protoWriter, 6, rvConfig.loadExpired);
            protoAdapter.encodeWithTag(protoWriter, 7, rvConfig.loadTimeout);
            protoAdapter.encodeWithTag(protoWriter, 8, rvConfig.videoClosePosition);
            protoAdapter.encodeWithTag(protoWriter, 9, rvConfig.endcardClosePosition);
            protoAdapter.encodeWithTag(protoWriter, 10, rvConfig.mutePostion);
            protoAdapter.encodeWithTag(protoWriter, 11, rvConfig.loadPeriodTime);
            protoAdapter.encodeWithTag(protoWriter, 12, rvConfig.skipPercent);
            protoAdapter.encodeWithTag(protoWriter, 13, rvConfig.screen_capture);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 14, rvConfig.screen_capture_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, rvConfig.skipSeconds);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, rvConfig.enableExitOnVideoClose);
            DialogSetting.ADAPTER.encodeWithTag(protoWriter, 17, rvConfig.close_dialog_setting);
            protoWriter.writeBytes(rvConfig.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(RvConfig rvConfig) {
            int iEncodedSizeWithTag = RvEndpointsConfig.ADAPTER.encodedSizeWithTag(1, rvConfig.endpoints);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, rvConfig.cacheTop) + protoAdapter.encodedSizeWithTag(3, rvConfig.ifMute) + protoAdapter.encodedSizeWithTag(4, rvConfig.showClose) + ProtoAdapter.FLOAT.encodedSizeWithTag(5, rvConfig.finished) + protoAdapter.encodedSizeWithTag(6, rvConfig.loadExpired) + protoAdapter.encodedSizeWithTag(7, rvConfig.loadTimeout) + protoAdapter.encodedSizeWithTag(8, rvConfig.videoClosePosition) + protoAdapter.encodedSizeWithTag(9, rvConfig.endcardClosePosition) + protoAdapter.encodedSizeWithTag(10, rvConfig.mutePostion) + protoAdapter.encodedSizeWithTag(11, rvConfig.loadPeriodTime) + protoAdapter.encodedSizeWithTag(12, rvConfig.skipPercent) + protoAdapter.encodedSizeWithTag(13, rvConfig.screen_capture) + protoAdapter.asRepeated().encodedSizeWithTag(14, rvConfig.screen_capture_times) + ProtoAdapter.INT32.encodedSizeWithTag(15, rvConfig.skipSeconds) + ProtoAdapter.BOOL.encodedSizeWithTag(16, rvConfig.enableExitOnVideoClose) + DialogSetting.ADAPTER.encodedSizeWithTag(17, rvConfig.close_dialog_setting) + rvConfig.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public RvConfig redact(RvConfig rvConfig) {
            Builder builderNewBuilder = rvConfig.newBuilder();
            RvEndpointsConfig rvEndpointsConfig = builderNewBuilder.endpoints;
            if (rvEndpointsConfig != null) {
                builderNewBuilder.endpoints = RvEndpointsConfig.ADAPTER.redact(rvEndpointsConfig);
            }
            DialogSetting dialogSetting = builderNewBuilder.close_dialog_setting;
            if (dialogSetting != null) {
                builderNewBuilder.close_dialog_setting = DialogSetting.ADAPTER.redact(dialogSetting);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_RvConfig protoAdapter_RvConfig = new ProtoAdapter_RvConfig();
        ADAPTER = protoAdapter_RvConfig;
        CREATOR = AndroidMessage.newCreator(protoAdapter_RvConfig);
        DEFAULT_CACHETOP = 4;
        DEFAULT_IFMUTE = 0;
        DEFAULT_SHOWCLOSE = 0;
        DEFAULT_FINISHED = Float.valueOf(0.0f);
        DEFAULT_LOADEXPIRED = 0;
        DEFAULT_LOADTIMEOUT = 0;
        DEFAULT_VIDEOCLOSEPOSITION = 0;
        DEFAULT_ENDCARDCLOSEPOSITION = 0;
        DEFAULT_MUTEPOSTION = 0;
        DEFAULT_LOADPERIODTIME = 0;
        DEFAULT_SKIPPERCENT = 0;
        DEFAULT_SCREEN_CAPTURE = 0;
        DEFAULT_SKIPSECONDS = 0;
        DEFAULT_ENABLEEXITONVIDEOCLOSE = Boolean.FALSE;
    }

    public RvConfig(RvEndpointsConfig rvEndpointsConfig, Integer num, Integer num2, Integer num3, Float f, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, List<Integer> list, Integer num12, Boolean bool, DialogSetting dialogSetting) {
        this(rvEndpointsConfig, num, num2, num3, f, num4, num5, num6, num7, num8, num9, num10, num11, list, num12, bool, dialogSetting, ByteString.EMPTY);
    }

    public RvConfig(RvEndpointsConfig rvEndpointsConfig, Integer num, Integer num2, Integer num3, Float f, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, List<Integer> list, Integer num12, Boolean bool, DialogSetting dialogSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.endpoints = rvEndpointsConfig;
        this.cacheTop = num;
        this.ifMute = num2;
        this.showClose = num3;
        this.finished = f;
        this.loadExpired = num4;
        this.loadTimeout = num5;
        this.videoClosePosition = num6;
        this.endcardClosePosition = num7;
        this.mutePostion = num8;
        this.loadPeriodTime = num9;
        this.skipPercent = num10;
        this.screen_capture = num11;
        this.screen_capture_times = Internal.immutableCopyOf("screen_capture_times", list);
        this.skipSeconds = num12;
        this.enableExitOnVideoClose = bool;
        this.close_dialog_setting = dialogSetting;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RvConfig)) {
                return false;
            }
            RvConfig rvConfig = (RvConfig) obj;
            if (!unknownFields().equals(rvConfig.unknownFields()) || !Internal.equals(this.endpoints, rvConfig.endpoints) || !Internal.equals(this.cacheTop, rvConfig.cacheTop) || !Internal.equals(this.ifMute, rvConfig.ifMute) || !Internal.equals(this.showClose, rvConfig.showClose) || !Internal.equals(this.finished, rvConfig.finished) || !Internal.equals(this.loadExpired, rvConfig.loadExpired) || !Internal.equals(this.loadTimeout, rvConfig.loadTimeout) || !Internal.equals(this.videoClosePosition, rvConfig.videoClosePosition) || !Internal.equals(this.endcardClosePosition, rvConfig.endcardClosePosition) || !Internal.equals(this.mutePostion, rvConfig.mutePostion) || !Internal.equals(this.loadPeriodTime, rvConfig.loadPeriodTime) || !Internal.equals(this.skipPercent, rvConfig.skipPercent) || !Internal.equals(this.screen_capture, rvConfig.screen_capture) || !this.screen_capture_times.equals(rvConfig.screen_capture_times) || !Internal.equals(this.skipSeconds, rvConfig.skipSeconds) || !Internal.equals(this.enableExitOnVideoClose, rvConfig.enableExitOnVideoClose) || !Internal.equals(this.close_dialog_setting, rvConfig.close_dialog_setting)) {
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
        RvEndpointsConfig rvEndpointsConfig = this.endpoints;
        int iHashCode2 = rvEndpointsConfig != null ? rvEndpointsConfig.hashCode() : 0;
        Integer num = this.cacheTop;
        int iHashCode3 = num != null ? num.hashCode() : 0;
        Integer num2 = this.ifMute;
        int iHashCode4 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.showClose;
        int iHashCode5 = num3 != null ? num3.hashCode() : 0;
        Float f = this.finished;
        int iHashCode6 = f != null ? f.hashCode() : 0;
        Integer num4 = this.loadExpired;
        int iHashCode7 = num4 != null ? num4.hashCode() : 0;
        Integer num5 = this.loadTimeout;
        int iHashCode8 = num5 != null ? num5.hashCode() : 0;
        Integer num6 = this.videoClosePosition;
        int iHashCode9 = num6 != null ? num6.hashCode() : 0;
        Integer num7 = this.endcardClosePosition;
        int iHashCode10 = num7 != null ? num7.hashCode() : 0;
        Integer num8 = this.mutePostion;
        int iHashCode11 = num8 != null ? num8.hashCode() : 0;
        Integer num9 = this.loadPeriodTime;
        int iHashCode12 = num9 != null ? num9.hashCode() : 0;
        Integer num10 = this.skipPercent;
        int iHashCode13 = num10 != null ? num10.hashCode() : 0;
        Integer num11 = this.screen_capture;
        int iHashCode14 = num11 != null ? num11.hashCode() : 0;
        int iHashCode15 = this.screen_capture_times.hashCode();
        Integer num12 = this.skipSeconds;
        int iHashCode16 = num12 != null ? num12.hashCode() : 0;
        Boolean bool = this.enableExitOnVideoClose;
        int iHashCode17 = bool != null ? bool.hashCode() : 0;
        DialogSetting dialogSetting = this.close_dialog_setting;
        int iHashCode18 = ((iHashCode17 + ((iHashCode16 + ((((iHashCode14 + ((iHashCode13 + ((iHashCode12 + ((iHashCode11 + ((iHashCode10 + ((iHashCode9 + ((iHashCode8 + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37) + iHashCode15) * 37)) * 37)) * 37) + (dialogSetting != null ? dialogSetting.hashCode() : 0);
        this.hashCode = iHashCode18;
        return iHashCode18;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.endpoints = this.endpoints;
        builder.cacheTop = this.cacheTop;
        builder.ifMute = this.ifMute;
        builder.showClose = this.showClose;
        builder.finished = this.finished;
        builder.loadExpired = this.loadExpired;
        builder.loadTimeout = this.loadTimeout;
        builder.videoClosePosition = this.videoClosePosition;
        builder.endcardClosePosition = this.endcardClosePosition;
        builder.mutePostion = this.mutePostion;
        builder.loadPeriodTime = this.loadPeriodTime;
        builder.skipPercent = this.skipPercent;
        builder.screen_capture = this.screen_capture;
        builder.screen_capture_times = Internal.copyOf("screen_capture_times", this.screen_capture_times);
        builder.skipSeconds = this.skipSeconds;
        builder.enableExitOnVideoClose = this.enableExitOnVideoClose;
        builder.close_dialog_setting = this.close_dialog_setting;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.endpoints != null) {
            sb.append(", endpoints=");
            sb.append(this.endpoints);
        }
        if (this.cacheTop != null) {
            sb.append(", cacheTop=");
            sb.append(this.cacheTop);
        }
        if (this.ifMute != null) {
            sb.append(", ifMute=");
            sb.append(this.ifMute);
        }
        if (this.showClose != null) {
            sb.append(", showClose=");
            sb.append(this.showClose);
        }
        if (this.finished != null) {
            sb.append(", finished=");
            sb.append(this.finished);
        }
        if (this.loadExpired != null) {
            sb.append(", loadExpired=");
            sb.append(this.loadExpired);
        }
        if (this.loadTimeout != null) {
            sb.append(", loadTimeout=");
            sb.append(this.loadTimeout);
        }
        if (this.videoClosePosition != null) {
            sb.append(", videoClosePosition=");
            sb.append(this.videoClosePosition);
        }
        if (this.endcardClosePosition != null) {
            sb.append(", endcardClosePosition=");
            sb.append(this.endcardClosePosition);
        }
        if (this.mutePostion != null) {
            sb.append(", mutePostion=");
            sb.append(this.mutePostion);
        }
        if (this.loadPeriodTime != null) {
            sb.append(", loadPeriodTime=");
            sb.append(this.loadPeriodTime);
        }
        if (this.skipPercent != null) {
            sb.append(", skipPercent=");
            sb.append(this.skipPercent);
        }
        if (this.screen_capture != null) {
            sb.append(", screen_capture=");
            sb.append(this.screen_capture);
        }
        if (!this.screen_capture_times.isEmpty()) {
            sb.append(", screen_capture_times=");
            sb.append(this.screen_capture_times);
        }
        if (this.skipSeconds != null) {
            sb.append(", skipSeconds=");
            sb.append(this.skipSeconds);
        }
        if (this.enableExitOnVideoClose != null) {
            sb.append(", enableExitOnVideoClose=");
            sb.append(this.enableExitOnVideoClose);
        }
        if (this.close_dialog_setting != null) {
            sb.append(", close_dialog_setting=");
            sb.append(this.close_dialog_setting);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "RvConfig{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
