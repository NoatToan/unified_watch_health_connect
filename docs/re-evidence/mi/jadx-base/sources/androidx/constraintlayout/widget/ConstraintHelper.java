package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import defpackage.d7c;
import defpackage.f7c;
import defpackage.nqi;
import defpackage.u4j;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2000b;
    public Context c;
    public d7c d;
    public boolean e;
    public String f;
    public String g;
    public View[] h;
    public HashMap<Integer, String> i;

    public ConstraintHelper(Context context) {
        super(context);
        this.f1999a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap<>();
        this.c = context;
        o(null);
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iM = m(strTrim);
        if (iM != 0) {
            this.i.put(Integer.valueOf(iM), strTrim);
            f(iM);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find id of \"");
            sb.append(strTrim);
            sb.append("\"");
        }
    }

    public final void f(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f2000b + 1;
        int[] iArr = this.f1999a;
        if (i2 > iArr.length) {
            this.f1999a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1999a;
        int i3 = this.f2000b;
        iArr2[i3] = i;
        this.f2000b = i3 + 1;
    }

    public final void g(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).c0)) {
                if (childAt.getId() == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("to use ConstraintTag view ");
                    sb.append(childAt.getClass().getSimpleName());
                    sb.append(" must have an ID");
                } else {
                    f(childAt.getId());
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1999a, this.f2000b);
    }

    public void h() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        i((ConstraintLayout) parent);
    }

    public void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2000b; i++) {
            View viewById = constraintLayout.getViewById(this.f1999a[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public final int[] k(View view, String str) {
        String[] strArrSplit = str.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        for (String str2 : strArrSplit) {
            int iM = m(str2.trim());
            if (iM != 0) {
                iArr[i] = iM;
                i++;
            }
        }
        return i != strArrSplit.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    public final int l(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int m(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iL = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iL = ((Integer) designInformation).intValue();
            }
        }
        if (iL == 0 && constraintLayout != null) {
            iL = l(constraintLayout, str);
        }
        if (iL == 0) {
            try {
                iL = nqi.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iL == 0 ? this.c.getResources().getIdentifier(str, "id", this.c.getPackageName()) : iL;
    }

    public View[] n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.h;
        if (viewArr == null || viewArr.length != this.f2000b) {
            this.h = new View[this.f2000b];
        }
        for (int i = 0; i < this.f2000b; i++) {
            this.h[i] = constraintLayout.getViewById(this.f1999a[i]);
        }
        return this.h;
    }

    public void o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.x1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.V1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                } else if (index == u4j.W1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(a.C0020a c0020a, f7c f7cVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        a.b bVar = c0020a.e;
        int[] iArr = bVar.k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.l0;
            if (str != null) {
                if (str.length() > 0) {
                    a.b bVar2 = c0020a.e;
                    bVar2.k0 = k(this, bVar2.l0);
                } else {
                    c0020a.e.k0 = null;
                }
            }
        }
        if (f7cVar == null) {
            return;
        }
        f7cVar.b();
        if (c0020a.e.k0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = c0020a.e.k0;
            if (i >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = sparseArray.get(iArr2[i]);
            if (constraintWidget != null) {
                f7cVar.a(constraintWidget);
            }
            i++;
        }
    }

    public void q(ConstraintWidget constraintWidget, boolean z) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    public void setIds(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2000b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                e(str.substring(i));
                return;
            } else {
                e(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2000b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                g(str.substring(i));
                return;
            } else {
                g(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.f2000b = 0;
        for (int i : iArr) {
            f(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            f(i);
        }
    }

    public void t(ConstraintLayout constraintLayout) {
    }

    public void u(d dVar, d7c d7cVar, SparseArray<ConstraintWidget> sparseArray) {
        d7cVar.b();
        for (int i = 0; i < this.f2000b; i++) {
            d7cVar.a(sparseArray.get(this.f1999a[i]));
        }
    }

    public void v(ConstraintLayout constraintLayout) {
        String str;
        int iL;
        if (isInEditMode()) {
            setIds(this.f);
        }
        d7c d7cVar = this.d;
        if (d7cVar == null) {
            return;
        }
        d7cVar.b();
        for (int i = 0; i < this.f2000b; i++) {
            int i2 = this.f1999a[i];
            View viewById = constraintLayout.getViewById(i2);
            if (viewById == null && (iL = l(constraintLayout, (str = this.i.get(Integer.valueOf(i2))))) != 0) {
                this.f1999a[i] = iL;
                this.i.put(Integer.valueOf(iL), str);
                viewById = constraintLayout.getViewById(iL);
            }
            if (viewById != null) {
                this.d.a(constraintLayout.getViewWidget(viewById));
            }
        }
        this.d.c(constraintLayout.mLayoutWidget);
    }

    public void w() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).v0 = (ConstraintWidget) this.d;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1999a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap<>();
        this.c = context;
        o(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1999a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap<>();
        this.c = context;
        o(attributeSet);
    }
}
