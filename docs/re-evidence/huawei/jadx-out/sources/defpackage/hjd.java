package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.devicemgr.api.constant.DataCallbackType;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.R;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Classify;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class hjd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36799b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CourseApi f36800c;
    private String d;
    private String e;
    private Handler f;
    private boolean g;
    private FitWorkout h;
    private WorkoutRecord i;
    private boolean j;

    static /* synthetic */ void b(View view) {
    }

    static /* synthetic */ void c(View view) {
    }

    static /* synthetic */ void d(View view) {
    }

    static /* synthetic */ void e(View view) {
    }

    public hjd(Handler handler, Context context) {
        this.f = handler;
        this.f36798a = context;
    }

    public void c() {
        this.e = CommonUtil.z();
        this.f36800c = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        ecu.d().registerDataCallback(new e(this), DataCallbackType.EXERCISE_ADVICE_MANAGER, "Suggestion_CourseDetailDeviceHelper");
        ecu.d().registerDataCallback(new e(this), DataCallbackType.DEVICE_FONT_MANAGER, "Suggestion_CourseDetailDeviceHelper");
        k();
    }

    public void b(WorkoutRecord workoutRecord) {
        this.i = workoutRecord;
        if (workoutRecord != null) {
            this.d = workoutRecord.acquireWorkoutId();
        }
    }

    public void b(FitWorkout fitWorkout) {
        this.h = fitWorkout;
    }

    public boolean d() {
        return this.g;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public boolean e() {
        return this.j;
    }

    public void d(boolean z) {
        if (this.j) {
            CoachController.c().d(false);
        } else {
            CoachController.c().d(hkt.b() || ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).isDeviceConnected("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c"));
            e(z);
        }
        CoachController.c().e(OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT);
        FitWorkout fitWorkout = this.h;
        if (fitWorkout == null || fitWorkout.getPrimaryClassify() == null) {
            return;
        }
        for (Classify classify : this.h.getPrimaryClassify()) {
            if (classify != null && classify.getClassifyId() == 11087) {
                CoachController.c().e(137);
            }
        }
    }

    public void e(boolean z) {
        CoachController.c().a(hkt.c());
        if (this.h == null || this.i == null || !CoachController.c().h()) {
            return;
        }
        try {
            CoachController.c().c(iee.a(this.h, this.i.acquireRecordType(), z));
        } catch (dfh e2) {
            ReleaseLogUtil.a("Suggestion_CourseDetailDeviceHelper", "SportHiWearException ", LogAnonymous.b(e2));
        }
    }

    public boolean a() {
        if (!deo.c()) {
            return false;
        }
        ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkToGetDeviceSportStatus");
        final b bVar = new b(this, 103, 102);
        deo.c(bVar);
        HandlerExecutor.c(new Runnable() { // from class: hjk
            @Override // java.lang.Runnable
            public final void run() {
                this.f36809a.a(bVar);
            }
        }, 2000L);
        return true;
    }

    /* synthetic */ void a(b bVar) {
        if (this.f == null) {
            ReleaseLogUtil.e("Suggestion_CourseDetailDeviceHelper", "handler is null.");
        } else {
            if (bVar.d) {
                ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkToGetDeviceSportStatus has response.no need handle.");
                return;
            }
            ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkToGetDeviceSportStatus has timeout.");
            this.f.sendEmptyMessage(102);
            bVar.d = true;
        }
    }

    public void b(final int i) {
        if (b() && !this.h.isLongExplainVideoCourse()) {
            ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkDeviceSportStatus");
            final b bVar = new b(this, 107, i);
            deo.c(bVar);
            HandlerExecutor.c(new Runnable() { // from class: hjh
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(bVar, i);
                }
            }, 2000L);
            return;
        }
        this.f.sendEmptyMessage(i);
    }

    /* synthetic */ void e(b bVar, int i) {
        if (this.f == null) {
            ReleaseLogUtil.e("Suggestion_CourseDetailDeviceHelper", "handler is null.");
        } else {
            if (bVar.d) {
                ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkDeviceStatusAndStartCoach has response.no need handle.");
                return;
            }
            ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkDeviceStatusAndStartCoach has timeout.");
            this.f.sendEmptyMessage(i);
            bVar.d = true;
        }
    }

    public void a(final int i) {
        if (deo.c()) {
            ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkDeviceSportStatus");
            final b bVar = new b(this, 107, i);
            deo.c(bVar);
            HandlerExecutor.c(new Runnable() { // from class: hjc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36797c.c(bVar, i);
                }
            }, 2000L);
            return;
        }
        this.f.sendEmptyMessage(i);
    }

    /* synthetic */ void c(b bVar, int i) {
        if (this.f == null) {
            ReleaseLogUtil.e("Suggestion_CourseDetailDeviceHelper", "handler is null.");
        } else {
            if (bVar.d) {
                ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkDeviceStatusAndStartTrackActivity has response.no need handle.");
                return;
            }
            ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkDeviceStatusAndStartTrackActivity has timeout.");
            this.f.sendEmptyMessage(i);
            bVar.d = true;
        }
    }

    public boolean b() {
        boolean zE = iem.e(BaseApplication.b().getApplicationContext(), ifz.a());
        boolean zB = hkt.b();
        boolean zH = nvd.h(btx.c());
        ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkDeviceSportStatus connect wear device:", Boolean.valueOf(zE), Boolean.valueOf(zB), "bandOtaStatus:", Boolean.valueOf(zH));
        return zE && zB && !zH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.f36799b == null || i == -1) {
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(this.f36799b);
        sb.append("_");
        sb.append(i);
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(btx.c(), String.valueOf(101010), "device_support_run_course_key", sb.toString(), storageParams);
        LogUtil.a("Suggestion_CourseDetailDeviceHelper", "record device ability ", Integer.valueOf(i));
    }

    private void k() {
        if (!i() && iem.e(BaseApplication.b().getApplicationContext(), ifz.a())) {
            ecu.d().sendDeviceData(22, 12, null, null, "Suggestion_CourseDetailDeviceHelper");
        }
    }

    private boolean i() {
        String strE;
        String str;
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_CourseDetailDeviceHelper");
        if (deviceInfo != null) {
            String securityDeviceId = deviceInfo.getSecurityDeviceId();
            this.f36799b = securityDeviceId;
            if (securityDeviceId == null || (strE = SharedPreferenceManager.e(btx.c(), String.valueOf(101010), "device_support_run_course_key")) == null) {
                return false;
            }
            String[] strArrSplit = strE.split("_");
            int i = -1;
            if (strArrSplit != null && strArrSplit.length == 2) {
                str = strArrSplit[0];
                try {
                    i = Integer.parseInt(strArrSplit[1]);
                } catch (NumberFormatException e2) {
                    LogUtil.e("Suggestion_CourseDetailDeviceHelper", "parse value failed ", LogAnonymous.b(e2));
                }
            } else {
                str = "";
            }
            if (this.f36799b.equals(str)) {
                if (i == 1) {
                    Message messageObtainMessage = this.f.obtainMessage(0);
                    messageObtainMessage.arg1 = 1;
                    this.f.sendMessage(messageObtainMessage);
                    this.g = true;
                }
                return true;
            }
        }
        return false;
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<hjd> f36801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36803c;
        volatile boolean d = false;

        b(hjd hjdVar, int i, int i2) {
            this.f36801a = new WeakReference<>(hjdVar);
            this.f36802b = i;
            this.f36803c = i2;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "checkDeviceSportStatus: onResponse ", obj, " response:", Boolean.valueOf(this.d));
            if (this.d) {
                return;
            }
            hjd hjdVar = this.f36801a.get();
            if (hjdVar != null && hjdVar.f != null) {
                this.d = true;
                Handler handler = hjdVar.f;
                if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
                    ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "not running");
                    handler.sendEmptyMessage(this.f36803c);
                    hjdVar.j = false;
                    return;
                } else {
                    handler.sendEmptyMessage(this.f36802b);
                    hjdVar.j = true;
                    return;
                }
            }
            ReleaseLogUtil.e("Suggestion_CourseDetailDeviceHelper", "activity or handler is null");
        }
    }

    private void e(int i) {
        ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "showDeviceDialog heartRateDeviceStatus:", Integer.valueOf(i));
        if (i == 1) {
            c(R.string.IDS_plugin_fitnessadvice_connect_msg);
        } else if (i == 2) {
            m();
        }
    }

    private void m() {
        new CustomTextAlertDialog.Builder(this.f36798a).e(this.f36798a.getString(R.string.IDS_plugin_fitnessadvice_binding_device)).a(this.f36798a.getString(R.string.IDS_plugin_fitnessadvice_need_device)).a(R.string.IDS_plugin_fitnessadvice_binding_go, new View.OnClickListener() { // from class: hjf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36806b.j(view);
            }
        }).e(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: hjl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hjd.d(view);
            }
        }).b().show();
    }

    /* synthetic */ void j(View view) {
        iem.b(this.f36798a);
    }

    private void c(int i) {
        new CustomTextAlertDialog.Builder(this.f36798a).e(this.f36798a.getString(R.string.IDS_plugin_fitnessadvice_connect_device)).a(this.f36798a.getString(i)).a(R.string.IDS_plugin_fitnessadvice_connect_go, new View.OnClickListener() { // from class: hjj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36808b.g(view);
            }
        }).e(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: hji
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hjd.b(view);
            }
        }).b().show();
    }

    /* synthetic */ void g(View view) {
        g();
    }

    public void a(Context context) {
        Intent intent = new Intent();
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.setPackage(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
        intent.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.adddevice.AllDeviceListActivity");
        intent.putExtra("progressbar", 0);
        intent.putExtra("isHeartRateDevice", 1);
        intent.putExtra("arg1", "DeviceList");
        intent.putExtra("isFromFitnessAdvice", true);
        intent.putExtra("title", this.f36798a.getResources().getString(com.huawei.health.basefitnessadvice.R.string.sug_run_workout_selection_devices));
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 1001);
        } else {
            iov.d(context, intent);
        }
    }

    public void d(int i, int i2, Intent intent) {
        if (i == 1001 && iem.e(this.f36798a, ifz.a())) {
            ecu.d().sendDeviceData(22, 12, null, null, "Suggestion_CourseDetailDeviceHelper");
        }
    }

    public void g() {
        if (iem.e()) {
            iem.d(this.f36798a);
        } else {
            if (ifz.a()) {
                return;
            }
            f();
        }
    }

    public void f() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f36798a).a(this.f36798a.getResources().getString(com.huawei.health.servicesui.R.string.IDS_device_bluetooth_open_request)).c(com.huawei.ui.commonui.R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: hjq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hjd.a(view);
            }
        }).a(com.huawei.ui.commonui.R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: hjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hjd.e(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void a(View view) {
        LogUtil.a("Suggestion_CourseDetailDeviceHelper", "user choose open BT");
        try {
            BluetoothAdapter.getDefaultAdapter().enable();
        } catch (RuntimeException e2) {
            ReleaseLogUtil.a("Suggestion_CourseDetailDeviceHelper", "user choose open BT error :", LogAnonymous.b(e2));
        }
    }

    public void j() {
        if (l()) {
            s();
            return;
        }
        ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "user has click not remind for course push");
        if (!iem.e(this.f36798a, ifz.a())) {
            q();
        } else {
            n();
        }
    }

    private void s() {
        View viewInflate = View.inflate(this.f36798a, R.layout.sug_push_course_dialog, null);
        ((HealthTextView) viewInflate.findViewById(R.id.sug_dialog_title)).setText(R.string.sug_push_course_to_watch);
        ((HealthCheckBox) viewInflate.findViewById(R.id.sug_privacy_dialog_box)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.CourseDetailDeviceHelper$$ExternalSyntheticLambda7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.d.c(compoundButton, z);
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f36798a);
        e(viewInflate, builder);
        builder.d().show();
    }

    public /* synthetic */ void c(CompoundButton compoundButton, boolean z) {
        LogUtil.a("Suggestion_CourseDetailDeviceHelper", "initPlanFinishedDialog onClick not remind");
        c(z);
    }

    private void c(boolean z) {
        SharedPreferenceManager.e(btx.c(), String.valueOf(101010), "not_remind_push_course_key", String.valueOf(z), new StorageParams());
    }

    private boolean l() {
        String strE = SharedPreferenceManager.e(btx.c(), String.valueOf(101010), "not_remind_push_course_key");
        return TextUtils.isEmpty(strE) || "false".equals(strE);
    }

    private void e(View view, CustomViewDialog.Builder builder) {
        builder.d(view).c(this.f36798a.getString(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: hjm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hjd.c(view2);
            }
        }).a(this.f36798a.getString(R.string.IDS_plugin_fitnessadvice_ok).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: hjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f36811b.i(view2);
            }
        });
    }

    /* synthetic */ void i(View view) {
        if (!iem.e(this.f36798a, ifz.a())) {
            q();
        } else {
            n();
        }
    }

    private void q() {
        c(com.huawei.ui.commonui.R.string.IDS_plugin_fitnessadvice_push_need_connect);
    }

    private void n() {
        ecu.d().sendDeviceData(12, 2, null, null, "Suggestion_CourseDetailDeviceHelper");
        idy.c("1130024");
    }

    public void d(IBaseResponseCallback iBaseResponseCallback, boolean z) {
        if (o()) {
            if (!ifz.a()) {
                if (z) {
                    f();
                }
                iBaseResponseCallback.a(0, 3);
                return;
            }
            iBaseResponseCallback.a(0, 0);
            return;
        }
        if (iem.a(BaseApplication.j(), ifz.a())) {
            iBaseResponseCallback.a(0, 0);
        } else if (iem.d()) {
            iBaseResponseCallback.a(0, 1);
        } else {
            iBaseResponseCallback.a(0, 2);
        }
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        d(iBaseResponseCallback, true);
    }

    public void c(final IBaseResponseCallback iBaseResponseCallback) {
        e(new IBaseResponseCallback() { // from class: hjo
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f36813c.c(iBaseResponseCallback, i, obj);
            }
        });
    }

    /* synthetic */ void c(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("Suggestion_CourseDetailDeviceHelper", "guideConnectHeartRateDevice() errorCode = ", Integer.valueOf(i), " objData = ", obj);
        if (obj instanceof Integer) {
            e(((Integer) obj).intValue());
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i, obj);
            }
        }
    }

    private boolean o() {
        boolean zA = iem.a();
        LogUtil.a("Suggestion_CourseDetailDeviceHelper", "isHaveOtherHeartRateDevice() = ", Boolean.valueOf(zA));
        return zA;
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<hjd> f36804a;

        e(hjd hjdVar) {
            if (hjdVar != null) {
                this.f36804a = new WeakReference<>(hjdVar);
            }
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.d("FitnessSug_DeviceStateCallback", "err_code:", Integer.valueOf(i), " objData:", obj);
            WeakReference<hjd> weakReference = this.f36804a;
            if (weakReference == null) {
                ReleaseLogUtil.e("FitnessSug_DeviceStateCallback", "onResponse mActivity == null");
                return;
            }
            hjd hjdVar = weakReference.get();
            if (hjdVar != null) {
                if (i == 2) {
                    if (obj == null) {
                        LogUtil.e("FitnessSug_DeviceStateCallback", "GET_DEVICE_FONT_INFO objData == null");
                        hjdVar.h();
                        return;
                    } else {
                        if (obj instanceof String[]) {
                            c(hjdVar, (String[]) obj);
                            return;
                        }
                        return;
                    }
                }
                if (i == 12) {
                    if (obj instanceof Integer) {
                        c(hjdVar, ((Integer) obj).intValue());
                    }
                } else {
                    if (i == 13) {
                        if (obj instanceof Integer) {
                            e(hjdVar, ((Integer) obj).intValue());
                            return;
                        }
                        return;
                    }
                    LogUtil.j("FitnessSug_DeviceStateCallback", "COMMAND_ID not found!");
                }
            }
        }

        private void c(hjd hjdVar, String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                ReleaseLogUtil.a("FitnessSug_DeviceStateCallback", "GET_DEVICE_FONT_DATA failed");
            } else {
                for (String str : strArr) {
                    hjdVar.e = str;
                }
            }
            hjdVar.h();
        }

        private void c(hjd hjdVar, int i) {
            ReleaseLogUtil.d("FitnessSug_DeviceStateCallback", "PUSH_FIT_RUN_COURSE_DATA receive:", Integer.valueOf(i));
            if (i != -1) {
                hjdVar.d(1);
                Handler handler = hjdVar.f;
                Message messageObtainMessage = handler.obtainMessage(0);
                messageObtainMessage.arg1 = 1;
                handler.sendMessage(messageObtainMessage);
                hjdVar.g = true;
            }
        }

        private void e(hjd hjdVar, int i) {
            ReleaseLogUtil.d("FitnessSug_DeviceStateCallback", "GET_FIT_RUN_COURSE_INFO receive:", Integer.valueOf(i));
            if (i == 100000) {
                LogUtil.a("FitnessSug_DeviceStateCallback", "push success!");
                Handler handler = hjdVar.f;
                handler.sendMessage(handler.obtainMessage(1));
            } else if (i == 107003) {
                LogUtil.a("FitnessSug_DeviceStateCallback", "course exceed the limit!");
                Handler handler2 = hjdVar.f;
                handler2.sendMessage(handler2.obtainMessage(2));
            }
        }
    }

    public void h() {
        ReleaseLogUtil.d("Suggestion_CourseDetailDeviceHelper", "device language is: ", this.e, " app language is: ", CommonUtil.z());
        WorkoutRecord workoutRecord = this.i;
        String strAcquireVersion = workoutRecord != null ? workoutRecord.acquireVersion() : "";
        if (this.e != null && !CommonUtil.z().equalsIgnoreCase(this.e)) {
            LogUtil.a("Suggestion_CourseDetailDeviceHelper", "get device language fitworkout courseId: ", this.d, "version: ", strAcquireVersion, "devicefont: ", this.e);
            c cVar = new c(this);
            CourseApi courseApi = this.f36800c;
            if (courseApi == null) {
                LogUtil.j("Suggestion_CourseDetailDeviceHelper", "pushFitRunCourseData: mCourseApi is null.");
                return;
            } else {
                courseApi.getCourseById(this.d, strAcquireVersion, this.e, cVar);
                return;
            }
        }
        ecu.d().pushFitRunCourseData(this.h);
    }

    static class c extends UiCallback<Workout> {
        private WeakReference<hjd> e;

        c(hjd hjdVar) {
            this.e = new WeakReference<>(hjdVar);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            hjd hjdVar = this.e.get();
            if (hjdVar != null) {
                FitWorkout fitWorkout = hjdVar.h;
                if (fitWorkout != null) {
                    ReleaseLogUtil.e("Suggestion_CourseDetailDeviceHelper", "get device language fitworkout failed,use the app's language course");
                    ecu.d().pushFitRunCourseData(fitWorkout);
                    return;
                } else {
                    ReleaseLogUtil.a("Suggestion_CourseDetailDeviceHelper", "get device language fitworkout failed and app's fitworkout is null");
                    return;
                }
            }
            LogUtil.j("Suggestion_CourseDetailDeviceHelper", "GetFitRunCourseCallback onFailure trainDetail is null");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Workout workout) {
            if (gzx.e(workout)) {
                ecu.d().pushFitRunCourseData(pea.d(workout));
                return;
            }
            hjd hjdVar = this.e.get();
            if (hjdVar != null) {
                FitWorkout fitWorkout = hjdVar.h;
                if (fitWorkout != null) {
                    ReleaseLogUtil.e("Suggestion_CourseDetailDeviceHelper", "get device language workout failed,use the app's language");
                    ecu.d().pushFitRunCourseData(fitWorkout);
                    return;
                } else {
                    ReleaseLogUtil.a("Suggestion_CourseDetailDeviceHelper", "get device language fitworkout failed and app's fitworkout is null");
                    return;
                }
            }
            LogUtil.j("Suggestion_CourseDetailDeviceHelper", "GetFitRunCourseCallback onSuccess trainDetail is null");
        }
    }
}
