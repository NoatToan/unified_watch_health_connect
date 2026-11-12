package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import com.amap.api.maps.MapsInitializer;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.datatype.SkippingTargetMode;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.healthlinkage.api.HWhealthLinkageApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.physicalfitness.h5.PhysicalFitnessH5Callback;
import com.huawei.healthcloud.plugintrack.ui.activity.SportBaseActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.IBaseStatusCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ive extends pbx {
    private Context h;
    private IBaseStatusCallback k;
    private int l;
    private PhysicalFitnessH5Callback<jco> n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38078b = SecurityConstant.f5920a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38077a = Integer.toString(20002);
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ive f38079c = null;
    private int t = 0;
    private PluginSportTrackAdapter r = null;
    private ISportDataCallback s = null;
    private long q = 0;
    private ISportDataCallback p = null;
    private ArrayList j = new ArrayList();
    private boolean m = false;
    private boolean g = false;
    private boolean o = false;
    private long f = 0;
    private Handler i = new Handler(this, Looper.getMainLooper()) { // from class: ive.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            Context contextA = jbg.a();
            int i = message.what;
            if (i == 100) {
                TrackMainMapActivity.c(contextA);
                iwy.a(contextA).bw();
            } else {
                if (i != 101) {
                    return;
                }
                TrackMainMapActivity.e(contextA);
                iwy.a(contextA).br();
            }
        }
    };
    private iyd d = new iyd();

    static /* synthetic */ void d(View view) {
    }

    private boolean e(int i, float f) {
        if (i == 259 && f > 30.0f) {
            return true;
        }
        if ((i == 258 || i == 264) && f > 12.0f) {
            return true;
        }
        return i == 257 && f > 7.0f;
    }

    private boolean f(int i) {
        return i == 3 || i == 4;
    }

    private boolean i(int i) {
        return i == 282 || i == 260;
    }

    @Override // defpackage.pbx
    public void finish() {
    }

    private ive() {
    }

    public static ive c() {
        if (f38079c == null) {
            synchronized (e) {
                if (f38079c == null) {
                    f38079c = new ive();
                }
            }
        }
        if (f38079c.a() == null) {
            LogUtil.j("Track_PluginSportTrack", "PluginSportTrackAdapter == null ");
            af();
        }
        return f38079c;
    }

    private static void af() {
        try {
            Object objInvoke = Class.forName("com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl").getMethod("getInstance", Context.class).invoke(null, BaseApplication.getContext());
            if (!(objInvoke instanceof PluginSportTrackAdapter)) {
                LogUtil.e("Track_PluginSportTrack", "initAdapter fail: get Instance fail");
            } else {
                LogUtil.a("Track_PluginSportTrack", "initAdapter success:", objInvoke);
                f38079c.setAdapter((PluginSportTrackAdapter) objInvoke);
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
            LogUtil.e("Track_PluginSportTrack", "initAdapter failed", LogAnonymous.b(e2));
        }
    }

    public void d(IBaseStatusCallback iBaseStatusCallback) {
        LogUtil.a("Track_PluginSportTrack", "registerSportStatusListen enter");
        this.k = iBaseStatusCallback;
    }

    public void a(PhysicalFitnessH5Callback<jco> physicalFitnessH5Callback) {
        LogUtil.a("Track_PluginSportTrack", "registerPhysicalFitnessCallBack enter");
        this.n = physicalFitnessH5Callback;
    }

    public void a(int i, long j) {
        ReleaseLogUtil.d("Track_PluginSportTrack", "sendPhysicalFitnessResult sportType = ", Integer.valueOf(i), ", result = ", Long.valueOf(j));
        PhysicalFitnessH5Callback<jco> physicalFitnessH5Callback = this.n;
        if (physicalFitnessH5Callback == null) {
            ReleaseLogUtil.e("Track_PluginSportTrack", "sendPhysicalFitnessResult failed, mPhysicalFitnessCallBack is null");
            return;
        }
        if (j == -1) {
            physicalFitnessH5Callback.onFailure(-1, "data is error");
            return;
        }
        jco jcoVar = new jco();
        jcoVar.b(i);
        jcoVar.a(j);
        this.n.onSuccess(jcoVar);
    }

    public void p() {
        LogUtil.d("Track_PluginSportTrack", "mark MotionTrack status onOccupied");
        IBaseStatusCallback iBaseStatusCallback = this.k;
        if (iBaseStatusCallback != null) {
            iBaseStatusCallback.onOccupied();
        }
    }

    public void q() {
        LogUtil.d("Track_PluginSportTrack", "mark MotionTrack status onAvailable");
        IBaseStatusCallback iBaseStatusCallback = this.k;
        if (iBaseStatusCallback != null) {
            iBaseStatusCallback.onAvailable();
        }
    }

    @Override // defpackage.pbx
    public void init(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        Context applicationContext = context.getApplicationContext();
        this.h = applicationContext;
        jbg.c(applicationContext);
        if (getAdapter() instanceof PluginSportTrackAdapter) {
            this.r = (PluginSportTrackAdapter) getAdapter();
        }
    }

    @Override // defpackage.pbx
    public void setAdapter(PluginBaseAdapter pluginBaseAdapter) {
        if (pluginBaseAdapter == null) {
            return;
        }
        super.setAdapter(pluginBaseAdapter);
        if (pluginBaseAdapter instanceof PluginSportTrackAdapter) {
            this.r = (PluginSportTrackAdapter) pluginBaseAdapter;
        }
    }

    public PluginSportTrackAdapter a() {
        if (getAdapter() instanceof PluginSportTrackAdapter) {
            PluginSportTrackAdapter pluginSportTrackAdapter = (PluginSportTrackAdapter) getAdapter();
            this.r = pluginSportTrackAdapter;
            return pluginSportTrackAdapter;
        }
        return this.r;
    }

    public boolean k() {
        return this.m;
    }

    private void ag() {
        try {
            MapsInitializer.sdcardDir = new File(CommonUtil.f(this.h), "amap").getCanonicalPath();
        } catch (IOException e2) {
            LogUtil.e("Track_PluginSportTrack", "not ", LogAnonymous.b(e2));
        }
    }

    private void ab() {
        iwy iwyVarA = iwy.a(jbg.a());
        if (iwyVarA == null || iwyVarA.p() != 1) {
            return;
        }
        iwyVarA.l(false);
        izn.b(this.h, "motion_path2.txt");
        izn.b(this.h, "simplemotion.txt");
    }

    public int e(int i, int i2, int i3, float f, ISportDataCallback iSportDataCallback, Context context) {
        return c(i, b(i2, i3, f, -1), iSportDataCallback, context, (String) null);
    }

    public int e(int i, int i2, int i3, float f, String str, ISportDataCallback iSportDataCallback, Context context) {
        return c(i, b(i2, i3, f, -1), iSportDataCallback, context, str);
    }

    public int c(int i, Bundle bundle, ISportDataCallback iSportDataCallback, Context context, String str) {
        LogUtil.a("Track_PluginSportTrack", "is startTrack");
        int i2 = bundle.getInt("map_tracking_sport_type_sportting", 258);
        int i3 = bundle.getInt("sport_target_type_sportting", -1);
        float f = bundle.getFloat("sport_target_value_sportting", -1.0f);
        int i4 = bundle.getInt("trackFrom", -1);
        SharedPreferenceManager.e(this.h, String.valueOf(20002), "map_tracking_sport_type", String.valueOf(i2), new StorageParams());
        dev.c(context);
        aa();
        if (jaa.d(i2)) {
            return b(e(i, i2, i3, f, i4, bundle), context);
        }
        Context contextG = g(context);
        Integer numA = a(contextG, i2);
        int iIntValue = numA.intValue();
        if (iIntValue != 0) {
            LogUtil.j("Track_PluginSportTrack", "startTrack failed with error code:", numA);
            return iIntValue;
        }
        int i5 = i(contextG);
        if (i5 != 0) {
            return i5;
        }
        LogUtil.a("Track_PluginSportTrack", "is setTrackType");
        g(i);
        iwy iwyVarA = iwy.a(jbg.a());
        iwyVarA.ao();
        iwyVarA.d(i2);
        iwyVarA.ap();
        iwyVarA.b(bundle);
        Bundle bundleC = c(bundle, i2, i3, f, str);
        ReleaseLogUtil.d("Track_PluginSportTrack", "startTrack: track = ", Integer.valueOf(i), ", sportType = ", Integer.valueOf(i2), ", target = ", Integer.valueOf(i3), ", targetValue = ", Float.valueOf(f), ", trackFrom = ", Integer.valueOf(i4));
        if (bundleC == null) {
            return 3;
        }
        jem.b(i2, i3, false);
        b(i3, iSportDataCallback, i2);
        if (BaseApplication.getContext() == null) {
            LogUtil.j("Track_PluginSportTrack", "startTrack but isStartTrackSport is true");
            return 1;
        }
        if (i2 == 264) {
            iyg.a();
        }
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) TrackMainMapActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("sportdataparams", bundleC);
        iov.d(contextG, intent);
        e(0);
        a(i2);
        return 0;
    }

    public Bundle b(int i, int i2, float f, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("map_tracking_sport_type_sportting", i);
        bundle.putInt("sport_target_type_sportting", i2);
        bundle.putInt("origintarget", i2);
        bundle.putFloat("sport_target_value_sportting", f);
        bundle.putInt("trackFrom", i3);
        return bundle;
    }

    public Bundle b(int i, int i2, float f, int i3, int i4) {
        Bundle bundleB = b(i, i2, f, i3);
        bundleB.putInt("biTrackFrom", i4);
        return bundleB;
    }

    public void aa() {
        iwy iwyVarA = iwy.a(jbg.a());
        if (iwyVarA == null) {
            ReleaseLogUtil.e("Track_PluginSportTrack", "stopLastAutoTrack sportManager == null");
            return;
        }
        if (iwyVarA.p() == 1) {
            ReleaseLogUtil.d("Track_PluginSportTrack", "stopLastAutoTrack AUTO_TRACK");
            if (iwyVarA.getDistance() >= this.d.a()) {
                e(true);
            } else {
                ab();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int b(final SportLaunchParams sportLaunchParams, final Context context) {
        if (!HandlerExecutor.d()) {
            ReleaseLogUtil.e("Track_PluginSportTrack", "startNewTrack not in ui thread.");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ivf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38084c.b(sportLaunchParams, context);
                }
            });
            return 0;
        }
        Context contextG = g(context);
        int iB = b(contextG, sportLaunchParams.getSportType());
        if (iB != 0) {
            ReleaseLogUtil.e("Track_PluginSportTrack", "startNewTrack failed with error code:", Integer.valueOf(iB));
            return iB;
        }
        int i = i(contextG);
        if (i != 0) {
            ReleaseLogUtil.e("Track_PluginSportTrack", "startNewTrack failed with error code:", Integer.valueOf(i));
            return i;
        }
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) SportBaseActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParams);
        if (sportLaunchParams.getSportType() == 283) {
            boolean zEquals = "true".equals(buh.e("ROPE_DISPLAY_PROCESS"));
            int iIntValue = ((Integer) sportLaunchParams.getExtra("trackFrom", Integer.class, -1)).intValue();
            if (!zEquals && m() && iIntValue != 1) {
                c().e(283, sportLaunchParams.getSportTarget(), sportLaunchParams.getTargetValue());
            } else {
                hai.d(contextG, intent);
                SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
                if (sportDataOutputApi == null) {
                    LogUtil.j("Track_PluginSportTrack", "sportDataOutputApi == null");
                    return 1;
                }
                sportDataOutputApi.registerDeviceDataCallback(this.s);
            }
        } else if (!hai.c(sportLaunchParams.getSportType(), contextG, intent)) {
            iov.d(contextG, intent);
        }
        a(sportLaunchParams.getSportType());
        return 0;
    }

    private SportLaunchParams e(int i, int i2, int i3, float f, int i4, Bundle bundle) {
        SportLaunchParams sportLaunchParams = (SportLaunchParams) bundle.getParcelable("bundle_key_sport_launch_paras");
        if (sportLaunchParams == null) {
            sportLaunchParams = new SportLaunchParams();
        }
        sportLaunchParams.setSportType(i2).setSportTarget(i3).setTargetValue(f).setDataSource(ad()).addExtra("trackFrom", Integer.valueOf(i4));
        ReleaseLogUtil.d("Track_PluginSportTrack", "startTrack: track = ", Integer.valueOf(i), ", sportType = ", Integer.valueOf(i2), ", target = ", Integer.valueOf(i3), ", targetValue = ", Float.valueOf(f), ", trackFrom = ", Integer.valueOf(i4));
        return sportLaunchParams;
    }

    private int ad() {
        LogUtil.a("Track_PluginSportTrack", "isRopeDeviceConnected() ", Boolean.valueOf(m()));
        return m() ? 5 : 7;
    }

    private int b(Context context, int i) {
        int iC = c(context, i);
        if (iC != 0) {
            return iC;
        }
        int iD = d(context, i);
        if (iD != 0) {
            return iD;
        }
        return 0;
    }

    private int c(Context context, int i) {
        if (i != 283 || SportSupportUtil.i() || m()) {
            return 0;
        }
        qpx.e(context, context.getResources().getString(R.string.IDS_rope_connect_dialog_content));
        return 11;
    }

    private Integer a(Context context, int i) {
        int iD = d(context, i);
        if (iD != 0) {
            return Integer.valueOf(iD);
        }
        int iE = e(context, i);
        if (iE != 0) {
            return Integer.valueOf(iE);
        }
        return 0;
    }

    private void b(int i, ISportDataCallback iSportDataCallback, int i2) {
        if (f(i) && iSportDataCallback != null) {
            this.p = iSportDataCallback;
            ReleaseLogUtil.d("Track_PluginSportTrack", "register ISportDataCallback for suggestion ret = ", Integer.valueOf(iwy.a(jbg.a()).e(this.p, 1L)));
        }
        if (this.s == null || i(i2)) {
            return;
        }
        if (deo.c()) {
            deo.c(new IBaseResponseCallback() { // from class: ivk
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i3, Object obj) {
                    this.f38091b.a(i3, obj);
                }
            });
        } else {
            ac();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() == 0 || b(num.intValue())) {
                ac();
                return;
            }
        }
        ReleaseLogUtil.e("Track_PluginSportTrack", "addSportDataCallback getDeviceSportStatus errorCode:", Integer.valueOf(i), " objData:", obj);
    }

    private boolean b(int i) {
        boolean zAl = iwy.a(jbg.a()).al();
        ReleaseLogUtil.d("Track_PluginSportTrack", "isCrashRecovery isCrash = ", Boolean.valueOf(zAl), " deviceStatus = ", Integer.valueOf(i));
        return i == 1 && zAl;
    }

    private void ac() {
        int iO = iwy.a(jbg.a()).o();
        ReleaseLogUtil.d("Track_PluginSportTrack", "addLinkSportData(): sport status:", Integer.valueOf(iO), " mWearLinkSportDataCallback:", this.s, " mWearLinkSportDataReportInterval:", Long.valueOf(this.q));
        if (iO == 0 || iO == 6) {
            int iE = iwy.a(jbg.a()).e(this.s, this.q);
            ReleaseLogUtil.d("Track_PluginSportTrack", "addLinkSportData(): sport status:", Integer.valueOf(iO), " mWearLinkSportDataCallback:", this.s, " mWearLinkSportDataReportInterval:", Long.valueOf(this.q), " ret:", Integer.valueOf(iE));
        }
    }

    private Bundle c(Bundle bundle, int i, int i2, float f, String str) {
        iwy iwyVarA = iwy.a(jbg.a());
        bundle.putBoolean("indoor_Running_Info", iwyVarA.d());
        d(i, i2, f);
        String string = Integer.toString(20002);
        if (f(i2) && iwyVarA.al()) {
            try {
                ArrayList arrayList = (ArrayList) izn.d(SharedPreferenceManager.e(this.h, string, "sport_plan_target_new"), new TypeToken<ArrayList<gze>>(this) { // from class: com.huawei.healthcloud.plugintrack.PluginSportTrack$2
                });
                if (arrayList != null && arrayList.size() > 0) {
                    ReleaseLogUtil.d("Track_PluginSportTrack", "recover TARGET_PLAN on error sp");
                    iwyVarA.b(arrayList);
                } else {
                    i2 = -1;
                    bundle.putInt("origintarget", -1);
                    bundle.putFloat("sport_target_value_sportting", -1.0f);
                    bundle.putInt("sport_target_type_sportting", -1);
                }
            } catch (NumberFormatException unused) {
                SharedPreferenceManager.b(this.h, string, "sport_plan_target_new");
                LogUtil.e("Track_PluginSportTrack", "NumberFormatException : get SegmentedTarget data error , delete sp!");
                return null;
            }
        }
        if (f(i2) && iwyVarA.ax() && iwyVarA.n() != null && iwyVarA.n().size() > 0) {
            gze gzeVar = iwyVarA.n().get(0);
            bundle.putInt("sport_target_type_sportting", gzeVar.i());
            bundle.putFloat("sport_target_value_sportting", gzeVar.h());
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("PATH_ID", str);
        }
        return bundle;
    }

    private void d(int i, int i2, float f) {
        StorageParams storageParams = new StorageParams();
        Context context = this.h;
        String str = f38077a;
        SharedPreferenceManager.e(context, str, "sporting_sport_type_for_restart", Integer.toString(i), storageParams);
        SharedPreferenceManager.e(this.h, str, "sporting_target_type_for_restart", Integer.toString(i2), storageParams);
        SharedPreferenceManager.e(this.h, str, "sporting_target_value_for_restart", Float.toString(f), storageParams);
    }

    public void d() {
        Context context = this.h;
        String str = f38077a;
        SharedPreferenceManager.b(context, str, "sporting_sport_type_for_restart");
        SharedPreferenceManager.b(this.h, str, "sporting_target_type_for_restart");
        SharedPreferenceManager.b(this.h, str, "sporting_target_value_for_restart");
        SharedPreferenceManager.b(this.h, str, "sport_plan_target_new");
    }

    private int i(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("IndoorEquipServiceRunning" + CommonUtil.a(this.h), 0);
        if (sharedPreferences != null) {
            boolean z = sharedPreferences.getBoolean("IsIndoorEquipServiceRunning" + CommonUtil.a(this.h), false);
            long j = sharedPreferences.getLong("elapsedRealtime", 0L);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            LogUtil.a("Track_PluginSportTrack", "isIndoorEquipSerRunning ", Boolean.valueOf(z), "flagTime ", Long.valueOf(j), "timeDiff ", Long.valueOf(jElapsedRealtime));
            if (z && jElapsedRealtime < 2000 && jElapsedRealtime > 0) {
                Intent intent = new Intent("com.huawei.health.START_INDOOR_EQUIP_MODULE");
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent, f38078b);
                return 9;
            }
        }
        iwy iwyVarA = iwy.a(jbg.a());
        if (iwyVarA.ay() && iwyVarA.p() != 1) {
            ReleaseLogUtil.e("Track_PluginSportTrack", "startTrack but isStartTrackSport is true");
            return 1;
        }
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        if (sportDataOutputApi == null) {
            LogUtil.j("Track_PluginSportTrack", "sportDataOutputApi == null");
            return 1;
        }
        if (sportDataOutputApi.getStatus() == 0 || sportDataOutputApi.getStatus() == 3) {
            return 0;
        }
        ReleaseLogUtil.e("Track_PluginSportTrack", "startTrack but sport status is not idle");
        return 1;
    }

    private Context g(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        ReleaseLogUtil.e("Track_PluginSportTrack", "startTrack only take Activity as context");
        return BaseApplication.getActivity() != null ? BaseApplication.getActivity() : context;
    }

    private int d(Context context, int i) {
        PermissionUtil.PermissionType permissionTypeD = d(i);
        PermissionUtil.PermissionResult permissionResultE = PermissionUtil.e(context, permissionTypeD);
        if (permissionResultE == PermissionUtil.PermissionResult.FOREVER_DENIED) {
            return dep.c(context, permissionTypeD, permissionResultE, false);
        }
        return dep.c(context, permissionTypeD, permissionResultE);
    }

    private int e(Context context, int i) {
        if (context == null) {
            LogUtil.j("Track_PluginSportTrack", "showDialogContext is null");
            return 5;
        }
        jaa.d(context);
        if (!jaa.o() || jaa.b(context) || i == 264) {
            return 0;
        }
        ReleaseLogUtil.d("Track_PluginSportTrack", "not have GooglePlayServices!");
        if (!(context instanceof Activity)) {
            LogUtil.j("Track_PluginSportTrack", "showDialogContext is not activity context");
            return 6;
        }
        try {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
            builder.a(context.getString(R.string.IDS_hwh_motiontrack_show_map_type_no_gms)).c(R.string.IDS_motiontrack_common_ui_dialog_confirm, new View.OnClickListener(this) { // from class: ive.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            builder.c().show();
            LogUtil.j("Track_PluginSportTrack", "showDialogContext has no google service");
            return 2;
        } catch (WindowManager.BadTokenException unused) {
            LogUtil.j("Track_PluginSportTrack", "showDialogContext cant be used to show dialog");
            return 6;
        }
    }

    private void a(int i) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(i));
        lmf.d().c(this.h, AnalyticsValue.MOTION_TRACK_1040027.value(), map, 0);
        int iA = izn.a(i);
        if (iA != 0) {
            OpAnalyticsUtil.getInstance().setEventWithActionType(iA, OperationKey.HEALTH_APP_RUN_START_2050005.value());
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("actiontype", String.valueOf(iA));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_PVUV_85050001.value(), linkedHashMap);
        }
    }

    public int v() {
        iwy iwyVarA = iwy.a(jbg.a());
        if (ae()) {
            return 9;
        }
        int iO = iwyVarA.o();
        if (iO == 1) {
            ReleaseLogUtil.d("Track_PluginSportTrack", "Pause Track by outter operation");
            iwyVarA.b(false, 0);
            return 0;
        }
        ReleaseLogUtil.e("Track_PluginSportTrack", "You can pauseTrack just when sporting, currentStatus = ", Integer.valueOf(iO));
        return 1;
    }

    public int y() {
        iwy iwyVarA = iwy.a(jbg.a());
        if (ae()) {
            return 9;
        }
        int iO = iwyVarA.o();
        if (iO == 2) {
            ReleaseLogUtil.d("Track_PluginSportTrack", "Resume Track by outer operation");
            iwyVarA.bp();
            return 0;
        }
        ReleaseLogUtil.e("Track_PluginSportTrack", "You can resumeTrack just when pause, currentStatus = ", Integer.valueOf(iO));
        return 1;
    }

    public void w() {
        this.m = true;
        ag();
    }

    private boolean ae() {
        Context context = this.h;
        if (context == null) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("IndoorEquipServiceRunning" + CommonUtil.a(this.h), 0);
        if (sharedPreferences != null) {
            boolean z = sharedPreferences.getBoolean("IsIndoorEquipServiceRunning" + CommonUtil.a(this.h), false);
            long j = sharedPreferences.getLong("elapsedRealtime", 0L);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            LogUtil.a("Track_PluginSportTrack", "isIndoorEquipSerRunning", Boolean.valueOf(z), "flagTime ", Long.valueOf(j), "timeDiff ", Long.valueOf(jElapsedRealtime));
            if (z && jElapsedRealtime < 2000 && jElapsedRealtime > 0) {
                Intent intent = new Intent("com.huawei.health.START_INDOOR_EQUIP_MODULE");
                intent.setPackage(this.h.getPackageName());
                this.h.sendBroadcast(intent, f38078b);
                return true;
            }
        }
        return false;
    }

    public void u() {
        iwy iwyVarA = iwy.a(jbg.a());
        iwyVarA.e(false);
        iwyVarA.i(false);
        if (iwyVarA.j() >= 100.0f) {
            iwyVarA.bi();
        } else {
            iwyVarA.bh();
        }
    }

    public int a(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        PluginSportTrackAdapter pluginSportTrackAdapter = this.r;
        if (pluginSportTrackAdapter != null) {
            pluginSportTrackAdapter.saveTrackData(motionPathSimplify, motionPath);
            return 0;
        }
        LogUtil.j("Track_PluginSportTrack", "mTrackAdapter == NULL");
        return 5;
    }

    public void b(List<gze> list) {
        iwy.a(jbg.a()).b(list);
    }

    public void a(int i, boolean z, boolean z2, Bundle bundle) {
        LogUtil.a("Track_PluginSportTrack", "PluginSportTrack startTrack ", Boolean.valueOf(z2));
        if (this.h == null) {
            ReleaseLogUtil.e("Track_PluginSportTrack", "startBackgroundTrack mContext is null");
            return;
        }
        if (PermissionUtil.b(this.h, PermissionUtil.c(PermissionUtil.PermissionType.LOCATION))) {
            c(i, z, z2, bundle);
        }
    }

    private void c(int i, boolean z, boolean z2, Bundle bundle) {
        if (z2 && this.d == null) {
            ReleaseLogUtil.e("Track_PluginSportTrack", "auto track config not avaliable");
            return;
        }
        if (iwy.a(jbg.a()).ay() || this.r == null) {
            ReleaseLogUtil.d("Track_PluginSportTrack", "Tracking Running, exit");
            return;
        }
        if (z2 && jaq.e()) {
            ReleaseLogUtil.d("Track_PluginSportTrack", "isTrackCrash exit");
        } else if (!z2) {
            d(i, z, z2, bundle);
        } else {
            this.f = System.currentTimeMillis();
            e(i, z, z2, bundle, 3);
        }
    }

    private void e(final int i, final boolean z, final boolean z2, final Bundle bundle, final int i2) {
        boolean zC = deo.c();
        LogUtil.a("Track_PluginSportTrack", "startAutoTrackForGranted state:", Integer.valueOf(i), " isClassOne:", Boolean.valueOf(z), " isAutoTrack:", Boolean.valueOf(z2), " repeatNum:", Integer.valueOf(i2));
        if (d(zC) && i2 > 0) {
            HandlerExecutor.c(new Runnable() { // from class: ivh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38087a.d(i, z, z2, bundle, i2);
                }
            }, 2000L);
            return;
        }
        if (System.currentTimeMillis() - this.f > 10000) {
            ReleaseLogUtil.d("Track_PluginSportTrack", " startAutoTrack has delay! return ");
        } else if (deo.c()) {
            deo.c(new d(this, i, z, true, bundle));
        } else {
            d(i, z, z2, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, boolean z, boolean z2, Bundle bundle, int i2) {
        e(i, z, z2, bundle, i2 - 1);
    }

    private boolean d(boolean z) {
        boolean zIsBindPhoneService = ecu.d().isBindPhoneService();
        HWhealthLinkageApi hWhealthLinkageApi = (HWhealthLinkageApi) Services.d("HWhealthLinkage", HWhealthLinkageApi.class);
        boolean z2 = hWhealthLinkageApi != null && hWhealthLinkageApi.isMediatorInit();
        LogUtil.a("Track_PluginSportTrack", "isNeedWaitForInitWork: isNeedCheckSportStatus:", Boolean.valueOf(z), " isBindPhoneService:", Boolean.valueOf(zIsBindPhoneService), " isLinkageInit:", Boolean.valueOf(z2));
        return !(z || zIsBindPhoneService) || (z && !z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, boolean z, boolean z2, Bundle bundle) {
        jaf.c(this.h, "auto_detect_motion_path.txt");
        iwy iwyVarA = iwy.a(jbg.a());
        if (z2) {
            this.d.a(this.h);
            iwyVarA.ao();
            iwyVarA.a(i, this.d, z);
            ah();
            iwyVarA.a(bundle);
        } else {
            iwyVarA.f(bundle.getInt("keySportRecordIsToSave", 1));
            iwyVarA.b(i);
        }
        if (this.s != null && !i(iwyVarA.k())) {
            iwy.a(jbg.a()).e(this.s, this.q);
        }
        iwyVarA.ap();
        iwyVarA.bq();
        if (this.i != null) {
            if (iwyVarA.w()) {
                this.i.sendEmptyMessage(100);
            } else {
                this.i.sendEmptyMessageDelayed(100, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            }
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f38080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f38081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<ive> f38082c;
        int d;
        Bundle e;

        d(ive iveVar, int i, boolean z, boolean z2, Bundle bundle) {
            this.f38082c = new WeakReference<>(iveVar);
            this.d = i;
            this.f38080a = z;
            this.f38081b = z2;
            this.e = bundle;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Track_PluginSportTrack", "checkDeviceSportStatus: onResponse ", obj);
            ive iveVar = this.f38082c.get();
            if (iveVar != null) {
                if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
                    ReleaseLogUtil.d("Track_PluginSportTrack", "not running");
                    iveVar.d(this.d, this.f38080a, this.f38081b, this.e);
                    return;
                } else {
                    ReleaseLogUtil.d("Track_PluginSportTrack", "device is running, no need to start auto track.");
                    return;
                }
            }
            ReleaseLogUtil.e("Track_PluginSportTrack", "activity or handler is null");
        }
    }

    public static void e(boolean z) {
        iwy iwyVarA;
        if (jbg.a() == null) {
            if (BaseApplication.getContext() != null) {
                iwyVarA = iwy.a(BaseApplication.getContext());
            } else {
                ReleaseLogUtil.e("Track_PluginSportTrack", "stopBackgroundTrack HealthApplication.getContext() is null");
                return;
            }
        } else {
            iwyVarA = iwy.a(jbg.a());
        }
        if (iwyVarA != null) {
            ReleaseLogUtil.d("Track_PluginSportTrack", "isStartTrackSport = ", Boolean.valueOf(iwyVarA.ay()), ", acquireTrackType =", Integer.valueOf(iwyVarA.p()));
            if (iwyVarA.ay()) {
                if (iwyVarA.p() == 1 || !z) {
                    LogUtil.a("Track_PluginSportTrack", "stopBackgroundTrack close track");
                    iwyVarA.bn();
                    return;
                }
                return;
            }
            return;
        }
        LogUtil.j("Track_PluginSportTrack", "stopBackgroundTrack sportManager is null");
    }

    public void b(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null || motionPath == null) {
            ReleaseLogUtil.a("Track_PluginSportTrack", "showTrackMap simplifyData or motionData is null!");
            return;
        }
        LogUtil.d("Track_PluginSportTrack", "show track map = ", motionPathSimplify);
        Bundle bundle = new Bundle();
        bundle.putSerializable("simplifyDatakey", motionPathSimplify);
        bundle.putSerializable("motionPath", motionPath);
        bundle.putString("contentpath", null);
        Intent intent = new Intent(jbg.a(), (Class<?>) TrackDetailActivity.class);
        intent.putExtras(bundle);
        intent.addFlags(268435456);
        iov.d(jbg.a(), intent);
    }

    public void d(String str, MotionPathSimplify motionPathSimplify, boolean z) {
        b(c(str, motionPathSimplify, Collections.EMPTY_LIST, z, Boolean.FALSE.booleanValue()), motionPathSimplify);
    }

    public void d(String str, MotionPathSimplify motionPathSimplify, boolean z, boolean z2) {
        b(c(str, motionPathSimplify, Collections.EMPTY_LIST, z, z2), motionPathSimplify);
    }

    public void b(String str, MotionPathSimplify motionPathSimplify, List<jbv> list) {
        b(c(str, motionPathSimplify, list, Boolean.FALSE.booleanValue(), Boolean.FALSE.booleanValue()), motionPathSimplify);
    }

    public void b(String str, MotionPathSimplify motionPathSimplify) {
        d(str, motionPathSimplify, false);
    }

    public void b(Bundle bundle, MotionPathSimplify motionPathSimplify) {
        if (bundle == null) {
            LogUtil.j("Track_PluginSportTrack", "showTrackMap get bundle null");
            return;
        }
        int iRequestSportType = motionPathSimplify.requestSportType();
        if (iRequestSportType != 220) {
            if (iRequestSportType != 291) {
                switch (iRequestSportType) {
                    case 286:
                        break;
                    case 287:
                        break;
                    case 288:
                        bundle.putString(BleConstants.KEY_PATH, "#/breathholdingtraining");
                        c(bundle, iRequestSportType);
                        break;
                    case 289:
                        bundle.putString(BleConstants.KEY_PATH, "#/closedbreathtest");
                        c(bundle, iRequestSportType);
                        break;
                    default:
                        if (iRequestSportType != 264 && motionPathSimplify.hasTrackPoint() && jaa.f()) {
                            ReleaseLogUtil.e("Track_PluginSportTrack", "Show Gms install dialog");
                            am();
                        } else {
                            c(bundle);
                        }
                        break;
                }
                return;
            }
            c(bundle, iRequestSportType);
            return;
        }
        d(iRequestSportType, motionPathSimplify.requestStartTime(), motionPathSimplify.requestEndTime());
    }

    public Bundle c(String str, MotionPathSimplify motionPathSimplify, List<jbv> list, boolean z, boolean z2) {
        if (str == null) {
            ReleaseLogUtil.a("Track_PluginSportTrack", "showTrackMap contentpath is null!");
            return null;
        }
        if (str.length() == 0) {
            ReleaseLogUtil.a("Track_PluginSportTrack", "showTrackMap contentpath is invalid!");
            return null;
        }
        if (motionPathSimplify == null) {
            ReleaseLogUtil.a("Track_PluginSportTrack", "showTrackMap simplifyData is null!");
            return null;
        }
        if (motionPathSimplify.requestSportType() != 512 || !njy.e(list)) {
            LogUtil.d("Track_PluginSportTrack", "show track content = ", str, "simplifyData = ", motionPathSimplify, "subTrackDetail = ", list);
            if (jem.f()) {
                jed.e().c(motionPathSimplify);
                jem.e();
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("simplifyDatakey", motionPathSimplify);
            bundle.putString("contentpath", str);
            if (motionPathSimplify.requestSportType() == 512) {
                bundle.putSerializable("subTrackDetail", (Serializable) list);
            }
            bundle.putBoolean("isAfterSport", z);
            bundle.putBoolean("isNotNeedDeleteFile", z2);
            return bundle;
        }
        ReleaseLogUtil.a("Track_PluginSportTrack", "showTrackMap subTrackDetail is null or empty for triathlon!");
        return null;
    }

    public void c(Bundle bundle) {
        if (jbg.a() != null) {
            Intent intent = new Intent(jbg.a(), (Class<?>) TrackDetailActivity.class);
            intent.putExtras(bundle);
            intent.addFlags(268435456);
            iov.d(jbg.a(), intent);
        }
    }

    public void x() {
        Context context = this.h;
        if (context != null) {
            d("motion_path2.txt", jac.e(context), true);
        }
    }

    public iyd d(Context context) {
        iyd iydVar = this.d;
        if (iydVar != null) {
            iydVar.a(context);
        }
        return this.d;
    }

    private void c(Bundle bundle, int i) {
        Gson gson = new Gson();
        String string = bundle.getString("contentpath");
        MotionPathSimplify motionPathSimplify = (MotionPathSimplify) bundle.getSerializable("simplifyDatakey");
        int iRequestDeviceType = motionPathSimplify.requestDeviceType();
        Context context = this.h;
        String strB = een.b(iRequestDeviceType, context, context.getPackageName(), motionPathSimplify.requestProductId(), motionPathSimplify.requestSubProductId());
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeArg("simplycontent", gson.toJson(bundle.getSerializable("simplifyDatakey")));
        builder.addCustomizeArg("contentPath", string);
        builder.addCustomizeArg("deviceName", strB);
        builder.addCustomizeArg("isShowImperialUnit", String.valueOf(UnitUtil.f()));
        builder.addCustomizeArg("isFahrenheit", String.valueOf(!UnitUtil.a()));
        LogUtil.a("Track_PluginSportTrack", "deviceName:", strB);
        builder.showStatusBar();
        builder.setImmerse();
        builder.addCustomizeJsModule("DivingJsApi", ivx.class);
        if (!TextUtils.isEmpty(bundle.getString(BleConstants.KEY_PATH))) {
            builder.addPath(bundle.getString(BleConstants.KEY_PATH));
        }
        ddv.b().loadH5ProApp(this.h, "com.huawei.health.h5.dive", builder);
    }

    public void d(int i, long j, long j2) {
        String str = "?startTime=" + j + "&endTime=" + j2;
        LogUtil.a("Track_PluginSportTrack", "jumpToGolfCourseTrackDetail(): startAndEndTime is ", str);
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.setImmerse();
        builder.showStatusBar();
        builder.addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddv.b().getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL));
        builder.setStatusBarTextBlack(true);
        if (i == 220) {
            builder.addPath("#/golfPractice" + str);
        } else if (i == 286) {
            builder.addPath("#/exedetails" + str);
        } else {
            LogUtil.j("Track_PluginSportTrack", "jumpToGolfCourseTrackDetail(): sportType error.");
            return;
        }
        builder.setForceDarkMode(1);
        ddv.b().loadH5ProApp(this.h, "com.huawei.health.h5.golf", builder);
    }

    public boolean a(Context context) {
        int i;
        if (context == null) {
            LogUtil.j("Track_PluginSportTrack", "context is null");
            return false;
        }
        boolean zE = jaq.e();
        LogUtil.a("Track_PluginSportTrack", "isCrash == ", Boolean.valueOf(zE));
        if (!zE) {
            return false;
        }
        File file = new File(context.getFilesDir(), "motion_path2.txt");
        boolean zD = lsg.d(this.h, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
        String strE = SharedPreferenceManager.e(this.h, Integer.toString(20002), "sporting_sport_type_for_restart");
        if (TextUtils.isEmpty(strE)) {
            i = 258;
        } else {
            try {
                i = Integer.parseInt(strE);
            } catch (NumberFormatException e2) {
                LogUtil.e("Track_PluginSportTrack", "NumberFormatException exception = ", e2.getMessage());
                return false;
            }
        }
        if (file.exists() && System.currentTimeMillis() - file.lastModified() >= 1800000) {
            u();
            return false;
        }
        if (i == 264) {
            return true;
        }
        return zD;
    }

    public void b(Context context) {
        iwy iwyVarA = iwy.a(context);
        if (iwyVarA == null || iwyVarA.p() != 1) {
            return;
        }
        iwyVarA.bj();
    }

    public int e(ISportDataCallback iSportDataCallback, long j) {
        LogUtil.a("Track_PluginSportTrack", "registerSportDataCallback, callback = ", iSportDataCallback, " interval = ", Long.valueOf(j));
        this.s = iSportDataCallback;
        this.q = j;
        return 0;
    }

    public ISportDataCallback f() {
        return this.s;
    }

    public boolean n() {
        if (((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).isDeviceConnected("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c")) {
            return true;
        }
        return jem.j() && jem.o();
    }

    public boolean t() {
        return jbg.a() != null && iwy.a(jbg.a()).p() == 1;
    }

    private void ah() {
        this.j.add(Long.valueOf(System.currentTimeMillis()));
    }

    private void g(int i) {
        iwy iwyVarA = iwy.a(jbg.a());
        ReleaseLogUtil.d("Track_PluginSportTrack", "setTrackType", Integer.valueOf(iwyVarA.p()));
        iwyVarA.c(i);
    }

    public int b(ISportDataCallback iSportDataCallback) {
        iwy iwyVarA = iwy.a(jbg.a());
        if (ae()) {
            return 9;
        }
        if (iwyVarA.o() == 0 || iwyVarA.o() == 3) {
            ReleaseLogUtil.e("Track_PluginSportTrack", "Stop Track by outer operation and sport is not running, failed");
            return 1;
        }
        if (iwyVarA.o() == 1) {
            ReleaseLogUtil.d("Track_PluginSportTrack", "Stop Track by outer operation and SPORTS_STATUS_SPORTING");
            iwyVarA.b(true, this.t);
            this.i.sendEmptyMessageDelayed(101, 50L);
            return 0;
        }
        if (iwyVarA.o() != 2) {
            return 0;
        }
        ReleaseLogUtil.d("Track_PluginSportTrack", "Stop Track by outer operation and SPORTS_STATUS_PAUSE");
        TrackMainMapActivity.e(jbg.a());
        iwyVarA.br();
        return 0;
    }

    public void e(boolean z, boolean z2) {
        LogUtil.a("Track_PluginSportTrack", "notifyDeviceStatus isBinded = ", Boolean.valueOf(z), ". isConnected = ", Boolean.valueOf(z2));
        this.g = z;
        this.o = z2;
    }

    public boolean i() {
        return this.g;
    }

    public int s() {
        iwy iwyVarA = iwy.a(jbg.a());
        if (!iwyVarA.ay()) {
            LogUtil.j("Track_PluginSportTrack", "launchTrackSportStateBroadcast: sport is not started, failed");
            return 1;
        }
        float fG = iwyVarA.g();
        long sportDuration = iwyVarA.getSportDuration();
        int iE = iwyVarA.e();
        if (!iwyVarA.am() && c().b() != 2) {
            return 0;
        }
        LogUtil.a("Track_PluginSportTrack", "launchTrackSportStateBroadcast distance = ", Float.valueOf(fG), " duration = ", Long.valueOf(sportDuration), " heartRate = ", "***");
        Bundle bundle = new Bundle();
        bundle.putString("voiceType", "sportStateWithoutCalorie");
        bundle.putInt(BleConstants.SPORT_TYPE, iwyVarA.k());
        bundle.putFloat("distance", fG);
        bundle.putLong("duration", sportDuration);
        bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, iE);
        jau.c().d(new jbc(11, bundle));
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    public int e(String str) {
        byte b2;
        LogUtil.a("Track_PluginSportTrack", "launchTrackSportStateBroadcast voiceType enter");
        iwy iwyVarA = iwy.a(jbg.a());
        if (!iwyVarA.ay()) {
            LogUtil.j("Track_PluginSportTrack", "launchTrackSportStateBroadcast: sport is not started, failed");
            return 1;
        }
        int iK = iwyVarA.k();
        Bundle bundle = new Bundle();
        bundle.putString("voiceType", str);
        bundle.putInt(BleConstants.SPORT_TYPE, iK);
        str.hashCode();
        switch (str) {
            case "duration":
                b2 = 0;
                break;
            case "sportState":
                b2 = 1;
                break;
            case "pace":
                b2 = 2;
                break;
            case "speed":
                b2 = 3;
                break;
            case "heartRate":
                b2 = 4;
                break;
            case "distance":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            b(str, iwyVarA, bundle);
        } else if (b2 == 1) {
            a(iwyVarA, bundle);
        } else if (b2 != 2) {
            if (b2 == 3) {
                float fY = iwyVarA.y();
                bundle.putFloat(str, fY);
                bundle.putBoolean("paceTip", e(iK, fY));
            } else if (b2 == 4) {
                bundle.putInt(str, iwyVarA.e());
            } else if (b2 == 5) {
                c(str, iwyVarA, bundle);
            } else {
                LogUtil.j("Track_PluginSportTrack", "launchTrackSportStateBroadcast(String),voiceType is wrong");
                return 1;
            }
        } else if (c(str, iwyVarA, iK, bundle)) {
            return 1;
        }
        jbc jbcVar = new jbc(11, bundle);
        if (iwyVarA.am() || c().b() == 2) {
            jau.c().d(jbcVar);
        }
        c(0);
        return 0;
    }

    public void b(int i, int i2) {
        String str;
        LogUtil.a("Track_PluginSportTrack", "launchIndoorEquipSportStateBroadcast");
        if (i == 17) {
            str = "stepRateTips";
        } else if (i == 24) {
            str = "commonNormal";
        } else if (i != 29) {
            switch (i) {
                case 8:
                    str = "connectSuccess";
                    break;
                case 9:
                    str = "startRun";
                    break;
                case 10:
                    str = "commonAbnormal";
                    break;
                case 11:
                    str = "impactTips";
                    break;
                default:
                    LogUtil.j("Track_PluginSportTrack", "launchIndoorEquipSportStateBroadcast(type, event),type is wrong");
                    str = "invalid";
                    break;
            }
        } else {
            str = "startRun_others";
        }
        Bundle bundle = new Bundle();
        bundle.putString("voiceType", str);
        bundle.putInt("treadmillEvent", i2);
        jau.c().d(new jbc(11, bundle));
    }

    public void c(int i, int i2, int i3, int i4) {
        LogUtil.a("Track_PluginSportTrack", "launchIndoorEquipSportStateBroadcast, warm up");
        Bundle bundle = new Bundle();
        bundle.putString("voiceType", "warmUpTips");
        bundle.putInt("warmUpHeartRateLow", i3);
        bundle.putInt("warmUpHeartRateHeight", i4);
        bundle.putInt("treadmillEvent", i2);
        jau.c().d(new jbc(11, bundle));
    }

    private void c(String str, iwy iwyVar, Bundle bundle) {
        bundle.putFloat(str, iwyVar.g());
        int iL = iwyVar.l();
        if (iL == 1) {
            bundle.putInt("sport_target_type", iL);
            bundle.putFloat("lastValue", iwyVar.c());
            bundle.putBoolean("targetTip", true);
            bundle.putInt("targetProgress", iwyVar.h());
        }
    }

    private void b(String str, iwy iwyVar, Bundle bundle) {
        bundle.putLong(str, iwyVar.getSportDuration());
        int iL = iwyVar.l();
        if (iL == 0) {
            bundle.putInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, iL);
            bundle.putFloat("lastValue", iwyVar.c());
            bundle.putBoolean("targetTip", true);
            bundle.putInt("targetProgress", iwyVar.h());
        }
    }

    private boolean c(String str, iwy iwyVar, int i, Bundle bundle) {
        iyz iyzVarAf = iwyVar.af();
        if (iyzVarAf != null) {
            long jD = iyzVarAf.d((int) iwyVar.j());
            bundle.putLong(str, jD);
            bundle.putBoolean("paceTip", iya.d(i, jD));
            return false;
        }
        ReleaseLogUtil.d("Track_PluginSportTrack", "launchTrackSportStateBroadcast BUNDLE_KEY_PACE, mPaceManager == null");
        return true;
    }

    private void a(iwy iwyVar, Bundle bundle) {
        float fG = iwyVar.g();
        long sportDuration = iwyVar.getSportDuration();
        float fY = iwyVar.y();
        int iU = (int) iwyVar.u();
        int iE = iwyVar.e();
        bundle.putFloat("distance", fG);
        bundle.putLong("duration", sportDuration);
        bundle.putFloat("speed", fY);
        bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, iE);
        bundle.putInt("calorie", iU);
    }

    public boolean m() {
        return dmg.a().isRopeDeviceBtConnected();
    }

    public void e(int i, int i2, float f) {
        if (ae()) {
            LogUtil.e("Track_PluginSportTrack", "check if multi start");
            return;
        }
        int i3 = i2 == -1 ? 6 : i2;
        int iRound = Math.round(f) < 0 ? 0 : Math.round(f);
        dmg.a().setSkippingTargetMode(new SkippingTargetMode(i3, iRound, null));
        Intent intent = new Intent();
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        intent.setFlags(268435456);
        sportLaunchParams.setSportType(i);
        sportLaunchParams.setSportTarget(i3);
        sportLaunchParams.setTargetValue(iRound);
        sportLaunchParams.addExtra("productId", dmg.a().getProductId());
        intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParams);
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.indoorequip.activity.IndoorEquipDisplayActivity");
        hai.d(this.h, intent);
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        if (sportDataOutputApi != null) {
            sportDataOutputApi.registerDeviceDataCallback(this.s);
        }
        ReleaseLogUtil.d("Track_PluginSportTrack", " startIndoorEquipDisplay sourceSportType = ", Integer.valueOf(i), " sourceTargetType = ", Integer.valueOf(i2), " sourceTargetValue = ", Float.valueOf(f), " sportType = ", Integer.valueOf(i), " targetType = ", Integer.valueOf(i3), " targetValue = ", Integer.valueOf(iRound));
        d(i3, iRound);
    }

    public void d(int i, int i2) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("currentSkipperTargetType", Integer.valueOf(i));
        map.put("currentSkipperTarget", Integer.valueOf(i2));
        map.put("prodId", ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProdId(dmg.a().getProductId()));
        map.put("macAddress", nio.b(dmg.a().getCurrentMacAddress()));
        lmf.d().c(this.h, AnalyticsValue.HEALTH_SKIPPING_2170016.value(), map, 0);
    }

    public void e(Context context) {
        Context context2 = this.h;
        String str = f38077a;
        String strE = SharedPreferenceManager.e(context2, str, "sporting_sport_type_for_restart");
        String strE2 = SharedPreferenceManager.e(this.h, str, "sporting_target_type_for_restart");
        String strE3 = SharedPreferenceManager.e(this.h, str, "sporting_target_value_for_restart");
        ReleaseLogUtil.d("Track_PluginSportTrack", "gotoSport typeStr = ", strE, " targetTypeStr = ", strE2, " targetValueStr = ", strE3);
        c(context, CommonUtils.e(strE, 258), CommonUtils.e(strE2, -1), CommonUtils.c(strE3, -1.0f));
    }

    public void c(Context context, int i, int i2, float f) {
        if (!SportSupportUtil.f(i)) {
            i = 258;
        }
        int i3 = i;
        a(i3, i2, f);
        ReleaseLogUtil.d("Track_PluginSportTrack", " gotoSport sportType = ", Integer.valueOf(i3), " sportTarget = ", Integer.valueOf(i2), " targetValue = ", Float.valueOf(f));
        e(0, i3, i2, f, (ISportDataCallback) null, context);
    }

    public void a(int i, int i2, float f) {
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(i));
        map.put("goalType", Integer.valueOf(i2));
        if (!Utils.o()) {
            map.put("goalValue", Float.valueOf(f));
        }
        lmf.d().c(this.h, AnalyticsValue.BI_TRACK_SPORT_START_ACTION_KEY.value(), map, 0);
    }

    public boolean l() {
        return this.o;
    }

    public void c(Context context) {
        ivm.e().a(context);
    }

    public int g() {
        return iwy.a(jbg.a()).o();
    }

    public boolean o() {
        return iwy.a(jbg.a()).ay();
    }

    public void c(int i) {
        this.t = i;
    }

    public void e() {
        if (ivm.e().c()) {
            ivm.e().a(false);
            this.m = false;
            ivm.e(this.h);
        }
    }

    public int b() {
        return this.t;
    }

    public boolean r() {
        if (getAdapter() == null) {
            return false;
        }
        int iG = g();
        LogUtil.a("Track_PluginSportTrack", "sportState", Integer.valueOf(iG));
        return iG == 1 || iG == 2 || iG == 6;
    }

    public static PermissionUtil.PermissionType d(int i) {
        boolean zE = jxk.e();
        if (i == 264) {
            if (izn.b(BaseApplication.getContext())) {
                if (zE) {
                    return PermissionUtil.PermissionType.ACTIVITY_MEDIA_VIDEO_IMAGES;
                }
                return PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES;
            }
            if (zE) {
                return PermissionUtil.PermissionType.ACTIVITY;
            }
            return PermissionUtil.PermissionType.NONE;
        }
        if (i == 283 || SportSupportUtil.e(i) || i == 700001) {
            return PermissionUtil.PermissionType.CAMERA;
        }
        if ((i == 258 || i == 257) && zE) {
            return PermissionUtil.PermissionType.ACTIVITY_LOCATION;
        }
        return dep.a();
    }

    public boolean j() {
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        if (sportDataOutputApi == null || sportDataOutputApi.getStatus() == 0 || sportDataOutputApi.getStatus() == 3) {
            return false;
        }
        LogUtil.a("Track_PluginSportTrack", "getIsSporting");
        return true;
    }

    public void z() {
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) TrackMainMapActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("map_tracking_sport_type_sportting", iwy.a(this.h).k());
        intent.putExtra("sportdataparams", bundle);
        intent.addFlags(268435456);
        iov.d(this.h, intent);
    }

    public int h() {
        return this.l;
    }

    public void e(int i) {
        this.l = i;
    }

    private void am() {
        HandlerExecutor.b(new Runnable() { // from class: ivi
            @Override // java.lang.Runnable
            public final void run() {
                this.f38090c.ai();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ai() {
        if (CommonUtil.cb()) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(BaseApplication.getActivity());
            builder.a(this.h.getString(R.string.IDS_hwh_motiontrack_show_map_type_no_gms)).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: ivj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ive.d(view);
                }
            });
            builder.c().show();
        }
    }
}
