package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.audio.SleepAudioGroup;
import com.huawei.pluginfitnessadvice.audio.SleepAudioInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import defpackage.coq;
import defpackage.qqs;
import defpackage.yls;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SleepSeriesCourseListAdapter extends RecyclerView.Adapter<SeriesListViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SleepAudioSeries f27773b;
    private int d;
    private List<SleepAudioGroup> e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27774c = false;

    public SleepSeriesCourseListAdapter(Context context) {
        this.f27772a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SeriesListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SeriesListViewHolder(LayoutInflater.from(this.f27772a).inflate(R.layout.sleep_series_course_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SeriesListViewHolder seriesListViewHolder, int i) {
        if (yls.e(this.e, i)) {
            LogUtil.a("SleepSeriesCourseListAdapter", "invalid position: ", Integer.valueOf(i));
            return;
        }
        LogUtil.a("SleepSeriesCourseListAdapter", "onBindViewHolder: ", Integer.valueOf(i));
        int i2 = this.d;
        if (i2 == 1) {
            seriesListViewHolder.f.setVisibility(8);
            SleepAudioGroup sleepAudioGroup = this.e.get(0);
            if (sleepAudioGroup == null) {
                LogUtil.a("SleepSeriesCourseListAdapter", "group is null");
                return;
            }
            List<SleepAudioInfo> sleepAudioInfoList = sleepAudioGroup.getSleepAudioInfoList();
            if (coq.d(sleepAudioInfoList)) {
                LogUtil.a("SleepSeriesCourseListAdapter", "courseList is null");
                return;
            }
            SleepCourseItemListAdapter sleepCourseItemListAdapter = new SleepCourseItemListAdapter(this.f27772a, sleepAudioInfoList, this.f27773b, this.f27774c);
            seriesListViewHolder.e.setNestedScrollingEnabled(false);
            seriesListViewHolder.e.b(false);
            seriesListViewHolder.e.setLayoutManager(new LinearLayoutManager(this.f27772a, 1, false));
            seriesListViewHolder.e.setAdapter(sleepCourseItemListAdapter);
            return;
        }
        if (i2 == 2) {
            SleepAudioGroup sleepAudioGroup2 = this.e.get(i);
            if (sleepAudioGroup2 == null) {
                LogUtil.a("SleepSeriesCourseListAdapter", "group is null");
                return;
            }
            seriesListViewHolder.d.setText(sleepAudioGroup2.getFirstTitle());
            seriesListViewHolder.f27776b.setOnClickListener(new b(seriesListViewHolder));
            SleepCourseItemListAdapter sleepCourseItemListAdapter2 = new SleepCourseItemListAdapter(this.f27772a, sleepAudioGroup2.getSleepAudioInfoList(), this.f27773b, this.f27774c);
            seriesListViewHolder.e.setNestedScrollingEnabled(false);
            seriesListViewHolder.e.b(false);
            seriesListViewHolder.e.setLayoutManager(new LinearLayoutManager(this.f27772a, 1, false));
            seriesListViewHolder.e.setAdapter(sleepCourseItemListAdapter2);
            return;
        }
        LogUtil.a("SleepSeriesCourseListAdapter", "mDisplayStyle is invalid");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = this.d;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return this.e.size();
        }
        return 0;
    }

    public void c(int i, List<SleepAudioGroup> list, SleepAudioSeries sleepAudioSeries) {
        if (coq.d(list)) {
            LogUtil.a("SleepSeriesCourseListAdapter", "data list is empty");
            return;
        }
        this.d = i;
        this.f27773b = sleepAudioSeries;
        this.e.clear();
        int i2 = this.d;
        if (i2 == 1) {
            this.e.add(list.get(0));
        } else if (i2 == 2) {
            this.e.addAll(list);
        } else {
            LogUtil.a("SleepSeriesCourseListAdapter", "displayStyle is invalid");
            return;
        }
        notifyDataSetChanged();
    }

    public void a(final boolean z) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.adapter.SleepSeriesCourseListAdapter.5
                @Override // java.lang.Runnable
                public void run() {
                    SleepSeriesCourseListAdapter.this.a(z);
                }
            });
            return;
        }
        LogUtil.a("SleepSeriesCourseListAdapter", "refreshVipInfo, isVip: ", Boolean.valueOf(z));
        if (this.f27774c != z) {
            this.f27774c = z;
            notifyDataSetChanged();
        }
    }

    class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f27778a = true;
        private SeriesListViewHolder d;

        public b(SeriesListViewHolder seriesListViewHolder) {
            this.d = seriesListViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f27778a) {
                this.d.f27777c.setScaleY(-1.0f);
                if (qqs.e(SleepSeriesCourseListAdapter.this.f27772a)) {
                    this.d.f27777c.setBackground(SleepSeriesCourseListAdapter.this.f27772a.getResources().getDrawable(R.drawable.array_up_dark));
                } else {
                    this.d.f27777c.setBackground(SleepSeriesCourseListAdapter.this.f27772a.getResources().getDrawable(R.drawable.course_array_up));
                }
                this.d.f27775a.setVisibility(8);
            } else {
                this.d.f27777c.setScaleY(1.0f);
                if (qqs.e(SleepSeriesCourseListAdapter.this.f27772a)) {
                    this.d.f27777c.setBackground(SleepSeriesCourseListAdapter.this.f27772a.getResources().getDrawable(R.drawable.array_up_dark));
                } else {
                    this.d.f27777c.setBackground(SleepSeriesCourseListAdapter.this.f27772a.getResources().getDrawable(R.drawable.course_array_up));
                }
                this.d.f27775a.setVisibility(0);
            }
            this.f27778a = !this.f27778a;
        }
    }

    public static class SeriesListViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RelativeLayout f27775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f27776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f27777c;
        private HealthTextView d;
        private HealthRecycleView e;
        private LinearLayout f;

        public SeriesListViewHolder(View view) {
            super(view);
            this.f = (LinearLayout) view.findViewById(R.id.title_layout);
            this.d = (HealthTextView) view.findViewById(R.id.series_title);
            this.f27777c = (ImageView) view.findViewById(R.id.array_img);
            if (qqs.e(view.getContext())) {
                this.f27777c.setBackground(view.getContext().getDrawable(R.drawable.array_up_dark));
            } else {
                this.f27777c.setBackground(view.getContext().getDrawable(R.drawable.course_array_up));
            }
            this.f27776b = (LinearLayout) view.findViewById(R.id.array_layout);
            this.f27775a = (RelativeLayout) view.findViewById(R.id.course_recycle_view_layout);
            this.e = (HealthRecycleView) view.findViewById(R.id.course_recycle_view);
        }
    }
}
