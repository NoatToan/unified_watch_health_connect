package com.huami.ad.utils;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.ad.AdModule;
import com.huami.ad.Constants;
import com.huami.ad.db.AdProvider;
import com.huami.ad.entity.AdCardEntity;
import com.huami.ad.entity.HomePageNotify;
import com.huami.ad.entity.LaunchViewEntity;
import com.huami.ad.entity.TextImageEntity;
import com.huami.ad.entity.TextLinkEntity;
import com.huami.ad.utils.AdHelper;
import com.huami.ad.web.AdAPI;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.AndroidId;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.GlobalKeeper;
import com.xiaomi.hm.health.baseutil.SdkVersionUtil;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.databases.model.AdEntityDao;
import com.xiaomi.hm.health.databases.model.LaunchEntity;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import defpackage.u6;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class AdHelper implements Constants {
    private static final String a = "AdHelper";

    public class a extends TypeToken<List<HomePageNotify>> {
    }

    public static void deleteAllHomePagesAd() {
        HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.in(Arrays.asList(AdAPI.HOME_PAGE_ADS_ARRAY)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public static void deleteInvalidSportImgAd() {
        List<AdEntity> invalidSportImgAd = AdProvider.getInvalidSportImgAd();
        if (invalidSportImgAd == null || invalidSportImgAd.isEmpty()) {
            return;
        }
        final DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with(AdModule.appContext);
        Observable.from(invalidSportImgAd).observeOn(Schedulers.io()).subscribe(new Action1() { // from class: o6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AdHelper.l(configBuilderWith, (AdEntity) obj);
            }
        }, u6.a);
    }

    public static void deleteLaunchImage(LaunchEntity launchEntity) {
        if (launchEntity == null) {
            return;
        }
        final DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with(AdModule.appContext);
        Observable.just(launchEntity).observeOn(Schedulers.io()).subscribe(new Action1() { // from class: p6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AdHelper.m(configBuilderWith, (LaunchEntity) obj);
            }
        }, u6.a);
    }

    public static void deleteLaunchVideo(LaunchEntity launchEntity) {
        if (launchEntity == null) {
            return;
        }
        Observable.just(launchEntity).observeOn(Schedulers.io()).subscribe(new Action1() { // from class: t6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AdHelper.n((LaunchEntity) obj);
            }
        }, u6.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0065 -> B:30:0x0066). Please report as a decompilation issue!!! */
    @SuppressLint({"HardwareIds"})
    public static String getDeviceId() {
        String deviceId;
        String value = null;
        try {
            if (SdkVersionUtil.isQ()) {
                value = Build.VERSION.SDK_INT >= 26 ? ((AndroidId) PrivacyProvider.get("广告三方监测，RN及JS bridge封装了获取getDeviceId的方法，似乎实际未被调用。这里先进行替换。", AndroidId.class)).getValue() : null;
                return (value == null || value.isEmpty()) ? GlobalKeeper.getUuid() : value;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) AdModule.appContext.getSystemService("phone");
                if (telephonyManager == null) {
                    deviceId = null;
                } else {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 23) {
                        deviceId = telephonyManager.getDeviceId();
                    } else if (ContextCompat.checkSelfPermission(AdModule.appContext, "android.permission.READ_PHONE_STATE") != 0) {
                        deviceId = null;
                    } else if (i >= 26) {
                        deviceId = telephonyManager.getImei() == null ? telephonyManager.getMeid() : telephonyManager.getImei();
                    } else {
                        deviceId = telephonyManager.getDeviceId();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (deviceId != null) {
                try {
                    if (deviceId.length() < 14) {
                        return null;
                    }
                } catch (Exception e2) {
                    String str = deviceId;
                    e = e2;
                    value = str;
                }
            }
            return deviceId;
        } catch (Exception e3) {
            e = e3;
        }
        e.printStackTrace();
        HMLog.i(a, "READ_PHONE_STATE permission " + e.getMessage(), new Object[0]);
        return value;
    }

    public static File getGifFile(long j) {
        return FileUtils.getAppCacheDir(AdModule.appContext, Constants.GIF_PATH, j + Constants.GIF_RENAME_SUFFIX);
    }

    public static List<LaunchEntity> getLaunchList(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        HMLog.d(a, "getLaunchList " + str, new Object[0]);
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                LaunchEntity launchEntity = new LaunchEntity();
                launchEntity.setId(Long.valueOf(jSONObjectOptJSONObject.optLong("id", -1L)));
                launchEntity.setTitle(jSONObjectOptJSONObject.optString("title"));
                launchEntity.setMode(Integer.valueOf(jSONObjectOptJSONObject.optInt("mode")));
                launchEntity.setUrl(jSONObjectOptJSONObject.optString("target"));
                launchEntity.setStartTime(Long.valueOf(jSONObjectOptJSONObject.optLong("start_time")));
                launchEntity.setEndTime(Long.valueOf(jSONObjectOptJSONObject.optLong("expire_time")));
                launchEntity.setAdType(jSONObjectOptJSONObject.optString(AppEventsConstants.EVENT_PARAM_AD_TYPE));
                launchEntity.setIsLoadWithGPRS(Integer.valueOf(jSONObjectOptJSONObject.optInt("isLoadWithGPRS")));
                launchEntity.setImageUrl(jSONObjectOptJSONObject.optString("bg_img_url"));
                launchEntity.setBgVideoUrl(jSONObjectOptJSONObject.optString("bg_video_url"));
                launchEntity.setExtensions(jSONObjectOptJSONObject.optString(GPXTrackPoint.XML.TAG_EXTENSIONS));
                arrayList.add(launchEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.i(a, "getLaunchList Exception: " + e.getMessage(), new Object[0]);
        }
        return arrayList;
    }

    public static File getTempGifFile(long j) {
        return FileUtils.getAppCacheDir(AdModule.appContext, Constants.GIF_PATH, j + "");
    }

    public static File getTempVideoFile(long j) {
        return FileUtils.getAppCacheDir(AdModule.appContext, "video", j + "");
    }

    public static String getUrl(LaunchEntity launchEntity) {
        if (isGif(launchEntity)) {
            return launchEntity.imageUrl;
        }
        return isVideo(launchEntity) ? launchEntity.bgVideoUrl : "";
    }

    public static File getVideoFile(long j) {
        return FileUtils.getAppCacheDir(AdModule.appContext, "video", j + Constants.VIDEO_RENAME_SUFFIX);
    }

    public static boolean isDownCompleteOfVideo(long j) {
        return getVideoFile(j).exists();
    }

    public static boolean isGif(LaunchEntity launchEntity) {
        return TextUtils.equals(launchEntity.adType, "GIF");
    }

    public static boolean isPic(LaunchEntity launchEntity) {
        return TextUtils.equals(launchEntity.adType, "PIC");
    }

    public static boolean isVideo(LaunchEntity launchEntity) {
        return TextUtils.equals(launchEntity.adType, "VIDEO");
    }

    @NonNull
    private static String j(JSONObject jSONObject) {
        return jSONObject.has("classify") ? jSONObject.optJSONObject("classify").optString("name") : "";
    }

    @NonNull
    private static String k(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        StringBuilder sb = new StringBuilder();
        if (jSONObject.has("classify") && (jSONArrayOptJSONArray = jSONObject.optJSONObject("classify").optJSONArray("list")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                sb.append(jSONArrayOptJSONArray.optJSONObject(i).optString("key"));
                if (i != length - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(DisplayConfig.ConfigBuilder configBuilder, AdEntity adEntity) {
        File fileObtain = configBuilder.load(adEntity.getImgUrl()).obtain();
        if (fileObtain == null || !fileObtain.exists()) {
            return;
        }
        fileObtain.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(DisplayConfig.ConfigBuilder configBuilder, LaunchEntity launchEntity) {
        HMLog.d(a, "delete image file " + launchEntity.id, new Object[0]);
        File fileObtain = configBuilder.load(launchEntity.imageUrl).obtain();
        if (fileObtain == null || !fileObtain.exists()) {
            return;
        }
        fileObtain.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(LaunchEntity launchEntity) {
        HMLog.d(a, "delete video file " + launchEntity.id, new Object[0]);
        File videoFile = getVideoFile(launchEntity.id.longValue());
        if (videoFile.exists()) {
            videoFile.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(String str, HMLoadTarget hMLoadTarget, Boolean bool) {
        HMImageLoader.with(AdModule.appContext).load(str).downloadOnlyExecute(hMLoadTarget);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(AdEntity adEntity) {
        HMImageLoader.with(AdModule.appContext).load(adEntity.getImgUrl()).downloadOnlyExecute(null);
    }

    public static List<AdEntity> parseData(String str, String str2) {
        String strOptString;
        String str3;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(GPXTrackPoint.XML.TAG_EXTENSIONS);
                    if (jSONObjectOptJSONObject.has("assets")) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("assets");
                        String string = jSONObjectOptJSONObject2.toString();
                        strOptString = jSONObjectOptJSONObject2.optString("text");
                        str3 = string;
                    } else {
                        strOptString = "";
                        str3 = strOptString;
                    }
                    arrayList.add(new AdEntity(jSONObject.optString("id"), jSONObject.optString("title"), jSONObject.optString("sub_title"), jSONObject.optString("target"), jSONObject.optString("image"), jSONObject.optString("describe"), Integer.valueOf(jSONObject.optInt("mode")), jSONObjectOptJSONObject.optString("image"), 1, Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("jsbridge_auth")), k(jSONObjectOptJSONObject), j(jSONObjectOptJSONObject), Long.valueOf(jSONObjectOptJSONObject.optLong("endtime") * 1000), Long.valueOf(jSONObjectOptJSONObject.optLong("starttime") * 1000), jSONObjectOptJSONObject.optString("badge"), 0, Long.valueOf(System.currentTimeMillis()), str2, Boolean.TRUE, null, null, strOptString, null, null, null, null, str3, jSONObjectOptJSONObject.optString("ad"), 0L));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                HMLog.i(a, e.getMessage(), new Object[0]);
            }
        }
        return arrayList;
    }

    public static List<HomePageNotify> parseHomeNotify(String str) {
        return !TextUtils.isEmpty(str) ? (List) new Gson().fromJson(str, new a().getType()) : new ArrayList();
    }

    public static void preloadAdImg(final String str, final HMLoadTarget hMLoadTarget) {
        Observable.just(Boolean.TRUE).observeOn(Schedulers.io()).subscribe(new Action1() { // from class: q6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AdHelper.o(str, hMLoadTarget, (Boolean) obj);
            }
        }, u6.a);
    }

    public static void preloadValidHomePagesAdImg(List<AdEntity> list) {
        Observable.from(list).subscribe(new Action1() { // from class: s6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AdHelper.p((AdEntity) obj);
            }
        }, u6.a);
    }

    public static void preloadValidSportImgAd() {
        List<AdEntity> sportAd = AdProvider.getSportAd();
        final DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with(AdModule.appContext);
        Observable.from(sportAd).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: n6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AdHelper.q(configBuilderWith, (AdEntity) obj);
            }
        }, new Action1() { // from class: v6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AdHelper.s((Throwable) obj);
            }
        });
    }

    public static void preloadValidStatusPopAdImg() {
        Observable.from(AdProvider.getValidStatusAdPop()).subscribe(new Action1() { // from class: r6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AdHelper.t((TextImageEntity) obj);
            }
        }, u6.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(DisplayConfig.ConfigBuilder configBuilder, AdEntity adEntity) {
        configBuilder.load(adEntity.getImgUrl()).downloadOnly(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Throwable th) {
        HMLog.error(a, "", th, new Function0() { // from class: m6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdHelper.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(TextImageEntity textImageEntity) {
        HMImageLoader.with(AdModule.appContext).load(textImageEntity.image).downloadOnlyExecute(null);
    }

    public static AdCardEntity toStatusCardAd(AdEntity adEntity) {
        if (!TextUtils.equals(adEntity.category, "homepage_ad")) {
            return null;
        }
        AdCardEntity adCardEntity = new AdCardEntity();
        adCardEntity.id = adEntity.getId();
        adCardEntity.title = adEntity.getTitle();
        adCardEntity.iconUrl = adEntity.getIconUrl();
        adCardEntity.imageUrl = adEntity.getImgUrl();
        adCardEntity.status = adEntity.getStatus().intValue();
        adCardEntity.displayCount = adEntity.getDisplayCount().intValue();
        adCardEntity.target = adEntity.getTarget();
        adCardEntity.isMessageAd = TextUtils.equals(adEntity.badge, "message");
        adCardEntity.mode = adEntity.getMode().intValue();
        adCardEntity.adMonitor = adEntity.getAdMonitor();
        return adCardEntity;
    }

    public static TextImageEntity toTextImageAd(AdEntity adEntity) {
        if (!TextUtils.equals(adEntity.category, AdProvider.CATEGORY_SPORT_AD) && !TextUtils.equals(adEntity.category, AdProvider.CATEGORY_HOMEPAGE_POP) && !TextUtils.equals(adEntity.category, "sport_training_ad")) {
            return null;
        }
        TextImageEntity textImageEntity = new TextImageEntity();
        textImageEntity.id = adEntity.getId();
        textImageEntity.title = adEntity.getTitle();
        textImageEntity.describe = adEntity.getDescription();
        textImageEntity.image = adEntity.getImgUrl();
        textImageEntity.sportTypes = adEntity.getSupportType();
        textImageEntity.endTime = adEntity.getEndTime().longValue();
        textImageEntity.target = adEntity.getTarget();
        textImageEntity.mode = adEntity.getMode().intValue();
        textImageEntity.displayCount = adEntity.getDisplayCount().intValue();
        textImageEntity.adMonitor = adEntity.getAdMonitor();
        return textImageEntity;
    }

    public static TextLinkEntity toTextLinkEntity(AdEntity adEntity) {
        if (!TextUtils.equals(adEntity.category, AdProvider.CATEGORY_SPORT_SUMMARY_AD)) {
            return null;
        }
        TextLinkEntity textLinkEntity = new TextLinkEntity();
        textLinkEntity.id = adEntity.getId();
        textLinkEntity.summary = adEntity.getSubTitle();
        textLinkEntity.mode = adEntity.getMode().intValue();
        textLinkEntity.target = adEntity.getTarget();
        textLinkEntity.badge = adEntity.getBadge();
        textLinkEntity.supportType = adEntity.getSupportType();
        textLinkEntity.displayCount = adEntity.getDisplayCount().intValue();
        textLinkEntity.adMonitor = adEntity.getAdMonitor();
        return textLinkEntity;
    }

    public static TextLinkEntity toTrainingTextLinkEntity(AdEntity adEntity) {
        if (!TextUtils.equals(adEntity.category, AdProvider.CATEGORY_TRAINING_VIDEO_AD)) {
            return null;
        }
        TextLinkEntity textLinkEntity = new TextLinkEntity();
        textLinkEntity.id = adEntity.getId();
        textLinkEntity.summary = adEntity.getSubTitle();
        textLinkEntity.mode = adEntity.getMode().intValue();
        textLinkEntity.target = adEntity.getTarget();
        textLinkEntity.badge = adEntity.getBadge();
        textLinkEntity.supportType = adEntity.getSupportType();
        textLinkEntity.displayCount = adEntity.getDisplayCount().intValue();
        textLinkEntity.adMonitor = adEntity.getAdMonitor();
        return textLinkEntity;
    }

    public static LaunchViewEntity toViewEntity(LaunchEntity launchEntity) {
        if (launchEntity == null) {
            return null;
        }
        LaunchViewEntity launchViewEntity = new LaunchViewEntity();
        launchViewEntity.id = launchEntity.id.longValue();
        launchViewEntity.adType = launchEntity.adType;
        launchViewEntity.endTime = launchEntity.endTime.longValue();
        launchViewEntity.startTime = launchEntity.startTime.longValue();
        launchViewEntity.url = launchEntity.url;
        launchViewEntity.mode = launchEntity.getMode();
        launchViewEntity.title = launchEntity.title;
        launchViewEntity.imageUrl = launchEntity.imageUrl;
        launchViewEntity.extensions = launchEntity.extensions;
        return launchViewEntity;
    }
}
