package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<View> f5022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f5023d;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f5020a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.C, i14, 0);
        this.f5021b = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f5020a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            vb.h.z("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.f5020a == 0) {
            vb.h.s("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f5023d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f5020a, viewGroup, false);
        int i14 = this.f5021b;
        if (i14 != -1) {
            viewInflate.setId(i14);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f5022c = new WeakReference<>(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f5021b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f5023d;
    }

    public int getLayoutResource() {
        return this.f5020a;
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i14) {
        this.f5021b = i14;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f5023d = layoutInflater;
    }

    public void setLayoutResource(int i14) {
        this.f5020a = i14;
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i14) {
        WeakReference<View> weakReference = this.f5022c;
        if (weakReference != null) {
            View view2 = weakReference.get();
            if (view2 != null) {
                view2.setVisibility(i14);
                return;
            } else {
                vb.h.z("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i14);
        if (i14 == 0 || i14 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
