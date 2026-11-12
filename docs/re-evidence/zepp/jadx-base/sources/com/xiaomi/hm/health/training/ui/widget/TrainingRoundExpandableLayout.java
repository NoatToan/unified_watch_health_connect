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
import com.huami.lib.view.ViewUtils;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.activity.ActionDetailActivity;
import com.xiaomi.hm.health.training.ui.activity.AllActionsActivity;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.training.ui.widget.TrainingRoundExpandableLayout;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingRoundExpandableLayout extends LinearLayout implements View.OnClickListener {
    private static final long o = 300;
    private static final int p = 2;
    private int a;
    private TextView b;
    private RecyclerView c;
    private LinearLayout d;
    private LinearLayout e;
    private LinearLayout f;
    private TrainingDetail g;
    private ArrayList<ActionContent> h;
    private View i;
    private View j;
    private boolean k;
    private int l;
    private boolean m;
    private OnItemOperatorListener n;

    public interface OnItemOperatorListener {
        void onActionItemClick(ActionContent actionContent);

        void onAllActionClick();

        void onItemClosed(int i);

        void onItemOpened(int i);
    }

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int[] a;

        public a(int[] iArr) {
            this.a = iArr;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.a[1] != 0) {
                if (TrainingRoundExpandableLayout.this.n != null) {
                    TrainingRoundExpandableLayout.this.n.onItemOpened(TrainingRoundExpandableLayout.this.l);
                }
                TrainingRoundExpandableLayout.this.m = true;
            } else {
                if (TrainingRoundExpandableLayout.this.k) {
                    TrainingRoundExpandableLayout.this.i.setVisibility(8);
                }
                if (TrainingRoundExpandableLayout.this.n != null) {
                    TrainingRoundExpandableLayout.this.n.onItemClosed(TrainingRoundExpandableLayout.this.l);
                }
                TrainingRoundExpandableLayout.this.m = false;
            }
        }
    }

    public class b extends CommonRecycleAdapter<ActionContent> {
        public final /* synthetic */ TrainerInfo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, List list, TrainerInfo trainerInfo) {
            super(i, i2, list);
            this.d = trainerInfo;
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
                commonViewHolder.setText(R.id.tx_repeat_times, TrainingRoundExpandableLayout.this.getContext().getResources().getQuantityString(R.plurals.with_unit_times, actionContent.repeatNumber.intValue(), actionContent.repeatNumber));
            } else {
                int longByGender = (int) (ParseJsonUtil.getLongByGender(actionContent.duration, this.d) / 1000);
                commonViewHolder.setText(R.id.tx_repeat_times, TrainingRoundExpandableLayout.this.getResources().getQuantityString(R.plurals.next_rest_time, longByGender, Integer.valueOf(longByGender)));
            }
            if (actionContent.nextRestTime.longValue() <= 0) {
                commonViewHolder.setVisibility(R.id.ll_rest, 8);
            } else {
                int iLongValue = (int) (actionContent.nextRestTime.longValue() / 1000);
                commonViewHolder.setText(R.id.tx_rest_time, TrainingRoundExpandableLayout.this.getResources().getQuantityString(R.plurals.next_rest_time, iLongValue, Integer.valueOf(iLongValue)));
            }
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onItemClick(ActionContent actionContent, int i) {
            if (TrainingRoundExpandableLayout.this.n != null) {
                TrainingRoundExpandableLayout.this.n.onActionItemClick(actionContent);
            }
            Intent intent = new Intent(TrainingRoundExpandableLayout.this.getContext(), (Class<?>) ActionDetailActivity.class);
            intent.putExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT, TrainingRoundExpandableLayout.this.h);
            intent.putExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT_POSITION, i);
            TrainingRoundExpandableLayout.this.getContext().startActivity(intent);
        }
    }

    public TrainingRoundExpandableLayout(Context context) {
        this(context, null, 0);
    }

    private void i() {
        m(this.f, 0, this.a);
        if (this.c.getAdapter() == null) {
            setItemValues(this.h);
        }
        if (this.k) {
            this.i.setVisibility(0);
        }
    }

    private void j() {
        this.b = (TextView) findViewById(R.id.tx_round_name);
        this.c = (RecyclerView) findViewById(R.id.rcv_groups);
        this.d = (LinearLayout) findViewById(R.id.ll_all_actions);
        this.e = (LinearLayout) findViewById(R.id.ll_fixed);
        this.f = (LinearLayout) findViewById(R.id.ll_expandable);
        this.i = findViewById(R.id.group_divider);
        this.j = findViewById(R.id.child_divider);
        this.c.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        linearLayoutManager.setSmoothScrollbarEnabled(false);
        this.c.setLayoutManager(linearLayoutManager);
        this.c.addItemDecoration(new LinearLayoutDecoration(getContext(), 0, R.dimen.divider_size_dp4, R.color.white100));
        this.f.post(new Runnable() { // from class: tx7
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(View view, ValueAnimator valueAnimator) {
        view.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), ((Integer) valueAnimator.getAnimatedValue()).intValue()));
        view.requestLayout();
    }

    private void l() {
        LayoutInflater.from(getContext()).inflate(R.layout.item_training_round, (ViewGroup) this, true);
        j();
    }

    private ValueAnimator m(final View view, int... iArr) {
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(300L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sx7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TrainingRoundExpandableLayout.k(view, valueAnimator);
            }
        });
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.start();
        duration.addListener(new a(iArr));
        return duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.a = this.f.getHeight();
        this.f.setLayoutParams(new LinearLayout.LayoutParams(this.f.getWidth(), 0));
        this.e.setOnClickListener(this);
        this.d.setOnClickListener(this);
        ArrayList<ActionContent> arrayList = this.h;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        if (this.h.get(0).round.intValue() == 1) {
            i();
        }
        if (this.k) {
            this.i.setVisibility(8);
            this.j.setVisibility(8);
        }
    }

    private void setItemValues(List<ActionContent> list) {
        this.c.setAdapter(new b(R.layout.item_video_small, R.id.rl_item, list, TrainerInfo.get()));
    }

    public void collapseItem() {
        this.m = false;
        m(this.f, this.a, 0);
    }

    public List<ActionContent> getActionContents() {
        return this.h;
    }

    public boolean isOpened() {
        return this.m;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ll_fixed) {
            if (this.f.getHeight() == this.a) {
                collapseItem();
                return;
            } else {
                if (this.f.getHeight() == 0) {
                    i();
                    return;
                }
                return;
            }
        }
        if (id == R.id.ll_all_actions) {
            OnItemOperatorListener onItemOperatorListener = this.n;
            if (onItemOperatorListener != null) {
                onItemOperatorListener.onAllActionClick();
            }
            AllActionsActivity.startActivity(getContext(), this.h, this.g);
        }
    }

    public void setOnItemOperatorListener(OnItemOperatorListener onItemOperatorListener) {
        this.n = onItemOperatorListener;
    }

    public void setPosition(int i) {
        this.l = i;
    }

    public void setTrainingDetailContent(TrainingDetail trainingDetail, List<ActionContent> list, boolean z) {
        this.g = trainingDetail;
        this.k = z;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.b.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getContext().getString(R.string.round_name, list.get(0).round), getContext(), Font.KM, Integer.valueOf((int) ViewUtils.sp2px(getContext(), 18.0f)), null));
        this.h = (ArrayList) list;
    }

    public TrainingRoundExpandableLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrainingRoundExpandableLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l();
    }
}
