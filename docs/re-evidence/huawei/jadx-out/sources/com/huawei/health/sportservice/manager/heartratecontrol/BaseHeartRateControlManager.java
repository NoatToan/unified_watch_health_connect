package com.huawei.health.sportservice.manager.heartratecontrol;

import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.heartratecontrol.algorithm.BaseHeartRateControlModel;
import com.huawei.health.heartratecontrol.algorithm.HeartRateModelCallback;
import com.huawei.health.sportservice.IHeartRateControlCallback;
import com.huawei.health.sportservice.SportCourseParams;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportObserverType;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.ManagerComponent;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import defpackage.fgf;
import defpackage.hau;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.HEART_RATE_CONTROL_MANAGER)
public class BaseHeartRateControlManager implements ManagerComponent, HeartRateModelCallback {
    private static final String TAG = "SportService_HRControl_BaseHeartRateControlManager";
    protected int mControlLock;
    protected boolean mIsRestart;
    protected BaseHeartRateControlModel mModel;
    protected SportDataNotify mSportDataNotify;
    protected int mSportType;
    protected hau mCallbackOption = new hau();
    protected HashMap<String, IHeartRateControlCallback> mHeartRateControlCallbackMap = new HashMap<>(1);
    protected int mSportTime = -1;
    protected int mHeartRate = -1;

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        LogUtil.a(TAG, "enter setParas");
        if (SportParamsType.HEART_RATE_CONTROL_LOCK.equals(sportParamsType) && (obj instanceof Integer)) {
            int iIntValue = ((Integer) obj).intValue();
            this.mControlLock = iIntValue;
            LogUtil.a(TAG, "mControlLock is ", Integer.valueOf(iIntValue));
            this.mModel.setLockStatus(this.mControlLock);
        }
        if (SportParamsType.COURSE_INFO.equals(sportParamsType) && (obj instanceof SportCourseParams)) {
            SportCourseParams sportCourseParams = (SportCourseParams) obj;
            updateCourseInitData(sportCourseParams);
            updateModelData(sportCourseParams);
            updateCourseConfigInfo(sportCourseParams);
        }
        if (SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType) && (obj instanceof SportLaunchParams)) {
            boolean zIsRestart = ((SportLaunchParams) obj).isRestart();
            this.mIsRestart = zIsRestart;
            this.mModel.setRestart(zIsRestart);
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportParas(SportParamsType sportParamsType) {
        return SportParamsType.HEART_RATE_CONTROL_LOCK.equals(sportParamsType) || SportParamsType.COURSE_INFO.equals(sportParamsType) || SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType);
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean addObserver(SportObserverType sportObserverType, String str, Object obj) {
        LogUtil.a(TAG, "addObserver, observerType is ", sportObserverType, " tag is ", str);
        if (!SportObserverType.HEART_RATE_OBSERVE.equals(sportObserverType) || TextUtils.isEmpty(str) || !(obj instanceof IHeartRateControlCallback)) {
            return false;
        }
        this.mHeartRateControlCallbackMap.put(str, (IHeartRateControlCallback) obj);
        return true;
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean removeObserver(SportObserverType sportObserverType, String str) {
        LogUtil.a(TAG, "removeObserver, observerType is ", sportObserverType, " tag is ", str);
        if (!SportObserverType.HEART_RATE_OBSERVE.equals(sportObserverType) || TextUtils.isEmpty(str)) {
            return false;
        }
        this.mHeartRateControlCallbackMap.remove(str);
        return true;
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportObserver(SportObserverType sportObserverType) {
        return SportObserverType.HEART_RATE_OBSERVE.equals(sportObserverType);
    }

    protected void updateHeartRateControlData(Object obj) {
        for (String str : this.mHeartRateControlCallbackMap.keySet()) {
            if (this.mHeartRateControlCallbackMap.get(str) != null) {
                this.mHeartRateControlCallbackMap.get(str).onDataUpdate(obj);
            }
        }
    }

    protected void updateHeartRateControlStatus(int i) {
        for (String str : this.mHeartRateControlCallbackMap.keySet()) {
            if (this.mHeartRateControlCallbackMap.get(str) != null) {
                this.mHeartRateControlCallbackMap.get(str).onStatusUpdate(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.health.heartratecontrol.algorithm.HeartRateModelCallback
    public <T> void onDataUpdate(String str, T t) {
        LogUtil.a(TAG, "onDataUpdate tag = ", str, ", data = ", t);
        str.hashCode();
        if (str.equals("HEART_RATE_MODEL_COURSE_INFO")) {
            updateHeartRateControlData(t);
        } else if (str.equals("HEART_RATE_MODEL_STATUS") && (t instanceof Integer)) {
            updateHeartRateControlStatus(((Integer) t).intValue());
        }
    }

    private void updateCourseInitData(SportCourseParams sportCourseParams) {
        HashMap map = new HashMap();
        if (sportCourseParams.getCourseDurationList() != null) {
            map.put("COURSE_NAME_LIST", sportCourseParams.getCourseNameList());
            map.put("COURSE_DURATION_LIST", sportCourseParams.getCourseDurationList());
            map.put("COURSE_HEART_RATE_LIST", sportCourseParams.getCourseHeartRateList());
            map.put("COURSE_CADENCE_LIST", sportCourseParams.getExtra("COURSE_CADENCE_LIST", new TypeToken<List<Pair<Integer, Integer>>>() { // from class: com.huawei.health.sportservice.manager.heartratecontrol.BaseHeartRateControlManager.1
            }.getType()));
            map.put("COURSE_DURATION", Integer.valueOf(sportCourseParams.getCourseTotalTime()));
            map.put("COURSE_MIN_HEART_RATE", sportCourseParams.getExtra("COURSE_MIN_HEART_RATE", Integer.class));
            map.put("COURSE_MAX_HEART_RATE", sportCourseParams.getExtra("COURSE_MAX_HEART_RATE", Integer.class));
            onDataUpdate("HEART_RATE_MODEL_COURSE_INFO", map);
        }
    }

    private void updateModelData(SportCourseParams sportCourseParams) {
        int iIntValue = ((Integer) sportCourseParams.getExtra("COURSE_ACTION_INDEX", Integer.class, -1)).intValue();
        ChoreographedSingleAction choreographedSingleAction = (ChoreographedSingleAction) sportCourseParams.getExtra("COURSE_ACTION_DATA", ChoreographedSingleAction.class);
        boolean zIsCourseFinished = sportCourseParams.isCourseFinished();
        if (iIntValue != -1 && choreographedSingleAction != null) {
            this.mModel.setCourseStageInfo(iIntValue, choreographedSingleAction);
            HashMap map = new HashMap();
            map.put("CURRENT_STAGE_NUMBER", Integer.valueOf(iIntValue + 1));
            onDataUpdate("HEART_RATE_MODEL_COURSE_INFO", map);
        }
        if (zIsCourseFinished) {
            this.mModel.setIsCourseFinished(zIsCourseFinished);
            onDataUpdate("HEART_RATE_MODEL_STATUS", 1003);
        }
    }

    private void updateCourseConfigInfo(SportCourseParams sportCourseParams) {
        fgf fgfVar = (fgf) sportCourseParams.getExtra("COURSE_CONFIG_DATA", fgf.class);
        LogUtil.a(TAG, "updateCourseConfigInfo configInfo = ", fgfVar);
        if (fgfVar != null) {
            this.mModel.setCourseConfigInfo(fgfVar);
        }
    }
}
