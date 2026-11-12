package miuix.stretchablewidget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import defpackage.fti;
import defpackage.iwi;
import defpackage.m80;
import defpackage.s5j;
import defpackage.zq5;
import miuix.pickerwidget.date.Calendar;
import miuix.pickerwidget.widget.DateTimePicker;
import miuix.slidingwidget.widget.SlidingButton;

/* JADX INFO: loaded from: classes3.dex */
public class StretchableDatePicker extends StretchableWidget {
    public boolean A;
    public int B;
    public long C;
    public DateTimePicker q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SlidingButton f26893r;
    public LinearLayout s;
    public RelativeLayout t;
    public Calendar u;
    public DateTimePicker.c v;
    public TextView w;
    public String x;
    public int y;
    public boolean z;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(true);
            m80Var.h0(StretchableDatePicker.this.f26893r.isChecked());
            m80Var.j0(true);
            m80Var.i0(Switch.class.getName());
            m80Var.m0(StretchableDatePicker.this.w.getText());
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f26895a;

        public b(Context context) {
            this.f26895a = context;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            StretchableDatePicker.this.q.setLunarMode(z);
            StretchableDatePicker.this.y(z, this.f26895a);
            StretchableDatePicker.this.A = z;
        }
    }

    public class c implements DateTimePicker.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f26897a;

        public c(Context context) {
            this.f26897a = context;
        }

        @Override // miuix.pickerwidget.widget.DateTimePicker.d
        public void e(DateTimePicker dateTimePicker, long j) {
            StretchableDatePicker.this.u.setTimeInMillis(j);
            StretchableDatePicker stretchableDatePicker = StretchableDatePicker.this;
            stretchableDatePicker.y(stretchableDatePicker.A, this.f26897a);
            StretchableDatePicker.this.C = j;
            StretchableDatePicker.s(StretchableDatePicker.this);
        }
    }

    public interface d {
    }

    public StretchableDatePicker(Context context) {
        this(context, null);
    }

    public static /* synthetic */ d s(StretchableDatePicker stretchableDatePicker) {
        stretchableDatePicker.getClass();
        return null;
    }

    @Override // miuix.stretchablewidget.StretchableWidget
    public void d() {
        this.p = this.B;
    }

    public final void f(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5j.e0, i, 0);
        this.z = typedArrayObtainStyledAttributes.getBoolean(s5j.h0, false);
        this.x = typedArrayObtainStyledAttributes.getString(s5j.f0);
        this.y = typedArrayObtainStyledAttributes.getInteger(s5j.g0, 1);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(iwi.f22172b, (ViewGroup) null);
        this.s = linearLayout;
        this.q = (DateTimePicker) linearLayout.findViewById(fti.c);
        this.t = (RelativeLayout) this.s.findViewById(fti.g);
        this.w = (TextView) this.s.findViewById(fti.h);
        this.f26893r = (SlidingButton) this.s.findViewById(fti.f);
        if (!this.z) {
            this.t.setVisibility(8);
        }
        final AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        androidx.core.view.c.r0(this.t, new a());
        this.t.setOnClickListener(new View.OnClickListener() { // from class: blo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4347a.v(accessibilityManager, view);
            }
        });
        this.f26893r.setOnCheckedChangeListener(new b(context));
        this.s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.B = this.s.getMeasuredHeight();
        setLayout(this.s);
        this.u = new Calendar();
        setLunarText(this.x);
        this.v = new DateTimePicker.c(context);
        setMinuteInterval(this.y);
        x(context);
        this.C = this.u.getTimeInMillis();
        this.q.setOnTimeChangedListener(new c(context));
    }

    @Override // miuix.stretchablewidget.StretchableWidget
    public void g(Context context, AttributeSet attributeSet, int i) {
        f(context, attributeSet, i);
    }

    public long getTime() {
        return this.C;
    }

    public void setLunarModeOn(boolean z) {
        SlidingButton slidingButton = this.f26893r;
        if (slidingButton != null) {
            slidingButton.setChecked(z);
        }
    }

    public void setLunarText(String str) {
        this.w.setText(str);
    }

    public void setMinuteInterval(int i) {
        this.q.setMinuteInterval(i);
    }

    public void setOnTimeChangeListener(d dVar) {
    }

    public final String t(long j, Context context) {
        return this.v.a(this.u.get(1), this.u.get(5), this.u.get(9)) + " " + zq5.a(context, j, 12);
    }

    public final String u(long j, Context context) {
        return zq5.a(context, j, 908);
    }

    public final /* synthetic */ void v(AccessibilityManager accessibilityManager, View view) {
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            this.f26893r.toggle();
        }
    }

    public void w(Context context) {
        setDetailMessage(t(this.u.getTimeInMillis(), context));
    }

    public final void x(Context context) {
        setDetailMessage(u(this.u.getTimeInMillis(), context));
    }

    public final void y(boolean z, Context context) {
        if (z) {
            w(context);
        } else {
            x(context);
        }
    }

    public StretchableDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StretchableDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = 1;
    }
}
