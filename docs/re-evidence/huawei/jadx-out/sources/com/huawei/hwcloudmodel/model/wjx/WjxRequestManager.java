package com.huawei.hwcloudmodel.model.wjx;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.VastAttribute;
import defpackage.lqo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class WjxRequestManager {
    private static final String TAG = "WjxRequestManager";

    private WjxRequestManager() {
    }

    public static void getSurveyId(final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().submit(new Callable<Void>() { // from class: com.huawei.hwcloudmodel.model.wjx.WjxRequestManager.1
            @Override // java.util.concurrent.Callable
            public Void call() {
                SurveyIdResponse surveyIdResponseRequestSurveyId = WjxRequestManager.requestSurveyId();
                if (surveyIdResponseRequestSurveyId == null) {
                    LogUtil.j(WjxRequestManager.TAG, "surveyIdRsp is null ");
                    iBaseResponseCallback.a(-1, VastAttribute.ERROR);
                    return null;
                }
                LogUtil.a(WjxRequestManager.TAG, "surveyIdRsp.getResultCode(): ", surveyIdResponseRequestSurveyId.getResultCode());
                iBaseResponseCallback.a(surveyIdResponseRequestSurveyId.getResultCode().intValue(), surveyIdResponseRequestSurveyId.getSurveyId());
                LogUtil.a(WjxRequestManager.TAG, "getSurveyId end");
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SurveyIdResponse requestSurveyId() {
        SurveyIdResponse surveyIdResponseA = lqo.b(BaseApplication.getContext()).a(new SurveyIdRequest());
        if (surveyIdResponseA != null) {
            return surveyIdResponseA;
        }
        LogUtil.j(TAG, "response = null");
        return null;
    }
}
