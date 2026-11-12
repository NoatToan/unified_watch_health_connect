package wj;

/* JADX INFO: loaded from: classes7.dex */
public enum c {
    UNKNOWN(-1),
    /* JADX INFO: Fake field, exist only in values array */
    IO_ERROR(1),
    CHANNEL_RESPONSE(2),
    /* JADX INFO: Fake field, exist only in values array */
    CHANNEL_RELEASING(3),
    INVALID_REQUEST(4),
    TRANSFER_IN_PROGRESS(5),
    TRANSFER_FAILED(6),
    /* JADX INFO: Fake field, exist only in values array */
    BACKGROUND_SCAN_IN_USE(7),
    CANCELLED(8);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c[] f185717h = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185719a;

    c(int i14) {
        this.f185719a = i14;
    }
}
