package com.garmin.android.apps.connectmobile.devices.targetedselection;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/p;", "", "", "isLoading", "", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l;", "devices", "", "warningMessageId", "isDeviceSelectionFinished", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l$a;", "currentSelectedDevice", "<init>", "(ZLjava/util/List;Ljava/lang/Integer;ZLcom/garmin/android/apps/connectmobile/devices/targetedselection/l$a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<l> f34682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f34683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l.a f34685e;

    /* JADX WARN: Multi-variable type inference failed */
    public p(boolean z14, List<? extends l> list, Integer num, boolean z15, l.a aVar) {
        list.getClass();
        this.f34681a = z14;
        this.f34682b = list;
        this.f34683c = num;
        this.f34684d = z15;
        this.f34685e = aVar;
    }

    public static p a(p pVar, boolean z14, List list, Integer num, l.a aVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = pVar.f34681a;
        }
        boolean z15 = z14;
        if ((i14 & 2) != 0) {
            list = pVar.f34682b;
        }
        List list2 = list;
        if ((i14 & 4) != 0) {
            num = pVar.f34683c;
        }
        Integer num2 = num;
        boolean z16 = (i14 & 8) != 0 ? pVar.f34684d : true;
        if ((i14 & 16) != 0) {
            aVar = pVar.f34685e;
        }
        return new p(z15, list2, num2, z16, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f34681a == pVar.f34681a && this.f34682b.equals(pVar.f34682b) && s.g(this.f34683c, pVar.f34683c) && this.f34684d == pVar.f34684d && s.g(this.f34685e, pVar.f34685e);
    }

    public final int hashCode() {
        int iB = u0.b(Boolean.hashCode(this.f34681a) * 31, 31, this.f34682b);
        Integer num = this.f34683c;
        int iG = q6.f.g((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.f34684d);
        l.a aVar = this.f34685e;
        return iG + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "UiState(isLoading=" + this.f34681a + ", devices=" + this.f34682b + ", warningMessageId=" + this.f34683c + ", isDeviceSelectionFinished=" + this.f34684d + ", currentSelectedDevice=" + this.f34685e + ")";
    }
}
