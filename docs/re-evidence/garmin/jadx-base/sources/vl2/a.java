package vl2;

import am.j;
import java.util.Arrays;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvl2/a;", "", "", "sequenceNumber", "", "responseData", "", "responseCode", "<init>", "(I[BLjava/lang/String;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f178712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f178713c;

    public a(int i14, byte[] bArr, String str) {
        bArr.getClass();
        str.getClass();
        this.f178711a = i14;
        this.f178712b = bArr;
        this.f178713c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        a aVar = (a) obj;
        return this.f178711a == aVar.f178711a && Arrays.equals(this.f178712b, aVar.f178712b) && this.f178713c.equals(aVar.f178713c);
    }

    public final int hashCode() {
        return this.f178713c.hashCode() + ((Arrays.hashCode(this.f178712b) + (this.f178711a * 31)) * 31);
    }

    public final String toString() {
        return j.o(this.f178713c, ")", g.r(this.f178711a, "ApduCommandResult(sequenceNumber=", ", responseData=", Arrays.toString(this.f178712b), ", responseCode="));
    }
}
