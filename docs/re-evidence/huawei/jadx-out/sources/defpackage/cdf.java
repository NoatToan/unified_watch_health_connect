package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.basichealthmodel.cloud.bean.Record;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cdf {
    public static String d(ArrayList<HealthLifeBean> arrayList) {
        if (njy.e(arrayList)) {
            return "";
        }
        for (HealthLifeBean healthLifeBean : arrayList) {
            if (healthLifeBean != null && healthLifeBean.getId() == 1) {
                return healthLifeBean.getTarget();
            }
        }
        return "";
    }

    public static HealthLifeBean a(SparseArray<HealthLifeBean> sparseArray) {
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.j("HL_HealthTaskUtil", "getCloverData list is empty");
            return null;
        }
        for (HealthLifeBean healthLifeBean : c(sparseArray)) {
            if (healthLifeBean != null && healthLifeBean.getId() == 1) {
                return healthLifeBean;
            }
        }
        return null;
    }

    public static SparseArray<HealthLifeBean> c(List<HealthLifeBean> list) {
        if (njy.e(list)) {
            LogUtil.j("HL_HealthTaskUtil", "convertHealthLifeArray beanList is empty");
            return new SparseArray<>();
        }
        SparseArray<HealthLifeBean> sparseArray = new SparseArray<>();
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                sparseArray.put(healthLifeBean.getId(), healthLifeBean);
            }
        }
        return sparseArray;
    }

    public static ArrayList<HealthLifeBean> c(SparseArray<HealthLifeBean> sparseArray) {
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.j("HL_HealthTaskUtil", "convertHealthLifeList list is null.");
            return new ArrayList<>();
        }
        return (ArrayList) new Gson().fromJson(d(sparseArray), new TypeToken<List<HealthLifeBean>>() { // from class: com.huawei.basichealthmodel.util.HealthTaskUtil$1
        }.getType());
    }

    public static String d(SparseArray<HealthLifeBean> sparseArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            HealthLifeBean healthLifeBean = sparseArray.get(iKeyAt);
            if (healthLifeBean != null) {
                if (iKeyAt == 5) {
                    healthLifeBean.setTarget("1");
                }
                if (iKeyAt != 4) {
                    arrayList.add(healthLifeBean);
                }
            }
        }
        return new Gson().toJson(arrayList);
    }

    public static Record c(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_HealthTaskUtil", "convertSubscriptionToRecordBean healthTaskBean is null.");
            return null;
        }
        int id = healthLifeBean.getId();
        String target = healthLifeBean.getTarget();
        if ((id == 11 || id == 12) && TextUtils.isEmpty(target)) {
            target = String.valueOf(0);
        }
        Record record = new Record();
        record.setId(id);
        record.setLastTarget(healthLifeBean.getLastTarget());
        record.setTarget(target);
        record.setRecordDay(healthLifeBean.getRecordDay());
        record.setTimeZone(healthLifeBean.getTimeZone());
        record.setTimestamp(healthLifeBean.getTimestamp());
        record.setDataSource(Integer.valueOf(healthLifeBean.getDataSource()));
        int taskType = healthLifeBean.getTaskType();
        record.setTaskType(taskType == 0 ? null : Integer.valueOf(taskType));
        int challengeId = healthLifeBean.getChallengeId();
        record.setChallengeId(challengeId >= 200001 ? Integer.valueOf(challengeId) : null);
        return record;
    }
}
