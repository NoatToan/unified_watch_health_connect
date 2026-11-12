package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes14.dex */
public final class j implements k {
    @Override // com.google.android.play.core.integrity.k
    public final ApiException a(Bundle bundle) {
        int i14 = bundle.getInt(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (i14 == 0) {
            return null;
        }
        return new StandardIntegrityException(i14, null);
    }
}
