package com.huawei.ui.device.activity.smsquickreply;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.media3.common.C;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwdevice.mainprocess.mgr.smssend.HwDeviceReplyPhraseEngineManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.adapter.smsquickreply.SimpleItemTouchHelperCallback;
import com.huawei.ui.device.adapter.smsquickreply.SmsItemMoveAdapter;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qst;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.UnitUtil;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class SmsQuickReplyActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24736a;
    private CustomTitleBar d;
    private HealthTextView e;
    private HwDeviceReplyPhraseEngineManager f;
    private LinearLayout h;
    private HealthRecycleView k;
    private View l;
    private HealthScrollView o;
    private HealthTextView t;
    private List<String> i = new ArrayList();
    private SmsItemMoveAdapter m = null;
    private boolean j = true;
    private boolean g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f24738c = new Handler() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                return;
            }
            int i = message.what;
            if (i != 1001) {
                if (i == 1002) {
                    SmsQuickReplyActivity.this.i();
                    return;
                } else {
                    LogUtil.a("SmsQuickReplyActivity", "handler default");
                    return;
                }
            }
            SmsQuickReplyActivity.this.l.setVisibility(8);
            SmsQuickReplyActivity.this.h.setVisibility(0);
            SmsQuickReplyActivity.this.m.notifyDataSetChanged();
            if (SmsQuickReplyActivity.this.i.size() >= 15) {
                SmsQuickReplyActivity.this.e.setTextColor(SmsQuickReplyActivity.this.f24736a.getResources().getColor(R.color.hw_show_setting_text_color));
            }
        }
    };
    private BroadcastReceiver n = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.7
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("SmsQuickReplyActivity", "mLocaleChangedReceiver intent is null");
            } else if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                LogUtil.j("SmsQuickReplyActivity", "mLocaleChangedReceiver changed");
                SmsQuickReplyActivity.this.j = false;
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwDeviceReplyPhraseEngineManager.Callback f24737b = new HwDeviceReplyPhraseEngineManager.Callback() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.8
        @Override // com.huawei.hwdevice.mainprocess.mgr.smssend.HwDeviceReplyPhraseEngineManager.Callback
        public void onResponse(List<String> list) {
            SmsQuickReplyActivity.this.f24738c.removeMessages(1002);
            LogUtil.a("SmsQuickReplyActivity", "initData onResponse ", Integer.valueOf(list.size()));
            SmsQuickReplyActivity.this.i.clear();
            if (list.isEmpty()) {
                SmsQuickReplyActivity.this.i.addAll(HwDeviceReplyPhraseEngineManager.a().b());
            } else {
                SmsQuickReplyActivity.this.i.addAll(list);
            }
            SmsQuickReplyActivity.this.f24738c.sendEmptyMessage(1001);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (TextUtils.isEmpty(intent != null ? intent.getStringExtra("device_id") : null)) {
            LogUtil.j("SmsQuickReplyActivity", "onCreate currentDeviceId is empty");
            finish();
            return;
        }
        this.f24736a = this;
        LogUtil.a("SmsQuickReplyActivity", "onCreate");
        this.f = HwDeviceReplyPhraseEngineManager.a();
        setContentView(R.layout.activity_sms_quick_reply);
        g();
        b();
        d();
        this.g = true;
    }

    private void a() {
        this.d = (CustomTitleBar) qsp.a(this, R.id.setting_device_title_bar);
        this.o = (HealthScrollView) qsp.a(this, R.id.sms_quick_reply_scrollview);
        this.k = (HealthRecycleView) qsp.a(this, R.id.message_list);
        this.e = (HealthTextView) qsp.a(this, R.id.add_reply);
        this.l = qsp.a(this, R.id.sms_quick_reply_load);
        this.h = (LinearLayout) findViewById(R.id.content_layout);
        this.t = (HealthTextView) qsp.a(this, R.id.message_tip);
    }

    private void c() {
        this.k.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.10
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 1 && SmsQuickReplyActivity.this.m != null) {
                    SmsQuickReplyActivity.this.m.notifyDataSetChanged();
                }
                return false;
            }
        });
        this.m = new SmsItemMoveAdapter(this.f24736a, this.i);
        this.k.setLayoutManager(new LinearLayoutManager(this.f24736a));
        this.k.setAdapter(this.m);
        this.k.b(false);
        this.k.e(false);
        new ItemTouchHelper(new SimpleItemTouchHelperCallback(this.m)).attachToRecyclerView(this.k);
    }

    private void d() {
        this.f24738c.sendEmptyMessageDelayed(1002, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        this.f.c(this.f24737b);
        this.f.j();
    }

    private void b() {
        a();
        c();
        if (qst.c()) {
            this.d.setTitleText(getString(R.string.IDS_hw_msg_mgr_msg_name));
            this.t.setVisibility(0);
        } else {
            this.d.setTitleText(getString(R.string.IDS_sms_quick_reply_tl));
            this.t.setVisibility(8);
        }
        this.o.smoothScrollTo(0, 0);
        this.e.setText(getString(R.string.IDS_sms_add_reply).toUpperCase(Locale.ROOT));
        this.m.c(new SmsItemMoveAdapter.OnMessageOperationListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.12
            @Override // com.huawei.ui.device.adapter.smsquickreply.SmsItemMoveAdapter.OnMessageOperationListener
            public void onMessageDeleteListener(View view, int i) {
                if (!qrs.c(800)) {
                    if (SmsQuickReplyActivity.this.i.size() == 1) {
                        SmsQuickReplyActivity.this.h();
                        return;
                    } else {
                        SmsQuickReplyActivity.this.a(i);
                        return;
                    }
                }
                LogUtil.j("SmsQuickReplyActivity", "onMessageDeleteListener onClick isFastClick");
            }

            @Override // com.huawei.ui.device.adapter.smsquickreply.SmsItemMoveAdapter.OnMessageOperationListener
            public void onMessageEditListener(View view, int i) {
                if (!qrs.c(800)) {
                    SmsQuickReplyActivity.this.b(i, view);
                } else {
                    LogUtil.j("SmsQuickReplyActivity", "onMessageEditListener onClick isFastClick");
                }
            }
        });
        e();
    }

    private void e() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.c(800)) {
                    if (SmsQuickReplyActivity.this.i.size() < 15) {
                        SmsQuickReplyActivity.this.f();
                        return;
                    }
                    LogUtil.j("SmsQuickReplyActivity", "addButtonClick() Can't greater than 15");
                    qpx.e(SmsQuickReplyActivity.this.f24736a, String.format(Locale.ROOT, SmsQuickReplyActivity.this.f24736a.getString(R.string.IDS_sms_quick_reply_toast_new), UnitUtil.e(15.0d, 1, 0)));
                    return;
                }
                LogUtil.j("SmsQuickReplyActivity", "mAddReply onClick isFastClick");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        View viewInflate = LayoutInflater.from(this.f24736a).inflate(R.layout.commonui_dialog_single_edit, (ViewGroup) null);
        final HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(R.id.edit);
        healthEditText.setText("");
        a(healthEditText);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f24736a);
        HealthButton healthButtonC = builder.c();
        healthButtonC.setEnabled(false);
        String strE = UnitUtil.e(36.0d, 1, 0);
        if (LanguageUtil.f(this)) {
            strE = UnitUtil.e(20.0d, 1, 0);
        }
        builder.b(String.format(Locale.ROOT, getString(R.string.IDS_sms_quick_reply_title_new), UnitUtil.e(0.0d, 1, 0), strE)).a(viewInflate).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.13
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.d("SmsQuickReplyActivity", "showReplyDialog click cancle");
            }
        }).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.11
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String strTrim = healthEditText.getText().toString().trim();
                LogUtil.a("SmsQuickReplyActivity", "showReplyDialog click message:", strTrim);
                if (TextUtils.isEmpty(strTrim)) {
                    return;
                }
                SmsQuickReplyActivity.this.i.add(strTrim);
                SmsQuickReplyActivity.this.m.notifyDataSetChanged();
                if (SmsQuickReplyActivity.this.i.size() >= 15) {
                    SmsQuickReplyActivity.this.e.setTextColor(SmsQuickReplyActivity.this.f24736a.getResources().getColor(R.color.hw_show_setting_text_color));
                }
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setOnShowListener(new DialogInterface.OnShowListener() { // from class: rah
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.d.c(healthEditText, dialogInterface);
            }
        });
        customAlertDialogB.setCanceledOnTouchOutside(false);
        customAlertDialogB.show();
        d(builder, healthEditText, healthButtonC);
    }

    public /* synthetic */ void c(final HealthEditText healthEditText, DialogInterface dialogInterface) {
        healthEditText.postDelayed(new Runnable() { // from class: rag
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(healthEditText);
            }
        }, 100L);
    }

    public /* synthetic */ void c(HealthEditText healthEditText) {
        healthEditText.requestFocus();
        ((InputMethodManager) this.f24736a.getSystemService("input_method")).showSoftInput(healthEditText, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i, View view) {
        HealthTextView healthTextView = view instanceof HealthTextView ? (HealthTextView) view : null;
        if (healthTextView == null) {
            return;
        }
        String string = healthTextView.getText().toString();
        View viewInflate = LayoutInflater.from(this.f24736a).inflate(R.layout.commonui_dialog_single_edit, (ViewGroup) null);
        final HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(R.id.edit);
        a(healthEditText);
        healthEditText.setText(string);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f24736a);
        builder.b(String.format(Locale.ROOT, getString(R.string.IDS_sms_quick_reply_title_new), UnitUtil.e(string.length(), 1, 0), UnitUtil.e(e(string) ? 20 : 36, 1, 0))).a(viewInflate).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                LogUtil.d("SmsQuickReplyActivity", "showEditDialog click cancle");
            }
        }).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.15
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                String strTrim = healthEditText.getText().toString().trim();
                LogUtil.a("SmsQuickReplyActivity", "showEditDialog click message:", strTrim);
                if (TextUtils.isEmpty(strTrim)) {
                    return;
                }
                SmsQuickReplyActivity.this.i.set(i, strTrim);
                SmsQuickReplyActivity.this.m.notifyDataSetChanged();
            }
        });
        HealthButton healthButtonC = builder.c();
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
        d(builder, healthEditText, healthButtonC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        new NoTitleCustomAlertDialog.Builder(this.f24736a).b(R.string.IDS_sms_delete_quick_reply).c(R.string.IDS_contact_delete, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SmsQuickReplyActivity", "showDeleteDialog click yes");
                SmsQuickReplyActivity.this.i.remove(i);
                SmsQuickReplyActivity.this.m.notifyDataSetChanged();
                if (SmsQuickReplyActivity.this.i.size() < 15) {
                    LogUtil.a("SmsQuickReplyActivity", "showDeleteDialog click yes", Integer.valueOf(SmsQuickReplyActivity.this.i.size()));
                    SmsQuickReplyActivity.this.e.setTextColor(SmsQuickReplyActivity.this.f24736a.getResources().getColor(R.color.hw_show_color_red1));
                }
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("SmsQuickReplyActivity", "showDeleteDialog click cancle");
            }
        }).c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.a("SmsQuickReplyActivity", "showTimeoutDialog enter");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(R.string.IDS_sms_get_device_failed);
        builder.c(com.huawei.ui.main.R.string.IDS_highland_know, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SmsQuickReplyActivity", "showTimeoutDialog onClick");
                SmsQuickReplyActivity.this.j = false;
                SmsQuickReplyActivity.this.finish();
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(R.string.IDS_sms_edit_not_delete);
        builder.c(com.huawei.ui.main.R.string.IDS_highland_know, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SmsQuickReplyActivity", "showNotDeleteDialog click cancle");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void d(CustomAlertDialog.Builder builder, HealthEditText healthEditText, HealthButton healthButton) {
        healthEditText.addTextChangedListener(new c(builder, healthEditText, healthButton));
    }

    private void a(HealthEditText healthEditText) {
        healthEditText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity.9

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Pattern f24748b = Pattern.compile("[\\uD800\\uDC00-\\uDBFF\\uDFFF]|[[\\u2070-\\u27FF]\\uFE0F]|[\\u2070-\\u27FF]|[[\\u2900-\\u2BFF]\\uFE0F]|[\\u2900-\\u2BFF]", 64);

            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return ((TextUtils.isEmpty(charSequence.toString().trim()) && TextUtils.isEmpty(spanned.toString().trim())) || this.f24748b.matcher(charSequence).find()) ? "" : charSequence;
            }
        }});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                if (e(str)) {
                    return 20;
                }
                if (str.length() == bytes.length) {
                    return 36;
                }
                String strSubstring = str.substring(str.length() - 1);
                if (!c(strSubstring)) {
                    byte[] bytes2 = strSubstring.getBytes("UTF-8");
                    LogUtil.d("SmsQuickReplyActivity", "obtainMaxLength inputBytes:", Integer.valueOf(bytes.length), " lastCharBytes:", Integer.valueOf(bytes2.length));
                    return 70 / bytes2.length;
                }
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("SmsQuickReplyActivity", "obtainMaxLength Exception");
                return i;
            }
        }
        return i;
    }

    private boolean c(String str) {
        return Pattern.compile("[ -~]").matcher(str).find();
    }

    private boolean e(String str) {
        return Pattern.compile("[一-龥|、|。|？|！|，|；|：|“|”]|‘|’|（|）|《|》|〈|〉|【|】|『|』|「|」|﹃|﹄|〔|〕|…|—|～|﹏|￥]").matcher(str).find();
    }

    private void g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        BroadcastManagerUtil.d(this.f24736a, this.n, intentFilter, LocalBroadcast.f36595c, null);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("SmsQuickReplyActivity", "onDestroy");
        if (!this.g) {
            LogUtil.j("SmsQuickReplyActivity", "onDestroy mIsOnCreated is false");
            return;
        }
        this.f.c(null);
        if (this.j) {
            this.f.b(this.i);
        }
        Handler handler = this.f24738c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        unregisterReceiver(this.n);
    }

    class c implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CustomAlertDialog.Builder f24750b;
        private HealthEditText e;
        private HealthButton j;
        private int f = 36;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24749a = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f24751c = "";

        c(CustomAlertDialog.Builder builder, HealthEditText healthEditText, HealthButton healthButton) {
            this.f24750b = builder;
            this.e = healthEditText;
            this.j = healthButton;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LogUtil.d("SmsQuickReplyActivity", "refreshContentSize beforeTextChanged");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LogUtil.d("SmsQuickReplyActivity", "refreshContentSize onTextChanged start:", Integer.valueOf(i), " before:", Integer.valueOf(i2), " count:", Integer.valueOf(i3), " ", charSequence.toString());
            String string = this.e.getText().toString();
            this.f24751c = string;
            int iB = SmsQuickReplyActivity.this.b(string, this.f);
            this.f = iB;
            LogUtil.d("SmsQuickReplyActivity", "refreshContentSize onTextChanged mMaxLength:", Integer.valueOf(iB));
            if (i3 == 1 && i < i2 && this.f24751c.length() > i3 && this.f24749a.length() > 0) {
                this.e.setText(this.f24749a);
                this.e.setSelection(this.f24749a.length());
            }
            int length = this.f24751c.length();
            int i4 = this.f;
            if (length > i4) {
                String strSubstring = this.f24751c.substring(0, i4);
                this.f24749a = strSubstring;
                this.e.setText(strSubstring);
                this.e.setSelection(this.f24749a.length());
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LogUtil.d("SmsQuickReplyActivity", "refreshContentSize afterTextChanged: ", editable.toString().trim());
            int length = editable.toString().length();
            int i = this.f;
            if (length > i) {
                length = i;
            }
            if (this.f24749a.length() > 0 && this.f24751c.length() == this.f24749a.length()) {
                length = this.f24749a.length();
            }
            this.f24750b.b(String.format(Locale.ROOT, SmsQuickReplyActivity.this.getString(R.string.IDS_sms_quick_reply_title_new), UnitUtil.e(length, 1, 0), UnitUtil.e(this.f, 1, 0)));
            if (this.j == null) {
                return;
            }
            if (TextUtils.isEmpty(editable.toString()) && this.j.isEnabled()) {
                this.j.setEnabled(false);
            } else if (!TextUtils.isEmpty(editable.toString()) && !this.j.isEnabled()) {
                this.j.setEnabled(true);
            } else {
                LogUtil.d("SmsQuickReplyActivity", "refreshContentSize afterTextChanged else");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
