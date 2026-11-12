package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.Toast;
import com.miot.spec.exception.ProtocolVersionIsLowException;
import com.miot.spec.exception.SpecException;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecWriteChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.plugin.update.PluginError;
import java.nio.BufferUnderflowException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p5n {
    public static Context h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, btl> f30031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, String> f30032b;
    public Map<String, Integer> c;
    public Set<String> d;
    public Handler e;
    public c f;
    public String g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30033a;

        public a(String str) {
            this.f30033a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(p5n.h, this.f30033a, 0).show();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p5n f30035a = new p5n(null);
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            btl btlVar;
            String action = intent.getAction();
            if ("action.miot.receive.specv2.ble.data".equals(action)) {
                p5n.this.p(intent.getStringExtra("mac"), intent.getByteArrayExtra("value"));
                return;
            }
            if (!"action.miot.write.specv2.ble.data.resp".equals(action)) {
                if (BluetoothConstants.ACTION_DEVICE_SUPPORT_BLE_SPEC_PROTOCOL.equals(action)) {
                    String stringExtra = intent.getStringExtra("mac");
                    p5n.this.m("receive support ble spec device mac", new Object[0]);
                    if (TextUtils.isEmpty(stringExtra)) {
                        return;
                    }
                    p5n.this.d.add(stringExtra);
                    return;
                }
                if ("com.xiaomi.smarthome.bluetooth.connect_status_changed".endsWith(action)) {
                    String stringExtra2 = intent.getStringExtra("key_device_address");
                    if (intent.getIntExtra("key_connect_status", 0) == 32) {
                        p5n.this.c.remove(stringExtra2);
                        return;
                    }
                    return;
                }
                return;
            }
            String stringExtra3 = intent.getStringExtra("mac");
            long longExtra = intent.getLongExtra("timestamp", 0L);
            p5n.this.m("broadcast timestamp: " + longExtra, new Object[0]);
            if (longExtra != SpecWriteChannelManager.mTimeFlag) {
                return;
            }
            int intExtra = intent.getIntExtra("code", -1);
            byte[] byteArrayExtra = intent.getByteArrayExtra("value");
            p5n.this.m("SpecReceiver ACTION_WRITE_SPEC_BLE_DATA_RESP, write callback code %d, send data:%s, %s", Integer.valueOf(intExtra), v73.a(byteArrayExtra), intent.getStringExtra("package"));
            String str = jwe.a(byteArrayExtra) + stringExtra3;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String str2 = (String) p5n.this.f30032b.get(str);
            if (TextUtils.isEmpty(str2) || (btlVar = (btl) p5n.this.f30031a.get(str2)) == null) {
                return;
            }
            try {
                btlVar.e(intExtra, null);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public /* synthetic */ p5n(o5n o5nVar) {
        this();
    }

    public static p5n i() {
        return b.f30035a;
    }

    public final void g(String str, Object... objArr) {
        n5n.a("SpecManager", str, objArr);
    }

    public int h(String str) {
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public void j(String str, List<q5n> list, wya wyaVar) {
        if (wyaVar == null) {
            g("getProperties handler is null ,return", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            g("getProperties error: mac is null,return", new Object[0]);
            wyaVar.onFail(-1001, "mac address cannot null");
        } else if (list != null && !list.isEmpty()) {
            s(str, new xya(str, list, wyaVar));
        } else {
            g("getProperty,list is emtpy", new Object[0]);
            wyaVar.onFail(-1003, "get Properties list is null or empty");
        }
    }

    public final void k(SpecException specException) {
        Map<String, btl> map = this.f30031a;
        if (map == null || map.isEmpty()) {
            return;
        }
        Iterator<String> it = this.f30031a.keySet().iterator();
        while (it.hasNext()) {
            btl btlVarRemove = this.f30031a.remove(it.next());
            if (btlVarRemove != null) {
                try {
                    btlVarRemove.e(specException.getErrorCode(), specException.getMessage());
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void l(Context context, String str, ryc rycVar) {
        h = context;
        this.g = str;
        m("init", new Object[0]);
        if (this.f == null) {
            this.f = new c();
            IntentFilter intentFilter = new IntentFilter("action.miot.receive.specv2.ble.data");
            intentFilter.addAction("action.miot.write.specv2.ble.data.resp");
            intentFilter.addAction(BluetoothConstants.ACTION_DEVICE_SUPPORT_BLE_SPEC_PROTOCOL);
            intentFilter.addAction("com.xiaomi.smarthome.bluetooth.connect_status_changed");
            if (Build.VERSION.SDK_INT >= 33) {
                h.registerReceiver(this.f, intentFilter, 2);
            } else {
                h.registerReceiver(this.f, intentFilter);
            }
        }
    }

    public final void m(String str, Object... objArr) {
        n5n.b("SpecManager", str, objArr);
    }

    public void n(String str) {
        Intent intent = new Intent("com.xiaomi.smarthome.ble.spec.notify");
        intent.putExtra("json", str);
        intent.setPackage(h.getApplicationContext().getPackageName());
        intent.putExtra("packageName", h.getApplicationContext().getPackageName());
        m("notify spec message to Rn, json=" + str, new Object[0]);
        h.sendBroadcast(intent);
    }

    public void o(zd8 zd8Var) {
        List<q5n> listI = zd8Var.i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mac", zd8Var.b());
            jSONObject.put("opcode", zd8Var.e());
            jSONObject.put("siid", zd8Var.i);
            jSONObject.put("eiid", zd8Var.h);
            jSONObject.put("objects", q5n.n(listI));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jSONObject.keys();
        n(jSONObject.toString());
    }

    public void p(String str, byte[] bArr) {
        m("receivePacket, value is " + v73.a(bArr), new Object[0]);
        try {
            fhj fhjVarA = ghj.a(str, bArr);
            if (fhjVarA == null) {
                g("receivePacket value parse result is null and return,value:" + v73.a(bArr), new Object[0]);
                return;
            }
            m("receive packet,after parse byte[],the content is: %s", fhjVarA.toString());
            if (fhjVarA.e() == 4) {
                q((ndi) fhjVarA);
                return;
            }
            if (fhjVarA.e() == 7) {
                o((zd8) fhjVarA);
                return;
            }
            btl btlVarRemove = this.f30031a.remove(fhjVarA.f());
            if (btlVarRemove != null) {
                try {
                    btlVarRemove.d(fhjVarA);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        } catch (ProtocolVersionIsLowException e2) {
            m("receive Packet, app protocol version < firmware protocol version, you should upgrade app", new Object[0]);
            e2.printStackTrace();
            k(e2);
        } catch (BufferUnderflowException unused) {
            TextUtils.isEmpty(this.g);
        }
    }

    public void q(ndi ndiVar) {
        List<q5n> listI = ndiVar.i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mac", ndiVar.b());
            jSONObject.put("opcode", ndiVar.e());
            jSONObject.put("objects", q5n.n(listI));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        n(jSONObject.toString());
    }

    public void r(String str, l5n l5nVar, r07 r07Var) {
        if (r07Var == null) {
            g("sendAction handler is null ,return", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            g("sendAction error: mac is null,return", new Object[0]);
            r07Var.onFail(-1001, "mac address cannot null");
        } else if (l5nVar != null) {
            s(str, new s07(str, l5nVar, r07Var));
        } else {
            g("sendAction ,specAction is null ,return", new Object[0]);
            r07Var.onFail(PluginError.INSTALL_ERROR_FOR_COPY_OR_FILE_CHECK, "send action,but action entity is null");
        }
    }

    public void s(String str, btl btlVar) {
        byte[] bArrF = btlVar.f();
        this.f30032b.put(jwe.a(bArrF) + str, btlVar.h());
        this.f30031a.put(btlVar.h(), btlVar);
        m("sendPacket ,value is :" + v73.a(bArrF), new Object[0]);
        Intent intent = new Intent("action.miot.write.specv2.ble.data");
        intent.putExtra("mac", str);
        intent.putExtra("value", bArrF);
        h.sendBroadcast(intent);
    }

    public void t(String str, zdi zdiVar) {
        s(str, new ctl(str, zdiVar));
    }

    public void u(String str, List<q5n> list, czl czlVar) {
        if (czlVar == null) {
            g("setProperties handler is null ,return", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            g("setProperties error: mac is null,return", new Object[0]);
            czlVar.onFail(-1001, "mac address cannot null");
        } else if (list != null && !list.isEmpty()) {
            s(str, new dzl(str, list, czlVar));
        } else {
            g("setProperty, list is empty", new Object[0]);
            czlVar.onFail(-1002, "set properties list is null or empty");
        }
    }

    public void v(String str) {
        this.e.post(new a(str));
    }

    public boolean w(String str) {
        return this.d.contains(str) || BluetoothCache.isSupportBleSupport(str);
    }

    public void x(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.put(str, Integer.valueOf(i));
    }

    public p5n() {
        this.f30031a = new ConcurrentHashMap();
        this.f30032b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new HashSet();
        this.e = new Handler(Looper.getMainLooper());
        this.f = null;
    }
}
