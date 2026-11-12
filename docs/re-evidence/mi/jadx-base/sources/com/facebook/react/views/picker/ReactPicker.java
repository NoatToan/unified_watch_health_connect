package com.facebook.react.views.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import defpackage.fej;
import defpackage.gej;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ReactPicker extends AppCompatSpinner {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f7530k;
    public List<gej> l;
    public List<gej> m;
    public Integer n;
    public Integer o;
    public final AdapterView.OnItemSelectedListener p;
    public final Runnable q;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (ReactPicker.this.f7530k != null) {
                ReactPicker.this.f7530k.a(i);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (ReactPicker.this.f7530k != null) {
                ReactPicker.this.f7530k.a(-1);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReactPicker reactPicker = ReactPicker.this;
            reactPicker.measure(View.MeasureSpec.makeMeasureSpec(reactPicker.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ReactPicker.this.getHeight(), 1073741824));
            ReactPicker reactPicker2 = ReactPicker.this;
            reactPicker2.layout(reactPicker2.getLeft(), ReactPicker.this.getTop(), ReactPicker.this.getRight(), ReactPicker.this.getBottom());
        }
    }

    public interface c {
        void a(int i);
    }

    public ReactPicker(Context context) {
        super(context);
        this.j = 0;
        this.p = new a();
        this.q = new b();
    }

    public void d() {
        setOnItemSelectedListener(null);
        fej fejVar = (fej) getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        List<gej> list = this.m;
        if (list != null && list != this.l) {
            this.l = list;
            this.m = null;
            if (fejVar == null) {
                fejVar = new fej(getContext(), this.l);
                setAdapter((SpinnerAdapter) fejVar);
            } else {
                fejVar.clear();
                fejVar.addAll(this.l);
                fejVar.notifyDataSetChanged();
            }
        }
        Integer num = this.n;
        if (num != null && num.intValue() != selectedItemPosition) {
            setSelection(this.n.intValue(), false);
            this.n = null;
        }
        Integer num2 = this.o;
        if (num2 != null && fejVar != null && num2 != fejVar.a()) {
            fejVar.c(this.o);
            this.o = null;
        }
        setOnItemSelectedListener(this.p);
    }

    public int getMode() {
        return this.j;
    }

    public c getOnSelectListener() {
        return this.f7530k;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.p);
        }
    }

    @Override // android.widget.AbsSpinner, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.q);
    }

    public void setOnSelectListener(c cVar) {
        this.f7530k = cVar;
    }

    public void setStagedItems(List<gej> list) {
        this.m = list;
    }

    public void setStagedPrimaryTextColor(Integer num) {
        this.o = num;
    }

    public void setStagedSelection(int i) {
        this.n = Integer.valueOf(i);
    }

    public ReactPicker(Context context, int i) {
        super(context, i);
        this.j = 0;
        this.p = new a();
        this.q = new b();
        this.j = i;
    }

    public ReactPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = 0;
        this.p = new a();
        this.q = new b();
    }

    public ReactPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = 0;
        this.p = new a();
        this.q = new b();
    }
}
