package rs2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrs2/y;", "", "", "raw", "<init>", "(Ljava/lang/String;II)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum y {
    ACK(0),
    NAK(1),
    UNKNOWN_OR_NOT_SUPPORTED(2),
    COBS_DECODER_ERROR(3),
    CRC_ERROR(4),
    LENGTH_ERROR(5);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f154458b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154466a;

    y(int i14) {
        this.f154466a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrs2/y$a;", "", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
