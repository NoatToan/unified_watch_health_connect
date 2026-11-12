package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzx;
import defpackage.iec;
import defpackage.ifp;
import defpackage.njy;
import defpackage.pds;
import defpackage.ped;
import defpackage.pqh;
import defpackage.qqf;
import defpackage.qre;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class CourseAdapter extends BaseRecyclerAdapter<IntAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9601c;
    private Drawable d;
    private final Context e;
    private Map<String, FitWorkout> f;
    private OnItemClickListener g;
    private final int h;
    private int i;
    private List<IntAction> j;
    private float k;

    public interface OnItemClickListener {
        void onCourseClick(boolean z, int i, int i2, IntAction intAction);

        void onCourseRecordClick(boolean z, int i, int i2, IntAction intAction);

        void onCourseStatusClick(boolean z, int i, int i2, IntAction intAction);

        void onLongClick(int i, int i2, IntAction intAction);
    }

    public CourseAdapter(boolean z) {
        super(new ArrayList(), R.layout.item_recycler_course);
        Context contextB = BaseApplication.b();
        this.e = contextB;
        this.j = new ArrayList();
        this.f = new ConcurrentHashMap();
        this.f9600b = z;
        this.h = (int) contextB.getResources().getDimension(R.dimen.defaultCornerRadiusM);
        if (pqh.b().getModelType() != -1) {
            this.d = ContextCompat.getDrawable(contextB, R.drawable.ic_plan_curriculum_ai);
        }
    }

    public void c(Map<String, FitWorkout> map, List<IntAction> list, boolean z, int i, float f) {
        this.f = map;
        this.j = list;
        this.i = i;
        this.k = f;
        this.f9601c = z;
        refreshDataChange(list);
    }

    public void e(boolean z) {
        this.f9599a = z;
        refreshDataChange(this.j);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.j)) {
            return 0;
        }
        return this.j.size();
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, IntAction intAction) {
        if (recyclerHolder == null || intAction == null || this.f == null) {
            ReleaseLogUtil.d("CourseAdapter", "convert holder ", recyclerHolder, " itemData ", intAction, " position ", Integer.valueOf(i), " mMap ", this.f);
            return;
        }
        String actionId = intAction.getActionId();
        if (TextUtils.isEmpty(actionId)) {
            ReleaseLogUtil.d("CourseAdapter", "convert actionId ", actionId);
            return;
        }
        FitWorkout fitWorkout = this.f.get(actionId);
        if (fitWorkout == null) {
            ReleaseLogUtil.d("CourseAdapter", "convert fitWorkout is null mMap ", this.f);
            return;
        }
        c(recyclerHolder, intAction, fitWorkout, i);
        e(recyclerHolder, intAction, fitWorkout, i);
        d(recyclerHolder, intAction, fitWorkout, i);
        b(recyclerHolder, intAction, fitWorkout, i);
        c(recyclerHolder, intAction, i);
        b(recyclerHolder.itemView, intAction, i, this.i);
        setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: hpb
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder2, int i2, Object obj) {
                this.f37009c.b(recyclerHolder2, i2, obj);
            }
        });
        int i2 = 0;
        if (this.f9600b) {
            recyclerHolder.e(R.id.divider, i >= getItemCount() + (-1) ? 8 : 0);
            return;
        }
        int i3 = R.id.divider;
        if (i >= getItemCount() - 1 && !this.f9599a) {
            i2 = 8;
        }
        recyclerHolder.e(i3, i2);
    }

    public /* synthetic */ void b(RecyclerHolder recyclerHolder, int i, Object obj) {
        OnItemClickListener onItemClickListener = this.g;
        if (onItemClickListener == null || !(obj instanceof IntAction)) {
            ReleaseLogUtil.d("CourseAdapter", "convert mOnItemClickListener ", onItemClickListener, " object ", obj);
        } else {
            onItemClickListener.onCourseClick(this.f9600b, this.i, i, (IntAction) obj);
        }
    }

    private void c(RecyclerHolder recyclerHolder, IntAction intAction, FitWorkout fitWorkout, int i) {
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.course_icon);
        if (imageView == null) {
            ReleaseLogUtil.d("CourseAdapter", "setIcon imageView is null");
            return;
        }
        String topicPreviewPicUrl = fitWorkout.getTopicPreviewPicUrl();
        if (TextUtils.isEmpty(topicPreviewPicUrl)) {
            ReleaseLogUtil.d("CourseAdapter", "setIcon url ", topicPreviewPicUrl);
            topicPreviewPicUrl = fitWorkout.getSupplierLogoUrl();
        }
        if (TextUtils.isEmpty(topicPreviewPicUrl)) {
            pds actionInfo = intAction.getActionInfo();
            ReleaseLogUtil.d("CourseAdapter", "setIcon url ", topicPreviewPicUrl, " courseInfoBean ", actionInfo);
            if (actionInfo != null) {
                topicPreviewPicUrl = actionInfo.c();
            }
        }
        qqf.b(imageView, topicPreviewPicUrl, this.h, 0, R.drawable.ic_collect_course);
        b(imageView, intAction, i, this.i);
    }

    private void e(RecyclerHolder recyclerHolder, IntAction intAction, FitWorkout fitWorkout, int i) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.course_name);
        if (healthTextView == null) {
            ReleaseLogUtil.d("CourseAdapter", "setName imageView is null");
            return;
        }
        String strAcquireName = fitWorkout.acquireName();
        if (TextUtils.isEmpty(strAcquireName)) {
            ReleaseLogUtil.d("CourseAdapter", "setName name ", strAcquireName);
            healthTextView.setVisibility(8);
            return;
        }
        healthTextView.setVisibility(0);
        healthTextView.setText(strAcquireName);
        b(healthTextView, intAction, i, this.i);
        int isAi = fitWorkout.getIsAi();
        ReleaseLogUtil.c("CourseAdapter", "setName ai ", Integer.valueOf(isAi));
        if (isAi != 1) {
            healthTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable drawable = this.d;
        if (drawable == null) {
            ReleaseLogUtil.d("CourseAdapter", "setName mAiDrawable is null");
            healthTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            drawable.setBounds(0, 0, (int) UnitUtil.d(((double) drawable.getIntrinsicWidth()) * 0.8d, 0), (int) UnitUtil.d(((double) this.d.getIntrinsicHeight()) * 0.8d, 0));
            healthTextView.setCompoundDrawables(null, null, this.d, null);
            healthTextView.setCompoundDrawablePadding(this.e.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_8dp));
        }
    }

    private void d(RecyclerHolder recyclerHolder, IntAction intAction, FitWorkout fitWorkout, int i) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.course_info);
        if (healthTextView == null) {
            ReleaseLogUtil.d("CourseAdapter", "setInfo textView is null");
            return;
        }
        float fAcquireDuration = fitWorkout.acquireDuration();
        float fB = ped.b(fitWorkout.acquireCalorie() * this.k);
        if (fAcquireDuration <= 0.0f || fB <= 0.0f) {
            healthTextView.setVisibility(8);
            ReleaseLogUtil.d("CourseAdapter", "setInfo duration ", Float.valueOf(fAcquireDuration), " kiloCalorie ", Float.valueOf(fB));
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(qre.a(R.string.IDS_ai_course_info, iec.c(fitWorkout.acquireDifficulty()), gzx.d(R.plurals.IDS_plugin_fitnessadvice_min, UnitUtil.e(UnitUtil.d(fAcquireDuration / 60.0f, 0)), ifp.d(fAcquireDuration)), gzx.d(R.plurals.sug_chart_kcals, UnitUtil.e(fB), ped.f(fB))));
            b(healthTextView, intAction, i, this.i);
        }
    }

    private void b(RecyclerHolder recyclerHolder, final IntAction intAction, FitWorkout fitWorkout, final int i) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.course_exercises);
        if (healthTextView == null) {
            ReleaseLogUtil.d("CourseAdapter", "setExercises textView is null");
            return;
        }
        if (intAction.getPunchFlag() == 1) {
            healthTextView.setAlpha(1.0f);
            healthTextView.setText(R.string.IDS_fit_view_records);
            healthTextView.setTextColor(ContextCompat.getColor(this.e, R.color.colorAccent));
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: hpi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37020c.d(i, intAction, view);
                }
            });
            return;
        }
        int iAcquireUsers = fitWorkout.acquireUsers();
        healthTextView.setText(gzx.d(com.huawei.health.basefitnessadvice.R.plurals.sug_fitness_personjoin, iAcquireUsers, UnitUtil.e(iAcquireUsers, 1, 0)));
        healthTextView.setTextColor(ContextCompat.getColor(this.e, R.color.textColorSecondary));
        healthTextView.setAlpha(0.8f);
        b(healthTextView, intAction, i, this.i);
    }

    public /* synthetic */ void d(int i, IntAction intAction, View view) {
        OnItemClickListener onItemClickListener = this.g;
        if (onItemClickListener == null) {
            ReleaseLogUtil.d("CourseAdapter", "setExercises mOnItemClickListener is null");
        } else {
            onItemClickListener.onCourseRecordClick(this.f9600b, this.i, i, intAction);
        }
    }

    private void c(RecyclerHolder recyclerHolder, IntAction intAction, int i) {
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.course_status);
        if (imageView == null) {
            ReleaseLogUtil.d("CourseAdapter", "setStatus textView is null");
            return;
        }
        if (this.i == 3) {
            if (this.f9601c) {
                a(imageView, intAction, i);
                return;
            } else {
                imageView.setImageResource(R.drawable.ic_vip_lock);
                b(imageView, intAction, i, this.i);
                return;
            }
        }
        if (intAction.getPunchFlag() == 1) {
            imageView.setImageResource(R.drawable.ic_plan_curriculum_completed_orange);
            b(imageView, intAction, i, this.i);
        } else if (this.i == 0) {
            imageView.setImageResource(R.drawable.ic_plan_curriculum_untrained_black);
            b(imageView, intAction, i, this.i);
        } else {
            a(imageView, intAction, i);
        }
    }

    private void a(ImageView imageView, final IntAction intAction, final int i) {
        if (this.f9600b) {
            imageView.setImageResource(R.drawable.ic_plan_rotate);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: hpd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37015c.b(i, intAction, view);
                }
            });
        } else {
            imageView.setImageResource(this.i == 3 ? R.drawable.ic_vip_lock : R.drawable.ic_plan_curriculum_untrained_black);
            b(imageView, intAction, i, this.i);
        }
    }

    public /* synthetic */ void b(int i, IntAction intAction, View view) {
        OnItemClickListener onItemClickListener = this.g;
        if (onItemClickListener == null) {
            ReleaseLogUtil.d("CourseAdapter", "setStatus mOnItemClickListener is null");
        } else {
            onItemClickListener.onCourseStatusClick(true, this.i, i, intAction);
        }
    }

    private void b(View view, final IntAction intAction, final int i, final int i2) {
        view.setOnClickListener(new View.OnClickListener() { // from class: hpc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f37010a.d(i2, i, intAction, view2);
            }
        });
        if (this.f9600b) {
            return;
        }
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: hph
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.e.b(i2, i, intAction, view2);
            }
        });
    }

    public /* synthetic */ void d(int i, int i2, IntAction intAction, View view) {
        OnItemClickListener onItemClickListener = this.g;
        if (onItemClickListener == null) {
            ReleaseLogUtil.d("CourseAdapter", "setOnCourseClick mOnItemClickListener is null");
        } else {
            onItemClickListener.onCourseClick(this.f9600b, i, i2, intAction);
        }
    }

    public /* synthetic */ boolean b(int i, int i2, IntAction intAction, View view) {
        OnItemClickListener onItemClickListener = this.g;
        if (onItemClickListener == null) {
            return true;
        }
        onItemClickListener.onLongClick(i, i2, intAction);
        return true;
    }

    public void a(OnItemClickListener onItemClickListener) {
        this.g = onItemClickListener;
    }
}
