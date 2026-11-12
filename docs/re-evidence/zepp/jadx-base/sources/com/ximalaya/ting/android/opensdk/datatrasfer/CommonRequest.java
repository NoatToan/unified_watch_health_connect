package com.ximalaya.ting.android.opensdk.datatrasfer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alipay.sdk.m.s.a;
import com.facebook.internal.ServerProtocol;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.nfc.base.PayResponse;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.ximalaya.ting.android.opensdk.constants.ConstantsOpenSdk;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.httputil.BaseBuilder;
import com.ximalaya.ting.android.opensdk.httputil.BaseCall;
import com.ximalaya.ting.android.opensdk.httputil.BaseResponse;
import com.ximalaya.ting.android.opensdk.httputil.Config;
import com.ximalaya.ting.android.opensdk.httputil.HttpDNSUtilForOpenSDK;
import com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack;
import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import com.ximalaya.ting.android.opensdk.httputil.XmSecretKeyUtil;
import com.ximalaya.ting.android.opensdk.httputil.httpswitch.HttpSwtichInterceptor;
import com.ximalaya.ting.android.opensdk.httputil.logging.Level;
import com.ximalaya.ting.android.opensdk.httputil.logging.LoggingInterceptor;
import com.ximalaya.ting.android.opensdk.httputil.util.BASE64Encoder;
import com.ximalaya.ting.android.opensdk.model.PostResponse;
import com.ximalaya.ting.android.opensdk.model.SercretPubKey;
import com.ximalaya.ting.android.opensdk.model.advertis.AdvertisList;
import com.ximalaya.ting.android.opensdk.model.album.Album;
import com.ximalaya.ting.android.opensdk.model.album.AlbumList;
import com.ximalaya.ting.android.opensdk.model.album.Announcer;
import com.ximalaya.ting.android.opensdk.model.album.AnnouncerListByIds;
import com.ximalaya.ting.android.opensdk.model.album.BatchAlbumList;
import com.ximalaya.ting.android.opensdk.model.album.CategoryRecommendAlbums;
import com.ximalaya.ting.android.opensdk.model.album.CategoryRecommendAlbumsList;
import com.ximalaya.ting.android.opensdk.model.album.DiscoveryRecommendAlbums;
import com.ximalaya.ting.android.opensdk.model.album.DiscoveryRecommendAlbumsList;
import com.ximalaya.ting.android.opensdk.model.album.GussLikeAlbumList;
import com.ximalaya.ting.android.opensdk.model.album.HotAggregation;
import com.ximalaya.ting.android.opensdk.model.album.HotAggregationList;
import com.ximalaya.ting.android.opensdk.model.album.RecommendCollectAlbumList;
import com.ximalaya.ting.android.opensdk.model.album.RelativeAlbums;
import com.ximalaya.ting.android.opensdk.model.album.SearchAlbumList;
import com.ximalaya.ting.android.opensdk.model.album.SubscribeAlbumList;
import com.ximalaya.ting.android.opensdk.model.album.UpdateBatch;
import com.ximalaya.ting.android.opensdk.model.album.UpdateBatchList;
import com.ximalaya.ting.android.opensdk.model.album.XmAlbumTracksStatue;
import com.ximalaya.ting.android.opensdk.model.announcer.AnnouncerCategory;
import com.ximalaya.ting.android.opensdk.model.announcer.AnnouncerCategoryList;
import com.ximalaya.ting.android.opensdk.model.announcer.AnnouncerList;
import com.ximalaya.ting.android.opensdk.model.app.AppModel;
import com.ximalaya.ting.android.opensdk.model.banner.Banner;
import com.ximalaya.ting.android.opensdk.model.banner.BannerV2;
import com.ximalaya.ting.android.opensdk.model.banner.BannerV2List;
import com.ximalaya.ting.android.opensdk.model.banner.BannersContentList;
import com.ximalaya.ting.android.opensdk.model.banner.CategoryBannerList;
import com.ximalaya.ting.android.opensdk.model.banner.DiscoveryBannerList;
import com.ximalaya.ting.android.opensdk.model.banner.RankBannerList;
import com.ximalaya.ting.android.opensdk.model.category.Category;
import com.ximalaya.ting.android.opensdk.model.category.CategoryList;
import com.ximalaya.ting.android.opensdk.model.coldboot.ColdBootDetail;
import com.ximalaya.ting.android.opensdk.model.coldboot.ColdBootTag;
import com.ximalaya.ting.android.opensdk.model.coldboot.GenreList;
import com.ximalaya.ting.android.opensdk.model.coldboot.SubGenreList;
import com.ximalaya.ting.android.opensdk.model.column.ColumnDetail;
import com.ximalaya.ting.android.opensdk.model.column.ColumnDetailAlbum;
import com.ximalaya.ting.android.opensdk.model.column.ColumnDetailTrack;
import com.ximalaya.ting.android.opensdk.model.column.ColumnList;
import com.ximalaya.ting.android.opensdk.model.download.RecommendDownload;
import com.ximalaya.ting.android.opensdk.model.history.PlayHistoryList;
import com.ximalaya.ting.android.opensdk.model.live.program.Program;
import com.ximalaya.ting.android.opensdk.model.live.program.ProgramList;
import com.ximalaya.ting.android.opensdk.model.live.provinces.Province;
import com.ximalaya.ting.android.opensdk.model.live.provinces.ProvinceList;
import com.ximalaya.ting.android.opensdk.model.live.radio.City;
import com.ximalaya.ting.android.opensdk.model.live.radio.CityList;
import com.ximalaya.ting.android.opensdk.model.live.radio.Radio;
import com.ximalaya.ting.android.opensdk.model.live.radio.RadioCategory;
import com.ximalaya.ting.android.opensdk.model.live.radio.RadioCategoryList;
import com.ximalaya.ting.android.opensdk.model.live.radio.RadioList;
import com.ximalaya.ting.android.opensdk.model.live.radio.RadioListByCategory;
import com.ximalaya.ting.android.opensdk.model.live.radio.RadioListById;
import com.ximalaya.ting.android.opensdk.model.live.schedule.Schedule;
import com.ximalaya.ting.android.opensdk.model.live.schedule.ScheduleList;
import com.ximalaya.ting.android.opensdk.model.metadata.MetaData;
import com.ximalaya.ting.android.opensdk.model.metadata.MetaDataList;
import com.ximalaya.ting.android.opensdk.model.pay.BoughtStatu;
import com.ximalaya.ting.android.opensdk.model.pay.BoughtStatuList;
import com.ximalaya.ting.android.opensdk.model.pay.ObfuscatePlayInfo;
import com.ximalaya.ting.android.opensdk.model.pay.ObfuscatePlayInfoList;
import com.ximalaya.ting.android.opensdk.model.pay.OrderDetail;
import com.ximalaya.ting.android.opensdk.model.pay.PayInfo;
import com.ximalaya.ting.android.opensdk.model.pay.PayOderStatue;
import com.ximalaya.ting.android.opensdk.model.ranks.Rank;
import com.ximalaya.ting.android.opensdk.model.ranks.RankAlbumList;
import com.ximalaya.ting.android.opensdk.model.ranks.RankList;
import com.ximalaya.ting.android.opensdk.model.ranks.RankTrackList;
import com.ximalaya.ting.android.opensdk.model.search.SearchAll;
import com.ximalaya.ting.android.opensdk.model.tag.Tag;
import com.ximalaya.ting.android.opensdk.model.tag.TagList;
import com.ximalaya.ting.android.opensdk.model.track.AnnouncerTrackList;
import com.ximalaya.ting.android.opensdk.model.track.BatchTrackList;
import com.ximalaya.ting.android.opensdk.model.track.CommonTrackList;
import com.ximalaya.ting.android.opensdk.model.track.LastPlayTrackList;
import com.ximalaya.ting.android.opensdk.model.track.SearchTrackList;
import com.ximalaya.ting.android.opensdk.model.track.SearchTrackListV2;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.track.TrackBaseInfo;
import com.ximalaya.ting.android.opensdk.model.track.TrackHotList;
import com.ximalaya.ting.android.opensdk.model.track.TrackIdList;
import com.ximalaya.ting.android.opensdk.model.track.TrackList;
import com.ximalaya.ting.android.opensdk.model.user.XmBaseUserInfo;
import com.ximalaya.ting.android.opensdk.model.user.XmUserInfo;
import com.ximalaya.ting.android.opensdk.model.word.HotWord;
import com.ximalaya.ting.android.opensdk.model.word.HotWordList;
import com.ximalaya.ting.android.opensdk.model.word.SuggestWords;
import com.ximalaya.ting.android.opensdk.player.XmPlayerManager;
import com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkUtils;
import com.ximalaya.ting.android.opensdk.player.advertis.XmAdsEvent;
import com.ximalaya.ting.android.opensdk.player.advertis.XmAdsEvents;
import com.ximalaya.ting.android.opensdk.player.advertis.XmAdsRecord;
import com.ximalaya.ting.android.opensdk.player.advertis.shopAdsEvent.XmShopEvents;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayListControl;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerConfig;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.AsyncGson;
import com.ximalaya.ting.android.opensdk.util.BaseUtil;
import com.ximalaya.ting.android.opensdk.util.EncryptUtilForSDK;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.opensdk.util.MyAsyncTask;
import com.ximalaya.ting.android.opensdk.util.NetworkType;
import com.ximalaya.ting.android.player.MD5;
import com.ximalaya.ting.paydecrypt.PayUtil;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class CommonRequest extends BaseRequest {
    public static final String TAG = "XiMaLaYaSDK";
    private static final String TYPE_ANDROID = "Android_ID";
    private static final String TYPE_ANDROID_ID_MD5 = "Android_ID_MD5";
    private static final String TYPE_OAID = "OAID";
    private static final String TYPE_OAID_MD5 = "OAID_MD5";
    private static final String TYPE_UUID = "UUID";
    private static String mUserAgent = null;
    private static int sPagesize = 20;
    private static CommonRequest singleton;
    private static BaseRequest.IRequestCallBack<TrackBaseInfo> trackInfCallBack = new BaseRequest.IRequestCallBack<TrackBaseInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.54
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
        public TrackBaseInfo success(String str) throws Exception {
            TrackBaseInfo trackBaseInfo = (TrackBaseInfo) new Gson().fromJson(str, TrackBaseInfo.class);
            boolean z = trackBaseInfo != null && trackBaseInfo.isFallback();
            Logger.logToSd("trackInfCallBack  = " + trackBaseInfo);
            XmSecretKeyUtil.getInstance().conversionModel(trackBaseInfo, z);
            return trackBaseInfo;
        }
    };
    private boolean enableDeviceIdHashMode;
    private IDeviceInfoProvider mDeviceInfoProvider;
    private ITokenStateChangeWrapper mITokenStateChange;
    public String mManufacturer;
    private Context mContext = null;
    private String mDeviceid = "";
    private String mMac = "";
    private String mPackageName = "";
    private String mSimName = "";
    private String mNetWorkType = "";
    private String mDisplay = "";
    private Config mConfig = null;
    private String mSigmobAppId = "";
    private String mSigmobAppKey = "";
    private String mSigmobRewardPlacementId = "";
    private boolean isUseHttps = false;
    private String deviceIdType = TYPE_ANDROID;
    public Set<String> mNoSupportHttps = new HashSet();
    private final Set<String> noSupportHttpsInApp = new HashSet<String>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.1
        {
            add(CommonRequest.subUrlCore(DTransferConstants.VERSION_REGULAR_REL));
            add(CommonRequest.subUrlCore(DTransferConstants.PLAY_TRACK_INFO));
        }
    };

    public interface ITokenStateChange {
        boolean getTokenByRefreshAsync();

        boolean getTokenByRefreshSync();

        void tokenLosted();
    }

    public static class ITokenStateChangeWrapper implements ITokenStateChange {
        private long lastTokenLostedTime;
        private ITokenStateChange mTokenStateChange;

        public ITokenStateChangeWrapper(ITokenStateChange iTokenStateChange) {
            this.mTokenStateChange = iTokenStateChange;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.ITokenStateChange
        public boolean getTokenByRefreshAsync() {
            ITokenStateChange iTokenStateChange = this.mTokenStateChange;
            if (iTokenStateChange != null) {
                return iTokenStateChange.getTokenByRefreshAsync();
            }
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.ITokenStateChange
        public boolean getTokenByRefreshSync() {
            ITokenStateChange iTokenStateChange = this.mTokenStateChange;
            if (iTokenStateChange != null) {
                return iTokenStateChange.getTokenByRefreshSync();
            }
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.ITokenStateChange
        public void tokenLosted() {
            if (System.currentTimeMillis() - this.lastTokenLostedTime > 1000) {
                this.lastTokenLostedTime = System.currentTimeMillis();
                ITokenStateChange iTokenStateChange = this.mTokenStateChange;
                if (iTokenStateChange != null) {
                    iTokenStateChange.tokenLosted();
                }
            }
        }
    }

    public static class UrlConstants {
        public static String BATCHTRACKLIST = "http://api.ximalaya.com/openapi-gateway-app/tracks/get_batch";
        public static String SEARCHTRACKLIST = "http://api.ximalaya.com/openapi-gateway-app/search/tracks";
        public static String TRACKHOTLIST = "http://api.ximalaya.com/openapi-gateway-app/tracks/hot";
        public static String TRACKLIST = "http://api.ximalaya.com/openapi-gateway-app/albums/browse";
    }

    private CommonRequest() {
    }

    public static void AddOrDelSubscribe(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.ADD_OR_DELETE_SUBSCRIBE, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.88
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static Map<String, String> CommonParams(Map<String, String> map) throws XimalayaException {
        HashMap map2 = new HashMap();
        map2.putAll(getInstanse().assembleCommonParams((map == null || map.remove("xm_flag_is_old") == null) ? false : true));
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("access_token", AccessTokenManager.getInstanse().getAccessToken());
        String uid = AccessTokenManager.getInstanse().getUid();
        if (!TextUtils.isEmpty(uid) && !AccessTokenManager.isThirdToken()) {
            map2.put("uid", uid);
        }
        return map2;
    }

    private static void addOpenSDKAdCookie(Request.Builder builder, StringBuilder sb) throws XimalayaException, UnsupportedEncodingException {
        String strEncode;
        sb.append("1&_device");
        sb.append(SearchCriteria.EQ);
        sb.append(URLEncoder.encode("android&" + getInstanse().getDeviceId() + a.l + DTransferConstants.SDK_VERSION_NO_V, "UTF-8"));
        sb.append(";");
        sb.append("impl");
        sb.append(SearchCriteria.EQ);
        sb.append(URLEncoder.encode(getInstanse().getPackageName(), "UTF-8"));
        sb.append(";");
        sb.append("XUM");
        sb.append(SearchCriteria.EQ);
        sb.append(URLEncoder.encode(getInstanse().getLocalMacAddress(), "UTF-8"));
        sb.append(";");
        sb.append("c-oper");
        sb.append(SearchCriteria.EQ);
        sb.append(URLEncoder.encode(getInstanse().getSimName(), "UTF-8"));
        sb.append(";");
        sb.append("net-mode");
        sb.append(SearchCriteria.EQ);
        sb.append(URLEncoder.encode(getInstanse().getNetWorkType(), "UTF-8"));
        sb.append(";");
        sb.append("manufacture");
        sb.append(SearchCriteria.EQ);
        sb.append(URLEncoder.encode(getInstanse().getManufacturer(), "UTF-8"));
        sb.append(";");
        try {
            strEncode = BASE64Encoder.encode(hexStr2ByteArray(OpenSdkUtils.getAndroidId(getInstanse().getContext())));
        } catch (Exception e) {
            e.printStackTrace();
            strEncode = null;
        }
        if (!TextUtils.isEmpty(strEncode)) {
            sb.append("AID");
            sb.append(SearchCriteria.EQ);
            sb.append(strEncode);
            sb.append(";");
        }
        sb.append("osversion");
        sb.append(SearchCriteria.EQ);
        sb.append(Build.VERSION.SDK_INT);
        sb.append(";");
        String imei = OpenSdkUtils.getIMEI(getInstanse().getContext());
        if (!TextUtils.isEmpty(imei)) {
            try {
                String hexString = Long.toHexString(Long.valueOf(imei).longValue());
                sb.append("XIM");
                sb.append(SearchCriteria.EQ);
                sb.append(hexString);
                sb.append(";");
            } catch (NumberFormatException unused) {
            }
        }
        sb.append("res");
        sb.append(SearchCriteria.EQ);
        sb.append(URLEncoder.encode(getInstanse().getDisplay(), "UTF-8"));
        builder.addHeader(HttpHeaders.COOKIE, sb.toString());
    }

    public static String addTsToUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            return str + "ts-" + System.currentTimeMillis();
        }
        return str + "/ts-" + System.currentTimeMillis();
    }

    public static void albumBrowseRecords(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.ALBUM_BROWSE_RECORDS, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.115
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) BaseResponse.getResponseBodyStringToObject(new TypeToken<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.115.1
                }.getType(), str);
            }
        });
    }

    public static <T> T baseGetReqeustSync(final String str, final Map<String, String> map, BaseRequest.IRequestCallBack<T> iRequestCallBack) throws Exception {
        return (T) BaseRequest.baseGetReqeustSync(str, map, iRequestCallBack, new IRequestHandler() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.2
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IRequestHandler
            public String getAppSercet() {
                return CommonRequest.getInstanse().getAppsecret();
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IRequestHandler
            public Request getRequest() throws XimalayaException {
                return BaseBuilder.urlGet(CommonRequest.replaceHttpToHttps(str), CommonRequest.CommonParams(map), CommonRequest.getInstanse().getAppsecret()).build();
            }
        });
    }

    public static <T extends XimalayaResponse> void baseGetRequest(final String str, final Map<String, String> map, IDataCallBack<T> iDataCallBack, BaseRequest.IRequestCallBack<T> iRequestCallBack) {
        BaseRequest.baseGetRequest(str, map, iDataCallBack, iRequestCallBack, new IRequestHandler() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.3
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IRequestHandler
            public String getAppSercet() {
                return CommonRequest.getInstanse().getAppsecret();
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IRequestHandler
            public Request getRequest() throws XimalayaException {
                return BaseBuilder.urlGet(CommonRequest.replaceHttpToHttps(str), CommonRequest.CommonParams(map), CommonRequest.getInstanse().getAppsecret()).build();
            }
        });
    }

    public static <T> void basePostRequest(final String str, final Map<String, String> map, IDataCallBack<T> iDataCallBack, BaseRequest.IRequestCallBack<T> iRequestCallBack) {
        BaseRequest.basePostRequest(str, map, iDataCallBack, iRequestCallBack, new IRequestHandler() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.5
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IRequestHandler
            public String getAppSercet() {
                return CommonRequest.getInstanse().getAppsecret();
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IRequestHandler
            public Request getRequest() throws XimalayaException {
                Request.Builder builderUrlPost = BaseBuilder.urlPost(CommonRequest.replaceHttpToHttps(str), CommonRequest.CommonParams(map), CommonRequest.getInstanse().getAppsecret());
                if (str.contains("client_place_order")) {
                    builderUrlPost.header("Accept-Encoding", "danding");
                }
                if (str.contains("user_behavior_collecting") || str.contains(DTransferConstants.SINGLE_EXPOSURE_RECORD) || str.contains(DTransferConstants.BATCH_EXPOSURE_RECORD)) {
                    builderUrlPost.header("X-Use-V2-Error-Code", "true");
                }
                return builderUrlPost.build();
            }
        });
    }

    public static <T> T basePostRequestSync(final String str, final Map<String, String> map, BaseRequest.IRequestCallBack<T> iRequestCallBack) throws Exception {
        return (T) BaseRequest.basePostRequestSync(str, map, iRequestCallBack, new IRequestHandler() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.4
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IRequestHandler
            public String getAppSercet() {
                return CommonRequest.getInstanse().getAppsecret();
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IRequestHandler
            public Request getRequest() throws XimalayaException {
                return BaseBuilder.urlPost(CommonRequest.replaceHttpToHttps(str), CommonRequest.CommonParams(map), CommonRequest.getInstanse().getAppsecret()).build();
            }
        });
    }

    public static void batchAddSubscribe(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.BATCH_ADD_SUBSCRIBE, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.89
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static void batchDeleHistory(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.BATCH_DELE_HISTORY, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.86
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static void batchExposureRecord(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.BATCH_EXPOSURE_RECORD, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.117
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) BaseResponse.getResponseBodyStringToObject(new TypeToken<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.117.1
                }.getType(), str);
            }
        });
    }

    public static void batchGetObfuscatedPlayInfo(Map<String, String> map, IDataCallBack<ObfuscatePlayInfoList> iDataCallBack) {
        baseGetRequest("https://mpay.ximalaya.com/openapi-payfacade-app/open_pay/batch_get_obfuscated_play_info/" + System.currentTimeMillis(), map, iDataCallBack, new BaseRequest.IRequestCallBack<ObfuscatePlayInfoList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public ObfuscatePlayInfoList success(String str) throws Exception {
                List<ObfuscatePlayInfo> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<ObfuscatePlayInfo>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.15.1
                }.getType(), str);
                ObfuscatePlayInfoList obfuscatePlayInfoList = new ObfuscatePlayInfoList();
                obfuscatePlayInfoList.setObfuscatePlayInfos(list);
                return obfuscatePlayInfoList;
            }
        });
    }

    public static void batchGetPaidAlbum(Map<String, String> map, IDataCallBack<BatchAlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.BATCH_GET_PAID_ALBUM, map, iDataCallBack, new BaseRequest.IRequestCallBack<BatchAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.95
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public BatchAlbumList success(String str) throws Exception {
                Type type = new TypeToken<List<Album>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.95.1
                }.getType();
                Gson gson = new Gson();
                BatchAlbumList batchAlbumList = new BatchAlbumList();
                batchAlbumList.setAlbums((List) gson.fromJson(str, type));
                return batchAlbumList;
            }
        });
    }

    public static void batchPaidTracks(Map<String, String> map, IDataCallBack<BatchTrackList> iDataCallBack) {
        baseGetRequest(DTransferConstants.BATCH_GET_PAID_TRACK, map, iDataCallBack, new BaseRequest.IRequestCallBack<BatchTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.96
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public BatchTrackList success(String str) throws Exception {
                List<Track> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Track>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.96.1
                }.getType(), str);
                BatchTrackList batchTrackList = new BatchTrackList();
                batchTrackList.setTracks(list);
                return batchTrackList;
            }
        });
    }

    public static void batchUploadHistory(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.BATCH_UPLOAD_HISTORY, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.85
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static void clientCancelOrder(Map<String, String> map, IDataCallBack<PayOderStatue> iDataCallBack) {
        map.put("confirm_type", "2");
        basePostRequest(DTransferConstants.CANCLE_ORDER_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<PayOderStatue>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.110
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PayOderStatue success(String str) throws Exception {
                return (PayOderStatue) BaseResponse.getResponseBodyStringToObject(new TypeToken<PayOderStatue>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.110.1
                }.getType(), str);
            }
        });
    }

    public static void destroy() {
        release();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x009e  */
    public static void getAdvertis(Map<String, String> map, final IDataCallBack<AdvertisList> iDataCallBack, int i) {
        int i2;
        try {
            map.put("appid", PayResponse.CODE_SE_RESPONSE_ERROR);
            map.put("version", DTransferConstants.SDK_VERSION_NO_V);
            map.put("device", "android");
            String uid = AccessTokenManager.getInstanse().getUid();
            if (TextUtils.isEmpty(uid)) {
                uid = EcgData.DEFAULT_DIGIT_VALUE;
            }
            map.put("xt", System.currentTimeMillis() + "");
            map.put("uid", uid);
            map.put(AuthorizeActivityBase.KEY_OPERATOR, OpenSdkUtils.getOperator(getInstanse().getContext()) + "");
            map.put("network", getInstanse().getNetWorkType());
            map.put("deviceId", getInstanse().getDeviceId());
            map.put("appKey", getInstanse().getAppKey());
            if (XmPlayerService.getPlayerSrvice() != null) {
                XmPlayListControl.PlayMode playMode = XmPlayerService.getPlayerSrvice().getPlayMode();
                if (playMode == XmPlayListControl.PlayMode.PLAY_MODEL_LIST) {
                    i2 = 0;
                } else if (playMode == XmPlayListControl.PlayMode.PLAY_MODEL_SINGLE_LOOP) {
                    i2 = 1;
                } else if (playMode == XmPlayListControl.PlayMode.PLAY_MODEL_RANDOM) {
                    i2 = 2;
                } else if (playMode == XmPlayListControl.PlayMode.PLAY_MODEL_LIST_LOOP) {
                    i2 = 3;
                } else if (playMode == XmPlayListControl.PlayMode.PLAY_MODEL_SINGLE) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                map.put("playMode", i2 + "");
            }
            Request.Builder builderUrlGet = BaseBuilder.urlGet(replaceHttpToHttps(addTsToUrl(DTransferConstants.GET_ADVERT)), map);
            builderUrlGet.addHeader("User-Agent", getUserAgent());
            try {
                addOpenSDKAdCookie(builderUrlGet, new StringBuilder());
                BaseCall.getInstanse().doAsync(builderUrlGet.build(), new IHttpCallBack() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.59
                    @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                    public void onFailure(int i3, String str) {
                        BaseRequest.delivery.postError(i3, str, iDataCallBack);
                    }

                    @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                    public void onResponse(Response response) {
                        String responseBodyToString;
                        BaseResponse baseResponse = new BaseResponse(response);
                        Type type = new TypeToken<AdvertisList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.59.1
                        }.getType();
                        if (baseResponse.getStatusCode() != 200) {
                            BaseRequest.delivery.postError(baseResponse.getStatusCode(), baseResponse.getStatusMessage(), iDataCallBack);
                            return;
                        }
                        try {
                            responseBodyToString = baseResponse.getResponseBodyToString();
                            try {
                                BaseRequest.delivery.postSuccess(iDataCallBack, (AdvertisList) BaseResponse.getResponseBodyStringToObject(type, responseBodyToString));
                            } catch (Exception e) {
                                e = e;
                                Logger.d("XIMALAYASDK", "response json str:" + responseBodyToString);
                                if (TextUtils.isEmpty(e.getMessage())) {
                                    BaseRequest.delivery.postError(1007, "parse response json data error", iDataCallBack);
                                } else {
                                    BaseRequest.delivery.postError(1007, e.getMessage(), iDataCallBack);
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            responseBodyToString = "";
                        }
                    }
                }, i);
            } catch (XimalayaException e) {
                iDataCallBack.onError(e.getErrorCode(), e.getErrorMessage());
            } catch (UnsupportedEncodingException e2) {
                iDataCallBack.onError(1008, "UnsupportedEncodingException :" + e2.getMessage());
            } catch (Exception e3) {
                iDataCallBack.onError(0, e3.getMessage());
            }
        } catch (XimalayaException e4) {
            iDataCallBack.onError(e4.getErrorCode(), e4.getMessage());
        } catch (Exception e5) {
            iDataCallBack.onError(0, e5.getMessage());
        }
    }

    public static void getAlbumByUid(Map<String, String> map, IDataCallBack<SubscribeAlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_ALBUM_BY_UID, map, iDataCallBack, new BaseRequest.IRequestCallBack<SubscribeAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.87
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public SubscribeAlbumList success(String str) throws Exception {
                return (SubscribeAlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<SubscribeAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.87.1
                }.getType(), str);
            }
        });
    }

    public static void getAlbumList(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.ALBUMS_LIST_V2, map, iDataCallBack, new BaseRequest.IRequestCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AlbumList success(String str) throws Exception {
                return (AlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.21.1
                }.getType(), str);
            }
        });
    }

    @Deprecated
    public static void getAlbums(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        map.put(DTransferConstants.CALC_DIMENSION, "1");
        getAlbumList(map, iDataCallBack);
    }

    public static void getAlbumsByAnnouncer(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.ALBUM_BY_ANNOUNCER, map, iDataCallBack, new BaseRequest.IRequestCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AlbumList success(String str) throws Exception {
                return (AlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.17.1
                }.getType(), str);
            }
        });
    }

    public static void getAllPaidAlbums(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_ALL_PAID_ALBUM, map, iDataCallBack, new BaseRequest.IRequestCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.91
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AlbumList success(String str) throws Exception {
                return (AlbumList) new Gson().fromJson(str, AlbumList.class);
            }
        });
    }

    public static void getAllTrackIdsInAlbum(Map<String, String> map, IDataCallBack<TrackIdList> iDataCallBack) {
        baseGetRequest("http://api.ximalaya.com/openapi-gateway-app/albums/get_all_track_ids", map, iDataCallBack, new BaseRequest.IRequestCallBack<TrackIdList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.25
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public TrackIdList success(String str) throws Exception {
                return (TrackIdList) BaseResponse.getResponseBodyStringToObject(new TypeToken<TrackIdList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.25.1
                }.getType(), str);
            }
        });
    }

    public static void getAnnouncerCategoryList(Map<String, String> map, IDataCallBack<AnnouncerCategoryList> iDataCallBack) {
        baseGetRequest(DTransferConstants.ANNOUNCER_CATEGORY, map, iDataCallBack, new BaseRequest.IRequestCallBack<AnnouncerCategoryList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.57
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AnnouncerCategoryList success(String str) throws Exception {
                List<AnnouncerCategory> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<AnnouncerCategory>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.57.1
                }.getType(), str);
                AnnouncerCategoryList announcerCategoryList = new AnnouncerCategoryList();
                announcerCategoryList.setList(list);
                return announcerCategoryList;
            }
        });
    }

    public static void getAnnouncerList(Map<String, String> map, IDataCallBack<AnnouncerList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.ANNOUNCER_LIST, map, iDataCallBack, new BaseRequest.IRequestCallBack<AnnouncerList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.58
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AnnouncerList success(String str) throws Exception {
                return (AnnouncerList) BaseResponse.getResponseBodyStringToObject(new TypeToken<AnnouncerList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.58.1
                }.getType(), str);
            }
        });
    }

    public static void getAnnouncersBatch(Map<String, String> map, IDataCallBack<AnnouncerListByIds> iDataCallBack) {
        baseGetRequest(DTransferConstants.BATCH_ANNOUNCERS_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<AnnouncerListByIds>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AnnouncerListByIds success(String str) throws Exception {
                List<Announcer> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Announcer>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.41.1
                }.getType(), str);
                AnnouncerListByIds announcerListByIds = new AnnouncerListByIds();
                announcerListByIds.setAnnouncers(list);
                return announcerListByIds;
            }
        });
    }

    public static void getAppModel(Map<String, String> map, final IDataCallBack<AppModel> iDataCallBack) {
        try {
            BaseCall.getInstanse().doAsync(BaseBuilder.urlGet(replaceHttpToHttps(DTransferConstants.VERSION_REGULAR_REL), map).build(), new IHttpCallBack() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.52
                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onFailure(int i, String str) {
                    BaseRequest.delivery.postError(i, str, iDataCallBack);
                }

                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onResponse(Response response) {
                    String responseBodyToString;
                    BaseResponse baseResponse = new BaseResponse(response);
                    Type type = new TypeToken<AppModel>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.52.1
                    }.getType();
                    try {
                        responseBodyToString = baseResponse.getResponseBodyToString();
                        try {
                            BaseRequest.delivery.postSuccess(iDataCallBack, (AppModel) BaseResponse.getResponseBodyStringToObject(type, responseBodyToString));
                        } catch (Exception e) {
                            e = e;
                            Logger.d("XIMALAYASDK", "response json str:" + responseBodyToString);
                            if (TextUtils.isEmpty(e.getMessage())) {
                                BaseRequest.delivery.postError(1007, "parse response json data error", iDataCallBack);
                            } else {
                                BaseRequest.delivery.postError(1007, e.getMessage(), iDataCallBack);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        responseBodyToString = "";
                    }
                }
            });
        } catch (XimalayaException e) {
            iDataCallBack.onError(e.getErrorCode(), e.getMessage());
        }
    }

    private Context getApplication() throws XimalayaException {
        Context context = this.mContext;
        if (context != null) {
            return context.getApplicationContext();
        }
        throw XimalayaException.getExceptionByCode(1004);
    }

    public static void getBannersContentList(Map<String, String> map, IDataCallBack<BannersContentList> iDataCallBack) {
        final String str;
        if (map.containsKey(DTransferConstants.BANNER_CONTENT_TYPE)) {
            str = map.get(DTransferConstants.BANNER_CONTENT_TYPE);
            if (!str.equalsIgnoreCase("6") && !str.equalsIgnoreCase("7")) {
                iDataCallBack.onError(0, "please add param banner_content_type 6 or 7");
            }
        } else {
            iDataCallBack.onError(0, "please add param banner_content_type");
            str = "";
        }
        baseGetRequest(DTransferConstants.BANNERS_GET_CONTENT_LIST, map, iDataCallBack, new BaseRequest.IRequestCallBack<BannersContentList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.51
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public BannersContentList success(String str2) throws Exception {
                if (str.equalsIgnoreCase("6")) {
                    List<Album> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Album>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.51.1
                    }.getType(), str2);
                    BannersContentList bannersContentList = new BannersContentList();
                    bannersContentList.setAlbumList(list);
                    return bannersContentList;
                }
                if (!str.equalsIgnoreCase("7")) {
                    throw new XimalayaException(1007, "parse response json data error");
                }
                List<Track> list2 = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Track>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.51.2
                }.getType(), str2);
                BannersContentList bannersContentList2 = new BannersContentList();
                bannersContentList2.setTrackList(list2);
                return bannersContentList2;
            }
        });
    }

    public static void getBaseUserInfo(Map<String, String> map, IDataCallBack<XmBaseUserInfo> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_USER_BASE_INFO, map, iDataCallBack, new BaseRequest.IRequestCallBack<XmBaseUserInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.107
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public XmBaseUserInfo success(String str) throws Exception {
                return (XmBaseUserInfo) BaseResponse.getResponseBodyStringToObject(new TypeToken<XmBaseUserInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.107.1
                }.getType(), str);
            }
        });
    }

    public static void getBatch(Map<String, String> map, IDataCallBack<BatchAlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.BATCH_ALBUMLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<BatchAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public BatchAlbumList success(String str) throws Exception {
                List<Album> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Album>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.18.1
                }.getType(), str);
                BatchAlbumList batchAlbumList = new BatchAlbumList();
                batchAlbumList.setAlbums(list);
                return batchAlbumList;
            }
        });
    }

    public static void getBatchTracks(Map<String, String> map, IDataCallBack<BatchTrackList> iDataCallBack) {
        baseGetRequest(DTransferConstants.BATCH_TRACKLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<BatchTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public BatchTrackList success(String str) throws Exception {
                return (BatchTrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<BatchTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.19.1
                }.getType(), str);
            }
        });
    }

    public static void getBoughtAlbumStatus(Map<String, String> map, IDataCallBack<BoughtStatuList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_ALBUM_BOUGHT_STATUS, map, iDataCallBack, new BaseRequest.IRequestCallBack<BoughtStatuList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.101
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public BoughtStatuList success(String str) throws Exception {
                List<BoughtStatu> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<BoughtStatu>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.101.1
                }.getType(), str);
                BoughtStatuList boughtStatuList = new BoughtStatuList();
                boughtStatuList.setBoughtStatus(list);
                return boughtStatuList;
            }
        });
    }

    public static void getBoughtAlbums(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_BOUGHT_ALBUMS, map, iDataCallBack, new BaseRequest.IRequestCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.100
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AlbumList success(String str) throws Exception {
                List<Album> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Album>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.100.1
                }.getType(), str);
                AlbumList albumList = new AlbumList();
                albumList.setAlbums(list);
                return albumList;
            }
        });
    }

    public static void getBoughtTrackStatus(Map<String, String> map, IDataCallBack<BoughtStatuList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_TRACK_BOUGHT_STATUS, map, iDataCallBack, new BaseRequest.IRequestCallBack<BoughtStatuList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.102
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public BoughtStatuList success(String str) throws Exception {
                List<BoughtStatu> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<BoughtStatu>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.102.1
                }.getType(), str);
                BoughtStatuList boughtStatuList = new BoughtStatuList();
                boughtStatuList.setBoughtStatus(list);
                return boughtStatuList;
            }
        });
    }

    public static void getCategories(Map<String, String> map, IDataCallBack<CategoryList> iDataCallBack) {
        baseGetRequest(DTransferConstants.CATEGORYLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<CategoryList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public CategoryList success(String str) throws Exception {
                List<Category> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Category>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.6.1
                }.getType(), str);
                CategoryList categoryList = new CategoryList();
                categoryList.setCategories(list);
                return categoryList;
            }
        });
    }

    @Deprecated
    public static void getCategoryBannerList(Map<String, String> map, IDataCallBack<CategoryBannerList> iDataCallBack) {
        baseGetRequest(DTransferConstants.CATEGORY_BANNERLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<CategoryBannerList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.29
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public CategoryBannerList success(String str) throws Exception {
                List<Banner> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Banner>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.29.1
                }.getType(), str);
                CategoryBannerList categoryBannerList = new CategoryBannerList();
                categoryBannerList.setBannerList(list);
                return categoryBannerList;
            }
        });
    }

    public static void getCategoryBannersV2(Map<String, String> map, IDataCallBack<BannerV2List> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_CATEGORY_BANNERS, map, iDataCallBack, new BaseRequest.IRequestCallBack<BannerV2List>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.112
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public BannerV2List success(String str) throws Exception {
                List<BannerV2> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<BannerV2>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.112.1
                }.getType(), str);
                BannerV2List bannerV2List = new BannerV2List();
                bannerV2List.setBannerV2s(list);
                return bannerV2List;
            }
        });
    }

    public static void getCategoryRecommendAlbums(Map<String, String> map, IDataCallBack<CategoryRecommendAlbumsList> iDataCallBack) {
        baseGetRequest(DTransferConstants.ALBUM_CATEGORY_RECOMMEND, map, iDataCallBack, new BaseRequest.IRequestCallBack<CategoryRecommendAlbumsList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.75
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public CategoryRecommendAlbumsList success(String str) throws Exception {
                List<CategoryRecommendAlbums> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<CategoryRecommendAlbums>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.75.1
                }.getType(), str);
                CategoryRecommendAlbumsList categoryRecommendAlbumsList = new CategoryRecommendAlbumsList();
                categoryRecommendAlbumsList.setCategoryRecommendAlbumses(list);
                return categoryRecommendAlbumsList;
            }
        });
    }

    public static void getCitys(Map<String, String> map, IDataCallBack<CityList> iDataCallBack) {
        baseGetRequest(DTransferConstants.LIVE_CITYS_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<CityList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.82
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public CityList success(String str) throws Exception {
                List<City> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<City>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.82.1
                }.getType(), str);
                CityList cityList = new CityList();
                cityList.setCities(list);
                return cityList;
            }
        });
    }

    public static void getColdBootDetail(Map<String, String> map, IDataCallBack<ColdBootDetail> iDataCallBack) {
        try {
            map.put("device_id", getInstanse().getDeviceId());
            map.put("device_type", "2");
            baseGetRequest(DTransferConstants.COLD_BOOT_DETAIL, map, iDataCallBack, new BaseRequest.IRequestCallBack<ColdBootDetail>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.68
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
                public ColdBootDetail success(String str) throws Exception {
                    return (ColdBootDetail) BaseResponse.getResponseBodyStringToObject(new TypeToken<ColdBootDetail>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.68.1
                    }.getType(), str);
                }
            });
        } catch (XimalayaException e) {
            iDataCallBack.onError(e.getErrorCode(), e.getMessage());
        }
    }

    public static void getColdBootTag(Map<String, String> map, IDataCallBack<ColdBootTag> iDataCallBack) {
        baseGetRequest(DTransferConstants.COLD_BOOT_TAG, map, iDataCallBack, new BaseRequest.IRequestCallBack<ColdBootTag>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.66
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public ColdBootTag success(String str) throws Exception {
                return (ColdBootTag) BaseResponse.getResponseBodyStringToObject(new TypeToken<ColdBootTag>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.66.1
                }.getType(), str);
            }
        });
    }

    public static void getColdbootGenres(Map<String, String> map, IDataCallBack<GenreList> iDataCallBack) {
        baseGetRequest(DTransferConstants.COLD_BOOT_GENRE, map, iDataCallBack, new BaseRequest.IRequestCallBack<GenreList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.64
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public GenreList success(String str) throws Exception {
                List<String> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<String>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.64.1
                }.getType(), str);
                GenreList genreList = new GenreList();
                genreList.setGenreList(list);
                return genreList;
            }
        });
    }

    public static void getColdbootSubGenres(Map<String, String> map, IDataCallBack<SubGenreList> iDataCallBack) {
        baseGetRequest(DTransferConstants.COLD_BOOT_SUBGENRE, map, iDataCallBack, new BaseRequest.IRequestCallBack<SubGenreList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.65
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public SubGenreList success(String str) throws Exception {
                List<String> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<String>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.65.1
                }.getType(), str);
                SubGenreList subGenreList = new SubGenreList();
                subGenreList.setSubgenreList(list);
                return subGenreList;
            }
        });
    }

    public static void getColumnList(Map<String, String> map, IDataCallBack<ColumnList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.COLUMANLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<ColumnList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.32
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public ColumnList success(String str) throws Exception {
                return (ColumnList) BaseResponse.getResponseBodyStringToObject(new TypeToken<ColumnList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.32.1
                }.getType(), str);
            }
        });
    }

    public static void getComlumnDetail(Map<String, String> map, IDataCallBack<ColumnDetail> iDataCallBack) {
        baseGetRequest(DTransferConstants.COLUMAN_DETAIL_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<ColumnDetail>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.33
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public ColumnDetail success(String str) throws Exception {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Gson gson = new Gson();
                    if (jSONObject.optInt("column_content_type", 0) == 1) {
                        return (ColumnDetailAlbum) gson.fromJson(str, new TypeToken<ColumnDetailAlbum>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.33.1
                        }.getType());
                    }
                    if (jSONObject.optInt("column_content_type", 0) == 2) {
                        return (ColumnDetailTrack) gson.fromJson(str, new TypeToken<ColumnDetailTrack>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.33.2
                        }.getType());
                    }
                    throw new XimalayaException(1007, "parse response json data error");
                } catch (JSONException e) {
                    throw e;
                }
            }
        });
    }

    public static void getCustomizeTrackList(Map<String, String> map, IDataCallBack<TrackList> iDataCallBack) {
        final HashMap map2 = new HashMap();
        map2.put(DTransferConstants.TRACK_BASE_URL, UrlConstants.TRACKLIST);
        map2.putAll(map);
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.CUSTOMIZED_TRACKLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<TrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public TrackList success(String str) throws Exception {
                TrackList trackList = (TrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<TrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.23.1
                }.getType(), str);
                map2.put(DTransferConstants.TOTAL_PAGE, String.valueOf(trackList.getTotalPage()));
                trackList.setParams(map2);
                return trackList;
            }
        });
    }

    public static void getCustomizedCategories(Map<String, String> map, IDataCallBack<CategoryList> iDataCallBack) {
        baseGetRequest(DTransferConstants.CUSTOMIZED_CATEGORYLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<CategoryList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public CategoryList success(String str) throws Exception {
                List<Category> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Category>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.7.1
                }.getType(), str);
                CategoryList categoryList = new CategoryList();
                categoryList.setCategories(list);
                return categoryList;
            }
        });
    }

    public static void getDiscoveryBannerList(Map<String, String> map, IDataCallBack<DiscoveryBannerList> iDataCallBack) {
        baseGetRequest(DTransferConstants.DISCOVERY_BANNERLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<DiscoveryBannerList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.28
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public DiscoveryBannerList success(String str) throws Exception {
                List<Banner> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Banner>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.28.1
                }.getType(), str);
                DiscoveryBannerList discoveryBannerList = new DiscoveryBannerList();
                discoveryBannerList.setBannerList(list);
                return discoveryBannerList;
            }
        });
    }

    public static void getDiscoveryRecommendAlbums(Map<String, String> map, IDataCallBack<DiscoveryRecommendAlbumsList> iDataCallBack) {
        baseGetRequest(DTransferConstants.ALBUM_DISCOVERY_RECOMMEND, map, iDataCallBack, new BaseRequest.IRequestCallBack<DiscoveryRecommendAlbumsList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.74
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public DiscoveryRecommendAlbumsList success(String str) throws Exception {
                List<DiscoveryRecommendAlbums> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<DiscoveryRecommendAlbums>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.74.1
                }.getType(), str);
                DiscoveryRecommendAlbumsList discoveryRecommendAlbumsList = new DiscoveryRecommendAlbumsList();
                discoveryRecommendAlbumsList.setDiscoveryRecommendAlbumses(list);
                return discoveryRecommendAlbumsList;
            }
        });
    }

    public static void getGuessLikeAlbum(Map<String, String> map, IDataCallBack<GussLikeAlbumList> iDataCallBack) {
        map.put("device_type", "2");
        baseGetRequest(DTransferConstants.ALBUM_GUESS_LIKE, map, iDataCallBack, new BaseRequest.IRequestCallBack<GussLikeAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.31
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public GussLikeAlbumList success(String str) throws Exception {
                List<Album> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Album>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.31.1
                }.getType(), str);
                GussLikeAlbumList gussLikeAlbumList = new GussLikeAlbumList();
                gussLikeAlbumList.setAlbumList(list);
                return gussLikeAlbumList;
            }
        });
    }

    public static Handler getHandler() {
        return BaseRequest.mHandler;
    }

    public static void getHotAggregationList(Map<String, String> map, IDataCallBack<HotAggregationList> iDataCallBack) {
        baseGetRequest(DTransferConstants.HOT_AGGREGATION_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<HotAggregationList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.42
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public HotAggregationList success(String str) throws Exception {
                List<HotAggregation> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<HotAggregation>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.42.1
                }.getType(), str);
                HotAggregationList hotAggregationList = new HotAggregationList();
                hotAggregationList.setList(list);
                return hotAggregationList;
            }
        });
    }

    public static void getHotTracks(Map<String, String> map, IDataCallBack<TrackHotList> iDataCallBack) {
        final HashMap map2 = new HashMap();
        map2.put(DTransferConstants.TRACK_BASE_URL, UrlConstants.TRACKHOTLIST);
        map2.putAll(map);
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.TRACKHOTLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<TrackHotList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public TrackHotList success(String str) throws Exception {
                TrackHotList trackHotList = (TrackHotList) BaseResponse.getResponseBodyStringToObject(new TypeToken<TrackHotList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.20.1
                }.getType(), str);
                map2.put(DTransferConstants.TOTAL_PAGE, String.valueOf(trackHotList.getTotalPage()));
                trackHotList.setParams(map2);
                return trackHotList;
            }
        });
    }

    public static void getHotWords(Map<String, String> map, IDataCallBack<HotWordList> iDataCallBack) {
        baseGetRequest(DTransferConstants.SEARCH_HOT_WORDS_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<HotWordList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.26
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public HotWordList success(String str) throws Exception {
                List<HotWord> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<HotWord>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.26.1
                }.getType(), str);
                HotWordList hotWordList = new HotWordList();
                hotWordList.setHotWordList(list);
                return hotWordList;
            }
        });
    }

    public static CommonRequest getInstanse() {
        if (singleton == null) {
            synchronized (CommonRequest.class) {
                if (singleton == null) {
                    singleton = new CommonRequest();
                }
            }
        }
        return singleton;
    }

    public static void getLastPlayTracks(Map<String, String> map, IDataCallBack<LastPlayTrackList> iDataCallBack) {
        final HashMap map2 = new HashMap();
        map2.put(DTransferConstants.TRACK_BASE_URL, UrlConstants.TRACKLIST);
        map2.putAll(map);
        map2.remove(DTransferConstants.PID);
        map2.remove("track_id");
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.LAST_PLAY_TRACKLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<LastPlayTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.22
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public LastPlayTrackList success(String str) throws Exception {
                LastPlayTrackList lastPlayTrackList = (LastPlayTrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<LastPlayTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.22.1
                }.getType(), str);
                map2.put(DTransferConstants.PAGE, String.valueOf(lastPlayTrackList.getPageid()));
                map2.put(DTransferConstants.PRE_PAGE, String.valueOf(lastPlayTrackList.getPageid() - 1));
                map2.put(DTransferConstants.TOTAL_PAGE, String.valueOf(lastPlayTrackList.getTotalPage()));
                lastPlayTrackList.setParams(map2);
                return lastPlayTrackList;
            }
        });
    }

    public static void getMetadataAlbumList(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.METADATA_ALBUMS_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.78
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AlbumList success(String str) throws Exception {
                return (AlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.78.1
                }.getType(), str);
            }
        });
    }

    public static void getMetadataList(Map<String, String> map, IDataCallBack<MetaDataList> iDataCallBack) {
        baseGetRequest(DTransferConstants.METADATA_LIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<MetaDataList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.77
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public MetaDataList success(String str) throws Exception {
                List<MetaData> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<MetaData>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.77.1
                }.getType(), str);
                MetaDataList metaDataList = new MetaDataList();
                metaDataList.setMetaDatas(list);
                return metaDataList;
            }
        });
    }

    public static void getObfuscatedPlayInfo(Map<String, String> map, IDataCallBack<ObfuscatePlayInfo> iDataCallBack) {
        baseGetRequest("https://mpay.ximalaya.com/openapi-payfacade-app/open_pay/get_obfuscated_play_info/" + System.currentTimeMillis(), map, iDataCallBack, new BaseRequest.IRequestCallBack<ObfuscatePlayInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public ObfuscatePlayInfo success(String str) throws Exception {
                return (ObfuscatePlayInfo) BaseResponse.getResponseBodyStringToObject(new TypeToken<ObfuscatePlayInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.13.1
                }.getType(), str);
            }
        });
    }

    public static ObfuscatePlayInfo getObfuscatedPlayInfoSync(Map<String, String> map) {
        try {
            return (ObfuscatePlayInfo) baseGetReqeustSync("https://mpay.ximalaya.com/openapi-payfacade-app/open_pay/get_obfuscated_play_info/" + System.currentTimeMillis(), map, new BaseRequest.IRequestCallBack<ObfuscatePlayInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
                public ObfuscatePlayInfo success(String str) throws Exception {
                    return (ObfuscatePlayInfo) BaseResponse.getResponseBodyStringToObject(new TypeToken<ObfuscatePlayInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.14.1
                    }.getType(), str);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void getOrderDetail(Map<String, String> map, IDataCallBack<OrderDetail> iDataCallBack) {
        basePostRequest(DTransferConstants.GET_ORDER_DETAIL, map, iDataCallBack, new BaseRequest.IRequestCallBack<OrderDetail>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.111
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public OrderDetail success(String str) throws Exception {
                return (OrderDetail) BaseResponse.getResponseBodyStringToObject(new TypeToken<OrderDetail>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.111.1
                }.getType(), str);
            }
        });
    }

    public static void getPaidAlbumByTag(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_PAID_ALBUM_BY_TAG, map, iDataCallBack, new BaseRequest.IRequestCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.93
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AlbumList success(String str) throws Exception {
                return (AlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.93.1
                }.getType(), str);
            }
        });
    }

    public static void getPaidRank(Map<String, String> map, IDataCallBack<RankList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_PAID_RANK, map, iDataCallBack, new BaseRequest.IRequestCallBack<RankList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.97
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RankList success(String str) throws Exception {
                List<Rank> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Rank>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.97.1
                }.getType(), str);
                RankList rankList = new RankList();
                rankList.setRankList(list);
                return rankList;
            }
        });
    }

    public static void getPaidRankAlbumList(Map<String, String> map, IDataCallBack<RankAlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_RANK_ALBUMS, map, iDataCallBack, new BaseRequest.IRequestCallBack<RankAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.98
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RankAlbumList success(String str) throws Exception {
                return (RankAlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<RankAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.98.1
                }.getType(), str);
            }
        });
    }

    public static void getPaidTags(Map<String, String> map, IDataCallBack<TagList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_TAGS, map, iDataCallBack, new BaseRequest.IRequestCallBack<TagList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.92
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public TagList success(String str) throws Exception {
                List<Tag> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Tag>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.92.1
                }.getType(), str);
                TagList tagList = new TagList();
                tagList.setTagList(list);
                return tagList;
            }
        });
    }

    public static void getPaidTrackByAlbum(Map<String, String> map, IDataCallBack<TrackList> iDataCallBack) {
        final HashMap map2 = new HashMap();
        map2.put(DTransferConstants.TRACK_BASE_URL, DTransferConstants.GET_PAID_TRACK_BY_ALBUM);
        map2.putAll(map);
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.GET_PAID_TRACK_BY_ALBUM, map, iDataCallBack, new BaseRequest.IRequestCallBack<TrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.94
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public TrackList success(String str) throws Exception {
                TrackList trackList = (TrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<TrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.94.1
                }.getType(), str);
                map2.put(DTransferConstants.TOTAL_PAGE, String.valueOf(trackList.getTotalPage()));
                trackList.setParams(map2);
                return trackList;
            }
        });
    }

    public static void getPlayHistoryByUid(Map<String, String> map, IDataCallBack<PlayHistoryList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_HISTORY_BY_UID, map, iDataCallBack, new BaseRequest.IRequestCallBack<PlayHistoryList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.83
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PlayHistoryList success(String str) throws Exception {
                return new PlayHistoryList(str);
            }
        });
    }

    public static void getPriceInfo(Map<String, String> map, IDataCallBack<PayInfo> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_PAY_INFO, map, iDataCallBack, new BaseRequest.IRequestCallBack<PayInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.105
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PayInfo success(String str) throws Exception {
                return (PayInfo) BaseResponse.getResponseBodyStringToObject(new TypeToken<PayInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.105.1
                }.getType(), str);
            }
        });
    }

    public static void getProgram(Map<String, String> map, IDataCallBack<ProgramList> iDataCallBack) {
        baseGetRequest(DTransferConstants.LIVE_PROGRAMLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<ProgramList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.48
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public ProgramList success(String str) throws Exception {
                Program program = (Program) BaseResponse.getResponseBodyStringToObject(new TypeToken<Program>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.48.1
                }.getType(), str);
                ProgramList programList = new ProgramList();
                ArrayList arrayList = new ArrayList();
                arrayList.add(program);
                programList.setmProgramList(arrayList);
                return programList;
            }
        });
    }

    public static void getProvinces(Map<String, String> map, IDataCallBack<ProvinceList> iDataCallBack) {
        baseGetRequest(DTransferConstants.LIVE_PROVINCELIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<ProvinceList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.44
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public ProvinceList success(String str) throws Exception {
                List<Province> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Province>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.44.1
                }.getType(), str);
                ProvinceList provinceList = new ProvinceList();
                provinceList.setProvinceList(list);
                return provinceList;
            }
        });
    }

    public static void getRadioCategory(Map<String, String> map, IDataCallBack<RadioCategoryList> iDataCallBack) {
        baseGetRequest(DTransferConstants.RADIO_CATEGORE, map, iDataCallBack, new BaseRequest.IRequestCallBack<RadioCategoryList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.79
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RadioCategoryList success(String str) throws Exception {
                List<RadioCategory> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<RadioCategory>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.79.1
                }.getType(), str);
                RadioCategoryList radioCategoryList = new RadioCategoryList();
                radioCategoryList.setRadioCategories(list);
                return radioCategoryList;
            }
        });
    }

    public static void getRadios(Map<String, String> map, IDataCallBack<RadioList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.LIVE_RADIOLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RadioList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.46
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RadioList success(String str) throws Exception {
                return (RadioList) BaseResponse.getResponseBodyStringToObject(new TypeToken<RadioList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.46.1
                }.getType(), str);
            }
        });
    }

    public static void getRadiosByCategory(Map<String, String> map, IDataCallBack<RadioListByCategory> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_RADIOS_BY_CATEGORE, map, iDataCallBack, new BaseRequest.IRequestCallBack<RadioListByCategory>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.80
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RadioListByCategory success(String str) throws Exception {
                return (RadioListByCategory) BaseResponse.getResponseBodyStringToObject(new TypeToken<RadioListByCategory>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.80.1
                }.getType(), str);
            }
        });
    }

    public static void getRadiosByCity(Map<String, String> map, IDataCallBack<RadioList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.GET_RADIOS_BY_CITY, map, iDataCallBack, new BaseRequest.IRequestCallBack<RadioList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.45
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RadioList success(String str) throws Exception {
                return (RadioList) BaseResponse.getResponseBodyStringToObject(new TypeToken<RadioList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.45.1
                }.getType(), str);
            }
        });
    }

    public static void getRadiosByIds(Map<String, String> map, IDataCallBack<RadioListById> iDataCallBack) {
        baseGetRequest(DTransferConstants.LIVE_GET_RADIOS_BY_IDS, map, iDataCallBack, new BaseRequest.IRequestCallBack<RadioListById>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.50
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RadioListById success(String str) throws Exception {
                return (RadioListById) BaseResponse.getResponseBodyStringToObject(new TypeToken<RadioListById>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.50.1
                }.getType(), str);
            }
        });
    }

    public static void getRankAlbumListNew(Map<String, String> map, IDataCallBack<RankAlbumList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.RANK_ALBUMLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RankAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.35
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RankAlbumList success(String str) throws Exception {
                return (RankAlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<RankAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.35.1
                }.getType(), str);
            }
        });
    }

    public static void getRankAlbums(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_RANK_ALBUMS, map, iDataCallBack, new BaseRequest.IRequestCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.99
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AlbumList success(String str) throws Exception {
                return (AlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.99.1
                }.getType(), str);
            }
        });
    }

    public static void getRankBannerList(Map<String, String> map, IDataCallBack<RankBannerList> iDataCallBack) {
        baseGetRequest(DTransferConstants.RANK_BANNERLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RankBannerList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.30
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RankBannerList success(String str) throws Exception {
                List<Banner> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Banner>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.30.1
                }.getType(), str);
                RankBannerList rankBannerList = new RankBannerList();
                rankBannerList.setBannerList(list);
                return rankBannerList;
            }
        });
    }

    public static void getRankList(Map<String, String> map, IDataCallBack<RankList> iDataCallBack) {
        baseGetRequest(DTransferConstants.RANKLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RankList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.34
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RankList success(String str) throws Exception {
                List<Rank> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Rank>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.34.1
                }.getType(), str);
                RankList rankList = new RankList();
                rankList.setRankList(list);
                return rankList;
            }
        });
    }

    public static void getRankRadios(Map<String, String> map, IDataCallBack<RadioList> iDataCallBack) {
        baseGetRequest(DTransferConstants.RANKS_RADIOLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RadioList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.37
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RadioList success(String str) throws Exception {
                List<Radio> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Radio>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.37.1
                }.getType(), str);
                RadioList radioList = new RadioList();
                radioList.setRadios(list);
                return radioList;
            }
        });
    }

    public static void getRankTrackList(Map<String, String> map, IDataCallBack<RankTrackList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.RANK_TRACKLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RankTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.36
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RankTrackList success(String str) throws Exception {
                return (RankTrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<RankTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.36.1
                }.getType(), str);
            }
        });
    }

    public static void getRecommendCollect(Map<String, String> map, IDataCallBack<RecommendCollectAlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.RECOMMEND_COLLECT, map, iDataCallBack, new BaseRequest.IRequestCallBack<RecommendCollectAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.49
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RecommendCollectAlbumList success(String str) throws Exception {
                List<Album> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Album>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.49.1
                }.getType(), str);
                RecommendCollectAlbumList recommendCollectAlbumList = new RecommendCollectAlbumList();
                recommendCollectAlbumList.setAlbumList(list);
                return recommendCollectAlbumList;
            }
        });
    }

    public static void getRecommendDownloadList(Map<String, String> map, IDataCallBack<RecommendDownload> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.RECOMMEND_DOWNLOAD_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RecommendDownload>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.43
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RecommendDownload success(String str) throws Exception {
                return (RecommendDownload) BaseResponse.getResponseBodyStringToObject(new TypeToken<RecommendDownload>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.43.1
                }.getType(), str);
            }
        });
    }

    public static void getRelativeAlbums(Map<String, String> map, IDataCallBack<RelativeAlbums> iDataCallBack) {
        baseGetRequest(DTransferConstants.RELATIVE_ALBUMLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RelativeAlbums>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.39
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RelativeAlbums success(String str) throws Exception {
                List<Album> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Album>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.39.1
                }.getType(), str);
                RelativeAlbums relativeAlbums = new RelativeAlbums();
                relativeAlbums.setRelativeAlbumList(list);
                if (list != null) {
                    relativeAlbums.setCurrentPage(1);
                    relativeAlbums.setTotalPage(1);
                    relativeAlbums.setTotalCount(list.size());
                }
                return relativeAlbums;
            }
        });
    }

    public static void getRelativeAlbumsUseTrackId(Map<String, String> map, IDataCallBack<RelativeAlbums> iDataCallBack) {
        baseGetRequest(DTransferConstants.RELATIVE_ALBUMLIST_USE_TRACKID_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RelativeAlbums>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.38
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RelativeAlbums success(String str) throws Exception {
                List<Album> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Album>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.38.1
                }.getType(), str);
                RelativeAlbums relativeAlbums = new RelativeAlbums();
                relativeAlbums.setRelativeAlbumList(list);
                if (list != null) {
                    relativeAlbums.setCurrentPage(1);
                    relativeAlbums.setTotalPage(1);
                    relativeAlbums.setTotalCount(list.size());
                }
                return relativeAlbums;
            }
        });
    }

    public static void getSchedules(Map<String, String> map, IDataCallBack<ScheduleList> iDataCallBack) {
        baseGetRequest(DTransferConstants.LIVE_SCHEDULELIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<ScheduleList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.47
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public ScheduleList success(String str) throws Exception {
                List<Schedule> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Schedule>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.47.1
                }.getType(), str);
                ScheduleList scheduleList = new ScheduleList();
                scheduleList.setmScheduleList(list);
                return scheduleList;
            }
        });
    }

    public static void getSearchAll(Map<String, String> map, IDataCallBack<SearchAll> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.SEARCH_ALL_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<SearchAll>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public SearchAll success(String str) throws Exception {
                return (SearchAll) BaseResponse.getResponseBodyStringToObject(new TypeToken<SearchAll>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.11.1
                }.getType(), str);
            }
        });
    }

    public static void getSearchAnnouncers(Map<String, String> map, IDataCallBack<AnnouncerList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.SEARCH_ANNOUNCERS_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<AnnouncerList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AnnouncerList success(String str) throws Exception {
                return (AnnouncerList) BaseResponse.getResponseBodyStringToObject(new TypeToken<AnnouncerList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.16.1
                }.getType(), str);
            }
        });
    }

    public static void getSearchedAlbums(Map<String, String> map, IDataCallBack<SearchAlbumList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.SEARCH_ALBUMLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<SearchAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public SearchAlbumList success(String str) throws Exception {
                return (SearchAlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<SearchAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.9.1
                }.getType(), str);
            }
        });
    }

    public static void getSearchedRadios(Map<String, String> map, IDataCallBack<RadioList> iDataCallBack) {
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.SEARCH_RADIOLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<RadioList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public RadioList success(String str) throws Exception {
                return (RadioList) BaseResponse.getResponseBodyStringToObject(new TypeToken<RadioList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.12.1
                }.getType(), str);
            }
        });
    }

    public static void getSearchedTracks(Map<String, String> map, IDataCallBack<SearchTrackList> iDataCallBack) {
        getInstanse().setPageSize(map);
        final HashMap map2 = new HashMap();
        map2.put(DTransferConstants.TRACK_BASE_URL, UrlConstants.SEARCHTRACKLIST);
        map2.putAll(map);
        baseGetRequest(DTransferConstants.SEARCH_TRACKLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<SearchTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public SearchTrackList success(String str) throws Exception {
                SearchTrackList searchTrackList = (SearchTrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<SearchTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.10.1
                }.getType(), str);
                map2.put(DTransferConstants.TOTAL_PAGE, String.valueOf(searchTrackList.getTotalPage()));
                searchTrackList.setParams(map2);
                return searchTrackList;
            }
        });
    }

    public static void getSuggestWord(Map<String, String> map, IDataCallBack<SuggestWords> iDataCallBack) {
        baseGetRequest(DTransferConstants.SEARCH_SUGGEST_WORDS_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<SuggestWords>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.27
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public SuggestWords success(String str) throws Exception {
                return (SuggestWords) BaseResponse.getResponseBodyStringToObject(new TypeToken<SuggestWords>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.27.1
                }.getType(), str);
            }
        });
    }

    public static void getTags(Map<String, String> map, IDataCallBack<TagList> iDataCallBack) {
        baseGetRequest(DTransferConstants.TAGLIST_URL_V2, map, iDataCallBack, new BaseRequest.IRequestCallBack<TagList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.40
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public TagList success(String str) throws Exception {
                List<Tag> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<Tag>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.40.1
                }.getType(), str);
                TagList tagList = new TagList();
                tagList.setTagList(list);
                return tagList;
            }
        });
    }

    public static void getTrackInfo(final Map<String, String> map, final IDataCallBack<TrackBaseInfo> iDataCallBack) {
        MyAsyncTask.execute(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.53
            @Override // java.lang.Runnable
            public void run() {
                if (!XmSecretKeyUtil.getInstance().checkAuthorized()) {
                    XmSecretKeyUtil.getInstance().updateSync();
                }
                CommonRequest.baseGetRequest(DTransferConstants.GET_PLAY_INFO, map, iDataCallBack, CommonRequest.trackInfCallBack);
            }
        });
    }

    public static TrackBaseInfo getTrackInfoSync(Map<String, String> map) {
        try {
            if (!XmSecretKeyUtil.getInstance().checkAuthorized()) {
                XmSecretKeyUtil.getInstance().updateSync();
            }
            return (TrackBaseInfo) baseGetReqeustSync(DTransferConstants.GET_PLAY_INFO, map, trackInfCallBack);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void getTrackList(Map<String, String> map, IDataCallBack<CommonTrackList> iDataCallBack) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        String str = (String) map2.remove(DTransferConstants.TRACK_BASE_URL);
        map2.remove(DTransferConstants.TOTAL_PAGE);
        map2.remove(DTransferConstants.PRE_PAGE);
        baseGetRequest(str, map2, iDataCallBack, new BaseRequest.IRequestCallBack<CommonTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.73
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public CommonTrackList success(String str2) throws Exception {
                return (CommonTrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<CommonTrackList<Track>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.73.1
                }.getType(), str2);
            }
        });
    }

    public static void getTrackStatuesByAlbumId(Map<String, String> map, IDataCallBack<XmAlbumTracksStatue> iDataCallBack) {
        baseGetRequest("http://api.ximalaya.com/openapi-gateway-app/albums/get_all_track_ids", map, iDataCallBack, new BaseRequest.IRequestCallBack<XmAlbumTracksStatue>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.109
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public XmAlbumTracksStatue success(String str) throws Exception {
                return (XmAlbumTracksStatue) BaseResponse.getResponseBodyStringToObject(new TypeToken<XmAlbumTracksStatue>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.109.1
                }.getType(), str);
            }
        });
    }

    public static void getTracks(Map<String, String> map, IDataCallBack<TrackList> iDataCallBack) {
        final HashMap map2 = new HashMap();
        try {
            map2.put(DTransferConstants.TRACK_BASE_URL, UrlConstants.TRACKLIST);
            map2.putAll(map);
            getInstanse().setPageSize(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        baseGetRequest(DTransferConstants.TRACKLIST_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<TrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.24
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public TrackList success(String str) throws Exception {
                TrackList trackList = (TrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<TrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.24.1
                }.getType(), str);
                map2.put(DTransferConstants.TOTAL_PAGE, String.valueOf(trackList.getTotalPage()));
                trackList.setParams(map2);
                return trackList;
            }
        });
    }

    public static void getTracksByAnnouncer(final Map<String, String> map, IDataCallBack<AnnouncerTrackList> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_TRACKS_BY_ANNOUNCER, map, iDataCallBack, new BaseRequest.IRequestCallBack<AnnouncerTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.81
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AnnouncerTrackList success(String str) throws Exception {
                AnnouncerTrackList announcerTrackList = (AnnouncerTrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<AnnouncerTrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.81.1
                }.getType(), str);
                try {
                    map.put(DTransferConstants.PAGE, String.valueOf(announcerTrackList.getCurrentPage()));
                    map.put(DTransferConstants.PRE_PAGE, String.valueOf(announcerTrackList.getCurrentPage() - 1));
                    map.put(DTransferConstants.TOTAL_PAGE, String.valueOf(announcerTrackList.getTotalPage()));
                    announcerTrackList.setParams(map);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return announcerTrackList;
            }
        });
    }

    @Deprecated
    public static void getUpToDateAlbums(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        getAlbumList(map, iDataCallBack);
    }

    public static void getUpdateBatch(Map<String, String> map, IDataCallBack<UpdateBatchList> iDataCallBack) {
        baseGetRequest(DTransferConstants.UPDATE_BATCH_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<UpdateBatchList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public UpdateBatchList success(String str) throws Exception {
                List<UpdateBatch> list = (List) BaseResponse.getResponseBodyStringToObject(new TypeToken<List<UpdateBatch>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.8.1
                }.getType(), str);
                UpdateBatchList updateBatchList = new UpdateBatchList();
                updateBatchList.setList(list);
                return updateBatchList;
            }
        });
    }

    public static String getUserAgent() {
        if (TextUtils.isEmpty(mUserAgent)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ting_");
            sb.append(getInstanse().getSdkVersion());
            sb.append("(");
            try {
                sb.append(URLEncoder.encode(Build.MODEL, "utf-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            sb.append(",");
            sb.append("Android" + Build.VERSION.SDK_INT);
            sb.append(")");
            mUserAgent = sb.toString();
        }
        return mUserAgent;
    }

    public static void getUserInfo(Map<String, String> map, IDataCallBack<XmUserInfo> iDataCallBack) {
        baseGetRequest(DTransferConstants.GET_USER_ALL_INFO, map, iDataCallBack, new BaseRequest.IRequestCallBack<XmUserInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.108
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public XmUserInfo success(String str) throws Exception {
                return (XmUserInfo) BaseResponse.getResponseBodyStringToObject(new TypeToken<XmUserInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.108.1
                }.getType(), str);
            }
        });
    }

    public static byte[] hexStr2ByteArray(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((((byte) (Character.digit(str.charAt(i), 16) & 255)) << 4) | ((byte) (Character.digit(str.charAt(i + 1), 16) & 255)));
            i += 2;
        }
        return bArr;
    }

    public static void isSubscribe(Map<String, String> map, IDataCallBack<Map<String, Boolean>> iDataCallBack) {
        basePostRequest(DTransferConstants.USE_IS_SUBSCRIBED, map, iDataCallBack, new BaseRequest.IRequestCallBack<Map<String, Boolean>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.90
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public Map<String, Boolean> success(String str) throws Exception {
                return (Map) new Gson().fromJson(str, new TypeToken<Map<String, Boolean>>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.90.1
                }.getType());
            }
        });
    }

    private boolean isVaildOaid(String str) {
        return (TextUtils.isEmpty(str) || "0".equals(str) || "00000000-0000-0000-0000-000000000000".equals(str)) ? false : true;
    }

    public static void postColdBootTag(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        map.put("device_type", "2");
        basePostRequest(DTransferConstants.COLD_BOOT_SUBMIT_TAG, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.67
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static void postLiveBatchsRecords(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.LIVE_BATCH_RECORDS, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.71
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static void postLiveSingleRecord(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.LIVE_SINGLE_RECORD, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.69
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static void postRewardVideoSdkTrace(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.REWARD_VIDEO_SDK_TRACE_URL, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.118
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static void postString(String str, final IDataCallBack iDataCallBack) {
        Request requestBuild;
        try {
            Request.Builder builderUrlPost = BaseBuilder.urlPost(DTransferConstants.XDCS_ONLINE, str);
            addOpenSDKAdCookie(builderUrlPost, new StringBuilder());
            requestBuild = builderUrlPost.build();
        } catch (XimalayaException unused) {
            requestBuild = null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            requestBuild = null;
        }
        if (requestBuild != null) {
            BaseCall.getInstanse().doAsync(requestBuild, new IHttpCallBack() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.62
                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onFailure(int i, String str2) {
                    IDataCallBack iDataCallBack2 = iDataCallBack;
                    if (iDataCallBack2 != null) {
                        iDataCallBack2.onError(i, str2);
                    }
                }

                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onResponse(Response response) {
                    IDataCallBack iDataCallBack2 = iDataCallBack;
                    if (iDataCallBack2 != null) {
                        iDataCallBack2.onSuccess(null);
                    }
                }
            });
        }
    }

    public static void postStringOld(String str, final IDataCallBack iDataCallBack) {
        Request requestBuild;
        try {
            requestBuild = BaseBuilder.urlPost(DTransferConstants.XDCS_ONLINE_OLD, str).build();
        } catch (XimalayaException unused) {
            requestBuild = null;
        }
        if (requestBuild != null) {
            BaseCall.getInstanse().doAsync(requestBuild, new IHttpCallBack() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.63
                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onFailure(int i, String str2) {
                    IDataCallBack iDataCallBack2 = iDataCallBack;
                    if (iDataCallBack2 != null) {
                        iDataCallBack2.onError(i, str2);
                    }
                }

                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onResponse(Response response) {
                    IDataCallBack iDataCallBack2 = iDataCallBack;
                    if (iDataCallBack2 != null) {
                        iDataCallBack2.onSuccess(null);
                    }
                }
            });
        }
    }

    public static void postTrackBatchsRecords(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.TRACK_BATCH_RECORDS, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.72
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static void postTrackSingleRecord(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.TRACK_SINGLE_RECORD, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.70
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public static void release() {
        EncryptUtilForSDK.release();
    }

    public static String replaceHttpToHttps(String str) {
        if (str == null || str.startsWith("https") || !str.startsWith("http") || !getInstanse().getUseHttps()) {
            return str;
        }
        Iterator<String> it2 = getInstanse().noSupportHttpsInApp.iterator();
        while (it2.hasNext()) {
            if (str.contains(it2.next())) {
                return str;
            }
        }
        if (getInstanse().mNoSupportHttps == null) {
            return str;
        }
        Iterator<String> it3 = getInstanse().mNoSupportHttps.iterator();
        while (it3.hasNext()) {
            if (str.contains(it3.next())) {
                return str;
            }
        }
        return str.replace("http", "https");
    }

    public static void searchAlbumV2(Map<String, String> map, IDataCallBack<SearchAlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.SEARCH_ALBUMS_LIST_URL_V2, map, iDataCallBack, new BaseRequest.IRequestCallBack<SearchAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.114
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public SearchAlbumList success(String str) throws Exception {
                return (SearchAlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<SearchAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.114.1
                }.getType(), str);
            }
        });
    }

    public static void searchPaidAlbums(Map<String, String> map, IDataCallBack<AlbumList> iDataCallBack) {
        baseGetRequest(DTransferConstants.SEARCH_PAID_ALBUMS, map, iDataCallBack, new BaseRequest.IRequestCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.103
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public AlbumList success(String str) throws Exception {
                return (AlbumList) BaseResponse.getResponseBodyStringToObject(new TypeToken<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.103.1
                }.getType(), str);
            }
        });
    }

    public static void searchPaidTracks(Map<String, String> map, IDataCallBack<TrackList> iDataCallBack) {
        final HashMap map2 = new HashMap();
        map2.put(DTransferConstants.TRACK_BASE_URL, DTransferConstants.SEARCH_PAID_TRACKS);
        map2.putAll(map);
        getInstanse().setPageSize(map);
        baseGetRequest(DTransferConstants.SEARCH_PAID_TRACKS, map, iDataCallBack, new BaseRequest.IRequestCallBack<TrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.104
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public TrackList success(String str) throws Exception {
                TrackList trackList = (TrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<TrackList>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.104.1
                }.getType(), str);
                map2.put(DTransferConstants.TOTAL_PAGE, String.valueOf(trackList.getTotalPage()));
                trackList.setParams(map2);
                return trackList;
            }
        });
    }

    public static void searchTrackV2(Map<String, String> map, IDataCallBack<SearchTrackListV2> iDataCallBack) {
        baseGetRequest(DTransferConstants.SEARCH_TRACKS_LIST_URL_V2, map, iDataCallBack, new BaseRequest.IRequestCallBack<SearchTrackListV2>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.113
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public SearchTrackListV2 success(String str) throws Exception {
                return (SearchTrackListV2) BaseResponse.getResponseBodyStringToObject(new TypeToken<SearchTrackListV2>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.113.1
                }.getType(), str);
            }
        });
    }

    public static void simpleLogin(Map<String, String> map, final IDataCallBack<String> iDataCallBack) {
        map.put("timestamp", System.currentTimeMillis() + "");
        map.put("nonce", System.currentTimeMillis() + "");
        map.put(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "token");
        try {
            map.put("client_id", getInstanse().getAppKey());
        } catch (XimalayaException e) {
            e.printStackTrace();
        }
        Request.Builder builderUrlPost = null;
        try {
            builderUrlPost = BaseBuilder.urlPost(replaceHttpToHttps(DTransferConstants.SIMPLE_LOGIN), CommonParams(map), getInstanse().getAppsecret());
        } catch (XimalayaException e2) {
            e2.printStackTrace();
        }
        FirebasePerfOkHttpClient.enqueue(new OkHttpClient().newBuilder().connectTimeout(15L, TimeUnit.SECONDS).followRedirects(false).followSslRedirects(false).build().newCall(builderUrlPost.build()), new Callback() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.106
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                Logger.d(CommonRequest.TAG, "authorize, request failed, error message = " + iOException.getMessage());
                if (iDataCallBack == null) {
                    return;
                }
                boolean z = ConstantsOpenSdk.isDebug;
                String str = BaseCall.NET_ERR_CONTENT;
                if (z) {
                    String message = iOException.getMessage();
                    if (!TextUtils.isEmpty(message)) {
                        str = message;
                    }
                }
                BaseRequest.delivery.postError(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, str, iDataCallBack);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                int iCode = response.code();
                if (iCode != 302) {
                    BaseRequest.delivery.postError(iCode, response.body().string(), iDataCallBack);
                } else {
                    String str = response.headers().get("Location");
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    BaseRequest.delivery.postSuccess(iDataCallBack, str);
                }
            }
        });
    }

    public static String simpleLoginSync(Map<String, String> map) throws IOException {
        map.put("timestamp", System.currentTimeMillis() + "");
        map.put("nonce", System.currentTimeMillis() + "");
        map.put(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "token");
        try {
            map.put("client_id", getInstanse().getAppKey());
        } catch (XimalayaException e) {
            e.printStackTrace();
        }
        Request.Builder builderUrlPost = null;
        try {
            builderUrlPost = BaseBuilder.urlPost(replaceHttpToHttps(DTransferConstants.SIMPLE_LOGIN), CommonParams(map), getInstanse().getAppsecret());
        } catch (XimalayaException e2) {
            e2.printStackTrace();
        }
        Response responseExecute = FirebasePerfOkHttpClient.execute(new OkHttpClient().newBuilder().connectTimeout(15L, TimeUnit.SECONDS).followRedirects(false).followSslRedirects(false).build().newCall(builderUrlPost.build()));
        return responseExecute.code() == 302 ? responseExecute.headers().get("Location") : "";
    }

    public static void singleExposureRecord(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.SINGLE_EXPOSURE_RECORD, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.116
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) BaseResponse.getResponseBodyStringToObject(new TypeToken<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.116.1
                }.getType(), str);
            }
        });
    }

    public static void statOnlineAd(List<XmAdsRecord> list, final IDataCallBack iDataCallBack) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (XmAdsRecord xmAdsRecord : list) {
            XmAdsEvent xmAdsEvent = new XmAdsEvent();
            xmAdsEvent.setType("AD");
            xmAdsEvent.setProps(xmAdsRecord);
            xmAdsEvent.setTs(System.currentTimeMillis());
            arrayList.add(xmAdsEvent);
        }
        XmAdsEvents xmAdsEvents = new XmAdsEvents();
        xmAdsEvents.setEvents(arrayList);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new AsyncGson().toJsonResultOnThread(xmAdsEvents, new AsyncGson.IResult<String>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.60
                @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
                public void postException(Exception exc) {
                }

                @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
                public void postResult(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    CommonRequest.postString(str, iDataCallBack);
                }
            });
            return;
        }
        try {
            String json = new Gson().toJson(xmAdsEvents);
            if (TextUtils.isEmpty(json)) {
                return;
            }
            postString(json, iDataCallBack);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void statOnlineShopAd(XmShopEvents xmShopEvents, final IDataCallBack iDataCallBack) {
        if (xmShopEvents == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new AsyncGson().toJsonResultOnThread(xmShopEvents, new AsyncGson.IResult<String>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.61
                @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
                public void postException(Exception exc) {
                }

                @Override // com.ximalaya.ting.android.opensdk.util.AsyncGson.IResult
                public void postResult(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    CommonRequest.postStringOld(str, iDataCallBack);
                }
            });
            return;
        }
        try {
            String json = new Gson().toJson(xmShopEvents);
            if (TextUtils.isEmpty(json)) {
                return;
            }
            postStringOld(json, iDataCallBack);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String subUrlCore(String str) {
        return str.substring(str.indexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 7), str.length());
    }

    public static void updateSecret(Map<String, String> map, IDataCallBack<SercretPubKey> iDataCallBack) {
        basePostRequest(DTransferConstants.GET_ENCRYPT_EXCHANGE, map, iDataCallBack, new BaseRequest.IRequestCallBack<SercretPubKey>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.55
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public SercretPubKey success(String str) throws Exception {
                SercretPubKey sercretPubKey = (SercretPubKey) new Gson().fromJson(str, SercretPubKey.class);
                if (sercretPubKey == null || !sercretPubKey.isFallBack()) {
                    return sercretPubKey;
                }
                return null;
            }
        });
    }

    public static SercretPubKey updateSecretSync(Map<String, String> map) {
        try {
            return (SercretPubKey) basePostRequestSync(DTransferConstants.GET_ENCRYPT_EXCHANGE, map, new BaseRequest.IRequestCallBack<SercretPubKey>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.56
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
                public SercretPubKey success(String str) throws Exception {
                    return (SercretPubKey) new Gson().fromJson(str, SercretPubKey.class);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void updateTrackForPlay(Map<String, String> map, IDataCallBack<String> iDataCallBack, Track track) {
        updateTrackInfo(map, iDataCallBack, track);
    }

    public static void updateTrackInfo(Map<String, String> map, final IDataCallBack<String> iDataCallBack, final Track track) {
        map.put("track_id", track.getDataId() + "");
        map.put("device", "android");
        getObfuscatedPlayInfo(map, new IDataCallBack<ObfuscatePlayInfo>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.76
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onError(int i, String str) {
                iDataCallBack.onError(i, str);
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onSuccess(ObfuscatePlayInfo obfuscatePlayInfo) {
                if (obfuscatePlayInfo == null) {
                    onError(TypedValues.MotionType.TYPE_EASING, "updateTrackForPlay return result be null");
                    return;
                }
                track.setAuthorized(obfuscatePlayInfo.isIsAuthorized());
                StringBuilder url = PayUtil.getUrl(CommonRequest.getInstanse().getAppsecret(), obfuscatePlayInfo.getFileId(), obfuscatePlayInfo.getEp(), obfuscatePlayInfo.getDuration(), obfuscatePlayInfo.getApiVersion(), obfuscatePlayInfo.getTotalLength());
                if (url == null) {
                    onError(TypedValues.MotionType.TYPE_EASING, "updateTrackForPlay return result be null");
                } else {
                    iDataCallBack.onSuccess(url.toString());
                }
            }
        });
    }

    public static String updateTrackInfoSync(long j) {
        StringBuilder url;
        HashMap map = new HashMap();
        map.put("track_id", j + "");
        map.put("device", "android");
        ObfuscatePlayInfo obfuscatedPlayInfoSync = getObfuscatedPlayInfoSync(map);
        if (obfuscatedPlayInfoSync == null || (url = PayUtil.getUrl(getInstanse().getAppsecret(), obfuscatedPlayInfoSync.getFileId(), obfuscatedPlayInfoSync.getEp(), obfuscatedPlayInfoSync.getDuration(), obfuscatedPlayInfoSync.getApiVersion(), obfuscatedPlayInfoSync.getTotalLength())) == null) {
            return null;
        }
        return url.toString();
    }

    public static void uploadHistory(Map<String, String> map, IDataCallBack<PostResponse> iDataCallBack) {
        basePostRequest(DTransferConstants.UPLOAD_HISTORY, map, iDataCallBack, new BaseRequest.IRequestCallBack<PostResponse>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.84
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public PostResponse success(String str) throws Exception {
                return (PostResponse) new Gson().fromJson(str, PostResponse.class);
            }
        });
    }

    public Map<String, String> assembleCommonParams(boolean z) throws XimalayaException {
        HashMap map = new HashMap();
        map.put("app_key", getInstanse().getAppKey());
        map.put("device_id", getDeviceId());
        map.put(DTransferConstants.SDK_CLIENT_TYPE, "2");
        map.put(DTransferConstants.PACKID, getInstanse().getPackId());
        map.put(DTransferConstants.SDK_VERSION, z ? "6.0.6" : getInstanse().getSdkVersion());
        map.put(DTransferConstants.CLIENT_OS_TYPE, String.valueOf(getInstanse().getClientOsType()));
        map.put("device_id_type", this.deviceIdType);
        return map;
    }

    public void enableDeviceIdHashMode(boolean z) {
        this.enableDeviceIdHashMode = z;
    }

    public String getAppKey() throws XimalayaException {
        if (TextUtils.isEmpty(this.mAppkey)) {
            try {
                this.mAppkey = getApplication().getPackageManager().getApplicationInfo(getApplication().getPackageName(), 128).metaData.getString("app_key");
            } catch (XimalayaException e) {
                throw e;
            } catch (Exception e2) {
                Logger.e(e2);
                throw XimalayaException.getExceptionByCode(1005);
            }
        }
        if (TextUtils.isEmpty(this.mAppkey)) {
            throw XimalayaException.getExceptionByCode(1005);
        }
        return this.mAppkey;
    }

    public int getClientOsType() {
        return 2;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getDefaultPagesize() {
        return sPagesize;
    }

    public String getDeviceId() throws XimalayaException {
        if ((this.mDeviceid != null && "OAID".equals(this.deviceIdType)) || TYPE_OAID_MD5.equals(this.deviceIdType)) {
            return this.mDeviceid;
        }
        IDeviceInfoProvider iDeviceInfoProvider = this.mDeviceInfoProvider;
        if (iDeviceInfoProvider != null) {
            String strOaid = iDeviceInfoProvider.oaid();
            if (isVaildOaid(strOaid)) {
                if (this.enableDeviceIdHashMode) {
                    this.mDeviceid = MD5.md5(strOaid);
                    this.deviceIdType = TYPE_OAID_MD5;
                } else {
                    this.mDeviceid = strOaid;
                    this.deviceIdType = "OAID";
                }
                return this.mDeviceid;
            }
        }
        if (!TextUtils.isEmpty(this.mDeviceid)) {
            return this.mDeviceid;
        }
        String string = Settings.Secure.getString(getApplication().getContentResolver(), "android_id");
        this.mDeviceid = string;
        this.deviceIdType = TYPE_ANDROID;
        if (!this.enableDeviceIdHashMode || TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(this.mDeviceid)) {
                this.mDeviceid = UUID.randomUUID().toString();
                this.deviceIdType = TYPE_UUID;
            }
            return this.mDeviceid;
        }
        this.deviceIdType = TYPE_ANDROID_ID_MD5;
        String strMd5 = MD5.md5(this.mDeviceid);
        this.mDeviceid = strMd5;
        return strMd5;
    }

    public IDeviceInfoProvider getDeviceInfoProvider() {
        return this.mDeviceInfoProvider;
    }

    public String getDisplay() {
        return this.mDisplay;
    }

    public Config getHttpConfig() {
        return this.mConfig;
    }

    public ITokenStateChange getITokenStateChange() {
        return this.mITokenStateChange;
    }

    @SuppressLint({"WifiManagerLeak"})
    public String getLocalMacAddress() throws XimalayaException {
        if (TextUtils.isEmpty(this.mMac)) {
            this.mMac = ((WifiManager) getApplication().getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        if (TextUtils.isEmpty(this.mMac)) {
            throw new XimalayaException(1006, "get mac address error");
        }
        return this.mMac;
    }

    public String getManufacturer() {
        if (!TextUtils.isEmpty(this.mManufacturer)) {
            return this.mManufacturer;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                this.mManufacturer = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception unused) {
        }
        return this.mManufacturer;
    }

    public String getNetWorkType() {
        String name = NetworkType.getNetWorkType(this.mContext).getName();
        this.mNetWorkType = name;
        return name;
    }

    public String getPackId() throws XimalayaException {
        if (this.mAppid.equals("")) {
            try {
                this.mAppid = getApplication().getPackageManager().getApplicationInfo(getApplication().getPackageName(), 128).metaData.getString(DTransferConstants.PACKID);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new XimalayaException(600, "get packid error");
            }
        }
        return this.mAppid;
    }

    public String getPackageName() {
        if (this.mPackageName.equals("")) {
            this.mPackageName = this.mContext.getPackageName();
        }
        return this.mPackageName;
    }

    public String getSdkVersion() {
        return DTransferConstants.SDK_VERSION_VALUE;
    }

    public String getSigmobAppId() throws XimalayaException {
        if (TextUtils.isEmpty(this.mSigmobAppId)) {
            try {
                this.mSigmobAppId = String.valueOf(getApplication().getPackageManager().getApplicationInfo(getApplication().getPackageName(), 128).metaData.get(DTransferConstants.SIGMOB_APPID));
            } catch (XimalayaException e) {
                throw e;
            } catch (Exception e2) {
                Logger.e(e2);
                throw XimalayaException.getExceptionByCode(1005);
            }
        }
        if (TextUtils.isEmpty(this.mSigmobAppId)) {
            throw XimalayaException.getExceptionByCode(1005);
        }
        return this.mSigmobAppId;
    }

    public String getSigmobAppKey() throws XimalayaException {
        if (TextUtils.isEmpty(this.mSigmobAppKey)) {
            try {
                this.mSigmobAppKey = getApplication().getPackageManager().getApplicationInfo(getApplication().getPackageName(), 128).metaData.getString(DTransferConstants.SIGMOB_APPKEY);
            } catch (XimalayaException e) {
                throw e;
            } catch (Exception e2) {
                Logger.e(e2);
                throw XimalayaException.getExceptionByCode(1005);
            }
        }
        if (TextUtils.isEmpty(this.mSigmobAppKey)) {
            throw XimalayaException.getExceptionByCode(1005);
        }
        return this.mSigmobAppKey;
    }

    public String getSigmobRewardPlacementId() throws XimalayaException {
        if (TextUtils.isEmpty(this.mSigmobRewardPlacementId)) {
            try {
                this.mSigmobRewardPlacementId = getApplication().getPackageManager().getApplicationInfo(getApplication().getPackageName(), 128).metaData.getString(DTransferConstants.SIGMOB_REWARD_PLACEMENT_ID);
            } catch (XimalayaException e) {
                throw e;
            } catch (Exception e2) {
                Logger.e(e2);
                throw XimalayaException.getExceptionByCode(1005);
            }
        }
        if (TextUtils.isEmpty(this.mSigmobRewardPlacementId)) {
            throw XimalayaException.getExceptionByCode(1005);
        }
        return this.mSigmobRewardPlacementId;
    }

    public String getSimName() {
        if (TextUtils.isEmpty(this.mSimName)) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
                if (telephonyManager.getSimState() == 5) {
                    this.mSimName = telephonyManager.getSimOperatorName();
                } else {
                    this.mSimName = "未知";
                }
            } catch (Exception unused) {
            }
        }
        return this.mSimName;
    }

    public boolean getUseHttps() {
        return this.isUseHttps;
    }

    public void init(Context context, String str, boolean z, IDeviceInfoProvider iDeviceInfoProvider) {
        if (iDeviceInfoProvider == null) {
            throw new RuntimeException("CommonRequest初始化init方法传入DeviceInfoProvider不能为null");
        }
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mDeviceInfoProvider = iDeviceInfoProvider;
        Logger.init(applicationContext);
        this.mAppsecret = str;
        AccessTokenManager instanse = AccessTokenManager.getInstanse();
        instanse.setITokenStateChange(this.mITokenStateChange);
        instanse.init(context);
        if (XmPlayerConfig.getInstance(context).isUsePreventHijack()) {
            BaseCall.getInstanse().addInterceptor(HttpDNSUtilForOpenSDK.getHttpDNSInterceptor());
        }
        BaseCall.getInstanse().addInterceptor(new HttpSwtichInterceptor());
        BaseCall.getInstanse().addInterceptor(new LoggingInterceptor.Builder().loggable(z).setLevel(Level.BASIC).log(4).request(TAG).response(TAG).build());
        EncryptUtilForSDK.getInstance().init(this.mContext);
        XmSecretKeyUtil.getInstance().init(this.mContext);
    }

    public void onlySetHttpConfig(Config config) {
        this.mConfig = config;
    }

    public void onlyUpdateContext(Context context) {
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
    }

    public DataErrorCategory parseResponseHandler(BaseResponse baseResponse) {
        try {
            return (DataErrorCategory) new Gson().fromJson(baseResponse.getResponseBodyToString(), DataErrorCategory.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public void setDebugLevel(int i) {
        Logger.setDebugLevel(i);
    }

    public void setDefaultPagesize(int i) {
        if (sPagesize == i) {
            return;
        }
        sPagesize = i;
        XmPlayerManager.getInstance(this.mContext).setAutoLoadPageSizeInner(i);
    }

    public void setHttpConfig(Config config) {
        this.mConfig = config;
        BaseCall.getInstanse().setHttpConfig(this.mConfig);
        Context context = this.mContext;
        if (context != null) {
            String curProcessName = BaseUtil.getCurProcessName(context);
            if (TextUtils.isEmpty(curProcessName) || curProcessName.contains(":player")) {
                return;
            }
            XmPlayerManager.getInstance(this.mContext).setHttpConfig(this.mConfig);
        }
    }

    public void setITokenStateChange(ITokenStateChange iTokenStateChange) {
        if (iTokenStateChange == null) {
            this.mITokenStateChange = null;
            return;
        }
        this.mITokenStateChange = new ITokenStateChangeWrapper(iTokenStateChange);
        if (BaseUtil.isPlayerProcess(this.mContext)) {
            return;
        }
        XmPlayerManager.getInstance(this.mContext).setTokenInvalidForSDK(this.mITokenStateChange);
    }

    public void setPageSize(Map<String, String> map) {
        if (map.containsKey("count")) {
            return;
        }
        map.put("count", String.valueOf(getDefaultPagesize()));
    }

    public void setUseHttps(boolean z) {
        this.isUseHttps = z;
    }

    public void init(Context context, String str, IDeviceInfoProvider iDeviceInfoProvider) {
        init(context, str, false, iDeviceInfoProvider);
    }
}
