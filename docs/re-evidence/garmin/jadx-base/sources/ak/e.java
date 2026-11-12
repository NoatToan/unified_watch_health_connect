package ak;

/* JADX INFO: loaded from: classes7.dex */
public enum e {
    RX_SEARCH_TIMEOUT(1),
    RX_FAIL(2),
    TX(3),
    TRANSFER_RX_FAILED(4),
    TRANSFER_TX_COMPLETED(5),
    TRANSFER_TX_FAILED(6),
    CHANNEL_CLOSED(7),
    RX_FAIL_GO_TO_SEARCH(8),
    CHANNEL_COLLISION(9),
    TRANSFER_TX_START(10),
    UNKNOWN(65535);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e[] f3525m = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3527a;

    e(int i14) {
        this.f3527a = i14;
    }
}
