package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.NotificationManagerCompat;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.huawei.featuregroup.R;
import com.huawei.featuregroup.constants.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.group.constants.GroupActivityBo;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class cua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f31300c;
    private String d;
    private long e;
    private DeviceInfo f;
    private iwh g;
    private String h;
    private int i;
    private qlh j;
    private boolean k;
    private jpg l;
    private BroadcastReceiver m;
    private boolean n;
    private npg o;
    private qla p;
    private npp q;
    private c r;
    private ActivityInfoListFactory s;
    private Notification t;
    private Timer u;
    private List<exf> w;

    public static cua a() {
        return e.d;
    }

    private cua() {
        this.i = 0;
        this.w = new CopyOnWriteArrayList();
        Context contextB = BaseApplication.b();
        this.s = new ActivityInfoListFactory(contextB);
        String string = Settings.Global.getString(contextB.getContentResolver(), "unified_display_device_name");
        this.f = new DeviceInfo(DeviceInfo.DeviceType.PHONE.getValue(), string == null ? PhoneInfoUtils.getTerminalMarketingName() : string, LoginInit.getInstance(contextB).getDeviceId());
        this.o = npg.d();
        this.f31299b = GRSManager.c(contextB).getUrl("activityUrl");
        npp nppVarC = npp.c();
        this.q = nppVarC;
        nppVarC.b();
        this.j = new qlh();
    }

    public void a(String str, String str2, String str3) {
        String str4 = this.f31298a;
        if (str4 != null && !TextUtils.equals(str, str4)) {
            d(false, this.f31298a, this.h, this.e, this.d);
        }
        this.f31298a = str;
        this.h = str2;
        this.d = str3;
    }

    public void d(boolean z, String str, String str2, long j, String str3) {
        if (TextUtils.equals(str, this.f31298a) && TextUtils.equals(str2, this.h) && this.n == z) {
            ReleaseLogUtil.e("R_GroupUtil", "locationSharing is already ", z ? "open" : "close");
            return;
        }
        ReleaseLogUtil.d("R_GroupUtil", "enableLocationSharing ", Boolean.valueOf(z), ", activityId:", str, " ,groupId:", str2);
        this.n = z;
        if (!z) {
            c((IBaseResponseCallback) null);
            m();
            f();
            return;
        }
        Timer timer = this.u;
        if (timer != null) {
            LogUtil.a("GroupUtil", "enableLocationSharing timer.cancel(),", timer);
            this.u.cancel();
        }
        String str4 = this.f31298a;
        if (str4 != null && !TextUtils.equals(str, str4)) {
            ReleaseLogUtil.d("R_GroupUtil", "last activityId", this.f31298a, "new activityId:", str);
            this.n = false;
            c((IBaseResponseCallback) null);
        }
        this.n = true;
        this.f31298a = str;
        this.h = str2;
        this.e = j;
        if (!TextUtils.isEmpty(str3)) {
            this.d = str3;
        }
        k();
        m();
        j();
    }

    public void j() {
        Context contextB = BaseApplication.b();
        if (!NotificationManagerCompat.from(contextB).areNotificationsEnabled()) {
            LogUtil.j("GroupUtil", "not support notification");
            return;
        }
        d(contextB);
        Notification.Builder builderC = lsb.d().c();
        Intent intent = new Intent("stopGroupSharing");
        intent.setPackage(BaseApplication.d());
        PendingIntent broadcast = PendingIntent.getBroadcast(BaseApplication.b(), 20250607, intent, 201326592);
        Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(g()));
        intent.setPackage(BaseApplication.d());
        builderC.setSmallIcon(CommonUtil.ap() ? R.mipmap.healthlogo_hw_app_beta : R.mipmap.healthlogo_hw_show_app).setContentTitle(this.d).setContentText(contextB.getResources().getString(R.string.IDS_group_minibar_content)).setContentIntent(PendingIntent.getActivity(BaseApplication.b(), 0, intent2, 67108864)).setOngoing(true).setDeleteIntent(broadcast);
        if (EnvironmentInfo.n()) {
            LogUtil.a("GroupUtil", "support live notification");
            Bundle bundle = new Bundle();
            bundle.putInt("notification.live.operation", 0);
            bundle.putString("notification.live.event", "Other");
            bundle.putInt("notification.live.type", 1);
            bundle.putBundle("notification.live.capsule", a(contextB));
            builderC.addExtras(bundle);
        }
        this.t = builderC.build();
        lsb.d().c(20250607, this.t);
    }

    private String g() {
        return "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.groups?h5pro=true&path=GroupTeamSharing&teamId=" + this.h + "&activityId=" + this.f31298a;
    }

    private static Bundle a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("notification.live.capsuleStatus", 1);
        bundle.putInt("notification.live.capsuleType", 1);
        bundle.putParcelable("notification.live.capsuleIcon", Icon.createWithResource(context, R.drawable.ic_group_online_light));
        bundle.putInt("notification.live.capsuleBgColor", 16475426);
        bundle.putString("notification.live.capsuleTitle", context.getResources().getString(R.string.IDS_group_location_sharing));
        return bundle;
    }

    private void m() {
        if (CollectionUtils.a(this.w)) {
            return;
        }
        Iterator<exf> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().onLocationSharingChanged(this.f31298a, this.h, this.n);
        }
    }

    public void e(exf exfVar) {
        this.w.add(exfVar);
    }

    public void a(exf exfVar) {
        this.w.remove(exfVar);
    }

    public float b() {
        this.q.a();
        float fE = this.q.e();
        LogUtil.a("GroupUtil", "getOrientation:", Float.valueOf(fE));
        return fE;
    }

    public void e(boolean z, String str, String str2) {
        ReleaseLogUtil.d("R_GroupUtil", "setMiniBarStatus isShow:", Boolean.valueOf(z), ",activityName:", str2);
        if (!TextUtils.isEmpty(str2)) {
            this.d = str2;
        }
        if (z) {
            this.q.d();
            Activity activityJ = BaseApplication.j();
            if (activityJ == null) {
                return;
            }
            if (this.p == null) {
                a(str, activityJ);
            }
            if (this.f31300c == null) {
                this.f31300c = new a(this.j);
            }
            this.j.d(this.p, this.f31300c);
            this.j.c();
            this.j.e();
            return;
        }
        if (this.p != null) {
            this.j.d();
            this.p = null;
        }
    }

    private void a(final String str, Activity activity) {
        qla qlaVar = new qla(activity, R.layout.group_floating_view);
        this.p = qlaVar;
        View viewC = qlaVar.c();
        final TextView textView = (TextView) viewC.findViewById(R.id.activityName);
        textView.setText(this.d);
        textView.post(new Runnable() { // from class: cui
            @Override // java.lang.Runnable
            public final void run() {
                cua.b(textView);
            }
        });
        ((LinearLayout) viewC.findViewById(R.id.close)).setOnClickListener(new View.OnClickListener() { // from class: cuf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        viewC.setOnClickListener(new View.OnClickListener() { // from class: cue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(str, view);
            }
        });
        this.p.c(LanguageUtil.ba(BaseApplication.b()) ? 85 : 83, (int) activity.getResources().getDimension(R.dimen.defaultPaddingStart), (int) activity.getResources().getDimension(R.dimen.health_common_100dp));
    }

    static /* synthetic */ void b(TextView textView) {
        if (textView.getLineCount() > 1) {
            textView.setTextSize(1, 12.0f);
        }
    }

    /* synthetic */ void e(View view) {
        if (qrs.r()) {
            return;
        }
        i();
    }

    /* synthetic */ void b(String str, View view) {
        if (qrs.r()) {
            return;
        }
        LogUtil.a("GroupUtil", "jumpToGroup:", str);
        AppRouter.e(Uri.parse(str)).b(BaseApplication.b());
        this.j.d();
    }

    public void i() {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            return;
        }
        new CustomTextAlertDialog.Builder(activityJ).a(R.string.IDS_group_exit_share_title).e((Boolean) true).b(R.string.IDS_group_exit_share_content).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: cuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("GroupUtil", "cancel exit sharing");
            }
        }).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: cug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31305c.b(view);
            }
        }).b().show();
    }

    /* synthetic */ void b(View view) {
        this.j.d();
        d(false, this.f31298a, this.h, this.e, this.d);
    }

    private void d(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("stopGroupSharing");
        c cVar = new c(this);
        this.r = cVar;
        BroadcastManagerUtil.d(context, cVar, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void k() {
        this.g = new iwh(BaseApplication.b(), 0);
        this.o.a(new ILoactionCallback() { // from class: cuj
            @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
            public final void dispatchLocationChanged(Location location) {
                this.f31306a.a(location);
            }
        }, "GroupUtil");
        l();
        if (this.m == null) {
            this.m = new d(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.plugin.account.logout");
            LocalBroadcastManager.getInstance().registerReceiver(this.m, intentFilter);
        }
    }

    private void l() {
        cun cunVar = new cun();
        cunVar.b(this.f31298a);
        cunVar.a(this.h);
        cunVar.d(this.f);
        LogUtil.a("GroupUtil", "setUserSyncDevice body:", ofe.c(this.s.getBody(cunVar)));
        CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) oet.d().e(cunVar.getUrl(), this.s.getHeaders(), ofe.c(this.s.getBody(cunVar)), CloudCommonReponse.class);
        if (cloudCommonReponse == null) {
            ReleaseLogUtil.e("R_GroupUtil", "setUserSyncDevice rsp is empty");
        } else {
            ReleaseLogUtil.d("R_GroupUtil", "setUserSyncDevice resCode:", cloudCommonReponse.getResultCode(), ", desc:", cloudCommonReponse.getResultDesc());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void c(IBaseResponseCallback iBaseResponseCallback) {
        if (this.l == null) {
            return;
        }
        cuo cuoVar = new cuo();
        cuoVar.b(this.f31298a);
        cuoVar.d(this.h);
        cuoVar.e(this.n ? 1 : 0);
        cuoVar.e(Collections.singletonList(this.f));
        cuoVar.c(this.l.f38787a);
        cuoVar.e(this.l.d);
        cuoVar.e(this.f);
        LogUtil.a("GroupUtil", "uploadUserLocShareInfo body:", ofe.c(this.s.getBody(cuoVar)));
        CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) oet.d().e(this.f31299b + "/activity/v2/group/uploadUserLocShareInfo", this.s.getHeaders(), ofe.c(this.s.getBody(cuoVar)), CloudCommonReponse.class);
        if (cloudCommonReponse == null) {
            ReleaseLogUtil.e("R_GroupUtil", "uploadUserLocShareInfo rsp is empty");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, "rsp is empty");
                return;
            }
            return;
        }
        ReleaseLogUtil.d("R_GroupUtil", "uploadUserLocShareInfo resCode:", cloudCommonReponse.getResultCode(), ", desc:", cloudCommonReponse.getResultDesc());
        d(cloudCommonReponse.getResultCode());
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(cloudCommonReponse.getResultCode().intValue(), cloudCommonReponse.getResultDesc());
        }
    }

    private void d(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 30036) {
                if (iIntValue == 30045) {
                    l();
                    return;
                } else if (iIntValue != 30048) {
                    ReleaseLogUtil.e("R_GroupUtil", "other error");
                    return;
                }
            }
            this.n = false;
            m();
            f();
            e(false, null, null);
            qpx.e(BaseApplication.b(), R.string.IDS_group_activity_ended);
        }
    }

    public void c(int i) {
        if (this.i == i) {
            ReleaseLogUtil.e("R_GroupUtil", "interval is same :", Integer.valueOf(i));
            return;
        }
        if (i <= 0) {
            ReleaseLogUtil.e("R_GroupUtil", "invalid interval:", Integer.valueOf(i));
            return;
        }
        Timer timer = this.u;
        if (timer != null) {
            timer.cancel();
        }
        this.i = i;
        Timer timer2 = new Timer("GroupUtil");
        this.u = timer2;
        timer2.schedule(new TimerTask() { // from class: cua.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                cua.this.c((IBaseResponseCallback) null);
            }
        }, 0L, 1000 * ((long) i));
    }

    public List<GroupActivityBo> b(int i) {
        ReleaseLogUtil.d("R_GroupUtil", "getMyGrpActivityList queryType:", Integer.valueOf(i));
        cum cumVar = new cum();
        cumVar.e(i);
        cus cusVar = (cus) oet.d().e(cumVar.getUrl(), this.s.getHeaders(), ofe.c(this.s.getBody(cumVar)), cus.class);
        return (cusVar == null || cusVar.getResultCode().intValue() != 0) ? new ArrayList() : cusVar.b();
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        jpg jpgVar = this.l;
        if (jpgVar == null) {
            this.o.a(new ILoactionCallback() { // from class: cul
                @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
                public final void dispatchLocationChanged(Location location) {
                    this.f31309c.d(iBaseResponseCallback, location);
                }
            }, "isSupportLocShare");
        } else {
            iBaseResponseCallback.a(0, Boolean.valueOf(b(jpgVar.d, this.l.f38787a)));
        }
    }

    /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, Location location) {
        this.o.c("isSupportLocShare");
        iBaseResponseCallback.a(0, Boolean.valueOf(b(location.getLatitude(), location.getLongitude())));
    }

    private boolean b(double d2, double d3) {
        try {
            List<Address> fromLocation = new Geocoder(BaseApplication.b(), Locale.ENGLISH).getFromLocation(d2, d3, 1);
            if (!CollectionUtils.a(fromLocation)) {
                Address address = fromLocation.get(0);
                LogUtil.a("GroupUtil", "address.getCountryCode:", address.getCountryCode(), ", address.getAdminArea:", address.getAdminArea());
                if ("CA".equals(address.getCountryCode()) && "Quebec".equals(address.getAdminArea())) {
                    return false;
                }
            }
        } catch (IOException e2) {
            LogUtil.a("GroupUtil", "getFromLocation IOException:", e2.getMessage());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ReleaseLogUtil.d("R_GroupUtil", CervicalMucusRecord.Appearance.CLEAR);
        Timer timer = this.u;
        if (timer != null) {
            timer.cancel();
        }
        this.o.c("GroupUtil");
        this.q.d();
        if (this.r != null) {
            BaseApplication.b().unregisterReceiver(this.r);
            this.r = null;
        }
        if (this.m != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.m);
            this.m = null;
        }
        if (this.t != null) {
            NotificationManagerCompat.from(BaseApplication.b()).cancel(20250607);
            this.t = null;
        }
        this.i = 0;
    }

    public boolean h() {
        return this.n;
    }

    public String e() {
        return this.f31298a;
    }

    public String d() {
        return this.h;
    }

    public jpg c() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        this.l = this.g.b(location);
        if (!this.k) {
            this.k = true;
            c((IBaseResponseCallback) null);
        }
        LogUtil.a("GroupUtil", "location:", Double.valueOf(this.l.d), ", ", Double.valueOf(this.l.f38787a));
    }

    static class e {
        private static final cua d = new cua();
    }

    static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<cua> f31302c;

        c(cua cuaVar) {
            this.f31302c = new WeakReference<>(cuaVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            cua cuaVar;
            if (!"stopGroupSharing".equals(intent.getAction()) || (cuaVar = this.f31302c.get()) == null) {
                return;
            }
            cuaVar.d(false, cuaVar.f31298a, cuaVar.h, cuaVar.e, cuaVar.d);
            cuaVar.e(false, null, null);
        }
    }

    static class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<cua> f31303a;

        public d(cua cuaVar) {
            this.f31303a = new WeakReference<>(cuaVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            cua cuaVar = this.f31303a.get();
            if (cuaVar != null && "com.huawei.plugin.account.logout".equals(intent.getAction())) {
                ReleaseLogUtil.d("R_GroupUtil", "logout");
                if (cuaVar.n) {
                    cuaVar.e(false, null, null);
                    cuaVar.f();
                }
            }
        }
    }

    static class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<qlh> f31301b;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        a(qlh qlhVar) {
            this.f31301b = new WeakReference<>(qlhVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            LogUtil.a("GroupUtil", "onActivityResumed ", activity.getComponentName().getClassName());
            qlh qlhVar = this.f31301b.get();
            if (qlhVar == null) {
                return;
            }
            if ("com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity".equals(activity.getComponentName().getClassName()) && iwy.a(BaseApplication.b()).k() != 264) {
                LogUtil.a("GroupUtil", "sport has started,not show floatingWindow");
            } else {
                qlhVar.b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            LogUtil.a("GroupUtil", "onActivityDestroyed ", activity.getComponentName().getClassName());
            qlh qlhVar = this.f31301b.get();
            if (qlhVar != null && "com.huawei.health.MainActivity".equals(activity.getComponentName().getClassName())) {
                qlhVar.d();
            }
        }
    }
}
