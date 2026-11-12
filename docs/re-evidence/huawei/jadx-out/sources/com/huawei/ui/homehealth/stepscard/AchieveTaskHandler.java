package com.huawei.ui.homehealth.stepscard;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.threecircle.api.ThreeCircleApi;
import com.huawei.ui.commonui.dialog.AchieveDialogFactory;
import com.huawei.ui.commonui.dialog.BaseAchieveDialog;
import com.huawei.ui.commonui.dialog.DialogResourcesListener;
import com.huawei.ui.homehealth.knit.ModelCardProvider;
import defpackage.fua;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.qhp;
import defpackage.qqw;
import defpackage.tcw;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes17.dex */
public class AchieveTaskHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ModelCardProvider> f26092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<tcw> f26093b;
    private final SparseArray<Long> e = new SparseArray<>();
    private final SparseArray<WeakReference<BaseAchieveDialog>> d = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f26094c = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.homehealth.stepscard.AchieveTaskHandler.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            AchieveTaskHandler.this.d(message);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        AchieveAniType achieveAniTypeTypeOf = AchieveAniType.typeOf(message.what);
        if (achieveAniTypeTypeOf == null) {
            ReleaseLogUtil.c("SCUI_AchieveDialogHandler", "processTaskMsg failed with wrong type=", Integer.valueOf(message.what));
            return;
        }
        Bundle bundle = message.obj instanceof Bundle ? (Bundle) message.obj : new Bundle();
        long j = bundle.getLong("task_time", System.currentTimeMillis());
        if (achieveAniTypeTypeOf.mAchieveStrKey != null && achieveAniTypeTypeOf.mAchieveStrKey.length() != 0) {
            bundle.putString("achieveText", e(achieveAniTypeTypeOf.mAchieveStrKey));
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null || !activityJ.getLocalClassName().contains("MainActivity")) {
            LogUtil.e("SCUI_AchieveDialogHandler", "doTask mainActivity is not show");
            c(achieveAniTypeTypeOf, j);
            return;
        }
        BaseAchieveDialog baseAchieveDialogC = c(achieveAniTypeTypeOf, bundle, j);
        if (baseAchieveDialogC == null) {
            c(achieveAniTypeTypeOf, j);
            ReleaseLogUtil.c("SCUI_AchieveDialogHandler", "processTaskMsg failed with dialog is null type=", achieveAniTypeTypeOf);
            return;
        }
        if (fua.b()) {
            tcw tcwVar = this.f26093b.get();
            if (tcwVar != null) {
                baseAchieveDialogC.setGotoDetailBtnClickListener(tcwVar.d(achieveAniTypeTypeOf));
            }
        } else {
            ModelCardProvider modelCardProvider = this.f26092a.get();
            if (modelCardProvider != null) {
                baseAchieveDialogC.setGotoDetailBtnClickListener(modelCardProvider.a(achieveAniTypeTypeOf));
            }
        }
        baseAchieveDialogC.show();
        this.d.put(achieveAniTypeTypeOf.mType, new WeakReference<>(baseAchieveDialogC));
        ReleaseLogUtil.c("SCUI_AchieveDialogHandler", " show dialog type is:", Integer.valueOf(achieveAniTypeTypeOf.mType));
        a(achieveAniTypeTypeOf.mType);
    }

    private BaseAchieveDialog c(final AchieveAniType achieveAniType, Bundle bundle, final long j) {
        Context context;
        if (fua.b()) {
            tcw tcwVar = this.f26093b.get();
            if (tcwVar == null) {
                LogUtil.e("SCUI_AchieveDialogHandler", "getAchieveDialog cardData == null");
                return null;
            }
            context = tcwVar.mContext;
        } else {
            ModelCardProvider modelCardProvider = this.f26092a.get();
            if (modelCardProvider == null) {
                LogUtil.e("SCUI_AchieveDialogHandler", "getAchieveDialog cardProvider == null");
                return null;
            }
            context = modelCardProvider.d;
        }
        if (context == null) {
            LogUtil.e("SCUI_AchieveDialogHandler", "getAchieveDialog context == null");
            return null;
        }
        return AchieveDialogFactory.e().a(context, achieveAniType.mDialogType, bundle, new DialogResourcesListener() { // from class: com.huawei.ui.homehealth.stepscard.AchieveTaskHandler.2
            @Override // com.huawei.ui.commonui.dialog.DialogResourcesListener
            public void onResourcesDownloadFailed() {
                AchieveTaskHandler.this.c(achieveAniType, j);
            }

            @Override // com.huawei.ui.commonui.dialog.DialogResourcesListener
            public void onShown() {
                AchieveTaskHandler.this.b(achieveAniType, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AchieveAniType achieveAniType, long j) {
        ReleaseLogUtil.d("SCUI_AchieveDialogHandler", " taskFailedProcess. pls check,dialog type", Integer.valueOf(achieveAniType.mType), " dialog create time:", Long.valueOf(j));
        this.e.remove(achieveAniType.mType);
        this.d.remove(achieveAniType.mType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AchieveAniType achieveAniType, long j) {
        ReleaseLogUtil.d("SCUI_AchieveDialogHandler", " taskSuccessProcess. dialog type:", Integer.valueOf(achieveAniType.mType), " dialog create time:", Long.valueOf(j));
        this.e.put(achieveAniType.mType, Long.valueOf(j));
        b(achieveAniType.mSpKey, j);
    }

    public void e(tcw tcwVar) {
        this.f26093b = new WeakReference<>(tcwVar);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(final AchieveAniType achieveAniType, final Bundle bundle) {
        if (achieveAniType == null) {
            ReleaseLogUtil.c("SCUI_AchieveDialogHandler", " addAchieveTask  failed type is null.");
            return;
        }
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: tay
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(achieveAniType, bundle);
                }
            });
            return;
        }
        if (b(achieveAniType)) {
            Bundle bundle2 = bundle == null ? new Bundle() : bundle;
            long jCurrentTimeMillis = System.currentTimeMillis();
            bundle2.putLong("task_time", jCurrentTimeMillis);
            this.e.put(achieveAniType.mType, Long.valueOf(jCurrentTimeMillis));
            ReleaseLogUtil.c("SCUI_AchieveDialogHandler", " addAchieveTask success. type=", achieveAniType, " time=", Long.valueOf(jCurrentTimeMillis));
            if (AchieveAniType.THREE_CIRCLE.equals(achieveAniType) || AchieveAniType.SINGLE_CIRCLE_WALK.equals(achieveAniType)) {
                if (!d()) {
                    b(achieveAniType, bundle);
                    return;
                }
                ArrayList arrayList = new ArrayList(1);
                arrayList.add("900200011");
                qhp.c(arrayList, new a(achieveAniType, bundle));
                return;
            }
            b(achieveAniType, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AchieveAniType achieveAniType, Bundle bundle) {
        Message messageObtainMessage = this.f26094c.obtainMessage(achieveAniType.mType);
        messageObtainMessage.obj = bundle;
        if (AchieveAniType.isSubType(achieveAniType)) {
            this.f26094c.sendMessageDelayed(messageObtainMessage, 1000L);
        } else {
            c(achieveAniType);
            this.f26094c.sendMessage(messageObtainMessage);
        }
    }

    private void c(AchieveAniType achieveAniType) {
        List<AchieveAniType> subTypes = achieveAniType.getSubTypes();
        ArrayList arrayList = new ArrayList();
        for (AchieveAniType achieveAniType2 : subTypes) {
            this.f26094c.removeMessages(achieveAniType2.mType);
            this.e.remove(achieveAniType2.mType);
            arrayList.add(Integer.valueOf(achieveAniType2.mType));
        }
        ReleaseLogUtil.c("SCUI_AchieveDialogHandler", " removeSubTypeTask success. superType=", achieveAniType, " subTypes=", arrayList);
    }

    public boolean b(AchieveAniType achieveAniType) {
        if (achieveAniType == null) {
            ReleaseLogUtil.c("SCUI_AchieveDialogHandler", " hasAddedAchieveTask failed. type is null.");
            return false;
        }
        AchieveAniType superType = achieveAniType.getSuperType();
        long jD = superType != null ? d(superType) : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = Math.max(jD, d(achieveAniType));
        return jCurrentTimeMillis > jMax && !lsl.c(jCurrentTimeMillis, jMax);
    }

    private long d(AchieveAniType achieveAniType) {
        long jLongValue = this.e.get(achieveAniType.mType, -1L).longValue();
        if (jLongValue != -1) {
            return jLongValue;
        }
        long jC = c(achieveAniType.mSpKey);
        this.e.put(achieveAniType.mType, Long.valueOf(jC));
        return jC;
    }

    private long c(String str) {
        if (str.equals(AchieveAniType.THREE_LEAF_ACTIVE.mSpKey) || str.equals(AchieveAniType.THREE_LEAF_PERFECT.mSpKey)) {
            String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), str);
            ReleaseLogUtil.c("SCUI_AchieveDialogHandler", "getLatestTaskDoneTime key:", str, " time:", strE);
            long jI = CommonUtil.i(strE);
            if (jI != 0) {
                b(str, jI);
            }
        }
        long jD = SharedPreferenceManager.d(Integer.toString(10000), str, 0L);
        ReleaseLogUtil.c("SCUI_AchieveDialogHandler", "getLatestTaskDoneTime key:", str, " time:", Long.valueOf(jD));
        return jD;
    }

    private void b(String str, long j) {
        ReleaseLogUtil.c("SCUI_AchieveDialogHandler", "setLatestTaskDoneTime key:", str, " time:", Long.valueOf(j));
        SharedPreferenceManager.c(Integer.toString(10000), str, j);
    }

    private boolean d() {
        long jC = DateFormatUtil.c(SharedPreferenceManager.c("threeCircleSp", "hw.sport.threecircle", 0), TimeZone.getDefault());
        long jD = SharedPreferenceManager.d("threeCircleSp", "devicesConnectTime", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jC > jCurrentTimeMillis || jD > jCurrentTimeMillis) {
            LogUtil.d("SCUI_AchieveDialogHandler", "connect in future with ", Long.valueOf(jC), ":", Long.valueOf(jD));
            return false;
        }
        long jC2 = lsl.c(jCurrentTimeMillis, -2);
        return jC > jC2 || jD > jC2;
    }

    private String e(String str) {
        final ThreeCircleApi threeCircleApi = (ThreeCircleApi) Services.b("DailyActivity", ThreeCircleApi.class);
        String promptMessage = threeCircleApi.getPromptMessage(threeCircleApi.queryRules("TodayAchievement", str), new HashMap());
        LogUtil.b("SCUI_AchieveDialogHandler", "getAchieveString achieveType=", str, " promptMessage=", promptMessage);
        ThreadPoolManager.c().execute(new Runnable() { // from class: taw
            @Override // java.lang.Runnable
            public final void run() {
                threeCircleApi.checkUpdateForThreeCircle();
            }
        });
        return promptMessage;
    }

    private void a(int i) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_MODE_COMPLETE_2010118.value(), map, 0);
    }

    public void c(Configuration configuration) {
        BaseAchieveDialog baseAchieveDialog;
        for (int i = 0; i < this.d.size(); i++) {
            WeakReference<BaseAchieveDialog> weakReferenceValueAt = this.d.valueAt(i);
            if (weakReferenceValueAt != null && (baseAchieveDialog = weakReferenceValueAt.get()) != null) {
                baseAchieveDialog.onConfigurationChanged(configuration);
            }
        }
    }

    public enum AchieveAniType {
        THREE_LEAF_ACTIVE(1, "vibrancy_today", 2, AchieveDialogFactory.DialogType.THREE_LEAF_ACTIVE),
        THREE_LEAF_PERFECT(2, "perfect_today", 0, AchieveDialogFactory.DialogType.THREE_LEAF_PERFECT),
        THREE_CIRCLE(3, "achieved_show_time", 0, AchieveDialogFactory.DialogType.THREE_CIRCLE, "DoneAll"),
        SINGLE_CIRCLE_WALK(4, "step_achieved_show_time", 0, AchieveDialogFactory.DialogType.SINGLE_CIRCLE_WALK),
        SINGLE_CIRCLE_INTENSITY(5, "intensity_achieved_show_time", 3, AchieveDialogFactory.DialogType.SINGLE_CIRCLE_INTENSITY, "DoneIntensity"),
        SINGLE_CIRCLE_ACTIVE(6, "active_achieved_show_time", 3, AchieveDialogFactory.DialogType.SINGLE_CIRCLE_ACTIVE, "DoneActiveH"),
        SINGLE_CIRCLE_CALORIE(7, "heat_achieved_show_time", 3, AchieveDialogFactory.DialogType.SINGLE_CIRCLE_CALORIE, "DoneCalorie");

        private String mAchieveStrKey;
        private AchieveDialogFactory.DialogType mDialogType;
        private String mSpKey;
        private int mSuperType;
        private int mType;

        AchieveAniType(int i, String str, int i2, AchieveDialogFactory.DialogType dialogType) {
            this.mType = i;
            this.mSpKey = str;
            this.mSuperType = i2;
            this.mDialogType = dialogType;
        }

        AchieveAniType(int i, String str, int i2, AchieveDialogFactory.DialogType dialogType, String str2) {
            this.mType = i;
            this.mSpKey = str;
            this.mSuperType = i2;
            this.mDialogType = dialogType;
            this.mAchieveStrKey = str2;
        }

        public List<AchieveAniType> getSubTypes() {
            ArrayList arrayList = new ArrayList();
            for (AchieveAniType achieveAniType : values()) {
                if (achieveAniType.mSuperType == this.mType) {
                    arrayList.add(achieveAniType);
                }
            }
            return arrayList;
        }

        public AchieveAniType getSuperType() {
            return typeOf(this.mSuperType);
        }

        public static AchieveAniType typeOf(int i) {
            for (AchieveAniType achieveAniType : values()) {
                if (achieveAniType.mType == i) {
                    return achieveAniType;
                }
            }
            return null;
        }

        public static boolean isSubType(AchieveAniType achieveAniType) {
            return (achieveAniType == null || achieveAniType.mSuperType == 0) ? false : true;
        }
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AchieveAniType f26098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f26099c;
        private final WeakReference<AchieveTaskHandler> e;

        private a(AchieveTaskHandler achieveTaskHandler, AchieveAniType achieveAniType, Bundle bundle) {
            this.e = new WeakReference<>(achieveTaskHandler);
            this.f26098b = achieveAniType;
            this.f26099c = bundle;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            AchieveTaskHandler achieveTaskHandler = this.e.get();
            if (achieveTaskHandler == null) {
                LogUtil.e("SCUI_AchieveDialogHandler", "onResponse: achieveTaskHandler is null");
                return;
            }
            if (!(obj instanceof HashMap)) {
                LogUtil.e("SCUI_AchieveDialogHandler", "onResponse: objData is not instanceof HashMap");
                return;
            }
            String strD = qqw.d((Map) obj, "900200011", "1");
            LogUtil.b("SCUI_AchieveDialogHandler", "remind switch is ", strD);
            if ("0".equals(strD)) {
                achieveTaskHandler.b(this.f26098b, this.f26099c);
            } else {
                achieveTaskHandler.b(this.f26098b, System.currentTimeMillis());
            }
        }
    }
}
