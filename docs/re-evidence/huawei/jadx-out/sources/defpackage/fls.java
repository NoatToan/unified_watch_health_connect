package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.userlabelmgr.model.UpdateUserLabel;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class fls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fls f34195a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f34196c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UpdateUserLabel f34197b;
    private Context e = BaseApplication.getContext();

    private fls() {
    }

    public static fls a() {
        fls flsVar;
        synchronized (f34196c) {
            if (f34195a == null) {
                f34195a = new fls();
            }
            flsVar = f34195a;
        }
        return flsVar;
    }

    public void d() {
        LogUtil.a("ActivitiesUserLabelHelper", "enter registerCallback()");
        if (this.f34197b != null) {
            LogUtil.a("ActivitiesUserLabelHelper", "registerCallback(), mUpdateUserLabel != null");
        } else {
            this.f34197b = new UpdateUserLabel() { // from class: fls.3
                @Override // com.huawei.health.userlabelmgr.model.UpdateUserLabel
                public void onUpdate() {
                    LogUtil.a("ActivitiesUserLabelHelper", "registerCallback(), onUpdate()");
                    fls.this.f();
                }
            };
            fmc.a(this.e).e(this.f34197b);
        }
    }

    public void b() {
        LogUtil.a("ActivitiesUserLabelHelper", "enter unRegisterCallback()");
        if (this.f34197b == null) {
            LogUtil.a("ActivitiesUserLabelHelper", "unRegisterCallback(), mUpdateUserLabel is null");
        } else {
            fmc.a(this.e).e(this.f34197b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        e();
        c();
    }

    private void e() {
        OperationInteractorsApi operationInteractorsApi = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
        if (operationInteractorsApi == null) {
            LogUtil.j("ActivitiesUserLabelHelper", "doActivityLabel operationInteractorsApi is null");
        } else {
            operationInteractorsApi.getOperationList(this.e, 1, null, new HttpResCallback() { // from class: fls.2
                @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
                public void onFinished(int i, String str) {
                    LogUtil.a("ActivitiesUserLabelHelper", "getActivities resCode = ", Integer.valueOf(i));
                    LogUtil.d("ActivitiesUserLabelHelper", "getActivities,", str);
                    if (i != 200) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        String strOptString = jSONObject.optString("currentTime");
                        LogUtil.a("ActivitiesUserLabelHelper", "getActivities operationCurrentTime,", strOptString);
                        long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strOptString).getTime();
                        JSONArray jSONArray = jSONObject.getJSONArray("activities");
                        long j = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            long j2 = jSONArray.getJSONObject(i3).getLong("attendDate");
                            if (j2 >= time - 7776000000L) {
                                i2++;
                            }
                            if (j2 > j) {
                                j = j2;
                            }
                        }
                        flt fltVarK = flt.k();
                        if (fltVarK != null) {
                            fltVarK.d(i2, j, time);
                        }
                    } catch (ParseException unused) {
                        LogUtil.e("ActivitiesUserLabelHelper", "ParseException:");
                    } catch (JSONException e) {
                        LogUtil.e("ActivitiesUserLabelHelper", "Json data error! JSONException:", e.getMessage());
                    }
                }
            });
        }
    }

    private void c() {
        String strE = SharedPreferenceManager.e(this.e, Integer.toString(10015), "key_ui_login_last_time");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(strE)) {
            String[] strArrSplit = strE.split(",");
            if (strArrSplit.length > 1) {
                try {
                    jCurrentTimeMillis = Long.parseLong(strArrSplit[0]);
                } catch (NumberFormatException unused) {
                    LogUtil.e("ActivitiesUserLabelHelper", "NumberFormatException");
                }
            }
        }
        flt.k().b(jCurrentTimeMillis);
    }
}
