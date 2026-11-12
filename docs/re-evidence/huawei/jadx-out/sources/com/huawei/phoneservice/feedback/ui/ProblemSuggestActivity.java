package com.huawei.phoneservice.feedback.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.util.ModuleConfigUtils;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter;
import com.huawei.phoneservice.feedback.entity.FeedbackBean;
import com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity;
import com.huawei.phoneservice.feedback.photolibrary.internal.widget.BadgeHelper;
import com.huawei.phoneservice.feedback.widget.AutoLineLayoutManager;
import com.huawei.phoneservice.feedback.widget.ClickUrlSpan;
import com.huawei.phoneservice.feedback.widget.FeedbackNoticeView;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackInfo;
import com.huawei.phoneservice.feedbackcommon.entity.ProblemInfo;
import com.huawei.phoneservice.feedbackcommon.entity.QueryIsoLanguageResponse;
import com.huawei.phoneservice.feedbackcommon.entity.QueryNoticeResponse;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.phoneservice.feedbackcommon.photolibrary.internal.entity.MediaItem;
import com.huawei.phoneservice.feedbackcommon.utils.AsCache;
import com.huawei.phoneservice.feedbackcommon.utils.CharInputFilter;
import com.huawei.phoneservice.feedbackcommon.utils.EmojiFilter;
import com.huawei.phoneservice.feedbackcommon.utils.FaqRegexMatches;
import com.huawei.phoneservice.feedbackcommon.utils.NetworkUtils;
import com.huawei.phoneservice.feedbackcommon.utils.OnReadListener;
import com.huawei.phoneservice.feedbackcommon.utils.SdkProblemListener;
import com.huawei.phoneservice.feedbackcommon.utils.UriDeserializer;
import com.huawei.phoneservice.feedbackcommon.utils.UriSerializer;
import com.huawei.phoneservice.feedbackcommon.utils.ZipUtil;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class ProblemSuggestActivity extends FeedbackBaseActivity<com.huawei.phoneservice.feedback.mvp.presenter.c> implements View.OnClickListener, com.huawei.phoneservice.feedback.mvp.contract.a, View.OnFocusChangeListener, ProblemSuggestPhotoAdapter.b {
    private AsCache aa;
    private boolean ab;
    private com.huawei.phoneservice.feedback.mvp.presenter.c ac;
    private TextView aj;
    private TextView ak;
    private TextView al;
    private LinearLayout am;
    private TextView an;
    private TextView ao;
    private ProblemSuggestPhotoAdapter ap;
    private RecyclerView aq;
    private EditText ar;
    private com.huawei.phoneservice.feedback.adapter.f as;
    private EditText av;
    private LinearLayout ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f21737b;
    private CheckBox e;
    private LinearLayout f;
    private TextView g;
    private TextView h;
    private Button i;
    private Button j;
    private boolean k;
    private FeedbackNoticeView l;
    private boolean m;
    private boolean n;
    private boolean o;
    private ScrollView p;
    private boolean q;
    private GridView r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean x;
    private boolean y;
    private FeedbackBean z;
    private int ad = 0;
    private boolean ag = false;
    private boolean ai = false;
    private boolean ae = false;
    private boolean af = true;
    private int ah = 0;
    private int w = 10;

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void b(String str) {
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void c(int i2) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("FeedbackBean", this.z);
        bundle.putString("CacheMap", com.huawei.phoneservice.faq.base.util.i.d().getMapOnSaveInstance());
        bundle.putBoolean("isCompress", this.ae);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        getMenuInflater().inflate(R.menu.feedback_sdk_problem_menu_item, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.feedback_sdk_show_history);
        View actionView = menuItemFindItem.getActionView();
        new BadgeHelper(this).b(true).c((ImageView) actionView.findViewById(R.id.menu_history)).setBadgeNumber(this.ad);
        actionView.setOnClickListener(new ab());
        menuItemFindItem.setVisible(this.ag);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z2) {
        int id = view.getId();
        if (id == R.id.edit_contact || id == R.id.edit_desc) {
            d(view, z2);
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity, com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            SafeBundle safeBundle = new SafeBundle(bundle);
            this.z = (FeedbackBean) safeBundle.getParcelable("FeedbackBean");
            com.huawei.phoneservice.faq.base.util.i.d().saveMapOnSaveInstanceState(safeBundle.getString("CacheMap"));
            FeedbackBean feedbackBean = this.z;
            this.x = feedbackBean != null;
            if (feedbackBean != null) {
                this.af = feedbackBean.getLogsSize() == 0;
            }
            this.ae = safeBundle.getBoolean("isCompress");
        }
        super.onCreate(bundle);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        this.r.setNumColumns(x());
        Button button = this.i;
        if (button != null) {
            com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.a(this, button);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        if (com.huawei.phoneservice.faq.base.util.q.b(view)) {
            return;
        }
        int id = view.getId();
        if (id == R.id.txt_style) {
            a(this.ac.d());
            return;
        }
        if (id == R.id.btn_submit) {
            com.huawei.phoneservice.faq.base.util.d.b((Activity) this);
            ar();
            return;
        }
        if (view.getId() == R.id.feedback_problem_noticeView) {
            l();
            return;
        }
        if (view.getId() == R.id.tv_tryagain) {
            this.t = true;
            this.h.setVisibility(8);
            ZipUtil.deleteFile(new File(FeedbackWebConstants.getZipFilePath(this)));
            d(R.string.feedback_sdk_zipcompress_again);
            this.q = false;
            new Handler().postDelayed(new l(), 500L);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FeedbackBean feedbackBean;
        AsCache asCache;
        AlertDialog alertDialog = this.d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.d.dismiss();
            return;
        }
        if (!this.ac.e()) {
            h();
            return;
        }
        if (this.j.getVisibility() == 0) {
            return;
        }
        com.huawei.phoneservice.faq.base.util.d.b((Activity) this);
        if (o()) {
            an();
            return;
        }
        if (this.ah == 0 && (feedbackBean = this.z) != null && TextUtils.isEmpty(feedbackBean.getParentId()) && TextUtils.isEmpty(this.z.getProblemDesc()) && !this.z.haveMedias() && (asCache = this.aa) != null) {
            asCache.remove("feedBackCache");
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        List<MediaItem> listA;
        super.onActivityResult(i2, i3, intent);
        SafeIntent safeIntent = new SafeIntent(intent);
        if (i2 != 100 || safeIntent.getData() == null || (listA = a(safeIntent, this.z)) == null) {
            return;
        }
        this.z.setMedias(listA);
        this.ap.d(listA);
        this.ac.b(this);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void n() {
        boolean zEquals = "1".equals(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk(FaqConstants.FAQ_ISSELECTED));
        this.n = zEquals;
        this.y = !zEquals;
        setTitle(R.string.faq_sdk_feedback);
        TextView textView = (TextView) findViewById(R.id.description);
        textView.getPaint().setFakeBoldText(true);
        textView.setContentDescription(getString(R.string.feedback_sdk_problem_question_info_advice) + " " + getString(R.string.feedback_sdk_required_fields));
        TextView textView2 = (TextView) findViewById(R.id.feedback_contact_view);
        textView2.getPaint().setFakeBoldText(true);
        textView2.setContentDescription(getString(R.string.feedback_sdk_problem_contact_type) + " " + getString(R.string.feedback_sdk_required_fields));
        this.am = (LinearLayout) findViewById(R.id.ll_category);
        TextView textView3 = (TextView) findViewById(R.id.txt_style_title);
        this.an = textView3;
        textView3.setContentDescription(getString(R.string.feedback_sdk_problem_type) + " " + getString(R.string.feedback_sdk_mandatory));
        this.ak = (TextView) findViewById(R.id.txt_style);
        this.al = (TextView) findViewById(R.id.txt_style_2);
        this.aq = (RecyclerView) findViewById(R.id.grid_styles);
        this.ar = (EditText) findViewById(R.id.edit_desc);
        this.ao = (TextView) findViewById(R.id.txt_number);
        this.h = (TextView) findViewById(R.id.tv_tryagain);
        this.aj = (TextView) findViewById(R.id.tv_progress);
        this.ao.setText(String.format(getResources().getString(R.string.feedback_sdk_problem_input_number), 0, 500));
        ae();
        ImageView imageView = (ImageView) findViewById(R.id.feedback_contact_red_star);
        boolean zEqualsIgnoreCase = "Y".equalsIgnoreCase(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk(FaqConstants.FAQ_CONTACT_NOT_NECESSARY));
        this.ab = zEqualsIgnoreCase;
        imageView.setVisibility(zEqualsIgnoreCase ? 8 : 0);
        this.av = (EditText) findViewById(R.id.edit_contact);
        this.f21737b = (RelativeLayout) findViewById(R.id.cbx_host);
        this.e = (CheckBox) findViewById(R.id.cbx_log);
        this.g = (TextView) findViewById(R.id.problem_suggest_tv_privacy);
        Button button = (Button) findViewById(R.id.btn_submit);
        this.i = button;
        com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.a(this, button);
        this.f = (LinearLayout) findViewById(R.id.layout_loading);
        this.j = (Button) findViewById(R.id.bg_dismiss);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll_view);
        this.p = scrollView;
        scrollView.setOverScrollMode(0);
        this.ax = (LinearLayout) findViewById(R.id.ll_phone_or_email);
        this.l = (FeedbackNoticeView) findViewById(R.id.feedback_problem_noticeView);
        ag();
        this.an.getPaint().setFakeBoldText(true);
        this.ak.getPaint().setFakeBoldText(true);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void m() {
        this.ap.b(this);
        ah();
        this.ak.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.h.setOnClickListener(this);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void l() throws Throwable {
        this.l.b(FeedbackNoticeView.c.PROGRESS);
        ai();
        if (!com.huawei.phoneservice.faq.base.util.d.c(this)) {
            a(FaqConstants.FaqErrorCode.INTERNET_ERROR);
            return;
        }
        try {
            this.aa = AsCache.get(this, "feedback");
        } catch (IOException | RuntimeException e2) {
            com.huawei.phoneservice.faq.base.util.g.a("ProblemSuggestActivity_", e2.getMessage());
        }
        SafeIntent safeIntent = new SafeIntent(getIntent());
        try {
            c(safeIntent.hasExtra("problem_info") ? (ProblemInfo) safeIntent.getParcelableExtra("problem_info") : null);
            this.e.setChecked(this.n);
            boolean zIsChecked = this.e.isChecked();
            this.m = zIsChecked;
            this.z.setShowLog(zIsChecked);
            com.huawei.phoneservice.faq.base.util.g.c("ProblemSuggestActivity_", "   init data isChooseZip：" + this.m);
        } catch (Exception e3) {
            com.huawei.phoneservice.faq.base.util.g.c("ProblemSuggestActivity_", e3.getMessage());
            this.l.setVisibility(8);
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int[] k() {
        return new int[]{R.id.ll_category, R.id.txt_style, R.id.txt_style_2, R.id.grid_styles, R.id.ll_description, R.id.rl_description, R.id.ll_contact, R.id.problem_suggest_tv_privacy, R.id.edit_contact, R.id.cbx_log};
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int j() {
        return R.layout.feedback_sdk_activity_problem_suggest;
    }

    @Override // com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter.b
    public void f() {
        z();
    }

    public void a(List<com.huawei.phoneservice.feedback.entity.d> list) {
        int size = list == null ? 0 : list.size();
        String[] strArr = new String[size];
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = list.get(i3).e;
            if (list.get(i3).f21644b.equals(this.z.getParentId())) {
                i2 = i3;
            }
        }
        a(this, getString(R.string.feedback_sdk_problem_type), getString(R.string.feedback_sdk_common_cancel), strArr, i2, new z(list));
    }

    public void e(String str) {
        long filesSize = this.m ? this.z.getFilesSize() + this.z.getLogsSize() : this.z.getFilesSize();
        if (filesSize == 0) {
            filesSize = 1;
        }
        a(filesSize, new e(), new d());
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void e() {
        d(R.string.feedback_sdk_common_in_submission);
        this.j.setVisibility(0);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void c(String str) {
        com.huawei.phoneservice.faq.base.util.l.e(this, str);
        Log.e("ProblemSuggestActivity_", "showToast...." + str);
        if (this.s) {
            this.i.setEnabled(true);
        }
        this.s = false;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.e
    public FeedbackBean c() {
        return this.z;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void b(List<com.huawei.phoneservice.feedback.entity.d> list) throws Throwable {
        AsCache asCache;
        u();
        this.p.setVisibility(0);
        this.l.setVisibility(8);
        boolean zAs = as();
        this.q = zAs;
        if (!zAs && (asCache = this.aa) != null && !this.x) {
            String asString = asCache.getAsString("feedBackCache");
            if (!TextUtils.isEmpty(asString)) {
                FeedbackBean feedbackBean = (FeedbackBean) new GsonBuilder().registerTypeAdapter(Uri.class, new UriDeserializer()).create().fromJson(asString, FeedbackBean.class);
                this.z = feedbackBean;
                if (feedbackBean != null) {
                    this.u = true;
                    feedbackBean.setLogsSize(0L);
                } else {
                    FeedbackBean feedbackBean2 = new FeedbackBean();
                    this.z = feedbackBean2;
                    feedbackBean2.setShowLog(this.n);
                }
            }
        }
        d(list);
        ao();
        if (this.z.haveMedias()) {
            this.ac.b(this);
            this.ap.d(this.z.getMedias());
        }
        if (this.q) {
            g();
        } else if (this.u) {
            ap();
        }
    }

    @Override // com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter.b
    public void b(int i2) {
        a(this.z, i2);
        this.z.remove(i2);
        this.ap.d(this.z.getMedias());
        this.r.setAdapter((ListAdapter) this.ap);
        this.ac.b(this);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public FeedbackInfo b() {
        return this.z.getInfo();
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void a(boolean z2) {
        StringBuilder sb = new StringBuilder("isCompress()  ");
        sb.append(z2);
        sb.append(" ");
        sb.append((this.ai || this.af) ? false : true);
        com.huawei.phoneservice.faq.base.util.g.e("ProblemSuggestActivity_", sb.toString());
        boolean z3 = !z2;
        this.ae = z3;
        if (this.ai || this.af) {
            return;
        }
        this.i.setEnabled(z3);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void a(String str) {
        AlertDialog alertDialog = this.d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.d.dismiss();
        }
        if (TextUtils.isEmpty(this.z.getSrCode())) {
            c(getString(!TextUtils.isEmpty(this.z.getProblemId()) ? R.string.feedback_sdk_commit_successs : R.string.feedback_sdk_submit_successs));
        }
        String problemId = TextUtils.isEmpty(this.z.getProblemId()) ? str : this.z.getProblemId();
        this.z.setProblemId(str);
        SdkProblemListener sdkListener = com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener();
        this.i.setEnabled(false);
        this.j.setVisibility(0);
        this.j.postDelayed(new f(sdkListener, str, problemId), 2000L);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void a(com.huawei.phoneservice.feedback.utils.a aVar) {
        int i2;
        this.af = false;
        this.k = (this.n && !this.o) || (this.t && this.m) || (this.s && this.m);
        StringBuilder sb = new StringBuilder("zipCompressFinished  ");
        sb.append(this.n);
        sb.append(" ");
        sb.append(!this.o);
        sb.append(" ");
        sb.append(this.t);
        sb.append(" ");
        sb.append(this.s);
        sb.append(" ");
        sb.append(this.m);
        sb.append(" ");
        sb.append(aVar.toString());
        com.huawei.phoneservice.faq.base.util.g.e("ProblemSuggestActivity_", sb.toString());
        if (aVar == com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_SUCCESS) {
            this.ae = true;
            this.ai = false;
            if (this.k) {
                i2 = R.string.feedback_sdk_zipcompresssuccess;
                d(i2);
            }
        } else if (aVar == com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_FAILED) {
            this.ae = false;
            this.ai = true;
            if (this.k) {
                i2 = R.string.feedback_sdk_zipcompressfailed;
                d(i2);
            }
        }
        new Handler().postDelayed(new o(aVar), 500L);
    }

    public void d(com.huawei.phoneservice.feedback.entity.d dVar) {
        List<com.huawei.phoneservice.feedback.entity.a> list;
        int size = (dVar == null || (list = dVar.f21645c) == null) ? 0 : list.size();
        String[] strArr = new String[size];
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = dVar.f21645c.get(i3).f21639b;
            if (dVar.f21645c.get(i3).f21640c.equals(this.z.getChildId())) {
                i2 = i3;
            }
        }
        if (dVar == null) {
            return;
        }
        a(this, dVar.e, getString(R.string.feedback_sdk_common_cancel), strArr, i2, new b(dVar));
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.a
    public void a(FaqConstants.FaqErrorCode faqErrorCode) {
        FeedbackBean feedbackBean;
        u();
        if (faqErrorCode == FaqConstants.FaqErrorCode.INTERNET_ERROR) {
            this.l.e(faqErrorCode);
            this.l.setVisibility(0);
            this.l.setEnabled(true);
            return;
        }
        this.v = true;
        this.l.setVisibility(8);
        this.am.setVisibility(8);
        if (this.ah == 0 && (feedbackBean = this.z) != null) {
            feedbackBean.setProblemType("1004003", null);
        }
        FeedbackBean feedbackBean2 = this.z;
        if (feedbackBean2 != null && !TextUtils.isEmpty(feedbackBean2.getProblemId())) {
            this.ag = false;
            invalidateOptionsMenu();
        } else if (ModuleConfigUtils.feedbackHistoryEnabled() && !com.huawei.phoneservice.faq.base.util.k.b(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"))) {
            this.ag = true;
            invalidateOptionsMenu();
            if (this.ad <= 0) {
                af();
            }
        }
        if (ModuleConfigUtils.feedbackContactEnabled()) {
            this.ax.setVisibility(0);
        }
        this.ar.setText(this.z.getProblemDesc());
        this.av.setText(this.z.getContact());
        ao();
    }

    @Override // com.huawei.phoneservice.feedback.adapter.ProblemSuggestPhotoAdapter.b
    public void a(int i2) {
        FeedbackBean feedbackBean = this.z;
        if (feedbackBean != null) {
            a(feedbackBean.getMediaItem(i2));
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.b
    public void a() {
        String srCode = this.z.getSrCode();
        AsCache asCache = this.aa;
        if (asCache != null) {
            asCache.remove(TextUtils.isEmpty(srCode) ? "lastSubmit" : "lastSubmit_srCode");
        }
        this.f.setVisibility(8);
        this.j.setVisibility(8);
        al();
    }

    public void h() {
        a(getString(R.string.feedback_sdk_tips_upload_waiting_or_exit_new), null, null, new j(), new g());
        this.ac.g();
    }

    public void g() {
        a(getString(R.string.feedback_sdk_tips_continue_to_submit), getString(R.string.feedback_sdk_appupdate3_continue), getString(R.string.feedback_sdk_common_cancel), new a(), new h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.huawei.phoneservice.feedback.mvp.presenter.c y() {
        com.huawei.phoneservice.feedback.mvp.presenter.c cVar = new com.huawei.phoneservice.feedback.mvp.presenter.c(this, this, this);
        this.ac = cVar;
        return cVar;
    }

    private void i(List<com.huawei.phoneservice.feedback.entity.d> list) {
        TextView textView;
        String str;
        List<com.huawei.phoneservice.feedback.entity.a> list2;
        this.aq.setVisibility(8);
        this.ak.setVisibility(0);
        this.ak.setEnabled(true);
        if (TextUtils.isEmpty(this.z.getProblemType()) || list == null) {
            return;
        }
        for (com.huawei.phoneservice.feedback.entity.d dVar : list) {
            String str2 = dVar.f21644b;
            if (str2 != null && str2.equals(this.z.getParentId())) {
                if (!TextUtils.isEmpty(this.z.getChildId()) && (list2 = dVar.f21645c) != null && !list2.isEmpty()) {
                    for (com.huawei.phoneservice.feedback.entity.a aVar : dVar.f21645c) {
                        String str3 = aVar.f21640c;
                        if (str3 != null && str3.equals(this.z.getChildId())) {
                            textView = this.ak;
                            str = aVar.f21639b;
                        }
                    }
                    return;
                }
                textView = this.ak;
                str = dVar.e;
                textView.setText(str);
                return;
            }
        }
    }

    private void j(List<com.huawei.phoneservice.feedback.entity.d> list) {
        this.aq.setVisibility(0);
        this.ak.setVisibility(8);
        this.aq.setLayoutManager(new AutoLineLayoutManager());
        com.huawei.phoneservice.feedback.adapter.f fVar = new com.huawei.phoneservice.feedback.adapter.f(list, this);
        this.as = fVar;
        fVar.a(new k(list));
        this.aq.setAdapter(this.as);
        if (TextUtils.isEmpty(this.z.getProblemType())) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.huawei.phoneservice.feedback.entity.d dVar = list.get(i2);
            if (dVar != null && dVar.f21644b.equals(this.z.getParentId())) {
                this.as.d(i2);
                this.ak.setText(dVar.e);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        Intent intent = new Intent(this, (Class<?>) FeedbackSubmitSuccessActivity.class);
        intent.putExtra("problemId", str);
        startActivity(intent);
        AsCache asCache = this.aa;
        if (asCache != null) {
            asCache.remove("feedBackCache");
        }
        finish();
    }

    private void d(List<com.huawei.phoneservice.feedback.entity.d> list) {
        if (TextUtils.isEmpty(this.z.getSrCode())) {
            this.an.setVisibility(0);
            this.al.setVisibility(8);
            if (e(list)) {
                if (this.ah == 1) {
                    c(list);
                }
                i(list);
            } else {
                j(list);
            }
            if (!TextUtils.isEmpty(this.z.getProblemId())) {
                this.ag = false;
                invalidateOptionsMenu();
            } else if (!com.huawei.phoneservice.faq.base.util.k.b(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken")) && ModuleConfigUtils.feedbackHistoryEnabled()) {
                this.ag = true;
                invalidateOptionsMenu();
                if (this.ad <= 0) {
                    af();
                }
            }
            this.ax.setVisibility(8);
            if (ModuleConfigUtils.feedbackContactEnabled()) {
                this.ax.setVisibility(0);
            }
        } else {
            this.ak.setVisibility(8);
            if (TextUtils.isEmpty(this.z.getProblemName())) {
                this.an.setVisibility(8);
                this.al.setVisibility(8);
                this.aq.setVisibility(8);
            } else {
                this.an.setVisibility(0);
                this.al.setVisibility(0);
                this.aq.setVisibility(8);
                this.al.setText(this.z.getProblemName());
            }
            this.ag = false;
            invalidateOptionsMenu();
            this.ax.setVisibility(8);
        }
        this.ar.setText(this.z.getProblemDesc());
        this.ar.setSelection(this.z.getProblemDesc().length());
        this.ap.d(this.z.getMedias());
        this.av.setText(this.z.getContact());
        this.e.setChecked(this.z.getShowLog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.queryNotice(this, str, new y(QueryNoticeResponse.class, this));
    }

    private boolean e(List<com.huawei.phoneservice.feedback.entity.d> list) {
        if (list == null) {
            return false;
        }
        for (com.huawei.phoneservice.feedback.entity.d dVar : list) {
            if (dVar != null && !com.huawei.phoneservice.faq.base.util.d.c(dVar.f21645c) && dVar.f21645c.size() > 0) {
                return true;
            }
        }
        return false;
    }

    private void d(int i2) {
        this.aj.setVisibility(0);
        this.aj.setText(i2);
        this.f.setVisibility(0);
        this.i.setEnabled(false);
    }

    private void c(List<com.huawei.phoneservice.feedback.entity.d> list) {
        List<com.huawei.phoneservice.feedback.entity.a> list2;
        for (com.huawei.phoneservice.feedback.entity.d dVar : list) {
            if (!TextUtils.isEmpty(this.z.getChildId()) && (list2 = dVar.f21645c) != null && !list2.isEmpty()) {
                Iterator<com.huawei.phoneservice.feedback.entity.a> it = dVar.f21645c.iterator();
                while (it.hasNext()) {
                    String str = it.next().f21640c;
                    if (str != null && str.equals(this.z.getChildId())) {
                        this.z.setParentId(dVar.f21644b);
                        break;
                    }
                }
            }
        }
    }

    private void d(View view, boolean z2) {
        String string;
        EditText editText = (EditText) view;
        if (editText == null) {
            return;
        }
        if (z2) {
            CharSequence hint = editText.getHint();
            if (hint != null) {
                editText.setTag(hint.toString());
            }
            string = "";
        } else {
            Object tag = editText.getTag();
            if (tag == null) {
                return;
            } else {
                string = tag.toString();
            }
        }
        editText.setHint(string);
    }

    private void c(ProblemInfo problemInfo) throws Throwable {
        if (problemInfo != null && problemInfo.isInteract()) {
            this.ah = 2;
            this.z = new FeedbackBean(problemInfo.getSrCode(), problemInfo.getProblemId(), problemInfo.getProblemType(), problemInfo.getProblemType(), problemInfo.getProblemName());
            b(this.ac.d());
            return;
        }
        if (problemInfo == null || !problemInfo.isDetail()) {
            this.ad = problemInfo == null ? 0 : problemInfo.getUnread();
            this.ah = 0;
            if (this.z == null) {
                this.z = new FeedbackBean();
            }
        } else {
            this.ah = 1;
            if (this.z == null) {
                this.z = new FeedbackBean(problemInfo.getProblemId(), problemInfo.getProblemType(), problemInfo.getProblemType(), problemInfo.getContact());
            }
        }
        this.ac.a((Context) this, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ar() throws Throwable {
        String string;
        Resources resources;
        int i2;
        FeedbackBean feedbackBean = this.z;
        if (feedbackBean == null) {
            return;
        }
        if (!TextUtils.isEmpty(feedbackBean.getSrCode()) || !TextUtils.isEmpty(this.z.getProblemType())) {
            if (!TextUtils.isEmpty(this.z.getProblemDesc()) && this.z.getProblemDesc().trim().length() >= this.w) {
                if (this.ax.getVisibility() == 0) {
                    String contact = this.z.getContact();
                    if (this.ab || !TextUtils.isEmpty(contact)) {
                        boolean zIsEmail = FaqRegexMatches.isEmail(contact);
                        boolean zIsMobile = FaqRegexMatches.isMobile(contact);
                        String string2 = getResources().getString(R.string.feedback_sdk_problem_please_check_phone_email_formatted);
                        if (this.ab) {
                            if (!TextUtils.isEmpty(contact) && !zIsEmail && !zIsMobile) {
                                c(string2);
                                return;
                            }
                        } else if (!zIsEmail && !zIsMobile) {
                            c(string2);
                            return;
                        }
                    } else {
                        resources = getResources();
                        i2 = R.string.feedback_sdk_problem_phone_email;
                    }
                }
                r();
                return;
            }
            string = getString(R.string.feedback_sdk_feedback_desc_hint, new Object[]{Integer.valueOf(this.w)});
            c(string);
        }
        resources = getResources();
        i2 = R.string.feedback_sdk_problem_choose_question_type;
        string = resources.getString(i2);
        c(string);
    }

    private void ao() {
        if (ModuleConfigUtils.feedbackLogEnabled()) {
            if (!TextUtils.isEmpty(this.z.getSrCode()) || TextUtils.isEmpty(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID))) {
                this.f21737b.setVisibility(8);
                return;
            }
            this.f21737b.setVisibility(0);
            if (0 == this.z.getLogsSize()) {
                am();
            }
        }
    }

    private void ap() {
        a(getString(R.string.feedback_sdk_tips_continue_edit), getString(R.string.feedback_sdk_common_yes), getString(R.string.feedback_sdk_common_no), new p(), new r());
    }

    private boolean as() throws Throwable {
        if (this.aa == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.z.getSrCode())) {
            String asString = this.aa.getAsString("lastSubmit_srCode");
            if (!TextUtils.isEmpty(asString)) {
                FeedbackBean feedbackBean = (FeedbackBean) new GsonBuilder().registerTypeAdapter(Uri.class, new UriDeserializer()).create().fromJson(asString, FeedbackBean.class);
                if (this.z.getSrCode().equals(feedbackBean.getSrCode())) {
                    this.z = feedbackBean;
                    return true;
                }
            }
        } else if (TextUtils.isEmpty(this.z.getProblemId())) {
            String asString2 = this.aa.getAsString("lastSubmit");
            if (!TextUtils.isEmpty(asString2)) {
                this.z = (FeedbackBean) new GsonBuilder().registerTypeAdapter(Uri.class, new UriDeserializer()).create().fromJson(asString2, FeedbackBean.class);
                return true;
            }
        }
        return false;
    }

    private void an() {
        a(getString(R.string.feedback_sdk_tips_save_edit), getString(R.string.feedback_sdk_common_yes), getString(R.string.feedback_sdk_common_no), new t(), new s());
    }

    private void ak() {
        this.av.setOnTouchListener(new c(null));
        try {
            int i2 = Integer.parseInt(com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_MIN_DESC_INPUT));
            this.w = i2;
            if (i2 < 1 || i2 > 10) {
                this.w = 10;
            }
        } catch (NumberFormatException unused) {
            this.w = 10;
        }
        EditText editText = this.ar;
        Resources resources = getResources();
        int i3 = R.plurals.feedback_sdk_problem_question_info_update;
        int i4 = this.w;
        editText.setHint(resources.getQuantityString(i3, i4, Integer.valueOf(i4)));
        this.ar.setOnTouchListener(new u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        ZipUtil.deleteFile(new File(FeedbackWebConstants.getZipFilePath(this)));
        boolean z2 = (this.n && !this.o) || this.t || this.s;
        this.k = z2;
        if (z2) {
            d(R.string.feedback_sdk_zipcompressing);
        }
        new Handler().postDelayed(new m(), 500L);
    }

    private void al() {
        this.i.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        if (!this.y) {
            this.i.setEnabled(this.ae);
        } else {
            this.i.setEnabled(true);
            this.y = false;
        }
    }

    private void ag() {
        CharInputFilter charInputFilter = new CharInputFilter("[&<>\"'()\"\\n\" ]");
        EmojiFilter emojiFilter = new EmojiFilter();
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(500);
        InputFilter.LengthFilter lengthFilter2 = new InputFilter.LengthFilter(100);
        this.ar.setFilters(new InputFilter[]{lengthFilter, new com.huawei.phoneservice.faq.base.util.e()});
        this.av.setFilters(new InputFilter[]{charInputFilter, emojiFilter, lengthFilter2});
        this.ar.setOnFocusChangeListener(this);
        this.av.setOnFocusChangeListener(this);
        this.e.setOnCheckedChangeListener(new n());
        findViewById(R.id.cbx_text).setOnClickListener(new q());
        ak();
    }

    private void ah() {
        this.ar.addTextChangedListener(new x());
        this.av.addTextChangedListener(new w());
    }

    private void ae() {
        GridView gridView;
        int i2;
        this.r = (GridView) findViewById(R.id.list_media);
        ProblemSuggestPhotoAdapter problemSuggestPhotoAdapter = new ProblemSuggestPhotoAdapter(this);
        this.ap = problemSuggestPhotoAdapter;
        this.r.setAdapter((ListAdapter) problemSuggestPhotoAdapter);
        this.r.setNumColumns(x());
        String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_HIDE_ADD_ATTACHMENT);
        if (sdk == null || !"Y".equals(sdk.toUpperCase(Locale.ROOT))) {
            gridView = this.r;
            i2 = 0;
        } else {
            gridView = this.r;
            i2 = 8;
        }
        gridView.setVisibility(i2);
    }

    private void af() {
        com.huawei.phoneservice.feedbackcommon.utils.e.a().getUnread(this, "", new i());
    }

    private void ai() {
        if (!ModuleConfigUtils.feedbackLogEnabled() || !ModuleConfigUtils.feedbackNoticeEnabled()) {
            this.g.setVisibility(8);
            return;
        }
        String lowerCase = Locale.getDefault().getLanguage().toLowerCase(Locale.ENGLISH);
        if (MLAsrConstants.LAN_ZH.equals(lowerCase)) {
            lowerCase = Locale.getDefault().toLanguageTag().contains("zh-Hant") ? "zh-tw" : "zh-cn";
        }
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.queryIsoLanguage(this, lowerCase, new v(QueryIsoLanguageResponse.class, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        this.z.setParentId("");
        this.z.setChildId("");
        this.z.setProblemDesc("");
        a(this.z);
        List<MediaItem> medias = this.z.getMedias();
        if (medias != null) {
            medias.clear();
        }
        this.ac.c();
        this.z.setContact("");
        this.z.setShowLog(this.n);
        com.huawei.phoneservice.feedback.adapter.f fVar = this.as;
        if (fVar != null) {
            fVar.d(-1);
        }
        this.ak.setText("");
        this.ar.setText(this.z.getProblemDesc());
        this.ap.d(this.z.getMedias());
        this.av.setText(this.z.getContact());
        this.e.setChecked(this.z.getShowLog());
        AlertDialog alertDialog = this.d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() throws Throwable {
        this.s = true;
        Gson gsonCreate = this.z.haveMedias() ? new GsonBuilder().registerTypeAdapter(Uri.class, new UriSerializer()).create() : new Gson();
        this.z.setProblemName((this.ah == 2 ? this.al : this.ak).getText().toString());
        String srCode = this.z.getSrCode();
        AsCache asCache = this.aa;
        if (asCache != null) {
            asCache.put(TextUtils.isEmpty(srCode) ? "lastSubmit" : "lastSubmit_srCode", gsonCreate.toJson(this.z), 172800);
        }
        com.huawei.phoneservice.faq.base.util.i.a().onClick(getClass().getName(), "Submit", this.z);
        this.ac.b(0, 0);
        this.ac.b(this, this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        FeedbackBean feedbackBean;
        AlertDialog alertDialog = this.d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        a(this.z);
        String srCode = this.z.getSrCode();
        AsCache asCache = this.aa;
        if (asCache != null) {
            asCache.remove(TextUtils.isEmpty(srCode) ? "lastSubmit" : "lastSubmit_srCode");
        }
        if (this.f21737b.getVisibility() == 0) {
            this.e.setChecked(this.z.getShowLog());
        }
        if (TextUtils.isEmpty(this.z.getSrCode())) {
            com.huawei.phoneservice.feedback.adapter.f fVar = this.as;
            if (fVar != null) {
                fVar.d(-1);
            }
            this.ak.setText("");
            feedbackBean = new FeedbackBean();
        } else {
            String problemId = this.z.getProblemId();
            String problemType = this.z.getProblemType();
            feedbackBean = new FeedbackBean(srCode, problemId, problemType, problemType, this.z.getProblemName());
        }
        this.z = feedbackBean;
        this.ac.c();
        this.z.setShowLog(this.n);
        this.e.setChecked(this.n);
        com.huawei.phoneservice.faq.base.util.g.e("ProblemSuggestActivity_", "break cancel " + this.z.getLogsSize() + " " + this.z.getShowLog() + " " + this.m);
        d(this.ac.d());
        this.q = false;
        if (this.z.getShowLog()) {
            am();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() throws Throwable {
        Gson gsonCreate = new GsonBuilder().registerTypeAdapter(Uri.class, new UriSerializer()).create();
        FeedbackBean feedbackBean = this.z;
        if (feedbackBean != null) {
            feedbackBean.setContact("");
        }
        AsCache asCache = this.aa;
        if (asCache != null) {
            asCache.put(this, "feedBackCache", gsonCreate.toJson(this.z));
        }
    }

    private void r() throws Throwable {
        this.j.setVisibility(0);
        if (this.af && this.m) {
            this.s = true;
            d(R.string.feedback_sdk_zipcompressing);
            return;
        }
        if (this.ai && this.m) {
            this.j.setVisibility(8);
            this.s = false;
            c(getResources().getString(R.string.feedback_sdk_zipcompressfailed));
            this.h.setVisibility(0);
            this.i.setEnabled(false);
            return;
        }
        if (!NetworkUtils.isNetworkConnected(this)) {
            this.j.setVisibility(8);
            c(getResources().getString(R.string.feedback_sdk_no_network));
        } else if ((!this.z.haveMedias() && (0 == this.z.getLogsSize() || !this.m)) || NetworkUtils.isWifiConnected(this)) {
            aa();
        } else {
            this.j.setVisibility(8);
            e("wifi");
        }
    }

    class i implements OnReadListener {
        @Override // com.huawei.phoneservice.feedbackcommon.utils.OnReadListener
        public void read(Throwable th, String str) {
        }

        @Override // com.huawei.phoneservice.feedbackcommon.utils.OnReadListener
        public void unread(Throwable th, String str, int i) {
            ProblemSuggestActivity.this.ad = i;
            ProblemSuggestActivity.this.invalidateOptionsMenu();
        }

        i() {
        }
    }

    class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            if (com.huawei.phoneservice.faq.base.util.q.b(view)) {
                return;
            }
            ProblemSuggestActivity.this.w();
            ProblemSuggestActivity.this.s = true;
            com.huawei.phoneservice.faq.base.util.g.e("ProblemSuggestActivity_", "break submit " + ProblemSuggestActivity.this.z.getLogsSize() + " " + ProblemSuggestActivity.this.z.getShowLog() + " " + ProblemSuggestActivity.this.m);
            if (!ProblemSuggestActivity.this.z.getShowLog()) {
                ProblemSuggestActivity.this.aa();
            } else {
                ProblemSuggestActivity.this.j.setVisibility(0);
                ProblemSuggestActivity.this.am();
            }
        }

        a() {
        }
    }

    class ab implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.huawei.phoneservice.faq.base.util.q.b(view) || !ProblemSuggestActivity.this.ac.e() || ProblemSuggestActivity.this.j.getVisibility() == 0) {
                return;
            }
            ProblemSuggestActivity.this.ad = 0;
            ProblemSuggestActivity.this.invalidateOptionsMenu();
            ProblemSuggestActivity.this.startActivity(new Intent(ProblemSuggestActivity.this, (Class<?>) FeedListActivity.class));
            com.huawei.phoneservice.faq.base.util.i.a().onClick(ProblemSuggestActivity.this.getClass().getName(), "Click", ProblemSuggestActivity.this.z);
        }

        ab() {
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.phoneservice.feedback.entity.d f21740b;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            TextView textView;
            String str;
            com.huawei.phoneservice.feedback.entity.a aVar = this.f21740b.f21645c.get(i);
            boolean zEquals = aVar.f21640c.equals(ProblemSuggestActivity.this.z.getChildId());
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            FeedbackBean feedbackBean = ProblemSuggestActivity.this.z;
            if (!zEquals) {
                feedbackBean.setProblemType(this.f21740b.f21644b, aVar.f21640c);
                textView = ProblemSuggestActivity.this.ak;
                str = aVar.f21639b;
            } else {
                feedbackBean.setProblemType(null, null);
                textView = ProblemSuggestActivity.this.ak;
                str = "";
            }
            textView.setText(str);
        }

        b(com.huawei.phoneservice.feedback.entity.d dVar) {
            this.f21740b = dVar;
        }
    }

    static class c implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }

        /* synthetic */ c(n nVar) {
            this();
        }

        private c() {
        }
    }

    class d implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlertDialog alertDialog = ProblemSuggestActivity.this.d;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }

        d() {
        }
    }

    class e implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            if (com.huawei.phoneservice.faq.base.util.q.b(view)) {
                return;
            }
            ProblemSuggestActivity.this.w();
            ProblemSuggestActivity.this.aa();
        }

        e() {
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21742a;
        final /* synthetic */ SdkProblemListener d;
        final /* synthetic */ String e;

        @Override // java.lang.Runnable
        public void run() {
            SdkProblemListener sdkProblemListener = this.d;
            if (sdkProblemListener != null) {
                sdkProblemListener.onSubmitResult(0, this.e, this.f21742a, ProblemSuggestActivity.this.z.getSrCode(), null);
            }
            if (com.huawei.phoneservice.faq.base.util.k.b(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken")) || ProblemSuggestActivity.this.ah != 0) {
                Intent intent = new Intent();
                intent.putExtra("parentProblemId", this.f21742a);
                intent.putExtra("problemId", this.e);
                intent.putExtra("srCode", ProblemSuggestActivity.this.z.getSrCode());
                ProblemSuggestActivity.this.setResult(-1, intent);
                if (ProblemSuggestActivity.this.aa != null) {
                    ProblemSuggestActivity.this.aa.remove("feedBackCache");
                }
                ProblemSuggestActivity.this.finish();
                return;
            }
            ProblemSuggestActivity.this.h(this.e);
        }

        f(SdkProblemListener sdkProblemListener, String str, String str2) {
            this.d = sdkProblemListener;
            this.e = str;
            this.f21742a = str2;
        }
    }

    class g implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.huawei.phoneservice.faq.base.util.q.b(view)) {
                return;
            }
            ProblemSuggestActivity.this.w();
            ProblemSuggestActivity.this.ac.h();
            com.huawei.phoneservice.faq.base.util.i.a().onClick(ProblemSuggestActivity.this.getClass().getName(), "Cancel", ProblemSuggestActivity.this.z);
        }

        g() {
        }
    }

    class h implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.huawei.phoneservice.faq.base.util.q.b(view)) {
                return;
            }
            ProblemSuggestActivity.this.ac();
        }

        h() {
        }
    }

    class j implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.huawei.phoneservice.faq.base.util.q.b(view)) {
                return;
            }
            ProblemSuggestActivity.this.w();
            ProblemSuggestActivity.this.ac.f();
            com.huawei.phoneservice.faq.base.util.i.a().onClick(ProblemSuggestActivity.this.getClass().getName(), "Quit", ProblemSuggestActivity.this.z);
        }

        j() {
        }
    }

    class k implements com.huawei.phoneservice.feedback.adapter.f.c {
        final /* synthetic */ List d;

        @Override // com.huawei.phoneservice.feedback.adapter.f.c
        public void a(int i) {
            if (i < 0) {
                ProblemSuggestActivity.this.z.setProblemType(null, null);
                ProblemSuggestActivity.this.ak.setText("");
            } else {
                com.huawei.phoneservice.feedback.entity.d dVar = (com.huawei.phoneservice.feedback.entity.d) this.d.get(i);
                ProblemSuggestActivity.this.z.setProblemType(dVar.f21644b, null);
                ProblemSuggestActivity.this.ak.setText(dVar.e);
            }
        }

        k(List list) {
            this.d = list;
        }
    }

    class l implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ProblemSuggestActivity.this.af = true;
            ProblemSuggestActivity.this.ac.j();
        }

        l() {
        }
    }

    class m implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ProblemSuggestActivity.this.af = true;
            ProblemSuggestActivity.this.ac.j();
        }

        m() {
        }
    }

    class n implements CompoundButton.OnCheckedChangeListener {
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ProblemSuggestActivity.this.m = z;
            boolean z2 = true;
            if (!z) {
                ProblemSuggestActivity.this.o = true;
                ProblemSuggestActivity.this.h.setVisibility(8);
                ProblemSuggestActivity.this.aj.setVisibility(8);
                ProblemSuggestActivity.this.f.setVisibility(8);
                ProblemSuggestActivity.this.aj();
                ProblemSuggestActivity.this.t = false;
            }
            ProblemSuggestActivity problemSuggestActivity = ProblemSuggestActivity.this;
            if ((!problemSuggestActivity.n || ProblemSuggestActivity.this.o) && !ProblemSuggestActivity.this.t && !ProblemSuggestActivity.this.s) {
                z2 = false;
            }
            problemSuggestActivity.k = z2;
            ProblemSuggestActivity.this.z.setShowLog(z);
        }

        n() {
        }
    }

    class o implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.phoneservice.feedback.utils.a f21749c;

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ProblemSuggestActivity.this.f.setVisibility(8);
            boolean z = true;
            ProblemSuggestActivity.this.i.setEnabled(true);
            com.huawei.phoneservice.feedback.utils.a aVar = this.f21749c;
            com.huawei.phoneservice.feedback.utils.a aVar2 = com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_SUCCESS;
            if ((aVar != aVar2 || !ProblemSuggestActivity.this.q) && (this.f21749c != aVar2 || (!ProblemSuggestActivity.this.s && !ProblemSuggestActivity.this.t))) {
                z = false;
            }
            if (this.f21749c != com.huawei.phoneservice.feedback.utils.a.ZIP_COMPRESS_FAILED) {
                if (z) {
                    ProblemSuggestActivity.this.ar();
                    return;
                }
                return;
            }
            ProblemSuggestActivity.this.j.setVisibility(8);
            if (ProblemSuggestActivity.this.m) {
                if (ProblemSuggestActivity.this.s || ((ProblemSuggestActivity.this.n && !ProblemSuggestActivity.this.o) || ProblemSuggestActivity.this.t)) {
                    ProblemSuggestActivity.this.i.setEnabled(false);
                    ProblemSuggestActivity.this.h.setVisibility(0);
                }
            }
        }

        o(com.huawei.phoneservice.feedback.utils.a aVar) {
            this.f21749c = aVar;
        }
    }

    class p implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlertDialog alertDialog;
            if (com.huawei.phoneservice.faq.base.util.q.b(view) || (alertDialog = ProblemSuggestActivity.this.d) == null) {
                return;
            }
            alertDialog.dismiss();
        }

        p() {
        }
    }

    class q implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ProblemSuggestActivity.this.e.setChecked(!ProblemSuggestActivity.this.e.isChecked());
        }

        q() {
        }
    }

    class r implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.huawei.phoneservice.faq.base.util.q.b(view) || ProblemSuggestActivity.this.z == null) {
                return;
            }
            if (ProblemSuggestActivity.this.aa != null) {
                ProblemSuggestActivity.this.aa.remove("feedBackCache");
            }
            ProblemSuggestActivity.this.ad();
        }

        r() {
        }
    }

    class s implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.huawei.phoneservice.faq.base.util.q.b(view)) {
                return;
            }
            if (ProblemSuggestActivity.this.aa != null) {
                ProblemSuggestActivity.this.aa.remove("feedBackCache");
            }
            ProblemSuggestActivity problemSuggestActivity = ProblemSuggestActivity.this;
            problemSuggestActivity.a(problemSuggestActivity.z);
            ProblemSuggestActivity.this.finish();
        }

        s() {
        }
    }

    class t implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            if (com.huawei.phoneservice.faq.base.util.q.b(view)) {
                return;
            }
            ProblemSuggestActivity.this.ab();
            ProblemSuggestActivity.this.finish();
        }

        t() {
        }
    }

    class u implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.getId() == R.id.edit_desc && com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.e(ProblemSuggestActivity.this.ar)) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return false;
        }

        u() {
        }
    }

    class v extends FaqCallback<QueryIsoLanguageResponse> {
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, QueryIsoLanguageResponse queryIsoLanguageResponse) {
            if (th == null && queryIsoLanguageResponse != null) {
                String langCode = queryIsoLanguageResponse.getLangCode();
                if (!TextUtils.isEmpty(langCode)) {
                    ProblemSuggestActivity.this.i(langCode);
                    return;
                }
            }
            ProblemSuggestActivity.this.g.setVisibility(8);
        }

        v(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    class w implements TextWatcher {
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
            if (ProblemSuggestActivity.this.z != null) {
                String strTrim = ProblemSuggestActivity.this.av.getText().toString().trim();
                if (strTrim.length() >= 100) {
                    editText = ProblemSuggestActivity.this.av;
                    i = R.drawable.feedback_sdk_problem_max_num_rectangle_bg;
                } else {
                    editText = ProblemSuggestActivity.this.av;
                    i = R.drawable.feedback_sdk_problem_rectangle_bg;
                }
                editText.setBackgroundResource(i);
                ProblemSuggestActivity.this.z.setContact(strTrim);
            }
        }

        w() {
        }
    }

    class x implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (ProblemSuggestActivity.this.z != null) {
                String strTrim = ProblemSuggestActivity.this.ar.getText().toString().trim();
                ProblemSuggestActivity.this.z.setProblemDesc(strTrim);
                int length = strTrim.length();
                ProblemSuggestActivity.this.ao.setTextColor(ContextCompat.getColor(ProblemSuggestActivity.this, length >= 500 ? R.color.feedback_sdk_problem_question_max_number : R.color.feedback_sdk_problem_question_number));
                ProblemSuggestActivity.this.ao.setText(String.format(ProblemSuggestActivity.this.getResources().getString(R.string.feedback_sdk_problem_input_number), Integer.valueOf(length), 500));
            }
        }

        x() {
        }
    }

    class y extends FaqCallback<QueryNoticeResponse> {
        /* JADX WARN: Code duplicated, block: B:8:0x002d  */
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, QueryNoticeResponse queryNoticeResponse) {
            TextView textView;
            int i;
            if (th != null || queryNoticeResponse == null) {
                textView = ProblemSuggestActivity.this.g;
                i = 8;
            } else {
                String content = queryNoticeResponse.getContent();
                if (TextUtils.isEmpty(content)) {
                    textView = ProblemSuggestActivity.this.g;
                    i = 8;
                } else {
                    ProblemSuggestActivity.this.g.setText(Html.fromHtml(content));
                    ClickUrlSpan.a(ProblemSuggestActivity.this.g);
                    textView = ProblemSuggestActivity.this.g;
                    i = 0;
                }
            }
            textView.setVisibility(i);
        }

        y(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    class z implements DialogInterface.OnClickListener {
        final /* synthetic */ List d;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            List list = this.d;
            if (list == null || i < 0 || i >= list.size()) {
                return;
            }
            com.huawei.phoneservice.feedback.entity.d dVar = (com.huawei.phoneservice.feedback.entity.d) this.d.get(i);
            boolean zEquals = dVar.f21644b.equals(ProblemSuggestActivity.this.z.getParentId());
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            List<com.huawei.phoneservice.feedback.entity.a> list2 = dVar.f21645c;
            if (list2 != null && list2.size() > 0) {
                ProblemSuggestActivity.this.d(dVar);
            } else if (!zEquals) {
                ProblemSuggestActivity.this.z.setProblemType(dVar.f21644b, null);
                ProblemSuggestActivity.this.ak.setText(dVar.e);
            } else {
                ProblemSuggestActivity.this.z.setProblemType(null, null);
                ProblemSuggestActivity.this.ak.setText("");
            }
        }

        z(List list) {
            this.d = list;
        }
    }

    private boolean o() {
        FeedbackBean feedbackBean;
        if (this.ah != 0 || (feedbackBean = this.z) == null) {
            return false;
        }
        return ((this.v || TextUtils.isEmpty(feedbackBean.getParentId())) && TextUtils.isEmpty(this.z.getProblemDesc()) && !this.z.haveMedias()) ? false : true;
    }
}
