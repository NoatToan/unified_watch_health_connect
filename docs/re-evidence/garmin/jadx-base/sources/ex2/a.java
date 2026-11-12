package ex2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lex2/a;", "", "", "version", "", "downloadUrl", "locale", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f66930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66932c;

    public a(Float f14, String str, String str2) {
        this.f66930a = f14;
        this.f66931b = str;
        this.f66932c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f66930a, aVar.f66930a) && p005kotlin.jvm.internal.s.g(this.f66931b, aVar.f66931b) && p005kotlin.jvm.internal.s.g(this.f66932c, aVar.f66932c);
    }

    public final int hashCode() {
        Float f14 = this.f66930a;
        int iHashCode = (f14 == null ? 0 : f14.hashCode()) * 31;
        String str = this.f66931b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f66932c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GSUPStringMetaData(version=");
        sb3.append(this.f66930a);
        sb3.append(", downloadUrl=");
        sb3.append(this.f66931b);
        sb3.append(", locale=");
        return am.j.o(this.f66932c, ")", sb3);
    }
}
