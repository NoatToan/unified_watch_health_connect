package vg1;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.devices.common.TransferSensorsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferSensorsActivity f178067b;

    public /* synthetic */ a1(TransferSensorsActivity transferSensorsActivity, int i14) {
        this.f178066a = i14;
        this.f178067b = transferSensorsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f178066a;
        TransferSensorsActivity transferSensorsActivity = this.f178067b;
        switch (i14) {
            case 0:
                g3 g3Var = (g3) obj;
                TransferSensorsActivity.a aVar = TransferSensorsActivity.f42801h;
                if (g3Var != null) {
                    int i15 = TransferSensorsActivity.b.f42809a[g3Var.f35300a.ordinal()];
                    if (i15 == 1) {
                        transferSensorsActivity.showProgressOverlay();
                    } else if (i15 == 2) {
                        transferSensorsActivity.hideProgressOverlay();
                        r22.m0 m0VarD = r22.m0.a.d(r22.m0.f149759e, 2131231871, null, transferSensorsActivity.getString(R.string.msg_transfer_sensors_confirmation, transferSensorsActivity.f42807f), 0, null, 0, null, null, 2042);
                        m0VarD.show(transferSensorsActivity.getSupportFragmentManager(), (String) null);
                        new Handler(Looper.getMainLooper()).postDelayed(new d(4, m0VarD, transferSensorsActivity), 3000L);
                    } else {
                        if (i15 != 3) {
                            lc.u0.r();
                            return null;
                        }
                        transferSensorsActivity.hideProgressOverlay();
                        transferSensorsActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
            default:
                g3 g3Var2 = (g3) obj;
                TransferSensorsActivity.a aVar2 = TransferSensorsActivity.f42801h;
                if (g3Var2 != null) {
                    int i16 = TransferSensorsActivity.b.f42809a[g3Var2.f35300a.ordinal()];
                    if (i16 == 1) {
                        transferSensorsActivity.showProgressOverlay();
                    } else if (i16 == 2) {
                        transferSensorsActivity.hideProgressOverlay();
                        Boolean bool = (Boolean) g3Var2.f35301b;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        View view2 = transferSensorsActivity.f42802a;
                        if (view2 == null) {
                            p005kotlin.jvm.internal.s.m("rootView");
                            throw null;
                        }
                        view2.setVisibility(0);
                        TextView textView = transferSensorsActivity.f42803b;
                        if (zBooleanValue) {
                            if (textView == null) {
                                p005kotlin.jvm.internal.s.m("titleTextView");
                                throw null;
                            }
                            textView.setText(transferSensorsActivity.getString(R.string.title_transfer_sensors, transferSensorsActivity.f42807f));
                            TextView textView2 = transferSensorsActivity.f42804c;
                            if (textView2 == null) {
                                p005kotlin.jvm.internal.s.m("msgTextView");
                                throw null;
                            }
                            textView2.setText(transferSensorsActivity.getString(R.string.msg_transfer_sensors, transferSensorsActivity.f42807f));
                        } else {
                            if (textView == null) {
                                p005kotlin.jvm.internal.s.m("titleTextView");
                                throw null;
                            }
                            textView.setVisibility(8);
                            TextView textView3 = transferSensorsActivity.f42804c;
                            if (textView3 == null) {
                                p005kotlin.jvm.internal.s.m("msgTextView");
                                throw null;
                            }
                            textView3.setText(R.string.msg_no_sensors_to_transfer);
                            Button button = transferSensorsActivity.f42805d;
                            if (button == null) {
                                p005kotlin.jvm.internal.s.m("transferSensorsButton");
                                throw null;
                            }
                            button.setVisibility(8);
                        }
                    } else {
                        if (i16 != 3) {
                            lc.u0.r();
                            return null;
                        }
                        transferSensorsActivity.hideProgressOverlay();
                        transferSensorsActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
