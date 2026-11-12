package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.c;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.bpi;
import defpackage.c2j;
import defpackage.cpi;
import defpackage.dti;
import defpackage.eii;
import defpackage.g7i;
import defpackage.m80;
import defpackage.n5j;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.stretchablewidget.WidgetContainer;

/* JADX INFO: loaded from: classes3.dex */
public class StretchableWidgetPreference extends BasePreference {
    public ImageView e;
    public RelativeLayout f;
    public WidgetContainer g;
    public TextView h;
    public TextView i;
    public View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f26864k;
    public boolean l;
    public String m;
    public int n;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StretchableWidgetPreference.this.u(view);
        }
    }

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.K0(StretchableWidgetPreference.this.o());
            m80Var.g0(true);
            m80Var.h0(StretchableWidgetPreference.this.l);
        }
    }

    public StretchableWidgetPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.p2, i, 0);
        this.m = typedArrayObtainStyledAttributes.getString(n5j.q2);
        this.l = typedArrayObtainStyledAttributes.getBoolean(n5j.r2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String o() {
        return this.l ? getContext().getString(c2j.c) : getContext().getString(c2j.f4865b);
    }

    @Override // miuix.preference.BasePreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        View view = g7iVar.itemView;
        this.f = (RelativeLayout) view.findViewById(dti.f15920r);
        WidgetContainer widgetContainer = (WidgetContainer) view.findViewById(R.id.widget_frame);
        this.g = widgetContainer;
        widgetContainer.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.n = this.g.getMeasuredHeight();
        this.i = (TextView) view.findViewById(dti.p);
        this.h = (TextView) view.findViewById(dti.g);
        ImageView imageView = (ImageView) view.findViewById(dti.n);
        this.e = imageView;
        imageView.setBackgroundResource(bpi.d);
        this.j = view.findViewById(dti.d);
        this.f26864k = view.findViewById(dti.q);
        r(this.m);
        s(this.l);
        this.f.setOnClickListener(new a());
        if (b()) {
            c.r0(this.f, new b());
        }
    }

    public final void p(boolean z) {
        IStateStyle iStateStyleUseValue = Folme.useValue(this.g);
        String str = StatConstants.PARAM_START;
        IStateStyle iStateStyleAdd = iStateStyleUseValue.setup(StatConstants.PARAM_START).add("widgetHeight", this.n);
        ViewProperty viewProperty = ViewProperty.ALPHA;
        iStateStyleAdd.add((FloatProperty) viewProperty, 1.0f).setup(StatConstants.PARAM_END).add("widgetHeight", 0).add((FloatProperty) viewProperty, 0.0f);
        IStateStyle iStateStyleUseValue2 = Folme.useValue(this.g);
        if (!z) {
            str = StatConstants.PARAM_END;
        }
        iStateStyleUseValue2.setTo(str);
    }

    public void r(String str) {
        this.h.setText(str);
    }

    public void s(boolean z) {
        if (z) {
            this.e.setBackgroundResource(bpi.e);
            this.j.setVisibility(0);
            this.f26864k.setVisibility(0);
        } else {
            this.e.setBackgroundResource(bpi.d);
            this.j.setVisibility(8);
            this.f26864k.setVisibility(8);
        }
        p(z);
    }

    public final void u(View view) {
        boolean z = !this.l;
        this.l = z;
        if (z) {
            Folme.useValue(this.g).to(StatConstants.PARAM_START, new AnimConfig().setFromSpeed(0.0f).setSpecial(ViewProperty.ALPHA, (AnimSpecialConfig) new AnimSpecialConfig().setEase(-2, 1.0f, 0.2f)));
            this.e.setBackgroundResource(cpi.f14600b);
            this.j.setVisibility(0);
            this.f26864k.setVisibility(0);
        } else {
            Folme.useValue(this.g).to(StatConstants.PARAM_END, new AnimConfig().setFromSpeed(0.0f).setSpecial(ViewProperty.ALPHA, (AnimSpecialConfig) new AnimSpecialConfig().setEase(-2, 1.0f, 0.2f)));
            this.e.setBackgroundResource(cpi.f14599a);
            this.j.setVisibility(8);
            this.f26864k.setVisibility(8);
        }
        if (b()) {
            view.announceForAccessibility(o());
        }
    }

    public StretchableWidgetPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.D);
    }
}
