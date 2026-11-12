package com.huawei.ui.main.stories.soical.views;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.operationbundle.R;
import com.huawei.health.suggestion.ui.view.BounceScrollView;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.lmf;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class SocialRecyclerview extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MessageObject f28977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f28978c;
    private Context d;
    private OperationWebActivityIntentBuilderApi e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthRecycleView h;
    private HealthRecycleView i;
    private BounceScrollView j;

    public SocialRecyclerview(Context context) {
        super(context);
        this.f28976a = false;
        d(context);
    }

    public SocialRecyclerview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28976a = false;
        d(context);
    }

    public SocialRecyclerview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28976a = false;
        d(context);
    }

    private void d(Context context) {
        this.d = context;
        LayoutInflater.from(context).inflate(R.layout.recycler_view_social, this);
        this.f = (HealthTextView) findViewById(R.id.social_recycler_title);
        this.g = (HealthTextView) findViewById(R.id.social_recycler_more);
        this.f28978c = (ImageView) findViewById(R.id.social_recycler_arrow);
        this.i = (HealthRecycleView) findViewById(R.id.social_recycler_view);
        ((RelativeLayout) findViewById(R.id.social_recycler_title_layout)).setOnClickListener(this);
        this.h = (HealthRecycleView) findViewById(R.id.social_recycler_view_horizontal);
        this.j = (BounceScrollView) findViewById(R.id.social_scrollView_horizontal);
        if (LanguageUtil.ba(this.d)) {
            this.f28978c.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            this.f28978c.setBackgroundResource(R.drawable.ic_health_list_arrow_gray);
        }
        this.i.setNestedScrollingEnabled(false);
        this.i.setHasFixedSize(true);
        this.e = (OperationWebActivityIntentBuilderApi) Services.d("PluginOperation", OperationWebActivityIntentBuilderApi.class);
    }

    private void setImageTextLayout(SocialMessageAdapter socialMessageAdapter) {
        this.i.setLayoutManager(new LinearLayoutManager(this.d) { // from class: com.huawei.ui.main.stories.soical.views.SocialRecyclerview.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.i.setAdapter(socialMessageAdapter);
        this.j.setVisibility(8);
        this.i.setVisibility(0);
    }

    public RecyclerView getRecyclerView() {
        return this.i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MessageObject messageObject = this.f28977b;
        if (messageObject == null || TextUtils.isEmpty(messageObject.getDetailUri())) {
            return;
        }
        try {
            Context context = this.d;
            context.startActivity(this.e.builder(context, this.f28977b.getDetailUri()).build());
        } catch (ActivityNotFoundException e) {
            LogUtil.a("SocialRecyclerview", "ActivityNotFoundException", e.getMessage());
        }
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("msgId", this.f28977b.getMsgId());
        map.put(CommonUtil.MSG_TITLE, this.f28977b.getMsgTitle());
        if (this.f28977b.getMsgPosition() == 27) {
            lmf.d().c(this.d, AnalyticsValue.HEALTH_WONDERFUL_EVENT_MORE_SCROLL_2020026.value(), map, 0);
        } else {
            lmf.d().c(this.d, AnalyticsValue.HEALTH_UNMISSABLE_TOPIC_MORE_SCROLL_2020027.value(), map, 0);
        }
    }
}
