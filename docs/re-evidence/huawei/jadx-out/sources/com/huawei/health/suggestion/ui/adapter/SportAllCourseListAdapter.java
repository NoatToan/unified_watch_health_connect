package com.huawei.health.suggestion.ui.adapter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.gzx;
import defpackage.hjs;
import defpackage.idy;
import defpackage.iec;
import defpackage.iei;
import defpackage.ien;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pea;
import defpackage.ped;
import defpackage.pqh;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.CommonUtils;
import health.compact.a.HarmonyBuild;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class SportAllCourseListAdapter extends PolymericDataAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f9035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f9036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9037c;
    private ArrayList<String> d;
    private boolean e;
    private String h;
    private HealthCheckBox i;
    private String j;

    public SportAllCourseListAdapter(List<Workout> list, RecyclerView recyclerView, int i, boolean z, ArrayList<String> arrayList, String str, String str2, boolean z2) {
        super(list, recyclerView, i);
        this.d = new ArrayList<>(10);
        this.f9036b = new ArrayList<>(10);
        this.e = z;
        this.f9035a = arrayList;
        this.h = str;
        this.j = str2;
        this.f9037c = z2;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter
    public void setRecycleHolder(RecyclerHolder recyclerHolder, final Workout workout, final int i) {
        if (workout == null || !(workout instanceof FitWorkout)) {
            LogUtil.j("Sug_SportAllCourseListAdapter", "convert, workout is null.");
            return;
        }
        LogUtil.a("Sug_SportAllCourseListAdapter", "convert, holder.itemView.getWidth() = ", Integer.valueOf(recyclerHolder.itemView.getWidth()));
        final FitWorkout fitWorkout = (FitWorkout) workout;
        if (fitWorkout.getCourseDefineType() == 1) {
            a(recyclerHolder, fitWorkout, i);
            return;
        }
        b(recyclerHolder, fitWorkout);
        final HealthCheckBox healthCheckBox = (HealthCheckBox) recyclerHolder.d(R.id.plan_add_course_checkbox);
        healthCheckBox.setChecked(this.d.contains(fitWorkout.acquireId()));
        healthCheckBox.setClickable(false);
        if (this.e || this.f9037c) {
            healthCheckBox.setVisibility(0);
            if (healthCheckBox.isChecked() && this.f9037c) {
                this.i = healthCheckBox;
            }
            recyclerHolder.d(R.id.recycle_item).setOnClickListener(new View.OnClickListener() { // from class: hem
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36688b.c(fitWorkout, healthCheckBox, view);
                }
            });
            return;
        }
        healthCheckBox.setVisibility(8);
        recyclerHolder.d(R.id.recycle_item).setOnClickListener(new View.OnClickListener() { // from class: heo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(workout, i, view);
            }
        });
    }

    public /* synthetic */ void c(FitWorkout fitWorkout, HealthCheckBox healthCheckBox, View view) {
        b(fitWorkout, healthCheckBox);
    }

    public /* synthetic */ void b(Workout workout, int i, View view) {
        onItemClick(workout, i);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter
    public void setCardBackground(ImageView imageView, Workout workout, int i) {
        if (!(workout instanceof FitWorkout)) {
            LogUtil.e("Sug_SportAllCourseListAdapter", "workout type is not FitWorkout.");
            return;
        }
        FitWorkout fitWorkout = (FitWorkout) workout;
        String str = imageView.getTag() instanceof String ? (String) imageView.getTag() : null;
        Map<String, Object> mapD = iei.d(fitWorkout, String.valueOf(this.mNavigationId), this.h, i + 1);
        if (fitWorkout.getCourseDefineType() == 1) {
            int iC = c(CommonUtils.i(fitWorkout.acquireId()));
            if (b(str, Integer.toString(iC))) {
                imageView.setTag(Integer.toString(iC));
                qqf.e(ContextCompat.getDrawable(this.mContext, iC), imageView, qqf.d);
                iei.a(mapD, "1130068");
                return;
            }
            return;
        }
        if (b(str, fitWorkout.acquirePicture())) {
            imageView.setTag(fitWorkout.acquirePicture());
            qqf.c(fitWorkout.acquirePicture(), imageView, qqf.d);
            iei.a(mapD, "1130068");
        }
    }

    private boolean b(String str, String str2) {
        return TextUtils.isEmpty(str) || !str.equals(str2);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter
    public void setNewPic(ImageView imageView, Workout workout) {
        if (!(workout instanceof FitWorkout)) {
            LogUtil.e("Sug_SportAllCourseListAdapter", "workout type is not FitWorkout.");
            return;
        }
        FitWorkout fitWorkout = (FitWorkout) workout;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = -2;
        d(imageView, fitWorkout);
        List<PriceTagBean> listAcquirePriceTagBeanList = fitWorkout.acquirePriceTagBeanList();
        if (fitWorkout.getCornerImgDisplay() == 1) {
            String strE = pea.e(listAcquirePriceTagBeanList);
            if (!TextUtils.isEmpty(strE)) {
                layoutParams.height = (int) imageView.getResources().getDimension(R.dimen.health_common_21dp);
                imageView.setVisibility(0);
                qqf.b(strE, imageView, 0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        imageView.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter
    public void onItemClick(Workout workout, int i) {
        if (qrs.r() || !(workout instanceof FitWorkout)) {
            LogUtil.j("Sug_SportAllCourseListAdapter", "mItemView click too fast.");
            return;
        }
        FitWorkout fitWorkout = (FitWorkout) workout;
        int i2 = this.mNavigationId;
        int i3 = i + 1;
        iei.d(iei.d(fitWorkout, String.valueOf(i2), this.h, i3));
        pcd pcdVar = new pcd(workout.acquireId());
        pcdVar.i(fitWorkout.getCourseDefineType());
        pcdVar.a("0");
        pcdVar.h(String.valueOf(idy.d(this.h)));
        pcdVar.o(String.valueOf(this.mNavigationId));
        pcdVar.k(String.valueOf(i3));
        pea.a(btx.c(), fitWorkout, pcdVar);
    }

    public ArrayList<String> e() {
        return this.d;
    }

    public ArrayList<String> a() {
        return this.f9036b;
    }

    private void d(ImageView imageView, FitWorkout fitWorkout) {
        if (fitWorkout.getCourseDefineType() == 1) {
            imageView.setVisibility(8);
        } else if (!LanguageUtil.o(this.mContext) && !LanguageUtil.q(this.mContext)) {
            imageView.setVisibility(8);
        } else {
            ien.a(fitWorkout, imageView);
        }
    }

    private void b(RecyclerHolder recyclerHolder, FitWorkout fitWorkout) {
        recyclerHolder.e(R.id.tv_custom, 8);
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_level);
        HealthTextView healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.tv_parameter_num);
        HealthTextView healthTextView3 = (HealthTextView) recyclerHolder.d(R.id.tv_Kcal);
        healthTextView2.setVisibility(0);
        healthTextView2.setText(gzx.d(R.plurals.IDS_single_circle_intensity_target_desc, fitWorkout.acquireDuration(), ped.m(fitWorkout.acquireDuration())));
        if (fitWorkout.isLongExplainVideoCourse()) {
            setLevelAndParameterNumAndCalorieState(healthTextView, healthTextView3, healthTextView2, 8, 0);
        } else {
            healthTextView.setText(iec.c(fitWorkout.acquireDifficulty()));
            float fB = ped.b(fitWorkout.acquireCalorie() * this.mWeight);
            healthTextView3.setText(gzx.d(R.plurals.sug_chart_kcals, (int) fB, ped.f(fB)));
            setLevelAndParameterNumAndCalorieState(healthTextView, healthTextView3, healthTextView2, 0, healthTextView2.getContext().getResources().getDimensionPixelSize(R.dimen.hw_group_16));
        }
        HealthTextView healthTextView4 = (HealthTextView) recyclerHolder.d(R.id.tv_fe_name);
        healthTextView4.setTextColor(getTextColor(R.color.textColorPrimaryInverse));
        healthTextView4.setTypeface(qrr.g());
        c(fitWorkout, recyclerHolder);
        TextView textView = (TextView) recyclerHolder.d(R.id.tv_plan_peoples_num);
        textView.setTextColor(getTextColor(R.color.textColorPrimaryInverse));
        textView.setTextSize(getTextSize(R.dimen.textSizeChart1));
        textView.setText(gzx.c(BaseApplication.getContext(), "\\d+.\\d+|\\d+", gzx.d(com.huawei.health.basefitnessadvice.R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)), com.huawei.health.basefitnessadvice.R.style.sug_reco_train_num, com.huawei.health.basefitnessadvice.R.style.sug_reco_train_desc));
    }

    private void c(FitWorkout fitWorkout, RecyclerHolder recyclerHolder) {
        int modelType = pqh.b().getModelType();
        ReleaseLogUtil.d("Sug_SportAllCourseListAdapter", "getIsAi:", Integer.valueOf(fitWorkout.getIsAi()), "modelType: ", Integer.valueOf(modelType), "harmony：", Boolean.valueOf(HarmonyBuild.e));
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.course_tag);
        if (fitWorkout.getIsAi() == 1 && modelType != -1) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    private void a(RecyclerHolder recyclerHolder, final FitWorkout fitWorkout, final int i) {
        recyclerHolder.e(R.id.tv_custom, 0);
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_level);
        HealthTextView healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.tv_Kcal);
        HealthTextView healthTextView3 = (HealthTextView) recyclerHolder.d(R.id.tv_parameter_num);
        healthTextView3.setVisibility(8);
        setLevelAndParameterNumAndCalorieState(healthTextView, healthTextView2, healthTextView3, 8, 0);
        HealthTextView healthTextView4 = (HealthTextView) recyclerHolder.d(R.id.tv_fe_name);
        healthTextView4.setTextColor(getTextColor(R.color.textColorPrimary));
        healthTextView4.setTypeface(qrr.e());
        TextView textView = (TextView) recyclerHolder.d(R.id.tv_plan_peoples_num);
        textView.setVisibility(0);
        textView.setTextColor(getTextColor(R.color.textColorTertiary));
        textView.setTextSize(getTextSize(!qrs.d(1.3f) ? R.dimen.textSizeBody3 : R.dimen.textSizeCaption1));
        textView.setText(hjs.a(fitWorkout.getPublishDate()));
        if (qrs.y()) {
            textView.setVisibility(8);
        }
        recyclerHolder.d(R.id.recycle_item).setOnClickListener(new View.OnClickListener() { // from class: hen
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(fitWorkout, i, view);
            }
        });
    }

    public /* synthetic */ void d(FitWorkout fitWorkout, int i, View view) {
        onItemClick(fitWorkout, i);
    }

    private int c(long j) {
        long j2 = j % 3;
        if (j2 == 0) {
            return R.drawable.pic_custom_yellow;
        }
        if (j2 == 1) {
            return R.drawable.pic_custom_red;
        }
        return R.drawable.pic_custom_blue;
    }

    private void b(FitWorkout fitWorkout, HealthCheckBox healthCheckBox) {
        if (this.e) {
            c(fitWorkout, healthCheckBox);
        } else if (this.f9037c) {
            d(fitWorkout, healthCheckBox);
        }
    }

    private void d(FitWorkout fitWorkout, HealthCheckBox healthCheckBox) {
        LogUtil.a("Sug_SportAllCourseListAdapter", "replace workout ", fitWorkout.acquireId());
        if (healthCheckBox.isChecked()) {
            this.d.clear();
            this.f9036b.clear();
            healthCheckBox.setChecked(false);
            this.i = null;
            c();
            return;
        }
        if (this.i != null) {
            this.d.clear();
            this.f9036b.clear();
            this.i.setChecked(false);
        }
        this.d.add(fitWorkout.acquireId());
        this.f9036b.add(fitWorkout.acquireName());
        healthCheckBox.setChecked(true);
        this.i = healthCheckBox;
        c();
    }

    private void c(FitWorkout fitWorkout, HealthCheckBox healthCheckBox) {
        LogUtil.a("Sug_SportAllCourseListAdapter", "set workout ", fitWorkout.acquireId(), " ", Boolean.valueOf(healthCheckBox.isChecked()));
        if (healthCheckBox.isChecked()) {
            if (this.d.contains(fitWorkout.acquireId())) {
                this.d.remove(fitWorkout.acquireId());
                this.f9036b.remove(fitWorkout.acquireName());
            }
            healthCheckBox.setChecked(false);
            c();
            return;
        }
        if (!this.d.contains(fitWorkout.acquireId())) {
            ArrayList<String> arrayList = this.f9035a;
            if (arrayList != null && arrayList.contains(fitWorkout.acquireId())) {
                qpx.e(this.mContext, R.string.IDS_plan_has_add_course);
                return;
            } else {
                this.d.add(fitWorkout.acquireId());
                this.f9036b.add(fitWorkout.acquireName());
            }
        }
        healthCheckBox.setChecked(true);
        c();
    }

    private void c() {
        if (njy.b(this.d)) {
            ObserverManagerUtil.e("PLAN_CONFIRM_VISIBILITY", true);
        } else {
            ObserverManagerUtil.e("PLAN_CONFIRM_VISIBILITY", false);
        }
    }
}
