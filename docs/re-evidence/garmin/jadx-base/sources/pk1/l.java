package pk1;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpk1/l;", "", "", "loginToken", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138300b;

    public l(String str, String str2) {
        str2.getClass();
        this.f138299a = str;
        this.f138300b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f138299a, lVar.f138299a) && p005kotlin.jvm.internal.s.g(this.f138300b, lVar.f138300b);
    }

    public final int hashCode() {
        String str = this.f138299a;
        return this.f138300b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return e0.g("OpenUrlState(loginToken=", this.f138299a, ", url=", this.f138300b, ")");
    }

    public /* synthetic */ l(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, str2);
    }
}
