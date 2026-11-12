package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import defpackage.dti;
import defpackage.eii;
import defpackage.g7i;
import defpackage.m80;
import defpackage.n5j;
import defpackage.zq5;
import miuix.pickerwidget.date.Calendar;
import miuix.pickerwidget.widget.DateTimePicker;
import miuix.slidingwidget.widget.SlidingButton;

/* JADX INFO: loaded from: classes3.dex */
public class StretchablePickerPreference extends StretchableWidgetPreference {
    public Calendar o;
    public DateTimePicker.c p;
    public Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26858r;
    public boolean s;
    public CharSequence t;
    public int u;
    public long v;

    public class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SlidingButton f26859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f26860b;

        public a(SlidingButton slidingButton, TextView textView) {
            this.f26859a = slidingButton;
            this.f26860b = textView;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(true);
            m80Var.i0(Switch.class.getName());
            m80Var.h0(this.f26859a.isChecked());
            m80Var.m0(this.f26860b.getText());
        }
    }

    public class b implements DateTimePicker.d {
        public b() {
        }

        @Override // miuix.pickerwidget.widget.DateTimePicker.d
        public void e(DateTimePicker dateTimePicker, long j) {
            StretchablePickerPreference.this.o.setTimeInMillis(j);
            StretchablePickerPreference stretchablePickerPreference = StretchablePickerPreference.this;
            stretchablePickerPreference.N(stretchablePickerPreference.s, j);
            StretchablePickerPreference.this.v = j;
            StretchablePickerPreference.B(StretchablePickerPreference.this);
            StretchablePickerPreference.this.notifyChanged();
        }
    }

    public class c implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DateTimePicker f26862a;

        public c(DateTimePicker dateTimePicker) {
            this.f26862a = dateTimePicker;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            StretchablePickerPreference.this.K(this.f26862a, z);
        }
    }

    public interface d {
    }

    public StretchablePickerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Calendar calendar = new Calendar();
        this.o = calendar;
        this.v = calendar.getTimeInMillis();
        this.q = context;
        this.p = new DateTimePicker.c(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.m2, i, 0);
        this.f26858r = typedArrayObtainStyledAttributes.getBoolean(n5j.n2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ d B(StretchablePickerPreference stretchablePickerPreference) {
        stretchablePickerPreference.getClass();
        return null;
    }

    public final void E(SlidingButton slidingButton, DateTimePicker dateTimePicker) {
        slidingButton.setOnPerformCheckedChangeListener(new c(dateTimePicker));
    }

    public final String F(long j, Context context) {
        return this.p.a(this.o.get(1), this.o.get(5), this.o.get(9)) + " " + zq5.a(context, j, 12);
    }

    public final String G(long j) {
        return zq5.a(this.q, j, 908);
    }

    public final CharSequence H() {
        return this.t;
    }

    public final int I() {
        return this.u;
    }

    public final /* synthetic */ void J(SlidingButton slidingButton, DateTimePicker dateTimePicker, View view) {
        boolean z = !slidingButton.isChecked();
        slidingButton.setChecked(z);
        K(dateTimePicker, z);
    }

    public final void K(DateTimePicker dateTimePicker, boolean z) {
        dateTimePicker.setLunarMode(z);
        N(z, dateTimePicker.getTimeInMillis());
        this.s = z;
    }

    public void L(long j) {
        r(F(j, this.q));
    }

    public final void M(long j) {
        r(G(j));
    }

    public final void N(boolean z, long j) {
        if (z) {
            L(j);
        } else {
            M(j);
        }
    }

    public final void O(DateTimePicker dateTimePicker) {
        dateTimePicker.setOnTimeChangedListener(new b());
    }

    @Override // miuix.preference.StretchableWidgetPreference, miuix.preference.BasePreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        boolean z;
        View view = g7iVar.itemView;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(dti.i);
        final DateTimePicker dateTimePicker = (DateTimePicker) view.findViewById(dti.f);
        final SlidingButton slidingButton = (SlidingButton) view.findViewById(dti.h);
        TextView textView = (TextView) view.findViewById(dti.j);
        if (!this.f26858r) {
            frameLayout.setVisibility(8);
        } else if (textView != null) {
            CharSequence charSequenceH = H();
            if (TextUtils.isEmpty(charSequenceH)) {
                z = false;
            } else {
                textView.setText(charSequenceH);
                z = true;
            }
            frameLayout.setFocusable(z);
            slidingButton.setFocusable(!z);
            if (z) {
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: clo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f5466a.J(slidingButton, dateTimePicker, view2);
                    }
                });
                if (b()) {
                    textView.setImportantForAccessibility(2);
                    slidingButton.setImportantForAccessibility(2);
                    androidx.core.view.c.r0(frameLayout, new a(slidingButton, textView));
                }
            } else {
                frameLayout.setOnClickListener(null);
            }
        }
        dateTimePicker.setMinuteInterval(I());
        this.v = dateTimePicker.getTimeInMillis();
        super.onBindViewHolder(g7iVar);
        E(slidingButton, dateTimePicker);
        N(this.s, dateTimePicker.getTimeInMillis());
        O(dateTimePicker);
    }

    public void setSlidingListener(d dVar) {
    }

    public StretchablePickerPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.C);
    }
}
