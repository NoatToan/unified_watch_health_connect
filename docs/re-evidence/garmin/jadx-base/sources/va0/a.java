package va0;

import android.bluetooth.BluetoothDevice;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lva0/a;", "", "Ll90/b;", "device", "", "Landroid/bluetooth/BluetoothDevice;", "scannedDevices", "", "scanFailed", "scanComplete", "<init>", "(Ll90/b;Ljava/util/List;ZZ)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l90.b f176567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<BluetoothDevice> f176568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f176569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f176570d;

    public a(l90.b bVar, List list, boolean z14, boolean z15, int i14, j jVar) {
        this(bVar, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15);
    }

    public static a a(a aVar, List list, boolean z14, boolean z15, int i14) {
        l90.b bVar = aVar.f176567a;
        if ((i14 & 2) != 0) {
            list = aVar.f176568b;
        }
        if ((i14 & 4) != 0) {
            z14 = aVar.f176569c;
        }
        if ((i14 & 8) != 0) {
            z15 = aVar.f176570d;
        }
        aVar.getClass();
        bVar.getClass();
        list.getClass();
        return new a(bVar, list, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f176567a, aVar.f176567a) && s.g(this.f176568b, aVar.f176568b) && this.f176569c == aVar.f176569c && this.f176570d == aVar.f176570d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176570d) + f.g(u0.b(this.f176567a.hashCode() * 31, 31, this.f176568b), 31, this.f176569c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BtcDeviceDiscoveryState(device=");
        sb3.append(this.f176567a);
        sb3.append(", scannedDevices=");
        sb3.append(this.f176568b);
        sb3.append(", scanFailed=");
        return com.airbnb.lottie.animation.keyframe.a.f(", scanComplete=", ")", sb3, this.f176569c, this.f176570d);
    }

    public a(l90.b bVar, List<BluetoothDevice> list, boolean z14, boolean z15) {
        bVar.getClass();
        list.getClass();
        this.f176567a = bVar;
        this.f176568b = list;
        this.f176569c = z14;
        this.f176570d = z15;
    }
}
