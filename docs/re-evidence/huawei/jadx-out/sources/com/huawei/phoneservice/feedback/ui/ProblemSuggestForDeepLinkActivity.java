package com.huawei.phoneservice.feedback.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.ModuleConfigUtils;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.k;
import com.huawei.phoneservice.faq.base.util.l;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter;
import com.huawei.phoneservice.feedback.entity.FeedbackBean;
import com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity;
import com.huawei.phoneservice.feedback.widget.FeedbackNoticeView;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackInfo;
import com.huawei.phoneservice.feedbackcommon.photolibrary.internal.entity.MediaItem;
import com.huawei.phoneservice.feedbackcommon.utils.CharInputFilter;
import com.huawei.phoneservice.feedbackcommon.utils.EmojiFilter;
import com.huawei.phoneservice.feedbackcommon.utils.FaqRegexMatches;
import com.huawei.phoneservice.feedbackcommon.utils.NetworkUtils;
import com.huawei.phoneservice.feedbackcommon.utils.SdkProblemListener;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class ProblemSuggestForDeepLinkActivity extends FeedbackBaseActivity<com.huawei.phoneservice.feedback.mvp.presenter.c> implements View.OnClickListener, com.huawei.phoneservice.feedback.mvp.contract.a, View.OnFocusChangeListener, ProblemSuggestPhotoAdapter.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.phoneservice.feedback.mvp.presenter.c f21759b;
    private String e;
    private EditText f;
    private FeedbackBean g;
    private TextView h;
    private TextView i;
    private TextView j;
    private Button k;
    private ProblemSuggestPhotoAdapter l;
    private TextView m;
    private LinearLayout n;
    private EditText o;
    private LinearLayout p;
    private ScrollView q;
    private FeedbackNoticeView r;
    private Button s;
    private boolean t;
    private String u;
    private String v;
    private String w;
    private GridView x;
    private boolean y;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("FeedbackBean", this.g);
        bundle.putString("CacheMap", com.huawei.phoneservice.faq.base.util.i.d().getMapOnSaveInstance());
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4 && "Y".equals(com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_IS_DEEPLICK))) {
            g.a("ProblemSuggestForDeep", "ONKEYDOWN IS DEEPLINK RELEASE");
            com.huawei.phoneservice.faq.base.util.i.d().release();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        EditText editText = (EditText) view;
        int id = view.getId();
        if (id == R.id.edit_contact || id == R.id.edit_desc) {
            a(z, editText);
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity, com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            SafeBundle safeBundle = new SafeBundle(bundle);
            String string = safeBundle.getString("CacheMap");
            this.g = (FeedbackBean) safeBundle.getParcelable("FeedbackBean");
            com.huawei.phoneservice.faq.base.util.i.d().saveMapOnSaveInstanceState(string);
        }
        super.onCreate(bundle);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        this.x.setNumColumns(x());
        Button button = this.k;
        if (button != null) {
            com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.a(this, button);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (q.b(view)) {
            return;
        }
        if (view.getId() == R.id.btn_submit) {
            com.huawei.phoneservice.faq.base.util.d.b((Activity) this);
            ab();
        } else if (view.getId() == R.id.feedback_problem_noticeView) {
            l();
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    public void onBackPressed(View view) {
        super.onBackPressed(view);
        if ("Y".equals(com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_IS_DEEPLICK))) {
            g.a("ProblemSuggestForDeep", "ONBACKPRESSED IS DEEPLINK RELEASE");
            com.huawei.phoneservice.faq.base.util.i.d().release();
        }
        a(this.g);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        List<MediaItem> listA;
        super.onActivityResult(i2, i3, intent);
        SafeIntent safeIntent = new SafeIntent(intent);
        if (safeIntent.getData() == null || i2 != 100 || (listA = a(safeIntent, this.g)) == null) {
            return;
        }
        this.g.setMedias(listA);
        this.l.d(listA);
        this.f21759b.b(this);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void n() {
        TextView textView = (TextView) findViewById(R.id.txt_style);
        this.j = textView;
        textView.setSelected(true);
        TextView textView2 = (TextView) findViewById(R.id.txt_channel);
        this.i = textView2;
        textView2.setSelected(true);
        this.f = (EditText) findViewById(R.id.edit_question);
        this.m = (TextView) findViewById(R.id.txt_number);
        this.h = (TextView) findViewById(R.id.tv_progress);
        this.m.setText(String.format(getResources().getString(R.string.feedback_sdk_problem_input_number), 0, 500));
        this.l = new ProblemSuggestPhotoAdapter(this);
        GridView gridView = (GridView) findViewById(R.id.list_media);
        this.x = gridView;
        gridView.setAdapter((ListAdapter) this.l);
        this.x.setNumColumns(x());
        String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_HIDE_ADD_ATTACHMENT);
        if (sdk == null || !"Y".equals(sdk.toUpperCase(Locale.ROOT))) {
            this.x.setVisibility(0);
        } else {
            this.x.setVisibility(8);
        }
        this.o = (EditText) findViewById(R.id.edit_contact);
        Button button = (Button) findViewById(R.id.btn_submit);
        this.k = button;
        com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.a(this, button);
        this.p = (LinearLayout) findViewById(R.id.layout_loading);
        this.s = (Button) findViewById(R.id.bg_dismiss);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll_view);
        this.q = scrollView;
        scrollView.setOverScrollMode(0);
        this.n = (LinearLayout) findViewById(R.id.ll_phone_or_email);
        this.r = (FeedbackNoticeView) findViewById(R.id.feedback_problem_noticeView);
        r();
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void m() {
        this.l.b(this);
        this.f.addTextChangedListener(new a());
        this.o.addTextChangedListener(new e());
        this.k.setOnClickListener(this);
        this.r.setOnClickListener(this);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void l() {
        setTitle(R.string.faq_sdk_feedback);
        try {
            this.r.b(FeedbackNoticeView.c.PROGRESS);
            o();
            if (!com.huawei.phoneservice.faq.base.util.d.c(this)) {
                this.r.e(FaqConstants.FaqErrorCode.INTERNET_ERROR);
                return;
            }
            this.g = new FeedbackBean();
            this.f21759b.b(this, this.w, this.v, this.e);
            this.n.setVisibility(this.y ? 0 : 8);
        } catch (RuntimeException e2) {
            g.a("ProblemSuggestForDeep", e2.getMessage());
            finish();
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int[] k() {
        return new int[]{R.id.ll_channel, R.id.txt_channel, R.id.rl_description, R.id.ll_contact, R.id.edit_contact, R.id.ll_category, R.id.txt_style, R.id.ll_description};
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int j() {
        return R.layout.feedback_sdk_activity_deeplink;
    }

    @Override // com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter.b
    public void f() {
        z();
    }

    public void e(String str) {
        g.e("ProblemSuggestForDeep", "openUploadFlow      " + str);
        long filesSize = this.g.getFilesSize();
        if (filesSize == 0) {
            filesSize = 1;
        }
        a(filesSize, new b(), new d());
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void e() {
        e(R.string.feedback_sdk_common_in_submission);
        this.s.setVisibility(0);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void c(String str) {
        l.e(this, str);
        Log.e("ProblemSuggestForDeep", "showToast...." + str);
        if (this.t) {
            this.k.setEnabled(true);
        }
        this.t = false;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void c(int i2) {
        Resources resources;
        int i3;
        g.e("ProblemSuggestForDeep", "showErrorCode:" + i2);
        if (i2 != 401) {
            if (i2 != 405) {
                a(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR);
            } else {
                resources = getResources();
                i3 = R.string.feedback_sdk_submit_repeated;
            }
            u();
            this.r.setVisibility(0);
            this.r.setEnabled(true);
            this.q.setVisibility(8);
        }
        resources = getResources();
        i3 = R.string.feedback_sdk_lapsed;
        f(resources.getString(i3));
        u();
        this.r.setVisibility(0);
        this.r.setEnabled(true);
        this.q.setVisibility(8);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.e
    public FeedbackBean c() {
        return this.g;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void b(List<com.huawei.phoneservice.feedback.entity.d> list) {
        if (k.b(ModuleConfigUtils.getChannelName())) {
            a(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
            g.e("ProblemSuggestForDeep", "channelName is NULL......");
            return;
        }
        g.e("ProblemSuggestForDeep", "showStyles......");
        this.i.setText(ModuleConfigUtils.getChannelName());
        u();
        this.q.setVisibility(0);
        this.r.setVisibility(8);
        if (list == null) {
            return;
        }
        ArrayList<com.huawei.phoneservice.feedback.entity.d> arrayList = new ArrayList(list);
        Iterator<com.huawei.phoneservice.feedback.entity.d> it = list.iterator();
        while (it.hasNext()) {
            for (com.huawei.phoneservice.feedback.entity.a aVar : it.next().f21645c) {
                com.huawei.phoneservice.feedback.entity.d dVar = new com.huawei.phoneservice.feedback.entity.d();
                dVar.e = aVar.f21639b;
                dVar.d = aVar.f21638a;
                dVar.f21644b = aVar.f21640c;
                arrayList.add(dVar);
            }
        }
        for (com.huawei.phoneservice.feedback.entity.d dVar2 : arrayList) {
            if (this.u.equals(dVar2.f21644b)) {
                this.j.setText(dVar2.e);
                this.g.setProblemType(dVar2.f21644b, null);
                return;
            }
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void b(String str) {
        g.e("ProblemSuggestForDeep", "uploadFileDone......" + str);
    }

    @Override // com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter.b
    public void b(int i2) {
        a(this.g, i2);
        this.g.remove(i2);
        this.l.d(this.g.getMedias());
        this.x.setAdapter((ListAdapter) this.l);
        this.f21759b.b(this);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public FeedbackInfo b() {
        return this.g.getInfo();
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void a(boolean z) {
        g.e("ProblemSuggestForDeep", "isCompress......" + z);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void a(String str) {
        AlertDialog alertDialog = this.d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.d.dismiss();
        }
        c(getString(R.string.feedback_sdk_submit_successs));
        String problemId = TextUtils.isEmpty(this.g.getProblemId()) ? str : this.g.getProblemId();
        this.g.setProblemId(str);
        SdkProblemListener sdkListener = com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener();
        this.k.setEnabled(true);
        this.s.setVisibility(0);
        this.s.postDelayed(new h(sdkListener, str, problemId), 2000L);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void a(com.huawei.phoneservice.feedback.utils.a aVar) {
        g.e("ProblemSuggestForDeep", "zipCompressFinished......" + aVar);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void a(FaqConstants.FaqErrorCode faqErrorCode) {
        g.e("ProblemSuggestForDeep", "showError      " + faqErrorCode);
        u();
        this.r.e(faqErrorCode);
        this.r.setVisibility(0);
        this.r.setEnabled(true);
        this.q.setVisibility(8);
    }

    @Override // com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter.b
    public void a(int i2) {
        FeedbackBean feedbackBean = this.g;
        if (feedbackBean != null) {
            a(feedbackBean.getMediaItem(i2));
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void a() {
        this.p.setVisibility(8);
        this.s.setVisibility(8);
        aa();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.huawei.phoneservice.feedback.mvp.presenter.c y() {
        com.huawei.phoneservice.feedback.mvp.presenter.c cVar = new com.huawei.phoneservice.feedback.mvp.presenter.c(this, this, this);
        this.f21759b = cVar;
        return cVar;
    }

    private void f(String str) {
        this.r.e(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
        this.r.c(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, R.drawable.ic_icon_tips_disable);
        this.r.a(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_loading_empty_icon_size));
        this.r.getNoticeTextView().setText(str);
    }

    private void e(int i2) {
        this.h.setVisibility(0);
        this.h.setText(i2);
        this.p.setVisibility(0);
        this.k.setEnabled(false);
    }

    private void a(boolean z, EditText editText) {
        String string;
        if (z) {
            editText.setTag(editText.getHint().toString());
            string = "";
        } else {
            string = editText.getTag().toString();
        }
        editText.setHint(string);
    }

    private void ab() {
        FeedbackBean feedbackBean = this.g;
        if (feedbackBean == null) {
            return;
        }
        if (TextUtils.isEmpty(feedbackBean.getProblemDesc()) || this.g.getProblemDesc().trim().length() < 10) {
            c(getString(R.string.feedback_sdk_feedback_desc_hint, new Object[]{10}));
            return;
        }
        if (this.n.getVisibility() == 0) {
            String contact = this.g.getContact();
            if (TextUtils.isEmpty(contact)) {
                c(getResources().getString(R.string.feedback_sdk_problem_phone_email));
                return;
            }
            boolean zIsEmail = FaqRegexMatches.isEmail(contact);
            boolean zIsMobile = FaqRegexMatches.isMobile(contact);
            if (!zIsEmail && !zIsMobile) {
                c(getResources().getString(R.string.feedback_sdk_problem_please_check_phone_email_formatted));
                return;
            }
        }
        this.s.setVisibility(0);
        h();
    }

    private void aa() {
        this.k.setEnabled(true);
    }

    private void r() {
        CharInputFilter charInputFilter = new CharInputFilter("[&<>\"'()\"\\n\" ]");
        EmojiFilter emojiFilter = new EmojiFilter();
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(500);
        InputFilter.LengthFilter lengthFilter2 = new InputFilter.LengthFilter(100);
        this.f.setFilters(new InputFilter[]{lengthFilter, new com.huawei.phoneservice.faq.base.util.e()});
        this.o.setFilters(new InputFilter[]{charInputFilter, emojiFilter, lengthFilter2});
        this.f.setOnFocusChangeListener(this);
        this.o.setOnFocusChangeListener(this);
        this.o.setOnTouchListener(new i(null));
        this.f.setHint(getResources().getQuantityString(R.plurals.feedback_sdk_problem_question_info_update, 10, 10));
        this.f.setOnTouchListener(new c());
    }

    private void o() {
        SafeBundle safeBundle = new SafeBundle(new SafeIntent(getIntent()).getExtras());
        this.y = "Y".equals(safeBundle.getString("showContact"));
        this.w = safeBundle.getString("appId");
        this.u = safeBundle.getString("categoryId");
        this.v = safeBundle.getString("problemId");
        this.e = safeBundle.getString("unicode");
    }

    class a implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextView textView;
            ProblemSuggestForDeepLinkActivity problemSuggestForDeepLinkActivity;
            int i;
            if (ProblemSuggestForDeepLinkActivity.this.g != null) {
                String strTrim = ProblemSuggestForDeepLinkActivity.this.f.getText().toString().trim();
                ProblemSuggestForDeepLinkActivity.this.g.setProblemDesc(strTrim);
                if (strTrim.length() >= 500) {
                    textView = ProblemSuggestForDeepLinkActivity.this.m;
                    problemSuggestForDeepLinkActivity = ProblemSuggestForDeepLinkActivity.this;
                    i = R.color.feedback_sdk_problem_question_max_number;
                } else {
                    textView = ProblemSuggestForDeepLinkActivity.this.m;
                    problemSuggestForDeepLinkActivity = ProblemSuggestForDeepLinkActivity.this;
                    i = R.color.feedback_sdk_problem_question_number;
                }
                textView.setTextColor(ContextCompat.getColor(problemSuggestForDeepLinkActivity, i));
                ProblemSuggestForDeepLinkActivity.this.m.setText(String.format(ProblemSuggestForDeepLinkActivity.this.getResources().getString(R.string.feedback_sdk_problem_input_number), Integer.valueOf(strTrim.length()), 500));
            }
        }

        a() {
        }
    }

    class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            ProblemSuggestForDeepLinkActivity.this.t();
            ProblemSuggestForDeepLinkActivity.this.g();
        }

        b() {
        }
    }

    class c implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.getId() == R.id.edit_desc && com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.e(ProblemSuggestForDeepLinkActivity.this.f)) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return false;
        }

        c() {
        }
    }

    class d implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ProblemSuggestForDeepLinkActivity.this.t();
        }

        d() {
        }
    }

    class e implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditText editText;
            int i;
            if (ProblemSuggestForDeepLinkActivity.this.g != null) {
                String strTrim = ProblemSuggestForDeepLinkActivity.this.o.getText().toString().trim();
                if (strTrim.length() >= 100) {
                    editText = ProblemSuggestForDeepLinkActivity.this.o;
                    i = R.drawable.feedback_sdk_problem_max_num_rectangle_bg;
                } else {
                    editText = ProblemSuggestForDeepLinkActivity.this.o;
                    i = R.drawable.feedback_sdk_problem_rectangle_bg;
                }
                editText.setBackgroundResource(i);
                ProblemSuggestForDeepLinkActivity.this.g.setContact(strTrim);
            }
        }

        e() {
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SdkProblemListener f21763a;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        @Override // java.lang.Runnable
        public void run() {
            SdkProblemListener sdkProblemListener = this.f21763a;
            if (sdkProblemListener != null) {
                sdkProblemListener.onSubmitResult(0, this.d, this.e, ProblemSuggestForDeepLinkActivity.this.g.getSrCode(), null);
            }
            Intent intent = new Intent();
            intent.putExtra("parentProblemId", this.e);
            intent.putExtra("problemId", this.d);
            intent.putExtra("srCode", ProblemSuggestForDeepLinkActivity.this.g.getSrCode());
            ProblemSuggestForDeepLinkActivity.this.setResult(-1, intent);
            ProblemSuggestForDeepLinkActivity.this.finish();
        }

        h(SdkProblemListener sdkProblemListener, String str, String str2) {
            this.f21763a = sdkProblemListener;
            this.d = str;
            this.e = str2;
        }
    }

    static class i implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }

        /* synthetic */ i(c cVar) {
            this();
        }

        private i() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.t = true;
        this.g.setProblemName(this.j.getText().toString());
        try {
            this.g.setAssociatedId(Long.parseLong(this.v));
        } catch (NumberFormatException unused) {
            g.a("ProblemSuggestForDeep", "NumberFormatException");
        }
        this.g.setUniqueCode(this.e);
        com.huawei.phoneservice.faq.base.util.i.a().onClick(getClass().getName(), "Submit", this.g);
        this.f21759b.b((Context) this, false);
    }

    private void h() {
        if (!NetworkUtils.isNetworkConnected(this)) {
            this.s.setVisibility(8);
            c(getResources().getString(R.string.feedback_sdk_no_network));
        } else if ((!this.g.haveMedias() && 0 == this.g.getLogsSize()) || NetworkUtils.isWifiConnected(this)) {
            g();
        } else {
            this.s.setVisibility(8);
            e("wifi");
        }
    }
}
