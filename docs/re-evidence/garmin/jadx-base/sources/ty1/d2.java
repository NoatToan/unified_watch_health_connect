package ty1;

import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 f167093b;

    public /* synthetic */ d2(com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var, int i14) {
        this.f167092a = i14;
        this.f167093b = a0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f167092a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = this.f167093b;
        switch (i14) {
            case 0:
                String string = (String) obj;
                TextView textView = a0Var.Z0;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("mLocationTextView");
                    throw null;
                }
                if (string == null || string.length() == 0) {
                    string = a0Var.getString(R.string.lbl_enter_group_location);
                }
                textView.setText(string);
                if (a0Var.f45821x1 == null) {
                    a0Var.f45821x1 = a0Var.F6().I5();
                }
                return Unit.INSTANCE;
            case 1:
                LocalDate localDate = (LocalDate) obj;
                if (localDate != null) {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                    Date date = localDate.toDate();
                    date.getClass();
                    String strG = c22.j0.g(date, "MM/dd/yy", null);
                    TextView textView2 = a0Var.P;
                    if (textView2 == null) {
                        p005kotlin.jvm.internal.s.m("mEventDateTextView");
                        throw null;
                    }
                    textView2.setText(strG);
                    if (a0Var.S6()) {
                        AddTIEventViewModel addTIEventViewModelF6 = a0Var.F6();
                        DateTime dateTimeP5 = a0Var.F6().p5();
                        addTIEventViewModelF6.L6(dateTimeP5 != null ? dateTimeP5.withDate(localDate) : null);
                    }
                } else {
                    TextView textView3 = a0Var.P;
                    if (textView3 == null) {
                        p005kotlin.jvm.internal.s.m("mEventDateTextView");
                        throw null;
                    }
                    textView3.setText("--");
                }
                if (a0Var.f45812s1 == null) {
                    TextView textView4 = a0Var.P;
                    if (textView4 == null) {
                        p005kotlin.jvm.internal.s.m("mEventDateTextView");
                        throw null;
                    }
                    a0Var.f45812s1 = textView4.getText().toString();
                }
                a0Var.F6().S6();
                return Unit.INSTANCE;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                if (zBooleanValue) {
                    a0Var.U6();
                }
                return Unit.INSTANCE;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                a0Var.V6(bool);
                return Unit.INSTANCE;
        }
    }
}
