package com.loopeer.cardstack;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes18.dex */
public class UpDownStackAnimatorAdapter extends AnimatorAdapter {
    public UpDownStackAnimatorAdapter(CardStackView cardStackView) {
        super(cardStackView);
    }

    @Override // com.loopeer.cardstack.AnimatorAdapter
    public void itemCollapseAnimatorSet(CardStackView.ViewHolder viewHolder) {
        int paddingTop = this.mCardStackView.getPaddingTop();
        for (int i = 0; i < this.mCardStackView.getChildCount(); i++) {
            View childAt = this.mCardStackView.getChildAt(i);
            childAt.clearAnimation();
            CardStackView.LayoutParams layoutParams = (CardStackView.LayoutParams) childAt.getLayoutParams();
            int overlapGaps = paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            if (i != 0) {
                overlapGaps -= this.mCardStackView.getOverlapGaps() * 2;
            }
            Property property = View.Y;
            float[] fArr = new float[2];
            fArr[0] = childAt.getY();
            fArr[1] = ((float) (overlapGaps - this.mCardStackView.getScrollDelegate().getViewScrollY())) < this.mCardStackView.getChildAt(0).getY() ? this.mCardStackView.getChildAt(0).getY() : overlapGaps - this.mCardStackView.getScrollDelegate().getViewScrollY();
            this.mSet.play(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
            paddingTop = overlapGaps + layoutParams.mHeaderHeight;
        }
    }

    @Override // com.loopeer.cardstack.AnimatorAdapter
    public void itemExpandAnimatorSet(CardStackView.ViewHolder viewHolder, int i) {
        View view = viewHolder.itemView;
        view.clearAnimation();
        this.mSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.Y, view.getY(), this.mCardStackView.getChildAt(0).getY()));
        int i2 = 0;
        for (int i3 = 0; i3 < this.mCardStackView.getChildCount(); i3++) {
            if (i3 != this.mCardStackView.getSelectPosition()) {
                View childAt = this.mCardStackView.getChildAt(i3);
                childAt.clearAnimation();
                if (i3 > this.mCardStackView.getSelectPosition() && i2 < this.mCardStackView.getNumBottomShow()) {
                    this.mSet.play(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.Y, childAt.getY(), this.mCardStackView.getShowHeight() - getCollapseStartTop(i2)));
                    i2++;
                } else if (i3 < this.mCardStackView.getSelectPosition()) {
                    this.mSet.play(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.Y, childAt.getY(), this.mCardStackView.getChildAt(0).getY()));
                } else {
                    this.mSet.play(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.Y, childAt.getY(), this.mCardStackView.getShowHeight()));
                }
            }
        }
    }
}
