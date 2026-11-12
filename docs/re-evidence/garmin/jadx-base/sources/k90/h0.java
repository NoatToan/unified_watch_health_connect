package k90;

import android.bluetooth.BluetoothDevice;
import android.database.Cursor;
import android.database.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.GetDevicePairingState$isDevicePaired$4", f = "GetDevicePairingState.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f103495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothDevice f103496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, BluetoothDevice bluetoothDevice, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f103495a = i0Var;
        this.f103496b = bluetoothDevice;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f103495a, this.f103496b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th3;
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f103495a.f103498a.getClass();
        boolean z14 = false;
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = rd2.a.b().query("devices", new String[]{"mac_address", "gble_ltk", "gble_ediv", "gble_rand"}, "connection_type=? and mac_address is not null", new String[]{"btc"}, null, null, null);
                arrayList = null;
                while (cursorQuery != null) {
                    try {
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        byte[] blob = !cursorQuery.isNull(1) ? cursorQuery.getBlob(1) : null;
                        byte[] blob2 = !cursorQuery.isNull(2) ? cursorQuery.getBlob(2) : null;
                        byte[] blob3 = !cursorQuery.isNull(3) ? cursorQuery.getBlob(3) : null;
                        if (arrayList == null) {
                            arrayList = new ArrayList(3);
                        }
                        arrayList.add(new sd2.b(string, blob, blob2, blob3));
                    } catch (SQLException e4) {
                        e = e4;
                        cursor = cursorQuery;
                        rd2.j.f152077a.error("byBTConnectionType(btc)", (Throwable) e);
                        rd2.a.a(cursor);
                    } catch (Throwable th4) {
                        th3 = th4;
                        cursor = cursorQuery;
                        rd2.a.a(cursor);
                        throw th3;
                    }
                }
                rd2.a.a(cursorQuery);
            } catch (SQLException e14) {
                e = e14;
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = ((sd2.b) it.next()).f158640a;
                    if (str != null && str.equalsIgnoreCase(this.f103496b.getAddress())) {
                        z14 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z14);
        } catch (Throwable th5) {
            th3 = th5;
        }
    }
}
