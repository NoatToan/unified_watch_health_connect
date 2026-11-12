package uv;

import android.text.TextUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luv/e;", "", "", "updateVersionNumber", "releaseNotes", "url", "", "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f172886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f172887d;

    public /* synthetic */ e(String str, String str2, String str3, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? -1L : l14);
    }

    public final boolean a() {
        return (TextUtils.isEmpty(this.f172886c) || TextUtils.isEmpty(this.f172884a)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f172884a, eVar.f172884a) && s.g(this.f172885b, eVar.f172885b) && s.g(this.f172886c, eVar.f172886c) && s.g(this.f172887d, eVar.f172887d);
    }

    public final int hashCode() {
        String str = this.f172884a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f172885b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f172886c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.f172887d;
        return iHashCode3 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FirmwareUpdateItem(updateVersionNumber=", this.f172884a, ", releaseNotes=", this.f172885b, ", url=");
        sbI.append(this.f172886c);
        sbI.append(", messageId=");
        sbI.append(this.f172887d);
        sbI.append(")");
        return sbI.toString();
    }

    public e(String str, String str2, String str3, Long l14) {
        this.f172884a = str;
        this.f172885b = str2;
        this.f172886c = str3;
        this.f172887d = l14;
    }

    public e() {
        this(null, null, null, null, 15, null);
    }
}
