package com.roomorama.caldroid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class CellView extends TextView {
    public static final int STATE_DISABLED = 2130970314;
    public static final int STATE_PREV_NEXT_MONTH = 2130970315;
    public static final int STATE_SELECTED = 2130970316;
    public static final int STATE_TODAY = 2130970317;
    private ArrayList<Integer> customStates;

    public CellView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.customStates = new ArrayList<>();
        init();
    }

    private void init() {
        if (this.customStates == null) {
            this.customStates = new ArrayList<>();
        }
    }

    public void addCustomState(int i14) {
        if (this.customStates.contains(Integer.valueOf(i14))) {
            return;
        }
        this.customStates.add(Integer.valueOf(i14));
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i14) {
        init();
        int size = this.customStates.size();
        if (size <= 0) {
            return super.onCreateDrawableState(i14);
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i14 + size);
        int[] iArr = new int[size];
        Iterator<Integer> it = this.customStates.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            iArr[i15] = it.next().intValue();
            i15++;
        }
        View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
        return iArrOnCreateDrawableState;
    }

    public void resetCustomStates() {
        this.customStates.clear();
    }

    public CellView(Context context) {
        super(context);
        this.customStates = new ArrayList<>();
    }

    public CellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.customStates = new ArrayList<>();
        init();
    }
}
