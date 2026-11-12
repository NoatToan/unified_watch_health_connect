package jw2;

import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012,\b\u0002\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005j\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljw2/a;", "", "", "shouldExitInstantiation", "isInvalidate", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "updatedSettingsResponse", "Ltv2/b;", "informationMessage", "<init>", "(ZZLjava/util/HashMap;Ltv2/b;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f101363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f101364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, Object> f101365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tv2.b f101366d;

    public /* synthetic */ a(boolean z14, boolean z15, HashMap map, tv2.b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : map, (i14 & 8) != 0 ? null : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f101363a == aVar.f101363a && this.f101364b == aVar.f101364b && s.g(this.f101365c, aVar.f101365c) && s.g(this.f101366d, aVar.f101366d);
    }

    public final int hashCode() {
        int iG = f.g(Boolean.hashCode(this.f101363a) * 31, 31, this.f101364b);
        HashMap<String, Object> map = this.f101365c;
        int iHashCode = (iG + (map == null ? 0 : map.hashCode())) * 31;
        tv2.b bVar = this.f101366d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        boolean z14 = this.f101363a;
        boolean z15 = this.f101364b;
        tv2.b bVar = this.f101366d;
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("DeviceSettingsResponse(shouldExitInstantiation=", ", isInvalidate=", ", updatedSettingsResponse=", z14, z15);
        sbM.append(this.f101365c);
        sbM.append(", informationMessage=");
        sbM.append(bVar);
        sbM.append(")");
        return sbM.toString();
    }

    public a(boolean z14, boolean z15, HashMap<String, Object> map, tv2.b bVar) {
        this.f101363a = z14;
        this.f101364b = z15;
        this.f101365c = map;
        this.f101366d = bVar;
    }

    public a() {
        this(false, false, null, null, 15, null);
    }
}
