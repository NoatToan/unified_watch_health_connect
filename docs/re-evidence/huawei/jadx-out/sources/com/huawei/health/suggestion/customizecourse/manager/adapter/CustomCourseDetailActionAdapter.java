package com.huawei.health.suggestion.customizecourse.manager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.basesport.helper.HeartRateConfigHelper;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CourseDetailActionViewHolder;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CourseMultiBottomViewHolder;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CourseMultiViewHolder;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.gzf;
import defpackage.gzy;
import defpackage.hca;
import defpackage.hcc;
import defpackage.hdr;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CustomCourseDetailActionAdapter extends RecyclerView.Adapter<CustomCourseDragViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<hdr> f8911c;
    private hca d;
    private HeartRateConfigHelper e;
    private gzf f;
    private hca i;

    public CustomCourseDetailActionAdapter(Context context) {
        this.f8909a = context;
    }

    public void c(HeartRateConfigHelper heartRateConfigHelper, gzf gzfVar) {
        this.e = heartRateConfigHelper;
        this.f = gzfVar;
    }

    public void b(FitWorkout fitWorkout) {
        if (fitWorkout == null || njy.e(fitWorkout.getCourseActions())) {
            LogUtil.j("Suggestion_CustomCourseDetailActionAdapter", "setFitWorkout, fitWorkout == null or CollectionUtils.isEmpty(fitWorkout.getCourseActions())");
            return;
        }
        ArrayList<hdr> arrayList = this.f8911c;
        if (arrayList == null) {
            this.f8911c = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        for (ChoreographedMultiActions choreographedMultiActions : fitWorkout.getCourseActions()) {
            if (choreographedMultiActions == null || !njy.b(choreographedMultiActions.getActionList())) {
                LogUtil.j("Suggestion_CustomCourseDetailActionAdapter", "setFitWorkout, multiActions == null or multiActions.getActionList() isEmpty");
            } else {
                a(choreographedMultiActions);
            }
        }
        notifyDataSetChanged();
    }

    private void a(ChoreographedMultiActions choreographedMultiActions) {
        int i = 0;
        if (choreographedMultiActions.getRepeatTimes() <= 1 && choreographedMultiActions.getActionList().size() == 1) {
            ChoreographedSingleAction choreographedSingleAction = choreographedMultiActions.getActionList().get(0);
            if (choreographedSingleAction == null || choreographedSingleAction.getAction() == null) {
                return;
            }
            this.f8911c.add(e(choreographedSingleAction, 0));
            return;
        }
        this.f8911c.add(e(choreographedMultiActions));
        int size = choreographedMultiActions.getActionList().size();
        while (i < size) {
            ChoreographedSingleAction choreographedSingleAction2 = choreographedMultiActions.getActionList().get(i);
            if (choreographedSingleAction2 == null || choreographedSingleAction2.getAction() == null) {
                return;
            }
            i++;
            if (i < size) {
                this.f8911c.add(e(choreographedSingleAction2, 1));
            } else {
                this.f8911c.add(e(choreographedSingleAction2, 2));
            }
        }
        hdr hdrVar = new hdr();
        hdrVar.a(4);
        this.f8911c.add(hdrVar);
    }

    private hdr e(ChoreographedMultiActions choreographedMultiActions) {
        hdr hdrVar = new hdr();
        hdrVar.a(3);
        hdrVar.c(choreographedMultiActions.getRepeatTimes());
        return hdrVar;
    }

    private hdr e(ChoreographedSingleAction choreographedSingleAction, int i) {
        hdr hdrVar = new hdr();
        hdrVar.a(i);
        hdrVar.c(0);
        AtomicAction action = choreographedSingleAction.getAction();
        if (action == null) {
            LogUtil.e("Suggestion_CustomCourseDetailActionAdapter", "getSingleActionItemConfig action is null.");
            return hdrVar;
        }
        int iB = new gzy().b(action.getId().trim());
        if (iB != 0) {
            hdrVar.c(BaseApplication.getContext().getResources().getString(iB));
        } else {
            hdrVar.c(action.getName());
        }
        hdrVar.b(action.getId());
        if (this.d == null || this.i == null) {
            b();
        }
        if (choreographedSingleAction.getTargetConfig() != null) {
            hdrVar.d(this.f8909a, choreographedSingleAction.getTargetConfig(), this.d);
        }
        if (choreographedSingleAction.getIntensityConfig() != null) {
            hdrVar.d(this.f8909a, choreographedSingleAction.getIntensityConfig(), this.d, this.i, this.f8910b, this.f);
        }
        return hdrVar;
    }

    private void b() {
        HeartRateConfigHelper heartRateConfigHelper = this.e;
        if (heartRateConfigHelper == null) {
            LogUtil.j("Suggestion_CustomCourseDetailActionAdapter", "initHeartRateZoneConfig, mHeartRateConfigHelper is null");
            return;
        }
        HeartZoneConf heartZoneConfC = heartRateConfigHelper.c();
        if (heartZoneConfC != null) {
            this.d = hcc.c(heartZoneConfC);
            this.i = hcc.a(heartZoneConfC);
            this.f8910b = heartZoneConfC.getClassifyMethod();
            LogUtil.a("Suggestion_CustomCourseDetailActionAdapter", "initHeartRateZoneConfig:", heartZoneConfC.toString());
            return;
        }
        LogUtil.j("Suggestion_CustomCourseDetailActionAdapter", "initHeartRateZoneConfig, heartZoneConf == null");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < this.f8911c.size()) {
            return this.f8911c.get(i).h();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CustomCourseDragViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f8909a);
        if (i == 0) {
            return new CourseDetailActionViewHolder(layoutInflaterFrom.inflate(R.layout.sug_course_detail_item_action_card, viewGroup, false), i);
        }
        if (i == 3) {
            return new CourseMultiViewHolder(layoutInflaterFrom.inflate(R.layout.sug_custom_course_item_multi, viewGroup, false), this.f8909a);
        }
        if (i == 4) {
            return new CourseMultiBottomViewHolder(layoutInflaterFrom.inflate(R.layout.sug_custom_course_item_multi_space, viewGroup, false));
        }
        return new CourseDetailActionViewHolder(layoutInflaterFrom.inflate(R.layout.sug_course_detail_item_action_multi, viewGroup, false), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(CustomCourseDragViewHolder customCourseDragViewHolder, int i) {
        if (i < this.f8911c.size()) {
            customCourseDragViewHolder.init(this.f8911c.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(CustomCourseDragViewHolder customCourseDragViewHolder, int i, List<Object> list) {
        super.onBindViewHolder(customCourseDragViewHolder, i, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<hdr> arrayList = this.f8911c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
