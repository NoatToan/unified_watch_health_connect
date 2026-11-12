package com.huawei.health.suggestion.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity;
import com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter;
import com.huawei.health.suggestion.ui.fitness.helper.RecyclerHolder;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity;
import com.huawei.healthcloud.plugintrack.model.JudgeRootBean;
import com.huawei.healthcloud.plugintrack.model.PostureJudgeBean;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.TrainAction;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import defpackage.btt;
import defpackage.gzx;
import defpackage.idy;
import defpackage.iov;
import defpackage.jbo;
import defpackage.jpz;
import defpackage.jqg;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqf;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class PostureSuggestBaseFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f9546a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HealthTextView f9548c;
    protected View d;
    protected ImageView e;
    protected HealthTextView f;
    protected HealthTextView g;
    protected HealthTextView h;
    protected HealthTextView i;
    protected HealthTextView j;
    protected HealthTextView k;
    private BaseRecyclerViewAdapter<Motion> l;
    protected HealthTableWidget m;
    protected RunningPostureAdviceBase n;
    private HashMap<SportDetailChartDataType, List<jbo>> o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f9547b = 0;
    private List<Motion> p = new ArrayList();

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9546a = getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.n = (RunningPostureAdviceBase) arguments.getParcelable("runningPostureAdvice");
            Serializable serializable = arguments.getSerializable("runningPostureJudgeList");
            if (serializable instanceof HashMap) {
                this.o = (HashMap) serializable;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_running_posture_suggest_fragment, viewGroup, false);
        e(viewInflate);
        b();
        return viewInflate;
    }

    protected void b() {
        RunningPostureAdviceBase runningPostureAdviceBase = this.n;
        if (runningPostureAdviceBase == null) {
            LogUtil.j("Suggestion_PostureFragment", "initViewData mRunningPostureAdvice is null.");
            return;
        }
        int iAcquireLevel = runningPostureAdviceBase.acquireLevel();
        if (iAcquireLevel == -1) {
            this.h.setTextColor(getResources().getColor(R.color.track_detail_running_posture_color_poorer));
        } else if (iAcquireLevel == 0) {
            this.h.setTextColor(getResources().getColor(R.color.track_detail_running_posture_color_suboptimal));
        } else if (iAcquireLevel == 1) {
            this.h.setTextColor(getResources().getColor(R.color.track_detail_running_posture_color_normal));
        } else if (iAcquireLevel == 2) {
            this.h.setTextColor(getResources().getColor(R.color.track_detail_running_posture_color_good));
        } else if (iAcquireLevel == 3) {
            this.h.setTextColor(getResources().getColor(R.color.track_detail_running_posture_color_excellent));
        }
        this.h.setText(getString(this.n.acquireLevelShortTip()));
        if (this.f9547b == 0 && this.n.acquireLevel() == 1) {
            this.f.setText(String.format(getString(this.n.acquireAdvice()), 200));
        }
        this.f.setText(String.format(getString(this.n.acquireAdvice()), 200));
        this.g.setText(getString(this.n.acquireLevelLongTip()));
    }

    protected void e(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_PostureFragment", "initLayout rootView == null");
            return;
        }
        this.i = (HealthTextView) view.findViewById(R.id.sug_running_posture_item_name);
        this.k = (HealthTextView) view.findViewById(R.id.sug_running_posture_item_value);
        this.j = (HealthTextView) view.findViewById(R.id.sug_running_posture_item_unit);
        this.h = (HealthTextView) view.findViewById(R.id.sug_running_posture_item_level);
        this.g = (HealthTextView) view.findViewById(R.id.sug_running_posture_item_title);
        this.f = (HealthTextView) view.findViewById(R.id.sug_running_posture_item_text);
        this.f9548c = (HealthTextView) view.findViewById(R.id.sug_running_posture_action_title);
        this.e = (ImageView) view.findViewById(R.id.img_explain_icon);
        this.f9548c.setText(getString(com.huawei.ui.commonui.R.string.IDS_hwh_action_training));
        this.d = view.findViewById(R.id.sug_posture_action_layout);
        this.m = (HealthTableWidget) view.findViewById(R.id.pace_table_layout);
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.sug_running_posture_action_recv);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        a();
        c();
        healthRecycleView.setAdapter(this.l);
        this.d.setVisibility(8);
        this.m.setVisibility(8);
    }

    private List<PostureJudgeBean> d() {
        return ((JudgeRootBean) new Gson().fromJson(jpz.b(BaseApplication.getContext()), JudgeRootBean.class)).getJudge();
    }

    protected void c(SportDetailChartDataType sportDetailChartDataType) {
        List<PostureJudgeBean> listD = d();
        HashMap<SportDetailChartDataType, List<jbo>> map = this.o;
        if (map == null || map.isEmpty() || !this.o.containsKey(sportDetailChartDataType)) {
            LogUtil.j("Suggestion_PostureFragment", "mMap is wrong");
            return;
        }
        new jqg(this.f9546a, sportDetailChartDataType, listD, this.o.get(sportDetailChartDataType)).d(this.m, jpz.b(new HealthColumnSystem(this.f9546a), true));
    }

    private void a() {
        this.l = new BaseRecyclerViewAdapter<Motion>(new ArrayList(), R.layout.sug_fitness_rec_action_outof_workout) { // from class: com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment.2
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i, Motion motion) {
                String strC;
                if (recyclerHolder == null || motion == null || PostureSuggestBaseFragment.this.f9546a == null) {
                    LogUtil.j("Suggestion_PostureFragment", "convert holder == null || itemData == null || mContext == null");
                    return;
                }
                if (LanguageUtil.ba(PostureSuggestBaseFragment.this.f9546a)) {
                    strC = gzx.c(PostureSuggestBaseFragment.this.f9546a, R.string.sug_fitness_grop_sec_rtl, UnitUtil.e(Math.round(motion.acquireDuration() / 1000.0f), 1, 0), UnitUtil.e(motion.acquireGroups(), 1, 0));
                } else {
                    strC = gzx.c(PostureSuggestBaseFragment.this.f9546a, R.string.sug_fitness_grop_sec, UnitUtil.e(motion.acquireGroups(), 1, 0), UnitUtil.e(Math.round(motion.acquireDuration() / 1000.0f), 1, 0));
                }
                recyclerHolder.c(R.id.sug_fitness_iv_train_pic, motion.acquirePicUrl(), qqf.e).b(R.id.tv_train_title_adv, motion.acquireName()).b(R.id.tv_train_n_adv, strC).b(R.id.sug_fitness_rec_gap, gzx.d(R.plurals.IDS_plugin_fitnessadvice_second_nogap, motion.acquireGap(), UnitUtil.e(motion.acquireGap(), 1, 0)));
                if (i != getItemCount() - 1) {
                    recyclerHolder.e(R.id.tv_train_seg_adv, 0);
                }
            }
        };
    }

    private void c() {
        this.l.setOnItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener() { // from class: com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment.4
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                if (PostureSuggestBaseFragment.this.l.get(i) != null) {
                    if (((Motion) PostureSuggestBaseFragment.this.l.get(i)).getDescription() == null) {
                        LogUtil.j("Suggestion_PostureFragment", "mAdapter.setOnItemClickListener1: mAdapter.get(position).getDescription() == null");
                        return;
                    }
                    HashMap map = new HashMap(3);
                    map.put("click", "1");
                    map.put("postureId", Integer.valueOf(PostureSuggestBaseFragment.this.f9547b));
                    map.put("actionId", ((Motion) PostureSuggestBaseFragment.this.l.get(i)).acquireId());
                    idy.b("1130025", map);
                    Intent intent = new Intent(PostureSuggestBaseFragment.this.f9546a, (Class<?>) FitnessActionDetailActivity.class);
                    intent.putExtra("action_id", ((Motion) PostureSuggestBaseFragment.this.l.get(i)).acquireId());
                    intent.putExtra("action_version", ((Motion) PostureSuggestBaseFragment.this.l.get(i)).acquireVersion());
                    intent.setFlags(268435456);
                    iov.d(PostureSuggestBaseFragment.this.f9546a, intent);
                    return;
                }
                LogUtil.j("Suggestion_PostureFragment", "mAdapter.setOnItemClickListener1: mAdapter.get(position) == null");
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment.1
            @Override // java.lang.Runnable
            public void run() {
                PostureSuggestBaseFragment.this.e();
            }
        });
    }

    public void e() {
        SportSupportUtil.e(new c());
    }

    static class c implements SportSupportUtil.OnFitnessGetFilterTabListener {
        private final WeakReference<PostureSuggestBaseFragment> d;

        private c(PostureSuggestBaseFragment postureSuggestBaseFragment) {
            this.d = new WeakReference<>(postureSuggestBaseFragment);
        }

        @Override // com.huawei.health.sport.utils.SportSupportUtil.OnFitnessGetFilterTabListener
        public void onFilterTabSuccess(boolean z) {
            if (!z) {
                ReleaseLogUtil.d("Suggestion_PostureFragment", "ActionOpenCallback isOpen false");
                return;
            }
            PostureSuggestBaseFragment postureSuggestBaseFragment = this.d.get();
            if (postureSuggestBaseFragment == null) {
                LogUtil.j("Suggestion_PostureFragment", "fragment have not init");
                return;
            }
            RunningPostureAdviceBase runningPostureAdviceBase = postureSuggestBaseFragment.n;
            if (runningPostureAdviceBase == null) {
                ReleaseLogUtil.e("Suggestion_PostureFragment", "ActionOpenCallback runningPostureAdvice null");
                return;
            }
            List<String> listAcquireActionList = runningPostureAdviceBase.acquireActionList();
            if (njy.e(listAcquireActionList)) {
                ReleaseLogUtil.e("Suggestion_PostureFragment", "ActionOpenCallback actionList null");
                return;
            }
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi != null) {
                courseApi.getCourseTrainAction(listAcquireActionList, new d(listAcquireActionList, postureSuggestBaseFragment));
            }
        }
    }

    static class d extends UiCallback<List<TrainAction>> {
        private final WeakReference<PostureSuggestBaseFragment> d;
        private final List<String> e;

        d(List<String> list, PostureSuggestBaseFragment postureSuggestBaseFragment) {
            this.d = new WeakReference<>(postureSuggestBaseFragment);
            this.e = list;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            PostureSuggestBaseFragment postureSuggestBaseFragment = this.d.get();
            if (postureSuggestBaseFragment != null) {
                postureSuggestBaseFragment.c(this.e);
            } else {
                LogUtil.j("Suggestion_PostureFragment", "CourseUiCallback onFailure fragment == null");
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<TrainAction> list) {
            PostureSuggestBaseFragment postureSuggestBaseFragment = this.d.get();
            if (postureSuggestBaseFragment != null) {
                postureSuggestBaseFragment.e(list, this.e);
            } else {
                LogUtil.j("Suggestion_PostureFragment", "CourseUiCallback onSuccess fragment == null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<String> list) {
        if (!(getActivity() instanceof RuningPostureSuggestActivity)) {
            LogUtil.j("Suggestion_PostureFragment", "onGetActionFailure getActivity() !instanceof RuningPostureSuggestActivity");
            return;
        }
        RuningPostureSuggestActivity runingPostureSuggestActivity = (RuningPostureSuggestActivity) getActivity();
        if (runingPostureSuggestActivity == null) {
            LogUtil.e("Suggestion_PostureFragment", "DownloadUICallback onFailure RunningPostureSuggestActivity == null");
            return;
        }
        List<Motion> list2 = this.p;
        if (list2 != null && list != null && list2.size() == list.size()) {
            LogUtil.e("Suggestion_PostureFragment", "DownloadUICallback onFailure,and local has success download data");
        } else {
            runingPostureSuggestActivity.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<TrainAction> list, List<String> list2) {
        if (!(getActivity() instanceof RuningPostureSuggestActivity)) {
            LogUtil.j("Suggestion_PostureFragment", "onGetActionSuccess getActivity() !instanceof RuningPostureSuggestActivity");
            return;
        }
        RuningPostureSuggestActivity runingPostureSuggestActivity = (RuningPostureSuggestActivity) getActivity();
        if (runingPostureSuggestActivity == null) {
            LogUtil.e("Suggestion_PostureFragment", "DownloadUICallback onFailure RunningPostureSuggestActivity == null");
            return;
        }
        if (list == null) {
            runingPostureSuggestActivity.a();
            LogUtil.j("Suggestion_PostureFragment", "data is null");
        } else if (list2 != null && list.size() != list2.size()) {
            runingPostureSuggestActivity.a();
            LogUtil.j("Suggestion_PostureFragment", "partly of the data is return");
        } else {
            d(this.p, list);
            runingPostureSuggestActivity.b();
            runingPostureSuggestActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment.5
                @Override // java.lang.Runnable
                public void run() {
                    PostureSuggestBaseFragment.this.d.setVisibility(0);
                    PostureSuggestBaseFragment.this.l.refreshDataChange(PostureSuggestBaseFragment.this.p);
                }
            });
        }
    }

    private void d(List<Motion> list, List<TrainAction> list2) {
        LogUtil.a("Suggestion_PostureFragment", "changeToMotion ", list);
        list.clear();
        for (TrainAction trainAction : list2) {
            Motion motion = new Motion();
            motion.setId(trainAction.acquireId());
            motion.saveName(trainAction.acquireName());
            motion.saveMotionType(trainAction.acquireMotionType());
            motion.saveDifficulty(trainAction.acquireDifficulty());
            motion.saveVersion(trainAction.acquireVersion());
            motion.setDescription(trainAction.acquireDescription());
            motion.setEquipments(trainAction.acquireEquipments());
            motion.setTrainingPoints(trainAction.acquireTrainingpoints());
            motion.setModified(trainAction.acquireModified());
            if (njy.b(trainAction.acquireVideos())) {
                Video video = trainAction.acquireVideos().get(0);
                motion.savePicUrl(video.getThumbnail());
                motion.saveMotionPath(video.getUrl());
                motion.setOriginLogo(video.getLogoImgUrl());
                motion.saveLength(video.getLength());
            }
            list.add(motion);
        }
        LogUtil.a("Suggestion_PostureFragment", "changeToMotion ", list);
    }

    protected void d(int i) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("chartType", Integer.valueOf(i));
        map.put("dataPage", "runPostureDetails");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_CIRCLE_RING_GUIDE_1040121.value(), map, 0);
    }
}
