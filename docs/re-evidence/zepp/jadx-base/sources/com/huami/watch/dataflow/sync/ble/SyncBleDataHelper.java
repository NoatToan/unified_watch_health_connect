package com.huami.watch.dataflow.sync.ble;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.watch.dataflow.sync.BaseDataSync;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.FirstbeatData;
import com.huami.watch.dataflow.sync.bean.SingleSportData;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class SyncBleDataHelper {
    public static final String TAG = "DataFlow-BLE-SyncWatch";
    private static volatile SyncBleDataHelper b;
    private Context a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DataType.values().length];
            a = iArr;
            try {
                iArr[DataType.SPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DataType.FIRSTBEAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DataType.HEALTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[DataType.STRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private SyncBleDataHelper(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    private BaseDataSync a(DataType dataType, HMSmartWatchDevice hMSmartWatchDevice, String str, int i, String str2, String str3, boolean z) {
        int i2 = a.a[dataType.ordinal()];
        if (i2 == 1) {
            return new BleSportSync(this.a, hMSmartWatchDevice, str, i, str2, str3);
        }
        if (i2 == 2) {
            return new BleFirstbeatSync(hMSmartWatchDevice);
        }
        if (i2 == 3) {
            return new BleHealthSync(this.a, hMSmartWatchDevice, str, i, z);
        }
        if (i2 != 4) {
            return null;
        }
        return new BleStressSync();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    private long b(DataType dataType, Object obj) {
        long j;
        long trackid;
        if (obj == null) {
            j = -1;
        } else {
            int i = a.a[dataType.ordinal()];
            if (i == 1) {
                trackid = ((SingleSportData) obj).getTrackid();
            } else if (i != 2) {
                j = -1;
            } else {
                trackid = ((FirstbeatData) obj).getUpdateTime();
            }
            j = trackid * 1000;
        }
        Log.d(TAG, SearchCriteria.LT + dataType + "> SyncTime: " + j, new Object[0]);
        return j;
    }

    private void c(@NonNull DataType dataType, boolean z, long j) {
        int i = a.a[dataType.ordinal()];
        if (i == 1) {
            long lastSportDataSyncTime = Box.getLastSportDataSyncTime();
            if ((z || lastSportDataSyncTime <= 0) && j > 0) {
                Box.putSportDataSyncTime(j);
                return;
            }
            return;
        }
        if (i == 2 && z && j > 0) {
            Log.d(TAG, "BleFirstbeat UpdateTime: " + j, new Object[0]);
            Box.putFirstbeatUpdateTime(j);
        }
    }

    public static SyncBleDataHelper getHelper(@NonNull Context context) {
        SyncBleDataHelper syncBleDataHelper = b;
        if (syncBleDataHelper == null) {
            synchronized (SyncBleDataHelper.class) {
                syncBleDataHelper = b;
                if (syncBleDataHelper == null) {
                    syncBleDataHelper = new SyncBleDataHelper(context);
                    b = syncBleDataHelper;
                }
            }
        }
        return syncBleDataHelper;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0131 A[Catch: all -> 0x015d, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:7:0x0025, B:9:0x002b, B:13:0x004c, B:16:0x0055, B:18:0x0059, B:19:0x005e, B:23:0x0083, B:27:0x008c, B:31:0x0092, B:33:0x009e, B:37:0x00bf, B:22:0x0066, B:48:0x0102, B:50:0x0131, B:38:0x00c9, B:39:0x00ce, B:43:0x00f3, B:47:0x00fb, B:42:0x00d6, B:53:0x0136), top: B:63:0x0001, inners: #0, #1 }] */
    public synchronized boolean sync(@NonNull DataType dataType, HMSmartWatchDevice hMSmartWatchDevice, String str, int i, String str2, String str3, boolean z) {
        boolean zSendLastSyncTime;
        boolean z2;
        Log.d(TAG, "========== Sync <" + dataType + "> Start... ==========", new Object[0]);
        if (hMSmartWatchDevice != null && str != null) {
            BaseDataSync baseDataSyncA = a(dataType, hMSmartWatchDevice, str, i, str2, str3, z);
            if (baseDataSyncA == null) {
                Log.e(TAG, "Not Supported Data Type <" + dataType + ">, Abort!!", new Object[0]);
                return false;
            }
            long jB = -1;
            boolean z3 = true;
            if (DataType.SPORT != dataType) {
                SyncResult syncResult = new SyncResult();
                try {
                    syncResult = baseDataSyncA.sync(this.a);
                } catch (Exception e) {
                    Log.w(TAG, "Sync<" + dataType + ">DataErr", e, new Object[0]);
                }
                zSendLastSyncTime = syncResult.success;
                if (syncResult.dataEmpty) {
                    z3 = false;
                }
                jB = b(dataType, syncResult.data);
                z2 = z3;
                Log.i(TAG, "========== Sync <" + dataType + "> Finish, Success: " + zSendLastSyncTime + ", HasNewData: " + z2 + " ==========", new Object[0]);
                if (zSendLastSyncTime) {
                    c(dataType, z2, jB);
                }
                return zSendLastSyncTime;
            }
            int i2 = 30;
            z2 = false;
            zSendLastSyncTime = false;
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                SyncResult syncResult2 = new SyncResult();
                try {
                    syncResult2 = baseDataSyncA.sync(this.a);
                } catch (Exception e2) {
                    Log.w(TAG, "Sync<" + dataType + ">DataErr", e2, new Object[0]);
                }
                zSendLastSyncTime = syncResult2.success;
                boolean z4 = syncResult2.dataEmpty;
                z2 |= !z4;
                if (!zSendLastSyncTime || z4) {
                    Log.d(TAG, "No SportData Synced, Break!!", new Object[0]);
                    break;
                }
                jB = b(dataType, syncResult2.data);
                if (jB > 0) {
                    zSendLastSyncTime = hMSmartWatchDevice.sendLastSyncTime(jB);
                    Log.d(TAG, "Send LastSyncTime Success: " + zSendLastSyncTime, new Object[0]);
                    if (!zSendLastSyncTime) {
                        break;
                    }
                }
                i2 = i3;
            }
            Log.i(TAG, "========== Sync <" + dataType + "> Finish, Success: " + zSendLastSyncTime + ", HasNewData: " + z2 + " ==========", new Object[0]);
            if (zSendLastSyncTime) {
                c(dataType, z2, jB);
            }
            return zSendLastSyncTime;
        }
        Log.d(TAG, "No BleDevice: " + hMSmartWatchDevice + "Or DeviceId: " + str + ", Abort!!", new Object[0]);
        return false;
    }
}
