package com.huawei.ui.main.stories.me.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.up.model.UserInfomation;
import defpackage.imx;
import defpackage.lxc;
import defpackage.nkd;
import defpackage.nkv;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.Calendar;

/* JADX INFO: loaded from: classes43.dex */
public class StudentInfoActivity extends BaseActivity implements View.OnClickListener {
    private Context f = null;
    private RelativeLayout n = null;
    private RelativeLayout i = null;
    private RelativeLayout q = null;
    private RelativeLayout ah = null;
    private RelativeLayout t = null;
    private HealthDivider s = null;
    private RelativeLayout u = null;
    private HealthDivider w = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f28468c = null;
    private HealthTextView k = null;
    private HealthTextView g = null;
    private HealthTextView r = null;
    private HealthTextView ai = null;
    private ImageView h = null;
    private ImageView e = null;
    private ImageView l = null;
    private ImageView ag = null;
    private String o = "";
    private String j = "";
    private String x = "";
    private CommonDialog21 v = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28467b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28466a = 0;
    private int d = 0;
    private int m = 0;
    private int p = 0;
    private UserInfomation z = new UserInfomation(0);
    private int ad = 1;
    private int ab = 0;
    private int aa = 0;
    private float ae = 0.0f;
    private int ac = 0;
    private d y = new d(this);

    private int e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        return i;
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<StudentInfoActivity> f28471a;

        d(StudentInfoActivity studentInfoActivity) {
            this.f28471a = new WeakReference<>(studentInfoActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            StudentInfoActivity studentInfoActivity = this.f28471a.get();
            if (studentInfoActivity == null) {
                LogUtil.j("StudentInfoActivity", "onResponse activity null.");
                return;
            }
            if (!(obj instanceof UserInfomation)) {
                LogUtil.j("StudentInfoActivity", "onResponse objData is not UserInformation.");
                return;
            }
            LogUtil.a("StudentInfoActivity", "onResponse errorCode: ", Integer.valueOf(i));
            UserInfomation userInfomation = (UserInfomation) obj;
            if (studentInfoActivity.b(i, userInfomation)) {
                studentInfoActivity.k();
                if (i == 0) {
                    int height = userInfomation.getHeight();
                    studentInfoActivity.c(height);
                    studentInfoActivity.i(height);
                } else if (i == 1) {
                    float weight = userInfomation.getWeight();
                    studentInfoActivity.d(userInfomation.getWeight());
                    studentInfoActivity.b(weight);
                } else if (i == 3) {
                    int iB = CommonUtil.b(userInfomation.getBirthday(), 10);
                    studentInfoActivity.b(iB);
                    studentInfoActivity.ab = iB;
                } else if (i != 19) {
                    LogUtil.j("StudentInfoActivity", "errorCode is unknown.");
                    return;
                } else {
                    int gender = userInfomation.getGender();
                    studentInfoActivity.d(gender);
                    studentInfoActivity.ad = gender;
                }
                studentInfoActivity.j();
                return;
            }
            LogUtil.j("StudentInfoActivity", "onResponse birthday is error.");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        this.f = this;
        setContentView(R.layout.hw_show_studentinfo_activity);
        i();
        a();
    }

    private void i() {
        b();
        f();
        d();
    }

    private void b() {
        this.n = (RelativeLayout) findViewById(R.id.hw_show_userinfo_gender_layout);
        this.i = (RelativeLayout) findViewById(R.id.hw_show_userinfo_birthday_layout);
        this.q = (RelativeLayout) findViewById(R.id.hw_show_userinfo_height_layout);
        this.ah = (RelativeLayout) findViewById(R.id.hw_show_userinfo_weight_layout);
        this.f28468c = (CustomTitleBar) findViewById(R.id.me_userInfo_titlebar);
        this.s = (HealthDivider) findViewById(R.id.divide_line_before_interest);
        this.t = (RelativeLayout) findViewById(R.id.hw_show_userinfo_interest_layout);
        this.w = (HealthDivider) findViewById(R.id.divide_line_before_sos);
        this.u = (RelativeLayout) findViewById(R.id.hw_show_userinfo_sos_layout);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.w.setVisibility(8);
        this.u.setVisibility(8);
        this.n.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.ah.setOnClickListener(this);
        this.f28468c.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.StudentInfoActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("StudentInfoActivity", "exist activity.");
                StudentInfoActivity.this.finish();
            }
        });
    }

    private void f() {
        this.k = (HealthTextView) findViewById(R.id.hw_show_userinfo_gender);
        this.g = (HealthTextView) findViewById(R.id.hw_show_userinfo_birthday);
        this.r = (HealthTextView) findViewById(R.id.hw_show_userinfo_height);
        this.ai = (HealthTextView) findViewById(R.id.hw_show_userinfo_weight);
        this.k.setVisibility(0);
        this.g.setVisibility(0);
        this.r.setVisibility(0);
        this.ai.setVisibility(0);
        this.o = this.f.getResources().getString(R.string.IDS_hw_show_set_default_gender_male);
        this.j = this.f.getResources().getString(R.string.IDS_hw_show_set_default_gender_female);
        this.x = this.f.getResources().getString(R.string.IDS_hw_me_userinfo_not_set);
        if (LanguageUtil.c(this.f.getApplicationContext())) {
            this.k.setWidth(qrs.d(this.f.getApplicationContext(), 60.0f));
            this.k.setGravity(GravityCompat.START);
        }
    }

    private void d() {
        this.h = (ImageView) findViewById(R.id.user_info_fragment_set_gender_image);
        this.e = (ImageView) findViewById(R.id.user_info_fragment_set_birthday_image);
        this.l = (ImageView) findViewById(R.id.user_info_fragment_set_height_image);
        this.ag = (ImageView) findViewById(R.id.user_info_fragment_set_weight_image);
        if (LanguageUtil.ba(this.f)) {
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.e.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.l.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.ag.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            return;
        }
        this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        this.e.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        this.l.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        this.ag.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
    }

    private void a() throws Throwable {
        UserInfomation userInfomationB = lxc.b();
        this.z = userInfomationB;
        this.ac = userInfomationB.getAge();
        g();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("StudentInfoActivity", "onClick view is null.");
            return;
        }
        if (view == this.n) {
            n();
            return;
        }
        if (view == this.i) {
            l();
            return;
        }
        if (view == this.q) {
            m();
        } else if (view != this.ah) {
            LogUtil.j("StudentInfoActivity", "onClick unknown view.");
        } else {
            q();
        }
    }

    private void n() {
        LogUtil.a("StudentInfoActivity", "Enter showGenderSelectDialog.");
        UserInfomation userInfomation = new UserInfomation(0);
        int i = this.ad;
        if (i != 1 && i != 0) {
            userInfomation.setGender(Integer.valueOf(e(1)));
        } else {
            userInfomation.setGender(Integer.valueOf(e(i)));
        }
        imx.d(this, 19, userInfomation, this.y);
    }

    private void l() {
        LogUtil.a("StudentInfoActivity", "Enter showBirthdaySelectDialog.");
        int iB = CommonUtil.b(this.z.getBirthday(), 10);
        if (iB == -100) {
            Calendar calendar = Calendar.getInstance();
            this.f28467b = calendar.get(1) - 15;
            this.f28466a = calendar.get(2);
            this.d = calendar.get(5);
        } else {
            this.f28467b = iB / 10000;
            this.f28466a = ((iB % 10000) / 100) - 1;
            this.d = iB % 100;
        }
        imx.e(this, this.f28467b, this.f28466a, this.d, this.y);
    }

    private void m() {
        LogUtil.a("StudentInfoActivity", "Enter showHeightSelectDialog.");
        UserInfomation userInfomation = new UserInfomation(0);
        userInfomation.setHeight(this.aa);
        imx.c(this, userInfomation, this.y);
    }

    private void q() {
        LogUtil.a("StudentInfoActivity", "Enter showWeightSelectDialog.");
        UserInfomation userInfomation = new UserInfomation(0);
        userInfomation.setWeight(this.ae);
        imx.d(this, userInfomation, this.y);
    }

    private void g() {
        k();
        this.ad = e(this.z.getGender());
        this.ab = CommonUtil.b(this.z.getBirthday(), 10);
        this.aa = this.z.getHeight();
        float weight = this.z.getWeight();
        this.ae = weight;
        LogUtil.d("StudentInfoActivity", "initStudentInfoView mStudentGender: ", Integer.valueOf(this.ad), ", mStudentBirthday: ", Integer.valueOf(this.ab), ", mStudentHeight: ", Integer.valueOf(this.aa), ", mStudentWeight: ", Float.valueOf(weight));
        d(this.ad);
        b(this.ab);
        a(this.aa);
        e(this.ae);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.d("StudentInfoActivity", "Enter refreshGenderView gender: ", Integer.valueOf(i));
        if (i == 0) {
            this.k.setText(this.j);
        } else if (i == 1) {
            this.k.setText(this.o);
        } else {
            this.k.setText(this.x);
        }
        this.k.setTextColor(this.f.getResources().getColor(R.color.textColorSecondary));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        LogUtil.d("StudentInfoActivity", "Enter refreshBirthdayView birthday: ", Integer.valueOf(i));
        if (i == -100) {
            this.g.setText(this.x);
            return;
        }
        this.f28467b = i / 10000;
        this.f28466a = ((i % 10000) / 100) - 1;
        this.d = i % 100;
        o();
    }

    private void o() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.f28467b, this.f28466a, this.d);
        this.g.setText(UnitUtil.a(calendar.getTime(), 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LogUtil.d("StudentInfoActivity", "Enter refreshHeightView height: ", Integer.valueOf(i));
        if (i <= 0) {
            this.r.setText(this.x);
            return;
        }
        if (UnitUtil.f()) {
            int[] iArr = {5, 7};
            if (i > 30) {
                int[] iArrG = UnitUtil.g(((double) i) / 100.0d);
                if (iArrG[0] > 0 && iArrG[1] >= 0) {
                    iArr = iArrG;
                }
            }
            this.m = iArr[0];
            this.p = iArr[1];
            this.r.setText(UnitUtil.e(this.m, 1, 0) + " " + this.f.getResources().getString(R.string.IDS_ft) + " " + UnitUtil.e(this.p, 1, 0) + " " + this.f.getResources().getString(R.string.IDS_ins));
            return;
        }
        this.r.setText(this.f.getResources().getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(i + 50, 1, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f) {
        LogUtil.d("StudentInfoActivity", "Enter refreshWeightView weight: ", Float.valueOf(f));
        if (f <= 0.0f) {
            this.ai.setText(this.x);
        } else if (UnitUtil.f()) {
            this.ai.setText(this.f.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_lb, UnitUtil.e(f + 22.0f, 1, 1)));
        } else {
            this.ai.setText(this.f.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_kg, UnitUtil.e(f + 10.0f, 1, 1)));
        }
    }

    private void a(int i) {
        LogUtil.d("StudentInfoActivity", "Enter initHeightView height: ", Integer.valueOf(i));
        if (i <= 0) {
            this.r.setText(this.x);
            return;
        }
        if (UnitUtil.f()) {
            int[] iArrG = {5, 7};
            if (i > 30) {
                iArrG = UnitUtil.g(((double) i) / 100.0d);
            }
            this.m = iArrG[0];
            this.p = iArrG[1];
            this.r.setText(UnitUtil.e(this.m, 1, 0) + " " + this.f.getResources().getString(R.string.IDS_ft) + " " + UnitUtil.e(this.p, 1, 0) + " " + this.f.getResources().getString(R.string.IDS_ins));
            return;
        }
        this.r.setText(getResources().getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(i, 1, 0)));
    }

    private void e(float f) {
        LogUtil.d("StudentInfoActivity", "Enter initWeightView height: ", Float.valueOf(f));
        if (f <= 0.0f) {
            this.ai.setText(this.x);
            return;
        }
        if (UnitUtil.f()) {
            this.ai.setText(this.f.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_lb, UnitUtil.e(UnitUtil.h(f), 1, 1)));
        } else {
            this.ai.setText(this.f.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_kg, UnitUtil.e(CommonUtil.a(String.valueOf(f)), 1, 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.z == null) {
            LogUtil.a("StudentInfoActivity", "saveStudentInfo student info is error.");
            c();
            return;
        }
        int iE = e();
        LogUtil.a("StudentInfoActivity", "saveStudentInfo studentInfoModifyType: ", Integer.valueOf(iE));
        if (iE == -1) {
            c();
            return;
        }
        lxc.e(iE, this.z);
        LocalBroadcastManager.getInstance().sendBroadcast(new Intent("com.huawei.bone.action.STUDENT_INFO_UPDATE"));
        if (h()) {
            LogUtil.a("StudentInfoActivity", "saveStudentInfo student age change.");
            nkv nkvVarB = nkd.c().b();
            if (nkvVarB != null) {
                nkvVarB.d(this.z.getAge());
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i) {
        if (UnitUtil.f()) {
            int[] iArr = {5, 7};
            if (i > 30) {
                int[] iArrG = UnitUtil.g(((double) i) / 100.0d);
                if (iArrG[0] > 0 && iArrG[1] >= 0) {
                    iArr = iArrG;
                }
            }
            int i2 = iArr[0];
            this.m = i2;
            this.p = iArr[1];
            this.aa = (int) Math.rint((UnitUtil.c(i2, 1) * 100.0d) + UnitUtil.c(this.p, 0));
            return;
        }
        this.aa = i + 50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        if (UnitUtil.f()) {
            this.ae = (float) UnitUtil.i(f + 22.0f);
        } else {
            this.ae = f + 10.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        CommonDialog21 commonDialog21;
        if (this.v == null) {
            LogUtil.a("StudentInfoActivity", "showLoadingDialog is domestic app.");
            new CommonDialog21(this.f, R.style.app_update_dialogActivity);
            this.v = CommonDialog21.b(this.f);
        }
        if (isFinishing() || (commonDialog21 = this.v) == null) {
            return;
        }
        commonDialog21.b(this.f.getString(R.string.IDS_sns_waiting));
        this.v.setCancelable(false);
        this.v.c();
        this.v.show();
    }

    private void c() {
        new Handler().postDelayed(new Runnable() { // from class: com.huawei.ui.main.stories.me.activity.StudentInfoActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (StudentInfoActivity.this.v == null || !StudentInfoActivity.this.v.isShowing()) {
                    return;
                }
                StudentInfoActivity.this.v.dismiss();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i, UserInfomation userInfomation) {
        if (i != 3) {
            return true;
        }
        int iB = CommonUtil.b(userInfomation.getBirthday(), 10);
        if (!c(iB / 10000, ((iB % 10000) / 100) - 1, iB % 100)) {
            return true;
        }
        qpx.b(this.f.getApplicationContext(), this.f.getResources().getString(R.string.IDS_hw_show_no_choose_birthday_after_now));
        return false;
    }

    private boolean c(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        if (i > i4) {
            return true;
        }
        if (i != i4 || i2 <= i5) {
            return i == i4 && i2 == i5 && i3 > i6;
        }
        return true;
    }

    private int e() {
        int i;
        int iE = e(this.z.getGender());
        int i2 = this.ad;
        if (iE != i2) {
            this.z.setGender(Integer.valueOf(e(i2)));
            i = 1;
        } else {
            i = -1;
        }
        int iB = CommonUtil.b(this.z.getBirthday(), 10);
        int i3 = this.ab;
        if (iB != i3) {
            this.z.setBirthday(String.valueOf(i3));
            i = 2;
        }
        int height = this.z.getHeight();
        int i4 = this.aa;
        if (height != i4) {
            this.z.setHeight(i4);
            i = 3;
        }
        float weight = this.z.getWeight();
        float f = this.ae;
        if (weight == f) {
            return i;
        }
        this.z.setWeight(f);
        return 4;
    }

    private boolean h() {
        int age = this.z.getAge();
        if (this.ac == age) {
            return false;
        }
        this.ac = age;
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
