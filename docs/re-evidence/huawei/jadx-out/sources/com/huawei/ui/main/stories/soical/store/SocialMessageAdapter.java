package com.huawei.ui.main.stories.soical.store;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.messagecenter.model.MessageExt;
import com.huawei.health.operationbundle.R;
import com.huawei.health.suggestion.FitnessNavigationApi;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.pluginachievement.AchieveNavigationApi;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lmf;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.wvg;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SocialMessageAdapter extends RecyclerView.Adapter<SocialMessageHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28930c;
    private final List<MessageExt> d;
    private final Context e;
    private final int i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28928a = 0;
    private final OperationWebActivityIntentBuilderApi j = (OperationWebActivityIntentBuilderApi) Services.d("PluginOperation", OperationWebActivityIntentBuilderApi.class);
    private final AchieveNavigationApi g = (AchieveNavigationApi) Services.d("PluginAchievement", AchieveNavigationApi.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FitnessNavigationApi f28929b = (FitnessNavigationApi) Services.d("PluginFitnessAdvice", FitnessNavigationApi.class);

    public SocialMessageAdapter(Context context, List<MessageExt> list, int i, int i2) {
        this.e = context;
        this.d = list;
        this.f28930c = i;
        this.i = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SocialMessageHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (i == 1 || i == 2 || i == 3) {
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_social_image_grid, viewGroup, false);
        } else if (i == 4) {
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_social_image_text_list, viewGroup, false);
        } else {
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_social_image_horizontal, viewGroup, false);
        }
        return new SocialMessageHolder(viewInflate, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f28930c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SocialMessageHolder socialMessageHolder, final int i) {
        List<MessageExt> list = this.d;
        if (list == null || i >= list.size()) {
            return;
        }
        qqf.b(socialMessageHolder.f28935c, this.d.get(i).getImgUrl(), qqf.e, 0, 0);
        int i2 = this.f28930c;
        if (i2 == 4) {
            b(socialMessageHolder, i);
        } else if (i2 == 0 || i2 > 4 || i2 < 0) {
            c(socialMessageHolder, i);
        } else {
            LogUtil.j("SocialMessageAdapter", "no branch!");
        }
        final int jumpType = this.d.get(i).getJumpType();
        socialMessageHolder.f28934b.setOnClickListener(new View.OnClickListener() { // from class: wov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52281a.a(jumpType, i, view);
            }
        });
    }

    public /* synthetic */ void a(int i, int i2, View view) {
        if (System.currentTimeMillis() - this.f28928a >= 1000) {
            this.f28928a = System.currentTimeMillis();
            c(i, i2);
            a(i2);
        }
    }

    private void b(SocialMessageHolder socialMessageHolder, int i) {
        String description = this.d.get(i).getDescription();
        if (!TextUtils.isEmpty(description)) {
            socialMessageHolder.g.setText(description);
        }
        socialMessageHolder.h.setText(wvg.a(this.d.get(i).getBeginTime(), this.e));
        socialMessageHolder.h.setVisibility(8);
        if (i != this.d.size() - 1) {
            socialMessageHolder.e.setVisibility(0);
        } else {
            socialMessageHolder.e.setVisibility(4);
        }
    }

    private void c(SocialMessageHolder socialMessageHolder, int i) {
        if (i == 0) {
            socialMessageHolder.d.setVisibility(0);
        } else {
            socialMessageHolder.d.setVisibility(8);
        }
        if (i == this.d.size() - 1) {
            socialMessageHolder.j.setVisibility(0);
        } else {
            socialMessageHolder.j.setVisibility(8);
        }
    }

    private void c(int i, int i2) {
        if (i2 < this.d.size()) {
            if (i == 0) {
                String jumpUrl = this.d.get(i2).getJumpUrl();
                if (TextUtils.isEmpty(jumpUrl)) {
                    return;
                }
                try {
                    Context context = this.e;
                    context.startActivity(this.j.builder(context, jumpUrl).build());
                    return;
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("SocialMessageAdapter", "mOperationWebActivity NotFound ", e.getMessage());
                    return;
                }
            }
            if (i == 1) {
                final String jumpUrl2 = this.d.get(i2).getJumpUrl();
                GRSManager.c(this.e).d("messageCenterUrl", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.store.SocialMessageAdapter.1
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(String str) {
                        LogUtil.d("SocialMessageAdapter", "GRSManager onCallBackSuccess url = ", str);
                        SocialMessageAdapter.this.f28929b.gotoFitnessPage(jumpUrl2, str + "/messageH5/html/launchFitness.html?url=", SocialMessageAdapter.this.e);
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i3) {
                        LogUtil.d("SocialMessageAdapter", "GRSManager onCallBackFail code = ", Integer.valueOf(i3));
                    }
                });
                return;
            }
            if (i == 2) {
                this.g.showAchieveReport(this.e);
                return;
            }
            if (i == 3) {
                this.g.showAchieveMedal(this.e);
                return;
            }
            if (i == 4) {
                this.f28929b.startMoreFitness(this.e);
            } else if (i == 5) {
                this.g.showAchieveKaka(this.e);
            } else {
                c();
            }
        }
    }

    private void c() {
        GRSManager.c(this.e).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.store.SocialMessageAdapter.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("SocialMessageAdapter", "GRSManager onCallBackSuccess url = ", str);
                try {
                    SocialMessageAdapter.this.e.startActivity(SocialMessageAdapter.this.j.builder(SocialMessageAdapter.this.e, str + ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath() + "lowVersionTips.html").build());
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("SocialMessageAdapter", "ActivityNotFoundException", e.getMessage());
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("SocialMessageAdapter", "GRSManager onCallBackFail code = ", Integer.valueOf(i));
            }
        });
    }

    private void a(int i) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (i < this.d.size()) {
            map.put("title", this.d.get(i).getTitle());
            map.put("description", this.d.get(i).getDescription());
            if (this.i == 27) {
                map.put("jumpType", Integer.valueOf(this.d.get(i).getJumpType()));
                lmf.d().c(this.e, AnalyticsValue.HEALTH_WONDERFUL_EVENT_SCROLL_2020025.value(), map, 0);
            } else {
                lmf.d().c(this.e, AnalyticsValue.HEALTH_UNMISSABLE_TOPIC_SCROLL_2020024.value(), map, 0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<MessageExt> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public class SocialMessageHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinearLayout f28934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImageView f28935c;
        private View d;
        private HealthDivider e;
        private HealthTextView g;
        private HealthTextView h;
        private View j;

        public SocialMessageHolder(View view, int i) {
            super(view);
            int iQ = qrs.q();
            this.f28934b = (LinearLayout) view.findViewById(R.id.item_social_message_layout);
            this.f28935c = (ImageView) view.findViewById(R.id.img_item_social);
            if (i != 1) {
                if (i == 2) {
                    if (qrs.af(view.getContext())) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = (int) ((((iQ - SocialMessageAdapter.this.b(SocialMessageAdapter.this.e, 40.0f)) / 4.0f) / 2.0f) + SocialMessageAdapter.this.b(SocialMessageAdapter.this.e, 8.0f));
                        view.setLayoutParams(layoutParams);
                        LogUtil.d("SocialMessageAdapter", "SocialMessageHodler width = ", Integer.valueOf(layoutParams.width), ", height = ", Integer.valueOf(layoutParams.height));
                        return;
                    }
                    return;
                }
                if (i != 3) {
                    if (i == 4) {
                        this.g = (HealthTextView) view.findViewById(R.id.tv_item_describe);
                        this.h = (HealthTextView) view.findViewById(R.id.tv_item_date);
                        this.e = (HealthDivider) view.findViewById(R.id.img_item_line);
                        return;
                    } else {
                        this.d = view.findViewById(R.id.item_padding_left);
                        this.j = view.findViewById(R.id.item_padding_right);
                        return;
                    }
                }
                if (qrs.af(view.getContext())) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    layoutParams2.height = (int) ((((iQ - SocialMessageAdapter.this.b(SocialMessageAdapter.this.e, 32.0f)) / 3.0f) / 2.0f) + SocialMessageAdapter.this.b(SocialMessageAdapter.this.e, 8.0f));
                    view.setLayoutParams(layoutParams2);
                    LogUtil.d("SocialMessageAdapter", "SocialMessageHodler width = ", Integer.valueOf(layoutParams2.width), ", height = ", Integer.valueOf(layoutParams2.height));
                }
            }
        }
    }
}
