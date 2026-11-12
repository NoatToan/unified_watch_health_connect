package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.common.Constant;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.main.R;
import defpackage.dnj;
import defpackage.dor;
import defpackage.drw;
import defpackage.dxm;
import defpackage.ean;
import defpackage.lmf;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.uvu;
import defpackage.uwe;
import defpackage.uwk;
import defpackage.vbs;
import defpackage.vei;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.CompileParameterUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class AddOrEditWeightUserActivity extends BaseActivity implements View.OnClickListener {
    private LinearLayout aa;
    private int ab;
    private uwk ac;
    private RelativeLayout ae;
    private RelativeLayout af;
    private CustomTitleBar ag;
    private SocialShareCenterApi ah;
    private RelativeLayout ai;
    private ImageView aj;
    private ImageView ak;
    private HealthTextView al;
    private dnj am;
    private HealthTextView an;
    private HealthTextView ao;
    private ImageView ap;
    private String aq;
    private ImageView ar;
    private HealthTextView as;
    private ImageView at;
    private float au;
    private ImageView av;
    private HealthTextView aw;
    private LinearLayout ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f27368b;
    private int bc;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f27369c;
    private Bitmap d;
    private HealthTextView e;
    private int f;
    private Context g;
    private uwe i;
    private HealthEditText j;
    private LinearLayout k;
    private HealthRadioButton m;
    private HealthRadioButton n;
    private HealthRadioButton o;
    private boolean p;
    private int q;
    private LinearLayout r;
    private ImageView s;
    private uvu t;
    private boolean u;
    private RelativeLayout z;
    private Dialog h = null;
    private boolean w = true;
    private boolean y = true;
    private boolean v = true;
    private boolean x = true;
    private Toast ad = null;
    private int l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f27367a = new c(this);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_weight_user_edit);
        this.g = this;
        final Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "intent is null");
            return;
        }
        c(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0 || AddOrEditWeightUserActivity.this.f27367a == null) {
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 0;
                messageObtain.obj = intent;
                AddOrEditWeightUserActivity.this.f27367a.sendMessage(messageObtain);
            }
        });
        View viewFindViewById = findViewById(R.id.hw_show_settings_info_layout);
        cancelAdaptRingRegion();
        setViewSafeRegion(false, viewFindViewById);
    }

    private void c(IBaseResponseCallback iBaseResponseCallback) {
        if (MultiUsersManager.INSTANCE.getEmptyUser() == null) {
            MultiUsersManager.INSTANCE.getOtherUserData(iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(0, "");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class c extends BaseHandler<AddOrEditWeightUserActivity> {
        c(AddOrEditWeightUserActivity addOrEditWeightUserActivity) {
            super(addOrEditWeightUserActivity);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AddOrEditWeightUserActivity addOrEditWeightUserActivity, Message message) {
            LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "handleMessageWhenReferenceNotNull()");
            if (addOrEditWeightUserActivity == null) {
                LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "handleMessageWhenReferenceNotNull obj == null !");
            } else {
                if (message.what != 0) {
                    return;
                }
                c(addOrEditWeightUserActivity, message);
            }
        }

        private CustomPermissionAction d(final AddOrEditWeightUserActivity addOrEditWeightUserActivity) {
            return new CustomPermissionAction(addOrEditWeightUserActivity) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.c.1
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "onGranted: MEDIA_VIDEO_IMAGES");
                    if (Build.VERSION.SDK_INT > 29) {
                        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "is up Android 11 version");
                        addOrEditWeightUserActivity.d();
                    } else {
                        uwk.a(addOrEditWeightUserActivity);
                    }
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    super.onForeverDenied(permissionType);
                    LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "onForeverDenied: MEDIA_VIDEO_IMAGES");
                }
            };
        }

        private CustomPermissionAction e(final AddOrEditWeightUserActivity addOrEditWeightUserActivity) {
            return new CustomPermissionAction(addOrEditWeightUserActivity) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.c.3
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "onGranted: CAMERA_IMAGE");
                    if (Build.VERSION.SDK_INT > 29) {
                        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "is up Android 11 version");
                        addOrEditWeightUserActivity.ab();
                    } else {
                        uwk.d(addOrEditWeightUserActivity);
                    }
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    super.onForeverDenied(permissionType);
                    LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "onForeverDenied: CAMERA_IMAGE");
                }
            };
        }

        private void c(AddOrEditWeightUserActivity addOrEditWeightUserActivity, Message message) {
            if (addOrEditWeightUserActivity == null || message == null) {
                LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "getUserInfo obj = null or msg = null");
                return;
            }
            if (!(message.obj instanceof Intent)) {
                LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "getUserInfo msg.obj not instanceof intent");
                return;
            }
            Intent intent = (Intent) message.obj;
            addOrEditWeightUserActivity.aq = intent.getStringExtra("weight_user_id_key");
            if (addOrEditWeightUserActivity.aq != null) {
                addOrEditWeightUserActivity.am = MultiUsersManager.INSTANCE.getSingleUserById(addOrEditWeightUserActivity.aq);
            } else {
                LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "handleMessageWhenReferenceNotNull obj.mUserId is null");
            }
            addOrEditWeightUserActivity.ah = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
            addOrEditWeightUserActivity.t = new uvu(addOrEditWeightUserActivity);
            addOrEditWeightUserActivity.ac = new uwk(addOrEditWeightUserActivity, d(addOrEditWeightUserActivity), e(addOrEditWeightUserActivity));
            addOrEditWeightUserActivity.p = intent.getBooleanExtra("claimWeightData", false);
            addOrEditWeightUserActivity.u = CommonUtils.j(intent.getStringExtra("from")) == 1;
            addOrEditWeightUserActivity.o();
            addOrEditWeightUserActivity.m();
            addOrEditWeightUserActivity.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        this.ah.takePhoto((Activity) this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        qrs.c((Activity) this.g, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.fitness_detail_titlebar);
        this.ag = customTitleBar;
        this.t.d(this.aq, customTitleBar);
        this.ag.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AddOrEditWeightUserActivity.this.ad != null) {
                    AddOrEditWeightUserActivity.this.ad.cancel();
                }
                if (AddOrEditWeightUserActivity.this.u) {
                    vei.d((Activity) AddOrEditWeightUserActivity.this, false);
                    AddOrEditWeightUserActivity.this.finish();
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("isChange", false);
                    AddOrEditWeightUserActivity.this.setResult(-1, intent);
                    AddOrEditWeightUserActivity.this.finish();
                }
            }
        });
        this.ag.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "click save user");
                if (!AddOrEditWeightUserActivity.this.n() || !AddOrEditWeightUserActivity.this.l()) {
                    AddOrEditWeightUserActivity.this.t();
                } else {
                    AddOrEditWeightUserActivity.this.u();
                }
            }
        });
        this.s = (ImageView) findViewById(R.id.weight_edit_user_photo);
        this.k = (LinearLayout) findViewById(R.id.hw_show_userinfo_gender_layout);
        this.r = (LinearLayout) findViewById(R.id.hw_show_userinfo_height_layout);
        this.f27368b = (LinearLayout) findViewById(R.id.hw_show_userinfo_birthday_layout);
        this.ax = (LinearLayout) findViewById(R.id.hw_show_userinfo_weight_layout);
        this.aa = (LinearLayout) findViewById(R.id.hw_show_userinfo_nickname_layout);
        this.an = (HealthTextView) findViewById(R.id.hw_show_userinfo_gender);
        this.ao = (HealthTextView) findViewById(R.id.hw_show_userinfo_height);
        this.al = (HealthTextView) findViewById(R.id.hw_show_userinfo_birthday);
        this.e = (HealthTextView) findViewById(R.id.hw_show_userinfo_age_hint);
        this.as = (HealthTextView) findViewById(R.id.hw_show_userinfo_nickname);
        this.aw = (HealthTextView) findViewById(R.id.hw_show_userinfo_weight);
        this.aj = (ImageView) findViewById(R.id.user_info_fragment_set_gender_image);
        this.ar = (ImageView) findViewById(R.id.user_info_fragment_set_height_image);
        this.ak = (ImageView) findViewById(R.id.user_info_fragment_set_birthday_image);
        this.ap = (ImageView) findViewById(R.id.user_info_fragment_set_nickname_image);
        this.at = (ImageView) findViewById(R.id.user_info_fragment_set_user_photo_image);
        this.av = (ImageView) findViewById(R.id.user_info_fragment_set_weight_image);
        this.f27369c = (HealthButton) findViewById(R.id.btn_edit_user_delete);
        this.z = (RelativeLayout) findViewById(R.id.hw_show_userinfo_user_photo_layout);
        if (vei.b(this)) {
            this.f27369c.setText(getString(R.string.IDS_hw_base_health_weight_delete_user).toUpperCase(Locale.ROOT));
        }
        r();
        this.t.c(this.am, this.f27369c);
    }

    private void r() {
        if (LanguageUtil.ba(this.g)) {
            this.ap.setImageResource(R.drawable.common_ui_arrow_left);
            this.at.setImageResource(R.drawable.common_ui_arrow_left);
            this.aj.setImageResource(R.drawable.common_ui_arrow_left);
            this.ar.setImageResource(R.drawable.common_ui_arrow_left);
            this.ak.setImageResource(R.drawable.common_ui_arrow_left);
            this.av.setImageResource(R.drawable.common_ui_arrow_left);
            return;
        }
        this.ap.setImageResource(R.drawable.common_ui_arrow_right);
        this.at.setImageResource(R.drawable.common_ui_arrow_right);
        this.aj.setImageResource(R.drawable.common_ui_arrow_right);
        this.ar.setImageResource(R.drawable.common_ui_arrow_right);
        this.ak.setImageResource(R.drawable.common_ui_arrow_right);
        this.av.setImageResource(R.drawable.common_ui_arrow_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.k.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.ax.setOnClickListener(this);
        this.f27368b.setOnClickListener(this);
        this.f27369c.setOnClickListener(this);
        this.z.setOnClickListener(this);
        this.aa.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.t.a(this.am, this.ao, this.y);
        j();
        dnj dnjVar = this.am;
        if (dnjVar != null) {
            this.d = dnjVar.k();
            this.as.setText(this.am.h());
            if (this.am.e() != 0) {
                this.q = this.am.e();
            }
            if (this.am.o() > 0.0f && !Float.isNaN(this.am.o())) {
                this.au = this.am.o();
            }
            h();
            vbs.d(this.am, null, this.s);
        } else {
            this.bc = 1992;
            this.f = 1;
            this.ab = 1;
            this.q = 160;
            this.au = 56.3f;
            q();
            Drawable drawable = BaseApplication.getContext().getResources().getDrawable(R.drawable.hw_health_ic_camera);
            if (drawable instanceof BitmapDrawable) {
                this.s.setImageBitmap(qqf.a(((BitmapDrawable) drawable).getBitmap()));
            } else {
                LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "initData drawable instanceof BitmapDrawable is false");
            }
        }
        k();
        if (CommonUtil.ab(this.g.getApplicationContext())) {
            return;
        }
        y();
    }

    private void h() {
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "parseInt2BirthdayDate()");
        this.bc = 1992;
        this.f = 1;
        this.ab = 1;
        if (this.am.j() != 0) {
            String strValueOf = String.valueOf(this.am.j());
            if (strValueOf.length() >= 4) {
                this.bc = qrs.a(strValueOf.subSequence(0, 4).toString());
            } else {
                LogUtil.e("HealthWeight_AddOrEditWeightUserActivity", "get year out of bounds, length is ", Integer.valueOf(strValueOf.length()));
            }
            if (strValueOf.length() >= 6) {
                this.ab = qrs.a(strValueOf.subSequence(4, 6).toString());
            } else {
                LogUtil.e("HealthWeight_AddOrEditWeightUserActivity", "get month out of bounds, length is ", Integer.valueOf(strValueOf.length()));
            }
            if (strValueOf.length() > 6) {
                this.f = qrs.a(strValueOf.subSequence(6, strValueOf.length()).toString());
            } else {
                LogUtil.e("HealthWeight_AddOrEditWeightUserActivity", "get day out of bounds, length is ", Integer.valueOf(strValueOf.length()));
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.bc, this.ab - 1, this.f);
            this.al.setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yMd")).format(calendar.getTime()));
            if (!Utils.o() && vbs.b(this.bc, this.ab - 1, this.f)) {
                this.e.setVisibility(0);
                return;
            } else {
                this.e.setVisibility(8);
                return;
            }
        }
        q();
    }

    private void j() {
        dnj dnjVar = this.am;
        byte bD = dnjVar == null ? (byte) 1 : dnjVar.d();
        if (this.w && this.am == null) {
            this.an.setText(R.string.IDS_device_wifi_userinfo_please_select);
            return;
        }
        if (bD == 0) {
            this.l = 0;
            this.an.setText(R.string.IDS_hw_show_set_default_gender_female);
        } else if (bD == 2) {
            this.l = 2;
            this.an.setText(R.string.IDS_hw_me_userinfo_secret);
        } else {
            this.l = 1;
            this.an.setText(R.string.IDS_hw_show_set_default_gender_male);
        }
    }

    private void k() {
        if (this.am == null) {
            float f = this.q / 100.0f;
            float fB = b(22.0f, b(f, f, 3), 3);
            this.au = fB;
            LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "userHeight:", Float.valueOf(f), "|weight:", Float.valueOf(fB));
            return;
        }
        a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.k) {
            v();
            return;
        }
        if (view == this.r) {
            this.y = false;
            this.ao.setTextColor(this.g.getResources().getColor(R.color.textColorSecondary));
            this.t.c(this.am, this.q, b());
            return;
        }
        if (view == this.f27368b) {
            this.v = false;
            this.al.setTextColor(this.g.getResources().getColor(R.color.textColorSecondary));
            s();
        } else {
            if (view == this.f27369c) {
                x();
                return;
            }
            if (view == this.z) {
                this.ac.e((Activity) this.g);
                return;
            }
            if (view == this.ax) {
                ac();
            } else if (view == this.aa) {
                this.as.setTextColor(this.g.getResources().getColor(R.color.textColorSecondary));
                b(this.am);
            }
        }
    }

    private void s() {
        HealthDatePickerDialog healthDatePickerDialog = new HealthDatePickerDialog(this, new HealthDatePickerDialog.DateSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.19
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public void onDateSelected(int i, int i2, int i3) {
                AddOrEditWeightUserActivity.this.bc = i;
                AddOrEditWeightUserActivity.this.ab = i2 + 1;
                AddOrEditWeightUserActivity.this.f = i3;
                if (vbs.a(i, i2, i3)) {
                    Toast.makeText(AddOrEditWeightUserActivity.this.g, AddOrEditWeightUserActivity.this.getString(R.string.IDS_hw_show_no_choose_birthday_after_now), 1).show();
                    return;
                }
                if (Utils.o() || !vbs.b(AddOrEditWeightUserActivity.this.bc, i2, AddOrEditWeightUserActivity.this.f)) {
                    AddOrEditWeightUserActivity.this.e.setVisibility(8);
                } else {
                    AddOrEditWeightUserActivity.this.e.setVisibility(0);
                }
                AddOrEditWeightUserActivity.this.q();
            }
        }, new GregorianCalendar(this.bc, this.ab - 1, this.f));
        Calendar calendar = Calendar.getInstance();
        healthDatePickerDialog.a(new GregorianCalendar(calendar.get(1) + Constant.BENEFITS_ACTIVE_CERTIFICATE_CHAIN_TIME_OUT, calendar.get(2), calendar.get(5)), new GregorianCalendar(calendar.get(1), calendar.get(2), calendar.get(5)));
        healthDatePickerDialog.b(true);
        healthDatePickerDialog.show();
    }

    private void v() {
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "showGenderPickerDialog()");
        this.w = false;
        this.an.setTextColor(this.g.getResources().getColor(R.color.textColorSecondary));
        View viewInflate = ((LayoutInflater) this.g.getSystemService("layout_inflater")).inflate(R.layout.hw_show_settings_gender_view, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.g);
        builder.a(getString(R.string.IDS_hw_show_set_gender)).d(viewInflate).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AddOrEditWeightUserActivity.this.w = true;
            }
        });
        this.h = builder.d();
        if (!b(viewInflate)) {
            LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "showGenderPickerDialog() dialog layout fail");
            this.h = null;
        } else {
            this.h.show();
        }
    }

    private boolean b(View view) {
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "initializeGenderDialogLayout()");
        if (view == null) {
            return false;
        }
        this.n = (HealthRadioButton) view.findViewById(R.id.settings_gender_imgview1);
        this.o = (HealthRadioButton) view.findViewById(R.id.settings_gender_imgview2);
        this.m = (HealthRadioButton) view.findViewById(R.id.settings_gender_secrect);
        this.ai = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout1);
        this.ae = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout2);
        this.af = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout_secrect);
        this.ai.setOnClickListener(new b(this));
        this.ae.setOnClickListener(new e(this));
        this.af.setOnClickListener(new a(this));
        b(this.l);
        return true;
    }

    private void b(int i) {
        if (i == 0) {
            this.n.setChecked(false);
            this.o.setChecked(true);
            this.m.setChecked(false);
        } else if (i == 1) {
            this.n.setChecked(true);
            this.o.setChecked(false);
            this.m.setChecked(false);
        } else if (i == 2) {
            this.n.setChecked(false);
            this.o.setChecked(false);
            this.m.setChecked(true);
        } else {
            this.n.setChecked(false);
            this.o.setChecked(false);
            this.m.setChecked(false);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements View.OnClickListener {
        private final WeakReference<AddOrEditWeightUserActivity> d;

        b(AddOrEditWeightUserActivity addOrEditWeightUserActivity) {
            this.d = new WeakReference<>(addOrEditWeightUserActivity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "MyMaleOnClickListener onClick()");
            AddOrEditWeightUserActivity addOrEditWeightUserActivity = this.d.get();
            if (addOrEditWeightUserActivity != null) {
                addOrEditWeightUserActivity.l = 1;
                addOrEditWeightUserActivity.n.setChecked(true);
                addOrEditWeightUserActivity.o.setChecked(false);
                addOrEditWeightUserActivity.m.setChecked(false);
                if (addOrEditWeightUserActivity.h != null) {
                    addOrEditWeightUserActivity.h.dismiss();
                }
                addOrEditWeightUserActivity.an.setText(R.string.IDS_hw_show_set_default_gender_male);
                return;
            }
            LogUtil.e("HealthWeight_AddOrEditWeightUserActivity", "MyMaleOnClickListener UserInfoActivity =null");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements View.OnClickListener {
        private final WeakReference<AddOrEditWeightUserActivity> e;

        e(AddOrEditWeightUserActivity addOrEditWeightUserActivity) {
            this.e = new WeakReference<>(addOrEditWeightUserActivity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "MyFemaleOnClickListener onClick()");
            AddOrEditWeightUserActivity addOrEditWeightUserActivity = this.e.get();
            if (addOrEditWeightUserActivity != null) {
                addOrEditWeightUserActivity.l = 0;
                addOrEditWeightUserActivity.n.setChecked(false);
                addOrEditWeightUserActivity.o.setChecked(true);
                addOrEditWeightUserActivity.m.setChecked(false);
                if (addOrEditWeightUserActivity.h != null) {
                    addOrEditWeightUserActivity.h.dismiss();
                }
                addOrEditWeightUserActivity.an.setText(R.string.IDS_hw_show_set_default_gender_female);
                return;
            }
            LogUtil.e("HealthWeight_AddOrEditWeightUserActivity", "MyFemaleOnClickListener UserInfoActivity is null");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<AddOrEditWeightUserActivity> f27387c;

        a(AddOrEditWeightUserActivity addOrEditWeightUserActivity) {
            this.f27387c = new WeakReference<>(addOrEditWeightUserActivity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "MySecretOnClickListener onClick()");
            AddOrEditWeightUserActivity addOrEditWeightUserActivity = this.f27387c.get();
            if (addOrEditWeightUserActivity != null) {
                addOrEditWeightUserActivity.l = 2;
                addOrEditWeightUserActivity.n.setChecked(false);
                addOrEditWeightUserActivity.o.setChecked(false);
                addOrEditWeightUserActivity.m.setChecked(true);
                if (addOrEditWeightUserActivity.h != null) {
                    addOrEditWeightUserActivity.h.dismiss();
                }
                addOrEditWeightUserActivity.an.setText(R.string.IDS_hw_me_userinfo_secret);
                addOrEditWeightUserActivity.w();
                return;
            }
            LogUtil.e("HealthWeight_AddOrEditWeightUserActivity", "MySecretOnClickListener UserInfoActivity =null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.g);
        builder.e(this.g.getString(R.string.IDS_hw_health_show_common_dialog_title)).a(this.g.getString(R.string.IDS_hwh_home_gender_change_remind_content)).b(this.g.getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.b().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.v && this.am == null) {
            this.al.setText(R.string.IDS_device_wifi_userinfo_please_select);
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.bc, this.ab - 1, this.f);
        this.al.setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yMd")).format(calendar.getTime()));
    }

    private IBaseResponseCallback b() {
        return new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.21
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj == null) {
                    LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "getHeightListener onResponse object is null");
                    return;
                }
                if (i == 0) {
                    try {
                        AddOrEditWeightUserActivity.this.a(((Integer) obj).intValue());
                        return;
                    } catch (ClassCastException e2) {
                        LogUtil.e("HealthWeight_AddOrEditWeightUserActivity", e2.getMessage());
                        return;
                    }
                }
                if (i != 1) {
                    LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "getHeightListener onResponse callbackCode ", Integer.valueOf(i));
                    return;
                }
                try {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    if (length < 2) {
                        LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "getHeightListener onResponse length ", Integer.valueOf(length));
                        return;
                    }
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    StringBuilder sb = new StringBuilder();
                    double d = i2;
                    sb.append(AddOrEditWeightUserActivity.this.getString(R.string.IDS_ft_string, new Object[]{UnitUtil.e(d, 1, 0)}));
                    sb.append(" ");
                    double d2 = i3;
                    sb.append(AddOrEditWeightUserActivity.this.getString(R.string.IDS_ins_string, new Object[]{UnitUtil.e(d2, 1, 0)}));
                    AddOrEditWeightUserActivity.this.ao.setText(sb.toString());
                    AddOrEditWeightUserActivity.this.q = (int) Math.rint((UnitUtil.c(d, 1) * 100.0d) + UnitUtil.c(d2, 0));
                } catch (ClassCastException e3) {
                    LogUtil.e("HealthWeight_AddOrEditWeightUserActivity", e3.getMessage());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        int i2 = i + 50;
        this.ao.setText(getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, new Object[]{UnitUtil.e(i2, 1, 0)}));
        this.q = i2;
    }

    private boolean p() {
        boolean z;
        boolean z2;
        boolean z3;
        String strTrim = this.as.getText().toString().trim();
        LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "editName is:", strTrim);
        boolean zEquals = strTrim.equals(this.g.getString(R.string.IDS_hw_base_health_pls_input_nick_name));
        if (this.am == null) {
            z = !this.an.getText().toString().trim().equals(this.g.getString(R.string.IDS_device_wifi_userinfo_please_select));
            z2 = !this.ao.getText().toString().trim().equals(this.g.getString(R.string.IDS_device_wifi_userinfo_please_select));
            z3 = !this.al.getText().toString().trim().equals(this.g.getString(R.string.IDS_device_wifi_userinfo_please_select));
        } else {
            z = true;
            z2 = true;
            z3 = true;
        }
        if (!zEquals && z && z2 && z3) {
            return true;
        }
        Toast toastMakeText = Toast.makeText(this.g, getString(R.string.IDS_hw_show_complete_privacy_wifi_tip), 0);
        this.ad = toastMakeText;
        toastMakeText.show();
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "isCompleteName:", Boolean.valueOf(!zEquals), "|isCompleteGender:", Boolean.valueOf(z), "|isCompleteHeight:", Boolean.valueOf(z2), "|isCompleteBirth", Boolean.valueOf(z3));
        if (zEquals) {
            this.as.setTextColor(this.g.getResources().getColor(R.color.me_rank_dec));
        }
        if (!z) {
            this.an.setTextColor(this.g.getResources().getColor(R.color.me_rank_dec));
        }
        if (!z2) {
            this.ao.setTextColor(this.g.getResources().getColor(R.color.me_rank_dec));
        }
        if (!z3) {
            this.al.setTextColor(this.g.getResources().getColor(R.color.me_rank_dec));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        String strTrim = this.as.getText().toString().trim();
        if (!p()) {
            LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "userinfo is not complete");
            return;
        }
        dnj dnjVarC = this.t.c(this.am, this.l);
        List<dnj> mainAllUser = MultiUsersManager.INSTANCE.getMainAllUser();
        for (int i = 0; i < mainAllUser.size(); i++) {
            if (strTrim.equals(mainAllUser.get(i).h()) && !strTrim.equals(dnjVarC.h())) {
                Toast toastMakeText = Toast.makeText(BaseApplication.getContext(), getString(R.string.IDS_hw_base_health_occupied_nick_name), 0);
                this.ad = toastMakeText;
                toastMakeText.show();
                return;
            }
        }
        dnj dnjVarB = this.t.b(dnjVarC);
        d(MultiUsersManager.INSTANCE.getMainAllUser().size() + 1);
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "user is current ", Boolean.valueOf(dnjVarB.q()));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.bc).append(String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.ab))).append(String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f)));
        dnjVarB.d(qrs.a(stringBuffer.toString()));
        dnjVarB.e(strTrim);
        dnjVarB.c(this.q);
        dnjVarB.d(this.d);
        if (!this.x) {
            dnjVarB.e(this.au);
            dnjVarB.d(this.au);
        }
        LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "setWeight:", Float.valueOf(this.au), "user.getUserInfoWeight():", Float.valueOf(dnjVarB.o()));
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            HashMap map = new HashMap();
            map.put("id", LoginInit.getInstance(this.g).getAccountInfo(1011));
            map.put("uid", dnjVarB.i());
            map.put(CommonConstant.KEY_GENDER, String.valueOf((int) (dnjVarB.d() != 2 ? dnjVarB.d() : (byte) 1)));
            map.put("age", String.valueOf(dor.a(dnjVarB.j(), dnjVarB.c())));
            map.put("height", String.valueOf(dnjVarB.e()));
            map.put("isDelete", String.valueOf(0));
            map.put("currentWeight", String.valueOf(dnjVarB.o()));
            map.put("month", String.valueOf(dor.e(dnjVarB.j())));
            ean.a(map, dnjVarB.g(), this.g);
        }
        e(dnjVarB.c(), dnjVarB.d());
        this.ag.setRightButtonClickable(false);
        e(dnjVarB);
    }

    private void e(int i, byte b2) {
        String str;
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("event", 3);
        if (i >= 14 && i <= 17) {
            str = "[14,17]";
        } else if (i >= 18 && i <= 23) {
            str = "[18,23]";
        } else if (i >= 24 && i <= 34) {
            str = "[24,34]";
        } else if (i >= 35 && i <= 44) {
            str = "[35,44]";
        } else if (i >= 45 && i <= 54) {
            str = "[45,54]";
        } else if (i >= 55 && i <= 64) {
            str = "[55,64]";
        } else if (i >= 65) {
            str = "[65,+)";
        } else {
            str = "(-,14]";
        }
        map.put("age", str);
        if (b2 == 2) {
            map.put(CommonConstant.KEY_GENDER, "Prefer not to say");
        } else if (b2 == 1) {
            map.put(CommonConstant.KEY_GENDER, "male");
        } else {
            map.put(CommonConstant.KEY_GENDER, "female");
        }
        lmf.d().c(this.g, AnalyticsValue.WEIGHT_PAGE_CKICK_MANAGE_MEMBERS_2160120.value(), map, 0);
    }

    private void e(final dnj dnjVar) {
        MultiUsersManager.INSTANCE.saveUser(dnjVar, new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.22
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.c("R_HealthWeight_AddOrEditWeightUserActivity", "saveSingleUser onResponse errorCode ", Integer.valueOf(i), " object ", obj, " mIsClaimWeightData ", Boolean.valueOf(AddOrEditWeightUserActivity.this.p), " mIsFromH5 ", Boolean.valueOf(AddOrEditWeightUserActivity.this.u));
                Intent intent = new Intent();
                if (!AddOrEditWeightUserActivity.this.p) {
                    if (AddOrEditWeightUserActivity.this.u) {
                        vei.d((Activity) AddOrEditWeightUserActivity.this, true);
                    } else {
                        intent.putExtra("isChange", true);
                        AddOrEditWeightUserActivity.this.setResult(-1, intent);
                    }
                } else {
                    intent.putExtra(HwPayConstant.KEY_USER_ID, dnjVar.i());
                    AddOrEditWeightUserActivity.this.setResult(1, intent);
                }
                if (AddOrEditWeightUserActivity.this.c(dnjVar)) {
                    AddOrEditWeightUserActivity.this.d(dnjVar);
                }
                AddOrEditWeightUserActivity.this.aa();
                AddOrEditWeightUserActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: unk
            @Override // java.lang.Runnable
            public final void run() {
                this.f50402a.e();
            }
        });
    }

    public /* synthetic */ void e() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10026);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setForceSync(true);
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).synCloud(hiSyncOption, new HiCommonListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.24
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                ReleaseLogUtil.c("HealthWeight_AddOrEditWeightUserActivity", "syncUser onSuccess errorCode ", Integer.valueOf(i), " object ", obj);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                ReleaseLogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "syncUser onFailure errorCode ", Integer.valueOf(i), " object ", obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(dnj dnjVar) {
        if (dnjVar == null || !dnjVar.s()) {
            return false;
        }
        int iJ = dnjVar.j();
        return vbs.b(iJ / 10000, ((iJ % 10000) / 100) - 1, iJ % 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(dnj dnjVar) {
        if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "update_child_height_time" + dnjVar.i()))) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "update_child_height_time" + dnjVar.i(), "" + System.currentTimeMillis(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        HashMap map = new HashMap();
        map.put("userCount", Integer.valueOf(i));
        lmf.d().c(this, AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_WEIGHT_USERCOUNT_2030051.value(), map, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            d(intent);
            return;
        }
        if (i == 3) {
            a(intent);
            return;
        }
        if (i != 4) {
            switch (i) {
                case 11:
                    if (this.ac != null) {
                        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "data=", intent);
                        this.ac.d(i2, intent);
                    } else {
                        LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "mSelectPhotoInteractor is null");
                    }
                    break;
                case 12:
                    LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "take complete,preprare to cutting,data =", intent, ", requestCode = ", Integer.valueOf(i));
                    b(intent);
                    break;
                case 13:
                    if (intent != null && this.ac != null) {
                        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "select data=", intent);
                        this.ac.e(intent.getData());
                    } else {
                        LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "data is null ", Boolean.valueOf(intent == null));
                    }
                    break;
                case 14:
                    LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "pick complete,preprare to cutting,data =", intent, ", requestCode = ", Integer.valueOf(i));
                    if (intent == null) {
                        uwk.a((Activity) this.g);
                    } else {
                        b(intent);
                    }
                    break;
                default:
                    LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "default");
                    break;
            }
            return;
        }
        this.ah.startCrop((Activity) this.g);
    }

    private void d(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (AddOrEditWeightUserActivity.this.ah == null || AddOrEditWeightUserActivity.this.isFinishing() || AddOrEditWeightUserActivity.this.isDestroyed()) {
                    return;
                }
                AddOrEditWeightUserActivity.this.ah.startCrop(AddOrEditWeightUserActivity.this, intent);
            }
        });
    }

    private void a(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.1
            @Override // java.lang.Runnable
            public void run() {
                AddOrEditWeightUserActivity.this.e(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "dealCropResult");
        if (intent == null) {
            LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "data = null");
            return;
        }
        String stringExtra = intent.getStringExtra("bitmap");
        if (stringExtra == null) {
            LogUtil.e("HealthWeight_AddOrEditWeightUserActivity", "dealCropResult:bitmapPath from intent is null!");
            return;
        }
        LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "dealCropResult bitmapPath = ", stringExtra);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmapA = qqf.a(qqf.b(qqf.c(stringExtra, options), 300, 300));
        this.d = bitmapA;
        if (bitmapA != null) {
            LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "mBitmap != null");
            runOnUiThread(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "refresh mBitmap");
                    AddOrEditWeightUserActivity.this.s.setImageDrawable(new BitmapDrawable(AddOrEditWeightUserActivity.this.g.getResources(), AddOrEditWeightUserActivity.this.d));
                }
            });
            b(stringExtra);
            return;
        }
        LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "dealCropResult:bitmap is null");
    }

    private void b(String str) {
        FileUtils.b(new File(str));
    }

    public void b(Intent intent) {
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "setPicToView");
        if (intent == null || this.ac.e() == null) {
            return;
        }
        Bitmap bitmapC = c(this.ac.e().getPath());
        this.d = bitmapC;
        if (bitmapC != null) {
            LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "setPicToView mBitmap != null");
            Bitmap bitmapB = qqf.b(this.d, 300, 300);
            this.d = bitmapB;
            this.s.setImageBitmap(qqf.a(bitmapB));
        }
    }

    private Bitmap c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "path is null");
            return null;
        }
        if (!new File(str).exists()) {
            return null;
        }
        Bitmap bitmapC = qqf.c(str, 200);
        if (bitmapC == null) {
            LogUtil.j("HealthWeight_AddOrEditWeightUserActivity", "getThumbnailImage is null");
            return bitmapC;
        }
        return qqf.a(bitmapC);
    }

    private void x() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.g);
        builder.a(this.g.getString(R.string.IDS_hw_base_health_weight_confirm_delete_user)).d(this.g.getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).a(this.g.getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
                    HashMap map = new HashMap();
                    map.put("id", LoginInit.getInstance(AddOrEditWeightUserActivity.this.g).getAccountInfo(1011));
                    map.put("uid", AddOrEditWeightUserActivity.this.am.i());
                    map.put("isDelete", String.valueOf(1));
                    ean.a(map, AddOrEditWeightUserActivity.this.am.g(), AddOrEditWeightUserActivity.this.g);
                }
                if (AddOrEditWeightUserActivity.this.am.g() != null && AddOrEditWeightUserActivity.this.am.g().length() != 0) {
                    MultiUsersManager.INSTANCE.setUuidBySid(AddOrEditWeightUserActivity.this.am.g(), "delete");
                }
                AddOrEditWeightUserActivity.this.d(MultiUsersManager.INSTANCE.getMainAllUser().size() - 1);
                WeightDataManager.INSTANCE.getUserWeightDataMap().remove(AddOrEditWeightUserActivity.this.am.i());
                WeightDataManager.INSTANCE.setInitFlag(true);
                if (AddOrEditWeightUserActivity.this.f27367a != null) {
                    AddOrEditWeightUserActivity addOrEditWeightUserActivity = AddOrEditWeightUserActivity.this;
                    addOrEditWeightUserActivity.i = new uwe((Activity) addOrEditWeightUserActivity.g, AddOrEditWeightUserActivity.this.f27367a);
                }
                AddOrEditWeightUserActivity.this.i.b(AddOrEditWeightUserActivity.this.t.b(AddOrEditWeightUserActivity.this.am.i()));
                MultiUsersManager.INSTANCE.deleteUser(AddOrEditWeightUserActivity.this.am.i(), AddOrEditWeightUserActivity.this.am.q(), new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.4.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        ReleaseLogUtil.c("R_HealthWeight_AddOrEditWeightUserActivity", "showDeleteDialog onResponse errorCode ", Integer.valueOf(i), " object ", obj, " mIsFromH5 ", Boolean.valueOf(AddOrEditWeightUserActivity.this.u));
                        if (AddOrEditWeightUserActivity.this.u) {
                            vei.d((Activity) AddOrEditWeightUserActivity.this, true);
                            AddOrEditWeightUserActivity.this.finish();
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("isDelUser", true);
                        EventBus.a(new EventBus.d("evebus_weight_measure_notification", intent));
                        intent.putExtra("isChange", true);
                        AddOrEditWeightUserActivity.this.setResult(-1, intent);
                        AddOrEditWeightUserActivity.this.finish();
                    }
                });
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "showModifyConfirmDialog() enter");
        View viewInflate = View.inflate(this, R.layout.dialog_confirm_user_info, null);
        ((HealthCheckBox) viewInflate.findViewById(R.id.confirm_userinfo_dialog_box)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.10
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "modifyConfirmDialog onClick not remind");
                StorageParams storageParams = new StorageParams();
                if (z) {
                    SharedPreferenceManager.e(AddOrEditWeightUserActivity.this.g, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_userinfo_modify_agree", String.valueOf(false), storageParams);
                } else {
                    SharedPreferenceManager.e(AddOrEditWeightUserActivity.this.g, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_userinfo_modify_agree", "true", storageParams);
                }
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.g);
        builder.d(viewInflate).c(this.g.getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).a(this.g.getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AddOrEditWeightUserActivity.this.t();
            }
        });
        builder.d().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        ArrayList<String> arrayListA = drw.e().a();
        boolean z = (arrayListA == null || arrayListA.size() == 0) ? false : true;
        if (dxm.g()) {
            z = true;
        }
        return z && !String.valueOf(false).equals(SharedPreferenceManager.e(this.g, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_userinfo_modify_agree"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        dnj dnjVar = this.am;
        if (dnjVar == null) {
            return false;
        }
        byte bD = dnjVar.d();
        int iE = this.am.e();
        int iJ = this.am.j();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.bc).append(String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.ab))).append(String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f)));
        return (bD == this.l && iE == this.q && iJ == qrs.a(stringBuffer.toString())) ? false : true;
    }

    private void y() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.g);
        builder.e(getString(R.string.IDS_hw_health_show_common_dialog_title)).a(getString(R.string.IDS_hw_show_set_about_privacy_connectting_error)).b(getString(R.string.IDS_hw_health_show_common_dialog_ok_button), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AddOrEditWeightUserActivity.this.finish();
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
        customTextAlertDialogB.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Toast toast = this.ad;
        if (toast != null) {
            toast.cancel();
        }
        if (this.u) {
            vei.d((Activity) this, false);
        } else {
            Intent intent = new Intent();
            intent.putExtra("isChange", false);
            setResult(-1, intent);
        }
        finish();
        super.onBackPressed();
    }

    private void b(dnj dnjVar) {
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "showEditNickNameDialog enter");
        View viewInflate = View.inflate(this, R.layout.commonui_dialog_single_edit, null);
        HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(R.id.edit);
        this.j = healthEditText;
        healthEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        if (dnjVar != null) {
            this.j.setText(dnjVar.h());
            this.j.setSelection(dnjVar.h().length());
        }
        this.j.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.11
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 4 || i == 6) {
                    return true;
                }
                return keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0;
            }
        });
        d(viewInflate);
        Handler handler = this.f27367a;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.12
                @Override // java.lang.Runnable
                public void run() {
                    AddOrEditWeightUserActivity.this.z();
                    LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "setFocusable");
                    AddOrEditWeightUserActivity.this.j.setFocusable(true);
                    AddOrEditWeightUserActivity.this.j.setFocusableInTouchMode(true);
                    AddOrEditWeightUserActivity.this.j.requestFocus();
                }
            }, 100L);
        }
    }

    private void d(View view) {
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.g).b(R.string.IDS_activity_personal_information_name).d(view).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        }).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (TextUtils.isEmpty(AddOrEditWeightUserActivity.this.j.getText().toString().trim())) {
                    return;
                }
                AddOrEditWeightUserActivity.this.as.setText(AddOrEditWeightUserActivity.this.j.getText().toString().trim());
            }
        }).d();
        customViewDialogD.setCanceledOnTouchOutside(false);
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        ((InputMethodManager) this.g.getSystemService("input_method")).toggleSoftInput(0, 2);
    }

    private void a() {
        dnj dnjVar = this.am;
        if (dnjVar == null) {
            g();
            return;
        }
        LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "muser weight is:", Float.valueOf(this.au), "mUser.getUserInfoWeight():", Float.valueOf(dnjVar.o()));
        if (this.am.o() <= 0.0f || Float.isNaN(this.am.o())) {
            float f = this.q / 100.0f;
            this.au = b(22.0f, b(f, f, 3), 3);
            return;
        }
        float fO = this.am.o();
        this.au = fO;
        String strB = vei.b(UnitUtil.a(fO), 1);
        LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "muser user weightStr is:", strB);
        this.aw.setText(strB);
    }

    private void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "endTime:", Long.valueOf(jCurrentTimeMillis));
        String[] strArr = {BleConstants.WEIGHT_KEY};
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(HiDateUtil.p(0L), HiDateUtil.g(jCurrentTimeMillis));
        hiAggregateOption.setTimeRange(0L, jCurrentTimeMillis);
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter(this.am.i());
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setCount(1);
        HiHealthManager.d(this.g).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.18
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (list == null || list.size() <= 0) {
                    LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "datas is null");
                    float fE = AddOrEditWeightUserActivity.this.am.e() / 100.0f;
                    float fB = AddOrEditWeightUserActivity.this.b(fE, fE, 3);
                    AddOrEditWeightUserActivity addOrEditWeightUserActivity = AddOrEditWeightUserActivity.this;
                    addOrEditWeightUserActivity.au = addOrEditWeightUserActivity.b(22.0f, fB, 3);
                    LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "user weight is:", new DecimalFormat("#.0").format(AddOrEditWeightUserActivity.this.au));
                    return;
                }
                float f = (float) list.get(0).getDouble("bodyWeight");
                AddOrEditWeightUserActivity.this.au = f;
                if (0.0f != AddOrEditWeightUserActivity.this.au) {
                    AddOrEditWeightUserActivity.this.am.e(AddOrEditWeightUserActivity.this.au);
                }
                LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "aggregateHiHealthData user weight is:", Float.valueOf(f));
                AddOrEditWeightUserActivity.this.b(f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        String strB = vei.b(UnitUtil.a(f), 1);
        this.aw.setText(strB);
        LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "muser user weightStr is:", strB);
    }

    private void f() {
        if (this.am == null) {
            float f = this.q / 100.0f;
            this.au = b(22.0f, b(f, f, 3), 3);
        }
    }

    private void ac() {
        f();
        View viewInflate = View.inflate(this, R.layout.health_healthdata_userinfo_multiuserweight_dialog, null);
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_multiuserWeight_dialog_tips)).setText(this.g.getString(R.string.IDS_device_wifi_multiuserweight_dialog_tips));
        final HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.multiuserweight_number_picker);
        e(healthNumberPicker, c());
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.g);
        builder.a(this.g.getString(R.string.IDS_hw_health_show_healthdata_weight)).d(viewInflate).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HealthWeight_AddOrEditWeightUserActivity", "get weight wselect=", Float.valueOf(healthNumberPicker.getValue() / 10.0f));
                AddOrEditWeightUserActivity.this.aw.setText(vei.b(AddOrEditWeightUserActivity.this.b(healthNumberPicker.getValue() / 10.0f, (float) UnitUtil.a(10.0f), 1), 1));
                int iE = UnitUtil.e();
                if (iE == 1) {
                    AddOrEditWeightUserActivity addOrEditWeightUserActivity = AddOrEditWeightUserActivity.this;
                    addOrEditWeightUserActivity.au = (float) UnitUtil.b(addOrEditWeightUserActivity.b(healthNumberPicker.getValue() / 10.0f, (float) UnitUtil.j(10.0d), 1));
                } else if (iE == 3) {
                    AddOrEditWeightUserActivity addOrEditWeightUserActivity2 = AddOrEditWeightUserActivity.this;
                    addOrEditWeightUserActivity2.au = (float) UnitUtil.i(addOrEditWeightUserActivity2.b(healthNumberPicker.getValue() / 10.0f, (float) UnitUtil.h(10.0d), 1));
                } else {
                    AddOrEditWeightUserActivity addOrEditWeightUserActivity3 = AddOrEditWeightUserActivity.this;
                    addOrEditWeightUserActivity3.au = addOrEditWeightUserActivity3.b(healthNumberPicker.getValue() / 10.0f, 10.0f, 1);
                }
                AddOrEditWeightUserActivity.this.x = false;
            }
        }).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.d().show();
    }

    private void e(HealthNumberPicker healthNumberPicker, ArrayList<String> arrayList) {
        healthNumberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[arrayList.size()]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayList.size() - 1);
        float fB = b(b((float) UnitUtil.a(this.au), (float) UnitUtil.a(10.0f), 2), 10.0f, 3);
        int i = (int) fB;
        LogUtil.d("HealthWeight_AddOrEditWeightUserActivity", "get weight:", Float.valueOf(this.au), "|floatValue:", Float.valueOf(fB), "|value:", Integer.valueOf(i));
        healthNumberPicker.setValue(i);
    }

    private ArrayList<String> c() {
        ArrayList<String> arrayList = new ArrayList<>();
        float f = 10;
        int iC = (int) (((float) UnitUtil.c(250.0d)) * f);
        for (int iC2 = (int) (((float) UnitUtil.c(10.0d)) * f); iC2 < iC; iC2++) {
            arrayList.add(vei.b(iC2 / f, 1));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float b(float f, float f2, int i) {
        BigDecimal bigDecimal = new BigDecimal(Float.toString(f));
        BigDecimal bigDecimal2 = new BigDecimal(Float.toString(f2));
        if (i == 1) {
            return bigDecimal.add(bigDecimal2).floatValue();
        }
        if (i == 2) {
            return bigDecimal.subtract(bigDecimal2).floatValue();
        }
        if (i == 3) {
            return bigDecimal.multiply(bigDecimal2).floatValue();
        }
        if (i != 4) {
            return -1.0f;
        }
        return bigDecimal.divide(bigDecimal2, 10, 4).floatValue();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
