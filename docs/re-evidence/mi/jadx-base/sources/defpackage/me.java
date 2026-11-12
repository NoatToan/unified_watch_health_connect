package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class me extends n1t implements ta {
    public static final HashMap<String, qd> T = new a();
    public kvs P;
    public fos Q;
    public HMCallback<Object> R;
    public final Object S;

    public class a extends HashMap<String, qd> {
        public a() {
            putAll(op.b().a());
        }
    }

    public me(Context context, BluetoothDevice bluetoothDevice) {
        super(context, new n1t.e(bluetoothDevice, wbt.e));
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = new Object();
        t5t.d("HMBaseBleDevice", "support known device scan: " + wbt.e);
    }

    @Override // defpackage.n1t, defpackage.kd
    public sd Q() {
        return sd.MILI;
    }

    @Override // defpackage.n1t, defpackage.kd
    public void Y() {
        super.Y();
        kvs kvsVar = this.P;
        if (kvsVar != null) {
            kvsVar.d();
        }
    }

    @Override // defpackage.ta
    public void a(@NotNull bb bbVar) {
    }

    @Override // defpackage.ta
    public void b(@NotNull bb bbVar) {
    }

    public HeartHealthApi e1() {
        HealthModule healthModule = (HealthModule) n(HealthModule.class);
        return healthModule == null ? new hj() : healthModule.getHeartHealth();
    }

    public kvs f1() {
        if (this.P == null) {
            t5t.m("HMBaseBleDevice", "Create HeartRateController!");
            this.P = g1();
        }
        return this.P;
    }

    public synchronized kvs g1() {
        throw null;
    }

    public void h1() {
        if (V()) {
            f1().g();
        }
    }

    public void i1(kvs.b bVar) {
        if (V()) {
            f1().b(bVar);
        } else {
            bVar.onOpen(false);
        }
    }

    @Override // defpackage.n1t
    public void j0() {
        super.j0();
        kvs kvsVar = this.P;
        if (kvsVar != null) {
            kvsVar.a();
            this.P = null;
        }
        ycs ycsVarD0 = d0();
        t5t.d("HMBaseBleDevice", "connected step:" + ycsVarD0);
        if (ycsVarD0 != null) {
            l(ycsVarD0);
        }
        u0(39, 49, new HMCallback());
    }

    public boolean j1(ivs ivsVar) {
        throw null;
    }

    @Override // defpackage.kd
    public <T> T n(Class<T> cls) {
        if (cls != HealthModule.class) {
            return (T) super.n(cls);
        }
        g4s g4sVarO = O();
        return (T) new HealthModule(new hg(null, f1(), g4sVarO != null ? g4sVarO.A() : new Feature()));
    }

    @Override // defpackage.ta
    public boolean a() {
        return j1(new ivs(fd.ALERT_FIND));
    }

    public me(Context context, String str) {
        this(context, tet.e(str));
    }
}
