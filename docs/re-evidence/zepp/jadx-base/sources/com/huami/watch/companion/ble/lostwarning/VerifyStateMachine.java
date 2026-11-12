package com.huami.watch.companion.ble.lostwarning;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Message;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.watch.companion.ble.utils.GetString;
import com.huami.watch.companion.ble.utils.State;
import com.huami.watch.companion.ble.utils.StateMachine;
import com.huami.watch.util.Log;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public class VerifyStateMachine extends StateMachine {
    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 2;
    public static final int CONN_DEV_SUCCESS = 0;
    public static final int CONN_FAILED_NO_SUCH_DEV = -1;
    public static final int CONN_FAILED_STATE_ERR = -2;
    private static final int D = 3;
    private static final int E = 18;
    private static final int F = 51;
    private static final int G = 52;
    private static final int H = 64;
    private static final int I = 65;
    private static final int J = 66;
    private static final int K = 67;
    private static final int L = 68;
    private static final int M = 69;
    private static final int N = 70;
    private static final int O = 71;
    private static final int P = 80;
    private static final int Q = 81;
    private static final int R = 84;
    private static final int S = 85;
    private static final int T = 86;
    public static final int TDELAY_GATT_MESSAGE_MS = 1;
    private static final int U = 87;
    private static final boolean q = true;
    private static final String r = "VerifyStateMachine";
    private static final int s = 10000;
    private static final int t = 2000;
    private static final int u = 30000;
    private static final int v = 2000;
    private static final int w = 250;
    private static final int x = 1;
    private static final int y = 10000;
    private static final int z = -2;
    private BluetoothManager g;
    private b h;
    private Context i;
    private BluetoothDevice j;
    private State k;
    private e l;
    private f m;
    private d n;
    private c o;
    private com.huami.watch.companion.ble.lostwarning.b p;

    public final class a {
        public BluetoothGatt a;
        public UUID b;
        public byte[] c;

        public a(BluetoothGatt bluetoothGatt, UUID uuid, byte[] bArr) {
            this.c = new byte[bArr.length];
            this.a = bluetoothGatt;
            this.b = UUID.fromString(uuid.toString());
            System.arraycopy(bArr, 0, this.c, 0, bArr.length);
        }
    }

    public final class b extends LostWarningGattClient {
        public b(Context context, BluetoothManager bluetoothManager) {
            super(context, bluetoothManager);
        }

        @Override // com.huami.watch.companion.ble.lostwarning.LostWarningGattClient
        public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        }

        @Override // com.huami.watch.companion.ble.lostwarning.LostWarningGattClient
        public void c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            VerifyStateMachine verifyStateMachine = VerifyStateMachine.this;
            verifyStateMachine.sendMessageDelayed(81, verifyStateMachine.new a(bluetoothGatt, bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()), 1L);
        }

        @Override // com.huami.watch.companion.ble.lostwarning.LostWarningGattClient
        public void d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        }

        @Override // com.huami.watch.companion.ble.lostwarning.LostWarningGattClient
        public void e(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i == 0) {
                if (i2 == 2) {
                    VerifyStateMachine.this.sendMessageDelayed(64, bluetoothGatt, 1L);
                }
            } else if (i2 == 0) {
                VerifyStateMachine.this.sendMessageDelayed(65, bluetoothGatt, 1L);
            }
        }

        @Override // com.huami.watch.companion.ble.lostwarning.LostWarningGattClient
        public void g(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (i == 0) {
                byte[] value = bluetoothGattDescriptor.getValue();
                Log.d(LostWarningGattClient.f, "DescWrite: " + GetString.toString(value), new Object[0]);
                boolean z = value != null && VerifyStateMachine.G(value, LostWarningConstant.ENABLE_VALUE);
                VerifyStateMachine.this.sendMessageDelayed(87, Boolean.valueOf(z), 1L);
                Log.d(LostWarningGattClient.f, "DescWrite: enable = " + z, new Object[0]);
            }
        }

        @Override // com.huami.watch.companion.ble.lostwarning.LostWarningGattClient
        public void i(BluetoothGatt bluetoothGatt, int i) {
            if (i == 0) {
                VerifyStateMachine.this.sendMessageDelayed(69, bluetoothGatt, 1L);
            } else {
                VerifyStateMachine.this.sendMessageDelayed(68, Integer.valueOf(i), 1L);
            }
        }
    }

    public final class c extends State {
        private c() {
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public void enter() {
            g.a("SM_ClientConnected");
            VerifyStateMachine verifyStateMachine = VerifyStateMachine.this;
            verifyStateMachine.k = verifyStateMachine.o;
            VerifyStateMachine.this.H();
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public void exit() {
            g.b("SM_ClientConnected");
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public boolean processMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                VerifyStateMachine.this.I();
                return true;
            }
            String str = null;
            if (i == 3) {
                Log.d(VerifyStateMachine.r, "disconnect device ", new Object[0]);
                if (VerifyStateMachine.this.h != null) {
                    VerifyStateMachine.this.h.h();
                    VerifyStateMachine.this.h = null;
                }
                VerifyStateMachine.this.sendMessageDelayed(2, 2000L);
                return true;
            }
            if (i == 80) {
                VerifyStateMachine.this.sendMessage(0);
                VerifyStateMachine verifyStateMachine = VerifyStateMachine.this;
                verifyStateMachine.transitionTo(verifyStateMachine.l);
                Log.d(VerifyStateMachine.r, "Read source timeout.", new Object[0]);
                return true;
            }
            if (i == 81) {
                a aVar = (a) message.obj;
                Log.d(VerifyStateMachine.r, "CMD_CHAC_READ from " + aVar.b, new Object[0]);
                byte[] bArr = aVar.c;
                if (LostWarningConstant.SOURCE.equals(aVar.b)) {
                    VerifyStateMachine.this.removeMessages(80);
                    try {
                        str = new String(bArr, Charset.forName("UTF-8"));
                    } catch (Exception unused) {
                    }
                    if (VerifyStateMachine.this.L(str)) {
                        Log.d(VerifyStateMachine.r, "Verify success.", new Object[0]);
                    } else {
                        Log.d(VerifyStateMachine.r, "Verify fail. reset.", new Object[0]);
                        VerifyStateMachine.this.sendMessage(0);
                        VerifyStateMachine verifyStateMachine2 = VerifyStateMachine.this;
                        verifyStateMachine2.transitionTo(verifyStateMachine2.l);
                    }
                }
                return true;
            }
            if (i == 84) {
                a aVar2 = (a) message.obj;
                BluetoothGatt bluetoothGatt = aVar2.a;
                byte[] bArr2 = aVar2.c;
                if (LostWarningConstant.SOURCE.equals(aVar2.b)) {
                    Log.d(VerifyStateMachine.r, "Source changed. " + Arrays.toString(bArr2), new Object[0]);
                } else if (LostWarningConstant.CHAR_SERVICE_CHANGE.equals(aVar2.b)) {
                    Log.d(VerifyStateMachine.r, "Service changed. " + Arrays.toString(bArr2), new Object[0]);
                    VerifyStateMachine.this.sendMessageDelayed(69, bluetoothGatt, 10000L);
                }
                return true;
            }
            if (i == 86) {
                Log.d(VerifyStateMachine.r, "CMD_PERFORM", new Object[0]);
                byte[] bArrGetPerformData = LostWarningConstant.GetPerformData(message.arg1);
                Log.d(VerifyStateMachine.r, "  requestData: " + GetString.toString(bArrGetPerformData), new Object[0]);
                if (bArrGetPerformData != null) {
                    VerifyStateMachine.this.h.n(bArrGetPerformData);
                }
                return true;
            }
            if (i == 87) {
                boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                Log.d(VerifyStateMachine.r, "CMD_ON_PERFORM_DONE " + zBooleanValue, new Object[0]);
                VerifyStateMachine.this.J(zBooleanValue);
                return true;
            }
            switch (i) {
                case 65:
                    VerifyStateMachine.this.sendMessage(0);
                    VerifyStateMachine verifyStateMachine3 = VerifyStateMachine.this;
                    verifyStateMachine3.transitionTo(verifyStateMachine3.l);
                    Log.d(VerifyStateMachine.r, "gatt client disconnected", new Object[0]);
                    return true;
                case 66:
                    BluetoothGatt bluetoothGatt2 = (BluetoothGatt) message.obj;
                    VerifyStateMachine.this.sendMessageDelayed(67, 30000L);
                    bluetoothGatt2.discoverServices();
                    return true;
                case 67:
                    VerifyStateMachine.this.sendMessage(0);
                    VerifyStateMachine verifyStateMachine4 = VerifyStateMachine.this;
                    verifyStateMachine4.transitionTo(verifyStateMachine4.l);
                    Log.d(VerifyStateMachine.r, "Discovery Service discovery timeout", new Object[0]);
                    return true;
                case 68:
                    Log.d(VerifyStateMachine.r, "CMD_GATTC_SERV_DISC_ERR:" + message.obj, new Object[0]);
                    VerifyStateMachine.this.sendMessage(0);
                    VerifyStateMachine verifyStateMachine5 = VerifyStateMachine.this;
                    verifyStateMachine5.transitionTo(verifyStateMachine5.l);
                    return true;
                case 69:
                    VerifyStateMachine.this.removeMessages(67);
                    BluetoothGattService service = ((BluetoothGatt) message.obj).getService(LostWarningConstant.SERVICE);
                    Log.d(VerifyStateMachine.r, " service discovered , begin subject notification", new Object[0]);
                    if (service == null || service.getCharacteristic(LostWarningConstant.SOURCE) == null) {
                        VerifyStateMachine.this.sendMessage(70);
                    } else if (VerifyStateMachine.this.h.m(LostWarningConstant.SERVICE, LostWarningConstant.SOURCE)) {
                        VerifyStateMachine.this.sendMessageDelayed(80, 2000L);
                    } else {
                        VerifyStateMachine.this.sendMessage(71);
                    }
                    return true;
                case 70:
                    VerifyStateMachine.this.sendMessage(0);
                    VerifyStateMachine verifyStateMachine6 = VerifyStateMachine.this;
                    verifyStateMachine6.transitionTo(verifyStateMachine6.l);
                    Log.d(VerifyStateMachine.r, "Discovery Service not found", new Object[0]);
                    return true;
                case 71:
                    VerifyStateMachine.this.sendMessage(0);
                    VerifyStateMachine verifyStateMachine7 = VerifyStateMachine.this;
                    verifyStateMachine7.transitionTo(verifyStateMachine7.l);
                    Log.d(VerifyStateMachine.r, "Read source error.", new Object[0]);
                    return true;
                default:
                    return false;
            }
        }
    }

    public final class d extends State {
        private d() {
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public void enter() {
            g.a("SM_ClientConnecting");
            VerifyStateMachine verifyStateMachine = VerifyStateMachine.this;
            verifyStateMachine.k = verifyStateMachine.n;
            VerifyStateMachine.this.H();
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public void exit() {
            g.b("SM_ClientConnecting");
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public boolean processMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                VerifyStateMachine.this.I();
                return true;
            }
            if (i == 64) {
                VerifyStateMachine.this.removeMessages(52);
                VerifyStateMachine.this.sendMessage(66, (BluetoothGatt) message.obj);
                VerifyStateMachine verifyStateMachine = VerifyStateMachine.this;
                verifyStateMachine.transitionTo(verifyStateMachine.o);
                return true;
            }
            if (i != 51) {
                if (i != 52) {
                    return false;
                }
                Log.d(VerifyStateMachine.r, "connecting timeout", new Object[0]);
                VerifyStateMachine.this.sendMessage(0);
                VerifyStateMachine verifyStateMachine2 = VerifyStateMachine.this;
                verifyStateMachine2.transitionTo(verifyStateMachine2.l);
                return true;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) message.obj;
            Log.d(VerifyStateMachine.r, "connecting device: " + bluetoothDevice, new Object[0]);
            VerifyStateMachine.this.sendMessageDelayed(52, 10000L);
            VerifyStateMachine.this.h.f(bluetoothDevice);
            return true;
        }
    }

    public final class e extends State {
        private e() {
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public void enter() {
            g.a("SM_Reset");
            VerifyStateMachine verifyStateMachine = VerifyStateMachine.this;
            verifyStateMachine.k = verifyStateMachine.l;
            VerifyStateMachine.this.H();
            if (VerifyStateMachine.this.j != null) {
                VerifyStateMachine.this.j = null;
            }
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public void exit() {
            g.b("SM_Reset");
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public boolean processMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (VerifyStateMachine.this.h != null) {
                    VerifyStateMachine.this.h.h();
                    VerifyStateMachine.this.h = null;
                }
                if (VerifyStateMachine.this.h == null) {
                    VerifyStateMachine verifyStateMachine = VerifyStateMachine.this;
                    verifyStateMachine.h = verifyStateMachine.new b(verifyStateMachine.i, VerifyStateMachine.this.g);
                }
                VerifyStateMachine verifyStateMachine2 = VerifyStateMachine.this;
                verifyStateMachine2.transitionTo(verifyStateMachine2.m);
            } else if (i != 2) {
                VerifyStateMachine.this.K();
                VerifyStateMachine.this.sendMessage(1);
            } else {
                VerifyStateMachine.this.I();
            }
            return true;
        }
    }

    public final class f extends State {
        private f() {
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public void enter() {
            g.a("SM_ClientUnconnected");
            VerifyStateMachine verifyStateMachine = VerifyStateMachine.this;
            verifyStateMachine.k = verifyStateMachine.m;
            VerifyStateMachine.this.H();
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public void exit() {
            g.b("SM_ClientUnconnected");
        }

        @Override // com.huami.watch.companion.ble.utils.State, com.huami.watch.companion.ble.utils.IState
        public boolean processMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                VerifyStateMachine.this.I();
                return true;
            }
            if (i != 18) {
                return false;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) message.obj;
            Log.d(VerifyStateMachine.r, "Device Connected:" + bluetoothDevice, new Object[0]);
            VerifyStateMachine.this.sendMessageDelayed(51, bluetoothDevice, 1L);
            VerifyStateMachine.this.j = bluetoothDevice;
            VerifyStateMachine verifyStateMachine = VerifyStateMachine.this;
            verifyStateMachine.transitionTo(verifyStateMachine.n);
            return true;
        }
    }

    public static class g {
        private static String a;

        private g() {
        }

        public static void a(String str) {
            Log.d(VerifyStateMachine.r, "StateTran: [" + a + "] -> [" + str + "]", new Object[0]);
            a = str;
        }

        public static void b(String str) {
            Log.d(VerifyStateMachine.r, "StateTran: State exit:" + str, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerifyStateMachine(Context context) {
        super(r);
        this.l = new e();
        this.m = new f();
        this.n = new d();
        this.o = new c();
        this.i = context;
        this.g = (BluetoothManager) context.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH);
        addState(this.l);
        addState(this.m);
        addState(this.n);
        addState(this.o);
        setInitialState(this.l);
        start();
        sendMessage(-2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean G(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        com.huami.watch.companion.ble.lostwarning.b bVar = this.p;
        if (bVar != null) {
            bVar.onStateChanged(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        Log.d(r, "LostWarningStateMachine onDestroy", new Object[0]);
        K();
        quit();
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.g = null;
        this.i = null;
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean z2) {
        com.huami.watch.companion.ble.lostwarning.b bVar = this.p;
        if (bVar != null) {
            bVar.b(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        removeMessages(52);
        removeMessages(67);
        removeMessages(85);
        removeMessages(18);
        removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L(String str) {
        com.huami.watch.companion.ble.lostwarning.b bVar = this.p;
        if (bVar != null) {
            return bVar.a(str);
        }
        return false;
    }

    public int connectDevice(BluetoothDevice bluetoothDevice) {
        if (this.k != this.m) {
            return -2;
        }
        sendMessageDelayed(18, bluetoothDevice, 1L);
        return 0;
    }

    public void destroy() {
        sendMessage(3);
    }

    public int getState() {
        State state = this.k;
        if (state == this.l) {
            return 1;
        }
        if (state == this.m) {
            return 2;
        }
        return (state == this.n || state == this.o) ? 3 : 0;
    }

    public void setVerifyCallback(com.huami.watch.companion.ble.lostwarning.b bVar) {
        this.p = bVar;
    }

    public void verifyPerform(int i) {
        Log.d(r, "verifyPerform action: " + i, new Object[0]);
        Message message = new Message();
        message.what = 86;
        message.arg1 = i;
        sendMessageDelayed(message, 1L);
    }
}
