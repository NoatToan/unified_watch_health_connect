package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class zve extends zzg {
    public static final zve e = new zve(zzg.f54809a);

    public zve(byte[] bArr) {
        this(bArr, true);
    }

    private zve(byte[] bArr, boolean z) {
        super(bArr, 8, z);
    }

    @Override // defpackage.zzg
    public String toString() {
        return "Token=" + a();
    }

    public static zve e(byte[] bArr) {
        return new zve(bArr, false);
    }
}
