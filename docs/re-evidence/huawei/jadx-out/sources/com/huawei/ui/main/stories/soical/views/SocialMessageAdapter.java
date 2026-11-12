package com.huawei.ui.main.stories.soical.views;

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
public class SocialMessageAdapter extends RecyclerView.Adapter<SocialMessageHodler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<MessageExt> f28965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FitnessNavigationApi f28966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28967c;
    private int d;
    private Context e;
    private final AchieveNavigationApi f;
    private final OperationWebActivityIntentBuilderApi i;
    private int j;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SocialMessageHodler onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (i == 0) {
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_social_image_horizontal, viewGroup, false);
        } else if (i == 1 || i == 2 || i == 3) {
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_social_image_grid, viewGroup, false);
        } else if (i == 4) {
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_social_image_text_list, viewGroup, false);
        } else {
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_social_image_horizontal, viewGroup, false);
        }
        return new SocialMessageHodler(viewInflate, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SocialMessageHodler socialMessageHodler, final int i) {
        List<MessageExt> list = this.f28965a;
        if (list == null || i >= list.size()) {
            return;
        }
        if (!qrs.af(this.e) || this.d != 1 || this.f28965a.get(i).getImgUrlDaxi() == null) {
            qqf.b(socialMessageHodler.f28974b, this.f28965a.get(i).getImgUrl(), qqf.e, 0, 0);
        } else {
            qqf.b(socialMessageHodler.f28974b, this.f28965a.get(i).getImgUrlDaxi(), qqf.e, 0, 0);
        }
        int i2 = this.d;
        if (i2 == 4) {
            e(socialMessageHodler, i);
        } else if (i2 == 0 || i2 > 4 || i2 < 0) {
            d(socialMessageHodler, i);
        } else {
            LogUtil.j("SocialMessageAdapter", "no branch!");
        }
        final int jumpType = this.f28965a.get(i).getJumpType();
        socialMessageHodler.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.views.SocialMessageAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (System.currentTimeMillis() - SocialMessageAdapter.this.f28967c >= 1000) {
                    SocialMessageAdapter.this.f28967c = System.currentTimeMillis();
                    SocialMessageAdapter.this.e(jumpType, i);
                    SocialMessageAdapter.this.d(i);
                }
            }
        });
    }

    private void e(SocialMessageHodler socialMessageHodler, int i) {
        String description = this.f28965a.get(i).getDescription();
        if (!TextUtils.isEmpty(description)) {
            socialMessageHodler.h.setText(description);
        }
        socialMessageHodler.g.setText(wvg.a(this.f28965a.get(i).getBeginTime(), this.e));
        if (i != this.f28965a.size() - 1) {
            socialMessageHodler.f28973a.setVisibility(0);
        } else {
            socialMessageHodler.f28973a.setVisibility(4);
        }
    }

    private void d(SocialMessageHodler socialMessageHodler, int i) {
        if (i == 0) {
            socialMessageHodler.f28975c.setVisibility(0);
        } else {
            socialMessageHodler.f28975c.setVisibility(8);
        }
        if (i == this.f28965a.size() - 1) {
            socialMessageHodler.i.setVisibility(0);
        } else {
            socialMessageHodler.i.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        if (i2 < this.f28965a.size()) {
            if (i == 0) {
                String jumpUrl = this.f28965a.get(i2).getJumpUrl();
                if (TextUtils.isEmpty(jumpUrl)) {
                    return;
                }
                try {
                    Context context = this.e;
                    context.startActivity(this.i.builder(context, jumpUrl).build());
                    return;
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("SocialMessageAdapter", "ActivityNotFound" + e.getMessage());
                    return;
                }
            }
            if (i == 1) {
                b(i, i2);
                return;
            }
            if (i == 2) {
                this.f.showAchieveReport(this.e);
                return;
            }
            if (i == 3) {
                this.f.showAchieveMedal(this.e);
                return;
            }
            if (i == 4) {
                this.f28966b.startMoreFitness(this.e);
            } else if (i == 5) {
                this.f.showAchieveKaka(this.e);
            } else {
                b(i, 0);
            }
        }
    }

    private void b(int i, int i2) {
        if (i == 1) {
            if (this.f28965a.size() <= i2) {
                return;
            }
            final String jumpUrl = this.f28965a.get(i2).getJumpUrl();
            GRSManager.c(this.e).d("messageCenterUrl", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.views.SocialMessageAdapter.5
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str) {
                    LogUtil.d("SocialMessageAdapter", "GRSManager onCallBackSuccess url = " + str);
                    SocialMessageAdapter.this.f28966b.gotoFitnessPage(jumpUrl, str + "/messageH5/html/launchFitness.html?url=", SocialMessageAdapter.this.e);
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i3) {
                    LogUtil.d("SocialMessageAdapter", "GRSManager onCallBackFail i = " + i3);
                }
            });
            return;
        }
        GRSManager.c(this.e).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.views.SocialMessageAdapter.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("SocialMessageAdapter", "GRSManager onCallBackSuccess url = " + str);
                try {
                    SocialMessageAdapter.this.e.startActivity(SocialMessageAdapter.this.i.builder(SocialMessageAdapter.this.e, str + ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath() + "lowVersionTips.html").build());
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("SocialMessageAdapter", "ActivityNotFoundException" + e.getMessage());
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i3) {
                LogUtil.d("SocialMessageAdapter", "GRSManager onCallBackFail i = " + i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (i < this.f28965a.size()) {
            map.put("title", this.f28965a.get(i).getTitle());
            map.put("description", this.f28965a.get(i).getDescription());
            if (this.j == 27) {
                map.put("jumpType", Integer.valueOf(this.f28965a.get(i).getJumpType()));
                lmf.d().c(this.e, AnalyticsValue.HEALTH_WONDERFUL_EVENT_SCROLL_2020025.value(), map, 0);
            } else {
                lmf.d().c(this.e, AnalyticsValue.HEALTH_UNMISSABLE_TOPIC_SCROLL_2020024.value(), map, 0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<MessageExt> list = this.f28965a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public class SocialMessageHodler extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthDivider f28973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f28974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f28975c;
        private LinearLayout e;
        private HealthTextView g;
        private HealthTextView h;
        private View i;

        public SocialMessageHodler(View view, int i) {
            super(view);
            this.e = (LinearLayout) view.findViewById(R.id.item_social_message_layout);
            this.f28974b = (ImageView) view.findViewById(R.id.img_item_social);
            if (i == 1 || i == 2 || i == 3) {
                e(i);
                return;
            }
            if (i == 4) {
                this.h = (HealthTextView) view.findViewById(R.id.tv_item_describe);
                this.g = (HealthTextView) view.findViewById(R.id.tv_item_date);
                this.f28973a = (HealthDivider) view.findViewById(R.id.img_item_line);
            } else {
                this.f28975c = view.findViewById(R.id.item_padding_left);
                this.i = view.findViewById(R.id.item_padding_right);
            }
        }

        private void e(int i) {
            if (qrs.af(this.itemView.getContext())) {
                int iQ = qrs.q();
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                if (i == 1) {
                    SocialMessageAdapter socialMessageAdapter = SocialMessageAdapter.this;
                    layoutParams.height = socialMessageAdapter.c(socialMessageAdapter.e, 109.3f);
                } else if (i == 2) {
                    SocialMessageAdapter socialMessageAdapter2 = SocialMessageAdapter.this;
                    float fC = ((iQ - socialMessageAdapter2.c(socialMessageAdapter2.e, 40.0f)) / 4.0f) / 2.0f;
                    SocialMessageAdapter socialMessageAdapter3 = SocialMessageAdapter.this;
                    layoutParams.height = (int) (fC + socialMessageAdapter3.c(socialMessageAdapter3.e, 8.0f));
                    LogUtil.d("SocialMessageAdapter", "SocialMessageHodler width = ", Integer.valueOf(layoutParams.width), ", height = ", Integer.valueOf(layoutParams.height));
                } else if (i == 3) {
                    SocialMessageAdapter socialMessageAdapter4 = SocialMessageAdapter.this;
                    float fC2 = ((iQ - socialMessageAdapter4.c(socialMessageAdapter4.e, 32.0f)) / 3.0f) / 2.0f;
                    SocialMessageAdapter socialMessageAdapter5 = SocialMessageAdapter.this;
                    layoutParams.height = (int) (fC2 + socialMessageAdapter5.c(socialMessageAdapter5.e, 8.0f));
                    LogUtil.d("SocialMessageAdapter", "SocialMessageHodler width = ", Integer.valueOf(layoutParams.width), ", height = ", Integer.valueOf(layoutParams.height));
                }
                this.itemView.setLayoutParams(layoutParams);
            }
        }
    }
}
