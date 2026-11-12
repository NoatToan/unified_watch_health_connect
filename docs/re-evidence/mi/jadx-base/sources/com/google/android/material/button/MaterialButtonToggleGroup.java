package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import defpackage.a00;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c5f;
import defpackage.c9p;
import defpackage.k3j;
import defpackage.m80;
import defpackage.n8f;
import defpackage.pii;
import defpackage.r2m;
import defpackage.sl4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f8598k = k3j.D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f8599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f8600b;
    public final LinkedHashSet<d> c;
    public final Comparator<MaterialButton> d;
    public Integer[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final int i;
    public Set<Integer> j;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.l0(m80.f.b(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {
        public static final sl4 e = new a00(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sl4 f8603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sl4 f8604b;
        public sl4 c;
        public sl4 d;

        public c(sl4 sl4Var, sl4 sl4Var2, sl4 sl4Var3, sl4 sl4Var4) {
            this.f8603a = sl4Var;
            this.f8604b = sl4Var3;
            this.c = sl4Var4;
            this.d = sl4Var2;
        }

        public static c a(c cVar) {
            sl4 sl4Var = e;
            return new c(sl4Var, cVar.d, sl4Var, cVar.c);
        }

        public static c b(c cVar, View view) {
            return ayq.j(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            sl4 sl4Var = cVar.f8603a;
            sl4 sl4Var2 = cVar.d;
            sl4 sl4Var3 = e;
            return new c(sl4Var, sl4Var2, sl4Var3, sl4Var3);
        }

        public static c d(c cVar) {
            sl4 sl4Var = e;
            return new c(sl4Var, sl4Var, cVar.f8604b, cVar.c);
        }

        public static c e(c cVar, View view) {
            return ayq.j(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            sl4 sl4Var = cVar.f8603a;
            sl4 sl4Var2 = e;
            return new c(sl4Var, sl4Var2, cVar.f8604b, sl4Var2);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public class e implements MaterialButton.b {
        public e() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (k(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && k(i2)) {
                i++;
            }
        }
        return i;
    }

    public static void p(r2m.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.F(cVar.f8603a).w(cVar.d).J(cVar.f8604b).A(cVar.c);
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(androidx.core.view.c.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f8600b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void addOnButtonCheckedListener(d dVar) {
        this.c.add(dVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            e(materialButton.getId(), materialButton.isChecked());
            r2m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f8599a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
            androidx.core.view.c.r0(materialButton, new b());
        }
    }

    public final void b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonH = h(i);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsC = c(materialButtonH);
            if (getOrientation() == 0) {
                c5f.c(layoutParamsC, 0);
                c5f.d(layoutParamsC, -iMin);
                layoutParamsC.topMargin = 0;
            } else {
                layoutParamsC.bottomMargin = 0;
                layoutParamsC.topMargin = -iMin;
                c5f.d(layoutParamsC, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsC);
        }
        n(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public void d(int i) {
        e(i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public final void e(int i, boolean z) {
        if (i == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Button ID is not valid: ");
            sb.append(i);
            return;
        }
        HashSet hashSet = new HashSet(this.j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        q(hashSet);
    }

    public void f() {
        q(new HashSet());
    }

    public final void g(int i, boolean z) {
        Iterator<d> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i, z);
        }
    }

    public int getCheckedButtonId() {
        if (!this.g || this.j.isEmpty()) {
            return -1;
        }
        return this.j.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = h(i).getId();
            if (this.j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public final MaterialButton h(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && k(i2)) {
                i++;
            }
        }
        return -1;
    }

    public final c j(int i, int i2, int i3) {
        c cVar = this.f8599a.get(i);
        if (i2 == i3) {
            return cVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? c.e(cVar, this) : c.f(cVar);
        }
        if (i == i3) {
            return z ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    public final boolean k(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public boolean l() {
        return this.g;
    }

    public void m(MaterialButton materialButton, boolean z) {
        if (this.f) {
            return;
        }
        e(materialButton.getId(), z);
    }

    public final void n(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            c5f.c(layoutParams, 0);
            c5f.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void o(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.f = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.f = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            q(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m80.P0(accessibilityNodeInfo).k0(m80.e.b(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        s();
        b();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f8599a.remove(iIndexOfChild);
        }
        s();
        b();
    }

    public final void q(Set<Integer> set) {
        Set<Integer> set2 = this.j;
        this.j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = h(i).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    public final void r() {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(h(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void removeOnButtonCheckedListener(d dVar) {
        this.c.remove(dVar);
    }

    @VisibleForTesting
    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonH = h(i);
            if (materialButtonH.getVisibility() != 8) {
                r2m.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    public void setSelectionRequired(boolean z) {
        this.h = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.g != z) {
            this.g = z;
            f();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.D);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = f8598k;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        this.f8599a = new ArrayList();
        this.f8600b = new e(this, null);
        this.c = new LinkedHashSet<>();
        this.d = new a();
        this.f = false;
        this.j = new HashSet();
        TypedArray typedArrayH = c9p.h(getContext(), attributeSet, b4j.n4, i, i2, new int[0]);
        setSingleSelection(typedArrayH.getBoolean(b4j.q4, false));
        this.i = typedArrayH.getResourceId(b4j.o4, -1);
        this.h = typedArrayH.getBoolean(b4j.p4, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayH.recycle();
        androidx.core.view.c.C0(this, 1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
