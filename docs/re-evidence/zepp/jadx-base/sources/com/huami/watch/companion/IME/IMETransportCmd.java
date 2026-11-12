package com.huami.watch.companion.IME;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public class IMETransportCmd {
    private static final String g = "HmTransCmdIME";
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private static final int k = 4;
    private static final int l = 5;
    private static IMETransportCmd m;
    private Context a;
    private Transporter c;
    private ArrayList<callback> b = new ArrayList<>();
    private Transporter.DataListener d = new a();
    private Transporter.ChannelListener e = new b();
    private Handler f = new c();

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            String action = transportDataItem.getAction();
            if (action.equals(ConnectSettings.INPUT_REQUEST)) {
                IMETransportCmd.this.f.obtainMessage(3).sendToTarget();
            }
            if (action.equals(ConnectSettings.INPUT_CANCEL)) {
                IMETransportCmd.this.f.obtainMessage(4).sendToTarget();
            }
        }
    }

    public class b implements Transporter.ChannelListener {
        public b() {
        }

        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public void onChannelChanged(boolean z) {
            if (z) {
                IMETransportCmd.this.f.obtainMessage(1, 1).sendToTarget();
            } else {
                IMETransportCmd.this.f.obtainMessage(1, 0).sendToTarget();
            }
        }
    }

    public class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                int iIntValue = ((Integer) message.obj).intValue();
                Iterator it2 = IMETransportCmd.this.b.iterator();
                while (it2.hasNext()) {
                    ((callback) it2.next()).dataChannelChanged(iIntValue == 1);
                }
            } else if (i == 2) {
                String str = (String) message.obj;
                Iterator it3 = IMETransportCmd.this.b.iterator();
                while (it3.hasNext()) {
                    ((callback) it3.next()).inputMsgReceive(str);
                }
            } else if (i == 3) {
                Iterator it4 = IMETransportCmd.this.b.iterator();
                while (it4.hasNext()) {
                    ((callback) it4.next()).inputRequestReceive();
                }
            } else if (i == 4) {
                Iterator it5 = IMETransportCmd.this.b.iterator();
                while (it5.hasNext()) {
                    ((callback) it5.next()).inputCancel();
                }
            } else if (i == 5) {
                Iterator it6 = IMETransportCmd.this.b.iterator();
                while (it6.hasNext()) {
                    ((callback) it6.next()).dataChannelChanged(false);
                }
            }
            super.handleMessage(message);
        }
    }

    public interface callback {
        void dataChannelChanged(boolean z);

        void inputCancel();

        void inputMsgReceive(String str);

        void inputRequestReceive();
    }

    private IMETransportCmd(Context context) {
        this.a = context;
        if (this.c == null) {
            Log.d(g, " IMEservice create TransportClient");
            Transporter transporter = Transporter.get(context, ConnectSettings.name);
            this.c = transporter;
            if (transporter != null) {
                transporter.connectTransportService();
                this.c.addDataListener(this.d);
                this.c.addChannelListener(this.e);
            }
        }
    }

    public static IMETransportCmd getInstance(Context context) {
        if (m == null) {
            m = new IMETransportCmd(context);
        }
        return m;
    }

    public void cmdInputCancel() {
        Transporter transporter = this.c;
        if (transporter == null) {
            return;
        }
        transporter.send(ConnectSettings.INPUT_CANCEL);
    }

    public void cmdSendInputMsg(String str) {
        if (this.c == null) {
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(ConnectSettings.MSG_CONTENT, str);
        this.c.send(ConnectSettings.INPUT_SEND, dataBundle);
    }

    public void cmdSendInputRequest() {
        Transporter transporter = this.c;
        if (transporter == null) {
            return;
        }
        transporter.send(ConnectSettings.INPUT_REQUEST);
    }

    public void connect() {
        Transporter transporter = this.c;
        if (transporter == null) {
            return;
        }
        transporter.connectTransportService();
    }

    public void destroy() {
        Transporter transporter = this.c;
        if (transporter != null) {
            transporter.removeChannelListener(this.e);
            this.c.removeDataListener(this.d);
            this.c = null;
        }
        m = null;
    }

    public void disConnect() {
        Transporter transporter = this.c;
        if (transporter == null) {
            return;
        }
        transporter.disconnectTransportService();
    }

    public boolean isConnected() {
        Transporter transporter = this.c;
        if (transporter == null) {
            return false;
        }
        return transporter.isTransportServiceConnected();
    }

    public void registerCallback(callback callbackVar) {
        Transporter transporter = this.c;
        if (transporter != null && !transporter.isTransportServiceConnected()) {
            this.c.connectTransportService();
        }
        this.b.add(callbackVar);
        Log.i(g, "IMEservice register callback");
    }

    public void unregisterCallback(callback callbackVar) {
        try {
            for (callback callbackVar2 : this.b) {
                if (callbackVar2 == callbackVar) {
                    this.b.remove(callbackVar2);
                }
            }
            if (this.b.size() == 0) {
                destroy();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
