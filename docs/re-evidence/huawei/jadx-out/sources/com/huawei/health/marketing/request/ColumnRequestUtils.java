package com.huawei.health.marketing.request;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.lqb;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ColumnRequestUtils {
    private static final String BROWSE_URL_SUFFIX = "Anon";
    private static final String KEY_MENU = "MarketingFunctionMenu";
    public static final int RESULT_CODE_SUCCESS = 0;
    private static final String TAG = "ColumnRequestUtils";

    public static void reportInfoReadNumber(final int i) {
        if (i <= 0) {
            LogUtil.j(TAG, "reportInfoReadNumber() informationId is empty.");
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.request.ColumnRequestUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    ColumnRequestUtils.reportInfoReadNumber(i);
                }
            });
            return;
        }
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("messageCenterUrl");
        if (TextUtils.isEmpty(url)) {
            LogUtil.j(TAG, "reportInfoReadNumber() sMessageCenterDomainUrl is empty.");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AutoCloseable autoCloseable = null;
        try {
            try {
                jSONObject.put("id", i);
                jSONObject.put("appType", 1);
                jSONObject.put("ts", System.currentTimeMillis());
                Response responseB = lqb.b(url + "/messageCenter/information/readCountPlusOne", jSONObject);
                if (responseB == null) {
                    LogUtil.j(TAG, "response is null in reportInfoReadNumber.");
                    if (responseB != null) {
                        try {
                            responseB.close();
                            return;
                        } catch (IOException e) {
                            LogUtil.e(TAG, "IOException: ", e);
                            return;
                        }
                    }
                    return;
                }
                int code = responseB.getCode();
                if (code != 200 || responseB.getBody() == null) {
                    LogUtil.j(TAG, "getRequestResult responseCode = ", Integer.valueOf(code));
                } else {
                    LogUtil.a(TAG, "getRequestResult success");
                }
                if (responseB != null) {
                    try {
                        responseB.close();
                    } catch (IOException e2) {
                        LogUtil.e(TAG, "IOException: ", e2);
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        autoCloseable.close();
                    } catch (IOException e3) {
                        LogUtil.e(TAG, "IOException: ", e3);
                    }
                }
                throw th;
            }
        } catch (IOException | JSONException unused) {
            LogUtil.e(TAG, "reportInfoReadNumber meet json exception or ioexception.");
            if (0 != 0) {
                try {
                    autoCloseable.close();
                } catch (IOException e4) {
                    LogUtil.e(TAG, "IOException: ", e4);
                }
            }
        }
    }

    public static void updateFavoriteData(final List<CustomConfigValue> list) {
        SetCustomConfigReq setCustomConfigReq = new SetCustomConfigReq();
        CustomConfigInfo customConfigInfo = new CustomConfigInfo();
        String strC = ofe.c(list);
        LogUtil.d(TAG, "updateFavoriteData Str: ", strC);
        customConfigInfo.setContent(strC);
        setCustomConfigReq.setCustomConfig(customConfigInfo);
        SetCustomConfigApi setCustomConfigApi = (SetCustomConfigApi) oet.d().e(SetCustomConfigApi.class);
        CustomConfigFactory customConfigFactory = new CustomConfigFactory(BaseApplication.getContext());
        setCustomConfigApi.setCustomConfig(setCustomConfigReq.getUrl(), customConfigFactory.getHeaders(), ofe.c(customConfigFactory.getBody(setCustomConfigReq))).enqueue(new ResultCallback<RespSetCustomConfig>() { // from class: com.huawei.health.marketing.request.ColumnRequestUtils.2
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(com.huawei.hms.framework.network.restclient.Response<RespSetCustomConfig> response) {
                if (response.isOK()) {
                    RespSetCustomConfig body = response.getBody();
                    if (body == null) {
                        LogUtil.j(ColumnRequestUtils.TAG, "updateFavoriteData result is null");
                        return;
                    }
                    String strC2 = ofe.c(body);
                    ColumnProvider.getInstance(BaseApplication.getContext()).setFavoriteList(list);
                    LogUtil.a(ColumnRequestUtils.TAG, "updateFavoriteData result: ", strC2);
                }
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j(ColumnRequestUtils.TAG, "updateFavoriteData response is error.");
            }
        });
    }

    public static void getFavoriteData(final IFavoriteCallBack iFavoriteCallBack) {
        final ArrayList arrayList = new ArrayList(10);
        GetCustomConfigReq getCustomConfigReq = new GetCustomConfigReq();
        ArrayList<String> arrayList2 = new ArrayList<>(10);
        arrayList2.add(KEY_MENU);
        getCustomConfigReq.setCustomConfig(arrayList2);
        GetCustomConfigApi getCustomConfigApi = (GetCustomConfigApi) oet.d().e(GetCustomConfigApi.class);
        CustomConfigFactory customConfigFactory = new CustomConfigFactory(BaseApplication.getContext());
        getCustomConfigApi.getCustomConfig(getCustomConfigReq.getUrl(), customConfigFactory.getHeaders(), ofe.c(customConfigFactory.getBody(getCustomConfigReq))).enqueue(new ResultCallback<RespGetCustomConfig>() { // from class: com.huawei.health.marketing.request.ColumnRequestUtils.3
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(com.huawei.hms.framework.network.restclient.Response<RespGetCustomConfig> response) {
                if (response.isOK()) {
                    RespGetCustomConfig body = response.getBody();
                    if (body == null) {
                        LogUtil.j(ColumnRequestUtils.TAG, "getFavorite result is null");
                        IFavoriteCallBack iFavoriteCallBack2 = iFavoriteCallBack;
                        if (iFavoriteCallBack2 != null) {
                            iFavoriteCallBack2.onResult(arrayList);
                            return;
                        }
                        return;
                    }
                    if (body.getResultCode() != 0) {
                        LogUtil.j(ColumnRequestUtils.TAG, "getFavorite result is error.");
                        IFavoriteCallBack iFavoriteCallBack3 = iFavoriteCallBack;
                        if (iFavoriteCallBack3 != null) {
                            iFavoriteCallBack3.onResult(arrayList);
                        }
                    }
                    CustomConfigInfo customConfig = body.getCustomConfig();
                    LogUtil.d(ColumnRequestUtils.TAG, "getFavorite result: ", customConfig.getContent());
                    try {
                        List<CustomConfigValue> list = (List) new Gson().fromJson(customConfig.getContent(), new TypeToken<List<CustomConfigValue>>() { // from class: com.huawei.health.marketing.request.ColumnRequestUtils.3.1
                        }.getType());
                        ColumnProvider.getInstance(BaseApplication.getContext()).setFavoriteList(list);
                        IFavoriteCallBack iFavoriteCallBack4 = iFavoriteCallBack;
                        if (iFavoriteCallBack4 != null) {
                            iFavoriteCallBack4.onResult(list);
                        }
                    } catch (JsonSyntaxException unused) {
                        LogUtil.j(ColumnRequestUtils.TAG, "getFavorite Exception.");
                        IFavoriteCallBack iFavoriteCallBack5 = iFavoriteCallBack;
                        if (iFavoriteCallBack5 != null) {
                            iFavoriteCallBack5.onResult(arrayList);
                        }
                    }
                }
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                IFavoriteCallBack iFavoriteCallBack2 = iFavoriteCallBack;
                if (iFavoriteCallBack2 != null) {
                    iFavoriteCallBack2.onResult(arrayList);
                }
            }
        });
    }

    public static List<SingleGridContent> getFunctionMenuFinallyData(List<SingleGridContent> list, List<CustomConfigValue> list2) {
        ArrayList arrayList = new ArrayList(10);
        final ArrayList arrayList2 = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j(TAG, "setData() singleGridContents is null.");
            return arrayList;
        }
        if (njy.b(list2)) {
            for (SingleGridContent singleGridContent : list) {
                if (TextUtils.isEmpty(singleGridContent.getItemId())) {
                    break;
                }
                for (CustomConfigValue customConfigValue : list2) {
                    if (!TextUtils.isEmpty(customConfigValue.getId()) && TextUtils.equals(singleGridContent.getItemId(), customConfigValue.getId())) {
                        singleGridContent.setFavoriteTime(customConfigValue.getFavoriteTime());
                        arrayList.add(singleGridContent);
                        arrayList2.add(customConfigValue);
                        break;
                    }
                }
            }
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.request.ColumnRequestUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ColumnRequestUtils.updateFavoriteData(arrayList2);
            }
        });
        if (njy.e(arrayList)) {
            return list;
        }
        Collections.sort(arrayList, new Comparator<SingleGridContent>() { // from class: com.huawei.health.marketing.request.ColumnRequestUtils.4
            @Override // java.util.Comparator
            public int compare(SingleGridContent singleGridContent2, SingleGridContent singleGridContent3) {
                return Long.compare(singleGridContent3.getFavoriteTime(), singleGridContent2.getFavoriteTime());
            }
        });
        ArrayList arrayList3 = new ArrayList(10);
        for (SingleGridContent singleGridContent2 : list) {
            if (TextUtils.isEmpty(singleGridContent2.getItemId())) {
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    SingleGridContent singleGridContent3 = (SingleGridContent) it.next();
                    if (!TextUtils.isEmpty(singleGridContent3.getItemId()) && TextUtils.equals(singleGridContent2.getItemId(), singleGridContent3.getItemId())) {
                        break;
                    }
                } else {
                    arrayList3.add(singleGridContent2);
                    break;
                }
            }
        }
        if (njy.b(arrayList3)) {
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public static String getUrlSuffix() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            return BROWSE_URL_SUFFIX;
        }
        return "";
    }

    public static List<InformationInfo> requestInformationInfo(String str) {
        ArrayList arrayList = new ArrayList(10);
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        InformationInfoReq informationInfoReq = new InformationInfoReq();
        informationInfoReq.setIds(str);
        informationInfoReq.setPageNo("1");
        informationInfoReq.setPageSize("100");
        InformationInfoApi informationInfoApi = (InformationInfoApi) oet.d().e(InformationInfoApi.class);
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        try {
            com.huawei.hms.framework.network.restclient.Response<RespInformationInfo> responseExecute = informationInfoApi.getInformationInfoList(informationInfoReq.getUrl(), activityInfoListFactory.getHeaders(), ofe.c(activityInfoListFactory.getBody(informationInfoReq))).execute();
            if (!responseExecute.isOK()) {
                ReleaseLogUtil.e(TAG, "requestInformationInfo failed, response is not ok");
                return arrayList;
            }
            RespInformationInfo body = responseExecute.getBody();
            if (body == null) {
                LogUtil.j(TAG, "requestInformationInfo failed, response is null");
                return arrayList;
            }
            if (body.getResultCode() != 0) {
                LogUtil.j(TAG, "requestInformationInfo failed, resultCode error: " + body.getResultCode());
                return arrayList;
            }
            if (njy.e(body.getInformations())) {
                LogUtil.j(TAG, "requestInformationInfo failed, response body is null");
                return arrayList;
            }
            List<InformationInfo> informations = body.getInformations();
            LogUtil.a(TAG, "requestInformationInfo success, info list size: " + informations.size());
            return informations;
        } catch (IOException unused) {
            LogUtil.j(TAG, "requestInformationInfo exception.");
            return arrayList;
        }
    }

    public static List<ActivityIdInfo> requestActivityInfo(Context context, int i, List<String> list) {
        ArrayList arrayList = new ArrayList(10);
        ActivityInfoReq activityInfoReq = new ActivityInfoReq();
        activityInfoReq.setActivityIdList(list);
        ActivityInfoApi activityInfoApi = (ActivityInfoApi) oet.d().e(ActivityInfoApi.class);
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        try {
            com.huawei.hms.framework.network.restclient.Response<RespActivityList> responseExecute = activityInfoApi.getActivityInfoList(activityInfoReq.getUrl(), activityInfoListFactory.getHeaders(), ofe.c(activityInfoListFactory.getBody(activityInfoReq))).execute();
            if (responseExecute.isOK()) {
                LogUtil.a(TAG, "requestActivityInfo response is OK.");
                RespActivityList body = responseExecute.getBody();
                if (body == null) {
                    LogUtil.j(TAG, "requestActivityInfo result is null");
                    return arrayList;
                }
                if (body.getResultCode() == 0 && !njy.e(body.getPageActivityList())) {
                    SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_ICE), "marketingServerCurrentTime" + i, body.getCurrentTime(), new StorageParams());
                    return body.getPageActivityList();
                }
                LogUtil.j(TAG, "requestActivityInfo result is error.");
            }
            return arrayList;
        } catch (IOException unused) {
            LogUtil.j(TAG, "requestActivityInfo exception.");
            return arrayList;
        }
    }

    public static void submitAnswer(QuestionOptionReq questionOptionReq, com.huawei.networkclient.ResultCallback<QuestionResultRsp> resultCallback) {
        if (questionOptionReq == null) {
            LogUtil.j(TAG, "submitAnswer questionOptionReq is null.");
            return;
        }
        LogUtil.a(TAG, "submitAnswer enter");
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        oet.d().c(questionOptionReq.getUrl(), activityInfoListFactory.getHeaders(), ofe.c(activityInfoListFactory.getBody(questionOptionReq)), QuestionResultRsp.class, resultCallback);
    }

    public static void requestAnswer(QuestionResultReq questionResultReq, com.huawei.networkclient.ResultCallback<QuestionResultRsp> resultCallback) {
        if (questionResultReq == null) {
            LogUtil.j(TAG, "questionOptionReq is null.");
            return;
        }
        LogUtil.a(TAG, "requestAnswer enter");
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        oet.d().c(questionResultReq.getUrl(), activityInfoListFactory.getHeaders(), ofe.c(activityInfoListFactory.getBody(questionResultReq)), QuestionResultRsp.class, resultCallback);
    }
}
