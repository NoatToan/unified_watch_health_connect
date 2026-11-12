package miuix.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.vsi;
import miuix.appcompat.app.floatingactivity.FloatingABOLayoutSpec;

/* JADX INFO: loaded from: classes3.dex */
public class DialogParentPanel extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FloatingABOLayoutSpec f26637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26638b;
    public Barrier c;
    public View d;
    public View e;
    public View f;
    public View g;
    public LinearLayout h;
    public final int[] i;
    public int[] j;

    public DialogParentPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new int[0];
        FloatingABOLayoutSpec floatingABOLayoutSpec = new FloatingABOLayoutSpec(context, attributeSet);
        this.f26637a = floatingABOLayoutSpec;
        floatingABOLayoutSpec.t(true);
    }

    private void e() {
        this.g = findViewById(vsi.w);
        this.d = findViewById(vsi.q0);
        this.e = findViewById(vsi.z);
        this.f = findViewById(vsi.D);
        this.h = (LinearLayout) findViewById(vsi.v);
        this.j = new int[]{vsi.q0, vsi.z, vsi.D};
    }

    public void a() {
        ConstraintLayout.LayoutParams layoutParamsD = d(this.g);
        ConstraintLayout.LayoutParams layoutParamsD2 = d(this.d);
        ConstraintLayout.LayoutParams layoutParamsD3 = d(this.e);
        ConstraintLayout.LayoutParams layoutParamsD4 = d(this.f);
        if (f()) {
            this.c.setType(6);
            this.c.setReferencedIds(this.j);
            this.h.setOrientation(1);
            layoutParamsD2.V = 0.5f;
            layoutParamsD2.t = 0;
            layoutParamsD2.i = 0;
            layoutParamsD2.v = -1;
            layoutParamsD3.V = 0.5f;
            layoutParamsD3.t = 0;
            layoutParamsD3.v = -1;
            layoutParamsD3.j = vsi.q0;
            ((ViewGroup.MarginLayoutParams) layoutParamsD3).height = 0;
            layoutParamsD3.b0 = false;
            layoutParamsD3.Q = 0;
            layoutParamsD4.V = 0.5f;
            layoutParamsD4.t = 0;
            layoutParamsD4.j = vsi.z;
            layoutParamsD4.v = -1;
            layoutParamsD4.f2003k = -1;
            layoutParamsD4.l = 0;
            ((ViewGroup.MarginLayoutParams) layoutParamsD4).height = 0;
            layoutParamsD4.b0 = false;
            layoutParamsD4.Q = 0;
            layoutParamsD.V = 0.5f;
            layoutParamsD.t = -1;
            layoutParamsD.j = -1;
            layoutParamsD.v = 0;
            c(layoutParamsD, 0);
        } else {
            this.c.setReferencedIds(this.i);
            this.h.setOrientation(0);
            layoutParamsD2.V = 1.0f;
            b(layoutParamsD2, 0);
            layoutParamsD2.i = 0;
            layoutParamsD3.V = 1.0f;
            layoutParamsD3.b0 = true;
            ((ViewGroup.MarginLayoutParams) layoutParamsD3).height = -2;
            b(layoutParamsD3, 0);
            layoutParamsD4.V = 1.0f;
            layoutParamsD4.b0 = true;
            ((ViewGroup.MarginLayoutParams) layoutParamsD4).height = -2;
            b(layoutParamsD4, 0);
            layoutParamsD4.f2003k = vsi.w;
            layoutParamsD.V = 1.0f;
            b(layoutParamsD, 0);
            layoutParamsD.s = -1;
            layoutParamsD.i = -1;
            layoutParamsD.j = vsi.D;
            layoutParamsD.l = 0;
        }
        this.g.setLayoutParams(layoutParamsD);
        this.d.setLayoutParams(layoutParamsD2);
        this.e.setLayoutParams(layoutParamsD3);
        this.f.setLayoutParams(layoutParamsD4);
    }

    public final void b(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.t = i;
        layoutParams.v = i;
    }

    public final void c(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.i = i;
        layoutParams.l = i;
    }

    public final ConstraintLayout.LayoutParams d(View view) {
        return view == null ? new ConstraintLayout.LayoutParams(0, 0) : (ConstraintLayout.LayoutParams) view.getLayoutParams();
    }

    public boolean f() {
        return this.f26638b;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f26637a.p();
        a();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iF = this.f26637a.f(i2);
        if (f()) {
            iF = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iF), 1073741824);
        }
        super.onMeasure(this.f26637a.n(i), iF);
    }

    public void setShouldAdjustLayout(boolean z) {
        this.f26638b = z;
    }
}
