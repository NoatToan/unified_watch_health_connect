package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseDetailsActivity;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback;
import defpackage.btx;
import defpackage.gzx;
import defpackage.idy;
import defpackage.iec;
import defpackage.iov;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pea;
import defpackage.ped;
import defpackage.qqf;
import defpackage.qrk;
import defpackage.qrs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class FitSeriesCourseViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Rect f9449a = new Rect(16, 24, a.C, 75);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f9450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f9451c;
    private ImageView d;
    private ImageView e;
    private HealthTextView f;
    private RelativeLayout g;
    private HealthButton h;
    private RelativeLayout i;
    private Context j;
    private int k;
    private HealthTextView l;
    private RelativeLayout m;
    private HealthTextView n;
    private FrameLayout o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;

    public FitSeriesCourseViewHolder(View view) {
        super(view);
        this.o = (FrameLayout) view.findViewById(R.id.series_course_layout);
        this.d = (ImageView) view.findViewById(R.id.sug_img_item_picture);
        this.h = (HealthButton) view.findViewById(R.id.bt_more);
        this.f = (HealthTextView) view.findViewById(R.id.tv_title);
        this.n = (HealthTextView) view.findViewById(R.id.tv_subtitle);
        this.f9450b = (ImageView) view.findViewById(R.id.iv_background_img_01);
        this.s = (HealthTextView) view.findViewById(R.id.train_name_01);
        this.l = (HealthTextView) view.findViewById(R.id.tv_difficulty_01);
        this.t = (HealthTextView) view.findViewById(R.id.tv_train_time_01);
        this.e = (ImageView) view.findViewById(R.id.iv_background_img_02);
        this.p = (HealthTextView) view.findViewById(R.id.train_name_02);
        this.r = (HealthTextView) view.findViewById(R.id.tv_difficulty_02);
        this.q = (HealthTextView) view.findViewById(R.id.tv_train_time_02);
        this.m = (RelativeLayout) view.findViewById(R.id.title_rl);
        this.i = (RelativeLayout) view.findViewById(R.id.course_rl_01);
        this.g = (RelativeLayout) view.findViewById(R.id.course_rl_02);
        this.j = view.getContext();
    }

    public void b(final Topic topic) {
        d(topic);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitSeriesCourseViewHolder.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.j("FitSeriesCourseViewHolder", "FitnessSeriesCourseViewFragmentHolder is fast click");
                    return;
                }
                Intent intent = new Intent(FitSeriesCourseViewHolder.this.j, (Class<?>) FitnessSeriesCourseDetailsActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("intent_key_topicid", topic.acquireId());
                intent.putExtra("intent_key_topicname", topic.acquireName());
                intent.putExtra("intent_key_description", topic.getDescription());
                iov.d(FitSeriesCourseViewHolder.this.j, intent);
                FitSeriesCourseViewHolder.this.b(topic.acquireId());
            }
        });
        c(topic);
        if (njy.e(topic.acquireWorkoutList())) {
            LogUtil.j("FitSeriesCourseViewHolder", "topic.acquireWorkoutList() is null ");
            return;
        }
        if (topic.acquireWorkoutList().size() >= 2) {
            FitWorkout fitWorkout = topic.acquireWorkoutList().get(0);
            e(this.f9450b, this.s, this.l, this.t, fitWorkout);
            b(fitWorkout, this.i, topic.acquireName());
            FitWorkout fitWorkout2 = topic.acquireWorkoutList().get(1);
            e(this.e, this.p, this.r, this.q, fitWorkout2);
            b(fitWorkout2, this.g, topic.acquireName());
        }
    }

    private void c(final Topic topic) {
        String topicBackImgUrl = topic.getTopicBackImgUrl();
        if (!TextUtils.isEmpty(topicBackImgUrl)) {
            qqf.a(topicBackImgUrl, this.d, com.huawei.health.basefitnessadvice.R.drawable.blank_1008, new AsyncLoadDrawableCallback() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitSeriesCourseViewHolder.4
                @Override // com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback
                public void getDrawable(Drawable drawable) {
                    FitSeriesCourseViewHolder.this.b(topic, drawable);
                }
            });
            return;
        }
        qqf.a(com.huawei.health.basefitnessadvice.R.drawable.blank_1008, this.d, qqf.d);
        this.f.setTextColor(this.itemView.getResources().getColor(com.huawei.ui.commonui.R.color.textColorPrimary));
        this.n.setTextColor(this.itemView.getResources().getColor(com.huawei.ui.commonui.R.color.textColorSecondary));
        this.f.setText(TextUtils.isEmpty(topic.acquireName()) ? "" : topic.acquireName());
        this.n.setText(TextUtils.isEmpty(topic.getSubtitle()) ? "" : topic.getSubtitle());
    }

    private void e(ImageView imageView, HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3, FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            LogUtil.j("FitSeriesCourseViewHolder", "setSeriesCourseDate(),fitWorkout is null");
            return;
        }
        healthTextView.setText(TextUtils.isEmpty(fitWorkout.acquireName()) ? "" : fitWorkout.acquireName());
        String topicPreviewPicUrl = fitWorkout.getTopicPreviewPicUrl();
        if (!TextUtils.isEmpty(topicPreviewPicUrl)) {
            qqf.b(imageView, topicPreviewPicUrl, qqf.e, 0, com.huawei.health.basefitnessadvice.R.drawable.blank_1008);
        } else {
            qqf.a(com.huawei.health.basefitnessadvice.R.drawable.blank_1008, imageView, qqf.e);
        }
        healthTextView2.setText(iec.c(fitWorkout.acquireDifficulty()));
        healthTextView3.setText(gzx.c(btx.c(), com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ped.m(fitWorkout.acquireDuration())));
    }

    private void b(final FitWorkout fitWorkout, RelativeLayout relativeLayout, final String str) {
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitSeriesCourseViewHolder.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                pcd pcdVar = new pcd(fitWorkout.acquireId());
                pcdVar.a("8");
                pcdVar.f(str);
                pea.a(FitSeriesCourseViewHolder.this.j, fitWorkout, pcdVar);
            }
        });
    }

    private void d(Topic topic) {
        if (topic != null) {
            this.o.setVisibility(0);
        } else {
            this.o.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("date", qrk.b());
        map.put("topicId", Integer.valueOf(i));
        idy.b("1130032", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Topic topic, final Drawable drawable) {
        HandlerExecutor.b(new Runnable() { // from class: hne
            @Override // java.lang.Runnable
            public final void run() {
                this.f36954a.c(drawable, topic);
            }
        });
    }

    public /* synthetic */ void c(Drawable drawable, Topic topic) {
        Bitmap bitmapA = qqf.a(drawable);
        this.f9451c = bitmapA;
        this.k = qqf.b(qqf.b(bitmapA, f9449a));
        int i = com.huawei.ui.commonui.R.color.textColorPrimary;
        int i2 = com.huawei.ui.commonui.R.color.textColorSecondary;
        if (this.k == -16777216) {
            i = com.huawei.ui.commonui.R.color.textColorPrimaryInverse;
            i2 = com.huawei.ui.commonui.R.color.textColorPrimaryInverse;
        }
        this.f.setTextColor(this.itemView.getResources().getColor(i));
        this.f.setText(TextUtils.isEmpty(topic.acquireName()) ? "" : topic.acquireName());
        this.n.setTextColor(this.itemView.getResources().getColor(i2));
        this.n.setText(TextUtils.isEmpty(topic.getSubtitle()) ? "" : topic.getSubtitle());
    }
}
