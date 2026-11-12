package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.SeriesSummaryAdapter;
import health.compact.a.LogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SeriesCourseSummaryFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SeriesSummaryAdapter f26749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthCardView f26750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f26751c;
    private View d;
    private Context e;
    private HealthTextView f;
    private ImageView g;
    private RecyclerView h;
    private SleepAudioPackage i;
    private ImageView j;
    private HealthTextView l;

    public static SeriesCourseSummaryFragment c(String str, SleepAudioPackage sleepAudioPackage) {
        Bundle bundle = new Bundle();
        bundle.putString("topicId", str);
        bundle.putParcelable("packageInfo", sleepAudioPackage);
        SeriesCourseSummaryFragment seriesCourseSummaryFragment = new SeriesCourseSummaryFragment();
        seriesCourseSummaryFragment.setArguments(bundle);
        return seriesCourseSummaryFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.b("SeriesCourseSummaryFragment", "onCreate");
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                this.i = (SleepAudioPackage) arguments.getParcelable("packageInfo");
            } catch (BadParcelableException unused) {
                LogUtil.d("SeriesCourseSummaryFragment", "BadParcelableException");
            }
        }
        this.e = getContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.d == null) {
            this.d = layoutInflater.inflate(R.layout.series_course_summary_fragment_layout, viewGroup, false);
            c();
        }
        return this.d;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.huawei.hwlogsmodel.LogUtil.a("SeriesCourseSummaryFragment", "onConfigurationChanged");
        this.h.setLayoutManager(new LinearLayoutManager(this.e, 1, false));
    }

    private void c() {
        this.g = (ImageView) this.d.findViewById(R.id.head_img);
        this.h = (RecyclerView) this.d.findViewById(R.id.summary_recycle_view);
        HealthCardView healthCardView = (HealthCardView) this.d.findViewById(R.id.card_view);
        this.f26750b = healthCardView;
        ViewGroup.LayoutParams layoutParams = healthCardView.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
            layoutParams2.setMargins(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue(), getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart), dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue(), getResources().getDimensionPixelSize(R.dimen.defaultPaddingBottomFixed));
            this.f26750b.setLayoutParams(layoutParams2);
        }
        this.j = (ImageView) this.d.findViewById(R.id.left_img);
        this.f26751c = (HealthTextView) this.d.findViewById(R.id.course_from);
        this.l = (HealthTextView) this.d.findViewById(R.id.title);
        this.f = (HealthTextView) this.d.findViewById(R.id.des);
        this.h.setLayoutManager(new LinearLayoutManager(this.e, 1, false));
        if (this.f26749a == null) {
            this.f26749a = new SeriesSummaryAdapter(this.e);
        }
        this.h.setAdapter(this.f26749a);
    }

    public void d(final Map<String, Drawable> map, final SeriesCourseListActivity seriesCourseListActivity, final List<String> list) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseSummaryFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseSummaryFragment.this.d(map, seriesCourseListActivity, list);
                }
            });
            return;
        }
        LogUtil.b("SeriesCourseSummaryFragment", "merge");
        if (map == null || map.isEmpty()) {
            LogUtil.d("SeriesCourseSummaryFragment", "drawables is null or empty");
            return;
        }
        if (seriesCourseListActivity == null) {
            LogUtil.d("SeriesCourseSummaryFragment", "activity is null");
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.d("SeriesCourseSummaryFragment", "urlList is null or empty");
            return;
        }
        SeriesSummaryAdapter seriesSummaryAdapter = this.f26749a;
        if (seriesSummaryAdapter == null) {
            LogUtil.d("SeriesCourseSummaryFragment", "mAdapter is null");
        } else {
            seriesSummaryAdapter.e(map, seriesCourseListActivity, list);
        }
    }
}
