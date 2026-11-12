package tn2;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltn2/b;", "", "", "command", "", "isAid", "<init>", "([BZ)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f165526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165527b;

    public b(byte[] bArr, boolean z14) {
        bArr.getClass();
        this.f165526a = bArr;
        this.f165527b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f165526a.equals(bVar.f165526a) && this.f165527b == bVar.f165527b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165527b) + (Arrays.hashCode(this.f165526a) * 31);
    }

    public final String toString() {
        return n23.j.g("CApduObject(command=", Arrays.toString(this.f165526a), ", isAid=", this.f165527b, ")");
    }
}
