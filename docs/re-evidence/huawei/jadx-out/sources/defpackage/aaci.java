package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes20.dex */
public class aaci extends GeneralSecurityException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f123b;
    private final byte[] e;

    public aaci() {
        this("MAC validation failed!");
    }

    public aaci(String str) {
        super(str);
        this.e = zzg.f54809a;
        this.f123b = zzg.f54809a;
    }

    public aaci(byte[] bArr, byte[] bArr2) {
        super("MAC validation failed!");
        this.e = Arrays.copyOf(bArr, bArr.length);
        this.f123b = Arrays.copyOf(bArr2, bArr2.length);
    }
}
