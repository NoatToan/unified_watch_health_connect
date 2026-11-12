package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnesssport.OnCheckStandListenerWrapper;
import com.huawei.pluginfitnesssport.OnTrainSkeletonListenerWrapper;
import defpackage.hau;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.AI_TRAIN_SOURCE)
public class AiActionTrainDataSource extends BaseSource implements SportLifecycle, OnTrainSkeletonListenerWrapper, OnCheckStandListenerWrapper {
    private static final String TAG = "SportService_AiActionTrainDataSource";
    private int mResultCode;
    private hau mSportCallbackOption = new hau();
    private int mStatusCode;

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void generateData(Object obj) {
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        LogUtil.a(TAG, "onPreSport");
        BaseSportManager.getInstance().setParas(SportParamsType.PRE_STATUS_SOURCE_LISTENER, this);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        BaseSportManager.getInstance().setParas(SportParamsType.AI_TRAIN_SOURCE_LISTENER, this);
        LogUtil.a(TAG, "onStartSport");
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        BaseSportManager.getInstance().updateSourceData(TAG, "AI_TRAIN_RESULT_CODE", Integer.valueOf(this.mResultCode));
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    @Override // com.huawei.pluginfitnesssport.OnTrainSkeletonListenerWrapper
    public void onSkeletonError(int i) {
        this.mStatusCode = i;
        BaseSportManager.getInstance().updateSourceData(TAG, "STATUS_CODE_DATA", Integer.valueOf(this.mStatusCode));
    }

    @Override // com.huawei.pluginfitnesssport.OnTrainSkeletonListenerWrapper
    public void getPoseResult(Object obj) {
        try {
            if (obj instanceof String) {
                this.mResultCode = new JSONArray((String) obj).getJSONObject(0).getInt("code");
                updateSourceData();
            }
        } catch (JSONException e) {
            LogUtil.a(TAG, "JSONException", e.getMessage());
        }
    }

    @Override // com.huawei.pluginfitnesssport.OnCheckStandListenerWrapper
    public void checkResult(int i) {
        this.mStatusCode = i;
        BaseSportManager.getInstance().updateSourceData(TAG, "STATUS_CODE_DATA", Integer.valueOf(this.mStatusCode));
    }
}
