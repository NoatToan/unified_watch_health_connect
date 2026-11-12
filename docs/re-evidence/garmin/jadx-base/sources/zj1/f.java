package zj1;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.w1;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c f204926b;

    public /* synthetic */ f(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c cVar, int i14) {
        this.f204925a = i14;
        this.f204926b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f204925a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c cVar = this.f204926b;
        switch (i14) {
            case 0:
                View view3 = cVar.f43898c;
                if (view3 == null) {
                    s.m("addNotesOption");
                    throw null;
                }
                view3.setVisibility(8);
                View view4 = cVar.f43899d;
                if (view4 == null) {
                    s.m("displayNotesLayout");
                    throw null;
                }
                view4.setVisibility(0);
                View view5 = cVar.f43903h;
                if (view5 == null) {
                    s.m("notesTextClearButton");
                    throw null;
                }
                view5.setVisibility(0);
                MultiLineImeEditText multiLineImeEditText = cVar.f43901f;
                if (multiLineImeEditText == null) {
                    s.m("notesEditText");
                    throw null;
                }
                multiLineImeEditText.requestFocus();
                Object systemService = cVar.requireContext().getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    MultiLineImeEditText multiLineImeEditText2 = cVar.f43901f;
                    if (multiLineImeEditText2 != null) {
                        inputMethodManager.showSoftInput(multiLineImeEditText2, 0);
                        return;
                    } else {
                        s.m("notesEditText");
                        throw null;
                    }
                }
                return;
            case 1:
                MultiLineImeEditText multiLineImeEditText3 = cVar.f43901f;
                if (multiLineImeEditText3 != null) {
                    multiLineImeEditText3.setText(Editable.Factory.getInstance().newEditable(""));
                    return;
                } else {
                    s.m("notesEditText");
                    throw null;
                }
            case 2:
                View view6 = cVar.f43903h;
                if (view6 != null) {
                    view6.setVisibility(0);
                    return;
                } else {
                    s.m("notesTextClearButton");
                    throw null;
                }
            default:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c.f43896j;
                w1 w1Var = cVar.f43897b;
                pj1.s sVar = (pj1.s) w1Var.getValue();
                MultiLineImeEditText multiLineImeEditText4 = cVar.f43901f;
                if (multiLineImeEditText4 == null) {
                    s.m("notesEditText");
                    throw null;
                }
                sVar.W4(String.valueOf(multiLineImeEditText4.getText()));
                ((pj1.s) w1Var.getValue()).q5(true);
                return;
        }
    }
}
