package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import miuix.pickerwidget.date.Calendar;
import miuix.pickerwidget.widget.DatePicker;
import miuix.slidingwidget.widget.SlidingButton;

/* JADX INFO: loaded from: classes3.dex */
public class zp5 extends miuix.appcompat.app.c {
    public final DatePicker h;
    public final d i;
    public final Calendar j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f41537k;
    public SlidingButton l;
    public boolean m;
    public DatePicker.b n;

    public class a implements DatePicker.b {
        public a() {
        }

        @Override // miuix.pickerwidget.widget.DatePicker.b
        public void a(DatePicker datePicker, int i, int i2, int i3, boolean z) {
            if (zp5.this.m) {
                zp5.this.N(i, i2, i3);
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            zp5.this.L();
        }
    }

    public class c extends androidx.core.view.a {
        public c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(true);
            m80Var.j0(true);
            m80Var.i0(Switch.class.getName());
            if (zp5.this.l != null) {
                m80Var.h0(zp5.this.l.isChecked());
                m80Var.m0(zp5.this.l.getContentDescription());
            }
        }
    }

    public interface d {
        void onDateSet(DatePicker datePicker, int i, int i2, int i3);
    }

    public zp5(Context context, d dVar, int i, int i2, int i3) {
        this(context, 0, dVar, i, i2, i3);
    }

    public DatePicker H() {
        return this.h;
    }

    public final /* synthetic */ void I(CompoundButton compoundButton, boolean z) {
        this.h.setLunarMode(z);
    }

    public final /* synthetic */ boolean J(View view, q80.a aVar) {
        SlidingButton slidingButton = this.l;
        if (slidingButton != null) {
            slidingButton.performClick();
        }
        view.sendAccessibilityEvent(1);
        return true;
    }

    public void K(boolean z) {
        this.f41537k.setVisibility(z ? 0 : 8);
    }

    public final void L() {
        if (this.i != null) {
            this.h.clearFocus();
            d dVar = this.i;
            DatePicker datePicker = this.h;
            dVar.onDateSet(datePicker, datePicker.getYear(), this.h.getMonth(), this.h.getDayOfMonth());
        }
    }

    public void M(int i, int i2, int i3) {
        this.h.v(i, i2, i3);
    }

    public final void N(int i, int i2, int i3) {
        this.j.set(1, i);
        this.j.set(5, i2);
        this.j.set(9, i3);
        super.setTitle(zq5.a(getContext(), this.j.getTimeInMillis(), 14208));
    }

    @Override // miuix.appcompat.app.c, defpackage.if1, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.m = false;
    }

    public zp5(Context context, int i, d dVar, int i2, int i3, int i4) {
        super(context, i);
        this.m = true;
        this.n = new a();
        this.i = dVar;
        this.j = new Calendar();
        Context context2 = getContext();
        y(-1, context2.getText(R.string.ok), new b());
        y(-2, getContext().getText(R.string.cancel), null);
        z(0);
        View viewInflate = ((LayoutInflater) context2.getSystemService("layout_inflater")).inflate(awi.u, (ViewGroup) null);
        A(viewInflate);
        DatePicker datePicker = (DatePicker) viewInflate.findViewById(vsi.E);
        this.h = datePicker;
        datePicker.l(i2, i3, i4, this.n);
        N(i2, i3, i4);
        this.f41537k = viewInflate.findViewById(vsi.K);
        SlidingButton slidingButton = (SlidingButton) viewInflate.findViewById(vsi.F);
        this.l = slidingButton;
        slidingButton.setOnPerformCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xp5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f39328a.I(compoundButton, z);
            }
        });
        androidx.core.view.c.r0(this.f41537k, new c());
        androidx.core.view.c.m0(this.f41537k, m80.a.i, "", new q80() { // from class: yp5
            @Override // defpackage.q80
            public final boolean a(View view, q80.a aVar) {
                return this.f40391a.J(view, aVar);
            }
        });
    }

    @Override // defpackage.if1, android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        this.m = false;
    }
}
