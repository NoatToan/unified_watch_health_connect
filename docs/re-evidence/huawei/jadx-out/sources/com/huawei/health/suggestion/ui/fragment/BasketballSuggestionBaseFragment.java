package com.huawei.health.suggestion.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BasketballSuggestionActivity;
import com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter;
import com.huawei.health.suggestion.ui.fitness.helper.RecyclerHolder;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.BasketballAdvice;
import com.huawei.pluginfitnessadvice.TrainAction;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btt;
import defpackage.btx;
import defpackage.gzx;
import defpackage.njy;
import defpackage.qqf;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class BasketballSuggestionBaseFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected BasketballAdvice f9531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f9532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HealthTextView f9533c;
    protected Context d;
    protected HealthTextView e;
    protected HealthTextView f;
    protected ImageView g;
    protected HealthTextView h;
    protected HealthTextView i;
    protected HealthTextView j;
    private List<Motion> m = new ArrayList();
    private BaseRecyclerViewAdapter<Motion> n;

    protected void c() {
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f9531a = (BasketballAdvice) arguments.getParcelable("basketballAdvice");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_basketball_suggest_fragment, viewGroup, false);
        c(viewInflate);
        c();
        return viewInflate;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.fragment.BasketballSuggestionBaseFragment.1
            @Override // java.lang.Runnable
            public void run() {
                BasketballSuggestionBaseFragment.this.e();
            }
        });
    }

    public void e() {
        if (!LanguageUtil.l(btx.c()) || Utils.o()) {
            LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "the oversea not support action");
            return;
        }
        BasketballAdvice basketballAdvice = this.f9531a;
        if (basketballAdvice == null) {
            LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "fragment have not init");
            return;
        }
        List<String> actionList = basketballAdvice.getActionList();
        if (njy.e(actionList)) {
            LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "idList is empty");
        } else {
            b(actionList);
        }
    }

    protected void c(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "initLayout rootView == null");
            return;
        }
        this.i = (HealthTextView) view.findViewById(R.id.sug_item_value);
        this.j = (HealthTextView) view.findViewById(R.id.sug_item_unit);
        this.f9533c = (HealthTextView) view.findViewById(R.id.sug_item_text);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.sug_action_title);
        this.e = healthTextView;
        healthTextView.setText(getString(com.huawei.ui.commonui.R.string.IDS_hwh_action_training));
        this.h = (HealthTextView) view.findViewById(R.id.sug_suggest_item_title);
        this.f = (HealthTextView) view.findViewById(R.id.sug_suggest_item_text);
        this.g = (ImageView) view.findViewById(R.id.sug_suggest_item_img);
        this.f9532b = view.findViewById(R.id.sug_action_layout);
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.sug_action_recv);
        b();
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.n.setOnItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener() { // from class: com.huawei.health.suggestion.ui.fragment.BasketballSuggestionBaseFragment.5
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                if (BasketballSuggestionBaseFragment.this.n != null) {
                    if (i >= 0 && i < BasketballSuggestionBaseFragment.this.n.getItemCount() && BasketballSuggestionBaseFragment.this.n.get(i) != null) {
                        if (((Motion) BasketballSuggestionBaseFragment.this.n.get(i)).getDescription() == null) {
                            LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "mAdapter.setOnItemClickListener1: mAdapter.get(position).getDescription() == null");
                            return;
                        } else if (BasketballSuggestionBaseFragment.this.getActivity() instanceof BasketballSuggestionActivity) {
                            ((BasketballSuggestionActivity) BasketballSuggestionBaseFragment.this.getActivity()).e(i, BasketballSuggestionBaseFragment.this.m);
                            return;
                        } else {
                            LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "getActivity() not instance of BasketballSuggestionActivity");
                            return;
                        }
                    }
                    LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "position out of bounds or mAdapter.get(position) == null");
                    return;
                }
                LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "mAdapter.setOnItemClickListener1: mAdapter == null");
            }
        });
        healthRecycleView.setAdapter(this.n);
        this.f9532b.setVisibility(8);
    }

    private void b() {
        this.n = new BaseRecyclerViewAdapter<Motion>(new ArrayList(), R.layout.sug_fitness_rec_action_outof_workout) { // from class: com.huawei.health.suggestion.ui.fragment.BasketballSuggestionBaseFragment.4
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i, Motion motion) {
                String strC;
                if (recyclerHolder == null || motion == null) {
                    LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "holder || itemData is null");
                    return;
                }
                if (LanguageUtil.ba(BasketballSuggestionBaseFragment.this.d)) {
                    strC = gzx.c(BasketballSuggestionBaseFragment.this.d, R.string.sug_fitness_grop_sec_rtl, UnitUtil.e(Math.round(motion.acquireDuration() / 1000.0f), 1, 0), UnitUtil.e(motion.acquireGroups(), 1, 0));
                } else {
                    strC = gzx.c(BasketballSuggestionBaseFragment.this.d, R.string.sug_fitness_grop_sec, UnitUtil.e(motion.acquireGroups(), 1, 0), UnitUtil.e(Math.round(motion.acquireDuration() / 1000.0f), 1, 0));
                }
                recyclerHolder.c(R.id.sug_fitness_iv_train_pic, motion.acquirePicUrl(), qqf.e).b(R.id.tv_train_title_adv, motion.acquireName()).b(R.id.tv_train_n_adv, strC).b(R.id.sug_fitness_rec_gap, gzx.d(R.plurals.IDS_plugin_fitnessadvice_second_nogap, motion.acquireGap(), UnitUtil.e(motion.acquireGap(), 1, 0)));
                if (i != getItemCount() - 1) {
                    recyclerHolder.e(R.id.tv_train_seg_adv, 0);
                }
            }
        };
    }

    private void b(final List<String> list) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "getActions : courseApi is null.");
        } else {
            courseApi.getCourseTrainAction(list, new UiCallback<List<TrainAction>>() { // from class: com.huawei.health.suggestion.ui.fragment.BasketballSuggestionBaseFragment.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    if (BasketballSuggestionBaseFragment.this.getActivity() instanceof BasketballSuggestionActivity) {
                        BasketballSuggestionActivity basketballSuggestionActivity = (BasketballSuggestionActivity) BasketballSuggestionBaseFragment.this.getActivity();
                        if (basketballSuggestionActivity != null) {
                            if (BasketballSuggestionBaseFragment.this.m != null && BasketballSuggestionBaseFragment.this.m.size() == list.size()) {
                                LogUtil.e("Suggestion_BasketballSuggestionBaseFragment", "DownloadUICallback onFailure,and local has success download data");
                                return;
                            } else {
                                basketballSuggestionActivity.d();
                                return;
                            }
                        }
                        LogUtil.e("Suggestion_BasketballSuggestionBaseFragment", "DownloadUICallback onFailure BasketballSuggestionActivity == null");
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<TrainAction> list2) {
                    BasketballSuggestionBaseFragment.this.d(list2, list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<TrainAction> list, List<String> list2) {
        if (getActivity() instanceof BasketballSuggestionActivity) {
            BasketballSuggestionActivity basketballSuggestionActivity = (BasketballSuggestionActivity) getActivity();
            if (basketballSuggestionActivity == null) {
                LogUtil.e("Suggestion_BasketballSuggestionBaseFragment", "DownloadUICallback onFailure BasketballSuggestionActivity == null");
                return;
            }
            if (list == null) {
                basketballSuggestionActivity.d();
                LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "data is null");
            } else if (list.size() != list2.size()) {
                basketballSuggestionActivity.d();
                LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "partly of the data is return");
            } else {
                b(this.m, list);
                basketballSuggestionActivity.a();
                basketballSuggestionActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fragment.BasketballSuggestionBaseFragment.2
                    @Override // java.lang.Runnable
                    public void run() {
                        BasketballSuggestionBaseFragment.this.f9532b.setVisibility(0);
                        BasketballSuggestionBaseFragment.this.n.refreshDataChange(BasketballSuggestionBaseFragment.this.m);
                    }
                });
            }
        }
    }

    private void b(List<Motion> list, List<TrainAction> list2) {
        LogUtil.a("Suggestion_BasketballSuggestionBaseFragment", "changeToMotion ", list);
        list.clear();
        for (TrainAction trainAction : list2) {
            if (trainAction == null) {
                LogUtil.j("Suggestion_BasketballSuggestionBaseFragment", "action = null");
            } else {
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
                if (trainAction.acquireVideos() != null && trainAction.acquireVideos().size() > 0) {
                    Video video = trainAction.acquireVideos().get(0);
                    motion.savePicUrl(video.getThumbnail());
                    motion.saveMotionPath(video.getUrl());
                    motion.setOriginLogo(video.getLogoImgUrl());
                    motion.saveLength(video.getLength());
                }
                list.add(motion);
            }
        }
        LogUtil.a("Suggestion_BasketballSuggestionBaseFragment", "changeToMotion ", list);
    }
}
