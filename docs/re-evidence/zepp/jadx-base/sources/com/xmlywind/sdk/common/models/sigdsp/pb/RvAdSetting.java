package com.xmlywind.sdk.common.models.sigdsp.pb;

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
public final class RvAdSetting extends AndroidMessage<RvAdSetting, Builder> {
    public static final ProtoAdapter<RvAdSetting> ADAPTER;
    public static final Parcelable.Creator<RvAdSetting> CREATOR;
    public static final Boolean DEFAULT_DISABLE_AUTO_LOAD;
    public static final Boolean DEFAULT_ENABLE_EXIT_ON_VIDEO_CLOSE;
    public static final Integer DEFAULT_ENDCARD_CLOSE_IMAGE;
    public static final Integer DEFAULT_ENDCARD_CLOSE_POSITION;
    public static final Integer DEFAULT_END_IMPRESSION_TIME;
    public static final Integer DEFAULT_END_TIME;
    public static final Float DEFAULT_FINISHED;
    public static final Boolean DEFAULT_FULL_CLICK_ON_VIDEO;
    public static final Integer DEFAULT_IF_MUTE;
    public static final Boolean DEFAULT_INVISIBLE_AD_LABEL;
    public static final Integer DEFAULT_MUTE_POSTION;
    public static final Integer DEFAULT_SKIP_PERCENT;
    public static final Integer DEFAULT_SKIP_SECONDS;
    public static final Integer DEFAULT_VIDEO_CLOSE_POSITION;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.ClickAreaSetting#ADAPTER", tag = 10)
    public final ClickAreaSetting click_setting;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 15)
    public final Boolean disable_auto_load;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean enable_exit_on_video_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 14)
    public final Integer end_impression_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
    public final Integer end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public final Integer endcard_close_image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer endcard_close_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float finished;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public final Boolean full_click_on_video;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer if_mute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 11)
    public final Boolean invisible_ad_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer mute_postion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer skip_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer skip_seconds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer video_close_position;

    public static final class Builder extends Message.Builder<RvAdSetting, Builder> {
        public ClickAreaSetting click_setting;
        public Integer if_mute = RvAdSetting.DEFAULT_IF_MUTE;
        public Float finished = RvAdSetting.DEFAULT_FINISHED;
        public Integer video_close_position = RvAdSetting.DEFAULT_VIDEO_CLOSE_POSITION;
        public Integer endcard_close_position = RvAdSetting.DEFAULT_ENDCARD_CLOSE_POSITION;
        public Integer mute_postion = RvAdSetting.DEFAULT_MUTE_POSTION;
        public Integer skip_percent = RvAdSetting.DEFAULT_SKIP_PERCENT;
        public Integer skip_seconds = RvAdSetting.DEFAULT_SKIP_SECONDS;
        public Boolean enable_exit_on_video_close = RvAdSetting.DEFAULT_ENABLE_EXIT_ON_VIDEO_CLOSE;
        public Boolean full_click_on_video = RvAdSetting.DEFAULT_FULL_CLICK_ON_VIDEO;
        public Boolean invisible_ad_label = RvAdSetting.DEFAULT_INVISIBLE_AD_LABEL;
        public Integer end_time = RvAdSetting.DEFAULT_END_TIME;
        public Integer endcard_close_image = RvAdSetting.DEFAULT_ENDCARD_CLOSE_IMAGE;
        public Integer end_impression_time = RvAdSetting.DEFAULT_END_IMPRESSION_TIME;
        public Boolean disable_auto_load = RvAdSetting.DEFAULT_DISABLE_AUTO_LOAD;

        @Override // com.xmlywind.wire.Message.Builder
        public RvAdSetting build() {
            return new RvAdSetting(this.if_mute, this.finished, this.video_close_position, this.endcard_close_position, this.mute_postion, this.skip_percent, this.skip_seconds, this.enable_exit_on_video_close, this.full_click_on_video, this.click_setting, this.invisible_ad_label, this.end_time, this.endcard_close_image, this.end_impression_time, this.disable_auto_load, super.buildUnknownFields());
        }

        public Builder click_setting(ClickAreaSetting clickAreaSetting) {
            this.click_setting = clickAreaSetting;
            return this;
        }

        public Builder disable_auto_load(Boolean bool) {
            this.disable_auto_load = bool;
            return this;
        }

        public Builder enable_exit_on_video_close(Boolean bool) {
            this.enable_exit_on_video_close = bool;
            return this;
        }

        public Builder end_impression_time(Integer num) {
            this.end_impression_time = num;
            return this;
        }

        public Builder end_time(Integer num) {
            this.end_time = num;
            return this;
        }

        public Builder endcard_close_image(Integer num) {
            this.endcard_close_image = num;
            return this;
        }

        public Builder endcard_close_position(Integer num) {
            this.endcard_close_position = num;
            return this;
        }

        public Builder finished(Float f) {
            this.finished = f;
            return this;
        }

        public Builder full_click_on_video(Boolean bool) {
            this.full_click_on_video = bool;
            return this;
        }

        public Builder if_mute(Integer num) {
            this.if_mute = num;
            return this;
        }

        public Builder invisible_ad_label(Boolean bool) {
            this.invisible_ad_label = bool;
            return this;
        }

        public Builder mute_postion(Integer num) {
            this.mute_postion = num;
            return this;
        }

        public Builder skip_percent(Integer num) {
            this.skip_percent = num;
            return this;
        }

        public Builder skip_seconds(Integer num) {
            this.skip_seconds = num;
            return this;
        }

        public Builder video_close_position(Integer num) {
            this.video_close_position = num;
            return this;
        }
    }

    public static final class ProtoAdapter_RvAdSetting extends ProtoAdapter<RvAdSetting> {
        public ProtoAdapter_RvAdSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, RvAdSetting.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public RvAdSetting decode(ProtoReader protoReader) {
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
                        builder.if_mute(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 2:
                        builder.finished(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 3:
                        builder.video_close_position(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 4:
                        builder.endcard_close_position(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 5:
                        builder.mute_postion(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 6:
                        builder.skip_percent(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 7:
                        builder.skip_seconds(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 8:
                        builder.enable_exit_on_video_close(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 9:
                        builder.full_click_on_video(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 10:
                        builder.click_setting(ClickAreaSetting.ADAPTER.decode(protoReader));
                        break;
                    case 11:
                        builder.invisible_ad_label(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 12:
                        builder.end_time(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 13:
                        builder.endcard_close_image(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 14:
                        builder.end_impression_time(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 15:
                        builder.disable_auto_load(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, RvAdSetting rvAdSetting) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, rvAdSetting.if_mute);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, rvAdSetting.finished);
            protoAdapter.encodeWithTag(protoWriter, 3, rvAdSetting.video_close_position);
            protoAdapter.encodeWithTag(protoWriter, 4, rvAdSetting.endcard_close_position);
            protoAdapter.encodeWithTag(protoWriter, 5, rvAdSetting.mute_postion);
            protoAdapter.encodeWithTag(protoWriter, 6, rvAdSetting.skip_percent);
            protoAdapter.encodeWithTag(protoWriter, 7, rvAdSetting.skip_seconds);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 8, rvAdSetting.enable_exit_on_video_close);
            protoAdapter2.encodeWithTag(protoWriter, 9, rvAdSetting.full_click_on_video);
            ClickAreaSetting.ADAPTER.encodeWithTag(protoWriter, 10, rvAdSetting.click_setting);
            protoAdapter2.encodeWithTag(protoWriter, 11, rvAdSetting.invisible_ad_label);
            protoAdapter.encodeWithTag(protoWriter, 12, rvAdSetting.end_time);
            protoAdapter.encodeWithTag(protoWriter, 13, rvAdSetting.endcard_close_image);
            protoAdapter.encodeWithTag(protoWriter, 14, rvAdSetting.end_impression_time);
            protoAdapter2.encodeWithTag(protoWriter, 15, rvAdSetting.disable_auto_load);
            protoWriter.writeBytes(rvAdSetting.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(RvAdSetting rvAdSetting) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rvAdSetting.if_mute) + ProtoAdapter.FLOAT.encodedSizeWithTag(2, rvAdSetting.finished) + protoAdapter.encodedSizeWithTag(3, rvAdSetting.video_close_position) + protoAdapter.encodedSizeWithTag(4, rvAdSetting.endcard_close_position) + protoAdapter.encodedSizeWithTag(5, rvAdSetting.mute_postion) + protoAdapter.encodedSizeWithTag(6, rvAdSetting.skip_percent) + protoAdapter.encodedSizeWithTag(7, rvAdSetting.skip_seconds);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(8, rvAdSetting.enable_exit_on_video_close) + protoAdapter2.encodedSizeWithTag(9, rvAdSetting.full_click_on_video) + ClickAreaSetting.ADAPTER.encodedSizeWithTag(10, rvAdSetting.click_setting) + protoAdapter2.encodedSizeWithTag(11, rvAdSetting.invisible_ad_label) + protoAdapter.encodedSizeWithTag(12, rvAdSetting.end_time) + protoAdapter.encodedSizeWithTag(13, rvAdSetting.endcard_close_image) + protoAdapter.encodedSizeWithTag(14, rvAdSetting.end_impression_time) + protoAdapter2.encodedSizeWithTag(15, rvAdSetting.disable_auto_load) + rvAdSetting.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public RvAdSetting redact(RvAdSetting rvAdSetting) {
            Builder builderNewBuilder = rvAdSetting.newBuilder();
            ClickAreaSetting clickAreaSetting = builderNewBuilder.click_setting;
            if (clickAreaSetting != null) {
                builderNewBuilder.click_setting = ClickAreaSetting.ADAPTER.redact(clickAreaSetting);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_RvAdSetting protoAdapter_RvAdSetting = new ProtoAdapter_RvAdSetting();
        ADAPTER = protoAdapter_RvAdSetting;
        CREATOR = AndroidMessage.newCreator(protoAdapter_RvAdSetting);
        DEFAULT_IF_MUTE = 0;
        DEFAULT_FINISHED = Float.valueOf(1.0f);
        DEFAULT_VIDEO_CLOSE_POSITION = 1;
        DEFAULT_ENDCARD_CLOSE_POSITION = 3;
        DEFAULT_MUTE_POSTION = 4;
        DEFAULT_SKIP_PERCENT = 0;
        DEFAULT_SKIP_SECONDS = -1;
        Boolean bool = Boolean.FALSE;
        DEFAULT_ENABLE_EXIT_ON_VIDEO_CLOSE = bool;
        DEFAULT_FULL_CLICK_ON_VIDEO = bool;
        DEFAULT_INVISIBLE_AD_LABEL = bool;
        DEFAULT_END_TIME = 0;
        DEFAULT_ENDCARD_CLOSE_IMAGE = 0;
        DEFAULT_END_IMPRESSION_TIME = 0;
        DEFAULT_DISABLE_AUTO_LOAD = bool;
    }

    public RvAdSetting(Integer num, Float f, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, Boolean bool2, ClickAreaSetting clickAreaSetting, Boolean bool3, Integer num7, Integer num8, Integer num9, Boolean bool4) {
        this(num, f, num2, num3, num4, num5, num6, bool, bool2, clickAreaSetting, bool3, num7, num8, num9, bool4, ByteString.EMPTY);
    }

    public RvAdSetting(Integer num, Float f, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, Boolean bool2, ClickAreaSetting clickAreaSetting, Boolean bool3, Integer num7, Integer num8, Integer num9, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.if_mute = num;
        this.finished = f;
        this.video_close_position = num2;
        this.endcard_close_position = num3;
        this.mute_postion = num4;
        this.skip_percent = num5;
        this.skip_seconds = num6;
        this.enable_exit_on_video_close = bool;
        this.full_click_on_video = bool2;
        this.click_setting = clickAreaSetting;
        this.invisible_ad_label = bool3;
        this.end_time = num7;
        this.endcard_close_image = num8;
        this.end_impression_time = num9;
        this.disable_auto_load = bool4;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RvAdSetting)) {
                return false;
            }
            RvAdSetting rvAdSetting = (RvAdSetting) obj;
            if (!unknownFields().equals(rvAdSetting.unknownFields()) || !Internal.equals(this.if_mute, rvAdSetting.if_mute) || !Internal.equals(this.finished, rvAdSetting.finished) || !Internal.equals(this.video_close_position, rvAdSetting.video_close_position) || !Internal.equals(this.endcard_close_position, rvAdSetting.endcard_close_position) || !Internal.equals(this.mute_postion, rvAdSetting.mute_postion) || !Internal.equals(this.skip_percent, rvAdSetting.skip_percent) || !Internal.equals(this.skip_seconds, rvAdSetting.skip_seconds) || !Internal.equals(this.enable_exit_on_video_close, rvAdSetting.enable_exit_on_video_close) || !Internal.equals(this.full_click_on_video, rvAdSetting.full_click_on_video) || !Internal.equals(this.click_setting, rvAdSetting.click_setting) || !Internal.equals(this.invisible_ad_label, rvAdSetting.invisible_ad_label) || !Internal.equals(this.end_time, rvAdSetting.end_time) || !Internal.equals(this.endcard_close_image, rvAdSetting.endcard_close_image) || !Internal.equals(this.end_impression_time, rvAdSetting.end_impression_time) || !Internal.equals(this.disable_auto_load, rvAdSetting.disable_auto_load)) {
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
        Integer num = this.if_mute;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        Float f = this.finished;
        int iHashCode3 = f != null ? f.hashCode() : 0;
        Integer num2 = this.video_close_position;
        int iHashCode4 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.endcard_close_position;
        int iHashCode5 = num3 != null ? num3.hashCode() : 0;
        Integer num4 = this.mute_postion;
        int iHashCode6 = num4 != null ? num4.hashCode() : 0;
        Integer num5 = this.skip_percent;
        int iHashCode7 = num5 != null ? num5.hashCode() : 0;
        Integer num6 = this.skip_seconds;
        int iHashCode8 = num6 != null ? num6.hashCode() : 0;
        Boolean bool = this.enable_exit_on_video_close;
        int iHashCode9 = bool != null ? bool.hashCode() : 0;
        Boolean bool2 = this.full_click_on_video;
        int iHashCode10 = bool2 != null ? bool2.hashCode() : 0;
        ClickAreaSetting clickAreaSetting = this.click_setting;
        int iHashCode11 = clickAreaSetting != null ? clickAreaSetting.hashCode() : 0;
        Boolean bool3 = this.invisible_ad_label;
        int iHashCode12 = bool3 != null ? bool3.hashCode() : 0;
        Integer num7 = this.end_time;
        int iHashCode13 = num7 != null ? num7.hashCode() : 0;
        Integer num8 = this.endcard_close_image;
        int iHashCode14 = num8 != null ? num8.hashCode() : 0;
        Integer num9 = this.end_impression_time;
        int iHashCode15 = num9 != null ? num9.hashCode() : 0;
        Boolean bool4 = this.disable_auto_load;
        int iHashCode16 = ((iHashCode15 + ((iHashCode14 + ((iHashCode13 + ((iHashCode12 + ((iHashCode11 + ((iHashCode10 + ((iHashCode9 + ((iHashCode8 + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37) + (bool4 != null ? bool4.hashCode() : 0);
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.if_mute = this.if_mute;
        builder.finished = this.finished;
        builder.video_close_position = this.video_close_position;
        builder.endcard_close_position = this.endcard_close_position;
        builder.mute_postion = this.mute_postion;
        builder.skip_percent = this.skip_percent;
        builder.skip_seconds = this.skip_seconds;
        builder.enable_exit_on_video_close = this.enable_exit_on_video_close;
        builder.full_click_on_video = this.full_click_on_video;
        builder.click_setting = this.click_setting;
        builder.invisible_ad_label = this.invisible_ad_label;
        builder.end_time = this.end_time;
        builder.endcard_close_image = this.endcard_close_image;
        builder.end_impression_time = this.end_impression_time;
        builder.disable_auto_load = this.disable_auto_load;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.if_mute != null) {
            sb.append(", if_mute=");
            sb.append(this.if_mute);
        }
        if (this.finished != null) {
            sb.append(", finished=");
            sb.append(this.finished);
        }
        if (this.video_close_position != null) {
            sb.append(", video_close_position=");
            sb.append(this.video_close_position);
        }
        if (this.endcard_close_position != null) {
            sb.append(", endcard_close_position=");
            sb.append(this.endcard_close_position);
        }
        if (this.mute_postion != null) {
            sb.append(", mute_postion=");
            sb.append(this.mute_postion);
        }
        if (this.skip_percent != null) {
            sb.append(", skip_percent=");
            sb.append(this.skip_percent);
        }
        if (this.skip_seconds != null) {
            sb.append(", skip_seconds=");
            sb.append(this.skip_seconds);
        }
        if (this.enable_exit_on_video_close != null) {
            sb.append(", enable_exit_on_video_close=");
            sb.append(this.enable_exit_on_video_close);
        }
        if (this.full_click_on_video != null) {
            sb.append(", full_click_on_video=");
            sb.append(this.full_click_on_video);
        }
        if (this.click_setting != null) {
            sb.append(", click_setting=");
            sb.append(this.click_setting);
        }
        if (this.invisible_ad_label != null) {
            sb.append(", invisible_ad_label=");
            sb.append(this.invisible_ad_label);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.endcard_close_image != null) {
            sb.append(", endcard_close_image=");
            sb.append(this.endcard_close_image);
        }
        if (this.end_impression_time != null) {
            sb.append(", end_impression_time=");
            sb.append(this.end_impression_time);
        }
        if (this.disable_auto_load != null) {
            sb.append(", disable_auto_load=");
            sb.append(this.disable_auto_load);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "RvAdSetting{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
