package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.AutoActivityDetectDTO;

/* JADX INFO: loaded from: classes10.dex */
public class o extends fb2.a<AutoActivityDetectDTO> {
    public o(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        AutoActivityDetectDTO autoActivityDetectDTO = (AutoActivityDetectDTO) obj;
        if (autoActivityDetectDTO != null) {
            return (autoActivityDetectDTO.f43509b == null && autoActivityDetectDTO.f43510c == null) ? false : true;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(AutoActivityDetectDTO autoActivityDetectDTO) {
        AutoActivityDetectDTO autoActivityDetectDTO2 = autoActivityDetectDTO;
        if (autoActivityDetectDTO2 == null) {
            vb.h.s("Model is required");
            return false;
        }
        Boolean bool = autoActivityDetectDTO2.f43509b;
        if (bool == null) {
            bool = autoActivityDetectDTO2.f43510c;
        }
        return bool.booleanValue();
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71600i() {
        return R.id.device_settings_auto_activity_detect_btn;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_setting_auto_activity_detect);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        AutoActivityDetectDTO autoActivityDetectDTO = (AutoActivityDetectDTO) obj;
        if (autoActivityDetectDTO != null) {
            autoActivityDetectDTO.f43509b = Boolean.valueOf(z14);
        } else {
            vb.h.s("Model is required");
        }
    }
}
