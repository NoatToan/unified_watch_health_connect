package com.huawei.health.icommon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.utils.FoundationCommonUtil;
import defpackage.fda;
import defpackage.fdy;
import defpackage.lsl;
import defpackage.njy;
import defpackage.npt;
import defpackage.pqo;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.DeviceUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.SportIntensityUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class SportIntensity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static pqo f7153b = new pqo();
    private static volatile SportIntensity e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScheduledExecutorService f7154a;
    private Context d;
    private byte[] h = null;
    private int[] f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f7155c = new AtomicBoolean(true);
    private String i = null;
    private Handler j = new Handler() { // from class: com.huawei.health.icommon.SportIntensity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                ReleaseLogUtil.a("ISportIntensity", "msg is null!");
                return;
            }
            super.handleMessage(message);
            Bundle data = message.getData();
            int i = message.what;
            if (i == 1000) {
                if (SportIntensity.this.i != null || message.arg1 <= 0) {
                    SportIntensity.this.f();
                    return;
                }
                SportIntensity sportIntensity = SportIntensity.this;
                sportIntensity.i = FoundationCommonUtil.getAndroidId(sportIntensity.d);
                Message messageObtainMessage = obtainMessage(1000);
                messageObtainMessage.arg1 = message.arg1 - 1;
                sendMessageDelayed(messageObtainMessage, 1000L);
                return;
            }
            if (i == 1001) {
                if (data != null) {
                    SportIntensity.this.a(data.getLong("current_day_zero_time"), data.getLong("current_time"));
                }
            } else {
                if (i != 2000) {
                    return;
                }
                if (data == null) {
                    SportIntensity.this.c(lsl.r(System.currentTimeMillis()));
                } else if (lsl.c(data.getLong("current_day_zero_time"), System.currentTimeMillis())) {
                    SportIntensity.this.c(data.getLong("current_day_zero_time"));
                } else {
                    ReleaseLogUtil.d("ISportIntensity", "should not calculate diff day data");
                    SportIntensity.this.f7155c.set(true);
                }
            }
        }
    };

    public SportIntensity(Context context) {
        if (context == null) {
            ReleaseLogUtil.e("ISportIntensity", "SportIntensity context is null");
            this.d = BaseApplication.getContext();
        }
        this.d = context;
        i();
    }

    public static SportIntensity a(Context context) {
        if (e == null) {
            synchronized (SportIntensity.class) {
                if (e == null) {
                    e = new SportIntensity(context);
                }
            }
        }
        return e;
    }

    public void a() {
        LogUtil.d("ISportIntensity", "start module");
        o();
        h();
    }

    private void o() {
        try {
            if (this.f7154a == null) {
                LogUtil.a("ISportIntensity", "startAutoCheck");
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f7154a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() { // from class: fmn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34269b.b();
                    }
                }, 0L, 1800000L, TimeUnit.MILLISECONDS);
                return;
            }
            LogUtil.a("ISportIntensity", "startAutoCheck has execute.");
            b(4);
        } catch (RejectedExecutionException e2) {
            LogUtil.e("ISportIntensity", "startMeasureReconnect exception = ", LogAnonymous.b(e2));
        }
    }

    public /* synthetic */ void b() {
        b(1);
    }

    public void d() {
        LogUtil.a("ISportIntensity", "resetTime", Boolean.valueOf(this.f7154a != null));
        ScheduledExecutorService scheduledExecutorService = this.f7154a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f7154a = null;
        }
    }

    public void e() {
        if (!CommonUtil.ab(this.d)) {
            LogUtil.j("ISportIntensity", "Network not connect");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.icommon.SportIntensity.1
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("ISportIntensity", "updateIndexFile, mIsNewProcess is true");
                    SportIntensity.this.c();
                }
            });
        }
    }

    public void c() {
        if (!AuthorizationUtils.c(this.d)) {
            LogUtil.j("ISportIntensity", "updateNewIndexFile is not authorized");
            return;
        }
        HashMap map = new HashMap();
        map.put("configType", "SportIntensity");
        fdy.d(new fda("com.huawei.health_Sport_Common", map), "sport_intensity_index", 7, (DownloadCallback<File>) new DownloadCallback() { // from class: com.huawei.health.icommon.SportIntensity.4
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFinish(Object obj) {
                LogUtil.a("ISportIntensity", "updateNewIndexFile onFinish ");
                SportIntensity.this.i();
                SportIntensity.this.j();
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str) {
                LogUtil.a("ISportIntensity", "updateNewIndexFile onProgress ", Boolean.valueOf(z), " fileId ", str);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                LogUtil.j("ISportIntensity", "updateNewIndexFile onFail ");
                SportIntensity.this.i();
                SportIntensity.this.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("ISportIntensity", "enter sendBroadcast");
        Intent intent = new Intent();
        intent.setPackage(this.d.getPackageName());
        intent.setAction("com.huawei.health.action.ACTION_SPORT_INTENSITY_INDEX");
        this.d.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        f7153b = SportIntensityUtil.b();
    }

    public boolean b(int i) {
        ReleaseLogUtil.d("ISportIntensity", "calculateSportIntensity : type ", Integer.valueOf(i), " state ", Boolean.valueOf(this.f7155c.get()));
        if (!this.f7155c.get()) {
            return false;
        }
        this.f7155c.set(false);
        this.h = new byte[ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL];
        this.f = new int[ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL];
        Message messageObtainMessage = this.j.obtainMessage(1000);
        messageObtainMessage.arg1 = 3;
        this.j.sendMessage(messageObtainMessage);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("ISportIntensity", "readStepData");
        final long[] jArrG = g();
        LogUtil.d("ISportIntensity", " timeInterval  ", Long.valueOf(jArrG[0]), "  ", Long.valueOf(jArrG[1]));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(new int[]{2});
        hiDataReadOption.setConstantsKey(new String[]{"step"});
        hiDataReadOption.setTimeInterval(jArrG[0], jArrG[1]);
        hiDataReadOption.setAlignType(20001);
        String androidId = this.i;
        if (androidId == null) {
            androidId = FoundationCommonUtil.getAndroidId(this.d);
            this.i = androidId;
        }
        hiDataReadOption.setDeviceUuid(androidId);
        c(hiDataReadOption);
        HiHealthManager.d(this.d).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.icommon.SportIntensity.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("ISportIntensity", "readStepData onResult: ", "errorCode = ", Integer.valueOf(i), "anchor = ", Integer.valueOf(i2));
                if (!(obj instanceof SparseArray)) {
                    LogUtil.a("ISportIntensity", "readStepData onResult data is not instanceof SparseArray");
                    SportIntensity sportIntensity = SportIntensity.this;
                    long[] jArr = jArrG;
                    sportIntensity.b(jArr[0], jArr[1]);
                    return;
                }
                Object obj2 = ((SparseArray) obj).get(20001);
                if (!njy.b(obj2, HiHealthData.class)) {
                    LogUtil.a("ISportIntensity", "stepObj is not instanceof List<HiHealthData>");
                    SportIntensity sportIntensity2 = SportIntensity.this;
                    long[] jArr2 = jArrG;
                    sportIntensity2.b(jArr2[0], jArr2[1]);
                    return;
                }
                List list = (List) obj2;
                LogUtil.a("ISportIntensity", "steplist size = ", Integer.valueOf(list.size()));
                SportIntensity.this.d((List<HiHealthData>) list, jArrG);
                SportIntensity sportIntensity3 = SportIntensity.this;
                long[] jArr3 = jArrG;
                sportIntensity3.b(jArr3[0], jArr3[1]);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                if (obj != null) {
                    LogUtil.a("ISportIntensity", "errorCode = ", Integer.valueOf(i2), ", anchor = ", Integer.valueOf(i3));
                } else {
                    LogUtil.j("ISportIntensity", "data is null. errorCode = ", Integer.valueOf(i2), ", anchor = ", Integer.valueOf(i3));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list, long[] jArr) {
        StringBuilder sb = new StringBuilder(16);
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                ReleaseLogUtil.e("ISportIntensity", "handleStepData hiHealthData is null");
            } else {
                int iB = b(hiHealthData.getStartTime() - jArr[0]);
                int i = hiHealthData.getInt("step");
                int type = hiHealthData.getType();
                this.f[iB] = type;
                sb.append(" step = ");
                sb.append(i);
                sb.append(", type = ");
                sb.append(type);
                sb.append(",");
                if (i > f7153b.l()) {
                    if (type == 20002 || type == 20004) {
                        this.h[iB] = 1;
                    } else if (type == 20003) {
                        this.h[iB] = 2;
                    } else {
                        LogUtil.j("ISportIntensity", "type is unknown, type = ", Integer.valueOf(type), ", minuteNumber = ", Integer.valueOf(iB));
                    }
                } else if (i <= f7153b.e()) {
                    this.h[b(hiHealthData.getStartTime() - jArr[0])] = 0;
                } else if (type == 20004) {
                    this.h[b(hiHealthData.getStartTime() - jArr[0])] = 1;
                }
            }
        }
        ReleaseLogUtil.d("ISportIntensity", npt.d("step list is ", sb.toString()));
    }

    private void c(HiDataReadOption hiDataReadOption) {
        String[] strArrAc = SharedPerferenceUtils.ac(this.d);
        if (strArrAc == null) {
            ReleaseLogUtil.d("ISportIntensity", "device capability is null");
            hiDataReadOption.setReadType(2);
            return;
        }
        try {
            if ((strArrAc.length >= 2 && Boolean.parseBoolean(strArrAc[1])) || !DeviceUtil.b()) {
                hiDataReadOption.setReadType(2);
            } else {
                hiDataReadOption.setReadType(0);
            }
        } catch (Error e2) {
            LogUtil.e("ISportIntensity", "queryMethod error", LogAnonymous.b(e2));
        } catch (Exception e3) {
            LogUtil.j("ISportIntensity", "queryMethod exception", LogAnonymous.b(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, long j2) {
        Message messageObtainMessage = this.j.obtainMessage(1001);
        Bundle bundle = new Bundle();
        bundle.putLong("current_day_zero_time", j);
        bundle.putLong("current_time", j2);
        messageObtainMessage.setData(bundle);
        this.j.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j, long j2) {
        LogUtil.a("ISportIntensity", "readTrackData");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{30007});
        String androidId = this.i;
        if (androidId == null) {
            androidId = FoundationCommonUtil.getAndroidId(this.d);
            this.i = androidId;
        }
        hiDataReadOption.setDeviceUuid(androidId);
        c(hiDataReadOption);
        ReleaseLogUtil.d("ISportIntensity", "readTrackData optionReadType is ", Integer.valueOf(hiDataReadOption.getReadType()));
        HiHealthNativeApi.a(this.d).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.icommon.SportIntensity.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("ISportIntensity", "readTrackData onResult: ", " errorCode = ", Integer.valueOf(i), " anchor = ", Integer.valueOf(i2));
                if (obj instanceof SparseArray) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() > 0) {
                        Object obj2 = sparseArray.get(30007);
                        if (!njy.b(obj2, HiHealthData.class)) {
                            LogUtil.a("ISportIntensity", "readTrackData onResult obj is not instanceof List<HiHealthData>");
                            return;
                        }
                        List list = (List) obj2;
                        if (SportIntensity.this.h == null) {
                            SportIntensity.this.h = new byte[ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL];
                        }
                        SportIntensity.this.d((List<HiHealthData>) list, j);
                    }
                }
                Message messageObtainMessage = SportIntensity.this.j.obtainMessage(2000);
                Bundle bundle = new Bundle();
                bundle.putLong("current_day_zero_time", j);
                messageObtainMessage.setData(bundle);
                SportIntensity.this.j.sendMessage(messageObtainMessage);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.j("ISportIntensity", "onResultIntent", Integer.valueOf(i), "errorCode: ", Integer.valueOf(i2), "anchor:", Integer.valueOf(i3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list, long j) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            try {
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                if (hiTrackMetaData.getSportDataSource() != 2 && hiTrackMetaData.getTrackType() != 0) {
                    e(hiHealthData, j);
                }
            } catch (JsonSyntaxException e2) {
                LogUtil.j("ISportIntensity", LogAnonymous.b(e2));
            }
        }
    }

    private void e(HiHealthData hiHealthData, long j) {
        if (hiHealthData == null) {
            ReleaseLogUtil.e("ISportIntensity", "setSingleMotionCycleTime hiHealthData is null.");
            return;
        }
        int iB = b(hiHealthData.getEndTime() - j);
        for (int iB2 = b(hiHealthData.getStartTime() - j); iB2 <= iB; iB2++) {
            this.h[iB2] = 3;
        }
    }

    private long[] g() {
        return new long[]{lsl.r(System.currentTimeMillis()), lsl.c(System.currentTimeMillis())};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        LogUtil.a("ISportIntensity", " calculateTotalData");
        if (this.h == null) {
            ReleaseLogUtil.a("ISportIntensity", "time to calculateIntensity, but oneDay array is empty");
            this.f7155c.set(true);
            return;
        }
        List<HiHealthData> listA = a(j);
        if (listA.size() <= 0) {
            this.f7155c.set(true);
            LogUtil.a("ISportIntensity", "sport intensity data null ");
            return;
        }
        int size = listA.size();
        LogUtil.a("ISportIntensity", "dataList size is ", Integer.valueOf(size), "dataList is ", listA.toString());
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(listA);
        HiHealthManager.d(this.d).insertHiHealthData(hiDataInsertOption, new c());
    }

    class c implements HiDataOperateListener {
        private c() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            if (obj != null) {
                LogUtil.a("ISportIntensity", "InsertCallBack errorCode = ", Integer.valueOf(i));
            } else {
                LogUtil.a("ISportIntensity", "InsertCallBack errorCode = ", Integer.valueOf(i), " obj == null ");
            }
            SportIntensity.this.f7155c.set(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a A[PHI: r8
      0x003a: PHI (r8v1 byte) = (r8v0 byte), (r8v3 byte), (r8v4 byte), (r8v5 byte) binds: [B:9:0x0025, B:11:0x0028, B:13:0x002b, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    private List<HiHealthData> a(long j) {
        LogUtil.a("ISportIntensity", "setUploadMinuteToList ");
        ArrayList arrayList = new ArrayList(16);
        int i = 0;
        while (true) {
            byte[] bArr = this.h;
            if (i >= bArr.length) {
                return arrayList;
            }
            byte b2 = bArr[i];
            if (b2 != 0) {
                long j2 = (((long) i) * 60000) + j;
                byte b3 = 1;
                if (b2 != 1) {
                    b3 = 2;
                    if (b2 != 2) {
                        b3 = 3;
                        if (b2 != 3) {
                            b3 = 4;
                            if (b2 != 4) {
                                LogUtil.a("ISportIntensity", " sportType unkown");
                            } else {
                                b2 = b3;
                            }
                        } else {
                            b2 = b3;
                        }
                    } else {
                        b2 = b3;
                    }
                } else {
                    b2 = b3;
                }
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setTimeInterval(j2, 60000 + j2);
                hiHealthData.setValue((int) b2);
                hiHealthData.setType(7);
                String androidId = this.i;
                if (androidId == null) {
                    androidId = FoundationCommonUtil.getAndroidId(this.d);
                    this.i = androidId;
                }
                hiHealthData.setDeviceUuid(androidId);
                arrayList.add(hiHealthData);
            }
            i++;
        }
    }

    private int b(long j) {
        return (int) (j / 60000);
    }

    private void h() {
        this.i = FoundationCommonUtil.getAndroidId(this.d);
    }
}
