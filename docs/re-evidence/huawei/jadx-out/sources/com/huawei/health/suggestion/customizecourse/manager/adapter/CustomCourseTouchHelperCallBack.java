package com.huawei.health.suggestion.customizecourse.manager.adapter;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class CustomCourseTouchHelperCallBack extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CustomCourseCanDragAdapter f8912c;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return false;
    }

    public CustomCourseTouchHelperCallBack(CustomCourseCanDragAdapter customCourseCanDragAdapter) {
        this.f8912c = customCourseCanDragAdapter;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("Suggestion_CustomCourseTouchHelperCallBack", "onSwiped");
        if (this.f8912c == null) {
            LogUtil.j("Suggestion_CustomCourseTouchHelperCallBack", "mAdapter is null");
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof CustomCourseDragViewHolder) || !((CustomCourseDragViewHolder) viewHolder).isIsCanDrag()) {
            LogUtil.a("Suggestion_CustomCourseTouchHelperCallBack", "getMovementFlags, viewHolder isIsCanDrag = ", Boolean.valueOf(((CustomCourseDragViewHolder) viewHolder).isIsCanDrag()));
            return 0;
        }
        return makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder == null || viewHolder2 == null) {
            LogUtil.j("Suggestion_CustomCourseTouchHelperCallBack", "onMove, source or target is null");
            return false;
        }
        LogUtil.a("Suggestion_CustomCourseTouchHelperCallBack", "onMove, source = ", Integer.valueOf(viewHolder.getAdapterPosition()), ", target = ", Integer.valueOf(viewHolder2.getAdapterPosition()));
        if (this.f8912c == null) {
            LogUtil.j("Suggestion_CustomCourseTouchHelperCallBack", "onMove, mAdapter is null");
            return false;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (!(viewHolder instanceof CustomCourseDragViewHolder)) {
            LogUtil.j("Suggestion_CustomCourseTouchHelperCallBack", "source is not CustomCourseMoveViewHolder");
            return true;
        }
        CustomCourseDragViewHolder customCourseDragViewHolder = (CustomCourseDragViewHolder) viewHolder;
        LogUtil.a("Suggestion_CustomCourseTouchHelperCallBack", "onMove, source isIsCanDrag = ", Boolean.valueOf(customCourseDragViewHolder.isIsCanDrag()));
        if (!customCourseDragViewHolder.isIsCanDrag()) {
            return false;
        }
        this.f8912c.itemMove(adapterPosition, adapterPosition2, customCourseDragViewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder == null) {
            LogUtil.j("Suggestion_CustomCourseTouchHelperCallBack", "onSelectedChanged, viewHolder is null");
            return;
        }
        LogUtil.a("Suggestion_CustomCourseTouchHelperCallBack", "onSelectedChanged");
        if (i != 0) {
            this.f8912c.startVibrator(viewHolder);
            d(viewHolder, 1.0f, 0.85f, 280L, true);
        }
        super.onSelectedChanged(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            LogUtil.j("Suggestion_CustomCourseTouchHelperCallBack", "clearView, viewHolder is null");
            return;
        }
        LogUtil.a("Suggestion_CustomCourseTouchHelperCallBack", "clearView");
        super.clearView(recyclerView, viewHolder);
        d(viewHolder, 0.85f, 1.0f, 280L, false);
    }

    private void d(final RecyclerView.ViewHolder viewHolder, float f, float f2, long j, final boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.addUpdateListener(new c(viewHolder));
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.huawei.health.suggestion.customizecourse.manager.adapter.CustomCourseTouchHelperCallBack.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (viewHolder instanceof CustomCourseDragViewHolder) {
                    CustomCourseTouchHelperCallBack.this.f8912c.setDragState((CustomCourseDragViewHolder) viewHolder, z);
                }
            }
        });
        valueAnimatorOfFloat.start();
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.ViewHolder f8915b;

        c(RecyclerView.ViewHolder viewHolder) {
            this.f8915b = viewHolder;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                LogUtil.j("Suggestion_CustomCourseTouchHelperCallBack", "onAnimationUpdate, animation is null");
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f8915b.itemView.setScaleX(fFloatValue);
            this.f8915b.itemView.setScaleY(fFloatValue);
        }
    }
}
