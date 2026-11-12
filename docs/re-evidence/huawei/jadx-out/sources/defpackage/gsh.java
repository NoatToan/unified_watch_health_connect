package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.main.api.WeChatApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class gsh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f35977c = new Object();
    private static gsh e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f35978b;

    private gsh(Context context) {
        this.f35978b = null;
        if (context == null) {
            LogUtil.j("StepCounterDataHelper", "context is null");
            this.f35978b = BaseApplication.getContext();
        } else {
            this.f35978b = context;
        }
    }

    public static gsh a(Context context) {
        gsh gshVar;
        synchronized (f35977c) {
            if (e == null) {
                e = new gsh(context);
            }
            gshVar = e;
        }
        return gshVar;
    }

    public String a() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long jA = DateFormatUtil.a(System.currentTimeMillis());
        hiDataReadOption.setTimeInterval(String.valueOf(jA), String.valueOf(jA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setType(new int[]{2});
        final String[] strArr = {HiJsonUtil.d(new ArrayList())};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(this.f35978b).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: gsh.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (i == 0) {
                    strArr[0] = HiJsonUtil.d(gsh.this.e((List) ((SparseArray) obj).get(2)));
                } else {
                    LogUtil.e("StepCounterDataHelper", "Error query step counter, errorCode = ", Integer.valueOf(i));
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                countDownLatch.countDown();
            }
        });
        try {
            LogUtil.a("StepCounterDataHelper", "getStepCounterDetails await: ", Boolean.valueOf(countDownLatch.await(500L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e("StepCounterDataHelper", "getStepCounterDetails InterruptedException");
        }
        LogUtil.a("StepCounterDataHelper", "getStepCounterDetails: ", strArr[0]);
        return strArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<b> e(List<HiHealthData> list) {
        HashMap map = new HashMap();
        for (HiHealthData hiHealthData : list) {
            String string = hiHealthData.getString("device_model");
            if (TextUtils.isEmpty(string)) {
                string = hiHealthData.getString("device_name");
            }
            int intValue = hiHealthData.getIntValue();
            if (map.containsKey(string)) {
                map.put(string, Integer.valueOf(((Integer) map.get(string)).intValue() + intValue));
            } else {
                map.put(string, Integer.valueOf(intValue));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            arrayList.add(new b(str, ((Integer) map.get(str)).intValue()));
        }
        return arrayList;
    }

    public String d() {
        final String[] strArr = {""};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThreadPoolManager.c().execute(new Runnable() { // from class: gsh.1
            @Override // java.lang.Runnable
            public void run() {
                strArr[0] = ((WeChatApi) Services.b("Main", WeChatApi.class)).isUserBinded(gsh.this.f35978b);
                countDownLatch.countDown();
            }
        });
        try {
            LogUtil.a("StepCounterDataHelper", "getUserBindStatus await: ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e("StepCounterDataHelper", "getUserBindStatus InterruptedException");
        }
        return strArr[0];
    }

    /* JADX INFO: loaded from: classes8.dex */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("deviceName")
        private String f35984a;

        @SerializedName("stepCounter")
        private int e;

        public b(String str, int i) {
            this.f35984a = str;
            this.e = i;
        }
    }
}
