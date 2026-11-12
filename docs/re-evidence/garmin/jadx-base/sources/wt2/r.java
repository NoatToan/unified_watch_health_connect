package wt2;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes11.dex */
public enum r {
    TRANSFER_SUCCESSFUL(0),
    RESEND_LAST_DATA_PACKET(1),
    ABORT_EPHEMERIS_REQUEST(2),
    ERROR_CRC_MISMATCH(3),
    ERROR_DATA_OFFSET_MISMATCH(4);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final SparseArray<r> f187231g = new SparseArray<>(values().length);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f187233a;

    static {
        for (r rVar : values()) {
            f187231g.put(rVar.f187233a, rVar);
        }
    }

    r(int i14) {
        this.f187233a = i14;
    }
}
