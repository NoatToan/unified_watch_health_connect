package aq;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.NumberFormat;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import org.json.JSONObject;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class t1 {
    public static final void a(TextView textView, Double d14, final androidx.fragment.app.v vVar, final e2 e2Var, final e23.l lVar) {
        String string;
        textView.getClass();
        vVar.getClass();
        final double dRint = Math.rint(d14 != null ? d14.doubleValue() : 0.0d);
        if (dRint > 0.0d) {
            c22.l3.f23124b.getClass();
            string = c22.l3.a.e1((long) dRint);
        } else {
            string = textView.getContext().getString(R.string.no_duration_value);
        }
        textView.setText(string);
        textView.setOnClickListener(new View.OnClickListener() { // from class: aq.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e23.a aVar = e2Var;
                if (aVar != null) {
                    aVar.invoke();
                }
                r22.f0 f0VarB = r22.f0.a.b(r22.f0.U0, (int) dRint, 23, 24);
                f0VarB.T = new s1(lVar, 0);
                f0VarB.show(vVar, (String) null);
            }
        });
    }

    public static final void b(TextView textView, String str, String str2, int i14, e23.a<Unit> aVar) {
        textView.getClass();
        Resources resources = textView.getContext().getResources();
        if (str == null || str.length() == 0) {
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            textView.setTextColor(resources.getColor(i14, null));
        } else {
            ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
            textView.setTextColor(resources.getColor(R.color.gcm_text_primary, null));
        }
        textView.setAutoSizeTextTypeWithDefaults(0);
        resources.getClass();
        textView.setTextSize(0, TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics()));
        if (str == null) {
            str = str2;
        }
        textView.setText(str);
        textView.post(new ab.j(13, textView, resources));
        textView.setOnClickListener(new q1(aVar, 0));
    }

    public static final void d(EditText editText, final Long l14, final e2 e2Var, final e23.l lVar) {
        editText.getClass();
        final String string = editText.getContext().getString(R.string.no_value);
        string.getClass();
        editText.setText((l14 == null || l14.equals(JSONObject.NULL) || l14.longValue() < 0) ? string : String.valueOf(l14.longValue()));
        editText.setOnEditorActionListener(new o1(editText, 1));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: aq.r1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z14) {
                view2.getClass();
                EditText editText2 = (EditText) view2;
                if (!z14) {
                    String string2 = editText2.getText().toString();
                    if (p005kotlin.jvm.internal.s.g(d53.t.j(string2), l14)) {
                        return;
                    }
                    lVar.invoke(d53.t.j(string2));
                    return;
                }
                if (p005kotlin.jvm.internal.s.g(editText2.getText().toString(), string)) {
                    editText2.setText((CharSequence) null);
                }
                Editable text = editText2.getText();
                editText2.setSelection(0, text != null ? text.length() : 0);
                e23.a aVar = e2Var;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
    }

    public static final void e(EditText editText, Long l14, com.garmin.android.apps.connectmobile.repcounting.model.d dVar, final com.garmin.android.apps.connectmobile.repcounting.model.d dVar2, final e2 e2Var, final e23.p pVar) {
        editText.getClass();
        Double dValueOf = (l14 == null || ((double) l14.longValue()) < 0.0d) ? null : Double.valueOf(ss.f.a(l14));
        final boolean z14 = dVar != null && dVar.f41105d;
        editText.setEnabled((dVar2 == null && z14) ? false : true);
        editText.setFilters(new q3[]{new q3()});
        editText.setKeyListener(DigitsKeyListener.getInstance("0123456789" + DecimalFormatSymbols.getInstance().getDecimalSeparator()));
        Context context = editText.getContext();
        context.getClass();
        editText.setText(ss.f.e(context, Double.valueOf(ss.f.f(dValueOf != null ? dValueOf.doubleValue() : 0.0d)), z14, true));
        editText.setOnEditorActionListener(new o1(editText, 0));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: aq.p1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z15) {
                Double dValueOf2;
                long jC;
                view2.getClass();
                EditText editText2 = (EditText) view2;
                Editable text = editText2.getText();
                if (text != null) {
                    com.garmin.android.apps.connectmobile.repcounting.model.d dVar3 = null;
                    try {
                        dValueOf2 = Double.valueOf(NumberFormat.getInstance().parse(text.toString()).doubleValue());
                    } catch (Exception unused) {
                        dValueOf2 = null;
                    }
                    if (z15) {
                        if (dValueOf2 == null && g22.n.d(text.toString())) {
                            editText2.setText((CharSequence) null);
                        } else {
                            Editable text2 = editText2.getText();
                            editText2.setSelection(0, text2 != null ? text2.length() : 0);
                        }
                        e23.a aVar = e2Var;
                        if (aVar != null) {
                            aVar.invoke();
                            return;
                        }
                        return;
                    }
                    boolean z16 = z14;
                    com.garmin.android.apps.connectmobile.repcounting.model.d dVar4 = dVar2;
                    if (dValueOf2 == null || p005kotlin.jvm.internal.s.c(dValueOf2, 0.0d)) {
                        jC = -1;
                        if (!z16) {
                            if (dVar4 != null) {
                                dVar3 = dVar4;
                            } else {
                                jC = -2;
                            }
                        }
                    } else {
                        dVar3 = z16 ? dVar4 : null;
                        jC = ss.f.c(dValueOf2.doubleValue());
                    }
                    if (dVar3 != null) {
                        z16 = dVar3.f41105d;
                    }
                    Context context2 = editText2.getContext();
                    context2.getClass();
                    editText2.setText(ss.f.e(context2, Double.valueOf(ss.f.f(dValueOf2 != null ? dValueOf2.doubleValue() : 0.0d)), z16, true));
                    pVar.invoke(Long.valueOf(jC), dVar3);
                }
            }
        });
    }
}
