package c32;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.m;
import c22.l3;
import com.garmin.android.apps.connectmobile.developer.CIQPushNotificationTestActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.AutoSyncInterval;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceSoftwareUpdateMode;
import gg1.j0;
import ig1.l0;
import ig1.m0;
import java.util.ArrayList;
import java.util.Set;
import lo.f0;
import lo.t;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.s;
import pb1.l;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24109e;

    public /* synthetic */ c(AutoSyncInterval autoSyncInterval, mg1.a aVar, e23.a aVar2, Context context) {
        this.f24105a = 1;
        this.f24107c = autoSyncInterval;
        this.f24108d = aVar;
        this.f24106b = aVar2;
        this.f24109e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f24105a;
        int i16 = 0;
        int i17 = 1;
        Object obj = this.f24106b;
        Object obj2 = this.f24108d;
        Object obj3 = this.f24109e;
        Object obj4 = this.f24107c;
        switch (i15) {
            case 0:
                e23.a aVar = (e23.a) obj;
                ((com.garmin.android.apps.connectmobile.view.reusablecomponents.a) obj4).f47693b.invoke(((ArrayList) obj2).get(((NumberPicker) obj3).getValue()));
                dialogInterface.dismiss();
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            case 1:
                AutoSyncInterval.handleEditTextInput$lambda$0((AutoSyncInterval) obj4, (mg1.a) obj2, (e23.a) obj, (Context) obj3, dialogInterface, i14);
                return;
            case 2:
                DeviceSoftwareUpdateMode.handleClick$lambda$0((String[]) obj4, (Context) obj2, (mg1.a) obj3, (e23.a) obj, dialogInterface, i14);
                return;
            case 3:
                CIQPushNotificationTestActivity cIQPushNotificationTestActivity = (CIQPushNotificationTestActivity) obj3;
                String str = (String) obj;
                int i18 = CIQPushNotificationTestActivity.f33602d;
                Long l14 = ((Long[]) obj2)[i14];
                l14.getClass();
                long jLongValue = l14.longValue();
                ((q0) obj4).f105808a = jLongValue;
                if (jLongValue > -1) {
                    cIQPushNotificationTestActivity.ca(jLongValue, str);
                    return;
                }
                return;
            case 4:
                j0 j0Var = (j0) obj4;
                NumberPicker numberPicker = (NumberPicker) obj3;
                float value = (numberPicker.getValue() * 12) + (numberPicker.getValue() != 8 ? ((NumberPicker) obj2).getValue() : ((NumberPicker) obj).getValue());
                l3.f23124b.getClass();
                ((pb1.i) j0Var.f77252a).a((float) (((double) value) * 2.54d));
                dialogInterface.dismiss();
                return;
            case 5:
                ((com.garmin.android.apps.connectmobile.settings.activityoptions.e) obj4).f41727a.m((((NumberPicker) obj).getValue() * 5) + (((NumberPicker) obj2).getValue() * 60) + (((NumberPicker) obj3).getValue() * DateTimeConstants.SECONDS_PER_HOUR));
                dialogInterface.dismiss();
                return;
            case 6:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a aVar2 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a) obj4;
                aVar2.f38865i = true;
                aVar2.z6((Set) obj2, (Set) obj3, (LocalDate) obj, true);
                return;
            case 7:
                m0 m0Var = (m0) obj4;
                String[] strArr = (String[]) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                dialogInterface.getClass();
                TextView textView = m0Var.f93363k;
                textView.getClass();
                textView.setText(strArr[i14]);
                String strA = oi0.d.a((i.c) obj3, strArr[i14], new l0(1));
                TextView textView2 = m0Var.f93363k;
                textView2.getClass();
                textView2.setContentDescription(strA);
                LinearLayout linearLayout = m0Var.f93364l;
                if (i14 == 5) {
                    linearLayout.getClass();
                    linearLayout.setVisibility(0);
                } else {
                    linearLayout.getClass();
                    linearLayout.setVisibility(8);
                    i16 = i14 + 1;
                }
                fVar.getClass();
                if (i16 == 0 || (i16 >= 1 && i16 <= 5)) {
                    i17 = i16;
                }
                fVar.y1("heartRateAlertZone", Integer.valueOf(i17));
                dialogInterface.dismiss();
                m0Var.p();
                return;
            case 8:
                NumberPicker numberPicker2 = (NumberPicker) obj3;
                String str2 = (String) obj2;
                String[] strArr2 = (String[]) obj;
                numberPicker2.clearFocus();
                int value2 = numberPicker2.getValue();
                f0 f0Var = ((t) obj4).f113949a;
                if (value2 != 0) {
                    value2 = Integer.parseInt(strArr2[value2]);
                }
                f0Var.e1(false, str2, value2);
                return;
            case 9:
                m mVar = (m) obj2;
                p0 p0Var = (p0) obj3;
                db1.m mVar2 = (db1.m) obj;
                l.a aVar3 = l.f136861l;
                db1.b[] bVarArrValues = db1.b.values();
                dialogInterface.getClass();
                db1.b bVar = bVarArrValues[((androidx.appcompat.app.e) dialogInterface).f4658a.f4596g.getCheckedItemPosition()];
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = ((l) obj4).f136866d;
                if (gCMPregnancyTwoLineButton == null) {
                    s.m("mExpectingButton");
                    throw null;
                }
                gCMPregnancyTwoLineButton.setButtonValueLabel(bVar.a(mVar));
                p0Var.f105807a = bVar.ordinal();
                mVar2.z(bVar);
                return;
            default:
                xg1.f fVar2 = (xg1.f) obj4;
                NumberPicker numberPicker3 = (NumberPicker) obj3;
                float value3 = (numberPicker3.getValue() * 12) + (numberPicker3.getValue() != 8 ? ((NumberPicker) obj2).getValue() : ((NumberPicker) obj).getValue());
                l3.f23124b.getClass();
                float f14 = (float) (((double) value3) * 2.54d);
                xg1.i<Double> iVar = fVar2.f190895a;
                if (iVar != null) {
                    iVar.a(Double.valueOf(f14));
                }
                dialogInterface.dismiss();
                return;
        }
    }

    public /* synthetic */ c(Object obj, NumberPicker numberPicker, Object obj2, Object obj3, int i14) {
        this.f24105a = i14;
        this.f24107c = obj;
        this.f24109e = numberPicker;
        this.f24108d = obj2;
        this.f24106b = obj3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f24105a = i14;
        this.f24107c = obj;
        this.f24108d = obj2;
        this.f24109e = obj3;
        this.f24106b = obj4;
    }
}
