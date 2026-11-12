package com.airoha.android.lib.transport;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.airoha.android.lib.logdump.AirorhaLinkDbgLogRaw;
import com.airoha.android.lib.physical.IPhysical;
import com.airoha.android.lib.physical.ble.AirohaBleController;
import com.airoha.android.lib.physical.spp.AirohaSppController;
import com.airoha.android.lib.physical.spp.AirohaSppControllerCh2;
import com.airoha.android.lib.physical.spp.AirohaSppControllerCh3;
import com.airoha.android.lib.transport.Commander.QueuedCmdsCommander;
import com.airoha.android.lib.transport.PacketParser.OnAirohaRespTimeoutListener;
import com.airoha.android.lib.transport.PacketParser.OnRaceMmiPacketListener;
import com.airoha.android.lib.transport.PacketParser.OnRaceMmiRoleSwitchIndListener;
import com.airoha.android.lib.transport.PacketParser.OnRacePacketListener;
import com.airoha.android.lib.transport.PacketParser.RacePacketByH4Dispatcher;
import com.airoha.android.lib.transport.connection.OnAirohaConnStateListener;
import com.airoha.android.lib.util.Converter;
import com.airoha.liblogger.AirohaLogger;
import com.facebook.login.widget.ToolTipPopup;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaLink implements ITransport {
    private static final int C = 3000;
    private static final int D = 20;
    private static final int E = 5;
    public static final String UUID_AIROHA_SPP_STR = "00000000-0000-0000-0099-AABBCCDDEEFF";
    public static final String UUID_COMMON_SPP_STR = "00000000-0000-1000-8000-00805F9B34FB";
    private volatile Timer B;
    private final Context b;
    private BluetoothManager d;
    private BluetoothAdapter e;
    private QueuedCmdsCommander f;
    private ConcurrentHashMap<String, OnAirohaConnStateListener> g;
    private ConcurrentHashMap<String, OnAirohaRespTimeoutListener> h;
    private IPhysical i;
    private RacePacketByH4Dispatcher j;
    private AirorhaLinkDbgLogRaw l;
    public UUID mCurrentUuid;
    private volatile Timer p;
    private Timer q;
    private Timer r;
    private String t;
    private volatile Timer x;
    private volatile Timer z;
    private final String a = "AirohaLink";
    private boolean c = false;
    private AirohaLogger k = AirohaLogger.getInstance();
    private int m = 6000;
    private int n = 3000;
    private int o = 10000;
    private boolean s = false;
    private final Object u = new Object();
    private final Object v = new Object();
    private boolean w = false;
    private int y = 0;
    private int A = 0;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AirohaLink.this.y = 0;
            AirohaLink airohaLink = AirohaLink.this;
            airohaLink.p(airohaLink.z);
            AirohaLink.this.z = null;
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (AirohaLink.this.e == null || !AirohaLink.this.e.isEnabled()) {
                return;
            }
            AirohaLink.this.logToFile("AirohaLink", "mConnectionErrorCounter = " + AirohaLink.this.y);
            AirohaLink.this.logToFile("AirohaLink", "MAX_CONNECTION_ERROR = 20");
            if (AirohaLink.this.y >= 20) {
                AirohaLink.this.logToFile("AirohaLink", "Connection Timeout!!");
                AirohaLink airohaLink = AirohaLink.this;
                airohaLink.p(airohaLink.x);
                AirohaLink.this.x = null;
                for (OnAirohaConnStateListener onAirohaConnStateListener : AirohaLink.this.g.values()) {
                    if (onAirohaConnStateListener != null) {
                        onAirohaConnStateListener.OnConnectionTimeout();
                    }
                }
                AirohaLink.this.y = 0;
                return;
            }
            AirohaLink.this.logToFile("AirohaLink", "checking profile");
            int profileConnectionState = AirohaLink.this.e.getProfileConnectionState(2);
            AirohaLink.this.logToFile("AirohaLink", "profile state: " + profileConnectionState);
            if (profileConnectionState != 2) {
                AirohaLink.h(AirohaLink.this);
                return;
            }
            SystemClock.sleep(1000L);
            AirohaLink airohaLink2 = AirohaLink.this;
            airohaLink2.c = airohaLink2.reConnect();
            AirohaLink.this.logToFile("AirohaLink", "mIsConnected: " + AirohaLink.this.c);
            if (!AirohaLink.this.c) {
                AirohaLink.h(AirohaLink.this);
                return;
            }
            AirohaLink airohaLink3 = AirohaLink.this;
            airohaLink3.p(airohaLink3.x);
            AirohaLink.this.x = null;
            AirohaLink.this.s();
        }
    }

    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AirohaLink.this.logToFile("AirohaLink", "CMD_NEED_RESP(0x5A) send but not responded. Timeout!!!");
            Iterator it2 = AirohaLink.this.h.values().iterator();
            while (it2.hasNext()) {
                ((OnAirohaRespTimeoutListener) it2.next()).OnRespTimeout();
            }
            AirohaLink airohaLink = AirohaLink.this;
            airohaLink.p(airohaLink.p);
            AirohaLink.this.p = null;
        }
    }

    public AirohaLink(Context context) {
        this.e = null;
        this.g = null;
        this.h = null;
        this.b = context;
        logToFile("AirohaLink", "Ver:1.3.1.1225.2");
        if (this.d == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH);
            this.d = bluetoothManager;
            if (bluetoothManager == null) {
                Log.e("AirohaLink", "Unable to initialize BluetoothManager.");
            }
        }
        BluetoothAdapter adapter = this.d.getAdapter();
        this.e = adapter;
        if (adapter == null) {
            Log.e("AirohaLink", "Unable to obtain a BluetoothAdapter.");
        }
        this.f = new QueuedCmdsCommander();
        this.j = new RacePacketByH4Dispatcher(this);
        this.g = new ConcurrentHashMap<>();
        this.h = new ConcurrentHashMap<>();
    }

    public static /* synthetic */ int h(AirohaLink airohaLink) {
        int i = airohaLink.y + 1;
        airohaLink.y = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Timer timer) {
        if (timer != null) {
            timer.cancel();
        }
    }

    private synchronized void q() {
        logToFile("AirohaLink", "checkQueuedActions set responded");
        QueuedCmdsCommander queuedCmdsCommander = this.f;
        queuedCmdsCommander.isResponded = true;
        byte[] nextCmd = queuedCmdsCommander.getNextCmd();
        if (nextCmd != null) {
            sendCommand(nextCmd);
        } else {
            logToFile("AirohaLink", "no nextCmd");
        }
    }

    private void r(byte[] bArr) {
        AirorhaLinkDbgLogRaw airorhaLinkDbgLogRaw = this.l;
        if (airorhaLinkDbgLogRaw == null) {
            return;
        }
        airorhaLinkDbgLogRaw.addRawBytesToQueue(bArr);
    }

    @Override // com.airoha.android.lib.transport.ITransport
    public void OnPhysicalConnected(String str) {
        this.c = true;
        this.w = false;
        if (this.x != null) {
            this.x.cancel();
        }
        logToFile("AirohaLink", "physical connected");
        for (OnAirohaConnStateListener onAirohaConnStateListener : this.g.values()) {
            if (onAirohaConnStateListener != null) {
                onAirohaConnStateListener.OnConnected(str);
            }
        }
    }

    @Override // com.airoha.android.lib.transport.ITransport
    public void OnPhysicalConnectionError(String str) {
    }

    @Override // com.airoha.android.lib.transport.ITransport
    public void OnPhysicalDisconnected(String str) {
        this.c = false;
        logToFile("AirohaLink", "physical disconnected");
        for (OnAirohaConnStateListener onAirohaConnStateListener : this.g.values()) {
            if (onAirohaConnStateListener != null) {
                onAirohaConnStateListener.OnDisconnected();
            }
        }
        if (this.w) {
            return;
        }
        if (this.x != null) {
            this.x.cancel();
        }
        logToFile("AirohaLink", "non active disconnect");
        if (this.z != null) {
            logToFile("AirohaLink", "mConnectionErrorCounter = " + this.y);
            this.y = this.y + 1;
        }
        if (this.y < 20) {
            this.x = new Timer();
            this.x.schedule(new b(), 3000L, 3000L);
            return;
        }
        for (OnAirohaConnStateListener onAirohaConnStateListener2 : this.g.values()) {
            if (onAirohaConnStateListener2 != null) {
                onAirohaConnStateListener2.OnUnexpectedDisconnected();
            }
        }
        this.y = 0;
    }

    public boolean connect(String str, UUID uuid) throws IllegalArgumentException {
        boolean zConnect;
        logToFile("AirohaLink", "connect()");
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            throw new IllegalArgumentException(str + " is not a valid Bluetooth address");
        }
        this.mCurrentUuid = uuid;
        this.e.cancelDiscovery();
        if (this.c) {
            return true;
        }
        synchronized (this.u) {
            this.t = str;
            BluetoothDevice remoteDevice = this.e.getRemoteDevice(str);
            remoteDevice.getName();
            logToFile("AirohaLink", "Ver:1.3.1.1225.2");
            logToFile("AirohaLink", "prepare connect");
            this.f.clearQueue();
            int type = remoteDevice.getType();
            Log.d("AirohaLink", "device type:" + type);
            IPhysical iPhysical = this.i;
            if (iPhysical != null) {
                iPhysical.disconnect();
                this.i = null;
                this.c = false;
            }
            if (type == 2) {
                this.i = new AirohaBleController(this);
            } else {
                this.i = new AirohaSppController(this, this.mCurrentUuid);
            }
            for (OnAirohaConnStateListener onAirohaConnStateListener : this.g.values()) {
                if (onAirohaConnStateListener != null) {
                    onAirohaConnStateListener.OnConnecting();
                }
            }
            zConnect = this.i.connect(str);
        }
        return zConnect;
    }

    public boolean connectBle(String str) {
        logToFile("AirohaLink", "connectBle");
        this.f.clearQueue();
        AirohaBleController airohaBleController = new AirohaBleController(this);
        this.i = airohaBleController;
        return airohaBleController.connect(str);
    }

    public boolean connectSpp(String str) throws IllegalArgumentException {
        logToFile("AirohaLink", "connectSpp");
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            this.f.clearQueue();
            AirohaSppController airohaSppController = new AirohaSppController(this, this.mCurrentUuid);
            this.i = airohaSppController;
            return airohaSppController.connect(str);
        }
        throw new IllegalArgumentException(str + " is not a valid Bluetooth address");
    }

    public void disconnect() {
        logToFile("AirohaLink", "disconnect()");
        synchronized (this.v) {
            this.w = true;
            if (this.p != null) {
                this.p.cancel();
                this.p = null;
            }
            if (this.z != null) {
                this.z.cancel();
                this.z = null;
            }
            if (this.x != null) {
                this.x.cancel();
                this.x = null;
            }
            if (this.i != null) {
                for (OnAirohaConnStateListener onAirohaConnStateListener : this.g.values()) {
                    if (onAirohaConnStateListener != null) {
                        onAirohaConnStateListener.OnDisConnecting();
                    }
                }
                this.i.disconnect();
                logToFile("AirohaLink", "mPhysical.disconnect");
                this.i = null;
            }
            QueuedCmdsCommander queuedCmdsCommander = this.f;
            if (queuedCmdsCommander != null) {
                queuedCmdsCommander.clearQueue();
                this.f.isResponded = true;
            }
            this.c = false;
        }
    }

    public Object doEngineeringCmd(String str, Object obj) {
        if (!str.equalsIgnoreCase("SPP_SERVER_START_LISTEN")) {
            return Boolean.valueOf(this.c);
        }
        IPhysical iPhysical = this.i;
        if (iPhysical != null) {
            iPhysical.disconnect();
            this.i = null;
            this.c = false;
        }
        AirohaSppController airohaSppController = new AirohaSppController(this, this.mCurrentUuid);
        this.i = airohaSppController;
        return Boolean.valueOf(airohaSppController.listen());
    }

    @Override // com.airoha.android.lib.transport.ITransport
    public Context getContext() {
        return this.b;
    }

    public String getSdkVer() {
        return "1.3.1.1225.2";
    }

    @Override // com.airoha.android.lib.transport.ITransport
    public void handlePhysicalPacket(byte[] bArr) {
        logToFile("AirohaLink", "Rx packet :  " + Converter.byte2HexStr(bArr));
        r(bArr);
        if (this.p != null) {
            this.p.cancel();
        }
        this.j.parseSend(bArr);
        if (RacePacketByH4Dispatcher.isRaceResponse(bArr)) {
            q();
        }
    }

    public boolean isConnected() {
        return this.c;
    }

    @Override // com.airoha.android.lib.transport.ITransport
    public void logToFile(String str, String str2) {
        this.k.i(str, str2);
    }

    public boolean reConnect() throws IllegalArgumentException {
        logToFile("AirohaLink", "reConnect");
        return connect(this.t, this.mCurrentUuid);
    }

    public void registerOnConnStateListener(String str, OnAirohaConnStateListener onAirohaConnStateListener) {
        this.g.put(str, onAirohaConnStateListener);
    }

    public void registerOnRaceMmiPacketListener(String str, OnRaceMmiPacketListener onRaceMmiPacketListener) {
        this.j.registerRaceMmiPacketListener(str, onRaceMmiPacketListener);
    }

    public void registerOnRaceMmiRoleSwitchIndListener(String str, OnRaceMmiRoleSwitchIndListener onRaceMmiRoleSwitchIndListener) {
        this.j.registerRaceMmiRoleSwitchIndLisener(str, onRaceMmiRoleSwitchIndListener);
    }

    public void registerOnRacePacketListener(String str, OnRacePacketListener onRacePacketListener) {
        this.j.registerRacePacketListener(str, onRacePacketListener);
    }

    public void registerOnRespTimeoutListener(String str, OnAirohaRespTimeoutListener onAirohaRespTimeoutListener) {
        this.h.put(str, onAirohaRespTimeoutListener);
    }

    public void s() {
        logToFile("AirohaLink", "startUnexpectedDisconnectTimer");
        if (this.z != null) {
            this.z.cancel();
            this.z = null;
        }
        this.z = new Timer(true);
        this.z.schedule(new a(), ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
    }

    public boolean sendCommand(byte[] bArr) {
        logToFile("AirohaLink", "sendCommand");
        if (bArr[0] == 5 && bArr[1] == 90) {
            logToFile("AirohaLink", "Cmd needs Resp start count down");
            if (this.p != null) {
                this.p.cancel();
            }
            this.p = new Timer();
            this.p.schedule(new c(), this.m);
        }
        try {
            return this.i.write(bArr);
        } catch (Exception e) {
            logToFile("AirohaLink", e.getStackTrace().toString());
            if (this.p == null) {
                return false;
            }
            this.p.cancel();
            return false;
        }
    }

    public synchronized void sendOrEnqueue(byte[] bArr) {
        if (this.f.isQueueEmpty() && this.f.isResponded) {
            logToFile("AirohaLink", "soe: cmd send");
            sendCommand(bArr);
            this.f.isResponded = false;
        } else {
            logToFile("AirohaLink", "soe: cmd enqueue");
            this.f.enqueneCmd(bArr);
        }
    }

    public void setResponseTimeout(int i) {
        if (i > 0) {
            this.m = i;
        }
    }

    @Override // com.airoha.android.lib.transport.ITransport
    public void stopTimerForCheckProfile() {
        logToFile("AirohaLink", "stopTimerForCheckProfile");
        if (this.x != null) {
            this.x.cancel();
            this.x = null;
        }
    }

    public void unregisterOnConnStateListener(String str) {
        this.g.remove(str);
    }

    public void unregisterOnRespTimeoutListener(String str) {
        this.h.remove(str);
    }

    public boolean connect(String str, int i) throws IllegalArgumentException {
        logToFile("AirohaLink", "connect()");
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            this.t = str;
            BluetoothDevice remoteDevice = this.e.getRemoteDevice(str);
            this.l = new AirorhaLinkDbgLogRaw("", remoteDevice.getName());
            this.f.clearQueue();
            Log.d("AirohaLink", "device type:" + remoteDevice.getType());
            IPhysical iPhysical = this.i;
            if (iPhysical != null) {
                iPhysical.disconnect();
                this.i = null;
                this.c = false;
            }
            if (i == 2) {
                this.i = new AirohaSppControllerCh2(this);
            } else if (i == 3) {
                this.i = new AirohaSppControllerCh3(this);
            }
            return this.i.connect(str);
        }
        throw new IllegalArgumentException(str + " is not a valid Bluetooth address");
    }
}
