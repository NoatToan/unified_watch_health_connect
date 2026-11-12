package com.huawei.ui.homehealth.runcard.operation.recommendalgo;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.runcard.operation.operationpositions.RecommedRunCourseInterators;
import com.huawei.ui.homehealth.runcard.operation.recommendalgo.model.SportLevel;
import com.huawei.up.model.UserInfomation;
import defpackage.njy;
import defpackage.nkx;
import defpackage.sxi;
import defpackage.sxp;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SportLevelManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SportLevel f25847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SportLevelCallback f25848c;
    private a d;
    private UserInfomation h;
    private StorageParams f = new StorageParams();
    private String e = Integer.toString(20002);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f25846a = new Handler() { // from class: com.huawei.ui.homehealth.runcard.operation.recommendalgo.SportLevelManager.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1001) {
                SportLevelManager.this.d(message);
            } else {
                if (i != 1002) {
                    return;
                }
                SportLevelManager.this.b(message);
            }
        }
    };

    public interface SportLevelCallback {
        void onResponse(SportLevel sportLevel);
    }

    public SportLevelManager() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), this.e, "LAST_SPORT_LEVEL");
        if (TextUtils.isEmpty(strE)) {
            this.f25847b = new SportLevel(-1, 0);
        } else {
            try {
                this.f25847b = (SportLevel) new Gson().fromJson(strE, SportLevel.class);
            } catch (JsonSyntaxException e) {
                LogUtil.j("Track_SportLevelManager", "getLastSportLevel ", e.getMessage());
                try {
                    this.f25847b = new SportLevel(Integer.parseInt(strE), 0);
                } catch (NumberFormatException e2) {
                    LogUtil.j("Track_SportLevelManager", "getLastSportLevel e1", e2.getMessage());
                    this.f25847b = new SportLevel(-1, 0);
                }
            }
        }
        this.d = new a(this.f25846a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        LogUtil.a("Track_SportLevelManager", "handleRunHistoryMsg");
        sxi sxiVar = new sxi();
        if (this.f25848c != null) {
            if (njy.b(message.obj, HiHealthData.class)) {
                this.f25848c.onResponse(b(sxiVar.e((List<HiHealthData>) message.obj, this.h)));
            } else {
                LogUtil.j("Track_SportLevelManager", "Has not sport level");
                this.f25848c.onResponse(b(new SportLevel(-1, 0)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        LogUtil.a("Track_SportLevelManager", "handleVo2MaxMsg");
        sxp sxpVar = new sxp();
        SportLevel sportLevel = new SportLevel(-1, 0);
        try {
            if (njy.b(message.obj, HiHealthData.class)) {
                sportLevel = sxpVar.a((List) message.obj, this.h);
            }
        } catch (ClassCastException e) {
            LogUtil.j("Track_SportLevelManager", e.getMessage());
        }
        if (sportLevel != null && sportLevel.acquireLevel() != -1) {
            LogUtil.a("Track_SportLevelManager", "handleVo2MaxMsg sportLevel is ", sportLevel);
            SportLevelCallback sportLevelCallback = this.f25848c;
            if (sportLevelCallback != null) {
                sportLevelCallback.onResponse(b(sportLevel));
                return;
            }
            return;
        }
        LogUtil.a("Track_SportLevelManager", "handleVo2MaxMsg no Vo2Max ,get Run data ");
        d();
    }

    static class a implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<Handler> f25850b;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        a(Handler handler) {
            this.f25850b = null;
            this.f25850b = new WeakReference<>(handler);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            WeakReference<Handler> weakReference = this.f25850b;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.j("Track_SportLevelManager", "readVo2Max handler is null");
                return;
            }
            Handler handler = this.f25850b.get();
            if (handler == null) {
                LogUtil.j("Track_SportLevelManager", "MyHiAggregateListener handler is null");
                return;
            }
            Message messageObtainMessage = handler.obtainMessage(1001);
            if (list == null) {
                LogUtil.j("Track_SportLevelManager", "readVo2Max datas is null");
                messageObtainMessage.obj = null;
            } else {
                LogUtil.a("Track_SportLevelManager", "readVo2Max ", list);
                messageObtainMessage.obj = list;
            }
            handler.sendMessage(messageObtainMessage);
        }
    }

    private void d() {
        LogUtil.a("Track_SportLevelManager", "readRunData");
        long jCurrentTimeMillis = System.currentTimeMillis();
        nkx.e().c(jCurrentTimeMillis - 2592000000L, jCurrentTimeMillis, 258, false, (IBaseResponseCallback) new c(this));
    }

    static class c implements IBaseResponseCallback {
        private WeakReference<SportLevelManager> e;

        c(SportLevelManager sportLevelManager) {
            this.e = new WeakReference<>(sportLevelManager);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            List list;
            LogUtil.a("Track_SportLevelManager", "RunDataCallBack onResponse");
            try {
                list = njy.b(obj, HiHealthData.class) ? (List) obj : null;
            } catch (ClassCastException e) {
                LogUtil.j("Track_SportLevelManager", "parseTrackSimplifyData ", e.getMessage());
            }
            SportLevelManager sportLevelManager = this.e.get();
            if (sportLevelManager != null) {
                Message messageObtainMessage = sportLevelManager.f25846a.obtainMessage(1002);
                messageObtainMessage.obj = list;
                sportLevelManager.f25846a.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("Track_SportLevelManager", "mWeakReference.get() is null");
        }
    }

    public SportLevel b(SportLevel sportLevel) {
        if (sportLevel == null) {
            LogUtil.a("Track_SportLevelManager", "updateSportLevel currentLevel is null");
            sportLevel = new SportLevel(-1, 0);
        }
        SportLevel sportLevel2 = this.f25847b;
        if (sportLevel2 == null) {
            LogUtil.a("Track_SportLevelManager", "updateSportLevel mLastSportLevel is null");
            return sportLevel;
        }
        if (sportLevel2.acquireLevel() != sportLevel.acquireLevel()) {
            RecommedRunCourseInterators.c();
        }
        LogUtil.a("Track_SportLevelManager", "updateSportLevel ", sportLevel, " ", this.f25847b);
        this.f25847b = sportLevel;
        SharedPreferenceManager.e(BaseApplication.getContext(), this.e, "LAST_SPORT_LEVEL", new Gson().toJson(this.f25847b), this.f);
        return sportLevel;
    }
}
