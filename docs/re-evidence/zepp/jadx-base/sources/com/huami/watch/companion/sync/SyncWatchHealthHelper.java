package com.huami.watch.companion.sync;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.dataflow.event.HealthDataUpdatedEvent;
import com.huami.watch.dataflow.model.health.HRDataManager;
import com.huami.watch.dataflow.model.health.HealthDataManager;
import com.huami.watch.dataflow.model.health.bean.HealthDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthHRDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthRawDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthRawHRItem;
import com.huami.watch.dataflow.model.health.bean.HealthSummaryItem;
import com.huami.watch.dataflow.util.HealthDataParser;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.transport.httpsupport.translogutils.Util;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Box;
import com.huami.watch.util.BytesUtil;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import com.huami.watch.util.TimeUtil;
import com.tencent.connect.common.Constants;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class SyncWatchHealthHelper {
    private static final String f = "SyncWatch-HealthData";
    private static final String g = "com.huami.watch.http-support.manager";
    private static volatile SyncWatchHealthHelper h;
    private ObservableEmitter<DataBundle> b;
    private ObservableEmitter<DataBundle> c;
    private Context d;
    private Transporter.DataListener e = new c();
    private HealthDataManager a = HealthDataManager.getManager();

    public class a implements Function<DataBundle, l> {
        public a() {
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l apply(@NonNull DataBundle dataBundle) throws Exception {
            return SyncWatchHealthHelper.this.f(dataBundle);
        }
    }

    public class b implements ObservableOnSubscribe<DataBundle> {
        public b() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<DataBundle> observableEmitter) throws Exception {
            SyncWatchHealthHelper.this.c = observableEmitter;
        }
    }

    public class c implements Transporter.DataListener {
        public c() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            DataBundle data = transportDataItem.getData();
            String string = data.getString("key_owner");
            Log.d(SyncWatchHealthHelper.f, "Owner : " + string, new Object[0]);
            if ("com.huami.watch.health".equals(string)) {
                SyncWatchHealthHelper.this.h(data);
            }
        }
    }

    public class d implements Consumer<l> {
        public d() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NonNull l lVar) throws Exception {
            HealthDataUpdatedEvent healthDataUpdatedEvent = lVar.a ? new HealthDataUpdatedEvent(lVar.b) : null;
            if (healthDataUpdatedEvent != null) {
                RxBus.get().post(healthDataUpdatedEvent);
            }
        }
    }

    public class e implements Consumer<Throwable> {
        public e() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Exception {
            Log.e(SyncWatchHealthHelper.f, "AcceptStepSleepErr", th, new Object[0]);
            Analytics.exception(th);
        }
    }

    public class f implements Predicate<l> {
        public f() {
        }

        @Override // io.reactivex.functions.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(@NonNull l lVar) throws Exception {
            if (lVar.a) {
                String str = lVar.b;
                if (!TextUtils.isEmpty(str) && DateDay.from(str).equals(DateDay.today())) {
                    HealthData.requestDetail(CompanionApplication.getContext(), str);
                    HealthSummaryItem healthSummaryItemRequestSummary = HealthData.requestSummary(str);
                    int total = -1;
                    if (healthSummaryItemRequestSummary != null && healthSummaryItemRequestSummary.getStep() != null) {
                        total = healthSummaryItemRequestSummary.getStep().getTotal();
                    }
                    Log.d(SyncWatchHealthHelper.f, "HealthData Updated : " + str + ", Steps : " + total, new Object[0]);
                    return true;
                }
            }
            return false;
        }
    }

    public class g implements Function<DataBundle, l> {
        public g() {
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l apply(@NonNull DataBundle dataBundle) throws Exception {
            return SyncWatchHealthHelper.this.g(dataBundle);
        }
    }

    public class h implements ObservableOnSubscribe<DataBundle> {
        public h() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<DataBundle> observableEmitter) throws Exception {
            SyncWatchHealthHelper.this.b = observableEmitter;
        }
    }

    public class i implements Consumer<l> {
        public i() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NonNull l lVar) throws Exception {
            HealthDataUpdatedEvent healthDataUpdatedEvent;
            if (lVar.c) {
                healthDataUpdatedEvent = new HealthDataUpdatedEvent();
                healthDataUpdatedEvent.onlyUpdateHR = true;
            } else {
                healthDataUpdatedEvent = null;
            }
            if (healthDataUpdatedEvent != null) {
                RxBus.get().post(healthDataUpdatedEvent);
            }
        }
    }

    public class j implements Consumer<Throwable> {
        public j() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Exception {
            Log.e(SyncWatchHealthHelper.f, "AcceptHeartRateErr", th, new Object[0]);
            Analytics.exception(th);
        }
    }

    public class k implements Predicate<l> {
        public k() {
        }

        @Override // io.reactivex.functions.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(@NonNull l lVar) throws Exception {
            if (!lVar.c) {
                return false;
            }
            Log.d(SyncWatchHealthHelper.f, "HeartRate Updated!!", new Object[0]);
            return true;
        }
    }

    public static class l {
        private boolean a;
        private String b;
        private boolean c;

        private l() {
        }
    }

    @SuppressLint({"CheckResult"})
    private SyncWatchHealthHelper() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Observable observableFilter = Observable.create(new h()).observeOn(Schedulers.from(executorServiceNewSingleThreadExecutor)).map(new g()).filter(new f());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        observableFilter.throttleWithTimeout(1L, timeUnit).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(), new e());
        Observable.create(new b()).observeOn(Schedulers.from(executorServiceNewSingleThreadExecutor)).map(new a()).filter(new k()).throttleWithTimeout(1L, timeUnit).observeOn(AndroidSchedulers.mainThread()).subscribe(new i(), new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l f(DataBundle dataBundle) {
        l lVar = new l();
        String string = dataBundle.getString("key_data");
        Log.d(f, "KeyData : " + string, new Object[0]);
        if (TextUtils.isEmpty(string)) {
            return lVar;
        }
        HealthRawHRItem[] hRItem = HealthDataParser.toHRItem(string);
        Log.d(f, "TransHRItems : " + Arrays.toString(hRItem), new Object[0]);
        HRDataManager manager = HRDataManager.getManager();
        if (hRItem != null && hRItem.length > 0) {
            for (HealthRawHRItem healthRawHRItem : hRItem) {
                if (manager.get(healthRawHRItem.getGeneratedTime()) == null) {
                    HealthHRDataItem healthHRDataItem = new HealthHRDataItem();
                    healthHRDataItem.setHeartRate(HealthDataParser.toHeartRate(healthRawHRItem.getHeartRateData()));
                    healthHRDataItem.setTimestamp(healthRawHRItem.getGeneratedTime());
                    healthHRDataItem.setTimezone(healthRawHRItem.getTimeZone());
                    healthHRDataItem.setDId(healthRawHRItem.getDeviceId());
                    healthHRDataItem.setDeviceSource(healthRawHRItem.getDeviceSource());
                    Log.d(f, "Accept HeartRate : " + healthHRDataItem.toStringShort(), new Object[0]);
                    if (manager.save(healthHRDataItem)) {
                        HealthData.clearCacheHR();
                        lVar.c = true;
                    }
                }
            }
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l g(DataBundle dataBundle) {
        HealthRawDataItem.MetaData[] metadata;
        HealthRawDataItem.MetaData[] metaDataArr;
        int i2;
        int i3;
        l lVar;
        boolean zSave;
        l lVar2 = new l();
        String string = dataBundle.getString("key_data");
        Log.d(f, "KeyData : " + string, new Object[0]);
        if (TextUtils.isEmpty(string)) {
            return lVar2;
        }
        HealthRawDataItem healthItem = HealthDataParser.toHealthItem(string);
        Log.d(f, "TransDataItem : " + healthItem, new Object[0]);
        if (healthItem != null && (metadata = healthItem.getMetadata()) != null && metadata.length > 0) {
            int length = metadata.length;
            int i4 = 0;
            while (i4 < length) {
                HealthRawDataItem.MetaData metaData = metadata[i4];
                String date = metaData.getDate();
                if (TextUtils.isEmpty(date)) {
                    metaDataArr = metadata;
                    i2 = length;
                    i3 = i4;
                    lVar = lVar2;
                } else {
                    HealthDataItem healthDataItem = this.a.get(date);
                    if (healthDataItem == null) {
                        healthDataItem = new HealthDataItem(date);
                    }
                    byte[] data = healthDataItem.getData();
                    byte[] heartRateData = healthDataItem.getHeartRateData();
                    HealthRawDataItem.MetaDataValue[] values = metaData.getValues();
                    int length2 = values.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        HealthRawDataItem.MetaDataValue metaDataValue = values[i5];
                        int start = metaDataValue.getStart();
                        HealthRawDataItem.MetaData[] metaDataArr2 = metadata;
                        int stop = metaDataValue.getStop();
                        if (start > stop) {
                            Log.w(f, start + SearchCriteria.GT + stop, new Object[0]);
                            return lVar2;
                        }
                        int i6 = length;
                        byte[] bytes = HealthDataParser.toBytes(metaDataValue.getValue());
                        HealthRawDataItem.MetaDataValue[] metaDataValueArr = values;
                        StringBuilder sb = new StringBuilder();
                        int i7 = length2;
                        sb.append("RawData : ");
                        sb.append(BytesUtil.log(bytes));
                        int i8 = i4;
                        Log.d(f, sb.toString(), new Object[0]);
                        byte[] bytes2 = HealthDataParser.toBytes(metaDataValue.getHeartRateData());
                        l lVar3 = lVar2;
                        Log.d(f, "RawDataHeartRate : " + BytesUtil.log(bytes2), new Object[0]);
                        if (bytes != null && bytes.length > 0) {
                            byte[] bArrMergeRawData = HealthDataParser.mergeRawData(bytes, data, start, stop);
                            Log.d(f, "MergedRawData : " + BytesUtil.log(bArrMergeRawData), new Object[0]);
                            data = bArrMergeRawData;
                        }
                        if (bytes2 != null && bytes2.length > 0) {
                            byte[] bArrMergeRawDataHeartRate = HealthDataParser.mergeRawDataHeartRate(bytes2, heartRateData, start, stop);
                            Log.d(f, "MergedHeartRateData : " + BytesUtil.log(bArrMergeRawDataHeartRate), new Object[0]);
                            heartRateData = bArrMergeRawDataHeartRate;
                        }
                        i5++;
                        lVar2 = lVar3;
                        metadata = metaDataArr2;
                        values = metaDataValueArr;
                        length = i6;
                        length2 = i7;
                        i4 = i8;
                    }
                    l lVar4 = lVar2;
                    metaDataArr = metadata;
                    i2 = length;
                    i3 = i4;
                    healthDataItem.setData(data);
                    healthDataItem.setHeartRateData(heartRateData);
                    healthDataItem.setSummary(metaData.getSummary());
                    healthDataItem.setDID(healthItem.getDId());
                    healthDataItem.setSynced(healthDataItem.getSynced() | 3);
                    int lastSyncTime = healthItem.getLastSyncTime();
                    Log.d(f, "Accept HealthData : " + healthDataItem.toStringShort() + ", LastSyncTime : " + TimeUtil.formatDateTime(lastSyncTime), new Object[0]);
                    try {
                        zSave = this.a.save(healthDataItem);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        zSave = false;
                    }
                    if (zSave) {
                        HealthData.removeCache(date);
                        lVar = lVar4;
                        lVar.a = true;
                        lVar.b = healthDataItem.getDate();
                        i(lastSyncTime);
                    } else {
                        lVar = lVar4;
                    }
                }
                i4 = i3 + 1;
                lVar2 = lVar;
                metadata = metaDataArr;
                length = i2;
            }
        }
        return lVar2;
    }

    public static SyncWatchHealthHelper getHelper() {
        SyncWatchHealthHelper syncWatchHealthHelper = h;
        if (syncWatchHealthHelper == null) {
            synchronized (SyncWatchHealthHelper.class) {
                syncWatchHealthHelper = h;
                if (syncWatchHealthHelper == null) {
                    syncWatchHealthHelper = new SyncWatchHealthHelper();
                    h = syncWatchHealthHelper;
                }
            }
        }
        return syncWatchHealthHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(DataBundle dataBundle) {
        String string = dataBundle.getString(Constants.KEY_ACTION);
        Log.d(f, "KeyAction : " + string, new Object[0]);
        if (Util.ACTION_HEALTH.equals(string)) {
            if (DeviceUtil.isRomSupportNewSportHealthChannel(this.d)) {
                return;
            }
            this.b.onNext(dataBundle);
        } else if (Util.ACTION_HEALTH_RATE.equals(string)) {
            this.c.onNext(dataBundle);
        }
    }

    private void i(int i2) {
        if (SyncCloudHealthHelper.checkIsInitialed()) {
            int lastWatchHealthDataSyncTime = Box.getLastWatchHealthDataSyncTime();
            Log.d(f, "LastWatchHealthDataSyncTime : " + TimeUtil.formatDateTime(lastWatchHealthDataSyncTime), new Object[0]);
            if (i2 <= 0 || i2 <= lastWatchHealthDataSyncTime) {
                return;
            }
            Box.putWatchHealthDataSyncTime(i2);
        }
    }

    public void init(Context context) {
        Transporter transporter = Transporter.get(context, "com.huami.watch.http-support.manager");
        transporter.addDataListener(this.e);
        transporter.connectTransportService();
        this.d = context;
    }
}
