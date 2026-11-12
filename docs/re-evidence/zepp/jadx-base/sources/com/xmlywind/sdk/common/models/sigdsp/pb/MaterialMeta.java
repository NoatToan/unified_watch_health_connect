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
public final class MaterialMeta extends AndroidMessage<MaterialMeta, Builder> {
    public static final ProtoAdapter<MaterialMeta> ADAPTER;
    public static final Parcelable.Creator<MaterialMeta> CREATOR;
    public static final String DEFAULT_APP_NAME = "";
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final Integer DEFAULT_CLICK_TYPE;
    public static final ByteString DEFAULT_CLOSECARD_HTML_SNIPPET;
    public static final Integer DEFAULT_CREATIVE_TYPE;
    public static final String DEFAULT_DEEPLINK_URL = "";
    public static final String DEFAULT_DESC = "";
    public static final Boolean DEFAULT_DISABLE_AUTO_DEEPLINK;
    public static final Boolean DEFAULT_ENABLE_COLLAPSE_TOOL_BAR;
    public static final String DEFAULT_ENDCARD_MD5 = "";
    public static final String DEFAULT_ENDCARD_URL = "";
    public static final Boolean DEFAULT_HAS_COMPANION_ENDCARD;
    public static final ByteString DEFAULT_HTML_SNIPPET;
    public static final String DEFAULT_HTML_SRC = "";
    public static final String DEFAULT_HTML_URL = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_IMAGE_MD5 = "";
    public static final String DEFAULT_IMAGE_SRC = "";
    public static final Integer DEFAULT_IMAGE_TYPE;
    public static final Integer DEFAULT_INTERACTION_TYPE;
    public static final String DEFAULT_LANDING_PAGE = "";
    public static final Integer DEFAULT_OPEN_MARKET_MODE;
    public static final Integer DEFAULT_PLAY_MODE;
    public static final Float DEFAULT_SCORE;
    public static final Integer DEFAULT_SUB_INTERACTION_TYPE;
    public static final Integer DEFAULT_TEMPLATE_ID;
    public static final Integer DEFAULT_TEMPLATE_TYPE;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_VIDEO_BYTE_SIZE;
    public static final Integer DEFAULT_VIDEO_DURATION;
    public static final String DEFAULT_VIDEO_MD5 = "";
    public static final Integer DEFAULT_VIDEO_RECIPROCAL_MILLISECOND;
    public static final String DEFAULT_VIDEO_URL = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.AdPrivacy#ADAPTER", tag = 36)
    public final AdPrivacy ad_privacy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 34)
    public final String app_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 35)
    public final String button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 16)
    public final Integer click_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 33)
    public final ByteString closecard_html_snippet;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.CompanionEndcard#ADAPTER", tag = 18)
    public final CompanionEndcard companion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer creative_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String deeplink_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 28)
    public final String desc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 32)
    public final Boolean disable_auto_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 23)
    public final Boolean enable_collapse_tool_bar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final String endcard_md5;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String endcard_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 17)
    public final Boolean has_companion_endcard;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 7)
    public final ByteString html_snippet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 38)
    public final String html_src;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 22)
    public final String html_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 29)
    public final String icon_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public final String image_md5;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.Size#ADAPTER", tag = 13)
    public final Size image_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public final String image_src;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 15)
    public final Integer image_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer interaction_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String landing_page;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.ResponseNativeAd#ADAPTER", tag = 39)
    public final ResponseNativeAd native_ad;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 24)
    public final Integer open_market_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 25)
    public final Integer play_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 30)
    public final Float score;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 26)
    public final Integer sub_interaction_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 31)
    public final Integer template_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 20)
    public final Integer template_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 27)
    public final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 37)
    public final Integer video_byte_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 5)
    public final Integer video_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String video_md5;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 21)
    public final Integer video_reciprocal_millisecond;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.Size#ADAPTER", tag = 6)
    public final Size video_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String video_url;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.WebEventHandle#ADAPTER", tag = 19)
    public final WebEventHandle web_event_handle;

    public static final class Builder extends Message.Builder<MaterialMeta, Builder> {
        public AdPrivacy ad_privacy;
        public CompanionEndcard companion;
        public String html_src;
        public Size image_size;
        public ResponseNativeAd native_ad;
        public Integer video_byte_size;
        public Size video_size;
        public WebEventHandle web_event_handle;
        public Integer creative_type = MaterialMeta.DEFAULT_CREATIVE_TYPE;
        public Integer interaction_type = MaterialMeta.DEFAULT_INTERACTION_TYPE;
        public String landing_page = "";
        public String video_url = "";
        public Integer video_duration = MaterialMeta.DEFAULT_VIDEO_DURATION;
        public ByteString html_snippet = MaterialMeta.DEFAULT_HTML_SNIPPET;
        public String endcard_url = "";
        public String video_md5 = "";
        public String endcard_md5 = "";
        public String deeplink_url = "";
        public String image_src = "";
        public String image_md5 = "";
        public Integer image_type = MaterialMeta.DEFAULT_IMAGE_TYPE;
        public Integer click_type = MaterialMeta.DEFAULT_CLICK_TYPE;
        public Boolean has_companion_endcard = MaterialMeta.DEFAULT_HAS_COMPANION_ENDCARD;
        public Integer template_type = MaterialMeta.DEFAULT_TEMPLATE_TYPE;
        public Integer video_reciprocal_millisecond = MaterialMeta.DEFAULT_VIDEO_RECIPROCAL_MILLISECOND;
        public String html_url = "";
        public Boolean enable_collapse_tool_bar = MaterialMeta.DEFAULT_ENABLE_COLLAPSE_TOOL_BAR;
        public Integer open_market_mode = MaterialMeta.DEFAULT_OPEN_MARKET_MODE;
        public Integer play_mode = MaterialMeta.DEFAULT_PLAY_MODE;
        public Integer sub_interaction_type = MaterialMeta.DEFAULT_SUB_INTERACTION_TYPE;
        public String title = "";
        public String desc = "";
        public String icon_url = "";
        public Float score = MaterialMeta.DEFAULT_SCORE;
        public Integer template_id = MaterialMeta.DEFAULT_TEMPLATE_ID;
        public Boolean disable_auto_deeplink = MaterialMeta.DEFAULT_DISABLE_AUTO_DEEPLINK;
        public ByteString closecard_html_snippet = MaterialMeta.DEFAULT_CLOSECARD_HTML_SNIPPET;
        public String app_name = "";
        public String button_text = "";

        public Builder ad_privacy(AdPrivacy adPrivacy) {
            this.ad_privacy = adPrivacy;
            return this;
        }

        public Builder app_name(String str) {
            this.app_name = str;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public MaterialMeta build() {
            return new MaterialMeta(this.creative_type, this.interaction_type, this.landing_page, this.video_url, this.video_duration, this.video_size, this.html_snippet, this.endcard_url, this.video_md5, this.endcard_md5, this.deeplink_url, this.image_src, this.image_size, this.image_md5, this.image_type, this.click_type, this.has_companion_endcard, this.companion, this.web_event_handle, this.template_type, this.video_reciprocal_millisecond, this.html_url, this.enable_collapse_tool_bar, this.open_market_mode, this.play_mode, this.sub_interaction_type, this.title, this.desc, this.icon_url, this.score, this.template_id, this.disable_auto_deeplink, this.closecard_html_snippet, this.app_name, this.button_text, this.ad_privacy, this.video_byte_size, this.html_src, this.native_ad, super.buildUnknownFields());
        }

        public Builder button_text(String str) {
            this.button_text = str;
            return this;
        }

        public Builder click_type(Integer num) {
            this.click_type = num;
            return this;
        }

        public Builder closecard_html_snippet(ByteString byteString) {
            this.closecard_html_snippet = byteString;
            return this;
        }

        public Builder companion(CompanionEndcard companionEndcard) {
            this.companion = companionEndcard;
            return this;
        }

        public Builder creative_type(Integer num) {
            this.creative_type = num;
            return this;
        }

        public Builder deeplink_url(String str) {
            this.deeplink_url = str;
            return this;
        }

        public Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public Builder disable_auto_deeplink(Boolean bool) {
            this.disable_auto_deeplink = bool;
            return this;
        }

        public Builder enable_collapse_tool_bar(Boolean bool) {
            this.enable_collapse_tool_bar = bool;
            return this;
        }

        public Builder endcard_md5(String str) {
            this.endcard_md5 = str;
            return this;
        }

        public Builder endcard_url(String str) {
            this.endcard_url = str;
            return this;
        }

        public Builder has_companion_endcard(Boolean bool) {
            this.has_companion_endcard = bool;
            return this;
        }

        public Builder html_snippet(ByteString byteString) {
            this.html_snippet = byteString;
            return this;
        }

        public Builder html_src(String str) {
            this.html_src = str;
            return this;
        }

        public Builder html_url(String str) {
            this.html_url = str;
            return this;
        }

        public Builder icon_url(String str) {
            this.icon_url = str;
            return this;
        }

        public Builder image_md5(String str) {
            this.image_md5 = str;
            return this;
        }

        public Builder image_size(Size size) {
            this.image_size = size;
            return this;
        }

        public Builder image_src(String str) {
            this.image_src = str;
            return this;
        }

        public Builder image_type(Integer num) {
            this.image_type = num;
            return this;
        }

        public Builder interaction_type(Integer num) {
            this.interaction_type = num;
            return this;
        }

        public Builder landing_page(String str) {
            this.landing_page = str;
            return this;
        }

        public Builder native_ad(ResponseNativeAd responseNativeAd) {
            this.native_ad = responseNativeAd;
            return this;
        }

        public Builder open_market_mode(Integer num) {
            this.open_market_mode = num;
            return this;
        }

        public Builder play_mode(Integer num) {
            this.play_mode = num;
            return this;
        }

        public Builder score(Float f) {
            this.score = f;
            return this;
        }

        public Builder sub_interaction_type(Integer num) {
            this.sub_interaction_type = num;
            return this;
        }

        public Builder template_id(Integer num) {
            this.template_id = num;
            return this;
        }

        public Builder template_type(Integer num) {
            this.template_type = num;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder video_byte_size(Integer num) {
            this.video_byte_size = num;
            return this;
        }

        public Builder video_duration(Integer num) {
            this.video_duration = num;
            return this;
        }

        public Builder video_md5(String str) {
            this.video_md5 = str;
            return this;
        }

        public Builder video_reciprocal_millisecond(Integer num) {
            this.video_reciprocal_millisecond = num;
            return this;
        }

        public Builder video_size(Size size) {
            this.video_size = size;
            return this;
        }

        public Builder video_url(String str) {
            this.video_url = str;
            return this;
        }

        public Builder web_event_handle(WebEventHandle webEventHandle) {
            this.web_event_handle = webEventHandle;
            return this;
        }
    }

    public static final class ProtoAdapter_MaterialMeta extends ProtoAdapter<MaterialMeta> {
        public ProtoAdapter_MaterialMeta() {
            super(FieldEncoding.LENGTH_DELIMITED, MaterialMeta.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public MaterialMeta decode(ProtoReader protoReader) {
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
                        builder.creative_type(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 2:
                        builder.interaction_type(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 3:
                        builder.landing_page(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 4:
                        builder.video_url(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 5:
                        builder.video_duration(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 6:
                        builder.video_size(Size.ADAPTER.decode(protoReader));
                        break;
                    case 7:
                        builder.html_snippet(ProtoAdapter.BYTES.decode(protoReader));
                        break;
                    case 8:
                        builder.endcard_url(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 9:
                        builder.video_md5(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 10:
                        builder.endcard_md5(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 11:
                        builder.deeplink_url(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 12:
                        builder.image_src(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 13:
                        builder.image_size(Size.ADAPTER.decode(protoReader));
                        break;
                    case 14:
                        builder.image_md5(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 15:
                        builder.image_type(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 16:
                        builder.click_type(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 17:
                        builder.has_companion_endcard(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 18:
                        builder.companion(CompanionEndcard.ADAPTER.decode(protoReader));
                        break;
                    case 19:
                        builder.web_event_handle(WebEventHandle.ADAPTER.decode(protoReader));
                        break;
                    case 20:
                        builder.template_type(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 21:
                        builder.video_reciprocal_millisecond(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 22:
                        builder.html_url(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 23:
                        builder.enable_collapse_tool_bar(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 24:
                        builder.open_market_mode(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 25:
                        builder.play_mode(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 26:
                        builder.sub_interaction_type(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 27:
                        builder.title(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 28:
                        builder.desc(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 29:
                        builder.icon_url(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 30:
                        builder.score(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 31:
                        builder.template_id(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 32:
                        builder.disable_auto_deeplink(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 33:
                        builder.closecard_html_snippet(ProtoAdapter.BYTES.decode(protoReader));
                        break;
                    case 34:
                        builder.app_name(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 35:
                        builder.button_text(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 36:
                        builder.ad_privacy(AdPrivacy.ADAPTER.decode(protoReader));
                        break;
                    case 37:
                        builder.video_byte_size(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 38:
                        builder.html_src(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 39:
                        builder.native_ad(ResponseNativeAd.ADAPTER.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, MaterialMeta materialMeta) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, materialMeta.creative_type);
            protoAdapter.encodeWithTag(protoWriter, 2, materialMeta.interaction_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, materialMeta.landing_page);
            protoAdapter2.encodeWithTag(protoWriter, 4, materialMeta.video_url);
            protoAdapter.encodeWithTag(protoWriter, 5, materialMeta.video_duration);
            ProtoAdapter<Size> protoAdapter3 = Size.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 6, materialMeta.video_size);
            ProtoAdapter<ByteString> protoAdapter4 = ProtoAdapter.BYTES;
            protoAdapter4.encodeWithTag(protoWriter, 7, materialMeta.html_snippet);
            protoAdapter2.encodeWithTag(protoWriter, 8, materialMeta.endcard_url);
            protoAdapter2.encodeWithTag(protoWriter, 9, materialMeta.video_md5);
            protoAdapter2.encodeWithTag(protoWriter, 10, materialMeta.endcard_md5);
            protoAdapter2.encodeWithTag(protoWriter, 11, materialMeta.deeplink_url);
            protoAdapter2.encodeWithTag(protoWriter, 12, materialMeta.image_src);
            protoAdapter3.encodeWithTag(protoWriter, 13, materialMeta.image_size);
            protoAdapter2.encodeWithTag(protoWriter, 14, materialMeta.image_md5);
            protoAdapter.encodeWithTag(protoWriter, 15, materialMeta.image_type);
            protoAdapter.encodeWithTag(protoWriter, 16, materialMeta.click_type);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            protoAdapter5.encodeWithTag(protoWriter, 17, materialMeta.has_companion_endcard);
            CompanionEndcard.ADAPTER.encodeWithTag(protoWriter, 18, materialMeta.companion);
            WebEventHandle.ADAPTER.encodeWithTag(protoWriter, 19, materialMeta.web_event_handle);
            protoAdapter.encodeWithTag(protoWriter, 20, materialMeta.template_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, materialMeta.video_reciprocal_millisecond);
            protoAdapter2.encodeWithTag(protoWriter, 22, materialMeta.html_url);
            protoAdapter5.encodeWithTag(protoWriter, 23, materialMeta.enable_collapse_tool_bar);
            protoAdapter.encodeWithTag(protoWriter, 24, materialMeta.open_market_mode);
            protoAdapter.encodeWithTag(protoWriter, 25, materialMeta.play_mode);
            protoAdapter.encodeWithTag(protoWriter, 26, materialMeta.sub_interaction_type);
            protoAdapter2.encodeWithTag(protoWriter, 27, materialMeta.title);
            protoAdapter2.encodeWithTag(protoWriter, 28, materialMeta.desc);
            protoAdapter2.encodeWithTag(protoWriter, 29, materialMeta.icon_url);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 30, materialMeta.score);
            protoAdapter.encodeWithTag(protoWriter, 31, materialMeta.template_id);
            protoAdapter5.encodeWithTag(protoWriter, 32, materialMeta.disable_auto_deeplink);
            protoAdapter4.encodeWithTag(protoWriter, 33, materialMeta.closecard_html_snippet);
            protoAdapter2.encodeWithTag(protoWriter, 34, materialMeta.app_name);
            protoAdapter2.encodeWithTag(protoWriter, 35, materialMeta.button_text);
            AdPrivacy.ADAPTER.encodeWithTag(protoWriter, 36, materialMeta.ad_privacy);
            protoAdapter.encodeWithTag(protoWriter, 37, materialMeta.video_byte_size);
            protoAdapter2.encodeWithTag(protoWriter, 38, materialMeta.html_src);
            ResponseNativeAd.ADAPTER.encodeWithTag(protoWriter, 39, materialMeta.native_ad);
            protoWriter.writeBytes(materialMeta.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(MaterialMeta materialMeta) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, materialMeta.creative_type) + protoAdapter.encodedSizeWithTag(2, materialMeta.interaction_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, materialMeta.landing_page) + protoAdapter2.encodedSizeWithTag(4, materialMeta.video_url) + protoAdapter.encodedSizeWithTag(5, materialMeta.video_duration);
            ProtoAdapter<Size> protoAdapter3 = Size.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, materialMeta.video_size);
            ProtoAdapter<ByteString> protoAdapter4 = ProtoAdapter.BYTES;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(7, materialMeta.html_snippet) + protoAdapter2.encodedSizeWithTag(8, materialMeta.endcard_url) + protoAdapter2.encodedSizeWithTag(9, materialMeta.video_md5) + protoAdapter2.encodedSizeWithTag(10, materialMeta.endcard_md5) + protoAdapter2.encodedSizeWithTag(11, materialMeta.deeplink_url) + protoAdapter2.encodedSizeWithTag(12, materialMeta.image_src) + protoAdapter3.encodedSizeWithTag(13, materialMeta.image_size) + protoAdapter2.encodedSizeWithTag(14, materialMeta.image_md5) + protoAdapter.encodedSizeWithTag(15, materialMeta.image_type) + protoAdapter.encodedSizeWithTag(16, materialMeta.click_type);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(17, materialMeta.has_companion_endcard) + CompanionEndcard.ADAPTER.encodedSizeWithTag(18, materialMeta.companion) + WebEventHandle.ADAPTER.encodedSizeWithTag(19, materialMeta.web_event_handle) + protoAdapter.encodedSizeWithTag(20, materialMeta.template_type) + ProtoAdapter.INT32.encodedSizeWithTag(21, materialMeta.video_reciprocal_millisecond) + protoAdapter2.encodedSizeWithTag(22, materialMeta.html_url) + protoAdapter5.encodedSizeWithTag(23, materialMeta.enable_collapse_tool_bar) + protoAdapter.encodedSizeWithTag(24, materialMeta.open_market_mode) + protoAdapter.encodedSizeWithTag(25, materialMeta.play_mode) + protoAdapter.encodedSizeWithTag(26, materialMeta.sub_interaction_type) + protoAdapter2.encodedSizeWithTag(27, materialMeta.title) + protoAdapter2.encodedSizeWithTag(28, materialMeta.desc) + protoAdapter2.encodedSizeWithTag(29, materialMeta.icon_url) + ProtoAdapter.FLOAT.encodedSizeWithTag(30, materialMeta.score) + protoAdapter.encodedSizeWithTag(31, materialMeta.template_id) + protoAdapter5.encodedSizeWithTag(32, materialMeta.disable_auto_deeplink) + protoAdapter4.encodedSizeWithTag(33, materialMeta.closecard_html_snippet) + protoAdapter2.encodedSizeWithTag(34, materialMeta.app_name) + protoAdapter2.encodedSizeWithTag(35, materialMeta.button_text) + AdPrivacy.ADAPTER.encodedSizeWithTag(36, materialMeta.ad_privacy) + protoAdapter.encodedSizeWithTag(37, materialMeta.video_byte_size) + protoAdapter2.encodedSizeWithTag(38, materialMeta.html_src) + ResponseNativeAd.ADAPTER.encodedSizeWithTag(39, materialMeta.native_ad) + materialMeta.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public MaterialMeta redact(MaterialMeta materialMeta) {
            Builder builderNewBuilder = materialMeta.newBuilder();
            Size size = builderNewBuilder.video_size;
            if (size != null) {
                builderNewBuilder.video_size = Size.ADAPTER.redact(size);
            }
            Size size2 = builderNewBuilder.image_size;
            if (size2 != null) {
                builderNewBuilder.image_size = Size.ADAPTER.redact(size2);
            }
            CompanionEndcard companionEndcard = builderNewBuilder.companion;
            if (companionEndcard != null) {
                builderNewBuilder.companion = CompanionEndcard.ADAPTER.redact(companionEndcard);
            }
            WebEventHandle webEventHandle = builderNewBuilder.web_event_handle;
            if (webEventHandle != null) {
                builderNewBuilder.web_event_handle = WebEventHandle.ADAPTER.redact(webEventHandle);
            }
            AdPrivacy adPrivacy = builderNewBuilder.ad_privacy;
            if (adPrivacy != null) {
                builderNewBuilder.ad_privacy = AdPrivacy.ADAPTER.redact(adPrivacy);
            }
            ResponseNativeAd responseNativeAd = builderNewBuilder.native_ad;
            if (responseNativeAd != null) {
                builderNewBuilder.native_ad = ResponseNativeAd.ADAPTER.redact(responseNativeAd);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_MaterialMeta protoAdapter_MaterialMeta = new ProtoAdapter_MaterialMeta();
        ADAPTER = protoAdapter_MaterialMeta;
        CREATOR = AndroidMessage.newCreator(protoAdapter_MaterialMeta);
        DEFAULT_CREATIVE_TYPE = 0;
        DEFAULT_INTERACTION_TYPE = 0;
        DEFAULT_VIDEO_DURATION = 0;
        ByteString byteString = ByteString.EMPTY;
        DEFAULT_HTML_SNIPPET = byteString;
        DEFAULT_IMAGE_TYPE = 0;
        DEFAULT_CLICK_TYPE = 0;
        Boolean bool = Boolean.FALSE;
        DEFAULT_HAS_COMPANION_ENDCARD = bool;
        DEFAULT_TEMPLATE_TYPE = 0;
        DEFAULT_VIDEO_RECIPROCAL_MILLISECOND = 0;
        DEFAULT_ENABLE_COLLAPSE_TOOL_BAR = bool;
        DEFAULT_OPEN_MARKET_MODE = 0;
        DEFAULT_PLAY_MODE = 0;
        DEFAULT_SUB_INTERACTION_TYPE = 0;
        DEFAULT_SCORE = Float.valueOf(0.0f);
        DEFAULT_TEMPLATE_ID = 0;
        DEFAULT_DISABLE_AUTO_DEEPLINK = bool;
        DEFAULT_CLOSECARD_HTML_SNIPPET = byteString;
        DEFAULT_VIDEO_BYTE_SIZE = 0;
    }

    public MaterialMeta(Integer num, Integer num2, String str, String str2, Integer num3, Size size, ByteString byteString, String str3, String str4, String str5, String str6, String str7, Size size2, String str8, Integer num4, Integer num5, Boolean bool, CompanionEndcard companionEndcard, WebEventHandle webEventHandle, Integer num6, Integer num7, String str9, Boolean bool2, Integer num8, Integer num9, Integer num10, String str10, String str11, String str12, Float f, Integer num11, Boolean bool3, ByteString byteString2, String str13, String str14, AdPrivacy adPrivacy, Integer num12, String str15, ResponseNativeAd responseNativeAd) {
        this(num, num2, str, str2, num3, size, byteString, str3, str4, str5, str6, str7, size2, str8, num4, num5, bool, companionEndcard, webEventHandle, num6, num7, str9, bool2, num8, num9, num10, str10, str11, str12, f, num11, bool3, byteString2, str13, str14, adPrivacy, num12, str15, responseNativeAd, ByteString.EMPTY);
    }

    public MaterialMeta(Integer num, Integer num2, String str, String str2, Integer num3, Size size, ByteString byteString, String str3, String str4, String str5, String str6, String str7, Size size2, String str8, Integer num4, Integer num5, Boolean bool, CompanionEndcard companionEndcard, WebEventHandle webEventHandle, Integer num6, Integer num7, String str9, Boolean bool2, Integer num8, Integer num9, Integer num10, String str10, String str11, String str12, Float f, Integer num11, Boolean bool3, ByteString byteString2, String str13, String str14, AdPrivacy adPrivacy, Integer num12, String str15, ResponseNativeAd responseNativeAd, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.creative_type = num;
        this.interaction_type = num2;
        this.landing_page = str;
        this.video_url = str2;
        this.video_duration = num3;
        this.video_size = size;
        this.html_snippet = byteString;
        this.endcard_url = str3;
        this.video_md5 = str4;
        this.endcard_md5 = str5;
        this.deeplink_url = str6;
        this.image_src = str7;
        this.image_size = size2;
        this.image_md5 = str8;
        this.image_type = num4;
        this.click_type = num5;
        this.has_companion_endcard = bool;
        this.companion = companionEndcard;
        this.web_event_handle = webEventHandle;
        this.template_type = num6;
        this.video_reciprocal_millisecond = num7;
        this.html_url = str9;
        this.enable_collapse_tool_bar = bool2;
        this.open_market_mode = num8;
        this.play_mode = num9;
        this.sub_interaction_type = num10;
        this.title = str10;
        this.desc = str11;
        this.icon_url = str12;
        this.score = f;
        this.template_id = num11;
        this.disable_auto_deeplink = bool3;
        this.closecard_html_snippet = byteString2;
        this.app_name = str13;
        this.button_text = str14;
        this.ad_privacy = adPrivacy;
        this.video_byte_size = num12;
        this.html_src = str15;
        this.native_ad = responseNativeAd;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof MaterialMeta)) {
                return false;
            }
            MaterialMeta materialMeta = (MaterialMeta) obj;
            if (!unknownFields().equals(materialMeta.unknownFields()) || !Internal.equals(this.creative_type, materialMeta.creative_type) || !Internal.equals(this.interaction_type, materialMeta.interaction_type) || !Internal.equals(this.landing_page, materialMeta.landing_page) || !Internal.equals(this.video_url, materialMeta.video_url) || !Internal.equals(this.video_duration, materialMeta.video_duration) || !Internal.equals(this.video_size, materialMeta.video_size) || !Internal.equals(this.html_snippet, materialMeta.html_snippet) || !Internal.equals(this.endcard_url, materialMeta.endcard_url) || !Internal.equals(this.video_md5, materialMeta.video_md5) || !Internal.equals(this.endcard_md5, materialMeta.endcard_md5) || !Internal.equals(this.deeplink_url, materialMeta.deeplink_url) || !Internal.equals(this.image_src, materialMeta.image_src) || !Internal.equals(this.image_size, materialMeta.image_size) || !Internal.equals(this.image_md5, materialMeta.image_md5) || !Internal.equals(this.image_type, materialMeta.image_type) || !Internal.equals(this.click_type, materialMeta.click_type) || !Internal.equals(this.has_companion_endcard, materialMeta.has_companion_endcard) || !Internal.equals(this.companion, materialMeta.companion) || !Internal.equals(this.web_event_handle, materialMeta.web_event_handle) || !Internal.equals(this.template_type, materialMeta.template_type) || !Internal.equals(this.video_reciprocal_millisecond, materialMeta.video_reciprocal_millisecond) || !Internal.equals(this.html_url, materialMeta.html_url) || !Internal.equals(this.enable_collapse_tool_bar, materialMeta.enable_collapse_tool_bar) || !Internal.equals(this.open_market_mode, materialMeta.open_market_mode) || !Internal.equals(this.play_mode, materialMeta.play_mode) || !Internal.equals(this.sub_interaction_type, materialMeta.sub_interaction_type) || !Internal.equals(this.title, materialMeta.title) || !Internal.equals(this.desc, materialMeta.desc) || !Internal.equals(this.icon_url, materialMeta.icon_url) || !Internal.equals(this.score, materialMeta.score) || !Internal.equals(this.template_id, materialMeta.template_id) || !Internal.equals(this.disable_auto_deeplink, materialMeta.disable_auto_deeplink) || !Internal.equals(this.closecard_html_snippet, materialMeta.closecard_html_snippet) || !Internal.equals(this.app_name, materialMeta.app_name) || !Internal.equals(this.button_text, materialMeta.button_text) || !Internal.equals(this.ad_privacy, materialMeta.ad_privacy) || !Internal.equals(this.video_byte_size, materialMeta.video_byte_size) || !Internal.equals(this.html_src, materialMeta.html_src) || !Internal.equals(this.native_ad, materialMeta.native_ad)) {
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
        Integer num = this.creative_type;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        Integer num2 = this.interaction_type;
        int iHashCode3 = num2 != null ? num2.hashCode() : 0;
        String str = this.landing_page;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        String str2 = this.video_url;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        Integer num3 = this.video_duration;
        int iHashCode6 = num3 != null ? num3.hashCode() : 0;
        Size size = this.video_size;
        int iHashCode7 = size != null ? size.hashCode() : 0;
        ByteString byteString = this.html_snippet;
        int iHashCode8 = byteString != null ? byteString.hashCode() : 0;
        String str3 = this.endcard_url;
        int iHashCode9 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.video_md5;
        int iHashCode10 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.endcard_md5;
        int iHashCode11 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.deeplink_url;
        int iHashCode12 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.image_src;
        int iHashCode13 = str7 != null ? str7.hashCode() : 0;
        Size size2 = this.image_size;
        int iHashCode14 = size2 != null ? size2.hashCode() : 0;
        String str8 = this.image_md5;
        int iHashCode15 = str8 != null ? str8.hashCode() : 0;
        Integer num4 = this.image_type;
        int iHashCode16 = num4 != null ? num4.hashCode() : 0;
        Integer num5 = this.click_type;
        int iHashCode17 = num5 != null ? num5.hashCode() : 0;
        Boolean bool = this.has_companion_endcard;
        int iHashCode18 = bool != null ? bool.hashCode() : 0;
        CompanionEndcard companionEndcard = this.companion;
        int iHashCode19 = companionEndcard != null ? companionEndcard.hashCode() : 0;
        WebEventHandle webEventHandle = this.web_event_handle;
        int iHashCode20 = webEventHandle != null ? webEventHandle.hashCode() : 0;
        Integer num6 = this.template_type;
        int iHashCode21 = num6 != null ? num6.hashCode() : 0;
        Integer num7 = this.video_reciprocal_millisecond;
        int iHashCode22 = num7 != null ? num7.hashCode() : 0;
        String str9 = this.html_url;
        int iHashCode23 = str9 != null ? str9.hashCode() : 0;
        Boolean bool2 = this.enable_collapse_tool_bar;
        int iHashCode24 = bool2 != null ? bool2.hashCode() : 0;
        Integer num8 = this.open_market_mode;
        int iHashCode25 = num8 != null ? num8.hashCode() : 0;
        Integer num9 = this.play_mode;
        int iHashCode26 = num9 != null ? num9.hashCode() : 0;
        Integer num10 = this.sub_interaction_type;
        int iHashCode27 = num10 != null ? num10.hashCode() : 0;
        String str10 = this.title;
        int iHashCode28 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.desc;
        int iHashCode29 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.icon_url;
        int iHashCode30 = str12 != null ? str12.hashCode() : 0;
        Float f = this.score;
        int iHashCode31 = f != null ? f.hashCode() : 0;
        Integer num11 = this.template_id;
        int iHashCode32 = num11 != null ? num11.hashCode() : 0;
        Boolean bool3 = this.disable_auto_deeplink;
        int iHashCode33 = bool3 != null ? bool3.hashCode() : 0;
        ByteString byteString2 = this.closecard_html_snippet;
        int iHashCode34 = byteString2 != null ? byteString2.hashCode() : 0;
        String str13 = this.app_name;
        int iHashCode35 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.button_text;
        int iHashCode36 = str14 != null ? str14.hashCode() : 0;
        AdPrivacy adPrivacy = this.ad_privacy;
        int iHashCode37 = adPrivacy != null ? adPrivacy.hashCode() : 0;
        Integer num12 = this.video_byte_size;
        int iHashCode38 = num12 != null ? num12.hashCode() : 0;
        String str15 = this.html_src;
        int iHashCode39 = str15 != null ? str15.hashCode() : 0;
        ResponseNativeAd responseNativeAd = this.native_ad;
        int iHashCode40 = ((iHashCode39 + ((iHashCode38 + ((iHashCode37 + ((iHashCode36 + ((iHashCode35 + ((iHashCode34 + ((iHashCode33 + ((iHashCode32 + ((iHashCode31 + ((iHashCode30 + ((iHashCode29 + ((iHashCode28 + ((iHashCode27 + ((iHashCode26 + ((iHashCode25 + ((iHashCode24 + ((iHashCode23 + ((iHashCode22 + ((iHashCode21 + ((iHashCode20 + ((iHashCode19 + ((iHashCode18 + ((iHashCode17 + ((iHashCode16 + ((iHashCode15 + ((iHashCode14 + ((iHashCode13 + ((iHashCode12 + ((iHashCode11 + ((iHashCode10 + ((iHashCode9 + ((iHashCode8 + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37) + (responseNativeAd != null ? responseNativeAd.hashCode() : 0);
        this.hashCode = iHashCode40;
        return iHashCode40;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.creative_type = this.creative_type;
        builder.interaction_type = this.interaction_type;
        builder.landing_page = this.landing_page;
        builder.video_url = this.video_url;
        builder.video_duration = this.video_duration;
        builder.video_size = this.video_size;
        builder.html_snippet = this.html_snippet;
        builder.endcard_url = this.endcard_url;
        builder.video_md5 = this.video_md5;
        builder.endcard_md5 = this.endcard_md5;
        builder.deeplink_url = this.deeplink_url;
        builder.image_src = this.image_src;
        builder.image_size = this.image_size;
        builder.image_md5 = this.image_md5;
        builder.image_type = this.image_type;
        builder.click_type = this.click_type;
        builder.has_companion_endcard = this.has_companion_endcard;
        builder.companion = this.companion;
        builder.web_event_handle = this.web_event_handle;
        builder.template_type = this.template_type;
        builder.video_reciprocal_millisecond = this.video_reciprocal_millisecond;
        builder.html_url = this.html_url;
        builder.enable_collapse_tool_bar = this.enable_collapse_tool_bar;
        builder.open_market_mode = this.open_market_mode;
        builder.play_mode = this.play_mode;
        builder.sub_interaction_type = this.sub_interaction_type;
        builder.title = this.title;
        builder.desc = this.desc;
        builder.icon_url = this.icon_url;
        builder.score = this.score;
        builder.template_id = this.template_id;
        builder.disable_auto_deeplink = this.disable_auto_deeplink;
        builder.closecard_html_snippet = this.closecard_html_snippet;
        builder.app_name = this.app_name;
        builder.button_text = this.button_text;
        builder.ad_privacy = this.ad_privacy;
        builder.video_byte_size = this.video_byte_size;
        builder.html_src = this.html_src;
        builder.native_ad = this.native_ad;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.creative_type != null) {
            sb.append(", creative_type=");
            sb.append(this.creative_type);
        }
        if (this.interaction_type != null) {
            sb.append(", interaction_type=");
            sb.append(this.interaction_type);
        }
        if (this.landing_page != null) {
            sb.append(", landing_page=");
            sb.append(this.landing_page);
        }
        if (this.video_url != null) {
            sb.append(", video_url=");
            sb.append(this.video_url);
        }
        if (this.video_duration != null) {
            sb.append(", video_duration=");
            sb.append(this.video_duration);
        }
        if (this.video_size != null) {
            sb.append(", video_size=");
            sb.append(this.video_size);
        }
        if (this.html_snippet != null) {
            sb.append(", html_snippet=");
            sb.append(this.html_snippet);
        }
        if (this.endcard_url != null) {
            sb.append(", endcard_url=");
            sb.append(this.endcard_url);
        }
        if (this.video_md5 != null) {
            sb.append(", video_md5=");
            sb.append(this.video_md5);
        }
        if (this.endcard_md5 != null) {
            sb.append(", endcard_md5=");
            sb.append(this.endcard_md5);
        }
        if (this.deeplink_url != null) {
            sb.append(", deeplink_url=");
            sb.append(this.deeplink_url);
        }
        if (this.image_src != null) {
            sb.append(", image_src=");
            sb.append(this.image_src);
        }
        if (this.image_size != null) {
            sb.append(", image_size=");
            sb.append(this.image_size);
        }
        if (this.image_md5 != null) {
            sb.append(", image_md5=");
            sb.append(this.image_md5);
        }
        if (this.image_type != null) {
            sb.append(", image_type=");
            sb.append(this.image_type);
        }
        if (this.click_type != null) {
            sb.append(", click_type=");
            sb.append(this.click_type);
        }
        if (this.has_companion_endcard != null) {
            sb.append(", has_companion_endcard=");
            sb.append(this.has_companion_endcard);
        }
        if (this.companion != null) {
            sb.append(", companion=");
            sb.append(this.companion);
        }
        if (this.web_event_handle != null) {
            sb.append(", web_event_handle=");
            sb.append(this.web_event_handle);
        }
        if (this.template_type != null) {
            sb.append(", template_type=");
            sb.append(this.template_type);
        }
        if (this.video_reciprocal_millisecond != null) {
            sb.append(", video_reciprocal_millisecond=");
            sb.append(this.video_reciprocal_millisecond);
        }
        if (this.html_url != null) {
            sb.append(", html_url=");
            sb.append(this.html_url);
        }
        if (this.enable_collapse_tool_bar != null) {
            sb.append(", enable_collapse_tool_bar=");
            sb.append(this.enable_collapse_tool_bar);
        }
        if (this.open_market_mode != null) {
            sb.append(", open_market_mode=");
            sb.append(this.open_market_mode);
        }
        if (this.play_mode != null) {
            sb.append(", play_mode=");
            sb.append(this.play_mode);
        }
        if (this.sub_interaction_type != null) {
            sb.append(", sub_interaction_type=");
            sb.append(this.sub_interaction_type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.icon_url);
        }
        if (this.score != null) {
            sb.append(", score=");
            sb.append(this.score);
        }
        if (this.template_id != null) {
            sb.append(", template_id=");
            sb.append(this.template_id);
        }
        if (this.disable_auto_deeplink != null) {
            sb.append(", disable_auto_deeplink=");
            sb.append(this.disable_auto_deeplink);
        }
        if (this.closecard_html_snippet != null) {
            sb.append(", closecard_html_snippet=");
            sb.append(this.closecard_html_snippet);
        }
        if (this.app_name != null) {
            sb.append(", app_name=");
            sb.append(this.app_name);
        }
        if (this.button_text != null) {
            sb.append(", button_text=");
            sb.append(this.button_text);
        }
        if (this.ad_privacy != null) {
            sb.append(", ad_privacy=");
            sb.append(this.ad_privacy);
        }
        if (this.video_byte_size != null) {
            sb.append(", video_byte_size=");
            sb.append(this.video_byte_size);
        }
        if (this.html_src != null) {
            sb.append(", html_src=");
            sb.append(this.html_src);
        }
        if (this.native_ad != null) {
            sb.append(", native_ad=");
            sb.append(this.native_ad);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "MaterialMeta{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
