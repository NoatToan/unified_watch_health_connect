package hs2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhs2/g;", "", "", "isBlocking", "<init>", "(Ljava/lang/String;IZ)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g {
    DISCONNECTED(true),
    LOCKED_PASSCODE(true),
    RESETTING_SECURE_ELEMENT(true),
    CONNECTING(false),
    CHECKING_PASSCODE_AND_OWNER_DATA(false),
    CREATING_PASSCODE(false),
    CHANGING_PASSCODE(false),
    IDLE(false),
    SENDING_NFC_MESSAGES(false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85463a;

    g(boolean z14) {
        this.f85463a = z14;
    }
}
