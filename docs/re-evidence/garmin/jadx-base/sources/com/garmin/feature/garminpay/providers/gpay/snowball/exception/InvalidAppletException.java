package com.garmin.feature.garminpay.providers.gpay.snowball.exception;

import com.garmin.android.apps.connectmobile.R;
import fb1.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/InvalidAppletException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/InvalidAppletException$a;", "reason", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/InvalidAppletException$a;)V", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/InvalidAppletException$a;", "getReason", "()Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/InvalidAppletException$a;", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InvalidAppletException extends RuntimeException {
    public static final int $stable = 8;
    private final a reason;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/InvalidAppletException$a;", "", "", "messageRes", "<init>", "(Ljava/lang/String;II)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        CARD_ERROR(R.string.wallet_applet_error_invalid_card_information),
        BLACKLISTED(R.string.wallet_applet_error_card_blacklisted),
        UNEXPECTED_ISSUER(R.string.wallet_applet_error_not_beijing_tunion_transit_card),
        INVALID_EXPIRATION(R.string.wallet_applet_error_invalid_card_dates),
        INACTIVATED(R.string.wallet_applet_error_card_inactivated);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51226a;

        a(int i14) {
            this.f51226a = i14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAppletException(a aVar) {
        super(c.n("Validate Card applet error: ", aVar.name()));
        aVar.getClass();
        this.reason = aVar;
    }

    public final a getReason() {
        return this.reason;
    }
}
