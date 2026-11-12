package com.huami.ad;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.huami.ad.AdRepository;
import com.huami.ad.db.AdKeeper;
import com.huami.ad.db.AdProvider;
import com.huami.ad.entity.TextImageEntity;
import com.huami.ad.entity.TextLinkEntity;
import com.huami.ad.utils.AdHelper;
import com.huami.ad.web.AdAPI;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.base.handler.ResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.MD5Util;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AdRepository {
    public static final String HUAMI_CLICK_PATH = "api/v1/link/appc/appid,deviceid,adid,android";
    public static final String HUAMI_EXPOSURE_PATH = "api/v1/link/appv/appid,deviceid,adid,android";
    public static final String HUAMI_PRODUCT_HOST = "https://api-analytics.huami.com/";
    public static final String HUAMI_STAGING_HOST = "https://api-analytics-test.huami.com/";
    public static final String SERVER_AD_MASTER = "admaster";
    public static final String SERVER_DOUBLE_CLICK = "doubleclick";
    public static final String SERVER_MIAO_ZHEN = "miaozhen";
    private static final String c = "AdRepository";
    private static final String d = "1D58CC36D0E46139DF55D7A7";
    private static final String e = "7D02FEFAC63E12212B004DCE";
    private static final String f = "sport_cards_columns_0";
    private static final String g = "sport_cards_columns_1";
    private static final String h = "sport_cards_columns_6";
    private static final String i = "sport_cards_columns_8";
    private static final String j = "sport_cards_columns_9";
    private static AdRepository k;
    private boolean a;
    private MonitorCallback b;

    public class a extends ResponseHandler {
        public a() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(AdRepository.c, "onFailure response : " + hMHttpResponseData, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                String str = new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8);
                HMLog.d(AdRepository.c, str, new Object[0]);
                AdProvider.getInstance().insertOrReplaceSportImgAd(AdHelper.parseData(str, AdProvider.CATEGORY_SPORT_AD));
            }
        }
    }

    private AdRepository() {
    }

    private void c(String str, String str2, String str3) {
        String str4;
        String str5;
        MonitorCallback monitorCallback = this.b;
        if (monitorCallback == null || !monitorCallback.sendHuamiMonitorToStaging()) {
            if (this.b != null) {
                str4 = this.b.getHuamiMonitorHost(HUAMI_PRODUCT_HOST) + str;
            } else {
                str4 = HUAMI_PRODUCT_HOST + str;
            }
            str5 = e;
        } else {
            str4 = "https://api-analytics-test.huami.com/" + str;
            str5 = d;
        }
        AdAPI.requestMonitor(str4.replaceFirst("appid", str5).replaceFirst("deviceid", str2).replaceFirst("adid", str3));
    }

    private void d(String str, String str2, String str3, String str4) {
        String strReplaceFirst;
        if (TextUtils.isEmpty(str2)) {
            HMLog.d(c, "url is empty !", new Object[0]);
            return;
        }
        boolean zEquals = str3.equals("enable");
        str.hashCode();
        switch (str) {
            case "miaozhen":
                strReplaceFirst = str2.replaceFirst("__OS__", "0");
                if (zEquals) {
                    strReplaceFirst = strReplaceFirst.replaceFirst("__ANDROIDID__", MD5Util.getMD5String(str4)).replaceFirst("__REQUESTID__", String.format(Locale.getDefault(), "%s%d", str4, Long.valueOf(System.currentTimeMillis())));
                    break;
                }
                break;
            case "doubleclick":
                strReplaceFirst = str2.replaceFirst("\\[timestamp]", String.valueOf(System.currentTimeMillis()));
                if (zEquals) {
                    strReplaceFirst = strReplaceFirst.replaceFirst("dc_rdid=", "dc_rdid=" + str4);
                    break;
                }
                break;
            case "admaster":
                strReplaceFirst = str2.replaceFirst("__OS__", "0");
                if (zEquals) {
                    strReplaceFirst = strReplaceFirst.replaceFirst("__AndroidID__", MD5Util.getMD5String(str4));
                    break;
                }
                break;
            default:
                HMLog.d(c, "type : " + str + " not match !", new Object[0]);
                return;
        }
        AdAPI.requestMonitor(strReplaceFirst);
    }

    private TextLinkEntity g(List<TextLinkEntity> list, String str) {
        Collections.sort(list, new Comparator() { // from class: z6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AdRepository.k((TextLinkEntity) obj, (TextLinkEntity) obj2);
            }
        });
        TextLinkEntity textLinkEntity = new TextLinkEntity();
        if (list.size() <= 1) {
            return textLinkEntity;
        }
        TextLinkEntity textLinkEntity2 = list.get(0);
        return TextUtils.equals(textLinkEntity2.id, str) ? list.get(1) : textLinkEntity2;
    }

    public static AdRepository getInstance() {
        if (k == null) {
            synchronized (AdRepository.class) {
                k = new AdRepository();
            }
        }
        return k;
    }

    private TextImageEntity h(List<TextImageEntity> list, String str) {
        Collections.sort(list, new Comparator() { // from class: y6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AdRepository.l((TextImageEntity) obj, (TextImageEntity) obj2);
            }
        });
        TextImageEntity textImageEntity = new TextImageEntity();
        if (list.size() <= 1) {
            return textImageEntity;
        }
        TextImageEntity textImageEntity2 = list.get(0);
        return TextUtils.equals(textImageEntity2.id, str) ? list.get(1) : textImageEntity2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int k(TextLinkEntity textLinkEntity, TextLinkEntity textLinkEntity2) {
        return textLinkEntity.displayCount - textLinkEntity2.displayCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int l(TextImageEntity textImageEntity, TextImageEntity textImageEntity2) {
        return textImageEntity.displayCount - textImageEntity2.displayCount;
    }

    public void clearData() {
        HMLog.d(c, "clearData...", new Object[0]);
        AdKeeper.saveSportAdList(f, null);
        AdKeeper.saveSportAdList(h, null);
        AdKeeper.saveSportAdList(i, null);
        AdKeeper.saveSportAdList(j, null);
        AdKeeper.saveSportAdList(g, null);
        this.a = false;
    }

    public TextLinkEntity e(int i2) {
        List<TextLinkEntity> localSportSummaryByType = AdProvider.getInstance().getLocalSportSummaryByType(i2);
        if (localSportSummaryByType == null || localSportSummaryByType.isEmpty()) {
            return null;
        }
        TextLinkEntity textLinkEntityG = localSportSummaryByType.size() == 1 ? localSportSummaryByType.get(0) : g(localSportSummaryByType, AdProvider.getInstance().getLastShowSportSummaryKey());
        String str = textLinkEntityG.id;
        AdProvider.getInstance().saveLastShowSportSummaryKey(str);
        AdProvider.getInstance().updateDisplayCount(str);
        return textLinkEntityG;
    }

    public TextLinkEntity f() {
        List<TextLinkEntity> localPauseTrainingVideoAd = AdProvider.getInstance().getLocalPauseTrainingVideoAd();
        if (localPauseTrainingVideoAd == null || localPauseTrainingVideoAd.isEmpty()) {
            return null;
        }
        TextLinkEntity textLinkEntityG = localPauseTrainingVideoAd.size() == 1 ? localPauseTrainingVideoAd.get(0) : g(localPauseTrainingVideoAd, AdProvider.getInstance().getLastShowPauseTrainingVideoAdKey());
        String str = textLinkEntityG.id;
        AdProvider.getInstance().saveLastShowPauseTrainingVideoAdKey(str);
        AdProvider.getInstance().updateDisplayCount(str);
        return textLinkEntityG;
    }

    public String getDeviceId() {
        String deviceId = AdHelper.getDeviceId();
        return TextUtils.isEmpty(deviceId) ? Analytics.getHmStatAnonymousId(AdModule.appContext) : deviceId;
    }

    public TextImageEntity getDisplayImageAd(int i2) {
        List<TextImageEntity> localSportImgAdByType = AdProvider.getInstance().getLocalSportImgAdByType(i2);
        if (localSportImgAdByType == null || localSportImgAdByType.isEmpty()) {
            return null;
        }
        TextImageEntity textImageEntityH = localSportImgAdByType.size() == 1 ? localSportImgAdByType.get(0) : h(localSportImgAdByType, AdProvider.getInstance().getLastShowSportImgAdKey());
        String str = textImageEntityH.id;
        AdProvider.getInstance().saveLastShowSportImgAdKey(str);
        AdProvider.getInstance().updateDisplayCount(str);
        return textImageEntityH;
    }

    public TextLinkEntity getPauseDisplayTrainingMessage() {
        List<TextLinkEntity> localPauseTrainingVideoMessage = AdProvider.getInstance().getLocalPauseTrainingVideoMessage();
        if (localPauseTrainingVideoMessage == null || localPauseTrainingVideoMessage.isEmpty()) {
            return null;
        }
        TextLinkEntity textLinkEntityG = localPauseTrainingVideoMessage.size() == 1 ? localPauseTrainingVideoMessage.get(0) : g(localPauseTrainingVideoMessage, AdProvider.getInstance().getLastShowPauseTrainingVideoMessageKey());
        String str = textLinkEntityG.id;
        AdProvider.getInstance().saveLastShowPauseTrainingVideoMessageKey(str);
        AdProvider.getInstance().updateDisplayCount(str);
        return textLinkEntityG;
    }

    public TextLinkEntity i() {
        List<TextLinkEntity> localRestTrainingVideoAd = AdProvider.getInstance().getLocalRestTrainingVideoAd();
        if (localRestTrainingVideoAd == null || localRestTrainingVideoAd.isEmpty()) {
            return null;
        }
        TextLinkEntity textLinkEntityG = localRestTrainingVideoAd.size() == 1 ? localRestTrainingVideoAd.get(0) : g(localRestTrainingVideoAd, AdProvider.getInstance().getLastShowRestTrainingVideoAdKey());
        String str = textLinkEntityG.id;
        AdProvider.getInstance().saveLastShowRestTrainingVideoAdKey(str);
        AdProvider.getInstance().updateDisplayCount(str);
        return textLinkEntityG;
    }

    public TextLinkEntity j() {
        List<TextLinkEntity> localRestTrainingVideoMessage = AdProvider.getInstance().getLocalRestTrainingVideoMessage();
        if (localRestTrainingVideoMessage == null || localRestTrainingVideoMessage.isEmpty()) {
            return null;
        }
        TextLinkEntity textLinkEntityG = localRestTrainingVideoMessage.size() == 1 ? localRestTrainingVideoMessage.get(0) : g(localRestTrainingVideoMessage, AdProvider.getInstance().getLastShowRestTrainingVideoMessageKey());
        String str = textLinkEntityG.id;
        AdProvider.getInstance().saveLastShowRestTrainingVideoMessageKey(str);
        AdProvider.getInstance().updateDisplayCount(str);
        return textLinkEntityG;
    }

    @SuppressLint({"MissingPermission"})
    public void requestMonitor(@Nullable String str, @Nullable String str2, boolean z) {
        String deviceId = getDeviceId();
        HMLog.i(c, "deviceId : " + deviceId, new Object[0]);
        MonitorCallback monitorCallback = this.b;
        if (monitorCallback != null) {
            if (monitorCallback.enableThirdPartyMonitor() && !TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString("type");
                    String strOptString2 = jSONObject.optString("exposure_uv_monitor");
                    String strOptString3 = jSONObject.optString("exposure_url");
                    String strOptString4 = jSONObject.optString("click_url");
                    if (z) {
                        d(strOptString, strOptString3, strOptString2, deviceId);
                    } else {
                        d(strOptString, strOptString4, strOptString2, deviceId);
                    }
                } catch (JSONException e2) {
                    HMLog.i(c, "requestMonitor : " + e2.getMessage(), new Object[0]);
                }
            }
            if (!this.b.enableHuamiMonitor() || TextUtils.isEmpty(str2)) {
                return;
            }
            if (z) {
                c(HUAMI_EXPOSURE_PATH, deviceId, str2);
            } else {
                c(HUAMI_CLICK_PATH, deviceId, str2);
            }
        }
    }

    public void resetSportAndTrainUpdatedFlag() {
        this.a = false;
    }

    public void setMonitorCallback(MonitorCallback monitorCallback) {
        this.b = monitorCallback;
    }

    public void updateSportImgAd() {
        HMLog.d(c, "updateSportImgAd...", new Object[0]);
        if (this.a) {
            return;
        }
        this.a = true;
        AdAPI.requestSportImgAd(new a());
    }
}
