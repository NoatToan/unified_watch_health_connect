package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.model.InstallErrorCode;
import java.util.Locale;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class InstallException extends ApiException {
    public InstallException(@InstallErrorCode int i14) {
        super(new Status(i14, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i14), com.google.android.play.core.install.model.zza.zza(i14))));
        if (i14 != 0) {
            return;
        }
        h.s("errorCode should not be 0.");
        throw null;
    }

    @InstallErrorCode
    public int getErrorCode() {
        return super.getStatusCode();
    }
}
