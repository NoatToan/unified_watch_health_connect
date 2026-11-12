package com.huawei.health.suggestion.ui.tabfragments.adapter;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import com.huawei.health.servicesui.R;
import com.huawei.health.suggestion.ui.tabfragments.adapter.SocialActRecyclerAdapter;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import defpackage.ddv;
import defpackage.dlp;
import defpackage.ibr;
import defpackage.lmf;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class SocialActRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10044b;
    private LayoutInflater d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Pair<Integer, Integer> f10045c = BaseActivity.getSafeRegionWidth();
    private List<dlp> e = new ArrayList();

    public static /* synthetic */ void b(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public SocialActRecyclerAdapter(Context context) {
        this.f10043a = context;
        this.d = LayoutInflater.from(context);
        this.f10044b = qqp.b(this.f10043a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(this.d.inflate(R.layout.configured_page_item_huawei_activity, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (!(viewHolder instanceof MyViewHolder) || njy.e(this.e, i)) {
            return;
        }
        dlp dlpVar = this.e.get(i);
        if (dlpVar == null) {
            LogUtil.a("Suggestion_SocialActRecyclerAdapte", "operationObject is null");
            return;
        }
        MyViewHolder myViewHolder = (MyViewHolder) viewHolder;
        b(dlpVar, myViewHolder);
        if (list.isEmpty()) {
            f(dlpVar, myViewHolder);
            e(dlpVar, myViewHolder);
            d(dlpVar, myViewHolder);
            a(dlpVar, myViewHolder);
            c(dlpVar, myViewHolder);
        }
    }

    private void f(final dlp dlpVar, MyViewHolder myViewHolder) {
        myViewHolder.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.adapter.SocialActRecyclerAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HashMap map = new HashMap();
                map.put("click", "1");
                map.put("from", "4");
                map.put("activityId", dlpVar.d());
                lmf.d().c(SocialActRecyclerAdapter.this.f10043a, AnalyticsValue.SUCCESSES_ACTIVITY_1100005.value(), map, 0);
                GRSManager.c(SocialActRecyclerAdapter.this.f10043a).d("domainContentcenterDbankcdnNew", new AnonymousClass5());
            }

            /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.tabfragments.adapter.SocialActRecyclerAdapter$4$5, reason: invalid class name */
            public class AnonymousClass5 implements GrsQueryCallback {
                AnonymousClass5() {
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(final String str) {
                    LogUtil.d("Suggestion_SocialActRecyclerAdapte", "GRSManager onCallBackSuccess ACTIVITY_KEY url = ", str);
                    if (!ibr.b(dlpVar.f())) {
                        SocialActRecyclerAdapter.this.c();
                        return;
                    }
                    Handler handler = new Handler(Looper.getMainLooper());
                    final dlp dlpVar = dlpVar;
                    handler.post(new Runnable() { // from class: ibo
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37446a.c(str, dlpVar);
                        }
                    });
                }

                public /* synthetic */ void c(String str, dlp dlpVar) {
                    SocialActRecyclerAdapter.this.b(str, dlpVar);
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.d("Suggestion_SocialActRecyclerAdapte", "GRSManager onCallBackFail ACTIVITY_KEY resultCode = ", Integer.valueOf(i));
                }
            }
        });
    }

    private void e(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("Suggestion_SocialActRecyclerAdapte", "setLayout() operationObject or holder is null.");
            return;
        }
        int iD = d();
        RelativeLayout relativeLayout = myViewHolder.e;
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = iD;
        layoutParams.height = (iD * 9) / 21;
        relativeLayout.setLayoutParams(layoutParams);
    }

    private void d(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("Suggestion_SocialActRecyclerAdapte", "setImageUi() operationObject or holder is null.");
            return;
        }
        String strB = dlpVar.b();
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("Suggestion_SocialActRecyclerAdapte", "setImageUi() imageUrl is empty.");
            return;
        }
        int iD = d();
        myViewHolder.f10047a.setLayoutParams(new RelativeLayout.LayoutParams(iD, (iD * 9) / 21));
        qqf.b(myViewHolder.f10047a, strB, qqf.d, 0, 0);
    }

    private int d() {
        if (qrs.af(this.f10043a)) {
            return (((this.f10043a.getResources().getDisplayMetrics().widthPixels - this.f10043a.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart)) - this.f10043a.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart)) - this.f10044b) / 2;
        }
        int i = this.f10043a.getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = this.f10043a.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart);
        return (((i - dimensionPixelSize) - this.f10043a.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart)) - ((Integer) this.f10045c.first).intValue()) - ((Integer) this.f10045c.second).intValue();
    }

    private void b(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("Suggestion_SocialActRecyclerAdapte", "setJoinNumberUi() operationObject or holder is null.");
            return;
        }
        String strL = dlpVar.l();
        if (!ibr.b(dlpVar) && !TextUtils.isEmpty(strL)) {
            int iN = CommonUtil.n(BaseApplication.getContext(), strL);
            myViewHolder.f10049c.setVisibility(0);
            myViewHolder.f10049c.setText(this.f10043a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_activity_social_people_attended, UnitUtil.e(iN, 1, 0)));
            return;
        }
        myViewHolder.f10049c.setVisibility(8);
    }

    private void a(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("Suggestion_SocialActRecyclerAdapte", "setActivityNameUi() operationObject or holder is null.");
            return;
        }
        int iU = dlpVar.u();
        String strC = dlpVar.c();
        if (iU != 0 || TextUtils.isEmpty(strC)) {
            myViewHolder.j.setVisibility(8);
        } else {
            myViewHolder.j.setVisibility(0);
            myViewHolder.j.setText(strC);
        }
    }

    private void c(dlp dlpVar, MyViewHolder myViewHolder) {
        if (dlpVar == null || myViewHolder == null) {
            LogUtil.j("Suggestion_SocialActRecyclerAdapte", "setDateAndStatusUi() operationObject or holder is null.");
            return;
        }
        String strS = dlpVar.s();
        String strO = dlpVar.o();
        String strV = dlpVar.v();
        if (dlpVar.u() != 0 || TextUtils.isEmpty(strS) || TextUtils.isEmpty(strO)) {
            myViewHolder.f10048b.setVisibility(8);
        } else {
            myViewHolder.f10048b.setVisibility(0);
            myViewHolder.i.setText(ltb.a(strS, strV));
            myViewHolder.d.setText(ltb.a(strO, strV));
        }
        int iC = ibr.c(SharedPreferenceManager.e(this.f10043a, Integer.toString(10011), OperationInteractorsApi.OPERATION_ACTIVITY_CURRENT_TIME), strS, strO);
        if (iC == 0) {
            myViewHolder.f.setVisibility(0);
            myViewHolder.f.setText(this.f10043a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_activity_social_coming_soon));
            myViewHolder.f.setBackground(this.f10043a.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.activity_status_in_coming_bg));
        } else {
            if (iC == 1) {
                myViewHolder.f.setVisibility(0);
                myViewHolder.f.setText(this.f10043a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_hwh_home_group_underway));
                myViewHolder.f.setBackground(this.f10043a.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.activity_status_in_progress_bg));
                return;
            }
            myViewHolder.f.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f10047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f10048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f10049c;
        private HealthTextView d;
        private RelativeLayout e;
        private HealthTextView f;
        private HealthTextView i;
        private HealthTextView j;

        public MyViewHolder(View view) {
            super(view);
            this.e = (RelativeLayout) view.findViewById(R.id.activity_layout);
            this.f10047a = (ImageView) view.findViewById(R.id.activity_img);
            this.f = (HealthTextView) view.findViewById(R.id.activity_status);
            this.j = (HealthTextView) view.findViewById(R.id.activity_title);
            this.f10048b = (LinearLayout) view.findViewById(R.id.activity_duration);
            this.i = (HealthTextView) view.findViewById(R.id.activity_start_date);
            this.d = (HealthTextView) view.findViewById(R.id.activity_end_date);
            this.f10049c = (HealthTextView) view.findViewById(R.id.activity_join_num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, dlp dlpVar) {
        String strE = ibr.e(str, dlpVar);
        ibr.c(this.f10043a, true);
        Bundle bundle = new Bundle();
        bundle.putString("url", strE);
        bundle.putString("EXTRA_BI_ID", dlpVar.d());
        bundle.putString("EXTRA_BI_NAME", dlpVar.c());
        bundle.putString("EXTRA_BI_SOURCE", "ACT");
        bundle.putString("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        Intent intentCreateWebViewIntent = ddv.b().createWebViewIntent(this.f10043a, bundle, null);
        if (intentCreateWebViewIntent != null) {
            try {
                this.f10043a.startActivity(intentCreateWebViewIntent);
            } catch (ActivityNotFoundException e) {
                LogUtil.e("Suggestion_SocialActRecyclerAdapte", "ActivityNotFoundException", e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        new NoTitleCustomAlertDialog.Builder(this.f10043a).a(this.f10043a.getResources().getString(R.string.IDS_hw_update_app_tips)).d(R.string.IDS_user_permission_know, R.color.common_text_red_color, new View.OnClickListener() { // from class: ibj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SocialActRecyclerAdapter.b(view);
            }
        }).c().show();
    }
}
