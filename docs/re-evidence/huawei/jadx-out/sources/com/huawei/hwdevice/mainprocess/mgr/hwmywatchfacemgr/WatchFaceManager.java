package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwdevice.api.IWatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceCloudService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.InstalledWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.ProgressCode;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.ProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.ProgressState;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.DeviceTypeInfoResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.PackageInfoResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.RecommendWatchFacesResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchAbility;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchFaceDetailResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.WatchFaceVersion;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.CompatibleDialStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceDto;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceIdReportInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceInfoResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceOperateInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceParamsResult;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.StickerWatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ProgressListener;
import com.huawei.networkclient.ResultCallback;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.watchface.WatchFaceType;
import defpackage.cqm;
import defpackage.ecu;
import defpackage.edl;
import defpackage.eep;
import defpackage.iov;
import defpackage.lvi;
import defpackage.mgg;
import defpackage.mgu;
import defpackage.njy;
import defpackage.peh;
import defpackage.pig;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class WatchFaceManager implements IWatchFaceManager {
    private static final String DEEP_LINK_PREFIX = "huaweihealth://huaweihealth.app/openwith?type=aar&address=";
    private static final String DETAIL_FROM_TAG = "dialDetail_ecoDial";
    private static final int DEVICE_REPORT_FILE_LIMITED = 140004;
    private static final int DEVICE_REPORT_NO_SPACE = 140009;
    private static final long FETCH_WATCHFACE_PREVIEW_TIME_OUT = 5000;
    private static final String IMAGE_PNG_BASE64_PREFIX = "data:image/png;base64,";
    private static final String TAG = "WatchFaceManager";
    private static final String TAG_RELEASE = "DEVMGR_WatchFaceManager";
    private static final String WATCHFACE_BETA_PATH = "/sandbox/cch5/health";
    private static final String WATCHFACE_CACHE_KEY_SPLIT = "_";
    private static final String WATCHFACE_DEFAULT_PATH = "/cch5/health";
    private static final String WATCHFACE_DEFAULT_SITE = "watchFace";
    public static final String WATCH_FACE_LOCAL_LIST_KEY_PREFIX = "watchFaceLocalList_";
    private static final String WATCH_FACE_NAME_KEY_PREFIX = "watchFaceName_";
    private static final String WATCH_FACE_PARAMS_KEY_PREFIX = "watchFaceParams_";
    private boolean isAlreadySetWatchFaceParams;
    private static final Set<String> existingDownloadTasks = new HashSet();
    private static final Set<Integer> SPECIAL_WATCH_FACE_TYPE_SET = Collections.unmodifiableSet(new HashSet<Integer>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.1
        private static final long serialVersionUID = -4145748043555378968L;

        {
            add(Integer.valueOf(WatchFaceType.VIDEO.value()));
            add(Integer.valueOf(WatchFaceType.ALBUM.value()));
            add(Integer.valueOf(WatchFaceType.KALEIDOSCOPE.value()));
            add(Integer.valueOf(WatchFaceType.WEAR.value()));
        }
    });

    private WatchFaceManager() {
        this.isAlreadySetWatchFaceParams = false;
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class SingletonHolder {
        private static final WatchFaceManager INSTANCE = new WatchFaceManager();

        private SingletonHolder() {
        }
    }

    public static WatchFaceManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void obtainDeviceWatchFace(String str, boolean z, final ResultCallback<List<InstalledWatchFace>> resultCallback) {
        final String string;
        LogUtil.a(TAG, "obtainDeviceWatchFace enter params: ", str);
        try {
            string = new JSONObject(str).getString("deviceId");
        } catch (JSONException e) {
            LogUtil.e(TAG, "obtainDeviceWatchFace JSONException, params: ", str);
            resultCallback.onFailure(e);
            string = "";
        }
        LogUtil.a(TAG, "obtainDeviceWatchFace getWatchFaceLocalList enter");
        getWatchFaceLocalList(str, z, new ResultCallback<List<WatchFaceDto>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.2
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(final List<WatchFaceDto> list) {
                LogUtil.a(WatchFaceManager.TAG, "obtainDeviceWatchFace getWatchFaceLocalList onSuccess");
                WatchFaceManager.this.getLocalWatchFaceRes(string, list, new ResultCallback<RecommendWatchFacesResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.2.1
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(RecommendWatchFacesResponse recommendWatchFacesResponse) {
                        LogUtil.a(WatchFaceManager.TAG, "obtainDeviceWatchFace getLocalWatchFaceRes onSuccess");
                        ArrayList arrayList = new ArrayList(16);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(WatchFaceManager.this.convertToInstalledWatchFace(recommendWatchFacesResponse, (WatchFaceDto) it.next()));
                        }
                        LogUtil.a(WatchFaceManager.TAG, "obtainDeviceWatchFace success");
                        resultCallback.onSuccess(arrayList);
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        resultCallback.onFailure(th);
                    }
                });
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InstalledWatchFace convertToInstalledWatchFace(RecommendWatchFacesResponse recommendWatchFacesResponse, WatchFaceDto watchFaceDto) {
        RecommendWatchFacesResponse.RecommendWatchFace next;
        InstalledWatchFace installedWatchFace = new InstalledWatchFace();
        installedWatchFace.setStatus(-1);
        installedWatchFace.setWatchFaceId(watchFaceDto.getWatchFaceId());
        installedWatchFace.setWatchFaceVersion(watchFaceDto.getWatchFaceVersion());
        installedWatchFace.setCurrent(watchFaceDto.isCurrent());
        installedWatchFace.setSupportDelete(watchFaceDto.isSupportDelete());
        installedWatchFace.setWatchFaceType(watchFaceDto.getWatchFaceType());
        installedWatchFace.setOnTrial(watchFaceDto.isOnTrial());
        installedWatchFace.setPreset(watchFaceDto.isPreset());
        Iterator<RecommendWatchFacesResponse.RecommendWatchFace> it = recommendWatchFacesResponse.getWatchFaces().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && Objects.equals(next.getWatchFaceId(), watchFaceDto.getWatchFaceId())) {
                break;
            }
        }
        if (next != null) {
            LogUtil.a(TAG, "responseWatchFaceMatched:", next.getName(), ",", next.getWatchFaceId(), ",jumpUrl:", next.getJumpUrl());
            installedWatchFace.setStatus(0);
            installedWatchFace.setWatchFaceName(next.getName());
            installedWatchFace.setLatestVersion(next.getLatestVersion());
            if (!SPECIAL_WATCH_FACE_TYPE_SET.contains(Integer.valueOf(installedWatchFace.getWatchFaceType())) && !TextUtils.isEmpty(next.getJumpUrl())) {
                installedWatchFace.setJumpUrl(handleJumpUrl(next.getJumpUrl()));
            }
            installedWatchFace.setIconPicture(next.getIconPicture());
        }
        return installedWatchFace;
    }

    private String handleJumpUrl(String str) {
        String str2 = String.format(Locale.ENGLISH, "%s&from=%s", str, DETAIL_FROM_TAG);
        if (!CommonUtil.ap() && !CommonUtil.ao()) {
            return str2;
        }
        String strReplace = str2.replace(WATCHFACE_DEFAULT_PATH, WATCHFACE_BETA_PATH);
        String strE = SharedPreferenceManager.e(BaseApplication.b(), "APP_WATCHFACE", "app_watchface_change_url");
        LogUtil.a(TAG, "handleJumpUrl watchFaceSite: ", strE);
        return !TextUtils.isEmpty(strE) ? strReplace.replace(WATCHFACE_DEFAULT_SITE, strE) : strReplace;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLocalWatchFaceRes(String str, final List<WatchFaceDto> list, final ResultCallback<RecommendWatchFacesResponse> resultCallback) {
        queryWatchAbility(str, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda14
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1422x4336987b(list, resultCallback, i, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getLocalWatchFaceRes$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceManager, reason: not valid java name */
    /* synthetic */ void m1422x4336987b(List list, final ResultCallback resultCallback, int i, final List list2) {
        final ArrayList arrayList = new ArrayList(16);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WatchFaceDto watchFaceDto = (WatchFaceDto) it.next();
            WatchFaceVersion watchFaceVersion = new WatchFaceVersion();
            watchFaceVersion.setVersion(watchFaceDto.getWatchFaceVersion());
            watchFaceVersion.setWatchFaceId(watchFaceDto.getWatchFaceId());
            arrayList.add(watchFaceVersion);
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.3
            @Override // java.lang.Runnable
            public void run() {
                WatchFaceManager.this.pageFetchRecommendedBriefs(arrayList, list2, resultCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pageFetchRecommendedBriefs(ArrayList<WatchFaceVersion> arrayList, List<WatchAbility> list, ResultCallback<RecommendWatchFacesResponse> resultCallback) {
        final CountDownLatch countDownLatch = new CountDownLatch((arrayList.size() / 15) + (arrayList.size() % 15 == 0 ? 0 : 1));
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 15;
            List<WatchFaceVersion> listSubList = arrayList.subList(i, Math.min(arrayList.size(), i2));
            WatchFaceCloudService.getInstance().fetchRecommendedBriefs(0, listSubList.size(), list, listSubList, new ResultCallback<RecommendWatchFacesResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.4
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(RecommendWatchFacesResponse recommendWatchFacesResponse) {
                    copyOnWriteArrayList.addAll(recommendWatchFacesResponse.getWatchFaces());
                    countDownLatch.countDown();
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.e(WatchFaceManager.TAG, "getLocalWatchFaceRes onFailure: ", th.getMessage());
                    countDownLatch.countDown();
                }
            });
            i = i2;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            LogUtil.e(TAG, "getLocalWatchFaceRes, interrupted while waiting for fetchRecommendedBriefs");
            resultCallback.onFailure(e);
        }
        RecommendWatchFacesResponse recommendWatchFacesResponse = new RecommendWatchFacesResponse();
        recommendWatchFacesResponse.setTotal(copyOnWriteArrayList.size());
        recommendWatchFacesResponse.setWatchFaces(copyOnWriteArrayList);
        recommendWatchFacesResponse.setResultCode(0);
        resultCallback.onSuccess(recommendWatchFacesResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLocalWatchFaceRes(String str, List<WatchFaceDto> list, int i, int i2, ResultCallback<RecommendWatchFacesResponse> resultCallback) {
        getLocalWatchFaceRes(str, list.subList(i, i2), resultCallback);
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void getWatchFaceLocalList(String str, boolean z, final ResultCallback<List<WatchFaceDto>> resultCallback) {
        String string;
        try {
            string = new JSONObject(str).getString("deviceId");
        } catch (JSONException e) {
            LogUtil.e(TAG, "getWatchFaceLocalList JSONException, params: ", str);
            resultCallback.onFailure(e);
            string = "";
        }
        getWearWatchInfoFromDevice(string, z, WATCH_FACE_LOCAL_LIST_KEY_PREFIX, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                WatchFaceManager.lambda$getWatchFaceLocalList$1(resultCallback, i, (List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$getWatchFaceLocalList$1(ResultCallback resultCallback, int i, List list) {
        if (i != 0) {
            resultCallback.onFailure(new Throwable("getWearWatchInfoFromDevice failed"));
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WatchFaceDto watchFaceDto = (WatchFaceDto) it.next();
            if (watchFaceDto.isCurrent()) {
                WatchFaceWearService.getInstance().setCurWatchFaceId(watchFaceDto.getWatchFaceId());
            }
        }
        resultCallback.onSuccess(list);
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void obtainWatchFaceDetail(String str, final ResultCallback<WatchFaceDetailResponse> resultCallback) {
        String string;
        String string2;
        String string3;
        String string4;
        LogUtil.a(TAG, "obtainWatchFaceDetail entry");
        String strOptString = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString("deviceType");
            try {
                string2 = jSONObject.getString("deviceId");
                try {
                    string3 = jSONObject.getString("watchFaceId");
                    try {
                        string4 = jSONObject.getString("watchFaceVersion");
                        try {
                            strOptString = jSONObject.optString(ParsedFieldTag.KAKA_TASK_SCENARIO, "0");
                        } catch (JSONException e) {
                            e = e;
                            LogUtil.e(TAG, "obtainDeviceWatchFace JSONException, params: ", str);
                            resultCallback.onFailure(e);
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        string4 = "";
                    }
                } catch (JSONException e3) {
                    e = e3;
                    string3 = "";
                    string4 = string3;
                    LogUtil.e(TAG, "obtainDeviceWatchFace JSONException, params: ", str);
                    resultCallback.onFailure(e);
                    final String str2 = strOptString;
                    final String str3 = string;
                    final String str4 = string3;
                    final String str5 = string4;
                    queryWatchAbility(string2, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda11
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i, Object obj) {
                            this.f$0.m1424x5e830472(str3, str4, str5, str2, resultCallback, i, (List) obj);
                        }
                    });
                }
            } catch (JSONException e4) {
                e = e4;
                string2 = "";
                string3 = "";
                string4 = string3;
                LogUtil.e(TAG, "obtainDeviceWatchFace JSONException, params: ", str);
                resultCallback.onFailure(e);
                final String str6 = strOptString;
                final String str7 = string;
                final String str8 = string3;
                final String str9 = string4;
                queryWatchAbility(string2, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda11
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        this.f$0.m1424x5e830472(str7, str8, str9, str6, resultCallback, i, (List) obj);
                    }
                });
            }
        } catch (JSONException e5) {
            e = e5;
            string = "";
        }
        final String str10 = strOptString;
        final String str11 = string;
        final String str12 = string3;
        final String str13 = string4;
        queryWatchAbility(string2, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda11
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1424x5e830472(str11, str12, str13, str10, resultCallback, i, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$obtainWatchFaceDetail$2$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceManager, reason: not valid java name */
    /* synthetic */ void m1424x5e830472(String str, String str2, String str3, String str4, final ResultCallback resultCallback, int i, List list) {
        WatchFaceCloudService.getInstance().fetchWatchFaceDetail(str, str2, list, str3, str4, new ResultCallback<WatchFaceDetailResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.5
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(WatchFaceDetailResponse watchFaceDetailResponse) {
                LogUtil.a(WatchFaceManager.TAG, "obtainWatchFaceDetail fetchWatchFaceDetail onSuccess");
                WatchFaceDetailResponse.WatchFaceDetail watchFace = watchFaceDetailResponse.getWatchFace();
                watchFace.setCoverPictureBase64(watchFace.getCoverPicture());
                watchFace.setAodPictureBase64(watchFace.getAodPicture());
                WatchFaceManager.this.setCoverAndAodPictureBase64(watchFace);
                resultCallback.onSuccess(watchFaceDetailResponse);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a(WatchFaceManager.TAG, "obtainWatchFaceDetail fetchWatchFaceDetail onFailure, errMsg: ", th.getMessage());
                resultCallback.onFailure(th);
            }
        });
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void installWatchFace(String str, String str2, String str3, int i, String str4) {
        dealFetchPackageInfo(str, str2, str3, i, str4);
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void applyWatchFace(String str, final ResponseCallback<Boolean> responseCallback) {
        final String string;
        String string2 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString("watchFaceId");
            try {
                string2 = jSONObject.getString("version");
            } catch (JSONException unused) {
                LogUtil.e(TAG, "applyWatchFace JSONException, params: ", str);
                responseCallback.onResponse(0, false);
            }
        } catch (JSONException unused2) {
            string = "";
        }
        WatchFaceWearService.getInstance().displayWatchFace(string, string2, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                WatchFaceManager.lambda$applyWatchFace$3(responseCallback, string, i, obj);
            }
        });
    }

    static /* synthetic */ void lambda$applyWatchFace$3(ResponseCallback responseCallback, String str, int i, Object obj) {
        if (!(obj instanceof WatchFaceOperateInfo)) {
            LogUtil.a(TAG, "applyWatchFace result is error");
            responseCallback.onResponse(i, false);
            return;
        }
        int errorCode = ((WatchFaceOperateInfo) obj).getErrorCode();
        boolean zIsSuccessErrorCode = WatchFaceWearService.getInstance().isSuccessErrorCode(errorCode);
        responseCallback.onResponse(i, Boolean.valueOf(zIsSuccessErrorCode));
        if (WatchFaceWearService.getInstance().isSignFailErrorCode(errorCode)) {
            mgu.e("m3", "9", str);
        } else if (zIsSuccessErrorCode) {
            mgu.e("m3", "ture", str);
        } else {
            mgu.e("m3", "5", str);
        }
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void cancelInstallingWatchFace(String str) {
        WatchFaceWearService.getInstance().cancelInstallingWatchFace();
    }

    private void dealFetchPackageInfo(final String str, String str2, String str3, final int i, String str4) {
        fetchPackageInfo(str, str2, str3, str4, new ResultCallback<PackageInfoResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.6
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(PackageInfoResponse packageInfoResponse) {
                PackageInfoResponse.PackageInfo packageInfo = packageInfoResponse.getPackageInfo();
                WatchFaceManager.this.dealDownloadEvent(packageInfo.getPackageUrl(), new File(BaseApplication.b().getFilesDir() + WatchFaceConstant.HWT_SAVE_PATH), str, packageInfo, i);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ResultCallback<ProgressResp> resultCallback = WatchFaceCallback.getsProgressRespCallback();
                if (resultCallback != null) {
                    resultCallback.onFailure(th);
                }
            }
        });
    }

    private void fetchPackageInfo(final String str, final String str2, String str3, final String str4, final ResultCallback<PackageInfoResponse> resultCallback) {
        queryWatchAbility(str3, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda2
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                WatchFaceCloudService.getInstance().fetchPackageInfo(str, str2, (List) obj, str4, resultCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealDownloadEvent(String str, final File file, final String str2, final PackageInfoResponse.PackageInfo packageInfo, final int i) {
        if (str2 != null && existingDownloadTasks.contains(str2)) {
            LogUtil.a(TAG, "dealDownloadEvent return for downloadTask exist.");
            return;
        }
        WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.DOWNLOAD, str2);
        existingDownloadTasks.add(str2);
        WatchFaceCloudService.getInstance().downloadPackage(str, file, new ProgressListener<File>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.7
            private int lastPercent = 0;

            @Override // com.huawei.networkclient.ProgressListener
            public void onFinish(File file2) {
                LogUtil.a(WatchFaceManager.TAG, "dealDownloadEvent onFinish");
                WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.DOWNLOAD_PER, str2, 100);
                WatchFaceManager.this.dealTransferEvent(str2, packageInfo.getVersion(), file, packageInfo, i);
                WatchFaceManager.existingDownloadTasks.remove(str2);
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                int i2 = (int) (((j * 1.0d) / j2) * 100.0d);
                if (i2 == this.lastPercent) {
                    return;
                }
                LogUtil.a(WatchFaceManager.TAG, "download file totalSize: ", Long.valueOf(j2), ", receiveSize: ", Long.valueOf(j), ", percent: ", Integer.valueOf(i2));
                this.lastPercent = i2;
                WatchFaceCallback.onCall(ProgressCode.SUCCESS, ProgressState.DOWNLOAD_PER, str2, Integer.valueOf(i2));
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                LogUtil.a(WatchFaceManager.TAG, "dealDownloadEvent onFail");
                WatchFaceManager.this.handleDownloadError(th.getMessage());
                WatchFaceManager.existingDownloadTasks.remove(str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealTransferEvent(String str, String str2, File file, PackageInfoResponse.PackageInfo packageInfo, int i) {
        WatchFaceWearService.getInstance().sendWatchFace(str, str2, file, str + "_" + str2, packageInfo, i, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda13
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f$0.m1420x169d1940(i2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$dealTransferEvent$5$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceManager, reason: not valid java name */
    /* synthetic */ void m1420x169d1940(int i, String str) {
        if (i != 0) {
            handleTransferError(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDownloadError(String str) {
        WatchFaceCallback.onCall(CommonUtil.ab(BaseApplication.b()) ? ProgressCode.DOWNLOAD_OTHER_FAILED : ProgressCode.DOWNLOAD_NETWORK_FAILED, str);
    }

    public void handleTransferError(int i, String str) {
        ProgressCode progressCode = ProgressCode.TRANSFER_OTHER_FAILED;
        if (!CommonUtil.ab(BaseApplication.b())) {
            progressCode = ProgressCode.DOWNLOAD_NETWORK_FAILED;
        }
        if (i == DEVICE_REPORT_FILE_LIMITED) {
            LogUtil.a(TAG, "onUpgradeFailed DEVICE_REPORT_FILE_LIMITED");
            progressCode = ProgressCode.FILE_LIMITED;
        } else if (i == DEVICE_REPORT_NO_SPACE) {
            LogUtil.a(TAG, "onUpgradeFailed DEVICE_REPORT_NO_SPACE");
            progressCode = ProgressCode.DEVICE_NO_SPACE;
        }
        LogUtil.a(TAG, "handleTransferError progressCode ", Integer.valueOf(progressCode.value()));
        WatchFaceCallback.onCall(progressCode, str);
    }

    public void deleteWatchFaces(List<WatchFaceVersion> list, ResponseCallback<List<WatchFaceVersion>> responseCallback) {
        final ArrayList arrayList = new ArrayList(16);
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        for (final WatchFaceVersion watchFaceVersion : list) {
            WatchFaceWearService.getInstance().deleteWatchFace(watchFaceVersion.getWatchFaceId(), watchFaceVersion.getVersion(), new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    WatchFaceManager.lambda$deleteWatchFaces$6(watchFaceVersion, arrayList, countDownLatch, i, obj);
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a(TAG, "obtainWatchFaceDetail, interrupted while waiting for deleteWatchFace");
            xjt.aq("deleteWatchFaces CountDownLatch await InterruptedException");
        }
        responseCallback.onResponse(0, arrayList);
    }

    static /* synthetic */ void lambda$deleteWatchFaces$6(WatchFaceVersion watchFaceVersion, List list, CountDownLatch countDownLatch, int i, Object obj) {
        WatchFaceVersion watchFaceVersion2 = new WatchFaceVersion();
        watchFaceVersion2.setWatchFaceId(watchFaceVersion.getWatchFaceId());
        watchFaceVersion2.setVersion(watchFaceVersion.getVersion());
        list.add(watchFaceVersion2);
        countDownLatch.countDown();
        if (i == 0) {
            mgu.e("m4", "ture", watchFaceVersion.getWatchFaceId());
        } else {
            mgu.e("m4", "8", watchFaceVersion.getWatchFaceId());
        }
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void deleteWatchFaces(String str, ResponseCallback<List<WatchFaceVersion>> responseCallback) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                WatchFaceVersion watchFaceVersion = new WatchFaceVersion();
                watchFaceVersion.setWatchFaceId(jSONObject.getString("watchFaceId"));
                watchFaceVersion.setVersion(jSONObject.getString("watchFaceVersion"));
                arrayList.add(watchFaceVersion);
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "deleteWatchFaces JSONException, params: ", str);
        }
        deleteWatchFaces(arrayList, responseCallback);
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void obtainOhEntryDefaultImg(String str, ResultCallback<String> resultCallback) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        String strBitmapToBase64Encode = "";
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG, "obtainOhEntryDefaultImg, deviceInfo is null");
            resultCallback.onSuccess("");
            return;
        }
        if (deviceInfo.getProductType() == 80) {
            resultCallback.onSuccess(WatchFaceUtil.bitmapToBase64Encode(BitmapFactory.decodeResource(BaseApplication.b().getResources(), R.drawable.watch_face_shell_saga)));
            return;
        }
        String strJ = lvi.j(deviceInfo.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            strJ = lvi.d(deviceInfo.getProductType());
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        String strE = eep.e(pluginInfoByUuid, 2, deviceInfo);
        LogUtil.a(TAG, "HomeImgNew name:", strE);
        if (new File(pig.c().e(pluginInfoByUuid.c()) + File.separator + pluginInfoByUuid.c() + File.separator + "img" + File.separator + strE + ".png").exists()) {
            Bitmap bitmapLoadImageByImageName = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, strE);
            if (bitmapLoadImageByImageName == null) {
                LogUtil.j(TAG, "deviceBitmapTemp is null");
                return;
            }
            strBitmapToBase64Encode = WatchFaceUtil.bitmapToBase64Encode(bitmapLoadImageByImageName);
        } else {
            LogUtil.e(TAG, "obtainOhEntryDefaultImg file not exists");
        }
        resultCallback.onSuccess(IMAGE_PNG_BASE64_PREFIX + strBitmapToBase64Encode);
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void registerIdReportCb(String str, ResponseCallback<WatchFaceIdReportInfo> responseCallback) {
        WatchFaceWearService.getInstance().registerIdReportCb(str, responseCallback);
    }

    public void unregisterIdReportCb(String str) {
        WatchFaceWearService.getInstance().unregisterIdReportCb(str);
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void jumpToThemePage(String str) {
        LogUtil.a(TAG, "jumpToThemePage enter params: ", str);
        try {
            String string = new JSONObject(str).getString("jumpUrl");
            if (TextUtils.isEmpty(string)) {
                LogUtil.j(TAG, "jumpToThemePage jumpUrl is empty");
            } else {
                startDeepLinkActivity(string);
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "obtainDeviceWatchFace JSONException, params: ", str);
        }
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void isSupportDualFrame(String str, final ResultCallback<Boolean> resultCallback) {
        WatchFaceCloudService.getInstance().fetchDeviceTypeInfo(str, new ResultCallback<DeviceTypeInfoResponse.DeviceTypeInfo>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.8
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(DeviceTypeInfoResponse.DeviceTypeInfo deviceTypeInfo) {
                resultCallback.onSuccess(Boolean.valueOf(deviceTypeInfo.isSupportDualFrame()));
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        });
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void queryWatchAbility(String str, final ResponseCallback<List<WatchAbility>> responseCallback) {
        LogUtil.a(TAG, "queryWatchAbility enter");
        getWearWatchInfoFromSp(str, WATCH_FACE_PARAMS_KEY_PREFIX, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda12
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1425x448ca9a2(responseCallback, i, (WatchFaceParamsResult) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$queryWatchAbility$7$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceManager, reason: not valid java name */
    /* synthetic */ void m1425x448ca9a2(ResponseCallback responseCallback, int i, WatchFaceParamsResult watchFaceParamsResult) {
        responseCallback.onResponse(0, convertParamsToAbility(watchFaceParamsResult));
    }

    public void queryWatchFaceCapability(String str, final ResponseCallback<List<Integer>> responseCallback) {
        LogUtil.a(TAG, "queryWatchFaceCapability enter");
        getWearWatchInfoFromNewSp(str, WATCH_FACE_PARAMS_KEY_PREFIX, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda6
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                WatchFaceManager.lambda$queryWatchFaceCapability$8(responseCallback, i, (WatchFaceParamsResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$queryWatchFaceCapability$8(ResponseCallback responseCallback, int i, WatchFaceParamsResult watchFaceParamsResult) {
        ArrayList arrayList = new ArrayList();
        if (watchFaceParamsResult == null || watchFaceParamsResult.getSupportWatchfaceCapability() == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "queryWatchFaceCapability watchFaceParams or getSupportWatchfaceCapability ", "is null, watchFaceParams:", peh.c(watchFaceParamsResult));
            responseCallback.onResponse(0, arrayList);
        } else {
            LogUtil.a(TAG, "queryWatchFaceCapability: ", watchFaceParamsResult.getSupportWatchfaceCapability());
            responseCallback.onResponse(0, watchFaceParamsResult.getSupportWatchfaceCapability());
        }
    }

    public void queryWatchFaceInfo(String str, String str2, final ResponseCallback<WatchFaceParamsResult> responseCallback) {
        LogUtil.a(TAG, "queryWatchFaceInfo enter");
        final String str3 = WATCH_FACE_PARAMS_KEY_PREFIX + str + str2;
        String strE = SharedPreferenceManager.e(str3);
        if (StringUtils.g(strE)) {
            LogUtil.a(TAG, "queryWatchFaceInfo query from device");
            WatchFaceWearService.getInstance().queryWatchFaceParams(new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda8
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    WatchFaceManager.lambda$queryWatchFaceInfo$9(responseCallback, str3, i, (WatchFaceParamsResult) obj);
                }
            });
        } else {
            LogUtil.a(TAG, "queryWatchFaceInfo query from sp");
            responseCallback.onResponse(0, (WatchFaceParamsResult) peh.b(strE, WatchFaceParamsResult.class));
        }
    }

    static /* synthetic */ void lambda$queryWatchFaceInfo$9(ResponseCallback responseCallback, String str, int i, WatchFaceParamsResult watchFaceParamsResult) {
        if (i != 0) {
            responseCallback.onResponse(-1, null);
        } else {
            SharedPreferenceManager.c(str, peh.c(watchFaceParamsResult));
            responseCallback.onResponse(i, watchFaceParamsResult);
        }
    }

    public void refreshWatchFaceInfo(String str, ResponseCallback<WatchFaceParamsResult> responseCallback) {
        LogUtil.a(TAG, "refreshWatchFaceInfo enter");
        getWearWatchInfoFromDevice(str, false, WATCH_FACE_PARAMS_KEY_PREFIX, responseCallback);
    }

    public void queryWatchFaceInfo(String str, final ResponseCallback<WatchFaceParamsResult> responseCallback) {
        getWearWatchInfoFromSp(str, WATCH_FACE_PARAMS_KEY_PREFIX, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda10
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                responseCallback.onResponse(0, (WatchFaceParamsResult) obj);
            }
        });
    }

    public List<WatchAbility> convertParamsToAbility(WatchFaceParamsResult watchFaceParamsResult) {
        ArrayList arrayList = new ArrayList(16);
        if (watchFaceParamsResult == null) {
            ReleaseLogUtil.e(TAG, "convertParamsToAbility failed for watchFaceParams is null");
            return arrayList;
        }
        convertMainAbility(watchFaceParamsResult, arrayList);
        convertCompatibleAbility(watchFaceParamsResult, arrayList);
        LogUtil.a(TAG, "queryWatchAbility result: ", arrayList.toString());
        return arrayList;
    }

    private void convertMainAbility(WatchFaceParamsResult watchFaceParamsResult, List<WatchAbility> list) {
        String str = watchFaceParamsResult.getScreenWidth() + "*" + watchFaceParamsResult.getScreenHeight();
        List<String> listAsciiNumToStringList = WatchFaceUtil.asciiNumToStringList(watchFaceParamsResult.getMaxFirmware());
        List<String> listAsciiNumToStringList2 = WatchFaceUtil.asciiNumToStringList(watchFaceParamsResult.getSupportEarlyFirmwareVersion());
        convertAbility(str, listAsciiNumToStringList, list);
        convertAbility(str, listAsciiNumToStringList2, list);
    }

    private void convertCompatibleAbility(WatchFaceParamsResult watchFaceParamsResult, List<WatchAbility> list) {
        if (njy.e(watchFaceParamsResult.getCompatibleDialList())) {
            return;
        }
        for (CompatibleDialStruct compatibleDialStruct : watchFaceParamsResult.getCompatibleDialList()) {
            convertAbility(compatibleDialStruct.getDialWidth() + "*" + compatibleDialStruct.getDialHeight(), new ArrayList(Arrays.asList(compatibleDialStruct.getSupportVersion().split(","))), list);
        }
    }

    private void convertAbility(String str, List<String> list, List<WatchAbility> list2) {
        WatchAbility next;
        if (!WatchFaceConstant.SCREE_MAP.containsKey(str)) {
            LogUtil.j(TAG, "queryWatchAbility, invalid screenKey: ", str);
            return;
        }
        if (njy.e(list)) {
            LogUtil.j(TAG, "empty supportVersions");
            return;
        }
        Iterator<WatchAbility> it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Objects.equals(next.getScreenCode(), WatchFaceConstant.SCREE_MAP.get(str)));
        if (next != null) {
            next.getAbilityVersions().addAll(list);
            next.setAbilityVersions((List) next.getAbilityVersions().stream().distinct().collect(Collectors.toList()));
        } else {
            WatchAbility watchAbility = new WatchAbility();
            watchAbility.setScreenCode(WatchFaceConstant.SCREE_MAP.get(str));
            watchAbility.setAbilityVersions((List) list.stream().distinct().collect(Collectors.toList()));
            list2.add(watchAbility);
        }
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void getRecommendedWatchFaceBriefs(String str, String str2, int i, int i2, ResultCallback<RecommendWatchFacesResponse> resultCallback) {
        WatchFaceCloudService.getInstance().updateDeviceInfo(str, str2);
        getCurWatchFaceRes(str, i2, resultCallback);
    }

    private void getCurWatchFaceRes(final String str, int i, final ResultCallback<RecommendWatchFacesResponse> resultCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceId", str);
        } catch (JSONException e) {
            LogUtil.e(TAG, "getRecommendedWatchFaceBriefs JSONException");
            resultCallback.onFailure(e);
        }
        getWatchFaceLocalList(jSONObject.toString(), false, new ResultCallback<List<WatchFaceDto>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.9
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(List<WatchFaceDto> list) {
                WatchFaceManager.this.getLocalWatchFaceRes(str, list, 0, 1, new ResultCallback<RecommendWatchFacesResponse>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.9.1
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(RecommendWatchFacesResponse recommendWatchFacesResponse) {
                        WatchFaceManager.this.buildRecommendResponse(recommendWatchFacesResponse, resultCallback);
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        resultCallback.onFailure(th);
                    }
                });
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void buildRecommendResponse(RecommendWatchFacesResponse recommendWatchFacesResponse, ResultCallback<RecommendWatchFacesResponse> resultCallback) {
        RecommendWatchFacesResponse recommendWatchFacesResponse2 = new RecommendWatchFacesResponse();
        recommendWatchFacesResponse2.setResultCode(0);
        recommendWatchFacesResponse2.setWatchFaces(new ArrayList(16));
        if (recommendWatchFacesResponse != null) {
            recommendWatchFacesResponse2.getWatchFaces().addAll(recommendWatchFacesResponse.getWatchFaces());
        }
        recommendWatchFacesResponse2.setTotal(recommendWatchFacesResponse2.getWatchFaces().size());
        LogUtil.a(TAG, "getRecommendedWatchFaceBriefs finished, watchFaces size: ", Integer.valueOf(recommendWatchFacesResponse2.getWatchFaces().size()));
        resultCallback.onSuccess(recommendWatchFacesResponse2);
    }

    @Override // com.huawei.hwdevice.api.IWatchFaceManager
    public void obtainPreviewCardImage(String str, String str2, String str3, final ResultCallback<Bitmap> resultCallback) {
        WatchFaceCloudService.getInstance().fetchPreviewSource(WatchFaceConstant.ICON_PICTURE_HASH_KEY.replace("{watchFaceId}", str).replace("{watchFaceVersion}", str2), str3, new ResultCallback<byte[]>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.10
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(byte[] bArr) {
                resultCallback.onSuccess(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        });
    }

    public String getWatchFacePath(int i) {
        if (i == 0) {
            return StickerWatchFaceManager.getInstance().getDIYStickerWatchFacePath();
        }
        if (i == 1) {
            return StickerWatchFaceManager.getInstance().getPresetStickerWatchFacePath();
        }
        LogUtil.j(TAG, "getWatchFacePath unsupported feature type");
        return "";
    }

    private <T> void getWearWatchInfoFromNewSp(String str, String str2, ResponseCallback<T> responseCallback) {
        DeviceInfo deviceInfoC = mgg.c(str, TAG);
        if (!this.isAlreadySetWatchFaceParams && deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWearWatchInfoFromNewSp isAlreadySetWatchFaceParams is false");
            fetchWearWatchInfoFromDevice(str, str2, responseCallback);
        } else {
            getWearWatchInfoFromSp(str, str2, responseCallback);
        }
    }

    private <T> void getWearWatchInfoFromSp(final String str, final String str2, final ResponseCallback<T> responseCallback) {
        fetchWearWatchInfoFromSp(str, str2, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda7
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1423x194a2181(str, str2, responseCallback, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getWearWatchInfoFromSp$11$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceManager, reason: not valid java name */
    /* synthetic */ void m1423x194a2181(String str, String str2, ResponseCallback responseCallback, int i, Object obj) {
        LogUtil.a(TAG, "getWearWatchInfoFromSp status: ", Integer.valueOf(i));
        if (i != 0) {
            fetchWearWatchInfoFromDevice(str, str2, responseCallback);
        } else {
            responseCallback.onResponse(i, obj);
        }
    }

    public void getCurWatchFaceInfo(String str, final ResponseCallback<WatchFaceDto> responseCallback) {
        getWearWatchInfoFromDevice(str, false, WATCH_FACE_LOCAL_LIST_KEY_PREFIX, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda3
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                WatchFaceManager.lambda$getCurWatchFaceInfo$12(responseCallback, i, (List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$getCurWatchFaceInfo$12(ResponseCallback responseCallback, int i, List list) {
        if (i != 0) {
            responseCallback.onResponse(-1, null);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WatchFaceDto watchFaceDto = (WatchFaceDto) it.next();
            if (watchFaceDto.isCurrent()) {
                WatchFaceWearService.getInstance().setCurWatchFaceId(watchFaceDto.getWatchFaceId());
                responseCallback.onResponse(0, watchFaceDto);
                return;
            }
        }
        responseCallback.onResponse(-1, null);
    }

    public <T> void getWearWatchInfoFromDevice(String str, boolean z, String str2, ResponseCallback<T> responseCallback) {
        getWearWatchInfoFromDevice(str, z, str2, null, responseCallback);
    }

    private <T> void getWearWatchInfoFromDevice(String str, boolean z, String str2, Object obj, ResponseCallback<T> responseCallback) {
        DeviceInfo deviceInfoC = mgg.c(str, TAG);
        if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
            fetchWearWatchInfoFromDevice(str, z, str2, obj, responseCallback);
        } else {
            fetchWearWatchInfoFromSp(str, str2, responseCallback);
        }
    }

    private <T> void fetchWearWatchInfoFromDevice(String str, String str2, ResponseCallback<T> responseCallback) {
        fetchWearWatchInfoFromDevice(str, false, str2, null, responseCallback);
    }

    private <T> void fetchWearWatchInfoFromDevice(final String str, final boolean z, final String str2, Object obj, final ResponseCallback<T> responseCallback) {
        final String strGenerateCacheKey = generateCacheKey(str, str2);
        byte b2 = -1;
        if (StringUtils.g(strGenerateCacheKey)) {
            LogUtil.a(TAG, "fetchWearWatchInfoFromDevice get cacheKey error");
            responseCallback.onResponse(-1, null);
            return;
        }
        ResponseCallback<WatchFaceInfoResponse> responseCallback2 = new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda5
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj2) {
                this.f$0.m1421x745e024e(responseCallback, z, str, strGenerateCacheKey, str2, i, obj2);
            }
        };
        str2.hashCode();
        int iHashCode = str2.hashCode();
        if (iHashCode != -1184377144) {
            if (iHashCode != -55764030) {
                if (iHashCode == 1759420973 && str2.equals(WATCH_FACE_PARAMS_KEY_PREFIX)) {
                    b2 = 2;
                }
            } else if (str2.equals(WATCH_FACE_LOCAL_LIST_KEY_PREFIX)) {
                b2 = 1;
            }
        } else if (str2.equals(WATCH_FACE_NAME_KEY_PREFIX)) {
            b2 = 0;
        }
        if (b2 == 0) {
            WatchFaceWearService.getInstance().obtainWatchFaceInfo((List) obj, responseCallback2);
            return;
        }
        if (b2 == 1) {
            WatchFaceWearService.getInstance().queryWatchFaceInfoList(z, responseCallback2);
        } else if (b2 == 2) {
            WatchFaceWearService.getInstance().queryWatchFaceParams(responseCallback2);
        } else {
            LogUtil.e(TAG, "fetchWearWatchInfoFromDevice, invalid cacheKeyPrefix");
        }
    }

    /* JADX INFO: renamed from: lambda$fetchWearWatchInfoFromDevice$13$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-WatchFaceManager, reason: not valid java name */
    /* synthetic */ void m1421x745e024e(ResponseCallback responseCallback, boolean z, String str, String str2, String str3, int i, Object obj) {
        DeviceInfo deviceInfo;
        if (i != 0) {
            responseCallback.onResponse(-1, null);
            return;
        }
        if (z && ((deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG)) == null || !str.equals(deviceInfo.getDeviceIdentify()))) {
            responseCallback.onResponse(-1, null);
            return;
        }
        SharedPreferenceManager.c(str2, peh.c(obj));
        LogUtil.a(TAG, "fetchWearWatchInfoFromDevice deviceId: ", CommonUtil.n(str), ", cacheKeyPrefix: ", str3, ", setMyWatchFaceString: ", peh.c(obj));
        if (Objects.equals(str3, WATCH_FACE_PARAMS_KEY_PREFIX)) {
            this.isAlreadySetWatchFaceParams = true;
            LogUtil.a(TAG, "fetchWearWatchInfoFromDevice isAlreadySetWatchFaceParams is true");
        }
        responseCallback.onResponse(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void fetchWearWatchInfoFromSp(String str, String str2, ResponseCallback<T> responseCallback) {
        String strGenerateCacheKey = generateCacheKey(str, str2);
        byte b2 = -1;
        Object objB = null;
        if (StringUtils.g(strGenerateCacheKey)) {
            LogUtil.a(TAG, "fetchWearWatchInfoFromDevice get cacheKey error");
            responseCallback.onResponse(-1, null);
            return;
        }
        String strE = SharedPreferenceManager.e(strGenerateCacheKey);
        if (StringUtils.g(strE)) {
            responseCallback.onResponse(-1, null);
            return;
        }
        str2.hashCode();
        int iHashCode = str2.hashCode();
        if (iHashCode != -1184377144) {
            if (iHashCode != -55764030) {
                if (iHashCode == 1759420973 && str2.equals(WATCH_FACE_PARAMS_KEY_PREFIX)) {
                    b2 = 2;
                }
            } else if (str2.equals(WATCH_FACE_LOCAL_LIST_KEY_PREFIX)) {
                b2 = 1;
            }
        } else if (str2.equals(WATCH_FACE_NAME_KEY_PREFIX)) {
            b2 = 0;
        }
        if (b2 == 0) {
            objB = peh.b(strE, WatchFaceInfoResponse.class);
        } else if (b2 == 1) {
            objB = peh.c(strE, WatchFaceDto[].class);
        } else if (b2 == 2) {
            objB = peh.b(strE, WatchFaceParamsResult.class);
        } else {
            LogUtil.e(TAG, "fetchWearWatchInfoFromDevice, invalid cacheKeyPrefix");
        }
        responseCallback.onResponse(0, objB);
    }

    private void urlToBase64(String str, String str2, String str3, String str4, final ResultCallback<String> resultCallback) {
        WatchFaceCloudService.getInstance().fetchPreviewSource(str2.replace("{watchFaceId}", str3).replace("{watchFaceVersion}", str4), str, new ResultCallback<byte[]>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.11
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(byte[] bArr) {
                String strEncodeToString = Base64.getEncoder().encodeToString(bArr);
                resultCallback.onSuccess(WatchFaceManager.IMAGE_PNG_BASE64_PREFIX + strEncodeToString);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
            }
        });
    }

    private void setNameFromDevice(String str, final List<InstalledWatchFace> list, final CountDownLatch countDownLatch) {
        ArrayList arrayList = new ArrayList(16);
        for (InstalledWatchFace installedWatchFace : list) {
            if (TextUtils.isEmpty(installedWatchFace.getWatchFaceName())) {
                arrayList.add(installedWatchFace.getWatchFaceId());
            }
        }
        if (njy.e(arrayList)) {
            countDownLatch.countDown();
        } else {
            getWearWatchInfoFromDevice(str, false, WATCH_FACE_NAME_KEY_PREFIX, arrayList, new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager$$ExternalSyntheticLambda1
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    WatchFaceManager.lambda$setNameFromDevice$14(countDownLatch, list, i, (WatchFaceInfoResponse) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$setNameFromDevice$14(CountDownLatch countDownLatch, List list, int i, WatchFaceInfoResponse watchFaceInfoResponse) {
        if (watchFaceInfoResponse == null) {
            countDownLatch.countDown();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InstalledWatchFace installedWatchFace = (InstalledWatchFace) it.next();
            for (WatchFaceInfoResponse.WatchFaceInfoStruct watchFaceInfoStruct : watchFaceInfoResponse.getWatchFaceList()) {
                if (watchFaceInfoStruct != null && Objects.equals(installedWatchFace.getWatchFaceId(), WatchFaceUtil.asciiNumToString(watchFaceInfoStruct.getWatchFaceId()))) {
                    installedWatchFace.setWatchFaceName(WatchFaceUtil.hexListToName(watchFaceInfoStruct.getWatchFaceName()));
                    installedWatchFace.setStatus(0);
                }
            }
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverAndAodPictureBase64(final WatchFaceDetailResponse.WatchFaceDetail watchFaceDetail) {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        urlToBase64(watchFaceDetail.getCoverPicture(), WatchFaceConstant.COVER_PICTURE_HASH_KEY, watchFaceDetail.getWatchFaceId(), watchFaceDetail.getVersion(), new ResultCallback<String>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.12
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str) {
                LogUtil.a(WatchFaceManager.TAG, "obtainWatchFaceDetail urlToBase64 getCoverPicture onSuccess");
                watchFaceDetail.setCoverPictureBase64(str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a(WatchFaceManager.TAG, "obtainWatchFaceDetail urlToBase64 getCoverPicture onFailure, errMsg: ", th.getMessage());
                countDownLatch.countDown();
            }
        });
        urlToBase64(watchFaceDetail.getAodPicture(), WatchFaceConstant.AOD_PICTURE_HASH_KEY, watchFaceDetail.getWatchFaceId(), watchFaceDetail.getVersion(), new ResultCallback<String>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager.13
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(String str) {
                LogUtil.a(WatchFaceManager.TAG, "obtainWatchFaceDetail urlToBase64 getAodPicture onSuccess");
                watchFaceDetail.setAodPictureBase64(str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a(WatchFaceManager.TAG, "obtainWatchFaceDetail urlToBase64 getAodPicture onFailure, errMsg: ", th.getMessage());
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            LogUtil.e(TAG, "obtainWatchFaceDetail, interrupted while waiting for urlToBase64: ", e.getMessage());
            xjt.aq("obtainWatchFaceDetail urlToBase64 countDownLatch await InterruptedException");
        }
    }

    public boolean startDeepLinkActivity(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "startDeepLinkActivity url is empty");
            return false;
        }
        LogUtil.a(TAG, "startDeepLinkActivity url: ", str);
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
        intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        iov.d(BaseApplication.b(), intent);
        return true;
    }

    private String generateCacheKey(String str, String str2) {
        DeviceInfo deviceInfoC = mgg.c(str, TAG);
        if (deviceInfoC == null) {
            LogUtil.e(TAG, "generateCacheKey deviceInfo is null");
            return null;
        }
        return cqm.c(String.join("_", str2, str, deviceInfoC.getSoftVersion(), String.valueOf(deviceInfoC.getPowerSaveModel())));
    }
}
