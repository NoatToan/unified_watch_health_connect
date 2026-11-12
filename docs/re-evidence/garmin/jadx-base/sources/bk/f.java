package bk;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f18410e = l.CAPABILITIES;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f18413d;

    public enum a {
        CAPABILITIES_NO_RECEIVE_CHANNELS,
        CAPABILITIES_NO_TRANSMIT_CHANNELS,
        CAPABILITIES_NO_RECEIVE_MESSAGES,
        CAPABILITIES_NO_TRANSMIT_MESSAGES,
        CAPABILITIES_NO_ACKD_MESSAGES,
        CAPABILITIES_NO_BURST_MESSAGES,
        CAPABILITIES_NETWORK_ENABLED,
        CAPABILITIES_SERIAL_NUMBER_ENABLED,
        CAPABILITIES_PER_CHANNEL_TX_POWER_ENABLED,
        CAPABILITIES_LOW_PRIORITY_SEARCH_ENABLED,
        CAPABILITIES_SCRIPT_ENABLED,
        CAPABILITIES_SEARCH_LIST_ENABLED,
        CAPABILITIES_LED_ENABLED,
        CAPABILITIES_EXT_MESSAGE_ENABLED,
        CAPABILITIES_SCAN_MODE_ENABLED,
        CAPABILITIES_PROX_SEARCH_ENABLED,
        CAPABILITIES_EXT_ASSIGN_ENABLED,
        CAPABILITIES_FS_ANTFS_ENABLED,
        CAPABILITIES_ADVANCED_BURST_ENABLED,
        CAPABILITIES_EVENT_BUFFERING_ENABLED,
        CAPABILITIES_EVENT_FILTERING_ENABLED,
        CAPABILITIES_HIGH_DUTY_SEARCH_ENABLED,
        CAPABILITIES_SELECTIVE_DATA_UPDATES_ENABLED,
        NUMBER_OF_CAPABILITIES
    }

    public f(byte[] bArr) {
        super(bArr);
        this.f18413d = new boolean[a.NUMBER_OF_CAPABILITIES.ordinal()];
        this.f18411b = (int) ak.k.e(0, 1, bArr);
        this.f18412c = (int) ak.k.e(1, 1, bArr);
        byte[] bArr2 = this.f18402a;
        int length = bArr2.length;
        if (2 >= length) {
            return;
        }
        j(a.CAPABILITIES_NO_RECEIVE_CHANNELS, 2, bArr2, 1);
        j(a.CAPABILITIES_NO_TRANSMIT_CHANNELS, 2, this.f18402a, 2);
        j(a.CAPABILITIES_NO_RECEIVE_MESSAGES, 2, this.f18402a, 4);
        j(a.CAPABILITIES_NO_TRANSMIT_MESSAGES, 2, this.f18402a, 8);
        j(a.CAPABILITIES_NO_ACKD_MESSAGES, 2, this.f18402a, 16);
        j(a.CAPABILITIES_NO_BURST_MESSAGES, 2, this.f18402a, 32);
        if (3 >= length) {
            return;
        }
        j(a.CAPABILITIES_NETWORK_ENABLED, 3, this.f18402a, 2);
        j(a.CAPABILITIES_SERIAL_NUMBER_ENABLED, 3, this.f18402a, 8);
        j(a.CAPABILITIES_PER_CHANNEL_TX_POWER_ENABLED, 3, this.f18402a, 16);
        j(a.CAPABILITIES_LOW_PRIORITY_SEARCH_ENABLED, 3, this.f18402a, 32);
        j(a.CAPABILITIES_SCRIPT_ENABLED, 3, this.f18402a, 64);
        j(a.CAPABILITIES_SEARCH_LIST_ENABLED, 3, this.f18402a, 128);
        if (4 >= length) {
            return;
        }
        j(a.CAPABILITIES_LED_ENABLED, 4, this.f18402a, 1);
        j(a.CAPABILITIES_EXT_MESSAGE_ENABLED, 4, this.f18402a, 2);
        j(a.CAPABILITIES_SCAN_MODE_ENABLED, 4, this.f18402a, 4);
        j(a.CAPABILITIES_PROX_SEARCH_ENABLED, 4, this.f18402a, 16);
        j(a.CAPABILITIES_EXT_ASSIGN_ENABLED, 4, this.f18402a, 32);
        j(a.CAPABILITIES_FS_ANTFS_ENABLED, 4, this.f18402a, 64);
        if (5 >= length) {
            return;
        }
        ak.k.e(5, 1, this.f18402a);
        if (6 >= length) {
            return;
        }
        j(a.CAPABILITIES_ADVANCED_BURST_ENABLED, 6, this.f18402a, 1);
        j(a.CAPABILITIES_EVENT_BUFFERING_ENABLED, 6, this.f18402a, 2);
        j(a.CAPABILITIES_EVENT_FILTERING_ENABLED, 6, this.f18402a, 4);
        j(a.CAPABILITIES_HIGH_DUTY_SEARCH_ENABLED, 6, this.f18402a, 8);
        j(a.CAPABILITIES_SELECTIVE_DATA_UPDATES_ENABLED, 6, this.f18402a, 64);
    }

    @Override // ak.a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f18411b != fVar.f18411b || this.f18412c != fVar.f18412c || hashCode() != fVar.hashCode()) {
            return false;
        }
        int iOrdinal = a.NUMBER_OF_CAPABILITIES.ordinal() - 1;
        for (int i14 = 0; i14 < iOrdinal; i14++) {
            if (this.f18413d[i14] != fVar.f18413d[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // bk.b
    public final l h() {
        return f18410e;
    }

    @Override // ak.a
    public final int hashCode() {
        int i14 = 7;
        for (boolean z14 : this.f18413d) {
            i14 = (i14 * 31) + (z14 ? 1 : 0);
        }
        return i14;
    }

    public final void j(a aVar, int i14, byte[] bArr, int i15) {
        this.f18413d[aVar.ordinal()] = ak.k.d(i15, (int) ak.k.e(i14, 1, bArr));
    }

    @Override // bk.b, ak.a
    public final String toString() {
        int iOrdinal = a.NUMBER_OF_CAPABILITIES.ordinal();
        StringBuilder sb3 = new StringBuilder(i());
        sb3.append("\n  Capabilities=");
        int i14 = 0;
        for (a aVar : a.values()) {
            if (this.f18413d[aVar.ordinal()]) {
                sb3.append(" -");
                sb3.append(aVar);
            }
            i14++;
            if (i14 == iOrdinal) {
                break;
            }
        }
        return sb3.toString();
    }

    public f(dk.a aVar) {
        this(b.g(f18410e, aVar));
    }
}
