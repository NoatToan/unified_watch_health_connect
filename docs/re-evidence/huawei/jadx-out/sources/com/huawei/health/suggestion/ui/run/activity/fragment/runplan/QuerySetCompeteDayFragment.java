package com.huawei.health.suggestion.ui.run.activity.fragment.runplan;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.GroupBtnSelectedAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.ibe;
import defpackage.ibl;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class QuerySetCompeteDayFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f9897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean[] f9898c;
    private Context e;
    private HealthTextView f;
    private HealthRecycleView g;
    private RunPlanCreateActivity.OnNextPageListener h;
    private RelativeLayout i;
    private HealthColumnLinearLayout j;
    private ImageView k;
    private HealthProgressBar m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<View> f9896a = new ArrayList();
    private List<View> d = new ArrayList();

    public static QuerySetCompeteDayFragment b() {
        return new QuerySetCompeteDayFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.sug_frag_is_set_compete_day, viewGroup, false);
        d(viewInflate);
        return viewInflate;
    }

    private void d(View view) {
        if (view == null) {
            LogUtil.e("Suggestion_QuerySetCompeteDayFragment", "initView view is null.");
            return;
        }
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_tips);
        this.i = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.layout_bubbles);
        this.m = (HealthProgressBar) healthColumnRelativeLayout.findViewById(R.id.tips_image_progress);
        this.k = (ImageView) healthColumnRelativeLayout.findViewById(R.id.tips_image);
        HealthTextView healthTextView = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_question);
        healthTextView.setText(R.string.IDS_sug_prepare_competition);
        this.f9896a.add(healthTextView);
        this.j = (HealthColumnLinearLayout) healthColumnRelativeLayout.findViewById(R.id.layout_summary);
        this.f = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_summary);
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.recycle_yes_or_no);
        this.g = healthRecycleView;
        BaseActivity.setViewSafeRegion(true, healthRecycleView);
        this.f9896a.add(this.g);
        this.d.add(this.g);
        this.f9897b = new String[]{getResources().getString(R.string.IDS_yes), getResources().getString(R.string.IDS_no)};
        this.f9898c = new boolean[2];
        this.g.setAdapter(c());
        this.g.setLayoutManager(d());
        this.g.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.QuerySetCompeteDayFragment.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view2, recyclerView, state);
                int dimension = ((int) QuerySetCompeteDayFragment.this.getResources().getDimension(R.dimen.cardMarginMiddle)) / 2;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (LanguageUtil.ba(QuerySetCompeteDayFragment.this.e)) {
                    if (childAdapterPosition == 0) {
                        rect.left = dimension;
                        return;
                    } else {
                        rect.right = dimension;
                        return;
                    }
                }
                if (childAdapterPosition == 0) {
                    rect.right = dimension;
                } else {
                    rect.left = dimension;
                }
            }
        });
        ibe.a(true, this.f9896a);
        ibl.a(this.e, 70, this.m, this.k);
    }

    private GridLayoutManager d() {
        return new GridLayoutManager(this.e, 2) { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.QuerySetCompeteDayFragment.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
    }

    private GroupBtnSelectedAdapter c() {
        final GroupBtnSelectedAdapter groupBtnSelectedAdapter = new GroupBtnSelectedAdapter(this.e, this.f9897b, this.f9898c, R.layout.item_query_button);
        groupBtnSelectedAdapter.c(this.e.getResources().getDrawable(R.drawable.item_button_white_unselect_bg), this.e.getResources().getColor(R.color.textColorSecondary));
        groupBtnSelectedAdapter.d(this.e.getResources().getDrawable(R.drawable.item_button_selected_bg), this.e.getResources().getColor(R.color.textColorPrimaryInverse));
        groupBtnSelectedAdapter.d(new GroupBtnSelectedAdapter.OnItemClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.QuerySetCompeteDayFragment.3
            @Override // com.huawei.ui.commonui.adapter.GroupBtnSelectedAdapter.OnItemClickListener
            public void onItemClick(View view, HealthButton healthButton, int i) {
                FragmentActivity activity = QuerySetCompeteDayFragment.this.getActivity();
                if (activity == null || qrs.c(500)) {
                    LogUtil.j("Suggestion_QuerySetCompeteDayFragment", "adapter onItemClick activity is null or click too fast.");
                    return;
                }
                if (i == 0) {
                    QuerySetCompeteDayFragment.this.f9898c[i] = true;
                    QuerySetCompeteDayFragment.this.f9898c[1] = false;
                    QuerySetCompeteDayFragment.this.f.setText(QuerySetCompeteDayFragment.this.getString(R.string.IDS_yes));
                } else {
                    QuerySetCompeteDayFragment.this.f9898c[0] = false;
                    QuerySetCompeteDayFragment.this.f9898c[i] = true;
                    QuerySetCompeteDayFragment.this.f.setText(QuerySetCompeteDayFragment.this.getString(R.string.IDS_no));
                }
                groupBtnSelectedAdapter.notifyDataSetChanged();
                if (QuerySetCompeteDayFragment.this.h != null) {
                    QuerySetCompeteDayFragment.this.h.backLock();
                    ibe.a(false, QuerySetCompeteDayFragment.this.d);
                    ibe.a(QuerySetCompeteDayFragment.this.i, QuerySetCompeteDayFragment.this.j, QuerySetCompeteDayFragment.this.h, QuerySetCompeteDayFragment.this.f9898c[0]);
                    return;
                }
                activity.finish();
            }
        });
        return groupBtnSelectedAdapter;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            LogUtil.a("Suggestion_QuerySetCompeteDayFragment", "isHidden fragment.");
        } else {
            this.i.setVisibility(0);
            ibe.a(true, this.f9896a);
        }
    }

    public void c(RunPlanCreateActivity.OnNextPageListener onNextPageListener) {
        this.h = onNextPageListener;
    }
}
