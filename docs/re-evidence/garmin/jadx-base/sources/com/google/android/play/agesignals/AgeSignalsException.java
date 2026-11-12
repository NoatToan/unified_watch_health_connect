package com.google.android.play.agesignals;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class AgeSignalsException extends ApiException {
    public AgeSignalsException(int i14) {
        super(new Status(i14, String.format(Locale.getDefault(), "Age Signals Error: %d", Integer.valueOf(i14))));
        if (i14 != 0) {
            return;
        }
        h.s("errorCode should not be 0.");
        throw null;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }

    public AgeSignalsException(Status status) {
        super(status);
    }
}
