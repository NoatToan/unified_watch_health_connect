package ev0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lev0/e;", "", "", "profilePrivacy", "activeSessionPrivacy", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66161b;

    public e(String str, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? ge2.b.OnlyMe.f77016a : str, (i14 & 2) != 0 ? ge2.b.OnlyMe.f77016a : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f66160a, eVar.f66160a) && s.g(this.f66161b, eVar.f66161b);
    }

    public final int hashCode() {
        return this.f66161b.hashCode() + (this.f66160a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("LiveTrackProfileSettingsUiModel(profilePrivacy=", this.f66160a, ", activeSessionPrivacy=", this.f66161b, ")");
    }

    public e(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f66160a = str;
        this.f66161b = str2;
    }

    public e() {
        this(null, null, 3, null);
    }
}
