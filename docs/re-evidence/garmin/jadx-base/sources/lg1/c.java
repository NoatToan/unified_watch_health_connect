package lg1;

import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f112196d;

    public /* synthetic */ c(Object obj, int i14, Object obj2, Object obj3) {
        this.f112193a = i14;
        this.f112194b = obj;
        this.f112195c = obj2;
        this.f112196d = obj3;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        int i14 = this.f112193a;
        Object obj = this.f112196d;
        Object obj2 = this.f112195c;
        Object obj3 = this.f112194b;
        switch (i14) {
            case 0:
                a.c cVar = (a.c) obj2;
                a.c.C2155a c2155a = a.c.f112183c;
                compoundButton.getClass();
                ((IDeveloperItemStrategy) obj3).handleToggle(z14, cVar.f112184a, new kp2.a(cVar, 9), (mg1.a) obj);
                break;
            default:
                i iVar = (i) obj3;
                com.garmin.android.apps.connectmobile.settings.devices.d dVar = (com.garmin.android.apps.connectmobile.settings.devices.d) obj2;
                com.garmin.android.apps.connectmobile.settings.devices.d.c cVar2 = (com.garmin.android.apps.connectmobile.settings.devices.d.c) obj;
                int i15 = com.garmin.android.apps.connectmobile.settings.devices.d.f42886f;
                compoundButton.getClass();
                iVar.C(z14 ? com.garmin.android.apps.connectmobile.devices.model.c.ON : com.garmin.android.apps.connectmobile.devices.model.c.OFF);
                dVar.f42890d = true;
                GCMComplexTwoLineButton gCMComplexTwoLineButton = cVar2.f42892a;
                if (!z14) {
                    gCMComplexTwoLineButton.getClass();
                    gCMComplexTwoLineButton.setButtonTopLabelTextColor(R.color.gcm_text_primary_disabled);
                    GCMComplexTwoLineButton gCMComplexTwoLineButton2 = cVar2.f42892a;
                    gCMComplexTwoLineButton2.getClass();
                    gCMComplexTwoLineButton2.setButtonBottomLeftLabelTextColor(R.color.gcm_text_primary_disabled);
                } else {
                    gCMComplexTwoLineButton.getClass();
                    gCMComplexTwoLineButton.setButtonTopLabelTextColor(R.color.gcm_text_primary);
                    GCMComplexTwoLineButton gCMComplexTwoLineButton3 = cVar2.f42892a;
                    gCMComplexTwoLineButton3.getClass();
                    gCMComplexTwoLineButton3.setButtonBottomLeftLabelTextColor(R.color.gcm_text_primary);
                }
                break;
        }
    }
}
