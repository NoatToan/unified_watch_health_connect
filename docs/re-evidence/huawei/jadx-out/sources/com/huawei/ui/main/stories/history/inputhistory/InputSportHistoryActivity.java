package com.huawei.ui.main.stories.history.inputhistory;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.ChooseSportTypeActivity;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import com.huawei.up.model.UserInfomation;
import defpackage.ive;
import defpackage.jqq;
import defpackage.jry;
import defpackage.jxj;
import defpackage.lmf;
import defpackage.qqz;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.vqj;
import defpackage.vqx;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CalculateCaloriesUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class InputSportHistoryActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f28334a;
    private RelativeLayout aa;
    private ImageView ab;
    private HealthTextView ac;
    private HealthTextView ad;
    private ImageView ae;
    private HealthTextView af;
    private ImageView ag;
    private RelativeLayout ah;
    private RelativeLayout ai;
    private HealthTextView aj;
    private RelativeLayout ak;
    private HealthTextView al;
    private ImageView an;
    private int ap;
    private Toast ar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f28335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f28336c;
    private LinearLayout d;
    private RelativeLayout e;
    private CustomTitleBar f;
    private Dialog h;
    private int i;
    private Context j;
    private int k;
    private int t;
    private RelativeLayout u;
    private int v;
    private ImageView x;
    private ImageView z;
    private Runnable w = null;
    private int l = 0;
    private int o = 0;
    private int m = 0;
    private int ao = 264;
    private boolean g = false;
    private boolean q = false;
    private float r = 0.0f;
    private String am = "BASE_SPORT";
    private float as = 0.0f;
    private boolean p = true;
    private boolean s = false;
    private MotionPathSimplify y = new MotionPathSimplify();
    private Handler n = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.main.stories.history.inputhistory.InputSportHistoryActivity.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("Track_InputSportHistoryActivity", "mHandler msg is null");
            } else {
                super.handleMessage(message);
                InputSportHistoryActivity.this.e(message);
            }
        }
    };

    private boolean b(int i) {
        return i == 262 || i == 266;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.j = this;
        n();
        f();
        h();
    }

    private void n() {
        if (qrs.ac()) {
            setContentView(R.layout.layout_input_sport_history_large);
        } else {
            setContentView(R.layout.layout_input_sport_history);
        }
        o();
        if (LanguageUtil.ba(this.j)) {
            this.an.setBackgroundResource(R.drawable.common_ui_arrow_left);
            this.ab.setBackgroundResource(R.drawable.common_ui_arrow_left);
            this.x.setBackgroundResource(R.drawable.common_ui_arrow_left);
            this.ag.setBackgroundResource(R.drawable.common_ui_arrow_left);
            this.ae.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        w();
        if (LanguageUtil.g(this.j) || LanguageUtil.ab(this.j) || LanguageUtil.bc(this.j)) {
            ((HealthTextView) findViewById(R.id.hw_add_sport_data_sport_type_name)).setTextSize(0, this.j.getResources().getDimension(R.dimen.hw_show_public_size_10));
        }
        if (Utils.o()) {
            HealthTextView healthTextView = (HealthTextView) findViewById(R.id.hw_add_sport_data_tips);
            if (Utils.h()) {
                healthTextView.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_input_history_data_oversea_tips));
            } else {
                healthTextView.setVisibility(4);
            }
        }
        initViewTahiti();
    }

    private void o() {
        this.f28336c = (RelativeLayout) findViewById(R.id.hw_add_sport_data_sport_data_img_top);
        this.e = (RelativeLayout) findViewById(R.id.hw_add_sport_data_sport_data_img_bottom);
        this.d = (LinearLayout) findViewById(R.id.hw_add_sport_info);
        this.z = (ImageView) findViewById(R.id.hw_add_sport_data_sport_data_img);
        this.ak = (RelativeLayout) findViewById(R.id.hw_add_sport_data_sport_type);
        this.al = (HealthTextView) findViewById(R.id.hw_add_sport_data_sport_type_value);
        this.an = (ImageView) findViewById(R.id.hw_add_sport_data_sport_type_right_button);
        this.aa = (RelativeLayout) findViewById(R.id.hw_add_sport_data_sport_duration);
        this.ad = (HealthTextView) findViewById(R.id.hw_add_sport_data_sport_duration_value);
        this.ab = (ImageView) findViewById(R.id.hw_add_sport_data_sport_duration_right_button);
        this.u = (RelativeLayout) findViewById(R.id.hw_add_sport_data_sport_distance);
        this.ac = (HealthTextView) findViewById(R.id.hw_add_sport_data_sport_distance_value);
        this.x = (ImageView) findViewById(R.id.hw_add_sport_data_sport_distance_right_button);
        this.ai = (RelativeLayout) findViewById(R.id.hw_add_sport_data_sport_time);
        this.aj = (HealthTextView) findViewById(R.id.hw_add_sport_data_sport_time_value);
        this.ag = (ImageView) findViewById(R.id.hw_add_sport_data_sport_time_right_button);
        this.ah = (RelativeLayout) findViewById(R.id.hw_add_sport_data_sport_start_time);
        this.af = (HealthTextView) findViewById(R.id.hw_add_sport_data_sport_start_time_value);
        this.ae = (ImageView) findViewById(R.id.hw_add_sport_data_sport_start_time_right_button);
        this.f = (CustomTitleBar) findViewById(R.id.input_sport_history_title);
        this.f28334a = (HealthButton) findViewById(R.id.cancel_add_button);
        this.f28335b = (HealthButton) findViewById(R.id.acknowledgement_add_button);
        BaseActivity.cancelLayoutById(this.d);
        BaseActivity.setViewSafeRegion(false, this.d);
    }

    private void i() {
        if (this.g) {
            this.u.setVisibility(0);
            if (m()) {
                this.ac.setText("");
                this.y.saveTotalDistance(0);
                this.q = !this.q;
                return;
            }
            return;
        }
        this.u.setVisibility(8);
        this.y.saveTotalDistance(0);
    }

    private boolean m() {
        return b(this.ao) != this.q;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        boolean zAf = qrs.af(getApplicationContext());
        super.initViewTahiti();
        if (zAf) {
            layoutParams = new LinearLayout.LayoutParams(-2, 0, 0.5f);
            layoutParams2 = new LinearLayout.LayoutParams(-2, 0, 0.0f);
            layoutParams3 = new LinearLayout.LayoutParams(-2, 0, 0.0f);
            layoutParams.gravity = 1;
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2 = new LinearLayout.LayoutParams(-2, qrs.d((Context) this, 34.0f));
            layoutParams3 = new LinearLayout.LayoutParams(-2, qrs.d((Context) this, 24.0f));
            layoutParams.gravity = 1;
        }
        g();
        this.d.setLayoutParams(layoutParams);
        this.f28336c.setLayoutParams(layoutParams2);
        this.e.setLayoutParams(layoutParams3);
    }

    private void g() {
        qrs.c((Context) this, true, true, this.ak, this.ai, this.u, this.aa, this.ah);
        qrs.a((Context) this, true, true, findViewById(R.id.hw_add_sport_data_tips));
    }

    private void w() {
        this.z.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        this.aa.setOnClickListener(this);
        this.u.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        this.ah.setOnClickListener(this);
        this.f28334a.setOnClickListener(this);
        this.f28335b.setOnClickListener(this);
        this.f.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.inputhistory.InputSportHistoryActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InputSportHistoryActivity.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.s) {
            LogUtil.a("Track_InputSportHistoryActivity", "close window(), onClick()  mIsClickCheck is true");
        } else {
            setResult(0);
            finish();
        }
    }

    private void f() {
        this.y.saveSportDataSource(2);
        j();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        this.ap = calendar.get(1);
        this.v = calendar.get(2) + 1;
        this.i = calendar.get(5);
        this.k = calendar.get(11);
        this.t = calendar.get(12);
        this.aj.setText(b(calendar.getTime()));
        this.af.setText(qrk.a(this.j, calendar.getTimeInMillis(), 1));
        calendar.clear();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b(view);
        if (this.s) {
            LogUtil.a("Track_InputSportHistoryActivity", "onClick()  mIsClickCheck is true");
            return;
        }
        v();
        if (view == this.z || view == this.ak) {
            k();
            return;
        }
        if (view == this.aa) {
            b();
            return;
        }
        if (view == this.u) {
            e();
            return;
        }
        if (view == this.ai) {
            u();
        } else if (view == this.ah) {
            x();
        } else {
            LogUtil.j("Track_InputSportHistoryActivity", "click is error");
        }
    }

    private void b(View view) {
        if (view == this.f28334a) {
            d();
        } else if (view == this.f28335b) {
            s();
        } else {
            LogUtil.j("Track_InputSportHistoryActivity", "click is error");
        }
    }

    private void v() {
        this.s = true;
        this.n.removeCallbacks(this.w);
        Runnable runnable = new Runnable() { // from class: com.huawei.ui.main.stories.history.inputhistory.InputSportHistoryActivity.1
            @Override // java.lang.Runnable
            public void run() {
                if (InputSportHistoryActivity.this.n == null) {
                    return;
                }
                InputSportHistoryActivity.this.s = false;
            }
        };
        this.w = runnable;
        this.n.postDelayed(runnable, 500L);
    }

    private void k() {
        LogUtil.a("Track_InputSportHistoryActivity", "jumpSportMotionType()");
        Intent intent = new Intent(this, (Class<?>) ChooseSportTypeActivity.class);
        intent.putExtra("sportTypeId", this.ao);
        intent.putExtra("sportGroupTypeId", this.am);
        startActivityForResult(intent, 10106);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10106) {
            LogUtil.j("Track_InputSportHistoryActivity", "onActivityResult is default");
            return;
        }
        if (i2 == -1) {
            a(this.z, jxj.d(intent.getStringExtra("resIconName"), R.drawable.ic_health_list_outdoor_running));
            this.al.setText(this.j.getResources().getString(intent.getIntExtra("itemNameId", 0)));
            int intExtra = intent.getIntExtra("sportTypeId", 0);
            this.ao = intExtra;
            this.y.saveSportType(intExtra);
            this.am = intent.getStringExtra("sportGroupTypeId");
            this.g = intent.getBooleanExtra("distanceFlag", false);
            i();
            this.r = intent.getFloatExtra("typeMet", 0.0f);
        }
    }

    private void e() {
        LogUtil.a("Track_InputSportHistoryActivity", "createSportDistanceDialog()");
        vqj.d dVar = new vqj.d(this.j, this.n);
        dVar.d(this.y.requestSportType());
        vqj vqjVarD = dVar.d();
        if (vqjVarD != null) {
            vqjVarD.show();
        }
        this.h = vqjVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        if (message.what == 10002) {
            b(message);
        }
    }

    private void a(ImageView imageView, Drawable drawable) {
        imageView.setPadding(4, 4, 4, 4);
        if (LanguageUtil.ba(this.j)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.j, drawable);
            vqx.c(bitmapDrawableE, this.j.getResources().getColor(R.color.white));
            imageView.setBackground(bitmapDrawableE);
        } else {
            vqx.c(drawable, this.j.getResources().getColor(R.color.white));
            imageView.setBackground(drawable);
        }
    }

    private void b(Message message) {
        String strE;
        int iA;
        float f = message.arg1 / 100.0f;
        if (f % 100.0f == 0.0f) {
            strE = UnitUtil.e(f, 1, 0);
        } else {
            strE = UnitUtil.e(f, 1, 2);
        }
        int iRequestSportType = this.y.requestSportType();
        if (iRequestSportType == 262 || iRequestSportType == 266) {
            iA = a(f);
        } else {
            iA = b(f);
        }
        this.y.saveTotalDistance(iA);
        if (message.obj instanceof String) {
            String str = (String) message.obj;
            this.ac.setText(strE + str);
        }
    }

    private int a(float f) {
        return UnitUtil.f() ? (int) Math.round(UnitUtil.c(f, 2)) : (int) f;
    }

    private int b(float f) {
        return UnitUtil.f() ? (int) (UnitUtil.c(f, 3) * 1000.0d) : (int) (f * 1000.0f);
    }

    private void j() {
        HwSportTypeInfo hwSportTypeInfoB = jry.a(this.j).b(this.ao);
        int iC = vqx.c(hwSportTypeInfoB.getSportTypeRes());
        a(this.z, hwSportTypeInfoB.getHistoryList().getItemDrawable());
        this.g = jqq.d(hwSportTypeInfoB.getSportTypeId());
        this.r = hwSportTypeInfoB.getMet();
        String string = this.j.getResources().getString(iC);
        LogUtil.a("Track_InputSportHistoryActivity", "initSupplementingRecords() mSportTypeId is", Integer.valueOf(this.ao), "sportType is", string);
        this.y.saveSportType(this.ao);
        this.al.setText(string);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i, int i2, int i3, int i4, int i5) {
        if (i == -1) {
            i = this.ap;
        }
        if (i2 == -1) {
            i2 = this.v;
        }
        if (i3 == -1) {
            i3 = this.i;
        }
        if (i4 == -1) {
            i4 = this.k;
        }
        if (i5 == -1) {
            i5 = this.t;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, i3);
        calendar.set(11, i4);
        calendar.set(12, i5);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.clear();
        if (timeInMillis <= System.currentTimeMillis() && timeInMillis + this.y.requestTotalTime() <= System.currentTimeMillis()) {
            return false;
        }
        a(this.j.getResources().getString(R.string.IDS_hwh_input_history_data_start_time_toast));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long c() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.ap);
        calendar.set(2, this.v - 1);
        calendar.set(5, this.i);
        calendar.set(11, this.k);
        calendar.set(12, this.t);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.clear();
        return timeInMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        int i3 = calendar.get(11);
        int i4 = calendar.get(12);
        calendar.set(11, i3 - i);
        calendar.set(12, i4 - (i2 + 1));
        this.ap = calendar.get(1);
        this.v = calendar.get(2) + 1;
        this.i = calendar.get(5);
        this.k = calendar.get(11);
        this.t = calendar.get(12);
        c(c());
        this.aj.setText(b(calendar.getTime()));
        this.af.setText(qrk.a(this.j, calendar.getTimeInMillis(), 1));
        calendar.clear();
    }

    private void h() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null) {
            this.as = userInfo.getWeightOrDefaultValue();
        } else {
            this.as = 60.0f;
            LogUtil.j("Track_InputSportHistoryActivity", "accountInfo is null");
        }
    }

    private float d(int i, float f, long j) {
        double d;
        float f2 = f / 1000.0f;
        float f3 = (float) ((j * 1.0d) / 60000.0d);
        switch (i) {
            case 257:
            case OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE /* 275 */:
            case 281:
            case 282:
                d = CalculateCaloriesUtils.d(f2, this.as);
                break;
            case 258:
            case 264:
            case OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE /* 280 */:
                d = CalculateCaloriesUtils.c(f2, this.as);
                break;
            case 259:
            case OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE /* 265 */:
                d = CalculateCaloriesUtils.c(this.r, f3, this.as);
                break;
            case 260:
                d = CalculateCaloriesUtils.b(f2, this.as);
                break;
            case 261:
            case 263:
            case OldToNewMotionPath.SPORT_TYPE_PINGPONG /* 267 */:
            case 268:
            case 269:
            case 270:
            case OldToNewMotionPath.SPORT_TYPE_BASKETBALL /* 271 */:
            case 272:
            case 276:
            case 277:
            case OldToNewMotionPath.SPORT_TYPE_BODY_BUILDING /* 278 */:
            case OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT /* 279 */:
            default:
                d = CalculateCaloriesUtils.a(this.r, f3, this.as);
                break;
            case 262:
            case OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM /* 266 */:
                d = CalculateCaloriesUtils.e(f2, this.as);
                break;
            case OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER /* 273 */:
            case OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE /* 274 */:
                d = CalculateCaloriesUtils.d(this.r, f3, this.as);
                break;
        }
        float f4 = (float) d;
        if (f4 < 0.0f) {
            return 0.0f;
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        this.y.saveStartTime(j + (System.currentTimeMillis() % 1000));
    }

    private void q() {
        if (this.y.requestSportType() == 512 || this.y.requestSportType() == 208 || this.y.requestSportType() == 279) {
            return;
        }
        this.y.saveTotalCalories((int) (d(this.y.requestSportType(), this.y.requestTotalDistance(), this.y.requestTotalTime()) * 1000.0f));
    }

    private void p() {
        if (this.y.requestTotalDistance() > 0) {
            float fRequestTotalTime = ((this.y.requestTotalTime() / 1000) * (this.y.requestSportType() == 274 ? 500.0f : 1000.0f)) / this.y.requestTotalDistance();
            LogUtil.a("Track_InputSportHistoryActivity", "avg pace is ", Float.valueOf(fRequestTotalTime));
            this.y.saveAvgPace(fRequestTotalTime);
        }
    }

    private void t() {
        if (this.g) {
            this.y.saveChiefSportDataType(0);
        } else {
            this.y.saveChiefSportDataType(1);
        }
    }

    private void s() {
        if (this.s) {
            LogUtil.a("Track_InputSportHistoryActivity", "close window(), onClick()  mIsClickCheck is true");
            return;
        }
        if ("".equals(this.ad.getText())) {
            a(this.j.getResources().getString(R.string.IDS_hwh_input_history_data_fill_complete_information_toast));
            return;
        }
        if (l() && this.g) {
            a(this.j.getResources().getString(R.string.IDS_hwh_input_history_data_fill_complete_information_toast));
            return;
        }
        if (c() > System.currentTimeMillis() || c() + this.y.requestTotalTime() > System.currentTimeMillis()) {
            a(this.j.getResources().getString(R.string.IDS_hwh_input_history_data_start_time_toast));
            return;
        }
        this.y.saveHasTrackPoint(false);
        q();
        t();
        p();
        MotionPathSimplify motionPathSimplify = this.y;
        motionPathSimplify.saveEndTime(motionPathSimplify.requestStartTime() + this.y.requestTotalTime());
        String str = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.ENGLISH).format(Long.valueOf(this.y.requestStartTime()));
        this.y.saveSportId("gps_maptracking_" + str);
        this.y.saveDeviceType(32);
        MotionPath motionPath = new MotionPath();
        if (ive.c().a(this.y, motionPath) == 0) {
            LogUtil.a("Track_InputSportHistoryActivity", "saveTrackDataToDatabase success");
        } else {
            LogUtil.a("Track_InputSportHistoryActivity", "saveTrackDataToDatabase failed");
        }
        a(motionPath);
    }

    private void a(MotionPath motionPath) {
        LogUtil.a("Track_InputSportHistoryActivity", "saveTrackDataToDatabase() StartTime: ", Long.valueOf(this.y.requestStartTime()), ", EndTime: ", Long.valueOf(this.y.requestEndTime()));
        ive.c().init(getApplicationContext());
        ive.c().b(motionPath, this.y);
        vqx.b(this.ao);
        y();
        r();
        setResult(0);
        finish();
    }

    private boolean l() {
        return this.y.requestTotalDistance() <= 0 || this.y.requestTotalTime() <= 0;
    }

    private void y() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("sportId", this.y.requestSportId());
        if (!Utils.o()) {
            map.put("startTime", Long.valueOf(this.y.requestStartTime()));
            map.put("endTime", Long.valueOf(this.y.requestEndTime()));
        }
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.y.requestSportType()));
        map.put("trackType", Integer.valueOf(this.y.requestTrackType()));
        map.put("sportDataSource", Integer.valueOf(this.y.requestSportDataSource()));
        lmf.d().c(this.j, AnalyticsValue.BI_TRACK_SPORT_ADD_SPORT_KEY.value(), map, 0);
    }

    private void r() {
        Intent intent = new Intent("input_sport_history_start_time");
        intent.setClass(this.j, SportHistoryActivity.class);
        intent.putExtra("startTime", this.y.requestStartTime());
        intent.putExtra("endTime", this.y.requestEndTime());
        intent.putExtra("distance", this.y.requestTotalDistance());
        intent.putExtra("pace", this.y.requestAvgPace());
        intent.putExtra("trackType", this.y.requestTrackType());
        intent.putExtra(BleConstants.SPORT_TYPE, this.y.requestSportType());
        intent.putExtra("duration", this.y.requestTotalTime());
        intent.putExtra("calorie", this.y.requestTotalCalories());
        intent.putExtra("chiefType", this.y.requestChiefSportDataType());
        BroadcastManagerUtil.a(this.j, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(Date date) {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMd")).format(date);
    }

    private void a(String str) {
        Toast toast = this.ar;
        if (toast == null) {
            this.ar = Toast.makeText(this.j, str, 1);
        } else {
            toast.setText(str);
            this.ar.setDuration(1);
        }
        this.ar.show();
    }

    public void a() {
        Toast toast = this.ar;
        if (toast != null) {
            toast.cancel();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.s) {
            LogUtil.a("Track_InputSportHistoryActivity", "onBackPressed() ,close window(), onClick()  mIsClickCheck is true");
        } else {
            a();
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        Dialog dialog = this.h;
        if (dialog != null) {
            dialog.dismiss();
        }
        a();
    }

    private void b() {
        LogUtil.a("Track_InputSportHistoryActivity", "createSportDurationDialog()");
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        HashMap map = new HashMap(3);
        map.put(0, healthMultiNumberPicker.c(0, 23, this.j.getResources().getString(R.string.IDS_band_data_sleep_unit_h)));
        map.put(1, healthMultiNumberPicker.c(0, 59, this.j.getResources().getString(R.string.IDS_band_data_sleep_unit_m)));
        map.put(2, healthMultiNumberPicker.c(0, 59, this.j.getResources().getString(R.string.IDS_second)));
        healthMultiNumberPicker.setDataContent(3, map, new boolean[]{true, true, true}, new int[]{this.l, this.o, this.m});
        healthMultiNumberPicker.setColonAndUnit(3);
        a(healthMultiNumberPicker);
    }

    private void a(final HealthMultiNumberPicker healthMultiNumberPicker) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.j);
        builder.a(getString(R.string.IDS_hwh_input_history_data_duration)).d((View) healthMultiNumberPicker).c(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.inputhistory.InputSportHistoryActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.inputhistory.InputSportHistoryActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
                InputSportHistoryActivity.this.l = selectedLocations[0];
                InputSportHistoryActivity.this.o = selectedLocations[1];
                InputSportHistoryActivity.this.m = selectedLocations[2];
                LogUtil.d("Track_InputSportHistoryActivity", "createSportDurationDialog() hour=", Integer.valueOf(InputSportHistoryActivity.this.l), ", minute=", Integer.valueOf(InputSportHistoryActivity.this.o), ", second=", Integer.valueOf(InputSportHistoryActivity.this.m));
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, InputSportHistoryActivity.this.l);
                calendar.set(12, InputSportHistoryActivity.this.o);
                calendar.set(13, InputSportHistoryActivity.this.m);
                Date time = calendar.getTime();
                if (InputSportHistoryActivity.this.l > 0 || InputSportHistoryActivity.this.o > 0 || InputSportHistoryActivity.this.m > 0) {
                    long j = (((long) InputSportHistoryActivity.this.m) * 1000) + (((long) InputSportHistoryActivity.this.o) * 60000) + (((long) InputSportHistoryActivity.this.l) * 3600000);
                    LogUtil.d("Track_InputSportHistoryActivity", "createSportDurationDialog() TotalTime=", Long.valueOf(j));
                    InputSportHistoryActivity.this.y.saveTotalTime(j);
                    InputSportHistoryActivity.this.ad.setText(new SimpleDateFormat(Constants.TIME_FORMAT_WITHOUT_MILLS).format(time));
                } else {
                    InputSportHistoryActivity.this.y.saveTotalTime(0L);
                    InputSportHistoryActivity.this.ad.setText("");
                }
                if (InputSportHistoryActivity.this.p) {
                    InputSportHistoryActivity inputSportHistoryActivity = InputSportHistoryActivity.this;
                    inputSportHistoryActivity.a(inputSportHistoryActivity.l, InputSportHistoryActivity.this.o);
                }
                calendar.clear();
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.show();
        this.h = customViewDialogD;
    }

    private void u() {
        LogUtil.a("Track_InputSportHistoryActivity", "showInputSportDateChooseDialog()");
        HealthDatePickerDialog healthDatePickerDialog = new HealthDatePickerDialog(this, new HealthDatePickerDialog.DateSelectedListener() { // from class: com.huawei.ui.main.stories.history.inputhistory.InputSportHistoryActivity.6
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public void onDateSelected(int i, int i2, int i3) {
                int i4 = i2 + 1;
                if (InputSportHistoryActivity.this.d(i, i4, i3, -1, -1)) {
                    return;
                }
                InputSportHistoryActivity.this.ap = i;
                InputSportHistoryActivity.this.v = i4;
                InputSportHistoryActivity.this.i = i3;
                LogUtil.d("Track_InputSportHistoryActivity", "showInputSportDateChooseDialog year=", Integer.valueOf(InputSportHistoryActivity.this.ap), ", month=", Integer.valueOf(InputSportHistoryActivity.this.v), ", day=", Integer.valueOf(InputSportHistoryActivity.this.i));
                Calendar calendar = Calendar.getInstance();
                calendar.set(1, InputSportHistoryActivity.this.ap);
                calendar.set(2, InputSportHistoryActivity.this.v - 1);
                calendar.set(5, InputSportHistoryActivity.this.i);
                InputSportHistoryActivity.this.aj.setText(InputSportHistoryActivity.this.b(calendar.getTime()));
                InputSportHistoryActivity inputSportHistoryActivity = InputSportHistoryActivity.this;
                inputSportHistoryActivity.c(inputSportHistoryActivity.c());
                InputSportHistoryActivity.this.y.saveEndTime(InputSportHistoryActivity.this.c() + InputSportHistoryActivity.this.y.requestTotalTime());
                InputSportHistoryActivity.this.p = false;
                calendar.clear();
            }
        }, new GregorianCalendar(this.ap, this.v - 1, this.i));
        healthDatePickerDialog.e(true, getString(R.string.IDS_hwh_input_history_data_workout_date));
        healthDatePickerDialog.b(true);
        Calendar calendar = Calendar.getInstance();
        healthDatePickerDialog.a(new GregorianCalendar(2014, 0, 1), new GregorianCalendar(calendar.get(1), calendar.get(2), calendar.get(5)));
        healthDatePickerDialog.show();
        this.h = healthDatePickerDialog;
    }

    private void x() {
        LogUtil.a("Track_InputSportHistoryActivity", "showInputSportStartTimeChooseDialog()");
        if (!(this.j.getSystemService("layout_inflater") instanceof LayoutInflater)) {
            LogUtil.a("Track_InputSportHistoryActivity", "showInputSportStartTimeChooseDialog ", "object is invalid type");
            return;
        }
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog(this, new HealthTimePickerDialog.TimeSelectedListener() { // from class: com.huawei.ui.main.stories.history.inputhistory.InputSportHistoryActivity.9
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public void onTimeSelected(int i, int i2) {
                if (InputSportHistoryActivity.this.d(-1, -1, -1, i, i2)) {
                    return;
                }
                InputSportHistoryActivity.this.k = i;
                InputSportHistoryActivity.this.t = i2;
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, InputSportHistoryActivity.this.k);
                calendar.set(12, InputSportHistoryActivity.this.t);
                InputSportHistoryActivity.this.af.setText(qrk.a(InputSportHistoryActivity.this.j, calendar.getTimeInMillis(), 1));
                InputSportHistoryActivity.this.p = false;
                InputSportHistoryActivity inputSportHistoryActivity = InputSportHistoryActivity.this;
                inputSportHistoryActivity.c(inputSportHistoryActivity.c());
                calendar.clear();
            }
        });
        healthTimePickerDialog.b(0, 0, 0, this.k, this.t);
        healthTimePickerDialog.e(getString(R.string.IDS_settings_seat_long_starttime));
        healthTimePickerDialog.show();
        this.h = healthTimePickerDialog;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Dialog dialog = this.h;
        if (dialog != null) {
            dialog.dismiss();
        }
        a();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.j = null;
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
