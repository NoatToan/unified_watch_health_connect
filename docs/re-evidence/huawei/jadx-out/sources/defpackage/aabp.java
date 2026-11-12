package defpackage;

import java.util.Arrays;
import org.eclipse.californium.elements.util.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public final class aabp extends zzg {
    public static final aabp e = new aabp("");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f96c;

    private aabp(byte[] bArr) {
        this(new String(bArr, StandardCharsets.UTF_8), bArr);
    }

    public aabp(String str) {
        super(str == null ? null : str.getBytes(StandardCharsets.UTF_8), 65535, false);
        this.f95b = str;
        this.f96c = true;
    }

    public aabp(String str, byte[] bArr) {
        super(bArr, 65535, false);
        this.f95b = str;
        this.f96c = Arrays.equals(bArr, str.getBytes(StandardCharsets.UTF_8));
    }

    public String e() {
        return this.f95b;
    }

    @Override // defpackage.zzg
    public String toString() {
        if (this.f96c) {
            return this.f95b;
        }
        return this.f95b + "/" + a();
    }

    public static aabp c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return e;
        }
        return new aabp(bArr);
    }
}
