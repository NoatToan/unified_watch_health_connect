package gy2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgy2/e;", "", "", "fileDir", "fileName", "", "fileSize", "", "httpCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;)V", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f80307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f80308d;

    public e(String str, String str2, long j8, Integer num) {
        str.getClass();
        str2.getClass();
        this.f80305a = str;
        this.f80306b = str2;
        this.f80307c = j8;
        this.f80308d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f80305a, eVar.f80305a) && s.g(this.f80306b, eVar.f80306b) && this.f80307c == eVar.f80307c && s.g(this.f80308d, eVar.f80308d);
    }

    public final int hashCode() {
        int iE = q6.f.e(wr.g.j(this.f80305a.hashCode() * 31, 31, this.f80306b), 31, this.f80307c);
        Integer num = this.f80308d;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("DownloadResponse(fileDir=", this.f80305a, ", fileName=", this.f80306b, ", fileSize=");
        sbI.append(this.f80307c);
        sbI.append(", httpCode=");
        sbI.append(this.f80308d);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ e(String str, String str2, long j8, Integer num, int i14, j jVar) {
        this(str, str2, j8, (i14 & 8) != 0 ? null : num);
    }
}
