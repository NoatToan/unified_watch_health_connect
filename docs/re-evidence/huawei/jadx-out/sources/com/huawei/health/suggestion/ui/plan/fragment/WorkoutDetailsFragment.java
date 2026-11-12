package com.huawei.health.suggestion.ui.plan.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity;
import com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.hvv;
import defpackage.hwx;
import defpackage.lmf;
import defpackage.njy;
import defpackage.pdm;
import defpackage.peb;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class WorkoutDetailsFragment extends BaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AiPlanWeekDetailViewHolder f9715c;
    private HealthTextView d;
    private Context e;
    private LinearLayout f;
    private IntPlan h;
    private HealthTextView i;
    private hwx j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f9714b = new ArrayList();
    private int g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9713a = 0;

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.d("WorkoutDetailsFragment", "WorkoutDetailsFragment onCreateView");
        View viewInflate = layoutInflater.inflate(R.layout.sug_layout_week_fitnessplan_detail, viewGroup, false);
        viewInflate.measure(0, 0);
        this.f9713a = viewInflate.getMeasuredHeight();
        this.f = (LinearLayout) viewInflate.findViewById(R.id.view_pager_layout);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.add_course_button);
        this.i = (HealthTextView) viewInflate.findViewById(R.id.remind_follow_the_plan);
        this.j = new hwx(this.e, this.f);
        d();
        return viewInflate;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.d("WorkoutDetailsFragment", "WorkoutDetailsFragment onResume");
        HashMap map = new HashMap(3);
        map.put("click", 1);
        lmf.d().c(this.e, AnalyticsValue.INT_PLAN_1120028.value(), map, 0);
        this.j.a();
    }

    private void d() {
        LogUtil.a("WorkoutDetailsFragment", "update");
        this.j.a(this.h);
        c();
    }

    public void c() {
        if (this.h == null || this.f9714b.isEmpty() || this.f9715c == null) {
            Log.d("WorkoutDetailsFragment", "updateCourseDataView failed");
            return;
        }
        final ArrayList<String> arrayListD = this.j.d();
        this.d.setOnClickListener(new View.OnClickListener() { // from class: huf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(arrayListD, view);
            }
        });
        if (!hvv.c(this.h, this.f9714b.get(1).intValue(), this.f9714b.get(3).intValue())) {
            this.j.i();
            return;
        }
        this.i.setVisibility(0);
        if (this.f9714b.get(1).intValue() < this.f9714b.get(0).intValue()) {
            this.g = 0;
            this.i.setVisibility(8);
        } else if (this.f9714b.get(1).intValue() > this.f9714b.get(0).intValue()) {
            this.g = 3;
            this.i.setText(R.string.IDS_plugin_adjust_schedule);
        } else {
            this.g = 1;
            this.i.setText(R.string.IDS_plugin_follow_plan);
        }
        this.j.e(this.g);
        this.j.c(this.f9714b.get(1).intValue(), this.f9714b.get(3).intValue(), this.f9715c, this.f9713a);
        if (this.f9714b.get(1).intValue() < this.f9714b.get(0).intValue()) {
            this.d.setVisibility(8);
            return;
        }
        if (this.f9714b.get(1).intValue() > this.f9714b.get(0).intValue()) {
            this.d.setVisibility(8);
        } else if (this.j.c() >= 3) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            LogUtil.d("WorkoutDetailsFragment", "mAddCourseButton visible");
        }
    }

    public /* synthetic */ void a(ArrayList arrayList, View view) {
        Intent intent = new Intent(getContext(), (Class<?>) SportAllCourseActivity.class);
        intent.putExtra("KEY_SUG_COURSE_ADD_STATUS", true);
        intent.putExtra("SKIP_ALL_COURSE_KEY", "FITNESS_COURSE");
        intent.putStringArrayListExtra("KEY_SUG_COURSE_ADD_IDS", arrayList);
        boolean zJ = this.j.j();
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("isOffDay", Boolean.valueOf(zJ));
        lmf.d().c(this.e, AnalyticsValue.INT_PLAN_1120035.value(), map, 0);
        startActivityForResult(intent, 11);
    }

    public void d(Context context, AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder, IntPlan intPlan, List<Integer> list) {
        this.f9715c = aiPlanWeekDetailViewHolder;
        this.h = intPlan;
        this.e = context;
        this.f9714b = list;
        if (getView() != null) {
            d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        List<Integer> list;
        super.onActivityResult(i, i2, intent);
        if (i == 11 && i2 == -1 && intent != null) {
            try {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("KEY_SUG_COURSE_IDS_RESULT");
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("KEY_SUG_COURSE_NAMES_RESULT");
                if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                    LogUtil.j("WorkoutDetailsFragment", "onActivityResult: courseIdList is empty. ");
                    return;
                }
                LogUtil.a("WorkoutDetailsFragment", "couseIdList size is " + stringArrayListExtra.size());
                if (this.j.c() + stringArrayListExtra.size() > 3) {
                    Toast.makeText(this.e, R.string.IDS_plan_add_course_tip, 0).show();
                    return;
                }
                List<Integer> list2 = this.f9714b;
                if (list2 == null || 3 >= list2.size() || (list = this.f9714b) == null || 1 >= list.size()) {
                    return;
                }
                HashMap map = new HashMap();
                e(c(stringArrayListExtra, stringArrayListExtra2, map), map);
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.j("WorkoutDetailsFragment", "getStringArrayListExtra fail");
            }
        }
    }

    private peb c(ArrayList<String> arrayList, ArrayList<String> arrayList2, Map<String, String> map) {
        String str;
        peb pebVar = new peb();
        pebVar.b(this.h.getPlanId());
        pebVar.d(this.f9714b.get(3).intValue());
        pebVar.c(this.f9714b.get(1).intValue());
        pebVar.e(0);
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            pdm pdmVar = new pdm();
            pdmVar.d(arrayList.get(i));
            pdmVar.b(IntAction.ActionType.WORKOUT.getType());
            arrayList3.add(pdmVar);
            String str2 = "";
            if (arrayList2 == null || !njy.c(arrayList2, i)) {
                str = "";
            } else {
                str = arrayList2.get(i);
            }
            if (str != null) {
                str2 = str;
            }
            map.put(arrayList.get(i), str2);
        }
        pebVar.c(arrayList3);
        return pebVar;
    }

    private void e(peb pebVar, final Map<String, String> map) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            return;
        }
        planApi.updateAction(pebVar, new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.plan.fragment.WorkoutDetailsFragment.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("WorkoutDetailsFragment", "updateAction fail");
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                String strValue = AnalyticsValue.INT_PLAN_1120036.value();
                for (Map.Entry entry : map.entrySet()) {
                    HashMap map2 = new HashMap(3);
                    map2.put("click", 1);
                    map2.put("courseId", entry.getKey());
                    map2.put("courseName", entry.getValue());
                    lmf.d().c(WorkoutDetailsFragment.this.e, strValue, map2, 0);
                }
                LogUtil.j("WorkoutDetailsFragment", "updateAction success");
            }
        });
        planApi.setNeedUpdateCurrentPlan();
    }
}
