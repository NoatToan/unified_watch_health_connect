package com.xiaomi.hm.health.bodyfat.webapi;

import com.huami.feature.config.FeatureSwitch;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.UserScaleInfoRepository;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import java.io.File;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class WeightUserInfoApi {
    public static final String API_TYPE_UPLOAD_USER_INFO = "huami.health.scale.familymember.save.json";
    private static final String a = "Weight-UserInfoApi";
    private static final String b = "huami.health.scale.familymember.get.json";
    private static final String c = "huami.health.scale.familymember.delete.json";
    private static FeatureSwitch d = (FeatureSwitch) KoinJavaComponent.get(FeatureSwitch.class);

    public static void syncDeletedUserInfosToServer(String str, IHMHttpResponseHandler iHMHttpResponseHandler) {
        if (d.isSyncDataEnable()) {
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("jsondata", str);
            String url = HMServerDef.getUrl(c);
            HMLog.d(a, "Sync deleted UserInfo To Server : " + url, new Object[0]);
            HMLog.d(a, "params = " + systemParams.toString(), new Object[0]);
            HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, true, iHMHttpResponseHandler);
        }
    }

    public static void syncUserInfoToServer(UserInfos userInfos, boolean z, IHMHttpResponseHandler iHMHttpResponseHandler) {
        if (d.isSyncDataEnable()) {
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            if (BFCallback.getHMPersonInfo().getUserid().equals(userInfos.getUserId())) {
                systemParams.put("fuid", -1L);
            } else {
                systemParams.put("fuid", userInfos.getUserId());
            }
            systemParams.put("height", userInfos.getHeight());
            systemParams.put("nickname", userInfos.getName());
            systemParams.put("brithday", userInfos.getBirthday());
            systemParams.put("gender", userInfos.getGender());
            UserScaleInfo userScaleInfoById = UserScaleInfoRepository.INSTANCE.getInstance().getUserScaleInfoById(userInfos.getUserId());
            if (userScaleInfoById != null) {
                systemParams.put(ParamKey.measure_mode, Integer.valueOf(userScaleInfoById.getMeasureMode()));
                systemParams.put(ParamKey.scale_avatar_id, Integer.valueOf(userScaleInfoById.getAvatarIdOfScale()));
            }
            if (z) {
                HMLog.d(a, "getAvatarPath = " + userInfos.getAvatarPath(), new Object[0]);
                try {
                    systemParams.put("icon", new File(userInfos.getAvatarPath()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            systemParams.put("weight", userInfos.getWeight());
            systemParams.put("targetweight", Float.valueOf(userInfos.getTargetWeight() == null ? 0.0f : userInfos.getTargetWeight().floatValue()));
            String url = HMServerDef.getUrl(API_TYPE_UPLOAD_USER_INFO);
            HMLog.d(a, "Sync UserInfo To Server : " + url, new Object[0]);
            HMLog.d(a, "params = " + systemParams.toString(), new Object[0]);
            HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, true, iHMHttpResponseHandler);
        }
    }

    public static void syncUserInfosToLocal(int i, boolean z, IHMHttpResponseHandler iHMHttpResponseHandler) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        if (z) {
            systemParams.put("fuid", "all");
        } else {
            systemParams.put("fuid", Integer.valueOf(i));
        }
        String url = HMServerDef.getUrl(b);
        HMLog.d(a, "syncUserInfosToLocal url = " + url, new Object[0]);
        HMLog.d(a, "params = " + systemParams.toString(), new Object[0]);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, true, iHMHttpResponseHandler);
    }
}
