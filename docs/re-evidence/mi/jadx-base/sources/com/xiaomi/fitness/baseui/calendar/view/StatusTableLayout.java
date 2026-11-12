package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes7.dex */
public class StatusTableLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11628b;
    public a c;

    public interface a {
        void a(int i);

        void b(int i);
    }

    public StatusTableLayout(Context context) {
        super(context);
        this.f11627a = -1;
        this.f11628b = -1;
    }

    public final /* synthetic */ void b(StatusTextView statusTextView, int i, View view) {
        if (statusTextView.f11629a != 0) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.b(i);
                return;
            }
            return;
        }
        statusTextView.setSelectType(1);
        ((StatusTextView) getChildAt(this.f11627a)).setSelectType(0);
        this.f11627a = i;
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.a(i);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof StatusTextView) {
                StatusTextView statusTextView = (StatusTextView) childAt;
                int i6 = this.f11628b;
                if (i6 != -1) {
                    statusTextView.f11630b = i6;
                }
                int i7 = this.f11627a;
                if (i7 == -1) {
                    if (statusTextView.f11629a == 1) {
                        this.f11627a = i5;
                    }
                } else if (i7 == i5) {
                    statusTextView.setSelectType(1);
                } else {
                    statusTextView.setSelectType(0);
                }
            }
        }
        for (final int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2 instanceof StatusTextView) {
                final StatusTextView statusTextView2 = (StatusTextView) childAt2;
                if (i8 != this.f11627a) {
                    statusTextView2.setSelectType(0);
                }
                statusTextView2.setOnClickListener(new View.OnClickListener() { // from class: kdo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f23759a.b(statusTextView2, i8, view);
                    }
                });
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCurrentTab(int i) {
        this.f11627a = i;
        requestLayout();
    }

    public void setOnTabSelectListener(a aVar) {
        this.c = aVar;
    }

    public void setSelectColor(int i) {
        this.f11628b = i;
        invalidate();
    }

    public StatusTableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11627a = -1;
        this.f11628b = -1;
    }

    public StatusTableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11627a = -1;
        this.f11628b = -1;
    }
}
