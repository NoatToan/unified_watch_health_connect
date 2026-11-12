package com.huawei.ui.main.stories.soical.store;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.messagecenter.model.MessageExt;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.operationbundle.R;
import com.huawei.health.suggestion.ui.view.BounceScrollView;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.lmf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SocialRecyclerview extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<MessageExt> f28936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageObject f28938c;
    private ImageView d;
    private Context e;
    private BounceScrollView f;
    private OperationWebActivityIntentBuilderApi g;
    private HealthRecycleView h;
    private HealthRecycleView i;
    private List<MessageExt> j;
    private HealthTextView k;
    private HealthTextView o;

    public SocialRecyclerview(Context context) {
        super(context);
        this.f28937b = false;
        c(context);
    }

    public SocialRecyclerview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28937b = false;
        c(context);
    }

    public SocialRecyclerview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28937b = false;
        c(context);
    }

    private void c(Context context) {
        this.e = context;
        LayoutInflater.from(context).inflate(R.layout.recycler_view_social, this);
        this.o = (HealthTextView) findViewById(R.id.social_recycler_title);
        this.k = (HealthTextView) findViewById(R.id.social_recycler_more);
        this.d = (ImageView) findViewById(R.id.social_recycler_arrow);
        this.i = (HealthRecycleView) findViewById(R.id.social_recycler_view);
        ((RelativeLayout) findViewById(R.id.social_recycler_title_layout)).setOnClickListener(this);
        this.h = (HealthRecycleView) findViewById(R.id.social_recycler_view_horizontal);
        this.f = (BounceScrollView) findViewById(R.id.social_scrollView_horizontal);
        if (LanguageUtil.ba(this.e)) {
            this.d.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            this.d.setBackgroundResource(R.drawable.ic_health_list_arrow_gray);
        }
        this.i.setNestedScrollingEnabled(false);
        this.i.setHasFixedSize(true);
        this.g = (OperationWebActivityIntentBuilderApi) Services.d("PluginOperation", OperationWebActivityIntentBuilderApi.class);
    }

    public void c(MessageObject messageObject) {
        MessageObject messageObject2;
        GridLayoutManager gridLayoutManagerE;
        this.f28938c = messageObject;
        if (messageObject != null && TextUtils.isEmpty(messageObject.getDetailUri())) {
            this.k.setVisibility(8);
            this.d.setVisibility(8);
        }
        a();
        if (!this.f28937b || (messageObject2 = this.f28938c) == null) {
            return;
        }
        this.o.setText(messageObject2.getMsgTitle());
        SocialMessageAdapter socialMessageAdapter = new SocialMessageAdapter(this.e, this.j, this.f28938c.getLayout(), this.f28938c.getMsgPosition());
        int layout = this.f28938c.getLayout();
        if (layout != 1 && layout != 2 && layout != 3) {
            if (layout == 4) {
                setImageTextLayout(socialMessageAdapter);
                return;
            }
            this.h.setLayoutManager(new LinearLayoutManager(this.e, 0, false));
            this.h.setAdapter(socialMessageAdapter);
            this.f.setVisibility(0);
            this.i.setVisibility(8);
            return;
        }
        if (qrs.af(this.e)) {
            if (this.f28938c.getLayout() == 2) {
                gridLayoutManagerE = e(4);
            } else if (this.f28938c.getLayout() == 3) {
                gridLayoutManagerE = e(3);
            } else {
                gridLayoutManagerE = e(2);
            }
        } else {
            gridLayoutManagerE = e(2);
        }
        this.i.setLayoutManager(gridLayoutManagerE);
        this.i.setAdapter(socialMessageAdapter);
        this.f.setVisibility(8);
        this.i.setVisibility(0);
    }

    private void setImageTextLayout(SocialMessageAdapter socialMessageAdapter) {
        this.i.setLayoutManager(new LinearLayoutManager(this.e) { // from class: com.huawei.ui.main.stories.soical.store.SocialRecyclerview.1
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
        this.f.setVisibility(8);
        this.i.setVisibility(0);
    }

    private GridLayoutManager e(int i) {
        return new GridLayoutManager(this.e, i) { // from class: com.huawei.ui.main.stories.soical.store.SocialRecyclerview.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
    }

    private void a() {
        this.f28937b = false;
        MessageObject messageObject = this.f28938c;
        if (messageObject != null) {
            LogUtil.a("SocialRecyclerview", "开始筛选数据", messageObject.toString());
            this.f28936a = this.f28938c.getMessageExtList();
            if (CommonUtil.ca()) {
                this.f28937b = true;
                this.j = this.f28936a;
                return;
            }
            List<MessageExt> list = this.f28936a;
            if (list != null) {
                LogUtil.a("SocialRecyclerview", "去除无效数据：", Integer.valueOf(list.size()));
                Iterator<MessageExt> it = this.f28936a.iterator();
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (it.hasNext()) {
                    MessageExt next = it.next();
                    if (next == null || next.getBeginTime() > jCurrentTimeMillis || next.getEndTime() < jCurrentTimeMillis) {
                        it.remove();
                    }
                }
                if (this.f28936a.size() > 0) {
                    LogUtil.a("SocialRecyclerview", "按权重和生效时间排序:", Integer.valueOf(this.f28936a.size()));
                    Collections.sort(this.f28936a, new e());
                    b();
                    return;
                }
                return;
            }
            LogUtil.j("SocialRecyclerview", "no branch!");
        }
    }

    private void b() {
        int layout = this.f28938c.getLayout();
        int size = this.f28936a.size();
        if (layout == 1) {
            if (size >= 2) {
                this.f28937b = true;
                this.j = this.f28936a.subList(0, 2);
                return;
            }
            return;
        }
        if (layout == 2) {
            if (size >= 4) {
                this.f28937b = true;
                this.j = this.f28936a.subList(0, 4);
                return;
            }
            return;
        }
        if (layout == 3) {
            if (size >= 6) {
                this.f28937b = true;
                this.j = this.f28936a.subList(0, 6);
                return;
            }
            return;
        }
        if (layout == 4) {
            this.f28937b = true;
            this.j = this.f28936a;
        } else if (size >= 2) {
            this.f28937b = true;
            if (size == 2) {
                this.j = this.f28936a.subList(0, 2);
            } else {
                this.j = this.f28936a.subList(0, 3);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MessageObject messageObject = this.f28938c;
        if (messageObject == null || TextUtils.isEmpty(messageObject.getDetailUri())) {
            return;
        }
        try {
            Context context = this.e;
            context.startActivity(this.g.builder(context, this.f28938c.getDetailUri()).build());
        } catch (ActivityNotFoundException e2) {
            LogUtil.a("SocialRecyclerview", "ActivityNotFoundException", e2.getMessage());
        }
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("msgId", this.f28938c.getMsgId());
        map.put(com.huawei.health.messagecenter.model.CommonUtil.MSG_TITLE, this.f28938c.getMsgTitle());
        if (this.f28938c.getMsgPosition() == 27) {
            lmf.d().c(this.e, AnalyticsValue.HEALTH_WONDERFUL_EVENT_MORE_SCROLL_2020026.value(), map, 0);
        } else {
            lmf.d().c(this.e, AnalyticsValue.HEALTH_UNMISSABLE_TOPIC_MORE_SCROLL_2020027.value(), map, 0);
        }
    }

    public static class e implements Comparator<MessageExt>, Serializable {
        private static final long serialVersionUID = 1;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(MessageExt messageExt, MessageExt messageExt2) {
            if (messageExt2.getWeight() > messageExt.getWeight()) {
                return 1;
            }
            if (messageExt2.getWeight() < messageExt.getWeight()) {
                return -1;
            }
            return Long.compare(messageExt2.getBeginTime(), messageExt.getBeginTime());
        }
    }

    public List<MessageExt> getShowList() {
        return this.j;
    }
}
