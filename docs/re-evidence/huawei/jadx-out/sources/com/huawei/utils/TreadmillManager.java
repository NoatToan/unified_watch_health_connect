package com.huawei.utils;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.exercise.modle.ITreadmillStyleCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.motion.RealStepCallback;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.treadmill.CallBackToReportStepsOrEvent;
import com.huawei.up.model.UserInfomation;
import defpackage.qht;
import defpackage.xkg;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes20.dex */
public class TreadmillManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExtendHandler f30027c;
    private qht e;
    private xkg h;
    private int i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RealStepCallback f30025a = null;
    private ITreadmillStyleCallback f = null;
    private int g = 3;
    private int d = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CallBackToReportStepsOrEvent f30026b = new CallBackToReportStepsOrEvent() { // from class: com.huawei.utils.TreadmillManager.4
        @Override // com.huawei.treadmill.CallBackToReportStepsOrEvent
        public void onUpdateStepsOrEvent(int i, int i2) {
            PluginHealthTrackAdapterImpl.getInstance(BaseApplication.b()).updateStepPoint(i, System.currentTimeMillis());
            if (!TreadmillManager.this.e(i2) || TreadmillManager.this.f30027c == null) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1001;
            messageObtain.arg1 = i2;
            TreadmillManager.this.f30027c.sendMessage(messageObtain);
        }
    };

    public TreadmillManager(Context context) {
        this.i = 1;
        LogUtil.a("Track_TreadmillManager", " new TreadmillManager");
        if (this.h == null) {
            xkg xkgVarD = xkg.d(context);
            this.h = xkgVarD;
            if (xkgVarD != null) {
                this.e = new qht();
                d();
                boolean zD = this.h.d(this.e, this.f30026b, 1000);
                if (zD) {
                    LogUtil.a("Track_TreadmillManager", " TreadmillManager result of refreshWorkoutParameters:", Boolean.valueOf(this.h.d(30000, 0, 0)));
                }
                LogUtil.a("Track_TreadmillManager", " TreadmillManager result of initAndStartVibraStepCount:", Boolean.valueOf(zD));
            } else {
                LogUtil.j("Track_TreadmillManager", "getInstance of VibraStepCounterHelper failed");
            }
        }
        this.i = 1;
    }

    public void c() {
        LogUtil.a("Track_TreadmillManager", " stopTreadmillStep");
        xkg xkgVar = this.h;
        if (xkgVar != null) {
            xkgVar.d();
            this.h = null;
        }
    }

    public boolean a(IExecuteResult iExecuteResult) {
        LogUtil.a("Track_TreadmillManager", "getStandSteps callback:", iExecuteResult);
        xkg xkgVar = this.h;
        if (xkgVar == null) {
            LogUtil.j("Track_TreadmillManager", "reportCallback mVibraStepCounterHelper is null");
            return false;
        }
        if (iExecuteResult != null) {
            try {
                LogUtil.a("Track_TreadmillManager", "getStandSteps ", Integer.valueOf(xkgVar.c()));
                Bundle bundle = new Bundle();
                bundle.putInt("standSteps", this.h.c());
                iExecuteResult.onSuccess(bundle);
            } catch (Exception e) {
                LogUtil.j("Track_TreadmillManager", "getStandSteps ", LogAnonymous.b(e));
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        xkg xkgVar = this.h;
        if (xkgVar == null) {
            LogUtil.j("Track_TreadmillManager", "reportCallback mVibraStepCounterHelper is null");
            return;
        }
        if (this.f30025a != null) {
            try {
                this.f30025a.onReport(xkgVar.c(), this.g);
            } catch (Exception e) {
                LogUtil.e("Track_TreadmillManager", "Exception", LogAnonymous.b(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        ITreadmillStyleCallback iTreadmillStyleCallback = this.f;
        if (iTreadmillStyleCallback != null) {
            try {
                iTreadmillStyleCallback.onTreadmillStyleChange(i, System.currentTimeMillis());
                return;
            } catch (Exception e) {
                LogUtil.e("Track_TreadmillManager", "Exception", LogAnonymous.b(e));
                return;
            }
        }
        LogUtil.e("Track_TreadmillManager", "reportToTreadmillStyleCallback mTreadmillStyleCallback is null");
    }

    public boolean e(ITreadmillStyleCallback iTreadmillStyleCallback) {
        LogUtil.a("Track_TreadmillManager", "registerFreeIndoorRunningStyle");
        if (iTreadmillStyleCallback == null) {
            LogUtil.e("Track_TreadmillManager", "registerFreeIndoorRunningStyle callback is null");
            return false;
        }
        this.f = iTreadmillStyleCallback;
        return true;
    }

    public boolean a() {
        LogUtil.a("Track_TreadmillManager", "unregisterFreeIndoorRunningStyle");
        this.f = null;
        return true;
    }

    public boolean c(RealStepCallback realStepCallback, int i) {
        if (realStepCallback == null || i < 1000) {
            return false;
        }
        this.f30025a = realStepCallback;
        this.d = i;
        this.f30027c = HandlerCenter.b(new Handler.Callback() { // from class: com.huawei.utils.TreadmillManager.5
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1000) {
                    TreadmillManager.this.e();
                    if (TreadmillManager.this.f30027c == null) {
                        return true;
                    }
                    TreadmillManager.this.f30027c.sendEmptyMessage(1000, TreadmillManager.this.d);
                    return true;
                }
                if (i2 != 1001) {
                    return false;
                }
                int i3 = message.arg1;
                LogUtil.a("Track_TreadmillManager", "MSG_REPORT_TREADMILL_STYLE treadmill newStyle is ", Integer.valueOf(i3));
                TreadmillManager.this.b(i3);
                return true;
            }
        }, "flush_worker_thread");
        Message messageObtain = Message.obtain();
        messageObtain.what = 1000;
        messageObtain.obj = "refresh";
        this.f30027c.sendMessage(messageObtain);
        return true;
    }

    public boolean b() {
        this.f30025a = null;
        ExtendHandler extendHandler = this.f30027c;
        if (extendHandler == null) {
            return true;
        }
        extendHandler.removeMessages(1000);
        this.f30027c.quit(false);
        this.f30027c = null;
        return true;
    }

    private void d() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        int i = 1;
        if (userInfo != null && userInfo.getGenderOrDefaultValue() == 1) {
            i = 0;
        }
        int iRound = (userInfo == null || userInfo.getWeightOrDefaultValue() <= 0.0f) ? 60 : Math.round(userInfo.getWeightOrDefaultValue());
        int heightOrDefaultValue = (userInfo == null || userInfo.getHeightOrDefaultValue() <= 0) ? 170 : userInfo.getHeightOrDefaultValue();
        qht qhtVar = this.e;
        if (qhtVar != null) {
            qhtVar.d(i, iRound, heightOrDefaultValue);
            this.e.d(new int[]{CacheDataSink.DEFAULT_BUFFER_SIZE, 110, 720, 5, 20});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i) {
        if ((i != 2 && i != 1) || i == this.i) {
            return false;
        }
        this.i = i;
        return true;
    }
}
