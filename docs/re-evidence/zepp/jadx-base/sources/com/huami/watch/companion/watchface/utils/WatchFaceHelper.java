package com.huami.watch.companion.watchface.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudResult;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.companion.watchface.manager.WatchFaceCloudManager;
import com.huami.watch.companion.watchface.utils.WatchFaceHelper;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceHelper {
    public static final int DEFAULT_WATCH_FACE_ID = 0;
    private static final String a = "WatchFaceHelper";

    public interface OnDeleteWatchFaceListener {
        void deleteWatchFaceSuccess(String str);
    }

    public interface OnReceivedWatchFaceIdsListener {
        void receivedWatchFaceIds(String str);
    }

    public static void deleteWatchFaceToRom(Context context, String str, OnDeleteWatchFaceListener onDeleteWatchFaceListener) {
        if (onDeleteWatchFaceListener != null) {
            onDeleteWatchFaceListener.deleteWatchFaceSuccess("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Integer.valueOf(SyncBleUtil.getWatchFaceSelected()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(String str, Integer num) throws Exception {
        saveSelectWatchFace(str, num.intValue());
    }

    public static WatchFaceCloudResult<List<WatchFaceCloud>> getCloudWatchFaceIds(Context context) {
        return getCloudWatchFaceIds(context, null);
    }

    public static WatchFaceCloud getDefaultWatchFace(Context context, String str) {
        Device deviceFindByDeviceId = DeviceManager.getManager(context).findByDeviceId(str);
        WatchFaceCloud watchFaceCloud = new WatchFaceCloud();
        watchFaceCloud.setWatchFaceId(0);
        if (deviceFindByDeviceId == null) {
            watchFaceCloud.setLocalImage(R.drawable.watch_face_list_default);
        } else if (DeviceSource.isSeriesEverest2(deviceFindByDeviceId)) {
            watchFaceCloud.setName("Everest2");
            watchFaceCloud.setLocalImage(R.drawable.watchface_default_sport_one);
        } else if (DeviceSource.isSeriesXihu(deviceFindByDeviceId)) {
            watchFaceCloud.setName("Xihu");
            watchFaceCloud.setLocalImage(R.drawable.watch_face_normal_bg);
        } else if (DeviceSource.isModelQogir(deviceFindByDeviceId)) {
            watchFaceCloud.setName("Qogir");
            watchFaceCloud.setLocalImage(R.drawable.watchface_default_qogir);
        }
        return watchFaceCloud;
    }

    public static WatchFaceCloudResult<WatchFaceCloud> getLocalSelectWatchFace(String str) {
        int localSelectWatchFaceId = getLocalSelectWatchFaceId(str);
        Log.d(a, "getSelectWatchFace:localId:" + localSelectWatchFaceId, new Object[0]);
        return new WatchFaceCloudResult<>(true, WatchFaceCloudManager.getManager().getWatchFace(localSelectWatchFaceId));
    }

    public static int getLocalSelectWatchFaceId(String str) {
        return Box.get().getInt(str, 0);
    }

    public static List<WatchFaceCloud> getLocalWatchFaceByIds(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.d(a, "ids is NULL !!!", new Object[0]);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = str.split(",");
        int length = strArrSplit.length;
        for (int i = 0; i < length; i++) {
            try {
                sb.append(Integer.valueOf(strArrSplit[i]).intValue());
                if (i != length - 1) {
                    sb.append(",");
                }
            } catch (Exception unused) {
                Log.e(a, "id  is not Int", new Object[0]);
            }
        }
        return WatchFaceCloudManager.getManager().getWatchFaceByIds(sb.toString());
    }

    public static void getRomSelectWatchFaceId(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Rx.io(new ObservableOnSubscribe() { // from class: pf8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                WatchFaceHelper.f(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: rf8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                WatchFaceHelper.g(str, (Integer) obj);
            }
        });
    }

    public static void getRomWatchFaceIds(final OnReceivedWatchFaceIdsListener onReceivedWatchFaceIdsListener) {
        final StringBuilder sb = new StringBuilder();
        Rx.io(new ObservableOnSubscribe() { // from class: qf8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                WatchFaceHelper.h(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: sf8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                WatchFaceHelper.i(sb, onReceivedWatchFaceIdsListener, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(SyncBleUtil.getWatchFaces());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(StringBuilder sb, OnReceivedWatchFaceIdsListener onReceivedWatchFaceIdsListener, List list) throws Exception {
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(list.get(i));
                if (i != size - 1) {
                    sb.append(",");
                }
            }
        }
        Log.d(a, "getRomWatchFaceIds:result:" + sb.toString(), new Object[0]);
        if (onReceivedWatchFaceIdsListener != null) {
            onReceivedWatchFaceIdsListener.receivedWatchFaceIds(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(String str, int i, DataTransportResult dataTransportResult) {
        Log.d(a, "setSelectWatchFaceToRom:result!!!" + dataTransportResult, new Object[0]);
        if (dataTransportResult.getResultCode() == 0) {
            saveSelectWatchFace(str, i);
        }
    }

    public static void saveSelectWatchFace(String str, int i) {
        Log.d(a, str + "saveSelectWatchFaceIdToLocal:" + i, new Object[0]);
        if (i > 0) {
            Box.get().put(str, i);
            RxBus.get().postMainThread(new WatchFaceArrivingEvent(WatchFaceArrivingEvent.CMD_SET));
        }
    }

    public static boolean saveWatchFaceToDB(WatchFaceCloud watchFaceCloud) {
        if (watchFaceCloud == null) {
            return false;
        }
        WatchFaceCloud watchFace = WatchFaceCloudManager.getManager().getWatchFace(watchFaceCloud.getWatchFaceId());
        if (watchFace != null) {
            WatchFaceCloud watchFaceCloud2 = new WatchFaceCloud();
            watchFaceCloud2.setWatchFaceId(watchFaceCloud.getWatchFaceId());
            if (!WatchFaceCloudManager.getManager().add(watchFaceCloud2)) {
                WatchFaceCloudManager.getManager().delete(watchFace);
            }
        }
        boolean zAdd = WatchFaceCloudManager.getManager().add(watchFaceCloud);
        Log.d(a, "Save WatchFace To DB successful: " + zAdd, new Object[0]);
        return zAdd;
    }

    public static void setSelectWatchFaceToRom(Context context, final String str, final int i) {
        if (DeviceManager.getManager(context).isCurrentDeviceBLE()) {
            SyncBleUtil.syncWatchFaceToWatch(i);
            saveSelectWatchFace(str, i);
        } else {
            DataBundle dataBundle = new DataBundle();
            dataBundle.putString("data", String.valueOf(i));
            Transporter.get(context, "com.huami.watch.companion").send(CompanionModule.ACTION_SET_CURRENT_ID, dataBundle, new Transporter.DataSendResultCallback() { // from class: of8
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    WatchFaceHelper.j(str, i, dataTransportResult);
                }
            });
        }
    }

    public static WatchFaceCloudResult<List<WatchFaceCloud>> getCloudWatchFaceIds(Context context, String str) {
        WatchFaceCloudResult<List<WatchFaceCloud>> watchFaceList = WatchFaceApi.getWatchFaceList(context, str, false);
        List<WatchFaceCloud> data = watchFaceList.getData();
        if (watchFaceList.isSuccessful() && data != null && data.size() > 0) {
            Iterator<WatchFaceCloud> it2 = data.iterator();
            while (it2.hasNext()) {
                saveWatchFaceToDB(it2.next());
            }
        }
        return watchFaceList;
    }
}
