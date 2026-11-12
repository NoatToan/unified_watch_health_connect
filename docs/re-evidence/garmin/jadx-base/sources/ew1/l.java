package ew1;

import android.content.Context;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import c22.y3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.pickers.ExerciseWeightPickerActivity;
import com.garmin.android.apps.connectmobile.events.components.GCMEditTextTrainingInitiative;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.ComplexEditText;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f66561c;

    public /* synthetic */ l(int i14, Object obj, Object obj2) {
        this.f66559a = i14;
        this.f66560b = obj;
        this.f66561c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view2, boolean z14) {
        int i14 = this.f66559a;
        int i15 = 0;
        Object obj = this.f66561c;
        Object obj2 = this.f66560b;
        switch (i14) {
            case 0:
                n nVar = (n) obj;
                n.a aVar = n.C;
                Context context = ((MultiLineImeEditText) obj2).getContext();
                Object systemService = context != null ? context.getSystemService("input_method") : null;
                systemService.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative = nVar.f66593e;
                if (!z14) {
                    if (gCMEditTextTrainingInitiative != null) {
                        inputMethodManager.hideSoftInputFromWindow(gCMEditTextTrainingInitiative.getWindowToken(), 0);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                        throw null;
                    }
                }
                if (gCMEditTextTrainingInitiative == null) {
                    p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                    throw null;
                }
                MultiLineImeEditText editText = gCMEditTextTrainingInitiative.getF34926b();
                GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative2 = nVar.f66593e;
                if (gCMEditTextTrainingInitiative2 == null) {
                    p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                    throw null;
                }
                Editable text = gCMEditTextTrainingInitiative2.getF34926b().getText();
                editText.setSelection(text != null ? text.length() : 0);
                GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative3 = nVar.f66593e;
                if (gCMEditTextTrainingInitiative3 != null) {
                    inputMethodManager.showSoftInput(gCMEditTextTrainingInitiative3.getF34926b(), 0);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                    throw null;
                }
            case 1:
                fv1.c cVar = (fv1.c) obj;
                fv1.c.a aVar2 = fv1.c.f73671x;
                Context context2 = ((MultiLineImeEditText) obj2).getContext();
                Object systemService2 = context2 != null ? context2.getSystemService("input_method") : null;
                systemService2.getClass();
                InputMethodManager inputMethodManager2 = (InputMethodManager) systemService2;
                GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative4 = cVar.f73676d;
                if (!z14) {
                    if (gCMEditTextTrainingInitiative4 != null) {
                        inputMethodManager2.hideSoftInputFromWindow(gCMEditTextTrainingInitiative4.getWindowToken(), 0);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                        throw null;
                    }
                }
                if (gCMEditTextTrainingInitiative4 == null) {
                    p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                    throw null;
                }
                MultiLineImeEditText editText2 = gCMEditTextTrainingInitiative4.getF34926b();
                GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative5 = cVar.f73676d;
                if (gCMEditTextTrainingInitiative5 == null) {
                    p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                    throw null;
                }
                Editable text2 = gCMEditTextTrainingInitiative5.getF34926b().getText();
                editText2.setSelection(text2 != null ? text2.length() : 0);
                GCMEditTextTrainingInitiative gCMEditTextTrainingInitiative6 = cVar.f73676d;
                if (gCMEditTextTrainingInitiative6 != null) {
                    inputMethodManager2.showSoftInput(gCMEditTextTrainingInitiative6.getF34926b(), 0);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("goalDistanceEditText");
                    throw null;
                }
            case 2:
                ComplexEditText complexEditText = (ComplexEditText) obj2;
                e23.p pVar = (e23.p) obj;
                EditText editText3 = complexEditText.editText;
                if (z14) {
                    editText3.setBackground(complexEditText.getResources().getDrawable(R.drawable.gcm_edit_text_selected, null));
                } else {
                    editText3.setBackground(complexEditText.getResources().getDrawable(R.drawable.gcm_edit_text_unselected, null));
                }
                complexEditText.j();
                view2.getClass();
                pVar.invoke(view2, Boolean.valueOf(z14));
                return;
            case 3:
                com.garmin.android.apps.connectmobile.activities.stats.exercises.a aVar3 = (com.garmin.android.apps.connectmobile.activities.stats.exercises.a) obj2;
                MenuItem menuItem = (MenuItem) obj;
                com.garmin.android.apps.connectmobile.activities.stats.exercises.a.C0457a c0457a = com.garmin.android.apps.connectmobile.activities.stats.exercises.a.f29847i;
                if (z14 || !d53.w.J(aVar3.u6().f29886c)) {
                    return;
                }
                menuItem.collapseActionView();
                return;
            case 4:
                ExerciseWeightPickerActivity exerciseWeightPickerActivity = (ExerciseWeightPickerActivity) obj2;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) obj;
                ExerciseWeightPickerActivity.a aVar4 = ExerciseWeightPickerActivity.f29943f;
                boolean z15 = exerciseWeightPickerActivity.ca().getText().toString().length() > 0;
                exerciseWeightPickerActivity.ca().setHint((!z14 || exerciseWeightPickerActivity.fa(cVar2)) ? exerciseWeightPickerActivity.getString(R.string.strength_training_body) : "");
                TextView textViewDa = exerciseWeightPickerActivity.da();
                if ((!z14 || !z15) && exerciseWeightPickerActivity.fa(cVar2)) {
                    i15 = 8;
                }
                textViewDa.setVisibility(i15);
                return;
            default:
                rw.g gVar = (rw.g) obj2;
                TextView textView = gVar.f154808v;
                TextView textView2 = gVar.f154807u;
                EditText editText4 = gVar.f154809w;
                pw.a aVar5 = (pw.a) obj;
                view2.getClass();
                if (z14) {
                    y3.b(editText4);
                    view2.setSelected(true);
                    v22.e.q(textView2);
                    v22.e.q(textView);
                    textView2.setText(gVar.f154787a.f199875a.a(R.string.string_slash_string_pattern, String.valueOf(editText4.getText().length()), "300"));
                    gVar.f154810x.postDelayed(new po.g(gVar, 17), 200L);
                    return;
                }
                view2.setSelected(false);
                y3.a(view2);
                gVar.f154793g.invoke(editText4.getText().toString());
                if (aVar5 != null) {
                    aVar5.r(editText4.getText().toString());
                }
                v22.e.j(textView2);
                v22.e.j(textView);
                Editable text3 = editText4.getText();
                text3.getClass();
                if (text3.length() == 0) {
                    v22.e.q(gVar.f154805s);
                    v22.e.j(gVar.f154806t);
                    return;
                }
                return;
        }
    }
}
