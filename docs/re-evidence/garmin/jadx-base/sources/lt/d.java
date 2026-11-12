package lt;

import am.j;
import ht.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/d;", "Lht/t;", "", "focusType", "<init>", "(Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114821a;

    public d(String str) {
        str.getClass();
        this.f114821a = str;
    }

    @Override // ht.t
    public final String a() {
        return "Focus";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f114821a.equals(((d) obj).f114821a);
    }

    @Override // ht.t
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final String getF114821a() {
        return this.f114821a;
    }

    public final int hashCode() {
        return this.f114821a.hashCode();
    }

    public final String toString() {
        return j.m("FocusUserProperty(focusType=", this.f114821a, ")");
    }
}
