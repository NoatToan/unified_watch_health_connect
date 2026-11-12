package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.hwsmartinteractmgr.smarter.AbnormalSmarter;
import com.huawei.hwsmartinteractmgr.smarter.BloodPressureSmarter;
import com.huawei.hwsmartinteractmgr.smarter.HealthcareSmarter;
import com.huawei.hwsmartinteractmgr.smarter.MsgCenterSmarter;
import com.huawei.hwsmartinteractmgr.smarter.ParticipatedActivitySmarter;
import com.huawei.hwsmartinteractmgr.userlabel.LabelObserver;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class nsr {
    private static final Object d = new Object();
    private static volatile nsr e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbnormalSmarter f43602a;
    private ntb ab;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f43603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BloodPressureSmarter f43604c;
    private ntd g;
    private HealthcareSmarter h;
    private long k;
    private long l;
    private long m;
    private List<Integer> p;
    private List<Integer> q;
    private List<Integer> r;
    private ParticipatedActivitySmarter s;
    private MsgCenterSmarter t;
    private List<Integer> u;
    private List<Integer> w;
    private nsy x;
    private List<Integer> y;
    private MessageObserver n = new MessageObserver() { // from class: nsr.2
        @Override // com.huawei.pluginmessagecenter.service.MessageObserver
        public void onChange(int i, MessageChangeEvent messageChangeEvent) {
            LogUtil.a("SMART_HwSmartInteractManager", "MessageObserver onChange start flag = ", Integer.valueOf(i));
            if (messageChangeEvent == null) {
                return;
            }
            List<String> modifyMessageObjectIds = messageChangeEvent.getModifyMessageObjectIds();
            List<String> removeMessageObjectIds = messageChangeEvent.getRemoveMessageObjectIds();
            boolean z = false;
            boolean z2 = (modifyMessageObjectIds == null || modifyMessageObjectIds.isEmpty()) ? false : true;
            if (removeMessageObjectIds != null && !removeMessageObjectIds.isEmpty()) {
                z = true;
            }
            if (i == 0 && z2) {
                LogUtil.a("SMART_HwSmartInteractManager", "Message Change");
                nsr.this.g.c();
            } else if (i == 0 && z) {
                LogUtil.a("SMART_HwSmartInteractManager", "Message Change");
                nsr.this.g.c();
            } else {
                LogUtil.e("SMART_HwSmartInteractManager", "Message Change is error");
            }
        }
    };
    private LabelObserver f = new LabelObserver() { // from class: nsr.8
        @Override // com.huawei.hwsmartinteractmgr.userlabel.LabelObserver
        public void onChange(Map<Integer, List<String>> map) {
            nsr.this.h.onChange(map);
            nsr.this.ab.onChange(map);
            nsr.this.g.e();
        }
    };
    private HiSubscribeListener j = new HiSubscribeListener() { // from class: nsr.15
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a("SMART_HwSmartInteractManager", "subscribeWeightGoalInfo onResult");
            nsr.this.q = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("SMART_HwSmartInteractManager", "subscribeWeightGoalInfo onChange");
            ntl.d(nsr.this.f43603b, new IBaseResponseCallback() { // from class: nsr.15.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 == 0) {
                        nsr.this.ab.e(nsr.this.f43603b, new IBaseResponseCallback() { // from class: nsr.15.2.4
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i3, Object obj2) {
                                if (obj2 instanceof List) {
                                    List list = (List) obj2;
                                    if (list.isEmpty()) {
                                        return;
                                    }
                                    double d2 = ((HiHealthData) list.get(0)).getDouble("bodyWeight");
                                    String metaData = ((HiHealthData) list.get(0)).getMetaData();
                                    if (TextUtils.isEmpty(metaData)) {
                                        LogUtil.a("SMART_HwSmartInteractManager", "This is a mainUser.");
                                        return;
                                    }
                                    if (Constants.NULL.equalsIgnoreCase(metaData) || "0".equals(metaData)) {
                                        LogUtil.a("SMART_HwSmartInteractManager", "This is a mainUser.");
                                        return;
                                    }
                                    dnj singleUserById = MultiUsersManager.INSTANCE.getSingleUserById(metaData);
                                    if (singleUserById == null) {
                                        return;
                                    }
                                    singleUserById.e((float) d2);
                                }
                            }
                        });
                    }
                }
            });
            if (i == 101) {
                nsr.this.ab.d();
            }
        }
    };
    private Handler i = new Handler(Looper.getMainLooper());
    private MessageCenterApi o = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
    private ntj v = ntj.a();

    private nsr(Context context) {
        this.f43603b = context.getApplicationContext();
        this.ab = ntb.a(this.f43603b);
        this.f43604c = new BloodPressureSmarter(this.f43603b);
        this.t = new MsgCenterSmarter(this.f43603b);
        this.x = nsy.a(this.f43603b);
        this.f43602a = new AbnormalSmarter(this.f43603b);
        this.g = ntd.a(this.f43603b);
        this.h = new HealthcareSmarter(this.f43603b);
        this.s = new ParticipatedActivitySmarter(this.f43603b);
        if (Utils.m()) {
            return;
        }
        k();
        g();
        o();
        m();
        t();
        n();
    }

    public static nsr b(Context context) {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new nsr(context);
                }
            }
        }
        return e;
    }

    public void a(final int i) {
        lsy.a(new Runnable() { // from class: nsr.14
            @Override // java.lang.Runnable
            public void run() {
                nsv.e(nsr.this.f43603b).d(i);
            }
        });
    }

    public void e(final int i, final int i2, final IBaseResponseCallback iBaseResponseCallback) {
        lsy.a(new Runnable() { // from class: nsr.11
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList(5);
                SmartMsgDbObject smartMsgDbObjectC = nta.c(nsr.this.f43603b).c(nsv.e(nsr.this.f43603b).a(LoginInit.getInstance(nsr.this.f43603b).getAccountInfo(1011), i), i, i2);
                if (smartMsgDbObjectC != null) {
                    LogUtil.a("SMART_HwSmartInteractManager", "Smart_card_msg", Integer.valueOf(smartMsgDbObjectC.getId()));
                    arrayList.add(smartMsgDbObjectC);
                }
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, arrayList);
                }
            }
        });
    }

    public void c() {
        b(new IBaseResponseCallback() { // from class: nsr.13
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("SMART_HwSmartInteractManager", "errCode=", Integer.valueOf(i));
            }
        });
    }

    public void b(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SMART_HwSmartInteractManager", "startTimerCheck");
        if (iBaseResponseCallback == null) {
            LogUtil.a("SMART_HwSmartInteractManager", "startTimerCheck callback == null");
            return;
        }
        if (Utils.m()) {
            LogUtil.a("SMART_HwSmartInteractManager", "startTimerCheck, isNoCloudVersion, return");
            iBaseResponseCallback.a(100001, null);
        } else if (e()) {
            lsy.a(new Runnable() { // from class: nsr.12
                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    try {
                        nsr.this.ab.b();
                        nsr.this.f43604c.b();
                        nsz.e().b();
                        nsr.this.f43602a.b();
                        nsr.this.h.b();
                        nsr.this.g.b();
                        Context context = nsr.this.f43603b;
                        String string = Integer.toString(20009);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        SharedPreferenceManager.e(context, string, "last_timercheck_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
                        i = 0;
                    } catch (UnsupportedOperationException e2) {
                        LogUtil.e("SMART_HwSmartInteractManager", "startTimerCheck error UnsupportedOperationException：", e2.getMessage());
                        i = 100001;
                    }
                    iBaseResponseCallback.a(i, Integer.valueOf(i));
                }
            });
        } else {
            iBaseResponseCallback.a(100001, 100001);
            LogUtil.a("SMART_HwSmartInteractManager", "startTimingCheck, interval not enough");
        }
    }

    private boolean e() {
        String strE = SharedPreferenceManager.e(this.f43603b, Integer.toString(20009), "last_timercheck_time");
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        try {
            return Math.abs(System.currentTimeMillis() - Long.parseLong(strE)) > AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL;
        } catch (NumberFormatException e2) {
            LogUtil.e("SMART_HwSmartInteractManager", "checkInterval numberFormatException = ", e2.getMessage());
            return false;
        }
    }

    public void b() {
        if (Utils.m() || CommonUtil.ca()) {
            LogUtil.e("SMART_HwSmartInteractManager", "init, isNoCloudVersion or storeDemo, return");
            return;
        }
        l();
        MessageObserver messageObserver = this.n;
        if (messageObserver != null) {
            this.o.registerMessageObserver(messageObserver);
        }
        this.t.e();
        h();
        d();
        c();
    }

    public void d() {
        lsy.a(new Runnable() { // from class: nsr.16
            @Override // java.lang.Runnable
            public void run() {
                nsr.this.h.d();
                nsr.this.s.e();
                nsr.this.t.a();
            }
        });
    }

    public void a() {
        if (Utils.m() || CommonUtil.ca()) {
            LogUtil.a("SMART_HwSmartInteractManager", "onDestroy, isNoCloudVersion, storeDemo, return");
            return;
        }
        MessageObserver messageObserver = this.n;
        if (messageObserver != null) {
            this.o.unregisterMessageObserver(messageObserver);
        }
        this.t.d();
        this.v.a(this.f);
        ntc.c().d();
        a(this.w);
        a(this.p);
        a(this.r);
        a(this.u);
        a(this.q);
        a(this.y);
    }

    private void a(List<Integer> list) {
        if (njy.b(list)) {
            HiHealthNativeApi.a(this.f43603b).unSubscribeHiHealthData(list, new HiUnSubscribeListener() { // from class: nsr.18
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public void onResult(boolean z) {
                    LogUtil.a("SMART_HwSmartInteractManager", "onDestroy unSubscribeHiHealthData isSuccess=", Boolean.valueOf(z));
                }
            });
        }
    }

    private void k() {
        HiHealthNativeApi.a(this.f43603b).subscribeHiHealthData(HiSubscribeType.f12259a, new HiSubscribeListener() { // from class: nsr.1
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                nsr.this.w = list;
                LogUtil.a("SMART_HwSmartInteractManager", "subscribeWeightData, onResult");
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                LogUtil.a("SMART_HwSmartInteractManager", "onChange, type=", Integer.valueOf(i));
                if (i == HiSubscribeType.f12259a) {
                    if (System.currentTimeMillis() - nsr.this.k > 1000) {
                        LogUtil.a("SMART_HwSmartInteractManager", "onChange Weight execute");
                        nsr.this.i.postDelayed(new Runnable() { // from class: nsr.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                nsr.this.j();
                            }
                        }, 1000L);
                    }
                    nsr.this.k = System.currentTimeMillis();
                }
            }
        });
    }

    private void g() {
        HiHealthNativeApi.a(this.f43603b).subscribeHiHealthData(HiSubscribeType.f12261c, new HiSubscribeListener() { // from class: nsr.5
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                nsr.this.p = list;
                LogUtil.a("SMART_HwSmartInteractManager", "subscribeBloodPressData, onResult");
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                LogUtil.a("SMART_HwSmartInteractManager", "subscribeBloodPressData onChange, type=", Integer.valueOf(i));
                if (i == HiSubscribeType.f12261c) {
                    if (System.currentTimeMillis() - nsr.this.m > 1000) {
                        LogUtil.a("SMART_HwSmartInteractManager", "onChange BloodPressure execute");
                        nsr.this.i.postDelayed(new Runnable() { // from class: nsr.5.2
                            @Override // java.lang.Runnable
                            public void run() {
                                nsr.this.i();
                            }
                        }, 1000L);
                    }
                    nsr.this.m = System.currentTimeMillis();
                }
            }
        });
    }

    private void o() {
        HiHealthNativeApi.a(this.f43603b).subscribeHiHealthData(HiSubscribeType.f12260b, new HiSubscribeListener() { // from class: nsr.3
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                nsr.this.r = list;
                LogUtil.a("SMART_HwSmartInteractManager", "subscribeBloodSugarData, onResult");
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                LogUtil.a("SMART_HwSmartInteractManager", "subscribeBloodSugarData onChange");
                if (i == HiSubscribeType.f12260b) {
                    if (System.currentTimeMillis() - nsr.this.l > 1000) {
                        LogUtil.a("SMART_HwSmartInteractManager", "onChange BloodSugar execute");
                        nsr.this.i.postDelayed(new Runnable() { // from class: nsr.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                nsr.this.g.a();
                                nsr.this.f();
                            }
                        }, 1000L);
                    }
                    nsr.this.l = System.currentTimeMillis();
                }
            }
        });
    }

    private void t() {
        HiHealthNativeApi.a(this.f43603b).subscribeHiHealthData(101, this.j);
    }

    private void m() {
        HiHealthNativeApi.a(this.f43603b).subscribeHiHealthData(102, new HiSubscribeListener() { // from class: nsr.4
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                LogUtil.a("SMART_HwSmartInteractManager", "subscribeUserPreference, onResult");
                nsr.this.y = list;
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                LogUtil.a("SMART_HwSmartInteractManager", "subscribeUserPreference onchange");
                if (i == 102) {
                    lsy.a(new Runnable() { // from class: nsr.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            nsr.this.x.e();
                            nsr.this.g.f();
                            nsr.this.ab.d();
                            nsr.this.ab.e();
                            nsr.this.ab.b(true);
                        }
                    });
                }
            }
        });
    }

    private void n() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(2);
        arrayList.add(3);
        HiHealthNativeApi.a(this.f43603b).subscribeHiHealthData(arrayList, new HiSubscribeListener() { // from class: nsr.7
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                LogUtil.a("SMART_HwSmartInteractManager", "subscribeSleepData, onResult");
                nsr.this.u = list;
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                if (i == 2 || i == 3) {
                    nsr.this.g.h();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("SMART_HwSmartInteractManager", "doWeightChange");
        this.g.i();
        lsy.a(new Runnable() { // from class: nsr.10
            @Override // java.lang.Runnable
            public void run() {
                nsr.this.ab.d(nsr.this.f43603b, new IBaseResponseCallback() { // from class: nsr.10.1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (obj instanceof List) {
                            List list = (List) obj;
                            if (!list.isEmpty()) {
                                double d2 = ((HiHealthData) list.get(0)).getDouble("bodyWeight");
                                long startTime = ((HiHealthData) list.get(0)).getStartTime();
                                LogUtil.a("SMART_HwSmartInteractManager", "doWeightChange startTime = ", Long.valueOf(startTime));
                                nsr.this.ab.a(d2, startTime, false);
                            }
                            nsr.this.ab.d();
                            nsr.this.ab.e();
                            nsr.this.ab.a();
                            nsr.this.ab.b(true);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.a("SMART_HwSmartInteractManager", "doBloodPressChange");
        this.g.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("SMART_HwSmartInteractManager", "doBloodPressChange");
        lsy.a(new Runnable() { // from class: nsr.6
            @Override // java.lang.Runnable
            public void run() {
                nsz.e().d();
            }
        });
    }

    public void a(Context context, double d2) {
        this.ab.d(context, d2);
    }

    private void l() {
        this.v.d(this.f);
    }

    private void h() {
        lsy.a(new Runnable() { // from class: nsr.9
            @Override // java.lang.Runnable
            public void run() {
                nsr.this.v.d();
            }
        });
    }
}
