package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class loa implements oh8 {
    public static final boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f25263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f25264b;
    public final boolean c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(wlq.c)) {
            String str = wlq.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        d = z;
    }

    public loa(UUID uuid, byte[] bArr, boolean z) {
        this.f25263a = uuid;
        this.f25264b = bArr;
        this.c = z;
    }
}
