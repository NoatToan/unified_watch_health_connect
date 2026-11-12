package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class SplitInstallException extends ApiException {
    public SplitInstallException(@SplitInstallErrorCode int i14) {
        super(new Status(i14, String.format("Split Install Error(%d): %s", Integer.valueOf(i14), com.google.android.play.core.splitinstall.model.zza.zzb(i14))));
        if (i14 != 0) {
            return;
        }
        h.s("errorCode should not be 0.");
        throw null;
    }

    @SplitInstallErrorCode
    public int getErrorCode() {
        return super.getStatusCode();
    }
}
