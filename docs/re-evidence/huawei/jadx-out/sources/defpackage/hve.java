package defpackage;

import android.content.Context;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.suggestion.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.qpx;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hve {
    public static void e(IntPlan intPlan, Context context) {
        boolean zU = hvu.u(intPlan);
        ReleaseLogUtil.d("Suggestion_PushDataManager", "pushDataToDevice isPlanOverdue ", Boolean.valueOf(zU));
        if (zU) {
            return;
        }
        e(intPlan, new AnonymousClass1(context, intPlan));
    }

    /* JADX INFO: renamed from: hve$1, reason: invalid class name */
    public class AnonymousClass1 extends UiCallback<List<FitWorkout>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IntPlan f37199c;
        final /* synthetic */ Context d;

        AnonymousClass1(Context context, IntPlan intPlan) {
            this.d = context;
            this.f37199c = intPlan;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            final Context context = this.d;
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.suggestion.ui.plan.manage.PushDataManager$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    qpx.e(context, R.string.IDS_plan_sync_fail);
                }
            });
            LogUtil.j("Suggestion_PushDataManager", " pushDataToDevice failed with ", Integer.valueOf(i), " errorInfo:", str);
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_PUSH_PLAN_DEVICE_60010007.value(), i);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<FitWorkout> list) {
            igc igcVarA = igc.a(this.f37199c.getPlanType().getType());
            final IntPlan intPlan = this.f37199c;
            final Context context = this.d;
            igcVarA.c(intPlan, list, 2, true, new IBaseResponseCallback() { // from class: hvc
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    hve.AnonymousClass1.c(intPlan, context, i, obj);
                }
            });
        }

        static /* synthetic */ void c(final IntPlan intPlan, final Context context, final int i, Object obj) {
            LogUtil.a("Suggestion_PushDataManager", "errorCode:", Integer.valueOf(i), " objData", obj);
            HandlerExecutor.b(new Runnable() { // from class: hva
                @Override // java.lang.Runnable
                public final void run() {
                    hve.AnonymousClass1.a(i, intPlan, context);
                }
            });
        }

        static /* synthetic */ void a(int i, IntPlan intPlan, Context context) {
            if (i == 0) {
                btw.s(intPlan);
                qpx.a(context, R.string.IDS_plan_sync_success);
            } else {
                qpx.e(context, R.string.IDS_plan_sync_fail);
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_PUSH_PLAN_DEVICE_60010007.value(), i);
            }
        }
    }

    public static void e(IntPlan intPlan, final UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_PushDataManager", " getCurrentWeekCourse failed with callback is null.");
            return;
        }
        int iH = btw.h(intPlan);
        btw.a(iH, intPlan);
        final ArrayList arrayList = new ArrayList(btw.a(iH, intPlan));
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        List<gzl> listC = pea.c(arrayList);
        final List<FitWorkout> listD = d(intPlan, iH);
        if (njy.e(listC)) {
            uiCallback.onSuccess(listD);
        } else {
            courseApi.getCourseByIds(listC, true, new UiCallback<List<FitWorkout>>() { // from class: hve.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list) {
                    if (list != null && arrayList.size() == list.size()) {
                        list.addAll(listD);
                        uiCallback.onSuccess(list);
                    } else {
                        uiCallback.onFailure(0, "get courses result data size error.");
                    }
                }
            });
        }
    }

    private static List<FitWorkout> d(IntPlan intPlan, int i) {
        if (intPlan == null) {
            return new ArrayList();
        }
        return btw.c(intPlan.getWeekInfoByOrder(i));
    }

    public static boolean d() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_PushDataManager");
        return deviceInfo != null && deviceInfo.getDeviceConnectState() == 2;
    }
}
