package zp0;

import java.util.Arrays;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzp0/f;", "", "", "bytes", "", "extension", "<init>", "([BLjava/lang/String;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f206588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206589b;

    public f(byte[] bArr, String str) {
        bArr.getClass();
        str.getClass();
        this.f206588a = bArr;
        this.f206589b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Arrays.equals(this.f206588a, fVar.f206588a) && this.f206589b.equals(fVar.f206589b);
    }

    public final int hashCode() {
        return this.f206589b.hashCode() + (Arrays.hashCode(this.f206588a) * 31);
    }

    public final String toString() {
        return e0.g("LoadedImage(bytes=", Arrays.toString(this.f206588a), ", extension=", this.f206589b, ")");
    }
}
