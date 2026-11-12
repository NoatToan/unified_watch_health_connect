package com.loopeer.cardstack;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AnimatorAdapter {
    public static final int a = 400;
    public CardStackView mCardStackView;
    public AnimatorSet mSet;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ CardStackView.ViewHolder a;
        public final /* synthetic */ CardStackView.ViewHolder b;

        public a(CardStackView.ViewHolder viewHolder, CardStackView.ViewHolder viewHolder2) {
            this.a = viewHolder;
            this.b = viewHolder2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            CardStackView.ViewHolder viewHolder = this.a;
            if (viewHolder != null) {
                viewHolder.onAnimationStateChange(2, false);
            }
            this.b.onAnimationStateChange(2, true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.b.onItemExpand(true);
            CardStackView.ViewHolder viewHolder = this.a;
            if (viewHolder != null) {
                viewHolder.onAnimationStateChange(1, false);
            }
            this.b.onAnimationStateChange(1, true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AnimatorAdapter.this.mCardStackView.setScrollEnable(false);
            CardStackView.ViewHolder viewHolder = this.a;
            if (viewHolder != null) {
                viewHolder.onAnimationStateChange(0, false);
            }
            this.b.onAnimationStateChange(0, true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ CardStackView.ViewHolder a;

        public b(CardStackView.ViewHolder viewHolder) {
            this.a = viewHolder;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.a.onAnimationStateChange(2, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AnimatorAdapter.this.mCardStackView.setSelectPosition(-1);
            this.a.onAnimationStateChange(1, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.a.onItemExpand(false);
            AnimatorAdapter.this.mCardStackView.setScrollEnable(true);
            this.a.onAnimationStateChange(0, false);
        }
    }

    public AnimatorAdapter(CardStackView cardStackView) {
        this.mCardStackView = cardStackView;
    }

    private void a(CardStackView.ViewHolder viewHolder) {
        itemCollapseAnimatorSet(viewHolder);
        this.mSet.addListener(new b(viewHolder));
        this.mSet.start();
    }

    private void b(CardStackView.ViewHolder viewHolder, int i) {
        CardStackView.ViewHolder viewHolderM = this.mCardStackView.m(this.mCardStackView.getSelectPosition());
        if (viewHolderM != null) {
            viewHolderM.onItemExpand(false);
        }
        this.mCardStackView.setSelectPosition(i);
        itemExpandAnimatorSet(viewHolder, i);
        this.mSet.addListener(new a(viewHolderM, viewHolder));
        this.mSet.start();
    }

    public void collapseItem(CardStackView.ViewHolder viewHolder) {
        AnimatorSet animatorSet = this.mSet;
        if (animatorSet == null || !animatorSet.isRunning()) {
            initAnimatorSet();
            a(viewHolder);
            if (this.mCardStackView.getChildCount() == 1) {
                this.mSet.end();
            }
        }
    }

    public void expandItem(CardStackView.ViewHolder viewHolder, int i) {
        AnimatorSet animatorSet = this.mSet;
        if (animatorSet == null || !animatorSet.isRunning()) {
            initAnimatorSet();
            b(viewHolder, i);
            if (this.mCardStackView.getChildCount() == 1) {
                this.mSet.end();
            }
        }
    }

    public int getCollapseStartTop(int i) {
        return this.mCardStackView.getOverlapGapsCollapse() * ((this.mCardStackView.getNumBottomShow() - i) - (this.mCardStackView.getNumBottomShow() - (this.mCardStackView.getChildCount() - this.mCardStackView.getSelectPosition() > this.mCardStackView.getNumBottomShow() ? this.mCardStackView.getNumBottomShow() : (this.mCardStackView.getChildCount() - this.mCardStackView.getSelectPosition()) - 1)));
    }

    public int getDuration() {
        return this.mCardStackView.getDuration();
    }

    public void initAnimatorSet() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.mSet = animatorSet;
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mSet.setDuration(getDuration());
    }

    public void itemClick(CardStackView.ViewHolder viewHolder, int i) {
        AnimatorSet animatorSet = this.mSet;
        if (animatorSet == null || !animatorSet.isRunning()) {
            initAnimatorSet();
            if (this.mCardStackView.getSelectPosition() == i) {
                a(viewHolder);
            } else {
                b(viewHolder, i);
            }
            if (this.mCardStackView.getChildCount() == 1) {
                this.mSet.end();
            }
        }
    }

    public abstract void itemCollapseAnimatorSet(CardStackView.ViewHolder viewHolder);

    public abstract void itemExpandAnimatorSet(CardStackView.ViewHolder viewHolder, int i);
}
