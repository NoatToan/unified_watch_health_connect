package com.huawei.health.suggestion.ui.fitness.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.LoadMoreViewHolder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.gzx;
import defpackage.hjg;
import defpackage.hjs;
import defpackage.ibn;
import defpackage.iec;
import defpackage.ien;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pea;
import defpackage.ped;
import defpackage.qqf;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitSearchRecyAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9260a;
    private int e = 0;
    private int d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FitWorkout> f9262c = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f9261b = hjg.a();

    public FitSearchRecyAdapter(Context context) {
        this.f9260a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f9260a);
        if (i == 0) {
            return new a(layoutInflaterFrom.inflate(R.layout.sug_fitness_list_item, viewGroup, false));
        }
        return new LoadMoreViewHolder(layoutInflaterFrom.inflate(R.layout.sug_his_loading_more, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) != 0 || i < 0 || i >= this.f9262c.size() || !(viewHolder instanceof a)) {
            return;
        }
        a aVar = (a) viewHolder;
        aVar.d(this.f9262c.get(i), this.f9261b);
        if (i == 0 || (qrs.af(this.f9260a) && i == 1)) {
            aVar.i.setVisibility(0);
        } else {
            aVar.i.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f9262c.size() + this.e;
    }

    public int e() {
        return this.f9262c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == this.f9262c.size() ? 1 : 0;
    }

    public void c() {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        this.f9262c.clear();
        this.e = 0;
        notifyItemRangeRemoved(0, itemCount);
    }

    public void d(List<FitWorkout> list) {
        int size = this.f9262c.size();
        if (njy.b(list)) {
            this.f9262c.addAll(ibn.c(list));
            if (this.d == 1) {
                this.f9262c = ibn.c(this.f9262c);
                hjs.b().b(this.f9262c);
                notifyDataSetChanged();
                return;
            }
        }
        int itemCount = getItemCount();
        this.e = 0;
        int i = itemCount - size;
        if (i > 0) {
            notifyItemRangeChanged(size, i);
        }
    }

    public void a(int i) {
        this.d = i;
    }

    public void a() {
        this.e = 1;
        notifyItemRangeChanged(this.f9262c.size(), 1);
    }

    public void d() {
        d(null);
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f9263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f9264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f9265c;
        HealthTextView d;
        ImageView e;
        HealthTextView f;
        HealthTextView g;
        HealthTextView h;
        private View i;
        private ImageView j;

        a(View view) {
            super(view);
            this.f9263a = view;
            this.f = (HealthTextView) view.findViewById(R.id.tv_plan_peoples_num);
            this.g = (HealthTextView) view.findViewById(R.id.tv_fe_name);
            this.f9265c = (HealthTextView) view.findViewById(R.id.tv_custom);
            this.d = (HealthTextView) view.findViewById(R.id.tv_level);
            this.h = (HealthTextView) view.findViewById(R.id.tv_parameter_num);
            this.f9264b = (HealthTextView) view.findViewById(R.id.tv_Kcal);
            this.e = (ImageView) view.findViewById(R.id.sug_img_item_pic);
            this.j = (ImageView) view.findViewById(R.id.new_imageView);
            this.i = view.findViewById(R.id.sug_view_space);
        }

        public void d(final FitWorkout fitWorkout, float f) {
            if (fitWorkout == null) {
                LogUtil.j("Suggestion_FitSearchRecyAdapter", "set workout == null");
                return;
            }
            if (!Utils.o()) {
                this.g.setMaxLines(1);
                this.g.setSingleLine(true);
                this.g.setEllipsize(TextUtils.TruncateAt.END);
            }
            if (fitWorkout.getCourseDefineType() == 1) {
                e(fitWorkout);
            } else {
                this.f9265c.setVisibility(8);
                this.h.setVisibility(0);
                this.g.setTextColor(ContextCompat.getColor(btx.c(), R.color.textColorPrimaryInverse));
                this.g.setTypeface(qrr.g());
                float fB = ped.b(fitWorkout.acquireCalorie() * f);
                String strD = gzx.d(R.plurals.sug_chart_kcals, (int) fB, ped.f(fB));
                if (fitWorkout.isLongExplainVideoCourse()) {
                    b(8, 0);
                } else {
                    b(0, this.h.getContext().getResources().getDimensionPixelSize(R.dimen.hw_group_16));
                }
                this.f9264b.setText(strD);
                d(fitWorkout);
                this.d.setText(iec.c(fitWorkout.acquireDifficulty()));
                HealthTextView healthTextView = this.h;
                healthTextView.setText(gzx.c(healthTextView.getContext(), R.string.sug_fitness_min, ped.m(fitWorkout.acquireDuration())));
                qqf.b(this.e, fitWorkout.acquirePicture(), qqf.d, 0, R.drawable.blank_1008);
            }
            if (qrs.ac()) {
                this.f.setVisibility(8);
            }
            this.g.setText(StringUtils.c((Object) fitWorkout.acquireName()));
            this.f9263a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.adapter.FitSearchRecyAdapter.a.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.a(fitWorkout);
                }
            });
            c(fitWorkout);
        }

        private void b(int i, int i2) {
            this.d.setVisibility(i);
            this.f9264b.setVisibility(i);
            if (this.h.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.h.getLayoutParams();
                layoutParams.setMarginStart(i2);
                layoutParams.baselineToBaseline = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(FitWorkout fitWorkout) {
            if (qrs.r()) {
                LogUtil.j("Suggestion_FitSearchRecyAdapter", "mItemView click too fast.");
                return;
            }
            pcd pcdVar = new pcd(fitWorkout.acquireId());
            if (fitWorkout.getCourseDefineType() == 1) {
                pcdVar.i(1);
            }
            pcdVar.a("9");
            pea.a(btx.c(), fitWorkout, pcdVar);
        }

        private void c(FitWorkout fitWorkout) {
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            layoutParams.height = -2;
            b(fitWorkout);
            List<PriceTagBean> listAcquirePriceTagBeanList = fitWorkout.acquirePriceTagBeanList();
            if (fitWorkout.getCornerImgDisplay() == 1) {
                String strE = pea.e(listAcquirePriceTagBeanList);
                if (!TextUtils.isEmpty(strE)) {
                    layoutParams.height = (int) this.j.getResources().getDimension(R.dimen.health_common_21dp);
                    this.j.setVisibility(0);
                    qqf.b(strE, this.j, 0.0f, qqf.d, 0.0f, 0.0f);
                }
            }
            this.j.setLayoutParams(layoutParams);
        }

        private void d(FitWorkout fitWorkout) {
            if (Utils.j()) {
                this.f.setText(gzx.c(BaseApplication.getContext(), "\\d+.\\d+|\\d+", gzx.d(R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)), R.style.sug_reco_train_num, R.style.sug_reco_train_desc));
            } else {
                this.f.setVisibility(8);
            }
        }

        private void e(FitWorkout fitWorkout) {
            int i;
            this.f9264b.setVisibility(8);
            this.d.setVisibility(8);
            this.h.setVisibility(8);
            this.f9265c.setVisibility(0);
            this.g.setTextColor(ContextCompat.getColor(btx.c(), R.color.textColorPrimary));
            this.g.setTypeface(qrr.e());
            this.f.setTextColor(ContextCompat.getColor(btx.c(), R.color.textColorTertiary));
            this.f.setTextSize(btx.c().getResources().getDimensionPixelSize(R.dimen.textSizeBody2) / qrs.j(btx.c()));
            this.f.setText(hjs.a(fitWorkout.getPublishDate()));
            long jI = CommonUtils.i(fitWorkout.acquireId()) % 3;
            if (jI == 0) {
                i = R.drawable.pic_custom_yellow;
            } else if (jI == 1) {
                i = R.drawable.pic_custom_red;
            } else {
                i = R.drawable.pic_custom_blue;
            }
            qqf.a(this.e, i, qqf.d, 0, R.drawable.blank_1008);
        }

        private void b(FitWorkout fitWorkout) {
            if (fitWorkout.getCourseDefineType() == 1) {
                this.j.setVisibility(8);
            } else if (LanguageUtil.o(this.itemView.getContext()) || LanguageUtil.q(this.itemView.getContext())) {
                ien.a(fitWorkout, this.j);
            } else {
                this.j.setVisibility(8);
            }
        }
    }
}
