package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.bean.AchieveAniType;
import com.huawei.ui.commonui.dialog.AchieveDialogFactory;
import com.huawei.ui.commonui.dialog.BaseAchieveDialog;
import com.huawei.ui.commonui.dialog.DialogResourcesListener;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes19.dex */
public class uhu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f50101a;
    private long d = System.currentTimeMillis();
    private BaseAchieveDialog e;

    public uhu(Activity activity) {
        this.f50101a = new WeakReference<>(activity);
    }

    public void b(long j) {
        this.d = j;
    }

    public void e(int i, int i2) {
        if (i2 < i) {
            LogUtil.a("SCUI_WalkAchieveDialogHelper", "putSingleAchieveDialog currentValue < goalValue");
            return;
        }
        long jD = SharedPreferenceManager.d(Integer.toString(10000), AchieveAniType.SINGLE_CIRCLE_WALK.mSpKey, 0L);
        LogUtil.a("SCUI_WalkAchieveDialogHelper", "showWalkAchieveDialog showWalkAchieveDialog:", Long.valueOf(jD), "mCurrentTime:", Long.valueOf(this.d));
        if (!lsl.c(System.currentTimeMillis(), this.d)) {
            LogUtil.a("SCUI_WalkAchieveDialogHelper", "showWalkAchieveDialog isSameDay");
            return;
        }
        if (lsl.c(System.currentTimeMillis(), jD)) {
            LogUtil.a("SCUI_WalkAchieveDialogHelper", "showWalkAchieveDialog isSameDay");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("three_circle_callback", c(i2));
        bundle.putInt("target_value", i);
        bundle.putInt("achieve_user_value", i2);
        if (!d()) {
            a(bundle);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200011");
        qhp.c(arrayList, new d(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        if (this.e == null) {
            this.e = b(bundle, System.currentTimeMillis());
        }
        BaseAchieveDialog baseAchieveDialog = this.e;
        if (baseAchieveDialog != null) {
            baseAchieveDialog.show();
            this.e.setGotoDetailBtnClickListener(new View.OnClickListener() { // from class: uhy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ujq.d(5);
                }
            });
        }
        c();
    }

    public void d(Configuration configuration) {
        BaseAchieveDialog baseAchieveDialog = this.e;
        if (baseAchieveDialog != null) {
            baseAchieveDialog.onConfigurationChanged(configuration);
        }
    }

    private boolean d() {
        long jC = DateFormatUtil.c(SharedPreferenceManager.c("threeCircleSp", "hw.sport.threecircle", 0), TimeZone.getDefault());
        long jD = SharedPreferenceManager.d("threeCircleSp", "devicesConnectTime", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jC > jCurrentTimeMillis || jD > jCurrentTimeMillis) {
            health.compact.a.LogUtil.d("SCUI_WalkAchieveDialogHelper", "connect in future with ", Long.valueOf(jC), ":", Long.valueOf(jD));
            return false;
        }
        long jC2 = lsl.c(jCurrentTimeMillis, -2);
        return jC > jC2 || jD > jC2;
    }

    private void c() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", AchieveAniType.SINGLE_CIRCLE_WALK);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_MODE_COMPLETE_2010118.value(), map, 0);
    }

    private BaseAchieveDialog b(Bundle bundle, final long j) {
        Activity activity = this.f50101a.get();
        if (!iov.d(activity)) {
            ReleaseLogUtil.e("SCUI_WalkAchieveDialogHelper", "getAchieveDialog activity ", activity);
            return null;
        }
        return AchieveDialogFactory.e().a(activity, AchieveAniType.SINGLE_CIRCLE_WALK.mDialogType, bundle, new DialogResourcesListener() { // from class: uhu.4
            @Override // com.huawei.ui.commonui.dialog.DialogResourcesListener
            public void onResourcesDownloadFailed() {
            }

            @Override // com.huawei.ui.commonui.dialog.DialogResourcesListener
            public void onShown() {
                ReleaseLogUtil.d("SCUI_WalkAchieveDialogHelper", "setLatestTaskDoneTime key:", AchieveAniType.SINGLE_CIRCLE_WALK.mSpKey, " time:", Long.valueOf(j));
                SharedPreferenceManager.c(Integer.toString(10000), AchieveAniType.SINGLE_CIRCLE_WALK.mSpKey, j);
            }
        });
    }

    private Serializable c(int i) {
        return new uia(i);
    }

    static /* synthetic */ void e(int i, boolean z) {
        ReleaseLogUtil.d("SCUI_WalkAchieveDialogHelper", "Go share dealStepData.");
        uhs.c(i, System.currentTimeMillis());
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<uhu> f50104a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f50105c;

        private d(uhu uhuVar, Bundle bundle) {
            this.f50104a = new WeakReference<>(uhuVar);
            this.f50105c = bundle;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            uhu uhuVar = this.f50104a.get();
            if (uhuVar == null) {
                health.compact.a.LogUtil.e("SCUI_WalkAchieveDialogHelper", "onResponse: achieveHandler is null");
                return;
            }
            if (!(obj instanceof HashMap)) {
                LogUtil.j("SCUI_WalkAchieveDialogHelper", "onResponse: objData is not instanceof HashMap");
                return;
            }
            String strD = qqw.d((Map) obj, "900200011", "1");
            ReleaseLogUtil.d("SCUI_WalkAchieveDialogHelper", "remind switch is ", strD);
            if ("0".equals(strD)) {
                uhuVar.a(this.f50105c);
            } else {
                SharedPreferenceManager.c(Integer.toString(10000), AchieveAniType.SINGLE_CIRCLE_WALK.mSpKey, System.currentTimeMillis());
            }
        }
    }
}
