package ch2;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    public enum b {
        SUCCESS,
        SUCCESS_ACK,
        INVALID_SEQUENCE,
        CRC_MISMATCH,
        TRANSFER_NOT_STARTED,
        INVALID_CONNECTION_ID,
        OUT_OF_MEMORY,
        MISSING_ENCRYPTION_KEY
    }

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f27536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dh2.f.a f27537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27539d;

        public a(e eVar, b bVar, dh2.f.a aVar, int i14, int i15) {
            this.f27536a = bVar;
            this.f27537b = aVar;
            this.f27538c = i14;
            this.f27539d = i15;
        }

        public a(e eVar, b bVar, dh2.f.a aVar, int i14) {
            this(eVar, bVar, aVar, i14, 0);
        }
    }
}
