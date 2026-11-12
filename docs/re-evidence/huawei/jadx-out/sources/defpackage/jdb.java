package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sport.utils.RunPopularRoutesUtil;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteConstants;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.runningroute.view.RouteAutoRemindDialog;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.HiDateUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jdb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f38413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gdq f38415c;
    private boolean d = true;
    private boolean e = false;
    private final MotionPathSimplify i;

    public jdb(Context context, MotionPathSimplify motionPathSimplify, int i) {
        this.f38413a = context;
        this.i = motionPathSimplify;
        this.f38414b = i;
    }

    public void a() {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jdg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38427a.a();
                }
            });
            return;
        }
        if (!RunningRouteUtils.a(this.i.requestSportType()) || this.i.requestExtendDataMap().containsKey("hotPathId")) {
            LogUtil.a("Track_RouteAutoHelper", "not support auto punch sport type or manual track");
            return;
        }
        if (b()) {
            LogUtil.a("Track_RouteAutoHelper", "Auto dialog have shown");
            return;
        }
        if (!j()) {
            ReleaseLogUtil.c("Track_RouteAutoHelper", "Auto switch is update with cloud");
            f();
            return;
        }
        if (!this.e) {
            c();
        }
        if (e()) {
            LogUtil.a("Track_RouteAutoHelper", "this track not auto punch");
        } else {
            h();
        }
    }

    private void h() {
        String strC;
        gdr gdrVarD = this.f38415c.d();
        if (gdrVarD == null) {
            ReleaseLogUtil.d("Track_RouteAutoHelper", "HotPathOperationInfo is null");
            return;
        }
        gdw gdwVarI = gdrVarD.i();
        final int iA = gdrVarD.a();
        if (gdwVarI == null) {
            strC = "";
        } else {
            strC = gdwVarI.c();
        }
        final String str = strC;
        final String strH = gdrVarD.h();
        final long jD = gdrVarD.d();
        final String strJ = gdrVarD.j();
        HandlerExecutor.c(new Runnable() { // from class: jdd
            @Override // java.lang.Runnable
            public final void run() {
                this.f38421a.c(str, strH, jD, strJ, iA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(String str, String str2, long j, final String str3, final int i) {
        if (this.f38413a == null) {
            ReleaseLogUtil.d("Track_RouteAutoHelper", "context is null in init dialog");
            return;
        }
        final RouteAutoRemindDialog routeAutoRemindDialog = new RouteAutoRemindDialog(this.f38413a);
        routeAutoRemindDialog.b(str);
        routeAutoRemindDialog.a(str2);
        routeAutoRemindDialog.a(j);
        routeAutoRemindDialog.b(new View.OnClickListener() { // from class: jdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(str3, routeAutoRemindDialog, i, view);
            }
        });
        routeAutoRemindDialog.c(new View.OnClickListener() { // from class: jdj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38428a.c(routeAutoRemindDialog, view);
            }
        });
        routeAutoRemindDialog.show();
        f();
        a(0, routeAutoRemindDialog.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str, RouteAutoRemindDialog routeAutoRemindDialog, int i, View view) {
        if (qrs.ah(this.f38413a)) {
            LogUtil.a("Track_RouteAutoHelper", "Pad not support Popular Routes");
        } else {
            e(str, routeAutoRemindDialog, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(RouteAutoRemindDialog routeAutoRemindDialog, View view) {
        a(1, routeAutoRemindDialog.d());
        routeAutoRemindDialog.dismiss();
    }

    private void e(final String str, final RouteAutoRemindDialog routeAutoRemindDialog, final int i) {
        RunPopularRoutesUtil.e(this.f38413a, 4, new RunPopularRoutesUtil.DialogCallBack() { // from class: jdb.3
            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void goNext() {
                LogUtil.a("Track_RouteAutoHelper", "Start jump To ClockingRankActivity");
                if (i == 1) {
                    Intent intent = new Intent(jdb.this.f38413a, (Class<?>) ClockingRankActivity.class);
                    intent.putExtra("PATH_ID", str);
                    intent.putExtra("pathClass", i);
                    intent.putExtra("ENTRANCE_ACTIVITY", jdb.this.d());
                    iov.d(jdb.this.f38413a, intent);
                } else {
                    RunningRouteUtils.e(jdb.this.f38413a, str, jdb.this.d());
                }
                routeAutoRemindDialog.dismiss();
            }

            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void notGoNext() {
                LogUtil.a("Track_RouteAutoHelper", "Cancle start jump To ClockingRankActivity");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        if (this.f38414b == 2) {
            return RunningRouteConstants.BiFromActivity.FROM_RECORD_DIALOG.getIndex();
        }
        return RunningRouteConstants.BiFromActivity.FROM_RECORD_LIST_DIALOG.getIndex();
    }

    private void a(int i, boolean z) {
        HashMap map = new HashMap(5);
        map.put("click", 1);
        map.put("from", Integer.valueOf(this.f38414b));
        map.put("event", Integer.valueOf(i));
        map.put("sportPage", Integer.valueOf(this.i.requestSportType()));
        map.put("remindStatus", String.valueOf(z));
        lmf.d().c(BaseApplication.b(), "1040117", map, 0);
    }

    private boolean e() {
        gdq gdqVar = this.f38415c;
        return gdqVar == null || gdqVar.d() == null;
    }

    private boolean b() {
        return SharedPreferenceManager.b(Integer.toString(20002), "routeAutoDialogShown", false);
    }

    private void f() {
        SharedPreferenceManager.a(Integer.toString(20002), "routeAutoDialogShown", true);
    }

    private boolean j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        jdi.b(new e(countDownLatch));
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            ReleaseLogUtil.b("Track_RouteAutoHelper", "interrupted while waiting for requestData");
        }
        return this.d;
    }

    public gdq c() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        gdd.e eVar = new gdd.e();
        eVar.d(this.i.requestEndTime()).a(this.i.requestStartTime()).b(HiDateUtil.c((String) null));
        RunningRouteUtils.b(this.f38413a).b(eVar.b(), new a(countDownLatch));
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            ReleaseLogUtil.b("Track_RouteAutoHelper", "interrupted while waiting for requestData");
        }
        this.e = true;
        return this.f38415c;
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<jdb> f38420a;
        private final CountDownLatch e;

        private e(jdb jdbVar, CountDownLatch countDownLatch) {
            this.f38420a = new WeakReference<>(jdbVar);
            this.e = countDownLatch;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Track_RouteAutoHelper", "errorCode is ", Integer.valueOf(i), "objData is ", obj);
            jdb jdbVar = this.f38420a.get();
            if (jdbVar == null) {
                ReleaseLogUtil.b("Track_RouteAutoHelper", "RouteAutoHelper is null in InnerIBaseResponseCallback");
                this.e.countDown();
            } else {
                if (!(obj instanceof gdn)) {
                    this.e.countDown();
                    return;
                }
                gdn gdnVar = (gdn) obj;
                if (gdnVar.c() != null && gdnVar.a() != null) {
                    jdbVar.d = false;
                }
                this.e.countDown();
            }
        }
    }

    static class a implements ResultCallback<gdf> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<jdb> f38419c;
        private final CountDownLatch e;

        private a(jdb jdbVar, CountDownLatch countDownLatch) {
            this.f38419c = new WeakReference<>(jdbVar);
            this.e = countDownLatch;
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gdf gdfVar) {
            LogUtil.a("Track_RouteAutoHelper", "GetHotPathParticipateInfoRsp", gdfVar);
            jdb jdbVar = this.f38419c.get();
            if (jdbVar == null) {
                ReleaseLogUtil.b("Track_RouteAutoHelper", "RouteAutoHelper is null");
                this.e.countDown();
            } else {
                jdbVar.f38415c = gdfVar.b();
                this.e.countDown();
            }
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            ReleaseLogUtil.b("Track_RouteAutoHelper", "GetHotPathParticipateInfoRsp onFailure");
            this.e.countDown();
        }
    }
}
