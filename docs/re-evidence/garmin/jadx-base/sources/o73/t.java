package o73;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo73/t;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130777a;

    public t(String str) {
        str.getClass();
        this.f130777a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f130777a.equals(((t) obj).f130777a);
    }

    public final int hashCode() {
        return this.f130777a.hashCode();
    }

    public final String toString() {
        return am.j.m("Value(text=", this.f130777a, ")");
    }
}
