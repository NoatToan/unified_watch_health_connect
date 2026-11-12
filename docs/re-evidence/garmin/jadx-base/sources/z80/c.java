package z80;

import android.bluetooth.BluetoothDevice;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lz80/c;", "", "<init>", "()V", "d", "a", "c", "b", "Lz80/c$a;", "Lz80/c$b;", "Lz80/c$c;", "Lz80/c$d;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz80/c$a;", "Lz80/c;", "Landroid/bluetooth/BluetoothDevice;", "device", "<init>", "(Landroid/bluetooth/BluetoothDevice;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BluetoothDevice f202980a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BluetoothDevice bluetoothDevice) {
            super(null);
            bluetoothDevice.getClass();
            this.f202980a = bluetoothDevice;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f202980a, ((a) obj).f202980a);
        }

        public final int hashCode() {
            return this.f202980a.hashCode();
        }

        public final String toString() {
            BluetoothDevice bluetoothDevice = this.f202980a;
            String name = bluetoothDevice.getName();
            String address = bluetoothDevice.getAddress();
            return am.j.q(p6.b.i("DeviceFound(", name, ", ", address, ", "), bluetoothDevice.getType(), ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz80/c$b;", "Lz80/c;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f202981a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 410224304;
        }

        public final String toString() {
            return "Failed";
        }
    }

    /* JADX INFO: renamed from: z80.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz80/c$c;", "Lz80/c;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3785c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3785c f202982a = new C3785c();

        private C3785c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3785c);
        }

        public final int hashCode() {
            return 2034426405;
        }

        public final String toString() {
            return "Finished";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz80/c$d;", "Lz80/c;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f202983a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -978543506;
        }

        public final String toString() {
            return "Started";
        }
    }

    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private c() {
    }
}
