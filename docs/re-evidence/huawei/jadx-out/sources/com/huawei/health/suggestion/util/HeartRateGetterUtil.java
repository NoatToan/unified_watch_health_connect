package com.huawei.health.suggestion.util;

import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.MeasureResult;
import com.huawei.health.suggestion.SuggestionBaseCallback;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.IHeartRateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class HeartRateGetterUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HeartRateGetterUtil f10215b = new HeartRateGetterUtil();
    private static final Object e = new Object();
    private IHeartRateCallback d;
    private String h;
    private String j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<SuggestionBaseCallback> f10216a = new ArrayList();
    private List<HeartRateConnectStateCallBack> i = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f10217c = null;
    private HiSubscribeListener f = new HiSubscribeListener() { // from class: com.huawei.health.suggestion.util.HeartRateGetterUtil.5
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (list == null || list.isEmpty()) {
                return;
            }
            LogUtil.a("Suggestion_HeartRateGetterUtil", "registerHeartRateListener success");
            synchronized (HeartRateGetterUtil.e) {
                if (HeartRateGetterUtil.this.f10217c == null) {
                    HeartRateGetterUtil.this.f10217c = new ArrayList();
                }
                if (list != null) {
                    HeartRateGetterUtil.this.f10217c.addAll(list);
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (hiHealthData == null) {
                LogUtil.e("Suggestion_HeartRateGetterUtil", "onChange HiHealthData is null!");
                return;
            }
            int intValue = hiHealthData.getIntValue();
            HeartRateData heartRateData = new HeartRateData();
            heartRateData.saveHeartRate(intValue);
            heartRateData.saveTime(hiHealthData.getStartTime());
            LogUtil.a("Suggestion_HeartRateGetterUtil", "time: ", Long.valueOf(hiHealthData.getStartTime()), "; heartRate:", Integer.valueOf(intValue));
            synchronized (HeartRateGetterUtil.e) {
                for (SuggestionBaseCallback suggestionBaseCallback : HeartRateGetterUtil.this.f10216a) {
                    if (suggestionBaseCallback == null) {
                        return;
                    }
                    if (!HeartRateGetterUtil.this.f10216a.contains(suggestionBaseCallback)) {
                        return;
                    } else {
                        suggestionBaseCallback.onResponse(0, heartRateData);
                    }
                }
            }
        }
    };

    public interface HeartRateConnectStateCallBack {
        void setConnectStateChange(boolean z);
    }

    private HeartRateGetterUtil() {
    }

    public static HeartRateGetterUtil d() {
        return f10215b;
    }

    public void d(IHeartRateCallback iHeartRateCallback) {
        this.d = iHeartRateCallback;
    }

    public void d(int i, boolean z) {
        LogUtil.a("Suggestion_HeartRateGetterUtil", "onHeartRateEnableChange = ", Integer.valueOf(i));
        if (i == 0) {
            IHeartRateCallback iHeartRateCallback = this.d;
            if (iHeartRateCallback != null && z) {
                iHeartRateCallback.startHeartRateMeasure();
            }
            a();
            return;
        }
        if (i == 1) {
            IHeartRateCallback iHeartRateCallback2 = this.d;
            if (iHeartRateCallback2 != null && z) {
                iHeartRateCallback2.stopHeartRateMeasure();
            }
            c();
        }
    }

    public void c(HeartRateConnectStateCallBack heartRateConnectStateCallBack) {
        synchronized (e) {
            try {
                if (heartRateConnectStateCallBack == null) {
                    LogUtil.j("Suggestion_HeartRateGetterUtil", "RateConnectCallback callback is null");
                } else if (this.i.contains(heartRateConnectStateCallBack)) {
                    LogUtil.a("Suggestion_HeartRateGetterUtil", "RateConnectCallback failed, exist");
                } else {
                    this.i.add(heartRateConnectStateCallBack);
                    LogUtil.a("Suggestion_HeartRateGetterUtil", "ConnectCallback listeners num", Integer.valueOf(this.f10216a.size()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(HeartRateConnectStateCallBack heartRateConnectStateCallBack) {
        LogUtil.a("Suggestion_HeartRateGetterUtil", "unRegisterHeartRateConnectCallback");
        synchronized (e) {
            try {
                if (heartRateConnectStateCallBack == null) {
                    LogUtil.j("Suggestion_HeartRateGetterUtil", "unRegisterHeartRateConnectCallback callback is null");
                } else if (!this.i.contains(heartRateConnectStateCallBack)) {
                    LogUtil.j("Suggestion_HeartRateGetterUtil", "unRegisterHeartRateConnectCallback failed, not exist");
                } else {
                    this.i.remove(heartRateConnectStateCallBack);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(SuggestionBaseCallback suggestionBaseCallback) {
        synchronized (e) {
            try {
                if (suggestionBaseCallback == null) {
                    LogUtil.j("Suggestion_HeartRateGetterUtil", "registerHeartRateListener callback is null");
                    return;
                }
                if (this.f10216a.contains(suggestionBaseCallback)) {
                    LogUtil.a("Suggestion_HeartRateGetterUtil", "registerHeartRateListener failed, exist");
                    return;
                }
                this.f10216a.add(suggestionBaseCallback);
                LogUtil.a("Suggestion_HeartRateGetterUtil", "registerHeartRateListener listeners num", Integer.valueOf(this.f10216a.size()));
                if (this.f10216a.size() == 1) {
                    LogUtil.a("Suggestion_HeartRateGetterUtil", "register to db");
                    HiHealthManager.d(BaseApplication.getContext()).subscribeHiHealthData(13, this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(SuggestionBaseCallback suggestionBaseCallback) {
        List<Integer> list;
        synchronized (e) {
            try {
                if (suggestionBaseCallback == null) {
                    LogUtil.j("Suggestion_HeartRateGetterUtil", "unregisterHeartRateListener callback is null");
                    return;
                }
                if (!this.f10216a.contains(suggestionBaseCallback)) {
                    LogUtil.j("Suggestion_HeartRateGetterUtil", "unregisterHeartRateListener failed, not exist");
                    return;
                }
                this.f10216a.remove(suggestionBaseCallback);
                LogUtil.a("Suggestion_HeartRateGetterUtil", "unregisterHeartRateListener listeners size ", Integer.valueOf(this.f10216a.size()));
                if (this.f10216a.size() == 0 && (list = this.f10217c) != null && !list.isEmpty()) {
                    LogUtil.a("Suggestion_HeartRateGetterUtil", "unregister from db");
                    HiHealthManager.d(BaseApplication.getContext()).unSubscribeHiHealthData(this.f10217c, new HiUnSubscribeListener() { // from class: com.huawei.health.suggestion.util.HeartRateGetterUtil.1
                        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                        public void onResult(boolean z) {
                            LogUtil.a("Suggestion_HeartRateGetterUtil", "unregisterHeartRateListener isSuccess = ", Boolean.valueOf(z));
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        LogUtil.a("Suggestion_HeartRateGetterUtil", "start measure!");
        dmg.a().init();
        dmg.a().startMeasureBackground(BaseApplication.getContext(), 0, HealthDevice.HealthDeviceKind.HDK_HEART_RATE, new e());
    }

    public void c() {
        if (this.h != null) {
            dmg.a().stopMeasureBackground(this.h, this.j);
        }
    }

    class e implements MeasureResult.MeasureResultListener {
        private e() {
        }

        @Override // com.huawei.health.device.model.MeasureResult.MeasureResultListener
        public void onMeasureFailed(MeasureResult.MeasureErrorCode measureErrorCode) {
            LogUtil.e("Suggestion_HeartRateGetterUtil", "onMeasureFailed");
        }

        @Override // com.huawei.health.device.model.MeasureResult.MeasureResultListener
        public void onMeasureDevice(String str, String str2, boolean z) {
            LogUtil.d("Suggestion_HeartRateGetterUtil", "onMeasureDevice, onMeasureDevice productId is ", str);
            HeartRateGetterUtil.this.h = str;
            HeartRateGetterUtil.this.j = str2;
            if (z) {
                for (HeartRateConnectStateCallBack heartRateConnectStateCallBack : HeartRateGetterUtil.this.i) {
                    LogUtil.a("Suggestion_HeartRateGetterUtil", "onMeasureDevice, setConnectStateChange");
                    heartRateConnectStateCallBack.setConnectStateChange(z);
                }
            }
        }
    }
}
