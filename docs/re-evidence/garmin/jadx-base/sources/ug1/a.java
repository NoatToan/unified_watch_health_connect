package ug1;

import am.j;
import java.util.List;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lug1/a;", "", "", "Lqg1/b;", "backups", "", "currentDeviceName", "", "currentDeviceId", "<init>", "(Ljava/util/List;Ljava/lang/String;J)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<qg1.b> f170636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f170638c;

    public a(List<qg1.b> list, String str, long j8) {
        list.getClass();
        str.getClass();
        this.f170636a = list;
        this.f170637b = str;
        this.f170638c = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f170636a.equals(aVar.f170636a) && this.f170637b.equals(aVar.f170637b) && this.f170638c == aVar.f170638c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f170638c) + g.j(this.f170636a.hashCode() * 31, 31, this.f170637b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BackupStateDTO(backups=");
        sb3.append(this.f170636a);
        sb3.append(", currentDeviceName=");
        sb3.append(this.f170637b);
        sb3.append(", currentDeviceId=");
        return j.i(this.f170638c, ")", sb3);
    }
}
