package q90;

import android.bluetooth.BluetoothDevice;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public interface d {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq90/d$b;", "Lq90/d;", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "", "dualBleMacAddress", "Ll90/b;", "compatibleDevice", "<init>", "(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ll90/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BluetoothDevice f143508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f143509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l90.b f143510c;

        public b(BluetoothDevice bluetoothDevice, String str, l90.b bVar) {
            bluetoothDevice.getClass();
            bVar.getClass();
            this.f143508a = bluetoothDevice;
            this.f143509b = str;
            this.f143510c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f143508a.equals(bVar.f143508a) && s.g(this.f143509b, bVar.f143509b) && this.f143510c.equals(bVar.f143510c);
        }

        @Override // q90.d
        public final String getMacAddress() {
            String address = this.f143508a.getAddress();
            address.getClass();
            return address;
        }

        @Override // q90.d
        public final String getProductDisplayName() {
            return this.f143510c.f111521f;
        }

        @Override // q90.d
        public final String getProductNumber() {
            return this.f143510c.f111522g;
        }

        public final int hashCode() {
            int iHashCode = this.f143508a.hashCode() * 31;
            String str = this.f143509b;
            return this.f143510c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "BtcPairingDevice(bluetoothDevice=" + this.f143508a + ", dualBleMacAddress=" + this.f143509b + ", compatibleDevice=" + this.f143510c + ")";
        }
    }

    String getMacAddress();

    String getProductDisplayName();

    String getProductNumber();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq90/d$a;", "Lq90/d;", "Lbm2/a;", "discoveredDevice", "Ll90/b;", "compatibleDevice", "Lbm2/d;", "deviceInfo", "<init>", "(Lbm2/a;Ll90/b;Lbm2/d;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bm2.a f143505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.b f143506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bm2.d f143507c;

        public a(bm2.a aVar, l90.b bVar, bm2.d dVar) {
            aVar.getClass();
            bVar.getClass();
            this.f143505a = aVar;
            this.f143506b = bVar;
            this.f143507c = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f143505a, aVar.f143505a) && s.g(this.f143506b, aVar.f143506b) && s.g(this.f143507c, aVar.f143507c);
        }

        @Override // q90.d
        public final String getMacAddress() {
            String str = this.f143505a.f18886a;
            str.getClass();
            return str;
        }

        @Override // q90.d
        public final String getProductDisplayName() {
            return this.f143506b.f111521f;
        }

        @Override // q90.d
        public final String getProductNumber() {
            return this.f143506b.f111522g;
        }

        public final int hashCode() {
            int iHashCode = (this.f143506b.hashCode() + (this.f143505a.hashCode() * 31)) * 31;
            bm2.d dVar = this.f143507c;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            return "BlePairingDevice(discoveredDevice=" + this.f143505a + ", compatibleDevice=" + this.f143506b + ", deviceInfo=" + this.f143507c + ")";
        }

        public /* synthetic */ a(bm2.a aVar, l90.b bVar, bm2.d dVar, int i14, j jVar) {
            this(aVar, bVar, (i14 & 4) != 0 ? null : dVar);
        }
    }
}
