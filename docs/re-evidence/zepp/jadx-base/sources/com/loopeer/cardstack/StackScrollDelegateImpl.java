package com.loopeer.cardstack;

import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public class StackScrollDelegateImpl implements ScrollDelegate {
    private CardStackView a;
    private int b;
    private int c;

    public StackScrollDelegateImpl(CardStackView cardStackView) {
        this.a = cardStackView;
    }

    private static int a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private void b() {
        for (int i = 0; i < this.a.getChildCount(); i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt.getTop() - this.b < this.a.getChildAt(0).getY()) {
                childAt.setTranslationY(this.a.getChildAt(0).getY() - childAt.getTop());
            } else if (childAt.getTop() - this.b > childAt.getTop()) {
                childAt.setTranslationY(0.0f);
            } else {
                childAt.setTranslationY(-this.b);
            }
        }
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public int getViewScrollX() {
        return this.c;
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public int getViewScrollY() {
        return this.b;
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public void scrollViewTo(int i, int i2) {
        int iA = a(i, (this.a.getWidth() - this.a.getPaddingRight()) - this.a.getPaddingLeft(), this.a.getWidth());
        this.b = a(i2, this.a.getShowHeight(), this.a.getTotalLength());
        this.c = iA;
        b();
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public void setViewScrollX(int i) {
        scrollViewTo(i, this.b);
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public void setViewScrollY(int i) {
        scrollViewTo(this.c, i);
    }
}
