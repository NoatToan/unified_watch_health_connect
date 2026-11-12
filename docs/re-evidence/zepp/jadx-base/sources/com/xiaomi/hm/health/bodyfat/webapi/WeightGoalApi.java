package com.xiaomi.hm.health.bodyfat.webapi;

import com.huami.feature.config.FeatureSwitch;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class WeightGoalApi {
    private static final String a = "Weight-WeightGoalApi";
    private static final String b = "huami.health.scale.usergoal.getusergoallist.json";
    private static final String c = "huami.health.scale.usergoal.deleteusergoal.json";
    private static final String d = "huami.health.scale.usergoal.saveusergoal.json";
    private static FeatureSwitch e = (FeatureSwitch) KoinJavaComponent.get(FeatureSwitch.class);

    public static void deleteUserWeightGoal(String str, String str2, int i, long j, IHMHttpResponseHandler iHMHttpResponseHandler) {
        if (e.isSyncDataEnable()) {
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("userid", str);
            systemParams.put("fuid", str2);
            systemParams.put("goal_type", Integer.valueOf(i));
            systemParams.put("date_time", Long.valueOf(j));
            String url = HMServerDef.getUrl(c);
            HMLog.d(a, "params = " + systemParams.toString(), new Object[0]);
            HMLog.d(a, "url = " + url, new Object[0]);
            HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, true, iHMHttpResponseHandler);
        }
    }

    public static void getUserWeightGoalList(String str, long j, int i, String str2, String str3, IHMHttpResponseHandler iHMHttpResponseHandler) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("userid", str);
        systemParams.put("goal_type", Integer.valueOf(i));
        systemParams.put("fuid", Long.valueOf(j));
        systemParams.put("stime", str2);
        systemParams.put("etime", str3);
        String url = HMServerDef.getUrl(b);
        HMLog.d(a, "params = " + systemParams.toString(), new Object[0]);
        HMLog.d(a, "url = " + url, new Object[0]);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, true, iHMHttpResponseHandler);
    }

    public static void uploadUserWeightGoal(String str, String str2, int i, float f, float f2, int i2, long j, IHMHttpResponseHandler iHMHttpResponseHandler) {
        if (e.isSyncDataEnable()) {
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("userid", str);
            systemParams.put("fuid", str2);
            systemParams.put("goal_type", Integer.valueOf(i));
            systemParams.put("currentval", Float.valueOf(f));
            systemParams.put(StatEvent.EventParams.TYPE_CARD_GOAL, Float.valueOf(f2));
            systemParams.put("height", Integer.valueOf(i2));
            systemParams.put("date_time", Long.valueOf(j));
            String url = HMServerDef.getUrl(d);
            HMLog.d(a, "params = " + systemParams.toString(), new Object[0]);
            HMLog.d(a, "url = " + url, new Object[0]);
            HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, true, iHMHttpResponseHandler);
        }
    }
}
