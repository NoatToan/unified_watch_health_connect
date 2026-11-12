package com.garmin.device.nfc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/device/nfc/k;", "", "", "messageId", "<init>", "(Ljava/lang/String;II)V", "a", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum k {
    APDU_TRANSFER_STATUS_NOTIFICATION(NfcCommandHandler.b.APDU_TRANSFER_STATUS_NOTIFICATION.f50819a),
    DEVICE_DRIVEN_SOCKET(NfcCommandHandler.b.DEVICE_DRIVEN_SOCKET.f50819a);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50919b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50923a;

    k(int i14) {
        this.f50923a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/device/nfc/k$a;", "", "<init>", "()V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
