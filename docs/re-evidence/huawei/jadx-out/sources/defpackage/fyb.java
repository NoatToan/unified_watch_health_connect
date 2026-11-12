package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.request.ActivityInfoApi;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.health.marketing.request.ActivityInfoReq;
import com.huawei.health.marketing.request.GlobalSearchApi;
import com.huawei.health.marketing.request.GlobalSearchFactory;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.health.marketing.request.RespActivityList;
import com.huawei.health.marketing.request.RespGlobalSearchResult;
import com.huawei.health.marketing.request.RespSearchSuggest;
import com.huawei.health.marketing.request.SearchContentReq;
import com.huawei.health.marketing.request.SearchSuggestReq;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class fyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f34731a;
    private static final Map<String, FitWorkout> d = new HashMap();

    public static void a(final String str, final UiCallback<List<String>> uiCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fyb.3
                @Override // java.lang.Runnable
                public void run() {
                    fyb.a(str, uiCallback);
                }
            });
            return;
        }
        if (TextUtils.isEmpty(str) || str.length() >= 50) {
            LogUtil.j("SearchRequestUtil", "requestSearchSuggest failed, cause queryText length has exceed 50!");
            return;
        }
        SearchSuggestReq searchSuggestReq = new SearchSuggestReq();
        searchSuggestReq.setContent(str);
        searchSuggestReq.setSize(String.valueOf(10));
        GlobalSearchApi globalSearchApi = (GlobalSearchApi) oet.d().e(GlobalSearchApi.class);
        GlobalSearchFactory globalSearchFactory = new GlobalSearchFactory(BaseApplication.getContext());
        String strC = ofe.c(globalSearchFactory.getBody(searchSuggestReq));
        LogUtil.a("SearchRequestUtil", "suggest url: ", searchSuggestReq.getUrl());
        LogUtil.a("SearchRequestUtil", "suggest headers:", globalSearchFactory.getHeaders());
        LogUtil.a("SearchRequestUtil", "suggest body: ", strC);
        try {
            Response<RespSearchSuggest> responseExecute = globalSearchApi.getSearchSuggest(searchSuggestReq.getUrl(), globalSearchFactory.getHeaders(), strC).execute();
            if (responseExecute.isOK()) {
                LogUtil.a("SearchRequestUtil", "requestSearchSuggest response is OK.");
                RespSearchSuggest body = responseExecute.getBody();
                if (body == null) {
                    uiCallback.onFailure(1, "requestSearchSuggest result is null");
                    return;
                }
                if (body.getResultCode() != 0) {
                    LogUtil.a("SearchRequestUtil", "search suggest result code: ", Integer.valueOf(body.getResultCode()));
                    uiCallback.onFailure(1, "requestSearchSuggest result is error");
                    return;
                } else if (njy.e(body.getResults())) {
                    uiCallback.onFailure(1, "requestSearchSuggest result is empty");
                    return;
                } else {
                    uiCallback.onSuccess(body.getResults());
                    return;
                }
            }
            uiCallback.onFailure(1, "requestSearchSuggest response is not ok, response code: " + responseExecute.getCode());
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            LogUtil.j("SearchRequestUtil", "requestSearchSuggest exception");
        }
    }

    public static void e(String str, UiCallback<List<GlobalSearchResult>> uiCallback, String str2) {
        f34731a = str2;
        String str3 = TextUtils.isEmpty(str2) ? "all" : "newlesson";
        LogUtil.a("SearchRequestUtil", "requestSearchContent category: ", str3);
        c(str, str3, uiCallback);
    }

    public static void c(String str, String str2, UiCallback<List<GlobalSearchResult>> uiCallback) {
        b(str, str2, 0, uiCallback);
    }

    public static void b(final String str, final String str2, final int i, final UiCallback<List<GlobalSearchResult>> uiCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fxz
                @Override // java.lang.Runnable
                public final void run() {
                    fyb.b(str, str2, i, uiCallback);
                }
            });
            return;
        }
        SearchContentReq searchContentReq = new SearchContentReq();
        searchContentReq.setContent(str);
        searchContentReq.setSize(String.valueOf(50));
        searchContentReq.setFrom(String.valueOf(i));
        searchContentReq.setCategoryId(str2);
        searchContentReq.setSearchScope(String.valueOf(3));
        if (!TextUtils.isEmpty(f34731a)) {
            searchContentReq.setSubCategoryId(f34731a);
        }
        GlobalSearchApi globalSearchApi = (GlobalSearchApi) oet.d().e(GlobalSearchApi.class);
        GlobalSearchFactory globalSearchFactory = new GlobalSearchFactory(BaseApplication.getContext());
        String strC = ofe.c(globalSearchFactory.getBody(searchContentReq));
        String strB = b(str2, searchContentReq);
        LogUtil.a("SearchRequestUtil", "search content url: ", strB);
        LogUtil.a("SearchRequestUtil", "search content headers:", globalSearchFactory.getHeaders());
        LogUtil.a("SearchRequestUtil", "search content body: ", strC);
        try {
            c(globalSearchApi.searchContent(strB, globalSearchFactory.getHeaders(), strC).execute(), uiCallback);
        } catch (JsonSyntaxException | IOException | IllegalStateException e) {
            LogUtil.j("SearchRequestUtil", "requestSearchContent exception： ", e.getMessage());
            uiCallback.onFailure(1, "requestSearchContent Exception");
        }
    }

    private static void c(Response<RespGlobalSearchResult> response, UiCallback<List<GlobalSearchResult>> uiCallback) {
        if (response.isOK()) {
            LogUtil.a("SearchRequestUtil", "requestSearchContent response is OK.");
            RespGlobalSearchResult body = response.getBody();
            if (body == null) {
                uiCallback.onFailure(1, "requestSearchContent result is null");
                return;
            }
            if (body.getResultCode() != 0) {
                LogUtil.j("SearchRequestUtil", "search content result code: ", Integer.valueOf(body.getResultCode()));
                uiCallback.onFailure(1, "requestSearchContent result is error");
                return;
            }
            List<GlobalSearchResult> results = body.getResults();
            if (njy.e(results)) {
                uiCallback.onFailure(1, "requestSearchContent result is empty");
                return;
            } else {
                LogUtil.a("SearchRequestUtil", "requestSearchContent respGlobalSearchResult.getResultCode(): ", Integer.valueOf(body.getResultCode()));
                uiCallback.onSuccess(results);
                return;
            }
        }
        uiCallback.onFailure(1, "requestSearchContent result is not ok, status code: " + response.getCode() + " response.getMessage(): " + response.getMessage());
    }

    private static String b(String str, SearchContentReq searchContentReq) {
        if (!"all".equals(str) || CommonUtil.cl()) {
            return searchContentReq.getUrl();
        }
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainGlobalSearch") + "/functions/2PioDjylqtMakeB6DPy3Ij/searchservice/v1/content";
    }

    public static RespActivityList e(List<String> list) {
        ActivityInfoReq activityInfoReq = new ActivityInfoReq();
        activityInfoReq.setActivityIdList(list);
        ActivityInfoApi activityInfoApi = (ActivityInfoApi) oet.d().e(ActivityInfoApi.class);
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        try {
            Response<RespActivityList> responseExecute = activityInfoApi.getActivityInfoList(activityInfoReq.getUrl(), activityInfoListFactory.getHeaders(), ofe.c(activityInfoListFactory.getBody(activityInfoReq))).execute();
            if (responseExecute.isOK()) {
                LogUtil.a("SearchRequestUtil", "requestActivityInfo response is OK.");
                RespActivityList body = responseExecute.getBody();
                if (body == null) {
                    LogUtil.j("SearchRequestUtil", "requestActivityInfo result is null");
                    return null;
                }
                if (body.getResultCode() == 0 && !njy.e(body.getPageActivityList())) {
                    return body;
                }
                LogUtil.j("SearchRequestUtil", "requestActivityInfo result is error.");
                return null;
            }
            LogUtil.a("SearchRequestUtil", "requestActivityInfo response is not ok, status code: ", Integer.valueOf(responseExecute.getCode()));
            return null;
        } catch (IOException unused) {
            LogUtil.j("SearchRequestUtil", "requestActivityInfo exception.");
            return null;
        }
    }
}
