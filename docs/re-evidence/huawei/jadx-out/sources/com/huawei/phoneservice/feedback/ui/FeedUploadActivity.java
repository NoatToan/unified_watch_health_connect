package com.huawei.phoneservice.feedback.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.l;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.entity.FeedbackBean;
import com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackInfo;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.phoneservice.feedbackcommon.utils.AsCache;
import com.huawei.phoneservice.feedbackcommon.utils.NetworkUtils;
import com.huawei.phoneservice.feedbackcommon.utils.UriDeserializer;
import com.huawei.phoneservice.feedbackcommon.utils.UriSerializer;
import com.huawei.phoneservice.feedbackcommon.utils.ZipUtil;
import com.huawei.secure.android.common.intent.SafeBundle;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes41.dex */
public class FeedUploadActivity extends FeedbackBaseActivity<com.huawei.phoneservice.feedback.mvp.presenter.d> implements View.OnClickListener, View.OnFocusChangeListener, com.huawei.phoneservice.feedback.mvp.contract.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f21717b;
    private TextView e;
    private FeedbackBean f;
    private Button g;
    private EditText h;
    private com.huawei.phoneservice.feedback.mvp.presenter.d i;
    private AsCache j;
    private TextView k;
    private boolean l = false;
    private TextView m;
    private LinearLayout n;
    private boolean o;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("FeedbackBean", this.f);
        bundle.putString("CacheMap", com.huawei.phoneservice.faq.base.util.i.d().getMapOnSaveInstance());
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        String string;
        EditText editText = (EditText) view;
        if (view.getId() == R.id.edit_desc) {
            if (z) {
                editText.setTag(editText.getHint().toString());
                string = "";
            } else {
                string = editText.getTag().toString();
            }
            editText.setHint(string);
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity, com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            SafeBundle safeBundle = new SafeBundle(bundle);
            this.f = (FeedbackBean) safeBundle.getParcelable("FeedbackBean");
            com.huawei.phoneservice.faq.base.util.i.d().saveMapOnSaveInstanceState(safeBundle.getString("CacheMap"));
        }
        super.onCreate(bundle);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        Button button = this.f21717b;
        if (button != null) {
            com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.a(this, button);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        if (q.b(view)) {
            return;
        }
        if (view.getId() == R.id.btn_submit) {
            com.huawei.phoneservice.faq.base.util.d.b((Activity) this);
            ab();
        } else if (view.getId() == R.id.tv_tryagain) {
            this.k.setVisibility(8);
            ZipUtil.deleteFile(new File(FeedbackWebConstants.getZipFilePath(this)));
            new Handler().postDelayed(new j(), 500L);
            a(R.string.feedback_sdk_zipcompress_again);
            this.n.setVisibility(0);
            this.o = false;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        AlertDialog alertDialog = this.d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.d.dismiss();
        } else if (!this.i.c()) {
            h();
        } else {
            if (this.g.getVisibility() == 0) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void n() {
        setTitle(R.string.feedback_sdk_uploadfile_title);
        TextView textView = (TextView) findViewById(R.id.txt_number);
        this.e = textView;
        textView.setText(String.format(getResources().getString(R.string.feedback_sdk_problem_input_number), 0, 500));
        this.f21717b = (Button) findViewById(R.id.btn_submit);
        this.h = (EditText) findViewById(R.id.edit_desc);
        this.n = (LinearLayout) findViewById(R.id.layout_loading);
        this.g = (Button) findViewById(R.id.bg_dismiss);
        this.m = (TextView) findViewById(R.id.tv_progress);
        this.k = (TextView) findViewById(R.id.tv_tryagain);
        this.h.setFilters(new InputFilter[]{new InputFilter.LengthFilter(500), new com.huawei.phoneservice.faq.base.util.e()});
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void m() {
        this.f21717b.setOnClickListener(this);
        this.h.setOnFocusChangeListener(this);
        this.k.setOnClickListener(this);
        this.h.setOnTouchListener(new d());
        this.h.addTextChangedListener(new i());
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void l() throws Throwable {
        try {
            this.j = AsCache.get(this, "feedback");
        } catch (IOException | RuntimeException e2) {
            com.huawei.phoneservice.faq.base.util.g.c("FeedUploadActivity", e2.getMessage());
        }
        boolean zAd = ad();
        this.o = zAd;
        if (zAd) {
            g();
        } else {
            this.f = new FeedbackBean();
            aa();
        }
        this.f.setShowLog(true);
        this.h.setText(this.f.getProblemDesc());
        this.h.setSelection(this.f.getProblemDesc().length());
        ac();
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int[] k() {
        return new int[]{R.id.rl_uploadfile};
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int j() {
        return R.layout.feedback_sdk_activity_uploadfile;
    }

    public void e(String str) {
        long logsSize = this.f.getLogsSize();
        if (logsSize == 0) {
            logsSize = 1;
        }
        a(logsSize, new g(), new h());
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void e() {
        a(R.string.feedback_sdk_common_in_submission);
        this.g.setVisibility(0);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void c(String str) {
        l.e(this, str);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.e
    public FeedbackBean c() {
        return this.f;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public FeedbackInfo b() {
        return this.f.getInfo();
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.f
    public void a(String str) {
        AlertDialog alertDialog = this.d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.d.dismiss();
        }
        f();
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void a(com.huawei.phoneservice.feedback.utils.a aVar) {
        int i2;
        if (aVar != com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_SUCCESS) {
            if (aVar == com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_FAILED) {
                i2 = R.string.feedback_sdk_zipcompressfailed;
            }
            new Handler().postDelayed(new b(aVar), 500L);
        }
        this.l = true;
        i2 = R.string.feedback_sdk_zipcompresssuccess;
        a(i2);
        new Handler().postDelayed(new b(aVar), 500L);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void a() {
        AsCache asCache = this.j;
        if (asCache != null) {
            asCache.remove("lastSubmitzip");
        }
        this.n.setVisibility(8);
        this.g.setVisibility(8);
        this.f21717b.setEnabled(true);
    }

    public void h() {
        a(getString(R.string.feedback_sdk_tips_upload_waiting_or_exit_new), null, null, new m(), new e());
        this.i.e();
    }

    public void g() {
        a(getString(R.string.feedback_sdk_tips_continue_to_submit), getString(R.string.feedback_sdk_appupdate3_continue), getString(R.string.feedback_sdk_common_cancel), new f(), new o());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.huawei.phoneservice.feedback.mvp.presenter.d y() {
        com.huawei.phoneservice.feedback.mvp.presenter.d dVar = new com.huawei.phoneservice.feedback.mvp.presenter.d(this, this);
        this.i = dVar;
        return dVar;
    }

    private void a(int i2) {
        this.m.setText(i2);
        this.n.setVisibility(0);
        this.f21717b.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() throws Throwable {
        if (this.f == null) {
            return;
        }
        int i2 = 10;
        try {
            int i3 = Integer.parseInt(com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_MIN_DESC_INPUT));
            if (i3 >= 1 && i3 <= 10) {
                i2 = i3;
            }
        } catch (NumberFormatException unused) {
        }
        if (TextUtils.isEmpty(this.f.getProblemDesc()) || this.f.getProblemDesc().trim().length() < i2) {
            c(getString(R.string.feedback_sdk_feedback_desc_hint, new Object[]{Integer.valueOf(i2)}));
            return;
        }
        if (!NetworkUtils.isNetworkConnected(this)) {
            c(getResources().getString(R.string.feedback_sdk_no_network));
        } else if (0 == this.f.getLogsSize() || NetworkUtils.isWifiConnected(this)) {
            o();
        } else {
            e("wifi");
        }
    }

    private boolean ad() throws Throwable {
        AsCache asCache = this.j;
        if (asCache == null) {
            return false;
        }
        String asString = asCache.getAsString("lastSubmitzip");
        if (TextUtils.isEmpty(asString)) {
            return false;
        }
        this.f = (FeedbackBean) new GsonBuilder().registerTypeAdapter(Uri.class, new UriDeserializer()).create().fromJson(asString, FeedbackBean.class);
        return true;
    }

    private void ac() {
        if (this.f21717b.getMeasuredWidth() < com.huawei.phoneservice.faq.base.util.d.b((Context) this)) {
            com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.a(this, this.f21717b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        ZipUtil.deleteFile(new File(FeedbackWebConstants.getZipFilePath(this)));
        a(R.string.feedback_sdk_zipcompressing);
        new Handler().postDelayed(new a(), 500L);
        this.n.setVisibility(0);
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.f21717b.setEnabled(this.l);
    }

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            FeedUploadActivity.this.i.i();
        }

        a() {
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.phoneservice.feedback.utils.a f21719c;

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            FeedUploadActivity.this.n.setVisibility(8);
            com.huawei.phoneservice.feedback.utils.a aVar = this.f21719c;
            if (aVar == com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_FAILED) {
                FeedUploadActivity.this.k.setVisibility(0);
            } else if (aVar == com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_SUCCESS && FeedUploadActivity.this.o) {
                FeedUploadActivity.this.ab();
                return;
            }
            FeedUploadActivity.this.r();
        }

        b(com.huawei.phoneservice.feedback.utils.a aVar) {
            this.f21719c = aVar;
        }
    }

    class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedUploadActivity.this.finish();
        }

        c() {
        }
    }

    class d implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            FeedUploadActivity.this.h.setFocusableInTouchMode(true);
            if (view.getId() == R.id.edit_desc && com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.e(FeedUploadActivity.this.h)) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return false;
        }

        d() {
        }
    }

    class e implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            FeedUploadActivity.this.w();
            FeedUploadActivity.this.i.d();
            com.huawei.phoneservice.faq.base.util.i.a().onClick(FeedUploadActivity.this.getClass().getName(), "Cancel", FeedUploadActivity.this.f);
        }

        e() {
        }
    }

    class f implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            FeedUploadActivity.this.w();
            FeedUploadActivity.this.aa();
        }

        f() {
        }
    }

    class g implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            if (q.b(view)) {
                return;
            }
            FeedUploadActivity.this.w();
            FeedUploadActivity.this.o();
        }

        g() {
        }
    }

    class h implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedUploadActivity.this.w();
        }

        h() {
        }
    }

    class i implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (FeedUploadActivity.this.f != null) {
                String strTrim = FeedUploadActivity.this.h.getText().toString().trim();
                FeedUploadActivity.this.f.setProblemDesc(strTrim);
                int length = strTrim.length();
                FeedUploadActivity.this.e.setTextColor(ContextCompat.getColor(FeedUploadActivity.this, length >= 500 ? R.color.feedback_sdk_problem_question_max_number : R.color.feedback_sdk_problem_question_number));
                FeedUploadActivity.this.e.setText(String.format(FeedUploadActivity.this.getResources().getString(R.string.feedback_sdk_problem_input_number), Integer.valueOf(length), 500));
            }
        }

        i() {
        }
    }

    class j implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            FeedUploadActivity.this.i.i();
        }

        j() {
        }
    }

    class m implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            FeedUploadActivity.this.w();
            FeedUploadActivity.this.i.f();
            com.huawei.phoneservice.faq.base.util.i.a().onClick(FeedUploadActivity.this.getClass().getName(), "Quit", FeedUploadActivity.this.f);
        }

        m() {
        }
    }

    class o implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            FeedUploadActivity.this.w();
            if (FeedUploadActivity.this.j != null) {
                FeedUploadActivity.this.j.remove("lastSubmitzip");
            }
            FeedUploadActivity.this.f = new FeedbackBean();
            FeedUploadActivity.this.h.setText(FeedUploadActivity.this.f.getProblemDesc());
            FeedUploadActivity.this.h.setSelection(FeedUploadActivity.this.f.getProblemDesc().length());
            FeedUploadActivity.this.o = false;
            FeedUploadActivity.this.aa();
        }

        o() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() throws Throwable {
        Gson gsonCreate = this.f.haveMedias() ? new GsonBuilder().registerTypeAdapter(Uri.class, new UriSerializer()).create() : new Gson();
        AsCache asCache = this.j;
        if (asCache != null) {
            asCache.put("lastSubmitzip", gsonCreate.toJson(this.f), 172800);
        }
        this.i.c(0, 0);
        this.i.c((Context) this, true);
    }

    private void f() {
        View viewInflate = getLayoutInflater().inflate(R.layout.feedback_sdk_dialog_uploadzip, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.close)).setOnClickListener(new c());
        a(viewInflate, false);
    }
}
