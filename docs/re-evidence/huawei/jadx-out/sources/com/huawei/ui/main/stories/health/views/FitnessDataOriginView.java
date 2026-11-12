package com.huawei.ui.main.stories.health.views;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.fitnessdata.DataOriginListAdapter;
import defpackage.iov;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qji;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.uif;
import defpackage.uin;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class FitnessDataOriginView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataOriginListAdapter f28175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListView f28177c;
    private int d;
    private Handler e;
    private HealthTextView f;
    private boolean g;
    private CommonSingleCallback<Boolean> h;
    private List<uif> i;
    private HealthTextView j;
    private String o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FitnessDataOriginView(Context context) {
        this(context, (AttributeSet) null);
    }

    private FitnessDataOriginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new ArrayList();
        this.g = false;
        this.e = new Handler() { // from class: com.huawei.ui.main.stories.health.views.FitnessDataOriginView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    LogUtil.e("Step_FitnessDataOriginView", "handleMessage msg == null");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 1000) {
                    return;
                }
                LogUtil.a("Step_FitnessDataOriginView", "handleMessage mListData.size = ", Integer.valueOf(FitnessDataOriginView.this.i.size()));
                FitnessDataOriginView.this.f28175a.c(FitnessDataOriginView.this.i);
            }
        };
        c(context, (Boolean) false);
    }

    public FitnessDataOriginView(Context context, Boolean bool) {
        super(context, null);
        this.i = new ArrayList();
        this.g = false;
        this.e = new Handler() { // from class: com.huawei.ui.main.stories.health.views.FitnessDataOriginView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    LogUtil.e("Step_FitnessDataOriginView", "handleMessage msg == null");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 1000) {
                    return;
                }
                LogUtil.a("Step_FitnessDataOriginView", "handleMessage mListData.size = ", Integer.valueOf(FitnessDataOriginView.this.i.size()));
                FitnessDataOriginView.this.f28175a.c(FitnessDataOriginView.this.i);
            }
        };
        c(context, bool);
    }

    public void setmListdata(List<uif> list) {
        if (njy.b(list)) {
            this.i = list;
            this.f28175a.c(list);
        }
    }

    public void setIsOnlyStepSource(boolean z) {
        this.g = z;
        this.f28175a.c(true);
        c();
    }

    public void setFromType(int i) {
        this.d = i;
    }

    public void setIsSleepType() {
        DataOriginListAdapter dataOriginListAdapter = this.f28175a;
        if (dataOriginListAdapter == null) {
            LogUtil.e("Step_FitnessDataOriginView", "mDataListAdapter == null");
        } else {
            dataOriginListAdapter.b(true);
        }
    }

    private void c() {
        Context context;
        HealthTextView healthTextView = this.j;
        if (healthTextView == null || (context = this.f28176b) == null) {
            LogUtil.j("Step_FitnessDataOriginView", "buildStepViewContent: context or textView is null");
        } else {
            if (this.g) {
                return;
            }
            healthTextView.setText(context.getResources().getString(R.string.IDS_hw_home_steps_data_source_merge_tip));
        }
    }

    private void c(Context context, Boolean bool) {
        View viewInflate = View.inflate(context, R.layout.fitness_data_origin_view, this);
        this.j = (HealthTextView) viewInflate.findViewById(R.id.info_text);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.inaccurate_step_count);
        this.f28176b = BaseApplication.getContext();
        if (!bool.booleanValue()) {
            if (this.h == null) {
                this.h = new CommonSingleCallback() { // from class: vel
                    @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
                    public final void callback(Object obj) {
                        this.f51004c.b((Boolean) obj);
                    }
                };
                uin.e().a(this.h);
            }
            uin.e().b();
        }
        this.f28177c = (ListView) qsp.a(this, R.id.lv_fitness_data_origin_list);
        DataOriginListAdapter dataOriginListAdapter = new DataOriginListAdapter(this.f28176b);
        this.f28175a = dataOriginListAdapter;
        this.f28177c.setAdapter((ListAdapter) dataOriginListAdapter);
        if ((LanguageUtil.o(context) || LanguageUtil.q(context)) && !bool.booleanValue()) {
            this.f.setVisibility(0);
        }
        if (!(context instanceof BaseActivity) || bool.booleanValue()) {
            return;
        }
        this.f.setOnClickListener(qji.b(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.views.FitnessDataOriginView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FitnessDataOriginView.this.a(view);
            }
        }, (BaseActivity) context, true, AnalyticsValue.STEP_FAQ_CLICKED_2040126.value()));
    }

    public /* synthetic */ void b(Boolean bool) {
        this.i = uin.e().c();
        this.e.sendMessage(this.e.obtainMessage(1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (qrs.e(view)) {
            return;
        }
        if (this.f28176b != null) {
            setBiCollect(AnalyticsValue.STEP_FAQ_CLICKED_2040126.value());
            d();
        } else {
            LogUtil.j("Step_FitnessDataOriginView", "startStepFaq onClick context is null!");
        }
    }

    public void setInfoText(String str) {
        HealthTextView healthTextView = this.j;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    public void setInfoTextSpannableString(SpannableString spannableString) {
        HealthTextView healthTextView = this.j;
        if (healthTextView != null) {
            healthTextView.setText(spannableString);
            this.j.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private void d() {
        GRSManager.c(this.f28176b).d("helpCustomerUrl", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.health.views.FitnessDataOriginView.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    FitnessDataOriginView.this.o = str;
                    FitnessDataOriginView.this.e.post(new Runnable() { // from class: com.huawei.ui.main.stories.health.views.FitnessDataOriginView.2.4
                        @Override // java.lang.Runnable
                        public void run() {
                            FitnessDataOriginView.this.a();
                        }
                    });
                } else {
                    LogUtil.j("Step_FitnessDataOriginView", "obtainUrlDomain urlDomain is empty");
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("Step_FitnessDataOriginView", "obtainUrlDomain onCallBackFail");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Intent intent = new Intent(this.f28176b, (Class<?>) WebViewActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("url", d(LoginInit.getInstance(this.f28176b).getCountryCode(null)));
        iov.d(this.f28176b, intent);
    }

    private String d(String str) {
        StringBuilder sb;
        String str2;
        LogUtil.a("Step_FitnessDataOriginView", "getStepFaqUrl() countryCode:", str);
        if (LanguageUtil.f(this.f28176b)) {
            sb = new StringBuilder();
            sb.append(this.o);
            str2 = "/hwtips/help/health_help_all/zh-CN/index.html#/card/ug009";
        } else {
            sb = new StringBuilder();
            sb.append(this.o);
            str2 = "/hwtips/help/health_help_all/en-US/index.html#/card/ug009";
        }
        sb.append(str2);
        return sb.toString();
    }

    private void setBiCollect(String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", "0");
        map.put("from", Integer.valueOf(this.d));
        lmf.d().c(this.f28176b, str, map, 0);
    }
}
