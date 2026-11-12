package com.huawei.phoneservice.feedback.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.ModuleConfigUtils;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter;
import com.huawei.phoneservice.feedback.entity.FeedbackBean;
import com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity;
import com.huawei.phoneservice.feedback.photolibrary.internal.widget.BadgeHelper;
import com.huawei.phoneservice.feedback.widget.FeedbackNoticeView;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackInfo;
import com.huawei.phoneservice.feedbackcommon.entity.ProblemInfo;
import com.huawei.phoneservice.feedbackcommon.photolibrary.internal.entity.MediaItem;
import com.huawei.phoneservice.feedbackcommon.utils.AsCache;
import com.huawei.phoneservice.feedbackcommon.utils.NetworkUtils;
import com.huawei.phoneservice.feedbackcommon.utils.OnReadListener;
import com.huawei.phoneservice.feedbackcommon.utils.UriDeserializer;
import com.huawei.phoneservice.feedbackcommon.utils.UriSerializer;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class ProductSuggestionActivity extends FeedbackBaseActivity<com.huawei.phoneservice.feedback.mvp.presenter.c> implements View.OnClickListener, com.huawei.phoneservice.feedback.mvp.contract.a, View.OnFocusChangeListener, ProblemSuggestPhotoAdapter.b {
    private com.huawei.phoneservice.feedback.mvp.presenter.c e;
    private Button f;
    private LinearLayout g;
    private EditText h;
    private Button i;
    private TextView j;
    private ScrollView k;
    private GridView l;
    private FeedbackNoticeView m;
    private FeedbackBean n;
    private AsCache o;
    private ProblemSuggestPhotoAdapter s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21765b = 0;
    private boolean p = false;
    private int r = 0;

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void a(com.huawei.phoneservice.feedback.utils.a aVar) {
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void c(int i2) {
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        getMenuInflater().inflate(R.menu.feedback_sdk_problem_menu_item, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.feedback_sdk_show_history);
        View actionView = menuItemFindItem.getActionView();
        new BadgeHelper(this).b(true).c((ImageView) actionView.findViewById(R.id.menu_history)).setBadgeNumber(this.f21765b);
        actionView.setOnClickListener(new e());
        if (com.huawei.phoneservice.faq.base.util.k.b(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"))) {
            this.p = false;
        }
        menuItemFindItem.setVisible(this.p);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        String string;
        EditText editText = (EditText) view;
        if (view.getId() == R.id.edit_question) {
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
            this.n = (FeedbackBean) safeBundle.getParcelable("FeedbackBean");
            com.huawei.phoneservice.faq.base.util.i.d().saveMapOnSaveInstanceState(safeBundle.getString("CacheMap"));
        }
        super.onCreate(bundle);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        this.l.setNumColumns(x());
        Button button = this.i;
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
            ad();
        } else if (view == this.m) {
            l();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        AlertDialog alertDialog = this.d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.d.dismiss();
            return;
        }
        if (!this.e.e()) {
            g();
        } else {
            if (this.f.getVisibility() == 0) {
                return;
            }
            a(this.n);
            com.huawei.phoneservice.faq.base.util.d.b((Activity) this);
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        List<MediaItem> listA;
        super.onActivityResult(i2, i3, intent);
        SafeIntent safeIntent = new SafeIntent(intent);
        if (i2 != 100 || safeIntent.getData() == null || (listA = a(safeIntent, this.n)) == null) {
            return;
        }
        this.n.setMedias(listA);
        this.s.d(listA);
        this.e.b(this);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void n() {
        GridView gridView;
        this.l = (GridView) findViewById(R.id.list_media);
        this.s = new ProblemSuggestPhotoAdapter(this);
        this.i = (Button) findViewById(R.id.btn_submit);
        this.m = (FeedbackNoticeView) findViewById(R.id.feedback_problem_noticeView);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll_view);
        this.k = scrollView;
        int i2 = 0;
        scrollView.setOverScrollMode(0);
        com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.a(this, this.i);
        this.g = (LinearLayout) findViewById(R.id.layout_loading);
        this.h = (EditText) findViewById(R.id.edit_question);
        this.f = (Button) findViewById(R.id.bg_dismiss);
        TextView textView = (TextView) findViewById(R.id.txt_number);
        this.j = textView;
        textView.setText(String.format(getResources().getString(R.string.feedback_sdk_problem_input_number), 0, 500));
        this.h.setFilters(new InputFilter[]{new InputFilter.LengthFilter(500), new com.huawei.phoneservice.faq.base.util.e()});
        this.h.setOnTouchListener(new b());
        this.l.setAdapter((ListAdapter) this.s);
        this.l.setNumColumns(x());
        this.l.requestFocus();
        String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_HIDE_ADD_ATTACHMENT);
        if (sdk == null || !"Y".equals(sdk.toUpperCase(Locale.ROOT))) {
            gridView = this.l;
        } else {
            gridView = this.l;
            i2 = 8;
        }
        gridView.setVisibility(i2);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void m() {
        this.h.addTextChangedListener(new f());
        this.s.b(this);
        this.i.setOnClickListener(this);
        this.h.setOnFocusChangeListener(this);
        this.m.setOnClickListener(this);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void l() {
        try {
            this.m.b(FeedbackNoticeView.c.PROGRESS);
            setTitle(getString(R.string.feedback_sdk_question));
            try {
                this.o = AsCache.get(this, "productSuggest");
            } catch (IOException | RuntimeException e2) {
                com.huawei.phoneservice.faq.base.util.g.c("ProductSuggestionActivity__", e2.getMessage());
            }
            SafeIntent safeIntent = new SafeIntent(getIntent());
            ProblemInfo problemInfo = safeIntent.hasExtra("problem_info") ? (ProblemInfo) safeIntent.getParcelableExtra("problem_info") : null;
            if (problemInfo == null || !problemInfo.isDetail()) {
                this.r = 0;
                this.f21765b = problemInfo == null ? 0 : problemInfo.getUnread();
                this.n = new FeedbackBean();
                this.p = ModuleConfigUtils.productSuggestLsEnabled();
                this.m.setVisibility(8);
            } else {
                this.r = 1;
                this.n = new FeedbackBean(problemInfo.getProblemId(), problemInfo.getProblemType(), problemInfo.getProblemType(), problemInfo.getContact());
                this.p = false;
            }
            invalidateOptionsMenu();
            this.e.a((Context) this, false);
            if (com.huawei.phoneservice.faq.base.util.k.b(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"))) {
                return;
            }
            com.huawei.phoneservice.feedbackcommon.utils.e.a().getUnread(this, "", new a());
        } catch (RuntimeException e3) {
            com.huawei.phoneservice.faq.base.util.g.a("ProductSuggestionActivity__", e3.getMessage());
            finish();
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int j() {
        return R.layout.feedback_sdk_activity_product_suggestion;
    }

    public void e(String str) {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "openUploadFlow......" + str);
        long filesSize = this.n.getFilesSize();
        if (filesSize == 0) {
            filesSize = 1;
        }
        a(filesSize, new g(), new j());
    }

    @Override // com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter.b
    public void f() {
        z();
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void e() {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "showLoading......");
        this.i.setEnabled(false);
        this.g.setVisibility(0);
        this.f.setVisibility(0);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void c(String str) {
        com.huawei.phoneservice.faq.base.util.l.e(this, str);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.e
    public FeedbackBean c() {
        return this.n;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void b(List<com.huawei.phoneservice.feedback.entity.d> list) throws Throwable {
        u();
        this.k.setVisibility(0);
        this.m.setVisibility(8);
        boolean zAa = aa();
        FeedbackBean feedbackBean = this.n;
        if (feedbackBean != null) {
            this.h.setText(feedbackBean.getProblemDesc());
            if (this.n.haveMedias()) {
                this.e.b(this);
                this.s.d(this.n.getMedias());
            }
        }
        if (zAa) {
            h();
        }
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "showStyles......");
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void b(String str) {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "uploadFileDone......" + str);
    }

    @Override // com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter.b
    public void b(int i2) {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "onDelete......" + i2);
        a(this.n, i2);
        this.n.remove(i2);
        this.s.d(this.n.getMedias());
        this.l.setAdapter((ListAdapter) this.s);
        this.e.b(this);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public FeedbackInfo b() {
        return this.n.getInfo();
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void a(boolean z) {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "isCompress......" + z);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void a(String str) {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "submitDone......" + str);
        t();
        String problemId = TextUtils.isEmpty(this.n.getProblemId()) ? str : this.n.getProblemId();
        this.n.setProblemId(str);
        new Thread(new c(problemId)).start();
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void a(FaqConstants.FaqErrorCode faqErrorCode) {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "showError......" + faqErrorCode);
        u();
        this.m.e(faqErrorCode);
        this.m.setVisibility(0);
        this.m.setEnabled(true);
        this.k.setVisibility(8);
    }

    @Override // com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter.b
    public void a(int i2) {
        FeedbackBean feedbackBean = this.n;
        if (feedbackBean != null) {
            a(feedbackBean.getMediaItem(i2));
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void a() {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "hideLoading......");
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        r();
        AsCache asCache = this.o;
        if (asCache != null) {
            asCache.remove("productLastSubmit");
        }
    }

    public void g() {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "openUploadExit......");
        a(getString(R.string.feedback_sdk_tips_upload_waiting_or_exit_new), null, null, new k(), new l());
        this.e.g();
    }

    public void h() {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "openUploadContinue......");
        a(getString(R.string.feedback_sdk_tips_continue_to_submit), getString(R.string.feedback_sdk_appupdate3_continue), getString(R.string.feedback_sdk_common_cancel), new h(), new i());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.huawei.phoneservice.feedback.mvp.presenter.c y() {
        com.huawei.phoneservice.feedback.mvp.presenter.c cVar = new com.huawei.phoneservice.feedback.mvp.presenter.c(this, this, this);
        this.e = cVar;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        Intent intent = new Intent(this, (Class<?>) FeedbackSubmitSuccessActivity.class);
        intent.putExtra("problemId", str);
        intent.putExtra("COME_FROM", true);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String str) {
        View viewInflate = getLayoutInflater().inflate(R.layout.feedback_sdk_dialog_close, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.btnClose);
        textView.setText(R.string.feedback_sdk_already_known);
        textView.setOnClickListener(new d(str));
        a(viewInflate, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() throws Throwable {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "submit......");
        int i2 = 10;
        try {
            int i3 = Integer.parseInt(com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_MIN_DESC_INPUT));
            if (i3 >= 1 && i3 <= 10) {
                i2 = i3;
            }
        } catch (NumberFormatException unused) {
        }
        if (TextUtils.isEmpty(this.n.getProblemDesc()) || this.n.getProblemDesc().trim().length() < i2) {
            c(getString(R.string.feedback_sdk_feedback_desc_hint, new Object[]{Integer.valueOf(i2)}));
            return;
        }
        if (!NetworkUtils.isNetworkConnected(this)) {
            c(getResources().getString(R.string.feedback_sdk_no_network));
        } else if (!this.n.haveMedias() || NetworkUtils.isWifiConnected(this)) {
            o();
        } else {
            e("wifi");
        }
    }

    class a implements OnReadListener {
        @Override // com.huawei.phoneservice.feedbackcommon.utils.OnReadListener
        public void read(Throwable th, String str) {
        }

        @Override // com.huawei.phoneservice.feedbackcommon.utils.OnReadListener
        public void unread(Throwable th, String str, int i) {
            ProductSuggestionActivity.this.f21765b = i;
            ProductSuggestionActivity.this.invalidateOptionsMenu();
        }

        a() {
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21768c;

        class d implements Runnable {
            final /* synthetic */ boolean d;

            @Override // java.lang.Runnable
            public void run() {
                if (!this.d) {
                    c cVar = c.this;
                    ProductSuggestionActivity.this.j(cVar.f21768c);
                } else {
                    c cVar2 = c.this;
                    ProductSuggestionActivity.this.i(cVar2.f21768c);
                }
            }

            d(boolean z) {
                this.d = z;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ProductSuggestionActivity.this.o != null) {
                ProductSuggestionActivity.this.o.remove("productLastSubmit");
            }
            ProductSuggestionActivity.this.runOnUiThread(new d(!com.huawei.phoneservice.faq.base.util.k.b(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken")) && ProductSuggestionActivity.this.r == 0));
        }

        c(String str) {
            this.f21768c = str;
        }
    }

    private boolean aa() throws Throwable {
        if (this.o != null && TextUtils.isEmpty(this.n.getProblemId())) {
            String asString = this.o.getAsString("productLastSubmit");
            if (!TextUtils.isEmpty(asString)) {
                this.n = (FeedbackBean) new GsonBuilder().registerTypeAdapter(Uri.class, new UriDeserializer()).create().fromJson(asString, FeedbackBean.class);
                return true;
            }
        }
        return false;
    }

    class b implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.getId() == R.id.edit_desc && com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.e(ProductSuggestionActivity.this.h)) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return false;
        }

        b() {
        }
    }

    class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21770b;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            AlertDialog alertDialog = ProductSuggestionActivity.this.d;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            Intent intent = new Intent();
            intent.putExtra("parentProblemId", this.f21770b);
            intent.putExtra("problemId", ProductSuggestionActivity.this.n.getProblemId());
            intent.putExtra("srCode", ProductSuggestionActivity.this.n.getSrCode());
            ProductSuggestionActivity.this.setResult(-1, intent);
            ProductSuggestionActivity.this.finish();
        }

        d(String str) {
            this.f21770b = str;
        }
    }

    class e implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view) || !ProductSuggestionActivity.this.e.e() || ProductSuggestionActivity.this.f.getVisibility() == 0) {
                return;
            }
            ProductSuggestionActivity.this.f21765b = 0;
            ProductSuggestionActivity.this.invalidateOptionsMenu();
            Intent intent = new Intent(ProductSuggestionActivity.this, (Class<?>) FeedListActivity.class);
            intent.putExtra("COME_FROM", true);
            ProductSuggestionActivity.this.startActivity(intent);
            com.huawei.phoneservice.faq.base.util.i.a().onClick(ProductSuggestionActivity.this.getClass().getName(), "Click", ProductSuggestionActivity.this.n);
        }

        e() {
        }
    }

    class f implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (ProductSuggestionActivity.this.n != null) {
                String strTrim = ProductSuggestionActivity.this.h.getText().toString().trim();
                ProductSuggestionActivity.this.n.setProblemDesc(strTrim);
                int length = strTrim.length();
                ProductSuggestionActivity.this.j.setTextColor(ContextCompat.getColor(ProductSuggestionActivity.this, length >= 500 ? R.color.feedback_sdk_problem_question_max_number : R.color.feedback_sdk_problem_question_number));
                ProductSuggestionActivity.this.j.setText(String.format(ProductSuggestionActivity.this.getResources().getString(R.string.feedback_sdk_problem_input_number), Integer.valueOf(length), 500));
                ProductSuggestionActivity.this.r();
            }
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
            ProductSuggestionActivity.this.t();
            ProductSuggestionActivity.this.o();
        }

        g() {
        }
    }

    class h implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            if (q.b(view)) {
                return;
            }
            ProductSuggestionActivity.this.w();
            ProductSuggestionActivity.this.ad();
        }

        h() {
        }
    }

    class i implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            ProductSuggestionActivity.this.w();
            if (ProductSuggestionActivity.this.o != null) {
                ProductSuggestionActivity.this.o.remove("productLastSubmit");
            }
            ProductSuggestionActivity productSuggestionActivity = ProductSuggestionActivity.this;
            productSuggestionActivity.a(productSuggestionActivity.n);
            ProductSuggestionActivity.this.n = new FeedbackBean();
            ProductSuggestionActivity.this.h.setText(ProductSuggestionActivity.this.n.getProblemDesc());
            ProductSuggestionActivity.this.s.d(ProductSuggestionActivity.this.n.getMedias());
        }

        i() {
        }
    }

    class j implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ProductSuggestionActivity.this.t();
        }

        j() {
        }
    }

    class k implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            ProductSuggestionActivity.this.w();
            ProductSuggestionActivity.this.e.f();
            com.huawei.phoneservice.faq.base.util.i.a().onClick(ProductSuggestionActivity.this.getClass().getName(), "Quit", ProductSuggestionActivity.this.n);
        }

        k() {
        }
    }

    class l implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            ProductSuggestionActivity.this.w();
            ProductSuggestionActivity.this.e.h();
            com.huawei.phoneservice.faq.base.util.i.a().onClick(ProductSuggestionActivity.this.getClass().getName(), "Cancel", ProductSuggestionActivity.this.n);
        }

        l() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "isChangeSubmitColor......");
        this.i.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() throws Throwable {
        com.huawei.phoneservice.faq.base.util.g.e("ProductSuggestionActivity__", "doLastSubmit......");
        Gson gsonCreate = this.n.haveMedias() ? new GsonBuilder().registerTypeAdapter(Uri.class, new UriSerializer()).create() : new Gson();
        AsCache asCache = this.o;
        if (asCache != null) {
            asCache.put("productLastSubmit", gsonCreate.toJson(this.n), 172800);
        }
        com.huawei.phoneservice.faq.base.util.i.a().onClick(getClass().getName(), "Submit", this.n);
        this.e.b((Context) this, false);
    }
}
