package com.google.android.play.core.assetpacks;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.u2s;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class AssetPackException extends ApiException {
    public AssetPackException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Asset Pack Download Error(%d): %s", Integer.valueOf(i), u2s.a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
