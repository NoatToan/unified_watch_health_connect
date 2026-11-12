package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i14) {
        super(new Status(i14, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i14), com.google.android.play.core.review.model.zza.zza(i14))));
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
