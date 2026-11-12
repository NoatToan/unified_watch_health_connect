package miuix.stretchablewidget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.cpi;
import defpackage.f2j;
import defpackage.fti;
import defpackage.hii;
import defpackage.iwi;
import defpackage.k8p;
import defpackage.m80;
import defpackage.pso;
import defpackage.s5j;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes3.dex */
public class StretchableWidget extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RelativeLayout f26899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f26900b;
    public TextView c;
    public ImageView d;
    public ImageView e;
    public WidgetContainer f;
    public View g;
    public View h;
    public boolean i;
    public Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26901k;
    public int l;
    public int m;
    public View n;
    public String o;
    public int p;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StretchableWidget.this.i();
            view.announceForAccessibility(StretchableWidget.this.getStateInfo());
        }
    }

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.K0(StretchableWidget.this.getStateInfo());
            m80Var.g0(true);
            m80Var.h0(StretchableWidget.this.i);
        }
    }

    public class c implements pso {
        public c() {
        }
    }

    public interface d {
    }

    public StretchableWidget(Context context) {
        this(context, null);
    }

    private void f(Context context, AttributeSet attributeSet, int i) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(iwi.f22171a, (ViewGroup) this, true);
        this.f26899a = (RelativeLayout) viewInflate.findViewById(fti.f18229k);
        this.d = (ImageView) viewInflate.findViewById(fti.e);
        this.f26900b = (TextView) viewInflate.findViewById(fti.start_text);
        this.e = (ImageView) viewInflate.findViewById(fti.i);
        this.c = (TextView) viewInflate.findViewById(fti.d);
        this.f = (WidgetContainer) viewInflate.findViewById(fti.f18228b);
        this.g = viewInflate.findViewById(fti.f18227a);
        this.h = viewInflate.findViewById(fti.j);
        setTitle(this.f26901k);
        g(this.j, attributeSet, i);
        h(this.m);
        setIcon(this.l);
        setDetailMessage(this.o);
        setState(this.i);
        this.f26899a.setOnClickListener(new a());
        androidx.core.view.c.r0(this.f26899a, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getStateInfo() {
        return this.i ? getContext().getString(f2j.f17336b) : getContext().getString(f2j.f17335a);
    }

    private void setContainerAmin(boolean z) {
        IStateStyle iStateStyleUseValue = Folme.useValue(this.f);
        String str = StatConstants.PARAM_START;
        IStateStyle iStateStyleAdd = iStateStyleUseValue.setup(StatConstants.PARAM_START).add("widgetHeight", this.p);
        ViewProperty viewProperty = ViewProperty.ALPHA;
        iStateStyleAdd.add((FloatProperty) viewProperty, 1.0f).setup(StatConstants.PARAM_END).add("widgetHeight", 0).add((FloatProperty) viewProperty, 0.0f);
        IStateStyle iStateStyleUseValue2 = Folme.useValue(this.f);
        if (!z) {
            str = StatConstants.PARAM_END;
        }
        iStateStyleUseValue2.setTo(str);
    }

    public void d() {
    }

    public final View e(int i) {
        if (i == 0) {
            return null;
        }
        return ((LayoutInflater) this.j.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
    }

    public void g(Context context, AttributeSet attributeSet, int i) {
    }

    public View getLayout() {
        return this.n;
    }

    public View h(int i) {
        if (i == 0) {
            return null;
        }
        View viewE = e(i);
        setView(viewE);
        return viewE;
    }

    public final void i() {
        this.i = !this.i;
        AnimSpecialConfig animSpecialConfig = (AnimSpecialConfig) new AnimSpecialConfig().setEase(-2, 1.0f, 0.2f);
        if (this.i) {
            Folme.useValue(this.f).to(StatConstants.PARAM_START, new AnimConfig().setFromSpeed(0.0f).setSpecial(ViewProperty.ALPHA, animSpecialConfig));
            this.e.setBackgroundResource(cpi.f14600b);
            this.h.setVisibility(0);
            this.g.setVisibility(0);
            return;
        }
        Folme.useValue(this.f).to(StatConstants.PARAM_END, new AnimConfig().setFromSpeed(0.0f).setSpecial(ViewProperty.ALPHA, animSpecialConfig));
        this.e.setBackgroundResource(cpi.f14599a);
        this.h.setVisibility(8);
        this.g.setVisibility(8);
    }

    public void setDetailMessage(CharSequence charSequence) {
        if (charSequence != null) {
            this.c.setText(charSequence);
        }
    }

    public void setIcon(int i) {
        if (i == 0) {
            return;
        }
        this.d.setBackgroundResource(i);
    }

    public void setLayout(View view) {
        setView(view);
    }

    public void setState(boolean z) {
        if (z) {
            this.e.setBackgroundResource(cpi.f14600b);
            this.h.setVisibility(0);
            this.g.setVisibility(0);
        } else {
            this.e.setBackgroundResource(cpi.f14599a);
            this.h.setVisibility(8);
            this.g.setVisibility(8);
        }
        setContainerAmin(z);
    }

    public void setStateChangedListener(d dVar) {
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f26900b.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"WrongConstant"})
    public void setView(View view) {
        if (view == 0) {
            return;
        }
        this.n = view;
        if (view instanceof k8p) {
            ((k8p) view).a(new c());
        }
        if (this.f.getChildCount() == 0) {
            this.f.addView(view);
        } else {
            this.f.removeAllViews();
            this.f.addView(view);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.p = view.getMeasuredHeight();
        d();
        setContainerAmin(this.i);
    }

    public StretchableWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hii.f20105a);
    }

    public StretchableWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = 0;
        setOrientation(1);
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5j.i0, i, 0);
        this.f26901k = typedArrayObtainStyledAttributes.getString(s5j.n0);
        this.l = typedArrayObtainStyledAttributes.getResourceId(s5j.l0, 0);
        this.m = typedArrayObtainStyledAttributes.getResourceId(s5j.m0, 0);
        this.o = typedArrayObtainStyledAttributes.getString(s5j.j0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(s5j.k0, false);
        f(context, attributeSet, i);
        typedArrayObtainStyledAttributes.recycle();
    }
}
