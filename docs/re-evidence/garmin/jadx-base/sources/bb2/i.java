package bb2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lbb2/i;", "", "", "deviceUnitId", "", "deviceMacAddress", "deviceProductNumber", "deviceName", "deviceImageUrl", "", "dialogShown", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f17360g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17366f;

    public i(long j8, String str, String str2, String str3, String str4, boolean z14) {
        kg.f.p(str, str2, str3, str4);
        this.f17361a = j8;
        this.f17362b = str;
        this.f17363c = str2;
        this.f17364d = str3;
        this.f17365e = str4;
        this.f17366f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17361a == iVar.f17361a && this.f17362b.equals(iVar.f17362b) && this.f17363c.equals(iVar.f17363c) && this.f17364d.equals(iVar.f17364d) && this.f17365e.equals(iVar.f17365e) && this.f17366f == iVar.f17366f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17366f) + wr.g.j(wr.g.j(wr.g.j(wr.g.j(Long.hashCode(this.f17361a) * 31, 31, this.f17362b), 31, this.f17363c), 31, this.f17364d), 31, this.f17365e);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f17361a, "DeviceNeedsBond(deviceUnitId=", ", deviceMacAddress=", this.f17362b);
        sn.a.t(sbK, ", deviceProductNumber=", this.f17363c, ", deviceName=", this.f17364d);
        com.airbnb.lottie.animation.keyframe.a.t(", deviceImageUrl=", this.f17365e, ", dialogShown=", sbK, this.f17366f);
        sbK.append(")");
        return sbK.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lbb2/i$a;", "", "<init>", "()V", "", "DEVICE_UNIT_ID", "Ljava/lang/String;", "DEVICE_MAC_ADDRESS", "DEVICE_PRODUCT_NUMBER", "DEVICE_NAME", "DEVICE_IMAGE_URL", "DEVICE_DIALOG_SHOWN", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
