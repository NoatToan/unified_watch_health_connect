package com.huawei.health.device.fatscale.multiusers;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import defpackage.dnb;
import defpackage.dnd;
import defpackage.dxm;
import defpackage.dym;
import defpackage.etn;
import defpackage.njy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum WeightDataManager {
    INSTANCE;

    private static final int COMPARE_WEIGHT_BEAN_ERROR_VALUE = -1;
    private static final String DATABASE_NAME = "stand.db";
    private static final String TAG = "WeightDataManager";
    private static final Object LOCK = new Object();
    private boolean mIsShowView = true;
    private boolean mIsInitFlag = true;
    private Map<String, List<dnb>> mUserWeightDataMap = Collections.synchronizedMap(new HashMap());

    WeightDataManager() {
        dnd.c();
    }

    public boolean getShowView() {
        return this.mIsShowView;
    }

    public boolean getInitFlag() {
        return this.mIsInitFlag;
    }

    public void setInitFlag(boolean z) {
        this.mIsInitFlag = ((Boolean) dym.d(Boolean.valueOf(z))).booleanValue();
    }

    public Map<String, List<dnb>> getUserWeightDataMap() {
        return this.mUserWeightDataMap;
    }

    public List<dnb> getSingleUserWeightData(String str, boolean z) {
        ArrayList arrayList;
        synchronized (LOCK) {
            List<dnb> arrayList2 = this.mUserWeightDataMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
            if (z && arrayList.size() > 1) {
                Collections.sort(arrayList, getComparator());
            }
        }
        return arrayList;
    }

    private Comparator getComparator() {
        return new Comparator<dnb>() { // from class: com.huawei.health.device.fatscale.multiusers.WeightDataManager.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(dnb dnbVar, dnb dnbVar2) {
                if (dnbVar == null) {
                    return -1;
                }
                return (dnbVar2 != null && dnbVar2.ax() - dnbVar.ax() <= 0) ? -1 : 1;
            }
        };
    }

    public void readAllWeightDataOfUser() {
        readWeightDataByDate();
    }

    public void readWeightDataByDate() {
        MultiUsersManager.INSTANCE.getOtherUserBaseData();
    }

    public void setDataList(boolean z, List<HiHealthData> list) {
        dnb weightBean;
        synchronized (LOCK) {
            if (list != null) {
                Map<String, List<dnb>> map = this.mUserWeightDataMap;
                if (map != null) {
                    if (z) {
                        map.clear();
                    }
                    LogUtil.a(TAG, "testReadWeightData dataList.size=", Integer.valueOf(list.size()));
                    if (list.size() > 0) {
                        for (HiHealthData hiHealthData : list) {
                            if (!"-1".equals(hiHealthData.getMetaData()) && (weightBean = getWeightBean(hiHealthData)) != null) {
                                setMapData(weightBean, hiHealthData.getMetaData());
                            }
                        }
                    }
                    return;
                }
            }
            LogUtil.a(TAG, "testReadWeightData return dataList or userWeightDataMap is null");
        }
    }

    public void setDataList(List<HiHealthData> list) {
        setDataList(true, list);
    }

    public void setMapData(dnb dnbVar, String str) {
        if (str == null || str.length() == 0 || Constants.NULL.equalsIgnoreCase(str) || "0".equals(str)) {
            str = MultiUsersManager.INSTANCE.getMainUser().i();
        }
        List<dnb> arrayList = this.mUserWeightDataMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.contains(dnbVar)) {
            arrayList.add(dnbVar);
        }
        this.mUserWeightDataMap.put(str, arrayList);
        this.mIsInitFlag = true;
    }

    public void removeMapData(String str, List<dnb> list) {
        synchronized (LOCK) {
            List<dnb> list2 = this.mUserWeightDataMap.get(str);
            if (njy.b(list2)) {
                if (njy.b(list)) {
                    list2.removeAll(list);
                }
                this.mUserWeightDataMap.put(str, list2);
            }
            this.mIsInitFlag = true;
        }
    }

    private dnb getWeightBean(HiHealthData hiHealthData) {
        if (hiHealthData.getDouble("bodyWeight") <= 0.0d) {
            return null;
        }
        dnb dnbVar = new dnb();
        setWeightBeanData(hiHealthData, dnbVar);
        String[] strArr = {"lfrfImpedance", "lhrhImpedance", "lhlfImpedance", "lhrfImpedance", "rhlfImpedance", "rhrfImpedance"};
        double[] dArr = new double[6];
        for (int i = 0; i < 6; i++) {
            dArr[i] = hiHealthData.getDouble(strArr[i]);
        }
        if (dxm.b(hiHealthData)) {
            double[] dArr2 = new double[6];
            String[] strArr2 = {"lfrfHfImpedance", "lhrhHfImpedance", "lhlfHfImpedance", "lhrfHfImpedance", "rhlfHfImpedance", "rhrfHfImpedance"};
            for (int i2 = 0; i2 < 6; i2++) {
                dArr2[i2] = hiHealthData.getDouble(strArr2[i2]);
            }
            dnbVar.d(dArr2);
            dnbVar.a(2);
        }
        dnbVar.c(dArr);
        dnbVar.e(hiHealthData.getStartTime());
        dnbVar.d(hiHealthData.getEndTime());
        return dnbVar;
    }

    private void setWeightBeanData(HiHealthData hiHealthData, dnb dnbVar) {
        dnbVar.af(hiHealthData.getDouble("bodyWeight"));
        dnbVar.d(hiHealthData.getDouble(BleConstants.BODY_FAT_RATE));
        dnbVar.e(hiHealthData.getDouble("bodyFat"));
        dnbVar.v(hiHealthData.getDouble(BleConstants.IMPEDANCE));
        dnbVar.aa(hiHealthData.getDouble(BleConstants.MOISTURE));
        dnbVar.ag(hiHealthData.getDouble(BleConstants.MOISTURE_RATE));
        dnbVar.l(hiHealthData.getDouble(BleConstants.VISCERAL_FAT_LEVEL));
        dnbVar.h(hiHealthData.getDouble(BleConstants.BONE_SALT));
        dnbVar.c(hiHealthData.getDouble(BleConstants.BMI));
        dnbVar.b(hiHealthData.getDouble(BleConstants.BASAL_METABOLISM));
        dnbVar.p(hiHealthData.getDouble(BleConstants.MUSCLE_MASS));
        dnbVar.s(etn.a(hiHealthData));
        dnbVar.j(hiHealthData.getDouble(BleConstants.BODY_SCORE));
        dnbVar.a(hiHealthData.getDouble(BleConstants.BODY_AGE));
        dnbVar.o(hiHealthData.getDouble(IndoorEquipManagerApi.KEY_HEART_RATE));
        dnbVar.t(hiHealthData.getDouble("pressure"));
        dnbVar.ab(hiHealthData.getDouble("skeletalMusclelMass"));
        dnbVar.e(hiHealthData.getInt("age"));
        dnbVar.c(hiHealthData.getInt("height"));
        dnbVar.c((byte) hiHealthData.getInt(CommonConstant.KEY_GENDER));
        dnbVar.d(hiHealthData.getInt("trackdata_deviceType"));
        dnbVar.f(hiHealthData.getInt("pole"));
        dnbVar.k(hiHealthData.getDouble("leftArmFatMass"));
        dnbVar.q(hiHealthData.getDouble("leftArmMuscleMass"));
        dnbVar.n(hiHealthData.getDouble("leftLegFatMass"));
        dnbVar.m(hiHealthData.getDouble("leftLegMuscleMass"));
        dnbVar.y(hiHealthData.getDouble("rightArmFatMass"));
        dnbVar.ad(hiHealthData.getDouble("rightArmMuscleMass"));
        dnbVar.x(hiHealthData.getDouble("rightLegFatMass"));
        dnbVar.w(hiHealthData.getDouble("rightLegMuscleMass"));
        dnbVar.ac(hiHealthData.getDouble("trunkFatMass"));
        dnbVar.z(hiHealthData.getDouble("trunkMuscleMass"));
        dnbVar.ae(hiHealthData.getDouble("waistHipRatio"));
        dnbVar.u(hiHealthData.getDouble("rasm"));
        dnbVar.i(hiHealthData.getDouble("bodySize"));
        dnbVar.f(hiHealthData.getDouble("bodyShape"));
        dnbVar.g(hiHealthData.getDouble("fatBalance"));
        dnbVar.r(hiHealthData.getDouble("muscleBalance"));
    }

    public String getHealthAdvice(int i, int i2, int i3) {
        String[] strArr = {calcHealthId(i, i2, i3)};
        dnd dndVarB = dnd.b();
        String string = "";
        if (dndVarB == null) {
            LogUtil.j(TAG, "assets database manager is null");
            return "";
        }
        SQLiteDatabase sQLiteDatabaseB = dndVarB.b(DATABASE_NAME);
        if (sQLiteDatabaseB == null) {
            LogUtil.e(TAG, "get db error the database map is null");
            return "";
        }
        if (!sQLiteDatabaseB.isOpen()) {
            sQLiteDatabaseB = dndVarB.d(DATABASE_NAME);
        }
        if (sQLiteDatabaseB != null) {
            Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("select * from data_body_stand where id = ?", strArr);
            while (cursorRawQuery.moveToNext()) {
                string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("trend_text"));
            }
            cursorRawQuery.close();
        }
        dndVarB.c(DATABASE_NAME);
        return string;
    }

    private String calcHealthId(int i, int i2, int i3) {
        return ((i * 12) + (i2 * 3) + i3 + 1) + "";
    }
}
