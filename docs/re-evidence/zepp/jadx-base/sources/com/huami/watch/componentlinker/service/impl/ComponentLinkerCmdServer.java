package com.huami.watch.componentlinker.service.impl;

import android.content.Context;
import android.util.Log;
import com.huami.watch.componentlinker.Constant;
import com.huami.watch.componentlinker.service.CmdDataReceiver;
import com.huami.watch.componentlinker.service.ComponentLinkerNative;
import com.huami.watch.componentlinker.service.ProxyDataSender;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;

/* JADX INFO: loaded from: classes16.dex */
public class ComponentLinkerCmdServer implements ProxyDataSender {
    private static final String h = "ComponentCmdServer";
    private static final String i = "com.huami.watch.componentlinker.action";
    private static ComponentLinkerCmdServer j;
    private CmdDataReceiver a;
    private ComponentLinkerNative b;
    private Context d;
    private Transporter e;
    private long c = 0;
    private Transporter.DataListener f = new a();
    private Transporter.ChannelListener g = new b();

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            if (transportDataItem == null) {
                Log.w(ComponentLinkerCmdServer.h, "receive null TransportDataItem");
                return;
            }
            if (ComponentLinkerCmdServer.i.equals(transportDataItem.getAction())) {
                DataBundle data = transportDataItem.getData();
                if (data == null) {
                    Log.w(ComponentLinkerCmdServer.h, "NULL DataBundle found!");
                    return;
                }
                int i = data.getInt(Constant.KEY_TYPE);
                String string = data.getString(Constant.KEY_TARGET_COMPONENT);
                if (string == null) {
                    Log.w(ComponentLinkerCmdServer.h, "null target name! just return.");
                    return;
                }
                if (i == 0) {
                    Log.d(ComponentLinkerCmdServer.h, "receive cmd <" + data.getString(Constant.KEY_CMD) + "> for target [" + string + "]");
                    ComponentLinkerCmdServer.this.a.onCmdDataReceive(string, data);
                    return;
                }
                if (i != 2) {
                    Log.w(ComponentLinkerCmdServer.h, "not implement type :" + i);
                    return;
                }
                byte[] byteArray = data.getByteArray(Constant.KEY_DATA_STREAM);
                long j = data.getLong(Constant.KEY_SEQ_NUM);
                if (byteArray == null) {
                    Log.w(ComponentLinkerCmdServer.h, "receive null data stream !");
                    return;
                }
                Log.d(ComponentLinkerCmdServer.h, "receive data stream item seq:" + j + " byte length = " + byteArray.length);
                ComponentLinkerCmdServer.this.a.onCmdDataReceive(string, byteArray);
            }
        }
    }

    public class b implements Transporter.ChannelListener {
        public b() {
        }

        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public void onChannelChanged(boolean z) {
            if (ComponentLinkerCmdServer.this.b != null) {
                ComponentLinkerCmdServer.this.b.onChannelChanged(z);
            }
        }
    }

    private ComponentLinkerCmdServer(Context context, ComponentLinkerNative componentLinkerNative) {
        this.b = componentLinkerNative;
        this.a = componentLinkerNative;
        componentLinkerNative.setSender(this);
        this.d = context;
        d();
    }

    private void c() {
        Log.i(h, "destroy");
        this.e.removeDataListener(this.f);
        this.e.disconnectTransportService();
        this.e = null;
    }

    private void d() {
        Log.d(h, "init~");
        Transporter transporter = Transporter.get(this.d, i);
        this.e = transporter;
        transporter.addDataListener(this.f);
        this.e.addChannelListener(this.g);
        this.e.connectTransportService();
    }

    public static void instantiate(Context context, String[] strArr) {
        j = new ComponentLinkerCmdServer(context, new ComponentLinkerNative(context, strArr));
    }

    public static void release() {
        j.c();
        j = null;
    }

    @Override // com.huami.watch.componentlinker.service.ProxyDataSender
    public void sendBundle(DataBundle dataBundle, String str) {
        Log.d(h, "send data " + dataBundle + " to action " + i);
        dataBundle.putString(Constant.KEY_TARGET_COMPONENT, str);
        dataBundle.putInt(Constant.KEY_TYPE, 3);
        this.e.send(i, dataBundle);
    }

    @Override // com.huami.watch.componentlinker.service.ProxyDataSender
    public void sendCmd(String str, String str2) {
        if (this.e == null) {
            throw new IllegalStateException("try to sendCmd before init or after release!");
        }
        if (str == null) {
            Log.w(h, "null cmd, just return");
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(Constant.KEY_TARGET_COMPONENT, str2);
        dataBundle.putInt(Constant.KEY_TYPE, 0);
        dataBundle.putString(Constant.KEY_CMD, str);
        Log.d(h, "send cmd:" + str + " to action " + i);
        this.e.send(i, dataBundle);
    }

    @Override // com.huami.watch.componentlinker.service.ProxyDataSender
    public void sendData(byte[] bArr, String str) {
        if (this.e == null) {
            throw new IllegalStateException("try to sendCmd before init or after release!");
        }
        if (bArr == null) {
            Log.w(h, "null cmd, just return");
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(Constant.KEY_TARGET_COMPONENT, str);
        dataBundle.putInt(Constant.KEY_TYPE, 2);
        long j2 = this.c;
        this.c = 1 + j2;
        dataBundle.putLong(Constant.KEY_SEQ_NUM, j2);
        dataBundle.putByteArray(Constant.KEY_DATA_STREAM, bArr);
        Log.d(h, "send data length:" + bArr.length + " to action " + i);
        this.e.send(i, dataBundle);
    }
}
