package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.k;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.ayq;
import defpackage.dwh;
import defpackage.e8f;
import defpackage.fpi;
import defpackage.h2j;
import defpackage.iqi;
import defpackage.j8f;
import defpackage.k3j;
import defpackage.kwi;
import defpackage.l8f;
import defpackage.o7h;
import defpackage.of1;
import defpackage.pii;
import defpackage.pmi;
import defpackage.qbd;
import defpackage.r08;
import defpackage.r9h;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    public static final Object w = "CONFIRM_BUTTON_TAG";
    public static final Object x = "CANCEL_BUTTON_TAG";
    public static final Object y = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<j8f<? super S>> f8663a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f8664b = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> c = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> d = new LinkedHashSet<>();
    public int e;
    public DateSelector<S> f;
    public dwh<S> g;
    public CalendarConstraints h;
    public MaterialCalendar<S> i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f8665k;
    public boolean l;
    public int m;
    public int n;
    public CharSequence o;
    public int p;
    public CharSequence q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f8666r;
    public CheckableImageButton s;
    public l8f t;
    public Button u;
    public boolean v;

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f8663a.iterator();
            while (it.hasNext()) {
                ((j8f) it.next()).a(MaterialDatePicker.this.F());
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f8664b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    public class c implements o7h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f8670b;
        public final /* synthetic */ int c;

        public c(int i, View view, int i2) {
            this.f8669a = i;
            this.f8670b = view;
            this.c = i2;
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            int i = windowInsetsCompat.f(WindowInsetsCompat.m.h()).f32379b;
            if (this.f8669a >= 0) {
                this.f8670b.getLayoutParams().height = this.f8669a + i;
                View view2 = this.f8670b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f8670b;
            view3.setPadding(view3.getPaddingLeft(), this.c + i, this.f8670b.getPaddingRight(), this.f8670b.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    public class d extends r9h<S> {
        public d() {
        }

        @Override // defpackage.r9h
        public void a() {
            MaterialDatePicker.this.u.setEnabled(false);
        }

        @Override // defpackage.r9h
        public void b(S s) {
            MaterialDatePicker.this.M();
            MaterialDatePicker.this.u.setEnabled(MaterialDatePicker.this.C().J());
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialDatePicker.this.u.setEnabled(MaterialDatePicker.this.C().J());
            MaterialDatePicker.this.s.toggle();
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.N(materialDatePicker.s);
            MaterialDatePicker.this.L();
        }
    }

    public static Drawable A(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, of1.b(context, fpi.f18064b));
        stateListDrawable.addState(new int[0], of1.b(context, fpi.c));
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector<S> C() {
        if (this.f == null) {
            this.f = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f;
    }

    public static int E(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(pmi.W);
        int i = Month.e().d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(pmi.Y) * i) + ((i - 1) * resources.getDimensionPixelOffset(pmi.c0));
    }

    public static boolean I(Context context) {
        return K(context, R.attr.windowFullscreen);
    }

    public static boolean J(Context context) {
        return K(context, pii.R);
    }

    public static boolean K(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(e8f.d(context, pii.F, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public final void B(Window window) {
        if (this.v) {
            return;
        }
        View viewFindViewById = requireView().findViewById(iqi.h);
        r08.a(window, true, ayq.e(viewFindViewById), null);
        androidx.core.view.c.H0(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.v = true;
    }

    public String D() {
        return C().g0(getContext());
    }

    public final S F() {
        return C().M();
    }

    public final int G(Context context) {
        int i = this.e;
        return i != 0 ? i : C().b(context);
    }

    public final void H(Context context) {
        this.s.setTag(y);
        this.s.setImageDrawable(A(context));
        this.s.setChecked(this.m != 0);
        androidx.core.view.c.r0(this.s, null);
        N(this.s);
        this.s.setOnClickListener(new e());
    }

    public final void L() {
        int iG = G(requireContext());
        this.i = MaterialCalendar.J(C(), iG, this.h);
        this.g = this.s.isChecked() ? MaterialTextInputPicker.u(C(), iG, this.h) : this.i;
        M();
        k kVarO = getChildFragmentManager().o();
        kVarO.w(iqi.I, this.g);
        kVarO.n();
        this.g.s(new d());
    }

    public final void M() {
        String strD = D();
        this.f8666r.setContentDescription(String.format(getString(h2j.w), strD));
        this.f8666r.setText(strD);
    }

    public final void N(CheckableImageButton checkableImageButton) {
        this.s.setContentDescription(this.s.isChecked() ? checkableImageButton.getContext().getString(h2j.N) : checkableImageButton.getContext().getString(h2j.P));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.h = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.j = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f8665k = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.m = bundle.getInt("INPUT_MODE_KEY");
        this.n = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.o = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.p = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.q = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), G(requireContext()));
        Context context = dialog.getContext();
        this.l = I(context);
        int iD = e8f.d(context, pii.s, MaterialDatePicker.class.getCanonicalName());
        l8f l8fVar = new l8f(context, null, pii.F, k3j.E);
        this.t = l8fVar;
        l8fVar.Q(context);
        this.t.b0(ColorStateList.valueOf(iD));
        this.t.a0(androidx.core.view.c.v(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.l ? kwi.G : kwi.F, viewGroup);
        Context context = viewInflate.getContext();
        if (this.l) {
            viewInflate.findViewById(iqi.I).setLayoutParams(new LinearLayout.LayoutParams(E(context), -2));
        } else {
            viewInflate.findViewById(iqi.J).setLayoutParams(new LinearLayout.LayoutParams(E(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(iqi.P);
        this.f8666r = textView;
        androidx.core.view.c.t0(textView, 1);
        this.s = (CheckableImageButton) viewInflate.findViewById(iqi.Q);
        TextView textView2 = (TextView) viewInflate.findViewById(iqi.U);
        CharSequence charSequence = this.f8665k;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.j);
        }
        H(context);
        this.u = (Button) viewInflate.findViewById(iqi.c);
        if (C().J()) {
            this.u.setEnabled(true);
        } else {
            this.u.setEnabled(false);
        }
        this.u.setTag(w);
        CharSequence charSequence2 = this.o;
        if (charSequence2 != null) {
            this.u.setText(charSequence2);
        } else {
            int i = this.n;
            if (i != 0) {
                this.u.setText(i);
            }
        }
        this.u.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(iqi.f21994a);
        button.setTag(x);
        CharSequence charSequence3 = this.q;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.p;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.h);
        if (this.i.F() != null) {
            bVar.b(this.i.F().f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.j);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f8665k);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.n);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.o);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.p);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.q);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.l) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.t);
            B(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(pmi.a0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.t, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new qbd(requireDialog(), rect));
        }
        L();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.g.t();
        super.onStop();
    }
}
