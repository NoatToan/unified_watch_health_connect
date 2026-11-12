package com.huawei.ui.commonui.flowlayout;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder;
import com.huawei.ui.commonui.flowlayout.textviewbuilder.SportTagTextViewBuilder;
import defpackage.qle;
import defpackage.qlf;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthFlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23524c;
    private int d;
    private qlf e;
    private SparseArray<ArrayList<qle>> f;
    private AnimatorSet g;
    private int h;
    private ViewGroup.LayoutParams i;
    private List<qle> j;
    private ITagTextViewBuilder k;
    private int m;
    private int n;

    public interface OnGetTagListener {
        void onGetTag(int i, qle qleVar);
    }

    public List<qle> getTagInfos() {
        return this.j;
    }

    public SparseArray<ArrayList<qle>> getRowSparseArray() {
        return this.f;
    }

    public HealthFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23522a = false;
        this.f23524c = context;
        this.m = qrs.d(context, 8.0f);
        this.n = qrs.d(context, 8.0f);
        this.h = qrs.d(context, 28.0f);
        this.d = qrs.d(context, 24.0f);
        if (qrs.v()) {
            this.i = new LinearLayout.LayoutParams(-2, -2);
            this.h = qrs.d(context, 50.0f);
        } else {
            this.i = new LinearLayout.LayoutParams(-2, this.h);
        }
        this.k = new SportTagTextViewBuilder(getContext());
    }

    public HealthFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HealthFlowLayout(Context context) {
        this(context, null);
    }

    public void setTextViewSpacing(int i) {
        this.m = i;
    }

    public void setVerticalSpacing(int i) {
        this.n = i;
    }

    public void setTagHeight(int i) {
        this.h = i;
    }

    public void setChildViewPadding(int i) {
        this.d = i;
    }

    public void setTagLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.i = layoutParams;
    }

    public void setTextViewBuilder(ITagTextViewBuilder iTagTextViewBuilder) {
        this.k = iTagTextViewBuilder;
    }

    private void d(List<qle> list) {
        this.j = list;
        for (int i = 0; i < list.size(); i++) {
            d(list, i);
        }
        if (getChildCount() > list.size()) {
            removeViews(list.size(), getChildCount() - list.size());
        }
    }

    private void d(List<qle> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return;
        }
        addView(this.k.build(list.get(i)), this.i);
    }

    void e(View view, final int i) {
        if (this.e == null || ((qle) getChildAt(i).getTag()).j() != 0) {
            return;
        }
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.huawei.ui.commonui.flowlayout.HealthFlowLayout.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                if (HealthFlowLayout.this.e == null) {
                    return true;
                }
                HealthFlowLayout.this.e.a(i);
                return true;
            }
        });
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (!this.f23523b && this.j != null) {
            final int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
            this.f = a(this.j, size, new OnGetTagListener() { // from class: com.huawei.ui.commonui.flowlayout.HealthFlowLayout.3
                @Override // com.huawei.ui.commonui.flowlayout.HealthFlowLayout.OnGetTagListener
                public void onGetTag(int i3, qle qleVar) {
                    HealthFlowLayout.this.getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(qleVar.g().width(), 1073741824), iMakeMeasureSpec);
                }
            });
        }
        SparseArray<ArrayList<qle>> sparseArray = this.f;
        if (sparseArray != null && sparseArray.size() > 0) {
            SparseArray<ArrayList<qle>> sparseArray2 = this.f;
            ArrayList<qle> arrayList = sparseArray2.get(sparseArray2.size() - 1);
            if (arrayList != null && arrayList.size() > 0) {
                setMeasuredDimension(size, arrayList.get(arrayList.size() - 1).g().bottom);
                return;
            } else {
                setMeasuredDimension(size, 0);
                return;
            }
        }
        setMeasuredDimension(size, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f23523b || this.j == null) {
            return;
        }
        for (int i5 = 0; i5 < this.j.size(); i5++) {
            qle qleVar = getTagInfos().get(i5);
            getChildAt(i5).layout(qleVar.g().left, qleVar.g().top, qleVar.g().right, qleVar.g().bottom);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        qlf qlfVar = this.e;
        if (qlfVar != null) {
            qlfVar.e(canvas);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qlf qlfVar = this.e;
        if (qlfVar != null) {
            qlfVar.e(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        qlf qlfVar = this.e;
        if (qlfVar != null) {
            return qlfVar.b(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qlf qlfVar = this.e;
        if (qlfVar != null) {
            qlfVar.b(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void a() {
        this.e = new qlf(this);
    }

    private void c() {
        this.f = a(this.j, getMeasuredWidth(), null);
    }

    public void c(qle qleVar) {
        if (this.f23522a) {
            return;
        }
        qleVar.e(qleVar.i());
        c();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.j.size(); i++) {
            Rect rect = new Rect();
            qle qleVar2 = (qle) getChildAt(i).getTag();
            getChildAt(i).getHitRect(rect);
            if (getChildAt(i).isShown()) {
                if (rect.left != qleVar2.g().left) {
                    arrayList.add(b(qleVar2.g().left, "x", getChildAt(i), 250L));
                }
                if (rect.top != qleVar2.g().top) {
                    arrayList.add(b(qleVar2.g().top, "y", getChildAt(i), 250L));
                }
            } else {
                arrayList.add(b(qleVar2.g().left, "x", getChildAt(i), 0L));
                arrayList.add(b(qleVar2.g().top, "y", getChildAt(i), 0L));
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.g = animatorSet;
        animatorSet.playTogether(arrayList);
        e(qleVar);
    }

    private ObjectAnimator b(int i, String str, View view, long j) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, str, i);
        objectAnimatorOfFloat.setDuration(j);
        return objectAnimatorOfFloat;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        qlf qlfVar = this.e;
        if (qlfVar != null && qlfVar.a()) {
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void d(ArrayList<qle> arrayList, boolean z) {
        if (this.j != null) {
            removeAllViews();
            this.j.clear();
        }
        this.f23523b = false;
        d(arrayList);
        requestLayout();
        e(z);
    }

    private void e(boolean z) {
        a();
        if (z && this.j != null) {
            for (int i = 0; i < this.j.size(); i++) {
                e(getChildAt(i), i);
            }
            requestLayout();
        }
    }

    private SparseArray<ArrayList<qle>> a(List<qle> list, int i, OnGetTagListener onGetTagListener) {
        SparseArray<ArrayList<qle>> sparseArray = new SparseArray<>();
        int i2 = LanguageUtil.ba(this.f23524c) ? i : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            qle qleVar = list.get(i4);
            int iTextViewWidth = (int) (this.k.textViewWidth(qleVar) + this.d);
            if (LanguageUtil.ba(this.f23524c)) {
                i2 = i2 == i ? i2 - iTextViewWidth : i2 - (this.m + iTextViewWidth);
                if (i2 < 0) {
                    i3++;
                    i2 = i - iTextViewWidth;
                }
                Rect rectG = qleVar.g();
                int i5 = this.h;
                int i6 = (this.n + i5) * i3;
                rectG.set(i2, i6, iTextViewWidth + i2, i5 + i6);
            } else {
                i2 = i2 == 0 ? i2 + iTextViewWidth : i2 + this.m + iTextViewWidth;
                if (i2 > i) {
                    i3++;
                    i2 = iTextViewWidth;
                }
                Rect rectG2 = qleVar.g();
                int i7 = this.h;
                int i8 = (this.n + i7) * i3;
                rectG2.set(i2 - iTextViewWidth, i8, i2, i7 + i8);
            }
            ArrayList<qle> arrayList = sparseArray.get(i3);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                sparseArray.put(i3, arrayList);
            }
            arrayList.add(list.get(i4));
            if (onGetTagListener != null) {
                onGetTagListener.onGetTag(i4, qleVar);
            }
        }
        return sparseArray;
    }

    private void e(final qle qleVar) {
        this.g.addListener(new Animator.AnimatorListener() { // from class: com.huawei.ui.commonui.flowlayout.HealthFlowLayout.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                HealthFlowLayout.this.f23522a = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HealthFlowLayout.this.f23522a = false;
                if (HealthFlowLayout.this.e.c() != null && (qleVar != HealthFlowLayout.this.e.c() || qleVar.h() != HealthFlowLayout.this.e.c().i())) {
                    HealthFlowLayout healthFlowLayout = HealthFlowLayout.this;
                    healthFlowLayout.c(healthFlowLayout.e.c());
                } else if (((qle) HealthFlowLayout.this.j.get(HealthFlowLayout.this.j.size() - 1)).g().bottom != HealthFlowLayout.this.getMeasuredHeight()) {
                    HealthFlowLayout.this.f23523b = true;
                    HealthFlowLayout.this.requestLayout();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                HealthFlowLayout.this.f23522a = false;
            }
        });
        this.g.start();
    }
}
