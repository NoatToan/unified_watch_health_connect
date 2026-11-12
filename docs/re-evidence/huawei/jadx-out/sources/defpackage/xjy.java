package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.manager.util.HiHealthHelper;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.up.model.UserInfomation;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.CalculateCaloriesUtils;
import health.compact.a.Services;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xjy {
    private HealthOpenSDK d;
    private List<jbw> m;
    private int o = 0;
    private int e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53136c = 0;
    private int j = -1;
    private int p = 0;
    private int h = -1;
    private int g = -1;
    private int k = 0;
    private int n = 0;
    private long r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f53134a = false;
    private int i = 0;
    private long l = 0;
    private int f = -1;
    private float q = 0.5f;
    private float t = 60.0f;
    private String s = "unKnown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExtendHandler f53135b = HandlerCenter.b(new d(), "Track_TreadmillStepPointData");

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    xjy.this.d(message);
                    LogUtil.a("Track_TreadmillStepPointData", "MSG_START step is", Integer.valueOf(xjy.this.o), ", calories is ", Integer.valueOf(xjy.this.e), ", distance is ", Integer.valueOf(xjy.this.f53136c));
                    xjy xjyVar = xjy.this;
                    xjyVar.j = xjyVar.o;
                    xjy xjyVar2 = xjy.this;
                    xjyVar2.h = xjyVar2.e;
                    xjy xjyVar3 = xjy.this;
                    xjyVar3.g = xjyVar3.f53136c;
                    return true;
                case 1002:
                    LogUtil.a("Track_TreadmillStepPointData", "MSG_STOP ");
                    xjy.this.d(message);
                    xjy.this.b();
                    return true;
                case 1003:
                    LogUtil.a("Track_TreadmillStepPointData", "MSG_CROSS_DAY ");
                    xjy.this.d(message);
                    xjy.this.b();
                    xjy xjyVar4 = xjy.this;
                    xjyVar4.p = xjyVar4.k;
                    xjy.this.l = System.currentTimeMillis() + 60000;
                    try {
                        xjy.this.f = Integer.parseInt(new SimpleDateFormat("d").format(Long.valueOf(xjy.this.l)));
                        return true;
                    } catch (NumberFormatException unused) {
                        xjy.this.f = -1;
                        LogUtil.j("Track_TreadmillStepPointData", "isNewDay exception");
                        return true;
                    }
                case 1004:
                    xjy.this.d(message);
                    LogUtil.a("Track_TreadmillStepPointData", "MSG_REFRESH_DATA step is", Integer.valueOf(xjy.this.o), ",calories is ", Integer.valueOf(xjy.this.e), ", distance is ", Integer.valueOf(xjy.this.f53136c));
                    xjy xjyVar5 = xjy.this;
                    xjyVar5.j = xjyVar5.o;
                    xjy xjyVar6 = xjy.this;
                    xjyVar6.h = xjyVar6.e;
                    xjy xjyVar7 = xjy.this;
                    xjyVar7.g = xjyVar7.f53136c;
                    xjy.this.f53134a = false;
                    return true;
                default:
                    return false;
            }
        }
    }

    public void c(Context context, long j) {
        this.i = 0;
        this.r = j / 60000;
        this.k = 0;
        this.m = new ArrayList();
        this.j = -1;
        this.h = -1;
        this.g = -1;
        this.s = FoundationCommonUtil.getAndroidId(context);
        this.l = System.currentTimeMillis();
        this.p = 0;
        try {
            this.f = Integer.parseInt(new SimpleDateFormat("d").format(Long.valueOf(this.l)));
        } catch (NumberFormatException unused) {
            LogUtil.j("Track_TreadmillStepPointData", "isNewDay exception");
        }
        HealthOpenSDK healthOpenSDK = this.d;
        if (healthOpenSDK == null) {
            LogUtil.a("Track_TreadmillStepPointData", "create mHealthOpenSdk.");
            HealthOpenSDK healthOpenSDK2 = new HealthOpenSDK();
            this.d = healthOpenSDK2;
            healthOpenSDK2.initSDK(context, new e(), "TreadmillStepPointData");
            this.d.c(new e());
        } else {
            healthOpenSDK.c(new e());
        }
        e();
    }

    public void b(long j, int i) {
        long j2 = j / 60000;
        this.k = i;
        if (this.r < j2) {
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.clear();
            LogUtil.a("Track_TreadmillStepPointData", "Time Changed old ", Long.valueOf(this.r), " new ", Long.valueOf(j2));
            if (this.f53135b != null) {
                if (this.i == 2) {
                    this.i = 3;
                    this.d.c(new e());
                }
                if (this.i == 0 && !this.f53134a && a()) {
                    this.i = 2;
                    this.f53134a = true;
                    this.d.c(new e());
                }
            }
            int i2 = i - this.n;
            this.r = j2;
            this.n = i;
            if (i2 <= 0) {
                LogUtil.a("Track_TreadmillStepPointData", "diffStep is 0");
                return;
            }
            if (i2 > 300.0d) {
                LogUtil.a("Track_TreadmillStepPointData", "diffStep is too big ,", Integer.valueOf(i2));
                return;
            }
            long j3 = j2 * 60000;
            jbw jbwVar = new jbw();
            jbwVar.c(j3 - 60000);
            jbwVar.d(j3);
            jbwVar.c(i2);
            LogUtil.a("Track_TreadmillStepPointData", "diffStep is ", Integer.valueOf(i2));
            this.m.add(jbwVar);
            d(this.m);
        }
    }

    public void b(long j) {
        LogUtil.a("Track_TreadmillStepPointData", "stopStepPointData ");
        int i = this.i;
        if (i == 0 || (i == 3 && !this.f53134a)) {
            this.i = 1;
        }
        int i2 = this.k;
        if (i2 > this.n) {
            b(j + 60000, i2);
        }
        HealthOpenSDK healthOpenSDK = this.d;
        if (healthOpenSDK == null) {
            LogUtil.j("Track_TreadmillStepPointData", "mHealthOpenSdk is null ");
        } else if (this.i == 1) {
            healthOpenSDK.c(new e());
        }
    }

    private void d(List<jbw> list) {
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(xjv.c(BaseApplication.getContext(), list), new HiDataOperateListener() { // from class: xjy.2
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (i == 0) {
                    LogUtil.a("Track_TreadmillStepPointData", "saveTreadmillStepPointData success obj = ", obj, ",type = ", Integer.valueOf(i));
                } else {
                    LogUtil.e("Track_TreadmillStepPointData", "saveTreadmillStepPointData fail obj = ", obj, ",type = ", Integer.valueOf(i));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("Track_TreadmillStepPointData", "insertData step is", Integer.valueOf(this.o), ", calories is ", Integer.valueOf(this.e), ", distance is", Integer.valueOf(this.f53136c), " ,mStartStep is ", Integer.valueOf(this.j), ", mStartTime is ", Long.valueOf(this.l), " ,mTreadMillStopStep is ", Integer.valueOf(this.p), " , mTreadMillStep is ", Integer.valueOf(this.k));
        int i = this.k - this.p;
        if (i <= 0) {
            LogUtil.a("Track_TreadmillStepPointData", "MSG_START treadmillStep is <= 0");
            return;
        }
        int i2 = this.o;
        int i3 = this.j;
        int iRound = Math.round(i * this.q);
        int iC = (int) (CalculateCaloriesUtils.c(((double) iRound) / 1000.0d, this.t) * 1000.0d);
        LogUtil.a("Track_TreadmillStepPointData", "addData step is", Integer.valueOf(i), " ,calories is ", Integer.valueOf(iC), " , distance is", Integer.valueOf(iRound));
        if (b(i2 - i3, i)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(e(this.j + i, 40002, this.l));
            arrayList.add(e(this.h + iC, 40003, this.l));
            arrayList.add(e(this.g + iRound, 40004, this.l));
            LogUtil.a("Track_TreadmillStepPointData", "isInsertData step is", Integer.valueOf(this.j + i), " ,calories is ", Integer.valueOf(this.h + iC), " , distance is", Integer.valueOf(this.g + iRound));
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(HiHealthHelper.b(arrayList), new c());
        }
        this.j = 0;
        this.h = 0;
        this.g = 0;
    }

    private boolean b(int i, int i2) {
        int i3;
        if (i > i2) {
            LogUtil.a("Track_TreadmillStepPointData", "totalDiffStep(", Integer.valueOf(i), ") > treadmillDiffStep(", Integer.valueOf(i2), Constants.RIGHT_BRACKET_ONLY);
            return false;
        }
        if (i < 0) {
            LogUtil.a("Track_TreadmillStepPointData", "mStep is less than mStartStep(totalDiffStep < 0) , mStep is ", Integer.valueOf(this.o), " , mStartStep is ", Integer.valueOf(this.j));
            return false;
        }
        try {
            i3 = Integer.parseInt(new SimpleDateFormat("d").format(Long.valueOf(System.currentTimeMillis())));
        } catch (NumberFormatException unused) {
            LogUtil.j("Track_TreadmillStepPointData", "isInsertData exception");
            i3 = 0;
        }
        if (i3 != this.f) {
            LogUtil.a("Track_TreadmillStepPointData", "not same day");
            return false;
        }
        if (!b(i2) || this.j < 0 || this.e < 0 || this.f53136c < 0 || i < 0) {
            return false;
        }
        LogUtil.a("Track_TreadmillStepPointData", "isInsertData is true");
        return true;
    }

    private boolean b(int i) {
        long j = this.l;
        if (j <= 0) {
            LogUtil.a("Track_TreadmillStepPointData", "mStartTime is less 0 ,mStartTime is ", Long.valueOf(j));
            return false;
        }
        if (i <= 0) {
            LogUtil.a("Track_TreadmillStepPointData", "totalDiffStep is less 0 , totalDiffStep is ", Integer.valueOf(i));
            return false;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.l) / 60000;
        if (jCurrentTimeMillis <= 0) {
            LogUtil.a("Track_TreadmillStepPointData", "time is less than 0");
            return false;
        }
        long j2 = ((long) i) / jCurrentTimeMillis;
        if (j2 <= 300.0d) {
            return true;
        }
        LogUtil.a("Track_TreadmillStepPointData", "stepRate is bigger than 300 , stepRate is ", Long.valueOf(j2));
        return false;
    }

    private void e() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            LogUtil.j("Track_TreadmillStepPointData", "accountInfo is null");
            return;
        }
        int heightOrDefaultValue = userInfo.getHeightOrDefaultValue();
        if (heightOrDefaultValue == 0) {
            this.q = 0.714f;
        } else {
            this.q = (heightOrDefaultValue * 0.42f) / 100.0f;
        }
        LogUtil.d("Track_TreadmillStepPointData", "The Stride is ", Float.valueOf(this.q));
        float weightOrDefaultValue = userInfo.getWeightOrDefaultValue();
        if (weightOrDefaultValue - 0.0f < 1.0E-6d) {
            this.t = 60.0f;
        } else {
            this.t = weightOrDefaultValue;
        }
        LogUtil.d("Track_TreadmillStepPointData", "User weight is ", Float.valueOf(this.t));
    }

    private HiHealthData b(int i, int i2, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(i2);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setTimeInterval(TimeUtil.b(System.currentTimeMillis()), System.currentTimeMillis());
        hiHealthData.setValue(i);
        return hiHealthData;
    }

    private HiHealthData e(int i, int i2, long j) {
        HiHealthData hiHealthDataB = b(i, i2, this.s);
        hiHealthDataB.setStartTime(j);
        return hiHealthDataB;
    }

    private boolean a() {
        int i;
        try {
            i = Integer.parseInt(new SimpleDateFormat("d").format(new Date(System.currentTimeMillis() + 60000)));
        } catch (NumberFormatException unused) {
            LogUtil.j("Track_TreadmillStepPointData", "isNewDay exception");
            i = -1;
        }
        int i2 = this.f;
        return (i2 == -1 || i == -1 || i2 == i) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        if (message == null || !(message.obj instanceof Bundle)) {
            LogUtil.j("Track_TreadmillStepPointData", "getDetail, (msg == null) || !(msg.obj instanceof Bundle)");
            return;
        }
        Bundle bundle = (Bundle) message.obj;
        this.o = bundle.getInt("step");
        this.e = bundle.getInt("carior");
        this.f53136c = bundle.getInt("distance");
    }

    static class c implements HiDataOperateListener {
        private c() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            LogUtil.a("Track_TreadmillStepPointData", "uploadStaticsToDB() onResult type = ", Integer.valueOf(i), " obj=", obj);
            if (i == 0) {
                LogUtil.a("Track_TreadmillStepPointData", "uploadStaticsToDB success ");
            } else {
                LogUtil.j("Track_TreadmillStepPointData", "uploadStaticsToDB failed message=", obj);
            }
        }
    }

    class e implements IExecuteResult {
        private e() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            LogUtil.a("Track_TreadmillStepPointData", "get today steps success");
            if (obj == null || xjy.this.f53135b == null) {
                LogUtil.j("Track_TreadmillStepPointData", "MyExecuteResult object or handler is null");
                return;
            }
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                int i = bundle.getInt("step", 0);
                int i2 = bundle.getInt("carior", 0);
                int i3 = bundle.getInt("distance", 0);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("step", i);
                bundle2.putInt("carior", i2);
                bundle2.putInt("distance", i3);
                Message message = new Message();
                if (xjy.this.i != 0) {
                    if (xjy.this.i != 2) {
                        if (xjy.this.i == 3) {
                            message.what = 1004;
                            message.obj = bundle2;
                            xjy.this.f53135b.sendMessage(message);
                            return;
                        } else {
                            message.what = 1002;
                            message.obj = bundle2;
                            xjy.this.f53135b.sendMessage(message);
                            return;
                        }
                    }
                    message.what = 1003;
                    message.obj = bundle2;
                    xjy.this.f53135b.sendMessage(message);
                    return;
                }
                message.what = 1001;
                message.obj = bundle2;
                xjy.this.f53135b.sendMessage(message);
            }
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            LogUtil.j("Track_TreadmillStepPointData", "get today steps onFailed");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            LogUtil.j("Track_TreadmillStepPointData", "get today steps onServiceException");
        }
    }
}
