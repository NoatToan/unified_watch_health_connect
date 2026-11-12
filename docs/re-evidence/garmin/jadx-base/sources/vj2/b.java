package vj2;

import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvj2/b;", "", "", "name", "filename", "contentType", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V", "ciq-http-raw-resource-request_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f178483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f178484d;

    public b(String str, String str2, String str3, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.f178481a = str;
        this.f178482b = str2;
        this.f178483c = str3;
        this.f178484d = bArr;
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
        return s.g(this.f178481a, bVar.f178481a) && s.g(this.f178482b, bVar.f178482b) && s.g(this.f178483c, bVar.f178483c) && Arrays.equals(this.f178484d, bVar.f178484d);
    }

    public final int hashCode() {
        int iHashCode = this.f178481a.hashCode() * 31;
        String str = this.f178482b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f178483c;
        return Arrays.hashCode(this.f178484d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int length = this.f178484d.length;
        StringBuilder sbI = p6.b.i("Multipart(name='", this.f178481a, "', filename='", this.f178482b, "', contentType='");
        sbI.append(this.f178483c);
        sbI.append("', data=");
        sbI.append(length);
        sbI.append(" bytes)");
        return sbI.toString();
    }

    public /* synthetic */ b(String str, String str2, String str3, byte[] bArr, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, bArr);
    }
}
