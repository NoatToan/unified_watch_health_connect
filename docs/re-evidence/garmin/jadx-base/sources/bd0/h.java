package bd0;

import android.content.DialogInterface;
import android.text.Html;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BLEScanningActivity f17576b;

    public /* synthetic */ h(BLEScanningActivity bLEScanningActivity, int i14) {
        this.f17575a = i14;
        this.f17576b = bLEScanningActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f17575a;
        BLEScanningActivity bLEScanningActivity = this.f17576b;
        switch (i15) {
            case 0:
                int i16 = BLEScanningActivity.A;
                bLEScanningActivity.ha();
                break;
            case 1:
                int i17 = BLEScanningActivity.A;
                dialogInterface.dismiss();
                bLEScanningActivity.ga();
                break;
            case 2:
                int i18 = BLEScanningActivity.A;
                dialogInterface.dismiss();
                bLEScanningActivity.ga();
                break;
            case 3:
                int i19 = BLEScanningActivity.A;
                i2.a(a2.DEVICES, "BLEScanningActivity", ".showVivosmartPairingInstructions()");
                bLEScanningActivity.ha();
                new androidx.appcompat.app.e.a(bLEScanningActivity).setTitle(R.string.pairing_vivosmart_pairing_instructions_title).setMessage(Html.fromHtml("<p>" + bLEScanningActivity.getText(R.string.pairing_vivosmart_instructions_full_1) + "</p><p><img src='2131231148'/>&nbsp;&nbsp;" + bLEScanningActivity.getText(R.string.pairing_vivosmart_instructions_full_2) + "</p><p><img src='2131231149'/>&nbsp;&nbsp;" + bLEScanningActivity.getText(R.string.pairing_vivosmart_instructions_full_3) + "</p><p><img src='2131231150'/>&nbsp;&nbsp;" + bLEScanningActivity.getText(R.string.pairing_vivosmart_instructions_full_4) + "</p><p><img src='2131231151'/>&nbsp;&nbsp;" + bLEScanningActivity.getText(R.string.pairing_vivosmart_instructions_full_5) + "</p><p><img src='2131231152'/>&nbsp;&nbsp;" + bLEScanningActivity.getText(R.string.pairing_vivosmart_instructions_full_6) + "</p><p><i>" + bLEScanningActivity.getText(R.string.pairing_vivosmart_instructions_full_7) + "</i></p>", new j(bLEScanningActivity), null)).setCancelable(false).setPositiveButton(R.string.lbl_ok, new ag0.e(14)).show();
                break;
            default:
                int i24 = BLEScanningActivity.A;
                dialogInterface.dismiss();
                bLEScanningActivity.ga();
                break;
        }
    }
}
