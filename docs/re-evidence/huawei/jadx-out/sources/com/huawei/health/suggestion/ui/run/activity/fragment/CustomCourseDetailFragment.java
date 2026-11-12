package com.huawei.health.suggestion.ui.run.activity.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.GsonBuilder;
import com.huawei.health.basesport.helper.HeartRateConfigHelper;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.customizecourse.manager.adapter.CustomCourseDetailActionAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.btt;
import defpackage.gzf;
import defpackage.hcc;
import defpackage.ien;
import defpackage.pcs;
import health.compact.a.CommonUtil;
import health.compact.a.utils.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CustomCourseDetailFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HeartRateConfigHelper f9867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gzf f9868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomCourseDetailActionAdapter f9869c;
    private FitWorkout d;
    private RelativeLayout e;

    public static CustomCourseDetailFragment c(FitWorkout fitWorkout) {
        Bundle bundle = new Bundle();
        bundle.putString("Suggestion_Course_FitWorkout", new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(fitWorkout).replaceAll("NaN", "0"));
        bundle.putInt("Suggestion_Defined_Type", fitWorkout.getCourseDefineType());
        CustomCourseDetailFragment customCourseDetailFragment = new CustomCourseDetailFragment();
        customCourseDetailFragment.setArguments(bundle);
        return customCourseDetailFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("Suggestion_Course_FitWorkout");
            if (StringUtils.j(string)) {
                this.d = (FitWorkout) new GsonBuilder().serializeSpecialFloatingPointValues().create().fromJson(CommonUtil.ac(string.replaceAll("NaN", "0")), FitWorkout.class);
            }
        }
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_costom_course_detail, viewGroup, false);
        ((HealthSubHeader) viewInflate.findViewById(R.id.sug_action_title)).setSubHeaderBackgroundColor(getResources().getColor(R.color.common_transparent));
        b(viewInflate);
        e(viewInflate);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.sug_course_detail_recycle_view);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(getContext()));
        CustomCourseDetailActionAdapter customCourseDetailActionAdapter = new CustomCourseDetailActionAdapter(getContext());
        this.f9869c = customCourseDetailActionAdapter;
        healthRecycleView.setAdapter(customCourseDetailActionAdapter);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        e();
        return viewInflate;
    }

    private void e() {
        btt.d().c(new Runnable() { // from class: iac
            @Override // java.lang.Runnable
            public final void run() {
                this.f37401b.d();
            }
        });
    }

    public /* synthetic */ void d() {
        LogUtil.a("Suggestion_CustomCourseDetailFragment", "initConfigInfo, init PaceZoneConfig - init HeartRateConfigHelper");
        this.f9868b = hcc.c();
        this.f9867a = new HeartRateConfigHelper(258, new HeartRateConfigHelper.OnConfigHelperListener() { // from class: iab
            @Override // com.huawei.health.basesport.helper.HeartRateConfigHelper.OnConfigHelperListener
            public final void onInitComplete() {
                this.f37400c.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a() {
        FitWorkout fitWorkout;
        CustomCourseDetailActionAdapter customCourseDetailActionAdapter = this.f9869c;
        if (customCourseDetailActionAdapter != null) {
            customCourseDetailActionAdapter.c(this.f9867a, this.f9868b);
            FragmentActivity activity = getActivity();
            if (activity == null || activity.isFinishing() || (fitWorkout = this.d) == null || fitWorkout.getCourseActions() == null) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: iad
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c();
                }
            });
        }
    }

    public /* synthetic */ void c() {
        this.f9869c.b(this.d);
    }

    private void e(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.bind_device_tip);
        this.e = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: iae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.a(view2);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        this.e.setVisibility(8);
    }

    private void b(View view) {
        pcs pcsVar;
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.sug_course_description);
        if (this.d != null) {
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.custom_name);
            LogUtil.a("Suggestion_CustomCourseDetailFragment", "title:", this.d.acquireName());
            if (!TextUtils.isEmpty(this.d.acquireName())) {
                healthTextView2.setText(this.d.acquireName());
            }
            LogUtil.a("Suggestion_CustomCourseDetailFragment", "description:", this.d.acquireDescription());
            Map<String, pcs> mapE = ien.e(this.d.acquireExtendSeaMap());
            String strE = (mapE == null || (pcsVar = mapE.get("courseDesc")) == null) ? null : pcsVar.e();
            if (TextUtils.isEmpty(strE)) {
                strE = this.d.acquireDescription();
            }
            if (!TextUtils.isEmpty(strE)) {
                healthTextView.setText(strE);
                return;
            }
        }
        healthTextView.setVisibility(8);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }
}
