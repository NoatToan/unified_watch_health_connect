package com.huawei.phoneservice.feedback.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.VideoCallBack;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.l;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.adapter.FeedDetailAdapter;
import com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity;
import com.huawei.phoneservice.feedback.mvp.base.FeedbackCITListView;
import com.huawei.phoneservice.feedback.utils.SdkFeedbackProblemManager;
import com.huawei.phoneservice.feedback.widget.FeedbackNoticeView;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRateRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackResponse;
import com.huawei.phoneservice.feedbackcommon.entity.ProblemInfo;
import com.huawei.phoneservice.feedbackcommon.photolibrary.MimeType;
import com.huawei.phoneservice.feedbackcommon.photolibrary.internal.entity.MediaItem;
import com.huawei.phoneservice.feedbackcommon.utils.NetworkUtils;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FeedDetailsActivity extends FeedbackBaseActivity<com.huawei.phoneservice.feedback.mvp.contract.b> implements com.huawei.phoneservice.feedback.mvp.contract.c, FeedDetailAdapter.f, View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FeedbackCITListView f21700b;
    private Button e;
    private String f;
    private FeedDetailAdapter g;
    private FeedBackResponse.ProblemEnity h;
    private FeedbackNoticeView i;
    private com.huawei.phoneservice.feedback.mvp.presenter.b j;
    private boolean k;

    @Override // com.huawei.phoneservice.feedback.mvp.contract.c
    public void setThrowableView(Throwable th) {
        this.i.a(th);
        this.i.setEnabled(true);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.c
    public void setErrorView(FaqConstants.FaqErrorCode faqErrorCode) {
        if (FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR.equals(faqErrorCode)) {
            this.i.c(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, R.drawable.feedback_sdk_ic_no_search_result);
            this.i.e(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
            this.i.a(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_loading_empty_icon_size));
            this.i.setShouldHideContactUsButton(true);
            this.i.getNoticeTextView().setText(getResources().getString(R.string.faq_sdk_data_error_text));
        } else {
            this.i.e(faqErrorCode);
        }
        this.i.setEnabled(true);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("CacheMap", i.d().getMapOnSaveInstance());
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity, com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            i.d().saveMapOnSaveInstanceState(new SafeBundle(bundle).getString("CacheMap"));
        }
        super.onCreate(bundle);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        g();
        if (com.huawei.phoneservice.faq.base.util.d.d()) {
            this.g.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (q.b(view) || this.e != view || this.h == null) {
            return;
        }
        ProblemInfo problemInfo = new ProblemInfo(this.f, this.h.getProblemCatalogCode());
        problemInfo.setContact(this.h.getContact());
        if (this.k) {
            SdkFeedbackProblemManager.getManager().gotoProductSuggest(this, problemInfo, 1);
        } else {
            SdkFeedbackProblemManager.getManager().gotoFeedback(this, problemInfo, 1);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            this.j.c(c());
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void n() {
        setTitle(getResources().getString(R.string.feedback_sdk_question_detail_title));
        this.f21700b = (FeedbackCITListView) findViewById(R.id.lv_chatlist);
        this.e = (Button) findViewById(R.id.continuefeed_btn);
        this.i = (FeedbackNoticeView) findViewById(R.id.noticeview_feeddetail);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void m() {
        this.i.setOnClickListener(new e());
        this.e.setOnClickListener(this);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void l() {
        this.i.b(FeedbackNoticeView.c.PROGRESS);
        this.k = new SafeIntent(getIntent()).getBooleanExtra("COME_FROM", false);
        this.g = new FeedDetailAdapter(this, this.k);
        if (com.huawei.phoneservice.faq.base.util.d.c(this)) {
            e();
            g();
        } else {
            this.i.e(FaqConstants.FaqErrorCode.INTERNET_ERROR);
            this.i.setEnabled(true);
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int[] k() {
        return new int[]{R.id.lv_chatlist};
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int j() {
        return R.layout.feedback_sdk_activity_feeddetails;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.c
    public void d() {
        if (this.h != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.h);
            this.g.a(arrayList);
        }
        this.i.setVisibility(8);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.c
    public void c(com.huawei.phoneservice.feedback.entity.c cVar) {
        cVar.e().setEnabled(true);
        cVar.b().setEnabled(true);
        l.e(this, getResources().getString(R.string.faq_sdk_common_server_disconnected));
    }

    @Override // com.huawei.phoneservice.feedback.adapter.FeedDetailAdapter.f
    public void b(com.huawei.phoneservice.feedback.entity.c cVar) {
        e("1", true, cVar);
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.c
    public void a(boolean z, com.huawei.phoneservice.feedback.entity.c cVar) {
        TextView textViewI;
        Resources resources;
        int i;
        if (cVar.a() == 0) {
            try {
                this.g.a(0).setScore(cVar.d());
            } catch (Exception e2) {
                g.c("FeedDetailsActivity", e2.getMessage());
            }
        }
        cVar.j().setVisibility(0);
        if (z) {
            cVar.b().setVisibility(8);
            cVar.e().setImageResource(R.drawable.feedback_sdk_ic_comment_useful_gray);
            textViewI = cVar.i();
            resources = getResources();
            i = R.string.feedback_sdk_question_details_evalua_yes;
        } else {
            cVar.e().setVisibility(8);
            cVar.b().setImageResource(R.drawable.feedback_sdk_ic_comment_useless_gray);
            textViewI = cVar.i();
            resources = getResources();
            i = R.string.feedback_sdk_question_details_evalua_no;
        }
        textViewI.setText(resources.getString(i));
    }

    @Override // com.huawei.phoneservice.feedback.adapter.FeedDetailAdapter.f
    public void a(List<MediaItem> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return;
        }
        a(list.get(i));
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.c
    public void a(List<FeedBackResponse.ProblemEnity> list) {
        ArrayList arrayList = new ArrayList();
        this.i.setVisibility(8);
        FeedBackResponse.ProblemEnity problemEnity = this.h;
        if (problemEnity != null) {
            arrayList.add(problemEnity);
        }
        arrayList.addAll(list);
        this.g.a(arrayList);
    }

    @Override // com.huawei.phoneservice.feedback.adapter.FeedDetailAdapter.f
    public void a(String str, String str2, ImageView imageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView2, long j) {
        if (!NetworkUtils.isNetworkConnected(this)) {
            l.e(this, getResources().getString(R.string.feedback_sdk_no_network));
            imageView2.setVisibility(0);
        } else if (!MimeType.isVideoFromUrl(str) || NetworkUtils.isWifiConnected(this)) {
            this.j.d(str, a(imageView, relativeLayout, relativeLayout2, imageView2), str2, com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
        } else {
            b(str, str2, relativeLayout, relativeLayout2, imageView, imageView2, j);
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.contract.c
    public void a(FeedBackResponse.ProblemEnity problemEnity) {
        this.h = problemEnity;
        this.j.c(c());
    }

    @Override // com.huawei.phoneservice.feedback.adapter.FeedDetailAdapter.f
    public void a(com.huawei.phoneservice.feedback.entity.c cVar) {
        e("0", false, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.phoneservice.feedback.mvp.base.FeedbackBaseActivity
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.huawei.phoneservice.feedback.mvp.contract.b y() {
        com.huawei.phoneservice.feedback.mvp.presenter.b bVar = new com.huawei.phoneservice.feedback.mvp.presenter.b(this);
        this.j = bVar;
        return bVar;
    }

    private void e(String str, boolean z, com.huawei.phoneservice.feedback.entity.c cVar) {
        if (!com.huawei.phoneservice.faq.base.util.d.c(this)) {
            l.e(this, getResources().getString(R.string.feedback_sdk_no_network_toast));
            return;
        }
        FeedBackRateRequest feedBackRateRequest = new FeedBackRateRequest();
        feedBackRateRequest.setAccessToken(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
        feedBackRateRequest.setProblemId(cVar.c());
        feedBackRateRequest.setScore(str);
        cVar.b().setEnabled(false);
        cVar.e().setEnabled(false);
        this.j.c(feedBackRateRequest, z, cVar);
    }

    private void b(String str, String str2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, ImageView imageView2, long j) {
        a(j, new d(str, imageView, relativeLayout, relativeLayout2, imageView2, str2), new c(imageView2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoCallBack a(ImageView imageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView2) {
        relativeLayout.setVisibility(8);
        relativeLayout2.setVisibility(0);
        return new b(imageView, imageView2, relativeLayout, relativeLayout2);
    }

    private void g() {
        if (this.e.getMeasuredWidth() < com.huawei.phoneservice.faq.base.util.d.b((Context) this)) {
            com.huawei.phoneservice.feedback.photolibrary.internal.utils.e.a(this, this.e);
        }
    }

    class b implements VideoCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f21701a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f21703c;
        final /* synthetic */ ImageView d;
        final /* synthetic */ ImageView e;

        class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f21704b;

            @Override // java.lang.Runnable
            public void run() {
                if (this.f21704b != null) {
                    b.this.e.setVisibility(0);
                    Glide.with(FeedDetailsActivity.this.getApplicationContext()).load(this.f21704b).into(b.this.e);
                } else {
                    b.this.d.setVisibility(0);
                    b.this.f21701a.setVisibility(0);
                }
                b.this.f21703c.setVisibility(8);
            }

            c(File file) {
                this.f21704b = file;
            }
        }

        @Override // com.huawei.phoneservice.faq.base.util.VideoCallBack
        public void setChangeImage(File file, boolean z) {
            FeedDetailsActivity.this.runOnUiThread(new c(file));
        }

        b(ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
            this.e = imageView;
            this.d = imageView2;
            this.f21701a = relativeLayout;
            this.f21703c = relativeLayout2;
        }
    }

    private void e() {
        this.j.d(this);
        b();
        this.f21700b.setLayoutManager(new LinearLayoutManager(this));
        this.g.b(this);
        this.f21700b.setAdapter(this.g);
        this.j.a(c());
    }

    class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f21705b;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            FeedDetailsActivity.this.w();
            this.f21705b.setVisibility(0);
        }

        c(ImageView imageView) {
            this.f21705b = imageView;
        }
    }

    class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f21707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f21708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f21709c;
        final /* synthetic */ ImageView d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            FeedDetailsActivity.this.w();
            FeedDetailsActivity.this.j.d(this.e, FeedDetailsActivity.this.a(this.f21707a, this.f21708b, this.f21709c, this.d), this.f, com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
        }

        d(String str, ImageView imageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView2, String str2) {
            this.e = str;
            this.f21707a = imageView;
            this.f21708b = relativeLayout;
            this.f21709c = relativeLayout2;
            this.d = imageView2;
            this.f = str2;
        }
    }

    class e implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            FeedDetailsActivity.this.l();
        }

        e() {
        }
    }

    private FeedBackRequest c() {
        FeedBackRequest feedBackRequest = new FeedBackRequest();
        feedBackRequest.setAccessToken(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("accessToken"));
        feedBackRequest.setProblemId(this.f);
        feedBackRequest.setStartWith(null);
        feedBackRequest.setPageSize(50);
        feedBackRequest.setProblemSourceCode(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("channel"));
        feedBackRequest.setOrderType(1);
        return feedBackRequest;
    }

    private void b() {
        SafeIntent safeIntent = new SafeIntent(getIntent());
        this.f = safeIntent.getStringExtra("questionId");
        this.k = safeIntent.getBooleanExtra("COME_FROM", false);
    }
}
