package com.xiaomi.hm.health.device.callback.weight;

import android.text.TextUtils;
import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.other.QQLoginApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.property.BodyfatProperty;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class MifitWeightDataSyncCallback extends HMCallback<WeightSyncResult> {
    public static final int MERGE_TIME_DELTA = 30000;
    private final String a = getClass().getSimpleName();
    private HMDeviceType b = HMDeviceType.WEIGHT;
    private HashMap<Long, ArrayList<WeightInfos>> c = new HashMap<>();
    private int d = 0;
    private final Lazy<QQLoginApi> e = KoinJavaComponent.inject(QQLoginApi.class);
    private final Lazy<DeviceUtilsApi> f = KoinJavaComponent.inject(DeviceUtilsApi.class);

    private void a(WeightInfos weightInfos) {
        ArrayList<WeightInfos> arrayList = this.c.get(weightInfos.getUserId());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.c.put(weightInfos.getUserId(), arrayList);
            HMLog.i(this.a, "<<merge>> add to SparseArray:" + weightInfos.getUserId(), new Object[0]);
        }
        HMLog.i(this.a, "<<merge>> add to WeightInfo list:" + weightInfos, new Object[0]);
        arrayList.add(weightInfos);
    }

    private ArrayList<WeightInfos> b(HashMap<Long, ArrayList<WeightInfos>> map) {
        ArrayList<WeightInfos> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList(map.values());
        int size = arrayList2.size();
        WeightInfoManager manager = WeightInfoManager.getManager();
        for (int i = 0; i < size; i++) {
            WeightInfos weightInfos = null;
            for (WeightInfos weightInfos2 : (ArrayList) arrayList2.get(i)) {
                if (weightInfos2.getUserId().longValue() == 0) {
                    HMLog.i(this.a, "<<merge>> USER_ID_UNKNOWN:" + weightInfos2, new Object[0]);
                    arrayList.add(weightInfos2);
                } else {
                    if (weightInfos == null) {
                        HMLog.i(this.a, "<<merge>> lastInfo is null", new Object[0]);
                    } else if (Math.abs(weightInfos2.getTimestamp().longValue() - weightInfos.getTimestamp().longValue()) <= 30000) {
                        HMLog.i(this.a, "<<merge>> ignore last info", new Object[0]);
                        WeightInfos info = manager.getInfo(weightInfos.getTimestamp().longValue());
                        if (info != null) {
                            HMLog.i(this.a, "<<merge>> delete last info", new Object[0]);
                            manager.deleteInfoLocal(info);
                        }
                    } else {
                        WeightInfos info2 = manager.getInfo(weightInfos.getTimestamp().longValue());
                        if (info2 == null) {
                            this.d++;
                            HMLog.i(this.a, "<<merge>> add last info:" + weightInfos, new Object[0]);
                        } else {
                            manager.deleteInfoLocal(info2);
                            HMLog.i(this.a, "<<merge>> exsit last info:" + weightInfos, new Object[0]);
                        }
                        arrayList.add(weightInfos);
                    }
                    weightInfos = weightInfos2;
                }
            }
            if (weightInfos != null) {
                WeightInfos info3 = manager.getInfo(weightInfos.getTimestamp().longValue());
                if (info3 == null) {
                    this.d++;
                    HMLog.i(this.a, "<<merge>> add last info:" + weightInfos, new Object[0]);
                } else {
                    manager.deleteInfoLocal(info3);
                    HMLog.i(this.a, "<<merge>> exsit last info:" + weightInfos, new Object[0]);
                }
                arrayList.add(weightInfos);
            }
        }
        return arrayList;
    }

    private int c(ArrayList<WeightAdvData> arrayList) {
        String str;
        WeightInfos weightInfos;
        int i = 0;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        WeightInfoManager manager = WeightInfoManager.getManager();
        UserInfoManager manager2 = UserInfoManager.getManager();
        ArrayList<WeightInfos> arrayList2 = new ArrayList<>();
        boolean zIsWeightMergeResult = HMPersonInfo.getInstance().getMiliConfig().isWeightMergeResult();
        boolean z = false;
        int i2 = 0;
        for (WeightAdvData weightAdvData : arrayList) {
            HMLog.i(this.a, "Weight data sync from device:" + weightAdvData, new Object[i]);
            if (HMWeightUtils.checkWeightTimeIsValid(weightAdvData.getTimestamp())) {
                String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(BodyfatProperty.PROPERTY_GUEST_WEIGHTING_TIME_SETTING, "");
                if (TextUtils.isEmpty(property) || !property.contains(String.valueOf(weightAdvData.getTimestamp() / 1000))) {
                    WeightInfos info = manager.getInfo(weightAdvData.getTimestamp(), true);
                    UserInfos info2 = null;
                    if (info == null) {
                        str = "";
                    } else if (WeightInfoManager.isInfoUncertainDelete(info)) {
                        manager.deleteInfoLocal(info);
                    } else {
                        str = "";
                        info2 = manager2.getInfo(info.getUserId().longValue());
                        if (info2 == null) {
                            HMLog.i(this.a, "Should not go here!!!uid:" + info.getUserId(), new Object[i]);
                        }
                    }
                    if (info2 == null) {
                        List<UserInfos> listMatchUsers = HMWeightUtils.matchUsers(weightAdvData);
                        if (listMatchUsers == null) {
                            HMLog.i(this.a, "Drop no mathed weight data!!!", new Object[i]);
                        } else if (listMatchUsers.size() != 1) {
                            HMLog.i(this.a, "Drop the weight data that matched more than one user!!!", new Object[i]);
                        } else {
                            info2 = listMatchUsers.get(i);
                        }
                    }
                    UserInfos userInfos = info2;
                    try {
                        if (!HMLoginManager.isInNonContinental() || userInfos.getUserId().equals(HMPersonInfo.getInstance().getUserInfo().getUserid())) {
                            weightInfos = info;
                        } else {
                            if (HMLoginManager.isAdult()) {
                                weightInfos = info;
                            } else {
                                weightInfos = info;
                                try {
                                    if (!HMLoginManager.isAdult(BodyParamsUtils.getWeightAge(weightAdvData.getTimestamp(), userInfos.getBirthday()))) {
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    e.printStackTrace();
                                    HMLog.i(this.a, str + e.toString(), new Object[0]);
                                }
                            }
                            if (!HMLoginManager.isAdult() || HMLoginManager.isAdult(BodyParamsUtils.getWeightAge(weightAdvData.getTimestamp(), userInfos.getBirthday())) || DeviceXFunctionsKt.getPropertyStoreApi().getPropertyToWeightPermission(userInfos.getUserId())) {
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        weightInfos = info;
                    }
                    WeightInfos weightInfos2 = new WeightInfos(Long.valueOf(Long.parseLong(userInfos.getUserId())));
                    weightInfos2.setSync(0);
                    weightInfos2.setUserId(Long.valueOf(Long.parseLong(userInfos.getUserId())));
                    weightInfos2.setTimestamp(Long.valueOf(weightAdvData.getTimestamp()));
                    weightInfos2.setWeight(Float.valueOf(weightAdvData.getValueKg()));
                    weightInfos2.setDevice_id(weightAdvData.getDeviceId());
                    weightInfos2.setType(0);
                    weightInfos2.setSource(Integer.valueOf(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WEIGHT).getValue()));
                    UserInfoManager userInfoManager = manager2;
                    HMLog.i(this.a, "before currentWinfo : " + HMWeightUtils.toString(weightInfos2), new Object[0]);
                    if (weightAdvData.isImpedanceStable()) {
                        weightInfos2 = BodyParamsUtils.addBodyParams(weightInfos2, weightAdvData, Long.parseLong(userInfos.getUserId()));
                    } else {
                        int iIntValue = userInfos.getHeight().intValue();
                        weightInfos2.setBmi(Float.valueOf(HMWeightUtils.calcuBMI(iIntValue, weightInfos2.getWeight().floatValue())));
                        weightInfos2.setHeight(Integer.valueOf(iIntValue));
                    }
                    HMLog.i(this.a, "after  currentWinfo : " + HMWeightUtils.toString(weightInfos2), new Object[0]);
                    if (zIsWeightMergeResult) {
                        a(weightInfos2);
                    } else {
                        i2++;
                        if (weightInfos != null) {
                            i2--;
                            if (weightInfos.getSync().intValue() == 2) {
                                manager.deleteInfoLocal(weightInfos);
                                arrayList2.add(weightInfos2);
                            }
                        } else {
                            arrayList2.add(weightInfos2);
                        }
                    }
                    if (userInfos.getUserId().equals(HMPersonInfo.getInstance().getUserInfo().getUserid())) {
                        if (!this.f.getValue().shouldHideDiscovery() && this.e.getValue().isQQLoginValid()) {
                            weightInfos2.setSync_qqhealth(0);
                        }
                        z = true;
                    }
                    manager2 = userInfoManager;
                    i = 0;
                }
            }
        }
        if (zIsWeightMergeResult) {
            this.d = 0;
            arrayList2 = b(this.c);
            i2 = this.d;
        }
        if (arrayList2.size() > 0) {
            manager.addInfos(arrayList2);
            EventBus.getDefault().post(new EventWeightChanged(8));
            if (z) {
                EventBus.getDefault().post(new EventWeightChanged(Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid()), 7));
            }
        }
        return i2;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(boolean z) {
        super.onFinish(z);
        HMLog.i(this.a, "onFinish:" + z, new Object[0]);
        EventBus.getDefault().postSticky(new HMDeviceSyncDataEvent(this.b, 2, new Progress()));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onProgress(Progress progress) {
        HMLog.i(this.a, "onProgress:" + progress, new Object[0]);
        super.onProgress(progress);
        EventBus.getDefault().postSticky(new HMDeviceSyncDataEvent(this.b, 1, progress));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onStart() {
        super.onStart();
        HMLog.i(this.a, "onStart", new Object[0]);
        EventBus.getDefault().postSticky(new HMDeviceSyncDataEvent(this.b, 0, new Progress()));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(WeightSyncResult weightSyncResult) {
        super.onData(weightSyncResult);
        HMLog.i(this.a, "onData:" + weightSyncResult, new Object[0]);
        if (weightSyncResult.datas != null) {
            HMLog.i(this.a, "onData before save size:" + weightSyncResult.datas.size(), new Object[0]);
            int iC = c(weightSyncResult.datas);
            HMLog.i(this.a, "onData after save size:" + iC, new Object[0]);
        } else {
            HMLog.i(this.a, "onData null", new Object[0]);
        }
        HMDeviceManager.getInstance().setBoundDeviceSyncTime(this.b, Calendar.getInstance());
    }
}
