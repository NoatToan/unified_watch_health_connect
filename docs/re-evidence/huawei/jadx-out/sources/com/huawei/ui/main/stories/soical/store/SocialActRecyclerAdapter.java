package com.huawei.ui.main.stories.soical.store;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.operationbundle.R;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import com.huawei.ui.main.stories.soical.store.SocialActRecyclerAdapter;
import defpackage.dlp;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SocialActRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<dlp> f28921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f28922b;
    private final Context d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OperationWebActivityIntentBuilderApi f28923c = (OperationWebActivityIntentBuilderApi) Services.d("PluginOperation", OperationWebActivityIntentBuilderApi.class);
    private final OperationInteractorsApi e = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);

    public static /* synthetic */ void c(View view) {
    }

    public SocialActRecyclerAdapter(Context context, List<dlp> list) {
        this.d = context;
        this.f28921a = list;
        this.f28922b = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(this.f28922b.inflate(R.layout.item_social_act_recycler_view, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof MyViewHolder) {
            if (njy.e(this.f28921a, i)) {
                LogUtil.j("SocialActRecyclerAdapte", "mOperationObjectList is out of bounds.");
                return;
            }
            final dlp dlpVar = this.f28921a.get(i);
            if (dlpVar == null) {
                LogUtil.j("SocialActRecyclerAdapte", "operationObject == null");
                return;
            }
            MyViewHolder myViewHolder = (MyViewHolder) viewHolder;
            myViewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: woq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.b(dlpVar, view);
                }
            });
            a(myViewHolder, i);
            if (qrs.af(this.d)) {
                b(myViewHolder, i);
            }
            d(myViewHolder, dlpVar);
        }
    }

    public /* synthetic */ void b(dlp dlpVar, View view) {
        b(dlpVar);
        if (CommonUtil.ca()) {
            try {
                this.d.startActivity(this.f28923c.builder(this.d, dlpVar.e()).setBI(dlpVar.d(), dlpVar.c(), "ACT", "SHOW_TIME_BI").build());
                return;
            } catch (ActivityNotFoundException e) {
                LogUtil.j("SocialActRecyclerAdapte", "ActivityNotFoundException", e.getMessage());
                return;
            }
        }
        a(dlpVar);
    }

    private void d(MyViewHolder myViewHolder, dlp dlpVar) {
        qqf.b(myViewHolder.f28926b, dlpVar.b(), qqf.d, 0, 0);
        myViewHolder.j.setText(dlpVar.c());
        if (this.e.isHuaweiNoTemplateActivity(dlpVar)) {
            myViewHolder.f28925a.setVisibility(8);
        } else {
            myViewHolder.f28925a.setVisibility(0);
            myViewHolder.f28925a.setText(this.d.getResources().getString(R.string.IDS_activity_social_people_attended, dlpVar.l()));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = simpleDateFormat.format(new Date(jCurrentTimeMillis));
        String str2 = simpleDateFormat.format(new Date(jCurrentTimeMillis + 2592000000L));
        myViewHolder.g.setText(str);
        myViewHolder.f28927c.setText(Constants.LINK);
        myViewHolder.e.setText(str2);
        myViewHolder.h.setText(this.d.getResources().getString(R.string.IDS_hwh_home_group_underway));
    }

    private void a(MyViewHolder myViewHolder, int i) {
        if (i == 0) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, qqp.a(this.d, 109.0f));
            layoutParams.setMargins(0, qqp.a(this.d, 8.0f), 0, 0);
            myViewHolder.f28926b.setLayoutParams(layoutParams);
        }
    }

    private void b(MyViewHolder myViewHolder, int i) {
        if (i == 1) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, qqp.a(this.d, 109.0f));
            layoutParams.setMargins(0, qqp.a(this.d, 8.0f), 0, 0);
            myViewHolder.f28926b.setLayoutParams(layoutParams);
        }
    }

    private void b(dlp dlpVar) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", "4");
        map.put("activityId", dlpVar.d());
        lmf.d().c(this.d, AnalyticsValue.SUCCESSES_ACTIVITY_1100005.value(), map, 0);
    }

    private void a(final dlp dlpVar) {
        if (dlpVar == null) {
            return;
        }
        GRSManager.c(this.d).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.store.SocialActRecyclerAdapter.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("SocialActRecyclerAdapte", "GRSManager onCallBackSuccess ACTIVITY_KEY url = ", str);
                if (!SocialActRecyclerAdapter.this.e.judgeVersionSupport(dlpVar.f())) {
                    SocialActRecyclerAdapter.this.e();
                } else {
                    SocialActRecyclerAdapter.this.e(str, dlpVar);
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("SocialActRecyclerAdapte", "GRSManager onCallBackFail ACTIVITY_KEY code = ", Integer.valueOf(i));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28921a.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f28925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f28926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f28927c;
        LinearLayout d;
        HealthTextView e;
        HealthTextView g;
        HealthTextView h;
        HealthTextView j;

        public MyViewHolder(View view) {
            super(view);
            this.d = (LinearLayout) view.findViewById(R.id.activity);
            this.f28926b = (ImageView) view.findViewById(R.id.activity_img);
            this.j = (HealthTextView) view.findViewById(R.id.activity_title);
            this.f28925a = (HealthTextView) view.findViewById(R.id.activity_join_num);
            this.h = (HealthTextView) view.findViewById(R.id.activity_status);
            this.g = (HealthTextView) view.findViewById(R.id.activity_start_date);
            this.e = (HealthTextView) view.findViewById(R.id.activity_end_date);
            this.f28927c = (HealthTextView) view.findViewById(R.id.activity_divide_date);
        }
    }

    public void e(String str, dlp dlpVar) {
        String operationActivityUrl = this.e.getOperationActivityUrl(str, dlpVar);
        this.e.setNeedUpdateActivity(this.d, true);
        try {
            Context context = this.d;
            context.startActivity(this.f28923c.builder(context, operationActivityUrl).setBI(dlpVar.d(), dlpVar.c(), "ACT", "SHOW_TIME_BI").build());
        } catch (ActivityNotFoundException e) {
            LogUtil.e("SocialActRecyclerAdapte", "mOperationWebActivity NotFound ", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        new NoTitleCustomAlertDialog.Builder(this.d).a(this.d.getResources().getString(R.string.IDS_hw_update_app_tips)).d(R.string.IDS_user_permission_know, R.color.common_text_red_color, new View.OnClickListener() { // from class: wos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SocialActRecyclerAdapter.c(view);
            }
        }).c().show();
    }
}
