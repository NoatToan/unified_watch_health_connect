package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.AchieveDataApi;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginbase.PluginBaseAdapter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
@ApiDefine(uri = AchieveDataApi.class)
public class orv implements AchieveDataApi {
    @Override // com.huawei.pluginachievement.AchieveDataApi
    public osf getData(int i, Map<String, String> map) {
        return otl.b(BaseApplication.b()).b(i, map);
    }

    @Override // com.huawei.pluginachievement.AchieveDataApi
    public osc getSingleDayData() {
        osc oscVar = new osc();
        osf osfVarB = otl.b(BaseApplication.b()).b(2, new HashMap(16));
        if (!(osfVarB instanceof SingleDayRecord)) {
            LogUtil.j("PLGACHIEVE_AchieveDataImpl", "getSingleDayData SingleDayRecord is null.");
            return oscVar;
        }
        SingleDayRecord singleDayRecord = (SingleDayRecord) osfVarB;
        oscVar.g(singleDayRecord.acquireBestRun3KMPace());
        oscVar.b(c(singleDayRecord.acquireBestRun3KMPace()));
        oscVar.h(singleDayRecord.acquireBestRun5KMPace());
        oscVar.e(c(singleDayRecord.acquireBestRun5KMPace()));
        oscVar.b(singleDayRecord.acquireBestRun10KMPace());
        oscVar.a(c(singleDayRecord.acquireBestRun10KMPace()));
        oscVar.f(singleDayRecord.acquireBestRunHMPace());
        oscVar.c(c(singleDayRecord.acquireBestRunHMPace()));
        oscVar.j(singleDayRecord.acquireBestRunFMPace());
        oscVar.d(c(singleDayRecord.acquireBestRunFMPace()));
        oscVar.d(osv.c(singleDayRecord.acquireBestRopeSingCount(), "value"));
        oscVar.a(osv.c(singleDayRecord.acquireBestRopeContinuousCount(), "value"));
        oscVar.c(osv.c(singleDayRecord.acquireBestRopeSpeed(), "value"));
        oscVar.e(osv.c(singleDayRecord.acquireBestRopeDuration(), "value"));
        return oscVar;
    }

    @Override // com.huawei.pluginachievement.AchieveDataApi
    public void generateReportHealthData(Context context) {
        LogUtil.a("PLGACHIEVE_AchieveDataImpl", "generateReportHealthData");
        if (context == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataImpl", "context is null");
        } else {
            oru.a(context).e();
        }
    }

    @Override // com.huawei.pluginachievement.AchieveDataApi
    public boolean getKakaTaskRedDot(Context context) {
        LogUtil.a("PLGACHIEVE_AchieveDataImpl", "getKakaTaskRedDot");
        if (context == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataImpl", "context is null");
            return false;
        }
        return otu.b(context).a();
    }

    @Override // com.huawei.pluginachievement.AchieveDataApi
    public void dealKakaTask(Context context, Handler handler, int i) {
        LogUtil.a("PLGACHIEVE_AchieveDataImpl", "dealKakaTask");
        if (context == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataImpl", "context is null");
        } else {
            otu.b(context).c(handler, i);
        }
    }

    @Override // com.huawei.pluginachievement.AchieveDataApi
    public PluginBaseAdapter getAdapter(Context context) {
        LogUtil.a("PLGACHIEVE_AchieveDataImpl", "getAdapter");
        return oru.a(context).getAdapter();
    }

    @Override // com.huawei.pluginachievement.AchieveDataApi
    public void initAdapter(Context context, PluginBaseAdapter pluginBaseAdapter) {
        LogUtil.a("PLGACHIEVE_AchieveDataImpl", "setAdapter");
        if (context == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataImpl", "context is null");
        } else if (pluginBaseAdapter == null) {
            LogUtil.a("PLGACHIEVE_AchieveDataImpl", "pluginBaseAdapter is null");
        } else {
            oru.a(context).setAdapter(pluginBaseAdapter);
        }
    }

    private ose c(String str) {
        JSONException e;
        LogUtil.a("PLGACHIEVE_AchieveDataImpl", "parseBestMotionPace bestMotionPace.");
        ose oseVar = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_AchieveDataImpl", "parseBestMotionPace reportData is null");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ose oseVar2 = new ose();
            double d = 0.0d;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    double d2 = osv.d("value", jSONObject);
                    long jE = osv.e("startTime", jSONObject);
                    if (paw.b(d, 0.0d) == 0) {
                        oseVar2.b(d2);
                        oseVar2.d(jE);
                        d = d2;
                    }
                    if (paw.b(d2, d) < 0) {
                        oseVar2.b(d2);
                        oseVar2.d(jE);
                        oseVar2.e(osv.a("source", jSONObject));
                        d = d2;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    oseVar = oseVar2;
                }
            }
            return oseVar2;
        } catch (JSONException e3) {
            e = e3;
        }
        LogUtil.e("PLGACHIEVE_AchieveDataImpl", "getStartTimeAndEndTime Exception:", e.getMessage());
        return oseVar;
    }

    @Override // com.huawei.pluginachievement.AchieveDataApi
    public void dealWeChatTask() {
        otu.b(BaseApplication.b()).e();
    }
}
