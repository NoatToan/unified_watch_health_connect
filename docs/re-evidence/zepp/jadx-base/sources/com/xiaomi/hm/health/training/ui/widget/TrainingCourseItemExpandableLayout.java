package com.xiaomi.hm.health.training.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.activity.ActionDetailActivity;
import com.xiaomi.hm.health.training.ui.activity.AllActionsActivity;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingCourseItemExpandableLayout extends LinearLayout implements View.OnClickListener {
    private static final long p = 300;
    private int a;
    private TextView b;
    private TextView c;
    private RecyclerView d;
    private LinearLayout e;
    private LinearLayout f;
    private LinearLayout g;
    private TrainingCourseItem h;
    private TrainingDetail i;
    private View j;
    private View k;
    private boolean l;
    private int m;
    private boolean n;
    private OnItemOperatorListener o;

    public interface OnItemOperatorListener {
        void onItemClosed(int i);

        void onItemOpened(int i);
    }

    public class a implements Runnable {
        public final /* synthetic */ TrainingCourseItem a;

        public a(TrainingCourseItem trainingCourseItem) {
            this.a = trainingCourseItem;
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainingCourseItemExpandableLayout.this.k(this.a.trainingDetail);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.setLayoutParams(new LinearLayout.LayoutParams(this.a.getWidth(), ((Integer) valueAnimator.getAnimatedValue()).intValue()));
            this.a.requestLayout();
        }
    }

    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ int[] a;

        public c(int[] iArr) {
            this.a = iArr;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.a[1] != 0) {
                if (TrainingCourseItemExpandableLayout.this.o != null) {
                    TrainingCourseItemExpandableLayout.this.o.onItemOpened(TrainingCourseItemExpandableLayout.this.m);
                }
                TrainingCourseItemExpandableLayout.this.n = true;
            } else {
                if (TrainingCourseItemExpandableLayout.this.l) {
                    TrainingCourseItemExpandableLayout.this.j.setVisibility(8);
                }
                if (TrainingCourseItemExpandableLayout.this.o != null) {
                    TrainingCourseItemExpandableLayout.this.o.onItemClosed(TrainingCourseItemExpandableLayout.this.m);
                }
                TrainingCourseItemExpandableLayout.this.n = false;
            }
        }
    }

    public class d extends CommonRecycleAdapter<ActionContent> {
        public final /* synthetic */ TrainerInfo d;
        public final /* synthetic */ ArrayList e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, int i2, List list, TrainerInfo trainerInfo, ArrayList arrayList) {
            super(i, i2, list);
            this.d = trainerInfo;
            this.e = arrayList;
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bindViewHolder(CommonViewHolder commonViewHolder, ActionContent actionContent) {
            ActionVideo actionVideo;
            List<ActionVideo> list = actionContent.videos;
            if (list == null || list.size() <= 0) {
                return;
            }
            if (actionContent.videos.size() == 2) {
                actionVideo = actionContent.videos.get(0).gender.intValue() == this.d.gender ? actionContent.videos.get(0) : actionContent.videos.get(1);
            } else {
                actionVideo = actionContent.videos.get(0);
            }
            commonViewHolder.setImageByUrl(R.id.imv_background_item, actionVideo.thumbnail).setText(R.id.tx_video_name, actionVideo.name);
            if ("COUNT".equals(actionContent.type)) {
                commonViewHolder.setText(R.id.tx_repeat_times, TrainingCourseItemExpandableLayout.this.getContext().getResources().getQuantityString(R.plurals.with_unit_times, actionContent.repeatNumber.intValue(), actionContent.repeatNumber));
            } else {
                int longByGender = (int) (ParseJsonUtil.getLongByGender(actionContent.duration, this.d) / 1000);
                commonViewHolder.setText(R.id.tx_repeat_times, TrainingCourseItemExpandableLayout.this.getResources().getQuantityString(R.plurals.next_rest_time, longByGender, Integer.valueOf(longByGender)));
            }
            if (actionContent.nextRestTime.longValue() <= 0) {
                commonViewHolder.setVisibility(R.id.ll_rest, 8);
            } else {
                int iLongValue = (int) (actionContent.nextRestTime.longValue() / 1000);
                commonViewHolder.setText(R.id.tx_rest_time, TrainingCourseItemExpandableLayout.this.getResources().getQuantityString(R.plurals.next_rest_time, iLongValue, Integer.valueOf(iLongValue)));
            }
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onItemClick(ActionContent actionContent, int i) {
            Intent intent = new Intent(TrainingCourseItemExpandableLayout.this.getContext(), (Class<?>) ActionDetailActivity.class);
            intent.putExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT, this.e);
            intent.putExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT_POSITION, i);
            TrainingCourseItemExpandableLayout.this.getContext().startActivity(intent);
        }
    }

    public TrainingCourseItemExpandableLayout(Context context) {
        this(context, null, 0);
    }

    private void g() {
        if (this.h.trainingId.longValue() > 0) {
            j(this.g, 0, this.a);
            this.d.getAdapter();
            if (this.l) {
                this.j.setVisibility(0);
                this.k.setVisibility(8);
            }
        }
    }

    private void h() {
        this.b = (TextView) findViewById(R.id.tx_round_name);
        this.c = (TextView) findViewById(R.id.tx_course_name);
        this.d = (RecyclerView) findViewById(R.id.rcv_groups);
        this.e = (LinearLayout) findViewById(R.id.ll_all_actions);
        this.f = (LinearLayout) findViewById(R.id.ll_fixed);
        this.g = (LinearLayout) findViewById(R.id.ll_expandable);
        this.j = findViewById(R.id.group_divider);
        this.k = findViewById(R.id.child_divider);
        this.d.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        linearLayoutManager.setSmoothScrollbarEnabled(false);
        this.d.setLayoutManager(linearLayoutManager);
        this.d.addItemDecoration(new LinearLayoutDecoration(getContext(), 0, R.dimen.divider_size_dp4, R.color.white100));
    }

    private void i() {
        LayoutInflater.from(getContext()).inflate(R.layout.item_training_round, (ViewGroup) this, true);
        h();
    }

    private ValueAnimator j(View view, int... iArr) {
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(300L);
        duration.addUpdateListener(new b(view));
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.start();
        duration.addListener(new c(iArr));
        return duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(TrainingDetail trainingDetail) {
        if (this.h.trainingId.longValue() > 0 && trainingDetail != null) {
            l(trainingDetail);
        }
        this.a = this.g.getHeight();
        this.g.setLayoutParams(new LinearLayout.LayoutParams(this.g.getWidth(), 0));
        this.f.setOnClickListener(this);
        this.e.setOnClickListener(this);
        TrainingCourseItem trainingCourseItem = this.h;
        if (trainingCourseItem != null && trainingCourseItem.dayIndex.intValue() == 0) {
            g();
        } else if (this.l) {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
        }
    }

    private void l(TrainingDetail trainingDetail) {
        List<ActionContent> list = trainingDetail.content;
        if (list == null || list.size() <= 0 || trainingDetail.trainingId.longValue() != this.h.trainingId.longValue()) {
            return;
        }
        this.i = trainingDetail;
        setItemValues((ArrayList) trainingDetail.content);
    }

    private void setItemValues(ArrayList<ActionContent> arrayList) {
        this.d.setAdapter(new d(R.layout.item_video_small, R.id.rl_item, arrayList, TrainerInfo.get(), arrayList));
    }

    public void collapseItem() {
        this.n = false;
        j(this.g, this.a, 0);
    }

    public boolean isOpened() {
        return this.n;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.ll_fixed) {
            if (id == R.id.ll_all_actions) {
                Context context = getContext();
                TrainingDetail trainingDetail = this.i;
                AllActionsActivity.startActivity(context, (ArrayList) trainingDetail.content, trainingDetail);
                return;
            }
            return;
        }
        if (this.g.getHeight() == 0) {
            g();
        } else if (this.g.getHeight() == this.a) {
            collapseItem();
        }
    }

    public void setOnItemOperatorListener(OnItemOperatorListener onItemOperatorListener) {
        this.o = onItemOperatorListener;
    }

    public void setPosition(int i) {
        this.m = i;
    }

    public void setTrainingCourseItems(TrainingCourseItem trainingCourseItem, boolean z) {
        this.l = z;
        this.h = trainingCourseItem;
        if (trainingCourseItem.trainingId.longValue() > 0) {
            this.b.setText(getContext().getString(R.string.training_course_item_day, Integer.valueOf(trainingCourseItem.dayIndex.intValue() + 1)));
            this.c.setVisibility(0);
            this.c.setText(trainingCourseItem.name);
        } else {
            this.b.setText(getContext().getString(R.string.training_course_item_day, Integer.valueOf(trainingCourseItem.dayIndex.intValue() + 1)));
            this.c.setVisibility(0);
            this.c.setText(R.string.training_rest_day);
        }
        this.g.post(new a(trainingCourseItem));
    }

    public TrainingCourseItemExpandableLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrainingCourseItemExpandableLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i();
    }
}
