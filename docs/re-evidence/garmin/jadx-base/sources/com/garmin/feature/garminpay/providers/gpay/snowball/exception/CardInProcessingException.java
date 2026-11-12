package com.garmin.feature.garminpay.providers.gpay.snowball.exception;

import com.garmin.android.gncs.NotificationConstants;
import fo2.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/CardInProcessingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "Lfo2/q;", NotificationConstants.KEY_DATA_MIME_TYPE, "(Lfo2/q;)V", "value", "Lfo2/q;", "getType", "()Lfo2/q;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CardInProcessingException extends Exception {
    public static final int $stable = 8;
    private q type;

    public CardInProcessingException(q qVar) {
        qVar.getClass();
        this.type = qVar;
    }

    public final q getType() {
        return this.type;
    }

    public CardInProcessingException() {
    }
}
