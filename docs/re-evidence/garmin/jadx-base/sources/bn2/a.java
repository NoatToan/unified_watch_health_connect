package bn2;

import an2.l;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import o13.m;
import o13.p;
import o13.t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbn2/a;", "Landroid/content/BroadcastReceiver;", "Lbn2/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lbn2/b;)V", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f19078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f19080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19081d;

    /* JADX INFO: renamed from: bn2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C0276a extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0276a f19082a = new C0276a();

        public C0276a() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            l.f4589a.getClass();
            return LoggerFactory.getLogger("DM#".concat("BTBondReceiver"));
        }
    }

    public a(b bVar) {
        bVar.getClass();
        this.f19078a = bVar;
        this.f19079b = u0.e(new p(10, "NONE"), new p(12, "BONDED"), new p(11, "BOND_BONDING"));
        this.f19080c = m.b(C0276a.f19082a);
    }

    public final void a(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
            if (!this.f19081d) {
                context.getApplicationContext().registerReceiver(this, intentFilter);
            }
        } finally {
            this.f19081d = true;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            return;
        }
        try {
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", bluetoothDevice.getBondState());
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
            Logger logger = (Logger) this.f19080c.getValue();
            String address = bluetoothDevice.getAddress();
            Integer numValueOf = Integer.valueOf(intExtra);
            ?? r14 = this.f19079b;
            logger.trace("onReceive device:" + address + " state: " + r14.get(numValueOf) + ", previousState: " + r14.get(Integer.valueOf(intExtra2)));
            this.f19078a.f6(bluetoothDevice, intExtra, intExtra2);
        } catch (SecurityException unused) {
        }
    }
}
