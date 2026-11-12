package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.fsw;
import defpackage.ftl;
import defpackage.njy;
import defpackage.qqz;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveTrendListAdapter extends RecyclerView.Adapter<SectionActiveTrendListViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<fsw> f7331a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7332c;
    private OnClickSectionListener e;

    public SectionActiveTrendListAdapter(Context context, List<fsw> list) {
        this.f7332c = context;
        this.f7331a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SectionActiveTrendListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SectionActiveTrendListViewHolder(LayoutInflater.from(this.f7332c).inflate(R.layout.section_active_trend_recyclerview_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SectionActiveTrendListViewHolder sectionActiveTrendListViewHolder, final int i) {
        if (njy.e(this.f7331a, i)) {
            LogUtil.j("SectionActiveTrendListAdapter", "onBindViewHolder position is out of bounds");
            return;
        }
        List<fsw> list = this.f7331a;
        if (list == null) {
            LogUtil.j("SectionActiveTrendListAdapter", "onBindViewHolder mSectionActiveTrendList is null");
            return;
        }
        fsw fswVar = list.get(i);
        if (fswVar == null) {
            LogUtil.j("SectionActiveTrendListAdapter", "onBindViewHolder bean is null");
        } else {
            b(sectionActiveTrendListViewHolder, fswVar);
            sectionActiveTrendListViewHolder.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionActiveTrendListAdapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (SectionActiveTrendListAdapter.this.e != null) {
                        SectionActiveTrendListAdapter.this.e.onClick(i);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<fsw> list = this.f7331a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void b(SectionActiveTrendListViewHolder sectionActiveTrendListViewHolder, fsw fswVar) {
        CharSequence charSequenceB = ftl.b(this.f7332c, ftl.a(fswVar.e()), fswVar.a(), R.dimen.textSizeHeadline8);
        CharSequence charSequenceB2 = ftl.b(this.f7332c, ftl.a(fswVar.c()), fswVar.d(), R.dimen.textSizeHeadline8);
        int i = fswVar.i();
        if (i == 0) {
            e(sectionActiveTrendListViewHolder, fswVar);
        } else if (i == 1) {
            a(sectionActiveTrendListViewHolder, fswVar);
        } else if (i == 2) {
            d(sectionActiveTrendListViewHolder, fswVar);
        } else {
            LogUtil.j("SectionActiveTrendListAdapter", "onBindViewHolder switch default");
        }
        HealthTextView healthTextView = sectionActiveTrendListViewHolder.f7336b;
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        healthTextView.setText(charSequenceB);
        HealthTextView healthTextView2 = sectionActiveTrendListViewHolder.f7337c;
        if (charSequenceB2 == null) {
            charSequenceB2 = "";
        }
        healthTextView2.setText(charSequenceB2);
        c(sectionActiveTrendListViewHolder, fswVar);
    }

    private void e(SectionActiveTrendListViewHolder sectionActiveTrendListViewHolder, fsw fswVar) {
        a(sectionActiveTrendListViewHolder, R.drawable.svg_icon_step_trend);
        sectionActiveTrendListViewHolder.n.setText(this.f7332c.getString(R.string.IDS_settings_steps));
        if (fswVar.e() == 0) {
            sectionActiveTrendListViewHolder.d.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_step_current_progressbar_color_zero));
        } else {
            sectionActiveTrendListViewHolder.d.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_step_current_progressbar_color));
        }
        if (fswVar.c() == 0) {
            sectionActiveTrendListViewHolder.f7335a.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_compared_progressbar_color_zero));
            sectionActiveTrendListViewHolder.f7335a.setAlpha(1.0f);
        } else {
            sectionActiveTrendListViewHolder.f7335a.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_step_current_progressbar_color));
            sectionActiveTrendListViewHolder.f7335a.setAlpha(0.2f);
        }
    }

    private void a(SectionActiveTrendListViewHolder sectionActiveTrendListViewHolder, fsw fswVar) {
        a(sectionActiveTrendListViewHolder, R.drawable.svg_icon_intensity_trend);
        sectionActiveTrendListViewHolder.n.setText(this.f7332c.getString(R.string.IDS_active_workout));
        if (fswVar.e() == 0) {
            sectionActiveTrendListViewHolder.d.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_strength_current_progressbar_color_zero));
        } else {
            sectionActiveTrendListViewHolder.d.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_strength_current_progressbar_color));
        }
        if (fswVar.c() == 0) {
            sectionActiveTrendListViewHolder.f7335a.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_compared_progressbar_color_zero));
            sectionActiveTrendListViewHolder.f7335a.setAlpha(1.0f);
        } else {
            sectionActiveTrendListViewHolder.f7335a.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_strength_current_progressbar_color));
            sectionActiveTrendListViewHolder.f7335a.setAlpha(0.2f);
        }
    }

    private void d(SectionActiveTrendListViewHolder sectionActiveTrendListViewHolder, fsw fswVar) {
        a(sectionActiveTrendListViewHolder, R.drawable.svg_icon_hour_trend);
        sectionActiveTrendListViewHolder.n.setText(this.f7332c.getString(R.string.IDS_three_circle_card_activity_hours));
        if (fswVar.e() == 0) {
            sectionActiveTrendListViewHolder.d.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_stand_current_progressbar_color_zero));
        } else {
            sectionActiveTrendListViewHolder.d.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_stand_current_progressbar_color));
        }
        if (fswVar.c() == 0) {
            sectionActiveTrendListViewHolder.f7335a.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_compared_progressbar_color_zero));
            sectionActiveTrendListViewHolder.f7335a.setAlpha(1.0f);
        } else {
            sectionActiveTrendListViewHolder.f7335a.setProgressDrawable(this.f7332c.getResources().getDrawable(R.drawable.active_record_stand_current_progressbar_color));
            sectionActiveTrendListViewHolder.f7335a.setAlpha(0.2f);
        }
    }

    private void a(SectionActiveTrendListViewHolder sectionActiveTrendListViewHolder, int i) {
        if (LanguageUtil.ba(this.f7332c)) {
            HealthImageView healthImageView = sectionActiveTrendListViewHolder.i;
            Context context = this.f7332c;
            healthImageView.setImageDrawable(qqz.e(context, ContextCompat.getDrawable(context, i)));
            return;
        }
        sectionActiveTrendListViewHolder.i.setImageResource(i);
    }

    private void c(SectionActiveTrendListViewHolder sectionActiveTrendListViewHolder, fsw fswVar) {
        if (LanguageUtil.ba(this.f7332c)) {
            sectionActiveTrendListViewHolder.h.setBackground(this.f7332c.getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            sectionActiveTrendListViewHolder.h.setBackground(this.f7332c.getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        if (LanguageUtil.f(this.f7332c)) {
            sectionActiveTrendListViewHolder.e.setMaxLines(2);
        } else {
            sectionActiveTrendListViewHolder.e.setMaxLines(3);
        }
        sectionActiveTrendListViewHolder.e.setText(fswVar.b());
        if (fswVar.e() != 0 || !fswVar.g()) {
            sectionActiveTrendListViewHolder.d.setMax(fswVar.c() == 0 ? 1 : fswVar.c());
            sectionActiveTrendListViewHolder.d.setProgress(fswVar.e() == 0 ? 0 : (int) Math.max(fswVar.e(), Math.round(sectionActiveTrendListViewHolder.f * ((double) sectionActiveTrendListViewHolder.d.getMax()))));
        } else {
            sectionActiveTrendListViewHolder.d.setMax(100);
            sectionActiveTrendListViewHolder.d.setProgress(6);
        }
        sectionActiveTrendListViewHolder.f7335a.setMax(fswVar.e() != 0 ? fswVar.e() : 1);
        sectionActiveTrendListViewHolder.f7335a.setProgress(fswVar.c() != 0 ? (int) Math.max(fswVar.c(), Math.round(sectionActiveTrendListViewHolder.f * ((double) sectionActiveTrendListViewHolder.f7335a.getMax()))) : 0);
    }

    public static class SectionActiveTrendListViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthProgressBar f7335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7337c;
        private HealthProgressBar d;
        private HealthTextView e;
        private double f;
        private int g;
        private HealthImageView h;
        private HealthImageView i;
        private ConstraintLayout j;
        private HealthTextView n;

        public SectionActiveTrendListViewHolder(View view) {
            super(view);
            this.g = -1;
            this.f = 0.0d;
            this.j = (ConstraintLayout) view.findViewById(R.id.cl_type_container);
            this.i = (HealthImageView) view.findViewById(R.id.hiv_type_icon);
            this.n = (HealthTextView) view.findViewById(R.id.htv_type_title);
            this.h = (HealthImageView) view.findViewById(R.id.hiv_type_right_arrow);
            this.e = (HealthTextView) view.findViewById(R.id.htv_compared_description);
            this.f7336b = (HealthTextView) view.findViewById(R.id.htv_current_value);
            this.d = (HealthProgressBar) view.findViewById(R.id.hpb_current_value_progress);
            this.f7337c = (HealthTextView) view.findViewById(R.id.htv_compared_value);
            this.f7335a = (HealthProgressBar) view.findViewById(R.id.hpb_compared_value_progress);
            this.d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.adapter.SectionActiveTrendListAdapter.SectionActiveTrendListViewHolder.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (SectionActiveTrendListViewHolder.this.g == -1) {
                        SectionActiveTrendListViewHolder sectionActiveTrendListViewHolder = SectionActiveTrendListViewHolder.this;
                        sectionActiveTrendListViewHolder.g = sectionActiveTrendListViewHolder.d.getWidth();
                        if (SectionActiveTrendListViewHolder.this.g != 0) {
                            SectionActiveTrendListViewHolder sectionActiveTrendListViewHolder2 = SectionActiveTrendListViewHolder.this;
                            sectionActiveTrendListViewHolder2.f = Math.round((((double) sectionActiveTrendListViewHolder2.d.getHeight()) * 100.0d) / ((double) SectionActiveTrendListViewHolder.this.g)) / 100.0d;
                            SectionActiveTrendListViewHolder.this.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                    }
                }
            });
        }
    }

    public void b(OnClickSectionListener onClickSectionListener) {
        this.e = onClickSectionListener;
    }
}
