package xj1;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingOptionFragment;
import lc.h0;
import lc.y;
import o53.f0;
import p005kotlin.jvm.internal.s;
import r22.o0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmergencyCallingOptionFragment f191174b;

    public /* synthetic */ g(EmergencyCallingOptionFragment emergencyCallingOptionFragment, int i14) {
        this.f191173a = i14;
        this.f191174b = emergencyCallingOptionFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f191173a;
        final int i15 = 1;
        final int i16 = 0;
        final EmergencyCallingOptionFragment emergencyCallingOptionFragment = this.f191174b;
        switch (i14) {
            case 0:
                int i17 = EmergencyCallingOptionFragment.f43815d;
                if (emergencyCallingOptionFragment.u6().f178476z.isEmpty()) {
                    o0.a aVar = o0.f149771c;
                    String string = emergencyCallingOptionFragment.getString(R.string.lbl_missing_phone_numbers);
                    String string2 = emergencyCallingOptionFragment.getString(R.string.msg_missing_phone_numbers_assistance_edit);
                    g gVar = new g(emergencyCallingOptionFragment, 3);
                    g gVar2 = new g(emergencyCallingOptionFragment, 4);
                    aVar.getClass();
                    f0.w(emergencyCallingOptionFragment).b(new i(o0.a.a(string, string2, R.string.lbl_edit, gVar, R.string.not_now_lbl, gVar2), emergencyCallingOptionFragment, null));
                    return;
                }
                view2.getClass();
                CheckedTextView checkedTextView = (CheckedTextView) view2;
                CheckedTextView checkedTextView2 = emergencyCallingOptionFragment.f43818c;
                if (checkedTextView2 == null) {
                    s.m("emergencyServicesOption");
                    throw null;
                }
                checkedTextView2.setEnabled(false);
                checkedTextView.setEnabled(false);
                checkedTextView.setEnabled(false);
                checkedTextView.setChecked(true);
                checkedTextView.invalidate();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: xj1.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i18 = i15;
                        EmergencyCallingOptionFragment emergencyCallingOptionFragment2 = emergencyCallingOptionFragment;
                        switch (i18) {
                            case 0:
                                int i19 = EmergencyCallingOptionFragment.f43815d;
                                emergencyCallingOptionFragment2.v6();
                                break;
                            default:
                                int i24 = EmergencyCallingOptionFragment.f43815d;
                                NavHostFragment.f10124e.getClass();
                                y yVarA = NavHostFragment.a.a(emergencyCallingOptionFragment2);
                                h0 h0VarB = yVarA.f111904b.k().f111791g.b(R.id.emergencyCallingContactFragment);
                                if (h0VarB != null) {
                                    h0VarB.f111775d = emergencyCallingOptionFragment2.getString(R.string.incident_detection_title_add_assistance_contact);
                                }
                                yVarA.g(R.id.action_add_emergency_contact, null);
                                break;
                        }
                    }
                }, 250L);
                return;
            case 1:
                int i18 = EmergencyCallingOptionFragment.f43815d;
                view2.getClass();
                CheckedTextView checkedTextView3 = (CheckedTextView) view2;
                CheckedTextView checkedTextView4 = emergencyCallingOptionFragment.f43817b;
                if (checkedTextView4 == null) {
                    s.m("emergencyContactOption");
                    throw null;
                }
                checkedTextView4.setEnabled(false);
                checkedTextView3.setEnabled(false);
                checkedTextView3.setEnabled(false);
                checkedTextView3.setChecked(true);
                checkedTextView3.invalidate();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: xj1.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i19 = i16;
                        EmergencyCallingOptionFragment emergencyCallingOptionFragment2 = emergencyCallingOptionFragment;
                        switch (i19) {
                            case 0:
                                int i110 = EmergencyCallingOptionFragment.f43815d;
                                emergencyCallingOptionFragment2.v6();
                                break;
                            default:
                                int i24 = EmergencyCallingOptionFragment.f43815d;
                                NavHostFragment.f10124e.getClass();
                                y yVarA = NavHostFragment.a.a(emergencyCallingOptionFragment2);
                                h0 h0VarB = yVarA.f111904b.k().f111791g.b(R.id.emergencyCallingContactFragment);
                                if (h0VarB != null) {
                                    h0VarB.f111775d = emergencyCallingOptionFragment2.getString(R.string.incident_detection_title_add_assistance_contact);
                                }
                                yVarA.g(R.id.action_add_emergency_contact, null);
                                break;
                        }
                    }
                }, 250L);
                return;
            case 2:
                int i19 = EmergencyCallingOptionFragment.f43815d;
                a7.e eVarRequireActivity = emergencyCallingOptionFragment.requireActivity();
                if (eVarRequireActivity instanceof vj1.h) {
                    ((vj1.h) eVarRequireActivity).j1();
                }
                emergencyCallingOptionFragment.u6().K4().f(emergencyCallingOptionFragment.getViewLifecycleOwner(), new EmergencyCallingOptionFragment.c(new xa2.g(emergencyCallingOptionFragment, 8)));
                return;
            case 3:
                int i24 = EmergencyCallingOptionFragment.f43815d;
                a7.e eVarRequireActivity2 = emergencyCallingOptionFragment.requireActivity();
                if (eVarRequireActivity2 instanceof vj1.h) {
                    ((vj1.h) eVarRequireActivity2).O5();
                }
                emergencyCallingOptionFragment.requireActivity().finish();
                return;
            default:
                int i25 = EmergencyCallingOptionFragment.f43815d;
                emergencyCallingOptionFragment.w6();
                return;
        }
    }
}
