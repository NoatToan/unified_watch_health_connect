package kn2;

import am.j;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkn2/b;", "", "", "compressed", "", "uncompressedSize", "", "image", "<init>", "(ZI[B)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f105690c;

    public b(boolean z14, int i14, byte[] bArr) {
        bArr.getClass();
        this.f105688a = z14;
        this.f105689b = i14;
        this.f105690c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        b bVar = (b) obj;
        return this.f105688a == bVar.f105688a && this.f105689b == bVar.f105689b && Arrays.equals(this.f105690c, bVar.f105690c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f105690c) + (((Boolean.hashCode(this.f105688a) * 31) + this.f105689b) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f105690c);
        StringBuilder sb3 = new StringBuilder("WalletItemCiqImage(compressed=");
        sb3.append(this.f105688a);
        sb3.append(", uncompressedSize=");
        sb3.append(this.f105689b);
        sb3.append(", image=");
        return j.o(string, ")", sb3);
    }
}
