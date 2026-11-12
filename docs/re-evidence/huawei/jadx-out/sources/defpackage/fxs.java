package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.marketing.request.GlobalSearchApi;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.health.marketing.request.KnowledgeSearchHighlight;
import com.huawei.health.marketing.request.KnowledgeSearchResultWrapper;
import com.huawei.health.marketing.request.KnowledgeSearchSingleResult;
import com.huawei.health.marketing.request.MaterialSearchReqBody;
import com.huawei.health.marketing.request.SceneSearchResult;
import com.huawei.health.marketing.request.SceneSearchSingleResult;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes29.dex */
public class fxs {
    private static void b(final String str, final String str2, final String str3, final String str4, final CountDownLatch countDownLatch, final List<SceneSearchSingleResult> list) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fxs.3
            @Override // java.lang.Runnable
            public void run() {
                fxs.e(str, 0, 20, str2, str3, str4, new UiCallback<List<SceneSearchSingleResult>>() { // from class: fxs.3.5
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str5) {
                        LogUtil.e("MaterialSearchRequestUtil", "search scene queryText = ", str, ", productRegion = ", str2, " failed, errorCode = ", Integer.valueOf(i), ", errorInfo = ", str5);
                        countDownLatch.countDown();
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(List<SceneSearchSingleResult> list2) {
                        if (njy.b(list2)) {
                            list.addAll(list2);
                        }
                        countDownLatch.countDown();
                    }
                });
            }
        });
    }

    private static void e(final String str, final String str2, final CountDownLatch countDownLatch, final List<KnowledgeSearchSingleResult> list) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fxs.2
            @Override // java.lang.Runnable
            public void run() {
                final boolean[] zArr = {false};
                final int[] iArr = {0};
                do {
                    fxs.c(str, iArr[0], 20, str2, new UiCallback<List<KnowledgeSearchSingleResult>>() { // from class: fxs.2.1
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i, String str3) {
                            LogUtil.e("MaterialSearchRequestUtil", "search knowledge queryText = ", str, " failed, errorCode = ", Integer.valueOf(i), ", errorInfo = ", str3);
                            zArr[0] = false;
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(List<KnowledgeSearchSingleResult> list2) {
                            if (njy.b(list2)) {
                                list.addAll(list2);
                                int[] iArr2 = iArr;
                                int i = iArr2[0] + 1;
                                iArr2[0] = i;
                                zArr[0] = i < 5;
                                return;
                            }
                            LogUtil.a("MaterialSearchRequestUtil", "searchKnowledge done, no more data searched!");
                            zArr[0] = false;
                        }
                    });
                } while (zArr[0]);
                countDownLatch.countDown();
            }
        });
    }

    public static void a(final String str, final UiCallback<GlobalSearchResult> uiCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fxs.5
                @Override // java.lang.Runnable
                public void run() {
                    fxs.a(str, uiCallback);
                }
            });
            return;
        }
        String strB = b();
        CountDownLatch countDownLatch = new CountDownLatch(TextUtils.isEmpty(strB) ? 2 : 3);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strB)) {
            b(str, strB, "device_" + strB, "device", countDownLatch, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        b(str, "health_help_all", "health_help_all", "help", countDownLatch, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        if (TextUtils.isEmpty(strB)) {
            strB = "health_help_all";
        }
        e(str, strB, countDownLatch, arrayList3);
        try {
            if (!countDownLatch.await(10000L, TimeUnit.MILLISECONDS)) {
                LogUtil.e("MaterialSearchRequestUtil", "search time out!");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("MaterialSearchRequestUtil", "search interrupted!");
        }
        GlobalSearchResult globalSearchResult = new GlobalSearchResult();
        globalSearchResult.setCategoryId(Constants.AD_MATERIAL_SUB_DIR);
        ArrayList arrayList4 = new ArrayList();
        b(str, arrayList, arrayList4);
        b(str, arrayList2, arrayList4);
        e(arrayList3, arrayList4);
        globalSearchResult.setContent(arrayList4);
        if (njy.b(arrayList4)) {
            uiCallback.onSuccess(globalSearchResult);
        } else {
            uiCallback.onFailure(-1, "search material no content found!");
        }
    }

    private static void e(List<KnowledgeSearchSingleResult> list, List<GlobalSearchContent> list2) {
        KnowledgeSearchHighlight highlight;
        if (njy.e(list)) {
            return;
        }
        for (KnowledgeSearchSingleResult knowledgeSearchSingleResult : new ArrayList(list)) {
            if (knowledgeSearchSingleResult != null && (highlight = knowledgeSearchSingleResult.getHighlight()) != null) {
                List<String> titleList = highlight.getTitleList();
                if (!njy.e(titleList)) {
                    String str = titleList.get(0);
                    GlobalSearchContent globalSearchContent = new GlobalSearchContent();
                    globalSearchContent.setTitle(str);
                    globalSearchContent.setId(knowledgeSearchSingleResult.getId());
                    globalSearchContent.setType(a.w);
                    list2.add(globalSearchContent);
                }
            }
        }
    }

    private static void b(String str, List<SceneSearchSingleResult> list, List<GlobalSearchContent> list2) {
        for (SceneSearchSingleResult sceneSearchSingleResult : list) {
            if (sceneSearchSingleResult != null) {
                String highlightTitle = sceneSearchSingleResult.getHighlightTitle();
                String title = !TextUtils.isEmpty(highlightTitle) ? highlightTitle : sceneSearchSingleResult.getTitle();
                String cdnUrl = sceneSearchSingleResult.getCdnUrl();
                if (TextUtils.isEmpty(title) || TextUtils.isEmpty(cdnUrl)) {
                    LogUtil.e("MaterialSearchRequestUtil", "search ", str, ", but one of them empty: contentTitle = ", title, ", deeplink = ", cdnUrl);
                } else {
                    GlobalSearchContent globalSearchContent = new GlobalSearchContent();
                    globalSearchContent.setTitle(title);
                    globalSearchContent.setDeepLink(cdnUrl);
                    list2.add(globalSearchContent);
                }
            }
        }
    }

    private static MaterialSearchReqBody e(String str, int i, int i2, String str2, String str3, String str4) {
        MaterialSearchReqBody materialSearchReqBody = new MaterialSearchReqBody();
        materialSearchReqBody.setSearchWord(str);
        materialSearchReqBody.setSize(i2);
        if ("/search/v1/knowledge/search".equals(str4)) {
            materialSearchReqBody.setSite(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
            materialSearchReqBody.setStart(i + 1);
            materialSearchReqBody.setSort(2);
            return materialSearchReqBody;
        }
        materialSearchReqBody.setDeviceName(str2);
        materialSearchReqBody.setSceneType(str3);
        materialSearchReqBody.setStart(i);
        return materialSearchReqBody;
    }

    public static void e(String str, int i, int i2, String str2, String str3, String str4, UiCallback<List<SceneSearchSingleResult>> uiCallback) {
        String str5 = GRSManager.c(com.huawei.haf.application.BaseApplication.b()).getUrl("materialUrl") + "/search/v1/scene/search";
        LogUtil.a("MaterialSearchRequestUtil", "searchScene content url: ", str5);
        Map<String, String> mapA = a(BaseApplication.getContext(), "/search/v1/scene/search", str2);
        LogUtil.a("MaterialSearchRequestUtil", "searchScene content headers:", mapA);
        String strA = qqt.a(e(str, i, i2, str3, str4, "/search/v1/scene/search"), new TypeToken<MaterialSearchReqBody>() { // from class: com.huawei.health.marketing.utils.MaterialSearchRequestUtil$4
        }.getType());
        LogUtil.a("MaterialSearchRequestUtil", "searchScene content body: ", strA);
        try {
            d(((GlobalSearchApi) oet.d().e(GlobalSearchApi.class)).searchContentForScene(str5, mapA, strA).execute(), uiCallback);
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            LogUtil.j("MaterialSearchRequestUtil", "searchScene exception");
            uiCallback.onFailure(1, "searchScene Exception");
        }
    }

    public static void c(String str, int i, int i2, String str2, UiCallback<List<KnowledgeSearchSingleResult>> uiCallback) {
        String str3 = GRSManager.c(com.huawei.haf.application.BaseApplication.b()).getUrl("materialUrl") + "/search/v1/knowledge/search";
        LogUtil.a("MaterialSearchRequestUtil", "searchKnowledge content url: ", str3);
        Map<String, String> mapA = a(BaseApplication.getContext(), "/search/v1/knowledge/search", str2);
        LogUtil.a("MaterialSearchRequestUtil", "searchKnowledge content headers:", mapA);
        String strA = qqt.a(e(str, i, i2, "", "", "/search/v1/knowledge/search"), new TypeToken<MaterialSearchReqBody>() { // from class: com.huawei.health.marketing.utils.MaterialSearchRequestUtil$5
        }.getType());
        LogUtil.a("MaterialSearchRequestUtil", "searchKnowledge content body: ", strA);
        try {
            e(((GlobalSearchApi) oet.d().e(GlobalSearchApi.class)).searchContentForKnowledge(str3, mapA, strA).execute(), uiCallback);
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            LogUtil.j("MaterialSearchRequestUtil", "searchKnowledge exception");
            uiCallback.onFailure(-1, "searchKnowledge Exception");
        }
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MaterialSearchRequestUtil", "normalizedHuid huid is null ");
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() < 16) {
            sb.insert(0, '0');
        }
        return sb.toString();
    }

    private static String b() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "MaterialSearchRequestUtil");
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            return "";
        }
        return deviceInfo.getHiLinkDeviceId();
    }

    private static Map<String, String> a(Context context, String str, String str2) {
        String usetId;
        HashMap map = new HashMap(16);
        if (LoginInit.getInstance(context).isBrowseMode()) {
            usetId = "0";
        } else {
            usetId = LoginInit.getInstance(context).getUsetId();
        }
        map.put("X-Request-ID", a(usetId));
        map.put("X-App-Id", BaseApplication.getAppPackage());
        map.put("X-App-Version", CommonUtil.a(context).split(Constants.LINK)[0]);
        if ("/search/v1/scene/search".equals(str)) {
            map.put("productRegion", str2);
        }
        String strB = LanguageUtil.b(context);
        if (LanguageUtil.f(context)) {
            strB = "zh-cn";
        }
        map.put("lang", strB);
        map.put("Content-Type", "application/json; charset=utf-8");
        return map;
    }

    private static void d(Response<SceneSearchResult> response, UiCallback<List<SceneSearchSingleResult>> uiCallback) {
        if (response.isOK()) {
            LogUtil.a("MaterialSearchRequestUtil", "resolveResponseForScene response is OK.");
            SceneSearchResult body = response.getBody();
            if (body == null) {
                uiCallback.onFailure(1, "resolveResponseForScene result is null");
                return;
            }
            int resultCode = body.getResultCode();
            if (resultCode != 0) {
                LogUtil.j("MaterialSearchRequestUtil", "resolveResponseForScene result code: ", Integer.valueOf(resultCode));
                uiCallback.onFailure(1, "resolveResponseForScene result is error");
                return;
            }
            List<SceneSearchSingleResult> results = body.getResults();
            if (njy.e(results)) {
                uiCallback.onFailure(1, "resolveResponseForScene result is empty");
                return;
            } else {
                uiCallback.onSuccess(results);
                return;
            }
        }
        uiCallback.onFailure(1, "resolveResponseForScene result is not ok, status code: " + response.getCode());
    }

    private static void e(Response<KnowledgeSearchResultWrapper> response, UiCallback<List<KnowledgeSearchSingleResult>> uiCallback) {
        if (response.isOK()) {
            LogUtil.a("MaterialSearchRequestUtil", "resolveResponseForKnowledge response is OK.");
            KnowledgeSearchResultWrapper body = response.getBody();
            if (body == null) {
                uiCallback.onFailure(-1, "resolveResponseForKnowledge result is null");
                return;
            }
            int code = body.getCode();
            if (code != 1) {
                LogUtil.j("MaterialSearchRequestUtil", "resolveResponseForKnowledge result code: ", Integer.valueOf(code));
                uiCallback.onFailure(code, "resolveResponseForKnowledge result is error");
                return;
            }
            List<KnowledgeSearchSingleResult> knowList = body.getResult().getKnowList();
            if (njy.e(knowList)) {
                uiCallback.onFailure(-1, "resolveResponseForKnowledge result is empty");
                return;
            } else {
                uiCallback.onSuccess(knowList);
                return;
            }
        }
        uiCallback.onFailure(-1, "resolveResponseForKnowledge result is not ok, status code: " + response.getCode());
    }
}
