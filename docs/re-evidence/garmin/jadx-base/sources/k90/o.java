package k90;

import android.bluetooth.BluetoothDevice;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk90/o;", "Lk90/n;", "Lk90/i0;", "getDevicePairingState", "Lo53/z;", "ioDispatcher", "<init>", "(Lk90/i0;Lo53/z;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f103585c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f103586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.z f103587b;

    static {
        new a(null);
    }

    public o(i0 i0Var, o53.z zVar) {
        i0Var.getClass();
        zVar.getClass();
        this.f103586a = i0Var;
        this.f103587b = zVar;
    }

    @Override // k90.n
    public final Object a(BluetoothDevice bluetoothDevice, r.a.C1987a c1987a) {
        return ge1.b.e0(this.f103587b, new p(bluetoothDevice, this, null), c1987a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk90/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(i0 i0Var, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(i0Var, zVar);
    }
}
