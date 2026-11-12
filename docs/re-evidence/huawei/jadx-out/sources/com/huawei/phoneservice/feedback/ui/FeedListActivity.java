package com.huawei.phoneservice.feedback.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.l;
import com.huawei.phoneservice.faq.base.util.p;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity;
import com.huawei.phoneservice.feedback.mvp.base.FeedbackNoMoreDrawable;
import com.huawei.phoneservice.feedback.widget.FeedbackNoticeView;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackResponse;
import com.huawei.phoneservice.feedbackcommon.utils.NetworkUtils;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FeedListActivity extends FeedbackBaseActivity<com.huawei.phoneservice.feedback.mvp.contract.d> implements com.huawei.phoneservice.feedback.mvp.contract.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f21710b;
    private com.huawei.phoneservice.feedback.mvp.presenter.e e;
    private LinearLayout f;
    private TextView g;
    private com.huawei.phoneservice.feedback.adapter.a h;
    private View i;
    private FeedbackNoticeView j;
    private String k;
    private TextView n;
    private Space o;
    private int s;
    private boolean l = false;
    private FeedbackNoMoreDrawable m = null;
    private boolean q = false;
    private int t = -1;
    private boolean p = false;
    private float r = 0.0f;
    private AbsListView.OnScrollListener w = new d();
    private AdapterView.OnItemClickListener u = new a();

    @Override // com.huawei.phoneservice.feedback.mvp.contract.e
    public void showErrorToast() {
        l.e(this, getString(R.string.feedback_sdk_common_server_disconnected_toast));
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.e
    public void setThrowableView(Throwable th) {
        if (TextUtils.isEmpty(this.k)) {
            this.j.a(th);
            this.j.setEnabled(true);
        } else {
            this.f21710b.removeFooterView(this.i);
            this.l = false;
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.e
    public void setErrorView(FaqConstants.FaqErrorCode faqErrorCode) {
        if (!TextUtils.isEmpty(this.k)) {
            this.f21710b.removeFooterView(this.i);
            this.l = false;
            return;
        }
        if (FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR.equals(faqErrorCode)) {
            this.j.c(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, R.drawable.feedback_sdk_ic_no_search_result);
            this.j.e(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
            this.j.a(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_loading_empty_icon_size));
            this.j.setShouldHideContactUsButton(true);
            this.j.getNoticeTextView().setText(getResources().getString(R.string.faq_sdk_data_error_text));
        } else {
            this.j.e(faqErrorCode);
        }
        this.j.setEnabled(true);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("CacheMap", com.huawei.phoneservice.faq.base.util.i.d().getMapOnSaveInstance());
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.p && c()) {
            menu.clear();
            getMenuInflater().inflate(R.menu.feedback_sdk_feed_list_menu_item, menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null) {
            return true;
        }
        if (menuItem.getItemId() == R.id.menu_feed_list_cancel) {
            h();
        }
        if (menuItem.getItemId() == R.id.menu_feed_list_delete) {
            g();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity, com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            com.huawei.phoneservice.faq.base.util.i.d().saveMapOnSaveInstanceState(new SafeBundle(bundle).getString("CacheMap"));
        }
        super.onCreate(bundle);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        if (this.p) {
            invalidateOptionsMenu();
            f();
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void n() {
        setTitle(getResources().getString(R.string.feedback_sdk_question_history_title));
        this.f21710b = (ListView) findViewById(R.id.lv_feedlist);
        this.j = (FeedbackNoticeView) findViewById(R.id.noticeview_feedlist);
        this.f = (LinearLayout) findViewById(R.id.feed_list_option_host);
        this.g = (TextView) findViewById(R.id.feed_list_tv_cancel);
        this.o = (Space) findViewById(R.id.feed_list_space);
        this.n = (TextView) findViewById(R.id.feed_list_tv_delete);
        com.huawei.phoneservice.feedback.adapter.a aVar = new com.huawei.phoneservice.feedback.adapter.a();
        this.h = aVar;
        this.f21710b.setAdapter((ListAdapter) aVar);
        this.i = LayoutInflater.from(this).inflate(R.layout.feedback_sdk_list_footer_layout, (ViewGroup) null);
        this.m = new FeedbackNoMoreDrawable(this);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void m() {
        this.f21710b.setOnScrollListener(this.w);
        this.f21710b.setOnItemClickListener(this.u);
        this.j.setOnClickListener(new e());
        this.f21710b.setOnItemLongClickListener(new c());
        this.g.setOnClickListener(new b());
        this.n.setOnClickListener(new i());
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void l() {
        this.j.b(FeedbackNoticeView.c.PROGRESS);
        this.j.setEnabled(false);
        if (!com.huawei.phoneservice.faq.base.util.d.c(this)) {
            setErrorView(FaqConstants.FaqErrorCode.INTERNET_ERROR);
            this.j.setEnabled(true);
            return;
        }
        this.k = null;
        this.l = false;
        try {
            this.s = Integer.valueOf(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk(FaqConstants.FEEDBACK_ODERTYPE)).intValue();
        } catch (NumberFormatException e2) {
            this.s = 3;
            com.huawei.phoneservice.faq.base.util.g.a("FeedListActivity", e2.getMessage());
        }
        this.e.b(this);
        this.e.c(a());
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int j() {
        return R.layout.feedback_sdk_activity_feedlist;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.e
    public void deleteLocalData() {
        com.huawei.phoneservice.feedback.mvp.presenter.e eVar;
        com.huawei.phoneservice.feedback.adapter.a aVar = this.h;
        if (aVar == null) {
            return;
        }
        aVar.a(this.t);
        h();
        if (this.h.getCount() < 50 && this.k != null && (eVar = this.e) != null) {
            eVar.c(a());
        } else if (this.h.getCount() <= 0) {
            setErrorView(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.e
    public void a(List<FeedBackResponse.ProblemEnity> list, List<FeedBackResponse.ProblemEnity> list2) {
        boolean z;
        for (FeedBackResponse.ProblemEnity problemEnity : list2) {
            if (problemEnity != null) {
                problemEnity.setSelectMode(this.p);
            }
        }
        this.j.setVisibility(8);
        if (TextUtils.isEmpty(this.k)) {
            this.h.a(list2);
        } else {
            this.h.c(list2);
        }
        if (list.size() >= 50) {
            this.k = list.get(49).getProblemId();
            z = true;
        } else {
            this.k = null;
            z = false;
        }
        this.l = z;
        if (this.f21710b.getFooterViewsCount() > 0) {
            this.f21710b.removeFooterView(this.i);
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f21710b.setOverscrollFooter(this.m);
        }
        this.h.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.huawei.phoneservice.feedback.mvp.contract.d y() {
        com.huawei.phoneservice.feedback.mvp.presenter.e eVar = new com.huawei.phoneservice.feedback.mvp.presenter.e(this);
        this.e = eVar;
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2) {
        com.huawei.phoneservice.feedback.adapter.a aVar = this.h;
        if (aVar == null) {
            return;
        }
        for (FeedBackResponse.ProblemEnity problemEnity : aVar.e()) {
            if (problemEnity != null) {
                problemEnity.setSelectMode(true);
                problemEnity.setChecked(false);
            }
        }
        if (this.h.getItem(i2) != null) {
            this.h.getItem(i2).setChecked(true);
        }
        this.h.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(int i2) {
        return i2 == 0 && this.h != null && this.f21710b.getLastVisiblePosition() == this.h.getCount() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        a(new g(), new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        HwColumnSystem hwColumnSystem = new HwColumnSystem(getApplicationContext());
        int iJ = hwColumnSystem.j();
        if (iJ == 4) {
            this.f.setVisibility(0);
            this.o.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = -1;
            return;
        }
        if (iJ != 8) {
            if (iJ == 12) {
                this.f.setVisibility(8);
                invalidateOptionsMenu();
                return;
            }
            return;
        }
        this.f.setVisibility(0);
        this.o.setVisibility(8);
        ViewGroup.LayoutParams layoutParams2 = this.f.getLayoutParams();
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.width = (int) ((hwColumnSystem.f() * 6.0f) + (hwColumnSystem.b() * 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        com.huawei.phoneservice.feedback.adapter.a aVar = this.h;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.p = false;
        this.r = 0.0f;
        for (FeedBackResponse.ProblemEnity problemEnity : this.h.e()) {
            if (problemEnity != null) {
                problemEnity.setSelectMode(false);
                problemEnity.setChecked(false);
            }
        }
        this.h.notifyDataSetChanged();
        this.f.setVisibility(8);
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ListView listView = this.f21710b;
        if (listView == null) {
            return;
        }
        listView.post(new j());
    }

    class d implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (FeedListActivity.this.c(i) && FeedListActivity.this.l) {
                FeedListActivity.this.l = false;
                FeedListActivity.this.e.c(FeedListActivity.this.a());
            }
        }

        d() {
        }
    }

    private boolean c() {
        return new HwColumnSystem(getApplicationContext()).j() == 12;
    }

    class a implements AdapterView.OnItemClickListener {
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            FeedBackResponse.ProblemEnity problemEnity;
            if (!FeedListActivity.this.p) {
                if (q.b(view) || (problemEnity = (FeedBackResponse.ProblemEnity) adapterView.getAdapter().getItem(i)) == null) {
                    return;
                }
                problemEnity.setIsRead(true);
                FeedListActivity.this.h.notifyDataSetChanged();
                FeedListActivity.this.q = new SafeIntent(FeedListActivity.this.getIntent()).getBooleanExtra("COME_FROM", false);
                Intent intent = new Intent(FeedListActivity.this, (Class<?>) FeedDetailsActivity.class);
                intent.putExtra("questionId", problemEnity.getProblemId());
                intent.putExtra("COME_FROM", FeedListActivity.this.q);
                FeedListActivity.this.startActivity(intent);
                return;
            }
            if (FeedListActivity.this.h == null || FeedListActivity.this.h.e() == null) {
                return;
            }
            FeedListActivity.this.t = i;
            for (FeedBackResponse.ProblemEnity problemEnity2 : FeedListActivity.this.h.e()) {
                if (problemEnity2 != null) {
                    problemEnity2.setChecked(false);
                }
            }
            if (FeedListActivity.this.h.getItem(i) != null) {
                FeedListActivity.this.h.getItem(i).setChecked(true);
            }
            FeedListActivity.this.h.notifyDataSetChanged();
        }

        a() {
        }
    }

    class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedListActivity.this.h();
        }

        b() {
        }
    }

    class c implements AdapterView.OnItemLongClickListener {
        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (FeedListActivity.this.h != null && FeedListActivity.this.h.e() != null) {
                FeedListActivity.this.p = true;
                FeedListActivity.this.t = i;
                if (view != null) {
                    FeedListActivity.this.r = view.getY();
                }
                FeedListActivity.this.d(i);
                FeedListActivity.this.f();
                FeedListActivity.this.b();
            }
            return true;
        }

        c() {
        }
    }

    class e implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            FeedListActivity.this.l();
        }

        e() {
        }
    }

    class f implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedListActivity.this.w();
            if (NetworkUtils.isNetworkConnected(FeedListActivity.this)) {
                FeedListActivity.this.d();
            } else {
                FeedListActivity feedListActivity = FeedListActivity.this;
                l.e(feedListActivity, feedListActivity.getString(R.string.feedback_sdk_no_network));
            }
        }

        f() {
        }
    }

    class g implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedListActivity.this.w();
        }

        g() {
        }
    }

    class i implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedListActivity.this.g();
        }

        i() {
        }
    }

    class j implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ListView listView;
            int i;
            float fE;
            if (FeedListActivity.this.t >= FeedListActivity.this.f21710b.getLastVisiblePosition()) {
                listView = FeedListActivity.this.f21710b;
                i = FeedListActivity.this.t;
                fE = FeedListActivity.this.r - p.e(FeedListActivity.this.getApplicationContext(), 56.0f);
            } else {
                listView = FeedListActivity.this.f21710b;
                i = FeedListActivity.this.t;
                fE = FeedListActivity.this.r;
            }
            listView.setSelectionFromTop(i, (int) fE);
        }

        j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FeedBackRequest a() {
        if (!TextUtils.isEmpty(this.k)) {
            this.f21710b.setOverscrollFooter(null);
            this.f21710b.addFooterView(this.i);
            this.h.notifyDataSetChanged();
        }
        FeedBackRequest feedBackRequest = new FeedBackRequest();
        feedBackRequest.setAccessToken(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
        feedBackRequest.setProblemId(null);
        feedBackRequest.setStartWith(this.k);
        feedBackRequest.setPageSize(50);
        feedBackRequest.setProblemSourceCode(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("channel"));
        feedBackRequest.setOrderType(this.s);
        return feedBackRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        FeedBackResponse.ProblemEnity item;
        com.huawei.phoneservice.feedback.mvp.presenter.e eVar;
        com.huawei.phoneservice.feedback.adapter.a aVar = this.h;
        if (aVar == null || (item = aVar.getItem(this.t)) == null || TextUtils.isEmpty(item.getProblemId()) || (eVar = this.e) == null) {
            return;
        }
        eVar.e(item.getProblemId());
    }
}
