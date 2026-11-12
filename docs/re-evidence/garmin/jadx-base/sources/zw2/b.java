package zw2;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzw2/b;", "Lzw2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cx2.h f207273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f207274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f207275d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw2/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        BLUETOOTH_OFF,
        DEFAULT_ERROR
    }

    /* JADX INFO: renamed from: zw2.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C3867b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207279a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.BLUETOOTH_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f207279a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        this.f207273b = new cx2.h("DeviceErrorStatusTransform", null, 2, null);
        this.f207275d = a.DEFAULT_ERROR;
    }

    @Override // zw2.f
    public final void i(vw2.b bVar) {
        cx2.h hVar = this.f207273b;
        hVar.getClass();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            hVar.d(null, "registerForUpdates: Bluetooth is not supported for this phone.");
            this.f207275d = a.DEFAULT_ERROR;
            ((bv2.e) bVar).b("");
        } else if (defaultAdapter.isEnabled()) {
            this.f207275d = a.DEFAULT_ERROR;
            ((bv2.e) bVar).b("");
        } else {
            this.f207275d = a.BLUETOOTH_OFF;
            ((bv2.e) bVar).b("");
        }
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        c cVar = new c(this, bVar);
        this.f207274c = cVar;
        this.f207282a.registerReceiver(cVar, intentFilter);
    }

    @Override // zw2.f
    public final void j() {
        if (this.f207274c != null) {
            this.f207273b.b("Unregistering for Bluetooth changes");
            c cVar = this.f207274c;
            if (cVar != null) {
                this.f207282a.unregisterReceiver(cVar);
            } else {
                s.m("bluetoothReceiver");
                throw null;
            }
        }
    }
}
