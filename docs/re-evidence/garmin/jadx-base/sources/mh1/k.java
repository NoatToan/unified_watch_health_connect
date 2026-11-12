package mh1;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmh1/k;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends com.garmin.android.apps.connectmobile.f {
    public k() {
        super(R.layout.index_s2_firmware_update_bottom_sheet, false, false, false, 14, null);
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        ((TextView) view2.findViewById(R.id.index_s2_manual_update_link)).setOnClickListener(new lq.g(4, view2, this));
        w6();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String y6() {
        String string = getString(R.string.lbl_done);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        String string = getString(R.string.lbl_update_index_scale);
        string.getClass();
        return string;
    }
}
