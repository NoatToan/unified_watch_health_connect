package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.health.device.api.WeightDataUtilsApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eti {
    public static void e(final Handler handler, String str) {
        if (handler == null || TextUtils.isEmpty(str)) {
            LogUtil.j("HealthDataQueryUtils", "queryLastUricAcidData handler = null or uniqueId is empty");
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setCount(1);
        hiDataReadOption.setDeviceUuid(str);
        hiDataReadOption.setReadType(2);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(new int[]{2109});
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: eti.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                eti.d((SparseArray<Object>) obj, handler);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("HealthDataQueryUtils", "queryLastUricAcidData onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(SparseArray<Object> sparseArray, Handler handler) {
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.a("HealthDataQueryUtils", "queryLastUricAcidData map = null or map size =0 ");
            return;
        }
        Object obj = sparseArray.get(2109);
        HiHealthData hiHealthData = null;
        if (obj instanceof List) {
            for (HiHealthData hiHealthData2 : (List) obj) {
                if (hiHealthData2.getEndTime() < System.currentTimeMillis()) {
                    hiHealthData = hiHealthData2;
                }
            }
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = 106;
        messageObtainMessage.obj = hiHealthData;
        handler.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Handler handler, int i, Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = obj;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public static void b(Handler handler, int i) {
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(((WeightDataUtilsApi) Services.b("PluginDevice", WeightDataUtilsApi.class)).buildHiAggregateOption(), new c(handler, i));
    }

    public static void c(Handler handler, int i) {
        HiAggregateOption hiAggregateOptionA = a();
        hiAggregateOptionA.setStartTime(0L);
        hiAggregateOptionA.setEndTime(System.currentTimeMillis());
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionA, new c(handler, i));
    }

    public static void d(Handler handler, int i) {
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(b(HiHealthDataType.d), new d(handler, i, HiHealthDataType.d));
    }

    public static void a(Handler handler, int i) {
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(b(2103), new d(handler, i, 2103));
    }

    private static HiAggregateOption a() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{2006, 2007});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    private static HiDataReadOption b(int i) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setCount(1);
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(new int[]{i});
        return hiDataReadOption;
    }

    static class c implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f33453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f33454c;

        c(Handler handler, int i) {
            this.f33453b = handler;
            this.f33454c = i;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.a("HealthDataQueryUtils", "query onResult called");
            if (!njy.e(list)) {
                eti.c(this.f33453b, this.f33454c, list.get(0));
                return;
            }
            LogUtil.j("HealthDataQueryUtils", "query onResult data is null");
            Message.obtain().what = 103;
            eti.c(this.f33453b, 103, null);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("HealthDataQueryUtils", "onResultIntent errorCode = ", Integer.valueOf(i2));
        }
    }

    static class d implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f33455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f33456b;
        private int d;

        d(Handler handler, int i, int i2) {
            this.f33455a = handler;
            this.f33456b = i;
            this.d = i2;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("HealthDataQueryUtils", "DataReadResultListener onResult mQueryType: ", Integer.valueOf(this.d), " onResult called");
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    eti.c(this.f33455a, 103, null);
                } else if (sparseArray.get(this.d) instanceof ArrayList) {
                    eti.c(this.f33455a, this.f33456b, ((ArrayList) sparseArray.get(this.d)).get(0));
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("HealthDataQueryUtils", "DataReadResultListener onResultIntent mQueryType: ", Integer.valueOf(this.d), " onResultIntent errorCode = ", Integer.valueOf(i2));
        }
    }
}
