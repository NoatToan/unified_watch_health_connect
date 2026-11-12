package com.huawei.ui.device.activity.notification;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.notification.NotificationBaseActivity;
import com.huawei.ui.device.activity.notification.adapter.NotificationAppAdapter;
import com.huawei.ui.device.activity.notification.adapter.NotificationHeaderAdapter;
import com.huawei.ui.device.activity.notification.data.storage.NotificationResult;
import com.huawei.ui.device.activity.notification.viewmodel.NotificationViewModel;
import defpackage.iov;
import defpackage.lmf;
import defpackage.lmq;
import defpackage.lvi;
import defpackage.lzj;
import defpackage.mgg;
import defpackage.mir;
import defpackage.njy;
import defpackage.qqz;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qxn;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationBaseActivity extends BaseActivity implements NotificationAppAdapter.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected NotificationHeaderAdapter f24522a;
    private int ac;
    private View ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthRecycleView f24523b;
    protected View d;
    protected View e;
    protected HealthTextView f;
    protected View g;
    protected HealthSwitchButton h;
    protected LinearLayout i;
    protected HealthTextView j;
    protected NotificationViewModel l;
    private View m;
    protected NotificationAppAdapter n;
    private ConcatAdapter o;
    private HealthRadioButton p;
    private TextView q;
    private HealthRadioButton r;
    private TextView u;
    private CompoundButton.OnCheckedChangeListener v;
    private HealthSearchView w;
    private TextView x;
    private View y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f24524c = "";
    private boolean s = true;
    private String t = "";
    private final BroadcastReceiver k = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("NotificationBaseActivity", "mAppInstalledReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action)) {
                NotificationBaseActivity.this.l.t();
            }
        }
    };

    public static /* synthetic */ void b(DialogInterface dialogInterface, int i) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("NotificationBaseActivity", "onCreate");
        setContentView(R.layout.notification_setting_layout);
        Intent intent = getIntent();
        if (intent != null) {
            this.f24524c = intent.getStringExtra("device_id");
        }
        i();
        n();
        d();
        r();
        f();
        DeviceInfo deviceInfoC = mgg.c("NotificationBaseActivity");
        if (deviceInfoC != null) {
            this.t = lvi.e(deviceInfoC.getProductType(), deviceInfoC.getDeviceName(), false);
        }
    }

    private void r() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.k, intentFilter);
    }

    protected void i() {
        o();
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.notification_app_list);
        this.f24523b = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this));
        this.e = LayoutInflater.from(this).inflate(R.layout.notification_setting_list_header, (ViewGroup) this.f24523b, false);
        this.f24522a = new NotificationHeaderAdapter(this.e);
        NotificationAppAdapter notificationAppAdapter = new NotificationAppAdapter(this, new NotificationAppAdapter.DiffUtilCallBack());
        this.n = notificationAppAdapter;
        notificationAppAdapter.c(this);
        this.o = new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this.f24522a, this.n});
        this.w = (HealthSearchView) qsp.a(this.e, R.id.notification_search_view);
        this.p = (HealthRadioButton) qsp.a(this.e, R.id.radiobutton_sync_mode_multi);
        this.r = (HealthRadioButton) qsp.a(this.e, R.id.radiobutton_sync_mode_single);
        qsp.a(this.e, R.id.rl_notify_sync_mode_multi).setOnClickListener(new View.OnClickListener() { // from class: qxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46930b.d(view);
            }
        });
        qsp.a(this.e, R.id.rl_notify_sync_mode_single).setOnClickListener(new View.OnClickListener() { // from class: qwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        });
        this.d = qsp.a(this.e, R.id.ll_app_list_area);
        this.m = qsp.a(this.e, R.id.ll_app_list_empty);
        this.y = qsp.a(this.e, R.id.LL_notify_sync_mode_layour);
        this.ad = qsp.a(this.e, R.id.phone_status_title_harmony);
        TextView textView = (TextView) qsp.a(this.e, R.id.notification_push_open_description);
        this.u = textView;
        textView.setText(CommonUtil.bg() ? R.string.IDS_device_msgnotif_emui_auth_right : R.string.IDS_device_msgnotif_open);
        this.x = (TextView) qsp.a(this.e, R.id.notify_reminder_switch_harmony_more);
        this.i = (LinearLayout) qsp.a(this.e, R.id.notification_push_error_tip_layout);
        this.f = (HealthTextView) qsp.a(this.e, R.id.notification_open_error_tip_text);
        this.j = (HealthTextView) qsp.a(this.e, R.id.notification_error_info_text);
        this.h = (HealthSwitchButton) qsp.a(this.e, R.id.switch_button_notification);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda12
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f24525b.d(compoundButton, z);
            }
        };
        this.v = onCheckedChangeListener;
        this.h.setOnCheckedChangeListener(onCheckedChangeListener);
        j();
        this.h.setOnTouchListener(new View.OnTouchListener() { // from class: qwy
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return NotificationBaseActivity.c(view, motionEvent);
            }
        });
        this.r.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda14
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.d.b(compoundButton, z);
            }
        });
        this.p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda15
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f24526b.c(compoundButton, z);
            }
        });
        HealthSearchView healthSearchView = this.w;
        if (healthSearchView == null) {
            return;
        }
        healthSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity.5
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                return false;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                NotificationBaseActivity.this.l.d(str);
                return true;
            }
        });
        c();
        b();
    }

    public /* synthetic */ void d(View view) {
        this.p.setChecked(true);
    }

    public /* synthetic */ void a(View view) {
        this.r.setChecked(true);
    }

    /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
        if (!z) {
            t();
            return;
        }
        e(Boolean.valueOf(z));
        this.h.setEnabled(false);
        this.l.b(z);
        qxn.c(this, 1);
    }

    public static /* synthetic */ boolean c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || !qrs.c(800)) {
            return false;
        }
        LogUtil.j("NotificationBaseActivity", "click too fast");
        return true;
    }

    /* synthetic */ void b(CompoundButton compoundButton, boolean z) {
        LogUtil.j("NotificationBaseActivity", "mModeSingle check:", Boolean.valueOf(z));
        if (z) {
            this.p.setChecked(false);
            this.r.setChecked(true);
            if (this.ac == 0) {
                this.r.setEnabled(false);
                this.p.setEnabled(false);
                this.l.b(1);
            }
        }
    }

    /* synthetic */ void c(CompoundButton compoundButton, boolean z) {
        LogUtil.j("NotificationBaseActivity", "mModeMulti check:", Boolean.valueOf(z));
        if (z) {
            this.r.setChecked(false);
            this.p.setChecked(true);
            if (this.ac == 1) {
                this.r.setEnabled(false);
                this.p.setEnabled(false);
                this.l.b(0);
            }
        }
    }

    private void j() {
        TextView textView = (TextView) qsp.a(this.e, R.id.notification_select_all);
        this.q = textView;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: qxd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.e(view);
                }
            });
        }
    }

    public /* synthetic */ void e(View view) {
        if (CommonUtil.at() && this.s && !this.l.o()) {
            s();
        } else {
            this.l.a(this.s);
        }
    }

    private void s() {
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this).d(R.string.IDS_common_enable_button, new DialogInterface.OnClickListener() { // from class: qxi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f46931b.c(dialogInterface, i);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new DialogInterface.OnClickListener() { // from class: qxj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NotificationBaseActivity.b(dialogInterface, i);
            }
        }).d(R.string.IDS_open_notification_part_app_permisson_title).e(getString(R.string.IDS_open_notification_part_app_permisson_content)).b();
        customAlertDialogB.setCancelable(false);
        if (customAlertDialogB.isShowing()) {
            return;
        }
        customAlertDialogB.show();
    }

    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.l.a(this.s);
    }

    private void o() {
        ImageView imageView = (ImageView) findViewById(R.id.notification_setting_back);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: qxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
        imageView.setImageDrawable(qqz.c(BaseApplication.b(), R.drawable.ic_backward_arrow));
        this.g = findViewById(R.id.notification_setting_title);
    }

    public /* synthetic */ void b(View view) {
        onBackPressed();
    }

    protected void c() {
        String string = getResources().getString(R.string.IDS_device_msgnotif_auth_method);
        String string2 = getResources().getString(R.string.IDS_device_msgnotif_tip_open_error, string);
        SpannableString spannableString = new SpannableString(string2);
        int length = string2.length();
        int length2 = string.length();
        qri.d(spannableString, length - length2, spannableString.toString().length(), new ClickableSpan() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                NotificationBaseActivity.this.k();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                if (textPaint != null) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(NotificationBaseActivity.this.getResources().getColor(R.color.self_discovery_text_orange));
                    textPaint.setUnderlineText(false);
                }
            }
        });
        this.f.setMovementMethod(LinkMovementMethod.getInstance());
        this.f.setHighlightColor(getResources().getColor(android.R.color.transparent));
        this.f.setText(spannableString);
    }

    protected void b() {
        String string = getResources().getString(R.string.IDS_device_msgnotif_auth_method);
        String strConcat = getResources().getString(R.string.IDS_device_notification_not_receive_solution_text).concat(string);
        SpannableString spannableString = new SpannableString(strConcat);
        int length = strConcat.length();
        int length2 = string.length();
        qri.d(spannableString, length - length2, spannableString.toString().length(), new ClickableSpan() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                NotificationBaseActivity.this.k();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                if (textPaint != null) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(NotificationBaseActivity.this.getResources().getColor(R.color.self_discovery_text_orange));
                    textPaint.setUnderlineText(false);
                }
            }
        });
        this.j.setMovementMethod(LinkMovementMethod.getInstance());
        this.j.setHighlightColor(getResources().getColor(android.R.color.transparent));
        this.j.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(this, AnalyticsValue.NOTIFY_ERROR_ALERT_1090014.value(), map, 0);
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", this.l.e(this.h.isChecked()));
        intent.putExtra(Constants.JUMP_MODE_KEY, 0);
        startActivity(intent);
    }

    private void t() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(getString(R.string.IDS_nottification_close_remind));
        builder.c(R.string.IDS_notification_authorized_turn_off, new View.OnClickListener() { // from class: qxb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46927a.h(view);
            }
        });
        builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qxe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.j(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void h(View view) {
        LogUtil.a("NotificationBaseActivity", "showAuthorizeDialog closed click");
        e((Boolean) false);
        this.h.setEnabled(false);
        this.l.b(false);
        qxn.c(this, 0);
    }

    public /* synthetic */ void j(View view) {
        LogUtil.a("NotificationBaseActivity", "showAuthorizeDialog cancel click");
        this.h.setChecked(true);
        this.h.setEnabled(true);
    }

    private void g() {
        HealthSearchView healthSearchView = this.w;
        if (healthSearchView == null || healthSearchView.getParent() == null) {
            return;
        }
        health.compact.a.util.LogUtil.a("NotificationBaseActivity", "clearSearchViewFocus ");
        this.w.clearFocus();
    }

    private void n() {
        NotificationViewModel notificationViewModel = (NotificationViewModel) new ViewModelProvider(this, new ViewModelProvider.Factory() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity.4
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> cls) {
                return (T) Objects.requireNonNull(cls.cast(new NotificationViewModel(NotificationBaseActivity.this.getApplication())));
            }
        }).get(NotificationViewModel.class);
        this.l = notificationViewModel;
        notificationViewModel.c(this.f24524c);
        LogUtil.a("NotificationBaseActivity", "ViewModel初始化成功");
    }

    protected void d() {
        NotificationViewModel notificationViewModel = this.l;
        if (notificationViewModel == null) {
            LogUtil.j("NotificationBaseActivity", "ViewModel为空，跳过观察者设置");
            return;
        }
        notificationViewModel.d().observe(this, new Observer() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda17
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f24527c.a((List<lzj>) obj);
            }
        });
        this.l.e().observe(this, new Observer() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda18
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.b((Boolean) obj);
            }
        });
        this.l.g().observe(this, new Observer() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda19
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.e((Boolean) obj);
            }
        });
        this.l.j().observe(this, new Observer() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda20
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.d((Integer) obj);
            }
        });
        this.l.i().observe(this, new Observer() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda21
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.e((List<Boolean>) obj);
            }
        });
        this.l.a().observe(this, new Observer() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda22
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f24528b.d((Boolean) obj);
            }
        });
        this.l.c().observe(this, new Observer() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda23
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f24529c.b((NotificationResult) obj);
            }
        });
        this.l.n().observe(this, new Observer() { // from class: com.huawei.ui.device.activity.notification.NotificationBaseActivity$$ExternalSyntheticLambda24
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.b((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Integer num) {
        LogUtil.a("NotificationBaseActivity", "showSyncLayout", num);
        if (num == null || num.intValue() == 0) {
            this.y.setVisibility(8);
            this.ad.setVisibility(8);
        } else {
            this.x.setText(getString(num.intValue() == 2 ? R.string.IDS_notify_sync_mode_single_desc_2 : R.string.IDS_notify_sync_mode_single_desc_3));
            this.y.setVisibility(0);
            this.ad.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.notification.NotificationBaseActivity$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24532a;

        static {
            int[] iArr = new int[NotificationResult.values().length];
            f24532a = iArr;
            try {
                iArr[NotificationResult.SET_NOTIFICATION_STATUS_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(NotificationResult notificationResult) {
        if (notificationResult == null) {
            return;
        }
        if (AnonymousClass7.f24532a[notificationResult.ordinal()] == 1) {
            a();
            p();
        } else {
            LogUtil.j("NotificationBaseActivity", notificationResult);
        }
    }

    private void p() {
        new Handler().postDelayed(new Runnable() { // from class: qww
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        }, 100L);
    }

    public /* synthetic */ void e() {
        LogUtil.a("NotificationBaseActivity", "handleMessage SHOW_TIP");
        Intent intent = new Intent();
        intent.setClass(this, NotificationTipActivity.class);
        startActivity(intent);
    }

    public void a() {
        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        try {
            boolean zStartActivityIfNeeded = startActivityIfNeeded(intent, 100);
            LogUtil.a("NotificationBaseActivity", "startActivityIfNeeded result : ", Boolean.valueOf(zStartActivityIfNeeded));
            if (zStartActivityIfNeeded) {
                return;
            }
            xjt.ag("openNotificationAccess failed");
            startActivityForResult(intent, 100);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("NotificationBaseActivity", "ActivityNotFoundException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Boolean bool) {
        this.n.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Boolean bool) {
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("NotificationBaseActivity", "onNotifyReminderModeChanged run finish");
        } else {
            if (this.q == null) {
                return;
            }
            LogUtil.a("NotificationBaseActivity", "updateBatchOperationStatus: ", bool);
            boolean zEquals = Boolean.TRUE.equals(bool);
            this.s = zEquals;
            this.q.setText(zEquals ? R.string.IDS_all_open : R.string.IDS_all_close);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Integer num) {
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("NotificationBaseActivity", "onNotifyReminderModeChanged run finish");
            return;
        }
        LogUtil.a("NotificationBaseActivity", "onNotifyReminderModeChanged mode:", num);
        this.ac = num.intValue();
        this.p.setChecked(num.intValue() != 1);
        this.r.setChecked(num.intValue() == 1);
        this.r.setEnabled(true);
        this.p.setEnabled(true);
    }

    protected void f() {
        NotificationViewModel notificationViewModel = this.l;
        if (notificationViewModel != null) {
            notificationViewModel.u();
        }
    }

    protected void a(List<lzj> list) {
        NotificationAppAdapter notificationAppAdapter;
        StringBuilder sb = new StringBuilder("应用列表变化，数量: ");
        sb.append(list != null ? list.size() : 0);
        LogUtil.d("NotificationBaseActivity", sb.toString());
        if (isFinishing() || isDestroyed() || (notificationAppAdapter = this.n) == null) {
            LogUtil.j("NotificationBaseActivity", "onAppListChanged run finish");
            return;
        }
        notificationAppAdapter.e(list);
        if (njy.e(list) && this.d.getVisibility() == 0) {
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
    }

    protected void e(Boolean bool) {
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("NotificationBaseActivity", "onMainSwitchChanged run finish");
            return;
        }
        LogUtil.a("NotificationBaseActivity", "onMainSwitchChanged ", bool);
        if (Boolean.TRUE.equals(bool)) {
            if (this.n.getItemCount() == 0) {
                this.l.t();
            }
            this.f24522a.a(true);
            this.o.addAdapter(this.n);
            if (!TextUtils.isEmpty(this.w.getQuery())) {
                this.w.setQuery("", false);
            }
            this.i.setVisibility(8);
        } else {
            this.f24522a.a(false);
            this.o.removeAdapter(this.n);
            if (PermissionUtil.f()) {
                this.i.setVisibility(0);
            } else {
                this.i.setVisibility(8);
            }
        }
        this.f24522a.notifyDataSetChanged();
        this.h.setOnCheckedChangeListener(null);
        this.h.setChecked(Boolean.TRUE.equals(bool));
        this.h.setOnCheckedChangeListener(this.v);
        this.h.setEnabled(true);
    }

    protected void e(List<Boolean> list) {
        boolean z;
        StringBuilder sb = new StringBuilder("加载状态变化: ");
        sb.append(list != null ? list : Constants.NULL);
        LogUtil.d("NotificationBaseActivity", sb.toString());
        if (isFinishing() || isDestroyed() || this.n == null || list == null) {
            LogUtil.j("NotificationBaseActivity", "onLoadingStateChanged run finish");
            return;
        }
        Iterator<Boolean> it = list.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Boolean next = it.next();
                if (z || Boolean.TRUE.equals(next)) {
                    z = true;
                }
            }
        }
        this.d.setVisibility(z ? 8 : 0);
        this.n.b(!z);
        if (z) {
            return;
        }
        findViewById(R.id.pb_page_loading).setVisibility(8);
        if (this.f24523b.getAdapter() == null) {
            this.f24523b.setAdapter(this.o);
        }
    }

    @Override // com.huawei.ui.device.activity.notification.adapter.NotificationAppAdapter.OnItemClickListener
    public void onSwitchChanged(lzj lzjVar, boolean z, int i) {
        if (CommonUtil.at() && z && lzjVar.a() != -1 && !this.l.a(lzjVar.f(), lzjVar.a())) {
            c(lzjVar);
            return;
        }
        this.l.a(lzjVar, z);
        qxn.b(lzjVar.d(), z ? 1 : 0, this.t);
    }

    private void c(final lzj lzjVar) {
        NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(this).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: qwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(lzjVar, view);
            }
        }).a(R.string.IDS_device_open_later_button, new View.OnClickListener() { // from class: qxc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46928b.b(lzjVar, view);
            }
        });
        builderA.a(getString(R.string.IDS_device_system_notify_open_remind));
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderA.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void c(lzj lzjVar, View view) {
        this.l.a(lzjVar, true);
        qxn.b(lzjVar.d(), 1, this.t);
    }

    public /* synthetic */ void b(lzj lzjVar, View view) {
        lzjVar.e(0);
        this.n.notifyDataSetChanged();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            e(motionEvent);
            return super.dispatchTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException e) {
            ReleaseLogUtil.e("R_NotificationBaseActivity", "dispatchTouchEvent ArrayIndexOutOfBoundsException", ExceptionUtils.c(e));
            return true;
        }
    }

    private void e(MotionEvent motionEvent) {
        InputMethodManager inputMethodManager;
        int[] iArr = new int[2];
        HealthSearchView healthSearchView = this.w;
        if (healthSearchView != null) {
            healthSearchView.getLocationOnScreen(iArr);
            if ((motionEvent.getY() > iArr[1] + this.w.getHeight() || motionEvent.getY() < iArr[1]) && (inputMethodManager = (InputMethodManager) BaseApplication.b().getSystemService("input_method")) != null) {
                inputMethodManager.hideSoftInputFromWindow(this.w.getWindowToken(), 0);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            LogUtil.a("NotificationBaseActivity", "showOverSeaGuideDialog");
            h();
        }
    }

    protected void h() {
        String string;
        if (PermissionUtil.f() && Utils.o() && l() && !mir.a()) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
            if (m()) {
                string = getString(R.string.IDS_msgnotification_permission_xiaomi);
            } else {
                string = getString(R.string.IDS_device_msgnotif_permission_dialog_overseas);
            }
            builder.a(string);
            builder.c(R.string.IDS_go_setting, new View.OnClickListener() { // from class: qwt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.f(view);
                }
            });
            builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qxa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("NotificationBaseActivity", "showAuthorizeDialog cancel click");
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            LogUtil.a("NotificationBaseActivity", "showOverSeaGuideDialog is create.");
            noTitleCustomAlertDialogC.setCancelable(false);
            if (noTitleCustomAlertDialogC.isShowing()) {
                return;
            }
            noTitleCustomAlertDialogC.show();
        }
    }

    public /* synthetic */ void f(View view) {
        LogUtil.a("NotificationBaseActivity", "showAuthorizeDialog closed click");
        Intent intent = new Intent();
        intent.setFlags(268435456);
        if (m()) {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", getPackageName(), null));
        } else {
            intent.setAction("android.settings.APPLICATION_SETTINGS");
        }
        iov.d(this, intent);
    }

    private boolean l() {
        return (lmq.e() || lmq.a() || CommonUtil.bh()) ? false : true;
    }

    private boolean m() {
        String lowerCase = Build.BRAND.toLowerCase(Locale.ENGLISH);
        return lowerCase.contains("xiaomi") || lowerCase.contains("redmi") || lowerCase.contains("poco");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        g();
        ReleaseLogUtil.d("R_NotificationBaseActivity", "onResume() mNotificationSwitch : isChecked : ", Boolean.valueOf(this.h.isChecked()));
        this.l.s();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        g();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("NotificationBaseActivity", "onDestroy");
        NotificationViewModel notificationViewModel = this.l;
        if (notificationViewModel != null) {
            notificationViewModel.w();
        }
        unregisterReceiver(this.k);
    }
}
