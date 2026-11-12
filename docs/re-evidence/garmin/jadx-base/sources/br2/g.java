package br2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbr2/g;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g {
    UNKNOWN,
    NEW,
    ELIGIBLE,
    PENDING_ACTIVE,
    PENDING_VERIFICATION,
    SUSPENDED,
    SUSPENDED_BY_ISSUER,
    PAY_NOT_ENABLED,
    PAY_ENABLED,
    ADD_CARD_TO_DEVICE,
    ERROR,
    DISABLED;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19622a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.ELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.ADD_CARD_TO_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.PENDING_ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.PENDING_VERIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.SUSPENDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g.SUSPENDED_BY_ISSUER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[g.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[g.ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[g.DISABLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f19622a = iArr;
        }
    }

    public final String a(Context context) {
        context.getClass();
        switch (a.f19622a[ordinal()]) {
            case 1:
            case 2:
                return context.getString(R.string.wallet_status_action_required);
            case 3:
                return context.getString(R.string.check_card_eligibility);
            case 4:
                return context.getString(R.string.wallet_status_activating);
            case 5:
                return context.getString(R.string.wallet_status_pending_verification);
            case 6:
                return context.getString(R.string.wallet_status_suspended);
            case 7:
                return context.getString(R.string.wallet_card_status_issuer_deactivated);
            case 8:
                return context.getString(R.string.wallet_unknown_unionpay_card);
            case 9:
                return context.getString(R.string.wallet_card_error);
            case 10:
                return context.getString(R.string.wallet_card_disabled);
            default:
                return null;
        }
    }
}
