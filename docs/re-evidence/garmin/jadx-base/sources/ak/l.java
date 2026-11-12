package ak;

/* JADX INFO: loaded from: classes7.dex */
public enum l {
    RESPONSE_NO_ERROR(0),
    CHANNEL_IN_WRONG_STATE(21),
    /* JADX INFO: Fake field, exist only in values array */
    CHANNEL_NOT_OPENED(22),
    /* JADX INFO: Fake field, exist only in values array */
    CHANNEL_ID_NOT_SET(24),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_SIZE_EXCEEDS_LIMIT(39),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_MESSAGE(40),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_LIST_ID(48),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_PARAMETER_PROVIDED(51),
    UNKNOWN(65535);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l[] f3560e = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3562a;

    l(int i14) {
        this.f3562a = i14;
    }
}
