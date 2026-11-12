package com.huawei.ui.main.stories.nps.component;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController;

/* JADX INFO: loaded from: classes19.dex */
public class NpsApi extends JsBaseModule {
    @JavascriptInterface
    public void getSurveyTime(long j) {
        int surveyTime = NpsUserShowController.getInstance(BaseApplication.getContext()).getSurveyTime();
        LogUtil.j(this.TAG, "getSurveyTime surveyTime ", Integer.valueOf(surveyTime));
        onSuccessCallback(j, Integer.valueOf(surveyTime));
    }

    @JavascriptInterface
    public void saveInfo(long j) {
        int surveyTime = NpsUserShowController.getInstance(BaseApplication.getContext()).getSurveyTime();
        LogUtil.j(this.TAG, "saveInfo surveyTime ", Integer.valueOf(surveyTime));
        NpsUserShowController.getInstance(BaseApplication.getContext()).setTheSurveyUnNeeded(surveyTime);
    }
}
