package com.huawei.hihealth.motion.service;

import android.content.Context;
import android.util.Log;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.motion.service.healthdevice.HealthDeviceOper;
import com.huawei.hihealth.motion.service.healthdevice.IHealthDeviceOper;
import com.huawei.hihealth.motion.service.stepcounter.HwStepCounter;
import com.huawei.hihealth.motion.service.stepcounter.IHwStepCounter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public class OpenSDKServiceRegister {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, ServiceFetcher<?>> f12314b = new HashMap<>();
    private static ConcurrentHashMap<String, CopyOnWriteArraySet<HealthOpenSDK>> e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList<IExecuteResult> f12315c = new ArrayList<>();

    interface ServiceFetcher<T> {
        T getService(Context context);

        void release();
    }

    static {
        a("hwstepcounter", new CachedServiceFetcher<IHwStepCounter>("hwstepcounter") { // from class: com.huawei.hihealth.motion.service.OpenSDKServiceRegister.1
            @Override // com.huawei.hihealth.motion.service.OpenSDKServiceRegister.CachedServiceFetcher
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public IHwStepCounter createService(Context context, IExecuteResult iExecuteResult) {
                return HwStepCounter.b(context, iExecuteResult);
            }

            @Override // com.huawei.hihealth.motion.service.OpenSDKServiceRegister.CachedServiceFetcher
            protected void releaseService() {
                HwStepCounter.b();
            }
        });
        a("healthdeviceoper", new CachedServiceFetcher<IHealthDeviceOper>("healthdeviceoper") { // from class: com.huawei.hihealth.motion.service.OpenSDKServiceRegister.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.hihealth.motion.service.OpenSDKServiceRegister.CachedServiceFetcher
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public IHealthDeviceOper createService(Context context, IExecuteResult iExecuteResult) {
                return HealthDeviceOper.e(context, iExecuteResult);
            }

            @Override // com.huawei.hihealth.motion.service.OpenSDKServiceRegister.CachedServiceFetcher
            protected void releaseService() {
                HealthDeviceOper.c();
            }
        });
    }

    static abstract class CachedServiceFetcher<T> implements ServiceFetcher<T> {
        private static final Map<Class, Object> SERVICE_CACHE = new HashMap();
        private static final int STATUS_SERVICE_EXCEPTION = 2;
        private static final int STATUS_SERVICE_READY = 1;
        private String mName;

        protected abstract T createService(Context context, IExecuteResult iExecuteResult);

        protected abstract void releaseService();

        public CachedServiceFetcher(String str) {
            this.mName = str;
        }

        @Override // com.huawei.hihealth.motion.service.OpenSDKServiceRegister.ServiceFetcher
        public final T getService(Context context) {
            Map<Class, Object> map = SERVICE_CACHE;
            synchronized (map) {
                T tCreateService = (T) map.get(getClass());
                Log.d("HealthOpenSDK_OSSR", "getService service = " + tCreateService);
                if (tCreateService == null) {
                    if (context == null) {
                        return null;
                    }
                    tCreateService = createService(context, new IExecuteResult() { // from class: com.huawei.hihealth.motion.service.OpenSDKServiceRegister.CachedServiceFetcher.1
                        @Override // com.huawei.hihealth.motion.IExecuteResult
                        public void onFailed(Object obj) {
                        }

                        @Override // com.huawei.hihealth.motion.IExecuteResult
                        public void onSuccess(Object obj) {
                            CachedServiceFetcher.this.notifyServiceStatus(1, obj);
                        }

                        @Override // com.huawei.hihealth.motion.IExecuteResult
                        public void onServiceException(Object obj) {
                            CachedServiceFetcher.this.notifyServiceStatus(2, obj);
                        }
                    });
                    map.put(getClass(), tCreateService);
                }
                return tCreateService;
            }
        }

        @Override // com.huawei.hihealth.motion.service.OpenSDKServiceRegister.ServiceFetcher
        public void release() {
            Map<Class, Object> map = SERVICE_CACHE;
            synchronized (map) {
                if (map.get(getClass()) == null) {
                    Log.w("HealthOpenSDK_OSSR", "no need to release");
                } else {
                    releaseService();
                    map.put(getClass(), null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void notifyServiceStatus(int i, Object obj) {
            CopyOnWriteArraySet<HealthOpenSDK> copyOnWriteArraySet = (CopyOnWriteArraySet) OpenSDKServiceRegister.e.get(this.mName);
            if (copyOnWriteArraySet == null) {
                Log.w("HealthOpenSDK_OSSR", "HealthOpenSDK no init");
                return;
            }
            for (HealthOpenSDK healthOpenSDK : copyOnWriteArraySet) {
                if (2 == i) {
                    healthOpenSDK.b(obj);
                } else if (1 != i) {
                    Log.i("HealthOpenSDK_OSSR", "status no match");
                } else {
                    healthOpenSDK.d(obj);
                }
            }
        }
    }

    private OpenSDKServiceRegister() {
    }

    public static Object d(Context context, String str, HealthOpenSDK healthOpenSDK) {
        ServiceFetcher<?> serviceFetcher = f12314b.get(str);
        CopyOnWriteArraySet<HealthOpenSDK> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        if (e.get(str) == null) {
            Log.d("HealthOpenSDK_OSSR", "result =" + e.putIfAbsent(str, copyOnWriteArraySet));
        } else {
            copyOnWriteArraySet = e.get(str);
        }
        if (!copyOnWriteArraySet.contains(healthOpenSDK)) {
            copyOnWriteArraySet.add(healthOpenSDK);
        }
        Log.d("HealthOpenSDK_OSSR", "getServiceByOpenSDK fetcher = " + serviceFetcher);
        if (serviceFetcher != null) {
            return serviceFetcher.getService(context);
        }
        return null;
    }

    public static void a(HealthOpenSDK healthOpenSDK) {
        for (Map.Entry<String, CopyOnWriteArraySet<HealthOpenSDK>> entry : e.entrySet()) {
            CopyOnWriteArraySet<HealthOpenSDK> value = entry.getValue();
            if (value != null && value.contains(healthOpenSDK)) {
                value.remove(healthOpenSDK);
                if (value.size() == 0) {
                    ServiceFetcher<?> serviceFetcher = f12314b.get(entry.getKey());
                    if (serviceFetcher == null) {
                        Log.w("HealthOpenSDK_OSSR", "release by opensdk fetcher null");
                    } else {
                        serviceFetcher.release();
                    }
                }
            }
        }
    }

    private static <T> void a(String str, ServiceFetcher<T> serviceFetcher) {
        f12314b.put(str, serviceFetcher);
    }
}
