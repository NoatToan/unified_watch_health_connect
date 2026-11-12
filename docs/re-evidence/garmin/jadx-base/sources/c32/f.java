package c32;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.core.view.g0;
import c22.y3;
import com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity.e;
import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmResetPassCodeActivity;
import com.garmin.android.apps.connectmobile.settings.devices.index.InviteByEmailActivity;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSingleLineEditTextView;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.fragment.FitPayAdditionalInformationFragment;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.textfield.TextInputEditText;
import d53.w;
import e23.l;
import k32.n;
import mt0.e0;
import o53.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24113b;

    public /* synthetic */ f(Object obj, int i14) {
        this.f24112a = i14;
        this.f24113b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view2, boolean z14) {
        xf1.d dVarEa;
        xf1.d dVarEa2;
        int i14 = this.f24112a;
        int i15 = 3;
        Object obj = this.f24113b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.view.reusablecomponents.b bVar = (com.garmin.android.apps.connectmobile.view.reusablecomponents.b) obj;
                int i16 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                bVar.post(new a0.a(z14, bVar, i15));
                return;
            case 1:
                ExploreSegmentsActivity exploreSegmentsActivity = (ExploreSegmentsActivity) obj;
                ExploreSegmentsActivity.a aVar = ExploreSegmentsActivity.C;
                view2.getClass();
                if (z14) {
                    if (exploreSegmentsActivity.f190648n == xf1.c.b.MAP && (dVarEa = exploreSegmentsActivity.getF190646l()) != null && dVarEa.f190663m) {
                        xf1.d dVarEa3 = exploreSegmentsActivity.getF190646l();
                        if (dVarEa3 != null) {
                            dVarEa3.A6();
                        }
                        exploreSegmentsActivity.fa();
                        return;
                    }
                    return;
                }
                Object systemService = exploreSegmentsActivity.getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                if (exploreSegmentsActivity.f190648n != xf1.c.b.MAP || (dVarEa2 = exploreSegmentsActivity.getF190646l()) == null || dVarEa2.f190663m) {
                    return;
                }
                ge1.b.T(f0.w(exploreSegmentsActivity), null, null, exploreSegmentsActivity.new e(null), 3);
                return;
            case 2:
                DateSelector.lambda$showKeyboardWithAutoHideBehavior$0((EditText[]) obj, view2, z14);
                return;
            case 3:
                cp2.i iVar = (cp2.i) obj;
                TextInputEditText textInputEditText = iVar.f54968e;
                if (z14) {
                    if (textInputEditText != null) {
                        textInputEditText.setText(iVar.f54972i);
                        return;
                    } else {
                        s.m("addInfoCvvEditTextView");
                        throw null;
                    }
                }
                if (textInputEditText != null) {
                    iVar.f54972i = String.valueOf(textInputEditText.getText());
                    return;
                } else {
                    s.m("addInfoCvvEditTextView");
                    throw null;
                }
            case 4:
                h32.e eVar = (h32.e) obj;
                MultiLineImeEditText multiLineImeEditText = eVar.editText;
                if (!z14) {
                    String string = w.i0(String.valueOf(multiLineImeEditText.getText())).toString();
                    multiLineImeEditText.setText(string);
                    l<? super String, Unit> lVar = eVar.f81305d;
                    if (lVar != null) {
                        lVar.invoke(string);
                    }
                    eVar.k();
                }
                eVar.isEditing = z14;
                eVar.j();
                return;
            case 5:
                h32.h hVar = (h32.h) obj;
                EditText editText = hVar.editText;
                if (!z14) {
                    String string2 = w.i0(editText.getText().toString()).toString();
                    editText.setText(string2);
                    l<? super String, Unit> lVar2 = hVar.f81343c;
                    if (lVar2 != null) {
                        lVar2.invoke(string2);
                    }
                }
                hVar.isEditing = z14;
                hVar.j();
                return;
            case 6:
                GCMSingleLineEditTextView gCMSingleLineEditTextView = (GCMSingleLineEditTextView) obj;
                MultiLineImeEditText multiLineImeEditText2 = gCMSingleLineEditTextView.f47811h;
                if (!z14) {
                    String string3 = w.i0(String.valueOf(multiLineImeEditText2.getText())).toString();
                    multiLineImeEditText2.setText(string3);
                    l<? super String, Unit> lVar3 = gCMSingleLineEditTextView.f47807d;
                    if (lVar3 != null) {
                        lVar3.invoke(string3);
                    }
                    gCMSingleLineEditTextView.k();
                }
                gCMSingleLineEditTextView.f47810g = z14;
                gCMSingleLineEditTextView.j();
                return;
            case 7:
                EditText editText2 = (EditText) obj;
                InviteByEmailActivity.a aVar2 = InviteByEmailActivity.f43034c;
                if (z14) {
                    view2.getClass();
                    v22.e.t(view2);
                    view2.setSelected(true);
                    return;
                }
                view2.getClass();
                v22.e.b(view2);
                view2.setSelected(false);
                Editable text = editText2.getText();
                text.getClass();
                if (text.length() > 0) {
                    editText2.setVisibility(0);
                    return;
                } else {
                    editText2.setVisibility(8);
                    return;
                }
            case 8:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = (com.garmin.android.apps.connectmobile.liveeventsharing.ui.d) obj;
                if (!z14) {
                    com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                    return;
                }
                ScrollView scrollView = dVar.f38592l;
                if (scrollView != null) {
                    scrollView.postDelayed(new n(dVar, 19), 325L);
                    return;
                } else {
                    s.m("scrollView");
                    throw null;
                }
            case 9:
                pv2.d dVar2 = (pv2.d) obj;
                EditText editText3 = dVar2.editText;
                if (!z14) {
                    String string4 = w.i0(editText3.getText().toString()).toString();
                    editText3.setText(string4);
                    e0 e0Var = dVar2.f141654g;
                    if (e0Var != null) {
                        e0Var.invoke(string4);
                    }
                }
                dVar2.isEditing = z14;
                dVar2.i();
                return;
            case 10:
                MultiLineImeEditText.b((MultiLineImeEditText) obj, view2, z14);
                return;
            case 11:
                rv.b bVar2 = (rv.b) obj;
                rv.b.a aVar4 = rv.b.f154590r;
                if (z14) {
                    Object tag = view2.getTag();
                    tag.getClass();
                    bVar2.f154600n = ((Integer) tag).intValue();
                    new Handler().postDelayed(new g0(view2, bVar2), 10L);
                    return;
                }
                return;
            case 12:
                so2.c cVar = (so2.c) obj;
                so2.c.a aVar5 = so2.c.f160478d;
                if (!z14) {
                    view2.getClass();
                    cVar.u6(view2);
                    return;
                }
                Context context = cVar.getContext();
                if (context == null) {
                    so2.c.f160479e.trace("Context is null");
                    return;
                }
                Object systemService2 = context.getSystemService("input_method");
                systemService2.getClass();
                ((InputMethodManager) systemService2).toggleSoftInput(2, 1);
                return;
            case 13:
                FitPayAdditionalInformationFragment fitPayAdditionalInformationFragment = (FitPayAdditionalInformationFragment) obj;
                TextInputEditText textInputEditText2 = fitPayAdditionalInformationFragment.f51659d;
                if (z14) {
                    if (textInputEditText2 != null) {
                        textInputEditText2.setText(fitPayAdditionalInformationFragment.f51661f);
                        return;
                    } else {
                        s.m("addInfoCvvEditTextView");
                        throw null;
                    }
                }
                if (textInputEditText2 != null) {
                    fitPayAdditionalInformationFragment.f51661f = String.valueOf(textInputEditText2.getText());
                    return;
                } else {
                    s.m("addInfoCvvEditTextView");
                    throw null;
                }
            case 14:
                CourseSearchActivity.a aVar6 = CourseSearchActivity.f33091e;
                ((CourseSearchActivity) obj).ca().z4(new x50.b.j(z14));
                return;
            case 15:
                BikeAlarmResetPassCodeActivity bikeAlarmResetPassCodeActivity = (BikeAlarmResetPassCodeActivity) obj;
                BikeAlarmResetPassCodeActivity.a aVar7 = BikeAlarmResetPassCodeActivity.f42565o;
                if (z14) {
                    Object tag2 = view2.getTag();
                    tag2.getClass();
                    bikeAlarmResetPassCodeActivity.f42568c = ((Integer) tag2).intValue();
                    new Handler().postDelayed(new g0(view2, 4), 10L);
                    return;
                }
                return;
            case 16:
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b bVar3 = (com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b) obj;
                if (z14) {
                    EditText editText4 = bVar3.f30936l;
                    if (editText4 == null) {
                        s.m("messageEditText");
                        throw null;
                    }
                    y3.b(editText4);
                    view2.setSelected(true);
                    return;
                }
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b.a aVar8 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b.f30933m;
                view2.setSelected(false);
                y3.a(view2);
                pd1.b bVarE6 = bVar3.E6();
                EditText editText5 = bVar3.f30936l;
                if (editText5 != null) {
                    bVarE6.r(editText5.getText().toString());
                    return;
                } else {
                    s.m("messageEditText");
                    throw null;
                }
            default:
                View view3 = ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c) obj).f43903h;
                if (view3 != null) {
                    v22.e.v(view3, z14);
                    return;
                } else {
                    s.m("notesTextClearButton");
                    throw null;
                }
        }
    }
}
