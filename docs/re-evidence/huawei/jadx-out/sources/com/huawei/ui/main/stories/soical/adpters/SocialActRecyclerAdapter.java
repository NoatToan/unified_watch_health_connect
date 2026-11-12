package com.huawei.ui.main.stories.soical.adpters;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import defpackage.dlp;
import defpackage.lmf;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SocialActRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LayoutInflater f28881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28883c;
    private List<dlp> g;
    private Pair<Integer, Integer> e = BaseActivity.getSafeRegionWidth();
    private final OperationWebActivityIntentBuilderApi f = (OperationWebActivityIntentBuilderApi) Services.d("PluginOperation", OperationWebActivityIntentBuilderApi.class);
    private final OperationInteractorsApi d = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public SocialActRecyclerAdapter(Context context, List<dlp> list) {
        this.f28882b = context;
        this.g = list;
        this.f28881a = LayoutInflater.from(context);
        this.f28883c = qqp.b(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(this.f28881a.inflate(R.layout.configured_page_item_huawei_activity, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (!(viewHolder instanceof MyViewHolder) || njy.e(this.g, i)) {
            return;
        }
        final dlp dlpVar = this.g.get(i);
        if (dlpVar == null) {
            LogUtil.a("SocialActRecyclerAdapte", "operationObject is null");
            return;
        }
        MyViewHolder myViewHolder = (MyViewHolder) viewHolder;
        c(dlpVar, myViewHolder);
        if (list.isEmpty()) {
            myViewHolder.e.setOnClickListener(new View.OnClickListener() { // from class: wok
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.c(dlpVar, view);
                }
            });
            d(dlpVar, myViewHolder);
            b(dlpVar, myViewHolder);
            e(dlpVar, myViewHolder);
            a(dlpVar, myViewHolder);
        }
    }

    public /* synthetic */ void c(dlp dlpVar, View view) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("from", "4");
        map.put("activityId", dlpVar.d());
        lmf.d().c(this.f28882b, AnalyticsValue.SUCCESSES_ACTIVITY_1100005.value(), map, 0);
        GRSManager.c(this.f28882b).d("domainContentcenterDbankcdnNew", new AnonymousClass5(dlpVar));
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.soical.adpters.SocialActRecyclerAdapter$5, reason: invalid class name */
    public class AnonymousClass5 implements GrsQueryCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ dlp f28885a;

        AnonymousClass5(dlp dlpVar) {
            this.f28885a = dlpVar;
        }

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackSuccess(final String str) {
            LogUtil.d("SocialActRecyclerAdapte", "GRSManager onCallBackSuccess ACTIVITY_KEY url = " + str);
            if (!SocialActRecyclerAdapter.this.d.judgeVersionSupport(this.f28885a.f())) {
                SocialActRecyclerAdapter.this.a();
                return;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final dlp dlpVar = this.f28885a;
            handler.post(new Runnable() { // from class: wol
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52266a.b(str, dlpVar);
                }
            });
        }

        public /* synthetic */ void b(String str, dlp dlpVar) {
            SocialActRecyclerAdapter.this.a(str, dlpVar);
        }

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackFail(int i) {
            LogUtil.d("SocialActRecyclerAdapte", "GRSManager onCallBackFail ACTIVITY_KEY code = ", Integer.valueOf(i));
        }
    }

    private void d(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("SocialActRecyclerAdapte", "setLayout() operationObject or holder is null.");
            return;
        }
        int iE = e();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) myViewHolder.e.getLayoutParams();
        layoutParams.width = iE;
        layoutParams.height = (iE * 9) / 21;
        myViewHolder.e.setLayoutParams(layoutParams);
    }

    private void b(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("SocialActRecyclerAdapte", "setImageUi() operationObject or holder is null.");
            return;
        }
        String strB = dlpVar.b();
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("SocialActRecyclerAdapte", "setImageUi() imageUrl is empty.");
            return;
        }
        int iE = e();
        myViewHolder.f28889c.setLayoutParams(new RelativeLayout.LayoutParams(iE, (iE * 9) / 21));
        qqf.b(myViewHolder.f28889c, strB, (int) this.f28882b.getResources().getDimension(R.dimen.cardCornerRadius), 0, 0);
    }

    private int e() {
        int dimensionPixelSize = this.f28882b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.f28882b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        if (qrs.af(this.f28882b)) {
            return (((this.f28882b.getResources().getDisplayMetrics().widthPixels - dimensionPixelSize) - dimensionPixelSize2) - this.f28883c) / 2;
        }
        return (((this.f28882b.getResources().getDisplayMetrics().widthPixels - dimensionPixelSize) - dimensionPixelSize2) - ((Integer) this.e.first).intValue()) - ((Integer) this.e.second).intValue();
    }

    private void c(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("SocialActRecyclerAdapte", "setJoinNumberUi() operationObject or holder is null.");
            return;
        }
        String strL = dlpVar.l();
        if (!this.d.isHuaweiNoTemplateActivity(dlpVar) && !TextUtils.isEmpty(strL)) {
            int iN = CommonUtil.n(BaseApplication.getContext(), strL);
            myViewHolder.f28888b.setVisibility(0);
            myViewHolder.f28888b.setText(this.f28882b.getResources().getString(R.string.IDS_activity_social_people_attended, UnitUtil.e(iN, 1, 0)));
            return;
        }
        myViewHolder.f28888b.setVisibility(8);
    }

    private void e(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("SocialActRecyclerAdapte", "setActivityNameUi() operationObject or holder is null.");
            return;
        }
        int iU = dlpVar.u();
        String strC = dlpVar.c();
        if (iU != 0 || TextUtils.isEmpty(strC)) {
            myViewHolder.i.setVisibility(8);
        } else {
            myViewHolder.i.setVisibility(0);
            myViewHolder.i.setText(strC);
        }
    }

    private void a(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("SocialActRecyclerAdapte", "setDateAndStatusUi() operationObject or holder is null.");
            return;
        }
        String strS = dlpVar.s();
        String strO = dlpVar.o();
        String strV = dlpVar.v();
        if (dlpVar.u() != 0 || TextUtils.isEmpty(strS) || TextUtils.isEmpty(strO)) {
            myViewHolder.f28887a.setVisibility(8);
        } else {
            myViewHolder.f28887a.setVisibility(0);
            myViewHolder.g.setText(ltb.a(strS, strV));
            myViewHolder.d.setText(ltb.a(strO, strV));
        }
        int activityStatus = this.d.getActivityStatus(SharedPreferenceManager.e(this.f28882b, Integer.toString(10011), OperationInteractorsApi.OPERATION_ACTIVITY_CURRENT_TIME), strS, strO);
        if (activityStatus == 0) {
            myViewHolder.h.setVisibility(0);
            myViewHolder.h.setText(this.f28882b.getResources().getString(R.string.IDS_activity_social_coming_soon));
            myViewHolder.h.setBackground(this.f28882b.getResources().getDrawable(R.drawable.activity_status_in_coming_bg));
        } else {
            if (activityStatus == 1) {
                myViewHolder.h.setVisibility(0);
                myViewHolder.h.setText(this.f28882b.getResources().getString(R.string.IDS_hwh_home_group_underway));
                myViewHolder.h.setBackground(this.f28882b.getResources().getDrawable(R.drawable.activity_status_in_progress_bg));
                return;
            }
            myViewHolder.h.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.g.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LinearLayout f28887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f28888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f28889c;
        private HealthTextView d;
        private RelativeLayout e;
        private HealthTextView g;
        private HealthTextView h;
        private HealthTextView i;

        public MyViewHolder(View view) {
            super(view);
            this.e = (RelativeLayout) view.findViewById(R.id.activity_layout);
            this.f28889c = (ImageView) view.findViewById(R.id.activity_img);
            this.h = (HealthTextView) view.findViewById(R.id.activity_status);
            this.i = (HealthTextView) view.findViewById(R.id.activity_title);
            this.f28887a = (LinearLayout) view.findViewById(R.id.activity_duration);
            this.g = (HealthTextView) view.findViewById(R.id.activity_start_date);
            this.d = (HealthTextView) view.findViewById(R.id.activity_end_date);
            this.f28888b = (HealthTextView) view.findViewById(R.id.activity_join_num);
        }
    }

    public void a(String str, dlp dlpVar) {
        String operationActivityUrl = this.d.getOperationActivityUrl(str, dlpVar);
        this.d.setNeedUpdateActivity(this.f28882b, true);
        try {
            Context context = this.f28882b;
            context.startActivity(this.f.builder(context, operationActivityUrl).setBI(dlpVar.d(), dlpVar.c(), "ACT", "SHOW_TIME_BI").build());
        } catch (ActivityNotFoundException e) {
            LogUtil.e("SocialActRecyclerAdapte", "gotoOperationActivityDetail exception", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        new NoTitleCustomAlertDialog.Builder(this.f28882b).a(this.f28882b.getResources().getString(R.string.IDS_hw_update_app_tips)).d(R.string.IDS_user_permission_know, R.color.common_text_red_color, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.adpters.SocialActRecyclerAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c().show();
    }
}
