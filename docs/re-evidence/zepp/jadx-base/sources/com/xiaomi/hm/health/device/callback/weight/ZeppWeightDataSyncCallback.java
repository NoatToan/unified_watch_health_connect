package com.xiaomi.hm.health.device.callback.weight;

import android.text.TextUtils;
import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.other.QQLoginApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightSyncUtilsKt;
import com.xiaomi.hm.health.bodyfat.property.BodyfatProperty;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
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
public class ZeppWeightDataSyncCallback extends HMCallback<WeightSyncResult> {
    public static final int MERGE_TIME_DELTA = 30000;
    private final String a = "MyWeightDataSyncCallback";
    private HMDeviceType b = HMDeviceType.WEIGHT;
    private HashMap<Long, ArrayList<WeightInfos>> c = new HashMap<>();
    private int d = 0;
    private final Lazy<QQLoginApi> e = KoinJavaComponent.inject(QQLoginApi.class);

    private WeightInfos a(WeightAdvData weightAdvData) {
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setSync(0);
        weightInfos.setUserId(Long.valueOf(WeightSyncUtilsKt.NO_OWNER_DATE_ID));
        weightInfos.setTimestamp(Long.valueOf(weightAdvData.getTimestamp()));
        weightInfos.setWeight(Float.valueOf(weightAdvData.getValueKg()));
        weightInfos.setDevice_id(weightAdvData.getDeviceId());
        weightInfos.setType(0);
        weightInfos.setPressure(weightAdvData.getMeasureData().getPressure());
        weightInfos.setHeartRate(weightAdvData.getMeasureData().getHeartRate());
        weightInfos.setImpedance(Integer.valueOf(weightAdvData.getMeasureData().getImpedance()));
        weightInfos.setSource(Integer.valueOf(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.WEIGHT).getValue()));
        return weightInfos;
    }

    private WeightInfos b(UserInfos userInfos, WeightAdvData weightAdvData) {
        WeightInfos weightInfos = new WeightInfos(Long.valueOf(Long.parseLong(userInfos.getUserId())));
        weightInfos.setSync(0);
        weightInfos.setUserId(Long.valueOf(Long.parseLong(userInfos.getUserId())));
        weightInfos.setTimestamp(Long.valueOf(weightAdvData.getTimestamp()));
        weightInfos.setWeight(Float.valueOf(weightAdvData.getValueKg()));
        weightInfos.setDevice_id(weightAdvData.getDeviceId());
        weightInfos.setType(0);
        if (weightAdvData.getMeasureData() != null) {
            weightInfos.setHeartRate(weightAdvData.getMeasureData().getHeartRate());
            weightInfos.setPressure(weightAdvData.getMeasureData().getPressure());
        }
        weightInfos.setSource(Integer.valueOf(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.WEIGHT).getValue()));
        HMLog.i("MyWeightDataSyncCallback", "before currentWinfo : " + HMWeightUtils.toString(weightInfos), new Object[0]);
        if (weightAdvData.isImpedanceStable() || (weightAdvData.getMeasureData() != null && weightAdvData.getMeasureData().getImpedance() > 0)) {
            weightInfos = BodyParamsUtils.addBodyParams(weightInfos, weightAdvData, Long.parseLong(userInfos.getUserId()));
        } else {
            int iIntValue = userInfos.getHeight().intValue();
            weightInfos.setBmi(Float.valueOf(HMWeightUtils.calcuBMI(iIntValue, weightInfos.getWeight().floatValue())));
            weightInfos.setHeight(Integer.valueOf(iIntValue));
        }
        HMLog.i("MyWeightDataSyncCallback", "after  currentWinfo : " + HMWeightUtils.toString(weightInfos), new Object[0]);
        return weightInfos;
    }

    private void c(WeightInfos weightInfos) {
        ArrayList<WeightInfos> arrayList = this.c.get(weightInfos.getUserId());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.c.put(weightInfos.getUserId(), arrayList);
            HMLog.i("MyWeightDataSyncCallback", "<<merge>> add to SparseArray:" + weightInfos.getUserId(), new Object[0]);
        }
        HMLog.i("MyWeightDataSyncCallback", "<<merge>> add to WeightInfo list:" + weightInfos, new Object[0]);
        arrayList.add(weightInfos);
    }

    private boolean d(long j) {
        if (!HMWeightUtils.checkWeightTimeIsValid(j)) {
            return true;
        }
        String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(BodyfatProperty.PROPERTY_GUEST_WEIGHTING_TIME_SETTING, "");
        return !TextUtils.isEmpty(property) && property.contains(String.valueOf(j / 1000));
    }

    private boolean e(UserInfos userInfos, WeightAdvData weightAdvData) {
        try {
            if (HMLoginManager.isInNonContinental() && !userInfos.getUserId().equals(HMPersonInfo.getInstance().getUserInfo().getUserid())) {
                if (HMLoginManager.isAdult() || HMLoginManager.isAdult(BodyParamsUtils.getWeightAge(weightAdvData.getTimestamp(), userInfos.getBirthday()))) {
                    return !HMLoginManager.isAdult() || HMLoginManager.isAdult(BodyParamsUtils.getWeightAge(weightAdvData.getTimestamp(), userInfos.getBirthday())) || DeviceXFunctionsKt.getPropertyStoreApi().getPropertyToWeightPermission(userInfos.getUserId());
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.i("MyWeightDataSyncCallback", "" + e.toString(), new Object[0]);
            return true;
        }
    }

    private UserInfos f(WeightAdvData weightAdvData) {
        UserInfos info;
        WeightInfoManager manager = WeightInfoManager.getManager();
        UserInfoManager manager2 = UserInfoManager.getManager();
        WeightInfos info2 = manager.getInfo(weightAdvData.getTimestamp(), true);
        if (info2 == null) {
            info = null;
        } else {
            if (WeightInfoManager.isInfoUncertainDelete(info2)) {
                manager.deleteInfoLocal(info2);
                return null;
            }
            info = manager2.getInfo(info2.getUserId().longValue());
            if (info == null) {
                HMLog.i("MyWeightDataSyncCallback", "Should not go here!!!uid:" + info2.getUserId(), new Object[0]);
            }
        }
        if (info != null) {
            return info;
        }
        List<UserInfos> listMatchUsers = HMWeightUtils.matchUsers(weightAdvData);
        if (listMatchUsers.size() == 1) {
            return listMatchUsers.get(0);
        }
        HMLog.i("MyWeightDataSyncCallback", "Drop the weight data that matched more than one user!!!", new Object[0]);
        return null;
    }

    private ArrayList<WeightInfos> g(HashMap<Long, ArrayList<WeightInfos>> map) {
        ArrayList<WeightInfos> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList(map.values());
        int size = arrayList2.size();
        WeightInfoManager manager = WeightInfoManager.getManager();
        for (int i = 0; i < size; i++) {
            WeightInfos weightInfos = null;
            for (WeightInfos weightInfos2 : (ArrayList) arrayList2.get(i)) {
                if (weightInfos2.getUserId().longValue() == 0) {
                    HMLog.i("MyWeightDataSyncCallback", "<<merge>> USER_ID_UNKNOWN:" + weightInfos2, new Object[0]);
                    arrayList.add(weightInfos2);
                } else {
                    if (weightInfos == null) {
                        HMLog.i("MyWeightDataSyncCallback", "<<merge>> lastInfo is null", new Object[0]);
                    } else if (Math.abs(weightInfos2.getTimestamp().longValue() - weightInfos.getTimestamp().longValue()) <= 30000) {
                        HMLog.i("MyWeightDataSyncCallback", "<<merge>> ignore last info", new Object[0]);
                        WeightInfos info = manager.getInfo(weightInfos.getTimestamp().longValue());
                        if (info != null) {
                            HMLog.i("MyWeightDataSyncCallback", "<<merge>> delete last info", new Object[0]);
                            manager.deleteInfoLocal(info);
                        }
                    } else {
                        WeightInfos info2 = manager.getInfo(weightInfos.getTimestamp().longValue());
                        if (info2 == null) {
                            this.d++;
                            HMLog.i("MyWeightDataSyncCallback", "<<merge>> add last info:" + weightInfos, new Object[0]);
                        } else {
                            manager.deleteInfoLocal(info2);
                            HMLog.i("MyWeightDataSyncCallback", "<<merge>> exsit last info:" + weightInfos, new Object[0]);
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
                    HMLog.i("MyWeightDataSyncCallback", "<<merge>> add last info:" + weightInfos, new Object[0]);
                } else {
                    manager.deleteInfoLocal(info3);
                    HMLog.i("MyWeightDataSyncCallback", "<<merge>> exsit last info:" + weightInfos, new Object[0]);
                }
                arrayList.add(weightInfos);
            }
        }
        return arrayList;
    }

    private void h(ArrayList<WeightInfos> arrayList, boolean z) {
        WeightInfoManager manager = WeightInfoManager.getManager();
        if (arrayList.size() > 0) {
            manager.addInfos(arrayList);
            EventBus.getDefault().post(new EventWeightChanged(8));
            if (z) {
                EventBus.getDefault().post(new EventWeightChanged(Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid()), 7));
            }
        }
    }

    private int i(ArrayList<WeightAdvData> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        WeightInfoManager manager = WeightInfoManager.getManager();
        ArrayList<WeightInfos> arrayList2 = new ArrayList<>();
        boolean z = false;
        for (WeightAdvData weightAdvData : arrayList) {
            HMLog.d("MyWeightDataSyncCallback", "Weight data sync from device:" + weightAdvData, new Object[0]);
            if (d(weightAdvData.getTimestamp())) {
                HMLog.i("MyWeightDataSyncCallback", "ignore for invalid timestamp", new Object[0]);
            } else if (weightAdvData.getMeasureData() == null || weightAdvData.getMeasureData().getFamilyId() < 0) {
                HMLog.i("MyWeightDataSyncCallback", "无有效数据", new Object[0]);
            } else if (weightAdvData.getMeasureData().getFamilyId() == WeightSyncUtilsKt.NO_OWNER_DATE_ID) {
                WeightInfos weightInfosA = a(weightAdvData);
                weightInfosA.setDevice_id(weightAdvData.getMacAddress());
                arrayList2.add(weightInfosA);
            } else {
                UserInfos info = UserInfoManager.getManager().getInfo(weightAdvData.getMeasureData().getFamilyId());
                if (info == null) {
                    HMLog.i("MyWeightDataSyncCallback", "Invalid member ID", new Object[0]);
                } else if (e(info, weightAdvData)) {
                    WeightInfos weightInfosB = b(info, weightAdvData);
                    WeightInfos info2 = manager.getInfo(weightAdvData.getTimestamp(), true);
                    if (info2 == null) {
                        arrayList2.add(weightInfosB);
                    } else if (info2.getSync().intValue() == 2) {
                        manager.deleteInfoLocal(info2);
                        arrayList2.add(weightInfosB);
                    }
                    if (info.getUserId().equals(HMPersonInfo.getInstance().getUserInfo().getUserid())) {
                        if (this.e.getValue().isQQLoginValid()) {
                            weightInfosB.setSync_qqhealth(0);
                        }
                        z = true;
                    }
                } else {
                    HMLog.i("MyWeightDataSyncCallback", "Oh, gdpr check not pass", new Object[0]);
                }
            }
        }
        h(arrayList2, z);
        return arrayList2.size();
    }

    private int j(ArrayList<WeightAdvData> arrayList) {
        return ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.WEIGHT).getValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue() ? i(arrayList) : k(arrayList);
    }

    private int k(ArrayList<WeightAdvData> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        WeightInfoManager manager = WeightInfoManager.getManager();
        ArrayList<WeightInfos> arrayList2 = new ArrayList<>();
        boolean zIsWeightMergeResult = HMPersonInfo.getInstance().getMiliConfig().isWeightMergeResult();
        int i = 0;
        boolean z = false;
        for (WeightAdvData weightAdvData : arrayList) {
            HMLog.d("MyWeightDataSyncCallback", "Weight data sync from device:" + weightAdvData, new Object[0]);
            if (d(weightAdvData.getTimestamp())) {
                HMLog.i("MyWeightDataSyncCallback", "ignore for invalid timestamp", new Object[0]);
            } else {
                UserInfos userInfosF = f(weightAdvData);
                if (userInfosF != null) {
                    if (e(userInfosF, weightAdvData)) {
                        WeightInfos weightInfosB = b(userInfosF, weightAdvData);
                        if (zIsWeightMergeResult) {
                            c(weightInfosB);
                        } else {
                            i++;
                            WeightInfos info = manager.getInfo(weightAdvData.getTimestamp(), true);
                            if (info != null) {
                                i--;
                                if (info.getSync().intValue() == 2) {
                                    manager.deleteInfoLocal(info);
                                    arrayList2.add(weightInfosB);
                                }
                            } else {
                                arrayList2.add(weightInfosB);
                            }
                        }
                        if (userInfosF.getUserId().equals(HMPersonInfo.getInstance().getUserInfo().getUserid())) {
                            if (this.e.getValue().isQQLoginValid()) {
                                weightInfosB.setSync_qqhealth(0);
                            }
                            z = true;
                        }
                    } else {
                        HMLog.i("MyWeightDataSyncCallback", "Oh, gdpr check not pass", new Object[0]);
                    }
                }
            }
        }
        if (zIsWeightMergeResult) {
            this.d = 0;
            arrayList2 = g(this.c);
            i = this.d;
        }
        h(arrayList2, z);
        return i;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(boolean z) {
        super.onFinish(z);
        HMLog.d("MyWeightDataSyncCallback", "onFinish:" + z, new Object[0]);
        EventBus.getDefault().postSticky(new HMDeviceSyncDataEvent(this.b, 2, new Progress()));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onProgress(Progress progress) {
        HMLog.d("MyWeightDataSyncCallback", "onProgress:" + progress, new Object[0]);
        super.onProgress(progress);
        EventBus.getDefault().postSticky(new HMDeviceSyncDataEvent(this.b, 1, progress));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onStart() {
        super.onStart();
        HMLog.d("MyWeightDataSyncCallback", "onStart", new Object[0]);
        EventBus.getDefault().postSticky(new HMDeviceSyncDataEvent(this.b, 0, new Progress()));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(WeightSyncResult weightSyncResult) {
        super.onData(weightSyncResult);
        HMLog.i("MyWeightDataSyncCallback", "onData:" + weightSyncResult, new Object[0]);
        if (weightSyncResult.datas != null) {
            HMLog.i("MyWeightDataSyncCallback", "onData before save size:" + weightSyncResult.datas.size(), new Object[0]);
            HMLog.i("MyWeightDataSyncCallback", "onData after save size:" + j(weightSyncResult.datas), new Object[0]);
        } else {
            HMLog.i("MyWeightDataSyncCallback", "onData null", new Object[0]);
        }
        ManagerFunctionsKt.getDeviceTimeStoreApi().setBoundDeviceSyncTime(this.b, Calendar.getInstance());
    }
}
