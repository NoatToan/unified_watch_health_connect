package gp2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgp2/f;", "", "", "data", "<init>", "(Ljava/lang/String;ILjava/lang/Object;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum f {
    CARD_CREATED(null, 1, null),
    DUPLICATE_CARD(null, 1, null),
    MAX_CARD_LIMIT_REACHED(null, 1, null),
    CARD_DELETED(null, 1, null),
    USER_ENTERED_BAD_DATA(null, 1, null),
    CARD_ISSUER_NOT_ELIGIBLE(null, 1, null),
    DEVICE_REQUIRES_SE_UPDATE(null, 1, null),
    CARD_CREATED_BUT_CAN_NOT_PROCEED_FURTHER(null, 1, null),
    FAILURE_TO_CREATE_CREDIT_CARD(null, 1, null),
    CREATE_CREDIT_CARD_REQUEST_TIMED_OUT(null, 1, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f78496a;

    /* synthetic */ f(Object obj, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : obj);
    }

    f(Object obj) {
        this.f78496a = obj;
    }
}
