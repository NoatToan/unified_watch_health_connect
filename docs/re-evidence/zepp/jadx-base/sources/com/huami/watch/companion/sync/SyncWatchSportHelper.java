package com.huami.watch.companion.sync;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.dataflow.event.SportHistoryUpdatedEvent;
import com.huami.watch.dataflow.model.firstbeat.SportLoadManager;
import com.huami.watch.dataflow.model.firstbeat.VO2maxManager;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.huami.watch.dataflow.model.sport.SportDetailManager;
import com.huami.watch.dataflow.model.sport.SportSummaryManager;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import com.huami.watch.dataflow.model.sport.bean.SportSummary;
import com.huami.watch.dataflow.util.FirstbeatDataParser;
import com.huami.watch.dataflow.util.SportDataParser;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
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
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class SyncWatchSportHelper {
    private static final String d = "SyncWatch-SportData";
    private static final String e = "com.huami.watch.http-support.manager";
    private static final String f = "com.huami.watch.sport.upload_detail";
    private static final String g = "com.huami.watch.sport.upload_summary";
    private static final String h = "com.huami.watch.sport.upload_vo2_max_config";
    private static final String i = "com.huami.watch.sport.upload_sport_tha_info_config";
    private static volatile SyncWatchSportHelper j;
    private ObservableEmitter<DataBundle> a;
    private Context b;
    private Transporter.DataListener c = new a();

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            if (DeviceUtil.isRomSupportNewSportHealthChannel(SyncWatchSportHelper.this.b)) {
                return;
            }
            DataBundle data = transportDataItem.getData();
            String string = data.getString("key_owner");
            Log.d(SyncWatchSportHelper.d, "Owner : " + string, new Object[0]);
            if ("com.huami.watch.sport".equals(string) || "com.huami.watch.newsport".equals(string)) {
                Log.d(SyncWatchSportHelper.d, "OnDataReceived : " + transportDataItem, new Object[0]);
                SyncWatchSportHelper.this.a.onNext(data);
            }
        }
    }

    public class b implements Consumer<g> {
        public b() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NonNull g gVar) throws Exception {
            SportHistoryUpdatedEvent sportHistoryUpdatedEvent = gVar.a ? new SportHistoryUpdatedEvent() : null;
            if (sportHistoryUpdatedEvent != null) {
                RxBus.get().post(sportHistoryUpdatedEvent);
            }
        }
    }

    public class c implements Consumer<Throwable> {
        public c() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Exception {
            Log.e(SyncWatchSportHelper.d, "AcceptSportDataErr", th, new Object[0]);
            Analytics.exception(th);
        }
    }

    public class d implements Predicate<g> {
        public d() {
        }

        @Override // io.reactivex.functions.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(@NonNull g gVar) throws Exception {
            return gVar.a;
        }
    }

    public class e implements Function<DataBundle, g> {
        public e() {
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g apply(@NonNull DataBundle dataBundle) throws Exception {
            return SyncWatchSportHelper.this.e(dataBundle);
        }
    }

    public class f implements ObservableOnSubscribe<DataBundle> {
        public f() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<DataBundle> observableEmitter) throws Exception {
            SyncWatchSportHelper.this.a = observableEmitter;
        }
    }

    public static class g {
        private boolean a;
        private SportSummary b;
        private boolean c;
        private SportDetail d;

        private g() {
        }
    }

    private SyncWatchSportHelper() {
        Observable.create(new f()).observeOn(Schedulers.from(Executors.newSingleThreadExecutor())).map(new e()).filter(new d()).throttleWithTimeout(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g e(DataBundle dataBundle) {
        g gVar = new g();
        String string = dataBundle.getString(Constants.KEY_ACTION);
        Log.d(d, "KeyAction : " + string, new Object[0]);
        if ("com.huami.watch.sport.upload_detail".equals(string)) {
            return f(dataBundle);
        }
        if ("com.huami.watch.sport.upload_summary".equals(string)) {
            return h(dataBundle);
        }
        if (i.equals(string)) {
            return g(dataBundle);
        }
        return h.equals(string) ? i(dataBundle) : gVar;
    }

    private g f(DataBundle dataBundle) {
        SportDetail detailItem;
        g gVar = new g();
        String string = dataBundle.getString("key_data");
        Log.d(d, "KeyData : " + string, new Object[0]);
        if (!TextUtils.isEmpty(string) && (detailItem = SportDataParser.toDetailItem(string, true)) != null && detailItem.getTrackid() > 0 && !TextUtils.isEmpty(detailItem.getSource()) && SportDetailManager.getManager().get(detailItem.getTrackid(), detailItem.getSource()) == null) {
            gVar.c = true;
            gVar.d = detailItem;
            detailItem.setSynced(3);
            SportDetailManager.getManager().save(detailItem);
            Log.d(d, "Accept SportDetail : " + detailItem.getTrackid(), new Object[0]);
        }
        return gVar;
    }

    private g g(DataBundle dataBundle) {
        SportLoadDataItem sportLoadItem;
        SportLoadDataItem sportLoadDataItem;
        g gVar = new g();
        String string = dataBundle.getString("key_data");
        Log.d(d, "KeyData : [" + string + "]", new Object[0]);
        if (!TextUtils.isEmpty(string) && (sportLoadItem = FirstbeatDataParser.toSportLoadItem(string)) != null && !TextUtils.isEmpty(sportLoadItem.getDate()) && ((sportLoadDataItem = SportLoadManager.getManager().get(sportLoadItem.getDate())) == null || sportLoadDataItem.getUpdateTime() < sportLoadItem.getUpdateTime())) {
            SportLoadManager.getManager().save(sportLoadItem);
            Log.d(d, "Accept SportLoad : " + sportLoadItem.getDate(), new Object[0]);
        }
        return gVar;
    }

    public static SyncWatchSportHelper getHelper() {
        SyncWatchSportHelper syncWatchSportHelper = j;
        if (syncWatchSportHelper == null) {
            synchronized (SyncWatchSportHelper.class) {
                syncWatchSportHelper = j;
                if (syncWatchSportHelper == null) {
                    syncWatchSportHelper = new SyncWatchSportHelper();
                    j = syncWatchSportHelper;
                }
            }
        }
        return syncWatchSportHelper;
    }

    private g h(DataBundle dataBundle) {
        SportSummary summaryItem;
        g gVar = new g();
        String string = dataBundle.getString("key_data");
        Log.d(d, "KeyData : [" + string + "]", new Object[0]);
        if (!TextUtils.isEmpty(string) && (summaryItem = SportDataParser.toSummaryItem(string, true)) != null && summaryItem.getTrackid() > 0 && !TextUtils.isEmpty(summaryItem.getSource()) && summaryItem.getType() > 0 && SportSummaryManager.getManager().get(summaryItem.getTrackid(), summaryItem.getSource(), summaryItem.getType()) == null) {
            gVar.a = true;
            gVar.b = summaryItem;
            summaryItem.setSynced(3);
            SportSummaryManager.getManager().save(summaryItem);
            Log.d(d, "Accept SportSummary : " + summaryItem.getTrackid(), new Object[0]);
        }
        return gVar;
    }

    private g i(DataBundle dataBundle) {
        VO2maxDataItem vO2maxItem;
        VO2maxDataItem vO2maxDataItem;
        g gVar = new g();
        String string = dataBundle.getString("key_data");
        Log.d(d, "KeyData : [" + string + "]", new Object[0]);
        if (!TextUtils.isEmpty(string) && (vO2maxItem = FirstbeatDataParser.toVO2maxItem(string)) != null && !TextUtils.isEmpty(vO2maxItem.getDate()) && ((vO2maxDataItem = VO2maxManager.getManager().get(vO2maxItem.getDate())) == null || vO2maxDataItem.getUpdateTime() < vO2maxItem.getUpdateTime())) {
            VO2maxManager.getManager().save(vO2maxItem);
            Log.d(d, "Accept VO2max : " + vO2maxItem.getDate(), new Object[0]);
        }
        return gVar;
    }

    public void init(Context context) {
        Transporter transporter = Transporter.get(context, "com.huami.watch.http-support.manager");
        transporter.addDataListener(this.c);
        transporter.connectTransportService();
        this.b = context;
    }
}
