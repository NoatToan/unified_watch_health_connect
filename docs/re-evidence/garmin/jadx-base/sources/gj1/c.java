package gj1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgj1/c;", "", "Lej1/b;", "deviceType", "Lgj1/b;", "deviceDTO", "", "deviceCount", "", "isShowManagedDeviceMenu", "", "alertMessage", "<init>", "(Lej1/b;Lgj1/b;IZLjava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej1.b f77652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f77653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f77655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f77656e;

    public /* synthetic */ c(ej1.b bVar, b bVar2, int i14, boolean z14, String str, int i15, j jVar) {
        this(bVar, (i15 & 2) != 0 ? null : bVar2, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? false : z14, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f77652a == cVar.f77652a && s.g(this.f77653b, cVar.f77653b) && this.f77654c == cVar.f77654c && this.f77655d == cVar.f77655d && s.g(this.f77656e, cVar.f77656e);
    }

    public final int hashCode() {
        int iHashCode = this.f77652a.hashCode() * 31;
        b bVar = this.f77653b;
        return this.f77656e.hashCode() + q6.f.g(q2.d(this.f77654c, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31, this.f77655d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PrimaryDeviceReplaceDeviceInfo(deviceType=");
        sb3.append(this.f77652a);
        sb3.append(", deviceDTO=");
        sb3.append(this.f77653b);
        sb3.append(", deviceCount=");
        fb1.c.x(sb3, this.f77654c, ", isShowManagedDeviceMenu=", this.f77655d, ", alertMessage=");
        return am.j.o(this.f77656e, ")", sb3);
    }

    public c(ej1.b bVar, b bVar2, int i14, boolean z14, String str) {
        bVar.getClass();
        str.getClass();
        this.f77652a = bVar;
        this.f77653b = bVar2;
        this.f77654c = i14;
        this.f77655d = z14;
        this.f77656e = str;
    }
}
