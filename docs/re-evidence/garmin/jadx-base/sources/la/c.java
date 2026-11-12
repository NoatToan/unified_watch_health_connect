package la;

import fa.z;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f111603c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f111604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f111605b;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z14;
        if ("Amazon".equals(z.f70073c)) {
            String str = z.f70074d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        f111603c = z14;
    }

    @Deprecated
    public c(UUID uuid, byte[] bArr, boolean z14) {
        this.f111604a = uuid;
        this.f111605b = bArr;
    }

    public c(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }
}
