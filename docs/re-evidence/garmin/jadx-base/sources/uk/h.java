package uk;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luk/h;", "", "", "raw", "<init>", "(Ljava/lang/String;II)V", "a", "vivoki_release"}, k = 1, mv = {1, 4, 0})
public enum h {
    ACK(0),
    NAK(1),
    UNKNOWN_OR_NOT_SUPPORTED(2),
    COBS_DECODER_ERROR(3),
    CRC_ERROR(4),
    LENGTH_ERROR(5);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f171680i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f171681a;

    h(int i14) {
        this.f171681a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luk/h$a;", "", "<init>", "()V", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
