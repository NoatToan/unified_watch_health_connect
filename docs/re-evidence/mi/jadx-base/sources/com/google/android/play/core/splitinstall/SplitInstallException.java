package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.sht;

/* JADX INFO: loaded from: classes5.dex */
public class SplitInstallException extends ApiException {
    public SplitInstallException(int i) {
        super(new Status(i, String.format("Split Install Error(%d): %s", Integer.valueOf(i), sht.a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
