package com.xmlywind.sdk.base.models;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.a.c;
import com.xmlywind.sdk.base.common.e;
import com.xmlywind.sdk.base.common.f;
import com.xmlywind.sdk.base.common.j;
import com.xmlywind.sdk.base.common.v;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.a.b;
import com.xmlywind.sdk.common.models.sigdsp.pb.Ad;
import com.xmlywind.sdk.common.models.sigdsp.pb.AdPrivacy;
import com.xmlywind.sdk.common.models.sigdsp.pb.AdSetting;
import com.xmlywind.sdk.common.models.sigdsp.pb.ClickAreaSetting;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.sdk.common.models.sigdsp.pb.NativeAdSetting;
import com.xmlywind.sdk.common.models.sigdsp.pb.ResponseAsset;
import com.xmlywind.sdk.common.models.sigdsp.pb.ResponseAssetImage;
import com.xmlywind.sdk.common.models.sigdsp.pb.ResponseAssetVideo;
import com.xmlywind.sdk.common.models.sigdsp.pb.ResponseNativeAd;
import com.xmlywind.sdk.common.models.sigdsp.pb.RvAdSetting;
import com.xmlywind.sdk.common.models.sigdsp.pb.SingleNativeAdSetting;
import com.xmlywind.sdk.common.models.sigdsp.pb.SlotAdSetting;
import com.xmlywind.sdk.common.models.sigdsp.pb.SplashAdSetting;
import com.xmlywind.sdk.common.models.sigdsp.pb.Tracking;
import com.xmlywind.sdk.common.utils.d;
import com.xmlywind.sdk.common.utils.k;
import com.xmlywind.sdk.common.utils.m;
import com.xmlywind.sdk.common.utils.n;
import com.xmlywind.sdk.videoAd.a;
import com.xmlywind.wire.okio.ByteString;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes22.dex */
public class BaseAdUnit implements Serializable {
    private static final long serialVersionUID = 1;
    private String a;
    private String b;
    private String c;
    private Ad d;
    private int e;
    private long f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private List m;
    private SigVideo n;
    private HashMap<String, List<e>> o;
    private SigMacroCommon p;
    private VideoStatusCommon q;
    private ClickCommon r;
    private String s;
    private SlotAdSetting t;
    private double u = -1.0d;
    private double v = -1.0d;
    private transient v w;
    private int x;
    private transient f y;

    private String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(d.a() + String.format("/%s.mp4", getVideo_md5()));
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            File fileC = com.xmlywind.sdk.base.common.d.e().c(str);
            if (fileC != null && fileC.exists()) {
                return fileC.getAbsolutePath();
            }
        }
        return null;
    }

    private static boolean a(String str, String str2) {
        String strB = k.b(str);
        SigmobLog.d("path: [ " + str + " ] calc [ " + strB + " ] origin " + str2);
        return strB != null && strB.equalsIgnoreCase(str2);
    }

    public static BaseAdUnit adUnit(Ad ad, String str, String str2, SlotAdSetting slotAdSetting) {
        ByteString byteString;
        ResponseNativeAd nativeAd;
        BaseAdUnit baseAdUnit = null;
        try {
            MaterialMeta materialMeta = ad.materials.get(0);
            if (materialMeta == null) {
                return null;
            }
            BaseAdUnit baseAdUnit2 = new BaseAdUnit();
            try {
                baseAdUnit2.f = System.currentTimeMillis();
                baseAdUnit2.a = ad.adslot_id;
                baseAdUnit2.e = ad.ad_type.intValue();
                baseAdUnit2.d = ad;
                baseAdUnit2.c = ad.crid;
                baseAdUnit2.b = ad.camp_id;
                baseAdUnit2.j = str;
                baseAdUnit2.h = materialMeta.endcard_md5;
                baseAdUnit2.g = materialMeta.video_md5;
                baseAdUnit2.k = str2;
                baseAdUnit2.i = ad.ad_source_channel;
                if ((materialMeta.creative_type.intValue() == j.CreativeTypeVideo_Html_Snippet.a() || materialMeta.creative_type.intValue() == j.CreativeTypeVideo_transparent_html.a()) && (byteString = materialMeta.html_snippet) != null) {
                    byteString.size();
                }
                baseAdUnit2.t = slotAdSetting;
                j(baseAdUnit2);
                if (ad.ad_track_macro != null) {
                    baseAdUnit2.getMacroCommon().setServerMacroMap(ad.ad_track_macro);
                }
                if (baseAdUnit2.e == 5 && (nativeAd = baseAdUnit2.getNativeAd()) == null) {
                    if (nativeAd.type.intValue() == 1) {
                        baseAdUnit2.getNativeVideo();
                    } else {
                        baseAdUnit2.getImageUrlList();
                    }
                }
                return baseAdUnit2;
            } catch (Throwable th) {
                th = th;
                baseAdUnit = baseAdUnit2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        SigmobLog.e("adUnit error", th);
        return baseAdUnit;
    }

    public static b.a createFileRefTable() {
        b.a.C1070a c1070a = new b.a.C1070a();
        c1070a.a("file_reference");
        c1070a.a("crid", "text");
        c1070a.a("adslot_id", "text");
        HashMap map = new HashMap();
        map.put("crid", "text");
        map.put("adslot_id", "text");
        map.put("video_md5", "string");
        map.put("endcard_md5", "string");
        c1070a.a(map);
        return c1070a.a();
    }

    public static b.a createTable() {
        b.a.C1070a c1070a = new b.a.C1070a();
        c1070a.a("ads");
        c1070a.a("crid", "text");
        c1070a.a("adslot_id", "text");
        Map<String, String> mapB = n.b(BaseAdUnit.class);
        if (mapB != null) {
            mapB.remove("serialVersionUID");
            mapB.remove("$change");
            mapB.remove("TAG");
            mapB.remove("macroCommon");
            c1070a.a(mapB);
        }
        return c1070a.a();
    }

    public static List<e> createTrackersForUrls(List<String> list, String str, String str2, Integer num) {
        m.a.a(list);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            e eVar = new e(it2.next(), str, str2);
            eVar.a(num);
            arrayList.add(eVar);
        }
        return arrayList;
    }

    public static long getSerialVersionUID() {
        return 1L;
    }

    public static String getTAG() {
        return "BaseAdUnit";
    }

    private static void j(BaseAdUnit baseAdUnit) {
        List<Tracking> ad_tracking = baseAdUnit.getAd_tracking();
        baseAdUnit.o = new HashMap<>();
        for (Tracking tracking : ad_tracking) {
            baseAdUnit.o.put(tracking.tracking_event_type, createTrackersForUrls(tracking.tracking_url, tracking.tracking_event_type, baseAdUnit.j, Integer.valueOf(baseAdUnit.getTrackingRetryNum())));
        }
    }

    public boolean checkEndCardZipValid() {
        if (TextUtils.isEmpty(getEndcard_url()) || TextUtils.isEmpty(this.h)) {
            return true;
        }
        return a(getEndCardZipPath(), getEndcard_md5());
    }

    public boolean checkVideoValid() {
        if (TextUtils.isEmpty(getVideo_url()) || TextUtils.isEmpty(this.g)) {
            return true;
        }
        return a(getVideoPath(), getVideo_OriginMD5());
    }

    public boolean enable_full_click() {
        SplashAdSetting splashAdSetting = getSplashAdSetting();
        if (splashAdSetting != null) {
            return splashAdSetting.enable_full_click.booleanValue();
        }
        return false;
    }

    public Ad getAd() {
        return this.d;
    }

    public f getAdConfig() {
        if (this.y == null) {
            int ad_type = getAd_type();
            if (ad_type != 1) {
                if (ad_type == 2) {
                    return com.xmlywind.sdk.splash.d.c(this);
                }
                if (ad_type == 3) {
                    return c.c(this);
                }
                if (ad_type != 4) {
                    if (ad_type == 5) {
                        return com.xmlywind.sdk.nativead.b.c(this);
                    }
                }
            }
            return a.c(this);
        }
        return f.a(this);
    }

    public Integer getAdExpiredTime() {
        Integer num;
        Ad ad = this.d;
        return Integer.valueOf((ad == null || (num = ad.expired_time) == null) ? 0 : num.intValue() * 1000);
    }

    public String getAdLogo() {
        return getAd_source_logo();
    }

    public double getAdPercent() {
        double d = this.u;
        if (d > 0.0d) {
            return d;
        }
        double d2 = this.v;
        if (d2 > 0.0d) {
            return d2;
        }
        return 1.7777777910232544d;
    }

    public File getAdPrivacyTemplateFile() {
        AdPrivacy adPrivacy = getadPrivacy();
        if (adPrivacy != null) {
            String str = adPrivacy.privacy_template_url;
            if (!TextUtils.isEmpty(str)) {
                String strA = k.a(str);
                return new File(d.g(d.b), strA + ".html");
            }
        }
        return null;
    }

    public AdSetting getAdSetting() {
        Ad ad = this.d;
        if (ad != null) {
            return ad.ad_setting;
        }
        return null;
    }

    public List<e> getAdTracker(com.xmlywind.sdk.base.common.a aVar) {
        HashMap<String, List<e>> map = this.o;
        if (map != null) {
            return map.get(aVar.a());
        }
        return null;
    }

    public List<e> getAdTracker(String str) {
        HashMap<String, List<e>> map = this.o;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public String getAd_source_channel() {
        return this.i;
    }

    public String getAd_source_logo() {
        if (Constants.IS_MOCK.booleanValue()) {
            return "https://n.sigmob.cn/icon/sig_logo.png";
        }
        Ad ad = this.d;
        if (ad != null) {
            return ad.ad_source_logo;
        }
        return null;
    }

    public List<Tracking> getAd_tracking() {
        Ad ad = this.d;
        if (ad != null) {
            return ad.ad_tracking;
        }
        return null;
    }

    public int getAd_type() {
        return this.e;
    }

    public String getAdslot_id() {
        return this.a;
    }

    public String getAppName() {
        Map<String, String> map;
        AdPrivacy adPrivacy = getadPrivacy();
        if (adPrivacy == null || (map = adPrivacy.privacy_template_info) == null) {
            return null;
        }
        return map.get("app_name");
    }

    public String getAppVersion() {
        Map<String, String> map;
        AdPrivacy adPrivacy = getadPrivacy();
        if (adPrivacy == null || (map = adPrivacy.privacy_template_info) == null) {
            return null;
        }
        return map.get("app_version");
    }

    public String getBid_token() {
        return this.l;
    }

    public String getCTAText() {
        MaterialMeta material = getMaterial();
        String str = material != null ? material.button_text : null;
        if (TextUtils.isEmpty(str)) {
            return material.interaction_type.intValue() == 1 ? "查看详情" : "立即下载";
        }
        return str;
    }

    public String getCamp_id() {
        return this.b;
    }

    public ClickAreaSetting getClickAreaSetting() {
        ClickAreaSetting clickAreaSetting;
        RvAdSetting rvAdSetting = getRvAdSetting();
        boolean zBooleanValue = Constants.IS_MOCK.booleanValue();
        Float fValueOf = Float.valueOf(0.1f);
        if (!zBooleanValue && (clickAreaSetting = rvAdSetting.click_setting) != null) {
            return clickAreaSetting;
        }
        ClickAreaSetting.Builder builder = new ClickAreaSetting.Builder();
        builder.bottom = fValueOf;
        builder.right = fValueOf;
        builder.top = fValueOf;
        builder.left = fValueOf;
        return builder.build();
    }

    public ClickCommon getClickCommon() {
        if (this.r == null) {
            this.r = new ClickCommon();
        }
        return this.r;
    }

    public String getCloseCardHtmlData() {
        if (getMaterial() == null || (getMaterial().closecard_html_snippet == null && getMaterial().closecard_html_snippet.size() < 10)) {
            return null;
        }
        return getMaterial().closecard_html_snippet.utf8();
    }

    public String getCompanyName() {
        Map<String, String> map;
        AdPrivacy adPrivacy = getadPrivacy();
        if (adPrivacy == null || (map = adPrivacy.privacy_template_info) == null) {
            return null;
        }
        return map.get("app_company");
    }

    public long getCreate_time() {
        return this.f;
    }

    public com.xmlywind.sdk.base.views.b.EnumC1067b getCreativeResourceType() {
        if (TextUtils.isEmpty(getEndcard_url()) || (getCreativeType() != j.CreativeTypeVideo_Tar.a() && getCreativeType() != j.CreativeTypeVideo_Tar_Companion.a())) {
            if (!TextUtils.isEmpty(getHtmlData())) {
                return com.xmlywind.sdk.base.views.b.EnumC1067b.HTML_RESOURCE;
            }
            if (!TextUtils.isEmpty(getHtmlUrl())) {
                return com.xmlywind.sdk.base.views.b.EnumC1067b.URL_RESOURCE;
            }
        }
        return com.xmlywind.sdk.base.views.b.EnumC1067b.NATIVE_RESOURCE;
    }

    public int getCreativeType() {
        if (getMaterial() != null) {
            return getMaterial().creative_type.intValue();
        }
        return 0;
    }

    public String getCrid() {
        return this.c;
    }

    public String getDesc() {
        MaterialMeta material = getMaterial();
        if (material != null) {
            return material.desc;
        }
        return null;
    }

    public boolean getDisableAutoLoad() {
        RvAdSetting rvAdSetting = getRvAdSetting();
        if (rvAdSetting != null) {
            return rvAdSetting.disable_auto_load.booleanValue();
        }
        return false;
    }

    public String getEndCardDirPath() {
        return d.a() + String.format("/%s/", getEndcard_md5());
    }

    public String getEndCardIndexPath() {
        return getEndCardDirPath() + "endcard.html";
    }

    public String getEndCardZipPath() {
        return d.a() + String.format("/%s.tgz", this.h);
    }

    public String getEndCard_OriginMD5() {
        return this.h;
    }

    public int getEndTime() {
        RvAdSetting rvAdSetting = getRvAdSetting();
        if (rvAdSetting != null) {
            return rvAdSetting.end_time.intValue();
        }
        return 0;
    }

    public int getEndcardCloseImage() {
        RvAdSetting rvAdSetting = getRvAdSetting();
        if (rvAdSetting != null) {
            return rvAdSetting.endcard_close_image.intValue();
        }
        return 0;
    }

    public String getEndcard_md5() {
        return !TextUtils.isEmpty(this.h) ? this.h : k.a(getCrid());
    }

    public String getEndcard_url() {
        MaterialMeta material = getMaterial();
        if (material != null) {
            return material.endcard_url;
        }
        return null;
    }

    public float getFinishedTime() {
        RvAdSetting rvAdSetting = getRvAdSetting();
        if (rvAdSetting != null) {
            return rvAdSetting.finished.floatValue();
        }
        return 1.0f;
    }

    public boolean getFullClickOnVideo() {
        if (Constants.IS_MOCK.booleanValue()) {
            return true;
        }
        RvAdSetting rvAdSetting = getRvAdSetting();
        if (rvAdSetting != null) {
            return rvAdSetting.full_click_on_video.booleanValue();
        }
        return false;
    }

    public String getHtmlData() {
        if (getMaterial() == null || (getMaterial().html_snippet == null && getMaterial().html_snippet.size() < 10)) {
            return null;
        }
        return getMaterial().html_snippet.utf8();
    }

    public String getHtmlUrl() {
        if (getMaterial() == null) {
            return null;
        }
        return getMaterial().html_url;
    }

    public String getIconUrl() {
        MaterialMeta material = getMaterial();
        if (material != null) {
            return material.icon_url;
        }
        return null;
    }

    public List<SigImage> getImageUrlList() {
        ResponseNativeAd nativeAd = getNativeAd();
        if (this.m == null) {
            this.m = new ArrayList();
            if (nativeAd != null && nativeAd.type.intValue() != 1) {
                Iterator<ResponseAsset> it2 = nativeAd.assets.iterator();
                while (it2.hasNext()) {
                    ResponseAssetImage responseAssetImage = it2.next().image;
                    if (responseAssetImage != null) {
                        SigImage sigImage = new SigImage();
                        sigImage.imageUrl = responseAssetImage.url;
                        sigImage.height = responseAssetImage.h.intValue();
                        sigImage.width = responseAssetImage.w.intValue();
                        if (this.u < 0.0d && responseAssetImage.w.intValue() > 0 && responseAssetImage.h.intValue() > 0) {
                            this.u = (responseAssetImage.w.intValue() * 1.0f) / responseAssetImage.h.intValue();
                        }
                        this.m.add(sigImage);
                    }
                }
            }
        }
        return this.m;
    }

    public boolean getInvisibleAdLabel() {
        RvAdSetting rvAdSetting;
        Boolean bool;
        if (getAd_type() == 2) {
            SplashAdSetting splashAdSetting = getSplashAdSetting();
            if (splashAdSetting != null) {
                bool = splashAdSetting.invisible_ad_label;
                return bool.booleanValue();
            }
            return false;
        }
        if ((getAd_type() == 1 || getAd_type() == 4) && (rvAdSetting = getRvAdSetting()) != null) {
            bool = rvAdSetting.invisible_ad_label;
            return bool.booleanValue();
        }
        return false;
    }

    public String getLanding_page() {
        if (getMaterial() != null) {
            return getMaterial().landing_page;
        }
        return null;
    }

    public String getLoad_id() {
        return this.k;
    }

    public SigMacroCommon getMacroCommon() {
        if (this.p == null) {
            this.p = new SigMacroCommon();
            String video_url = getVideo_url();
            if (!TextUtils.isEmpty(video_url)) {
                try {
                    String strEncode = URLEncoder.encode(video_url, "UTF-8");
                    if (!TextUtils.isEmpty(strEncode)) {
                        this.p.addMarcoKey(SigMacroCommon._VURL_, strEncode);
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return this.p;
    }

    public MaterialMeta getMaterial() {
        List<MaterialMeta> list;
        Ad ad = this.d;
        if (ad == null || (list = ad.materials) == null || list.size() <= 0) {
            return null;
        }
        return this.d.materials.get(0);
    }

    public ResponseNativeAd getNativeAd() {
        List<MaterialMeta> list;
        Ad ad = this.d;
        if (ad == null || (list = ad.materials) == null || list.size() <= 0) {
            return null;
        }
        return this.d.materials.get(0).native_ad;
    }

    public NativeAdSetting getNativeAdSetting() {
        SlotAdSetting slotAdSetting = this.t;
        if (slotAdSetting != null) {
            return slotAdSetting.native_setting;
        }
        return null;
    }

    public SigVideo getNativeVideo() {
        ResponseNativeAd nativeAd = getNativeAd();
        if (this.n == null && nativeAd != null && nativeAd.type.intValue() == 1) {
            for (ResponseAsset responseAsset : nativeAd.assets) {
                ResponseAssetVideo responseAssetVideo = responseAsset.video;
                if (responseAssetVideo != null) {
                    if (this.n == null) {
                        this.n = new SigVideo();
                    }
                    SigVideo sigVideo = this.n;
                    sigVideo.c = responseAssetVideo.url;
                    sigVideo.b = responseAssetVideo.h.intValue();
                    this.n.a = responseAssetVideo.w.intValue();
                    if (this.u < 0.0d && responseAssetVideo.h.intValue() > 0 && responseAssetVideo.w.intValue() > 0) {
                        this.u = (responseAssetVideo.w.intValue() * 1.0f) / responseAssetVideo.h.intValue();
                    }
                }
                ResponseAssetImage responseAssetImage = responseAsset.image;
                if (responseAssetImage != null) {
                    if (this.n == null) {
                        this.n = new SigVideo();
                    }
                    this.n.d = responseAssetImage.url;
                }
            }
        }
        return this.n;
    }

    public int getPlayMode() {
        if (getMaterial() != null) {
            return getMaterial().play_mode.intValue();
        }
        return 0;
    }

    public String getProductId() {
        if (getAd() != null) {
            return getAd().product_id;
        }
        return null;
    }

    public String getProxyVideoUrl() {
        String video_url = getVideo_url();
        return !TextUtils.isEmpty(video_url) ? com.xmlywind.sdk.base.common.d.e().a(video_url) : video_url;
    }

    public String getRequestId() {
        return this.j;
    }

    public RvAdSetting getRvAdSetting() {
        SlotAdSetting slotAdSetting = this.t;
        if (slotAdSetting != null) {
            return slotAdSetting.rv_setting;
        }
        return null;
    }

    public v getSessionManager() {
        return this.w;
    }

    public SingleNativeAdSetting getSingleNativeSetting() {
        AdSetting adSetting = getAdSetting();
        if (adSetting != null) {
            return adSetting.single_native_setting;
        }
        return null;
    }

    public int getSkipSeconds() {
        RvAdSetting rvAdSetting = getRvAdSetting();
        if (rvAdSetting != null) {
            return rvAdSetting.skip_seconds.intValue();
        }
        return -1;
    }

    public SlotAdSetting getSlotAdSetting() {
        return this.t;
    }

    public SplashAdSetting getSplashAdSetting() {
        SlotAdSetting slotAdSetting = getSlotAdSetting();
        if (slotAdSetting != null) {
            return slotAdSetting.splash_setting;
        }
        return null;
    }

    public String getSplashFilePath() {
        StringBuilder sb;
        String str;
        if (j.CreativeTypeSplashVideo.a() == getMaterial().creative_type.intValue()) {
            sb = new StringBuilder();
            sb.append(d.b());
            sb.append(File.separator);
            str = getMaterial().video_url;
        } else {
            sb = new StringBuilder();
            sb.append(d.b());
            sb.append(File.separator);
            str = getMaterial().image_src;
        }
        sb.append(k.a(str));
        return sb.toString();
    }

    public String getSplashURL() {
        return j.CreativeTypeSplashVideo.a() == getMaterial().creative_type.intValue() ? getMaterial().video_url : getMaterial().image_src;
    }

    public String getTitle() {
        MaterialMeta material = getMaterial();
        if (material != null) {
            return material.title;
        }
        return null;
    }

    public int getTrackingRetryNum() {
        SlotAdSetting slotAdSetting = this.t;
        if (slotAdSetting != null) {
            return slotAdSetting.retry_count.intValue();
        }
        return 0;
    }

    public String getUuid() {
        if (this.s == null) {
            this.s = UUID.randomUUID().toString();
        }
        return this.s;
    }

    public String getVid() {
        if (getAd() != null) {
            return getAd().vid;
        }
        return null;
    }

    public VideoStatusCommon getVideoCommon() {
        if (this.q == null) {
            this.q = new VideoStatusCommon();
        }
        return this.q;
    }

    public String getVideoPath() {
        String strA = a(getVideo_url());
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        return d.a() + String.format("/%s.mp4", getVideo_md5());
    }

    public File getVideoProxyFile() {
        String strA = a(getVideo_url());
        if (!TextUtils.isEmpty(strA)) {
            return new File(strA);
        }
        String video_url = getVideo_url();
        if (TextUtils.isEmpty(video_url)) {
            return null;
        }
        return com.xmlywind.sdk.base.common.d.e().c(video_url);
    }

    public String getVideoThumbUrl() {
        SigVideo sigVideo = this.n;
        if (sigVideo != null) {
            return sigVideo.d;
        }
        return null;
    }

    public String getVideoTmpPath() {
        return d.a() + String.format("/%s.mp4.tmp", getVideo_md5());
    }

    public String getVideo_OriginMD5() {
        return this.g;
    }

    public String getVideo_md5() {
        return !TextUtils.isEmpty(this.g) ? this.g : k.a(getVideo_url());
    }

    public String getVideo_url() {
        Ad ad = this.d;
        if (ad != null && ad.materials.size() > 0) {
            if (this.d.ad_type.intValue() != 5) {
                return this.d.materials.get(0).video_url;
            }
            SigVideo nativeVideo = getNativeVideo();
            if (nativeVideo != null) {
                return nativeVideo.c;
            }
        }
        return null;
    }

    public AdPrivacy getadPrivacy() {
        MaterialMeta material = getMaterial();
        if (material != null) {
            return material.ad_privacy;
        }
        return null;
    }

    public String getadslot_id() {
        return this.a;
    }

    public void insertToDB(final com.xmlywind.sdk.common.a.c.a aVar) {
        com.xmlywind.sdk.common.b.c.a.b().a().submit(new Runnable() { // from class: com.xmlywind.sdk.base.models.BaseAdUnit.1
            @Override // java.lang.Runnable
            public void run() {
                b.C1071b.a aVar2 = new b.C1071b.a();
                aVar2.a("ads");
                HashMap map = new HashMap();
                map.put("adslot_id", BaseAdUnit.this.a);
                map.put("camp_id", BaseAdUnit.this.b);
                map.put("crid", BaseAdUnit.this.c);
                map.put("ad", BaseAdUnit.this.d.encode());
                map.put(AppEventsConstants.EVENT_PARAM_AD_TYPE, Integer.valueOf(BaseAdUnit.this.e));
                map.put("create_time", Long.valueOf(BaseAdUnit.this.f));
                map.put("video_md5", BaseAdUnit.this.getVideo_md5());
                map.put("endcard_md5", BaseAdUnit.this.getEndcard_md5());
                map.put("request_id", BaseAdUnit.this.j);
                map.put("ad_source_channel", BaseAdUnit.this.i);
                map.put("load_id", BaseAdUnit.this.k);
                aVar2.a(map);
                com.xmlywind.sdk.common.a.c.a().a(com.xmlywind.sdk.common.a.c.a().getWritableDatabase(), aVar2.a(), new com.xmlywind.sdk.common.a.c.a() { // from class: com.xmlywind.sdk.base.models.BaseAdUnit.1.1
                    @Override // com.xmlywind.sdk.common.a.c.a
                    public void onFailed(Throwable th) {
                        com.xmlywind.sdk.common.a.c.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.onFailed(th);
                        }
                        SigmobLog.e(th.getMessage());
                    }

                    @Override // com.xmlywind.sdk.common.a.c.a
                    public void onSuccess() {
                        SigmobLog.d(BaseAdUnit.this.getCrid() + "insert success!");
                        com.xmlywind.sdk.common.a.c.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.onSuccess();
                        }
                    }
                });
            }
        });
    }

    public boolean isEndCardIndexExist() {
        if (TextUtils.isEmpty(getEndcard_url()) || !(getCreativeType() == j.CreativeTypeVideo_Tar.a() || getCreativeType() == j.CreativeTypeVideo_Tar_Companion.a())) {
            return true;
        }
        return new File(getEndCardIndexPath()).exists();
    }

    public boolean isNativeAdH5() {
        return true;
    }

    public boolean isSkipSigmobBrowser() {
        int i = this.e;
        return (i == 2 || i == 5) ? false : true;
    }

    public boolean isUse_floating_btn() {
        SplashAdSetting splashAdSetting = getSplashAdSetting();
        if (splashAdSetting != null) {
            return splashAdSetting.use_floating_btn.booleanValue();
        }
        return false;
    }

    public boolean isVideoExist() {
        if (TextUtils.isEmpty(getVideo_url())) {
            return true;
        }
        String videoPath = getVideoPath();
        boolean zExists = new File(videoPath).exists();
        SigmobLog.d("isVideoExist path :" + videoPath + " isExist: " + zExists);
        return zExists;
    }

    public String resourcePath() {
        if (TextUtils.isEmpty(getEndcard_url()) || !(getCreativeType() == j.CreativeTypeVideo_Tar.a() || getCreativeType() == j.CreativeTypeVideo_Tar_Companion.a())) {
            return !TextUtils.isEmpty(getHtmlData()) ? getHtmlData() : getHtmlUrl();
        }
        return getEndCardIndexPath();
    }

    public void setAd(Ad ad) {
        this.d = ad;
    }

    public void setAdSize(int i, int i2) {
        this.x = i;
        this.x = i2;
        getMacroCommon().addMarcoKey(SigMacroCommon._WIDTH_, String.valueOf(i));
        getMacroCommon().addMarcoKey(SigMacroCommon._HEIGHT_, String.valueOf(i2));
    }

    public void setAd_source_channel(String str) {
        this.i = str;
    }

    public void setAd_type(int i) {
        this.e = i;
    }

    public void setAdslot_id(String str) {
        this.a = str;
    }

    public void setBid_token(String str) {
        this.l = str;
    }

    public void setCamp_id(String str) {
        this.b = str;
    }

    public void setCreate_time(long j) {
        this.f = j;
    }

    public void setCrid(String str) {
        this.c = str;
    }

    public void setEndcard_md5(String str) {
        this.h = str;
    }

    public void setLoad_id(String str) {
        this.k = str;
    }

    public void setMacroCommon(SigMacroCommon sigMacroCommon) {
        this.p = sigMacroCommon;
    }

    public void setRequest_id(String str) {
        this.j = str;
    }

    public void setSessionManager(v vVar) {
        this.w = vVar;
    }

    public void setVideo_md5(String str) {
        this.g = str;
    }

    public void setadslot_id(String str) {
        this.a = str;
    }

    public void updateRealAdPercent(double d) {
        this.v = d;
    }
}
