package com.huawei.phoneservice.websurvey;

import android.app.Activity;
import com.google.gson.Gson;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqRestClient;

/* JADX INFO: loaded from: classes13.dex */
public class NpsSdkManager {
    public static final String API_PATH_GET_SURVEY = "/forward/ccpc/ccpcnps/getSurveyForSDK/4500";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_SGW_APP_ID = "sgw-app-id";
    private static final NpsSdkManager INSTANCE = new NpsSdkManager();
    public static final String SGW_APP_ID = "96E6614BD648F3582A2D6D657C5CC768";

    public <T extends NpsSurveyResponse> void getSurvey(NpsBuilder npsBuilder, Activity activity, String str, final NpsListener<T> npsListener, Class<T> cls) {
        String json = new Gson().toJson(npsBuilder.build());
        Headers headersBuild = new Headers.Builder().add("Content-Type", "application/json").add(HEADER_SGW_APP_ID, SGW_APP_ID).build();
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.initRestClientAnno(activity);
        if (faqRestClientInitRestClientAnno != null) {
            faqRestClientInitRestClientAnno.asyncRequestWitHead(activity, str + API_PATH_GET_SURVEY, headersBuild, json, new FaqCallback<T>(cls, activity) { // from class: com.huawei.phoneservice.websurvey.NpsSdkManager.1
                /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Throwable;TT;)V */
                @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
                public void onResult(Throwable th, NpsSurveyResponse npsSurveyResponse) {
                    NpsListener npsListener2 = npsListener;
                    if (npsListener2 != null) {
                        npsListener2.onResult(npsSurveyResponse, th);
                    }
                }
            });
        }
    }

    public static NpsSdkManager getINSTANCE() {
        return INSTANCE;
    }
}
