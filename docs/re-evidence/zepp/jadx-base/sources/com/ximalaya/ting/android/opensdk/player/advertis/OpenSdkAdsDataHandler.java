package com.ximalaya.ting.android.opensdk.player.advertis;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.PreferenceConstantsInOpenSdk;
import com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.DeviceInfoProviderDefault;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import com.ximalaya.ting.android.opensdk.model.advertis.Advertis;
import com.ximalaya.ting.android.opensdk.model.advertis.AdvertisList;
import com.ximalaya.ting.android.opensdk.model.album.SubordinatedAlbum;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.advertis.shopAdsEvent.XmShopEvent;
import com.ximalaya.ting.android.opensdk.player.advertis.shopAdsEvent.XmShopEvents;
import com.ximalaya.ting.android.opensdk.player.advertis.shopAdsEvent.XmShopsRecord;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.opensdk.util.MyAsyncTask;
import com.ximalaya.ting.android.opensdk.util.NetworkType;
import com.ximalaya.ting.android.opensdk.util.SharedPreferencesUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class OpenSdkAdsDataHandler implements IXmAdsDataHandle {
    private static final int PLAY_POSITION_END = 3;
    private static final int PLAY_POSITION_FRONT = 1;
    private static final int PLAY_POSITION_MIDDLE = 2;
    public static boolean ignoreXmAd = false;
    private static OpenSdkAdsDataHandler instance = null;
    private static String mAndroidId = null;
    private static int resumeShowTime = 600000;
    private AppConfig mAppConfig;
    private TempAdvertis mTempAdvertis;
    private String playUrl;
    private List<String> prefixUrls;
    private long trackId;
    private boolean willShow;
    private boolean isRequest = false;
    private boolean ea = true;
    private boolean enableVideoAd = false;
    private long unlockTrackNum = 3;
    private boolean canPlayCenter = false;
    private boolean handleCenterAd = false;
    private long lastShowBrankAdTime = 0;
    private boolean lastIsEndPosition = false;

    public static class AppConfig extends XimalayaResponse {

        @SerializedName("ad_location")
        public AdLocaltion adLocaltion;

        @SerializedName("album_oral_models")
        public List<AlbumOral> albumOralModels;

        @SerializedName("app_name")
        public String appName;

        @SerializedName("audio_url_prefix")
        public String audioUrlPrefix;

        @SerializedName("brand_ad_interval")
        public int brandAdInterval = 300;

        @SerializedName("ea")
        public boolean ea;

        @SerializedName("enable_video_ad")
        public boolean enableVideoAd;

        @SerializedName("brand_ad_url")
        public AdUrl soundAddress;

        @SerializedName("unlock_track_num")
        public long unLockTrackNum;

        public class AdLocaltion {
            public boolean end;
            public boolean front;
            public boolean middle;

            public AdLocaltion() {
            }
        }

        public class AdUrl {
            public String end;
            public String front;
            public String middle;

            public AdUrl() {
            }
        }

        public class AlbumOral {

            @SerializedName("album_ids")
            public List<Long> albumIds;

            @SerializedName("brand_ad_url")
            public AdUrl brandAdUrl;

            public AlbumOral() {
            }
        }
    }

    public class TempAdvertis {
        public IDataCallBack<AdvertisList> callBack;
        public boolean hasUseBrandsAd;
        public long trackId;

        private TempAdvertis() {
            this.hasUseBrandsAd = true;
        }
    }

    private OpenSdkAdsDataHandler() {
    }

    public static String getAndroidId(Context context) {
        if (!TextUtils.isEmpty(mAndroidId)) {
            return mAndroidId;
        }
        if (context != null) {
            mAndroidId = Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        String str = mAndroidId;
        if (str == null || str.equalsIgnoreCase("android_id") || mAndroidId.equalsIgnoreCase("9774d56d682e549c")) {
            mAndroidId = DeviceInfoProviderDefault.RESULT_UNDEFINED;
        }
        return mAndroidId;
    }

    public static OpenSdkAdsDataHandler getInstance() {
        if (instance == null) {
            synchronized (OpenSdkAdsDataHandler.class) {
                if (instance == null) {
                    instance = new OpenSdkAdsDataHandler();
                }
            }
        }
        return instance;
    }

    @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsDataHandle
    public void cancleRequestTag(String str) {
    }

    public AdvertisList checkAndAddBrankAd(AdvertisList advertisList, String str, String str2) {
        return checkAndAddBrankAd(advertisList, str, "4".equals(str2) ? 3 : 1);
    }

    @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsDataHandle
    public String getAdsData(Track track, final Map<String, String> map, final IDataCallBack<AdvertisList> iDataCallBack) {
        List<String> list;
        int i;
        this.willShow = true;
        Logger.logToSd("OpenSdkAdsDataHandler  == 1");
        this.trackId = track.getDataId();
        if (map != null && XmPlayerService.getPlayerSrvice() != null) {
            float tempo = XmPlayerService.getPlayerSrvice().getPlayControl().getTempo();
            if (Float.compare(tempo, 0.8f) <= 0) {
                i = 0;
            } else {
                i = Float.compare(tempo, 1.4f) >= 0 ? 2 : 1;
            }
            Logger.logToSd("OpenSdkAdsDataHandler  == 2");
            map.put("playSpeed", i + "");
        }
        TempAdvertis tempAdvertis = new TempAdvertis();
        this.mTempAdvertis = tempAdvertis;
        tempAdvertis.trackId = this.trackId;
        tempAdvertis.callBack = iDataCallBack;
        final String str = map.get("playMethod");
        final long j = this.trackId;
        if (XmPlayerService.getPlayerSrvice() != null) {
            String trackUrl = XmPlayerService.getPlayerSrvice().getTrackUrl(track);
            this.playUrl = trackUrl;
            if (!TextUtils.isEmpty(trackUrl) || this.trackId <= 0) {
                String str2 = this.playUrl;
                if (str2 == null || !str2.startsWith("http")) {
                    if (this.trackId > 0) {
                        this.willShow = true;
                    } else {
                        this.willShow = false;
                    }
                }
            } else {
                this.willShow = true;
            }
        }
        if (!this.willShow) {
            iDataCallBack.onSuccess(null);
            return null;
        }
        if (this.isRequest) {
            if (!TextUtils.isEmpty(this.playUrl) && (list = this.prefixUrls) != null) {
                if (list.contains(Uri.parse(this.playUrl).getHost())) {
                    this.willShow = true;
                } else {
                    this.willShow = false;
                }
            }
            if (!this.willShow) {
                iDataCallBack.onSuccess(null);
            } else if (!this.ea) {
                iDataCallBack.onSuccess(checkAndAddBrankAd((AdvertisList) null, map.get(Advertis.FIELD_DURING_PLAY), str));
            } else {
                if ("4".equals(str)) {
                    iDataCallBack.onSuccess(checkAndAddBrankAd((AdvertisList) null, map.get(Advertis.FIELD_DURING_PLAY), str));
                    return null;
                }
                CommonRequest.getAdvertis(map, new IDataCallBack<AdvertisList>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler.3
                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onError(int i2, String str3) {
                        if (OpenSdkAdsDataHandler.this.trackId != j) {
                            return;
                        }
                        Logger.logToSd("OpenSdkAdsDataHandler  == 11   ");
                        iDataCallBack.onError(i2, str3);
                    }

                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onSuccess(AdvertisList advertisList) {
                        if (OpenSdkAdsDataHandler.this.trackId != j) {
                            return;
                        }
                        Logger.logToSd("OpenSdkAdsDataHandler  == 10   ");
                        if (advertisList != null && advertisList.getAdvertisList() != null) {
                            for (int i2 = 0; i2 < advertisList.getAdvertisList().size(); i2++) {
                                Advertis advertis = advertisList.getAdvertisList().get(i2);
                                if (advertis != null) {
                                    advertis.setTrackId(OpenSdkAdsDataHandler.this.trackId);
                                }
                            }
                        }
                        if (advertisList != null && advertisList.getAdvertisList() != null) {
                            OpenSdkAdsDataHandler.this.mTempAdvertis.hasUseBrandsAd = false;
                        }
                        iDataCallBack.onSuccess(OpenSdkAdsDataHandler.this.checkAndAddBrankAd(advertisList, (String) map.get(Advertis.FIELD_DURING_PLAY), str));
                    }
                }, 1500);
            }
        } else {
            Logger.logToSd("OpenSdkAdsDataHandler  == 3");
            CommonRequest.baseGetRequest("http://api.ximalaya.com/openapi-gateway-app/app/config", null, new IDataCallBack<AppConfig>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler.1
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i2, String str3) {
                    if (OpenSdkAdsDataHandler.this.trackId != j) {
                        return;
                    }
                    OpenSdkAdsDataHandler.this.isRequest = true;
                    Logger.logToSd("OpenSdkAdsDataHandler  == 9   ");
                    iDataCallBack.onSuccess(OpenSdkAdsDataHandler.this.checkAndAddBrankAd((AdvertisList) null, (String) map.get(Advertis.FIELD_DURING_PLAY), str));
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(AppConfig appConfig) {
                    OpenSdkAdsDataHandler.this.mAppConfig = appConfig;
                    if (OpenSdkAdsDataHandler.this.trackId != j) {
                        return;
                    }
                    if (appConfig != null) {
                        AppConfig.AdLocaltion adLocaltion = appConfig.adLocaltion;
                        if (adLocaltion != null) {
                            OpenSdkAdsDataHandler.this.canPlayCenter = adLocaltion.middle;
                            AppConfig.AdLocaltion adLocaltion2 = appConfig.adLocaltion;
                            OpenSdkAdsDataHandler.ignoreXmAd = (adLocaltion2.front || adLocaltion2.middle || adLocaltion2.end) ? false : true;
                        }
                        OpenSdkAdsDataHandler.this.ea = appConfig.ea;
                        OpenSdkAdsDataHandler.this.enableVideoAd = appConfig.enableVideoAd;
                        OpenSdkAdsDataHandler.this.unlockTrackNum = appConfig.unLockTrackNum;
                        if (SharedPreferencesUtil.getInstance(CommonRequest.getInstanse().getContext()).getLong(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_CAN_PLAY_AUDIO_NUMS) == -1) {
                            SharedPreferencesUtil.getInstance(CommonRequest.getInstanse().getContext()).saveLong(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_CAN_PLAY_AUDIO_NUMS, OpenSdkAdsDataHandler.this.unlockTrackNum);
                        }
                        String str3 = appConfig.audioUrlPrefix;
                        if (str3 != null) {
                            OpenSdkAdsDataHandler.this.prefixUrls = Arrays.asList(str3.split(","));
                        }
                        int unused = OpenSdkAdsDataHandler.resumeShowTime = appConfig.brandAdInterval * 1000;
                        if (!TextUtils.isEmpty(OpenSdkAdsDataHandler.this.playUrl)) {
                            if (OpenSdkAdsDataHandler.this.prefixUrls.contains(Uri.parse(OpenSdkAdsDataHandler.this.playUrl).getHost())) {
                                OpenSdkAdsDataHandler.this.willShow = true;
                            } else {
                                OpenSdkAdsDataHandler.this.willShow = false;
                            }
                        }
                        try {
                            if (!OpenSdkAdsDataHandler.this.willShow) {
                                iDataCallBack.onSuccess(null);
                            } else if (!appConfig.ea) {
                                Logger.logToSd("OpenSdkAdsDataHandler  == 6   ");
                                iDataCallBack.onSuccess(OpenSdkAdsDataHandler.this.checkAndAddBrankAd((AdvertisList) null, (String) map.get(Advertis.FIELD_DURING_PLAY), str));
                            } else {
                                if ("4".equals(str)) {
                                    iDataCallBack.onSuccess(OpenSdkAdsDataHandler.this.checkAndAddBrankAd((AdvertisList) null, (String) map.get(Advertis.FIELD_DURING_PLAY), str));
                                    return;
                                }
                                CommonRequest.getAdvertis(map, new IDataCallBack<AdvertisList>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler.1.1
                                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                                    public void onError(int i2, String str4) {
                                        long j2 = OpenSdkAdsDataHandler.this.trackId;
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        if (j2 != j) {
                                            return;
                                        }
                                        iDataCallBack.onError(i2, str4);
                                    }

                                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                                    public void onSuccess(AdvertisList advertisList) {
                                        if (OpenSdkAdsDataHandler.this.trackId != j) {
                                            return;
                                        }
                                        if (advertisList != null && advertisList.getAdvertisList() != null) {
                                            for (int i2 = 0; i2 < advertisList.getAdvertisList().size(); i2++) {
                                                if (advertisList.getAdvertisList().get(i2) != null) {
                                                    advertisList.getAdvertisList().get(i2).setTrackId(OpenSdkAdsDataHandler.this.trackId);
                                                }
                                            }
                                        }
                                        if (advertisList != null && advertisList.getAdvertisList() != null) {
                                            OpenSdkAdsDataHandler.this.mTempAdvertis.hasUseBrandsAd = false;
                                        }
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        iDataCallBack.onSuccess(OpenSdkAdsDataHandler.this.checkAndAddBrankAd(advertisList, (String) map.get(Advertis.FIELD_DURING_PLAY), str));
                                    }
                                }, 1500);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            Logger.logToSd("OpenSdkAdsDataHandler  == 7   ");
                            iDataCallBack.onSuccess(OpenSdkAdsDataHandler.this.checkAndAddBrankAd((AdvertisList) null, (String) map.get(Advertis.FIELD_DURING_PLAY), str));
                        }
                    } else {
                        Logger.logToSd("OpenSdkAdsDataHandler  == 8   ");
                        iDataCallBack.onSuccess(OpenSdkAdsDataHandler.this.checkAndAddBrankAd((AdvertisList) null, (String) map.get(Advertis.FIELD_DURING_PLAY), str));
                    }
                    OpenSdkAdsDataHandler.this.isRequest = true;
                }
            }, new BaseRequest.IRequestCallBack<AppConfig>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
                public AppConfig success(String str3) throws Exception {
                    return (AppConfig) new Gson().fromJson(str3, AppConfig.class);
                }
            });
        }
        return null;
    }

    public long getUnlockTrackNum() {
        return this.unlockTrackNum;
    }

    public boolean isEnableVideoAd() {
        return this.enableVideoAd;
    }

    @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsDataHandle
    public void onPlayProgress(int i, int i2) {
        if ((i2 / 2) / 1000 != i / 1000) {
            this.handleCenterAd = false;
            return;
        }
        TempAdvertis tempAdvertis = this.mTempAdvertis;
        if (((tempAdvertis == null || tempAdvertis.hasUseBrandsAd) && !this.canPlayCenter) || this.handleCenterAd || System.currentTimeMillis() - this.lastShowBrankAdTime <= resumeShowTime || ignoreXmAd || !this.willShow) {
            return;
        }
        TempAdvertis tempAdvertis2 = this.mTempAdvertis;
        if (tempAdvertis2 != null) {
            tempAdvertis2.hasUseBrandsAd = true;
        }
        XmPlayerService.getPlayerSrvice().pausePlay();
        if (this.mTempAdvertis != null) {
            AdvertisList advertisListCheckAndAddBrankAd = checkAndAddBrankAd((AdvertisList) null, "false", 2);
            this.handleCenterAd = true;
            this.mTempAdvertis.callBack.onSuccess(advertisListCheckAndAddBrankAd);
        }
    }

    @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsDataHandle
    public void release() {
        instance.isRequest = false;
    }

    public void setEnableVideoAd(boolean z) {
        this.enableVideoAd = z;
    }

    public void setUnlockTrackNum(long j) {
        this.unlockTrackNum = j;
    }

    @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsDataHandle
    @SuppressLint({"StaticFieldLeak"})
    public void upLoadAdsLog(final XmAdsManager.TaskWrapper taskWrapper) {
        AdvertisList advertisList;
        if (taskWrapper == null || (advertisList = taskWrapper.ads) == null || advertisList.getAdvertisList() == null || taskWrapper.ads.getAdvertisList().size() <= 0 || taskWrapper.ads.getAdvertisList().get(0) == null) {
            return;
        }
        if (taskWrapper.ads.getAdvertisList().get(0).getAdid() > 0 && !TextUtils.isEmpty(taskWrapper.ads.getAdvertisList().get(0).getSoundUrl()) && !"null".equals(taskWrapper.ads.getAdvertisList().get(0).getSoundUrl())) {
            new MyAsyncTask<Void, Void, Void>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler.4
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    Advertis advertis = taskWrapper.ads.getAdvertisList().get(0);
                    if (XmPlayerService.getPlayerSrvice() != null) {
                        if (advertis.getShowUrls() != null) {
                            Iterator<String> it2 = advertis.getShowUrls().iterator();
                            while (it2.hasNext()) {
                                AdUrlUtil.getInstance(XmPlayerService.getPlayerSrvice()).thirdAdStatRequest(it2.next());
                            }
                        }
                        if (advertis.getThirdShowStatUrls() != null) {
                            Iterator<String> it3 = advertis.getThirdShowStatUrls().iterator();
                            while (it3.hasNext()) {
                                AdUrlUtil.getInstance(XmPlayerService.getPlayerSrvice()).thirdAdStatRequest(it3.next());
                            }
                        }
                        AdUrlUtil.getInstance(XmPlayerService.getPlayerSrvice()).thirdAdStatRequest(advertis.getThirdStatUrl());
                    }
                    XmAdsRecord xmAdsRecord = new XmAdsRecord();
                    xmAdsRecord.setTime(System.currentTimeMillis());
                    xmAdsRecord.setTrackId(taskWrapper.track.getDataId());
                    xmAdsRecord.setAdItemId(advertis.getAdid());
                    xmAdsRecord.setResponseId(taskWrapper.ads.getResponseId());
                    xmAdsRecord.setVersion(CommonRequest.getInstanse().getSdkVersion());
                    xmAdsRecord.setAndroidId(OpenSdkAdsDataHandler.getAndroidId(XmPlayerService.getPlayerSrvice()));
                    xmAdsRecord.setAdSource(advertis.getAdtype());
                    xmAdsRecord.setAppid(-2);
                    xmAdsRecord.setRecSrc(advertis.getRecSrc());
                    xmAdsRecord.setRecTrack(advertis.getRecTrack());
                    try {
                        xmAdsRecord.setAppKey(CommonRequest.getInstanse().getAppKey());
                    } catch (XimalayaException e) {
                        e.printStackTrace();
                    }
                    if (!TextUtils.isEmpty(advertis.getTempToken())) {
                        try {
                            xmAdsRecord.setShowToken(new String(OpenSdkUtils.AesEcbNopaddingDecrypt(advertis.getTempToken())));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    XmAdsEvent xmAdsEvent = new XmAdsEvent();
                    xmAdsEvent.setProps(xmAdsRecord);
                    xmAdsEvent.setTs(System.currentTimeMillis());
                    new XmAdsEvents().setEvents(new ArrayList<XmAdsEvent>(xmAdsEvent) { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler.4.1
                        public final /* synthetic */ XmAdsEvent val$adsEvent;

                        {
                            this.val$adsEvent = xmAdsEvent;
                            add(xmAdsEvent);
                        }
                    });
                    CommonRequest.statOnlineAd(new ArrayList<XmAdsRecord>(xmAdsRecord) { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler.4.2
                        public final /* synthetic */ XmAdsRecord val$ar;

                        {
                            this.val$ar = xmAdsRecord;
                            add(xmAdsRecord);
                        }
                    }, null);
                    return null;
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Void r1) {
                    super.onPostExecute(r1);
                }
            }.myexec(new Void[0]);
        } else if (taskWrapper.ads.getAdvertisList().get(0).getAdid() == -1) {
            new MyAsyncTask<Void, Void, Void>() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler.5
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    String str;
                    Advertis advertis = taskWrapper.ads.getAdvertisList().get(0);
                    if (advertis == null) {
                        return null;
                    }
                    XmShopsRecord xmShopsRecord = new XmShopsRecord();
                    try {
                        xmShopsRecord.setAppKey(CommonRequest.getInstanse().getAppKey());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String str2 = "front";
                    if (advertis.getAdLocation() != 1) {
                        if (advertis.getAdLocation() == 2) {
                            str2 = "middle";
                        } else if (advertis.getAdLocation() == 3) {
                            str2 = "end";
                        }
                    }
                    xmShopsRecord.setAdLocation(str2);
                    xmShopsRecord.setAdUrl(advertis.getSoundUrl());
                    xmShopsRecord.setSdkVersion(CommonRequest.getInstanse().getSdkVersion());
                    xmShopsRecord.setPlayTime(System.currentTimeMillis());
                    int operator = NetworkType.getOperator(CommonRequest.getInstanse().getContext());
                    if (operator == 0) {
                        str = "移动";
                    } else if (operator == 1) {
                        str = "联通";
                    } else {
                        str = operator == 2 ? "电信" : "其他";
                    }
                    try {
                        xmShopsRecord.setCarrierOperator(URLEncoder.encode(str, "UTF-8"));
                    } catch (UnsupportedEncodingException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        xmShopsRecord.setDeviceId(CommonRequest.getInstanse().getDeviceId());
                    } catch (XimalayaException e3) {
                        e3.printStackTrace();
                    }
                    xmShopsRecord.setDeviceName("android");
                    try {
                        xmShopsRecord.setDeviceType(URLEncoder.encode(Build.MODEL, "UTF-8"));
                    } catch (UnsupportedEncodingException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        xmShopsRecord.setManufacture(URLEncoder.encode(CommonRequest.getInstanse().getManufacturer(), "UTF-8"));
                    } catch (UnsupportedEncodingException e5) {
                        e5.printStackTrace();
                    }
                    xmShopsRecord.setNetworkMode(NetworkType.getNetWorkType(CommonRequest.getInstanse().getContext()).getName());
                    xmShopsRecord.setOs("android");
                    XmShopEvent xmShopEvent = new XmShopEvent();
                    xmShopEvent.setProps(xmShopsRecord);
                    xmShopEvent.setTs(System.currentTimeMillis());
                    XmShopEvents xmShopEvents = new XmShopEvents();
                    xmShopEvents.setEvents(new ArrayList<XmShopEvent>(xmShopEvent) { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler.5.1
                        public final /* synthetic */ XmShopEvent val$adsEvent;

                        {
                            this.val$adsEvent = xmShopEvent;
                            add(xmShopEvent);
                        }
                    });
                    CommonRequest.statOnlineShopAd(xmShopEvents, null);
                    return null;
                }
            }.myexec(new Void[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:84:0x016a  */
    public AdvertisList checkAndAddBrankAd(AdvertisList advertisList, String str, int i) {
        AdvertisList advertisList2;
        Advertis advertis;
        boolean z;
        Track track;
        SubordinatedAlbum album;
        boolean zEquals = "true".equals(str);
        if ((System.currentTimeMillis() - this.lastShowBrankAdTime <= resumeShowTime || ignoreXmAd || this.trackId < 0 || !((i == 1 || i == 3) && (advertisList == null || advertisList.getAdvertisList() == null || advertisList.getAdvertisList().size() == 0))) && i != 2) {
            advertisList2 = advertisList;
        } else {
            AppConfig appConfig = this.mAppConfig;
            if (appConfig != null) {
                AppConfig.AdLocaltion adLocaltion = appConfig.adLocaltion;
                if ((adLocaltion.front && i == 1) || ((adLocaltion.middle && i == 2) || (adLocaltion.end && i == 3))) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z || (this.lastIsEndPosition && i == 1)) {
                advertisList2 = advertisList;
            } else {
                if (i == 3) {
                    this.lastIsEndPosition = true;
                }
                this.lastShowBrankAdTime = System.currentTimeMillis();
                if (advertisList == null) {
                    advertisList2 = new AdvertisList();
                    advertisList2.setRet(0);
                } else {
                    advertisList2 = advertisList;
                }
                Advertis advertis2 = new Advertis();
                advertis2.setAdid(-1);
                advertis2.setAdLocation(i);
                String str2 = new String(Base64.decode("aHR0cDovL2ZkZnMueG1jZG4uY29tL2dyb3VwMjYvTTA5L0RDLzMxL3dLZ0pXRmpjcVhIU0xUTF9BQUFfOVR3aEFVRTIxMy5tcDM=", 0));
                if (this.mAppConfig != null) {
                    XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
                    AppConfig.AdUrl adUrl = this.mAppConfig.soundAddress;
                    if (playerSrvice != null && (track = (Track) playerSrvice.getCurrPlayModel()) != null && (album = track.getAlbum()) != null && album.getAlbumId() > 0) {
                        long albumId = album.getAlbumId();
                        List<AppConfig.AlbumOral> list = this.mAppConfig.albumOralModels;
                        if (list != null) {
                            for (AppConfig.AlbumOral albumOral : list) {
                                List<Long> list2 = albumOral.albumIds;
                                if (list2 != null && list2.contains(Long.valueOf(albumId))) {
                                    adUrl = albumOral.brandAdUrl;
                                    Logger.logToSd("OpenSdkAdsDataHandler  == 13 " + adUrl + "   " + albumId);
                                    break;
                                }
                            }
                        }
                    }
                    if (i == 1) {
                        str2 = (adUrl == null || TextUtils.isEmpty(adUrl.front)) ? new String(Base64.decode("aHR0cDovL2ZkZnMueG1jZG4uY29tL2dyb3VwNDEvTTA3LzVGLzBCL3dLZ0o4VnM1d3ptVHU1QUtBQVBkZk9jYjdMSTczOC5tcDM=", 0)) : adUrl.front;
                    } else if (i == 2) {
                        str2 = (adUrl == null || TextUtils.isEmpty(adUrl.middle)) ? new String(Base64.decode("aHR0cDovL2ZkZnMueG1jZG4uY29tL2dyb3VwMjYvTTA5L0RDLzMxL3dLZ0pXRmpjcVhIU0xUTF9BQUFfOVR3aEFVRTIxMy5tcDM=", 0)) : adUrl.middle;
                    } else if (i == 3) {
                        str2 = (adUrl == null || TextUtils.isEmpty(adUrl.end)) ? new String(Base64.decode("aHR0cDovL2ZkZnMueG1jZG4uY29tL2dyb3VwMjYvTTA5L0RDLzMxL3dLZ0pXRmpjcVhIU0xUTF9BQUFfOVR3aEFVRTIxMy5tcDM", 0)) : adUrl.end;
                    }
                }
                advertis2.setSoundUrl(str2);
                if (advertisList2.getAdvertisList() == null) {
                    advertisList2.setAdvertisList(new ArrayList());
                }
                advertisList2.getAdvertisList().add(advertis2);
            }
        }
        if (this.lastIsEndPosition && i == 1) {
            this.lastIsEndPosition = false;
        }
        if (advertisList2 == null) {
            advertisList2 = new AdvertisList();
        }
        advertisList2.setDuringPlay(zEquals);
        if (advertisList2.getAdvertisList() != null && advertisList2.getAdvertisList().size() > 0 && (advertis = advertisList2.getAdvertisList().get(0)) != null) {
            List<String> showTokens = advertis.getShowTokens();
            if (showTokens != null && showTokens.size() > 0) {
                advertis.setTempToken(showTokens.remove(0));
            }
            advertis.setDuringPlay(zEquals);
        }
        return advertisList2;
    }
}
