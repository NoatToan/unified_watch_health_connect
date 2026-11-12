package fi1;

import android.location.Location;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfi1/c;", "", "Lfi1/b;", "deviceLocation", "startLocation", "<init>", "(Lfi1/b;Lfi1/b;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f71771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f71772c;

    public c(b bVar, b bVar2) {
        Float fValueOf;
        this.f71770a = bVar;
        this.f71771b = bVar2;
        if (bVar2 == null || bVar == null) {
            fValueOf = null;
        } else {
            float[] fArr = new float[1];
            Location.distanceBetween(bVar2.f71766a, bVar2.f71767b, bVar.f71766a, bVar.f71767b, fArr);
            fValueOf = Float.valueOf(fArr[0]);
        }
        this.f71772c = fValueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f71770a, cVar.f71770a) && s.g(this.f71771b, cVar.f71771b);
    }

    public final int hashCode() {
        b bVar = this.f71770a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        b bVar2 = this.f71771b;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceNavigationDirections(deviceLocation=" + this.f71770a + ", startLocation=" + this.f71771b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(b bVar, b bVar2, int i14, j jVar) {
        bVar = (i14 & 1) != 0 ? null : bVar;
        this(bVar, (i14 & 2) != 0 ? bVar : bVar2);
    }
}
