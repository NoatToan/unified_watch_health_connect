package com.huawei.ui.main.stories.me.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.suggestion.util.FitnessItemDecoration;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.userprofile.DeleteAccountCheckRsp;
import com.huawei.hwcloudmodel.model.userprofile.RefusalText;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.irz;
import defpackage.lqo;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DeregisterServiceActivity extends BaseActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f28409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnBackPressedCallback f28410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f28411c;
    private HealthButton d;
    private Context e;
    private Handler f = new e(this);
    private HealthRecycleView g;
    private CustomTitleBar h;
    private HealthTextView i;
    private b j;
    private LinearLayout k;
    private HealthTextView m;
    private HealthTextView n;
    private DeleteAccountCheckRsp o;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackgroundDrawableResource(R.color.series_top_big_image_foreground);
        setContentView(R.layout.activity_deregister_service_layout);
        this.e = this;
        d();
        e();
    }

    private void d() {
        this.h = (CustomTitleBar) findViewById(R.id.title_main_bar);
        this.i = (HealthTextView) findViewById(R.id.no_benefit_tv);
        this.k = (LinearLayout) findViewById(R.id.user_benefits_ll_layout);
        this.f28409a = (HealthButton) findViewById(R.id.deregister_button);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.notice_remove_benefits);
        SpannableString spannableString = new SpannableString(getString(R.string.IDS_deregister_notice_benefits_new));
        b(spannableString, 0, spannableString.length());
        healthTextView.setText(spannableString);
        ((HealthTextView) findViewById(R.id.notice_tv_num_1)).setText(getString(R.string.IDS_deregister_notice_1_title, new Object[]{1}));
        ((HealthTextView) findViewById(R.id.notice_tv_num_2)).setText(getString(R.string.IDS_deregister_notice_2_title, new Object[]{2}));
        this.n = (HealthTextView) findViewById(R.id.notice_tv_num_2_detail);
        this.m = (HealthTextView) findViewById(R.id.notice_tv_4_detail);
        g();
        ((HealthTextView) findViewById(R.id.notice_tv_num_3)).setText(getString(R.string.IDS_deregister_notice_3_title, new Object[]{3}));
        ((HealthTextView) findViewById(R.id.notice_tv_num_4)).setText(getString(R.string.IDS_deregister_notice_4_title, new Object[]{4}));
        ((HealthTextView) findViewById(R.id.notice_tv_num_5)).setText(getString(R.string.IDS_deregister_notice_5_title, new Object[]{5}));
        this.f28409a.setOnClickListener(this);
        this.f28409a.setEnabled(false);
        this.f28409a.setBackgroundResource(R.drawable.button_background_emphasize_disable);
        HealthButton healthButton = (HealthButton) findViewById(R.id.cancel_button);
        this.d = healthButton;
        healthButton.setOnClickListener(this);
        ((HealthCheckBox) findViewById(R.id.read_note_checkbox)).setOnCheckedChangeListener(this);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
        c();
        coordinatorLayout.setOnClickListener(this);
        this.f28410b = new OnBackPressedCallback(true) { // from class: com.huawei.ui.main.stories.me.activity.DeregisterServiceActivity.3
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                ReleaseLogUtil.c("DeregisterServiceActivity", "enter handleOnBackPressed");
                if (DeregisterServiceActivity.this.b()) {
                    DeregisterServiceActivity.this.f28411c.setVisibility(8);
                } else {
                    DeregisterServiceActivity.this.finish();
                }
            }
        };
        getOnBackPressedDispatcher().addCallback(this.f28410b);
    }

    private void g() {
        int i;
        Context context = this.e;
        if (Utils.o()) {
            if (irz.j()) {
                i = R.string.IDS_deregister_notice_2_detail_part_oversea;
            } else {
                i = R.string.IDS_deregister_notice_2_detail_part_russia;
            }
        } else {
            i = R.string.IDS_deregister_notice_2_detail_part_china;
        }
        String string = context.getString(i);
        this.n.setText(LoginInit.getInstance(this.e).isMinorAccount() ? getString(R.string.IDS_deregister_notice_2_detail_new_kid) : getString(R.string.IDS_deregister_notice_2_detail_new, new Object[]{string}));
        this.m.setText(this.e.getString(Utils.o() ? R.string.IDS_deregister_notice_4_detail_oversea : R.string.IDS_deregister_notice_4_detail));
    }

    private void c() {
        this.h.setTitleBarBackgroundColor(qre.e(R.color.hw_hongmeng_bg));
        if (LanguageUtil.ba(this.e)) {
            this.h.setRightButtonDrawable(qqz.e(this.e, R.drawable.ic_deregister_cancle), qre.f(R.string.accessibility_cancel));
            this.h.setLeftButtonDrawable(qqz.e(this.e, R.drawable.ic_deregister_back), qre.f(R.string.accessibility_go_back));
        } else {
            this.h.setRightButtonDrawable(qre.c(R.drawable.ic_deregister_cancle), qre.f(R.string.accessibility_cancel));
            this.h.setLeftButtonDrawable(qre.c(R.drawable.ic_deregister_back), qre.f(R.string.accessibility_go_back));
        }
        this.h.setRightButtonVisibility(0);
        this.h.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.DeregisterServiceActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DeregisterServiceActivity.this.b()) {
                    DeregisterServiceActivity.this.f28411c.setVisibility(8);
                } else {
                    DeregisterServiceActivity.this.finish();
                }
            }
        });
        this.h.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.DeregisterServiceActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DeregisterServiceActivity.this.b()) {
                    DeregisterServiceActivity.this.f28411c.setVisibility(8);
                } else {
                    DeregisterServiceActivity.this.finish();
                }
            }
        });
    }

    private void b(SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new StyleSpan(1), i, i2, 18);
        spannableString.setSpan(new ForegroundColorSpan(qre.e(R.color.doctor_card_message_text_color)), i, i2, 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        LinearLayout linearLayout = this.f28411c;
        return linearLayout != null && linearLayout.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LogUtil.a("DeregisterServiceActivity", "refreshCheck enter");
        this.i.setVisibility(8);
        for (int i = 0; i < list.size(); i++) {
            this.k.addView(e(this.e, list.get(i)));
            if (i < list.size() - 1) {
                this.k.addView(e(this.e));
            }
        }
    }

    private void e() {
        LogUtil.a("DeregisterServiceActivity", "initBenefitsData enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: vtt
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        });
    }

    public /* synthetic */ void a() {
        d(new c(this));
    }

    private HealthTextView e(Context context, String str) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.cardMarginStart));
        HealthTextView healthTextView = new HealthTextView(context);
        SpannableString spannableString = new SpannableString(str);
        b(spannableString, 0, spannableString.length());
        healthTextView.setTypeface(Typeface.create(getString(R.string.textFontFamilyRegular), 1));
        qsp.c(healthTextView, getResources().getDimension(R.dimen.textSizeBody1), 0);
        healthTextView.setText(spannableString);
        healthTextView.setLayoutParams(layoutParams);
        return healthTextView;
    }

    private HealthDivider e(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cardMarginStart);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.cardMarginEnd);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.emui_card_device_4dp);
        layoutParams.setMargins(0, dimensionPixelSize3, 0, dimensionPixelSize3);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize2);
        HealthDivider healthDivider = new HealthDivider(context);
        healthDivider.setLayoutParams(layoutParams);
        return healthDivider;
    }

    private void d(final IBaseResponseCallback iBaseResponseCallback) {
        lqo.b(BaseApplication.b()).b(new ResultCallback<DeleteAccountCheckRsp>() { // from class: com.huawei.ui.main.stories.me.activity.DeregisterServiceActivity.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(DeleteAccountCheckRsp deleteAccountCheckRsp) {
                ReleaseLogUtil.c("DeregisterServiceActivity", "getCurrentBenefits success deleteAccountCheckRsp:", deleteAccountCheckRsp.toString());
                if (iBaseResponseCallback == null) {
                    return;
                }
                if (deleteAccountCheckRsp.getResultCode().intValue() == 0) {
                    iBaseResponseCallback.a(0, deleteAccountCheckRsp);
                } else {
                    iBaseResponseCallback.a(deleteAccountCheckRsp.getResultCode().intValue(), null);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.b("DeregisterServiceActivity", "getCurrentBenefits fail:", th.getMessage());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(201000, null);
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.deregister_button) {
            if (!CommonUtil.ab(this.e)) {
                qpx.e(this.e, R.string.IDS_device_hygride_current_network_unavailable);
                return;
            }
            DeleteAccountCheckRsp deleteAccountCheckRsp = this.o;
            if (deleteAccountCheckRsp != null && deleteAccountCheckRsp.getIfAllow().intValue() == 1) {
                setResult(-1);
                finish();
                return;
            } else {
                i();
                return;
            }
        }
        if (id == R.id.cancel_button) {
            finish();
        } else {
            LogUtil.a("DeregisterServiceActivity", "onClick id:", Integer.valueOf(id));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ReleaseLogUtil.c("DeregisterServiceActivity", "onCheckedChanged isChecked ", Boolean.valueOf(z));
        this.f28409a.setEnabled(z);
        this.f28409a.setBackgroundResource(z ? R.drawable.button_background_emphasize : R.drawable.button_background_emphasize_disable);
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<DeregisterServiceActivity> f28416b;

        c(DeregisterServiceActivity deregisterServiceActivity) {
            this.f28416b = new WeakReference<>(deregisterServiceActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            DeleteAccountCheckRsp deleteAccountCheckRsp = obj instanceof DeleteAccountCheckRsp ? (DeleteAccountCheckRsp) obj : null;
            if (deleteAccountCheckRsp == null) {
                ReleaseLogUtil.d("DeregisterServiceActivity", "getCurrentBenefits userBenefits == null");
                return;
            }
            DeregisterServiceActivity deregisterServiceActivity = this.f28416b.get();
            if (deregisterServiceActivity == null) {
                return;
            }
            ReleaseLogUtil.c("DeregisterServiceActivity", "userBenefits=" + deleteAccountCheckRsp.toString());
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.obj = deleteAccountCheckRsp;
            deregisterServiceActivity.f.sendMessage(messageObtain);
        }
    }

    private void i() {
        ReleaseLogUtil.c("DeregisterServiceActivity", "enter showRecycleView ");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_benefits_show_notice);
        this.f28411c = linearLayout;
        linearLayout.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.derigister_reason_show_title);
        this.g = (HealthRecycleView) findViewById(R.id.reason_recycleview);
        this.j = new b(this.e);
        HealthLinearLayoutManager healthLinearLayoutManager = new HealthLinearLayoutManager(this);
        healthLinearLayoutManager.setOrientation(1);
        this.g.setLayoutManager(healthLinearLayoutManager);
        this.g.addItemDecoration(new FitnessItemDecoration(this, 0, qrs.e(this, getResources().getDimension(R.dimen.cardMarginMiddle))));
        this.g.setAdapter(this.j);
        DeleteAccountCheckRsp deleteAccountCheckRsp = this.o;
        if (deleteAccountCheckRsp == null || deleteAccountCheckRsp.getRefusalDetails() == null || this.o.getRefusalDetails().size() == 0) {
            healthTextView.setVisibility(8);
        } else {
            this.j.e(this.o.getRefusalDetails());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(OpAnalyticsConstants.DELETE_ACCOUNT_CHECK_IFALLOW_STATUS, String.valueOf(i));
        OpAnalyticsUtil.getInstance().setEventWithReportImmediately(OperationKey.HEALTH_APP_USER_DERIGISTER_SERVICE_2129033.value(), linkedHashMap);
    }

    static class e extends BaseHandler<DeregisterServiceActivity> {
        e(DeregisterServiceActivity deregisterServiceActivity) {
            super(deregisterServiceActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(DeregisterServiceActivity deregisterServiceActivity, Message message) {
            if (message.what == 100 && (message.obj instanceof DeleteAccountCheckRsp)) {
                deregisterServiceActivity.o = (DeleteAccountCheckRsp) message.obj;
                if (deregisterServiceActivity.o == null) {
                    return;
                }
                List<String> currentBenefits = deregisterServiceActivity.o.getCurrentBenefits();
                int iIntValue = deregisterServiceActivity.o.getIfAllow().intValue();
                deregisterServiceActivity.e(currentBenefits);
                deregisterServiceActivity.e(iIntValue);
            }
        }
    }

    static class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f28414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LayoutInflater f28415b;
        private List<RefusalText> d = new ArrayList(10);

        b(Context context) {
            this.f28415b = LayoutInflater.from(context);
            this.f28414a = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new d(this.f28415b.inflate(R.layout.item_my_benefits, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            RefusalText refusalText = i < this.d.size() ? this.d.get(i) : null;
            if (refusalText == null || viewHolder == null) {
                LogUtil.j("DeregisterServiceActivity", "onBindViewHolder mRefusalText or holder is null");
            } else if (viewHolder instanceof d) {
                d dVar = (d) viewHolder;
                dVar.f28418b.setText(refusalText.getTitle());
                dVar.f28417a.setText(refusalText.getContent());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<RefusalText> list = this.d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public void e(List<RefusalText> list) {
            if (list == null) {
                return;
            }
            if (njy.b(this.d)) {
                this.d.clear();
            }
            this.d = list;
            notifyDataSetChanged();
        }
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f28417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f28418b;

        d(View view) {
            super(view);
            this.f28418b = (HealthTextView) view.findViewById(R.id.benefits_title);
            this.f28417a = (HealthTextView) view.findViewById(R.id.benefits_subtitle);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
