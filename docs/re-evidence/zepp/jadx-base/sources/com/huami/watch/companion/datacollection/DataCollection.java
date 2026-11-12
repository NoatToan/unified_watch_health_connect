package com.huami.watch.companion.datacollection;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.huami.watch.companion.wearcalling.ModulesDef;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.transport.httpsupport.Utils;
import com.huami.watch.util.Analytics;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class DataCollection {
    public static final boolean DEBUG = true;
    public static final String TAG = "DataCollections";
    private Context a;
    private WearDataReceiver b;
    private HandlerThread c;
    private Handler d;

    public class WearDataReceiver implements Transporter.DataListener {
        public WearDataReceiver(Context context) {
            Transporter transporter = Transporter.get(context, ModulesDef.TRANS_ACTION);
            if (transporter != null) {
                transporter.addDataListener(this);
            }
        }

        public void doClearUp() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
        }
    }

    public class a extends WearDataReceiver {

        /* JADX INFO: renamed from: com.huami.watch.companion.datacollection.DataCollection$a$a, reason: collision with other inner class name */
        public class RunnableC0652a implements Runnable {
            public final /* synthetic */ TransportDataItem a;

            public RunnableC0652a(TransportDataItem transportDataItem) {
                this.a = transportDataItem;
            }

            @Override // java.lang.Runnable
            public void run() {
                DataCollection.this.c(this.a);
            }
        }

        public a(Context context) {
            super(context);
        }

        @Override // com.huami.watch.companion.datacollection.DataCollection.WearDataReceiver, com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            transportDataItem.getAction();
            DataCollection.this.d.post(new RunnableC0652a(transportDataItem));
        }
    }

    public DataCollection(Context context) {
        this.a = context;
        doInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(TransportDataItem transportDataItem) {
        byte[] bArrUnGZip;
        String action = transportDataItem.getAction();
        Log.i(TAG, action + "    " + Process.myPid() + " deviceinfo ");
        if (!TextUtils.equals(action, "com.huami.watch.action.ubcdata") || transportDataItem.getData().size() == 0 || (bArrUnGZip = Utils.BytesZipUtil.unGZip(transportDataItem.getData().getByteArray("data"))) == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrUnGZip));
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            String string = jSONObject.getString("rom");
            String string2 = jSONObject.getString("uuid_source");
            Log.d(TAG, "romString :" + string + "  uuid:source " + string2);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i));
                if (jSONObject2.length() != 0) {
                    String string3 = jSONObject2.getString(AbsEsimOperation.KEY_EID);
                    String string4 = jSONObject2.getString("stmp");
                    String string5 = jSONObject2.getString("ver");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("pms");
                    Iterator<String> itKeys = jSONObject3.keys();
                    HashMap map = new HashMap();
                    map.put("timestamp", string4);
                    map.put("ver", string5);
                    map.put("rom", string);
                    map.put("uuid_source", string2);
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject3.getString(next));
                    }
                    Log.i(TAG, "hashmap :" + map);
                    Analytics.event(this.a, string3, (HashMap<String, String>) map);
                }
            }
        } catch (JSONException e) {
            Log.d(TAG, "exception : " + e.toString());
        }
    }

    public void doInit() {
        HandlerThread handlerThread = new HandlerThread("stats-thread");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
        Transporter.get(this.a, ModulesDef.TRANS_ACTION).connectTransportService();
        initDataListener();
    }

    public void initDataListener() {
        if (this.b != null) {
            Transporter.get(this.a, ModulesDef.TRANS_ACTION).removeDataListener(this.b);
        }
        this.b = new a(this.a);
    }
}
