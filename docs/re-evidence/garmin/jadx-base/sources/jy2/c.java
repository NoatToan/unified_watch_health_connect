package jy2;

import java.util.Arrays;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljy2/c;", "", "", "garminDeviceXml", "", "enableDeltas", "<init>", "([BZ)V", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f101867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f101868b;

    public c(byte[] bArr, boolean z14) {
        bArr.getClass();
        this.f101867a = bArr;
        this.f101868b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c cVar = (c) obj;
        return Arrays.equals(this.f101867a, cVar.f101867a) && this.f101868b == cVar.f101868b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101868b) + (Arrays.hashCode(this.f101867a) * 31);
    }

    public final String toString() {
        return j.g("FirmwareUpdateRequest(garminDeviceXml=", Arrays.toString(this.f101867a), ", enableDeltas=", this.f101868b, ")");
    }

    public /* synthetic */ c(byte[] bArr, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bArr, (i14 & 2) != 0 ? false : z14);
    }
}
