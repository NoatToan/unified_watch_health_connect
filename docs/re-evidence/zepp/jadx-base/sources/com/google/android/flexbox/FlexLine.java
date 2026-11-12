package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FlexLine {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public List<Integer> n = new ArrayList();

    public void a(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - flexItem.getMarginLeft()) - i);
        this.b = Math.min(this.b, (view.getTop() - flexItem.getMarginTop()) - i2);
        this.c = Math.max(this.c, view.getRight() + flexItem.getMarginRight() + i3);
        this.d = Math.max(this.d, view.getBottom() + flexItem.getMarginBottom() + i4);
    }

    public int getCrossSize() {
        return this.g;
    }

    public int getFirstIndex() {
        return this.o;
    }

    public int getItemCount() {
        return this.h;
    }

    public int getItemCountNotGone() {
        return this.h - this.i;
    }

    public int getMainSize() {
        return this.e;
    }

    public float getTotalFlexGrow() {
        return this.j;
    }

    public float getTotalFlexShrink() {
        return this.k;
    }
}
