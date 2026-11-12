package pt;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpt/v;", "", "", "wrapText", "", "wrapLineCount", "<init>", "(Ljava/lang/String;I)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140607b;

    public v(String str, int i14) {
        str.getClass();
        this.f140606a = str;
        this.f140607b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f140606a.equals(vVar.f140606a) && this.f140607b == vVar.f140607b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140607b) + (this.f140606a.hashCode() * 31);
    }

    public final String toString() {
        return c22.t.e(this.f140607b, "WrapLineText(wrapText=", this.f140606a, ", wrapLineCount=", ")");
    }
}
