package com.huawei.operation.h5pro.jsmodules;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.ive;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class Sport extends JsBaseModule {
    private static final int SPORT_GOAL_TYPE = 1;
    private static final int[] SPORT_TYPE = {-1, 257, 258, 259, 10001};
    private static final int SPORT_TYPE_FITNESS = 10001;
    private static final int SPORT_TYPE_INVALID = -1;
    private static final int SPORT_TYPE_NUM = 4;

    @JavascriptInterface
    public void startExercise(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            start(iOptInt, jSONObject.optInt(ParsedFieldTag.GOAL));
            LogUtil.a(this.TAG, "startExercise:", Integer.valueOf(iOptInt));
            onSuccessCallback(j, "");
        } catch (JSONException unused) {
            onFailureCallback(j, "param error");
        }
    }

    private void start(int i, int i2) {
        int iTransferSportType = transferSportType(i);
        if (iTransferSportType == 10001) {
            Bundle bundle = new Bundle();
            bundle.putString("SKIP_ALL_COURSE_KEY", "");
            AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).d(268435456).b(this.mContext);
        } else {
            ive.c().init(this.mContext);
            ive.c().e(0, iTransferSportType, i2 == -1 ? i2 : 1, i2, (ISportDataCallback) null, this.mContext);
        }
    }

    private int transferSportType(int i) {
        if (i <= -1 || i > 4) {
            return -1;
        }
        return SPORT_TYPE[i];
    }
}
