package rv;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import c22.t0;
import c22.y3;
import c32.f;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import dv.l;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrv/b;", "Lrv/a;", "Landroid/view/View$OnClickListener;", "Ldv/l;", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends rv.a implements View.OnClickListener, l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f154590r = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f154591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f154592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f154593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f154594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f154595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<EditText> f154596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f154597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f154598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f154599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f154600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f154601o = new f(this, 11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f154602p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2930b f154603q = new C2930b();

    /* JADX INFO: renamed from: rv.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rv/b$b", "Lc22/t0;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2930b extends t0 {
        public C2930b() {
        }

        @Override // c22.t0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            new Handler().postDelayed(new rv.c(editable, b.this, 0), 10L);
        }

        @Override // c22.t0, android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            if (charSequence == null || charSequence.length() == 0 || Integer.parseInt(charSequence.toString()) != 0) {
                return;
            }
            b bVar = b.this;
            ArrayList<EditText> arrayList = bVar.f154596j;
            if (arrayList != null) {
                arrayList.get(bVar.f154600n).setText("");
            } else {
                s.m("valueBoxes");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rv/b$c", "Landroid/view/View$OnTouchListener;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f154605a;

        public c(View view2) {
            this.f154605a = view2;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view2, MotionEvent motionEvent) {
            view2.getClass();
            motionEvent.getClass();
            y3.a(this.f154605a);
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rv/b$d", "Lc22/t0;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends t0 {
        public d() {
        }

        @Override // c22.t0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            new Handler().postDelayed(new rv.c(editable, b.this, 1), 10L);
        }
    }

    public static final void C6(b bVar) {
        int i14 = bVar.f154600n + 1;
        ArrayList<EditText> arrayList = bVar.f154596j;
        if (arrayList == null) {
            s.m("valueBoxes");
            throw null;
        }
        if (i14 < arrayList.size()) {
            ArrayList<EditText> arrayList2 = bVar.f154596j;
            if (arrayList2 == null) {
                s.m("valueBoxes");
                throw null;
            }
            arrayList2.get(i14).requestFocus();
        }
        ArrayList<EditText> arrayList3 = bVar.f154596j;
        if (arrayList3 == null) {
            s.m("valueBoxes");
            throw null;
        }
        Iterator<EditText> it = arrayList3.iterator();
        it.getClass();
        while (it.hasNext()) {
            EditText next = it.next();
            next.getClass();
            Editable text = next.getText();
            text.getClass();
            if (text.length() == 0) {
                Button button = bVar.f154593g;
                if (button != null) {
                    button.setEnabled(false);
                    return;
                } else {
                    s.m("nextButton");
                    throw null;
                }
            }
        }
        bVar.E6();
        TextView textView = bVar.f154592f;
        if (textView == null) {
            s.m("circumferenceTextView");
            throw null;
        }
        textView.setText(bVar.getString(R.string.lbl_circumference_equals, String.valueOf(bVar.f154598l)));
        Button button2 = bVar.f154593g;
        if (button2 != null) {
            button2.setEnabled(true);
        } else {
            s.m("nextButton");
            throw null;
        }
    }

    public static void F6(View view2) {
        if (!(view2 instanceof EditText)) {
            view2.setOnTouchListener(new c(view2));
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = viewGroup.getChildAt(i14);
                childAt.getClass();
                F6(childAt);
            }
        }
    }

    public final void E6() {
        ArrayList<EditText> arrayList = this.f154596j;
        if (arrayList == null) {
            s.m("valueBoxes");
            throw null;
        }
        int i14 = Integer.parseInt(arrayList.get(0).getText().toString());
        ArrayList<EditText> arrayList2 = this.f154596j;
        if (arrayList2 == null) {
            s.m("valueBoxes");
            throw null;
        }
        this.f154599m = (i14 * 10) + Integer.parseInt(arrayList2.get(1).getText().toString());
        ArrayList<EditText> arrayList3 = this.f154596j;
        if (arrayList3 == null) {
            s.m("valueBoxes");
            throw null;
        }
        int i15 = Integer.parseInt(arrayList3.get(2).getText().toString());
        ArrayList<EditText> arrayList4 = this.f154596j;
        if (arrayList4 == null) {
            s.m("valueBoxes");
            throw null;
        }
        int i16 = Integer.parseInt(arrayList4.get(3).getText().toString());
        ArrayList<EditText> arrayList5 = this.f154596j;
        if (arrayList5 == null) {
            s.m("valueBoxes");
            throw null;
        }
        int iD = fb1.c.d(i16, 10, i15 * 100, Integer.parseInt(arrayList5.get(4).getText().toString()));
        int i17 = this.f154599m;
        if (i17 <= 0 || iD <= 0) {
            return;
        }
        this.f154598l = (int) (((double) ((i17 * 2) + iD)) * 3.141592653589793d);
    }

    @Override // dv.l
    public final View R() {
        return requireView().findViewById(R.id.circumference_image_view);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        view2.getClass();
        if (view2.getId() == R.id.btn_next) {
            A6(new q2(this, 12));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f154597k = arguments.getBoolean("EXTRA_IS_BIC_FLOW");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm3_bic_tell_us_more_estimate_circumference, viewGroup, false);
    }

    @Override // rv.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f154597k) {
            u6(getString(R.string.lbl_startup_wheel_circumference_question));
        } else {
            u6(getString(R.string.lbl_tire_circumference));
        }
        d3 d3Var = this.f61319a;
        if (d3Var != null) {
            d3Var.focusTitle();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.circumference_image_view);
        viewFindViewById.getClass();
        this.f154591e = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.information_label);
        viewFindViewById2.getClass();
        this.f154594h = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.circumference_input);
        viewFindViewById3.getClass();
        View viewFindViewById4 = view2.findViewById(R.id.circumference_label);
        viewFindViewById4.getClass();
        this.f154592f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.btn_next);
        viewFindViewById5.getClass();
        this.f154593g = (Button) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.x_label);
        viewFindViewById6.getClass();
        this.f154595i = (TextView) viewFindViewById6;
        EditText editText = (EditText) view2.findViewById(R.id.value1_cell1);
        EditText editText2 = (EditText) view2.findViewById(R.id.value1_cell2);
        EditText editText3 = (EditText) view2.findViewById(R.id.value2_cell1);
        EditText editText4 = (EditText) view2.findViewById(R.id.value2_cell2);
        EditText editText5 = (EditText) view2.findViewById(R.id.value2_cell3);
        C2930b c2930b = this.f154603q;
        editText.addTextChangedListener(c2930b);
        d dVar = this.f154602p;
        editText2.addTextChangedListener(dVar);
        editText3.addTextChangedListener(c2930b);
        editText4.addTextChangedListener(dVar);
        editText5.addTextChangedListener(dVar);
        f fVar = this.f154601o;
        editText.setOnFocusChangeListener(fVar);
        editText2.setOnFocusChangeListener(fVar);
        editText3.setOnFocusChangeListener(fVar);
        editText4.setOnFocusChangeListener(fVar);
        editText5.setOnFocusChangeListener(fVar);
        ArrayList<EditText> arrayList = new ArrayList<>(5);
        this.f154596j = arrayList;
        arrayList.add(editText);
        ArrayList<EditText> arrayList2 = this.f154596j;
        if (arrayList2 == null) {
            s.m("valueBoxes");
            throw null;
        }
        arrayList2.add(editText2);
        ArrayList<EditText> arrayList3 = this.f154596j;
        if (arrayList3 == null) {
            s.m("valueBoxes");
            throw null;
        }
        arrayList3.add(editText3);
        ArrayList<EditText> arrayList4 = this.f154596j;
        if (arrayList4 == null) {
            s.m("valueBoxes");
            throw null;
        }
        arrayList4.add(editText4);
        ArrayList<EditText> arrayList5 = this.f154596j;
        if (arrayList5 == null) {
            s.m("valueBoxes");
            throw null;
        }
        arrayList5.add(editText5);
        ArrayList<EditText> arrayList6 = this.f154596j;
        if (arrayList6 == null) {
            s.m("valueBoxes");
            throw null;
        }
        editText.setTag(Integer.valueOf(arrayList6.indexOf(editText)));
        ArrayList<EditText> arrayList7 = this.f154596j;
        if (arrayList7 == null) {
            s.m("valueBoxes");
            throw null;
        }
        editText2.setTag(Integer.valueOf(arrayList7.indexOf(editText2)));
        ArrayList<EditText> arrayList8 = this.f154596j;
        if (arrayList8 == null) {
            s.m("valueBoxes");
            throw null;
        }
        editText3.setTag(Integer.valueOf(arrayList8.indexOf(editText3)));
        ArrayList<EditText> arrayList9 = this.f154596j;
        if (arrayList9 == null) {
            s.m("valueBoxes");
            throw null;
        }
        editText4.setTag(Integer.valueOf(arrayList9.indexOf(editText4)));
        ArrayList<EditText> arrayList10 = this.f154596j;
        if (arrayList10 == null) {
            s.m("valueBoxes");
            throw null;
        }
        editText5.setTag(Integer.valueOf(arrayList10.indexOf(editText5)));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (c22.b.a(contextRequireContext) >= 1.5f) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            Resources resources = getResources();
            resources.getClass();
            int iC = (int) c22.b.c(contextRequireContext2, xy2.b.n(resources, 30.0f), 1.5f);
            ArrayList<EditText> arrayList11 = this.f154596j;
            if (arrayList11 == null) {
                s.m("valueBoxes");
                throw null;
            }
            for (EditText editText6 : arrayList11) {
                editText6.getLayoutParams().height = iC;
                editText6.getLayoutParams().width = iC;
            }
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            Resources resources2 = getResources();
            resources2.getClass();
            int iC2 = (int) c22.b.c(contextRequireContext3, xy2.b.n(resources2, 40.0f), 1.5f);
            TextView textView = this.f154595i;
            if (textView == null) {
                s.m("xLabelTextView");
                throw null;
            }
            textView.getLayoutParams().width = iC2;
            TextView textView2 = this.f154595i;
            if (textView2 == null) {
                s.m("xLabelTextView");
                throw null;
            }
            textView2.getLayoutParams().height = iC2;
        }
        F6(view2);
        E6();
        TextView textView3 = this.f154592f;
        if (textView3 == null) {
            s.m("circumferenceTextView");
            throw null;
        }
        textView3.setText(getString(R.string.lbl_circumference_equals, String.valueOf(this.f154598l)));
        boolean z14 = this.f154597k;
        Button button = this.f154593g;
        if (z14) {
            if (button != null) {
                button.setOnClickListener(this);
                return;
            } else {
                s.m("nextButton");
                throw null;
            }
        }
        if (button == null) {
            s.m("nextButton");
            throw null;
        }
        button.setVisibility(8);
        TextView textView4 = this.f154595i;
        if (textView4 == null) {
            s.m("xLabelTextView");
            throw null;
        }
        textView4.setTextColor(a7.b.getColor(view2.getContext(), R.color.gcm_text_primary));
        TextView textView5 = this.f154592f;
        if (textView5 == null) {
            s.m("circumferenceTextView");
            throw null;
        }
        textView5.setTextColor(a7.b.getColor(view2.getContext(), R.color.gcm_text_primary));
        ArrayList<EditText> arrayList12 = this.f154596j;
        if (arrayList12 == null) {
            s.m("valueBoxes");
            throw null;
        }
        Iterator<EditText> it = arrayList12.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(a7.b.getColor(view2.getContext(), R.color.gcm_text_primary));
        }
        TextView textView6 = this.f154594h;
        if (textView6 == null) {
            s.m("informationLabel");
            throw null;
        }
        textView6.setTextColor(a7.b.getColor(view2.getContext(), R.color.gcm_text_primary));
    }

    @Override // rv.a
    public final ImageView v6() {
        ImageView imageView = this.f154591e;
        if (imageView != null) {
            return imageView;
        }
        s.m("mainImage");
        throw null;
    }

    @Override // rv.a
    public final int[] y6() {
        return new int[]{0, 2};
    }

    @Override // rv.a
    public final int[] z6() {
        return new int[]{1, 3};
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lrv/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DELAY_MILLIS", "I", "EXTRA_IS_BIC_FLOW", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
