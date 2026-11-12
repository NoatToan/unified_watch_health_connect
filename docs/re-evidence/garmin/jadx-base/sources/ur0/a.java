package ur0;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.fragment.app.i;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fb1.c;
import java.text.NumberFormat;
import lo.o3;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t61.m;
import ty1.o;
import xg1.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lur0/a;", "Landroidx/fragment/app/i;", "Lxg1/s;", "", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i implements s<Double> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3218a f172319e = new C3218a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f172320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f172321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f172322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xg1.i<Double> f172323d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ur0/a$b", "Landroid/text/TextWatcher;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
            C3218a c3218a = a.f172319e;
            a aVar = a.this;
            aVar.v6(aVar.u6() >= 150);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }
    }

    @Override // xg1.s
    public final void X4(xg1.i<Double> iVar) {
        this.f172323d = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        vVar.getClass();
        show(vVar, "IntensityMinutesGoalDialog");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String strValueOf = String.valueOf(getArguments() != null ? requireArguments().getInt("arg.key.goal.intensity.minutes") : 150);
        int length = strValueOf.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length) {
            boolean z15 = p005kotlin.jvm.internal.s.h(strValueOf.charAt(!z14 ? i14 : length), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                }
                length--;
            } else if (z15) {
                i14++;
            } else {
                z14 = true;
            }
        }
        String string = strValueOf.subSequence(i14, length + 1).toString();
        View viewInflate = LayoutInflater.from(requireActivity()).inflate(R.layout.gcm3_intensity_minutes_goal_dialog, (ViewGroup) null);
        viewInflate.setTag(R.id.fragment_container_view_tag, a.class.getName());
        viewInflate.findViewById(R.id.set_default_goal).setOnClickListener(new m(this, 21));
        View viewFindViewById = viewInflate.findViewById(R.id.error_text);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f172322c = textView;
        textView.setText(getString(R.string.lbl_im_minimum_goal_error_message, NumberFormat.getInstance().format(150L)));
        View viewFindViewById2 = viewInflate.findViewById(R.id.intensity_minutes_goal_edit_text);
        viewFindViewById2.getClass();
        this.f172320a = (EditText) viewFindViewById2;
        if (p005kotlin.jvm.internal.s.g(string, "0") || string.length() == 0 || string.equals(getString(R.string.no_value))) {
            string = getString(R.string.no_value);
            string.getClass();
        }
        EditText editText = this.f172320a;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("mEditText");
            throw null;
        }
        editText.setText(string);
        if (!TextUtils.isEmpty(string)) {
            EditText editText2 = this.f172320a;
            if (editText2 == null) {
                p005kotlin.jvm.internal.s.m("mEditText");
                throw null;
            }
            editText2.setSelection(string.length());
        }
        EditText editText3 = this.f172320a;
        if (editText3 == null) {
            p005kotlin.jvm.internal.s.m("mEditText");
            throw null;
        }
        editText3.setFilters(new InputFilter[]{new o3(0, DateTimeConstants.MINUTES_PER_WEEK)});
        EditText editText4 = this.f172320a;
        if (editText4 == null) {
            p005kotlin.jvm.internal.s.m("mEditText");
            throw null;
        }
        editText4.requestFocus();
        EditText editText5 = this.f172320a;
        if (editText5 == null) {
            p005kotlin.jvm.internal.s.m("mEditText");
            throw null;
        }
        editText5.addTextChangedListener(new b());
        e eVarCreate = new e.a(requireActivity()).setView(viewInflate).setTitle(R.string.steps_step_goal_title).setCancelable(true).setPositiveButton(R.string.lbl_save, new sa2.b(this, 10)).setNegativeButton(R.string.lbl_cancel, new o(19)).create();
        eVarCreate.getClass();
        this.f172321b = eVarCreate;
        eVarCreate.setOnShowListener(new c22.e(this, 7));
        e eVar = this.f172321b;
        if (eVar == null) {
            p005kotlin.jvm.internal.s.m("mAlertDialog");
            throw null;
        }
        EditText editText6 = this.f172320a;
        if (editText6 == null) {
            p005kotlin.jvm.internal.s.m("mEditText");
            throw null;
        }
        q63.a.a(eVar, editText6);
        e eVar2 = this.f172321b;
        if (eVar2 != null) {
            return eVar2;
        }
        p005kotlin.jvm.internal.s.m("mAlertDialog");
        throw null;
    }

    public final int u6() {
        EditText editText = this.f172320a;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("mEditText");
            throw null;
        }
        String string = editText.getText().toString();
        if (string.length() == 0) {
            return -1;
        }
        try {
            int length = string.length() - 1;
            int i14 = 0;
            boolean z14 = false;
            while (i14 <= length) {
                boolean z15 = p005kotlin.jvm.internal.s.h(string.charAt(!z14 ? i14 : length), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length--;
                } else if (z15) {
                    i14++;
                } else {
                    z14 = true;
                }
            }
            Integer numValueOf = Integer.valueOf(string.subSequence(i14, length + 1).toString());
            numValueOf.getClass();
            return numValueOf.intValue();
        } catch (NumberFormatException e4) {
            String strN = c.n("Error parsing intensity minutes goal value: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "IntensityMinutesGoalDialog", strN);
            return -1;
        }
    }

    public final void v6(boolean z14) {
        e eVar = this.f172321b;
        if (z14) {
            if (eVar == null) {
                p005kotlin.jvm.internal.s.m("mAlertDialog");
                throw null;
            }
            eVar.e(-1).setEnabled(true);
            e eVar2 = this.f172321b;
            if (eVar2 == null) {
                p005kotlin.jvm.internal.s.m("mAlertDialog");
                throw null;
            }
            eVar2.e(-1).setClickable(true);
            TextView textView = this.f172322c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mErrorText");
                throw null;
            }
        }
        if (eVar == null) {
            p005kotlin.jvm.internal.s.m("mAlertDialog");
            throw null;
        }
        eVar.e(-1).setEnabled(false);
        e eVar3 = this.f172321b;
        if (eVar3 == null) {
            p005kotlin.jvm.internal.s.m("mAlertDialog");
            throw null;
        }
        eVar3.e(-1).setClickable(false);
        TextView textView2 = this.f172322c;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            p005kotlin.jvm.internal.s.m("mErrorText");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ur0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lur0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARG_KEY_GOAL_INTENSITY_MINUTES", "", "INPUT_MIN_VALUE", "I", "NO_VALUE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3218a {
        public /* synthetic */ C3218a(j jVar) {
            this();
        }

        private C3218a() {
        }
    }
}
