package ql1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lql1/a;", "", "", "shouldShow", "", "shopUrl", "<init>", "(ZLjava/lang/String;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145229b;

    public /* synthetic */ a(boolean z14, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f145228a == aVar.f145228a && s.g(this.f145229b, aVar.f145229b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f145228a) * 31;
        String str = this.f145229b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SleepEducationalUiContentState(shouldShow=" + this.f145228a + ", shopUrl=" + this.f145229b + ")";
    }

    public a(boolean z14, String str) {
        this.f145228a = z14;
        this.f145229b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
