package com.garmin.android.apps.connectmobile.devices.model;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/u;", "", "Lsd2/f;", "homeDevice", "", "allPairedDevicesCount", "allConnectedDevicesCount", "<init>", "(Lsd2/f;II)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd2.f f34316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34318c;

    public u(sd2.f fVar, int i14, int i15) {
        this.f34316a = fVar;
        this.f34317b = i14;
        this.f34318c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f34316a, uVar.f34316a) && this.f34317b == uVar.f34317b && this.f34318c == uVar.f34318c;
    }

    public final int hashCode() {
        sd2.f fVar = this.f34316a;
        return Integer.hashCode(this.f34318c) + q2.d(this.f34317b, (fVar == null ? 0 : fVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HomeDeviceInfo(homeDevice=");
        sb3.append(this.f34316a);
        sb3.append(", allPairedDevicesCount=");
        sb3.append(this.f34317b);
        sb3.append(", allConnectedDevicesCount=");
        return am.j.q(sb3, this.f34318c, ")");
    }
}
