package j20;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmergencyContactSendRequestActivity f96567b;

    public /* synthetic */ i(EmergencyContactSendRequestActivity emergencyContactSendRequestActivity, int i14) {
        this.f96566a = i14;
        this.f96567b = emergencyContactSendRequestActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f96566a;
        EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96567b;
        switch (i15) {
            case 0:
                EmergencyContactSendRequestActivity.a aVar = EmergencyContactSendRequestActivity.f32570v;
                emergencyContactSendRequestActivity.na();
                emergencyContactSendRequestActivity.finish();
                dialogInterface.dismiss();
                break;
            default:
                EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
                emergencyContactSendRequestActivity.na();
                emergencyContactSendRequestActivity.finish();
                dialogInterface.dismiss();
                break;
        }
    }
}
