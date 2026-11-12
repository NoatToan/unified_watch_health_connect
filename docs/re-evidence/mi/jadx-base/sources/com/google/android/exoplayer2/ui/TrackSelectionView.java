package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import defpackage.g2j;
import defpackage.jwi;
import defpackage.nx5;
import defpackage.qnp;
import defpackage.rk1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f8376b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final b e;
    public final SparseArray<DefaultTrackSelector.SelectionOverride> f;
    public boolean g;
    public boolean h;
    public qnp i;
    public CheckedTextView[][] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.google.android.exoplayer2.trackselection.c.a f8377k;
    public int l;
    public TrackGroupArray m;
    public boolean n;
    public Comparator<c> o;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.d(view);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8380b;
        public final Format c;

        public c(int i, int i2, Format format) {
            this.f8379a = i;
            this.f8380b = i2;
            this.c = format;
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public static int[] b(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = i;
        return iArrCopyOf;
    }

    public static int[] c(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length - 1];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                iArr2[i2] = i3;
                i2++;
            }
        }
        return iArr2;
    }

    public final void d(View view) {
        if (view == this.c) {
            f();
        } else if (view == this.d) {
            e();
        } else {
            g(view);
        }
        j();
    }

    public final void e() {
        this.n = false;
        this.f.clear();
    }

    public final void f() {
        this.n = true;
        this.f.clear();
    }

    public final void g(View view) {
        this.n = false;
        c cVar = (c) rk1.e(view.getTag());
        int i = cVar.f8379a;
        int i2 = cVar.f8380b;
        DefaultTrackSelector.SelectionOverride selectionOverride = this.f.get(i);
        rk1.e(this.f8377k);
        if (selectionOverride == null) {
            if (!this.h && this.f.size() > 0) {
                this.f.clear();
            }
            this.f.put(i, new DefaultTrackSelector.SelectionOverride(i, i2));
            return;
        }
        int i3 = selectionOverride.c;
        int[] iArr = selectionOverride.f8300b;
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zH = h(i);
        boolean z = zH || i();
        if (zIsChecked && z) {
            if (i3 == 1) {
                this.f.remove(i);
                return;
            } else {
                this.f.put(i, new DefaultTrackSelector.SelectionOverride(i, c(iArr, i2)));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (zH) {
            this.f.put(i, new DefaultTrackSelector.SelectionOverride(i, b(iArr, i2)));
        } else {
            this.f.put(i, new DefaultTrackSelector.SelectionOverride(i, i2));
        }
    }

    public boolean getIsDisabled() {
        return this.n;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (int i = 0; i < this.f.size(); i++) {
            arrayList.add(this.f.valueAt(i));
        }
        return arrayList;
    }

    public final boolean h(int i) {
        return this.g && this.m.a(i).f8076a > 1 && this.f8377k.a(this.l, i, false) != 0;
    }

    public final boolean i() {
        return this.h && this.m.f8078a > 1;
    }

    public final void j() {
        this.c.setChecked(this.n);
        this.d.setChecked(!this.n && this.f.size() == 0);
        for (int i = 0; i < this.j.length; i++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = this.f.get(i);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.j[i];
                if (i2 < checkedTextViewArr.length) {
                    if (selectionOverride != null) {
                        this.j[i][i2].setChecked(selectionOverride.a(((c) rk1.e(checkedTextViewArr[i2].getTag())).f8380b));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void k() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f8377k == null) {
            this.c.setEnabled(false);
            this.d.setEnabled(false);
            return;
        }
        this.c.setEnabled(true);
        this.d.setEnabled(true);
        TrackGroupArray trackGroupArrayE = this.f8377k.e(this.l);
        this.m = trackGroupArrayE;
        this.j = new CheckedTextView[trackGroupArrayE.f8078a][];
        boolean zI = i();
        int i = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.m;
            if (i >= trackGroupArray.f8078a) {
                j();
                return;
            }
            TrackGroup trackGroupA = trackGroupArray.a(i);
            boolean zH = h(i);
            CheckedTextView[][] checkedTextViewArr = this.j;
            int i2 = trackGroupA.f8076a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            c[] cVarArr = new c[i2];
            for (int i3 = 0; i3 < trackGroupA.f8076a; i3++) {
                cVarArr[i3] = new c(i, i3, trackGroupA.a(i3));
            }
            Comparator<c> comparator = this.o;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.f8376b.inflate(jwi.f23204a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f8376b.inflate((zH || zI) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f8375a);
                checkedTextView.setText(this.i.a(cVarArr[i4].c));
                checkedTextView.setTag(cVarArr[i4]);
                if (this.f8377k.f(this.l, i, i4) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.j[i][i4] = checkedTextView;
                addView(checkedTextView);
            }
            i++;
        }
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.g != z) {
            this.g = z;
            k();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (!z && this.f.size() > 1) {
                for (int size = this.f.size() - 1; size > 0; size--) {
                    this.f.remove(size);
                }
            }
            k();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(qnp qnpVar) {
        this.i = (qnp) rk1.e(qnpVar);
        k();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.f = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f8375a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f8376b = layoutInflaterFrom;
        b bVar = new b();
        this.e = bVar;
        this.i = new nx5(getResources());
        this.m = TrackGroupArray.EMPTY;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(g2j.x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(jwi.f23204a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(g2j.w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
