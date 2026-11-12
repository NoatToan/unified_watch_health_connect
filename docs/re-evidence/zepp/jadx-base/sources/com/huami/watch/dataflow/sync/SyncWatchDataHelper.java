package com.huami.watch.dataflow.sync;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.Request;
import com.huami.watch.dataflow.sync.bean.Result;
import com.huami.watch.dataflow.sync.bean.SyncData;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.dataflow.sync.sport.WatchSportDataTransmitter;
import com.huami.watch.dataflow.sync.util.SyncParser;
import com.huami.watch.dataflow.util.DataUtil;
import com.huami.watch.transdata.transport.DataTransHelper;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.transport.TransporterModules;
import com.huami.watch.util.Box;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class SyncWatchDataHelper {
    public static final String TAG = "DataFlow-SyncWatch";
    private static final String h = "com.huami.watch.phone_user_data";
    private static final String i = "com.huami.watch.user_data";
    private static final String j = "com.huami.watch.phone_data_result";
    private static final String k = "headers";
    private static final String l = "data";
    private static final String m = "sessionId";
    private static final int n = 60;
    private static final int o = 100;
    private static volatile SyncWatchDataHelper p;
    private Context a;
    private Transporter b;
    private long c;
    private BaseDataSync e;
    private Map<Long, SyncData> d = new ConcurrentHashMap();
    private final Object f = new Object();
    private Transporter.DataListener g = new a();

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            Log.d(SyncWatchDataHelper.TAG, "OnDataReceived, Action: " + transportDataItem.getAction(), new Object[0]);
            if ("com.huami.watch.user_data".equals(transportDataItem.getAction())) {
                DataBundle data = transportDataItem.getData();
                try {
                    SyncData syncData = SyncParser.toSyncData((HashMap) data.get("headers"), DataUtil.unzipRawData(data.getByteArray("data")));
                    if (syncData != null) {
                        SyncWatchDataHelper.this.d(syncData);
                    }
                } catch (Exception e) {
                    Log.d(SyncWatchDataHelper.TAG, "OnDataReceivedErr", e);
                }
            }
        }
    }

    public class b implements DoLooper.Function<DoLooper.Result> {
        public final /* synthetic */ long a;
        public final /* synthetic */ DoLooper.Result b;

        public b(long j, DoLooper.Result result) {
            this.a = j;
            this.b = result;
        }

        @Override // com.huami.watch.util.DoLooper.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoLooper.Result apply() {
            SyncData syncData = (SyncData) SyncWatchDataHelper.this.d.get(Long.valueOf(this.a));
            if (syncData != null) {
                DoLooper.Result result = this.b;
                result.finish = true;
                result.success = true;
                result.data = syncData;
            }
            return this.b;
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DataType.values().length];
            a = iArr;
            try {
                iArr[DataType.SPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DataType.HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DataType.FIRSTBEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[DataType.ATRIAL_FIBRILLATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[DataType.ECG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[DataType.HEART_RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[DataType.RR_PEAK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private SyncWatchDataHelper() {
    }

    private BaseDataSync c(DataType dataType) {
        switch (c.a[dataType.ordinal()]) {
            case 1:
                return new SportSync(this.c);
            case 2:
                return new HealthSync(this.a);
            case 3:
                return new FirstbeatSync();
            case 4:
                return new AtrialFibrillationSync();
            case 5:
                return new EcgSync();
            case 6:
                return new SingleHeartRateSync();
            case 7:
                return new RrPeakSync();
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(@NonNull SyncData syncData) {
        BaseDataSync baseDataSync;
        String sessionId = syncData.getSessionId();
        String dataType = syncData.getDataType();
        Log.i(TAG, "Sync 2/4. Received <" + dataType + ">, SessionId: " + sessionId + ", Current SessionId: " + this.c, new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("SyncData: ");
        sb.append(syncData);
        Log.d(TAG, sb.toString(), new Object[0]);
        if (String.valueOf(this.c).equals(sessionId) && (baseDataSync = this.e) != null && baseDataSync.a.is(dataType)) {
            this.d.put(Long.valueOf(this.c), syncData);
        }
    }

    private void e(@NonNull DataType dataType, boolean z, long j2) {
        if (c.a[dataType.ordinal()] != 1) {
            return;
        }
        long lastSportDataSyncTime = Box.getLastSportDataSyncTime();
        if (z || lastSportDataSyncTime <= 0) {
            Box.putSportDataSyncTime(j2);
        }
        WatchSportDataTransmitter.getInstance().updateWatchSportDataState();
    }

    private void f(String str, long j2, String str2, @NonNull Object obj, boolean z) {
        String json;
        DataBundle dataBundle = new DataBundle();
        HashMap map = new HashMap();
        map.put("sessionId", String.valueOf(j2));
        dataBundle.putSerializable("headers", map);
        if (z) {
            Request request = new Request();
            request.dataType = str2;
            request.request = obj;
            json = new Gson().toJson(request);
        } else {
            Result result = new Result();
            result.dataType = str2;
            result.result = obj;
            json = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(result);
        }
        dataBundle.putByteArray("data", json.getBytes());
        Log.d(TAG, "Send Data To Watch, Headers: " + map + ", " + json, new Object[0]);
        this.b.send(str, dataBundle);
    }

    public static SyncWatchDataHelper getHelper() {
        SyncWatchDataHelper syncWatchDataHelper = p;
        if (syncWatchDataHelper == null) {
            synchronized (SyncWatchDataHelper.class) {
                syncWatchDataHelper = p;
                if (syncWatchDataHelper == null) {
                    syncWatchDataHelper = new SyncWatchDataHelper();
                    p = syncWatchDataHelper;
                }
            }
        }
        return syncWatchDataHelper;
    }

    public void init(Context context) {
        this.a = context.getApplicationContext();
        Transporter transporter = Transporter.get(context, TransporterModules.MOUDLE_COMPANION_SYNC_DATA);
        this.b = transporter;
        transporter.addDataListener(this.g);
        this.b.connectTransportService();
    }

    public void requestSyncDataStart() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.c = jCurrentTimeMillis;
        Log.d(TAG, "========== Sync Prepare: <SessionId: " + jCurrentTimeMillis + ">, Trigger to Watch... ==========", new Object[0]);
        f("com.huami.watch.phone_user_data", jCurrentTimeMillis, DataTransHelper.TYPE_TRIGGER, new Object(), true);
    }

    public boolean sync(@NonNull DataType dataType) {
        synchronized (this.f) {
            try {
                Log.i(TAG, "========== Sync <" + dataType + "> Start... ==========", new Object[0]);
                BaseDataSync baseDataSyncC = c(dataType);
                this.e = baseDataSyncC;
                if (baseDataSyncC == null) {
                    Log.w(TAG, "Unsupported Data Type <" + dataType + ">, Abort!!", new Object[0]);
                    return false;
                }
                long j2 = this.c;
                boolean z = true;
                int i2 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (z) {
                    int i3 = i2 + 1;
                    if (i3 <= 100) {
                        Object objPrepareRequestData = this.e.prepareRequestData();
                        Log.i(TAG, "Sync 1/4. Request To Watch : <" + dataType + ">, SessionId: " + j2 + ", RequestData: " + objPrepareRequestData + ", SyncCount: " + i3, new Object[0]);
                        if (objPrepareRequestData != null) {
                            f("com.huami.watch.phone_user_data", j2, dataType.getKey(), objPrepareRequestData, true);
                            Log.v(TAG, "Wait Watch Data...", new Object[0]);
                            DoLooper.Result result = new DoLooper.Result();
                            boolean zDoLoop = DoLooper.doLoop(new b(j2, result), 500, 60);
                            if (zDoLoop) {
                                Log.i(TAG, "Sync 3/4. Parse,Save To Local&Cloud...", new Object[0]);
                                SyncResult syncResult = new SyncResult();
                                try {
                                    syncResult = this.e.sync(this.a, ((SyncData) result.data).getData());
                                } catch (Exception e) {
                                    Log.w(TAG, "Sync<" + dataType + ">DataErr", e, new Object[0]);
                                }
                                SyncResult syncResult2 = syncResult;
                                if (!syncResult2.success) {
                                    Log.w(TAG, "Sync <" + dataType + "> Data Fail, Abort!!", new Object[0]);
                                } else if (syncResult2.dataEmpty) {
                                    Log.d(TAG, "Sync <" + dataType + "> Data Empty, Abort!!", new Object[0]);
                                } else {
                                    Log.i(TAG, "Sync 4/4. Result To Watch : " + syncResult2, new Object[0]);
                                    Object obj = syncResult2.data;
                                    if (obj == null) {
                                        obj = new Object();
                                    }
                                    f("com.huami.watch.phone_data_result", j2, dataType.getKey(), obj, false);
                                    boolean z4 = syncResult2.needContinue;
                                    this.d.remove(Long.valueOf(j2));
                                    Log.d(TAG, "Sync Loop Wait: 1s!!", new Object[0]);
                                    try {
                                        Thread.sleep(1000L);
                                    } catch (InterruptedException e2) {
                                        e2.printStackTrace();
                                    }
                                    z = z4;
                                    i2 = i3;
                                    z2 = zDoLoop;
                                    z3 = true;
                                }
                            } else {
                                Log.w(TAG, "Request <" + dataType + "> Fail: Timeout, Abort!!", new Object[0]);
                            }
                            z2 = zDoLoop;
                            break;
                        }
                        Log.w(TAG, "RequestData is Null, Abort!!", new Object[0]);
                        break;
                    }
                    Log.w(TAG, "Sync <" + dataType + ">, SyncCount > 100, Abort!!", new Object[0]);
                    z2 = false;
                    break;
                }
                this.d.clear();
                Log.i(TAG, "========== Sync <" + dataType + "> Finish, SessionId: " + j2 + ", Success: " + z2 + ", HasNewData : " + z3 + ", " + TimeUtil.formatDateTime(j2) + " ==========", new Object[0]);
                if (z2) {
                    e(dataType, z3, j2);
                }
                return z2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
