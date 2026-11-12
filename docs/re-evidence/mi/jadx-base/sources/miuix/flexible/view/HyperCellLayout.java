package miuix.flexible.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.i5j;
import miuix.flexible.template.IHyperCellTemplate;
import miuix.flexible.template.SimpleMarkTemplate;
import miuix.flexible.template.TemplateFactory;

/* JADX INFO: loaded from: classes3.dex */
public class HyperCellLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IHyperCellTemplate f26628a;

    public interface a {
    }

    public HyperCellLayout(Context context) {
        super(context);
        f(context, null);
    }

    public IHyperCellTemplate a(Context context, String str, AttributeSet attributeSet) {
        return TemplateFactory.get(context, str);
    }

    public <T extends View> T b(int i) {
        if (i == -1) {
            return null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T t = (T) getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = t.getLayoutParams();
            if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).c() == i) {
                return t;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public final void f(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i5j.G);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i5j.K) {
                    this.f26628a = a(context, typedArrayObtainStyledAttributes.getString(index), attributeSet);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f26628a == null) {
            this.f26628a = new SimpleMarkTemplate();
        }
        this.f26628a.init(this, context, attributeSet);
    }

    public int getLevel() {
        return this.f26628a.getLevel();
    }

    public IHyperCellTemplate getTemplate() {
        return this.f26628a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26628a.onAttachedToWindow(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f26628a.onConfigurationChanged(this, configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26628a.onDetachedFromWindow(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f26628a.onFinishInflate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f26628a.onLayout(this, z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int[] iArrOnMeasure = this.f26628a.onMeasure(this, i, i2);
        setMeasuredDimension(iArrOnMeasure[0], iArrOnMeasure[1]);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f26628a.onViewAdded(this, view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f26628a.onViewRemoved(this, view);
    }

    public void setLevelCallback(a aVar) {
        this.f26628a.setLevelCallback(aVar);
    }

    public HyperCellLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(context, attributeSet);
    }

    public HyperCellLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f(context, attributeSet);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f26630b;
        public float c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public float i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f26631k;
        public int l;
        public int m;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.d = 0;
            this.j = false;
            this.f26631k = 7;
            this.l = 8388611;
            this.m = 0;
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i5j.M);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == i5j.S) {
                        int i2 = typedArrayObtainStyledAttributes.getInt(index, 1);
                        this.f26629a = i2;
                        if (i2 < 1) {
                            throw new IllegalArgumentException("Layout Parameter 'mark' can not be smaller than 1");
                        }
                    } else if (index == i5j.V) {
                        this.f26630b = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    } else if (index == i5j.R) {
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    } else if (index == i5j.N) {
                        this.d = typedArrayObtainStyledAttributes.getInt(index, 0);
                    } else if (index == i5j.T) {
                        this.e = typedArrayObtainStyledAttributes.getInt(index, 0);
                    } else if (index == i5j.U) {
                        this.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                    } else if (index == i5j.Q) {
                        this.g = typedArrayObtainStyledAttributes.getInt(index, 0);
                    } else if (index == i5j.O) {
                        this.h = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    } else if (index == i5j.P) {
                        this.m = typedArrayObtainStyledAttributes.getInt(index, 0);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        public int a() {
            return this.f26631k;
        }

        public float b() {
            return this.i;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            return this.m;
        }

        public int e() {
            return this.d;
        }

        public int f() {
            return this.g;
        }

        public float g() {
            return this.c;
        }

        public int h() {
            return this.f26629a;
        }

        public int i() {
            return this.e;
        }

        public int j() {
            return this.f;
        }

        public float k() {
            return this.f26630b;
        }

        public boolean l() {
            return this.j;
        }

        public LayoutParams m(int i) {
            this.h = i;
            return this;
        }

        public LayoutParams n(int i) {
            this.d = i;
            return this;
        }

        public LayoutParams o(int i) {
            this.g = i;
            return this;
        }

        public LayoutParams p(float f) {
            this.c = f;
            return this;
        }

        public LayoutParams q(int i, int i2, int i3, int i4) {
            setMarginStart(i);
            setMarginEnd(i3);
            ((ViewGroup.MarginLayoutParams) this).topMargin = i2;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = i4;
            return this;
        }

        public LayoutParams r(int i) {
            this.f26629a = i;
            return this;
        }

        public LayoutParams s(int i) {
            this.e = i;
            return this;
        }

        public LayoutParams t(int i) {
            this.f = i;
            return this;
        }

        public LayoutParams u(float f) {
            this.f26630b = f;
            return this;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.d = 0;
            this.j = false;
            this.f26631k = 7;
            this.l = 8388611;
            this.m = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.d = 0;
            this.j = false;
            this.f26631k = 7;
            this.l = 8388611;
            this.m = 0;
        }
    }
}
