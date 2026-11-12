package lj1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Llj1/a;", "", "", "showDevicePriority", "Lgj1/b;", "primaryWearableDeviceDTO", "", "primaryWearableSyncTime", "primaryTrainingDeviceDTO", "primaryTrainingDeviceSyncTime", "showPrimaryWearable", "showPrimaryTraining", "<init>", "(ZLgj1/b;Ljava/lang/String;Lgj1/b;Ljava/lang/String;ZZ)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gj1.b f113036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gj1.b f113038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f113039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f113040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f113041g;

    public /* synthetic */ a(boolean z14, gj1.b bVar, String str, gj1.b bVar2, String str2, boolean z15, boolean z16, int i14, j jVar) {
        this(z14, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : bVar2, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? false : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f113035a == aVar.f113035a && s.g(this.f113036b, aVar.f113036b) && s.g(this.f113037c, aVar.f113037c) && s.g(this.f113038d, aVar.f113038d) && s.g(this.f113039e, aVar.f113039e) && this.f113040f == aVar.f113040f && this.f113041g == aVar.f113041g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f113035a) * 31;
        gj1.b bVar = this.f113036b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f113037c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        gj1.b bVar2 = this.f113038d;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str2 = this.f113039e;
        return Boolean.hashCode(this.f113041g) + f.g((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f113040f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DevicePriorityUIModel(showDevicePriority=");
        sb3.append(this.f113035a);
        sb3.append(", primaryWearableDeviceDTO=");
        sb3.append(this.f113036b);
        sb3.append(", primaryWearableSyncTime=");
        sb3.append(this.f113037c);
        sb3.append(", primaryTrainingDeviceDTO=");
        sb3.append(this.f113038d);
        sb3.append(", primaryTrainingDeviceSyncTime=");
        h.C(this.f113039e, ", showPrimaryWearable=", ", showPrimaryTraining=", sb3, this.f113040f);
        return hb.a.k(sb3, this.f113041g, ")");
    }

    public a(boolean z14, gj1.b bVar, String str, gj1.b bVar2, String str2, boolean z15, boolean z16) {
        this.f113035a = z14;
        this.f113036b = bVar;
        this.f113037c = str;
        this.f113038d = bVar2;
        this.f113039e = str2;
        this.f113040f = z15;
        this.f113041g = z16;
    }
}
