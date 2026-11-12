package defpackage;

import android.util.SparseArray;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.taskplatform.TaskEnum;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class iio extends iiz {
    public iio(TaskEnum taskEnum) {
        super(taskEnum);
    }

    @Override // defpackage.iiz, com.huawei.health.taskplatform.task.BaseTask
    public String getTag() {
        return "TaskPlatform_AvgDailyPressure";
    }

    @Override // defpackage.iiz, com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiHealthType() {
        List<Integer> hiHealthType = super.getHiHealthType();
        hiHealthType.add(2034);
        return hiHealthType;
    }

    @Override // defpackage.iiz, com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiStatType() {
        List<Integer> hiStatType = super.getHiStatType();
        hiStatType.add(44306);
        return hiStatType;
    }

    @Override // defpackage.iiz, com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getSubscribeType() {
        List<Integer> subscribeType = super.getSubscribeType();
        subscribeType.add(14);
        return subscribeType;
    }

    @Override // defpackage.iiz, com.huawei.health.taskplatform.task.BaseTask
    public boolean isSubscribeType(int i) {
        return super.isSubscribeType(i) || i == 14;
    }

    @Override // defpackage.iiz, com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(final int i, List<String> list, final qfk qfkVar, final ResponseCallback<List<String>> responseCallback) {
        if (!isNeedUpdate(list, TaskEnum.AVG_DAILY_PRESSURE.getTaskId())) {
            onResponse(responseCallback, 0, Collections.EMPTY_LIST);
        } else {
            b(i, new ResponseCallback() { // from class: iip
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.d.d(i, qfkVar, responseCallback, i2, (Integer) obj);
                }
            });
        }
    }

    /* synthetic */ void d(final int i, final qfk qfkVar, final ResponseCallback responseCallback, final int i2, final Integer num) {
        String strRefreshObjectiveResult;
        if (b(i, num.intValue())) {
            if (num.intValue() <= 0) {
                strRefreshObjectiveResult = "";
            } else {
                strRefreshObjectiveResult = refreshObjectiveResult(i, qfkVar, String.valueOf(num), 1, "");
            }
            onResponse(responseCallback, i2, Collections.singletonList(strRefreshObjectiveResult));
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: iim
            @Override // java.lang.Runnable
            public final void run() {
                this.f37655a.e(i, qfkVar, num, responseCallback, i2);
            }
        });
    }

    /* synthetic */ void e(final int i, final qfk qfkVar, final Integer num, final ResponseCallback responseCallback, final int i2) {
        a(i, new ResponseCallback() { // from class: iir
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i3, Object obj) {
                this.f37673b.a(i, qfkVar, num, responseCallback, i2, i3, (Integer) obj);
            }
        });
    }

    /* synthetic */ void a(int i, qfk qfkVar, Integer num, ResponseCallback responseCallback, int i2, int i3, Integer num2) {
        onResponse(responseCallback, i2, Collections.singletonList(refreshObjectiveResult(i, qfkVar, String.valueOf(num), num2.intValue() > 0 ? 1 : 0, "")));
    }

    private void b(int i, final ResponseCallback<Integer> responseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(String.valueOf(i), String.valueOf(i), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setSortOrder(0);
        hiDataReadOption.setType(new int[]{44306});
        HiHealthManager.d(this.mContext).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: iio.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                LogUtil.a("TaskPlatform_AvgDailyPressure", "readHiHealthData errorCode = ", Integer.valueOf(i2));
                if (!(obj instanceof SparseArray)) {
                    responseCallback.onResponse(i2, 0);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    responseCallback.onResponse(i2, 0);
                } else {
                    Object obj2 = sparseArray.get(44306);
                    responseCallback.onResponse(i2, Integer.valueOf(njy.b(obj2, HiHealthData.class) ? ((HiHealthData) ((List) obj2).get(0)).getIntValue() : 0));
                }
            }
        });
    }

    private boolean b(int i, int i2) {
        return c(i) && i2 < 60 && i2 != 0;
    }

    private boolean c(int i) {
        if (i < DateFormatUtil.a(System.currentTimeMillis())) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis >= lsl.a(jCurrentTimeMillis, 18, 0);
    }
}
