package j20;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmergencyContactSendRequestActivity f96565b;

    public /* synthetic */ h(EmergencyContactSendRequestActivity emergencyContactSendRequestActivity, int i14) {
        this.f96564a = i14;
        this.f96565b = emergencyContactSendRequestActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96564a;
        EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96565b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        EmergencyContactSendRequestActivity.a aVar = EmergencyContactSendRequestActivity.f32570v;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                emergencyContactSendRequestActivity.ka().J4();
                emergencyContactSendRequestActivity.showProgressOverlay();
                break;
            case 1:
                dialogInterface.getClass();
                emergencyContactSendRequestActivity.hideProgressOverlay();
                break;
            case 2:
                dialogInterface.getClass();
                emergencyContactSendRequestActivity.ka().J4();
                emergencyContactSendRequestActivity.showProgressOverlay();
                break;
            default:
                dialogInterface.getClass();
                emergencyContactSendRequestActivity.hideProgressOverlay();
                break;
        }
        return Unit.INSTANCE;
    }
}
